import kotlin.test.Test
import kotlin.test.asserter

class UnionFindTest {

    @Test
    fun testSame() {
        val uf = UnionFind(4)
        uf.unite(0, 1)
        uf.unite(0, 2)

        val cases = listOf(
            Triple(0, 1, true),
            Triple(0, 2, true),
            Triple(0, 3, false),
            Triple(1, 2, true),
            Triple(1, 3, false),
            Triple(2, 3, false)
        )

        for ((x, y, expected) in cases) {
            asserter.assertEquals("same($x, $y)", expected, uf.same(x, y))
        }
    }

    @Test
    fun testSize() {
        val uf = UnionFind(4)
        uf.unite(0, 1)
        uf.unite(0, 2)

        val cases = listOf(
            0 to 3,
            1 to 3,
            2 to 3,
            3 to 1
        )

        for ((x, expected) in cases) {
            asserter.assertEquals("size($x)", expected, uf.size(x))
        }
    }

}