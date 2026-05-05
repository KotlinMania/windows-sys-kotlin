// port-lint: source src/core/literals.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.core

/**
 * A literal UTF-8 string with a trailing null terminator.
 */
public fun s(value: String): PCSTR = LiteralArena.utf8(value)

/**
 * A literal UTF-16 wide string with a trailing null terminator.
 */
public fun w(value: String): PCWSTR = LiteralArena.utf16(value)

internal object LiteralArena {
    private val utf8Literals: MutableList<ByteArray> = mutableListOf()
    private val utf16Literals: MutableList<CharArray> = mutableListOf()

    fun utf8(value: String): PCSTR {
        val bytes = value.encodeToByteArray() + 0
        utf8Literals.add(bytes)
        return utf8Literals.size.toLong()
    }

    fun utf16(value: String): PCWSTR {
        val buffer = CharArray(value.length + 1)
        var outputPos = 0
        val bytes = value.encodeToByteArray()
        var inputPos = 0
        while (true) {
            val decoded = decodeUtf8Char(bytes, inputPos) ?: break
            var codePoint = decoded.first
            inputPos = decoded.second
            if (codePoint <= 0xFFFFu) {
                buffer[outputPos] = codePoint.toInt().toChar()
                outputPos += 1
            } else {
                codePoint -= 0x10000u
                buffer[outputPos] = (0xD800u + (codePoint shr 10)).toInt().toChar()
                outputPos += 1
                buffer[outputPos] = (0xDC00u + (codePoint and 0x3FFu)).toInt().toChar()
                outputPos += 1
            }
        }
        buffer[outputPos] = '\u0000'
        utf16Literals.add(buffer)
        return utf16Literals.size.toLong()
    }
}

@PublishedApi
internal fun decodeUtf8Char(bytes: ByteArray, pos0: Int): Pair<UInt, Int>? {
    var pos = pos0
    if (bytes.size == pos) {
        return null
    }
    val ch = bytes[pos].toUByte().toUInt()
    pos += 1
    if (ch <= 0x7Fu) {
        return Pair(ch, pos)
    }
    if ((ch and 0xE0u) == 0xC0u) {
        if (bytes.size - pos < 1) {
            return null
        }
        val ch2 = bytes[pos].toUByte().toUInt()
        pos += 1
        if ((ch2 and 0xC0u) != 0x80u) {
            return null
        }
        val result: UInt = ((ch and 0x1Fu) shl 6) or (ch2 and 0x3Fu)
        if (result <= 0x7Fu) {
            return null
        }
        return Pair(result, pos)
    }
    if ((ch and 0xF0u) == 0xE0u) {
        if (bytes.size - pos < 2) {
            return null
        }
        val ch2 = bytes[pos].toUByte().toUInt()
        pos += 1
        val ch3 = bytes[pos].toUByte().toUInt()
        pos += 1
        if ((ch2 and 0xC0u) != 0x80u || (ch3 and 0xC0u) != 0x80u) {
            return null
        }
        val result = ((ch and 0x0Fu) shl 12) or ((ch2 and 0x3Fu) shl 6) or (ch3 and 0x3Fu)
        if (result <= 0x7FFu || (0xD800u <= result && result <= 0xDFFFu)) {
            return null
        }
        return Pair(result, pos)
    }
    if ((ch and 0xF8u) == 0xF0u) {
        if (bytes.size - pos < 3) {
            return null
        }
        val ch2 = bytes[pos].toUByte().toUInt()
        pos += 1
        val ch3 = bytes[pos].toUByte().toUInt()
        pos += 1
        val ch4 = bytes[pos].toUByte().toUInt()
        pos += 1
        if ((ch2 and 0xC0u) != 0x80u || (ch3 and 0xC0u) != 0x80u || (ch4 and 0xC0u) != 0x80u) {
            return null
        }
        val result =
            ((ch and 0x07u) shl 18) or ((ch2 and 0x3Fu) shl 12) or ((ch3 and 0x3Fu) shl 6) or (ch4 and 0x3Fu)
        if (result <= 0xFFFFu || 0x10FFFFu < result) {
            return null
        }
        return Pair(result, pos)
    }
    return null
}

@PublishedApi
internal fun utf16Len(bytes: ByteArray): Int {
    var pos = 0
    var len = 0
    while (true) {
        val decoded = decodeUtf8Char(bytes, pos) ?: break
        val codePoint = decoded.first
        val newPos = decoded.second
        pos = newPos
        len += if (codePoint <= 0xFFFFu) 1 else 2
    }
    return len
}
