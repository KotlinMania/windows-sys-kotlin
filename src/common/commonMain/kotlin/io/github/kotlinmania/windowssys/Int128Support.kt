@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

public class U128(
    public val high: ULong = 0uL,
    public val low: ULong = 0uL,
) {
    public infix fun shr(bitCount: Int): U128 {
        val n = bitCount and 127
        return when {
            n == 0 -> this
            n < 64 -> U128(high shr n, (low shr n) or (high shl (64 - n)))
            else -> U128(0uL, high shr (n - 64))
        }
    }

    public infix fun shl(bitCount: Int): U128 {
        val n = bitCount and 127
        return when {
            n == 0 -> this
            n < 64 -> U128((high shl n) or (low shr (64 - n)), low shl n)
            else -> U128(low shl (n - 64), 0uL)
        }
    }

    public infix fun and(other: U128): U128 = U128(high and other.high, low and other.low)
    public infix fun and(mask: ULong): U128 = U128(0uL, low and mask)
    public infix fun and(mask: UInt): U128 = U128(0uL, low and mask.toULong())
    public infix fun and(mask: Long): U128 = and(fromLong(mask))
    public infix fun and(mask: Int): U128 = and(fromLong(mask.toLong()))

    public infix fun or(other: U128): U128 = U128(high or other.high, low or other.low)
    public infix fun or(mask: ULong): U128 = U128(high, low or mask)
    public infix fun or(mask: UInt): U128 = U128(high, low or mask.toULong())
    public infix fun or(mask: Long): U128 = or(fromLong(mask))
    public infix fun or(mask: Int): U128 = or(fromLong(mask.toLong()))

    public infix fun xor(other: U128): U128 = U128(high xor other.high, low xor other.low)
    public infix fun xor(mask: ULong): U128 = U128(high, low xor mask)
    public infix fun xor(mask: UInt): U128 = U128(high, low xor mask.toULong())
    public infix fun xor(mask: Long): U128 = xor(fromLong(mask))
    public infix fun xor(mask: Int): U128 = xor(fromLong(mask.toLong()))

    public fun inv(): U128 = U128(high.inv(), low.inv())

    public operator fun plus(other: U128): U128 {
        val newLow = low + other.low
        val carry = if (newLow < low) 1uL else 0uL
        return U128(high + other.high + carry, newLow)
    }

    public operator fun minus(other: U128): U128 {
        val borrow = if (low < other.low) 1uL else 0uL
        return U128(high - other.high - borrow, low - other.low)
    }

    public operator fun times(other: U128): U128 {
        val a0 = low and 0xFFFF_FFFFuL
        val a1 = low shr 32
        val a2 = high and 0xFFFF_FFFFuL
        val a3 = high shr 32
        val b0 = other.low and 0xFFFF_FFFFuL
        val b1 = other.low shr 32
        val b2 = other.high and 0xFFFF_FFFFuL
        val b3 = other.high shr 32

        val p00 = a0 * b0
        val r0 = p00 and 0xFFFF_FFFFuL
        var c = p00 shr 32

        val s1 = a0 * b1 + c
        val t1 = a1 * b0
        val u1 = (s1 and 0xFFFF_FFFFuL) + (t1 and 0xFFFF_FFFFuL)
        val r1 = u1 and 0xFFFF_FFFFuL
        c = (s1 shr 32) + (t1 shr 32) + (u1 shr 32)

        val m20 = a0 * b2
        val m11 = a1 * b1
        val m02 = a2 * b0
        val u2 = (m20 and 0xFFFF_FFFFuL) + (m11 and 0xFFFF_FFFFuL) + (m02 and 0xFFFF_FFFFuL) + (c and 0xFFFF_FFFFuL)
        val r2 = u2 and 0xFFFF_FFFFuL
        c = (m20 shr 32) + (m11 shr 32) + (m02 shr 32) + (c shr 32) + (u2 shr 32)

        val r3 = (a0 * b3 + a1 * b2 + a2 * b1 + a3 * b0 + c) and 0xFFFF_FFFFuL
        return U128((r3 shl 32) or r2, (r1 shl 32) or r0)
    }

    public operator fun div(other: U128): U128 = divRem(other).first
    public operator fun rem(other: U128): U128 = divRem(other).second

    private fun divRem(divisor: U128): Pair<U128, U128> {
        check(divisor.high != 0uL || divisor.low != 0uL) { "attempt to divide by zero" }
        if (this < divisor) return ZERO to this
        var quotient = ZERO
        var remainder = ZERO
        for (bit in 127 downTo 0) {
            remainder = remainder shl 1
            val bitVal =
                if (bit >= 64) {
                    (high shr (bit - 64)) and 1uL
                } else {
                    (low shr bit) and 1uL
                }
            if (bitVal != 0uL) {
                remainder = U128(remainder.high, remainder.low or 1uL)
            }
            if (remainder >= divisor) {
                remainder -= divisor
                quotient =
                    if (bit >= 64) {
                        U128(quotient.high or (1uL shl (bit - 64)), quotient.low)
                    } else {
                        U128(quotient.high, quotient.low or (1uL shl bit))
                    }
            }
        }
        return quotient to remainder
    }

    public fun toByte(): Byte = low.toByte()
    public fun toUByte(): UByte = low.toUByte()
    public fun toShort(): Short = low.toShort()
    public fun toUShort(): UShort = low.toUShort()
    public fun toInt(): Int = low.toInt()
    public fun toUInt(): UInt = low.toUInt()
    public fun toLong(): Long = low.toLong()
    public fun toULong(): ULong = low
    public fun toFloat(): Float = high.toDouble().toFloat() * 18446744073709551616.0f + low.toDouble().toFloat()
    public fun toDouble(): Double = high.toDouble() * 18446744073709551616.0 + low.toDouble()
    public fun toU128(): U128 = this
    public fun toI128(): I128 = I128(high.toLong(), low)

    public fun toBeBytes(): UByteArray =
        ubyteArrayOf(
            (high shr 56).toUByte(),
            (high shr 48).toUByte(),
            (high shr 40).toUByte(),
            (high shr 32).toUByte(),
            (high shr 24).toUByte(),
            (high shr 16).toUByte(),
            (high shr 8).toUByte(),
            high.toUByte(),
            (low shr 56).toUByte(),
            (low shr 48).toUByte(),
            (low shr 40).toUByte(),
            (low shr 32).toUByte(),
            (low shr 24).toUByte(),
            (low shr 16).toUByte(),
            (low shr 8).toUByte(),
            low.toUByte(),
        )

    public fun toLeBytes(): UByteArray =
        ubyteArrayOf(
            low.toUByte(),
            (low shr 8).toUByte(),
            (low shr 16).toUByte(),
            (low shr 24).toUByte(),
            (low shr 32).toUByte(),
            (low shr 40).toUByte(),
            (low shr 48).toUByte(),
            (low shr 56).toUByte(),
            high.toUByte(),
            (high shr 8).toUByte(),
            (high shr 16).toUByte(),
            (high shr 24).toUByte(),
            (high shr 32).toUByte(),
            (high shr 40).toUByte(),
            (high shr 48).toUByte(),
            (high shr 56).toUByte(),
        )

    public fun toNeBytes(): UByteArray = toLeBytes()

    public operator fun compareTo(other: U128): Int {
        val hc = high.compareTo(other.high)
        return if (hc != 0) hc else low.compareTo(other.low)
    }

    override fun equals(other: Any?): Boolean =
        other is U128 && high == other.high && low == other.low

    override fun hashCode(): Int = 31 * high.hashCode() + low.hashCode()

    override fun toString(): String {
        if (high == 0uL) return low.toString()
        val ten = U128(0uL, 10uL)
        val sb = StringBuilder()
        var cur = this
        while (cur.high != 0uL || cur.low != 0uL) {
            val (q, r) = cur.divRem(ten)
            sb.append(('0'.code + r.low.toInt()).toChar())
            cur = q
        }
        return sb.reverse().toString()
    }

    public companion object {
        public val ZERO: U128 = U128(0uL, 0uL)
        public val ONE: U128 = U128(0uL, 1uL)
        public val MIN: U128 = ZERO
        public val MAX: U128 = U128(ULong.MAX_VALUE, ULong.MAX_VALUE)
        public val MIN_VALUE: U128 = MIN
        public val MAX_VALUE: U128 = MAX

        public fun fromULong(v: ULong): U128 = U128(0uL, v)
        public fun fromUInt(v: UInt): U128 = U128(0uL, v.toULong())
        public fun fromUShort(v: UShort): U128 = U128(0uL, v.toULong())
        public fun fromUByte(v: UByte): U128 = U128(0uL, v.toULong())
        public fun fromLong(v: Long): U128 = U128(if (v < 0L) ULong.MAX_VALUE else 0uL, v.toULong())
        public fun fromInt(v: Int): U128 = fromLong(v.toLong())
        public fun fromShort(v: Short): U128 = fromLong(v.toLong())
        public fun fromByte(v: Byte): U128 = fromLong(v.toLong())

        public fun fromBeBytes(bytes: UByteArray): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 0 until 8) hi = (hi shl 8) or bytes[i].toULong()
            for (i in 8 until 16) lo = (lo shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }

        public fun fromBeBytes(bytes: List<UByte>): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 0 until 8) hi = (hi shl 8) or bytes[i].toULong()
            for (i in 8 until 16) lo = (lo shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }

        public fun fromLeBytes(bytes: UByteArray): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 7 downTo 0) lo = (lo shl 8) or bytes[i].toULong()
            for (i in 15 downTo 8) hi = (hi shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }

        public fun fromLeBytes(bytes: List<UByte>): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 7 downTo 0) lo = (lo shl 8) or bytes[i].toULong()
            for (i in 15 downTo 8) hi = (hi shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }
    }
}

public class I128(
    public val high: Long = 0L,
    public val low: ULong = 0uL,
) {
    public infix fun shr(bitCount: Int): I128 {
        val n = bitCount and 127
        return when {
            n == 0 -> this
            n < 64 -> I128(high shr n, (low shr n) or (high.toULong() shl (64 - n)))
            else -> {
                val signFill = if (high < 0L) -1L else 0L
                I128(signFill, (high shr (n - 64)).toULong())
            }
        }
    }

    public infix fun shl(bitCount: Int): I128 {
        val u = U128(high.toULong(), low) shl bitCount
        return I128(u.high.toLong(), u.low)
    }

    public infix fun and(other: I128): I128 = I128(high and other.high, low and other.low)
    public infix fun and(mask: Long): I128 = and(fromLong(mask))
    public infix fun and(mask: Int): I128 = and(fromLong(mask.toLong()))
    public infix fun and(mask: ULong): I128 = I128(0L, low and mask)
    public infix fun and(mask: UInt): I128 = I128(0L, low and mask.toULong())

    public infix fun or(other: I128): I128 = I128(high or other.high, low or other.low)
    public infix fun or(mask: Long): I128 = or(fromLong(mask))
    public infix fun or(mask: Int): I128 = or(fromLong(mask.toLong()))
    public infix fun or(mask: ULong): I128 = I128(high, low or mask)
    public infix fun or(mask: UInt): I128 = I128(high, low or mask.toULong())

    public infix fun xor(other: I128): I128 = I128(high xor other.high, low xor other.low)
    public infix fun xor(mask: Long): I128 = xor(fromLong(mask))
    public infix fun xor(mask: Int): I128 = xor(fromLong(mask.toLong()))
    public infix fun xor(mask: ULong): I128 = I128(high, low xor mask)
    public infix fun xor(mask: UInt): I128 = I128(high, low xor mask.toULong())

    public fun inv(): I128 = I128(high.inv(), low.inv())

    public operator fun unaryMinus(): I128 {
        val invLow = low.inv() + 1uL
        val carry = if (invLow == 0uL) 1L else 0L
        return I128(high.inv() + carry, invLow)
    }

    public operator fun plus(other: I128): I128 {
        val u = U128(high.toULong(), low) + U128(other.high.toULong(), other.low)
        return I128(u.high.toLong(), u.low)
    }

    public operator fun minus(other: I128): I128 {
        val u = U128(high.toULong(), low) - U128(other.high.toULong(), other.low)
        return I128(u.high.toLong(), u.low)
    }

    public operator fun times(other: I128): I128 {
        val u = U128(high.toULong(), low) * U128(other.high.toULong(), other.low)
        return I128(u.high.toLong(), u.low)
    }

    public operator fun div(other: I128): I128 {
        val negA = high < 0L
        val negB = other.high < 0L
        val absA = if (negA) -this else this
        val absB = if (negB) -other else other
        val q = U128(absA.high.toULong(), absA.low) / U128(absB.high.toULong(), absB.low)
        val signedQ = I128(q.high.toLong(), q.low)
        return if (negA != negB) -signedQ else signedQ
    }

    public operator fun rem(other: I128): I128 {
        val negA = high < 0L
        val negB = other.high < 0L
        val absA = if (negA) -this else this
        val absB = if (negB) -other else other
        val r = U128(absA.high.toULong(), absA.low) % U128(absB.high.toULong(), absB.low)
        val signedR = I128(r.high.toLong(), r.low)
        return if (negA) -signedR else signedR
    }

    public fun toByte(): Byte = low.toByte()
    public fun toUByte(): UByte = low.toUByte()
    public fun toShort(): Short = low.toShort()
    public fun toUShort(): UShort = low.toUShort()
    public fun toInt(): Int = low.toInt()
    public fun toUInt(): UInt = low.toUInt()
    public fun toLong(): Long = low.toLong()
    public fun toULong(): ULong = low
    public fun toFloat(): Float = toDouble().toFloat()
    public fun toDouble(): Double =
        if (high < 0L) {
            val mag = -this
            -(U128(mag.high.toULong(), mag.low).toDouble())
        } else {
            U128(high.toULong(), low).toDouble()
        }
    public fun toU128(): U128 = U128(high.toULong(), low)
    public fun toI128(): I128 = this

    public fun toBeBytes(): UByteArray = U128(high.toULong(), low).toBeBytes()
    public fun toLeBytes(): UByteArray = U128(high.toULong(), low).toLeBytes()
    public fun toNeBytes(): UByteArray = U128(high.toULong(), low).toNeBytes()

    public operator fun compareTo(other: I128): Int {
        val hc = high.compareTo(other.high)
        return if (hc != 0) hc else low.compareTo(other.low)
    }

    override fun equals(other: Any?): Boolean =
        other is I128 && high == other.high && low == other.low

    override fun hashCode(): Int = 31 * high.hashCode() + low.hashCode()

    override fun toString(): String {
        if (high >= 0L) return U128(high.toULong(), low).toString()
        val mag = -this
        return "-${U128(mag.high.toULong(), mag.low)}"
    }

    public companion object {
        public val ZERO: I128 = I128(0L, 0uL)
        public val ONE: I128 = I128(0L, 1uL)
        public val MIN: I128 = I128(Long.MIN_VALUE, 0uL)
        public val MAX: I128 = I128(Long.MAX_VALUE, ULong.MAX_VALUE)
        public val MIN_VALUE: I128 = MIN
        public val MAX_VALUE: I128 = MAX

        public fun fromLong(v: Long): I128 = I128(if (v < 0L) -1L else 0L, v.toULong())
        public fun fromInt(v: Int): I128 = fromLong(v.toLong())
        public fun fromShort(v: Short): I128 = fromLong(v.toLong())
        public fun fromByte(v: Byte): I128 = fromLong(v.toLong())
        public fun fromULong(v: ULong): I128 = I128(0L, v)
        public fun fromUInt(v: UInt): I128 = I128(0L, v.toULong())
        public fun fromUShort(v: UShort): I128 = I128(0L, v.toULong())
        public fun fromUByte(v: UByte): I128 = I128(0L, v.toULong())

        public fun fromBeBytes(bytes: UByteArray): I128 = U128.fromBeBytes(bytes).toI128()
        public fun fromBeBytes(bytes: List<UByte>): I128 = U128.fromBeBytes(bytes).toI128()
        public fun fromLeBytes(bytes: UByteArray): I128 = U128.fromLeBytes(bytes).toI128()
        public fun fromLeBytes(bytes: List<UByte>): I128 = U128.fromLeBytes(bytes).toI128()
    }
}
