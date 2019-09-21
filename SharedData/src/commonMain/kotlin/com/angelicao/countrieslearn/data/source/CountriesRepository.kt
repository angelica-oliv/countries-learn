package com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.source

import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Country
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Result

interface CountriesRepository {
    suspend fun getCountries(): Result<List<Country>>
}