@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Axeslista
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Axeslistw
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Newtextmetrica
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Newtextmetricw

public data class Caldatetime(
    public var calId: UInt = 0u,
    public var era: UInt = 0u,
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var dayOfWeek: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var tick: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caldatetime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caldatetime> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Caldatetime =
                    Caldatetime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Caldatetime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.calId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.era)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dayOfWeek)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.tick)
                }
            }
    }
}

public data class Charsetinfo(
    public var ciCharset: UInt = 0u,
    public var ciACP: UInt = 0u,
    public var fs: Fontsignature = Fontsignature(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Charsetinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Charsetinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Charsetinfo =
                    Charsetinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (Fontsignature.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Charsetinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ciCharset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ciACP)
                    (Fontsignature.typeLayout()).writeNative(addr + 8L, value.fs)
                }
            }
    }
}

public data class Cpinfo(
    public var maxCharSize: UInt = 0u,
    public var defaultChar: UByteArray = UByteArray(2),
    public var leadByte: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpinfo) return false
        if (this.maxCharSize != other.maxCharSize) return false
        if (!this.defaultChar.contentEquals(other.defaultChar)) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxCharSize.hashCode()
        result = 31 * result + this.defaultChar.contentHashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Cpinfo =
                    Cpinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Cpinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxCharSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 4L, value.defaultChar.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 6L, value.leadByte.toList())
                }
            }
    }
}

public data class Cpinfoexa(
    public var maxCharSize: UInt = 0u,
    public var defaultChar: UByteArray = UByteArray(2),
    public var leadByte: UByteArray = UByteArray(12),
    public var unicodeDefaultChar: UShort = 0u,
    public var codePage: UInt = 0u,
    public var codePageName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpinfoexa) return false
        if (this.maxCharSize != other.maxCharSize) return false
        if (!this.defaultChar.contentEquals(other.defaultChar)) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        if (this.unicodeDefaultChar != other.unicodeDefaultChar) return false
        if (this.codePage != other.codePage) return false
        if (!this.codePageName.contentEquals(other.codePageName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxCharSize.hashCode()
        result = 31 * result + this.defaultChar.contentHashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        result = 31 * result + this.unicodeDefaultChar.hashCode()
        result = 31 * result + this.codePage.hashCode()
        result = 31 * result + this.codePageName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpinfoexa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpinfoexa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 284L
                override fun readNative(addr: Long): Cpinfoexa =
                    Cpinfoexa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Cpinfoexa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxCharSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 4L, value.defaultChar.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 6L, value.leadByte.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.unicodeDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.codePage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 24L, value.codePageName.toList())
                }
            }
    }
}

public data class Cpinfoexw(
    public var maxCharSize: UInt = 0u,
    public var defaultChar: UByteArray = UByteArray(2),
    public var leadByte: UByteArray = UByteArray(12),
    public var unicodeDefaultChar: UShort = 0u,
    public var codePage: UInt = 0u,
    public var codePageName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpinfoexw) return false
        if (this.maxCharSize != other.maxCharSize) return false
        if (!this.defaultChar.contentEquals(other.defaultChar)) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        if (this.unicodeDefaultChar != other.unicodeDefaultChar) return false
        if (this.codePage != other.codePage) return false
        if (!this.codePageName.contentEquals(other.codePageName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxCharSize.hashCode()
        result = 31 * result + this.defaultChar.contentHashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        result = 31 * result + this.unicodeDefaultChar.hashCode()
        result = 31 * result + this.codePage.hashCode()
        result = 31 * result + this.codePageName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpinfoexw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cpinfoexw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 544L
                override fun readNative(addr: Long): Cpinfoexw =
                    Cpinfoexw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Cpinfoexw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxCharSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 4L, value.defaultChar.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 6L, value.leadByte.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.unicodeDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.codePage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 24L, value.codePageName.toList())
                }
            }
    }
}

public class Currencyfmta internal constructor(
    public var numDigits: UInt,
    public var leadingZero: UInt,
    public var grouping: UInt,
    lpDecimalSepCtorArg: Pstr,
    lpThousandSepCtorArg: Pstr,
    public var negativeOrder: UInt,
    public var positiveOrder: UInt,
    lpCurrencySymbolCtorArg: Pstr,
) {
    public var lpDecimalSep: Pstr = lpDecimalSepCtorArg
        internal set

    public var lpThousandSep: Pstr = lpThousandSepCtorArg
        internal set

    public var lpCurrencySymbol: Pstr = lpCurrencySymbolCtorArg
        internal set

    public constructor() : this(
        numDigits = 0u,
        leadingZero = 0u,
        grouping = 0u,
        lpDecimalSepCtorArg = MutPtr(0L),
        lpThousandSepCtorArg = MutPtr(0L),
        negativeOrder = 0u,
        positiveOrder = 0u,
        lpCurrencySymbolCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numDigits

    public operator fun component2(): UInt = this.leadingZero

    public operator fun component3(): UInt = this.grouping

    public operator fun component4(): Pstr = this.lpDecimalSep

    public operator fun component5(): Pstr = this.lpThousandSep

    public operator fun component6(): UInt = this.negativeOrder

    public operator fun component7(): UInt = this.positiveOrder

    public operator fun component8(): Pstr = this.lpCurrencySymbol

    public fun copy(numDigits: UInt = this.numDigits, leadingZero: UInt = this.leadingZero, grouping: UInt = this.grouping, lpDecimalSep: Pstr = this.lpDecimalSep, lpThousandSep: Pstr = this.lpThousandSep, negativeOrder: UInt = this.negativeOrder, positiveOrder: UInt = this.positiveOrder, lpCurrencySymbol: Pstr = this.lpCurrencySymbol): Currencyfmta = Currencyfmta(numDigits = numDigits, leadingZero = leadingZero, grouping = grouping, lpDecimalSepCtorArg = lpDecimalSep, lpThousandSepCtorArg = lpThousandSep, negativeOrder = negativeOrder, positiveOrder = positiveOrder, lpCurrencySymbolCtorArg = lpCurrencySymbol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Currencyfmta) return false
        if (this.numDigits != other.numDigits) return false
        if (this.leadingZero != other.leadingZero) return false
        if (this.grouping != other.grouping) return false
        if (this.lpDecimalSep != other.lpDecimalSep) return false
        if (this.lpThousandSep != other.lpThousandSep) return false
        if (this.negativeOrder != other.negativeOrder) return false
        if (this.positiveOrder != other.positiveOrder) return false
        if (this.lpCurrencySymbol != other.lpCurrencySymbol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numDigits.hashCode()
        result = 31 * result + this.leadingZero.hashCode()
        result = 31 * result + this.grouping.hashCode()
        result = 31 * result + this.lpDecimalSep.hashCode()
        result = 31 * result + this.lpThousandSep.hashCode()
        result = 31 * result + this.negativeOrder.hashCode()
        result = 31 * result + this.positiveOrder.hashCode()
        result = 31 * result + this.lpCurrencySymbol.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            numDigits: UInt = 0u,
            leadingZero: UInt = 0u,
            grouping: UInt = 0u,
            lpDecimalSep: Pstr = MutPtr(0L),
            lpThousandSep: Pstr = MutPtr(0L),
            negativeOrder: UInt = 0u,
            positiveOrder: UInt = 0u,
            lpCurrencySymbol: Pstr = MutPtr(0L),
        ): Currencyfmta =
            Currencyfmta(
                numDigits = numDigits,
                leadingZero = leadingZero,
                grouping = grouping,
                lpDecimalSepCtorArg = lpDecimalSep,
                lpThousandSepCtorArg = lpThousandSep,
                negativeOrder = negativeOrder,
                positiveOrder = positiveOrder,
                lpCurrencySymbolCtorArg = lpCurrencySymbol,
            )
    }
}

public class Currencyfmtw internal constructor(
    public var numDigits: UInt,
    public var leadingZero: UInt,
    public var grouping: UInt,
    lpDecimalSepCtorArg: Pwstr,
    lpThousandSepCtorArg: Pwstr,
    public var negativeOrder: UInt,
    public var positiveOrder: UInt,
    lpCurrencySymbolCtorArg: Pwstr,
) {
    public var lpDecimalSep: Pwstr = lpDecimalSepCtorArg
        internal set

    public var lpThousandSep: Pwstr = lpThousandSepCtorArg
        internal set

    public var lpCurrencySymbol: Pwstr = lpCurrencySymbolCtorArg
        internal set

    public constructor() : this(
        numDigits = 0u,
        leadingZero = 0u,
        grouping = 0u,
        lpDecimalSepCtorArg = MutPtr(0L),
        lpThousandSepCtorArg = MutPtr(0L),
        negativeOrder = 0u,
        positiveOrder = 0u,
        lpCurrencySymbolCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numDigits

    public operator fun component2(): UInt = this.leadingZero

    public operator fun component3(): UInt = this.grouping

    public operator fun component4(): Pwstr = this.lpDecimalSep

    public operator fun component5(): Pwstr = this.lpThousandSep

    public operator fun component6(): UInt = this.negativeOrder

    public operator fun component7(): UInt = this.positiveOrder

    public operator fun component8(): Pwstr = this.lpCurrencySymbol

    public fun copy(numDigits: UInt = this.numDigits, leadingZero: UInt = this.leadingZero, grouping: UInt = this.grouping, lpDecimalSep: Pwstr = this.lpDecimalSep, lpThousandSep: Pwstr = this.lpThousandSep, negativeOrder: UInt = this.negativeOrder, positiveOrder: UInt = this.positiveOrder, lpCurrencySymbol: Pwstr = this.lpCurrencySymbol): Currencyfmtw = Currencyfmtw(numDigits = numDigits, leadingZero = leadingZero, grouping = grouping, lpDecimalSepCtorArg = lpDecimalSep, lpThousandSepCtorArg = lpThousandSep, negativeOrder = negativeOrder, positiveOrder = positiveOrder, lpCurrencySymbolCtorArg = lpCurrencySymbol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Currencyfmtw) return false
        if (this.numDigits != other.numDigits) return false
        if (this.leadingZero != other.leadingZero) return false
        if (this.grouping != other.grouping) return false
        if (this.lpDecimalSep != other.lpDecimalSep) return false
        if (this.lpThousandSep != other.lpThousandSep) return false
        if (this.negativeOrder != other.negativeOrder) return false
        if (this.positiveOrder != other.positiveOrder) return false
        if (this.lpCurrencySymbol != other.lpCurrencySymbol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numDigits.hashCode()
        result = 31 * result + this.leadingZero.hashCode()
        result = 31 * result + this.grouping.hashCode()
        result = 31 * result + this.lpDecimalSep.hashCode()
        result = 31 * result + this.lpThousandSep.hashCode()
        result = 31 * result + this.negativeOrder.hashCode()
        result = 31 * result + this.positiveOrder.hashCode()
        result = 31 * result + this.lpCurrencySymbol.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            numDigits: UInt = 0u,
            leadingZero: UInt = 0u,
            grouping: UInt = 0u,
            lpDecimalSep: Pwstr = MutPtr(0L),
            lpThousandSep: Pwstr = MutPtr(0L),
            negativeOrder: UInt = 0u,
            positiveOrder: UInt = 0u,
            lpCurrencySymbol: Pwstr = MutPtr(0L),
        ): Currencyfmtw =
            Currencyfmtw(
                numDigits = numDigits,
                leadingZero = leadingZero,
                grouping = grouping,
                lpDecimalSepCtorArg = lpDecimalSep,
                lpThousandSepCtorArg = lpThousandSep,
                negativeOrder = negativeOrder,
                positiveOrder = positiveOrder,
                lpCurrencySymbolCtorArg = lpCurrencySymbol,
            )
    }
}

public data class DetectEncodingInfo(
    public var nLangID: UInt = 0u,
    public var nCodePage: UInt = 0u,
    public var nDocPercent: Int = 0,
    public var nConfidence: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DetectEncodingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DetectEncodingInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DetectEncodingInfo =
                    DetectEncodingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DetectEncodingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nLangID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nCodePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.nDocPercent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.nConfidence)
                }
            }
    }
}

public data class Enumtextmetrica(
    public var etmNewTextMetricEx: Newtextmetricexa = Newtextmetricexa(),
    public var etmAxesList: Axeslista = Axeslista(),
)

public data class Enumtextmetricw(
    public var etmNewTextMetricEx: Newtextmetricexw = Newtextmetricexw(),
    public var etmAxesList: Axeslistw = Axeslistw(),
)

public data class Filemuiinfo(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFileType: UInt = 0u,
    public var pChecksum: UByteArray = UByteArray(16),
    public var pServiceChecksum: UByteArray = UByteArray(16),
    public var dwLanguageNameOffset: UInt = 0u,
    public var dwTypeIDMainSize: UInt = 0u,
    public var dwTypeIDMainOffset: UInt = 0u,
    public var dwTypeNameMainOffset: UInt = 0u,
    public var dwTypeIDMUISize: UInt = 0u,
    public var dwTypeIDMUIOffset: UInt = 0u,
    public var dwTypeNameMUIOffset: UInt = 0u,
    public var abBuffer: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filemuiinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFileType != other.dwFileType) return false
        if (!this.pChecksum.contentEquals(other.pChecksum)) return false
        if (!this.pServiceChecksum.contentEquals(other.pServiceChecksum)) return false
        if (this.dwLanguageNameOffset != other.dwLanguageNameOffset) return false
        if (this.dwTypeIDMainSize != other.dwTypeIDMainSize) return false
        if (this.dwTypeIDMainOffset != other.dwTypeIDMainOffset) return false
        if (this.dwTypeNameMainOffset != other.dwTypeNameMainOffset) return false
        if (this.dwTypeIDMUISize != other.dwTypeIDMUISize) return false
        if (this.dwTypeIDMUIOffset != other.dwTypeIDMUIOffset) return false
        if (this.dwTypeNameMUIOffset != other.dwTypeNameMUIOffset) return false
        if (!this.abBuffer.contentEquals(other.abBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFileType.hashCode()
        result = 31 * result + this.pChecksum.contentHashCode()
        result = 31 * result + this.pServiceChecksum.contentHashCode()
        result = 31 * result + this.dwLanguageNameOffset.hashCode()
        result = 31 * result + this.dwTypeIDMainSize.hashCode()
        result = 31 * result + this.dwTypeIDMainOffset.hashCode()
        result = 31 * result + this.dwTypeNameMainOffset.hashCode()
        result = 31 * result + this.dwTypeIDMUISize.hashCode()
        result = 31 * result + this.dwTypeIDMUIOffset.hashCode()
        result = 31 * result + this.dwTypeNameMUIOffset.hashCode()
        result = 31 * result + this.abBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filemuiinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filemuiinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Filemuiinfo =
                    Filemuiinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 72L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Filemuiinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFileType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 12L, value.pChecksum.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 28L, value.pServiceChecksum.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwLanguageNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwTypeIDMainSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwTypeIDMainOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwTypeNameMainOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwTypeIDMUISize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwTypeIDMUIOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwTypeNameMUIOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 72L, value.abBuffer.toList())
                }
            }
    }
}

public data class Fontsignature(
    public var fsUsb: UIntArray = UIntArray(4),
    public var fsCsb: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fontsignature) return false
        if (!this.fsUsb.contentEquals(other.fsUsb)) return false
        if (!this.fsCsb.contentEquals(other.fsCsb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fsUsb.contentHashCode()
        result = 31 * result + this.fsCsb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fontsignature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fontsignature> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Fontsignature =
                    Fontsignature(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Fontsignature) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.fsUsb.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 16L, value.fsCsb.toList())
                }
            }
    }
}

public data class Goffset(
    public var du: Int = 0,
    public var dv: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Goffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Goffset> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Goffset =
                    Goffset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Goffset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.du)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dv)
                }
            }
    }
}

public data class Localesignature(
    public var lsUsb: UIntArray = UIntArray(4),
    public var lsCsbDefault: UIntArray = UIntArray(2),
    public var lsCsbSupported: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Localesignature) return false
        if (!this.lsUsb.contentEquals(other.lsUsb)) return false
        if (!this.lsCsbDefault.contentEquals(other.lsCsbDefault)) return false
        if (!this.lsCsbSupported.contentEquals(other.lsCsbSupported)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lsUsb.contentHashCode()
        result = 31 * result + this.lsCsbDefault.contentHashCode()
        result = 31 * result + this.lsCsbSupported.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Localesignature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Localesignature> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Localesignature =
                    Localesignature(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Localesignature) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.lsUsb.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 16L, value.lsCsbDefault.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 24L, value.lsCsbSupported.toList())
                }
            }
    }
}

public class MappingDataRange internal constructor(
    public var dwStartIndex: UInt,
    public var dwEndIndex: UInt,
    pszDescriptionCtorArg: Pwstr,
    public var dwDescriptionLength: UInt,
    pDataCtorArg: MutPtr,
    public var dwDataSize: UInt,
    pszContentTypeCtorArg: Pwstr,
    prgActionIdsCtorArg: MutPtr,
    public var dwActionsCount: UInt,
    prgActionDisplayNamesCtorArg: MutPtr,
) {
    public var pszDescription: Pwstr = pszDescriptionCtorArg
        internal set

    public var pData: MutPtr = pDataCtorArg
        internal set

    public var pszContentType: Pwstr = pszContentTypeCtorArg
        internal set

    public var prgActionIds: MutPtr = prgActionIdsCtorArg
        internal set

    public var prgActionDisplayNames: MutPtr = prgActionDisplayNamesCtorArg
        internal set

    public constructor() : this(
        dwStartIndex = 0u,
        dwEndIndex = 0u,
        pszDescriptionCtorArg = MutPtr(0L),
        dwDescriptionLength = 0u,
        pDataCtorArg = MutPtr(0L),
        dwDataSize = 0u,
        pszContentTypeCtorArg = MutPtr(0L),
        prgActionIdsCtorArg = MutPtr(0L),
        dwActionsCount = 0u,
        prgActionDisplayNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwStartIndex

    public operator fun component2(): UInt = this.dwEndIndex

    public operator fun component3(): Pwstr = this.pszDescription

    public operator fun component4(): UInt = this.dwDescriptionLength

    public operator fun component5(): MutPtr = this.pData

    public operator fun component6(): UInt = this.dwDataSize

    public operator fun component7(): Pwstr = this.pszContentType

    public operator fun component8(): MutPtr = this.prgActionIds

    public operator fun component9(): UInt = this.dwActionsCount

    public operator fun component10(): MutPtr = this.prgActionDisplayNames

    public fun copy(dwStartIndex: UInt = this.dwStartIndex, dwEndIndex: UInt = this.dwEndIndex, pszDescription: Pwstr = this.pszDescription, dwDescriptionLength: UInt = this.dwDescriptionLength, pData: MutPtr = this.pData, dwDataSize: UInt = this.dwDataSize, pszContentType: Pwstr = this.pszContentType, prgActionIds: MutPtr = this.prgActionIds, dwActionsCount: UInt = this.dwActionsCount, prgActionDisplayNames: MutPtr = this.prgActionDisplayNames): MappingDataRange = MappingDataRange(dwStartIndex = dwStartIndex, dwEndIndex = dwEndIndex, pszDescriptionCtorArg = pszDescription, dwDescriptionLength = dwDescriptionLength, pDataCtorArg = pData, dwDataSize = dwDataSize, pszContentTypeCtorArg = pszContentType, prgActionIdsCtorArg = prgActionIds, dwActionsCount = dwActionsCount, prgActionDisplayNamesCtorArg = prgActionDisplayNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MappingDataRange) return false
        if (this.dwStartIndex != other.dwStartIndex) return false
        if (this.dwEndIndex != other.dwEndIndex) return false
        if (this.pszDescription != other.pszDescription) return false
        if (this.dwDescriptionLength != other.dwDescriptionLength) return false
        if (this.pData != other.pData) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.pszContentType != other.pszContentType) return false
        if (this.prgActionIds != other.prgActionIds) return false
        if (this.dwActionsCount != other.dwActionsCount) return false
        if (this.prgActionDisplayNames != other.prgActionDisplayNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStartIndex.hashCode()
        result = 31 * result + this.dwEndIndex.hashCode()
        result = 31 * result + this.pszDescription.hashCode()
        result = 31 * result + this.dwDescriptionLength.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.pszContentType.hashCode()
        result = 31 * result + this.prgActionIds.hashCode()
        result = 31 * result + this.dwActionsCount.hashCode()
        result = 31 * result + this.prgActionDisplayNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStartIndex: UInt = 0u,
            dwEndIndex: UInt = 0u,
            pszDescription: Pwstr = MutPtr(0L),
            dwDescriptionLength: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
            dwDataSize: UInt = 0u,
            pszContentType: Pwstr = MutPtr(0L),
            prgActionIds: MutPtr = MutPtr(0L),
            dwActionsCount: UInt = 0u,
            prgActionDisplayNames: MutPtr = MutPtr(0L),
        ): MappingDataRange =
            MappingDataRange(
                dwStartIndex = dwStartIndex,
                dwEndIndex = dwEndIndex,
                pszDescriptionCtorArg = pszDescription,
                dwDescriptionLength = dwDescriptionLength,
                pDataCtorArg = pData,
                dwDataSize = dwDataSize,
                pszContentTypeCtorArg = pszContentType,
                prgActionIdsCtorArg = prgActionIds,
                dwActionsCount = dwActionsCount,
                prgActionDisplayNamesCtorArg = prgActionDisplayNames,
            )
    }
}

public class MappingEnumOptions internal constructor(
    public var size: Int,
    pszCategoryCtorArg: Pwstr,
    pszInputLanguageCtorArg: Pwstr,
    pszOutputLanguageCtorArg: Pwstr,
    pszInputScriptCtorArg: Pwstr,
    pszOutputScriptCtorArg: Pwstr,
    pszInputContentTypeCtorArg: Pwstr,
    pszOutputContentTypeCtorArg: Pwstr,
    pGuidCtorArg: MutPtr,
    public var bitfield: UInt,
) {
    public var pszCategory: Pwstr = pszCategoryCtorArg
        internal set

    public var pszInputLanguage: Pwstr = pszInputLanguageCtorArg
        internal set

    public var pszOutputLanguage: Pwstr = pszOutputLanguageCtorArg
        internal set

    public var pszInputScript: Pwstr = pszInputScriptCtorArg
        internal set

    public var pszOutputScript: Pwstr = pszOutputScriptCtorArg
        internal set

    public var pszInputContentType: Pwstr = pszInputContentTypeCtorArg
        internal set

    public var pszOutputContentType: Pwstr = pszOutputContentTypeCtorArg
        internal set

    public var pGuid: MutPtr = pGuidCtorArg
        internal set

    public constructor() : this(
        size = 0,
        pszCategoryCtorArg = MutPtr(0L),
        pszInputLanguageCtorArg = MutPtr(0L),
        pszOutputLanguageCtorArg = MutPtr(0L),
        pszInputScriptCtorArg = MutPtr(0L),
        pszOutputScriptCtorArg = MutPtr(0L),
        pszInputContentTypeCtorArg = MutPtr(0L),
        pszOutputContentTypeCtorArg = MutPtr(0L),
        pGuidCtorArg = MutPtr(0L),
        bitfield = 0u,
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): Pwstr = this.pszCategory

    public operator fun component3(): Pwstr = this.pszInputLanguage

    public operator fun component4(): Pwstr = this.pszOutputLanguage

    public operator fun component5(): Pwstr = this.pszInputScript

    public operator fun component6(): Pwstr = this.pszOutputScript

    public operator fun component7(): Pwstr = this.pszInputContentType

    public operator fun component8(): Pwstr = this.pszOutputContentType

    public operator fun component9(): MutPtr = this.pGuid

    public operator fun component10(): UInt = this.bitfield

    public fun copy(size: Int = this.size, pszCategory: Pwstr = this.pszCategory, pszInputLanguage: Pwstr = this.pszInputLanguage, pszOutputLanguage: Pwstr = this.pszOutputLanguage, pszInputScript: Pwstr = this.pszInputScript, pszOutputScript: Pwstr = this.pszOutputScript, pszInputContentType: Pwstr = this.pszInputContentType, pszOutputContentType: Pwstr = this.pszOutputContentType, pGuid: MutPtr = this.pGuid, bitfield: UInt = this.bitfield): MappingEnumOptions = MappingEnumOptions(size = size, pszCategoryCtorArg = pszCategory, pszInputLanguageCtorArg = pszInputLanguage, pszOutputLanguageCtorArg = pszOutputLanguage, pszInputScriptCtorArg = pszInputScript, pszOutputScriptCtorArg = pszOutputScript, pszInputContentTypeCtorArg = pszInputContentType, pszOutputContentTypeCtorArg = pszOutputContentType, pGuidCtorArg = pGuid, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MappingEnumOptions) return false
        if (this.size != other.size) return false
        if (this.pszCategory != other.pszCategory) return false
        if (this.pszInputLanguage != other.pszInputLanguage) return false
        if (this.pszOutputLanguage != other.pszOutputLanguage) return false
        if (this.pszInputScript != other.pszInputScript) return false
        if (this.pszOutputScript != other.pszOutputScript) return false
        if (this.pszInputContentType != other.pszInputContentType) return false
        if (this.pszOutputContentType != other.pszOutputContentType) return false
        if (this.pGuid != other.pGuid) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.pszCategory.hashCode()
        result = 31 * result + this.pszInputLanguage.hashCode()
        result = 31 * result + this.pszOutputLanguage.hashCode()
        result = 31 * result + this.pszInputScript.hashCode()
        result = 31 * result + this.pszOutputScript.hashCode()
        result = 31 * result + this.pszInputContentType.hashCode()
        result = 31 * result + this.pszOutputContentType.hashCode()
        result = 31 * result + this.pGuid.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            pszCategory: Pwstr = MutPtr(0L),
            pszInputLanguage: Pwstr = MutPtr(0L),
            pszOutputLanguage: Pwstr = MutPtr(0L),
            pszInputScript: Pwstr = MutPtr(0L),
            pszOutputScript: Pwstr = MutPtr(0L),
            pszInputContentType: Pwstr = MutPtr(0L),
            pszOutputContentType: Pwstr = MutPtr(0L),
            pGuid: MutPtr = MutPtr(0L),
            bitfield: UInt = 0u,
        ): MappingEnumOptions =
            MappingEnumOptions(
                size = size,
                pszCategoryCtorArg = pszCategory,
                pszInputLanguageCtorArg = pszInputLanguage,
                pszOutputLanguageCtorArg = pszOutputLanguage,
                pszInputScriptCtorArg = pszInputScript,
                pszOutputScriptCtorArg = pszOutputScript,
                pszInputContentTypeCtorArg = pszInputContentType,
                pszOutputContentTypeCtorArg = pszOutputContentType,
                pGuidCtorArg = pGuid,
                bitfield = bitfield,
            )
    }
}

public class MappingOptions internal constructor(
    public var size: Int,
    pszInputLanguageCtorArg: Pwstr,
    pszOutputLanguageCtorArg: Pwstr,
    pszInputScriptCtorArg: Pwstr,
    pszOutputScriptCtorArg: Pwstr,
    pszInputContentTypeCtorArg: Pwstr,
    pszOutputContentTypeCtorArg: Pwstr,
    pszUILanguageCtorArg: Pwstr,
    public var pfnRecognizeCallback: PfnMappingcallbackproc,
    pRecognizeCallerDataCtorArg: MutPtr,
    public var dwRecognizeCallerDataSize: UInt,
    public var pfnActionCallback: PfnMappingcallbackproc,
    pActionCallerDataCtorArg: MutPtr,
    public var dwActionCallerDataSize: UInt,
    public var dwServiceFlag: UInt,
    public var bitfield: UInt,
) {
    public var pszInputLanguage: Pwstr = pszInputLanguageCtorArg
        internal set

    public var pszOutputLanguage: Pwstr = pszOutputLanguageCtorArg
        internal set

    public var pszInputScript: Pwstr = pszInputScriptCtorArg
        internal set

    public var pszOutputScript: Pwstr = pszOutputScriptCtorArg
        internal set

    public var pszInputContentType: Pwstr = pszInputContentTypeCtorArg
        internal set

    public var pszOutputContentType: Pwstr = pszOutputContentTypeCtorArg
        internal set

    public var pszUILanguage: Pwstr = pszUILanguageCtorArg
        internal set

    public var pRecognizeCallerData: MutPtr = pRecognizeCallerDataCtorArg
        internal set

    public var pActionCallerData: MutPtr = pActionCallerDataCtorArg
        internal set

    public constructor() : this(
        size = 0,
        pszInputLanguageCtorArg = MutPtr(0L),
        pszOutputLanguageCtorArg = MutPtr(0L),
        pszInputScriptCtorArg = MutPtr(0L),
        pszOutputScriptCtorArg = MutPtr(0L),
        pszInputContentTypeCtorArg = MutPtr(0L),
        pszOutputContentTypeCtorArg = MutPtr(0L),
        pszUILanguageCtorArg = MutPtr(0L),
        pfnRecognizeCallback = null,
        pRecognizeCallerDataCtorArg = MutPtr(0L),
        dwRecognizeCallerDataSize = 0u,
        pfnActionCallback = null,
        pActionCallerDataCtorArg = MutPtr(0L),
        dwActionCallerDataSize = 0u,
        dwServiceFlag = 0u,
        bitfield = 0u,
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): Pwstr = this.pszInputLanguage

    public operator fun component3(): Pwstr = this.pszOutputLanguage

    public operator fun component4(): Pwstr = this.pszInputScript

    public operator fun component5(): Pwstr = this.pszOutputScript

    public operator fun component6(): Pwstr = this.pszInputContentType

    public operator fun component7(): Pwstr = this.pszOutputContentType

    public operator fun component8(): Pwstr = this.pszUILanguage

    public operator fun component9(): PfnMappingcallbackproc = this.pfnRecognizeCallback

    public operator fun component10(): MutPtr = this.pRecognizeCallerData

    public operator fun component11(): UInt = this.dwRecognizeCallerDataSize

    public operator fun component12(): PfnMappingcallbackproc = this.pfnActionCallback

    public operator fun component13(): MutPtr = this.pActionCallerData

    public operator fun component14(): UInt = this.dwActionCallerDataSize

    public operator fun component15(): UInt = this.dwServiceFlag

    public operator fun component16(): UInt = this.bitfield

    public fun copy(size: Int = this.size, pszInputLanguage: Pwstr = this.pszInputLanguage, pszOutputLanguage: Pwstr = this.pszOutputLanguage, pszInputScript: Pwstr = this.pszInputScript, pszOutputScript: Pwstr = this.pszOutputScript, pszInputContentType: Pwstr = this.pszInputContentType, pszOutputContentType: Pwstr = this.pszOutputContentType, pszUILanguage: Pwstr = this.pszUILanguage, pfnRecognizeCallback: PfnMappingcallbackproc = this.pfnRecognizeCallback, pRecognizeCallerData: MutPtr = this.pRecognizeCallerData, dwRecognizeCallerDataSize: UInt = this.dwRecognizeCallerDataSize, pfnActionCallback: PfnMappingcallbackproc = this.pfnActionCallback, pActionCallerData: MutPtr = this.pActionCallerData, dwActionCallerDataSize: UInt = this.dwActionCallerDataSize, dwServiceFlag: UInt = this.dwServiceFlag, bitfield: UInt = this.bitfield): MappingOptions = MappingOptions(size = size, pszInputLanguageCtorArg = pszInputLanguage, pszOutputLanguageCtorArg = pszOutputLanguage, pszInputScriptCtorArg = pszInputScript, pszOutputScriptCtorArg = pszOutputScript, pszInputContentTypeCtorArg = pszInputContentType, pszOutputContentTypeCtorArg = pszOutputContentType, pszUILanguageCtorArg = pszUILanguage, pfnRecognizeCallback = pfnRecognizeCallback, pRecognizeCallerDataCtorArg = pRecognizeCallerData, dwRecognizeCallerDataSize = dwRecognizeCallerDataSize, pfnActionCallback = pfnActionCallback, pActionCallerDataCtorArg = pActionCallerData, dwActionCallerDataSize = dwActionCallerDataSize, dwServiceFlag = dwServiceFlag, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MappingOptions) return false
        if (this.size != other.size) return false
        if (this.pszInputLanguage != other.pszInputLanguage) return false
        if (this.pszOutputLanguage != other.pszOutputLanguage) return false
        if (this.pszInputScript != other.pszInputScript) return false
        if (this.pszOutputScript != other.pszOutputScript) return false
        if (this.pszInputContentType != other.pszInputContentType) return false
        if (this.pszOutputContentType != other.pszOutputContentType) return false
        if (this.pszUILanguage != other.pszUILanguage) return false
        if (this.pfnRecognizeCallback != other.pfnRecognizeCallback) return false
        if (this.pRecognizeCallerData != other.pRecognizeCallerData) return false
        if (this.dwRecognizeCallerDataSize != other.dwRecognizeCallerDataSize) return false
        if (this.pfnActionCallback != other.pfnActionCallback) return false
        if (this.pActionCallerData != other.pActionCallerData) return false
        if (this.dwActionCallerDataSize != other.dwActionCallerDataSize) return false
        if (this.dwServiceFlag != other.dwServiceFlag) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.pszInputLanguage.hashCode()
        result = 31 * result + this.pszOutputLanguage.hashCode()
        result = 31 * result + this.pszInputScript.hashCode()
        result = 31 * result + this.pszOutputScript.hashCode()
        result = 31 * result + this.pszInputContentType.hashCode()
        result = 31 * result + this.pszOutputContentType.hashCode()
        result = 31 * result + this.pszUILanguage.hashCode()
        result = 31 * result + this.pfnRecognizeCallback.hashCode()
        result = 31 * result + this.pRecognizeCallerData.hashCode()
        result = 31 * result + this.dwRecognizeCallerDataSize.hashCode()
        result = 31 * result + this.pfnActionCallback.hashCode()
        result = 31 * result + this.pActionCallerData.hashCode()
        result = 31 * result + this.dwActionCallerDataSize.hashCode()
        result = 31 * result + this.dwServiceFlag.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            pszInputLanguage: Pwstr = MutPtr(0L),
            pszOutputLanguage: Pwstr = MutPtr(0L),
            pszInputScript: Pwstr = MutPtr(0L),
            pszOutputScript: Pwstr = MutPtr(0L),
            pszInputContentType: Pwstr = MutPtr(0L),
            pszOutputContentType: Pwstr = MutPtr(0L),
            pszUILanguage: Pwstr = MutPtr(0L),
            pfnRecognizeCallback: PfnMappingcallbackproc = null,
            pRecognizeCallerData: MutPtr = MutPtr(0L),
            dwRecognizeCallerDataSize: UInt = 0u,
            pfnActionCallback: PfnMappingcallbackproc = null,
            pActionCallerData: MutPtr = MutPtr(0L),
            dwActionCallerDataSize: UInt = 0u,
            dwServiceFlag: UInt = 0u,
            bitfield: UInt = 0u,
        ): MappingOptions =
            MappingOptions(
                size = size,
                pszInputLanguageCtorArg = pszInputLanguage,
                pszOutputLanguageCtorArg = pszOutputLanguage,
                pszInputScriptCtorArg = pszInputScript,
                pszOutputScriptCtorArg = pszOutputScript,
                pszInputContentTypeCtorArg = pszInputContentType,
                pszOutputContentTypeCtorArg = pszOutputContentType,
                pszUILanguageCtorArg = pszUILanguage,
                pfnRecognizeCallback = pfnRecognizeCallback,
                pRecognizeCallerDataCtorArg = pRecognizeCallerData,
                dwRecognizeCallerDataSize = dwRecognizeCallerDataSize,
                pfnActionCallback = pfnActionCallback,
                pActionCallerDataCtorArg = pActionCallerData,
                dwActionCallerDataSize = dwActionCallerDataSize,
                dwServiceFlag = dwServiceFlag,
                bitfield = bitfield,
            )
    }
}

public class MappingPropertyBag internal constructor(
    public var size: Int,
    prgResultRangesCtorArg: MutPtr,
    public var dwRangesCount: UInt,
    pServiceDataCtorArg: MutPtr,
    public var dwServiceDataSize: UInt,
    pCallerDataCtorArg: MutPtr,
    public var dwCallerDataSize: UInt,
    pContextCtorArg: MutPtr,
) {
    public var prgResultRanges: MutPtr = prgResultRangesCtorArg
        internal set

    public var pServiceData: MutPtr = pServiceDataCtorArg
        internal set

    public var pCallerData: MutPtr = pCallerDataCtorArg
        internal set

    public var pContext: MutPtr = pContextCtorArg
        internal set

    public constructor() : this(
        size = 0,
        prgResultRangesCtorArg = MutPtr(0L),
        dwRangesCount = 0u,
        pServiceDataCtorArg = MutPtr(0L),
        dwServiceDataSize = 0u,
        pCallerDataCtorArg = MutPtr(0L),
        dwCallerDataSize = 0u,
        pContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): MutPtr = this.prgResultRanges

    public operator fun component3(): UInt = this.dwRangesCount

    public operator fun component4(): MutPtr = this.pServiceData

    public operator fun component5(): UInt = this.dwServiceDataSize

    public operator fun component6(): MutPtr = this.pCallerData

    public operator fun component7(): UInt = this.dwCallerDataSize

    public operator fun component8(): MutPtr = this.pContext

    public fun copy(size: Int = this.size, prgResultRanges: MutPtr = this.prgResultRanges, dwRangesCount: UInt = this.dwRangesCount, pServiceData: MutPtr = this.pServiceData, dwServiceDataSize: UInt = this.dwServiceDataSize, pCallerData: MutPtr = this.pCallerData, dwCallerDataSize: UInt = this.dwCallerDataSize, pContext: MutPtr = this.pContext): MappingPropertyBag = MappingPropertyBag(size = size, prgResultRangesCtorArg = prgResultRanges, dwRangesCount = dwRangesCount, pServiceDataCtorArg = pServiceData, dwServiceDataSize = dwServiceDataSize, pCallerDataCtorArg = pCallerData, dwCallerDataSize = dwCallerDataSize, pContextCtorArg = pContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MappingPropertyBag) return false
        if (this.size != other.size) return false
        if (this.prgResultRanges != other.prgResultRanges) return false
        if (this.dwRangesCount != other.dwRangesCount) return false
        if (this.pServiceData != other.pServiceData) return false
        if (this.dwServiceDataSize != other.dwServiceDataSize) return false
        if (this.pCallerData != other.pCallerData) return false
        if (this.dwCallerDataSize != other.dwCallerDataSize) return false
        if (this.pContext != other.pContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.prgResultRanges.hashCode()
        result = 31 * result + this.dwRangesCount.hashCode()
        result = 31 * result + this.pServiceData.hashCode()
        result = 31 * result + this.dwServiceDataSize.hashCode()
        result = 31 * result + this.pCallerData.hashCode()
        result = 31 * result + this.dwCallerDataSize.hashCode()
        result = 31 * result + this.pContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MappingPropertyBag> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MappingPropertyBag> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MappingPropertyBag =
                    MappingPropertyBag(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MappingPropertyBag) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.prgResultRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRangesCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pServiceData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwServiceDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pCallerData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwCallerDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.pContext)
                }
            }

        public operator fun invoke(
            size: Int = 0,
            prgResultRanges: MutPtr = MutPtr(0L),
            dwRangesCount: UInt = 0u,
            pServiceData: MutPtr = MutPtr(0L),
            dwServiceDataSize: UInt = 0u,
            pCallerData: MutPtr = MutPtr(0L),
            dwCallerDataSize: UInt = 0u,
            pContext: MutPtr = MutPtr(0L),
        ): MappingPropertyBag =
            MappingPropertyBag(
                size = size,
                prgResultRangesCtorArg = prgResultRanges,
                dwRangesCount = dwRangesCount,
                pServiceDataCtorArg = pServiceData,
                dwServiceDataSize = dwServiceDataSize,
                pCallerDataCtorArg = pCallerData,
                dwCallerDataSize = dwCallerDataSize,
                pContextCtorArg = pContext,
            )
    }
}

public class MappingServiceInfo internal constructor(
    public var size: Int,
    pszCopyrightCtorArg: Pwstr,
    public var wMajorVersion: UShort,
    public var wMinorVersion: UShort,
    public var wBuildVersion: UShort,
    public var wStepVersion: UShort,
    public var dwInputContentTypesCount: UInt,
    prgInputContentTypesCtorArg: MutPtr,
    public var dwOutputContentTypesCount: UInt,
    prgOutputContentTypesCtorArg: MutPtr,
    public var dwInputLanguagesCount: UInt,
    prgInputLanguagesCtorArg: MutPtr,
    public var dwOutputLanguagesCount: UInt,
    prgOutputLanguagesCtorArg: MutPtr,
    public var dwInputScriptsCount: UInt,
    prgInputScriptsCtorArg: MutPtr,
    public var dwOutputScriptsCount: UInt,
    prgOutputScriptsCtorArg: MutPtr,
    public var guid: Guid,
    pszCategoryCtorArg: Pwstr,
    pszDescriptionCtorArg: Pwstr,
    public var dwPrivateDataSize: UInt,
    pPrivateDataCtorArg: MutPtr,
    pContextCtorArg: MutPtr,
    public var bitfield: UInt,
) {
    public var pszCopyright: Pwstr = pszCopyrightCtorArg
        internal set

    public var prgInputContentTypes: MutPtr = prgInputContentTypesCtorArg
        internal set

    public var prgOutputContentTypes: MutPtr = prgOutputContentTypesCtorArg
        internal set

    public var prgInputLanguages: MutPtr = prgInputLanguagesCtorArg
        internal set

    public var prgOutputLanguages: MutPtr = prgOutputLanguagesCtorArg
        internal set

    public var prgInputScripts: MutPtr = prgInputScriptsCtorArg
        internal set

    public var prgOutputScripts: MutPtr = prgOutputScriptsCtorArg
        internal set

    public var pszCategory: Pwstr = pszCategoryCtorArg
        internal set

    public var pszDescription: Pwstr = pszDescriptionCtorArg
        internal set

    public var pPrivateData: MutPtr = pPrivateDataCtorArg
        internal set

    public var pContext: MutPtr = pContextCtorArg
        internal set

    public constructor() : this(
        size = 0,
        pszCopyrightCtorArg = MutPtr(0L),
        wMajorVersion = 0u,
        wMinorVersion = 0u,
        wBuildVersion = 0u,
        wStepVersion = 0u,
        dwInputContentTypesCount = 0u,
        prgInputContentTypesCtorArg = MutPtr(0L),
        dwOutputContentTypesCount = 0u,
        prgOutputContentTypesCtorArg = MutPtr(0L),
        dwInputLanguagesCount = 0u,
        prgInputLanguagesCtorArg = MutPtr(0L),
        dwOutputLanguagesCount = 0u,
        prgOutputLanguagesCtorArg = MutPtr(0L),
        dwInputScriptsCount = 0u,
        prgInputScriptsCtorArg = MutPtr(0L),
        dwOutputScriptsCount = 0u,
        prgOutputScriptsCtorArg = MutPtr(0L),
        guid = Guid(),
        pszCategoryCtorArg = MutPtr(0L),
        pszDescriptionCtorArg = MutPtr(0L),
        dwPrivateDataSize = 0u,
        pPrivateDataCtorArg = MutPtr(0L),
        pContextCtorArg = MutPtr(0L),
        bitfield = 0u,
    )

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            pszCopyright: Pwstr = MutPtr(0L),
            wMajorVersion: UShort = 0u,
            wMinorVersion: UShort = 0u,
            wBuildVersion: UShort = 0u,
            wStepVersion: UShort = 0u,
            dwInputContentTypesCount: UInt = 0u,
            prgInputContentTypes: MutPtr = MutPtr(0L),
            dwOutputContentTypesCount: UInt = 0u,
            prgOutputContentTypes: MutPtr = MutPtr(0L),
            dwInputLanguagesCount: UInt = 0u,
            prgInputLanguages: MutPtr = MutPtr(0L),
            dwOutputLanguagesCount: UInt = 0u,
            prgOutputLanguages: MutPtr = MutPtr(0L),
            dwInputScriptsCount: UInt = 0u,
            prgInputScripts: MutPtr = MutPtr(0L),
            dwOutputScriptsCount: UInt = 0u,
            prgOutputScripts: MutPtr = MutPtr(0L),
            guid: Guid = Guid(),
            pszCategory: Pwstr = MutPtr(0L),
            pszDescription: Pwstr = MutPtr(0L),
            dwPrivateDataSize: UInt = 0u,
            pPrivateData: MutPtr = MutPtr(0L),
            pContext: MutPtr = MutPtr(0L),
            bitfield: UInt = 0u,
        ): MappingServiceInfo =
            MappingServiceInfo(
                size = size,
                pszCopyrightCtorArg = pszCopyright,
                wMajorVersion = wMajorVersion,
                wMinorVersion = wMinorVersion,
                wBuildVersion = wBuildVersion,
                wStepVersion = wStepVersion,
                dwInputContentTypesCount = dwInputContentTypesCount,
                prgInputContentTypesCtorArg = prgInputContentTypes,
                dwOutputContentTypesCount = dwOutputContentTypesCount,
                prgOutputContentTypesCtorArg = prgOutputContentTypes,
                dwInputLanguagesCount = dwInputLanguagesCount,
                prgInputLanguagesCtorArg = prgInputLanguages,
                dwOutputLanguagesCount = dwOutputLanguagesCount,
                prgOutputLanguagesCtorArg = prgOutputLanguages,
                dwInputScriptsCount = dwInputScriptsCount,
                prgInputScriptsCtorArg = prgInputScripts,
                dwOutputScriptsCount = dwOutputScriptsCount,
                prgOutputScriptsCtorArg = prgOutputScripts,
                guid = guid,
                pszCategoryCtorArg = pszCategory,
                pszDescriptionCtorArg = pszDescription,
                dwPrivateDataSize = dwPrivateDataSize,
                pPrivateDataCtorArg = pPrivateData,
                pContextCtorArg = pContext,
                bitfield = bitfield,
            )
    }
}

public data class Mimecpinfo(
    public var dwFlags: UInt = 0u,
    public var uiCodePage: UInt = 0u,
    public var uiFamilyCodePage: UInt = 0u,
    public var wszDescription: UShortArray = UShortArray(64),
    public var wszWebCharset: UShortArray = UShortArray(50),
    public var wszHeaderCharset: UShortArray = UShortArray(50),
    public var wszBodyCharset: UShortArray = UShortArray(50),
    public var wszFixedWidthFont: UShortArray = UShortArray(32),
    public var wszProportionalFont: UShortArray = UShortArray(32),
    public var bGDICharset: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mimecpinfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (this.uiFamilyCodePage != other.uiFamilyCodePage) return false
        if (!this.wszDescription.contentEquals(other.wszDescription)) return false
        if (!this.wszWebCharset.contentEquals(other.wszWebCharset)) return false
        if (!this.wszHeaderCharset.contentEquals(other.wszHeaderCharset)) return false
        if (!this.wszBodyCharset.contentEquals(other.wszBodyCharset)) return false
        if (!this.wszFixedWidthFont.contentEquals(other.wszFixedWidthFont)) return false
        if (!this.wszProportionalFont.contentEquals(other.wszProportionalFont)) return false
        if (this.bGDICharset != other.bGDICharset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.uiCodePage.hashCode()
        result = 31 * result + this.uiFamilyCodePage.hashCode()
        result = 31 * result + this.wszDescription.contentHashCode()
        result = 31 * result + this.wszWebCharset.contentHashCode()
        result = 31 * result + this.wszHeaderCharset.contentHashCode()
        result = 31 * result + this.wszBodyCharset.contentHashCode()
        result = 31 * result + this.wszFixedWidthFont.contentHashCode()
        result = 31 * result + this.wszProportionalFont.contentHashCode()
        result = 31 * result + this.bGDICharset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mimecpinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mimecpinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 572L
                override fun readNative(addr: Long): Mimecpinfo =
                    Mimecpinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                        ).readNative(addr + 140L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                        ).readNative(addr + 240L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                        ).readNative(addr + 340L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 440L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 504L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 568L),
                    )
                override fun writeNative(addr: Long, value: Mimecpinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uiCodePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uiFamilyCodePage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 12L, value.wszDescription.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                    ).writeNative(addr + 140L, value.wszWebCharset.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                    ).writeNative(addr + 240L, value.wszHeaderCharset.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                    ).writeNative(addr + 340L, value.wszBodyCharset.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 440L, value.wszFixedWidthFont.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 504L, value.wszProportionalFont.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 568L, value.bGDICharset)
                }
            }
    }
}

public data class Mimecsetinfo(
    public var uiCodePage: UInt = 0u,
    public var uiInternetEncoding: UInt = 0u,
    public var wszCharset: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mimecsetinfo) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (this.uiInternetEncoding != other.uiInternetEncoding) return false
        if (!this.wszCharset.contentEquals(other.wszCharset)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uiCodePage.hashCode()
        result = 31 * result + this.uiInternetEncoding.hashCode()
        result = 31 * result + this.wszCharset.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mimecsetinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mimecsetinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 108L
                override fun readNative(addr: Long): Mimecsetinfo =
                    Mimecsetinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Mimecsetinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uiCodePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uiInternetEncoding)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                    ).writeNative(addr + 8L, value.wszCharset.toList())
                }
            }
    }
}

public data class Newtextmetricexa(
    public var ntmTm: Newtextmetrica = Newtextmetrica(),
    public var ntmFontSig: Fontsignature = Fontsignature(),
)

public data class Newtextmetricexw(
    public var ntmTm: Newtextmetricw = Newtextmetricw(),
    public var ntmFontSig: Fontsignature = Fontsignature(),
)

public data class Nlsversioninfo(
    public var dwNLSVersionInfoSize: UInt = 0u,
    public var dwNLSVersion: UInt = 0u,
    public var dwDefinedVersion: UInt = 0u,
    public var dwEffectiveId: UInt = 0u,
    public var guidCustomVersion: Guid = Guid(),
)

public data class Nlsversioninfoex(
    public var dwNLSVersionInfoSize: UInt = 0u,
    public var dwNLSVersion: UInt = 0u,
    public var dwDefinedVersion: UInt = 0u,
    public var dwEffectiveId: UInt = 0u,
    public var guidCustomVersion: Guid = Guid(),
)

public class Numberfmta internal constructor(
    public var numDigits: UInt,
    public var leadingZero: UInt,
    public var grouping: UInt,
    lpDecimalSepCtorArg: Pstr,
    lpThousandSepCtorArg: Pstr,
    public var negativeOrder: UInt,
) {
    public var lpDecimalSep: Pstr = lpDecimalSepCtorArg
        internal set

    public var lpThousandSep: Pstr = lpThousandSepCtorArg
        internal set

    public constructor() : this(
        numDigits = 0u,
        leadingZero = 0u,
        grouping = 0u,
        lpDecimalSepCtorArg = MutPtr(0L),
        lpThousandSepCtorArg = MutPtr(0L),
        negativeOrder = 0u,
    )

    public operator fun component1(): UInt = this.numDigits

    public operator fun component2(): UInt = this.leadingZero

    public operator fun component3(): UInt = this.grouping

    public operator fun component4(): Pstr = this.lpDecimalSep

    public operator fun component5(): Pstr = this.lpThousandSep

    public operator fun component6(): UInt = this.negativeOrder

    public fun copy(numDigits: UInt = this.numDigits, leadingZero: UInt = this.leadingZero, grouping: UInt = this.grouping, lpDecimalSep: Pstr = this.lpDecimalSep, lpThousandSep: Pstr = this.lpThousandSep, negativeOrder: UInt = this.negativeOrder): Numberfmta = Numberfmta(numDigits = numDigits, leadingZero = leadingZero, grouping = grouping, lpDecimalSepCtorArg = lpDecimalSep, lpThousandSepCtorArg = lpThousandSep, negativeOrder = negativeOrder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Numberfmta) return false
        if (this.numDigits != other.numDigits) return false
        if (this.leadingZero != other.leadingZero) return false
        if (this.grouping != other.grouping) return false
        if (this.lpDecimalSep != other.lpDecimalSep) return false
        if (this.lpThousandSep != other.lpThousandSep) return false
        if (this.negativeOrder != other.negativeOrder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numDigits.hashCode()
        result = 31 * result + this.leadingZero.hashCode()
        result = 31 * result + this.grouping.hashCode()
        result = 31 * result + this.lpDecimalSep.hashCode()
        result = 31 * result + this.lpThousandSep.hashCode()
        result = 31 * result + this.negativeOrder.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            numDigits: UInt = 0u,
            leadingZero: UInt = 0u,
            grouping: UInt = 0u,
            lpDecimalSep: Pstr = MutPtr(0L),
            lpThousandSep: Pstr = MutPtr(0L),
            negativeOrder: UInt = 0u,
        ): Numberfmta =
            Numberfmta(
                numDigits = numDigits,
                leadingZero = leadingZero,
                grouping = grouping,
                lpDecimalSepCtorArg = lpDecimalSep,
                lpThousandSepCtorArg = lpThousandSep,
                negativeOrder = negativeOrder,
            )
    }
}

public class Numberfmtw internal constructor(
    public var numDigits: UInt,
    public var leadingZero: UInt,
    public var grouping: UInt,
    lpDecimalSepCtorArg: Pwstr,
    lpThousandSepCtorArg: Pwstr,
    public var negativeOrder: UInt,
) {
    public var lpDecimalSep: Pwstr = lpDecimalSepCtorArg
        internal set

    public var lpThousandSep: Pwstr = lpThousandSepCtorArg
        internal set

    public constructor() : this(
        numDigits = 0u,
        leadingZero = 0u,
        grouping = 0u,
        lpDecimalSepCtorArg = MutPtr(0L),
        lpThousandSepCtorArg = MutPtr(0L),
        negativeOrder = 0u,
    )

    public operator fun component1(): UInt = this.numDigits

    public operator fun component2(): UInt = this.leadingZero

    public operator fun component3(): UInt = this.grouping

    public operator fun component4(): Pwstr = this.lpDecimalSep

    public operator fun component5(): Pwstr = this.lpThousandSep

    public operator fun component6(): UInt = this.negativeOrder

    public fun copy(numDigits: UInt = this.numDigits, leadingZero: UInt = this.leadingZero, grouping: UInt = this.grouping, lpDecimalSep: Pwstr = this.lpDecimalSep, lpThousandSep: Pwstr = this.lpThousandSep, negativeOrder: UInt = this.negativeOrder): Numberfmtw = Numberfmtw(numDigits = numDigits, leadingZero = leadingZero, grouping = grouping, lpDecimalSepCtorArg = lpDecimalSep, lpThousandSepCtorArg = lpThousandSep, negativeOrder = negativeOrder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Numberfmtw) return false
        if (this.numDigits != other.numDigits) return false
        if (this.leadingZero != other.leadingZero) return false
        if (this.grouping != other.grouping) return false
        if (this.lpDecimalSep != other.lpDecimalSep) return false
        if (this.lpThousandSep != other.lpThousandSep) return false
        if (this.negativeOrder != other.negativeOrder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numDigits.hashCode()
        result = 31 * result + this.leadingZero.hashCode()
        result = 31 * result + this.grouping.hashCode()
        result = 31 * result + this.lpDecimalSep.hashCode()
        result = 31 * result + this.lpThousandSep.hashCode()
        result = 31 * result + this.negativeOrder.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            numDigits: UInt = 0u,
            leadingZero: UInt = 0u,
            grouping: UInt = 0u,
            lpDecimalSep: Pwstr = MutPtr(0L),
            lpThousandSep: Pwstr = MutPtr(0L),
            negativeOrder: UInt = 0u,
        ): Numberfmtw =
            Numberfmtw(
                numDigits = numDigits,
                leadingZero = leadingZero,
                grouping = grouping,
                lpDecimalSepCtorArg = lpDecimalSep,
                lpThousandSepCtorArg = lpThousandSep,
                negativeOrder = negativeOrder,
            )
    }
}

public data class OpentypeFeatureRecord(
    public var tagFeature: UInt = 0u,
    public var lParameter: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpentypeFeatureRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpentypeFeatureRecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): OpentypeFeatureRecord =
                    OpentypeFeatureRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OpentypeFeatureRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tagFeature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lParameter)
                }
            }
    }
}

public data class Rfc1766info(
    public var lcid: UInt = 0u,
    public var wszRfc1766: UShortArray = UShortArray(6),
    public var wszLocaleName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rfc1766info) return false
        if (this.lcid != other.lcid) return false
        if (!this.wszRfc1766.contentEquals(other.wszRfc1766)) return false
        if (!this.wszLocaleName.contentEquals(other.wszLocaleName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcid.hashCode()
        result = 31 * result + this.wszRfc1766.contentHashCode()
        result = 31 * result + this.wszLocaleName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rfc1766info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rfc1766info> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Rfc1766info =
                    Rfc1766info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (6).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rfc1766info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lcid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (6).toInt())
                    ).writeNative(addr + 4L, value.wszRfc1766.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 16L, value.wszLocaleName.toList())
                }
            }
    }
}

public data class Scriptfontinfo(
    public var scripts: Long = 0L,
    public var wszFont: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scriptfontinfo) return false
        if (this.scripts != other.scripts) return false
        if (!this.wszFont.contentEquals(other.wszFont)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scripts.hashCode()
        result = 31 * result + this.wszFont.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Scriptfontinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Scriptfontinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Scriptfontinfo =
                    Scriptfontinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Scriptfontinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.scripts)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 8L, value.wszFont.toList())
                }
            }
    }
}

public data class Scriptinfo(
    public var scriptId: UByte = 0u,
    public var uiCodePage: UInt = 0u,
    public var wszDescription: UShortArray = UShortArray(48),
    public var wszFixedWidthFont: UShortArray = UShortArray(32),
    public var wszProportionalFont: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scriptinfo) return false
        if (this.scriptId != other.scriptId) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (!this.wszDescription.contentEquals(other.wszDescription)) return false
        if (!this.wszFixedWidthFont.contentEquals(other.wszFixedWidthFont)) return false
        if (!this.wszProportionalFont.contentEquals(other.wszProportionalFont)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scriptId.hashCode()
        result = 31 * result + this.uiCodePage.hashCode()
        result = 31 * result + this.wszDescription.contentHashCode()
        result = 31 * result + this.wszFixedWidthFont.contentHashCode()
        result = 31 * result + this.wszProportionalFont.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Scriptinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Scriptinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 232L
                override fun readNative(addr: Long): Scriptinfo =
                    Scriptinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 104L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 168L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Scriptinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.scriptId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uiCodePage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (48).toInt())
                    ).writeNative(addr + 8L, value.wszDescription.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 104L, value.wszFixedWidthFont.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 168L, value.wszProportionalFont.toList())
                }
            }
    }
}

public data class ScriptAnalysis(
    public var bitfield: UShort = 0u,
    public var s: ScriptState = ScriptState(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptAnalysis> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptAnalysis> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ScriptAnalysis =
                    ScriptAnalysis(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (ScriptState.typeLayout()).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ScriptAnalysis) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (ScriptState.typeLayout()).writeNative(addr + 2L, value.s)
                }
            }
    }
}

public data class ScriptCharprop(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptCharprop> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptCharprop> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ScriptCharprop =
                    ScriptCharprop(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptCharprop) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ScriptControl(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptControl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ScriptControl =
                    ScriptControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ScriptDigitsubstitute(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDigitsubstitute> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptDigitsubstitute> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScriptDigitsubstitute =
                    ScriptDigitsubstitute(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScriptDigitsubstitute) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwReserved)
                }
            }
    }
}

public data class ScriptFontproperties(
    public var cBytes: Int = 0,
    public var wgBlank: UShort = 0u,
    public var wgDefault: UShort = 0u,
    public var wgInvalid: UShort = 0u,
    public var wgKashida: UShort = 0u,
    public var iKashidaWidth: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptFontproperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptFontproperties> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScriptFontproperties =
                    ScriptFontproperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScriptFontproperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wgBlank)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wgDefault)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wgInvalid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wgKashida)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.iKashidaWidth)
                }
            }
    }
}

public data class ScriptGlyphprop(
    public var sva: ScriptVisattr = ScriptVisattr(),
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptGlyphprop> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptGlyphprop> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ScriptGlyphprop =
                    ScriptGlyphprop(
                        (ScriptVisattr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ScriptGlyphprop) {
                    (ScriptVisattr.typeLayout()).writeNative(addr, value.sva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class ScriptItem(
    public var iCharPos: Int = 0,
    public var a: ScriptAnalysis = ScriptAnalysis(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptItem> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScriptItem =
                    ScriptItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (ScriptAnalysis.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScriptItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iCharPos)
                    (ScriptAnalysis.typeLayout()).writeNative(addr + 4L, value.a)
                }
            }
    }
}

public data class ScriptLogattr(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptLogattr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptLogattr> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): ScriptLogattr =
                    ScriptLogattr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptLogattr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ScriptProperties(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptProperties> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScriptProperties =
                    ScriptProperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScriptProperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield2)
                }
            }
    }
}

public data class ScriptState(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptState> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ScriptState =
                    ScriptState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class ScriptTabdef internal constructor(
    public var cTabStops: Int,
    public var iScale: Int,
    pTabStopsCtorArg: MutPtr,
    public var iTabOrigin: Int,
) {
    public var pTabStops: MutPtr = pTabStopsCtorArg
        internal set

    public constructor() : this(
        cTabStops = 0,
        iScale = 0,
        pTabStopsCtorArg = MutPtr(0L),
        iTabOrigin = 0,
    )

    public operator fun component1(): Int = this.cTabStops

    public operator fun component2(): Int = this.iScale

    public operator fun component3(): MutPtr = this.pTabStops

    public operator fun component4(): Int = this.iTabOrigin

    public fun copy(cTabStops: Int = this.cTabStops, iScale: Int = this.iScale, pTabStops: MutPtr = this.pTabStops, iTabOrigin: Int = this.iTabOrigin): ScriptTabdef = ScriptTabdef(cTabStops = cTabStops, iScale = iScale, pTabStopsCtorArg = pTabStops, iTabOrigin = iTabOrigin)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScriptTabdef) return false
        if (this.cTabStops != other.cTabStops) return false
        if (this.iScale != other.iScale) return false
        if (this.pTabStops != other.pTabStops) return false
        if (this.iTabOrigin != other.iTabOrigin) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cTabStops.hashCode()
        result = 31 * result + this.iScale.hashCode()
        result = 31 * result + this.pTabStops.hashCode()
        result = 31 * result + this.iTabOrigin.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptTabdef> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptTabdef> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ScriptTabdef =
                    ScriptTabdef(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ScriptTabdef) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cTabStops)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iScale)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pTabStops)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.iTabOrigin)
                }
            }

        public operator fun invoke(
            cTabStops: Int = 0,
            iScale: Int = 0,
            pTabStops: MutPtr = MutPtr(0L),
            iTabOrigin: Int = 0,
        ): ScriptTabdef =
            ScriptTabdef(
                cTabStops = cTabStops,
                iScale = iScale,
                pTabStopsCtorArg = pTabStops,
                iTabOrigin = iTabOrigin,
            )
    }
}

public data class ScriptVisattr(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptVisattr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScriptVisattr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ScriptVisattr =
                    ScriptVisattr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScriptVisattr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class TextrangeProperties internal constructor(
    potfRecordsCtorArg: MutPtr,
    public var cotfRecords: Int,
) {
    public var potfRecords: MutPtr = potfRecordsCtorArg
        internal set

    public constructor() : this(
        potfRecordsCtorArg = MutPtr(0L),
        cotfRecords = 0,
    )

    public operator fun component1(): MutPtr = this.potfRecords

    public operator fun component2(): Int = this.cotfRecords

    public fun copy(potfRecords: MutPtr = this.potfRecords, cotfRecords: Int = this.cotfRecords): TextrangeProperties = TextrangeProperties(potfRecordsCtorArg = potfRecords, cotfRecords = cotfRecords)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TextrangeProperties) return false
        if (this.potfRecords != other.potfRecords) return false
        if (this.cotfRecords != other.cotfRecords) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.potfRecords.hashCode()
        result = 31 * result + this.cotfRecords.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TextrangeProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TextrangeProperties> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TextrangeProperties =
                    TextrangeProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TextrangeProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.potfRecords)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cotfRecords)
                }
            }

        public operator fun invoke(
            potfRecords: MutPtr = MutPtr(0L),
            cotfRecords: Int = 0,
        ): TextrangeProperties =
            TextrangeProperties(
                potfRecordsCtorArg = potfRecords,
                cotfRecords = cotfRecords,
            )
    }
}

public class UCPTrie internal constructor(
    indexCtorArg: ConstPtr,
    public var data: UCPTrieData,
    public var indexLength: Int,
    public var dataLength: Int,
    public var highStart: Int,
    public var shifted12HighStart: UShort,
    public var type: Byte,
    public var valueWidth: Byte,
    public var reserved32: UInt,
    public var reserved16: UShort,
    public var index3NullOffset: UShort,
    public var dataNullOffset: Int,
    public var nullValue: UInt,
) {
    public var index: ConstPtr = indexCtorArg
        internal set

    public constructor() : this(
        indexCtorArg = ConstPtr(0L),
        data = UCPTrieData(),
        indexLength = 0,
        dataLength = 0,
        highStart = 0,
        shifted12HighStart = 0u,
        type = 0,
        valueWidth = 0,
        reserved32 = 0u,
        reserved16 = 0u,
        index3NullOffset = 0u,
        dataNullOffset = 0,
        nullValue = 0u,
    )

    public operator fun component1(): ConstPtr = this.index

    public operator fun component2(): UCPTrieData = this.data

    public operator fun component3(): Int = this.indexLength

    public operator fun component4(): Int = this.dataLength

    public operator fun component5(): Int = this.highStart

    public operator fun component6(): UShort = this.shifted12HighStart

    public operator fun component7(): Byte = this.type

    public operator fun component8(): Byte = this.valueWidth

    public operator fun component9(): UInt = this.reserved32

    public operator fun component10(): UShort = this.reserved16

    public operator fun component11(): UShort = this.index3NullOffset

    public operator fun component12(): Int = this.dataNullOffset

    public operator fun component13(): UInt = this.nullValue

    public fun copy(index: ConstPtr = this.index, data: UCPTrieData = this.data, indexLength: Int = this.indexLength, dataLength: Int = this.dataLength, highStart: Int = this.highStart, shifted12HighStart: UShort = this.shifted12HighStart, type: Byte = this.type, valueWidth: Byte = this.valueWidth, reserved32: UInt = this.reserved32, reserved16: UShort = this.reserved16, index3NullOffset: UShort = this.index3NullOffset, dataNullOffset: Int = this.dataNullOffset, nullValue: UInt = this.nullValue): UCPTrie = UCPTrie(indexCtorArg = index, data = data, indexLength = indexLength, dataLength = dataLength, highStart = highStart, shifted12HighStart = shifted12HighStart, type = type, valueWidth = valueWidth, reserved32 = reserved32, reserved16 = reserved16, index3NullOffset = index3NullOffset, dataNullOffset = dataNullOffset, nullValue = nullValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UCPTrie) return false
        if (this.index != other.index) return false
        if (this.data != other.data) return false
        if (this.indexLength != other.indexLength) return false
        if (this.dataLength != other.dataLength) return false
        if (this.highStart != other.highStart) return false
        if (this.shifted12HighStart != other.shifted12HighStart) return false
        if (this.type != other.type) return false
        if (this.valueWidth != other.valueWidth) return false
        if (this.reserved32 != other.reserved32) return false
        if (this.reserved16 != other.reserved16) return false
        if (this.index3NullOffset != other.index3NullOffset) return false
        if (this.dataNullOffset != other.dataNullOffset) return false
        if (this.nullValue != other.nullValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.index.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.indexLength.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.highStart.hashCode()
        result = 31 * result + this.shifted12HighStart.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.valueWidth.hashCode()
        result = 31 * result + this.reserved32.hashCode()
        result = 31 * result + this.reserved16.hashCode()
        result = 31 * result + this.index3NullOffset.hashCode()
        result = 31 * result + this.dataNullOffset.hashCode()
        result = 31 * result + this.nullValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            index: ConstPtr = ConstPtr(0L),
            data: UCPTrieData = UCPTrieData(),
            indexLength: Int = 0,
            dataLength: Int = 0,
            highStart: Int = 0,
            shifted12HighStart: UShort = 0u,
            type: Byte = 0,
            valueWidth: Byte = 0,
            reserved32: UInt = 0u,
            reserved16: UShort = 0u,
            index3NullOffset: UShort = 0u,
            dataNullOffset: Int = 0,
            nullValue: UInt = 0u,
        ): UCPTrie =
            UCPTrie(
                indexCtorArg = index,
                data = data,
                indexLength = indexLength,
                dataLength = dataLength,
                highStart = highStart,
                shifted12HighStart = shifted12HighStart,
                type = type,
                valueWidth = valueWidth,
                reserved32 = reserved32,
                reserved16 = reserved16,
                index3NullOffset = index3NullOffset,
                dataNullOffset = dataNullOffset,
                nullValue = nullValue,
            )
    }
}

public class UCPTrieData internal constructor(
    ptr0CtorArg: ConstPtr,
    ptr16CtorArg: ConstPtr,
    ptr32CtorArg: ConstPtr,
    ptr8CtorArg: ConstPtr,
) {
    public var ptr0: ConstPtr = ptr0CtorArg
        internal set

    public var ptr16: ConstPtr = ptr16CtorArg
        internal set

    public var ptr32: ConstPtr = ptr32CtorArg
        internal set

    public var ptr8: ConstPtr = ptr8CtorArg
        internal set

    public constructor() : this(
        ptr0CtorArg = ConstPtr(0L),
        ptr16CtorArg = ConstPtr(0L),
        ptr32CtorArg = ConstPtr(0L),
        ptr8CtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.ptr0

    public operator fun component2(): ConstPtr = this.ptr16

    public operator fun component3(): ConstPtr = this.ptr32

    public operator fun component4(): ConstPtr = this.ptr8

    public fun copy(ptr0: ConstPtr = this.ptr0, ptr16: ConstPtr = this.ptr16, ptr32: ConstPtr = this.ptr32, ptr8: ConstPtr = this.ptr8): UCPTrieData = UCPTrieData(ptr0CtorArg = ptr0, ptr16CtorArg = ptr16, ptr32CtorArg = ptr32, ptr8CtorArg = ptr8)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UCPTrieData) return false
        if (this.ptr0 != other.ptr0) return false
        if (this.ptr16 != other.ptr16) return false
        if (this.ptr32 != other.ptr32) return false
        if (this.ptr8 != other.ptr8) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptr0.hashCode()
        result = 31 * result + this.ptr16.hashCode()
        result = 31 * result + this.ptr32.hashCode()
        result = 31 * result + this.ptr8.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ptr0: ConstPtr = ConstPtr(0L),
            ptr16: ConstPtr = ConstPtr(0L),
            ptr32: ConstPtr = ConstPtr(0L),
            ptr8: ConstPtr = ConstPtr(0L),
        ): UCPTrieData =
            UCPTrieData(
                ptr0CtorArg = ptr0,
                ptr16CtorArg = ptr16,
                ptr32CtorArg = ptr32,
                ptr8CtorArg = ptr8,
            )
    }
}

public class UCharIterator internal constructor(
    contextCtorArg: ConstPtr,
    public var length: Int,
    public var start: Int,
    public var index: Int,
    public var limit: Int,
    public var reservedField: Int,
    public var getIndex: UCharIteratorGetIndex,
    public var move: UCharIteratorMove,
    public var hasNext: UCharIteratorHasNext,
    public var hasPrevious: UCharIteratorHasPrevious,
    public var current: UCharIteratorCurrent,
    public var next: UCharIteratorNext,
    public var previous: UCharIteratorPrevious,
    public var reservedFn: UCharIteratorReserved,
    public var getState: UCharIteratorGetState,
    public var setState: UCharIteratorSetState,
) {
    public var context: ConstPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = ConstPtr(0L),
        length = 0,
        start = 0,
        index = 0,
        limit = 0,
        reservedField = 0,
        getIndex = null,
        move = null,
        hasNext = null,
        hasPrevious = null,
        current = null,
        next = null,
        previous = null,
        reservedFn = null,
        getState = null,
        setState = null,
    )

    public operator fun component1(): ConstPtr = this.context

    public operator fun component2(): Int = this.length

    public operator fun component3(): Int = this.start

    public operator fun component4(): Int = this.index

    public operator fun component5(): Int = this.limit

    public operator fun component6(): Int = this.reservedField

    public operator fun component7(): UCharIteratorGetIndex = this.getIndex

    public operator fun component8(): UCharIteratorMove = this.move

    public operator fun component9(): UCharIteratorHasNext = this.hasNext

    public operator fun component10(): UCharIteratorHasPrevious = this.hasPrevious

    public operator fun component11(): UCharIteratorCurrent = this.current

    public operator fun component12(): UCharIteratorNext = this.next

    public operator fun component13(): UCharIteratorPrevious = this.previous

    public operator fun component14(): UCharIteratorReserved = this.reservedFn

    public operator fun component15(): UCharIteratorGetState = this.getState

    public operator fun component16(): UCharIteratorSetState = this.setState

    public fun copy(context: ConstPtr = this.context, length: Int = this.length, start: Int = this.start, index: Int = this.index, limit: Int = this.limit, reservedField: Int = this.reservedField, getIndex: UCharIteratorGetIndex = this.getIndex, move: UCharIteratorMove = this.move, hasNext: UCharIteratorHasNext = this.hasNext, hasPrevious: UCharIteratorHasPrevious = this.hasPrevious, current: UCharIteratorCurrent = this.current, next: UCharIteratorNext = this.next, previous: UCharIteratorPrevious = this.previous, reservedFn: UCharIteratorReserved = this.reservedFn, getState: UCharIteratorGetState = this.getState, setState: UCharIteratorSetState = this.setState): UCharIterator = UCharIterator(contextCtorArg = context, length = length, start = start, index = index, limit = limit, reservedField = reservedField, getIndex = getIndex, move = move, hasNext = hasNext, hasPrevious = hasPrevious, current = current, next = next, previous = previous, reservedFn = reservedFn, getState = getState, setState = setState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UCharIterator) return false
        if (this.context != other.context) return false
        if (this.length != other.length) return false
        if (this.start != other.start) return false
        if (this.index != other.index) return false
        if (this.limit != other.limit) return false
        if (this.reservedField != other.reservedField) return false
        if (this.getIndex != other.getIndex) return false
        if (this.move != other.move) return false
        if (this.hasNext != other.hasNext) return false
        if (this.hasPrevious != other.hasPrevious) return false
        if (this.current != other.current) return false
        if (this.next != other.next) return false
        if (this.previous != other.previous) return false
        if (this.reservedFn != other.reservedFn) return false
        if (this.getState != other.getState) return false
        if (this.setState != other.setState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.start.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.limit.hashCode()
        result = 31 * result + this.reservedField.hashCode()
        result = 31 * result + this.getIndex.hashCode()
        result = 31 * result + this.move.hashCode()
        result = 31 * result + this.hasNext.hashCode()
        result = 31 * result + this.hasPrevious.hashCode()
        result = 31 * result + this.current.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.previous.hashCode()
        result = 31 * result + this.reservedFn.hashCode()
        result = 31 * result + this.getState.hashCode()
        result = 31 * result + this.setState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            context: ConstPtr = ConstPtr(0L),
            length: Int = 0,
            start: Int = 0,
            index: Int = 0,
            limit: Int = 0,
            reservedField: Int = 0,
            getIndex: UCharIteratorGetIndex = null,
            move: UCharIteratorMove = null,
            hasNext: UCharIteratorHasNext = null,
            hasPrevious: UCharIteratorHasPrevious = null,
            current: UCharIteratorCurrent = null,
            next: UCharIteratorNext = null,
            previous: UCharIteratorPrevious = null,
            reservedFn: UCharIteratorReserved = null,
            getState: UCharIteratorGetState = null,
            setState: UCharIteratorSetState = null,
        ): UCharIterator =
            UCharIterator(
                contextCtorArg = context,
                length = length,
                start = start,
                index = index,
                limit = limit,
                reservedField = reservedField,
                getIndex = getIndex,
                move = move,
                hasNext = hasNext,
                hasPrevious = hasPrevious,
                current = current,
                next = next,
                previous = previous,
                reservedFn = reservedFn,
                getState = getState,
                setState = setState,
            )
    }
}

public class UConverterFromUnicodeArgs internal constructor(
    public var size: UShort,
    public var flush: Byte,
    converterCtorArg: MutPtr,
    sourceCtorArg: ConstPtr,
    sourceLimitCtorArg: ConstPtr,
    targetCtorArg: Pstr,
    targetLimitCtorArg: Pcstr,
    offsetsCtorArg: MutPtr,
) {
    public var converter: MutPtr = converterCtorArg
        internal set

    public var source: ConstPtr = sourceCtorArg
        internal set

    public var sourceLimit: ConstPtr = sourceLimitCtorArg
        internal set

    public var target: Pstr = targetCtorArg
        internal set

    public var targetLimit: Pcstr = targetLimitCtorArg
        internal set

    public var offsets: MutPtr = offsetsCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flush = 0,
        converterCtorArg = MutPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        sourceLimitCtorArg = ConstPtr(0L),
        targetCtorArg = MutPtr(0L),
        targetLimitCtorArg = ConstPtr(0L),
        offsetsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): Byte = this.flush

    public operator fun component3(): MutPtr = this.converter

    public operator fun component4(): ConstPtr = this.source

    public operator fun component5(): ConstPtr = this.sourceLimit

    public operator fun component6(): Pstr = this.target

    public operator fun component7(): Pcstr = this.targetLimit

    public operator fun component8(): MutPtr = this.offsets

    public fun copy(size: UShort = this.size, flush: Byte = this.flush, converter: MutPtr = this.converter, source: ConstPtr = this.source, sourceLimit: ConstPtr = this.sourceLimit, target: Pstr = this.target, targetLimit: Pcstr = this.targetLimit, offsets: MutPtr = this.offsets): UConverterFromUnicodeArgs = UConverterFromUnicodeArgs(size = size, flush = flush, converterCtorArg = converter, sourceCtorArg = source, sourceLimitCtorArg = sourceLimit, targetCtorArg = target, targetLimitCtorArg = targetLimit, offsetsCtorArg = offsets)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UConverterFromUnicodeArgs) return false
        if (this.size != other.size) return false
        if (this.flush != other.flush) return false
        if (this.converter != other.converter) return false
        if (this.source != other.source) return false
        if (this.sourceLimit != other.sourceLimit) return false
        if (this.target != other.target) return false
        if (this.targetLimit != other.targetLimit) return false
        if (this.offsets != other.offsets) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flush.hashCode()
        result = 31 * result + this.converter.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.sourceLimit.hashCode()
        result = 31 * result + this.target.hashCode()
        result = 31 * result + this.targetLimit.hashCode()
        result = 31 * result + this.offsets.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            flush: Byte = 0,
            converter: MutPtr = MutPtr(0L),
            source: ConstPtr = ConstPtr(0L),
            sourceLimit: ConstPtr = ConstPtr(0L),
            target: Pstr = MutPtr(0L),
            targetLimit: Pcstr = ConstPtr(0L),
            offsets: MutPtr = MutPtr(0L),
        ): UConverterFromUnicodeArgs =
            UConverterFromUnicodeArgs(
                size = size,
                flush = flush,
                converterCtorArg = converter,
                sourceCtorArg = source,
                sourceLimitCtorArg = sourceLimit,
                targetCtorArg = target,
                targetLimitCtorArg = targetLimit,
                offsetsCtorArg = offsets,
            )
    }
}

public class UConverterToUnicodeArgs internal constructor(
    public var size: UShort,
    public var flush: Byte,
    converterCtorArg: MutPtr,
    sourceCtorArg: Pcstr,
    sourceLimitCtorArg: Pcstr,
    targetCtorArg: MutPtr,
    targetLimitCtorArg: ConstPtr,
    offsetsCtorArg: MutPtr,
) {
    public var converter: MutPtr = converterCtorArg
        internal set

    public var source: Pcstr = sourceCtorArg
        internal set

    public var sourceLimit: Pcstr = sourceLimitCtorArg
        internal set

    public var target: MutPtr = targetCtorArg
        internal set

    public var targetLimit: ConstPtr = targetLimitCtorArg
        internal set

    public var offsets: MutPtr = offsetsCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flush = 0,
        converterCtorArg = MutPtr(0L),
        sourceCtorArg = ConstPtr(0L),
        sourceLimitCtorArg = ConstPtr(0L),
        targetCtorArg = MutPtr(0L),
        targetLimitCtorArg = ConstPtr(0L),
        offsetsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): Byte = this.flush

    public operator fun component3(): MutPtr = this.converter

    public operator fun component4(): Pcstr = this.source

    public operator fun component5(): Pcstr = this.sourceLimit

    public operator fun component6(): MutPtr = this.target

    public operator fun component7(): ConstPtr = this.targetLimit

    public operator fun component8(): MutPtr = this.offsets

    public fun copy(size: UShort = this.size, flush: Byte = this.flush, converter: MutPtr = this.converter, source: Pcstr = this.source, sourceLimit: Pcstr = this.sourceLimit, target: MutPtr = this.target, targetLimit: ConstPtr = this.targetLimit, offsets: MutPtr = this.offsets): UConverterToUnicodeArgs = UConverterToUnicodeArgs(size = size, flush = flush, converterCtorArg = converter, sourceCtorArg = source, sourceLimitCtorArg = sourceLimit, targetCtorArg = target, targetLimitCtorArg = targetLimit, offsetsCtorArg = offsets)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UConverterToUnicodeArgs) return false
        if (this.size != other.size) return false
        if (this.flush != other.flush) return false
        if (this.converter != other.converter) return false
        if (this.source != other.source) return false
        if (this.sourceLimit != other.sourceLimit) return false
        if (this.target != other.target) return false
        if (this.targetLimit != other.targetLimit) return false
        if (this.offsets != other.offsets) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flush.hashCode()
        result = 31 * result + this.converter.hashCode()
        result = 31 * result + this.source.hashCode()
        result = 31 * result + this.sourceLimit.hashCode()
        result = 31 * result + this.target.hashCode()
        result = 31 * result + this.targetLimit.hashCode()
        result = 31 * result + this.offsets.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            flush: Byte = 0,
            converter: MutPtr = MutPtr(0L),
            source: Pcstr = ConstPtr(0L),
            sourceLimit: Pcstr = ConstPtr(0L),
            target: MutPtr = MutPtr(0L),
            targetLimit: ConstPtr = ConstPtr(0L),
            offsets: MutPtr = MutPtr(0L),
        ): UConverterToUnicodeArgs =
            UConverterToUnicodeArgs(
                size = size,
                flush = flush,
                converterCtorArg = converter,
                sourceCtorArg = source,
                sourceLimitCtorArg = sourceLimit,
                targetCtorArg = target,
                targetLimitCtorArg = targetLimit,
                offsetsCtorArg = offsets,
            )
    }
}

public data class UFieldPosition(
    public var field: Int = 0,
    public var beginIndex: Int = 0,
    public var endIndex: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UFieldPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UFieldPosition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UFieldPosition =
                    UFieldPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UFieldPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.field)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.beginIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.endIndex)
                }
            }
    }
}

public data class UIDNAInfo(
    public var size: Short = 0,
    public var isTransitionalDifferent: Byte = 0,
    public var reservedB3: Byte = 0,
    public var errors: UInt = 0u,
    public var reservedI2: Int = 0,
    public var reservedI3: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UIDNAInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UIDNAInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UIDNAInfo =
                    UIDNAInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UIDNAInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 2L, value.isTransitionalDifferent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 3L, value.reservedB3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.errors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.reservedI2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.reservedI3)
                }
            }
    }
}

public data class Unicoderange(
    public var wcFrom: UShort = 0u,
    public var wcTo: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Unicoderange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Unicoderange> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Unicoderange =
                    Unicoderange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Unicoderange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcFrom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wcTo)
                }
            }
    }
}

public data class UParseError(
    public var line: Int = 0,
    public var offset: Int = 0,
    public var preContext: UShortArray = UShortArray(16),
    public var postContext: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UParseError) return false
        if (this.line != other.line) return false
        if (this.offset != other.offset) return false
        if (!this.preContext.contentEquals(other.preContext)) return false
        if (!this.postContext.contentEquals(other.postContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.line.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.preContext.contentHashCode()
        result = 31 * result + this.postContext.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UParseError> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UParseError> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): UParseError =
                    UParseError(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UParseError) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.line)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 8L, value.preContext.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 40L, value.postContext.toList())
                }
            }
    }
}

public data class UReplaceableCallbacks(
    public var length: Int = 0,
    public var charAt: Int = 0,
    public var char32At: Int = 0,
    public var replace: Int = 0,
    public var extract: Int = 0,
    public var copy: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UReplaceableCallbacks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UReplaceableCallbacks> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UReplaceableCallbacks =
                    UReplaceableCallbacks(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: UReplaceableCallbacks) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.charAt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.char32At)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.replace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.extract)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.copy)
                }
            }
    }
}

public class USerializedSet internal constructor(
    arrayCtorArg: ConstPtr,
    public var bmpLength: Int,
    public var length: Int,
    public var staticArray: UShortArray,
) {
    public var array: ConstPtr = arrayCtorArg
        internal set

    public constructor() : this(
        arrayCtorArg = ConstPtr(0L),
        bmpLength = 0,
        length = 0,
        staticArray = UShortArray(8),
    )

    public operator fun component1(): ConstPtr = this.array

    public operator fun component2(): Int = this.bmpLength

    public operator fun component3(): Int = this.length

    public operator fun component4(): UShortArray = this.staticArray

    public fun copy(array: ConstPtr = this.array, bmpLength: Int = this.bmpLength, length: Int = this.length, staticArray: UShortArray = this.staticArray): USerializedSet = USerializedSet(arrayCtorArg = array, bmpLength = bmpLength, length = length, staticArray = staticArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USerializedSet) return false
        if (this.array != other.array) return false
        if (this.bmpLength != other.bmpLength) return false
        if (this.length != other.length) return false
        if (!this.staticArray.contentEquals(other.staticArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.array.hashCode()
        result = 31 * result + this.bmpLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.staticArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<USerializedSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<USerializedSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): USerializedSet =
                    USerializedSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: USerializedSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.array)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bmpLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 16L, value.staticArray.toList())
                }
            }

        public operator fun invoke(
            array: ConstPtr = ConstPtr(0L),
            bmpLength: Int = 0,
            length: Int = 0,
            staticArray: UShortArray = UShortArray(8),
        ): USerializedSet =
            USerializedSet(
                arrayCtorArg = array,
                bmpLength = bmpLength,
                length = length,
                staticArray = staticArray,
            )
    }
}

public class UText internal constructor(
    public var magic: UInt,
    public var flags: Int,
    public var providerProperties: Int,
    public var sizeOfStruct: Int,
    public var chunkNativeLimit: Long,
    public var extraSize: Int,
    public var nativeIndexingLimit: Int,
    public var chunkNativeStart: Long,
    public var chunkOffset: Int,
    public var chunkLength: Int,
    chunkContentsCtorArg: ConstPtr,
    pFuncsCtorArg: ConstPtr,
    pExtraCtorArg: MutPtr,
    contextCtorArg: ConstPtr,
    pCtorArg: ConstPtr,
    qCtorArg: ConstPtr,
    rCtorArg: ConstPtr,
    privPCtorArg: MutPtr,
    public var a: Long,
    public var b: Int,
    public var c: Int,
    public var privA: Long,
    public var privB: Int,
    public var privC: Int,
) {
    public var chunkContents: ConstPtr = chunkContentsCtorArg
        internal set

    public var pFuncs: ConstPtr = pFuncsCtorArg
        internal set

    public var pExtra: MutPtr = pExtraCtorArg
        internal set

    public var context: ConstPtr = contextCtorArg
        internal set

    public var p: ConstPtr = pCtorArg
        internal set

    public var q: ConstPtr = qCtorArg
        internal set

    public var r: ConstPtr = rCtorArg
        internal set

    public var privP: MutPtr = privPCtorArg
        internal set

    public constructor() : this(
        magic = 0u,
        flags = 0,
        providerProperties = 0,
        sizeOfStruct = 0,
        chunkNativeLimit = 0L,
        extraSize = 0,
        nativeIndexingLimit = 0,
        chunkNativeStart = 0L,
        chunkOffset = 0,
        chunkLength = 0,
        chunkContentsCtorArg = ConstPtr(0L),
        pFuncsCtorArg = ConstPtr(0L),
        pExtraCtorArg = MutPtr(0L),
        contextCtorArg = ConstPtr(0L),
        pCtorArg = ConstPtr(0L),
        qCtorArg = ConstPtr(0L),
        rCtorArg = ConstPtr(0L),
        privPCtorArg = MutPtr(0L),
        a = 0L,
        b = 0,
        c = 0,
        privA = 0L,
        privB = 0,
        privC = 0,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UText> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): UText =
                    UText(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 140L),
                    )
                override fun writeNative(addr: Long, value: UText) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.providerProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.chunkNativeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.extraSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.nativeIndexingLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.chunkNativeStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.chunkOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.chunkLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 48L, value.chunkContents)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 56L, value.pFuncs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.pExtra)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 72L, value.context)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 80L, value.p)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 88L, value.q)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 96L, value.r)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 104L, value.privP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.a)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.b)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.c)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.privA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.privB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 140L, value.privC)
                }
            }

        public operator fun invoke(
            magic: UInt = 0u,
            flags: Int = 0,
            providerProperties: Int = 0,
            sizeOfStruct: Int = 0,
            chunkNativeLimit: Long = 0L,
            extraSize: Int = 0,
            nativeIndexingLimit: Int = 0,
            chunkNativeStart: Long = 0L,
            chunkOffset: Int = 0,
            chunkLength: Int = 0,
            chunkContents: ConstPtr = ConstPtr(0L),
            pFuncs: ConstPtr = ConstPtr(0L),
            pExtra: MutPtr = MutPtr(0L),
            context: ConstPtr = ConstPtr(0L),
            p: ConstPtr = ConstPtr(0L),
            q: ConstPtr = ConstPtr(0L),
            r: ConstPtr = ConstPtr(0L),
            privP: MutPtr = MutPtr(0L),
            a: Long = 0L,
            b: Int = 0,
            c: Int = 0,
            privA: Long = 0L,
            privB: Int = 0,
            privC: Int = 0,
        ): UText =
            UText(
                magic = magic,
                flags = flags,
                providerProperties = providerProperties,
                sizeOfStruct = sizeOfStruct,
                chunkNativeLimit = chunkNativeLimit,
                extraSize = extraSize,
                nativeIndexingLimit = nativeIndexingLimit,
                chunkNativeStart = chunkNativeStart,
                chunkOffset = chunkOffset,
                chunkLength = chunkLength,
                chunkContentsCtorArg = chunkContents,
                pFuncsCtorArg = pFuncs,
                pExtraCtorArg = pExtra,
                contextCtorArg = context,
                pCtorArg = p,
                qCtorArg = q,
                rCtorArg = r,
                privPCtorArg = privP,
                a = a,
                b = b,
                c = c,
                privA = privA,
                privB = privB,
                privC = privC,
            )
    }
}

public data class UTextFuncs(
    public var tableSize: Int = 0,
    public var reserved1: Int = 0,
    public var reserved2: Int = 0,
    public var reserved3: Int = 0,
    public var clone: UTextClone = null,
    public var nativeLength: UTextNativeLength = null,
    public var access: UTextAccess = null,
    public var extract: UTextExtract = null,
    public var replace: UTextReplace = null,
    public var copy: UTextCopy = null,
    public var mapOffsetToNative: UTextMapOffsetToNative = null,
    public var mapNativeIndexToUTF16: UTextMapNativeIndexToUTF16 = null,
    public var close: UTextClose = null,
    public var spare1: UTextClose = null,
    public var spare2: UTextClose = null,
    public var spare3: UTextClose = null,
)

public data class UTransPosition(
    public var contextStart: Int = 0,
    public var contextLimit: Int = 0,
    public var start: Int = 0,
    public var limit: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UTransPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UTransPosition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UTransPosition =
                    UTransPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UTransPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.contextStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.contextLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.start)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.limit)
                }
            }
    }
}
