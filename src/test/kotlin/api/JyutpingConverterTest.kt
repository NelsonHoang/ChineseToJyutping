package api

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JyutpingConverterTest {

    @Test
    fun test吖() {
        val jyutpingConverter = JyutpingConverter()

        assertEquals(
            expected = "aa1",
            actual = jyutpingConverter.translate('吖')
        )
        assertEquals(
            expected = listOf(),
            actual = jyutpingConverter.getAlternateTranslations('吖')
        )
    }

    @Test
    fun test啊() {
        val jyutpingConverter = JyutpingConverter()

        assertEquals(
            expected = "aa1",
            actual = jyutpingConverter.translate('啊')
        )
        assertEquals(
            expected = listOf("aa2", "aa6"),
            actual = jyutpingConverter.getAlternateTranslations('啊')
        )
    }

}