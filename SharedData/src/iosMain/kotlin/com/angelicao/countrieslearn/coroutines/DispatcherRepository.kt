package com.angelicao.countrieslearn.com.angelicao.countrieslearn.coroutines

import kotlinx.coroutines.CoroutineDispatcher

actual val dispatcherRepository: CoroutineDispatcher
    get() = MainDispatcher()