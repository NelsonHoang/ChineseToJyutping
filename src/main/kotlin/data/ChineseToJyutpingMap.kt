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
            ),
            '啞' to JyutpingModel(
                listOf("aa2", "ak1")
            ),
            '哑' to JyutpingModel(listOf("aa2", "ak1")),
            '亞' to JyutpingModel(listOf("aa3")),
            '亚' to JyutpingModel(listOf("aa3")),
            '呀' to JyutpingModel(listOf("aa3", "aa4", "aa5", "aa1")),
            '阿' to JyutpingModel(listOf("aa3", "o1")),
            '哎' to JyutpingModel(listOf("aai1")),
            '挨' to JyutpingModel(listOf("aai1")),
            '唉' to JyutpingModel(listOf("aai1")),
            '隘' to JyutpingModel(listOf("aai3", "ai3")),
            '嗌' to JyutpingModel(listOf("aai3", "jik1")),
        )

        fun convertToJyutping(character: Char?): List<String>? {
            return map[character]?.texts
        }
    }
}
