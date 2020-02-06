package iterator

data class Product(private val id: Int, private val name: String) {

    override fun toString(): String {
        return "Product: {id= $id, name='$name'}"
    }
}
