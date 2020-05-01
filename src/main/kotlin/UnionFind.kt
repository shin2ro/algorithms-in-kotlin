class UnionFind(n: Int) {

    private val par = IntArray(n) { -1 }

    fun find(x: Int): Int {
        if (par[x] < 0) return x
        par[x] = find(par[x])
        return par[x]
    }

    fun unite(x: Int, y: Int) {
        val (rx, ry) = run {
            val rx = find(x)
            val ry = find(y)
            if (rx > ry) ry to rx else rx to ry
        }
        if (rx == ry) return
        par[rx] += par[ry]
        par[ry] = rx
    }

    fun same(x: Int, y: Int): Boolean {
        return find(x) == find(y)
    }

    fun size(x: Int): Int {
        return -par[find(x)]
    }

}
