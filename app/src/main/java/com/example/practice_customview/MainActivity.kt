package com.example.practice_customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val movie = arrayOf("Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice ")
    private val movieYear = arrayOf("2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016")

    private lateinit var movieList: ArrayList<Movie>
    private lateinit var lvMovie: ListView
    private lateinit var movieAdapter:MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvMovie = findViewById(R.id.lv_movie)
        movieList = ArrayList<Movie>()

        for (i in 0 until movie.size) {
            val mov = Movie(movie[i], movieYear[i])
            movieList.add(mov)
        }

        movieAdapter = MovieAdapter(applicationContext,R.layout.item_row,movieList)
        lvMovie.adapter = movieAdapter

    }
}