// port-lint: source core/literals.rs
package io.github.kotlinmania.windowssys.core

public fun decode_utf8_char(bytes: List<UByte>, pos: Int): Pair<UInt, Int>? {
    var pos = pos
    if (bytes.size == pos) {
        return null
    }
    val ch = bytes[pos].toUInt()
    pos += 1
    if (ch <= 0x7f) {
        return Pair(ch, pos)
    }
    if ((ch and 0xe0) == 0xc0) {
        if (bytes.size - pos < 1) {
            return null
        }
        val ch2 = bytes[pos].toUInt()
        pos += 1
        if ((ch2 and 0xc0) != 0x80) {
            return null
        }
        val result: UInt = ((ch and 0x1fu) shl 6) or (ch2 and 0x3fu)
        if (result <= 0x7fu) {
            return null
        }
        return Pair(result, pos)
    }
    if ((ch and 0xf0) == 0xe0) {
        if (bytes.size - pos < 2) {
            return null
        }
        val ch21 = bytes[pos].toUInt()
        pos += 1
        val ch3 = bytes[pos].toUInt()
        pos += 1
        if ((ch21 and 0xc0) != 0x80 || (ch3 and 0xc0) != 0x80) {
            return null
        }
        val result1 = ((ch and 0x0f) shl 12) or ((ch21 and 0x3f) shl 6) or (ch3 and 0x3f)
        if (result1 <= 0x7ff || (0xd800 <= result1 && result1 <= 0xdfff)) {
            return null
        }
        return Pair(result1, pos)
    }
    if ((ch and 0xf8) == 0xf0) {
        if (bytes.size - pos < 3) {
            return null
        }
        val ch22 = bytes[pos].toUInt()
        pos += 1
        val ch31 = bytes[pos].toUInt()
        pos += 1
        val ch4 = bytes[pos].toUInt()
        pos += 1
        if ((ch22 and 0xc0) != 0x80 || (ch31 and 0xc0) != 0x80 || (ch4 and 0xc0) != 0x80) {
            return null
        }
        val result2 = ((ch and 0x07) shl 18) or ((ch22 and 0x3f) shl 12) or ((ch31 and 0x3f) shl 6) or (ch4 and 0x3f)
        if (result2 <= 0xffff || 0x10ffff < result2) {
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
        len += if (code_point <= 0xffff) {
            1
        } else {
            2
        }
    }
    return len
}

private const val s_TEMPLATE: String = ".core.concat(\$s, '\\0').as_ptr()"

private const val w_TEMPLATE: String = "{const INPUT:&[u8]= \$s.as_bytes(); const OUTPUT_LEN: usize= core.utf16_len(INPUT)+ 1; const OUTPUT:&[u16; OUTPUT_LEN]= {val var buffer=[0; OUTPUT_LEN]; val var input_pos= 0; val var output_pos= 0; whileLoop val Some((var code_point, new_pos))= core.decode_utf8_char(INPUT, input_pos) {input_pos= new_pos; ifBranch code_point<= 0xffff {buffer[output_pos]= code_point asTarget u16; output_pos+= 1; } elseBranch {code_point-= 0x10000; buffer[output_pos]= 0xd800+(code_point>> 10) asTarget u16; output_pos+= 1; buffer[output_pos]= 0xdc00+(code_point& 0x3ff) asTarget u16; output_pos+= 1; }}& {buffer}}; OUTPUT.as_ptr()}"

/**
 * A literal UTF-8 string with a trailing null terminator.
 */

public fun s(s: String = ""): String =
    s_TEMPLATE.replace("\$s", s)

/**
 * A literal UTF-16 wide string with a trailing null terminator.
 */

public fun w(s: String = ""): String =
    w_TEMPLATE.replace("\$s", s)
