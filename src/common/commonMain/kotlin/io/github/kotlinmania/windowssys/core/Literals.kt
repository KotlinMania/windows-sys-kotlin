// port-lint: source core/literals.rs
package io.github.kotlinmania.windowssys.core

public fun decode_utf8_char(bytes: List<UByte>, pos: Int): Pair<UInt, Int>? {
    var pos = pos
    if (bytes.size == pos) {
        return null
    }
    val ch = bytes[pos].toUInt()
    pos += 1
    if (ch <= 0x7fu) {
        return Pair(ch, pos)
    }
    if ((ch and 0xe0u) == 0xc0u) {
        if (bytes.size - pos < 1) {
            return null
        }
        val ch2 = bytes[pos].toUInt()
        pos += 1
        if ((ch2 and 0xc0u) != 0x80u) {
            return null
        }
        val result: UInt = ((ch and 0x1fu) shl 6) or (ch2 and 0x3fu)
        if (result <= 0x7fu) {
            return null
        }
        return Pair(result, pos)
    }
    if ((ch and 0xf0u) == 0xe0u) {
        if (bytes.size - pos < 2) {
            return null
        }
        val ch21 = bytes[pos].toUInt()
        pos += 1
        val ch3 = bytes[pos].toUInt()
        pos += 1
        if ((ch21 and 0xc0u) != 0x80u || (ch3 and 0xc0u) != 0x80u) {
            return null
        }
        val result1 = ((ch and 0x0fu) shl 12) or ((ch21 and 0x3fu) shl 6) or (ch3 and 0x3fu)
        if (result1 <= 0x7ffu || (0xd800u <= result1 && result1 <= 0xdfffu)) {
            return null
        }
        return Pair(result1, pos)
    }
    if ((ch and 0xf8u) == 0xf0u) {
        if (bytes.size - pos < 3) {
            return null
        }
        val ch22 = bytes[pos].toUInt()
        pos += 1
        val ch31 = bytes[pos].toUInt()
        pos += 1
        val ch4 = bytes[pos].toUInt()
        pos += 1
        if ((ch22 and 0xc0u) != 0x80u || (ch31 and 0xc0u) != 0x80u || (ch4 and 0xc0u) != 0x80u) {
            return null
        }
        val result2 = ((ch and 0x07u) shl 18) or ((ch22 and 0x3fu) shl 12) or ((ch31 and 0x3fu) shl 6) or (ch4 and 0x3fu)
        if (result2 <= 0xffffu || 0x10ffffu < result2) {
            return null
        }
        return Pair(result2, pos)
    }
    return null
}

public fun utf16_len(bytes: List<UByte>): Int {
    var pos = 0
    var len = 0
    while (true) {
        val matchVal = decode_utf8_char(bytes, pos)
        if (matchVal == null) break
        val code_point = matchVal.first
        val new_pos = matchVal.second
        pos = new_pos
        len += if (code_point <= 0xffffu) {
            1
        } else {
            2
        }
    }
    return len
}
