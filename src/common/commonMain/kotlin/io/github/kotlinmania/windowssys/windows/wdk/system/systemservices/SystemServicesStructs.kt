@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KdeviceQueue
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PcallbackObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.LuidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Arm64NtNeon128
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerCapabilities
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.SystemPowerState

public data class AcpiDebuggingDeviceInUse(public var nameSpacePathLength: UInt = 0u, public var nameSpacePath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcpiDebuggingDeviceInUse) return false
        if (this.nameSpacePathLength != other.nameSpacePathLength) return false
        if (!this.nameSpacePath.contentEquals(other.nameSpacePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameSpacePathLength.hashCode()
        result = 31 * result + this.nameSpacePath.contentHashCode()
        return result
    }
}

public data class AcpiInterfaceStandard(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var gpeConnectVector: PgpeConnectVector = null,
    public var gpeDisconnectVector: PgpeDisconnectVector = null,
    public var gpeEnableEvent: PgpeEnableEvent = null,
    public var gpeDisableEvent: PgpeDisableEvent = null,
    public var gpeClearStatus: PgpeClearStatus = null,
    public var registerForDeviceNotifications: PregisterForDeviceNotifications = null,
    public var unregisterForDeviceNotifications: PunregisterForDeviceNotifications = null,
)

public data class AcpiInterfaceStandard2(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var gpeConnectVector: PgpeConnectVector2 = null,
    public var gpeDisconnectVector: PgpeDisconnectVector2 = null,
    public var gpeEnableEvent: PgpeEnableEvent2 = null,
    public var gpeDisableEvent: PgpeDisableEvent2 = null,
    public var gpeClearStatus: PgpeClearStatus2 = null,
    public var registerForDeviceNotifications: PregisterForDeviceNotifications2 = null,
    public var unregisterForDeviceNotifications: PunregisterForDeviceNotifications2 = null,
)

public data class AgpTargetBusInterfaceStandard(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setBusData: PgetSetDeviceData = null,
    public var getBusData: PgetSetDeviceData = null,
    public var capabilityID: UByte = 0u,
)

public data class AmdL1CacheInfo(public var ulong: UInt = 0u, public var anonymous: AmdL1CacheInfo0 = AmdL1CacheInfo0())

public data class AmdL1CacheInfo0(
    public var lineSize: UByte = 0u,
    public var linesPerTag: UByte = 0u,
    public var associativity: UByte = 0u,
    public var size: UByte = 0u,
)

public data class AmdL2CacheInfo(public var ulong: UInt = 0u, public var anonymous: AmdL2CacheInfo0 = AmdL2CacheInfo0())

public data class AmdL2CacheInfo0(
    public var lineSize: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var size: UShort = 0u,
)

public data class AmdL3CacheInfo(public var ulong: UInt = 0u, public var anonymous: AmdL3CacheInfo0 = AmdL3CacheInfo0())

public data class AmdL3CacheInfo0(
    public var lineSize: UByte = 0u,
    public var bitfield1: UByte = 0u,
    public var bitfield2: UShort = 0u,
)

public data class ArbiterAddReservedParameters(public var reserveDevice: DeviceObject? = null)

public data class ArbiterBootAllocationParameters(public var arbitrationList: ListEntry? = null)

public data class ArbiterConflictInfo(
    public var owningObject: DeviceObject? = null,
    public var start: ULong = 0uL,
    public var end: ULong = 0uL,
)

public data class ArbiterInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var arbiterHandler: ParbiterHandler = null,
    public var flags: UInt = 0u,
)

public data class ArbiterListEntry(
    public var listEntry: ListEntry = ListEntry(),
    public var alternativeCount: UInt = 0u,
    public var alternatives: IoResourceDescriptor? = null,
    public var physicalDeviceObject: DeviceObject? = null,
    public var requestSource: ArbiterRequestSource = 0,
    public var flags: UInt = 0u,
    public var workSpace: Int = 0,
    public var interfaceType: InterfaceType = 0,
    public var slotNumber: UInt = 0u,
    public var busNumber: UInt = 0u,
    public var assignment: CmPartialResourceDescriptor? = null,
    public var selectedAlternative: IoResourceDescriptor? = null,
    public var result: ArbiterResult = 0,
)

public data class ArbiterParameters(public var parameters: ArbiterParameters0 = ArbiterParameters0())

public data class ArbiterParameters0(
    public var testAllocation: ArbiterTestAllocationParameters = ArbiterTestAllocationParameters(),
    public var retestAllocation: ArbiterRetestAllocationParameters = ArbiterRetestAllocationParameters(),
    public var bootAllocation: ArbiterBootAllocationParameters = ArbiterBootAllocationParameters(),
    public var queryAllocatedResources: ArbiterQueryAllocatedResourcesParameters = ArbiterQueryAllocatedResourcesParameters(),
    public var queryConflict: ArbiterQueryConflictParameters = ArbiterQueryConflictParameters(),
    public var queryArbitrate: ArbiterQueryArbitrateParameters = ArbiterQueryArbitrateParameters(),
    public var addReserved: ArbiterAddReservedParameters = ArbiterAddReservedParameters(),
)

public data class ArbiterQueryAllocatedResourcesParameters(public var allocatedResources: COpaquePointer? = null)

public data class ArbiterQueryArbitrateParameters(public var arbitrationList: ListEntry? = null)

public data class ArbiterQueryConflictParameters(
    public var physicalDeviceObject: DeviceObject? = null,
    public var conflictingResource: IoResourceDescriptor? = null,
    public var conflictCount: UInt? = null,
    public var conflicts: COpaquePointer? = null,
)

public data class ArbiterRetestAllocationParameters(
    public var arbitrationList: ListEntry? = null,
    public var allocateFromCount: UInt = 0u,
    public var allocateFrom: CmPartialResourceDescriptor? = null,
)

public data class ArbiterTestAllocationParameters(
    public var arbitrationList: ListEntry? = null,
    public var allocateFromCount: UInt = 0u,
    public var allocateFrom: CmPartialResourceDescriptor? = null,
)

public data class Arm64NtContext(
    public var contextFlags: UInt = 0u,
    public var cpsr: UInt = 0u,
    public var anonymous: Arm64NtContext0 = Arm64NtContext0(),
    public var sp: ULong = 0uL,
    public var pc: ULong = 0uL,
    public var v: List<Arm64NtNeon128> = List(32) { Arm64NtNeon128() },
    public var fpcr: UInt = 0u,
    public var fpsr: UInt = 0u,
    public var bcr: UIntArray = UIntArray(8),
    public var bvr: ULongArray = ULongArray(8),
    public var wcr: UIntArray = UIntArray(2),
    public var wvr: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext) return false
        if (this.contextFlags != other.contextFlags) return false
        if (this.cpsr != other.cpsr) return false
        if (this.anonymous != other.anonymous) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.v != other.v) return false
        if (this.fpcr != other.fpcr) return false
        if (this.fpsr != other.fpsr) return false
        if (!this.bcr.contentEquals(other.bcr)) return false
        if (!this.bvr.contentEquals(other.bvr)) return false
        if (!this.wcr.contentEquals(other.wcr)) return false
        if (!this.wvr.contentEquals(other.wvr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contextFlags.hashCode()
        result = 31 * result + this.cpsr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.v.hashCode()
        result = 31 * result + this.fpcr.hashCode()
        result = 31 * result + this.fpsr.hashCode()
        result = 31 * result + this.bcr.contentHashCode()
        result = 31 * result + this.bvr.contentHashCode()
        result = 31 * result + this.wcr.contentHashCode()
        result = 31 * result + this.wvr.contentHashCode()
        return result
    }
}

public data class Arm64NtContext0(public var anonymous: Arm64NtContext00 = Arm64NtContext00(), public var x: ULongArray = ULongArray(31)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.x.contentEquals(other.x)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.x.contentHashCode()
        return result
    }
}

public class Arm64NtContext00(
    public var x0: ULong = 0uL,
    public var x1: ULong = 0uL,
    public var x2: ULong = 0uL,
    public var x3: ULong = 0uL,
    public var x4: ULong = 0uL,
    public var x5: ULong = 0uL,
    public var x6: ULong = 0uL,
    public var x7: ULong = 0uL,
    public var x8: ULong = 0uL,
    public var x9: ULong = 0uL,
    public var x10: ULong = 0uL,
    public var x11: ULong = 0uL,
    public var x12: ULong = 0uL,
    public var x13: ULong = 0uL,
    public var x14: ULong = 0uL,
    public var x15: ULong = 0uL,
    public var x16: ULong = 0uL,
    public var x17: ULong = 0uL,
    public var x18: ULong = 0uL,
    public var x19: ULong = 0uL,
    public var x20: ULong = 0uL,
    public var x21: ULong = 0uL,
    public var x22: ULong = 0uL,
    public var x23: ULong = 0uL,
    public var x24: ULong = 0uL,
    public var x25: ULong = 0uL,
    public var x26: ULong = 0uL,
    public var x27: ULong = 0uL,
    public var x28: ULong = 0uL,
    public var fp: ULong = 0uL,
    public var lr: ULong = 0uL,
)

public data class BdcbImageInformation(
    public var classification: BdcbClassification = 0,
    public var imageFlags: UInt = 0u,
    public var imageName: UnicodeString = UnicodeString(),
    public var registryPath: UnicodeString = UnicodeString(),
    public var certificatePublisher: UnicodeString = UnicodeString(),
    public var certificateIssuer: UnicodeString = UnicodeString(),
    public var imageHash: COpaquePointer? = null,
    public var certificateThumbprint: COpaquePointer? = null,
    public var imageHashAlgorithm: UInt = 0u,
    public var thumbprintHashAlgorithm: UInt = 0u,
    public var imageHashLength: UInt = 0u,
    public var certificateThumbprintLength: UInt = 0u,
)

public data class BdcbStatusUpdateContext(public var statusType: BdcbStatusUpdateType = 0)

public data class BootdiskInformation(
    public var bootPartitionOffset: Long = 0L,
    public var systemPartitionOffset: Long = 0L,
    public var bootDeviceSignature: UInt = 0u,
    public var systemDeviceSignature: UInt = 0u,
)

public data class BootdiskInformationEx(
    public var bootPartitionOffset: Long = 0L,
    public var systemPartitionOffset: Long = 0L,
    public var bootDeviceSignature: UInt = 0u,
    public var systemDeviceSignature: UInt = 0u,
    public var bootDeviceGuid: Guid = Guid(),
    public var systemDeviceGuid: Guid = Guid(),
    public var bootDeviceIsGpt: Boolean = false,
    public var systemDeviceIsGpt: Boolean = false,
)

public data class BootdiskInformationLite(public var numberEntries: UInt = 0u, public var entries: List<LoaderPartitionInformationEx> = List(1) { LoaderPartitionInformationEx() })

public data class BusInterfaceStandard(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var translateBusAddress: PtranslateBusAddress = null,
    public var getDmaAdapter: PgetDmaAdapter = null,
    public var setBusData: PgetSetDeviceData = null,
    public var getBusData: PgetSetDeviceData = null,
)

public data class BusResourceUpdateInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var getUpdatedBusResource: PgetUpdatedBusResource = null,
)

public data class BusSpecificResetFlags(public var u: BusSpecificResetFlags0 = BusSpecificResetFlags0(), public var asUlonglong: ULong = 0uL)

public data class BusSpecificResetFlags0(public var bitfield: ULong = 0uL)

public data class ClfsMgmtClientRegistration(
    public var version: UInt = 0u,
    public var advanceTailCallback: PclfsClientAdvanceTailCallback = null,
    public var advanceTailCallbackData: COpaquePointer? = null,
    public var logGrowthCompleteCallback: PclfsClientLffHandlerCompleteCallback = null,
    public var logGrowthCompleteCallbackData: COpaquePointer? = null,
    public var logUnpinnedCallback: PclfsClientLogUnpinnedCallback = null,
    public var logUnpinnedCallbackData: COpaquePointer? = null,
)

public data class CmcDriverInfo(
    public var exceptionCallback: PdriverCmcExceptionCallback = null,
    public var dpcCallback: PkdeferredRoutine = null,
    public var deviceContext: COpaquePointer? = null,
)

public data class CmComponentInformation(
    public var flags: DeviceFlags = DeviceFlags(),
    public var version: UInt = 0u,
    public var key: UInt = 0u,
    public var affinityMask: Int = 0,
)

public data class CmDiskGeometryDeviceData(
    public var bytesPerSector: UInt = 0u,
    public var numberOfCylinders: UInt = 0u,
    public var sectorsPerTrack: UInt = 0u,
    public var numberOfHeads: UInt = 0u,
)

public data class CmEisaFunctionInformation(
    public var compressedId: UInt = 0u,
    public var idSlotFlags1: UByte = 0u,
    public var idSlotFlags2: UByte = 0u,
    public var minorRevision: UByte = 0u,
    public var majorRevision: UByte = 0u,
    public var selections: UByteArray = UByteArray(26),
    public var functionFlags: UByte = 0u,
    public var typeString: UByteArray = UByteArray(80),
    public var eisaMemory: List<EisaMemoryConfiguration> = List(9) { EisaMemoryConfiguration() },
    public var eisaIrq: List<EisaIrqConfiguration> = List(7) { EisaIrqConfiguration() },
    public var eisaDma: List<EisaDmaConfiguration> = List(4) { EisaDmaConfiguration() },
    public var eisaPort: List<EisaPortConfiguration> = List(20) { EisaPortConfiguration() },
    public var initializationData: UByteArray = UByteArray(60),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmEisaFunctionInformation) return false
        if (this.compressedId != other.compressedId) return false
        if (this.idSlotFlags1 != other.idSlotFlags1) return false
        if (this.idSlotFlags2 != other.idSlotFlags2) return false
        if (this.minorRevision != other.minorRevision) return false
        if (this.majorRevision != other.majorRevision) return false
        if (!this.selections.contentEquals(other.selections)) return false
        if (this.functionFlags != other.functionFlags) return false
        if (!this.typeString.contentEquals(other.typeString)) return false
        if (this.eisaMemory != other.eisaMemory) return false
        if (this.eisaIrq != other.eisaIrq) return false
        if (this.eisaDma != other.eisaDma) return false
        if (this.eisaPort != other.eisaPort) return false
        if (!this.initializationData.contentEquals(other.initializationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressedId.hashCode()
        result = 31 * result + this.idSlotFlags1.hashCode()
        result = 31 * result + this.idSlotFlags2.hashCode()
        result = 31 * result + this.minorRevision.hashCode()
        result = 31 * result + this.majorRevision.hashCode()
        result = 31 * result + this.selections.contentHashCode()
        result = 31 * result + this.functionFlags.hashCode()
        result = 31 * result + this.typeString.contentHashCode()
        result = 31 * result + this.eisaMemory.hashCode()
        result = 31 * result + this.eisaIrq.hashCode()
        result = 31 * result + this.eisaDma.hashCode()
        result = 31 * result + this.eisaPort.hashCode()
        result = 31 * result + this.initializationData.contentHashCode()
        return result
    }
}

public data class CmEisaSlotInformation(
    public var returnCode: UByte = 0u,
    public var returnFlags: UByte = 0u,
    public var majorRevision: UByte = 0u,
    public var minorRevision: UByte = 0u,
    public var checksum: UShort = 0u,
    public var numberFunctions: UByte = 0u,
    public var functionInformation: UByte = 0u,
    public var compressedId: UInt = 0u,
)

public class CmFloppyDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var size: ByteArray = ByteArray(8),
    public var maxDensity: UInt = 0u,
    public var mountDensity: UInt = 0u,
    public var stepRateHeadUnloadTime: UByte = 0u,
    public var headLoadTime: UByte = 0u,
    public var motorOffTime: UByte = 0u,
    public var sectorLengthCode: UByte = 0u,
    public var sectorPerTrack: UByte = 0u,
    public var readWriteGapLength: UByte = 0u,
    public var dataTransferLength: UByte = 0u,
    public var formatGapLength: UByte = 0u,
    public var formatFillCharacter: UByte = 0u,
    public var headSettleTime: UByte = 0u,
    public var motorSettleTime: UByte = 0u,
    public var maximumTrackValue: UByte = 0u,
    public var dataTransferRate: UByte = 0u,
)

public data class CmFullResourceDescriptor(
    public var interfaceType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
    public var partialResourceList: CmPartialResourceList = CmPartialResourceList(),
)

public data class CmInt13DriveParameter(
    public var driveSelect: UShort = 0u,
    public var maxCylinders: UInt = 0u,
    public var sectorsPerTrack: UShort = 0u,
    public var maxHeads: UShort = 0u,
    public var numberDrives: UShort = 0u,
)

public data class CmKeyboardDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var type: UByte = 0u,
    public var subtype: UByte = 0u,
    public var keyboardFlags: UShort = 0u,
)

public data class CmMcaPosData(
    public var adapterId: UShort = 0u,
    public var posData1: UByte = 0u,
    public var posData2: UByte = 0u,
    public var posData3: UByte = 0u,
    public var posData4: UByte = 0u,
)

public class CmMonitorDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var horizontalScreenSize: UShort = 0u,
    public var verticalScreenSize: UShort = 0u,
    public var horizontalResolution: UShort = 0u,
    public var verticalResolution: UShort = 0u,
    public var horizontalDisplayTimeLow: UShort = 0u,
    public var horizontalDisplayTime: UShort = 0u,
    public var horizontalDisplayTimeHigh: UShort = 0u,
    public var horizontalBackPorchLow: UShort = 0u,
    public var horizontalBackPorch: UShort = 0u,
    public var horizontalBackPorchHigh: UShort = 0u,
    public var horizontalFrontPorchLow: UShort = 0u,
    public var horizontalFrontPorch: UShort = 0u,
    public var horizontalFrontPorchHigh: UShort = 0u,
    public var horizontalSyncLow: UShort = 0u,
    public var horizontalSync: UShort = 0u,
    public var horizontalSyncHigh: UShort = 0u,
    public var verticalBackPorchLow: UShort = 0u,
    public var verticalBackPorch: UShort = 0u,
    public var verticalBackPorchHigh: UShort = 0u,
    public var verticalFrontPorchLow: UShort = 0u,
    public var verticalFrontPorch: UShort = 0u,
    public var verticalFrontPorchHigh: UShort = 0u,
    public var verticalSyncLow: UShort = 0u,
    public var verticalSync: UShort = 0u,
    public var verticalSyncHigh: UShort = 0u,
)

public data class CmPartialResourceDescriptor(
    public var type: UByte = 0u,
    public var shareDisposition: UByte = 0u,
    public var flags: UShort = 0u,
    public var u: CmPartialResourceDescriptor0 = CmPartialResourceDescriptor0(),
)

public data class CmPartialResourceDescriptor0(
    public var generic: CmPartialResourceDescriptor00 = CmPartialResourceDescriptor00(),
    public var port: CmPartialResourceDescriptor01 = CmPartialResourceDescriptor01(),
    public var interrupt: CmPartialResourceDescriptor02 = CmPartialResourceDescriptor02(),
    public var messageInterrupt: CmPartialResourceDescriptor03 = CmPartialResourceDescriptor03(),
    public var memory: CmPartialResourceDescriptor04 = CmPartialResourceDescriptor04(),
    public var dma: CmPartialResourceDescriptor05 = CmPartialResourceDescriptor05(),
    public var dmaV3: CmPartialResourceDescriptor06 = CmPartialResourceDescriptor06(),
    public var devicePrivate: CmPartialResourceDescriptor07 = CmPartialResourceDescriptor07(),
    public var busNumber: CmPartialResourceDescriptor08 = CmPartialResourceDescriptor08(),
    public var deviceSpecificData: CmPartialResourceDescriptor09 = CmPartialResourceDescriptor09(),
    public var memory40: CmPartialResourceDescriptor010 = CmPartialResourceDescriptor010(),
    public var memory48: CmPartialResourceDescriptor011 = CmPartialResourceDescriptor011(),
    public var memory64: CmPartialResourceDescriptor012 = CmPartialResourceDescriptor012(),
    public var connection: CmPartialResourceDescriptor013 = CmPartialResourceDescriptor013(),
)

public data class CmPartialResourceDescriptor08(
    public var start: UInt = 0u,
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class CmPartialResourceDescriptor013(
    public var cls: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var idLowPart: UInt = 0u,
    public var idHighPart: UInt = 0u,
)

public data class CmPartialResourceDescriptor07(public var data: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPartialResourceDescriptor07) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

public data class CmPartialResourceDescriptor09(
    public var dataSize: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
)

public data class CmPartialResourceDescriptor06(
    public var channel: UInt = 0u,
    public var requestLine: UInt = 0u,
    public var transferWidth: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var reserved3: UByte = 0u,
)

public data class CmPartialResourceDescriptor05(
    public var channel: UInt = 0u,
    public var port: UInt = 0u,
    public var reserved1: UInt = 0u,
)

public data class CmPartialResourceDescriptor00(public var start: Long = 0L, public var length: UInt = 0u)

public data class CmPartialResourceDescriptor02(
    public var level: UInt = 0u,
    public var vector: UInt = 0u,
    public var affinity: Int = 0,
)

public data class CmPartialResourceDescriptor010(public var start: Long = 0L, public var length40: UInt = 0u)

public data class CmPartialResourceDescriptor011(public var start: Long = 0L, public var length48: UInt = 0u)

public data class CmPartialResourceDescriptor012(public var start: Long = 0L, public var length64: UInt = 0u)

public data class CmPartialResourceDescriptor04(public var start: Long = 0L, public var length: UInt = 0u)

public data class CmPartialResourceDescriptor03(public var anonymous: CmPartialResourceDescriptor030 = CmPartialResourceDescriptor030())

public data class CmPartialResourceDescriptor030(public var raw: CmPartialResourceDescriptor0300 = CmPartialResourceDescriptor0300(), public var translated: CmPartialResourceDescriptor0301 = CmPartialResourceDescriptor0301())

public data class CmPartialResourceDescriptor0300(
    public var reserved: UShort = 0u,
    public var messageCount: UShort = 0u,
    public var vector: UInt = 0u,
    public var affinity: Int = 0,
)

public data class CmPartialResourceDescriptor0301(
    public var level: UInt = 0u,
    public var vector: UInt = 0u,
    public var affinity: Int = 0,
)

public data class CmPartialResourceDescriptor01(public var start: Long = 0L, public var length: UInt = 0u)

public data class CmPartialResourceList(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var count: UInt = 0u,
    public var partialDescriptors: List<CmPartialResourceDescriptor> = List(1) { CmPartialResourceDescriptor() },
)

public data class CmPccardDeviceData(
    public var flags: UByte = 0u,
    public var errorCode: UByte = 0u,
    public var reserved: UShort = 0u,
    public var busData: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var legacyBaseAddress: UInt = 0u,
    public var iRQMap: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPccardDeviceData) return false
        if (this.flags != other.flags) return false
        if (this.errorCode != other.errorCode) return false
        if (this.reserved != other.reserved) return false
        if (this.busData != other.busData) return false
        if (this.deviceId != other.deviceId) return false
        if (this.legacyBaseAddress != other.legacyBaseAddress) return false
        if (!this.iRQMap.contentEquals(other.iRQMap)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.busData.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.legacyBaseAddress.hashCode()
        result = 31 * result + this.iRQMap.contentHashCode()
        return result
    }
}

public data class CmPnpBiosDeviceNode(
    public var size: UShort = 0u,
    public var node: UByte = 0u,
    public var productId: UInt = 0u,
    public var deviceType: UByteArray = UByteArray(3),
    public var deviceAttributes: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPnpBiosDeviceNode) return false
        if (this.size != other.size) return false
        if (this.node != other.node) return false
        if (this.productId != other.productId) return false
        if (!this.deviceType.contentEquals(other.deviceType)) return false
        if (this.deviceAttributes != other.deviceAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.node.hashCode()
        result = 31 * result + this.productId.hashCode()
        result = 31 * result + this.deviceType.contentHashCode()
        result = 31 * result + this.deviceAttributes.hashCode()
        return result
    }
}

public data class CmPnpBiosInstallationCheck(
    public var signature: UByteArray = UByteArray(4),
    public var revision: UByte = 0u,
    public var length: UByte = 0u,
    public var controlField: UShort = 0u,
    public var checksum: UByte = 0u,
    public var eventFlagAddress: UInt = 0u,
    public var realModeEntryOffset: UShort = 0u,
    public var realModeEntrySegment: UShort = 0u,
    public var protectedModeEntryOffset: UShort = 0u,
    public var protectedModeCodeBaseAddress: UInt = 0u,
    public var oemDeviceId: UInt = 0u,
    public var realModeDataBaseAddress: UShort = 0u,
    public var protectedModeDataBaseAddress: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPnpBiosInstallationCheck) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.revision != other.revision) return false
        if (this.length != other.length) return false
        if (this.controlField != other.controlField) return false
        if (this.checksum != other.checksum) return false
        if (this.eventFlagAddress != other.eventFlagAddress) return false
        if (this.realModeEntryOffset != other.realModeEntryOffset) return false
        if (this.realModeEntrySegment != other.realModeEntrySegment) return false
        if (this.protectedModeEntryOffset != other.protectedModeEntryOffset) return false
        if (this.protectedModeCodeBaseAddress != other.protectedModeCodeBaseAddress) return false
        if (this.oemDeviceId != other.oemDeviceId) return false
        if (this.realModeDataBaseAddress != other.realModeDataBaseAddress) return false
        if (this.protectedModeDataBaseAddress != other.protectedModeDataBaseAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.contentHashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.controlField.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.eventFlagAddress.hashCode()
        result = 31 * result + this.realModeEntryOffset.hashCode()
        result = 31 * result + this.realModeEntrySegment.hashCode()
        result = 31 * result + this.protectedModeEntryOffset.hashCode()
        result = 31 * result + this.protectedModeCodeBaseAddress.hashCode()
        result = 31 * result + this.oemDeviceId.hashCode()
        result = 31 * result + this.realModeDataBaseAddress.hashCode()
        result = 31 * result + this.protectedModeDataBaseAddress.hashCode()
        return result
    }
}

public data class CmPowerData(
    public var pdSize: UInt = 0u,
    public var pdMostRecentPowerState: DevicePowerState = 0,
    public var pdCapabilities: DevicePowerCapabilities = 0u,
    public var pdD1Latency: UInt = 0u,
    public var pdD2Latency: UInt = 0u,
    public var pdD3Latency: UInt = 0u,
    public var pdPowerStateMapping: IntArray = IntArray(7),
    public var pdDeepestSystemWake: SystemPowerState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPowerData) return false
        if (this.pdSize != other.pdSize) return false
        if (this.pdMostRecentPowerState != other.pdMostRecentPowerState) return false
        if (this.pdCapabilities != other.pdCapabilities) return false
        if (this.pdD1Latency != other.pdD1Latency) return false
        if (this.pdD2Latency != other.pdD2Latency) return false
        if (this.pdD3Latency != other.pdD3Latency) return false
        if (!this.pdPowerStateMapping.contentEquals(other.pdPowerStateMapping)) return false
        if (this.pdDeepestSystemWake != other.pdDeepestSystemWake) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdSize.hashCode()
        result = 31 * result + this.pdMostRecentPowerState.hashCode()
        result = 31 * result + this.pdCapabilities.hashCode()
        result = 31 * result + this.pdD1Latency.hashCode()
        result = 31 * result + this.pdD2Latency.hashCode()
        result = 31 * result + this.pdD3Latency.hashCode()
        result = 31 * result + this.pdPowerStateMapping.contentHashCode()
        result = 31 * result + this.pdDeepestSystemWake.hashCode()
        return result
    }
}

public data class CmResourceList(public var count: UInt = 0u, public var list: List<CmFullResourceDescriptor> = List(1) { CmFullResourceDescriptor() })

public data class CmRomBlock(public var address: UInt = 0u, public var size: UInt = 0u)

public data class CmScsiDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var hostIdentifier: UByte = 0u,
)

public data class CmSerialDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var baudClock: UInt = 0u,
)

public data class CmSonicDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var dataConfigurationRegister: UShort = 0u,
    public var ethernetAddress: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmSonicDeviceData) return false
        if (this.version != other.version) return false
        if (this.revision != other.revision) return false
        if (this.dataConfigurationRegister != other.dataConfigurationRegister) return false
        if (!this.ethernetAddress.contentEquals(other.ethernetAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.dataConfigurationRegister.hashCode()
        result = 31 * result + this.ethernetAddress.contentHashCode()
        return result
    }
}

public data class CmVideoDeviceData(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var videoClock: UInt = 0u,
)

public data class ConfigurationInformation(
    public var diskCount: UInt = 0u,
    public var floppyCount: UInt = 0u,
    public var cdRomCount: UInt = 0u,
    public var tapeCount: UInt = 0u,
    public var scsiPortCount: UInt = 0u,
    public var serialCount: UInt = 0u,
    public var parallelCount: UInt = 0u,
    public var atDiskPrimaryAddressClaimed: Boolean = false,
    public var atDiskSecondaryAddressClaimed: Boolean = false,
    public var version: UInt = 0u,
    public var mediumChangerCount: UInt = 0u,
)

public data class ControllerObject(
    public var type: Short = 0,
    public var size: Short = 0,
    public var controllerExtension: COpaquePointer? = null,
    public var deviceWaitQueue: KdeviceQueue = KdeviceQueue(),
    public var spare1: UInt = 0u,
    public var spare2: Long = 0L,
)

public data class CountedReasonContext(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var anonymous: CountedReasonContext0 = CountedReasonContext0(),
)

public data class CountedReasonContext0(public var anonymous: CountedReasonContext00 = CountedReasonContext00(), public var simpleString: UnicodeString = UnicodeString())

public data class CountedReasonContext00(
    public var resourceFileName: UnicodeString = UnicodeString(),
    public var resourceReasonId: UShort = 0u,
    public var stringCount: UInt = 0u,
    public var reasonStrings: UnicodeString? = null,
)

public data class CpeDriverInfo(
    public var exceptionCallback: PdriverCpeExceptionCallback = null,
    public var dpcCallback: PkdeferredRoutine = null,
    public var deviceContext: COpaquePointer? = null,
)

public data class CrashdumpFunctionsInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var powerOn: PcrashdumpPowerOn = null,
)

public data class CreateUserProcessEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var accessToken: COpaquePointer? = null,
)

public data class D3coldAuxPowerAndTimingInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var requestCorePowerRail: Pd3coldRequestCorePowerRail = null,
    public var requestAuxPower: Pd3coldRequestAuxPower = null,
    public var requestPerstDelay: Pd3coldRequestPerstDelay = null,
)

public data class D3coldSupportInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setD3ColdSupport: PsetD3coldSupport = null,
    public var getIdleWakeInfo: PgetIdleWakeInfo = null,
    public var getD3ColdCapability: PgetD3coldCapability = null,
    public var getBusDriverD3ColdSupport: PgetD3coldCapability = null,
    public var getLastTransitionStatus: PgetD3coldLastTransitionStatus = null,
)

public data class DebuggingDeviceInUse(
    public var nameSpace: KdNamespaceEnum = 0,
    public var structureLength: UInt = 0u,
    public var anonymous: DebuggingDeviceInUse0 = DebuggingDeviceInUse0(),
)

public data class DebuggingDeviceInUse0(public var acpiDevice: AcpiDebuggingDeviceInUse = AcpiDebuggingDeviceInUse(), public var pciDevice: PciDebuggingDeviceInUse = PciDebuggingDeviceInUse())

public data class DebuggingDeviceInUseInformation(public var deviceCount: UInt = 0u, public var device: List<DebuggingDeviceInUse> = List(1) { DebuggingDeviceInUse() })

public data class DebugDeviceAddress(
    public var type: UByte = 0u,
    public var valid: Boolean = false,
    public var anonymous: DebugDeviceAddress0 = DebugDeviceAddress0(),
    public var translatedAddress: COpaquePointer? = null,
    public var length: UInt = 0u,
)

public data class DebugDeviceAddress0(public var reserved: UByteArray = UByteArray(2), public var anonymous: DebugDeviceAddress00 = DebugDeviceAddress00()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugDeviceAddress0) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DebugDeviceAddress00(public var bitWidth: UByte = 0u, public var accessSize: UByte = 0u)

public class DebugDeviceDescriptor(
    public var bus: UInt = 0u,
    public var slot: UInt = 0u,
    public var segment: UShort = 0u,
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var baseClass: UByte = 0u,
    public var subClass: UByte = 0u,
    public var progIf: UByte = 0u,
    public var anonymous: DebugDeviceDescriptor0 = DebugDeviceDescriptor0(),
    public var initialized: Boolean = false,
    public var configured: Boolean = false,
    public var baseAddress: List<DebugDeviceAddress> = List(6) { DebugDeviceAddress() },
    public var memory: DebugMemoryRequirements = DebugMemoryRequirements(),
    public var dbg2TableIndex: UInt = 0u,
    public var portType: UShort = 0u,
    public var portSubtype: UShort = 0u,
    public var oemData: COpaquePointer? = null,
    public var oemDataLength: UInt = 0u,
    public var nameSpace: KdNamespaceEnum = 0,
    public var nameSpacePath: Pwstr = null,
    public var nameSpacePathLength: UInt = 0u,
    public var transportType: UInt = 0u,
    public var transportData: DebugTransportData = DebugTransportData(),
    public var efiIoMmuData: DebugEfiIommuData = DebugEfiIommuData(),
)

public data class DebugDeviceDescriptor0(public var flags: UByte = 0u, public var anonymous: DebugDeviceDescriptor00 = DebugDeviceDescriptor00())

public data class DebugDeviceDescriptor00(public var bitfield: UByte = 0u)

public data class DebugEfiIommuData(public var pciIoProtocolHandle: COpaquePointer? = null, public var mapping: COpaquePointer? = null)

public data class DebugMemoryRequirements(
    public var start: Long = 0L,
    public var maxEnd: Long = 0L,
    public var virtualAddress: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var cached: Boolean = false,
    public var aligned: Boolean = false,
)

public data class DebugTransportData(
    public var hwContextSize: UInt = 0u,
    public var sharedVisibleDataSize: UInt = 0u,
    public var useSerialFraming: Boolean = false,
    public var validUSBCoreId: Boolean = false,
    public var uSBCoreId: UByte = 0u,
)

public data class DeviceBusSpecificResetInfo(public var busTypeGuid: Guid = Guid(), public var resetTypeSupported: DeviceBusSpecificResetType = DeviceBusSpecificResetType())

public data class DeviceBusSpecificResetType(
    public var pci: DeviceBusSpecificResetType0 = DeviceBusSpecificResetType0(),
    public var acpi: DeviceBusSpecificResetType1 = DeviceBusSpecificResetType1(),
    public var asULONGLONG: ULong = 0uL,
)

public data class DeviceBusSpecificResetType1(public var bitfield: ULong = 0uL)

public data class DeviceBusSpecificResetType0(public var bitfield: ULong = 0uL)

public data class DeviceCapabilities(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var bitfield: UInt = 0u,
    public var address: UInt = 0u,
    public var uINumber: UInt = 0u,
    public var deviceState: IntArray = IntArray(7),
    public var systemWake: SystemPowerState = 0,
    public var deviceWake: DevicePowerState = 0,
    public var d1Latency: UInt = 0u,
    public var d2Latency: UInt = 0u,
    public var d3Latency: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceCapabilities) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.bitfield != other.bitfield) return false
        if (this.address != other.address) return false
        if (this.uINumber != other.uINumber) return false
        if (!this.deviceState.contentEquals(other.deviceState)) return false
        if (this.systemWake != other.systemWake) return false
        if (this.deviceWake != other.deviceWake) return false
        if (this.d1Latency != other.d1Latency) return false
        if (this.d2Latency != other.d2Latency) return false
        if (this.d3Latency != other.d3Latency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.uINumber.hashCode()
        result = 31 * result + this.deviceState.contentHashCode()
        result = 31 * result + this.systemWake.hashCode()
        result = 31 * result + this.deviceWake.hashCode()
        result = 31 * result + this.d1Latency.hashCode()
        result = 31 * result + this.d2Latency.hashCode()
        result = 31 * result + this.d3Latency.hashCode()
        return result
    }
}

public class DeviceDescription(
    public var version: UInt = 0u,
    public var master: Boolean = false,
    public var scatterGather: Boolean = false,
    public var demandMode: Boolean = false,
    public var autoInitialize: Boolean = false,
    public var dma32BitAddresses: Boolean = false,
    public var ignoreCount: Boolean = false,
    public var reserved1: Boolean = false,
    public var dma64BitAddresses: Boolean = false,
    public var busNumber: UInt = 0u,
    public var dmaChannel: UInt = 0u,
    public var interfaceType: InterfaceType = 0,
    public var dmaWidth: DmaWidth = 0,
    public var dmaSpeed: DmaSpeed = 0,
    public var maximumLength: UInt = 0u,
    public var dmaPort: UInt = 0u,
    public var dmaAddressWidth: UInt = 0u,
    public var dmaControllerInstance: UInt = 0u,
    public var dmaRequestLine: UInt = 0u,
    public var deviceAddress: Long = 0L,
)

public data class DeviceFaultConfiguration(public var faultHandler: PiommuDeviceFaultHandler = null, public var faultContext: COpaquePointer? = null)

public data class DeviceFlags(public var bitfield: UInt = 0u)

public data class DeviceInterfaceChangeNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
    public var interfaceClassGuid: Guid = Guid(),
    public var symbolicLinkName: UnicodeString? = null,
)

public data class DeviceRelations(public var count: UInt = 0u, public var objects: List<DeviceObject> = List(1) { DeviceObject() })

public data class DeviceResetInterfaceStandard(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var deviceReset: PdeviceResetHandler = null,
    public var supportedResetTypes: UInt = 0u,
    public var reserved: COpaquePointer? = null,
    public var queryBusSpecificResetInfo: PdeviceQueryBusSpecificResetHandler = null,
    public var deviceBusSpecificReset: PdeviceBusSpecificResetHandler = null,
    public var getDeviceResetStatus: PgetDeviceResetStatus = null,
)

public data class DeviceResetStatusFlags(public var u: DeviceResetStatusFlags0 = DeviceResetStatusFlags0(), public var asUlonglong: ULong = 0uL)

public data class DeviceResetStatusFlags0(public var bitfield: ULong = 0uL)

public data class DiskSignature(public var partitionStyle: UInt = 0u, public var anonymous: DiskSignature0 = DiskSignature0())

public data class DiskSignature0(public var mbr: DiskSignature00 = DiskSignature00(), public var gpt: DiskSignature01 = DiskSignature01())

public data class DiskSignature01(public var diskId: Guid = Guid())

public data class DiskSignature00(public var signature: UInt = 0u, public var checkSum: UInt = 0u)

public data class DmaAdapter(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var dmaOperations: DmaOperations? = null,
)

public data class DmaAdapterInfo(public var version: UInt = 0u, public var anonymous: DmaAdapterInfo0 = DmaAdapterInfo0())

public data class DmaAdapterInfo0(public var v1: DmaAdapterInfoV1 = DmaAdapterInfoV1(), public var crashdump: DmaAdapterInfoCrashdump = DmaAdapterInfoCrashdump())

public data class DmaAdapterInfoCrashdump(
    public var deviceDescription: DeviceDescription = DeviceDescription(),
    public var deviceIdSize: Int = 0,
    public var deviceId: COpaquePointer? = null,
)

public data class DmaAdapterInfoV1(
    public var readDmaCounterAvailable: UInt = 0u,
    public var scatterGatherLimit: UInt = 0u,
    public var dmaAddressWidth: UInt = 0u,
    public var flags: UInt = 0u,
    public var minimumTransferUnit: UInt = 0u,
)

public data class DmaCommonBufferExtendedConfiguration(public var configType: DmaCommonBufferExtendedConfigurationType = 0, public var anonymous: DmaCommonBufferExtendedConfiguration0 = DmaCommonBufferExtendedConfiguration0())

public data class DmaCommonBufferExtendedConfiguration0(
    public var logicalAddressLimits: DmaCommonBufferExtendedConfiguration00 = DmaCommonBufferExtendedConfiguration00(),
    public var subSection: DmaCommonBufferExtendedConfiguration01 = DmaCommonBufferExtendedConfiguration01(),
    public var hardwareAccessType: DmaCommonBufferExtendedConfigurationAccessType = 0,
    public var reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DmaCommonBufferExtendedConfiguration0) return false
        if (this.logicalAddressLimits != other.logicalAddressLimits) return false
        if (this.subSection != other.subSection) return false
        if (this.hardwareAccessType != other.hardwareAccessType) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logicalAddressLimits.hashCode()
        result = 31 * result + this.subSection.hashCode()
        result = 31 * result + this.hardwareAccessType.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class DmaCommonBufferExtendedConfiguration00(public var minimumAddress: Long = 0L, public var maximumAddress: Long = 0L)

public data class DmaCommonBufferExtendedConfiguration01(public var offset: ULong = 0uL, public var length: UInt = 0u)

public data class DmaConfigurationByte0(public var bitfield: UByte = 0u)

public data class DmaConfigurationByte1(public var bitfield: UByte = 0u)

public data class DmaIommuInterface(
    public var version: UInt = 0u,
    public var createDomain: PiommuDomainCreate = null,
    public var deleteDomain: PiommuDomainDelete = null,
    public var attachDevice: PiommuDomainAttachDevice = null,
    public var detachDevice: PiommuDomainDetachDevice = null,
    public var flushDomain: PiommuFlushDomain = null,
    public var flushDomainByVaList: PiommuFlushDomainVaList = null,
    public var queryInputMappings: PiommuQueryInputMappings = null,
    public var mapLogicalRange: PiommuMapLogicalRange = null,
    public var unmapLogicalRange: PiommuUnmapLogicalRange = null,
    public var mapIdentityRange: PiommuMapIdentityRange = null,
    public var unmapIdentityRange: PiommuUnmapIdentityRange = null,
    public var setDeviceFaultReporting: PiommuSetDeviceFaultReporting = null,
    public var configureDomain: PiommuDomainConfigure = null,
)

public data class DmaIommuInterfaceEx(
    public var size: Int = 0,
    public var version: UInt = 0u,
    public var anonymous: DmaIommuInterfaceEx0 = DmaIommuInterfaceEx0(),
)

public data class DmaIommuInterfaceEx0(public var v1: DmaIommuInterfaceV1 = DmaIommuInterfaceV1(), public var v2: DmaIommuInterfaceV2 = DmaIommuInterfaceV2())

public data class DmaIommuInterfaceV1(
    public var createDomain: PiommuDomainCreate = null,
    public var deleteDomain: PiommuDomainDelete = null,
    public var attachDevice: PiommuDomainAttachDevice = null,
    public var detachDevice: PiommuDomainDetachDevice = null,
    public var flushDomain: PiommuFlushDomain = null,
    public var flushDomainByVaList: PiommuFlushDomainVaList = null,
    public var queryInputMappings: PiommuQueryInputMappings = null,
    public var mapLogicalRange: PiommuMapLogicalRange = null,
    public var unmapLogicalRange: PiommuUnmapLogicalRange = null,
    public var mapIdentityRange: PiommuMapIdentityRange = null,
    public var unmapIdentityRange: PiommuUnmapIdentityRange = null,
    public var setDeviceFaultReporting: PiommuSetDeviceFaultReporting = null,
    public var configureDomain: PiommuDomainConfigure = null,
)

public class DmaIommuInterfaceV2(
    public var createDomainEx: PiommuDomainCreateEx = null,
    public var deleteDomain: PiommuDomainDelete = null,
    public var attachDeviceEx: PiommuDomainAttachDeviceEx = null,
    public var detachDeviceEx: PiommuDomainDetachDeviceEx = null,
    public var flushDomain: PiommuFlushDomain = null,
    public var flushDomainByVaList: PiommuFlushDomainVaList = null,
    public var queryInputMappings: PiommuQueryInputMappings = null,
    public var mapLogicalRangeEx: PiommuMapLogicalRangeEx = null,
    public var unmapLogicalRange: PiommuUnmapLogicalRange = null,
    public var mapIdentityRangeEx: PiommuMapIdentityRangeEx = null,
    public var unmapIdentityRangeEx: PiommuUnmapIdentityRangeEx = null,
    public var setDeviceFaultReportingEx: PiommuSetDeviceFaultReportingEx = null,
    public var configureDomain: PiommuDomainConfigure = null,
    public var queryAvailableDomainTypes: PiommuDeviceQueryDomainTypes = null,
    public var registerInterfaceStateChangeCallback: PiommuRegisterInterfaceStateChangeCallback = null,
    public var unregisterInterfaceStateChangeCallback: PiommuUnregisterInterfaceStateChangeCallback = null,
    public var reserveLogicalAddressRange: PiommuReserveLogicalAddressRange = null,
    public var freeReservedLogicalAddressRange: PiommuFreeReservedLogicalAddressRange = null,
    public var mapReservedLogicalRange: PiommuMapReservedLogicalRange = null,
    public var unmapReservedLogicalRange: PiommuUnmapReservedLogicalRange = null,
    public var createDevice: PiommuDeviceCreate = null,
    public var deleteDevice: PiommuDeviceDelete = null,
)

public class DmaOperations(
    public var size: UInt = 0u,
    public var putDmaAdapter: PputDmaAdapter = null,
    public var allocateCommonBuffer: PallocateCommonBuffer = null,
    public var freeCommonBuffer: PfreeCommonBuffer = null,
    public var allocateAdapterChannel: PallocateAdapterChannel = null,
    public var flushAdapterBuffers: PflushAdapterBuffers = null,
    public var freeAdapterChannel: PfreeAdapterChannel = null,
    public var freeMapRegisters: PfreeMapRegisters = null,
    public var mapTransfer: PmapTransfer = null,
    public var getDmaAlignment: PgetDmaAlignment = null,
    public var readDmaCounter: PreadDmaCounter = null,
    public var getScatterGatherList: PgetScatterGatherList = null,
    public var putScatterGatherList: PputScatterGatherList = null,
    public var calculateScatterGatherList: PcalculateScatterGatherListSize = null,
    public var buildScatterGatherList: PbuildScatterGatherList = null,
    public var buildMdlFromScatterGatherList: PbuildMdlFromScatterGatherList = null,
    public var getDmaAdapterInfo: PgetDmaAdapterInfo = null,
    public var getDmaTransferInfo: PgetDmaTransferInfo = null,
    public var initializeDmaTransferContext: PinitializeDmaTransferContext = null,
    public var allocateCommonBufferEx: PallocateCommonBufferEx = null,
    public var allocateAdapterChannelEx: PallocateAdapterChannelEx = null,
    public var configureAdapterChannel: PconfigureAdapterChannel = null,
    public var cancelAdapterChannel: PcancelAdapterChannel = null,
    public var mapTransferEx: PmapTransferEx = null,
    public var getScatterGatherListEx: PgetScatterGatherListEx = null,
    public var buildScatterGatherListEx: PbuildScatterGatherListEx = null,
    public var flushAdapterBuffersEx: PflushAdapterBuffersEx = null,
    public var freeAdapterObject: PfreeAdapterObject = null,
    public var cancelMappedTransfer: PcancelMappedTransfer = null,
    public var allocateDomainCommonBuffer: PallocateDomainCommonBuffer = null,
    public var flushDmaBuffer: PflushDmaBuffer = null,
    public var joinDmaDomain: PjoinDmaDomain = null,
    public var leaveDmaDomain: PleaveDmaDomain = null,
    public var getDmaDomain: PgetDmaDomain = null,
    public var allocateCommonBufferWithBounds: PallocateCommonBufferWithBounds = null,
    public var allocateCommonBufferVector: PallocateCommonBufferVector = null,
    public var getCommonBufferFromVectorByIndex: PgetCommonBufferFromVectorByIndex = null,
    public var freeCommonBufferFromVector: PfreeCommonBufferFromVector = null,
    public var freeCommonBufferVector: PfreeCommonBufferVector = null,
    public var createCommonBufferFromMdl: PcreateCommonBufferFromMdl = null,
)

public data class DmaTransferInfo(public var version: UInt = 0u, public var anonymous: DmaTransferInfo0 = DmaTransferInfo0())

public data class DmaTransferInfo0(public var v1: DmaTransferInfoV1 = DmaTransferInfoV1(), public var v2: DmaTransferInfoV2 = DmaTransferInfoV2())

public data class DmaTransferInfoV1(
    public var mapRegisterCount: UInt = 0u,
    public var scatterGatherElementCount: UInt = 0u,
    public var scatterGatherListSize: UInt = 0u,
)

public data class DmaTransferInfoV2(
    public var mapRegisterCount: UInt = 0u,
    public var scatterGatherElementCount: UInt = 0u,
    public var scatterGatherListSize: UInt = 0u,
    public var logicalPageCount: UInt = 0u,
)

public data class DomainConfiguration(public var type: DomainConfigurationArch = 0, public var anonymous: DomainConfiguration0 = DomainConfiguration0())

public data class DomainConfiguration0(public var arm64: DomainConfigurationArm64 = DomainConfigurationArm64(), public var x64: DomainConfigurationX64 = DomainConfigurationX64())

public data class DomainConfigurationArm64(
    public var ttbr0: Long = 0L,
    public var ttbr1: Long = 0L,
    public var mair0: UInt = 0u,
    public var mair1: UInt = 0u,
    public var inputSize0: UByte = 0u,
    public var inputSize1: UByte = 0u,
    public var coherentTableWalks: Boolean = false,
    public var translationEnabled: Boolean = false,
)

public data class DomainConfigurationX64(public var firstLevelPageTableRoot: Long = 0L, public var translationEnabled: Boolean = false)

public data class DpcWatchdogGlobalTriageBlock(
    public var signature: UInt = 0u,
    public var revision: UShort = 0u,
    public var size: UShort = 0u,
    public var dpcWatchdogProfileOffset: UShort = 0u,
    public var dpcWatchdogProfileLength: UInt = 0u,
)

public data class DriverVerifierThunkPairs(public var pristineRoutine: PdriverVerifierThunkRoutine = null, public var newRoutine: PdriverVerifierThunkRoutine = null)

public data class EfiAcpiRasSignalTable(
    public var header: WheaAcpiHeader = WheaAcpiHeader(),
    public var numberRecord: UInt = 0u,
    public var entries: List<SignalRegValue> = List(1) { SignalRegValue() },
)

public data class EisaDmaConfiguration(public var configurationByte0: DmaConfigurationByte0 = DmaConfigurationByte0(), public var configurationByte1: DmaConfigurationByte1 = DmaConfigurationByte1())

public data class EisaIrqConfiguration(public var configurationByte: EisaIrqDescriptor = EisaIrqDescriptor(), public var reserved: UByte = 0u)

public data class EisaIrqDescriptor(public var bitfield: UByte = 0u)

public data class EisaMemoryConfiguration(
    public var configurationByte: EisaMemoryType = EisaMemoryType(),
    public var dataSize: UByte = 0u,
    public var addressLowWord: UShort = 0u,
    public var addressHighByte: UByte = 0u,
    public var memorySize: UShort = 0u,
)

public data class EisaMemoryType(public var bitfield: UByte = 0u)

public data class EisaPortConfiguration(public var configuration: EisaPortDescriptor = EisaPortDescriptor(), public var portAddress: UShort = 0u)

public data class EisaPortDescriptor(public var bitfield: UByte = 0u)

public data class EtwTraceSessionSettings(
    public var version: UInt = 0u,
    public var bufferSize: UInt = 0u,
    public var minimumBuffers: UInt = 0u,
    public var maximumBuffers: UInt = 0u,
    public var loggerMode: UInt = 0u,
    public var flushTimer: UInt = 0u,
    public var flushThreshold: UInt = 0u,
    public var clockType: UInt = 0u,
)

public data class ExtendedCreateInformation(
    public var extendedCreateFlags: Long = 0L,
    public var eaBuffer: COpaquePointer? = null,
    public var eaLength: UInt = 0u,
)

public data class ExtendedCreateInformation32(
    public var extendedCreateFlags: Long = 0L,
    public var eaBuffer: COpaquePointer? = null,
    public var eaLength: UInt = 0u,
)

public data class ExtDeleteParameters(
    public var version: UInt = 0u,
    public var reserved: UInt = 0u,
    public var deleteCallback: PextDeleteCallback = null,
    public var deleteContext: COpaquePointer? = null,
)

public data class ExRundownRef(public var anonymous: ExRundownRef0 = ExRundownRef0())

public data class ExRundownRef0(public var count: Int = 0, public var ptr: COpaquePointer? = null)

public data class FaultInformation(
    public var type: FaultInformationArch = 0,
    public var isStage1: Boolean = false,
    public var anonymous: FaultInformation0 = FaultInformation0(),
)

public data class FaultInformation0(public var arm64: FaultInformationArm64 = FaultInformationArm64(), public var x64: FaultInformationX64 = FaultInformationX64())

public data class FaultInformationArm64(
    public var domainHandle: COpaquePointer? = null,
    public var faultAddress: COpaquePointer? = null,
    public var physicalDeviceObject: DeviceObject? = null,
    public var inputMappingId: UInt = 0u,
    public var flags: FaultInformationArm64Flags = FaultInformationArm64Flags(),
    public var type: FaultInformationArm64Type = 0,
    public var iommuBaseAddress: ULong = 0uL,
)

public data class FaultInformationArm64Flags(public var bitfield: UInt = 0u)

public data class FaultInformationX64(
    public var domainHandle: COpaquePointer? = null,
    public var faultAddress: COpaquePointer? = null,
    public var flags: FaultInformationX64Flags = FaultInformationX64Flags(),
    public var type: FaultInformationArm64Type = 0,
    public var iommuBaseAddress: ULong = 0uL,
    public var pciSegment: UInt = 0u,
)

public data class FaultInformationX64Flags(public var bitfield: UInt = 0u)

public data class FileAttributeTagInformation(public var fileAttributes: UInt = 0u, public var reparseTag: UInt = 0u)

public data class FileEndOfFileInformation(public var endOfFile: Long = 0L)

public data class FileFsDeviceInformation(public var deviceType: UInt = 0u, public var characteristics: UInt = 0u)

public data class FileFsFullSizeInformation(
    public var totalAllocationUnits: Long = 0L,
    public var callerAvailableAllocationUnits: Long = 0L,
    public var actualAvailableAllocationUnits: Long = 0L,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
)

public data class FileFsFullSizeInformationEx(
    public var actualTotalAllocationUnits: ULong = 0uL,
    public var actualAvailableAllocationUnits: ULong = 0uL,
    public var actualPoolUnavailableAllocationUnits: ULong = 0uL,
    public var callerTotalAllocationUnits: ULong = 0uL,
    public var callerAvailableAllocationUnits: ULong = 0uL,
    public var callerPoolUnavailableAllocationUnits: ULong = 0uL,
    public var usedAllocationUnits: ULong = 0uL,
    public var totalReservedAllocationUnits: ULong = 0uL,
    public var volumeStorageReserveAllocationUnits: ULong = 0uL,
    public var availableCommittedAllocationUnits: ULong = 0uL,
    public var poolAvailableAllocationUnits: ULong = 0uL,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
)

public data class FileFsLabelInformation(public var volumeLabelLength: UInt = 0u, public var volumeLabel: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsLabelInformation) return false
        if (this.volumeLabelLength != other.volumeLabelLength) return false
        if (!this.volumeLabel.contentEquals(other.volumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeLabelLength.hashCode()
        result = 31 * result + this.volumeLabel.contentHashCode()
        return result
    }
}

public data class FileFsMetadataSizeInformation(
    public var totalMetadataAllocationUnits: Long = 0L,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
)

public data class FileFsObjectidInformation(public var objectId: UByteArray = UByteArray(16), public var extendedInfo: UByteArray = UByteArray(48)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsObjectidInformation) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (!this.extendedInfo.contentEquals(other.extendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectId.contentHashCode()
        result = 31 * result + this.extendedInfo.contentHashCode()
        return result
    }
}

public data class FileFsSizeInformation(
    public var totalAllocationUnits: Long = 0L,
    public var availableAllocationUnits: Long = 0L,
    public var sectorsPerAllocationUnit: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
)

public data class FileFsVolumeInformation(
    public var volumeCreationTime: Long = 0L,
    public var volumeSerialNumber: UInt = 0u,
    public var volumeLabelLength: UInt = 0u,
    public var supportsObjects: Boolean = false,
    public var volumeLabel: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsVolumeInformation) return false
        if (this.volumeCreationTime != other.volumeCreationTime) return false
        if (this.volumeSerialNumber != other.volumeSerialNumber) return false
        if (this.volumeLabelLength != other.volumeLabelLength) return false
        if (this.supportsObjects != other.supportsObjects) return false
        if (!this.volumeLabel.contentEquals(other.volumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeCreationTime.hashCode()
        result = 31 * result + this.volumeSerialNumber.hashCode()
        result = 31 * result + this.volumeLabelLength.hashCode()
        result = 31 * result + this.supportsObjects.hashCode()
        result = 31 * result + this.volumeLabel.contentHashCode()
        return result
    }
}

public data class FileIostatusblockRangeInformation(public var ioStatusBlockRange: COpaquePointer? = null, public var length: UInt = 0u)

public data class FileIoCompletionNotificationInformation(public var flags: UInt = 0u)

public data class FileIoPriorityHintInformation(public var priorityHint: IoPriorityHint = 0)

public data class FileIoPriorityHintInformationEx(public var priorityHint: IoPriorityHint = 0, public var boostOutstanding: Boolean = false)

public data class FileIsRemoteDeviceInformation(public var isRemote: Boolean = false)

public data class FileMemoryPartitionInformation(public var ownerPartitionHandle: Int = 0, public var flags: FileMemoryPartitionInformation0 = FileMemoryPartitionInformation0())

public data class FileMemoryPartitionInformation0(public var anonymous: FileMemoryPartitionInformation00 = FileMemoryPartitionInformation00(), public var allFlags: UInt = 0u)

public data class FileMemoryPartitionInformation00(public var noCrossPartitionAccess: UByte = 0u, public var spare: UByteArray = UByteArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileMemoryPartitionInformation00) return false
        if (this.noCrossPartitionAccess != other.noCrossPartitionAccess) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.noCrossPartitionAccess.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }
}

public data class FileNumaNodeInformation(public var nodeNumber: UShort = 0u)

public data class FileProcessIdsUsingFileInformation(public var numberOfProcessIdsInList: UInt = 0u, public var processIdList: IntArray = IntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileProcessIdsUsingFileInformation) return false
        if (this.numberOfProcessIdsInList != other.numberOfProcessIdsInList) return false
        if (!this.processIdList.contentEquals(other.processIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfProcessIdsInList.hashCode()
        result = 31 * result + this.processIdList.contentHashCode()
        return result
    }
}

public data class FileSfioReserveInformation(
    public var requestsPerPeriod: UInt = 0u,
    public var period: UInt = 0u,
    public var retryFailures: Boolean = false,
    public var discardable: Boolean = false,
    public var requestSize: UInt = 0u,
    public var numOutstandingRequests: UInt = 0u,
)

public data class FileSfioVolumeInformation(
    public var maximumRequestsPerPeriod: UInt = 0u,
    public var minimumPeriod: UInt = 0u,
    public var minimumTransferSize: UInt = 0u,
)

public data class FileStandardInformationEx(
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var numberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
    public var alternateStream: Boolean = false,
    public var metadataAttribute: Boolean = false,
)

public data class FileValidDataLengthInformation(public var validDataLength: Long = 0L)

public data class FloatingSaveArea(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var tagWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var registerArea: UByteArray = UByteArray(80),
    public var spare0: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FloatingSaveArea) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (!this.registerArea.contentEquals(other.registerArea)) return false
        if (this.spare0 != other.spare0) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.registerArea.contentHashCode()
        result = 31 * result + this.spare0.hashCode()
        return result
    }
}

public data class FpgaControlInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var busScan: PfpgaBusScan = null,
    public var controlLink: PfpgaControlLink = null,
    public var controlConfigSpace: PfpgaControlConfigSpace = null,
    public var controlErrorReporting: PfpgaControlErrorReporting = null,
)

public data class FunctionLevelDeviceResetParameters(
    public var size: UInt = 0u,
    public var deviceResetCompletion: PdeviceResetCompletion = null,
    public var completionContext: COpaquePointer? = null,
)

public data class HalAmliBadIoAddressList(
    public var badAddrBegin: UInt = 0u,
    public var badAddrSize: UInt = 0u,
    public var oSVersionTrigger: UInt = 0u,
    public var iOHandler: Phalioreadwritehandler = null,
)

public data class HalBusInformation(
    public var busType: InterfaceType = 0,
    public var configurationType: BusDataType = 0,
    public var busNumber: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class HalCallbacks(public var setSystemInformation: PcallbackObject = 0L, public var busCheck: PcallbackObject = 0L)

public class HalDispatch(
    public var version: UInt = 0u,
    public var halQuerySystemInformation: PHalQuerySystemInformation = null,
    public var halSetSystemInformation: PHalSetSystemInformation = null,
    public var halQueryBusSlots: PHalQueryBusSlots = null,
    public var spare1: UInt = 0u,
    public var halExamineMBR: PHalExamineMbr = null,
    public var halIoReadPartitionTable: PHalIoReadPartitionTable = null,
    public var halIoSetPartitionInformation: PHalIoSetPartitionInformation = null,
    public var halIoWritePartitionTable: PHalIoWritePartitionTable = null,
    public var halReferenceHandlerForBus: PHalHandlerForBus = null,
    public var halReferenceBusHandler: PHalReferenceBusHandler = null,
    public var halDereferenceBusHandler: PHalReferenceBusHandler = null,
    public var halInitPnpDriver: PHalInitPnpDriver = null,
    public var halInitPowerManagement: PHalInitPowerManagement = null,
    public var halGetDmaAdapter: PHalGetDmaAdapter = null,
    public var halGetInterruptTranslator: PHalGetInterruptTranslator = null,
    public var halStartMirroring: PHalStartMirroring = null,
    public var halEndMirroring: PHalEndMirroring = null,
    public var halMirrorPhysicalMemory: PHalMirrorPhysicalMemory = null,
    public var halEndOfBoot: PHalEndOfBoot = null,
    public var halMirrorVerify: PHalMirrorVerify = null,
    public var halGetCachedAcpiTable: PHalGetAcpiTable = null,
    public var halSetPciErrorHandlerCallback: PHalSetPciErrorHandlerCallback = null,
    public var halGetPrmCache: PHalGetPrmCache = null,
)

public class HalErrorInfo(
    public var version: UInt = 0u,
    public var initMaxSize: UInt = 0u,
    public var mcaMaxSize: UInt = 0u,
    public var mcaPreviousEventsCount: UInt = 0u,
    public var mcaCorrectedEventsCount: UInt = 0u,
    public var mcaKernelDeliveryFails: UInt = 0u,
    public var mcaDriverDpcQueueFails: UInt = 0u,
    public var mcaReserved: UInt = 0u,
    public var cmcMaxSize: UInt = 0u,
    public var cmcPollingInterval: UInt = 0u,
    public var cmcInterruptsCount: UInt = 0u,
    public var cmcKernelDeliveryFails: UInt = 0u,
    public var cmcDriverDpcQueueFails: UInt = 0u,
    public var cmcGetStateFails: UInt = 0u,
    public var cmcClearStateFails: UInt = 0u,
    public var cmcReserved: UInt = 0u,
    public var cmcLogId: ULong = 0uL,
    public var cpeMaxSize: UInt = 0u,
    public var cpePollingInterval: UInt = 0u,
    public var cpeInterruptsCount: UInt = 0u,
    public var cpeKernelDeliveryFails: UInt = 0u,
    public var cpeDriverDpcQueueFails: UInt = 0u,
    public var cpeGetStateFails: UInt = 0u,
    public var cpeClearStateFails: UInt = 0u,
    public var cpeInterruptSources: UInt = 0u,
    public var cpeLogId: ULong = 0uL,
    public var kernelReserved: ULongArray = ULongArray(4),
)

public data class HalMcaInterface(
    public var lock: Phalmcainterfacelock = null,
    public var unlock: Phalmcainterfaceunlock = null,
    public var readRegister: Phalmcainterfacereadregister = null,
)

public data class HalPlatformInformation(public var platformFlags: UInt = 0u)

public data class HalPowerInformation(public var tbd: UInt = 0u)

public data class HalProcessorFeature(public var usableFeatureBits: UInt = 0u)

public data class HalProcessorSpeedInformation(public var processorSpeed: UInt = 0u)

public data class HardwareCounter(
    public var type: HardwareCounterType = 0,
    public var reserved: UInt = 0u,
    public var index: ULong = 0uL,
)

public data class HwprofileChangeNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
)

public data class ImageInfo(
    public var anonymous: ImageInfo0 = ImageInfo0(),
    public var imageBase: COpaquePointer? = null,
    public var imageSelector: UInt = 0u,
    public var imageSize: Int = 0,
    public var imageSectionNumber: UInt = 0u,
)

public data class ImageInfo0(public var properties: UInt = 0u, public var anonymous: ImageInfo00 = ImageInfo00())

public data class ImageInfo00(public var bitfield: UInt = 0u)

public data class ImageInfoEx(
    public var size: Int = 0,
    public var imageInfo: ImageInfo = ImageInfo(),
    public var fileObject: FileObject? = null,
)

public data class InitialPrivilegeSet(
    public var privilegeCount: UInt = 0u,
    public var control: UInt = 0u,
    public var privilege: List<LuidAndAttributes> = List(3) { LuidAndAttributes() },
)

public data class InputMappingElement(public var inputMappingId: UInt = 0u)

public data class IntelCacheInfoEax(public var ulong: UInt = 0u, public var anonymous: IntelCacheInfoEax0 = IntelCacheInfoEax0())

public data class IntelCacheInfoEax0(public var bitfield: Int = 0)

public data class IntelCacheInfoEbx(public var ulong: UInt = 0u, public var anonymous: IntelCacheInfoEbx0 = IntelCacheInfoEbx0())

public data class IntelCacheInfoEbx0(public var bitfield: UInt = 0u)

public data class Interface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
)

public data class IommuDeviceCreationConfiguration(
    public var nextConfiguration: ListEntry = ListEntry(),
    public var configType: IommuDeviceCreationConfigurationType = 0,
    public var anonymous: IommuDeviceCreationConfiguration0 = IommuDeviceCreationConfiguration0(),
)

public data class IommuDeviceCreationConfiguration0(public var acpi: IommuDeviceCreationConfigurationAcpi = IommuDeviceCreationConfigurationAcpi(), public var deviceId: COpaquePointer? = null)

public data class IommuDeviceCreationConfigurationAcpi(public var inputMappingBase: UInt = 0u, public var mappingsCount: UInt = 0u)

public data class IommuDmaDomainCreationFlags(public var anonymous: IommuDmaDomainCreationFlags0 = IommuDmaDomainCreationFlags0(), public var asUlonglong: ULong = 0uL)

public data class IommuDmaDomainCreationFlags0(public var bitfield: ULong = 0uL)

public data class IommuDmaLogicalAddressToken(public var logicalAddressBase: ULong = 0uL, public var size: Int = 0)

public data class IommuDmaLogicalAddressTokenMappedSegment(
    public var owningToken: IommuDmaLogicalAddressToken? = null,
    public var offset: Int = 0,
    public var size: Int = 0,
)

public data class IommuDmaLogicalAllocatorConfig(public var logicalAllocatorType: IommuDmaLogicalAllocatorType = 0, public var anonymous: IommuDmaLogicalAllocatorConfig0 = IommuDmaLogicalAllocatorConfig0())

public data class IommuDmaLogicalAllocatorConfig0(public var buddyAllocatorConfig: IommuDmaLogicalAllocatorConfig00 = IommuDmaLogicalAllocatorConfig00())

public data class IommuDmaLogicalAllocatorConfig00(public var addressWidth: UInt = 0u)

public data class IommuDmaReservedRegion(
    public var regionNext: IommuDmaReservedRegion? = null,
    public var base: ULong = 0uL,
    public var numberOfPages: Int = 0,
    public var shouldMap: Boolean = false,
)

public data class IommuInterfaceStateChange(public var presentFields: IommuInterfaceStateChangeFields = IommuInterfaceStateChangeFields(), public var availableDomainTypes: UInt = 0u)

public data class IommuInterfaceStateChangeFields(public var anonymous: IommuInterfaceStateChangeFields0 = IommuInterfaceStateChangeFields0(), public var asULONG: UInt = 0u)

public data class IommuInterfaceStateChangeFields0(public var bitfield: UInt = 0u)

public data class IommuMapPhysicalAddress(public var mapType: IommuMapPhysicalAddressType = 0, public var anonymous: IommuMapPhysicalAddress0 = IommuMapPhysicalAddress0())

public data class IommuMapPhysicalAddress0(
    public var mdl: IommuMapPhysicalAddress00 = IommuMapPhysicalAddress00(),
    public var contiguousRange: IommuMapPhysicalAddress01 = IommuMapPhysicalAddress01(),
    public var pfnArray: IommuMapPhysicalAddress02 = IommuMapPhysicalAddress02(),
)

public data class IommuMapPhysicalAddress01(public var base: Long = 0L, public var size: Int = 0)

public data class IommuMapPhysicalAddress00(public var mdl: Mdl? = null)

public data class IommuMapPhysicalAddress02(public var pageFrame: UInt? = null, public var numberOfPages: Int = 0)

public data class IoAttributionInformation(
    public var version: UInt = 0u,
    public var flags: IoAttributionInformation0 = IoAttributionInformation0(),
    public var length: UInt = 0u,
    public var serviceStartTime: ULong = 0uL,
    public var currentTime: ULong = 0uL,
)

public data class IoAttributionInformation0(public var anonymous: IoAttributionInformation00 = IoAttributionInformation00(), public var allFlags: UInt = 0u)

public data class IoAttributionInformation00(public var bitfield: UInt = 0u)

public data class IoConnectInterruptFullySpecifiedParameters(
    public var physicalDeviceObject: DeviceObject? = null,
    public var interruptObject: Pkinterrupt? = null,
    public var serviceRoutine: PkserviceRoutine = null,
    public var serviceContext: COpaquePointer? = null,
    public var spinLock: Int? = null,
    public var synchronizeIrql: UByte = 0u,
    public var floatingSave: Boolean = false,
    public var shareVector: Boolean = false,
    public var vector: UInt = 0u,
    public var irql: UByte = 0u,
    public var interruptMode: KinterruptMode = 0,
    public var processorEnableMask: Int = 0,
    public var group: UShort = 0u,
)

public data class IoConnectInterruptLineBasedParameters(
    public var physicalDeviceObject: DeviceObject? = null,
    public var interruptObject: Pkinterrupt? = null,
    public var serviceRoutine: PkserviceRoutine = null,
    public var serviceContext: COpaquePointer? = null,
    public var spinLock: Int? = null,
    public var synchronizeIrql: UByte = 0u,
    public var floatingSave: Boolean = false,
)

public data class IoConnectInterruptMessageBasedParameters(
    public var physicalDeviceObject: DeviceObject? = null,
    public var connectionContext: IoConnectInterruptMessageBasedParameters0 = IoConnectInterruptMessageBasedParameters0(),
    public var messageServiceRoutine: PkmessageServiceRoutine = null,
    public var serviceContext: COpaquePointer? = null,
    public var spinLock: Int? = null,
    public var synchronizeIrql: UByte = 0u,
    public var floatingSave: Boolean = false,
    public var fallBackServiceRoutine: PkserviceRoutine = null,
)

public data class IoConnectInterruptMessageBasedParameters0(
    public var generic: COpaquePointer? = null,
    public var interruptMessageTable: COpaquePointer? = null,
    public var interruptObject: Pkinterrupt? = null,
)

public data class IoConnectInterruptParameters(public var version: UInt = 0u, public var anonymous: IoConnectInterruptParameters0 = IoConnectInterruptParameters0())

public data class IoConnectInterruptParameters0(
    public var fullySpecified: IoConnectInterruptFullySpecifiedParameters = IoConnectInterruptFullySpecifiedParameters(),
    public var lineBased: IoConnectInterruptLineBasedParameters = IoConnectInterruptLineBasedParameters(),
    public var messageBased: IoConnectInterruptMessageBasedParameters = IoConnectInterruptMessageBasedParameters(),
)

public data class IoCsq(
    public var type: UInt = 0u,
    public var csqInsertIrp: PioCsqInsertIrp = null,
    public var csqRemoveIrp: PioCsqRemoveIrp = null,
    public var csqPeekNextIrp: PioCsqPeekNextIrp = null,
    public var csqAcquireLock: PioCsqAcquireLock = null,
    public var csqReleaseLock: PioCsqReleaseLock = null,
    public var csqCompleteCanceledIrp: PioCsqCompleteCanceledIrp = null,
    public var reservePointer: COpaquePointer? = null,
)

public data class IoCsqIrpContext(
    public var type: UInt = 0u,
    public var irp: Irp? = null,
    public var csq: IoCsq? = null,
)

public data class IoDisconnectInterruptParameters(public var version: UInt = 0u, public var connectionContext: IoDisconnectInterruptParameters0 = IoDisconnectInterruptParameters0())

public data class IoDisconnectInterruptParameters0(
    public var generic: COpaquePointer? = null,
    public var interruptObject: Pkinterrupt = 0L,
    public var interruptMessageTable: IoInterruptMessageInfo? = null,
)

public data class IoDriverCreateContext(
    public var size: Short = 0,
    public var extraCreateParameter: Int? = null,
    public var deviceObjectHint: COpaquePointer? = null,
    public var txnParameters: TxnParameterBlock? = null,
    public var siloContext: Pesilo = 0L,
)

public data class IoErrorLogMessage(
    public var type: UShort = 0u,
    public var size: UShort = 0u,
    public var driverNameLength: UShort = 0u,
    public var timeStamp: Long = 0L,
    public var driverNameOffset: UInt = 0u,
    public var entryData: IoErrorLogPacket = IoErrorLogPacket(),
)

public data class IoErrorLogPacket(
    public var majorFunctionCode: UByte = 0u,
    public var retryCount: UByte = 0u,
    public var dumpDataSize: UShort = 0u,
    public var numberOfStrings: UShort = 0u,
    public var stringOffset: UShort = 0u,
    public var eventCategory: UShort = 0u,
    public var errorCode: Ntstatus = 0,
    public var uniqueErrorValue: UInt = 0u,
    public var finalStatus: Ntstatus = 0,
    public var sequenceNumber: UInt = 0u,
    public var ioControlCode: UInt = 0u,
    public var deviceOffset: Long = 0L,
    public var dumpData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoErrorLogPacket) return false
        if (this.majorFunctionCode != other.majorFunctionCode) return false
        if (this.retryCount != other.retryCount) return false
        if (this.dumpDataSize != other.dumpDataSize) return false
        if (this.numberOfStrings != other.numberOfStrings) return false
        if (this.stringOffset != other.stringOffset) return false
        if (this.eventCategory != other.eventCategory) return false
        if (this.errorCode != other.errorCode) return false
        if (this.uniqueErrorValue != other.uniqueErrorValue) return false
        if (this.finalStatus != other.finalStatus) return false
        if (this.sequenceNumber != other.sequenceNumber) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.deviceOffset != other.deviceOffset) return false
        if (!this.dumpData.contentEquals(other.dumpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorFunctionCode.hashCode()
        result = 31 * result + this.retryCount.hashCode()
        result = 31 * result + this.dumpDataSize.hashCode()
        result = 31 * result + this.numberOfStrings.hashCode()
        result = 31 * result + this.stringOffset.hashCode()
        result = 31 * result + this.eventCategory.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.uniqueErrorValue.hashCode()
        result = 31 * result + this.finalStatus.hashCode()
        result = 31 * result + this.sequenceNumber.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.deviceOffset.hashCode()
        result = 31 * result + this.dumpData.contentHashCode()
        return result
    }
}

public data class IoFoextShadowFile(public var backingFileObject: FileObject? = null, public var backingFltInstance: COpaquePointer? = null)

public data class IoFoextSiloParameters(
    public var length: UInt = 0u,
    public var anonymous: IoFoextSiloParameters0 = IoFoextSiloParameters0(),
    public var siloContext: Pesilo = 0L,
)

public data class IoFoextSiloParameters0(public var anonymous: IoFoextSiloParameters00 = IoFoextSiloParameters00(), public var flags: UInt = 0u)
