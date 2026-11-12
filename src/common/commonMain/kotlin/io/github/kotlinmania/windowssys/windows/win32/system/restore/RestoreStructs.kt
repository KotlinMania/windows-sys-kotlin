@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restore

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public data class Restorepointinfoa(
    public var dwEventType: RestorepointinfoEventType = 0u,
    public var dwRestorePtType: RestorepointinfoType = 0u,
    public var llSequenceNumber: Long = 0L,
    public var szDescription: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restorepointinfoa) return false
        if (this.dwEventType != other.dwEventType) return false
        if (this.dwRestorePtType != other.dwRestorePtType) return false
        if (this.llSequenceNumber != other.llSequenceNumber) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEventType.hashCode()
        result = 31 * result + this.dwRestorePtType.hashCode()
        result = 31 * result + this.llSequenceNumber.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Restorepointinfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Restorepointinfoa> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Restorepointinfoa =
                    Restorepointinfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Restorepointinfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEventType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRestorePtType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.llSequenceNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (64).toInt())
                    ).writeNative(addr + 16L, value.szDescription)
                }
            }
    }
}

public data class Restorepointinfoex(
    public var ftCreation: Filetime = Filetime(),
    public var dwEventType: UInt = 0u,
    public var dwRestorePtType: UInt = 0u,
    public var dwRPNum: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restorepointinfoex) return false
        if (this.ftCreation != other.ftCreation) return false
        if (this.dwEventType != other.dwEventType) return false
        if (this.dwRestorePtType != other.dwRestorePtType) return false
        if (this.dwRPNum != other.dwRPNum) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ftCreation.hashCode()
        result = 31 * result + this.dwEventType.hashCode()
        result = 31 * result + this.dwRestorePtType.hashCode()
        result = 31 * result + this.dwRPNum.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Restorepointinfow(
    public var dwEventType: RestorepointinfoEventType = 0u,
    public var dwRestorePtType: RestorepointinfoType = 0u,
    public var llSequenceNumber: Long = 0L,
    public var szDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Restorepointinfow) return false
        if (this.dwEventType != other.dwEventType) return false
        if (this.dwRestorePtType != other.dwRestorePtType) return false
        if (this.llSequenceNumber != other.llSequenceNumber) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwEventType.hashCode()
        result = 31 * result + this.dwRestorePtType.hashCode()
        result = 31 * result + this.llSequenceNumber.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Restorepointinfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Restorepointinfow> {
                override val sizeBytes: Long = 528L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Restorepointinfow =
                    Restorepointinfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Restorepointinfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEventType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRestorePtType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.llSequenceNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 16L, value.szDescription)
                }
            }
    }
}

public data class Statemgrstatus(
    public var nStatus: Win32Error = 0u,
    public var llSequenceNumber: Long = 0L,
)
