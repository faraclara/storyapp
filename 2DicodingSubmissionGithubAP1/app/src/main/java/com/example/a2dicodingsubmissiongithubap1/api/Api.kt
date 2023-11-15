package com.example.a2dicodingsubmissiongithubap1.api

import com.example.a2dicodingsubmissiongithubap1.data.model.DetailUserResponse
import com.example.a2dicodingsubmissiongithubap1.data.model.User
import com.example.a2dicodingsubmissiongithubap1.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>


}