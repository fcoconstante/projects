package com.german.room_db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.german.pojo.DataClasses.User

@Dao
interface PostsDAO {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUser(user: User)

}