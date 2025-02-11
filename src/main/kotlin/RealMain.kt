import attachments.AttachmentFile
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
    println(wallservice.addComment(1, Comment(1, 1, 123, "КГ АМ!")))
    println(wallservice.getLast())

    println(wallservice.update(post))
}