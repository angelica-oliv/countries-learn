package com.angelicao.countrieslearn

import android.app.Application
import com.angelicao.countrieslearn.di.dataModule
import com.angelicao.countrieslearn.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CountriesApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(dataModule, viewModelModules))
            androidContext(this@CountriesApplication)
        }
    }
}