package com.example.labo4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var movieAdapter: MovieAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var movieList: ArrayList<Movie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initRecyclerView() {
        viewManager = LinearLayoutManager(this)
        movieAdapter=MovieAdapter(movieList)

        movie_list_rv.apply {
            this//Id del Recyclerview, apply es igual a movie_list_rv.setHasFixedSize(true)...
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = movieAdapter
        }

    }
}
