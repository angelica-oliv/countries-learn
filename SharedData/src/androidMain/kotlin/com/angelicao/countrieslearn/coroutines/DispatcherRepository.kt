package com.angelicao.countrieslearn.com.angelicao.countrieslearn.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val dispatcherRepository: CoroutineDispatcher
    get() = Dispatchers.IO