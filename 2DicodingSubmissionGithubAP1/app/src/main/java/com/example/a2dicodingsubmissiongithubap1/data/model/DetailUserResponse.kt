package com.example.a2dicodingsubmissiongithubap1.data.model

import com.google.gson.annotations.SerializedName

//data class DetailUserResponse(
//    val login : String,
//    val id: Int,
//    val avatar_url: String,
//    val followers_url: String,
//    val following_url: String,
//    val name : String,
//    val following : Int,
//    val followers : Int

data class DetailUserResponse (

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("login")
    val login: String,

    @field:SerializedName("avatar_url")
    val avatar_url: String,

    @field:SerializedName("followers_url")
    val followers_url: String,

    @field:SerializedName("following_url")
    val following_url: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("following")
    val following: Int,

    @field:SerializedName("followers")
    val followers: Int


)
