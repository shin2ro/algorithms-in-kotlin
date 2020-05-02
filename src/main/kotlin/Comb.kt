class Comb(n: Int) {

    companion object {
        const val MOD = ModInt.MOD
    }

    private val fact = LongArray(n + 1)
    private val factInv = LongArray(n + 1)

    init {
        fact[0] = 1L
        for (i in 1..n) {
            fact[i] = fact[i - 1] * i % MOD
        }
        factInv[n] = ModInt(fact[n]).inv().x
        for (i in n downTo 1) {
            factInv[i - 1] = factInv[i] * i % MOD
        }
    }

    fun comb(n: Int, k: Int): Long {
        if (k !in 0..n) return 0L
        return fact[n] * factInv[k] % MOD * factInv[n - k] % MOD
    }

}
