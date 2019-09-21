package com.angelicao.countrieslearn.di

import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.source.CountriesRepository
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.source.CountriesRepositoryImpl
import com.angelicao.countrieslearn.ui.CountriesViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel


val dataModule = module { single<CountriesRepository> { CountriesRepositoryImpl() } }

val viewModelModules = module { viewModel { CountriesViewModel(get()) } }