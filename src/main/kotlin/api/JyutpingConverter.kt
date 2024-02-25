package api

import data.ChineseToJyutpingMap

/** Converts Traditional or Simplified Chinese characters to Jyutping. */
class JyutpingConverter {

    /**
     * @return A [List] of Jyutping translations of a Chinese character
     * */
    fun translate(character: Char): List<String>? {
        return ChineseToJyutpingMap.convertToJyutping(character)
    }
}
