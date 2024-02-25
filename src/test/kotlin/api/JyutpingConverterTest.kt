package api

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


@Suppress("NonAsciiCharacters", "TestFunctionName")
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

    @Test
    fun test啞and哑() {
        assertEquals(
            expected = listOf("aa2", "ak1"),
            actual = JyutpingConverter().translate('啞')
        )
        assertEquals(
            expected = listOf("aa2", "ak1"),
            actual = JyutpingConverter().translate('哑')
        )
    }

    @Test
    fun test亞and亚() {
        assertEquals(
            expected = listOf("aa3"),
            actual = JyutpingConverter().translate('亞')
        )
        assertEquals(
            expected = listOf("aa3"),
            actual = JyutpingConverter().translate('亚')
        )
    }

    @Test
    fun test呀() {
        assertEquals(
            expected = listOf("aa3", "aa4", "aa5", "aa1"),
            actual = JyutpingConverter().translate('呀')
        )
    }

    @Test
    fun test阿() {
        assertEquals(
            expected = listOf("aa3", "o1"),
            actual = JyutpingConverter().translate('阿')
        )
    }

    @Test
    fun test哎() {
        assertEquals(
            expected = listOf("aai1"),
            actual = JyutpingConverter().translate('哎')
        )
    }

    @Test
    fun test挨() {
        assertEquals(
            expected = listOf("aai1"),
            actual = JyutpingConverter().translate('挨')
        )
    }

    @Test
    fun test唉() {
        assertEquals(
            expected = listOf("aai1"),
            actual = JyutpingConverter().translate('唉')
        )
    }

    @Test
    fun test隘() {
        assertEquals(
            expected = listOf("aai3", "ai3"),
            actual = JyutpingConverter().translate('隘')
        )
    }

    @Test
    fun test嗌() {
        assertEquals(
            expected = listOf("aai3", "jik1"),
            actual = JyutpingConverter().translate('隘')
        )
    }
}