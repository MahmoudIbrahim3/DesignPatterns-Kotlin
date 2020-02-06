package iterator

data class Product(private val id: Int, private val name: String) {

    override fun toString() = "Product: {id= $id, name='$name'}"
}
