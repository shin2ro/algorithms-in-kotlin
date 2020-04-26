import kotlin.test.Test
import kotlin.test.asserter

internal class GcdTest {

    @Test fun testGcd() {
        val cases = listOf(
            Triple(6L, 18L, 12L),
            Triple(6L, 12L, 18L),
            Triple(1L, 1L, 1L)
        )

        for ((expected, a, b) in cases) {
            val message = "test gcd($a, $b)"
            asserter.assertEquals(message, expected, gcd(a, b))
        }
    }

    @Test fun testLcm() {
        val cases = listOf(
            Triple(24L, 8L, 12L),
            Triple(24L, 12L, 8L),
            Triple(1L, 1L, 1L)
        )
        for ((expected, a, b) in cases) {
            val message = "test lcm($a, $b)"
            asserter.assertEquals(message, expected, lcm(a, b))
        }
    }

}