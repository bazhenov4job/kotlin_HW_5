import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
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