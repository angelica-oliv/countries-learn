package com.angelicao.countrieslearn

import com.angelicao.countrieslearn.com.angelicao.countrieslearn.coroutines.MainScopeCommon
import kotlinx.coroutines.launch
import platform.UIKit.UIDevice

actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}

fun showHelloCoroutine() {
    MainScopeCommon().launch {
        helloCoroutine()
    }
}