import attachments.AttachmentFile
import attachments.PostNotFoundException
import attachments.File

fun main() {
    val post: Post = Post(
        id = 1,
        comments = Comments(),
        copyright = Copyright(),
        likes = Likes(),
        reposts = Reposts(),
        views = Views(),
        Attachments = arrayOf(AttachmentFile(File(1, 1, "doge.jpg")))
    )
    var wallservice = WallService
    wallservice.add(post)
    try {
        println(wallservice.addComment(2, Comment(1, 1, 123, "КГ АМ!")))
    } catch (e: PostNotFoundException) {
        println("Пост не найден!")
    }

    println(wallservice.getLast())

    println(wallservice.update(post))
}