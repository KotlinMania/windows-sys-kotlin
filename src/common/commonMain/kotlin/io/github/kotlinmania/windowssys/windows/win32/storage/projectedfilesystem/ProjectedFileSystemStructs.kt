@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr

public data class PrjCallbacks(
    public var startDirectoryEnumerationCallback: PrjStartDirectoryEnumerationCb = null,
    public var endDirectoryEnumerationCallback: PrjEndDirectoryEnumerationCb = null,
    public var getDirectoryEnumerationCallback: PrjGetDirectoryEnumerationCb = null,
    public var getPlaceholderInfoCallback: PrjGetPlaceholderInfoCb = null,
    public var getFileDataCallback: PrjGetFileDataCb = null,
    public var queryFileNameCallback: PrjQueryFileNameCb = null,
    public var notificationCallback: PrjNotificationCb = null,
    public var cancelCommandCallback: PrjCancelCommandCb = null,
)

public data class PrjCallbackData(
    public var size: UInt = 0u,
    public var flags: PrjCallbackDataFlags = 0,
    public var namespaceVirtualizationContext: PrjNamespaceVirtualizationContext = null,
    public var commandId: Int = 0,
    public var fileId: Guid = Guid(),
    public var dataStreamId: Guid = Guid(),
    public var filePathName: Pcwstr = null,
    public var versionInfo: PrjPlaceholderVersionInfo? = null,
    public var triggeringProcessId: UInt = 0u,
    public var triggeringProcessImageFileName: Pcwstr = null,
    public var instanceContext: COpaquePointer? = null,
)

public data class PrjCompleteCommandExtendedParameters(
    public var commandType: PrjCompleteCommandType = 0,
    public var anonymous: PrjCompleteCommandExtendedParameters0 = PrjCompleteCommandExtendedParameters0(),
)

public data class PrjCompleteCommandExtendedParameters0(
    public var notification: PrjCompleteCommandExtendedParameters00 = PrjCompleteCommandExtendedParameters00(),
    public var enumeration: PrjCompleteCommandExtendedParameters01 = PrjCompleteCommandExtendedParameters01(),
)

public data class PrjCompleteCommandExtendedParameters01(
    public var dirEntryBufferHandle: PrjDirEntryBufferHandle = null,
)

public data class PrjCompleteCommandExtendedParameters00(
    public var notificationMask: PrjNotifyTypes = 0u,
)

public data class PrjExtendedInfo(
    public var infoType: PrjExtInfoType = 0,
    public var nextInfoOffset: UInt = 0u,
    public var anonymous: PrjExtendedInfo0 = PrjExtendedInfo0(),
)

public data class PrjExtendedInfo0(
    public var symlink: PrjExtendedInfo00 = PrjExtendedInfo00(),
)

public data class PrjExtendedInfo00(
    public var targetName: Pcwstr = null,
)

public data class PrjFileBasicInfo(
    public var isDirectory: Boolean = false,
    public var fileSize: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
)

public data class PrjNotificationMapping(
    public var notificationBitMask: PrjNotifyTypes = 0u,
    public var notificationRoot: Pcwstr = null,
)

public data class PrjNotificationParameters(
    public var postCreate: PrjNotificationParameters0 = PrjNotificationParameters0(),
    public var fileRenamed: PrjNotificationParameters1 = PrjNotificationParameters1(),
    public var fileDeletedOnHandleClose: PrjNotificationParameters2 = PrjNotificationParameters2(),
)

public data class PrjNotificationParameters2(
    public var isFileModified: Boolean = false,
)

public data class PrjNotificationParameters1(
    public var notificationMask: PrjNotifyTypes = 0u,
)

public data class PrjNotificationParameters0(
    public var notificationMask: PrjNotifyTypes = 0u,
)

public data class PrjPlaceholderInfo(
    public var fileBasicInfo: PrjFileBasicInfo = PrjFileBasicInfo(),
    public var eaInformation: PrjPlaceholderInfo0 = PrjPlaceholderInfo0(),
    public var securityInformation: PrjPlaceholderInfo1 = PrjPlaceholderInfo1(),
    public var streamsInformation: PrjPlaceholderInfo2 = PrjPlaceholderInfo2(),
    public var versionInfo: PrjPlaceholderVersionInfo = PrjPlaceholderVersionInfo(),
    public var variableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjPlaceholderInfo) return false
        if (this.fileBasicInfo != other.fileBasicInfo) return false
        if (this.eaInformation != other.eaInformation) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.streamsInformation != other.streamsInformation) return false
        if (this.versionInfo != other.versionInfo) return false
        if (!this.variableData.contentEquals(other.variableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileBasicInfo.hashCode()
        result = 31 * result + this.eaInformation.hashCode()
        result = 31 * result + this.securityInformation.hashCode()
        result = 31 * result + this.streamsInformation.hashCode()
        result = 31 * result + this.versionInfo.hashCode()
        result = 31 * result + this.variableData.contentHashCode()
        return result
    }
}

public data class PrjPlaceholderInfo0(
    public var eaBufferSize: UInt = 0u,
    public var offsetToFirstEa: UInt = 0u,
)

public data class PrjPlaceholderInfo1(
    public var securityBufferSize: UInt = 0u,
    public var offsetToSecurityDescriptor: UInt = 0u,
)

public data class PrjPlaceholderInfo2(
    public var streamsInfoBufferSize: UInt = 0u,
    public var offsetToFirstStreamInfo: UInt = 0u,
)

public data class PrjPlaceholderVersionInfo(
    public var providerID: UByteArray = UByteArray(128),
    public var contentID: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjPlaceholderVersionInfo) return false
        if (!this.providerID.contentEquals(other.providerID)) return false
        if (!this.contentID.contentEquals(other.contentID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerID.contentHashCode()
        result = 31 * result + this.contentID.contentHashCode()
        return result
    }
}

public data class PrjStartvirtualizingOptions(
    public var flags: PrjStartvirtualizingFlags = 0,
    public var poolThreadCount: UInt = 0u,
    public var concurrentThreadCount: UInt = 0u,
    public var notificationMappings: PrjNotificationMapping? = null,
    public var notificationMappingsCount: UInt = 0u,
)

public data class PrjVirtualizationInstanceInfo(
    public var instanceID: Guid = Guid(),
    public var writeAlignment: UInt = 0u,
)
