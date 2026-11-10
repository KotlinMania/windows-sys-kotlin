@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public data class DfsGetPktEntryStateArg(
    public var dfsEntryPathLen: UShort = 0u,
    public var serverNameLen: UShort = 0u,
    public var shareNameLen: UShort = 0u,
    public var level: UInt = 0u,
    public var buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsGetPktEntryStateArg) return false
        if (this.dfsEntryPathLen != other.dfsEntryPathLen) return false
        if (this.serverNameLen != other.serverNameLen) return false
        if (this.shareNameLen != other.shareNameLen) return false
        if (this.level != other.level) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dfsEntryPathLen.hashCode()
        result = 31 * result + this.serverNameLen.hashCode()
        result = 31 * result + this.shareNameLen.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class DfsInfo1(public var entryPath: Pwstr = null)

public data class DfsInfo100(public var comment: Pwstr = null)

public data class DfsInfo101(public var state: UInt = 0u)

public data class DfsInfo102(public var timeout: UInt = 0u)

public data class DfsInfo103(public var propertyFlagMask: UInt = 0u, public var propertyFlags: UInt = 0u)

public data class DfsInfo104(public var targetPriority: DfsTargetPriority = DfsTargetPriority())

public data class DfsInfo105(
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var propertyFlagMask: UInt = 0u,
    public var propertyFlags: UInt = 0u,
)

public data class DfsInfo106(public var state: UInt = 0u, public var targetPriority: DfsTargetPriority = DfsTargetPriority())

public data class DfsInfo107(
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var propertyFlagMask: UInt = 0u,
    public var propertyFlags: UInt = 0u,
    public var sdLengthReserved: UInt = 0u,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
)

public data class DfsInfo150(public var sdLengthReserved: UInt = 0u, public var pSecurityDescriptor: PsecurityDescriptor = null)

public data class DfsInfo132(public var entryPath: UInt = 0u)

public data class DfsInfo2(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
)

public data class DfsInfo200(public var ftDfsName: Pwstr = null)

public data class DfsInfo232(
    public var entryPath: UInt = 0u,
    public var comment: UInt = 0u,
    public var state: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
)

public data class DfsInfo3(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
    public var storage: DfsStorageInfo? = null,
)

public data class DfsInfo300(public var flags: UInt = 0u, public var dfsName: Pwstr = null)

public data class DfsInfo332(
    public var entryPath: UInt = 0u,
    public var comment: UInt = 0u,
    public var state: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
    public var storage: UInt = 0u,
)

public data class DfsInfo4(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var numberOfStorages: UInt = 0u,
    public var storage: DfsStorageInfo? = null,
)

public data class DfsInfo432(
    public var entryPath: UInt = 0u,
    public var comment: UInt = 0u,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var numberOfStorages: UInt = 0u,
    public var storage: UInt = 0u,
)

public data class DfsInfo5(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var propertyFlags: UInt = 0u,
    public var metadataSize: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
)

public data class DfsInfo50(
    public var namespaceMajorVersion: UInt = 0u,
    public var namespaceMinorVersion: UInt = 0u,
    public var namespaceCapabilities: ULong = 0uL,
)

public data class DfsInfo6(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var propertyFlags: UInt = 0u,
    public var metadataSize: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
    public var storage: DfsStorageInfo1? = null,
)

public data class DfsInfo7(public var generationGuid: Guid = Guid())

public data class DfsInfo8(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var propertyFlags: UInt = 0u,
    public var metadataSize: UInt = 0u,
    public var sdLengthReserved: UInt = 0u,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var numberOfStorages: UInt = 0u,
)

public data class DfsInfo9(
    public var entryPath: Pwstr = null,
    public var comment: Pwstr = null,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var propertyFlags: UInt = 0u,
    public var metadataSize: UInt = 0u,
    public var sdLengthReserved: UInt = 0u,
    public var pSecurityDescriptor: PsecurityDescriptor = null,
    public var numberOfStorages: UInt = 0u,
    public var storage: DfsStorageInfo1? = null,
)

public data class DfsSitelistInfo(public var cSites: UInt = 0u, public var site: List<DfsSitenameInfo> = List(1) { DfsSitenameInfo() })

public data class DfsSitenameInfo(public var siteFlags: UInt = 0u, public var siteName: Pwstr = null)

public data class DfsStorageInfo(
    public var state: UInt = 0u,
    public var serverName: Pwstr = null,
    public var shareName: Pwstr = null,
)

public data class DfsStorageInfo032(
    public var state: UInt = 0u,
    public var serverName: UInt = 0u,
    public var shareName: UInt = 0u,
)

public data class DfsStorageInfo1(
    public var state: UInt = 0u,
    public var serverName: Pwstr = null,
    public var shareName: Pwstr = null,
    public var targetPriority: DfsTargetPriority = DfsTargetPriority(),
)

public data class DfsSupportedNamespaceVersionInfo(
    public var domainDfsMajorVersion: UInt = 0u,
    public var domainDfsMinorVersion: UInt = 0u,
    public var domainDfsCapabilities: ULong = 0uL,
    public var standaloneDfsMajorVersion: UInt = 0u,
    public var standaloneDfsMinorVersion: UInt = 0u,
    public var standaloneDfsCapabilities: ULong = 0uL,
)

public data class DfsTargetPriority(
    public var targetPriorityClass: DfsTargetPriorityClass = 0,
    public var targetPriorityRank: UShort = 0u,
    public var reserved: UShort = 0u,
)
