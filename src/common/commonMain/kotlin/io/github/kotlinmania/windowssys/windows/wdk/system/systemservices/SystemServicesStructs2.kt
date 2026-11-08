@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DISPATCHER_HEADER
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KEVENT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PIO_REMOVE_LOCK_TRACKING_BLOCK
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKDEFERRED_ROUTINE
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PKINTERRUPT
import io.github.kotlinmania.windowssys.windows.wdk.foundation.POBJECT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.XSTATE_CONFIGURATION
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.NT_PRODUCT_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.PROCESSOR_NUMBER

public data class IO_FOEXT_SILO_PARAMETERS_0_0(public var _bitfield: UInt = 0u)

public data class IO_INTERRUPT_MESSAGE_INFO(
    public var UnifiedIrql: UByte = 0u,
    public var MessageCount: UInt = 0u,
    public var MessageInfo: List<IO_INTERRUPT_MESSAGE_INFO_ENTRY> = List(1) { IO_INTERRUPT_MESSAGE_INFO_ENTRY() },
)

public data class IO_INTERRUPT_MESSAGE_INFO_ENTRY(
    public var MessageAddress: Long = 0L,
    public var TargetProcessorSet: ULong = 0uL,
    public var InterruptObject: PKINTERRUPT = 0L,
    public var MessageData: UInt = 0u,
    public var Vector: UInt = 0u,
    public var Irql: UByte = 0u,
    public var Mode: KINTERRUPT_MODE = 0,
    public var Polarity: KINTERRUPT_POLARITY = 0,
)

public data class IO_REMOVE_LOCK(public var Common: IO_REMOVE_LOCK_COMMON_BLOCK = IO_REMOVE_LOCK_COMMON_BLOCK())

public data class IO_REMOVE_LOCK_COMMON_BLOCK(
    public var Removed: Boolean = false,
    public var Reserved: BooleanArray = BooleanArray(3),
    public var IoCount: Int = 0,
    public var RemoveEvent: KEVENT = KEVENT(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IO_REMOVE_LOCK_COMMON_BLOCK) return false
        if (this.Removed != other.Removed) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.IoCount != other.IoCount) return false
        if (this.RemoveEvent != other.RemoveEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Removed.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.IoCount.hashCode()
        result = 31 * result + this.RemoveEvent.hashCode()
        return result
    }
}

public data class IO_REMOVE_LOCK_DBG_BLOCK(
    public var Signature: Int = 0,
    public var HighWatermark: UInt = 0u,
    public var MaxLockedTicks: Long = 0L,
    public var AllocateTag: Int = 0,
    public var LockList: LIST_ENTRY = LIST_ENTRY(),
    public var Spin: ULong = 0uL,
    public var LowMemoryCount: Int = 0,
    public var Reserved1: UIntArray = UIntArray(4),
    public var Reserved2: Long = 0L,
    public var Blocks: PIO_REMOVE_LOCK_TRACKING_BLOCK = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IO_REMOVE_LOCK_DBG_BLOCK) return false
        if (this.Signature != other.Signature) return false
        if (this.HighWatermark != other.HighWatermark) return false
        if (this.MaxLockedTicks != other.MaxLockedTicks) return false
        if (this.AllocateTag != other.AllocateTag) return false
        if (this.LockList != other.LockList) return false
        if (this.Spin != other.Spin) return false
        if (this.LowMemoryCount != other.LowMemoryCount) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.Blocks != other.Blocks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.hashCode()
        result = 31 * result + this.HighWatermark.hashCode()
        result = 31 * result + this.MaxLockedTicks.hashCode()
        result = 31 * result + this.AllocateTag.hashCode()
        result = 31 * result + this.LockList.hashCode()
        result = 31 * result + this.Spin.hashCode()
        result = 31 * result + this.LowMemoryCount.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.Blocks.hashCode()
        return result
    }
}

public data class IO_REPORT_INTERRUPT_ACTIVE_STATE_PARAMETERS(public var Version: UInt = 0u, public var ConnectionContext: IO_REPORT_INTERRUPT_ACTIVE_STATE_PARAMETERS_0 = IO_REPORT_INTERRUPT_ACTIVE_STATE_PARAMETERS_0())

public data class IO_REPORT_INTERRUPT_ACTIVE_STATE_PARAMETERS_0(
    public var Generic: Long = 0L,
    public var InterruptObject: PKINTERRUPT = 0L,
    public var InterruptMessageTable: Long = 0L,
)

public data class IO_RESOURCE_DESCRIPTOR(
    public var Option: UByte = 0u,
    public var Type: UByte = 0u,
    public var ShareDisposition: UByte = 0u,
    public var Spare1: UByte = 0u,
    public var Flags: UShort = 0u,
    public var Spare2: UShort = 0u,
    public var u: IO_RESOURCE_DESCRIPTOR_0 = IO_RESOURCE_DESCRIPTOR_0(),
)

public data class IO_RESOURCE_DESCRIPTOR_0(
    public var Port: IO_RESOURCE_DESCRIPTOR_0_0 = IO_RESOURCE_DESCRIPTOR_0_0(),
    public var Memory: IO_RESOURCE_DESCRIPTOR_0_1 = IO_RESOURCE_DESCRIPTOR_0_1(),
    public var Interrupt: IO_RESOURCE_DESCRIPTOR_0_2 = IO_RESOURCE_DESCRIPTOR_0_2(),
    public var Dma: IO_RESOURCE_DESCRIPTOR_0_3 = IO_RESOURCE_DESCRIPTOR_0_3(),
    public var DmaV3: IO_RESOURCE_DESCRIPTOR_0_4 = IO_RESOURCE_DESCRIPTOR_0_4(),
    public var Generic: IO_RESOURCE_DESCRIPTOR_0_5 = IO_RESOURCE_DESCRIPTOR_0_5(),
    public var DevicePrivate: IO_RESOURCE_DESCRIPTOR_0_6 = IO_RESOURCE_DESCRIPTOR_0_6(),
    public var BusNumber: IO_RESOURCE_DESCRIPTOR_0_7 = IO_RESOURCE_DESCRIPTOR_0_7(),
    public var ConfigData: IO_RESOURCE_DESCRIPTOR_0_8 = IO_RESOURCE_DESCRIPTOR_0_8(),
    public var Memory40: IO_RESOURCE_DESCRIPTOR_0_9 = IO_RESOURCE_DESCRIPTOR_0_9(),
    public var Memory48: IO_RESOURCE_DESCRIPTOR_0_10 = IO_RESOURCE_DESCRIPTOR_0_10(),
    public var Memory64: IO_RESOURCE_DESCRIPTOR_0_11 = IO_RESOURCE_DESCRIPTOR_0_11(),
    public var Connection: IO_RESOURCE_DESCRIPTOR_0_12 = IO_RESOURCE_DESCRIPTOR_0_12(),
)

public data class IO_RESOURCE_DESCRIPTOR_0_7(
    public var Length: UInt = 0u,
    public var MinBusNumber: UInt = 0u,
    public var MaxBusNumber: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class IO_RESOURCE_DESCRIPTOR_0_8(
    public var Priority: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
)

public data class IO_RESOURCE_DESCRIPTOR_0_12(
    public var Class: UByte = 0u,
    public var Type: UByte = 0u,
    public var Reserved1: UByte = 0u,
    public var Reserved2: UByte = 0u,
    public var IdLowPart: UInt = 0u,
    public var IdHighPart: UInt = 0u,
)

public data class IO_RESOURCE_DESCRIPTOR_0_6(public var Data: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IO_RESOURCE_DESCRIPTOR_0_6) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Data.contentHashCode()
    }
}

public data class IO_RESOURCE_DESCRIPTOR_0_4(
    public var RequestLine: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Channel: UInt = 0u,
    public var TransferWidth: UInt = 0u,
)

public data class IO_RESOURCE_DESCRIPTOR_0_3(public var MinimumChannel: UInt = 0u, public var MaximumChannel: UInt = 0u)

public data class IO_RESOURCE_DESCRIPTOR_0_5(
    public var Length: UInt = 0u,
    public var Alignment: UInt = 0u,
    public var MinimumAddress: Long = 0L,
    public var MaximumAddress: Long = 0L,
)

public data class IO_RESOURCE_DESCRIPTOR_0_2(
    public var MinimumVector: UInt = 0u,
    public var MaximumVector: UInt = 0u,
    public var AffinityPolicy: IRQ_DEVICE_POLICY = 0,
    public var PriorityPolicy: IRQ_PRIORITY = 0,
    public var TargetedProcessors: ULong = 0uL,
)

public data class IO_RESOURCE_DESCRIPTOR_0_9(
    public var Length40: UInt = 0u,
    public var Alignment40: UInt = 0u,
    public var MinimumAddress: Long = 0L,
    public var MaximumAddress: Long = 0L,
)

public data class IO_RESOURCE_DESCRIPTOR_0_10(
    public var Length48: UInt = 0u,
    public var Alignment48: UInt = 0u,
    public var MinimumAddress: Long = 0L,
    public var MaximumAddress: Long = 0L,
)

public data class IO_RESOURCE_DESCRIPTOR_0_11(
    public var Length64: UInt = 0u,
    public var Alignment64: UInt = 0u,
    public var MinimumAddress: Long = 0L,
    public var MaximumAddress: Long = 0L,
)

public data class IO_RESOURCE_DESCRIPTOR_0_1(
    public var Length: UInt = 0u,
    public var Alignment: UInt = 0u,
    public var MinimumAddress: Long = 0L,
    public var MaximumAddress: Long = 0L,
)

public data class IO_RESOURCE_DESCRIPTOR_0_0(
    public var Length: UInt = 0u,
    public var Alignment: UInt = 0u,
    public var MinimumAddress: Long = 0L,
    public var MaximumAddress: Long = 0L,
)

public data class IO_RESOURCE_LIST(
    public var Version: UShort = 0u,
    public var Revision: UShort = 0u,
    public var Count: UInt = 0u,
    public var Descriptors: List<IO_RESOURCE_DESCRIPTOR> = List(1) { IO_RESOURCE_DESCRIPTOR() },
)

public data class IO_RESOURCE_REQUIREMENTS_LIST(
    public var ListSize: UInt = 0u,
    public var InterfaceType: INTERFACE_TYPE = 0,
    public var BusNumber: UInt = 0u,
    public var SlotNumber: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(3),
    public var AlternativeLists: UInt = 0u,
    public var List: List<IO_RESOURCE_LIST> = List(1) { IO_RESOURCE_LIST() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IO_RESOURCE_REQUIREMENTS_LIST) return false
        if (this.ListSize != other.ListSize) return false
        if (this.InterfaceType != other.InterfaceType) return false
        if (this.BusNumber != other.BusNumber) return false
        if (this.SlotNumber != other.SlotNumber) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.AlternativeLists != other.AlternativeLists) return false
        if (this.List != other.List) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ListSize.hashCode()
        result = 31 * result + this.InterfaceType.hashCode()
        result = 31 * result + this.BusNumber.hashCode()
        result = 31 * result + this.SlotNumber.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.AlternativeLists.hashCode()
        result = 31 * result + this.List.hashCode()
        return result
    }
}

public data class IO_SESSION_CONNECT_INFO(public var SessionId: UInt = 0u, public var LocalSession: Boolean = false)

public data class IO_SESSION_STATE_INFORMATION(
    public var SessionId: UInt = 0u,
    public var SessionState: IO_SESSION_STATE = 0,
    public var LocalSession: Boolean = false,
)

public data class IO_SESSION_STATE_NOTIFICATION(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var IoObject: Long = 0L,
    public var EventMask: UInt = 0u,
    public var Context: Long = 0L,
)

public data class IO_STATUS_BLOCK32(public var Status: NTSTATUS = 0, public var Information: UInt = 0u)

public data class IO_STATUS_BLOCK64(public var Anonymous: IO_STATUS_BLOCK64_0 = IO_STATUS_BLOCK64_0(), public var Information: ULong = 0uL)

public data class IO_STATUS_BLOCK64_0(public var Status: NTSTATUS = 0, public var Pointer: Long = 0L)

public data class KADDRESS_RANGE(public var Address: Long = 0L, public var Size: ULong = 0uL)

public data class KADDRESS_RANGE_DESCRIPTOR(public var AddressRanges: Long = 0L, public var AddressRangeCount: ULong = 0uL)

public data class KAPC(
    public var Type: UByte = 0u,
    public var AllFlags: UByte = 0u,
    public var Size: UByte = 0u,
    public var SpareByte1: UByte = 0u,
    public var SpareLong0: UInt = 0u,
    public var Thread: Long = 0L,
    public var ApcListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var Reserved: LongArray = LongArray(3),
    public var NormalContext: Long = 0L,
    public var SystemArgument1: Long = 0L,
    public var SystemArgument2: Long = 0L,
    public var ApcStateIndex: Byte = 0,
    public var ApcMode: Byte = 0,
    public var Inserted: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KAPC) return false
        if (this.Type != other.Type) return false
        if (this.AllFlags != other.AllFlags) return false
        if (this.Size != other.Size) return false
        if (this.SpareByte1 != other.SpareByte1) return false
        if (this.SpareLong0 != other.SpareLong0) return false
        if (this.Thread != other.Thread) return false
        if (this.ApcListEntry != other.ApcListEntry) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.NormalContext != other.NormalContext) return false
        if (this.SystemArgument1 != other.SystemArgument1) return false
        if (this.SystemArgument2 != other.SystemArgument2) return false
        if (this.ApcStateIndex != other.ApcStateIndex) return false
        if (this.ApcMode != other.ApcMode) return false
        if (this.Inserted != other.Inserted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.AllFlags.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.SpareByte1.hashCode()
        result = 31 * result + this.SpareLong0.hashCode()
        result = 31 * result + this.Thread.hashCode()
        result = 31 * result + this.ApcListEntry.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.NormalContext.hashCode()
        result = 31 * result + this.SystemArgument1.hashCode()
        result = 31 * result + this.SystemArgument2.hashCode()
        result = 31 * result + this.ApcStateIndex.hashCode()
        result = 31 * result + this.ApcMode.hashCode()
        result = 31 * result + this.Inserted.hashCode()
        return result
    }
}

public data class KBUGCHECK_ADD_PAGES(
    public var Context: Long = 0L,
    public var Flags: UInt = 0u,
    public var BugCheckCode: UInt = 0u,
    public var Address: ULong = 0uL,
    public var Count: ULong = 0uL,
)

public data class KBUGCHECK_CALLBACK_RECORD(
    public var Entry: LIST_ENTRY = LIST_ENTRY(),
    public var CallbackRoutine: PKBUGCHECK_CALLBACK_ROUTINE = null,
    public var Buffer: Long = 0L,
    public var Length: UInt = 0u,
    public var Component: Long = 0L,
    public var Checksum: ULong = 0uL,
    public var State: UByte = 0u,
)

public data class KBUGCHECK_DUMP_IO(
    public var Offset: ULong = 0uL,
    public var Buffer: Long = 0L,
    public var BufferLength: UInt = 0u,
    public var Type: KBUGCHECK_DUMP_IO_TYPE = 0,
)

public data class KBUGCHECK_REASON_CALLBACK_RECORD(
    public var Entry: LIST_ENTRY = LIST_ENTRY(),
    public var CallbackRoutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE = null,
    public var Component: Long = 0L,
    public var Checksum: ULong = 0uL,
    public var Reason: KBUGCHECK_CALLBACK_REASON = 0,
    public var State: UByte = 0u,
)

public data class KBUGCHECK_REMOVE_PAGES(
    public var Context: Long = 0L,
    public var Flags: UInt = 0u,
    public var BugCheckCode: UInt = 0u,
    public var Address: ULong = 0uL,
    public var Count: ULong = 0uL,
)

public data class KBUGCHECK_SECONDARY_DUMP_DATA(
    public var InBuffer: Long = 0L,
    public var InBufferLength: UInt = 0u,
    public var MaximumAllowed: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var OutBuffer: Long = 0L,
    public var OutBufferLength: UInt = 0u,
)

public data class KBUGCHECK_SECONDARY_DUMP_DATA_EX(
    public var InBuffer: Long = 0L,
    public var InBufferLength: UInt = 0u,
    public var MaximumAllowed: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var OutBuffer: Long = 0L,
    public var OutBufferLength: UInt = 0u,
    public var Context: Long = 0L,
    public var Flags: UInt = 0u,
    public var DumpType: UInt = 0u,
    public var BugCheckCode: UInt = 0u,
    public var BugCheckParameter1: ULong = 0uL,
    public var BugCheckParameter2: ULong = 0uL,
    public var BugCheckParameter3: ULong = 0uL,
    public var BugCheckParameter4: ULong = 0uL,
)

public data class KBUGCHECK_TRIAGE_DUMP_DATA(
    public var DataArray: Long = 0L,
    public var Flags: UInt = 0u,
    public var MaxVirtMemSize: UInt = 0u,
    public var BugCheckCode: UInt = 0u,
    public var BugCheckParameter1: ULong = 0uL,
    public var BugCheckParameter2: ULong = 0uL,
    public var BugCheckParameter3: ULong = 0uL,
    public var BugCheckParameter4: ULong = 0uL,
)

public data class KDEVICE_QUEUE_ENTRY(
    public var DeviceListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var SortKey: UInt = 0u,
    public var Inserted: Boolean = false,
)

public data class KDPC_WATCHDOG_INFORMATION(
    public var DpcTimeLimit: UInt = 0u,
    public var DpcTimeCount: UInt = 0u,
    public var DpcWatchdogLimit: UInt = 0u,
    public var DpcWatchdogCount: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class KERNEL_SOFT_RESTART_NOTIFICATION(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Event: GUID = GUID(),
)

public data class KERNEL_USER_TIMES(
    public var CreateTime: Long = 0L,
    public var ExitTime: Long = 0L,
    public var KernelTime: Long = 0L,
    public var UserTime: Long = 0L,
)

public data class KEY_BASIC_INFORMATION(
    public var LastWriteTime: Long = 0L,
    public var TitleIndex: UInt = 0u,
    public var NameLength: UInt = 0u,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_BASIC_INFORMATION) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.TitleIndex != other.TitleIndex) return false
        if (this.NameLength != other.NameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LastWriteTime.hashCode()
        result = 31 * result + this.TitleIndex.hashCode()
        result = 31 * result + this.NameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class KEY_CACHED_INFORMATION(
    public var LastWriteTime: Long = 0L,
    public var TitleIndex: UInt = 0u,
    public var SubKeys: UInt = 0u,
    public var MaxNameLen: UInt = 0u,
    public var Values: UInt = 0u,
    public var MaxValueNameLen: UInt = 0u,
    public var MaxValueDataLen: UInt = 0u,
    public var NameLength: UInt = 0u,
)

public data class KEY_CONTROL_FLAGS_INFORMATION(public var ControlFlags: UInt = 0u)

public data class KEY_FULL_INFORMATION(
    public var LastWriteTime: Long = 0L,
    public var TitleIndex: UInt = 0u,
    public var ClassOffset: UInt = 0u,
    public var ClassLength: UInt = 0u,
    public var SubKeys: UInt = 0u,
    public var MaxNameLen: UInt = 0u,
    public var MaxClassLen: UInt = 0u,
    public var Values: UInt = 0u,
    public var MaxValueNameLen: UInt = 0u,
    public var MaxValueDataLen: UInt = 0u,
    public var Class: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_FULL_INFORMATION) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.TitleIndex != other.TitleIndex) return false
        if (this.ClassOffset != other.ClassOffset) return false
        if (this.ClassLength != other.ClassLength) return false
        if (this.SubKeys != other.SubKeys) return false
        if (this.MaxNameLen != other.MaxNameLen) return false
        if (this.MaxClassLen != other.MaxClassLen) return false
        if (this.Values != other.Values) return false
        if (this.MaxValueNameLen != other.MaxValueNameLen) return false
        if (this.MaxValueDataLen != other.MaxValueDataLen) return false
        if (!this.Class.contentEquals(other.Class)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LastWriteTime.hashCode()
        result = 31 * result + this.TitleIndex.hashCode()
        result = 31 * result + this.ClassOffset.hashCode()
        result = 31 * result + this.ClassLength.hashCode()
        result = 31 * result + this.SubKeys.hashCode()
        result = 31 * result + this.MaxNameLen.hashCode()
        result = 31 * result + this.MaxClassLen.hashCode()
        result = 31 * result + this.Values.hashCode()
        result = 31 * result + this.MaxValueNameLen.hashCode()
        result = 31 * result + this.MaxValueDataLen.hashCode()
        result = 31 * result + this.Class.contentHashCode()
        return result
    }
}

public data class KEY_LAYER_INFORMATION(public var _bitfield: UInt = 0u)

public data class KEY_NAME_INFORMATION(public var NameLength: UInt = 0u, public var Name: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_NAME_INFORMATION) return false
        if (this.NameLength != other.NameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class KEY_NODE_INFORMATION(
    public var LastWriteTime: Long = 0L,
    public var TitleIndex: UInt = 0u,
    public var ClassOffset: UInt = 0u,
    public var ClassLength: UInt = 0u,
    public var NameLength: UInt = 0u,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_NODE_INFORMATION) return false
        if (this.LastWriteTime != other.LastWriteTime) return false
        if (this.TitleIndex != other.TitleIndex) return false
        if (this.ClassOffset != other.ClassOffset) return false
        if (this.ClassLength != other.ClassLength) return false
        if (this.NameLength != other.NameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LastWriteTime.hashCode()
        result = 31 * result + this.TitleIndex.hashCode()
        result = 31 * result + this.ClassOffset.hashCode()
        result = 31 * result + this.ClassLength.hashCode()
        result = 31 * result + this.NameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class KEY_SET_VIRTUALIZATION_INFORMATION(public var _bitfield: UInt = 0u)

public data class KEY_TRUST_INFORMATION(public var _bitfield: UInt = 0u)

public data class KEY_VALUE_BASIC_INFORMATION(
    public var TitleIndex: UInt = 0u,
    public var Type: UInt = 0u,
    public var NameLength: UInt = 0u,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_VALUE_BASIC_INFORMATION) return false
        if (this.TitleIndex != other.TitleIndex) return false
        if (this.Type != other.Type) return false
        if (this.NameLength != other.NameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TitleIndex.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.NameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class KEY_VALUE_FULL_INFORMATION(
    public var TitleIndex: UInt = 0u,
    public var Type: UInt = 0u,
    public var DataOffset: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var NameLength: UInt = 0u,
    public var Name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_VALUE_FULL_INFORMATION) return false
        if (this.TitleIndex != other.TitleIndex) return false
        if (this.Type != other.Type) return false
        if (this.DataOffset != other.DataOffset) return false
        if (this.DataLength != other.DataLength) return false
        if (this.NameLength != other.NameLength) return false
        if (!this.Name.contentEquals(other.Name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TitleIndex.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.DataOffset.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.NameLength.hashCode()
        result = 31 * result + this.Name.contentHashCode()
        return result
    }
}

public data class KEY_VALUE_LAYER_INFORMATION(public var _bitfield: UInt = 0u)

public data class KEY_VALUE_PARTIAL_INFORMATION(
    public var TitleIndex: UInt = 0u,
    public var Type: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_VALUE_PARTIAL_INFORMATION) return false
        if (this.TitleIndex != other.TitleIndex) return false
        if (this.Type != other.Type) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TitleIndex.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class KEY_VALUE_PARTIAL_INFORMATION_ALIGN64(
    public var Type: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KEY_VALUE_PARTIAL_INFORMATION_ALIGN64) return false
        if (this.Type != other.Type) return false
        if (this.DataLength != other.DataLength) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class KEY_VIRTUALIZATION_INFORMATION(public var _bitfield: UInt = 0u)

public data class KEY_WOW64_FLAGS_INFORMATION(public var UserFlags: UInt = 0u)

public data class KEY_WRITE_TIME_INFORMATION(public var LastWriteTime: Long = 0L)

public data class KE_PROCESSOR_CHANGE_NOTIFY_CONTEXT(
    public var State: KE_PROCESSOR_CHANGE_NOTIFY_STATE = 0,
    public var NtNumber: UInt = 0u,
    public var Status: NTSTATUS = 0,
    public var ProcNumber: PROCESSOR_NUMBER = PROCESSOR_NUMBER(),
)

public data class KFLOATING_SAVE(
    public var ControlWord: UInt = 0u,
    public var StatusWord: UInt = 0u,
    public var ErrorOffset: UInt = 0u,
    public var ErrorSelector: UInt = 0u,
    public var DataOffset: UInt = 0u,
    public var DataSelector: UInt = 0u,
    public var Spare0: UInt = 0u,
    public var Spare1: UInt = 0u,
)

public data class KGATE(public var Header: DISPATCHER_HEADER = DISPATCHER_HEADER())

public data class KLOCK_QUEUE_HANDLE(public var LockQueue: KSPIN_LOCK_QUEUE = KSPIN_LOCK_QUEUE(), public var OldIrql: UByte = 0u)

public data class KSEMAPHORE(public var Header: DISPATCHER_HEADER = DISPATCHER_HEADER(), public var Limit: Int = 0)

public data class KSPIN_LOCK_QUEUE(public var Next: Long = 0L, public var Lock: Long = 0L)

public data class KSYSTEM_TIME(
    public var LowPart: UInt = 0u,
    public var High1Time: Int = 0,
    public var High2Time: Int = 0,
)

public data class KTIMER(
    public var Header: DISPATCHER_HEADER = DISPATCHER_HEADER(),
    public var DueTime: ULong = 0uL,
    public var TimerListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var Dpc: Long = 0L,
    public var Period: UInt = 0u,
)

public data class KTRIAGE_DUMP_DATA_ARRAY(
    public var List: LIST_ENTRY = LIST_ENTRY(),
    public var NumBlocksUsed: UInt = 0u,
    public var NumBlocksTotal: UInt = 0u,
    public var DataSize: UInt = 0u,
    public var MaxDataSize: UInt = 0u,
    public var ComponentNameBufferLength: UInt = 0u,
    public var ComponentName: Long = 0L,
    public var Blocks: List<KADDRESS_RANGE> = List(1) { KADDRESS_RANGE() },
)

public class KUSER_SHARED_DATA {
    public var TickCountLowDeprecated: UInt = 0u

    public var TickCountMultiplier: UInt = 0u

    public var InterruptTime: KSYSTEM_TIME = KSYSTEM_TIME()

    public var SystemTime: KSYSTEM_TIME = KSYSTEM_TIME()

    public var TimeZoneBias: KSYSTEM_TIME = KSYSTEM_TIME()

    public var ImageNumberLow: UShort = 0u

    public var ImageNumberHigh: UShort = 0u

    public var NtSystemRoot: UShortArray = UShortArray(260)

    public var MaxStackTraceDepth: UInt = 0u

    public var CryptoExponent: UInt = 0u

    public var TimeZoneId: UInt = 0u

    public var LargePageMinimum: UInt = 0u

    public var AitSamplingValue: UInt = 0u

    public var AppCompatFlag: UInt = 0u

    public var RNGSeedVersion: ULong = 0uL

    public var GlobalValidationRunlevel: UInt = 0u

    public var TimeZoneBiasStamp: Int = 0

    public var NtBuildNumber: UInt = 0u

    public var NtProductType: NT_PRODUCT_TYPE = 0

    public var ProductTypeIsValid: Boolean = false

    public var Reserved0: BooleanArray = BooleanArray(1)

    public var NativeProcessorArchitecture: UShort = 0u

    public var NtMajorVersion: UInt = 0u

    public var NtMinorVersion: UInt = 0u

    public var ProcessorFeatures: BooleanArray = BooleanArray(64)

    public var Reserved1: UInt = 0u

    public var Reserved3: UInt = 0u

    public var TimeSlip: UInt = 0u

    public var AlternativeArchitecture: ALTERNATIVE_ARCHITECTURE_TYPE = 0

    public var BootId: UInt = 0u

    public var SystemExpirationDate: Long = 0L

    public var SuiteMask: UInt = 0u

    public var KdDebuggerEnabled: Boolean = false

    public var Anonymous1: KUSER_SHARED_DATA_0 = KUSER_SHARED_DATA_0()

    public var CyclesPerYield: UShort = 0u

    public var ActiveConsoleId: UInt = 0u

    public var DismountCount: UInt = 0u

    public var ComPlusPackage: UInt = 0u

    public var LastSystemRITEventTickCount: UInt = 0u

    public var NumberOfPhysicalPages: UInt = 0u

    public var SafeBootMode: Boolean = false

    public var Anonymous2: KUSER_SHARED_DATA_1 = KUSER_SHARED_DATA_1()

    public var Reserved12: UByteArray = UByteArray(2)

    public var Anonymous3: KUSER_SHARED_DATA_2 = KUSER_SHARED_DATA_2()

    public var DataFlagsPad: UIntArray = UIntArray(1)

    public var TestRetInstruction: ULong = 0uL

    public var QpcFrequency: Long = 0L

    public var SystemCall: UInt = 0u

    public var Reserved2: UInt = 0u

    public var SystemCallPad: ULongArray = ULongArray(2)

    public var Anonymous4: KUSER_SHARED_DATA_3 = KUSER_SHARED_DATA_3()

    public var Cookie: UInt = 0u

    public var CookiePad: UIntArray = UIntArray(1)

    public var ConsoleSessionForegroundProcessId: Long = 0L

    public var TimeUpdateLock: ULong = 0uL

    public var BaselineSystemTimeQpc: ULong = 0uL

    public var BaselineInterruptTimeQpc: ULong = 0uL

    public var QpcSystemTimeIncrement: ULong = 0uL

    public var QpcInterruptTimeIncrement: ULong = 0uL

    public var QpcSystemTimeIncrementShift: UByte = 0u

    public var QpcInterruptTimeIncrementShift: UByte = 0u

    public var UnparkedProcessorCount: UShort = 0u

    public var EnclaveFeatureMask: UIntArray = UIntArray(4)

    public var TelemetryCoverageRound: UInt = 0u

    public var UserModeGlobalLogger: UShortArray = UShortArray(16)

    public var ImageFileExecutionOptions: UInt = 0u

    public var LangGenerationCount: UInt = 0u

    public var Reserved4: ULong = 0uL

    public var InterruptTimeBias: ULong = 0uL

    public var QpcBias: ULong = 0uL

    public var ActiveProcessorCount: UInt = 0u

    public var ActiveGroupCount: UByte = 0u

    public var Reserved9: UByte = 0u

    public var Anonymous5: KUSER_SHARED_DATA_4 = KUSER_SHARED_DATA_4()

    public var TimeZoneBiasEffectiveStart: Long = 0L

    public var TimeZoneBiasEffectiveEnd: Long = 0L

    public var XState: XSTATE_CONFIGURATION = XSTATE_CONFIGURATION()

    public var FeatureConfigurationChangeStamp: KSYSTEM_TIME = KSYSTEM_TIME()

    public var Spare: UInt = 0u

    public var UserPointerAuthMask: ULong = 0uL
}

public data class KUSER_SHARED_DATA_0(public var MitigationPolicies: UByte = 0u, public var Anonymous: KUSER_SHARED_DATA_0_0 = KUSER_SHARED_DATA_0_0())

public data class KUSER_SHARED_DATA_0_0(public var _bitfield: UByte = 0u)

public data class KUSER_SHARED_DATA_1(public var VirtualizationFlags: UByte = 0u)

public data class KUSER_SHARED_DATA_2(public var SharedDataFlags: UInt = 0u, public var Anonymous: KUSER_SHARED_DATA_2_0 = KUSER_SHARED_DATA_2_0())

public data class KUSER_SHARED_DATA_2_0(public var _bitfield: UInt = 0u)

public data class KUSER_SHARED_DATA_3(
    public var TickCount: KSYSTEM_TIME = KSYSTEM_TIME(),
    public var TickCountQuad: ULong = 0uL,
    public var Anonymous: KUSER_SHARED_DATA_3_0 = KUSER_SHARED_DATA_3_0(),
)

public data class KUSER_SHARED_DATA_3_0(public var ReservedTickCountOverlay: UIntArray = UIntArray(3), public var TickCountPad: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KUSER_SHARED_DATA_3_0) return false
        if (!this.ReservedTickCountOverlay.contentEquals(other.ReservedTickCountOverlay)) return false
        if (!this.TickCountPad.contentEquals(other.TickCountPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ReservedTickCountOverlay.contentHashCode()
        result = 31 * result + this.TickCountPad.contentHashCode()
        return result
    }
}

public data class KUSER_SHARED_DATA_4(public var QpcData: UShort = 0u, public var Anonymous: KUSER_SHARED_DATA_4_0 = KUSER_SHARED_DATA_4_0())

public data class KUSER_SHARED_DATA_4_0(public var QpcBypassEnabled: UByte = 0u, public var QpcShift: UByte = 0u)

public data class KWAIT_CHAIN(public var Head: Long = 0L)

public data class LEGACY_BUS_INFORMATION(
    public var BusTypeGuid: GUID = GUID(),
    public var LegacyBusType: INTERFACE_TYPE = 0,
    public var BusNumber: UInt = 0u,
)

public data class LINK_SHARE_ACCESS(
    public var OpenCount: UInt = 0u,
    public var Deleters: UInt = 0u,
    public var SharedDelete: UInt = 0u,
)

public data class LOADER_PARTITION_INFORMATION_EX(
    public var PartitionStyle: UInt = 0u,
    public var PartitionNumber: UInt = 0u,
    public var Anonymous: LOADER_PARTITION_INFORMATION_EX_0 = LOADER_PARTITION_INFORMATION_EX_0(),
    public var Flags: UInt = 0u,
)

public data class LOADER_PARTITION_INFORMATION_EX_0(public var Signature: UInt = 0u, public var DeviceId: GUID = GUID())

public data class MAILSLOT_CREATE_PARAMETERS(
    public var MailslotQuota: UInt = 0u,
    public var MaximumMessageSize: UInt = 0u,
    public var ReadTimeout: Long = 0L,
    public var TimeoutSpecified: Boolean = false,
)

public data class MAP_REGISTER_ENTRY(public var MapRegister: Long = 0L, public var WriteToDevice: Boolean = false)

public data class MCA_DRIVER_INFO(
    public var ExceptionCallback: Long = 0L,
    public var DpcCallback: PKDEFERRED_ROUTINE = null,
    public var DeviceContext: Long = 0L,
)

public data class MCA_EXCEPTION(
    public var VersionNumber: UInt = 0u,
    public var ExceptionType: MCA_EXCEPTION_TYPE = 0,
    public var TimeStamp: Long = 0L,
    public var ProcessorNumber: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var u: MCA_EXCEPTION_0 = MCA_EXCEPTION_0(),
    public var ExtCnt: UInt = 0u,
    public var Reserved3: UInt = 0u,
    public var ExtReg: ULongArray = ULongArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MCA_EXCEPTION) return false
        if (this.VersionNumber != other.VersionNumber) return false
        if (this.ExceptionType != other.ExceptionType) return false
        if (this.TimeStamp != other.TimeStamp) return false
        if (this.ProcessorNumber != other.ProcessorNumber) return false
        if (this.Reserved1 != other.Reserved1) return false
        if (this.u != other.u) return false
        if (this.ExtCnt != other.ExtCnt) return false
        if (this.Reserved3 != other.Reserved3) return false
        if (!this.ExtReg.contentEquals(other.ExtReg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VersionNumber.hashCode()
        result = 31 * result + this.ExceptionType.hashCode()
        result = 31 * result + this.TimeStamp.hashCode()
        result = 31 * result + this.ProcessorNumber.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.ExtCnt.hashCode()
        result = 31 * result + this.Reserved3.hashCode()
        result = 31 * result + this.ExtReg.contentHashCode()
        return result
    }
}

public data class MCA_EXCEPTION_0(public var Mca: MCA_EXCEPTION_0_0 = MCA_EXCEPTION_0_0(), public var Mce: MCA_EXCEPTION_0_1 = MCA_EXCEPTION_0_1())

public data class MCA_EXCEPTION_0_0(
    public var BankNumber: UByte = 0u,
    public var Reserved2: UByteArray = UByteArray(7),
    public var Status: MCI_STATS = MCI_STATS(),
    public var Address: MCI_ADDR = MCI_ADDR(),
    public var Misc: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MCA_EXCEPTION_0_0) return false
        if (this.BankNumber != other.BankNumber) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (this.Status != other.Status) return false
        if (this.Address != other.Address) return false
        if (this.Misc != other.Misc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BankNumber.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.Status.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.Misc.hashCode()
        return result
    }
}

public data class MCA_EXCEPTION_0_1(public var Address: ULong = 0uL, public var Type: ULong = 0uL)

public data class MCG_CAP(public var Anonymous: MCG_CAP_0 = MCG_CAP_0(), public var QuadPart: ULong = 0uL)

public data class MCG_CAP_0(public var _bitfield: ULong = 0uL)

public data class MCG_STATUS(public var Anonymous: MCG_STATUS_0 = MCG_STATUS_0(), public var QuadPart: ULong = 0uL)

public data class MCG_STATUS_0(public var _bitfield: UInt = 0u, public var Reserved2: UInt = 0u)

public data class MCI_ADDR(public var Anonymous: MCI_ADDR_0 = MCI_ADDR_0(), public var QuadPart: ULong = 0uL)

public data class MCI_ADDR_0(public var Address: UInt = 0u, public var Reserved: UInt = 0u)

public data class MCI_STATS(public var MciStats: MCI_STATS_0 = MCI_STATS_0(), public var QuadPart: ULong = 0uL)

public data class MCI_STATS_0(
    public var McaCod: UShort = 0u,
    public var MsCod: UShort = 0u,
    public var _bitfield: UInt = 0u,
)

public data class MCI_STATUS(
    public var CommonBits: MCI_STATUS_BITS_COMMON = MCI_STATUS_BITS_COMMON(),
    public var AmdBits: MCI_STATUS_AMD_BITS = MCI_STATUS_AMD_BITS(),
    public var IntelBits: MCI_STATUS_INTEL_BITS = MCI_STATUS_INTEL_BITS(),
    public var QuadPart: ULong = 0uL,
)

public data class MCI_STATUS_AMD_BITS(public var _bitfield: ULong = 0uL)

public data class MCI_STATUS_BITS_COMMON(public var _bitfield: ULong = 0uL)

public data class MCI_STATUS_INTEL_BITS(public var _bitfield: ULong = 0uL)

public data class MEMORY_PARTITION_DEDICATED_MEMORY_OPEN_INFORMATION(
    public var DedicatedMemoryTypeId: ULong = 0uL,
    public var HandleAttributes: UInt = 0u,
    public var DesiredAccess: UInt = 0u,
    public var DedicatedMemoryPartitionHandle: HANDLE = 0L,
)

public data class MM_COPY_ADDRESS(public var Anonymous: MM_COPY_ADDRESS_0 = MM_COPY_ADDRESS_0())

public data class MM_COPY_ADDRESS_0(public var VirtualAddress: Long = 0L, public var PhysicalAddress: Long = 0L)

public data class MM_PHYSICAL_ADDRESS_LIST(public var PhysicalAddress: Long = 0L, public var NumberOfBytes: ULong = 0uL)

public data class MU_TELEMETRY_SECTION(
    public var ComponentID: GUID = GUID(),
    public var SubComponentID: GUID = GUID(),
    public var Reserved: UInt = 0u,
    public var ErrorStatusValue: UInt = 0u,
    public var AdditionalInfo1: ULong = 0uL,
    public var AdditionalInfo2: ULong = 0uL,
)

public data class NAMED_PIPE_CREATE_PARAMETERS(
    public var NamedPipeType: UInt = 0u,
    public var ReadMode: UInt = 0u,
    public var CompletionMode: UInt = 0u,
    public var MaximumInstances: UInt = 0u,
    public var InboundQuota: UInt = 0u,
    public var OutboundQuota: UInt = 0u,
    public var DefaultTimeout: Long = 0L,
    public var TimeoutSpecified: Boolean = false,
)

public data class NPEM_CAPABILITY_STANDARD(public var Anonymous: NPEM_CAPABILITY_STANDARD_0 = NPEM_CAPABILITY_STANDARD_0(), public var AsULONG: UInt = 0u)

public data class NPEM_CAPABILITY_STANDARD_0(public var _bitfield: UInt = 0u)

public data class NPEM_CONTROL_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetNpemSupportState: PNPEM_CONTROL_ENABLE_DISABLE = null,
    public var QueryStandardCapabilities: PNPEM_CONTROL_QUERY_STANDARD_CAPABILITIES = null,
    public var SetStandardControl: PNPEM_CONTROL_SET_STANDARD_CONTROL = null,
    public var QueryNpemControl: PNPEM_CONTROL_QUERY_CONTROL = null,
)

public data class NT_TIB32(
    public var ExceptionList: UInt = 0u,
    public var StackBase: UInt = 0u,
    public var StackLimit: UInt = 0u,
    public var SubSystemTib: UInt = 0u,
    public var Anonymous: NT_TIB32_0 = NT_TIB32_0(),
    public var ArbitraryUserPointer: UInt = 0u,
    public var Self_: UInt = 0u,
)

public data class NT_TIB32_0(public var FiberData: UInt = 0u, public var Version: UInt = 0u)

public data class OBJECT_HANDLE_INFORMATION(public var HandleAttributes: UInt = 0u, public var GrantedAccess: UInt = 0u)

public data class OB_CALLBACK_REGISTRATION(
    public var Version: UShort = 0u,
    public var OperationRegistrationCount: UShort = 0u,
    public var Altitude: UNICODE_STRING = UNICODE_STRING(),
    public var RegistrationContext: Long = 0L,
    public var OperationRegistration: Long = 0L,
)

public data class OB_OPERATION_REGISTRATION(
    public var ObjectType: Long = 0L,
    public var Operations: UInt = 0u,
    public var PreOperation: POB_PRE_OPERATION_CALLBACK = null,
    public var PostOperation: POB_POST_OPERATION_CALLBACK = null,
)

public data class OB_POST_CREATE_HANDLE_INFORMATION(public var GrantedAccess: UInt = 0u)

public data class OB_POST_DUPLICATE_HANDLE_INFORMATION(public var GrantedAccess: UInt = 0u)

public data class OB_POST_OPERATION_INFORMATION(
    public var Operation: UInt = 0u,
    public var Anonymous: OB_POST_OPERATION_INFORMATION_0 = OB_POST_OPERATION_INFORMATION_0(),
    public var Object: Long = 0L,
    public var ObjectType: POBJECT_TYPE = 0L,
    public var CallContext: Long = 0L,
    public var ReturnStatus: NTSTATUS = 0,
    public var Parameters: Long = 0L,
)

public data class OB_POST_OPERATION_INFORMATION_0(public var Flags: UInt = 0u, public var Anonymous: OB_POST_OPERATION_INFORMATION_0_0 = OB_POST_OPERATION_INFORMATION_0_0())

public data class OB_POST_OPERATION_INFORMATION_0_0(public var _bitfield: UInt = 0u)

public data class OB_POST_OPERATION_PARAMETERS(public var CreateHandleInformation: OB_POST_CREATE_HANDLE_INFORMATION = OB_POST_CREATE_HANDLE_INFORMATION(), public var DuplicateHandleInformation: OB_POST_DUPLICATE_HANDLE_INFORMATION = OB_POST_DUPLICATE_HANDLE_INFORMATION())

public data class OB_PRE_CREATE_HANDLE_INFORMATION(public var DesiredAccess: UInt = 0u, public var OriginalDesiredAccess: UInt = 0u)

public data class OB_PRE_DUPLICATE_HANDLE_INFORMATION(
    public var DesiredAccess: UInt = 0u,
    public var OriginalDesiredAccess: UInt = 0u,
    public var SourceProcess: Long = 0L,
    public var TargetProcess: Long = 0L,
)

public data class OB_PRE_OPERATION_INFORMATION(
    public var Operation: UInt = 0u,
    public var Anonymous: OB_PRE_OPERATION_INFORMATION_0 = OB_PRE_OPERATION_INFORMATION_0(),
    public var Object: Long = 0L,
    public var ObjectType: POBJECT_TYPE = 0L,
    public var CallContext: Long = 0L,
    public var Parameters: Long = 0L,
)

public data class OB_PRE_OPERATION_INFORMATION_0(public var Flags: UInt = 0u, public var Anonymous: OB_PRE_OPERATION_INFORMATION_0_0 = OB_PRE_OPERATION_INFORMATION_0_0())

public data class OB_PRE_OPERATION_INFORMATION_0_0(public var _bitfield: UInt = 0u)

public data class OB_PRE_OPERATION_PARAMETERS(public var CreateHandleInformation: OB_PRE_CREATE_HANDLE_INFORMATION = OB_PRE_CREATE_HANDLE_INFORMATION(), public var DuplicateHandleInformation: OB_PRE_DUPLICATE_HANDLE_INFORMATION = OB_PRE_DUPLICATE_HANDLE_INFORMATION())

public data class PAGE_PRIORITY_INFORMATION(public var PagePriority: UInt = 0u)

public data class PCIBUSDATA(
    public var Tag: UInt = 0u,
    public var Version: UInt = 0u,
    public var ReadConfig: PciReadWriteConfig = null,
    public var WriteConfig: PciReadWriteConfig = null,
    public var Pin2Line: PciPin2Line = null,
    public var Line2Pin: PciLine2Pin = null,
    public var ParentSlot: PCI_SLOT_NUMBER = PCI_SLOT_NUMBER(),
    public var Reserved: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCIBUSDATA) return false
        if (this.Tag != other.Tag) return false
        if (this.Version != other.Version) return false
        if (this.ReadConfig != other.ReadConfig) return false
        if (this.WriteConfig != other.WriteConfig) return false
        if (this.Pin2Line != other.Pin2Line) return false
        if (this.Line2Pin != other.Line2Pin) return false
        if (this.ParentSlot != other.ParentSlot) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Tag.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.ReadConfig.hashCode()
        result = 31 * result + this.WriteConfig.hashCode()
        result = 31 * result + this.Pin2Line.hashCode()
        result = 31 * result + this.Line2Pin.hashCode()
        result = 31 * result + this.ParentSlot.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class PCIX_BRIDGE_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var SecondaryStatus: PCIX_BRIDGE_CAPABILITY_0 = PCIX_BRIDGE_CAPABILITY_0(),
    public var BridgeStatus: PCIX_BRIDGE_CAPABILITY_1 = PCIX_BRIDGE_CAPABILITY_1(),
    public var UpstreamSplitTransactionCapacity: UShort = 0u,
    public var UpstreamSplitTransactionLimit: UShort = 0u,
    public var DownstreamSplitTransactionCapacity: UShort = 0u,
    public var DownstreamSplitTransactionLimit: UShort = 0u,
    public var EccControlStatus: PCIX_BRIDGE_CAPABILITY_2 = PCIX_BRIDGE_CAPABILITY_2(),
    public var EccFirstAddress: UInt = 0u,
    public var EccSecondAddress: UInt = 0u,
    public var EccAttribute: UInt = 0u,
)

public data class PCIX_BRIDGE_CAPABILITY_1(public var Anonymous: PCIX_BRIDGE_CAPABILITY_1_0 = PCIX_BRIDGE_CAPABILITY_1_0(), public var AsULONG: UInt = 0u)

public data class PCIX_BRIDGE_CAPABILITY_1_0(public var _bitfield: UInt = 0u)

public data class PCIX_BRIDGE_CAPABILITY_2(public var Anonymous: PCIX_BRIDGE_CAPABILITY_2_0 = PCIX_BRIDGE_CAPABILITY_2_0(), public var AsULONG: UInt = 0u)

public data class PCIX_BRIDGE_CAPABILITY_2_0(public var _bitfield: UInt = 0u)

public data class PCIX_BRIDGE_CAPABILITY_0(public var Anonymous: PCIX_BRIDGE_CAPABILITY_0_0 = PCIX_BRIDGE_CAPABILITY_0_0(), public var AsUSHORT: UShort = 0u)

public data class PCIX_BRIDGE_CAPABILITY_0_0(public var _bitfield: UShort = 0u)

public data class PCI_ADVANCED_FEATURES_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var Length: UByte = 0u,
    public var Capabilities: PCI_ADVANCED_FEATURES_CAPABILITY_0 = PCI_ADVANCED_FEATURES_CAPABILITY_0(),
    public var Control: PCI_ADVANCED_FEATURES_CAPABILITY_1 = PCI_ADVANCED_FEATURES_CAPABILITY_1(),
    public var Status: PCI_ADVANCED_FEATURES_CAPABILITY_2 = PCI_ADVANCED_FEATURES_CAPABILITY_2(),
)

public data class PCI_ADVANCED_FEATURES_CAPABILITY_0(public var Anonymous: PCI_ADVANCED_FEATURES_CAPABILITY_0_0 = PCI_ADVANCED_FEATURES_CAPABILITY_0_0(), public var AsUCHAR: UByte = 0u)

public data class PCI_ADVANCED_FEATURES_CAPABILITY_0_0(public var _bitfield: UByte = 0u)

public data class PCI_ADVANCED_FEATURES_CAPABILITY_1(public var Anonymous: PCI_ADVANCED_FEATURES_CAPABILITY_1_0 = PCI_ADVANCED_FEATURES_CAPABILITY_1_0(), public var AsUCHAR: UByte = 0u)

public data class PCI_ADVANCED_FEATURES_CAPABILITY_1_0(public var _bitfield: UByte = 0u)

public data class PCI_ADVANCED_FEATURES_CAPABILITY_2(public var Anonymous: PCI_ADVANCED_FEATURES_CAPABILITY_2_0 = PCI_ADVANCED_FEATURES_CAPABILITY_2_0(), public var AsUCHAR: UByte = 0u)

public data class PCI_ADVANCED_FEATURES_CAPABILITY_2_0(public var _bitfield: UByte = 0u)

public data class PCI_AGP_APERTURE_PAGE_SIZE(public var _bitfield: UShort = 0u)

public data class PCI_AGP_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var _bitfield: UShort = 0u,
    public var AGPStatus: PCI_AGP_CAPABILITY_0 = PCI_AGP_CAPABILITY_0(),
    public var AGPCommand: PCI_AGP_CAPABILITY_1 = PCI_AGP_CAPABILITY_1(),
)

public data class PCI_AGP_CAPABILITY_1(public var _bitfield: UInt = 0u)

public data class PCI_AGP_CAPABILITY_0(public var _bitfield: UInt = 0u)

public data class PCI_AGP_CONTROL(public var _bitfield: UInt = 0u)

public data class PCI_AGP_EXTENDED_CAPABILITY(
    public var IsochStatus: PCI_AGP_ISOCH_STATUS = PCI_AGP_ISOCH_STATUS(),
    public var AgpControl: PCI_AGP_CONTROL = PCI_AGP_CONTROL(),
    public var ApertureSize: UShort = 0u,
    public var AperturePageSize: PCI_AGP_APERTURE_PAGE_SIZE = PCI_AGP_APERTURE_PAGE_SIZE(),
    public var GartLow: UInt = 0u,
    public var GartHigh: UInt = 0u,
    public var IsochCommand: PCI_AGP_ISOCH_COMMAND = PCI_AGP_ISOCH_COMMAND(),
)

public data class PCI_AGP_ISOCH_COMMAND(public var _bitfield: UShort = 0u)

public data class PCI_AGP_ISOCH_STATUS(public var _bitfield: UInt = 0u)

public data class PCI_ATS_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var SetAddressTranslationServices: PPCI_SET_ATS = null,
    public var InvalidateQueueDepth: UByte = 0u,
)

public data class PCI_BUS_INTERFACE_STANDARD(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var ReadConfig: PPCI_READ_WRITE_CONFIG = null,
    public var WriteConfig: PPCI_READ_WRITE_CONFIG = null,
    public var PinToLine: PPCI_PIN_TO_LINE = null,
    public var LineToPin: PPCI_LINE_TO_PIN = null,
    public var RootBusCapability: PPCI_ROOT_BUS_CAPABILITY = null,
    public var ExpressWakeControl: PPCI_EXPRESS_WAKE_CONTROL = null,
    public var PrepareMultistageResume: PPCI_PREPARE_MULTISTAGE_RESUME = null,
)

public data class PCI_CAPABILITIES_HEADER(public var CapabilityID: UByte = 0u, public var Next: UByte = 0u)

public data class PCI_COMMON_CONFIG(public var Base: PCI_COMMON_HEADER = PCI_COMMON_HEADER(), public var DeviceSpecific: UByteArray = UByteArray(192)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_COMMON_CONFIG) return false
        if (this.Base != other.Base) return false
        if (!this.DeviceSpecific.contentEquals(other.DeviceSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Base.hashCode()
        result = 31 * result + this.DeviceSpecific.contentHashCode()
        return result
    }
}

public data class PCI_COMMON_HEADER(
    public var VendorID: UShort = 0u,
    public var DeviceID: UShort = 0u,
    public var Command: UShort = 0u,
    public var Status: UShort = 0u,
    public var RevisionID: UByte = 0u,
    public var ProgIf: UByte = 0u,
    public var SubClass: UByte = 0u,
    public var BaseClass: UByte = 0u,
    public var CacheLineSize: UByte = 0u,
    public var LatencyTimer: UByte = 0u,
    public var HeaderType: UByte = 0u,
    public var BIST: UByte = 0u,
    public var u: PCI_COMMON_HEADER_0 = PCI_COMMON_HEADER_0(),
)

public data class PCI_COMMON_HEADER_0(
    public var type0: PCI_COMMON_HEADER_0_0 = PCI_COMMON_HEADER_0_0(),
    public var type1: PCI_COMMON_HEADER_0_1 = PCI_COMMON_HEADER_0_1(),
    public var type2: PCI_COMMON_HEADER_0_2 = PCI_COMMON_HEADER_0_2(),
)

public data class PCI_COMMON_HEADER_0_0(
    public var BaseAddresses: UIntArray = UIntArray(6),
    public var CIS: UInt = 0u,
    public var SubVendorID: UShort = 0u,
    public var SubSystemID: UShort = 0u,
    public var ROMBaseAddress: UInt = 0u,
    public var CapabilitiesPtr: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
    public var Reserved2: UInt = 0u,
    public var InterruptLine: UByte = 0u,
    public var InterruptPin: UByte = 0u,
    public var MinimumGrant: UByte = 0u,
    public var MaximumLatency: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_COMMON_HEADER_0_0) return false
        if (!this.BaseAddresses.contentEquals(other.BaseAddresses)) return false
        if (this.CIS != other.CIS) return false
        if (this.SubVendorID != other.SubVendorID) return false
        if (this.SubSystemID != other.SubSystemID) return false
        if (this.ROMBaseAddress != other.ROMBaseAddress) return false
        if (this.CapabilitiesPtr != other.CapabilitiesPtr) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.Reserved2 != other.Reserved2) return false
        if (this.InterruptLine != other.InterruptLine) return false
        if (this.InterruptPin != other.InterruptPin) return false
        if (this.MinimumGrant != other.MinimumGrant) return false
        if (this.MaximumLatency != other.MaximumLatency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BaseAddresses.contentHashCode()
        result = 31 * result + this.CIS.hashCode()
        result = 31 * result + this.SubVendorID.hashCode()
        result = 31 * result + this.SubSystemID.hashCode()
        result = 31 * result + this.ROMBaseAddress.hashCode()
        result = 31 * result + this.CapabilitiesPtr.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.Reserved2.hashCode()
        result = 31 * result + this.InterruptLine.hashCode()
        result = 31 * result + this.InterruptPin.hashCode()
        result = 31 * result + this.MinimumGrant.hashCode()
        result = 31 * result + this.MaximumLatency.hashCode()
        return result
    }
}

public class PCI_COMMON_HEADER_0_1(
    public var BaseAddresses: UIntArray = UIntArray(2),
    public var PrimaryBus: UByte = 0u,
    public var SecondaryBus: UByte = 0u,
    public var SubordinateBus: UByte = 0u,
    public var SecondaryLatency: UByte = 0u,
    public var IOBase: UByte = 0u,
    public var IOLimit: UByte = 0u,
    public var SecondaryStatus: UShort = 0u,
    public var MemoryBase: UShort = 0u,
    public var MemoryLimit: UShort = 0u,
    public var PrefetchBase: UShort = 0u,
    public var PrefetchLimit: UShort = 0u,
    public var PrefetchBaseUpper32: UInt = 0u,
    public var PrefetchLimitUpper32: UInt = 0u,
    public var IOBaseUpper16: UShort = 0u,
    public var IOLimitUpper16: UShort = 0u,
    public var CapabilitiesPtr: UByte = 0u,
    public var Reserved1: UByteArray = UByteArray(3),
    public var ROMBaseAddress: UInt = 0u,
    public var InterruptLine: UByte = 0u,
    public var InterruptPin: UByte = 0u,
    public var BridgeControl: UShort = 0u,
)

public data class PCI_COMMON_HEADER_0_2(
    public var SocketRegistersBaseAddress: UInt = 0u,
    public var CapabilitiesPtr: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var SecondaryStatus: UShort = 0u,
    public var PrimaryBus: UByte = 0u,
    public var SecondaryBus: UByte = 0u,
    public var SubordinateBus: UByte = 0u,
    public var SecondaryLatency: UByte = 0u,
    public var Range: List<PCI_COMMON_HEADER_0_2_0> = List(4) { PCI_COMMON_HEADER_0_2_0() },
    public var InterruptLine: UByte = 0u,
    public var InterruptPin: UByte = 0u,
    public var BridgeControl: UShort = 0u,
)

public data class PCI_COMMON_HEADER_0_2_0(public var Base: UInt = 0u, public var Limit: UInt = 0u)

public data class PCI_DEBUGGING_DEVICE_IN_USE(
    public var Segment: UShort = 0u,
    public var Bus: UInt = 0u,
    public var Slot: UInt = 0u,
)

public data class PCI_DEVICE_PRESENCE_PARAMETERS(
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var VendorID: UShort = 0u,
    public var DeviceID: UShort = 0u,
    public var RevisionID: UByte = 0u,
    public var SubVendorID: UShort = 0u,
    public var SubSystemID: UShort = 0u,
    public var BaseClass: UByte = 0u,
    public var SubClass: UByte = 0u,
    public var ProgIf: UByte = 0u,
)

public data class PCI_DEVICE_PRESENT_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var IsDevicePresent: PPCI_IS_DEVICE_PRESENT = null,
    public var IsDevicePresentEx: PPCI_IS_DEVICE_PRESENT_EX = null,
)

public data class PCI_EXPRESS_ACS_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Capability: PCI_EXPRESS_ACS_CAPABILITY_REGISTER = PCI_EXPRESS_ACS_CAPABILITY_REGISTER(),
    public var Control: PCI_EXPRESS_ACS_CONTROL = PCI_EXPRESS_ACS_CONTROL(),
    public var EgressControl: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_ACS_CAPABILITY) return false
        if (this.Header != other.Header) return false
        if (this.Capability != other.Capability) return false
        if (this.Control != other.Control) return false
        if (!this.EgressControl.contentEquals(other.EgressControl)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.Capability.hashCode()
        result = 31 * result + this.Control.hashCode()
        result = 31 * result + this.EgressControl.contentHashCode()
        return result
    }
}

public data class PCI_EXPRESS_ACS_CAPABILITY_REGISTER(public var Anonymous: PCI_EXPRESS_ACS_CAPABILITY_REGISTER_0 = PCI_EXPRESS_ACS_CAPABILITY_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_ACS_CAPABILITY_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ACS_CONTROL(public var Anonymous: PCI_EXPRESS_ACS_CONTROL_0 = PCI_EXPRESS_ACS_CONTROL_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_ACS_CONTROL_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_AER_CAPABILITIES(public var Anonymous: PCI_EXPRESS_AER_CAPABILITIES_0 = PCI_EXPRESS_AER_CAPABILITIES_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_AER_CAPABILITIES_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_AER_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var UncorrectableErrorStatus: PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS = PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS(),
    public var UncorrectableErrorMask: PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK = PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK(),
    public var UncorrectableErrorSeverity: PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY = PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY(),
    public var CorrectableErrorStatus: PCI_EXPRESS_CORRECTABLE_ERROR_STATUS = PCI_EXPRESS_CORRECTABLE_ERROR_STATUS(),
    public var CorrectableErrorMask: PCI_EXPRESS_CORRECTABLE_ERROR_MASK = PCI_EXPRESS_CORRECTABLE_ERROR_MASK(),
    public var CapabilitiesAndControl: PCI_EXPRESS_AER_CAPABILITIES = PCI_EXPRESS_AER_CAPABILITIES(),
    public var HeaderLog: UIntArray = UIntArray(4),
    public var SecUncorrectableErrorStatus: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS(),
    public var SecUncorrectableErrorMask: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK(),
    public var SecUncorrectableErrorSeverity: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY(),
    public var SecCapabilitiesAndControl: PCI_EXPRESS_SEC_AER_CAPABILITIES = PCI_EXPRESS_SEC_AER_CAPABILITIES(),
    public var SecHeaderLog: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_AER_CAPABILITY) return false
        if (this.Header != other.Header) return false
        if (this.UncorrectableErrorStatus != other.UncorrectableErrorStatus) return false
        if (this.UncorrectableErrorMask != other.UncorrectableErrorMask) return false
        if (this.UncorrectableErrorSeverity != other.UncorrectableErrorSeverity) return false
        if (this.CorrectableErrorStatus != other.CorrectableErrorStatus) return false
        if (this.CorrectableErrorMask != other.CorrectableErrorMask) return false
        if (this.CapabilitiesAndControl != other.CapabilitiesAndControl) return false
        if (!this.HeaderLog.contentEquals(other.HeaderLog)) return false
        if (this.SecUncorrectableErrorStatus != other.SecUncorrectableErrorStatus) return false
        if (this.SecUncorrectableErrorMask != other.SecUncorrectableErrorMask) return false
        if (this.SecUncorrectableErrorSeverity != other.SecUncorrectableErrorSeverity) return false
        if (this.SecCapabilitiesAndControl != other.SecCapabilitiesAndControl) return false
        if (!this.SecHeaderLog.contentEquals(other.SecHeaderLog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.UncorrectableErrorStatus.hashCode()
        result = 31 * result + this.UncorrectableErrorMask.hashCode()
        result = 31 * result + this.UncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.CorrectableErrorStatus.hashCode()
        result = 31 * result + this.CorrectableErrorMask.hashCode()
        result = 31 * result + this.CapabilitiesAndControl.hashCode()
        result = 31 * result + this.HeaderLog.contentHashCode()
        result = 31 * result + this.SecUncorrectableErrorStatus.hashCode()
        result = 31 * result + this.SecUncorrectableErrorMask.hashCode()
        result = 31 * result + this.SecUncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.SecCapabilitiesAndControl.hashCode()
        result = 31 * result + this.SecHeaderLog.contentHashCode()
        return result
    }
}

public data class PCI_EXPRESS_ARI_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Capability: PCI_EXPRESS_ARI_CAPABILITY_REGISTER = PCI_EXPRESS_ARI_CAPABILITY_REGISTER(),
    public var Control: PCI_EXPRESS_ARI_CONTROL_REGISTER = PCI_EXPRESS_ARI_CONTROL_REGISTER(),
)

public data class PCI_EXPRESS_ARI_CAPABILITY_REGISTER(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ARI_CONTROL_REGISTER(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ATS_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var Capability: PCI_EXPRESS_ATS_CAPABILITY_REGISTER = PCI_EXPRESS_ATS_CAPABILITY_REGISTER(),
    public var Control: PCI_EXPRESS_ATS_CONTROL_REGISTER = PCI_EXPRESS_ATS_CONTROL_REGISTER(),
)

public data class PCI_EXPRESS_ATS_CAPABILITY_REGISTER(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ATS_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_ATS_CONTROL_REGISTER_0 = PCI_EXPRESS_ATS_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_ATS_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_BRIDGE_AER_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var UncorrectableErrorStatus: PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS = PCI_EXPRESS_UNCORRECTABLE_ERROR_STATUS(),
    public var UncorrectableErrorMask: PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK = PCI_EXPRESS_UNCORRECTABLE_ERROR_MASK(),
    public var UncorrectableErrorSeverity: PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY = PCI_EXPRESS_UNCORRECTABLE_ERROR_SEVERITY(),
    public var CorrectableErrorStatus: PCI_EXPRESS_CORRECTABLE_ERROR_STATUS = PCI_EXPRESS_CORRECTABLE_ERROR_STATUS(),
    public var CorrectableErrorMask: PCI_EXPRESS_CORRECTABLE_ERROR_MASK = PCI_EXPRESS_CORRECTABLE_ERROR_MASK(),
    public var CapabilitiesAndControl: PCI_EXPRESS_AER_CAPABILITIES = PCI_EXPRESS_AER_CAPABILITIES(),
    public var HeaderLog: UIntArray = UIntArray(4),
    public var SecUncorrectableErrorStatus: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_STATUS(),
    public var SecUncorrectableErrorMask: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_MASK(),
    public var SecUncorrectableErrorSeverity: PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY = PCI_EXPRESS_SEC_UNCORRECTABLE_ERROR_SEVERITY(),
    public var SecCapabilitiesAndControl: PCI_EXPRESS_SEC_AER_CAPABILITIES = PCI_EXPRESS_SEC_AER_CAPABILITIES(),
    public var SecHeaderLog: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_BRIDGE_AER_CAPABILITY) return false
        if (this.Header != other.Header) return false
        if (this.UncorrectableErrorStatus != other.UncorrectableErrorStatus) return false
        if (this.UncorrectableErrorMask != other.UncorrectableErrorMask) return false
        if (this.UncorrectableErrorSeverity != other.UncorrectableErrorSeverity) return false
        if (this.CorrectableErrorStatus != other.CorrectableErrorStatus) return false
        if (this.CorrectableErrorMask != other.CorrectableErrorMask) return false
        if (this.CapabilitiesAndControl != other.CapabilitiesAndControl) return false
        if (!this.HeaderLog.contentEquals(other.HeaderLog)) return false
        if (this.SecUncorrectableErrorStatus != other.SecUncorrectableErrorStatus) return false
        if (this.SecUncorrectableErrorMask != other.SecUncorrectableErrorMask) return false
        if (this.SecUncorrectableErrorSeverity != other.SecUncorrectableErrorSeverity) return false
        if (this.SecCapabilitiesAndControl != other.SecCapabilitiesAndControl) return false
        if (!this.SecHeaderLog.contentEquals(other.SecHeaderLog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.UncorrectableErrorStatus.hashCode()
        result = 31 * result + this.UncorrectableErrorMask.hashCode()
        result = 31 * result + this.UncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.CorrectableErrorStatus.hashCode()
        result = 31 * result + this.CorrectableErrorMask.hashCode()
        result = 31 * result + this.CapabilitiesAndControl.hashCode()
        result = 31 * result + this.HeaderLog.contentHashCode()
        result = 31 * result + this.SecUncorrectableErrorStatus.hashCode()
        result = 31 * result + this.SecUncorrectableErrorMask.hashCode()
        result = 31 * result + this.SecUncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.SecCapabilitiesAndControl.hashCode()
        result = 31 * result + this.SecHeaderLog.contentHashCode()
        return result
    }
}

public data class PCI_EXPRESS_CAPABILITIES_REGISTER(public var Anonymous: PCI_EXPRESS_CAPABILITIES_REGISTER_0 = PCI_EXPRESS_CAPABILITIES_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_CAPABILITIES_REGISTER_0(public var _bitfield: UShort = 0u)

public class PCI_EXPRESS_CAPABILITY(
    public var Header: PCI_CAPABILITIES_HEADER = PCI_CAPABILITIES_HEADER(),
    public var ExpressCapabilities: PCI_EXPRESS_CAPABILITIES_REGISTER = PCI_EXPRESS_CAPABILITIES_REGISTER(),
    public var DeviceCapabilities: PCI_EXPRESS_DEVICE_CAPABILITIES_REGISTER = PCI_EXPRESS_DEVICE_CAPABILITIES_REGISTER(),
    public var DeviceControl: PCI_EXPRESS_DEVICE_CONTROL_REGISTER = PCI_EXPRESS_DEVICE_CONTROL_REGISTER(),
    public var DeviceStatus: PCI_EXPRESS_DEVICE_STATUS_REGISTER = PCI_EXPRESS_DEVICE_STATUS_REGISTER(),
    public var LinkCapabilities: PCI_EXPRESS_LINK_CAPABILITIES_REGISTER = PCI_EXPRESS_LINK_CAPABILITIES_REGISTER(),
    public var LinkControl: PCI_EXPRESS_LINK_CONTROL_REGISTER = PCI_EXPRESS_LINK_CONTROL_REGISTER(),
    public var LinkStatus: PCI_EXPRESS_LINK_STATUS_REGISTER = PCI_EXPRESS_LINK_STATUS_REGISTER(),
    public var SlotCapabilities: PCI_EXPRESS_SLOT_CAPABILITIES_REGISTER = PCI_EXPRESS_SLOT_CAPABILITIES_REGISTER(),
    public var SlotControl: PCI_EXPRESS_SLOT_CONTROL_REGISTER = PCI_EXPRESS_SLOT_CONTROL_REGISTER(),
    public var SlotStatus: PCI_EXPRESS_SLOT_STATUS_REGISTER = PCI_EXPRESS_SLOT_STATUS_REGISTER(),
    public var RootControl: PCI_EXPRESS_ROOT_CONTROL_REGISTER = PCI_EXPRESS_ROOT_CONTROL_REGISTER(),
    public var RootCapabilities: PCI_EXPRESS_ROOT_CAPABILITIES_REGISTER = PCI_EXPRESS_ROOT_CAPABILITIES_REGISTER(),
    public var RootStatus: PCI_EXPRESS_ROOT_STATUS_REGISTER = PCI_EXPRESS_ROOT_STATUS_REGISTER(),
    public var DeviceCapabilities2: PCI_EXPRESS_DEVICE_CAPABILITIES_2_REGISTER = PCI_EXPRESS_DEVICE_CAPABILITIES_2_REGISTER(),
    public var DeviceControl2: PCI_EXPRESS_DEVICE_CONTROL_2_REGISTER = PCI_EXPRESS_DEVICE_CONTROL_2_REGISTER(),
    public var DeviceStatus2: PCI_EXPRESS_DEVICE_STATUS_2_REGISTER = PCI_EXPRESS_DEVICE_STATUS_2_REGISTER(),
    public var LinkCapabilities2: PCI_EXPRESS_LINK_CAPABILITIES_2_REGISTER = PCI_EXPRESS_LINK_CAPABILITIES_2_REGISTER(),
    public var LinkControl2: PCI_EXPRESS_LINK_CONTROL_2_REGISTER = PCI_EXPRESS_LINK_CONTROL_2_REGISTER(),
    public var LinkStatus2: PCI_EXPRESS_LINK_STATUS_2_REGISTER = PCI_EXPRESS_LINK_STATUS_2_REGISTER(),
)

public data class PCI_EXPRESS_CORRECTABLE_ERROR_MASK(public var Anonymous: PCI_EXPRESS_CORRECTABLE_ERROR_MASK_0 = PCI_EXPRESS_CORRECTABLE_ERROR_MASK_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_CORRECTABLE_ERROR_MASK_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_CORRECTABLE_ERROR_STATUS(public var Anonymous: PCI_EXPRESS_CORRECTABLE_ERROR_STATUS_0 = PCI_EXPRESS_CORRECTABLE_ERROR_STATUS_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_CORRECTABLE_ERROR_STATUS_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var DvsecHeader1: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1(),
    public var DvsecHeader2: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2(),
    public var Reserved: UByteArray = UByteArray(46),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_CXL_DVSEC_CAPABILITY) return false
        if (this.Header != other.Header) return false
        if (this.DvsecHeader1 != other.DvsecHeader1) return false
        if (this.DvsecHeader2 != other.DvsecHeader2) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.DvsecHeader1.hashCode()
        result = 31 * result + this.DvsecHeader2.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class PCI_EXPRESS_CXL_DVSEC_CAPABILITY_REGISTER_V11(public var Anonymous: PCI_EXPRESS_CXL_DVSEC_CAPABILITY_REGISTER_V11_0 = PCI_EXPRESS_CXL_DVSEC_CAPABILITY_REGISTER_V11_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_CAPABILITY_REGISTER_V11_0(public var _bitfield: UShort = 0u)

public class PCI_EXPRESS_CXL_DVSEC_CAPABILITY_V11(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var DvsecHeader1: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1(),
    public var DvsecHeader2: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2(),
    public var Capability: PCI_EXPRESS_CXL_DVSEC_CAPABILITY_REGISTER_V11 = PCI_EXPRESS_CXL_DVSEC_CAPABILITY_REGISTER_V11(),
    public var Control: PCI_EXPRESS_CXL_DVSEC_CONTROL_REGISTER = PCI_EXPRESS_CXL_DVSEC_CONTROL_REGISTER(),
    public var Status: PCI_EXPRESS_CXL_DVSEC_STATUS_REGISTER = PCI_EXPRESS_CXL_DVSEC_STATUS_REGISTER(),
    public var Control2: UShort = 0u,
    public var Status2: UShort = 0u,
    public var Lock: PCI_EXPRESS_CXL_DVSEC_LOCK_REGISTER = PCI_EXPRESS_CXL_DVSEC_LOCK_REGISTER(),
    public var Reserved: UShort = 0u,
    public var Range1SizeHigh: PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_HIGH_REGISTER = PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_HIGH_REGISTER(),
    public var Range1SizeLow: PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11 = PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11(),
    public var Range1BaseHigh: PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_HIGH_REGISTER = PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_HIGH_REGISTER(),
    public var Range1BaseLow: PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER = PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER(),
    public var Range2SizeHigh: PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_HIGH_REGISTER = PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_HIGH_REGISTER(),
    public var Range2SizeLow: PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11 = PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11(),
    public var Range2BaseHigh: PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_HIGH_REGISTER = PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_HIGH_REGISTER(),
    public var Range2BaseLow: PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER = PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER(),
)

public data class PCI_EXPRESS_CXL_DVSEC_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_CXL_DVSEC_CONTROL_REGISTER_0 = PCI_EXPRESS_CXL_DVSEC_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_LOCK_REGISTER(public var Anonymous: PCI_EXPRESS_CXL_DVSEC_LOCK_REGISTER_0 = PCI_EXPRESS_CXL_DVSEC_LOCK_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_LOCK_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_HIGH_REGISTER(public var MemBaseHigh: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER(public var Anonymous: PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER_0 = PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_RANGE_BASE_LOW_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_HIGH_REGISTER(public var MemSizeHigh: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11(public var Anonymous: PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11_0 = PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_RANGE_SIZE_LOW_REGISTER_V11_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_CXL_DVSEC_STATUS_REGISTER_0 = PCI_EXPRESS_CXL_DVSEC_STATUS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_CXL_DVSEC_STATUS_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var DvsecHeader1: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1(),
    public var DvsecHeader2: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2(),
    public var DvsecRegisters: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_CAPABILITY) return false
        if (this.Header != other.Header) return false
        if (this.DvsecHeader1 != other.DvsecHeader1) return false
        if (this.DvsecHeader2 != other.DvsecHeader2) return false
        if (!this.DvsecRegisters.contentEquals(other.DvsecRegisters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Header.hashCode()
        result = 31 * result + this.DvsecHeader1.hashCode()
        result = 31 * result + this.DvsecHeader2.hashCode()
        result = 31 * result + this.DvsecRegisters.contentHashCode()
        return result
    }
}

public data class PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1(public var Anonymous: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1_0 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_1_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2(public var Anonymous: PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2_0 = PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DESIGNATED_VENDOR_SPECIFIC_HEADER_2_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_CAPABILITIES_2_REGISTER(public var Anonymous: PCI_EXPRESS_DEVICE_CAPABILITIES_2_REGISTER_0 = PCI_EXPRESS_DEVICE_CAPABILITIES_2_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DEVICE_CAPABILITIES_2_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DEVICE_CAPABILITIES_REGISTER(public var Anonymous: PCI_EXPRESS_DEVICE_CAPABILITIES_REGISTER_0 = PCI_EXPRESS_DEVICE_CAPABILITIES_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DEVICE_CAPABILITIES_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DEVICE_CONTROL_2_REGISTER(public var Anonymous: PCI_EXPRESS_DEVICE_CONTROL_2_REGISTER_0 = PCI_EXPRESS_DEVICE_CONTROL_2_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_CONTROL_2_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_CONTROL_REGISTER(
    public var Anonymous1: PCI_EXPRESS_DEVICE_CONTROL_REGISTER_0 = PCI_EXPRESS_DEVICE_CONTROL_REGISTER_0(),
    public var Anonymous2: PCI_EXPRESS_DEVICE_CONTROL_REGISTER_1 = PCI_EXPRESS_DEVICE_CONTROL_REGISTER_1(),
    public var AsUSHORT: UShort = 0u,
)

public data class PCI_EXPRESS_DEVICE_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_CONTROL_REGISTER_1(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_STATUS_2_REGISTER(public var Anonymous: PCI_EXPRESS_DEVICE_STATUS_2_REGISTER_0 = PCI_EXPRESS_DEVICE_STATUS_2_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_STATUS_2_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_DEVICE_STATUS_REGISTER_0 = PCI_EXPRESS_DEVICE_STATUS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DEVICE_STATUS_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DPC_CAPABILITY(
    public var Header: PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER = PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(),
    public var DpcCapabilities: PCI_EXPRESS_DPC_CAPS_REGISTER = PCI_EXPRESS_DPC_CAPS_REGISTER(),
    public var DpcControl: PCI_EXPRESS_DPC_CONTROL_REGISTER = PCI_EXPRESS_DPC_CONTROL_REGISTER(),
    public var DpcStatus: PCI_EXPRESS_DPC_STATUS_REGISTER = PCI_EXPRESS_DPC_STATUS_REGISTER(),
    public var DpcErrSrcId: PCI_EXPRESS_DPC_ERROR_SOURCE_ID = PCI_EXPRESS_DPC_ERROR_SOURCE_ID(),
    public var RpPioStatus: PCI_EXPRESS_DPC_RP_PIO_STATUS_REGISTER = PCI_EXPRESS_DPC_RP_PIO_STATUS_REGISTER(),
    public var RpPioMask: PCI_EXPRESS_DPC_RP_PIO_MASK_REGISTER = PCI_EXPRESS_DPC_RP_PIO_MASK_REGISTER(),
    public var RpPioSeverity: PCI_EXPRESS_DPC_RP_PIO_SEVERITY_REGISTER = PCI_EXPRESS_DPC_RP_PIO_SEVERITY_REGISTER(),
    public var RpPioSysError: PCI_EXPRESS_DPC_RP_PIO_SYSERR_REGISTER = PCI_EXPRESS_DPC_RP_PIO_SYSERR_REGISTER(),
    public var RpPioException: PCI_EXPRESS_DPC_RP_PIO_EXCEPTION_REGISTER = PCI_EXPRESS_DPC_RP_PIO_EXCEPTION_REGISTER(),
    public var RpPioHeaderLog: PCI_EXPRESS_DPC_RP_PIO_HEADERLOG_REGISTER = PCI_EXPRESS_DPC_RP_PIO_HEADERLOG_REGISTER(),
    public var RpPioImpSpecLog: PCI_EXPRESS_DPC_RP_PIO_IMPSPECLOG_REGISTER = PCI_EXPRESS_DPC_RP_PIO_IMPSPECLOG_REGISTER(),
    public var RpPioPrefixLog: PCI_EXPRESS_DPC_RP_PIO_TLPPREFIXLOG_REGISTER = PCI_EXPRESS_DPC_RP_PIO_TLPPREFIXLOG_REGISTER(),
)

public data class PCI_EXPRESS_DPC_CAPS_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_CAPS_REGISTER_0 = PCI_EXPRESS_DPC_CAPS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DPC_CAPS_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DPC_CONTROL_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_CONTROL_REGISTER_0 = PCI_EXPRESS_DPC_CONTROL_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DPC_CONTROL_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DPC_ERROR_SOURCE_ID(public var Anonymous: PCI_EXPRESS_DPC_ERROR_SOURCE_ID_0 = PCI_EXPRESS_DPC_ERROR_SOURCE_ID_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DPC_ERROR_SOURCE_ID_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_EXCEPTION_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_RP_PIO_EXCEPTION_REGISTER_0 = PCI_EXPRESS_DPC_RP_PIO_EXCEPTION_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_EXCEPTION_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_HEADERLOG_REGISTER(public var PioHeaderLogRegister: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_DPC_RP_PIO_HEADERLOG_REGISTER) return false
        if (!this.PioHeaderLogRegister.contentEquals(other.PioHeaderLogRegister)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.PioHeaderLogRegister.contentHashCode()
    }
}

public data class PCI_EXPRESS_DPC_RP_PIO_IMPSPECLOG_REGISTER(public var PioImpSpecLog: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_MASK_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_RP_PIO_MASK_REGISTER_0 = PCI_EXPRESS_DPC_RP_PIO_MASK_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_MASK_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_SEVERITY_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_RP_PIO_SEVERITY_REGISTER_0 = PCI_EXPRESS_DPC_RP_PIO_SEVERITY_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_SEVERITY_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_RP_PIO_STATUS_REGISTER_0 = PCI_EXPRESS_DPC_RP_PIO_STATUS_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_STATUS_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_SYSERR_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_RP_PIO_SYSERR_REGISTER_0 = PCI_EXPRESS_DPC_RP_PIO_SYSERR_REGISTER_0(), public var AsULONG: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_SYSERR_REGISTER_0(public var _bitfield: UInt = 0u)

public data class PCI_EXPRESS_DPC_RP_PIO_TLPPREFIXLOG_REGISTER(public var PioTlpPrefixLogRegister: UIntArray = UIntArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PCI_EXPRESS_DPC_RP_PIO_TLPPREFIXLOG_REGISTER) return false
        if (!this.PioTlpPrefixLogRegister.contentEquals(other.PioTlpPrefixLogRegister)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.PioTlpPrefixLogRegister.contentHashCode()
    }
}

public data class PCI_EXPRESS_DPC_STATUS_REGISTER(public var Anonymous: PCI_EXPRESS_DPC_STATUS_REGISTER_0 = PCI_EXPRESS_DPC_STATUS_REGISTER_0(), public var AsUSHORT: UShort = 0u)

public data class PCI_EXPRESS_DPC_STATUS_REGISTER_0(public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ENHANCED_CAPABILITY_HEADER(public var CapabilityID: UShort = 0u, public var _bitfield: UShort = 0u)

public data class PCI_EXPRESS_ERROR_SOURCE_ID(public var Anonymous: PCI_EXPRESS_ERROR_SOURCE_ID_0 = PCI_EXPRESS_ERROR_SOURCE_ID_0(), public var AsULONG: UInt = 0u)
