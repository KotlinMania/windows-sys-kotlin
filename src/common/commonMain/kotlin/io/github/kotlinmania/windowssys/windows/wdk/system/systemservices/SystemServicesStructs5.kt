@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.M128a
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.XsaveArea
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SingleListEntry

public data class WheaRecoveryContext0(
    public var memoryError: WheaRecoveryContext00 = WheaRecoveryContext00(),
    public var pmemError: WheaRecoveryContext01 = WheaRecoveryContext01(),
)

public data class WheaRecoveryContext00(
    public var address: Int = 0,
    public var consumed: Boolean = false,
    public var errorCode: UShort = 0u,
    public var errorIpValid: Boolean = false,
    public var restartIpValid: Boolean = false,
    public var clearPoison: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRecoveryContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRecoveryContext00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WheaRecoveryContext00 =
                    WheaRecoveryContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: WheaRecoveryContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.consumed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.errorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.errorIpValid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.restartIpValid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 14L, value.clearPoison)
                }
            }
    }
}

public data class WheaRecoveryContext01(
    public var pmemErrInfo: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRecoveryContext01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRecoveryContext01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaRecoveryContext01 =
                    WheaRecoveryContext01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaRecoveryContext01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.pmemErrInfo)
                }
            }
    }
}

public data class WheaRegisterKeyNotificationFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaReportHwErrorDeviceDriverFlags(
    public var anonymous: WheaReportHwErrorDeviceDriverFlags0 = WheaReportHwErrorDeviceDriverFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaReportHwErrorDeviceDriverFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaReportHwErrorDeviceDriverFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaReportHwErrorDeviceDriverFlags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaReportHwErrorDeviceDriverFlags0 =
                    WheaReportHwErrorDeviceDriverFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaReportHwErrorDeviceDriverFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaRevision(
    public var anonymous: WheaRevision0 = WheaRevision0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaRevision0(
    public var minorRevision: UByte = 0u,
    public var majorRevision: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRevision0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaRevision0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): WheaRevision0 =
                    WheaRevision0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: WheaRevision0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.minorRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.majorRevision)
                }
            }
    }
}

public data class WheaSeaSection(
    public var esr: UInt = 0u,
    public var far: ULong = 0uL,
    public var par: ULong = 0uL,
    public var wasKernel: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaSeaSection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaSeaSection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 21L
                override fun readNative(addr: Long): WheaSeaSection =
                    WheaSeaSection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaSeaSection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.esr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 4L, value.far)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 12L, value.par)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.wasKernel)
                }
            }
    }
}

public data class WheaSeiSection(
    public var esr: UInt = 0u,
    public var far: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaSeiSection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaSeiSection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): WheaSeiSection =
                    WheaSeiSection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WheaSeiSection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.esr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 4L, value.far)
                }
            }
    }
}

public data class WheaSelBugcheckProgress(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var bugCheckCode: UInt = 0u,
    public var bugCheckProgressSummary: UInt = 0u,
)

public data class WheaSelBugcheckRecoveryStatusMultipleBugcheckEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var isBugcheckOwner: Boolean = false,
    public var recursionCount: UByte = 0u,
    public var isBugcheckRecoveryOwner: Boolean = false,
)

public data class WheaSelBugcheckRecoveryStatusPhase1Event(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var success: Boolean = false,
    public var version: UByte = 0u,
    public var entryCount: UShort = 0u,
    public var data: WheaSelBugcheckRecoveryStatusPhase1Event0 = WheaSelBugcheckRecoveryStatusPhase1Event0(),
)

public data class WheaSelBugcheckRecoveryStatusPhase1Event0(
    public var dumpPolicy: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaSelBugcheckRecoveryStatusPhase1Event0) return false
        if (this.dumpPolicy != other.dumpPolicy) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dumpPolicy.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaSelBugcheckRecoveryStatusPhase1Event0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaSelBugcheckRecoveryStatusPhase1Event0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaSelBugcheckRecoveryStatusPhase1Event0 =
                    WheaSelBugcheckRecoveryStatusPhase1Event0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WheaSelBugcheckRecoveryStatusPhase1Event0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.dumpPolicy)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved.toList())
                }
            }
    }
}

public data class WheaSelBugcheckRecoveryStatusPhase2Event(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var bootId: UInt = 0u,
    public var success: Boolean = false,
)

public data class WheaSelBugcheckRecoveryStatusStartEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var startingIrql: UByte = 0u,
)

public data class WheaSrarDetailEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var recoveryContextFlags: UInt = 0u,
    public var recoveryContextPa: ULong = 0uL,
    public var pageOfflineStatus: Ntstatus = 0,
    public var kernelConsumerError: Boolean = false,
)

public data class WheaSrasTableEntriesEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var logNumber: UInt = 0u,
    public var numberSignals: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaSrasTableEntriesEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.logNumber != other.logNumber) return false
        if (this.numberSignals != other.numberSignals) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.logNumber.hashCode()
        result = 31 * result + this.numberSignals.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaSrasTableError(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaSrasTableNotFound(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaThrottleAddErrSrcFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaThrottleMemoryAddOrRemoveEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var socketId: UInt = 0u,
    public var channelId: UInt = 0u,
    public var dimmSlot: UInt = 0u,
)

public data class WheaThrottlePcieAddEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var address: WheaPcieAddress = WheaPcieAddress(),
    public var mask: UInt = 0u,
    public var updated: Boolean = false,
    public var status: Ntstatus = 0,
)

public data class WheaThrottlePcieRemoveEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var address: WheaPcieAddress = WheaPcieAddress(),
    public var mask: UInt = 0u,
)

public data class WheaThrottleRegistryCorruptEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var throttleType: WheaThrottleType = 0,
)

public data class WheaThrottleRegDataIgnoredEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var throttleType: WheaThrottleType = 0,
)

public data class WheaTimestamp(
    public var anonymous: WheaTimestamp0 = WheaTimestamp0(),
    public var asLargeInteger: Long = 0L,
)

public data class WheaTimestamp0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaTimestamp0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaTimestamp0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaTimestamp0 =
                    WheaTimestamp0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaTimestamp0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class WheaX64RegisterState(
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var cs: UShort = 0u,
    public var ds: UShort = 0u,
    public var ss: UShort = 0u,
    public var es: UShort = 0u,
    public var fs: UShort = 0u,
    public var gs: UShort = 0u,
    public var reserved: UInt = 0u,
    public var rflags: ULong = 0uL,
    public var eip: ULong = 0uL,
    public var cr0: ULong = 0uL,
    public var cr1: ULong = 0uL,
    public var cr2: ULong = 0uL,
    public var cr3: ULong = 0uL,
    public var cr4: ULong = 0uL,
    public var cr8: ULong = 0uL,
    public var gdtr: Whea128a = Whea128a(),
    public var idtr: Whea128a = Whea128a(),
    public var ldtr: UShort = 0u,
    public var tr: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaX64RegisterState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaX64RegisterState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 248L
                override fun readNative(addr: Long): WheaX64RegisterState =
                    WheaX64RegisterState(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 138L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (Whea128a.typeLayout()).readNative(addr + 208L),
                        (Whea128a.typeLayout()).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 242L),
                    )
                override fun writeNative(addr: Long, value: WheaX64RegisterState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.rdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.rsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.rdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.rbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.rsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.r8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.r9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.r10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.r11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.r12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.r13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.r14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.r15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 128L, value.cs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 130L, value.ds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.ss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.es)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 136L, value.fs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 138L, value.gs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.rflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.eip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.cr0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.cr1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.cr2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.cr3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.cr4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.cr8)
                    (Whea128a.typeLayout()).writeNative(addr + 208L, value.gdtr)
                    (Whea128a.typeLayout()).writeNative(addr + 224L, value.idtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 240L, value.ldtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 242L, value.tr)
                }
            }
    }
}

public class WheaX86RegisterState(
    public var eax: UInt = 0u,
    public var ebx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var edx: UInt = 0u,
    public var esi: UInt = 0u,
    public var edi: UInt = 0u,
    public var ebp: UInt = 0u,
    public var esp: UInt = 0u,
    public var cs: UShort = 0u,
    public var ds: UShort = 0u,
    public var ss: UShort = 0u,
    public var es: UShort = 0u,
    public var fs: UShort = 0u,
    public var gs: UShort = 0u,
    public var eflags: UInt = 0u,
    public var eip: UInt = 0u,
    public var cr0: UInt = 0u,
    public var cr1: UInt = 0u,
    public var cr2: UInt = 0u,
    public var cr3: UInt = 0u,
    public var cr4: UInt = 0u,
    public var gdtr: ULong = 0uL,
    public var idtr: ULong = 0uL,
    public var ldtr: UShort = 0u,
    public var tr: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaX86RegisterState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaX86RegisterState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 92L
                override fun readNative(addr: Long): WheaX86RegisterState =
                    WheaX86RegisterState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 90L),
                    )
                override fun writeNative(addr: Long, value: WheaX86RegisterState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ebx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ecx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.edx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.esi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.edi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ebp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.esp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.cs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.ds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.ss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.es)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.fs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.gs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.eflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.eip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cr0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.cr1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.cr2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.cr3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.cr4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.gdtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.idtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 88L, value.ldtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 90L, value.tr)
                }
            }
    }
}

public data class WheaXpfBusCheck(
    public var anonymous: WheaXpfBusCheck0 = WheaXpfBusCheck0(),
    public var xpfBusCheck: ULong = 0uL,
)

public data class WheaXpfBusCheck0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfBusCheck0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfBusCheck0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaXpfBusCheck0 =
                    WheaXpfBusCheck0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaXpfBusCheck0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaXpfCacheCheck(
    public var anonymous: WheaXpfCacheCheck0 = WheaXpfCacheCheck0(),
    public var xpfCacheCheck: ULong = 0uL,
)

public data class WheaXpfCacheCheck0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfCacheCheck0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfCacheCheck0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaXpfCacheCheck0 =
                    WheaXpfCacheCheck0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaXpfCacheCheck0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaXpfContextInfo(
    public var registerContextType: UShort = 0u,
    public var registerDataSize: UShort = 0u,
    public var mSRAddress: UInt = 0u,
    public var mmRegisterAddress: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfContextInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfContextInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WheaXpfContextInfo =
                    WheaXpfContextInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WheaXpfContextInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.registerContextType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.registerDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mSRAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mmRegisterAddress)
                }
            }
    }
}

public data class WheaXpfMcaSection(
    public var versionNumber: UInt = 0u,
    public var cpuVendor: WheaCpuVendor = 0,
    public var timestamp: Long = 0L,
    public var processorNumber: UInt = 0u,
    public var globalStatus: McgStatus = McgStatus(),
    public var instructionPointer: ULong = 0uL,
    public var bankNumber: UInt = 0u,
    public var status: MciStatus = MciStatus(),
    public var address: ULong = 0uL,
    public var misc: ULong = 0uL,
    public var extendedRegisterCount: UInt = 0u,
    public var apicId: UInt = 0u,
    public var anonymous: WheaXpfMcaSection0 = WheaXpfMcaSection0(),
    public var globalCapability: McgCap = McgCap(),
    public var recoveryInfo: XpfRecoveryInfo = XpfRecoveryInfo(),
)

public data class WheaXpfMcaSection0(
    public var extendedRegisters: ULongArray = ULongArray(24),
    public var aMDExtendedRegisters: WheaAmdExtendedRegisters = WheaAmdExtendedRegisters(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaXpfMcaSection0) return false
        if (!this.extendedRegisters.contentEquals(other.extendedRegisters)) return false
        if (this.aMDExtendedRegisters != other.aMDExtendedRegisters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extendedRegisters.contentHashCode()
        result = 31 * result + this.aMDExtendedRegisters.hashCode()
        return result
    }
}

public data class WheaXpfMsCheck(
    public var anonymous: WheaXpfMsCheck0 = WheaXpfMsCheck0(),
    public var xpfMsCheck: ULong = 0uL,
)

public data class WheaXpfMsCheck0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfMsCheck0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfMsCheck0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaXpfMsCheck0 =
                    WheaXpfMsCheck0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaXpfMsCheck0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaXpfProcessorErrorSection(
    public var validBits: WheaXpfProcessorErrorSectionValidbits = WheaXpfProcessorErrorSectionValidbits(),
    public var localAPICId: ULong = 0uL,
    public var cpuId: UByteArray = UByteArray(48),
    public var variableInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaXpfProcessorErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.localAPICId != other.localAPICId) return false
        if (!this.cpuId.contentEquals(other.cpuId)) return false
        if (!this.variableInfo.contentEquals(other.variableInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.localAPICId.hashCode()
        result = 31 * result + this.cpuId.contentHashCode()
        result = 31 * result + this.variableInfo.contentHashCode()
        return result
    }
}

public data class WheaXpfProcessorErrorSectionValidbits(
    public var anonymous: WheaXpfProcessorErrorSectionValidbits0 = WheaXpfProcessorErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaXpfProcessorErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfProcessorErrorSectionValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfProcessorErrorSectionValidbits0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaXpfProcessorErrorSectionValidbits0 =
                    WheaXpfProcessorErrorSectionValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaXpfProcessorErrorSectionValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaXpfProcinfo(
    public var checkInfoId: Guid = Guid(),
    public var validBits: WheaXpfProcinfoValidbits = WheaXpfProcinfoValidbits(),
    public var checkInfo: WheaXpfProcinfo0 = WheaXpfProcinfo0(),
    public var targetId: ULong = 0uL,
    public var requesterId: ULong = 0uL,
    public var responderId: ULong = 0uL,
    public var instructionPointer: ULong = 0uL,
)

public data class WheaXpfProcinfo0(
    public var cacheCheck: WheaXpfCacheCheck = WheaXpfCacheCheck(),
    public var tlbCheck: WheaXpfTlbCheck = WheaXpfTlbCheck(),
    public var busCheck: WheaXpfBusCheck = WheaXpfBusCheck(),
    public var msCheck: WheaXpfMsCheck = WheaXpfMsCheck(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaXpfProcinfoValidbits(
    public var anonymous: WheaXpfProcinfoValidbits0 = WheaXpfProcinfoValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaXpfProcinfoValidbits0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfProcinfoValidbits0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfProcinfoValidbits0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaXpfProcinfoValidbits0 =
                    WheaXpfProcinfoValidbits0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaXpfProcinfoValidbits0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaXpfTlbCheck(
    public var anonymous: WheaXpfTlbCheck0 = WheaXpfTlbCheck0(),
    public var xpfTLBCheck: ULong = 0uL,
)

public data class WheaXpfTlbCheck0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfTlbCheck0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfTlbCheck0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WheaXpfTlbCheck0 =
                    WheaXpfTlbCheck0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaXpfTlbCheck0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class XpfRecoveryInfo(
    public var failureReason: XpfRecoveryInfo0 = XpfRecoveryInfo0(),
    public var action: XpfRecoveryInfo1 = XpfRecoveryInfo1(),
    public var actionRequired: Boolean = false,
    public var recoverySucceeded: Boolean = false,
    public var recoveryKernel: Boolean = false,
    public var reserved: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var reserved4: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfRecoveryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfRecoveryInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): XpfRecoveryInfo =
                    XpfRecoveryInfo(
                        (XpfRecoveryInfo0.typeLayout()).readNative(addr),
                        (XpfRecoveryInfo1.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: XpfRecoveryInfo) {
                    (XpfRecoveryInfo0.typeLayout()).writeNative(addr, value.failureReason)
                    (XpfRecoveryInfo1.typeLayout()).writeNative(addr + 4L, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.actionRequired)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.recoverySucceeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.recoveryKernel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved4)
                }
            }
    }
}

public data class XpfRecoveryInfo1(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfRecoveryInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfRecoveryInfo1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): XpfRecoveryInfo1 =
                    XpfRecoveryInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XpfRecoveryInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class XpfRecoveryInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfRecoveryInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfRecoveryInfo0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): XpfRecoveryInfo0 =
                    XpfRecoveryInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XpfRecoveryInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class XsaveFormat(
    public var controlWord: UShort = 0u,
    public var statusWord: UShort = 0u,
    public var tagWord: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var errorOpcode: UShort = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var mxCsr: UInt = 0u,
    public var mxCsrMask: UInt = 0u,
    public var floatRegisters: List<M128a> = List(8) { M128a() },
    public var xmmRegisters: List<M128a> = List(8) { M128a() },
    public var reserved4: UByteArray = UByteArray(224),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XsaveFormat) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.errorOpcode != other.errorOpcode) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.mxCsr != other.mxCsr) return false
        if (this.mxCsrMask != other.mxCsrMask) return false
        if (this.floatRegisters != other.floatRegisters) return false
        if (this.xmmRegisters != other.xmmRegisters) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.errorOpcode.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.mxCsr.hashCode()
        result = 31 * result + this.mxCsrMask.hashCode()
        result = 31 * result + this.floatRegisters.hashCode()
        result = 31 * result + this.xmmRegisters.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        return result
    }
}

public class XstateContext internal constructor(
    public var mask: ULong,
    public var length: UInt,
    public var reserved1: UInt,
    areaCtorArg: MutPtr<XsaveArea>,
    public var reserved2: UInt,
    bufferCtorArg: MutPtr<CVoid>,
    public var reserved3: UInt,
) {
    public var area: MutPtr<XsaveArea> = areaCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        mask = 0uL,
        length = 0u,
        reserved1 = 0u,
        areaCtorArg = MutPtr(0L),
        reserved2 = 0u,
        bufferCtorArg = MutPtr(0L),
        reserved3 = 0u,
    )

    public operator fun component1(): ULong = this.mask

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.reserved1

    public operator fun component4(): MutPtr<XsaveArea> = this.area

    public operator fun component5(): UInt = this.reserved2

    public operator fun component6(): MutPtr<CVoid> = this.buffer

    public operator fun component7(): UInt = this.reserved3

    public fun copy(mask: ULong = this.mask, length: UInt = this.length, reserved1: UInt = this.reserved1, area: MutPtr<XsaveArea> = this.area, reserved2: UInt = this.reserved2, buffer: MutPtr<CVoid> = this.buffer, reserved3: UInt = this.reserved3): XstateContext = XstateContext(mask = mask, length = length, reserved1 = reserved1, areaCtorArg = area, reserved2 = reserved2, bufferCtorArg = buffer, reserved3 = reserved3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateContext) return false
        if (this.mask != other.mask) return false
        if (this.length != other.length) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.area != other.area) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.buffer != other.buffer) return false
        if (this.reserved3 != other.reserved3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.area.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateContext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): XstateContext =
                    XstateContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<XsaveArea>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: XstateContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<XsaveArea>(64)
                    ).writeNative(addr + 16L, value.area)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reserved3)
                }
            }

        public operator fun invoke(
            mask: ULong = 0uL,
            length: UInt = 0u,
            reserved1: UInt = 0u,
            area: MutPtr<XsaveArea> = MutPtr(0L),
            reserved2: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            reserved3: UInt = 0u,
        ): XstateContext =
            XstateContext(
                mask = mask,
                length = length,
                reserved1 = reserved1,
                areaCtorArg = area,
                reserved2 = reserved2,
                bufferCtorArg = buffer,
                reserved3 = reserved3,
            )
    }
}

public data class XstateSave(
    public var anonymous: XstateSave0 = XstateSave0(),
)

public data class XstateSave0(
    public var anonymous: XstateSave00 = XstateSave00(),
    public var xStateContext: XstateContext = XstateContext(),
)

public class XstateSave00 internal constructor(
    public var reserved1: Long,
    public var reserved2: UInt,
    prevCtorArg: MutPtr<XstateSave>,
    reserved3CtorArg: MutPtr<XsaveArea>,
    threadCtorArg: MutPtr<Int>,
    reserved4CtorArg: MutPtr<CVoid>,
    public var level: UByte,
) {
    public var prev: MutPtr<XstateSave> = prevCtorArg
        internal set

    public var reserved3: MutPtr<XsaveArea> = reserved3CtorArg
        internal set

    public var thread: MutPtr<Int> = threadCtorArg
        internal set

    public var reserved4: MutPtr<CVoid> = reserved4CtorArg
        internal set

    public constructor() : this(
        reserved1 = 0L,
        reserved2 = 0u,
        prevCtorArg = MutPtr(0L),
        reserved3CtorArg = MutPtr(0L),
        threadCtorArg = MutPtr(0L),
        reserved4CtorArg = MutPtr(0L),
        level = 0u,
    )

    public operator fun component1(): Long = this.reserved1

    public operator fun component2(): UInt = this.reserved2

    public operator fun component3(): MutPtr<XstateSave> = this.prev

    public operator fun component4(): MutPtr<XsaveArea> = this.reserved3

    public operator fun component5(): MutPtr<Int> = this.thread

    public operator fun component6(): MutPtr<CVoid> = this.reserved4

    public operator fun component7(): UByte = this.level

    public fun copy(reserved1: Long = this.reserved1, reserved2: UInt = this.reserved2, prev: MutPtr<XstateSave> = this.prev, reserved3: MutPtr<XsaveArea> = this.reserved3, thread: MutPtr<Int> = this.thread, reserved4: MutPtr<CVoid> = this.reserved4, level: UByte = this.level): XstateSave00 = XstateSave00(reserved1 = reserved1, reserved2 = reserved2, prevCtorArg = prev, reserved3CtorArg = reserved3, threadCtorArg = thread, reserved4CtorArg = reserved4, level = level)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateSave00) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.prev != other.prev) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.thread != other.thread) return false
        if (this.reserved4 != other.reserved4) return false
        if (this.level != other.level) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.prev.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.thread.hashCode()
        result = 31 * result + this.reserved4.hashCode()
        result = 31 * result + this.level.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateSave00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateSave00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): XstateSave00 =
                    XstateSave00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<XstateSave>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<XsaveArea>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: XstateSave00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<XstateSave>(64)
                    ).writeNative(addr + 16L, value.prev)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<XsaveArea>(64)
                    ).writeNative(addr + 24L, value.reserved3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 32L, value.thread)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.reserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 48L, value.level)
                }
            }

        public operator fun invoke(
            reserved1: Long = 0L,
            reserved2: UInt = 0u,
            prev: MutPtr<XstateSave> = MutPtr(0L),
            reserved3: MutPtr<XsaveArea> = MutPtr(0L),
            thread: MutPtr<Int> = MutPtr(0L),
            reserved4: MutPtr<CVoid> = MutPtr(0L),
            level: UByte = 0u,
        ): XstateSave00 =
            XstateSave00(
                reserved1 = reserved1,
                reserved2 = reserved2,
                prevCtorArg = prev,
                reserved3CtorArg = reserved3,
                threadCtorArg = thread,
                reserved4CtorArg = reserved4,
                level = level,
            )
    }
}

public data class ZoneHeader(
    public var freeList: SingleListEntry = SingleListEntry(),
    public var segmentList: SingleListEntry = SingleListEntry(),
    public var blockSize: UInt = 0u,
    public var totalSegmentSize: UInt = 0u,
)

public class ZoneSegmentHeader internal constructor(
    public var segmentList: SingleListEntry,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        segmentList = SingleListEntry(),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SingleListEntry = this.segmentList

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public fun copy(segmentList: SingleListEntry = this.segmentList, reserved: MutPtr<CVoid> = this.reserved): ZoneSegmentHeader = ZoneSegmentHeader(segmentList = segmentList, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ZoneSegmentHeader) return false
        if (this.segmentList != other.segmentList) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.segmentList.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            segmentList: SingleListEntry = SingleListEntry(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): ZoneSegmentHeader =
            ZoneSegmentHeader(
                segmentList = segmentList,
                reservedCtorArg = reserved,
            )
    }
}

public data class ExtSetParametersV0(
    public var version: UInt = 0u,
    public var reserved: UInt = 0u,
    public var noWakeTolerance: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtSetParametersV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtSetParametersV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ExtSetParametersV0 =
                    ExtSetParametersV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ExtSetParametersV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.noWakeTolerance)
                }
            }
    }
}
