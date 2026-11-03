@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR

public data class AssemblyBindInfo(
    public var dwAppDomainId: UInt = 0u,
    public var lpReferencedIdentity: PCWSTR = 0L,
    public var lpPostPolicyIdentity: PCWSTR = 0L,
    public var ePolicyLevel: UInt = 0u,
)

public data class BucketParameters(
    public var fInited: BOOL = 0,
    public var pszEventTypeName: UShortArray = UShortArray(255),
    public var pszParams: UShortArray = UShortArray(2550),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BucketParameters) return false
        if (this.fInited != other.fInited) return false
        if (!this.pszEventTypeName.contentEquals(other.pszEventTypeName)) return false
        if (!this.pszParams.contentEquals(other.pszParams)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fInited.hashCode()
        result = 31 * result + this.pszEventTypeName.contentHashCode()
        result = 31 * result + this.pszParams.contentHashCode()
        return result
    }
}

public data class CLR_DEBUGGING_VERSION(
    public var wStructVersion: UShort = 0u,
    public var wMajor: UShort = 0u,
    public var wMinor: UShort = 0u,
    public var wBuild: UShort = 0u,
    public var wRevision: UShort = 0u,
)

public data class COR_GC_STATS(
    public var Flags: UInt = 0u,
    public var ExplicitGCCount: ULong = 0uL,
    public var GenCollectionsTaken: ULongArray = ULongArray(3),
    public var CommittedKBytes: ULong = 0uL,
    public var ReservedKBytes: ULong = 0uL,
    public var Gen0HeapSizeKBytes: ULong = 0uL,
    public var Gen1HeapSizeKBytes: ULong = 0uL,
    public var Gen2HeapSizeKBytes: ULong = 0uL,
    public var LargeObjectHeapSizeKBytes: ULong = 0uL,
    public var KBytesPromotedFromGen0: ULong = 0uL,
    public var KBytesPromotedFromGen1: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COR_GC_STATS) return false
        if (this.Flags != other.Flags) return false
        if (this.ExplicitGCCount != other.ExplicitGCCount) return false
        if (!this.GenCollectionsTaken.contentEquals(other.GenCollectionsTaken)) return false
        if (this.CommittedKBytes != other.CommittedKBytes) return false
        if (this.ReservedKBytes != other.ReservedKBytes) return false
        if (this.Gen0HeapSizeKBytes != other.Gen0HeapSizeKBytes) return false
        if (this.Gen1HeapSizeKBytes != other.Gen1HeapSizeKBytes) return false
        if (this.Gen2HeapSizeKBytes != other.Gen2HeapSizeKBytes) return false
        if (this.LargeObjectHeapSizeKBytes != other.LargeObjectHeapSizeKBytes) return false
        if (this.KBytesPromotedFromGen0 != other.KBytesPromotedFromGen0) return false
        if (this.KBytesPromotedFromGen1 != other.KBytesPromotedFromGen1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.ExplicitGCCount.hashCode()
        result = 31 * result + this.GenCollectionsTaken.contentHashCode()
        result = 31 * result + this.CommittedKBytes.hashCode()
        result = 31 * result + this.ReservedKBytes.hashCode()
        result = 31 * result + this.Gen0HeapSizeKBytes.hashCode()
        result = 31 * result + this.Gen1HeapSizeKBytes.hashCode()
        result = 31 * result + this.Gen2HeapSizeKBytes.hashCode()
        result = 31 * result + this.LargeObjectHeapSizeKBytes.hashCode()
        result = 31 * result + this.KBytesPromotedFromGen0.hashCode()
        result = 31 * result + this.KBytesPromotedFromGen1.hashCode()
        return result
    }
}

public data class COR_GC_THREAD_STATS(public var PerThreadAllocation: ULong = 0uL, public var Flags: UInt = 0u)

public data class CustomDumpItem(public var itemKind: ECustomDumpItemKind = 0, public var Anonymous: CustomDumpItem_0 = CustomDumpItem_0())

public data class CustomDumpItem_0(public var pReserved: ULong = 0uL)

public data class MDAInfo(
    public var lpMDACaption: PCWSTR = 0L,
    public var lpMDAMessage: PCWSTR = 0L,
    public var lpStackTrace: PCWSTR = 0L,
)

public data class ModuleBindInfo(
    public var dwAppDomainId: UInt = 0u,
    public var lpAssemblyIdentity: PCWSTR = 0L,
    public var lpModuleName: PCWSTR = 0L,
)

public data class StackOverflowInfo(public var soType: StackOverflowType = 0, public var pExceptionInfo: Long = 0L)
