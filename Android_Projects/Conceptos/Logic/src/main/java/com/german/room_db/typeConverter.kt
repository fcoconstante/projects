package com.german.room_db

import androidx.room.TypeConverter
import com.german.pojo.DataClasses.Address
import com.german.pojo.DataClasses.Company
import com.google.gson.Gson

object TypeConverter {

        @TypeConverter
        @JvmStatic
        fun fromNumber(id: Number?): String?
                = id?.let{it.toString()}

        @JvmStatic
        @TypeConverter
        fun toNumber(id: String): Number?
                = id?.let { it.toInt() }


        @JvmStatic
        @TypeConverter
        fun fromAddress(address: Address?): String?
                = address?.let { Gson().toJson(it) }

        @JvmStatic
        @TypeConverter
        fun toAddress(address: String?): Address?
                = address?.let { Gson().fromJson(it, Address::class.java) }

        @JvmStatic
        @TypeConverter
        fun fromCompany(company: Company?): String?
                = company?.let { Gson().toJson(it) }

        @JvmStatic
        @TypeConverter
        fun toCompany(company: String?): Company?
                = company?.let { Gson().fromJson(it, Company::class.java) }


}