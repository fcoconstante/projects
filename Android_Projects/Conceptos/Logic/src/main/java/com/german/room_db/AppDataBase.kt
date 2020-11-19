package com.german.room_db

import androidx.room.Database
import com.german.pojo.DataClasses.*


@Database(entities = arrayOf(Post::class, Albums::class, Comment::class, User::class, ToDo::class, Photo::class), version = 1)
class AppDataBase {
    
}