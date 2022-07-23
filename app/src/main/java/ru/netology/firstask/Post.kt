package ru.netology.firstask

data class Post (
    val id : Int,
    val author : String,
    val content : String,
    val published : String,
    val like : Int = 1499999,
    val share : Int = 9599,
    val view : Int = 10500,
    val likeByMe : Boolean = false
)