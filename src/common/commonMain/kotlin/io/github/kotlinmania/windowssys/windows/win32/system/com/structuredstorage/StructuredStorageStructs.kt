@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public class Bstrblob internal constructor(
    public var cbSize: UInt,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pData

    public fun copy(cbSize: UInt = this.cbSize, pData: MutPtr = this.pData): Bstrblob = Bstrblob(cbSize = cbSize, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bstrblob) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bstrblob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bstrblob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Bstrblob =
                    Bstrblob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Bstrblob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pData: MutPtr = MutPtr(0L),
        ): Bstrblob =
            Bstrblob(
                cbSize = cbSize,
                pDataCtorArg = pData,
            )
    }
}

public class Cabool internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cabool = Cabool(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabool) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabool> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabool> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cabool =
                    Cabool(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cabool) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cabool =
            Cabool(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cabstr internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cabstr = Cabstr(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabstr) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabstr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabstr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cabstr =
                    Cabstr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cabstr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cabstr =
            Cabstr(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cabstrblob internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cabstrblob = Cabstrblob(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cabstrblob) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabstrblob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabstrblob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cabstrblob =
                    Cabstrblob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cabstrblob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cabstrblob =
            Cabstrblob(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cac internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: Pstr,
) {
    public var pElems: Pstr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): Pstr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: Pstr = this.pElems): Cac = Cac(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cac) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: Pstr = MutPtr(0L),
        ): Cac =
            Cac(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Caclipdata internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Caclipdata = Caclipdata(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Caclipdata) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caclipdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caclipdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Caclipdata =
                    Caclipdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Caclipdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Caclipdata =
            Caclipdata(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Caclsid internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Caclsid = Caclsid(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Caclsid) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caclsid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caclsid> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Caclsid =
                    Caclsid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Caclsid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Caclsid =
            Caclsid(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cacy internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cacy = Cacy(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cacy) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cacy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cacy> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cacy =
                    Cacy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cacy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cacy =
            Cacy(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cadate internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cadate = Cadate(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cadate) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cadate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cadate> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cadate =
                    Cadate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cadate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cadate =
            Cadate(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cadbl internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cadbl = Cadbl(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cadbl) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cadbl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cadbl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cadbl =
                    Cadbl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cadbl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cadbl =
            Cadbl(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cafiletime internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cafiletime = Cafiletime(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cafiletime) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cafiletime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cafiletime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cafiletime =
                    Cafiletime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cafiletime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cafiletime =
            Cafiletime(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Caflt internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Caflt = Caflt(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Caflt) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caflt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caflt> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Caflt =
                    Caflt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Caflt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Caflt =
            Caflt(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cah internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cah = Cah(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cah) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cah> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cah> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cah =
                    Cah(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cah) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cah =
            Cah(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cai internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cai = Cai(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cai) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cai> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cai> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cai =
                    Cai(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cai) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cai =
            Cai(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cal internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cal = Cal(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cal) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cal> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cal> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cal =
                    Cal(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cal) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cal =
            Cal(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Calpstr internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Calpstr = Calpstr(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Calpstr) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Calpstr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Calpstr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Calpstr =
                    Calpstr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Calpstr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Calpstr =
            Calpstr(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Calpwstr internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Calpwstr = Calpwstr(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Calpwstr) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Calpwstr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Calpwstr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Calpwstr =
                    Calpwstr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Calpwstr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Calpwstr =
            Calpwstr(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Capropvariant internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Capropvariant = Capropvariant(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Capropvariant) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Capropvariant> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Capropvariant> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Capropvariant =
                    Capropvariant(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Capropvariant) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Capropvariant =
            Capropvariant(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cascode internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cascode = Cascode(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cascode) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cascode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cascode> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cascode =
                    Cascode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cascode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cascode =
            Cascode(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Caub internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Caub = Caub(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Caub) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caub> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caub> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Caub =
                    Caub(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Caub) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Caub =
            Caub(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Cauh internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Cauh = Cauh(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cauh) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cauh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cauh> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cauh =
                    Cauh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cauh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Cauh =
            Cauh(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Caui internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Caui = Caui(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Caui) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caui> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caui> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Caui =
                    Caui(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Caui) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Caui =
            Caui(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Caul internal constructor(
    public var cElems: UInt,
    pElemsCtorArg: MutPtr,
) {
    public var pElems: MutPtr = pElemsCtorArg
        internal set

    public constructor() : this(
        cElems = 0u,
        pElemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cElems

    public operator fun component2(): MutPtr = this.pElems

    public fun copy(cElems: UInt = this.cElems, pElems: MutPtr = this.pElems): Caul = Caul(cElems = cElems, pElemsCtorArg = pElems)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Caul) return false
        if (this.cElems != other.cElems) return false
        if (this.pElems != other.pElems) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cElems.hashCode()
        result = 31 * result + this.pElems.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caul> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Caul> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Caul =
                    Caul(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Caul) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cElems)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pElems)
                }
            }

        public operator fun invoke(
            cElems: UInt = 0u,
            pElems: MutPtr = MutPtr(0L),
        ): Caul =
            Caul(
                cElems = cElems,
                pElemsCtorArg = pElems,
            )
    }
}

public class Clipdata internal constructor(
    public var cbSize: UInt,
    public var ulClipFmt: Int,
    pClipDataCtorArg: MutPtr,
) {
    public var pClipData: MutPtr = pClipDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        ulClipFmt = 0,
        pClipDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Int = this.ulClipFmt

    public operator fun component3(): MutPtr = this.pClipData

    public fun copy(cbSize: UInt = this.cbSize, ulClipFmt: Int = this.ulClipFmt, pClipData: MutPtr = this.pClipData): Clipdata = Clipdata(cbSize = cbSize, ulClipFmt = ulClipFmt, pClipDataCtorArg = pClipData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clipdata) return false
        if (this.cbSize != other.cbSize) return false
        if (this.ulClipFmt != other.ulClipFmt) return false
        if (this.pClipData != other.pClipData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.ulClipFmt.hashCode()
        result = 31 * result + this.pClipData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clipdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clipdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Clipdata =
                    Clipdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Clipdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ulClipFmt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pClipData)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            ulClipFmt: Int = 0,
            pClipData: MutPtr = MutPtr(0L),
        ): Clipdata =
            Clipdata(
                cbSize = cbSize,
                ulClipFmt = ulClipFmt,
                pClipDataCtorArg = pClipData,
            )
    }
}

public class Olestream internal constructor(
    lpstblCtorArg: MutPtr,
) {
    public var lpstbl: MutPtr = lpstblCtorArg
        internal set

    public constructor() : this(
        lpstblCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.lpstbl

    public fun copy(lpstbl: MutPtr = this.lpstbl): Olestream = Olestream(lpstblCtorArg = lpstbl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Olestream) return false
        if (this.lpstbl != other.lpstbl) return false
        return true
    }

    override fun hashCode(): Int = this.lpstbl.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olestream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olestream> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Olestream =
                    Olestream(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Olestream) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.lpstbl)
                }
            }

        public operator fun invoke(
            lpstbl: MutPtr = MutPtr(0L),
        ): Olestream =
            Olestream(
                lpstblCtorArg = lpstbl,
            )
    }
}

public data class Olestreamvtbl(
    public var get: Int = 0,
    public var put: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olestreamvtbl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Olestreamvtbl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Olestreamvtbl =
                    Olestreamvtbl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Olestreamvtbl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.get)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.put)
                }
            }
    }
}

public class Propbag2 internal constructor(
    public var dwType: UInt,
    public var vt: Variant.Varenum,
    public var cfType: UShort,
    public var dwHint: UInt,
    pstrNameCtorArg: Pwstr,
    public var clsid: Guid,
) {
    public var pstrName: Pwstr = pstrNameCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        vt = 0u,
        cfType = 0u,
        dwHint = 0u,
        pstrNameCtorArg = MutPtr(0L),
        clsid = Guid(),
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): Variant.Varenum = this.vt

    public operator fun component3(): UShort = this.cfType

    public operator fun component4(): UInt = this.dwHint

    public operator fun component5(): Pwstr = this.pstrName

    public operator fun component6(): Guid = this.clsid

    public fun copy(dwType: UInt = this.dwType, vt: Variant.Varenum = this.vt, cfType: UShort = this.cfType, dwHint: UInt = this.dwHint, pstrName: Pwstr = this.pstrName, clsid: Guid = this.clsid): Propbag2 = Propbag2(dwType = dwType, vt = vt, cfType = cfType, dwHint = dwHint, pstrNameCtorArg = pstrName, clsid = clsid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propbag2) return false
        if (this.dwType != other.dwType) return false
        if (this.vt != other.vt) return false
        if (this.cfType != other.cfType) return false
        if (this.dwHint != other.dwHint) return false
        if (this.pstrName != other.pstrName) return false
        if (this.clsid != other.clsid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.vt.hashCode()
        result = 31 * result + this.cfType.hashCode()
        result = 31 * result + this.dwHint.hashCode()
        result = 31 * result + this.pstrName.hashCode()
        result = 31 * result + this.clsid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            vt: Variant.Varenum = 0u,
            cfType: UShort = 0u,
            dwHint: UInt = 0u,
            pstrName: Pwstr = MutPtr(0L),
            clsid: Guid = Guid(),
        ): Propbag2 =
            Propbag2(
                dwType = dwType,
                vt = vt,
                cfType = cfType,
                dwHint = dwHint,
                pstrNameCtorArg = pstrName,
                clsid = clsid,
            )
    }
}

public data class Propspec(
    public var ulKind: PropspecKind = 0u,
    public var anonymous: Propspec0 = Propspec0(),
)

public class Propspec0 internal constructor(
    public var propid: UInt,
    lpwstrCtorArg: Pwstr,
) {
    public var lpwstr: Pwstr = lpwstrCtorArg
        internal set

    public constructor() : this(
        propid = 0u,
        lpwstrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.propid

    public operator fun component2(): Pwstr = this.lpwstr

    public fun copy(propid: UInt = this.propid, lpwstr: Pwstr = this.lpwstr): Propspec0 = Propspec0(propid = propid, lpwstrCtorArg = lpwstr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propspec0) return false
        if (this.propid != other.propid) return false
        if (this.lpwstr != other.lpwstr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propid.hashCode()
        result = 31 * result + this.lpwstr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            propid: UInt = 0u,
            lpwstr: Pwstr = MutPtr(0L),
        ): Propspec0 =
            Propspec0(
                propid = propid,
                lpwstrCtorArg = lpwstr,
            )
    }
}

public data class Propvariant(
    public var anonymous: Propvariant0 = Propvariant0(),
)

public data class Propvariant0(
    public var anonymous: Propvariant00 = Propvariant00(),
    public var decVal: Decimal = Decimal(),
)

public data class Propvariant00(
    public var vt: Variant.Varenum = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var anonymous: Propvariant000 = Propvariant000(),
)

public class Propvariant000 {
    public var cVal: Byte = 0

    public var bVal: UByte = 0u

    public var iVal: Short = 0

    public var uiVal: UShort = 0u

    public var lVal: Int = 0

    public var ulVal: UInt = 0u

    public var intVal: Int = 0

    public var uintVal: UInt = 0u

    public var hVal: Long = 0L

    public var uhVal: ULong = 0uL

    public var fltVal: Float = 0.0f

    public var dblVal: Double = 0.0

    public var boolVal: VariantBool = 0

    public var obsoleteVariantBool: VariantBool = 0

    public var scode: Int = 0

    public var cyVal: CY = CY()

    public var date: Double = 0.0

    public var filetime: Filetime = Filetime()

    public var puuid: MutPtr = MutPtr(0L)
        internal set

    public var pclipdata: MutPtr = MutPtr(0L)
        internal set

    public var bstrVal: Bstr = ConstPtr(0L)
        internal set

    public var bstrblobVal: Bstrblob = Bstrblob()

    public var blob: Blob = Blob()

    public var pszVal: Pstr = MutPtr(0L)
        internal set

    public var pwszVal: Pwstr = MutPtr(0L)
        internal set

    public var punkVal: MutPtr = MutPtr(0L)
        internal set

    public var pdispVal: MutPtr = MutPtr(0L)
        internal set

    public var pStream: MutPtr = MutPtr(0L)
        internal set

    public var pStorage: MutPtr = MutPtr(0L)
        internal set

    public var pVersionedStream: MutPtr = MutPtr(0L)
        internal set

    public var parray: MutPtr = MutPtr(0L)
        internal set

    public var cac: Cac = Cac()

    public var caub: Caub = Caub()

    public var cai: Cai = Cai()

    public var caui: Caui = Caui()

    public var cal: Cal = Cal()

    public var caul: Caul = Caul()

    public var cah: Cah = Cah()

    public var cauh: Cauh = Cauh()

    public var caflt: Caflt = Caflt()

    public var cadbl: Cadbl = Cadbl()

    public var cabool: Cabool = Cabool()

    public var cascode: Cascode = Cascode()

    public var cacy: Cacy = Cacy()

    public var cadate: Cadate = Cadate()

    public var cafiletime: Cafiletime = Cafiletime()

    public var cauuid: Caclsid = Caclsid()

    public var caclipdata: Caclipdata = Caclipdata()

    public var cabstr: Cabstr = Cabstr()

    public var cabstrblob: Cabstrblob = Cabstrblob()

    public var calpstr: Calpstr = Calpstr()

    public var calpwstr: Calpwstr = Calpwstr()

    public var capropvar: Capropvariant = Capropvariant()

    public var pcVal: Pstr = MutPtr(0L)
        internal set

    public var pbVal: MutPtr = MutPtr(0L)
        internal set

    public var piVal: MutPtr = MutPtr(0L)
        internal set

    public var puiVal: MutPtr = MutPtr(0L)
        internal set

    public var plVal: MutPtr = MutPtr(0L)
        internal set

    public var pulVal: MutPtr = MutPtr(0L)
        internal set

    public var pintVal: MutPtr = MutPtr(0L)
        internal set

    public var puintVal: MutPtr = MutPtr(0L)
        internal set

    public var pfltVal: MutPtr = MutPtr(0L)
        internal set

    public var pdblVal: MutPtr = MutPtr(0L)
        internal set

    public var pboolVal: MutPtr = MutPtr(0L)
        internal set

    public var pdecVal: MutPtr = MutPtr(0L)
        internal set

    public var pscode: MutPtr = MutPtr(0L)
        internal set

    public var pcyVal: MutPtr = MutPtr(0L)
        internal set

    public var pdate: MutPtr = MutPtr(0L)
        internal set

    public var pbstrVal: MutPtr = MutPtr(0L)
        internal set

    public var ppunkVal: MutPtr = MutPtr(0L)
        internal set

    public var ppdispVal: MutPtr = MutPtr(0L)
        internal set

    public var pparray: MutPtr = MutPtr(0L)
        internal set

    public var pvarVal: MutPtr = MutPtr(0L)
        internal set
}

public data class RemSNB(
    public var ulCntStr: UInt = 0u,
    public var ulCntChar: UInt = 0u,
    public var rgString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemSNB) return false
        if (this.ulCntStr != other.ulCntStr) return false
        if (this.ulCntChar != other.ulCntChar) return false
        if (!this.rgString.contentEquals(other.rgString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulCntStr.hashCode()
        result = 31 * result + this.ulCntChar.hashCode()
        result = 31 * result + this.rgString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemSNB> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemSNB> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RemSNB =
                    RemSNB(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: RemSNB) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulCntStr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulCntChar)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.rgString.toList())
                }
            }
    }
}

public data class Serializedpropertyvalue(
    public var dwType: UInt = 0u,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Serializedpropertyvalue) return false
        if (this.dwType != other.dwType) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Serializedpropertyvalue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Serializedpropertyvalue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Serializedpropertyvalue =
                    Serializedpropertyvalue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Serializedpropertyvalue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.rgb.toList())
                }
            }
    }
}

public data class Statpropsetstg(
    public var fmtid: Guid = Guid(),
    public var clsid: Guid = Guid(),
    public var grfFlags: UInt = 0u,
    public var mtime: Filetime = Filetime(),
    public var ctime: Filetime = Filetime(),
    public var atime: Filetime = Filetime(),
    public var dwOSVersion: UInt = 0u,
)

public class Statpropstg internal constructor(
    lpwstrNameCtorArg: Pwstr,
    public var propid: UInt,
    public var vt: Variant.Varenum,
) {
    public var lpwstrName: Pwstr = lpwstrNameCtorArg
        internal set

    public constructor() : this(
        lpwstrNameCtorArg = MutPtr(0L),
        propid = 0u,
        vt = 0u,
    )

    public operator fun component1(): Pwstr = this.lpwstrName

    public operator fun component2(): UInt = this.propid

    public operator fun component3(): Variant.Varenum = this.vt

    public fun copy(lpwstrName: Pwstr = this.lpwstrName, propid: UInt = this.propid, vt: Variant.Varenum = this.vt): Statpropstg = Statpropstg(lpwstrNameCtorArg = lpwstrName, propid = propid, vt = vt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statpropstg) return false
        if (this.lpwstrName != other.lpwstrName) return false
        if (this.propid != other.propid) return false
        if (this.vt != other.vt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpwstrName.hashCode()
        result = 31 * result + this.propid.hashCode()
        result = 31 * result + this.vt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpwstrName: Pwstr = MutPtr(0L),
            propid: UInt = 0u,
            vt: Variant.Varenum = 0u,
        ): Statpropstg =
            Statpropstg(
                lpwstrNameCtorArg = lpwstrName,
                propid = propid,
                vt = vt,
            )
    }
}

public class Stgoptions internal constructor(
    public var usVersion: UShort,
    public var reserved: UShort,
    public var ulSectorSize: UInt,
    pwcsTemplateFileCtorArg: Pcwstr,
) {
    public var pwcsTemplateFile: Pcwstr = pwcsTemplateFileCtorArg
        internal set

    public constructor() : this(
        usVersion = 0u,
        reserved = 0u,
        ulSectorSize = 0u,
        pwcsTemplateFileCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.usVersion

    public operator fun component2(): UShort = this.reserved

    public operator fun component3(): UInt = this.ulSectorSize

    public operator fun component4(): Pcwstr = this.pwcsTemplateFile

    public fun copy(usVersion: UShort = this.usVersion, reserved: UShort = this.reserved, ulSectorSize: UInt = this.ulSectorSize, pwcsTemplateFile: Pcwstr = this.pwcsTemplateFile): Stgoptions = Stgoptions(usVersion = usVersion, reserved = reserved, ulSectorSize = ulSectorSize, pwcsTemplateFileCtorArg = pwcsTemplateFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stgoptions) return false
        if (this.usVersion != other.usVersion) return false
        if (this.reserved != other.reserved) return false
        if (this.ulSectorSize != other.ulSectorSize) return false
        if (this.pwcsTemplateFile != other.pwcsTemplateFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usVersion.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.ulSectorSize.hashCode()
        result = 31 * result + this.pwcsTemplateFile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            usVersion: UShort = 0u,
            reserved: UShort = 0u,
            ulSectorSize: UInt = 0u,
            pwcsTemplateFile: Pcwstr = ConstPtr(0L),
        ): Stgoptions =
            Stgoptions(
                usVersion = usVersion,
                reserved = reserved,
                ulSectorSize = ulSectorSize,
                pwcsTemplateFileCtorArg = pwcsTemplateFile,
            )
    }
}

public class Versionedstream internal constructor(
    public var guidVersion: Guid,
    pStreamCtorArg: MutPtr,
) {
    public var pStream: MutPtr = pStreamCtorArg
        internal set

    public constructor() : this(
        guidVersion = Guid(),
        pStreamCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guidVersion

    public operator fun component2(): MutPtr = this.pStream

    public fun copy(guidVersion: Guid = this.guidVersion, pStream: MutPtr = this.pStream): Versionedstream = Versionedstream(guidVersion = guidVersion, pStreamCtorArg = pStream)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Versionedstream) return false
        if (this.guidVersion != other.guidVersion) return false
        if (this.pStream != other.pStream) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidVersion.hashCode()
        result = 31 * result + this.pStream.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guidVersion: Guid = Guid(),
            pStream: MutPtr = MutPtr(0L),
        ): Versionedstream =
            Versionedstream(
                guidVersion = guidVersion,
                pStreamCtorArg = pStream,
            )
    }
}
