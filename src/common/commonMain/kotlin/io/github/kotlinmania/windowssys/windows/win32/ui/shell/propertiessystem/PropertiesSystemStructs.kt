package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class Propprg(
    public var flPrg: UShort = 0u,
    public var flPrgInit: UShort = 0u,
    public var achTitle: ByteArray = ByteArray(30),
    public var achCmdLine: ByteArray = ByteArray(128),
    public var achWorkDir: ByteArray = ByteArray(64),
    public var wHotKey: UShort = 0u,
    public var achIconFile: ByteArray = ByteArray(80),
    public var wIconIndex: UShort = 0u,
    public var dwEnhModeFlags: UInt = 0u,
    public var dwRealModeFlags: UInt = 0u,
    public var achOtherFile: ByteArray = ByteArray(80),
    public var achPIFFile: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Propprg) return false
        if (this.flPrg != other.flPrg) return false
        if (this.flPrgInit != other.flPrgInit) return false
        if (!this.achTitle.contentEquals(other.achTitle)) return false
        if (!this.achCmdLine.contentEquals(other.achCmdLine)) return false
        if (!this.achWorkDir.contentEquals(other.achWorkDir)) return false
        if (this.wHotKey != other.wHotKey) return false
        if (!this.achIconFile.contentEquals(other.achIconFile)) return false
        if (this.wIconIndex != other.wIconIndex) return false
        if (this.dwEnhModeFlags != other.dwEnhModeFlags) return false
        if (this.dwRealModeFlags != other.dwRealModeFlags) return false
        if (!this.achOtherFile.contentEquals(other.achOtherFile)) return false
        if (!this.achPIFFile.contentEquals(other.achPIFFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flPrg.hashCode()
        result = 31 * result + this.flPrgInit.hashCode()
        result = 31 * result + this.achTitle.contentHashCode()
        result = 31 * result + this.achCmdLine.contentHashCode()
        result = 31 * result + this.achWorkDir.contentHashCode()
        result = 31 * result + this.wHotKey.hashCode()
        result = 31 * result + this.achIconFile.contentHashCode()
        result = 31 * result + this.wIconIndex.hashCode()
        result = 31 * result + this.dwEnhModeFlags.hashCode()
        result = 31 * result + this.dwRealModeFlags.hashCode()
        result = 31 * result + this.achOtherFile.contentHashCode()
        result = 31 * result + this.achPIFFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Propprg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Propprg> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 658L
                override fun readNative(addr: Long): Propprg =
                    Propprg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (30).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 34L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 162L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 226L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                        ).readNative(addr + 228L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 308L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 310L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 314L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                        ).readNative(addr + 318L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 398L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Propprg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.flPrg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flPrgInit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (30).toInt())
                    ).writeNative(addr + 4L, value.achTitle.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 34L, value.achCmdLine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 162L, value.achWorkDir.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 226L, value.wHotKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                    ).writeNative(addr + 228L, value.achIconFile.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 308L, value.wIconIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 310L, value.dwEnhModeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 314L, value.dwRealModeFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (80).toInt())
                    ).writeNative(addr + 318L, value.achOtherFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 398L, value.achPIFFile.toList())
                }
            }
    }
}
