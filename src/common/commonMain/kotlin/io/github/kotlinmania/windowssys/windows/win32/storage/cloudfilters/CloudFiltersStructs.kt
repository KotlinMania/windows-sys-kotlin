@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public class CF_CALLBACK_INFO(
    public var StructSize: UInt = 0u,
    public var ConnectionKey: CF_CONNECTION_KEY = 0L,
    public var CallbackContext: Long = 0L,
    public var VolumeGuidName: PCWSTR = 0L,
    public var VolumeDosName: PCWSTR = 0L,
    public var VolumeSerialNumber: UInt = 0u,
    public var SyncRootFileId: Long = 0L,
    public var SyncRootIdentity: Long = 0L,
    public var SyncRootIdentityLength: UInt = 0u,
    public var FileId: Long = 0L,
    public var FileSize: Long = 0L,
    public var FileIdentity: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
    public var NormalizedPath: PCWSTR = 0L,
    public var TransferKey: Long = 0L,
    public var PriorityHint: UByte = 0u,
    public var CorrelationVector: Long = 0L,
    public var ProcessInfo: Long = 0L,
    public var RequestKey: Long = 0L,
)

public data class CF_CALLBACK_PARAMETERS(public var ParamSize: UInt = 0u, public var Anonymous: CF_CALLBACK_PARAMETERS_0 = CF_CALLBACK_PARAMETERS_0())

public data class CF_CALLBACK_PARAMETERS_0(
    public var Cancel: CF_CALLBACK_PARAMETERS_0_0 = CF_CALLBACK_PARAMETERS_0_0(),
    public var FetchData: CF_CALLBACK_PARAMETERS_0_1 = CF_CALLBACK_PARAMETERS_0_1(),
    public var ValidateData: CF_CALLBACK_PARAMETERS_0_2 = CF_CALLBACK_PARAMETERS_0_2(),
    public var FetchPlaceholders: CF_CALLBACK_PARAMETERS_0_3 = CF_CALLBACK_PARAMETERS_0_3(),
    public var OpenCompletion: CF_CALLBACK_PARAMETERS_0_4 = CF_CALLBACK_PARAMETERS_0_4(),
    public var CloseCompletion: CF_CALLBACK_PARAMETERS_0_5 = CF_CALLBACK_PARAMETERS_0_5(),
    public var Dehydrate: CF_CALLBACK_PARAMETERS_0_6 = CF_CALLBACK_PARAMETERS_0_6(),
    public var DehydrateCompletion: CF_CALLBACK_PARAMETERS_0_7 = CF_CALLBACK_PARAMETERS_0_7(),
    public var Delete: CF_CALLBACK_PARAMETERS_0_8 = CF_CALLBACK_PARAMETERS_0_8(),
    public var DeleteCompletion: CF_CALLBACK_PARAMETERS_0_9 = CF_CALLBACK_PARAMETERS_0_9(),
    public var Rename: CF_CALLBACK_PARAMETERS_0_10 = CF_CALLBACK_PARAMETERS_0_10(),
    public var RenameCompletion: CF_CALLBACK_PARAMETERS_0_11 = CF_CALLBACK_PARAMETERS_0_11(),
)

public data class CF_CALLBACK_PARAMETERS_0_0(public var Flags: CF_CALLBACK_CANCEL_FLAGS = 0, public var Anonymous: CF_CALLBACK_PARAMETERS_0_0_0 = CF_CALLBACK_PARAMETERS_0_0_0())

public data class CF_CALLBACK_PARAMETERS_0_0_0(public var FetchData: CF_CALLBACK_PARAMETERS_0_0_0_0 = CF_CALLBACK_PARAMETERS_0_0_0_0())

public data class CF_CALLBACK_PARAMETERS_0_0_0_0(public var FileOffset: Long = 0L, public var Length: Long = 0L)

public data class CF_CALLBACK_PARAMETERS_0_5(public var Flags: CF_CALLBACK_CLOSE_COMPLETION_FLAGS = 0)

public data class CF_CALLBACK_PARAMETERS_0_7(public var Flags: CF_CALLBACK_DEHYDRATE_COMPLETION_FLAGS = 0, public var Reason: CF_CALLBACK_DEHYDRATION_REASON = 0)

public data class CF_CALLBACK_PARAMETERS_0_6(public var Flags: CF_CALLBACK_DEHYDRATE_FLAGS = 0, public var Reason: CF_CALLBACK_DEHYDRATION_REASON = 0)

public data class CF_CALLBACK_PARAMETERS_0_9(public var Flags: CF_CALLBACK_DELETE_COMPLETION_FLAGS = 0)

public data class CF_CALLBACK_PARAMETERS_0_8(public var Flags: CF_CALLBACK_DELETE_FLAGS = 0)

public data class CF_CALLBACK_PARAMETERS_0_1(
    public var Flags: CF_CALLBACK_FETCH_DATA_FLAGS = 0,
    public var RequiredFileOffset: Long = 0L,
    public var RequiredLength: Long = 0L,
    public var OptionalFileOffset: Long = 0L,
    public var OptionalLength: Long = 0L,
    public var LastDehydrationTime: Long = 0L,
    public var LastDehydrationReason: CF_CALLBACK_DEHYDRATION_REASON = 0,
)

public data class CF_CALLBACK_PARAMETERS_0_3(public var Flags: CF_CALLBACK_FETCH_PLACEHOLDERS_FLAGS = 0, public var Pattern: PCWSTR = 0L)

public data class CF_CALLBACK_PARAMETERS_0_4(public var Flags: CF_CALLBACK_OPEN_COMPLETION_FLAGS = 0)

public data class CF_CALLBACK_PARAMETERS_0_11(public var Flags: CF_CALLBACK_RENAME_COMPLETION_FLAGS = 0, public var SourcePath: PCWSTR = 0L)

public data class CF_CALLBACK_PARAMETERS_0_10(public var Flags: CF_CALLBACK_RENAME_FLAGS = 0, public var TargetPath: PCWSTR = 0L)

public data class CF_CALLBACK_PARAMETERS_0_2(
    public var Flags: CF_CALLBACK_VALIDATE_DATA_FLAGS = 0,
    public var RequiredFileOffset: Long = 0L,
    public var RequiredLength: Long = 0L,
)

public data class CF_CALLBACK_REGISTRATION(public var Type: CF_CALLBACK_TYPE = 0, public var Callback: CF_CALLBACK = null)

public data class CF_FILE_RANGE(public var StartingOffset: Long = 0L, public var Length: Long = 0L)

public data class CF_FS_METADATA(public var BasicInfo: FileSystem.FILE_BASIC_INFO = FileSystem.FILE_BASIC_INFO(), public var FileSize: Long = 0L)

public data class CF_HYDRATION_POLICY(public var Primary: CF_HYDRATION_POLICY_PRIMARY = 0u, public var Modifier: CF_HYDRATION_POLICY_MODIFIER = 0u)

public data class CF_OPERATION_INFO(
    public var StructSize: UInt = 0u,
    public var Type: CF_OPERATION_TYPE = 0,
    public var ConnectionKey: CF_CONNECTION_KEY = 0L,
    public var TransferKey: Long = 0L,
    public var CorrelationVector: Long = 0L,
    public var SyncStatus: Long = 0L,
    public var RequestKey: Long = 0L,
)

public data class CF_OPERATION_PARAMETERS(public var ParamSize: UInt = 0u, public var Anonymous: CF_OPERATION_PARAMETERS_0 = CF_OPERATION_PARAMETERS_0())

public data class CF_OPERATION_PARAMETERS_0(
    public var TransferData: CF_OPERATION_PARAMETERS_0_0 = CF_OPERATION_PARAMETERS_0_0(),
    public var RetrieveData: CF_OPERATION_PARAMETERS_0_1 = CF_OPERATION_PARAMETERS_0_1(),
    public var AckData: CF_OPERATION_PARAMETERS_0_2 = CF_OPERATION_PARAMETERS_0_2(),
    public var RestartHydration: CF_OPERATION_PARAMETERS_0_3 = CF_OPERATION_PARAMETERS_0_3(),
    public var TransferPlaceholders: CF_OPERATION_PARAMETERS_0_4 = CF_OPERATION_PARAMETERS_0_4(),
    public var AckDehydrate: CF_OPERATION_PARAMETERS_0_5 = CF_OPERATION_PARAMETERS_0_5(),
    public var AckRename: CF_OPERATION_PARAMETERS_0_6 = CF_OPERATION_PARAMETERS_0_6(),
    public var AckDelete: CF_OPERATION_PARAMETERS_0_7 = CF_OPERATION_PARAMETERS_0_7(),
)

public data class CF_OPERATION_PARAMETERS_0_2(
    public var Flags: CF_OPERATION_ACK_DATA_FLAGS = 0,
    public var CompletionStatus: Foundation.NTSTATUS = Foundation.NTSTATUS(),
    public var Offset: Long = 0L,
    public var Length: Long = 0L,
)

public data class CF_OPERATION_PARAMETERS_0_5(
    public var Flags: CF_OPERATION_ACK_DEHYDRATE_FLAGS = 0,
    public var CompletionStatus: Foundation.NTSTATUS = Foundation.NTSTATUS(),
    public var FileIdentity: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
)

public data class CF_OPERATION_PARAMETERS_0_7(public var Flags: CF_OPERATION_ACK_DELETE_FLAGS = 0, public var CompletionStatus: Foundation.NTSTATUS = Foundation.NTSTATUS())

public data class CF_OPERATION_PARAMETERS_0_6(public var Flags: CF_OPERATION_ACK_RENAME_FLAGS = 0, public var CompletionStatus: Foundation.NTSTATUS = Foundation.NTSTATUS())

public data class CF_OPERATION_PARAMETERS_0_3(
    public var Flags: CF_OPERATION_RESTART_HYDRATION_FLAGS = 0,
    public var FsMetadata: Long = 0L,
    public var FileIdentity: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
)

public data class CF_OPERATION_PARAMETERS_0_1(
    public var Flags: CF_OPERATION_RETRIEVE_DATA_FLAGS = 0,
    public var Buffer: Long = 0L,
    public var Offset: Long = 0L,
    public var Length: Long = 0L,
    public var ReturnedLength: Long = 0L,
)

public data class CF_OPERATION_PARAMETERS_0_0(
    public var Flags: CF_OPERATION_TRANSFER_DATA_FLAGS = 0,
    public var CompletionStatus: Foundation.NTSTATUS = Foundation.NTSTATUS(),
    public var Buffer: Long = 0L,
    public var Offset: Long = 0L,
    public var Length: Long = 0L,
)

public data class CF_OPERATION_PARAMETERS_0_4(
    public var Flags: CF_OPERATION_TRANSFER_PLACEHOLDERS_FLAGS = 0,
    public var CompletionStatus: Foundation.NTSTATUS = Foundation.NTSTATUS(),
    public var PlaceholderTotalCount: Long = 0L,
    public var PlaceholderArray: Long = 0L,
    public var PlaceholderCount: UInt = 0u,
    public var EntriesProcessed: UInt = 0u,
)

public data class CF_PLACEHOLDER_BASIC_INFO(
    public var PinState: CF_PIN_STATE = 0,
    public var InSyncState: CF_IN_SYNC_STATE = 0,
    public var FileId: Long = 0L,
    public var SyncRootFileId: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
    public var FileIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CF_PLACEHOLDER_BASIC_INFO) return false
        if (this.PinState != other.PinState) return false
        if (this.InSyncState != other.InSyncState) return false
        if (this.FileId != other.FileId) return false
        if (this.SyncRootFileId != other.SyncRootFileId) return false
        if (this.FileIdentityLength != other.FileIdentityLength) return false
        if (!this.FileIdentity.contentEquals(other.FileIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PinState.hashCode()
        result = 31 * result + this.InSyncState.hashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.SyncRootFileId.hashCode()
        result = 31 * result + this.FileIdentityLength.hashCode()
        result = 31 * result + this.FileIdentity.contentHashCode()
        return result
    }
}

public data class CF_PLACEHOLDER_CREATE_INFO(
    public var RelativeFileName: PCWSTR = 0L,
    public var FsMetadata: CF_FS_METADATA = CF_FS_METADATA(),
    public var FileIdentity: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
    public var Flags: CF_PLACEHOLDER_CREATE_FLAGS = 0,
    public var Result: HRESULT = 0,
    public var CreateUsn: Long = 0L,
)

public data class CF_PLACEHOLDER_STANDARD_INFO(
    public var OnDiskDataSize: Long = 0L,
    public var ValidatedDataSize: Long = 0L,
    public var ModifiedDataSize: Long = 0L,
    public var PropertiesSize: Long = 0L,
    public var PinState: CF_PIN_STATE = 0,
    public var InSyncState: CF_IN_SYNC_STATE = 0,
    public var FileId: Long = 0L,
    public var SyncRootFileId: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
    public var FileIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CF_PLACEHOLDER_STANDARD_INFO) return false
        if (this.OnDiskDataSize != other.OnDiskDataSize) return false
        if (this.ValidatedDataSize != other.ValidatedDataSize) return false
        if (this.ModifiedDataSize != other.ModifiedDataSize) return false
        if (this.PropertiesSize != other.PropertiesSize) return false
        if (this.PinState != other.PinState) return false
        if (this.InSyncState != other.InSyncState) return false
        if (this.FileId != other.FileId) return false
        if (this.SyncRootFileId != other.SyncRootFileId) return false
        if (this.FileIdentityLength != other.FileIdentityLength) return false
        if (!this.FileIdentity.contentEquals(other.FileIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.OnDiskDataSize.hashCode()
        result = 31 * result + this.ValidatedDataSize.hashCode()
        result = 31 * result + this.ModifiedDataSize.hashCode()
        result = 31 * result + this.PropertiesSize.hashCode()
        result = 31 * result + this.PinState.hashCode()
        result = 31 * result + this.InSyncState.hashCode()
        result = 31 * result + this.FileId.hashCode()
        result = 31 * result + this.SyncRootFileId.hashCode()
        result = 31 * result + this.FileIdentityLength.hashCode()
        result = 31 * result + this.FileIdentity.contentHashCode()
        return result
    }
}

public data class CF_PLATFORM_INFO(
    public var BuildNumber: UInt = 0u,
    public var RevisionNumber: UInt = 0u,
    public var IntegrationNumber: UInt = 0u,
)

public data class CF_POPULATION_POLICY(public var Primary: CF_POPULATION_POLICY_PRIMARY = 0u, public var Modifier: CF_POPULATION_POLICY_MODIFIER = 0u)

public data class CF_PROCESS_INFO(
    public var StructSize: UInt = 0u,
    public var ProcessId: UInt = 0u,
    public var ImagePath: PCWSTR = 0L,
    public var PackageName: PCWSTR = 0L,
    public var ApplicationId: PCWSTR = 0L,
    public var CommandLine: PCWSTR = 0L,
    public var SessionId: UInt = 0u,
)

public data class CF_SYNC_POLICIES(
    public var StructSize: UInt = 0u,
    public var Hydration: CF_HYDRATION_POLICY = CF_HYDRATION_POLICY(),
    public var Population: CF_POPULATION_POLICY = CF_POPULATION_POLICY(),
    public var InSync: CF_INSYNC_POLICY = 0u,
    public var HardLink: CF_HARDLINK_POLICY = 0,
    public var PlaceholderManagement: CF_PLACEHOLDER_MANAGEMENT_POLICY = 0,
)

public data class CF_SYNC_REGISTRATION(
    public var StructSize: UInt = 0u,
    public var ProviderName: PCWSTR = 0L,
    public var ProviderVersion: PCWSTR = 0L,
    public var SyncRootIdentity: Long = 0L,
    public var SyncRootIdentityLength: UInt = 0u,
    public var FileIdentity: Long = 0L,
    public var FileIdentityLength: UInt = 0u,
    public var ProviderId: GUID = GUID(),
)

public data class CF_SYNC_ROOT_BASIC_INFO(public var SyncRootFileId: Long = 0L)

public data class CF_SYNC_ROOT_PROVIDER_INFO(
    public var ProviderStatus: CF_SYNC_PROVIDER_STATUS = 0u,
    public var ProviderName: UShortArray = UShortArray(256),
    public var ProviderVersion: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CF_SYNC_ROOT_PROVIDER_INFO) return false
        if (this.ProviderStatus != other.ProviderStatus) return false
        if (!this.ProviderName.contentEquals(other.ProviderName)) return false
        if (!this.ProviderVersion.contentEquals(other.ProviderVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProviderStatus.hashCode()
        result = 31 * result + this.ProviderName.contentHashCode()
        result = 31 * result + this.ProviderVersion.contentHashCode()
        return result
    }
}

public data class CF_SYNC_ROOT_STANDARD_INFO(
    public var SyncRootFileId: Long = 0L,
    public var HydrationPolicy: CF_HYDRATION_POLICY = CF_HYDRATION_POLICY(),
    public var PopulationPolicy: CF_POPULATION_POLICY = CF_POPULATION_POLICY(),
    public var InSyncPolicy: CF_INSYNC_POLICY = 0u,
    public var HardLinkPolicy: CF_HARDLINK_POLICY = 0,
    public var ProviderStatus: CF_SYNC_PROVIDER_STATUS = 0u,
    public var ProviderName: UShortArray = UShortArray(256),
    public var ProviderVersion: UShortArray = UShortArray(256),
    public var SyncRootIdentityLength: UInt = 0u,
    public var SyncRootIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CF_SYNC_ROOT_STANDARD_INFO) return false
        if (this.SyncRootFileId != other.SyncRootFileId) return false
        if (this.HydrationPolicy != other.HydrationPolicy) return false
        if (this.PopulationPolicy != other.PopulationPolicy) return false
        if (this.InSyncPolicy != other.InSyncPolicy) return false
        if (this.HardLinkPolicy != other.HardLinkPolicy) return false
        if (this.ProviderStatus != other.ProviderStatus) return false
        if (!this.ProviderName.contentEquals(other.ProviderName)) return false
        if (!this.ProviderVersion.contentEquals(other.ProviderVersion)) return false
        if (this.SyncRootIdentityLength != other.SyncRootIdentityLength) return false
        if (!this.SyncRootIdentity.contentEquals(other.SyncRootIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SyncRootFileId.hashCode()
        result = 31 * result + this.HydrationPolicy.hashCode()
        result = 31 * result + this.PopulationPolicy.hashCode()
        result = 31 * result + this.InSyncPolicy.hashCode()
        result = 31 * result + this.HardLinkPolicy.hashCode()
        result = 31 * result + this.ProviderStatus.hashCode()
        result = 31 * result + this.ProviderName.contentHashCode()
        result = 31 * result + this.ProviderVersion.contentHashCode()
        result = 31 * result + this.SyncRootIdentityLength.hashCode()
        result = 31 * result + this.SyncRootIdentity.contentHashCode()
        return result
    }
}

public data class CF_SYNC_STATUS(
    public var StructSize: UInt = 0u,
    public var Code: UInt = 0u,
    public var DescriptionOffset: UInt = 0u,
    public var DescriptionLength: UInt = 0u,
    public var DeviceIdOffset: UInt = 0u,
    public var DeviceIdLength: UInt = 0u,
)
