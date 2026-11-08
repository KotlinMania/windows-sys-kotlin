@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DRIVER_CONTROL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_ERROR_SOURCE_TYPE
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WHEA_NOTIFICATION_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY

public data class REG_LOAD_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var KeyName: Long = 0L,
    public var SourceFile: Long = 0L,
    public var Flags: UInt = 0u,
    public var TrustClassObject: Long = 0L,
    public var UserEvent: Long = 0L,
    public var DesiredAccess: UInt = 0u,
    public var RootHandle: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_LOAD_KEY_INFORMATION_V2(
    public var Object: Long = 0L,
    public var KeyName: Long = 0L,
    public var SourceFile: Long = 0L,
    public var Flags: UInt = 0u,
    public var TrustClassObject: Long = 0L,
    public var UserEvent: Long = 0L,
    public var DesiredAccess: UInt = 0u,
    public var RootHandle: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Version: ULong = 0uL,
    public var FileAccessToken: Long = 0L,
)

public data class REG_POST_CREATE_KEY_INFORMATION(
    public var CompleteName: Long = 0L,
    public var Object: Long = 0L,
    public var Status: NTSTATUS = 0,
)

public data class REG_POST_OPERATION_INFORMATION(
    public var Object: Long = 0L,
    public var Status: NTSTATUS = 0,
    public var PreInformation: Long = 0L,
    public var ReturnStatus: NTSTATUS = 0,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_PRE_CREATE_KEY_INFORMATION(public var CompleteName: Long = 0L)

public data class REG_QUERY_KEY_NAME(
    public var Object: Long = 0L,
    public var ObjectNameInfo: Long = 0L,
    public var Length: UInt = 0u,
    public var ReturnLength: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_QUERY_KEY_SECURITY_INFORMATION(
    public var Object: Long = 0L,
    public var SecurityInformation: Long = 0L,
    public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var Length: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_RENAME_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var NewName: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_REPLACE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var OldFileName: Long = 0L,
    public var NewFileName: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_RESTORE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var FileHandle: HANDLE = 0L,
    public var Flags: UInt = 0u,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_SAVE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var FileHandle: HANDLE = 0L,
    public var Format: UInt = 0u,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_SAVE_MERGED_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var FileHandle: HANDLE = 0L,
    public var HighKeyObject: Long = 0L,
    public var LowKeyObject: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_SET_KEY_SECURITY_INFORMATION(
    public var Object: Long = 0L,
    public var SecurityInformation: Long = 0L,
    public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_SET_VALUE_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var ValueName: Long = 0L,
    public var TitleIndex: UInt = 0u,
    public var Type: UInt = 0u,
    public var Data: Long = 0L,
    public var DataSize: UInt = 0u,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class REG_UNLOAD_KEY_INFORMATION(
    public var Object: Long = 0L,
    public var UserEvent: Long = 0L,
    public var CallContext: Long = 0L,
    public var ObjectContext: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class RESOURCE_HASH_ENTRY(
    public var ListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var Address: Long = 0L,
    public var ContentionCount: UInt = 0u,
    public var Number: UInt = 0u,
)

public data class RESOURCE_PERFORMANCE_DATA(
    public var ActiveResourceCount: UInt = 0u,
    public var TotalResourceCount: UInt = 0u,
    public var ExclusiveAcquire: UInt = 0u,
    public var SharedFirstLevel: UInt = 0u,
    public var SharedSecondLevel: UInt = 0u,
    public var StarveFirstLevel: UInt = 0u,
    public var StarveSecondLevel: UInt = 0u,
    public var WaitForExclusive: UInt = 0u,
    public var OwnerTableExpands: UInt = 0u,
    public var MaximumTableExpand: UInt = 0u,
    public var HashTable: List<LIST_ENTRY> = List(64) { LIST_ENTRY() },
)

public data class RTL_AVL_TABLE(
    public var BalancedRoot: RTL_BALANCED_LINKS = RTL_BALANCED_LINKS(),
    public var OrderedPointer: Long = 0L,
    public var WhichOrderedElement: UInt = 0u,
    public var NumberGenericTableElements: UInt = 0u,
    public var DepthOfTree: UInt = 0u,
    public var RestartKey: Long = 0L,
    public var DeleteCount: UInt = 0u,
    public var CompareRoutine: PRTL_AVL_COMPARE_ROUTINE = null,
    public var AllocateRoutine: PRTL_AVL_ALLOCATE_ROUTINE = null,
    public var FreeRoutine: PRTL_AVL_FREE_ROUTINE = null,
    public var TableContext: Long = 0L,
)

public data class RTL_BALANCED_LINKS(
    public var Parent: Long = 0L,
    public var LeftChild: Long = 0L,
    public var RightChild: Long = 0L,
    public var Balance: Byte = 0,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RTL_BALANCED_LINKS) return false
        if (this.Parent != other.Parent) return false
        if (this.LeftChild != other.LeftChild) return false
        if (this.RightChild != other.RightChild) return false
        if (this.Balance != other.Balance) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Parent.hashCode()
        result = 31 * result + this.LeftChild.hashCode()
        result = 31 * result + this.RightChild.hashCode()
        result = 31 * result + this.Balance.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class RTL_BITMAP(public var SizeOfBitMap: UInt = 0u, public var Buffer: Long = 0L)

public data class RTL_BITMAP_RUN(public var StartingIndex: UInt = 0u, public var NumberOfBits: UInt = 0u)

public data class RTL_DYNAMIC_HASH_TABLE(
    public var Flags: UInt = 0u,
    public var Shift: UInt = 0u,
    public var TableSize: UInt = 0u,
    public var Pivot: UInt = 0u,
    public var DivisorMask: UInt = 0u,
    public var NumEntries: UInt = 0u,
    public var NonEmptyBuckets: UInt = 0u,
    public var NumEnumerators: UInt = 0u,
    public var Directory: Long = 0L,
)

public data class RTL_DYNAMIC_HASH_TABLE_CONTEXT(
    public var ChainHead: Long = 0L,
    public var PrevLinkage: Long = 0L,
    public var Signature: ULong = 0uL,
)

public data class RTL_DYNAMIC_HASH_TABLE_ENTRY(public var Linkage: LIST_ENTRY = LIST_ENTRY(), public var Signature: ULong = 0uL)

public data class RTL_DYNAMIC_HASH_TABLE_ENUMERATOR(
    public var Anonymous: RTL_DYNAMIC_HASH_TABLE_ENUMERATOR_0 = RTL_DYNAMIC_HASH_TABLE_ENUMERATOR_0(),
    public var ChainHead: Long = 0L,
    public var BucketIndex: UInt = 0u,
)

public data class RTL_DYNAMIC_HASH_TABLE_ENUMERATOR_0(public var HashEntry: RTL_DYNAMIC_HASH_TABLE_ENTRY = RTL_DYNAMIC_HASH_TABLE_ENTRY(), public var CurEntry: Long = 0L)

public data class RTL_GENERIC_TABLE(
    public var TableRoot: Long = 0L,
    public var InsertOrderList: LIST_ENTRY = LIST_ENTRY(),
    public var OrderedPointer: Long = 0L,
    public var WhichOrderedElement: UInt = 0u,
    public var NumberGenericTableElements: UInt = 0u,
    public var CompareRoutine: PRTL_GENERIC_COMPARE_ROUTINE = null,
    public var AllocateRoutine: PRTL_GENERIC_ALLOCATE_ROUTINE = null,
    public var FreeRoutine: PRTL_GENERIC_FREE_ROUTINE = null,
    public var TableContext: Long = 0L,
)

public data class RTL_QUERY_REGISTRY_TABLE(
    public var QueryRoutine: PRTL_QUERY_REGISTRY_ROUTINE = null,
    public var Flags: UInt = 0u,
    public var Name: PWSTR = 0L,
    public var EntryContext: Long = 0L,
    public var DefaultType: UInt = 0u,
    public var DefaultData: Long = 0L,
    public var DefaultLength: UInt = 0u,
)

public data class SCATTER_GATHER_ELEMENT(
    public var Address: Long = 0L,
    public var Length: UInt = 0u,
    public var Reserved: ULong = 0uL,
)

public data class SCATTER_GATHER_LIST(
    public var NumberOfElements: UInt = 0u,
    public var Reserved: ULong = 0uL,
    public var Elements: List<SCATTER_GATHER_ELEMENT> = List(1) { SCATTER_GATHER_ELEMENT() },
)

public data class SDEV_IDENTIFIER_INTERFACE(public var InterfaceHeader: INTERFACE = INTERFACE(), public var GetIdentifier: PGET_SDEV_IDENTIFIER = null)

public data class SECURE_DRIVER_INTERFACE(
    public var InterfaceHeader: INTERFACE = INTERFACE(),
    public var ProcessReference: PSECURE_DRIVER_PROCESS_REFERENCE = null,
    public var ProcessDereference: PSECURE_DRIVER_PROCESS_DEREFERENCE = null,
    public var Reserved: UInt = 0u,
)

public data class SHARE_ACCESS(
    public var OpenCount: UInt = 0u,
    public var Readers: UInt = 0u,
    public var Writers: UInt = 0u,
    public var Deleters: UInt = 0u,
    public var SharedRead: UInt = 0u,
    public var SharedWrite: UInt = 0u,
    public var SharedDelete: UInt = 0u,
)

public data class SIGNAL_REG_VALUE(
    public var RegName: UByteArray = UByteArray(32),
    public var MsrAddr: UInt = 0u,
    public var Value: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SIGNAL_REG_VALUE) return false
        if (!this.RegName.contentEquals(other.RegName)) return false
        if (this.MsrAddr != other.MsrAddr) return false
        if (this.Value != other.Value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RegName.contentHashCode()
        result = 31 * result + this.MsrAddr.hashCode()
        result = 31 * result + this.Value.hashCode()
        return result
    }
}

public data class SILO_MONITOR_REGISTRATION(
    public var Version: UByte = 0u,
    public var MonitorHost: Boolean = false,
    public var MonitorExistingSilos: Boolean = false,
    public var Reserved: UByteArray = UByteArray(5),
    public var Anonymous: SILO_MONITOR_REGISTRATION_0 = SILO_MONITOR_REGISTRATION_0(),
    public var CreateCallback: SILO_MONITOR_CREATE_CALLBACK = null,
    public var TerminateCallback: SILO_MONITOR_TERMINATE_CALLBACK = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SILO_MONITOR_REGISTRATION) return false
        if (this.Version != other.Version) return false
        if (this.MonitorHost != other.MonitorHost) return false
        if (this.MonitorExistingSilos != other.MonitorExistingSilos) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.CreateCallback != other.CreateCallback) return false
        if (this.TerminateCallback != other.TerminateCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.MonitorHost.hashCode()
        result = 31 * result + this.MonitorExistingSilos.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.CreateCallback.hashCode()
        result = 31 * result + this.TerminateCallback.hashCode()
        return result
    }
}

public data class SILO_MONITOR_REGISTRATION_0(public var DriverObjectName: Long = 0L, public var ComponentName: Long = 0L)

public data class SOC_SUBSYSTEM_FAILURE_DETAILS(
    public var SubsysType: SOC_SUBSYSTEM_TYPE = 0,
    public var FirmwareVersion: ULong = 0uL,
    public var HardwareVersion: ULong = 0uL,
    public var UnifiedFailureRegionSize: UInt = 0u,
    public var UnifiedFailureRegion: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOC_SUBSYSTEM_FAILURE_DETAILS) return false
        if (this.SubsysType != other.SubsysType) return false
        if (this.FirmwareVersion != other.FirmwareVersion) return false
        if (this.HardwareVersion != other.HardwareVersion) return false
        if (this.UnifiedFailureRegionSize != other.UnifiedFailureRegionSize) return false
        if (!this.UnifiedFailureRegion.contentEquals(other.UnifiedFailureRegion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SubsysType.hashCode()
        result = 31 * result + this.FirmwareVersion.hashCode()
        result = 31 * result + this.HardwareVersion.hashCode()
        result = 31 * result + this.UnifiedFailureRegionSize.hashCode()
        result = 31 * result + this.UnifiedFailureRegion.contentHashCode()
        return result
    }
}

public data class SYSTEM_FIRMWARE_TABLE_HANDLER(
    public var ProviderSignature: UInt = 0u,
    public var Register: Boolean = false,
    public var FirmwareTableHandler: PFNFTH = null,
    public var DriverObject: Long = 0L,
)

public data class SYSTEM_FIRMWARE_TABLE_INFORMATION(
    public var ProviderSignature: UInt = 0u,
    public var Action: SYSTEM_FIRMWARE_TABLE_ACTION = 0,
    public var TableID: UInt = 0u,
    public var TableBufferLength: UInt = 0u,
    public var TableBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_FIRMWARE_TABLE_INFORMATION) return false
        if (this.ProviderSignature != other.ProviderSignature) return false
        if (this.Action != other.Action) return false
        if (this.TableID != other.TableID) return false
        if (this.TableBufferLength != other.TableBufferLength) return false
        if (!this.TableBuffer.contentEquals(other.TableBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProviderSignature.hashCode()
        result = 31 * result + this.Action.hashCode()
        result = 31 * result + this.TableID.hashCode()
        result = 31 * result + this.TableBufferLength.hashCode()
        result = 31 * result + this.TableBuffer.contentHashCode()
        return result
    }
}

public data class SYSTEM_POWER_STATE_CONTEXT(public var Anonymous: SYSTEM_POWER_STATE_CONTEXT_0 = SYSTEM_POWER_STATE_CONTEXT_0())

public data class SYSTEM_POWER_STATE_CONTEXT_0(public var Anonymous: SYSTEM_POWER_STATE_CONTEXT_0_0 = SYSTEM_POWER_STATE_CONTEXT_0_0(), public var ContextAsUlong: UInt = 0u)

public data class SYSTEM_POWER_STATE_CONTEXT_0_0(public var _bitfield: UInt = 0u)

public data class TARGET_DEVICE_REMOVAL_NOTIFICATION(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Event: GUID = GUID(),
    public var FileObject: Long = 0L,
)

public data class TIMER_SET_COALESCABLE_TIMER_INFO(
    public var DueTime: Long = 0L,
    public var TimerApcRoutine: PTIMER_APC_ROUTINE = null,
    public var TimerContext: Long = 0L,
    public var WakeContext: Long = 0L,
    public var Period: UInt = 0u,
    public var TolerableDelay: UInt = 0u,
    public var PreviousState: Long = 0L,
)

public data class TIME_FIELDS(
    public var Year: Short = 0,
    public var Month: Short = 0,
    public var Day: Short = 0,
    public var Hour: Short = 0,
    public var Minute: Short = 0,
    public var Second: Short = 0,
    public var Milliseconds: Short = 0,
    public var Weekday: Short = 0,
)

public data class TRANSLATOR_INTERFACE(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Context: Long = 0L,
    public var InterfaceReference: PINTERFACE_REFERENCE = null,
    public var InterfaceDereference: PINTERFACE_DEREFERENCE = null,
    public var TranslateResources: PTRANSLATE_RESOURCE_HANDLER = null,
    public var TranslateResourceRequirements: PTRANSLATE_RESOURCE_REQUIREMENTS_HANDLER = null,
)

public data class TXN_PARAMETER_BLOCK(
    public var Length: UShort = 0u,
    public var TxFsContext: UShort = 0u,
    public var TransactionObject: Long = 0L,
)

public data class VIRTUAL_CHANNEL_CAPABILITIES1(public var Anonymous: VIRTUAL_CHANNEL_CAPABILITIES1_0 = VIRTUAL_CHANNEL_CAPABILITIES1_0(), public var AsULONG: UInt = 0u)

public data class VIRTUAL_CHANNEL_CAPABILITIES1_0(public var _bitfield: UInt = 0u)

public data class VIRTUAL_CHANNEL_CAPABILITIES2(public var Anonymous: VIRTUAL_CHANNEL_CAPABILITIES2_0 = VIRTUAL_CHANNEL_CAPABILITIES2_0(), public var AsULONG: UInt = 0u)

public data class VIRTUAL_CHANNEL_CAPABILITIES2_0(public var _bitfield: UInt = 0u)

public data class VIRTUAL_CHANNEL_CONTROL(public var Anonymous: VIRTUAL_CHANNEL_CONTROL_0 = VIRTUAL_CHANNEL_CONTROL_0(), public var AsUSHORT: UShort = 0u)

public data class VIRTUAL_CHANNEL_CONTROL_0(public var _bitfield: UShort = 0u)

public data class VIRTUAL_CHANNEL_STATUS(public var Anonymous: VIRTUAL_CHANNEL_STATUS_0 = VIRTUAL_CHANNEL_STATUS_0(), public var AsUSHORT: UShort = 0u)

public data class VIRTUAL_CHANNEL_STATUS_0(public var _bitfield: UShort = 0u)

public data class VIRTUAL_RESOURCE(
    public var Capability: VIRTUAL_RESOURCE_CAPABILITY = VIRTUAL_RESOURCE_CAPABILITY(),
    public var Control: VIRTUAL_RESOURCE_CONTROL = VIRTUAL_RESOURCE_CONTROL(),
    public var RsvdP: UShort = 0u,
    public var Status: VIRTUAL_RESOURCE_STATUS = VIRTUAL_RESOURCE_STATUS(),
)

public data class VIRTUAL_RESOURCE_CAPABILITY(public var Anonymous: VIRTUAL_RESOURCE_CAPABILITY_0 = VIRTUAL_RESOURCE_CAPABILITY_0(), public var AsULONG: UInt = 0u)

public data class VIRTUAL_RESOURCE_CAPABILITY_0(public var _bitfield: UInt = 0u)

public data class VIRTUAL_RESOURCE_CONTROL(public var Anonymous: VIRTUAL_RESOURCE_CONTROL_0 = VIRTUAL_RESOURCE_CONTROL_0(), public var AsULONG: UInt = 0u)

public data class VIRTUAL_RESOURCE_CONTROL_0(public var _bitfield: UInt = 0u)

public data class VIRTUAL_RESOURCE_STATUS(public var Anonymous: VIRTUAL_RESOURCE_STATUS_0 = VIRTUAL_RESOURCE_STATUS_0(), public var AsUSHORT: UShort = 0u)

public data class VIRTUAL_RESOURCE_STATUS_0(public var _bitfield: UShort = 0u)

public data class VM_COUNTERS(
    public var PeakVirtualSize: ULong = 0uL,
    public var VirtualSize: ULong = 0uL,
    public var PageFaultCount: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var QuotaPeakPagedPoolUsage: ULong = 0uL,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var QuotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
)

public data class VM_COUNTERS_EX(
    public var PeakVirtualSize: ULong = 0uL,
    public var VirtualSize: ULong = 0uL,
    public var PageFaultCount: UInt = 0u,
    public var PeakWorkingSetSize: ULong = 0uL,
    public var WorkingSetSize: ULong = 0uL,
    public var QuotaPeakPagedPoolUsage: ULong = 0uL,
    public var QuotaPagedPoolUsage: ULong = 0uL,
    public var QuotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var QuotaNonPagedPoolUsage: ULong = 0uL,
    public var PagefileUsage: ULong = 0uL,
    public var PeakPagefileUsage: ULong = 0uL,
    public var PrivateUsage: ULong = 0uL,
)

public data class VM_COUNTERS_EX2(
    public var CountersEx: VM_COUNTERS_EX = VM_COUNTERS_EX(),
    public var PrivateWorkingSetSize: ULong = 0uL,
    public var SharedCommitUsage: ULong = 0uL,
)

public data class WAIT_CONTEXT_BLOCK(
    public var Anonymous: WAIT_CONTEXT_BLOCK_0 = WAIT_CONTEXT_BLOCK_0(),
    public var DeviceRoutine: DRIVER_CONTROL = null,
    public var DeviceContext: Long = 0L,
    public var NumberOfMapRegisters: UInt = 0u,
    public var DeviceObject: Long = 0L,
    public var CurrentIrp: Long = 0L,
    public var BufferChainingDpc: Long = 0L,
)

public data class WAIT_CONTEXT_BLOCK_0(public var WaitQueueEntry: KDEVICE_QUEUE_ENTRY = KDEVICE_QUEUE_ENTRY(), public var Anonymous: WAIT_CONTEXT_BLOCK_0_0 = WAIT_CONTEXT_BLOCK_0_0())

public data class WAIT_CONTEXT_BLOCK_0_0(
    public var DmaWaitEntry: LIST_ENTRY = LIST_ENTRY(),
    public var NumberOfChannels: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class WHEA128A(public var Low: ULong = 0uL, public var High: Long = 0L)

public data class WHEAP_ACPI_TIMEOUT_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var TableType: ByteArray = ByteArray(32),
    public var TableRequest: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_ACPI_TIMEOUT_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.TableType.contentEquals(other.TableType)) return false
        if (!this.TableRequest.contentEquals(other.TableRequest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.TableType.contentHashCode()
        result = 31 * result + this.TableRequest.contentHashCode()
        return result
    }
}

public data class WHEAP_ADD_REMOVE_ERROR_SOURCE_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Descriptor: WHEA_ERROR_SOURCE_DESCRIPTOR = WHEA_ERROR_SOURCE_DESCRIPTOR(),
    public var Status: NTSTATUS = 0,
    public var IsRemove: Boolean = false,
)

public data class WHEAP_ATTEMPT_RECOVERY_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrorHeader: WHEA_ERROR_RECORD_HEADER = WHEA_ERROR_RECORD_HEADER(),
    public var ArchitecturalRecovery: Boolean = false,
    public var PshedRecovery: Boolean = false,
    public var Status: NTSTATUS = 0,
)

public data class WHEAP_BAD_HEST_NOTIFY_DATA_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var SourceId: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var NotifyDesc: WHEA_NOTIFICATION_DESCRIPTOR = WHEA_NOTIFICATION_DESCRIPTOR(),
)

public data class WHEAP_CLEARED_POISON_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var PhysicalAddress: ULong = 0uL)

public data class WHEAP_CMCI_IMPLEMENTED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var CmciAvailable: Boolean = false)

public data class WHEAP_CMCI_INITERR_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Msr: ULong = 0uL,
    public var Type: UInt = 0u,
    public var Bank: UInt = 0u,
    public var EpIndex: UInt = 0u,
)

public data class WHEAP_CMCI_RESTART_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var CmciRestoreAttempts: UInt = 0u,
    public var MaxCmciRestoreLimit: UInt = 0u,
    public var MaxCorrectedErrorsFound: UInt = 0u,
    public var MaxCorrectedErrorLimit: UInt = 0u,
)

public data class WHEAP_CREATE_GENERIC_RECORD_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Error: ByteArray = ByteArray(32),
    public var EntryCount: UInt = 0u,
    public var Status: NTSTATUS = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_CREATE_GENERIC_RECORD_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.Error.contentEquals(other.Error)) return false
        if (this.EntryCount != other.EntryCount) return false
        if (this.Status != other.Status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Error.contentHashCode()
        result = 31 * result + this.EntryCount.hashCode()
        result = 31 * result + this.Status.hashCode()
        return result
    }
}

public data class WHEAP_DEFERRED_EVENT(public var ListEntry: LIST_ENTRY = LIST_ENTRY(), public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEAP_DEVICE_DRV_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Function: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_DEVICE_DRV_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.Function.contentEquals(other.Function)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Function.contentHashCode()
        return result
    }
}

public data class WHEAP_DPC_ERROR_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrType: WHEAP_DPC_ERROR_EVENT_TYPE = 0,
    public var Bus: UInt = 0u,
    public var Device: UInt = 0u,
    public var Function: UInt = 0u,
    public var DeviceId: UShort = 0u,
    public var VendorId: UShort = 0u,
)

public data class WHEAP_DROPPED_CORRECTED_ERROR_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrorSourceType: WHEA_ERROR_SOURCE_TYPE = 0,
    public var ErrorSourceId: UInt = 0u,
)

public data class WHEAP_EDPC_ENABLED_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var eDPCEnabled: Boolean = false,
    public var eDPCRecovEnabled: Boolean = false,
)

public data class WHEAP_ERROR_CLEARED_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var EpIndex: UInt = 0u,
    public var Bank: UInt = 0u,
)

public data class WHEAP_ERROR_RECORD_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Record: Long = 0L)

public data class WHEAP_ERR_SRC_ARRAY_INVALID_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrorSourceCount: UInt = 0u,
    public var ReportedLength: UInt = 0u,
    public var ExpectedLength: UInt = 0u,
)

public data class WHEAP_ERR_SRC_INVALID_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrDescriptor: WHEA_ERROR_SOURCE_DESCRIPTOR = WHEA_ERROR_SOURCE_DESCRIPTOR(),
    public var Error: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_ERR_SRC_INVALID_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (this.ErrDescriptor != other.ErrDescriptor) return false
        if (!this.Error.contentEquals(other.Error)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.ErrDescriptor.hashCode()
        result = 31 * result + this.Error.contentHashCode()
        return result
    }
}

public data class WHEAP_FOUND_ERROR_IN_BANK_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var EpIndex: UInt = 0u,
    public var Bank: UInt = 0u,
    public var MciStatus: ULong = 0uL,
    public var ErrorType: UInt = 0u,
)

public data class WHEAP_GENERIC_ERR_MEM_MAP_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var MapReason: ByteArray = ByteArray(32),
    public var PhysicalAddress: ULong = 0uL,
    public var Length: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_GENERIC_ERR_MEM_MAP_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.MapReason.contentEquals(other.MapReason)) return false
        if (this.PhysicalAddress != other.PhysicalAddress) return false
        if (this.Length != other.Length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.MapReason.contentHashCode()
        result = 31 * result + this.PhysicalAddress.hashCode()
        result = 31 * result + this.Length.hashCode()
        return result
    }
}

public data class WHEAP_OSC_IMPLEMENTED(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var OscImplemented: Boolean = false,
    public var DebugChecked: Boolean = false,
)

public data class WHEAP_PCIE_CONFIG_INFO(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Segment: UInt = 0u,
    public var Bus: UInt = 0u,
    public var Device: UInt = 0u,
    public var Function: UInt = 0u,
    public var Offset: UInt = 0u,
    public var Length: UInt = 0u,
    public var Value: ULong = 0uL,
    public var Succeeded: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_PCIE_CONFIG_INFO) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (this.Segment != other.Segment) return false
        if (this.Bus != other.Bus) return false
        if (this.Device != other.Device) return false
        if (this.Function != other.Function) return false
        if (this.Offset != other.Offset) return false
        if (this.Length != other.Length) return false
        if (this.Value != other.Value) return false
        if (this.Succeeded != other.Succeeded) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Segment.hashCode()
        result = 31 * result + this.Bus.hashCode()
        result = 31 * result + this.Device.hashCode()
        result = 31 * result + this.Function.hashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Value.hashCode()
        result = 31 * result + this.Succeeded.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class WHEAP_PCIE_OVERRIDE_INFO(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Segment: UInt = 0u,
    public var Bus: UInt = 0u,
    public var Device: UInt = 0u,
    public var Function: UInt = 0u,
    public var ValidBits: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var UncorrectableErrorMask: UInt = 0u,
    public var UncorrectableErrorSeverity: UInt = 0u,
    public var CorrectableErrorMask: UInt = 0u,
    public var CapAndControl: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_PCIE_OVERRIDE_INFO) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (this.Segment != other.Segment) return false
        if (this.Bus != other.Bus) return false
        if (this.Device != other.Device) return false
        if (this.Function != other.Function) return false
        if (this.ValidBits != other.ValidBits) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.UncorrectableErrorMask != other.UncorrectableErrorMask) return false
        if (this.UncorrectableErrorSeverity != other.UncorrectableErrorSeverity) return false
        if (this.CorrectableErrorMask != other.CorrectableErrorMask) return false
        if (this.CapAndControl != other.CapAndControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Segment.hashCode()
        result = 31 * result + this.Bus.hashCode()
        result = 31 * result + this.Device.hashCode()
        result = 31 * result + this.Function.hashCode()
        result = 31 * result + this.ValidBits.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.UncorrectableErrorMask.hashCode()
        result = 31 * result + this.UncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.CorrectableErrorMask.hashCode()
        result = 31 * result + this.CapAndControl.hashCode()
        return result
    }
}

public data class WHEAP_PCIE_READ_OVERRIDES_ERR(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var FailureReason: UInt = 0u,
    public var FailureStatus: NTSTATUS = 0,
)

public data class WHEAP_PFA_MEMORY_OFFLINED(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var DecisionType: WHEAP_PFA_OFFLINE_DECISION_TYPE = 0,
    public var ImmediateSuccess: Boolean = false,
    public var Page: UInt = 0u,
)

public data class WHEAP_PFA_MEMORY_POLICY(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var RegistryKeysPresent: UInt = 0u,
    public var DisableOffline: Boolean = false,
    public var PersistOffline: Boolean = false,
    public var PfaDisabled: Boolean = false,
    public var PageCount: UInt = 0u,
    public var ErrorThreshold: UInt = 0u,
    public var TimeOut: UInt = 0u,
)

public data class WHEAP_PFA_MEMORY_REMOVE_MONITOR(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var RemoveTrigger: WHEA_PFA_REMOVE_TRIGGER = 0,
    public var TimeInList: UInt = 0u,
    public var ErrorCount: UInt = 0u,
    public var Page: UInt = 0u,
)

public data class WHEAP_PLUGIN_DEFECT_LIST_CORRUPT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEAP_PLUGIN_DEFECT_LIST_FULL_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEAP_PLUGIN_DEFECT_LIST_UEFI_VAR_FAILED(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEAP_PLUGIN_PFA_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var NoFurtherPfa: Boolean = false)

public data class WHEAP_PROCESS_EINJ_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Error: ByteArray = ByteArray(32),
    public var InjectionActionTableValid: Boolean = false,
    public var BeginInjectionInstructionCount: UInt = 0u,
    public var GetTriggerErrorActionTableInstructionCount: UInt = 0u,
    public var SetErrorTypeInstructionCount: UInt = 0u,
    public var GetErrorTypeInstructionCount: UInt = 0u,
    public var EndOperationInstructionCount: UInt = 0u,
    public var ExecuteOperationInstructionCount: UInt = 0u,
    public var CheckBusyStatusInstructionCount: UInt = 0u,
    public var GetCommandStatusInstructionCount: UInt = 0u,
    public var SetErrorTypeWithAddressInstructionCount: UInt = 0u,
    public var GetExecuteOperationTimingsInstructionCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_PROCESS_EINJ_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.Error.contentEquals(other.Error)) return false
        if (this.InjectionActionTableValid != other.InjectionActionTableValid) return false
        if (this.BeginInjectionInstructionCount != other.BeginInjectionInstructionCount) return false
        if (this.GetTriggerErrorActionTableInstructionCount != other.GetTriggerErrorActionTableInstructionCount) return false
        if (this.SetErrorTypeInstructionCount != other.SetErrorTypeInstructionCount) return false
        if (this.GetErrorTypeInstructionCount != other.GetErrorTypeInstructionCount) return false
        if (this.EndOperationInstructionCount != other.EndOperationInstructionCount) return false
        if (this.ExecuteOperationInstructionCount != other.ExecuteOperationInstructionCount) return false
        if (this.CheckBusyStatusInstructionCount != other.CheckBusyStatusInstructionCount) return false
        if (this.GetCommandStatusInstructionCount != other.GetCommandStatusInstructionCount) return false
        if (this.SetErrorTypeWithAddressInstructionCount != other.SetErrorTypeWithAddressInstructionCount) return false
        if (this.GetExecuteOperationTimingsInstructionCount != other.GetExecuteOperationTimingsInstructionCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Error.contentHashCode()
        result = 31 * result + this.InjectionActionTableValid.hashCode()
        result = 31 * result + this.BeginInjectionInstructionCount.hashCode()
        result = 31 * result + this.GetTriggerErrorActionTableInstructionCount.hashCode()
        result = 31 * result + this.SetErrorTypeInstructionCount.hashCode()
        result = 31 * result + this.GetErrorTypeInstructionCount.hashCode()
        result = 31 * result + this.EndOperationInstructionCount.hashCode()
        result = 31 * result + this.ExecuteOperationInstructionCount.hashCode()
        result = 31 * result + this.CheckBusyStatusInstructionCount.hashCode()
        result = 31 * result + this.GetCommandStatusInstructionCount.hashCode()
        result = 31 * result + this.SetErrorTypeWithAddressInstructionCount.hashCode()
        result = 31 * result + this.GetExecuteOperationTimingsInstructionCount.hashCode()
        return result
    }
}

public data class WHEAP_PROCESS_HEST_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Error: ByteArray = ByteArray(32),
    public var EntryType: ByteArray = ByteArray(32),
    public var EntryIndex: UInt = 0u,
    public var HestValid: Boolean = false,
    public var CmcCount: UInt = 0u,
    public var MceCount: UInt = 0u,
    public var NmiCount: UInt = 0u,
    public var AerRootCount: UInt = 0u,
    public var AerBridgeCount: UInt = 0u,
    public var AerEndPointCount: UInt = 0u,
    public var GenericV1Count: UInt = 0u,
    public var GenericV2Count: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEAP_PROCESS_HEST_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.Error.contentEquals(other.Error)) return false
        if (!this.EntryType.contentEquals(other.EntryType)) return false
        if (this.EntryIndex != other.EntryIndex) return false
        if (this.HestValid != other.HestValid) return false
        if (this.CmcCount != other.CmcCount) return false
        if (this.MceCount != other.MceCount) return false
        if (this.NmiCount != other.NmiCount) return false
        if (this.AerRootCount != other.AerRootCount) return false
        if (this.AerBridgeCount != other.AerBridgeCount) return false
        if (this.AerEndPointCount != other.AerEndPointCount) return false
        if (this.GenericV1Count != other.GenericV1Count) return false
        if (this.GenericV2Count != other.GenericV2Count) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Error.contentHashCode()
        result = 31 * result + this.EntryType.contentHashCode()
        result = 31 * result + this.EntryIndex.hashCode()
        result = 31 * result + this.HestValid.hashCode()
        result = 31 * result + this.CmcCount.hashCode()
        result = 31 * result + this.MceCount.hashCode()
        result = 31 * result + this.NmiCount.hashCode()
        result = 31 * result + this.AerRootCount.hashCode()
        result = 31 * result + this.AerBridgeCount.hashCode()
        result = 31 * result + this.AerEndPointCount.hashCode()
        result = 31 * result + this.GenericV1Count.hashCode()
        result = 31 * result + this.GenericV2Count.hashCode()
        return result
    }
}

public data class WHEAP_PSHED_INJECT_ERROR(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrorType: UInt = 0u,
    public var Parameter1: ULong = 0uL,
    public var Parameter2: ULong = 0uL,
    public var Parameter3: ULong = 0uL,
    public var Parameter4: ULong = 0uL,
    public var InjectionStatus: NTSTATUS = 0,
    public var InjectionAttempted: Boolean = false,
    public var InjectionByPlugin: Boolean = false,
)

public data class WHEAP_PSHED_PLUGIN_REGISTER(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var FunctionalAreaMask: UInt = 0u,
    public var Status: NTSTATUS = 0,
)

public data class WHEAP_ROW_FAILURE_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var LowOrderPage: UInt = 0u,
    public var HighOrderPage: UInt = 0u,
)

public data class WHEAP_SPURIOUS_AER_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var ErrorSeverity: WHEA_ERROR_SEVERITY = 0,
    public var ErrorHandlerType: UInt = 0u,
    public var SpuriousErrorSourceId: UInt = 0u,
    public var RootErrorCommand: UInt = 0u,
    public var RootErrorStatus: UInt = 0u,
    public var DeviceAssociationBitmap: UInt = 0u,
)

public data class WHEAP_STARTED_REPORT_HW_ERROR(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var ErrorPacket: Long = 0L)

public data class WHEAP_STUCK_ERROR_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var EpIndex: UInt = 0u,
    public var Bank: UInt = 0u,
    public var MciStatus: ULong = 0uL,
)

public data class WHEA_ACPI_HEADER(
    public var Signature: UInt = 0u,
    public var Length: UInt = 0u,
    public var Revision: UByte = 0u,
    public var Checksum: UByte = 0u,
    public var OemId: UByteArray = UByteArray(6),
    public var OemTableId: ULong = 0uL,
    public var OemRevision: UInt = 0u,
    public var CreatorId: UInt = 0u,
    public var CreatorRevision: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ACPI_HEADER) return false
        if (this.Signature != other.Signature) return false
        if (this.Length != other.Length) return false
        if (this.Revision != other.Revision) return false
        if (this.Checksum != other.Checksum) return false
        if (!this.OemId.contentEquals(other.OemId)) return false
        if (this.OemTableId != other.OemTableId) return false
        if (this.OemRevision != other.OemRevision) return false
        if (this.CreatorId != other.CreatorId) return false
        if (this.CreatorRevision != other.CreatorRevision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.Checksum.hashCode()
        result = 31 * result + this.OemId.contentHashCode()
        result = 31 * result + this.OemTableId.hashCode()
        result = 31 * result + this.OemRevision.hashCode()
        result = 31 * result + this.CreatorId.hashCode()
        result = 31 * result + this.CreatorRevision.hashCode()
        return result
    }
}

public data class WHEA_AMD_EXTENDED_REGISTERS(
    public var IPID: ULong = 0uL,
    public var SYND: ULong = 0uL,
    public var CONFIG: ULong = 0uL,
    public var DESTAT: ULong = 0uL,
    public var DEADDR: ULong = 0uL,
    public var MISC1: ULong = 0uL,
    public var MISC2: ULong = 0uL,
    public var MISC3: ULong = 0uL,
    public var MISC4: ULong = 0uL,
    public var RasCap: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_AMD_EXTENDED_REGISTERS) return false
        if (this.IPID != other.IPID) return false
        if (this.SYND != other.SYND) return false
        if (this.CONFIG != other.CONFIG) return false
        if (this.DESTAT != other.DESTAT) return false
        if (this.DEADDR != other.DEADDR) return false
        if (this.MISC1 != other.MISC1) return false
        if (this.MISC2 != other.MISC2) return false
        if (this.MISC3 != other.MISC3) return false
        if (this.MISC4 != other.MISC4) return false
        if (this.RasCap != other.RasCap) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IPID.hashCode()
        result = 31 * result + this.SYND.hashCode()
        result = 31 * result + this.CONFIG.hashCode()
        result = 31 * result + this.DESTAT.hashCode()
        result = 31 * result + this.DEADDR.hashCode()
        result = 31 * result + this.MISC1.hashCode()
        result = 31 * result + this.MISC2.hashCode()
        result = 31 * result + this.MISC3.hashCode()
        result = 31 * result + this.MISC4.hashCode()
        result = 31 * result + this.RasCap.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class WHEA_ARMV8_AARCH32_GPRS(
    public var R0: UInt = 0u,
    public var R1: UInt = 0u,
    public var R2: UInt = 0u,
    public var R3: UInt = 0u,
    public var R4: UInt = 0u,
    public var R5: UInt = 0u,
    public var R6: UInt = 0u,
    public var R7: UInt = 0u,
    public var R8: UInt = 0u,
    public var R9: UInt = 0u,
    public var R10: UInt = 0u,
    public var R11: UInt = 0u,
    public var R12: UInt = 0u,
    public var R13: UInt = 0u,
    public var R14: UInt = 0u,
    public var R15: UInt = 0u,
)

public data class WHEA_ARMV8_AARCH64_EL3_CSR(
    public var ELR_EL3: ULong = 0uL,
    public var ESR_EL3: ULong = 0uL,
    public var FAR_EL3: ULong = 0uL,
    public var MAIR_EL3: ULong = 0uL,
    public var SCTLR_EL3: ULong = 0uL,
    public var SP_EL3: ULong = 0uL,
    public var SPSR_EL3: ULong = 0uL,
    public var TCR_EL3: ULong = 0uL,
    public var TPIDR_EL3: ULong = 0uL,
    public var TTBR0_EL3: ULong = 0uL,
)

public class WHEA_ARMV8_AARCH64_GPRS(
    public var X0: ULong = 0uL,
    public var X1: ULong = 0uL,
    public var X2: ULong = 0uL,
    public var X3: ULong = 0uL,
    public var X4: ULong = 0uL,
    public var X5: ULong = 0uL,
    public var X6: ULong = 0uL,
    public var X7: ULong = 0uL,
    public var X8: ULong = 0uL,
    public var X9: ULong = 0uL,
    public var X10: ULong = 0uL,
    public var X11: ULong = 0uL,
    public var X12: ULong = 0uL,
    public var X13: ULong = 0uL,
    public var X14: ULong = 0uL,
    public var X15: ULong = 0uL,
    public var X16: ULong = 0uL,
    public var X17: ULong = 0uL,
    public var X18: ULong = 0uL,
    public var X19: ULong = 0uL,
    public var X20: ULong = 0uL,
    public var X21: ULong = 0uL,
    public var X22: ULong = 0uL,
    public var X23: ULong = 0uL,
    public var X24: ULong = 0uL,
    public var X25: ULong = 0uL,
    public var X26: ULong = 0uL,
    public var X27: ULong = 0uL,
    public var X28: ULong = 0uL,
    public var X29: ULong = 0uL,
    public var X30: ULong = 0uL,
    public var SP: ULong = 0uL,
)

public class WHEA_ARM_AARCH32_EL1_CSR(
    public var DFAR: UInt = 0u,
    public var DFSR: UInt = 0u,
    public var IFAR: UInt = 0u,
    public var ISR: UInt = 0u,
    public var MAIR0: UInt = 0u,
    public var MAIR1: UInt = 0u,
    public var MIDR: UInt = 0u,
    public var MPIDR: UInt = 0u,
    public var NMRR: UInt = 0u,
    public var PRRR: UInt = 0u,
    public var SCTLR: UInt = 0u,
    public var SPSR: UInt = 0u,
    public var SPSR_abt: UInt = 0u,
    public var SPSR_fiq: UInt = 0u,
    public var SPSR_irq: UInt = 0u,
    public var SPSR_svc: UInt = 0u,
    public var SPSR_und: UInt = 0u,
    public var TPIDRPRW: UInt = 0u,
    public var TPIDRURO: UInt = 0u,
    public var TPIDRURW: UInt = 0u,
    public var TTBCR: UInt = 0u,
    public var TTBR0: UInt = 0u,
    public var TTBR1: UInt = 0u,
    public var DACR: UInt = 0u,
)

public data class WHEA_ARM_AARCH32_EL2_CSR(
    public var ELR_hyp: UInt = 0u,
    public var HAMAIR0: UInt = 0u,
    public var HAMAIR1: UInt = 0u,
    public var HCR: UInt = 0u,
    public var HCR2: UInt = 0u,
    public var HDFAR: UInt = 0u,
    public var HIFAR: UInt = 0u,
    public var HPFAR: UInt = 0u,
    public var HSR: UInt = 0u,
    public var HTCR: UInt = 0u,
    public var HTPIDR: UInt = 0u,
    public var HTTBR: UInt = 0u,
    public var SPSR_hyp: UInt = 0u,
    public var VTCR: UInt = 0u,
    public var VTTBR: UInt = 0u,
    public var DACR32_EL2: UInt = 0u,
)

public data class WHEA_ARM_AARCH32_SECURE_CSR(public var SCTLR: UInt = 0u, public var SPSR_mon: UInt = 0u)

public class WHEA_ARM_AARCH64_EL1_CSR(
    public var ELR_EL1: ULong = 0uL,
    public var ESR_EL2: ULong = 0uL,
    public var FAR_EL1: ULong = 0uL,
    public var ISR_EL1: ULong = 0uL,
    public var MAIR_EL1: ULong = 0uL,
    public var MIDR_EL1: ULong = 0uL,
    public var MPIDR_EL1: ULong = 0uL,
    public var SCTLR_EL1: ULong = 0uL,
    public var SP_EL0: ULong = 0uL,
    public var SP_EL1: ULong = 0uL,
    public var SPSR_EL1: ULong = 0uL,
    public var TCR_EL1: ULong = 0uL,
    public var TPIDR_EL0: ULong = 0uL,
    public var TPIDR_EL1: ULong = 0uL,
    public var TPIDRRO_EL0: ULong = 0uL,
    public var TTBR0_EL1: ULong = 0uL,
    public var TTBR1_EL1: ULong = 0uL,
)

public data class WHEA_ARM_AARCH64_EL2_CSR(
    public var ELR_EL2: ULong = 0uL,
    public var ESR_EL2: ULong = 0uL,
    public var FAR_EL2: ULong = 0uL,
    public var HACR_EL2: ULong = 0uL,
    public var HCR_EL2: ULong = 0uL,
    public var HPFAR_EL2: ULong = 0uL,
    public var MAIR_EL2: ULong = 0uL,
    public var SCTLR_EL2: ULong = 0uL,
    public var SP_EL2: ULong = 0uL,
    public var SPSR_EL2: ULong = 0uL,
    public var TCR_EL2: ULong = 0uL,
    public var TPIDR_EL2: ULong = 0uL,
    public var TTBR0_EL2: ULong = 0uL,
    public var VTCR_EL2: ULong = 0uL,
    public var VTTBR_EL2: ULong = 0uL,
)

public data class WHEA_ARM_BUS_ERROR(
    public var ValidationBit: WHEA_ARM_BUS_ERROR_VALID_BITS = WHEA_ARM_BUS_ERROR_VALID_BITS(),
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: UByte = 0u,
    public var _bitfield4: UShort = 0u,
    public var _bitfield5: UByte = 0u,
    public var _bitfield6: UInt = 0u,
)

public data class WHEA_ARM_BUS_ERROR_VALID_BITS(public var Anonymous: WHEA_ARM_BUS_ERROR_VALID_BITS_0 = WHEA_ARM_BUS_ERROR_VALID_BITS_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_ARM_BUS_ERROR_VALID_BITS_0(public var _bitfield: UShort = 0u)

public data class WHEA_ARM_CACHE_ERROR(
    public var ValidationBit: WHEA_ARM_CACHE_ERROR_VALID_BITS = WHEA_ARM_CACHE_ERROR_VALID_BITS(),
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: ULong = 0uL,
)

public data class WHEA_ARM_CACHE_ERROR_VALID_BITS(public var Anonymous: WHEA_ARM_CACHE_ERROR_VALID_BITS_0 = WHEA_ARM_CACHE_ERROR_VALID_BITS_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_ARM_CACHE_ERROR_VALID_BITS_0(public var _bitfield: UShort = 0u)

public data class WHEA_ARM_MISC_CSR(public var MRSEncoding: UShort = 0u, public var Value: ULong = 0uL)

public data class WHEA_ARM_PROCESSOR_ERROR(
    public var CacheError: WHEA_ARM_CACHE_ERROR = WHEA_ARM_CACHE_ERROR(),
    public var TlbError: WHEA_ARM_TLB_ERROR = WHEA_ARM_TLB_ERROR(),
    public var BusError: WHEA_ARM_BUS_ERROR = WHEA_ARM_BUS_ERROR(),
    public var AsULONGLONG: ULong = 0uL,
)

public data class WHEA_ARM_PROCESSOR_ERROR_CONTEXT_INFORMATION_HEADER(
    public var Version: UShort = 0u,
    public var RegisterContextType: UShort = 0u,
    public var RegisterArraySize: UInt = 0u,
    public var RegisterArray: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ARM_PROCESSOR_ERROR_CONTEXT_INFORMATION_HEADER) return false
        if (this.Version != other.Version) return false
        if (this.RegisterContextType != other.RegisterContextType) return false
        if (this.RegisterArraySize != other.RegisterArraySize) return false
        if (!this.RegisterArray.contentEquals(other.RegisterArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.RegisterContextType.hashCode()
        result = 31 * result + this.RegisterArraySize.hashCode()
        result = 31 * result + this.RegisterArray.contentHashCode()
        return result
    }
}

public data class WHEA_ARM_PROCESSOR_ERROR_CONTEXT_INFORMATION_HEADER_FLAGS(public var Anonymous: WHEA_ARM_PROCESSOR_ERROR_CONTEXT_INFORMATION_HEADER_FLAGS_0 = WHEA_ARM_PROCESSOR_ERROR_CONTEXT_INFORMATION_HEADER_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ARM_PROCESSOR_ERROR_CONTEXT_INFORMATION_HEADER_FLAGS_0(public var _bitfield: UInt = 0u)

public data class WHEA_ARM_PROCESSOR_ERROR_INFORMATION(
    public var Version: UByte = 0u,
    public var Length: UByte = 0u,
    public var ValidationBit: WHEA_ARM_PROCESSOR_ERROR_INFORMATION_VALID_BITS = WHEA_ARM_PROCESSOR_ERROR_INFORMATION_VALID_BITS(),
    public var Type: UByte = 0u,
    public var MultipleError: UShort = 0u,
    public var Flags: UByte = 0u,
    public var ErrorInformation: ULong = 0uL,
    public var VirtualFaultAddress: ULong = 0uL,
    public var PhysicalFaultAddress: ULong = 0uL,
)

public data class WHEA_ARM_PROCESSOR_ERROR_INFORMATION_VALID_BITS(public var Anonymous: WHEA_ARM_PROCESSOR_ERROR_INFORMATION_VALID_BITS_0 = WHEA_ARM_PROCESSOR_ERROR_INFORMATION_VALID_BITS_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_ARM_PROCESSOR_ERROR_INFORMATION_VALID_BITS_0(public var _bitfield: UShort = 0u)

public data class WHEA_ARM_PROCESSOR_ERROR_SECTION(
    public var ValidBits: WHEA_ARM_PROCESSOR_ERROR_SECTION_VALID_BITS = WHEA_ARM_PROCESSOR_ERROR_SECTION_VALID_BITS(),
    public var ErrorInformationStructures: UShort = 0u,
    public var ContextInformationStructures: UShort = 0u,
    public var SectionLength: UInt = 0u,
    public var ErrorAffinityLevel: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var MPIDR_EL1: ULong = 0uL,
    public var MIDR_EL1: ULong = 0uL,
    public var RunningState: UInt = 0u,
    public var PSCIState: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ARM_PROCESSOR_ERROR_SECTION) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.ErrorInformationStructures != other.ErrorInformationStructures) return false
        if (this.ContextInformationStructures != other.ContextInformationStructures) return false
        if (this.SectionLength != other.SectionLength) return false
        if (this.ErrorAffinityLevel != other.ErrorAffinityLevel) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.MPIDR_EL1 != other.MPIDR_EL1) return false
        if (this.MIDR_EL1 != other.MIDR_EL1) return false
        if (this.RunningState != other.RunningState) return false
        if (this.PSCIState != other.PSCIState) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidBits.hashCode()
        result = 31 * result + this.ErrorInformationStructures.hashCode()
        result = 31 * result + this.ContextInformationStructures.hashCode()
        result = 31 * result + this.SectionLength.hashCode()
        result = 31 * result + this.ErrorAffinityLevel.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.MPIDR_EL1.hashCode()
        result = 31 * result + this.MIDR_EL1.hashCode()
        result = 31 * result + this.RunningState.hashCode()
        result = 31 * result + this.PSCIState.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WHEA_ARM_PROCESSOR_ERROR_SECTION_VALID_BITS(public var Anonymous: WHEA_ARM_PROCESSOR_ERROR_SECTION_VALID_BITS_0 = WHEA_ARM_PROCESSOR_ERROR_SECTION_VALID_BITS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ARM_PROCESSOR_ERROR_SECTION_VALID_BITS_0(public var _bitfield: UInt = 0u)

public data class WHEA_ARM_TLB_ERROR(
    public var ValidationBit: WHEA_ARM_TLB_ERROR_VALID_BITS = WHEA_ARM_TLB_ERROR_VALID_BITS(),
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var _bitfield3: ULong = 0uL,
)

public data class WHEA_ARM_TLB_ERROR_VALID_BITS(public var Anonymous: WHEA_ARM_TLB_ERROR_VALID_BITS_0 = WHEA_ARM_TLB_ERROR_VALID_BITS_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_ARM_TLB_ERROR_VALID_BITS_0(public var _bitfield: UShort = 0u)

public data class WHEA_AZCC_ROOT_BUS_ERR_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var MaxBusCountPassed: Boolean = false,
    public var InvalidBusMSR: Boolean = false,
)

public data class WHEA_AZCC_ROOT_BUS_LIST_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var RootBusCount: UInt = 0u,
    public var RootBuses: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_AZCC_ROOT_BUS_LIST_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (this.RootBusCount != other.RootBusCount) return false
        if (!this.RootBuses.contentEquals(other.RootBuses)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.RootBusCount.hashCode()
        result = 31 * result + this.RootBuses.contentHashCode()
        return result
    }
}

public data class WHEA_AZCC_SET_POISON_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var Bus: UInt = 0u,
    public var ReadSuccess: Boolean = false,
    public var WriteSuccess: Boolean = false,
    public var IsEnable: Boolean = false,
)

public data class WHEA_ERROR_INJECTION_CAPABILITIES(public var Anonymous: WHEA_ERROR_INJECTION_CAPABILITIES_0 = WHEA_ERROR_INJECTION_CAPABILITIES_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ERROR_INJECTION_CAPABILITIES_0(public var _bitfield: UInt = 0u)

public data class WHEA_ERROR_PACKET_FLAGS(public var Anonymous: WHEA_ERROR_PACKET_FLAGS_0 = WHEA_ERROR_PACKET_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ERROR_PACKET_FLAGS_0(public var _bitfield: UInt = 0u)

public class WHEA_ERROR_PACKET_V1(
    public var Signature: UInt = 0u,
    public var Flags: WHEA_ERROR_PACKET_FLAGS = WHEA_ERROR_PACKET_FLAGS(),
    public var Size: UInt = 0u,
    public var RawDataLength: UInt = 0u,
    public var Reserved1: ULong = 0uL,
    public var Context: ULong = 0uL,
    public var ErrorType: WHEA_ERROR_TYPE = 0,
    public var ErrorSeverity: WHEA_ERROR_SEVERITY = 0,
    public var ErrorSourceId: UInt = 0u,
    public var ErrorSourceType: WHEA_ERROR_SOURCE_TYPE = 0,
    public var Reserved2: UInt = 0u,
    public var Version: UInt = 0u,
    public var Cpu: ULong = 0uL,
    public var u: WHEA_ERROR_PACKET_V1_0 = WHEA_ERROR_PACKET_V1_0(),
    public var RawDataFormat: WHEA_RAW_DATA_FORMAT = 0,
    public var RawDataOffset: UInt = 0u,
    public var RawData: UByteArray = UByteArray(1),
)

public data class WHEA_ERROR_PACKET_V1_0(
    public var ProcessorError: WHEA_PROCESSOR_GENERIC_ERROR_SECTION = WHEA_PROCESSOR_GENERIC_ERROR_SECTION(),
    public var MemoryError: WHEA_MEMORY_ERROR_SECTION = WHEA_MEMORY_ERROR_SECTION(),
    public var NmiError: WHEA_NMI_ERROR_SECTION = WHEA_NMI_ERROR_SECTION(),
    public var PciExpressError: WHEA_PCIEXPRESS_ERROR_SECTION = WHEA_PCIEXPRESS_ERROR_SECTION(),
    public var PciXBusError: WHEA_PCIXBUS_ERROR_SECTION = WHEA_PCIXBUS_ERROR_SECTION(),
    public var PciXDeviceError: WHEA_PCIXDEVICE_ERROR_SECTION = WHEA_PCIXDEVICE_ERROR_SECTION(),
    public var PmemError: WHEA_PMEM_ERROR_SECTION = WHEA_PMEM_ERROR_SECTION(),
)

public data class WHEA_ERROR_PACKET_V2(
    public var Signature: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var Flags: WHEA_ERROR_PACKET_FLAGS = WHEA_ERROR_PACKET_FLAGS(),
    public var ErrorType: WHEA_ERROR_TYPE = 0,
    public var ErrorSeverity: WHEA_ERROR_SEVERITY = 0,
    public var ErrorSourceId: UInt = 0u,
    public var ErrorSourceType: WHEA_ERROR_SOURCE_TYPE = 0,
    public var NotifyType: GUID = GUID(),
    public var Context: ULong = 0uL,
    public var DataFormat: WHEA_ERROR_PACKET_DATA_FORMAT = 0,
    public var Reserved1: UInt = 0u,
    public var DataOffset: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var PshedDataOffset: UInt = 0u,
    public var PshedDataLength: UInt = 0u,
)

public data class WHEA_ERROR_RECORD(public var Header: WHEA_ERROR_RECORD_HEADER = WHEA_ERROR_RECORD_HEADER(), public var SectionDescriptor: List<WHEA_ERROR_RECORD_SECTION_DESCRIPTOR> = List(1) { WHEA_ERROR_RECORD_SECTION_DESCRIPTOR() })

public data class WHEA_ERROR_RECORD_HEADER(
    public var Signature: UInt = 0u,
    public var Revision: WHEA_REVISION = WHEA_REVISION(),
    public var SignatureEnd: UInt = 0u,
    public var SectionCount: UShort = 0u,
    public var Severity: WHEA_ERROR_SEVERITY = 0,
    public var ValidBits: WHEA_ERROR_RECORD_HEADER_VALIDBITS = WHEA_ERROR_RECORD_HEADER_VALIDBITS(),
    public var Length: UInt = 0u,
    public var Timestamp: WHEA_TIMESTAMP = WHEA_TIMESTAMP(),
    public var PlatformId: GUID = GUID(),
    public var PartitionId: GUID = GUID(),
    public var CreatorId: GUID = GUID(),
    public var NotifyType: GUID = GUID(),
    public var RecordId: ULong = 0uL,
    public var Flags: WHEA_ERROR_RECORD_HEADER_FLAGS = WHEA_ERROR_RECORD_HEADER_FLAGS(),
    public var PersistenceInfo: WHEA_PERSISTENCE_INFO = WHEA_PERSISTENCE_INFO(),
    public var Anonymous: WHEA_ERROR_RECORD_HEADER_0 = WHEA_ERROR_RECORD_HEADER_0(),
)

public data class WHEA_ERROR_RECORD_HEADER_0(public var Anonymous: WHEA_ERROR_RECORD_HEADER_0_0 = WHEA_ERROR_RECORD_HEADER_0_0(), public var Reserved: UByteArray = UByteArray(12)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ERROR_RECORD_HEADER_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class WHEA_ERROR_RECORD_HEADER_0_0(public var OsBuildNumber: UInt = 0u, public var Reserved2: UByteArray = UByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ERROR_RECORD_HEADER_0_0) return false
        if (this.OsBuildNumber != other.OsBuildNumber) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OsBuildNumber.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class WHEA_ERROR_RECORD_HEADER_FLAGS(public var Anonymous: WHEA_ERROR_RECORD_HEADER_FLAGS_0 = WHEA_ERROR_RECORD_HEADER_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ERROR_RECORD_HEADER_FLAGS_0(public var _bitfield: UInt = 0u)

public data class WHEA_ERROR_RECORD_HEADER_VALIDBITS(public var Anonymous: WHEA_ERROR_RECORD_HEADER_VALIDBITS_0 = WHEA_ERROR_RECORD_HEADER_VALIDBITS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ERROR_RECORD_HEADER_VALIDBITS_0(public var _bitfield: UInt = 0u)

public data class WHEA_ERROR_RECORD_SECTION_DESCRIPTOR(
    public var SectionOffset: UInt = 0u,
    public var SectionLength: UInt = 0u,
    public var Revision: WHEA_REVISION = WHEA_REVISION(),
    public var ValidBits: WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_VALIDBITS = WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_VALIDBITS(),
    public var Reserved: UByte = 0u,
    public var Flags: WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_FLAGS = WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_FLAGS(),
    public var SectionType: GUID = GUID(),
    public var FRUId: GUID = GUID(),
    public var SectionSeverity: WHEA_ERROR_SEVERITY = 0,
    public var FRUText: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ERROR_RECORD_SECTION_DESCRIPTOR) return false
        if (this.SectionOffset != other.SectionOffset) return false
        if (this.SectionLength != other.SectionLength) return false
        if (this.Revision != other.Revision) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Flags != other.Flags) return false
        if (this.SectionType != other.SectionType) return false
        if (this.FRUId != other.FRUId) return false
        if (this.SectionSeverity != other.SectionSeverity) return false
        if (!this.FRUText.contentEquals(other.FRUText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SectionOffset.hashCode()
        result = 31 * result + this.SectionLength.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.ValidBits.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.SectionType.hashCode()
        result = 31 * result + this.FRUId.hashCode()
        result = 31 * result + this.SectionSeverity.hashCode()
        result = 31 * result + this.FRUText.contentHashCode()
        return result
    }
}

public data class WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_FLAGS(public var Anonymous: WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_FLAGS_0 = WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_FLAGS_0(public var _bitfield: UInt = 0u)

public data class WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_VALIDBITS(public var Anonymous: WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_VALIDBITS_0 = WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_VALIDBITS_0(), public var AsUCHAR: UByte = 0u)

public data class WHEA_ERROR_RECORD_SECTION_DESCRIPTOR_VALIDBITS_0(public var _bitfield: UByte = 0u)

public data class WHEA_ERROR_RECOVERY_INFO_SECTION(
    public var RecoveryKernel: Boolean = false,
    public var RecoveryAction: WHEA_RECOVERY_ACTION = WHEA_RECOVERY_ACTION(),
    public var RecoveryType: WHEA_RECOVERY_TYPE = 0,
    public var Irql: UByte = 0u,
    public var RecoverySucceeded: Boolean = false,
    public var FailureReason: WHEA_RECOVERY_FAILURE_REASON = 0,
    public var ProcessName: ByteArray = ByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_ERROR_RECOVERY_INFO_SECTION) return false
        if (this.RecoveryKernel != other.RecoveryKernel) return false
        if (this.RecoveryAction != other.RecoveryAction) return false
        if (this.RecoveryType != other.RecoveryType) return false
        if (this.Irql != other.Irql) return false
        if (this.RecoverySucceeded != other.RecoverySucceeded) return false
        if (this.FailureReason != other.FailureReason) return false
        if (!this.ProcessName.contentEquals(other.ProcessName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RecoveryKernel.hashCode()
        result = 31 * result + this.RecoveryAction.hashCode()
        result = 31 * result + this.RecoveryType.hashCode()
        result = 31 * result + this.Irql.hashCode()
        result = 31 * result + this.RecoverySucceeded.hashCode()
        result = 31 * result + this.FailureReason.hashCode()
        result = 31 * result + this.ProcessName.contentHashCode()
        return result
    }
}

public data class WHEA_ERROR_SOURCE_CONFIGURATION(
    public var Flags: UInt = 0u,
    public var Correct: WHEA_ERROR_SOURCE_CORRECT = null,
    public var Initialize: WHEA_ERROR_SOURCE_INITIALIZE = null,
    public var CreateRecord: WHEA_ERROR_SOURCE_CREATE_RECORD = null,
    public var Recover: WHEA_ERROR_SOURCE_RECOVER = null,
    public var Uninitialize: WHEA_ERROR_SOURCE_UNINITIALIZE = null,
    public var Reserved: Long = 0L,
)

public data class WHEA_ERROR_SOURCE_OVERRIDE_SETTINGS(
    public var Type: WHEA_ERROR_SOURCE_TYPE = 0,
    public var MaxRawDataLength: UInt = 0u,
    public var NumRecordsToPreallocate: UInt = 0u,
    public var MaxSectionsPerRecord: UInt = 0u,
)

public data class WHEA_ERROR_STATUS(public var ErrorStatus: ULong = 0uL, public var Anonymous: WHEA_ERROR_STATUS_0 = WHEA_ERROR_STATUS_0())

public data class WHEA_ERROR_STATUS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_ETW_OVERFLOW_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var RecordId: ULong = 0uL)

public data class WHEA_EVENT_LOG_ENTRY(public var Header: WHEA_EVENT_LOG_ENTRY_HEADER = WHEA_EVENT_LOG_ENTRY_HEADER())

public data class WHEA_EVENT_LOG_ENTRY_FLAGS(public var Anonymous: WHEA_EVENT_LOG_ENTRY_FLAGS_0 = WHEA_EVENT_LOG_ENTRY_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_EVENT_LOG_ENTRY_FLAGS_0(public var _bitfield: UInt = 0u)

public data class WHEA_EVENT_LOG_ENTRY_HEADER(
    public var Signature: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var Type: WHEA_EVENT_LOG_ENTRY_TYPE = 0,
    public var OwnerTag: UInt = 0u,
    public var Id: WHEA_EVENT_LOG_ENTRY_ID = 0,
    public var Flags: WHEA_EVENT_LOG_ENTRY_FLAGS = WHEA_EVENT_LOG_ENTRY_FLAGS(),
    public var PayloadLength: UInt = 0u,
)

public data class WHEA_FAILED_ADD_DEFECT_LIST_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEA_FIRMWARE_ERROR_RECORD_REFERENCE(
    public var Type: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(7),
    public var FirmwareRecordId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_FIRMWARE_ERROR_RECORD_REFERENCE) return false
        if (this.Type != other.Type) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.FirmwareRecordId != other.FirmwareRecordId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.FirmwareRecordId.hashCode()
        return result
    }
}

public data class WHEA_GENERIC_ERROR(
    public var BlockStatus: WHEA_GENERIC_ERROR_BLOCKSTATUS = WHEA_GENERIC_ERROR_BLOCKSTATUS(),
    public var RawDataOffset: UInt = 0u,
    public var RawDataLength: UInt = 0u,
    public var DataLength: UInt = 0u,
    public var ErrorSeverity: WHEA_ERROR_SEVERITY = 0,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_GENERIC_ERROR) return false
        if (this.BlockStatus != other.BlockStatus) return false
        if (this.RawDataOffset != other.RawDataOffset) return false
        if (this.RawDataLength != other.RawDataLength) return false
        if (this.DataLength != other.DataLength) return false
        if (this.ErrorSeverity != other.ErrorSeverity) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BlockStatus.hashCode()
        result = 31 * result + this.RawDataOffset.hashCode()
        result = 31 * result + this.RawDataLength.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        result = 31 * result + this.ErrorSeverity.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WHEA_GENERIC_ERROR_BLOCKSTATUS(public var Anonymous: WHEA_GENERIC_ERROR_BLOCKSTATUS_0 = WHEA_GENERIC_ERROR_BLOCKSTATUS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_GENERIC_ERROR_BLOCKSTATUS_0(public var _bitfield: UInt = 0u)

public data class WHEA_GENERIC_ERROR_DATA_ENTRY_V1(
    public var SectionType: GUID = GUID(),
    public var ErrorSeverity: WHEA_ERROR_SEVERITY = 0,
    public var Revision: WHEA_REVISION = WHEA_REVISION(),
    public var ValidBits: UByte = 0u,
    public var Flags: UByte = 0u,
    public var ErrorDataLength: UInt = 0u,
    public var FRUId: GUID = GUID(),
    public var FRUText: UByteArray = UByteArray(20),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_GENERIC_ERROR_DATA_ENTRY_V1) return false
        if (this.SectionType != other.SectionType) return false
        if (this.ErrorSeverity != other.ErrorSeverity) return false
        if (this.Revision != other.Revision) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.Flags != other.Flags) return false
        if (this.ErrorDataLength != other.ErrorDataLength) return false
        if (this.FRUId != other.FRUId) return false
        if (!this.FRUText.contentEquals(other.FRUText)) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SectionType.hashCode()
        result = 31 * result + this.ErrorSeverity.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.ValidBits.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ErrorDataLength.hashCode()
        result = 31 * result + this.FRUId.hashCode()
        result = 31 * result + this.FRUText.contentHashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WHEA_GENERIC_ERROR_DATA_ENTRY_V2(
    public var SectionType: GUID = GUID(),
    public var ErrorSeverity: WHEA_ERROR_SEVERITY = 0,
    public var Revision: WHEA_REVISION = WHEA_REVISION(),
    public var ValidBits: UByte = 0u,
    public var Flags: UByte = 0u,
    public var ErrorDataLength: UInt = 0u,
    public var FRUId: GUID = GUID(),
    public var FRUText: UByteArray = UByteArray(20),
    public var Timestamp: WHEA_TIMESTAMP = WHEA_TIMESTAMP(),
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_GENERIC_ERROR_DATA_ENTRY_V2) return false
        if (this.SectionType != other.SectionType) return false
        if (this.ErrorSeverity != other.ErrorSeverity) return false
        if (this.Revision != other.Revision) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.Flags != other.Flags) return false
        if (this.ErrorDataLength != other.ErrorDataLength) return false
        if (this.FRUId != other.FRUId) return false
        if (!this.FRUText.contentEquals(other.FRUText)) return false
        if (this.Timestamp != other.Timestamp) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SectionType.hashCode()
        result = 31 * result + this.ErrorSeverity.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.ValidBits.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.ErrorDataLength.hashCode()
        result = 31 * result + this.FRUId.hashCode()
        result = 31 * result + this.FRUText.contentHashCode()
        result = 31 * result + this.Timestamp.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WHEA_IN_USE_PAGE_NOTIFY_FLAGS(public var Bits: WHEA_IN_USE_PAGE_NOTIFY_FLAGS_0 = WHEA_IN_USE_PAGE_NOTIFY_FLAGS_0(), public var AsUCHAR: UByte = 0u)

public data class WHEA_IN_USE_PAGE_NOTIFY_FLAGS_0(public var _bitfield: UByte = 0u)

public data class WHEA_MEMORY_CORRECTABLE_ERROR_DATA(
    public var ValidBits: WHEA_MEMORY_CORRECTABLE_ERROR_SECTION_VALIDBITS = WHEA_MEMORY_CORRECTABLE_ERROR_SECTION_VALIDBITS(),
    public var SocketId: UInt = 0u,
    public var ChannelId: UInt = 0u,
    public var DimmSlot: UInt = 0u,
    public var CorrectableErrorCount: UInt = 0u,
)

public data class WHEA_MEMORY_CORRECTABLE_ERROR_HEADER(public var Version: UShort = 0u, public var Count: UShort = 0u)

public data class WHEA_MEMORY_CORRECTABLE_ERROR_SECTION(public var Header: WHEA_MEMORY_CORRECTABLE_ERROR_HEADER = WHEA_MEMORY_CORRECTABLE_ERROR_HEADER(), public var Data: List<WHEA_MEMORY_CORRECTABLE_ERROR_DATA> = List(1) { WHEA_MEMORY_CORRECTABLE_ERROR_DATA() })

public data class WHEA_MEMORY_CORRECTABLE_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_MEMORY_CORRECTABLE_ERROR_SECTION_VALIDBITS_0 = WHEA_MEMORY_CORRECTABLE_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_MEMORY_CORRECTABLE_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public class WHEA_MEMORY_ERROR_SECTION(
    public var ValidBits: WHEA_MEMORY_ERROR_SECTION_VALIDBITS = WHEA_MEMORY_ERROR_SECTION_VALIDBITS(),
    public var ErrorStatus: WHEA_ERROR_STATUS = WHEA_ERROR_STATUS(),
    public var PhysicalAddress: ULong = 0uL,
    public var PhysicalAddressMask: ULong = 0uL,
    public var Node: UShort = 0u,
    public var Card: UShort = 0u,
    public var Module: UShort = 0u,
    public var Bank: UShort = 0u,
    public var Device: UShort = 0u,
    public var Row: UShort = 0u,
    public var Column: UShort = 0u,
    public var BitPosition: UShort = 0u,
    public var RequesterId: ULong = 0uL,
    public var ResponderId: ULong = 0uL,
    public var TargetId: ULong = 0uL,
    public var ErrorType: UByte = 0u,
    public var Extended: UByte = 0u,
    public var RankNumber: UShort = 0u,
    public var CardHandle: UShort = 0u,
    public var ModuleHandle: UShort = 0u,
)

public data class WHEA_MEMORY_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_MEMORY_ERROR_SECTION_VALIDBITS_0 = WHEA_MEMORY_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_MEMORY_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_MEMORY_THROTTLE_SUMMARY_FAILED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Status: NTSTATUS = 0)

public data class WHEA_MSR_DUMP_SECTION(
    public var MsrDumpBuffer: UByte = 0u,
    public var MsrDumpLength: UInt = 0u,
    public var MsrDumpData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_MSR_DUMP_SECTION) return false
        if (this.MsrDumpBuffer != other.MsrDumpBuffer) return false
        if (this.MsrDumpLength != other.MsrDumpLength) return false
        if (!this.MsrDumpData.contentEquals(other.MsrDumpData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MsrDumpBuffer.hashCode()
        result = 31 * result + this.MsrDumpLength.hashCode()
        result = 31 * result + this.MsrDumpData.contentHashCode()
        return result
    }
}

public data class WHEA_NMI_ERROR_SECTION(public var Data: UByteArray = UByteArray(8), public var Flags: WHEA_NMI_ERROR_SECTION_FLAGS = WHEA_NMI_ERROR_SECTION_FLAGS()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_NMI_ERROR_SECTION) return false
        if (!this.Data.contentEquals(other.Data)) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Data.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class WHEA_NMI_ERROR_SECTION_FLAGS(public var Anonymous: WHEA_NMI_ERROR_SECTION_FLAGS_0 = WHEA_NMI_ERROR_SECTION_FLAGS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_NMI_ERROR_SECTION_FLAGS_0(public var _bitfield: UInt = 0u)

public data class WHEA_OFFLINE_DONE_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Address: ULong = 0uL)

public data class WHEA_PACKET_LOG_DATA(
    public var LogData: UByteArray = UByteArray(36),
    public var ExtraBytes: UByteArray = UByteArray(36),
    public var BcParam3: ULong = 0uL,
    public var BcParam4: ULong = 0uL,
    public var LogDataLength: UInt = 0u,
    public var LogTag: UShort = 0u,
    public var Reserved: UShort = 0u,
    public var Flags: WHEA_REPORT_HW_ERROR_DEVICE_DRIVER_FLAGS = WHEA_REPORT_HW_ERROR_DEVICE_DRIVER_FLAGS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PACKET_LOG_DATA) return false
        if (!this.LogData.contentEquals(other.LogData)) return false
        if (!this.ExtraBytes.contentEquals(other.ExtraBytes)) return false
        if (this.BcParam3 != other.BcParam3) return false
        if (this.BcParam4 != other.BcParam4) return false
        if (this.LogDataLength != other.LogDataLength) return false
        if (this.LogTag != other.LogTag) return false
        if (this.Reserved != other.Reserved) return false
        if (this.Flags != other.Flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.LogData.contentHashCode()
        result = 31 * result + this.ExtraBytes.contentHashCode()
        result = 31 * result + this.BcParam3.hashCode()
        result = 31 * result + this.BcParam4.hashCode()
        result = 31 * result + this.LogDataLength.hashCode()
        result = 31 * result + this.LogTag.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.Flags.hashCode()
        return result
    }
}

public data class WHEA_PCIEXPRESS_BRIDGE_CONTROL_STATUS(public var Anonymous: WHEA_PCIEXPRESS_BRIDGE_CONTROL_STATUS_0 = WHEA_PCIEXPRESS_BRIDGE_CONTROL_STATUS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_PCIEXPRESS_BRIDGE_CONTROL_STATUS_0(public var BridgeSecondaryStatus: UShort = 0u, public var BridgeControl: UShort = 0u)

public data class WHEA_PCIEXPRESS_COMMAND_STATUS(public var Anonymous: WHEA_PCIEXPRESS_COMMAND_STATUS_0 = WHEA_PCIEXPRESS_COMMAND_STATUS_0(), public var AsULONG: UInt = 0u)

public data class WHEA_PCIEXPRESS_COMMAND_STATUS_0(public var Command: UShort = 0u, public var Status: UShort = 0u)

public data class WHEA_PCIEXPRESS_DEVICE_ID(
    public var VendorID: UShort = 0u,
    public var DeviceID: UShort = 0u,
    public var _bitfield1: UInt = 0u,
    public var _bitfield2: UInt = 0u,
    public var _bitfield3: UInt = 0u,
)

public data class WHEA_PCIEXPRESS_ERROR_SECTION(
    public var ValidBits: WHEA_PCIEXPRESS_ERROR_SECTION_VALIDBITS = WHEA_PCIEXPRESS_ERROR_SECTION_VALIDBITS(),
    public var PortType: WHEA_PCIEXPRESS_DEVICE_TYPE = 0,
    public var Version: WHEA_PCIEXPRESS_VERSION = WHEA_PCIEXPRESS_VERSION(),
    public var CommandStatus: WHEA_PCIEXPRESS_COMMAND_STATUS = WHEA_PCIEXPRESS_COMMAND_STATUS(),
    public var Reserved: UInt = 0u,
    public var DeviceId: WHEA_PCIEXPRESS_DEVICE_ID = WHEA_PCIEXPRESS_DEVICE_ID(),
    public var DeviceSerialNumber: ULong = 0uL,
    public var BridgeControlStatus: WHEA_PCIEXPRESS_BRIDGE_CONTROL_STATUS = WHEA_PCIEXPRESS_BRIDGE_CONTROL_STATUS(),
    public var ExpressCapability: UByteArray = UByteArray(60),
    public var AerInfo: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PCIEXPRESS_ERROR_SECTION) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.PortType != other.PortType) return false
        if (this.Version != other.Version) return false
        if (this.CommandStatus != other.CommandStatus) return false
        if (this.Reserved != other.Reserved) return false
        if (this.DeviceId != other.DeviceId) return false
        if (this.DeviceSerialNumber != other.DeviceSerialNumber) return false
        if (this.BridgeControlStatus != other.BridgeControlStatus) return false
        if (!this.ExpressCapability.contentEquals(other.ExpressCapability)) return false
        if (!this.AerInfo.contentEquals(other.AerInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidBits.hashCode()
        result = 31 * result + this.PortType.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.CommandStatus.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.DeviceId.hashCode()
        result = 31 * result + this.DeviceSerialNumber.hashCode()
        result = 31 * result + this.BridgeControlStatus.hashCode()
        result = 31 * result + this.ExpressCapability.contentHashCode()
        result = 31 * result + this.AerInfo.contentHashCode()
        return result
    }
}

public data class WHEA_PCIEXPRESS_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_PCIEXPRESS_ERROR_SECTION_VALIDBITS_0 = WHEA_PCIEXPRESS_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_PCIEXPRESS_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PCIEXPRESS_VERSION(public var Anonymous: WHEA_PCIEXPRESS_VERSION_0 = WHEA_PCIEXPRESS_VERSION_0(), public var AsULONG: UInt = 0u)

public data class WHEA_PCIEXPRESS_VERSION_0(
    public var MinorVersion: UByte = 0u,
    public var MajorVersion: UByte = 0u,
    public var Reserved: UShort = 0u,
)

public data class WHEA_PCIE_ADDRESS(
    public var Segment: UInt = 0u,
    public var Bus: UInt = 0u,
    public var Device: UInt = 0u,
    public var Function: UInt = 0u,
)

public data class WHEA_PCIE_CORRECTABLE_ERROR_DEVICES(
    public var ValidBits: WHEA_PCIE_CORRECTABLE_ERROR_DEVICES_VALIDBITS = WHEA_PCIE_CORRECTABLE_ERROR_DEVICES_VALIDBITS(),
    public var Address: WHEA_PCIE_ADDRESS = WHEA_PCIE_ADDRESS(),
    public var Mask: UInt = 0u,
    public var CorrectableErrorCount: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PCIE_CORRECTABLE_ERROR_DEVICES) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.Address != other.Address) return false
        if (this.Mask != other.Mask) return false
        if (!this.CorrectableErrorCount.contentEquals(other.CorrectableErrorCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidBits.hashCode()
        result = 31 * result + this.Address.hashCode()
        result = 31 * result + this.Mask.hashCode()
        result = 31 * result + this.CorrectableErrorCount.contentHashCode()
        return result
    }
}

public data class WHEA_PCIE_CORRECTABLE_ERROR_DEVICES_VALIDBITS(public var Anonymous: WHEA_PCIE_CORRECTABLE_ERROR_DEVICES_VALIDBITS_0 = WHEA_PCIE_CORRECTABLE_ERROR_DEVICES_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_PCIE_CORRECTABLE_ERROR_DEVICES_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PCIE_CORRECTABLE_ERROR_SECTION(public var Header: WHEA_PCIE_CORRECTABLE_ERROR_SECTION_HEADER = WHEA_PCIE_CORRECTABLE_ERROR_SECTION_HEADER(), public var Devices: List<WHEA_PCIE_CORRECTABLE_ERROR_DEVICES> = List(1) { WHEA_PCIE_CORRECTABLE_ERROR_DEVICES() })

public data class WHEA_PCIE_CORRECTABLE_ERROR_SECTION_HEADER(public var Version: UShort = 0u, public var Count: UShort = 0u)

public data class WHEA_PCIXBUS_COMMAND(public var Anonymous: WHEA_PCIXBUS_COMMAND_0 = WHEA_PCIXBUS_COMMAND_0(), public var AsULONGLONG: ULong = 0uL)

public data class WHEA_PCIXBUS_COMMAND_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PCIXBUS_ERROR_SECTION(
    public var ValidBits: WHEA_PCIXBUS_ERROR_SECTION_VALIDBITS = WHEA_PCIXBUS_ERROR_SECTION_VALIDBITS(),
    public var ErrorStatus: WHEA_ERROR_STATUS = WHEA_ERROR_STATUS(),
    public var ErrorType: UShort = 0u,
    public var BusId: WHEA_PCIXBUS_ID = WHEA_PCIXBUS_ID(),
    public var Reserved: UInt = 0u,
    public var BusAddress: ULong = 0uL,
    public var BusData: ULong = 0uL,
    public var BusCommand: WHEA_PCIXBUS_COMMAND = WHEA_PCIXBUS_COMMAND(),
    public var RequesterId: ULong = 0uL,
    public var CompleterId: ULong = 0uL,
    public var TargetId: ULong = 0uL,
)

public data class WHEA_PCIXBUS_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_PCIXBUS_ERROR_SECTION_VALIDBITS_0 = WHEA_PCIXBUS_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_PCIXBUS_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PCIXBUS_ID(public var Anonymous: WHEA_PCIXBUS_ID_0 = WHEA_PCIXBUS_ID_0(), public var AsUSHORT: UShort = 0u)

public data class WHEA_PCIXBUS_ID_0(public var BusNumber: UByte = 0u, public var BusSegment: UByte = 0u)

public data class WHEA_PCIXDEVICE_ERROR_SECTION(
    public var ValidBits: WHEA_PCIXDEVICE_ERROR_SECTION_VALIDBITS = WHEA_PCIXDEVICE_ERROR_SECTION_VALIDBITS(),
    public var ErrorStatus: WHEA_ERROR_STATUS = WHEA_ERROR_STATUS(),
    public var IdInfo: WHEA_PCIXDEVICE_ID = WHEA_PCIXDEVICE_ID(),
    public var MemoryNumber: UInt = 0u,
    public var IoNumber: UInt = 0u,
    public var RegisterDataPairs: List<WHEA_PCIXDEVICE_REGISTER_PAIR> = List(1) { WHEA_PCIXDEVICE_REGISTER_PAIR() },
)

public data class WHEA_PCIXDEVICE_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_PCIXDEVICE_ERROR_SECTION_VALIDBITS_0 = WHEA_PCIXDEVICE_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_PCIXDEVICE_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PCIXDEVICE_ID(
    public var VendorId: UShort = 0u,
    public var DeviceId: UShort = 0u,
    public var _bitfield1: UInt = 0u,
    public var _bitfield2: UInt = 0u,
    public var Reserved2: UInt = 0u,
)

public data class WHEA_PCIXDEVICE_REGISTER_PAIR(public var Register: ULong = 0uL, public var Data: ULong = 0uL)

public data class WHEA_PCI_RECOVERY_SECTION(
    public var SignalType: UByte = 0u,
    public var RecoveryAttempted: Boolean = false,
    public var RecoveryStatus: UByte = 0u,
)

public data class WHEA_PERSISTENCE_INFO(public var Anonymous: WHEA_PERSISTENCE_INFO_0 = WHEA_PERSISTENCE_INFO_0(), public var AsULONGLONG: ULong = 0uL)

public data class WHEA_PERSISTENCE_INFO_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PMEM_ERROR_SECTION(
    public var ValidBits: WHEA_PMEM_ERROR_SECTION_VALIDBITS = WHEA_PMEM_ERROR_SECTION_VALIDBITS(),
    public var LocationInfo: UByteArray = UByteArray(64),
    public var ErrorStatus: WHEA_ERROR_STATUS = WHEA_ERROR_STATUS(),
    public var NFITHandle: UInt = 0u,
    public var PageRangeCount: UInt = 0u,
    public var PageRange: List<WHEA_PMEM_PAGE_RANGE> = List(1) { WHEA_PMEM_PAGE_RANGE() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PMEM_ERROR_SECTION) return false
        if (this.ValidBits != other.ValidBits) return false
        if (!this.LocationInfo.contentEquals(other.LocationInfo)) return false
        if (this.ErrorStatus != other.ErrorStatus) return false
        if (this.NFITHandle != other.NFITHandle) return false
        if (this.PageRangeCount != other.PageRangeCount) return false
        if (this.PageRange != other.PageRange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidBits.hashCode()
        result = 31 * result + this.LocationInfo.contentHashCode()
        result = 31 * result + this.ErrorStatus.hashCode()
        result = 31 * result + this.NFITHandle.hashCode()
        result = 31 * result + this.PageRangeCount.hashCode()
        result = 31 * result + this.PageRange.hashCode()
        return result
    }
}

public data class WHEA_PMEM_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_PMEM_ERROR_SECTION_VALIDBITS_0 = WHEA_PMEM_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_PMEM_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PMEM_PAGE_RANGE(
    public var StartingPfn: ULong = 0uL,
    public var PageCount: ULong = 0uL,
    public var MarkedBadBitmap: ULong = 0uL,
)

public data class WHEA_PROCESSOR_FAMILY_INFO(public var Anonymous: WHEA_PROCESSOR_FAMILY_INFO_0 = WHEA_PROCESSOR_FAMILY_INFO_0(), public var AsULONGLONG: ULong = 0uL)

public data class WHEA_PROCESSOR_FAMILY_INFO_0(public var _bitfield: UInt = 0u, public var NativeModelId: UInt = 0u)

public data class WHEA_PROCESSOR_GENERIC_ERROR_SECTION(
    public var ValidBits: WHEA_PROCESSOR_GENERIC_ERROR_SECTION_VALIDBITS = WHEA_PROCESSOR_GENERIC_ERROR_SECTION_VALIDBITS(),
    public var ProcessorType: UByte = 0u,
    public var InstructionSet: UByte = 0u,
    public var ErrorType: UByte = 0u,
    public var Operation: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Level: UByte = 0u,
    public var Reserved: UShort = 0u,
    public var CPUVersion: ULong = 0uL,
    public var CPUBrandString: UByteArray = UByteArray(128),
    public var ProcessorId: ULong = 0uL,
    public var TargetAddress: ULong = 0uL,
    public var RequesterId: ULong = 0uL,
    public var ResponderId: ULong = 0uL,
    public var InstructionPointer: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PROCESSOR_GENERIC_ERROR_SECTION) return false
        if (this.ValidBits != other.ValidBits) return false
        if (this.ProcessorType != other.ProcessorType) return false
        if (this.InstructionSet != other.InstructionSet) return false
        if (this.ErrorType != other.ErrorType) return false
        if (this.Operation != other.Operation) return false
        if (this.Flags != other.Flags) return false
        if (this.Level != other.Level) return false
        if (this.Reserved != other.Reserved) return false
        if (this.CPUVersion != other.CPUVersion) return false
        if (!this.CPUBrandString.contentEquals(other.CPUBrandString)) return false
        if (this.ProcessorId != other.ProcessorId) return false
        if (this.TargetAddress != other.TargetAddress) return false
        if (this.RequesterId != other.RequesterId) return false
        if (this.ResponderId != other.ResponderId) return false
        if (this.InstructionPointer != other.InstructionPointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidBits.hashCode()
        result = 31 * result + this.ProcessorType.hashCode()
        result = 31 * result + this.InstructionSet.hashCode()
        result = 31 * result + this.ErrorType.hashCode()
        result = 31 * result + this.Operation.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.Level.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.CPUVersion.hashCode()
        result = 31 * result + this.CPUBrandString.contentHashCode()
        result = 31 * result + this.ProcessorId.hashCode()
        result = 31 * result + this.TargetAddress.hashCode()
        result = 31 * result + this.RequesterId.hashCode()
        result = 31 * result + this.ResponderId.hashCode()
        result = 31 * result + this.InstructionPointer.hashCode()
        return result
    }
}

public data class WHEA_PROCESSOR_GENERIC_ERROR_SECTION_VALIDBITS(public var Anonymous: WHEA_PROCESSOR_GENERIC_ERROR_SECTION_VALIDBITS_0 = WHEA_PROCESSOR_GENERIC_ERROR_SECTION_VALIDBITS_0(), public var ValidBits: ULong = 0uL)

public data class WHEA_PROCESSOR_GENERIC_ERROR_SECTION_VALIDBITS_0(public var _bitfield: ULong = 0uL)

public data class WHEA_PSHED_PI_CPU_BUSES_INIT_FAILED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Status: NTSTATUS = 0)

public data class WHEA_PSHED_PI_TRACE_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Buffer: ByteArray = ByteArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PSHED_PI_TRACE_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class WHEA_PSHED_PLUGIN_CALLBACKS(
    public var GetAllErrorSources: PSHED_PI_GET_ALL_ERROR_SOURCES = null,
    public var Reserved: Long = 0L,
    public var GetErrorSourceInfo: PSHED_PI_GET_ERROR_SOURCE_INFO = null,
    public var SetErrorSourceInfo: PSHED_PI_SET_ERROR_SOURCE_INFO = null,
    public var EnableErrorSource: PSHED_PI_ENABLE_ERROR_SOURCE = null,
    public var DisableErrorSource: PSHED_PI_DISABLE_ERROR_SOURCE = null,
    public var WriteErrorRecord: PSHED_PI_WRITE_ERROR_RECORD = null,
    public var ReadErrorRecord: PSHED_PI_READ_ERROR_RECORD = null,
    public var ClearErrorRecord: PSHED_PI_CLEAR_ERROR_RECORD = null,
    public var RetrieveErrorInfo: PSHED_PI_RETRIEVE_ERROR_INFO = null,
    public var FinalizeErrorRecord: PSHED_PI_FINALIZE_ERROR_RECORD = null,
    public var ClearErrorStatus: PSHED_PI_CLEAR_ERROR_STATUS = null,
    public var AttemptRecovery: PSHED_PI_ATTEMPT_ERROR_RECOVERY = null,
    public var GetInjectionCapabilities: PSHED_PI_GET_INJECTION_CAPABILITIES = null,
    public var InjectError: PSHED_PI_INJECT_ERROR = null,
)

public data class WHEA_PSHED_PLUGIN_DIMM_MISMATCH(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var FirmwareBank: UShort = 0u,
    public var FirmwareCol: UShort = 0u,
    public var FirmwareRow: UShort = 0u,
    public var RetryRdBank: UShort = 0u,
    public var RetryRdCol: UShort = 0u,
    public var RetryRdRow: UShort = 0u,
    public var TaBank: UShort = 0u,
    public var TaCol: UShort = 0u,
    public var TaRow: UShort = 0u,
)

public data class WHEA_PSHED_PLUGIN_ENABLE_NOTIFY_FAILED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var EnableError: WHEA_PSHED_PLUGIN_ENABLE_NOTIFY_ERRORS = 0)

public data class WHEA_PSHED_PLUGIN_HEARTBEAT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY())

public data class WHEA_PSHED_PLUGIN_INIT_FAILED_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var Status: NTSTATUS = 0)

public data class WHEA_PSHED_PLUGIN_LOAD_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var PluginName: UShortArray = UShortArray(32),
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PSHED_PLUGIN_LOAD_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.PluginName.contentEquals(other.PluginName)) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.PluginName.contentHashCode()
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        return result
    }
}

public data class WHEA_PSHED_PLUGIN_PLATFORM_SUPPORT_EVENT(
    public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(),
    public var PluginName: UShortArray = UShortArray(32),
    public var Supported: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PSHED_PLUGIN_PLATFORM_SUPPORT_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.PluginName.contentEquals(other.PluginName)) return false
        if (this.Supported != other.Supported) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.PluginName.contentHashCode()
        result = 31 * result + this.Supported.hashCode()
        return result
    }
}

public data class WHEA_PSHED_PLUGIN_REGISTRATION_PACKET_V1(
    public var Length: UInt = 0u,
    public var Version: UInt = 0u,
    public var Context: Long = 0L,
    public var FunctionalAreaMask: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Callbacks: WHEA_PSHED_PLUGIN_CALLBACKS = WHEA_PSHED_PLUGIN_CALLBACKS(),
)

public data class WHEA_PSHED_PLUGIN_REGISTRATION_PACKET_V2(
    public var Length: UInt = 0u,
    public var Version: UInt = 0u,
    public var Context: Long = 0L,
    public var FunctionalAreaMask: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Callbacks: WHEA_PSHED_PLUGIN_CALLBACKS = WHEA_PSHED_PLUGIN_CALLBACKS(),
    public var PluginHandle: Long = 0L,
)

public data class WHEA_PSHED_PLUGIN_UNLOAD_EVENT(public var WheaEventLogEntry: WHEA_EVENT_LOG_ENTRY = WHEA_EVENT_LOG_ENTRY(), public var PluginName: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WHEA_PSHED_PLUGIN_UNLOAD_EVENT) return false
        if (this.WheaEventLogEntry != other.WheaEventLogEntry) return false
        if (!this.PluginName.contentEquals(other.PluginName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WheaEventLogEntry.hashCode()
        result = 31 * result + this.PluginName.contentHashCode()
        return result
    }
}

public data class WHEA_RECOVERY_ACTION(public var Anonymous: WHEA_RECOVERY_ACTION_0 = WHEA_RECOVERY_ACTION_0(), public var AsULONG: UInt = 0u)

public data class WHEA_RECOVERY_ACTION_0(public var _bitfield1: UInt = 0u, public var _bitfield2: UInt = 0u)

public data class WHEA_RECOVERY_CONTEXT(
    public var Anonymous: WHEA_RECOVERY_CONTEXT_0 = WHEA_RECOVERY_CONTEXT_0(),
    public var PartitionId: ULong = 0uL,
    public var VpIndex: UInt = 0u,
    public var ErrorType: WHEA_RECOVERY_CONTEXT_ERROR_TYPE = 0,
)
