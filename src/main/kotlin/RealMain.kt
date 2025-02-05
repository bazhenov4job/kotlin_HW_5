
fun main() {
    val post: Post = Post(
        id = 1,
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
    )
    var wallservice = WallService
    wallservice.add(post)
    println(wallservice.getLast())
    println(wallservice.update(post))
}