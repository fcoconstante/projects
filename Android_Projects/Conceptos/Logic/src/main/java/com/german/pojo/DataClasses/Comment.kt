package com.german.pojo.DataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "Comment")
data class Comment(

    @PrimaryKey
    @ColumnInfo(name = "postId")
    @SerializedName("postId")
    val postId: Number?,

    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: Number?,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: String?,

    @ColumnInfo(name = "email")
    @SerializedName("email")
    val email: String?,

    @ColumnInfo(name = "body")
    @SerializedName("body")
    val body: String?)
