package com.angelicao.countrieslearn.data.remote

import com.angelicao.countrieslearn.data.CountryResponse

abstract class CountriesApi {
    private val baseUrl = "https://restcountries.eu/rest/v2"

    abstract suspend fun getAllCountries(): List<CountryResponse>

    protected fun formatUrl(endpoint: String) = "$baseUrl/$endpoint"
}