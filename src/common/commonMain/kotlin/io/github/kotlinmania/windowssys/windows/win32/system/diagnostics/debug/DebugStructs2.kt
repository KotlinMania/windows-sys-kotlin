@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class WheaXpfMcBankDescriptor(
    public var bankNumber: UByte = 0u,
    public var clearOnInitialization: Boolean = false,
    public var statusDataFormat: UByte = 0u,
    public var flags: XpfMcBankFlags = XpfMcBankFlags(),
    public var controlMsr: UInt = 0u,
    public var statusMsr: UInt = 0u,
    public var addressMsr: UInt = 0u,
    public var miscMsr: UInt = 0u,
    public var controlData: ULong = 0uL,
)

public data class WheaXpfNmiDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfNmiDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaXpfNmiDescriptor> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WheaXpfNmiDescriptor =
                    WheaXpfNmiDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WheaXpfNmiDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.enabled)
                }
            }
    }
}

public class Wow64Context(
    public var contextFlags: Wow64ContextFlags = 0u,
    public var dr0: UInt = 0u,
    public var dr1: UInt = 0u,
    public var dr2: UInt = 0u,
    public var dr3: UInt = 0u,
    public var dr6: UInt = 0u,
    public var dr7: UInt = 0u,
    public var floatSave: Wow64FloatingSaveArea = Wow64FloatingSaveArea(),
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64Context> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64Context> {
                override val sizeBytes: Long = 716L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Wow64Context =
                    Wow64Context(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (Wow64FloatingSaveArea.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 204L),
                    )
                override fun writeNative(addr: Long, value: Wow64Context) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.contextFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dr0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dr1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dr2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dr3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dr6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dr7)
                    (Wow64FloatingSaveArea.typeLayout()).writeNative(addr + 28L, value.floatSave)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.segGs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.segFs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.segEs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.segDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.edi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.esi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.ebx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.edx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.ecx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.eax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.ebp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.eip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.segCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.eFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.esp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.segSs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 204L, value.extendedRegisters)
                }
            }
    }
}

public data class Wow64DescriptorTableEntry(
    public var selector: UInt = 0u,
    public var descriptor: Wow64LdtEntry = Wow64LdtEntry(),
)

public data class Wow64FloatingSaveArea(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var tagWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var registerArea: UByteArray = UByteArray(80),
    public var cr0NpxState: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wow64FloatingSaveArea) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (!this.registerArea.contentEquals(other.registerArea)) return false
        if (this.cr0NpxState != other.cr0NpxState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.registerArea.contentHashCode()
        result = 31 * result + this.cr0NpxState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64FloatingSaveArea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64FloatingSaveArea> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Wow64FloatingSaveArea =
                    Wow64FloatingSaveArea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: Wow64FloatingSaveArea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.statusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tagWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.errorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataSelector)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 28L, value.registerArea)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.cr0NpxState)
                }
            }
    }
}

public data class Wow64LdtEntry(
    public var limitLow: UShort = 0u,
    public var baseLow: UShort = 0u,
    public var highWord: Wow64LdtEntry0 = Wow64LdtEntry0(),
)

public data class Wow64LdtEntry0(
    public var bytes: Wow64LdtEntry00 = Wow64LdtEntry00(),
    public var bits: Wow64LdtEntry01 = Wow64LdtEntry01(),
)

public data class Wow64LdtEntry01(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64LdtEntry01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64LdtEntry01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Wow64LdtEntry01 =
                    Wow64LdtEntry01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Wow64LdtEntry01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Wow64LdtEntry00(
    public var baseMid: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags2: UByte = 0u,
    public var baseHi: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64LdtEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wow64LdtEntry00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Wow64LdtEntry00 =
                    Wow64LdtEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Wow64LdtEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.baseMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.baseHi)
                }
            }
    }
}

public data class XpfMceFlags(
    public var anonymous: XpfMceFlags0 = XpfMceFlags0(),
    public var asULONG: UInt = 0u,
)

public data class XpfMceFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfMceFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfMceFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): XpfMceFlags0 =
                    XpfMceFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XpfMceFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class XpfMcBankFlags(
    public var anonymous: XpfMcBankFlags0 = XpfMcBankFlags0(),
    public var asUCHAR: UByte = 0u,
)

public data class XpfMcBankFlags0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfMcBankFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpfMcBankFlags0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): XpfMcBankFlags0 =
                    XpfMcBankFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XpfMcBankFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class XsaveArea(
    public var legacyState: XsaveFormat = XsaveFormat(),
    public var header: XsaveAreaHeader = XsaveAreaHeader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveArea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveArea> {
                override val sizeBytes: Long = 576L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): XsaveArea =
                    XsaveArea(
                        (XsaveFormat.typeLayout()).readNative(addr),
                        (XsaveAreaHeader.typeLayout()).readNative(addr + 512L),
                    )
                override fun writeNative(addr: Long, value: XsaveArea) {
                    (XsaveFormat.typeLayout()).writeNative(addr, value.legacyState)
                    (XsaveAreaHeader.typeLayout()).writeNative(addr + 512L, value.header)
                }
            }
    }
}

public data class XsaveAreaHeader(
    public var mask: ULong = 0uL,
    public var compactionMask: ULong = 0uL,
    public var reserved2: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XsaveAreaHeader) return false
        if (this.mask != other.mask) return false
        if (this.compactionMask != other.compactionMask) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.compactionMask.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveAreaHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveAreaHeader> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): XsaveAreaHeader =
                    XsaveAreaHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: XsaveAreaHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.compactionMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 16L, value.reserved2)
                }
            }
    }
}

public data class XsaveFormat(
    public var controlWord: UShort = 0u,
    public var statusWord: UShort = 0u,
    public var tagWord: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var errorOpcode: UShort = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UShort = 0u,
    public var reserved3: UShort = 0u,
    public var mxCsr: UInt = 0u,
    public var mxCsrMask: UInt = 0u,
    public var floatRegisters: List<M128a> = List(8) { M128a() },
    public var xmmRegisters: List<M128a> = List(16) { M128a() },
    public var reserved4: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XsaveFormat) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.errorOpcode != other.errorOpcode) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.mxCsr != other.mxCsr) return false
        if (this.mxCsrMask != other.mxCsrMask) return false
        if (this.floatRegisters != other.floatRegisters) return false
        if (this.xmmRegisters != other.xmmRegisters) return false
        if (!this.reserved4.contentEquals(other.reserved4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.errorOpcode.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.mxCsr.hashCode()
        result = 31 * result + this.mxCsrMask.hashCode()
        result = 31 * result + this.floatRegisters.hashCode()
        result = 31 * result + this.xmmRegisters.hashCode()
        result = 31 * result + this.reserved4.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XsaveFormat> {
                override val sizeBytes: Long = 512L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): XsaveFormat =
                    XsaveFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(M128a.typeLayout(), (8).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(M128a.typeLayout(), (16).toInt())
                        ).readNative(addr + 160L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (96).toInt())
                        ).readNative(addr + 416L),
                    )
                override fun writeNative(addr: Long, value: XsaveFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.controlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.statusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.tagWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.errorOpcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.errorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.errorSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.dataSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mxCsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mxCsrMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(M128a.typeLayout(), (8).toInt())
                    ).writeNative(addr + 32L, value.floatRegisters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(M128a.typeLayout(), (16).toInt())
                    ).writeNative(addr + 160L, value.xmmRegisters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (96).toInt())
                    ).writeNative(addr + 416L, value.reserved4)
                }
            }
    }
}

public data class XstateConfiguration(
    public var enabledFeatures: ULong = 0uL,
    public var enabledVolatileFeatures: ULong = 0uL,
    public var size: UInt = 0u,
    public var anonymous: XstateConfiguration0 = XstateConfiguration0(),
    public var features: List<XstateFeature> = List(64) { XstateFeature() },
    public var enabledSupervisorFeatures: ULong = 0uL,
    public var alignedFeatures: ULong = 0uL,
    public var allFeatureSize: UInt = 0u,
    public var allFeatures: UIntArray = UIntArray(64),
    public var enabledUserVisibleSupervisorFeatures: ULong = 0uL,
    public var extendedFeatureDisableFeatures: ULong = 0uL,
    public var allNonLargeFeatureSize: UInt = 0u,
    public var spare: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateConfiguration) return false
        if (this.enabledFeatures != other.enabledFeatures) return false
        if (this.enabledVolatileFeatures != other.enabledVolatileFeatures) return false
        if (this.size != other.size) return false
        if (this.anonymous != other.anonymous) return false
        if (this.features != other.features) return false
        if (this.enabledSupervisorFeatures != other.enabledSupervisorFeatures) return false
        if (this.alignedFeatures != other.alignedFeatures) return false
        if (this.allFeatureSize != other.allFeatureSize) return false
        if (!this.allFeatures.contentEquals(other.allFeatures)) return false
        if (this.enabledUserVisibleSupervisorFeatures != other.enabledUserVisibleSupervisorFeatures) return false
        if (this.extendedFeatureDisableFeatures != other.extendedFeatureDisableFeatures) return false
        if (this.allNonLargeFeatureSize != other.allNonLargeFeatureSize) return false
        if (this.spare != other.spare) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enabledFeatures.hashCode()
        result = 31 * result + this.enabledVolatileFeatures.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.features.hashCode()
        result = 31 * result + this.enabledSupervisorFeatures.hashCode()
        result = 31 * result + this.alignedFeatures.hashCode()
        result = 31 * result + this.allFeatureSize.hashCode()
        result = 31 * result + this.allFeatures.contentHashCode()
        result = 31 * result + this.enabledUserVisibleSupervisorFeatures.hashCode()
        result = 31 * result + this.extendedFeatureDisableFeatures.hashCode()
        result = 31 * result + this.allNonLargeFeatureSize.hashCode()
        result = 31 * result + this.spare.hashCode()
        return result
    }
}

public data class XstateConfiguration0(
    public var controlFlags: UInt = 0u,
    public var anonymous: XstateConfiguration00 = XstateConfiguration00(),
)

public data class XstateConfiguration00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateConfiguration00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateConfiguration00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): XstateConfiguration00 =
                    XstateConfiguration00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: XstateConfiguration00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class XstateConfigFeatureMscInfo(
    public var sizeOfInfo: UInt = 0u,
    public var contextSize: UInt = 0u,
    public var enabledFeatures: ULong = 0uL,
    public var features: List<XstateFeature> = List(64) { XstateFeature() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateConfigFeatureMscInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateConfigFeatureMscInfo> {
                override val sizeBytes: Long = 528L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): XstateConfigFeatureMscInfo =
                    XstateConfigFeatureMscInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(XstateFeature.typeLayout(), (64).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: XstateConfigFeatureMscInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.contextSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.enabledFeatures)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(XstateFeature.typeLayout(), (64).toInt())
                    ).writeNative(addr + 16L, value.features)
                }
            }
    }
}

public class XstateContext internal constructor(
    public var mask: ULong,
    public var length: UInt,
    public var reserved1: UInt,
    areaCtorArg: MutPtr<XsaveArea>,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var area: MutPtr<XsaveArea> = areaCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        mask = 0uL,
        length = 0u,
        reserved1 = 0u,
        areaCtorArg = MutPtr(0L),
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.mask

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.reserved1

    public operator fun component4(): MutPtr<XsaveArea> = this.area

    public operator fun component5(): MutPtr<CVoid> = this.buffer

    public fun copy(mask: ULong = this.mask, length: UInt = this.length, reserved1: UInt = this.reserved1, area: MutPtr<XsaveArea> = this.area, buffer: MutPtr<CVoid> = this.buffer): XstateContext = XstateContext(mask = mask, length = length, reserved1 = reserved1, areaCtorArg = area, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XstateContext) return false
        if (this.mask != other.mask) return false
        if (this.length != other.length) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.area != other.area) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.area.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateContext> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): XstateContext =
                    XstateContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<XsaveArea>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: XstateContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<XsaveArea>(64)
                    ).writeNative(addr + 16L, value.area)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.buffer)
                }
            }

        public operator fun invoke(
            mask: ULong = 0uL,
            length: UInt = 0u,
            reserved1: UInt = 0u,
            area: MutPtr<XsaveArea> = MutPtr(0L),
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): XstateContext =
            XstateContext(
                mask = mask,
                length = length,
                reserved1 = reserved1,
                areaCtorArg = area,
                bufferCtorArg = buffer,
            )
    }
}

public data class XstateFeature(
    public var offset: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateFeature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XstateFeature> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): XstateFeature =
                    XstateFeature(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: XstateFeature) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}
