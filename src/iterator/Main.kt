package iterator

fun main() {
    val collection = ProductListCollection()

    collection.add(Product(1, "Product 1"))
    collection.add(Product(2, "Product 2"))
    collection.add(Product(3, "Product 3"))

    val iterator = collection.createIterator()

    while (iterator.hasNext()){
        val currentProduct = iterator.next()
        println(currentProduct.toString())
    }
}