package com.aditya.recycler_view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listOfContact = mutableListOf<contact>()
        val rv :RecyclerView = findViewById(R.id.rv)
        listOfContact.add(
            contact(
                image = R.drawable.img2,
                txt1 = "Aditya Kumar",
                "Hi This is Aditya"
            )
        )
        listOfContact.add(
            contact(
                image = R.drawable.img3,
                txt1 = "Harsh Vardhan",
                "Hi This is Harsh Vardhan"
            )
        )
        listOfContact.add(
            contact(
                image = R.drawable.img1,
                txt1 = "Gaurav Panday",
                "Hi This is Gaurav Panday"
            )
        )
        listOfContact.add(
            contact(
                image = R.drawable.img4,
                txt1 = "Sndeep Kumar",
                "Hi This is Sndeep"
            )
        )
        listOfContact.add(
            contact(
                image = R.drawable.img6,
                txt1 = "Ayush Kumar",
                "Hi This is Ayush Kumar"
            )
        )
        listOfContact.add(
            contact(
                image = R.drawable.img5,
                txt1 = "Ashwini Kumar",
                "Hi This is Ashwini"
            )
        )
        listOfContact.add(
            contact(
                image = R.drawable.img7,
                txt1 = "Arvind Panday",
                "Hi This is Arvind"
            )
        )
        val adapter= ContactAdapter(listOfContact)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter=adapter

    }
}