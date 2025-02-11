import attachments.PostNotFoundException

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

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

    fun addComment(postId: Int, comment: Comment): Comment{
        for (post in posts) {
            if (post.id == postId) {
                comments += comment.copy()
                return comment
            }
        }
        throw PostNotFoundException("Пост с ID $postId не найден.")
        return comment
    }

}