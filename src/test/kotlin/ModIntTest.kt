import kotlin.math.pow
import kotlin.test.Test
import kotlin.test.asserter

internal class ModIntTest {

    @Test fun testInit() {
        val m = ModInt(ModInt.MOD + 1)
        asserter.assertEquals("test init", 1L, m.x)
    }

    @Test fun testPlus() {
        val m1 = ModInt(ModInt.MOD - 10)
        val m2 = ModInt(100)
        asserter.assertEquals("test +", 90L, (m1 + m2).x)
    }

    @Test fun testMinus() {
        val m1 = ModInt(ModInt.MOD + 100)
        val m2 = ModInt(200)
        asserter.assertEquals("test -", ModInt.MOD - 100, (m1 - m2).x)
    }

    @Test fun testTimes() {
        val l1 = ModInt.MOD + 1
        val l2 = 1e18.toLong()

        val m1 = ModInt(l1)
        val m2 = ModInt(l2)
        asserter.assertEquals("test *", l2 % ModInt.MOD, (m1 * m2).x)
    }

    @Test fun testDiv() {
        val l1 = (ModInt.MOD + 1) * 10e5.toLong()
        @Suppress("INTEGER_OVERFLOW")
        asserter.assertNotEquals("test overflow", l1, l1 * l1 / l1)
        val m1 = ModInt(l1)
        asserter.assertEquals("test /", m1, m1 * m1 / m1)
    }

    @Test fun testPow() {
        val m1 = ModInt(2)
        asserter.assertEquals("test pow", 2.0.pow(10.0).toLong(), m1.pow(10).x)
    }

    @Test fun testInv() {
        val m1 = ModInt(2)

        // x ^ (10^9 + 7 - 2) % 10^9 + 7
        val expected = run {
            var x = 1L
            // 15 * 66666667 = 10^9 + 7 - 2
            for (l in 0 until 66666667) {
                // 2^15
                x *= 32768
                x %= ModInt.MOD
            }
            x
        }

        asserter.assertEquals("test inv", expected, m1.inv().x)
    }

}
