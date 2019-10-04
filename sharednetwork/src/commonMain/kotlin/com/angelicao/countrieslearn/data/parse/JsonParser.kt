package com.angelicao.countrieslearn.data.parse

import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

object JsonParser {
    private val json = Json(JsonConfiguration.Stable.copy(strictMode = false))

    fun <T>fromJson(deserializationStrategy: DeserializationStrategy<T>, jsonStr: String): T {
        return json.parse(deserializationStrategy, jsonStr)
    }
}