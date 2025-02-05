
object WallService {
    private var posts = emptyArray<Post>()

    // переменная для храенения уникальных модификаторов
    private var unique_id: Int = 0

    fun add(post: Post): Post {
        unique_id += 1
        val post = post.copy(id = unique_id)
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        for ((index, somePost) in posts.withIndex()) {
            if (somePost.id == post.id) {
                posts[index] = post.copy()
                return true
            }
        }
        return false
    }
    fun getLast(): Post {
        return posts.last()
    }
    fun clear() {
        posts = emptyArray()
        unique_id = 0
    }
}