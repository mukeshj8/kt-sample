package com.mukeshxain.kotsample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mukeshxain.kotsample.R
import com.mukeshxain.kotsample.model.Book

class BookAdapter(var context: Context, var books: MutableList<Book>) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    public fun updateResult(mBooks: MutableList<Book>) {
        books = mBooks
        notifyDataSetChanged()
    }

    class BookViewHolder(v: View) :
        RecyclerView.ViewHolder(v) {
        var title: TextView = v.findViewById(R.id.tv_title)
        var desc: TextView = v.findViewById(R.id.tv_desc)
        var author: TextView = v.findViewById(R.id.tv_author)
        var price: TextView = v.findViewById(R.id.tv_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_book, parent, false)
        return BookViewHolder(v)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books.get(position);
        holder.title.text = book.title
        holder.desc.text = "Description: " + book.description
        holder.author.text = "Author: " + book.author
        holder.price.text = "Price: " + book.price + " $"
    }

}