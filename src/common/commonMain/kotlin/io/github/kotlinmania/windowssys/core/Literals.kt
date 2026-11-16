// port-lint: source core/literals.rs
package io.github.kotlinmania.windowssys.core

import io.github.kotlinmania.rustlang.core.intrinsics.kmInternCStr
import io.github.kotlinmania.rustlang.core.intrinsics.kmInternWideStr
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public fun decodeUtf8Char(bytes: List<UByte>, pos: Int): Pair<UInt, Int>? {
    var pos1 = pos
    if (bytes.size == pos1) {
        return null
    }
    val ch = bytes[pos1].toUInt()
    pos1 += 1
    if (ch <= 0x7fu) {
        return Pair(ch, pos1)
    }
    if ((ch and 0xe0u) == 0xc0u) {
        if (bytes.size - pos1 < 1) {
            return null
        }
        val ch2 = bytes[pos1].toUInt()
        pos1 += 1
        if ((ch2 and 0xc0u) != 0x80u) {
            return null
        }
        val result: UInt = ((ch and 0x1fu) shl 6) or (ch2 and 0x3fu)
        if (result <= 0x7fu) {
            return null
        }
        return Pair(result, pos1)
    }
    if ((ch and 0xf0u) == 0xe0u) {
        if (bytes.size - pos1 < 2) {
            return null
        }
        val ch21 = bytes[pos1].toUInt()
        pos1 += 1
        val ch3 = bytes[pos1].toUInt()
        pos1 += 1
        if ((ch21 and 0xc0u) != 0x80u || (ch3 and 0xc0u) != 0x80u) {
            return null
        }
        val result1 = ((ch and 0x0fu) shl 12) or ((ch21 and 0x3fu) shl 6) or (ch3 and 0x3fu)
        if (result1 <= 0x7ffu || (0xd800u <= result1 && result1 <= 0xdfffu)) {
            return null
        }
        return Pair(result1, pos1)
    }
    if ((ch and 0xf8u) == 0xf0u) {
        if (bytes.size - pos1 < 3) {
            return null
        }
        val ch22 = bytes[pos1].toUInt()
        pos1 += 1
        val ch31 = bytes[pos1].toUInt()
        pos1 += 1
        val ch4 = bytes[pos1].toUInt()
        pos1 += 1
        if ((ch22 and 0xc0u) != 0x80u || (ch31 and 0xc0u) != 0x80u || (ch4 and 0xc0u) != 0x80u) {
            return null
        }
        val result2 = ((ch and 0x07u) shl 18) or ((ch22 and 0x3fu) shl 12) or ((ch31 and 0x3fu) shl 6) or (ch4 and 0x3fu)
        if (result2 <= 0xffffu || 0x10ffffu < result2) {
            return null
        }
        return Pair(result2, pos1)
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
        len +=
            if (codePoint <= 0xffffu) {
                1
            } else {
                2
            }
    }
    return len
}

/**
 * A literal UTF-8 string with a trailing null terminator.
 */

public fun s(s: String): ConstPtr = kmInternCStr(s)

/**
 * A literal UTF-16 wide string with a trailing null terminator.
 */

public fun w(s: String): ConstPtr = kmInternWideStr(s)
