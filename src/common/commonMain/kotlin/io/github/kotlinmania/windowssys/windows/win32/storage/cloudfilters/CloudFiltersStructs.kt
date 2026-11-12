@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileBasicInfo
import io.github.kotlinmania.windowssys.windows.win32.system.CorrelationVector

public class CfCallbackInfo internal constructor(
    public var structSize: UInt,
    public var connectionKey: CfConnectionKey,
    callbackContextCtorArg: MutPtr<CVoid>,
    volumeGuidNameCtorArg: Pcwstr,
    volumeDosNameCtorArg: Pcwstr,
    public var volumeSerialNumber: UInt,
    public var syncRootFileId: Long,
    syncRootIdentityCtorArg: ConstPtr<CVoid>,
    public var syncRootIdentityLength: UInt,
    public var fileId: Long,
    public var fileSize: Long,
    fileIdentityCtorArg: ConstPtr<CVoid>,
    public var fileIdentityLength: UInt,
    normalizedPathCtorArg: Pcwstr,
    public var transferKey: Long,
    public var priorityHint: UByte,
    correlationVectorCtorArg: MutPtr<CorrelationVector.CorrelationVector>,
    processInfoCtorArg: MutPtr<CfProcessInfo>,
    public var requestKey: Long,
) {
    public var callbackContext: MutPtr<CVoid> = callbackContextCtorArg
        internal set

    public var volumeGuidName: Pcwstr = volumeGuidNameCtorArg
        internal set

    public var volumeDosName: Pcwstr = volumeDosNameCtorArg
        internal set

    public var syncRootIdentity: ConstPtr<CVoid> = syncRootIdentityCtorArg
        internal set

    public var fileIdentity: ConstPtr<CVoid> = fileIdentityCtorArg
        internal set

    public var normalizedPath: Pcwstr = normalizedPathCtorArg
        internal set

    public var correlationVector: MutPtr<CorrelationVector.CorrelationVector> = correlationVectorCtorArg
        internal set

    public var processInfo: MutPtr<CfProcessInfo> = processInfoCtorArg
        internal set

    public constructor() : this(
        structSize = 0u,
        connectionKey = 0L,
        callbackContextCtorArg = MutPtr(0L),
        volumeGuidNameCtorArg = ConstPtr(0L),
        volumeDosNameCtorArg = ConstPtr(0L),
        volumeSerialNumber = 0u,
        syncRootFileId = 0L,
        syncRootIdentityCtorArg = ConstPtr(0L),
        syncRootIdentityLength = 0u,
        fileId = 0L,
        fileSize = 0L,
        fileIdentityCtorArg = ConstPtr(0L),
        fileIdentityLength = 0u,
        normalizedPathCtorArg = ConstPtr(0L),
        transferKey = 0L,
        priorityHint = 0u,
        correlationVectorCtorArg = MutPtr(0L),
        processInfoCtorArg = MutPtr(0L),
        requestKey = 0L,
    )

    public companion object {
        public operator fun invoke(
            structSize: UInt = 0u,
            connectionKey: CfConnectionKey = 0L,
            callbackContext: MutPtr<CVoid> = MutPtr(0L),
            volumeGuidName: Pcwstr = ConstPtr(0L),
            volumeDosName: Pcwstr = ConstPtr(0L),
            volumeSerialNumber: UInt = 0u,
            syncRootFileId: Long = 0L,
            syncRootIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            syncRootIdentityLength: UInt = 0u,
            fileId: Long = 0L,
            fileSize: Long = 0L,
            fileIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            fileIdentityLength: UInt = 0u,
            normalizedPath: Pcwstr = ConstPtr(0L),
            transferKey: Long = 0L,
            priorityHint: UByte = 0u,
            correlationVector: MutPtr<CorrelationVector.CorrelationVector> = MutPtr(0L),
            processInfo: MutPtr<CfProcessInfo> = MutPtr(0L),
            requestKey: Long = 0L,
        ): CfCallbackInfo =
            CfCallbackInfo(
                structSize = structSize,
                connectionKey = connectionKey,
                callbackContextCtorArg = callbackContext,
                volumeGuidNameCtorArg = volumeGuidName,
                volumeDosNameCtorArg = volumeDosName,
                volumeSerialNumber = volumeSerialNumber,
                syncRootFileId = syncRootFileId,
                syncRootIdentityCtorArg = syncRootIdentity,
                syncRootIdentityLength = syncRootIdentityLength,
                fileId = fileId,
                fileSize = fileSize,
                fileIdentityCtorArg = fileIdentity,
                fileIdentityLength = fileIdentityLength,
                normalizedPathCtorArg = normalizedPath,
                transferKey = transferKey,
                priorityHint = priorityHint,
                correlationVectorCtorArg = correlationVector,
                processInfoCtorArg = processInfo,
                requestKey = requestKey,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters0000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters0000> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CfCallbackParameters0000 =
                    CfCallbackParameters0000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters0000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class CfCallbackParameters05(
    public var flags: CfCallbackCloseCompletionFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters05> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CfCallbackParameters05 =
                    CfCallbackParameters05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class CfCallbackParameters07(
    public var flags: CfCallbackDehydrateCompletionFlags = 0,
    public var reason: CfCallbackDehydrationReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters07> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CfCallbackParameters07 =
                    CfCallbackParameters07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.reason)
                }
            }
    }
}

public data class CfCallbackParameters06(
    public var flags: CfCallbackDehydrateFlags = 0,
    public var reason: CfCallbackDehydrationReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters06> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CfCallbackParameters06 =
                    CfCallbackParameters06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.reason)
                }
            }
    }
}

public data class CfCallbackParameters09(
    public var flags: CfCallbackDeleteCompletionFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters09> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters09> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CfCallbackParameters09 =
                    CfCallbackParameters09(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters09) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class CfCallbackParameters08(
    public var flags: CfCallbackDeleteFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters08> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters08> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CfCallbackParameters08 =
                    CfCallbackParameters08(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters08) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class CfCallbackParameters01(
    public var flags: CfCallbackFetchDataFlags = 0,
    public var requiredFileOffset: Long = 0L,
    public var requiredLength: Long = 0L,
    public var optionalFileOffset: Long = 0L,
    public var optionalLength: Long = 0L,
    public var lastDehydrationTime: Long = 0L,
    public var lastDehydrationReason: CfCallbackDehydrationReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CfCallbackParameters01 =
                    CfCallbackParameters01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.requiredFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.requiredLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.optionalFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.optionalLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.lastDehydrationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.lastDehydrationReason)
                }
            }
    }
}

public class CfCallbackParameters03 internal constructor(
    public var flags: CfCallbackFetchPlaceholdersFlags,
    patternCtorArg: Pcwstr,
) {
    public var pattern: Pcwstr = patternCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        patternCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): CfCallbackFetchPlaceholdersFlags = this.flags

    public operator fun component2(): Pcwstr = this.pattern

    public fun copy(flags: CfCallbackFetchPlaceholdersFlags = this.flags, pattern: Pcwstr = this.pattern): CfCallbackParameters03 = CfCallbackParameters03(flags = flags, patternCtorArg = pattern)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfCallbackParameters03) return false
        if (this.flags != other.flags) return false
        if (this.pattern != other.pattern) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pattern.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CfCallbackFetchPlaceholdersFlags = 0,
            pattern: Pcwstr = ConstPtr(0L),
        ): CfCallbackParameters03 =
            CfCallbackParameters03(
                flags = flags,
                patternCtorArg = pattern,
            )
    }
}

public data class CfCallbackParameters04(
    public var flags: CfCallbackOpenCompletionFlags = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters04> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CfCallbackParameters04 =
                    CfCallbackParameters04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                }
            }
    }
}

public class CfCallbackParameters011 internal constructor(
    public var flags: CfCallbackRenameCompletionFlags,
    sourcePathCtorArg: Pcwstr,
) {
    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        sourcePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): CfCallbackRenameCompletionFlags = this.flags

    public operator fun component2(): Pcwstr = this.sourcePath

    public fun copy(flags: CfCallbackRenameCompletionFlags = this.flags, sourcePath: Pcwstr = this.sourcePath): CfCallbackParameters011 = CfCallbackParameters011(flags = flags, sourcePathCtorArg = sourcePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfCallbackParameters011) return false
        if (this.flags != other.flags) return false
        if (this.sourcePath != other.sourcePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CfCallbackRenameCompletionFlags = 0,
            sourcePath: Pcwstr = ConstPtr(0L),
        ): CfCallbackParameters011 =
            CfCallbackParameters011(
                flags = flags,
                sourcePathCtorArg = sourcePath,
            )
    }
}

public class CfCallbackParameters010 internal constructor(
    public var flags: CfCallbackRenameFlags,
    targetPathCtorArg: Pcwstr,
) {
    public var targetPath: Pcwstr = targetPathCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        targetPathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): CfCallbackRenameFlags = this.flags

    public operator fun component2(): Pcwstr = this.targetPath

    public fun copy(flags: CfCallbackRenameFlags = this.flags, targetPath: Pcwstr = this.targetPath): CfCallbackParameters010 = CfCallbackParameters010(flags = flags, targetPathCtorArg = targetPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfCallbackParameters010) return false
        if (this.flags != other.flags) return false
        if (this.targetPath != other.targetPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.targetPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CfCallbackRenameFlags = 0,
            targetPath: Pcwstr = ConstPtr(0L),
        ): CfCallbackParameters010 =
            CfCallbackParameters010(
                flags = flags,
                targetPathCtorArg = targetPath,
            )
    }
}

public data class CfCallbackParameters02(
    public var flags: CfCallbackValidateDataFlags = 0,
    public var requiredFileOffset: Long = 0L,
    public var requiredLength: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfCallbackParameters02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CfCallbackParameters02 =
                    CfCallbackParameters02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CfCallbackParameters02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.requiredFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.requiredLength)
                }
            }
    }
}

public data class CfCallbackRegistration(
    public var type: CfCallbackType = 0,
    public var callback: CfCallback = null,
)

public data class CfFileRange(
    public var startingOffset: Long = 0L,
    public var length: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfFileRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfFileRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CfFileRange =
                    CfFileRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CfFileRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                }
            }
    }
}

public data class CfFsMetadata(
    public var basicInfo: FileBasicInfo = FileBasicInfo(),
    public var fileSize: Long = 0L,
)

public data class CfHydrationPolicy(
    public var primary: CfHydrationPolicyPrimary = 0u,
    public var modifier: CfHydrationPolicyModifier = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfHydrationPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfHydrationPolicy> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CfHydrationPolicy =
                    CfHydrationPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CfHydrationPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.primary)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modifier)
                }
            }
    }
}

public class CfOperationInfo internal constructor(
    public var structSize: UInt,
    public var type: CfOperationType,
    public var connectionKey: CfConnectionKey,
    public var transferKey: Long,
    correlationVectorCtorArg: ConstPtr<CorrelationVector.CorrelationVector>,
    syncStatusCtorArg: ConstPtr<CfSyncStatus>,
    public var requestKey: Long,
) {
    public var correlationVector: ConstPtr<CorrelationVector.CorrelationVector> = correlationVectorCtorArg
        internal set

    public var syncStatus: ConstPtr<CfSyncStatus> = syncStatusCtorArg
        internal set

    public constructor() : this(
        structSize = 0u,
        type = 0,
        connectionKey = 0L,
        transferKey = 0L,
        correlationVectorCtorArg = ConstPtr(0L),
        syncStatusCtorArg = ConstPtr(0L),
        requestKey = 0L,
    )

    public operator fun component1(): UInt = this.structSize

    public operator fun component2(): CfOperationType = this.type

    public operator fun component3(): CfConnectionKey = this.connectionKey

    public operator fun component4(): Long = this.transferKey

    public operator fun component5(): ConstPtr<CorrelationVector.CorrelationVector> = this.correlationVector

    public operator fun component6(): ConstPtr<CfSyncStatus> = this.syncStatus

    public operator fun component7(): Long = this.requestKey

    public fun copy(structSize: UInt = this.structSize, type: CfOperationType = this.type, connectionKey: CfConnectionKey = this.connectionKey, transferKey: Long = this.transferKey, correlationVector: ConstPtr<CorrelationVector.CorrelationVector> = this.correlationVector, syncStatus: ConstPtr<CfSyncStatus> = this.syncStatus, requestKey: Long = this.requestKey): CfOperationInfo = CfOperationInfo(structSize = structSize, type = type, connectionKey = connectionKey, transferKey = transferKey, correlationVectorCtorArg = correlationVector, syncStatusCtorArg = syncStatus, requestKey = requestKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfOperationInfo) return false
        if (this.structSize != other.structSize) return false
        if (this.type != other.type) return false
        if (this.connectionKey != other.connectionKey) return false
        if (this.transferKey != other.transferKey) return false
        if (this.correlationVector != other.correlationVector) return false
        if (this.syncStatus != other.syncStatus) return false
        if (this.requestKey != other.requestKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.structSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.connectionKey.hashCode()
        result = 31 * result + this.transferKey.hashCode()
        result = 31 * result + this.correlationVector.hashCode()
        result = 31 * result + this.syncStatus.hashCode()
        result = 31 * result + this.requestKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): CfOperationInfo =
                    CfOperationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CorrelationVector.CorrelationVector>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CfSyncStatus>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: CfOperationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.structSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.connectionKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.transferKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CorrelationVector.CorrelationVector>(64)
                    ).writeNative(addr + 24L, value.correlationVector)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CfSyncStatus>(64)
                    ).writeNative(addr + 32L, value.syncStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.requestKey)
                }
            }

        public operator fun invoke(
            structSize: UInt = 0u,
            type: CfOperationType = 0,
            connectionKey: CfConnectionKey = 0L,
            transferKey: Long = 0L,
            correlationVector: ConstPtr<CorrelationVector.CorrelationVector> = ConstPtr(0L),
            syncStatus: ConstPtr<CfSyncStatus> = ConstPtr(0L),
            requestKey: Long = 0L,
        ): CfOperationInfo =
            CfOperationInfo(
                structSize = structSize,
                type = type,
                connectionKey = connectionKey,
                transferKey = transferKey,
                correlationVectorCtorArg = correlationVector,
                syncStatusCtorArg = syncStatus,
                requestKey = requestKey,
            )
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CfOperationParameters02 =
                    CfOperationParameters02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.completionStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.length)
                }
            }
    }
}

public class CfOperationParameters05 internal constructor(
    public var flags: CfOperationAckDehydrateFlags,
    public var completionStatus: Ntstatus,
    fileIdentityCtorArg: ConstPtr<CVoid>,
    public var fileIdentityLength: UInt,
) {
    public var fileIdentity: ConstPtr<CVoid> = fileIdentityCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        completionStatus = 0,
        fileIdentityCtorArg = ConstPtr(0L),
        fileIdentityLength = 0u,
    )

    public operator fun component1(): CfOperationAckDehydrateFlags = this.flags

    public operator fun component2(): Ntstatus = this.completionStatus

    public operator fun component3(): ConstPtr<CVoid> = this.fileIdentity

    public operator fun component4(): UInt = this.fileIdentityLength

    public fun copy(flags: CfOperationAckDehydrateFlags = this.flags, completionStatus: Ntstatus = this.completionStatus, fileIdentity: ConstPtr<CVoid> = this.fileIdentity, fileIdentityLength: UInt = this.fileIdentityLength): CfOperationParameters05 = CfOperationParameters05(flags = flags, completionStatus = completionStatus, fileIdentityCtorArg = fileIdentity, fileIdentityLength = fileIdentityLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfOperationParameters05) return false
        if (this.flags != other.flags) return false
        if (this.completionStatus != other.completionStatus) return false
        if (this.fileIdentity != other.fileIdentity) return false
        if (this.fileIdentityLength != other.fileIdentityLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.completionStatus.hashCode()
        result = 31 * result + this.fileIdentity.hashCode()
        result = 31 * result + this.fileIdentityLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters05> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CfOperationParameters05 =
                    CfOperationParameters05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.completionStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.fileIdentity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fileIdentityLength)
                }
            }

        public operator fun invoke(
            flags: CfOperationAckDehydrateFlags = 0,
            completionStatus: Ntstatus = 0,
            fileIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            fileIdentityLength: UInt = 0u,
        ): CfOperationParameters05 =
            CfOperationParameters05(
                flags = flags,
                completionStatus = completionStatus,
                fileIdentityCtorArg = fileIdentity,
                fileIdentityLength = fileIdentityLength,
            )
    }
}

public data class CfOperationParameters07(
    public var flags: CfOperationAckDeleteFlags = 0,
    public var completionStatus: Ntstatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters07> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CfOperationParameters07 =
                    CfOperationParameters07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.completionStatus)
                }
            }
    }
}

public data class CfOperationParameters06(
    public var flags: CfOperationAckRenameFlags = 0,
    public var completionStatus: Ntstatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters06> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CfOperationParameters06 =
                    CfOperationParameters06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.completionStatus)
                }
            }
    }
}

public class CfOperationParameters03 internal constructor(
    public var flags: CfOperationRestartHydrationFlags,
    fsMetadataCtorArg: ConstPtr<CfFsMetadata>,
    fileIdentityCtorArg: ConstPtr<CVoid>,
    public var fileIdentityLength: UInt,
) {
    public var fsMetadata: ConstPtr<CfFsMetadata> = fsMetadataCtorArg
        internal set

    public var fileIdentity: ConstPtr<CVoid> = fileIdentityCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        fsMetadataCtorArg = ConstPtr(0L),
        fileIdentityCtorArg = ConstPtr(0L),
        fileIdentityLength = 0u,
    )

    public operator fun component1(): CfOperationRestartHydrationFlags = this.flags

    public operator fun component2(): ConstPtr<CfFsMetadata> = this.fsMetadata

    public operator fun component3(): ConstPtr<CVoid> = this.fileIdentity

    public operator fun component4(): UInt = this.fileIdentityLength

    public fun copy(flags: CfOperationRestartHydrationFlags = this.flags, fsMetadata: ConstPtr<CfFsMetadata> = this.fsMetadata, fileIdentity: ConstPtr<CVoid> = this.fileIdentity, fileIdentityLength: UInt = this.fileIdentityLength): CfOperationParameters03 = CfOperationParameters03(flags = flags, fsMetadataCtorArg = fsMetadata, fileIdentityCtorArg = fileIdentity, fileIdentityLength = fileIdentityLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfOperationParameters03) return false
        if (this.flags != other.flags) return false
        if (this.fsMetadata != other.fsMetadata) return false
        if (this.fileIdentity != other.fileIdentity) return false
        if (this.fileIdentityLength != other.fileIdentityLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.fsMetadata.hashCode()
        result = 31 * result + this.fileIdentity.hashCode()
        result = 31 * result + this.fileIdentityLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters03> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CfOperationParameters03 =
                    CfOperationParameters03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CfFsMetadata>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CfFsMetadata>(64)
                    ).writeNative(addr + 8L, value.fsMetadata)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.fileIdentity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fileIdentityLength)
                }
            }

        public operator fun invoke(
            flags: CfOperationRestartHydrationFlags = 0,
            fsMetadata: ConstPtr<CfFsMetadata> = ConstPtr(0L),
            fileIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            fileIdentityLength: UInt = 0u,
        ): CfOperationParameters03 =
            CfOperationParameters03(
                flags = flags,
                fsMetadataCtorArg = fsMetadata,
                fileIdentityCtorArg = fileIdentity,
                fileIdentityLength = fileIdentityLength,
            )
    }
}

public class CfOperationParameters01 internal constructor(
    public var flags: CfOperationRetrieveDataFlags,
    bufferCtorArg: MutPtr<CVoid>,
    public var offset: Long,
    public var length: Long,
    public var returnedLength: Long,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        bufferCtorArg = MutPtr(0L),
        offset = 0L,
        length = 0L,
        returnedLength = 0L,
    )

    public operator fun component1(): CfOperationRetrieveDataFlags = this.flags

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public operator fun component3(): Long = this.offset

    public operator fun component4(): Long = this.length

    public operator fun component5(): Long = this.returnedLength

    public fun copy(flags: CfOperationRetrieveDataFlags = this.flags, buffer: MutPtr<CVoid> = this.buffer, offset: Long = this.offset, length: Long = this.length, returnedLength: Long = this.returnedLength): CfOperationParameters01 = CfOperationParameters01(flags = flags, bufferCtorArg = buffer, offset = offset, length = length, returnedLength = returnedLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfOperationParameters01) return false
        if (this.flags != other.flags) return false
        if (this.buffer != other.buffer) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        if (this.returnedLength != other.returnedLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.returnedLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CfOperationParameters01 =
                    CfOperationParameters01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.returnedLength)
                }
            }

        public operator fun invoke(
            flags: CfOperationRetrieveDataFlags = 0,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            offset: Long = 0L,
            length: Long = 0L,
            returnedLength: Long = 0L,
        ): CfOperationParameters01 =
            CfOperationParameters01(
                flags = flags,
                bufferCtorArg = buffer,
                offset = offset,
                length = length,
                returnedLength = returnedLength,
            )
    }
}

public class CfOperationParameters00 internal constructor(
    public var flags: CfOperationTransferDataFlags,
    public var completionStatus: Ntstatus,
    bufferCtorArg: ConstPtr<CVoid>,
    public var offset: Long,
    public var length: Long,
) {
    public var buffer: ConstPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        completionStatus = 0,
        bufferCtorArg = ConstPtr(0L),
        offset = 0L,
        length = 0L,
    )

    public operator fun component1(): CfOperationTransferDataFlags = this.flags

    public operator fun component2(): Ntstatus = this.completionStatus

    public operator fun component3(): ConstPtr<CVoid> = this.buffer

    public operator fun component4(): Long = this.offset

    public operator fun component5(): Long = this.length

    public fun copy(flags: CfOperationTransferDataFlags = this.flags, completionStatus: Ntstatus = this.completionStatus, buffer: ConstPtr<CVoid> = this.buffer, offset: Long = this.offset, length: Long = this.length): CfOperationParameters00 = CfOperationParameters00(flags = flags, completionStatus = completionStatus, bufferCtorArg = buffer, offset = offset, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfOperationParameters00) return false
        if (this.flags != other.flags) return false
        if (this.completionStatus != other.completionStatus) return false
        if (this.buffer != other.buffer) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.completionStatus.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CfOperationParameters00 =
                    CfOperationParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.completionStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.length)
                }
            }

        public operator fun invoke(
            flags: CfOperationTransferDataFlags = 0,
            completionStatus: Ntstatus = 0,
            buffer: ConstPtr<CVoid> = ConstPtr(0L),
            offset: Long = 0L,
            length: Long = 0L,
        ): CfOperationParameters00 =
            CfOperationParameters00(
                flags = flags,
                completionStatus = completionStatus,
                bufferCtorArg = buffer,
                offset = offset,
                length = length,
            )
    }
}

public class CfOperationParameters04 internal constructor(
    public var flags: CfOperationTransferPlaceholdersFlags,
    public var completionStatus: Ntstatus,
    public var placeholderTotalCount: Long,
    placeholderArrayCtorArg: MutPtr<CfPlaceholderCreateInfo>,
    public var placeholderCount: UInt,
    public var entriesProcessed: UInt,
) {
    public var placeholderArray: MutPtr<CfPlaceholderCreateInfo> = placeholderArrayCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        completionStatus = 0,
        placeholderTotalCount = 0L,
        placeholderArrayCtorArg = MutPtr(0L),
        placeholderCount = 0u,
        entriesProcessed = 0u,
    )

    public operator fun component1(): CfOperationTransferPlaceholdersFlags = this.flags

    public operator fun component2(): Ntstatus = this.completionStatus

    public operator fun component3(): Long = this.placeholderTotalCount

    public operator fun component4(): MutPtr<CfPlaceholderCreateInfo> = this.placeholderArray

    public operator fun component5(): UInt = this.placeholderCount

    public operator fun component6(): UInt = this.entriesProcessed

    public fun copy(flags: CfOperationTransferPlaceholdersFlags = this.flags, completionStatus: Ntstatus = this.completionStatus, placeholderTotalCount: Long = this.placeholderTotalCount, placeholderArray: MutPtr<CfPlaceholderCreateInfo> = this.placeholderArray, placeholderCount: UInt = this.placeholderCount, entriesProcessed: UInt = this.entriesProcessed): CfOperationParameters04 = CfOperationParameters04(flags = flags, completionStatus = completionStatus, placeholderTotalCount = placeholderTotalCount, placeholderArrayCtorArg = placeholderArray, placeholderCount = placeholderCount, entriesProcessed = entriesProcessed)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfOperationParameters04) return false
        if (this.flags != other.flags) return false
        if (this.completionStatus != other.completionStatus) return false
        if (this.placeholderTotalCount != other.placeholderTotalCount) return false
        if (this.placeholderArray != other.placeholderArray) return false
        if (this.placeholderCount != other.placeholderCount) return false
        if (this.entriesProcessed != other.entriesProcessed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.completionStatus.hashCode()
        result = 31 * result + this.placeholderTotalCount.hashCode()
        result = 31 * result + this.placeholderArray.hashCode()
        result = 31 * result + this.placeholderCount.hashCode()
        result = 31 * result + this.entriesProcessed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfOperationParameters04> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CfOperationParameters04 =
                    CfOperationParameters04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CfPlaceholderCreateInfo>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: CfOperationParameters04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.completionStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.placeholderTotalCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CfPlaceholderCreateInfo>(64)
                    ).writeNative(addr + 16L, value.placeholderArray)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.placeholderCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.entriesProcessed)
                }
            }

        public operator fun invoke(
            flags: CfOperationTransferPlaceholdersFlags = 0,
            completionStatus: Ntstatus = 0,
            placeholderTotalCount: Long = 0L,
            placeholderArray: MutPtr<CfPlaceholderCreateInfo> = MutPtr(0L),
            placeholderCount: UInt = 0u,
            entriesProcessed: UInt = 0u,
        ): CfOperationParameters04 =
            CfOperationParameters04(
                flags = flags,
                completionStatus = completionStatus,
                placeholderTotalCount = placeholderTotalCount,
                placeholderArrayCtorArg = placeholderArray,
                placeholderCount = placeholderCount,
                entriesProcessed = entriesProcessed,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPlaceholderBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPlaceholderBasicInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CfPlaceholderBasicInfo =
                    CfPlaceholderBasicInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CfPlaceholderBasicInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pinState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.inSyncState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.syncRootFileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fileIdentityLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 28L, value.fileIdentity.toList())
                }
            }
    }
}

public class CfPlaceholderCreateInfo internal constructor(
    relativeFileNameCtorArg: Pcwstr,
    public var fsMetadata: CfFsMetadata,
    fileIdentityCtorArg: ConstPtr<CVoid>,
    public var fileIdentityLength: UInt,
    public var flags: CfPlaceholderCreateFlags,
    public var result: Hresult,
    public var createUsn: Long,
) {
    public var relativeFileName: Pcwstr = relativeFileNameCtorArg
        internal set

    public var fileIdentity: ConstPtr<CVoid> = fileIdentityCtorArg
        internal set

    public constructor() : this(
        relativeFileNameCtorArg = ConstPtr(0L),
        fsMetadata = CfFsMetadata(),
        fileIdentityCtorArg = ConstPtr(0L),
        fileIdentityLength = 0u,
        flags = 0,
        result = 0,
        createUsn = 0L,
    )

    public operator fun component1(): Pcwstr = this.relativeFileName

    public operator fun component2(): CfFsMetadata = this.fsMetadata

    public operator fun component3(): ConstPtr<CVoid> = this.fileIdentity

    public operator fun component4(): UInt = this.fileIdentityLength

    public operator fun component5(): CfPlaceholderCreateFlags = this.flags

    public operator fun component6(): Hresult = this.result

    public operator fun component7(): Long = this.createUsn

    public fun copy(relativeFileName: Pcwstr = this.relativeFileName, fsMetadata: CfFsMetadata = this.fsMetadata, fileIdentity: ConstPtr<CVoid> = this.fileIdentity, fileIdentityLength: UInt = this.fileIdentityLength, flags: CfPlaceholderCreateFlags = this.flags, result: Hresult = this.result, createUsn: Long = this.createUsn): CfPlaceholderCreateInfo = CfPlaceholderCreateInfo(relativeFileNameCtorArg = relativeFileName, fsMetadata = fsMetadata, fileIdentityCtorArg = fileIdentity, fileIdentityLength = fileIdentityLength, flags = flags, result = result, createUsn = createUsn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfPlaceholderCreateInfo) return false
        if (this.relativeFileName != other.relativeFileName) return false
        if (this.fsMetadata != other.fsMetadata) return false
        if (this.fileIdentity != other.fileIdentity) return false
        if (this.fileIdentityLength != other.fileIdentityLength) return false
        if (this.flags != other.flags) return false
        if (this.result != other.result) return false
        if (this.createUsn != other.createUsn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.relativeFileName.hashCode()
        result = 31 * result + this.fsMetadata.hashCode()
        result = 31 * result + this.fileIdentity.hashCode()
        result = 31 * result + this.fileIdentityLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.createUsn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            relativeFileName: Pcwstr = ConstPtr(0L),
            fsMetadata: CfFsMetadata = CfFsMetadata(),
            fileIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            fileIdentityLength: UInt = 0u,
            flags: CfPlaceholderCreateFlags = 0,
            result: Hresult = 0,
            createUsn: Long = 0L,
        ): CfPlaceholderCreateInfo =
            CfPlaceholderCreateInfo(
                relativeFileNameCtorArg = relativeFileName,
                fsMetadata = fsMetadata,
                fileIdentityCtorArg = fileIdentity,
                fileIdentityLength = fileIdentityLength,
                flags = flags,
                result = result,
                createUsn = createUsn,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPlaceholderStandardInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPlaceholderStandardInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): CfPlaceholderStandardInfo =
                    CfPlaceholderStandardInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 60L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CfPlaceholderStandardInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.onDiskDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.validatedDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.modifiedDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.propertiesSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.pinState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.inSyncState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.fileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.syncRootFileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileIdentityLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 60L, value.fileIdentity.toList())
                }
            }
    }
}

public data class CfPlatformInfo(
    public var buildNumber: UInt = 0u,
    public var revisionNumber: UInt = 0u,
    public var integrationNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPlatformInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPlatformInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): CfPlatformInfo =
                    CfPlatformInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CfPlatformInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.buildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.revisionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.integrationNumber)
                }
            }
    }
}

public data class CfPopulationPolicy(
    public var primary: CfPopulationPolicyPrimary = 0u,
    public var modifier: CfPopulationPolicyModifier = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPopulationPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfPopulationPolicy> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CfPopulationPolicy =
                    CfPopulationPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CfPopulationPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.primary)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modifier)
                }
            }
    }
}

public class CfProcessInfo internal constructor(
    public var structSize: UInt,
    public var processId: UInt,
    imagePathCtorArg: Pcwstr,
    packageNameCtorArg: Pcwstr,
    applicationIdCtorArg: Pcwstr,
    commandLineCtorArg: Pcwstr,
    public var sessionId: UInt,
) {
    public var imagePath: Pcwstr = imagePathCtorArg
        internal set

    public var packageName: Pcwstr = packageNameCtorArg
        internal set

    public var applicationId: Pcwstr = applicationIdCtorArg
        internal set

    public var commandLine: Pcwstr = commandLineCtorArg
        internal set

    public constructor() : this(
        structSize = 0u,
        processId = 0u,
        imagePathCtorArg = ConstPtr(0L),
        packageNameCtorArg = ConstPtr(0L),
        applicationIdCtorArg = ConstPtr(0L),
        commandLineCtorArg = ConstPtr(0L),
        sessionId = 0u,
    )

    public operator fun component1(): UInt = this.structSize

    public operator fun component2(): UInt = this.processId

    public operator fun component3(): Pcwstr = this.imagePath

    public operator fun component4(): Pcwstr = this.packageName

    public operator fun component5(): Pcwstr = this.applicationId

    public operator fun component6(): Pcwstr = this.commandLine

    public operator fun component7(): UInt = this.sessionId

    public fun copy(structSize: UInt = this.structSize, processId: UInt = this.processId, imagePath: Pcwstr = this.imagePath, packageName: Pcwstr = this.packageName, applicationId: Pcwstr = this.applicationId, commandLine: Pcwstr = this.commandLine, sessionId: UInt = this.sessionId): CfProcessInfo = CfProcessInfo(structSize = structSize, processId = processId, imagePathCtorArg = imagePath, packageNameCtorArg = packageName, applicationIdCtorArg = applicationId, commandLineCtorArg = commandLine, sessionId = sessionId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfProcessInfo) return false
        if (this.structSize != other.structSize) return false
        if (this.processId != other.processId) return false
        if (this.imagePath != other.imagePath) return false
        if (this.packageName != other.packageName) return false
        if (this.applicationId != other.applicationId) return false
        if (this.commandLine != other.commandLine) return false
        if (this.sessionId != other.sessionId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.structSize.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.imagePath.hashCode()
        result = 31 * result + this.packageName.hashCode()
        result = 31 * result + this.applicationId.hashCode()
        result = 31 * result + this.commandLine.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            structSize: UInt = 0u,
            processId: UInt = 0u,
            imagePath: Pcwstr = ConstPtr(0L),
            packageName: Pcwstr = ConstPtr(0L),
            applicationId: Pcwstr = ConstPtr(0L),
            commandLine: Pcwstr = ConstPtr(0L),
            sessionId: UInt = 0u,
        ): CfProcessInfo =
            CfProcessInfo(
                structSize = structSize,
                processId = processId,
                imagePathCtorArg = imagePath,
                packageNameCtorArg = packageName,
                applicationIdCtorArg = applicationId,
                commandLineCtorArg = commandLine,
                sessionId = sessionId,
            )
    }
}

public data class CfSyncPolicies(
    public var structSize: UInt = 0u,
    public var hydration: CfHydrationPolicy = CfHydrationPolicy(),
    public var population: CfPopulationPolicy = CfPopulationPolicy(),
    public var inSync: CfInsyncPolicy = 0u,
    public var hardLink: CfHardlinkPolicy = 0,
    public var placeholderManagement: CfPlaceholderManagementPolicy = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncPolicies> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncPolicies> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CfSyncPolicies =
                    CfSyncPolicies(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (CfHydrationPolicy.typeLayout()).readNative(addr + 4L),
                        (CfPopulationPolicy.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CfSyncPolicies) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.structSize)
                    (CfHydrationPolicy.typeLayout()).writeNative(addr + 4L, value.hydration)
                    (CfPopulationPolicy.typeLayout()).writeNative(addr + 8L, value.population)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.inSync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hardLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.placeholderManagement)
                }
            }
    }
}

public class CfSyncRegistration internal constructor(
    public var structSize: UInt,
    providerNameCtorArg: Pcwstr,
    providerVersionCtorArg: Pcwstr,
    syncRootIdentityCtorArg: ConstPtr<CVoid>,
    public var syncRootIdentityLength: UInt,
    fileIdentityCtorArg: ConstPtr<CVoid>,
    public var fileIdentityLength: UInt,
    public var providerId: Guid,
) {
    public var providerName: Pcwstr = providerNameCtorArg
        internal set

    public var providerVersion: Pcwstr = providerVersionCtorArg
        internal set

    public var syncRootIdentity: ConstPtr<CVoid> = syncRootIdentityCtorArg
        internal set

    public var fileIdentity: ConstPtr<CVoid> = fileIdentityCtorArg
        internal set

    public constructor() : this(
        structSize = 0u,
        providerNameCtorArg = ConstPtr(0L),
        providerVersionCtorArg = ConstPtr(0L),
        syncRootIdentityCtorArg = ConstPtr(0L),
        syncRootIdentityLength = 0u,
        fileIdentityCtorArg = ConstPtr(0L),
        fileIdentityLength = 0u,
        providerId = Guid(),
    )

    public operator fun component1(): UInt = this.structSize

    public operator fun component2(): Pcwstr = this.providerName

    public operator fun component3(): Pcwstr = this.providerVersion

    public operator fun component4(): ConstPtr<CVoid> = this.syncRootIdentity

    public operator fun component5(): UInt = this.syncRootIdentityLength

    public operator fun component6(): ConstPtr<CVoid> = this.fileIdentity

    public operator fun component7(): UInt = this.fileIdentityLength

    public operator fun component8(): Guid = this.providerId

    public fun copy(structSize: UInt = this.structSize, providerName: Pcwstr = this.providerName, providerVersion: Pcwstr = this.providerVersion, syncRootIdentity: ConstPtr<CVoid> = this.syncRootIdentity, syncRootIdentityLength: UInt = this.syncRootIdentityLength, fileIdentity: ConstPtr<CVoid> = this.fileIdentity, fileIdentityLength: UInt = this.fileIdentityLength, providerId: Guid = this.providerId): CfSyncRegistration = CfSyncRegistration(structSize = structSize, providerNameCtorArg = providerName, providerVersionCtorArg = providerVersion, syncRootIdentityCtorArg = syncRootIdentity, syncRootIdentityLength = syncRootIdentityLength, fileIdentityCtorArg = fileIdentity, fileIdentityLength = fileIdentityLength, providerId = providerId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CfSyncRegistration) return false
        if (this.structSize != other.structSize) return false
        if (this.providerName != other.providerName) return false
        if (this.providerVersion != other.providerVersion) return false
        if (this.syncRootIdentity != other.syncRootIdentity) return false
        if (this.syncRootIdentityLength != other.syncRootIdentityLength) return false
        if (this.fileIdentity != other.fileIdentity) return false
        if (this.fileIdentityLength != other.fileIdentityLength) return false
        if (this.providerId != other.providerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.structSize.hashCode()
        result = 31 * result + this.providerName.hashCode()
        result = 31 * result + this.providerVersion.hashCode()
        result = 31 * result + this.syncRootIdentity.hashCode()
        result = 31 * result + this.syncRootIdentityLength.hashCode()
        result = 31 * result + this.fileIdentity.hashCode()
        result = 31 * result + this.fileIdentityLength.hashCode()
        result = 31 * result + this.providerId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            structSize: UInt = 0u,
            providerName: Pcwstr = ConstPtr(0L),
            providerVersion: Pcwstr = ConstPtr(0L),
            syncRootIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            syncRootIdentityLength: UInt = 0u,
            fileIdentity: ConstPtr<CVoid> = ConstPtr(0L),
            fileIdentityLength: UInt = 0u,
            providerId: Guid = Guid(),
        ): CfSyncRegistration =
            CfSyncRegistration(
                structSize = structSize,
                providerNameCtorArg = providerName,
                providerVersionCtorArg = providerVersion,
                syncRootIdentityCtorArg = syncRootIdentity,
                syncRootIdentityLength = syncRootIdentityLength,
                fileIdentityCtorArg = fileIdentity,
                fileIdentityLength = fileIdentityLength,
                providerId = providerId,
            )
    }
}

public data class CfSyncRootBasicInfo(
    public var syncRootFileId: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncRootBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncRootBasicInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CfSyncRootBasicInfo =
                    CfSyncRootBasicInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CfSyncRootBasicInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.syncRootFileId)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncRootProviderInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncRootProviderInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1028L
                override fun readNative(addr: Long): CfSyncRootProviderInfo =
                    CfSyncRootProviderInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 516L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CfSyncRootProviderInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.providerStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 4L, value.providerName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 516L, value.providerVersion.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncRootStandardInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncRootStandardInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1064L
                override fun readNative(addr: Long): CfSyncRootStandardInfo =
                    CfSyncRootStandardInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (CfHydrationPolicy.typeLayout()).readNative(addr + 8L),
                        (CfPopulationPolicy.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 540L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1052L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 1056L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CfSyncRootStandardInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.syncRootFileId)
                    (CfHydrationPolicy.typeLayout()).writeNative(addr + 8L, value.hydrationPolicy)
                    (CfPopulationPolicy.typeLayout()).writeNative(addr + 12L, value.populationPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.inSyncPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.hardLinkPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.providerStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 28L, value.providerName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 540L, value.providerVersion.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1052L, value.syncRootIdentityLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 1056L, value.syncRootIdentity.toList())
                }
            }
    }
}

public data class CfSyncStatus(
    public var structSize: UInt = 0u,
    public var code: UInt = 0u,
    public var descriptionOffset: UInt = 0u,
    public var descriptionLength: UInt = 0u,
    public var deviceIdOffset: UInt = 0u,
    public var deviceIdLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CfSyncStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CfSyncStatus =
                    CfSyncStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CfSyncStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.structSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.descriptionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.descriptionLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.deviceIdOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.deviceIdLength)
                }
            }
    }
}
