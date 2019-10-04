package com.angelicao.countrieslearn.data

import kotlinx.serialization.Serializable

@Serializable
data class CountryResponse(val name: String, val capital: String, val region: String)