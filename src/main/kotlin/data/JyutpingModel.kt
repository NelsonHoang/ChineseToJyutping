package data

/**
 * @return Jyutping text(s) for a traditional or simplified Chinese character.
 * Some charcters may contain more than one Jyutping representation. For
 * example, the character 啊 can be used for 'aa1', 'aa2' and 'aa6.'
 */
data class JyutpingModel(
    val texts: List<String>,
)