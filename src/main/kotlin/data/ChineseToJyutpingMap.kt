package data

/**
 * Serves as a [HashMap] with the key being a simplified or traditional
 * character while the result will be [JyutpingModel].
 */
class ChineseToJyutpingMap : HashMap<String, JyutpingModel>() {

    companion object {
        private val map: HashMap<String, JyutpingModel> = hashMapOf(
            "吖" to JyutpingModel(listOf("aa1")),
            "丫" to JyutpingModel(listOf("aa1")),
            "鴉" to JyutpingModel(listOf("aa1")),
            "鸦" to JyutpingModel(listOf("aa1")),
            "孲" to JyutpingModel(listOf("aa1")),
            "啊" to JyutpingModel(
                listOf("aa1", "aa2", "aa6")
            ),
            "啞" to JyutpingModel(
                listOf("aa2", "ak1")
            ),
            "哑" to JyutpingModel(listOf("aa2", "ak1")),
            "亞" to JyutpingModel(listOf("aa3")),
            "亚" to JyutpingModel(listOf("aa3")),
            "呀" to JyutpingModel(listOf("aa3", "aa4", "aa5", "aa1")),
            "阿" to JyutpingModel(listOf("aa3", "o1")),
            "哎" to JyutpingModel(listOf("aai1")),
            "挨" to JyutpingModel(listOf("aai1")),
            "唉" to JyutpingModel(listOf("aai1")),
            "隘" to JyutpingModel(listOf("aai3", "ai3")),
            "嗌" to JyutpingModel(listOf("aai3", "jik1")),
            "握" to JyutpingModel(listOf("aak1", "ak1")),
            "呃" to JyutpingModel(listOf("aak1", "ngaak1", "aak3", "ak1")),
            "鈪" to JyutpingModel(listOf("aak2", "ngaak2")),
            "晏" to JyutpingModel(listOf("aan3")),
            "罌" to JyutpingModel(listOf("aang1", "ang1")),
            "罂" to JyutpingModel(listOf("aang1", "ang1")),
            "鴨" to JyutpingModel(listOf("aap3")),
            "鸭" to JyutpingModel(listOf("aap3")),
            "壓" to JyutpingModel(listOf("aat3")),
            "压" to JyutpingModel(listOf("aat3")),
            "遏" to JyutpingModel(listOf("aat3")),
            "揠" to JyutpingModel(listOf("aat3")),
            "押" to JyutpingModel(listOf("aat3", "aap3")),
            "胺" to JyutpingModel(listOf("aat3", "on1")),
            "𢯎" to JyutpingModel(listOf("aau1", "ngaau1")),
        )

        fun convertToJyutping(character: String?): List<String>? {
            return map[character]?.texts
        }
    }
}
