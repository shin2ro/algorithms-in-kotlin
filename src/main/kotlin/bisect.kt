fun <T> List<T>.lowerBound(element: T): Int where T : Comparable<T> {
    return this
        .binarySearch { if (it >= element) 1 else -1 }
        .let { -(it + 1) }
}

fun <T> List<T>.upperBound(element: T): Int where T : Comparable<T> {
    return this
        .binarySearch { if (it > element) 1 else -1 }
        .let { -(it + 1) }
}
