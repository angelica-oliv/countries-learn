package com.angelicao.countrieslearn.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.request.get

class CountriesApiImpl(private val httpClient: HttpClient = HttpClient()): CountriesApi() {
    override suspend fun getAllCountries(): List<CountryResponse> {
        return httpClient.get(formatUrl("all"))
    }
}