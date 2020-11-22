package com.german.room_db

import android.content.Context
import androidx.room.*
import com.german.pojo.DataClasses.*


@Database(entities = arrayOf(
    /*Post::class Albums::class,
    Comment::class,
    ToDo::class, Photo::class*/
    User::class),
    version = 1, exportSchema = false)
@TypeConverters(TypeConverter::class)
abstract class AppDataBase : RoomDatabase() {
 abstract fun getRepoDAO() : PostsDAO

companion object {
    var INSTANCE: AppDataBase? = null

    fun getInstance(context: Context): AppDataBase? {
        INSTANCE?.let { INSTANCE } ?: run {
            INSTANCE = Room.databaseBuilder(
                    context,
                    AppDataBase::class.java,
                    "roomConceptos.db")
                    .build()
        }
        return INSTANCE
    }

}
}
