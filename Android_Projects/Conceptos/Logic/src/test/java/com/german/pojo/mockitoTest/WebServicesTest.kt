package com.german.pojo.mockitoTest

import android.content.Context
import android.util.Log
import com.german.net.PostsApiClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class WebServicesTest {

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Mock
    lateinit var context: Context

    companion object{
        const val TAG = "MockitoTest"
    }



    @Test
    fun getAllPostsTest(){

        val apiClientService =  PostsApiClient().getPostService()

        apiClientService
            .getAllUsers()
            .subscribe(
                {onComplete -> System.out.println( onComplete.toString())},
                {onError -> onError.printStackTrace()}

            )







    }



}

