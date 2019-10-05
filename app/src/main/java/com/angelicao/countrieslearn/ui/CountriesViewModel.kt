package com.angelicao.countrieslearn.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Country
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Result
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.source.CountriesRepository
import kotlinx.coroutines.launch

class CountriesViewModel(private val countriesRepository: CountriesRepository): ViewModel() {

    private val _countriesListResult = MutableLiveData<Result<List<Country>>>()
    val countriesListResult: LiveData<Result<List<Country>>>
        get() = _countriesListResult

    fun getCountries() {
        _countriesListResult.value = Result.Loading
        viewModelScope.launch {
            //Request data
        }
    }

}