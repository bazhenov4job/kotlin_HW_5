package ru.netology


// пример работы с классом-сервисом
class WallService1 {

    private var posts = emptyArray<PostData>()

    fun add(post: PostData): PostData {
        posts += post
        return posts.last()
    }

    fun likeById(id: Int) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }
}