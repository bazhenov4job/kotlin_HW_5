
data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    var text: String = "",
    var friendsOnly: Boolean = false,
    var comments: Comments,
    val copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    val postType: String = "post"
)