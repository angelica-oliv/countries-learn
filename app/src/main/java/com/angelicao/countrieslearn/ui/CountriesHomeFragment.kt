package com.angelicao.countrieslearn.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.angelicao.countrieslearn.R
import androidx.recyclerview.widget.RecyclerView
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Country
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Result
import org.koin.androidx.viewmodel.ext.android.viewModel

class CountriesHomeFragment : Fragment() {

    private val viewModel: CountriesViewModel by viewModel()
    private lateinit var countriesList: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_countries_home, container, false)
        countriesList = view.findViewById(R.id.countries_list)
        countriesList.layoutManager = LinearLayoutManager(context)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addViewObservers()

        viewModel.getCountries()
    }

    private fun addViewObservers() {
        viewModel.countriesListResult.observe(viewLifecycleOwner, Observer {
            when(it) {
                is Result.Loading -> {}
                is Result.Success<List<Country>> -> { countriesList.adapter = CountriesAdapter(it.data) }
                is Result.Error -> {}
            }
        })
    }
}
