@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileBasicInfo
import io.github.kotlinmania.windowssys.windows.win32.system.correlationvector.CorrelationVector

public class CfCallbackInfo(
    public var structSize: UInt = 0u,
    public var connectionKey: CfConnectionKey = 0L,
    public var callbackContext: COpaquePointer? = null,
    public var volumeGuidName: Pcwstr = null,
    public var volumeDosName: Pcwstr = null,
    public var volumeSerialNumber: UInt = 0u,
    public var syncRootFileId: Long = 0L,
    public var syncRootIdentity: COpaquePointer? = null,
    public var syncRootIdentityLength: UInt = 0u,
    public var fileId: Long = 0L,
    public var fileSize: Long = 0L,
    public var fileIdentity: COpaquePointer? = null,
    public var fileIdentityLength: UInt = 0u,
    public var normalizedPath: Pcwstr = null,
    public var transferKey: Long = 0L,
    public var priorityHint: UByte = 0u,
    public var correlationVector: CorrelationVector? = null,
    public var processInfo: CfProcessInfo? = null,
    public var requestKey: Long = 0L,
)

public data class CfCallbackParameters(
    public var paramSize: UInt = 0u,
    public var anonymous: CfCallbackParameters0 = CfCallbackParameters0(),
)

public data class CfCallbackParameters0(
    public var cancel: CfCallbackParameters00 = CfCallbackParameters00(),
    public var fetchData: CfCallbackParameters01 = CfCallbackParameters01(),
    public var validateData: CfCallbackParameters02 = CfCallbackParameters02(),
    public var fetchPlaceholders: CfCallbackParameters03 = CfCallbackParameters03(),
    public var openCompletion: CfCallbackParameters04 = CfCallbackParameters04(),
    public var closeCompletion: CfCallbackParameters05 = CfCallbackParameters05(),
    public var dehydrate: CfCallbackParameters06 = CfCallbackParameters06(),
    public var dehydrateCompletion: CfCallbackParameters07 = CfCallbackParameters07(),
    public var delete: CfCallbackParameters08 = CfCallbackParameters08(),
    public var deleteCompletion: CfCallbackParameters09 = CfCallbackParameters09(),
    public var rename: CfCallbackParameters010 = CfCallbackParameters010(),
    public var renameCompletion: CfCallbackParameters011 = CfCallbackParameters011(),
)

public data class CfCallbackParameters00(
    public var flags: CfCallbackCancelFlags = 0,
    public var anonymous: CfCallbackParameters000 = CfCallbackParameters000(),
)

public data class CfCallbackParameters000(
    public var fetchData: CfCallbackParameters0000 = CfCallbackParameters0000(),
)

public data class CfCallbackParameters0000(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
)

public data class CfCallbackParameters05(
    public var flags: CfCallbackCloseCompletionFlags = 0,
)

public data class CfCallbackParameters07(
    public var flags: CfCallbackDehydrateCompletionFlags = 0,
    public var reason: CfCallbackDehydrationReason = 0,
)

public data class CfCallbackParameters06(
    public var flags: CfCallbackDehydrateFlags = 0,
    public var reason: CfCallbackDehydrationReason = 0,
)

public data class CfCallbackParameters09(
    public var flags: CfCallbackDeleteCompletionFlags = 0,
)

public data class CfCallbackParameters08(
    public var flags: CfCallbackDeleteFlags = 0,
)

public data class CfCallbackParameters01(
    public var flags: CfCallbackFetchDataFlags = 0,
    public var requiredFileOffset: Long = 0L,
    public var requiredLength: Long = 0L,
    public var optionalFileOffset: Long = 0L,
    public var optionalLength: Long = 0L,
    public var lastDehydrationTime: Long = 0L,
    public var lastDehydrationReason: CfCallbackDehydrationReason = 0,
)

public data class CfCallbackParameters03(
    public var flags: CfCallbackFetchPlaceholdersFlags = 0,
    public var pattern: Pcwstr = null,
)

public data class CfCallbackParameters04(
    public var flags: CfCallbackOpenCompletionFlags = 0,
)

public data class CfCallbackParameters011(
    public var flags: CfCallbackRenameCompletionFlags = 0,
    public var sourcePath: Pcwstr = null,
)

public data class CfCallbackParameters010(
    public var flags: CfCallbackRenameFlags = 0,
    public var targetPath: Pcwstr = null,
)

public data class CfCallbackParameters02(
    public var flags: CfCallbackValidateDataFlags = 0,
    public var requiredFileOffset: Long = 0L,
    public var requiredLength: Long = 0L,
)

public data class CfCallbackRegistration(
    public var type: CfCallbackType = 0,
    public var callback: CfCallback = null,
)

public data class CfFileRange(
    public var startingOffset: Long = 0L,
    public var length: Long = 0L,
)

public data class CfFsMetadata(
    public var basicInfo: FileBasicInfo = FileBasicInfo(),
    public var fileSize: Long = 0L,
)

public data class CfHydrationPolicy(
    public var primary: CfHydrationPolicyPrimary = 0u,
    public var modifier: CfHydrationPolicyModifier = 0u,
)

public data class CfOperationInfo(
    public var structSize: UInt = 0u,
    public var type: CfOperationType = 0,
    public var connectionKey: CfConnectionKey = 0L,
    public var transferKey: Long = 0L,
    public var correlationVector: CorrelationVector? = null,
    public var syncStatus: CfSyncStatus? = null,
    public var requestKey: Long = 0L,
)

public data class CfOperationParameters(
    public var paramSize: UInt = 0u,
    public var anonymous: CfOperationParameters0 = CfOperationParameters0(),
)

public data class CfOperationParameters0(
    public var transferData: CfOperationParameters00 = CfOperationParameters00(),
    public var retrieveData: CfOperationParameters01 = CfOperationParameters01(),
    public var ackData: CfOperationParameters02 = CfOperationParameters02(),
    public var restartHydration: CfOperationParameters03 = CfOperationParameters03(),
    public var transferPlaceholders: CfOperationParameters04 = CfOperationParameters04(),
    public var ackDehydrate: CfOperationParameters05 = CfOperationParameters05(),
    public var ackRename: CfOperationParameters06 = CfOperationParameters06(),
    public var ackDelete: CfOperationParameters07 = CfOperationParameters07(),
)

public data class CfOperationParameters02(
    public var flags: CfOperationAckDataFlags = 0,
    public var completionStatus: Ntstatus = 0,
    public var offset: Long = 0L,
    public var length: Long = 0L,
)

public data class CfOperationParameters05(
    public var flags: CfOperationAckDehydrateFlags = 0,
    public var completionStatus: Ntstatus = 0,
    public var fileIdentity: COpaquePointer? = null,
    public var fileIdentityLength: UInt = 0u,
)

public data class CfOperationParameters07(
    public var flags: CfOperationAckDeleteFlags = 0,
    public var completionStatus: Ntstatus = 0,
)

public data class CfOperationParameters06(
    public var flags: CfOperationAckRenameFlags = 0,
    public var completionStatus: Ntstatus = 0,
)

public data class CfOperationParameters03(
    public var flags: CfOperationRestartHydrationFlags = 0,
    public var fsMetadata: CfFsMetadata? = null,
    public var fileIdentity: COpaquePointer? = null,
    public var fileIdentityLength: UInt = 0u,
)

public data class CfOperationParameters01(
    public var flags: CfOperationRetrieveDataFlags = 0,
    public var buffer: COpaquePointer? = null,
    public var offset: Long = 0L,
    public var length: Long = 0L,
    public var returnedLength: Long = 0L,
)

public data class CfOperationParameters00(
    public var flags: CfOperationTransferDataFlags = 0,
    public var completionStatus: Ntstatus = 0,
    public var buffer: COpaquePointer? = null,
    public var offset: Long = 0L,
    public var length: Long = 0L,
)

public data class CfOperationParameters04(
    public var flags: CfOperationTransferPlaceholdersFlags = 0,
    public var completionStatus: Ntstatus = 0,
    public var placeholderTotalCount: Long = 0L,
    public var placeholderArray: CfPlaceholderCreateInfo? = null,
    public var placeholderCount: UInt = 0u,
    public var entriesProcessed: UInt = 0u,
)

public data class CfPlaceholderBasicInfo(
    public var pinState: CfPinState = 0,
    public var inSyncState: CfInSyncState = 0,
    public var fileId: Long = 0L,
    public var syncRootFileId: Long = 0L,
    public var fileIdentityLength: UInt = 0u,
    public var fileIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfPlaceholderBasicInfo) return false
        if (this.pinState != other.pinState) return false
        if (this.inSyncState != other.inSyncState) return false
        if (this.fileId != other.fileId) return false
        if (this.syncRootFileId != other.syncRootFileId) return false
        if (this.fileIdentityLength != other.fileIdentityLength) return false
        if (!this.fileIdentity.contentEquals(other.fileIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pinState.hashCode()
        result = 31 * result + this.inSyncState.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.syncRootFileId.hashCode()
        result = 31 * result + this.fileIdentityLength.hashCode()
        result = 31 * result + this.fileIdentity.contentHashCode()
        return result
    }
}

public data class CfPlaceholderCreateInfo(
    public var relativeFileName: Pcwstr = null,
    public var fsMetadata: CfFsMetadata = CfFsMetadata(),
    public var fileIdentity: COpaquePointer? = null,
    public var fileIdentityLength: UInt = 0u,
    public var flags: CfPlaceholderCreateFlags = 0,
    public var result: Hresult = 0,
    public var createUsn: Long = 0L,
)

public data class CfPlaceholderStandardInfo(
    public var onDiskDataSize: Long = 0L,
    public var validatedDataSize: Long = 0L,
    public var modifiedDataSize: Long = 0L,
    public var propertiesSize: Long = 0L,
    public var pinState: CfPinState = 0,
    public var inSyncState: CfInSyncState = 0,
    public var fileId: Long = 0L,
    public var syncRootFileId: Long = 0L,
    public var fileIdentityLength: UInt = 0u,
    public var fileIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfPlaceholderStandardInfo) return false
        if (this.onDiskDataSize != other.onDiskDataSize) return false
        if (this.validatedDataSize != other.validatedDataSize) return false
        if (this.modifiedDataSize != other.modifiedDataSize) return false
        if (this.propertiesSize != other.propertiesSize) return false
        if (this.pinState != other.pinState) return false
        if (this.inSyncState != other.inSyncState) return false
        if (this.fileId != other.fileId) return false
        if (this.syncRootFileId != other.syncRootFileId) return false
        if (this.fileIdentityLength != other.fileIdentityLength) return false
        if (!this.fileIdentity.contentEquals(other.fileIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.onDiskDataSize.hashCode()
        result = 31 * result + this.validatedDataSize.hashCode()
        result = 31 * result + this.modifiedDataSize.hashCode()
        result = 31 * result + this.propertiesSize.hashCode()
        result = 31 * result + this.pinState.hashCode()
        result = 31 * result + this.inSyncState.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.syncRootFileId.hashCode()
        result = 31 * result + this.fileIdentityLength.hashCode()
        result = 31 * result + this.fileIdentity.contentHashCode()
        return result
    }
}

public data class CfPlatformInfo(
    public var buildNumber: UInt = 0u,
    public var revisionNumber: UInt = 0u,
    public var integrationNumber: UInt = 0u,
)

public data class CfPopulationPolicy(
    public var primary: CfPopulationPolicyPrimary = 0u,
    public var modifier: CfPopulationPolicyModifier = 0u,
)

public data class CfProcessInfo(
    public var structSize: UInt = 0u,
    public var processId: UInt = 0u,
    public var imagePath: Pcwstr = null,
    public var packageName: Pcwstr = null,
    public var applicationId: Pcwstr = null,
    public var commandLine: Pcwstr = null,
    public var sessionId: UInt = 0u,
)

public data class CfSyncPolicies(
    public var structSize: UInt = 0u,
    public var hydration: CfHydrationPolicy = CfHydrationPolicy(),
    public var population: CfPopulationPolicy = CfPopulationPolicy(),
    public var inSync: CfInsyncPolicy = 0u,
    public var hardLink: CfHardlinkPolicy = 0,
    public var placeholderManagement: CfPlaceholderManagementPolicy = 0,
)

public data class CfSyncRegistration(
    public var structSize: UInt = 0u,
    public var providerName: Pcwstr = null,
    public var providerVersion: Pcwstr = null,
    public var syncRootIdentity: COpaquePointer? = null,
    public var syncRootIdentityLength: UInt = 0u,
    public var fileIdentity: COpaquePointer? = null,
    public var fileIdentityLength: UInt = 0u,
    public var providerId: Guid = Guid(),
)

public data class CfSyncRootBasicInfo(
    public var syncRootFileId: Long = 0L,
)

public data class CfSyncRootProviderInfo(
    public var providerStatus: CfSyncProviderStatus = 0u,
    public var providerName: UShortArray = UShortArray(256),
    public var providerVersion: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfSyncRootProviderInfo) return false
        if (this.providerStatus != other.providerStatus) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        if (!this.providerVersion.contentEquals(other.providerVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerStatus.hashCode()
        result = 31 * result + this.providerName.contentHashCode()
        result = 31 * result + this.providerVersion.contentHashCode()
        return result
    }
}

public data class CfSyncRootStandardInfo(
    public var syncRootFileId: Long = 0L,
    public var hydrationPolicy: CfHydrationPolicy = CfHydrationPolicy(),
    public var populationPolicy: CfPopulationPolicy = CfPopulationPolicy(),
    public var inSyncPolicy: CfInsyncPolicy = 0u,
    public var hardLinkPolicy: CfHardlinkPolicy = 0,
    public var providerStatus: CfSyncProviderStatus = 0u,
    public var providerName: UShortArray = UShortArray(256),
    public var providerVersion: UShortArray = UShortArray(256),
    public var syncRootIdentityLength: UInt = 0u,
    public var syncRootIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfSyncRootStandardInfo) return false
        if (this.syncRootFileId != other.syncRootFileId) return false
        if (this.hydrationPolicy != other.hydrationPolicy) return false
        if (this.populationPolicy != other.populationPolicy) return false
        if (this.inSyncPolicy != other.inSyncPolicy) return false
        if (this.hardLinkPolicy != other.hardLinkPolicy) return false
        if (this.providerStatus != other.providerStatus) return false
        if (!this.providerName.contentEquals(other.providerName)) return false
        if (!this.providerVersion.contentEquals(other.providerVersion)) return false
        if (this.syncRootIdentityLength != other.syncRootIdentityLength) return false
        if (!this.syncRootIdentity.contentEquals(other.syncRootIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.syncRootFileId.hashCode()
        result = 31 * result + this.hydrationPolicy.hashCode()
        result = 31 * result + this.populationPolicy.hashCode()
        result = 31 * result + this.inSyncPolicy.hashCode()
        result = 31 * result + this.hardLinkPolicy.hashCode()
        result = 31 * result + this.providerStatus.hashCode()
        result = 31 * result + this.providerName.contentHashCode()
        result = 31 * result + this.providerVersion.contentHashCode()
        result = 31 * result + this.syncRootIdentityLength.hashCode()
        result = 31 * result + this.syncRootIdentity.contentHashCode()
        return result
    }
}

public data class CfSyncStatus(
    public var structSize: UInt = 0u,
    public var code: UInt = 0u,
    public var descriptionOffset: UInt = 0u,
    public var descriptionLength: UInt = 0u,
    public var deviceIdOffset: UInt = 0u,
    public var deviceIdLength: UInt = 0u,
)
