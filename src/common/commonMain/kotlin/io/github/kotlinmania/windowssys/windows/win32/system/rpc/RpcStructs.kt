@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.rpc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.com.RpcCImpLevel
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public class ArrayInfo internal constructor(
    public var dimension: Int,
    bufferConformanceMarkCtorArg: MutPtr<UInt>,
    bufferVarianceMarkCtorArg: MutPtr<UInt>,
    maxCountArrayCtorArg: MutPtr<UInt>,
    offsetArrayCtorArg: MutPtr<UInt>,
    actualCountArrayCtorArg: MutPtr<UInt>,
) {
    public var bufferConformanceMark: MutPtr<UInt> = bufferConformanceMarkCtorArg
        internal set

    public var bufferVarianceMark: MutPtr<UInt> = bufferVarianceMarkCtorArg
        internal set

    public var maxCountArray: MutPtr<UInt> = maxCountArrayCtorArg
        internal set

    public var offsetArray: MutPtr<UInt> = offsetArrayCtorArg
        internal set

    public var actualCountArray: MutPtr<UInt> = actualCountArrayCtorArg
        internal set

    public constructor() : this(
        dimension = 0,
        bufferConformanceMarkCtorArg = MutPtr(0L),
        bufferVarianceMarkCtorArg = MutPtr(0L),
        maxCountArrayCtorArg = MutPtr(0L),
        offsetArrayCtorArg = MutPtr(0L),
        actualCountArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.dimension

    public operator fun component2(): MutPtr<UInt> = this.bufferConformanceMark

    public operator fun component3(): MutPtr<UInt> = this.bufferVarianceMark

    public operator fun component4(): MutPtr<UInt> = this.maxCountArray

    public operator fun component5(): MutPtr<UInt> = this.offsetArray

    public operator fun component6(): MutPtr<UInt> = this.actualCountArray

    public fun copy(dimension: Int = this.dimension, bufferConformanceMark: MutPtr<UInt> = this.bufferConformanceMark, bufferVarianceMark: MutPtr<UInt> = this.bufferVarianceMark, maxCountArray: MutPtr<UInt> = this.maxCountArray, offsetArray: MutPtr<UInt> = this.offsetArray, actualCountArray: MutPtr<UInt> = this.actualCountArray): ArrayInfo = ArrayInfo(dimension = dimension, bufferConformanceMarkCtorArg = bufferConformanceMark, bufferVarianceMarkCtorArg = bufferVarianceMark, maxCountArrayCtorArg = maxCountArray, offsetArrayCtorArg = offsetArray, actualCountArrayCtorArg = actualCountArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArrayInfo) return false
        if (this.dimension != other.dimension) return false
        if (this.bufferConformanceMark != other.bufferConformanceMark) return false
        if (this.bufferVarianceMark != other.bufferVarianceMark) return false
        if (this.maxCountArray != other.maxCountArray) return false
        if (this.offsetArray != other.offsetArray) return false
        if (this.actualCountArray != other.actualCountArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dimension.hashCode()
        result = 31 * result + this.bufferConformanceMark.hashCode()
        result = 31 * result + this.bufferVarianceMark.hashCode()
        result = 31 * result + this.maxCountArray.hashCode()
        result = 31 * result + this.offsetArray.hashCode()
        result = 31 * result + this.actualCountArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArrayInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArrayInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): ArrayInfo =
                    ArrayInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: ArrayInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dimension)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.bufferConformanceMark)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 16L, value.bufferVarianceMark)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.maxCountArray)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 32L, value.offsetArray)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 40L, value.actualCountArray)
                }
            }

        public operator fun invoke(
            dimension: Int = 0,
            bufferConformanceMark: MutPtr<UInt> = MutPtr(0L),
            bufferVarianceMark: MutPtr<UInt> = MutPtr(0L),
            maxCountArray: MutPtr<UInt> = MutPtr(0L),
            offsetArray: MutPtr<UInt> = MutPtr(0L),
            actualCountArray: MutPtr<UInt> = MutPtr(0L),
        ): ArrayInfo =
            ArrayInfo(
                dimension = dimension,
                bufferConformanceMarkCtorArg = bufferConformanceMark,
                bufferVarianceMarkCtorArg = bufferVarianceMark,
                maxCountArrayCtorArg = maxCountArray,
                offsetArrayCtorArg = offsetArray,
                actualCountArrayCtorArg = actualCountArray,
            )
    }
}

public class BinaryParam internal constructor(
    bufferCtorArg: MutPtr<CVoid>,
    public var size: Short,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        size = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.buffer

    public operator fun component2(): Short = this.size

    public fun copy(buffer: MutPtr<CVoid> = this.buffer, size: Short = this.size): BinaryParam = BinaryParam(bufferCtorArg = buffer, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BinaryParam) return false
        if (this.buffer != other.buffer) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BinaryParam =
                    BinaryParam(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BinaryParam) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            buffer: MutPtr<CVoid> = MutPtr(0L),
            size: Short = 0,
        ): BinaryParam =
            BinaryParam(
                bufferCtorArg = buffer,
                size = size,
            )
    }
}

public class ClientCallReturn internal constructor(
    pointerCtorArg: MutPtr<CVoid>,
    public var simple: Int,
) {
    public var pointer: MutPtr<CVoid> = pointerCtorArg
        internal set

    public constructor() : this(
        pointerCtorArg = MutPtr(0L),
        simple = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pointer

    public operator fun component2(): Int = this.simple

    public fun copy(pointer: MutPtr<CVoid> = this.pointer, simple: Int = this.simple): ClientCallReturn = ClientCallReturn(pointerCtorArg = pointer, simple = simple)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClientCallReturn) return false
        if (this.pointer != other.pointer) return false
        if (this.simple != other.simple) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pointer.hashCode()
        result = 31 * result + this.simple.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pointer: MutPtr<CVoid> = MutPtr(0L),
            simple: Int = 0,
        ): ClientCallReturn =
            ClientCallReturn(
                pointerCtorArg = pointer,
                simple = simple,
            )
    }
}

public data class CommFaultOffsets(
    public var commOffset: Short = 0,
    public var faultOffset: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CommFaultOffsets> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CommFaultOffsets> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CommFaultOffsets =
                    CommFaultOffsets(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CommFaultOffsets) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.commOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.faultOffset)
                }
            }
    }
}

public class FullPtrXlatTables internal constructor(
    refIdToPointerCtorArg: MutPtr<CVoid>,
    pointerToRefIdCtorArg: MutPtr<CVoid>,
    public var nextRefId: UInt,
    public var xlatSide: XlatSide,
) {
    public var refIdToPointer: MutPtr<CVoid> = refIdToPointerCtorArg
        internal set

    public var pointerToRefId: MutPtr<CVoid> = pointerToRefIdCtorArg
        internal set

    public constructor() : this(
        refIdToPointerCtorArg = MutPtr(0L),
        pointerToRefIdCtorArg = MutPtr(0L),
        nextRefId = 0u,
        xlatSide = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.refIdToPointer

    public operator fun component2(): MutPtr<CVoid> = this.pointerToRefId

    public operator fun component3(): UInt = this.nextRefId

    public operator fun component4(): XlatSide = this.xlatSide

    public fun copy(refIdToPointer: MutPtr<CVoid> = this.refIdToPointer, pointerToRefId: MutPtr<CVoid> = this.pointerToRefId, nextRefId: UInt = this.nextRefId, xlatSide: XlatSide = this.xlatSide): FullPtrXlatTables = FullPtrXlatTables(refIdToPointerCtorArg = refIdToPointer, pointerToRefIdCtorArg = pointerToRefId, nextRefId = nextRefId, xlatSide = xlatSide)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FullPtrXlatTables) return false
        if (this.refIdToPointer != other.refIdToPointer) return false
        if (this.pointerToRefId != other.pointerToRefId) return false
        if (this.nextRefId != other.nextRefId) return false
        if (this.xlatSide != other.xlatSide) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.refIdToPointer.hashCode()
        result = 31 * result + this.pointerToRefId.hashCode()
        result = 31 * result + this.nextRefId.hashCode()
        result = 31 * result + this.xlatSide.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FullPtrXlatTables> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FullPtrXlatTables> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FullPtrXlatTables =
                    FullPtrXlatTables(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FullPtrXlatTables) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.refIdToPointer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pointerToRefId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nextRefId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.xlatSide)
                }
            }

        public operator fun invoke(
            refIdToPointer: MutPtr<CVoid> = MutPtr(0L),
            pointerToRefId: MutPtr<CVoid> = MutPtr(0L),
            nextRefId: UInt = 0u,
            xlatSide: XlatSide = 0,
        ): FullPtrXlatTables =
            FullPtrXlatTables(
                refIdToPointerCtorArg = refIdToPointer,
                pointerToRefIdCtorArg = pointerToRefId,
                nextRefId = nextRefId,
                xlatSide = xlatSide,
            )
    }
}

public class GenericBindingInfo internal constructor(
    pObjCtorArg: MutPtr<CVoid>,
    public var size: UInt,
    public var pfnBind: GenericBindingRoutine,
    public var pfnUnbind: GenericUnbindRoutine,
) {
    public var pObj: MutPtr<CVoid> = pObjCtorArg
        internal set

    public constructor() : this(
        pObjCtorArg = MutPtr(0L),
        size = 0u,
        pfnBind = null,
        pfnUnbind = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pObj

    public operator fun component2(): UInt = this.size

    public operator fun component3(): GenericBindingRoutine = this.pfnBind

    public operator fun component4(): GenericUnbindRoutine = this.pfnUnbind

    public fun copy(pObj: MutPtr<CVoid> = this.pObj, size: UInt = this.size, pfnBind: GenericBindingRoutine = this.pfnBind, pfnUnbind: GenericUnbindRoutine = this.pfnUnbind): GenericBindingInfo = GenericBindingInfo(pObjCtorArg = pObj, size = size, pfnBind = pfnBind, pfnUnbind = pfnUnbind)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GenericBindingInfo) return false
        if (this.pObj != other.pObj) return false
        if (this.size != other.size) return false
        if (this.pfnBind != other.pfnBind) return false
        if (this.pfnUnbind != other.pfnUnbind) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pObj.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.pfnBind.hashCode()
        result = 31 * result + this.pfnUnbind.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pObj: MutPtr<CVoid> = MutPtr(0L),
            size: UInt = 0u,
            pfnBind: GenericBindingRoutine = null,
            pfnUnbind: GenericUnbindRoutine = null,
        ): GenericBindingInfo =
            GenericBindingInfo(
                pObjCtorArg = pObj,
                size = size,
                pfnBind = pfnBind,
                pfnUnbind = pfnUnbind,
            )
    }
}

public data class GenericBindingRoutinePair(
    public var pfnBind: GenericBindingRoutine = null,
    public var pfnUnbind: GenericUnbindRoutine = null,
)

public data class IRpcProxyCallbackInterface(
    public var isValidMachineFn: IRpcProxyIsValidMachineFn = null,
    public var getClientAddressFn: IRpcProxyGetClientAddressFn = null,
    public var getConnectionTimeoutFn: IRpcProxyGetConnectionTimeoutFn = null,
    public var performCalloutFn: IRpcPerformCalloutFn = null,
    public var freeCalloutStateFn: IRpcFreeCalloutStateFn = null,
    public var getClientSessionAndResourceUUIDFn: IRpcProxyGetClientSessionAndResourceUuid = null,
    public var proxyFilterIfFn: IRpcProxyFilterIfFn = null,
    public var rpcProxyUpdatePerfCounterFn: IRpcProxyUpdatePerfCounterFn = null,
    public var rpcProxyUpdatePerfCounterBackendServerFn: IRpcProxyUpdatePerfCounterBackendServerFn = null,
)

public data class MallocFreeStruct(
    public var pfnAllocate: Int = 0,
    public var pfnFree: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MallocFreeStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MallocFreeStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MallocFreeStruct =
                    MallocFreeStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MallocFreeStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.pfnAllocate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.pfnFree)
                }
            }
    }
}

public data class MidlFormatString(
    public var pad: Short = 0,
    public var format: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlFormatString) return false
        if (this.pad != other.pad) return false
        if (!this.format.contentEquals(other.format)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pad.hashCode()
        result = 31 * result + this.format.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlFormatString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlFormatString> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MidlFormatString =
                    MidlFormatString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MidlFormatString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.pad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.format.toList())
                }
            }
    }
}

public class MidlInterceptionInfo internal constructor(
    public var version: UInt,
    procStringCtorArg: MutPtr<UByte>,
    procFormatOffsetTableCtorArg: ConstPtr<UShort>,
    public var procCount: UInt,
    typeStringCtorArg: MutPtr<UByte>,
) {
    public var procString: MutPtr<UByte> = procStringCtorArg
        internal set

    public var procFormatOffsetTable: ConstPtr<UShort> = procFormatOffsetTableCtorArg
        internal set

    public var typeString: MutPtr<UByte> = typeStringCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        procStringCtorArg = MutPtr(0L),
        procFormatOffsetTableCtorArg = ConstPtr(0L),
        procCount = 0u,
        typeStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<UByte> = this.procString

    public operator fun component3(): ConstPtr<UShort> = this.procFormatOffsetTable

    public operator fun component4(): UInt = this.procCount

    public operator fun component5(): MutPtr<UByte> = this.typeString

    public fun copy(version: UInt = this.version, procString: MutPtr<UByte> = this.procString, procFormatOffsetTable: ConstPtr<UShort> = this.procFormatOffsetTable, procCount: UInt = this.procCount, typeString: MutPtr<UByte> = this.typeString): MidlInterceptionInfo = MidlInterceptionInfo(version = version, procStringCtorArg = procString, procFormatOffsetTableCtorArg = procFormatOffsetTable, procCount = procCount, typeStringCtorArg = typeString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlInterceptionInfo) return false
        if (this.version != other.version) return false
        if (this.procString != other.procString) return false
        if (this.procFormatOffsetTable != other.procFormatOffsetTable) return false
        if (this.procCount != other.procCount) return false
        if (this.typeString != other.typeString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.procString.hashCode()
        result = 31 * result + this.procFormatOffsetTable.hashCode()
        result = 31 * result + this.procCount.hashCode()
        result = 31 * result + this.typeString.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlInterceptionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlInterceptionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): MidlInterceptionInfo =
                    MidlInterceptionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: MidlInterceptionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.procString)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.procFormatOffsetTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.procCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.typeString)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            procString: MutPtr<UByte> = MutPtr(0L),
            procFormatOffsetTable: ConstPtr<UShort> = ConstPtr(0L),
            procCount: UInt = 0u,
            typeString: MutPtr<UByte> = MutPtr(0L),
        ): MidlInterceptionInfo =
            MidlInterceptionInfo(
                version = version,
                procStringCtorArg = procString,
                procFormatOffsetTableCtorArg = procFormatOffsetTable,
                procCount = procCount,
                typeStringCtorArg = typeString,
            )
    }
}

public class MidlInterfaceMethodProperties internal constructor(
    public var methodCount: UShort,
    methodPropertiesCtorArg: ConstPtr<ConstPtr<MidlMethodPropertyMap>>,
) {
    public var methodProperties: ConstPtr<ConstPtr<MidlMethodPropertyMap>> = methodPropertiesCtorArg
        internal set

    public constructor() : this(
        methodCount = 0u,
        methodPropertiesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.methodCount

    public operator fun component2(): ConstPtr<ConstPtr<MidlMethodPropertyMap>> = this.methodProperties

    public fun copy(methodCount: UShort = this.methodCount, methodProperties: ConstPtr<ConstPtr<MidlMethodPropertyMap>> = this.methodProperties): MidlInterfaceMethodProperties = MidlInterfaceMethodProperties(methodCount = methodCount, methodPropertiesCtorArg = methodProperties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlInterfaceMethodProperties) return false
        if (this.methodCount != other.methodCount) return false
        if (this.methodProperties != other.methodProperties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.methodCount.hashCode()
        result = 31 * result + this.methodProperties.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlInterfaceMethodProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlInterfaceMethodProperties> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MidlInterfaceMethodProperties =
                    MidlInterfaceMethodProperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ConstPtr<MidlMethodPropertyMap>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MidlInterfaceMethodProperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.methodCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ConstPtr<MidlMethodPropertyMap>>(64)
                    ).writeNative(addr + 8L, value.methodProperties)
                }
            }

        public operator fun invoke(
            methodCount: UShort = 0u,
            methodProperties: ConstPtr<ConstPtr<MidlMethodPropertyMap>> = ConstPtr(0L),
        ): MidlInterfaceMethodProperties =
            MidlInterfaceMethodProperties(
                methodCount = methodCount,
                methodPropertiesCtorArg = methodProperties,
            )
    }
}

public data class MidlMethodProperty(
    public var id: UInt = 0u,
    public var value: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlMethodProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlMethodProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MidlMethodProperty =
                    MidlMethodProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MidlMethodProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class MidlMethodPropertyMap internal constructor(
    public var count: UInt,
    propertiesCtorArg: ConstPtr<MidlMethodProperty>,
) {
    public var properties: ConstPtr<MidlMethodProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        propertiesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): ConstPtr<MidlMethodProperty> = this.properties

    public fun copy(count: UInt = this.count, properties: ConstPtr<MidlMethodProperty> = this.properties): MidlMethodPropertyMap = MidlMethodPropertyMap(count = count, propertiesCtorArg = properties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlMethodPropertyMap) return false
        if (this.count != other.count) return false
        if (this.properties != other.properties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.properties.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlMethodPropertyMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlMethodPropertyMap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MidlMethodPropertyMap =
                    MidlMethodPropertyMap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<MidlMethodProperty>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MidlMethodPropertyMap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<MidlMethodProperty>(64)
                    ).writeNative(addr + 8L, value.properties)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            properties: ConstPtr<MidlMethodProperty> = ConstPtr(0L),
        ): MidlMethodPropertyMap =
            MidlMethodPropertyMap(
                count = count,
                propertiesCtorArg = properties,
            )
    }
}

public class MidlServerInfo internal constructor(
    pStubDescCtorArg: MutPtr<MidlStubDesc>,
    dispatchTableCtorArg: ConstPtr<ServerRoutine>,
    procStringCtorArg: MutPtr<UByte>,
    fmtStringOffsetCtorArg: ConstPtr<UShort>,
    thunkTableCtorArg: ConstPtr<StubThunk>,
    pTransferSyntaxCtorArg: MutPtr<RpcSyntaxIdentifier>,
    public var nCount: Int,
    pSyntaxInfoCtorArg: MutPtr<MidlSyntaxInfo>,
) {
    public var pStubDesc: MutPtr<MidlStubDesc> = pStubDescCtorArg
        internal set

    public var dispatchTable: ConstPtr<ServerRoutine> = dispatchTableCtorArg
        internal set

    public var procString: MutPtr<UByte> = procStringCtorArg
        internal set

    public var fmtStringOffset: ConstPtr<UShort> = fmtStringOffsetCtorArg
        internal set

    public var thunkTable: ConstPtr<StubThunk> = thunkTableCtorArg
        internal set

    public var pTransferSyntax: MutPtr<RpcSyntaxIdentifier> = pTransferSyntaxCtorArg
        internal set

    public var pSyntaxInfo: MutPtr<MidlSyntaxInfo> = pSyntaxInfoCtorArg
        internal set

    public constructor() : this(
        pStubDescCtorArg = MutPtr(0L),
        dispatchTableCtorArg = ConstPtr(0L),
        procStringCtorArg = MutPtr(0L),
        fmtStringOffsetCtorArg = ConstPtr(0L),
        thunkTableCtorArg = ConstPtr(0L),
        pTransferSyntaxCtorArg = MutPtr(0L),
        nCount = 0,
        pSyntaxInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<MidlStubDesc> = this.pStubDesc

    public operator fun component2(): ConstPtr<ServerRoutine> = this.dispatchTable

    public operator fun component3(): MutPtr<UByte> = this.procString

    public operator fun component4(): ConstPtr<UShort> = this.fmtStringOffset

    public operator fun component5(): ConstPtr<StubThunk> = this.thunkTable

    public operator fun component6(): MutPtr<RpcSyntaxIdentifier> = this.pTransferSyntax

    public operator fun component7(): Int = this.nCount

    public operator fun component8(): MutPtr<MidlSyntaxInfo> = this.pSyntaxInfo

    public fun copy(pStubDesc: MutPtr<MidlStubDesc> = this.pStubDesc, dispatchTable: ConstPtr<ServerRoutine> = this.dispatchTable, procString: MutPtr<UByte> = this.procString, fmtStringOffset: ConstPtr<UShort> = this.fmtStringOffset, thunkTable: ConstPtr<StubThunk> = this.thunkTable, pTransferSyntax: MutPtr<RpcSyntaxIdentifier> = this.pTransferSyntax, nCount: Int = this.nCount, pSyntaxInfo: MutPtr<MidlSyntaxInfo> = this.pSyntaxInfo): MidlServerInfo = MidlServerInfo(pStubDescCtorArg = pStubDesc, dispatchTableCtorArg = dispatchTable, procStringCtorArg = procString, fmtStringOffsetCtorArg = fmtStringOffset, thunkTableCtorArg = thunkTable, pTransferSyntaxCtorArg = pTransferSyntax, nCount = nCount, pSyntaxInfoCtorArg = pSyntaxInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlServerInfo) return false
        if (this.pStubDesc != other.pStubDesc) return false
        if (this.dispatchTable != other.dispatchTable) return false
        if (this.procString != other.procString) return false
        if (this.fmtStringOffset != other.fmtStringOffset) return false
        if (this.thunkTable != other.thunkTable) return false
        if (this.pTransferSyntax != other.pTransferSyntax) return false
        if (this.nCount != other.nCount) return false
        if (this.pSyntaxInfo != other.pSyntaxInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pStubDesc.hashCode()
        result = 31 * result + this.dispatchTable.hashCode()
        result = 31 * result + this.procString.hashCode()
        result = 31 * result + this.fmtStringOffset.hashCode()
        result = 31 * result + this.thunkTable.hashCode()
        result = 31 * result + this.pTransferSyntax.hashCode()
        result = 31 * result + this.nCount.hashCode()
        result = 31 * result + this.pSyntaxInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlServerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlServerInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MidlServerInfo =
                    MidlServerInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MidlStubDesc>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ServerRoutine>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<StubThunk>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RpcSyntaxIdentifier>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MidlSyntaxInfo>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MidlServerInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MidlStubDesc>(64)
                    ).writeNative(addr, value.pStubDesc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ServerRoutine>(64)
                    ).writeNative(addr + 8L, value.dispatchTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.procString)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 24L, value.fmtStringOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<StubThunk>(64)
                    ).writeNative(addr + 32L, value.thunkTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RpcSyntaxIdentifier>(64)
                    ).writeNative(addr + 40L, value.pTransferSyntax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.nCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MidlSyntaxInfo>(64)
                    ).writeNative(addr + 56L, value.pSyntaxInfo)
                }
            }

        public operator fun invoke(
            pStubDesc: MutPtr<MidlStubDesc> = MutPtr(0L),
            dispatchTable: ConstPtr<ServerRoutine> = ConstPtr(0L),
            procString: MutPtr<UByte> = MutPtr(0L),
            fmtStringOffset: ConstPtr<UShort> = ConstPtr(0L),
            thunkTable: ConstPtr<StubThunk> = ConstPtr(0L),
            pTransferSyntax: MutPtr<RpcSyntaxIdentifier> = MutPtr(0L),
            nCount: Int = 0,
            pSyntaxInfo: MutPtr<MidlSyntaxInfo> = MutPtr(0L),
        ): MidlServerInfo =
            MidlServerInfo(
                pStubDescCtorArg = pStubDesc,
                dispatchTableCtorArg = dispatchTable,
                procStringCtorArg = procString,
                fmtStringOffsetCtorArg = fmtStringOffset,
                thunkTableCtorArg = thunkTable,
                pTransferSyntaxCtorArg = pTransferSyntax,
                nCount = nCount,
                pSyntaxInfoCtorArg = pSyntaxInfo,
            )
    }
}

public class MidlStublessProxyInfo internal constructor(
    pStubDescCtorArg: MutPtr<MidlStubDesc>,
    procFormatStringCtorArg: MutPtr<UByte>,
    formatStringOffsetCtorArg: ConstPtr<UShort>,
    pTransferSyntaxCtorArg: MutPtr<RpcSyntaxIdentifier>,
    public var nCount: Int,
    pSyntaxInfoCtorArg: MutPtr<MidlSyntaxInfo>,
) {
    public var pStubDesc: MutPtr<MidlStubDesc> = pStubDescCtorArg
        internal set

    public var procFormatString: MutPtr<UByte> = procFormatStringCtorArg
        internal set

    public var formatStringOffset: ConstPtr<UShort> = formatStringOffsetCtorArg
        internal set

    public var pTransferSyntax: MutPtr<RpcSyntaxIdentifier> = pTransferSyntaxCtorArg
        internal set

    public var pSyntaxInfo: MutPtr<MidlSyntaxInfo> = pSyntaxInfoCtorArg
        internal set

    public constructor() : this(
        pStubDescCtorArg = MutPtr(0L),
        procFormatStringCtorArg = MutPtr(0L),
        formatStringOffsetCtorArg = ConstPtr(0L),
        pTransferSyntaxCtorArg = MutPtr(0L),
        nCount = 0,
        pSyntaxInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<MidlStubDesc> = this.pStubDesc

    public operator fun component2(): MutPtr<UByte> = this.procFormatString

    public operator fun component3(): ConstPtr<UShort> = this.formatStringOffset

    public operator fun component4(): MutPtr<RpcSyntaxIdentifier> = this.pTransferSyntax

    public operator fun component5(): Int = this.nCount

    public operator fun component6(): MutPtr<MidlSyntaxInfo> = this.pSyntaxInfo

    public fun copy(pStubDesc: MutPtr<MidlStubDesc> = this.pStubDesc, procFormatString: MutPtr<UByte> = this.procFormatString, formatStringOffset: ConstPtr<UShort> = this.formatStringOffset, pTransferSyntax: MutPtr<RpcSyntaxIdentifier> = this.pTransferSyntax, nCount: Int = this.nCount, pSyntaxInfo: MutPtr<MidlSyntaxInfo> = this.pSyntaxInfo): MidlStublessProxyInfo = MidlStublessProxyInfo(pStubDescCtorArg = pStubDesc, procFormatStringCtorArg = procFormatString, formatStringOffsetCtorArg = formatStringOffset, pTransferSyntaxCtorArg = pTransferSyntax, nCount = nCount, pSyntaxInfoCtorArg = pSyntaxInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlStublessProxyInfo) return false
        if (this.pStubDesc != other.pStubDesc) return false
        if (this.procFormatString != other.procFormatString) return false
        if (this.formatStringOffset != other.formatStringOffset) return false
        if (this.pTransferSyntax != other.pTransferSyntax) return false
        if (this.nCount != other.nCount) return false
        if (this.pSyntaxInfo != other.pSyntaxInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pStubDesc.hashCode()
        result = 31 * result + this.procFormatString.hashCode()
        result = 31 * result + this.formatStringOffset.hashCode()
        result = 31 * result + this.pTransferSyntax.hashCode()
        result = 31 * result + this.nCount.hashCode()
        result = 31 * result + this.pSyntaxInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlStublessProxyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlStublessProxyInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MidlStublessProxyInfo =
                    MidlStublessProxyInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MidlStubDesc>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RpcSyntaxIdentifier>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MidlSyntaxInfo>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MidlStublessProxyInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MidlStubDesc>(64)
                    ).writeNative(addr, value.pStubDesc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.procFormatString)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.formatStringOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RpcSyntaxIdentifier>(64)
                    ).writeNative(addr + 24L, value.pTransferSyntax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.nCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MidlSyntaxInfo>(64)
                    ).writeNative(addr + 40L, value.pSyntaxInfo)
                }
            }

        public operator fun invoke(
            pStubDesc: MutPtr<MidlStubDesc> = MutPtr(0L),
            procFormatString: MutPtr<UByte> = MutPtr(0L),
            formatStringOffset: ConstPtr<UShort> = ConstPtr(0L),
            pTransferSyntax: MutPtr<RpcSyntaxIdentifier> = MutPtr(0L),
            nCount: Int = 0,
            pSyntaxInfo: MutPtr<MidlSyntaxInfo> = MutPtr(0L),
        ): MidlStublessProxyInfo =
            MidlStublessProxyInfo(
                pStubDescCtorArg = pStubDesc,
                procFormatStringCtorArg = procFormatString,
                formatStringOffsetCtorArg = formatStringOffset,
                pTransferSyntaxCtorArg = pTransferSyntax,
                nCount = nCount,
                pSyntaxInfoCtorArg = pSyntaxInfo,
            )
    }
}

public class MidlStubDesc internal constructor(
    rpcInterfaceInformationCtorArg: MutPtr<CVoid>,
    public var pfnAllocate: PfnRpcAllocate,
    public var pfnFree: PfnRpcFree,
    public var implicitHandleInfo: MidlStubDesc0,
    apfnNdrRundownRoutinesCtorArg: ConstPtr<NdrRundown>,
    aGenericBindingRoutinePairsCtorArg: ConstPtr<GenericBindingRoutinePair>,
    apfnExprEvalCtorArg: ConstPtr<ExprEval>,
    aXmitQuintupleCtorArg: ConstPtr<XmitRoutineQuintuple>,
    pFormatTypesCtorArg: ConstPtr<UByte>,
    public var fCheckBounds: Int,
    public var version: UInt,
    pMallocFreeStructCtorArg: MutPtr<MallocFreeStruct>,
    public var mIDLVersion: Int,
    commFaultOffsetsCtorArg: ConstPtr<CommFaultOffsets>,
    aUserMarshalQuadrupleCtorArg: ConstPtr<UserMarshalRoutineQuadruple>,
    notifyRoutineTableCtorArg: ConstPtr<NdrNotifyRoutine>,
    public var mFlags: Int,
    csRoutineTablesCtorArg: ConstPtr<NdrCsRoutines>,
    proxyServerInfoCtorArg: MutPtr<CVoid>,
    pExprInfoCtorArg: ConstPtr<NdrExprDesc>,
) {
    public var rpcInterfaceInformation: MutPtr<CVoid> = rpcInterfaceInformationCtorArg
        internal set

    public var apfnNdrRundownRoutines: ConstPtr<NdrRundown> = apfnNdrRundownRoutinesCtorArg
        internal set

    public var aGenericBindingRoutinePairs: ConstPtr<GenericBindingRoutinePair> = aGenericBindingRoutinePairsCtorArg
        internal set

    public var apfnExprEval: ConstPtr<ExprEval> = apfnExprEvalCtorArg
        internal set

    public var aXmitQuintuple: ConstPtr<XmitRoutineQuintuple> = aXmitQuintupleCtorArg
        internal set

    public var pFormatTypes: ConstPtr<UByte> = pFormatTypesCtorArg
        internal set

    public var pMallocFreeStruct: MutPtr<MallocFreeStruct> = pMallocFreeStructCtorArg
        internal set

    public var commFaultOffsets: ConstPtr<CommFaultOffsets> = commFaultOffsetsCtorArg
        internal set

    public var aUserMarshalQuadruple: ConstPtr<UserMarshalRoutineQuadruple> = aUserMarshalQuadrupleCtorArg
        internal set

    public var notifyRoutineTable: ConstPtr<NdrNotifyRoutine> = notifyRoutineTableCtorArg
        internal set

    public var csRoutineTables: ConstPtr<NdrCsRoutines> = csRoutineTablesCtorArg
        internal set

    public var proxyServerInfo: MutPtr<CVoid> = proxyServerInfoCtorArg
        internal set

    public var pExprInfo: ConstPtr<NdrExprDesc> = pExprInfoCtorArg
        internal set

    public constructor() : this(
        rpcInterfaceInformationCtorArg = MutPtr(0L),
        pfnAllocate = null,
        pfnFree = null,
        implicitHandleInfo = MidlStubDesc0(),
        apfnNdrRundownRoutinesCtorArg = ConstPtr(0L),
        aGenericBindingRoutinePairsCtorArg = ConstPtr(0L),
        apfnExprEvalCtorArg = ConstPtr(0L),
        aXmitQuintupleCtorArg = ConstPtr(0L),
        pFormatTypesCtorArg = ConstPtr(0L),
        fCheckBounds = 0,
        version = 0u,
        pMallocFreeStructCtorArg = MutPtr(0L),
        mIDLVersion = 0,
        commFaultOffsetsCtorArg = ConstPtr(0L),
        aUserMarshalQuadrupleCtorArg = ConstPtr(0L),
        notifyRoutineTableCtorArg = ConstPtr(0L),
        mFlags = 0,
        csRoutineTablesCtorArg = ConstPtr(0L),
        proxyServerInfoCtorArg = MutPtr(0L),
        pExprInfoCtorArg = ConstPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            rpcInterfaceInformation: MutPtr<CVoid> = MutPtr(0L),
            pfnAllocate: PfnRpcAllocate = null,
            pfnFree: PfnRpcFree = null,
            implicitHandleInfo: MidlStubDesc0 = MidlStubDesc0(),
            apfnNdrRundownRoutines: ConstPtr<NdrRundown> = ConstPtr(0L),
            aGenericBindingRoutinePairs: ConstPtr<GenericBindingRoutinePair> = ConstPtr(0L),
            apfnExprEval: ConstPtr<ExprEval> = ConstPtr(0L),
            aXmitQuintuple: ConstPtr<XmitRoutineQuintuple> = ConstPtr(0L),
            pFormatTypes: ConstPtr<UByte> = ConstPtr(0L),
            fCheckBounds: Int = 0,
            version: UInt = 0u,
            pMallocFreeStruct: MutPtr<MallocFreeStruct> = MutPtr(0L),
            mIDLVersion: Int = 0,
            commFaultOffsets: ConstPtr<CommFaultOffsets> = ConstPtr(0L),
            aUserMarshalQuadruple: ConstPtr<UserMarshalRoutineQuadruple> = ConstPtr(0L),
            notifyRoutineTable: ConstPtr<NdrNotifyRoutine> = ConstPtr(0L),
            mFlags: Int = 0,
            csRoutineTables: ConstPtr<NdrCsRoutines> = ConstPtr(0L),
            proxyServerInfo: MutPtr<CVoid> = MutPtr(0L),
            pExprInfo: ConstPtr<NdrExprDesc> = ConstPtr(0L),
        ): MidlStubDesc =
            MidlStubDesc(
                rpcInterfaceInformationCtorArg = rpcInterfaceInformation,
                pfnAllocate = pfnAllocate,
                pfnFree = pfnFree,
                implicitHandleInfo = implicitHandleInfo,
                apfnNdrRundownRoutinesCtorArg = apfnNdrRundownRoutines,
                aGenericBindingRoutinePairsCtorArg = aGenericBindingRoutinePairs,
                apfnExprEvalCtorArg = apfnExprEval,
                aXmitQuintupleCtorArg = aXmitQuintuple,
                pFormatTypesCtorArg = pFormatTypes,
                fCheckBounds = fCheckBounds,
                version = version,
                pMallocFreeStructCtorArg = pMallocFreeStruct,
                mIDLVersion = mIDLVersion,
                commFaultOffsetsCtorArg = commFaultOffsets,
                aUserMarshalQuadrupleCtorArg = aUserMarshalQuadruple,
                notifyRoutineTableCtorArg = notifyRoutineTable,
                mFlags = mFlags,
                csRoutineTablesCtorArg = csRoutineTables,
                proxyServerInfoCtorArg = proxyServerInfo,
                pExprInfoCtorArg = pExprInfo,
            )
    }
}

public class MidlStubDesc0 internal constructor(
    pAutoHandleCtorArg: MutPtr<MutPtr<CVoid>>,
    pPrimitiveHandleCtorArg: MutPtr<MutPtr<CVoid>>,
    pGenericBindingInfoCtorArg: MutPtr<GenericBindingInfo>,
) {
    public var pAutoHandle: MutPtr<MutPtr<CVoid>> = pAutoHandleCtorArg
        internal set

    public var pPrimitiveHandle: MutPtr<MutPtr<CVoid>> = pPrimitiveHandleCtorArg
        internal set

    public var pGenericBindingInfo: MutPtr<GenericBindingInfo> = pGenericBindingInfoCtorArg
        internal set

    public constructor() : this(
        pAutoHandleCtorArg = MutPtr(0L),
        pPrimitiveHandleCtorArg = MutPtr(0L),
        pGenericBindingInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<MutPtr<CVoid>> = this.pAutoHandle

    public operator fun component2(): MutPtr<MutPtr<CVoid>> = this.pPrimitiveHandle

    public operator fun component3(): MutPtr<GenericBindingInfo> = this.pGenericBindingInfo

    public fun copy(pAutoHandle: MutPtr<MutPtr<CVoid>> = this.pAutoHandle, pPrimitiveHandle: MutPtr<MutPtr<CVoid>> = this.pPrimitiveHandle, pGenericBindingInfo: MutPtr<GenericBindingInfo> = this.pGenericBindingInfo): MidlStubDesc0 = MidlStubDesc0(pAutoHandleCtorArg = pAutoHandle, pPrimitiveHandleCtorArg = pPrimitiveHandle, pGenericBindingInfoCtorArg = pGenericBindingInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlStubDesc0) return false
        if (this.pAutoHandle != other.pAutoHandle) return false
        if (this.pPrimitiveHandle != other.pPrimitiveHandle) return false
        if (this.pGenericBindingInfo != other.pGenericBindingInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pAutoHandle.hashCode()
        result = 31 * result + this.pPrimitiveHandle.hashCode()
        result = 31 * result + this.pGenericBindingInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pAutoHandle: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            pPrimitiveHandle: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            pGenericBindingInfo: MutPtr<GenericBindingInfo> = MutPtr(0L),
        ): MidlStubDesc0 =
            MidlStubDesc0(
                pAutoHandleCtorArg = pAutoHandle,
                pPrimitiveHandleCtorArg = pPrimitiveHandle,
                pGenericBindingInfoCtorArg = pGenericBindingInfo,
            )
    }
}

public class MidlStubMessage internal constructor(
    rpcMsgCtorArg: MutPtr<RpcMessage>,
    bufferCtorArg: MutPtr<UByte>,
    bufferStartCtorArg: MutPtr<UByte>,
    bufferEndCtorArg: MutPtr<UByte>,
    bufferMarkCtorArg: MutPtr<UByte>,
    public var bufferLength: UInt,
    public var memorySize: UInt,
    memoryCtorArg: MutPtr<UByte>,
    public var isClient: UByte,
    public var pad: UByte,
    public var uFlags2: UShort,
    public var reuseBuffer: Int,
    pAllocAllNodesContextCtorArg: MutPtr<NdrAllocAllNodesContext>,
    pPointerQueueStateCtorArg: MutPtr<NdrPointerQueueState>,
    public var ignoreEmbeddedPointers: Int,
    pointerBufferMarkCtorArg: MutPtr<UByte>,
    public var corrDespIncrement: UByte,
    public var uFlags: UByte,
    public var uniquePtrCount: UShort,
    public var maxCount: Int,
    public var offset: UInt,
    public var actualCount: UInt,
    public var pfnAllocate: PfnRpcAllocate,
    public var pfnFree: PfnRpcFree,
    stackTopCtorArg: MutPtr<UByte>,
    pPresentedTypeCtorArg: MutPtr<UByte>,
    pTransmitTypeCtorArg: MutPtr<UByte>,
    savedHandleCtorArg: MutPtr<CVoid>,
    stubDescCtorArg: ConstPtr<MidlStubDesc>,
    fullPtrXlatTablesCtorArg: MutPtr<FullPtrXlatTables>,
    public var fullPtrRefId: UInt,
    public var pointerLength: UInt,
    public var bitfield: Int,
    public var dwDestContext: UInt,
    pvDestContextCtorArg: MutPtr<CVoid>,
    savedContextHandlesCtorArg: MutPtr<MutPtr<NdrScontext>>,
    public var paramNumber: Int,
    pRpcChannelBufferCtorArg: MutPtr<CVoid>,
    pArrayInfoCtorArg: MutPtr<ArrayInfo>,
    sizePtrCountArrayCtorArg: MutPtr<UInt>,
    sizePtrOffsetArrayCtorArg: MutPtr<UInt>,
    sizePtrLengthArrayCtorArg: MutPtr<UInt>,
    pArgQueueCtorArg: MutPtr<CVoid>,
    public var dwStubPhase: UInt,
    lowStackMarkCtorArg: MutPtr<CVoid>,
    public var pAsyncMsg: PndrAsyncMessage,
    public var pCorrInfo: PndrCorrelationInfo,
    pCorrMemoryCtorArg: MutPtr<UByte>,
    pMemoryListCtorArg: MutPtr<CVoid>,
    public var pCSInfo: Int,
    conformanceMarkCtorArg: MutPtr<UByte>,
    varianceMarkCtorArg: MutPtr<UByte>,
    public var unused: Int,
    pContextCtorArg: MutPtr<NdrProcContext>,
    contextHandleHashCtorArg: MutPtr<CVoid>,
    pUserMarshalListCtorArg: MutPtr<CVoid>,
    public var reserved513: Int,
    public var reserved514: Int,
    public var reserved515: Int,
) {
    public var rpcMsg: MutPtr<RpcMessage> = rpcMsgCtorArg
        internal set

    public var buffer: MutPtr<UByte> = bufferCtorArg
        internal set

    public var bufferStart: MutPtr<UByte> = bufferStartCtorArg
        internal set

    public var bufferEnd: MutPtr<UByte> = bufferEndCtorArg
        internal set

    public var bufferMark: MutPtr<UByte> = bufferMarkCtorArg
        internal set

    public var memory: MutPtr<UByte> = memoryCtorArg
        internal set

    public var pAllocAllNodesContext: MutPtr<NdrAllocAllNodesContext> = pAllocAllNodesContextCtorArg
        internal set

    public var pPointerQueueState: MutPtr<NdrPointerQueueState> = pPointerQueueStateCtorArg
        internal set

    public var pointerBufferMark: MutPtr<UByte> = pointerBufferMarkCtorArg
        internal set

    public var stackTop: MutPtr<UByte> = stackTopCtorArg
        internal set

    public var pPresentedType: MutPtr<UByte> = pPresentedTypeCtorArg
        internal set

    public var pTransmitType: MutPtr<UByte> = pTransmitTypeCtorArg
        internal set

    public var savedHandle: MutPtr<CVoid> = savedHandleCtorArg
        internal set

    public var stubDesc: ConstPtr<MidlStubDesc> = stubDescCtorArg
        internal set

    public var fullPtrXlatTables: MutPtr<FullPtrXlatTables> = fullPtrXlatTablesCtorArg
        internal set

    public var pvDestContext: MutPtr<CVoid> = pvDestContextCtorArg
        internal set

    public var savedContextHandles: MutPtr<MutPtr<NdrScontext>> = savedContextHandlesCtorArg
        internal set

    public var pRpcChannelBuffer: MutPtr<CVoid> = pRpcChannelBufferCtorArg
        internal set

    public var pArrayInfo: MutPtr<ArrayInfo> = pArrayInfoCtorArg
        internal set

    public var sizePtrCountArray: MutPtr<UInt> = sizePtrCountArrayCtorArg
        internal set

    public var sizePtrOffsetArray: MutPtr<UInt> = sizePtrOffsetArrayCtorArg
        internal set

    public var sizePtrLengthArray: MutPtr<UInt> = sizePtrLengthArrayCtorArg
        internal set

    public var pArgQueue: MutPtr<CVoid> = pArgQueueCtorArg
        internal set

    public var lowStackMark: MutPtr<CVoid> = lowStackMarkCtorArg
        internal set

    public var pCorrMemory: MutPtr<UByte> = pCorrMemoryCtorArg
        internal set

    public var pMemoryList: MutPtr<CVoid> = pMemoryListCtorArg
        internal set

    public var conformanceMark: MutPtr<UByte> = conformanceMarkCtorArg
        internal set

    public var varianceMark: MutPtr<UByte> = varianceMarkCtorArg
        internal set

    public var pContext: MutPtr<NdrProcContext> = pContextCtorArg
        internal set

    public var contextHandleHash: MutPtr<CVoid> = contextHandleHashCtorArg
        internal set

    public var pUserMarshalList: MutPtr<CVoid> = pUserMarshalListCtorArg
        internal set

    public constructor() : this(
        rpcMsgCtorArg = MutPtr(0L),
        bufferCtorArg = MutPtr(0L),
        bufferStartCtorArg = MutPtr(0L),
        bufferEndCtorArg = MutPtr(0L),
        bufferMarkCtorArg = MutPtr(0L),
        bufferLength = 0u,
        memorySize = 0u,
        memoryCtorArg = MutPtr(0L),
        isClient = 0u,
        pad = 0u,
        uFlags2 = 0u,
        reuseBuffer = 0,
        pAllocAllNodesContextCtorArg = MutPtr(0L),
        pPointerQueueStateCtorArg = MutPtr(0L),
        ignoreEmbeddedPointers = 0,
        pointerBufferMarkCtorArg = MutPtr(0L),
        corrDespIncrement = 0u,
        uFlags = 0u,
        uniquePtrCount = 0u,
        maxCount = 0,
        offset = 0u,
        actualCount = 0u,
        pfnAllocate = null,
        pfnFree = null,
        stackTopCtorArg = MutPtr(0L),
        pPresentedTypeCtorArg = MutPtr(0L),
        pTransmitTypeCtorArg = MutPtr(0L),
        savedHandleCtorArg = MutPtr(0L),
        stubDescCtorArg = ConstPtr(0L),
        fullPtrXlatTablesCtorArg = MutPtr(0L),
        fullPtrRefId = 0u,
        pointerLength = 0u,
        bitfield = 0,
        dwDestContext = 0u,
        pvDestContextCtorArg = MutPtr(0L),
        savedContextHandlesCtorArg = MutPtr(0L),
        paramNumber = 0,
        pRpcChannelBufferCtorArg = MutPtr(0L),
        pArrayInfoCtorArg = MutPtr(0L),
        sizePtrCountArrayCtorArg = MutPtr(0L),
        sizePtrOffsetArrayCtorArg = MutPtr(0L),
        sizePtrLengthArrayCtorArg = MutPtr(0L),
        pArgQueueCtorArg = MutPtr(0L),
        dwStubPhase = 0u,
        lowStackMarkCtorArg = MutPtr(0L),
        pAsyncMsg = 0,
        pCorrInfo = 0,
        pCorrMemoryCtorArg = MutPtr(0L),
        pMemoryListCtorArg = MutPtr(0L),
        pCSInfo = 0,
        conformanceMarkCtorArg = MutPtr(0L),
        varianceMarkCtorArg = MutPtr(0L),
        unused = 0,
        pContextCtorArg = MutPtr(0L),
        contextHandleHashCtorArg = MutPtr(0L),
        pUserMarshalListCtorArg = MutPtr(0L),
        reserved513 = 0,
        reserved514 = 0,
        reserved515 = 0,
    )

    public companion object {
        public operator fun invoke(
            rpcMsg: MutPtr<RpcMessage> = MutPtr(0L),
            buffer: MutPtr<UByte> = MutPtr(0L),
            bufferStart: MutPtr<UByte> = MutPtr(0L),
            bufferEnd: MutPtr<UByte> = MutPtr(0L),
            bufferMark: MutPtr<UByte> = MutPtr(0L),
            bufferLength: UInt = 0u,
            memorySize: UInt = 0u,
            memory: MutPtr<UByte> = MutPtr(0L),
            isClient: UByte = 0u,
            pad: UByte = 0u,
            uFlags2: UShort = 0u,
            reuseBuffer: Int = 0,
            pAllocAllNodesContext: MutPtr<NdrAllocAllNodesContext> = MutPtr(0L),
            pPointerQueueState: MutPtr<NdrPointerQueueState> = MutPtr(0L),
            ignoreEmbeddedPointers: Int = 0,
            pointerBufferMark: MutPtr<UByte> = MutPtr(0L),
            corrDespIncrement: UByte = 0u,
            uFlags: UByte = 0u,
            uniquePtrCount: UShort = 0u,
            maxCount: Int = 0,
            offset: UInt = 0u,
            actualCount: UInt = 0u,
            pfnAllocate: PfnRpcAllocate = null,
            pfnFree: PfnRpcFree = null,
            stackTop: MutPtr<UByte> = MutPtr(0L),
            pPresentedType: MutPtr<UByte> = MutPtr(0L),
            pTransmitType: MutPtr<UByte> = MutPtr(0L),
            savedHandle: MutPtr<CVoid> = MutPtr(0L),
            stubDesc: ConstPtr<MidlStubDesc> = ConstPtr(0L),
            fullPtrXlatTables: MutPtr<FullPtrXlatTables> = MutPtr(0L),
            fullPtrRefId: UInt = 0u,
            pointerLength: UInt = 0u,
            bitfield: Int = 0,
            dwDestContext: UInt = 0u,
            pvDestContext: MutPtr<CVoid> = MutPtr(0L),
            savedContextHandles: MutPtr<MutPtr<NdrScontext>> = MutPtr(0L),
            paramNumber: Int = 0,
            pRpcChannelBuffer: MutPtr<CVoid> = MutPtr(0L),
            pArrayInfo: MutPtr<ArrayInfo> = MutPtr(0L),
            sizePtrCountArray: MutPtr<UInt> = MutPtr(0L),
            sizePtrOffsetArray: MutPtr<UInt> = MutPtr(0L),
            sizePtrLengthArray: MutPtr<UInt> = MutPtr(0L),
            pArgQueue: MutPtr<CVoid> = MutPtr(0L),
            dwStubPhase: UInt = 0u,
            lowStackMark: MutPtr<CVoid> = MutPtr(0L),
            pAsyncMsg: PndrAsyncMessage = 0,
            pCorrInfo: PndrCorrelationInfo = 0,
            pCorrMemory: MutPtr<UByte> = MutPtr(0L),
            pMemoryList: MutPtr<CVoid> = MutPtr(0L),
            pCSInfo: Int = 0,
            conformanceMark: MutPtr<UByte> = MutPtr(0L),
            varianceMark: MutPtr<UByte> = MutPtr(0L),
            unused: Int = 0,
            pContext: MutPtr<NdrProcContext> = MutPtr(0L),
            contextHandleHash: MutPtr<CVoid> = MutPtr(0L),
            pUserMarshalList: MutPtr<CVoid> = MutPtr(0L),
            reserved513: Int = 0,
            reserved514: Int = 0,
            reserved515: Int = 0,
        ): MidlStubMessage =
            MidlStubMessage(
                rpcMsgCtorArg = rpcMsg,
                bufferCtorArg = buffer,
                bufferStartCtorArg = bufferStart,
                bufferEndCtorArg = bufferEnd,
                bufferMarkCtorArg = bufferMark,
                bufferLength = bufferLength,
                memorySize = memorySize,
                memoryCtorArg = memory,
                isClient = isClient,
                pad = pad,
                uFlags2 = uFlags2,
                reuseBuffer = reuseBuffer,
                pAllocAllNodesContextCtorArg = pAllocAllNodesContext,
                pPointerQueueStateCtorArg = pPointerQueueState,
                ignoreEmbeddedPointers = ignoreEmbeddedPointers,
                pointerBufferMarkCtorArg = pointerBufferMark,
                corrDespIncrement = corrDespIncrement,
                uFlags = uFlags,
                uniquePtrCount = uniquePtrCount,
                maxCount = maxCount,
                offset = offset,
                actualCount = actualCount,
                pfnAllocate = pfnAllocate,
                pfnFree = pfnFree,
                stackTopCtorArg = stackTop,
                pPresentedTypeCtorArg = pPresentedType,
                pTransmitTypeCtorArg = pTransmitType,
                savedHandleCtorArg = savedHandle,
                stubDescCtorArg = stubDesc,
                fullPtrXlatTablesCtorArg = fullPtrXlatTables,
                fullPtrRefId = fullPtrRefId,
                pointerLength = pointerLength,
                bitfield = bitfield,
                dwDestContext = dwDestContext,
                pvDestContextCtorArg = pvDestContext,
                savedContextHandlesCtorArg = savedContextHandles,
                paramNumber = paramNumber,
                pRpcChannelBufferCtorArg = pRpcChannelBuffer,
                pArrayInfoCtorArg = pArrayInfo,
                sizePtrCountArrayCtorArg = sizePtrCountArray,
                sizePtrOffsetArrayCtorArg = sizePtrOffsetArray,
                sizePtrLengthArrayCtorArg = sizePtrLengthArray,
                pArgQueueCtorArg = pArgQueue,
                dwStubPhase = dwStubPhase,
                lowStackMarkCtorArg = lowStackMark,
                pAsyncMsg = pAsyncMsg,
                pCorrInfo = pCorrInfo,
                pCorrMemoryCtorArg = pCorrMemory,
                pMemoryListCtorArg = pMemoryList,
                pCSInfo = pCSInfo,
                conformanceMarkCtorArg = conformanceMark,
                varianceMarkCtorArg = varianceMark,
                unused = unused,
                pContextCtorArg = pContext,
                contextHandleHashCtorArg = contextHandleHash,
                pUserMarshalListCtorArg = pUserMarshalList,
                reserved513 = reserved513,
                reserved514 = reserved514,
                reserved515 = reserved515,
            )
    }
}

public class MidlSyntaxInfo internal constructor(
    public var transferSyntax: RpcSyntaxIdentifier,
    dispatchTableCtorArg: MutPtr<RpcDispatchTable>,
    procStringCtorArg: MutPtr<UByte>,
    fmtStringOffsetCtorArg: ConstPtr<UShort>,
    typeStringCtorArg: MutPtr<UByte>,
    aUserMarshalQuadrupleCtorArg: ConstPtr<CVoid>,
    pMethodPropertiesCtorArg: ConstPtr<MidlInterfaceMethodProperties>,
    public var pReserved2: Int,
) {
    public var dispatchTable: MutPtr<RpcDispatchTable> = dispatchTableCtorArg
        internal set

    public var procString: MutPtr<UByte> = procStringCtorArg
        internal set

    public var fmtStringOffset: ConstPtr<UShort> = fmtStringOffsetCtorArg
        internal set

    public var typeString: MutPtr<UByte> = typeStringCtorArg
        internal set

    public var aUserMarshalQuadruple: ConstPtr<CVoid> = aUserMarshalQuadrupleCtorArg
        internal set

    public var pMethodProperties: ConstPtr<MidlInterfaceMethodProperties> = pMethodPropertiesCtorArg
        internal set

    public constructor() : this(
        transferSyntax = RpcSyntaxIdentifier(),
        dispatchTableCtorArg = MutPtr(0L),
        procStringCtorArg = MutPtr(0L),
        fmtStringOffsetCtorArg = ConstPtr(0L),
        typeStringCtorArg = MutPtr(0L),
        aUserMarshalQuadrupleCtorArg = ConstPtr(0L),
        pMethodPropertiesCtorArg = ConstPtr(0L),
        pReserved2 = 0,
    )

    public operator fun component1(): RpcSyntaxIdentifier = this.transferSyntax

    public operator fun component2(): MutPtr<RpcDispatchTable> = this.dispatchTable

    public operator fun component3(): MutPtr<UByte> = this.procString

    public operator fun component4(): ConstPtr<UShort> = this.fmtStringOffset

    public operator fun component5(): MutPtr<UByte> = this.typeString

    public operator fun component6(): ConstPtr<CVoid> = this.aUserMarshalQuadruple

    public operator fun component7(): ConstPtr<MidlInterfaceMethodProperties> = this.pMethodProperties

    public operator fun component8(): Int = this.pReserved2

    public fun copy(transferSyntax: RpcSyntaxIdentifier = this.transferSyntax, dispatchTable: MutPtr<RpcDispatchTable> = this.dispatchTable, procString: MutPtr<UByte> = this.procString, fmtStringOffset: ConstPtr<UShort> = this.fmtStringOffset, typeString: MutPtr<UByte> = this.typeString, aUserMarshalQuadruple: ConstPtr<CVoid> = this.aUserMarshalQuadruple, pMethodProperties: ConstPtr<MidlInterfaceMethodProperties> = this.pMethodProperties, pReserved2: Int = this.pReserved2): MidlSyntaxInfo = MidlSyntaxInfo(transferSyntax = transferSyntax, dispatchTableCtorArg = dispatchTable, procStringCtorArg = procString, fmtStringOffsetCtorArg = fmtStringOffset, typeStringCtorArg = typeString, aUserMarshalQuadrupleCtorArg = aUserMarshalQuadruple, pMethodPropertiesCtorArg = pMethodProperties, pReserved2 = pReserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlSyntaxInfo) return false
        if (this.transferSyntax != other.transferSyntax) return false
        if (this.dispatchTable != other.dispatchTable) return false
        if (this.procString != other.procString) return false
        if (this.fmtStringOffset != other.fmtStringOffset) return false
        if (this.typeString != other.typeString) return false
        if (this.aUserMarshalQuadruple != other.aUserMarshalQuadruple) return false
        if (this.pMethodProperties != other.pMethodProperties) return false
        if (this.pReserved2 != other.pReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transferSyntax.hashCode()
        result = 31 * result + this.dispatchTable.hashCode()
        result = 31 * result + this.procString.hashCode()
        result = 31 * result + this.fmtStringOffset.hashCode()
        result = 31 * result + this.typeString.hashCode()
        result = 31 * result + this.aUserMarshalQuadruple.hashCode()
        result = 31 * result + this.pMethodProperties.hashCode()
        result = 31 * result + this.pReserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            transferSyntax: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
            dispatchTable: MutPtr<RpcDispatchTable> = MutPtr(0L),
            procString: MutPtr<UByte> = MutPtr(0L),
            fmtStringOffset: ConstPtr<UShort> = ConstPtr(0L),
            typeString: MutPtr<UByte> = MutPtr(0L),
            aUserMarshalQuadruple: ConstPtr<CVoid> = ConstPtr(0L),
            pMethodProperties: ConstPtr<MidlInterfaceMethodProperties> = ConstPtr(0L),
            pReserved2: Int = 0,
        ): MidlSyntaxInfo =
            MidlSyntaxInfo(
                transferSyntax = transferSyntax,
                dispatchTableCtorArg = dispatchTable,
                procStringCtorArg = procString,
                fmtStringOffsetCtorArg = fmtStringOffset,
                typeStringCtorArg = typeString,
                aUserMarshalQuadrupleCtorArg = aUserMarshalQuadruple,
                pMethodPropertiesCtorArg = pMethodProperties,
                pReserved2 = pReserved2,
            )
    }
}

public data class MidlTypePicklingInfo(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlTypePicklingInfo) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlTypePicklingInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlTypePicklingInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MidlTypePicklingInfo =
                    MidlTypePicklingInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: MidlTypePicklingInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }
    }
}

public class MidlWinrtTypeSerializationInfo internal constructor(
    public var version: UInt,
    typeFormatStringCtorArg: MutPtr<UByte>,
    public var formatStringSize: UShort,
    public var typeOffset: UShort,
    stubDescCtorArg: MutPtr<MidlStubDesc>,
) {
    public var typeFormatString: MutPtr<UByte> = typeFormatStringCtorArg
        internal set

    public var stubDesc: MutPtr<MidlStubDesc> = stubDescCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        typeFormatStringCtorArg = MutPtr(0L),
        formatStringSize = 0u,
        typeOffset = 0u,
        stubDescCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<UByte> = this.typeFormatString

    public operator fun component3(): UShort = this.formatStringSize

    public operator fun component4(): UShort = this.typeOffset

    public operator fun component5(): MutPtr<MidlStubDesc> = this.stubDesc

    public fun copy(version: UInt = this.version, typeFormatString: MutPtr<UByte> = this.typeFormatString, formatStringSize: UShort = this.formatStringSize, typeOffset: UShort = this.typeOffset, stubDesc: MutPtr<MidlStubDesc> = this.stubDesc): MidlWinrtTypeSerializationInfo = MidlWinrtTypeSerializationInfo(version = version, typeFormatStringCtorArg = typeFormatString, formatStringSize = formatStringSize, typeOffset = typeOffset, stubDescCtorArg = stubDesc)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MidlWinrtTypeSerializationInfo) return false
        if (this.version != other.version) return false
        if (this.typeFormatString != other.typeFormatString) return false
        if (this.formatStringSize != other.formatStringSize) return false
        if (this.typeOffset != other.typeOffset) return false
        if (this.stubDesc != other.stubDesc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.typeFormatString.hashCode()
        result = 31 * result + this.formatStringSize.hashCode()
        result = 31 * result + this.typeOffset.hashCode()
        result = 31 * result + this.stubDesc.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlWinrtTypeSerializationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MidlWinrtTypeSerializationInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MidlWinrtTypeSerializationInfo =
                    MidlWinrtTypeSerializationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MidlStubDesc>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MidlWinrtTypeSerializationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.typeFormatString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.formatStringSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.typeOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MidlStubDesc>(64)
                    ).writeNative(addr + 24L, value.stubDesc)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            typeFormatString: MutPtr<UByte> = MutPtr(0L),
            formatStringSize: UShort = 0u,
            typeOffset: UShort = 0u,
            stubDesc: MutPtr<MidlStubDesc> = MutPtr(0L),
        ): MidlWinrtTypeSerializationInfo =
            MidlWinrtTypeSerializationInfo(
                version = version,
                typeFormatStringCtorArg = typeFormatString,
                formatStringSize = formatStringSize,
                typeOffset = typeOffset,
                stubDescCtorArg = stubDesc,
            )
    }
}

public class Ndr64ArrayElementInfo internal constructor(
    public var elementMemSize: UInt,
    elementCtorArg: MutPtr<CVoid>,
) {
    public var element: MutPtr<CVoid> = elementCtorArg
        internal set

    public constructor() : this(
        elementMemSize = 0u,
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.elementMemSize

    public operator fun component2(): MutPtr<CVoid> = this.element

    public fun copy(elementMemSize: UInt = this.elementMemSize, element: MutPtr<CVoid> = this.element): Ndr64ArrayElementInfo = Ndr64ArrayElementInfo(elementMemSize = elementMemSize, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ArrayElementInfo) return false
        if (this.elementMemSize != other.elementMemSize) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elementMemSize.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ArrayElementInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ArrayElementInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64ArrayElementInfo =
                    Ndr64ArrayElementInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ArrayElementInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.elementMemSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            elementMemSize: UInt = 0u,
            element: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64ArrayElementInfo =
            Ndr64ArrayElementInfo(
                elementMemSize = elementMemSize,
                elementCtorArg = element,
            )
    }
}

public data class Ndr64ArrayFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ArrayFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ArrayFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64ArrayFlags =
                    Ndr64ArrayFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64ArrayFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64Bindings(
    public var primitive: Ndr64BindPrimitive = Ndr64BindPrimitive(),
    public var generic: Ndr64BindGeneric = Ndr64BindGeneric(),
    public var context: Ndr64BindContext = Ndr64BindContext(),
)

public data class Ndr64BindAndNotifyExtension(
    public var binding: Ndr64BindContext = Ndr64BindContext(),
    public var notifyIndex: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindAndNotifyExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindAndNotifyExtension> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64BindAndNotifyExtension =
                    Ndr64BindAndNotifyExtension(
                        (Ndr64BindContext.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Ndr64BindAndNotifyExtension) {
                    (Ndr64BindContext.typeLayout()).writeNative(addr, value.binding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.notifyIndex)
                }
            }
    }
}

public data class Ndr64BindContext(
    public var handleType: UByte = 0u,
    public var flags: UByte = 0u,
    public var stackOffset: UShort = 0u,
    public var routineIndex: UByte = 0u,
    public var ordinal: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindContext> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Ndr64BindContext =
                    Ndr64BindContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: Ndr64BindContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.handleType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.stackOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.routineIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.ordinal)
                }
            }
    }
}

public data class Ndr64BindGeneric(
    public var handleType: UByte = 0u,
    public var flags: UByte = 0u,
    public var stackOffset: UShort = 0u,
    public var routineIndex: UByte = 0u,
    public var size: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindGeneric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindGeneric> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Ndr64BindGeneric =
                    Ndr64BindGeneric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: Ndr64BindGeneric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.handleType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.stackOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.routineIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.size)
                }
            }
    }
}

public data class Ndr64BindPrimitive(
    public var handleType: UByte = 0u,
    public var flags: UByte = 0u,
    public var stackOffset: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindPrimitive> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BindPrimitive> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Ndr64BindPrimitive =
                    Ndr64BindPrimitive(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64BindPrimitive) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.handleType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.stackOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public class Ndr64BogusArrayHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64ArrayFlags,
    public var numberDims: UByte,
    public var numberElements: UInt,
    elementCtorArg: MutPtr<CVoid>,
) {
    public var element: MutPtr<CVoid> = elementCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64ArrayFlags(),
        numberDims = 0u,
        numberElements = 0u,
        elementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64ArrayFlags = this.flags

    public operator fun component4(): UByte = this.numberDims

    public operator fun component5(): UInt = this.numberElements

    public operator fun component6(): MutPtr<CVoid> = this.element

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64ArrayFlags = this.flags, numberDims: UByte = this.numberDims, numberElements: UInt = this.numberElements, element: MutPtr<CVoid> = this.element): Ndr64BogusArrayHeaderFormat = Ndr64BogusArrayHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, numberDims = numberDims, numberElements = numberElements, elementCtorArg = element)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64BogusArrayHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.numberDims != other.numberDims) return false
        if (this.numberElements != other.numberElements) return false
        if (this.element != other.element) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numberDims.hashCode()
        result = 31 * result + this.numberElements.hashCode()
        result = 31 * result + this.element.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BogusArrayHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BogusArrayHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64BogusArrayHeaderFormat =
                    Ndr64BogusArrayHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64ArrayFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64BogusArrayHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64ArrayFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.numberDims)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.element)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
            numberDims: UByte = 0u,
            numberElements: UInt = 0u,
            element: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64BogusArrayHeaderFormat =
            Ndr64BogusArrayHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                numberDims = numberDims,
                numberElements = numberElements,
                elementCtorArg = element,
            )
    }
}

public class Ndr64BogusStructureHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64StructureFlags,
    public var reserve: UByte,
    public var memorySize: UInt,
    originalMemberLayoutCtorArg: MutPtr<CVoid>,
    originalPointerLayoutCtorArg: MutPtr<CVoid>,
    pointerLayoutCtorArg: MutPtr<CVoid>,
) {
    public var originalMemberLayout: MutPtr<CVoid> = originalMemberLayoutCtorArg
        internal set

    public var originalPointerLayout: MutPtr<CVoid> = originalPointerLayoutCtorArg
        internal set

    public var pointerLayout: MutPtr<CVoid> = pointerLayoutCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64StructureFlags(),
        reserve = 0u,
        memorySize = 0u,
        originalMemberLayoutCtorArg = MutPtr(0L),
        originalPointerLayoutCtorArg = MutPtr(0L),
        pointerLayoutCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64StructureFlags = this.flags

    public operator fun component4(): UByte = this.reserve

    public operator fun component5(): UInt = this.memorySize

    public operator fun component6(): MutPtr<CVoid> = this.originalMemberLayout

    public operator fun component7(): MutPtr<CVoid> = this.originalPointerLayout

    public operator fun component8(): MutPtr<CVoid> = this.pointerLayout

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64StructureFlags = this.flags, reserve: UByte = this.reserve, memorySize: UInt = this.memorySize, originalMemberLayout: MutPtr<CVoid> = this.originalMemberLayout, originalPointerLayout: MutPtr<CVoid> = this.originalPointerLayout, pointerLayout: MutPtr<CVoid> = this.pointerLayout): Ndr64BogusStructureHeaderFormat = Ndr64BogusStructureHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, reserve = reserve, memorySize = memorySize, originalMemberLayoutCtorArg = originalMemberLayout, originalPointerLayoutCtorArg = originalPointerLayout, pointerLayoutCtorArg = pointerLayout)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64BogusStructureHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.reserve != other.reserve) return false
        if (this.memorySize != other.memorySize) return false
        if (this.originalMemberLayout != other.originalMemberLayout) return false
        if (this.originalPointerLayout != other.originalPointerLayout) return false
        if (this.pointerLayout != other.pointerLayout) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserve.hashCode()
        result = 31 * result + this.memorySize.hashCode()
        result = 31 * result + this.originalMemberLayout.hashCode()
        result = 31 * result + this.originalPointerLayout.hashCode()
        result = 31 * result + this.pointerLayout.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BogusStructureHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BogusStructureHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ndr64BogusStructureHeaderFormat =
                    Ndr64BogusStructureHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64StructureFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
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
                    )
                override fun writeNative(addr: Long, value: Ndr64BogusStructureHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64StructureFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.memorySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.originalMemberLayout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.originalPointerLayout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pointerLayout)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64StructureFlags = Ndr64StructureFlags(),
            reserve: UByte = 0u,
            memorySize: UInt = 0u,
            originalMemberLayout: MutPtr<CVoid> = MutPtr(0L),
            originalPointerLayout: MutPtr<CVoid> = MutPtr(0L),
            pointerLayout: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64BogusStructureHeaderFormat =
            Ndr64BogusStructureHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                reserve = reserve,
                memorySize = memorySize,
                originalMemberLayoutCtorArg = originalMemberLayout,
                originalPointerLayoutCtorArg = originalPointerLayout,
                pointerLayoutCtorArg = pointerLayout,
            )
    }
}

public data class Ndr64BufferAlignFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var reserved: UShort = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BufferAlignFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64BufferAlignFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64BufferAlignFormat =
                    Ndr64BufferAlignFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64BufferAlignFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                }
            }
    }
}

public data class Ndr64ConformantStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConformantStringFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConformantStringFormat> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndr64ConformantStringFormat =
                    Ndr64ConformantStringFormat(
                        (Ndr64StringHeaderFormat.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64ConformantStringFormat) {
                    (Ndr64StringHeaderFormat.typeLayout()).writeNative(addr, value.header)
                }
            }
    }
}

public class Ndr64ConfArrayHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64ArrayFlags,
    public var reserved: UByte,
    public var elementSize: UInt,
    confDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var confDescriptor: MutPtr<CVoid> = confDescriptorCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64ArrayFlags(),
        reserved = 0u,
        elementSize = 0u,
        confDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64ArrayFlags = this.flags

    public operator fun component4(): UByte = this.reserved

    public operator fun component5(): UInt = this.elementSize

    public operator fun component6(): MutPtr<CVoid> = this.confDescriptor

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64ArrayFlags = this.flags, reserved: UByte = this.reserved, elementSize: UInt = this.elementSize, confDescriptor: MutPtr<CVoid> = this.confDescriptor): Ndr64ConfArrayHeaderFormat = Ndr64ConfArrayHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, reserved = reserved, elementSize = elementSize, confDescriptorCtorArg = confDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ConfArrayHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.elementSize != other.elementSize) return false
        if (this.confDescriptor != other.confDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.elementSize.hashCode()
        result = 31 * result + this.confDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfArrayHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfArrayHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64ConfArrayHeaderFormat =
                    Ndr64ConfArrayHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64ArrayFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ConfArrayHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64ArrayFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.elementSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.confDescriptor)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
            reserved: UByte = 0u,
            elementSize: UInt = 0u,
            confDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64ConfArrayHeaderFormat =
            Ndr64ConfArrayHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                reserved = reserved,
                elementSize = elementSize,
                confDescriptorCtorArg = confDescriptor,
            )
    }
}

public class Ndr64ConfBogusStructureHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64StructureFlags,
    public var dimensions: UByte,
    public var memorySize: UInt,
    originalMemberLayoutCtorArg: MutPtr<CVoid>,
    originalPointerLayoutCtorArg: MutPtr<CVoid>,
    pointerLayoutCtorArg: MutPtr<CVoid>,
    confArrayDescriptionCtorArg: MutPtr<CVoid>,
) {
    public var originalMemberLayout: MutPtr<CVoid> = originalMemberLayoutCtorArg
        internal set

    public var originalPointerLayout: MutPtr<CVoid> = originalPointerLayoutCtorArg
        internal set

    public var pointerLayout: MutPtr<CVoid> = pointerLayoutCtorArg
        internal set

    public var confArrayDescription: MutPtr<CVoid> = confArrayDescriptionCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64StructureFlags(),
        dimensions = 0u,
        memorySize = 0u,
        originalMemberLayoutCtorArg = MutPtr(0L),
        originalPointerLayoutCtorArg = MutPtr(0L),
        pointerLayoutCtorArg = MutPtr(0L),
        confArrayDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64StructureFlags = this.flags

    public operator fun component4(): UByte = this.dimensions

    public operator fun component5(): UInt = this.memorySize

    public operator fun component6(): MutPtr<CVoid> = this.originalMemberLayout

    public operator fun component7(): MutPtr<CVoid> = this.originalPointerLayout

    public operator fun component8(): MutPtr<CVoid> = this.pointerLayout

    public operator fun component9(): MutPtr<CVoid> = this.confArrayDescription

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64StructureFlags = this.flags, dimensions: UByte = this.dimensions, memorySize: UInt = this.memorySize, originalMemberLayout: MutPtr<CVoid> = this.originalMemberLayout, originalPointerLayout: MutPtr<CVoid> = this.originalPointerLayout, pointerLayout: MutPtr<CVoid> = this.pointerLayout, confArrayDescription: MutPtr<CVoid> = this.confArrayDescription): Ndr64ConfBogusStructureHeaderFormat = Ndr64ConfBogusStructureHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, dimensions = dimensions, memorySize = memorySize, originalMemberLayoutCtorArg = originalMemberLayout, originalPointerLayoutCtorArg = originalPointerLayout, pointerLayoutCtorArg = pointerLayout, confArrayDescriptionCtorArg = confArrayDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ConfBogusStructureHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.dimensions != other.dimensions) return false
        if (this.memorySize != other.memorySize) return false
        if (this.originalMemberLayout != other.originalMemberLayout) return false
        if (this.originalPointerLayout != other.originalPointerLayout) return false
        if (this.pointerLayout != other.pointerLayout) return false
        if (this.confArrayDescription != other.confArrayDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dimensions.hashCode()
        result = 31 * result + this.memorySize.hashCode()
        result = 31 * result + this.originalMemberLayout.hashCode()
        result = 31 * result + this.originalPointerLayout.hashCode()
        result = 31 * result + this.pointerLayout.hashCode()
        result = 31 * result + this.confArrayDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfBogusStructureHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfBogusStructureHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Ndr64ConfBogusStructureHeaderFormat =
                    Ndr64ConfBogusStructureHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64StructureFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
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
                override fun writeNative(addr: Long, value: Ndr64ConfBogusStructureHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64StructureFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.dimensions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.memorySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.originalMemberLayout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.originalPointerLayout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pointerLayout)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.confArrayDescription)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64StructureFlags = Ndr64StructureFlags(),
            dimensions: UByte = 0u,
            memorySize: UInt = 0u,
            originalMemberLayout: MutPtr<CVoid> = MutPtr(0L),
            originalPointerLayout: MutPtr<CVoid> = MutPtr(0L),
            pointerLayout: MutPtr<CVoid> = MutPtr(0L),
            confArrayDescription: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64ConfBogusStructureHeaderFormat =
            Ndr64ConfBogusStructureHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                dimensions = dimensions,
                memorySize = memorySize,
                originalMemberLayoutCtorArg = originalMemberLayout,
                originalPointerLayoutCtorArg = originalPointerLayout,
                pointerLayoutCtorArg = pointerLayout,
                confArrayDescriptionCtorArg = confArrayDescription,
            )
    }
}

public class Ndr64ConfStructureHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64StructureFlags,
    public var reserve: UByte,
    public var memorySize: UInt,
    arrayDescriptionCtorArg: MutPtr<CVoid>,
) {
    public var arrayDescription: MutPtr<CVoid> = arrayDescriptionCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64StructureFlags(),
        reserve = 0u,
        memorySize = 0u,
        arrayDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64StructureFlags = this.flags

    public operator fun component4(): UByte = this.reserve

    public operator fun component5(): UInt = this.memorySize

    public operator fun component6(): MutPtr<CVoid> = this.arrayDescription

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64StructureFlags = this.flags, reserve: UByte = this.reserve, memorySize: UInt = this.memorySize, arrayDescription: MutPtr<CVoid> = this.arrayDescription): Ndr64ConfStructureHeaderFormat = Ndr64ConfStructureHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, reserve = reserve, memorySize = memorySize, arrayDescriptionCtorArg = arrayDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ConfStructureHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.reserve != other.reserve) return false
        if (this.memorySize != other.memorySize) return false
        if (this.arrayDescription != other.arrayDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserve.hashCode()
        result = 31 * result + this.memorySize.hashCode()
        result = 31 * result + this.arrayDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfStructureHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfStructureHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64ConfStructureHeaderFormat =
                    Ndr64ConfStructureHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64StructureFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ConfStructureHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64StructureFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.memorySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.arrayDescription)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64StructureFlags = Ndr64StructureFlags(),
            reserve: UByte = 0u,
            memorySize: UInt = 0u,
            arrayDescription: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64ConfStructureHeaderFormat =
            Ndr64ConfStructureHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                reserve = reserve,
                memorySize = memorySize,
                arrayDescriptionCtorArg = arrayDescription,
            )
    }
}

public class Ndr64ConfVarArrayHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64ArrayFlags,
    public var reserved: UByte,
    public var elementSize: UInt,
    confDescriptorCtorArg: MutPtr<CVoid>,
    varDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var confDescriptor: MutPtr<CVoid> = confDescriptorCtorArg
        internal set

    public var varDescriptor: MutPtr<CVoid> = varDescriptorCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64ArrayFlags(),
        reserved = 0u,
        elementSize = 0u,
        confDescriptorCtorArg = MutPtr(0L),
        varDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64ArrayFlags = this.flags

    public operator fun component4(): UByte = this.reserved

    public operator fun component5(): UInt = this.elementSize

    public operator fun component6(): MutPtr<CVoid> = this.confDescriptor

    public operator fun component7(): MutPtr<CVoid> = this.varDescriptor

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64ArrayFlags = this.flags, reserved: UByte = this.reserved, elementSize: UInt = this.elementSize, confDescriptor: MutPtr<CVoid> = this.confDescriptor, varDescriptor: MutPtr<CVoid> = this.varDescriptor): Ndr64ConfVarArrayHeaderFormat = Ndr64ConfVarArrayHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, reserved = reserved, elementSize = elementSize, confDescriptorCtorArg = confDescriptor, varDescriptorCtorArg = varDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ConfVarArrayHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.elementSize != other.elementSize) return false
        if (this.confDescriptor != other.confDescriptor) return false
        if (this.varDescriptor != other.varDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.elementSize.hashCode()
        result = 31 * result + this.confDescriptor.hashCode()
        result = 31 * result + this.varDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfVarArrayHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfVarArrayHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64ConfVarArrayHeaderFormat =
                    Ndr64ConfVarArrayHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64ArrayFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ConfVarArrayHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64ArrayFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.elementSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.confDescriptor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.varDescriptor)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
            reserved: UByte = 0u,
            elementSize: UInt = 0u,
            confDescriptor: MutPtr<CVoid> = MutPtr(0L),
            varDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64ConfVarArrayHeaderFormat =
            Ndr64ConfVarArrayHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                reserved = reserved,
                elementSize = elementSize,
                confDescriptorCtorArg = confDescriptor,
                varDescriptorCtorArg = varDescriptor,
            )
    }
}

public class Ndr64ConfVarBogusArrayHeaderFormat internal constructor(
    public var fixedArrayFormat: Ndr64BogusArrayHeaderFormat,
    confDescriptionCtorArg: MutPtr<CVoid>,
    varDescriptionCtorArg: MutPtr<CVoid>,
    offsetDescriptionCtorArg: MutPtr<CVoid>,
) {
    public var confDescription: MutPtr<CVoid> = confDescriptionCtorArg
        internal set

    public var varDescription: MutPtr<CVoid> = varDescriptionCtorArg
        internal set

    public var offsetDescription: MutPtr<CVoid> = offsetDescriptionCtorArg
        internal set

    public constructor() : this(
        fixedArrayFormat = Ndr64BogusArrayHeaderFormat(),
        confDescriptionCtorArg = MutPtr(0L),
        varDescriptionCtorArg = MutPtr(0L),
        offsetDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ndr64BogusArrayHeaderFormat = this.fixedArrayFormat

    public operator fun component2(): MutPtr<CVoid> = this.confDescription

    public operator fun component3(): MutPtr<CVoid> = this.varDescription

    public operator fun component4(): MutPtr<CVoid> = this.offsetDescription

    public fun copy(fixedArrayFormat: Ndr64BogusArrayHeaderFormat = this.fixedArrayFormat, confDescription: MutPtr<CVoid> = this.confDescription, varDescription: MutPtr<CVoid> = this.varDescription, offsetDescription: MutPtr<CVoid> = this.offsetDescription): Ndr64ConfVarBogusArrayHeaderFormat = Ndr64ConfVarBogusArrayHeaderFormat(fixedArrayFormat = fixedArrayFormat, confDescriptionCtorArg = confDescription, varDescriptionCtorArg = varDescription, offsetDescriptionCtorArg = offsetDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ConfVarBogusArrayHeaderFormat) return false
        if (this.fixedArrayFormat != other.fixedArrayFormat) return false
        if (this.confDescription != other.confDescription) return false
        if (this.varDescription != other.varDescription) return false
        if (this.offsetDescription != other.offsetDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fixedArrayFormat.hashCode()
        result = 31 * result + this.confDescription.hashCode()
        result = 31 * result + this.varDescription.hashCode()
        result = 31 * result + this.offsetDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfVarBogusArrayHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ConfVarBogusArrayHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Ndr64ConfVarBogusArrayHeaderFormat =
                    Ndr64ConfVarBogusArrayHeaderFormat(
                        (Ndr64BogusArrayHeaderFormat.typeLayout()).readNative(addr),
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
                override fun writeNative(addr: Long, value: Ndr64ConfVarBogusArrayHeaderFormat) {
                    (Ndr64BogusArrayHeaderFormat.typeLayout()).writeNative(addr, value.fixedArrayFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.confDescription)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.varDescription)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.offsetDescription)
                }
            }

        public operator fun invoke(
            fixedArrayFormat: Ndr64BogusArrayHeaderFormat = Ndr64BogusArrayHeaderFormat(),
            confDescription: MutPtr<CVoid> = MutPtr(0L),
            varDescription: MutPtr<CVoid> = MutPtr(0L),
            offsetDescription: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64ConfVarBogusArrayHeaderFormat =
            Ndr64ConfVarBogusArrayHeaderFormat(
                fixedArrayFormat = fixedArrayFormat,
                confDescriptionCtorArg = confDescription,
                varDescriptionCtorArg = varDescription,
                offsetDescriptionCtorArg = offsetDescription,
            )
    }
}

public data class Ndr64ConstantIidFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var reserved: UShort = 0u,
    public var guid: Guid = Guid(),
)

public data class Ndr64ContextHandleFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ContextHandleFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ContextHandleFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64ContextHandleFlags =
                    Ndr64ContextHandleFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64ContextHandleFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64ContextHandleFormat(
    public var formatCode: UByte = 0u,
    public var contextFlags: UByte = 0u,
    public var rundownRoutineIndex: UByte = 0u,
    public var ordinal: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ContextHandleFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ContextHandleFormat> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndr64ContextHandleFormat =
                    Ndr64ContextHandleFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ContextHandleFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.contextFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rundownRoutineIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ordinal)
                }
            }
    }
}

public class Ndr64EmbeddedComplexFormat internal constructor(
    public var formatCode: UByte,
    public var reserve1: UByte,
    public var reserve2: UShort,
    typeCtorArg: MutPtr<CVoid>,
) {
    public var type: MutPtr<CVoid> = typeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        reserve1 = 0u,
        reserve2 = 0u,
        typeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.reserve1

    public operator fun component3(): UShort = this.reserve2

    public operator fun component4(): MutPtr<CVoid> = this.type

    public fun copy(formatCode: UByte = this.formatCode, reserve1: UByte = this.reserve1, reserve2: UShort = this.reserve2, type: MutPtr<CVoid> = this.type): Ndr64EmbeddedComplexFormat = Ndr64EmbeddedComplexFormat(formatCode = formatCode, reserve1 = reserve1, reserve2 = reserve2, typeCtorArg = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64EmbeddedComplexFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.reserve1 != other.reserve1) return false
        if (this.reserve2 != other.reserve2) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.reserve1.hashCode()
        result = 31 * result + this.reserve2.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64EmbeddedComplexFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64EmbeddedComplexFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64EmbeddedComplexFormat =
                    Ndr64EmbeddedComplexFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64EmbeddedComplexFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserve1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserve2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.type)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            reserve1: UByte = 0u,
            reserve2: UShort = 0u,
            type: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64EmbeddedComplexFormat =
            Ndr64EmbeddedComplexFormat(
                formatCode = formatCode,
                reserve1 = reserve1,
                reserve2 = reserve2,
                typeCtorArg = type,
            )
    }
}

public data class Ndr64EncapsulatedUnion(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: UByte = 0u,
    public var switchType: UByte = 0u,
    public var memoryOffset: UInt = 0u,
    public var memorySize: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64EncapsulatedUnion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64EncapsulatedUnion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64EncapsulatedUnion =
                    Ndr64EncapsulatedUnion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndr64EncapsulatedUnion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.switchType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.memoryOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.memorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class Ndr64ExprConst32(
    public var exprType: UByte = 0u,
    public var reserved: UByte = 0u,
    public var reserved1: UShort = 0u,
    public var constValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprConst32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprConst32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64ExprConst32 =
                    Ndr64ExprConst32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ExprConst32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.exprType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.constValue)
                }
            }
    }
}

public data class Ndr64ExprConst64(
    public var exprType: UByte = 0u,
    public var reserved: UByte = 0u,
    public var reserved1: UShort = 0u,
    public var constValue: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprConst64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprConst64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64ExprConst64 =
                    Ndr64ExprConst64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ExprConst64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.exprType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.constValue)
                }
            }
    }
}

public data class Ndr64ExprNoop(
    public var exprType: UByte = 0u,
    public var size: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprNoop> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprNoop> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndr64ExprNoop =
                    Ndr64ExprNoop(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ExprNoop) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.exprType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class Ndr64ExprOperator(
    public var exprType: UByte = 0u,
    public var operator: UByte = 0u,
    public var castType: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprOperator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprOperator> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndr64ExprOperator =
                    Ndr64ExprOperator(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ExprOperator) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.exprType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.operator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.castType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                }
            }
    }
}

public data class Ndr64ExprVar(
    public var exprType: UByte = 0u,
    public var varType: UByte = 0u,
    public var reserved: UShort = 0u,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprVar> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ExprVar> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64ExprVar =
                    Ndr64ExprVar(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ExprVar) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.exprType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.varType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offset)
                }
            }
    }
}

public data class Ndr64FixedRepeatFormat(
    public var repeatFormat: Ndr64RepeatFormat = Ndr64RepeatFormat(),
    public var iterations: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64FixedRepeatFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64FixedRepeatFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64FixedRepeatFormat =
                    Ndr64FixedRepeatFormat(
                        (Ndr64RepeatFormat.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Ndr64FixedRepeatFormat) {
                    (Ndr64RepeatFormat.typeLayout()).writeNative(addr, value.repeatFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.iterations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class Ndr64FixArrayHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
    public var reserved: UByte = 0u,
    public var totalSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64FixArrayHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64FixArrayHeaderFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64FixArrayHeaderFormat =
                    Ndr64FixArrayHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64ArrayFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64FixArrayHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64ArrayFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSize)
                }
            }
    }
}

public data class Ndr64IidFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64IidFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64IidFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64IidFlags =
                    Ndr64IidFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64IidFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Ndr64IidFormat internal constructor(
    public var formatCode: UByte,
    public var flags: UByte,
    public var reserved: UShort,
    iIDDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var iIDDescriptor: MutPtr<CVoid> = iIDDescriptorCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        flags = 0u,
        reserved = 0u,
        iIDDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): MutPtr<CVoid> = this.iIDDescriptor

    public fun copy(formatCode: UByte = this.formatCode, flags: UByte = this.flags, reserved: UShort = this.reserved, iIDDescriptor: MutPtr<CVoid> = this.iIDDescriptor): Ndr64IidFormat = Ndr64IidFormat(formatCode = formatCode, flags = flags, reserved = reserved, iIDDescriptorCtorArg = iIDDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64IidFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.iIDDescriptor != other.iIDDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.iIDDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64IidFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64IidFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64IidFormat =
                    Ndr64IidFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64IidFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.iIDDescriptor)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            flags: UByte = 0u,
            reserved: UShort = 0u,
            iIDDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64IidFormat =
            Ndr64IidFormat(
                formatCode = formatCode,
                flags = flags,
                reserved = reserved,
                iIDDescriptorCtorArg = iIDDescriptor,
            )
    }
}

public data class Ndr64MempadFormat(
    public var formatCode: UByte = 0u,
    public var reserve1: UByte = 0u,
    public var memPad: UShort = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64MempadFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64MempadFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64MempadFormat =
                    Ndr64MempadFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64MempadFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserve1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.memPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                }
            }
    }
}

public data class Ndr64NonConformantStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
    public var totalSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64NonConformantStringFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64NonConformantStringFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64NonConformantStringFormat =
                    Ndr64NonConformantStringFormat(
                        (Ndr64StringHeaderFormat.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64NonConformantStringFormat) {
                    (Ndr64StringHeaderFormat.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSize)
                }
            }
    }
}

public class Ndr64NonEncapsulatedUnion internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: UByte,
    public var switchType: UByte,
    public var memorySize: UInt,
    switchCtorArg: MutPtr<CVoid>,
    public var reserved: UInt,
) {
    public var switch: MutPtr<CVoid> = switchCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = 0u,
        switchType = 0u,
        memorySize = 0u,
        switchCtorArg = MutPtr(0L),
        reserved = 0u,
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): UByte = this.flags

    public operator fun component4(): UByte = this.switchType

    public operator fun component5(): UInt = this.memorySize

    public operator fun component6(): MutPtr<CVoid> = this.switch

    public operator fun component7(): UInt = this.reserved

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: UByte = this.flags, switchType: UByte = this.switchType, memorySize: UInt = this.memorySize, switch: MutPtr<CVoid> = this.switch, reserved: UInt = this.reserved): Ndr64NonEncapsulatedUnion = Ndr64NonEncapsulatedUnion(formatCode = formatCode, alignment = alignment, flags = flags, switchType = switchType, memorySize = memorySize, switchCtorArg = switch, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64NonEncapsulatedUnion) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.switchType != other.switchType) return false
        if (this.memorySize != other.memorySize) return false
        if (this.switch != other.switch) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.switchType.hashCode()
        result = 31 * result + this.memorySize.hashCode()
        result = 31 * result + this.switch.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64NonEncapsulatedUnion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64NonEncapsulatedUnion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64NonEncapsulatedUnion =
                    Ndr64NonEncapsulatedUnion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64NonEncapsulatedUnion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.switchType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.memorySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.switch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: UByte = 0u,
            switchType: UByte = 0u,
            memorySize: UInt = 0u,
            switch: MutPtr<CVoid> = MutPtr(0L),
            reserved: UInt = 0u,
        ): Ndr64NonEncapsulatedUnion =
            Ndr64NonEncapsulatedUnion(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                switchType = switchType,
                memorySize = memorySize,
                switchCtorArg = switch,
                reserved = reserved,
            )
    }
}

public data class Ndr64NoRepeatFormat(
    public var formatCode: UByte = 0u,
    public var flags: UByte = 0u,
    public var reserved1: UShort = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64NoRepeatFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64NoRepeatFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64NoRepeatFormat =
                    Ndr64NoRepeatFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64NoRepeatFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                }
            }
    }
}

public data class Ndr64ParamFlags(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ParamFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ParamFlags> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Ndr64ParamFlags =
                    Ndr64ParamFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64ParamFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Ndr64ParamFormat internal constructor(
    typeCtorArg: MutPtr<CVoid>,
    public var attributes: Ndr64ParamFlags,
    public var reserved: UShort,
    public var stackOffset: UInt,
) {
    public var type: MutPtr<CVoid> = typeCtorArg
        internal set

    public constructor() : this(
        typeCtorArg = MutPtr(0L),
        attributes = Ndr64ParamFlags(),
        reserved = 0u,
        stackOffset = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.type

    public operator fun component2(): Ndr64ParamFlags = this.attributes

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): UInt = this.stackOffset

    public fun copy(type: MutPtr<CVoid> = this.type, attributes: Ndr64ParamFlags = this.attributes, reserved: UShort = this.reserved, stackOffset: UInt = this.stackOffset): Ndr64ParamFormat = Ndr64ParamFormat(typeCtorArg = type, attributes = attributes, reserved = reserved, stackOffset = stackOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64ParamFormat) return false
        if (this.type != other.type) return false
        if (this.attributes != other.attributes) return false
        if (this.reserved != other.reserved) return false
        if (this.stackOffset != other.stackOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ParamFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ParamFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64ParamFormat =
                    Ndr64ParamFormat(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (Ndr64ParamFlags.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ParamFormat) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.type)
                    (Ndr64ParamFlags.typeLayout()).writeNative(addr + 8L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.stackOffset)
                }
            }

        public operator fun invoke(
            type: MutPtr<CVoid> = MutPtr(0L),
            attributes: Ndr64ParamFlags = Ndr64ParamFlags(),
            reserved: UShort = 0u,
            stackOffset: UInt = 0u,
        ): Ndr64ParamFormat =
            Ndr64ParamFormat(
                typeCtorArg = type,
                attributes = attributes,
                reserved = reserved,
                stackOffset = stackOffset,
            )
    }
}

public data class Ndr64PipeFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PipeFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PipeFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64PipeFlags =
                    Ndr64PipeFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64PipeFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Ndr64PipeFormat internal constructor(
    public var formatCode: UByte,
    public var flags: UByte,
    public var alignment: UByte,
    public var reserved: UByte,
    typeCtorArg: MutPtr<CVoid>,
    public var memorySize: UInt,
    public var bufferSize: UInt,
) {
    public var type: MutPtr<CVoid> = typeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        flags = 0u,
        alignment = 0u,
        reserved = 0u,
        typeCtorArg = MutPtr(0L),
        memorySize = 0u,
        bufferSize = 0u,
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UByte = this.alignment

    public operator fun component4(): UByte = this.reserved

    public operator fun component5(): MutPtr<CVoid> = this.type

    public operator fun component6(): UInt = this.memorySize

    public operator fun component7(): UInt = this.bufferSize

    public fun copy(formatCode: UByte = this.formatCode, flags: UByte = this.flags, alignment: UByte = this.alignment, reserved: UByte = this.reserved, type: MutPtr<CVoid> = this.type, memorySize: UInt = this.memorySize, bufferSize: UInt = this.bufferSize): Ndr64PipeFormat = Ndr64PipeFormat(formatCode = formatCode, flags = flags, alignment = alignment, reserved = reserved, typeCtorArg = type, memorySize = memorySize, bufferSize = bufferSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64PipeFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.flags != other.flags) return false
        if (this.alignment != other.alignment) return false
        if (this.reserved != other.reserved) return false
        if (this.type != other.type) return false
        if (this.memorySize != other.memorySize) return false
        if (this.bufferSize != other.bufferSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.memorySize.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PipeFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PipeFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64PipeFormat =
                    Ndr64PipeFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Ndr64PipeFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.memorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bufferSize)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            flags: UByte = 0u,
            alignment: UByte = 0u,
            reserved: UByte = 0u,
            type: MutPtr<CVoid> = MutPtr(0L),
            memorySize: UInt = 0u,
            bufferSize: UInt = 0u,
        ): Ndr64PipeFormat =
            Ndr64PipeFormat(
                formatCode = formatCode,
                flags = flags,
                alignment = alignment,
                reserved = reserved,
                typeCtorArg = type,
                memorySize = memorySize,
                bufferSize = bufferSize,
            )
    }
}

public class Ndr64PointerFormat internal constructor(
    public var formatCode: UByte,
    public var flags: UByte,
    public var reserved: UShort,
    pointeeCtorArg: MutPtr<CVoid>,
) {
    public var pointee: MutPtr<CVoid> = pointeeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        flags = 0u,
        reserved = 0u,
        pointeeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): MutPtr<CVoid> = this.pointee

    public fun copy(formatCode: UByte = this.formatCode, flags: UByte = this.flags, reserved: UShort = this.reserved, pointee: MutPtr<CVoid> = this.pointee): Ndr64PointerFormat = Ndr64PointerFormat(formatCode = formatCode, flags = flags, reserved = reserved, pointeeCtorArg = pointee)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64PointerFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.pointee != other.pointee) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.pointee.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PointerFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PointerFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64PointerFormat =
                    Ndr64PointerFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64PointerFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pointee)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            flags: UByte = 0u,
            reserved: UShort = 0u,
            pointee: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64PointerFormat =
            Ndr64PointerFormat(
                formatCode = formatCode,
                flags = flags,
                reserved = reserved,
                pointeeCtorArg = pointee,
            )
    }
}

public data class Ndr64PointerInstanceHeaderFormat(
    public var offset: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PointerInstanceHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PointerInstanceHeaderFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64PointerInstanceHeaderFormat =
                    Ndr64PointerInstanceHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64PointerInstanceHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class Ndr64PointerRepeatFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PointerRepeatFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64PointerRepeatFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64PointerRepeatFlags =
                    Ndr64PointerRepeatFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64PointerRepeatFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64ProcFlags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ProcFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ProcFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndr64ProcFlags =
                    Ndr64ProcFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64ProcFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64ProcFormat(
    public var flags: UInt = 0u,
    public var stackSize: UInt = 0u,
    public var constantClientBufferSize: UInt = 0u,
    public var constantServerBufferSize: UInt = 0u,
    public var rpcFlags: UShort = 0u,
    public var floatDoubleMask: UShort = 0u,
    public var numberOfParams: UShort = 0u,
    public var extensionSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ProcFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64ProcFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64ProcFormat =
                    Ndr64ProcFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: Ndr64ProcFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.stackSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.constantClientBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.constantServerBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.rpcFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.floatDoubleMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.numberOfParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.extensionSize)
                }
            }
    }
}

public data class Ndr64RangedStringFormat(
    public var header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
    public var reserved: UInt = 0u,
    public var min: ULong = 0uL,
    public var max: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RangedStringFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RangedStringFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64RangedStringFormat =
                    Ndr64RangedStringFormat(
                        (Ndr64StringHeaderFormat.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64RangedStringFormat) {
                    (Ndr64StringHeaderFormat.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.min)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.max)
                }
            }
    }
}

public data class Ndr64RangeFormat(
    public var formatCode: UByte = 0u,
    public var rangeType: UByte = 0u,
    public var reserved: UShort = 0u,
    public var minValue: Long = 0L,
    public var maxValue: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RangeFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RangeFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64RangeFormat =
                    Ndr64RangeFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64RangeFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.rangeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maxValue)
                }
            }
    }
}

public class Ndr64RangePipeFormat internal constructor(
    public var formatCode: UByte,
    public var flags: UByte,
    public var alignment: UByte,
    public var reserved: UByte,
    typeCtorArg: MutPtr<CVoid>,
    public var memorySize: UInt,
    public var bufferSize: UInt,
    public var minValue: UInt,
    public var maxValue: UInt,
) {
    public var type: MutPtr<CVoid> = typeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        flags = 0u,
        alignment = 0u,
        reserved = 0u,
        typeCtorArg = MutPtr(0L),
        memorySize = 0u,
        bufferSize = 0u,
        minValue = 0u,
        maxValue = 0u,
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UByte = this.alignment

    public operator fun component4(): UByte = this.reserved

    public operator fun component5(): MutPtr<CVoid> = this.type

    public operator fun component6(): UInt = this.memorySize

    public operator fun component7(): UInt = this.bufferSize

    public operator fun component8(): UInt = this.minValue

    public operator fun component9(): UInt = this.maxValue

    public fun copy(formatCode: UByte = this.formatCode, flags: UByte = this.flags, alignment: UByte = this.alignment, reserved: UByte = this.reserved, type: MutPtr<CVoid> = this.type, memorySize: UInt = this.memorySize, bufferSize: UInt = this.bufferSize, minValue: UInt = this.minValue, maxValue: UInt = this.maxValue): Ndr64RangePipeFormat = Ndr64RangePipeFormat(formatCode = formatCode, flags = flags, alignment = alignment, reserved = reserved, typeCtorArg = type, memorySize = memorySize, bufferSize = bufferSize, minValue = minValue, maxValue = maxValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64RangePipeFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.flags != other.flags) return false
        if (this.alignment != other.alignment) return false
        if (this.reserved != other.reserved) return false
        if (this.type != other.type) return false
        if (this.memorySize != other.memorySize) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.minValue != other.minValue) return false
        if (this.maxValue != other.maxValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.memorySize.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.minValue.hashCode()
        result = 31 * result + this.maxValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RangePipeFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RangePipeFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ndr64RangePipeFormat =
                    Ndr64RangePipeFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Ndr64RangePipeFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.memorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.minValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.maxValue)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            flags: UByte = 0u,
            alignment: UByte = 0u,
            reserved: UByte = 0u,
            type: MutPtr<CVoid> = MutPtr(0L),
            memorySize: UInt = 0u,
            bufferSize: UInt = 0u,
            minValue: UInt = 0u,
            maxValue: UInt = 0u,
        ): Ndr64RangePipeFormat =
            Ndr64RangePipeFormat(
                formatCode = formatCode,
                flags = flags,
                alignment = alignment,
                reserved = reserved,
                typeCtorArg = type,
                memorySize = memorySize,
                bufferSize = bufferSize,
                minValue = minValue,
                maxValue = maxValue,
            )
    }
}

public data class Ndr64RepeatFormat(
    public var formatCode: UByte = 0u,
    public var flags: Ndr64PointerRepeatFlags = Ndr64PointerRepeatFlags(),
    public var reserved: UShort = 0u,
    public var increment: UInt = 0u,
    public var offsetToArray: UInt = 0u,
    public var numberOfPointers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RepeatFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RepeatFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64RepeatFormat =
                    Ndr64RepeatFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (Ndr64PointerRepeatFlags.typeLayout()).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ndr64RepeatFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (Ndr64PointerRepeatFlags.typeLayout()).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.increment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetToArray)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfPointers)
                }
            }
    }
}

public data class Ndr64RpcFlags(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RpcFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64RpcFlags> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Ndr64RpcFlags =
                    Ndr64RpcFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64RpcFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64SimpleMemberFormat(
    public var formatCode: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var reserved3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SimpleMemberFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SimpleMemberFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64SimpleMemberFormat =
                    Ndr64SimpleMemberFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64SimpleMemberFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved3)
                }
            }
    }
}

public data class Ndr64SimpleRegionFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var regionSize: UShort = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SimpleRegionFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SimpleRegionFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64SimpleRegionFormat =
                    Ndr64SimpleRegionFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64SimpleRegionFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.regionSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public class Ndr64SizedConformantStringFormat internal constructor(
    public var header: Ndr64StringHeaderFormat,
    sizeDescriptionCtorArg: MutPtr<CVoid>,
) {
    public var sizeDescription: MutPtr<CVoid> = sizeDescriptionCtorArg
        internal set

    public constructor() : this(
        header = Ndr64StringHeaderFormat(),
        sizeDescriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ndr64StringHeaderFormat = this.header

    public operator fun component2(): MutPtr<CVoid> = this.sizeDescription

    public fun copy(header: Ndr64StringHeaderFormat = this.header, sizeDescription: MutPtr<CVoid> = this.sizeDescription): Ndr64SizedConformantStringFormat = Ndr64SizedConformantStringFormat(header = header, sizeDescriptionCtorArg = sizeDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64SizedConformantStringFormat) return false
        if (this.header != other.header) return false
        if (this.sizeDescription != other.sizeDescription) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.sizeDescription.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SizedConformantStringFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SizedConformantStringFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ndr64SizedConformantStringFormat =
                    Ndr64SizedConformantStringFormat(
                        (Ndr64StringHeaderFormat.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ndr64SizedConformantStringFormat) {
                    (Ndr64StringHeaderFormat.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.sizeDescription)
                }
            }

        public operator fun invoke(
            header: Ndr64StringHeaderFormat = Ndr64StringHeaderFormat(),
            sizeDescription: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64SizedConformantStringFormat =
            Ndr64SizedConformantStringFormat(
                header = header,
                sizeDescriptionCtorArg = sizeDescription,
            )
    }
}

public data class Ndr64StringFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StringFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StringFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64StringFlags =
                    Ndr64StringFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64StringFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64StringHeaderFormat(
    public var formatCode: UByte = 0u,
    public var flags: Ndr64StringFlags = Ndr64StringFlags(),
    public var elementSize: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StringHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StringHeaderFormat> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Ndr64StringHeaderFormat =
                    Ndr64StringHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (Ndr64StringFlags.typeLayout()).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ndr64StringHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (Ndr64StringFlags.typeLayout()).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.elementSize)
                }
            }
    }
}

public data class Ndr64StructureFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StructureFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StructureFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64StructureFlags =
                    Ndr64StructureFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64StructureFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ndr64StructureHeaderFormat(
    public var formatCode: UByte = 0u,
    public var alignment: UByte = 0u,
    public var flags: Ndr64StructureFlags = Ndr64StructureFlags(),
    public var reserve: UByte = 0u,
    public var memorySize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StructureHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64StructureHeaderFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64StructureHeaderFormat =
                    Ndr64StructureHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64StructureFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64StructureHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64StructureFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.memorySize)
                }
            }
    }
}

public data class Ndr64SystemHandleFormat(
    public var formatCode: UByte = 0u,
    public var handleType: UByte = 0u,
    public var desiredAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SystemHandleFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64SystemHandleFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64SystemHandleFormat =
                    Ndr64SystemHandleFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64SystemHandleFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.handleType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.desiredAccess)
                }
            }
    }
}

public data class Ndr64TransmitAsFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64TransmitAsFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64TransmitAsFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64TransmitAsFlags =
                    Ndr64TransmitAsFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64TransmitAsFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Ndr64TransmitAsFormat internal constructor(
    public var formatCode: UByte,
    public var flags: UByte,
    public var routineIndex: UShort,
    public var transmittedTypeWireAlignment: UShort,
    public var memoryAlignment: UShort,
    public var presentedTypeMemorySize: UInt,
    public var transmittedTypeBufferSize: UInt,
    transmittedTypeCtorArg: MutPtr<CVoid>,
) {
    public var transmittedType: MutPtr<CVoid> = transmittedTypeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        flags = 0u,
        routineIndex = 0u,
        transmittedTypeWireAlignment = 0u,
        memoryAlignment = 0u,
        presentedTypeMemorySize = 0u,
        transmittedTypeBufferSize = 0u,
        transmittedTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UShort = this.routineIndex

    public operator fun component4(): UShort = this.transmittedTypeWireAlignment

    public operator fun component5(): UShort = this.memoryAlignment

    public operator fun component6(): UInt = this.presentedTypeMemorySize

    public operator fun component7(): UInt = this.transmittedTypeBufferSize

    public operator fun component8(): MutPtr<CVoid> = this.transmittedType

    public fun copy(formatCode: UByte = this.formatCode, flags: UByte = this.flags, routineIndex: UShort = this.routineIndex, transmittedTypeWireAlignment: UShort = this.transmittedTypeWireAlignment, memoryAlignment: UShort = this.memoryAlignment, presentedTypeMemorySize: UInt = this.presentedTypeMemorySize, transmittedTypeBufferSize: UInt = this.transmittedTypeBufferSize, transmittedType: MutPtr<CVoid> = this.transmittedType): Ndr64TransmitAsFormat = Ndr64TransmitAsFormat(formatCode = formatCode, flags = flags, routineIndex = routineIndex, transmittedTypeWireAlignment = transmittedTypeWireAlignment, memoryAlignment = memoryAlignment, presentedTypeMemorySize = presentedTypeMemorySize, transmittedTypeBufferSize = transmittedTypeBufferSize, transmittedTypeCtorArg = transmittedType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64TransmitAsFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.flags != other.flags) return false
        if (this.routineIndex != other.routineIndex) return false
        if (this.transmittedTypeWireAlignment != other.transmittedTypeWireAlignment) return false
        if (this.memoryAlignment != other.memoryAlignment) return false
        if (this.presentedTypeMemorySize != other.presentedTypeMemorySize) return false
        if (this.transmittedTypeBufferSize != other.transmittedTypeBufferSize) return false
        if (this.transmittedType != other.transmittedType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.routineIndex.hashCode()
        result = 31 * result + this.transmittedTypeWireAlignment.hashCode()
        result = 31 * result + this.memoryAlignment.hashCode()
        result = 31 * result + this.presentedTypeMemorySize.hashCode()
        result = 31 * result + this.transmittedTypeBufferSize.hashCode()
        result = 31 * result + this.transmittedType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64TransmitAsFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64TransmitAsFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64TransmitAsFormat =
                    Ndr64TransmitAsFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64TransmitAsFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.routineIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.transmittedTypeWireAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.memoryAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.presentedTypeMemorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.transmittedTypeBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.transmittedType)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            flags: UByte = 0u,
            routineIndex: UShort = 0u,
            transmittedTypeWireAlignment: UShort = 0u,
            memoryAlignment: UShort = 0u,
            presentedTypeMemorySize: UInt = 0u,
            transmittedTypeBufferSize: UInt = 0u,
            transmittedType: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64TransmitAsFormat =
            Ndr64TransmitAsFormat(
                formatCode = formatCode,
                flags = flags,
                routineIndex = routineIndex,
                transmittedTypeWireAlignment = transmittedTypeWireAlignment,
                memoryAlignment = memoryAlignment,
                presentedTypeMemorySize = presentedTypeMemorySize,
                transmittedTypeBufferSize = transmittedTypeBufferSize,
                transmittedTypeCtorArg = transmittedType,
            )
    }
}

public class Ndr64TypeStrictContextHandle internal constructor(
    public var formatCode: UByte,
    public var realFormatCode: UByte,
    public var reserved: UShort,
    typeCtorArg: MutPtr<CVoid>,
    public var ctxtFlags: UInt,
    public var ctxtID: UInt,
) {
    public var type: MutPtr<CVoid> = typeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        realFormatCode = 0u,
        reserved = 0u,
        typeCtorArg = MutPtr(0L),
        ctxtFlags = 0u,
        ctxtID = 0u,
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.realFormatCode

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): MutPtr<CVoid> = this.type

    public operator fun component5(): UInt = this.ctxtFlags

    public operator fun component6(): UInt = this.ctxtID

    public fun copy(formatCode: UByte = this.formatCode, realFormatCode: UByte = this.realFormatCode, reserved: UShort = this.reserved, type: MutPtr<CVoid> = this.type, ctxtFlags: UInt = this.ctxtFlags, ctxtID: UInt = this.ctxtID): Ndr64TypeStrictContextHandle = Ndr64TypeStrictContextHandle(formatCode = formatCode, realFormatCode = realFormatCode, reserved = reserved, typeCtorArg = type, ctxtFlags = ctxtFlags, ctxtID = ctxtID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64TypeStrictContextHandle) return false
        if (this.formatCode != other.formatCode) return false
        if (this.realFormatCode != other.realFormatCode) return false
        if (this.reserved != other.reserved) return false
        if (this.type != other.type) return false
        if (this.ctxtFlags != other.ctxtFlags) return false
        if (this.ctxtID != other.ctxtID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.realFormatCode.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.ctxtFlags.hashCode()
        result = 31 * result + this.ctxtID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64TypeStrictContextHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64TypeStrictContextHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64TypeStrictContextHandle =
                    Ndr64TypeStrictContextHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Ndr64TypeStrictContextHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.realFormatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ctxtFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ctxtID)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            realFormatCode: UByte = 0u,
            reserved: UShort = 0u,
            type: MutPtr<CVoid> = MutPtr(0L),
            ctxtFlags: UInt = 0u,
            ctxtID: UInt = 0u,
        ): Ndr64TypeStrictContextHandle =
            Ndr64TypeStrictContextHandle(
                formatCode = formatCode,
                realFormatCode = realFormatCode,
                reserved = reserved,
                typeCtorArg = type,
                ctxtFlags = ctxtFlags,
                ctxtID = ctxtID,
            )
    }
}

public class Ndr64UnionArm internal constructor(
    public var caseValue: Long,
    typeCtorArg: MutPtr<CVoid>,
    public var reserved: UInt,
) {
    public var type: MutPtr<CVoid> = typeCtorArg
        internal set

    public constructor() : this(
        caseValue = 0L,
        typeCtorArg = MutPtr(0L),
        reserved = 0u,
    )

    public operator fun component1(): Long = this.caseValue

    public operator fun component2(): MutPtr<CVoid> = this.type

    public operator fun component3(): UInt = this.reserved

    public fun copy(caseValue: Long = this.caseValue, type: MutPtr<CVoid> = this.type, reserved: UInt = this.reserved): Ndr64UnionArm = Ndr64UnionArm(caseValue = caseValue, typeCtorArg = type, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64UnionArm) return false
        if (this.caseValue != other.caseValue) return false
        if (this.type != other.type) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.caseValue.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UnionArm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UnionArm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64UnionArm =
                    Ndr64UnionArm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64UnionArm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.caseValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                }
            }

        public operator fun invoke(
            caseValue: Long = 0L,
            type: MutPtr<CVoid> = MutPtr(0L),
            reserved: UInt = 0u,
        ): Ndr64UnionArm =
            Ndr64UnionArm(
                caseValue = caseValue,
                typeCtorArg = type,
                reserved = reserved,
            )
    }
}

public data class Ndr64UnionArmSelector(
    public var reserved1: UByte = 0u,
    public var alignment: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var arms: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UnionArmSelector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UnionArmSelector> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ndr64UnionArmSelector =
                    Ndr64UnionArmSelector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ndr64UnionArmSelector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.arms)
                }
            }
    }
}

public data class Ndr64UserMarshalFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UserMarshalFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UserMarshalFlags> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): Ndr64UserMarshalFlags =
                    Ndr64UserMarshalFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ndr64UserMarshalFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Ndr64UserMarshalFormat internal constructor(
    public var formatCode: UByte,
    public var flags: UByte,
    public var routineIndex: UShort,
    public var transmittedTypeWireAlignment: UShort,
    public var memoryAlignment: UShort,
    public var userTypeMemorySize: UInt,
    public var transmittedTypeBufferSize: UInt,
    transmittedTypeCtorArg: MutPtr<CVoid>,
) {
    public var transmittedType: MutPtr<CVoid> = transmittedTypeCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        flags = 0u,
        routineIndex = 0u,
        transmittedTypeWireAlignment = 0u,
        memoryAlignment = 0u,
        userTypeMemorySize = 0u,
        transmittedTypeBufferSize = 0u,
        transmittedTypeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.flags

    public operator fun component3(): UShort = this.routineIndex

    public operator fun component4(): UShort = this.transmittedTypeWireAlignment

    public operator fun component5(): UShort = this.memoryAlignment

    public operator fun component6(): UInt = this.userTypeMemorySize

    public operator fun component7(): UInt = this.transmittedTypeBufferSize

    public operator fun component8(): MutPtr<CVoid> = this.transmittedType

    public fun copy(formatCode: UByte = this.formatCode, flags: UByte = this.flags, routineIndex: UShort = this.routineIndex, transmittedTypeWireAlignment: UShort = this.transmittedTypeWireAlignment, memoryAlignment: UShort = this.memoryAlignment, userTypeMemorySize: UInt = this.userTypeMemorySize, transmittedTypeBufferSize: UInt = this.transmittedTypeBufferSize, transmittedType: MutPtr<CVoid> = this.transmittedType): Ndr64UserMarshalFormat = Ndr64UserMarshalFormat(formatCode = formatCode, flags = flags, routineIndex = routineIndex, transmittedTypeWireAlignment = transmittedTypeWireAlignment, memoryAlignment = memoryAlignment, userTypeMemorySize = userTypeMemorySize, transmittedTypeBufferSize = transmittedTypeBufferSize, transmittedTypeCtorArg = transmittedType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64UserMarshalFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.flags != other.flags) return false
        if (this.routineIndex != other.routineIndex) return false
        if (this.transmittedTypeWireAlignment != other.transmittedTypeWireAlignment) return false
        if (this.memoryAlignment != other.memoryAlignment) return false
        if (this.userTypeMemorySize != other.userTypeMemorySize) return false
        if (this.transmittedTypeBufferSize != other.transmittedTypeBufferSize) return false
        if (this.transmittedType != other.transmittedType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.routineIndex.hashCode()
        result = 31 * result + this.transmittedTypeWireAlignment.hashCode()
        result = 31 * result + this.memoryAlignment.hashCode()
        result = 31 * result + this.userTypeMemorySize.hashCode()
        result = 31 * result + this.transmittedTypeBufferSize.hashCode()
        result = 31 * result + this.transmittedType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UserMarshalFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64UserMarshalFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64UserMarshalFormat =
                    Ndr64UserMarshalFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64UserMarshalFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.routineIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.transmittedTypeWireAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.memoryAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.userTypeMemorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.transmittedTypeBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.transmittedType)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            flags: UByte = 0u,
            routineIndex: UShort = 0u,
            transmittedTypeWireAlignment: UShort = 0u,
            memoryAlignment: UShort = 0u,
            userTypeMemorySize: UInt = 0u,
            transmittedTypeBufferSize: UInt = 0u,
            transmittedType: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64UserMarshalFormat =
            Ndr64UserMarshalFormat(
                formatCode = formatCode,
                flags = flags,
                routineIndex = routineIndex,
                transmittedTypeWireAlignment = transmittedTypeWireAlignment,
                memoryAlignment = memoryAlignment,
                userTypeMemorySize = userTypeMemorySize,
                transmittedTypeBufferSize = transmittedTypeBufferSize,
                transmittedTypeCtorArg = transmittedType,
            )
    }
}

public class Ndr64VarArrayHeaderFormat internal constructor(
    public var formatCode: UByte,
    public var alignment: UByte,
    public var flags: Ndr64ArrayFlags,
    public var reserved: UByte,
    public var totalSize: UInt,
    public var elementSize: UInt,
    varDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var varDescriptor: MutPtr<CVoid> = varDescriptorCtorArg
        internal set

    public constructor() : this(
        formatCode = 0u,
        alignment = 0u,
        flags = Ndr64ArrayFlags(),
        reserved = 0u,
        totalSize = 0u,
        elementSize = 0u,
        varDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.formatCode

    public operator fun component2(): UByte = this.alignment

    public operator fun component3(): Ndr64ArrayFlags = this.flags

    public operator fun component4(): UByte = this.reserved

    public operator fun component5(): UInt = this.totalSize

    public operator fun component6(): UInt = this.elementSize

    public operator fun component7(): MutPtr<CVoid> = this.varDescriptor

    public fun copy(formatCode: UByte = this.formatCode, alignment: UByte = this.alignment, flags: Ndr64ArrayFlags = this.flags, reserved: UByte = this.reserved, totalSize: UInt = this.totalSize, elementSize: UInt = this.elementSize, varDescriptor: MutPtr<CVoid> = this.varDescriptor): Ndr64VarArrayHeaderFormat = Ndr64VarArrayHeaderFormat(formatCode = formatCode, alignment = alignment, flags = flags, reserved = reserved, totalSize = totalSize, elementSize = elementSize, varDescriptorCtorArg = varDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ndr64VarArrayHeaderFormat) return false
        if (this.formatCode != other.formatCode) return false
        if (this.alignment != other.alignment) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        if (this.totalSize != other.totalSize) return false
        if (this.elementSize != other.elementSize) return false
        if (this.varDescriptor != other.varDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.alignment.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.totalSize.hashCode()
        result = 31 * result + this.elementSize.hashCode()
        result = 31 * result + this.varDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64VarArrayHeaderFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ndr64VarArrayHeaderFormat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ndr64VarArrayHeaderFormat =
                    Ndr64VarArrayHeaderFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (Ndr64ArrayFlags.typeLayout()).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ndr64VarArrayHeaderFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.alignment)
                    (Ndr64ArrayFlags.typeLayout()).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.elementSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.varDescriptor)
                }
            }

        public operator fun invoke(
            formatCode: UByte = 0u,
            alignment: UByte = 0u,
            flags: Ndr64ArrayFlags = Ndr64ArrayFlags(),
            reserved: UByte = 0u,
            totalSize: UInt = 0u,
            elementSize: UInt = 0u,
            varDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): Ndr64VarArrayHeaderFormat =
            Ndr64VarArrayHeaderFormat(
                formatCode = formatCode,
                alignment = alignment,
                flags = flags,
                reserved = reserved,
                totalSize = totalSize,
                elementSize = elementSize,
                varDescriptorCtorArg = varDescriptor,
            )
    }
}

public class NdrCsRoutines internal constructor(
    pSizeConvertRoutinesCtorArg: MutPtr<NdrCsSizeConvertRoutines>,
    pTagGettingRoutinesCtorArg: MutPtr<CsTagGettingRoutine>,
) {
    public var pSizeConvertRoutines: MutPtr<NdrCsSizeConvertRoutines> = pSizeConvertRoutinesCtorArg
        internal set

    public var pTagGettingRoutines: MutPtr<CsTagGettingRoutine> = pTagGettingRoutinesCtorArg
        internal set

    public constructor() : this(
        pSizeConvertRoutinesCtorArg = MutPtr(0L),
        pTagGettingRoutinesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<NdrCsSizeConvertRoutines> = this.pSizeConvertRoutines

    public operator fun component2(): MutPtr<CsTagGettingRoutine> = this.pTagGettingRoutines

    public fun copy(pSizeConvertRoutines: MutPtr<NdrCsSizeConvertRoutines> = this.pSizeConvertRoutines, pTagGettingRoutines: MutPtr<CsTagGettingRoutine> = this.pTagGettingRoutines): NdrCsRoutines = NdrCsRoutines(pSizeConvertRoutinesCtorArg = pSizeConvertRoutines, pTagGettingRoutinesCtorArg = pTagGettingRoutines)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdrCsRoutines) return false
        if (this.pSizeConvertRoutines != other.pSizeConvertRoutines) return false
        if (this.pTagGettingRoutines != other.pTagGettingRoutines) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSizeConvertRoutines.hashCode()
        result = 31 * result + this.pTagGettingRoutines.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrCsRoutines> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrCsRoutines> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdrCsRoutines =
                    NdrCsRoutines(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<NdrCsSizeConvertRoutines>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CsTagGettingRoutine>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdrCsRoutines) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<NdrCsSizeConvertRoutines>(64)
                    ).writeNative(addr, value.pSizeConvertRoutines)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CsTagGettingRoutine>(64)
                    ).writeNative(addr + 8L, value.pTagGettingRoutines)
                }
            }

        public operator fun invoke(
            pSizeConvertRoutines: MutPtr<NdrCsSizeConvertRoutines> = MutPtr(0L),
            pTagGettingRoutines: MutPtr<CsTagGettingRoutine> = MutPtr(0L),
        ): NdrCsRoutines =
            NdrCsRoutines(
                pSizeConvertRoutinesCtorArg = pSizeConvertRoutines,
                pTagGettingRoutinesCtorArg = pTagGettingRoutines,
            )
    }
}

public data class NdrCsSizeConvertRoutines(
    public var pfnNetSize: CsTypeNetSizeRoutine = null,
    public var pfnToNetCs: CsTypeToNetcsRoutine = null,
    public var pfnLocalSize: CsTypeLocalSizeRoutine = null,
    public var pfnFromNetCs: CsTypeFromNetcsRoutine = null,
)

public class NdrExprDesc internal constructor(
    pOffsetCtorArg: ConstPtr<UShort>,
    pFormatExprCtorArg: MutPtr<UByte>,
) {
    public var pOffset: ConstPtr<UShort> = pOffsetCtorArg
        internal set

    public var pFormatExpr: MutPtr<UByte> = pFormatExprCtorArg
        internal set

    public constructor() : this(
        pOffsetCtorArg = ConstPtr(0L),
        pFormatExprCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<UShort> = this.pOffset

    public operator fun component2(): MutPtr<UByte> = this.pFormatExpr

    public fun copy(pOffset: ConstPtr<UShort> = this.pOffset, pFormatExpr: MutPtr<UByte> = this.pFormatExpr): NdrExprDesc = NdrExprDesc(pOffsetCtorArg = pOffset, pFormatExprCtorArg = pFormatExpr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdrExprDesc) return false
        if (this.pOffset != other.pOffset) return false
        if (this.pFormatExpr != other.pFormatExpr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pOffset.hashCode()
        result = 31 * result + this.pFormatExpr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrExprDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrExprDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NdrExprDesc =
                    NdrExprDesc(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NdrExprDesc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UShort>(64)
                    ).writeNative(addr, value.pOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pFormatExpr)
                }
            }

        public operator fun invoke(
            pOffset: ConstPtr<UShort> = ConstPtr(0L),
            pFormatExpr: MutPtr<UByte> = MutPtr(0L),
        ): NdrExprDesc =
            NdrExprDesc(
                pOffsetCtorArg = pOffset,
                pFormatExprCtorArg = pFormatExpr,
            )
    }
}

public class NdrScontext internal constructor(
    padCtorArg: List<MutPtr<CVoid>>,
    userContextCtorArg: MutPtr<CVoid>,
) {
    public var pad: List<MutPtr<CVoid>> = padCtorArg
        internal set

    public var userContext: MutPtr<CVoid> = userContextCtorArg
        internal set

    public constructor() : this(
        padCtorArg = List(2) { MutPtr(0L) },
        userContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.pad

    public operator fun component2(): MutPtr<CVoid> = this.userContext

    public fun copy(pad: List<MutPtr<CVoid>> = this.pad, userContext: MutPtr<CVoid> = this.userContext): NdrScontext = NdrScontext(padCtorArg = pad, userContextCtorArg = userContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdrScontext) return false
        if (this.pad != other.pad) return false
        if (this.userContext != other.userContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pad.hashCode()
        result = 31 * result + this.userContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrScontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrScontext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NdrScontext =
                    NdrScontext(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (2).toInt(),
                                )
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NdrScontext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (2).toInt(),
                            )
                    ).writeNative(addr, value.pad)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.userContext)
                }
            }

        public operator fun invoke(
            pad: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
            userContext: MutPtr<CVoid> = MutPtr(0L),
        ): NdrScontext =
            NdrScontext(
                padCtorArg = pad,
                userContextCtorArg = userContext,
            )
    }
}

public data class NdrUserMarshalInfo(
    public var informationLevel: UInt = 0u,
    public var anonymous: NdrUserMarshalInfo0 = NdrUserMarshalInfo0(),
)

public data class NdrUserMarshalInfo0(
    public var level1: NdrUserMarshalInfoLevel1 = NdrUserMarshalInfoLevel1(),
)

public class NdrUserMarshalInfoLevel1 internal constructor(
    bufferCtorArg: MutPtr<CVoid>,
    public var bufferSize: UInt,
    public var pfnAllocate: Int,
    public var pfnFree: Int,
    pRpcChannelBufferCtorArg: MutPtr<CVoid>,
    public var reserved: IntArray,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public var pRpcChannelBuffer: MutPtr<CVoid> = pRpcChannelBufferCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        bufferSize = 0u,
        pfnAllocate = 0,
        pfnFree = 0,
        pRpcChannelBufferCtorArg = MutPtr(0L),
        reserved = IntArray(5),
    )

    public operator fun component1(): MutPtr<CVoid> = this.buffer

    public operator fun component2(): UInt = this.bufferSize

    public operator fun component3(): Int = this.pfnAllocate

    public operator fun component4(): Int = this.pfnFree

    public operator fun component5(): MutPtr<CVoid> = this.pRpcChannelBuffer

    public operator fun component6(): IntArray = this.reserved

    public fun copy(buffer: MutPtr<CVoid> = this.buffer, bufferSize: UInt = this.bufferSize, pfnAllocate: Int = this.pfnAllocate, pfnFree: Int = this.pfnFree, pRpcChannelBuffer: MutPtr<CVoid> = this.pRpcChannelBuffer, reserved: IntArray = this.reserved): NdrUserMarshalInfoLevel1 = NdrUserMarshalInfoLevel1(bufferCtorArg = buffer, bufferSize = bufferSize, pfnAllocate = pfnAllocate, pfnFree = pfnFree, pRpcChannelBufferCtorArg = pRpcChannelBuffer, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdrUserMarshalInfoLevel1) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.pfnAllocate != other.pfnAllocate) return false
        if (this.pfnFree != other.pfnFree) return false
        if (this.pRpcChannelBuffer != other.pRpcChannelBuffer) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.pfnAllocate.hashCode()
        result = 31 * result + this.pfnFree.hashCode()
        result = 31 * result + this.pRpcChannelBuffer.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrUserMarshalInfoLevel1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdrUserMarshalInfoLevel1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): NdrUserMarshalInfoLevel1 =
                    NdrUserMarshalInfoLevel1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (5).toInt())
                        ).readNative(addr + 40L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: NdrUserMarshalInfoLevel1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.pfnAllocate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.pfnFree)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.pRpcChannelBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (5).toInt())
                    ).writeNative(addr + 40L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            buffer: MutPtr<CVoid> = MutPtr(0L),
            bufferSize: UInt = 0u,
            pfnAllocate: Int = 0,
            pfnFree: Int = 0,
            pRpcChannelBuffer: MutPtr<CVoid> = MutPtr(0L),
            reserved: IntArray = IntArray(5),
        ): NdrUserMarshalInfoLevel1 =
            NdrUserMarshalInfoLevel1(
                bufferCtorArg = buffer,
                bufferSize = bufferSize,
                pfnAllocate = pfnAllocate,
                pfnFree = pfnFree,
                pRpcChannelBufferCtorArg = pRpcChannelBuffer,
                reserved = reserved,
            )
    }
}

public class RdrCalloutState internal constructor(
    public var lastError: RpcStatus,
    lastEEInfoCtorArg: MutPtr<CVoid>,
    public var lastCalledStage: RpcHttpRedirectorStage,
    serverNameCtorArg: MutPtr<UShort>,
    serverPortCtorArg: MutPtr<UShort>,
    remoteUserCtorArg: MutPtr<UShort>,
    authTypeCtorArg: MutPtr<UShort>,
    public var resourceTypePresent: UByte,
    public var sessionIdPresent: UByte,
    public var interfacePresent: UByte,
    public var resourceType: Guid,
    public var sessionId: Guid,
    public var iface: RpcSyntaxIdentifier,
    certContextCtorArg: MutPtr<CVoid>,
) {
    public var lastEEInfo: MutPtr<CVoid> = lastEEInfoCtorArg
        internal set

    public var serverName: MutPtr<UShort> = serverNameCtorArg
        internal set

    public var serverPort: MutPtr<UShort> = serverPortCtorArg
        internal set

    public var remoteUser: MutPtr<UShort> = remoteUserCtorArg
        internal set

    public var authType: MutPtr<UShort> = authTypeCtorArg
        internal set

    public var certContext: MutPtr<CVoid> = certContextCtorArg
        internal set

    public constructor() : this(
        lastError = 0,
        lastEEInfoCtorArg = MutPtr(0L),
        lastCalledStage = 0,
        serverNameCtorArg = MutPtr(0L),
        serverPortCtorArg = MutPtr(0L),
        remoteUserCtorArg = MutPtr(0L),
        authTypeCtorArg = MutPtr(0L),
        resourceTypePresent = 0u,
        sessionIdPresent = 0u,
        interfacePresent = 0u,
        resourceType = Guid(),
        sessionId = Guid(),
        iface = RpcSyntaxIdentifier(),
        certContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): RpcStatus = this.lastError

    public operator fun component2(): MutPtr<CVoid> = this.lastEEInfo

    public operator fun component3(): RpcHttpRedirectorStage = this.lastCalledStage

    public operator fun component4(): MutPtr<UShort> = this.serverName

    public operator fun component5(): MutPtr<UShort> = this.serverPort

    public operator fun component6(): MutPtr<UShort> = this.remoteUser

    public operator fun component7(): MutPtr<UShort> = this.authType

    public operator fun component8(): UByte = this.resourceTypePresent

    public operator fun component9(): UByte = this.sessionIdPresent

    public operator fun component10(): UByte = this.interfacePresent

    public operator fun component11(): Guid = this.resourceType

    public operator fun component12(): Guid = this.sessionId

    public operator fun component13(): RpcSyntaxIdentifier = this.iface

    public operator fun component14(): MutPtr<CVoid> = this.certContext

    public fun copy(lastError: RpcStatus = this.lastError, lastEEInfo: MutPtr<CVoid> = this.lastEEInfo, lastCalledStage: RpcHttpRedirectorStage = this.lastCalledStage, serverName: MutPtr<UShort> = this.serverName, serverPort: MutPtr<UShort> = this.serverPort, remoteUser: MutPtr<UShort> = this.remoteUser, authType: MutPtr<UShort> = this.authType, resourceTypePresent: UByte = this.resourceTypePresent, sessionIdPresent: UByte = this.sessionIdPresent, interfacePresent: UByte = this.interfacePresent, resourceType: Guid = this.resourceType, sessionId: Guid = this.sessionId, iface: RpcSyntaxIdentifier = this.iface, certContext: MutPtr<CVoid> = this.certContext): RdrCalloutState = RdrCalloutState(lastError = lastError, lastEEInfoCtorArg = lastEEInfo, lastCalledStage = lastCalledStage, serverNameCtorArg = serverName, serverPortCtorArg = serverPort, remoteUserCtorArg = remoteUser, authTypeCtorArg = authType, resourceTypePresent = resourceTypePresent, sessionIdPresent = sessionIdPresent, interfacePresent = interfacePresent, resourceType = resourceType, sessionId = sessionId, iface = iface, certContextCtorArg = certContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RdrCalloutState) return false
        if (this.lastError != other.lastError) return false
        if (this.lastEEInfo != other.lastEEInfo) return false
        if (this.lastCalledStage != other.lastCalledStage) return false
        if (this.serverName != other.serverName) return false
        if (this.serverPort != other.serverPort) return false
        if (this.remoteUser != other.remoteUser) return false
        if (this.authType != other.authType) return false
        if (this.resourceTypePresent != other.resourceTypePresent) return false
        if (this.sessionIdPresent != other.sessionIdPresent) return false
        if (this.interfacePresent != other.interfacePresent) return false
        if (this.resourceType != other.resourceType) return false
        if (this.sessionId != other.sessionId) return false
        if (this.iface != other.iface) return false
        if (this.certContext != other.certContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastError.hashCode()
        result = 31 * result + this.lastEEInfo.hashCode()
        result = 31 * result + this.lastCalledStage.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.serverPort.hashCode()
        result = 31 * result + this.remoteUser.hashCode()
        result = 31 * result + this.authType.hashCode()
        result = 31 * result + this.resourceTypePresent.hashCode()
        result = 31 * result + this.sessionIdPresent.hashCode()
        result = 31 * result + this.interfacePresent.hashCode()
        result = 31 * result + this.resourceType.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.iface.hashCode()
        result = 31 * result + this.certContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lastError: RpcStatus = 0,
            lastEEInfo: MutPtr<CVoid> = MutPtr(0L),
            lastCalledStage: RpcHttpRedirectorStage = 0,
            serverName: MutPtr<UShort> = MutPtr(0L),
            serverPort: MutPtr<UShort> = MutPtr(0L),
            remoteUser: MutPtr<UShort> = MutPtr(0L),
            authType: MutPtr<UShort> = MutPtr(0L),
            resourceTypePresent: UByte = 0u,
            sessionIdPresent: UByte = 0u,
            interfacePresent: UByte = 0u,
            resourceType: Guid = Guid(),
            sessionId: Guid = Guid(),
            iface: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
            certContext: MutPtr<CVoid> = MutPtr(0L),
        ): RdrCalloutState =
            RdrCalloutState(
                lastError = lastError,
                lastEEInfoCtorArg = lastEEInfo,
                lastCalledStage = lastCalledStage,
                serverNameCtorArg = serverName,
                serverPortCtorArg = serverPort,
                remoteUserCtorArg = remoteUser,
                authTypeCtorArg = authType,
                resourceTypePresent = resourceTypePresent,
                sessionIdPresent = sessionIdPresent,
                interfacePresent = interfacePresent,
                resourceType = resourceType,
                sessionId = sessionId,
                iface = iface,
                certContextCtorArg = certContext,
            )
    }
}

public class RpcAsyncNotificationInfo internal constructor(
    public var apc: RpcAsyncNotificationInfo0,
    public var ioc: RpcAsyncNotificationInfo1,
    public var intPtr: RpcAsyncNotificationInfo2,
    hEventCtorArg: Handle,
    public var notificationRoutine: PfnRpcnotificationRoutine,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public constructor() : this(
        apc = RpcAsyncNotificationInfo0(),
        ioc = RpcAsyncNotificationInfo1(),
        intPtr = RpcAsyncNotificationInfo2(),
        hEventCtorArg = MutPtr(0L),
        notificationRoutine = null,
    )

    public operator fun component1(): RpcAsyncNotificationInfo0 = this.apc

    public operator fun component2(): RpcAsyncNotificationInfo1 = this.ioc

    public operator fun component3(): RpcAsyncNotificationInfo2 = this.intPtr

    public operator fun component4(): Handle = this.hEvent

    public operator fun component5(): PfnRpcnotificationRoutine = this.notificationRoutine

    public fun copy(apc: RpcAsyncNotificationInfo0 = this.apc, ioc: RpcAsyncNotificationInfo1 = this.ioc, intPtr: RpcAsyncNotificationInfo2 = this.intPtr, hEvent: Handle = this.hEvent, notificationRoutine: PfnRpcnotificationRoutine = this.notificationRoutine): RpcAsyncNotificationInfo = RpcAsyncNotificationInfo(apc = apc, ioc = ioc, intPtr = intPtr, hEventCtorArg = hEvent, notificationRoutine = notificationRoutine)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcAsyncNotificationInfo) return false
        if (this.apc != other.apc) return false
        if (this.ioc != other.ioc) return false
        if (this.intPtr != other.intPtr) return false
        if (this.hEvent != other.hEvent) return false
        if (this.notificationRoutine != other.notificationRoutine) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.apc.hashCode()
        result = 31 * result + this.ioc.hashCode()
        result = 31 * result + this.intPtr.hashCode()
        result = 31 * result + this.hEvent.hashCode()
        result = 31 * result + this.notificationRoutine.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            apc: RpcAsyncNotificationInfo0 = RpcAsyncNotificationInfo0(),
            ioc: RpcAsyncNotificationInfo1 = RpcAsyncNotificationInfo1(),
            intPtr: RpcAsyncNotificationInfo2 = RpcAsyncNotificationInfo2(),
            hEvent: Handle = MutPtr(0L),
            notificationRoutine: PfnRpcnotificationRoutine = null,
        ): RpcAsyncNotificationInfo =
            RpcAsyncNotificationInfo(
                apc = apc,
                ioc = ioc,
                intPtr = intPtr,
                hEventCtorArg = hEvent,
                notificationRoutine = notificationRoutine,
            )
    }
}

public class RpcAsyncNotificationInfo0 internal constructor(
    public var notificationRoutine: PfnRpcnotificationRoutine,
    hThreadCtorArg: Handle,
) {
    public var hThread: Handle = hThreadCtorArg
        internal set

    public constructor() : this(
        notificationRoutine = null,
        hThreadCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PfnRpcnotificationRoutine = this.notificationRoutine

    public operator fun component2(): Handle = this.hThread

    public fun copy(notificationRoutine: PfnRpcnotificationRoutine = this.notificationRoutine, hThread: Handle = this.hThread): RpcAsyncNotificationInfo0 = RpcAsyncNotificationInfo0(notificationRoutine = notificationRoutine, hThreadCtorArg = hThread)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcAsyncNotificationInfo0) return false
        if (this.notificationRoutine != other.notificationRoutine) return false
        if (this.hThread != other.hThread) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.notificationRoutine.hashCode()
        result = 31 * result + this.hThread.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            notificationRoutine: PfnRpcnotificationRoutine = null,
            hThread: Handle = MutPtr(0L),
        ): RpcAsyncNotificationInfo0 =
            RpcAsyncNotificationInfo0(
                notificationRoutine = notificationRoutine,
                hThreadCtorArg = hThread,
            )
    }
}

public class RpcAsyncNotificationInfo1 internal constructor(
    hIOPortCtorArg: Handle,
    public var dwNumberOfBytesTransferred: UInt,
    public var dwCompletionKey: Int,
    lpOverlappedCtorArg: MutPtr<Overlapped>,
) {
    public var hIOPort: Handle = hIOPortCtorArg
        internal set

    public var lpOverlapped: MutPtr<Overlapped> = lpOverlappedCtorArg
        internal set

    public constructor() : this(
        hIOPortCtorArg = MutPtr(0L),
        dwNumberOfBytesTransferred = 0u,
        dwCompletionKey = 0,
        lpOverlappedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hIOPort

    public operator fun component2(): UInt = this.dwNumberOfBytesTransferred

    public operator fun component3(): Int = this.dwCompletionKey

    public operator fun component4(): MutPtr<Overlapped> = this.lpOverlapped

    public fun copy(hIOPort: Handle = this.hIOPort, dwNumberOfBytesTransferred: UInt = this.dwNumberOfBytesTransferred, dwCompletionKey: Int = this.dwCompletionKey, lpOverlapped: MutPtr<Overlapped> = this.lpOverlapped): RpcAsyncNotificationInfo1 = RpcAsyncNotificationInfo1(hIOPortCtorArg = hIOPort, dwNumberOfBytesTransferred = dwNumberOfBytesTransferred, dwCompletionKey = dwCompletionKey, lpOverlappedCtorArg = lpOverlapped)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcAsyncNotificationInfo1) return false
        if (this.hIOPort != other.hIOPort) return false
        if (this.dwNumberOfBytesTransferred != other.dwNumberOfBytesTransferred) return false
        if (this.dwCompletionKey != other.dwCompletionKey) return false
        if (this.lpOverlapped != other.lpOverlapped) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIOPort.hashCode()
        result = 31 * result + this.dwNumberOfBytesTransferred.hashCode()
        result = 31 * result + this.dwCompletionKey.hashCode()
        result = 31 * result + this.lpOverlapped.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIOPort: Handle = MutPtr(0L),
            dwNumberOfBytesTransferred: UInt = 0u,
            dwCompletionKey: Int = 0,
            lpOverlapped: MutPtr<Overlapped> = MutPtr(0L),
        ): RpcAsyncNotificationInfo1 =
            RpcAsyncNotificationInfo1(
                hIOPortCtorArg = hIOPort,
                dwNumberOfBytesTransferred = dwNumberOfBytesTransferred,
                dwCompletionKey = dwCompletionKey,
                lpOverlappedCtorArg = lpOverlapped,
            )
    }
}

public class RpcAsyncNotificationInfo2 internal constructor(
    hWndCtorArg: Hwnd,
    public var msg: UInt,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        hWndCtorArg = MutPtr(0L),
        msg = 0u,
    )

    public operator fun component1(): Hwnd = this.hWnd

    public operator fun component2(): UInt = this.msg

    public fun copy(hWnd: Hwnd = this.hWnd, msg: UInt = this.msg): RpcAsyncNotificationInfo2 = RpcAsyncNotificationInfo2(hWndCtorArg = hWnd, msg = msg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcAsyncNotificationInfo2) return false
        if (this.hWnd != other.hWnd) return false
        if (this.msg != other.msg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hWnd.hashCode()
        result = 31 * result + this.msg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hWnd: Hwnd = MutPtr(0L),
            msg: UInt = 0u,
        ): RpcAsyncNotificationInfo2 =
            RpcAsyncNotificationInfo2(
                hWndCtorArg = hWnd,
                msg = msg,
            )
    }
}

public class RpcAsyncState internal constructor(
    public var size: UInt,
    public var signature: UInt,
    public var lock: Int,
    public var flags: UInt,
    stubInfoCtorArg: MutPtr<CVoid>,
    userInfoCtorArg: MutPtr<CVoid>,
    runtimeInfoCtorArg: MutPtr<CVoid>,
    public var event: RpcAsyncEvent,
    public var notificationType: RpcNotificationTypes,
    public var u: RpcAsyncNotificationInfo,
    public var reserved: IntArray,
) {
    public var stubInfo: MutPtr<CVoid> = stubInfoCtorArg
        internal set

    public var userInfo: MutPtr<CVoid> = userInfoCtorArg
        internal set

    public var runtimeInfo: MutPtr<CVoid> = runtimeInfoCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        signature = 0u,
        lock = 0,
        flags = 0u,
        stubInfoCtorArg = MutPtr(0L),
        userInfoCtorArg = MutPtr(0L),
        runtimeInfoCtorArg = MutPtr(0L),
        event = 0,
        notificationType = 0,
        u = RpcAsyncNotificationInfo(),
        reserved = IntArray(4),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.signature

    public operator fun component3(): Int = this.lock

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): MutPtr<CVoid> = this.stubInfo

    public operator fun component6(): MutPtr<CVoid> = this.userInfo

    public operator fun component7(): MutPtr<CVoid> = this.runtimeInfo

    public operator fun component8(): RpcAsyncEvent = this.event

    public operator fun component9(): RpcNotificationTypes = this.notificationType

    public operator fun component10(): RpcAsyncNotificationInfo = this.u

    public operator fun component11(): IntArray = this.reserved

    public fun copy(size: UInt = this.size, signature: UInt = this.signature, lock: Int = this.lock, flags: UInt = this.flags, stubInfo: MutPtr<CVoid> = this.stubInfo, userInfo: MutPtr<CVoid> = this.userInfo, runtimeInfo: MutPtr<CVoid> = this.runtimeInfo, event: RpcAsyncEvent = this.event, notificationType: RpcNotificationTypes = this.notificationType, u: RpcAsyncNotificationInfo = this.u, reserved: IntArray = this.reserved): RpcAsyncState = RpcAsyncState(size = size, signature = signature, lock = lock, flags = flags, stubInfoCtorArg = stubInfo, userInfoCtorArg = userInfo, runtimeInfoCtorArg = runtimeInfo, event = event, notificationType = notificationType, u = u, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcAsyncState) return false
        if (this.size != other.size) return false
        if (this.signature != other.signature) return false
        if (this.lock != other.lock) return false
        if (this.flags != other.flags) return false
        if (this.stubInfo != other.stubInfo) return false
        if (this.userInfo != other.userInfo) return false
        if (this.runtimeInfo != other.runtimeInfo) return false
        if (this.event != other.event) return false
        if (this.notificationType != other.notificationType) return false
        if (this.u != other.u) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.lock.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.stubInfo.hashCode()
        result = 31 * result + this.userInfo.hashCode()
        result = 31 * result + this.runtimeInfo.hashCode()
        result = 31 * result + this.event.hashCode()
        result = 31 * result + this.notificationType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            signature: UInt = 0u,
            lock: Int = 0,
            flags: UInt = 0u,
            stubInfo: MutPtr<CVoid> = MutPtr(0L),
            userInfo: MutPtr<CVoid> = MutPtr(0L),
            runtimeInfo: MutPtr<CVoid> = MutPtr(0L),
            event: RpcAsyncEvent = 0,
            notificationType: RpcNotificationTypes = 0,
            u: RpcAsyncNotificationInfo = RpcAsyncNotificationInfo(),
            reserved: IntArray = IntArray(4),
        ): RpcAsyncState =
            RpcAsyncState(
                size = size,
                signature = signature,
                lock = lock,
                flags = flags,
                stubInfoCtorArg = stubInfo,
                userInfoCtorArg = userInfo,
                runtimeInfoCtorArg = runtimeInfo,
                event = event,
                notificationType = notificationType,
                u = u,
                reserved = reserved,
            )
    }
}

public data class RpcBindingHandleOptionsV1(
    public var version: UInt = 0u,
    public var flags: RpcBindingHandleOptionsFlags = 0u,
    public var comTimeout: UInt = 0u,
    public var callTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingHandleOptionsV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingHandleOptionsV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcBindingHandleOptionsV1 =
                    RpcBindingHandleOptionsV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RpcBindingHandleOptionsV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.comTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.callTimeout)
                }
            }
    }
}

public class RpcBindingHandleSecurityV1A internal constructor(
    public var version: UInt,
    serverPrincNameCtorArg: MutPtr<UByte>,
    public var authnLevel: UInt,
    public var authnSvc: UInt,
    authIdentityCtorArg: MutPtr<SecWinntAuthIdentityA>,
    securityQosCtorArg: MutPtr<RpcSecurityQos>,
) {
    public var serverPrincName: MutPtr<UByte> = serverPrincNameCtorArg
        internal set

    public var authIdentity: MutPtr<SecWinntAuthIdentityA> = authIdentityCtorArg
        internal set

    public var securityQos: MutPtr<RpcSecurityQos> = securityQosCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        serverPrincNameCtorArg = MutPtr(0L),
        authnLevel = 0u,
        authnSvc = 0u,
        authIdentityCtorArg = MutPtr(0L),
        securityQosCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<UByte> = this.serverPrincName

    public operator fun component3(): UInt = this.authnLevel

    public operator fun component4(): UInt = this.authnSvc

    public operator fun component5(): MutPtr<SecWinntAuthIdentityA> = this.authIdentity

    public operator fun component6(): MutPtr<RpcSecurityQos> = this.securityQos

    public fun copy(version: UInt = this.version, serverPrincName: MutPtr<UByte> = this.serverPrincName, authnLevel: UInt = this.authnLevel, authnSvc: UInt = this.authnSvc, authIdentity: MutPtr<SecWinntAuthIdentityA> = this.authIdentity, securityQos: MutPtr<RpcSecurityQos> = this.securityQos): RpcBindingHandleSecurityV1A = RpcBindingHandleSecurityV1A(version = version, serverPrincNameCtorArg = serverPrincName, authnLevel = authnLevel, authnSvc = authnSvc, authIdentityCtorArg = authIdentity, securityQosCtorArg = securityQos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingHandleSecurityV1A) return false
        if (this.version != other.version) return false
        if (this.serverPrincName != other.serverPrincName) return false
        if (this.authnLevel != other.authnLevel) return false
        if (this.authnSvc != other.authnSvc) return false
        if (this.authIdentity != other.authIdentity) return false
        if (this.securityQos != other.securityQos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.serverPrincName.hashCode()
        result = 31 * result + this.authnLevel.hashCode()
        result = 31 * result + this.authnSvc.hashCode()
        result = 31 * result + this.authIdentity.hashCode()
        result = 31 * result + this.securityQos.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingHandleSecurityV1A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingHandleSecurityV1A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RpcBindingHandleSecurityV1A =
                    RpcBindingHandleSecurityV1A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityA>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RpcSecurityQos>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RpcBindingHandleSecurityV1A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.serverPrincName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.authnLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.authnSvc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityA>(64)
                    ).writeNative(addr + 24L, value.authIdentity)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RpcSecurityQos>(64)
                    ).writeNative(addr + 32L, value.securityQos)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            serverPrincName: MutPtr<UByte> = MutPtr(0L),
            authnLevel: UInt = 0u,
            authnSvc: UInt = 0u,
            authIdentity: MutPtr<SecWinntAuthIdentityA> = MutPtr(0L),
            securityQos: MutPtr<RpcSecurityQos> = MutPtr(0L),
        ): RpcBindingHandleSecurityV1A =
            RpcBindingHandleSecurityV1A(
                version = version,
                serverPrincNameCtorArg = serverPrincName,
                authnLevel = authnLevel,
                authnSvc = authnSvc,
                authIdentityCtorArg = authIdentity,
                securityQosCtorArg = securityQos,
            )
    }
}

public class RpcBindingHandleSecurityV1W internal constructor(
    public var version: UInt,
    serverPrincNameCtorArg: MutPtr<UShort>,
    public var authnLevel: UInt,
    public var authnSvc: UInt,
    authIdentityCtorArg: MutPtr<SecWinntAuthIdentityW>,
    securityQosCtorArg: MutPtr<RpcSecurityQos>,
) {
    public var serverPrincName: MutPtr<UShort> = serverPrincNameCtorArg
        internal set

    public var authIdentity: MutPtr<SecWinntAuthIdentityW> = authIdentityCtorArg
        internal set

    public var securityQos: MutPtr<RpcSecurityQos> = securityQosCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        serverPrincNameCtorArg = MutPtr(0L),
        authnLevel = 0u,
        authnSvc = 0u,
        authIdentityCtorArg = MutPtr(0L),
        securityQosCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<UShort> = this.serverPrincName

    public operator fun component3(): UInt = this.authnLevel

    public operator fun component4(): UInt = this.authnSvc

    public operator fun component5(): MutPtr<SecWinntAuthIdentityW> = this.authIdentity

    public operator fun component6(): MutPtr<RpcSecurityQos> = this.securityQos

    public fun copy(version: UInt = this.version, serverPrincName: MutPtr<UShort> = this.serverPrincName, authnLevel: UInt = this.authnLevel, authnSvc: UInt = this.authnSvc, authIdentity: MutPtr<SecWinntAuthIdentityW> = this.authIdentity, securityQos: MutPtr<RpcSecurityQos> = this.securityQos): RpcBindingHandleSecurityV1W = RpcBindingHandleSecurityV1W(version = version, serverPrincNameCtorArg = serverPrincName, authnLevel = authnLevel, authnSvc = authnSvc, authIdentityCtorArg = authIdentity, securityQosCtorArg = securityQos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingHandleSecurityV1W) return false
        if (this.version != other.version) return false
        if (this.serverPrincName != other.serverPrincName) return false
        if (this.authnLevel != other.authnLevel) return false
        if (this.authnSvc != other.authnSvc) return false
        if (this.authIdentity != other.authIdentity) return false
        if (this.securityQos != other.securityQos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.serverPrincName.hashCode()
        result = 31 * result + this.authnLevel.hashCode()
        result = 31 * result + this.authnSvc.hashCode()
        result = 31 * result + this.authIdentity.hashCode()
        result = 31 * result + this.securityQos.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingHandleSecurityV1W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingHandleSecurityV1W> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RpcBindingHandleSecurityV1W =
                    RpcBindingHandleSecurityV1W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityW>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RpcSecurityQos>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RpcBindingHandleSecurityV1W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.serverPrincName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.authnLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.authnSvc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityW>(64)
                    ).writeNative(addr + 24L, value.authIdentity)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RpcSecurityQos>(64)
                    ).writeNative(addr + 32L, value.securityQos)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            serverPrincName: MutPtr<UShort> = MutPtr(0L),
            authnLevel: UInt = 0u,
            authnSvc: UInt = 0u,
            authIdentity: MutPtr<SecWinntAuthIdentityW> = MutPtr(0L),
            securityQos: MutPtr<RpcSecurityQos> = MutPtr(0L),
        ): RpcBindingHandleSecurityV1W =
            RpcBindingHandleSecurityV1W(
                version = version,
                serverPrincNameCtorArg = serverPrincName,
                authnLevel = authnLevel,
                authnSvc = authnSvc,
                authIdentityCtorArg = authIdentity,
                securityQosCtorArg = securityQos,
            )
    }
}

public class RpcBindingHandleTemplateV1A internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var protocolSequence: UInt,
    networkAddressCtorArg: MutPtr<UByte>,
    stringEndpointCtorArg: MutPtr<UByte>,
    public var u1: RpcBindingHandleTemplateV1A0,
    public var objectUuid: Guid,
) {
    public var networkAddress: MutPtr<UByte> = networkAddressCtorArg
        internal set

    public var stringEndpoint: MutPtr<UByte> = stringEndpointCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        protocolSequence = 0u,
        networkAddressCtorArg = MutPtr(0L),
        stringEndpointCtorArg = MutPtr(0L),
        u1 = RpcBindingHandleTemplateV1A0(),
        objectUuid = Guid(),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.protocolSequence

    public operator fun component4(): MutPtr<UByte> = this.networkAddress

    public operator fun component5(): MutPtr<UByte> = this.stringEndpoint

    public operator fun component6(): RpcBindingHandleTemplateV1A0 = this.u1

    public operator fun component7(): Guid = this.objectUuid

    public fun copy(version: UInt = this.version, flags: UInt = this.flags, protocolSequence: UInt = this.protocolSequence, networkAddress: MutPtr<UByte> = this.networkAddress, stringEndpoint: MutPtr<UByte> = this.stringEndpoint, u1: RpcBindingHandleTemplateV1A0 = this.u1, objectUuid: Guid = this.objectUuid): RpcBindingHandleTemplateV1A = RpcBindingHandleTemplateV1A(version = version, flags = flags, protocolSequence = protocolSequence, networkAddressCtorArg = networkAddress, stringEndpointCtorArg = stringEndpoint, u1 = u1, objectUuid = objectUuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingHandleTemplateV1A) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.protocolSequence != other.protocolSequence) return false
        if (this.networkAddress != other.networkAddress) return false
        if (this.stringEndpoint != other.stringEndpoint) return false
        if (this.u1 != other.u1) return false
        if (this.objectUuid != other.objectUuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.protocolSequence.hashCode()
        result = 31 * result + this.networkAddress.hashCode()
        result = 31 * result + this.stringEndpoint.hashCode()
        result = 31 * result + this.u1.hashCode()
        result = 31 * result + this.objectUuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            protocolSequence: UInt = 0u,
            networkAddress: MutPtr<UByte> = MutPtr(0L),
            stringEndpoint: MutPtr<UByte> = MutPtr(0L),
            u1: RpcBindingHandleTemplateV1A0 = RpcBindingHandleTemplateV1A0(),
            objectUuid: Guid = Guid(),
        ): RpcBindingHandleTemplateV1A =
            RpcBindingHandleTemplateV1A(
                version = version,
                flags = flags,
                protocolSequence = protocolSequence,
                networkAddressCtorArg = networkAddress,
                stringEndpointCtorArg = stringEndpoint,
                u1 = u1,
                objectUuid = objectUuid,
            )
    }
}

public class RpcBindingHandleTemplateV1A0 internal constructor(
    reservedCtorArg: MutPtr<UByte>,
) {
    public var reserved: MutPtr<UByte> = reservedCtorArg
        internal set

    public constructor() : this(
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UByte> = this.reserved

    public fun copy(reserved: MutPtr<UByte> = this.reserved): RpcBindingHandleTemplateV1A0 = RpcBindingHandleTemplateV1A0(reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingHandleTemplateV1A0) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.hashCode()

    public companion object {
        public operator fun invoke(
            reserved: MutPtr<UByte> = MutPtr(0L),
        ): RpcBindingHandleTemplateV1A0 =
            RpcBindingHandleTemplateV1A0(
                reservedCtorArg = reserved,
            )
    }
}

public class RpcBindingHandleTemplateV1W internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var protocolSequence: UInt,
    networkAddressCtorArg: MutPtr<UShort>,
    stringEndpointCtorArg: MutPtr<UShort>,
    public var u1: RpcBindingHandleTemplateV1W0,
    public var objectUuid: Guid,
) {
    public var networkAddress: MutPtr<UShort> = networkAddressCtorArg
        internal set

    public var stringEndpoint: MutPtr<UShort> = stringEndpointCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        protocolSequence = 0u,
        networkAddressCtorArg = MutPtr(0L),
        stringEndpointCtorArg = MutPtr(0L),
        u1 = RpcBindingHandleTemplateV1W0(),
        objectUuid = Guid(),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.protocolSequence

    public operator fun component4(): MutPtr<UShort> = this.networkAddress

    public operator fun component5(): MutPtr<UShort> = this.stringEndpoint

    public operator fun component6(): RpcBindingHandleTemplateV1W0 = this.u1

    public operator fun component7(): Guid = this.objectUuid

    public fun copy(version: UInt = this.version, flags: UInt = this.flags, protocolSequence: UInt = this.protocolSequence, networkAddress: MutPtr<UShort> = this.networkAddress, stringEndpoint: MutPtr<UShort> = this.stringEndpoint, u1: RpcBindingHandleTemplateV1W0 = this.u1, objectUuid: Guid = this.objectUuid): RpcBindingHandleTemplateV1W = RpcBindingHandleTemplateV1W(version = version, flags = flags, protocolSequence = protocolSequence, networkAddressCtorArg = networkAddress, stringEndpointCtorArg = stringEndpoint, u1 = u1, objectUuid = objectUuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingHandleTemplateV1W) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.protocolSequence != other.protocolSequence) return false
        if (this.networkAddress != other.networkAddress) return false
        if (this.stringEndpoint != other.stringEndpoint) return false
        if (this.u1 != other.u1) return false
        if (this.objectUuid != other.objectUuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.protocolSequence.hashCode()
        result = 31 * result + this.networkAddress.hashCode()
        result = 31 * result + this.stringEndpoint.hashCode()
        result = 31 * result + this.u1.hashCode()
        result = 31 * result + this.objectUuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            protocolSequence: UInt = 0u,
            networkAddress: MutPtr<UShort> = MutPtr(0L),
            stringEndpoint: MutPtr<UShort> = MutPtr(0L),
            u1: RpcBindingHandleTemplateV1W0 = RpcBindingHandleTemplateV1W0(),
            objectUuid: Guid = Guid(),
        ): RpcBindingHandleTemplateV1W =
            RpcBindingHandleTemplateV1W(
                version = version,
                flags = flags,
                protocolSequence = protocolSequence,
                networkAddressCtorArg = networkAddress,
                stringEndpointCtorArg = stringEndpoint,
                u1 = u1,
                objectUuid = objectUuid,
            )
    }
}

public class RpcBindingHandleTemplateV1W0 internal constructor(
    reservedCtorArg: MutPtr<UShort>,
) {
    public var reserved: MutPtr<UShort> = reservedCtorArg
        internal set

    public constructor() : this(
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UShort> = this.reserved

    public fun copy(reserved: MutPtr<UShort> = this.reserved): RpcBindingHandleTemplateV1W0 = RpcBindingHandleTemplateV1W0(reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingHandleTemplateV1W0) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.hashCode()

    public companion object {
        public operator fun invoke(
            reserved: MutPtr<UShort> = MutPtr(0L),
        ): RpcBindingHandleTemplateV1W0 =
            RpcBindingHandleTemplateV1W0(
                reservedCtorArg = reserved,
            )
    }
}

public class RpcBindingVector internal constructor(
    public var count: UInt,
    bindingHCtorArg: List<MutPtr<CVoid>>,
) {
    public var bindingH: List<MutPtr<CVoid>> = bindingHCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        bindingHCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): List<MutPtr<CVoid>> = this.bindingH

    public fun copy(count: UInt = this.count, bindingH: List<MutPtr<CVoid>> = this.bindingH): RpcBindingVector = RpcBindingVector(count = count, bindingHCtorArg = bindingH)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcBindingVector) return false
        if (this.count != other.count) return false
        if (this.bindingH != other.bindingH) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.bindingH.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcBindingVector> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcBindingVector =
                    RpcBindingVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcBindingVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.bindingH)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            bindingH: List<MutPtr<CVoid>> = List(1) { MutPtr(0L) },
        ): RpcBindingVector =
            RpcBindingVector(
                count = count,
                bindingHCtorArg = bindingH,
            )
    }
}

public class RpcCallAttributesV1A internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var serverPrincipalNameBufferLength: UInt,
    serverPrincipalNameCtorArg: MutPtr<UByte>,
    public var clientPrincipalNameBufferLength: UInt,
    clientPrincipalNameCtorArg: MutPtr<UByte>,
    public var authenticationLevel: UInt,
    public var authenticationService: UInt,
    public var nullSession: Bool,
) {
    public var serverPrincipalName: MutPtr<UByte> = serverPrincipalNameCtorArg
        internal set

    public var clientPrincipalName: MutPtr<UByte> = clientPrincipalNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        serverPrincipalNameBufferLength = 0u,
        serverPrincipalNameCtorArg = MutPtr(0L),
        clientPrincipalNameBufferLength = 0u,
        clientPrincipalNameCtorArg = MutPtr(0L),
        authenticationLevel = 0u,
        authenticationService = 0u,
        nullSession = 0,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.serverPrincipalNameBufferLength

    public operator fun component4(): MutPtr<UByte> = this.serverPrincipalName

    public operator fun component5(): UInt = this.clientPrincipalNameBufferLength

    public operator fun component6(): MutPtr<UByte> = this.clientPrincipalName

    public operator fun component7(): UInt = this.authenticationLevel

    public operator fun component8(): UInt = this.authenticationService

    public operator fun component9(): Bool = this.nullSession

    public fun copy(version: UInt = this.version, flags: UInt = this.flags, serverPrincipalNameBufferLength: UInt = this.serverPrincipalNameBufferLength, serverPrincipalName: MutPtr<UByte> = this.serverPrincipalName, clientPrincipalNameBufferLength: UInt = this.clientPrincipalNameBufferLength, clientPrincipalName: MutPtr<UByte> = this.clientPrincipalName, authenticationLevel: UInt = this.authenticationLevel, authenticationService: UInt = this.authenticationService, nullSession: Bool = this.nullSession): RpcCallAttributesV1A = RpcCallAttributesV1A(version = version, flags = flags, serverPrincipalNameBufferLength = serverPrincipalNameBufferLength, serverPrincipalNameCtorArg = serverPrincipalName, clientPrincipalNameBufferLength = clientPrincipalNameBufferLength, clientPrincipalNameCtorArg = clientPrincipalName, authenticationLevel = authenticationLevel, authenticationService = authenticationService, nullSession = nullSession)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcCallAttributesV1A) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.serverPrincipalNameBufferLength != other.serverPrincipalNameBufferLength) return false
        if (this.serverPrincipalName != other.serverPrincipalName) return false
        if (this.clientPrincipalNameBufferLength != other.clientPrincipalNameBufferLength) return false
        if (this.clientPrincipalName != other.clientPrincipalName) return false
        if (this.authenticationLevel != other.authenticationLevel) return false
        if (this.authenticationService != other.authenticationService) return false
        if (this.nullSession != other.nullSession) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.serverPrincipalNameBufferLength.hashCode()
        result = 31 * result + this.serverPrincipalName.hashCode()
        result = 31 * result + this.clientPrincipalNameBufferLength.hashCode()
        result = 31 * result + this.clientPrincipalName.hashCode()
        result = 31 * result + this.authenticationLevel.hashCode()
        result = 31 * result + this.authenticationService.hashCode()
        result = 31 * result + this.nullSession.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcCallAttributesV1A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcCallAttributesV1A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): RpcCallAttributesV1A =
                    RpcCallAttributesV1A(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RpcCallAttributesV1A) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.serverPrincipalNameBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.serverPrincipalName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.clientPrincipalNameBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.clientPrincipalName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.authenticationLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.authenticationService)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.nullSession)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            serverPrincipalNameBufferLength: UInt = 0u,
            serverPrincipalName: MutPtr<UByte> = MutPtr(0L),
            clientPrincipalNameBufferLength: UInt = 0u,
            clientPrincipalName: MutPtr<UByte> = MutPtr(0L),
            authenticationLevel: UInt = 0u,
            authenticationService: UInt = 0u,
            nullSession: Bool = 0,
        ): RpcCallAttributesV1A =
            RpcCallAttributesV1A(
                version = version,
                flags = flags,
                serverPrincipalNameBufferLength = serverPrincipalNameBufferLength,
                serverPrincipalNameCtorArg = serverPrincipalName,
                clientPrincipalNameBufferLength = clientPrincipalNameBufferLength,
                clientPrincipalNameCtorArg = clientPrincipalName,
                authenticationLevel = authenticationLevel,
                authenticationService = authenticationService,
                nullSession = nullSession,
            )
    }
}

public class RpcCallAttributesV1W internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var serverPrincipalNameBufferLength: UInt,
    serverPrincipalNameCtorArg: MutPtr<UShort>,
    public var clientPrincipalNameBufferLength: UInt,
    clientPrincipalNameCtorArg: MutPtr<UShort>,
    public var authenticationLevel: UInt,
    public var authenticationService: UInt,
    public var nullSession: Bool,
) {
    public var serverPrincipalName: MutPtr<UShort> = serverPrincipalNameCtorArg
        internal set

    public var clientPrincipalName: MutPtr<UShort> = clientPrincipalNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        serverPrincipalNameBufferLength = 0u,
        serverPrincipalNameCtorArg = MutPtr(0L),
        clientPrincipalNameBufferLength = 0u,
        clientPrincipalNameCtorArg = MutPtr(0L),
        authenticationLevel = 0u,
        authenticationService = 0u,
        nullSession = 0,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.serverPrincipalNameBufferLength

    public operator fun component4(): MutPtr<UShort> = this.serverPrincipalName

    public operator fun component5(): UInt = this.clientPrincipalNameBufferLength

    public operator fun component6(): MutPtr<UShort> = this.clientPrincipalName

    public operator fun component7(): UInt = this.authenticationLevel

    public operator fun component8(): UInt = this.authenticationService

    public operator fun component9(): Bool = this.nullSession

    public fun copy(version: UInt = this.version, flags: UInt = this.flags, serverPrincipalNameBufferLength: UInt = this.serverPrincipalNameBufferLength, serverPrincipalName: MutPtr<UShort> = this.serverPrincipalName, clientPrincipalNameBufferLength: UInt = this.clientPrincipalNameBufferLength, clientPrincipalName: MutPtr<UShort> = this.clientPrincipalName, authenticationLevel: UInt = this.authenticationLevel, authenticationService: UInt = this.authenticationService, nullSession: Bool = this.nullSession): RpcCallAttributesV1W = RpcCallAttributesV1W(version = version, flags = flags, serverPrincipalNameBufferLength = serverPrincipalNameBufferLength, serverPrincipalNameCtorArg = serverPrincipalName, clientPrincipalNameBufferLength = clientPrincipalNameBufferLength, clientPrincipalNameCtorArg = clientPrincipalName, authenticationLevel = authenticationLevel, authenticationService = authenticationService, nullSession = nullSession)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcCallAttributesV1W) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.serverPrincipalNameBufferLength != other.serverPrincipalNameBufferLength) return false
        if (this.serverPrincipalName != other.serverPrincipalName) return false
        if (this.clientPrincipalNameBufferLength != other.clientPrincipalNameBufferLength) return false
        if (this.clientPrincipalName != other.clientPrincipalName) return false
        if (this.authenticationLevel != other.authenticationLevel) return false
        if (this.authenticationService != other.authenticationService) return false
        if (this.nullSession != other.nullSession) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.serverPrincipalNameBufferLength.hashCode()
        result = 31 * result + this.serverPrincipalName.hashCode()
        result = 31 * result + this.clientPrincipalNameBufferLength.hashCode()
        result = 31 * result + this.clientPrincipalName.hashCode()
        result = 31 * result + this.authenticationLevel.hashCode()
        result = 31 * result + this.authenticationService.hashCode()
        result = 31 * result + this.nullSession.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcCallAttributesV1W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcCallAttributesV1W> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): RpcCallAttributesV1W =
                    RpcCallAttributesV1W(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RpcCallAttributesV1W) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.serverPrincipalNameBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.serverPrincipalName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.clientPrincipalNameBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.clientPrincipalName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.authenticationLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.authenticationService)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.nullSession)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            serverPrincipalNameBufferLength: UInt = 0u,
            serverPrincipalName: MutPtr<UShort> = MutPtr(0L),
            clientPrincipalNameBufferLength: UInt = 0u,
            clientPrincipalName: MutPtr<UShort> = MutPtr(0L),
            authenticationLevel: UInt = 0u,
            authenticationService: UInt = 0u,
            nullSession: Bool = 0,
        ): RpcCallAttributesV1W =
            RpcCallAttributesV1W(
                version = version,
                flags = flags,
                serverPrincipalNameBufferLength = serverPrincipalNameBufferLength,
                serverPrincipalNameCtorArg = serverPrincipalName,
                clientPrincipalNameBufferLength = clientPrincipalNameBufferLength,
                clientPrincipalNameCtorArg = clientPrincipalName,
                authenticationLevel = authenticationLevel,
                authenticationService = authenticationService,
                nullSession = nullSession,
            )
    }
}

public class RpcCallAttributesV2A internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var serverPrincipalNameBufferLength: UInt,
    serverPrincipalNameCtorArg: MutPtr<UByte>,
    public var clientPrincipalNameBufferLength: UInt,
    clientPrincipalNameCtorArg: MutPtr<UByte>,
    public var authenticationLevel: UInt,
    public var authenticationService: UInt,
    public var nullSession: Bool,
    public var kernelModeCaller: Bool,
    public var protocolSequence: UInt,
    public var isClientLocal: UInt,
    clientPIDCtorArg: Handle,
    public var callStatus: UInt,
    public var callType: RpcCallType,
    callLocalAddressCtorArg: MutPtr<RpcCallLocalAddressV1>,
    public var opNum: UShort,
    public var interfaceUuid: Guid,
) {
    public var serverPrincipalName: MutPtr<UByte> = serverPrincipalNameCtorArg
        internal set

    public var clientPrincipalName: MutPtr<UByte> = clientPrincipalNameCtorArg
        internal set

    public var clientPID: Handle = clientPIDCtorArg
        internal set

    public var callLocalAddress: MutPtr<RpcCallLocalAddressV1> = callLocalAddressCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        serverPrincipalNameBufferLength = 0u,
        serverPrincipalNameCtorArg = MutPtr(0L),
        clientPrincipalNameBufferLength = 0u,
        clientPrincipalNameCtorArg = MutPtr(0L),
        authenticationLevel = 0u,
        authenticationService = 0u,
        nullSession = 0,
        kernelModeCaller = 0,
        protocolSequence = 0u,
        isClientLocal = 0u,
        clientPIDCtorArg = MutPtr(0L),
        callStatus = 0u,
        callType = 0,
        callLocalAddressCtorArg = MutPtr(0L),
        opNum = 0u,
        interfaceUuid = Guid(),
    )

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            serverPrincipalNameBufferLength: UInt = 0u,
            serverPrincipalName: MutPtr<UByte> = MutPtr(0L),
            clientPrincipalNameBufferLength: UInt = 0u,
            clientPrincipalName: MutPtr<UByte> = MutPtr(0L),
            authenticationLevel: UInt = 0u,
            authenticationService: UInt = 0u,
            nullSession: Bool = 0,
            kernelModeCaller: Bool = 0,
            protocolSequence: UInt = 0u,
            isClientLocal: UInt = 0u,
            clientPID: Handle = MutPtr(0L),
            callStatus: UInt = 0u,
            callType: RpcCallType = 0,
            callLocalAddress: MutPtr<RpcCallLocalAddressV1> = MutPtr(0L),
            opNum: UShort = 0u,
            interfaceUuid: Guid = Guid(),
        ): RpcCallAttributesV2A =
            RpcCallAttributesV2A(
                version = version,
                flags = flags,
                serverPrincipalNameBufferLength = serverPrincipalNameBufferLength,
                serverPrincipalNameCtorArg = serverPrincipalName,
                clientPrincipalNameBufferLength = clientPrincipalNameBufferLength,
                clientPrincipalNameCtorArg = clientPrincipalName,
                authenticationLevel = authenticationLevel,
                authenticationService = authenticationService,
                nullSession = nullSession,
                kernelModeCaller = kernelModeCaller,
                protocolSequence = protocolSequence,
                isClientLocal = isClientLocal,
                clientPIDCtorArg = clientPID,
                callStatus = callStatus,
                callType = callType,
                callLocalAddressCtorArg = callLocalAddress,
                opNum = opNum,
                interfaceUuid = interfaceUuid,
            )
    }
}

public class RpcCallAttributesV2W internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var serverPrincipalNameBufferLength: UInt,
    serverPrincipalNameCtorArg: MutPtr<UShort>,
    public var clientPrincipalNameBufferLength: UInt,
    clientPrincipalNameCtorArg: MutPtr<UShort>,
    public var authenticationLevel: UInt,
    public var authenticationService: UInt,
    public var nullSession: Bool,
    public var kernelModeCaller: Bool,
    public var protocolSequence: UInt,
    public var isClientLocal: RpcCallClientLocality,
    clientPIDCtorArg: Handle,
    public var callStatus: UInt,
    public var callType: RpcCallType,
    callLocalAddressCtorArg: MutPtr<RpcCallLocalAddressV1>,
    public var opNum: UShort,
    public var interfaceUuid: Guid,
) {
    public var serverPrincipalName: MutPtr<UShort> = serverPrincipalNameCtorArg
        internal set

    public var clientPrincipalName: MutPtr<UShort> = clientPrincipalNameCtorArg
        internal set

    public var clientPID: Handle = clientPIDCtorArg
        internal set

    public var callLocalAddress: MutPtr<RpcCallLocalAddressV1> = callLocalAddressCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        serverPrincipalNameBufferLength = 0u,
        serverPrincipalNameCtorArg = MutPtr(0L),
        clientPrincipalNameBufferLength = 0u,
        clientPrincipalNameCtorArg = MutPtr(0L),
        authenticationLevel = 0u,
        authenticationService = 0u,
        nullSession = 0,
        kernelModeCaller = 0,
        protocolSequence = 0u,
        isClientLocal = 0,
        clientPIDCtorArg = MutPtr(0L),
        callStatus = 0u,
        callType = 0,
        callLocalAddressCtorArg = MutPtr(0L),
        opNum = 0u,
        interfaceUuid = Guid(),
    )

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            serverPrincipalNameBufferLength: UInt = 0u,
            serverPrincipalName: MutPtr<UShort> = MutPtr(0L),
            clientPrincipalNameBufferLength: UInt = 0u,
            clientPrincipalName: MutPtr<UShort> = MutPtr(0L),
            authenticationLevel: UInt = 0u,
            authenticationService: UInt = 0u,
            nullSession: Bool = 0,
            kernelModeCaller: Bool = 0,
            protocolSequence: UInt = 0u,
            isClientLocal: RpcCallClientLocality = 0,
            clientPID: Handle = MutPtr(0L),
            callStatus: UInt = 0u,
            callType: RpcCallType = 0,
            callLocalAddress: MutPtr<RpcCallLocalAddressV1> = MutPtr(0L),
            opNum: UShort = 0u,
            interfaceUuid: Guid = Guid(),
        ): RpcCallAttributesV2W =
            RpcCallAttributesV2W(
                version = version,
                flags = flags,
                serverPrincipalNameBufferLength = serverPrincipalNameBufferLength,
                serverPrincipalNameCtorArg = serverPrincipalName,
                clientPrincipalNameBufferLength = clientPrincipalNameBufferLength,
                clientPrincipalNameCtorArg = clientPrincipalName,
                authenticationLevel = authenticationLevel,
                authenticationService = authenticationService,
                nullSession = nullSession,
                kernelModeCaller = kernelModeCaller,
                protocolSequence = protocolSequence,
                isClientLocal = isClientLocal,
                clientPIDCtorArg = clientPID,
                callStatus = callStatus,
                callType = callType,
                callLocalAddressCtorArg = callLocalAddress,
                opNum = opNum,
                interfaceUuid = interfaceUuid,
            )
    }
}

public class RpcCallAttributesV3A internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var serverPrincipalNameBufferLength: UInt,
    serverPrincipalNameCtorArg: MutPtr<UByte>,
    public var clientPrincipalNameBufferLength: UInt,
    clientPrincipalNameCtorArg: MutPtr<UByte>,
    public var authenticationLevel: UInt,
    public var authenticationService: UInt,
    public var nullSession: Bool,
    public var kernelModeCaller: Bool,
    public var protocolSequence: UInt,
    public var isClientLocal: UInt,
    clientPIDCtorArg: Handle,
    public var callStatus: UInt,
    public var callType: RpcCallType,
    callLocalAddressCtorArg: MutPtr<RpcCallLocalAddressV1>,
    public var opNum: UShort,
    public var interfaceUuid: Guid,
    public var clientIdentifierBufferLength: UInt,
    clientIdentifierCtorArg: MutPtr<UByte>,
) {
    public var serverPrincipalName: MutPtr<UByte> = serverPrincipalNameCtorArg
        internal set

    public var clientPrincipalName: MutPtr<UByte> = clientPrincipalNameCtorArg
        internal set

    public var clientPID: Handle = clientPIDCtorArg
        internal set

    public var callLocalAddress: MutPtr<RpcCallLocalAddressV1> = callLocalAddressCtorArg
        internal set

    public var clientIdentifier: MutPtr<UByte> = clientIdentifierCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        serverPrincipalNameBufferLength = 0u,
        serverPrincipalNameCtorArg = MutPtr(0L),
        clientPrincipalNameBufferLength = 0u,
        clientPrincipalNameCtorArg = MutPtr(0L),
        authenticationLevel = 0u,
        authenticationService = 0u,
        nullSession = 0,
        kernelModeCaller = 0,
        protocolSequence = 0u,
        isClientLocal = 0u,
        clientPIDCtorArg = MutPtr(0L),
        callStatus = 0u,
        callType = 0,
        callLocalAddressCtorArg = MutPtr(0L),
        opNum = 0u,
        interfaceUuid = Guid(),
        clientIdentifierBufferLength = 0u,
        clientIdentifierCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            serverPrincipalNameBufferLength: UInt = 0u,
            serverPrincipalName: MutPtr<UByte> = MutPtr(0L),
            clientPrincipalNameBufferLength: UInt = 0u,
            clientPrincipalName: MutPtr<UByte> = MutPtr(0L),
            authenticationLevel: UInt = 0u,
            authenticationService: UInt = 0u,
            nullSession: Bool = 0,
            kernelModeCaller: Bool = 0,
            protocolSequence: UInt = 0u,
            isClientLocal: UInt = 0u,
            clientPID: Handle = MutPtr(0L),
            callStatus: UInt = 0u,
            callType: RpcCallType = 0,
            callLocalAddress: MutPtr<RpcCallLocalAddressV1> = MutPtr(0L),
            opNum: UShort = 0u,
            interfaceUuid: Guid = Guid(),
            clientIdentifierBufferLength: UInt = 0u,
            clientIdentifier: MutPtr<UByte> = MutPtr(0L),
        ): RpcCallAttributesV3A =
            RpcCallAttributesV3A(
                version = version,
                flags = flags,
                serverPrincipalNameBufferLength = serverPrincipalNameBufferLength,
                serverPrincipalNameCtorArg = serverPrincipalName,
                clientPrincipalNameBufferLength = clientPrincipalNameBufferLength,
                clientPrincipalNameCtorArg = clientPrincipalName,
                authenticationLevel = authenticationLevel,
                authenticationService = authenticationService,
                nullSession = nullSession,
                kernelModeCaller = kernelModeCaller,
                protocolSequence = protocolSequence,
                isClientLocal = isClientLocal,
                clientPIDCtorArg = clientPID,
                callStatus = callStatus,
                callType = callType,
                callLocalAddressCtorArg = callLocalAddress,
                opNum = opNum,
                interfaceUuid = interfaceUuid,
                clientIdentifierBufferLength = clientIdentifierBufferLength,
                clientIdentifierCtorArg = clientIdentifier,
            )
    }
}

public class RpcCallAttributesV3W internal constructor(
    public var version: UInt,
    public var flags: UInt,
    public var serverPrincipalNameBufferLength: UInt,
    serverPrincipalNameCtorArg: MutPtr<UShort>,
    public var clientPrincipalNameBufferLength: UInt,
    clientPrincipalNameCtorArg: MutPtr<UShort>,
    public var authenticationLevel: UInt,
    public var authenticationService: UInt,
    public var nullSession: Bool,
    public var kernelModeCaller: Bool,
    public var protocolSequence: UInt,
    public var isClientLocal: RpcCallClientLocality,
    clientPIDCtorArg: Handle,
    public var callStatus: UInt,
    public var callType: RpcCallType,
    callLocalAddressCtorArg: MutPtr<RpcCallLocalAddressV1>,
    public var opNum: UShort,
    public var interfaceUuid: Guid,
    public var clientIdentifierBufferLength: UInt,
    clientIdentifierCtorArg: MutPtr<UByte>,
) {
    public var serverPrincipalName: MutPtr<UShort> = serverPrincipalNameCtorArg
        internal set

    public var clientPrincipalName: MutPtr<UShort> = clientPrincipalNameCtorArg
        internal set

    public var clientPID: Handle = clientPIDCtorArg
        internal set

    public var callLocalAddress: MutPtr<RpcCallLocalAddressV1> = callLocalAddressCtorArg
        internal set

    public var clientIdentifier: MutPtr<UByte> = clientIdentifierCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0u,
        serverPrincipalNameBufferLength = 0u,
        serverPrincipalNameCtorArg = MutPtr(0L),
        clientPrincipalNameBufferLength = 0u,
        clientPrincipalNameCtorArg = MutPtr(0L),
        authenticationLevel = 0u,
        authenticationService = 0u,
        nullSession = 0,
        kernelModeCaller = 0,
        protocolSequence = 0u,
        isClientLocal = 0,
        clientPIDCtorArg = MutPtr(0L),
        callStatus = 0u,
        callType = 0,
        callLocalAddressCtorArg = MutPtr(0L),
        opNum = 0u,
        interfaceUuid = Guid(),
        clientIdentifierBufferLength = 0u,
        clientIdentifierCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: UInt = 0u,
            serverPrincipalNameBufferLength: UInt = 0u,
            serverPrincipalName: MutPtr<UShort> = MutPtr(0L),
            clientPrincipalNameBufferLength: UInt = 0u,
            clientPrincipalName: MutPtr<UShort> = MutPtr(0L),
            authenticationLevel: UInt = 0u,
            authenticationService: UInt = 0u,
            nullSession: Bool = 0,
            kernelModeCaller: Bool = 0,
            protocolSequence: UInt = 0u,
            isClientLocal: RpcCallClientLocality = 0,
            clientPID: Handle = MutPtr(0L),
            callStatus: UInt = 0u,
            callType: RpcCallType = 0,
            callLocalAddress: MutPtr<RpcCallLocalAddressV1> = MutPtr(0L),
            opNum: UShort = 0u,
            interfaceUuid: Guid = Guid(),
            clientIdentifierBufferLength: UInt = 0u,
            clientIdentifier: MutPtr<UByte> = MutPtr(0L),
        ): RpcCallAttributesV3W =
            RpcCallAttributesV3W(
                version = version,
                flags = flags,
                serverPrincipalNameBufferLength = serverPrincipalNameBufferLength,
                serverPrincipalNameCtorArg = serverPrincipalName,
                clientPrincipalNameBufferLength = clientPrincipalNameBufferLength,
                clientPrincipalNameCtorArg = clientPrincipalName,
                authenticationLevel = authenticationLevel,
                authenticationService = authenticationService,
                nullSession = nullSession,
                kernelModeCaller = kernelModeCaller,
                protocolSequence = protocolSequence,
                isClientLocal = isClientLocal,
                clientPIDCtorArg = clientPID,
                callStatus = callStatus,
                callType = callType,
                callLocalAddressCtorArg = callLocalAddress,
                opNum = opNum,
                interfaceUuid = interfaceUuid,
                clientIdentifierBufferLength = clientIdentifierBufferLength,
                clientIdentifierCtorArg = clientIdentifier,
            )
    }
}

public class RpcCallLocalAddressV1 internal constructor(
    public var version: UInt,
    bufferCtorArg: MutPtr<CVoid>,
    public var bufferSize: UInt,
    public var addressFormat: RpcLocalAddressFormat,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        bufferCtorArg = MutPtr(0L),
        bufferSize = 0u,
        addressFormat = 0,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): RpcLocalAddressFormat = this.addressFormat

    public fun copy(version: UInt = this.version, buffer: MutPtr<CVoid> = this.buffer, bufferSize: UInt = this.bufferSize, addressFormat: RpcLocalAddressFormat = this.addressFormat): RpcCallLocalAddressV1 = RpcCallLocalAddressV1(version = version, bufferCtorArg = buffer, bufferSize = bufferSize, addressFormat = addressFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcCallLocalAddressV1) return false
        if (this.version != other.version) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.addressFormat != other.addressFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.addressFormat.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcCallLocalAddressV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcCallLocalAddressV1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RpcCallLocalAddressV1 =
                    RpcCallLocalAddressV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: RpcCallLocalAddressV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.addressFormat)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            bufferSize: UInt = 0u,
            addressFormat: RpcLocalAddressFormat = 0,
        ): RpcCallLocalAddressV1 =
            RpcCallLocalAddressV1(
                version = version,
                bufferCtorArg = buffer,
                bufferSize = bufferSize,
                addressFormat = addressFormat,
            )
    }
}

public class RpcClientInformation1 internal constructor(
    userNameCtorArg: MutPtr<UByte>,
    computerNameCtorArg: MutPtr<UByte>,
    public var privilege: UShort,
    public var authFlags: UInt,
) {
    public var userName: MutPtr<UByte> = userNameCtorArg
        internal set

    public var computerName: MutPtr<UByte> = computerNameCtorArg
        internal set

    public constructor() : this(
        userNameCtorArg = MutPtr(0L),
        computerNameCtorArg = MutPtr(0L),
        privilege = 0u,
        authFlags = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.userName

    public operator fun component2(): MutPtr<UByte> = this.computerName

    public operator fun component3(): UShort = this.privilege

    public operator fun component4(): UInt = this.authFlags

    public fun copy(userName: MutPtr<UByte> = this.userName, computerName: MutPtr<UByte> = this.computerName, privilege: UShort = this.privilege, authFlags: UInt = this.authFlags): RpcClientInformation1 = RpcClientInformation1(userNameCtorArg = userName, computerNameCtorArg = computerName, privilege = privilege, authFlags = authFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcClientInformation1) return false
        if (this.userName != other.userName) return false
        if (this.computerName != other.computerName) return false
        if (this.privilege != other.privilege) return false
        if (this.authFlags != other.authFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userName.hashCode()
        result = 31 * result + this.computerName.hashCode()
        result = 31 * result + this.privilege.hashCode()
        result = 31 * result + this.authFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcClientInformation1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcClientInformation1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RpcClientInformation1 =
                    RpcClientInformation1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: RpcClientInformation1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.userName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.computerName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.privilege)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.authFlags)
                }
            }

        public operator fun invoke(
            userName: MutPtr<UByte> = MutPtr(0L),
            computerName: MutPtr<UByte> = MutPtr(0L),
            privilege: UShort = 0u,
            authFlags: UInt = 0u,
        ): RpcClientInformation1 =
            RpcClientInformation1(
                userNameCtorArg = userName,
                computerNameCtorArg = computerName,
                privilege = privilege,
                authFlags = authFlags,
            )
    }
}

public class RpcClientInterface internal constructor(
    public var length: UInt,
    public var interfaceId: RpcSyntaxIdentifier,
    public var transferSyntax: RpcSyntaxIdentifier,
    dispatchTableCtorArg: MutPtr<RpcDispatchTable>,
    public var rpcProtseqEndpointCount: UInt,
    rpcProtseqEndpointCtorArg: MutPtr<RpcProtseqEndpoint>,
    public var reserved: Int,
    interpreterInfoCtorArg: ConstPtr<CVoid>,
    public var flags: UInt,
) {
    public var dispatchTable: MutPtr<RpcDispatchTable> = dispatchTableCtorArg
        internal set

    public var rpcProtseqEndpoint: MutPtr<RpcProtseqEndpoint> = rpcProtseqEndpointCtorArg
        internal set

    public var interpreterInfo: ConstPtr<CVoid> = interpreterInfoCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        interfaceId = RpcSyntaxIdentifier(),
        transferSyntax = RpcSyntaxIdentifier(),
        dispatchTableCtorArg = MutPtr(0L),
        rpcProtseqEndpointCount = 0u,
        rpcProtseqEndpointCtorArg = MutPtr(0L),
        reserved = 0,
        interpreterInfoCtorArg = ConstPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): RpcSyntaxIdentifier = this.interfaceId

    public operator fun component3(): RpcSyntaxIdentifier = this.transferSyntax

    public operator fun component4(): MutPtr<RpcDispatchTable> = this.dispatchTable

    public operator fun component5(): UInt = this.rpcProtseqEndpointCount

    public operator fun component6(): MutPtr<RpcProtseqEndpoint> = this.rpcProtseqEndpoint

    public operator fun component7(): Int = this.reserved

    public operator fun component8(): ConstPtr<CVoid> = this.interpreterInfo

    public operator fun component9(): UInt = this.flags

    public fun copy(length: UInt = this.length, interfaceId: RpcSyntaxIdentifier = this.interfaceId, transferSyntax: RpcSyntaxIdentifier = this.transferSyntax, dispatchTable: MutPtr<RpcDispatchTable> = this.dispatchTable, rpcProtseqEndpointCount: UInt = this.rpcProtseqEndpointCount, rpcProtseqEndpoint: MutPtr<RpcProtseqEndpoint> = this.rpcProtseqEndpoint, reserved: Int = this.reserved, interpreterInfo: ConstPtr<CVoid> = this.interpreterInfo, flags: UInt = this.flags): RpcClientInterface = RpcClientInterface(length = length, interfaceId = interfaceId, transferSyntax = transferSyntax, dispatchTableCtorArg = dispatchTable, rpcProtseqEndpointCount = rpcProtseqEndpointCount, rpcProtseqEndpointCtorArg = rpcProtseqEndpoint, reserved = reserved, interpreterInfoCtorArg = interpreterInfo, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcClientInterface) return false
        if (this.length != other.length) return false
        if (this.interfaceId != other.interfaceId) return false
        if (this.transferSyntax != other.transferSyntax) return false
        if (this.dispatchTable != other.dispatchTable) return false
        if (this.rpcProtseqEndpointCount != other.rpcProtseqEndpointCount) return false
        if (this.rpcProtseqEndpoint != other.rpcProtseqEndpoint) return false
        if (this.reserved != other.reserved) return false
        if (this.interpreterInfo != other.interpreterInfo) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.interfaceId.hashCode()
        result = 31 * result + this.transferSyntax.hashCode()
        result = 31 * result + this.dispatchTable.hashCode()
        result = 31 * result + this.rpcProtseqEndpointCount.hashCode()
        result = 31 * result + this.rpcProtseqEndpoint.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.interpreterInfo.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            interfaceId: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
            transferSyntax: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
            dispatchTable: MutPtr<RpcDispatchTable> = MutPtr(0L),
            rpcProtseqEndpointCount: UInt = 0u,
            rpcProtseqEndpoint: MutPtr<RpcProtseqEndpoint> = MutPtr(0L),
            reserved: Int = 0,
            interpreterInfo: ConstPtr<CVoid> = ConstPtr(0L),
            flags: UInt = 0u,
        ): RpcClientInterface =
            RpcClientInterface(
                length = length,
                interfaceId = interfaceId,
                transferSyntax = transferSyntax,
                dispatchTableCtorArg = dispatchTable,
                rpcProtseqEndpointCount = rpcProtseqEndpointCount,
                rpcProtseqEndpointCtorArg = rpcProtseqEndpoint,
                reserved = reserved,
                interpreterInfoCtorArg = interpreterInfo,
                flags = flags,
            )
    }
}

public class RpcCOptCookieAuthDescriptor internal constructor(
    public var bufferSize: UInt,
    bufferCtorArg: Pstr,
) {
    public var buffer: Pstr = bufferCtorArg
        internal set

    public constructor() : this(
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bufferSize

    public operator fun component2(): Pstr = this.buffer

    public fun copy(bufferSize: UInt = this.bufferSize, buffer: Pstr = this.buffer): RpcCOptCookieAuthDescriptor = RpcCOptCookieAuthDescriptor(bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcCOptCookieAuthDescriptor) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bufferSize: UInt = 0u,
            buffer: Pstr = MutPtr(0L),
        ): RpcCOptCookieAuthDescriptor =
            RpcCOptCookieAuthDescriptor(
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public data class RpcDispatchTable(
    public var dispatchTableCount: UInt = 0u,
    public var dispatchTable: RpcDispatchFunction = null,
    public var reserved: Int = 0,
)

public data class RpcEeInfoParam(
    public var parameterType: ExtendedErrorParamTypes = 0,
    public var u: RpcEeInfoParam0 = RpcEeInfoParam0(),
)

public class RpcEeInfoParam0 internal constructor(
    ansiStringCtorArg: Pstr,
    unicodeStringCtorArg: Pwstr,
    public var lVal: Int,
    public var sVal: Short,
    public var pVal: ULong,
    public var bVal: BinaryParam,
) {
    public var ansiString: Pstr = ansiStringCtorArg
        internal set

    public var unicodeString: Pwstr = unicodeStringCtorArg
        internal set

    public constructor() : this(
        ansiStringCtorArg = MutPtr(0L),
        unicodeStringCtorArg = MutPtr(0L),
        lVal = 0,
        sVal = 0,
        pVal = 0uL,
        bVal = BinaryParam(),
    )

    public operator fun component1(): Pstr = this.ansiString

    public operator fun component2(): Pwstr = this.unicodeString

    public operator fun component3(): Int = this.lVal

    public operator fun component4(): Short = this.sVal

    public operator fun component5(): ULong = this.pVal

    public operator fun component6(): BinaryParam = this.bVal

    public fun copy(ansiString: Pstr = this.ansiString, unicodeString: Pwstr = this.unicodeString, lVal: Int = this.lVal, sVal: Short = this.sVal, pVal: ULong = this.pVal, bVal: BinaryParam = this.bVal): RpcEeInfoParam0 = RpcEeInfoParam0(ansiStringCtorArg = ansiString, unicodeStringCtorArg = unicodeString, lVal = lVal, sVal = sVal, pVal = pVal, bVal = bVal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcEeInfoParam0) return false
        if (this.ansiString != other.ansiString) return false
        if (this.unicodeString != other.unicodeString) return false
        if (this.lVal != other.lVal) return false
        if (this.sVal != other.sVal) return false
        if (this.pVal != other.pVal) return false
        if (this.bVal != other.bVal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ansiString.hashCode()
        result = 31 * result + this.unicodeString.hashCode()
        result = 31 * result + this.lVal.hashCode()
        result = 31 * result + this.sVal.hashCode()
        result = 31 * result + this.pVal.hashCode()
        result = 31 * result + this.bVal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ansiString: Pstr = MutPtr(0L),
            unicodeString: Pwstr = MutPtr(0L),
            lVal: Int = 0,
            sVal: Short = 0,
            pVal: ULong = 0uL,
            bVal: BinaryParam = BinaryParam(),
        ): RpcEeInfoParam0 =
            RpcEeInfoParam0(
                ansiStringCtorArg = ansiString,
                unicodeStringCtorArg = unicodeString,
                lVal = lVal,
                sVal = sVal,
                pVal = pVal,
                bVal = bVal,
            )
    }
}

public class RpcEndpointTemplatea internal constructor(
    public var version: UInt,
    protSeqCtorArg: Pstr,
    endpointCtorArg: Pstr,
    securityDescriptorCtorArg: MutPtr<CVoid>,
    public var backlog: UInt,
) {
    public var protSeq: Pstr = protSeqCtorArg
        internal set

    public var endpoint: Pstr = endpointCtorArg
        internal set

    public var securityDescriptor: MutPtr<CVoid> = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        protSeqCtorArg = MutPtr(0L),
        endpointCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        backlog = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pstr = this.protSeq

    public operator fun component3(): Pstr = this.endpoint

    public operator fun component4(): MutPtr<CVoid> = this.securityDescriptor

    public operator fun component5(): UInt = this.backlog

    public fun copy(version: UInt = this.version, protSeq: Pstr = this.protSeq, endpoint: Pstr = this.endpoint, securityDescriptor: MutPtr<CVoid> = this.securityDescriptor, backlog: UInt = this.backlog): RpcEndpointTemplatea = RpcEndpointTemplatea(version = version, protSeqCtorArg = protSeq, endpointCtorArg = endpoint, securityDescriptorCtorArg = securityDescriptor, backlog = backlog)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcEndpointTemplatea) return false
        if (this.version != other.version) return false
        if (this.protSeq != other.protSeq) return false
        if (this.endpoint != other.endpoint) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.backlog != other.backlog) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.protSeq.hashCode()
        result = 31 * result + this.endpoint.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.backlog.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            protSeq: Pstr = MutPtr(0L),
            endpoint: Pstr = MutPtr(0L),
            securityDescriptor: MutPtr<CVoid> = MutPtr(0L),
            backlog: UInt = 0u,
        ): RpcEndpointTemplatea =
            RpcEndpointTemplatea(
                version = version,
                protSeqCtorArg = protSeq,
                endpointCtorArg = endpoint,
                securityDescriptorCtorArg = securityDescriptor,
                backlog = backlog,
            )
    }
}

public class RpcEndpointTemplatew internal constructor(
    public var version: UInt,
    protSeqCtorArg: Pwstr,
    endpointCtorArg: Pwstr,
    securityDescriptorCtorArg: MutPtr<CVoid>,
    public var backlog: UInt,
) {
    public var protSeq: Pwstr = protSeqCtorArg
        internal set

    public var endpoint: Pwstr = endpointCtorArg
        internal set

    public var securityDescriptor: MutPtr<CVoid> = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        protSeqCtorArg = MutPtr(0L),
        endpointCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
        backlog = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pwstr = this.protSeq

    public operator fun component3(): Pwstr = this.endpoint

    public operator fun component4(): MutPtr<CVoid> = this.securityDescriptor

    public operator fun component5(): UInt = this.backlog

    public fun copy(version: UInt = this.version, protSeq: Pwstr = this.protSeq, endpoint: Pwstr = this.endpoint, securityDescriptor: MutPtr<CVoid> = this.securityDescriptor, backlog: UInt = this.backlog): RpcEndpointTemplatew = RpcEndpointTemplatew(version = version, protSeqCtorArg = protSeq, endpointCtorArg = endpoint, securityDescriptorCtorArg = securityDescriptor, backlog = backlog)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcEndpointTemplatew) return false
        if (this.version != other.version) return false
        if (this.protSeq != other.protSeq) return false
        if (this.endpoint != other.endpoint) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.backlog != other.backlog) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.protSeq.hashCode()
        result = 31 * result + this.endpoint.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.backlog.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            protSeq: Pwstr = MutPtr(0L),
            endpoint: Pwstr = MutPtr(0L),
            securityDescriptor: MutPtr<CVoid> = MutPtr(0L),
            backlog: UInt = 0u,
        ): RpcEndpointTemplatew =
            RpcEndpointTemplatew(
                version = version,
                protSeqCtorArg = protSeq,
                endpointCtorArg = endpoint,
                securityDescriptorCtorArg = securityDescriptor,
                backlog = backlog,
            )
    }
}

public class RpcErrorEnumHandle internal constructor(
    public var signature: UInt,
    currentPosCtorArg: MutPtr<CVoid>,
    headCtorArg: MutPtr<CVoid>,
) {
    public var currentPos: MutPtr<CVoid> = currentPosCtorArg
        internal set

    public var head: MutPtr<CVoid> = headCtorArg
        internal set

    public constructor() : this(
        signature = 0u,
        currentPosCtorArg = MutPtr(0L),
        headCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.signature

    public operator fun component2(): MutPtr<CVoid> = this.currentPos

    public operator fun component3(): MutPtr<CVoid> = this.head

    public fun copy(signature: UInt = this.signature, currentPos: MutPtr<CVoid> = this.currentPos, head: MutPtr<CVoid> = this.head): RpcErrorEnumHandle = RpcErrorEnumHandle(signature = signature, currentPosCtorArg = currentPos, headCtorArg = head)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcErrorEnumHandle) return false
        if (this.signature != other.signature) return false
        if (this.currentPos != other.currentPos) return false
        if (this.head != other.head) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.currentPos.hashCode()
        result = 31 * result + this.head.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcErrorEnumHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcErrorEnumHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RpcErrorEnumHandle =
                    RpcErrorEnumHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RpcErrorEnumHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.currentPos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.head)
                }
            }

        public operator fun invoke(
            signature: UInt = 0u,
            currentPos: MutPtr<CVoid> = MutPtr(0L),
            head: MutPtr<CVoid> = MutPtr(0L),
        ): RpcErrorEnumHandle =
            RpcErrorEnumHandle(
                signature = signature,
                currentPosCtorArg = currentPos,
                headCtorArg = head,
            )
    }
}

public class RpcExtendedErrorInfo internal constructor(
    public var version: UInt,
    computerNameCtorArg: Pwstr,
    public var processID: UInt,
    public var u: RpcExtendedErrorInfo0,
    public var generatingComponent: UInt,
    public var status: UInt,
    public var detectionLocation: UShort,
    public var flags: UShort,
    public var numberOfParameters: Int,
    public var parameters: List<RpcEeInfoParam>,
) {
    public var computerName: Pwstr = computerNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        computerNameCtorArg = MutPtr(0L),
        processID = 0u,
        u = RpcExtendedErrorInfo0(),
        generatingComponent = 0u,
        status = 0u,
        detectionLocation = 0u,
        flags = 0u,
        numberOfParameters = 0,
        parameters = List(4) { RpcEeInfoParam() },
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pwstr = this.computerName

    public operator fun component3(): UInt = this.processID

    public operator fun component4(): RpcExtendedErrorInfo0 = this.u

    public operator fun component5(): UInt = this.generatingComponent

    public operator fun component6(): UInt = this.status

    public operator fun component7(): UShort = this.detectionLocation

    public operator fun component8(): UShort = this.flags

    public operator fun component9(): Int = this.numberOfParameters

    public operator fun component10(): List<RpcEeInfoParam> = this.parameters

    public fun copy(version: UInt = this.version, computerName: Pwstr = this.computerName, processID: UInt = this.processID, u: RpcExtendedErrorInfo0 = this.u, generatingComponent: UInt = this.generatingComponent, status: UInt = this.status, detectionLocation: UShort = this.detectionLocation, flags: UShort = this.flags, numberOfParameters: Int = this.numberOfParameters, parameters: List<RpcEeInfoParam> = this.parameters): RpcExtendedErrorInfo = RpcExtendedErrorInfo(version = version, computerNameCtorArg = computerName, processID = processID, u = u, generatingComponent = generatingComponent, status = status, detectionLocation = detectionLocation, flags = flags, numberOfParameters = numberOfParameters, parameters = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcExtendedErrorInfo) return false
        if (this.version != other.version) return false
        if (this.computerName != other.computerName) return false
        if (this.processID != other.processID) return false
        if (this.u != other.u) return false
        if (this.generatingComponent != other.generatingComponent) return false
        if (this.status != other.status) return false
        if (this.detectionLocation != other.detectionLocation) return false
        if (this.flags != other.flags) return false
        if (this.numberOfParameters != other.numberOfParameters) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.computerName.hashCode()
        result = 31 * result + this.processID.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.generatingComponent.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.detectionLocation.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numberOfParameters.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            computerName: Pwstr = MutPtr(0L),
            processID: UInt = 0u,
            u: RpcExtendedErrorInfo0 = RpcExtendedErrorInfo0(),
            generatingComponent: UInt = 0u,
            status: UInt = 0u,
            detectionLocation: UShort = 0u,
            flags: UShort = 0u,
            numberOfParameters: Int = 0,
            parameters: List<RpcEeInfoParam> = List(4) { RpcEeInfoParam() },
        ): RpcExtendedErrorInfo =
            RpcExtendedErrorInfo(
                version = version,
                computerNameCtorArg = computerName,
                processID = processID,
                u = u,
                generatingComponent = generatingComponent,
                status = status,
                detectionLocation = detectionLocation,
                flags = flags,
                numberOfParameters = numberOfParameters,
                parameters = parameters,
            )
    }
}

public data class RpcExtendedErrorInfo0(
    public var systemTime: Systemtime = Systemtime(),
    public var fileTime: Filetime = Filetime(),
)

public class RpcHttpTransportCredentialsA internal constructor(
    transportCredentialsCtorArg: MutPtr<SecWinntAuthIdentityA>,
    public var flags: RpcCHttpFlags,
    public var authenticationTarget: RpcCHttpAuthnTarget,
    public var numberOfAuthnSchemes: UInt,
    authnSchemesCtorArg: MutPtr<UInt>,
    serverCertificateSubjectCtorArg: MutPtr<UByte>,
) {
    public var transportCredentials: MutPtr<SecWinntAuthIdentityA> = transportCredentialsCtorArg
        internal set

    public var authnSchemes: MutPtr<UInt> = authnSchemesCtorArg
        internal set

    public var serverCertificateSubject: MutPtr<UByte> = serverCertificateSubjectCtorArg
        internal set

    public constructor() : this(
        transportCredentialsCtorArg = MutPtr(0L),
        flags = 0u,
        authenticationTarget = 0u,
        numberOfAuthnSchemes = 0u,
        authnSchemesCtorArg = MutPtr(0L),
        serverCertificateSubjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SecWinntAuthIdentityA> = this.transportCredentials

    public operator fun component2(): RpcCHttpFlags = this.flags

    public operator fun component3(): RpcCHttpAuthnTarget = this.authenticationTarget

    public operator fun component4(): UInt = this.numberOfAuthnSchemes

    public operator fun component5(): MutPtr<UInt> = this.authnSchemes

    public operator fun component6(): MutPtr<UByte> = this.serverCertificateSubject

    public fun copy(transportCredentials: MutPtr<SecWinntAuthIdentityA> = this.transportCredentials, flags: RpcCHttpFlags = this.flags, authenticationTarget: RpcCHttpAuthnTarget = this.authenticationTarget, numberOfAuthnSchemes: UInt = this.numberOfAuthnSchemes, authnSchemes: MutPtr<UInt> = this.authnSchemes, serverCertificateSubject: MutPtr<UByte> = this.serverCertificateSubject): RpcHttpTransportCredentialsA = RpcHttpTransportCredentialsA(transportCredentialsCtorArg = transportCredentials, flags = flags, authenticationTarget = authenticationTarget, numberOfAuthnSchemes = numberOfAuthnSchemes, authnSchemesCtorArg = authnSchemes, serverCertificateSubjectCtorArg = serverCertificateSubject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcHttpTransportCredentialsA) return false
        if (this.transportCredentials != other.transportCredentials) return false
        if (this.flags != other.flags) return false
        if (this.authenticationTarget != other.authenticationTarget) return false
        if (this.numberOfAuthnSchemes != other.numberOfAuthnSchemes) return false
        if (this.authnSchemes != other.authnSchemes) return false
        if (this.serverCertificateSubject != other.serverCertificateSubject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transportCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authenticationTarget.hashCode()
        result = 31 * result + this.numberOfAuthnSchemes.hashCode()
        result = 31 * result + this.authnSchemes.hashCode()
        result = 31 * result + this.serverCertificateSubject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RpcHttpTransportCredentialsA =
                    RpcHttpTransportCredentialsA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityA>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RpcHttpTransportCredentialsA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityA>(64)
                    ).writeNative(addr, value.transportCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authenticationTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.authnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.serverCertificateSubject)
                }
            }

        public operator fun invoke(
            transportCredentials: MutPtr<SecWinntAuthIdentityA> = MutPtr(0L),
            flags: RpcCHttpFlags = 0u,
            authenticationTarget: RpcCHttpAuthnTarget = 0u,
            numberOfAuthnSchemes: UInt = 0u,
            authnSchemes: MutPtr<UInt> = MutPtr(0L),
            serverCertificateSubject: MutPtr<UByte> = MutPtr(0L),
        ): RpcHttpTransportCredentialsA =
            RpcHttpTransportCredentialsA(
                transportCredentialsCtorArg = transportCredentials,
                flags = flags,
                authenticationTarget = authenticationTarget,
                numberOfAuthnSchemes = numberOfAuthnSchemes,
                authnSchemesCtorArg = authnSchemes,
                serverCertificateSubjectCtorArg = serverCertificateSubject,
            )
    }
}

public class RpcHttpTransportCredentialsV2A internal constructor(
    transportCredentialsCtorArg: MutPtr<SecWinntAuthIdentityA>,
    public var flags: RpcCHttpFlags,
    public var authenticationTarget: RpcCHttpAuthnTarget,
    public var numberOfAuthnSchemes: UInt,
    authnSchemesCtorArg: MutPtr<UInt>,
    serverCertificateSubjectCtorArg: MutPtr<UByte>,
    proxyCredentialsCtorArg: MutPtr<SecWinntAuthIdentityA>,
    public var numberOfProxyAuthnSchemes: UInt,
    proxyAuthnSchemesCtorArg: MutPtr<UInt>,
) {
    public var transportCredentials: MutPtr<SecWinntAuthIdentityA> = transportCredentialsCtorArg
        internal set

    public var authnSchemes: MutPtr<UInt> = authnSchemesCtorArg
        internal set

    public var serverCertificateSubject: MutPtr<UByte> = serverCertificateSubjectCtorArg
        internal set

    public var proxyCredentials: MutPtr<SecWinntAuthIdentityA> = proxyCredentialsCtorArg
        internal set

    public var proxyAuthnSchemes: MutPtr<UInt> = proxyAuthnSchemesCtorArg
        internal set

    public constructor() : this(
        transportCredentialsCtorArg = MutPtr(0L),
        flags = 0u,
        authenticationTarget = 0u,
        numberOfAuthnSchemes = 0u,
        authnSchemesCtorArg = MutPtr(0L),
        serverCertificateSubjectCtorArg = MutPtr(0L),
        proxyCredentialsCtorArg = MutPtr(0L),
        numberOfProxyAuthnSchemes = 0u,
        proxyAuthnSchemesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SecWinntAuthIdentityA> = this.transportCredentials

    public operator fun component2(): RpcCHttpFlags = this.flags

    public operator fun component3(): RpcCHttpAuthnTarget = this.authenticationTarget

    public operator fun component4(): UInt = this.numberOfAuthnSchemes

    public operator fun component5(): MutPtr<UInt> = this.authnSchemes

    public operator fun component6(): MutPtr<UByte> = this.serverCertificateSubject

    public operator fun component7(): MutPtr<SecWinntAuthIdentityA> = this.proxyCredentials

    public operator fun component8(): UInt = this.numberOfProxyAuthnSchemes

    public operator fun component9(): MutPtr<UInt> = this.proxyAuthnSchemes

    public fun copy(transportCredentials: MutPtr<SecWinntAuthIdentityA> = this.transportCredentials, flags: RpcCHttpFlags = this.flags, authenticationTarget: RpcCHttpAuthnTarget = this.authenticationTarget, numberOfAuthnSchemes: UInt = this.numberOfAuthnSchemes, authnSchemes: MutPtr<UInt> = this.authnSchemes, serverCertificateSubject: MutPtr<UByte> = this.serverCertificateSubject, proxyCredentials: MutPtr<SecWinntAuthIdentityA> = this.proxyCredentials, numberOfProxyAuthnSchemes: UInt = this.numberOfProxyAuthnSchemes, proxyAuthnSchemes: MutPtr<UInt> = this.proxyAuthnSchemes): RpcHttpTransportCredentialsV2A = RpcHttpTransportCredentialsV2A(transportCredentialsCtorArg = transportCredentials, flags = flags, authenticationTarget = authenticationTarget, numberOfAuthnSchemes = numberOfAuthnSchemes, authnSchemesCtorArg = authnSchemes, serverCertificateSubjectCtorArg = serverCertificateSubject, proxyCredentialsCtorArg = proxyCredentials, numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes, proxyAuthnSchemesCtorArg = proxyAuthnSchemes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcHttpTransportCredentialsV2A) return false
        if (this.transportCredentials != other.transportCredentials) return false
        if (this.flags != other.flags) return false
        if (this.authenticationTarget != other.authenticationTarget) return false
        if (this.numberOfAuthnSchemes != other.numberOfAuthnSchemes) return false
        if (this.authnSchemes != other.authnSchemes) return false
        if (this.serverCertificateSubject != other.serverCertificateSubject) return false
        if (this.proxyCredentials != other.proxyCredentials) return false
        if (this.numberOfProxyAuthnSchemes != other.numberOfProxyAuthnSchemes) return false
        if (this.proxyAuthnSchemes != other.proxyAuthnSchemes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transportCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authenticationTarget.hashCode()
        result = 31 * result + this.numberOfAuthnSchemes.hashCode()
        result = 31 * result + this.authnSchemes.hashCode()
        result = 31 * result + this.serverCertificateSubject.hashCode()
        result = 31 * result + this.proxyCredentials.hashCode()
        result = 31 * result + this.numberOfProxyAuthnSchemes.hashCode()
        result = 31 * result + this.proxyAuthnSchemes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV2A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV2A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RpcHttpTransportCredentialsV2A =
                    RpcHttpTransportCredentialsV2A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityA>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityA>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RpcHttpTransportCredentialsV2A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityA>(64)
                    ).writeNative(addr, value.transportCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authenticationTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.authnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.serverCertificateSubject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityA>(64)
                    ).writeNative(addr + 40L, value.proxyCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.numberOfProxyAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 56L, value.proxyAuthnSchemes)
                }
            }

        public operator fun invoke(
            transportCredentials: MutPtr<SecWinntAuthIdentityA> = MutPtr(0L),
            flags: RpcCHttpFlags = 0u,
            authenticationTarget: RpcCHttpAuthnTarget = 0u,
            numberOfAuthnSchemes: UInt = 0u,
            authnSchemes: MutPtr<UInt> = MutPtr(0L),
            serverCertificateSubject: MutPtr<UByte> = MutPtr(0L),
            proxyCredentials: MutPtr<SecWinntAuthIdentityA> = MutPtr(0L),
            numberOfProxyAuthnSchemes: UInt = 0u,
            proxyAuthnSchemes: MutPtr<UInt> = MutPtr(0L),
        ): RpcHttpTransportCredentialsV2A =
            RpcHttpTransportCredentialsV2A(
                transportCredentialsCtorArg = transportCredentials,
                flags = flags,
                authenticationTarget = authenticationTarget,
                numberOfAuthnSchemes = numberOfAuthnSchemes,
                authnSchemesCtorArg = authnSchemes,
                serverCertificateSubjectCtorArg = serverCertificateSubject,
                proxyCredentialsCtorArg = proxyCredentials,
                numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes,
                proxyAuthnSchemesCtorArg = proxyAuthnSchemes,
            )
    }
}

public class RpcHttpTransportCredentialsV2W internal constructor(
    transportCredentialsCtorArg: MutPtr<SecWinntAuthIdentityW>,
    public var flags: RpcCHttpFlags,
    public var authenticationTarget: RpcCHttpAuthnTarget,
    public var numberOfAuthnSchemes: UInt,
    authnSchemesCtorArg: MutPtr<UInt>,
    serverCertificateSubjectCtorArg: MutPtr<UShort>,
    proxyCredentialsCtorArg: MutPtr<SecWinntAuthIdentityW>,
    public var numberOfProxyAuthnSchemes: UInt,
    proxyAuthnSchemesCtorArg: MutPtr<UInt>,
) {
    public var transportCredentials: MutPtr<SecWinntAuthIdentityW> = transportCredentialsCtorArg
        internal set

    public var authnSchemes: MutPtr<UInt> = authnSchemesCtorArg
        internal set

    public var serverCertificateSubject: MutPtr<UShort> = serverCertificateSubjectCtorArg
        internal set

    public var proxyCredentials: MutPtr<SecWinntAuthIdentityW> = proxyCredentialsCtorArg
        internal set

    public var proxyAuthnSchemes: MutPtr<UInt> = proxyAuthnSchemesCtorArg
        internal set

    public constructor() : this(
        transportCredentialsCtorArg = MutPtr(0L),
        flags = 0u,
        authenticationTarget = 0u,
        numberOfAuthnSchemes = 0u,
        authnSchemesCtorArg = MutPtr(0L),
        serverCertificateSubjectCtorArg = MutPtr(0L),
        proxyCredentialsCtorArg = MutPtr(0L),
        numberOfProxyAuthnSchemes = 0u,
        proxyAuthnSchemesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SecWinntAuthIdentityW> = this.transportCredentials

    public operator fun component2(): RpcCHttpFlags = this.flags

    public operator fun component3(): RpcCHttpAuthnTarget = this.authenticationTarget

    public operator fun component4(): UInt = this.numberOfAuthnSchemes

    public operator fun component5(): MutPtr<UInt> = this.authnSchemes

    public operator fun component6(): MutPtr<UShort> = this.serverCertificateSubject

    public operator fun component7(): MutPtr<SecWinntAuthIdentityW> = this.proxyCredentials

    public operator fun component8(): UInt = this.numberOfProxyAuthnSchemes

    public operator fun component9(): MutPtr<UInt> = this.proxyAuthnSchemes

    public fun copy(transportCredentials: MutPtr<SecWinntAuthIdentityW> = this.transportCredentials, flags: RpcCHttpFlags = this.flags, authenticationTarget: RpcCHttpAuthnTarget = this.authenticationTarget, numberOfAuthnSchemes: UInt = this.numberOfAuthnSchemes, authnSchemes: MutPtr<UInt> = this.authnSchemes, serverCertificateSubject: MutPtr<UShort> = this.serverCertificateSubject, proxyCredentials: MutPtr<SecWinntAuthIdentityW> = this.proxyCredentials, numberOfProxyAuthnSchemes: UInt = this.numberOfProxyAuthnSchemes, proxyAuthnSchemes: MutPtr<UInt> = this.proxyAuthnSchemes): RpcHttpTransportCredentialsV2W = RpcHttpTransportCredentialsV2W(transportCredentialsCtorArg = transportCredentials, flags = flags, authenticationTarget = authenticationTarget, numberOfAuthnSchemes = numberOfAuthnSchemes, authnSchemesCtorArg = authnSchemes, serverCertificateSubjectCtorArg = serverCertificateSubject, proxyCredentialsCtorArg = proxyCredentials, numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes, proxyAuthnSchemesCtorArg = proxyAuthnSchemes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcHttpTransportCredentialsV2W) return false
        if (this.transportCredentials != other.transportCredentials) return false
        if (this.flags != other.flags) return false
        if (this.authenticationTarget != other.authenticationTarget) return false
        if (this.numberOfAuthnSchemes != other.numberOfAuthnSchemes) return false
        if (this.authnSchemes != other.authnSchemes) return false
        if (this.serverCertificateSubject != other.serverCertificateSubject) return false
        if (this.proxyCredentials != other.proxyCredentials) return false
        if (this.numberOfProxyAuthnSchemes != other.numberOfProxyAuthnSchemes) return false
        if (this.proxyAuthnSchemes != other.proxyAuthnSchemes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transportCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authenticationTarget.hashCode()
        result = 31 * result + this.numberOfAuthnSchemes.hashCode()
        result = 31 * result + this.authnSchemes.hashCode()
        result = 31 * result + this.serverCertificateSubject.hashCode()
        result = 31 * result + this.proxyCredentials.hashCode()
        result = 31 * result + this.numberOfProxyAuthnSchemes.hashCode()
        result = 31 * result + this.proxyAuthnSchemes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV2W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV2W> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RpcHttpTransportCredentialsV2W =
                    RpcHttpTransportCredentialsV2W(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityW>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityW>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RpcHttpTransportCredentialsV2W) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityW>(64)
                    ).writeNative(addr, value.transportCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authenticationTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.authnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.serverCertificateSubject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityW>(64)
                    ).writeNative(addr + 40L, value.proxyCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.numberOfProxyAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 56L, value.proxyAuthnSchemes)
                }
            }

        public operator fun invoke(
            transportCredentials: MutPtr<SecWinntAuthIdentityW> = MutPtr(0L),
            flags: RpcCHttpFlags = 0u,
            authenticationTarget: RpcCHttpAuthnTarget = 0u,
            numberOfAuthnSchemes: UInt = 0u,
            authnSchemes: MutPtr<UInt> = MutPtr(0L),
            serverCertificateSubject: MutPtr<UShort> = MutPtr(0L),
            proxyCredentials: MutPtr<SecWinntAuthIdentityW> = MutPtr(0L),
            numberOfProxyAuthnSchemes: UInt = 0u,
            proxyAuthnSchemes: MutPtr<UInt> = MutPtr(0L),
        ): RpcHttpTransportCredentialsV2W =
            RpcHttpTransportCredentialsV2W(
                transportCredentialsCtorArg = transportCredentials,
                flags = flags,
                authenticationTarget = authenticationTarget,
                numberOfAuthnSchemes = numberOfAuthnSchemes,
                authnSchemesCtorArg = authnSchemes,
                serverCertificateSubjectCtorArg = serverCertificateSubject,
                proxyCredentialsCtorArg = proxyCredentials,
                numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes,
                proxyAuthnSchemesCtorArg = proxyAuthnSchemes,
            )
    }
}

public class RpcHttpTransportCredentialsV3A internal constructor(
    transportCredentialsCtorArg: MutPtr<CVoid>,
    public var flags: RpcCHttpFlags,
    public var authenticationTarget: RpcCHttpAuthnTarget,
    public var numberOfAuthnSchemes: UInt,
    authnSchemesCtorArg: MutPtr<UInt>,
    serverCertificateSubjectCtorArg: MutPtr<UByte>,
    proxyCredentialsCtorArg: MutPtr<CVoid>,
    public var numberOfProxyAuthnSchemes: UInt,
    proxyAuthnSchemesCtorArg: MutPtr<UInt>,
) {
    public var transportCredentials: MutPtr<CVoid> = transportCredentialsCtorArg
        internal set

    public var authnSchemes: MutPtr<UInt> = authnSchemesCtorArg
        internal set

    public var serverCertificateSubject: MutPtr<UByte> = serverCertificateSubjectCtorArg
        internal set

    public var proxyCredentials: MutPtr<CVoid> = proxyCredentialsCtorArg
        internal set

    public var proxyAuthnSchemes: MutPtr<UInt> = proxyAuthnSchemesCtorArg
        internal set

    public constructor() : this(
        transportCredentialsCtorArg = MutPtr(0L),
        flags = 0u,
        authenticationTarget = 0u,
        numberOfAuthnSchemes = 0u,
        authnSchemesCtorArg = MutPtr(0L),
        serverCertificateSubjectCtorArg = MutPtr(0L),
        proxyCredentialsCtorArg = MutPtr(0L),
        numberOfProxyAuthnSchemes = 0u,
        proxyAuthnSchemesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.transportCredentials

    public operator fun component2(): RpcCHttpFlags = this.flags

    public operator fun component3(): RpcCHttpAuthnTarget = this.authenticationTarget

    public operator fun component4(): UInt = this.numberOfAuthnSchemes

    public operator fun component5(): MutPtr<UInt> = this.authnSchemes

    public operator fun component6(): MutPtr<UByte> = this.serverCertificateSubject

    public operator fun component7(): MutPtr<CVoid> = this.proxyCredentials

    public operator fun component8(): UInt = this.numberOfProxyAuthnSchemes

    public operator fun component9(): MutPtr<UInt> = this.proxyAuthnSchemes

    public fun copy(transportCredentials: MutPtr<CVoid> = this.transportCredentials, flags: RpcCHttpFlags = this.flags, authenticationTarget: RpcCHttpAuthnTarget = this.authenticationTarget, numberOfAuthnSchemes: UInt = this.numberOfAuthnSchemes, authnSchemes: MutPtr<UInt> = this.authnSchemes, serverCertificateSubject: MutPtr<UByte> = this.serverCertificateSubject, proxyCredentials: MutPtr<CVoid> = this.proxyCredentials, numberOfProxyAuthnSchemes: UInt = this.numberOfProxyAuthnSchemes, proxyAuthnSchemes: MutPtr<UInt> = this.proxyAuthnSchemes): RpcHttpTransportCredentialsV3A = RpcHttpTransportCredentialsV3A(transportCredentialsCtorArg = transportCredentials, flags = flags, authenticationTarget = authenticationTarget, numberOfAuthnSchemes = numberOfAuthnSchemes, authnSchemesCtorArg = authnSchemes, serverCertificateSubjectCtorArg = serverCertificateSubject, proxyCredentialsCtorArg = proxyCredentials, numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes, proxyAuthnSchemesCtorArg = proxyAuthnSchemes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcHttpTransportCredentialsV3A) return false
        if (this.transportCredentials != other.transportCredentials) return false
        if (this.flags != other.flags) return false
        if (this.authenticationTarget != other.authenticationTarget) return false
        if (this.numberOfAuthnSchemes != other.numberOfAuthnSchemes) return false
        if (this.authnSchemes != other.authnSchemes) return false
        if (this.serverCertificateSubject != other.serverCertificateSubject) return false
        if (this.proxyCredentials != other.proxyCredentials) return false
        if (this.numberOfProxyAuthnSchemes != other.numberOfProxyAuthnSchemes) return false
        if (this.proxyAuthnSchemes != other.proxyAuthnSchemes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transportCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authenticationTarget.hashCode()
        result = 31 * result + this.numberOfAuthnSchemes.hashCode()
        result = 31 * result + this.authnSchemes.hashCode()
        result = 31 * result + this.serverCertificateSubject.hashCode()
        result = 31 * result + this.proxyCredentials.hashCode()
        result = 31 * result + this.numberOfProxyAuthnSchemes.hashCode()
        result = 31 * result + this.proxyAuthnSchemes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV3A> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV3A> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RpcHttpTransportCredentialsV3A =
                    RpcHttpTransportCredentialsV3A(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RpcHttpTransportCredentialsV3A) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.transportCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authenticationTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.authnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.serverCertificateSubject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.proxyCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.numberOfProxyAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 56L, value.proxyAuthnSchemes)
                }
            }

        public operator fun invoke(
            transportCredentials: MutPtr<CVoid> = MutPtr(0L),
            flags: RpcCHttpFlags = 0u,
            authenticationTarget: RpcCHttpAuthnTarget = 0u,
            numberOfAuthnSchemes: UInt = 0u,
            authnSchemes: MutPtr<UInt> = MutPtr(0L),
            serverCertificateSubject: MutPtr<UByte> = MutPtr(0L),
            proxyCredentials: MutPtr<CVoid> = MutPtr(0L),
            numberOfProxyAuthnSchemes: UInt = 0u,
            proxyAuthnSchemes: MutPtr<UInt> = MutPtr(0L),
        ): RpcHttpTransportCredentialsV3A =
            RpcHttpTransportCredentialsV3A(
                transportCredentialsCtorArg = transportCredentials,
                flags = flags,
                authenticationTarget = authenticationTarget,
                numberOfAuthnSchemes = numberOfAuthnSchemes,
                authnSchemesCtorArg = authnSchemes,
                serverCertificateSubjectCtorArg = serverCertificateSubject,
                proxyCredentialsCtorArg = proxyCredentials,
                numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes,
                proxyAuthnSchemesCtorArg = proxyAuthnSchemes,
            )
    }
}

public class RpcHttpTransportCredentialsV3W internal constructor(
    transportCredentialsCtorArg: MutPtr<CVoid>,
    public var flags: RpcCHttpFlags,
    public var authenticationTarget: RpcCHttpAuthnTarget,
    public var numberOfAuthnSchemes: UInt,
    authnSchemesCtorArg: MutPtr<UInt>,
    serverCertificateSubjectCtorArg: MutPtr<UShort>,
    proxyCredentialsCtorArg: MutPtr<CVoid>,
    public var numberOfProxyAuthnSchemes: UInt,
    proxyAuthnSchemesCtorArg: MutPtr<UInt>,
) {
    public var transportCredentials: MutPtr<CVoid> = transportCredentialsCtorArg
        internal set

    public var authnSchemes: MutPtr<UInt> = authnSchemesCtorArg
        internal set

    public var serverCertificateSubject: MutPtr<UShort> = serverCertificateSubjectCtorArg
        internal set

    public var proxyCredentials: MutPtr<CVoid> = proxyCredentialsCtorArg
        internal set

    public var proxyAuthnSchemes: MutPtr<UInt> = proxyAuthnSchemesCtorArg
        internal set

    public constructor() : this(
        transportCredentialsCtorArg = MutPtr(0L),
        flags = 0u,
        authenticationTarget = 0u,
        numberOfAuthnSchemes = 0u,
        authnSchemesCtorArg = MutPtr(0L),
        serverCertificateSubjectCtorArg = MutPtr(0L),
        proxyCredentialsCtorArg = MutPtr(0L),
        numberOfProxyAuthnSchemes = 0u,
        proxyAuthnSchemesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.transportCredentials

    public operator fun component2(): RpcCHttpFlags = this.flags

    public operator fun component3(): RpcCHttpAuthnTarget = this.authenticationTarget

    public operator fun component4(): UInt = this.numberOfAuthnSchemes

    public operator fun component5(): MutPtr<UInt> = this.authnSchemes

    public operator fun component6(): MutPtr<UShort> = this.serverCertificateSubject

    public operator fun component7(): MutPtr<CVoid> = this.proxyCredentials

    public operator fun component8(): UInt = this.numberOfProxyAuthnSchemes

    public operator fun component9(): MutPtr<UInt> = this.proxyAuthnSchemes

    public fun copy(transportCredentials: MutPtr<CVoid> = this.transportCredentials, flags: RpcCHttpFlags = this.flags, authenticationTarget: RpcCHttpAuthnTarget = this.authenticationTarget, numberOfAuthnSchemes: UInt = this.numberOfAuthnSchemes, authnSchemes: MutPtr<UInt> = this.authnSchemes, serverCertificateSubject: MutPtr<UShort> = this.serverCertificateSubject, proxyCredentials: MutPtr<CVoid> = this.proxyCredentials, numberOfProxyAuthnSchemes: UInt = this.numberOfProxyAuthnSchemes, proxyAuthnSchemes: MutPtr<UInt> = this.proxyAuthnSchemes): RpcHttpTransportCredentialsV3W = RpcHttpTransportCredentialsV3W(transportCredentialsCtorArg = transportCredentials, flags = flags, authenticationTarget = authenticationTarget, numberOfAuthnSchemes = numberOfAuthnSchemes, authnSchemesCtorArg = authnSchemes, serverCertificateSubjectCtorArg = serverCertificateSubject, proxyCredentialsCtorArg = proxyCredentials, numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes, proxyAuthnSchemesCtorArg = proxyAuthnSchemes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcHttpTransportCredentialsV3W) return false
        if (this.transportCredentials != other.transportCredentials) return false
        if (this.flags != other.flags) return false
        if (this.authenticationTarget != other.authenticationTarget) return false
        if (this.numberOfAuthnSchemes != other.numberOfAuthnSchemes) return false
        if (this.authnSchemes != other.authnSchemes) return false
        if (this.serverCertificateSubject != other.serverCertificateSubject) return false
        if (this.proxyCredentials != other.proxyCredentials) return false
        if (this.numberOfProxyAuthnSchemes != other.numberOfProxyAuthnSchemes) return false
        if (this.proxyAuthnSchemes != other.proxyAuthnSchemes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transportCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authenticationTarget.hashCode()
        result = 31 * result + this.numberOfAuthnSchemes.hashCode()
        result = 31 * result + this.authnSchemes.hashCode()
        result = 31 * result + this.serverCertificateSubject.hashCode()
        result = 31 * result + this.proxyCredentials.hashCode()
        result = 31 * result + this.numberOfProxyAuthnSchemes.hashCode()
        result = 31 * result + this.proxyAuthnSchemes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV3W> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsV3W> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RpcHttpTransportCredentialsV3W =
                    RpcHttpTransportCredentialsV3W(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RpcHttpTransportCredentialsV3W) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.transportCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authenticationTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.authnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.serverCertificateSubject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.proxyCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.numberOfProxyAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 56L, value.proxyAuthnSchemes)
                }
            }

        public operator fun invoke(
            transportCredentials: MutPtr<CVoid> = MutPtr(0L),
            flags: RpcCHttpFlags = 0u,
            authenticationTarget: RpcCHttpAuthnTarget = 0u,
            numberOfAuthnSchemes: UInt = 0u,
            authnSchemes: MutPtr<UInt> = MutPtr(0L),
            serverCertificateSubject: MutPtr<UShort> = MutPtr(0L),
            proxyCredentials: MutPtr<CVoid> = MutPtr(0L),
            numberOfProxyAuthnSchemes: UInt = 0u,
            proxyAuthnSchemes: MutPtr<UInt> = MutPtr(0L),
        ): RpcHttpTransportCredentialsV3W =
            RpcHttpTransportCredentialsV3W(
                transportCredentialsCtorArg = transportCredentials,
                flags = flags,
                authenticationTarget = authenticationTarget,
                numberOfAuthnSchemes = numberOfAuthnSchemes,
                authnSchemesCtorArg = authnSchemes,
                serverCertificateSubjectCtorArg = serverCertificateSubject,
                proxyCredentialsCtorArg = proxyCredentials,
                numberOfProxyAuthnSchemes = numberOfProxyAuthnSchemes,
                proxyAuthnSchemesCtorArg = proxyAuthnSchemes,
            )
    }
}

public class RpcHttpTransportCredentialsW internal constructor(
    transportCredentialsCtorArg: MutPtr<SecWinntAuthIdentityW>,
    public var flags: RpcCHttpFlags,
    public var authenticationTarget: RpcCHttpAuthnTarget,
    public var numberOfAuthnSchemes: UInt,
    authnSchemesCtorArg: MutPtr<UInt>,
    serverCertificateSubjectCtorArg: MutPtr<UShort>,
) {
    public var transportCredentials: MutPtr<SecWinntAuthIdentityW> = transportCredentialsCtorArg
        internal set

    public var authnSchemes: MutPtr<UInt> = authnSchemesCtorArg
        internal set

    public var serverCertificateSubject: MutPtr<UShort> = serverCertificateSubjectCtorArg
        internal set

    public constructor() : this(
        transportCredentialsCtorArg = MutPtr(0L),
        flags = 0u,
        authenticationTarget = 0u,
        numberOfAuthnSchemes = 0u,
        authnSchemesCtorArg = MutPtr(0L),
        serverCertificateSubjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SecWinntAuthIdentityW> = this.transportCredentials

    public operator fun component2(): RpcCHttpFlags = this.flags

    public operator fun component3(): RpcCHttpAuthnTarget = this.authenticationTarget

    public operator fun component4(): UInt = this.numberOfAuthnSchemes

    public operator fun component5(): MutPtr<UInt> = this.authnSchemes

    public operator fun component6(): MutPtr<UShort> = this.serverCertificateSubject

    public fun copy(transportCredentials: MutPtr<SecWinntAuthIdentityW> = this.transportCredentials, flags: RpcCHttpFlags = this.flags, authenticationTarget: RpcCHttpAuthnTarget = this.authenticationTarget, numberOfAuthnSchemes: UInt = this.numberOfAuthnSchemes, authnSchemes: MutPtr<UInt> = this.authnSchemes, serverCertificateSubject: MutPtr<UShort> = this.serverCertificateSubject): RpcHttpTransportCredentialsW = RpcHttpTransportCredentialsW(transportCredentialsCtorArg = transportCredentials, flags = flags, authenticationTarget = authenticationTarget, numberOfAuthnSchemes = numberOfAuthnSchemes, authnSchemesCtorArg = authnSchemes, serverCertificateSubjectCtorArg = serverCertificateSubject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcHttpTransportCredentialsW) return false
        if (this.transportCredentials != other.transportCredentials) return false
        if (this.flags != other.flags) return false
        if (this.authenticationTarget != other.authenticationTarget) return false
        if (this.numberOfAuthnSchemes != other.numberOfAuthnSchemes) return false
        if (this.authnSchemes != other.authnSchemes) return false
        if (this.serverCertificateSubject != other.serverCertificateSubject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.transportCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.authenticationTarget.hashCode()
        result = 31 * result + this.numberOfAuthnSchemes.hashCode()
        result = 31 * result + this.authnSchemes.hashCode()
        result = 31 * result + this.serverCertificateSubject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcHttpTransportCredentialsW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RpcHttpTransportCredentialsW =
                    RpcHttpTransportCredentialsW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecWinntAuthIdentityW>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RpcHttpTransportCredentialsW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecWinntAuthIdentityW>(64)
                    ).writeNative(addr, value.transportCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authenticationTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfAuthnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.authnSchemes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.serverCertificateSubject)
                }
            }

        public operator fun invoke(
            transportCredentials: MutPtr<SecWinntAuthIdentityW> = MutPtr(0L),
            flags: RpcCHttpFlags = 0u,
            authenticationTarget: RpcCHttpAuthnTarget = 0u,
            numberOfAuthnSchemes: UInt = 0u,
            authnSchemes: MutPtr<UInt> = MutPtr(0L),
            serverCertificateSubject: MutPtr<UShort> = MutPtr(0L),
        ): RpcHttpTransportCredentialsW =
            RpcHttpTransportCredentialsW(
                transportCredentialsCtorArg = transportCredentials,
                flags = flags,
                authenticationTarget = authenticationTarget,
                numberOfAuthnSchemes = numberOfAuthnSchemes,
                authnSchemesCtorArg = authnSchemes,
                serverCertificateSubjectCtorArg = serverCertificateSubject,
            )
    }
}

public data class RpcIfId(
    public var uuid: Guid = Guid(),
    public var versMajor: UShort = 0u,
    public var versMinor: UShort = 0u,
)

public class RpcIfIdVector internal constructor(
    public var count: UInt,
    ifIdCtorArg: List<MutPtr<RpcIfId>>,
) {
    public var ifId: List<MutPtr<RpcIfId>> = ifIdCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        ifIdCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): List<MutPtr<RpcIfId>> = this.ifId

    public fun copy(count: UInt = this.count, ifId: List<MutPtr<RpcIfId>> = this.ifId): RpcIfIdVector = RpcIfIdVector(count = count, ifIdCtorArg = ifId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcIfIdVector) return false
        if (this.count != other.count) return false
        if (this.ifId != other.ifId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.ifId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcIfIdVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcIfIdVector> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcIfIdVector =
                    RpcIfIdVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<RpcIfId>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcIfIdVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<RpcIfId>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.ifId)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            ifId: List<MutPtr<RpcIfId>> = List(1) { MutPtr(0L) },
        ): RpcIfIdVector =
            RpcIfIdVector(
                count = count,
                ifIdCtorArg = ifId,
            )
    }
}

public class RpcImportContextP internal constructor(
    lookupContextCtorArg: MutPtr<CVoid>,
    proposedHandleCtorArg: MutPtr<CVoid>,
    bindingsCtorArg: MutPtr<RpcBindingVector>,
) {
    public var lookupContext: MutPtr<CVoid> = lookupContextCtorArg
        internal set

    public var proposedHandle: MutPtr<CVoid> = proposedHandleCtorArg
        internal set

    public var bindings: MutPtr<RpcBindingVector> = bindingsCtorArg
        internal set

    public constructor() : this(
        lookupContextCtorArg = MutPtr(0L),
        proposedHandleCtorArg = MutPtr(0L),
        bindingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.lookupContext

    public operator fun component2(): MutPtr<CVoid> = this.proposedHandle

    public operator fun component3(): MutPtr<RpcBindingVector> = this.bindings

    public fun copy(lookupContext: MutPtr<CVoid> = this.lookupContext, proposedHandle: MutPtr<CVoid> = this.proposedHandle, bindings: MutPtr<RpcBindingVector> = this.bindings): RpcImportContextP = RpcImportContextP(lookupContextCtorArg = lookupContext, proposedHandleCtorArg = proposedHandle, bindingsCtorArg = bindings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcImportContextP) return false
        if (this.lookupContext != other.lookupContext) return false
        if (this.proposedHandle != other.proposedHandle) return false
        if (this.bindings != other.bindings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lookupContext.hashCode()
        result = 31 * result + this.proposedHandle.hashCode()
        result = 31 * result + this.bindings.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcImportContextP> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcImportContextP> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RpcImportContextP =
                    RpcImportContextP(
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
                                .mutPtrLayout<RpcBindingVector>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: RpcImportContextP) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.lookupContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.proposedHandle)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RpcBindingVector>(64)
                    ).writeNative(addr + 16L, value.bindings)
                }
            }

        public operator fun invoke(
            lookupContext: MutPtr<CVoid> = MutPtr(0L),
            proposedHandle: MutPtr<CVoid> = MutPtr(0L),
            bindings: MutPtr<RpcBindingVector> = MutPtr(0L),
        ): RpcImportContextP =
            RpcImportContextP(
                lookupContextCtorArg = lookupContext,
                proposedHandleCtorArg = proposedHandle,
                bindingsCtorArg = bindings,
            )
    }
}

public class RpcInterfaceTemplatea internal constructor(
    public var version: UInt,
    ifSpecCtorArg: MutPtr<CVoid>,
    mgrTypeUuidCtorArg: MutPtr<Guid>,
    mgrEpvCtorArg: MutPtr<CVoid>,
    public var flags: UInt,
    public var maxCalls: UInt,
    public var maxRpcSize: UInt,
    public var ifCallback: RpcIfCallbackFn,
    uuidVectorCtorArg: MutPtr<UuidVector>,
    annotationCtorArg: Pstr,
    securityDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var ifSpec: MutPtr<CVoid> = ifSpecCtorArg
        internal set

    public var mgrTypeUuid: MutPtr<Guid> = mgrTypeUuidCtorArg
        internal set

    public var mgrEpv: MutPtr<CVoid> = mgrEpvCtorArg
        internal set

    public var uuidVector: MutPtr<UuidVector> = uuidVectorCtorArg
        internal set

    public var annotation: Pstr = annotationCtorArg
        internal set

    public var securityDescriptor: MutPtr<CVoid> = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        ifSpecCtorArg = MutPtr(0L),
        mgrTypeUuidCtorArg = MutPtr(0L),
        mgrEpvCtorArg = MutPtr(0L),
        flags = 0u,
        maxCalls = 0u,
        maxRpcSize = 0u,
        ifCallback = null,
        uuidVectorCtorArg = MutPtr(0L),
        annotationCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<CVoid> = this.ifSpec

    public operator fun component3(): MutPtr<Guid> = this.mgrTypeUuid

    public operator fun component4(): MutPtr<CVoid> = this.mgrEpv

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): UInt = this.maxCalls

    public operator fun component7(): UInt = this.maxRpcSize

    public operator fun component8(): RpcIfCallbackFn = this.ifCallback

    public operator fun component9(): MutPtr<UuidVector> = this.uuidVector

    public operator fun component10(): Pstr = this.annotation

    public operator fun component11(): MutPtr<CVoid> = this.securityDescriptor

    public fun copy(version: UInt = this.version, ifSpec: MutPtr<CVoid> = this.ifSpec, mgrTypeUuid: MutPtr<Guid> = this.mgrTypeUuid, mgrEpv: MutPtr<CVoid> = this.mgrEpv, flags: UInt = this.flags, maxCalls: UInt = this.maxCalls, maxRpcSize: UInt = this.maxRpcSize, ifCallback: RpcIfCallbackFn = this.ifCallback, uuidVector: MutPtr<UuidVector> = this.uuidVector, annotation: Pstr = this.annotation, securityDescriptor: MutPtr<CVoid> = this.securityDescriptor): RpcInterfaceTemplatea = RpcInterfaceTemplatea(version = version, ifSpecCtorArg = ifSpec, mgrTypeUuidCtorArg = mgrTypeUuid, mgrEpvCtorArg = mgrEpv, flags = flags, maxCalls = maxCalls, maxRpcSize = maxRpcSize, ifCallback = ifCallback, uuidVectorCtorArg = uuidVector, annotationCtorArg = annotation, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcInterfaceTemplatea) return false
        if (this.version != other.version) return false
        if (this.ifSpec != other.ifSpec) return false
        if (this.mgrTypeUuid != other.mgrTypeUuid) return false
        if (this.mgrEpv != other.mgrEpv) return false
        if (this.flags != other.flags) return false
        if (this.maxCalls != other.maxCalls) return false
        if (this.maxRpcSize != other.maxRpcSize) return false
        if (this.ifCallback != other.ifCallback) return false
        if (this.uuidVector != other.uuidVector) return false
        if (this.annotation != other.annotation) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.ifSpec.hashCode()
        result = 31 * result + this.mgrTypeUuid.hashCode()
        result = 31 * result + this.mgrEpv.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxCalls.hashCode()
        result = 31 * result + this.maxRpcSize.hashCode()
        result = 31 * result + this.ifCallback.hashCode()
        result = 31 * result + this.uuidVector.hashCode()
        result = 31 * result + this.annotation.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            ifSpec: MutPtr<CVoid> = MutPtr(0L),
            mgrTypeUuid: MutPtr<Guid> = MutPtr(0L),
            mgrEpv: MutPtr<CVoid> = MutPtr(0L),
            flags: UInt = 0u,
            maxCalls: UInt = 0u,
            maxRpcSize: UInt = 0u,
            ifCallback: RpcIfCallbackFn = null,
            uuidVector: MutPtr<UuidVector> = MutPtr(0L),
            annotation: Pstr = MutPtr(0L),
            securityDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): RpcInterfaceTemplatea =
            RpcInterfaceTemplatea(
                version = version,
                ifSpecCtorArg = ifSpec,
                mgrTypeUuidCtorArg = mgrTypeUuid,
                mgrEpvCtorArg = mgrEpv,
                flags = flags,
                maxCalls = maxCalls,
                maxRpcSize = maxRpcSize,
                ifCallback = ifCallback,
                uuidVectorCtorArg = uuidVector,
                annotationCtorArg = annotation,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public class RpcInterfaceTemplatew internal constructor(
    public var version: UInt,
    ifSpecCtorArg: MutPtr<CVoid>,
    mgrTypeUuidCtorArg: MutPtr<Guid>,
    mgrEpvCtorArg: MutPtr<CVoid>,
    public var flags: UInt,
    public var maxCalls: UInt,
    public var maxRpcSize: UInt,
    public var ifCallback: RpcIfCallbackFn,
    uuidVectorCtorArg: MutPtr<UuidVector>,
    annotationCtorArg: Pwstr,
    securityDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var ifSpec: MutPtr<CVoid> = ifSpecCtorArg
        internal set

    public var mgrTypeUuid: MutPtr<Guid> = mgrTypeUuidCtorArg
        internal set

    public var mgrEpv: MutPtr<CVoid> = mgrEpvCtorArg
        internal set

    public var uuidVector: MutPtr<UuidVector> = uuidVectorCtorArg
        internal set

    public var annotation: Pwstr = annotationCtorArg
        internal set

    public var securityDescriptor: MutPtr<CVoid> = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        ifSpecCtorArg = MutPtr(0L),
        mgrTypeUuidCtorArg = MutPtr(0L),
        mgrEpvCtorArg = MutPtr(0L),
        flags = 0u,
        maxCalls = 0u,
        maxRpcSize = 0u,
        ifCallback = null,
        uuidVectorCtorArg = MutPtr(0L),
        annotationCtorArg = MutPtr(0L),
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<CVoid> = this.ifSpec

    public operator fun component3(): MutPtr<Guid> = this.mgrTypeUuid

    public operator fun component4(): MutPtr<CVoid> = this.mgrEpv

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): UInt = this.maxCalls

    public operator fun component7(): UInt = this.maxRpcSize

    public operator fun component8(): RpcIfCallbackFn = this.ifCallback

    public operator fun component9(): MutPtr<UuidVector> = this.uuidVector

    public operator fun component10(): Pwstr = this.annotation

    public operator fun component11(): MutPtr<CVoid> = this.securityDescriptor

    public fun copy(version: UInt = this.version, ifSpec: MutPtr<CVoid> = this.ifSpec, mgrTypeUuid: MutPtr<Guid> = this.mgrTypeUuid, mgrEpv: MutPtr<CVoid> = this.mgrEpv, flags: UInt = this.flags, maxCalls: UInt = this.maxCalls, maxRpcSize: UInt = this.maxRpcSize, ifCallback: RpcIfCallbackFn = this.ifCallback, uuidVector: MutPtr<UuidVector> = this.uuidVector, annotation: Pwstr = this.annotation, securityDescriptor: MutPtr<CVoid> = this.securityDescriptor): RpcInterfaceTemplatew = RpcInterfaceTemplatew(version = version, ifSpecCtorArg = ifSpec, mgrTypeUuidCtorArg = mgrTypeUuid, mgrEpvCtorArg = mgrEpv, flags = flags, maxCalls = maxCalls, maxRpcSize = maxRpcSize, ifCallback = ifCallback, uuidVectorCtorArg = uuidVector, annotationCtorArg = annotation, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcInterfaceTemplatew) return false
        if (this.version != other.version) return false
        if (this.ifSpec != other.ifSpec) return false
        if (this.mgrTypeUuid != other.mgrTypeUuid) return false
        if (this.mgrEpv != other.mgrEpv) return false
        if (this.flags != other.flags) return false
        if (this.maxCalls != other.maxCalls) return false
        if (this.maxRpcSize != other.maxRpcSize) return false
        if (this.ifCallback != other.ifCallback) return false
        if (this.uuidVector != other.uuidVector) return false
        if (this.annotation != other.annotation) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.ifSpec.hashCode()
        result = 31 * result + this.mgrTypeUuid.hashCode()
        result = 31 * result + this.mgrEpv.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxCalls.hashCode()
        result = 31 * result + this.maxRpcSize.hashCode()
        result = 31 * result + this.ifCallback.hashCode()
        result = 31 * result + this.uuidVector.hashCode()
        result = 31 * result + this.annotation.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            ifSpec: MutPtr<CVoid> = MutPtr(0L),
            mgrTypeUuid: MutPtr<Guid> = MutPtr(0L),
            mgrEpv: MutPtr<CVoid> = MutPtr(0L),
            flags: UInt = 0u,
            maxCalls: UInt = 0u,
            maxRpcSize: UInt = 0u,
            ifCallback: RpcIfCallbackFn = null,
            uuidVector: MutPtr<UuidVector> = MutPtr(0L),
            annotation: Pwstr = MutPtr(0L),
            securityDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): RpcInterfaceTemplatew =
            RpcInterfaceTemplatew(
                version = version,
                ifSpecCtorArg = ifSpec,
                mgrTypeUuidCtorArg = mgrTypeUuid,
                mgrEpvCtorArg = mgrEpv,
                flags = flags,
                maxCalls = maxCalls,
                maxRpcSize = maxRpcSize,
                ifCallback = ifCallback,
                uuidVectorCtorArg = uuidVector,
                annotationCtorArg = annotation,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public class RpcMessage internal constructor(
    handleCtorArg: MutPtr<CVoid>,
    public var dataRepresentation: UInt,
    bufferCtorArg: MutPtr<CVoid>,
    public var bufferLength: UInt,
    public var procNum: UInt,
    transferSyntaxCtorArg: MutPtr<RpcSyntaxIdentifier>,
    rpcInterfaceInformationCtorArg: MutPtr<CVoid>,
    reservedForRuntimeCtorArg: MutPtr<CVoid>,
    managerEpvCtorArg: MutPtr<CVoid>,
    importContextCtorArg: MutPtr<CVoid>,
    public var rpcFlags: UInt,
) {
    public var handle: MutPtr<CVoid> = handleCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public var transferSyntax: MutPtr<RpcSyntaxIdentifier> = transferSyntaxCtorArg
        internal set

    public var rpcInterfaceInformation: MutPtr<CVoid> = rpcInterfaceInformationCtorArg
        internal set

    public var reservedForRuntime: MutPtr<CVoid> = reservedForRuntimeCtorArg
        internal set

    public var managerEpv: MutPtr<CVoid> = managerEpvCtorArg
        internal set

    public var importContext: MutPtr<CVoid> = importContextCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        dataRepresentation = 0u,
        bufferCtorArg = MutPtr(0L),
        bufferLength = 0u,
        procNum = 0u,
        transferSyntaxCtorArg = MutPtr(0L),
        rpcInterfaceInformationCtorArg = MutPtr(0L),
        reservedForRuntimeCtorArg = MutPtr(0L),
        managerEpvCtorArg = MutPtr(0L),
        importContextCtorArg = MutPtr(0L),
        rpcFlags = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.handle

    public operator fun component2(): UInt = this.dataRepresentation

    public operator fun component3(): MutPtr<CVoid> = this.buffer

    public operator fun component4(): UInt = this.bufferLength

    public operator fun component5(): UInt = this.procNum

    public operator fun component6(): MutPtr<RpcSyntaxIdentifier> = this.transferSyntax

    public operator fun component7(): MutPtr<CVoid> = this.rpcInterfaceInformation

    public operator fun component8(): MutPtr<CVoid> = this.reservedForRuntime

    public operator fun component9(): MutPtr<CVoid> = this.managerEpv

    public operator fun component10(): MutPtr<CVoid> = this.importContext

    public operator fun component11(): UInt = this.rpcFlags

    public fun copy(handle: MutPtr<CVoid> = this.handle, dataRepresentation: UInt = this.dataRepresentation, buffer: MutPtr<CVoid> = this.buffer, bufferLength: UInt = this.bufferLength, procNum: UInt = this.procNum, transferSyntax: MutPtr<RpcSyntaxIdentifier> = this.transferSyntax, rpcInterfaceInformation: MutPtr<CVoid> = this.rpcInterfaceInformation, reservedForRuntime: MutPtr<CVoid> = this.reservedForRuntime, managerEpv: MutPtr<CVoid> = this.managerEpv, importContext: MutPtr<CVoid> = this.importContext, rpcFlags: UInt = this.rpcFlags): RpcMessage = RpcMessage(handleCtorArg = handle, dataRepresentation = dataRepresentation, bufferCtorArg = buffer, bufferLength = bufferLength, procNum = procNum, transferSyntaxCtorArg = transferSyntax, rpcInterfaceInformationCtorArg = rpcInterfaceInformation, reservedForRuntimeCtorArg = reservedForRuntime, managerEpvCtorArg = managerEpv, importContextCtorArg = importContext, rpcFlags = rpcFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcMessage) return false
        if (this.handle != other.handle) return false
        if (this.dataRepresentation != other.dataRepresentation) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferLength != other.bufferLength) return false
        if (this.procNum != other.procNum) return false
        if (this.transferSyntax != other.transferSyntax) return false
        if (this.rpcInterfaceInformation != other.rpcInterfaceInformation) return false
        if (this.reservedForRuntime != other.reservedForRuntime) return false
        if (this.managerEpv != other.managerEpv) return false
        if (this.importContext != other.importContext) return false
        if (this.rpcFlags != other.rpcFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.dataRepresentation.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferLength.hashCode()
        result = 31 * result + this.procNum.hashCode()
        result = 31 * result + this.transferSyntax.hashCode()
        result = 31 * result + this.rpcInterfaceInformation.hashCode()
        result = 31 * result + this.reservedForRuntime.hashCode()
        result = 31 * result + this.managerEpv.hashCode()
        result = 31 * result + this.importContext.hashCode()
        result = 31 * result + this.rpcFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcMessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcMessage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): RpcMessage =
                    RpcMessage(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RpcSyntaxIdentifier>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: RpcMessage) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataRepresentation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.procNum)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RpcSyntaxIdentifier>(64)
                    ).writeNative(addr + 32L, value.transferSyntax)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.rpcInterfaceInformation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.reservedForRuntime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.managerEpv)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.importContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.rpcFlags)
                }
            }

        public operator fun invoke(
            handle: MutPtr<CVoid> = MutPtr(0L),
            dataRepresentation: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            bufferLength: UInt = 0u,
            procNum: UInt = 0u,
            transferSyntax: MutPtr<RpcSyntaxIdentifier> = MutPtr(0L),
            rpcInterfaceInformation: MutPtr<CVoid> = MutPtr(0L),
            reservedForRuntime: MutPtr<CVoid> = MutPtr(0L),
            managerEpv: MutPtr<CVoid> = MutPtr(0L),
            importContext: MutPtr<CVoid> = MutPtr(0L),
            rpcFlags: UInt = 0u,
        ): RpcMessage =
            RpcMessage(
                handleCtorArg = handle,
                dataRepresentation = dataRepresentation,
                bufferCtorArg = buffer,
                bufferLength = bufferLength,
                procNum = procNum,
                transferSyntaxCtorArg = transferSyntax,
                rpcInterfaceInformationCtorArg = rpcInterfaceInformation,
                reservedForRuntimeCtorArg = reservedForRuntime,
                managerEpvCtorArg = managerEpv,
                importContextCtorArg = importContext,
                rpcFlags = rpcFlags,
            )
    }
}

public data class RpcPolicy(
    public var length: UInt = 0u,
    public var endpointFlags: UInt = 0u,
    public var nICFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RpcPolicy =
                    RpcPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endpointFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nICFlags)
                }
            }
    }
}

public class RpcProtseqEndpoint internal constructor(
    rpcProtocolSequenceCtorArg: MutPtr<UByte>,
    endpointCtorArg: MutPtr<UByte>,
) {
    public var rpcProtocolSequence: MutPtr<UByte> = rpcProtocolSequenceCtorArg
        internal set

    public var endpoint: MutPtr<UByte> = endpointCtorArg
        internal set

    public constructor() : this(
        rpcProtocolSequenceCtorArg = MutPtr(0L),
        endpointCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UByte> = this.rpcProtocolSequence

    public operator fun component2(): MutPtr<UByte> = this.endpoint

    public fun copy(rpcProtocolSequence: MutPtr<UByte> = this.rpcProtocolSequence, endpoint: MutPtr<UByte> = this.endpoint): RpcProtseqEndpoint = RpcProtseqEndpoint(rpcProtocolSequenceCtorArg = rpcProtocolSequence, endpointCtorArg = endpoint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcProtseqEndpoint) return false
        if (this.rpcProtocolSequence != other.rpcProtocolSequence) return false
        if (this.endpoint != other.endpoint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rpcProtocolSequence.hashCode()
        result = 31 * result + this.endpoint.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcProtseqEndpoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcProtseqEndpoint> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcProtseqEndpoint =
                    RpcProtseqEndpoint(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcProtseqEndpoint) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.rpcProtocolSequence)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.endpoint)
                }
            }

        public operator fun invoke(
            rpcProtocolSequence: MutPtr<UByte> = MutPtr(0L),
            endpoint: MutPtr<UByte> = MutPtr(0L),
        ): RpcProtseqEndpoint =
            RpcProtseqEndpoint(
                rpcProtocolSequenceCtorArg = rpcProtocolSequence,
                endpointCtorArg = endpoint,
            )
    }
}

public class RpcProtseqVectora internal constructor(
    public var count: UInt,
    protseqCtorArg: List<MutPtr<UByte>>,
) {
    public var protseq: List<MutPtr<UByte>> = protseqCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        protseqCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): List<MutPtr<UByte>> = this.protseq

    public fun copy(count: UInt = this.count, protseq: List<MutPtr<UByte>> = this.protseq): RpcProtseqVectora = RpcProtseqVectora(count = count, protseqCtorArg = protseq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcProtseqVectora) return false
        if (this.count != other.count) return false
        if (this.protseq != other.protseq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.protseq.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcProtseqVectora> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcProtseqVectora> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcProtseqVectora =
                    RpcProtseqVectora(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<UByte>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcProtseqVectora) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<UByte>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.protseq)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            protseq: List<MutPtr<UByte>> = List(1) { MutPtr(0L) },
        ): RpcProtseqVectora =
            RpcProtseqVectora(
                count = count,
                protseqCtorArg = protseq,
            )
    }
}

public class RpcProtseqVectorw internal constructor(
    public var count: UInt,
    protseqCtorArg: List<MutPtr<UShort>>,
) {
    public var protseq: List<MutPtr<UShort>> = protseqCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        protseqCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): List<MutPtr<UShort>> = this.protseq

    public fun copy(count: UInt = this.count, protseq: List<MutPtr<UShort>> = this.protseq): RpcProtseqVectorw = RpcProtseqVectorw(count = count, protseqCtorArg = protseq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcProtseqVectorw) return false
        if (this.count != other.count) return false
        if (this.protseq != other.protseq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.protseq.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcProtseqVectorw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcProtseqVectorw> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcProtseqVectorw =
                    RpcProtseqVectorw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<UShort>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcProtseqVectorw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<UShort>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.protseq)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            protseq: List<MutPtr<UShort>> = List(1) { MutPtr(0L) },
        ): RpcProtseqVectorw =
            RpcProtseqVectorw(
                count = count,
                protseqCtorArg = protseq,
            )
    }
}

public data class RpcSecurityQos(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcSecurityQos> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcSecurityQos> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RpcSecurityQos =
                    RpcSecurityQos(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RpcSecurityQos) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.identityTracking)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.impersonationType)
                }
            }
    }
}

public data class RpcSecurityQosV2A(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV2A0 = RpcSecurityQosV2A0(),
)

public class RpcSecurityQosV2A0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsA>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials): RpcSecurityQosV2A0 = RpcSecurityQosV2A0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV2A0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = MutPtr(0L),
        ): RpcSecurityQosV2A0 =
            RpcSecurityQosV2A0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public data class RpcSecurityQosV2W(
    public var version: UInt = 0u,
    public var capabilities: RpcCQosCapabilities = 0u,
    public var identityTracking: RpcCQosIdentity = 0u,
    public var impersonationType: RpcCImpLevel = 0u,
    public var additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
    public var u: RpcSecurityQosV2W0 = RpcSecurityQosV2W0(),
)

public class RpcSecurityQosV2W0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsW>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials): RpcSecurityQosV2W0 = RpcSecurityQosV2W0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV2W0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = MutPtr(0L),
        ): RpcSecurityQosV2W0 =
            RpcSecurityQosV2W0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public class RpcSecurityQosV3A internal constructor(
    public var version: UInt,
    public var capabilities: RpcCQosCapabilities,
    public var identityTracking: RpcCQosIdentity,
    public var impersonationType: RpcCImpLevel,
    public var additionalSecurityInfoType: RpcCAuthnInfoType,
    public var u: RpcSecurityQosV3A0,
    sidCtorArg: MutPtr<CVoid>,
) {
    public var sid: MutPtr<CVoid> = sidCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        capabilities = 0u,
        identityTracking = 0u,
        impersonationType = 0u,
        additionalSecurityInfoType = 0u,
        u = RpcSecurityQosV3A0(),
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): RpcCQosCapabilities = this.capabilities

    public operator fun component3(): RpcCQosIdentity = this.identityTracking

    public operator fun component4(): RpcCImpLevel = this.impersonationType

    public operator fun component5(): RpcCAuthnInfoType = this.additionalSecurityInfoType

    public operator fun component6(): RpcSecurityQosV3A0 = this.u

    public operator fun component7(): MutPtr<CVoid> = this.sid

    public fun copy(version: UInt = this.version, capabilities: RpcCQosCapabilities = this.capabilities, identityTracking: RpcCQosIdentity = this.identityTracking, impersonationType: RpcCImpLevel = this.impersonationType, additionalSecurityInfoType: RpcCAuthnInfoType = this.additionalSecurityInfoType, u: RpcSecurityQosV3A0 = this.u, sid: MutPtr<CVoid> = this.sid): RpcSecurityQosV3A = RpcSecurityQosV3A(version = version, capabilities = capabilities, identityTracking = identityTracking, impersonationType = impersonationType, additionalSecurityInfoType = additionalSecurityInfoType, u = u, sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV3A) return false
        if (this.version != other.version) return false
        if (this.capabilities != other.capabilities) return false
        if (this.identityTracking != other.identityTracking) return false
        if (this.impersonationType != other.impersonationType) return false
        if (this.additionalSecurityInfoType != other.additionalSecurityInfoType) return false
        if (this.u != other.u) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.identityTracking.hashCode()
        result = 31 * result + this.impersonationType.hashCode()
        result = 31 * result + this.additionalSecurityInfoType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.sid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            capabilities: RpcCQosCapabilities = 0u,
            identityTracking: RpcCQosIdentity = 0u,
            impersonationType: RpcCImpLevel = 0u,
            additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
            u: RpcSecurityQosV3A0 = RpcSecurityQosV3A0(),
            sid: MutPtr<CVoid> = MutPtr(0L),
        ): RpcSecurityQosV3A =
            RpcSecurityQosV3A(
                version = version,
                capabilities = capabilities,
                identityTracking = identityTracking,
                impersonationType = impersonationType,
                additionalSecurityInfoType = additionalSecurityInfoType,
                u = u,
                sidCtorArg = sid,
            )
    }
}

public class RpcSecurityQosV3A0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsA>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials): RpcSecurityQosV3A0 = RpcSecurityQosV3A0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV3A0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = MutPtr(0L),
        ): RpcSecurityQosV3A0 =
            RpcSecurityQosV3A0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public class RpcSecurityQosV3W internal constructor(
    public var version: UInt,
    public var capabilities: RpcCQosCapabilities,
    public var identityTracking: RpcCQosIdentity,
    public var impersonationType: RpcCImpLevel,
    public var additionalSecurityInfoType: RpcCAuthnInfoType,
    public var u: RpcSecurityQosV3W0,
    sidCtorArg: MutPtr<CVoid>,
) {
    public var sid: MutPtr<CVoid> = sidCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        capabilities = 0u,
        identityTracking = 0u,
        impersonationType = 0u,
        additionalSecurityInfoType = 0u,
        u = RpcSecurityQosV3W0(),
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): RpcCQosCapabilities = this.capabilities

    public operator fun component3(): RpcCQosIdentity = this.identityTracking

    public operator fun component4(): RpcCImpLevel = this.impersonationType

    public operator fun component5(): RpcCAuthnInfoType = this.additionalSecurityInfoType

    public operator fun component6(): RpcSecurityQosV3W0 = this.u

    public operator fun component7(): MutPtr<CVoid> = this.sid

    public fun copy(version: UInt = this.version, capabilities: RpcCQosCapabilities = this.capabilities, identityTracking: RpcCQosIdentity = this.identityTracking, impersonationType: RpcCImpLevel = this.impersonationType, additionalSecurityInfoType: RpcCAuthnInfoType = this.additionalSecurityInfoType, u: RpcSecurityQosV3W0 = this.u, sid: MutPtr<CVoid> = this.sid): RpcSecurityQosV3W = RpcSecurityQosV3W(version = version, capabilities = capabilities, identityTracking = identityTracking, impersonationType = impersonationType, additionalSecurityInfoType = additionalSecurityInfoType, u = u, sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV3W) return false
        if (this.version != other.version) return false
        if (this.capabilities != other.capabilities) return false
        if (this.identityTracking != other.identityTracking) return false
        if (this.impersonationType != other.impersonationType) return false
        if (this.additionalSecurityInfoType != other.additionalSecurityInfoType) return false
        if (this.u != other.u) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.identityTracking.hashCode()
        result = 31 * result + this.impersonationType.hashCode()
        result = 31 * result + this.additionalSecurityInfoType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.sid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            capabilities: RpcCQosCapabilities = 0u,
            identityTracking: RpcCQosIdentity = 0u,
            impersonationType: RpcCImpLevel = 0u,
            additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
            u: RpcSecurityQosV3W0 = RpcSecurityQosV3W0(),
            sid: MutPtr<CVoid> = MutPtr(0L),
        ): RpcSecurityQosV3W =
            RpcSecurityQosV3W(
                version = version,
                capabilities = capabilities,
                identityTracking = identityTracking,
                impersonationType = impersonationType,
                additionalSecurityInfoType = additionalSecurityInfoType,
                u = u,
                sidCtorArg = sid,
            )
    }
}

public class RpcSecurityQosV3W0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsW>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials): RpcSecurityQosV3W0 = RpcSecurityQosV3W0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV3W0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = MutPtr(0L),
        ): RpcSecurityQosV3W0 =
            RpcSecurityQosV3W0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public class RpcSecurityQosV4A internal constructor(
    public var version: UInt,
    public var capabilities: RpcCQosCapabilities,
    public var identityTracking: RpcCQosIdentity,
    public var impersonationType: RpcCImpLevel,
    public var additionalSecurityInfoType: RpcCAuthnInfoType,
    public var u: RpcSecurityQosV4A0,
    sidCtorArg: MutPtr<CVoid>,
    public var effectiveOnly: UInt,
) {
    public var sid: MutPtr<CVoid> = sidCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        capabilities = 0u,
        identityTracking = 0u,
        impersonationType = 0u,
        additionalSecurityInfoType = 0u,
        u = RpcSecurityQosV4A0(),
        sidCtorArg = MutPtr(0L),
        effectiveOnly = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): RpcCQosCapabilities = this.capabilities

    public operator fun component3(): RpcCQosIdentity = this.identityTracking

    public operator fun component4(): RpcCImpLevel = this.impersonationType

    public operator fun component5(): RpcCAuthnInfoType = this.additionalSecurityInfoType

    public operator fun component6(): RpcSecurityQosV4A0 = this.u

    public operator fun component7(): MutPtr<CVoid> = this.sid

    public operator fun component8(): UInt = this.effectiveOnly

    public fun copy(version: UInt = this.version, capabilities: RpcCQosCapabilities = this.capabilities, identityTracking: RpcCQosIdentity = this.identityTracking, impersonationType: RpcCImpLevel = this.impersonationType, additionalSecurityInfoType: RpcCAuthnInfoType = this.additionalSecurityInfoType, u: RpcSecurityQosV4A0 = this.u, sid: MutPtr<CVoid> = this.sid, effectiveOnly: UInt = this.effectiveOnly): RpcSecurityQosV4A = RpcSecurityQosV4A(version = version, capabilities = capabilities, identityTracking = identityTracking, impersonationType = impersonationType, additionalSecurityInfoType = additionalSecurityInfoType, u = u, sidCtorArg = sid, effectiveOnly = effectiveOnly)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV4A) return false
        if (this.version != other.version) return false
        if (this.capabilities != other.capabilities) return false
        if (this.identityTracking != other.identityTracking) return false
        if (this.impersonationType != other.impersonationType) return false
        if (this.additionalSecurityInfoType != other.additionalSecurityInfoType) return false
        if (this.u != other.u) return false
        if (this.sid != other.sid) return false
        if (this.effectiveOnly != other.effectiveOnly) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.identityTracking.hashCode()
        result = 31 * result + this.impersonationType.hashCode()
        result = 31 * result + this.additionalSecurityInfoType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.effectiveOnly.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            capabilities: RpcCQosCapabilities = 0u,
            identityTracking: RpcCQosIdentity = 0u,
            impersonationType: RpcCImpLevel = 0u,
            additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
            u: RpcSecurityQosV4A0 = RpcSecurityQosV4A0(),
            sid: MutPtr<CVoid> = MutPtr(0L),
            effectiveOnly: UInt = 0u,
        ): RpcSecurityQosV4A =
            RpcSecurityQosV4A(
                version = version,
                capabilities = capabilities,
                identityTracking = identityTracking,
                impersonationType = impersonationType,
                additionalSecurityInfoType = additionalSecurityInfoType,
                u = u,
                sidCtorArg = sid,
                effectiveOnly = effectiveOnly,
            )
    }
}

public class RpcSecurityQosV4A0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsA>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials): RpcSecurityQosV4A0 = RpcSecurityQosV4A0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV4A0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = MutPtr(0L),
        ): RpcSecurityQosV4A0 =
            RpcSecurityQosV4A0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public class RpcSecurityQosV4W internal constructor(
    public var version: UInt,
    public var capabilities: RpcCQosCapabilities,
    public var identityTracking: RpcCQosIdentity,
    public var impersonationType: RpcCImpLevel,
    public var additionalSecurityInfoType: RpcCAuthnInfoType,
    public var u: RpcSecurityQosV4W0,
    sidCtorArg: MutPtr<CVoid>,
    public var effectiveOnly: UInt,
) {
    public var sid: MutPtr<CVoid> = sidCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        capabilities = 0u,
        identityTracking = 0u,
        impersonationType = 0u,
        additionalSecurityInfoType = 0u,
        u = RpcSecurityQosV4W0(),
        sidCtorArg = MutPtr(0L),
        effectiveOnly = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): RpcCQosCapabilities = this.capabilities

    public operator fun component3(): RpcCQosIdentity = this.identityTracking

    public operator fun component4(): RpcCImpLevel = this.impersonationType

    public operator fun component5(): RpcCAuthnInfoType = this.additionalSecurityInfoType

    public operator fun component6(): RpcSecurityQosV4W0 = this.u

    public operator fun component7(): MutPtr<CVoid> = this.sid

    public operator fun component8(): UInt = this.effectiveOnly

    public fun copy(version: UInt = this.version, capabilities: RpcCQosCapabilities = this.capabilities, identityTracking: RpcCQosIdentity = this.identityTracking, impersonationType: RpcCImpLevel = this.impersonationType, additionalSecurityInfoType: RpcCAuthnInfoType = this.additionalSecurityInfoType, u: RpcSecurityQosV4W0 = this.u, sid: MutPtr<CVoid> = this.sid, effectiveOnly: UInt = this.effectiveOnly): RpcSecurityQosV4W = RpcSecurityQosV4W(version = version, capabilities = capabilities, identityTracking = identityTracking, impersonationType = impersonationType, additionalSecurityInfoType = additionalSecurityInfoType, u = u, sidCtorArg = sid, effectiveOnly = effectiveOnly)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV4W) return false
        if (this.version != other.version) return false
        if (this.capabilities != other.capabilities) return false
        if (this.identityTracking != other.identityTracking) return false
        if (this.impersonationType != other.impersonationType) return false
        if (this.additionalSecurityInfoType != other.additionalSecurityInfoType) return false
        if (this.u != other.u) return false
        if (this.sid != other.sid) return false
        if (this.effectiveOnly != other.effectiveOnly) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.identityTracking.hashCode()
        result = 31 * result + this.impersonationType.hashCode()
        result = 31 * result + this.additionalSecurityInfoType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.effectiveOnly.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            capabilities: RpcCQosCapabilities = 0u,
            identityTracking: RpcCQosIdentity = 0u,
            impersonationType: RpcCImpLevel = 0u,
            additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
            u: RpcSecurityQosV4W0 = RpcSecurityQosV4W0(),
            sid: MutPtr<CVoid> = MutPtr(0L),
            effectiveOnly: UInt = 0u,
        ): RpcSecurityQosV4W =
            RpcSecurityQosV4W(
                version = version,
                capabilities = capabilities,
                identityTracking = identityTracking,
                impersonationType = impersonationType,
                additionalSecurityInfoType = additionalSecurityInfoType,
                u = u,
                sidCtorArg = sid,
                effectiveOnly = effectiveOnly,
            )
    }
}

public class RpcSecurityQosV4W0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsW>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials): RpcSecurityQosV4W0 = RpcSecurityQosV4W0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV4W0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = MutPtr(0L),
        ): RpcSecurityQosV4W0 =
            RpcSecurityQosV4W0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public class RpcSecurityQosV5A internal constructor(
    public var version: UInt,
    public var capabilities: RpcCQosCapabilities,
    public var identityTracking: RpcCQosIdentity,
    public var impersonationType: RpcCImpLevel,
    public var additionalSecurityInfoType: RpcCAuthnInfoType,
    public var u: RpcSecurityQosV5A0,
    sidCtorArg: MutPtr<CVoid>,
    public var effectiveOnly: UInt,
    serverSecurityDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var sid: MutPtr<CVoid> = sidCtorArg
        internal set

    public var serverSecurityDescriptor: MutPtr<CVoid> = serverSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        capabilities = 0u,
        identityTracking = 0u,
        impersonationType = 0u,
        additionalSecurityInfoType = 0u,
        u = RpcSecurityQosV5A0(),
        sidCtorArg = MutPtr(0L),
        effectiveOnly = 0u,
        serverSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): RpcCQosCapabilities = this.capabilities

    public operator fun component3(): RpcCQosIdentity = this.identityTracking

    public operator fun component4(): RpcCImpLevel = this.impersonationType

    public operator fun component5(): RpcCAuthnInfoType = this.additionalSecurityInfoType

    public operator fun component6(): RpcSecurityQosV5A0 = this.u

    public operator fun component7(): MutPtr<CVoid> = this.sid

    public operator fun component8(): UInt = this.effectiveOnly

    public operator fun component9(): MutPtr<CVoid> = this.serverSecurityDescriptor

    public fun copy(version: UInt = this.version, capabilities: RpcCQosCapabilities = this.capabilities, identityTracking: RpcCQosIdentity = this.identityTracking, impersonationType: RpcCImpLevel = this.impersonationType, additionalSecurityInfoType: RpcCAuthnInfoType = this.additionalSecurityInfoType, u: RpcSecurityQosV5A0 = this.u, sid: MutPtr<CVoid> = this.sid, effectiveOnly: UInt = this.effectiveOnly, serverSecurityDescriptor: MutPtr<CVoid> = this.serverSecurityDescriptor): RpcSecurityQosV5A = RpcSecurityQosV5A(version = version, capabilities = capabilities, identityTracking = identityTracking, impersonationType = impersonationType, additionalSecurityInfoType = additionalSecurityInfoType, u = u, sidCtorArg = sid, effectiveOnly = effectiveOnly, serverSecurityDescriptorCtorArg = serverSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV5A) return false
        if (this.version != other.version) return false
        if (this.capabilities != other.capabilities) return false
        if (this.identityTracking != other.identityTracking) return false
        if (this.impersonationType != other.impersonationType) return false
        if (this.additionalSecurityInfoType != other.additionalSecurityInfoType) return false
        if (this.u != other.u) return false
        if (this.sid != other.sid) return false
        if (this.effectiveOnly != other.effectiveOnly) return false
        if (this.serverSecurityDescriptor != other.serverSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.identityTracking.hashCode()
        result = 31 * result + this.impersonationType.hashCode()
        result = 31 * result + this.additionalSecurityInfoType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.effectiveOnly.hashCode()
        result = 31 * result + this.serverSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            capabilities: RpcCQosCapabilities = 0u,
            identityTracking: RpcCQosIdentity = 0u,
            impersonationType: RpcCImpLevel = 0u,
            additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
            u: RpcSecurityQosV5A0 = RpcSecurityQosV5A0(),
            sid: MutPtr<CVoid> = MutPtr(0L),
            effectiveOnly: UInt = 0u,
            serverSecurityDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): RpcSecurityQosV5A =
            RpcSecurityQosV5A(
                version = version,
                capabilities = capabilities,
                identityTracking = identityTracking,
                impersonationType = impersonationType,
                additionalSecurityInfoType = additionalSecurityInfoType,
                u = u,
                sidCtorArg = sid,
                effectiveOnly = effectiveOnly,
                serverSecurityDescriptorCtorArg = serverSecurityDescriptor,
            )
    }
}

public class RpcSecurityQosV5A0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsA>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = this.httpCredentials): RpcSecurityQosV5A0 = RpcSecurityQosV5A0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV5A0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsA> = MutPtr(0L),
        ): RpcSecurityQosV5A0 =
            RpcSecurityQosV5A0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public class RpcSecurityQosV5W internal constructor(
    public var version: UInt,
    public var capabilities: RpcCQosCapabilities,
    public var identityTracking: RpcCQosIdentity,
    public var impersonationType: RpcCImpLevel,
    public var additionalSecurityInfoType: RpcCAuthnInfoType,
    public var u: RpcSecurityQosV5W0,
    sidCtorArg: MutPtr<CVoid>,
    public var effectiveOnly: UInt,
    serverSecurityDescriptorCtorArg: MutPtr<CVoid>,
) {
    public var sid: MutPtr<CVoid> = sidCtorArg
        internal set

    public var serverSecurityDescriptor: MutPtr<CVoid> = serverSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        capabilities = 0u,
        identityTracking = 0u,
        impersonationType = 0u,
        additionalSecurityInfoType = 0u,
        u = RpcSecurityQosV5W0(),
        sidCtorArg = MutPtr(0L),
        effectiveOnly = 0u,
        serverSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): RpcCQosCapabilities = this.capabilities

    public operator fun component3(): RpcCQosIdentity = this.identityTracking

    public operator fun component4(): RpcCImpLevel = this.impersonationType

    public operator fun component5(): RpcCAuthnInfoType = this.additionalSecurityInfoType

    public operator fun component6(): RpcSecurityQosV5W0 = this.u

    public operator fun component7(): MutPtr<CVoid> = this.sid

    public operator fun component8(): UInt = this.effectiveOnly

    public operator fun component9(): MutPtr<CVoid> = this.serverSecurityDescriptor

    public fun copy(version: UInt = this.version, capabilities: RpcCQosCapabilities = this.capabilities, identityTracking: RpcCQosIdentity = this.identityTracking, impersonationType: RpcCImpLevel = this.impersonationType, additionalSecurityInfoType: RpcCAuthnInfoType = this.additionalSecurityInfoType, u: RpcSecurityQosV5W0 = this.u, sid: MutPtr<CVoid> = this.sid, effectiveOnly: UInt = this.effectiveOnly, serverSecurityDescriptor: MutPtr<CVoid> = this.serverSecurityDescriptor): RpcSecurityQosV5W = RpcSecurityQosV5W(version = version, capabilities = capabilities, identityTracking = identityTracking, impersonationType = impersonationType, additionalSecurityInfoType = additionalSecurityInfoType, u = u, sidCtorArg = sid, effectiveOnly = effectiveOnly, serverSecurityDescriptorCtorArg = serverSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV5W) return false
        if (this.version != other.version) return false
        if (this.capabilities != other.capabilities) return false
        if (this.identityTracking != other.identityTracking) return false
        if (this.impersonationType != other.impersonationType) return false
        if (this.additionalSecurityInfoType != other.additionalSecurityInfoType) return false
        if (this.u != other.u) return false
        if (this.sid != other.sid) return false
        if (this.effectiveOnly != other.effectiveOnly) return false
        if (this.serverSecurityDescriptor != other.serverSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.identityTracking.hashCode()
        result = 31 * result + this.impersonationType.hashCode()
        result = 31 * result + this.additionalSecurityInfoType.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.effectiveOnly.hashCode()
        result = 31 * result + this.serverSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            capabilities: RpcCQosCapabilities = 0u,
            identityTracking: RpcCQosIdentity = 0u,
            impersonationType: RpcCImpLevel = 0u,
            additionalSecurityInfoType: RpcCAuthnInfoType = 0u,
            u: RpcSecurityQosV5W0 = RpcSecurityQosV5W0(),
            sid: MutPtr<CVoid> = MutPtr(0L),
            effectiveOnly: UInt = 0u,
            serverSecurityDescriptor: MutPtr<CVoid> = MutPtr(0L),
        ): RpcSecurityQosV5W =
            RpcSecurityQosV5W(
                version = version,
                capabilities = capabilities,
                identityTracking = identityTracking,
                impersonationType = impersonationType,
                additionalSecurityInfoType = additionalSecurityInfoType,
                u = u,
                sidCtorArg = sid,
                effectiveOnly = effectiveOnly,
                serverSecurityDescriptorCtorArg = serverSecurityDescriptor,
            )
    }
}

public class RpcSecurityQosV5W0 internal constructor(
    httpCredentialsCtorArg: MutPtr<RpcHttpTransportCredentialsW>,
) {
    public var httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = httpCredentialsCtorArg
        internal set

    public constructor() : this(
        httpCredentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials

    public fun copy(httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = this.httpCredentials): RpcSecurityQosV5W0 = RpcSecurityQosV5W0(httpCredentialsCtorArg = httpCredentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcSecurityQosV5W0) return false
        if (this.httpCredentials != other.httpCredentials) return false
        return true
    }

    override fun hashCode(): Int = this.httpCredentials.hashCode()

    public companion object {
        public operator fun invoke(
            httpCredentials: MutPtr<RpcHttpTransportCredentialsW> = MutPtr(0L),
        ): RpcSecurityQosV5W0 =
            RpcSecurityQosV5W0(
                httpCredentialsCtorArg = httpCredentials,
            )
    }
}

public data class RpcSecContextKeyInfo(
    public var encryptAlgorithm: UInt = 0u,
    public var keySize: UInt = 0u,
    public var signatureAlgorithm: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcSecContextKeyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcSecContextKeyInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RpcSecContextKeyInfo =
                    RpcSecContextKeyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RpcSecContextKeyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encryptAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.signatureAlgorithm)
                }
            }
    }
}

public class RpcServerInterface internal constructor(
    public var length: UInt,
    public var interfaceId: RpcSyntaxIdentifier,
    public var transferSyntax: RpcSyntaxIdentifier,
    dispatchTableCtorArg: MutPtr<RpcDispatchTable>,
    public var rpcProtseqEndpointCount: UInt,
    rpcProtseqEndpointCtorArg: MutPtr<RpcProtseqEndpoint>,
    defaultManagerEpvCtorArg: MutPtr<CVoid>,
    interpreterInfoCtorArg: ConstPtr<CVoid>,
    public var flags: UInt,
) {
    public var dispatchTable: MutPtr<RpcDispatchTable> = dispatchTableCtorArg
        internal set

    public var rpcProtseqEndpoint: MutPtr<RpcProtseqEndpoint> = rpcProtseqEndpointCtorArg
        internal set

    public var defaultManagerEpv: MutPtr<CVoid> = defaultManagerEpvCtorArg
        internal set

    public var interpreterInfo: ConstPtr<CVoid> = interpreterInfoCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        interfaceId = RpcSyntaxIdentifier(),
        transferSyntax = RpcSyntaxIdentifier(),
        dispatchTableCtorArg = MutPtr(0L),
        rpcProtseqEndpointCount = 0u,
        rpcProtseqEndpointCtorArg = MutPtr(0L),
        defaultManagerEpvCtorArg = MutPtr(0L),
        interpreterInfoCtorArg = ConstPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): RpcSyntaxIdentifier = this.interfaceId

    public operator fun component3(): RpcSyntaxIdentifier = this.transferSyntax

    public operator fun component4(): MutPtr<RpcDispatchTable> = this.dispatchTable

    public operator fun component5(): UInt = this.rpcProtseqEndpointCount

    public operator fun component6(): MutPtr<RpcProtseqEndpoint> = this.rpcProtseqEndpoint

    public operator fun component7(): MutPtr<CVoid> = this.defaultManagerEpv

    public operator fun component8(): ConstPtr<CVoid> = this.interpreterInfo

    public operator fun component9(): UInt = this.flags

    public fun copy(length: UInt = this.length, interfaceId: RpcSyntaxIdentifier = this.interfaceId, transferSyntax: RpcSyntaxIdentifier = this.transferSyntax, dispatchTable: MutPtr<RpcDispatchTable> = this.dispatchTable, rpcProtseqEndpointCount: UInt = this.rpcProtseqEndpointCount, rpcProtseqEndpoint: MutPtr<RpcProtseqEndpoint> = this.rpcProtseqEndpoint, defaultManagerEpv: MutPtr<CVoid> = this.defaultManagerEpv, interpreterInfo: ConstPtr<CVoid> = this.interpreterInfo, flags: UInt = this.flags): RpcServerInterface = RpcServerInterface(length = length, interfaceId = interfaceId, transferSyntax = transferSyntax, dispatchTableCtorArg = dispatchTable, rpcProtseqEndpointCount = rpcProtseqEndpointCount, rpcProtseqEndpointCtorArg = rpcProtseqEndpoint, defaultManagerEpvCtorArg = defaultManagerEpv, interpreterInfoCtorArg = interpreterInfo, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcServerInterface) return false
        if (this.length != other.length) return false
        if (this.interfaceId != other.interfaceId) return false
        if (this.transferSyntax != other.transferSyntax) return false
        if (this.dispatchTable != other.dispatchTable) return false
        if (this.rpcProtseqEndpointCount != other.rpcProtseqEndpointCount) return false
        if (this.rpcProtseqEndpoint != other.rpcProtseqEndpoint) return false
        if (this.defaultManagerEpv != other.defaultManagerEpv) return false
        if (this.interpreterInfo != other.interpreterInfo) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.interfaceId.hashCode()
        result = 31 * result + this.transferSyntax.hashCode()
        result = 31 * result + this.dispatchTable.hashCode()
        result = 31 * result + this.rpcProtseqEndpointCount.hashCode()
        result = 31 * result + this.rpcProtseqEndpoint.hashCode()
        result = 31 * result + this.defaultManagerEpv.hashCode()
        result = 31 * result + this.interpreterInfo.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            interfaceId: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
            transferSyntax: RpcSyntaxIdentifier = RpcSyntaxIdentifier(),
            dispatchTable: MutPtr<RpcDispatchTable> = MutPtr(0L),
            rpcProtseqEndpointCount: UInt = 0u,
            rpcProtseqEndpoint: MutPtr<RpcProtseqEndpoint> = MutPtr(0L),
            defaultManagerEpv: MutPtr<CVoid> = MutPtr(0L),
            interpreterInfo: ConstPtr<CVoid> = ConstPtr(0L),
            flags: UInt = 0u,
        ): RpcServerInterface =
            RpcServerInterface(
                length = length,
                interfaceId = interfaceId,
                transferSyntax = transferSyntax,
                dispatchTableCtorArg = dispatchTable,
                rpcProtseqEndpointCount = rpcProtseqEndpointCount,
                rpcProtseqEndpointCtorArg = rpcProtseqEndpoint,
                defaultManagerEpvCtorArg = defaultManagerEpv,
                interpreterInfoCtorArg = interpreterInfo,
                flags = flags,
            )
    }
}

public data class RpcStatsVector(
    public var count: UInt = 0u,
    public var stats: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RpcStatsVector) return false
        if (this.count != other.count) return false
        if (!this.stats.contentEquals(other.stats)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.stats.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcStatsVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcStatsVector> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RpcStatsVector =
                    RpcStatsVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: RpcStatsVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.stats.toList())
                }
            }
    }
}

public data class RpcSyntaxIdentifier(
    public var syntaxGUID: Guid = Guid(),
    public var syntaxVersion: RpcVersion = RpcVersion(),
)

public data class RpcTransferSyntax(
    public var uuid: Guid = Guid(),
    public var versMajor: UShort = 0u,
    public var versMinor: UShort = 0u,
)

public data class RpcVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RpcVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RpcVersion =
                    RpcVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: RpcVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                }
            }
    }
}

public class ScontextQueue internal constructor(
    public var numberOfObjects: UInt,
    arrayOfObjectsCtorArg: MutPtr<MutPtr<NdrScontext>>,
) {
    public var arrayOfObjects: MutPtr<MutPtr<NdrScontext>> = arrayOfObjectsCtorArg
        internal set

    public constructor() : this(
        numberOfObjects = 0u,
        arrayOfObjectsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numberOfObjects

    public operator fun component2(): MutPtr<MutPtr<NdrScontext>> = this.arrayOfObjects

    public fun copy(numberOfObjects: UInt = this.numberOfObjects, arrayOfObjects: MutPtr<MutPtr<NdrScontext>> = this.arrayOfObjects): ScontextQueue = ScontextQueue(numberOfObjects = numberOfObjects, arrayOfObjectsCtorArg = arrayOfObjects)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScontextQueue) return false
        if (this.numberOfObjects != other.numberOfObjects) return false
        if (this.arrayOfObjects != other.arrayOfObjects) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfObjects.hashCode()
        result = 31 * result + this.arrayOfObjects.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScontextQueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScontextQueue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScontextQueue =
                    ScontextQueue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<NdrScontext>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScontextQueue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfObjects)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<NdrScontext>>(64)
                    ).writeNative(addr + 8L, value.arrayOfObjects)
                }
            }

        public operator fun invoke(
            numberOfObjects: UInt = 0u,
            arrayOfObjects: MutPtr<MutPtr<NdrScontext>> = MutPtr(0L),
        ): ScontextQueue =
            ScontextQueue(
                numberOfObjects = numberOfObjects,
                arrayOfObjectsCtorArg = arrayOfObjects,
            )
    }
}

public class SecWinntAuthIdentityA internal constructor(
    userCtorArg: MutPtr<UByte>,
    public var userLength: UInt,
    domainCtorArg: MutPtr<UByte>,
    public var domainLength: UInt,
    passwordCtorArg: MutPtr<UByte>,
    public var passwordLength: UInt,
    public var flags: SecWinntAuthIdentity,
) {
    public var user: MutPtr<UByte> = userCtorArg
        internal set

    public var domain: MutPtr<UByte> = domainCtorArg
        internal set

    public var password: MutPtr<UByte> = passwordCtorArg
        internal set

    public constructor() : this(
        userCtorArg = MutPtr(0L),
        userLength = 0u,
        domainCtorArg = MutPtr(0L),
        domainLength = 0u,
        passwordCtorArg = MutPtr(0L),
        passwordLength = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.user

    public operator fun component2(): UInt = this.userLength

    public operator fun component3(): MutPtr<UByte> = this.domain

    public operator fun component4(): UInt = this.domainLength

    public operator fun component5(): MutPtr<UByte> = this.password

    public operator fun component6(): UInt = this.passwordLength

    public operator fun component7(): SecWinntAuthIdentity = this.flags

    public fun copy(user: MutPtr<UByte> = this.user, userLength: UInt = this.userLength, domain: MutPtr<UByte> = this.domain, domainLength: UInt = this.domainLength, password: MutPtr<UByte> = this.password, passwordLength: UInt = this.passwordLength, flags: SecWinntAuthIdentity = this.flags): SecWinntAuthIdentityA = SecWinntAuthIdentityA(userCtorArg = user, userLength = userLength, domainCtorArg = domain, domainLength = domainLength, passwordCtorArg = password, passwordLength = passwordLength, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecWinntAuthIdentityA) return false
        if (this.user != other.user) return false
        if (this.userLength != other.userLength) return false
        if (this.domain != other.domain) return false
        if (this.domainLength != other.domainLength) return false
        if (this.password != other.password) return false
        if (this.passwordLength != other.passwordLength) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.user.hashCode()
        result = 31 * result + this.userLength.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.domainLength.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.passwordLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityA> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityA> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SecWinntAuthIdentityA =
                    SecWinntAuthIdentityA(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentityA) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.userLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.domainLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.flags)
                }
            }

        public operator fun invoke(
            user: MutPtr<UByte> = MutPtr(0L),
            userLength: UInt = 0u,
            domain: MutPtr<UByte> = MutPtr(0L),
            domainLength: UInt = 0u,
            password: MutPtr<UByte> = MutPtr(0L),
            passwordLength: UInt = 0u,
            flags: SecWinntAuthIdentity = 0u,
        ): SecWinntAuthIdentityA =
            SecWinntAuthIdentityA(
                userCtorArg = user,
                userLength = userLength,
                domainCtorArg = domain,
                domainLength = domainLength,
                passwordCtorArg = password,
                passwordLength = passwordLength,
                flags = flags,
            )
    }
}

public class SecWinntAuthIdentityW internal constructor(
    userCtorArg: MutPtr<UShort>,
    public var userLength: UInt,
    domainCtorArg: MutPtr<UShort>,
    public var domainLength: UInt,
    passwordCtorArg: MutPtr<UShort>,
    public var passwordLength: UInt,
    public var flags: SecWinntAuthIdentity,
) {
    public var user: MutPtr<UShort> = userCtorArg
        internal set

    public var domain: MutPtr<UShort> = domainCtorArg
        internal set

    public var password: MutPtr<UShort> = passwordCtorArg
        internal set

    public constructor() : this(
        userCtorArg = MutPtr(0L),
        userLength = 0u,
        domainCtorArg = MutPtr(0L),
        domainLength = 0u,
        passwordCtorArg = MutPtr(0L),
        passwordLength = 0u,
        flags = 0u,
    )

    public operator fun component1(): MutPtr<UShort> = this.user

    public operator fun component2(): UInt = this.userLength

    public operator fun component3(): MutPtr<UShort> = this.domain

    public operator fun component4(): UInt = this.domainLength

    public operator fun component5(): MutPtr<UShort> = this.password

    public operator fun component6(): UInt = this.passwordLength

    public operator fun component7(): SecWinntAuthIdentity = this.flags

    public fun copy(user: MutPtr<UShort> = this.user, userLength: UInt = this.userLength, domain: MutPtr<UShort> = this.domain, domainLength: UInt = this.domainLength, password: MutPtr<UShort> = this.password, passwordLength: UInt = this.passwordLength, flags: SecWinntAuthIdentity = this.flags): SecWinntAuthIdentityW = SecWinntAuthIdentityW(userCtorArg = user, userLength = userLength, domainCtorArg = domain, domainLength = domainLength, passwordCtorArg = password, passwordLength = passwordLength, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecWinntAuthIdentityW) return false
        if (this.user != other.user) return false
        if (this.userLength != other.userLength) return false
        if (this.domain != other.domain) return false
        if (this.domainLength != other.domainLength) return false
        if (this.password != other.password) return false
        if (this.passwordLength != other.passwordLength) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.user.hashCode()
        result = 31 * result + this.userLength.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.domainLength.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.passwordLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityW> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityW> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SecWinntAuthIdentityW =
                    SecWinntAuthIdentityW(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentityW) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.userLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 16L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.domainLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 32L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.flags)
                }
            }

        public operator fun invoke(
            user: MutPtr<UShort> = MutPtr(0L),
            userLength: UInt = 0u,
            domain: MutPtr<UShort> = MutPtr(0L),
            domainLength: UInt = 0u,
            password: MutPtr<UShort> = MutPtr(0L),
            passwordLength: UInt = 0u,
            flags: SecWinntAuthIdentity = 0u,
        ): SecWinntAuthIdentityW =
            SecWinntAuthIdentityW(
                userCtorArg = user,
                userLength = userLength,
                domainCtorArg = domain,
                domainLength = domainLength,
                passwordCtorArg = password,
                passwordLength = passwordLength,
                flags = flags,
            )
    }
}

public class UserMarshalCb internal constructor(
    public var flags: UInt,
    pStubMsgCtorArg: MutPtr<MidlStubMessage>,
    pReserveCtorArg: MutPtr<UByte>,
    public var signature: UInt,
    public var cBType: UserMarshalCbType,
    pFormatCtorArg: MutPtr<UByte>,
    pTypeFormatCtorArg: MutPtr<UByte>,
) {
    public var pStubMsg: MutPtr<MidlStubMessage> = pStubMsgCtorArg
        internal set

    public var pReserve: MutPtr<UByte> = pReserveCtorArg
        internal set

    public var pFormat: MutPtr<UByte> = pFormatCtorArg
        internal set

    public var pTypeFormat: MutPtr<UByte> = pTypeFormatCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        pStubMsgCtorArg = MutPtr(0L),
        pReserveCtorArg = MutPtr(0L),
        signature = 0u,
        cBType = 0,
        pFormatCtorArg = MutPtr(0L),
        pTypeFormatCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): MutPtr<MidlStubMessage> = this.pStubMsg

    public operator fun component3(): MutPtr<UByte> = this.pReserve

    public operator fun component4(): UInt = this.signature

    public operator fun component5(): UserMarshalCbType = this.cBType

    public operator fun component6(): MutPtr<UByte> = this.pFormat

    public operator fun component7(): MutPtr<UByte> = this.pTypeFormat

    public fun copy(flags: UInt = this.flags, pStubMsg: MutPtr<MidlStubMessage> = this.pStubMsg, pReserve: MutPtr<UByte> = this.pReserve, signature: UInt = this.signature, cBType: UserMarshalCbType = this.cBType, pFormat: MutPtr<UByte> = this.pFormat, pTypeFormat: MutPtr<UByte> = this.pTypeFormat): UserMarshalCb = UserMarshalCb(flags = flags, pStubMsgCtorArg = pStubMsg, pReserveCtorArg = pReserve, signature = signature, cBType = cBType, pFormatCtorArg = pFormat, pTypeFormatCtorArg = pTypeFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserMarshalCb) return false
        if (this.flags != other.flags) return false
        if (this.pStubMsg != other.pStubMsg) return false
        if (this.pReserve != other.pReserve) return false
        if (this.signature != other.signature) return false
        if (this.cBType != other.cBType) return false
        if (this.pFormat != other.pFormat) return false
        if (this.pTypeFormat != other.pTypeFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.pStubMsg.hashCode()
        result = 31 * result + this.pReserve.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.cBType.hashCode()
        result = 31 * result + this.pFormat.hashCode()
        result = 31 * result + this.pTypeFormat.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserMarshalCb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserMarshalCb> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UserMarshalCb =
                    UserMarshalCb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MidlStubMessage>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: UserMarshalCb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MidlStubMessage>(64)
                    ).writeNative(addr + 8L, value.pStubMsg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.pReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.cBType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.pFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 40L, value.pTypeFormat)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            pStubMsg: MutPtr<MidlStubMessage> = MutPtr(0L),
            pReserve: MutPtr<UByte> = MutPtr(0L),
            signature: UInt = 0u,
            cBType: UserMarshalCbType = 0,
            pFormat: MutPtr<UByte> = MutPtr(0L),
            pTypeFormat: MutPtr<UByte> = MutPtr(0L),
        ): UserMarshalCb =
            UserMarshalCb(
                flags = flags,
                pStubMsgCtorArg = pStubMsg,
                pReserveCtorArg = pReserve,
                signature = signature,
                cBType = cBType,
                pFormatCtorArg = pFormat,
                pTypeFormatCtorArg = pTypeFormat,
            )
    }
}

public data class UserMarshalRoutineQuadruple(
    public var pfnBufferSize: UserMarshalSizingRoutine = null,
    public var pfnMarshall: UserMarshalMarshallingRoutine = null,
    public var pfnUnmarshall: UserMarshalUnmarshallingRoutine = null,
    public var pfnFree: UserMarshalFreeingRoutine = null,
)

public class UuidVector internal constructor(
    public var count: UInt,
    uuidCtorArg: List<MutPtr<Guid>>,
) {
    public var uuid: List<MutPtr<Guid>> = uuidCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        uuidCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): List<MutPtr<Guid>> = this.uuid

    public fun copy(count: UInt = this.count, uuid: List<MutPtr<Guid>> = this.uuid): UuidVector = UuidVector(count = count, uuidCtorArg = uuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UuidVector) return false
        if (this.count != other.count) return false
        if (this.uuid != other.uuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.uuid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UuidVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UuidVector> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UuidVector =
                    UuidVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<Guid>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UuidVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<Guid>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.uuid)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            uuid: List<MutPtr<Guid>> = List(1) { MutPtr(0L) },
        ): UuidVector =
            UuidVector(
                count = count,
                uuidCtorArg = uuid,
            )
    }
}

public data class XmitRoutineQuintuple(
    public var pfnTranslateToXmit: XmitHelperRoutine = null,
    public var pfnTranslateFromXmit: XmitHelperRoutine = null,
    public var pfnFreeXmit: XmitHelperRoutine = null,
    public var pfnFreeInst: XmitHelperRoutine = null,
)
