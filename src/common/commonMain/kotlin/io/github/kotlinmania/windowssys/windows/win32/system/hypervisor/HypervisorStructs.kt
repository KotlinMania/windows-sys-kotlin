@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily

public data class DosImageInfo(
    public var pdbName: Pcstr = null,
    public var imageBaseAddress: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var timestamp: UInt = 0u,
)

public data class GpaMemoryChunk(public var guestPhysicalStartPageIndex: ULong = 0uL, public var pageCount: ULong = 0uL)

public data class GuestOsInfo(
    public var asUINT64: ULong = 0uL,
    public var closedSource: GuestOsInfo0 = GuestOsInfo0(),
    public var openSource: GuestOsInfo1 = GuestOsInfo1(),
)

public data class GuestOsInfo0(public var bitfield: ULong = 0uL)

public data class GuestOsInfo1(public var bitfield: ULong = 0uL)

public data class HdvPciDeviceInterface(
    public var version: HdvPciInterfaceVersion = 0,
    public var initialize: HdvPciDeviceInitialize = null,
    public var teardown: HdvPciDeviceTeardown = null,
    public var setConfiguration: HdvPciDeviceSetConfiguration = null,
    public var getDetails: HdvPciDeviceGetDetails = null,
    public var start: HdvPciDeviceStart = null,
    public var stop: HdvPciDeviceStop = null,
    public var readConfigSpace: HdvPciReadConfigSpace = null,
    public var writeConfigSpace: HdvPciWriteConfigSpace = null,
    public var readInterceptedMemory: HdvPciReadInterceptedMemory = null,
    public var writeInterceptedMemory: HdvPciWriteInterceptedMemory = null,
)

public data class HdvPciPnpId(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var progIf: UByte = 0u,
    public var subClass: UByte = 0u,
    public var baseClass: UByte = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
)

public data class HvsocketAddressInfo(
    public var systemId: Guid = Guid(),
    public var virtualMachineId: Guid = Guid(),
    public var siloId: Guid = Guid(),
    public var flags: UInt = 0u,
)

public data class ModuleInfo(public var processImageName: Pcstr = null, public var image: DosImageInfo = DosImageInfo())

public data class SockaddrHv(
    public var family: AddressFamily = 0u,
    public var reserved: UShort = 0u,
    public var vmId: Guid = Guid(),
    public var serviceId: Guid = Guid(),
)

public data class VirtualProcessorRegister(
    public var reg64: ULong = 0uL,
    public var reg32: UInt = 0u,
    public var reg16: UShort = 0u,
    public var reg8: UByte = 0u,
    public var reg128: VirtualProcessorRegister0 = VirtualProcessorRegister0(),
    public var x64: VirtualProcessorRegister1 = VirtualProcessorRegister1(),
)

public data class VirtualProcessorRegister0(public var low64: ULong = 0uL, public var high64: ULong = 0uL)

public data class VirtualProcessorRegister1(
    public var segment: VirtualProcessorRegister10 = VirtualProcessorRegister10(),
    public var table: VirtualProcessorRegister11 = VirtualProcessorRegister11(),
    public var fpControlStatus: VirtualProcessorRegister12 = VirtualProcessorRegister12(),
    public var xmmControlStatus: VirtualProcessorRegister13 = VirtualProcessorRegister13(),
)

public data class VirtualProcessorRegister12(
    public var fpControl: UShort = 0u,
    public var fpStatus: UShort = 0u,
    public var fpTag: UByte = 0u,
    public var reserved: UByte = 0u,
    public var lastFpOp: UShort = 0u,
    public var anonymous: VirtualProcessorRegister120 = VirtualProcessorRegister120(),
)

public data class VirtualProcessorRegister120(public var lastFpRip: ULong = 0uL, public var anonymous: VirtualProcessorRegister1200 = VirtualProcessorRegister1200())

public data class VirtualProcessorRegister1200(public var lastFpEip: UInt = 0u, public var lastFpCs: UShort = 0u)

public data class VirtualProcessorRegister10(
    public var base: ULong = 0uL,
    public var limit: UInt = 0u,
    public var selector: UShort = 0u,
    public var anonymous: VirtualProcessorRegister100 = VirtualProcessorRegister100(),
)

public data class VirtualProcessorRegister100(public var attributes: UShort = 0u, public var anonymous: VirtualProcessorRegister1000 = VirtualProcessorRegister1000())

public data class VirtualProcessorRegister1000(public var bitfield: UShort = 0u)

public data class VirtualProcessorRegister11(public var limit: UShort = 0u, public var base: ULong = 0uL)

public data class VirtualProcessorRegister13(
    public var anonymous: VirtualProcessorRegister130 = VirtualProcessorRegister130(),
    public var xmmStatusControl: UInt = 0u,
    public var xmmStatusControlMask: UInt = 0u,
)

public data class VirtualProcessorRegister130(public var lastFpRdp: ULong = 0uL, public var anonymous: VirtualProcessorRegister1300 = VirtualProcessorRegister1300())

public data class VirtualProcessorRegister1300(public var lastFpDp: UInt = 0u, public var lastFpDs: UShort = 0u)

public data class VmGencounter(public var generationCount: ULong = 0uL, public var generationCountHigh: ULong = 0uL)

public data class WhvAccessGpaControls(public var asUINT64: ULong = 0uL, public var anonymous: WhvAccessGpaControls0 = WhvAccessGpaControls0())

public data class WhvAccessGpaControls0(public var cacheType: WhvCacheType = 0, public var reserved: UInt = 0u)

public data class WhvAdviseGpaRange(public var populate: WhvAdviseGpaRangePopulate = WhvAdviseGpaRangePopulate())

public data class WhvAdviseGpaRangePopulate(public var flags: WhvAdviseGpaRangePopulateFlags = WhvAdviseGpaRangePopulateFlags(), public var accessType: WhvMemoryAccessType = 0)

public data class WhvAdviseGpaRangePopulateFlags(public var asUINT32: UInt = 0u, public var anonymous: WhvAdviseGpaRangePopulateFlags0 = WhvAdviseGpaRangePopulateFlags0())

public data class WhvAdviseGpaRangePopulateFlags0(public var bitfield: UInt = 0u)

public class WhvCapability(
    public var hypervisorPresent: Bool = 0,
    public var features: WhvCapabilityFeatures = WhvCapabilityFeatures(),
    public var extendedVmExits: WhvExtendedVmExits = WhvExtendedVmExits(),
    public var processorVendor: WhvProcessorVendor = 0,
    public var processorFeatures: WhvProcessorFeatures = WhvProcessorFeatures(),
    public var syntheticProcessorFeaturesBanks: WhvSyntheticProcessorFeaturesBanks = WhvSyntheticProcessorFeaturesBanks(),
    public var processorXsaveFeatures: WhvProcessorXsaveFeatures = WhvProcessorXsaveFeatures(),
    public var processorClFlushSize: UByte = 0u,
    public var exceptionExitBitmap: ULong = 0uL,
    public var x64MsrExitBitmap: WhvX64MsrExitBitmap = WhvX64MsrExitBitmap(),
    public var processorClockFrequency: ULong = 0uL,
    public var interruptClockFrequency: ULong = 0uL,
    public var processorFeaturesBanks: WhvProcessorFeaturesBanks = WhvProcessorFeaturesBanks(),
    public var gpaRangePopulateFlags: WhvAdviseGpaRangePopulateFlags = WhvAdviseGpaRangePopulateFlags(),
    public var processorFrequencyCap: WhvCapabilityProcessorFrequencyCap = WhvCapabilityProcessorFrequencyCap(),
    public var processorPerfmonFeatures: WhvProcessorPerfmonFeatures = WhvProcessorPerfmonFeatures(),
    public var schedulerFeatures: WhvSchedulerFeatures = WhvSchedulerFeatures(),
)

public data class WhvCapabilityFeatures(public var anonymous: WhvCapabilityFeatures0 = WhvCapabilityFeatures0(), public var asUINT64: ULong = 0uL)

public data class WhvCapabilityFeatures0(public var bitfield: ULong = 0uL)

public data class WhvCapabilityProcessorFrequencyCap(
    public var bitfield: UInt = 0u,
    public var highestFrequencyMhz: UInt = 0u,
    public var nominalFrequencyMhz: UInt = 0u,
    public var lowestFrequencyMhz: UInt = 0u,
    public var frequencyStepMhz: UInt = 0u,
)

public data class WhvCpuidOutput(
    public var eax: UInt = 0u,
    public var ebx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var edx: UInt = 0u,
)

public data class WhvDoorbellMatchData(
    public var guestAddress: ULong = 0uL,
    public var value: ULong = 0uL,
    public var length: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class WhvEmulatorCallbacks(
    public var size: UInt = 0u,
    public var reserved: UInt = 0u,
    public var wHvEmulatorIoPortCallback: WhvEmulatorIoPortCallback = null,
    public var wHvEmulatorMemoryCallback: WhvEmulatorMemoryCallback = null,
    public var wHvEmulatorGetVirtualProcessorRegisters: WhvEmulatorGetVirtualProcessorRegistersCallback = null,
    public var wHvEmulatorSetVirtualProcessorRegisters: WhvEmulatorSetVirtualProcessorRegistersCallback = null,
    public var wHvEmulatorTranslateGvaPage: WhvEmulatorTranslateGvaPageCallback = null,
)

public data class WhvEmulatorIoAccessInfo(
    public var direction: UByte = 0u,
    public var port: UShort = 0u,
    public var accessSize: UShort = 0u,
    public var data: UInt = 0u,
)

public data class WhvEmulatorMemoryAccessInfo(
    public var gpaAddress: ULong = 0uL,
    public var direction: UByte = 0u,
    public var accessSize: UByte = 0u,
    public var data: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvEmulatorMemoryAccessInfo) return false
        if (this.gpaAddress != other.gpaAddress) return false
        if (this.direction != other.direction) return false
        if (this.accessSize != other.accessSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpaAddress.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.accessSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WhvEmulatorStatus(public var anonymous: WhvEmulatorStatus0 = WhvEmulatorStatus0(), public var asUINT32: UInt = 0u)

public data class WhvEmulatorStatus0(public var bitfield: UInt = 0u)

public data class WhvExtendedVmExits(public var anonymous: WhvExtendedVmExits0 = WhvExtendedVmExits0(), public var asUINT64: ULong = 0uL)

public data class WhvExtendedVmExits0(public var bitfield: ULong = 0uL)

public data class WhvHypercallContext(
    public var rax: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var reserved0: ULong = 0uL,
    public var xmmRegisters: List<WhvUint128> = List(6) { WhvUint128() },
    public var reserved1: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvHypercallContext) return false
        if (this.rax != other.rax) return false
        if (this.rbx != other.rbx) return false
        if (this.rcx != other.rcx) return false
        if (this.rdx != other.rdx) return false
        if (this.r8 != other.r8) return false
        if (this.rsi != other.rsi) return false
        if (this.rdi != other.rdi) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.xmmRegisters != other.xmmRegisters) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rax.hashCode()
        result = 31 * result + this.rbx.hashCode()
        result = 31 * result + this.rcx.hashCode()
        result = 31 * result + this.rdx.hashCode()
        result = 31 * result + this.r8.hashCode()
        result = 31 * result + this.rsi.hashCode()
        result = 31 * result + this.rdi.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.xmmRegisters.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class WhvInternalActivityRegister(public var anonymous: WhvInternalActivityRegister0 = WhvInternalActivityRegister0(), public var asUINT64: ULong = 0uL)

public data class WhvInternalActivityRegister0(public var bitfield: ULong = 0uL)

public data class WhvInterruptControl(
    public var bitfield: ULong = 0uL,
    public var destination: UInt = 0u,
    public var vector: UInt = 0u,
)

public data class WhvMemoryAccessContext(
    public var instructionByteCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var instructionBytes: UByteArray = UByteArray(16),
    public var accessInfo: WhvMemoryAccessInfo = WhvMemoryAccessInfo(),
    public var gpa: ULong = 0uL,
    public var gva: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvMemoryAccessContext) return false
        if (this.instructionByteCount != other.instructionByteCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.instructionBytes.contentEquals(other.instructionBytes)) return false
        if (this.accessInfo != other.accessInfo) return false
        if (this.gpa != other.gpa) return false
        if (this.gva != other.gva) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionByteCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instructionBytes.contentHashCode()
        result = 31 * result + this.accessInfo.hashCode()
        result = 31 * result + this.gpa.hashCode()
        result = 31 * result + this.gva.hashCode()
        return result
    }
}

public data class WhvMemoryAccessInfo(public var anonymous: WhvMemoryAccessInfo0 = WhvMemoryAccessInfo0(), public var asUINT32: UInt = 0u)

public data class WhvMemoryAccessInfo0(public var bitfield: UInt = 0u)

public data class WhvMemoryRangeEntry(public var guestAddress: ULong = 0uL, public var sizeInBytes: ULong = 0uL)

public data class WhvMsrActionEntry(
    public var index: UInt = 0u,
    public var readAction: UByte = 0u,
    public var writeAction: UByte = 0u,
    public var reserved: UShort = 0u,
)

public data class WhvNotificationPortParameters(
    public var notificationPortType: WhvNotificationPortType = 0,
    public var reserved: UInt = 0u,
    public var anonymous: WhvNotificationPortParameters0 = WhvNotificationPortParameters0(),
)

public data class WhvNotificationPortParameters0(public var doorbell: WhvDoorbellMatchData = WhvDoorbellMatchData(), public var event: WhvNotificationPortParameters00 = WhvNotificationPortParameters00())

public data class WhvNotificationPortParameters00(public var connectionId: UInt = 0u)

public data class WhvPartitionMemoryCounters(
    public var mapped4KPageCount: ULong = 0uL,
    public var mapped2MPageCount: ULong = 0uL,
    public var mapped1GPageCount: ULong = 0uL,
)

public class WhvPartitionProperty(
    public var extendedVmExits: WhvExtendedVmExits = WhvExtendedVmExits(),
    public var processorFeatures: WhvProcessorFeatures = WhvProcessorFeatures(),
    public var syntheticProcessorFeaturesBanks: WhvSyntheticProcessorFeaturesBanks = WhvSyntheticProcessorFeaturesBanks(),
    public var processorXsaveFeatures: WhvProcessorXsaveFeatures = WhvProcessorXsaveFeatures(),
    public var processorClFlushSize: UByte = 0u,
    public var processorCount: UInt = 0u,
    public var cpuidExitList: UIntArray = UIntArray(1),
    public var cpuidResultList: List<WhvX64CpuidResult> = List(1) { WhvX64CpuidResult() },
    public var cpuidResultList2: List<WhvX64CpuidResult2> = List(1) { WhvX64CpuidResult2() },
    public var msrActionList: List<WhvMsrActionEntry> = List(1) { WhvMsrActionEntry() },
    public var unimplementedMsrAction: WhvMsrAction = 0,
    public var exceptionExitBitmap: ULong = 0uL,
    public var localApicEmulationMode: WhvX64LocalApicEmulationMode = 0,
    public var separateSecurityDomain: Bool = 0,
    public var nestedVirtualization: Bool = 0,
    public var x64MsrExitBitmap: WhvX64MsrExitBitmap = WhvX64MsrExitBitmap(),
    public var processorClockFrequency: ULong = 0uL,
    public var interruptClockFrequency: ULong = 0uL,
    public var apicRemoteRead: Bool = 0,
    public var processorFeaturesBanks: WhvProcessorFeaturesBanks = WhvProcessorFeaturesBanks(),
    public var referenceTime: ULong = 0uL,
    public var primaryNumaNode: UShort = 0u,
    public var cpuReserve: UInt = 0u,
    public var cpuCap: UInt = 0u,
    public var cpuWeight: UInt = 0u,
    public var cpuGroupId: ULong = 0uL,
    public var processorFrequencyCap: UInt = 0u,
    public var allowDeviceAssignment: Bool = 0,
    public var processorPerfmonFeatures: WhvProcessorPerfmonFeatures = WhvProcessorPerfmonFeatures(),
    public var disableSmt: Bool = 0,
)

public data class WhvProcessorApicCounters(
    public var mmioAccessCount: ULong = 0uL,
    public var eoiAccessCount: ULong = 0uL,
    public var tprAccessCount: ULong = 0uL,
    public var sentIpiCount: ULong = 0uL,
    public var selfIpiCount: ULong = 0uL,
)

public data class WhvProcessorEventCounters(
    public var pageFaultCount: ULong = 0uL,
    public var exceptionCount: ULong = 0uL,
    public var interruptCount: ULong = 0uL,
)

public data class WhvProcessorFeatures(public var anonymous: WhvProcessorFeatures0 = WhvProcessorFeatures0(), public var asUINT64: ULong = 0uL)

public data class WhvProcessorFeatures0(public var bitfield: ULong = 0uL)

public data class WhvProcessorFeatures1(public var anonymous: WhvProcessorFeatures10 = WhvProcessorFeatures10(), public var asUINT64: ULong = 0uL)

public data class WhvProcessorFeatures10(public var bitfield: ULong = 0uL)

public data class WhvProcessorFeaturesBanks(
    public var banksCount: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var anonymous: WhvProcessorFeaturesBanks0 = WhvProcessorFeaturesBanks0(),
)

public data class WhvProcessorFeaturesBanks0(public var anonymous: WhvProcessorFeaturesBanks00 = WhvProcessorFeaturesBanks00(), public var asUINT64: ULongArray = ULongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvProcessorFeaturesBanks0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asUINT64.contentEquals(other.asUINT64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asUINT64.contentHashCode()
        return result
    }
}

public data class WhvProcessorFeaturesBanks00(public var bank0: WhvProcessorFeatures = WhvProcessorFeatures(), public var bank1: WhvProcessorFeatures1 = WhvProcessorFeatures1())

public data class WhvProcessorInterceptCounter(public var count: ULong = 0uL, public var time100ns: ULong = 0uL)

public data class WhvProcessorInterceptCounters(
    public var pageInvalidations: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var controlRegisterAccesses: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var ioInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var haltInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var cpuidInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var msrAccesses: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var otherIntercepts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var pendingInterrupts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var emulatedInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var debugRegisterAccesses: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var pageFaultIntercepts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var nestedPageFaultIntercepts: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var hypercalls: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
    public var rdpmcInstructions: WhvProcessorInterceptCounter = WhvProcessorInterceptCounter(),
)

public data class WhvProcessorPerfmonFeatures(public var anonymous: WhvProcessorPerfmonFeatures0 = WhvProcessorPerfmonFeatures0(), public var asUINT64: ULong = 0uL)

public data class WhvProcessorPerfmonFeatures0(public var bitfield: ULong = 0uL)

public data class WhvProcessorRuntimeCounters(public var totalRuntime100ns: ULong = 0uL, public var hypervisorRuntime100ns: ULong = 0uL)

public data class WhvProcessorSyntheticFeaturesCounters(
    public var syntheticInterruptsCount: ULong = 0uL,
    public var longSpinWaitHypercallsCount: ULong = 0uL,
    public var otherHypercallsCount: ULong = 0uL,
    public var syntheticInterruptHypercallsCount: ULong = 0uL,
    public var virtualInterruptHypercallsCount: ULong = 0uL,
    public var virtualMmuHypercallsCount: ULong = 0uL,
)

public data class WhvProcessorXsaveFeatures(public var anonymous: WhvProcessorXsaveFeatures0 = WhvProcessorXsaveFeatures0(), public var asUINT64: ULong = 0uL)

public data class WhvProcessorXsaveFeatures0(public var bitfield: ULong = 0uL)

public class WhvRegisterValue(
    public var reg128: WhvUint128 = WhvUint128(),
    public var reg64: ULong = 0uL,
    public var reg32: UInt = 0u,
    public var reg16: UShort = 0u,
    public var reg8: UByte = 0u,
    public var fp: WhvX64FpRegister = WhvX64FpRegister(),
    public var fpControlStatus: WhvX64FpControlStatusRegister = WhvX64FpControlStatusRegister(),
    public var xmmControlStatus: WhvX64XmmControlStatusRegister = WhvX64XmmControlStatusRegister(),
    public var segment: WhvX64SegmentRegister = WhvX64SegmentRegister(),
    public var table: WhvX64TableRegister = WhvX64TableRegister(),
    public var interruptState: WhvX64InterruptStateRegister = WhvX64InterruptStateRegister(),
    public var pendingInterruption: WhvX64PendingInterruptionRegister = WhvX64PendingInterruptionRegister(),
    public var deliverabilityNotifications: WhvX64DeliverabilityNotificationsRegister = WhvX64DeliverabilityNotificationsRegister(),
    public var exceptionEvent: WhvX64PendingExceptionEvent = WhvX64PendingExceptionEvent(),
    public var extIntEvent: WhvX64PendingExtIntEvent = WhvX64PendingExtIntEvent(),
    public var internalActivity: WhvInternalActivityRegister = WhvInternalActivityRegister(),
    public var pendingDebugException: WhvX64PendingDebugException = WhvX64PendingDebugException(),
)

public data class WhvRunVpCanceledContext(public var cancelReason: WhvRunVpCancelReason = 0)

public data class WhvRunVpExitContext(
    public var exitReason: WhvRunVpExitReason = 0,
    public var reserved: UInt = 0u,
    public var vpContext: WhvVpExitContext = WhvVpExitContext(),
    public var anonymous: WhvRunVpExitContext0 = WhvRunVpExitContext0(),
)

public data class WhvRunVpExitContext0(
    public var memoryAccess: WhvMemoryAccessContext = WhvMemoryAccessContext(),
    public var ioPortAccess: WhvX64IoPortAccessContext = WhvX64IoPortAccessContext(),
    public var msrAccess: WhvX64MsrAccessContext = WhvX64MsrAccessContext(),
    public var cpuidAccess: WhvX64CpuidAccessContext = WhvX64CpuidAccessContext(),
    public var vpException: WhvVpExceptionContext = WhvVpExceptionContext(),
    public var interruptWindow: WhvX64InterruptionDeliverableContext = WhvX64InterruptionDeliverableContext(),
    public var unsupportedFeature: WhvX64UnsupportedFeatureContext = WhvX64UnsupportedFeatureContext(),
    public var cancelReason: WhvRunVpCanceledContext = WhvRunVpCanceledContext(),
    public var apicEoi: WhvX64ApicEoiContext = WhvX64ApicEoiContext(),
    public var readTsc: WhvX64RdtscContext = WhvX64RdtscContext(),
    public var apicSmi: WhvX64ApicSmiContext = WhvX64ApicSmiContext(),
    public var hypercall: WhvHypercallContext = WhvHypercallContext(),
    public var apicInitSipi: WhvX64ApicInitSipiContext = WhvX64ApicInitSipiContext(),
    public var apicWrite: WhvX64ApicWriteContext = WhvX64ApicWriteContext(),
    public var synicSintDeliverable: WhvSynicSintDeliverableContext = WhvSynicSintDeliverableContext(),
)

public data class WhvSchedulerFeatures(public var anonymous: WhvSchedulerFeatures0 = WhvSchedulerFeatures0(), public var asUINT64: ULong = 0uL)

public data class WhvSchedulerFeatures0(public var bitfield: ULong = 0uL)

public data class WhvSriovResourceDescriptor(
    public var pnpInstanceId: UShortArray = UShortArray(200),
    public var virtualFunctionId: Luid = Luid(),
    public var virtualFunctionIndex: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvSriovResourceDescriptor) return false
        if (!this.pnpInstanceId.contentEquals(other.pnpInstanceId)) return false
        if (this.virtualFunctionId != other.virtualFunctionId) return false
        if (this.virtualFunctionIndex != other.virtualFunctionIndex) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pnpInstanceId.contentHashCode()
        result = 31 * result + this.virtualFunctionId.hashCode()
        result = 31 * result + this.virtualFunctionIndex.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }
}

public data class WhvSynicEventParameters(
    public var vpIndex: UInt = 0u,
    public var targetSint: UByte = 0u,
    public var reserved: UByte = 0u,
    public var flagNumber: UShort = 0u,
)

public data class WhvSynicSintDeliverableContext(
    public var deliverableSints: UShort = 0u,
    public var reserved1: UShort = 0u,
    public var reserved2: UInt = 0u,
)

public data class WhvSyntheticProcessorFeatures(public var anonymous: WhvSyntheticProcessorFeatures0 = WhvSyntheticProcessorFeatures0(), public var asUINT64: ULong = 0uL)

public data class WhvSyntheticProcessorFeatures0(public var bitfield: ULong = 0uL)

public data class WhvSyntheticProcessorFeaturesBanks(
    public var banksCount: UInt = 0u,
    public var reserved0: UInt = 0u,
    public var anonymous: WhvSyntheticProcessorFeaturesBanks0 = WhvSyntheticProcessorFeaturesBanks0(),
)

public data class WhvSyntheticProcessorFeaturesBanks0(public var anonymous: WhvSyntheticProcessorFeaturesBanks00 = WhvSyntheticProcessorFeaturesBanks00(), public var asUINT64: ULongArray = ULongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvSyntheticProcessorFeaturesBanks0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asUINT64.contentEquals(other.asUINT64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asUINT64.contentHashCode()
        return result
    }
}

public data class WhvSyntheticProcessorFeaturesBanks00(public var bank0: WhvSyntheticProcessorFeatures = WhvSyntheticProcessorFeatures())

public data class WhvTranslateGvaResult(public var resultCode: WhvTranslateGvaResultCode = 0, public var reserved: UInt = 0u)

public data class WhvTriggerParameters(
    public var triggerType: WhvTriggerType = 0,
    public var reserved: UInt = 0u,
    public var anonymous: WhvTriggerParameters0 = WhvTriggerParameters0(),
)

public data class WhvTriggerParameters0(
    public var interrupt: WhvInterruptControl = WhvInterruptControl(),
    public var synicEvent: WhvSynicEventParameters = WhvSynicEventParameters(),
    public var deviceInterrupt: WhvTriggerParameters00 = WhvTriggerParameters00(),
)

public data class WhvTriggerParameters00(
    public var logicalDeviceId: ULong = 0uL,
    public var msiAddress: ULong = 0uL,
    public var msiData: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class WhvUint128(public var anonymous: WhvUint1280 = WhvUint1280(), public var dword: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvUint128) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.dword.contentEquals(other.dword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.dword.contentHashCode()
        return result
    }
}

public data class WhvUint1280(public var low64: ULong = 0uL, public var high64: ULong = 0uL)

public data class WhvVirtualProcessorProperty(
    public var propertyCode: WhvVirtualProcessorPropertyCode = 0,
    public var reserved: UInt = 0u,
    public var anonymous: WhvVirtualProcessorProperty0 = WhvVirtualProcessorProperty0(),
)

public data class WhvVirtualProcessorProperty0(public var numaNode: UShort = 0u, public var padding: ULong = 0uL)

public data class WhvVpciDeviceNotification(
    public var notificationType: WhvVpciDeviceNotificationType = 0,
    public var reserved1: UInt = 0u,
    public var anonymous: WhvVpciDeviceNotification0 = WhvVpciDeviceNotification0(),
)

public data class WhvVpciDeviceNotification0(public var reserved2: ULong = 0uL)

public data class WhvVpciDeviceRegister(
    public var location: WhvVpciDeviceRegisterSpace = 0,
    public var sizeInBytes: UInt = 0u,
    public var offsetInBytes: ULong = 0uL,
)

public data class WhvVpciHardwareIds(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var progIf: UByte = 0u,
    public var subClass: UByte = 0u,
    public var baseClass: UByte = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
)

public data class WhvVpciInterruptTarget(
    public var vector: UInt = 0u,
    public var flags: WhvVpciInterruptTargetFlags = 0,
    public var processorCount: UInt = 0u,
    public var processors: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpciInterruptTarget) return false
        if (this.vector != other.vector) return false
        if (this.flags != other.flags) return false
        if (this.processorCount != other.processorCount) return false
        if (!this.processors.contentEquals(other.processors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vector.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.processorCount.hashCode()
        result = 31 * result + this.processors.contentHashCode()
        return result
    }
}

public data class WhvVpciMmioMapping(
    public var location: WhvVpciDeviceRegisterSpace = 0,
    public var flags: WhvVpciMmioRangeFlags = 0,
    public var sizeInBytes: ULong = 0uL,
    public var offsetInBytes: ULong = 0uL,
    public var virtualAddress: COpaquePointer? = null,
)

public data class WhvVpciProbedBars(public var value: UIntArray = UIntArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpciProbedBars) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.value.contentHashCode()
    }
}

public data class WhvVpExceptionContext(
    public var instructionByteCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var instructionBytes: UByteArray = UByteArray(16),
    public var exceptionInfo: WhvVpExceptionInfo = WhvVpExceptionInfo(),
    public var exceptionType: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
    public var errorCode: UInt = 0u,
    public var exceptionParameter: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvVpExceptionContext) return false
        if (this.instructionByteCount != other.instructionByteCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.instructionBytes.contentEquals(other.instructionBytes)) return false
        if (this.exceptionInfo != other.exceptionInfo) return false
        if (this.exceptionType != other.exceptionType) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.errorCode != other.errorCode) return false
        if (this.exceptionParameter != other.exceptionParameter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionByteCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instructionBytes.contentHashCode()
        result = 31 * result + this.exceptionInfo.hashCode()
        result = 31 * result + this.exceptionType.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.exceptionParameter.hashCode()
        return result
    }
}

public data class WhvVpExceptionInfo(public var anonymous: WhvVpExceptionInfo0 = WhvVpExceptionInfo0(), public var asUINT32: UInt = 0u)

public data class WhvVpExceptionInfo0(public var bitfield: UInt = 0u)

public data class WhvVpExitContext(
    public var executionState: WhvX64VpExecutionState = WhvX64VpExecutionState(),
    public var bitfield: UByte = 0u,
    public var reserved: UByte = 0u,
    public var reserved2: UInt = 0u,
    public var cs: WhvX64SegmentRegister = WhvX64SegmentRegister(),
    public var rip: ULong = 0uL,
    public var rflags: ULong = 0uL,
)

public data class WhvX64ApicEoiContext(public var interruptVector: UInt = 0u)

public data class WhvX64ApicInitSipiContext(public var apicIcr: ULong = 0uL)

public data class WhvX64ApicSmiContext(public var apicIcr: ULong = 0uL)

public data class WhvX64ApicWriteContext(
    public var type: WhvX64ApicWriteType = 0,
    public var reserved: UInt = 0u,
    public var writeValue: ULong = 0uL,
)

public data class WhvX64CpuidAccessContext(
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var defaultResultRax: ULong = 0uL,
    public var defaultResultRcx: ULong = 0uL,
    public var defaultResultRdx: ULong = 0uL,
    public var defaultResultRbx: ULong = 0uL,
)

public data class WhvX64CpuidResult(
    public var function: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
    public var eax: UInt = 0u,
    public var ebx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var edx: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvX64CpuidResult) return false
        if (this.function != other.function) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.eax != other.eax) return false
        if (this.ebx != other.ebx) return false
        if (this.ecx != other.ecx) return false
        if (this.edx != other.edx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.function.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.eax.hashCode()
        result = 31 * result + this.ebx.hashCode()
        result = 31 * result + this.ecx.hashCode()
        result = 31 * result + this.edx.hashCode()
        return result
    }
}

public data class WhvX64CpuidResult2(
    public var function: UInt = 0u,
    public var index: UInt = 0u,
    public var vpIndex: UInt = 0u,
    public var flags: WhvX64CpuidResult2Flags = 0,
    public var output: WhvCpuidOutput = WhvCpuidOutput(),
    public var mask: WhvCpuidOutput = WhvCpuidOutput(),
)

public data class WhvX64DeliverabilityNotificationsRegister(public var anonymous: WhvX64DeliverabilityNotificationsRegister0 = WhvX64DeliverabilityNotificationsRegister0(), public var asUINT64: ULong = 0uL)

public data class WhvX64DeliverabilityNotificationsRegister0(public var bitfield: ULong = 0uL)

public data class WhvX64FpControlStatusRegister(public var anonymous: WhvX64FpControlStatusRegister0 = WhvX64FpControlStatusRegister0(), public var asUINT128: WhvUint128 = WhvUint128())

public data class WhvX64FpControlStatusRegister0(
    public var fpControl: UShort = 0u,
    public var fpStatus: UShort = 0u,
    public var fpTag: UByte = 0u,
    public var reserved: UByte = 0u,
    public var lastFpOp: UShort = 0u,
    public var anonymous: WhvX64FpControlStatusRegister00 = WhvX64FpControlStatusRegister00(),
)

public data class WhvX64FpControlStatusRegister00(public var lastFpRip: ULong = 0uL, public var anonymous: WhvX64FpControlStatusRegister000 = WhvX64FpControlStatusRegister000())

public data class WhvX64FpControlStatusRegister000(
    public var lastFpEip: UInt = 0u,
    public var lastFpCs: UShort = 0u,
    public var reserved2: UShort = 0u,
)

public data class WhvX64FpRegister(public var anonymous: WhvX64FpRegister0 = WhvX64FpRegister0(), public var asUINT128: WhvUint128 = WhvUint128())

public data class WhvX64FpRegister0(public var mantissa: ULong = 0uL, public var bitfield: ULong = 0uL)

public data class WhvX64InterruptionDeliverableContext(public var deliverableType: WhvX64PendingInterruptionType = 0)

public data class WhvX64InterruptStateRegister(public var anonymous: WhvX64InterruptStateRegister0 = WhvX64InterruptStateRegister0(), public var asUINT64: ULong = 0uL)

public data class WhvX64InterruptStateRegister0(public var bitfield: ULong = 0uL)

public data class WhvX64IoPortAccessContext(
    public var instructionByteCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var instructionBytes: UByteArray = UByteArray(16),
    public var accessInfo: WhvX64IoPortAccessInfo = WhvX64IoPortAccessInfo(),
    public var portNumber: UShort = 0u,
    public var reserved2: UShortArray = UShortArray(3),
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var ds: WhvX64SegmentRegister = WhvX64SegmentRegister(),
    public var es: WhvX64SegmentRegister = WhvX64SegmentRegister(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvX64IoPortAccessContext) return false
        if (this.instructionByteCount != other.instructionByteCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.instructionBytes.contentEquals(other.instructionBytes)) return false
        if (this.accessInfo != other.accessInfo) return false
        if (this.portNumber != other.portNumber) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.rax != other.rax) return false
        if (this.rcx != other.rcx) return false
        if (this.rsi != other.rsi) return false
        if (this.rdi != other.rdi) return false
        if (this.ds != other.ds) return false
        if (this.es != other.es) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionByteCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.instructionBytes.contentHashCode()
        result = 31 * result + this.accessInfo.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.rax.hashCode()
        result = 31 * result + this.rcx.hashCode()
        result = 31 * result + this.rsi.hashCode()
        result = 31 * result + this.rdi.hashCode()
        result = 31 * result + this.ds.hashCode()
        result = 31 * result + this.es.hashCode()
        return result
    }
}

public data class WhvX64IoPortAccessInfo(public var anonymous: WhvX64IoPortAccessInfo0 = WhvX64IoPortAccessInfo0(), public var asUINT32: UInt = 0u)

public data class WhvX64IoPortAccessInfo0(public var bitfield: UInt = 0u)

public data class WhvX64MsrAccessContext(
    public var accessInfo: WhvX64MsrAccessInfo = WhvX64MsrAccessInfo(),
    public var msrNumber: UInt = 0u,
    public var rax: ULong = 0uL,
    public var rdx: ULong = 0uL,
)

public data class WhvX64MsrAccessInfo(public var anonymous: WhvX64MsrAccessInfo0 = WhvX64MsrAccessInfo0(), public var asUINT32: UInt = 0u)

public data class WhvX64MsrAccessInfo0(public var bitfield: UInt = 0u)

public data class WhvX64MsrExitBitmap(public var asUINT64: ULong = 0uL, public var anonymous: WhvX64MsrExitBitmap0 = WhvX64MsrExitBitmap0())

public data class WhvX64MsrExitBitmap0(public var bitfield: ULong = 0uL)

public data class WhvX64PendingDebugException(public var asUINT64: ULong = 0uL, public var anonymous: WhvX64PendingDebugException0 = WhvX64PendingDebugException0())

public data class WhvX64PendingDebugException0(public var bitfield: ULong = 0uL)

public data class WhvX64PendingExceptionEvent(public var anonymous: WhvX64PendingExceptionEvent0 = WhvX64PendingExceptionEvent0(), public var asUINT128: WhvUint128 = WhvUint128())

public data class WhvX64PendingExceptionEvent0(
    public var bitfield: UInt = 0u,
    public var errorCode: UInt = 0u,
    public var exceptionParameter: ULong = 0uL,
)

public data class WhvX64PendingExtIntEvent(public var anonymous: WhvX64PendingExtIntEvent0 = WhvX64PendingExtIntEvent0(), public var asUINT128: WhvUint128 = WhvUint128())

public data class WhvX64PendingExtIntEvent0(public var bitfield: ULong = 0uL, public var reserved2: ULong = 0uL)

public data class WhvX64PendingInterruptionRegister(public var anonymous: WhvX64PendingInterruptionRegister0 = WhvX64PendingInterruptionRegister0(), public var asUINT64: ULong = 0uL)

public data class WhvX64PendingInterruptionRegister0(public var bitfield: UInt = 0u, public var errorCode: UInt = 0u)

public data class WhvX64RdtscContext(
    public var tscAux: ULong = 0uL,
    public var virtualOffset: ULong = 0uL,
    public var tsc: ULong = 0uL,
    public var referenceTime: ULong = 0uL,
    public var rdtscInfo: WhvX64RdtscInfo = WhvX64RdtscInfo(),
)

public data class WhvX64RdtscInfo(public var anonymous: WhvX64RdtscInfo0 = WhvX64RdtscInfo0(), public var asUINT64: ULong = 0uL)

public data class WhvX64RdtscInfo0(public var bitfield: ULong = 0uL)

public data class WhvX64SegmentRegister(
    public var base: ULong = 0uL,
    public var limit: UInt = 0u,
    public var selector: UShort = 0u,
    public var anonymous: WhvX64SegmentRegister0 = WhvX64SegmentRegister0(),
)

public data class WhvX64SegmentRegister0(public var anonymous: WhvX64SegmentRegister00 = WhvX64SegmentRegister00(), public var attributes: UShort = 0u)

public data class WhvX64SegmentRegister00(public var bitfield: UShort = 0u)

public data class WhvX64TableRegister(
    public var pad: UShortArray = UShortArray(3),
    public var limit: UShort = 0u,
    public var base: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WhvX64TableRegister) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.limit != other.limit) return false
        if (this.base != other.base) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pad.contentHashCode()
        result = 31 * result + this.limit.hashCode()
        result = 31 * result + this.base.hashCode()
        return result
    }
}

public data class WhvX64UnsupportedFeatureContext(
    public var featureCode: WhvX64UnsupportedFeatureCode = 0,
    public var reserved: UInt = 0u,
    public var featureParameter: ULong = 0uL,
)

public data class WhvX64VpExecutionState(public var anonymous: WhvX64VpExecutionState0 = WhvX64VpExecutionState0(), public var asUINT16: UShort = 0u)

public data class WhvX64VpExecutionState0(public var bitfield: UShort = 0u)

public data class WhvX64XmmControlStatusRegister(public var anonymous: WhvX64XmmControlStatusRegister0 = WhvX64XmmControlStatusRegister0(), public var asUINT128: WhvUint128 = WhvUint128())

public data class WhvX64XmmControlStatusRegister0(
    public var anonymous: WhvX64XmmControlStatusRegister00 = WhvX64XmmControlStatusRegister00(),
    public var xmmStatusControl: UInt = 0u,
    public var xmmStatusControlMask: UInt = 0u,
)

public data class WhvX64XmmControlStatusRegister00(public var lastFpRdp: ULong = 0uL, public var anonymous: WhvX64XmmControlStatusRegister000 = WhvX64XmmControlStatusRegister000())

public data class WhvX64XmmControlStatusRegister000(
    public var lastFpDp: UInt = 0u,
    public var lastFpDs: UShort = 0u,
    public var reserved: UShort = 0u,
)
