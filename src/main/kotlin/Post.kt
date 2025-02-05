package ru.netology

data class Post (
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    var text: String,
    var friendsOnly: Boolean,
    var comments: Comments,
    val copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    val postType: String
)