package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.certificates

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class Cainfo(
    public var cbSize: UInt = 0u,
    public var cAType: EnumCatypes = 0,
    public var cCASignatureCerts: UInt = 0u,
    public var cCAExchangeCerts: UInt = 0u,
    public var cExitModules: UInt = 0u,
    public var lPropIdMax: Int = 0,
    public var lRoleSeparationEnabled: Int = 0,
    public var cKRACertUsedCount: UInt = 0u,
    public var cKRACertCount: UInt = 0u,
    public var fAdvancedServer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cainfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cainfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Cainfo =
                    Cainfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Cainfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cAType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCASignatureCerts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cCAExchangeCerts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cExitModules)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lPropIdMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lRoleSeparationEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cKRACertUsedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cKRACertCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.fAdvancedServer)
                }
            }
    }
}

public class Certtransblob internal constructor(
    public var cb: UInt,
    pbCtorArg: MutPtr,
) {
    public var pb: MutPtr = pbCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        pbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): MutPtr = this.pb

    public fun copy(cb: UInt = this.cb, pb: MutPtr = this.pb): Certtransblob = Certtransblob(cb = cb, pbCtorArg = pb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Certtransblob) return false
        if (this.cb != other.cb) return false
        if (this.pb != other.pb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.pb.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Certtransblob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Certtransblob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Certtransblob =
                    Certtransblob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Certtransblob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pb)
                }
            }

        public operator fun invoke(
            cb: UInt = 0u,
            pb: MutPtr = MutPtr(0L),
        ): Certtransblob =
            Certtransblob(
                cb = cb,
                pbCtorArg = pb,
            )
    }
}

public class Certviewrestriction internal constructor(
    public var columnIndex: UInt,
    public var seekOperator: Int,
    public var sortOrder: Int,
    pbValueCtorArg: MutPtr,
    public var cbValue: UInt,
) {
    public var pbValue: MutPtr = pbValueCtorArg
        internal set

    public constructor() : this(
        columnIndex = 0u,
        seekOperator = 0,
        sortOrder = 0,
        pbValueCtorArg = MutPtr(0L),
        cbValue = 0u,
    )

    public operator fun component1(): UInt = this.columnIndex

    public operator fun component2(): Int = this.seekOperator

    public operator fun component3(): Int = this.sortOrder

    public operator fun component4(): MutPtr = this.pbValue

    public operator fun component5(): UInt = this.cbValue

    public fun copy(columnIndex: UInt = this.columnIndex, seekOperator: Int = this.seekOperator, sortOrder: Int = this.sortOrder, pbValue: MutPtr = this.pbValue, cbValue: UInt = this.cbValue): Certviewrestriction = Certviewrestriction(columnIndex = columnIndex, seekOperator = seekOperator, sortOrder = sortOrder, pbValueCtorArg = pbValue, cbValue = cbValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Certviewrestriction) return false
        if (this.columnIndex != other.columnIndex) return false
        if (this.seekOperator != other.seekOperator) return false
        if (this.sortOrder != other.sortOrder) return false
        if (this.pbValue != other.pbValue) return false
        if (this.cbValue != other.cbValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.columnIndex.hashCode()
        result = 31 * result + this.seekOperator.hashCode()
        result = 31 * result + this.sortOrder.hashCode()
        result = 31 * result + this.pbValue.hashCode()
        result = 31 * result + this.cbValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Certviewrestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Certviewrestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Certviewrestriction =
                    Certviewrestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Certviewrestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.columnIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.seekOperator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.sortOrder)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pbValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbValue)
                }
            }

        public operator fun invoke(
            columnIndex: UInt = 0u,
            seekOperator: Int = 0,
            sortOrder: Int = 0,
            pbValue: MutPtr = MutPtr(0L),
            cbValue: UInt = 0u,
        ): Certviewrestriction =
            Certviewrestriction(
                columnIndex = columnIndex,
                seekOperator = seekOperator,
                sortOrder = sortOrder,
                pbValueCtorArg = pbValue,
                cbValue = cbValue,
            )
    }
}

public class CsedbRstmapw internal constructor(
    pwszDatabaseNameCtorArg: Pwstr,
    pwszNewDatabaseNameCtorArg: Pwstr,
) {
    public var pwszDatabaseName: Pwstr = pwszDatabaseNameCtorArg
        internal set

    public var pwszNewDatabaseName: Pwstr = pwszNewDatabaseNameCtorArg
        internal set

    public constructor() : this(
        pwszDatabaseNameCtorArg = MutPtr(0L),
        pwszNewDatabaseNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszDatabaseName

    public operator fun component2(): Pwstr = this.pwszNewDatabaseName

    public fun copy(pwszDatabaseName: Pwstr = this.pwszDatabaseName, pwszNewDatabaseName: Pwstr = this.pwszNewDatabaseName): CsedbRstmapw = CsedbRstmapw(pwszDatabaseNameCtorArg = pwszDatabaseName, pwszNewDatabaseNameCtorArg = pwszNewDatabaseName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsedbRstmapw) return false
        if (this.pwszDatabaseName != other.pwszDatabaseName) return false
        if (this.pwszNewDatabaseName != other.pwszNewDatabaseName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDatabaseName.hashCode()
        result = 31 * result + this.pwszNewDatabaseName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszDatabaseName: Pwstr = MutPtr(0L),
            pwszNewDatabaseName: Pwstr = MutPtr(0L),
        ): CsedbRstmapw =
            CsedbRstmapw(
                pwszDatabaseNameCtorArg = pwszDatabaseName,
                pwszNewDatabaseNameCtorArg = pwszNewDatabaseName,
            )
    }
}
