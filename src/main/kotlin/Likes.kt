

class Likes(
    counter: Int = 0,
    userLikes: Boolean = false,
    canLike: Boolean = true,
    canPublish: Boolean = true
) {
    var counter: Int = counter
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}