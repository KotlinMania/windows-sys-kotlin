@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

public data class SEC_FLAGS(public var Flags: ULong = 0uL)

public data class SEC_NEGOTIATION_INFO(
    public var Size: UInt = 0u,
    public var NameLength: UInt = 0u,
    public var Name: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class SEC_PRESHAREDKEY(public var KeySize: UShort = 0u, public var Key: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_PRESHAREDKEY) return false
        if (this.KeySize != other.KeySize) return false
        if (!this.Key.contentEquals(other.Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.KeySize.hashCode()
        result = 31 * result + this.Key.contentHashCode()
        return result
    }
}

public data class SEC_SRTP_MASTER_KEY_IDENTIFIER(public var MasterKeyIdentifierSize: UByte = 0u, public var MasterKeyIdentifier: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SEC_SRTP_MASTER_KEY_IDENTIFIER) return false
        if (this.MasterKeyIdentifierSize != other.MasterKeyIdentifierSize) return false
        if (!this.MasterKeyIdentifier.contentEquals(other.MasterKeyIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MasterKeyIdentifierSize.hashCode()
        result = 31 * result + this.MasterKeyIdentifier.contentHashCode()
        return result
    }
}

public data class SET_CACHED_RUNS_STATE_INPUT_BUFFER(public var Enable: Boolean = false)

public data class SE_AUDIT_INFO(
    public var Size: UInt = 0u,
    public var AuditType: Win32.Security.AUDIT_EVENT_TYPE = Win32.Security.AUDIT_EVENT_TYPE(),
    public var AuditOperation: SE_AUDIT_OPERATION = 0,
    public var AuditFlags: UInt = 0u,
    public var SubsystemName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var ObjectTypeName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var ObjectName: Win32.Foundation.UNICODE_STRING = Win32.Foundation.UNICODE_STRING(),
    public var HandleId: Long = 0L,
    public var TransactionId: Long = 0L,
    public var OperationId: Long = 0L,
    public var ObjectCreation: Boolean = false,
    public var GenerateOnClose: Boolean = false,
)

public class SE_EXPORTS {
    public var SeCreateTokenPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeAssignPrimaryTokenPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeLockMemoryPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeIncreaseQuotaPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeUnsolicitedInputPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeTcbPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeSecurityPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeTakeOwnershipPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeLoadDriverPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeCreatePagefilePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeIncreaseBasePriorityPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeSystemProfilePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeSystemtimePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeProfileSingleProcessPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeCreatePermanentPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeBackupPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeRestorePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeShutdownPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeDebugPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeAuditPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeSystemEnvironmentPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeChangeNotifyPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeRemoteShutdownPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeNullSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeWorldSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeLocalSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeCreatorOwnerSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeCreatorGroupSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeNtAuthoritySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeDialupSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeNetworkSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeBatchSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeInteractiveSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeLocalSystemSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasAdminsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasUsersSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasGuestsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasPowerUsersSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasAccountOpsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasSystemOpsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasPrintOpsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAliasBackupOpsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAuthenticatedUsersSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeRestrictedSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAnonymousLogonSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeUndockPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeSyncAgentPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeEnableDelegationPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeLocalServiceSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeNetworkServiceSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeManageVolumePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeImpersonatePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeCreateGlobalPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeTrustedCredManAccessPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeRelabelPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeIncreaseWorkingSetPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeTimeZonePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeCreateSymbolicLinkPrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeIUserSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeUntrustedMandatorySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeLowMandatorySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeMediumMandatorySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeHighMandatorySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeSystemMandatorySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeOwnerRightsSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAllAppPackagesSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeUserModeDriversSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeProcTrustWinTcbSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeTrustedInstallerSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeDelegateSessionUserImpersonatePrivilege: Win32.Foundation.LUID = Win32.Foundation.LUID()

    public var SeAppSiloSid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAppSiloVolumeRootMinimalCapabilitySid: Win32.Security.PSID = Win32.Security.PSID()

    public var SeAppSiloProfilesRootMinimalCapabilitySid: Win32.Security.PSID = Win32.Security.PSID()
}

public data class SRV_OPEN_ECP_CONTEXT(
    public var ShareName: Long = 0L,
    public var SocketAddress: Long = 0L,
    public var OplockBlockState: Boolean = false,
    public var OplockAppState: Boolean = false,
    public var OplockFinalState: Boolean = false,
    public var Version: UShort = 0u,
    public var InstanceType: SRV_INSTANCE_TYPE = 0,
)

public data class SYSTEM_PROCESS_TRUST_LABEL_ACE(
    public var Header: ACE_HEADER = ACE_HEADER(),
    public var Mask: UInt = 0u,
    public var SidStart: UInt = 0u,
)

public data class SecBuffer(
    public var cbBuffer: UInt = 0u,
    public var BufferType: UInt = 0u,
    public var pvBuffer: Long = 0L,
)

public data class SecBufferDesc(
    public var ulVersion: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var pBuffers: Long = 0L,
)

public data class SecHandle(public var dwLower: ULong = 0uL, public var dwUpper: ULong = 0uL)

public data class TUNNEL(
    public var Mutex: Foundation.FAST_MUTEX = Foundation.FAST_MUTEX(),
    public var Cache: Long = 0L,
    public var TimerQueue: Win32.System.Kernel.LIST_ENTRY = Win32.System.Kernel.LIST_ENTRY(),
    public var NumEntries: UShort = 0u,
)

public data class UNICODE_PREFIX_TABLE(
    public var NodeTypeCode: Short = 0,
    public var NameLength: Short = 0,
    public var NextPrefixTree: Long = 0L,
    public var LastNextEntry: Long = 0L,
)

public data class UNICODE_PREFIX_TABLE_ENTRY(
    public var NodeTypeCode: Short = 0,
    public var NameLength: Short = 0,
    public var NextPrefixTree: Long = 0L,
    public var CaseMatch: Long = 0L,
    public var Links: Foundation.RTL_SPLAY_LINKS = Foundation.RTL_SPLAY_LINKS(),
    public var Prefix: Long = 0L,
)

public data class USN_JOURNAL_DATA(
    public var UsnJournalID: ULong = 0uL,
    public var FirstUsn: Long = 0L,
    public var NextUsn: Long = 0L,
    public var LowestValidUsn: Long = 0L,
    public var MaxUsn: Long = 0L,
    public var MaximumSize: ULong = 0uL,
    public var AllocationDelta: ULong = 0uL,
    public var MinSupportedMajorVersion: UShort = 0u,
    public var MaxSupportedMajorVersion: UShort = 0u,
)

public data class USN_RECORD(
    public var RecordLength: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var FileReferenceNumber: ULong = 0uL,
    public var ParentFileReferenceNumber: ULong = 0uL,
    public var Usn: Long = 0L,
    public var TimeStamp: Long = 0L,
    public var Reason: UInt = 0u,
    public var SourceInfo: UInt = 0u,
    public var SecurityId: UInt = 0u,
    public var FileAttributes: UInt = 0u,
    public var FileNameLength: UShort = 0u,
    public var FileNameOffset: UShort = 0u,
    public var FileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USN_RECORD) return false
        if (this.RecordLength != other.RecordLength) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.FileReferenceNumber != other.FileReferenceNumber) return false
        if (this.ParentFileReferenceNumber != other.ParentFileReferenceNumber) return false
        if (this.Usn != other.Usn) return false
        if (this.TimeStamp != other.TimeStamp) return false
        if (this.Reason != other.Reason) return false
        if (this.SourceInfo != other.SourceInfo) return false
        if (this.SecurityId != other.SecurityId) return false
        if (this.FileAttributes != other.FileAttributes) return false
        if (this.FileNameLength != other.FileNameLength) return false
        if (this.FileNameOffset != other.FileNameOffset) return false
        if (!this.FileName.contentEquals(other.FileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.RecordLength.hashCode()
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.FileReferenceNumber.hashCode()
        result = 31 * result + this.ParentFileReferenceNumber.hashCode()
        result = 31 * result + this.Usn.hashCode()
        result = 31 * result + this.TimeStamp.hashCode()
        result = 31 * result + this.Reason.hashCode()
        result = 31 * result + this.SourceInfo.hashCode()
        result = 31 * result + this.SecurityId.hashCode()
        result = 31 * result + this.FileAttributes.hashCode()
        result = 31 * result + this.FileNameLength.hashCode()
        result = 31 * result + this.FileNameOffset.hashCode()
        result = 31 * result + this.FileName.contentHashCode()
        return result
    }
}

public data class VCN_RANGE_INPUT_BUFFER(public var StartingVcn: Long = 0L, public var ClusterCount: Long = 0L)

public class VOLUME_REFS_INFO_BUFFER {
    public var CacheSizeInBytes: Long = 0L

    public var AllocatedCacheInBytes: Long = 0L

    public var PopulatedCacheInBytes: Long = 0L

    public var InErrorCacheInBytes: Long = 0L

    public var MemoryUsedForCacheMetadata: Long = 0L

    public var CacheLineSize: UInt = 0u

    public var CacheTransactionsOutstanding: Int = 0

    public var CacheLinesFree: Int = 0

    public var CacheLinesInError: Int = 0

    public var CacheHitsInBytes: Long = 0L

    public var CacheMissesInBytes: Long = 0L

    public var CachePopulationUpdatesInBytes: Long = 0L

    public var CacheWriteThroughUpdatesInBytes: Long = 0L

    public var CacheInvalidationsInBytes: Long = 0L

    public var CacheOverReadsInBytes: Long = 0L

    public var MetadataWrittenBytes: Long = 0L

    public var CacheHitCounter: Int = 0

    public var CacheMissCounter: Int = 0

    public var CacheLineAllocationCounter: Int = 0

    public var CacheInvalidationsCounter: Int = 0

    public var CachePopulationUpdatesCounter: Int = 0

    public var CacheWriteThroughUpdatesCounter: Int = 0

    public var MaxCacheTransactionsOutstanding: Int = 0

    public var DataWritesReallocationCount: Int = 0

    public var DataInPlaceWriteCount: Int = 0

    public var MetadataAllocationsFastTierCount: Int = 0

    public var MetadataAllocationsSlowTierCount: Int = 0

    public var DataAllocationsFastTierCount: Int = 0

    public var DataAllocationsSlowTierCount: Int = 0

    public var DestagesSlowTierToFastTier: Int = 0

    public var DestagesFastTierToSlowTier: Int = 0

    public var SlowTierDataFillRatio: Int = 0

    public var FastTierDataFillRatio: Int = 0

    public var SlowTierMetadataFillRatio: Int = 0

    public var FastTierMetadataFillRatio: Int = 0

    public var SlowToFastDestageReadLatency: Int = 0

    public var SlowToFastDestageReadLatencyBase: Int = 0

    public var SlowToFastDestageWriteLatency: Int = 0

    public var SlowToFastDestageWriteLatencyBase: Int = 0

    public var FastToSlowDestageReadLatency: Int = 0

    public var FastToSlowDestageReadLatencyBase: Int = 0

    public var FastToSlowDestageWriteLatency: Int = 0

    public var FastToSlowDestageWriteLatencyBase: Int = 0

    public var SlowTierContainerFillRatio: Int = 0

    public var SlowTierContainerFillRatioBase: Int = 0

    public var FastTierContainerFillRatio: Int = 0

    public var FastTierContainerFillRatioBase: Int = 0

    public var TreeUpdateLatency: Int = 0

    public var TreeUpdateLatencyBase: Int = 0

    public var CheckpointLatency: Int = 0

    public var CheckpointLatencyBase: Int = 0

    public var TreeUpdateCount: Int = 0

    public var CheckpointCount: Int = 0

    public var LogWriteCount: Int = 0

    public var LogFillRatio: Int = 0

    public var ReadCacheInvalidationsForOverwrite: Int = 0

    public var ReadCacheInvalidationsForReuse: Int = 0

    public var ReadCacheInvalidationsGeneral: Int = 0

    public var ReadCacheChecksOnMount: Int = 0

    public var ReadCacheIssuesOnMount: Int = 0

    public var TrimLatency: Int = 0

    public var TrimLatencyBase: Int = 0

    public var DataCompactionCount: Int = 0

    public var CompactionReadLatency: Int = 0

    public var CompactionReadLatencyBase: Int = 0

    public var CompactionWriteLatency: Int = 0

    public var CompactionWriteLatencyBase: Int = 0

    public var DataInPlaceWriteClusterCount: Long = 0L

    public var CompactionFailedDueToIneligibleContainer: Int = 0

    public var CompactionFailedDueToMaxFragmentation: Int = 0

    public var CompactedContainerFillRatio: Int = 0

    public var CompactedContainerFillRatioBase: Int = 0

    public var ContainerMoveRetryCount: Int = 0

    public var ContainerMoveFailedDueToIneligibleContainer: Int = 0

    public var CompactionFailureCount: Int = 0

    public var ContainerMoveFailureCount: Int = 0

    public var NumberOfDirtyMetadataPages: Long = 0L

    public var NumberOfDirtyTableListEntries: Int = 0

    public var NumberOfDeleteQueueEntries: Int = 0
}
