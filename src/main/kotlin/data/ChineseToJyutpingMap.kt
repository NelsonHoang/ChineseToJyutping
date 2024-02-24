package data

/**
 * Serves as a [HashMap] with the key being a simplified or traditional
 * character while the result will be [JyutpingModel].
 */
class ChineseToJyutpingMap : HashMap<String, JyutpingModel>() {

    companion object {
        private val map: HashMap<Char, JyutpingModel> = hashMapOf(
            '吖' to JyutpingModel("aa1", listOf()),
            '啊' to JyutpingModel(
                "aa1", listOf("aa2", "aa6")
            )
        )

        fun convertToJyutping(character: Char?): String? {
            return map[character]?.text
        }

        fun getAlternativeJyutping(character: Char?): List<String>? {
            return map[character]?.alternateText
        }
    }
}
