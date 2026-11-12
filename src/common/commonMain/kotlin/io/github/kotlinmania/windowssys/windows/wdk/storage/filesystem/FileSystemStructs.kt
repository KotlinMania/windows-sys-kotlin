@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpList
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FastMutex
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoSecurityContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PfreeFunction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.TokenControl
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.Msv10ProtocolMessageType
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecApplicationProtocolList
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SecurityLogonType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileId128
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileSegmentElement
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ReparseGuidDataBuffer
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.FsBpioInflags
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.FsBpioOperations
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.QueryBadRangesInputRange
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.StorageReserveId
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public data class AceHeader(
    public var aceType: UByte = 0u,
    public var aceFlags: UByte = 0u,
    public var aceSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AceHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AceHeader> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): AceHeader =
                    AceHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: AceHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.aceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.aceFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.aceSize)
                }
            }
    }
}

public class AtomicCreateEcpContext internal constructor(
    public var size: UShort,
    public var inFlags: UShort,
    public var outFlags: UShort,
    public var reparseBufferLength: UShort,
    reparseBufferCtorArg: MutPtr<ReparseDataBuffer>,
    public var fileSize: Long,
    public var validDataLength: Long,
    fileTimestampsCtorArg: MutPtr<FileTimestamps>,
    public var fileAttributes: UInt,
    public var usnSourceInfo: UInt,
    public var usn: Long,
    public var suppressFileAttributeInheritanceMask: UInt,
    public var inOpFlags: UInt,
    public var outOpFlags: UInt,
    public var inGenFlags: UInt,
    public var outGenFlags: UInt,
    public var caseSensitiveFlagsMask: UInt,
    public var inCaseSensitiveFlags: UInt,
    public var outCaseSensitiveFlags: UInt,
) {
    public var reparseBuffer: MutPtr<ReparseDataBuffer> = reparseBufferCtorArg
        internal set

    public var fileTimestamps: MutPtr<FileTimestamps> = fileTimestampsCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        inFlags = 0u,
        outFlags = 0u,
        reparseBufferLength = 0u,
        reparseBufferCtorArg = MutPtr(0L),
        fileSize = 0L,
        validDataLength = 0L,
        fileTimestampsCtorArg = MutPtr(0L),
        fileAttributes = 0u,
        usnSourceInfo = 0u,
        usn = 0L,
        suppressFileAttributeInheritanceMask = 0u,
        inOpFlags = 0u,
        outOpFlags = 0u,
        inGenFlags = 0u,
        outGenFlags = 0u,
        caseSensitiveFlagsMask = 0u,
        inCaseSensitiveFlags = 0u,
        outCaseSensitiveFlags = 0u,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtomicCreateEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtomicCreateEcpContext> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AtomicCreateEcpContext =
                    AtomicCreateEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ReparseDataBuffer>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FileTimestamps>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: AtomicCreateEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.inFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.outFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reparseBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ReparseDataBuffer>(64)
                    ).writeNative(addr + 8L, value.reparseBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.fileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.validDataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FileTimestamps>(64)
                    ).writeNative(addr + 32L, value.fileTimestamps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.usnSourceInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.usn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.suppressFileAttributeInheritanceMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.inOpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.outOpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.inGenFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.outGenFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.caseSensitiveFlagsMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.inCaseSensitiveFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.outCaseSensitiveFlags)
                }
            }

        public operator fun invoke(
            size: UShort = 0u,
            inFlags: UShort = 0u,
            outFlags: UShort = 0u,
            reparseBufferLength: UShort = 0u,
            reparseBuffer: MutPtr<ReparseDataBuffer> = MutPtr(0L),
            fileSize: Long = 0L,
            validDataLength: Long = 0L,
            fileTimestamps: MutPtr<FileTimestamps> = MutPtr(0L),
            fileAttributes: UInt = 0u,
            usnSourceInfo: UInt = 0u,
            usn: Long = 0L,
            suppressFileAttributeInheritanceMask: UInt = 0u,
            inOpFlags: UInt = 0u,
            outOpFlags: UInt = 0u,
            inGenFlags: UInt = 0u,
            outGenFlags: UInt = 0u,
            caseSensitiveFlagsMask: UInt = 0u,
            inCaseSensitiveFlags: UInt = 0u,
            outCaseSensitiveFlags: UInt = 0u,
        ): AtomicCreateEcpContext =
            AtomicCreateEcpContext(
                size = size,
                inFlags = inFlags,
                outFlags = outFlags,
                reparseBufferLength = reparseBufferLength,
                reparseBufferCtorArg = reparseBuffer,
                fileSize = fileSize,
                validDataLength = validDataLength,
                fileTimestampsCtorArg = fileTimestamps,
                fileAttributes = fileAttributes,
                usnSourceInfo = usnSourceInfo,
                usn = usn,
                suppressFileAttributeInheritanceMask = suppressFileAttributeInheritanceMask,
                inOpFlags = inOpFlags,
                outOpFlags = outOpFlags,
                inGenFlags = inGenFlags,
                outGenFlags = outGenFlags,
                caseSensitiveFlagsMask = caseSensitiveFlagsMask,
                inCaseSensitiveFlags = inCaseSensitiveFlags,
                outCaseSensitiveFlags = outCaseSensitiveFlags,
            )
    }
}

public class BaseMcb internal constructor(
    public var maximumPairCount: UInt,
    public var pairCount: UInt,
    public var poolType: UShort,
    public var flags: UShort,
    mappingCtorArg: MutPtr<CVoid>,
) {
    public var mapping: MutPtr<CVoid> = mappingCtorArg
        internal set

    public constructor() : this(
        maximumPairCount = 0u,
        pairCount = 0u,
        poolType = 0u,
        flags = 0u,
        mappingCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.maximumPairCount

    public operator fun component2(): UInt = this.pairCount

    public operator fun component3(): UShort = this.poolType

    public operator fun component4(): UShort = this.flags

    public operator fun component5(): MutPtr<CVoid> = this.mapping

    public fun copy(maximumPairCount: UInt = this.maximumPairCount, pairCount: UInt = this.pairCount, poolType: UShort = this.poolType, flags: UShort = this.flags, mapping: MutPtr<CVoid> = this.mapping): BaseMcb = BaseMcb(maximumPairCount = maximumPairCount, pairCount = pairCount, poolType = poolType, flags = flags, mappingCtorArg = mapping)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BaseMcb) return false
        if (this.maximumPairCount != other.maximumPairCount) return false
        if (this.pairCount != other.pairCount) return false
        if (this.poolType != other.poolType) return false
        if (this.flags != other.flags) return false
        if (this.mapping != other.mapping) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumPairCount.hashCode()
        result = 31 * result + this.pairCount.hashCode()
        result = 31 * result + this.poolType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.mapping.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BaseMcb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BaseMcb> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): BaseMcb =
                    BaseMcb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BaseMcb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumPairCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pairCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.poolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.mapping)
                }
            }

        public operator fun invoke(
            maximumPairCount: UInt = 0u,
            pairCount: UInt = 0u,
            poolType: UShort = 0u,
            flags: UShort = 0u,
            mapping: MutPtr<CVoid> = MutPtr(0L),
        ): BaseMcb =
            BaseMcb(
                maximumPairCount = maximumPairCount,
                pairCount = pairCount,
                poolType = poolType,
                flags = flags,
                mappingCtorArg = mapping,
            )
    }
}

public data class BootAreaInfo(
    public var bootSectorCount: UInt = 0u,
    public var bootSectors: List<BootAreaInfo0> = List(2) { BootAreaInfo0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): BootAreaInfo =
                    BootAreaInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BootAreaInfo0.typeLayout(), (2).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BootAreaInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bootSectorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BootAreaInfo0.typeLayout(), (2).toInt())
                    ).writeNative(addr + 8L, value.bootSectors)
                }
            }
    }
}

public data class BootAreaInfo0(
    public var offset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BootAreaInfo0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): BootAreaInfo0 =
                    BootAreaInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BootAreaInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.offset)
                }
            }
    }
}

public data class CacheManagerCallbacks(
    public var acquireForLazyWrite: PacquireForLazyWrite = null,
    public var releaseFromLazyWrite: PreleaseFromLazyWrite = null,
    public var acquireForReadAhead: PacquireForReadAhead = null,
    public var releaseFromReadAhead: PreleaseFromReadAhead = null,
)

public data class CacheManagerCallbacksEx(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var functions: CacheManagerCallbackFunctions = CacheManagerCallbackFunctions(),
)

public data class CacheManagerCallbackFunctions(
    public var acquireForLazyWriteEx: PacquireForLazyWriteEx = null,
    public var releaseFromLazyWrite: PreleaseFromLazyWrite = null,
    public var acquireForReadAhead: PacquireForReadAhead = null,
    public var releaseFromReadAhead: PreleaseFromReadAhead = null,
)

public class CacheUninitializeEvent internal constructor(
    nextCtorArg: MutPtr<CacheUninitializeEvent>,
    public var event: Kevent,
) {
    public var next: MutPtr<CacheUninitializeEvent> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        event = Kevent(),
    )

    public operator fun component1(): MutPtr<CacheUninitializeEvent> = this.next

    public operator fun component2(): Kevent = this.event

    public fun copy(next: MutPtr<CacheUninitializeEvent> = this.next, event: Kevent = this.event): CacheUninitializeEvent = CacheUninitializeEvent(nextCtorArg = next, event = event)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CacheUninitializeEvent) return false
        if (this.next != other.next) return false
        if (this.event != other.event) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.event.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            next: MutPtr<CacheUninitializeEvent> = MutPtr(0L),
            event: Kevent = Kevent(),
        ): CacheUninitializeEvent =
            CacheUninitializeEvent(
                nextCtorArg = next,
                event = event,
            )
    }
}

public class CcAsyncReadContext internal constructor(
    public var completionRoutine: PasyncReadCompletionCallback,
    contextCtorArg: MutPtr<CVoid>,
    mdlCtorArg: MutPtr<Mdl>,
    public var requestorMode: Byte,
    public var nestingLevel: UInt,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public var mdl: MutPtr<Mdl> = mdlCtorArg
        internal set

    public constructor() : this(
        completionRoutine = null,
        contextCtorArg = MutPtr(0L),
        mdlCtorArg = MutPtr(0L),
        requestorMode = 0,
        nestingLevel = 0u,
    )

    public operator fun component1(): PasyncReadCompletionCallback = this.completionRoutine

    public operator fun component2(): MutPtr<CVoid> = this.context

    public operator fun component3(): MutPtr<Mdl> = this.mdl

    public operator fun component4(): Byte = this.requestorMode

    public operator fun component5(): UInt = this.nestingLevel

    public fun copy(completionRoutine: PasyncReadCompletionCallback = this.completionRoutine, context: MutPtr<CVoid> = this.context, mdl: MutPtr<Mdl> = this.mdl, requestorMode: Byte = this.requestorMode, nestingLevel: UInt = this.nestingLevel): CcAsyncReadContext = CcAsyncReadContext(completionRoutine = completionRoutine, contextCtorArg = context, mdlCtorArg = mdl, requestorMode = requestorMode, nestingLevel = nestingLevel)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CcAsyncReadContext) return false
        if (this.completionRoutine != other.completionRoutine) return false
        if (this.context != other.context) return false
        if (this.mdl != other.mdl) return false
        if (this.requestorMode != other.requestorMode) return false
        if (this.nestingLevel != other.nestingLevel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completionRoutine.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.mdl.hashCode()
        result = 31 * result + this.requestorMode.hashCode()
        result = 31 * result + this.nestingLevel.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            completionRoutine: PasyncReadCompletionCallback = null,
            context: MutPtr<CVoid> = MutPtr(0L),
            mdl: MutPtr<Mdl> = MutPtr(0L),
            requestorMode: Byte = 0,
            nestingLevel: UInt = 0u,
        ): CcAsyncReadContext =
            CcAsyncReadContext(
                completionRoutine = completionRoutine,
                contextCtorArg = context,
                mdlCtorArg = mdl,
                requestorMode = requestorMode,
                nestingLevel = nestingLevel,
            )
    }
}

public data class CcErrorCallbackContext(
    public var nodeByteSize: Short = 0,
    public var errorCode: Ntstatus = 0,
)

public data class CcFileSizes(
    public var allocationSize: Long = 0L,
    public var fileSize: Long = 0L,
    public var validDataLength: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CcFileSizes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CcFileSizes> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CcFileSizes =
                    CcFileSizes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CcFileSizes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.validDataLength)
                }
            }
    }
}

public data class CompressedDataInfo(
    public var compressionFormatAndEngine: UShort = 0u,
    public var compressionUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var reserved: UByte = 0u,
    public var numberOfChunks: UShort = 0u,
    public var compressedChunkSizes: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CompressedDataInfo) return false
        if (this.compressionFormatAndEngine != other.compressionFormatAndEngine) return false
        if (this.compressionUnitShift != other.compressionUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (this.reserved != other.reserved) return false
        if (this.numberOfChunks != other.numberOfChunks) return false
        if (!this.compressedChunkSizes.contentEquals(other.compressedChunkSizes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressionFormatAndEngine.hashCode()
        result = 31 * result + this.compressionUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.numberOfChunks.hashCode()
        result = 31 * result + this.compressedChunkSizes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CompressedDataInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CompressedDataInfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CompressedDataInfo =
                    CompressedDataInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CompressedDataInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.compressionFormatAndEngine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.compressionUnitShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.chunkShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.clusterShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.numberOfChunks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.compressedChunkSizes)
                }
            }
    }
}

public data class ContainerRootInfoInput(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoInput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ContainerRootInfoInput =
                    ContainerRootInfoInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ContainerRootInfoInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class ContainerRootInfoOutput(
    public var containerRootIdLength: UShort = 0u,
    public var containerRootId: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ContainerRootInfoOutput) return false
        if (this.containerRootIdLength != other.containerRootIdLength) return false
        if (!this.containerRootId.contentEquals(other.containerRootId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.containerRootIdLength.hashCode()
        result = 31 * result + this.containerRootId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerRootInfoOutput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ContainerRootInfoOutput =
                    ContainerRootInfoOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ContainerRootInfoOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.containerRootIdLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.containerRootId)
                }
            }
    }
}

public data class ContainerVolumeState(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerVolumeState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ContainerVolumeState> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ContainerVolumeState =
                    ContainerVolumeState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ContainerVolumeState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public class CopyInformation internal constructor(
    sourceFileObjectCtorArg: MutPtr<FileObject>,
    public var sourceFileOffset: Long,
) {
    public var sourceFileObject: MutPtr<FileObject> = sourceFileObjectCtorArg
        internal set

    public constructor() : this(
        sourceFileObjectCtorArg = MutPtr(0L),
        sourceFileOffset = 0L,
    )

    public operator fun component1(): MutPtr<FileObject> = this.sourceFileObject

    public operator fun component2(): Long = this.sourceFileOffset

    public fun copy(sourceFileObject: MutPtr<FileObject> = this.sourceFileObject, sourceFileOffset: Long = this.sourceFileOffset): CopyInformation = CopyInformation(sourceFileObjectCtorArg = sourceFileObject, sourceFileOffset = sourceFileOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CopyInformation) return false
        if (this.sourceFileObject != other.sourceFileObject) return false
        if (this.sourceFileOffset != other.sourceFileOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceFileObject.hashCode()
        result = 31 * result + this.sourceFileOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CopyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CopyInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CopyInformation =
                    CopyInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FileObject>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CopyInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FileObject>(64)
                    ).writeNative(addr, value.sourceFileObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.sourceFileOffset)
                }
            }

        public operator fun invoke(
            sourceFileObject: MutPtr<FileObject> = MutPtr(0L),
            sourceFileOffset: Long = 0L,
        ): CopyInformation =
            CopyInformation(
                sourceFileObjectCtorArg = sourceFileObject,
                sourceFileOffset = sourceFileOffset,
            )
    }
}

public class Cptableinfo internal constructor(
    public var codePage: UShort,
    public var maximumCharacterSize: UShort,
    public var defaultChar: UShort,
    public var uniDefaultChar: UShort,
    public var transDefaultChar: UShort,
    public var transUniDefaultChar: UShort,
    public var dBCSCodePage: UShort,
    public var leadByte: UByteArray,
    multiByteTableCtorArg: MutPtr<UShort>,
    wideCharTableCtorArg: MutPtr<CVoid>,
    dBCSRangesCtorArg: MutPtr<UShort>,
    dBCSOffsetsCtorArg: MutPtr<UShort>,
) {
    public var multiByteTable: MutPtr<UShort> = multiByteTableCtorArg
        internal set

    public var wideCharTable: MutPtr<CVoid> = wideCharTableCtorArg
        internal set

    public var dBCSRanges: MutPtr<UShort> = dBCSRangesCtorArg
        internal set

    public var dBCSOffsets: MutPtr<UShort> = dBCSOffsetsCtorArg
        internal set

    public constructor() : this(
        codePage = 0u,
        maximumCharacterSize = 0u,
        defaultChar = 0u,
        uniDefaultChar = 0u,
        transDefaultChar = 0u,
        transUniDefaultChar = 0u,
        dBCSCodePage = 0u,
        leadByte = UByteArray(12),
        multiByteTableCtorArg = MutPtr(0L),
        wideCharTableCtorArg = MutPtr(0L),
        dBCSRangesCtorArg = MutPtr(0L),
        dBCSOffsetsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.codePage

    public operator fun component2(): UShort = this.maximumCharacterSize

    public operator fun component3(): UShort = this.defaultChar

    public operator fun component4(): UShort = this.uniDefaultChar

    public operator fun component5(): UShort = this.transDefaultChar

    public operator fun component6(): UShort = this.transUniDefaultChar

    public operator fun component7(): UShort = this.dBCSCodePage

    public operator fun component8(): UByteArray = this.leadByte

    public operator fun component9(): MutPtr<UShort> = this.multiByteTable

    public operator fun component10(): MutPtr<CVoid> = this.wideCharTable

    public operator fun component11(): MutPtr<UShort> = this.dBCSRanges

    public operator fun component12(): MutPtr<UShort> = this.dBCSOffsets

    public fun copy(codePage: UShort = this.codePage, maximumCharacterSize: UShort = this.maximumCharacterSize, defaultChar: UShort = this.defaultChar, uniDefaultChar: UShort = this.uniDefaultChar, transDefaultChar: UShort = this.transDefaultChar, transUniDefaultChar: UShort = this.transUniDefaultChar, dBCSCodePage: UShort = this.dBCSCodePage, leadByte: UByteArray = this.leadByte, multiByteTable: MutPtr<UShort> = this.multiByteTable, wideCharTable: MutPtr<CVoid> = this.wideCharTable, dBCSRanges: MutPtr<UShort> = this.dBCSRanges, dBCSOffsets: MutPtr<UShort> = this.dBCSOffsets): Cptableinfo = Cptableinfo(codePage = codePage, maximumCharacterSize = maximumCharacterSize, defaultChar = defaultChar, uniDefaultChar = uniDefaultChar, transDefaultChar = transDefaultChar, transUniDefaultChar = transUniDefaultChar, dBCSCodePage = dBCSCodePage, leadByte = leadByte, multiByteTableCtorArg = multiByteTable, wideCharTableCtorArg = wideCharTable, dBCSRangesCtorArg = dBCSRanges, dBCSOffsetsCtorArg = dBCSOffsets)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cptableinfo) return false
        if (this.codePage != other.codePage) return false
        if (this.maximumCharacterSize != other.maximumCharacterSize) return false
        if (this.defaultChar != other.defaultChar) return false
        if (this.uniDefaultChar != other.uniDefaultChar) return false
        if (this.transDefaultChar != other.transDefaultChar) return false
        if (this.transUniDefaultChar != other.transUniDefaultChar) return false
        if (this.dBCSCodePage != other.dBCSCodePage) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        if (this.multiByteTable != other.multiByteTable) return false
        if (this.wideCharTable != other.wideCharTable) return false
        if (this.dBCSRanges != other.dBCSRanges) return false
        if (this.dBCSOffsets != other.dBCSOffsets) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.codePage.hashCode()
        result = 31 * result + this.maximumCharacterSize.hashCode()
        result = 31 * result + this.defaultChar.hashCode()
        result = 31 * result + this.uniDefaultChar.hashCode()
        result = 31 * result + this.transDefaultChar.hashCode()
        result = 31 * result + this.transUniDefaultChar.hashCode()
        result = 31 * result + this.dBCSCodePage.hashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        result = 31 * result + this.multiByteTable.hashCode()
        result = 31 * result + this.wideCharTable.hashCode()
        result = 31 * result + this.dBCSRanges.hashCode()
        result = 31 * result + this.dBCSOffsets.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cptableinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cptableinfo> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Cptableinfo =
                    Cptableinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Cptableinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.codePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumCharacterSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.defaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.uniDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.transDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.transUniDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dBCSCodePage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 14L, value.leadByte)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.multiByteTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.wideCharTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 48L, value.dBCSRanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 56L, value.dBCSOffsets)
                }
            }

        public operator fun invoke(
            codePage: UShort = 0u,
            maximumCharacterSize: UShort = 0u,
            defaultChar: UShort = 0u,
            uniDefaultChar: UShort = 0u,
            transDefaultChar: UShort = 0u,
            transUniDefaultChar: UShort = 0u,
            dBCSCodePage: UShort = 0u,
            leadByte: UByteArray = UByteArray(12),
            multiByteTable: MutPtr<UShort> = MutPtr(0L),
            wideCharTable: MutPtr<CVoid> = MutPtr(0L),
            dBCSRanges: MutPtr<UShort> = MutPtr(0L),
            dBCSOffsets: MutPtr<UShort> = MutPtr(0L),
        ): Cptableinfo =
            Cptableinfo(
                codePage = codePage,
                maximumCharacterSize = maximumCharacterSize,
                defaultChar = defaultChar,
                uniDefaultChar = uniDefaultChar,
                transDefaultChar = transDefaultChar,
                transUniDefaultChar = transUniDefaultChar,
                dBCSCodePage = dBCSCodePage,
                leadByte = leadByte,
                multiByteTableCtorArg = multiByteTable,
                wideCharTableCtorArg = wideCharTable,
                dBCSRangesCtorArg = dBCSRanges,
                dBCSOffsetsCtorArg = dBCSOffsets,
            )
    }
}

public data class CreateRedirectionEcpContext(
    public var size: UShort = 0u,
    public var flags: UShort = 0u,
    public var fileId: FileId128 = FileId128(),
    public var volumeGuid: Guid = Guid(),
)

public data class CreateUsnJournalData(
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateUsnJournalData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CreateUsnJournalData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CreateUsnJournalData =
                    CreateUsnJournalData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CreateUsnJournalData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.maximumSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.allocationDelta)
                }
            }
    }
}

public data class CsvDownLevelOpenEcpContext(
    public var version: UInt = 0u,
    public var isResume: Boolean = false,
    public var fileType: CsvDownLevelFileType = 0,
    public var sourceNodeId: UInt = 0u,
    public var destinationNodeId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvDownLevelOpenEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvDownLevelOpenEcpContext> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CsvDownLevelOpenEcpContext =
                    CsvDownLevelOpenEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CsvDownLevelOpenEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.isResume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fileType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sourceNodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.destinationNodeId)
                }
            }
    }
}

public data class CsvQueryFileRevisionEcpContext(
    public var fileId: Long = 0L,
    public var fileRevision: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevisionEcpContext) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileRevision.contentEquals(other.fileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileId.hashCode()
        result = 31 * result + this.fileRevision.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryFileRevisionEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvQueryFileRevisionEcpContext> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CsvQueryFileRevisionEcpContext =
                    CsvQueryFileRevisionEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CsvQueryFileRevisionEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                    ).writeNative(addr + 8L, value.fileRevision)
                }
            }
    }
}

public data class CsvQueryFileRevisionEcpContextFileId128(
    public var fileId: FileId128 = FileId128(),
    public var fileRevision: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CsvQueryFileRevisionEcpContextFileId128) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileRevision.contentEquals(other.fileRevision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileId.hashCode()
        result = 31 * result + this.fileRevision.contentHashCode()
        return result
    }
}

public data class CsvSetHandlePropertiesEcpContext(
    public var size: Int = 0,
    public var pauseTimeoutInSeconds: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvSetHandlePropertiesEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsvSetHandlePropertiesEcpContext> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CsvSetHandlePropertiesEcpContext =
                    CsvSetHandlePropertiesEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CsvSetHandlePropertiesEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pauseTimeoutInSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                }
            }
    }
}

public data class DualOplockKeyEcpContext(
    public var parentOplockKey: Guid = Guid(),
    public var targetOplockKey: Guid = Guid(),
    public var parentOplockKeySet: Boolean = false,
    public var targetOplockKeySet: Boolean = false,
)

public data class DuplicateClusterData(
    public var sourceLcn: Long = 0L,
    public var targetFileOffset: Long = 0L,
    public var duplicationLimit: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DuplicateClusterData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DuplicateClusterData> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DuplicateClusterData =
                    DuplicateClusterData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DuplicateClusterData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sourceLcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.targetFileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.duplicationLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class EcpOpenParameters(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EcpOpenParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EcpOpenParameters> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): EcpOpenParameters =
                    EcpOpenParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: EcpOpenParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class EofWaitBlock(
    public var eofWaitLinks: ListEntry = ListEntry(),
    public var event: Kevent = Kevent(),
)

public data class ExtentReadCacheInfoBuffer(
    public var allocatedCache: Long = 0L,
    public var populatedCache: Long = 0L,
    public var inErrorCache: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtentReadCacheInfoBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtentReadCacheInfoBuffer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ExtentReadCacheInfoBuffer =
                    ExtentReadCacheInfoBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ExtentReadCacheInfoBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocatedCache)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.populatedCache)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.inErrorCache)
                }
            }
    }
}

public data class FileAccessInformation(
    public var accessFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAccessInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAccessInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileAccessInformation =
                    FileAccessInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileAccessInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.accessFlags)
                }
            }
    }
}

public data class FileAlignmentInformation(
    public var alignmentRequirement: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAlignmentInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAlignmentInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileAlignmentInformation =
                    FileAlignmentInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileAlignmentInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.alignmentRequirement)
                }
            }
    }
}

public data class FileAllocationInformation(
    public var allocationSize: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllocationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllocationInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileAllocationInformation =
                    FileAllocationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileAllocationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocationSize)
                }
            }
    }
}

public data class FileAllInformation(
    public var basicInformation: FileBasicInformation = FileBasicInformation(),
    public var standardInformation: FileStandardInformation = FileStandardInformation(),
    public var internalInformation: FileInternalInformation = FileInternalInformation(),
    public var eaInformation: FileEaInformation = FileEaInformation(),
    public var accessInformation: FileAccessInformation = FileAccessInformation(),
    public var positionInformation: FilePositionInformation = FilePositionInformation(),
    public var modeInformation: FileModeInformation = FileModeInformation(),
    public var alignmentInformation: FileAlignmentInformation = FileAlignmentInformation(),
    public var nameInformation: FileNameInformation = FileNameInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAllInformation> {
                override val sizeBytes: Long = 104L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileAllInformation =
                    FileAllInformation(
                        (FileBasicInformation.typeLayout()).readNative(addr),
                        (FileStandardInformation.typeLayout()).readNative(addr + 40L),
                        (FileInternalInformation.typeLayout()).readNative(addr + 64L),
                        (FileEaInformation.typeLayout()).readNative(addr + 72L),
                        (FileAccessInformation.typeLayout()).readNative(addr + 76L),
                        (FilePositionInformation.typeLayout()).readNative(addr + 80L),
                        (FileModeInformation.typeLayout()).readNative(addr + 88L),
                        (FileAlignmentInformation.typeLayout()).readNative(addr + 92L),
                        (FileNameInformation.typeLayout()).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: FileAllInformation) {
                    (FileBasicInformation.typeLayout()).writeNative(addr, value.basicInformation)
                    (FileStandardInformation.typeLayout()).writeNative(addr + 40L, value.standardInformation)
                    (FileInternalInformation.typeLayout()).writeNative(addr + 64L, value.internalInformation)
                    (FileEaInformation.typeLayout()).writeNative(addr + 72L, value.eaInformation)
                    (FileAccessInformation.typeLayout()).writeNative(addr + 76L, value.accessInformation)
                    (FilePositionInformation.typeLayout()).writeNative(addr + 80L, value.positionInformation)
                    (FileModeInformation.typeLayout()).writeNative(addr + 88L, value.modeInformation)
                    (FileAlignmentInformation.typeLayout()).writeNative(addr + 92L, value.alignmentInformation)
                    (FileNameInformation.typeLayout()).writeNative(addr + 96L, value.nameInformation)
                }
            }
    }
}

public data class FileBasicInformation(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileBasicInformation> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileBasicInformation =
                    FileBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FileBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fileAttributes)
                }
            }
    }
}

public data class FileBothDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var shortNameLength: Byte = 0,
    public var shortName: UShortArray = UShortArray(12),
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileBothDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.shortNameLength != other.shortNameLength) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.shortNameLength.hashCode()
        result = 31 * result + this.shortName.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileBothDirInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileBothDirInformation> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileBothDirInformation =
                    FileBothDirInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 68L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                        ).readNative(addr + 70L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 94L),
                    )
                override fun writeNative(addr: Long, value: FileBothDirInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 68L, value.shortNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                    ).writeNative(addr + 70L, value.shortName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 94L, value.fileName)
                }
            }
    }
}

public data class FileCaseSensitiveInformation(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCaseSensitiveInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCaseSensitiveInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileCaseSensitiveInformation =
                    FileCaseSensitiveInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileCaseSensitiveInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public class FileCompletionInformation internal constructor(
    portCtorArg: Handle,
    keyCtorArg: MutPtr<CVoid>,
) {
    public var port: Handle = portCtorArg
        internal set

    public var key: MutPtr<CVoid> = keyCtorArg
        internal set

    public constructor() : this(
        portCtorArg = MutPtr(0L),
        keyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.port

    public operator fun component2(): MutPtr<CVoid> = this.key

    public fun copy(port: Handle = this.port, key: MutPtr<CVoid> = this.key): FileCompletionInformation = FileCompletionInformation(portCtorArg = port, keyCtorArg = key)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileCompletionInformation) return false
        if (this.port != other.port) return false
        if (this.key != other.key) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.port.hashCode()
        result = 31 * result + this.key.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            port: Handle = MutPtr(0L),
            key: MutPtr<CVoid> = MutPtr(0L),
        ): FileCompletionInformation =
            FileCompletionInformation(
                portCtorArg = port,
                keyCtorArg = key,
            )
    }
}

public data class FileCompressionInformation(
    public var compressedFileSize: Long = 0L,
    public var compressionFormat: UShort = 0u,
    public var compressionUnitShift: UByte = 0u,
    public var chunkShift: UByte = 0u,
    public var clusterShift: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileCompressionInformation) return false
        if (this.compressedFileSize != other.compressedFileSize) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.compressionUnitShift != other.compressionUnitShift) return false
        if (this.chunkShift != other.chunkShift) return false
        if (this.clusterShift != other.clusterShift) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressedFileSize.hashCode()
        result = 31 * result + this.compressionFormat.hashCode()
        result = 31 * result + this.compressionUnitShift.hashCode()
        result = 31 * result + this.chunkShift.hashCode()
        result = 31 * result + this.clusterShift.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCompressionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileCompressionInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileCompressionInformation =
                    FileCompressionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: FileCompressionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.compressedFileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.compressionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.compressionUnitShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.chunkShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.clusterShift)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved)
                }
            }
    }
}

public data class FileDirectoryInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileDirectoryInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDirectoryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDirectoryInformation> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileDirectoryInformation =
                    FileDirectoryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: FileDirectoryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 64L, value.fileName)
                }
            }
    }
}

public data class FileDispositionInformation(
    public var deleteFile: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInformation> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FileDispositionInformation =
                    FileDispositionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileDispositionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.deleteFile)
                }
            }
    }
}

public data class FileDispositionInformationEx(
    public var flags: FileDispositionInformationExFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileDispositionInformationEx> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileDispositionInformationEx =
                    FileDispositionInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileDispositionInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class FileEaInformation(
    public var eaSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEaInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileEaInformation =
                    FileEaInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileEaInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eaSize)
                }
            }
    }
}

public data class FileEndOfFileInformationEx(
    public var endOfFile: Long = 0L,
    public var pagingFileSizeInMM: Long = 0L,
    public var pagingFileMaxSize: Long = 0L,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEndOfFileInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileEndOfFileInformationEx> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileEndOfFileInformationEx =
                    FileEndOfFileInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileEndOfFileInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.pagingFileSizeInMM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.pagingFileMaxSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                }
            }
    }
}

public data class FileFsAttributeInformation(
    public var fileSystemAttributes: UInt = 0u,
    public var maximumComponentNameLength: Int = 0,
    public var fileSystemNameLength: UInt = 0u,
    public var fileSystemName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsAttributeInformation) return false
        if (this.fileSystemAttributes != other.fileSystemAttributes) return false
        if (this.maximumComponentNameLength != other.maximumComponentNameLength) return false
        if (this.fileSystemNameLength != other.fileSystemNameLength) return false
        if (!this.fileSystemName.contentEquals(other.fileSystemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileSystemAttributes.hashCode()
        result = 31 * result + this.maximumComponentNameLength.hashCode()
        result = 31 * result + this.fileSystemNameLength.hashCode()
        result = 31 * result + this.fileSystemName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsAttributeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsAttributeInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileFsAttributeInformation =
                    FileFsAttributeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileFsAttributeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileSystemAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maximumComponentNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileSystemNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.fileSystemName)
                }
            }
    }
}

public data class FileFsControlInformation(
    public var freeSpaceStartFiltering: Long = 0L,
    public var freeSpaceThreshold: Long = 0L,
    public var freeSpaceStopFiltering: Long = 0L,
    public var defaultQuotaThreshold: Long = 0L,
    public var defaultQuotaLimit: Long = 0L,
    public var fileSystemControlFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsControlInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsControlInformation> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileFsControlInformation =
                    FileFsControlInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FileFsControlInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.freeSpaceStartFiltering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.freeSpaceThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.freeSpaceStopFiltering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.defaultQuotaThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.defaultQuotaLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fileSystemControlFlags)
                }
            }
    }
}

public data class FileFsDataCopyInformation(
    public var numberOfCopies: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsDataCopyInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsDataCopyInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileFsDataCopyInformation =
                    FileFsDataCopyInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileFsDataCopyInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfCopies)
                }
            }
    }
}

public data class FileFsDriverPathInformation(
    public var driverInPath: Boolean = false,
    public var driverNameLength: UInt = 0u,
    public var driverName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFsDriverPathInformation) return false
        if (this.driverInPath != other.driverInPath) return false
        if (this.driverNameLength != other.driverNameLength) return false
        if (!this.driverName.contentEquals(other.driverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.driverInPath.hashCode()
        result = 31 * result + this.driverNameLength.hashCode()
        result = 31 * result + this.driverName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsDriverPathInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsDriverPathInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileFsDriverPathInformation =
                    FileFsDriverPathInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileFsDriverPathInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.driverInPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.driverNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.driverName)
                }
            }
    }
}

public data class FileFsSectorSizeInformation(
    public var logicalBytesPerSector: UInt = 0u,
    public var physicalBytesPerSectorForAtomicity: UInt = 0u,
    public var physicalBytesPerSectorForPerformance: UInt = 0u,
    public var fileSystemEffectivePhysicalBytesPerSectorForAtomicity: UInt = 0u,
    public var flags: UInt = 0u,
    public var byteOffsetForSectorAlignment: UInt = 0u,
    public var byteOffsetForPartitionAlignment: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsSectorSizeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsSectorSizeInformation> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileFsSectorSizeInformation =
                    FileFsSectorSizeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileFsSectorSizeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.logicalBytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.physicalBytesPerSectorForAtomicity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.physicalBytesPerSectorForPerformance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fileSystemEffectivePhysicalBytesPerSectorForAtomicity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.byteOffsetForSectorAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.byteOffsetForPartitionAlignment)
                }
            }
    }
}

public data class FileFsVolumeFlagsInformation(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsVolumeFlagsInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFsVolumeFlagsInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileFsVolumeFlagsInformation =
                    FileFsVolumeFlagsInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileFsVolumeFlagsInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class FileFullDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFullDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFullDirInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFullDirInformation> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileFullDirInformation =
                    FileFullDirInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: FileFullDirInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 68L, value.fileName)
                }
            }
    }
}

public data class FileFullEaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var flags: UByte = 0u,
    public var eaNameLength: UByte = 0u,
    public var eaValueLength: UShort = 0u,
    public var eaName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileFullEaInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.flags != other.flags) return false
        if (this.eaNameLength != other.eaNameLength) return false
        if (this.eaValueLength != other.eaValueLength) return false
        if (!this.eaName.contentEquals(other.eaName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.eaNameLength.hashCode()
        result = 31 * result + this.eaValueLength.hashCode()
        result = 31 * result + this.eaName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFullEaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileFullEaInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileFullEaInformation =
                    FileFullEaInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileFullEaInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.eaNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.eaValueLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 8L, value.eaName)
                }
            }
    }
}

public data class FileGetEaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var eaNameLength: UByte = 0u,
    public var eaName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileGetEaInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.eaNameLength != other.eaNameLength) return false
        if (!this.eaName.contentEquals(other.eaName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.eaNameLength.hashCode()
        result = 31 * result + this.eaName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileGetEaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileGetEaInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileGetEaInformation =
                    FileGetEaInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: FileGetEaInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.eaNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 5L, value.eaName)
                }
            }
    }
}

public data class FileGetQuotaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var sidLength: UInt = 0u,
    public var sid: Sid = Sid(),
)

public data class FileIdBothDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var shortNameLength: Byte = 0,
    public var shortName: UShortArray = UShortArray(12),
    public var fileId: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdBothDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.shortNameLength != other.shortNameLength) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.shortNameLength.hashCode()
        result = 31 * result + this.shortName.contentHashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdBothDirInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdBothDirInformation> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileIdBothDirInformation =
                    FileIdBothDirInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 68L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                        ).readNative(addr + 70L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: FileIdBothDirInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 68L, value.shortNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (12).toInt())
                    ).writeNative(addr + 70L, value.shortName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.fileId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 104L, value.fileName)
                }
            }
    }
}

public data class FileIdExtdBothDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var reparsePointTag: UInt = 0u,
    public var fileId: FileId128 = FileId128(),
    public var shortNameLength: Byte = 0,
    public var shortName: UShortArray = UShortArray(12),
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdExtdBothDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.reparsePointTag != other.reparsePointTag) return false
        if (this.fileId != other.fileId) return false
        if (this.shortNameLength != other.shortNameLength) return false
        if (!this.shortName.contentEquals(other.shortName)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.reparsePointTag.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.shortNameLength.hashCode()
        result = 31 * result + this.shortName.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdExtdDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var reparsePointTag: UInt = 0u,
    public var fileId: FileId128 = FileId128(),
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdExtdDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.reparsePointTag != other.reparsePointTag) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.reparsePointTag.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdFullDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var eaSize: UInt = 0u,
    public var fileId: Long = 0L,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdFullDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.eaSize != other.eaSize) return false
        if (this.fileId != other.fileId) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.eaSize.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdFullDirInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileIdFullDirInformation> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileIdFullDirInformation =
                    FileIdFullDirInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: FileIdFullDirInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eaSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.fileId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 80L, value.fileName)
                }
            }
    }
}

public data class FileIdGlobalTxDirInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var endOfFile: Long = 0L,
    public var allocationSize: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileId: Long = 0L,
    public var lockingTransactionId: Guid = Guid(),
    public var txInfoFlags: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileIdGlobalTxDirInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.creationTime != other.creationTime) return false
        if (this.lastAccessTime != other.lastAccessTime) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.changeTime != other.changeTime) return false
        if (this.endOfFile != other.endOfFile) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileId != other.fileId) return false
        if (this.lockingTransactionId != other.lockingTransactionId) return false
        if (this.txInfoFlags != other.txInfoFlags) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.lastAccessTime.hashCode()
        result = 31 * result + this.lastWriteTime.hashCode()
        result = 31 * result + this.changeTime.hashCode()
        result = 31 * result + this.endOfFile.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.lockingTransactionId.hashCode()
        result = 31 * result + this.txInfoFlags.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileIdInformation(
    public var volumeSerialNumber: ULong = 0uL,
    public var fileId: FileId128 = FileId128(),
)

public data class FileInformationDefinition(
    public var cls: FileInformationClass = 0,
    public var nextEntryOffset: UInt = 0u,
    public var fileNameLengthOffset: UInt = 0u,
    public var fileNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInformationDefinition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInformationDefinition> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileInformationDefinition =
                    FileInformationDefinition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileInformationDefinition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileNameLengthOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fileNameOffset)
                }
            }
    }
}

public data class FileInternalInformation(
    public var indexNumber: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInternalInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileInternalInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileInternalInformation =
                    FileInternalInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileInternalInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.indexNumber)
                }
            }
    }
}

public data class FileKnownFolderInformation(
    public var type: FileKnownFolderType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileKnownFolderInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileKnownFolderInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileKnownFolderInformation =
                    FileKnownFolderInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileKnownFolderInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                }
            }
    }
}

public data class FileLinksFullIdInformation(
    public var bytesNeeded: UInt = 0u,
    public var entriesReturned: UInt = 0u,
    public var entry: FileLinkEntryFullIdInformation = FileLinkEntryFullIdInformation(),
)

public data class FileLinksInformation(
    public var bytesNeeded: UInt = 0u,
    public var entriesReturned: UInt = 0u,
    public var entry: FileLinkEntryInformation = FileLinkEntryInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLinksInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLinksInformation> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileLinksInformation =
                    FileLinksInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (FileLinkEntryInformation.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileLinksInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bytesNeeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.entriesReturned)
                    (FileLinkEntryInformation.typeLayout()).writeNative(addr + 8L, value.entry)
                }
            }
    }
}

public data class FileLinkEntryFullIdInformation(
    public var nextEntryOffset: UInt = 0u,
    public var parentFileId: FileId128 = FileId128(),
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLinkEntryFullIdInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }
}

public data class FileLinkEntryInformation(
    public var nextEntryOffset: UInt = 0u,
    public var parentFileId: Long = 0L,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLinkEntryInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.parentFileId != other.parentFileId) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.parentFileId.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLinkEntryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLinkEntryInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileLinkEntryInformation =
                    FileLinkEntryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FileLinkEntryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.parentFileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 20L, value.fileName)
                }
            }
    }
}

public class FileLinkInformation internal constructor(
    public var anonymous: FileLinkInformation0,
    rootDirectoryCtorArg: Handle,
    public var fileNameLength: UInt,
    public var fileName: UShortArray,
) {
    public var rootDirectory: Handle = rootDirectoryCtorArg
        internal set

    public constructor() : this(
        anonymous = FileLinkInformation0(),
        rootDirectoryCtorArg = MutPtr(0L),
        fileNameLength = 0u,
        fileName = UShortArray(1),
    )

    public operator fun component1(): FileLinkInformation0 = this.anonymous

    public operator fun component2(): Handle = this.rootDirectory

    public operator fun component3(): UInt = this.fileNameLength

    public operator fun component4(): UShortArray = this.fileName

    public fun copy(anonymous: FileLinkInformation0 = this.anonymous, rootDirectory: Handle = this.rootDirectory, fileNameLength: UInt = this.fileNameLength, fileName: UShortArray = this.fileName): FileLinkInformation = FileLinkInformation(anonymous = anonymous, rootDirectoryCtorArg = rootDirectory, fileNameLength = fileNameLength, fileName = fileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLinkInformation) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: FileLinkInformation0 = FileLinkInformation0(),
            rootDirectory: Handle = MutPtr(0L),
            fileNameLength: UInt = 0u,
            fileName: UShortArray = UShortArray(1),
        ): FileLinkInformation =
            FileLinkInformation(
                anonymous = anonymous,
                rootDirectoryCtorArg = rootDirectory,
                fileNameLength = fileNameLength,
                fileName = fileName,
            )
    }
}

public data class FileLinkInformation0(
    public var replaceIfExists: Boolean = false,
    public var flags: UInt = 0u,
)

public class FileLock internal constructor(
    public var completeLockIrpRoutine: PcompleteLockIrpRoutine,
    public var unlockRoutine: PunlockRoutine,
    public var fastIoIsQuestionable: Boolean,
    public var spareC: BooleanArray,
    lockInformationCtorArg: MutPtr<CVoid>,
    public var lastReturnedLockInfo: FileLockInfo,
    lastReturnedLockCtorArg: MutPtr<CVoid>,
    public var lockRequestsInProgress: Int,
) {
    public var lockInformation: MutPtr<CVoid> = lockInformationCtorArg
        internal set

    public var lastReturnedLock: MutPtr<CVoid> = lastReturnedLockCtorArg
        internal set

    public constructor() : this(
        completeLockIrpRoutine = null,
        unlockRoutine = null,
        fastIoIsQuestionable = false,
        spareC = BooleanArray(3),
        lockInformationCtorArg = MutPtr(0L),
        lastReturnedLockInfo = FileLockInfo(),
        lastReturnedLockCtorArg = MutPtr(0L),
        lockRequestsInProgress = 0,
    )

    public operator fun component1(): PcompleteLockIrpRoutine = this.completeLockIrpRoutine

    public operator fun component2(): PunlockRoutine = this.unlockRoutine

    public operator fun component3(): Boolean = this.fastIoIsQuestionable

    public operator fun component4(): BooleanArray = this.spareC

    public operator fun component5(): MutPtr<CVoid> = this.lockInformation

    public operator fun component6(): FileLockInfo = this.lastReturnedLockInfo

    public operator fun component7(): MutPtr<CVoid> = this.lastReturnedLock

    public operator fun component8(): Int = this.lockRequestsInProgress

    public fun copy(completeLockIrpRoutine: PcompleteLockIrpRoutine = this.completeLockIrpRoutine, unlockRoutine: PunlockRoutine = this.unlockRoutine, fastIoIsQuestionable: Boolean = this.fastIoIsQuestionable, spareC: BooleanArray = this.spareC, lockInformation: MutPtr<CVoid> = this.lockInformation, lastReturnedLockInfo: FileLockInfo = this.lastReturnedLockInfo, lastReturnedLock: MutPtr<CVoid> = this.lastReturnedLock, lockRequestsInProgress: Int = this.lockRequestsInProgress): FileLock = FileLock(completeLockIrpRoutine = completeLockIrpRoutine, unlockRoutine = unlockRoutine, fastIoIsQuestionable = fastIoIsQuestionable, spareC = spareC, lockInformationCtorArg = lockInformation, lastReturnedLockInfo = lastReturnedLockInfo, lastReturnedLockCtorArg = lastReturnedLock, lockRequestsInProgress = lockRequestsInProgress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLock) return false
        if (this.completeLockIrpRoutine != other.completeLockIrpRoutine) return false
        if (this.unlockRoutine != other.unlockRoutine) return false
        if (this.fastIoIsQuestionable != other.fastIoIsQuestionable) return false
        if (!this.spareC.contentEquals(other.spareC)) return false
        if (this.lockInformation != other.lockInformation) return false
        if (this.lastReturnedLockInfo != other.lastReturnedLockInfo) return false
        if (this.lastReturnedLock != other.lastReturnedLock) return false
        if (this.lockRequestsInProgress != other.lockRequestsInProgress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.completeLockIrpRoutine.hashCode()
        result = 31 * result + this.unlockRoutine.hashCode()
        result = 31 * result + this.fastIoIsQuestionable.hashCode()
        result = 31 * result + this.spareC.contentHashCode()
        result = 31 * result + this.lockInformation.hashCode()
        result = 31 * result + this.lastReturnedLockInfo.hashCode()
        result = 31 * result + this.lastReturnedLock.hashCode()
        result = 31 * result + this.lockRequestsInProgress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            completeLockIrpRoutine: PcompleteLockIrpRoutine = null,
            unlockRoutine: PunlockRoutine = null,
            fastIoIsQuestionable: Boolean = false,
            spareC: BooleanArray = BooleanArray(3),
            lockInformation: MutPtr<CVoid> = MutPtr(0L),
            lastReturnedLockInfo: FileLockInfo = FileLockInfo(),
            lastReturnedLock: MutPtr<CVoid> = MutPtr(0L),
            lockRequestsInProgress: Int = 0,
        ): FileLock =
            FileLock(
                completeLockIrpRoutine = completeLockIrpRoutine,
                unlockRoutine = unlockRoutine,
                fastIoIsQuestionable = fastIoIsQuestionable,
                spareC = spareC,
                lockInformationCtorArg = lockInformation,
                lastReturnedLockInfo = lastReturnedLockInfo,
                lastReturnedLockCtorArg = lastReturnedLock,
                lockRequestsInProgress = lockRequestsInProgress,
            )
    }
}

public class FileLockInfo internal constructor(
    public var startingByte: Long,
    public var length: Long,
    public var exclusiveLock: Boolean,
    public var key: UInt,
    fileObjectCtorArg: MutPtr<FileObject>,
    processIdCtorArg: MutPtr<CVoid>,
    public var endingByte: Long,
) {
    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public var processId: MutPtr<CVoid> = processIdCtorArg
        internal set

    public constructor() : this(
        startingByte = 0L,
        length = 0L,
        exclusiveLock = false,
        key = 0u,
        fileObjectCtorArg = MutPtr(0L),
        processIdCtorArg = MutPtr(0L),
        endingByte = 0L,
    )

    public operator fun component1(): Long = this.startingByte

    public operator fun component2(): Long = this.length

    public operator fun component3(): Boolean = this.exclusiveLock

    public operator fun component4(): UInt = this.key

    public operator fun component5(): MutPtr<FileObject> = this.fileObject

    public operator fun component6(): MutPtr<CVoid> = this.processId

    public operator fun component7(): Long = this.endingByte

    public fun copy(startingByte: Long = this.startingByte, length: Long = this.length, exclusiveLock: Boolean = this.exclusiveLock, key: UInt = this.key, fileObject: MutPtr<FileObject> = this.fileObject, processId: MutPtr<CVoid> = this.processId, endingByte: Long = this.endingByte): FileLockInfo = FileLockInfo(startingByte = startingByte, length = length, exclusiveLock = exclusiveLock, key = key, fileObjectCtorArg = fileObject, processIdCtorArg = processId, endingByte = endingByte)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileLockInfo) return false
        if (this.startingByte != other.startingByte) return false
        if (this.length != other.length) return false
        if (this.exclusiveLock != other.exclusiveLock) return false
        if (this.key != other.key) return false
        if (this.fileObject != other.fileObject) return false
        if (this.processId != other.processId) return false
        if (this.endingByte != other.endingByte) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startingByte.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.exclusiveLock.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.endingByte.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLockInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileLockInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileLockInfo =
                    FileLockInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FileObject>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FileLockInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.exclusiveLock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FileObject>(64)
                    ).writeNative(addr + 24L, value.fileObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endingByte)
                }
            }

        public operator fun invoke(
            startingByte: Long = 0L,
            length: Long = 0L,
            exclusiveLock: Boolean = false,
            key: UInt = 0u,
            fileObject: MutPtr<FileObject> = MutPtr(0L),
            processId: MutPtr<CVoid> = MutPtr(0L),
            endingByte: Long = 0L,
        ): FileLockInfo =
            FileLockInfo(
                startingByte = startingByte,
                length = length,
                exclusiveLock = exclusiveLock,
                key = key,
                fileObjectCtorArg = fileObject,
                processIdCtorArg = processId,
                endingByte = endingByte,
            )
    }
}

public data class FileMailslotQueryInformation(
    public var maximumMessageSize: UInt = 0u,
    public var mailslotQuota: UInt = 0u,
    public var nextMessageSize: UInt = 0u,
    public var messagesAvailable: UInt = 0u,
    public var readTimeout: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMailslotQueryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMailslotQueryInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileMailslotQueryInformation =
                    FileMailslotQueryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FileMailslotQueryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumMessageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mailslotQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nextMessageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.messagesAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.readTimeout)
                }
            }
    }
}

public class FileMailslotSetInformation internal constructor(
    readTimeoutCtorArg: MutPtr<Long>,
) {
    public var readTimeout: MutPtr<Long> = readTimeoutCtorArg
        internal set

    public constructor() : this(
        readTimeoutCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Long> = this.readTimeout

    public fun copy(readTimeout: MutPtr<Long> = this.readTimeout): FileMailslotSetInformation = FileMailslotSetInformation(readTimeoutCtorArg = readTimeout)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileMailslotSetInformation) return false
        if (this.readTimeout != other.readTimeout) return false
        return true
    }

    override fun hashCode(): Int = this.readTimeout.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMailslotSetInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileMailslotSetInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileMailslotSetInformation =
                    FileMailslotSetInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileMailslotSetInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr, value.readTimeout)
                }
            }

        public operator fun invoke(
            readTimeout: MutPtr<Long> = MutPtr(0L),
        ): FileMailslotSetInformation =
            FileMailslotSetInformation(
                readTimeoutCtorArg = readTimeout,
            )
    }
}

public data class FileModeInformation(
    public var mode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileModeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileModeInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileModeInformation =
                    FileModeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileModeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mode)
                }
            }
    }
}

public class FileMoveClusterInformation internal constructor(
    public var clusterCount: UInt,
    rootDirectoryCtorArg: Handle,
    public var fileNameLength: UInt,
    public var fileName: UShortArray,
) {
    public var rootDirectory: Handle = rootDirectoryCtorArg
        internal set

    public constructor() : this(
        clusterCount = 0u,
        rootDirectoryCtorArg = MutPtr(0L),
        fileNameLength = 0u,
        fileName = UShortArray(1),
    )

    public operator fun component1(): UInt = this.clusterCount

    public operator fun component2(): Handle = this.rootDirectory

    public operator fun component3(): UInt = this.fileNameLength

    public operator fun component4(): UShortArray = this.fileName

    public fun copy(clusterCount: UInt = this.clusterCount, rootDirectory: Handle = this.rootDirectory, fileNameLength: UInt = this.fileNameLength, fileName: UShortArray = this.fileName): FileMoveClusterInformation = FileMoveClusterInformation(clusterCount = clusterCount, rootDirectoryCtorArg = rootDirectory, fileNameLength = fileNameLength, fileName = fileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileMoveClusterInformation) return false
        if (this.clusterCount != other.clusterCount) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clusterCount.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clusterCount: UInt = 0u,
            rootDirectory: Handle = MutPtr(0L),
            fileNameLength: UInt = 0u,
            fileName: UShortArray = UShortArray(1),
        ): FileMoveClusterInformation =
            FileMoveClusterInformation(
                clusterCount = clusterCount,
                rootDirectoryCtorArg = rootDirectory,
                fileNameLength = fileNameLength,
                fileName = fileName,
            )
    }
}

public data class FileNamesInformation(
    public var nextEntryOffset: UInt = 0u,
    public var fileIndex: UInt = 0u,
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNamesInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNamesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNamesInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileNamesInformation =
                    FileNamesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileNamesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fileIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.fileName)
                }
            }
    }
}

public data class FileNameInformation(
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNameInformation) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNameInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNameInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileNameInformation =
                    FileNameInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileNameInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.fileName)
                }
            }
    }
}

public data class FileNetworkOpenInformation(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNetworkOpenInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNetworkOpenInformation> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileNetworkOpenInformation =
                    FileNetworkOpenInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: FileNetworkOpenInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.fileAttributes)
                }
            }
    }
}

public data class FileNetworkPhysicalNameInformation(
    public var fileNameLength: UInt = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileNetworkPhysicalNameInformation) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNetworkPhysicalNameInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileNetworkPhysicalNameInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileNetworkPhysicalNameInformation =
                    FileNetworkPhysicalNameInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileNetworkPhysicalNameInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.fileName)
                }
            }
    }
}

public data class FileObjectidInformation(
    public var fileReference: Long = 0L,
    public var objectId: UByteArray = UByteArray(16),
    public var anonymous: FileObjectidInformation0 = FileObjectidInformation0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidInformation) return false
        if (this.fileReference != other.fileReference) return false
        if (!this.objectId.contentEquals(other.objectId)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileReference.hashCode()
        result = 31 * result + this.objectId.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class FileObjectidInformation0(
    public var anonymous: FileObjectidInformation00 = FileObjectidInformation00(),
    public var extendedInfo: UByteArray = UByteArray(48),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidInformation0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.extendedInfo.contentEquals(other.extendedInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.extendedInfo.contentHashCode()
        return result
    }
}

public data class FileObjectidInformation00(
    public var birthVolumeId: UByteArray = UByteArray(16),
    public var birthObjectId: UByteArray = UByteArray(16),
    public var domainId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileObjectidInformation00) return false
        if (!this.birthVolumeId.contentEquals(other.birthVolumeId)) return false
        if (!this.birthObjectId.contentEquals(other.birthObjectId)) return false
        if (!this.domainId.contentEquals(other.domainId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.birthVolumeId.contentHashCode()
        result = 31 * result + this.birthObjectId.contentHashCode()
        result = 31 * result + this.domainId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileObjectidInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileObjectidInformation00> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FileObjectidInformation00 =
                    FileObjectidInformation00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FileObjectidInformation00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.birthVolumeId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.birthObjectId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.domainId)
                }
            }
    }
}

public class FilePipeAssignEventBuffer internal constructor(
    eventHandleCtorArg: Handle,
    public var keyValue: UInt,
) {
    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public constructor() : this(
        eventHandleCtorArg = MutPtr(0L),
        keyValue = 0u,
    )

    public operator fun component1(): Handle = this.eventHandle

    public operator fun component2(): UInt = this.keyValue

    public fun copy(eventHandle: Handle = this.eventHandle, keyValue: UInt = this.keyValue): FilePipeAssignEventBuffer = FilePipeAssignEventBuffer(eventHandleCtorArg = eventHandle, keyValue = keyValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeAssignEventBuffer) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.keyValue != other.keyValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventHandle.hashCode()
        result = 31 * result + this.keyValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eventHandle: Handle = MutPtr(0L),
            keyValue: UInt = 0u,
        ): FilePipeAssignEventBuffer =
            FilePipeAssignEventBuffer(
                eventHandleCtorArg = eventHandle,
                keyValue = keyValue,
            )
    }
}

public class FilePipeClientProcessBuffer internal constructor(
    clientSessionCtorArg: MutPtr<CVoid>,
    clientProcessCtorArg: MutPtr<CVoid>,
) {
    public var clientSession: MutPtr<CVoid> = clientSessionCtorArg
        internal set

    public var clientProcess: MutPtr<CVoid> = clientProcessCtorArg
        internal set

    public constructor() : this(
        clientSessionCtorArg = MutPtr(0L),
        clientProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.clientSession

    public operator fun component2(): MutPtr<CVoid> = this.clientProcess

    public fun copy(clientSession: MutPtr<CVoid> = this.clientSession, clientProcess: MutPtr<CVoid> = this.clientProcess): FilePipeClientProcessBuffer = FilePipeClientProcessBuffer(clientSessionCtorArg = clientSession, clientProcessCtorArg = clientProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeClientProcessBuffer) return false
        if (this.clientSession != other.clientSession) return false
        if (this.clientProcess != other.clientProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientSession.hashCode()
        result = 31 * result + this.clientProcess.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeClientProcessBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeClientProcessBuffer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilePipeClientProcessBuffer =
                    FilePipeClientProcessBuffer(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FilePipeClientProcessBuffer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.clientSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.clientProcess)
                }
            }

        public operator fun invoke(
            clientSession: MutPtr<CVoid> = MutPtr(0L),
            clientProcess: MutPtr<CVoid> = MutPtr(0L),
        ): FilePipeClientProcessBuffer =
            FilePipeClientProcessBuffer(
                clientSessionCtorArg = clientSession,
                clientProcessCtorArg = clientProcess,
            )
    }
}

public class FilePipeClientProcessBufferEx internal constructor(
    clientSessionCtorArg: MutPtr<CVoid>,
    clientProcessCtorArg: MutPtr<CVoid>,
    public var clientComputerNameLength: UShort,
    public var clientComputerBuffer: UShortArray,
) {
    public var clientSession: MutPtr<CVoid> = clientSessionCtorArg
        internal set

    public var clientProcess: MutPtr<CVoid> = clientProcessCtorArg
        internal set

    public constructor() : this(
        clientSessionCtorArg = MutPtr(0L),
        clientProcessCtorArg = MutPtr(0L),
        clientComputerNameLength = 0u,
        clientComputerBuffer = UShortArray(16),
    )

    public operator fun component1(): MutPtr<CVoid> = this.clientSession

    public operator fun component2(): MutPtr<CVoid> = this.clientProcess

    public operator fun component3(): UShort = this.clientComputerNameLength

    public operator fun component4(): UShortArray = this.clientComputerBuffer

    public fun copy(clientSession: MutPtr<CVoid> = this.clientSession, clientProcess: MutPtr<CVoid> = this.clientProcess, clientComputerNameLength: UShort = this.clientComputerNameLength, clientComputerBuffer: UShortArray = this.clientComputerBuffer): FilePipeClientProcessBufferEx = FilePipeClientProcessBufferEx(clientSessionCtorArg = clientSession, clientProcessCtorArg = clientProcess, clientComputerNameLength = clientComputerNameLength, clientComputerBuffer = clientComputerBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeClientProcessBufferEx) return false
        if (this.clientSession != other.clientSession) return false
        if (this.clientProcess != other.clientProcess) return false
        if (this.clientComputerNameLength != other.clientComputerNameLength) return false
        if (!this.clientComputerBuffer.contentEquals(other.clientComputerBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientSession.hashCode()
        result = 31 * result + this.clientProcess.hashCode()
        result = 31 * result + this.clientComputerNameLength.hashCode()
        result = 31 * result + this.clientComputerBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeClientProcessBufferEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeClientProcessBufferEx> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilePipeClientProcessBufferEx =
                    FilePipeClientProcessBufferEx(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: FilePipeClientProcessBufferEx) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.clientSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.clientProcess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.clientComputerNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 18L, value.clientComputerBuffer)
                }
            }

        public operator fun invoke(
            clientSession: MutPtr<CVoid> = MutPtr(0L),
            clientProcess: MutPtr<CVoid> = MutPtr(0L),
            clientComputerNameLength: UShort = 0u,
            clientComputerBuffer: UShortArray = UShortArray(16),
        ): FilePipeClientProcessBufferEx =
            FilePipeClientProcessBufferEx(
                clientSessionCtorArg = clientSession,
                clientProcessCtorArg = clientProcess,
                clientComputerNameLength = clientComputerNameLength,
                clientComputerBuffer = clientComputerBuffer,
            )
    }
}

public class FilePipeClientProcessBufferV2 internal constructor(
    public var clientSession: ULong,
    clientProcessCtorArg: MutPtr<CVoid>,
) {
    public var clientProcess: MutPtr<CVoid> = clientProcessCtorArg
        internal set

    public constructor() : this(
        clientSession = 0uL,
        clientProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.clientSession

    public operator fun component2(): MutPtr<CVoid> = this.clientProcess

    public fun copy(clientSession: ULong = this.clientSession, clientProcess: MutPtr<CVoid> = this.clientProcess): FilePipeClientProcessBufferV2 = FilePipeClientProcessBufferV2(clientSession = clientSession, clientProcessCtorArg = clientProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeClientProcessBufferV2) return false
        if (this.clientSession != other.clientSession) return false
        if (this.clientProcess != other.clientProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clientSession.hashCode()
        result = 31 * result + this.clientProcess.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeClientProcessBufferV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeClientProcessBufferV2> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilePipeClientProcessBufferV2 =
                    FilePipeClientProcessBufferV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FilePipeClientProcessBufferV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.clientSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.clientProcess)
                }
            }

        public operator fun invoke(
            clientSession: ULong = 0uL,
            clientProcess: MutPtr<CVoid> = MutPtr(0L),
        ): FilePipeClientProcessBufferV2 =
            FilePipeClientProcessBufferV2(
                clientSession = clientSession,
                clientProcessCtorArg = clientProcess,
            )
    }
}

public data class FilePipeCreateSymlinkInput(
    public var nameOffset: UShort = 0u,
    public var nameLength: UShort = 0u,
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeCreateSymlinkInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeCreateSymlinkInput> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilePipeCreateSymlinkInput =
                    FilePipeCreateSymlinkInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FilePipeCreateSymlinkInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.substituteNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.substituteNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class FilePipeDeleteSymlinkInput(
    public var nameOffset: UShort = 0u,
    public var nameLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeDeleteSymlinkInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeDeleteSymlinkInput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): FilePipeDeleteSymlinkInput =
                    FilePipeDeleteSymlinkInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: FilePipeDeleteSymlinkInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nameLength)
                }
            }
    }
}

public data class FilePipeEventBuffer(
    public var namedPipeState: UInt = 0u,
    public var entryType: UInt = 0u,
    public var byteCount: UInt = 0u,
    public var keyValue: UInt = 0u,
    public var numberRequests: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeEventBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeEventBuffer> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilePipeEventBuffer =
                    FilePipeEventBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FilePipeEventBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.namedPipeState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.entryType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.keyValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberRequests)
                }
            }
    }
}

public data class FilePipeInformation(
    public var readMode: UInt = 0u,
    public var completionMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilePipeInformation =
                    FilePipeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FilePipeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.readMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.completionMode)
                }
            }
    }
}

public data class FilePipeLocalInformation(
    public var namedPipeType: UInt = 0u,
    public var namedPipeConfiguration: UInt = 0u,
    public var maximumInstances: UInt = 0u,
    public var currentInstances: UInt = 0u,
    public var inboundQuota: UInt = 0u,
    public var readDataAvailable: UInt = 0u,
    public var outboundQuota: UInt = 0u,
    public var writeQuotaAvailable: UInt = 0u,
    public var namedPipeState: UInt = 0u,
    public var namedPipeEnd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeLocalInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeLocalInformation> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilePipeLocalInformation =
                    FilePipeLocalInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: FilePipeLocalInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.namedPipeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.namedPipeConfiguration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.currentInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.inboundQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.readDataAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.outboundQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.writeQuotaAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.namedPipeState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.namedPipeEnd)
                }
            }
    }
}

public data class FilePipePeekBuffer(
    public var namedPipeState: UInt = 0u,
    public var readDataAvailable: UInt = 0u,
    public var numberOfMessages: UInt = 0u,
    public var messageLength: UInt = 0u,
    public var data: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipePeekBuffer) return false
        if (this.namedPipeState != other.namedPipeState) return false
        if (this.readDataAvailable != other.readDataAvailable) return false
        if (this.numberOfMessages != other.numberOfMessages) return false
        if (this.messageLength != other.messageLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.namedPipeState.hashCode()
        result = 31 * result + this.readDataAvailable.hashCode()
        result = 31 * result + this.numberOfMessages.hashCode()
        result = 31 * result + this.messageLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipePeekBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipePeekBuffer> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FilePipePeekBuffer =
                    FilePipePeekBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FilePipePeekBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.namedPipeState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.readDataAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfMessages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.messageLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 16L, value.data)
                }
            }
    }
}

public data class FilePipeRemoteInformation(
    public var collectDataTime: Long = 0L,
    public var maximumCollectionCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeRemoteInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeRemoteInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilePipeRemoteInformation =
                    FilePipeRemoteInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FilePipeRemoteInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.collectDataTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumCollectionCount)
                }
            }
    }
}

public class FilePipeSiloArrivalInput internal constructor(
    jobHandleCtorArg: Handle,
) {
    public var jobHandle: Handle = jobHandleCtorArg
        internal set

    public constructor() : this(
        jobHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.jobHandle

    public fun copy(jobHandle: Handle = this.jobHandle): FilePipeSiloArrivalInput = FilePipeSiloArrivalInput(jobHandleCtorArg = jobHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeSiloArrivalInput) return false
        if (this.jobHandle != other.jobHandle) return false
        return true
    }

    override fun hashCode(): Int = this.jobHandle.hashCode()

    public companion object {
        public operator fun invoke(
            jobHandle: Handle = MutPtr(0L),
        ): FilePipeSiloArrivalInput =
            FilePipeSiloArrivalInput(
                jobHandleCtorArg = jobHandle,
            )
    }
}

public data class FilePipeWaitForBuffer(
    public var timeout: Long = 0L,
    public var nameLength: UInt = 0u,
    public var timeoutSpecified: Boolean = false,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilePipeWaitForBuffer) return false
        if (this.timeout != other.timeout) return false
        if (this.nameLength != other.nameLength) return false
        if (this.timeoutSpecified != other.timeoutSpecified) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeout.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.timeoutSpecified.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeWaitForBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePipeWaitForBuffer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilePipeWaitForBuffer =
                    FilePipeWaitForBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: FilePipeWaitForBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.timeoutSpecified)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 14L, value.name)
                }
            }
    }
}

public data class FilePositionInformation(
    public var currentByteOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePositionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilePositionInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilePositionInformation =
                    FilePositionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FilePositionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.currentByteOffset)
                }
            }
    }
}

public data class FileQuotaInformation(
    public var nextEntryOffset: UInt = 0u,
    public var sidLength: UInt = 0u,
    public var changeTime: Long = 0L,
    public var quotaUsed: Long = 0L,
    public var quotaThreshold: Long = 0L,
    public var quotaLimit: Long = 0L,
    public var sid: Sid = Sid(),
)

public data class FileRemoteProtocolInformation(
    public var structureVersion: UShort = 0u,
    public var structureSize: UShort = 0u,
    public var protocol: UInt = 0u,
    public var protocolMajorVersion: UShort = 0u,
    public var protocolMinorVersion: UShort = 0u,
    public var protocolRevision: UShort = 0u,
    public var reserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var genericReserved: FileRemoteProtocolInformation0 = FileRemoteProtocolInformation0(),
    public var protocolSpecific: FileRemoteProtocolInformation1 = FileRemoteProtocolInformation1(),
)

public data class FileRemoteProtocolInformation0(
    public var reserved: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInformation0) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInformation0 =
                    FileRemoteProtocolInformation0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInformation0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class FileRemoteProtocolInformation1(
    public var smb2: FileRemoteProtocolInformation10 = FileRemoteProtocolInformation10(),
    public var reserved: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInformation1) return false
        if (this.smb2 != other.smb2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.smb2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FileRemoteProtocolInformation10(
    public var server: FileRemoteProtocolInformation100 = FileRemoteProtocolInformation100(),
    public var share: FileRemoteProtocolInformation101 = FileRemoteProtocolInformation101(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation10> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInformation10 =
                    FileRemoteProtocolInformation10(
                        (FileRemoteProtocolInformation100.typeLayout()).readNative(addr),
                        (FileRemoteProtocolInformation101.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInformation10) {
                    (FileRemoteProtocolInformation100.typeLayout()).writeNative(addr, value.server)
                    (FileRemoteProtocolInformation101.typeLayout()).writeNative(addr + 4L, value.share)
                }
            }
    }
}

public data class FileRemoteProtocolInformation100(
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation100> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation100> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInformation100 =
                    FileRemoteProtocolInformation100(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInformation100) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                }
            }
    }
}

public data class FileRemoteProtocolInformation101(
    public var capabilities: UInt = 0u,
    public var shareFlags: UInt = 0u,
    public var shareType: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRemoteProtocolInformation101) return false
        if (this.capabilities != other.capabilities) return false
        if (this.shareFlags != other.shareFlags) return false
        if (this.shareType != other.shareType) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.shareFlags.hashCode()
        result = 31 * result + this.shareType.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation101> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileRemoteProtocolInformation101> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileRemoteProtocolInformation101 =
                    FileRemoteProtocolInformation101(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FileRemoteProtocolInformation101) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shareFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.shareType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 9L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved1)
                }
            }
    }
}

public class FileRenameInformation internal constructor(
    public var anonymous: FileRenameInformation0,
    rootDirectoryCtorArg: Handle,
    public var fileNameLength: UInt,
    public var fileName: UShortArray,
) {
    public var rootDirectory: Handle = rootDirectoryCtorArg
        internal set

    public constructor() : this(
        anonymous = FileRenameInformation0(),
        rootDirectoryCtorArg = MutPtr(0L),
        fileNameLength = 0u,
        fileName = UShortArray(1),
    )

    public operator fun component1(): FileRenameInformation0 = this.anonymous

    public operator fun component2(): Handle = this.rootDirectory

    public operator fun component3(): UInt = this.fileNameLength

    public operator fun component4(): UShortArray = this.fileName

    public fun copy(anonymous: FileRenameInformation0 = this.anonymous, rootDirectory: Handle = this.rootDirectory, fileNameLength: UInt = this.fileNameLength, fileName: UShortArray = this.fileName): FileRenameInformation = FileRenameInformation(anonymous = anonymous, rootDirectoryCtorArg = rootDirectory, fileNameLength = fileNameLength, fileName = fileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileRenameInformation) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: FileRenameInformation0 = FileRenameInformation0(),
            rootDirectory: Handle = MutPtr(0L),
            fileNameLength: UInt = 0u,
            fileName: UShortArray = UShortArray(1),
        ): FileRenameInformation =
            FileRenameInformation(
                anonymous = anonymous,
                rootDirectoryCtorArg = rootDirectory,
                fileNameLength = fileNameLength,
                fileName = fileName,
            )
    }
}

public data class FileRenameInformation0(
    public var replaceIfExists: Boolean = false,
    public var flags: UInt = 0u,
)

public data class FileReparsePointInformation(
    public var fileReference: Long = 0L,
    public var tag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileReparsePointInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileReparsePointInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileReparsePointInformation =
                    FileReparsePointInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FileReparsePointInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tag)
                }
            }
    }
}

public data class FileStandardInformation(
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var numberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileStandardInformation =
                    FileStandardInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
                    )
                override fun writeNative(addr: Long, value: FileStandardInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.deletePending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.directory)
                }
            }
    }
}

public data class FileStandardLinkInformation(
    public var numberOfAccessibleLinks: UInt = 0u,
    public var totalNumberOfLinks: UInt = 0u,
    public var deletePending: Boolean = false,
    public var directory: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardLinkInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStandardLinkInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileStandardLinkInformation =
                    FileStandardLinkInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: FileStandardLinkInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfAccessibleLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalNumberOfLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.deletePending)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.directory)
                }
            }
    }
}

public data class FileStatInformation(
    public var fileId: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
    public var numberOfLinks: UInt = 0u,
    public var effectiveAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStatInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStatInformation> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileStatInformation =
                    FileStatInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: FileStatInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.reparseTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.numberOfLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.effectiveAccess)
                }
            }
    }
}

public class FileStatLxInformation(
    public var fileId: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
    public var numberOfLinks: UInt = 0u,
    public var effectiveAccess: UInt = 0u,
    public var lxFlags: UInt = 0u,
    public var lxUid: UInt = 0u,
    public var lxGid: UInt = 0u,
    public var lxMode: UInt = 0u,
    public var lxDeviceIdMajor: UInt = 0u,
    public var lxDeviceIdMinor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStatLxInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStatLxInformation> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileStatLxInformation =
                    FileStatLxInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: FileStatLxInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.reparseTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.numberOfLinks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.effectiveAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.lxFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.lxUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.lxGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.lxMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.lxDeviceIdMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.lxDeviceIdMinor)
                }
            }
    }
}

public data class FileStorageReserveIdInformation(
    public var storageReserveId: StorageReserveId = 0,
)

public data class FileStreamInformation(
    public var nextEntryOffset: UInt = 0u,
    public var streamNameLength: UInt = 0u,
    public var streamSize: Long = 0L,
    public var streamAllocationSize: Long = 0L,
    public var streamName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileStreamInformation) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.streamNameLength != other.streamNameLength) return false
        if (this.streamSize != other.streamSize) return false
        if (this.streamAllocationSize != other.streamAllocationSize) return false
        if (!this.streamName.contentEquals(other.streamName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.streamNameLength.hashCode()
        result = 31 * result + this.streamSize.hashCode()
        result = 31 * result + this.streamAllocationSize.hashCode()
        result = 31 * result + this.streamName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStreamInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileStreamInformation> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileStreamInformation =
                    FileStreamInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileStreamInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.streamNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.streamSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.streamAllocationSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.streamName)
                }
            }
    }
}

public data class FileTimestamps(
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileTimestamps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileTimestamps> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FileTimestamps =
                    FileTimestamps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FileTimestamps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.changeTime)
                }
            }
    }
}

public class FileTrackingInformation internal constructor(
    destinationFileCtorArg: Handle,
    public var objectInformationLength: UInt,
    public var objectInformation: ByteArray,
) {
    public var destinationFile: Handle = destinationFileCtorArg
        internal set

    public constructor() : this(
        destinationFileCtorArg = MutPtr(0L),
        objectInformationLength = 0u,
        objectInformation = ByteArray(1),
    )

    public operator fun component1(): Handle = this.destinationFile

    public operator fun component2(): UInt = this.objectInformationLength

    public operator fun component3(): ByteArray = this.objectInformation

    public fun copy(destinationFile: Handle = this.destinationFile, objectInformationLength: UInt = this.objectInformationLength, objectInformation: ByteArray = this.objectInformation): FileTrackingInformation = FileTrackingInformation(destinationFileCtorArg = destinationFile, objectInformationLength = objectInformationLength, objectInformation = objectInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileTrackingInformation) return false
        if (this.destinationFile != other.destinationFile) return false
        if (this.objectInformationLength != other.objectInformationLength) return false
        if (!this.objectInformation.contentEquals(other.objectInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.destinationFile.hashCode()
        result = 31 * result + this.objectInformationLength.hashCode()
        result = 31 * result + this.objectInformation.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            destinationFile: Handle = MutPtr(0L),
            objectInformationLength: UInt = 0u,
            objectInformation: ByteArray = ByteArray(1),
        ): FileTrackingInformation =
            FileTrackingInformation(
                destinationFileCtorArg = destinationFile,
                objectInformationLength = objectInformationLength,
                objectInformation = objectInformation,
            )
    }
}

public data class FileVolumeNameInformation(
    public var deviceNameLength: UInt = 0u,
    public var deviceName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileVolumeNameInformation) return false
        if (this.deviceNameLength != other.deviceNameLength) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceNameLength.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileVolumeNameInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileVolumeNameInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FileVolumeNameInformation =
                    FileVolumeNameInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileVolumeNameInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.deviceName)
                }
            }
    }
}

public data class FsctlGhostFileExtentsInputBuffer(
    public var fileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var recallOwnerGuid: Guid = Guid(),
    public var recallMetadataBufferSize: UInt = 0u,
    public var recallMetadataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlGhostFileExtentsInputBuffer) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.byteCount != other.byteCount) return false
        if (this.recallOwnerGuid != other.recallOwnerGuid) return false
        if (this.recallMetadataBufferSize != other.recallMetadataBufferSize) return false
        if (!this.recallMetadataBuffer.contentEquals(other.recallMetadataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        result = 31 * result + this.recallOwnerGuid.hashCode()
        result = 31 * result + this.recallMetadataBufferSize.hashCode()
        result = 31 * result + this.recallMetadataBuffer.contentHashCode()
        return result
    }
}

public data class FsctlQueryGhostedFileExtentsInputRange(
    public var fileOffset: Long = 0L,
    public var byteCount: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryGhostedFileExtentsInputRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryGhostedFileExtentsInputRange> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsctlQueryGhostedFileExtentsInputRange =
                    FsctlQueryGhostedFileExtentsInputRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FsctlQueryGhostedFileExtentsInputRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.byteCount)
                }
            }
    }
}

public data class FsctlQueryGhostedFileExtentsOutput(
    public var extentCount: UInt = 0u,
    public var totalExtentCount: UInt = 0u,
    public var extents: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsctlQueryGhostedFileExtentsOutput) return false
        if (this.extentCount != other.extentCount) return false
        if (this.totalExtentCount != other.totalExtentCount) return false
        if (!this.extents.contentEquals(other.extents)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extentCount.hashCode()
        result = 31 * result + this.totalExtentCount.hashCode()
        result = 31 * result + this.extents.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryGhostedFileExtentsOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryGhostedFileExtentsOutput> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsctlQueryGhostedFileExtentsOutput =
                    FsctlQueryGhostedFileExtentsOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FsctlQueryGhostedFileExtentsOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalExtentCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.extents)
                }
            }
    }
}

public data class FsctlQueryVolumeNumaInfoOutput(
    public var numaNode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryVolumeNumaInfoOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlQueryVolumeNumaInfoOutput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsctlQueryVolumeNumaInfoOutput =
                    FsctlQueryVolumeNumaInfoOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsctlQueryVolumeNumaInfoOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numaNode)
                }
            }
    }
}

public data class FsctlUnmapSpaceInputBuffer(
    public var bytesToUnmap: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlUnmapSpaceInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlUnmapSpaceInputBuffer> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsctlUnmapSpaceInputBuffer =
                    FsctlUnmapSpaceInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsctlUnmapSpaceInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.bytesToUnmap)
                }
            }
    }
}

public data class FsctlUnmapSpaceOutput(
    public var bytesUnmapped: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlUnmapSpaceOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsctlUnmapSpaceOutput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsctlUnmapSpaceOutput =
                    FsctlUnmapSpaceOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsctlUnmapSpaceOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.bytesUnmapped)
                }
            }
    }
}

public class FsrtlAdvancedFcbHeader internal constructor(
    public var base: FsrtlCommonFcbHeader,
    fastMutexCtorArg: MutPtr<FastMutex>,
    public var filterContexts: ListEntry,
    public var pushLock: Int,
    fileContextSupportPointerCtorArg: MutPtr<MutPtr<CVoid>>,
    public var anonymous: FsrtlAdvancedFcbHeader0,
    aePushLockCtorArg: MutPtr<CVoid>,
    public var bypassIoOpenCount: UInt,
) {
    public var fastMutex: MutPtr<FastMutex> = fastMutexCtorArg
        internal set

    public var fileContextSupportPointer: MutPtr<MutPtr<CVoid>> = fileContextSupportPointerCtorArg
        internal set

    public var aePushLock: MutPtr<CVoid> = aePushLockCtorArg
        internal set

    public constructor() : this(
        base = FsrtlCommonFcbHeader(),
        fastMutexCtorArg = MutPtr(0L),
        filterContexts = ListEntry(),
        pushLock = 0,
        fileContextSupportPointerCtorArg = MutPtr(0L),
        anonymous = FsrtlAdvancedFcbHeader0(),
        aePushLockCtorArg = MutPtr(0L),
        bypassIoOpenCount = 0u,
    )

    public operator fun component1(): FsrtlCommonFcbHeader = this.base

    public operator fun component2(): MutPtr<FastMutex> = this.fastMutex

    public operator fun component3(): ListEntry = this.filterContexts

    public operator fun component4(): Int = this.pushLock

    public operator fun component5(): MutPtr<MutPtr<CVoid>> = this.fileContextSupportPointer

    public operator fun component6(): FsrtlAdvancedFcbHeader0 = this.anonymous

    public operator fun component7(): MutPtr<CVoid> = this.aePushLock

    public operator fun component8(): UInt = this.bypassIoOpenCount

    public fun copy(base: FsrtlCommonFcbHeader = this.base, fastMutex: MutPtr<FastMutex> = this.fastMutex, filterContexts: ListEntry = this.filterContexts, pushLock: Int = this.pushLock, fileContextSupportPointer: MutPtr<MutPtr<CVoid>> = this.fileContextSupportPointer, anonymous: FsrtlAdvancedFcbHeader0 = this.anonymous, aePushLock: MutPtr<CVoid> = this.aePushLock, bypassIoOpenCount: UInt = this.bypassIoOpenCount): FsrtlAdvancedFcbHeader = FsrtlAdvancedFcbHeader(base = base, fastMutexCtorArg = fastMutex, filterContexts = filterContexts, pushLock = pushLock, fileContextSupportPointerCtorArg = fileContextSupportPointer, anonymous = anonymous, aePushLockCtorArg = aePushLock, bypassIoOpenCount = bypassIoOpenCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlAdvancedFcbHeader) return false
        if (this.base != other.base) return false
        if (this.fastMutex != other.fastMutex) return false
        if (this.filterContexts != other.filterContexts) return false
        if (this.pushLock != other.pushLock) return false
        if (this.fileContextSupportPointer != other.fileContextSupportPointer) return false
        if (this.anonymous != other.anonymous) return false
        if (this.aePushLock != other.aePushLock) return false
        if (this.bypassIoOpenCount != other.bypassIoOpenCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.fastMutex.hashCode()
        result = 31 * result + this.filterContexts.hashCode()
        result = 31 * result + this.pushLock.hashCode()
        result = 31 * result + this.fileContextSupportPointer.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.aePushLock.hashCode()
        result = 31 * result + this.bypassIoOpenCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: FsrtlCommonFcbHeader = FsrtlCommonFcbHeader(),
            fastMutex: MutPtr<FastMutex> = MutPtr(0L),
            filterContexts: ListEntry = ListEntry(),
            pushLock: Int = 0,
            fileContextSupportPointer: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            anonymous: FsrtlAdvancedFcbHeader0 = FsrtlAdvancedFcbHeader0(),
            aePushLock: MutPtr<CVoid> = MutPtr(0L),
            bypassIoOpenCount: UInt = 0u,
        ): FsrtlAdvancedFcbHeader =
            FsrtlAdvancedFcbHeader(
                base = base,
                fastMutexCtorArg = fastMutex,
                filterContexts = filterContexts,
                pushLock = pushLock,
                fileContextSupportPointerCtorArg = fileContextSupportPointer,
                anonymous = anonymous,
                aePushLockCtorArg = aePushLock,
                bypassIoOpenCount = bypassIoOpenCount,
            )
    }
}

public class FsrtlAdvancedFcbHeader0 internal constructor(
    oplockCtorArg: MutPtr<CVoid>,
    reservedForRemoteCtorArg: MutPtr<CVoid>,
) {
    public var oplock: MutPtr<CVoid> = oplockCtorArg
        internal set

    public var reservedForRemote: MutPtr<CVoid> = reservedForRemoteCtorArg
        internal set

    public constructor() : this(
        oplockCtorArg = MutPtr(0L),
        reservedForRemoteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.oplock

    public operator fun component2(): MutPtr<CVoid> = this.reservedForRemote

    public fun copy(oplock: MutPtr<CVoid> = this.oplock, reservedForRemote: MutPtr<CVoid> = this.reservedForRemote): FsrtlAdvancedFcbHeader0 = FsrtlAdvancedFcbHeader0(oplockCtorArg = oplock, reservedForRemoteCtorArg = reservedForRemote)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlAdvancedFcbHeader0) return false
        if (this.oplock != other.oplock) return false
        if (this.reservedForRemote != other.reservedForRemote) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oplock.hashCode()
        result = 31 * result + this.reservedForRemote.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            oplock: MutPtr<CVoid> = MutPtr(0L),
            reservedForRemote: MutPtr<CVoid> = MutPtr(0L),
        ): FsrtlAdvancedFcbHeader0 =
            FsrtlAdvancedFcbHeader0(
                oplockCtorArg = oplock,
                reservedForRemoteCtorArg = reservedForRemote,
            )
    }
}

public class FsrtlAuxiliaryBuffer internal constructor(
    bufferCtorArg: MutPtr<CVoid>,
    public var length: UInt,
    public var flags: UInt,
    mdlCtorArg: MutPtr<Mdl>,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public var mdl: MutPtr<Mdl> = mdlCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        length = 0u,
        flags = 0u,
        mdlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.buffer

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Mdl> = this.mdl

    public fun copy(buffer: MutPtr<CVoid> = this.buffer, length: UInt = this.length, flags: UInt = this.flags, mdl: MutPtr<Mdl> = this.mdl): FsrtlAuxiliaryBuffer = FsrtlAuxiliaryBuffer(bufferCtorArg = buffer, length = length, flags = flags, mdlCtorArg = mdl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlAuxiliaryBuffer) return false
        if (this.buffer != other.buffer) return false
        if (this.length != other.length) return false
        if (this.flags != other.flags) return false
        if (this.mdl != other.mdl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.mdl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlAuxiliaryBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlAuxiliaryBuffer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsrtlAuxiliaryBuffer =
                    FsrtlAuxiliaryBuffer(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FsrtlAuxiliaryBuffer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 16L, value.mdl)
                }
            }

        public operator fun invoke(
            buffer: MutPtr<CVoid> = MutPtr(0L),
            length: UInt = 0u,
            flags: UInt = 0u,
            mdl: MutPtr<Mdl> = MutPtr(0L),
        ): FsrtlAuxiliaryBuffer =
            FsrtlAuxiliaryBuffer(
                bufferCtorArg = buffer,
                length = length,
                flags = flags,
                mdlCtorArg = mdl,
            )
    }
}

public class FsrtlCommonFcbHeader internal constructor(
    public var nodeTypeCode: Short,
    public var nodeByteSize: Short,
    public var flags: UByte,
    public var isFastIoPossible: UByte,
    public var flags2: UByte,
    public var bitfield: UByte,
    resourceCtorArg: MutPtr<Eresource>,
    pagingIoResourceCtorArg: MutPtr<Eresource>,
    public var allocationSize: Long,
    public var fileSize: Long,
    public var validDataLength: Long,
) {
    public var resource: MutPtr<Eresource> = resourceCtorArg
        internal set

    public var pagingIoResource: MutPtr<Eresource> = pagingIoResourceCtorArg
        internal set

    public constructor() : this(
        nodeTypeCode = 0,
        nodeByteSize = 0,
        flags = 0u,
        isFastIoPossible = 0u,
        flags2 = 0u,
        bitfield = 0u,
        resourceCtorArg = MutPtr(0L),
        pagingIoResourceCtorArg = MutPtr(0L),
        allocationSize = 0L,
        fileSize = 0L,
        validDataLength = 0L,
    )

    public operator fun component1(): Short = this.nodeTypeCode

    public operator fun component2(): Short = this.nodeByteSize

    public operator fun component3(): UByte = this.flags

    public operator fun component4(): UByte = this.isFastIoPossible

    public operator fun component5(): UByte = this.flags2

    public operator fun component6(): UByte = this.bitfield

    public operator fun component7(): MutPtr<Eresource> = this.resource

    public operator fun component8(): MutPtr<Eresource> = this.pagingIoResource

    public operator fun component9(): Long = this.allocationSize

    public operator fun component10(): Long = this.fileSize

    public operator fun component11(): Long = this.validDataLength

    public fun copy(nodeTypeCode: Short = this.nodeTypeCode, nodeByteSize: Short = this.nodeByteSize, flags: UByte = this.flags, isFastIoPossible: UByte = this.isFastIoPossible, flags2: UByte = this.flags2, bitfield: UByte = this.bitfield, resource: MutPtr<Eresource> = this.resource, pagingIoResource: MutPtr<Eresource> = this.pagingIoResource, allocationSize: Long = this.allocationSize, fileSize: Long = this.fileSize, validDataLength: Long = this.validDataLength): FsrtlCommonFcbHeader = FsrtlCommonFcbHeader(nodeTypeCode = nodeTypeCode, nodeByteSize = nodeByteSize, flags = flags, isFastIoPossible = isFastIoPossible, flags2 = flags2, bitfield = bitfield, resourceCtorArg = resource, pagingIoResourceCtorArg = pagingIoResource, allocationSize = allocationSize, fileSize = fileSize, validDataLength = validDataLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlCommonFcbHeader) return false
        if (this.nodeTypeCode != other.nodeTypeCode) return false
        if (this.nodeByteSize != other.nodeByteSize) return false
        if (this.flags != other.flags) return false
        if (this.isFastIoPossible != other.isFastIoPossible) return false
        if (this.flags2 != other.flags2) return false
        if (this.bitfield != other.bitfield) return false
        if (this.resource != other.resource) return false
        if (this.pagingIoResource != other.pagingIoResource) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.fileSize != other.fileSize) return false
        if (this.validDataLength != other.validDataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeTypeCode.hashCode()
        result = 31 * result + this.nodeByteSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.isFastIoPossible.hashCode()
        result = 31 * result + this.flags2.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.resource.hashCode()
        result = 31 * result + this.pagingIoResource.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.fileSize.hashCode()
        result = 31 * result + this.validDataLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlCommonFcbHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlCommonFcbHeader> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsrtlCommonFcbHeader =
                    FsrtlCommonFcbHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Eresource>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Eresource>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FsrtlCommonFcbHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.nodeTypeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.nodeByteSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.isFastIoPossible)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.flags2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Eresource>(64)
                    ).writeNative(addr + 8L, value.resource)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Eresource>(64)
                    ).writeNative(addr + 16L, value.pagingIoResource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.fileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.validDataLength)
                }
            }

        public operator fun invoke(
            nodeTypeCode: Short = 0,
            nodeByteSize: Short = 0,
            flags: UByte = 0u,
            isFastIoPossible: UByte = 0u,
            flags2: UByte = 0u,
            bitfield: UByte = 0u,
            resource: MutPtr<Eresource> = MutPtr(0L),
            pagingIoResource: MutPtr<Eresource> = MutPtr(0L),
            allocationSize: Long = 0L,
            fileSize: Long = 0L,
            validDataLength: Long = 0L,
        ): FsrtlCommonFcbHeader =
            FsrtlCommonFcbHeader(
                nodeTypeCode = nodeTypeCode,
                nodeByteSize = nodeByteSize,
                flags = flags,
                isFastIoPossible = isFastIoPossible,
                flags2 = flags2,
                bitfield = bitfield,
                resourceCtorArg = resource,
                pagingIoResourceCtorArg = pagingIoResource,
                allocationSize = allocationSize,
                fileSize = fileSize,
                validDataLength = validDataLength,
            )
    }
}

public data class FsrtlMupProviderInfoLevel1(
    public var providerId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlMupProviderInfoLevel1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlMupProviderInfoLevel1> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsrtlMupProviderInfoLevel1 =
                    FsrtlMupProviderInfoLevel1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsrtlMupProviderInfoLevel1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.providerId)
                }
            }
    }
}

public data class FsrtlMupProviderInfoLevel2(
    public var providerId: UInt = 0u,
    public var providerName: UnicodeString = UnicodeString(),
)

public class FsrtlPerFileobjectContext internal constructor(
    public var links: ListEntry,
    ownerIdCtorArg: MutPtr<CVoid>,
    instanceIdCtorArg: MutPtr<CVoid>,
) {
    public var ownerId: MutPtr<CVoid> = ownerIdCtorArg
        internal set

    public var instanceId: MutPtr<CVoid> = instanceIdCtorArg
        internal set

    public constructor() : this(
        links = ListEntry(),
        ownerIdCtorArg = MutPtr(0L),
        instanceIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ListEntry = this.links

    public operator fun component2(): MutPtr<CVoid> = this.ownerId

    public operator fun component3(): MutPtr<CVoid> = this.instanceId

    public fun copy(links: ListEntry = this.links, ownerId: MutPtr<CVoid> = this.ownerId, instanceId: MutPtr<CVoid> = this.instanceId): FsrtlPerFileobjectContext = FsrtlPerFileobjectContext(links = links, ownerIdCtorArg = ownerId, instanceIdCtorArg = instanceId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlPerFileobjectContext) return false
        if (this.links != other.links) return false
        if (this.ownerId != other.ownerId) return false
        if (this.instanceId != other.instanceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.links.hashCode()
        result = 31 * result + this.ownerId.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            links: ListEntry = ListEntry(),
            ownerId: MutPtr<CVoid> = MutPtr(0L),
            instanceId: MutPtr<CVoid> = MutPtr(0L),
        ): FsrtlPerFileobjectContext =
            FsrtlPerFileobjectContext(
                links = links,
                ownerIdCtorArg = ownerId,
                instanceIdCtorArg = instanceId,
            )
    }
}

public class FsrtlPerFileContext internal constructor(
    public var links: ListEntry,
    ownerIdCtorArg: MutPtr<CVoid>,
    instanceIdCtorArg: MutPtr<CVoid>,
    public var freeCallback: PfreeFunction,
) {
    public var ownerId: MutPtr<CVoid> = ownerIdCtorArg
        internal set

    public var instanceId: MutPtr<CVoid> = instanceIdCtorArg
        internal set

    public constructor() : this(
        links = ListEntry(),
        ownerIdCtorArg = MutPtr(0L),
        instanceIdCtorArg = MutPtr(0L),
        freeCallback = null,
    )

    public operator fun component1(): ListEntry = this.links

    public operator fun component2(): MutPtr<CVoid> = this.ownerId

    public operator fun component3(): MutPtr<CVoid> = this.instanceId

    public operator fun component4(): PfreeFunction = this.freeCallback

    public fun copy(links: ListEntry = this.links, ownerId: MutPtr<CVoid> = this.ownerId, instanceId: MutPtr<CVoid> = this.instanceId, freeCallback: PfreeFunction = this.freeCallback): FsrtlPerFileContext = FsrtlPerFileContext(links = links, ownerIdCtorArg = ownerId, instanceIdCtorArg = instanceId, freeCallback = freeCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlPerFileContext) return false
        if (this.links != other.links) return false
        if (this.ownerId != other.ownerId) return false
        if (this.instanceId != other.instanceId) return false
        if (this.freeCallback != other.freeCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.links.hashCode()
        result = 31 * result + this.ownerId.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.freeCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            links: ListEntry = ListEntry(),
            ownerId: MutPtr<CVoid> = MutPtr(0L),
            instanceId: MutPtr<CVoid> = MutPtr(0L),
            freeCallback: PfreeFunction = null,
        ): FsrtlPerFileContext =
            FsrtlPerFileContext(
                links = links,
                ownerIdCtorArg = ownerId,
                instanceIdCtorArg = instanceId,
                freeCallback = freeCallback,
            )
    }
}

public class FsrtlPerStreamContext internal constructor(
    public var links: ListEntry,
    ownerIdCtorArg: MutPtr<CVoid>,
    instanceIdCtorArg: MutPtr<CVoid>,
    public var freeCallback: PfreeFunction,
) {
    public var ownerId: MutPtr<CVoid> = ownerIdCtorArg
        internal set

    public var instanceId: MutPtr<CVoid> = instanceIdCtorArg
        internal set

    public constructor() : this(
        links = ListEntry(),
        ownerIdCtorArg = MutPtr(0L),
        instanceIdCtorArg = MutPtr(0L),
        freeCallback = null,
    )

    public operator fun component1(): ListEntry = this.links

    public operator fun component2(): MutPtr<CVoid> = this.ownerId

    public operator fun component3(): MutPtr<CVoid> = this.instanceId

    public operator fun component4(): PfreeFunction = this.freeCallback

    public fun copy(links: ListEntry = this.links, ownerId: MutPtr<CVoid> = this.ownerId, instanceId: MutPtr<CVoid> = this.instanceId, freeCallback: PfreeFunction = this.freeCallback): FsrtlPerStreamContext = FsrtlPerStreamContext(links = links, ownerIdCtorArg = ownerId, instanceIdCtorArg = instanceId, freeCallback = freeCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsrtlPerStreamContext) return false
        if (this.links != other.links) return false
        if (this.ownerId != other.ownerId) return false
        if (this.instanceId != other.instanceId) return false
        if (this.freeCallback != other.freeCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.links.hashCode()
        result = 31 * result + this.ownerId.hashCode()
        result = 31 * result + this.instanceId.hashCode()
        result = 31 * result + this.freeCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            links: ListEntry = ListEntry(),
            ownerId: MutPtr<CVoid> = MutPtr(0L),
            instanceId: MutPtr<CVoid> = MutPtr(0L),
            freeCallback: PfreeFunction = null,
        ): FsrtlPerStreamContext =
            FsrtlPerStreamContext(
                links = links,
                ownerIdCtorArg = ownerId,
                instanceIdCtorArg = instanceId,
                freeCallback = freeCallback,
            )
    }
}

public data class FsrtlUncProviderRegistration(
    public var size: UShort = 0u,
    public var version: UShort = 0u,
    public var anonymous1: FsrtlUncProviderRegistration0 = FsrtlUncProviderRegistration0(),
    public var anonymous2: FsrtlUncProviderRegistration1 = FsrtlUncProviderRegistration1(),
)

public data class FsrtlUncProviderRegistration0(
    public var providerFlags: UInt = 0u,
    public var anonymous: FsrtlUncProviderRegistration00 = FsrtlUncProviderRegistration00(),
)

public data class FsrtlUncProviderRegistration00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlUncProviderRegistration00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlUncProviderRegistration00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsrtlUncProviderRegistration00 =
                    FsrtlUncProviderRegistration00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsrtlUncProviderRegistration00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class FsrtlUncProviderRegistration1(
    public var hardeningCapabilities: UInt = 0u,
    public var anonymous: FsrtlUncProviderRegistration10 = FsrtlUncProviderRegistration10(),
)

public data class FsrtlUncProviderRegistration10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlUncProviderRegistration10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsrtlUncProviderRegistration10> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsrtlUncProviderRegistration10 =
                    FsrtlUncProviderRegistration10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsrtlUncProviderRegistration10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class FsBpioInfo(
    public var activeBypassIoCount: UInt = 0u,
    public var storageDriverNameLen: UShort = 0u,
    public var storageDriverName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsBpioInfo) return false
        if (this.activeBypassIoCount != other.activeBypassIoCount) return false
        if (this.storageDriverNameLen != other.storageDriverNameLen) return false
        if (!this.storageDriverName.contentEquals(other.storageDriverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.activeBypassIoCount.hashCode()
        result = 31 * result + this.storageDriverNameLen.hashCode()
        result = 31 * result + this.storageDriverName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsBpioInfo> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsBpioInfo =
                    FsBpioInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: FsBpioInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.activeBypassIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.storageDriverNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 6L, value.storageDriverName)
                }
            }
    }
}

public data class FsBpioInput(
    public var operation: FsBpioOperations = 0,
    public var inFlags: FsBpioInflags = 0,
    public var reserved1: ULong = 0uL,
    public var reserved2: ULong = 0uL,
)

public data class FsFilterCallbacks(
    public var sizeOfFsFilterCallbacks: UInt = 0u,
    public var reserved: UInt = 0u,
    public var preAcquireForSectionSynchronization: PfsFilterCallback = null,
    public var postAcquireForSectionSynchronization: PfsFilterCompletionCallback = null,
    public var preReleaseForSectionSynchronization: PfsFilterCallback = null,
    public var postReleaseForSectionSynchronization: PfsFilterCompletionCallback = null,
    public var preAcquireForCcFlush: PfsFilterCallback = null,
    public var postAcquireForCcFlush: PfsFilterCompletionCallback = null,
    public var preReleaseForCcFlush: PfsFilterCallback = null,
    public var postReleaseForCcFlush: PfsFilterCompletionCallback = null,
    public var preAcquireForModifiedPageWriter: PfsFilterCallback = null,
    public var postAcquireForModifiedPageWriter: PfsFilterCompletionCallback = null,
    public var preReleaseForModifiedPageWriter: PfsFilterCallback = null,
    public var postReleaseForModifiedPageWriter: PfsFilterCompletionCallback = null,
    public var preQueryOpen: PfsFilterCallback = null,
    public var postQueryOpen: PfsFilterCompletionCallback = null,
)

public class FsFilterCallbackData internal constructor(
    public var sizeOfFsFilterCallbackData: UInt,
    public var operation: UByte,
    public var reserved: UByte,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
    fileObjectCtorArg: MutPtr<FileObject>,
    public var parameters: FsFilterParameters,
) {
    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public constructor() : this(
        sizeOfFsFilterCallbackData = 0u,
        operation = 0u,
        reserved = 0u,
        deviceObjectCtorArg = MutPtr(0L),
        fileObjectCtorArg = MutPtr(0L),
        parameters = FsFilterParameters(),
    )

    public operator fun component1(): UInt = this.sizeOfFsFilterCallbackData

    public operator fun component2(): UByte = this.operation

    public operator fun component3(): UByte = this.reserved

    public operator fun component4(): MutPtr<DeviceObject> = this.deviceObject

    public operator fun component5(): MutPtr<FileObject> = this.fileObject

    public operator fun component6(): FsFilterParameters = this.parameters

    public fun copy(sizeOfFsFilterCallbackData: UInt = this.sizeOfFsFilterCallbackData, operation: UByte = this.operation, reserved: UByte = this.reserved, deviceObject: MutPtr<DeviceObject> = this.deviceObject, fileObject: MutPtr<FileObject> = this.fileObject, parameters: FsFilterParameters = this.parameters): FsFilterCallbackData = FsFilterCallbackData(sizeOfFsFilterCallbackData = sizeOfFsFilterCallbackData, operation = operation, reserved = reserved, deviceObjectCtorArg = deviceObject, fileObjectCtorArg = fileObject, parameters = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsFilterCallbackData) return false
        if (this.sizeOfFsFilterCallbackData != other.sizeOfFsFilterCallbackData) return false
        if (this.operation != other.operation) return false
        if (this.reserved != other.reserved) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.fileObject != other.fileObject) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfFsFilterCallbackData.hashCode()
        result = 31 * result + this.operation.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfFsFilterCallbackData: UInt = 0u,
            operation: UByte = 0u,
            reserved: UByte = 0u,
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
            fileObject: MutPtr<FileObject> = MutPtr(0L),
            parameters: FsFilterParameters = FsFilterParameters(),
        ): FsFilterCallbackData =
            FsFilterCallbackData(
                sizeOfFsFilterCallbackData = sizeOfFsFilterCallbackData,
                operation = operation,
                reserved = reserved,
                deviceObjectCtorArg = deviceObject,
                fileObjectCtorArg = fileObject,
                parameters = parameters,
            )
    }
}

public data class FsFilterParameters(
    public var acquireForModifiedPageWriter: FsFilterParameters0 = FsFilterParameters0(),
    public var releaseForModifiedPageWriter: FsFilterParameters1 = FsFilterParameters1(),
    public var acquireForSectionSynchronization: FsFilterParameters2 = FsFilterParameters2(),
    public var queryOpen: FsFilterParameters3 = FsFilterParameters3(),
    public var others: FsFilterParameters4 = FsFilterParameters4(),
)

public class FsFilterParameters0 internal constructor(
    endingOffsetCtorArg: MutPtr<Long>,
    resourceToReleaseCtorArg: MutPtr<MutPtr<Eresource>>,
) {
    public var endingOffset: MutPtr<Long> = endingOffsetCtorArg
        internal set

    public var resourceToRelease: MutPtr<MutPtr<Eresource>> = resourceToReleaseCtorArg
        internal set

    public constructor() : this(
        endingOffsetCtorArg = MutPtr(0L),
        resourceToReleaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Long> = this.endingOffset

    public operator fun component2(): MutPtr<MutPtr<Eresource>> = this.resourceToRelease

    public fun copy(endingOffset: MutPtr<Long> = this.endingOffset, resourceToRelease: MutPtr<MutPtr<Eresource>> = this.resourceToRelease): FsFilterParameters0 = FsFilterParameters0(endingOffsetCtorArg = endingOffset, resourceToReleaseCtorArg = resourceToRelease)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsFilterParameters0) return false
        if (this.endingOffset != other.endingOffset) return false
        if (this.resourceToRelease != other.resourceToRelease) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endingOffset.hashCode()
        result = 31 * result + this.resourceToRelease.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsFilterParameters0 =
                    FsFilterParameters0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Eresource>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FsFilterParameters0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr, value.endingOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Eresource>>(64)
                    ).writeNative(addr + 8L, value.resourceToRelease)
                }
            }

        public operator fun invoke(
            endingOffset: MutPtr<Long> = MutPtr(0L),
            resourceToRelease: MutPtr<MutPtr<Eresource>> = MutPtr(0L),
        ): FsFilterParameters0 =
            FsFilterParameters0(
                endingOffsetCtorArg = endingOffset,
                resourceToReleaseCtorArg = resourceToRelease,
            )
    }
}

public class FsFilterParameters2 internal constructor(
    public var syncType: FsFilterSectionSyncType,
    public var pageProtection: UInt,
    outputInformationCtorArg: MutPtr<FsFilterSectionSyncOutput>,
    public var flags: UInt,
    public var allocationAttributes: UInt,
) {
    public var outputInformation: MutPtr<FsFilterSectionSyncOutput> = outputInformationCtorArg
        internal set

    public constructor() : this(
        syncType = 0,
        pageProtection = 0u,
        outputInformationCtorArg = MutPtr(0L),
        flags = 0u,
        allocationAttributes = 0u,
    )

    public operator fun component1(): FsFilterSectionSyncType = this.syncType

    public operator fun component2(): UInt = this.pageProtection

    public operator fun component3(): MutPtr<FsFilterSectionSyncOutput> = this.outputInformation

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): UInt = this.allocationAttributes

    public fun copy(syncType: FsFilterSectionSyncType = this.syncType, pageProtection: UInt = this.pageProtection, outputInformation: MutPtr<FsFilterSectionSyncOutput> = this.outputInformation, flags: UInt = this.flags, allocationAttributes: UInt = this.allocationAttributes): FsFilterParameters2 = FsFilterParameters2(syncType = syncType, pageProtection = pageProtection, outputInformationCtorArg = outputInformation, flags = flags, allocationAttributes = allocationAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsFilterParameters2) return false
        if (this.syncType != other.syncType) return false
        if (this.pageProtection != other.pageProtection) return false
        if (this.outputInformation != other.outputInformation) return false
        if (this.flags != other.flags) return false
        if (this.allocationAttributes != other.allocationAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.syncType.hashCode()
        result = 31 * result + this.pageProtection.hashCode()
        result = 31 * result + this.outputInformation.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.allocationAttributes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters2> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsFilterParameters2 =
                    FsFilterParameters2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FsFilterSectionSyncOutput>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FsFilterParameters2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.syncType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageProtection)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FsFilterSectionSyncOutput>(64)
                    ).writeNative(addr + 8L, value.outputInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.allocationAttributes)
                }
            }

        public operator fun invoke(
            syncType: FsFilterSectionSyncType = 0,
            pageProtection: UInt = 0u,
            outputInformation: MutPtr<FsFilterSectionSyncOutput> = MutPtr(0L),
            flags: UInt = 0u,
            allocationAttributes: UInt = 0u,
        ): FsFilterParameters2 =
            FsFilterParameters2(
                syncType = syncType,
                pageProtection = pageProtection,
                outputInformationCtorArg = outputInformation,
                flags = flags,
                allocationAttributes = allocationAttributes,
            )
    }
}

public class FsFilterParameters4 internal constructor(
    argument1CtorArg: MutPtr<CVoid>,
    argument2CtorArg: MutPtr<CVoid>,
    argument3CtorArg: MutPtr<CVoid>,
    argument4CtorArg: MutPtr<CVoid>,
    argument5CtorArg: MutPtr<CVoid>,
) {
    public var argument1: MutPtr<CVoid> = argument1CtorArg
        internal set

    public var argument2: MutPtr<CVoid> = argument2CtorArg
        internal set

    public var argument3: MutPtr<CVoid> = argument3CtorArg
        internal set

    public var argument4: MutPtr<CVoid> = argument4CtorArg
        internal set

    public var argument5: MutPtr<CVoid> = argument5CtorArg
        internal set

    public constructor() : this(
        argument1CtorArg = MutPtr(0L),
        argument2CtorArg = MutPtr(0L),
        argument3CtorArg = MutPtr(0L),
        argument4CtorArg = MutPtr(0L),
        argument5CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.argument1

    public operator fun component2(): MutPtr<CVoid> = this.argument2

    public operator fun component3(): MutPtr<CVoid> = this.argument3

    public operator fun component4(): MutPtr<CVoid> = this.argument4

    public operator fun component5(): MutPtr<CVoid> = this.argument5

    public fun copy(argument1: MutPtr<CVoid> = this.argument1, argument2: MutPtr<CVoid> = this.argument2, argument3: MutPtr<CVoid> = this.argument3, argument4: MutPtr<CVoid> = this.argument4, argument5: MutPtr<CVoid> = this.argument5): FsFilterParameters4 = FsFilterParameters4(argument1CtorArg = argument1, argument2CtorArg = argument2, argument3CtorArg = argument3, argument4CtorArg = argument4, argument5CtorArg = argument5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsFilterParameters4) return false
        if (this.argument1 != other.argument1) return false
        if (this.argument2 != other.argument2) return false
        if (this.argument3 != other.argument3) return false
        if (this.argument4 != other.argument4) return false
        if (this.argument5 != other.argument5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.argument1.hashCode()
        result = 31 * result + this.argument2.hashCode()
        result = 31 * result + this.argument3.hashCode()
        result = 31 * result + this.argument4.hashCode()
        result = 31 * result + this.argument5.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters4> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsFilterParameters4 =
                    FsFilterParameters4(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FsFilterParameters4) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.argument1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.argument2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.argument3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.argument4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.argument5)
                }
            }

        public operator fun invoke(
            argument1: MutPtr<CVoid> = MutPtr(0L),
            argument2: MutPtr<CVoid> = MutPtr(0L),
            argument3: MutPtr<CVoid> = MutPtr(0L),
            argument4: MutPtr<CVoid> = MutPtr(0L),
            argument5: MutPtr<CVoid> = MutPtr(0L),
        ): FsFilterParameters4 =
            FsFilterParameters4(
                argument1CtorArg = argument1,
                argument2CtorArg = argument2,
                argument3CtorArg = argument3,
                argument4CtorArg = argument4,
                argument5CtorArg = argument5,
            )
    }
}

public class FsFilterParameters3 internal constructor(
    irpCtorArg: MutPtr<Irp>,
    fileInformationCtorArg: MutPtr<CVoid>,
    lengthCtorArg: MutPtr<UInt>,
    public var fileInformationClass: FileInformationClass,
    public var completionStatus: Ntstatus,
) {
    public var irp: MutPtr<Irp> = irpCtorArg
        internal set

    public var fileInformation: MutPtr<CVoid> = fileInformationCtorArg
        internal set

    public var length: MutPtr<UInt> = lengthCtorArg
        internal set

    public constructor() : this(
        irpCtorArg = MutPtr(0L),
        fileInformationCtorArg = MutPtr(0L),
        lengthCtorArg = MutPtr(0L),
        fileInformationClass = 0,
        completionStatus = 0,
    )

    public operator fun component1(): MutPtr<Irp> = this.irp

    public operator fun component2(): MutPtr<CVoid> = this.fileInformation

    public operator fun component3(): MutPtr<UInt> = this.length

    public operator fun component4(): FileInformationClass = this.fileInformationClass

    public operator fun component5(): Ntstatus = this.completionStatus

    public fun copy(irp: MutPtr<Irp> = this.irp, fileInformation: MutPtr<CVoid> = this.fileInformation, length: MutPtr<UInt> = this.length, fileInformationClass: FileInformationClass = this.fileInformationClass, completionStatus: Ntstatus = this.completionStatus): FsFilterParameters3 = FsFilterParameters3(irpCtorArg = irp, fileInformationCtorArg = fileInformation, lengthCtorArg = length, fileInformationClass = fileInformationClass, completionStatus = completionStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsFilterParameters3) return false
        if (this.irp != other.irp) return false
        if (this.fileInformation != other.fileInformation) return false
        if (this.length != other.length) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        if (this.completionStatus != other.completionStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irp.hashCode()
        result = 31 * result + this.fileInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        result = 31 * result + this.completionStatus.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            irp: MutPtr<Irp> = MutPtr(0L),
            fileInformation: MutPtr<CVoid> = MutPtr(0L),
            length: MutPtr<UInt> = MutPtr(0L),
            fileInformationClass: FileInformationClass = 0,
            completionStatus: Ntstatus = 0,
        ): FsFilterParameters3 =
            FsFilterParameters3(
                irpCtorArg = irp,
                fileInformationCtorArg = fileInformation,
                lengthCtorArg = length,
                fileInformationClass = fileInformationClass,
                completionStatus = completionStatus,
            )
    }
}

public class FsFilterParameters1 internal constructor(
    resourceToReleaseCtorArg: MutPtr<Eresource>,
) {
    public var resourceToRelease: MutPtr<Eresource> = resourceToReleaseCtorArg
        internal set

    public constructor() : this(
        resourceToReleaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Eresource> = this.resourceToRelease

    public fun copy(resourceToRelease: MutPtr<Eresource> = this.resourceToRelease): FsFilterParameters1 = FsFilterParameters1(resourceToReleaseCtorArg = resourceToRelease)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsFilterParameters1) return false
        if (this.resourceToRelease != other.resourceToRelease) return false
        return true
    }

    override fun hashCode(): Int = this.resourceToRelease.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterParameters1> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FsFilterParameters1 =
                    FsFilterParameters1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Eresource>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FsFilterParameters1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Eresource>(64)
                    ).writeNative(addr, value.resourceToRelease)
                }
            }

        public operator fun invoke(
            resourceToRelease: MutPtr<Eresource> = MutPtr(0L),
        ): FsFilterParameters1 =
            FsFilterParameters1(
                resourceToReleaseCtorArg = resourceToRelease,
            )
    }
}

public data class FsFilterSectionSyncOutput(
    public var structureSize: UInt = 0u,
    public var sizeReturned: UInt = 0u,
    public var flags: UInt = 0u,
    public var desiredReadAlignment: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterSectionSyncOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsFilterSectionSyncOutput> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FsFilterSectionSyncOutput =
                    FsFilterSectionSyncOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FsFilterSectionSyncOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.structureSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeReturned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.desiredReadAlignment)
                }
            }
    }
}

public data class GenerateNameContext(
    public var checksum: UShort = 0u,
    public var checksumInserted: Boolean = false,
    public var nameLength: UByte = 0u,
    public var nameBuffer: UShortArray = UShortArray(8),
    public var extensionLength: UInt = 0u,
    public var extensionBuffer: UShortArray = UShortArray(4),
    public var lastIndexValue: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GenerateNameContext) return false
        if (this.checksum != other.checksum) return false
        if (this.checksumInserted != other.checksumInserted) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.nameBuffer.contentEquals(other.nameBuffer)) return false
        if (this.extensionLength != other.extensionLength) return false
        if (!this.extensionBuffer.contentEquals(other.extensionBuffer)) return false
        if (this.lastIndexValue != other.lastIndexValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.checksum.hashCode()
        result = 31 * result + this.checksumInserted.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.nameBuffer.contentHashCode()
        result = 31 * result + this.extensionLength.hashCode()
        result = 31 * result + this.extensionBuffer.contentHashCode()
        result = 31 * result + this.lastIndexValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenerateNameContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GenerateNameContext> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GenerateNameContext =
                    GenerateNameContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: GenerateNameContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.checksumInserted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 4L, value.nameBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.extensionLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 24L, value.extensionBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.lastIndexValue)
                }
            }
    }
}

public data class GhostedFileExtent(
    public var fileOffset: Long = 0L,
    public var byteCount: Long = 0L,
    public var recallOwnerGuid: Guid = Guid(),
    public var nextEntryOffset: UInt = 0u,
    public var recallMetadataBufferSize: UInt = 0u,
    public var recallMetadataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GhostedFileExtent) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.byteCount != other.byteCount) return false
        if (this.recallOwnerGuid != other.recallOwnerGuid) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.recallMetadataBufferSize != other.recallMetadataBufferSize) return false
        if (!this.recallMetadataBuffer.contentEquals(other.recallMetadataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        result = 31 * result + this.recallOwnerGuid.hashCode()
        result = 31 * result + this.nextEntryOffset.hashCode()
        result = 31 * result + this.recallMetadataBufferSize.hashCode()
        result = 31 * result + this.recallMetadataBuffer.contentHashCode()
        return result
    }
}

public class IoCreateStreamFileOptions internal constructor(
    public var size: UShort,
    public var flags: UShort,
    targetDeviceObjectCtorArg: MutPtr<DeviceObject>,
) {
    public var targetDeviceObject: MutPtr<DeviceObject> = targetDeviceObjectCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0u,
        targetDeviceObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): MutPtr<DeviceObject> = this.targetDeviceObject

    public fun copy(size: UShort = this.size, flags: UShort = this.flags, targetDeviceObject: MutPtr<DeviceObject> = this.targetDeviceObject): IoCreateStreamFileOptions = IoCreateStreamFileOptions(size = size, flags = flags, targetDeviceObjectCtorArg = targetDeviceObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoCreateStreamFileOptions) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.targetDeviceObject != other.targetDeviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.targetDeviceObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCreateStreamFileOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoCreateStreamFileOptions> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IoCreateStreamFileOptions =
                    IoCreateStreamFileOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoCreateStreamFileOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 8L, value.targetDeviceObject)
                }
            }

        public operator fun invoke(
            size: UShort = 0u,
            flags: UShort = 0u,
            targetDeviceObject: MutPtr<DeviceObject> = MutPtr(0L),
        ): IoCreateStreamFileOptions =
            IoCreateStreamFileOptions(
                size = size,
                flags = flags,
                targetDeviceObjectCtorArg = targetDeviceObject,
            )
    }
}

public class IoDeviceHintEcpContext internal constructor(
    targetDeviceCtorArg: MutPtr<DeviceObject>,
    public var remainingName: UnicodeString,
) {
    public var targetDevice: MutPtr<DeviceObject> = targetDeviceCtorArg
        internal set

    public constructor() : this(
        targetDeviceCtorArg = MutPtr(0L),
        remainingName = UnicodeString(),
    )

    public operator fun component1(): MutPtr<DeviceObject> = this.targetDevice

    public operator fun component2(): UnicodeString = this.remainingName

    public fun copy(targetDevice: MutPtr<DeviceObject> = this.targetDevice, remainingName: UnicodeString = this.remainingName): IoDeviceHintEcpContext = IoDeviceHintEcpContext(targetDeviceCtorArg = targetDevice, remainingName = remainingName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoDeviceHintEcpContext) return false
        if (this.targetDevice != other.targetDevice) return false
        if (this.remainingName != other.remainingName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetDevice.hashCode()
        result = 31 * result + this.remainingName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            targetDevice: MutPtr<DeviceObject> = MutPtr(0L),
            remainingName: UnicodeString = UnicodeString(),
        ): IoDeviceHintEcpContext =
            IoDeviceHintEcpContext(
                targetDeviceCtorArg = targetDevice,
                remainingName = remainingName,
            )
    }
}

public data class IoPriorityInfo(
    public var size: UInt = 0u,
    public var threadPriority: UInt = 0u,
    public var pagePriority: UInt = 0u,
    public var ioPriority: IoPriorityHint = 0,
)

public data class IoStopOnSymlinkFilterEcpV0(
    public var out: IoStopOnSymlinkFilterEcpV00 = IoStopOnSymlinkFilterEcpV00(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStopOnSymlinkFilterEcpV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStopOnSymlinkFilterEcpV0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStopOnSymlinkFilterEcpV0 =
                    IoStopOnSymlinkFilterEcpV0(
                        (IoStopOnSymlinkFilterEcpV00.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoStopOnSymlinkFilterEcpV0) {
                    (IoStopOnSymlinkFilterEcpV00.typeLayout()).writeNative(addr, value.out)
                }
            }
    }
}

public data class IoStopOnSymlinkFilterEcpV00(
    public var reparseCount: UInt = 0u,
    public var remainingPathLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStopOnSymlinkFilterEcpV00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStopOnSymlinkFilterEcpV00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IoStopOnSymlinkFilterEcpV00 =
                    IoStopOnSymlinkFilterEcpV00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoStopOnSymlinkFilterEcpV00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reparseCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.remainingPathLength)
                }
            }
    }
}

public class KapcState internal constructor(
    public var apcListHead: List<ListEntry>,
    processCtorArg: MutPtr<Int>,
    public var anonymous1: KapcState0,
    public var kernelApcPending: Boolean,
    public var anonymous2: KapcState1,
) {
    public var process: MutPtr<Int> = processCtorArg
        internal set

    public constructor() : this(
        apcListHead = List(2) { ListEntry() },
        processCtorArg = MutPtr(0L),
        anonymous1 = KapcState0(),
        kernelApcPending = false,
        anonymous2 = KapcState1(),
    )

    public operator fun component1(): List<ListEntry> = this.apcListHead

    public operator fun component2(): MutPtr<Int> = this.process

    public operator fun component3(): KapcState0 = this.anonymous1

    public operator fun component4(): Boolean = this.kernelApcPending

    public operator fun component5(): KapcState1 = this.anonymous2

    public fun copy(apcListHead: List<ListEntry> = this.apcListHead, process: MutPtr<Int> = this.process, anonymous1: KapcState0 = this.anonymous1, kernelApcPending: Boolean = this.kernelApcPending, anonymous2: KapcState1 = this.anonymous2): KapcState = KapcState(apcListHead = apcListHead, processCtorArg = process, anonymous1 = anonymous1, kernelApcPending = kernelApcPending, anonymous2 = anonymous2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KapcState) return false
        if (this.apcListHead != other.apcListHead) return false
        if (this.process != other.process) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.kernelApcPending != other.kernelApcPending) return false
        if (this.anonymous2 != other.anonymous2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.apcListHead.hashCode()
        result = 31 * result + this.process.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.kernelApcPending.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            apcListHead: List<ListEntry> = List(2) { ListEntry() },
            process: MutPtr<Int> = MutPtr(0L),
            anonymous1: KapcState0 = KapcState0(),
            kernelApcPending: Boolean = false,
            anonymous2: KapcState1 = KapcState1(),
        ): KapcState =
            KapcState(
                apcListHead = apcListHead,
                processCtorArg = process,
                anonymous1 = anonymous1,
                kernelApcPending = kernelApcPending,
                anonymous2 = anonymous2,
            )
    }
}

public data class KapcState0(
    public var inProgressFlags: UByte = 0u,
    public var anonymous: KapcState00 = KapcState00(),
)

public data class KapcState00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KapcState00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KapcState00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): KapcState00 =
                    KapcState00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KapcState00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KapcState1(
    public var userApcPendingAll: Boolean = false,
    public var anonymous: KapcState10 = KapcState10(),
)

public data class KapcState10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KapcState10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KapcState10> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): KapcState10 =
                    KapcState10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KapcState10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class LargeMcb internal constructor(
    guardedMutexCtorArg: MutPtr<FastMutex>,
    public var baseMcb: BaseMcb,
) {
    public var guardedMutex: MutPtr<FastMutex> = guardedMutexCtorArg
        internal set

    public constructor() : this(
        guardedMutexCtorArg = MutPtr(0L),
        baseMcb = BaseMcb(),
    )

    public operator fun component1(): MutPtr<FastMutex> = this.guardedMutex

    public operator fun component2(): BaseMcb = this.baseMcb

    public fun copy(guardedMutex: MutPtr<FastMutex> = this.guardedMutex, baseMcb: BaseMcb = this.baseMcb): LargeMcb = LargeMcb(guardedMutexCtorArg = guardedMutex, baseMcb = baseMcb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LargeMcb) return false
        if (this.guardedMutex != other.guardedMutex) return false
        if (this.baseMcb != other.baseMcb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guardedMutex.hashCode()
        result = 31 * result + this.baseMcb.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LargeMcb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LargeMcb> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LargeMcb =
                    LargeMcb(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FastMutex>(64)
                        ).readNative(addr),
                        (BaseMcb.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LargeMcb) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FastMutex>(64)
                    ).writeNative(addr, value.guardedMutex)
                    (BaseMcb.typeLayout()).writeNative(addr + 8L, value.baseMcb)
                }
            }

        public operator fun invoke(
            guardedMutex: MutPtr<FastMutex> = MutPtr(0L),
            baseMcb: BaseMcb = BaseMcb(),
        ): LargeMcb =
            LargeMcb(
                guardedMutexCtorArg = guardedMutex,
                baseMcb = baseMcb,
            )
    }
}

public data class LcnWeakReferenceBuffer(
    public var lcn: Long = 0L,
    public var lengthInClusters: Long = 0L,
    public var referenceCount: UInt = 0u,
    public var state: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LcnWeakReferenceBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LcnWeakReferenceBuffer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LcnWeakReferenceBuffer =
                    LcnWeakReferenceBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: LcnWeakReferenceBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lengthInClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.referenceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.state)
                }
            }
    }
}

public data class LcnWeakReferenceCreateInputBuffer(
    public var offset: Long = 0L,
    public var length: Long = 0L,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LcnWeakReferenceCreateInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LcnWeakReferenceCreateInputBuffer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LcnWeakReferenceCreateInputBuffer =
                    LcnWeakReferenceCreateInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: LcnWeakReferenceCreateInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class LinkTrackingInformation(
    public var type: LinkTrackingInformationType = 0,
    public var volumeId: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LinkTrackingInformation) return false
        if (this.type != other.type) return false
        if (!this.volumeId.contentEquals(other.volumeId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.volumeId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LinkTrackingInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LinkTrackingInformation> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): LinkTrackingInformation =
                    LinkTrackingInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: LinkTrackingInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.volumeId)
                }
            }
    }
}

public data class Mcb(
    public var dummyFieldThatSizesThisStructureCorrectly: LargeMcb = LargeMcb(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mcb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mcb> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mcb =
                    Mcb(
                        (LargeMcb.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Mcb) {
                    (LargeMcb.typeLayout()).writeNative(addr, value.dummyFieldThatSizesThisStructureCorrectly)
                }
            }
    }
}

public class MemoryRangeEntry internal constructor(
    virtualAddressCtorArg: MutPtr<CVoid>,
    public var numberOfBytes: Int,
) {
    public var virtualAddress: MutPtr<CVoid> = virtualAddressCtorArg
        internal set

    public constructor() : this(
        virtualAddressCtorArg = MutPtr(0L),
        numberOfBytes = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.virtualAddress

    public operator fun component2(): Int = this.numberOfBytes

    public fun copy(virtualAddress: MutPtr<CVoid> = this.virtualAddress, numberOfBytes: Int = this.numberOfBytes): MemoryRangeEntry = MemoryRangeEntry(virtualAddressCtorArg = virtualAddress, numberOfBytes = numberOfBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryRangeEntry) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.numberOfBytes != other.numberOfBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualAddress.hashCode()
        result = 31 * result + this.numberOfBytes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryRangeEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryRangeEntry> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryRangeEntry =
                    MemoryRangeEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MemoryRangeEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.numberOfBytes)
                }
            }

        public operator fun invoke(
            virtualAddress: MutPtr<CVoid> = MutPtr(0L),
            numberOfBytes: Int = 0,
        ): MemoryRangeEntry =
            MemoryRangeEntry(
                virtualAddressCtorArg = virtualAddress,
                numberOfBytes = numberOfBytes,
            )
    }
}

public data class MftEnumData(
    public var startFileReferenceNumber: ULong = 0uL,
    public var lowUsn: Long = 0L,
    public var highUsn: Long = 0L,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MftEnumData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MftEnumData> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MftEnumData =
                    MftEnumData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: MftEnumData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lowUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.highUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.minMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.maxMajorVersion)
                }
            }
    }
}

public data class MmPrefetchFlags(
    public var flags: MmPrefetchFlags0 = MmPrefetchFlags0(),
    public var allFlags: UInt = 0u,
)

public data class MmPrefetchFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MmPrefetchFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MmPrefetchFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MmPrefetchFlags0 =
                    MmPrefetchFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MmPrefetchFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Msv10EnumusersRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
)

public class Msv10EnumusersResponse internal constructor(
    public var messageType: Msv10ProtocolMessageType,
    public var numberOfLoggedOnUsers: UInt,
    logonIdsCtorArg: MutPtr<Luid>,
    enumHandlesCtorArg: MutPtr<UInt>,
) {
    public var logonIds: MutPtr<Luid> = logonIdsCtorArg
        internal set

    public var enumHandles: MutPtr<UInt> = enumHandlesCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        numberOfLoggedOnUsers = 0u,
        logonIdsCtorArg = MutPtr(0L),
        enumHandlesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Msv10ProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.numberOfLoggedOnUsers

    public operator fun component3(): MutPtr<Luid> = this.logonIds

    public operator fun component4(): MutPtr<UInt> = this.enumHandles

    public fun copy(messageType: Msv10ProtocolMessageType = this.messageType, numberOfLoggedOnUsers: UInt = this.numberOfLoggedOnUsers, logonIds: MutPtr<Luid> = this.logonIds, enumHandles: MutPtr<UInt> = this.enumHandles): Msv10EnumusersResponse = Msv10EnumusersResponse(messageType = messageType, numberOfLoggedOnUsers = numberOfLoggedOnUsers, logonIdsCtorArg = logonIds, enumHandlesCtorArg = enumHandles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10EnumusersResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.numberOfLoggedOnUsers != other.numberOfLoggedOnUsers) return false
        if (this.logonIds != other.logonIds) return false
        if (this.enumHandles != other.enumHandles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.numberOfLoggedOnUsers.hashCode()
        result = 31 * result + this.logonIds.hashCode()
        result = 31 * result + this.enumHandles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: Msv10ProtocolMessageType = 0,
            numberOfLoggedOnUsers: UInt = 0u,
            logonIds: MutPtr<Luid> = MutPtr(0L),
            enumHandles: MutPtr<UInt> = MutPtr(0L),
        ): Msv10EnumusersResponse =
            Msv10EnumusersResponse(
                messageType = messageType,
                numberOfLoggedOnUsers = numberOfLoggedOnUsers,
                logonIdsCtorArg = logonIds,
                enumHandlesCtorArg = enumHandles,
            )
    }
}

public data class Msv10GetchallenrespRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var parameterControl: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var password: UnicodeString = UnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
    public var userName: UnicodeString = UnicodeString(),
    public var logonDomainName: UnicodeString = UnicodeString(),
    public var serverName: UnicodeString = UnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetchallenrespRequest) return false
        if (this.messageType != other.messageType) return false
        if (this.parameterControl != other.parameterControl) return false
        if (this.logonId != other.logonId) return false
        if (this.password != other.password) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        if (this.userName != other.userName) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.serverName != other.serverName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.serverName.hashCode()
        return result
    }
}

public data class Msv10GetchallenrespRequestV1(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var parameterControl: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var password: UnicodeString = UnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetchallenrespRequestV1) return false
        if (this.messageType != other.messageType) return false
        if (this.parameterControl != other.parameterControl) return false
        if (this.logonId != other.logonId) return false
        if (this.password != other.password) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        return result
    }
}

public data class Msv10GetchallenrespResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var caseSensitiveChallengeResponse: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String =
        io.github.kotlinmania.windowssys.windows.win32.system.kernel
            .String(),
    public var caseInsensitiveChallengeResponse: io.github.kotlinmania.windowssys.windows.win32.system.kernel.String =
        io.github.kotlinmania.windowssys.windows.win32.system.kernel
            .String(),
    public var userName: UnicodeString = UnicodeString(),
    public var logonDomainName: UnicodeString = UnicodeString(),
    public var userSessionKey: UByteArray = UByteArray(16),
    public var lanmanSessionKey: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetchallenrespResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.caseSensitiveChallengeResponse != other.caseSensitiveChallengeResponse) return false
        if (this.caseInsensitiveChallengeResponse != other.caseInsensitiveChallengeResponse) return false
        if (this.userName != other.userName) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (!this.userSessionKey.contentEquals(other.userSessionKey)) return false
        if (!this.lanmanSessionKey.contentEquals(other.lanmanSessionKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.caseSensitiveChallengeResponse.hashCode()
        result = 31 * result + this.caseInsensitiveChallengeResponse.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.userSessionKey.contentHashCode()
        result = 31 * result + this.lanmanSessionKey.contentHashCode()
        return result
    }
}

public data class Msv10GetuserinfoRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public class Msv10GetuserinfoResponse internal constructor(
    public var messageType: Msv10ProtocolMessageType,
    userSidCtorArg: Psid,
    public var userName: UnicodeString,
    public var logonDomainName: UnicodeString,
    public var logonServer: UnicodeString,
    public var logonType: SecurityLogonType,
) {
    public var userSid: Psid = userSidCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        userSidCtorArg = MutPtr(0L),
        userName = UnicodeString(),
        logonDomainName = UnicodeString(),
        logonServer = UnicodeString(),
        logonType = SecurityLogonType(),
    )

    public operator fun component1(): Msv10ProtocolMessageType = this.messageType

    public operator fun component2(): Psid = this.userSid

    public operator fun component3(): UnicodeString = this.userName

    public operator fun component4(): UnicodeString = this.logonDomainName

    public operator fun component5(): UnicodeString = this.logonServer

    public operator fun component6(): SecurityLogonType = this.logonType

    public fun copy(messageType: Msv10ProtocolMessageType = this.messageType, userSid: Psid = this.userSid, userName: UnicodeString = this.userName, logonDomainName: UnicodeString = this.logonDomainName, logonServer: UnicodeString = this.logonServer, logonType: SecurityLogonType = this.logonType): Msv10GetuserinfoResponse = Msv10GetuserinfoResponse(messageType = messageType, userSidCtorArg = userSid, userName = userName, logonDomainName = logonDomainName, logonServer = logonServer, logonType = logonType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10GetuserinfoResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.userSid != other.userSid) return false
        if (this.userName != other.userName) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.logonServer != other.logonServer) return false
        if (this.logonType != other.logonType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.userSid.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.logonServer.hashCode()
        result = 31 * result + this.logonType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: Msv10ProtocolMessageType = 0,
            userSid: Psid = MutPtr(0L),
            userName: UnicodeString = UnicodeString(),
            logonDomainName: UnicodeString = UnicodeString(),
            logonServer: UnicodeString = UnicodeString(),
            logonType: SecurityLogonType = SecurityLogonType(),
        ): Msv10GetuserinfoResponse =
            Msv10GetuserinfoResponse(
                messageType = messageType,
                userSidCtorArg = userSid,
                userName = userName,
                logonDomainName = logonDomainName,
                logonServer = logonServer,
                logonType = logonType,
            )
    }
}

public data class Msv10Lm20ChallengeRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
)

public data class Msv10Lm20ChallengeResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var challengeToClient: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Lm20ChallengeResponse) return false
        if (this.messageType != other.messageType) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        return result
    }
}

public data class NetworkAppInstanceEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var appInstanceID: Guid = Guid(),
)

public data class NetworkAppInstanceVersionEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var versionHigh: ULong = 0uL,
    public var versionLow: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAppInstanceVersionEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkAppInstanceVersionEcpContext> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NetworkAppInstanceVersionEcpContext =
                    NetworkAppInstanceVersionEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NetworkAppInstanceVersionEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.versionHigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.versionLow)
                }
            }
    }
}

public data class NetworkOpenEcpContext(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: NetworkOpenEcpContext0 = NetworkOpenEcpContext0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContext =
                    NetworkOpenEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (NetworkOpenEcpContext0.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (NetworkOpenEcpContext0.typeLayout()).writeNative(addr + 4L, value.anonymous)
                }
            }
    }
}

public data class NetworkOpenEcpContext0(
    public var input: NetworkOpenEcpContext00 = NetworkOpenEcpContext00(),
    public var out: NetworkOpenEcpContext01 = NetworkOpenEcpContext01(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContext0 =
                    NetworkOpenEcpContext0(
                        (NetworkOpenEcpContext00.typeLayout()).readNative(addr),
                        (NetworkOpenEcpContext01.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContext0) {
                    (NetworkOpenEcpContext00.typeLayout()).writeNative(addr, value.input)
                    (NetworkOpenEcpContext01.typeLayout()).writeNative(addr + 12L, value.out)
                }
            }
    }
}

public data class NetworkOpenEcpContext00(
    public var location: NetworkOpenLocationQualifier = 0,
    public var integrity: NetworkOpenIntegrityQualifier = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext00> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContext00 =
                    NetworkOpenEcpContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.integrity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class NetworkOpenEcpContext01(
    public var location: NetworkOpenLocationQualifier = 0,
    public var integrity: NetworkOpenIntegrityQualifier = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContext01> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContext01 =
                    NetworkOpenEcpContext01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContext01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.integrity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class NetworkOpenEcpContextV0(
    public var size: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: NetworkOpenEcpContextV00 = NetworkOpenEcpContextV00(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV0> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContextV0 =
                    NetworkOpenEcpContextV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (NetworkOpenEcpContextV00.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContextV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (NetworkOpenEcpContextV00.typeLayout()).writeNative(addr + 4L, value.anonymous)
                }
            }
    }
}

public data class NetworkOpenEcpContextV00(
    public var input: NetworkOpenEcpContextV000 = NetworkOpenEcpContextV000(),
    public var out: NetworkOpenEcpContextV001 = NetworkOpenEcpContextV001(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContextV00 =
                    NetworkOpenEcpContextV00(
                        (NetworkOpenEcpContextV000.typeLayout()).readNative(addr),
                        (NetworkOpenEcpContextV001.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContextV00) {
                    (NetworkOpenEcpContextV000.typeLayout()).writeNative(addr, value.input)
                    (NetworkOpenEcpContextV001.typeLayout()).writeNative(addr + 8L, value.out)
                }
            }
    }
}

public data class NetworkOpenEcpContextV000(
    public var location: NetworkOpenLocationQualifier = 0,
    public var integrity: NetworkOpenIntegrityQualifier = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV000> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContextV000 =
                    NetworkOpenEcpContextV000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContextV000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.integrity)
                }
            }
    }
}

public data class NetworkOpenEcpContextV001(
    public var location: NetworkOpenLocationQualifier = 0,
    public var integrity: NetworkOpenIntegrityQualifier = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV001> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetworkOpenEcpContextV001> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NetworkOpenEcpContextV001 =
                    NetworkOpenEcpContextV001(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NetworkOpenEcpContextV001) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.integrity)
                }
            }
    }
}

public class NfsOpenEcpContext internal constructor(
    exportAliasCtorArg: MutPtr<UnicodeString>,
    clientSocketAddressCtorArg: MutPtr<SockaddrStorage>,
) {
    public var exportAlias: MutPtr<UnicodeString> = exportAliasCtorArg
        internal set

    public var clientSocketAddress: MutPtr<SockaddrStorage> = clientSocketAddressCtorArg
        internal set

    public constructor() : this(
        exportAliasCtorArg = MutPtr(0L),
        clientSocketAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UnicodeString> = this.exportAlias

    public operator fun component2(): MutPtr<SockaddrStorage> = this.clientSocketAddress

    public fun copy(exportAlias: MutPtr<UnicodeString> = this.exportAlias, clientSocketAddress: MutPtr<SockaddrStorage> = this.clientSocketAddress): NfsOpenEcpContext = NfsOpenEcpContext(exportAliasCtorArg = exportAlias, clientSocketAddressCtorArg = clientSocketAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NfsOpenEcpContext) return false
        if (this.exportAlias != other.exportAlias) return false
        if (this.clientSocketAddress != other.clientSocketAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exportAlias.hashCode()
        result = 31 * result + this.clientSocketAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfsOpenEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfsOpenEcpContext> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NfsOpenEcpContext =
                    NfsOpenEcpContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SockaddrStorage>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NfsOpenEcpContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr, value.exportAlias)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SockaddrStorage>(64)
                    ).writeNative(addr + 8L, value.clientSocketAddress)
                }
            }

        public operator fun invoke(
            exportAlias: MutPtr<UnicodeString> = MutPtr(0L),
            clientSocketAddress: MutPtr<SockaddrStorage> = MutPtr(0L),
        ): NfsOpenEcpContext =
            NfsOpenEcpContext(
                exportAliasCtorArg = exportAlias,
                clientSocketAddressCtorArg = clientSocketAddress,
            )
    }
}

public class Nlstableinfo internal constructor(
    public var oemTableInfo: Cptableinfo,
    public var ansiTableInfo: Cptableinfo,
    upperCaseTableCtorArg: MutPtr<UShort>,
    lowerCaseTableCtorArg: MutPtr<UShort>,
) {
    public var upperCaseTable: MutPtr<UShort> = upperCaseTableCtorArg
        internal set

    public var lowerCaseTable: MutPtr<UShort> = lowerCaseTableCtorArg
        internal set

    public constructor() : this(
        oemTableInfo = Cptableinfo(),
        ansiTableInfo = Cptableinfo(),
        upperCaseTableCtorArg = MutPtr(0L),
        lowerCaseTableCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Cptableinfo = this.oemTableInfo

    public operator fun component2(): Cptableinfo = this.ansiTableInfo

    public operator fun component3(): MutPtr<UShort> = this.upperCaseTable

    public operator fun component4(): MutPtr<UShort> = this.lowerCaseTable

    public fun copy(oemTableInfo: Cptableinfo = this.oemTableInfo, ansiTableInfo: Cptableinfo = this.ansiTableInfo, upperCaseTable: MutPtr<UShort> = this.upperCaseTable, lowerCaseTable: MutPtr<UShort> = this.lowerCaseTable): Nlstableinfo = Nlstableinfo(oemTableInfo = oemTableInfo, ansiTableInfo = ansiTableInfo, upperCaseTableCtorArg = upperCaseTable, lowerCaseTableCtorArg = lowerCaseTable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nlstableinfo) return false
        if (this.oemTableInfo != other.oemTableInfo) return false
        if (this.ansiTableInfo != other.ansiTableInfo) return false
        if (this.upperCaseTable != other.upperCaseTable) return false
        if (this.lowerCaseTable != other.lowerCaseTable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oemTableInfo.hashCode()
        result = 31 * result + this.ansiTableInfo.hashCode()
        result = 31 * result + this.upperCaseTable.hashCode()
        result = 31 * result + this.lowerCaseTable.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlstableinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlstableinfo> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Nlstableinfo =
                    Nlstableinfo(
                        (Cptableinfo.typeLayout()).readNative(addr),
                        (Cptableinfo.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: Nlstableinfo) {
                    (Cptableinfo.typeLayout()).writeNative(addr, value.oemTableInfo)
                    (Cptableinfo.typeLayout()).writeNative(addr + 64L, value.ansiTableInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 128L, value.upperCaseTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 136L, value.lowerCaseTable)
                }
            }

        public operator fun invoke(
            oemTableInfo: Cptableinfo = Cptableinfo(),
            ansiTableInfo: Cptableinfo = Cptableinfo(),
            upperCaseTable: MutPtr<UShort> = MutPtr(0L),
            lowerCaseTable: MutPtr<UShort> = MutPtr(0L),
        ): Nlstableinfo =
            Nlstableinfo(
                oemTableInfo = oemTableInfo,
                ansiTableInfo = ansiTableInfo,
                upperCaseTableCtorArg = upperCaseTable,
                lowerCaseTableCtorArg = lowerCaseTable,
            )
    }
}

public data class OpenReparseList(
    public var openReparseList: ListEntry = ListEntry(),
)

public data class OpenReparseListEntry(
    public var openReparseListEntry: ListEntry = ListEntry(),
    public var reparseTag: UInt = 0u,
    public var flags: UInt = 0u,
    public var reparseGuid: Guid = Guid(),
    public var size: UShort = 0u,
    public var remainingLength: UShort = 0u,
)

public data class OplockKeyContext(
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
    public var parentOplockKey: Guid = Guid(),
    public var targetOplockKey: Guid = Guid(),
    public var reserved: UInt = 0u,
)

public data class OplockKeyEcpContext(
    public var oplockKey: Guid = Guid(),
    public var reserved: UInt = 0u,
)

public class OplockNotifyParams internal constructor(
    public var notifyReason: OplockNotifyReason,
    notifyContextCtorArg: MutPtr<CVoid>,
    irpCtorArg: MutPtr<Irp>,
    public var status: Ntstatus,
) {
    public var notifyContext: MutPtr<CVoid> = notifyContextCtorArg
        internal set

    public var irp: MutPtr<Irp> = irpCtorArg
        internal set

    public constructor() : this(
        notifyReason = 0,
        notifyContextCtorArg = MutPtr(0L),
        irpCtorArg = MutPtr(0L),
        status = 0,
    )

    public operator fun component1(): OplockNotifyReason = this.notifyReason

    public operator fun component2(): MutPtr<CVoid> = this.notifyContext

    public operator fun component3(): MutPtr<Irp> = this.irp

    public operator fun component4(): Ntstatus = this.status

    public fun copy(notifyReason: OplockNotifyReason = this.notifyReason, notifyContext: MutPtr<CVoid> = this.notifyContext, irp: MutPtr<Irp> = this.irp, status: Ntstatus = this.status): OplockNotifyParams = OplockNotifyParams(notifyReason = notifyReason, notifyContextCtorArg = notifyContext, irpCtorArg = irp, status = status)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OplockNotifyParams) return false
        if (this.notifyReason != other.notifyReason) return false
        if (this.notifyContext != other.notifyContext) return false
        if (this.irp != other.irp) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.notifyReason.hashCode()
        result = 31 * result + this.notifyContext.hashCode()
        result = 31 * result + this.irp.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            notifyReason: OplockNotifyReason = 0,
            notifyContext: MutPtr<CVoid> = MutPtr(0L),
            irp: MutPtr<Irp> = MutPtr(0L),
            status: Ntstatus = 0,
        ): OplockNotifyParams =
            OplockNotifyParams(
                notifyReason = notifyReason,
                notifyContextCtorArg = notifyContext,
                irpCtorArg = irp,
                status = status,
            )
    }
}

public data class PhysicalExtentsDescriptor(
    public var numberOfRuns: UInt = 0u,
    public var numberOfValidRuns: UInt = 0u,
    public var run: List<PhysicalMemoryRun> = List(1) { PhysicalMemoryRun() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalExtentsDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalExtentsDescriptor> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PhysicalExtentsDescriptor =
                    PhysicalExtentsDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PhysicalMemoryRun.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PhysicalExtentsDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfRuns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfValidRuns)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PhysicalMemoryRun.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.run)
                }
            }
    }
}

public data class PhysicalMemoryDescriptor(
    public var numberOfRuns: UInt = 0u,
    public var numberOfPages: UInt = 0u,
    public var run: List<PhysicalMemoryRun> = List(1) { PhysicalMemoryRun() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryDescriptor> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PhysicalMemoryDescriptor =
                    PhysicalMemoryDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PhysicalMemoryRun.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfRuns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfPages)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PhysicalMemoryRun.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.run)
                }
            }
    }
}

public data class PhysicalMemoryRun(
    public var basePage: UInt = 0u,
    public var pageCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRun> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRun> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PhysicalMemoryRun =
                    PhysicalMemoryRun(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryRun) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.basePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageCount)
                }
            }
    }
}

public class PrefetchOpenEcpContext internal constructor(
    contextCtorArg: MutPtr<CVoid>,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.context

    public fun copy(context: MutPtr<CVoid> = this.context): PrefetchOpenEcpContext = PrefetchOpenEcpContext(contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrefetchOpenEcpContext) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int = this.context.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrefetchOpenEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrefetchOpenEcpContext> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PrefetchOpenEcpContext =
                    PrefetchOpenEcpContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrefetchOpenEcpContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.context)
                }
            }

        public operator fun invoke(
            context: MutPtr<CVoid> = MutPtr(0L),
        ): PrefetchOpenEcpContext =
            PrefetchOpenEcpContext(
                contextCtorArg = context,
            )
    }
}

public class PrefixTable internal constructor(
    public var nodeTypeCode: Short,
    public var nameLength: Short,
    nextPrefixTreeCtorArg: MutPtr<PrefixTableEntry>,
) {
    public var nextPrefixTree: MutPtr<PrefixTableEntry> = nextPrefixTreeCtorArg
        internal set

    public constructor() : this(
        nodeTypeCode = 0,
        nameLength = 0,
        nextPrefixTreeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.nodeTypeCode

    public operator fun component2(): Short = this.nameLength

    public operator fun component3(): MutPtr<PrefixTableEntry> = this.nextPrefixTree

    public fun copy(nodeTypeCode: Short = this.nodeTypeCode, nameLength: Short = this.nameLength, nextPrefixTree: MutPtr<PrefixTableEntry> = this.nextPrefixTree): PrefixTable = PrefixTable(nodeTypeCode = nodeTypeCode, nameLength = nameLength, nextPrefixTreeCtorArg = nextPrefixTree)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrefixTable) return false
        if (this.nodeTypeCode != other.nodeTypeCode) return false
        if (this.nameLength != other.nameLength) return false
        if (this.nextPrefixTree != other.nextPrefixTree) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeTypeCode.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.nextPrefixTree.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrefixTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrefixTable> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PrefixTable =
                    PrefixTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PrefixTableEntry>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PrefixTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.nodeTypeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PrefixTableEntry>(64)
                    ).writeNative(addr + 8L, value.nextPrefixTree)
                }
            }

        public operator fun invoke(
            nodeTypeCode: Short = 0,
            nameLength: Short = 0,
            nextPrefixTree: MutPtr<PrefixTableEntry> = MutPtr(0L),
        ): PrefixTable =
            PrefixTable(
                nodeTypeCode = nodeTypeCode,
                nameLength = nameLength,
                nextPrefixTreeCtorArg = nextPrefixTree,
            )
    }
}

public class PrefixTableEntry internal constructor(
    public var nodeTypeCode: Short,
    public var nameLength: Short,
    nextPrefixTreeCtorArg: MutPtr<PrefixTableEntry>,
    public var links: RtlSplayLinks,
    prefixCtorArg: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>,
) {
    public var nextPrefixTree: MutPtr<PrefixTableEntry> = nextPrefixTreeCtorArg
        internal set

    public var prefix: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String> = prefixCtorArg
        internal set

    public constructor() : this(
        nodeTypeCode = 0,
        nameLength = 0,
        nextPrefixTreeCtorArg = MutPtr(0L),
        links = RtlSplayLinks(),
        prefixCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.nodeTypeCode

    public operator fun component2(): Short = this.nameLength

    public operator fun component3(): MutPtr<PrefixTableEntry> = this.nextPrefixTree

    public operator fun component4(): RtlSplayLinks = this.links

    public operator fun component5(): MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String> = this.prefix

    public fun copy(nodeTypeCode: Short = this.nodeTypeCode, nameLength: Short = this.nameLength, nextPrefixTree: MutPtr<PrefixTableEntry> = this.nextPrefixTree, links: RtlSplayLinks = this.links, prefix: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String> = this.prefix): PrefixTableEntry = PrefixTableEntry(nodeTypeCode = nodeTypeCode, nameLength = nameLength, nextPrefixTreeCtorArg = nextPrefixTree, links = links, prefixCtorArg = prefix)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrefixTableEntry) return false
        if (this.nodeTypeCode != other.nodeTypeCode) return false
        if (this.nameLength != other.nameLength) return false
        if (this.nextPrefixTree != other.nextPrefixTree) return false
        if (this.links != other.links) return false
        if (this.prefix != other.prefix) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeTypeCode.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.nextPrefixTree.hashCode()
        result = 31 * result + this.links.hashCode()
        result = 31 * result + this.prefix.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nodeTypeCode: Short = 0,
            nameLength: Short = 0,
            nextPrefixTree: MutPtr<PrefixTableEntry> = MutPtr(0L),
            links: RtlSplayLinks = RtlSplayLinks(),
            prefix: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String> = MutPtr(0L),
        ): PrefixTableEntry =
            PrefixTableEntry(
                nodeTypeCode = nodeTypeCode,
                nameLength = nameLength,
                nextPrefixTreeCtorArg = nextPrefixTree,
                links = links,
                prefixCtorArg = prefix,
            )
    }
}

public data class PublicBcb(
    public var nodeTypeCode: Short = 0,
    public var nodeByteSize: Short = 0,
    public var mappedLength: UInt = 0u,
    public var mappedFileOffset: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PublicBcb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PublicBcb> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PublicBcb =
                    PublicBcb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PublicBcb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.nodeTypeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.nodeByteSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mappedLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mappedFileOffset)
                }
            }
    }
}

public data class QueryBadRangesInput(
    public var flags: UInt = 0u,
    public var numRanges: UInt = 0u,
    public var ranges: List<QueryBadRangesInputRange> = List(1) { QueryBadRangesInputRange() },
)

public data class QueryDirectAccessExtents(
    public var fileOffset: Long = 0L,
    public var length: Long = 0L,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryDirectAccessExtents> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryDirectAccessExtents> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QueryDirectAccessExtents =
                    QueryDirectAccessExtents(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: QueryDirectAccessExtents) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public class QueryOnCreateEaInformation internal constructor(
    public var eaBufferSize: UInt,
    eaBufferCtorArg: MutPtr<FileFullEaInformation>,
) {
    public var eaBuffer: MutPtr<FileFullEaInformation> = eaBufferCtorArg
        internal set

    public constructor() : this(
        eaBufferSize = 0u,
        eaBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.eaBufferSize

    public operator fun component2(): MutPtr<FileFullEaInformation> = this.eaBuffer

    public fun copy(eaBufferSize: UInt = this.eaBufferSize, eaBuffer: MutPtr<FileFullEaInformation> = this.eaBuffer): QueryOnCreateEaInformation = QueryOnCreateEaInformation(eaBufferSize = eaBufferSize, eaBufferCtorArg = eaBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryOnCreateEaInformation) return false
        if (this.eaBufferSize != other.eaBufferSize) return false
        if (this.eaBuffer != other.eaBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eaBufferSize.hashCode()
        result = 31 * result + this.eaBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateEaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateEaInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QueryOnCreateEaInformation =
                    QueryOnCreateEaInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FileFullEaInformation>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QueryOnCreateEaInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eaBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FileFullEaInformation>(64)
                    ).writeNative(addr + 8L, value.eaBuffer)
                }
            }

        public operator fun invoke(
            eaBufferSize: UInt = 0u,
            eaBuffer: MutPtr<FileFullEaInformation> = MutPtr(0L),
        ): QueryOnCreateEaInformation =
            QueryOnCreateEaInformation(
                eaBufferSize = eaBufferSize,
                eaBufferCtorArg = eaBuffer,
            )
    }
}

public data class QueryOnCreateEcpContext(
    public var requestedClasses: UInt = 0u,
    public var classesProcessed: UInt = 0u,
    public var classesWithErrors: UInt = 0u,
    public var classesWithNoData: UInt = 0u,
    public var statInformation: QueryOnCreateFileStatInformation = QueryOnCreateFileStatInformation(),
    public var lxInformation: QueryOnCreateFileLxInformation = QueryOnCreateFileLxInformation(),
    public var eaInformation: QueryOnCreateEaInformation = QueryOnCreateEaInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateEcpContext> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QueryOnCreateEcpContext =
                    QueryOnCreateEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (QueryOnCreateFileStatInformation.typeLayout()).readNative(addr + 16L),
                        (QueryOnCreateFileLxInformation.typeLayout()).readNative(addr + 88L),
                        (QueryOnCreateEaInformation.typeLayout()).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: QueryOnCreateEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestedClasses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.classesProcessed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.classesWithErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.classesWithNoData)
                    (QueryOnCreateFileStatInformation.typeLayout()).writeNative(addr + 16L, value.statInformation)
                    (QueryOnCreateFileLxInformation.typeLayout()).writeNative(addr + 88L, value.lxInformation)
                    (QueryOnCreateEaInformation.typeLayout()).writeNative(addr + 120L, value.eaInformation)
                }
            }
    }
}

public data class QueryOnCreateFileLxInformation(
    public var effectiveAccess: UInt = 0u,
    public var lxFlags: UInt = 0u,
    public var lxUid: UInt = 0u,
    public var lxGid: UInt = 0u,
    public var lxMode: UInt = 0u,
    public var lxDeviceIdMajor: UInt = 0u,
    public var lxDeviceIdMinor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateFileLxInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateFileLxInformation> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QueryOnCreateFileLxInformation =
                    QueryOnCreateFileLxInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: QueryOnCreateFileLxInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.effectiveAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lxFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.lxUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lxGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.lxMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.lxDeviceIdMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.lxDeviceIdMinor)
                }
            }
    }
}

public data class QueryOnCreateFileStatInformation(
    public var fileId: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var allocationSize: Long = 0L,
    public var endOfFile: Long = 0L,
    public var fileAttributes: UInt = 0u,
    public var reparseTag: UInt = 0u,
    public var numberOfLinks: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateFileStatInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryOnCreateFileStatInformation> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QueryOnCreateFileStatInformation =
                    QueryOnCreateFileStatInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: QueryOnCreateFileStatInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.endOfFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.reparseTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.numberOfLinks)
                }
            }
    }
}

public class QueryPathRequest internal constructor(
    public var pathNameLength: UInt,
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var filePathName: UShortArray,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public constructor() : this(
        pathNameLength = 0u,
        securityContextCtorArg = MutPtr(0L),
        filePathName = UShortArray(1),
    )

    public operator fun component1(): UInt = this.pathNameLength

    public operator fun component2(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component3(): UShortArray = this.filePathName

    public fun copy(pathNameLength: UInt = this.pathNameLength, securityContext: MutPtr<IoSecurityContext> = this.securityContext, filePathName: UShortArray = this.filePathName): QueryPathRequest = QueryPathRequest(pathNameLength = pathNameLength, securityContextCtorArg = securityContext, filePathName = filePathName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryPathRequest) return false
        if (this.pathNameLength != other.pathNameLength) return false
        if (this.securityContext != other.securityContext) return false
        if (!this.filePathName.contentEquals(other.filePathName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathNameLength.hashCode()
        result = 31 * result + this.securityContext.hashCode()
        result = 31 * result + this.filePathName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryPathRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryPathRequest> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QueryPathRequest =
                    QueryPathRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: QueryPathRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pathNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr + 8L, value.securityContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 16L, value.filePathName)
                }
            }

        public operator fun invoke(
            pathNameLength: UInt = 0u,
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            filePathName: UShortArray = UShortArray(1),
        ): QueryPathRequest =
            QueryPathRequest(
                pathNameLength = pathNameLength,
                securityContextCtorArg = securityContext,
                filePathName = filePathName,
            )
    }
}

public class QueryPathRequestEx internal constructor(
    pSecurityContextCtorArg: MutPtr<IoSecurityContext>,
    public var eaLength: UInt,
    pEaBufferCtorArg: MutPtr<CVoid>,
    public var pathName: UnicodeString,
    public var domainServiceName: UnicodeString,
    ecpListCtorArg: MutPtr<EcpList>,
    public var silo: Pesilo,
    public var reserved: Int,
) {
    public var pSecurityContext: MutPtr<IoSecurityContext> = pSecurityContextCtorArg
        internal set

    public var pEaBuffer: MutPtr<CVoid> = pEaBufferCtorArg
        internal set

    public var ecpList: MutPtr<EcpList> = ecpListCtorArg
        internal set

    public constructor() : this(
        pSecurityContextCtorArg = MutPtr(0L),
        eaLength = 0u,
        pEaBufferCtorArg = MutPtr(0L),
        pathName = UnicodeString(),
        domainServiceName = UnicodeString(),
        ecpListCtorArg = MutPtr(0L),
        silo = 0L,
        reserved = 0,
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.pSecurityContext

    public operator fun component2(): UInt = this.eaLength

    public operator fun component3(): MutPtr<CVoid> = this.pEaBuffer

    public operator fun component4(): UnicodeString = this.pathName

    public operator fun component5(): UnicodeString = this.domainServiceName

    public operator fun component6(): MutPtr<EcpList> = this.ecpList

    public operator fun component7(): Pesilo = this.silo

    public operator fun component8(): Int = this.reserved

    public fun copy(pSecurityContext: MutPtr<IoSecurityContext> = this.pSecurityContext, eaLength: UInt = this.eaLength, pEaBuffer: MutPtr<CVoid> = this.pEaBuffer, pathName: UnicodeString = this.pathName, domainServiceName: UnicodeString = this.domainServiceName, ecpList: MutPtr<EcpList> = this.ecpList, silo: Pesilo = this.silo, reserved: Int = this.reserved): QueryPathRequestEx = QueryPathRequestEx(pSecurityContextCtorArg = pSecurityContext, eaLength = eaLength, pEaBufferCtorArg = pEaBuffer, pathName = pathName, domainServiceName = domainServiceName, ecpListCtorArg = ecpList, silo = silo, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is QueryPathRequestEx) return false
        if (this.pSecurityContext != other.pSecurityContext) return false
        if (this.eaLength != other.eaLength) return false
        if (this.pEaBuffer != other.pEaBuffer) return false
        if (this.pathName != other.pathName) return false
        if (this.domainServiceName != other.domainServiceName) return false
        if (this.ecpList != other.ecpList) return false
        if (this.silo != other.silo) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSecurityContext.hashCode()
        result = 31 * result + this.eaLength.hashCode()
        result = 31 * result + this.pEaBuffer.hashCode()
        result = 31 * result + this.pathName.hashCode()
        result = 31 * result + this.domainServiceName.hashCode()
        result = 31 * result + this.ecpList.hashCode()
        result = 31 * result + this.silo.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pSecurityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            eaLength: UInt = 0u,
            pEaBuffer: MutPtr<CVoid> = MutPtr(0L),
            pathName: UnicodeString = UnicodeString(),
            domainServiceName: UnicodeString = UnicodeString(),
            ecpList: MutPtr<EcpList> = MutPtr(0L),
            silo: Pesilo = 0L,
            reserved: Int = 0,
        ): QueryPathRequestEx =
            QueryPathRequestEx(
                pSecurityContextCtorArg = pSecurityContext,
                eaLength = eaLength,
                pEaBufferCtorArg = pEaBuffer,
                pathName = pathName,
                domainServiceName = domainServiceName,
                ecpListCtorArg = ecpList,
                silo = silo,
                reserved = reserved,
            )
    }
}

public data class QueryPathResponse(
    public var lengthAccepted: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryPathResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryPathResponse> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): QueryPathResponse =
                    QueryPathResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: QueryPathResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lengthAccepted)
                }
            }
    }
}

public data class ReadAheadParameters(
    public var nodeByteSize: Short = 0,
    public var granularity: UInt = 0u,
    public var pipelinedRequestSize: UInt = 0u,
    public var readAheadGrowthPercentage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadAheadParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadAheadParameters> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ReadAheadParameters =
                    ReadAheadParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ReadAheadParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.nodeByteSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.granularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pipelinedRequestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.readAheadGrowthPercentage)
                }
            }
    }
}

public class ReadList internal constructor(
    fileObjectCtorArg: MutPtr<FileObject>,
    public var numberOfEntries: UInt,
    public var isImage: UInt,
    public var list: List<FileSegmentElement>,
) {
    public var fileObject: MutPtr<FileObject> = fileObjectCtorArg
        internal set

    public constructor() : this(
        fileObjectCtorArg = MutPtr(0L),
        numberOfEntries = 0u,
        isImage = 0u,
        list = List(1) { FileSegmentElement() },
    )

    public operator fun component1(): MutPtr<FileObject> = this.fileObject

    public operator fun component2(): UInt = this.numberOfEntries

    public operator fun component3(): UInt = this.isImage

    public operator fun component4(): List<FileSegmentElement> = this.list

    public fun copy(fileObject: MutPtr<FileObject> = this.fileObject, numberOfEntries: UInt = this.numberOfEntries, isImage: UInt = this.isImage, list: List<FileSegmentElement> = this.list): ReadList = ReadList(fileObjectCtorArg = fileObject, numberOfEntries = numberOfEntries, isImage = isImage, list = list)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReadList) return false
        if (this.fileObject != other.fileObject) return false
        if (this.numberOfEntries != other.numberOfEntries) return false
        if (this.isImage != other.isImage) return false
        if (this.list != other.list) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileObject.hashCode()
        result = 31 * result + this.numberOfEntries.hashCode()
        result = 31 * result + this.isImage.hashCode()
        result = 31 * result + this.list.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fileObject: MutPtr<FileObject> = MutPtr(0L),
            numberOfEntries: UInt = 0u,
            isImage: UInt = 0u,
            list: List<FileSegmentElement> = List(1) { FileSegmentElement() },
        ): ReadList =
            ReadList(
                fileObjectCtorArg = fileObject,
                numberOfEntries = numberOfEntries,
                isImage = isImage,
                list = list,
            )
    }
}

public data class ReadUsnJournalData(
    public var startUsn: Long = 0L,
    public var reasonMask: UInt = 0u,
    public var returnOnlyOnClose: UInt = 0u,
    public var timeout: ULong = 0uL,
    public var bytesToWaitFor: ULong = 0uL,
    public var usnJournalID: ULong = 0uL,
    public var minMajorVersion: UShort = 0u,
    public var maxMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadUsnJournalData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReadUsnJournalData> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ReadUsnJournalData =
                    ReadUsnJournalData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                    )
                override fun writeNative(addr: Long, value: ReadUsnJournalData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reasonMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.returnOnlyOnClose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.bytesToWaitFor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.minMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.maxMajorVersion)
                }
            }
    }
}

public data class RefsDeallocateRangesInputBuffer(
    public var rangeCount: UInt = 0u,
    public var ranges: List<RefsDeallocateRangesRange> = List(1) { RefsDeallocateRangesRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsDeallocateRangesInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsDeallocateRangesInputBuffer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsDeallocateRangesInputBuffer =
                    RefsDeallocateRangesInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RefsDeallocateRangesRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RefsDeallocateRangesInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rangeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RefsDeallocateRangesRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.ranges)
                }
            }
    }
}

public data class RefsDeallocateRangesInputBufferEx(
    public var rangeCount: UInt = 0u,
    public var allocator: RefsDeallocateRangesAllocator = 0,
    public var streamReserveUpdateCount: Long = 0L,
    public var offsetToRanges: UInt = 0u,
    public var offsetToLeakCounts: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsDeallocateRangesInputBufferEx) return false
        if (this.rangeCount != other.rangeCount) return false
        if (this.allocator != other.allocator) return false
        if (this.streamReserveUpdateCount != other.streamReserveUpdateCount) return false
        if (this.offsetToRanges != other.offsetToRanges) return false
        if (this.offsetToLeakCounts != other.offsetToLeakCounts) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rangeCount.hashCode()
        result = 31 * result + this.allocator.hashCode()
        result = 31 * result + this.streamReserveUpdateCount.hashCode()
        result = 31 * result + this.offsetToRanges.hashCode()
        result = 31 * result + this.offsetToLeakCounts.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsDeallocateRangesInputBufferEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsDeallocateRangesInputBufferEx> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsDeallocateRangesInputBufferEx =
                    RefsDeallocateRangesInputBufferEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RefsDeallocateRangesInputBufferEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rangeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.allocator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.streamReserveUpdateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offsetToRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.offsetToLeakCounts)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 24L, value.reserved)
                }
            }
    }
}

public data class RefsDeallocateRangesRange(
    public var startOfRange: ULong = 0uL,
    public var countOfRange: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsDeallocateRangesRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsDeallocateRangesRange> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsDeallocateRangesRange =
                    RefsDeallocateRangesRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RefsDeallocateRangesRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startOfRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.countOfRange)
                }
            }
    }
}

public data class RefsQueryVolumeCompressionInfoOutputBuffer(
    public var defaultCompressionFormat: RefsCompressionFormats = 0,
    public var defaultCompressionLevel: Short = 0,
    public var defaultCompressionChunkSizeBytes: UInt = 0u,
    public var volumeClusterSizeBytes: UInt = 0u,
    public var totalVolumeClusters: ULong = 0uL,
    public var totalAllocatedClusters: ULong = 0uL,
    public var totalCompressibleClustersAllocated: ULong = 0uL,
    public var totalCompressibleClustersInUse: ULong = 0uL,
    public var totalCompressedClusters: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsQueryVolumeCompressionInfoOutputBuffer) return false
        if (this.defaultCompressionFormat != other.defaultCompressionFormat) return false
        if (this.defaultCompressionLevel != other.defaultCompressionLevel) return false
        if (this.defaultCompressionChunkSizeBytes != other.defaultCompressionChunkSizeBytes) return false
        if (this.volumeClusterSizeBytes != other.volumeClusterSizeBytes) return false
        if (this.totalVolumeClusters != other.totalVolumeClusters) return false
        if (this.totalAllocatedClusters != other.totalAllocatedClusters) return false
        if (this.totalCompressibleClustersAllocated != other.totalCompressibleClustersAllocated) return false
        if (this.totalCompressibleClustersInUse != other.totalCompressibleClustersInUse) return false
        if (this.totalCompressedClusters != other.totalCompressedClusters) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultCompressionFormat.hashCode()
        result = 31 * result + this.defaultCompressionLevel.hashCode()
        result = 31 * result + this.defaultCompressionChunkSizeBytes.hashCode()
        result = 31 * result + this.volumeClusterSizeBytes.hashCode()
        result = 31 * result + this.totalVolumeClusters.hashCode()
        result = 31 * result + this.totalAllocatedClusters.hashCode()
        result = 31 * result + this.totalCompressibleClustersAllocated.hashCode()
        result = 31 * result + this.totalCompressibleClustersInUse.hashCode()
        result = 31 * result + this.totalCompressedClusters.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsQueryVolumeCompressionInfoOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsQueryVolumeCompressionInfoOutputBuffer> {
                override val sizeBytes: Long = 104L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsQueryVolumeCompressionInfoOutputBuffer =
                    RefsQueryVolumeCompressionInfoOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RefsQueryVolumeCompressionInfoOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.defaultCompressionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.defaultCompressionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.defaultCompressionChunkSizeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.volumeClusterSizeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.totalVolumeClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.totalAllocatedClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.totalCompressibleClustersAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.totalCompressibleClustersInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.totalCompressedClusters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 56L, value.reserved)
                }
            }
    }
}

public data class RefsQueryVolumeDedupInfoOutputBuffer(
    public var enabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsQueryVolumeDedupInfoOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsQueryVolumeDedupInfoOutputBuffer> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): RefsQueryVolumeDedupInfoOutputBuffer =
                    RefsQueryVolumeDedupInfoOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RefsQueryVolumeDedupInfoOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enabled)
                }
            }
    }
}

public data class RefsRemoveHardlinkBackpointer(
    public var parentDirectory: ULong = 0uL,
    public var reserved: ULong = 0uL,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsRemoveHardlinkBackpointer) return false
        if (this.parentDirectory != other.parentDirectory) return false
        if (this.reserved != other.reserved) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parentDirectory.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsRemoveHardlinkBackpointer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsRemoveHardlinkBackpointer> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsRemoveHardlinkBackpointer =
                    RefsRemoveHardlinkBackpointer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RefsRemoveHardlinkBackpointer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.parentDirectory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 16L, value.fileName)
                }
            }
    }
}

public data class RefsSetVolumeCompressionInfoInputBuffer(
    public var compressionFormat: RefsCompressionFormats = 0,
    public var compressionLevel: Short = 0,
    public var compressionChunkSizeBytes: UInt = 0u,
    public var flags: RefsSetVolumeCompressionInfoFlags = 0,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsSetVolumeCompressionInfoInputBuffer) return false
        if (this.compressionFormat != other.compressionFormat) return false
        if (this.compressionLevel != other.compressionLevel) return false
        if (this.compressionChunkSizeBytes != other.compressionChunkSizeBytes) return false
        if (this.flags != other.flags) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compressionFormat.hashCode()
        result = 31 * result + this.compressionLevel.hashCode()
        result = 31 * result + this.compressionChunkSizeBytes.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSetVolumeCompressionInfoInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSetVolumeCompressionInfoInputBuffer> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsSetVolumeCompressionInfoInputBuffer =
                    RefsSetVolumeCompressionInfoInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RefsSetVolumeCompressionInfoInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.compressionFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.compressionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.compressionChunkSizeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class RefsSetVolumeDedupInfoInputBuffer(
    public var enable: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSetVolumeDedupInfoInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsSetVolumeDedupInfoInputBuffer> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): RefsSetVolumeDedupInfoInputBuffer =
                    RefsSetVolumeDedupInfoInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RefsSetVolumeDedupInfoInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enable)
                }
            }
    }
}

public data class RefsStreamExtent(
    public var vcn: Long = 0L,
    public var lcn: Long = 0L,
    public var length: Long = 0L,
    public var properties: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamExtent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamExtent> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsStreamExtent =
                    RefsStreamExtent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RefsStreamExtent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.vcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.properties)
                }
            }
    }
}

public data class RefsStreamSnapshotListOutputBuffer(
    public var entryCount: UInt = 0u,
    public var bufferSizeRequiredForQuery: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
    public var entries: List<RefsStreamSnapshotListOutputBufferEntry> = List(1) { RefsStreamSnapshotListOutputBufferEntry() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotListOutputBuffer) return false
        if (this.entryCount != other.entryCount) return false
        if (this.bufferSizeRequiredForQuery != other.bufferSizeRequiredForQuery) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryCount.hashCode()
        result = 31 * result + this.bufferSizeRequiredForQuery.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotListOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotListOutputBuffer> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsStreamSnapshotListOutputBuffer =
                    RefsStreamSnapshotListOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RefsStreamSnapshotListOutputBufferEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RefsStreamSnapshotListOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferSizeRequiredForQuery)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RefsStreamSnapshotListOutputBufferEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.entries)
                }
            }
    }
}

public data class RefsStreamSnapshotListOutputBufferEntry(
    public var nextEntryOffset: UInt = 0u,
    public var snapshotNameLength: UShort = 0u,
    public var snapshotCreationTime: ULong = 0uL,
    public var streamSize: ULong = 0uL,
    public var streamAllocationSize: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(2),
    public var snapshotName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotListOutputBufferEntry) return false
        if (this.nextEntryOffset != other.nextEntryOffset) return false
        if (this.snapshotNameLength != other.snapshotNameLength) return false
        if (this.snapshotCreationTime != other.snapshotCreationTime) return false
        if (this.streamSize != other.streamSize) return false
        if (this.streamAllocationSize != other.streamAllocationSize) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.snapshotName.contentEquals(other.snapshotName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextEntryOffset.hashCode()
        result = 31 * result + this.snapshotNameLength.hashCode()
        result = 31 * result + this.snapshotCreationTime.hashCode()
        result = 31 * result + this.streamSize.hashCode()
        result = 31 * result + this.streamAllocationSize.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.snapshotName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotListOutputBufferEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotListOutputBufferEntry> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsStreamSnapshotListOutputBufferEntry =
                    RefsStreamSnapshotListOutputBufferEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RefsStreamSnapshotListOutputBufferEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextEntryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.snapshotNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.snapshotCreationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.streamSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.streamAllocationSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 32L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 48L, value.snapshotName)
                }
            }
    }
}

public data class RefsStreamSnapshotManagementInputBuffer(
    public var operation: RefsStreamSnapshotOperation = 0,
    public var snapshotNameLength: UShort = 0u,
    public var operationInputBufferLength: UShort = 0u,
    public var reserved: ULongArray = ULongArray(2),
    public var nameAndInputBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotManagementInputBuffer) return false
        if (this.operation != other.operation) return false
        if (this.snapshotNameLength != other.snapshotNameLength) return false
        if (this.operationInputBufferLength != other.operationInputBufferLength) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.nameAndInputBuffer.contentEquals(other.nameAndInputBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operation.hashCode()
        result = 31 * result + this.snapshotNameLength.hashCode()
        result = 31 * result + this.operationInputBufferLength.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.nameAndInputBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotManagementInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotManagementInputBuffer> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsStreamSnapshotManagementInputBuffer =
                    RefsStreamSnapshotManagementInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RefsStreamSnapshotManagementInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.snapshotNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.operationInputBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 8L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.nameAndInputBuffer)
                }
            }
    }
}

public data class RefsStreamSnapshotQueryDeltasInputBuffer(
    public var startingVcn: Long = 0L,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotQueryDeltasInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotQueryDeltasInputBuffer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsStreamSnapshotQueryDeltasInputBuffer =
                    RefsStreamSnapshotQueryDeltasInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RefsStreamSnapshotQueryDeltasInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingVcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class RefsStreamSnapshotQueryDeltasOutputBuffer(
    public var extentCount: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
    public var extents: List<RefsStreamExtent> = List(1) { RefsStreamExtent() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsStreamSnapshotQueryDeltasOutputBuffer) return false
        if (this.extentCount != other.extentCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.extents != other.extents) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extentCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.extents.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotQueryDeltasOutputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsStreamSnapshotQueryDeltasOutputBuffer> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsStreamSnapshotQueryDeltasOutputBuffer =
                    RefsStreamSnapshotQueryDeltasOutputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RefsStreamExtent.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RefsStreamSnapshotQueryDeltasOutputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extentCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 4L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RefsStreamExtent.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.extents)
                }
            }
    }
}

public data class RefsVolumeCounterInfoInputBuffer(
    public var resetCounters: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsVolumeCounterInfoInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsVolumeCounterInfoInputBuffer> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): RefsVolumeCounterInfoInputBuffer =
                    RefsVolumeCounterInfoInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RefsVolumeCounterInfoInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.resetCounters)
                }
            }
    }
}

public data class RefsVolumeDataBuffer(
    public var byteCount: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var bytesPerPhysicalSector: UInt = 0u,
    public var volumeSerialNumber: Long = 0L,
    public var numberSectors: Long = 0L,
    public var totalClusters: Long = 0L,
    public var freeClusters: Long = 0L,
    public var totalReserved: Long = 0L,
    public var bytesPerSector: UInt = 0u,
    public var bytesPerCluster: UInt = 0u,
    public var maximumSizeOfResidentFile: Long = 0L,
    public var fastTierDataFillRatio: UShort = 0u,
    public var slowTierDataFillRatio: UShort = 0u,
    public var destagesFastTierToSlowTierRate: UInt = 0u,
    public var reserved: LongArray = LongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RefsVolumeDataBuffer) return false
        if (this.byteCount != other.byteCount) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.bytesPerPhysicalSector != other.bytesPerPhysicalSector) return false
        if (this.volumeSerialNumber != other.volumeSerialNumber) return false
        if (this.numberSectors != other.numberSectors) return false
        if (this.totalClusters != other.totalClusters) return false
        if (this.freeClusters != other.freeClusters) return false
        if (this.totalReserved != other.totalReserved) return false
        if (this.bytesPerSector != other.bytesPerSector) return false
        if (this.bytesPerCluster != other.bytesPerCluster) return false
        if (this.maximumSizeOfResidentFile != other.maximumSizeOfResidentFile) return false
        if (this.fastTierDataFillRatio != other.fastTierDataFillRatio) return false
        if (this.slowTierDataFillRatio != other.slowTierDataFillRatio) return false
        if (this.destagesFastTierToSlowTierRate != other.destagesFastTierToSlowTierRate) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byteCount.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.bytesPerPhysicalSector.hashCode()
        result = 31 * result + this.volumeSerialNumber.hashCode()
        result = 31 * result + this.numberSectors.hashCode()
        result = 31 * result + this.totalClusters.hashCode()
        result = 31 * result + this.freeClusters.hashCode()
        result = 31 * result + this.totalReserved.hashCode()
        result = 31 * result + this.bytesPerSector.hashCode()
        result = 31 * result + this.bytesPerCluster.hashCode()
        result = 31 * result + this.maximumSizeOfResidentFile.hashCode()
        result = 31 * result + this.fastTierDataFillRatio.hashCode()
        result = 31 * result + this.slowTierDataFillRatio.hashCode()
        result = 31 * result + this.destagesFastTierToSlowTierRate.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsVolumeDataBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RefsVolumeDataBuffer> {
                override val sizeBytes: Long = 152L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RefsVolumeDataBuffer =
                    RefsVolumeDataBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (9).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: RefsVolumeDataBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bytesPerPhysicalSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.volumeSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.numberSectors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.totalClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.freeClusters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.totalReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.bytesPerSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.bytesPerCluster)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.maximumSizeOfResidentFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 72L, value.fastTierDataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 74L, value.slowTierDataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.destagesFastTierToSlowTierRate)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (9).toInt())
                    ).writeNative(addr + 80L, value.reserved)
                }
            }
    }
}

public class RemoteLinkTrackingInformation internal constructor(
    targetFileObjectCtorArg: MutPtr<CVoid>,
    public var targetLinkTrackingInformationLength: UInt,
    public var targetLinkTrackingInformationBuffer: UByteArray,
) {
    public var targetFileObject: MutPtr<CVoid> = targetFileObjectCtorArg
        internal set

    public constructor() : this(
        targetFileObjectCtorArg = MutPtr(0L),
        targetLinkTrackingInformationLength = 0u,
        targetLinkTrackingInformationBuffer = UByteArray(1),
    )

    public operator fun component1(): MutPtr<CVoid> = this.targetFileObject

    public operator fun component2(): UInt = this.targetLinkTrackingInformationLength

    public operator fun component3(): UByteArray = this.targetLinkTrackingInformationBuffer

    public fun copy(targetFileObject: MutPtr<CVoid> = this.targetFileObject, targetLinkTrackingInformationLength: UInt = this.targetLinkTrackingInformationLength, targetLinkTrackingInformationBuffer: UByteArray = this.targetLinkTrackingInformationBuffer): RemoteLinkTrackingInformation = RemoteLinkTrackingInformation(targetFileObjectCtorArg = targetFileObject, targetLinkTrackingInformationLength = targetLinkTrackingInformationLength, targetLinkTrackingInformationBuffer = targetLinkTrackingInformationBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemoteLinkTrackingInformation) return false
        if (this.targetFileObject != other.targetFileObject) return false
        if (this.targetLinkTrackingInformationLength != other.targetLinkTrackingInformationLength) return false
        if (!this.targetLinkTrackingInformationBuffer.contentEquals(other.targetLinkTrackingInformationBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetFileObject.hashCode()
        result = 31 * result + this.targetLinkTrackingInformationLength.hashCode()
        result = 31 * result + this.targetLinkTrackingInformationBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemoteLinkTrackingInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RemoteLinkTrackingInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RemoteLinkTrackingInformation =
                    RemoteLinkTrackingInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RemoteLinkTrackingInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.targetFileObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.targetLinkTrackingInformationLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.targetLinkTrackingInformationBuffer)
                }
            }

        public operator fun invoke(
            targetFileObject: MutPtr<CVoid> = MutPtr(0L),
            targetLinkTrackingInformationLength: UInt = 0u,
            targetLinkTrackingInformationBuffer: UByteArray = UByteArray(1),
        ): RemoteLinkTrackingInformation =
            RemoteLinkTrackingInformation(
                targetFileObjectCtorArg = targetFileObject,
                targetLinkTrackingInformationLength = targetLinkTrackingInformationLength,
                targetLinkTrackingInformationBuffer = targetLinkTrackingInformationBuffer,
            )
    }
}

public data class ReparseDataBuffer(
    public var reparseTag: UInt = 0u,
    public var reparseDataLength: UShort = 0u,
    public var reserved: UShort = 0u,
    public var anonymous: ReparseDataBuffer0 = ReparseDataBuffer0(),
)

public data class ReparseDataBuffer0(
    public var symbolicLinkReparseBuffer: ReparseDataBuffer00 = ReparseDataBuffer00(),
    public var mountPointReparseBuffer: ReparseDataBuffer01 = ReparseDataBuffer01(),
    public var genericReparseBuffer: ReparseDataBuffer02 = ReparseDataBuffer02(),
)

public data class ReparseDataBuffer02(
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseDataBuffer02) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int = this.dataBuffer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseDataBuffer02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseDataBuffer02> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): ReparseDataBuffer02 =
                    ReparseDataBuffer02(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ReparseDataBuffer02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.dataBuffer)
                }
            }
    }
}

public data class ReparseDataBuffer01(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseDataBuffer01) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseDataBuffer01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseDataBuffer01> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ReparseDataBuffer01 =
                    ReparseDataBuffer01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ReparseDataBuffer01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.substituteNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.substituteNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.printNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.printNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.pathBuffer)
                }
            }
    }
}

public data class ReparseDataBuffer00(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var flags: UInt = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ReparseDataBuffer00) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (this.flags != other.flags) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseDataBuffer00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseDataBuffer00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ReparseDataBuffer00 =
                    ReparseDataBuffer00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ReparseDataBuffer00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.substituteNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.substituteNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.printNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.printNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.pathBuffer)
                }
            }
    }
}

public data class ReparseDataBufferEx(
    public var flags: UInt = 0u,
    public var existingReparseTag: UInt = 0u,
    public var existingReparseGuid: Guid = Guid(),
    public var reserved: ULong = 0uL,
    public var anonymous: ReparseDataBufferEx0 = ReparseDataBufferEx0(),
)

public data class ReparseDataBufferEx0(
    public var reparseDataBuffer: ReparseDataBuffer = ReparseDataBuffer(),
    public var reparseGuidDataBuffer: ReparseGuidDataBuffer = ReparseGuidDataBuffer(),
)

public data class ReparseIndexKey(
    public var fileReparseTag: UInt = 0u,
    public var fileId: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseIndexKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReparseIndexKey> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ReparseIndexKey =
                    ReparseIndexKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ReparseIndexKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fileReparseTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 4L, value.fileId)
                }
            }
    }
}

public data class RetrievalPointersAndRefcountBuffer(
    public var extentCount: UInt = 0u,
    public var startingVcn: Long = 0L,
    public var extents: List<RetrievalPointersAndRefcountBuffer0> = List(1) { RetrievalPointersAndRefcountBuffer0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RetrievalPointersAndRefcountBuffer =
                    RetrievalPointersAndRefcountBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(RetrievalPointersAndRefcountBuffer0.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointersAndRefcountBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.extentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.startingVcn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(RetrievalPointersAndRefcountBuffer0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.extents)
                }
            }
    }
}

public data class RetrievalPointersAndRefcountBuffer0(
    public var nextVcn: Long = 0L,
    public var lcn: Long = 0L,
    public var referenceCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RetrievalPointersAndRefcountBuffer0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RetrievalPointersAndRefcountBuffer0 =
                    RetrievalPointersAndRefcountBuffer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RetrievalPointersAndRefcountBuffer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.nextVcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.referenceCount)
                }
            }
    }
}

public data class RkfBypassEcpContext(
    public var reserved: Int = 0,
    public var version: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RkfBypassEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RkfBypassEcpContext> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RkfBypassEcpContext =
                    RkfBypassEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RkfBypassEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.version)
                }
            }
    }
}

public data class RtlHeapMemoryLimitData(
    public var commitLimitBytes: Int = 0,
    public var commitLimitFailureCode: Int = 0,
    public var maxAllocationSizeBytes: Int = 0,
    public var allocationLimitFailureCode: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlHeapMemoryLimitData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlHeapMemoryLimitData> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlHeapMemoryLimitData =
                    RtlHeapMemoryLimitData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RtlHeapMemoryLimitData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.commitLimitBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.commitLimitFailureCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.maxAllocationSizeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.allocationLimitFailureCode)
                }
            }
    }
}

public data class RtlHeapMemoryLimitInfo(
    public var version: UInt = 0u,
    public var data: RtlHeapMemoryLimitData = RtlHeapMemoryLimitData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlHeapMemoryLimitInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlHeapMemoryLimitInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlHeapMemoryLimitInfo =
                    RtlHeapMemoryLimitInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (RtlHeapMemoryLimitData.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RtlHeapMemoryLimitInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (RtlHeapMemoryLimitData.typeLayout()).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class RtlHeapParameters(
    public var length: UInt = 0u,
    public var segmentReserve: Int = 0,
    public var segmentCommit: Int = 0,
    public var deCommitFreeBlockThreshold: Int = 0,
    public var deCommitTotalFreeThreshold: Int = 0,
    public var maximumAllocationSize: Int = 0,
    public var virtualMemoryThreshold: Int = 0,
    public var initialCommit: Int = 0,
    public var initialReserve: Int = 0,
    public var commitRoutine: PrtlHeapCommitRoutine = null,
    public var reserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlHeapParameters) return false
        if (this.length != other.length) return false
        if (this.segmentReserve != other.segmentReserve) return false
        if (this.segmentCommit != other.segmentCommit) return false
        if (this.deCommitFreeBlockThreshold != other.deCommitFreeBlockThreshold) return false
        if (this.deCommitTotalFreeThreshold != other.deCommitTotalFreeThreshold) return false
        if (this.maximumAllocationSize != other.maximumAllocationSize) return false
        if (this.virtualMemoryThreshold != other.virtualMemoryThreshold) return false
        if (this.initialCommit != other.initialCommit) return false
        if (this.initialReserve != other.initialReserve) return false
        if (this.commitRoutine != other.commitRoutine) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.segmentReserve.hashCode()
        result = 31 * result + this.segmentCommit.hashCode()
        result = 31 * result + this.deCommitFreeBlockThreshold.hashCode()
        result = 31 * result + this.deCommitTotalFreeThreshold.hashCode()
        result = 31 * result + this.maximumAllocationSize.hashCode()
        result = 31 * result + this.virtualMemoryThreshold.hashCode()
        result = 31 * result + this.initialCommit.hashCode()
        result = 31 * result + this.initialReserve.hashCode()
        result = 31 * result + this.commitRoutine.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class RtlNlsState internal constructor(
    public var defaultAcpTableInfo: Cptableinfo,
    public var defaultOemTableInfo: Cptableinfo,
    activeCodePageDataCtorArg: MutPtr<UShort>,
    oemCodePageDataCtorArg: MutPtr<UShort>,
    leadByteInfoCtorArg: MutPtr<UShort>,
    oemLeadByteInfoCtorArg: MutPtr<UShort>,
    caseMappingDataCtorArg: MutPtr<UShort>,
    unicodeUpcaseTable844CtorArg: MutPtr<UShort>,
    unicodeLowercaseTable844CtorArg: MutPtr<UShort>,
) {
    public var activeCodePageData: MutPtr<UShort> = activeCodePageDataCtorArg
        internal set

    public var oemCodePageData: MutPtr<UShort> = oemCodePageDataCtorArg
        internal set

    public var leadByteInfo: MutPtr<UShort> = leadByteInfoCtorArg
        internal set

    public var oemLeadByteInfo: MutPtr<UShort> = oemLeadByteInfoCtorArg
        internal set

    public var caseMappingData: MutPtr<UShort> = caseMappingDataCtorArg
        internal set

    public var unicodeUpcaseTable844: MutPtr<UShort> = unicodeUpcaseTable844CtorArg
        internal set

    public var unicodeLowercaseTable844: MutPtr<UShort> = unicodeLowercaseTable844CtorArg
        internal set

    public constructor() : this(
        defaultAcpTableInfo = Cptableinfo(),
        defaultOemTableInfo = Cptableinfo(),
        activeCodePageDataCtorArg = MutPtr(0L),
        oemCodePageDataCtorArg = MutPtr(0L),
        leadByteInfoCtorArg = MutPtr(0L),
        oemLeadByteInfoCtorArg = MutPtr(0L),
        caseMappingDataCtorArg = MutPtr(0L),
        unicodeUpcaseTable844CtorArg = MutPtr(0L),
        unicodeLowercaseTable844CtorArg = MutPtr(0L),
    )

    public operator fun component1(): Cptableinfo = this.defaultAcpTableInfo

    public operator fun component2(): Cptableinfo = this.defaultOemTableInfo

    public operator fun component3(): MutPtr<UShort> = this.activeCodePageData

    public operator fun component4(): MutPtr<UShort> = this.oemCodePageData

    public operator fun component5(): MutPtr<UShort> = this.leadByteInfo

    public operator fun component6(): MutPtr<UShort> = this.oemLeadByteInfo

    public operator fun component7(): MutPtr<UShort> = this.caseMappingData

    public operator fun component8(): MutPtr<UShort> = this.unicodeUpcaseTable844

    public operator fun component9(): MutPtr<UShort> = this.unicodeLowercaseTable844

    public fun copy(defaultAcpTableInfo: Cptableinfo = this.defaultAcpTableInfo, defaultOemTableInfo: Cptableinfo = this.defaultOemTableInfo, activeCodePageData: MutPtr<UShort> = this.activeCodePageData, oemCodePageData: MutPtr<UShort> = this.oemCodePageData, leadByteInfo: MutPtr<UShort> = this.leadByteInfo, oemLeadByteInfo: MutPtr<UShort> = this.oemLeadByteInfo, caseMappingData: MutPtr<UShort> = this.caseMappingData, unicodeUpcaseTable844: MutPtr<UShort> = this.unicodeUpcaseTable844, unicodeLowercaseTable844: MutPtr<UShort> = this.unicodeLowercaseTable844): RtlNlsState = RtlNlsState(defaultAcpTableInfo = defaultAcpTableInfo, defaultOemTableInfo = defaultOemTableInfo, activeCodePageDataCtorArg = activeCodePageData, oemCodePageDataCtorArg = oemCodePageData, leadByteInfoCtorArg = leadByteInfo, oemLeadByteInfoCtorArg = oemLeadByteInfo, caseMappingDataCtorArg = caseMappingData, unicodeUpcaseTable844CtorArg = unicodeUpcaseTable844, unicodeLowercaseTable844CtorArg = unicodeLowercaseTable844)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlNlsState) return false
        if (this.defaultAcpTableInfo != other.defaultAcpTableInfo) return false
        if (this.defaultOemTableInfo != other.defaultOemTableInfo) return false
        if (this.activeCodePageData != other.activeCodePageData) return false
        if (this.oemCodePageData != other.oemCodePageData) return false
        if (this.leadByteInfo != other.leadByteInfo) return false
        if (this.oemLeadByteInfo != other.oemLeadByteInfo) return false
        if (this.caseMappingData != other.caseMappingData) return false
        if (this.unicodeUpcaseTable844 != other.unicodeUpcaseTable844) return false
        if (this.unicodeLowercaseTable844 != other.unicodeLowercaseTable844) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultAcpTableInfo.hashCode()
        result = 31 * result + this.defaultOemTableInfo.hashCode()
        result = 31 * result + this.activeCodePageData.hashCode()
        result = 31 * result + this.oemCodePageData.hashCode()
        result = 31 * result + this.leadByteInfo.hashCode()
        result = 31 * result + this.oemLeadByteInfo.hashCode()
        result = 31 * result + this.caseMappingData.hashCode()
        result = 31 * result + this.unicodeUpcaseTable844.hashCode()
        result = 31 * result + this.unicodeLowercaseTable844.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlNlsState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlNlsState> {
                override val sizeBytes: Long = 184L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RtlNlsState =
                    RtlNlsState(
                        (Cptableinfo.typeLayout()).readNative(addr),
                        (Cptableinfo.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 144L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 152L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 160L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 168L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 176L),
                    )
                override fun writeNative(addr: Long, value: RtlNlsState) {
                    (Cptableinfo.typeLayout()).writeNative(addr, value.defaultAcpTableInfo)
                    (Cptableinfo.typeLayout()).writeNative(addr + 64L, value.defaultOemTableInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 128L, value.activeCodePageData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 136L, value.oemCodePageData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 144L, value.leadByteInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 152L, value.oemLeadByteInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 160L, value.caseMappingData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 168L, value.unicodeUpcaseTable844)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 176L, value.unicodeLowercaseTable844)
                }
            }

        public operator fun invoke(
            defaultAcpTableInfo: Cptableinfo = Cptableinfo(),
            defaultOemTableInfo: Cptableinfo = Cptableinfo(),
            activeCodePageData: MutPtr<UShort> = MutPtr(0L),
            oemCodePageData: MutPtr<UShort> = MutPtr(0L),
            leadByteInfo: MutPtr<UShort> = MutPtr(0L),
            oemLeadByteInfo: MutPtr<UShort> = MutPtr(0L),
            caseMappingData: MutPtr<UShort> = MutPtr(0L),
            unicodeUpcaseTable844: MutPtr<UShort> = MutPtr(0L),
            unicodeLowercaseTable844: MutPtr<UShort> = MutPtr(0L),
        ): RtlNlsState =
            RtlNlsState(
                defaultAcpTableInfo = defaultAcpTableInfo,
                defaultOemTableInfo = defaultOemTableInfo,
                activeCodePageDataCtorArg = activeCodePageData,
                oemCodePageDataCtorArg = oemCodePageData,
                leadByteInfoCtorArg = leadByteInfo,
                oemLeadByteInfoCtorArg = oemLeadByteInfo,
                caseMappingDataCtorArg = caseMappingData,
                unicodeUpcaseTable844CtorArg = unicodeUpcaseTable844,
                unicodeLowercaseTable844CtorArg = unicodeLowercaseTable844,
            )
    }
}

public data class RtlSegmentHeapMemorySource(
    public var flags: UInt = 0u,
    public var memoryTypeMask: UInt = 0u,
    public var numaNode: UInt = 0u,
    public var anonymous: RtlSegmentHeapMemorySource0 = RtlSegmentHeapMemorySource0(),
    public var reserved: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSegmentHeapMemorySource) return false
        if (this.flags != other.flags) return false
        if (this.memoryTypeMask != other.memoryTypeMask) return false
        if (this.numaNode != other.numaNode) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.memoryTypeMask.hashCode()
        result = 31 * result + this.numaNode.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class RtlSegmentHeapMemorySource0 internal constructor(
    partitionHandleCtorArg: Handle,
    callbacksCtorArg: MutPtr<RtlSegmentHeapVaCallbacks>,
) {
    public var partitionHandle: Handle = partitionHandleCtorArg
        internal set

    public var callbacks: MutPtr<RtlSegmentHeapVaCallbacks> = callbacksCtorArg
        internal set

    public constructor() : this(
        partitionHandleCtorArg = MutPtr(0L),
        callbacksCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.partitionHandle

    public operator fun component2(): MutPtr<RtlSegmentHeapVaCallbacks> = this.callbacks

    public fun copy(partitionHandle: Handle = this.partitionHandle, callbacks: MutPtr<RtlSegmentHeapVaCallbacks> = this.callbacks): RtlSegmentHeapMemorySource0 = RtlSegmentHeapMemorySource0(partitionHandleCtorArg = partitionHandle, callbacksCtorArg = callbacks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSegmentHeapMemorySource0) return false
        if (this.partitionHandle != other.partitionHandle) return false
        if (this.callbacks != other.callbacks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.partitionHandle.hashCode()
        result = 31 * result + this.callbacks.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            partitionHandle: Handle = MutPtr(0L),
            callbacks: MutPtr<RtlSegmentHeapVaCallbacks> = MutPtr(0L),
        ): RtlSegmentHeapMemorySource0 =
            RtlSegmentHeapMemorySource0(
                partitionHandleCtorArg = partitionHandle,
                callbacksCtorArg = callbacks,
            )
    }
}

public data class RtlSegmentHeapParameters(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var flags: UInt = 0u,
    public var memorySource: RtlSegmentHeapMemorySource = RtlSegmentHeapMemorySource(),
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSegmentHeapParameters) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.memorySource != other.memorySource) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.memorySource.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class RtlSegmentHeapVaCallbacks internal constructor(
    callbackContextCtorArg: Handle,
    public var allocateVirtualMemory: PallocateVirtualMemoryExCallback,
    public var freeVirtualMemory: PfreeVirtualMemoryExCallback,
    public var queryVirtualMemory: PqueryVirtualMemoryCallback,
) {
    public var callbackContext: Handle = callbackContextCtorArg
        internal set

    public constructor() : this(
        callbackContextCtorArg = MutPtr(0L),
        allocateVirtualMemory = null,
        freeVirtualMemory = null,
        queryVirtualMemory = null,
    )

    public operator fun component1(): Handle = this.callbackContext

    public operator fun component2(): PallocateVirtualMemoryExCallback = this.allocateVirtualMemory

    public operator fun component3(): PfreeVirtualMemoryExCallback = this.freeVirtualMemory

    public operator fun component4(): PqueryVirtualMemoryCallback = this.queryVirtualMemory

    public fun copy(callbackContext: Handle = this.callbackContext, allocateVirtualMemory: PallocateVirtualMemoryExCallback = this.allocateVirtualMemory, freeVirtualMemory: PfreeVirtualMemoryExCallback = this.freeVirtualMemory, queryVirtualMemory: PqueryVirtualMemoryCallback = this.queryVirtualMemory): RtlSegmentHeapVaCallbacks = RtlSegmentHeapVaCallbacks(callbackContextCtorArg = callbackContext, allocateVirtualMemory = allocateVirtualMemory, freeVirtualMemory = freeVirtualMemory, queryVirtualMemory = queryVirtualMemory)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlSegmentHeapVaCallbacks) return false
        if (this.callbackContext != other.callbackContext) return false
        if (this.allocateVirtualMemory != other.allocateVirtualMemory) return false
        if (this.freeVirtualMemory != other.freeVirtualMemory) return false
        if (this.queryVirtualMemory != other.queryVirtualMemory) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callbackContext.hashCode()
        result = 31 * result + this.allocateVirtualMemory.hashCode()
        result = 31 * result + this.freeVirtualMemory.hashCode()
        result = 31 * result + this.queryVirtualMemory.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callbackContext: Handle = MutPtr(0L),
            allocateVirtualMemory: PallocateVirtualMemoryExCallback = null,
            freeVirtualMemory: PfreeVirtualMemoryExCallback = null,
            queryVirtualMemory: PqueryVirtualMemoryCallback = null,
        ): RtlSegmentHeapVaCallbacks =
            RtlSegmentHeapVaCallbacks(
                callbackContextCtorArg = callbackContext,
                allocateVirtualMemory = allocateVirtualMemory,
                freeVirtualMemory = freeVirtualMemory,
                queryVirtualMemory = queryVirtualMemory,
            )
    }
}

public class SecurityClientContext internal constructor(
    public var securityQos: SecurityQualityOfService,
    clientTokenCtorArg: MutPtr<CVoid>,
    public var directlyAccessClientToken: Boolean,
    public var directAccessEffectiveOnly: Boolean,
    public var serverIsRemote: Boolean,
    public var clientTokenControl: TokenControl,
) {
    public var clientToken: MutPtr<CVoid> = clientTokenCtorArg
        internal set

    public constructor() : this(
        securityQos = SecurityQualityOfService(),
        clientTokenCtorArg = MutPtr(0L),
        directlyAccessClientToken = false,
        directAccessEffectiveOnly = false,
        serverIsRemote = false,
        clientTokenControl = TokenControl(),
    )

    public operator fun component1(): SecurityQualityOfService = this.securityQos

    public operator fun component2(): MutPtr<CVoid> = this.clientToken

    public operator fun component3(): Boolean = this.directlyAccessClientToken

    public operator fun component4(): Boolean = this.directAccessEffectiveOnly

    public operator fun component5(): Boolean = this.serverIsRemote

    public operator fun component6(): TokenControl = this.clientTokenControl

    public fun copy(securityQos: SecurityQualityOfService = this.securityQos, clientToken: MutPtr<CVoid> = this.clientToken, directlyAccessClientToken: Boolean = this.directlyAccessClientToken, directAccessEffectiveOnly: Boolean = this.directAccessEffectiveOnly, serverIsRemote: Boolean = this.serverIsRemote, clientTokenControl: TokenControl = this.clientTokenControl): SecurityClientContext = SecurityClientContext(securityQos = securityQos, clientTokenCtorArg = clientToken, directlyAccessClientToken = directlyAccessClientToken, directAccessEffectiveOnly = directAccessEffectiveOnly, serverIsRemote = serverIsRemote, clientTokenControl = clientTokenControl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityClientContext) return false
        if (this.securityQos != other.securityQos) return false
        if (this.clientToken != other.clientToken) return false
        if (this.directlyAccessClientToken != other.directlyAccessClientToken) return false
        if (this.directAccessEffectiveOnly != other.directAccessEffectiveOnly) return false
        if (this.serverIsRemote != other.serverIsRemote) return false
        if (this.clientTokenControl != other.clientTokenControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityQos.hashCode()
        result = 31 * result + this.clientToken.hashCode()
        result = 31 * result + this.directlyAccessClientToken.hashCode()
        result = 31 * result + this.directAccessEffectiveOnly.hashCode()
        result = 31 * result + this.serverIsRemote.hashCode()
        result = 31 * result + this.clientTokenControl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            securityQos: SecurityQualityOfService = SecurityQualityOfService(),
            clientToken: MutPtr<CVoid> = MutPtr(0L),
            directlyAccessClientToken: Boolean = false,
            directAccessEffectiveOnly: Boolean = false,
            serverIsRemote: Boolean = false,
            clientTokenControl: TokenControl = TokenControl(),
        ): SecurityClientContext =
            SecurityClientContext(
                securityQos = securityQos,
                clientTokenCtorArg = clientToken,
                directlyAccessClientToken = directlyAccessClientToken,
                directAccessEffectiveOnly = directAccessEffectiveOnly,
                serverIsRemote = serverIsRemote,
                clientTokenControl = clientTokenControl,
            )
    }
}

public data class SecApplicationProtocols(
    public var protocolListsSize: UInt = 0u,
    public var protocolLists: List<SecApplicationProtocolList> = List(1) { SecApplicationProtocolList() },
)

public data class SecDtlsMtu(
    public var pathMTU: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecDtlsMtu> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecDtlsMtu> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SecDtlsMtu =
                    SecDtlsMtu(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecDtlsMtu) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.pathMTU)
                }
            }
    }
}
