@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class Boid(
    public var rgb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Boid) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int = this.rgb.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Boid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Boid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Boid =
                    Boid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Boid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.rgb.toList())
                }
            }
    }
}

public data class OleTmConfigParamsV1(
    public var dwVersion: UInt = 0u,
    public var dwcConcurrencyHint: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OleTmConfigParamsV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OleTmConfigParamsV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): OleTmConfigParamsV1 =
                    OleTmConfigParamsV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OleTmConfigParamsV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwcConcurrencyHint)
                }
            }
    }
}

public data class OleTmConfigParamsV2(
    public var dwVersion: UInt = 0u,
    public var dwcConcurrencyHint: UInt = 0u,
    public var applicationType: Applicationtype = 0,
    public var clusterResourceId: Guid = Guid(),
)

public data class ProxyConfigParams(
    public var wcThreadsMax: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProxyConfigParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProxyConfigParams> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ProxyConfigParams =
                    ProxyConfigParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProxyConfigParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcThreadsMax)
                }
            }
    }
}

public data class Xactopt(
    public var ulTimeout: UInt = 0u,
    public var szDescription: UByteArray = UByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xactopt) return false
        if (this.ulTimeout != other.ulTimeout) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulTimeout.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xactopt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xactopt> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): Xactopt =
                    Xactopt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Xactopt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulTimeout)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr + 4L, value.szDescription.toList())
                }
            }
    }
}

public data class Xactstats(
    public var cOpen: UInt = 0u,
    public var cCommitting: UInt = 0u,
    public var cCommitted: UInt = 0u,
    public var cAborting: UInt = 0u,
    public var cAborted: UInt = 0u,
    public var cInDoubt: UInt = 0u,
    public var cHeuristicDecision: UInt = 0u,
    public var timeTransactionsUp: Filetime = Filetime(),
)

public data class Xacttransinfo(
    public var uow: Boid = Boid(),
    public var isoLevel: Int = 0,
    public var isoFlags: UInt = 0u,
    public var grfTCSupported: UInt = 0u,
    public var grfRMSupported: UInt = 0u,
    public var grfTCSupportedRetaining: UInt = 0u,
    public var grfRMSupportedRetaining: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xacttransinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xacttransinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Xacttransinfo =
                    Xacttransinfo(
                        (Boid.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Xacttransinfo) {
                    (Boid.typeLayout()).writeNative(addr, value.uow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.isoLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.isoFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.grfTCSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.grfRMSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.grfTCSupportedRetaining)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.grfRMSupportedRetaining)
                }
            }
    }
}

public data class Xid(
    public var formatID: Int = 0,
    public var gtridLength: Int = 0,
    public var bqualLength: Int = 0,
    public var data: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xid) return false
        if (this.formatID != other.formatID) return false
        if (this.gtridLength != other.gtridLength) return false
        if (this.bqualLength != other.bqualLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatID.hashCode()
        result = 31 * result + this.gtridLength.hashCode()
        result = 31 * result + this.bqualLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 140L
                override fun readNative(addr: Long): Xid =
                    Xid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Xid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.formatID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.gtridLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bqualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class XaSwitchT(
    public var name: ByteArray = ByteArray(32),
    public var flags: Int = 0,
    public var version: Int = 0,
    public var xaOpenEntry: Int = 0,
    public var xaCloseEntry: Int = 0,
    public var xaStartEntry: Int = 0,
    public var xaEndEntry: Int = 0,
    public var xaRollbackEntry: Int = 0,
    public var xaPrepareEntry: Int = 0,
    public var xaCommitEntry: Int = 0,
    public var xaRecoverEntry: Int = 0,
    public var xaForgetEntry: Int = 0,
    public var xaCompleteEntry: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XaSwitchT) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (this.xaOpenEntry != other.xaOpenEntry) return false
        if (this.xaCloseEntry != other.xaCloseEntry) return false
        if (this.xaStartEntry != other.xaStartEntry) return false
        if (this.xaEndEntry != other.xaEndEntry) return false
        if (this.xaRollbackEntry != other.xaRollbackEntry) return false
        if (this.xaPrepareEntry != other.xaPrepareEntry) return false
        if (this.xaCommitEntry != other.xaCommitEntry) return false
        if (this.xaRecoverEntry != other.xaRecoverEntry) return false
        if (this.xaForgetEntry != other.xaForgetEntry) return false
        if (this.xaCompleteEntry != other.xaCompleteEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.xaOpenEntry.hashCode()
        result = 31 * result + this.xaCloseEntry.hashCode()
        result = 31 * result + this.xaStartEntry.hashCode()
        result = 31 * result + this.xaEndEntry.hashCode()
        result = 31 * result + this.xaRollbackEntry.hashCode()
        result = 31 * result + this.xaPrepareEntry.hashCode()
        result = 31 * result + this.xaCommitEntry.hashCode()
        result = 31 * result + this.xaRecoverEntry.hashCode()
        result = 31 * result + this.xaForgetEntry.hashCode()
        result = 31 * result + this.xaCompleteEntry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XaSwitchT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XaSwitchT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): XaSwitchT =
                    XaSwitchT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: XaSwitchT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr, value.name.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 40L, value.xaOpenEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.xaCloseEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 56L, value.xaStartEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 64L, value.xaEndEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 72L, value.xaRollbackEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 80L, value.xaPrepareEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 88L, value.xaCommitEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 96L, value.xaRecoverEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 104L, value.xaForgetEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 112L, value.xaCompleteEntry)
                }
            }
    }
}
