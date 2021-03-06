package com.mukeshxain.kotsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mukeshxain.kotsample.adapter.BookAdapter
import com.mukeshxain.kotsample.model.Book

class DashboardActivity : AppCompatActivity() {
    companion object {
        val TAG: String = "DashboardActivity"
    }

    private lateinit var mHomeRV: RecyclerView
    private var mBooks: MutableList<Book> = mutableListOf()
    private lateinit var mLayoutManager: LinearLayoutManager
    private lateinit var mBookAdapter: BookAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        init()
        loadData()
    }

    private fun init() {
        mHomeRV = findViewById(R.id.rv_home)
        mLayoutManager = LinearLayoutManager(this)
        mHomeRV.setLayoutManager(mLayoutManager)
        mBookAdapter = BookAdapter(this, mBooks)
        mHomeRV.setAdapter(mBookAdapter)
    }

    private fun loadData() {
        mBooks.add(Book("test01", "test01", "test01", 200.0, "4"))
        mBooks.add(Book("test02", "test02", "test02", 140.0, "3"))
        mBooks.add(Book("test03", "test03", "test03", 90.0, "2"))
        mBooks.add(Book("test04", "test05", "test04", 120.0, "5"))
        mBooks.add(Book("test05", "test06", "test05", 86.0, "4"))
        mBookAdapter.updateResult(mBooks)
    }
}