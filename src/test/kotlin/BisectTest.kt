import kotlin.test.Test
import kotlin.test.asserter

internal class BisectTest {

    @Test
    fun testLowerBound() {
        val list = listOf(1, 3, 5, 7, 9)
        val cases = listOf(
            0 to 0,
            1 to 0,
            2 to 1,
            5 to 2,
            8 to 4,
            9 to 4,
            10 to 5
        )
        for ((x, expected) in cases) {
            asserter.assertEquals("lowerBound($x)", expected, list.lowerBound(x))
        }
    }

    @Test
    fun testUpperBound() {
        val list = listOf(1, 3, 5, 7, 9)
        val cases = listOf(
            0 to 0,
            1 to 1,
            2 to 1,
            5 to 3,
            8 to 4,
            9 to 5,
            10 to 5
        )
        for ((x, expected) in cases) {
            asserter.assertEquals("upperBound($x)", expected, list.upperBound(x))
        }
    }

}
