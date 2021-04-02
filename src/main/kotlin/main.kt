import arrow.optics.optics

@optics
data class Product(val productId: ProductId) {
    companion object
}

@optics
data class ProductId(val code: String, val version: Int) {
    companion object
}

fun main(args: Array<String>) {
    println("Hello World!")
}