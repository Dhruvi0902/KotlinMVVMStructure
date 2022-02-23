package com.example.architecturewithcoroutine.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.architecturewithcoroutine.data.models.Post

@Database(entities = [Post::class], version = 1 , exportSchema = false)
abstract class PostDatabase:RoomDatabase() {

    abstract fun movieDao():PostDao
}