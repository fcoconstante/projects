package com.german.pojo.DataClasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.german.room_db.TypeConverter
import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.NotNull


@Entity(tableName = "User")
@TypeConverters(TypeConverter::class)
data class User(

    @NotNull
    @PrimaryKey
    @ColumnInfo(name = "id")
    @SerializedName("id")
    val id: Number,

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: String?,

    @ColumnInfo(name = "username")
    @SerializedName("username")
    val username: String?,

    @ColumnInfo(name = "email")
    @SerializedName("email")
    val email: String?,

    @ColumnInfo(name = "address")
    @SerializedName("address")
    val address: Address?,

    @ColumnInfo(name = "phone")
    @SerializedName("phone")
    val phone: String?,

    @ColumnInfo(name = "website")
    @SerializedName("website")
    val website: String?,

    @ColumnInfo(name = "company")
    @SerializedName("company")
    val company: Company?)

@Entity(tableName = "Address")
data class Address(

    @ColumnInfo(name = "street")
    @SerializedName("street")
    val street: String?,

    @ColumnInfo(name = "suite")
    @SerializedName("suite")
    val suite: String?,

    @ColumnInfo(name = "city")
    @SerializedName("city")
    val city: String?,

    @ColumnInfo(name = "zipcode")
    @SerializedName("zipcode")
    val zipcode: String?,

    @ColumnInfo(name = "geo")
    @SerializedName("geo")
    val geo: Geo?)

@Entity(tableName = "Company")
data class Company(

    @ColumnInfo(name = "name")
    @SerializedName("name")
    val name: String?,

    @ColumnInfo(name = "catchPhrase")
    @SerializedName("catchPhrase")
    val catchPhrase: String?,

    @ColumnInfo(name = "bs")
    @SerializedName("bs")
    val bs: String?)

@Entity(tableName = "Geo")
data class Geo(

    @ColumnInfo(name = "lat")
    @SerializedName("lat")
    val lat: String?,

    @ColumnInfo(name = "lng")
    @SerializedName("lng")
    val lng: String?)
