package api

import data.ChineseToJyutpingMap

/**
 * Converts Traditional or Simplified Chinese characters to Jyutping
 */
class JyutpingConverter {

    /**
     * @return The first Jyutping in order of tone representation of a traditional or simplified
     * Chinese character. For example, if a character has three potential Jyutping translations of
     * 'aa1', 'aa2', 'aa6' then we take 'aa1.'
     */
    fun translate(character: Char): String? {
        return ChineseToJyutpingMap.convertToJyutping(character)
    }

    /**
     * @return Other Jyutping translations of a traditional or simplified Chinese character. For example,
     * if a character has three potential Jyutping translations of 'aa1', 'aa2', 'aa6' then we take
     * return everything except 'aa1' since 'aa1' is returned via [translate].
     * */

    fun getAlternateTranslations(character: Char): List<String>? {
        return ChineseToJyutpingMap.getAlternativeJyutping(character)
    }
}
