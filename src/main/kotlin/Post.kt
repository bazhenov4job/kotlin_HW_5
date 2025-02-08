
data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    var text: String = "",
    var friendsOnly: Boolean = false,
    var comments: Comments? = Comments(),
    val copyright: Copyright = Copyright(),
    var likes: Likes = Likes(),
    var reposts: Reposts? = Reposts(),
    var views: Views? = Views(),
    val postType: String = "post"
)