package com.example.practice_customview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class MovieAdapter(context: Context, resource: Int, objects: ArrayList<Movie>) :
    ArrayAdapter<Movie>(context, resource, objects) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var title = getItem(position)?.title
        var year = getItem(position)?.year


        val inflater = LayoutInflater.from(context)
        var convertView = inflater.inflate(R.layout.item_row, parent, false)

        var txtTitle: TextView = convertView.findViewById(R.id.txtTitle)
        var txtYear:TextView = convertView.findViewById(R.id.txtYear)

        txtTitle.text = title
        txtYear.text = year

        return convertView

    }
}
