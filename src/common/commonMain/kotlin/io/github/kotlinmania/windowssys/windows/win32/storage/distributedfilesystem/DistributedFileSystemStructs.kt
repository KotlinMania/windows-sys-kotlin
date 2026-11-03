@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class DFS_GET_PKT_ENTRY_STATE_ARG(
    public var DfsEntryPathLen: UShort = 0u,
    public var ServerNameLen: UShort = 0u,
    public var ShareNameLen: UShort = 0u,
    public var Level: UInt = 0u,
    public var Buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DFS_GET_PKT_ENTRY_STATE_ARG) return false
        if (this.DfsEntryPathLen != other.DfsEntryPathLen) return false
        if (this.ServerNameLen != other.ServerNameLen) return false
        if (this.ShareNameLen != other.ShareNameLen) return false
        if (this.Level != other.Level) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DfsEntryPathLen.hashCode()
        result = 31 * result + this.ServerNameLen.hashCode()
        result = 31 * result + this.ShareNameLen.hashCode()
        result = 31 * result + this.Level.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class DFS_INFO_1(public var EntryPath: PWSTR = 0L)

public data class DFS_INFO_100(public var Comment: PWSTR = 0L)

public data class DFS_INFO_101(public var State: UInt = 0u)

public data class DFS_INFO_102(public var Timeout: UInt = 0u)

public data class DFS_INFO_103(public var PropertyFlagMask: UInt = 0u, public var PropertyFlags: UInt = 0u)

public data class DFS_INFO_104(public var TargetPriority: DFS_TARGET_PRIORITY = DFS_TARGET_PRIORITY())

public data class DFS_INFO_105(
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var PropertyFlagMask: UInt = 0u,
    public var PropertyFlags: UInt = 0u,
)

public data class DFS_INFO_106(public var State: UInt = 0u, public var TargetPriority: DFS_TARGET_PRIORITY = DFS_TARGET_PRIORITY())

public data class DFS_INFO_107(
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var PropertyFlagMask: UInt = 0u,
    public var PropertyFlags: UInt = 0u,
    public var SdLengthReserved: UInt = 0u,
    public var pSecurityDescriptor: Security.PSECURITY_DESCRIPTOR = Security.PSECURITY_DESCRIPTOR(),
)

public data class DFS_INFO_150(public var SdLengthReserved: UInt = 0u, public var pSecurityDescriptor: Security.PSECURITY_DESCRIPTOR = Security.PSECURITY_DESCRIPTOR())

public data class DFS_INFO_1_32(public var EntryPath: UInt = 0u)

public data class DFS_INFO_2(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var NumberOfStorages: UInt = 0u,
)

public data class DFS_INFO_200(public var FtDfsName: PWSTR = 0L)

public data class DFS_INFO_2_32(
    public var EntryPath: UInt = 0u,
    public var Comment: UInt = 0u,
    public var State: UInt = 0u,
    public var NumberOfStorages: UInt = 0u,
)

public data class DFS_INFO_3(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var NumberOfStorages: UInt = 0u,
    public var Storage: Long = 0L,
)

public data class DFS_INFO_300(public var Flags: UInt = 0u, public var DfsName: PWSTR = 0L)

public data class DFS_INFO_3_32(
    public var EntryPath: UInt = 0u,
    public var Comment: UInt = 0u,
    public var State: UInt = 0u,
    public var NumberOfStorages: UInt = 0u,
    public var Storage: UInt = 0u,
)

public data class DFS_INFO_4(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var NumberOfStorages: UInt = 0u,
    public var Storage: Long = 0L,
)

public data class DFS_INFO_4_32(
    public var EntryPath: UInt = 0u,
    public var Comment: UInt = 0u,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var NumberOfStorages: UInt = 0u,
    public var Storage: UInt = 0u,
)

public data class DFS_INFO_5(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var PropertyFlags: UInt = 0u,
    public var MetadataSize: UInt = 0u,
    public var NumberOfStorages: UInt = 0u,
)

public data class DFS_INFO_50(
    public var NamespaceMajorVersion: UInt = 0u,
    public var NamespaceMinorVersion: UInt = 0u,
    public var NamespaceCapabilities: ULong = 0uL,
)

public data class DFS_INFO_6(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var PropertyFlags: UInt = 0u,
    public var MetadataSize: UInt = 0u,
    public var NumberOfStorages: UInt = 0u,
    public var Storage: Long = 0L,
)

public data class DFS_INFO_7(public var GenerationGuid: GUID = GUID())

public data class DFS_INFO_8(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var PropertyFlags: UInt = 0u,
    public var MetadataSize: UInt = 0u,
    public var SdLengthReserved: UInt = 0u,
    public var pSecurityDescriptor: Security.PSECURITY_DESCRIPTOR = Security.PSECURITY_DESCRIPTOR(),
    public var NumberOfStorages: UInt = 0u,
)

public data class DFS_INFO_9(
    public var EntryPath: PWSTR = 0L,
    public var Comment: PWSTR = 0L,
    public var State: UInt = 0u,
    public var Timeout: UInt = 0u,
    public var Guid: GUID = GUID(),
    public var PropertyFlags: UInt = 0u,
    public var MetadataSize: UInt = 0u,
    public var SdLengthReserved: UInt = 0u,
    public var pSecurityDescriptor: Security.PSECURITY_DESCRIPTOR = Security.PSECURITY_DESCRIPTOR(),
    public var NumberOfStorages: UInt = 0u,
    public var Storage: Long = 0L,
)

public data class DFS_SITELIST_INFO(public var cSites: UInt = 0u, public var Site: List<DFS_SITENAME_INFO> = List(1) { DFS_SITENAME_INFO() })

public data class DFS_SITENAME_INFO(public var SiteFlags: UInt = 0u, public var SiteName: PWSTR = 0L)

public data class DFS_STORAGE_INFO(
    public var State: UInt = 0u,
    public var ServerName: PWSTR = 0L,
    public var ShareName: PWSTR = 0L,
)

public data class DFS_STORAGE_INFO_0_32(
    public var State: UInt = 0u,
    public var ServerName: UInt = 0u,
    public var ShareName: UInt = 0u,
)

public data class DFS_STORAGE_INFO_1(
    public var State: UInt = 0u,
    public var ServerName: PWSTR = 0L,
    public var ShareName: PWSTR = 0L,
    public var TargetPriority: DFS_TARGET_PRIORITY = DFS_TARGET_PRIORITY(),
)

public data class DFS_SUPPORTED_NAMESPACE_VERSION_INFO(
    public var DomainDfsMajorVersion: UInt = 0u,
    public var DomainDfsMinorVersion: UInt = 0u,
    public var DomainDfsCapabilities: ULong = 0uL,
    public var StandaloneDfsMajorVersion: UInt = 0u,
    public var StandaloneDfsMinorVersion: UInt = 0u,
    public var StandaloneDfsCapabilities: ULong = 0uL,
)

public data class DFS_TARGET_PRIORITY(
    public var TargetPriorityClass: DFS_TARGET_PRIORITY_CLASS = 0,
    public var TargetPriorityRank: UShort = 0u,
    public var Reserved: UShort = 0u,
)
