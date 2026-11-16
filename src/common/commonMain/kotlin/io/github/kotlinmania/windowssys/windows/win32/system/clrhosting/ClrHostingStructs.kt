@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.clrhosting

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr

public class AssemblyBindInfo internal constructor(
    public var dwAppDomainId: UInt,
    lpReferencedIdentityCtorArg: Pcwstr,
    lpPostPolicyIdentityCtorArg: Pcwstr,
    public var ePolicyLevel: UInt,
) {
    public var lpReferencedIdentity: Pcwstr = lpReferencedIdentityCtorArg
        internal set

    public var lpPostPolicyIdentity: Pcwstr = lpPostPolicyIdentityCtorArg
        internal set

    public constructor() : this(
        dwAppDomainId = 0u,
        lpReferencedIdentityCtorArg = ConstPtr(0L),
        lpPostPolicyIdentityCtorArg = ConstPtr(0L),
        ePolicyLevel = 0u,
    )

    public operator fun component1(): UInt = this.dwAppDomainId

    public operator fun component2(): Pcwstr = this.lpReferencedIdentity

    public operator fun component3(): Pcwstr = this.lpPostPolicyIdentity

    public operator fun component4(): UInt = this.ePolicyLevel

    public fun copy(dwAppDomainId: UInt = this.dwAppDomainId, lpReferencedIdentity: Pcwstr = this.lpReferencedIdentity, lpPostPolicyIdentity: Pcwstr = this.lpPostPolicyIdentity, ePolicyLevel: UInt = this.ePolicyLevel): AssemblyBindInfo = AssemblyBindInfo(dwAppDomainId = dwAppDomainId, lpReferencedIdentityCtorArg = lpReferencedIdentity, lpPostPolicyIdentityCtorArg = lpPostPolicyIdentity, ePolicyLevel = ePolicyLevel)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AssemblyBindInfo) return false
        if (this.dwAppDomainId != other.dwAppDomainId) return false
        if (this.lpReferencedIdentity != other.lpReferencedIdentity) return false
        if (this.lpPostPolicyIdentity != other.lpPostPolicyIdentity) return false
        if (this.ePolicyLevel != other.ePolicyLevel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAppDomainId.hashCode()
        result = 31 * result + this.lpReferencedIdentity.hashCode()
        result = 31 * result + this.lpPostPolicyIdentity.hashCode()
        result = 31 * result + this.ePolicyLevel.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwAppDomainId: UInt = 0u,
            lpReferencedIdentity: Pcwstr = ConstPtr(0L),
            lpPostPolicyIdentity: Pcwstr = ConstPtr(0L),
            ePolicyLevel: UInt = 0u,
        ): AssemblyBindInfo =
            AssemblyBindInfo(
                dwAppDomainId = dwAppDomainId,
                lpReferencedIdentityCtorArg = lpReferencedIdentity,
                lpPostPolicyIdentityCtorArg = lpPostPolicyIdentity,
                ePolicyLevel = ePolicyLevel,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BucketParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BucketParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 5616L
                override fun readNative(addr: Long): BucketParameters =
                    BucketParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2550).toInt())
                        ).readNative(addr + 514L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: BucketParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fInited)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                    ).writeNative(addr + 4L, value.pszEventTypeName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2550).toInt())
                    ).writeNative(addr + 514L, value.pszParams.toList())
                }
            }
    }
}

public data class ClrDebuggingVersion(
    public var wStructVersion: UShort = 0u,
    public var wMajor: UShort = 0u,
    public var wMinor: UShort = 0u,
    public var wBuild: UShort = 0u,
    public var wRevision: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClrDebuggingVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClrDebuggingVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): ClrDebuggingVersion =
                    ClrDebuggingVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClrDebuggingVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wStructVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wBuild)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wRevision)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CorGcStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CorGcStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): CorGcStats =
                    CorGcStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                        ).readNative(addr + 16L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: CorGcStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.explicitGCCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                    ).writeNative(addr + 16L, value.genCollectionsTaken.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.committedKBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.reservedKBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.gen0HeapSizeKBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.gen1HeapSizeKBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.gen2HeapSizeKBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 80L, value.largeObjectHeapSizeKBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 88L, value.kBytesPromotedFromGen0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 96L, value.kBytesPromotedFromGen1)
                }
            }
    }
}

public data class CorGcThreadStats(
    public var perThreadAllocation: ULong = 0uL,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CorGcThreadStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CorGcThreadStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CorGcThreadStats =
                    CorGcThreadStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CorGcThreadStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.perThreadAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class CustomDumpItem(
    public var itemKind: ECustomDumpItemKind = 0,
    public var anonymous: CustomDumpItem0 = CustomDumpItem0(),
)

public data class CustomDumpItem0(
    public var pReserved: Int = 0,
)

public class MDAInfo internal constructor(
    lpMDACaptionCtorArg: Pcwstr,
    lpMDAMessageCtorArg: Pcwstr,
    lpStackTraceCtorArg: Pcwstr,
) {
    public var lpMDACaption: Pcwstr = lpMDACaptionCtorArg
        internal set

    public var lpMDAMessage: Pcwstr = lpMDAMessageCtorArg
        internal set

    public var lpStackTrace: Pcwstr = lpStackTraceCtorArg
        internal set

    public constructor() : this(
        lpMDACaptionCtorArg = ConstPtr(0L),
        lpMDAMessageCtorArg = ConstPtr(0L),
        lpStackTraceCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.lpMDACaption

    public operator fun component2(): Pcwstr = this.lpMDAMessage

    public operator fun component3(): Pcwstr = this.lpStackTrace

    public fun copy(lpMDACaption: Pcwstr = this.lpMDACaption, lpMDAMessage: Pcwstr = this.lpMDAMessage, lpStackTrace: Pcwstr = this.lpStackTrace): MDAInfo = MDAInfo(lpMDACaptionCtorArg = lpMDACaption, lpMDAMessageCtorArg = lpMDAMessage, lpStackTraceCtorArg = lpStackTrace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MDAInfo) return false
        if (this.lpMDACaption != other.lpMDACaption) return false
        if (this.lpMDAMessage != other.lpMDAMessage) return false
        if (this.lpStackTrace != other.lpStackTrace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpMDACaption.hashCode()
        result = 31 * result + this.lpMDAMessage.hashCode()
        result = 31 * result + this.lpStackTrace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpMDACaption: Pcwstr = ConstPtr(0L),
            lpMDAMessage: Pcwstr = ConstPtr(0L),
            lpStackTrace: Pcwstr = ConstPtr(0L),
        ): MDAInfo =
            MDAInfo(
                lpMDACaptionCtorArg = lpMDACaption,
                lpMDAMessageCtorArg = lpMDAMessage,
                lpStackTraceCtorArg = lpStackTrace,
            )
    }
}

public class ModuleBindInfo internal constructor(
    public var dwAppDomainId: UInt,
    lpAssemblyIdentityCtorArg: Pcwstr,
    lpModuleNameCtorArg: Pcwstr,
) {
    public var lpAssemblyIdentity: Pcwstr = lpAssemblyIdentityCtorArg
        internal set

    public var lpModuleName: Pcwstr = lpModuleNameCtorArg
        internal set

    public constructor() : this(
        dwAppDomainId = 0u,
        lpAssemblyIdentityCtorArg = ConstPtr(0L),
        lpModuleNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwAppDomainId

    public operator fun component2(): Pcwstr = this.lpAssemblyIdentity

    public operator fun component3(): Pcwstr = this.lpModuleName

    public fun copy(dwAppDomainId: UInt = this.dwAppDomainId, lpAssemblyIdentity: Pcwstr = this.lpAssemblyIdentity, lpModuleName: Pcwstr = this.lpModuleName): ModuleBindInfo = ModuleBindInfo(dwAppDomainId = dwAppDomainId, lpAssemblyIdentityCtorArg = lpAssemblyIdentity, lpModuleNameCtorArg = lpModuleName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModuleBindInfo) return false
        if (this.dwAppDomainId != other.dwAppDomainId) return false
        if (this.lpAssemblyIdentity != other.lpAssemblyIdentity) return false
        if (this.lpModuleName != other.lpModuleName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAppDomainId.hashCode()
        result = 31 * result + this.lpAssemblyIdentity.hashCode()
        result = 31 * result + this.lpModuleName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwAppDomainId: UInt = 0u,
            lpAssemblyIdentity: Pcwstr = ConstPtr(0L),
            lpModuleName: Pcwstr = ConstPtr(0L),
        ): ModuleBindInfo =
            ModuleBindInfo(
                dwAppDomainId = dwAppDomainId,
                lpAssemblyIdentityCtorArg = lpAssemblyIdentity,
                lpModuleNameCtorArg = lpModuleName,
            )
    }
}

public class StackOverflowInfo internal constructor(
    public var soType: StackOverflowType,
    pExceptionInfoCtorArg: MutPtr,
) {
    public var pExceptionInfo: MutPtr = pExceptionInfoCtorArg
        internal set

    public constructor() : this(
        soType = 0,
        pExceptionInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): StackOverflowType = this.soType

    public operator fun component2(): MutPtr = this.pExceptionInfo

    public fun copy(soType: StackOverflowType = this.soType, pExceptionInfo: MutPtr = this.pExceptionInfo): StackOverflowInfo = StackOverflowInfo(soType = soType, pExceptionInfoCtorArg = pExceptionInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackOverflowInfo) return false
        if (this.soType != other.soType) return false
        if (this.pExceptionInfo != other.pExceptionInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.soType.hashCode()
        result = 31 * result + this.pExceptionInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackOverflowInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackOverflowInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): StackOverflowInfo =
                    StackOverflowInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StackOverflowInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.soType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pExceptionInfo)
                }
            }

        public operator fun invoke(
            soType: StackOverflowType = 0,
            pExceptionInfo: MutPtr = MutPtr(0L),
        ): StackOverflowInfo =
            StackOverflowInfo(
                soType = soType,
                pExceptionInfoCtorArg = pExceptionInfo,
            )
    }
}
