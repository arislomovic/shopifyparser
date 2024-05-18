fun main() {
    val input = readlnOrNull() ?: return
    val url = "https://$input/products.json"
    val result = API.getProductList(url)
    println(result)
}