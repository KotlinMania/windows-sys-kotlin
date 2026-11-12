@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

public data class JetBkinfo(
    public var lgposMark: JetLgpos = JetLgpos(),
    public var anonymous: JetBkinfo0 = JetBkinfo0(),
    public var genLow: UInt = 0u,
    public var genHigh: UInt = 0u,
)

public data class JetBkinfo0(
    public var logtimeMark: JetLogtime = JetLogtime(),
    public var bklogtimeMark: JetBklogtime = JetBklogtime(),
)

public data class JetBklogtime(
    public var bSeconds: Byte = 0,
    public var bMinutes: Byte = 0,
    public var bHours: Byte = 0,
    public var bDay: Byte = 0,
    public var bMonth: Byte = 0,
    public var bYear: Byte = 0,
    public var anonymous1: JetBklogtime0 = JetBklogtime0(),
    public var anonymous2: JetBklogtime1 = JetBklogtime1(),
)

public data class JetBklogtime0(
    public var bFiller1: Byte = 0,
    public var anonymous: JetBklogtime00 = JetBklogtime00(),
)

public data class JetBklogtime00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetBklogtime00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetBklogtime00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): JetBklogtime00 =
                    JetBklogtime00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetBklogtime00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class JetBklogtime1(
    public var bFiller2: Byte = 0,
    public var anonymous: JetBklogtime10 = JetBklogtime10(),
)

public data class JetBklogtime10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetBklogtime10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetBklogtime10> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): JetBklogtime10 =
                    JetBklogtime10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetBklogtime10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class JetColumnbaseA(
    public var cbStruct: UInt = 0u,
    public var columnid: UInt = 0u,
    public var coltyp: UInt = 0u,
    public var wCountry: UShort = 0u,
    public var langid: UShort = 0u,
    public var cp: UShort = 0u,
    public var wFiller: UShort = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var szBaseTableName: ByteArray = ByteArray(256),
    public var szBaseColumnName: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetColumnbaseA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.columnid != other.columnid) return false
        if (this.coltyp != other.coltyp) return false
        if (this.wCountry != other.wCountry) return false
        if (this.langid != other.langid) return false
        if (this.cp != other.cp) return false
        if (this.wFiller != other.wFiller) return false
        if (this.cbMax != other.cbMax) return false
        if (this.grbit != other.grbit) return false
        if (!this.szBaseTableName.contentEquals(other.szBaseTableName)) return false
        if (!this.szBaseColumnName.contentEquals(other.szBaseColumnName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.coltyp.hashCode()
        result = 31 * result + this.wCountry.hashCode()
        result = 31 * result + this.langid.hashCode()
        result = 31 * result + this.cp.hashCode()
        result = 31 * result + this.wFiller.hashCode()
        result = 31 * result + this.cbMax.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.szBaseTableName.contentHashCode()
        result = 31 * result + this.szBaseColumnName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumnbaseA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumnbaseA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 540L
                override fun readNative(addr: Long): JetColumnbaseA =
                    JetColumnbaseA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 28L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 284L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: JetColumnbaseA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.columnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.coltyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.langid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.cp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.wFiller)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.grbit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 28L, value.szBaseTableName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 284L, value.szBaseColumnName.toList())
                }
            }
    }
}

public data class JetColumnbaseW(
    public var cbStruct: UInt = 0u,
    public var columnid: UInt = 0u,
    public var coltyp: UInt = 0u,
    public var wCountry: UShort = 0u,
    public var langid: UShort = 0u,
    public var cp: UShort = 0u,
    public var wFiller: UShort = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
    public var szBaseTableName: UShortArray = UShortArray(256),
    public var szBaseColumnName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetColumnbaseW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.columnid != other.columnid) return false
        if (this.coltyp != other.coltyp) return false
        if (this.wCountry != other.wCountry) return false
        if (this.langid != other.langid) return false
        if (this.cp != other.cp) return false
        if (this.wFiller != other.wFiller) return false
        if (this.cbMax != other.cbMax) return false
        if (this.grbit != other.grbit) return false
        if (!this.szBaseTableName.contentEquals(other.szBaseTableName)) return false
        if (!this.szBaseColumnName.contentEquals(other.szBaseColumnName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.coltyp.hashCode()
        result = 31 * result + this.wCountry.hashCode()
        result = 31 * result + this.langid.hashCode()
        result = 31 * result + this.cp.hashCode()
        result = 31 * result + this.wFiller.hashCode()
        result = 31 * result + this.cbMax.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.szBaseTableName.contentHashCode()
        result = 31 * result + this.szBaseColumnName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumnbaseW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumnbaseW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1052L
                override fun readNative(addr: Long): JetColumnbaseW =
                    JetColumnbaseW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 540L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: JetColumnbaseW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.columnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.coltyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.langid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.cp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.wFiller)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.grbit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 28L, value.szBaseTableName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 540L, value.szBaseColumnName.toList())
                }
            }
    }
}

public class JetColumncreateA internal constructor(
    public var cbStruct: UInt,
    szColumnNameCtorArg: Pstr,
    public var coltyp: UInt,
    public var cbMax: UInt,
    public var grbit: UInt,
    pvDefaultCtorArg: MutPtr,
    public var cbDefault: UInt,
    public var cp: UInt,
    public var columnid: UInt,
    public var err: Int,
) {
    public var szColumnName: Pstr = szColumnNameCtorArg
        internal set

    public var pvDefault: MutPtr = pvDefaultCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szColumnNameCtorArg = MutPtr(0L),
        coltyp = 0u,
        cbMax = 0u,
        grbit = 0u,
        pvDefaultCtorArg = MutPtr(0L),
        cbDefault = 0u,
        cp = 0u,
        columnid = 0u,
        err = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szColumnName

    public operator fun component3(): UInt = this.coltyp

    public operator fun component4(): UInt = this.cbMax

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): MutPtr = this.pvDefault

    public operator fun component7(): UInt = this.cbDefault

    public operator fun component8(): UInt = this.cp

    public operator fun component9(): UInt = this.columnid

    public operator fun component10(): Int = this.err

    public fun copy(cbStruct: UInt = this.cbStruct, szColumnName: Pstr = this.szColumnName, coltyp: UInt = this.coltyp, cbMax: UInt = this.cbMax, grbit: UInt = this.grbit, pvDefault: MutPtr = this.pvDefault, cbDefault: UInt = this.cbDefault, cp: UInt = this.cp, columnid: UInt = this.columnid, err: Int = this.err): JetColumncreateA = JetColumncreateA(cbStruct = cbStruct, szColumnNameCtorArg = szColumnName, coltyp = coltyp, cbMax = cbMax, grbit = grbit, pvDefaultCtorArg = pvDefault, cbDefault = cbDefault, cp = cp, columnid = columnid, err = err)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetColumncreateA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szColumnName != other.szColumnName) return false
        if (this.coltyp != other.coltyp) return false
        if (this.cbMax != other.cbMax) return false
        if (this.grbit != other.grbit) return false
        if (this.pvDefault != other.pvDefault) return false
        if (this.cbDefault != other.cbDefault) return false
        if (this.cp != other.cp) return false
        if (this.columnid != other.columnid) return false
        if (this.err != other.err) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szColumnName.hashCode()
        result = 31 * result + this.coltyp.hashCode()
        result = 31 * result + this.cbMax.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.pvDefault.hashCode()
        result = 31 * result + this.cbDefault.hashCode()
        result = 31 * result + this.cp.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.err.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szColumnName: Pstr = MutPtr(0L),
            coltyp: UInt = 0u,
            cbMax: UInt = 0u,
            grbit: UInt = 0u,
            pvDefault: MutPtr = MutPtr(0L),
            cbDefault: UInt = 0u,
            cp: UInt = 0u,
            columnid: UInt = 0u,
            err: Int = 0,
        ): JetColumncreateA =
            JetColumncreateA(
                cbStruct = cbStruct,
                szColumnNameCtorArg = szColumnName,
                coltyp = coltyp,
                cbMax = cbMax,
                grbit = grbit,
                pvDefaultCtorArg = pvDefault,
                cbDefault = cbDefault,
                cp = cp,
                columnid = columnid,
                err = err,
            )
    }
}

public class JetColumncreateW internal constructor(
    public var cbStruct: UInt,
    szColumnNameCtorArg: Pwstr,
    public var coltyp: UInt,
    public var cbMax: UInt,
    public var grbit: UInt,
    pvDefaultCtorArg: MutPtr,
    public var cbDefault: UInt,
    public var cp: UInt,
    public var columnid: UInt,
    public var err: Int,
) {
    public var szColumnName: Pwstr = szColumnNameCtorArg
        internal set

    public var pvDefault: MutPtr = pvDefaultCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szColumnNameCtorArg = MutPtr(0L),
        coltyp = 0u,
        cbMax = 0u,
        grbit = 0u,
        pvDefaultCtorArg = MutPtr(0L),
        cbDefault = 0u,
        cp = 0u,
        columnid = 0u,
        err = 0,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szColumnName

    public operator fun component3(): UInt = this.coltyp

    public operator fun component4(): UInt = this.cbMax

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): MutPtr = this.pvDefault

    public operator fun component7(): UInt = this.cbDefault

    public operator fun component8(): UInt = this.cp

    public operator fun component9(): UInt = this.columnid

    public operator fun component10(): Int = this.err

    public fun copy(cbStruct: UInt = this.cbStruct, szColumnName: Pwstr = this.szColumnName, coltyp: UInt = this.coltyp, cbMax: UInt = this.cbMax, grbit: UInt = this.grbit, pvDefault: MutPtr = this.pvDefault, cbDefault: UInt = this.cbDefault, cp: UInt = this.cp, columnid: UInt = this.columnid, err: Int = this.err): JetColumncreateW = JetColumncreateW(cbStruct = cbStruct, szColumnNameCtorArg = szColumnName, coltyp = coltyp, cbMax = cbMax, grbit = grbit, pvDefaultCtorArg = pvDefault, cbDefault = cbDefault, cp = cp, columnid = columnid, err = err)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetColumncreateW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szColumnName != other.szColumnName) return false
        if (this.coltyp != other.coltyp) return false
        if (this.cbMax != other.cbMax) return false
        if (this.grbit != other.grbit) return false
        if (this.pvDefault != other.pvDefault) return false
        if (this.cbDefault != other.cbDefault) return false
        if (this.cp != other.cp) return false
        if (this.columnid != other.columnid) return false
        if (this.err != other.err) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szColumnName.hashCode()
        result = 31 * result + this.coltyp.hashCode()
        result = 31 * result + this.cbMax.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.pvDefault.hashCode()
        result = 31 * result + this.cbDefault.hashCode()
        result = 31 * result + this.cp.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.err.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szColumnName: Pwstr = MutPtr(0L),
            coltyp: UInt = 0u,
            cbMax: UInt = 0u,
            grbit: UInt = 0u,
            pvDefault: MutPtr = MutPtr(0L),
            cbDefault: UInt = 0u,
            cp: UInt = 0u,
            columnid: UInt = 0u,
            err: Int = 0,
        ): JetColumncreateW =
            JetColumncreateW(
                cbStruct = cbStruct,
                szColumnNameCtorArg = szColumnName,
                coltyp = coltyp,
                cbMax = cbMax,
                grbit = grbit,
                pvDefaultCtorArg = pvDefault,
                cbDefault = cbDefault,
                cp = cp,
                columnid = columnid,
                err = err,
            )
    }
}

public data class JetColumndef(
    public var cbStruct: UInt = 0u,
    public var columnid: UInt = 0u,
    public var coltyp: UInt = 0u,
    public var wCountry: UShort = 0u,
    public var langid: UShort = 0u,
    public var cp: UShort = 0u,
    public var wCollate: UShort = 0u,
    public var cbMax: UInt = 0u,
    public var grbit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumndef> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumndef> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): JetColumndef =
                    JetColumndef(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: JetColumndef) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.columnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.coltyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.langid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.cp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.wCollate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.grbit)
                }
            }
    }
}

public class JetColumnlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidPresentationOrder: UInt = 0u,
    public var columnidcolumnname: UInt = 0u,
    public var columnidcolumnid: UInt = 0u,
    public var columnidcoltyp: UInt = 0u,
    public var columnidCountry: UInt = 0u,
    public var columnidLangid: UInt = 0u,
    public var columnidCp: UInt = 0u,
    public var columnidCollate: UInt = 0u,
    public var columnidcbMax: UInt = 0u,
    public var columnidgrbit: UInt = 0u,
    public var columnidDefault: UInt = 0u,
    public var columnidBaseTableName: UInt = 0u,
    public var columnidBaseColumnName: UInt = 0u,
    public var columnidDefinitionName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumnlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetColumnlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): JetColumnlist =
                    JetColumnlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: JetColumnlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tableid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.columnidPresentationOrder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.columnidcolumnname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.columnidcolumnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.columnidcoltyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.columnidCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.columnidLangid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.columnidCp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.columnidCollate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.columnidcbMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.columnidgrbit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.columnidDefault)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.columnidBaseTableName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.columnidBaseColumnName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.columnidDefinitionName)
                }
            }
    }
}

public data class JetCommitId(
    public var signLog: JetSignature = JetSignature(),
    public var reserved: Int = 0,
    public var commitId: Long = 0L,
)

public class JetConditionalcolumnA internal constructor(
    public var cbStruct: UInt,
    szColumnNameCtorArg: Pstr,
    public var grbit: UInt,
) {
    public var szColumnName: Pstr = szColumnNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szColumnNameCtorArg = MutPtr(0L),
        grbit = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szColumnName

    public operator fun component3(): UInt = this.grbit

    public fun copy(cbStruct: UInt = this.cbStruct, szColumnName: Pstr = this.szColumnName, grbit: UInt = this.grbit): JetConditionalcolumnA = JetConditionalcolumnA(cbStruct = cbStruct, szColumnNameCtorArg = szColumnName, grbit = grbit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetConditionalcolumnA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szColumnName != other.szColumnName) return false
        if (this.grbit != other.grbit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szColumnName.hashCode()
        result = 31 * result + this.grbit.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szColumnName: Pstr = MutPtr(0L),
            grbit: UInt = 0u,
        ): JetConditionalcolumnA =
            JetConditionalcolumnA(
                cbStruct = cbStruct,
                szColumnNameCtorArg = szColumnName,
                grbit = grbit,
            )
    }
}

public class JetConditionalcolumnW internal constructor(
    public var cbStruct: UInt,
    szColumnNameCtorArg: Pwstr,
    public var grbit: UInt,
) {
    public var szColumnName: Pwstr = szColumnNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szColumnNameCtorArg = MutPtr(0L),
        grbit = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szColumnName

    public operator fun component3(): UInt = this.grbit

    public fun copy(cbStruct: UInt = this.cbStruct, szColumnName: Pwstr = this.szColumnName, grbit: UInt = this.grbit): JetConditionalcolumnW = JetConditionalcolumnW(cbStruct = cbStruct, szColumnNameCtorArg = szColumnName, grbit = grbit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetConditionalcolumnW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szColumnName != other.szColumnName) return false
        if (this.grbit != other.grbit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szColumnName.hashCode()
        result = 31 * result + this.grbit.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szColumnName: Pwstr = MutPtr(0L),
            grbit: UInt = 0u,
        ): JetConditionalcolumnW =
            JetConditionalcolumnW(
                cbStruct = cbStruct,
                szColumnNameCtorArg = szColumnName,
                grbit = grbit,
            )
    }
}

public class JetConvertA internal constructor(
    szOldDllCtorArg: Pstr,
    public var anonymous: JetConvertA0,
) {
    public var szOldDll: Pstr = szOldDllCtorArg
        internal set

    public constructor() : this(
        szOldDllCtorArg = MutPtr(0L),
        anonymous = JetConvertA0(),
    )

    public operator fun component1(): Pstr = this.szOldDll

    public operator fun component2(): JetConvertA0 = this.anonymous

    public fun copy(szOldDll: Pstr = this.szOldDll, anonymous: JetConvertA0 = this.anonymous): JetConvertA = JetConvertA(szOldDllCtorArg = szOldDll, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetConvertA) return false
        if (this.szOldDll != other.szOldDll) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szOldDll.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szOldDll: Pstr = MutPtr(0L),
            anonymous: JetConvertA0 = JetConvertA0(),
        ): JetConvertA =
            JetConvertA(
                szOldDllCtorArg = szOldDll,
                anonymous = anonymous,
            )
    }
}

public data class JetConvertA0(
    public var fFlags: UInt = 0u,
    public var anonymous: JetConvertA00 = JetConvertA00(),
)

public data class JetConvertA00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetConvertA00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetConvertA00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JetConvertA00 =
                    JetConvertA00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetConvertA00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class JetConvertW internal constructor(
    szOldDllCtorArg: Pwstr,
    public var anonymous: JetConvertW0,
) {
    public var szOldDll: Pwstr = szOldDllCtorArg
        internal set

    public constructor() : this(
        szOldDllCtorArg = MutPtr(0L),
        anonymous = JetConvertW0(),
    )

    public operator fun component1(): Pwstr = this.szOldDll

    public operator fun component2(): JetConvertW0 = this.anonymous

    public fun copy(szOldDll: Pwstr = this.szOldDll, anonymous: JetConvertW0 = this.anonymous): JetConvertW = JetConvertW(szOldDllCtorArg = szOldDll, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetConvertW) return false
        if (this.szOldDll != other.szOldDll) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szOldDll.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szOldDll: Pwstr = MutPtr(0L),
            anonymous: JetConvertW0 = JetConvertW0(),
        ): JetConvertW =
            JetConvertW(
                szOldDllCtorArg = szOldDll,
                anonymous = anonymous,
            )
    }
}

public data class JetConvertW0(
    public var fFlags: UInt = 0u,
    public var anonymous: JetConvertW00 = JetConvertW00(),
)

public data class JetConvertW00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetConvertW00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetConvertW00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JetConvertW00 =
                    JetConvertW00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetConvertW00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class JetDbinfomisc(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
)

public class JetDbinfomisc2(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JetLogtime = JetLogtime(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JetLogtime = JetLogtime(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JetLogtime = JetLogtime(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JetLogtime = JetLogtime(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JetLogtime = JetLogtime(),
    public var ulBadChecksumOld: UInt = 0u,
)

public class JetDbinfomisc3(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JetLogtime = JetLogtime(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JetLogtime = JetLogtime(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JetLogtime = JetLogtime(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JetLogtime = JetLogtime(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JetLogtime = JetLogtime(),
    public var ulBadChecksumOld: UInt = 0u,
    public var genCommitted: UInt = 0u,
)

public class JetDbinfomisc4(
    public var ulVersion: UInt = 0u,
    public var ulUpdate: UInt = 0u,
    public var signDb: JetSignature = JetSignature(),
    public var dbstate: UInt = 0u,
    public var lgposConsistent: JetLgpos = JetLgpos(),
    public var logtimeConsistent: JetLogtime = JetLogtime(),
    public var logtimeAttach: JetLogtime = JetLogtime(),
    public var lgposAttach: JetLgpos = JetLgpos(),
    public var logtimeDetach: JetLogtime = JetLogtime(),
    public var lgposDetach: JetLgpos = JetLgpos(),
    public var signLog: JetSignature = JetSignature(),
    public var bkinfoFullPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoIncPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoFullCur: JetBkinfo = JetBkinfo(),
    public var fShadowingDisabled: UInt = 0u,
    public var fUpgradeDb: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var lSPNumber: Int = 0,
    public var cbPageSize: UInt = 0u,
    public var genMinRequired: UInt = 0u,
    public var genMaxRequired: UInt = 0u,
    public var logtimeGenMaxCreate: JetLogtime = JetLogtime(),
    public var ulRepairCount: UInt = 0u,
    public var logtimeRepair: JetLogtime = JetLogtime(),
    public var ulRepairCountOld: UInt = 0u,
    public var ulECCFixSuccess: UInt = 0u,
    public var logtimeECCFixSuccess: JetLogtime = JetLogtime(),
    public var ulECCFixSuccessOld: UInt = 0u,
    public var ulECCFixFail: UInt = 0u,
    public var logtimeECCFixFail: JetLogtime = JetLogtime(),
    public var ulECCFixFailOld: UInt = 0u,
    public var ulBadChecksum: UInt = 0u,
    public var logtimeBadChecksum: JetLogtime = JetLogtime(),
    public var ulBadChecksumOld: UInt = 0u,
    public var genCommitted: UInt = 0u,
    public var bkinfoCopyPrev: JetBkinfo = JetBkinfo(),
    public var bkinfoDiffPrev: JetBkinfo = JetBkinfo(),
)

public data class JetDbinfoupgrade(
    public var cbStruct: UInt = 0u,
    public var cbFilesizeLow: UInt = 0u,
    public var cbFilesizeHigh: UInt = 0u,
    public var cbFreeSpaceRequiredLow: UInt = 0u,
    public var cbFreeSpaceRequiredHigh: UInt = 0u,
    public var csecToUpgrade: UInt = 0u,
    public var anonymous: JetDbinfoupgrade0 = JetDbinfoupgrade0(),
)

public data class JetDbinfoupgrade0(
    public var ulFlags: UInt = 0u,
    public var anonymous: JetDbinfoupgrade00 = JetDbinfoupgrade00(),
)

public data class JetDbinfoupgrade00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetDbinfoupgrade00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetDbinfoupgrade00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): JetDbinfoupgrade00 =
                    JetDbinfoupgrade00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetDbinfoupgrade00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class JetEnumcolumn(
    public var columnid: UInt = 0u,
    public var err: Int = 0,
    public var anonymous: JetEnumcolumn0 = JetEnumcolumn0(),
)

public data class JetEnumcolumn0(
    public var anonymous1: JetEnumcolumn00 = JetEnumcolumn00(),
    public var anonymous2: JetEnumcolumn01 = JetEnumcolumn01(),
)

public class JetEnumcolumn00 internal constructor(
    public var cEnumColumnValue: UInt,
    rgEnumColumnValueCtorArg: MutPtr,
) {
    public var rgEnumColumnValue: MutPtr = rgEnumColumnValueCtorArg
        internal set

    public constructor() : this(
        cEnumColumnValue = 0u,
        rgEnumColumnValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEnumColumnValue

    public operator fun component2(): MutPtr = this.rgEnumColumnValue

    public fun copy(cEnumColumnValue: UInt = this.cEnumColumnValue, rgEnumColumnValue: MutPtr = this.rgEnumColumnValue): JetEnumcolumn00 = JetEnumcolumn00(cEnumColumnValue = cEnumColumnValue, rgEnumColumnValueCtorArg = rgEnumColumnValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetEnumcolumn00) return false
        if (this.cEnumColumnValue != other.cEnumColumnValue) return false
        if (this.rgEnumColumnValue != other.rgEnumColumnValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEnumColumnValue.hashCode()
        result = 31 * result + this.rgEnumColumnValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumn00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumn00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JetEnumcolumn00 =
                    JetEnumcolumn00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JetEnumcolumn00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEnumColumnValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgEnumColumnValue)
                }
            }

        public operator fun invoke(
            cEnumColumnValue: UInt = 0u,
            rgEnumColumnValue: MutPtr = MutPtr(0L),
        ): JetEnumcolumn00 =
            JetEnumcolumn00(
                cEnumColumnValue = cEnumColumnValue,
                rgEnumColumnValueCtorArg = rgEnumColumnValue,
            )
    }
}

public class JetEnumcolumn01 internal constructor(
    public var cbData: UInt,
    pvDataCtorArg: MutPtr,
) {
    public var pvData: MutPtr = pvDataCtorArg
        internal set

    public constructor() : this(
        cbData = 0u,
        pvDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbData

    public operator fun component2(): MutPtr = this.pvData

    public fun copy(cbData: UInt = this.cbData, pvData: MutPtr = this.pvData): JetEnumcolumn01 = JetEnumcolumn01(cbData = cbData, pvDataCtorArg = pvData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetEnumcolumn01) return false
        if (this.cbData != other.cbData) return false
        if (this.pvData != other.pvData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbData.hashCode()
        result = 31 * result + this.pvData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumn01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumn01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JetEnumcolumn01 =
                    JetEnumcolumn01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JetEnumcolumn01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvData)
                }
            }

        public operator fun invoke(
            cbData: UInt = 0u,
            pvData: MutPtr = MutPtr(0L),
        ): JetEnumcolumn01 =
            JetEnumcolumn01(
                cbData = cbData,
                pvDataCtorArg = pvData,
            )
    }
}

public class JetEnumcolumnid internal constructor(
    public var columnid: UInt,
    public var ctagSequence: UInt,
    rgtagSequenceCtorArg: MutPtr,
) {
    public var rgtagSequence: MutPtr = rgtagSequenceCtorArg
        internal set

    public constructor() : this(
        columnid = 0u,
        ctagSequence = 0u,
        rgtagSequenceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.columnid

    public operator fun component2(): UInt = this.ctagSequence

    public operator fun component3(): MutPtr = this.rgtagSequence

    public fun copy(columnid: UInt = this.columnid, ctagSequence: UInt = this.ctagSequence, rgtagSequence: MutPtr = this.rgtagSequence): JetEnumcolumnid = JetEnumcolumnid(columnid = columnid, ctagSequence = ctagSequence, rgtagSequenceCtorArg = rgtagSequence)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetEnumcolumnid) return false
        if (this.columnid != other.columnid) return false
        if (this.ctagSequence != other.ctagSequence) return false
        if (this.rgtagSequence != other.rgtagSequence) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.columnid.hashCode()
        result = 31 * result + this.ctagSequence.hashCode()
        result = 31 * result + this.rgtagSequence.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumnid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumnid> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JetEnumcolumnid =
                    JetEnumcolumnid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JetEnumcolumnid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.columnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ctagSequence)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgtagSequence)
                }
            }

        public operator fun invoke(
            columnid: UInt = 0u,
            ctagSequence: UInt = 0u,
            rgtagSequence: MutPtr = MutPtr(0L),
        ): JetEnumcolumnid =
            JetEnumcolumnid(
                columnid = columnid,
                ctagSequence = ctagSequence,
                rgtagSequenceCtorArg = rgtagSequence,
            )
    }
}

public class JetEnumcolumnvalue internal constructor(
    public var itagSequence: UInt,
    public var err: Int,
    public var cbData: UInt,
    pvDataCtorArg: MutPtr,
) {
    public var pvData: MutPtr = pvDataCtorArg
        internal set

    public constructor() : this(
        itagSequence = 0u,
        err = 0,
        cbData = 0u,
        pvDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.itagSequence

    public operator fun component2(): Int = this.err

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): MutPtr = this.pvData

    public fun copy(itagSequence: UInt = this.itagSequence, err: Int = this.err, cbData: UInt = this.cbData, pvData: MutPtr = this.pvData): JetEnumcolumnvalue = JetEnumcolumnvalue(itagSequence = itagSequence, err = err, cbData = cbData, pvDataCtorArg = pvData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetEnumcolumnvalue) return false
        if (this.itagSequence != other.itagSequence) return false
        if (this.err != other.err) return false
        if (this.cbData != other.cbData) return false
        if (this.pvData != other.pvData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.itagSequence.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.pvData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumnvalue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetEnumcolumnvalue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): JetEnumcolumnvalue =
                    JetEnumcolumnvalue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: JetEnumcolumnvalue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.itagSequence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.err)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pvData)
                }
            }

        public operator fun invoke(
            itagSequence: UInt = 0u,
            err: Int = 0,
            cbData: UInt = 0u,
            pvData: MutPtr = MutPtr(0L),
        ): JetEnumcolumnvalue =
            JetEnumcolumnvalue(
                itagSequence = itagSequence,
                err = err,
                cbData = cbData,
                pvDataCtorArg = pvData,
            )
    }
}

public data class JetErrinfobasicW(
    public var cbStruct: UInt = 0u,
    public var errValue: Int = 0,
    public var errcatMostSpecific: JetErrcat = 0,
    public var rgCategoricalHierarchy: UByteArray = UByteArray(8),
    public var lSourceLine: UInt = 0u,
    public var rgszSourceFile: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetErrinfobasicW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.errValue != other.errValue) return false
        if (this.errcatMostSpecific != other.errcatMostSpecific) return false
        if (!this.rgCategoricalHierarchy.contentEquals(other.rgCategoricalHierarchy)) return false
        if (this.lSourceLine != other.lSourceLine) return false
        if (!this.rgszSourceFile.contentEquals(other.rgszSourceFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.errValue.hashCode()
        result = 31 * result + this.errcatMostSpecific.hashCode()
        result = 31 * result + this.rgCategoricalHierarchy.contentHashCode()
        result = 31 * result + this.lSourceLine.hashCode()
        result = 31 * result + this.rgszSourceFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetErrinfobasicW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetErrinfobasicW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): JetErrinfobasicW =
                    JetErrinfobasicW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: JetErrinfobasicW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.errValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.errcatMostSpecific)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 12L, value.rgCategoricalHierarchy.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.lSourceLine)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 24L, value.rgszSourceFile.toList())
                }
            }
    }
}

public class JetIndexcreate2A internal constructor(
    public var cbStruct: UInt,
    szIndexNameCtorArg: Pstr,
    szKeyCtorArg: Pstr,
    public var cbKey: UInt,
    public var grbit: UInt,
    public var ulDensity: UInt,
    public var anonymous1: JetIndexcreate2A0,
    public var anonymous2: JetIndexcreate2A1,
    rgconditionalcolumnCtorArg: MutPtr,
    public var cConditionalColumn: UInt,
    public var err: Int,
    public var cbKeyMost: UInt,
    pSpacehintsCtorArg: MutPtr,
) {
    public var szIndexName: Pstr = szIndexNameCtorArg
        internal set

    public var szKey: Pstr = szKeyCtorArg
        internal set

    public var rgconditionalcolumn: MutPtr = rgconditionalcolumnCtorArg
        internal set

    public var pSpacehints: MutPtr = pSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szIndexNameCtorArg = MutPtr(0L),
        szKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
        grbit = 0u,
        ulDensity = 0u,
        anonymous1 = JetIndexcreate2A0(),
        anonymous2 = JetIndexcreate2A1(),
        rgconditionalcolumnCtorArg = MutPtr(0L),
        cConditionalColumn = 0u,
        err = 0,
        cbKeyMost = 0u,
        pSpacehintsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szIndexName

    public operator fun component3(): Pstr = this.szKey

    public operator fun component4(): UInt = this.cbKey

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ulDensity

    public operator fun component7(): JetIndexcreate2A0 = this.anonymous1

    public operator fun component8(): JetIndexcreate2A1 = this.anonymous2

    public operator fun component9(): MutPtr = this.rgconditionalcolumn

    public operator fun component10(): UInt = this.cConditionalColumn

    public operator fun component11(): Int = this.err

    public operator fun component12(): UInt = this.cbKeyMost

    public operator fun component13(): MutPtr = this.pSpacehints

    public fun copy(cbStruct: UInt = this.cbStruct, szIndexName: Pstr = this.szIndexName, szKey: Pstr = this.szKey, cbKey: UInt = this.cbKey, grbit: UInt = this.grbit, ulDensity: UInt = this.ulDensity, anonymous1: JetIndexcreate2A0 = this.anonymous1, anonymous2: JetIndexcreate2A1 = this.anonymous2, rgconditionalcolumn: MutPtr = this.rgconditionalcolumn, cConditionalColumn: UInt = this.cConditionalColumn, err: Int = this.err, cbKeyMost: UInt = this.cbKeyMost, pSpacehints: MutPtr = this.pSpacehints): JetIndexcreate2A = JetIndexcreate2A(cbStruct = cbStruct, szIndexNameCtorArg = szIndexName, szKeyCtorArg = szKey, cbKey = cbKey, grbit = grbit, ulDensity = ulDensity, anonymous1 = anonymous1, anonymous2 = anonymous2, rgconditionalcolumnCtorArg = rgconditionalcolumn, cConditionalColumn = cConditionalColumn, err = err, cbKeyMost = cbKeyMost, pSpacehintsCtorArg = pSpacehints)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate2A) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szIndexName != other.szIndexName) return false
        if (this.szKey != other.szKey) return false
        if (this.cbKey != other.cbKey) return false
        if (this.grbit != other.grbit) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.rgconditionalcolumn != other.rgconditionalcolumn) return false
        if (this.cConditionalColumn != other.cConditionalColumn) return false
        if (this.err != other.err) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        if (this.pSpacehints != other.pSpacehints) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szIndexName.hashCode()
        result = 31 * result + this.szKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.rgconditionalcolumn.hashCode()
        result = 31 * result + this.cConditionalColumn.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        result = 31 * result + this.pSpacehints.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szIndexName: Pstr = MutPtr(0L),
            szKey: Pstr = MutPtr(0L),
            cbKey: UInt = 0u,
            grbit: UInt = 0u,
            ulDensity: UInt = 0u,
            anonymous1: JetIndexcreate2A0 = JetIndexcreate2A0(),
            anonymous2: JetIndexcreate2A1 = JetIndexcreate2A1(),
            rgconditionalcolumn: MutPtr = MutPtr(0L),
            cConditionalColumn: UInt = 0u,
            err: Int = 0,
            cbKeyMost: UInt = 0u,
            pSpacehints: MutPtr = MutPtr(0L),
        ): JetIndexcreate2A =
            JetIndexcreate2A(
                cbStruct = cbStruct,
                szIndexNameCtorArg = szIndexName,
                szKeyCtorArg = szKey,
                cbKey = cbKey,
                grbit = grbit,
                ulDensity = ulDensity,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                rgconditionalcolumnCtorArg = rgconditionalcolumn,
                cConditionalColumn = cConditionalColumn,
                err = err,
                cbKeyMost = cbKeyMost,
                pSpacehintsCtorArg = pSpacehints,
            )
    }
}

public class JetIndexcreate2A0 internal constructor(
    public var lcid: UInt,
    pidxunicodeCtorArg: MutPtr,
) {
    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public constructor() : this(
        lcid = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lcid

    public operator fun component2(): MutPtr = this.pidxunicode

    public fun copy(lcid: UInt = this.lcid, pidxunicode: MutPtr = this.pidxunicode): JetIndexcreate2A0 = JetIndexcreate2A0(lcid = lcid, pidxunicodeCtorArg = pidxunicode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate2A0) return false
        if (this.lcid != other.lcid) return false
        if (this.pidxunicode != other.pidxunicode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcid.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lcid: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
        ): JetIndexcreate2A0 =
            JetIndexcreate2A0(
                lcid = lcid,
                pidxunicodeCtorArg = pidxunicode,
            )
    }
}

public class JetIndexcreate2A1 internal constructor(
    public var cbVarSegMac: UInt,
    ptuplelimitsCtorArg: MutPtr,
) {
    public var ptuplelimits: MutPtr = ptuplelimitsCtorArg
        internal set

    public constructor() : this(
        cbVarSegMac = 0u,
        ptuplelimitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbVarSegMac

    public operator fun component2(): MutPtr = this.ptuplelimits

    public fun copy(cbVarSegMac: UInt = this.cbVarSegMac, ptuplelimits: MutPtr = this.ptuplelimits): JetIndexcreate2A1 = JetIndexcreate2A1(cbVarSegMac = cbVarSegMac, ptuplelimitsCtorArg = ptuplelimits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate2A1) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.ptuplelimits != other.ptuplelimits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbVarSegMac.hashCode()
        result = 31 * result + this.ptuplelimits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbVarSegMac: UInt = 0u,
            ptuplelimits: MutPtr = MutPtr(0L),
        ): JetIndexcreate2A1 =
            JetIndexcreate2A1(
                cbVarSegMac = cbVarSegMac,
                ptuplelimitsCtorArg = ptuplelimits,
            )
    }
}

public class JetIndexcreate2W internal constructor(
    public var cbStruct: UInt,
    szIndexNameCtorArg: Pwstr,
    szKeyCtorArg: Pwstr,
    public var cbKey: UInt,
    public var grbit: UInt,
    public var ulDensity: UInt,
    public var anonymous1: JetIndexcreate2W0,
    public var anonymous2: JetIndexcreate2W1,
    rgconditionalcolumnCtorArg: MutPtr,
    public var cConditionalColumn: UInt,
    public var err: Int,
    public var cbKeyMost: UInt,
    pSpacehintsCtorArg: MutPtr,
) {
    public var szIndexName: Pwstr = szIndexNameCtorArg
        internal set

    public var szKey: Pwstr = szKeyCtorArg
        internal set

    public var rgconditionalcolumn: MutPtr = rgconditionalcolumnCtorArg
        internal set

    public var pSpacehints: MutPtr = pSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szIndexNameCtorArg = MutPtr(0L),
        szKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
        grbit = 0u,
        ulDensity = 0u,
        anonymous1 = JetIndexcreate2W0(),
        anonymous2 = JetIndexcreate2W1(),
        rgconditionalcolumnCtorArg = MutPtr(0L),
        cConditionalColumn = 0u,
        err = 0,
        cbKeyMost = 0u,
        pSpacehintsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szIndexName

    public operator fun component3(): Pwstr = this.szKey

    public operator fun component4(): UInt = this.cbKey

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ulDensity

    public operator fun component7(): JetIndexcreate2W0 = this.anonymous1

    public operator fun component8(): JetIndexcreate2W1 = this.anonymous2

    public operator fun component9(): MutPtr = this.rgconditionalcolumn

    public operator fun component10(): UInt = this.cConditionalColumn

    public operator fun component11(): Int = this.err

    public operator fun component12(): UInt = this.cbKeyMost

    public operator fun component13(): MutPtr = this.pSpacehints

    public fun copy(cbStruct: UInt = this.cbStruct, szIndexName: Pwstr = this.szIndexName, szKey: Pwstr = this.szKey, cbKey: UInt = this.cbKey, grbit: UInt = this.grbit, ulDensity: UInt = this.ulDensity, anonymous1: JetIndexcreate2W0 = this.anonymous1, anonymous2: JetIndexcreate2W1 = this.anonymous2, rgconditionalcolumn: MutPtr = this.rgconditionalcolumn, cConditionalColumn: UInt = this.cConditionalColumn, err: Int = this.err, cbKeyMost: UInt = this.cbKeyMost, pSpacehints: MutPtr = this.pSpacehints): JetIndexcreate2W = JetIndexcreate2W(cbStruct = cbStruct, szIndexNameCtorArg = szIndexName, szKeyCtorArg = szKey, cbKey = cbKey, grbit = grbit, ulDensity = ulDensity, anonymous1 = anonymous1, anonymous2 = anonymous2, rgconditionalcolumnCtorArg = rgconditionalcolumn, cConditionalColumn = cConditionalColumn, err = err, cbKeyMost = cbKeyMost, pSpacehintsCtorArg = pSpacehints)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate2W) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szIndexName != other.szIndexName) return false
        if (this.szKey != other.szKey) return false
        if (this.cbKey != other.cbKey) return false
        if (this.grbit != other.grbit) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.rgconditionalcolumn != other.rgconditionalcolumn) return false
        if (this.cConditionalColumn != other.cConditionalColumn) return false
        if (this.err != other.err) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        if (this.pSpacehints != other.pSpacehints) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szIndexName.hashCode()
        result = 31 * result + this.szKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.rgconditionalcolumn.hashCode()
        result = 31 * result + this.cConditionalColumn.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        result = 31 * result + this.pSpacehints.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szIndexName: Pwstr = MutPtr(0L),
            szKey: Pwstr = MutPtr(0L),
            cbKey: UInt = 0u,
            grbit: UInt = 0u,
            ulDensity: UInt = 0u,
            anonymous1: JetIndexcreate2W0 = JetIndexcreate2W0(),
            anonymous2: JetIndexcreate2W1 = JetIndexcreate2W1(),
            rgconditionalcolumn: MutPtr = MutPtr(0L),
            cConditionalColumn: UInt = 0u,
            err: Int = 0,
            cbKeyMost: UInt = 0u,
            pSpacehints: MutPtr = MutPtr(0L),
        ): JetIndexcreate2W =
            JetIndexcreate2W(
                cbStruct = cbStruct,
                szIndexNameCtorArg = szIndexName,
                szKeyCtorArg = szKey,
                cbKey = cbKey,
                grbit = grbit,
                ulDensity = ulDensity,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                rgconditionalcolumnCtorArg = rgconditionalcolumn,
                cConditionalColumn = cConditionalColumn,
                err = err,
                cbKeyMost = cbKeyMost,
                pSpacehintsCtorArg = pSpacehints,
            )
    }
}

public class JetIndexcreate2W0 internal constructor(
    public var lcid: UInt,
    pidxunicodeCtorArg: MutPtr,
) {
    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public constructor() : this(
        lcid = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lcid

    public operator fun component2(): MutPtr = this.pidxunicode

    public fun copy(lcid: UInt = this.lcid, pidxunicode: MutPtr = this.pidxunicode): JetIndexcreate2W0 = JetIndexcreate2W0(lcid = lcid, pidxunicodeCtorArg = pidxunicode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate2W0) return false
        if (this.lcid != other.lcid) return false
        if (this.pidxunicode != other.pidxunicode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcid.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lcid: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
        ): JetIndexcreate2W0 =
            JetIndexcreate2W0(
                lcid = lcid,
                pidxunicodeCtorArg = pidxunicode,
            )
    }
}

public class JetIndexcreate2W1 internal constructor(
    public var cbVarSegMac: UInt,
    ptuplelimitsCtorArg: MutPtr,
) {
    public var ptuplelimits: MutPtr = ptuplelimitsCtorArg
        internal set

    public constructor() : this(
        cbVarSegMac = 0u,
        ptuplelimitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbVarSegMac

    public operator fun component2(): MutPtr = this.ptuplelimits

    public fun copy(cbVarSegMac: UInt = this.cbVarSegMac, ptuplelimits: MutPtr = this.ptuplelimits): JetIndexcreate2W1 = JetIndexcreate2W1(cbVarSegMac = cbVarSegMac, ptuplelimitsCtorArg = ptuplelimits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate2W1) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.ptuplelimits != other.ptuplelimits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbVarSegMac.hashCode()
        result = 31 * result + this.ptuplelimits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbVarSegMac: UInt = 0u,
            ptuplelimits: MutPtr = MutPtr(0L),
        ): JetIndexcreate2W1 =
            JetIndexcreate2W1(
                cbVarSegMac = cbVarSegMac,
                ptuplelimitsCtorArg = ptuplelimits,
            )
    }
}

public class JetIndexcreate3A internal constructor(
    public var cbStruct: UInt,
    szIndexNameCtorArg: Pstr,
    szKeyCtorArg: Pstr,
    public var cbKey: UInt,
    public var grbit: UInt,
    public var ulDensity: UInt,
    pidxunicodeCtorArg: MutPtr,
    public var anonymous: JetIndexcreate3A0,
    rgconditionalcolumnCtorArg: MutPtr,
    public var cConditionalColumn: UInt,
    public var err: Int,
    public var cbKeyMost: UInt,
    pSpacehintsCtorArg: MutPtr,
) {
    public var szIndexName: Pstr = szIndexNameCtorArg
        internal set

    public var szKey: Pstr = szKeyCtorArg
        internal set

    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public var rgconditionalcolumn: MutPtr = rgconditionalcolumnCtorArg
        internal set

    public var pSpacehints: MutPtr = pSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szIndexNameCtorArg = MutPtr(0L),
        szKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
        grbit = 0u,
        ulDensity = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
        anonymous = JetIndexcreate3A0(),
        rgconditionalcolumnCtorArg = MutPtr(0L),
        cConditionalColumn = 0u,
        err = 0,
        cbKeyMost = 0u,
        pSpacehintsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szIndexName

    public operator fun component3(): Pstr = this.szKey

    public operator fun component4(): UInt = this.cbKey

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ulDensity

    public operator fun component7(): MutPtr = this.pidxunicode

    public operator fun component8(): JetIndexcreate3A0 = this.anonymous

    public operator fun component9(): MutPtr = this.rgconditionalcolumn

    public operator fun component10(): UInt = this.cConditionalColumn

    public operator fun component11(): Int = this.err

    public operator fun component12(): UInt = this.cbKeyMost

    public operator fun component13(): MutPtr = this.pSpacehints

    public fun copy(cbStruct: UInt = this.cbStruct, szIndexName: Pstr = this.szIndexName, szKey: Pstr = this.szKey, cbKey: UInt = this.cbKey, grbit: UInt = this.grbit, ulDensity: UInt = this.ulDensity, pidxunicode: MutPtr = this.pidxunicode, anonymous: JetIndexcreate3A0 = this.anonymous, rgconditionalcolumn: MutPtr = this.rgconditionalcolumn, cConditionalColumn: UInt = this.cConditionalColumn, err: Int = this.err, cbKeyMost: UInt = this.cbKeyMost, pSpacehints: MutPtr = this.pSpacehints): JetIndexcreate3A = JetIndexcreate3A(cbStruct = cbStruct, szIndexNameCtorArg = szIndexName, szKeyCtorArg = szKey, cbKey = cbKey, grbit = grbit, ulDensity = ulDensity, pidxunicodeCtorArg = pidxunicode, anonymous = anonymous, rgconditionalcolumnCtorArg = rgconditionalcolumn, cConditionalColumn = cConditionalColumn, err = err, cbKeyMost = cbKeyMost, pSpacehintsCtorArg = pSpacehints)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate3A) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szIndexName != other.szIndexName) return false
        if (this.szKey != other.szKey) return false
        if (this.cbKey != other.cbKey) return false
        if (this.grbit != other.grbit) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.pidxunicode != other.pidxunicode) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rgconditionalcolumn != other.rgconditionalcolumn) return false
        if (this.cConditionalColumn != other.cConditionalColumn) return false
        if (this.err != other.err) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        if (this.pSpacehints != other.pSpacehints) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szIndexName.hashCode()
        result = 31 * result + this.szKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.rgconditionalcolumn.hashCode()
        result = 31 * result + this.cConditionalColumn.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        result = 31 * result + this.pSpacehints.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szIndexName: Pstr = MutPtr(0L),
            szKey: Pstr = MutPtr(0L),
            cbKey: UInt = 0u,
            grbit: UInt = 0u,
            ulDensity: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
            anonymous: JetIndexcreate3A0 = JetIndexcreate3A0(),
            rgconditionalcolumn: MutPtr = MutPtr(0L),
            cConditionalColumn: UInt = 0u,
            err: Int = 0,
            cbKeyMost: UInt = 0u,
            pSpacehints: MutPtr = MutPtr(0L),
        ): JetIndexcreate3A =
            JetIndexcreate3A(
                cbStruct = cbStruct,
                szIndexNameCtorArg = szIndexName,
                szKeyCtorArg = szKey,
                cbKey = cbKey,
                grbit = grbit,
                ulDensity = ulDensity,
                pidxunicodeCtorArg = pidxunicode,
                anonymous = anonymous,
                rgconditionalcolumnCtorArg = rgconditionalcolumn,
                cConditionalColumn = cConditionalColumn,
                err = err,
                cbKeyMost = cbKeyMost,
                pSpacehintsCtorArg = pSpacehints,
            )
    }
}

public class JetIndexcreate3A0 internal constructor(
    public var cbVarSegMac: UInt,
    ptuplelimitsCtorArg: MutPtr,
) {
    public var ptuplelimits: MutPtr = ptuplelimitsCtorArg
        internal set

    public constructor() : this(
        cbVarSegMac = 0u,
        ptuplelimitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbVarSegMac

    public operator fun component2(): MutPtr = this.ptuplelimits

    public fun copy(cbVarSegMac: UInt = this.cbVarSegMac, ptuplelimits: MutPtr = this.ptuplelimits): JetIndexcreate3A0 = JetIndexcreate3A0(cbVarSegMac = cbVarSegMac, ptuplelimitsCtorArg = ptuplelimits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate3A0) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.ptuplelimits != other.ptuplelimits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbVarSegMac.hashCode()
        result = 31 * result + this.ptuplelimits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbVarSegMac: UInt = 0u,
            ptuplelimits: MutPtr = MutPtr(0L),
        ): JetIndexcreate3A0 =
            JetIndexcreate3A0(
                cbVarSegMac = cbVarSegMac,
                ptuplelimitsCtorArg = ptuplelimits,
            )
    }
}

public class JetIndexcreate3W internal constructor(
    public var cbStruct: UInt,
    szIndexNameCtorArg: Pwstr,
    szKeyCtorArg: Pwstr,
    public var cbKey: UInt,
    public var grbit: UInt,
    public var ulDensity: UInt,
    pidxunicodeCtorArg: MutPtr,
    public var anonymous: JetIndexcreate3W0,
    rgconditionalcolumnCtorArg: MutPtr,
    public var cConditionalColumn: UInt,
    public var err: Int,
    public var cbKeyMost: UInt,
    pSpacehintsCtorArg: MutPtr,
) {
    public var szIndexName: Pwstr = szIndexNameCtorArg
        internal set

    public var szKey: Pwstr = szKeyCtorArg
        internal set

    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public var rgconditionalcolumn: MutPtr = rgconditionalcolumnCtorArg
        internal set

    public var pSpacehints: MutPtr = pSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szIndexNameCtorArg = MutPtr(0L),
        szKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
        grbit = 0u,
        ulDensity = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
        anonymous = JetIndexcreate3W0(),
        rgconditionalcolumnCtorArg = MutPtr(0L),
        cConditionalColumn = 0u,
        err = 0,
        cbKeyMost = 0u,
        pSpacehintsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szIndexName

    public operator fun component3(): Pwstr = this.szKey

    public operator fun component4(): UInt = this.cbKey

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ulDensity

    public operator fun component7(): MutPtr = this.pidxunicode

    public operator fun component8(): JetIndexcreate3W0 = this.anonymous

    public operator fun component9(): MutPtr = this.rgconditionalcolumn

    public operator fun component10(): UInt = this.cConditionalColumn

    public operator fun component11(): Int = this.err

    public operator fun component12(): UInt = this.cbKeyMost

    public operator fun component13(): MutPtr = this.pSpacehints

    public fun copy(cbStruct: UInt = this.cbStruct, szIndexName: Pwstr = this.szIndexName, szKey: Pwstr = this.szKey, cbKey: UInt = this.cbKey, grbit: UInt = this.grbit, ulDensity: UInt = this.ulDensity, pidxunicode: MutPtr = this.pidxunicode, anonymous: JetIndexcreate3W0 = this.anonymous, rgconditionalcolumn: MutPtr = this.rgconditionalcolumn, cConditionalColumn: UInt = this.cConditionalColumn, err: Int = this.err, cbKeyMost: UInt = this.cbKeyMost, pSpacehints: MutPtr = this.pSpacehints): JetIndexcreate3W = JetIndexcreate3W(cbStruct = cbStruct, szIndexNameCtorArg = szIndexName, szKeyCtorArg = szKey, cbKey = cbKey, grbit = grbit, ulDensity = ulDensity, pidxunicodeCtorArg = pidxunicode, anonymous = anonymous, rgconditionalcolumnCtorArg = rgconditionalcolumn, cConditionalColumn = cConditionalColumn, err = err, cbKeyMost = cbKeyMost, pSpacehintsCtorArg = pSpacehints)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate3W) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szIndexName != other.szIndexName) return false
        if (this.szKey != other.szKey) return false
        if (this.cbKey != other.cbKey) return false
        if (this.grbit != other.grbit) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.pidxunicode != other.pidxunicode) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rgconditionalcolumn != other.rgconditionalcolumn) return false
        if (this.cConditionalColumn != other.cConditionalColumn) return false
        if (this.err != other.err) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        if (this.pSpacehints != other.pSpacehints) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szIndexName.hashCode()
        result = 31 * result + this.szKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.rgconditionalcolumn.hashCode()
        result = 31 * result + this.cConditionalColumn.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        result = 31 * result + this.pSpacehints.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szIndexName: Pwstr = MutPtr(0L),
            szKey: Pwstr = MutPtr(0L),
            cbKey: UInt = 0u,
            grbit: UInt = 0u,
            ulDensity: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
            anonymous: JetIndexcreate3W0 = JetIndexcreate3W0(),
            rgconditionalcolumn: MutPtr = MutPtr(0L),
            cConditionalColumn: UInt = 0u,
            err: Int = 0,
            cbKeyMost: UInt = 0u,
            pSpacehints: MutPtr = MutPtr(0L),
        ): JetIndexcreate3W =
            JetIndexcreate3W(
                cbStruct = cbStruct,
                szIndexNameCtorArg = szIndexName,
                szKeyCtorArg = szKey,
                cbKey = cbKey,
                grbit = grbit,
                ulDensity = ulDensity,
                pidxunicodeCtorArg = pidxunicode,
                anonymous = anonymous,
                rgconditionalcolumnCtorArg = rgconditionalcolumn,
                cConditionalColumn = cConditionalColumn,
                err = err,
                cbKeyMost = cbKeyMost,
                pSpacehintsCtorArg = pSpacehints,
            )
    }
}

public class JetIndexcreate3W0 internal constructor(
    public var cbVarSegMac: UInt,
    ptuplelimitsCtorArg: MutPtr,
) {
    public var ptuplelimits: MutPtr = ptuplelimitsCtorArg
        internal set

    public constructor() : this(
        cbVarSegMac = 0u,
        ptuplelimitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbVarSegMac

    public operator fun component2(): MutPtr = this.ptuplelimits

    public fun copy(cbVarSegMac: UInt = this.cbVarSegMac, ptuplelimits: MutPtr = this.ptuplelimits): JetIndexcreate3W0 = JetIndexcreate3W0(cbVarSegMac = cbVarSegMac, ptuplelimitsCtorArg = ptuplelimits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreate3W0) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.ptuplelimits != other.ptuplelimits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbVarSegMac.hashCode()
        result = 31 * result + this.ptuplelimits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbVarSegMac: UInt = 0u,
            ptuplelimits: MutPtr = MutPtr(0L),
        ): JetIndexcreate3W0 =
            JetIndexcreate3W0(
                cbVarSegMac = cbVarSegMac,
                ptuplelimitsCtorArg = ptuplelimits,
            )
    }
}

public class JetIndexcreateA internal constructor(
    public var cbStruct: UInt,
    szIndexNameCtorArg: Pstr,
    szKeyCtorArg: Pstr,
    public var cbKey: UInt,
    public var grbit: UInt,
    public var ulDensity: UInt,
    public var anonymous1: JetIndexcreateA0,
    public var anonymous2: JetIndexcreateA1,
    rgconditionalcolumnCtorArg: MutPtr,
    public var cConditionalColumn: UInt,
    public var err: Int,
    public var cbKeyMost: UInt,
) {
    public var szIndexName: Pstr = szIndexNameCtorArg
        internal set

    public var szKey: Pstr = szKeyCtorArg
        internal set

    public var rgconditionalcolumn: MutPtr = rgconditionalcolumnCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szIndexNameCtorArg = MutPtr(0L),
        szKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
        grbit = 0u,
        ulDensity = 0u,
        anonymous1 = JetIndexcreateA0(),
        anonymous2 = JetIndexcreateA1(),
        rgconditionalcolumnCtorArg = MutPtr(0L),
        cConditionalColumn = 0u,
        err = 0,
        cbKeyMost = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szIndexName

    public operator fun component3(): Pstr = this.szKey

    public operator fun component4(): UInt = this.cbKey

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ulDensity

    public operator fun component7(): JetIndexcreateA0 = this.anonymous1

    public operator fun component8(): JetIndexcreateA1 = this.anonymous2

    public operator fun component9(): MutPtr = this.rgconditionalcolumn

    public operator fun component10(): UInt = this.cConditionalColumn

    public operator fun component11(): Int = this.err

    public operator fun component12(): UInt = this.cbKeyMost

    public fun copy(cbStruct: UInt = this.cbStruct, szIndexName: Pstr = this.szIndexName, szKey: Pstr = this.szKey, cbKey: UInt = this.cbKey, grbit: UInt = this.grbit, ulDensity: UInt = this.ulDensity, anonymous1: JetIndexcreateA0 = this.anonymous1, anonymous2: JetIndexcreateA1 = this.anonymous2, rgconditionalcolumn: MutPtr = this.rgconditionalcolumn, cConditionalColumn: UInt = this.cConditionalColumn, err: Int = this.err, cbKeyMost: UInt = this.cbKeyMost): JetIndexcreateA = JetIndexcreateA(cbStruct = cbStruct, szIndexNameCtorArg = szIndexName, szKeyCtorArg = szKey, cbKey = cbKey, grbit = grbit, ulDensity = ulDensity, anonymous1 = anonymous1, anonymous2 = anonymous2, rgconditionalcolumnCtorArg = rgconditionalcolumn, cConditionalColumn = cConditionalColumn, err = err, cbKeyMost = cbKeyMost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreateA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szIndexName != other.szIndexName) return false
        if (this.szKey != other.szKey) return false
        if (this.cbKey != other.cbKey) return false
        if (this.grbit != other.grbit) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.rgconditionalcolumn != other.rgconditionalcolumn) return false
        if (this.cConditionalColumn != other.cConditionalColumn) return false
        if (this.err != other.err) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szIndexName.hashCode()
        result = 31 * result + this.szKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.rgconditionalcolumn.hashCode()
        result = 31 * result + this.cConditionalColumn.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szIndexName: Pstr = MutPtr(0L),
            szKey: Pstr = MutPtr(0L),
            cbKey: UInt = 0u,
            grbit: UInt = 0u,
            ulDensity: UInt = 0u,
            anonymous1: JetIndexcreateA0 = JetIndexcreateA0(),
            anonymous2: JetIndexcreateA1 = JetIndexcreateA1(),
            rgconditionalcolumn: MutPtr = MutPtr(0L),
            cConditionalColumn: UInt = 0u,
            err: Int = 0,
            cbKeyMost: UInt = 0u,
        ): JetIndexcreateA =
            JetIndexcreateA(
                cbStruct = cbStruct,
                szIndexNameCtorArg = szIndexName,
                szKeyCtorArg = szKey,
                cbKey = cbKey,
                grbit = grbit,
                ulDensity = ulDensity,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                rgconditionalcolumnCtorArg = rgconditionalcolumn,
                cConditionalColumn = cConditionalColumn,
                err = err,
                cbKeyMost = cbKeyMost,
            )
    }
}

public class JetIndexcreateA0 internal constructor(
    public var lcid: UInt,
    pidxunicodeCtorArg: MutPtr,
) {
    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public constructor() : this(
        lcid = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lcid

    public operator fun component2(): MutPtr = this.pidxunicode

    public fun copy(lcid: UInt = this.lcid, pidxunicode: MutPtr = this.pidxunicode): JetIndexcreateA0 = JetIndexcreateA0(lcid = lcid, pidxunicodeCtorArg = pidxunicode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreateA0) return false
        if (this.lcid != other.lcid) return false
        if (this.pidxunicode != other.pidxunicode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcid.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lcid: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
        ): JetIndexcreateA0 =
            JetIndexcreateA0(
                lcid = lcid,
                pidxunicodeCtorArg = pidxunicode,
            )
    }
}

public class JetIndexcreateA1 internal constructor(
    public var cbVarSegMac: UInt,
    ptuplelimitsCtorArg: MutPtr,
) {
    public var ptuplelimits: MutPtr = ptuplelimitsCtorArg
        internal set

    public constructor() : this(
        cbVarSegMac = 0u,
        ptuplelimitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbVarSegMac

    public operator fun component2(): MutPtr = this.ptuplelimits

    public fun copy(cbVarSegMac: UInt = this.cbVarSegMac, ptuplelimits: MutPtr = this.ptuplelimits): JetIndexcreateA1 = JetIndexcreateA1(cbVarSegMac = cbVarSegMac, ptuplelimitsCtorArg = ptuplelimits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreateA1) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.ptuplelimits != other.ptuplelimits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbVarSegMac.hashCode()
        result = 31 * result + this.ptuplelimits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbVarSegMac: UInt = 0u,
            ptuplelimits: MutPtr = MutPtr(0L),
        ): JetIndexcreateA1 =
            JetIndexcreateA1(
                cbVarSegMac = cbVarSegMac,
                ptuplelimitsCtorArg = ptuplelimits,
            )
    }
}

public class JetIndexcreateW internal constructor(
    public var cbStruct: UInt,
    szIndexNameCtorArg: Pwstr,
    szKeyCtorArg: Pwstr,
    public var cbKey: UInt,
    public var grbit: UInt,
    public var ulDensity: UInt,
    public var anonymous1: JetIndexcreateW0,
    public var anonymous2: JetIndexcreateW1,
    rgconditionalcolumnCtorArg: MutPtr,
    public var cConditionalColumn: UInt,
    public var err: Int,
    public var cbKeyMost: UInt,
) {
    public var szIndexName: Pwstr = szIndexNameCtorArg
        internal set

    public var szKey: Pwstr = szKeyCtorArg
        internal set

    public var rgconditionalcolumn: MutPtr = rgconditionalcolumnCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szIndexNameCtorArg = MutPtr(0L),
        szKeyCtorArg = MutPtr(0L),
        cbKey = 0u,
        grbit = 0u,
        ulDensity = 0u,
        anonymous1 = JetIndexcreateW0(),
        anonymous2 = JetIndexcreateW1(),
        rgconditionalcolumnCtorArg = MutPtr(0L),
        cConditionalColumn = 0u,
        err = 0,
        cbKeyMost = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szIndexName

    public operator fun component3(): Pwstr = this.szKey

    public operator fun component4(): UInt = this.cbKey

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ulDensity

    public operator fun component7(): JetIndexcreateW0 = this.anonymous1

    public operator fun component8(): JetIndexcreateW1 = this.anonymous2

    public operator fun component9(): MutPtr = this.rgconditionalcolumn

    public operator fun component10(): UInt = this.cConditionalColumn

    public operator fun component11(): Int = this.err

    public operator fun component12(): UInt = this.cbKeyMost

    public fun copy(cbStruct: UInt = this.cbStruct, szIndexName: Pwstr = this.szIndexName, szKey: Pwstr = this.szKey, cbKey: UInt = this.cbKey, grbit: UInt = this.grbit, ulDensity: UInt = this.ulDensity, anonymous1: JetIndexcreateW0 = this.anonymous1, anonymous2: JetIndexcreateW1 = this.anonymous2, rgconditionalcolumn: MutPtr = this.rgconditionalcolumn, cConditionalColumn: UInt = this.cConditionalColumn, err: Int = this.err, cbKeyMost: UInt = this.cbKeyMost): JetIndexcreateW = JetIndexcreateW(cbStruct = cbStruct, szIndexNameCtorArg = szIndexName, szKeyCtorArg = szKey, cbKey = cbKey, grbit = grbit, ulDensity = ulDensity, anonymous1 = anonymous1, anonymous2 = anonymous2, rgconditionalcolumnCtorArg = rgconditionalcolumn, cConditionalColumn = cConditionalColumn, err = err, cbKeyMost = cbKeyMost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreateW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szIndexName != other.szIndexName) return false
        if (this.szKey != other.szKey) return false
        if (this.cbKey != other.cbKey) return false
        if (this.grbit != other.grbit) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.rgconditionalcolumn != other.rgconditionalcolumn) return false
        if (this.cConditionalColumn != other.cConditionalColumn) return false
        if (this.err != other.err) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szIndexName.hashCode()
        result = 31 * result + this.szKey.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.rgconditionalcolumn.hashCode()
        result = 31 * result + this.cConditionalColumn.hashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szIndexName: Pwstr = MutPtr(0L),
            szKey: Pwstr = MutPtr(0L),
            cbKey: UInt = 0u,
            grbit: UInt = 0u,
            ulDensity: UInt = 0u,
            anonymous1: JetIndexcreateW0 = JetIndexcreateW0(),
            anonymous2: JetIndexcreateW1 = JetIndexcreateW1(),
            rgconditionalcolumn: MutPtr = MutPtr(0L),
            cConditionalColumn: UInt = 0u,
            err: Int = 0,
            cbKeyMost: UInt = 0u,
        ): JetIndexcreateW =
            JetIndexcreateW(
                cbStruct = cbStruct,
                szIndexNameCtorArg = szIndexName,
                szKeyCtorArg = szKey,
                cbKey = cbKey,
                grbit = grbit,
                ulDensity = ulDensity,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                rgconditionalcolumnCtorArg = rgconditionalcolumn,
                cConditionalColumn = cConditionalColumn,
                err = err,
                cbKeyMost = cbKeyMost,
            )
    }
}

public class JetIndexcreateW0 internal constructor(
    public var lcid: UInt,
    pidxunicodeCtorArg: MutPtr,
) {
    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public constructor() : this(
        lcid = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.lcid

    public operator fun component2(): MutPtr = this.pidxunicode

    public fun copy(lcid: UInt = this.lcid, pidxunicode: MutPtr = this.pidxunicode): JetIndexcreateW0 = JetIndexcreateW0(lcid = lcid, pidxunicodeCtorArg = pidxunicode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreateW0) return false
        if (this.lcid != other.lcid) return false
        if (this.pidxunicode != other.pidxunicode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcid.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lcid: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
        ): JetIndexcreateW0 =
            JetIndexcreateW0(
                lcid = lcid,
                pidxunicodeCtorArg = pidxunicode,
            )
    }
}

public class JetIndexcreateW1 internal constructor(
    public var cbVarSegMac: UInt,
    ptuplelimitsCtorArg: MutPtr,
) {
    public var ptuplelimits: MutPtr = ptuplelimitsCtorArg
        internal set

    public constructor() : this(
        cbVarSegMac = 0u,
        ptuplelimitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbVarSegMac

    public operator fun component2(): MutPtr = this.ptuplelimits

    public fun copy(cbVarSegMac: UInt = this.cbVarSegMac, ptuplelimits: MutPtr = this.ptuplelimits): JetIndexcreateW1 = JetIndexcreateW1(cbVarSegMac = cbVarSegMac, ptuplelimitsCtorArg = ptuplelimits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexcreateW1) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.ptuplelimits != other.ptuplelimits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbVarSegMac.hashCode()
        result = 31 * result + this.ptuplelimits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbVarSegMac: UInt = 0u,
            ptuplelimits: MutPtr = MutPtr(0L),
        ): JetIndexcreateW1 =
            JetIndexcreateW1(
                cbVarSegMac = cbVarSegMac,
                ptuplelimitsCtorArg = ptuplelimits,
            )
    }
}

public data class JetIndexid(
    public var cbStruct: UInt = 0u,
    public var rgbIndexId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexid) return false
        if (this.cbStruct != other.cbStruct) return false
        if (!this.rgbIndexId.contentEquals(other.rgbIndexId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.rgbIndexId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): JetIndexid =
                    JetIndexid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: JetIndexid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.rgbIndexId.toList())
                }
            }
    }
}

public class JetIndexlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidindexname: UInt = 0u,
    public var columnidgrbitIndex: UInt = 0u,
    public var columnidcKey: UInt = 0u,
    public var columnidcEntry: UInt = 0u,
    public var columnidcPage: UInt = 0u,
    public var columnidcColumn: UInt = 0u,
    public var columnidiColumn: UInt = 0u,
    public var columnidcolumnid: UInt = 0u,
    public var columnidcoltyp: UInt = 0u,
    public var columnidCountry: UInt = 0u,
    public var columnidLangid: UInt = 0u,
    public var columnidCp: UInt = 0u,
    public var columnidCollate: UInt = 0u,
    public var columnidgrbitColumn: UInt = 0u,
    public var columnidcolumnname: UInt = 0u,
    public var columnidLCMapFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): JetIndexlist =
                    JetIndexlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: JetIndexlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tableid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.columnidindexname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.columnidgrbitIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.columnidcKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.columnidcEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.columnidcPage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.columnidcColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.columnidiColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.columnidcolumnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.columnidcoltyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.columnidCountry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.columnidLangid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.columnidCp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.columnidCollate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.columnidgrbitColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.columnidcolumnname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.columnidLCMapFlags)
                }
            }
    }
}

public data class JetIndexrange(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var grbit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexrange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): JetIndexrange =
                    JetIndexrange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: JetIndexrange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tableid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.grbit)
                }
            }
    }
}

public class JetIndexColumn internal constructor(
    public var columnid: UInt,
    public var relop: JetRelop,
    pvCtorArg: MutPtr,
    public var cb: UInt,
    public var grbit: UInt,
) {
    public var pv: MutPtr = pvCtorArg
        internal set

    public constructor() : this(
        columnid = 0u,
        relop = 0,
        pvCtorArg = MutPtr(0L),
        cb = 0u,
        grbit = 0u,
    )

    public operator fun component1(): UInt = this.columnid

    public operator fun component2(): JetRelop = this.relop

    public operator fun component3(): MutPtr = this.pv

    public operator fun component4(): UInt = this.cb

    public operator fun component5(): UInt = this.grbit

    public fun copy(columnid: UInt = this.columnid, relop: JetRelop = this.relop, pv: MutPtr = this.pv, cb: UInt = this.cb, grbit: UInt = this.grbit): JetIndexColumn = JetIndexColumn(columnid = columnid, relop = relop, pvCtorArg = pv, cb = cb, grbit = grbit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexColumn) return false
        if (this.columnid != other.columnid) return false
        if (this.relop != other.relop) return false
        if (this.pv != other.pv) return false
        if (this.cb != other.cb) return false
        if (this.grbit != other.grbit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.columnid.hashCode()
        result = 31 * result + this.relop.hashCode()
        result = 31 * result + this.pv.hashCode()
        result = 31 * result + this.cb.hashCode()
        result = 31 * result + this.grbit.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexColumn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexColumn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): JetIndexColumn =
                    JetIndexColumn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: JetIndexColumn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.columnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.relop)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.grbit)
                }
            }

        public operator fun invoke(
            columnid: UInt = 0u,
            relop: JetRelop = 0,
            pv: MutPtr = MutPtr(0L),
            cb: UInt = 0u,
            grbit: UInt = 0u,
        ): JetIndexColumn =
            JetIndexColumn(
                columnid = columnid,
                relop = relop,
                pvCtorArg = pv,
                cb = cb,
                grbit = grbit,
            )
    }
}

public class JetIndexRange internal constructor(
    rgStartColumnsCtorArg: MutPtr,
    public var cStartColumns: UInt,
    rgEndColumnsCtorArg: MutPtr,
    public var cEndColumns: UInt,
) {
    public var rgStartColumns: MutPtr = rgStartColumnsCtorArg
        internal set

    public var rgEndColumns: MutPtr = rgEndColumnsCtorArg
        internal set

    public constructor() : this(
        rgStartColumnsCtorArg = MutPtr(0L),
        cStartColumns = 0u,
        rgEndColumnsCtorArg = MutPtr(0L),
        cEndColumns = 0u,
    )

    public operator fun component1(): MutPtr = this.rgStartColumns

    public operator fun component2(): UInt = this.cStartColumns

    public operator fun component3(): MutPtr = this.rgEndColumns

    public operator fun component4(): UInt = this.cEndColumns

    public fun copy(rgStartColumns: MutPtr = this.rgStartColumns, cStartColumns: UInt = this.cStartColumns, rgEndColumns: MutPtr = this.rgEndColumns, cEndColumns: UInt = this.cEndColumns): JetIndexRange = JetIndexRange(rgStartColumnsCtorArg = rgStartColumns, cStartColumns = cStartColumns, rgEndColumnsCtorArg = rgEndColumns, cEndColumns = cEndColumns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetIndexRange) return false
        if (this.rgStartColumns != other.rgStartColumns) return false
        if (this.cStartColumns != other.cStartColumns) return false
        if (this.rgEndColumns != other.rgEndColumns) return false
        if (this.cEndColumns != other.cEndColumns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgStartColumns.hashCode()
        result = 31 * result + this.cStartColumns.hashCode()
        result = 31 * result + this.rgEndColumns.hashCode()
        result = 31 * result + this.cEndColumns.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetIndexRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): JetIndexRange =
                    JetIndexRange(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: JetIndexRange) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.rgStartColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cStartColumns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.rgEndColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cEndColumns)
                }
            }

        public operator fun invoke(
            rgStartColumns: MutPtr = MutPtr(0L),
            cStartColumns: UInt = 0u,
            rgEndColumns: MutPtr = MutPtr(0L),
            cEndColumns: UInt = 0u,
        ): JetIndexRange =
            JetIndexRange(
                rgStartColumnsCtorArg = rgStartColumns,
                cStartColumns = cStartColumns,
                rgEndColumnsCtorArg = rgEndColumns,
                cEndColumns = cEndColumns,
            )
    }
}

public class JetInstanceInfoA internal constructor(
    public var hInstanceId: JetInstance,
    szInstanceNameCtorArg: Pstr,
    public var cDatabases: JetApiPtr,
    szDatabaseFileNameCtorArg: MutPtr,
    szDatabaseDisplayNameCtorArg: MutPtr,
    szDatabaseSlvfileNameObsoleteCtorArg: MutPtr,
) {
    public var szInstanceName: Pstr = szInstanceNameCtorArg
        internal set

    public var szDatabaseFileName: MutPtr = szDatabaseFileNameCtorArg
        internal set

    public var szDatabaseDisplayName: MutPtr = szDatabaseDisplayNameCtorArg
        internal set

    public var szDatabaseSlvfileNameObsolete: MutPtr = szDatabaseSlvfileNameObsoleteCtorArg
        internal set

    public constructor() : this(
        hInstanceId = 0uL,
        szInstanceNameCtorArg = MutPtr(0L),
        cDatabases = 0uL,
        szDatabaseFileNameCtorArg = MutPtr(0L),
        szDatabaseDisplayNameCtorArg = MutPtr(0L),
        szDatabaseSlvfileNameObsoleteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): JetInstance = this.hInstanceId

    public operator fun component2(): Pstr = this.szInstanceName

    public operator fun component3(): JetApiPtr = this.cDatabases

    public operator fun component4(): MutPtr = this.szDatabaseFileName

    public operator fun component5(): MutPtr = this.szDatabaseDisplayName

    public operator fun component6(): MutPtr = this.szDatabaseSlvfileNameObsolete

    public fun copy(hInstanceId: JetInstance = this.hInstanceId, szInstanceName: Pstr = this.szInstanceName, cDatabases: JetApiPtr = this.cDatabases, szDatabaseFileName: MutPtr = this.szDatabaseFileName, szDatabaseDisplayName: MutPtr = this.szDatabaseDisplayName, szDatabaseSlvfileNameObsolete: MutPtr = this.szDatabaseSlvfileNameObsolete): JetInstanceInfoA = JetInstanceInfoA(hInstanceId = hInstanceId, szInstanceNameCtorArg = szInstanceName, cDatabases = cDatabases, szDatabaseFileNameCtorArg = szDatabaseFileName, szDatabaseDisplayNameCtorArg = szDatabaseDisplayName, szDatabaseSlvfileNameObsoleteCtorArg = szDatabaseSlvfileNameObsolete)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetInstanceInfoA) return false
        if (this.hInstanceId != other.hInstanceId) return false
        if (this.szInstanceName != other.szInstanceName) return false
        if (this.cDatabases != other.cDatabases) return false
        if (this.szDatabaseFileName != other.szDatabaseFileName) return false
        if (this.szDatabaseDisplayName != other.szDatabaseDisplayName) return false
        if (this.szDatabaseSlvfileNameObsolete != other.szDatabaseSlvfileNameObsolete) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInstanceId.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        result = 31 * result + this.cDatabases.hashCode()
        result = 31 * result + this.szDatabaseFileName.hashCode()
        result = 31 * result + this.szDatabaseDisplayName.hashCode()
        result = 31 * result + this.szDatabaseSlvfileNameObsolete.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInstanceId: JetInstance = 0uL,
            szInstanceName: Pstr = MutPtr(0L),
            cDatabases: JetApiPtr = 0uL,
            szDatabaseFileName: MutPtr = MutPtr(0L),
            szDatabaseDisplayName: MutPtr = MutPtr(0L),
            szDatabaseSlvfileNameObsolete: MutPtr = MutPtr(0L),
        ): JetInstanceInfoA =
            JetInstanceInfoA(
                hInstanceId = hInstanceId,
                szInstanceNameCtorArg = szInstanceName,
                cDatabases = cDatabases,
                szDatabaseFileNameCtorArg = szDatabaseFileName,
                szDatabaseDisplayNameCtorArg = szDatabaseDisplayName,
                szDatabaseSlvfileNameObsoleteCtorArg = szDatabaseSlvfileNameObsolete,
            )
    }
}

public class JetInstanceInfoW internal constructor(
    public var hInstanceId: JetInstance,
    szInstanceNameCtorArg: Pwstr,
    public var cDatabases: JetApiPtr,
    szDatabaseFileNameCtorArg: MutPtr,
    szDatabaseDisplayNameCtorArg: MutPtr,
    szDatabaseSlvfileNameObsoleteCtorArg: MutPtr,
) {
    public var szInstanceName: Pwstr = szInstanceNameCtorArg
        internal set

    public var szDatabaseFileName: MutPtr = szDatabaseFileNameCtorArg
        internal set

    public var szDatabaseDisplayName: MutPtr = szDatabaseDisplayNameCtorArg
        internal set

    public var szDatabaseSlvfileNameObsolete: MutPtr = szDatabaseSlvfileNameObsoleteCtorArg
        internal set

    public constructor() : this(
        hInstanceId = 0uL,
        szInstanceNameCtorArg = MutPtr(0L),
        cDatabases = 0uL,
        szDatabaseFileNameCtorArg = MutPtr(0L),
        szDatabaseDisplayNameCtorArg = MutPtr(0L),
        szDatabaseSlvfileNameObsoleteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): JetInstance = this.hInstanceId

    public operator fun component2(): Pwstr = this.szInstanceName

    public operator fun component3(): JetApiPtr = this.cDatabases

    public operator fun component4(): MutPtr = this.szDatabaseFileName

    public operator fun component5(): MutPtr = this.szDatabaseDisplayName

    public operator fun component6(): MutPtr = this.szDatabaseSlvfileNameObsolete

    public fun copy(hInstanceId: JetInstance = this.hInstanceId, szInstanceName: Pwstr = this.szInstanceName, cDatabases: JetApiPtr = this.cDatabases, szDatabaseFileName: MutPtr = this.szDatabaseFileName, szDatabaseDisplayName: MutPtr = this.szDatabaseDisplayName, szDatabaseSlvfileNameObsolete: MutPtr = this.szDatabaseSlvfileNameObsolete): JetInstanceInfoW = JetInstanceInfoW(hInstanceId = hInstanceId, szInstanceNameCtorArg = szInstanceName, cDatabases = cDatabases, szDatabaseFileNameCtorArg = szDatabaseFileName, szDatabaseDisplayNameCtorArg = szDatabaseDisplayName, szDatabaseSlvfileNameObsoleteCtorArg = szDatabaseSlvfileNameObsolete)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetInstanceInfoW) return false
        if (this.hInstanceId != other.hInstanceId) return false
        if (this.szInstanceName != other.szInstanceName) return false
        if (this.cDatabases != other.cDatabases) return false
        if (this.szDatabaseFileName != other.szDatabaseFileName) return false
        if (this.szDatabaseDisplayName != other.szDatabaseDisplayName) return false
        if (this.szDatabaseSlvfileNameObsolete != other.szDatabaseSlvfileNameObsolete) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hInstanceId.hashCode()
        result = 31 * result + this.szInstanceName.hashCode()
        result = 31 * result + this.cDatabases.hashCode()
        result = 31 * result + this.szDatabaseFileName.hashCode()
        result = 31 * result + this.szDatabaseDisplayName.hashCode()
        result = 31 * result + this.szDatabaseSlvfileNameObsolete.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hInstanceId: JetInstance = 0uL,
            szInstanceName: Pwstr = MutPtr(0L),
            cDatabases: JetApiPtr = 0uL,
            szDatabaseFileName: MutPtr = MutPtr(0L),
            szDatabaseDisplayName: MutPtr = MutPtr(0L),
            szDatabaseSlvfileNameObsolete: MutPtr = MutPtr(0L),
        ): JetInstanceInfoW =
            JetInstanceInfoW(
                hInstanceId = hInstanceId,
                szInstanceNameCtorArg = szInstanceName,
                cDatabases = cDatabases,
                szDatabaseFileNameCtorArg = szDatabaseFileName,
                szDatabaseDisplayNameCtorArg = szDatabaseDisplayName,
                szDatabaseSlvfileNameObsoleteCtorArg = szDatabaseSlvfileNameObsolete,
            )
    }
}

public data class JetLgpos(
    public var ib: UShort = 0u,
    public var isec: UShort = 0u,
    public var lGeneration: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLgpos> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLgpos> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): JetLgpos =
                    JetLgpos(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: JetLgpos) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ib)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.isec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lGeneration)
                }
            }
    }
}

public data class JetLoginfoA(
    public var cbSize: UInt = 0u,
    public var ulGenLow: UInt = 0u,
    public var ulGenHigh: UInt = 0u,
    public var szBaseName: ByteArray = ByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetLoginfoA) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulGenLow != other.ulGenLow) return false
        if (this.ulGenHigh != other.ulGenHigh) return false
        if (!this.szBaseName.contentEquals(other.szBaseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulGenLow.hashCode()
        result = 31 * result + this.ulGenHigh.hashCode()
        result = 31 * result + this.szBaseName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLoginfoA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLoginfoA> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JetLoginfoA =
                    JetLoginfoA(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: JetLoginfoA) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulGenLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulGenHigh)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr + 12L, value.szBaseName.toList())
                }
            }
    }
}

public data class JetLoginfoW(
    public var cbSize: UInt = 0u,
    public var ulGenLow: UInt = 0u,
    public var ulGenHigh: UInt = 0u,
    public var szBaseName: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetLoginfoW) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulGenLow != other.ulGenLow) return false
        if (this.ulGenHigh != other.ulGenHigh) return false
        if (!this.szBaseName.contentEquals(other.szBaseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulGenLow.hashCode()
        result = 31 * result + this.ulGenHigh.hashCode()
        result = 31 * result + this.szBaseName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLoginfoW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLoginfoW> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): JetLoginfoW =
                    JetLoginfoW(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: JetLoginfoW) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulGenLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulGenHigh)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 12L, value.szBaseName.toList())
                }
            }
    }
}

public data class JetLogtime(
    public var bSeconds: Byte = 0,
    public var bMinutes: Byte = 0,
    public var bHours: Byte = 0,
    public var bDay: Byte = 0,
    public var bMonth: Byte = 0,
    public var bYear: Byte = 0,
    public var anonymous1: JetLogtime0 = JetLogtime0(),
    public var anonymous2: JetLogtime1 = JetLogtime1(),
)

public data class JetLogtime0(
    public var bFiller1: Byte = 0,
    public var anonymous: JetLogtime00 = JetLogtime00(),
)

public data class JetLogtime00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLogtime00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLogtime00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): JetLogtime00 =
                    JetLogtime00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetLogtime00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class JetLogtime1(
    public var bFiller2: Byte = 0,
    public var anonymous: JetLogtime10 = JetLogtime10(),
)

public data class JetLogtime10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLogtime10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetLogtime10> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): JetLogtime10 =
                    JetLogtime10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: JetLogtime10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class JetObjectinfo(
    public var cbStruct: UInt = 0u,
    public var objtyp: UInt = 0u,
    public var dtCreate: Double = 0.0,
    public var dtUpdate: Double = 0.0,
    public var grbit: UInt = 0u,
    public var flags: UInt = 0u,
    public var cRecord: UInt = 0u,
    public var cPage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetObjectinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetObjectinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): JetObjectinfo =
                    JetObjectinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: JetObjectinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.objtyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.dtCreate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 16L, value.dtUpdate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.grbit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cPage)
                }
            }
    }
}

public data class JetObjectlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidcontainername: UInt = 0u,
    public var columnidobjectname: UInt = 0u,
    public var columnidobjtyp: UInt = 0u,
    public var columniddtCreate: UInt = 0u,
    public var columniddtUpdate: UInt = 0u,
    public var columnidgrbit: UInt = 0u,
    public var columnidflags: UInt = 0u,
    public var columnidcRecord: UInt = 0u,
    public var columnidcPage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetObjectlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetObjectlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): JetObjectlist =
                    JetObjectlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: JetObjectlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tableid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.columnidcontainername)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.columnidobjectname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.columnidobjtyp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.columniddtCreate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.columniddtUpdate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.columnidgrbit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.columnidflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.columnidcRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.columnidcPage)
                }
            }
    }
}

public class JetOpentemporarytable internal constructor(
    public var cbStruct: UInt,
    prgcolumndefCtorArg: ConstPtr,
    public var ccolumn: UInt,
    pidxunicodeCtorArg: MutPtr,
    public var grbit: UInt,
    prgcolumnidCtorArg: MutPtr,
    public var cbKeyMost: UInt,
    public var cbVarSegMac: UInt,
    public var tableid: JetTableid,
) {
    public var prgcolumndef: ConstPtr = prgcolumndefCtorArg
        internal set

    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public var prgcolumnid: MutPtr = prgcolumnidCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        prgcolumndefCtorArg = ConstPtr(0L),
        ccolumn = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
        grbit = 0u,
        prgcolumnidCtorArg = MutPtr(0L),
        cbKeyMost = 0u,
        cbVarSegMac = 0u,
        tableid = 0uL,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ConstPtr = this.prgcolumndef

    public operator fun component3(): UInt = this.ccolumn

    public operator fun component4(): MutPtr = this.pidxunicode

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): MutPtr = this.prgcolumnid

    public operator fun component7(): UInt = this.cbKeyMost

    public operator fun component8(): UInt = this.cbVarSegMac

    public operator fun component9(): JetTableid = this.tableid

    public fun copy(cbStruct: UInt = this.cbStruct, prgcolumndef: ConstPtr = this.prgcolumndef, ccolumn: UInt = this.ccolumn, pidxunicode: MutPtr = this.pidxunicode, grbit: UInt = this.grbit, prgcolumnid: MutPtr = this.prgcolumnid, cbKeyMost: UInt = this.cbKeyMost, cbVarSegMac: UInt = this.cbVarSegMac, tableid: JetTableid = this.tableid): JetOpentemporarytable = JetOpentemporarytable(cbStruct = cbStruct, prgcolumndefCtorArg = prgcolumndef, ccolumn = ccolumn, pidxunicodeCtorArg = pidxunicode, grbit = grbit, prgcolumnidCtorArg = prgcolumnid, cbKeyMost = cbKeyMost, cbVarSegMac = cbVarSegMac, tableid = tableid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetOpentemporarytable) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.prgcolumndef != other.prgcolumndef) return false
        if (this.ccolumn != other.ccolumn) return false
        if (this.pidxunicode != other.pidxunicode) return false
        if (this.grbit != other.grbit) return false
        if (this.prgcolumnid != other.prgcolumnid) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.tableid != other.tableid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.prgcolumndef.hashCode()
        result = 31 * result + this.ccolumn.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.prgcolumnid.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        result = 31 * result + this.cbVarSegMac.hashCode()
        result = 31 * result + this.tableid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetOpentemporarytable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetOpentemporarytable> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): JetOpentemporarytable =
                    JetOpentemporarytable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: JetOpentemporarytable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.prgcolumndef)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ccolumn)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pidxunicode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.grbit)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.prgcolumnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbKeyMost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cbVarSegMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.tableid)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            prgcolumndef: ConstPtr = ConstPtr(0L),
            ccolumn: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
            grbit: UInt = 0u,
            prgcolumnid: MutPtr = MutPtr(0L),
            cbKeyMost: UInt = 0u,
            cbVarSegMac: UInt = 0u,
            tableid: JetTableid = 0uL,
        ): JetOpentemporarytable =
            JetOpentemporarytable(
                cbStruct = cbStruct,
                prgcolumndefCtorArg = prgcolumndef,
                ccolumn = ccolumn,
                pidxunicodeCtorArg = pidxunicode,
                grbit = grbit,
                prgcolumnidCtorArg = prgcolumnid,
                cbKeyMost = cbKeyMost,
                cbVarSegMac = cbVarSegMac,
                tableid = tableid,
            )
    }
}

public class JetOpentemporarytable2 internal constructor(
    public var cbStruct: UInt,
    prgcolumndefCtorArg: ConstPtr,
    public var ccolumn: UInt,
    pidxunicodeCtorArg: MutPtr,
    public var grbit: UInt,
    prgcolumnidCtorArg: MutPtr,
    public var cbKeyMost: UInt,
    public var cbVarSegMac: UInt,
    public var tableid: JetTableid,
) {
    public var prgcolumndef: ConstPtr = prgcolumndefCtorArg
        internal set

    public var pidxunicode: MutPtr = pidxunicodeCtorArg
        internal set

    public var prgcolumnid: MutPtr = prgcolumnidCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        prgcolumndefCtorArg = ConstPtr(0L),
        ccolumn = 0u,
        pidxunicodeCtorArg = MutPtr(0L),
        grbit = 0u,
        prgcolumnidCtorArg = MutPtr(0L),
        cbKeyMost = 0u,
        cbVarSegMac = 0u,
        tableid = 0uL,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): ConstPtr = this.prgcolumndef

    public operator fun component3(): UInt = this.ccolumn

    public operator fun component4(): MutPtr = this.pidxunicode

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): MutPtr = this.prgcolumnid

    public operator fun component7(): UInt = this.cbKeyMost

    public operator fun component8(): UInt = this.cbVarSegMac

    public operator fun component9(): JetTableid = this.tableid

    public fun copy(cbStruct: UInt = this.cbStruct, prgcolumndef: ConstPtr = this.prgcolumndef, ccolumn: UInt = this.ccolumn, pidxunicode: MutPtr = this.pidxunicode, grbit: UInt = this.grbit, prgcolumnid: MutPtr = this.prgcolumnid, cbKeyMost: UInt = this.cbKeyMost, cbVarSegMac: UInt = this.cbVarSegMac, tableid: JetTableid = this.tableid): JetOpentemporarytable2 = JetOpentemporarytable2(cbStruct = cbStruct, prgcolumndefCtorArg = prgcolumndef, ccolumn = ccolumn, pidxunicodeCtorArg = pidxunicode, grbit = grbit, prgcolumnidCtorArg = prgcolumnid, cbKeyMost = cbKeyMost, cbVarSegMac = cbVarSegMac, tableid = tableid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetOpentemporarytable2) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.prgcolumndef != other.prgcolumndef) return false
        if (this.ccolumn != other.ccolumn) return false
        if (this.pidxunicode != other.pidxunicode) return false
        if (this.grbit != other.grbit) return false
        if (this.prgcolumnid != other.prgcolumnid) return false
        if (this.cbKeyMost != other.cbKeyMost) return false
        if (this.cbVarSegMac != other.cbVarSegMac) return false
        if (this.tableid != other.tableid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.prgcolumndef.hashCode()
        result = 31 * result + this.ccolumn.hashCode()
        result = 31 * result + this.pidxunicode.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.prgcolumnid.hashCode()
        result = 31 * result + this.cbKeyMost.hashCode()
        result = 31 * result + this.cbVarSegMac.hashCode()
        result = 31 * result + this.tableid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetOpentemporarytable2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetOpentemporarytable2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): JetOpentemporarytable2 =
                    JetOpentemporarytable2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: JetOpentemporarytable2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.prgcolumndef)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ccolumn)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pidxunicode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.grbit)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.prgcolumnid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbKeyMost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cbVarSegMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.tableid)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            prgcolumndef: ConstPtr = ConstPtr(0L),
            ccolumn: UInt = 0u,
            pidxunicode: MutPtr = MutPtr(0L),
            grbit: UInt = 0u,
            prgcolumnid: MutPtr = MutPtr(0L),
            cbKeyMost: UInt = 0u,
            cbVarSegMac: UInt = 0u,
            tableid: JetTableid = 0uL,
        ): JetOpentemporarytable2 =
            JetOpentemporarytable2(
                cbStruct = cbStruct,
                prgcolumndefCtorArg = prgcolumndef,
                ccolumn = ccolumn,
                pidxunicodeCtorArg = pidxunicode,
                grbit = grbit,
                prgcolumnidCtorArg = prgcolumnid,
                cbKeyMost = cbKeyMost,
                cbVarSegMac = cbVarSegMac,
                tableid = tableid,
            )
    }
}

public data class JetOperationcontext(
    public var ulUserID: UInt = 0u,
    public var nOperationID: UByte = 0u,
    public var nOperationType: UByte = 0u,
    public var nClientType: UByte = 0u,
    public var fFlags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetOperationcontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetOperationcontext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): JetOperationcontext =
                    JetOperationcontext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: JetOperationcontext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulUserID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.nOperationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.nOperationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.nClientType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.fFlags)
                }
            }
    }
}

public data class JetRecordlist(
    public var cbStruct: UInt = 0u,
    public var tableid: JetTableid = 0uL,
    public var cRecord: UInt = 0u,
    public var columnidBookmark: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecordlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecordlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): JetRecordlist =
                    JetRecordlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: JetRecordlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tableid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.columnidBookmark)
                }
            }
    }
}

public data class JetRecpos(
    public var cbStruct: UInt = 0u,
    public var centriesLT: UInt = 0u,
    public var centriesInRange: UInt = 0u,
    public var centriesTotal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecpos> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecpos> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JetRecpos =
                    JetRecpos(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: JetRecpos) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.centriesLT)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.centriesInRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.centriesTotal)
                }
            }
    }
}

public data class JetRecpos2(
    public var cbStruct: UInt = 0u,
    public var centriesLTDeprecated: UInt = 0u,
    public var centriesInRangeDeprecated: UInt = 0u,
    public var centriesTotalDeprecated: UInt = 0u,
    public var centriesLT: ULong = 0uL,
    public var centriesTotal: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecpos2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecpos2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): JetRecpos2 =
                    JetRecpos2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: JetRecpos2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.centriesLTDeprecated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.centriesInRangeDeprecated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.centriesTotalDeprecated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.centriesLT)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.centriesTotal)
                }
            }
    }
}

public data class JetRecsize(
    public var cbData: ULong = 0uL,
    public var cbLongValueData: ULong = 0uL,
    public var cbOverhead: ULong = 0uL,
    public var cbLongValueOverhead: ULong = 0uL,
    public var cNonTaggedColumns: ULong = 0uL,
    public var cTaggedColumns: ULong = 0uL,
    public var cLongValues: ULong = 0uL,
    public var cMultiValues: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecsize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecsize> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): JetRecsize =
                    JetRecsize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: JetRecsize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.cbLongValueData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.cbOverhead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.cbLongValueOverhead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cNonTaggedColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.cTaggedColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.cLongValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.cMultiValues)
                }
            }
    }
}

public data class JetRecsize2(
    public var cbData: ULong = 0uL,
    public var cbLongValueData: ULong = 0uL,
    public var cbOverhead: ULong = 0uL,
    public var cbLongValueOverhead: ULong = 0uL,
    public var cNonTaggedColumns: ULong = 0uL,
    public var cTaggedColumns: ULong = 0uL,
    public var cLongValues: ULong = 0uL,
    public var cMultiValues: ULong = 0uL,
    public var cCompressedColumns: ULong = 0uL,
    public var cbDataCompressed: ULong = 0uL,
    public var cbLongValueDataCompressed: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecsize2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRecsize2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): JetRecsize2 =
                    JetRecsize2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: JetRecsize2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.cbLongValueData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.cbOverhead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.cbLongValueOverhead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cNonTaggedColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.cTaggedColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.cLongValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.cMultiValues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.cCompressedColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.cbDataCompressed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.cbLongValueDataCompressed)
                }
            }
    }
}

public data class JetRetinfo(
    public var cbStruct: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
    public var columnidNextTagged: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRetinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRetinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): JetRetinfo =
                    JetRetinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: JetRetinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ibLongValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.itagSequence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.columnidNextTagged)
                }
            }
    }
}

public class JetRetrievecolumn internal constructor(
    public var columnid: UInt,
    pvDataCtorArg: MutPtr,
    public var cbData: UInt,
    public var cbActual: UInt,
    public var grbit: UInt,
    public var ibLongValue: UInt,
    public var itagSequence: UInt,
    public var columnidNextTagged: UInt,
    public var err: Int,
) {
    public var pvData: MutPtr = pvDataCtorArg
        internal set

    public constructor() : this(
        columnid = 0u,
        pvDataCtorArg = MutPtr(0L),
        cbData = 0u,
        cbActual = 0u,
        grbit = 0u,
        ibLongValue = 0u,
        itagSequence = 0u,
        columnidNextTagged = 0u,
        err = 0,
    )

    public operator fun component1(): UInt = this.columnid

    public operator fun component2(): MutPtr = this.pvData

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): UInt = this.cbActual

    public operator fun component5(): UInt = this.grbit

    public operator fun component6(): UInt = this.ibLongValue

    public operator fun component7(): UInt = this.itagSequence

    public operator fun component8(): UInt = this.columnidNextTagged

    public operator fun component9(): Int = this.err

    public fun copy(columnid: UInt = this.columnid, pvData: MutPtr = this.pvData, cbData: UInt = this.cbData, cbActual: UInt = this.cbActual, grbit: UInt = this.grbit, ibLongValue: UInt = this.ibLongValue, itagSequence: UInt = this.itagSequence, columnidNextTagged: UInt = this.columnidNextTagged, err: Int = this.err): JetRetrievecolumn = JetRetrievecolumn(columnid = columnid, pvDataCtorArg = pvData, cbData = cbData, cbActual = cbActual, grbit = grbit, ibLongValue = ibLongValue, itagSequence = itagSequence, columnidNextTagged = columnidNextTagged, err = err)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetRetrievecolumn) return false
        if (this.columnid != other.columnid) return false
        if (this.pvData != other.pvData) return false
        if (this.cbData != other.cbData) return false
        if (this.cbActual != other.cbActual) return false
        if (this.grbit != other.grbit) return false
        if (this.ibLongValue != other.ibLongValue) return false
        if (this.itagSequence != other.itagSequence) return false
        if (this.columnidNextTagged != other.columnidNextTagged) return false
        if (this.err != other.err) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.columnid.hashCode()
        result = 31 * result + this.pvData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.cbActual.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ibLongValue.hashCode()
        result = 31 * result + this.itagSequence.hashCode()
        result = 31 * result + this.columnidNextTagged.hashCode()
        result = 31 * result + this.err.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRetrievecolumn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetRetrievecolumn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): JetRetrievecolumn =
                    JetRetrievecolumn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: JetRetrievecolumn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.columnid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbActual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.grbit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ibLongValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.itagSequence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.columnidNextTagged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.err)
                }
            }

        public operator fun invoke(
            columnid: UInt = 0u,
            pvData: MutPtr = MutPtr(0L),
            cbData: UInt = 0u,
            cbActual: UInt = 0u,
            grbit: UInt = 0u,
            ibLongValue: UInt = 0u,
            itagSequence: UInt = 0u,
            columnidNextTagged: UInt = 0u,
            err: Int = 0,
        ): JetRetrievecolumn =
            JetRetrievecolumn(
                columnid = columnid,
                pvDataCtorArg = pvData,
                cbData = cbData,
                cbActual = cbActual,
                grbit = grbit,
                ibLongValue = ibLongValue,
                itagSequence = itagSequence,
                columnidNextTagged = columnidNextTagged,
                err = err,
            )
    }
}

public class JetRstinfoA internal constructor(
    public var cbStruct: UInt,
    rgrstmapCtorArg: MutPtr,
    public var crstmap: Int,
    public var lgposStop: JetLgpos,
    public var logtimeStop: JetLogtime,
    public var pfnStatus: JetPfnstatus,
) {
    public var rgrstmap: MutPtr = rgrstmapCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        rgrstmapCtorArg = MutPtr(0L),
        crstmap = 0,
        lgposStop = JetLgpos(),
        logtimeStop = JetLogtime(),
        pfnStatus = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr = this.rgrstmap

    public operator fun component3(): Int = this.crstmap

    public operator fun component4(): JetLgpos = this.lgposStop

    public operator fun component5(): JetLogtime = this.logtimeStop

    public operator fun component6(): JetPfnstatus = this.pfnStatus

    public fun copy(cbStruct: UInt = this.cbStruct, rgrstmap: MutPtr = this.rgrstmap, crstmap: Int = this.crstmap, lgposStop: JetLgpos = this.lgposStop, logtimeStop: JetLogtime = this.logtimeStop, pfnStatus: JetPfnstatus = this.pfnStatus): JetRstinfoA = JetRstinfoA(cbStruct = cbStruct, rgrstmapCtorArg = rgrstmap, crstmap = crstmap, lgposStop = lgposStop, logtimeStop = logtimeStop, pfnStatus = pfnStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetRstinfoA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.rgrstmap != other.rgrstmap) return false
        if (this.crstmap != other.crstmap) return false
        if (this.lgposStop != other.lgposStop) return false
        if (this.logtimeStop != other.logtimeStop) return false
        if (this.pfnStatus != other.pfnStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.rgrstmap.hashCode()
        result = 31 * result + this.crstmap.hashCode()
        result = 31 * result + this.lgposStop.hashCode()
        result = 31 * result + this.logtimeStop.hashCode()
        result = 31 * result + this.pfnStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            rgrstmap: MutPtr = MutPtr(0L),
            crstmap: Int = 0,
            lgposStop: JetLgpos = JetLgpos(),
            logtimeStop: JetLogtime = JetLogtime(),
            pfnStatus: JetPfnstatus = null,
        ): JetRstinfoA =
            JetRstinfoA(
                cbStruct = cbStruct,
                rgrstmapCtorArg = rgrstmap,
                crstmap = crstmap,
                lgposStop = lgposStop,
                logtimeStop = logtimeStop,
                pfnStatus = pfnStatus,
            )
    }
}

public class JetRstinfoW internal constructor(
    public var cbStruct: UInt,
    rgrstmapCtorArg: MutPtr,
    public var crstmap: Int,
    public var lgposStop: JetLgpos,
    public var logtimeStop: JetLogtime,
    public var pfnStatus: JetPfnstatus,
) {
    public var rgrstmap: MutPtr = rgrstmapCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        rgrstmapCtorArg = MutPtr(0L),
        crstmap = 0,
        lgposStop = JetLgpos(),
        logtimeStop = JetLogtime(),
        pfnStatus = null,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr = this.rgrstmap

    public operator fun component3(): Int = this.crstmap

    public operator fun component4(): JetLgpos = this.lgposStop

    public operator fun component5(): JetLogtime = this.logtimeStop

    public operator fun component6(): JetPfnstatus = this.pfnStatus

    public fun copy(cbStruct: UInt = this.cbStruct, rgrstmap: MutPtr = this.rgrstmap, crstmap: Int = this.crstmap, lgposStop: JetLgpos = this.lgposStop, logtimeStop: JetLogtime = this.logtimeStop, pfnStatus: JetPfnstatus = this.pfnStatus): JetRstinfoW = JetRstinfoW(cbStruct = cbStruct, rgrstmapCtorArg = rgrstmap, crstmap = crstmap, lgposStop = lgposStop, logtimeStop = logtimeStop, pfnStatus = pfnStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetRstinfoW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.rgrstmap != other.rgrstmap) return false
        if (this.crstmap != other.crstmap) return false
        if (this.lgposStop != other.lgposStop) return false
        if (this.logtimeStop != other.logtimeStop) return false
        if (this.pfnStatus != other.pfnStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.rgrstmap.hashCode()
        result = 31 * result + this.crstmap.hashCode()
        result = 31 * result + this.lgposStop.hashCode()
        result = 31 * result + this.logtimeStop.hashCode()
        result = 31 * result + this.pfnStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            rgrstmap: MutPtr = MutPtr(0L),
            crstmap: Int = 0,
            lgposStop: JetLgpos = JetLgpos(),
            logtimeStop: JetLogtime = JetLogtime(),
            pfnStatus: JetPfnstatus = null,
        ): JetRstinfoW =
            JetRstinfoW(
                cbStruct = cbStruct,
                rgrstmapCtorArg = rgrstmap,
                crstmap = crstmap,
                lgposStop = lgposStop,
                logtimeStop = logtimeStop,
                pfnStatus = pfnStatus,
            )
    }
}

public class JetRstmapA internal constructor(
    szDatabaseNameCtorArg: Pstr,
    szNewDatabaseNameCtorArg: Pstr,
) {
    public var szDatabaseName: Pstr = szDatabaseNameCtorArg
        internal set

    public var szNewDatabaseName: Pstr = szNewDatabaseNameCtorArg
        internal set

    public constructor() : this(
        szDatabaseNameCtorArg = MutPtr(0L),
        szNewDatabaseNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.szDatabaseName

    public operator fun component2(): Pstr = this.szNewDatabaseName

    public fun copy(szDatabaseName: Pstr = this.szDatabaseName, szNewDatabaseName: Pstr = this.szNewDatabaseName): JetRstmapA = JetRstmapA(szDatabaseNameCtorArg = szDatabaseName, szNewDatabaseNameCtorArg = szNewDatabaseName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetRstmapA) return false
        if (this.szDatabaseName != other.szDatabaseName) return false
        if (this.szNewDatabaseName != other.szNewDatabaseName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDatabaseName.hashCode()
        result = 31 * result + this.szNewDatabaseName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szDatabaseName: Pstr = MutPtr(0L),
            szNewDatabaseName: Pstr = MutPtr(0L),
        ): JetRstmapA =
            JetRstmapA(
                szDatabaseNameCtorArg = szDatabaseName,
                szNewDatabaseNameCtorArg = szNewDatabaseName,
            )
    }
}

public class JetRstmapW internal constructor(
    szDatabaseNameCtorArg: Pwstr,
    szNewDatabaseNameCtorArg: Pwstr,
) {
    public var szDatabaseName: Pwstr = szDatabaseNameCtorArg
        internal set

    public var szNewDatabaseName: Pwstr = szNewDatabaseNameCtorArg
        internal set

    public constructor() : this(
        szDatabaseNameCtorArg = MutPtr(0L),
        szNewDatabaseNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.szDatabaseName

    public operator fun component2(): Pwstr = this.szNewDatabaseName

    public fun copy(szDatabaseName: Pwstr = this.szDatabaseName, szNewDatabaseName: Pwstr = this.szNewDatabaseName): JetRstmapW = JetRstmapW(szDatabaseNameCtorArg = szDatabaseName, szNewDatabaseNameCtorArg = szNewDatabaseName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetRstmapW) return false
        if (this.szDatabaseName != other.szDatabaseName) return false
        if (this.szNewDatabaseName != other.szNewDatabaseName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDatabaseName.hashCode()
        result = 31 * result + this.szNewDatabaseName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szDatabaseName: Pwstr = MutPtr(0L),
            szNewDatabaseName: Pwstr = MutPtr(0L),
        ): JetRstmapW =
            JetRstmapW(
                szDatabaseNameCtorArg = szDatabaseName,
                szNewDatabaseNameCtorArg = szNewDatabaseName,
            )
    }
}

public class JetSetcolumn internal constructor(
    public var columnid: UInt,
    pvDataCtorArg: ConstPtr,
    public var cbData: UInt,
    public var grbit: UInt,
    public var ibLongValue: UInt,
    public var itagSequence: UInt,
    public var err: Int,
) {
    public var pvData: ConstPtr = pvDataCtorArg
        internal set

    public constructor() : this(
        columnid = 0u,
        pvDataCtorArg = ConstPtr(0L),
        cbData = 0u,
        grbit = 0u,
        ibLongValue = 0u,
        itagSequence = 0u,
        err = 0,
    )

    public operator fun component1(): UInt = this.columnid

    public operator fun component2(): ConstPtr = this.pvData

    public operator fun component3(): UInt = this.cbData

    public operator fun component4(): UInt = this.grbit

    public operator fun component5(): UInt = this.ibLongValue

    public operator fun component6(): UInt = this.itagSequence

    public operator fun component7(): Int = this.err

    public fun copy(columnid: UInt = this.columnid, pvData: ConstPtr = this.pvData, cbData: UInt = this.cbData, grbit: UInt = this.grbit, ibLongValue: UInt = this.ibLongValue, itagSequence: UInt = this.itagSequence, err: Int = this.err): JetSetcolumn = JetSetcolumn(columnid = columnid, pvDataCtorArg = pvData, cbData = cbData, grbit = grbit, ibLongValue = ibLongValue, itagSequence = itagSequence, err = err)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetSetcolumn) return false
        if (this.columnid != other.columnid) return false
        if (this.pvData != other.pvData) return false
        if (this.cbData != other.cbData) return false
        if (this.grbit != other.grbit) return false
        if (this.ibLongValue != other.ibLongValue) return false
        if (this.itagSequence != other.itagSequence) return false
        if (this.err != other.err) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.columnid.hashCode()
        result = 31 * result + this.pvData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.ibLongValue.hashCode()
        result = 31 * result + this.itagSequence.hashCode()
        result = 31 * result + this.err.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSetcolumn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSetcolumn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): JetSetcolumn =
                    JetSetcolumn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: JetSetcolumn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.columnid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.grbit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ibLongValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.itagSequence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.err)
                }
            }

        public operator fun invoke(
            columnid: UInt = 0u,
            pvData: ConstPtr = ConstPtr(0L),
            cbData: UInt = 0u,
            grbit: UInt = 0u,
            ibLongValue: UInt = 0u,
            itagSequence: UInt = 0u,
            err: Int = 0,
        ): JetSetcolumn =
            JetSetcolumn(
                columnid = columnid,
                pvDataCtorArg = pvData,
                cbData = cbData,
                grbit = grbit,
                ibLongValue = ibLongValue,
                itagSequence = itagSequence,
                err = err,
            )
    }
}

public data class JetSetinfo(
    public var cbStruct: UInt = 0u,
    public var ibLongValue: UInt = 0u,
    public var itagSequence: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSetinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSetinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): JetSetinfo =
                    JetSetinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JetSetinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ibLongValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.itagSequence)
                }
            }
    }
}

public class JetSetsysparamA internal constructor(
    public var paramid: UInt,
    public var lParam: JetApiPtr,
    szCtorArg: Pcstr,
    public var err: Int,
) {
    public var sz: Pcstr = szCtorArg
        internal set

    public constructor() : this(
        paramid = 0u,
        lParam = 0uL,
        szCtorArg = ConstPtr(0L),
        err = 0,
    )

    public operator fun component1(): UInt = this.paramid

    public operator fun component2(): JetApiPtr = this.lParam

    public operator fun component3(): Pcstr = this.sz

    public operator fun component4(): Int = this.err

    public fun copy(paramid: UInt = this.paramid, lParam: JetApiPtr = this.lParam, sz: Pcstr = this.sz, err: Int = this.err): JetSetsysparamA = JetSetsysparamA(paramid = paramid, lParam = lParam, szCtorArg = sz, err = err)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetSetsysparamA) return false
        if (this.paramid != other.paramid) return false
        if (this.lParam != other.lParam) return false
        if (this.sz != other.sz) return false
        if (this.err != other.err) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.paramid.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.sz.hashCode()
        result = 31 * result + this.err.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            paramid: UInt = 0u,
            lParam: JetApiPtr = 0uL,
            sz: Pcstr = ConstPtr(0L),
            err: Int = 0,
        ): JetSetsysparamA =
            JetSetsysparamA(
                paramid = paramid,
                lParam = lParam,
                szCtorArg = sz,
                err = err,
            )
    }
}

public class JetSetsysparamW internal constructor(
    public var paramid: UInt,
    public var lParam: JetApiPtr,
    szCtorArg: Pcwstr,
    public var err: Int,
) {
    public var sz: Pcwstr = szCtorArg
        internal set

    public constructor() : this(
        paramid = 0u,
        lParam = 0uL,
        szCtorArg = ConstPtr(0L),
        err = 0,
    )

    public operator fun component1(): UInt = this.paramid

    public operator fun component2(): JetApiPtr = this.lParam

    public operator fun component3(): Pcwstr = this.sz

    public operator fun component4(): Int = this.err

    public fun copy(paramid: UInt = this.paramid, lParam: JetApiPtr = this.lParam, sz: Pcwstr = this.sz, err: Int = this.err): JetSetsysparamW = JetSetsysparamW(paramid = paramid, lParam = lParam, szCtorArg = sz, err = err)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetSetsysparamW) return false
        if (this.paramid != other.paramid) return false
        if (this.lParam != other.lParam) return false
        if (this.sz != other.sz) return false
        if (this.err != other.err) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.paramid.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.sz.hashCode()
        result = 31 * result + this.err.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            paramid: UInt = 0u,
            lParam: JetApiPtr = 0uL,
            sz: Pcwstr = ConstPtr(0L),
            err: Int = 0,
        ): JetSetsysparamW =
            JetSetsysparamW(
                paramid = paramid,
                lParam = lParam,
                szCtorArg = sz,
                err = err,
            )
    }
}

public data class JetSignature(
    public var ulRandom: UInt = 0u,
    public var logtimeCreate: JetLogtime = JetLogtime(),
    public var szComputerName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetSignature) return false
        if (this.ulRandom != other.ulRandom) return false
        if (this.logtimeCreate != other.logtimeCreate) return false
        if (!this.szComputerName.contentEquals(other.szComputerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulRandom.hashCode()
        result = 31 * result + this.logtimeCreate.hashCode()
        result = 31 * result + this.szComputerName.contentHashCode()
        return result
    }
}

public data class JetSnprog(
    public var cbStruct: UInt = 0u,
    public var cunitDone: UInt = 0u,
    public var cunitTotal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSnprog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSnprog> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): JetSnprog =
                    JetSnprog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JetSnprog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cunitDone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cunitTotal)
                }
            }
    }
}

public data class JetSpacehints(
    public var cbStruct: UInt = 0u,
    public var ulInitialDensity: UInt = 0u,
    public var cbInitial: UInt = 0u,
    public var grbit: UInt = 0u,
    public var ulMaintDensity: UInt = 0u,
    public var ulGrowth: UInt = 0u,
    public var cbMinExtent: UInt = 0u,
    public var cbMaxExtent: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSpacehints> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetSpacehints> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): JetSpacehints =
                    JetSpacehints(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: JetSpacehints) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulInitialDensity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbInitial)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.grbit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulMaintDensity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulGrowth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbMinExtent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbMaxExtent)
                }
            }
    }
}

public class JetTablecreate2A internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pstr,
    szTemplateTableNameCtorArg: Pstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    szCallbackCtorArg: Pstr,
    public var cbtyp: UInt,
    public var grbit: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public var szCallback: Pstr = szCallbackCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        szCallbackCtorArg = MutPtr(0L),
        cbtyp = 0u,
        grbit = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szTableName

    public operator fun component3(): Pstr = this.szTemplateTableName

    public operator fun component4(): UInt = this.ulPages

    public operator fun component5(): UInt = this.ulDensity

    public operator fun component6(): MutPtr = this.rgcolumncreate

    public operator fun component7(): UInt = this.cColumns

    public operator fun component8(): MutPtr = this.rgindexcreate

    public operator fun component9(): UInt = this.cIndexes

    public operator fun component10(): Pstr = this.szCallback

    public operator fun component11(): UInt = this.cbtyp

    public operator fun component12(): UInt = this.grbit

    public operator fun component13(): JetTableid = this.tableid

    public operator fun component14(): UInt = this.cCreated

    public fun copy(cbStruct: UInt = this.cbStruct, szTableName: Pstr = this.szTableName, szTemplateTableName: Pstr = this.szTemplateTableName, ulPages: UInt = this.ulPages, ulDensity: UInt = this.ulDensity, rgcolumncreate: MutPtr = this.rgcolumncreate, cColumns: UInt = this.cColumns, rgindexcreate: MutPtr = this.rgindexcreate, cIndexes: UInt = this.cIndexes, szCallback: Pstr = this.szCallback, cbtyp: UInt = this.cbtyp, grbit: UInt = this.grbit, tableid: JetTableid = this.tableid, cCreated: UInt = this.cCreated): JetTablecreate2A = JetTablecreate2A(cbStruct = cbStruct, szTableNameCtorArg = szTableName, szTemplateTableNameCtorArg = szTemplateTableName, ulPages = ulPages, ulDensity = ulDensity, rgcolumncreateCtorArg = rgcolumncreate, cColumns = cColumns, rgindexcreateCtorArg = rgindexcreate, cIndexes = cIndexes, szCallbackCtorArg = szCallback, cbtyp = cbtyp, grbit = grbit, tableid = tableid, cCreated = cCreated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetTablecreate2A) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szTableName != other.szTableName) return false
        if (this.szTemplateTableName != other.szTemplateTableName) return false
        if (this.ulPages != other.ulPages) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.rgcolumncreate != other.rgcolumncreate) return false
        if (this.cColumns != other.cColumns) return false
        if (this.rgindexcreate != other.rgindexcreate) return false
        if (this.cIndexes != other.cIndexes) return false
        if (this.szCallback != other.szCallback) return false
        if (this.cbtyp != other.cbtyp) return false
        if (this.grbit != other.grbit) return false
        if (this.tableid != other.tableid) return false
        if (this.cCreated != other.cCreated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szTableName.hashCode()
        result = 31 * result + this.szTemplateTableName.hashCode()
        result = 31 * result + this.ulPages.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.rgcolumncreate.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.rgindexcreate.hashCode()
        result = 31 * result + this.cIndexes.hashCode()
        result = 31 * result + this.szCallback.hashCode()
        result = 31 * result + this.cbtyp.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.tableid.hashCode()
        result = 31 * result + this.cCreated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pstr = MutPtr(0L),
            szTemplateTableName: Pstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            szCallback: Pstr = MutPtr(0L),
            cbtyp: UInt = 0u,
            grbit: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreate2A =
            JetTablecreate2A(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                szCallbackCtorArg = szCallback,
                cbtyp = cbtyp,
                grbit = grbit,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreate2W internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pwstr,
    szTemplateTableNameCtorArg: Pwstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    szCallbackCtorArg: Pwstr,
    public var cbtyp: UInt,
    public var grbit: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pwstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pwstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public var szCallback: Pwstr = szCallbackCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        szCallbackCtorArg = MutPtr(0L),
        cbtyp = 0u,
        grbit = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szTableName

    public operator fun component3(): Pwstr = this.szTemplateTableName

    public operator fun component4(): UInt = this.ulPages

    public operator fun component5(): UInt = this.ulDensity

    public operator fun component6(): MutPtr = this.rgcolumncreate

    public operator fun component7(): UInt = this.cColumns

    public operator fun component8(): MutPtr = this.rgindexcreate

    public operator fun component9(): UInt = this.cIndexes

    public operator fun component10(): Pwstr = this.szCallback

    public operator fun component11(): UInt = this.cbtyp

    public operator fun component12(): UInt = this.grbit

    public operator fun component13(): JetTableid = this.tableid

    public operator fun component14(): UInt = this.cCreated

    public fun copy(cbStruct: UInt = this.cbStruct, szTableName: Pwstr = this.szTableName, szTemplateTableName: Pwstr = this.szTemplateTableName, ulPages: UInt = this.ulPages, ulDensity: UInt = this.ulDensity, rgcolumncreate: MutPtr = this.rgcolumncreate, cColumns: UInt = this.cColumns, rgindexcreate: MutPtr = this.rgindexcreate, cIndexes: UInt = this.cIndexes, szCallback: Pwstr = this.szCallback, cbtyp: UInt = this.cbtyp, grbit: UInt = this.grbit, tableid: JetTableid = this.tableid, cCreated: UInt = this.cCreated): JetTablecreate2W = JetTablecreate2W(cbStruct = cbStruct, szTableNameCtorArg = szTableName, szTemplateTableNameCtorArg = szTemplateTableName, ulPages = ulPages, ulDensity = ulDensity, rgcolumncreateCtorArg = rgcolumncreate, cColumns = cColumns, rgindexcreateCtorArg = rgindexcreate, cIndexes = cIndexes, szCallbackCtorArg = szCallback, cbtyp = cbtyp, grbit = grbit, tableid = tableid, cCreated = cCreated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetTablecreate2W) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szTableName != other.szTableName) return false
        if (this.szTemplateTableName != other.szTemplateTableName) return false
        if (this.ulPages != other.ulPages) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.rgcolumncreate != other.rgcolumncreate) return false
        if (this.cColumns != other.cColumns) return false
        if (this.rgindexcreate != other.rgindexcreate) return false
        if (this.cIndexes != other.cIndexes) return false
        if (this.szCallback != other.szCallback) return false
        if (this.cbtyp != other.cbtyp) return false
        if (this.grbit != other.grbit) return false
        if (this.tableid != other.tableid) return false
        if (this.cCreated != other.cCreated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szTableName.hashCode()
        result = 31 * result + this.szTemplateTableName.hashCode()
        result = 31 * result + this.ulPages.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.rgcolumncreate.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.rgindexcreate.hashCode()
        result = 31 * result + this.cIndexes.hashCode()
        result = 31 * result + this.szCallback.hashCode()
        result = 31 * result + this.cbtyp.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.tableid.hashCode()
        result = 31 * result + this.cCreated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pwstr = MutPtr(0L),
            szTemplateTableName: Pwstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            szCallback: Pwstr = MutPtr(0L),
            cbtyp: UInt = 0u,
            grbit: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreate2W =
            JetTablecreate2W(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                szCallbackCtorArg = szCallback,
                cbtyp = cbtyp,
                grbit = grbit,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreate3A internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pstr,
    szTemplateTableNameCtorArg: Pstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    szCallbackCtorArg: Pstr,
    public var cbtyp: UInt,
    public var grbit: UInt,
    pSeqSpacehintsCtorArg: MutPtr,
    pLVSpacehintsCtorArg: MutPtr,
    public var cbSeparateLV: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public var szCallback: Pstr = szCallbackCtorArg
        internal set

    public var pSeqSpacehints: MutPtr = pSeqSpacehintsCtorArg
        internal set

    public var pLVSpacehints: MutPtr = pLVSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        szCallbackCtorArg = MutPtr(0L),
        cbtyp = 0u,
        grbit = 0u,
        pSeqSpacehintsCtorArg = MutPtr(0L),
        pLVSpacehintsCtorArg = MutPtr(0L),
        cbSeparateLV = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pstr = MutPtr(0L),
            szTemplateTableName: Pstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            szCallback: Pstr = MutPtr(0L),
            cbtyp: UInt = 0u,
            grbit: UInt = 0u,
            pSeqSpacehints: MutPtr = MutPtr(0L),
            pLVSpacehints: MutPtr = MutPtr(0L),
            cbSeparateLV: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreate3A =
            JetTablecreate3A(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                szCallbackCtorArg = szCallback,
                cbtyp = cbtyp,
                grbit = grbit,
                pSeqSpacehintsCtorArg = pSeqSpacehints,
                pLVSpacehintsCtorArg = pLVSpacehints,
                cbSeparateLV = cbSeparateLV,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreate3W internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pwstr,
    szTemplateTableNameCtorArg: Pwstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    szCallbackCtorArg: Pwstr,
    public var cbtyp: UInt,
    public var grbit: UInt,
    pSeqSpacehintsCtorArg: MutPtr,
    pLVSpacehintsCtorArg: MutPtr,
    public var cbSeparateLV: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pwstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pwstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public var szCallback: Pwstr = szCallbackCtorArg
        internal set

    public var pSeqSpacehints: MutPtr = pSeqSpacehintsCtorArg
        internal set

    public var pLVSpacehints: MutPtr = pLVSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        szCallbackCtorArg = MutPtr(0L),
        cbtyp = 0u,
        grbit = 0u,
        pSeqSpacehintsCtorArg = MutPtr(0L),
        pLVSpacehintsCtorArg = MutPtr(0L),
        cbSeparateLV = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pwstr = MutPtr(0L),
            szTemplateTableName: Pwstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            szCallback: Pwstr = MutPtr(0L),
            cbtyp: UInt = 0u,
            grbit: UInt = 0u,
            pSeqSpacehints: MutPtr = MutPtr(0L),
            pLVSpacehints: MutPtr = MutPtr(0L),
            cbSeparateLV: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreate3W =
            JetTablecreate3W(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                szCallbackCtorArg = szCallback,
                cbtyp = cbtyp,
                grbit = grbit,
                pSeqSpacehintsCtorArg = pSeqSpacehints,
                pLVSpacehintsCtorArg = pLVSpacehints,
                cbSeparateLV = cbSeparateLV,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreate4A internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pstr,
    szTemplateTableNameCtorArg: Pstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    szCallbackCtorArg: Pstr,
    public var cbtyp: UInt,
    public var grbit: UInt,
    pSeqSpacehintsCtorArg: MutPtr,
    pLVSpacehintsCtorArg: MutPtr,
    public var cbSeparateLV: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public var szCallback: Pstr = szCallbackCtorArg
        internal set

    public var pSeqSpacehints: MutPtr = pSeqSpacehintsCtorArg
        internal set

    public var pLVSpacehints: MutPtr = pLVSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        szCallbackCtorArg = MutPtr(0L),
        cbtyp = 0u,
        grbit = 0u,
        pSeqSpacehintsCtorArg = MutPtr(0L),
        pLVSpacehintsCtorArg = MutPtr(0L),
        cbSeparateLV = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pstr = MutPtr(0L),
            szTemplateTableName: Pstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            szCallback: Pstr = MutPtr(0L),
            cbtyp: UInt = 0u,
            grbit: UInt = 0u,
            pSeqSpacehints: MutPtr = MutPtr(0L),
            pLVSpacehints: MutPtr = MutPtr(0L),
            cbSeparateLV: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreate4A =
            JetTablecreate4A(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                szCallbackCtorArg = szCallback,
                cbtyp = cbtyp,
                grbit = grbit,
                pSeqSpacehintsCtorArg = pSeqSpacehints,
                pLVSpacehintsCtorArg = pLVSpacehints,
                cbSeparateLV = cbSeparateLV,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreate4W internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pwstr,
    szTemplateTableNameCtorArg: Pwstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    szCallbackCtorArg: Pwstr,
    public var cbtyp: UInt,
    public var grbit: UInt,
    pSeqSpacehintsCtorArg: MutPtr,
    pLVSpacehintsCtorArg: MutPtr,
    public var cbSeparateLV: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pwstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pwstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public var szCallback: Pwstr = szCallbackCtorArg
        internal set

    public var pSeqSpacehints: MutPtr = pSeqSpacehintsCtorArg
        internal set

    public var pLVSpacehints: MutPtr = pLVSpacehintsCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        szCallbackCtorArg = MutPtr(0L),
        cbtyp = 0u,
        grbit = 0u,
        pSeqSpacehintsCtorArg = MutPtr(0L),
        pLVSpacehintsCtorArg = MutPtr(0L),
        cbSeparateLV = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pwstr = MutPtr(0L),
            szTemplateTableName: Pwstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            szCallback: Pwstr = MutPtr(0L),
            cbtyp: UInt = 0u,
            grbit: UInt = 0u,
            pSeqSpacehints: MutPtr = MutPtr(0L),
            pLVSpacehints: MutPtr = MutPtr(0L),
            cbSeparateLV: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreate4W =
            JetTablecreate4W(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                szCallbackCtorArg = szCallback,
                cbtyp = cbtyp,
                grbit = grbit,
                pSeqSpacehintsCtorArg = pSeqSpacehints,
                pLVSpacehintsCtorArg = pLVSpacehints,
                cbSeparateLV = cbSeparateLV,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreateA internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pstr,
    szTemplateTableNameCtorArg: Pstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    public var grbit: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        grbit = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pstr = this.szTableName

    public operator fun component3(): Pstr = this.szTemplateTableName

    public operator fun component4(): UInt = this.ulPages

    public operator fun component5(): UInt = this.ulDensity

    public operator fun component6(): MutPtr = this.rgcolumncreate

    public operator fun component7(): UInt = this.cColumns

    public operator fun component8(): MutPtr = this.rgindexcreate

    public operator fun component9(): UInt = this.cIndexes

    public operator fun component10(): UInt = this.grbit

    public operator fun component11(): JetTableid = this.tableid

    public operator fun component12(): UInt = this.cCreated

    public fun copy(cbStruct: UInt = this.cbStruct, szTableName: Pstr = this.szTableName, szTemplateTableName: Pstr = this.szTemplateTableName, ulPages: UInt = this.ulPages, ulDensity: UInt = this.ulDensity, rgcolumncreate: MutPtr = this.rgcolumncreate, cColumns: UInt = this.cColumns, rgindexcreate: MutPtr = this.rgindexcreate, cIndexes: UInt = this.cIndexes, grbit: UInt = this.grbit, tableid: JetTableid = this.tableid, cCreated: UInt = this.cCreated): JetTablecreateA = JetTablecreateA(cbStruct = cbStruct, szTableNameCtorArg = szTableName, szTemplateTableNameCtorArg = szTemplateTableName, ulPages = ulPages, ulDensity = ulDensity, rgcolumncreateCtorArg = rgcolumncreate, cColumns = cColumns, rgindexcreateCtorArg = rgindexcreate, cIndexes = cIndexes, grbit = grbit, tableid = tableid, cCreated = cCreated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetTablecreateA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szTableName != other.szTableName) return false
        if (this.szTemplateTableName != other.szTemplateTableName) return false
        if (this.ulPages != other.ulPages) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.rgcolumncreate != other.rgcolumncreate) return false
        if (this.cColumns != other.cColumns) return false
        if (this.rgindexcreate != other.rgindexcreate) return false
        if (this.cIndexes != other.cIndexes) return false
        if (this.grbit != other.grbit) return false
        if (this.tableid != other.tableid) return false
        if (this.cCreated != other.cCreated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szTableName.hashCode()
        result = 31 * result + this.szTemplateTableName.hashCode()
        result = 31 * result + this.ulPages.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.rgcolumncreate.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.rgindexcreate.hashCode()
        result = 31 * result + this.cIndexes.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.tableid.hashCode()
        result = 31 * result + this.cCreated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pstr = MutPtr(0L),
            szTemplateTableName: Pstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            grbit: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreateA =
            JetTablecreateA(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                grbit = grbit,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public class JetTablecreateW internal constructor(
    public var cbStruct: UInt,
    szTableNameCtorArg: Pwstr,
    szTemplateTableNameCtorArg: Pwstr,
    public var ulPages: UInt,
    public var ulDensity: UInt,
    rgcolumncreateCtorArg: MutPtr,
    public var cColumns: UInt,
    rgindexcreateCtorArg: MutPtr,
    public var cIndexes: UInt,
    public var grbit: UInt,
    public var tableid: JetTableid,
    public var cCreated: UInt,
) {
    public var szTableName: Pwstr = szTableNameCtorArg
        internal set

    public var szTemplateTableName: Pwstr = szTemplateTableNameCtorArg
        internal set

    public var rgcolumncreate: MutPtr = rgcolumncreateCtorArg
        internal set

    public var rgindexcreate: MutPtr = rgindexcreateCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        szTableNameCtorArg = MutPtr(0L),
        szTemplateTableNameCtorArg = MutPtr(0L),
        ulPages = 0u,
        ulDensity = 0u,
        rgcolumncreateCtorArg = MutPtr(0L),
        cColumns = 0u,
        rgindexcreateCtorArg = MutPtr(0L),
        cIndexes = 0u,
        grbit = 0u,
        tableid = 0uL,
        cCreated = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.szTableName

    public operator fun component3(): Pwstr = this.szTemplateTableName

    public operator fun component4(): UInt = this.ulPages

    public operator fun component5(): UInt = this.ulDensity

    public operator fun component6(): MutPtr = this.rgcolumncreate

    public operator fun component7(): UInt = this.cColumns

    public operator fun component8(): MutPtr = this.rgindexcreate

    public operator fun component9(): UInt = this.cIndexes

    public operator fun component10(): UInt = this.grbit

    public operator fun component11(): JetTableid = this.tableid

    public operator fun component12(): UInt = this.cCreated

    public fun copy(cbStruct: UInt = this.cbStruct, szTableName: Pwstr = this.szTableName, szTemplateTableName: Pwstr = this.szTemplateTableName, ulPages: UInt = this.ulPages, ulDensity: UInt = this.ulDensity, rgcolumncreate: MutPtr = this.rgcolumncreate, cColumns: UInt = this.cColumns, rgindexcreate: MutPtr = this.rgindexcreate, cIndexes: UInt = this.cIndexes, grbit: UInt = this.grbit, tableid: JetTableid = this.tableid, cCreated: UInt = this.cCreated): JetTablecreateW = JetTablecreateW(cbStruct = cbStruct, szTableNameCtorArg = szTableName, szTemplateTableNameCtorArg = szTemplateTableName, ulPages = ulPages, ulDensity = ulDensity, rgcolumncreateCtorArg = rgcolumncreate, cColumns = cColumns, rgindexcreateCtorArg = rgindexcreate, cIndexes = cIndexes, grbit = grbit, tableid = tableid, cCreated = cCreated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetTablecreateW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.szTableName != other.szTableName) return false
        if (this.szTemplateTableName != other.szTemplateTableName) return false
        if (this.ulPages != other.ulPages) return false
        if (this.ulDensity != other.ulDensity) return false
        if (this.rgcolumncreate != other.rgcolumncreate) return false
        if (this.cColumns != other.cColumns) return false
        if (this.rgindexcreate != other.rgindexcreate) return false
        if (this.cIndexes != other.cIndexes) return false
        if (this.grbit != other.grbit) return false
        if (this.tableid != other.tableid) return false
        if (this.cCreated != other.cCreated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.szTableName.hashCode()
        result = 31 * result + this.szTemplateTableName.hashCode()
        result = 31 * result + this.ulPages.hashCode()
        result = 31 * result + this.ulDensity.hashCode()
        result = 31 * result + this.rgcolumncreate.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.rgindexcreate.hashCode()
        result = 31 * result + this.cIndexes.hashCode()
        result = 31 * result + this.grbit.hashCode()
        result = 31 * result + this.tableid.hashCode()
        result = 31 * result + this.cCreated.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            szTableName: Pwstr = MutPtr(0L),
            szTemplateTableName: Pwstr = MutPtr(0L),
            ulPages: UInt = 0u,
            ulDensity: UInt = 0u,
            rgcolumncreate: MutPtr = MutPtr(0L),
            cColumns: UInt = 0u,
            rgindexcreate: MutPtr = MutPtr(0L),
            cIndexes: UInt = 0u,
            grbit: UInt = 0u,
            tableid: JetTableid = 0uL,
            cCreated: UInt = 0u,
        ): JetTablecreateW =
            JetTablecreateW(
                cbStruct = cbStruct,
                szTableNameCtorArg = szTableName,
                szTemplateTableNameCtorArg = szTemplateTableName,
                ulPages = ulPages,
                ulDensity = ulDensity,
                rgcolumncreateCtorArg = rgcolumncreate,
                cColumns = cColumns,
                rgindexcreateCtorArg = rgindexcreate,
                cIndexes = cIndexes,
                grbit = grbit,
                tableid = tableid,
                cCreated = cCreated,
            )
    }
}

public data class JetThreadstats(
    public var cbStruct: UInt = 0u,
    public var cPageReferenced: UInt = 0u,
    public var cPageRead: UInt = 0u,
    public var cPagePreread: UInt = 0u,
    public var cPageDirtied: UInt = 0u,
    public var cPageRedirtied: UInt = 0u,
    public var cLogRecord: UInt = 0u,
    public var cbLogRecord: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetThreadstats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetThreadstats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): JetThreadstats =
                    JetThreadstats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: JetThreadstats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cPageReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cPageRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cPagePreread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cPageDirtied)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cPageRedirtied)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cLogRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbLogRecord)
                }
            }
    }
}

public data class JetThreadstats2(
    public var cbStruct: UInt = 0u,
    public var cPageReferenced: UInt = 0u,
    public var cPageRead: UInt = 0u,
    public var cPagePreread: UInt = 0u,
    public var cPageDirtied: UInt = 0u,
    public var cPageRedirtied: UInt = 0u,
    public var cLogRecord: UInt = 0u,
    public var cbLogRecord: UInt = 0u,
    public var cusecPageCacheMiss: ULong = 0uL,
    public var cPageCacheMiss: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetThreadstats2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetThreadstats2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): JetThreadstats2 =
                    JetThreadstats2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: JetThreadstats2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cPageReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cPageRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cPagePreread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cPageDirtied)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cPageRedirtied)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cLogRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbLogRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cusecPageCacheMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cPageCacheMiss)
                }
            }
    }
}

public data class JetTuplelimits(
    public var chLengthMin: UInt = 0u,
    public var chLengthMax: UInt = 0u,
    public var chToIndexMax: UInt = 0u,
    public var cchIncrement: UInt = 0u,
    public var ichStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetTuplelimits> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetTuplelimits> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): JetTuplelimits =
                    JetTuplelimits(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: JetTuplelimits) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.chLengthMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.chLengthMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.chToIndexMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cchIncrement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ichStart)
                }
            }
    }
}

public data class JetUnicodeindex(
    public var lcid: UInt = 0u,
    public var dwMapFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetUnicodeindex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JetUnicodeindex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): JetUnicodeindex =
                    JetUnicodeindex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: JetUnicodeindex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lcid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMapFlags)
                }
            }
    }
}

public class JetUnicodeindex2 internal constructor(
    szLocaleNameCtorArg: Pwstr,
    public var dwMapFlags: UInt,
) {
    public var szLocaleName: Pwstr = szLocaleNameCtorArg
        internal set

    public constructor() : this(
        szLocaleNameCtorArg = MutPtr(0L),
        dwMapFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.szLocaleName

    public operator fun component2(): UInt = this.dwMapFlags

    public fun copy(szLocaleName: Pwstr = this.szLocaleName, dwMapFlags: UInt = this.dwMapFlags): JetUnicodeindex2 = JetUnicodeindex2(szLocaleNameCtorArg = szLocaleName, dwMapFlags = dwMapFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetUnicodeindex2) return false
        if (this.szLocaleName != other.szLocaleName) return false
        if (this.dwMapFlags != other.dwMapFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szLocaleName.hashCode()
        result = 31 * result + this.dwMapFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szLocaleName: Pwstr = MutPtr(0L),
            dwMapFlags: UInt = 0u,
        ): JetUnicodeindex2 =
            JetUnicodeindex2(
                szLocaleNameCtorArg = szLocaleName,
                dwMapFlags = dwMapFlags,
            )
    }
}

public class JetUserdefineddefaultA internal constructor(
    szCallbackCtorArg: Pstr,
    pbUserDataCtorArg: MutPtr,
    public var cbUserData: UInt,
    szDependantColumnsCtorArg: Pstr,
) {
    public var szCallback: Pstr = szCallbackCtorArg
        internal set

    public var pbUserData: MutPtr = pbUserDataCtorArg
        internal set

    public var szDependantColumns: Pstr = szDependantColumnsCtorArg
        internal set

    public constructor() : this(
        szCallbackCtorArg = MutPtr(0L),
        pbUserDataCtorArg = MutPtr(0L),
        cbUserData = 0u,
        szDependantColumnsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.szCallback

    public operator fun component2(): MutPtr = this.pbUserData

    public operator fun component3(): UInt = this.cbUserData

    public operator fun component4(): Pstr = this.szDependantColumns

    public fun copy(szCallback: Pstr = this.szCallback, pbUserData: MutPtr = this.pbUserData, cbUserData: UInt = this.cbUserData, szDependantColumns: Pstr = this.szDependantColumns): JetUserdefineddefaultA = JetUserdefineddefaultA(szCallbackCtorArg = szCallback, pbUserDataCtorArg = pbUserData, cbUserData = cbUserData, szDependantColumnsCtorArg = szDependantColumns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetUserdefineddefaultA) return false
        if (this.szCallback != other.szCallback) return false
        if (this.pbUserData != other.pbUserData) return false
        if (this.cbUserData != other.cbUserData) return false
        if (this.szDependantColumns != other.szDependantColumns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szCallback.hashCode()
        result = 31 * result + this.pbUserData.hashCode()
        result = 31 * result + this.cbUserData.hashCode()
        result = 31 * result + this.szDependantColumns.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szCallback: Pstr = MutPtr(0L),
            pbUserData: MutPtr = MutPtr(0L),
            cbUserData: UInt = 0u,
            szDependantColumns: Pstr = MutPtr(0L),
        ): JetUserdefineddefaultA =
            JetUserdefineddefaultA(
                szCallbackCtorArg = szCallback,
                pbUserDataCtorArg = pbUserData,
                cbUserData = cbUserData,
                szDependantColumnsCtorArg = szDependantColumns,
            )
    }
}

public class JetUserdefineddefaultW internal constructor(
    szCallbackCtorArg: Pwstr,
    pbUserDataCtorArg: MutPtr,
    public var cbUserData: UInt,
    szDependantColumnsCtorArg: Pwstr,
) {
    public var szCallback: Pwstr = szCallbackCtorArg
        internal set

    public var pbUserData: MutPtr = pbUserDataCtorArg
        internal set

    public var szDependantColumns: Pwstr = szDependantColumnsCtorArg
        internal set

    public constructor() : this(
        szCallbackCtorArg = MutPtr(0L),
        pbUserDataCtorArg = MutPtr(0L),
        cbUserData = 0u,
        szDependantColumnsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.szCallback

    public operator fun component2(): MutPtr = this.pbUserData

    public operator fun component3(): UInt = this.cbUserData

    public operator fun component4(): Pwstr = this.szDependantColumns

    public fun copy(szCallback: Pwstr = this.szCallback, pbUserData: MutPtr = this.pbUserData, cbUserData: UInt = this.cbUserData, szDependantColumns: Pwstr = this.szDependantColumns): JetUserdefineddefaultW = JetUserdefineddefaultW(szCallbackCtorArg = szCallback, pbUserDataCtorArg = pbUserData, cbUserData = cbUserData, szDependantColumnsCtorArg = szDependantColumns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is JetUserdefineddefaultW) return false
        if (this.szCallback != other.szCallback) return false
        if (this.pbUserData != other.pbUserData) return false
        if (this.cbUserData != other.cbUserData) return false
        if (this.szDependantColumns != other.szDependantColumns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szCallback.hashCode()
        result = 31 * result + this.pbUserData.hashCode()
        result = 31 * result + this.cbUserData.hashCode()
        result = 31 * result + this.szDependantColumns.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szCallback: Pwstr = MutPtr(0L),
            pbUserData: MutPtr = MutPtr(0L),
            cbUserData: UInt = 0u,
            szDependantColumns: Pwstr = MutPtr(0L),
        ): JetUserdefineddefaultW =
            JetUserdefineddefaultW(
                szCallbackCtorArg = szCallback,
                pbUserDataCtorArg = pbUserData,
                cbUserData = cbUserData,
                szDependantColumnsCtorArg = szDependantColumns,
            )
    }
}
