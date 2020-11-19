package com.german.pojo.DataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "Albums")
data class Albums(

    @PrimaryKey
    @ColumnInfo(name = "userId")
    @SerializedName("userId")
    val userId: Number?,

    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: Number?,


    @ColumnInfo(name = "title")
    @SerializedName("title")
    val title: String?)
