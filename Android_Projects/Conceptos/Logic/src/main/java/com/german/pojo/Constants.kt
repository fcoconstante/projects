package com.german.pojo

class Constants {

    companion object {

        // const only works with primitives and Strings
        val BASE_URL = BuildConfig.BASE_URL

        const val GET_POST = "/posts/{id}"
        const val GET_POST_COMMENTS = "/posts/{id}/comments"
        const val GET_POST_COMMENTS_V2 = "/comments?postId={id}"
        const val POST_CREATE_POST = "/posts"
        const val PUT_UPDATE_POST ="/posts/{id}"
        const val PATCH_POST = "/posts/{id}"
        const val DELETE_POST = "/posts/{id}"

        const val GET_ALBUM_PHOTOS = "/albums/{id}/photos"
        const val GET_USER_ALBUMS = "/users/{id}/albums"
        const val GET_USER_TODO = "/users/{id}/todos"
        const val GET_USER_POSTS = "/users/{id}/posts"

        const val GET_POSTS = "/posts" //100 posts
        const val GET_COMMENTS = "/comments" //	500 comments
        const val GET_ALBUMS = "/albums" //	100 albums
        const val GET_PHOTOS = "/photos" //	5000 photos
        const val GET_TODOS = "/todos" //	200 todos
        const val GET_USERS = "/users" //	10 users

    }



}