import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductResponse(
    val products: List<Product> = emptyList()
)

@Serializable
data class Product(
    val id: Long = 0L,
    val title: String = "",
    val handle: String = "",
    @SerialName("body_html") val bodyHtml: String = "",
    @SerialName("published_at") val publishedAt: String = "",
    @SerialName("created_at") val createdAt: String = "",
    @SerialName("updated_at") val updatedAt: String = "",
    val vendor: String = "",
    @SerialName("product_type") val productType: String = "",
    val tags: List<String> = emptyList(),
    val variants: List<Variant> = emptyList()
)

@Serializable
data class Variant(
    val id: Long = 0L,
    val title: String = "",
    val option1: String? = null,
    val option2: String? = null,
    val option3: String? = null,
    val sku: String = "",
    @SerialName("requires_shipping") val requiresShipping: Boolean = false,
    val taxable: Boolean = false,
    @SerialName("featured_image") val featuredImage: FeaturedImage? = null,
    val available: Boolean = false,
    val price: String = "0.00",
    val grams: Int = 0,
    @SerialName("compare_at_price") val compareAtPrice: String? = null,
    val position: Int = 0,
    @SerialName("product_id") val productId: Long = 0L,
    @SerialName("created_at") val createdAt: String = "",
    @SerialName("updated_at") val updatedAt: String = ""
)

@Serializable
data class FeaturedImage(
    val id: Long = 0L,
    @SerialName("product_id") val productId: Long = 0L,
    val position: Int = 0,
    @SerialName("created_at") val createdAt: String = "",
    @SerialName("updated_at") val updatedAt: String = "",
    val alt: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val src: String = "",
    @SerialName("variant_ids") val variantIds: List<Long> = emptyList()
)