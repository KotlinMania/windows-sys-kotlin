@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR

public data class PRJ_CALLBACKS(
    public var StartDirectoryEnumerationCallback: PRJ_START_DIRECTORY_ENUMERATION_CB = null,
    public var EndDirectoryEnumerationCallback: PRJ_END_DIRECTORY_ENUMERATION_CB = null,
    public var GetDirectoryEnumerationCallback: PRJ_GET_DIRECTORY_ENUMERATION_CB = null,
    public var GetPlaceholderInfoCallback: PRJ_GET_PLACEHOLDER_INFO_CB = null,
    public var GetFileDataCallback: PRJ_GET_FILE_DATA_CB = null,
    public var QueryFileNameCallback: PRJ_QUERY_FILE_NAME_CB = null,
    public var NotificationCallback: PRJ_NOTIFICATION_CB = null,
    public var CancelCommandCallback: PRJ_CANCEL_COMMAND_CB = null,
)

public data class PRJ_CALLBACK_DATA(
    public var Size: UInt = 0u,
    public var Flags: PRJ_CALLBACK_DATA_FLAGS = 0,
    public var NamespaceVirtualizationContext: PRJ_NAMESPACE_VIRTUALIZATION_CONTEXT = 0L,
    public var CommandId: Int = 0,
    public var FileId: GUID = GUID(),
    public var DataStreamId: GUID = GUID(),
    public var FilePathName: PCWSTR = 0L,
    public var VersionInfo: Long = 0L,
    public var TriggeringProcessId: UInt = 0u,
    public var TriggeringProcessImageFileName: PCWSTR = 0L,
    public var InstanceContext: Long = 0L,
)

public data class PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS(public var CommandType: PRJ_COMPLETE_COMMAND_TYPE = 0, public var Anonymous: PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0 = PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0())

public data class PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0(public var Notification: PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_0 = PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_0(), public var Enumeration: PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1 = PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1())

public data class PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_1(public var DirEntryBufferHandle: PRJ_DIR_ENTRY_BUFFER_HANDLE = 0L)

public data class PRJ_COMPLETE_COMMAND_EXTENDED_PARAMETERS_0_0(public var NotificationMask: PRJ_NOTIFY_TYPES = 0u)

public data class PRJ_EXTENDED_INFO(
    public var InfoType: PRJ_EXT_INFO_TYPE = 0,
    public var NextInfoOffset: UInt = 0u,
    public var Anonymous: PRJ_EXTENDED_INFO_0 = PRJ_EXTENDED_INFO_0(),
)

public data class PRJ_EXTENDED_INFO_0(public var Symlink: PRJ_EXTENDED_INFO_0_0 = PRJ_EXTENDED_INFO_0_0())

public data class PRJ_EXTENDED_INFO_0_0(public var TargetName: PCWSTR = 0L)

public data class PRJ_FILE_BASIC_INFO(
    public var IsDirectory: Boolean = false,
    public var FileSize: Long = 0L,
    public var CreationTime: Long = 0L,
    public var LastAccessTime: Long = 0L,
    public var LastWriteTime: Long = 0L,
    public var ChangeTime: Long = 0L,
    public var FileAttributes: UInt = 0u,
)

public data class PRJ_NOTIFICATION_MAPPING(public var NotificationBitMask: PRJ_NOTIFY_TYPES = 0u, public var NotificationRoot: PCWSTR = 0L)

public data class PRJ_NOTIFICATION_PARAMETERS(
    public var PostCreate: PRJ_NOTIFICATION_PARAMETERS_0 = PRJ_NOTIFICATION_PARAMETERS_0(),
    public var FileRenamed: PRJ_NOTIFICATION_PARAMETERS_1 = PRJ_NOTIFICATION_PARAMETERS_1(),
    public var FileDeletedOnHandleClose: PRJ_NOTIFICATION_PARAMETERS_2 = PRJ_NOTIFICATION_PARAMETERS_2(),
)

public data class PRJ_NOTIFICATION_PARAMETERS_2(public var IsFileModified: Boolean = false)

public data class PRJ_NOTIFICATION_PARAMETERS_1(public var NotificationMask: PRJ_NOTIFY_TYPES = 0u)

public data class PRJ_NOTIFICATION_PARAMETERS_0(public var NotificationMask: PRJ_NOTIFY_TYPES = 0u)

public data class PRJ_PLACEHOLDER_INFO(
    public var FileBasicInfo: PRJ_FILE_BASIC_INFO = PRJ_FILE_BASIC_INFO(),
    public var EaInformation: PRJ_PLACEHOLDER_INFO_0 = PRJ_PLACEHOLDER_INFO_0(),
    public var SecurityInformation: PRJ_PLACEHOLDER_INFO_1 = PRJ_PLACEHOLDER_INFO_1(),
    public var StreamsInformation: PRJ_PLACEHOLDER_INFO_2 = PRJ_PLACEHOLDER_INFO_2(),
    public var VersionInfo: PRJ_PLACEHOLDER_VERSION_INFO = PRJ_PLACEHOLDER_VERSION_INFO(),
    public var VariableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PRJ_PLACEHOLDER_INFO) return false
        if (this.FileBasicInfo != other.FileBasicInfo) return false
        if (this.EaInformation != other.EaInformation) return false
        if (this.SecurityInformation != other.SecurityInformation) return false
        if (this.StreamsInformation != other.StreamsInformation) return false
        if (this.VersionInfo != other.VersionInfo) return false
        if (!this.VariableData.contentEquals(other.VariableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.FileBasicInfo.hashCode()
        result = 31 * result + this.EaInformation.hashCode()
        result = 31 * result + this.SecurityInformation.hashCode()
        result = 31 * result + this.StreamsInformation.hashCode()
        result = 31 * result + this.VersionInfo.hashCode()
        result = 31 * result + this.VariableData.contentHashCode()
        return result
    }
}

public data class PRJ_PLACEHOLDER_INFO_0(public var EaBufferSize: UInt = 0u, public var OffsetToFirstEa: UInt = 0u)

public data class PRJ_PLACEHOLDER_INFO_1(public var SecurityBufferSize: UInt = 0u, public var OffsetToSecurityDescriptor: UInt = 0u)

public data class PRJ_PLACEHOLDER_INFO_2(public var StreamsInfoBufferSize: UInt = 0u, public var OffsetToFirstStreamInfo: UInt = 0u)

public data class PRJ_PLACEHOLDER_VERSION_INFO(public var ProviderID: UByteArray = UByteArray(128), public var ContentID: UByteArray = UByteArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PRJ_PLACEHOLDER_VERSION_INFO) return false
        if (!this.ProviderID.contentEquals(other.ProviderID)) return false
        if (!this.ContentID.contentEquals(other.ContentID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProviderID.contentHashCode()
        result = 31 * result + this.ContentID.contentHashCode()
        return result
    }
}

public data class PRJ_STARTVIRTUALIZING_OPTIONS(
    public var Flags: PRJ_STARTVIRTUALIZING_FLAGS = 0,
    public var PoolThreadCount: UInt = 0u,
    public var ConcurrentThreadCount: UInt = 0u,
    public var NotificationMappings: Long = 0L,
    public var NotificationMappingsCount: UInt = 0u,
)

public data class PRJ_VIRTUALIZATION_INSTANCE_INFO(public var InstanceID: GUID = GUID(), public var WriteAlignment: UInt = 0u)
