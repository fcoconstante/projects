package com.german.pojo.DataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "Photo")
data class Photo(

        @PrimaryKey
        @ColumnInfo(name = "albumId")
        @SerializedName("albumId")
        val albumId: Number?,

        @ColumnInfo(name = "id")
        @SerializedName("id")
        val id: Number?,

        @ColumnInfo(name = "title")
        @SerializedName("title")
        val title: String?,

        @ColumnInfo(name = "url")
        @SerializedName("url")
        val url: String?,

        @ColumnInfo(name = "thumbnailUrl")
        @SerializedName("thumbnailUrl")
        val thumbnailUrl: String?)

@Entity(tableName = "Todo")
data class ToDo(

        @PrimaryKey
        @ColumnInfo(name = "albumId")
        @SerializedName("albumId")
        val albumId: Number?,

        @ColumnInfo(name = "id")
        @SerializedName("id")
        val id: Number?,

        @ColumnInfo(name = "title")
        @SerializedName("title")
        val title: String?,

        @ColumnInfo(name = "url")
        @SerializedName("url")
        val url: String?,

        @ColumnInfo(name = "thumbnailUrl")
        @SerializedName("thumbnailUrl")
        val thumbnailUrl: String?)