package com.example.noteapp.Repository

import com.example.noteapp.Data.NoteDatabaseDao
import com.example.noteapp.Model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import java.util.concurrent.Flow
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDatabaseDao: NoteDatabaseDao){
    suspend fun addNote(note: Note) = noteDatabaseDao.insert(note)
    suspend fun updateNote(note: Note) = noteDatabaseDao.update(note)
    suspend fun deleteNote(note: Note) = noteDatabaseDao.delete(note)
    suspend fun deleteAllNotes(note: Note) = noteDatabaseDao.deleteAll()
    suspend fun getAllNotes() = noteDatabaseDao.getNotes().flowOn(Dispatchers.IO).conflate()
}