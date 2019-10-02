package com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.source

import com.angelicao.countrieslearn.com.angelicao.countrieslearn.coroutines.MainScopeCommon
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.coroutines.dispatcherRepository
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Country
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Result
import com.angelicao.countrieslearn.data.remote.CountriesApi
import com.angelicao.countrieslearn.data.remote.CountriesApiImpl
import kotlinx.coroutines.*

import kotlin.coroutines.CoroutineContext

class CountriesRepositoryImpl(
    private val countriesApi: CountriesApi,
    private val dispatcher: CoroutineDispatcher,
    private val job: Job
): CountriesRepository, CoroutineScope {

    constructor() : this(
        CountriesApiImpl(),
        dispatcherRepository,
        Job()
    )

    override val coroutineContext: CoroutineContext
        get() = job + dispatcher

    override suspend fun getCountries(): Result<List<Country>> {
        return withContext(context = dispatcher) {
            Result.Success(
                countriesApi.getAllCountries().map { Country(it.name, it.capital, it.region) }
            )
        }
    }

    fun getCountriesAsync(responseCallback: ResponseCallback<String>) {
        MainScopeCommon().launch {
            responseCallback.onResponse((getCountries() as Result.Success<List<String>>).data.toString())
        }
    }
}