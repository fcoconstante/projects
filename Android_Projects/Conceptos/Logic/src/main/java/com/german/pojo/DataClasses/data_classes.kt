package com.german.pojo.DataClasses

data class Post (val userId: Number?, val id: Number?, val title: String?, val body: String?)
data class Comment(val postId: Number?, val id: Number?, val name: String?, val email: String?, val body: String?)
data class Albums(val userId: Number?, val id: Number?, val title: String?)
data class Address(val street: String?, val suite: String?, val city: String?, val zipcode: String?, val geo: Geo?)
data class User(val id: Number?, val name: String?, val username: String?, val email: String?, val address: Address?, val phone: String?, val website: String?, val company: Company?)
data class Company(val name: String?, val catchPhrase: String?, val bs: String?)
data class Geo(val lat: String?, val lng: String?)
data class Photo(val albumId: Number?, val id: Number?, val title: String?, val url: String?, val thumbnailUrl: String?)
data class ToDo(val albumId: Number?, val id: Number?, val title: String?, val url: String?, val thumbnailUrl: String?)