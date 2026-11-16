@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.virtualdosmachines

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.FloatingSaveArea

public class Globalentry internal constructor(
    public var dwSize: UInt,
    public var dwAddress: UInt,
    public var dwBlockSize: UInt,
    hBlockCtorArg: Handle,
    public var wcLock: UShort,
    public var wcPageLock: UShort,
    public var wFlags: UShort,
    public var wHeapPresent: Bool,
    hOwnerCtorArg: Handle,
    public var wType: UShort,
    public var wData: UShort,
    public var dwNext: UInt,
    public var dwNextAlt: UInt,
) {
    public var hBlock: Handle = hBlockCtorArg
        internal set

    public var hOwner: Handle = hOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwAddress = 0u,
        dwBlockSize = 0u,
        hBlockCtorArg = MutPtr(0L),
        wcLock = 0u,
        wcPageLock = 0u,
        wFlags = 0u,
        wHeapPresent = 0,
        hOwnerCtorArg = MutPtr(0L),
        wType = 0u,
        wData = 0u,
        dwNext = 0u,
        dwNextAlt = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwAddress

    public operator fun component3(): UInt = this.dwBlockSize

    public operator fun component4(): Handle = this.hBlock

    public operator fun component5(): UShort = this.wcLock

    public operator fun component6(): UShort = this.wcPageLock

    public operator fun component7(): UShort = this.wFlags

    public operator fun component8(): Bool = this.wHeapPresent

    public operator fun component9(): Handle = this.hOwner

    public operator fun component10(): UShort = this.wType

    public operator fun component11(): UShort = this.wData

    public operator fun component12(): UInt = this.dwNext

    public operator fun component13(): UInt = this.dwNextAlt

    public fun copy(dwSize: UInt = this.dwSize, dwAddress: UInt = this.dwAddress, dwBlockSize: UInt = this.dwBlockSize, hBlock: Handle = this.hBlock, wcLock: UShort = this.wcLock, wcPageLock: UShort = this.wcPageLock, wFlags: UShort = this.wFlags, wHeapPresent: Bool = this.wHeapPresent, hOwner: Handle = this.hOwner, wType: UShort = this.wType, wData: UShort = this.wData, dwNext: UInt = this.dwNext, dwNextAlt: UInt = this.dwNextAlt): Globalentry = Globalentry(dwSize = dwSize, dwAddress = dwAddress, dwBlockSize = dwBlockSize, hBlockCtorArg = hBlock, wcLock = wcLock, wcPageLock = wcPageLock, wFlags = wFlags, wHeapPresent = wHeapPresent, hOwnerCtorArg = hOwner, wType = wType, wData = wData, dwNext = dwNext, dwNextAlt = dwNextAlt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Globalentry) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwAddress != other.dwAddress) return false
        if (this.dwBlockSize != other.dwBlockSize) return false
        if (this.hBlock != other.hBlock) return false
        if (this.wcLock != other.wcLock) return false
        if (this.wcPageLock != other.wcPageLock) return false
        if (this.wFlags != other.wFlags) return false
        if (this.wHeapPresent != other.wHeapPresent) return false
        if (this.hOwner != other.hOwner) return false
        if (this.wType != other.wType) return false
        if (this.wData != other.wData) return false
        if (this.dwNext != other.dwNext) return false
        if (this.dwNextAlt != other.dwNextAlt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwAddress.hashCode()
        result = 31 * result + this.dwBlockSize.hashCode()
        result = 31 * result + this.hBlock.hashCode()
        result = 31 * result + this.wcLock.hashCode()
        result = 31 * result + this.wcPageLock.hashCode()
        result = 31 * result + this.wFlags.hashCode()
        result = 31 * result + this.wHeapPresent.hashCode()
        result = 31 * result + this.hOwner.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wData.hashCode()
        result = 31 * result + this.dwNext.hashCode()
        result = 31 * result + this.dwNextAlt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwAddress: UInt = 0u,
            dwBlockSize: UInt = 0u,
            hBlock: Handle = MutPtr(0L),
            wcLock: UShort = 0u,
            wcPageLock: UShort = 0u,
            wFlags: UShort = 0u,
            wHeapPresent: Bool = 0,
            hOwner: Handle = MutPtr(0L),
            wType: UShort = 0u,
            wData: UShort = 0u,
            dwNext: UInt = 0u,
            dwNextAlt: UInt = 0u,
        ): Globalentry =
            Globalentry(
                dwSize = dwSize,
                dwAddress = dwAddress,
                dwBlockSize = dwBlockSize,
                hBlockCtorArg = hBlock,
                wcLock = wcLock,
                wcPageLock = wcPageLock,
                wFlags = wFlags,
                wHeapPresent = wHeapPresent,
                hOwnerCtorArg = hOwner,
                wType = wType,
                wData = wData,
                dwNext = dwNext,
                dwNextAlt = dwNextAlt,
            )
    }
}

public data class ImageNote(
    public var module: ByteArray = ByteArray(10),
    public var fileName: ByteArray = ByteArray(256),
    public var hModule: UShort = 0u,
    public var hTask: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageNote) return false
        if (!this.module.contentEquals(other.module)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.hModule != other.hModule) return false
        if (this.hTask != other.hTask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.module.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.hTask.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageNote> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageNote> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 270L
                override fun readNative(addr: Long): ImageNote =
                    ImageNote(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 10L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 266L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 268L),
                    )
                override fun writeNative(addr: Long, value: ImageNote) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                    ).writeNative(addr, value.module.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 10L, value.fileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 266L, value.hModule)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 268L, value.hTask)
                }
            }
    }
}

public class Moduleentry internal constructor(
    public var dwSize: UInt,
    public var szModule: ByteArray,
    hModuleCtorArg: Handle,
    public var wcUsage: UShort,
    public var szExePath: ByteArray,
    public var wNext: UShort,
) {
    public var hModule: Handle = hModuleCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        szModule = ByteArray(10),
        hModuleCtorArg = MutPtr(0L),
        wcUsage = 0u,
        szExePath = ByteArray(256),
        wNext = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): ByteArray = this.szModule

    public operator fun component3(): Handle = this.hModule

    public operator fun component4(): UShort = this.wcUsage

    public operator fun component5(): ByteArray = this.szExePath

    public operator fun component6(): UShort = this.wNext

    public fun copy(dwSize: UInt = this.dwSize, szModule: ByteArray = this.szModule, hModule: Handle = this.hModule, wcUsage: UShort = this.wcUsage, szExePath: ByteArray = this.szExePath, wNext: UShort = this.wNext): Moduleentry = Moduleentry(dwSize = dwSize, szModule = szModule, hModuleCtorArg = hModule, wcUsage = wcUsage, szExePath = szExePath, wNext = wNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Moduleentry) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szModule.contentEquals(other.szModule)) return false
        if (this.hModule != other.hModule) return false
        if (this.wcUsage != other.wcUsage) return false
        if (!this.szExePath.contentEquals(other.szExePath)) return false
        if (this.wNext != other.wNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szModule.contentHashCode()
        result = 31 * result + this.hModule.hashCode()
        result = 31 * result + this.wcUsage.hashCode()
        result = 31 * result + this.szExePath.contentHashCode()
        result = 31 * result + this.wNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            szModule: ByteArray = ByteArray(10),
            hModule: Handle = MutPtr(0L),
            wcUsage: UShort = 0u,
            szExePath: ByteArray = ByteArray(256),
            wNext: UShort = 0u,
        ): Moduleentry =
            Moduleentry(
                dwSize = dwSize,
                szModule = szModule,
                hModuleCtorArg = hModule,
                wcUsage = wcUsage,
                szExePath = szExePath,
                wNext = wNext,
            )
    }
}

public data class SegmentNote(
    public var selector1: UShort = 0u,
    public var selector2: UShort = 0u,
    public var segment: UShort = 0u,
    public var module: ByteArray = ByteArray(10),
    public var fileName: ByteArray = ByteArray(256),
    public var type: UShort = 0u,
    public var length: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SegmentNote) return false
        if (this.selector1 != other.selector1) return false
        if (this.selector2 != other.selector2) return false
        if (this.segment != other.segment) return false
        if (!this.module.contentEquals(other.module)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selector1.hashCode()
        result = 31 * result + this.selector2.hashCode()
        result = 31 * result + this.segment.hashCode()
        result = 31 * result + this.module.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SegmentNote> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SegmentNote> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): SegmentNote =
                    SegmentNote(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                        ).readNative(addr + 6L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 16L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                    )
                override fun writeNative(addr: Long, value: SegmentNote) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.selector1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.selector2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.segment)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (10).toInt())
                    ).writeNative(addr + 6L, value.module.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 16L, value.fileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 272L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.length)
                }
            }
    }
}

public data class TempBpNote(
    public var seg: UShort = 0u,
    public var offset: UInt = 0u,
    public var bPM: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TempBpNote> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TempBpNote> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TempBpNote =
                    TempBpNote(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TempBpNote) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.seg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bPM)
                }
            }
    }
}

public class Vdmcontext(
    public var contextFlags: UInt = 0u,
    public var dr0: UInt = 0u,
    public var dr1: UInt = 0u,
    public var dr2: UInt = 0u,
    public var dr3: UInt = 0u,
    public var dr6: UInt = 0u,
    public var dr7: UInt = 0u,
    public var floatSave: FloatingSaveArea = FloatingSaveArea(),
    public var segGs: UInt = 0u,
    public var segFs: UInt = 0u,
    public var segEs: UInt = 0u,
    public var segDs: UInt = 0u,
    public var edi: UInt = 0u,
    public var esi: UInt = 0u,
    public var ebx: UInt = 0u,
    public var edx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var eax: UInt = 0u,
    public var ebp: UInt = 0u,
    public var eip: UInt = 0u,
    public var segCs: UInt = 0u,
    public var eFlags: UInt = 0u,
    public var esp: UInt = 0u,
    public var segSs: UInt = 0u,
    public var extendedRegisters: UByteArray = UByteArray(512),
)

public class VdmcontextWithoutXsave(
    public var contextFlags: UInt = 0u,
    public var dr0: UInt = 0u,
    public var dr1: UInt = 0u,
    public var dr2: UInt = 0u,
    public var dr3: UInt = 0u,
    public var dr6: UInt = 0u,
    public var dr7: UInt = 0u,
    public var floatSave: FloatingSaveArea = FloatingSaveArea(),
    public var segGs: UInt = 0u,
    public var segFs: UInt = 0u,
    public var segEs: UInt = 0u,
    public var segDs: UInt = 0u,
    public var edi: UInt = 0u,
    public var esi: UInt = 0u,
    public var ebx: UInt = 0u,
    public var edx: UInt = 0u,
    public var ecx: UInt = 0u,
    public var eax: UInt = 0u,
    public var ebp: UInt = 0u,
    public var eip: UInt = 0u,
    public var segCs: UInt = 0u,
    public var eFlags: UInt = 0u,
    public var esp: UInt = 0u,
    public var segSs: UInt = 0u,
)

public data class VdmldtEntry(
    public var limitLow: UShort = 0u,
    public var baseLow: UShort = 0u,
    public var highWord: VdmldtEntry0 = VdmldtEntry0(),
)

public data class VdmldtEntry0(
    public var bytes: VdmldtEntry00 = VdmldtEntry00(),
    public var bits: VdmldtEntry01 = VdmldtEntry01(),
)

public data class VdmldtEntry01(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VdmldtEntry01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VdmldtEntry01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VdmldtEntry01 =
                    VdmldtEntry01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VdmldtEntry01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class VdmldtEntry00(
    public var baseMid: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags2: UByte = 0u,
    public var baseHi: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VdmldtEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VdmldtEntry00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VdmldtEntry00 =
                    VdmldtEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: VdmldtEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.baseMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.baseHi)
                }
            }
    }
}

public data class VdmSeginfo(
    public var selector: UShort = 0u,
    public var segNumber: UShort = 0u,
    public var length: UInt = 0u,
    public var type: UShort = 0u,
    public var moduleName: ByteArray = ByteArray(9),
    public var fileName: ByteArray = ByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VdmSeginfo) return false
        if (this.selector != other.selector) return false
        if (this.segNumber != other.segNumber) return false
        if (this.length != other.length) return false
        if (this.type != other.type) return false
        if (!this.moduleName.contentEquals(other.moduleName)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selector.hashCode()
        result = 31 * result + this.segNumber.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.moduleName.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VdmSeginfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VdmSeginfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 276L
                override fun readNative(addr: Long): VdmSeginfo =
                    VdmSeginfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (9).toInt())
                        ).readNative(addr + 10L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (255).toInt())
                        ).readNative(addr + 19L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: VdmSeginfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.selector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.segNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (9).toInt())
                    ).writeNative(addr + 10L, value.moduleName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (255).toInt())
                    ).writeNative(addr + 19L, value.fileName.toList())
                }
            }
    }
}
