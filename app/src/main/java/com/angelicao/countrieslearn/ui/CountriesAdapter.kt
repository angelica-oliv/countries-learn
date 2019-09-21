package com.angelicao.countrieslearn.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.angelicao.countrieslearn.R
import com.angelicao.countrieslearn.com.angelicao.countrieslearn.data.Country

class CountriesAdapter(private val countriesList: List<Country>): RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {
    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
       return CountriesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.country_item, null))
    }

    override fun getItemCount() = countriesList.size

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
       holder.bindViews(position)
    }

    inner class CountriesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindViews(position: Int) {
            val country = countriesList[position]
            itemView.findViewById<TextView>(R.id.name).text = country.name
            itemView.findViewById<TextView>(R.id.capital).text = country.capital
            itemView.findViewById<TextView>(R.id.region).text = country.region
        }
    }
}