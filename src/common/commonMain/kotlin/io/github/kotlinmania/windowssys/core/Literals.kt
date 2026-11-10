// port-lint: source core/literals.rs
package io.github.kotlinmania.windowssys.core

public fun decodeUtf8Char(bytes: List<UByte>, pos: Int): Pair<UInt, Int>? {
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

public fun utf16Len(bytes: List<UByte>): Int {
    var pos = 0
    var len = 0
    while (true) {
        val matchVal = decodeUtf8Char(bytes, pos)
        if (matchVal == null) break
        val codePoint = matchVal.first
        val newPos = matchVal.second
        pos = newPos
        len += if (codePoint <= 0xffffu) {
            1
        } else {
            2
        }
    }
    return len
}

private const val S_TEMPLATE: String = ".core.concat(\$s, '\\0').asPtr()"

private const val W_TEMPLATE: String = "{const Input:&[u8]= \$s.asBytes(); const OutputLen: usize= core.utf16Len(Input)+ 1; const Output:&[u16; OutputLen]= {val var buffer=[0; OutputLen]; val var inputPos= 0; val var outputPos= 0; whileLoop val Some((var codePoint, newPos))= core.decodeUtf8Char(Input, inputPos) {inputPos= newPos; ifBranch codePoint<= 0xffff {buffer[outputPos]= codePoint asTarget u16; outputPos+= 1; } elseBranch {codePoint-= 0x10000; buffer[outputPos]= 0xd800+(codePoint>> 10) asTarget u16; outputPos+= 1; buffer[outputPos]= 0xdc00+(codePoint& 0x3ff) asTarget u16; outputPos+= 1; }}& {buffer}}; Output.asPtr()}"

/**
 * A literal UTF-8 string with a trailing null terminator.
 */

public fun s(s: String = ""): String =
    S_TEMPLATE.replace("\$s", s)

/**
 * A literal UTF-16 wide string with a trailing null terminator.
 */

public fun w(s: String = ""): String =
    W_TEMPLATE.replace("\$s", s)
