import attachments.*
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun testAddPost() {
        val wallService = WallService
        val originPost = Post(
            Attachments = arrayOf(AttachmentFile(File(1, 1, "doge.jpg")))
        )
        val addedPost = wallService.add(originPost)
        val postId = addedPost.id
        assertNotEquals(0, postId)
    }

    @Test
    fun updateExisting() {
        val wallService = WallService

        wallService.add(post=Post(
            Attachments = arrayOf(AttachmentFile(File(1, 1, "doge.jpg")))
        ))
        wallService.add(post=Post(
            Attachments = arrayOf(AttachmentVideo(Video(11, 123, "StarDuo.mkv")))
        ))
        wallService.add(post=Post(
            Attachments = arrayOf(AttachmentAudio(Audio(23, 13, "Michael Jackson")))
        ))

        val result = wallService.update(post=Post(id=1,
            Attachments = arrayOf(AttachmentFile(File(1, 1, "doge.jpg")))))

        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val wallService = WallService

        wallService.add(post=Post(
            Attachments = arrayOf(AttachmentFile(File(1, 1, "doge.jpg")))
        ))
        wallService.add(post=Post(
            Attachments = arrayOf(AttachmentVideo(Video(11, 123, "StarDuo.mkv")))
        ))
        wallService.add(post=Post(
            Attachments = arrayOf(AttachmentAudio(Audio(23, 13, "Michael Jackson")))
        ))

        val result = wallService.update(post=Post(
            id=4,
            Attachments = arrayOf(AttachmentStory(Story(1, 1, 12345678)))
        ))
        assertFalse(result)

    }

    @Test
    fun addCommentFindsPost() {
        val wallService = WallService
        val originPost = Post(
            id = 1,
            Attachments = arrayOf(AttachmentFile(File(1, 1, "doge.jpg")))
        )
        wallService.add(originPost)
        val testComment = Comment(1, 1, 123, "Пиши ещё!")
        val addedComment = wallService.addComment(1, testComment)
        assertEquals(testComment, addedComment)
    }

    @Test(expected = PostNotFoundException::class)
    fun addCommentDidNotFoundPost(){
        val wallService = WallService
        val testComment = Comment(1, 1, 123, "Пиши ещё!")
        val addedComment = wallService.addComment(1, testComment)
    }
}