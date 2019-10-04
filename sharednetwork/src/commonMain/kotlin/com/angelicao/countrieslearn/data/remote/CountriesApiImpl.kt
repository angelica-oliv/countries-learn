package com.angelicao.countrieslearn.data.remote

import com.angelicao.countrieslearn.data.CountryResponse
import com.angelicao.countrieslearn.data.parse.JsonParser
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.serialization.list

class CountriesApiImpl(private val httpClient: HttpClient = HttpClient()): CountriesApi() {
    override suspend fun getAllCountries(): List<CountryResponse> {
        val countriesListResponse = httpClient.get<String>(formatUrl("all"))
        return JsonParser.fromJson(CountryResponse.serializer().list, countriesListResponse)
    }
}