@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectNameInformation
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaNotificationDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public data class RegLoadKeyInformation(
    public var obj: COpaquePointer? = null,
    public var keyName: UnicodeString? = null,
    public var sourceFile: UnicodeString? = null,
    public var flags: UInt = 0u,
    public var trustClassObject: COpaquePointer? = null,
    public var userEvent: COpaquePointer? = null,
    public var desiredAccess: UInt = 0u,
    public var rootHandle: Handle? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegLoadKeyInformationV2(
    public var obj: COpaquePointer? = null,
    public var keyName: UnicodeString? = null,
    public var sourceFile: UnicodeString? = null,
    public var flags: UInt = 0u,
    public var trustClassObject: COpaquePointer? = null,
    public var userEvent: COpaquePointer? = null,
    public var desiredAccess: UInt = 0u,
    public var rootHandle: Handle? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var version: Int = 0,
    public var fileAccessToken: COpaquePointer? = null,
)

public data class RegPostCreateKeyInformation(
    public var completeName: UnicodeString? = null,
    public var obj: COpaquePointer? = null,
    public var status: Ntstatus = 0,
)

public data class RegPostOperationInformation(
    public var obj: COpaquePointer? = null,
    public var status: Ntstatus = 0,
    public var preInformation: COpaquePointer? = null,
    public var returnStatus: Ntstatus = 0,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegPreCreateKeyInformation(
    public var completeName: UnicodeString? = null,
)

public data class RegQueryKeyName(
    public var obj: COpaquePointer? = null,
    public var objectNameInfo: ObjectNameInformation? = null,
    public var length: UInt = 0u,
    public var returnLength: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegQueryKeySecurityInformation(
    public var obj: COpaquePointer? = null,
    public var securityInformation: UInt? = null,
    public var securityDescriptor: PsecurityDescriptor = null,
    public var length: UInt? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegRenameKeyInformation(
    public var obj: COpaquePointer? = null,
    public var newName: UnicodeString? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegReplaceKeyInformation(
    public var obj: COpaquePointer? = null,
    public var oldFileName: UnicodeString? = null,
    public var newFileName: UnicodeString? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegRestoreKeyInformation(
    public var obj: COpaquePointer? = null,
    public var fileHandle: Handle = null,
    public var flags: UInt = 0u,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegSaveKeyInformation(
    public var obj: COpaquePointer? = null,
    public var fileHandle: Handle = null,
    public var format: UInt = 0u,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegSaveMergedKeyInformation(
    public var obj: COpaquePointer? = null,
    public var fileHandle: Handle = null,
    public var highKeyObject: COpaquePointer? = null,
    public var lowKeyObject: COpaquePointer? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegSetKeySecurityInformation(
    public var obj: COpaquePointer? = null,
    public var securityInformation: UInt? = null,
    public var securityDescriptor: PsecurityDescriptor = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegSetValueKeyInformation(
    public var obj: COpaquePointer? = null,
    public var valueName: UnicodeString? = null,
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var dataSize: UInt = 0u,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class RegUnloadKeyInformation(
    public var obj: COpaquePointer? = null,
    public var userEvent: COpaquePointer? = null,
    public var callContext: COpaquePointer? = null,
    public var objectContext: COpaquePointer? = null,
    public var reserved: COpaquePointer? = null,
)

public data class ResourceHashEntry(
    public var listEntry: ListEntry = ListEntry(),
    public var address: COpaquePointer? = null,
    public var contentionCount: UInt = 0u,
    public var number: UInt = 0u,
)

public data class ResourcePerformanceData(
    public var activeResourceCount: UInt = 0u,
    public var totalResourceCount: UInt = 0u,
    public var exclusiveAcquire: UInt = 0u,
    public var sharedFirstLevel: UInt = 0u,
    public var sharedSecondLevel: UInt = 0u,
    public var starveFirstLevel: UInt = 0u,
    public var starveSecondLevel: UInt = 0u,
    public var waitForExclusive: UInt = 0u,
    public var ownerTableExpands: UInt = 0u,
    public var maximumTableExpand: UInt = 0u,
    public var hashTable: List<ListEntry> = List(64) { ListEntry() },
)

public data class RtlAvlTable(
    public var balancedRoot: RtlBalancedLinks = RtlBalancedLinks(),
    public var orderedPointer: COpaquePointer? = null,
    public var whichOrderedElement: UInt = 0u,
    public var numberGenericTableElements: UInt = 0u,
    public var depthOfTree: UInt = 0u,
    public var restartKey: RtlBalancedLinks? = null,
    public var deleteCount: UInt = 0u,
    public var compareRoutine: PrtlAvlCompareRoutine = null,
    public var allocateRoutine: PrtlAvlAllocateRoutine = null,
    public var freeRoutine: PrtlAvlFreeRoutine = null,
    public var tableContext: COpaquePointer? = null,
)

public data class RtlBalancedLinks(
    public var parent: RtlBalancedLinks? = null,
    public var leftChild: RtlBalancedLinks? = null,
    public var rightChild: RtlBalancedLinks? = null,
    public var balance: Byte = 0,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlBalancedLinks) return false
        if (this.parent != other.parent) return false
        if (this.leftChild != other.leftChild) return false
        if (this.rightChild != other.rightChild) return false
        if (this.balance != other.balance) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parent.hashCode()
        result = 31 * result + this.leftChild.hashCode()
        result = 31 * result + this.rightChild.hashCode()
        result = 31 * result + this.balance.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class RtlBitmap(
    public var sizeOfBitMap: UInt = 0u,
    public var buffer: UInt? = null,
)

public data class RtlBitmapRun(
    public var startingIndex: UInt = 0u,
    public var numberOfBits: UInt = 0u,
)

public data class RtlDynamicHashTable(
    public var flags: UInt = 0u,
    public var shift: UInt = 0u,
    public var tableSize: UInt = 0u,
    public var pivot: UInt = 0u,
    public var divisorMask: UInt = 0u,
    public var numEntries: UInt = 0u,
    public var nonEmptyBuckets: UInt = 0u,
    public var numEnumerators: UInt = 0u,
    public var directory: COpaquePointer? = null,
)

public data class RtlDynamicHashTableContext(
    public var chainHead: ListEntry? = null,
    public var prevLinkage: ListEntry? = null,
    public var signature: Int = 0,
)

public data class RtlDynamicHashTableEntry(
    public var linkage: ListEntry = ListEntry(),
    public var signature: Int = 0,
)

public data class RtlDynamicHashTableEnumerator(
    public var anonymous: RtlDynamicHashTableEnumerator0 = RtlDynamicHashTableEnumerator0(),
    public var chainHead: ListEntry? = null,
    public var bucketIndex: UInt = 0u,
)

public data class RtlDynamicHashTableEnumerator0(
    public var hashEntry: RtlDynamicHashTableEntry = RtlDynamicHashTableEntry(),
    public var curEntry: ListEntry? = null,
)

public data class RtlGenericTable(
    public var tableRoot: RtlSplayLinks? = null,
    public var insertOrderList: ListEntry = ListEntry(),
    public var orderedPointer: ListEntry? = null,
    public var whichOrderedElement: UInt = 0u,
    public var numberGenericTableElements: UInt = 0u,
    public var compareRoutine: PrtlGenericCompareRoutine = null,
    public var allocateRoutine: PrtlGenericAllocateRoutine = null,
    public var freeRoutine: PrtlGenericFreeRoutine = null,
    public var tableContext: COpaquePointer? = null,
)

public data class RtlQueryRegistryTable(
    public var queryRoutine: PrtlQueryRegistryRoutine = null,
    public var flags: UInt = 0u,
    public var name: Pwstr = null,
    public var entryContext: COpaquePointer? = null,
    public var defaultType: UInt = 0u,
    public var defaultData: COpaquePointer? = null,
    public var defaultLength: UInt = 0u,
)

public data class ScatterGatherElement(
    public var address: Long = 0L,
    public var length: UInt = 0u,
    public var reserved: Int = 0,
)

public data class ScatterGatherList(
    public var numberOfElements: UInt = 0u,
    public var reserved: Int = 0,
    public var elements: List<ScatterGatherElement> = List(1) { ScatterGatherElement() },
)

public data class SdevIdentifierInterface(
    public var interfaceHeader: Interface = Interface(),
    public var getIdentifier: PgetSdevIdentifier = null,
)

public data class SecureDriverInterface(
    public var interfaceHeader: Interface = Interface(),
    public var processReference: PsecureDriverProcessReference = null,
    public var processDereference: PsecureDriverProcessDereference = null,
    public var reserved: UInt = 0u,
)

public data class ShareAccess(
    public var openCount: UInt = 0u,
    public var readers: UInt = 0u,
    public var writers: UInt = 0u,
    public var deleters: UInt = 0u,
    public var sharedRead: UInt = 0u,
    public var sharedWrite: UInt = 0u,
    public var sharedDelete: UInt = 0u,
)

public data class SignalRegValue(
    public var regName: UByteArray = UByteArray(32),
    public var msrAddr: UInt = 0u,
    public var value: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SignalRegValue) return false
        if (!this.regName.contentEquals(other.regName)) return false
        if (this.msrAddr != other.msrAddr) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regName.contentHashCode()
        result = 31 * result + this.msrAddr.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }
}

public data class SiloMonitorRegistration(
    public var version: UByte = 0u,
    public var monitorHost: Boolean = false,
    public var monitorExistingSilos: Boolean = false,
    public var reserved: UByteArray = UByteArray(5),
    public var anonymous: SiloMonitorRegistration0 = SiloMonitorRegistration0(),
    public var createCallback: SiloMonitorCreateCallback = null,
    public var terminateCallback: SiloMonitorTerminateCallback = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiloMonitorRegistration) return false
        if (this.version != other.version) return false
        if (this.monitorHost != other.monitorHost) return false
        if (this.monitorExistingSilos != other.monitorExistingSilos) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        if (this.createCallback != other.createCallback) return false
        if (this.terminateCallback != other.terminateCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.monitorHost.hashCode()
        result = 31 * result + this.monitorExistingSilos.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.createCallback.hashCode()
        result = 31 * result + this.terminateCallback.hashCode()
        return result
    }
}

public data class SiloMonitorRegistration0(
    public var driverObjectName: UnicodeString? = null,
    public var componentName: UnicodeString? = null,
)

public data class SocSubsystemFailureDetails(
    public var subsysType: SocSubsystemType = 0,
    public var firmwareVersion: ULong = 0uL,
    public var hardwareVersion: ULong = 0uL,
    public var unifiedFailureRegionSize: UInt = 0u,
    public var unifiedFailureRegion: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocSubsystemFailureDetails) return false
        if (this.subsysType != other.subsysType) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        if (this.hardwareVersion != other.hardwareVersion) return false
        if (this.unifiedFailureRegionSize != other.unifiedFailureRegionSize) return false
        if (!this.unifiedFailureRegion.contentEquals(other.unifiedFailureRegion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subsysType.hashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        result = 31 * result + this.hardwareVersion.hashCode()
        result = 31 * result + this.unifiedFailureRegionSize.hashCode()
        result = 31 * result + this.unifiedFailureRegion.contentHashCode()
        return result
    }
}

public data class SystemFirmwareTableHandler(
    public var providerSignature: UInt = 0u,
    public var register: Boolean = false,
    public var firmwareTableHandler: Pfnfth = null,
    public var driverObject: COpaquePointer? = null,
)

public data class SystemFirmwareTableInformation(
    public var providerSignature: UInt = 0u,
    public var action: SystemFirmwareTableAction = 0,
    public var tableID: UInt = 0u,
    public var tableBufferLength: UInt = 0u,
    public var tableBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemFirmwareTableInformation) return false
        if (this.providerSignature != other.providerSignature) return false
        if (this.action != other.action) return false
        if (this.tableID != other.tableID) return false
        if (this.tableBufferLength != other.tableBufferLength) return false
        if (!this.tableBuffer.contentEquals(other.tableBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerSignature.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.tableID.hashCode()
        result = 31 * result + this.tableBufferLength.hashCode()
        result = 31 * result + this.tableBuffer.contentHashCode()
        return result
    }
}

public data class SystemPowerStateContext(
    public var anonymous: SystemPowerStateContext0 = SystemPowerStateContext0(),
)

public data class SystemPowerStateContext0(
    public var anonymous: SystemPowerStateContext00 = SystemPowerStateContext00(),
    public var contextAsUlong: UInt = 0u,
)

public data class SystemPowerStateContext00(
    public var bitfield: UInt = 0u,
)

public data class TargetDeviceRemovalNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
    public var fileObject: FileObject? = null,
)

public data class TimerSetCoalescableTimerInfo(
    public var dueTime: Long = 0L,
    public var timerApcRoutine: PtimerApcRoutine = null,
    public var timerContext: COpaquePointer? = null,
    public var wakeContext: CountedReasonContext? = null,
    public var period: UInt = 0u,
    public var tolerableDelay: UInt = 0u,
    public var previousState: Boolean? = null,
)

public data class TimeFields(
    public var year: Short = 0,
    public var month: Short = 0,
    public var day: Short = 0,
    public var hour: Short = 0,
    public var minute: Short = 0,
    public var second: Short = 0,
    public var milliseconds: Short = 0,
    public var weekday: Short = 0,
)

public data class TranslatorInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var translateResources: PtranslateResourceHandler = null,
    public var translateResourceRequirements: PtranslateResourceRequirementsHandler = null,
)

public data class TxnParameterBlock(
    public var length: UShort = 0u,
    public var txFsContext: UShort = 0u,
    public var transactionObject: COpaquePointer? = null,
)

public data class VirtualChannelCapabilities1(
    public var anonymous: VirtualChannelCapabilities10 = VirtualChannelCapabilities10(),
    public var asULONG: UInt = 0u,
)

public data class VirtualChannelCapabilities10(
    public var bitfield: UInt = 0u,
)

public data class VirtualChannelCapabilities2(
    public var anonymous: VirtualChannelCapabilities20 = VirtualChannelCapabilities20(),
    public var asULONG: UInt = 0u,
)

public data class VirtualChannelCapabilities20(
    public var bitfield: UInt = 0u,
)

public data class VirtualChannelControl(
    public var anonymous: VirtualChannelControl0 = VirtualChannelControl0(),
    public var asUSHORT: UShort = 0u,
)

public data class VirtualChannelControl0(
    public var bitfield: UShort = 0u,
)

public data class VirtualChannelStatus(
    public var anonymous: VirtualChannelStatus0 = VirtualChannelStatus0(),
    public var asUSHORT: UShort = 0u,
)

public data class VirtualChannelStatus0(
    public var bitfield: UShort = 0u,
)

public data class VirtualResource(
    public var capability: VirtualResourceCapability = VirtualResourceCapability(),
    public var control: VirtualResourceControl = VirtualResourceControl(),
    public var rsvdP: UShort = 0u,
    public var status: VirtualResourceStatus = VirtualResourceStatus(),
)

public data class VirtualResourceCapability(
    public var anonymous: VirtualResourceCapability0 = VirtualResourceCapability0(),
    public var asULONG: UInt = 0u,
)

public data class VirtualResourceCapability0(
    public var bitfield: UInt = 0u,
)

public data class VirtualResourceControl(
    public var anonymous: VirtualResourceControl0 = VirtualResourceControl0(),
    public var asULONG: UInt = 0u,
)

public data class VirtualResourceControl0(
    public var bitfield: UInt = 0u,
)

public data class VirtualResourceStatus(
    public var anonymous: VirtualResourceStatus0 = VirtualResourceStatus0(),
    public var asUSHORT: UShort = 0u,
)

public data class VirtualResourceStatus0(
    public var bitfield: UShort = 0u,
)

public data class VmCounters(
    public var peakVirtualSize: Int = 0,
    public var virtualSize: Int = 0,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
)

public data class VmCountersEx(
    public var peakVirtualSize: Int = 0,
    public var virtualSize: Int = 0,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: Int = 0,
    public var workingSetSize: Int = 0,
    public var quotaPeakPagedPoolUsage: Int = 0,
    public var quotaPagedPoolUsage: Int = 0,
    public var quotaPeakNonPagedPoolUsage: Int = 0,
    public var quotaNonPagedPoolUsage: Int = 0,
    public var pagefileUsage: Int = 0,
    public var peakPagefileUsage: Int = 0,
    public var privateUsage: Int = 0,
)

public data class VmCountersEx2(
    public var countersEx: VmCountersEx = VmCountersEx(),
    public var privateWorkingSetSize: Int = 0,
    public var sharedCommitUsage: ULong = 0uL,
)

public data class WaitContextBlock(
    public var anonymous: WaitContextBlock0 = WaitContextBlock0(),
    public var deviceRoutine: DriverControl = null,
    public var deviceContext: COpaquePointer? = null,
    public var numberOfMapRegisters: UInt = 0u,
    public var deviceObject: COpaquePointer? = null,
    public var currentIrp: COpaquePointer? = null,
    public var bufferChainingDpc: Kdpc? = null,
)

public data class WaitContextBlock0(
    public var waitQueueEntry: KdeviceQueueEntry = KdeviceQueueEntry(),
    public var anonymous: WaitContextBlock00 = WaitContextBlock00(),
)

public data class WaitContextBlock00(
    public var dmaWaitEntry: ListEntry = ListEntry(),
    public var numberOfChannels: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class Whea128a(
    public var low: ULong = 0uL,
    public var high: Long = 0L,
)

public data class WheapAcpiTimeoutEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var tableType: ByteArray = ByteArray(32),
    public var tableRequest: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapAcpiTimeoutEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.tableType.contentEquals(other.tableType)) return false
        if (!this.tableRequest.contentEquals(other.tableRequest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.tableType.contentHashCode()
        result = 31 * result + this.tableRequest.contentHashCode()
        return result
    }
}

public data class WheapAddRemoveErrorSourceEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var descriptor: WheaErrorSourceDescriptor = WheaErrorSourceDescriptor(),
    public var status: Ntstatus = 0,
    public var isRemove: Boolean = false,
)

public data class WheapAttemptRecoveryEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorHeader: WheaErrorRecordHeader = WheaErrorRecordHeader(),
    public var architecturalRecovery: Boolean = false,
    public var pshedRecovery: Boolean = false,
    public var status: Ntstatus = 0,
)

public data class WheapBadHestNotifyDataEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var sourceId: UShort = 0u,
    public var reserved: UShort = 0u,
    public var notifyDesc: WheaNotificationDescriptor = WheaNotificationDescriptor(),
)

public data class WheapClearedPoisonEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var physicalAddress: ULong = 0uL,
)

public data class WheapCmciImplementedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var cmciAvailable: Boolean = false,
)

public data class WheapCmciIniterrEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var msr: ULong = 0uL,
    public var type: UInt = 0u,
    public var bank: UInt = 0u,
    public var epIndex: UInt = 0u,
)

public data class WheapCmciRestartEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var cmciRestoreAttempts: UInt = 0u,
    public var maxCmciRestoreLimit: UInt = 0u,
    public var maxCorrectedErrorsFound: UInt = 0u,
    public var maxCorrectedErrorLimit: UInt = 0u,
)

public data class WheapCreateGenericRecordEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var error: ByteArray = ByteArray(32),
    public var entryCount: UInt = 0u,
    public var status: Ntstatus = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapCreateGenericRecordEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.error.contentEquals(other.error)) return false
        if (this.entryCount != other.entryCount) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.error.contentHashCode()
        result = 31 * result + this.entryCount.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }
}

public data class WheapDeferredEvent(
    public var listEntry: ListEntry = ListEntry(),
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapDeviceDrvEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var function: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapDeviceDrvEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.function.contentEquals(other.function)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.function.contentHashCode()
        return result
    }
}

public data class WheapDpcErrorEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errType: WheapDpcErrorEventType = 0,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
    public var deviceId: UShort = 0u,
    public var vendorId: UShort = 0u,
)

public data class WheapDroppedCorrectedErrorEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorSourceType: WheaErrorSourceType = 0,
    public var errorSourceId: UInt = 0u,
)

public data class WheapEdpcEnabledEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var eDPCEnabled: Boolean = false,
    public var eDPCRecovEnabled: Boolean = false,
)

public data class WheapErrorClearedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var epIndex: UInt = 0u,
    public var bank: UInt = 0u,
)

public data class WheapErrorRecordEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var record: WheaErrorRecord? = null,
)

public data class WheapErrSrcArrayInvalidEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorSourceCount: UInt = 0u,
    public var reportedLength: UInt = 0u,
    public var expectedLength: UInt = 0u,
)

public data class WheapErrSrcInvalidEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errDescriptor: WheaErrorSourceDescriptor = WheaErrorSourceDescriptor(),
    public var error: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapErrSrcInvalidEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.errDescriptor != other.errDescriptor) return false
        if (!this.error.contentEquals(other.error)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.errDescriptor.hashCode()
        result = 31 * result + this.error.contentHashCode()
        return result
    }
}

public data class WheapFoundErrorInBankEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var epIndex: UInt = 0u,
    public var bank: UInt = 0u,
    public var mciStatus: ULong = 0uL,
    public var errorType: UInt = 0u,
)

public data class WheapGenericErrMemMapEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var mapReason: ByteArray = ByteArray(32),
    public var physicalAddress: ULong = 0uL,
    public var length: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapGenericErrMemMapEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.mapReason.contentEquals(other.mapReason)) return false
        if (this.physicalAddress != other.physicalAddress) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.mapReason.contentHashCode()
        result = 31 * result + this.physicalAddress.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }
}

public data class WheapOscImplemented(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var oscImplemented: Boolean = false,
    public var debugChecked: Boolean = false,
)

public data class WheapPcieConfigInfo(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var segment: UInt = 0u,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
    public var value: ULong = 0uL,
    public var succeeded: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapPcieConfigInfo) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.segment != other.segment) return false
        if (this.bus != other.bus) return false
        if (this.device != other.device) return false
        if (this.function != other.function) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        if (this.value != other.value) return false
        if (this.succeeded != other.succeeded) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.segment.hashCode()
        result = 31 * result + this.bus.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.function.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.succeeded.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WheapPcieOverrideInfo(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var segment: UInt = 0u,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
    public var validBits: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var capAndControl: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapPcieOverrideInfo) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.segment != other.segment) return false
        if (this.bus != other.bus) return false
        if (this.device != other.device) return false
        if (this.function != other.function) return false
        if (this.validBits != other.validBits) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capAndControl != other.capAndControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.segment.hashCode()
        result = 31 * result + this.bus.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.function.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capAndControl.hashCode()
        return result
    }
}

public data class WheapPcieReadOverridesErr(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var failureReason: UInt = 0u,
    public var failureStatus: Ntstatus = 0,
)

public data class WheapPfaMemoryOfflined(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var decisionType: WheapPfaOfflineDecisionType = 0,
    public var immediateSuccess: Boolean = false,
    public var page: UInt = 0u,
)

public data class WheapPfaMemoryPolicy(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var registryKeysPresent: UInt = 0u,
    public var disableOffline: Boolean = false,
    public var persistOffline: Boolean = false,
    public var pfaDisabled: Boolean = false,
    public var pageCount: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var timeOut: UInt = 0u,
)

public data class WheapPfaMemoryRemoveMonitor(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var removeTrigger: WheaPfaRemoveTrigger = 0,
    public var timeInList: UInt = 0u,
    public var errorCount: UInt = 0u,
    public var page: UInt = 0u,
)

public data class WheapPluginDefectListCorrupt(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapPluginDefectListFullEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapPluginDefectListUefiVarFailed(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheapPluginPfaEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var noFurtherPfa: Boolean = false,
)

public data class WheapProcessEinjEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var error: ByteArray = ByteArray(32),
    public var injectionActionTableValid: Boolean = false,
    public var beginInjectionInstructionCount: UInt = 0u,
    public var getTriggerErrorActionTableInstructionCount: UInt = 0u,
    public var setErrorTypeInstructionCount: UInt = 0u,
    public var getErrorTypeInstructionCount: UInt = 0u,
    public var endOperationInstructionCount: UInt = 0u,
    public var executeOperationInstructionCount: UInt = 0u,
    public var checkBusyStatusInstructionCount: UInt = 0u,
    public var getCommandStatusInstructionCount: UInt = 0u,
    public var setErrorTypeWithAddressInstructionCount: UInt = 0u,
    public var getExecuteOperationTimingsInstructionCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapProcessEinjEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.error.contentEquals(other.error)) return false
        if (this.injectionActionTableValid != other.injectionActionTableValid) return false
        if (this.beginInjectionInstructionCount != other.beginInjectionInstructionCount) return false
        if (this.getTriggerErrorActionTableInstructionCount != other.getTriggerErrorActionTableInstructionCount) return false
        if (this.setErrorTypeInstructionCount != other.setErrorTypeInstructionCount) return false
        if (this.getErrorTypeInstructionCount != other.getErrorTypeInstructionCount) return false
        if (this.endOperationInstructionCount != other.endOperationInstructionCount) return false
        if (this.executeOperationInstructionCount != other.executeOperationInstructionCount) return false
        if (this.checkBusyStatusInstructionCount != other.checkBusyStatusInstructionCount) return false
        if (this.getCommandStatusInstructionCount != other.getCommandStatusInstructionCount) return false
        if (this.setErrorTypeWithAddressInstructionCount != other.setErrorTypeWithAddressInstructionCount) return false
        if (this.getExecuteOperationTimingsInstructionCount != other.getExecuteOperationTimingsInstructionCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.error.contentHashCode()
        result = 31 * result + this.injectionActionTableValid.hashCode()
        result = 31 * result + this.beginInjectionInstructionCount.hashCode()
        result = 31 * result + this.getTriggerErrorActionTableInstructionCount.hashCode()
        result = 31 * result + this.setErrorTypeInstructionCount.hashCode()
        result = 31 * result + this.getErrorTypeInstructionCount.hashCode()
        result = 31 * result + this.endOperationInstructionCount.hashCode()
        result = 31 * result + this.executeOperationInstructionCount.hashCode()
        result = 31 * result + this.checkBusyStatusInstructionCount.hashCode()
        result = 31 * result + this.getCommandStatusInstructionCount.hashCode()
        result = 31 * result + this.setErrorTypeWithAddressInstructionCount.hashCode()
        result = 31 * result + this.getExecuteOperationTimingsInstructionCount.hashCode()
        return result
    }
}

public data class WheapProcessHestEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var error: ByteArray = ByteArray(32),
    public var entryType: ByteArray = ByteArray(32),
    public var entryIndex: UInt = 0u,
    public var hestValid: Boolean = false,
    public var cmcCount: UInt = 0u,
    public var mceCount: UInt = 0u,
    public var nmiCount: UInt = 0u,
    public var aerRootCount: UInt = 0u,
    public var aerBridgeCount: UInt = 0u,
    public var aerEndPointCount: UInt = 0u,
    public var genericV1Count: UInt = 0u,
    public var genericV2Count: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheapProcessHestEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.error.contentEquals(other.error)) return false
        if (!this.entryType.contentEquals(other.entryType)) return false
        if (this.entryIndex != other.entryIndex) return false
        if (this.hestValid != other.hestValid) return false
        if (this.cmcCount != other.cmcCount) return false
        if (this.mceCount != other.mceCount) return false
        if (this.nmiCount != other.nmiCount) return false
        if (this.aerRootCount != other.aerRootCount) return false
        if (this.aerBridgeCount != other.aerBridgeCount) return false
        if (this.aerEndPointCount != other.aerEndPointCount) return false
        if (this.genericV1Count != other.genericV1Count) return false
        if (this.genericV2Count != other.genericV2Count) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.error.contentHashCode()
        result = 31 * result + this.entryType.contentHashCode()
        result = 31 * result + this.entryIndex.hashCode()
        result = 31 * result + this.hestValid.hashCode()
        result = 31 * result + this.cmcCount.hashCode()
        result = 31 * result + this.mceCount.hashCode()
        result = 31 * result + this.nmiCount.hashCode()
        result = 31 * result + this.aerRootCount.hashCode()
        result = 31 * result + this.aerBridgeCount.hashCode()
        result = 31 * result + this.aerEndPointCount.hashCode()
        result = 31 * result + this.genericV1Count.hashCode()
        result = 31 * result + this.genericV2Count.hashCode()
        return result
    }
}

public data class WheapPshedInjectError(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorType: UInt = 0u,
    public var parameter1: ULong = 0uL,
    public var parameter2: ULong = 0uL,
    public var parameter3: ULong = 0uL,
    public var parameter4: ULong = 0uL,
    public var injectionStatus: Ntstatus = 0,
    public var injectionAttempted: Boolean = false,
    public var injectionByPlugin: Boolean = false,
)

public data class WheapPshedPluginRegister(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var functionalAreaMask: UInt = 0u,
    public var status: Ntstatus = 0,
)

public data class WheapRowFailureEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var lowOrderPage: UInt = 0u,
    public var highOrderPage: UInt = 0u,
)

public data class WheapSpuriousAerEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorSeverity: WheaErrorSeverity = 0,
    public var errorHandlerType: UInt = 0u,
    public var spuriousErrorSourceId: UInt = 0u,
    public var rootErrorCommand: UInt = 0u,
    public var rootErrorStatus: UInt = 0u,
    public var deviceAssociationBitmap: UInt = 0u,
)

public data class WheapStartedReportHwError(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var errorPacket: WheaErrorPacketV2? = null,
)

public data class WheapStuckErrorEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var epIndex: UInt = 0u,
    public var bank: UInt = 0u,
    public var mciStatus: ULong = 0uL,
)

public data class WheaAcpiHeader(
    public var signature: UInt = 0u,
    public var length: UInt = 0u,
    public var revision: UByte = 0u,
    public var checksum: UByte = 0u,
    public var oemId: UByteArray = UByteArray(6),
    public var oemTableId: ULong = 0uL,
    public var oemRevision: UInt = 0u,
    public var creatorId: UInt = 0u,
    public var creatorRevision: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaAcpiHeader) return false
        if (this.signature != other.signature) return false
        if (this.length != other.length) return false
        if (this.revision != other.revision) return false
        if (this.checksum != other.checksum) return false
        if (!this.oemId.contentEquals(other.oemId)) return false
        if (this.oemTableId != other.oemTableId) return false
        if (this.oemRevision != other.oemRevision) return false
        if (this.creatorId != other.creatorId) return false
        if (this.creatorRevision != other.creatorRevision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.oemId.contentHashCode()
        result = 31 * result + this.oemTableId.hashCode()
        result = 31 * result + this.oemRevision.hashCode()
        result = 31 * result + this.creatorId.hashCode()
        result = 31 * result + this.creatorRevision.hashCode()
        return result
    }
}

public data class WheaAmdExtendedRegisters(
    public var ipid: ULong = 0uL,
    public var synd: ULong = 0uL,
    public var config: ULong = 0uL,
    public var destat: ULong = 0uL,
    public var deaddr: ULong = 0uL,
    public var misc1: ULong = 0uL,
    public var misc2: ULong = 0uL,
    public var misc3: ULong = 0uL,
    public var misc4: ULong = 0uL,
    public var rasCap: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaAmdExtendedRegisters) return false
        if (this.ipid != other.ipid) return false
        if (this.synd != other.synd) return false
        if (this.config != other.config) return false
        if (this.destat != other.destat) return false
        if (this.deaddr != other.deaddr) return false
        if (this.misc1 != other.misc1) return false
        if (this.misc2 != other.misc2) return false
        if (this.misc3 != other.misc3) return false
        if (this.misc4 != other.misc4) return false
        if (this.rasCap != other.rasCap) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipid.hashCode()
        result = 31 * result + this.synd.hashCode()
        result = 31 * result + this.config.hashCode()
        result = 31 * result + this.destat.hashCode()
        result = 31 * result + this.deaddr.hashCode()
        result = 31 * result + this.misc1.hashCode()
        result = 31 * result + this.misc2.hashCode()
        result = 31 * result + this.misc3.hashCode()
        result = 31 * result + this.misc4.hashCode()
        result = 31 * result + this.rasCap.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WheaArmv8Aarch32Gprs(
    public var r0: UInt = 0u,
    public var r1: UInt = 0u,
    public var r2: UInt = 0u,
    public var r3: UInt = 0u,
    public var r4: UInt = 0u,
    public var r5: UInt = 0u,
    public var r6: UInt = 0u,
    public var r7: UInt = 0u,
    public var r8: UInt = 0u,
    public var r9: UInt = 0u,
    public var r10: UInt = 0u,
    public var r11: UInt = 0u,
    public var r12: UInt = 0u,
    public var r13: UInt = 0u,
    public var r14: UInt = 0u,
    public var r15: UInt = 0u,
)

public data class WheaArmv8Aarch64El3Csr(
    public var elrEl3: ULong = 0uL,
    public var esrEl3: ULong = 0uL,
    public var farEl3: ULong = 0uL,
    public var mairEl3: ULong = 0uL,
    public var sctlrEl3: ULong = 0uL,
    public var spEl3: ULong = 0uL,
    public var spsrEl3: ULong = 0uL,
    public var tcrEl3: ULong = 0uL,
    public var tpidrEl3: ULong = 0uL,
    public var ttbr0El3: ULong = 0uL,
)

public class WheaArmv8Aarch64Gprs(
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
    public var x29: ULong = 0uL,
    public var x30: ULong = 0uL,
    public var sp: ULong = 0uL,
)

public class WheaArmAarch32El1Csr(
    public var dfar: UInt = 0u,
    public var dfsr: UInt = 0u,
    public var ifar: UInt = 0u,
    public var isr: UInt = 0u,
    public var mair0: UInt = 0u,
    public var mair1: UInt = 0u,
    public var midr: UInt = 0u,
    public var mpidr: UInt = 0u,
    public var nmrr: UInt = 0u,
    public var prrr: UInt = 0u,
    public var sctlr: UInt = 0u,
    public var spsr: UInt = 0u,
    public var spsrAbt: UInt = 0u,
    public var spsrFiq: UInt = 0u,
    public var spsrIrq: UInt = 0u,
    public var spsrSvc: UInt = 0u,
    public var spsrUnd: UInt = 0u,
    public var tpidrprw: UInt = 0u,
    public var tpidruro: UInt = 0u,
    public var tpidrurw: UInt = 0u,
    public var ttbcr: UInt = 0u,
    public var ttbr0: UInt = 0u,
    public var ttbr1: UInt = 0u,
    public var dacr: UInt = 0u,
)

public data class WheaArmAarch32El2Csr(
    public var elrHyp: UInt = 0u,
    public var hamair0: UInt = 0u,
    public var hamair1: UInt = 0u,
    public var hcr: UInt = 0u,
    public var hcr2: UInt = 0u,
    public var hdfar: UInt = 0u,
    public var hifar: UInt = 0u,
    public var hpfar: UInt = 0u,
    public var hsr: UInt = 0u,
    public var htcr: UInt = 0u,
    public var htpidr: UInt = 0u,
    public var httbr: UInt = 0u,
    public var spsrHyp: UInt = 0u,
    public var vtcr: UInt = 0u,
    public var vttbr: UInt = 0u,
    public var dacr32El2: UInt = 0u,
)

public data class WheaArmAarch32SecureCsr(
    public var sctlr: UInt = 0u,
    public var spsrMon: UInt = 0u,
)

public class WheaArmAarch64El1Csr(
    public var elrEl1: ULong = 0uL,
    public var esrEl2: ULong = 0uL,
    public var farEl1: ULong = 0uL,
    public var isrEl1: ULong = 0uL,
    public var mairEl1: ULong = 0uL,
    public var midrEl1: ULong = 0uL,
    public var mpidrEl1: ULong = 0uL,
    public var sctlrEl1: ULong = 0uL,
    public var spEl0: ULong = 0uL,
    public var spEl1: ULong = 0uL,
    public var spsrEl1: ULong = 0uL,
    public var tcrEl1: ULong = 0uL,
    public var tpidrEl0: ULong = 0uL,
    public var tpidrEl1: ULong = 0uL,
    public var tpidrroEl0: ULong = 0uL,
    public var ttbr0El1: ULong = 0uL,
    public var ttbr1El1: ULong = 0uL,
)

public data class WheaArmAarch64El2Csr(
    public var elrEl2: ULong = 0uL,
    public var esrEl2: ULong = 0uL,
    public var farEl2: ULong = 0uL,
    public var hacrEl2: ULong = 0uL,
    public var hcrEl2: ULong = 0uL,
    public var hpfarEl2: ULong = 0uL,
    public var mairEl2: ULong = 0uL,
    public var sctlrEl2: ULong = 0uL,
    public var spEl2: ULong = 0uL,
    public var spsrEl2: ULong = 0uL,
    public var tcrEl2: ULong = 0uL,
    public var tpidrEl2: ULong = 0uL,
    public var ttbr0El2: ULong = 0uL,
    public var vtcrEl2: ULong = 0uL,
    public var vttbrEl2: ULong = 0uL,
)

public data class WheaArmBusError(
    public var validationBit: WheaArmBusErrorValidBits = WheaArmBusErrorValidBits(),
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UShort = 0u,
    public var bitfield5: UByte = 0u,
    public var bitfield6: UInt = 0u,
)

public data class WheaArmBusErrorValidBits(
    public var anonymous: WheaArmBusErrorValidBits0 = WheaArmBusErrorValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmBusErrorValidBits0(
    public var bitfield: UShort = 0u,
)

public data class WheaArmCacheError(
    public var validationBit: WheaArmCacheErrorValidBits = WheaArmCacheErrorValidBits(),
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: ULong = 0uL,
)

public data class WheaArmCacheErrorValidBits(
    public var anonymous: WheaArmCacheErrorValidBits0 = WheaArmCacheErrorValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmCacheErrorValidBits0(
    public var bitfield: UShort = 0u,
)

public data class WheaArmMiscCsr(
    public var mRSEncoding: UShort = 0u,
    public var value: ULong = 0uL,
)

public data class WheaArmProcessorError(
    public var cacheError: WheaArmCacheError = WheaArmCacheError(),
    public var tlbError: WheaArmTlbError = WheaArmTlbError(),
    public var busError: WheaArmBusError = WheaArmBusError(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaArmProcessorErrorContextInformationHeader(
    public var version: UShort = 0u,
    public var registerContextType: UShort = 0u,
    public var registerArraySize: UInt = 0u,
    public var registerArray: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaArmProcessorErrorContextInformationHeader) return false
        if (this.version != other.version) return false
        if (this.registerContextType != other.registerContextType) return false
        if (this.registerArraySize != other.registerArraySize) return false
        if (!this.registerArray.contentEquals(other.registerArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.registerContextType.hashCode()
        result = 31 * result + this.registerArraySize.hashCode()
        result = 31 * result + this.registerArray.contentHashCode()
        return result
    }
}

public data class WheaArmProcessorErrorContextInformationHeaderFlags(
    public var anonymous: WheaArmProcessorErrorContextInformationHeaderFlags0 = WheaArmProcessorErrorContextInformationHeaderFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaArmProcessorErrorContextInformationHeaderFlags0(
    public var bitfield: UInt = 0u,
)

public data class WheaArmProcessorErrorInformation(
    public var version: UByte = 0u,
    public var length: UByte = 0u,
    public var validationBit: WheaArmProcessorErrorInformationValidBits = WheaArmProcessorErrorInformationValidBits(),
    public var type: UByte = 0u,
    public var multipleError: UShort = 0u,
    public var flags: UByte = 0u,
    public var errorInformation: ULong = 0uL,
    public var virtualFaultAddress: ULong = 0uL,
    public var physicalFaultAddress: ULong = 0uL,
)

public data class WheaArmProcessorErrorInformationValidBits(
    public var anonymous: WheaArmProcessorErrorInformationValidBits0 = WheaArmProcessorErrorInformationValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmProcessorErrorInformationValidBits0(
    public var bitfield: UShort = 0u,
)

public data class WheaArmProcessorErrorSection(
    public var validBits: WheaArmProcessorErrorSectionValidBits = WheaArmProcessorErrorSectionValidBits(),
    public var errorInformationStructures: UShort = 0u,
    public var contextInformationStructures: UShort = 0u,
    public var sectionLength: UInt = 0u,
    public var errorAffinityLevel: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var mpidrEl1: ULong = 0uL,
    public var midrEl1: ULong = 0uL,
    public var runningState: UInt = 0u,
    public var pSCIState: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaArmProcessorErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.errorInformationStructures != other.errorInformationStructures) return false
        if (this.contextInformationStructures != other.contextInformationStructures) return false
        if (this.sectionLength != other.sectionLength) return false
        if (this.errorAffinityLevel != other.errorAffinityLevel) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.mpidrEl1 != other.mpidrEl1) return false
        if (this.midrEl1 != other.midrEl1) return false
        if (this.runningState != other.runningState) return false
        if (this.pSCIState != other.pSCIState) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.errorInformationStructures.hashCode()
        result = 31 * result + this.contextInformationStructures.hashCode()
        result = 31 * result + this.sectionLength.hashCode()
        result = 31 * result + this.errorAffinityLevel.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.mpidrEl1.hashCode()
        result = 31 * result + this.midrEl1.hashCode()
        result = 31 * result + this.runningState.hashCode()
        result = 31 * result + this.pSCIState.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaArmProcessorErrorSectionValidBits(
    public var anonymous: WheaArmProcessorErrorSectionValidBits0 = WheaArmProcessorErrorSectionValidBits0(),
    public var asULONG: UInt = 0u,
)

public data class WheaArmProcessorErrorSectionValidBits0(
    public var bitfield: UInt = 0u,
)

public data class WheaArmTlbError(
    public var validationBit: WheaArmTlbErrorValidBits = WheaArmTlbErrorValidBits(),
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: ULong = 0uL,
)

public data class WheaArmTlbErrorValidBits(
    public var anonymous: WheaArmTlbErrorValidBits0 = WheaArmTlbErrorValidBits0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaArmTlbErrorValidBits0(
    public var bitfield: UShort = 0u,
)

public data class WheaAzccRootBusErrEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var maxBusCountPassed: Boolean = false,
    public var invalidBusMSR: Boolean = false,
)

public data class WheaAzccRootBusListEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var rootBusCount: UInt = 0u,
    public var rootBuses: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaAzccRootBusListEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (this.rootBusCount != other.rootBusCount) return false
        if (!this.rootBuses.contentEquals(other.rootBuses)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.rootBusCount.hashCode()
        result = 31 * result + this.rootBuses.contentHashCode()
        return result
    }
}

public data class WheaAzccSetPoisonEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var bus: UInt = 0u,
    public var readSuccess: Boolean = false,
    public var writeSuccess: Boolean = false,
    public var isEnable: Boolean = false,
)

public data class WheaErrorInjectionCapabilities(
    public var anonymous: WheaErrorInjectionCapabilities0 = WheaErrorInjectionCapabilities0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorInjectionCapabilities0(
    public var bitfield: UInt = 0u,
)

public data class WheaErrorPacketFlags(
    public var anonymous: WheaErrorPacketFlags0 = WheaErrorPacketFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorPacketFlags0(
    public var bitfield: UInt = 0u,
)

public class WheaErrorPacketV1(
    public var signature: UInt = 0u,
    public var flags: WheaErrorPacketFlags = WheaErrorPacketFlags(),
    public var size: UInt = 0u,
    public var rawDataLength: UInt = 0u,
    public var reserved1: ULong = 0uL,
    public var context: ULong = 0uL,
    public var errorType: WheaErrorType = 0,
    public var errorSeverity: WheaErrorSeverity = 0,
    public var errorSourceId: UInt = 0u,
    public var errorSourceType: WheaErrorSourceType = 0,
    public var reserved2: UInt = 0u,
    public var version: UInt = 0u,
    public var cpu: ULong = 0uL,
    public var u: WheaErrorPacketV10 = WheaErrorPacketV10(),
    public var rawDataFormat: WheaRawDataFormat = 0,
    public var rawDataOffset: UInt = 0u,
    public var rawData: UByteArray = UByteArray(1),
)

public data class WheaErrorPacketV10(
    public var processorError: WheaProcessorGenericErrorSection = WheaProcessorGenericErrorSection(),
    public var memoryError: WheaMemoryErrorSection = WheaMemoryErrorSection(),
    public var nmiError: WheaNmiErrorSection = WheaNmiErrorSection(),
    public var pciExpressError: WheaPciexpressErrorSection = WheaPciexpressErrorSection(),
    public var pciXBusError: WheaPcixbusErrorSection = WheaPcixbusErrorSection(),
    public var pciXDeviceError: WheaPcixdeviceErrorSection = WheaPcixdeviceErrorSection(),
    public var pmemError: WheaPmemErrorSection = WheaPmemErrorSection(),
)

public data class WheaErrorPacketV2(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var flags: WheaErrorPacketFlags = WheaErrorPacketFlags(),
    public var errorType: WheaErrorType = 0,
    public var errorSeverity: WheaErrorSeverity = 0,
    public var errorSourceId: UInt = 0u,
    public var errorSourceType: WheaErrorSourceType = 0,
    public var notifyType: Guid = Guid(),
    public var context: ULong = 0uL,
    public var dataFormat: WheaErrorPacketDataFormat = 0,
    public var reserved1: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var pshedDataOffset: UInt = 0u,
    public var pshedDataLength: UInt = 0u,
)

public data class WheaErrorRecord(
    public var header: WheaErrorRecordHeader = WheaErrorRecordHeader(),
    public var sectionDescriptor: List<WheaErrorRecordSectionDescriptor> = List(1) { WheaErrorRecordSectionDescriptor() },
)

public data class WheaErrorRecordHeader(
    public var signature: UInt = 0u,
    public var revision: WheaRevision = WheaRevision(),
    public var signatureEnd: UInt = 0u,
    public var sectionCount: UShort = 0u,
    public var severity: WheaErrorSeverity = 0,
    public var validBits: WheaErrorRecordHeaderValidbits = WheaErrorRecordHeaderValidbits(),
    public var length: UInt = 0u,
    public var timestamp: WheaTimestamp = WheaTimestamp(),
    public var platformId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
    public var creatorId: Guid = Guid(),
    public var notifyType: Guid = Guid(),
    public var recordId: ULong = 0uL,
    public var flags: WheaErrorRecordHeaderFlags = WheaErrorRecordHeaderFlags(),
    public var persistenceInfo: WheaPersistenceInfo = WheaPersistenceInfo(),
    public var anonymous: WheaErrorRecordHeader0 = WheaErrorRecordHeader0(),
)

public data class WheaErrorRecordHeader0(
    public var anonymous: WheaErrorRecordHeader00 = WheaErrorRecordHeader00(),
    public var reserved: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecordHeader0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class WheaErrorRecordHeader00(
    public var osBuildNumber: UInt = 0u,
    public var reserved2: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecordHeader00) return false
        if (this.osBuildNumber != other.osBuildNumber) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.osBuildNumber.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class WheaErrorRecordHeaderFlags(
    public var anonymous: WheaErrorRecordHeaderFlags0 = WheaErrorRecordHeaderFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorRecordHeaderFlags0(
    public var bitfield: UInt = 0u,
)

public data class WheaErrorRecordHeaderValidbits(
    public var anonymous: WheaErrorRecordHeaderValidbits0 = WheaErrorRecordHeaderValidbits0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorRecordHeaderValidbits0(
    public var bitfield: UInt = 0u,
)

public data class WheaErrorRecordSectionDescriptor(
    public var sectionOffset: UInt = 0u,
    public var sectionLength: UInt = 0u,
    public var revision: WheaRevision = WheaRevision(),
    public var validBits: WheaErrorRecordSectionDescriptorValidbits = WheaErrorRecordSectionDescriptorValidbits(),
    public var reserved: UByte = 0u,
    public var flags: WheaErrorRecordSectionDescriptorFlags = WheaErrorRecordSectionDescriptorFlags(),
    public var sectionType: Guid = Guid(),
    public var fRUId: Guid = Guid(),
    public var sectionSeverity: WheaErrorSeverity = 0,
    public var fRUText: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecordSectionDescriptor) return false
        if (this.sectionOffset != other.sectionOffset) return false
        if (this.sectionLength != other.sectionLength) return false
        if (this.revision != other.revision) return false
        if (this.validBits != other.validBits) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.sectionType != other.sectionType) return false
        if (this.fRUId != other.fRUId) return false
        if (this.sectionSeverity != other.sectionSeverity) return false
        if (!this.fRUText.contentEquals(other.fRUText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionOffset.hashCode()
        result = 31 * result + this.sectionLength.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sectionType.hashCode()
        result = 31 * result + this.fRUId.hashCode()
        result = 31 * result + this.sectionSeverity.hashCode()
        result = 31 * result + this.fRUText.contentHashCode()
        return result
    }
}

public data class WheaErrorRecordSectionDescriptorFlags(
    public var anonymous: WheaErrorRecordSectionDescriptorFlags0 = WheaErrorRecordSectionDescriptorFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaErrorRecordSectionDescriptorFlags0(
    public var bitfield: UInt = 0u,
)

public data class WheaErrorRecordSectionDescriptorValidbits(
    public var anonymous: WheaErrorRecordSectionDescriptorValidbits0 = WheaErrorRecordSectionDescriptorValidbits0(),
    public var asUCHAR: UByte = 0u,
)

public data class WheaErrorRecordSectionDescriptorValidbits0(
    public var bitfield: UByte = 0u,
)

public data class WheaErrorRecoveryInfoSection(
    public var recoveryKernel: Boolean = false,
    public var recoveryAction: WheaRecoveryAction = WheaRecoveryAction(),
    public var recoveryType: WheaRecoveryType = 0,
    public var irql: UByte = 0u,
    public var recoverySucceeded: Boolean = false,
    public var failureReason: WheaRecoveryFailureReason = 0,
    public var processName: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorRecoveryInfoSection) return false
        if (this.recoveryKernel != other.recoveryKernel) return false
        if (this.recoveryAction != other.recoveryAction) return false
        if (this.recoveryType != other.recoveryType) return false
        if (this.irql != other.irql) return false
        if (this.recoverySucceeded != other.recoverySucceeded) return false
        if (this.failureReason != other.failureReason) return false
        if (!this.processName.contentEquals(other.processName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recoveryKernel.hashCode()
        result = 31 * result + this.recoveryAction.hashCode()
        result = 31 * result + this.recoveryType.hashCode()
        result = 31 * result + this.irql.hashCode()
        result = 31 * result + this.recoverySucceeded.hashCode()
        result = 31 * result + this.failureReason.hashCode()
        result = 31 * result + this.processName.contentHashCode()
        return result
    }
}

public data class WheaErrorSourceConfiguration(
    public var flags: UInt = 0u,
    public var correct: WheaErrorSourceCorrect = null,
    public var initialize: WheaErrorSourceInitialize = null,
    public var createRecord: WheaErrorSourceCreateRecord = null,
    public var recover: WheaErrorSourceRecover = null,
    public var uninitialize: WheaErrorSourceUninitialize = null,
    public var reserved: COpaquePointer? = null,
)

public data class WheaErrorSourceOverrideSettings(
    public var type: WheaErrorSourceType = 0,
    public var maxRawDataLength: UInt = 0u,
    public var numRecordsToPreallocate: UInt = 0u,
    public var maxSectionsPerRecord: UInt = 0u,
)

public data class WheaErrorStatus(
    public var errorStatus: ULong = 0uL,
    public var anonymous: WheaErrorStatus0 = WheaErrorStatus0(),
)

public data class WheaErrorStatus0(
    public var bitfield: ULong = 0uL,
)

public data class WheaEtwOverflowEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var recordId: ULong = 0uL,
)

public data class WheaEventLogEntry(
    public var header: WheaEventLogEntryHeader = WheaEventLogEntryHeader(),
)

public data class WheaEventLogEntryFlags(
    public var anonymous: WheaEventLogEntryFlags0 = WheaEventLogEntryFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaEventLogEntryFlags0(
    public var bitfield: UInt = 0u,
)

public data class WheaEventLogEntryHeader(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var type: WheaEventLogEntryType = 0,
    public var ownerTag: UInt = 0u,
    public var id: WheaEventLogEntryId = 0,
    public var flags: WheaEventLogEntryFlags = WheaEventLogEntryFlags(),
    public var payloadLength: UInt = 0u,
)

public data class WheaFailedAddDefectListEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaFirmwareErrorRecordReference(
    public var type: UByte = 0u,
    public var reserved: UByteArray = UByteArray(7),
    public var firmwareRecordId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaFirmwareErrorRecordReference) return false
        if (this.type != other.type) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.firmwareRecordId != other.firmwareRecordId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.firmwareRecordId.hashCode()
        return result
    }
}

public data class WheaGenericError(
    public var blockStatus: WheaGenericErrorBlockstatus = WheaGenericErrorBlockstatus(),
    public var rawDataOffset: UInt = 0u,
    public var rawDataLength: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var errorSeverity: WheaErrorSeverity = 0,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaGenericError) return false
        if (this.blockStatus != other.blockStatus) return false
        if (this.rawDataOffset != other.rawDataOffset) return false
        if (this.rawDataLength != other.rawDataLength) return false
        if (this.dataLength != other.dataLength) return false
        if (this.errorSeverity != other.errorSeverity) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.blockStatus.hashCode()
        result = 31 * result + this.rawDataOffset.hashCode()
        result = 31 * result + this.rawDataLength.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.errorSeverity.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaGenericErrorBlockstatus(
    public var anonymous: WheaGenericErrorBlockstatus0 = WheaGenericErrorBlockstatus0(),
    public var asULONG: UInt = 0u,
)

public data class WheaGenericErrorBlockstatus0(
    public var bitfield: UInt = 0u,
)

public data class WheaGenericErrorDataEntryV1(
    public var sectionType: Guid = Guid(),
    public var errorSeverity: WheaErrorSeverity = 0,
    public var revision: WheaRevision = WheaRevision(),
    public var validBits: UByte = 0u,
    public var flags: UByte = 0u,
    public var errorDataLength: UInt = 0u,
    public var fRUId: Guid = Guid(),
    public var fRUText: UByteArray = UByteArray(20),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaGenericErrorDataEntryV1) return false
        if (this.sectionType != other.sectionType) return false
        if (this.errorSeverity != other.errorSeverity) return false
        if (this.revision != other.revision) return false
        if (this.validBits != other.validBits) return false
        if (this.flags != other.flags) return false
        if (this.errorDataLength != other.errorDataLength) return false
        if (this.fRUId != other.fRUId) return false
        if (!this.fRUText.contentEquals(other.fRUText)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionType.hashCode()
        result = 31 * result + this.errorSeverity.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.errorDataLength.hashCode()
        result = 31 * result + this.fRUId.hashCode()
        result = 31 * result + this.fRUText.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaGenericErrorDataEntryV2(
    public var sectionType: Guid = Guid(),
    public var errorSeverity: WheaErrorSeverity = 0,
    public var revision: WheaRevision = WheaRevision(),
    public var validBits: UByte = 0u,
    public var flags: UByte = 0u,
    public var errorDataLength: UInt = 0u,
    public var fRUId: Guid = Guid(),
    public var fRUText: UByteArray = UByteArray(20),
    public var timestamp: WheaTimestamp = WheaTimestamp(),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaGenericErrorDataEntryV2) return false
        if (this.sectionType != other.sectionType) return false
        if (this.errorSeverity != other.errorSeverity) return false
        if (this.revision != other.revision) return false
        if (this.validBits != other.validBits) return false
        if (this.flags != other.flags) return false
        if (this.errorDataLength != other.errorDataLength) return false
        if (this.fRUId != other.fRUId) return false
        if (!this.fRUText.contentEquals(other.fRUText)) return false
        if (this.timestamp != other.timestamp) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionType.hashCode()
        result = 31 * result + this.errorSeverity.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.validBits.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.errorDataLength.hashCode()
        result = 31 * result + this.fRUId.hashCode()
        result = 31 * result + this.fRUText.contentHashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WheaInUsePageNotifyFlags(
    public var bits: WheaInUsePageNotifyFlags0 = WheaInUsePageNotifyFlags0(),
    public var asUCHAR: UByte = 0u,
)

public data class WheaInUsePageNotifyFlags0(
    public var bitfield: UByte = 0u,
)

public data class WheaMemoryCorrectableErrorData(
    public var validBits: WheaMemoryCorrectableErrorSectionValidbits = WheaMemoryCorrectableErrorSectionValidbits(),
    public var socketId: UInt = 0u,
    public var channelId: UInt = 0u,
    public var dimmSlot: UInt = 0u,
    public var correctableErrorCount: UInt = 0u,
)

public data class WheaMemoryCorrectableErrorHeader(
    public var version: UShort = 0u,
    public var count: UShort = 0u,
)

public data class WheaMemoryCorrectableErrorSection(
    public var header: WheaMemoryCorrectableErrorHeader = WheaMemoryCorrectableErrorHeader(),
    public var data: List<WheaMemoryCorrectableErrorData> = List(1) { WheaMemoryCorrectableErrorData() },
)

public data class WheaMemoryCorrectableErrorSectionValidbits(
    public var anonymous: WheaMemoryCorrectableErrorSectionValidbits0 = WheaMemoryCorrectableErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaMemoryCorrectableErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public class WheaMemoryErrorSection(
    public var validBits: WheaMemoryErrorSectionValidbits = WheaMemoryErrorSectionValidbits(),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var physicalAddress: ULong = 0uL,
    public var physicalAddressMask: ULong = 0uL,
    public var node: UShort = 0u,
    public var card: UShort = 0u,
    public var module: UShort = 0u,
    public var bank: UShort = 0u,
    public var device: UShort = 0u,
    public var row: UShort = 0u,
    public var column: UShort = 0u,
    public var bitPosition: UShort = 0u,
    public var requesterId: ULong = 0uL,
    public var responderId: ULong = 0uL,
    public var targetId: ULong = 0uL,
    public var errorType: UByte = 0u,
    public var extended: UByte = 0u,
    public var rankNumber: UShort = 0u,
    public var cardHandle: UShort = 0u,
    public var moduleHandle: UShort = 0u,
)

public data class WheaMemoryErrorSectionValidbits(
    public var anonymous: WheaMemoryErrorSectionValidbits0 = WheaMemoryErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaMemoryErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaMemoryThrottleSummaryFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var status: Ntstatus = 0,
)

public data class WheaMsrDumpSection(
    public var msrDumpBuffer: UByte = 0u,
    public var msrDumpLength: UInt = 0u,
    public var msrDumpData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaMsrDumpSection) return false
        if (this.msrDumpBuffer != other.msrDumpBuffer) return false
        if (this.msrDumpLength != other.msrDumpLength) return false
        if (!this.msrDumpData.contentEquals(other.msrDumpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msrDumpBuffer.hashCode()
        result = 31 * result + this.msrDumpLength.hashCode()
        result = 31 * result + this.msrDumpData.contentHashCode()
        return result
    }
}

public data class WheaNmiErrorSection(
    public var data: UByteArray = UByteArray(8),
    public var flags: WheaNmiErrorSectionFlags = WheaNmiErrorSectionFlags(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaNmiErrorSection) return false
        if (!this.data.contentEquals(other.data)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class WheaNmiErrorSectionFlags(
    public var anonymous: WheaNmiErrorSectionFlags0 = WheaNmiErrorSectionFlags0(),
    public var asULONG: UInt = 0u,
)

public data class WheaNmiErrorSectionFlags0(
    public var bitfield: UInt = 0u,
)

public data class WheaOfflineDoneEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var address: ULong = 0uL,
)

public data class WheaPacketLogData(
    public var logData: UByteArray = UByteArray(36),
    public var extraBytes: UByteArray = UByteArray(36),
    public var bcParam3: Int = 0,
    public var bcParam4: Int = 0,
    public var logDataLength: UInt = 0u,
    public var logTag: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: WheaReportHwErrorDeviceDriverFlags = WheaReportHwErrorDeviceDriverFlags(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPacketLogData) return false
        if (!this.logData.contentEquals(other.logData)) return false
        if (!this.extraBytes.contentEquals(other.extraBytes)) return false
        if (this.bcParam3 != other.bcParam3) return false
        if (this.bcParam4 != other.bcParam4) return false
        if (this.logDataLength != other.logDataLength) return false
        if (this.logTag != other.logTag) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logData.contentHashCode()
        result = 31 * result + this.extraBytes.contentHashCode()
        result = 31 * result + this.bcParam3.hashCode()
        result = 31 * result + this.bcParam4.hashCode()
        result = 31 * result + this.logDataLength.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class WheaPciexpressBridgeControlStatus(
    public var anonymous: WheaPciexpressBridgeControlStatus0 = WheaPciexpressBridgeControlStatus0(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciexpressBridgeControlStatus0(
    public var bridgeSecondaryStatus: UShort = 0u,
    public var bridgeControl: UShort = 0u,
)

public data class WheaPciexpressCommandStatus(
    public var anonymous: WheaPciexpressCommandStatus0 = WheaPciexpressCommandStatus0(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciexpressCommandStatus0(
    public var command: UShort = 0u,
    public var status: UShort = 0u,
)

public data class WheaPciexpressDeviceId(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var bitfield3: UInt = 0u,
)

public data class WheaPciexpressErrorSection(
    public var validBits: WheaPciexpressErrorSectionValidbits = WheaPciexpressErrorSectionValidbits(),
    public var portType: WheaPciexpressDeviceType = 0,
    public var version: WheaPciexpressVersion = WheaPciexpressVersion(),
    public var commandStatus: WheaPciexpressCommandStatus = WheaPciexpressCommandStatus(),
    public var reserved: UInt = 0u,
    public var deviceId: WheaPciexpressDeviceId = WheaPciexpressDeviceId(),
    public var deviceSerialNumber: ULong = 0uL,
    public var bridgeControlStatus: WheaPciexpressBridgeControlStatus = WheaPciexpressBridgeControlStatus(),
    public var expressCapability: UByteArray = UByteArray(60),
    public var aerInfo: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPciexpressErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.portType != other.portType) return false
        if (this.version != other.version) return false
        if (this.commandStatus != other.commandStatus) return false
        if (this.reserved != other.reserved) return false
        if (this.deviceId != other.deviceId) return false
        if (this.deviceSerialNumber != other.deviceSerialNumber) return false
        if (this.bridgeControlStatus != other.bridgeControlStatus) return false
        if (!this.expressCapability.contentEquals(other.expressCapability)) return false
        if (!this.aerInfo.contentEquals(other.aerInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.portType.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.commandStatus.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.deviceId.hashCode()
        result = 31 * result + this.deviceSerialNumber.hashCode()
        result = 31 * result + this.bridgeControlStatus.hashCode()
        result = 31 * result + this.expressCapability.contentHashCode()
        result = 31 * result + this.aerInfo.contentHashCode()
        return result
    }
}

public data class WheaPciexpressErrorSectionValidbits(
    public var anonymous: WheaPciexpressErrorSectionValidbits0 = WheaPciexpressErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPciexpressErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPciexpressVersion(
    public var anonymous: WheaPciexpressVersion0 = WheaPciexpressVersion0(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciexpressVersion0(
    public var minorVersion: UByte = 0u,
    public var majorVersion: UByte = 0u,
    public var reserved: UShort = 0u,
)

public data class WheaPcieAddress(
    public var segment: UInt = 0u,
    public var bus: UInt = 0u,
    public var device: UInt = 0u,
    public var function: UInt = 0u,
)

public data class WheaPcieCorrectableErrorDevices(
    public var validBits: WheaPcieCorrectableErrorDevicesValidbits = WheaPcieCorrectableErrorDevicesValidbits(),
    public var address: WheaPcieAddress = WheaPcieAddress(),
    public var mask: UInt = 0u,
    public var correctableErrorCount: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPcieCorrectableErrorDevices) return false
        if (this.validBits != other.validBits) return false
        if (this.address != other.address) return false
        if (this.mask != other.mask) return false
        if (!this.correctableErrorCount.contentEquals(other.correctableErrorCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.correctableErrorCount.contentHashCode()
        return result
    }
}

public data class WheaPcieCorrectableErrorDevicesValidbits(
    public var anonymous: WheaPcieCorrectableErrorDevicesValidbits0 = WheaPcieCorrectableErrorDevicesValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPcieCorrectableErrorDevicesValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPcieCorrectableErrorSection(
    public var header: WheaPcieCorrectableErrorSectionHeader = WheaPcieCorrectableErrorSectionHeader(),
    public var devices: List<WheaPcieCorrectableErrorDevices> = List(1) { WheaPcieCorrectableErrorDevices() },
)

public data class WheaPcieCorrectableErrorSectionHeader(
    public var version: UShort = 0u,
    public var count: UShort = 0u,
)

public data class WheaPcixbusCommand(
    public var anonymous: WheaPcixbusCommand0 = WheaPcixbusCommand0(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaPcixbusCommand0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPcixbusErrorSection(
    public var validBits: WheaPcixbusErrorSectionValidbits = WheaPcixbusErrorSectionValidbits(),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var errorType: UShort = 0u,
    public var busId: WheaPcixbusId = WheaPcixbusId(),
    public var reserved: UInt = 0u,
    public var busAddress: ULong = 0uL,
    public var busData: ULong = 0uL,
    public var busCommand: WheaPcixbusCommand = WheaPcixbusCommand(),
    public var requesterId: ULong = 0uL,
    public var completerId: ULong = 0uL,
    public var targetId: ULong = 0uL,
)

public data class WheaPcixbusErrorSectionValidbits(
    public var anonymous: WheaPcixbusErrorSectionValidbits0 = WheaPcixbusErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPcixbusErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPcixbusId(
    public var anonymous: WheaPcixbusId0 = WheaPcixbusId0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaPcixbusId0(
    public var busNumber: UByte = 0u,
    public var busSegment: UByte = 0u,
)

public data class WheaPcixdeviceErrorSection(
    public var validBits: WheaPcixdeviceErrorSectionValidbits = WheaPcixdeviceErrorSectionValidbits(),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var idInfo: WheaPcixdeviceId = WheaPcixdeviceId(),
    public var memoryNumber: UInt = 0u,
    public var ioNumber: UInt = 0u,
    public var registerDataPairs: List<WheaPcixdeviceRegisterPair> = List(1) { WheaPcixdeviceRegisterPair() },
)

public data class WheaPcixdeviceErrorSectionValidbits(
    public var anonymous: WheaPcixdeviceErrorSectionValidbits0 = WheaPcixdeviceErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPcixdeviceErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPcixdeviceId(
    public var vendorId: UShort = 0u,
    public var deviceId: UShort = 0u,
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var reserved2: UInt = 0u,
)

public data class WheaPcixdeviceRegisterPair(
    public var register: ULong = 0uL,
    public var data: ULong = 0uL,
)

public data class WheaPciRecoverySection(
    public var signalType: UByte = 0u,
    public var recoveryAttempted: Boolean = false,
    public var recoveryStatus: UByte = 0u,
)

public data class WheaPersistenceInfo(
    public var anonymous: WheaPersistenceInfo0 = WheaPersistenceInfo0(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaPersistenceInfo0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPmemErrorSection(
    public var validBits: WheaPmemErrorSectionValidbits = WheaPmemErrorSectionValidbits(),
    public var locationInfo: UByteArray = UByteArray(64),
    public var errorStatus: WheaErrorStatus = WheaErrorStatus(),
    public var nFITHandle: UInt = 0u,
    public var pageRangeCount: UInt = 0u,
    public var pageRange: List<WheaPmemPageRange> = List(1) { WheaPmemPageRange() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPmemErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (!this.locationInfo.contentEquals(other.locationInfo)) return false
        if (this.errorStatus != other.errorStatus) return false
        if (this.nFITHandle != other.nFITHandle) return false
        if (this.pageRangeCount != other.pageRangeCount) return false
        if (this.pageRange != other.pageRange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.locationInfo.contentHashCode()
        result = 31 * result + this.errorStatus.hashCode()
        result = 31 * result + this.nFITHandle.hashCode()
        result = 31 * result + this.pageRangeCount.hashCode()
        result = 31 * result + this.pageRange.hashCode()
        return result
    }
}

public data class WheaPmemErrorSectionValidbits(
    public var anonymous: WheaPmemErrorSectionValidbits0 = WheaPmemErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaPmemErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPmemPageRange(
    public var startingPfn: ULong = 0uL,
    public var pageCount: ULong = 0uL,
    public var markedBadBitmap: ULong = 0uL,
)

public data class WheaProcessorFamilyInfo(
    public var anonymous: WheaProcessorFamilyInfo0 = WheaProcessorFamilyInfo0(),
    public var asULONGLONG: ULong = 0uL,
)

public data class WheaProcessorFamilyInfo0(
    public var bitfield: UInt = 0u,
    public var nativeModelId: UInt = 0u,
)

public data class WheaProcessorGenericErrorSection(
    public var validBits: WheaProcessorGenericErrorSectionValidbits = WheaProcessorGenericErrorSectionValidbits(),
    public var processorType: UByte = 0u,
    public var instructionSet: UByte = 0u,
    public var errorType: UByte = 0u,
    public var operation: UByte = 0u,
    public var flags: UByte = 0u,
    public var level: UByte = 0u,
    public var reserved: UShort = 0u,
    public var cPUVersion: ULong = 0uL,
    public var cPUBrandString: UByteArray = UByteArray(128),
    public var processorId: ULong = 0uL,
    public var targetAddress: ULong = 0uL,
    public var requesterId: ULong = 0uL,
    public var responderId: ULong = 0uL,
    public var instructionPointer: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaProcessorGenericErrorSection) return false
        if (this.validBits != other.validBits) return false
        if (this.processorType != other.processorType) return false
        if (this.instructionSet != other.instructionSet) return false
        if (this.errorType != other.errorType) return false
        if (this.operation != other.operation) return false
        if (this.flags != other.flags) return false
        if (this.level != other.level) return false
        if (this.reserved != other.reserved) return false
        if (this.cPUVersion != other.cPUVersion) return false
        if (!this.cPUBrandString.contentEquals(other.cPUBrandString)) return false
        if (this.processorId != other.processorId) return false
        if (this.targetAddress != other.targetAddress) return false
        if (this.requesterId != other.requesterId) return false
        if (this.responderId != other.responderId) return false
        if (this.instructionPointer != other.instructionPointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validBits.hashCode()
        result = 31 * result + this.processorType.hashCode()
        result = 31 * result + this.instructionSet.hashCode()
        result = 31 * result + this.errorType.hashCode()
        result = 31 * result + this.operation.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.cPUVersion.hashCode()
        result = 31 * result + this.cPUBrandString.contentHashCode()
        result = 31 * result + this.processorId.hashCode()
        result = 31 * result + this.targetAddress.hashCode()
        result = 31 * result + this.requesterId.hashCode()
        result = 31 * result + this.responderId.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        return result
    }
}

public data class WheaProcessorGenericErrorSectionValidbits(
    public var anonymous: WheaProcessorGenericErrorSectionValidbits0 = WheaProcessorGenericErrorSectionValidbits0(),
    public var validBits: ULong = 0uL,
)

public data class WheaProcessorGenericErrorSectionValidbits0(
    public var bitfield: ULong = 0uL,
)

public data class WheaPshedPiCpuBusesInitFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var status: Ntstatus = 0,
)

public data class WheaPshedPiTraceEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var buffer: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPiTraceEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class WheaPshedPluginCallbacks(
    public var getAllErrorSources: PshedPiGetAllErrorSources = null,
    public var reserved: COpaquePointer? = null,
    public var getErrorSourceInfo: PshedPiGetErrorSourceInfo = null,
    public var setErrorSourceInfo: PshedPiSetErrorSourceInfo = null,
    public var enableErrorSource: PshedPiEnableErrorSource = null,
    public var disableErrorSource: PshedPiDisableErrorSource = null,
    public var writeErrorRecord: PshedPiWriteErrorRecord = null,
    public var readErrorRecord: PshedPiReadErrorRecord = null,
    public var clearErrorRecord: PshedPiClearErrorRecord = null,
    public var retrieveErrorInfo: PshedPiRetrieveErrorInfo = null,
    public var finalizeErrorRecord: PshedPiFinalizeErrorRecord = null,
    public var clearErrorStatus: PshedPiClearErrorStatus = null,
    public var attemptRecovery: PshedPiAttemptErrorRecovery = null,
    public var getInjectionCapabilities: PshedPiGetInjectionCapabilities = null,
    public var injectError: PshedPiInjectError = null,
)

public data class WheaPshedPluginDimmMismatch(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var firmwareBank: UShort = 0u,
    public var firmwareCol: UShort = 0u,
    public var firmwareRow: UShort = 0u,
    public var retryRdBank: UShort = 0u,
    public var retryRdCol: UShort = 0u,
    public var retryRdRow: UShort = 0u,
    public var taBank: UShort = 0u,
    public var taCol: UShort = 0u,
    public var taRow: UShort = 0u,
)

public data class WheaPshedPluginEnableNotifyFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var enableError: WheaPshedPluginEnableNotifyErrors = 0,
)

public data class WheaPshedPluginHeartbeat(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
)

public data class WheaPshedPluginInitFailedEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var status: Ntstatus = 0,
)

public data class WheaPshedPluginLoadEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var pluginName: UShortArray = UShortArray(32),
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginLoadEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.pluginName.contentEquals(other.pluginName)) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.pluginName.contentHashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        return result
    }
}

public data class WheaPshedPluginPlatformSupportEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var pluginName: UShortArray = UShortArray(32),
    public var supported: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginPlatformSupportEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.pluginName.contentEquals(other.pluginName)) return false
        if (this.supported != other.supported) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.pluginName.contentHashCode()
        result = 31 * result + this.supported.hashCode()
        return result
    }
}

public data class WheaPshedPluginRegistrationPacketV1(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var context: COpaquePointer? = null,
    public var functionalAreaMask: UInt = 0u,
    public var reserved: UInt = 0u,
    public var callbacks: WheaPshedPluginCallbacks = WheaPshedPluginCallbacks(),
)

public data class WheaPshedPluginRegistrationPacketV2(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var context: COpaquePointer? = null,
    public var functionalAreaMask: UInt = 0u,
    public var reserved: UInt = 0u,
    public var callbacks: WheaPshedPluginCallbacks = WheaPshedPluginCallbacks(),
    public var pluginHandle: COpaquePointer? = null,
)

public data class WheaPshedPluginUnloadEvent(
    public var wheaEventLogEntry: WheaEventLogEntry = WheaEventLogEntry(),
    public var pluginName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaPshedPluginUnloadEvent) return false
        if (this.wheaEventLogEntry != other.wheaEventLogEntry) return false
        if (!this.pluginName.contentEquals(other.pluginName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wheaEventLogEntry.hashCode()
        result = 31 * result + this.pluginName.contentHashCode()
        return result
    }
}

public data class WheaRecoveryAction(
    public var anonymous: WheaRecoveryAction0 = WheaRecoveryAction0(),
    public var asULONG: UInt = 0u,
)

public data class WheaRecoveryAction0(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
)

public data class WheaRecoveryContext(
    public var anonymous: WheaRecoveryContext0 = WheaRecoveryContext0(),
    public var partitionId: ULong = 0uL,
    public var vpIndex: UInt = 0u,
    public var errorType: WheaRecoveryContextErrorType = 0,
)
