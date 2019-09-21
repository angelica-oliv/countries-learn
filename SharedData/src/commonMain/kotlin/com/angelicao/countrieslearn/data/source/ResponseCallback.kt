package com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.source

interface ResponseCallback<T> {
    fun onResponse(response: T)
}