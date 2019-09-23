package com.angelicao.countrieslearn

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

internal suspend fun helloCoroutine() {
    println("Hello Coroutines!")
}