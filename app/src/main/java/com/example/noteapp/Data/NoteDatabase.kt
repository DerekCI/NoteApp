package com.example.noteapp.Data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.noteapp.Model.Note
import com.example.noteapp.util.DateConverter
import com.example.noteapp.util.UUIDConverter

@TypeConverters(DateConverter::class, UUIDConverter::class)
@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}