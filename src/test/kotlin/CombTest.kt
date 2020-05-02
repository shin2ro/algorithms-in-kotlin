import kotlin.test.Test
import kotlin.test.asserter

internal class CombTest {

    @Test
    fun testCombination() {
        val cb = Comb(100)
        val cases = listOf(
            Triple(5, 2, 10L),
            Triple(5, 0, 1L),
            Triple(5, 6, 0L),
            Triple(5, -1, 0L),
            Triple(100, 1, 100L),
            Triple(50, 10, 10272278170L % Comb.MOD),
            Triple(0, 0, 1L)
        )
        for ((n, k, expected) in cases) {
            asserter.assertEquals("${n}C${k} comb($n, $k) ", expected, cb.comb(n, k))
        }
    }

}