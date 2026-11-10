@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.ExceptionPointers

public data class AssemblyBindInfo(
    public var dwAppDomainId: UInt = 0u,
    public var lpReferencedIdentity: Pcwstr = null,
    public var lpPostPolicyIdentity: Pcwstr = null,
    public var ePolicyLevel: UInt = 0u,
)

public data class BucketParameters(
    public var fInited: Bool = 0,
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

public data class ClrDebuggingVersion(
    public var wStructVersion: UShort = 0u,
    public var wMajor: UShort = 0u,
    public var wMinor: UShort = 0u,
    public var wBuild: UShort = 0u,
    public var wRevision: UShort = 0u,
)

public data class CorGcStats(
    public var flags: UInt = 0u,
    public var explicitGCCount: Int = 0,
    public var genCollectionsTaken: IntArray = IntArray(3),
    public var committedKBytes: Int = 0,
    public var reservedKBytes: Int = 0,
    public var gen0HeapSizeKBytes: Int = 0,
    public var gen1HeapSizeKBytes: Int = 0,
    public var gen2HeapSizeKBytes: Int = 0,
    public var largeObjectHeapSizeKBytes: Int = 0,
    public var kBytesPromotedFromGen0: Int = 0,
    public var kBytesPromotedFromGen1: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CorGcStats) return false
        if (this.flags != other.flags) return false
        if (this.explicitGCCount != other.explicitGCCount) return false
        if (!this.genCollectionsTaken.contentEquals(other.genCollectionsTaken)) return false
        if (this.committedKBytes != other.committedKBytes) return false
        if (this.reservedKBytes != other.reservedKBytes) return false
        if (this.gen0HeapSizeKBytes != other.gen0HeapSizeKBytes) return false
        if (this.gen1HeapSizeKBytes != other.gen1HeapSizeKBytes) return false
        if (this.gen2HeapSizeKBytes != other.gen2HeapSizeKBytes) return false
        if (this.largeObjectHeapSizeKBytes != other.largeObjectHeapSizeKBytes) return false
        if (this.kBytesPromotedFromGen0 != other.kBytesPromotedFromGen0) return false
        if (this.kBytesPromotedFromGen1 != other.kBytesPromotedFromGen1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.explicitGCCount.hashCode()
        result = 31 * result + this.genCollectionsTaken.contentHashCode()
        result = 31 * result + this.committedKBytes.hashCode()
        result = 31 * result + this.reservedKBytes.hashCode()
        result = 31 * result + this.gen0HeapSizeKBytes.hashCode()
        result = 31 * result + this.gen1HeapSizeKBytes.hashCode()
        result = 31 * result + this.gen2HeapSizeKBytes.hashCode()
        result = 31 * result + this.largeObjectHeapSizeKBytes.hashCode()
        result = 31 * result + this.kBytesPromotedFromGen0.hashCode()
        result = 31 * result + this.kBytesPromotedFromGen1.hashCode()
        return result
    }
}

public data class CorGcThreadStats(public var perThreadAllocation: ULong = 0uL, public var flags: UInt = 0u)

public data class CustomDumpItem(public var itemKind: ECustomDumpItemKind = 0, public var anonymous: CustomDumpItem0 = CustomDumpItem0())

public data class CustomDumpItem0(public var pReserved: Int = 0)

public data class MDAInfo(
    public var lpMDACaption: Pcwstr = null,
    public var lpMDAMessage: Pcwstr = null,
    public var lpStackTrace: Pcwstr = null,
)

public data class ModuleBindInfo(
    public var dwAppDomainId: UInt = 0u,
    public var lpAssemblyIdentity: Pcwstr = null,
    public var lpModuleName: Pcwstr = null,
)

public data class StackOverflowInfo(public var soType: StackOverflowType = 0, public var pExceptionInfo: ExceptionPointers? = null)
