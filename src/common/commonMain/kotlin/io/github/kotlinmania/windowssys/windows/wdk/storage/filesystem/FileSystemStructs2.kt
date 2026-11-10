@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FastMutex
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public data class SecFlags(public var flags: ULong = 0uL)

public data class SecNegotiationInfo(
    public var size: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShort? = null,
    public var reserved: COpaquePointer? = null,
)

public data class SecPresharedkey(public var keySize: UShort = 0u, public var key: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPresharedkey) return false
        if (this.keySize != other.keySize) return false
        if (!this.key.contentEquals(other.key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keySize.hashCode()
        result = 31 * result + this.key.contentHashCode()
        return result
    }
}

public data class SecSrtpMasterKeyIdentifier(public var masterKeyIdentifierSize: UByte = 0u, public var masterKeyIdentifier: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecSrtpMasterKeyIdentifier) return false
        if (this.masterKeyIdentifierSize != other.masterKeyIdentifierSize) return false
        if (!this.masterKeyIdentifier.contentEquals(other.masterKeyIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.masterKeyIdentifierSize.hashCode()
        result = 31 * result + this.masterKeyIdentifier.contentHashCode()
        return result
    }
}

public data class SetCachedRunsStateInputBuffer(public var enable: Boolean = false)

public data class SeAuditInfo(
    public var size: UInt = 0u,
    public var auditType: AuditEventType = 0,
    public var auditOperation: SeAuditOperation = 0,
    public var auditFlags: UInt = 0u,
    public var subsystemName: UnicodeString = UnicodeString(),
    public var objectTypeName: UnicodeString = UnicodeString(),
    public var objectName: UnicodeString = UnicodeString(),
    public var handleId: COpaquePointer? = null,
    public var transactionId: Guid? = null,
    public var operationId: Luid? = null,
    public var objectCreation: Boolean = false,
    public var generateOnClose: Boolean = false,
)

public class SeExports {
    public var seCreateTokenPrivilege: Luid = Luid()

    public var seAssignPrimaryTokenPrivilege: Luid = Luid()

    public var seLockMemoryPrivilege: Luid = Luid()

    public var seIncreaseQuotaPrivilege: Luid = Luid()

    public var seUnsolicitedInputPrivilege: Luid = Luid()

    public var seTcbPrivilege: Luid = Luid()

    public var seSecurityPrivilege: Luid = Luid()

    public var seTakeOwnershipPrivilege: Luid = Luid()

    public var seLoadDriverPrivilege: Luid = Luid()

    public var seCreatePagefilePrivilege: Luid = Luid()

    public var seIncreaseBasePriorityPrivilege: Luid = Luid()

    public var seSystemProfilePrivilege: Luid = Luid()

    public var seSystemtimePrivilege: Luid = Luid()

    public var seProfileSingleProcessPrivilege: Luid = Luid()

    public var seCreatePermanentPrivilege: Luid = Luid()

    public var seBackupPrivilege: Luid = Luid()

    public var seRestorePrivilege: Luid = Luid()

    public var seShutdownPrivilege: Luid = Luid()

    public var seDebugPrivilege: Luid = Luid()

    public var seAuditPrivilege: Luid = Luid()

    public var seSystemEnvironmentPrivilege: Luid = Luid()

    public var seChangeNotifyPrivilege: Luid = Luid()

    public var seRemoteShutdownPrivilege: Luid = Luid()

    public var seNullSid: Psid = null

    public var seWorldSid: Psid = null

    public var seLocalSid: Psid = null

    public var seCreatorOwnerSid: Psid = null

    public var seCreatorGroupSid: Psid = null

    public var seNtAuthoritySid: Psid = null

    public var seDialupSid: Psid = null

    public var seNetworkSid: Psid = null

    public var seBatchSid: Psid = null

    public var seInteractiveSid: Psid = null

    public var seLocalSystemSid: Psid = null

    public var seAliasAdminsSid: Psid = null

    public var seAliasUsersSid: Psid = null

    public var seAliasGuestsSid: Psid = null

    public var seAliasPowerUsersSid: Psid = null

    public var seAliasAccountOpsSid: Psid = null

    public var seAliasSystemOpsSid: Psid = null

    public var seAliasPrintOpsSid: Psid = null

    public var seAliasBackupOpsSid: Psid = null

    public var seAuthenticatedUsersSid: Psid = null

    public var seRestrictedSid: Psid = null

    public var seAnonymousLogonSid: Psid = null

    public var seUndockPrivilege: Luid = Luid()

    public var seSyncAgentPrivilege: Luid = Luid()

    public var seEnableDelegationPrivilege: Luid = Luid()

    public var seLocalServiceSid: Psid = null

    public var seNetworkServiceSid: Psid = null

    public var seManageVolumePrivilege: Luid = Luid()

    public var seImpersonatePrivilege: Luid = Luid()

    public var seCreateGlobalPrivilege: Luid = Luid()

    public var seTrustedCredManAccessPrivilege: Luid = Luid()

    public var seRelabelPrivilege: Luid = Luid()

    public var seIncreaseWorkingSetPrivilege: Luid = Luid()

    public var seTimeZonePrivilege: Luid = Luid()

    public var seCreateSymbolicLinkPrivilege: Luid = Luid()

    public var seIUserSid: Psid = null

    public var seUntrustedMandatorySid: Psid = null

    public var seLowMandatorySid: Psid = null

    public var seMediumMandatorySid: Psid = null

    public var seHighMandatorySid: Psid = null

    public var seSystemMandatorySid: Psid = null

    public var seOwnerRightsSid: Psid = null

    public var seAllAppPackagesSid: Psid = null

    public var seUserModeDriversSid: Psid = null

    public var seProcTrustWinTcbSid: Psid = null

    public var seTrustedInstallerSid: Psid = null

    public var seDelegateSessionUserImpersonatePrivilege: Luid = Luid()

    public var seAppSiloSid: Psid = null

    public var seAppSiloVolumeRootMinimalCapabilitySid: Psid = null

    public var seAppSiloProfilesRootMinimalCapabilitySid: Psid = null
}

public data class SrvOpenEcpContext(
    public var shareName: UnicodeString? = null,
    public var socketAddress: SockaddrStorage? = null,
    public var oplockBlockState: Boolean = false,
    public var oplockAppState: Boolean = false,
    public var oplockFinalState: Boolean = false,
    public var version: UShort = 0u,
    public var instanceType: SrvInstanceType = 0,
)

public data class SystemProcessTrustLabelAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
)

public data class SecBuffer(
    public var cbBuffer: UInt = 0u,
    public var bufferType: UInt = 0u,
    public var pvBuffer: COpaquePointer? = null,
)

public data class SecBufferDesc(
    public var ulVersion: UInt = 0u,
    public var cBuffers: UInt = 0u,
    public var pBuffers: SecBuffer? = null,
)

public data class SecHandle(public var dwLower: Int = 0, public var dwUpper: Int = 0)

public data class Tunnel(
    public var mutex: FastMutex = FastMutex(),
    public var cache: RtlSplayLinks? = null,
    public var timerQueue: ListEntry = ListEntry(),
    public var numEntries: UShort = 0u,
)

public data class UnicodePrefixTable(
    public var nodeTypeCode: Short = 0,
    public var nameLength: Short = 0,
    public var nextPrefixTree: UnicodePrefixTableEntry? = null,
    public var lastNextEntry: UnicodePrefixTableEntry? = null,
)

public data class UnicodePrefixTableEntry(
    public var nodeTypeCode: Short = 0,
    public var nameLength: Short = 0,
    public var nextPrefixTree: UnicodePrefixTableEntry? = null,
    public var caseMatch: UnicodePrefixTableEntry? = null,
    public var links: RtlSplayLinks = RtlSplayLinks(),
    public var prefix: UnicodeString? = null,
)

public data class UsnJournalData(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
    public var minSupportedMajorVersion: UShort = 0u,
    public var maxSupportedMajorVersion: UShort = 0u,
)

public data class UsnRecord(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var fileReferenceNumber: ULong = 0uL,
    public var parentFileReferenceNumber: ULong = 0uL,
    public var usn: Long = 0L,
    public var timeStamp: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UInt = 0u,
    public var securityId: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UShort = 0u,
    public var fileNameOffset: UShort = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsnRecord) return false
        if (this.recordLength != other.recordLength) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.usn != other.usn) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.reason != other.reason) return false
        if (this.sourceInfo != other.sourceInfo) return false
        if (this.securityId != other.securityId) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameOffset != other.fileNameOffset) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordLength.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.fileReferenceNumber.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.usn.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.sourceInfo.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameOffset.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class VcnRangeInputBuffer(public var startingVcn: Long = 0L, public var clusterCount: Long = 0L)

public class VolumeRefsInfoBuffer {
    public var cacheSizeInBytes: Long = 0L

    public var allocatedCacheInBytes: Long = 0L

    public var populatedCacheInBytes: Long = 0L

    public var inErrorCacheInBytes: Long = 0L

    public var memoryUsedForCacheMetadata: Long = 0L

    public var cacheLineSize: UInt = 0u

    public var cacheTransactionsOutstanding: Int = 0

    public var cacheLinesFree: Int = 0

    public var cacheLinesInError: Int = 0

    public var cacheHitsInBytes: Long = 0L

    public var cacheMissesInBytes: Long = 0L

    public var cachePopulationUpdatesInBytes: Long = 0L

    public var cacheWriteThroughUpdatesInBytes: Long = 0L

    public var cacheInvalidationsInBytes: Long = 0L

    public var cacheOverReadsInBytes: Long = 0L

    public var metadataWrittenBytes: Long = 0L

    public var cacheHitCounter: Int = 0

    public var cacheMissCounter: Int = 0

    public var cacheLineAllocationCounter: Int = 0

    public var cacheInvalidationsCounter: Int = 0

    public var cachePopulationUpdatesCounter: Int = 0

    public var cacheWriteThroughUpdatesCounter: Int = 0

    public var maxCacheTransactionsOutstanding: Int = 0

    public var dataWritesReallocationCount: Int = 0

    public var dataInPlaceWriteCount: Int = 0

    public var metadataAllocationsFastTierCount: Int = 0

    public var metadataAllocationsSlowTierCount: Int = 0

    public var dataAllocationsFastTierCount: Int = 0

    public var dataAllocationsSlowTierCount: Int = 0

    public var destagesSlowTierToFastTier: Int = 0

    public var destagesFastTierToSlowTier: Int = 0

    public var slowTierDataFillRatio: Int = 0

    public var fastTierDataFillRatio: Int = 0

    public var slowTierMetadataFillRatio: Int = 0

    public var fastTierMetadataFillRatio: Int = 0

    public var slowToFastDestageReadLatency: Int = 0

    public var slowToFastDestageReadLatencyBase: Int = 0

    public var slowToFastDestageWriteLatency: Int = 0

    public var slowToFastDestageWriteLatencyBase: Int = 0

    public var fastToSlowDestageReadLatency: Int = 0

    public var fastToSlowDestageReadLatencyBase: Int = 0

    public var fastToSlowDestageWriteLatency: Int = 0

    public var fastToSlowDestageWriteLatencyBase: Int = 0

    public var slowTierContainerFillRatio: Int = 0

    public var slowTierContainerFillRatioBase: Int = 0

    public var fastTierContainerFillRatio: Int = 0

    public var fastTierContainerFillRatioBase: Int = 0

    public var treeUpdateLatency: Int = 0

    public var treeUpdateLatencyBase: Int = 0

    public var checkpointLatency: Int = 0

    public var checkpointLatencyBase: Int = 0

    public var treeUpdateCount: Int = 0

    public var checkpointCount: Int = 0

    public var logWriteCount: Int = 0

    public var logFillRatio: Int = 0

    public var readCacheInvalidationsForOverwrite: Int = 0

    public var readCacheInvalidationsForReuse: Int = 0

    public var readCacheInvalidationsGeneral: Int = 0

    public var readCacheChecksOnMount: Int = 0

    public var readCacheIssuesOnMount: Int = 0

    public var trimLatency: Int = 0

    public var trimLatencyBase: Int = 0

    public var dataCompactionCount: Int = 0

    public var compactionReadLatency: Int = 0

    public var compactionReadLatencyBase: Int = 0

    public var compactionWriteLatency: Int = 0

    public var compactionWriteLatencyBase: Int = 0

    public var dataInPlaceWriteClusterCount: Long = 0L

    public var compactionFailedDueToIneligibleContainer: Int = 0

    public var compactionFailedDueToMaxFragmentation: Int = 0

    public var compactedContainerFillRatio: Int = 0

    public var compactedContainerFillRatioBase: Int = 0

    public var containerMoveRetryCount: Int = 0

    public var containerMoveFailedDueToIneligibleContainer: Int = 0

    public var compactionFailureCount: Int = 0

    public var containerMoveFailureCount: Int = 0

    public var numberOfDirtyMetadataPages: Long = 0L

    public var numberOfDirtyTableListEntries: Int = 0

    public var numberOfDeleteQueueEntries: Int = 0
}
