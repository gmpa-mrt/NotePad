package com.example.notepad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NoteListActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var notes: MutableList<Note>
    lateinit var adapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        notes =  mutableListOf<Note>()
        notes.add(Note("Note 1", "I'm note 1"))
        notes.add(Note("Note 2", "I'm note 2"))
        notes.add(Note("Note 3", "I'm note 3"))
        notes.add(Note("Note 4", "I'm note 4"))

        adapter = NoteAdapter(notes, this)
        val recyclerView = findViewById<RecyclerView>(R.id.notes_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    override fun onClick(view: View) {
        if (view.tag != null) {
            Log.i("NoteListActivity", "NoteList Clicked !!")
        }
    }
}