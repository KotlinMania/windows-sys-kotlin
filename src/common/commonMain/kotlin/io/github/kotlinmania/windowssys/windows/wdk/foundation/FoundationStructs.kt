@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FS_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.BUS_QUERY_ID_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DEVICE_RELATION_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DEVICE_TEXT_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DEVICE_USAGE_NOTIFICATION_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DIRECTORY_NOTIFY_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.INITIAL_PRIVILEGE_SET
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.KAPC
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.KDEVICE_QUEUE_ENTRY
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.POWER_STATE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.POWER_STATE_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.SYSTEM_POWER_STATE_CONTEXT
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WAIT_CONTEXT_BLOCK
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.foundation.OBJECT_ATTRIBUTE_FLAGS
import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import io.github.kotlinmania.windowssys.windows.win32.security.PRIVILEGE_SET
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_IMPERSONATION_LEVEL
import io.github.kotlinmania.windowssys.windows.win32.system.io.IO_STATUS_BLOCK
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SINGLE_LIST_ENTRY
import io.github.kotlinmania.windowssys.windows.win32.system.power.POWER_ACTION
import io.github.kotlinmania.windowssys.windows.win32.system.power.SYSTEM_POWER_STATE

public fun interface DRIVER_OBJECTMajorFunctionCallback {
    public operator fun invoke(deviceobject: Long, irp: Long): NTSTATUS
}

public data class ACCESS_STATE(
    public var OperationID: LUID = LUID(),
    public var SecurityEvaluated: Boolean = false,
    public var GenerateAudit: Boolean = false,
    public var GenerateOnClose: Boolean = false,
    public var PrivilegesAllocated: Boolean = false,
    public var Flags: UInt = 0u,
    public var RemainingDesiredAccess: UInt = 0u,
    public var PreviouslyGrantedAccess: UInt = 0u,
    public var OriginalDesiredAccess: UInt = 0u,
    public var SubjectSecurityContext: SECURITY_SUBJECT_CONTEXT = SECURITY_SUBJECT_CONTEXT(),
    public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var AuxData: Long = 0L,
    public var Privileges: ACCESS_STATE_0 = ACCESS_STATE_0(),
    public var AuditPrivileges: Boolean = false,
    public var ObjectName: UNICODE_STRING = UNICODE_STRING(),
    public var ObjectTypeName: UNICODE_STRING = UNICODE_STRING(),
)

public data class ACCESS_STATE_0(public var InitialPrivilegeSet: INITIAL_PRIVILEGE_SET = INITIAL_PRIVILEGE_SET(), public var PrivilegeSet: PRIVILEGE_SET = PRIVILEGE_SET())

public class DEVICE_OBJECT(
    public var Type: Short = 0,
    public var Size: UShort = 0u,
    public var ReferenceCount: Int = 0,
    public var DriverObject: Long = 0L,
    public var NextDevice: Long = 0L,
    public var AttachedDevice: Long = 0L,
    public var CurrentIrp: Long = 0L,
    public var Timer: PIO_TIMER = 0L,
    public var Flags: UInt = 0u,
    public var Characteristics: UInt = 0u,
    public var Vpb: Long = 0L,
    public var DeviceExtension: Long = 0L,
    public var DeviceType: UInt = 0u,
    public var StackSize: Byte = 0,
    public var Queue: DEVICE_OBJECT_0 = DEVICE_OBJECT_0(),
    public var AlignmentRequirement: UInt = 0u,
    public var DeviceQueue: KDEVICE_QUEUE = KDEVICE_QUEUE(),
    public var Dpc: KDPC = KDPC(),
    public var ActiveThreadCount: UInt = 0u,
    public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L,
    public var DeviceLock: KEVENT = KEVENT(),
    public var SectorSize: UShort = 0u,
    public var Spare1: UShort = 0u,
    public var DeviceObjectExtension: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class DEVICE_OBJECT_0(public var ListEntry: LIST_ENTRY = LIST_ENTRY(), public var Wcb: WAIT_CONTEXT_BLOCK = WAIT_CONTEXT_BLOCK())

public data class DEVOBJ_EXTENSION(
    public var Type: Short = 0,
    public var Size: UShort = 0u,
    public var DeviceObject: Long = 0L,
    public var PowerFlags: UInt = 0u,
    public var Dope: Long = 0L,
    public var ExtensionFlags: UInt = 0u,
    public var DeviceNode: Long = 0L,
    public var AttachedTo: Long = 0L,
    public var StartIoCount: Int = 0,
    public var StartIoKey: Int = 0,
    public var StartIoFlags: UInt = 0u,
    public var Vpb: Long = 0L,
    public var DependencyNode: Long = 0L,
    public var InterruptContext: Long = 0L,
    public var InterruptCount: Int = 0,
    public var VerifierContext: Long = 0L,
)

public data class DISPATCHER_HEADER(
    public var Anonymous: DISPATCHER_HEADER_0 = DISPATCHER_HEADER_0(),
    public var SignalState: Int = 0,
    public var WaitListHead: LIST_ENTRY = LIST_ENTRY(),
)

public data class DISPATCHER_HEADER_0(
    public var Anonymous1: DISPATCHER_HEADER_0_0 = DISPATCHER_HEADER_0_0(),
    public var Anonymous2: DISPATCHER_HEADER_0_1 = DISPATCHER_HEADER_0_1(),
    public var Anonymous3: DISPATCHER_HEADER_0_2 = DISPATCHER_HEADER_0_2(),
    public var Anonymous4: DISPATCHER_HEADER_0_3 = DISPATCHER_HEADER_0_3(),
    public var Anonymous5: DISPATCHER_HEADER_0_4 = DISPATCHER_HEADER_0_4(),
    public var Anonymous6: DISPATCHER_HEADER_0_5 = DISPATCHER_HEADER_0_5(),
    public var Anonymous7: DISPATCHER_HEADER_0_6 = DISPATCHER_HEADER_0_6(),
)

public data class DISPATCHER_HEADER_0_0(public var Lock: Int = 0, public var LockNV: Int = 0)

public data class DISPATCHER_HEADER_0_1(
    public var Type: UByte = 0u,
    public var Signalling: UByte = 0u,
    public var Size: UByte = 0u,
    public var Reserved1: UByte = 0u,
)

public data class DISPATCHER_HEADER_0_2(
    public var TimerType: UByte = 0u,
    public var Anonymous1: DISPATCHER_HEADER_0_2_0 = DISPATCHER_HEADER_0_2_0(),
    public var Hand: UByte = 0u,
    public var Anonymous2: DISPATCHER_HEADER_0_2_1 = DISPATCHER_HEADER_0_2_1(),
)

public data class DISPATCHER_HEADER_0_2_0(public var TimerControlFlags: UByte = 0u, public var Anonymous: DISPATCHER_HEADER_0_2_0_0 = DISPATCHER_HEADER_0_2_0_0())

public data class DISPATCHER_HEADER_0_2_0_0(public var _bitfield: UByte = 0u)

public data class DISPATCHER_HEADER_0_2_1(public var TimerMiscFlags: UByte = 0u, public var Anonymous: DISPATCHER_HEADER_0_2_1_0 = DISPATCHER_HEADER_0_2_1_0())

public data class DISPATCHER_HEADER_0_2_1_0(public var _bitfield: UByte = 0u)

public data class DISPATCHER_HEADER_0_3(
    public var Timer2Type: UByte = 0u,
    public var Anonymous: DISPATCHER_HEADER_0_3_0 = DISPATCHER_HEADER_0_3_0(),
    public var Timer2ComponentId: UByte = 0u,
    public var Timer2RelativeId: UByte = 0u,
)

public data class DISPATCHER_HEADER_0_3_0(public var Timer2Flags: UByte = 0u, public var Anonymous: DISPATCHER_HEADER_0_3_0_0 = DISPATCHER_HEADER_0_3_0_0())

public data class DISPATCHER_HEADER_0_3_0_0(public var _bitfield: UByte = 0u)

public data class DISPATCHER_HEADER_0_4(
    public var QueueType: UByte = 0u,
    public var Anonymous: DISPATCHER_HEADER_0_4_0 = DISPATCHER_HEADER_0_4_0(),
    public var QueueSize: UByte = 0u,
    public var QueueReserved: UByte = 0u,
)

public data class DISPATCHER_HEADER_0_4_0(public var QueueControlFlags: UByte = 0u, public var Anonymous: DISPATCHER_HEADER_0_4_0_0 = DISPATCHER_HEADER_0_4_0_0())

public data class DISPATCHER_HEADER_0_4_0_0(public var _bitfield: UByte = 0u)

public data class DISPATCHER_HEADER_0_5(
    public var ThreadType: UByte = 0u,
    public var ThreadReserved: UByte = 0u,
    public var Anonymous1: DISPATCHER_HEADER_0_5_0 = DISPATCHER_HEADER_0_5_0(),
    public var Anonymous2: DISPATCHER_HEADER_0_5_1 = DISPATCHER_HEADER_0_5_1(),
)

public data class DISPATCHER_HEADER_0_5_0(public var ThreadControlFlags: UByte = 0u, public var Anonymous: DISPATCHER_HEADER_0_5_0_0 = DISPATCHER_HEADER_0_5_0_0())

public data class DISPATCHER_HEADER_0_5_0_0(public var _bitfield: UByte = 0u)

public data class DISPATCHER_HEADER_0_5_1(public var DebugActive: UByte = 0u)

public data class DISPATCHER_HEADER_0_6(
    public var MutantType: UByte = 0u,
    public var MutantSize: UByte = 0u,
    public var DpcActive: Boolean = false,
    public var MutantReserved: UByte = 0u,
)

public data class DRIVER_EXTENSION(
    public var DriverObject: Long = 0L,
    public var AddDevice: DRIVER_ADD_DEVICE = null,
    public var Count: UInt = 0u,
    public var ServiceKeyName: UNICODE_STRING = UNICODE_STRING(),
)

public data class DRIVER_OBJECT(
    public var Type: Short = 0,
    public var Size: Short = 0,
    public var DeviceObject: Long = 0L,
    public var Flags: UInt = 0u,
    public var DriverStart: Long = 0L,
    public var DriverSize: UInt = 0u,
    public var DriverSection: Long = 0L,
    public var DriverExtension: Long = 0L,
    public var DriverName: UNICODE_STRING = UNICODE_STRING(),
    public var HardwareDatabase: Long = 0L,
    public var FastIoDispatch: Long = 0L,
    public var DriverInit: DRIVER_INITIALIZE = null,
    public var DriverStartIo: DRIVER_STARTIO = null,
    public var DriverUnload: DRIVER_UNLOAD = null,
    public var MajorFunction: List<DRIVER_DISPATCH> = List(28) { null },
)

public data class ERESOURCE(
    public var SystemResourcesList: LIST_ENTRY = LIST_ENTRY(),
    public var OwnerTable: Long = 0L,
    public var ActiveCount: Short = 0,
    public var Anonymous1: ERESOURCE_0 = ERESOURCE_0(),
    public var SharedWaiters: Long = 0L,
    public var ExclusiveWaiters: Long = 0L,
    public var OwnerEntry: OWNER_ENTRY = OWNER_ENTRY(),
    public var ActiveEntries: UInt = 0u,
    public var ContentionCount: UInt = 0u,
    public var NumberOfSharedWaiters: UInt = 0u,
    public var NumberOfExclusiveWaiters: UInt = 0u,
    public var Anonymous2: ERESOURCE_1 = ERESOURCE_1(),
    public var SpinLock: ULong = 0uL,
)

public data class ERESOURCE_0(public var Flag: UShort = 0u, public var Anonymous: ERESOURCE_0_0 = ERESOURCE_0_0())

public data class ERESOURCE_0_0(public var ReservedLowFlags: UByte = 0u, public var WaiterPriority: UByte = 0u)

public data class ERESOURCE_1(public var Address: Long = 0L, public var CreatorBackTraceIndex: ULong = 0uL)

public class FAST_IO_DISPATCH(
    public var SizeOfFastIoDispatch: UInt = 0u,
    public var FastIoCheckIfPossible: FAST_IO_CHECK_IF_POSSIBLE = null,
    public var FastIoRead: FAST_IO_READ = null,
    public var FastIoWrite: FAST_IO_WRITE = null,
    public var FastIoQueryBasicInfo: FAST_IO_QUERY_BASIC_INFO = null,
    public var FastIoQueryStandardInfo: FAST_IO_QUERY_STANDARD_INFO = null,
    public var FastIoLock: FAST_IO_LOCK = null,
    public var FastIoUnlockSingle: FAST_IO_UNLOCK_SINGLE = null,
    public var FastIoUnlockAll: FAST_IO_UNLOCK_ALL = null,
    public var FastIoUnlockAllByKey: FAST_IO_UNLOCK_ALL_BY_KEY = null,
    public var FastIoDeviceControl: FAST_IO_DEVICE_CONTROL = null,
    public var AcquireFileForNtCreateSection: FAST_IO_ACQUIRE_FILE = null,
    public var ReleaseFileForNtCreateSection: FAST_IO_RELEASE_FILE = null,
    public var FastIoDetachDevice: FAST_IO_DETACH_DEVICE = null,
    public var FastIoQueryNetworkOpenInfo: FAST_IO_QUERY_NETWORK_OPEN_INFO = null,
    public var AcquireForModWrite: FAST_IO_ACQUIRE_FOR_MOD_WRITE = null,
    public var MdlRead: FAST_IO_MDL_READ = null,
    public var MdlReadComplete: FAST_IO_MDL_READ_COMPLETE = null,
    public var PrepareMdlWrite: FAST_IO_PREPARE_MDL_WRITE = null,
    public var MdlWriteComplete: FAST_IO_MDL_WRITE_COMPLETE = null,
    public var FastIoReadCompressed: FAST_IO_READ_COMPRESSED = null,
    public var FastIoWriteCompressed: FAST_IO_WRITE_COMPRESSED = null,
    public var MdlReadCompleteCompressed: FAST_IO_MDL_READ_COMPLETE_COMPRESSED = null,
    public var MdlWriteCompleteCompressed: FAST_IO_MDL_WRITE_COMPLETE_COMPRESSED = null,
    public var FastIoQueryOpen: FAST_IO_QUERY_OPEN = null,
    public var ReleaseForModWrite: FAST_IO_RELEASE_FOR_MOD_WRITE = null,
    public var AcquireForCcFlush: FAST_IO_ACQUIRE_FOR_CCFLUSH = null,
    public var ReleaseForCcFlush: FAST_IO_RELEASE_FOR_CCFLUSH = null,
)

public data class FAST_MUTEX(
    public var Count: Int = 0,
    public var Owner: Long = 0L,
    public var Contention: UInt = 0u,
    public var Event: KEVENT = KEVENT(),
    public var OldIrql: UInt = 0u,
)

public class FILE_OBJECT(
    public var Type: Short = 0,
    public var Size: Short = 0,
    public var DeviceObject: Long = 0L,
    public var Vpb: Long = 0L,
    public var FsContext: Long = 0L,
    public var FsContext2: Long = 0L,
    public var SectionObjectPointer: Long = 0L,
    public var PrivateCacheMap: Long = 0L,
    public var FinalStatus: NTSTATUS = 0,
    public var RelatedFileObject: Long = 0L,
    public var LockOperation: Boolean = false,
    public var DeletePending: Boolean = false,
    public var ReadAccess: Boolean = false,
    public var WriteAccess: Boolean = false,
    public var DeleteAccess: Boolean = false,
    public var SharedRead: Boolean = false,
    public var SharedWrite: Boolean = false,
    public var SharedDelete: Boolean = false,
    public var Flags: UInt = 0u,
    public var FileName: UNICODE_STRING = UNICODE_STRING(),
    public var CurrentByteOffset: Long = 0L,
    public var Waiters: UInt = 0u,
    public var Busy: UInt = 0u,
    public var LastLock: Long = 0L,
    public var Lock: KEVENT = KEVENT(),
    public var Event: KEVENT = KEVENT(),
    public var CompletionContext: Long = 0L,
    public var IrpListLock: ULong = 0uL,
    public var IrpList: LIST_ENTRY = LIST_ENTRY(),
    public var FileObjectExtension: Long = 0L,
)

public data class IO_COMPLETION_CONTEXT(
    public var Port: Long = 0L,
    public var Key: Long = 0L,
    public var UsageCount: Long = 0L,
)

public data class IO_SECURITY_CONTEXT(
    public var SecurityQos: Long = 0L,
    public var AccessState: Long = 0L,
    public var DesiredAccess: UInt = 0u,
    public var FullCreateOptions: UInt = 0u,
)

public data class IO_STACK_LOCATION(
    public var MajorFunction: UByte = 0u,
    public var MinorFunction: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Control: UByte = 0u,
    public var Parameters: IO_STACK_LOCATION_0 = IO_STACK_LOCATION_0(),
    public var DeviceObject: Long = 0L,
    public var FileObject: Long = 0L,
    public var CompletionRoutine: PIO_COMPLETION_ROUTINE = null,
    public var Context: Long = 0L,
)

public class IO_STACK_LOCATION_0(
    public var Create: IO_STACK_LOCATION_0_0 = IO_STACK_LOCATION_0_0(),
    public var CreatePipe: IO_STACK_LOCATION_0_1 = IO_STACK_LOCATION_0_1(),
    public var CreateMailslot: IO_STACK_LOCATION_0_2 = IO_STACK_LOCATION_0_2(),
    public var Read: IO_STACK_LOCATION_0_3 = IO_STACK_LOCATION_0_3(),
    public var Write: IO_STACK_LOCATION_0_4 = IO_STACK_LOCATION_0_4(),
    public var QueryDirectory: IO_STACK_LOCATION_0_5 = IO_STACK_LOCATION_0_5(),
    public var NotifyDirectory: IO_STACK_LOCATION_0_6 = IO_STACK_LOCATION_0_6(),
    public var NotifyDirectoryEx: IO_STACK_LOCATION_0_7 = IO_STACK_LOCATION_0_7(),
    public var QueryFile: IO_STACK_LOCATION_0_8 = IO_STACK_LOCATION_0_8(),
    public var SetFile: IO_STACK_LOCATION_0_9 = IO_STACK_LOCATION_0_9(),
    public var QueryEa: IO_STACK_LOCATION_0_10 = IO_STACK_LOCATION_0_10(),
    public var SetEa: IO_STACK_LOCATION_0_11 = IO_STACK_LOCATION_0_11(),
    public var QueryVolume: IO_STACK_LOCATION_0_12 = IO_STACK_LOCATION_0_12(),
    public var SetVolume: IO_STACK_LOCATION_0_13 = IO_STACK_LOCATION_0_13(),
    public var FileSystemControl: IO_STACK_LOCATION_0_14 = IO_STACK_LOCATION_0_14(),
    public var LockControl: IO_STACK_LOCATION_0_15 = IO_STACK_LOCATION_0_15(),
    public var DeviceIoControl: IO_STACK_LOCATION_0_16 = IO_STACK_LOCATION_0_16(),
    public var QuerySecurity: IO_STACK_LOCATION_0_17 = IO_STACK_LOCATION_0_17(),
    public var SetSecurity: IO_STACK_LOCATION_0_18 = IO_STACK_LOCATION_0_18(),
    public var MountVolume: IO_STACK_LOCATION_0_19 = IO_STACK_LOCATION_0_19(),
    public var VerifyVolume: IO_STACK_LOCATION_0_20 = IO_STACK_LOCATION_0_20(),
    public var Scsi: IO_STACK_LOCATION_0_21 = IO_STACK_LOCATION_0_21(),
    public var QueryQuota: IO_STACK_LOCATION_0_22 = IO_STACK_LOCATION_0_22(),
    public var SetQuota: IO_STACK_LOCATION_0_23 = IO_STACK_LOCATION_0_23(),
    public var QueryDeviceRelations: IO_STACK_LOCATION_0_24 = IO_STACK_LOCATION_0_24(),
    public var QueryInterface: IO_STACK_LOCATION_0_25 = IO_STACK_LOCATION_0_25(),
    public var DeviceCapabilities: IO_STACK_LOCATION_0_26 = IO_STACK_LOCATION_0_26(),
    public var FilterResourceRequirements: IO_STACK_LOCATION_0_27 = IO_STACK_LOCATION_0_27(),
    public var ReadWriteConfig: IO_STACK_LOCATION_0_28 = IO_STACK_LOCATION_0_28(),
    public var SetLock: IO_STACK_LOCATION_0_29 = IO_STACK_LOCATION_0_29(),
    public var QueryId: IO_STACK_LOCATION_0_30 = IO_STACK_LOCATION_0_30(),
    public var QueryDeviceText: IO_STACK_LOCATION_0_31 = IO_STACK_LOCATION_0_31(),
    public var UsageNotification: IO_STACK_LOCATION_0_32 = IO_STACK_LOCATION_0_32(),
    public var WaitWake: IO_STACK_LOCATION_0_33 = IO_STACK_LOCATION_0_33(),
    public var PowerSequence: IO_STACK_LOCATION_0_34 = IO_STACK_LOCATION_0_34(),
    public var Power: IO_STACK_LOCATION_0_35 = IO_STACK_LOCATION_0_35(),
    public var StartDevice: IO_STACK_LOCATION_0_36 = IO_STACK_LOCATION_0_36(),
    public var WMI: IO_STACK_LOCATION_0_37 = IO_STACK_LOCATION_0_37(),
    public var Others: IO_STACK_LOCATION_0_38 = IO_STACK_LOCATION_0_38(),
)

public data class IO_STACK_LOCATION_0_2(
    public var SecurityContext: Long = 0L,
    public var Options: UInt = 0u,
    public var Reserved: UShort = 0u,
    public var ShareAccess: UShort = 0u,
    public var Parameters: Long = 0L,
)

public data class IO_STACK_LOCATION_0_1(
    public var SecurityContext: Long = 0L,
    public var Options: UInt = 0u,
    public var Reserved: UShort = 0u,
    public var ShareAccess: UShort = 0u,
    public var Parameters: Long = 0L,
)

public data class IO_STACK_LOCATION_0_0(
    public var SecurityContext: Long = 0L,
    public var Options: UInt = 0u,
    public var FileAttributes: UShort = 0u,
    public var ShareAccess: UShort = 0u,
    public var EaLength: UInt = 0u,
)

public data class IO_STACK_LOCATION_0_26(public var Capabilities: Long = 0L)

public data class IO_STACK_LOCATION_0_16(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var IoControlCode: UInt = 0u,
    public var Type3InputBuffer: Long = 0L,
)

public data class IO_STACK_LOCATION_0_14(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var FsControlCode: UInt = 0u,
    public var Type3InputBuffer: Long = 0L,
)

public data class IO_STACK_LOCATION_0_27(public var IoResourceRequirementList: Long = 0L)

public data class IO_STACK_LOCATION_0_15(
    public var Length: Long = 0L,
    public var Key: UInt = 0u,
    public var ByteOffset: Long = 0L,
)

public data class IO_STACK_LOCATION_0_19(public var Vpb: Long = 0L, public var DeviceObject: Long = 0L)

public data class IO_STACK_LOCATION_0_7(
    public var Length: UInt = 0u,
    public var CompletionFilter: UInt = 0u,
    public var DirectoryNotifyInformationClass: DIRECTORY_NOTIFY_INFORMATION_CLASS = 0,
)

public data class IO_STACK_LOCATION_0_6(public var Length: UInt = 0u, public var CompletionFilter: UInt = 0u)

public data class IO_STACK_LOCATION_0_38(
    public var Argument1: Long = 0L,
    public var Argument2: Long = 0L,
    public var Argument3: Long = 0L,
    public var Argument4: Long = 0L,
)

public data class IO_STACK_LOCATION_0_34(public var PowerSequence: Long = 0L)

public data class IO_STACK_LOCATION_0_35(
    public var Anonymous: IO_STACK_LOCATION_0_35_0 = IO_STACK_LOCATION_0_35_0(),
    public var Type: POWER_STATE_TYPE = 0,
    public var State: POWER_STATE = POWER_STATE(),
    public var ShutdownType: POWER_ACTION = 0,
)

public data class IO_STACK_LOCATION_0_35_0(public var SystemContext: UInt = 0u, public var SystemPowerStateContext: SYSTEM_POWER_STATE_CONTEXT = SYSTEM_POWER_STATE_CONTEXT())

public data class IO_STACK_LOCATION_0_24(public var Type: DEVICE_RELATION_TYPE = 0)

public data class IO_STACK_LOCATION_0_31(public var DeviceTextType: DEVICE_TEXT_TYPE = 0, public var LocaleId: UInt = 0u)

public data class IO_STACK_LOCATION_0_5(
    public var Length: UInt = 0u,
    public var FileName: Long = 0L,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
    public var FileIndex: UInt = 0u,
)

public data class IO_STACK_LOCATION_0_10(
    public var Length: UInt = 0u,
    public var EaList: Long = 0L,
    public var EaListLength: UInt = 0u,
    public var EaIndex: UInt = 0u,
)

public data class IO_STACK_LOCATION_0_8(public var Length: UInt = 0u, public var FileInformationClass: FILE_INFORMATION_CLASS = 0)

public data class IO_STACK_LOCATION_0_30(public var IdType: BUS_QUERY_ID_TYPE = 0)

public data class IO_STACK_LOCATION_0_25(
    public var InterfaceType: Long = 0L,
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Interface: Long = 0L,
    public var InterfaceSpecificData: Long = 0L,
)

public data class IO_STACK_LOCATION_0_22(
    public var Length: UInt = 0u,
    public var StartSid: PSID = 0L,
    public var SidList: Long = 0L,
    public var SidListLength: UInt = 0u,
)

public data class IO_STACK_LOCATION_0_17(public var SecurityInformation: UInt = 0u, public var Length: UInt = 0u)

public data class IO_STACK_LOCATION_0_12(public var Length: UInt = 0u, public var FsInformationClass: FS_INFORMATION_CLASS = 0)

public data class IO_STACK_LOCATION_0_28(
    public var WhichSpace: UInt = 0u,
    public var Buffer: Long = 0L,
    public var Offset: UInt = 0u,
    public var Length: UInt = 0u,
)

public data class IO_STACK_LOCATION_0_3(
    public var Length: UInt = 0u,
    public var Key: UInt = 0u,
    public var ByteOffset: Long = 0L,
)

public data class IO_STACK_LOCATION_0_21(public var Srb: Long = 0L)

public data class IO_STACK_LOCATION_0_11(public var Length: UInt = 0u)

public data class IO_STACK_LOCATION_0_9(
    public var Length: UInt = 0u,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
    public var FileObject: Long = 0L,
    public var Anonymous: IO_STACK_LOCATION_0_9_0 = IO_STACK_LOCATION_0_9_0(),
)

public data class IO_STACK_LOCATION_0_9_0(
    public var Anonymous: IO_STACK_LOCATION_0_9_0_0 = IO_STACK_LOCATION_0_9_0_0(),
    public var ClusterCount: UInt = 0u,
    public var DeleteHandle: HANDLE = 0L,
)

public data class IO_STACK_LOCATION_0_9_0_0(public var ReplaceIfExists: Boolean = false, public var AdvanceOnly: Boolean = false)

public data class IO_STACK_LOCATION_0_29(public var Lock: Boolean = false)

public data class IO_STACK_LOCATION_0_23(public var Length: UInt = 0u)

public data class IO_STACK_LOCATION_0_18(public var SecurityInformation: UInt = 0u, public var SecurityDescriptor: PSECURITY_DESCRIPTOR = 0L)

public data class IO_STACK_LOCATION_0_13(public var Length: UInt = 0u, public var FsInformationClass: FS_INFORMATION_CLASS = 0)

public data class IO_STACK_LOCATION_0_36(public var AllocatedResources: Long = 0L, public var AllocatedResourcesTranslated: Long = 0L)

public data class IO_STACK_LOCATION_0_32(
    public var InPath: Boolean = false,
    public var Reserved: BooleanArray = BooleanArray(3),
    public var Type: DEVICE_USAGE_NOTIFICATION_TYPE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IO_STACK_LOCATION_0_32) return false
        if (this.InPath != other.InPath) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Type != other.Type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InPath.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Type.hashCode()
        return result
    }
}

public data class IO_STACK_LOCATION_0_20(public var Vpb: Long = 0L, public var DeviceObject: Long = 0L)

public data class IO_STACK_LOCATION_0_37(
    public var ProviderId: ULong = 0uL,
    public var DataPath: Long = 0L,
    public var BufferSize: UInt = 0u,
    public var Buffer: Long = 0L,
)

public data class IO_STACK_LOCATION_0_33(public var PowerState: SYSTEM_POWER_STATE = 0)

public data class IO_STACK_LOCATION_0_4(
    public var Length: UInt = 0u,
    public var Key: UInt = 0u,
    public var ByteOffset: Long = 0L,
)

public class IRP(
    public var Type: Short = 0,
    public var Size: UShort = 0u,
    public var MdlAddress: Long = 0L,
    public var Flags: UInt = 0u,
    public var AssociatedIrp: IRP_0 = IRP_0(),
    public var ThreadListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var IoStatus: IO_STATUS_BLOCK = IO_STATUS_BLOCK(),
    public var RequestorMode: Byte = 0,
    public var PendingReturned: Boolean = false,
    public var StackCount: Byte = 0,
    public var CurrentLocation: Byte = 0,
    public var Cancel: Boolean = false,
    public var CancelIrql: UByte = 0u,
    public var ApcEnvironment: Byte = 0,
    public var AllocationFlags: UByte = 0u,
    public var Anonymous: IRP_1 = IRP_1(),
    public var UserEvent: Long = 0L,
    public var Overlay: IRP_2 = IRP_2(),
    public var CancelRoutine: DRIVER_CANCEL = null,
    public var UserBuffer: Long = 0L,
    public var Tail: IRP_3 = IRP_3(),
)

public data class IRP_1(public var UserIosb: Long = 0L, public var IoRingContext: Long = 0L)

public data class IRP_0(
    public var MasterIrp: Long = 0L,
    public var IrpCount: Int = 0,
    public var SystemBuffer: Long = 0L,
)

public data class IRP_2(public var AsynchronousParameters: IRP_2_0 = IRP_2_0(), public var AllocationSize: Long = 0L)

public data class IRP_2_0(public var Anonymous1: IRP_2_0_0 = IRP_2_0_0(), public var Anonymous2: IRP_2_0_1 = IRP_2_0_1())

public data class IRP_2_0_0(public var UserApcRoutine: PIO_APC_ROUTINE = null, public var IssuingProcess: Long = 0L)

public data class IRP_2_0_1(public var UserApcContext: Long = 0L, public var IoRing: Long = 0L)

public data class IRP_3(
    public var Overlay: IRP_3_0 = IRP_3_0(),
    public var Apc: KAPC = KAPC(),
    public var CompletionKey: Long = 0L,
)

public data class IRP_3_0(
    public var Anonymous1: IRP_3_0_0 = IRP_3_0_0(),
    public var Thread: PETHREAD = 0L,
    public var AuxiliaryBuffer: PSTR = 0L,
    public var Anonymous2: IRP_3_0_1 = IRP_3_0_1(),
    public var OriginalFileObject: Long = 0L,
)

public data class IRP_3_0_0(public var DeviceQueueEntry: KDEVICE_QUEUE_ENTRY = KDEVICE_QUEUE_ENTRY(), public var Anonymous: IRP_3_0_0_0 = IRP_3_0_0_0())

public data class IRP_3_0_0_0(public var DriverContext: LongArray = LongArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IRP_3_0_0_0) return false
        if (!this.DriverContext.contentEquals(other.DriverContext)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DriverContext.contentHashCode()
    }
}

public data class IRP_3_0_1(public var ListEntry: LIST_ENTRY = LIST_ENTRY(), public var Anonymous: IRP_3_0_1_0 = IRP_3_0_1_0())

public data class IRP_3_0_1_0(public var CurrentStackLocation: Long = 0L, public var PacketType: UInt = 0u)

public data class KDEVICE_QUEUE(
    public var Type: Short = 0,
    public var Size: Short = 0,
    public var DeviceListHead: LIST_ENTRY = LIST_ENTRY(),
    public var Lock: ULong = 0uL,
    public var Busy: Boolean = false,
)

public data class KDPC(
    public var Anonymous: KDPC_0 = KDPC_0(),
    public var DpcListEntry: SINGLE_LIST_ENTRY = SINGLE_LIST_ENTRY(),
    public var ProcessorHistory: ULong = 0uL,
    public var DeferredRoutine: PKDEFERRED_ROUTINE = null,
    public var DeferredContext: Long = 0L,
    public var SystemArgument1: Long = 0L,
    public var SystemArgument2: Long = 0L,
    public var DpcData: Long = 0L,
)

public data class KDPC_0(public var TargetInfoAsUlong: UInt = 0u, public var Anonymous: KDPC_0_0 = KDPC_0_0())

public data class KDPC_0_0(
    public var Type: UByte = 0u,
    public var Importance: UByte = 0u,
    public var Number: UShort = 0u,
)

public data class KEVENT(public var Header: DISPATCHER_HEADER = DISPATCHER_HEADER())

public data class KMUTANT(
    public var Header: DISPATCHER_HEADER = DISPATCHER_HEADER(),
    public var MutantListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var OwnerThread: Long = 0L,
    public var Anonymous: KMUTANT_0 = KMUTANT_0(),
    public var ApcDisable: UByte = 0u,
)

public data class KMUTANT_0(public var MutantFlags: UByte = 0u, public var Anonymous: KMUTANT_0_0 = KMUTANT_0_0())

public data class KMUTANT_0_0(public var _bitfield: UByte = 0u)

public data class KQUEUE(
    public var Header: DISPATCHER_HEADER = DISPATCHER_HEADER(),
    public var EntryListHead: LIST_ENTRY = LIST_ENTRY(),
    public var CurrentCount: UInt = 0u,
    public var MaximumCount: UInt = 0u,
    public var ThreadListHead: LIST_ENTRY = LIST_ENTRY(),
)

public data class KWAIT_BLOCK(
    public var WaitListEntry: LIST_ENTRY = LIST_ENTRY(),
    public var WaitType: UByte = 0u,
    public var BlockState: UByte = 0u,
    public var WaitKey: UShort = 0u,
    public var Anonymous: KWAIT_BLOCK_0 = KWAIT_BLOCK_0(),
    public var Object: Long = 0L,
    public var SparePtr: Long = 0L,
)

public data class KWAIT_BLOCK_0(
    public var Thread: Long = 0L,
    public var NotificationQueue: Long = 0L,
    public var Dpc: Long = 0L,
)

public data class MDL(
    public var Next: Long = 0L,
    public var Size: Short = 0,
    public var MdlFlags: Short = 0,
    public var Process: Long = 0L,
    public var MappedSystemVa: Long = 0L,
    public var StartVa: Long = 0L,
    public var ByteCount: UInt = 0u,
    public var ByteOffset: UInt = 0u,
)

public data class OBJECT_ATTRIBUTES(
    public var Length: UInt = 0u,
    public var RootDirectory: HANDLE = 0L,
    public var ObjectName: Long = 0L,
    public var Attributes: OBJECT_ATTRIBUTE_FLAGS = 0u,
    public var SecurityDescriptor: Long = 0L,
    public var SecurityQualityOfService: Long = 0L,
)

public data class OBJECT_ATTRIBUTES32(
    public var Length: UInt = 0u,
    public var RootDirectory: UInt = 0u,
    public var ObjectName: UInt = 0u,
    public var Attributes: OBJECT_ATTRIBUTE_FLAGS = 0u,
    public var SecurityDescriptor: Long = 0L,
    public var SecurityQualityOfService: Long = 0L,
)

public data class OBJECT_ATTRIBUTES64(
    public var Length: UInt = 0u,
    public var RootDirectory: ULong = 0uL,
    public var ObjectName: ULong = 0uL,
    public var Attributes: OBJECT_ATTRIBUTE_FLAGS = 0u,
    public var SecurityDescriptor: Long = 0L,
    public var SecurityQualityOfService: Long = 0L,
)

public data class OBJECT_NAME_INFORMATION(public var Name: UNICODE_STRING = UNICODE_STRING())

public data class OWNER_ENTRY(public var OwnerThread: ULong = 0uL, public var Anonymous: OWNER_ENTRY_0 = OWNER_ENTRY_0())

public data class OWNER_ENTRY_0(public var Anonymous: OWNER_ENTRY_0_0 = OWNER_ENTRY_0_0(), public var TableSize: UInt = 0u)

public data class OWNER_ENTRY_0_0(public var _bitfield: UInt = 0u)

public data class RTL_SPLAY_LINKS(
    public var Parent: Long = 0L,
    public var LeftChild: Long = 0L,
    public var RightChild: Long = 0L,
)

public data class SECTION_OBJECT_POINTERS(
    public var DataSectionObject: Long = 0L,
    public var SharedCacheMap: Long = 0L,
    public var ImageSectionObject: Long = 0L,
)

public data class SECURITY_SUBJECT_CONTEXT(
    public var ClientToken: Long = 0L,
    public var ImpersonationLevel: SECURITY_IMPERSONATION_LEVEL = 0,
    public var PrimaryToken: Long = 0L,
    public var ProcessAuditId: Long = 0L,
)

public data class TARGET_DEVICE_CUSTOM_NOTIFICATION(
    public var Version: UShort = 0u,
    public var Size: UShort = 0u,
    public var Event: GUID = GUID(),
    public var FileObject: Long = 0L,
    public var NameBufferOffset: Int = 0,
    public var CustomDataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TARGET_DEVICE_CUSTOM_NOTIFICATION) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Event != other.Event) return false
        if (this.FileObject != other.FileObject) return false
        if (this.NameBufferOffset != other.NameBufferOffset) return false
        if (!this.CustomDataBuffer.contentEquals(other.CustomDataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Event.hashCode()
        result = 31 * result + this.FileObject.hashCode()
        result = 31 * result + this.NameBufferOffset.hashCode()
        result = 31 * result + this.CustomDataBuffer.contentHashCode()
        return result
    }
}

public data class VPB(
    public var Type: Short = 0,
    public var Size: Short = 0,
    public var Flags: UShort = 0u,
    public var VolumeLabelLength: UShort = 0u,
    public var DeviceObject: Long = 0L,
    public var RealDevice: Long = 0L,
    public var SerialNumber: UInt = 0u,
    public var ReferenceCount: UInt = 0u,
    public var VolumeLabel: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VPB) return false
        if (this.Type != other.Type) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.VolumeLabelLength != other.VolumeLabelLength) return false
        if (this.DeviceObject != other.DeviceObject) return false
        if (this.RealDevice != other.RealDevice) return false
        if (this.SerialNumber != other.SerialNumber) return false
        if (this.ReferenceCount != other.ReferenceCount) return false
        if (!this.VolumeLabel.contentEquals(other.VolumeLabel)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.VolumeLabelLength.hashCode()
        result = 31 * result + this.DeviceObject.hashCode()
        result = 31 * result + this.RealDevice.hashCode()
        result = 31 * result + this.SerialNumber.hashCode()
        result = 31 * result + this.ReferenceCount.hashCode()
        result = 31 * result + this.VolumeLabel.contentHashCode()
        return result
    }
}

public data class WORK_QUEUE_ITEM(
    public var List: LIST_ENTRY = LIST_ENTRY(),
    public var WorkerRoutine: PWORKER_THREAD_ROUTINE = null,
    public var Parameter: Long = 0L,
)
