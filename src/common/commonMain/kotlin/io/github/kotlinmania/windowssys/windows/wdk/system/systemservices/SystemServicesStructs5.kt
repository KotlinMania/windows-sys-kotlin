@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.M128a
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.XsaveArea
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SingleListEntry

public data class WheaRecoveryContext0(public var memoryError: WheaRecoveryContext00 = WheaRecoveryContext00(), public var pmemError: WheaRecoveryContext01 = WheaRecoveryContext01())

public data class WheaRecoveryContext00(
    public var address: Int = 0,
    public var consumed: Boolean = false,
    public var errorCode: UShort = 0u,
    public var errorIpValid: Boolean = false,
    public var restartIpValid: Boolean = false,
    public var clearPoison: Boolean = false,
)

public data class WheaRecoveryContext01(public var pmemErrInfo: Int = 0)

public data class WheaRegisterKeyNotificationFailedEvent(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry())

public data class WheaReportHwErrorDeviceDriverFlags(public var anonymous: WheaReportHwErrorDeviceDriverFlags0 = WheaReportHwErrorDeviceDriverFlags0(), public var asULONG: UInt = 0u)

public data class WheaReportHwErrorDeviceDriverFlags0(public var bitfield: UInt = 0u)

public data class WheaRevision(public var anonymous: WheaRevision0 = WheaRevision0(), public var asUSHORT: UShort = 0u)

public data class WheaRevision0(public var minorRevision: UByte = 0u, public var majorRevision: UByte = 0u)

public data class WheaSeaSection(
    public var esr: UInt = 0u,
    public var far: ULong = 0uL,
    public var par: ULong = 0uL,
    public var wasKernel: Boolean = false,
)

public data class WheaSeiSection(public var esr: UInt = 0u, public var far: ULong = 0uL)

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

public data class WheaSelBugcheckRecoveryStatusPhase1Event0(public var dumpPolicy: UByte = 0u, public var reserved: UByteArray = UByteArray(3)) {
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
}

public data class WheaSelBugcheckRecoveryStatusPhase2Event(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var bootId: UInt = 0u,
    public var success: Boolean = false,
)

public data class WheaSelBugcheckRecoveryStatusStartEvent(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(), public var startingIrql: UByte = 0u)

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

public data class WheaSrasTableError(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry())

public data class WheaSrasTableNotFound(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry())

public data class WheaThrottleAddErrSrcFailedEvent(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry())

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

public data class WheaThrottleRegistryCorruptEvent(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(), public var throttleType: WheaThrottleType = 0)

public data class WheaThrottleRegDataIgnoredEvent(public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(), public var throttleType: WheaThrottleType = 0)

public data class WheaTimestamp(public var anonymous: WheaTimestamp0 = WheaTimestamp0(), public var asLargeInteger: Long = 0L)

public data class WheaTimestamp0(public var bitfield: ULong = 0uL)

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
)

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
)

public data class WheaXpfBusCheck(public var anonymous: WheaXpfBusCheck0 = WheaXpfBusCheck0(), public var xpfBusCheck: ULong = 0uL)

public data class WheaXpfBusCheck0(public var bitfield: ULong = 0uL)

public data class WheaXpfCacheCheck(public var anonymous: WheaXpfCacheCheck0 = WheaXpfCacheCheck0(), public var xpfCacheCheck: ULong = 0uL)

public data class WheaXpfCacheCheck0(public var bitfield: ULong = 0uL)

public data class WheaXpfContextInfo(
    public var registerContextType: UShort = 0u,
    public var registerDataSize: UShort = 0u,
    public var mSRAddress: UInt = 0u,
    public var mmRegisterAddress: ULong = 0uL,
)

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

public data class WheaXpfMcaSection0(public var extendedRegisters: ULongArray = ULongArray(24), public var aMDExtendedRegisters: WheaAmdExtendedRegisters = WheaAmdExtendedRegisters()) {
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

public data class WheaXpfMsCheck(public var anonymous: WheaXpfMsCheck0 = WheaXpfMsCheck0(), public var xpfMsCheck: ULong = 0uL)

public data class WheaXpfMsCheck0(public var bitfield: ULong = 0uL)

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

public data class WheaXpfProcessorErrorSectionValidbits(public var anonymous: WheaXpfProcessorErrorSectionValidbits0 = WheaXpfProcessorErrorSectionValidbits0(), public var validBits: ULong = 0uL)

public data class WheaXpfProcessorErrorSectionValidbits0(public var bitfield: ULong = 0uL)

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

public data class WheaXpfProcinfoValidbits(public var anonymous: WheaXpfProcinfoValidbits0 = WheaXpfProcinfoValidbits0(), public var validBits: ULong = 0uL)

public data class WheaXpfProcinfoValidbits0(public var bitfield: ULong = 0uL)

public data class WheaXpfTlbCheck(public var anonymous: WheaXpfTlbCheck0 = WheaXpfTlbCheck0(), public var xpfTLBCheck: ULong = 0uL)

public data class WheaXpfTlbCheck0(public var bitfield: ULong = 0uL)

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
)

public data class XpfRecoveryInfo1(public var bitfield: UInt = 0u)

public data class XpfRecoveryInfo0(public var bitfield: UInt = 0u)

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

public data class XstateContext(
    public var mask: ULong = 0uL,
    public var length: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var area: XsaveArea? = null,
    public var reserved2: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var reserved3: UInt = 0u,
)

public data class XstateSave(public var anonymous: XstateSave0 = XstateSave0())

public data class XstateSave0(public var anonymous: XstateSave00 = XstateSave00(), public var xStateContext: XstateContext = XstateContext())

public data class XstateSave00(
    public var reserved1: Long = 0L,
    public var reserved2: UInt = 0u,
    public var prev: XstateSave? = null,
    public var reserved3: XsaveArea? = null,
    public var thread: Int? = null,
    public var reserved4: COpaquePointer? = null,
    public var level: UByte = 0u,
)

public data class ZoneHeader(
    public var freeList: SingleListEntry = SingleListEntry(),
    public var segmentList: SingleListEntry = SingleListEntry(),
    public var blockSize: UInt = 0u,
    public var totalSegmentSize: UInt = 0u,
)

public data class ZoneSegmentHeader(public var segmentList: SingleListEntry = SingleListEntry(), public var reserved: COpaquePointer? = null)

public data class ExtSetParametersV0(
    public var version: UInt = 0u,
    public var reserved: UInt = 0u,
    public var noWakeTolerance: Long = 0L,
)
