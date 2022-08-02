package com.example.noteapp.util

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.sql.Timestamp
import java.util.*

class DateConverter {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long{
        return date.time
    }
    @TypeConverter
    fun dateFromTimestamp(timestamp: Long): Date?{
        return Date(timestamp)
    }
}