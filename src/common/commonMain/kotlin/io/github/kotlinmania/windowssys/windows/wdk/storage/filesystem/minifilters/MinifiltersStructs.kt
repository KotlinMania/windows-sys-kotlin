@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FILE_INFORMATION_CLASS
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FS_FILTER_SECTION_SYNC_TYPE
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FS_INFORMATION_CLASS

public data class FLT_CALLBACK_DATA(
    public var Flags: UInt = 0u,
    public var Thread: Foundation.PETHREAD = Foundation.PETHREAD(),
    public var Iopb: Long = 0L,
    public var IoStatus: Win32.System.IO.IO_STATUS_BLOCK = Win32.System.IO.IO_STATUS_BLOCK(),
    public var TagData: Long = 0L,
    public var Anonymous: FLT_CALLBACK_DATA_0 = FLT_CALLBACK_DATA_0(),
    public var RequestorMode: Byte = 0,
)

public data class FLT_CALLBACK_DATA_0(public var Anonymous: FLT_CALLBACK_DATA_0_0 = FLT_CALLBACK_DATA_0_0(), public var FilterContext: LongArray = LongArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_CALLBACK_DATA_0) return false
        if (this.Anonymous != other.Anonymous) return false
        if (!this.FilterContext.contentEquals(other.FilterContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous.hashCode()
        result = 31 * result + this.FilterContext.contentHashCode()
        return result
    }
}

public data class FLT_CALLBACK_DATA_0_0(public var QueueLinks: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(), public var QueueContext: LongArray = LongArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_CALLBACK_DATA_0_0) return false
        if (this.QueueLinks != other.QueueLinks) return false
        if (!this.QueueContext.contentEquals(other.QueueContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.QueueLinks.hashCode()
        result = 31 * result + this.QueueContext.contentHashCode()
        return result
    }
}

public data class FLT_CALLBACK_DATA_QUEUE(
    public var Csq: System.SystemServices.IO_CSQ = System.SystemServices.IO_CSQ(),
    public var Flags: FLT_CALLBACK_DATA_QUEUE_FLAGS = 0,
    public var Instance: PFLT_INSTANCE = 0L,
    public var InsertIo: PFLT_CALLBACK_DATA_QUEUE_INSERT_IO = null,
    public var RemoveIo: PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO = null,
    public var PeekNextIo: PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO = null,
    public var Acquire: PFLT_CALLBACK_DATA_QUEUE_ACQUIRE = null,
    public var Release: PFLT_CALLBACK_DATA_QUEUE_RELEASE = null,
    public var CompleteCanceledIo: PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO = null,
)

public data class FLT_CONTEXT_REGISTRATION(
    public var ContextType: UShort = 0u,
    public var Flags: UShort = 0u,
    public var ContextCleanupCallback: PFLT_CONTEXT_CLEANUP_CALLBACK = null,
    public var Size: ULong = 0uL,
    public var PoolTag: UInt = 0u,
    public var ContextAllocateCallback: PFLT_CONTEXT_ALLOCATE_CALLBACK = null,
    public var ContextFreeCallback: PFLT_CONTEXT_FREE_CALLBACK = null,
    public var Reserved1: Long = 0L,
)

public data class FLT_CREATEFILE_TARGET_ECP_CONTEXT(
    public var Instance: PFLT_INSTANCE = 0L,
    public var Volume: PFLT_VOLUME = 0L,
    public var FileNameInformation: Long = 0L,
    public var Flags: UShort = 0u,
)

public data class FLT_FILE_NAME_INFORMATION(
    public var Size: UShort = 0u,
    public var NamesParsed: UShort = 0u,
    public var Format: UInt = 0u,
    public var Name: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var Volume: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var Share: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var Extension: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var Stream: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var FinalComponent: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var ParentDir: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
)

public data class FLT_IO_PARAMETER_BLOCK(
    public var IrpFlags: UInt = 0u,
    public var MajorFunction: UByte = 0u,
    public var MinorFunction: UByte = 0u,
    public var OperationFlags: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TargetFileObject: Long = 0L,
    public var TargetInstance: PFLT_INSTANCE = 0L,
    public var Parameters: FLT_PARAMETERS = FLT_PARAMETERS(),
)

public data class FLT_NAME_CONTROL(public var Name: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING())

public data class FLT_OPERATION_REGISTRATION(
    public var MajorFunction: UByte = 0u,
    public var Flags: UInt = 0u,
    public var PreOperation: PFLT_PRE_OPERATION_CALLBACK = null,
    public var PostOperation: PFLT_POST_OPERATION_CALLBACK = null,
    public var Reserved1: Long = 0L,
)

public class FLT_PARAMETERS(
    public var Create: FLT_PARAMETERS_0 = FLT_PARAMETERS_0(),
    public var CreatePipe: FLT_PARAMETERS_1 = FLT_PARAMETERS_1(),
    public var CreateMailslot: FLT_PARAMETERS_2 = FLT_PARAMETERS_2(),
    public var Read: FLT_PARAMETERS_3 = FLT_PARAMETERS_3(),
    public var Write: FLT_PARAMETERS_4 = FLT_PARAMETERS_4(),
    public var QueryFileInformation: FLT_PARAMETERS_5 = FLT_PARAMETERS_5(),
    public var SetFileInformation: FLT_PARAMETERS_6 = FLT_PARAMETERS_6(),
    public var QueryEa: FLT_PARAMETERS_7 = FLT_PARAMETERS_7(),
    public var SetEa: FLT_PARAMETERS_8 = FLT_PARAMETERS_8(),
    public var QueryVolumeInformation: FLT_PARAMETERS_9 = FLT_PARAMETERS_9(),
    public var SetVolumeInformation: FLT_PARAMETERS_10 = FLT_PARAMETERS_10(),
    public var DirectoryControl: FLT_PARAMETERS_11 = FLT_PARAMETERS_11(),
    public var FileSystemControl: FLT_PARAMETERS_12 = FLT_PARAMETERS_12(),
    public var DeviceIoControl: FLT_PARAMETERS_13 = FLT_PARAMETERS_13(),
    public var LockControl: FLT_PARAMETERS_14 = FLT_PARAMETERS_14(),
    public var QuerySecurity: FLT_PARAMETERS_15 = FLT_PARAMETERS_15(),
    public var SetSecurity: FLT_PARAMETERS_16 = FLT_PARAMETERS_16(),
    public var WMI: FLT_PARAMETERS_17 = FLT_PARAMETERS_17(),
    public var QueryQuota: FLT_PARAMETERS_18 = FLT_PARAMETERS_18(),
    public var SetQuota: FLT_PARAMETERS_19 = FLT_PARAMETERS_19(),
    public var Pnp: FLT_PARAMETERS_20 = FLT_PARAMETERS_20(),
    public var AcquireForSectionSynchronization: FLT_PARAMETERS_21 = FLT_PARAMETERS_21(),
    public var AcquireForModifiedPageWriter: FLT_PARAMETERS_22 = FLT_PARAMETERS_22(),
    public var ReleaseForModifiedPageWriter: FLT_PARAMETERS_23 = FLT_PARAMETERS_23(),
    public var QueryOpen: FLT_PARAMETERS_24 = FLT_PARAMETERS_24(),
    public var FastIoCheckIfPossible: FLT_PARAMETERS_25 = FLT_PARAMETERS_25(),
    public var NetworkQueryOpen: FLT_PARAMETERS_26 = FLT_PARAMETERS_26(),
    public var MdlRead: FLT_PARAMETERS_27 = FLT_PARAMETERS_27(),
    public var MdlReadComplete: FLT_PARAMETERS_28 = FLT_PARAMETERS_28(),
    public var PrepareMdlWrite: FLT_PARAMETERS_29 = FLT_PARAMETERS_29(),
    public var MdlWriteComplete: FLT_PARAMETERS_30 = FLT_PARAMETERS_30(),
    public var MountVolume: FLT_PARAMETERS_31 = FLT_PARAMETERS_31(),
    public var Others: FLT_PARAMETERS_32 = FLT_PARAMETERS_32(),
)

public data class FLT_PARAMETERS_22(public var EndingOffset: Long = 0L, public var ResourceToRelease: Long = 0L)

public data class FLT_PARAMETERS_21(
    public var SyncType: FS_FILTER_SECTION_SYNC_TYPE = 0,
    public var PageProtection: UInt = 0u,
    public var OutputInformation: Long = 0L,
    public var Flags: UInt = 0u,
    public var AllocationAttributes: UInt = 0u,
)

public data class FLT_PARAMETERS_2(
    public var SecurityContext: Long = 0L,
    public var Options: UInt = 0u,
    public var Reserved: UShort = 0u,
    public var ShareAccess: UShort = 0u,
    public var Parameters: Long = 0L,
)

public data class FLT_PARAMETERS_1(
    public var SecurityContext: Long = 0L,
    public var Options: UInt = 0u,
    public var Reserved: UShort = 0u,
    public var ShareAccess: UShort = 0u,
    public var Parameters: Long = 0L,
)

public data class FLT_PARAMETERS_0(
    public var SecurityContext: Long = 0L,
    public var Options: UInt = 0u,
    public var FileAttributes: UShort = 0u,
    public var ShareAccess: UShort = 0u,
    public var EaLength: UInt = 0u,
    public var EaBuffer: Long = 0L,
    public var AllocationSize: Long = 0L,
)

public data class FLT_PARAMETERS_13(
    public var Common: FLT_PARAMETERS_13_0 = FLT_PARAMETERS_13_0(),
    public var Neither: FLT_PARAMETERS_13_1 = FLT_PARAMETERS_13_1(),
    public var Buffered: FLT_PARAMETERS_13_2 = FLT_PARAMETERS_13_2(),
    public var Direct: FLT_PARAMETERS_13_3 = FLT_PARAMETERS_13_3(),
    public var FastIo: FLT_PARAMETERS_13_4 = FLT_PARAMETERS_13_4(),
)

public data class FLT_PARAMETERS_13_2(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var IoControlCode: UInt = 0u,
    public var SystemBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_13_0(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var IoControlCode: UInt = 0u,
)

public data class FLT_PARAMETERS_13_3(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var IoControlCode: UInt = 0u,
    public var InputSystemBuffer: Long = 0L,
    public var OutputBuffer: Long = 0L,
    public var OutputMdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_13_4(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var IoControlCode: UInt = 0u,
    public var InputBuffer: Long = 0L,
    public var OutputBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_13_1(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var IoControlCode: UInt = 0u,
    public var InputBuffer: Long = 0L,
    public var OutputBuffer: Long = 0L,
    public var OutputMdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_11(
    public var QueryDirectory: FLT_PARAMETERS_11_0 = FLT_PARAMETERS_11_0(),
    public var NotifyDirectory: FLT_PARAMETERS_11_1 = FLT_PARAMETERS_11_1(),
    public var NotifyDirectoryEx: FLT_PARAMETERS_11_2 = FLT_PARAMETERS_11_2(),
)

public data class FLT_PARAMETERS_11_2(
    public var Length: UInt = 0u,
    public var CompletionFilter: UInt = 0u,
    public var DirectoryNotifyInformationClass: System.SystemServices.DIRECTORY_NOTIFY_INFORMATION_CLASS = System.SystemServices.DIRECTORY_NOTIFY_INFORMATION_CLASS(),
    public var Spare2: UInt = 0u,
    public var DirectoryBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_11_1(
    public var Length: UInt = 0u,
    public var CompletionFilter: UInt = 0u,
    public var Spare1: UInt = 0u,
    public var Spare2: UInt = 0u,
    public var DirectoryBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_11_0(
    public var Length: UInt = 0u,
    public var FileName: Long = 0L,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
    public var FileIndex: UInt = 0u,
    public var DirectoryBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_25(
    public var FileOffset: Long = 0L,
    public var Length: UInt = 0u,
    public var LockKey: UInt = 0u,
    public var CheckForReadOperation: Boolean = false,
)

public data class FLT_PARAMETERS_12(
    public var VerifyVolume: FLT_PARAMETERS_12_0 = FLT_PARAMETERS_12_0(),
    public var Common: FLT_PARAMETERS_12_1 = FLT_PARAMETERS_12_1(),
    public var Neither: FLT_PARAMETERS_12_2 = FLT_PARAMETERS_12_2(),
    public var Buffered: FLT_PARAMETERS_12_3 = FLT_PARAMETERS_12_3(),
    public var Direct: FLT_PARAMETERS_12_4 = FLT_PARAMETERS_12_4(),
)

public data class FLT_PARAMETERS_12_3(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var FsControlCode: UInt = 0u,
    public var SystemBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_12_1(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var FsControlCode: UInt = 0u,
)

public data class FLT_PARAMETERS_12_4(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var FsControlCode: UInt = 0u,
    public var InputSystemBuffer: Long = 0L,
    public var OutputBuffer: Long = 0L,
    public var OutputMdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_12_2(
    public var OutputBufferLength: UInt = 0u,
    public var InputBufferLength: UInt = 0u,
    public var FsControlCode: UInt = 0u,
    public var InputBuffer: Long = 0L,
    public var OutputBuffer: Long = 0L,
    public var OutputMdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_12_0(public var Vpb: Long = 0L, public var DeviceObject: Long = 0L)

public data class FLT_PARAMETERS_14(
    public var Length: Long = 0L,
    public var Key: UInt = 0u,
    public var ByteOffset: Long = 0L,
    public var ProcessId: Foundation.PEPROCESS = Foundation.PEPROCESS(),
    public var FailImmediately: Boolean = false,
    public var ExclusiveLock: Boolean = false,
)

public data class FLT_PARAMETERS_28(public var MdlChain: Long = 0L)

public data class FLT_PARAMETERS_27(
    public var FileOffset: Long = 0L,
    public var Length: UInt = 0u,
    public var Key: UInt = 0u,
    public var MdlChain: Long = 0L,
)

public data class FLT_PARAMETERS_30(public var FileOffset: Long = 0L, public var MdlChain: Long = 0L)

public data class FLT_PARAMETERS_31(public var DeviceType: UInt = 0u)

public data class FLT_PARAMETERS_26(public var Irp: Long = 0L, public var NetworkInformation: Long = 0L)

public data class FLT_PARAMETERS_32(
    public var Argument1: Long = 0L,
    public var Argument2: Long = 0L,
    public var Argument3: Long = 0L,
    public var Argument4: Long = 0L,
    public var Argument5: Long = 0L,
    public var Argument6: Long = 0L,
)

public data class FLT_PARAMETERS_20(
    public var StartDevice: FLT_PARAMETERS_20_0 = FLT_PARAMETERS_20_0(),
    public var QueryDeviceRelations: FLT_PARAMETERS_20_1 = FLT_PARAMETERS_20_1(),
    public var QueryInterface: FLT_PARAMETERS_20_2 = FLT_PARAMETERS_20_2(),
    public var DeviceCapabilities: FLT_PARAMETERS_20_3 = FLT_PARAMETERS_20_3(),
    public var FilterResourceRequirements: FLT_PARAMETERS_20_4 = FLT_PARAMETERS_20_4(),
    public var ReadWriteConfig: FLT_PARAMETERS_20_5 = FLT_PARAMETERS_20_5(),
    public var SetLock: FLT_PARAMETERS_20_6 = FLT_PARAMETERS_20_6(),
    public var QueryId: FLT_PARAMETERS_20_7 = FLT_PARAMETERS_20_7(),
    public var QueryDeviceText: FLT_PARAMETERS_20_8 = FLT_PARAMETERS_20_8(),
    public var UsageNotification: FLT_PARAMETERS_20_9 = FLT_PARAMETERS_20_9(),
)

public data class FLT_PARAMETERS_20_3(public var Capabilities: Long = 0L)

public data class FLT_PARAMETERS_20_4(public var IoResourceRequirementList: Long = 0L)

public data class FLT_PARAMETERS_20_1(public var Type: System.SystemServices.DEVICE_RELATION_TYPE = System.SystemServices.DEVICE_RELATION_TYPE())

public data class FLT_PARAMETERS_20_8(public var DeviceTextType: System.SystemServices.DEVICE_TEXT_TYPE = System.SystemServices.DEVICE_TEXT_TYPE(), public var LocaleId: UInt = 0u)

public data class FLT_PARAMETERS_20_7(public var IdType: System.SystemServices.BUS_QUERY_ID_TYPE = System.SystemServices.BUS_QUERY_ID_TYPE())

public data class FLT_PARAMETERS_20_2(
    public var InterfaceType: Long = 0L,
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Interface: Long = 0L,
    public var InterfaceSpecificData: Long = 0L,
)

public data class FLT_PARAMETERS_20_5(
    public var WhichSpace: UInt = 0u,
    public var Buffer: Long = 0L,
    public var Offset: UInt = 0u,
    public var Length: UInt = 0u,
)

public data class FLT_PARAMETERS_20_6(public var Lock: Boolean = false)

public data class FLT_PARAMETERS_20_0(public var AllocatedResources: Long = 0L, public var AllocatedResourcesTranslated: Long = 0L)

public data class FLT_PARAMETERS_20_9(
    public var InPath: Boolean = false,
    public var Reserved: BooleanArray = BooleanArray(3),
    public var Type: System.SystemServices.DEVICE_USAGE_NOTIFICATION_TYPE = System.SystemServices.DEVICE_USAGE_NOTIFICATION_TYPE(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_PARAMETERS_20_9) return false
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

public data class FLT_PARAMETERS_29(
    public var FileOffset: Long = 0L,
    public var Length: UInt = 0u,
    public var Key: UInt = 0u,
    public var MdlChain: Long = 0L,
)

public data class FLT_PARAMETERS_7(
    public var Length: UInt = 0u,
    public var EaList: Long = 0L,
    public var EaListLength: UInt = 0u,
    public var EaIndex: UInt = 0u,
    public var EaBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_5(
    public var Length: UInt = 0u,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
    public var InfoBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_24(
    public var Irp: Long = 0L,
    public var FileInformation: Long = 0L,
    public var Length: Long = 0L,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
)

public data class FLT_PARAMETERS_18(
    public var Length: UInt = 0u,
    public var StartSid: Win32.Security.PSID = Win32.Security.PSID(),
    public var SidList: Long = 0L,
    public var SidListLength: UInt = 0u,
    public var QuotaBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_15(
    public var SecurityInformation: UInt = 0u,
    public var Length: UInt = 0u,
    public var SecurityBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_9(
    public var Length: UInt = 0u,
    public var FsInformationClass: FS_INFORMATION_CLASS = 0,
    public var VolumeBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_3(
    public var Length: UInt = 0u,
    public var Key: UInt = 0u,
    public var ByteOffset: Long = 0L,
    public var ReadBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_23(public var ResourceToRelease: Long = 0L)

public data class FLT_PARAMETERS_8(
    public var Length: UInt = 0u,
    public var EaBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_6(
    public var Length: UInt = 0u,
    public var FileInformationClass: FILE_INFORMATION_CLASS = 0,
    public var ParentOfTarget: Long = 0L,
    public var Anonymous: FLT_PARAMETERS_6_0 = FLT_PARAMETERS_6_0(),
    public var InfoBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_6_0(
    public var Anonymous: FLT_PARAMETERS_6_0_0 = FLT_PARAMETERS_6_0_0(),
    public var ClusterCount: UInt = 0u,
    public var DeleteHandle: Win32.Foundation.HANDLE = Win32.Foundation.HANDLE(),
)

public data class FLT_PARAMETERS_6_0_0(public var ReplaceIfExists: Boolean = false, public var AdvanceOnly: Boolean = false)

public data class FLT_PARAMETERS_19(
    public var Length: UInt = 0u,
    public var QuotaBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_PARAMETERS_16(public var SecurityInformation: UInt = 0u, public var SecurityDescriptor: Win32.Security.PSECURITY_DESCRIPTOR = Win32.Security.PSECURITY_DESCRIPTOR())

public data class FLT_PARAMETERS_10(
    public var Length: UInt = 0u,
    public var FsInformationClass: FS_INFORMATION_CLASS = 0,
    public var VolumeBuffer: Long = 0L,
)

public data class FLT_PARAMETERS_17(
    public var ProviderId: ULong = 0uL,
    public var DataPath: Long = 0L,
    public var BufferSize: UInt = 0u,
    public var Buffer: Long = 0L,
)

public data class FLT_PARAMETERS_4(
    public var Length: UInt = 0u,
    public var Key: UInt = 0u,
    public var ByteOffset: Long = 0L,
    public var WriteBuffer: Long = 0L,
    public var MdlAddress: Long = 0L,
)

public data class FLT_REGISTRATION(
    public var Size: UShort = 0u,
    public var Version: UShort = 0u,
    public var Flags: UInt = 0u,
    public var ContextRegistration: Long = 0L,
    public var OperationRegistration: Long = 0L,
    public var FilterUnloadCallback: PFLT_FILTER_UNLOAD_CALLBACK = null,
    public var InstanceSetupCallback: PFLT_INSTANCE_SETUP_CALLBACK = null,
    public var InstanceQueryTeardownCallback: PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACK = null,
    public var InstanceTeardownStartCallback: PFLT_INSTANCE_TEARDOWN_CALLBACK = null,
    public var InstanceTeardownCompleteCallback: PFLT_INSTANCE_TEARDOWN_CALLBACK = null,
    public var GenerateFileNameCallback: PFLT_GENERATE_FILE_NAME = null,
    public var NormalizeNameComponentCallback: PFLT_NORMALIZE_NAME_COMPONENT = null,
    public var NormalizeContextCleanupCallback: PFLT_NORMALIZE_CONTEXT_CLEANUP = null,
    public var TransactionNotificationCallback: PFLT_TRANSACTION_NOTIFICATION_CALLBACK = null,
    public var NormalizeNameComponentExCallback: PFLT_NORMALIZE_NAME_COMPONENT_EX = null,
    public var SectionNotificationCallback: PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACK = null,
)

public data class FLT_RELATED_CONTEXTS(
    public var VolumeContext: PFLT_CONTEXT = 0L,
    public var InstanceContext: PFLT_CONTEXT = 0L,
    public var FileContext: PFLT_CONTEXT = 0L,
    public var StreamContext: PFLT_CONTEXT = 0L,
    public var StreamHandleContext: PFLT_CONTEXT = 0L,
    public var TransactionContext: PFLT_CONTEXT = 0L,
)

public data class FLT_RELATED_CONTEXTS_EX(
    public var VolumeContext: PFLT_CONTEXT = 0L,
    public var InstanceContext: PFLT_CONTEXT = 0L,
    public var FileContext: PFLT_CONTEXT = 0L,
    public var StreamContext: PFLT_CONTEXT = 0L,
    public var StreamHandleContext: PFLT_CONTEXT = 0L,
    public var TransactionContext: PFLT_CONTEXT = 0L,
    public var SectionContext: PFLT_CONTEXT = 0L,
)

public data class FLT_RELATED_OBJECTS(
    public var Size: UShort = 0u,
    public var TransactionContext: UShort = 0u,
    public var Filter: PFLT_FILTER = 0L,
    public var Volume: PFLT_VOLUME = 0L,
    public var Instance: PFLT_INSTANCE = 0L,
    public var FileObject: Long = 0L,
    public var Transaction: Long = 0L,
)

public data class FLT_TAG_DATA_BUFFER(
    public var FileTag: UInt = 0u,
    public var TagDataLength: UShort = 0u,
    public var UnparsedNameLength: UShort = 0u,
    public var Anonymous: FLT_TAG_DATA_BUFFER_0 = FLT_TAG_DATA_BUFFER_0(),
)

public data class FLT_TAG_DATA_BUFFER_0(
    public var SymbolicLinkReparseBuffer: FLT_TAG_DATA_BUFFER_0_0 = FLT_TAG_DATA_BUFFER_0_0(),
    public var MountPointReparseBuffer: FLT_TAG_DATA_BUFFER_0_1 = FLT_TAG_DATA_BUFFER_0_1(),
    public var GenericReparseBuffer: FLT_TAG_DATA_BUFFER_0_2 = FLT_TAG_DATA_BUFFER_0_2(),
    public var GenericGUIDReparseBuffer: FLT_TAG_DATA_BUFFER_0_3 = FLT_TAG_DATA_BUFFER_0_3(),
)

public data class FLT_TAG_DATA_BUFFER_0_3(public var TagGuid: GUID = GUID(), public var DataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_TAG_DATA_BUFFER_0_3) return false
        if (this.TagGuid != other.TagGuid) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TagGuid.hashCode()
        result = 31 * result + this.DataBuffer.contentHashCode()
        return result
    }
}

public data class FLT_TAG_DATA_BUFFER_0_2(public var DataBuffer: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_TAG_DATA_BUFFER_0_2) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DataBuffer.contentHashCode()
    }
}

public data class FLT_TAG_DATA_BUFFER_0_1(
    public var SubstituteNameOffset: UShort = 0u,
    public var SubstituteNameLength: UShort = 0u,
    public var PrintNameOffset: UShort = 0u,
    public var PrintNameLength: UShort = 0u,
    public var PathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_TAG_DATA_BUFFER_0_1) return false
        if (this.SubstituteNameOffset != other.SubstituteNameOffset) return false
        if (this.SubstituteNameLength != other.SubstituteNameLength) return false
        if (this.PrintNameOffset != other.PrintNameOffset) return false
        if (this.PrintNameLength != other.PrintNameLength) return false
        if (!this.PathBuffer.contentEquals(other.PathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SubstituteNameOffset.hashCode()
        result = 31 * result + this.SubstituteNameLength.hashCode()
        result = 31 * result + this.PrintNameOffset.hashCode()
        result = 31 * result + this.PrintNameLength.hashCode()
        result = 31 * result + this.PathBuffer.contentHashCode()
        return result
    }
}

public data class FLT_TAG_DATA_BUFFER_0_0(
    public var SubstituteNameOffset: UShort = 0u,
    public var SubstituteNameLength: UShort = 0u,
    public var PrintNameOffset: UShort = 0u,
    public var PrintNameLength: UShort = 0u,
    public var Flags: UInt = 0u,
    public var PathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLT_TAG_DATA_BUFFER_0_0) return false
        if (this.SubstituteNameOffset != other.SubstituteNameOffset) return false
        if (this.SubstituteNameLength != other.SubstituteNameLength) return false
        if (this.PrintNameOffset != other.PrintNameOffset) return false
        if (this.PrintNameLength != other.PrintNameLength) return false
        if (this.Flags != other.Flags) return false
        if (!this.PathBuffer.contentEquals(other.PathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SubstituteNameOffset.hashCode()
        result = 31 * result + this.SubstituteNameLength.hashCode()
        result = 31 * result + this.PrintNameOffset.hashCode()
        result = 31 * result + this.PrintNameLength.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.PathBuffer.contentHashCode()
        return result
    }
}

public data class FLT_VOLUME_PROPERTIES(
    public var DeviceType: UInt = 0u,
    public var DeviceCharacteristics: UInt = 0u,
    public var DeviceObjectFlags: UInt = 0u,
    public var AlignmentRequirement: UInt = 0u,
    public var SectorSize: UShort = 0u,
    public var Flags: UShort = 0u,
    public var FileSystemDriverName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var FileSystemDeviceName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var RealDeviceName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
)
