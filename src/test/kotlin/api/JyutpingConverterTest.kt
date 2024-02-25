package api

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JyutpingConverterTest {

    @Test
    fun test吖() {
        assertEquals(
            expected = listOf("aa1"),
            actual = JyutpingConverter().translate('吖')
        )
    }

    @Test
    fun test丫() {
        assertEquals(
            expected = listOf("aa1"),
            actual = JyutpingConverter().translate('丫')
        )
    }

    @Test
    fun test鴉and鸦() {
        assertEquals(
            expected = listOf("aa1"),
            actual = JyutpingConverter().translate('鴉')
        )
        assertEquals(
            expected = listOf("aa1"),
            actual = JyutpingConverter().translate('鸦')
        )
    }

    @Test
    fun test啊() {
        assertEquals(
            expected = listOf("aa1", "aa2", "aa6"),
            actual = JyutpingConverter().translate('啊')
        )
    }

}