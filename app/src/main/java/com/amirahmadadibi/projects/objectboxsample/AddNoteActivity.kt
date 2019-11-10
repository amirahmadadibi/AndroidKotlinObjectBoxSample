package com.amirahmadadibi.projects.objectboxsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.amirahmadadibi.projects.objectboxsample.database.ObjectBox
import com.amirahmadadibi.projects.objectboxsample.model.Note
import com.amirahmadadibi.projects.objectboxsample.model.Note_
import io.objectbox.Box
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNoteActivity : AppCompatActivity() {
    //create box that gonna hold a note value inti
    lateinit var notesBox: Box<Note>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        //initialize our box
        notesBox = ObjectBox.boxStore.boxFor(Note::class.java)

        var noteList  = notesBox.all
        noteList.forEach {
            Log.d("tagxx", it.toString())
        }
        
        var query = notesBox.query().equal(Note_.id,1).build().find()
        Log.d("tagxx", query.size.toString())
    }


    fun addNotes() {
        val titile = titleEdit.text.toString().trim()
        val description = descriptionEdit.text.toString().trim()

        if (title.isNotEmpty() || description.isNotEmpty()) {
            notesBox.put(Note(titile = titile, longDescription = description))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.men, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.aciton_add -> {
                addNotes()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
