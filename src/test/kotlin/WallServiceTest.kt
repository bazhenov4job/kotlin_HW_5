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
        val originPost = Post(id=1, postType = "repost")
        val addedPost = wallService.add(originPost)

        assertEquals(addedPost, originPost)
    }

    @Test
    fun updateExisting() {
        val wallService = WallService

        wallService.add(post=Post())
        wallService.add(post=Post())
        wallService.add(post=Post())

        val result = wallService.update(post=Post(id=1))

        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        val wallService = WallService

        wallService.add(post=Post())
        wallService.add(post=Post())
        wallService.add(post=Post())

        val result = wallService.update(post=Post(id=4))

        assertFalse(result)
    }
}