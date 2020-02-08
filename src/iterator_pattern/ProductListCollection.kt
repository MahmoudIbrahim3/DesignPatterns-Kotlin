package iterator_pattern

class ProductListCollection {
    private val products = ArrayList<Product>()

    fun add(product: Product) {
        products.add(product)
    }

    fun createIterator() = ListIterator(this)

    class ListIterator(private val collection: ProductListCollection) : Iterator {

        private var index = 0

        override fun next(): Product {
            return collection.products[index++]
        }

        override fun hasNext(): Boolean {
            return index < collection.products.size
        }
    }
}
