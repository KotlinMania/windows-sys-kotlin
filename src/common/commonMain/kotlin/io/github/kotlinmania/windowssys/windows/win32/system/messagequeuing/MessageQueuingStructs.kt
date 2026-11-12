package io.github.kotlinmania.windowssys.windows.win32.system.messagequeuing

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant

public class Mqcolumnset internal constructor(
    public var cCol: UInt,
    aColCtorArg: MutPtr<UInt>,
) {
    public var aCol: MutPtr<UInt> = aColCtorArg
        internal set

    public constructor() : this(
        cCol = 0u,
        aColCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCol

    public operator fun component2(): MutPtr<UInt> = this.aCol

    public fun copy(cCol: UInt = this.cCol, aCol: MutPtr<UInt> = this.aCol): Mqcolumnset = Mqcolumnset(cCol = cCol, aColCtorArg = aCol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqcolumnset) return false
        if (this.cCol != other.cCol) return false
        if (this.aCol != other.aCol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCol.hashCode()
        result = 31 * result + this.aCol.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqcolumnset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqcolumnset> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqcolumnset =
                    Mqcolumnset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Mqcolumnset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.aCol)
                }
            }

        public operator fun invoke(
            cCol: UInt = 0u,
            aCol: MutPtr<UInt> = MutPtr(0L),
        ): Mqcolumnset =
            Mqcolumnset(
                cCol = cCol,
                aColCtorArg = aCol,
            )
    }
}

public class Mqmgmtprops internal constructor(
    public var cProp: UInt,
    aPropIDCtorArg: MutPtr<UInt>,
    aPropVarCtorArg: MutPtr<Propvariant>,
    aStatusCtorArg: MutPtr<Hresult>,
) {
    public var aPropID: MutPtr<UInt> = aPropIDCtorArg
        internal set

    public var aPropVar: MutPtr<Propvariant> = aPropVarCtorArg
        internal set

    public var aStatus: MutPtr<Hresult> = aStatusCtorArg
        internal set

    public constructor() : this(
        cProp = 0u,
        aPropIDCtorArg = MutPtr(0L),
        aPropVarCtorArg = MutPtr(0L),
        aStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProp

    public operator fun component2(): MutPtr<UInt> = this.aPropID

    public operator fun component3(): MutPtr<Propvariant> = this.aPropVar

    public operator fun component4(): MutPtr<Hresult> = this.aStatus

    public fun copy(cProp: UInt = this.cProp, aPropID: MutPtr<UInt> = this.aPropID, aPropVar: MutPtr<Propvariant> = this.aPropVar, aStatus: MutPtr<Hresult> = this.aStatus): Mqmgmtprops = Mqmgmtprops(cProp = cProp, aPropIDCtorArg = aPropID, aPropVarCtorArg = aPropVar, aStatusCtorArg = aStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqmgmtprops) return false
        if (this.cProp != other.cProp) return false
        if (this.aPropID != other.aPropID) return false
        if (this.aPropVar != other.aPropVar) return false
        if (this.aStatus != other.aStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProp.hashCode()
        result = 31 * result + this.aPropID.hashCode()
        result = 31 * result + this.aPropVar.hashCode()
        result = 31 * result + this.aStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqmgmtprops> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqmgmtprops> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqmgmtprops =
                    Mqmgmtprops(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hresult>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mqmgmtprops) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.aPropID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 16L, value.aPropVar)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hresult>(64)
                    ).writeNative(addr + 24L, value.aStatus)
                }
            }

        public operator fun invoke(
            cProp: UInt = 0u,
            aPropID: MutPtr<UInt> = MutPtr(0L),
            aPropVar: MutPtr<Propvariant> = MutPtr(0L),
            aStatus: MutPtr<Hresult> = MutPtr(0L),
        ): Mqmgmtprops =
            Mqmgmtprops(
                cProp = cProp,
                aPropIDCtorArg = aPropID,
                aPropVarCtorArg = aPropVar,
                aStatusCtorArg = aStatus,
            )
    }
}

public class Mqmsgprops internal constructor(
    public var cProp: UInt,
    aPropIDCtorArg: MutPtr<UInt>,
    aPropVarCtorArg: MutPtr<Propvariant>,
    aStatusCtorArg: MutPtr<Hresult>,
) {
    public var aPropID: MutPtr<UInt> = aPropIDCtorArg
        internal set

    public var aPropVar: MutPtr<Propvariant> = aPropVarCtorArg
        internal set

    public var aStatus: MutPtr<Hresult> = aStatusCtorArg
        internal set

    public constructor() : this(
        cProp = 0u,
        aPropIDCtorArg = MutPtr(0L),
        aPropVarCtorArg = MutPtr(0L),
        aStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProp

    public operator fun component2(): MutPtr<UInt> = this.aPropID

    public operator fun component3(): MutPtr<Propvariant> = this.aPropVar

    public operator fun component4(): MutPtr<Hresult> = this.aStatus

    public fun copy(cProp: UInt = this.cProp, aPropID: MutPtr<UInt> = this.aPropID, aPropVar: MutPtr<Propvariant> = this.aPropVar, aStatus: MutPtr<Hresult> = this.aStatus): Mqmsgprops = Mqmsgprops(cProp = cProp, aPropIDCtorArg = aPropID, aPropVarCtorArg = aPropVar, aStatusCtorArg = aStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqmsgprops) return false
        if (this.cProp != other.cProp) return false
        if (this.aPropID != other.aPropID) return false
        if (this.aPropVar != other.aPropVar) return false
        if (this.aStatus != other.aStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProp.hashCode()
        result = 31 * result + this.aPropID.hashCode()
        result = 31 * result + this.aPropVar.hashCode()
        result = 31 * result + this.aStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqmsgprops> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqmsgprops> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqmsgprops =
                    Mqmsgprops(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hresult>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mqmsgprops) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.aPropID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 16L, value.aPropVar)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hresult>(64)
                    ).writeNative(addr + 24L, value.aStatus)
                }
            }

        public operator fun invoke(
            cProp: UInt = 0u,
            aPropID: MutPtr<UInt> = MutPtr(0L),
            aPropVar: MutPtr<Propvariant> = MutPtr(0L),
            aStatus: MutPtr<Hresult> = MutPtr(0L),
        ): Mqmsgprops =
            Mqmsgprops(
                cProp = cProp,
                aPropIDCtorArg = aPropID,
                aPropVarCtorArg = aPropVar,
                aStatusCtorArg = aStatus,
            )
    }
}

public class Mqprivateprops internal constructor(
    public var cProp: UInt,
    aPropIDCtorArg: MutPtr<UInt>,
    aPropVarCtorArg: MutPtr<Propvariant>,
    aStatusCtorArg: MutPtr<Hresult>,
) {
    public var aPropID: MutPtr<UInt> = aPropIDCtorArg
        internal set

    public var aPropVar: MutPtr<Propvariant> = aPropVarCtorArg
        internal set

    public var aStatus: MutPtr<Hresult> = aStatusCtorArg
        internal set

    public constructor() : this(
        cProp = 0u,
        aPropIDCtorArg = MutPtr(0L),
        aPropVarCtorArg = MutPtr(0L),
        aStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProp

    public operator fun component2(): MutPtr<UInt> = this.aPropID

    public operator fun component3(): MutPtr<Propvariant> = this.aPropVar

    public operator fun component4(): MutPtr<Hresult> = this.aStatus

    public fun copy(cProp: UInt = this.cProp, aPropID: MutPtr<UInt> = this.aPropID, aPropVar: MutPtr<Propvariant> = this.aPropVar, aStatus: MutPtr<Hresult> = this.aStatus): Mqprivateprops = Mqprivateprops(cProp = cProp, aPropIDCtorArg = aPropID, aPropVarCtorArg = aPropVar, aStatusCtorArg = aStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqprivateprops) return false
        if (this.cProp != other.cProp) return false
        if (this.aPropID != other.aPropID) return false
        if (this.aPropVar != other.aPropVar) return false
        if (this.aStatus != other.aStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProp.hashCode()
        result = 31 * result + this.aPropID.hashCode()
        result = 31 * result + this.aPropVar.hashCode()
        result = 31 * result + this.aStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqprivateprops> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqprivateprops> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqprivateprops =
                    Mqprivateprops(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hresult>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mqprivateprops) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.aPropID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 16L, value.aPropVar)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hresult>(64)
                    ).writeNative(addr + 24L, value.aStatus)
                }
            }

        public operator fun invoke(
            cProp: UInt = 0u,
            aPropID: MutPtr<UInt> = MutPtr(0L),
            aPropVar: MutPtr<Propvariant> = MutPtr(0L),
            aStatus: MutPtr<Hresult> = MutPtr(0L),
        ): Mqprivateprops =
            Mqprivateprops(
                cProp = cProp,
                aPropIDCtorArg = aPropID,
                aPropVarCtorArg = aPropVar,
                aStatusCtorArg = aStatus,
            )
    }
}

public data class Mqpropertyrestriction(
    public var rel: UInt = 0u,
    public var prop: UInt = 0u,
    public var prval: Propvariant = Propvariant(),
)

public class Mqqmprops internal constructor(
    public var cProp: UInt,
    aPropIDCtorArg: MutPtr<UInt>,
    aPropVarCtorArg: MutPtr<Propvariant>,
    aStatusCtorArg: MutPtr<Hresult>,
) {
    public var aPropID: MutPtr<UInt> = aPropIDCtorArg
        internal set

    public var aPropVar: MutPtr<Propvariant> = aPropVarCtorArg
        internal set

    public var aStatus: MutPtr<Hresult> = aStatusCtorArg
        internal set

    public constructor() : this(
        cProp = 0u,
        aPropIDCtorArg = MutPtr(0L),
        aPropVarCtorArg = MutPtr(0L),
        aStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProp

    public operator fun component2(): MutPtr<UInt> = this.aPropID

    public operator fun component3(): MutPtr<Propvariant> = this.aPropVar

    public operator fun component4(): MutPtr<Hresult> = this.aStatus

    public fun copy(cProp: UInt = this.cProp, aPropID: MutPtr<UInt> = this.aPropID, aPropVar: MutPtr<Propvariant> = this.aPropVar, aStatus: MutPtr<Hresult> = this.aStatus): Mqqmprops = Mqqmprops(cProp = cProp, aPropIDCtorArg = aPropID, aPropVarCtorArg = aPropVar, aStatusCtorArg = aStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqqmprops) return false
        if (this.cProp != other.cProp) return false
        if (this.aPropID != other.aPropID) return false
        if (this.aPropVar != other.aPropVar) return false
        if (this.aStatus != other.aStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProp.hashCode()
        result = 31 * result + this.aPropID.hashCode()
        result = 31 * result + this.aPropVar.hashCode()
        result = 31 * result + this.aStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqqmprops> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqqmprops> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqqmprops =
                    Mqqmprops(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hresult>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mqqmprops) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.aPropID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 16L, value.aPropVar)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hresult>(64)
                    ).writeNative(addr + 24L, value.aStatus)
                }
            }

        public operator fun invoke(
            cProp: UInt = 0u,
            aPropID: MutPtr<UInt> = MutPtr(0L),
            aPropVar: MutPtr<Propvariant> = MutPtr(0L),
            aStatus: MutPtr<Hresult> = MutPtr(0L),
        ): Mqqmprops =
            Mqqmprops(
                cProp = cProp,
                aPropIDCtorArg = aPropID,
                aPropVarCtorArg = aPropVar,
                aStatusCtorArg = aStatus,
            )
    }
}

public class Mqqueueprops internal constructor(
    public var cProp: UInt,
    aPropIDCtorArg: MutPtr<UInt>,
    aPropVarCtorArg: MutPtr<Propvariant>,
    aStatusCtorArg: MutPtr<Hresult>,
) {
    public var aPropID: MutPtr<UInt> = aPropIDCtorArg
        internal set

    public var aPropVar: MutPtr<Propvariant> = aPropVarCtorArg
        internal set

    public var aStatus: MutPtr<Hresult> = aStatusCtorArg
        internal set

    public constructor() : this(
        cProp = 0u,
        aPropIDCtorArg = MutPtr(0L),
        aPropVarCtorArg = MutPtr(0L),
        aStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProp

    public operator fun component2(): MutPtr<UInt> = this.aPropID

    public operator fun component3(): MutPtr<Propvariant> = this.aPropVar

    public operator fun component4(): MutPtr<Hresult> = this.aStatus

    public fun copy(cProp: UInt = this.cProp, aPropID: MutPtr<UInt> = this.aPropID, aPropVar: MutPtr<Propvariant> = this.aPropVar, aStatus: MutPtr<Hresult> = this.aStatus): Mqqueueprops = Mqqueueprops(cProp = cProp, aPropIDCtorArg = aPropID, aPropVarCtorArg = aPropVar, aStatusCtorArg = aStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqqueueprops) return false
        if (this.cProp != other.cProp) return false
        if (this.aPropID != other.aPropID) return false
        if (this.aPropVar != other.aPropVar) return false
        if (this.aStatus != other.aStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProp.hashCode()
        result = 31 * result + this.aPropID.hashCode()
        result = 31 * result + this.aPropVar.hashCode()
        result = 31 * result + this.aStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqqueueprops> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqqueueprops> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqqueueprops =
                    Mqqueueprops(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Hresult>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mqqueueprops) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.aPropID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 16L, value.aPropVar)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Hresult>(64)
                    ).writeNative(addr + 24L, value.aStatus)
                }
            }

        public operator fun invoke(
            cProp: UInt = 0u,
            aPropID: MutPtr<UInt> = MutPtr(0L),
            aPropVar: MutPtr<Propvariant> = MutPtr(0L),
            aStatus: MutPtr<Hresult> = MutPtr(0L),
        ): Mqqueueprops =
            Mqqueueprops(
                cProp = cProp,
                aPropIDCtorArg = aPropID,
                aPropVarCtorArg = aPropVar,
                aStatusCtorArg = aStatus,
            )
    }
}

public class Mqrestriction internal constructor(
    public var cRes: UInt,
    paPropResCtorArg: MutPtr<Mqpropertyrestriction>,
) {
    public var paPropRes: MutPtr<Mqpropertyrestriction> = paPropResCtorArg
        internal set

    public constructor() : this(
        cRes = 0u,
        paPropResCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cRes

    public operator fun component2(): MutPtr<Mqpropertyrestriction> = this.paPropRes

    public fun copy(cRes: UInt = this.cRes, paPropRes: MutPtr<Mqpropertyrestriction> = this.paPropRes): Mqrestriction = Mqrestriction(cRes = cRes, paPropResCtorArg = paPropRes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqrestriction) return false
        if (this.cRes != other.cRes) return false
        if (this.paPropRes != other.paPropRes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRes.hashCode()
        result = 31 * result + this.paPropRes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqrestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqrestriction> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqrestriction =
                    Mqrestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mqpropertyrestriction>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Mqrestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mqpropertyrestriction>(64)
                    ).writeNative(addr + 8L, value.paPropRes)
                }
            }

        public operator fun invoke(
            cRes: UInt = 0u,
            paPropRes: MutPtr<Mqpropertyrestriction> = MutPtr(0L),
        ): Mqrestriction =
            Mqrestriction(
                cRes = cRes,
                paPropResCtorArg = paPropRes,
            )
    }
}

public data class Mqsortkey(
    public var propColumn: UInt = 0u,
    public var dwOrder: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqsortkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqsortkey> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Mqsortkey =
                    Mqsortkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Mqsortkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.propColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwOrder)
                }
            }
    }
}

public class Mqsortset internal constructor(
    public var cCol: UInt,
    aColCtorArg: MutPtr<Mqsortkey>,
) {
    public var aCol: MutPtr<Mqsortkey> = aColCtorArg
        internal set

    public constructor() : this(
        cCol = 0u,
        aColCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCol

    public operator fun component2(): MutPtr<Mqsortkey> = this.aCol

    public fun copy(cCol: UInt = this.cCol, aCol: MutPtr<Mqsortkey> = this.aCol): Mqsortset = Mqsortset(cCol = cCol, aColCtorArg = aCol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mqsortset) return false
        if (this.cCol != other.cCol) return false
        if (this.aCol != other.aCol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCol.hashCode()
        result = 31 * result + this.aCol.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqsortset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mqsortset> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mqsortset =
                    Mqsortset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mqsortkey>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Mqsortset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mqsortkey>(64)
                    ).writeNative(addr + 8L, value.aCol)
                }
            }

        public operator fun invoke(
            cCol: UInt = 0u,
            aCol: MutPtr<Mqsortkey> = MutPtr(0L),
        ): Mqsortset =
            Mqsortset(
                cCol = cCol,
                aColCtorArg = aCol,
            )
    }
}

public data class SequenceInfo(
    public var seqID: Long = 0L,
    public var seqNo: UInt = 0u,
    public var prevNo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SequenceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SequenceInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SequenceInfo =
                    SequenceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SequenceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.seqID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.seqNo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.prevNo)
                }
            }
    }
}
