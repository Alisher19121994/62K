package com.best.a62k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.best.a62k.Adapter.BasicAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
        val user = getData()
        refreshIt(user)

    }
    private fun open(){
        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = GridLayoutManager(this,1)

    }
    private fun refreshIt(list: ArrayList<User>) {
        val adapter = BasicAdapter(list)
        recyclerView.adapter = adapter
    }
    private fun getData(): ArrayList<User> {
        val user = ArrayList<User>()
        for (i in 1..15) {
            user.add(User("Pogrammer $i", R.drawable.rasm1))
        }
        return user
    }
}