@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DispatcherHeader
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kdpc
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioRemoveLockTrackingBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.XstateConfiguration
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.NtProductType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber

public data class IoFoextSiloParameters00(public var bitfield: UInt = 0u)

public data class IoInterruptMessageInfo(
    public var unifiedIrql: UByte = 0u,
    public var messageCount: UInt = 0u,
    public var messageInfo: List<IoInterruptMessageInfoEntry> = List(1) { IoInterruptMessageInfoEntry() },
)

public data class IoInterruptMessageInfoEntry(
    public var messageAddress: Long = 0L,
    public var targetProcessorSet: Int = 0,
    public var interruptObject: Pkinterrupt = 0L,
    public var messageData: UInt = 0u,
    public var vector: UInt = 0u,
    public var irql: UByte = 0u,
    public var mode: KinterruptMode = 0,
    public var polarity: KinterruptPolarity = 0,
)

public data class IoRemoveLock(public var common: IoRemoveLockCommonBlock = IoRemoveLockCommonBlock())

public data class IoRemoveLockCommonBlock(
    public var removed: Boolean = false,
    public var reserved: BooleanArray = BooleanArray(3),
    public var ioCount: Int = 0,
    public var removeEvent: Kevent = Kevent(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoRemoveLockCommonBlock) return false
        if (this.removed != other.removed) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ioCount != other.ioCount) return false
        if (this.removeEvent != other.removeEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.removed.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ioCount.hashCode()
        result = 31 * result + this.removeEvent.hashCode()
        return result
    }
}

public data class IoRemoveLockDbgBlock(
    public var signature: Int = 0,
    public var highWatermark: UInt = 0u,
    public var maxLockedTicks: Long = 0L,
    public var allocateTag: Int = 0,
    public var lockList: ListEntry = ListEntry(),
    public var spin: Int = 0,
    public var lowMemoryCount: Int = 0,
    public var reserved1: UIntArray = UIntArray(4),
    public var reserved2: COpaquePointer? = null,
    public var blocks: PioRemoveLockTrackingBlock = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoRemoveLockDbgBlock) return false
        if (this.signature != other.signature) return false
        if (this.highWatermark != other.highWatermark) return false
        if (this.maxLockedTicks != other.maxLockedTicks) return false
        if (this.allocateTag != other.allocateTag) return false
        if (this.lockList != other.lockList) return false
        if (this.spin != other.spin) return false
        if (this.lowMemoryCount != other.lowMemoryCount) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.blocks != other.blocks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.highWatermark.hashCode()
        result = 31 * result + this.maxLockedTicks.hashCode()
        result = 31 * result + this.allocateTag.hashCode()
        result = 31 * result + this.lockList.hashCode()
        result = 31 * result + this.spin.hashCode()
        result = 31 * result + this.lowMemoryCount.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.blocks.hashCode()
        return result
    }
}

public data class IoReportInterruptActiveStateParameters(public var version: UInt = 0u, public var connectionContext: IoReportInterruptActiveStateParameters0 = IoReportInterruptActiveStateParameters0())

public data class IoReportInterruptActiveStateParameters0(
    public var generic: COpaquePointer? = null,
    public var interruptObject: Pkinterrupt = 0L,
    public var interruptMessageTable: IoInterruptMessageInfo? = null,
)

public data class IoResourceDescriptor(
    public var option: UByte = 0u,
    public var type: UByte = 0u,
    public var shareDisposition: UByte = 0u,
    public var spare1: UByte = 0u,
    public var flags: UShort = 0u,
    public var spare2: UShort = 0u,
    public var u: IoResourceDescriptor0 = IoResourceDescriptor0(),
)

public data class IoResourceDescriptor0(
    public var port: IoResourceDescriptor00 = IoResourceDescriptor00(),
    public var memory: IoResourceDescriptor01 = IoResourceDescriptor01(),
    public var interrupt: IoResourceDescriptor02 = IoResourceDescriptor02(),
    public var dma: IoResourceDescriptor03 = IoResourceDescriptor03(),
    public var dmaV3: IoResourceDescriptor04 = IoResourceDescriptor04(),
    public var generic: IoResourceDescriptor05 = IoResourceDescriptor05(),
    public var devicePrivate: IoResourceDescriptor06 = IoResourceDescriptor06(),
    public var busNumber: IoResourceDescriptor07 = IoResourceDescriptor07(),
    public var configData: IoResourceDescriptor08 = IoResourceDescriptor08(),
    public var memory40: IoResourceDescriptor09 = IoResourceDescriptor09(),
    public var memory48: IoResourceDescriptor010 = IoResourceDescriptor010(),
    public var memory64: IoResourceDescriptor011 = IoResourceDescriptor011(),
    public var connection: IoResourceDescriptor012 = IoResourceDescriptor012(),
)

public data class IoResourceDescriptor07(
    public var length: UInt = 0u,
    public var minBusNumber: UInt = 0u,
    public var maxBusNumber: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class IoResourceDescriptor08(
    public var priority: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
)

public data class IoResourceDescriptor012(
    public var cls: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var idLowPart: UInt = 0u,
    public var idHighPart: UInt = 0u,
)

public data class IoResourceDescriptor06(public var data: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoResourceDescriptor06) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.data.contentHashCode()
    }
}

public data class IoResourceDescriptor04(
    public var requestLine: UInt = 0u,
    public var reserved: UInt = 0u,
    public var channel: UInt = 0u,
    public var transferWidth: UInt = 0u,
)

public data class IoResourceDescriptor03(public var minimumChannel: UInt = 0u, public var maximumChannel: UInt = 0u)

public data class IoResourceDescriptor05(
    public var length: UInt = 0u,
    public var alignment: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
)

public data class IoResourceDescriptor02(
    public var minimumVector: UInt = 0u,
    public var maximumVector: UInt = 0u,
    public var affinityPolicy: IrqDevicePolicy = 0,
    public var priorityPolicy: IrqPriority = 0,
    public var targetedProcessors: Int = 0,
)

public data class IoResourceDescriptor09(
    public var length40: UInt = 0u,
    public var alignment40: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
)

public data class IoResourceDescriptor010(
    public var length48: UInt = 0u,
    public var alignment48: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
)

public data class IoResourceDescriptor011(
    public var length64: UInt = 0u,
    public var alignment64: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
)

public data class IoResourceDescriptor01(
    public var length: UInt = 0u,
    public var alignment: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
)

public data class IoResourceDescriptor00(
    public var length: UInt = 0u,
    public var alignment: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
)

public data class IoResourceList(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var count: UInt = 0u,
    public var descriptors: List<IoResourceDescriptor> = List(1) { IoResourceDescriptor() },
)

public data class IoResourceRequirementsList(
    public var listSize: UInt = 0u,
    public var interfaceType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
    public var slotNumber: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
    public var alternativeLists: UInt = 0u,
    public var list: List<IoResourceList> = List(1) { IoResourceList() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoResourceRequirementsList) return false
        if (this.listSize != other.listSize) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.busNumber != other.busNumber) return false
        if (this.slotNumber != other.slotNumber) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.alternativeLists != other.alternativeLists) return false
        if (this.list != other.list) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.listSize.hashCode()
        result = 31 * result + this.interfaceType.hashCode()
        result = 31 * result + this.busNumber.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.alternativeLists.hashCode()
        result = 31 * result + this.list.hashCode()
        return result
    }
}

public data class IoSessionConnectInfo(public var sessionId: UInt = 0u, public var localSession: Boolean = false)

public data class IoSessionStateInformation(
    public var sessionId: UInt = 0u,
    public var sessionState: IoSessionState = 0,
    public var localSession: Boolean = false,
)

public data class IoSessionStateNotification(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var ioObject: COpaquePointer? = null,
    public var eventMask: UInt = 0u,
    public var context: COpaquePointer? = null,
)

public data class IoStatusBlock32(public var status: Ntstatus = 0, public var information: UInt = 0u)

public data class IoStatusBlock64(public var anonymous: IoStatusBlock640 = IoStatusBlock640(), public var information: ULong = 0uL)

public data class IoStatusBlock640(public var status: Ntstatus = 0, public var pointer: COpaquePointer? = null)

public data class KaddressRange(public var address: COpaquePointer? = null, public var size: Int = 0)

public data class KaddressRangeDescriptor(public var addressRanges: KaddressRange? = null, public var addressRangeCount: Int = 0)

public data class Kapc(
    public var type: UByte = 0u,
    public var allFlags: UByte = 0u,
    public var size: UByte = 0u,
    public var spareByte1: UByte = 0u,
    public var spareLong0: UInt = 0u,
    public var thread: Int? = null,
    public var apcListEntry: ListEntry = ListEntry(),
    public var reserved: List<COpaquePointer> = List(3) { COpaquePointer(0L) },
    public var normalContext: COpaquePointer? = null,
    public var systemArgument1: COpaquePointer? = null,
    public var systemArgument2: COpaquePointer? = null,
    public var apcStateIndex: Byte = 0,
    public var apcMode: Byte = 0,
    public var inserted: Boolean = false,
)

public data class KbugcheckAddPages(
    public var context: COpaquePointer? = null,
    public var flags: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var address: Int = 0,
    public var count: Int = 0,
)

public data class KbugcheckCallbackRecord(
    public var entry: ListEntry = ListEntry(),
    public var callbackRoutine: PkbugcheckCallbackRoutine = null,
    public var buffer: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var component: COpaquePointer? = null,
    public var checksum: Int = 0,
    public var state: UByte = 0u,
)

public data class KbugcheckDumpIo(
    public var offset: ULong = 0uL,
    public var buffer: COpaquePointer? = null,
    public var bufferLength: UInt = 0u,
    public var type: KbugcheckDumpIoType = 0,
)

public data class KbugcheckReasonCallbackRecord(
    public var entry: ListEntry = ListEntry(),
    public var callbackRoutine: PkbugcheckReasonCallbackRoutine = null,
    public var component: COpaquePointer? = null,
    public var checksum: Int = 0,
    public var reason: KbugcheckCallbackReason = 0,
    public var state: UByte = 0u,
)

public data class KbugcheckRemovePages(
    public var context: COpaquePointer? = null,
    public var flags: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var address: Int = 0,
    public var count: Int = 0,
)

public data class KbugcheckSecondaryDumpData(
    public var inBuffer: COpaquePointer? = null,
    public var inBufferLength: UInt = 0u,
    public var maximumAllowed: UInt = 0u,
    public var guid: Guid = Guid(),
    public var outBuffer: COpaquePointer? = null,
    public var outBufferLength: UInt = 0u,
)

public data class KbugcheckSecondaryDumpDataEx(
    public var inBuffer: COpaquePointer? = null,
    public var inBufferLength: UInt = 0u,
    public var maximumAllowed: UInt = 0u,
    public var guid: Guid = Guid(),
    public var outBuffer: COpaquePointer? = null,
    public var outBufferLength: UInt = 0u,
    public var context: COpaquePointer? = null,
    public var flags: UInt = 0u,
    public var dumpType: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var bugCheckParameter1: Int = 0,
    public var bugCheckParameter2: Int = 0,
    public var bugCheckParameter3: Int = 0,
    public var bugCheckParameter4: Int = 0,
)

public data class KbugcheckTriageDumpData(
    public var dataArray: KtriageDumpDataArray? = null,
    public var flags: UInt = 0u,
    public var maxVirtMemSize: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var bugCheckParameter1: Int = 0,
    public var bugCheckParameter2: Int = 0,
    public var bugCheckParameter3: Int = 0,
    public var bugCheckParameter4: Int = 0,
)

public data class KdeviceQueueEntry(
    public var deviceListEntry: ListEntry = ListEntry(),
    public var sortKey: UInt = 0u,
    public var inserted: Boolean = false,
)

public data class KdpcWatchdogInformation(
    public var dpcTimeLimit: UInt = 0u,
    public var dpcTimeCount: UInt = 0u,
    public var dpcWatchdogLimit: UInt = 0u,
    public var dpcWatchdogCount: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class KernelSoftRestartNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
)

public data class KernelUserTimes(
    public var createTime: Long = 0L,
    public var exitTime: Long = 0L,
    public var kernelTime: Long = 0L,
    public var userTime: Long = 0L,
)

public data class KeyBasicInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyBasicInformation) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastWriteTime.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KeyCachedInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var subKeys: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var values: UInt = 0u,
    public var maxValueNameLen: UInt = 0u,
    public var maxValueDataLen: UInt = 0u,
    public var nameLength: UInt = 0u,
)

public data class KeyControlFlagsInformation(public var controlFlags: UInt = 0u)

public data class KeyFullInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var classOffset: UInt = 0u,
    public var classLength: UInt = 0u,
    public var subKeys: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var maxClassLen: UInt = 0u,
    public var values: UInt = 0u,
    public var maxValueNameLen: UInt = 0u,
    public var maxValueDataLen: UInt = 0u,
    public var cls: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyFullInformation) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.classOffset != other.classOffset) return false
        if (this.classLength != other.classLength) return false
        if (this.subKeys != other.subKeys) return false
        if (this.maxNameLen != other.maxNameLen) return false
        if (this.maxClassLen != other.maxClassLen) return false
        if (this.values != other.values) return false
        if (this.maxValueNameLen != other.maxValueNameLen) return false
        if (this.maxValueDataLen != other.maxValueDataLen) return false
        if (!this.cls.contentEquals(other.cls)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastWriteTime.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.classOffset.hashCode()
        result = 31 * result + this.classLength.hashCode()
        result = 31 * result + this.subKeys.hashCode()
        result = 31 * result + this.maxNameLen.hashCode()
        result = 31 * result + this.maxClassLen.hashCode()
        result = 31 * result + this.values.hashCode()
        result = 31 * result + this.maxValueNameLen.hashCode()
        result = 31 * result + this.maxValueDataLen.hashCode()
        result = 31 * result + this.cls.contentHashCode()
        return result
    }
}

public data class KeyLayerInformation(public var bitfield: UInt = 0u)

public data class KeyNameInformation(public var nameLength: UInt = 0u, public var name: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyNameInformation) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KeyNodeInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var classOffset: UInt = 0u,
    public var classLength: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyNodeInformation) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.classOffset != other.classOffset) return false
        if (this.classLength != other.classLength) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastWriteTime.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.classOffset.hashCode()
        result = 31 * result + this.classLength.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KeySetVirtualizationInformation(public var bitfield: UInt = 0u)

public data class KeyTrustInformation(public var bitfield: UInt = 0u)

public data class KeyValueBasicInformation(
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValueBasicInformation) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KeyValueFullInformation(
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValueFullInformation) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataLength != other.dataLength) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }
}

public data class KeyValueLayerInformation(public var bitfield: UInt = 0u)

public data class KeyValuePartialInformation(
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValuePartialInformation) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class KeyValuePartialInformationAlign64(
    public var type: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValuePartialInformationAlign64) return false
        if (this.type != other.type) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class KeyVirtualizationInformation(public var bitfield: UInt = 0u)

public data class KeyWow64FlagsInformation(public var userFlags: UInt = 0u)

public data class KeyWriteTimeInformation(public var lastWriteTime: Long = 0L)

public data class KeProcessorChangeNotifyContext(
    public var state: KeProcessorChangeNotifyState = 0,
    public var ntNumber: UInt = 0u,
    public var status: Ntstatus = 0,
    public var procNumber: ProcessorNumber = ProcessorNumber(),
)

public data class KfloatingSave(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var spare0: UInt = 0u,
    public var spare1: UInt = 0u,
)

public data class Kgate(public var header: DispatcherHeader = DispatcherHeader())

public data class KlockQueueHandle(public var lockQueue: KspinLockQueue = KspinLockQueue(), public var oldIrql: UByte = 0u)

public data class Ksemaphore(public var header: DispatcherHeader = DispatcherHeader(), public var limit: Int = 0)

public data class KspinLockQueue(public var next: KspinLockQueue? = null, public var lock: Int? = null)

public data class KsystemTime(
    public var lowPart: UInt = 0u,
    public var high1Time: Int = 0,
    public var high2Time: Int = 0,
)

public data class Ktimer(
    public var header: DispatcherHeader = DispatcherHeader(),
    public var dueTime: ULong = 0uL,
    public var timerListEntry: ListEntry = ListEntry(),
    public var dpc: Kdpc? = null,
    public var period: UInt = 0u,
)

public data class KtriageDumpDataArray(
    public var list: ListEntry = ListEntry(),
    public var numBlocksUsed: UInt = 0u,
    public var numBlocksTotal: UInt = 0u,
    public var dataSize: UInt = 0u,
    public var maxDataSize: UInt = 0u,
    public var componentNameBufferLength: UInt = 0u,
    public var componentName: COpaquePointer? = null,
    public var blocks: List<KaddressRange> = List(1) { KaddressRange() },
)

public class KuserSharedData {
    public var tickCountLowDeprecated: UInt = 0u

    public var tickCountMultiplier: UInt = 0u

    public var interruptTime: KsystemTime = KsystemTime()

    public var systemTime: KsystemTime = KsystemTime()

    public var timeZoneBias: KsystemTime = KsystemTime()

    public var imageNumberLow: UShort = 0u

    public var imageNumberHigh: UShort = 0u

    public var ntSystemRoot: UShortArray = UShortArray(260)

    public var maxStackTraceDepth: UInt = 0u

    public var cryptoExponent: UInt = 0u

    public var timeZoneId: UInt = 0u

    public var largePageMinimum: UInt = 0u

    public var aitSamplingValue: UInt = 0u

    public var appCompatFlag: UInt = 0u

    public var rNGSeedVersion: ULong = 0uL

    public var globalValidationRunlevel: UInt = 0u

    public var timeZoneBiasStamp: Int = 0

    public var ntBuildNumber: UInt = 0u

    public var ntProductType: NtProductType = 0

    public var productTypeIsValid: Boolean = false

    public var reserved0: BooleanArray = BooleanArray(1)

    public var nativeProcessorArchitecture: UShort = 0u

    public var ntMajorVersion: UInt = 0u

    public var ntMinorVersion: UInt = 0u

    public var processorFeatures: BooleanArray = BooleanArray(64)

    public var reserved1: UInt = 0u

    public var reserved3: UInt = 0u

    public var timeSlip: UInt = 0u

    public var alternativeArchitecture: AlternativeArchitectureType = 0

    public var bootId: UInt = 0u

    public var systemExpirationDate: Long = 0L

    public var suiteMask: UInt = 0u

    public var kdDebuggerEnabled: Boolean = false

    public var anonymous1: KuserSharedData0 = KuserSharedData0()

    public var cyclesPerYield: UShort = 0u

    public var activeConsoleId: UInt = 0u

    public var dismountCount: UInt = 0u

    public var comPlusPackage: UInt = 0u

    public var lastSystemRITEventTickCount: UInt = 0u

    public var numberOfPhysicalPages: UInt = 0u

    public var safeBootMode: Boolean = false

    public var anonymous2: KuserSharedData1 = KuserSharedData1()

    public var reserved12: UByteArray = UByteArray(2)

    public var anonymous3: KuserSharedData2 = KuserSharedData2()

    public var dataFlagsPad: UIntArray = UIntArray(1)

    public var testRetInstruction: ULong = 0uL

    public var qpcFrequency: Long = 0L

    public var systemCall: UInt = 0u

    public var reserved2: UInt = 0u

    public var systemCallPad: ULongArray = ULongArray(2)

    public var anonymous4: KuserSharedData3 = KuserSharedData3()

    public var cookie: UInt = 0u

    public var cookiePad: UIntArray = UIntArray(1)

    public var consoleSessionForegroundProcessId: Long = 0L

    public var timeUpdateLock: ULong = 0uL

    public var baselineSystemTimeQpc: ULong = 0uL

    public var baselineInterruptTimeQpc: ULong = 0uL

    public var qpcSystemTimeIncrement: ULong = 0uL

    public var qpcInterruptTimeIncrement: ULong = 0uL

    public var qpcSystemTimeIncrementShift: UByte = 0u

    public var qpcInterruptTimeIncrementShift: UByte = 0u

    public var unparkedProcessorCount: UShort = 0u

    public var enclaveFeatureMask: UIntArray = UIntArray(4)

    public var telemetryCoverageRound: UInt = 0u

    public var userModeGlobalLogger: UShortArray = UShortArray(16)

    public var imageFileExecutionOptions: UInt = 0u

    public var langGenerationCount: UInt = 0u

    public var reserved4: ULong = 0uL

    public var interruptTimeBias: ULong = 0uL

    public var qpcBias: ULong = 0uL

    public var activeProcessorCount: UInt = 0u

    public var activeGroupCount: UByte = 0u

    public var reserved9: UByte = 0u

    public var anonymous5: KuserSharedData4 = KuserSharedData4()

    public var timeZoneBiasEffectiveStart: Long = 0L

    public var timeZoneBiasEffectiveEnd: Long = 0L

    public var xState: XstateConfiguration = XstateConfiguration()

    public var featureConfigurationChangeStamp: KsystemTime = KsystemTime()

    public var spare: UInt = 0u

    public var userPointerAuthMask: ULong = 0uL
}

public data class KuserSharedData0(public var mitigationPolicies: UByte = 0u, public var anonymous: KuserSharedData00 = KuserSharedData00())

public data class KuserSharedData00(public var bitfield: UByte = 0u)

public data class KuserSharedData1(public var virtualizationFlags: UByte = 0u)

public data class KuserSharedData2(public var sharedDataFlags: UInt = 0u, public var anonymous: KuserSharedData20 = KuserSharedData20())

public data class KuserSharedData20(public var bitfield: UInt = 0u)

public data class KuserSharedData3(
    public var tickCount: KsystemTime = KsystemTime(),
    public var tickCountQuad: ULong = 0uL,
    public var anonymous: KuserSharedData30 = KuserSharedData30(),
)

public data class KuserSharedData30(public var reservedTickCountOverlay: UIntArray = UIntArray(3), public var tickCountPad: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KuserSharedData30) return false
        if (!this.reservedTickCountOverlay.contentEquals(other.reservedTickCountOverlay)) return false
        if (!this.tickCountPad.contentEquals(other.tickCountPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedTickCountOverlay.contentHashCode()
        result = 31 * result + this.tickCountPad.contentHashCode()
        return result
    }
}

public data class KuserSharedData4(public var qpcData: UShort = 0u, public var anonymous: KuserSharedData40 = KuserSharedData40())

public data class KuserSharedData40(public var qpcBypassEnabled: UByte = 0u, public var qpcShift: UByte = 0u)

public data class KwaitChain(public var head: COpaquePointer? = null)

public data class LegacyBusInformation(
    public var busTypeGuid: Guid = Guid(),
    public var legacyBusType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
)

public data class LinkShareAccess(
    public var openCount: UInt = 0u,
    public var deleters: UInt = 0u,
    public var sharedDelete: UInt = 0u,
)

public data class LoaderPartitionInformationEx(
    public var partitionStyle: UInt = 0u,
    public var partitionNumber: UInt = 0u,
    public var anonymous: LoaderPartitionInformationEx0 = LoaderPartitionInformationEx0(),
    public var flags: UInt = 0u,
)

public data class LoaderPartitionInformationEx0(public var signature: UInt = 0u, public var deviceId: Guid = Guid())

public data class MailslotCreateParameters(
    public var mailslotQuota: UInt = 0u,
    public var maximumMessageSize: UInt = 0u,
    public var readTimeout: Long = 0L,
    public var timeoutSpecified: Boolean = false,
)

public data class MapRegisterEntry(public var mapRegister: COpaquePointer? = null, public var writeToDevice: Boolean = false)

public data class McaDriverInfo(
    public var exceptionCallback: Int = 0,
    public var dpcCallback: PkdeferredRoutine = null,
    public var deviceContext: COpaquePointer? = null,
)

public data class McaException(
    public var versionNumber: UInt = 0u,
    public var exceptionType: McaExceptionType = 0,
    public var timeStamp: Long = 0L,
    public var processorNumber: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var u: McaException0 = McaException0(),
    public var extCnt: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var extReg: ULongArray = ULongArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McaException) return false
        if (this.versionNumber != other.versionNumber) return false
        if (this.exceptionType != other.exceptionType) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.processorNumber != other.processorNumber) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.u != other.u) return false
        if (this.extCnt != other.extCnt) return false
        if (this.reserved3 != other.reserved3) return false
        if (!this.extReg.contentEquals(other.extReg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.versionNumber.hashCode()
        result = 31 * result + this.exceptionType.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.processorNumber.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.extCnt.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.extReg.contentHashCode()
        return result
    }
}

public data class McaException0(public var mca: McaException00 = McaException00(), public var mce: McaException01 = McaException01())

public data class McaException00(
    public var bankNumber: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
    public var status: MciStats = MciStats(),
    public var address: MciAddr = MciAddr(),
    public var misc: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McaException00) return false
        if (this.bankNumber != other.bankNumber) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.status != other.status) return false
        if (this.address != other.address) return false
        if (this.misc != other.misc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bankNumber.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.misc.hashCode()
        return result
    }
}

public data class McaException01(public var address: ULong = 0uL, public var type: ULong = 0uL)

public data class McgCap(public var anonymous: McgCap0 = McgCap0(), public var quadPart: ULong = 0uL)

public data class McgCap0(public var bitfield: ULong = 0uL)

public data class McgStatus(public var anonymous: McgStatus0 = McgStatus0(), public var quadPart: ULong = 0uL)

public data class McgStatus0(public var bitfield: UInt = 0u, public var reserved2: UInt = 0u)

public data class MciAddr(public var anonymous: MciAddr0 = MciAddr0(), public var quadPart: ULong = 0uL)

public data class MciAddr0(public var address: UInt = 0u, public var reserved: UInt = 0u)

public data class MciStats(public var mciStats: MciStats0 = MciStats0(), public var quadPart: ULong = 0uL)

public data class MciStats0(
    public var mcaCod: UShort = 0u,
    public var msCod: UShort = 0u,
    public var bitfield: UInt = 0u,
)

public data class MciStatus(
    public var commonBits: MciStatusBitsCommon = MciStatusBitsCommon(),
    public var amdBits: MciStatusAmdBits = MciStatusAmdBits(),
    public var intelBits: MciStatusIntelBits = MciStatusIntelBits(),
    public var quadPart: ULong = 0uL,
)

public data class MciStatusAmdBits(public var bitfield: ULong = 0uL)

public data class MciStatusBitsCommon(public var bitfield: ULong = 0uL)

public data class MciStatusIntelBits(public var bitfield: ULong = 0uL)

public data class MemoryPartitionDedicatedMemoryOpenInformation(
    public var dedicatedMemoryTypeId: ULong = 0uL,
    public var handleAttributes: UInt = 0u,
    public var desiredAccess: UInt = 0u,
    public var dedicatedMemoryPartitionHandle: Handle = null,
)

public data class MmCopyAddress(public var anonymous: MmCopyAddress0 = MmCopyAddress0())

public data class MmCopyAddress0(public var virtualAddress: COpaquePointer? = null, public var physicalAddress: Long = 0L)

public data class MmPhysicalAddressList(public var physicalAddress: Long = 0L, public var numberOfBytes: Int = 0)

public data class MuTelemetrySection(
    public var componentID: Guid = Guid(),
    public var subComponentID: Guid = Guid(),
    public var reserved: UInt = 0u,
    public var errorStatusValue: UInt = 0u,
    public var additionalInfo1: ULong = 0uL,
    public var additionalInfo2: ULong = 0uL,
)

public data class NamedPipeCreateParameters(
    public var namedPipeType: UInt = 0u,
    public var readMode: UInt = 0u,
    public var completionMode: UInt = 0u,
    public var maximumInstances: UInt = 0u,
    public var inboundQuota: UInt = 0u,
    public var outboundQuota: UInt = 0u,
    public var defaultTimeout: Long = 0L,
    public var timeoutSpecified: Boolean = false,
)

public data class NpemCapabilityStandard(public var anonymous: NpemCapabilityStandard0 = NpemCapabilityStandard0(), public var asULONG: UInt = 0u)

public data class NpemCapabilityStandard0(public var bitfield: UInt = 0u)

public data class NpemControlInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setNpemSupportState: PnpemControlEnableDisable = null,
    public var queryStandardCapabilities: PnpemControlQueryStandardCapabilities = null,
    public var setStandardControl: PnpemControlSetStandardControl = null,
    public var queryNpemControl: PnpemControlQueryControl = null,
)

public data class NtTib32(
    public var exceptionList: UInt = 0u,
    public var stackBase: UInt = 0u,
    public var stackLimit: UInt = 0u,
    public var subSystemTib: UInt = 0u,
    public var anonymous: NtTib320 = NtTib320(),
    public var arbitraryUserPointer: UInt = 0u,
    public var self: UInt = 0u,
)

public data class NtTib320(public var fiberData: UInt = 0u, public var version: UInt = 0u)

public data class ObjectHandleInformation(public var handleAttributes: UInt = 0u, public var grantedAccess: UInt = 0u)

public data class ObCallbackRegistration(
    public var version: UShort = 0u,
    public var operationRegistrationCount: UShort = 0u,
    public var altitude: UnicodeString = UnicodeString(),
    public var registrationContext: COpaquePointer? = null,
    public var operationRegistration: ObOperationRegistration? = null,
)

public data class ObOperationRegistration(
    public var objectType: PobjectType? = null,
    public var operations: UInt = 0u,
    public var preOperation: PobPreOperationCallback = null,
    public var postOperation: PobPostOperationCallback = null,
)

public data class ObPostCreateHandleInformation(public var grantedAccess: UInt = 0u)

public data class ObPostDuplicateHandleInformation(public var grantedAccess: UInt = 0u)

public data class ObPostOperationInformation(
    public var operation: UInt = 0u,
    public var anonymous: ObPostOperationInformation0 = ObPostOperationInformation0(),
    public var obj: COpaquePointer? = null,
    public var objectType: PobjectType = 0L,
    public var callContext: COpaquePointer? = null,
    public var returnStatus: Ntstatus = 0,
    public var parameters: ObPostOperationParameters? = null,
)

public data class ObPostOperationInformation0(public var flags: UInt = 0u, public var anonymous: ObPostOperationInformation00 = ObPostOperationInformation00())

public data class ObPostOperationInformation00(public var bitfield: UInt = 0u)

public data class ObPostOperationParameters(public var createHandleInformation: ObPostCreateHandleInformation = ObPostCreateHandleInformation(), public var duplicateHandleInformation: ObPostDuplicateHandleInformation = ObPostDuplicateHandleInformation())

public data class ObPreCreateHandleInformation(public var desiredAccess: UInt = 0u, public var originalDesiredAccess: UInt = 0u)

public data class ObPreDuplicateHandleInformation(
    public var desiredAccess: UInt = 0u,
    public var originalDesiredAccess: UInt = 0u,
    public var sourceProcess: COpaquePointer? = null,
    public var targetProcess: COpaquePointer? = null,
)

public data class ObPreOperationInformation(
    public var operation: UInt = 0u,
    public var anonymous: ObPreOperationInformation0 = ObPreOperationInformation0(),
    public var obj: COpaquePointer? = null,
    public var objectType: PobjectType = 0L,
    public var callContext: COpaquePointer? = null,
    public var parameters: ObPreOperationParameters? = null,
)

public data class ObPreOperationInformation0(public var flags: UInt = 0u, public var anonymous: ObPreOperationInformation00 = ObPreOperationInformation00())

public data class ObPreOperationInformation00(public var bitfield: UInt = 0u)

public data class ObPreOperationParameters(public var createHandleInformation: ObPreCreateHandleInformation = ObPreCreateHandleInformation(), public var duplicateHandleInformation: ObPreDuplicateHandleInformation = ObPreDuplicateHandleInformation())

public data class PagePriorityInformation(public var pagePriority: UInt = 0u)

public data class Pcibusdata(
    public var tag: UInt = 0u,
    public var version: UInt = 0u,
    public var readConfig: PciReadWriteConfig = null,
    public var writeConfig: PciReadWriteConfig = null,
    public var pin2Line: PciPin2Line = null,
    public var line2Pin: PciLine2Pin = null,
    public var parentSlot: PciSlotNumber = PciSlotNumber(),
    public var reserved: List<COpaquePointer> = List(4) { COpaquePointer(0L) },
)

public data class PcixBridgeCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var secondaryStatus: PcixBridgeCapability0 = PcixBridgeCapability0(),
    public var bridgeStatus: PcixBridgeCapability1 = PcixBridgeCapability1(),
    public var upstreamSplitTransactionCapacity: UShort = 0u,
    public var upstreamSplitTransactionLimit: UShort = 0u,
    public var downstreamSplitTransactionCapacity: UShort = 0u,
    public var downstreamSplitTransactionLimit: UShort = 0u,
    public var eccControlStatus: PcixBridgeCapability2 = PcixBridgeCapability2(),
    public var eccFirstAddress: UInt = 0u,
    public var eccSecondAddress: UInt = 0u,
    public var eccAttribute: UInt = 0u,
)

public data class PcixBridgeCapability1(public var anonymous: PcixBridgeCapability10 = PcixBridgeCapability10(), public var asULONG: UInt = 0u)

public data class PcixBridgeCapability10(public var bitfield: UInt = 0u)

public data class PcixBridgeCapability2(public var anonymous: PcixBridgeCapability20 = PcixBridgeCapability20(), public var asULONG: UInt = 0u)

public data class PcixBridgeCapability20(public var bitfield: UInt = 0u)

public data class PcixBridgeCapability0(public var anonymous: PcixBridgeCapability00 = PcixBridgeCapability00(), public var asUSHORT: UShort = 0u)

public data class PcixBridgeCapability00(public var bitfield: UShort = 0u)

public data class PciAdvancedFeaturesCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var length: UByte = 0u,
    public var capabilities: PciAdvancedFeaturesCapability0 = PciAdvancedFeaturesCapability0(),
    public var control: PciAdvancedFeaturesCapability1 = PciAdvancedFeaturesCapability1(),
    public var status: PciAdvancedFeaturesCapability2 = PciAdvancedFeaturesCapability2(),
)

public data class PciAdvancedFeaturesCapability0(public var anonymous: PciAdvancedFeaturesCapability00 = PciAdvancedFeaturesCapability00(), public var asUCHAR: UByte = 0u)

public data class PciAdvancedFeaturesCapability00(public var bitfield: UByte = 0u)

public data class PciAdvancedFeaturesCapability1(public var anonymous: PciAdvancedFeaturesCapability10 = PciAdvancedFeaturesCapability10(), public var asUCHAR: UByte = 0u)

public data class PciAdvancedFeaturesCapability10(public var bitfield: UByte = 0u)

public data class PciAdvancedFeaturesCapability2(public var anonymous: PciAdvancedFeaturesCapability20 = PciAdvancedFeaturesCapability20(), public var asUCHAR: UByte = 0u)

public data class PciAdvancedFeaturesCapability20(public var bitfield: UByte = 0u)

public data class PciAgpAperturePageSize(public var bitfield: UShort = 0u)

public data class PciAgpCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var bitfield: UShort = 0u,
    public var aGPStatus: PciAgpCapability0 = PciAgpCapability0(),
    public var aGPCommand: PciAgpCapability1 = PciAgpCapability1(),
)

public data class PciAgpCapability1(public var bitfield: UInt = 0u)

public data class PciAgpCapability0(public var bitfield: UInt = 0u)

public data class PciAgpControl(public var bitfield: UInt = 0u)

public data class PciAgpExtendedCapability(
    public var isochStatus: PciAgpIsochStatus = PciAgpIsochStatus(),
    public var agpControl: PciAgpControl = PciAgpControl(),
    public var apertureSize: UShort = 0u,
    public var aperturePageSize: PciAgpAperturePageSize = PciAgpAperturePageSize(),
    public var gartLow: UInt = 0u,
    public var gartHigh: UInt = 0u,
    public var isochCommand: PciAgpIsochCommand = PciAgpIsochCommand(),
)

public data class PciAgpIsochCommand(public var bitfield: UShort = 0u)

public data class PciAgpIsochStatus(public var bitfield: UInt = 0u)

public data class PciAtsInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var setAddressTranslationServices: PpciSetAts = null,
    public var invalidateQueueDepth: UByte = 0u,
)

public data class PciBusInterfaceStandard(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var readConfig: PpciReadWriteConfig = null,
    public var writeConfig: PpciReadWriteConfig = null,
    public var pinToLine: PpciPinToLine = null,
    public var lineToPin: PpciLineToPin = null,
    public var rootBusCapability: PpciRootBusCapability = null,
    public var expressWakeControl: PpciExpressWakeControl = null,
    public var prepareMultistageResume: PpciPrepareMultistageResume = null,
)

public data class PciCapabilitiesHeader(public var capabilityID: UByte = 0u, public var next: UByte = 0u)

public data class PciCommonConfig(public var base: PciCommonHeader = PciCommonHeader(), public var deviceSpecific: UByteArray = UByteArray(192)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciCommonConfig) return false
        if (this.base != other.base) return false
        if (!this.deviceSpecific.contentEquals(other.deviceSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.deviceSpecific.contentHashCode()
        return result
    }
}

public data class PciCommonHeader(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var command: UShort = 0u,
    public var status: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var progIf: UByte = 0u,
    public var subClass: UByte = 0u,
    public var baseClass: UByte = 0u,
    public var cacheLineSize: UByte = 0u,
    public var latencyTimer: UByte = 0u,
    public var headerType: UByte = 0u,
    public var bist: UByte = 0u,
    public var u: PciCommonHeader0 = PciCommonHeader0(),
)

public data class PciCommonHeader0(
    public var type0: PciCommonHeader00 = PciCommonHeader00(),
    public var type1: PciCommonHeader01 = PciCommonHeader01(),
    public var type2: PciCommonHeader02 = PciCommonHeader02(),
)

public data class PciCommonHeader00(
    public var baseAddresses: UIntArray = UIntArray(6),
    public var cis: UInt = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
    public var rOMBaseAddress: UInt = 0u,
    public var capabilitiesPtr: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var reserved2: UInt = 0u,
    public var interruptLine: UByte = 0u,
    public var interruptPin: UByte = 0u,
    public var minimumGrant: UByte = 0u,
    public var maximumLatency: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciCommonHeader00) return false
        if (!this.baseAddresses.contentEquals(other.baseAddresses)) return false
        if (this.cis != other.cis) return false
        if (this.subVendorID != other.subVendorID) return false
        if (this.subSystemID != other.subSystemID) return false
        if (this.rOMBaseAddress != other.rOMBaseAddress) return false
        if (this.capabilitiesPtr != other.capabilitiesPtr) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.interruptLine != other.interruptLine) return false
        if (this.interruptPin != other.interruptPin) return false
        if (this.minimumGrant != other.minimumGrant) return false
        if (this.maximumLatency != other.maximumLatency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.baseAddresses.contentHashCode()
        result = 31 * result + this.cis.hashCode()
        result = 31 * result + this.subVendorID.hashCode()
        result = 31 * result + this.subSystemID.hashCode()
        result = 31 * result + this.rOMBaseAddress.hashCode()
        result = 31 * result + this.capabilitiesPtr.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.interruptLine.hashCode()
        result = 31 * result + this.interruptPin.hashCode()
        result = 31 * result + this.minimumGrant.hashCode()
        result = 31 * result + this.maximumLatency.hashCode()
        return result
    }
}

public class PciCommonHeader01(
    public var baseAddresses: UIntArray = UIntArray(2),
    public var primaryBus: UByte = 0u,
    public var secondaryBus: UByte = 0u,
    public var subordinateBus: UByte = 0u,
    public var secondaryLatency: UByte = 0u,
    public var iOBase: UByte = 0u,
    public var iOLimit: UByte = 0u,
    public var secondaryStatus: UShort = 0u,
    public var memoryBase: UShort = 0u,
    public var memoryLimit: UShort = 0u,
    public var prefetchBase: UShort = 0u,
    public var prefetchLimit: UShort = 0u,
    public var prefetchBaseUpper32: UInt = 0u,
    public var prefetchLimitUpper32: UInt = 0u,
    public var iOBaseUpper16: UShort = 0u,
    public var iOLimitUpper16: UShort = 0u,
    public var capabilitiesPtr: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var rOMBaseAddress: UInt = 0u,
    public var interruptLine: UByte = 0u,
    public var interruptPin: UByte = 0u,
    public var bridgeControl: UShort = 0u,
)

public data class PciCommonHeader02(
    public var socketRegistersBaseAddress: UInt = 0u,
    public var capabilitiesPtr: UByte = 0u,
    public var reserved: UByte = 0u,
    public var secondaryStatus: UShort = 0u,
    public var primaryBus: UByte = 0u,
    public var secondaryBus: UByte = 0u,
    public var subordinateBus: UByte = 0u,
    public var secondaryLatency: UByte = 0u,
    public var range: List<PciCommonHeader020> = List(4) { PciCommonHeader020() },
    public var interruptLine: UByte = 0u,
    public var interruptPin: UByte = 0u,
    public var bridgeControl: UShort = 0u,
)

public data class PciCommonHeader020(public var base: UInt = 0u, public var limit: UInt = 0u)

public data class PciDebuggingDeviceInUse(
    public var segment: UShort = 0u,
    public var bus: UInt = 0u,
    public var slot: UInt = 0u,
)

public data class PciDevicePresenceParameters(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
    public var baseClass: UByte = 0u,
    public var subClass: UByte = 0u,
    public var progIf: UByte = 0u,
)

public data class PciDevicePresentInterface(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var context: COpaquePointer? = null,
    public var interfaceReference: PinterfaceReference = null,
    public var interfaceDereference: PinterfaceDereference = null,
    public var isDevicePresent: PpciIsDevicePresent = null,
    public var isDevicePresentEx: PpciIsDevicePresentEx = null,
)

public data class PciExpressAcsCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressAcsCapabilityRegister = PciExpressAcsCapabilityRegister(),
    public var control: PciExpressAcsControl = PciExpressAcsControl(),
    public var egressControl: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressAcsCapability) return false
        if (this.header != other.header) return false
        if (this.capability != other.capability) return false
        if (this.control != other.control) return false
        if (!this.egressControl.contentEquals(other.egressControl)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.capability.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.egressControl.contentHashCode()
        return result
    }
}

public data class PciExpressAcsCapabilityRegister(public var anonymous: PciExpressAcsCapabilityRegister0 = PciExpressAcsCapabilityRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressAcsCapabilityRegister0(public var bitfield: UShort = 0u)

public data class PciExpressAcsControl(public var anonymous: PciExpressAcsControl0 = PciExpressAcsControl0(), public var asUSHORT: UShort = 0u)

public data class PciExpressAcsControl0(public var bitfield: UShort = 0u)

public data class PciExpressAerCapabilities(public var anonymous: PciExpressAerCapabilities0 = PciExpressAerCapabilities0(), public var asULONG: UInt = 0u)

public data class PciExpressAerCapabilities0(public var bitfield: UInt = 0u)

public data class PciExpressAerCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var uncorrectableErrorStatus: PciExpressUncorrectableErrorStatus = PciExpressUncorrectableErrorStatus(),
    public var uncorrectableErrorMask: PciExpressUncorrectableErrorMask = PciExpressUncorrectableErrorMask(),
    public var uncorrectableErrorSeverity: PciExpressUncorrectableErrorSeverity = PciExpressUncorrectableErrorSeverity(),
    public var correctableErrorStatus: PciExpressCorrectableErrorStatus = PciExpressCorrectableErrorStatus(),
    public var correctableErrorMask: PciExpressCorrectableErrorMask = PciExpressCorrectableErrorMask(),
    public var capabilitiesAndControl: PciExpressAerCapabilities = PciExpressAerCapabilities(),
    public var headerLog: UIntArray = UIntArray(4),
    public var secUncorrectableErrorStatus: PciExpressSecUncorrectableErrorStatus = PciExpressSecUncorrectableErrorStatus(),
    public var secUncorrectableErrorMask: PciExpressSecUncorrectableErrorMask = PciExpressSecUncorrectableErrorMask(),
    public var secUncorrectableErrorSeverity: PciExpressSecUncorrectableErrorSeverity = PciExpressSecUncorrectableErrorSeverity(),
    public var secCapabilitiesAndControl: PciExpressSecAerCapabilities = PciExpressSecAerCapabilities(),
    public var secHeaderLog: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressAerCapability) return false
        if (this.header != other.header) return false
        if (this.uncorrectableErrorStatus != other.uncorrectableErrorStatus) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorStatus != other.correctableErrorStatus) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capabilitiesAndControl != other.capabilitiesAndControl) return false
        if (!this.headerLog.contentEquals(other.headerLog)) return false
        if (this.secUncorrectableErrorStatus != other.secUncorrectableErrorStatus) return false
        if (this.secUncorrectableErrorMask != other.secUncorrectableErrorMask) return false
        if (this.secUncorrectableErrorSeverity != other.secUncorrectableErrorSeverity) return false
        if (this.secCapabilitiesAndControl != other.secCapabilitiesAndControl) return false
        if (!this.secHeaderLog.contentEquals(other.secHeaderLog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uncorrectableErrorStatus.hashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorStatus.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capabilitiesAndControl.hashCode()
        result = 31 * result + this.headerLog.contentHashCode()
        result = 31 * result + this.secUncorrectableErrorStatus.hashCode()
        result = 31 * result + this.secUncorrectableErrorMask.hashCode()
        result = 31 * result + this.secUncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.secCapabilitiesAndControl.hashCode()
        result = 31 * result + this.secHeaderLog.contentHashCode()
        return result
    }
}

public data class PciExpressAriCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressAriCapabilityRegister = PciExpressAriCapabilityRegister(),
    public var control: PciExpressAriControlRegister = PciExpressAriControlRegister(),
)

public data class PciExpressAriCapabilityRegister(public var bitfield: UShort = 0u)

public data class PciExpressAriControlRegister(public var bitfield: UShort = 0u)

public data class PciExpressAtsCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressAtsCapabilityRegister = PciExpressAtsCapabilityRegister(),
    public var control: PciExpressAtsControlRegister = PciExpressAtsControlRegister(),
)

public data class PciExpressAtsCapabilityRegister(public var bitfield: UShort = 0u)

public data class PciExpressAtsControlRegister(public var anonymous: PciExpressAtsControlRegister0 = PciExpressAtsControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressAtsControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressBridgeAerCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var uncorrectableErrorStatus: PciExpressUncorrectableErrorStatus = PciExpressUncorrectableErrorStatus(),
    public var uncorrectableErrorMask: PciExpressUncorrectableErrorMask = PciExpressUncorrectableErrorMask(),
    public var uncorrectableErrorSeverity: PciExpressUncorrectableErrorSeverity = PciExpressUncorrectableErrorSeverity(),
    public var correctableErrorStatus: PciExpressCorrectableErrorStatus = PciExpressCorrectableErrorStatus(),
    public var correctableErrorMask: PciExpressCorrectableErrorMask = PciExpressCorrectableErrorMask(),
    public var capabilitiesAndControl: PciExpressAerCapabilities = PciExpressAerCapabilities(),
    public var headerLog: UIntArray = UIntArray(4),
    public var secUncorrectableErrorStatus: PciExpressSecUncorrectableErrorStatus = PciExpressSecUncorrectableErrorStatus(),
    public var secUncorrectableErrorMask: PciExpressSecUncorrectableErrorMask = PciExpressSecUncorrectableErrorMask(),
    public var secUncorrectableErrorSeverity: PciExpressSecUncorrectableErrorSeverity = PciExpressSecUncorrectableErrorSeverity(),
    public var secCapabilitiesAndControl: PciExpressSecAerCapabilities = PciExpressSecAerCapabilities(),
    public var secHeaderLog: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressBridgeAerCapability) return false
        if (this.header != other.header) return false
        if (this.uncorrectableErrorStatus != other.uncorrectableErrorStatus) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorStatus != other.correctableErrorStatus) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capabilitiesAndControl != other.capabilitiesAndControl) return false
        if (!this.headerLog.contentEquals(other.headerLog)) return false
        if (this.secUncorrectableErrorStatus != other.secUncorrectableErrorStatus) return false
        if (this.secUncorrectableErrorMask != other.secUncorrectableErrorMask) return false
        if (this.secUncorrectableErrorSeverity != other.secUncorrectableErrorSeverity) return false
        if (this.secCapabilitiesAndControl != other.secCapabilitiesAndControl) return false
        if (!this.secHeaderLog.contentEquals(other.secHeaderLog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uncorrectableErrorStatus.hashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorStatus.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capabilitiesAndControl.hashCode()
        result = 31 * result + this.headerLog.contentHashCode()
        result = 31 * result + this.secUncorrectableErrorStatus.hashCode()
        result = 31 * result + this.secUncorrectableErrorMask.hashCode()
        result = 31 * result + this.secUncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.secCapabilitiesAndControl.hashCode()
        result = 31 * result + this.secHeaderLog.contentHashCode()
        return result
    }
}

public data class PciExpressCapabilitiesRegister(public var anonymous: PciExpressCapabilitiesRegister0 = PciExpressCapabilitiesRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressCapabilitiesRegister0(public var bitfield: UShort = 0u)

public class PciExpressCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var expressCapabilities: PciExpressCapabilitiesRegister = PciExpressCapabilitiesRegister(),
    public var deviceCapabilities: PciExpressDeviceCapabilitiesRegister = PciExpressDeviceCapabilitiesRegister(),
    public var deviceControl: PciExpressDeviceControlRegister = PciExpressDeviceControlRegister(),
    public var deviceStatus: PciExpressDeviceStatusRegister = PciExpressDeviceStatusRegister(),
    public var linkCapabilities: PciExpressLinkCapabilitiesRegister = PciExpressLinkCapabilitiesRegister(),
    public var linkControl: PciExpressLinkControlRegister = PciExpressLinkControlRegister(),
    public var linkStatus: PciExpressLinkStatusRegister = PciExpressLinkStatusRegister(),
    public var slotCapabilities: PciExpressSlotCapabilitiesRegister = PciExpressSlotCapabilitiesRegister(),
    public var slotControl: PciExpressSlotControlRegister = PciExpressSlotControlRegister(),
    public var slotStatus: PciExpressSlotStatusRegister = PciExpressSlotStatusRegister(),
    public var rootControl: PciExpressRootControlRegister = PciExpressRootControlRegister(),
    public var rootCapabilities: PciExpressRootCapabilitiesRegister = PciExpressRootCapabilitiesRegister(),
    public var rootStatus: PciExpressRootStatusRegister = PciExpressRootStatusRegister(),
    public var deviceCapabilities2: PciExpressDeviceCapabilities2Register = PciExpressDeviceCapabilities2Register(),
    public var deviceControl2: PciExpressDeviceControl2Register = PciExpressDeviceControl2Register(),
    public var deviceStatus2: PciExpressDeviceStatus2Register = PciExpressDeviceStatus2Register(),
    public var linkCapabilities2: PciExpressLinkCapabilities2Register = PciExpressLinkCapabilities2Register(),
    public var linkControl2: PciExpressLinkControl2Register = PciExpressLinkControl2Register(),
    public var linkStatus2: PciExpressLinkStatus2Register = PciExpressLinkStatus2Register(),
)

public data class PciExpressCorrectableErrorMask(public var anonymous: PciExpressCorrectableErrorMask0 = PciExpressCorrectableErrorMask0(), public var asULONG: UInt = 0u)

public data class PciExpressCorrectableErrorMask0(public var bitfield: UInt = 0u)

public data class PciExpressCorrectableErrorStatus(public var anonymous: PciExpressCorrectableErrorStatus0 = PciExpressCorrectableErrorStatus0(), public var asULONG: UInt = 0u)

public data class PciExpressCorrectableErrorStatus0(public var bitfield: UInt = 0u)

public data class PciExpressCxlDvsecCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dvsecHeader1: PciExpressDesignatedVendorSpecificHeader1 = PciExpressDesignatedVendorSpecificHeader1(),
    public var dvsecHeader2: PciExpressDesignatedVendorSpecificHeader2 = PciExpressDesignatedVendorSpecificHeader2(),
    public var reserved: UByteArray = UByteArray(46),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressCxlDvsecCapability) return false
        if (this.header != other.header) return false
        if (this.dvsecHeader1 != other.dvsecHeader1) return false
        if (this.dvsecHeader2 != other.dvsecHeader2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dvsecHeader1.hashCode()
        result = 31 * result + this.dvsecHeader2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PciExpressCxlDvsecCapabilityRegisterV11(public var anonymous: PciExpressCxlDvsecCapabilityRegisterV110 = PciExpressCxlDvsecCapabilityRegisterV110(), public var asUSHORT: UShort = 0u)

public data class PciExpressCxlDvsecCapabilityRegisterV110(public var bitfield: UShort = 0u)

public class PciExpressCxlDvsecCapabilityV11(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dvsecHeader1: PciExpressDesignatedVendorSpecificHeader1 = PciExpressDesignatedVendorSpecificHeader1(),
    public var dvsecHeader2: PciExpressDesignatedVendorSpecificHeader2 = PciExpressDesignatedVendorSpecificHeader2(),
    public var capability: PciExpressCxlDvsecCapabilityRegisterV11 = PciExpressCxlDvsecCapabilityRegisterV11(),
    public var control: PciExpressCxlDvsecControlRegister = PciExpressCxlDvsecControlRegister(),
    public var status: PciExpressCxlDvsecStatusRegister = PciExpressCxlDvsecStatusRegister(),
    public var control2: UShort = 0u,
    public var status2: UShort = 0u,
    public var lock: PciExpressCxlDvsecLockRegister = PciExpressCxlDvsecLockRegister(),
    public var reserved: UShort = 0u,
    public var range1SizeHigh: PciExpressCxlDvsecRangeSizeHighRegister = PciExpressCxlDvsecRangeSizeHighRegister(),
    public var range1SizeLow: PciExpressCxlDvsecRangeSizeLowRegisterV11 = PciExpressCxlDvsecRangeSizeLowRegisterV11(),
    public var range1BaseHigh: PciExpressCxlDvsecRangeBaseHighRegister = PciExpressCxlDvsecRangeBaseHighRegister(),
    public var range1BaseLow: PciExpressCxlDvsecRangeBaseLowRegister = PciExpressCxlDvsecRangeBaseLowRegister(),
    public var range2SizeHigh: PciExpressCxlDvsecRangeSizeHighRegister = PciExpressCxlDvsecRangeSizeHighRegister(),
    public var range2SizeLow: PciExpressCxlDvsecRangeSizeLowRegisterV11 = PciExpressCxlDvsecRangeSizeLowRegisterV11(),
    public var range2BaseHigh: PciExpressCxlDvsecRangeBaseHighRegister = PciExpressCxlDvsecRangeBaseHighRegister(),
    public var range2BaseLow: PciExpressCxlDvsecRangeBaseLowRegister = PciExpressCxlDvsecRangeBaseLowRegister(),
)

public data class PciExpressCxlDvsecControlRegister(public var anonymous: PciExpressCxlDvsecControlRegister0 = PciExpressCxlDvsecControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressCxlDvsecControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressCxlDvsecLockRegister(public var anonymous: PciExpressCxlDvsecLockRegister0 = PciExpressCxlDvsecLockRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressCxlDvsecLockRegister0(public var bitfield: UShort = 0u)

public data class PciExpressCxlDvsecRangeBaseHighRegister(public var memBaseHigh: UInt = 0u)

public data class PciExpressCxlDvsecRangeBaseLowRegister(public var anonymous: PciExpressCxlDvsecRangeBaseLowRegister0 = PciExpressCxlDvsecRangeBaseLowRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressCxlDvsecRangeBaseLowRegister0(public var bitfield: UInt = 0u)

public data class PciExpressCxlDvsecRangeSizeHighRegister(public var memSizeHigh: UInt = 0u)

public data class PciExpressCxlDvsecRangeSizeLowRegisterV11(public var anonymous: PciExpressCxlDvsecRangeSizeLowRegisterV110 = PciExpressCxlDvsecRangeSizeLowRegisterV110(), public var asULONG: UInt = 0u)

public data class PciExpressCxlDvsecRangeSizeLowRegisterV110(public var bitfield: UInt = 0u)

public data class PciExpressCxlDvsecStatusRegister(public var anonymous: PciExpressCxlDvsecStatusRegister0 = PciExpressCxlDvsecStatusRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressCxlDvsecStatusRegister0(public var bitfield: UShort = 0u)

public data class PciExpressDesignatedVendorSpecificCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dvsecHeader1: PciExpressDesignatedVendorSpecificHeader1 = PciExpressDesignatedVendorSpecificHeader1(),
    public var dvsecHeader2: PciExpressDesignatedVendorSpecificHeader2 = PciExpressDesignatedVendorSpecificHeader2(),
    public var dvsecRegisters: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressDesignatedVendorSpecificCapability) return false
        if (this.header != other.header) return false
        if (this.dvsecHeader1 != other.dvsecHeader1) return false
        if (this.dvsecHeader2 != other.dvsecHeader2) return false
        if (!this.dvsecRegisters.contentEquals(other.dvsecRegisters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dvsecHeader1.hashCode()
        result = 31 * result + this.dvsecHeader2.hashCode()
        result = 31 * result + this.dvsecRegisters.contentHashCode()
        return result
    }
}

public data class PciExpressDesignatedVendorSpecificHeader1(public var anonymous: PciExpressDesignatedVendorSpecificHeader10 = PciExpressDesignatedVendorSpecificHeader10(), public var asULONG: UInt = 0u)

public data class PciExpressDesignatedVendorSpecificHeader10(public var bitfield: UInt = 0u)

public data class PciExpressDesignatedVendorSpecificHeader2(public var anonymous: PciExpressDesignatedVendorSpecificHeader20 = PciExpressDesignatedVendorSpecificHeader20(), public var asUSHORT: UShort = 0u)

public data class PciExpressDesignatedVendorSpecificHeader20(public var bitfield: UShort = 0u)

public data class PciExpressDeviceCapabilities2Register(public var anonymous: PciExpressDeviceCapabilities2Register0 = PciExpressDeviceCapabilities2Register0(), public var asULONG: UInt = 0u)

public data class PciExpressDeviceCapabilities2Register0(public var bitfield: UInt = 0u)

public data class PciExpressDeviceCapabilitiesRegister(public var anonymous: PciExpressDeviceCapabilitiesRegister0 = PciExpressDeviceCapabilitiesRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressDeviceCapabilitiesRegister0(public var bitfield: UInt = 0u)

public data class PciExpressDeviceControl2Register(public var anonymous: PciExpressDeviceControl2Register0 = PciExpressDeviceControl2Register0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDeviceControl2Register0(public var bitfield: UShort = 0u)

public data class PciExpressDeviceControlRegister(
    public var anonymous1: PciExpressDeviceControlRegister0 = PciExpressDeviceControlRegister0(),
    public var anonymous2: PciExpressDeviceControlRegister1 = PciExpressDeviceControlRegister1(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDeviceControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressDeviceControlRegister1(public var bitfield: UShort = 0u)

public data class PciExpressDeviceStatus2Register(public var anonymous: PciExpressDeviceStatus2Register0 = PciExpressDeviceStatus2Register0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDeviceStatus2Register0(public var bitfield: UShort = 0u)

public data class PciExpressDeviceStatusRegister(public var anonymous: PciExpressDeviceStatusRegister0 = PciExpressDeviceStatusRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDeviceStatusRegister0(public var bitfield: UShort = 0u)

public data class PciExpressDpcCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dpcCapabilities: PciExpressDpcCapsRegister = PciExpressDpcCapsRegister(),
    public var dpcControl: PciExpressDpcControlRegister = PciExpressDpcControlRegister(),
    public var dpcStatus: PciExpressDpcStatusRegister = PciExpressDpcStatusRegister(),
    public var dpcErrSrcId: PciExpressDpcErrorSourceId = PciExpressDpcErrorSourceId(),
    public var rpPioStatus: PciExpressDpcRpPioStatusRegister = PciExpressDpcRpPioStatusRegister(),
    public var rpPioMask: PciExpressDpcRpPioMaskRegister = PciExpressDpcRpPioMaskRegister(),
    public var rpPioSeverity: PciExpressDpcRpPioSeverityRegister = PciExpressDpcRpPioSeverityRegister(),
    public var rpPioSysError: PciExpressDpcRpPioSyserrRegister = PciExpressDpcRpPioSyserrRegister(),
    public var rpPioException: PciExpressDpcRpPioExceptionRegister = PciExpressDpcRpPioExceptionRegister(),
    public var rpPioHeaderLog: PciExpressDpcRpPioHeaderlogRegister = PciExpressDpcRpPioHeaderlogRegister(),
    public var rpPioImpSpecLog: PciExpressDpcRpPioImpspeclogRegister = PciExpressDpcRpPioImpspeclogRegister(),
    public var rpPioPrefixLog: PciExpressDpcRpPioTlpprefixlogRegister = PciExpressDpcRpPioTlpprefixlogRegister(),
)

public data class PciExpressDpcCapsRegister(public var anonymous: PciExpressDpcCapsRegister0 = PciExpressDpcCapsRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDpcCapsRegister0(public var bitfield: UShort = 0u)

public data class PciExpressDpcControlRegister(public var anonymous: PciExpressDpcControlRegister0 = PciExpressDpcControlRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDpcControlRegister0(public var bitfield: UShort = 0u)

public data class PciExpressDpcErrorSourceId(public var anonymous: PciExpressDpcErrorSourceId0 = PciExpressDpcErrorSourceId0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDpcErrorSourceId0(public var bitfield: UShort = 0u)

public data class PciExpressDpcRpPioExceptionRegister(public var anonymous: PciExpressDpcRpPioExceptionRegister0 = PciExpressDpcRpPioExceptionRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressDpcRpPioExceptionRegister0(public var bitfield: UInt = 0u)

public data class PciExpressDpcRpPioHeaderlogRegister(public var pioHeaderLogRegister: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressDpcRpPioHeaderlogRegister) return false
        if (!this.pioHeaderLogRegister.contentEquals(other.pioHeaderLogRegister)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.pioHeaderLogRegister.contentHashCode()
    }
}

public data class PciExpressDpcRpPioImpspeclogRegister(public var pioImpSpecLog: UInt = 0u)

public data class PciExpressDpcRpPioMaskRegister(public var anonymous: PciExpressDpcRpPioMaskRegister0 = PciExpressDpcRpPioMaskRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressDpcRpPioMaskRegister0(public var bitfield: UInt = 0u)

public data class PciExpressDpcRpPioSeverityRegister(public var anonymous: PciExpressDpcRpPioSeverityRegister0 = PciExpressDpcRpPioSeverityRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressDpcRpPioSeverityRegister0(public var bitfield: UInt = 0u)

public data class PciExpressDpcRpPioStatusRegister(public var anonymous: PciExpressDpcRpPioStatusRegister0 = PciExpressDpcRpPioStatusRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressDpcRpPioStatusRegister0(public var bitfield: UInt = 0u)

public data class PciExpressDpcRpPioSyserrRegister(public var anonymous: PciExpressDpcRpPioSyserrRegister0 = PciExpressDpcRpPioSyserrRegister0(), public var asULONG: UInt = 0u)

public data class PciExpressDpcRpPioSyserrRegister0(public var bitfield: UInt = 0u)

public data class PciExpressDpcRpPioTlpprefixlogRegister(public var pioTlpPrefixLogRegister: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressDpcRpPioTlpprefixlogRegister) return false
        if (!this.pioTlpPrefixLogRegister.contentEquals(other.pioTlpPrefixLogRegister)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.pioTlpPrefixLogRegister.contentHashCode()
    }
}

public data class PciExpressDpcStatusRegister(public var anonymous: PciExpressDpcStatusRegister0 = PciExpressDpcStatusRegister0(), public var asUSHORT: UShort = 0u)

public data class PciExpressDpcStatusRegister0(public var bitfield: UShort = 0u)

public data class PciExpressEnhancedCapabilityHeader(public var capabilityID: UShort = 0u, public var bitfield: UShort = 0u)

public data class PciExpressErrorSourceId(public var anonymous: PciExpressErrorSourceId0 = PciExpressErrorSourceId0(), public var asULONG: UInt = 0u)
