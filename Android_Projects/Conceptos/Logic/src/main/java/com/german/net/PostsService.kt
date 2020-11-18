package com.german.net

import com.german.pojo.Constants
import com.german.pojo.DataClasses.*
import io.reactivex.Observable
import retrofit2.http.*

interface PostsService {

    @GET(Constants.GET_POST)
    fun getPosts(@Path("id") id: String) : Observable<List<Post>>

    @GET(Constants.GET_POST_COMMENTS)
    fun getPostComments(@Path("id") id:String) : Observable<List<Comment>>

    @GET(Constants.GET_USER_ALBUMS)
    fun getUserAlbums(@Path("id") id: String) : Observable<List<Albums>>

    @GET(Constants.GET_USER_POSTS)
    fun getUserPosts(@Path("id") id: String) : Observable<List<Post>>

    @GET(Constants.GET_USER_TODO)
    fun getUserToDo(@Path("id") id:String) : Observable<List<ToDo>>

    @GET(Constants.GET_ALBUM_PHOTOS)
    fun getAlbumPhotos(@Path("id") album_id: String) : Observable<List<Photo>>

    @POST(Constants.POST_CREATE_POST)
    fun postCreatePost(@Body post: Post) : Observable<Post>

    @PUT(Constants.PUT_UPDATE_POST)
    fun putUpdatePost(@Path("id") id:String, @Body post: Post) : Observable<Post>

    @DELETE(Constants.DELETE_POST)
    fun deletePost(@Path("id") post_id : String) : Observable<Post>

    @GET(Constants.GET_POSTS)
    fun getAllPosts() : Observable<List<Post>>

    @GET(Constants.GET_COMMENTS)
    fun getAllComments() : Observable<List<Comment>>

    @GET(Constants.GET_ALBUMS)
    fun getAllAlbums() : Observable<List<Albums>>

    @GET(Constants.GET_PHOTOS)
    fun getAllPhotos() : Observable<List<Photo>>

    @GET(Constants.GET_TODOS)
    fun getAllTodos() : Observable<List<ToDo>>

    @GET(Constants.GET_USERS)
    fun getAllUsers() : Observable<List<User>>

    @GET(Constants.GET_USER)
    fun getUser(@Path("id") id: String) : Observable<User>



}