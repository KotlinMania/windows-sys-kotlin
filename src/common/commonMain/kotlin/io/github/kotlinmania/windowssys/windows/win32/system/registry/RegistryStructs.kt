package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class Dsktlsystemtime(
    public var wYear: UShort = 0u,
    public var wMonth: UShort = 0u,
    public var wDayOfWeek: UShort = 0u,
    public var wDay: UShort = 0u,
    public var wHour: UShort = 0u,
    public var wMinute: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var wMilliseconds: UShort = 0u,
    public var wResult: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsktlsystemtime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dsktlsystemtime> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): Dsktlsystemtime =
                    Dsktlsystemtime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dsktlsystemtime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wMonth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wDayOfWeek)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.wMinute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.wSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.wMilliseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.wResult)
                }
            }
    }
}

public class Pvaluea internal constructor(
    pvValuenameCtorArg: Pstr,
    public var pvValuelen: Int,
    pvValueContextCtorArg: MutPtr<CVoid>,
    public var pvType: UInt,
) {
    public var pvValuename: Pstr = pvValuenameCtorArg
        internal set

    public var pvValueContext: MutPtr<CVoid> = pvValueContextCtorArg
        internal set

    public constructor() : this(
        pvValuenameCtorArg = MutPtr(0L),
        pvValuelen = 0,
        pvValueContextCtorArg = MutPtr(0L),
        pvType = 0u,
    )

    public operator fun component1(): Pstr = this.pvValuename

    public operator fun component2(): Int = this.pvValuelen

    public operator fun component3(): MutPtr<CVoid> = this.pvValueContext

    public operator fun component4(): UInt = this.pvType

    public fun copy(pvValuename: Pstr = this.pvValuename, pvValuelen: Int = this.pvValuelen, pvValueContext: MutPtr<CVoid> = this.pvValueContext, pvType: UInt = this.pvType): Pvaluea = Pvaluea(pvValuenameCtorArg = pvValuename, pvValuelen = pvValuelen, pvValueContextCtorArg = pvValueContext, pvType = pvType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pvaluea) return false
        if (this.pvValuename != other.pvValuename) return false
        if (this.pvValuelen != other.pvValuelen) return false
        if (this.pvValueContext != other.pvValueContext) return false
        if (this.pvType != other.pvType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvValuename.hashCode()
        result = 31 * result + this.pvValuelen.hashCode()
        result = 31 * result + this.pvValueContext.hashCode()
        result = 31 * result + this.pvType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvValuename: Pstr = MutPtr(0L),
            pvValuelen: Int = 0,
            pvValueContext: MutPtr<CVoid> = MutPtr(0L),
            pvType: UInt = 0u,
        ): Pvaluea =
            Pvaluea(
                pvValuenameCtorArg = pvValuename,
                pvValuelen = pvValuelen,
                pvValueContextCtorArg = pvValueContext,
                pvType = pvType,
            )
    }
}

public class Pvaluew internal constructor(
    pvValuenameCtorArg: Pwstr,
    public var pvValuelen: Int,
    pvValueContextCtorArg: MutPtr<CVoid>,
    public var pvType: UInt,
) {
    public var pvValuename: Pwstr = pvValuenameCtorArg
        internal set

    public var pvValueContext: MutPtr<CVoid> = pvValueContextCtorArg
        internal set

    public constructor() : this(
        pvValuenameCtorArg = MutPtr(0L),
        pvValuelen = 0,
        pvValueContextCtorArg = MutPtr(0L),
        pvType = 0u,
    )

    public operator fun component1(): Pwstr = this.pvValuename

    public operator fun component2(): Int = this.pvValuelen

    public operator fun component3(): MutPtr<CVoid> = this.pvValueContext

    public operator fun component4(): UInt = this.pvType

    public fun copy(pvValuename: Pwstr = this.pvValuename, pvValuelen: Int = this.pvValuelen, pvValueContext: MutPtr<CVoid> = this.pvValueContext, pvType: UInt = this.pvType): Pvaluew = Pvaluew(pvValuenameCtorArg = pvValuename, pvValuelen = pvValuelen, pvValueContextCtorArg = pvValueContext, pvType = pvType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pvaluew) return false
        if (this.pvValuename != other.pvValuename) return false
        if (this.pvValuelen != other.pvValuelen) return false
        if (this.pvValueContext != other.pvValueContext) return false
        if (this.pvType != other.pvType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvValuename.hashCode()
        result = 31 * result + this.pvValuelen.hashCode()
        result = 31 * result + this.pvValueContext.hashCode()
        result = 31 * result + this.pvType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvValuename: Pwstr = MutPtr(0L),
            pvValuelen: Int = 0,
            pvValueContext: MutPtr<CVoid> = MutPtr(0L),
            pvType: UInt = 0u,
        ): Pvaluew =
            Pvaluew(
                pvValuenameCtorArg = pvValuename,
                pvValuelen = pvValuelen,
                pvValueContextCtorArg = pvValueContext,
                pvType = pvType,
            )
    }
}

public class RegProvider internal constructor(
    public var piR01val: Pqueryhandler,
    public var piR0Allvals: Pqueryhandler,
    public var piR31val: Pqueryhandler,
    public var piR3Allvals: Pqueryhandler,
    public var piFlags: UInt,
    piKeyContextCtorArg: MutPtr<CVoid>,
) {
    public var piKeyContext: MutPtr<CVoid> = piKeyContextCtorArg
        internal set

    public constructor() : this(
        piR01val = null,
        piR0Allvals = null,
        piR31val = null,
        piR3Allvals = null,
        piFlags = 0u,
        piKeyContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pqueryhandler = this.piR01val

    public operator fun component2(): Pqueryhandler = this.piR0Allvals

    public operator fun component3(): Pqueryhandler = this.piR31val

    public operator fun component4(): Pqueryhandler = this.piR3Allvals

    public operator fun component5(): UInt = this.piFlags

    public operator fun component6(): MutPtr<CVoid> = this.piKeyContext

    public fun copy(piR01val: Pqueryhandler = this.piR01val, piR0Allvals: Pqueryhandler = this.piR0Allvals, piR31val: Pqueryhandler = this.piR31val, piR3Allvals: Pqueryhandler = this.piR3Allvals, piFlags: UInt = this.piFlags, piKeyContext: MutPtr<CVoid> = this.piKeyContext): RegProvider = RegProvider(piR01val = piR01val, piR0Allvals = piR0Allvals, piR31val = piR31val, piR3Allvals = piR3Allvals, piFlags = piFlags, piKeyContextCtorArg = piKeyContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegProvider) return false
        if (this.piR01val != other.piR01val) return false
        if (this.piR0Allvals != other.piR0Allvals) return false
        if (this.piR31val != other.piR31val) return false
        if (this.piR3Allvals != other.piR3Allvals) return false
        if (this.piFlags != other.piFlags) return false
        if (this.piKeyContext != other.piKeyContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.piR01val.hashCode()
        result = 31 * result + this.piR0Allvals.hashCode()
        result = 31 * result + this.piR31val.hashCode()
        result = 31 * result + this.piR3Allvals.hashCode()
        result = 31 * result + this.piFlags.hashCode()
        result = 31 * result + this.piKeyContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            piR01val: Pqueryhandler = null,
            piR0Allvals: Pqueryhandler = null,
            piR31val: Pqueryhandler = null,
            piR3Allvals: Pqueryhandler = null,
            piFlags: UInt = 0u,
            piKeyContext: MutPtr<CVoid> = MutPtr(0L),
        ): RegProvider =
            RegProvider(
                piR01val = piR01val,
                piR0Allvals = piR0Allvals,
                piR31val = piR31val,
                piR3Allvals = piR3Allvals,
                piFlags = piFlags,
                piKeyContextCtorArg = piKeyContext,
            )
    }
}

public class Valenta internal constructor(
    veValuenameCtorArg: Pstr,
    public var veValuelen: UInt,
    public var veValueptr: Int,
    public var veType: RegValueType,
) {
    public var veValuename: Pstr = veValuenameCtorArg
        internal set

    public constructor() : this(
        veValuenameCtorArg = MutPtr(0L),
        veValuelen = 0u,
        veValueptr = 0,
        veType = 0u,
    )

    public operator fun component1(): Pstr = this.veValuename

    public operator fun component2(): UInt = this.veValuelen

    public operator fun component3(): Int = this.veValueptr

    public operator fun component4(): RegValueType = this.veType

    public fun copy(veValuename: Pstr = this.veValuename, veValuelen: UInt = this.veValuelen, veValueptr: Int = this.veValueptr, veType: RegValueType = this.veType): Valenta = Valenta(veValuenameCtorArg = veValuename, veValuelen = veValuelen, veValueptr = veValueptr, veType = veType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Valenta) return false
        if (this.veValuename != other.veValuename) return false
        if (this.veValuelen != other.veValuelen) return false
        if (this.veValueptr != other.veValueptr) return false
        if (this.veType != other.veType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.veValuename.hashCode()
        result = 31 * result + this.veValuelen.hashCode()
        result = 31 * result + this.veValueptr.hashCode()
        result = 31 * result + this.veType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            veValuename: Pstr = MutPtr(0L),
            veValuelen: UInt = 0u,
            veValueptr: Int = 0,
            veType: RegValueType = 0u,
        ): Valenta =
            Valenta(
                veValuenameCtorArg = veValuename,
                veValuelen = veValuelen,
                veValueptr = veValueptr,
                veType = veType,
            )
    }
}

public class Valentw internal constructor(
    veValuenameCtorArg: Pwstr,
    public var veValuelen: UInt,
    public var veValueptr: Int,
    public var veType: RegValueType,
) {
    public var veValuename: Pwstr = veValuenameCtorArg
        internal set

    public constructor() : this(
        veValuenameCtorArg = MutPtr(0L),
        veValuelen = 0u,
        veValueptr = 0,
        veType = 0u,
    )

    public operator fun component1(): Pwstr = this.veValuename

    public operator fun component2(): UInt = this.veValuelen

    public operator fun component3(): Int = this.veValueptr

    public operator fun component4(): RegValueType = this.veType

    public fun copy(veValuename: Pwstr = this.veValuename, veValuelen: UInt = this.veValuelen, veValueptr: Int = this.veValueptr, veType: RegValueType = this.veType): Valentw = Valentw(veValuenameCtorArg = veValuename, veValuelen = veValuelen, veValueptr = veValueptr, veType = veType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Valentw) return false
        if (this.veValuename != other.veValuename) return false
        if (this.veValuelen != other.veValuelen) return false
        if (this.veValueptr != other.veValueptr) return false
        if (this.veType != other.veType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.veValuename.hashCode()
        result = 31 * result + this.veValuelen.hashCode()
        result = 31 * result + this.veValueptr.hashCode()
        result = 31 * result + this.veType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            veValuename: Pwstr = MutPtr(0L),
            veValuelen: UInt = 0u,
            veValueptr: Int = 0,
            veType: RegValueType = 0u,
        ): Valentw =
            Valentw(
                veValuenameCtorArg = veValuename,
                veValuelen = veValuelen,
                veValueptr = veValueptr,
                veType = veType,
            )
    }
}

public class ValContext internal constructor(
    public var valuelen: Int,
    valueContextCtorArg: MutPtr<CVoid>,
    valBuffPtrCtorArg: MutPtr<CVoid>,
) {
    public var valueContext: MutPtr<CVoid> = valueContextCtorArg
        internal set

    public var valBuffPtr: MutPtr<CVoid> = valBuffPtrCtorArg
        internal set

    public constructor() : this(
        valuelen = 0,
        valueContextCtorArg = MutPtr(0L),
        valBuffPtrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.valuelen

    public operator fun component2(): MutPtr<CVoid> = this.valueContext

    public operator fun component3(): MutPtr<CVoid> = this.valBuffPtr

    public fun copy(valuelen: Int = this.valuelen, valueContext: MutPtr<CVoid> = this.valueContext, valBuffPtr: MutPtr<CVoid> = this.valBuffPtr): ValContext = ValContext(valuelen = valuelen, valueContextCtorArg = valueContext, valBuffPtrCtorArg = valBuffPtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ValContext) return false
        if (this.valuelen != other.valuelen) return false
        if (this.valueContext != other.valueContext) return false
        if (this.valBuffPtr != other.valBuffPtr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.valuelen.hashCode()
        result = 31 * result + this.valueContext.hashCode()
        result = 31 * result + this.valBuffPtr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ValContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ValContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ValContext =
                    ValContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ValContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.valuelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.valueContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.valBuffPtr)
                }
            }

        public operator fun invoke(
            valuelen: Int = 0,
            valueContext: MutPtr<CVoid> = MutPtr(0L),
            valBuffPtr: MutPtr<CVoid> = MutPtr(0L),
        ): ValContext =
            ValContext(
                valuelen = valuelen,
                valueContextCtorArg = valueContext,
                valBuffPtrCtorArg = valBuffPtr,
            )
    }
}
