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


}