package data

/**
 * @return The "main" text for a traditional or simplified Chinese character. The model main also contain alternate
 * text. For example, the character 啊 can be used for aa1, aa2 and aa6.
 */
data class JyutpingModel(
    val text: String,
    val alternateText: List<String>
)