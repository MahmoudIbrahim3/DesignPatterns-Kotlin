package iterator_pattern

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Product
}