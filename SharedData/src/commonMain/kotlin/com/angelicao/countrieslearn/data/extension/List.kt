package com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.extension

fun <T>List<T>.toString() {
    val stringBuilder = StringBuilder()
    forEachIndexed { index, item ->
        stringBuilder.append(item.toString())
        if(lastIndex != index) {
            stringBuilder.append(" - ")
        }
    }
}