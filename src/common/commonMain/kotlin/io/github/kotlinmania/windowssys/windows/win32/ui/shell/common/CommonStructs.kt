@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell.common

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class ComdlgFilterspec internal constructor(
    pszNameCtorArg: Pcwstr,
    pszSpecCtorArg: Pcwstr,
) {
    public var pszName: Pcwstr = pszNameCtorArg
        internal set

    public var pszSpec: Pcwstr = pszSpecCtorArg
        internal set

    public constructor() : this(
        pszNameCtorArg = ConstPtr(0L),
        pszSpecCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pszName

    public operator fun component2(): Pcwstr = this.pszSpec

    public fun copy(pszName: Pcwstr = this.pszName, pszSpec: Pcwstr = this.pszSpec): ComdlgFilterspec = ComdlgFilterspec(pszNameCtorArg = pszName, pszSpecCtorArg = pszSpec)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ComdlgFilterspec) return false
        if (this.pszName != other.pszName) return false
        if (this.pszSpec != other.pszSpec) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszName.hashCode()
        result = 31 * result + this.pszSpec.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszName: Pcwstr = ConstPtr(0L),
            pszSpec: Pcwstr = ConstPtr(0L),
        ): ComdlgFilterspec =
            ComdlgFilterspec(
                pszNameCtorArg = pszName,
                pszSpecCtorArg = pszSpec,
            )
    }
}

public data class Itemidlist(
    public var mkid: Shitemid = Shitemid(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itemidlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itemidlist> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): Itemidlist =
                    Itemidlist(
                        (Shitemid.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Itemidlist) {
                    (Shitemid.typeLayout()).writeNative(addr, value.mkid)
                }
            }
    }
}

public data class Shelldetails(
    public var fmt: Int = 0,
    public var cxChar: Int = 0,
    public var str: Strret = Strret(),
)

public data class Shitemid(
    public var cb: UShort = 0u,
    public var abID: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shitemid) return false
        if (this.cb != other.cb) return false
        if (!this.abID.contentEquals(other.abID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.abID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shitemid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shitemid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): Shitemid =
                    Shitemid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Shitemid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.abID.toList())
                }
            }
    }
}

public data class Strret(
    public var uType: UInt = 0u,
    public var anonymous: Strret0 = Strret0(),
)

public class Strret0 internal constructor(
    pOleStrCtorArg: Pwstr,
    public var uOffset: UInt,
    public var cStr: UByteArray,
) {
    public var pOleStr: Pwstr = pOleStrCtorArg
        internal set

    public constructor() : this(
        pOleStrCtorArg = MutPtr(0L),
        uOffset = 0u,
        cStr = UByteArray(260),
    )

    public operator fun component1(): Pwstr = this.pOleStr

    public operator fun component2(): UInt = this.uOffset

    public operator fun component3(): UByteArray = this.cStr

    public fun copy(pOleStr: Pwstr = this.pOleStr, uOffset: UInt = this.uOffset, cStr: UByteArray = this.cStr): Strret0 = Strret0(pOleStrCtorArg = pOleStr, uOffset = uOffset, cStr = cStr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strret0) return false
        if (this.pOleStr != other.pOleStr) return false
        if (this.uOffset != other.uOffset) return false
        if (!this.cStr.contentEquals(other.cStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pOleStr.hashCode()
        result = 31 * result + this.uOffset.hashCode()
        result = 31 * result + this.cStr.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pOleStr: Pwstr = MutPtr(0L),
            uOffset: UInt = 0u,
            cStr: UByteArray = UByteArray(260),
        ): Strret0 =
            Strret0(
                pOleStrCtorArg = pOleStr,
                uOffset = uOffset,
                cStr = cStr,
            )
    }
}
