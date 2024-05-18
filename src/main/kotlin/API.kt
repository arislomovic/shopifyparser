import kotlinx.serialization.json.Json
import java.net.HttpURLConnection
import java.net.URL

object API {
    // Function to fetch JSON from a URL
    private fun fetchJson(url: String): String {
        val connection = URL(url).openConnection() as HttpURLConnection
        connection.requestMethod = "GET"
        return connection.inputStream.bufferedReader().readText()
    }

    // Main function to execute the program
    fun getProductList(url: String) =  kotlin.runCatching {
            val jsonResponse = fetchJson(url)
            val json = Json {
                ignoreUnknownKeys = true
                coerceInputValues = true
            }
            json.decodeFromString<ProductResponse>(jsonResponse)
        }
        .onFailure {
            println(it)
        }
        .getOrNull()
}