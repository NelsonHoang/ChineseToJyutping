package data

/**
 * Serves as a [HashMap] with the key being a simplified or traditional
 * character while the result will be [JyutpingModel].
 */
class ChineseToJyutpingMap : HashMap<String, JyutpingModel>() {

    companion object {
        private val map: HashMap<Char, JyutpingModel> = hashMapOf(
            '吖' to JyutpingModel(listOf("aa1")),
            '丫' to JyutpingModel(listOf("aa1")),
            '鴉' to JyutpingModel(listOf("aa1")),
            '鸦' to JyutpingModel(listOf("aa1")),
            '孲' to JyutpingModel(listOf("aa1")),
            '啊' to JyutpingModel(
                listOf("aa1", "aa2", "aa6")
            )
        )
        
        fun convertToJyutping(character: Char?): List<String>? {
            return map[character]?.texts
        }
    }
}
