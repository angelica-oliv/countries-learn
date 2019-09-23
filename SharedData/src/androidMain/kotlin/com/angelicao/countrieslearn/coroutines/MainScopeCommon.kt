package com.angelicao.countrieslearn.com.angelicao.countrieslearn.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

actual class MainScopeCommon actual constructor(): CoroutineScope {
    private val dispatcher = Dispatchers.Main
    private val job = Job()

    override val coroutineContext: CoroutineContext
        get() = dispatcher + job
}