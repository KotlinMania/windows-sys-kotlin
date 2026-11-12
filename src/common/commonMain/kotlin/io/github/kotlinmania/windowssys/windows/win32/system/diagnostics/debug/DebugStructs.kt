@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.VsFixedfileinfo
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ExceptionRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.memory.VirtualAllocationType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ImageFileMachine
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ProcessorArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.time.TimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public data class Address64(
    public var offset: ULong = 0uL,
    public var segment: UShort = 0u,
    public var mode: AddressMode = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Address64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Address64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Address64 =
                    Address64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Address64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.segment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.mode)
                }
            }
    }
}

public data class AerBridgeDescriptorFlags(
    public var anonymous: AerBridgeDescriptorFlags0 = AerBridgeDescriptorFlags0(),
    public var asUSHORT: UShort = 0u,
)

public data class AerBridgeDescriptorFlags0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AerBridgeDescriptorFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AerBridgeDescriptorFlags0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): AerBridgeDescriptorFlags0 =
                    AerBridgeDescriptorFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AerBridgeDescriptorFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class AerEndpointDescriptorFlags(
    public var anonymous: AerEndpointDescriptorFlags0 = AerEndpointDescriptorFlags0(),
    public var asUSHORT: UShort = 0u,
)

public data class AerEndpointDescriptorFlags0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AerEndpointDescriptorFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AerEndpointDescriptorFlags0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): AerEndpointDescriptorFlags0 =
                    AerEndpointDescriptorFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AerEndpointDescriptorFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class AerRootportDescriptorFlags(
    public var anonymous: AerRootportDescriptorFlags0 = AerRootportDescriptorFlags0(),
    public var asUSHORT: UShort = 0u,
)

public data class AerRootportDescriptorFlags0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AerRootportDescriptorFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AerRootportDescriptorFlags0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): AerRootportDescriptorFlags0 =
                    AerRootportDescriptorFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AerRootportDescriptorFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class ApcCallbackData internal constructor(
    public var parameter: Int,
    contextRecordCtorArg: MutPtr<Context>,
    public var reserved0: Int,
    public var reserved1: Int,
) {
    public var contextRecord: MutPtr<Context> = contextRecordCtorArg
        internal set

    public constructor() : this(
        parameter = 0,
        contextRecordCtorArg = MutPtr(0L),
        reserved0 = 0,
        reserved1 = 0,
    )

    public operator fun component1(): Int = this.parameter

    public operator fun component2(): MutPtr<Context> = this.contextRecord

    public operator fun component3(): Int = this.reserved0

    public operator fun component4(): Int = this.reserved1

    public fun copy(parameter: Int = this.parameter, contextRecord: MutPtr<Context> = this.contextRecord, reserved0: Int = this.reserved0, reserved1: Int = this.reserved1): ApcCallbackData = ApcCallbackData(parameter = parameter, contextRecordCtorArg = contextRecord, reserved0 = reserved0, reserved1 = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ApcCallbackData) return false
        if (this.parameter != other.parameter) return false
        if (this.contextRecord != other.contextRecord) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parameter.hashCode()
        result = 31 * result + this.contextRecord.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApcCallbackData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApcCallbackData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ApcCallbackData =
                    ApcCallbackData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Context>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ApcCallbackData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.parameter)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Context>(64)
                    ).writeNative(addr + 8L, value.contextRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.reserved1)
                }
            }

        public operator fun invoke(
            parameter: Int = 0,
            contextRecord: MutPtr<Context> = MutPtr(0L),
            reserved0: Int = 0,
            reserved1: Int = 0,
        ): ApcCallbackData =
            ApcCallbackData(
                parameter = parameter,
                contextRecordCtorArg = contextRecord,
                reserved0 = reserved0,
                reserved1 = reserved1,
            )
    }
}

public data class ApiVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var revision: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApiVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ApiVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ApiVersion =
                    ApiVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ApiVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}

public data class Arm64NtContext(
    public var contextFlags: UInt = 0u,
    public var cpsr: UInt = 0u,
    public var anonymous: Arm64NtContext0 = Arm64NtContext0(),
    public var sp: ULong = 0uL,
    public var pc: ULong = 0uL,
    public var v: List<Arm64NtNeon128> = List(32) { Arm64NtNeon128() },
    public var fpcr: UInt = 0u,
    public var fpsr: UInt = 0u,
    public var bcr: UIntArray = UIntArray(8),
    public var bvr: ULongArray = ULongArray(8),
    public var wcr: UIntArray = UIntArray(2),
    public var wvr: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext) return false
        if (this.contextFlags != other.contextFlags) return false
        if (this.cpsr != other.cpsr) return false
        if (this.anonymous != other.anonymous) return false
        if (this.sp != other.sp) return false
        if (this.pc != other.pc) return false
        if (this.v != other.v) return false
        if (this.fpcr != other.fpcr) return false
        if (this.fpsr != other.fpsr) return false
        if (!this.bcr.contentEquals(other.bcr)) return false
        if (!this.bvr.contentEquals(other.bvr)) return false
        if (!this.wcr.contentEquals(other.wcr)) return false
        if (!this.wvr.contentEquals(other.wvr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contextFlags.hashCode()
        result = 31 * result + this.cpsr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.sp.hashCode()
        result = 31 * result + this.pc.hashCode()
        result = 31 * result + this.v.hashCode()
        result = 31 * result + this.fpcr.hashCode()
        result = 31 * result + this.fpsr.hashCode()
        result = 31 * result + this.bcr.contentHashCode()
        result = 31 * result + this.bvr.contentHashCode()
        result = 31 * result + this.wcr.contentHashCode()
        result = 31 * result + this.wvr.contentHashCode()
        return result
    }
}

public data class Arm64NtContext0(
    public var anonymous: Arm64NtContext00 = Arm64NtContext00(),
    public var x: ULongArray = ULongArray(31),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtContext0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.x.contentEquals(other.x)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.x.contentHashCode()
        return result
    }
}

public class Arm64NtContext00(
    public var x0: ULong = 0uL,
    public var x1: ULong = 0uL,
    public var x2: ULong = 0uL,
    public var x3: ULong = 0uL,
    public var x4: ULong = 0uL,
    public var x5: ULong = 0uL,
    public var x6: ULong = 0uL,
    public var x7: ULong = 0uL,
    public var x8: ULong = 0uL,
    public var x9: ULong = 0uL,
    public var x10: ULong = 0uL,
    public var x11: ULong = 0uL,
    public var x12: ULong = 0uL,
    public var x13: ULong = 0uL,
    public var x14: ULong = 0uL,
    public var x15: ULong = 0uL,
    public var x16: ULong = 0uL,
    public var x17: ULong = 0uL,
    public var x18: ULong = 0uL,
    public var x19: ULong = 0uL,
    public var x20: ULong = 0uL,
    public var x21: ULong = 0uL,
    public var x22: ULong = 0uL,
    public var x23: ULong = 0uL,
    public var x24: ULong = 0uL,
    public var x25: ULong = 0uL,
    public var x26: ULong = 0uL,
    public var x27: ULong = 0uL,
    public var x28: ULong = 0uL,
    public var fp: ULong = 0uL,
    public var lr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arm64NtContext00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arm64NtContext00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 248L
                override fun readNative(addr: Long): Arm64NtContext00 =
                    Arm64NtContext00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                    )
                override fun writeNative(addr: Long, value: Arm64NtContext00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.x1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.x2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.x3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.x4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.x5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.x6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.x7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.x8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.x9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.x10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.x11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.x12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.x13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.x14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.x15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.x16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.x17)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.x18)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.x19)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.x20)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.x21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.x22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.x23)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.x24)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.x25)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.x26)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.x27)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.x28)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.fp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.lr)
                }
            }
    }
}

public data class Arm64NtNeon128(
    public var anonymous: Arm64NtNeon1280 = Arm64NtNeon1280(),
    public var d: DoubleArray = DoubleArray(2),
    public var s: FloatArray = FloatArray(4),
    public var h: UShortArray = UShortArray(8),
    public var b: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Arm64NtNeon128) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.d.contentEquals(other.d)) return false
        if (!this.s.contentEquals(other.s)) return false
        if (!this.h.contentEquals(other.h)) return false
        if (!this.b.contentEquals(other.b)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.d.contentHashCode()
        result = 31 * result + this.s.contentHashCode()
        result = 31 * result + this.h.contentHashCode()
        result = 31 * result + this.b.contentHashCode()
        return result
    }
}

public data class Arm64NtNeon1280(
    public var low: ULong = 0uL,
    public var high: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arm64NtNeon1280> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arm64NtNeon1280> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Arm64NtNeon1280 =
                    Arm64NtNeon1280(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Arm64NtNeon1280) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.low)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.high)
                }
            }
    }
}

public class Context(
    public var p1Home: ULong = 0uL,
    public var p2Home: ULong = 0uL,
    public var p3Home: ULong = 0uL,
    public var p4Home: ULong = 0uL,
    public var p5Home: ULong = 0uL,
    public var p6Home: ULong = 0uL,
    public var contextFlags: ContextFlags = 0u,
    public var mxCsr: UInt = 0u,
    public var segCs: UShort = 0u,
    public var segDs: UShort = 0u,
    public var segEs: UShort = 0u,
    public var segFs: UShort = 0u,
    public var segGs: UShort = 0u,
    public var segSs: UShort = 0u,
    public var eFlags: UInt = 0u,
    public var dr0: ULong = 0uL,
    public var dr1: ULong = 0uL,
    public var dr2: ULong = 0uL,
    public var dr3: ULong = 0uL,
    public var dr6: ULong = 0uL,
    public var dr7: ULong = 0uL,
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var anonymous: Context0 = Context0(),
    public var vectorRegister: List<M128a> = List(26) { M128a() },
    public var vectorControl: ULong = 0uL,
    public var debugControl: ULong = 0uL,
    public var lastBranchToRip: ULong = 0uL,
    public var lastBranchFromRip: ULong = 0uL,
    public var lastExceptionToRip: ULong = 0uL,
    public var lastExceptionFromRip: ULong = 0uL,
)

public data class Context0(
    public var fltSave: XsaveFormat = XsaveFormat(),
    public var anonymous: Context00 = Context00(),
)

public class Context00(
    public var header: List<M128a> = List(2) { M128a() },
    public var legacy: List<M128a> = List(8) { M128a() },
    public var xmm0: M128a = M128a(),
    public var xmm1: M128a = M128a(),
    public var xmm2: M128a = M128a(),
    public var xmm3: M128a = M128a(),
    public var xmm4: M128a = M128a(),
    public var xmm5: M128a = M128a(),
    public var xmm6: M128a = M128a(),
    public var xmm7: M128a = M128a(),
    public var xmm8: M128a = M128a(),
    public var xmm9: M128a = M128a(),
    public var xmm10: M128a = M128a(),
    public var xmm11: M128a = M128a(),
    public var xmm12: M128a = M128a(),
    public var xmm13: M128a = M128a(),
    public var xmm14: M128a = M128a(),
    public var xmm15: M128a = M128a(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Context00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Context00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 416L
                override fun readNative(addr: Long): Context00 =
                    Context00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(M128a.typeLayout(), (2).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(M128a.typeLayout(), (8).toInt())
                        ).readNative(addr + 32L),
                        (M128a.typeLayout()).readNative(addr + 160L),
                        (M128a.typeLayout()).readNative(addr + 176L),
                        (M128a.typeLayout()).readNative(addr + 192L),
                        (M128a.typeLayout()).readNative(addr + 208L),
                        (M128a.typeLayout()).readNative(addr + 224L),
                        (M128a.typeLayout()).readNative(addr + 240L),
                        (M128a.typeLayout()).readNative(addr + 256L),
                        (M128a.typeLayout()).readNative(addr + 272L),
                        (M128a.typeLayout()).readNative(addr + 288L),
                        (M128a.typeLayout()).readNative(addr + 304L),
                        (M128a.typeLayout()).readNative(addr + 320L),
                        (M128a.typeLayout()).readNative(addr + 336L),
                        (M128a.typeLayout()).readNative(addr + 352L),
                        (M128a.typeLayout()).readNative(addr + 368L),
                        (M128a.typeLayout()).readNative(addr + 384L),
                        (M128a.typeLayout()).readNative(addr + 400L),
                    )
                override fun writeNative(addr: Long, value: Context00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(M128a.typeLayout(), (2).toInt())
                    ).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(M128a.typeLayout(), (8).toInt())
                    ).writeNative(addr + 32L, value.legacy)
                    (M128a.typeLayout()).writeNative(addr + 160L, value.xmm0)
                    (M128a.typeLayout()).writeNative(addr + 176L, value.xmm1)
                    (M128a.typeLayout()).writeNative(addr + 192L, value.xmm2)
                    (M128a.typeLayout()).writeNative(addr + 208L, value.xmm3)
                    (M128a.typeLayout()).writeNative(addr + 224L, value.xmm4)
                    (M128a.typeLayout()).writeNative(addr + 240L, value.xmm5)
                    (M128a.typeLayout()).writeNative(addr + 256L, value.xmm6)
                    (M128a.typeLayout()).writeNative(addr + 272L, value.xmm7)
                    (M128a.typeLayout()).writeNative(addr + 288L, value.xmm8)
                    (M128a.typeLayout()).writeNative(addr + 304L, value.xmm9)
                    (M128a.typeLayout()).writeNative(addr + 320L, value.xmm10)
                    (M128a.typeLayout()).writeNative(addr + 336L, value.xmm11)
                    (M128a.typeLayout()).writeNative(addr + 352L, value.xmm12)
                    (M128a.typeLayout()).writeNative(addr + 368L, value.xmm13)
                    (M128a.typeLayout()).writeNative(addr + 384L, value.xmm14)
                    (M128a.typeLayout()).writeNative(addr + 400L, value.xmm15)
                }
            }
    }
}

public data class CpuInformation(
    public var x86CpuInfo: CpuInformation0 = CpuInformation0(),
    public var otherCpuInfo: CpuInformation1 = CpuInformation1(),
)

public data class CpuInformation1(
    public var processorFeatures: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuInformation1) return false
        if (!this.processorFeatures.contentEquals(other.processorFeatures)) return false
        return true
    }

    override fun hashCode(): Int = this.processorFeatures.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuInformation1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuInformation1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CpuInformation1 =
                    CpuInformation1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CpuInformation1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr, value.processorFeatures.toList())
                }
            }
    }
}

public data class CpuInformation0(
    public var vendorId: UIntArray = UIntArray(3),
    public var versionInformation: UInt = 0u,
    public var featureInformation: UInt = 0u,
    public var aMDExtendedCpuFeatures: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuInformation0) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        if (this.versionInformation != other.versionInformation) return false
        if (this.featureInformation != other.featureInformation) return false
        if (this.aMDExtendedCpuFeatures != other.aMDExtendedCpuFeatures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vendorId.contentHashCode()
        result = 31 * result + this.versionInformation.hashCode()
        result = 31 * result + this.featureInformation.hashCode()
        result = 31 * result + this.aMDExtendedCpuFeatures.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuInformation0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CpuInformation0 =
                    CpuInformation0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: CpuInformation0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr, value.vendorId.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.versionInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.featureInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aMDExtendedCpuFeatures)
                }
            }
    }
}

public class CreateProcessDebugInfo internal constructor(
    hFileCtorArg: Handle,
    hProcessCtorArg: Handle,
    hThreadCtorArg: Handle,
    lpBaseOfImageCtorArg: MutPtr<CVoid>,
    public var dwDebugInfoFileOffset: UInt,
    public var nDebugInfoSize: UInt,
    lpThreadLocalBaseCtorArg: MutPtr<CVoid>,
    public var lpStartAddress: LpthreadStartRoutine,
    lpImageNameCtorArg: MutPtr<CVoid>,
    public var fUnicode: UShort,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hThread: Handle = hThreadCtorArg
        internal set

    public var lpBaseOfImage: MutPtr<CVoid> = lpBaseOfImageCtorArg
        internal set

    public var lpThreadLocalBase: MutPtr<CVoid> = lpThreadLocalBaseCtorArg
        internal set

    public var lpImageName: MutPtr<CVoid> = lpImageNameCtorArg
        internal set

    public constructor() : this(
        hFileCtorArg = MutPtr(0L),
        hProcessCtorArg = MutPtr(0L),
        hThreadCtorArg = MutPtr(0L),
        lpBaseOfImageCtorArg = MutPtr(0L),
        dwDebugInfoFileOffset = 0u,
        nDebugInfoSize = 0u,
        lpThreadLocalBaseCtorArg = MutPtr(0L),
        lpStartAddress = null,
        lpImageNameCtorArg = MutPtr(0L),
        fUnicode = 0u,
    )

    public operator fun component1(): Handle = this.hFile

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): Handle = this.hThread

    public operator fun component4(): MutPtr<CVoid> = this.lpBaseOfImage

    public operator fun component5(): UInt = this.dwDebugInfoFileOffset

    public operator fun component6(): UInt = this.nDebugInfoSize

    public operator fun component7(): MutPtr<CVoid> = this.lpThreadLocalBase

    public operator fun component8(): LpthreadStartRoutine = this.lpStartAddress

    public operator fun component9(): MutPtr<CVoid> = this.lpImageName

    public operator fun component10(): UShort = this.fUnicode

    public fun copy(hFile: Handle = this.hFile, hProcess: Handle = this.hProcess, hThread: Handle = this.hThread, lpBaseOfImage: MutPtr<CVoid> = this.lpBaseOfImage, dwDebugInfoFileOffset: UInt = this.dwDebugInfoFileOffset, nDebugInfoSize: UInt = this.nDebugInfoSize, lpThreadLocalBase: MutPtr<CVoid> = this.lpThreadLocalBase, lpStartAddress: LpthreadStartRoutine = this.lpStartAddress, lpImageName: MutPtr<CVoid> = this.lpImageName, fUnicode: UShort = this.fUnicode): CreateProcessDebugInfo = CreateProcessDebugInfo(hFileCtorArg = hFile, hProcessCtorArg = hProcess, hThreadCtorArg = hThread, lpBaseOfImageCtorArg = lpBaseOfImage, dwDebugInfoFileOffset = dwDebugInfoFileOffset, nDebugInfoSize = nDebugInfoSize, lpThreadLocalBaseCtorArg = lpThreadLocalBase, lpStartAddress = lpStartAddress, lpImageNameCtorArg = lpImageName, fUnicode = fUnicode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateProcessDebugInfo) return false
        if (this.hFile != other.hFile) return false
        if (this.hProcess != other.hProcess) return false
        if (this.hThread != other.hThread) return false
        if (this.lpBaseOfImage != other.lpBaseOfImage) return false
        if (this.dwDebugInfoFileOffset != other.dwDebugInfoFileOffset) return false
        if (this.nDebugInfoSize != other.nDebugInfoSize) return false
        if (this.lpThreadLocalBase != other.lpThreadLocalBase) return false
        if (this.lpStartAddress != other.lpStartAddress) return false
        if (this.lpImageName != other.lpImageName) return false
        if (this.fUnicode != other.fUnicode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hFile.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.hThread.hashCode()
        result = 31 * result + this.lpBaseOfImage.hashCode()
        result = 31 * result + this.dwDebugInfoFileOffset.hashCode()
        result = 31 * result + this.nDebugInfoSize.hashCode()
        result = 31 * result + this.lpThreadLocalBase.hashCode()
        result = 31 * result + this.lpStartAddress.hashCode()
        result = 31 * result + this.lpImageName.hashCode()
        result = 31 * result + this.fUnicode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hFile: Handle = MutPtr(0L),
            hProcess: Handle = MutPtr(0L),
            hThread: Handle = MutPtr(0L),
            lpBaseOfImage: MutPtr<CVoid> = MutPtr(0L),
            dwDebugInfoFileOffset: UInt = 0u,
            nDebugInfoSize: UInt = 0u,
            lpThreadLocalBase: MutPtr<CVoid> = MutPtr(0L),
            lpStartAddress: LpthreadStartRoutine = null,
            lpImageName: MutPtr<CVoid> = MutPtr(0L),
            fUnicode: UShort = 0u,
        ): CreateProcessDebugInfo =
            CreateProcessDebugInfo(
                hFileCtorArg = hFile,
                hProcessCtorArg = hProcess,
                hThreadCtorArg = hThread,
                lpBaseOfImageCtorArg = lpBaseOfImage,
                dwDebugInfoFileOffset = dwDebugInfoFileOffset,
                nDebugInfoSize = nDebugInfoSize,
                lpThreadLocalBaseCtorArg = lpThreadLocalBase,
                lpStartAddress = lpStartAddress,
                lpImageNameCtorArg = lpImageName,
                fUnicode = fUnicode,
            )
    }
}

public class CreateThreadDebugInfo internal constructor(
    hThreadCtorArg: Handle,
    lpThreadLocalBaseCtorArg: MutPtr<CVoid>,
    public var lpStartAddress: LpthreadStartRoutine,
) {
    public var hThread: Handle = hThreadCtorArg
        internal set

    public var lpThreadLocalBase: MutPtr<CVoid> = lpThreadLocalBaseCtorArg
        internal set

    public constructor() : this(
        hThreadCtorArg = MutPtr(0L),
        lpThreadLocalBaseCtorArg = MutPtr(0L),
        lpStartAddress = null,
    )

    public operator fun component1(): Handle = this.hThread

    public operator fun component2(): MutPtr<CVoid> = this.lpThreadLocalBase

    public operator fun component3(): LpthreadStartRoutine = this.lpStartAddress

    public fun copy(hThread: Handle = this.hThread, lpThreadLocalBase: MutPtr<CVoid> = this.lpThreadLocalBase, lpStartAddress: LpthreadStartRoutine = this.lpStartAddress): CreateThreadDebugInfo = CreateThreadDebugInfo(hThreadCtorArg = hThread, lpThreadLocalBaseCtorArg = lpThreadLocalBase, lpStartAddress = lpStartAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateThreadDebugInfo) return false
        if (this.hThread != other.hThread) return false
        if (this.lpThreadLocalBase != other.lpThreadLocalBase) return false
        if (this.lpStartAddress != other.lpStartAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hThread.hashCode()
        result = 31 * result + this.lpThreadLocalBase.hashCode()
        result = 31 * result + this.lpStartAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hThread: Handle = MutPtr(0L),
            lpThreadLocalBase: MutPtr<CVoid> = MutPtr(0L),
            lpStartAddress: LpthreadStartRoutine = null,
        ): CreateThreadDebugInfo =
            CreateThreadDebugInfo(
                hThreadCtorArg = hThread,
                lpThreadLocalBaseCtorArg = lpThreadLocalBase,
                lpStartAddress = lpStartAddress,
            )
    }
}

public class DbghelpDataReportStruct internal constructor(
    pBinPathNonExistCtorArg: Pcwstr,
    pSymbolPathNonExistCtorArg: Pcwstr,
) {
    public var pBinPathNonExist: Pcwstr = pBinPathNonExistCtorArg
        internal set

    public var pSymbolPathNonExist: Pcwstr = pSymbolPathNonExistCtorArg
        internal set

    public constructor() : this(
        pBinPathNonExistCtorArg = ConstPtr(0L),
        pSymbolPathNonExistCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pBinPathNonExist

    public operator fun component2(): Pcwstr = this.pSymbolPathNonExist

    public fun copy(pBinPathNonExist: Pcwstr = this.pBinPathNonExist, pSymbolPathNonExist: Pcwstr = this.pSymbolPathNonExist): DbghelpDataReportStruct = DbghelpDataReportStruct(pBinPathNonExistCtorArg = pBinPathNonExist, pSymbolPathNonExistCtorArg = pSymbolPathNonExist)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbghelpDataReportStruct) return false
        if (this.pBinPathNonExist != other.pBinPathNonExist) return false
        if (this.pSymbolPathNonExist != other.pSymbolPathNonExist) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pBinPathNonExist.hashCode()
        result = 31 * result + this.pSymbolPathNonExist.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pBinPathNonExist: Pcwstr = ConstPtr(0L),
            pSymbolPathNonExist: Pcwstr = ConstPtr(0L),
        ): DbghelpDataReportStruct =
            DbghelpDataReportStruct(
                pBinPathNonExistCtorArg = pBinPathNonExist,
                pSymbolPathNonExistCtorArg = pSymbolPathNonExist,
            )
    }
}

public data class DebugEvent(
    public var dwDebugEventCode: DebugEventCode = 0u,
    public var dwProcessId: UInt = 0u,
    public var dwThreadId: UInt = 0u,
    public var u: DebugEvent0 = DebugEvent0(),
)

public data class DebugEvent0(
    public var exception: ExceptionDebugInfo = ExceptionDebugInfo(),
    public var createThread: CreateThreadDebugInfo = CreateThreadDebugInfo(),
    public var createProcessInfo: CreateProcessDebugInfo = CreateProcessDebugInfo(),
    public var exitThread: ExitThreadDebugInfo = ExitThreadDebugInfo(),
    public var exitProcess: ExitProcessDebugInfo = ExitProcessDebugInfo(),
    public var loadDll: LoadDllDebugInfo = LoadDllDebugInfo(),
    public var unloadDll: UnloadDllDebugInfo = UnloadDllDebugInfo(),
    public var debugString: OutputDebugStringInfo = OutputDebugStringInfo(),
    public var ripInfo: RipInfo = RipInfo(),
)

public class DispatcherContext internal constructor(
    public var controlPc: ULong,
    public var imageBase: ULong,
    functionEntryCtorArg: MutPtr<ImageRuntimeFunctionEntry>,
    public var establisherFrame: ULong,
    public var targetIp: ULong,
    contextRecordCtorArg: MutPtr<Context>,
    public var languageHandler: ExceptionRoutine,
    handlerDataCtorArg: MutPtr<CVoid>,
    historyTableCtorArg: MutPtr<UnwindHistoryTable>,
    public var scopeIndex: UInt,
    public var fill0: UInt,
) {
    public var functionEntry: MutPtr<ImageRuntimeFunctionEntry> = functionEntryCtorArg
        internal set

    public var contextRecord: MutPtr<Context> = contextRecordCtorArg
        internal set

    public var handlerData: MutPtr<CVoid> = handlerDataCtorArg
        internal set

    public var historyTable: MutPtr<UnwindHistoryTable> = historyTableCtorArg
        internal set

    public constructor() : this(
        controlPc = 0uL,
        imageBase = 0uL,
        functionEntryCtorArg = MutPtr(0L),
        establisherFrame = 0uL,
        targetIp = 0uL,
        contextRecordCtorArg = MutPtr(0L),
        languageHandler = null,
        handlerDataCtorArg = MutPtr(0L),
        historyTableCtorArg = MutPtr(0L),
        scopeIndex = 0u,
        fill0 = 0u,
    )

    public operator fun component1(): ULong = this.controlPc

    public operator fun component2(): ULong = this.imageBase

    public operator fun component3(): MutPtr<ImageRuntimeFunctionEntry> = this.functionEntry

    public operator fun component4(): ULong = this.establisherFrame

    public operator fun component5(): ULong = this.targetIp

    public operator fun component6(): MutPtr<Context> = this.contextRecord

    public operator fun component7(): ExceptionRoutine = this.languageHandler

    public operator fun component8(): MutPtr<CVoid> = this.handlerData

    public operator fun component9(): MutPtr<UnwindHistoryTable> = this.historyTable

    public operator fun component10(): UInt = this.scopeIndex

    public operator fun component11(): UInt = this.fill0

    public fun copy(controlPc: ULong = this.controlPc, imageBase: ULong = this.imageBase, functionEntry: MutPtr<ImageRuntimeFunctionEntry> = this.functionEntry, establisherFrame: ULong = this.establisherFrame, targetIp: ULong = this.targetIp, contextRecord: MutPtr<Context> = this.contextRecord, languageHandler: ExceptionRoutine = this.languageHandler, handlerData: MutPtr<CVoid> = this.handlerData, historyTable: MutPtr<UnwindHistoryTable> = this.historyTable, scopeIndex: UInt = this.scopeIndex, fill0: UInt = this.fill0): DispatcherContext = DispatcherContext(controlPc = controlPc, imageBase = imageBase, functionEntryCtorArg = functionEntry, establisherFrame = establisherFrame, targetIp = targetIp, contextRecordCtorArg = contextRecord, languageHandler = languageHandler, handlerDataCtorArg = handlerData, historyTableCtorArg = historyTable, scopeIndex = scopeIndex, fill0 = fill0)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DispatcherContext) return false
        if (this.controlPc != other.controlPc) return false
        if (this.imageBase != other.imageBase) return false
        if (this.functionEntry != other.functionEntry) return false
        if (this.establisherFrame != other.establisherFrame) return false
        if (this.targetIp != other.targetIp) return false
        if (this.contextRecord != other.contextRecord) return false
        if (this.languageHandler != other.languageHandler) return false
        if (this.handlerData != other.handlerData) return false
        if (this.historyTable != other.historyTable) return false
        if (this.scopeIndex != other.scopeIndex) return false
        if (this.fill0 != other.fill0) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlPc.hashCode()
        result = 31 * result + this.imageBase.hashCode()
        result = 31 * result + this.functionEntry.hashCode()
        result = 31 * result + this.establisherFrame.hashCode()
        result = 31 * result + this.targetIp.hashCode()
        result = 31 * result + this.contextRecord.hashCode()
        result = 31 * result + this.languageHandler.hashCode()
        result = 31 * result + this.handlerData.hashCode()
        result = 31 * result + this.historyTable.hashCode()
        result = 31 * result + this.scopeIndex.hashCode()
        result = 31 * result + this.fill0.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            controlPc: ULong = 0uL,
            imageBase: ULong = 0uL,
            functionEntry: MutPtr<ImageRuntimeFunctionEntry> = MutPtr(0L),
            establisherFrame: ULong = 0uL,
            targetIp: ULong = 0uL,
            contextRecord: MutPtr<Context> = MutPtr(0L),
            languageHandler: ExceptionRoutine = null,
            handlerData: MutPtr<CVoid> = MutPtr(0L),
            historyTable: MutPtr<UnwindHistoryTable> = MutPtr(0L),
            scopeIndex: UInt = 0u,
            fill0: UInt = 0u,
        ): DispatcherContext =
            DispatcherContext(
                controlPc = controlPc,
                imageBase = imageBase,
                functionEntryCtorArg = functionEntry,
                establisherFrame = establisherFrame,
                targetIp = targetIp,
                contextRecordCtorArg = contextRecord,
                languageHandler = languageHandler,
                handlerDataCtorArg = handlerData,
                historyTableCtorArg = historyTable,
                scopeIndex = scopeIndex,
                fill0 = fill0,
            )
    }
}

public data class DumpFileAttributes(
    public var anonymous: DumpFileAttributes0 = DumpFileAttributes0(),
    public var attributes: UInt = 0u,
)

public data class DumpFileAttributes0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpFileAttributes0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpFileAttributes0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DumpFileAttributes0 =
                    DumpFileAttributes0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DumpFileAttributes0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class DumpHeader32(
    public var signature: UInt = 0u,
    public var validDump: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var directoryTableBase: UInt = 0u,
    public var pfnDataBase: UInt = 0u,
    public var psLoadedModuleList: UInt = 0u,
    public var psActiveProcessHead: UInt = 0u,
    public var machineImageType: UInt = 0u,
    public var numberProcessors: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var bugCheckParameter1: UInt = 0u,
    public var bugCheckParameter2: UInt = 0u,
    public var bugCheckParameter3: UInt = 0u,
    public var bugCheckParameter4: UInt = 0u,
    public var versionUser: ByteArray = ByteArray(32),
    public var paeEnabled: UByte = 0u,
    public var kdSecondaryVersion: UByte = 0u,
    public var spare3: UByteArray = UByteArray(2),
    public var kdDebuggerDataBlock: UInt = 0u,
    public var anonymous: DumpHeader320 = DumpHeader320(),
    public var contextRecord: UByteArray = UByteArray(1200),
    public var exception: ExceptionRecord32 = ExceptionRecord32(),
    public var comment: ByteArray = ByteArray(128),
    public var attributes: DumpFileAttributes = DumpFileAttributes(),
    public var bootId: UInt = 0u,
    public var reserved0: UByteArray = UByteArray(1760),
    public var dumpType: UInt = 0u,
    public var miniDumpFields: UInt = 0u,
    public var secondaryDataState: UInt = 0u,
    public var productType: UInt = 0u,
    public var suiteMask: UInt = 0u,
    public var writerStatus: UInt = 0u,
    public var requiredDumpSpace: Long = 0L,
    public var reserved2: UByteArray = UByteArray(16),
    public var systemUpTime: Long = 0L,
    public var systemTime: Long = 0L,
    public var reserved3: UByteArray = UByteArray(56),
)

public data class DumpHeader320(
    public var physicalMemoryBlock: PhysicalMemoryDescriptor32 = PhysicalMemoryDescriptor32(),
    public var physicalMemoryBlockBuffer: UByteArray = UByteArray(700),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpHeader320) return false
        if (this.physicalMemoryBlock != other.physicalMemoryBlock) return false
        if (!this.physicalMemoryBlockBuffer.contentEquals(other.physicalMemoryBlockBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMemoryBlock.hashCode()
        result = 31 * result + this.physicalMemoryBlockBuffer.contentHashCode()
        return result
    }
}

public class DumpHeader64(
    public var signature: UInt = 0u,
    public var validDump: UInt = 0u,
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var directoryTableBase: ULong = 0uL,
    public var pfnDataBase: ULong = 0uL,
    public var psLoadedModuleList: ULong = 0uL,
    public var psActiveProcessHead: ULong = 0uL,
    public var machineImageType: UInt = 0u,
    public var numberProcessors: UInt = 0u,
    public var bugCheckCode: UInt = 0u,
    public var bugCheckParameter1: ULong = 0uL,
    public var bugCheckParameter2: ULong = 0uL,
    public var bugCheckParameter3: ULong = 0uL,
    public var bugCheckParameter4: ULong = 0uL,
    public var versionUser: ByteArray = ByteArray(32),
    public var kdDebuggerDataBlock: ULong = 0uL,
    public var anonymous: DumpHeader640 = DumpHeader640(),
    public var contextRecord: UByteArray = UByteArray(3000),
    public var exception: ExceptionRecord64 = ExceptionRecord64(),
    public var dumpType: UInt = 0u,
    public var requiredDumpSpace: Long = 0L,
    public var systemTime: Long = 0L,
    public var comment: ByteArray = ByteArray(128),
    public var systemUpTime: Long = 0L,
    public var miniDumpFields: UInt = 0u,
    public var secondaryDataState: UInt = 0u,
    public var productType: UInt = 0u,
    public var suiteMask: UInt = 0u,
    public var writerStatus: UInt = 0u,
    public var unused1: UByte = 0u,
    public var kdSecondaryVersion: UByte = 0u,
    public var unused: UByteArray = UByteArray(2),
    public var attributes: DumpFileAttributes = DumpFileAttributes(),
    public var bootId: UInt = 0u,
    public var reserved0: UByteArray = UByteArray(4008),
)

public data class DumpHeader640(
    public var physicalMemoryBlock: PhysicalMemoryDescriptor64 = PhysicalMemoryDescriptor64(),
    public var physicalMemoryBlockBuffer: UByteArray = UByteArray(700),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpHeader640) return false
        if (this.physicalMemoryBlock != other.physicalMemoryBlock) return false
        if (!this.physicalMemoryBlockBuffer.contentEquals(other.physicalMemoryBlockBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalMemoryBlock.hashCode()
        result = 31 * result + this.physicalMemoryBlockBuffer.contentHashCode()
        return result
    }
}

public class DebugPropertyInfo internal constructor(
    public var mDwValidFields: UInt,
    mBstrNameCtorArg: Bstr,
    mBstrTypeCtorArg: Bstr,
    mBstrValueCtorArg: Bstr,
    mBstrFullNameCtorArg: Bstr,
    public var mDwAttrib: UInt,
    mPDebugPropCtorArg: MutPtr<CVoid>,
) {
    public var mBstrName: Bstr = mBstrNameCtorArg
        internal set

    public var mBstrType: Bstr = mBstrTypeCtorArg
        internal set

    public var mBstrValue: Bstr = mBstrValueCtorArg
        internal set

    public var mBstrFullName: Bstr = mBstrFullNameCtorArg
        internal set

    public var mPDebugProp: MutPtr<CVoid> = mPDebugPropCtorArg
        internal set

    public constructor() : this(
        mDwValidFields = 0u,
        mBstrNameCtorArg = ConstPtr(0L),
        mBstrTypeCtorArg = ConstPtr(0L),
        mBstrValueCtorArg = ConstPtr(0L),
        mBstrFullNameCtorArg = ConstPtr(0L),
        mDwAttrib = 0u,
        mPDebugPropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.mDwValidFields

    public operator fun component2(): Bstr = this.mBstrName

    public operator fun component3(): Bstr = this.mBstrType

    public operator fun component4(): Bstr = this.mBstrValue

    public operator fun component5(): Bstr = this.mBstrFullName

    public operator fun component6(): UInt = this.mDwAttrib

    public operator fun component7(): MutPtr<CVoid> = this.mPDebugProp

    public fun copy(mDwValidFields: UInt = this.mDwValidFields, mBstrName: Bstr = this.mBstrName, mBstrType: Bstr = this.mBstrType, mBstrValue: Bstr = this.mBstrValue, mBstrFullName: Bstr = this.mBstrFullName, mDwAttrib: UInt = this.mDwAttrib, mPDebugProp: MutPtr<CVoid> = this.mPDebugProp): DebugPropertyInfo = DebugPropertyInfo(mDwValidFields = mDwValidFields, mBstrNameCtorArg = mBstrName, mBstrTypeCtorArg = mBstrType, mBstrValueCtorArg = mBstrValue, mBstrFullNameCtorArg = mBstrFullName, mDwAttrib = mDwAttrib, mPDebugPropCtorArg = mPDebugProp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DebugPropertyInfo) return false
        if (this.mDwValidFields != other.mDwValidFields) return false
        if (this.mBstrName != other.mBstrName) return false
        if (this.mBstrType != other.mBstrType) return false
        if (this.mBstrValue != other.mBstrValue) return false
        if (this.mBstrFullName != other.mBstrFullName) return false
        if (this.mDwAttrib != other.mDwAttrib) return false
        if (this.mPDebugProp != other.mPDebugProp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mDwValidFields.hashCode()
        result = 31 * result + this.mBstrName.hashCode()
        result = 31 * result + this.mBstrType.hashCode()
        result = 31 * result + this.mBstrValue.hashCode()
        result = 31 * result + this.mBstrFullName.hashCode()
        result = 31 * result + this.mDwAttrib.hashCode()
        result = 31 * result + this.mPDebugProp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mDwValidFields: UInt = 0u,
            mBstrName: Bstr = ConstPtr(0L),
            mBstrType: Bstr = ConstPtr(0L),
            mBstrValue: Bstr = ConstPtr(0L),
            mBstrFullName: Bstr = ConstPtr(0L),
            mDwAttrib: UInt = 0u,
            mPDebugProp: MutPtr<CVoid> = MutPtr(0L),
        ): DebugPropertyInfo =
            DebugPropertyInfo(
                mDwValidFields = mDwValidFields,
                mBstrNameCtorArg = mBstrName,
                mBstrTypeCtorArg = mBstrType,
                mBstrValueCtorArg = mBstrValue,
                mBstrFullNameCtorArg = mBstrFullName,
                mDwAttrib = mDwAttrib,
                mPDebugPropCtorArg = mPDebugProp,
            )
    }
}

public data class ExceptionDebugInfo(
    public var exceptionRecord: ExceptionRecord = ExceptionRecord(),
    public var dwFirstChance: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionDebugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionDebugInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): ExceptionDebugInfo =
                    ExceptionDebugInfo(
                        (ExceptionRecord.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                    )
                override fun writeNative(addr: Long, value: ExceptionDebugInfo) {
                    (ExceptionRecord.typeLayout()).writeNative(addr, value.exceptionRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dwFirstChance)
                }
            }
    }
}

public class ExceptionPointers internal constructor(
    exceptionRecordCtorArg: MutPtr<ExceptionRecord>,
    contextRecordCtorArg: MutPtr<Context>,
) {
    public var exceptionRecord: MutPtr<ExceptionRecord> = exceptionRecordCtorArg
        internal set

    public var contextRecord: MutPtr<Context> = contextRecordCtorArg
        internal set

    public constructor() : this(
        exceptionRecordCtorArg = MutPtr(0L),
        contextRecordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<ExceptionRecord> = this.exceptionRecord

    public operator fun component2(): MutPtr<Context> = this.contextRecord

    public fun copy(exceptionRecord: MutPtr<ExceptionRecord> = this.exceptionRecord, contextRecord: MutPtr<Context> = this.contextRecord): ExceptionPointers = ExceptionPointers(exceptionRecordCtorArg = exceptionRecord, contextRecordCtorArg = contextRecord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionPointers) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.contextRecord != other.contextRecord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionRecord.hashCode()
        result = 31 * result + this.contextRecord.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionPointers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionPointers> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ExceptionPointers =
                    ExceptionPointers(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ExceptionRecord>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Context>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ExceptionPointers) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ExceptionRecord>(64)
                    ).writeNative(addr, value.exceptionRecord)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Context>(64)
                    ).writeNative(addr + 8L, value.contextRecord)
                }
            }

        public operator fun invoke(
            exceptionRecord: MutPtr<ExceptionRecord> = MutPtr(0L),
            contextRecord: MutPtr<Context> = MutPtr(0L),
        ): ExceptionPointers =
            ExceptionPointers(
                exceptionRecordCtorArg = exceptionRecord,
                contextRecordCtorArg = contextRecord,
            )
    }
}

public class ExceptionRecord internal constructor(
    public var exceptionCode: Ntstatus,
    public var exceptionFlags: UInt,
    exceptionRecordCtorArg: MutPtr<ExceptionRecord>,
    exceptionAddressCtorArg: MutPtr<CVoid>,
    public var numberParameters: UInt,
    public var exceptionInformation: IntArray,
) {
    public var exceptionRecord: MutPtr<ExceptionRecord> = exceptionRecordCtorArg
        internal set

    public var exceptionAddress: MutPtr<CVoid> = exceptionAddressCtorArg
        internal set

    public constructor() : this(
        exceptionCode = 0,
        exceptionFlags = 0u,
        exceptionRecordCtorArg = MutPtr(0L),
        exceptionAddressCtorArg = MutPtr(0L),
        numberParameters = 0u,
        exceptionInformation = IntArray(15),
    )

    public operator fun component1(): Ntstatus = this.exceptionCode

    public operator fun component2(): UInt = this.exceptionFlags

    public operator fun component3(): MutPtr<ExceptionRecord> = this.exceptionRecord

    public operator fun component4(): MutPtr<CVoid> = this.exceptionAddress

    public operator fun component5(): UInt = this.numberParameters

    public operator fun component6(): IntArray = this.exceptionInformation

    public fun copy(exceptionCode: Ntstatus = this.exceptionCode, exceptionFlags: UInt = this.exceptionFlags, exceptionRecord: MutPtr<ExceptionRecord> = this.exceptionRecord, exceptionAddress: MutPtr<CVoid> = this.exceptionAddress, numberParameters: UInt = this.numberParameters, exceptionInformation: IntArray = this.exceptionInformation): ExceptionRecord = ExceptionRecord(exceptionCode = exceptionCode, exceptionFlags = exceptionFlags, exceptionRecordCtorArg = exceptionRecord, exceptionAddressCtorArg = exceptionAddress, numberParameters = numberParameters, exceptionInformation = exceptionInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRecord) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionRecord> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): ExceptionRecord =
                    ExceptionRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ExceptionRecord>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (15).toInt())
                        ).readNative(addr + 32L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: ExceptionRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exceptionFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ExceptionRecord>(64)
                    ).writeNative(addr + 8L, value.exceptionRecord)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.exceptionAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberParameters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (15).toInt())
                    ).writeNative(addr + 32L, value.exceptionInformation.toList())
                }
            }

        public operator fun invoke(
            exceptionCode: Ntstatus = 0,
            exceptionFlags: UInt = 0u,
            exceptionRecord: MutPtr<ExceptionRecord> = MutPtr(0L),
            exceptionAddress: MutPtr<CVoid> = MutPtr(0L),
            numberParameters: UInt = 0u,
            exceptionInformation: IntArray = IntArray(15),
        ): ExceptionRecord =
            ExceptionRecord(
                exceptionCode = exceptionCode,
                exceptionFlags = exceptionFlags,
                exceptionRecordCtorArg = exceptionRecord,
                exceptionAddressCtorArg = exceptionAddress,
                numberParameters = numberParameters,
                exceptionInformation = exceptionInformation,
            )
    }
}

public data class ExceptionRecord32(
    public var exceptionCode: Ntstatus = 0,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: UInt = 0u,
    public var exceptionAddress: UInt = 0u,
    public var numberParameters: UInt = 0u,
    public var exceptionInformation: UIntArray = UIntArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRecord32) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionRecord32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionRecord32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): ExceptionRecord32 =
                    ExceptionRecord32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (15).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ExceptionRecord32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exceptionFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.exceptionRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.exceptionAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberParameters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (15).toInt())
                    ).writeNative(addr + 20L, value.exceptionInformation.toList())
                }
            }
    }
}

public data class ExceptionRecord64(
    public var exceptionCode: Ntstatus = 0,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: ULong = 0uL,
    public var exceptionAddress: ULong = 0uL,
    public var numberParameters: UInt = 0u,
    public var unusedAlignment: UInt = 0u,
    public var exceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRecord64) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (this.unusedAlignment != other.unusedAlignment) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.unusedAlignment.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionRecord64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExceptionRecord64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): ExceptionRecord64 =
                    ExceptionRecord64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (15).toInt())
                        ).readNative(addr + 32L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: ExceptionRecord64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exceptionFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.exceptionRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.exceptionAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberParameters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.unusedAlignment)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (15).toInt())
                    ).writeNative(addr + 32L, value.exceptionInformation.toList())
                }
            }
    }
}

public data class ExitProcessDebugInfo(
    public var dwExitCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitProcessDebugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitProcessDebugInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ExitProcessDebugInfo =
                    ExitProcessDebugInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ExitProcessDebugInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExitCode)
                }
            }
    }
}

public data class ExitThreadDebugInfo(
    public var dwExitCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitThreadDebugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitThreadDebugInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ExitThreadDebugInfo =
                    ExitThreadDebugInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ExitThreadDebugInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExitCode)
                }
            }
    }
}

public class ExtendedDebugPropertyInfo internal constructor(
    public var dwValidFields: UInt,
    pszNameCtorArg: Pwstr,
    pszTypeCtorArg: Pwstr,
    pszValueCtorArg: Pwstr,
    pszFullNameCtorArg: Pwstr,
    public var dwAttrib: UInt,
    pDebugPropCtorArg: MutPtr<CVoid>,
    public var nDISPID: UInt,
    public var nType: UInt,
    public var varValue: Variant.Variant,
    plbValueCtorArg: MutPtr<CVoid>,
    pDebugExtPropCtorArg: MutPtr<CVoid>,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pszType: Pwstr = pszTypeCtorArg
        internal set

    public var pszValue: Pwstr = pszValueCtorArg
        internal set

    public var pszFullName: Pwstr = pszFullNameCtorArg
        internal set

    public var pDebugProp: MutPtr<CVoid> = pDebugPropCtorArg
        internal set

    public var plbValue: MutPtr<CVoid> = plbValueCtorArg
        internal set

    public var pDebugExtProp: MutPtr<CVoid> = pDebugExtPropCtorArg
        internal set

    public constructor() : this(
        dwValidFields = 0u,
        pszNameCtorArg = MutPtr(0L),
        pszTypeCtorArg = MutPtr(0L),
        pszValueCtorArg = MutPtr(0L),
        pszFullNameCtorArg = MutPtr(0L),
        dwAttrib = 0u,
        pDebugPropCtorArg = MutPtr(0L),
        nDISPID = 0u,
        nType = 0u,
        varValue = Variant.Variant(),
        plbValueCtorArg = MutPtr(0L),
        pDebugExtPropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwValidFields

    public operator fun component2(): Pwstr = this.pszName

    public operator fun component3(): Pwstr = this.pszType

    public operator fun component4(): Pwstr = this.pszValue

    public operator fun component5(): Pwstr = this.pszFullName

    public operator fun component6(): UInt = this.dwAttrib

    public operator fun component7(): MutPtr<CVoid> = this.pDebugProp

    public operator fun component8(): UInt = this.nDISPID

    public operator fun component9(): UInt = this.nType

    public operator fun component10(): Variant.Variant = this.varValue

    public operator fun component11(): MutPtr<CVoid> = this.plbValue

    public operator fun component12(): MutPtr<CVoid> = this.pDebugExtProp

    public fun copy(dwValidFields: UInt = this.dwValidFields, pszName: Pwstr = this.pszName, pszType: Pwstr = this.pszType, pszValue: Pwstr = this.pszValue, pszFullName: Pwstr = this.pszFullName, dwAttrib: UInt = this.dwAttrib, pDebugProp: MutPtr<CVoid> = this.pDebugProp, nDISPID: UInt = this.nDISPID, nType: UInt = this.nType, varValue: Variant.Variant = this.varValue, plbValue: MutPtr<CVoid> = this.plbValue, pDebugExtProp: MutPtr<CVoid> = this.pDebugExtProp): ExtendedDebugPropertyInfo = ExtendedDebugPropertyInfo(dwValidFields = dwValidFields, pszNameCtorArg = pszName, pszTypeCtorArg = pszType, pszValueCtorArg = pszValue, pszFullNameCtorArg = pszFullName, dwAttrib = dwAttrib, pDebugPropCtorArg = pDebugProp, nDISPID = nDISPID, nType = nType, varValue = varValue, plbValueCtorArg = plbValue, pDebugExtPropCtorArg = pDebugExtProp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtendedDebugPropertyInfo) return false
        if (this.dwValidFields != other.dwValidFields) return false
        if (this.pszName != other.pszName) return false
        if (this.pszType != other.pszType) return false
        if (this.pszValue != other.pszValue) return false
        if (this.pszFullName != other.pszFullName) return false
        if (this.dwAttrib != other.dwAttrib) return false
        if (this.pDebugProp != other.pDebugProp) return false
        if (this.nDISPID != other.nDISPID) return false
        if (this.nType != other.nType) return false
        if (this.varValue != other.varValue) return false
        if (this.plbValue != other.plbValue) return false
        if (this.pDebugExtProp != other.pDebugExtProp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwValidFields.hashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.pszType.hashCode()
        result = 31 * result + this.pszValue.hashCode()
        result = 31 * result + this.pszFullName.hashCode()
        result = 31 * result + this.dwAttrib.hashCode()
        result = 31 * result + this.pDebugProp.hashCode()
        result = 31 * result + this.nDISPID.hashCode()
        result = 31 * result + this.nType.hashCode()
        result = 31 * result + this.varValue.hashCode()
        result = 31 * result + this.plbValue.hashCode()
        result = 31 * result + this.pDebugExtProp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwValidFields: UInt = 0u,
            pszName: Pwstr = MutPtr(0L),
            pszType: Pwstr = MutPtr(0L),
            pszValue: Pwstr = MutPtr(0L),
            pszFullName: Pwstr = MutPtr(0L),
            dwAttrib: UInt = 0u,
            pDebugProp: MutPtr<CVoid> = MutPtr(0L),
            nDISPID: UInt = 0u,
            nType: UInt = 0u,
            varValue: Variant.Variant = Variant.Variant(),
            plbValue: MutPtr<CVoid> = MutPtr(0L),
            pDebugExtProp: MutPtr<CVoid> = MutPtr(0L),
        ): ExtendedDebugPropertyInfo =
            ExtendedDebugPropertyInfo(
                dwValidFields = dwValidFields,
                pszNameCtorArg = pszName,
                pszTypeCtorArg = pszType,
                pszValueCtorArg = pszValue,
                pszFullNameCtorArg = pszFullName,
                dwAttrib = dwAttrib,
                pDebugPropCtorArg = pDebugProp,
                nDISPID = nDISPID,
                nType = nType,
                varValue = varValue,
                plbValueCtorArg = plbValue,
                pDebugExtPropCtorArg = pDebugExtProp,
            )
    }
}

public data class FpoData(
    public var ulOffStart: UInt = 0u,
    public var cbProcSize: UInt = 0u,
    public var cdwLocals: UInt = 0u,
    public var cdwParams: UShort = 0u,
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpoData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpoData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FpoData =
                    FpoData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: FpoData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulOffStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbProcSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdwLocals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.cdwParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.bitfield)
                }
            }
    }
}

public class ImagehlpCbaEvent internal constructor(
    public var severity: ImagehlpCbaEventSeverity,
    public var code: UInt,
    descCtorArg: Pstr,
    objCtorArg: MutPtr<CVoid>,
) {
    public var desc: Pstr = descCtorArg
        internal set

    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public constructor() : this(
        severity = 0u,
        code = 0u,
        descCtorArg = MutPtr(0L),
        objCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ImagehlpCbaEventSeverity = this.severity

    public operator fun component2(): UInt = this.code

    public operator fun component3(): Pstr = this.desc

    public operator fun component4(): MutPtr<CVoid> = this.obj

    public fun copy(severity: ImagehlpCbaEventSeverity = this.severity, code: UInt = this.code, desc: Pstr = this.desc, obj: MutPtr<CVoid> = this.obj): ImagehlpCbaEvent = ImagehlpCbaEvent(severity = severity, code = code, descCtorArg = desc, objCtorArg = obj)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpCbaEvent) return false
        if (this.severity != other.severity) return false
        if (this.code != other.code) return false
        if (this.desc != other.desc) return false
        if (this.obj != other.obj) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.severity.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.desc.hashCode()
        result = 31 * result + this.obj.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            severity: ImagehlpCbaEventSeverity = 0u,
            code: UInt = 0u,
            desc: Pstr = MutPtr(0L),
            obj: MutPtr<CVoid> = MutPtr(0L),
        ): ImagehlpCbaEvent =
            ImagehlpCbaEvent(
                severity = severity,
                code = code,
                descCtorArg = desc,
                objCtorArg = obj,
            )
    }
}

public class ImagehlpCbaEventw internal constructor(
    public var severity: ImagehlpCbaEventSeverity,
    public var code: UInt,
    descCtorArg: Pcwstr,
    objCtorArg: MutPtr<CVoid>,
) {
    public var desc: Pcwstr = descCtorArg
        internal set

    public var obj: MutPtr<CVoid> = objCtorArg
        internal set

    public constructor() : this(
        severity = 0u,
        code = 0u,
        descCtorArg = ConstPtr(0L),
        objCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ImagehlpCbaEventSeverity = this.severity

    public operator fun component2(): UInt = this.code

    public operator fun component3(): Pcwstr = this.desc

    public operator fun component4(): MutPtr<CVoid> = this.obj

    public fun copy(severity: ImagehlpCbaEventSeverity = this.severity, code: UInt = this.code, desc: Pcwstr = this.desc, obj: MutPtr<CVoid> = this.obj): ImagehlpCbaEventw = ImagehlpCbaEventw(severity = severity, code = code, descCtorArg = desc, objCtorArg = obj)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpCbaEventw) return false
        if (this.severity != other.severity) return false
        if (this.code != other.code) return false
        if (this.desc != other.desc) return false
        if (this.obj != other.obj) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.severity.hashCode()
        result = 31 * result + this.code.hashCode()
        result = 31 * result + this.desc.hashCode()
        result = 31 * result + this.obj.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            severity: ImagehlpCbaEventSeverity = 0u,
            code: UInt = 0u,
            desc: Pcwstr = ConstPtr(0L),
            obj: MutPtr<CVoid> = MutPtr(0L),
        ): ImagehlpCbaEventw =
            ImagehlpCbaEventw(
                severity = severity,
                code = code,
                descCtorArg = desc,
                objCtorArg = obj,
            )
    }
}

public class ImagehlpCbaReadMemory internal constructor(
    public var addr: ULong,
    bufCtorArg: MutPtr<CVoid>,
    public var bytes: UInt,
    bytesreadCtorArg: MutPtr<UInt>,
) {
    public var buf: MutPtr<CVoid> = bufCtorArg
        internal set

    public var bytesread: MutPtr<UInt> = bytesreadCtorArg
        internal set

    public constructor() : this(
        addr = 0uL,
        bufCtorArg = MutPtr(0L),
        bytes = 0u,
        bytesreadCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.addr

    public operator fun component2(): MutPtr<CVoid> = this.buf

    public operator fun component3(): UInt = this.bytes

    public operator fun component4(): MutPtr<UInt> = this.bytesread

    public fun copy(addr: ULong = this.addr, buf: MutPtr<CVoid> = this.buf, bytes: UInt = this.bytes, bytesread: MutPtr<UInt> = this.bytesread): ImagehlpCbaReadMemory = ImagehlpCbaReadMemory(addr = addr, bufCtorArg = buf, bytes = bytes, bytesreadCtorArg = bytesread)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpCbaReadMemory) return false
        if (this.addr != other.addr) return false
        if (this.buf != other.buf) return false
        if (this.bytes != other.bytes) return false
        if (this.bytesread != other.bytesread) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addr.hashCode()
        result = 31 * result + this.buf.hashCode()
        result = 31 * result + this.bytes.hashCode()
        result = 31 * result + this.bytesread.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpCbaReadMemory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpCbaReadMemory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ImagehlpCbaReadMemory =
                    ImagehlpCbaReadMemory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ImagehlpCbaReadMemory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.addr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.bytesread)
                }
            }

        public operator fun invoke(
            addr: ULong = 0uL,
            buf: MutPtr<CVoid> = MutPtr(0L),
            bytes: UInt = 0u,
            bytesread: MutPtr<UInt> = MutPtr(0L),
        ): ImagehlpCbaReadMemory =
            ImagehlpCbaReadMemory(
                addr = addr,
                bufCtorArg = buf,
                bytes = bytes,
                bytesreadCtorArg = bytesread,
            )
    }
}

public class ImagehlpDeferredSymbolLoad64 internal constructor(
    public var sizeOfStruct: UInt,
    public var baseOfImage: ULong,
    public var checkSum: UInt,
    public var timeDateStamp: UInt,
    public var fileName: ByteArray,
    public var reparse: Boolean,
    hFileCtorArg: Handle,
    public var flags: UInt,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        baseOfImage = 0uL,
        checkSum = 0u,
        timeDateStamp = 0u,
        fileName = ByteArray(260),
        reparse = false,
        hFileCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): ULong = this.baseOfImage

    public operator fun component3(): UInt = this.checkSum

    public operator fun component4(): UInt = this.timeDateStamp

    public operator fun component5(): ByteArray = this.fileName

    public operator fun component6(): Boolean = this.reparse

    public operator fun component7(): Handle = this.hFile

    public operator fun component8(): UInt = this.flags

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, baseOfImage: ULong = this.baseOfImage, checkSum: UInt = this.checkSum, timeDateStamp: UInt = this.timeDateStamp, fileName: ByteArray = this.fileName, reparse: Boolean = this.reparse, hFile: Handle = this.hFile, flags: UInt = this.flags): ImagehlpDeferredSymbolLoad64 = ImagehlpDeferredSymbolLoad64(sizeOfStruct = sizeOfStruct, baseOfImage = baseOfImage, checkSum = checkSum, timeDateStamp = timeDateStamp, fileName = fileName, reparse = reparse, hFileCtorArg = hFile, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpDeferredSymbolLoad64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.baseOfImage != other.baseOfImage) return false
        if (this.checkSum != other.checkSum) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.reparse != other.reparse) return false
        if (this.hFile != other.hFile) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.baseOfImage.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.reparse.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            baseOfImage: ULong = 0uL,
            checkSum: UInt = 0u,
            timeDateStamp: UInt = 0u,
            fileName: ByteArray = ByteArray(260),
            reparse: Boolean = false,
            hFile: Handle = MutPtr(0L),
            flags: UInt = 0u,
        ): ImagehlpDeferredSymbolLoad64 =
            ImagehlpDeferredSymbolLoad64(
                sizeOfStruct = sizeOfStruct,
                baseOfImage = baseOfImage,
                checkSum = checkSum,
                timeDateStamp = timeDateStamp,
                fileName = fileName,
                reparse = reparse,
                hFileCtorArg = hFile,
                flags = flags,
            )
    }
}

public class ImagehlpDeferredSymbolLoadw64 internal constructor(
    public var sizeOfStruct: UInt,
    public var baseOfImage: ULong,
    public var checkSum: UInt,
    public var timeDateStamp: UInt,
    public var fileName: UShortArray,
    public var reparse: Boolean,
    hFileCtorArg: Handle,
    public var flags: UInt,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        baseOfImage = 0uL,
        checkSum = 0u,
        timeDateStamp = 0u,
        fileName = UShortArray(261),
        reparse = false,
        hFileCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): ULong = this.baseOfImage

    public operator fun component3(): UInt = this.checkSum

    public operator fun component4(): UInt = this.timeDateStamp

    public operator fun component5(): UShortArray = this.fileName

    public operator fun component6(): Boolean = this.reparse

    public operator fun component7(): Handle = this.hFile

    public operator fun component8(): UInt = this.flags

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, baseOfImage: ULong = this.baseOfImage, checkSum: UInt = this.checkSum, timeDateStamp: UInt = this.timeDateStamp, fileName: UShortArray = this.fileName, reparse: Boolean = this.reparse, hFile: Handle = this.hFile, flags: UInt = this.flags): ImagehlpDeferredSymbolLoadw64 = ImagehlpDeferredSymbolLoadw64(sizeOfStruct = sizeOfStruct, baseOfImage = baseOfImage, checkSum = checkSum, timeDateStamp = timeDateStamp, fileName = fileName, reparse = reparse, hFileCtorArg = hFile, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpDeferredSymbolLoadw64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.baseOfImage != other.baseOfImage) return false
        if (this.checkSum != other.checkSum) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.reparse != other.reparse) return false
        if (this.hFile != other.hFile) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.baseOfImage.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.reparse.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            baseOfImage: ULong = 0uL,
            checkSum: UInt = 0u,
            timeDateStamp: UInt = 0u,
            fileName: UShortArray = UShortArray(261),
            reparse: Boolean = false,
            hFile: Handle = MutPtr(0L),
            flags: UInt = 0u,
        ): ImagehlpDeferredSymbolLoadw64 =
            ImagehlpDeferredSymbolLoadw64(
                sizeOfStruct = sizeOfStruct,
                baseOfImage = baseOfImage,
                checkSum = checkSum,
                timeDateStamp = timeDateStamp,
                fileName = fileName,
                reparse = reparse,
                hFileCtorArg = hFile,
                flags = flags,
            )
    }
}

public class ImagehlpDuplicateSymbol64 internal constructor(
    public var sizeOfStruct: UInt,
    public var numberOfDups: UInt,
    symbolCtorArg: MutPtr<ImagehlpSymbol64>,
    public var selectedSymbol: UInt,
) {
    public var symbol: MutPtr<ImagehlpSymbol64> = symbolCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        numberOfDups = 0u,
        symbolCtorArg = MutPtr(0L),
        selectedSymbol = 0u,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): UInt = this.numberOfDups

    public operator fun component3(): MutPtr<ImagehlpSymbol64> = this.symbol

    public operator fun component4(): UInt = this.selectedSymbol

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, numberOfDups: UInt = this.numberOfDups, symbol: MutPtr<ImagehlpSymbol64> = this.symbol, selectedSymbol: UInt = this.selectedSymbol): ImagehlpDuplicateSymbol64 = ImagehlpDuplicateSymbol64(sizeOfStruct = sizeOfStruct, numberOfDups = numberOfDups, symbolCtorArg = symbol, selectedSymbol = selectedSymbol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpDuplicateSymbol64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.numberOfDups != other.numberOfDups) return false
        if (this.symbol != other.symbol) return false
        if (this.selectedSymbol != other.selectedSymbol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.numberOfDups.hashCode()
        result = 31 * result + this.symbol.hashCode()
        result = 31 * result + this.selectedSymbol.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpDuplicateSymbol64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpDuplicateSymbol64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ImagehlpDuplicateSymbol64 =
                    ImagehlpDuplicateSymbol64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ImagehlpSymbol64>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ImagehlpDuplicateSymbol64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfDups)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ImagehlpSymbol64>(64)
                    ).writeNative(addr + 8L, value.symbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.selectedSymbol)
                }
            }

        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            numberOfDups: UInt = 0u,
            symbol: MutPtr<ImagehlpSymbol64> = MutPtr(0L),
            selectedSymbol: UInt = 0u,
        ): ImagehlpDuplicateSymbol64 =
            ImagehlpDuplicateSymbol64(
                sizeOfStruct = sizeOfStruct,
                numberOfDups = numberOfDups,
                symbolCtorArg = symbol,
                selectedSymbol = selectedSymbol,
            )
    }
}

public class ImagehlpGetTypeInfoParams internal constructor(
    public var sizeOfStruct: UInt,
    public var flags: ImagehlpGetTypeInfoFlags,
    public var numIds: UInt,
    typeIdsCtorArg: MutPtr<UInt>,
    public var tagFilter: ULong,
    public var numReqs: UInt,
    reqKindsCtorArg: MutPtr<ImagehlpSymbolTypeInfo>,
    reqOffsetsCtorArg: MutPtr<Int>,
    reqSizesCtorArg: MutPtr<UInt>,
    public var reqStride: Int,
    public var bufferSize: Int,
    bufferCtorArg: MutPtr<CVoid>,
    public var entriesMatched: UInt,
    public var entriesFilled: UInt,
    public var tagsFound: ULong,
    public var allReqsValid: ULong,
    public var numReqsValid: UInt,
    reqsValidCtorArg: MutPtr<ULong>,
) {
    public var typeIds: MutPtr<UInt> = typeIdsCtorArg
        internal set

    public var reqKinds: MutPtr<ImagehlpSymbolTypeInfo> = reqKindsCtorArg
        internal set

    public var reqOffsets: MutPtr<Int> = reqOffsetsCtorArg
        internal set

    public var reqSizes: MutPtr<UInt> = reqSizesCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public var reqsValid: MutPtr<ULong> = reqsValidCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        flags = 0u,
        numIds = 0u,
        typeIdsCtorArg = MutPtr(0L),
        tagFilter = 0uL,
        numReqs = 0u,
        reqKindsCtorArg = MutPtr(0L),
        reqOffsetsCtorArg = MutPtr(0L),
        reqSizesCtorArg = MutPtr(0L),
        reqStride = 0,
        bufferSize = 0,
        bufferCtorArg = MutPtr(0L),
        entriesMatched = 0u,
        entriesFilled = 0u,
        tagsFound = 0uL,
        allReqsValid = 0uL,
        numReqsValid = 0u,
        reqsValidCtorArg = MutPtr(0L),
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpGetTypeInfoParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpGetTypeInfoParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): ImagehlpGetTypeInfoParams =
                    ImagehlpGetTypeInfoParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ImagehlpSymbolTypeInfo>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: ImagehlpGetTypeInfoParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numIds)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 16L, value.typeIds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.tagFilter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.numReqs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ImagehlpSymbolTypeInfo>(64)
                    ).writeNative(addr + 40L, value.reqKinds)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 48L, value.reqOffsets)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 56L, value.reqSizes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.reqStride)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.entriesMatched)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.entriesFilled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.tagsFound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.allReqsValid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.numReqsValid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 120L, value.reqsValid)
                }
            }

        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            flags: ImagehlpGetTypeInfoFlags = 0u,
            numIds: UInt = 0u,
            typeIds: MutPtr<UInt> = MutPtr(0L),
            tagFilter: ULong = 0uL,
            numReqs: UInt = 0u,
            reqKinds: MutPtr<ImagehlpSymbolTypeInfo> = MutPtr(0L),
            reqOffsets: MutPtr<Int> = MutPtr(0L),
            reqSizes: MutPtr<UInt> = MutPtr(0L),
            reqStride: Int = 0,
            bufferSize: Int = 0,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            entriesMatched: UInt = 0u,
            entriesFilled: UInt = 0u,
            tagsFound: ULong = 0uL,
            allReqsValid: ULong = 0uL,
            numReqsValid: UInt = 0u,
            reqsValid: MutPtr<ULong> = MutPtr(0L),
        ): ImagehlpGetTypeInfoParams =
            ImagehlpGetTypeInfoParams(
                sizeOfStruct = sizeOfStruct,
                flags = flags,
                numIds = numIds,
                typeIdsCtorArg = typeIds,
                tagFilter = tagFilter,
                numReqs = numReqs,
                reqKindsCtorArg = reqKinds,
                reqOffsetsCtorArg = reqOffsets,
                reqSizesCtorArg = reqSizes,
                reqStride = reqStride,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
                entriesMatched = entriesMatched,
                entriesFilled = entriesFilled,
                tagsFound = tagsFound,
                allReqsValid = allReqsValid,
                numReqsValid = numReqsValid,
                reqsValidCtorArg = reqsValid,
            )
    }
}

public data class ImagehlpJitSymbolmap(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var baseOfImage: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpJitSymbolmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpJitSymbolmap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ImagehlpJitSymbolmap =
                    ImagehlpJitSymbolmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ImagehlpJitSymbolmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.baseOfImage)
                }
            }
    }
}

public class ImagehlpLine64 internal constructor(
    public var sizeOfStruct: UInt,
    keyCtorArg: MutPtr<CVoid>,
    public var lineNumber: UInt,
    fileNameCtorArg: Pstr,
    public var address: ULong,
) {
    public var key: MutPtr<CVoid> = keyCtorArg
        internal set

    public var fileName: Pstr = fileNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        keyCtorArg = MutPtr(0L),
        lineNumber = 0u,
        fileNameCtorArg = MutPtr(0L),
        address = 0uL,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): MutPtr<CVoid> = this.key

    public operator fun component3(): UInt = this.lineNumber

    public operator fun component4(): Pstr = this.fileName

    public operator fun component5(): ULong = this.address

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, key: MutPtr<CVoid> = this.key, lineNumber: UInt = this.lineNumber, fileName: Pstr = this.fileName, address: ULong = this.address): ImagehlpLine64 = ImagehlpLine64(sizeOfStruct = sizeOfStruct, keyCtorArg = key, lineNumber = lineNumber, fileNameCtorArg = fileName, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpLine64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.key != other.key) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.fileName != other.fileName) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            key: MutPtr<CVoid> = MutPtr(0L),
            lineNumber: UInt = 0u,
            fileName: Pstr = MutPtr(0L),
            address: ULong = 0uL,
        ): ImagehlpLine64 =
            ImagehlpLine64(
                sizeOfStruct = sizeOfStruct,
                keyCtorArg = key,
                lineNumber = lineNumber,
                fileNameCtorArg = fileName,
                address = address,
            )
    }
}

public class ImagehlpLinew64 internal constructor(
    public var sizeOfStruct: UInt,
    keyCtorArg: MutPtr<CVoid>,
    public var lineNumber: UInt,
    fileNameCtorArg: Pwstr,
    public var address: ULong,
) {
    public var key: MutPtr<CVoid> = keyCtorArg
        internal set

    public var fileName: Pwstr = fileNameCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        keyCtorArg = MutPtr(0L),
        lineNumber = 0u,
        fileNameCtorArg = MutPtr(0L),
        address = 0uL,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): MutPtr<CVoid> = this.key

    public operator fun component3(): UInt = this.lineNumber

    public operator fun component4(): Pwstr = this.fileName

    public operator fun component5(): ULong = this.address

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, key: MutPtr<CVoid> = this.key, lineNumber: UInt = this.lineNumber, fileName: Pwstr = this.fileName, address: ULong = this.address): ImagehlpLinew64 = ImagehlpLinew64(sizeOfStruct = sizeOfStruct, keyCtorArg = key, lineNumber = lineNumber, fileNameCtorArg = fileName, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpLinew64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.key != other.key) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.fileName != other.fileName) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            key: MutPtr<CVoid> = MutPtr(0L),
            lineNumber: UInt = 0u,
            fileName: Pwstr = MutPtr(0L),
            address: ULong = 0uL,
        ): ImagehlpLinew64 =
            ImagehlpLinew64(
                sizeOfStruct = sizeOfStruct,
                keyCtorArg = key,
                lineNumber = lineNumber,
                fileNameCtorArg = fileName,
                address = address,
            )
    }
}

public class ImagehlpModule64(
    public var sizeOfStruct: UInt = 0u,
    public var baseOfImage: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var numSyms: UInt = 0u,
    public var symType: SymType = 0,
    public var moduleName: ByteArray = ByteArray(32),
    public var imageName: ByteArray = ByteArray(256),
    public var loadedImageName: ByteArray = ByteArray(256),
    public var loadedPdbName: ByteArray = ByteArray(256),
    public var cVSig: UInt = 0u,
    public var cVData: ByteArray = ByteArray(780),
    public var pdbSig: UInt = 0u,
    public var pdbSig70: Guid = Guid(),
    public var pdbAge: UInt = 0u,
    public var pdbUnmatched: Bool = 0,
    public var dbgUnmatched: Bool = 0,
    public var lineNumbers: Bool = 0,
    public var globalSymbols: Bool = 0,
    public var typeInfo: Bool = 0,
    public var sourceIndexed: Bool = 0,
    public var publics: Bool = 0,
    public var machineType: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ImagehlpModule64Ex(
    public var module: ImagehlpModule64 = ImagehlpModule64(),
    public var regionFlags: UInt = 0u,
)

public class ImagehlpModulew64(
    public var sizeOfStruct: UInt = 0u,
    public var baseOfImage: ULong = 0uL,
    public var imageSize: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var numSyms: UInt = 0u,
    public var symType: SymType = 0,
    public var moduleName: UShortArray = UShortArray(32),
    public var imageName: UShortArray = UShortArray(256),
    public var loadedImageName: UShortArray = UShortArray(256),
    public var loadedPdbName: UShortArray = UShortArray(256),
    public var cVSig: UInt = 0u,
    public var cVData: UShortArray = UShortArray(780),
    public var pdbSig: UInt = 0u,
    public var pdbSig70: Guid = Guid(),
    public var pdbAge: UInt = 0u,
    public var pdbUnmatched: Bool = 0,
    public var dbgUnmatched: Bool = 0,
    public var lineNumbers: Bool = 0,
    public var globalSymbols: Bool = 0,
    public var typeInfo: Bool = 0,
    public var sourceIndexed: Bool = 0,
    public var publics: Bool = 0,
    public var machineType: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ImagehlpModulew64Ex(
    public var module: ImagehlpModulew64 = ImagehlpModulew64(),
    public var regionFlags: UInt = 0u,
)

public data class ImagehlpStackFrame(
    public var instructionOffset: ULong = 0uL,
    public var returnOffset: ULong = 0uL,
    public var frameOffset: ULong = 0uL,
    public var stackOffset: ULong = 0uL,
    public var backingStoreOffset: ULong = 0uL,
    public var funcTableEntry: ULong = 0uL,
    public var params: ULongArray = ULongArray(4),
    public var reserved: ULongArray = ULongArray(5),
    public var virtual: Bool = 0,
    public var reserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpStackFrame) return false
        if (this.instructionOffset != other.instructionOffset) return false
        if (this.returnOffset != other.returnOffset) return false
        if (this.frameOffset != other.frameOffset) return false
        if (this.stackOffset != other.stackOffset) return false
        if (this.backingStoreOffset != other.backingStoreOffset) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.virtual != other.virtual) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instructionOffset.hashCode()
        result = 31 * result + this.returnOffset.hashCode()
        result = 31 * result + this.frameOffset.hashCode()
        result = 31 * result + this.stackOffset.hashCode()
        result = 31 * result + this.backingStoreOffset.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpStackFrame> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpStackFrame> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): ImagehlpStackFrame =
                    ImagehlpStackFrame(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 48L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 80L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                    )
                override fun writeNative(addr: Long, value: ImagehlpStackFrame) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.instructionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.returnOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.frameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.stackOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.backingStoreOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.funcTableEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 48L, value.params.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 80L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.virtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.reserved2)
                }
            }
    }
}

public data class ImagehlpSymbol64(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var maxNameLength: UInt = 0u,
    public var name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbol64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.address != other.address) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.maxNameLength != other.maxNameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxNameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbol64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbol64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ImagehlpSymbol64 =
                    ImagehlpSymbol64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 28L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImagehlpSymbol64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 28L, value.name.toList())
                }
            }
    }
}

public data class ImagehlpSymbol64Package(
    public var sym: ImagehlpSymbol64 = ImagehlpSymbol64(),
    public var name: ByteArray = ByteArray(2001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbol64Package) return false
        if (this.sym != other.sym) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sym.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbol64Package> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbol64Package> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 2040L
                override fun readNative(addr: Long): ImagehlpSymbol64Package =
                    ImagehlpSymbol64Package(
                        (ImagehlpSymbol64.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2001).toInt())
                        ).readNative(addr + 32L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImagehlpSymbol64Package) {
                    (ImagehlpSymbol64.typeLayout()).writeNative(addr, value.sym)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2001).toInt())
                    ).writeNative(addr + 32L, value.name.toList())
                }
            }
    }
}

public data class ImagehlpSymbolw64(
    public var sizeOfStruct: UInt = 0u,
    public var address: ULong = 0uL,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var maxNameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbolw64) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.address != other.address) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.maxNameLength != other.maxNameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxNameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbolw64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbolw64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ImagehlpSymbolw64 =
                    ImagehlpSymbolw64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ImagehlpSymbolw64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 28L, value.name.toList())
                }
            }
    }
}

public data class ImagehlpSymbolw64Package(
    public var sym: ImagehlpSymbolw64 = ImagehlpSymbolw64(),
    public var name: UShortArray = UShortArray(2001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbolw64Package) return false
        if (this.sym != other.sym) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sym.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbolw64Package> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbolw64Package> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 4040L
                override fun readNative(addr: Long): ImagehlpSymbolw64Package =
                    ImagehlpSymbolw64Package(
                        (ImagehlpSymbolw64.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2001).toInt())
                        ).readNative(addr + 32L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ImagehlpSymbolw64Package) {
                    (ImagehlpSymbolw64.typeLayout()).writeNative(addr, value.sym)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2001).toInt())
                    ).writeNative(addr + 32L, value.name.toList())
                }
            }
    }
}

public data class ImagehlpSymbolSrc(
    public var sizeofstruct: UInt = 0u,
    public var type: UInt = 0u,
    public var file: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImagehlpSymbolSrc) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (this.type != other.type) return false
        if (!this.file.contentEquals(other.file)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.file.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbolSrc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImagehlpSymbolSrc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): ImagehlpSymbolSrc =
                    ImagehlpSymbolSrc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: ImagehlpSymbolSrc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeofstruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 8L, value.file.toList())
                }
            }
    }
}

public data class ImageArm64RuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var anonymous: ImageArm64RuntimeFunctionEntry0 = ImageArm64RuntimeFunctionEntry0(),
)

public data class ImageArm64RuntimeFunctionEntry0(
    public var unwindData: UInt = 0u,
    public var anonymous: ImageArm64RuntimeFunctionEntry00 = ImageArm64RuntimeFunctionEntry00(),
)

public data class ImageArm64RuntimeFunctionEntry00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArm64RuntimeFunctionEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageArm64RuntimeFunctionEntry00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ImageArm64RuntimeFunctionEntry00 =
                    ImageArm64RuntimeFunctionEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ImageArm64RuntimeFunctionEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ImageCoffSymbolsHeader(
    public var numberOfSymbols: UInt = 0u,
    public var lvaToFirstSymbol: UInt = 0u,
    public var numberOfLinenumbers: UInt = 0u,
    public var lvaToFirstLinenumber: UInt = 0u,
    public var rvaToFirstByteOfCode: UInt = 0u,
    public var rvaToLastByteOfCode: UInt = 0u,
    public var rvaToFirstByteOfData: UInt = 0u,
    public var rvaToLastByteOfData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageCoffSymbolsHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageCoffSymbolsHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ImageCoffSymbolsHeader =
                    ImageCoffSymbolsHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: ImageCoffSymbolsHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfSymbols)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lvaToFirstSymbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfLinenumbers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lvaToFirstLinenumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rvaToFirstByteOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rvaToLastByteOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.rvaToFirstByteOfData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.rvaToLastByteOfData)
                }
            }
    }
}

public data class ImageCor20Header(
    public var cb: UInt = 0u,
    public var majorRuntimeVersion: UShort = 0u,
    public var minorRuntimeVersion: UShort = 0u,
    public var metaData: ImageDataDirectory = ImageDataDirectory(),
    public var flags: UInt = 0u,
    public var anonymous: ImageCor20Header0 = ImageCor20Header0(),
    public var resources: ImageDataDirectory = ImageDataDirectory(),
    public var strongNameSignature: ImageDataDirectory = ImageDataDirectory(),
    public var codeManagerTable: ImageDataDirectory = ImageDataDirectory(),
    public var vTableFixups: ImageDataDirectory = ImageDataDirectory(),
    public var exportAddressTableJumps: ImageDataDirectory = ImageDataDirectory(),
    public var managedNativeHeader: ImageDataDirectory = ImageDataDirectory(),
)

public data class ImageCor20Header0(
    public var entryPointToken: UInt = 0u,
    public var entryPointRVA: UInt = 0u,
)

public data class ImageDataDirectory(
    public var virtualAddress: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDataDirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDataDirectory> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ImageDataDirectory =
                    ImageDataDirectory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ImageDataDirectory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.virtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class ImageDebugDirectory(
    public var characteristics: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var type: ImageDebugType = 0u,
    public var sizeOfData: UInt = 0u,
    public var addressOfRawData: UInt = 0u,
    public var pointerToRawData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDebugDirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageDebugDirectory> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): ImageDebugDirectory =
                    ImageDebugDirectory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ImageDebugDirectory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.characteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sizeOfData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.addressOfRawData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pointerToRawData)
                }
            }
    }
}

public data class ImageFileHeader(
    public var machine: ImageFileMachine = 0u,
    public var numberOfSections: UShort = 0u,
    public var timeDateStamp: UInt = 0u,
    public var pointerToSymbolTable: UInt = 0u,
    public var numberOfSymbols: UInt = 0u,
    public var sizeOfOptionalHeader: UShort = 0u,
    public var characteristics: ImageFileCharacteristics = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFileHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFileHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ImageFileHeader =
                    ImageFileHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: ImageFileHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.machine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.numberOfSections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pointerToSymbolTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfSymbols)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.sizeOfOptionalHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.characteristics)
                }
            }
    }
}

public data class ImageFunctionEntry(
    public var startingAddress: UInt = 0u,
    public var endingAddress: UInt = 0u,
    public var endOfPrologue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFunctionEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageFunctionEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ImageFunctionEntry =
                    ImageFunctionEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ImageFunctionEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.startingAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.endingAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endOfPrologue)
                }
            }
    }
}

public data class ImageFunctionEntry64(
    public var startingAddress: ULong = 0uL,
    public var endingAddress: ULong = 0uL,
    public var anonymous: ImageFunctionEntry640 = ImageFunctionEntry640(),
)

public data class ImageFunctionEntry640(
    public var endOfPrologue: ULong = 0uL,
    public var unwindInfoAddress: ULong = 0uL,
)

public data class ImageLoadConfigCodeIntegrity(
    public var flags: UShort = 0u,
    public var catalog: UShort = 0u,
    public var catalogOffset: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageLoadConfigCodeIntegrity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageLoadConfigCodeIntegrity> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ImageLoadConfigCodeIntegrity =
                    ImageLoadConfigCodeIntegrity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ImageLoadConfigCodeIntegrity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.catalog)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.catalogOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved)
                }
            }
    }
}

public class ImageLoadConfigDirectory32(
    public var size: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var globalFlagsClear: UInt = 0u,
    public var globalFlagsSet: UInt = 0u,
    public var criticalSectionDefaultTimeout: UInt = 0u,
    public var deCommitFreeBlockThreshold: UInt = 0u,
    public var deCommitTotalFreeThreshold: UInt = 0u,
    public var lockPrefixTable: UInt = 0u,
    public var maximumAllocationSize: UInt = 0u,
    public var virtualMemoryThreshold: UInt = 0u,
    public var processHeapFlags: UInt = 0u,
    public var processAffinityMask: UInt = 0u,
    public var cSDVersion: UShort = 0u,
    public var dependentLoadFlags: UShort = 0u,
    public var editList: UInt = 0u,
    public var securityCookie: UInt = 0u,
    public var sEHandlerTable: UInt = 0u,
    public var sEHandlerCount: UInt = 0u,
    public var guardCFCheckFunctionPointer: UInt = 0u,
    public var guardCFDispatchFunctionPointer: UInt = 0u,
    public var guardCFFunctionTable: UInt = 0u,
    public var guardCFFunctionCount: UInt = 0u,
    public var guardFlags: UInt = 0u,
    public var codeIntegrity: ImageLoadConfigCodeIntegrity = ImageLoadConfigCodeIntegrity(),
    public var guardAddressTakenIatEntryTable: UInt = 0u,
    public var guardAddressTakenIatEntryCount: UInt = 0u,
    public var guardLongJumpTargetTable: UInt = 0u,
    public var guardLongJumpTargetCount: UInt = 0u,
    public var dynamicValueRelocTable: UInt = 0u,
    public var cHPEMetadataPointer: UInt = 0u,
    public var guardRFFailureRoutine: UInt = 0u,
    public var guardRFFailureRoutineFunctionPointer: UInt = 0u,
    public var dynamicValueRelocTableOffset: UInt = 0u,
    public var dynamicValueRelocTableSection: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var guardRFVerifyStackPointerFunctionPointer: UInt = 0u,
    public var hotPatchTableOffset: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var enclaveConfigurationPointer: UInt = 0u,
    public var volatileMetadataPointer: UInt = 0u,
    public var guardEHContinuationTable: UInt = 0u,
    public var guardEHContinuationCount: UInt = 0u,
    public var guardXFGCheckFunctionPointer: UInt = 0u,
    public var guardXFGDispatchFunctionPointer: UInt = 0u,
    public var guardXFGTableDispatchFunctionPointer: UInt = 0u,
    public var castGuardOsDeterminedFailureMode: UInt = 0u,
    public var guardMemcpyFunctionPointer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageLoadConfigDirectory32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageLoadConfigDirectory32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): ImageLoadConfigDirectory32 =
                    ImageLoadConfigDirectory32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (ImageLoadConfigCodeIntegrity.typeLayout()).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 142L),
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
                    )
                override fun writeNative(addr: Long, value: ImageLoadConfigDirectory32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.globalFlagsClear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.globalFlagsSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.criticalSectionDefaultTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.deCommitFreeBlockThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.deCommitTotalFreeThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.lockPrefixTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maximumAllocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.virtualMemoryThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.processHeapFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.processAffinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.cSDVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.dependentLoadFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.editList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.securityCookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.sEHandlerTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.sEHandlerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.guardCFCheckFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.guardCFDispatchFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.guardCFFunctionTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.guardCFFunctionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.guardFlags)
                    (ImageLoadConfigCodeIntegrity.typeLayout()).writeNative(addr + 92L, value.codeIntegrity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.guardAddressTakenIatEntryTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.guardAddressTakenIatEntryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.guardLongJumpTargetTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.guardLongJumpTargetCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dynamicValueRelocTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.cHPEMetadataPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.guardRFFailureRoutine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.guardRFFailureRoutineFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dynamicValueRelocTableOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 140L, value.dynamicValueRelocTableSection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 142L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.guardRFVerifyStackPointerFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.hotPatchTableOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.enclaveConfigurationPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.volatileMetadataPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.guardEHContinuationTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.guardEHContinuationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.guardXFGCheckFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.guardXFGDispatchFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.guardXFGTableDispatchFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.castGuardOsDeterminedFailureMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.guardMemcpyFunctionPointer)
                }
            }
    }
}

public class ImageLoadConfigDirectory64(
    public var size: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var globalFlagsClear: UInt = 0u,
    public var globalFlagsSet: UInt = 0u,
    public var criticalSectionDefaultTimeout: UInt = 0u,
    public var deCommitFreeBlockThreshold: ULong = 0uL,
    public var deCommitTotalFreeThreshold: ULong = 0uL,
    public var lockPrefixTable: ULong = 0uL,
    public var maximumAllocationSize: ULong = 0uL,
    public var virtualMemoryThreshold: ULong = 0uL,
    public var processAffinityMask: ULong = 0uL,
    public var processHeapFlags: UInt = 0u,
    public var cSDVersion: UShort = 0u,
    public var dependentLoadFlags: UShort = 0u,
    public var editList: ULong = 0uL,
    public var securityCookie: ULong = 0uL,
    public var sEHandlerTable: ULong = 0uL,
    public var sEHandlerCount: ULong = 0uL,
    public var guardCFCheckFunctionPointer: ULong = 0uL,
    public var guardCFDispatchFunctionPointer: ULong = 0uL,
    public var guardCFFunctionTable: ULong = 0uL,
    public var guardCFFunctionCount: ULong = 0uL,
    public var guardFlags: UInt = 0u,
    public var codeIntegrity: ImageLoadConfigCodeIntegrity = ImageLoadConfigCodeIntegrity(),
    public var guardAddressTakenIatEntryTable: ULong = 0uL,
    public var guardAddressTakenIatEntryCount: ULong = 0uL,
    public var guardLongJumpTargetTable: ULong = 0uL,
    public var guardLongJumpTargetCount: ULong = 0uL,
    public var dynamicValueRelocTable: ULong = 0uL,
    public var cHPEMetadataPointer: ULong = 0uL,
    public var guardRFFailureRoutine: ULong = 0uL,
    public var guardRFFailureRoutineFunctionPointer: ULong = 0uL,
    public var dynamicValueRelocTableOffset: UInt = 0u,
    public var dynamicValueRelocTableSection: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var guardRFVerifyStackPointerFunctionPointer: ULong = 0uL,
    public var hotPatchTableOffset: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var enclaveConfigurationPointer: ULong = 0uL,
    public var volatileMetadataPointer: ULong = 0uL,
    public var guardEHContinuationTable: ULong = 0uL,
    public var guardEHContinuationCount: ULong = 0uL,
    public var guardXFGCheckFunctionPointer: ULong = 0uL,
    public var guardXFGDispatchFunctionPointer: ULong = 0uL,
    public var guardXFGTableDispatchFunctionPointer: ULong = 0uL,
    public var castGuardOsDeterminedFailureMode: ULong = 0uL,
    public var guardMemcpyFunctionPointer: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageLoadConfigDirectory64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageLoadConfigDirectory64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 320L
                override fun readNative(addr: Long): ImageLoadConfigDirectory64 =
                    ImageLoadConfigDirectory64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 78L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (ImageLoadConfigCodeIntegrity.typeLayout()).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 228L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 230L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 244L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 312L),
                    )
                override fun writeNative(addr: Long, value: ImageLoadConfigDirectory64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.globalFlagsClear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.globalFlagsSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.criticalSectionDefaultTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.deCommitFreeBlockThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.deCommitTotalFreeThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.lockPrefixTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.maximumAllocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.virtualMemoryThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.processAffinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.processHeapFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 76L, value.cSDVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 78L, value.dependentLoadFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.editList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.securityCookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.sEHandlerTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.sEHandlerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.guardCFCheckFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.guardCFDispatchFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.guardCFFunctionTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.guardCFFunctionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.guardFlags)
                    (ImageLoadConfigCodeIntegrity.typeLayout()).writeNative(addr + 148L, value.codeIntegrity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.guardAddressTakenIatEntryTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.guardAddressTakenIatEntryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.guardLongJumpTargetTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.guardLongJumpTargetCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.dynamicValueRelocTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.cHPEMetadataPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.guardRFFailureRoutine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.guardRFFailureRoutineFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 224L, value.dynamicValueRelocTableOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 228L, value.dynamicValueRelocTableSection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 230L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.guardRFVerifyStackPointerFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 240L, value.hotPatchTableOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 244L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.enclaveConfigurationPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.volatileMetadataPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.guardEHContinuationTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 272L, value.guardEHContinuationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 280L, value.guardXFGCheckFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 288L, value.guardXFGDispatchFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 296L, value.guardXFGTableDispatchFunctionPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 304L, value.castGuardOsDeterminedFailureMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 312L, value.guardMemcpyFunctionPointer)
                }
            }
    }
}

public data class ImageNtHeaders32(
    public var signature: UInt = 0u,
    public var fileHeader: ImageFileHeader = ImageFileHeader(),
    public var optionalHeader: ImageOptionalHeader32 = ImageOptionalHeader32(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageNtHeaders32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageNtHeaders32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 248L
                override fun readNative(addr: Long): ImageNtHeaders32 =
                    ImageNtHeaders32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (ImageFileHeader.typeLayout()).readNative(addr + 4L),
                        (ImageOptionalHeader32.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ImageNtHeaders32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (ImageFileHeader.typeLayout()).writeNative(addr + 4L, value.fileHeader)
                    (ImageOptionalHeader32.typeLayout()).writeNative(addr + 24L, value.optionalHeader)
                }
            }
    }
}

public data class ImageNtHeaders64(
    public var signature: UInt = 0u,
    public var fileHeader: ImageFileHeader = ImageFileHeader(),
    public var optionalHeader: ImageOptionalHeader64 = ImageOptionalHeader64(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageNtHeaders64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageNtHeaders64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): ImageNtHeaders64 =
                    ImageNtHeaders64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (ImageFileHeader.typeLayout()).readNative(addr + 4L),
                        (ImageOptionalHeader64.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ImageNtHeaders64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (ImageFileHeader.typeLayout()).writeNative(addr + 4L, value.fileHeader)
                    (ImageOptionalHeader64.typeLayout()).writeNative(addr + 24L, value.optionalHeader)
                }
            }
    }
}

public class ImageOptionalHeader32(
    public var magic: ImageOptionalHeaderMagic = 0u,
    public var majorLinkerVersion: UByte = 0u,
    public var minorLinkerVersion: UByte = 0u,
    public var sizeOfCode: UInt = 0u,
    public var sizeOfInitializedData: UInt = 0u,
    public var sizeOfUninitializedData: UInt = 0u,
    public var addressOfEntryPoint: UInt = 0u,
    public var baseOfCode: UInt = 0u,
    public var baseOfData: UInt = 0u,
    public var imageBase: UInt = 0u,
    public var sectionAlignment: UInt = 0u,
    public var fileAlignment: UInt = 0u,
    public var majorOperatingSystemVersion: UShort = 0u,
    public var minorOperatingSystemVersion: UShort = 0u,
    public var majorImageVersion: UShort = 0u,
    public var minorImageVersion: UShort = 0u,
    public var majorSubsystemVersion: UShort = 0u,
    public var minorSubsystemVersion: UShort = 0u,
    public var win32VersionValue: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var sizeOfHeaders: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var subsystem: ImageSubsystem = 0u,
    public var dllCharacteristics: ImageDllCharacteristics = 0u,
    public var sizeOfStackReserve: UInt = 0u,
    public var sizeOfStackCommit: UInt = 0u,
    public var sizeOfHeapReserve: UInt = 0u,
    public var sizeOfHeapCommit: UInt = 0u,
    public var loaderFlags: UInt = 0u,
    public var numberOfRvaAndSizes: UInt = 0u,
    public var dataDirectory: List<ImageDataDirectory> = List(16) { ImageDataDirectory() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOptionalHeader32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOptionalHeader32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): ImageOptionalHeader32 =
                    ImageOptionalHeader32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 70L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ImageDataDirectory.typeLayout(), (16).toInt())
                        ).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: ImageOptionalHeader32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.majorLinkerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.minorLinkerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfInitializedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sizeOfUninitializedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.addressOfEntryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.baseOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.baseOfData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.imageBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sectionAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.fileAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.majorOperatingSystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.minorOperatingSystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.majorImageVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.minorImageVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.majorSubsystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.minorSubsystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.win32VersionValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.sizeOfImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.sizeOfHeaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 68L, value.subsystem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 70L, value.dllCharacteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.sizeOfStackReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.sizeOfStackCommit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.sizeOfHeapReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.sizeOfHeapCommit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.loaderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.numberOfRvaAndSizes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ImageDataDirectory.typeLayout(), (16).toInt())
                    ).writeNative(addr + 96L, value.dataDirectory)
                }
            }
    }
}

public class ImageOptionalHeader64(
    public var magic: ImageOptionalHeaderMagic = 0u,
    public var majorLinkerVersion: UByte = 0u,
    public var minorLinkerVersion: UByte = 0u,
    public var sizeOfCode: UInt = 0u,
    public var sizeOfInitializedData: UInt = 0u,
    public var sizeOfUninitializedData: UInt = 0u,
    public var addressOfEntryPoint: UInt = 0u,
    public var baseOfCode: UInt = 0u,
    public var imageBase: ULong = 0uL,
    public var sectionAlignment: UInt = 0u,
    public var fileAlignment: UInt = 0u,
    public var majorOperatingSystemVersion: UShort = 0u,
    public var minorOperatingSystemVersion: UShort = 0u,
    public var majorImageVersion: UShort = 0u,
    public var minorImageVersion: UShort = 0u,
    public var majorSubsystemVersion: UShort = 0u,
    public var minorSubsystemVersion: UShort = 0u,
    public var win32VersionValue: UInt = 0u,
    public var sizeOfImage: UInt = 0u,
    public var sizeOfHeaders: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var subsystem: ImageSubsystem = 0u,
    public var dllCharacteristics: ImageDllCharacteristics = 0u,
    public var sizeOfStackReserve: ULong = 0uL,
    public var sizeOfStackCommit: ULong = 0uL,
    public var sizeOfHeapReserve: ULong = 0uL,
    public var sizeOfHeapCommit: ULong = 0uL,
    public var loaderFlags: UInt = 0u,
    public var numberOfRvaAndSizes: UInt = 0u,
    public var dataDirectory: List<ImageDataDirectory> = List(16) { ImageDataDirectory() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOptionalHeader64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOptionalHeader64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 240L
                override fun readNative(addr: Long): ImageOptionalHeader64 =
                    ImageOptionalHeader64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 70L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ImageDataDirectory.typeLayout(), (16).toInt())
                        ).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: ImageOptionalHeader64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.majorLinkerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.minorLinkerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfInitializedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sizeOfUninitializedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.addressOfEntryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.baseOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.imageBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sectionAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.fileAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.majorOperatingSystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.minorOperatingSystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.majorImageVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.minorImageVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.majorSubsystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.minorSubsystemVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.win32VersionValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.sizeOfImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.sizeOfHeaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 68L, value.subsystem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 70L, value.dllCharacteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.sizeOfStackReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.sizeOfStackCommit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.sizeOfHeapReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.sizeOfHeapCommit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.loaderFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.numberOfRvaAndSizes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ImageDataDirectory.typeLayout(), (16).toInt())
                    ).writeNative(addr + 112L, value.dataDirectory)
                }
            }
    }
}

public data class ImageRomHeaders(
    public var fileHeader: ImageFileHeader = ImageFileHeader(),
    public var optionalHeader: ImageRomOptionalHeader = ImageRomOptionalHeader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageRomHeaders> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageRomHeaders> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): ImageRomHeaders =
                    ImageRomHeaders(
                        (ImageFileHeader.typeLayout()).readNative(addr),
                        (ImageRomOptionalHeader.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: ImageRomHeaders) {
                    (ImageFileHeader.typeLayout()).writeNative(addr, value.fileHeader)
                    (ImageRomOptionalHeader.typeLayout()).writeNative(addr + 20L, value.optionalHeader)
                }
            }
    }
}

public data class ImageRomOptionalHeader(
    public var magic: UShort = 0u,
    public var majorLinkerVersion: UByte = 0u,
    public var minorLinkerVersion: UByte = 0u,
    public var sizeOfCode: UInt = 0u,
    public var sizeOfInitializedData: UInt = 0u,
    public var sizeOfUninitializedData: UInt = 0u,
    public var addressOfEntryPoint: UInt = 0u,
    public var baseOfCode: UInt = 0u,
    public var baseOfData: UInt = 0u,
    public var baseOfBss: UInt = 0u,
    public var gprMask: UInt = 0u,
    public var cprMask: UIntArray = UIntArray(4),
    public var gpValue: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageRomOptionalHeader) return false
        if (this.magic != other.magic) return false
        if (this.majorLinkerVersion != other.majorLinkerVersion) return false
        if (this.minorLinkerVersion != other.minorLinkerVersion) return false
        if (this.sizeOfCode != other.sizeOfCode) return false
        if (this.sizeOfInitializedData != other.sizeOfInitializedData) return false
        if (this.sizeOfUninitializedData != other.sizeOfUninitializedData) return false
        if (this.addressOfEntryPoint != other.addressOfEntryPoint) return false
        if (this.baseOfCode != other.baseOfCode) return false
        if (this.baseOfData != other.baseOfData) return false
        if (this.baseOfBss != other.baseOfBss) return false
        if (this.gprMask != other.gprMask) return false
        if (!this.cprMask.contentEquals(other.cprMask)) return false
        if (this.gpValue != other.gpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.magic.hashCode()
        result = 31 * result + this.majorLinkerVersion.hashCode()
        result = 31 * result + this.minorLinkerVersion.hashCode()
        result = 31 * result + this.sizeOfCode.hashCode()
        result = 31 * result + this.sizeOfInitializedData.hashCode()
        result = 31 * result + this.sizeOfUninitializedData.hashCode()
        result = 31 * result + this.addressOfEntryPoint.hashCode()
        result = 31 * result + this.baseOfCode.hashCode()
        result = 31 * result + this.baseOfData.hashCode()
        result = 31 * result + this.baseOfBss.hashCode()
        result = 31 * result + this.gprMask.hashCode()
        result = 31 * result + this.cprMask.contentHashCode()
        result = 31 * result + this.gpValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageRomOptionalHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageRomOptionalHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): ImageRomOptionalHeader =
                    ImageRomOptionalHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 36L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: ImageRomOptionalHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.majorLinkerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.minorLinkerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfInitializedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sizeOfUninitializedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.addressOfEntryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.baseOfCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.baseOfData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.baseOfBss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.gprMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 36L, value.cprMask.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.gpValue)
                }
            }
    }
}

public data class ImageRuntimeFunctionEntry(
    public var beginAddress: UInt = 0u,
    public var endAddress: UInt = 0u,
    public var anonymous: ImageRuntimeFunctionEntry0 = ImageRuntimeFunctionEntry0(),
)

public data class ImageRuntimeFunctionEntry0(
    public var unwindInfoAddress: UInt = 0u,
    public var unwindData: UInt = 0u,
)

public data class ImageSectionHeader(
    public var name: UByteArray = UByteArray(8),
    public var misc: ImageSectionHeader0 = ImageSectionHeader0(),
    public var virtualAddress: UInt = 0u,
    public var sizeOfRawData: UInt = 0u,
    public var pointerToRawData: UInt = 0u,
    public var pointerToRelocations: UInt = 0u,
    public var pointerToLinenumbers: UInt = 0u,
    public var numberOfRelocations: UShort = 0u,
    public var numberOfLinenumbers: UShort = 0u,
    public var characteristics: ImageSectionCharacteristics = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageSectionHeader) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.misc != other.misc) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.sizeOfRawData != other.sizeOfRawData) return false
        if (this.pointerToRawData != other.pointerToRawData) return false
        if (this.pointerToRelocations != other.pointerToRelocations) return false
        if (this.pointerToLinenumbers != other.pointerToLinenumbers) return false
        if (this.numberOfRelocations != other.numberOfRelocations) return false
        if (this.numberOfLinenumbers != other.numberOfLinenumbers) return false
        if (this.characteristics != other.characteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.misc.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        result = 31 * result + this.sizeOfRawData.hashCode()
        result = 31 * result + this.pointerToRawData.hashCode()
        result = 31 * result + this.pointerToRelocations.hashCode()
        result = 31 * result + this.pointerToLinenumbers.hashCode()
        result = 31 * result + this.numberOfRelocations.hashCode()
        result = 31 * result + this.numberOfLinenumbers.hashCode()
        result = 31 * result + this.characteristics.hashCode()
        return result
    }
}

public data class ImageSectionHeader0(
    public var physicalAddress: UInt = 0u,
    public var virtualSize: UInt = 0u,
)

public data class IpmiOsSelRecord(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var recordType: IpmiOsSelRecordType = 0,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpmiOsSelRecord) return false
        if (this.signature != other.signature) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.recordType != other.recordType) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.recordType.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpmiOsSelRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpmiOsSelRecord> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 21L
                override fun readNative(addr: Long): IpmiOsSelRecord =
                    IpmiOsSelRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: IpmiOsSelRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.signature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.recordType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.data.toList())
                }
            }
    }
}

public class Kdhelp64(
    public var thread: ULong = 0uL,
    public var thCallbackStack: UInt = 0u,
    public var thCallbackBStore: UInt = 0u,
    public var nextCallback: UInt = 0u,
    public var framePointer: UInt = 0u,
    public var kiCallUserMode: ULong = 0uL,
    public var keUserCallbackDispatcher: ULong = 0uL,
    public var systemRangeStart: ULong = 0uL,
    public var kiUserExceptionDispatcher: ULong = 0uL,
    public var stackBase: ULong = 0uL,
    public var stackLimit: ULong = 0uL,
    public var buildVersion: UInt = 0u,
    public var retpolineStubFunctionTableSize: UInt = 0u,
    public var retpolineStubFunctionTable: ULong = 0uL,
    public var retpolineStubOffset: UInt = 0u,
    public var retpolineStubSize: UInt = 0u,
    public var reserved0: ULongArray = ULongArray(2),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kdhelp64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kdhelp64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): Kdhelp64 =
                    Kdhelp64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 96L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: Kdhelp64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.thread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.thCallbackStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.thCallbackBStore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nextCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.framePointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.kiCallUserMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.keUserCallbackDispatcher)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.systemRangeStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.kiUserExceptionDispatcher)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.stackBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.stackLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.buildVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.retpolineStubFunctionTableSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.retpolineStubFunctionTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.retpolineStubOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.retpolineStubSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 96L, value.reserved0.toList())
                }
            }
    }
}

public data class KnonvolatileContextPointers(
    public var anonymous1: KnonvolatileContextPointers0 = KnonvolatileContextPointers0(),
    public var anonymous2: KnonvolatileContextPointers1 = KnonvolatileContextPointers1(),
)

public class KnonvolatileContextPointers0 internal constructor(
    floatingContextCtorArg: List<MutPtr<M128a>>,
    public var anonymous: KnonvolatileContextPointers00,
) {
    public var floatingContext: List<MutPtr<M128a>> = floatingContextCtorArg
        internal set

    public constructor() : this(
        floatingContextCtorArg = List(16) { MutPtr(0L) },
        anonymous = KnonvolatileContextPointers00(),
    )

    public operator fun component1(): List<MutPtr<M128a>> = this.floatingContext

    public operator fun component2(): KnonvolatileContextPointers00 = this.anonymous

    public fun copy(floatingContext: List<MutPtr<M128a>> = this.floatingContext, anonymous: KnonvolatileContextPointers00 = this.anonymous): KnonvolatileContextPointers0 = KnonvolatileContextPointers0(floatingContextCtorArg = floatingContext, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KnonvolatileContextPointers0) return false
        if (this.floatingContext != other.floatingContext) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.floatingContext.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            floatingContext: List<MutPtr<M128a>> = List(16) { MutPtr(0L) },
            anonymous: KnonvolatileContextPointers00 = KnonvolatileContextPointers00(),
        ): KnonvolatileContextPointers0 =
            KnonvolatileContextPointers0(
                floatingContextCtorArg = floatingContext,
                anonymous = anonymous,
            )
    }
}

public class KnonvolatileContextPointers00 internal constructor(
    xmm0CtorArg: MutPtr<M128a>,
    xmm1CtorArg: MutPtr<M128a>,
    xmm2CtorArg: MutPtr<M128a>,
    xmm3CtorArg: MutPtr<M128a>,
    xmm4CtorArg: MutPtr<M128a>,
    xmm5CtorArg: MutPtr<M128a>,
    xmm6CtorArg: MutPtr<M128a>,
    xmm7CtorArg: MutPtr<M128a>,
    xmm8CtorArg: MutPtr<M128a>,
    xmm9CtorArg: MutPtr<M128a>,
    xmm10CtorArg: MutPtr<M128a>,
    xmm11CtorArg: MutPtr<M128a>,
    xmm12CtorArg: MutPtr<M128a>,
    xmm13CtorArg: MutPtr<M128a>,
    xmm14CtorArg: MutPtr<M128a>,
    xmm15CtorArg: MutPtr<M128a>,
) {
    public var xmm0: MutPtr<M128a> = xmm0CtorArg
        internal set

    public var xmm1: MutPtr<M128a> = xmm1CtorArg
        internal set

    public var xmm2: MutPtr<M128a> = xmm2CtorArg
        internal set

    public var xmm3: MutPtr<M128a> = xmm3CtorArg
        internal set

    public var xmm4: MutPtr<M128a> = xmm4CtorArg
        internal set

    public var xmm5: MutPtr<M128a> = xmm5CtorArg
        internal set

    public var xmm6: MutPtr<M128a> = xmm6CtorArg
        internal set

    public var xmm7: MutPtr<M128a> = xmm7CtorArg
        internal set

    public var xmm8: MutPtr<M128a> = xmm8CtorArg
        internal set

    public var xmm9: MutPtr<M128a> = xmm9CtorArg
        internal set

    public var xmm10: MutPtr<M128a> = xmm10CtorArg
        internal set

    public var xmm11: MutPtr<M128a> = xmm11CtorArg
        internal set

    public var xmm12: MutPtr<M128a> = xmm12CtorArg
        internal set

    public var xmm13: MutPtr<M128a> = xmm13CtorArg
        internal set

    public var xmm14: MutPtr<M128a> = xmm14CtorArg
        internal set

    public var xmm15: MutPtr<M128a> = xmm15CtorArg
        internal set

    public constructor() : this(
        xmm0CtorArg = MutPtr(0L),
        xmm1CtorArg = MutPtr(0L),
        xmm2CtorArg = MutPtr(0L),
        xmm3CtorArg = MutPtr(0L),
        xmm4CtorArg = MutPtr(0L),
        xmm5CtorArg = MutPtr(0L),
        xmm6CtorArg = MutPtr(0L),
        xmm7CtorArg = MutPtr(0L),
        xmm8CtorArg = MutPtr(0L),
        xmm9CtorArg = MutPtr(0L),
        xmm10CtorArg = MutPtr(0L),
        xmm11CtorArg = MutPtr(0L),
        xmm12CtorArg = MutPtr(0L),
        xmm13CtorArg = MutPtr(0L),
        xmm14CtorArg = MutPtr(0L),
        xmm15CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<M128a> = this.xmm0

    public operator fun component2(): MutPtr<M128a> = this.xmm1

    public operator fun component3(): MutPtr<M128a> = this.xmm2

    public operator fun component4(): MutPtr<M128a> = this.xmm3

    public operator fun component5(): MutPtr<M128a> = this.xmm4

    public operator fun component6(): MutPtr<M128a> = this.xmm5

    public operator fun component7(): MutPtr<M128a> = this.xmm6

    public operator fun component8(): MutPtr<M128a> = this.xmm7

    public operator fun component9(): MutPtr<M128a> = this.xmm8

    public operator fun component10(): MutPtr<M128a> = this.xmm9

    public operator fun component11(): MutPtr<M128a> = this.xmm10

    public operator fun component12(): MutPtr<M128a> = this.xmm11

    public operator fun component13(): MutPtr<M128a> = this.xmm12

    public operator fun component14(): MutPtr<M128a> = this.xmm13

    public operator fun component15(): MutPtr<M128a> = this.xmm14

    public operator fun component16(): MutPtr<M128a> = this.xmm15

    public fun copy(xmm0: MutPtr<M128a> = this.xmm0, xmm1: MutPtr<M128a> = this.xmm1, xmm2: MutPtr<M128a> = this.xmm2, xmm3: MutPtr<M128a> = this.xmm3, xmm4: MutPtr<M128a> = this.xmm4, xmm5: MutPtr<M128a> = this.xmm5, xmm6: MutPtr<M128a> = this.xmm6, xmm7: MutPtr<M128a> = this.xmm7, xmm8: MutPtr<M128a> = this.xmm8, xmm9: MutPtr<M128a> = this.xmm9, xmm10: MutPtr<M128a> = this.xmm10, xmm11: MutPtr<M128a> = this.xmm11, xmm12: MutPtr<M128a> = this.xmm12, xmm13: MutPtr<M128a> = this.xmm13, xmm14: MutPtr<M128a> = this.xmm14, xmm15: MutPtr<M128a> = this.xmm15): KnonvolatileContextPointers00 = KnonvolatileContextPointers00(xmm0CtorArg = xmm0, xmm1CtorArg = xmm1, xmm2CtorArg = xmm2, xmm3CtorArg = xmm3, xmm4CtorArg = xmm4, xmm5CtorArg = xmm5, xmm6CtorArg = xmm6, xmm7CtorArg = xmm7, xmm8CtorArg = xmm8, xmm9CtorArg = xmm9, xmm10CtorArg = xmm10, xmm11CtorArg = xmm11, xmm12CtorArg = xmm12, xmm13CtorArg = xmm13, xmm14CtorArg = xmm14, xmm15CtorArg = xmm15)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KnonvolatileContextPointers00) return false
        if (this.xmm0 != other.xmm0) return false
        if (this.xmm1 != other.xmm1) return false
        if (this.xmm2 != other.xmm2) return false
        if (this.xmm3 != other.xmm3) return false
        if (this.xmm4 != other.xmm4) return false
        if (this.xmm5 != other.xmm5) return false
        if (this.xmm6 != other.xmm6) return false
        if (this.xmm7 != other.xmm7) return false
        if (this.xmm8 != other.xmm8) return false
        if (this.xmm9 != other.xmm9) return false
        if (this.xmm10 != other.xmm10) return false
        if (this.xmm11 != other.xmm11) return false
        if (this.xmm12 != other.xmm12) return false
        if (this.xmm13 != other.xmm13) return false
        if (this.xmm14 != other.xmm14) return false
        if (this.xmm15 != other.xmm15) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.xmm0.hashCode()
        result = 31 * result + this.xmm1.hashCode()
        result = 31 * result + this.xmm2.hashCode()
        result = 31 * result + this.xmm3.hashCode()
        result = 31 * result + this.xmm4.hashCode()
        result = 31 * result + this.xmm5.hashCode()
        result = 31 * result + this.xmm6.hashCode()
        result = 31 * result + this.xmm7.hashCode()
        result = 31 * result + this.xmm8.hashCode()
        result = 31 * result + this.xmm9.hashCode()
        result = 31 * result + this.xmm10.hashCode()
        result = 31 * result + this.xmm11.hashCode()
        result = 31 * result + this.xmm12.hashCode()
        result = 31 * result + this.xmm13.hashCode()
        result = 31 * result + this.xmm14.hashCode()
        result = 31 * result + this.xmm15.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KnonvolatileContextPointers00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KnonvolatileContextPointers00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): KnonvolatileContextPointers00 =
                    KnonvolatileContextPointers00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<M128a>(64)
                        ).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: KnonvolatileContextPointers00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr, value.xmm0)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 8L, value.xmm1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 16L, value.xmm2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 24L, value.xmm3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 32L, value.xmm4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 40L, value.xmm5)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 48L, value.xmm6)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 56L, value.xmm7)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 64L, value.xmm8)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 72L, value.xmm9)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 80L, value.xmm10)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 88L, value.xmm11)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 96L, value.xmm12)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 104L, value.xmm13)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 112L, value.xmm14)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<M128a>(64)
                    ).writeNative(addr + 120L, value.xmm15)
                }
            }

        public operator fun invoke(
            xmm0: MutPtr<M128a> = MutPtr(0L),
            xmm1: MutPtr<M128a> = MutPtr(0L),
            xmm2: MutPtr<M128a> = MutPtr(0L),
            xmm3: MutPtr<M128a> = MutPtr(0L),
            xmm4: MutPtr<M128a> = MutPtr(0L),
            xmm5: MutPtr<M128a> = MutPtr(0L),
            xmm6: MutPtr<M128a> = MutPtr(0L),
            xmm7: MutPtr<M128a> = MutPtr(0L),
            xmm8: MutPtr<M128a> = MutPtr(0L),
            xmm9: MutPtr<M128a> = MutPtr(0L),
            xmm10: MutPtr<M128a> = MutPtr(0L),
            xmm11: MutPtr<M128a> = MutPtr(0L),
            xmm12: MutPtr<M128a> = MutPtr(0L),
            xmm13: MutPtr<M128a> = MutPtr(0L),
            xmm14: MutPtr<M128a> = MutPtr(0L),
            xmm15: MutPtr<M128a> = MutPtr(0L),
        ): KnonvolatileContextPointers00 =
            KnonvolatileContextPointers00(
                xmm0CtorArg = xmm0,
                xmm1CtorArg = xmm1,
                xmm2CtorArg = xmm2,
                xmm3CtorArg = xmm3,
                xmm4CtorArg = xmm4,
                xmm5CtorArg = xmm5,
                xmm6CtorArg = xmm6,
                xmm7CtorArg = xmm7,
                xmm8CtorArg = xmm8,
                xmm9CtorArg = xmm9,
                xmm10CtorArg = xmm10,
                xmm11CtorArg = xmm11,
                xmm12CtorArg = xmm12,
                xmm13CtorArg = xmm13,
                xmm14CtorArg = xmm14,
                xmm15CtorArg = xmm15,
            )
    }
}

public class KnonvolatileContextPointers1 internal constructor(
    integerContextCtorArg: List<MutPtr<ULong>>,
    public var anonymous: KnonvolatileContextPointers10,
) {
    public var integerContext: List<MutPtr<ULong>> = integerContextCtorArg
        internal set

    public constructor() : this(
        integerContextCtorArg = List(16) { MutPtr(0L) },
        anonymous = KnonvolatileContextPointers10(),
    )

    public operator fun component1(): List<MutPtr<ULong>> = this.integerContext

    public operator fun component2(): KnonvolatileContextPointers10 = this.anonymous

    public fun copy(integerContext: List<MutPtr<ULong>> = this.integerContext, anonymous: KnonvolatileContextPointers10 = this.anonymous): KnonvolatileContextPointers1 = KnonvolatileContextPointers1(integerContextCtorArg = integerContext, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KnonvolatileContextPointers1) return false
        if (this.integerContext != other.integerContext) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.integerContext.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            integerContext: List<MutPtr<ULong>> = List(16) { MutPtr(0L) },
            anonymous: KnonvolatileContextPointers10 = KnonvolatileContextPointers10(),
        ): KnonvolatileContextPointers1 =
            KnonvolatileContextPointers1(
                integerContextCtorArg = integerContext,
                anonymous = anonymous,
            )
    }
}

public class KnonvolatileContextPointers10 internal constructor(
    raxCtorArg: MutPtr<ULong>,
    rcxCtorArg: MutPtr<ULong>,
    rdxCtorArg: MutPtr<ULong>,
    rbxCtorArg: MutPtr<ULong>,
    rspCtorArg: MutPtr<ULong>,
    rbpCtorArg: MutPtr<ULong>,
    rsiCtorArg: MutPtr<ULong>,
    rdiCtorArg: MutPtr<ULong>,
    r8CtorArg: MutPtr<ULong>,
    r9CtorArg: MutPtr<ULong>,
    r10CtorArg: MutPtr<ULong>,
    r11CtorArg: MutPtr<ULong>,
    r12CtorArg: MutPtr<ULong>,
    r13CtorArg: MutPtr<ULong>,
    r14CtorArg: MutPtr<ULong>,
    r15CtorArg: MutPtr<ULong>,
) {
    public var rax: MutPtr<ULong> = raxCtorArg
        internal set

    public var rcx: MutPtr<ULong> = rcxCtorArg
        internal set

    public var rdx: MutPtr<ULong> = rdxCtorArg
        internal set

    public var rbx: MutPtr<ULong> = rbxCtorArg
        internal set

    public var rsp: MutPtr<ULong> = rspCtorArg
        internal set

    public var rbp: MutPtr<ULong> = rbpCtorArg
        internal set

    public var rsi: MutPtr<ULong> = rsiCtorArg
        internal set

    public var rdi: MutPtr<ULong> = rdiCtorArg
        internal set

    public var r8: MutPtr<ULong> = r8CtorArg
        internal set

    public var r9: MutPtr<ULong> = r9CtorArg
        internal set

    public var r10: MutPtr<ULong> = r10CtorArg
        internal set

    public var r11: MutPtr<ULong> = r11CtorArg
        internal set

    public var r12: MutPtr<ULong> = r12CtorArg
        internal set

    public var r13: MutPtr<ULong> = r13CtorArg
        internal set

    public var r14: MutPtr<ULong> = r14CtorArg
        internal set

    public var r15: MutPtr<ULong> = r15CtorArg
        internal set

    public constructor() : this(
        raxCtorArg = MutPtr(0L),
        rcxCtorArg = MutPtr(0L),
        rdxCtorArg = MutPtr(0L),
        rbxCtorArg = MutPtr(0L),
        rspCtorArg = MutPtr(0L),
        rbpCtorArg = MutPtr(0L),
        rsiCtorArg = MutPtr(0L),
        rdiCtorArg = MutPtr(0L),
        r8CtorArg = MutPtr(0L),
        r9CtorArg = MutPtr(0L),
        r10CtorArg = MutPtr(0L),
        r11CtorArg = MutPtr(0L),
        r12CtorArg = MutPtr(0L),
        r13CtorArg = MutPtr(0L),
        r14CtorArg = MutPtr(0L),
        r15CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<ULong> = this.rax

    public operator fun component2(): MutPtr<ULong> = this.rcx

    public operator fun component3(): MutPtr<ULong> = this.rdx

    public operator fun component4(): MutPtr<ULong> = this.rbx

    public operator fun component5(): MutPtr<ULong> = this.rsp

    public operator fun component6(): MutPtr<ULong> = this.rbp

    public operator fun component7(): MutPtr<ULong> = this.rsi

    public operator fun component8(): MutPtr<ULong> = this.rdi

    public operator fun component9(): MutPtr<ULong> = this.r8

    public operator fun component10(): MutPtr<ULong> = this.r9

    public operator fun component11(): MutPtr<ULong> = this.r10

    public operator fun component12(): MutPtr<ULong> = this.r11

    public operator fun component13(): MutPtr<ULong> = this.r12

    public operator fun component14(): MutPtr<ULong> = this.r13

    public operator fun component15(): MutPtr<ULong> = this.r14

    public operator fun component16(): MutPtr<ULong> = this.r15

    public fun copy(rax: MutPtr<ULong> = this.rax, rcx: MutPtr<ULong> = this.rcx, rdx: MutPtr<ULong> = this.rdx, rbx: MutPtr<ULong> = this.rbx, rsp: MutPtr<ULong> = this.rsp, rbp: MutPtr<ULong> = this.rbp, rsi: MutPtr<ULong> = this.rsi, rdi: MutPtr<ULong> = this.rdi, r8: MutPtr<ULong> = this.r8, r9: MutPtr<ULong> = this.r9, r10: MutPtr<ULong> = this.r10, r11: MutPtr<ULong> = this.r11, r12: MutPtr<ULong> = this.r12, r13: MutPtr<ULong> = this.r13, r14: MutPtr<ULong> = this.r14, r15: MutPtr<ULong> = this.r15): KnonvolatileContextPointers10 = KnonvolatileContextPointers10(raxCtorArg = rax, rcxCtorArg = rcx, rdxCtorArg = rdx, rbxCtorArg = rbx, rspCtorArg = rsp, rbpCtorArg = rbp, rsiCtorArg = rsi, rdiCtorArg = rdi, r8CtorArg = r8, r9CtorArg = r9, r10CtorArg = r10, r11CtorArg = r11, r12CtorArg = r12, r13CtorArg = r13, r14CtorArg = r14, r15CtorArg = r15)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KnonvolatileContextPointers10) return false
        if (this.rax != other.rax) return false
        if (this.rcx != other.rcx) return false
        if (this.rdx != other.rdx) return false
        if (this.rbx != other.rbx) return false
        if (this.rsp != other.rsp) return false
        if (this.rbp != other.rbp) return false
        if (this.rsi != other.rsi) return false
        if (this.rdi != other.rdi) return false
        if (this.r8 != other.r8) return false
        if (this.r9 != other.r9) return false
        if (this.r10 != other.r10) return false
        if (this.r11 != other.r11) return false
        if (this.r12 != other.r12) return false
        if (this.r13 != other.r13) return false
        if (this.r14 != other.r14) return false
        if (this.r15 != other.r15) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rax.hashCode()
        result = 31 * result + this.rcx.hashCode()
        result = 31 * result + this.rdx.hashCode()
        result = 31 * result + this.rbx.hashCode()
        result = 31 * result + this.rsp.hashCode()
        result = 31 * result + this.rbp.hashCode()
        result = 31 * result + this.rsi.hashCode()
        result = 31 * result + this.rdi.hashCode()
        result = 31 * result + this.r8.hashCode()
        result = 31 * result + this.r9.hashCode()
        result = 31 * result + this.r10.hashCode()
        result = 31 * result + this.r11.hashCode()
        result = 31 * result + this.r12.hashCode()
        result = 31 * result + this.r13.hashCode()
        result = 31 * result + this.r14.hashCode()
        result = 31 * result + this.r15.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KnonvolatileContextPointers10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KnonvolatileContextPointers10> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): KnonvolatileContextPointers10 =
                    KnonvolatileContextPointers10(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: KnonvolatileContextPointers10) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr, value.rax)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 8L, value.rcx)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 16L, value.rdx)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 24L, value.rbx)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 32L, value.rsp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 40L, value.rbp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 48L, value.rsi)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 56L, value.rdi)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 64L, value.r8)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 72L, value.r9)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 80L, value.r10)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 88L, value.r11)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 96L, value.r12)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 104L, value.r13)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 112L, value.r14)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 120L, value.r15)
                }
            }

        public operator fun invoke(
            rax: MutPtr<ULong> = MutPtr(0L),
            rcx: MutPtr<ULong> = MutPtr(0L),
            rdx: MutPtr<ULong> = MutPtr(0L),
            rbx: MutPtr<ULong> = MutPtr(0L),
            rsp: MutPtr<ULong> = MutPtr(0L),
            rbp: MutPtr<ULong> = MutPtr(0L),
            rsi: MutPtr<ULong> = MutPtr(0L),
            rdi: MutPtr<ULong> = MutPtr(0L),
            r8: MutPtr<ULong> = MutPtr(0L),
            r9: MutPtr<ULong> = MutPtr(0L),
            r10: MutPtr<ULong> = MutPtr(0L),
            r11: MutPtr<ULong> = MutPtr(0L),
            r12: MutPtr<ULong> = MutPtr(0L),
            r13: MutPtr<ULong> = MutPtr(0L),
            r14: MutPtr<ULong> = MutPtr(0L),
            r15: MutPtr<ULong> = MutPtr(0L),
        ): KnonvolatileContextPointers10 =
            KnonvolatileContextPointers10(
                raxCtorArg = rax,
                rcxCtorArg = rcx,
                rdxCtorArg = rdx,
                rbxCtorArg = rbx,
                rspCtorArg = rsp,
                rbpCtorArg = rbp,
                rsiCtorArg = rsi,
                rdiCtorArg = rdi,
                r8CtorArg = r8,
                r9CtorArg = r9,
                r10CtorArg = r10,
                r11CtorArg = r11,
                r12CtorArg = r12,
                r13CtorArg = r13,
                r14CtorArg = r14,
                r15CtorArg = r15,
            )
    }
}

public data class LdtEntry(
    public var limitLow: UShort = 0u,
    public var baseLow: UShort = 0u,
    public var highWord: LdtEntry0 = LdtEntry0(),
)

public data class LdtEntry0(
    public var bytes: LdtEntry00 = LdtEntry00(),
    public var bits: LdtEntry01 = LdtEntry01(),
)

public data class LdtEntry01(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdtEntry01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdtEntry01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): LdtEntry01 =
                    LdtEntry01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LdtEntry01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class LdtEntry00(
    public var baseMid: UByte = 0u,
    public var flags1: UByte = 0u,
    public var flags2: UByte = 0u,
    public var baseHi: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdtEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdtEntry00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): LdtEntry00 =
                    LdtEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: LdtEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.baseMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.flags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.baseHi)
                }
            }
    }
}

public class LoadedImage internal constructor(
    moduleNameCtorArg: Pstr,
    hFileCtorArg: Handle,
    mappedAddressCtorArg: MutPtr<UByte>,
    fileHeaderCtorArg: MutPtr<ImageNtHeaders64>,
    lastRvaSectionCtorArg: MutPtr<ImageSectionHeader>,
    public var numberOfSections: UInt,
    sectionsCtorArg: MutPtr<ImageSectionHeader>,
    public var characteristics: ImageFileCharacteristics2,
    public var fSystemImage: Boolean,
    public var fDOSImage: Boolean,
    public var fReadOnly: Boolean,
    public var version: UByte,
    public var links: ListEntry,
    public var sizeOfImage: UInt,
) {
    public var moduleName: Pstr = moduleNameCtorArg
        internal set

    public var hFile: Handle = hFileCtorArg
        internal set

    public var mappedAddress: MutPtr<UByte> = mappedAddressCtorArg
        internal set

    public var fileHeader: MutPtr<ImageNtHeaders64> = fileHeaderCtorArg
        internal set

    public var lastRvaSection: MutPtr<ImageSectionHeader> = lastRvaSectionCtorArg
        internal set

    public var sections: MutPtr<ImageSectionHeader> = sectionsCtorArg
        internal set

    public constructor() : this(
        moduleNameCtorArg = MutPtr(0L),
        hFileCtorArg = MutPtr(0L),
        mappedAddressCtorArg = MutPtr(0L),
        fileHeaderCtorArg = MutPtr(0L),
        lastRvaSectionCtorArg = MutPtr(0L),
        numberOfSections = 0u,
        sectionsCtorArg = MutPtr(0L),
        characteristics = 0u,
        fSystemImage = false,
        fDOSImage = false,
        fReadOnly = false,
        version = 0u,
        links = ListEntry(),
        sizeOfImage = 0u,
    )

    public operator fun component1(): Pstr = this.moduleName

    public operator fun component2(): Handle = this.hFile

    public operator fun component3(): MutPtr<UByte> = this.mappedAddress

    public operator fun component4(): MutPtr<ImageNtHeaders64> = this.fileHeader

    public operator fun component5(): MutPtr<ImageSectionHeader> = this.lastRvaSection

    public operator fun component6(): UInt = this.numberOfSections

    public operator fun component7(): MutPtr<ImageSectionHeader> = this.sections

    public operator fun component8(): ImageFileCharacteristics2 = this.characteristics

    public operator fun component9(): Boolean = this.fSystemImage

    public operator fun component10(): Boolean = this.fDOSImage

    public operator fun component11(): Boolean = this.fReadOnly

    public operator fun component12(): UByte = this.version

    public operator fun component13(): ListEntry = this.links

    public operator fun component14(): UInt = this.sizeOfImage

    public fun copy(moduleName: Pstr = this.moduleName, hFile: Handle = this.hFile, mappedAddress: MutPtr<UByte> = this.mappedAddress, fileHeader: MutPtr<ImageNtHeaders64> = this.fileHeader, lastRvaSection: MutPtr<ImageSectionHeader> = this.lastRvaSection, numberOfSections: UInt = this.numberOfSections, sections: MutPtr<ImageSectionHeader> = this.sections, characteristics: ImageFileCharacteristics2 = this.characteristics, fSystemImage: Boolean = this.fSystemImage, fDOSImage: Boolean = this.fDOSImage, fReadOnly: Boolean = this.fReadOnly, version: UByte = this.version, links: ListEntry = this.links, sizeOfImage: UInt = this.sizeOfImage): LoadedImage = LoadedImage(moduleNameCtorArg = moduleName, hFileCtorArg = hFile, mappedAddressCtorArg = mappedAddress, fileHeaderCtorArg = fileHeader, lastRvaSectionCtorArg = lastRvaSection, numberOfSections = numberOfSections, sectionsCtorArg = sections, characteristics = characteristics, fSystemImage = fSystemImage, fDOSImage = fDOSImage, fReadOnly = fReadOnly, version = version, links = links, sizeOfImage = sizeOfImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LoadedImage) return false
        if (this.moduleName != other.moduleName) return false
        if (this.hFile != other.hFile) return false
        if (this.mappedAddress != other.mappedAddress) return false
        if (this.fileHeader != other.fileHeader) return false
        if (this.lastRvaSection != other.lastRvaSection) return false
        if (this.numberOfSections != other.numberOfSections) return false
        if (this.sections != other.sections) return false
        if (this.characteristics != other.characteristics) return false
        if (this.fSystemImage != other.fSystemImage) return false
        if (this.fDOSImage != other.fDOSImage) return false
        if (this.fReadOnly != other.fReadOnly) return false
        if (this.version != other.version) return false
        if (this.links != other.links) return false
        if (this.sizeOfImage != other.sizeOfImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.moduleName.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.mappedAddress.hashCode()
        result = 31 * result + this.fileHeader.hashCode()
        result = 31 * result + this.lastRvaSection.hashCode()
        result = 31 * result + this.numberOfSections.hashCode()
        result = 31 * result + this.sections.hashCode()
        result = 31 * result + this.characteristics.hashCode()
        result = 31 * result + this.fSystemImage.hashCode()
        result = 31 * result + this.fDOSImage.hashCode()
        result = 31 * result + this.fReadOnly.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.links.hashCode()
        result = 31 * result + this.sizeOfImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            moduleName: Pstr = MutPtr(0L),
            hFile: Handle = MutPtr(0L),
            mappedAddress: MutPtr<UByte> = MutPtr(0L),
            fileHeader: MutPtr<ImageNtHeaders64> = MutPtr(0L),
            lastRvaSection: MutPtr<ImageSectionHeader> = MutPtr(0L),
            numberOfSections: UInt = 0u,
            sections: MutPtr<ImageSectionHeader> = MutPtr(0L),
            characteristics: ImageFileCharacteristics2 = 0u,
            fSystemImage: Boolean = false,
            fDOSImage: Boolean = false,
            fReadOnly: Boolean = false,
            version: UByte = 0u,
            links: ListEntry = ListEntry(),
            sizeOfImage: UInt = 0u,
        ): LoadedImage =
            LoadedImage(
                moduleNameCtorArg = moduleName,
                hFileCtorArg = hFile,
                mappedAddressCtorArg = mappedAddress,
                fileHeaderCtorArg = fileHeader,
                lastRvaSectionCtorArg = lastRvaSection,
                numberOfSections = numberOfSections,
                sectionsCtorArg = sections,
                characteristics = characteristics,
                fSystemImage = fSystemImage,
                fDOSImage = fDOSImage,
                fReadOnly = fReadOnly,
                version = version,
                links = links,
                sizeOfImage = sizeOfImage,
            )
    }
}

public class LoadDllDebugInfo internal constructor(
    hFileCtorArg: Handle,
    lpBaseOfDllCtorArg: MutPtr<CVoid>,
    public var dwDebugInfoFileOffset: UInt,
    public var nDebugInfoSize: UInt,
    lpImageNameCtorArg: MutPtr<CVoid>,
    public var fUnicode: UShort,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public var lpBaseOfDll: MutPtr<CVoid> = lpBaseOfDllCtorArg
        internal set

    public var lpImageName: MutPtr<CVoid> = lpImageNameCtorArg
        internal set

    public constructor() : this(
        hFileCtorArg = MutPtr(0L),
        lpBaseOfDllCtorArg = MutPtr(0L),
        dwDebugInfoFileOffset = 0u,
        nDebugInfoSize = 0u,
        lpImageNameCtorArg = MutPtr(0L),
        fUnicode = 0u,
    )

    public operator fun component1(): Handle = this.hFile

    public operator fun component2(): MutPtr<CVoid> = this.lpBaseOfDll

    public operator fun component3(): UInt = this.dwDebugInfoFileOffset

    public operator fun component4(): UInt = this.nDebugInfoSize

    public operator fun component5(): MutPtr<CVoid> = this.lpImageName

    public operator fun component6(): UShort = this.fUnicode

    public fun copy(hFile: Handle = this.hFile, lpBaseOfDll: MutPtr<CVoid> = this.lpBaseOfDll, dwDebugInfoFileOffset: UInt = this.dwDebugInfoFileOffset, nDebugInfoSize: UInt = this.nDebugInfoSize, lpImageName: MutPtr<CVoid> = this.lpImageName, fUnicode: UShort = this.fUnicode): LoadDllDebugInfo = LoadDllDebugInfo(hFileCtorArg = hFile, lpBaseOfDllCtorArg = lpBaseOfDll, dwDebugInfoFileOffset = dwDebugInfoFileOffset, nDebugInfoSize = nDebugInfoSize, lpImageNameCtorArg = lpImageName, fUnicode = fUnicode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LoadDllDebugInfo) return false
        if (this.hFile != other.hFile) return false
        if (this.lpBaseOfDll != other.lpBaseOfDll) return false
        if (this.dwDebugInfoFileOffset != other.dwDebugInfoFileOffset) return false
        if (this.nDebugInfoSize != other.nDebugInfoSize) return false
        if (this.lpImageName != other.lpImageName) return false
        if (this.fUnicode != other.fUnicode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hFile.hashCode()
        result = 31 * result + this.lpBaseOfDll.hashCode()
        result = 31 * result + this.dwDebugInfoFileOffset.hashCode()
        result = 31 * result + this.nDebugInfoSize.hashCode()
        result = 31 * result + this.lpImageName.hashCode()
        result = 31 * result + this.fUnicode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hFile: Handle = MutPtr(0L),
            lpBaseOfDll: MutPtr<CVoid> = MutPtr(0L),
            dwDebugInfoFileOffset: UInt = 0u,
            nDebugInfoSize: UInt = 0u,
            lpImageName: MutPtr<CVoid> = MutPtr(0L),
            fUnicode: UShort = 0u,
        ): LoadDllDebugInfo =
            LoadDllDebugInfo(
                hFileCtorArg = hFile,
                lpBaseOfDllCtorArg = lpBaseOfDll,
                dwDebugInfoFileOffset = dwDebugInfoFileOffset,
                nDebugInfoSize = nDebugInfoSize,
                lpImageNameCtorArg = lpImageName,
                fUnicode = fUnicode,
            )
    }
}

public data class M128a(
    public var low: ULong = 0uL,
    public var high: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<M128a> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<M128a> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): M128a =
                    M128a(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: M128a) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.low)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.high)
                }
            }
    }
}

public class MinidumpCallbackInformation internal constructor(
    public var callbackRoutine: MinidumpCallbackRoutine,
    callbackParamCtorArg: MutPtr<CVoid>,
) {
    public var callbackParam: MutPtr<CVoid> = callbackParamCtorArg
        internal set

    public constructor() : this(
        callbackRoutine = null,
        callbackParamCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MinidumpCallbackRoutine = this.callbackRoutine

    public operator fun component2(): MutPtr<CVoid> = this.callbackParam

    public fun copy(callbackRoutine: MinidumpCallbackRoutine = this.callbackRoutine, callbackParam: MutPtr<CVoid> = this.callbackParam): MinidumpCallbackInformation = MinidumpCallbackInformation(callbackRoutine = callbackRoutine, callbackParamCtorArg = callbackParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpCallbackInformation) return false
        if (this.callbackRoutine != other.callbackRoutine) return false
        if (this.callbackParam != other.callbackParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callbackRoutine.hashCode()
        result = 31 * result + this.callbackParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callbackRoutine: MinidumpCallbackRoutine = null,
            callbackParam: MutPtr<CVoid> = MutPtr(0L),
        ): MinidumpCallbackInformation =
            MinidumpCallbackInformation(
                callbackRoutine = callbackRoutine,
                callbackParamCtorArg = callbackParam,
            )
    }
}

public class MinidumpCallbackInput internal constructor(
    public var processId: UInt,
    processHandleCtorArg: Handle,
    public var callbackType: UInt,
    public var anonymous: MinidumpCallbackInput0,
) {
    public var processHandle: Handle = processHandleCtorArg
        internal set

    public constructor() : this(
        processId = 0u,
        processHandleCtorArg = MutPtr(0L),
        callbackType = 0u,
        anonymous = MinidumpCallbackInput0(),
    )

    public operator fun component1(): UInt = this.processId

    public operator fun component2(): Handle = this.processHandle

    public operator fun component3(): UInt = this.callbackType

    public operator fun component4(): MinidumpCallbackInput0 = this.anonymous

    public fun copy(processId: UInt = this.processId, processHandle: Handle = this.processHandle, callbackType: UInt = this.callbackType, anonymous: MinidumpCallbackInput0 = this.anonymous): MinidumpCallbackInput = MinidumpCallbackInput(processId = processId, processHandleCtorArg = processHandle, callbackType = callbackType, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpCallbackInput) return false
        if (this.processId != other.processId) return false
        if (this.processHandle != other.processHandle) return false
        if (this.callbackType != other.callbackType) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processId.hashCode()
        result = 31 * result + this.processHandle.hashCode()
        result = 31 * result + this.callbackType.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            processId: UInt = 0u,
            processHandle: Handle = MutPtr(0L),
            callbackType: UInt = 0u,
            anonymous: MinidumpCallbackInput0 = MinidumpCallbackInput0(),
        ): MinidumpCallbackInput =
            MinidumpCallbackInput(
                processId = processId,
                processHandleCtorArg = processHandle,
                callbackType = callbackType,
                anonymous = anonymous,
            )
    }
}

public data class MinidumpCallbackInput0(
    public var status: Hresult = 0,
    public var thread: MinidumpThreadCallback = MinidumpThreadCallback(),
    public var threadEx: MinidumpThreadExCallback = MinidumpThreadExCallback(),
    public var module: MinidumpModuleCallback = MinidumpModuleCallback(),
    public var includeThread: MinidumpIncludeThreadCallback = MinidumpIncludeThreadCallback(),
    public var includeModule: MinidumpIncludeModuleCallback = MinidumpIncludeModuleCallback(),
    public var ioVal: MinidumpIoCallback = MinidumpIoCallback(),
    public var readMemoryFailure: MinidumpReadMemoryFailureCallback = MinidumpReadMemoryFailureCallback(),
    public var secondaryFlags: UInt = 0u,
    public var vmQuery: MinidumpVmQueryCallback = MinidumpVmQueryCallback(),
    public var vmPreRead: MinidumpVmPreReadCallback = MinidumpVmPreReadCallback(),
    public var vmPostRead: MinidumpVmPostReadCallback = MinidumpVmPostReadCallback(),
)

public data class MinidumpCallbackOutput(
    public var anonymous: MinidumpCallbackOutput0 = MinidumpCallbackOutput0(),
)

public class MinidumpCallbackOutput0 internal constructor(
    public var moduleWriteFlags: UInt,
    public var threadWriteFlags: UInt,
    public var secondaryFlags: UInt,
    public var anonymous1: MinidumpCallbackOutput00,
    public var anonymous2: MinidumpCallbackOutput01,
    handleCtorArg: Handle,
    public var anonymous3: MinidumpCallbackOutput02,
    public var anonymous4: MinidumpCallbackOutput03,
    public var anonymous5: MinidumpCallbackOutput04,
    public var status: Hresult,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public constructor() : this(
        moduleWriteFlags = 0u,
        threadWriteFlags = 0u,
        secondaryFlags = 0u,
        anonymous1 = MinidumpCallbackOutput00(),
        anonymous2 = MinidumpCallbackOutput01(),
        handleCtorArg = MutPtr(0L),
        anonymous3 = MinidumpCallbackOutput02(),
        anonymous4 = MinidumpCallbackOutput03(),
        anonymous5 = MinidumpCallbackOutput04(),
        status = 0,
    )

    public operator fun component1(): UInt = this.moduleWriteFlags

    public operator fun component2(): UInt = this.threadWriteFlags

    public operator fun component3(): UInt = this.secondaryFlags

    public operator fun component4(): MinidumpCallbackOutput00 = this.anonymous1

    public operator fun component5(): MinidumpCallbackOutput01 = this.anonymous2

    public operator fun component6(): Handle = this.handle

    public operator fun component7(): MinidumpCallbackOutput02 = this.anonymous3

    public operator fun component8(): MinidumpCallbackOutput03 = this.anonymous4

    public operator fun component9(): MinidumpCallbackOutput04 = this.anonymous5

    public operator fun component10(): Hresult = this.status

    public fun copy(moduleWriteFlags: UInt = this.moduleWriteFlags, threadWriteFlags: UInt = this.threadWriteFlags, secondaryFlags: UInt = this.secondaryFlags, anonymous1: MinidumpCallbackOutput00 = this.anonymous1, anonymous2: MinidumpCallbackOutput01 = this.anonymous2, handle: Handle = this.handle, anonymous3: MinidumpCallbackOutput02 = this.anonymous3, anonymous4: MinidumpCallbackOutput03 = this.anonymous4, anonymous5: MinidumpCallbackOutput04 = this.anonymous5, status: Hresult = this.status): MinidumpCallbackOutput0 = MinidumpCallbackOutput0(moduleWriteFlags = moduleWriteFlags, threadWriteFlags = threadWriteFlags, secondaryFlags = secondaryFlags, anonymous1 = anonymous1, anonymous2 = anonymous2, handleCtorArg = handle, anonymous3 = anonymous3, anonymous4 = anonymous4, anonymous5 = anonymous5, status = status)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpCallbackOutput0) return false
        if (this.moduleWriteFlags != other.moduleWriteFlags) return false
        if (this.threadWriteFlags != other.threadWriteFlags) return false
        if (this.secondaryFlags != other.secondaryFlags) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.handle != other.handle) return false
        if (this.anonymous3 != other.anonymous3) return false
        if (this.anonymous4 != other.anonymous4) return false
        if (this.anonymous5 != other.anonymous5) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.moduleWriteFlags.hashCode()
        result = 31 * result + this.threadWriteFlags.hashCode()
        result = 31 * result + this.secondaryFlags.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.handle.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        result = 31 * result + this.anonymous4.hashCode()
        result = 31 * result + this.anonymous5.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            moduleWriteFlags: UInt = 0u,
            threadWriteFlags: UInt = 0u,
            secondaryFlags: UInt = 0u,
            anonymous1: MinidumpCallbackOutput00 = MinidumpCallbackOutput00(),
            anonymous2: MinidumpCallbackOutput01 = MinidumpCallbackOutput01(),
            handle: Handle = MutPtr(0L),
            anonymous3: MinidumpCallbackOutput02 = MinidumpCallbackOutput02(),
            anonymous4: MinidumpCallbackOutput03 = MinidumpCallbackOutput03(),
            anonymous5: MinidumpCallbackOutput04 = MinidumpCallbackOutput04(),
            status: Hresult = 0,
        ): MinidumpCallbackOutput0 =
            MinidumpCallbackOutput0(
                moduleWriteFlags = moduleWriteFlags,
                threadWriteFlags = threadWriteFlags,
                secondaryFlags = secondaryFlags,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                handleCtorArg = handle,
                anonymous3 = anonymous3,
                anonymous4 = anonymous4,
                anonymous5 = anonymous5,
                status = status,
            )
    }
}

public data class MinidumpCallbackOutput00(
    public var memoryBase: ULong = 0uL,
    public var memorySize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpCallbackOutput00 =
                    MinidumpCallbackOutput00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpCallbackOutput00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.memoryBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.memorySize)
                }
            }
    }
}

public data class MinidumpCallbackOutput01(
    public var checkCancel: Bool = 0,
    public var cancel: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MinidumpCallbackOutput01 =
                    MinidumpCallbackOutput01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpCallbackOutput01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.checkCancel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cancel)
                }
            }
    }
}

public data class MinidumpCallbackOutput02(
    public var vmRegion: MinidumpMemoryInfo = MinidumpMemoryInfo(),
    public var continueTarget: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): MinidumpCallbackOutput02 =
                    MinidumpCallbackOutput02(
                        (MinidumpMemoryInfo.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: MinidumpCallbackOutput02) {
                    (MinidumpMemoryInfo.typeLayout()).writeNative(addr, value.vmRegion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.continueTarget)
                }
            }
    }
}

public data class MinidumpCallbackOutput03(
    public var vmQueryStatus: Hresult = 0,
    public var vmQueryResult: MinidumpMemoryInfo = MinidumpMemoryInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput03> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): MinidumpCallbackOutput03 =
                    MinidumpCallbackOutput03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (MinidumpMemoryInfo.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpCallbackOutput03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.vmQueryStatus)
                    (MinidumpMemoryInfo.typeLayout()).writeNative(addr + 4L, value.vmQueryResult)
                }
            }
    }
}

public data class MinidumpCallbackOutput04(
    public var vmReadStatus: Hresult = 0,
    public var vmReadBytesCompleted: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpCallbackOutput04> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MinidumpCallbackOutput04 =
                    MinidumpCallbackOutput04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpCallbackOutput04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.vmReadStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vmReadBytesCompleted)
                }
            }
    }
}

public data class MinidumpDirectory(
    public var streamType: UInt = 0u,
    public var location: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpDirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpDirectory> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpDirectory =
                    MinidumpDirectory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (MinidumpLocationDescriptor.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpDirectory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.streamType)
                    (MinidumpLocationDescriptor.typeLayout()).writeNative(addr + 4L, value.location)
                }
            }
    }
}

public data class MinidumpException(
    public var exceptionCode: UInt = 0u,
    public var exceptionFlags: UInt = 0u,
    public var exceptionRecord: ULong = 0uL,
    public var exceptionAddress: ULong = 0uL,
    public var numberParameters: UInt = 0u,
    public var unusedAlignment: UInt = 0u,
    public var exceptionInformation: ULongArray = ULongArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpException) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.exceptionFlags != other.exceptionFlags) return false
        if (this.exceptionRecord != other.exceptionRecord) return false
        if (this.exceptionAddress != other.exceptionAddress) return false
        if (this.numberParameters != other.numberParameters) return false
        if (this.unusedAlignment != other.unusedAlignment) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.exceptionFlags.hashCode()
        result = 31 * result + this.exceptionRecord.hashCode()
        result = 31 * result + this.exceptionAddress.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.unusedAlignment.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpException> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpException> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): MinidumpException =
                    MinidumpException(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (15).toInt())
                        ).readNative(addr + 32L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: MinidumpException) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.exceptionFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.exceptionRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.exceptionAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numberParameters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.unusedAlignment)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (15).toInt())
                    ).writeNative(addr + 32L, value.exceptionInformation.toList())
                }
            }
    }
}

public class MinidumpExceptionInformation internal constructor(
    public var threadId: UInt,
    exceptionPointersCtorArg: MutPtr<ExceptionPointers>,
    public var clientPointers: Bool,
) {
    public var exceptionPointers: MutPtr<ExceptionPointers> = exceptionPointersCtorArg
        internal set

    public constructor() : this(
        threadId = 0u,
        exceptionPointersCtorArg = MutPtr(0L),
        clientPointers = 0,
    )

    public operator fun component1(): UInt = this.threadId

    public operator fun component2(): MutPtr<ExceptionPointers> = this.exceptionPointers

    public operator fun component3(): Bool = this.clientPointers

    public fun copy(threadId: UInt = this.threadId, exceptionPointers: MutPtr<ExceptionPointers> = this.exceptionPointers, clientPointers: Bool = this.clientPointers): MinidumpExceptionInformation = MinidumpExceptionInformation(threadId = threadId, exceptionPointersCtorArg = exceptionPointers, clientPointers = clientPointers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpExceptionInformation) return false
        if (this.threadId != other.threadId) return false
        if (this.exceptionPointers != other.exceptionPointers) return false
        if (this.clientPointers != other.clientPointers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadId.hashCode()
        result = 31 * result + this.exceptionPointers.hashCode()
        result = 31 * result + this.clientPointers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpExceptionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpExceptionInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpExceptionInformation =
                    MinidumpExceptionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ExceptionPointers>(64)
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MinidumpExceptionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ExceptionPointers>(64)
                    ).writeNative(addr + 4L, value.exceptionPointers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.clientPointers)
                }
            }

        public operator fun invoke(
            threadId: UInt = 0u,
            exceptionPointers: MutPtr<ExceptionPointers> = MutPtr(0L),
            clientPointers: Bool = 0,
        ): MinidumpExceptionInformation =
            MinidumpExceptionInformation(
                threadId = threadId,
                exceptionPointersCtorArg = exceptionPointers,
                clientPointers = clientPointers,
            )
    }
}

public data class MinidumpExceptionInformation64(
    public var threadId: UInt = 0u,
    public var exceptionRecord: ULong = 0uL,
    public var contextRecord: ULong = 0uL,
    public var clientPointers: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpExceptionInformation64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpExceptionInformation64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MinidumpExceptionInformation64 =
                    MinidumpExceptionInformation64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MinidumpExceptionInformation64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 4L, value.exceptionRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 12L, value.contextRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.clientPointers)
                }
            }
    }
}

public data class MinidumpExceptionStream(
    public var threadId: UInt = 0u,
    public var alignment: UInt = 0u,
    public var exceptionRecord: MinidumpException = MinidumpException(),
    public var threadContext: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpExceptionStream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpExceptionStream> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): MinidumpExceptionStream =
                    MinidumpExceptionStream(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (MinidumpException.typeLayout()).readNative(addr + 8L),
                        (MinidumpLocationDescriptor.typeLayout()).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: MinidumpExceptionStream) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment)
                    (MinidumpException.typeLayout()).writeNative(addr + 8L, value.exceptionRecord)
                    (MinidumpLocationDescriptor.typeLayout()).writeNative(addr + 160L, value.threadContext)
                }
            }
    }
}

public data class MinidumpFunctionTableDescriptor(
    public var minimumAddress: ULong = 0uL,
    public var maximumAddress: ULong = 0uL,
    public var baseAddress: ULong = 0uL,
    public var entryCount: UInt = 0u,
    public var sizeOfAlignPad: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpFunctionTableDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpFunctionTableDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MinidumpFunctionTableDescriptor =
                    MinidumpFunctionTableDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MinidumpFunctionTableDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maximumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.entryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sizeOfAlignPad)
                }
            }
    }
}

public data class MinidumpFunctionTableStream(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfDescriptor: UInt = 0u,
    public var sizeOfNativeDescriptor: UInt = 0u,
    public var sizeOfFunctionEntry: UInt = 0u,
    public var numberOfDescriptors: UInt = 0u,
    public var sizeOfAlignPad: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpFunctionTableStream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpFunctionTableStream> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MinidumpFunctionTableStream =
                    MinidumpFunctionTableStream(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MinidumpFunctionTableStream) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfNativeDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sizeOfFunctionEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfDescriptors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sizeOfAlignPad)
                }
            }
    }
}

public data class MinidumpHandleDataStream(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfDescriptor: UInt = 0u,
    public var numberOfDescriptors: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleDataStream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleDataStream> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpHandleDataStream =
                    MinidumpHandleDataStream(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MinidumpHandleDataStream) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfDescriptors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class MinidumpHandleDescriptor(
    public var handle: ULong = 0uL,
    public var typeNameRva: UInt = 0u,
    public var objectNameRva: UInt = 0u,
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MinidumpHandleDescriptor =
                    MinidumpHandleDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MinidumpHandleDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.typeNameRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.objectNameRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.grantedAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.handleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pointerCount)
                }
            }
    }
}

public data class MinidumpHandleDescriptor2(
    public var handle: ULong = 0uL,
    public var typeNameRva: UInt = 0u,
    public var objectNameRva: UInt = 0u,
    public var attributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
    public var handleCount: UInt = 0u,
    public var pointerCount: UInt = 0u,
    public var objectInfoRva: UInt = 0u,
    public var reserved0: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleDescriptor2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleDescriptor2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): MinidumpHandleDescriptor2 =
                    MinidumpHandleDescriptor2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: MinidumpHandleDescriptor2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.typeNameRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.objectNameRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.grantedAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.handleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pointerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.objectInfoRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.reserved0)
                }
            }
    }
}

public data class MinidumpHandleObjectInformation(
    public var nextInfoRva: UInt = 0u,
    public var infoType: UInt = 0u,
    public var sizeOfInfo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleObjectInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleObjectInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpHandleObjectInformation =
                    MinidumpHandleObjectInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpHandleObjectInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nextInfoRva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.infoType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfInfo)
                }
            }
    }
}

public data class MinidumpHandleOperationList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleOperationList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpHandleOperationList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpHandleOperationList =
                    MinidumpHandleOperationList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MinidumpHandleOperationList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class MinidumpHeader(
    public var signature: UInt = 0u,
    public var version: UInt = 0u,
    public var numberOfStreams: UInt = 0u,
    public var streamDirectoryRva: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var anonymous: MinidumpHeader0 = MinidumpHeader0(),
    public var flags: ULong = 0uL,
)

public data class MinidumpHeader0(
    public var reserved: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
)

public data class MinidumpIncludeModuleCallback(
    public var baseOfImage: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpIncludeModuleCallback> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpIncludeModuleCallback> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MinidumpIncludeModuleCallback =
                    MinidumpIncludeModuleCallback(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MinidumpIncludeModuleCallback) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.baseOfImage)
                }
            }
    }
}

public data class MinidumpIncludeThreadCallback(
    public var threadId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpIncludeThreadCallback> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpIncludeThreadCallback> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MinidumpIncludeThreadCallback =
                    MinidumpIncludeThreadCallback(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MinidumpIncludeThreadCallback) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                }
            }
    }
}

public class MinidumpIoCallback internal constructor(
    handleCtorArg: Handle,
    public var offset: ULong,
    bufferCtorArg: MutPtr<CVoid>,
    public var bufferBytes: UInt,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        offset = 0uL,
        bufferCtorArg = MutPtr(0L),
        bufferBytes = 0u,
    )

    public operator fun component1(): Handle = this.handle

    public operator fun component2(): ULong = this.offset

    public operator fun component3(): MutPtr<CVoid> = this.buffer

    public operator fun component4(): UInt = this.bufferBytes

    public fun copy(handle: Handle = this.handle, offset: ULong = this.offset, buffer: MutPtr<CVoid> = this.buffer, bufferBytes: UInt = this.bufferBytes): MinidumpIoCallback = MinidumpIoCallback(handleCtorArg = handle, offset = offset, bufferCtorArg = buffer, bufferBytes = bufferBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpIoCallback) return false
        if (this.handle != other.handle) return false
        if (this.offset != other.offset) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferBytes != other.bufferBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferBytes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: Handle = MutPtr(0L),
            offset: ULong = 0uL,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            bufferBytes: UInt = 0u,
        ): MinidumpIoCallback =
            MinidumpIoCallback(
                handleCtorArg = handle,
                offset = offset,
                bufferCtorArg = buffer,
                bufferBytes = bufferBytes,
            )
    }
}

public data class MinidumpLocationDescriptor(
    public var dataSize: UInt = 0u,
    public var rva: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpLocationDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpLocationDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MinidumpLocationDescriptor =
                    MinidumpLocationDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpLocationDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rva)
                }
            }
    }
}

public data class MinidumpLocationDescriptor64(
    public var dataSize: ULong = 0uL,
    public var rva: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpLocationDescriptor64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpLocationDescriptor64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpLocationDescriptor64 =
                    MinidumpLocationDescriptor64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpLocationDescriptor64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rva)
                }
            }
    }
}

public data class MinidumpMemory64List(
    public var numberOfMemoryRanges: ULong = 0uL,
    public var baseRva: ULong = 0uL,
    public var memoryRanges: List<MinidumpMemoryDescriptor64> = List(1) { MinidumpMemoryDescriptor64() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemory64List> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemory64List> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MinidumpMemory64List =
                    MinidumpMemory64List(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MinidumpMemoryDescriptor64.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMemory64List) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.numberOfMemoryRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.baseRva)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MinidumpMemoryDescriptor64.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.memoryRanges)
                }
            }
    }
}

public data class MinidumpMemoryDescriptor(
    public var startOfMemoryRange: ULong = 0uL,
    public var memory: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpMemoryDescriptor =
                    MinidumpMemoryDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (MinidumpLocationDescriptor.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMemoryDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startOfMemoryRange)
                    (MinidumpLocationDescriptor.typeLayout()).writeNative(addr + 8L, value.memory)
                }
            }
    }
}

public data class MinidumpMemoryDescriptor64(
    public var startOfMemoryRange: ULong = 0uL,
    public var dataSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryDescriptor64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryDescriptor64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpMemoryDescriptor64 =
                    MinidumpMemoryDescriptor64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMemoryDescriptor64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.startOfMemoryRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dataSize)
                }
            }
    }
}

public data class MinidumpMemoryInfo(
    public var baseAddress: ULong = 0uL,
    public var allocationBase: ULong = 0uL,
    public var allocationProtect: UInt = 0u,
    public var alignment1: UInt = 0u,
    public var regionSize: ULong = 0uL,
    public var state: VirtualAllocationType = 0u,
    public var protect: UInt = 0u,
    public var type: UInt = 0u,
    public var alignment2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MinidumpMemoryInfo =
                    MinidumpMemoryInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMemoryInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.allocationBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationProtect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.alignment1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.regionSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.protect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.alignment2)
                }
            }
    }
}

public data class MinidumpMemoryInfoList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryInfoList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryInfoList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpMemoryInfoList =
                    MinidumpMemoryInfoList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMemoryInfoList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.numberOfEntries)
                }
            }
    }
}

public data class MinidumpMemoryList(
    public var numberOfMemoryRanges: UInt = 0u,
    public var memoryRanges: List<MinidumpMemoryDescriptor> = List(1) { MinidumpMemoryDescriptor() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMemoryList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MinidumpMemoryList =
                    MinidumpMemoryList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MinidumpMemoryDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMemoryList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfMemoryRanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MinidumpMemoryDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.memoryRanges)
                }
            }
    }
}

public data class MinidumpMiscInfo(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: MinidumpMiscInfoFlags = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMiscInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMiscInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MinidumpMiscInfo =
                    MinidumpMiscInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMiscInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.processCreateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.processUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.processKernelTime)
                }
            }
    }
}

public data class MinidumpMiscInfo2(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMiscInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpMiscInfo2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): MinidumpMiscInfo2 =
                    MinidumpMiscInfo2(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MinidumpMiscInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.processCreateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.processUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.processKernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.processorMaxMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.processorCurrentMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.processorMhzLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.processorMaxIdleState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.processorCurrentIdleState)
                }
            }
    }
}

public data class MinidumpMiscInfo3(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
    public var processIntegrityLevel: UInt = 0u,
    public var processExecuteFlags: UInt = 0u,
    public var protectedProcess: UInt = 0u,
    public var timeZoneId: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
)

public class MinidumpMiscInfo4(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
    public var processIntegrityLevel: UInt = 0u,
    public var processExecuteFlags: UInt = 0u,
    public var protectedProcess: UInt = 0u,
    public var timeZoneId: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var buildString: UShortArray = UShortArray(260),
    public var dbgBldStr: UShortArray = UShortArray(40),
)

public class MinidumpMiscInfo5(
    public var sizeOfInfo: UInt = 0u,
    public var flags1: UInt = 0u,
    public var processId: UInt = 0u,
    public var processCreateTime: UInt = 0u,
    public var processUserTime: UInt = 0u,
    public var processKernelTime: UInt = 0u,
    public var processorMaxMhz: UInt = 0u,
    public var processorCurrentMhz: UInt = 0u,
    public var processorMhzLimit: UInt = 0u,
    public var processorMaxIdleState: UInt = 0u,
    public var processorCurrentIdleState: UInt = 0u,
    public var processIntegrityLevel: UInt = 0u,
    public var processExecuteFlags: UInt = 0u,
    public var protectedProcess: UInt = 0u,
    public var timeZoneId: UInt = 0u,
    public var timeZone: TimeZoneInformation = TimeZoneInformation(),
    public var buildString: UShortArray = UShortArray(260),
    public var dbgBldStr: UShortArray = UShortArray(40),
    public var xStateData: XstateConfigFeatureMscInfo = XstateConfigFeatureMscInfo(),
    public var processCookie: UInt = 0u,
)

public data class MinidumpModule(
    public var baseOfImage: ULong = 0uL,
    public var sizeOfImage: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var moduleNameRva: UInt = 0u,
    public var versionInfo: VsFixedfileinfo = VsFixedfileinfo(),
    public var cvRecord: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
    public var miscRecord: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
    public var reserved0: ULong = 0uL,
    public var reserved1: ULong = 0uL,
)

public class MinidumpModuleCallback internal constructor(
    fullPathCtorArg: Pwstr,
    public var baseOfImage: ULong,
    public var sizeOfImage: UInt,
    public var checkSum: UInt,
    public var timeDateStamp: UInt,
    public var versionInfo: VsFixedfileinfo,
    cvRecordCtorArg: MutPtr<CVoid>,
    public var sizeOfCvRecord: UInt,
    miscRecordCtorArg: MutPtr<CVoid>,
    public var sizeOfMiscRecord: UInt,
) {
    public var fullPath: Pwstr = fullPathCtorArg
        internal set

    public var cvRecord: MutPtr<CVoid> = cvRecordCtorArg
        internal set

    public var miscRecord: MutPtr<CVoid> = miscRecordCtorArg
        internal set

    public constructor() : this(
        fullPathCtorArg = MutPtr(0L),
        baseOfImage = 0uL,
        sizeOfImage = 0u,
        checkSum = 0u,
        timeDateStamp = 0u,
        versionInfo = VsFixedfileinfo(),
        cvRecordCtorArg = MutPtr(0L),
        sizeOfCvRecord = 0u,
        miscRecordCtorArg = MutPtr(0L),
        sizeOfMiscRecord = 0u,
    )

    public operator fun component1(): Pwstr = this.fullPath

    public operator fun component2(): ULong = this.baseOfImage

    public operator fun component3(): UInt = this.sizeOfImage

    public operator fun component4(): UInt = this.checkSum

    public operator fun component5(): UInt = this.timeDateStamp

    public operator fun component6(): VsFixedfileinfo = this.versionInfo

    public operator fun component7(): MutPtr<CVoid> = this.cvRecord

    public operator fun component8(): UInt = this.sizeOfCvRecord

    public operator fun component9(): MutPtr<CVoid> = this.miscRecord

    public operator fun component10(): UInt = this.sizeOfMiscRecord

    public fun copy(fullPath: Pwstr = this.fullPath, baseOfImage: ULong = this.baseOfImage, sizeOfImage: UInt = this.sizeOfImage, checkSum: UInt = this.checkSum, timeDateStamp: UInt = this.timeDateStamp, versionInfo: VsFixedfileinfo = this.versionInfo, cvRecord: MutPtr<CVoid> = this.cvRecord, sizeOfCvRecord: UInt = this.sizeOfCvRecord, miscRecord: MutPtr<CVoid> = this.miscRecord, sizeOfMiscRecord: UInt = this.sizeOfMiscRecord): MinidumpModuleCallback = MinidumpModuleCallback(fullPathCtorArg = fullPath, baseOfImage = baseOfImage, sizeOfImage = sizeOfImage, checkSum = checkSum, timeDateStamp = timeDateStamp, versionInfo = versionInfo, cvRecordCtorArg = cvRecord, sizeOfCvRecord = sizeOfCvRecord, miscRecordCtorArg = miscRecord, sizeOfMiscRecord = sizeOfMiscRecord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpModuleCallback) return false
        if (this.fullPath != other.fullPath) return false
        if (this.baseOfImage != other.baseOfImage) return false
        if (this.sizeOfImage != other.sizeOfImage) return false
        if (this.checkSum != other.checkSum) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (this.versionInfo != other.versionInfo) return false
        if (this.cvRecord != other.cvRecord) return false
        if (this.sizeOfCvRecord != other.sizeOfCvRecord) return false
        if (this.miscRecord != other.miscRecord) return false
        if (this.sizeOfMiscRecord != other.sizeOfMiscRecord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fullPath.hashCode()
        result = 31 * result + this.baseOfImage.hashCode()
        result = 31 * result + this.sizeOfImage.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.versionInfo.hashCode()
        result = 31 * result + this.cvRecord.hashCode()
        result = 31 * result + this.sizeOfCvRecord.hashCode()
        result = 31 * result + this.miscRecord.hashCode()
        result = 31 * result + this.sizeOfMiscRecord.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fullPath: Pwstr = MutPtr(0L),
            baseOfImage: ULong = 0uL,
            sizeOfImage: UInt = 0u,
            checkSum: UInt = 0u,
            timeDateStamp: UInt = 0u,
            versionInfo: VsFixedfileinfo = VsFixedfileinfo(),
            cvRecord: MutPtr<CVoid> = MutPtr(0L),
            sizeOfCvRecord: UInt = 0u,
            miscRecord: MutPtr<CVoid> = MutPtr(0L),
            sizeOfMiscRecord: UInt = 0u,
        ): MinidumpModuleCallback =
            MinidumpModuleCallback(
                fullPathCtorArg = fullPath,
                baseOfImage = baseOfImage,
                sizeOfImage = sizeOfImage,
                checkSum = checkSum,
                timeDateStamp = timeDateStamp,
                versionInfo = versionInfo,
                cvRecordCtorArg = cvRecord,
                sizeOfCvRecord = sizeOfCvRecord,
                miscRecordCtorArg = miscRecord,
                sizeOfMiscRecord = sizeOfMiscRecord,
            )
    }
}

public data class MinidumpModuleList(
    public var numberOfModules: UInt = 0u,
    public var modules: List<MinidumpModule> = List(1) { MinidumpModule() },
)

public data class MinidumpProcessVmCounters1(
    public var revision: UShort = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: ULong = 0uL,
    public var workingSetSize: ULong = 0uL,
    public var quotaPeakPagedPoolUsage: ULong = 0uL,
    public var quotaPagedPoolUsage: ULong = 0uL,
    public var quotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var quotaNonPagedPoolUsage: ULong = 0uL,
    public var pagefileUsage: ULong = 0uL,
    public var peakPagefileUsage: ULong = 0uL,
    public var privateUsage: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpProcessVmCounters1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpProcessVmCounters1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): MinidumpProcessVmCounters1 =
                    MinidumpProcessVmCounters1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: MinidumpProcessVmCounters1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.peakPagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.privateUsage)
                }
            }
    }
}

public class MinidumpProcessVmCounters2(
    public var revision: UShort = 0u,
    public var flags: UShort = 0u,
    public var pageFaultCount: UInt = 0u,
    public var peakWorkingSetSize: ULong = 0uL,
    public var workingSetSize: ULong = 0uL,
    public var quotaPeakPagedPoolUsage: ULong = 0uL,
    public var quotaPagedPoolUsage: ULong = 0uL,
    public var quotaPeakNonPagedPoolUsage: ULong = 0uL,
    public var quotaNonPagedPoolUsage: ULong = 0uL,
    public var pagefileUsage: ULong = 0uL,
    public var peakPagefileUsage: ULong = 0uL,
    public var peakVirtualSize: ULong = 0uL,
    public var virtualSize: ULong = 0uL,
    public var privateUsage: ULong = 0uL,
    public var privateWorkingSetSize: ULong = 0uL,
    public var sharedCommitUsage: ULong = 0uL,
    public var jobSharedCommitUsage: ULong = 0uL,
    public var jobPrivateCommitUsage: ULong = 0uL,
    public var jobPeakPrivateCommitUsage: ULong = 0uL,
    public var jobPrivateCommitLimit: ULong = 0uL,
    public var jobTotalCommitLimit: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpProcessVmCounters2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpProcessVmCounters2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): MinidumpProcessVmCounters2 =
                    MinidumpProcessVmCounters2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: MinidumpProcessVmCounters2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.peakWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.workingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.quotaPeakPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.quotaPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.quotaPeakNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.quotaNonPagedPoolUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.pagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.peakPagefileUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.peakVirtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.virtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.privateUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.privateWorkingSetSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.sharedCommitUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.jobSharedCommitUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.jobPrivateCommitUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.jobPeakPrivateCommitUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.jobPrivateCommitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.jobTotalCommitLimit)
                }
            }
    }
}

public data class MinidumpReadMemoryFailureCallback(
    public var offset: ULong = 0uL,
    public var bytes: UInt = 0u,
    public var failureStatus: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpReadMemoryFailureCallback> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpReadMemoryFailureCallback> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpReadMemoryFailureCallback =
                    MinidumpReadMemoryFailureCallback(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MinidumpReadMemoryFailureCallback) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.failureStatus)
                }
            }
    }
}

public data class MinidumpString(
    public var length: UInt = 0u,
    public var buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpString) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpString> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MinidumpString =
                    MinidumpString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: MinidumpString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.buffer.toList())
                }
            }
    }
}

public data class MinidumpSystemBasicInformation(
    public var timerResolution: UInt = 0u,
    public var pageSize: UInt = 0u,
    public var numberOfPhysicalPages: UInt = 0u,
    public var lowestPhysicalPageNumber: UInt = 0u,
    public var highestPhysicalPageNumber: UInt = 0u,
    public var allocationGranularity: UInt = 0u,
    public var minimumUserModeAddress: ULong = 0uL,
    public var maximumUserModeAddress: ULong = 0uL,
    public var activeProcessorsAffinityMask: ULong = 0uL,
    public var numberOfProcessors: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemBasicInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): MinidumpSystemBasicInformation =
                    MinidumpSystemBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: MinidumpSystemBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timerResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfPhysicalPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lowestPhysicalPageNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.highestPhysicalPageNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.allocationGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.minimumUserModeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.maximumUserModeAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.activeProcessorsAffinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.numberOfProcessors)
                }
            }
    }
}

public data class MinidumpSystemBasicPerformanceInformation(
    public var availablePages: ULong = 0uL,
    public var committedPages: ULong = 0uL,
    public var commitLimit: ULong = 0uL,
    public var peakCommitment: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemBasicPerformanceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemBasicPerformanceInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MinidumpSystemBasicPerformanceInformation =
                    MinidumpSystemBasicPerformanceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MinidumpSystemBasicPerformanceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.availablePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.committedPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.commitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.peakCommitment)
                }
            }
    }
}

public data class MinidumpSystemFilecacheInformation(
    public var currentSize: ULong = 0uL,
    public var peakSize: ULong = 0uL,
    public var pageFaultCount: UInt = 0u,
    public var minimumWorkingSet: ULong = 0uL,
    public var maximumWorkingSet: ULong = 0uL,
    public var currentSizeIncludingTransitionInPages: ULong = 0uL,
    public var peakSizeIncludingTransitionInPages: ULong = 0uL,
    public var transitionRePurposeCount: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemFilecacheInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemFilecacheInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): MinidumpSystemFilecacheInformation =
                    MinidumpSystemFilecacheInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MinidumpSystemFilecacheInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.currentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.peakSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 20L, value.minimumWorkingSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 28L, value.maximumWorkingSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 36L, value.currentSizeIncludingTransitionInPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 44L, value.peakSizeIncludingTransitionInPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.transitionRePurposeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.flags)
                }
            }
    }
}

public data class MinidumpSystemInfo(
    public var processorArchitecture: ProcessorArchitecture = 0u,
    public var processorLevel: UShort = 0u,
    public var processorRevision: UShort = 0u,
    public var anonymous1: MinidumpSystemInfo0 = MinidumpSystemInfo0(),
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var buildNumber: UInt = 0u,
    public var platformId: VerPlatform = 0u,
    public var cSDVersionRva: UInt = 0u,
    public var anonymous2: MinidumpSystemInfo1 = MinidumpSystemInfo1(),
    public var cpu: CpuInformation = CpuInformation(),
)

public data class MinidumpSystemInfo0(
    public var reserved0: UShort = 0u,
    public var anonymous: MinidumpSystemInfo00 = MinidumpSystemInfo00(),
)

public data class MinidumpSystemInfo00(
    public var numberOfProcessors: UByte = 0u,
    public var productType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemInfo00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): MinidumpSystemInfo00 =
                    MinidumpSystemInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: MinidumpSystemInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.numberOfProcessors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.productType)
                }
            }
    }
}

public data class MinidumpSystemInfo1(
    public var reserved1: UInt = 0u,
    public var anonymous: MinidumpSystemInfo10 = MinidumpSystemInfo10(),
)

public data class MinidumpSystemInfo10(
    public var suiteMask: UShort = 0u,
    public var reserved2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemInfo10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemInfo10> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MinidumpSystemInfo10 =
                    MinidumpSystemInfo10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MinidumpSystemInfo10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.suiteMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved2)
                }
            }
    }
}

public data class MinidumpSystemMemoryInfo1(
    public var revision: UShort = 0u,
    public var flags: UShort = 0u,
    public var basicInfo: MinidumpSystemBasicInformation = MinidumpSystemBasicInformation(),
    public var fileCacheInfo: MinidumpSystemFilecacheInformation = MinidumpSystemFilecacheInformation(),
    public var basicPerfInfo: MinidumpSystemBasicPerformanceInformation = MinidumpSystemBasicPerformanceInformation(),
    public var perfInfo: MinidumpSystemPerformanceInformation = MinidumpSystemPerformanceInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemMemoryInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemMemoryInfo1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 492L
                override fun readNative(addr: Long): MinidumpSystemMemoryInfo1 =
                    MinidumpSystemMemoryInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (MinidumpSystemBasicInformation.typeLayout()).readNative(addr + 4L),
                        (MinidumpSystemFilecacheInformation.typeLayout()).readNative(addr + 56L),
                        (MinidumpSystemBasicPerformanceInformation.typeLayout()).readNative(addr + 116L),
                        (MinidumpSystemPerformanceInformation.typeLayout()).readNative(addr + 148L),
                    )
                override fun writeNative(addr: Long, value: MinidumpSystemMemoryInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (MinidumpSystemBasicInformation.typeLayout()).writeNative(addr + 4L, value.basicInfo)
                    (MinidumpSystemFilecacheInformation.typeLayout()).writeNative(addr + 56L, value.fileCacheInfo)
                    (MinidumpSystemBasicPerformanceInformation.typeLayout()).writeNative(addr + 116L, value.basicPerfInfo)
                    (MinidumpSystemPerformanceInformation.typeLayout()).writeNative(addr + 148L, value.perfInfo)
                }
            }
    }
}

public class MinidumpSystemPerformanceInformation {
    public var idleProcessTime: ULong = 0uL

    public var ioReadTransferCount: ULong = 0uL

    public var ioWriteTransferCount: ULong = 0uL

    public var ioOtherTransferCount: ULong = 0uL

    public var ioReadOperationCount: UInt = 0u

    public var ioWriteOperationCount: UInt = 0u

    public var ioOtherOperationCount: UInt = 0u

    public var availablePages: UInt = 0u

    public var committedPages: UInt = 0u

    public var commitLimit: UInt = 0u

    public var peakCommitment: UInt = 0u

    public var pageFaultCount: UInt = 0u

    public var copyOnWriteCount: UInt = 0u

    public var transitionCount: UInt = 0u

    public var cacheTransitionCount: UInt = 0u

    public var demandZeroCount: UInt = 0u

    public var pageReadCount: UInt = 0u

    public var pageReadIoCount: UInt = 0u

    public var cacheReadCount: UInt = 0u

    public var cacheIoCount: UInt = 0u

    public var dirtyPagesWriteCount: UInt = 0u

    public var dirtyWriteIoCount: UInt = 0u

    public var mappedPagesWriteCount: UInt = 0u

    public var mappedWriteIoCount: UInt = 0u

    public var pagedPoolPages: UInt = 0u

    public var nonPagedPoolPages: UInt = 0u

    public var pagedPoolAllocs: UInt = 0u

    public var pagedPoolFrees: UInt = 0u

    public var nonPagedPoolAllocs: UInt = 0u

    public var nonPagedPoolFrees: UInt = 0u

    public var freeSystemPtes: UInt = 0u

    public var residentSystemCodePage: UInt = 0u

    public var totalSystemDriverPages: UInt = 0u

    public var totalSystemCodePages: UInt = 0u

    public var nonPagedPoolLookasideHits: UInt = 0u

    public var pagedPoolLookasideHits: UInt = 0u

    public var availablePagedPoolPages: UInt = 0u

    public var residentSystemCachePage: UInt = 0u

    public var residentPagedPoolPage: UInt = 0u

    public var residentSystemDriverPage: UInt = 0u

    public var ccFastReadNoWait: UInt = 0u

    public var ccFastReadWait: UInt = 0u

    public var ccFastReadResourceMiss: UInt = 0u

    public var ccFastReadNotPossible: UInt = 0u

    public var ccFastMdlReadNoWait: UInt = 0u

    public var ccFastMdlReadWait: UInt = 0u

    public var ccFastMdlReadResourceMiss: UInt = 0u

    public var ccFastMdlReadNotPossible: UInt = 0u

    public var ccMapDataNoWait: UInt = 0u

    public var ccMapDataWait: UInt = 0u

    public var ccMapDataNoWaitMiss: UInt = 0u

    public var ccMapDataWaitMiss: UInt = 0u

    public var ccPinMappedDataCount: UInt = 0u

    public var ccPinReadNoWait: UInt = 0u

    public var ccPinReadWait: UInt = 0u

    public var ccPinReadNoWaitMiss: UInt = 0u

    public var ccPinReadWaitMiss: UInt = 0u

    public var ccCopyReadNoWait: UInt = 0u

    public var ccCopyReadWait: UInt = 0u

    public var ccCopyReadNoWaitMiss: UInt = 0u

    public var ccCopyReadWaitMiss: UInt = 0u

    public var ccMdlReadNoWait: UInt = 0u

    public var ccMdlReadWait: UInt = 0u

    public var ccMdlReadNoWaitMiss: UInt = 0u

    public var ccMdlReadWaitMiss: UInt = 0u

    public var ccReadAheadIos: UInt = 0u

    public var ccLazyWriteIos: UInt = 0u

    public var ccLazyWritePages: UInt = 0u

    public var ccDataFlushes: UInt = 0u

    public var ccDataPages: UInt = 0u

    public var contextSwitches: UInt = 0u

    public var firstLevelTbFills: UInt = 0u

    public var secondLevelTbFills: UInt = 0u

    public var systemCalls: UInt = 0u

    public var ccTotalDirtyPages: ULong = 0uL

    public var ccDirtyPageThreshold: ULong = 0uL

    public var residentAvailablePages: Long = 0L

    public var sharedCommittedPages: ULong = 0uL

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemPerformanceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpSystemPerformanceInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 344L
                override fun readNative(addr: Long): MinidumpSystemPerformanceInformation =
                    MinidumpSystemPerformanceInformation().apply {
                        this.idleProcessTime = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr)
                        this.ioReadTransferCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L)
                        this.ioWriteTransferCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L)
                        this.ioOtherTransferCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L)
                        this.ioReadOperationCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L)
                        this.ioWriteOperationCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L)
                        this.ioOtherOperationCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L)
                        this.availablePages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L)
                        this.committedPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L)
                        this.commitLimit = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L)
                        this.peakCommitment = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L)
                        this.pageFaultCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L)
                        this.copyOnWriteCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L)
                        this.transitionCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L)
                        this.cacheTransitionCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L)
                        this.demandZeroCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L)
                        this.pageReadCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L)
                        this.pageReadIoCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L)
                        this.cacheReadCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L)
                        this.cacheIoCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L)
                        this.dirtyPagesWriteCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L)
                        this.dirtyWriteIoCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L)
                        this.mappedPagesWriteCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L)
                        this.mappedWriteIoCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L)
                        this.pagedPoolPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L)
                        this.nonPagedPoolPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L)
                        this.pagedPoolAllocs = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L)
                        this.pagedPoolFrees = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L)
                        this.nonPagedPoolAllocs = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L)
                        this.nonPagedPoolFrees = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L)
                        this.freeSystemPtes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L)
                        this.residentSystemCodePage = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L)
                        this.totalSystemDriverPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L)
                        this.totalSystemCodePages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L)
                        this.nonPagedPoolLookasideHits = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L)
                        this.pagedPoolLookasideHits = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L)
                        this.availablePagedPoolPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L)
                        this.residentSystemCachePage = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L)
                        this.residentPagedPoolPage = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L)
                        this.residentSystemDriverPage = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L)
                        this.ccFastReadNoWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L)
                        this.ccFastReadWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L)
                        this.ccFastReadResourceMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L)
                        this.ccFastReadNotPossible = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L)
                        this.ccFastMdlReadNoWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L)
                        this.ccFastMdlReadWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L)
                        this.ccFastMdlReadResourceMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L)
                        this.ccFastMdlReadNotPossible = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L)
                        this.ccMapDataNoWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L)
                        this.ccMapDataWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L)
                        this.ccMapDataNoWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L)
                        this.ccMapDataWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L)
                        this.ccPinMappedDataCount = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 224L)
                        this.ccPinReadNoWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 228L)
                        this.ccPinReadWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 232L)
                        this.ccPinReadNoWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 236L)
                        this.ccPinReadWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 240L)
                        this.ccCopyReadNoWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 244L)
                        this.ccCopyReadWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 248L)
                        this.ccCopyReadNoWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 252L)
                        this.ccCopyReadWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L)
                        this.ccMdlReadNoWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L)
                        this.ccMdlReadWait = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L)
                        this.ccMdlReadNoWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L)
                        this.ccMdlReadWaitMiss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L)
                        this.ccReadAheadIos = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L)
                        this.ccLazyWriteIos = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 280L)
                        this.ccLazyWritePages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 284L)
                        this.ccDataFlushes = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 288L)
                        this.ccDataPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 292L)
                        this.contextSwitches = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 296L)
                        this.firstLevelTbFills = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 300L)
                        this.secondLevelTbFills = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 304L)
                        this.systemCalls = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 308L)
                        this.ccTotalDirtyPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 312L)
                        this.ccDirtyPageThreshold = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 320L)
                        this.residentAvailablePages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 328L)
                        this.sharedCommittedPages = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 336L)
                    }
                override fun writeNative(addr: Long, value: MinidumpSystemPerformanceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.idleProcessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ioReadTransferCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ioWriteTransferCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ioOtherTransferCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ioReadOperationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ioWriteOperationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ioOtherOperationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.availablePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.committedPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.commitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.peakCommitment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.pageFaultCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.copyOnWriteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.transitionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.cacheTransitionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.demandZeroCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.pageReadCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.pageReadIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.cacheReadCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.cacheIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dirtyPagesWriteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dirtyWriteIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.mappedPagesWriteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.mappedWriteIoCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.pagedPoolPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.nonPagedPoolPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.pagedPoolAllocs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.pagedPoolFrees)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.nonPagedPoolAllocs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.nonPagedPoolFrees)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.freeSystemPtes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.residentSystemCodePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.totalSystemDriverPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.totalSystemCodePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.nonPagedPoolLookasideHits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.pagedPoolLookasideHits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.availablePagedPoolPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.residentSystemCachePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.residentPagedPoolPage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.residentSystemDriverPage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.ccFastReadNoWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.ccFastReadWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.ccFastReadResourceMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.ccFastReadNotPossible)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.ccFastMdlReadNoWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.ccFastMdlReadWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.ccFastMdlReadResourceMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.ccFastMdlReadNotPossible)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.ccMapDataNoWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.ccMapDataWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.ccMapDataNoWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.ccMapDataWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 224L, value.ccPinMappedDataCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 228L, value.ccPinReadNoWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 232L, value.ccPinReadWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 236L, value.ccPinReadNoWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 240L, value.ccPinReadWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 244L, value.ccCopyReadNoWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 248L, value.ccCopyReadWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 252L, value.ccCopyReadNoWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.ccCopyReadWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.ccMdlReadNoWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.ccMdlReadWait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.ccMdlReadNoWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.ccMdlReadWaitMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.ccReadAheadIos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 280L, value.ccLazyWriteIos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 284L, value.ccLazyWritePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 288L, value.ccDataFlushes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 292L, value.ccDataPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 296L, value.contextSwitches)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 300L, value.firstLevelTbFills)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 304L, value.secondLevelTbFills)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 308L, value.systemCalls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 312L, value.ccTotalDirtyPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 320L, value.ccDirtyPageThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 328L, value.residentAvailablePages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 336L, value.sharedCommittedPages)
                }
            }
    }
}

public data class MinidumpThread(
    public var threadId: UInt = 0u,
    public var suspendCount: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var teb: ULong = 0uL,
    public var stack: MinidumpMemoryDescriptor = MinidumpMemoryDescriptor(),
    public var threadContext: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThread> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThread> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MinidumpThread =
                    MinidumpThread(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (MinidumpMemoryDescriptor.typeLayout()).readNative(addr + 24L),
                        (MinidumpLocationDescriptor.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThread) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.suspendCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.priorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.teb)
                    (MinidumpMemoryDescriptor.typeLayout()).writeNative(addr + 24L, value.stack)
                    (MinidumpLocationDescriptor.typeLayout()).writeNative(addr + 40L, value.threadContext)
                }
            }
    }
}

public class MinidumpThreadCallback internal constructor(
    public var threadId: UInt,
    threadHandleCtorArg: Handle,
    public var context: Context,
    public var sizeOfContext: UInt,
    public var stackBase: ULong,
    public var stackEnd: ULong,
) {
    public var threadHandle: Handle = threadHandleCtorArg
        internal set

    public constructor() : this(
        threadId = 0u,
        threadHandleCtorArg = MutPtr(0L),
        context = Context(),
        sizeOfContext = 0u,
        stackBase = 0uL,
        stackEnd = 0uL,
    )

    public operator fun component1(): UInt = this.threadId

    public operator fun component2(): Handle = this.threadHandle

    public operator fun component3(): Context = this.context

    public operator fun component4(): UInt = this.sizeOfContext

    public operator fun component5(): ULong = this.stackBase

    public operator fun component6(): ULong = this.stackEnd

    public fun copy(threadId: UInt = this.threadId, threadHandle: Handle = this.threadHandle, context: Context = this.context, sizeOfContext: UInt = this.sizeOfContext, stackBase: ULong = this.stackBase, stackEnd: ULong = this.stackEnd): MinidumpThreadCallback = MinidumpThreadCallback(threadId = threadId, threadHandleCtorArg = threadHandle, context = context, sizeOfContext = sizeOfContext, stackBase = stackBase, stackEnd = stackEnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpThreadCallback) return false
        if (this.threadId != other.threadId) return false
        if (this.threadHandle != other.threadHandle) return false
        if (this.context != other.context) return false
        if (this.sizeOfContext != other.sizeOfContext) return false
        if (this.stackBase != other.stackBase) return false
        if (this.stackEnd != other.stackEnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadId.hashCode()
        result = 31 * result + this.threadHandle.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.sizeOfContext.hashCode()
        result = 31 * result + this.stackBase.hashCode()
        result = 31 * result + this.stackEnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            threadId: UInt = 0u,
            threadHandle: Handle = MutPtr(0L),
            context: Context = Context(),
            sizeOfContext: UInt = 0u,
            stackBase: ULong = 0uL,
            stackEnd: ULong = 0uL,
        ): MinidumpThreadCallback =
            MinidumpThreadCallback(
                threadId = threadId,
                threadHandleCtorArg = threadHandle,
                context = context,
                sizeOfContext = sizeOfContext,
                stackBase = stackBase,
                stackEnd = stackEnd,
            )
    }
}

public data class MinidumpThreadEx(
    public var threadId: UInt = 0u,
    public var suspendCount: UInt = 0u,
    public var priorityClass: UInt = 0u,
    public var priority: UInt = 0u,
    public var teb: ULong = 0uL,
    public var stack: MinidumpMemoryDescriptor = MinidumpMemoryDescriptor(),
    public var threadContext: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
    public var backingStore: MinidumpMemoryDescriptor = MinidumpMemoryDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MinidumpThreadEx =
                    MinidumpThreadEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (MinidumpMemoryDescriptor.typeLayout()).readNative(addr + 24L),
                        (MinidumpLocationDescriptor.typeLayout()).readNative(addr + 40L),
                        (MinidumpMemoryDescriptor.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.suspendCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.priorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.teb)
                    (MinidumpMemoryDescriptor.typeLayout()).writeNative(addr + 24L, value.stack)
                    (MinidumpLocationDescriptor.typeLayout()).writeNative(addr + 40L, value.threadContext)
                    (MinidumpMemoryDescriptor.typeLayout()).writeNative(addr + 48L, value.backingStore)
                }
            }
    }
}

public class MinidumpThreadExCallback internal constructor(
    public var threadId: UInt,
    threadHandleCtorArg: Handle,
    public var context: Context,
    public var sizeOfContext: UInt,
    public var stackBase: ULong,
    public var stackEnd: ULong,
    public var backingStoreBase: ULong,
    public var backingStoreEnd: ULong,
) {
    public var threadHandle: Handle = threadHandleCtorArg
        internal set

    public constructor() : this(
        threadId = 0u,
        threadHandleCtorArg = MutPtr(0L),
        context = Context(),
        sizeOfContext = 0u,
        stackBase = 0uL,
        stackEnd = 0uL,
        backingStoreBase = 0uL,
        backingStoreEnd = 0uL,
    )

    public operator fun component1(): UInt = this.threadId

    public operator fun component2(): Handle = this.threadHandle

    public operator fun component3(): Context = this.context

    public operator fun component4(): UInt = this.sizeOfContext

    public operator fun component5(): ULong = this.stackBase

    public operator fun component6(): ULong = this.stackEnd

    public operator fun component7(): ULong = this.backingStoreBase

    public operator fun component8(): ULong = this.backingStoreEnd

    public fun copy(threadId: UInt = this.threadId, threadHandle: Handle = this.threadHandle, context: Context = this.context, sizeOfContext: UInt = this.sizeOfContext, stackBase: ULong = this.stackBase, stackEnd: ULong = this.stackEnd, backingStoreBase: ULong = this.backingStoreBase, backingStoreEnd: ULong = this.backingStoreEnd): MinidumpThreadExCallback = MinidumpThreadExCallback(threadId = threadId, threadHandleCtorArg = threadHandle, context = context, sizeOfContext = sizeOfContext, stackBase = stackBase, stackEnd = stackEnd, backingStoreBase = backingStoreBase, backingStoreEnd = backingStoreEnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpThreadExCallback) return false
        if (this.threadId != other.threadId) return false
        if (this.threadHandle != other.threadHandle) return false
        if (this.context != other.context) return false
        if (this.sizeOfContext != other.sizeOfContext) return false
        if (this.stackBase != other.stackBase) return false
        if (this.stackEnd != other.stackEnd) return false
        if (this.backingStoreBase != other.backingStoreBase) return false
        if (this.backingStoreEnd != other.backingStoreEnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadId.hashCode()
        result = 31 * result + this.threadHandle.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.sizeOfContext.hashCode()
        result = 31 * result + this.stackBase.hashCode()
        result = 31 * result + this.stackEnd.hashCode()
        result = 31 * result + this.backingStoreBase.hashCode()
        result = 31 * result + this.backingStoreEnd.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            threadId: UInt = 0u,
            threadHandle: Handle = MutPtr(0L),
            context: Context = Context(),
            sizeOfContext: UInt = 0u,
            stackBase: ULong = 0uL,
            stackEnd: ULong = 0uL,
            backingStoreBase: ULong = 0uL,
            backingStoreEnd: ULong = 0uL,
        ): MinidumpThreadExCallback =
            MinidumpThreadExCallback(
                threadId = threadId,
                threadHandleCtorArg = threadHandle,
                context = context,
                sizeOfContext = sizeOfContext,
                stackBase = stackBase,
                stackEnd = stackEnd,
                backingStoreBase = backingStoreBase,
                backingStoreEnd = backingStoreEnd,
            )
    }
}

public data class MinidumpThreadExList(
    public var numberOfThreads: UInt = 0u,
    public var threads: List<MinidumpThreadEx> = List(1) { MinidumpThreadEx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadExList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadExList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): MinidumpThreadExList =
                    MinidumpThreadExList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MinidumpThreadEx.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadExList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfThreads)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MinidumpThreadEx.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.threads)
                }
            }
    }
}

public data class MinidumpThreadInfo(
    public var threadId: UInt = 0u,
    public var dumpFlags: MinidumpThreadInfoDumpFlags = 0u,
    public var dumpError: UInt = 0u,
    public var exitStatus: UInt = 0u,
    public var createTime: ULong = 0uL,
    public var exitTime: ULong = 0uL,
    public var kernelTime: ULong = 0uL,
    public var userTime: ULong = 0uL,
    public var startAddress: ULong = 0uL,
    public var affinity: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MinidumpThreadInfo =
                    MinidumpThreadInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dumpFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dumpError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.exitStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.createTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.exitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.userTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.startAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.affinity)
                }
            }
    }
}

public data class MinidumpThreadInfoList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadInfoList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadInfoList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpThreadInfoList =
                    MinidumpThreadInfoList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadInfoList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfEntries)
                }
            }
    }
}

public data class MinidumpThreadList(
    public var numberOfThreads: UInt = 0u,
    public var threads: List<MinidumpThread> = List(1) { MinidumpThread() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): MinidumpThreadList =
                    MinidumpThreadList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MinidumpThread.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfThreads)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MinidumpThread.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.threads)
                }
            }
    }
}

public data class MinidumpThreadName(
    public var threadId: UInt = 0u,
    public var rvaOfThreadName: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadName> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpThreadName =
                    MinidumpThreadName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 4L, value.rvaOfThreadName)
                }
            }
    }
}

public data class MinidumpThreadNameList(
    public var numberOfThreadNames: UInt = 0u,
    public var threadNames: List<MinidumpThreadName> = List(1) { MinidumpThreadName() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadNameList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpThreadNameList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpThreadNameList =
                    MinidumpThreadNameList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MinidumpThreadName.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpThreadNameList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfThreadNames)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MinidumpThreadName.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.threadNames)
                }
            }
    }
}

public data class MinidumpTokenInfoHeader(
    public var tokenSize: UInt = 0u,
    public var tokenId: UInt = 0u,
    public var tokenHandle: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpTokenInfoHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpTokenInfoHeader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpTokenInfoHeader =
                    MinidumpTokenInfoHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpTokenInfoHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tokenSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tokenId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tokenHandle)
                }
            }
    }
}

public data class MinidumpTokenInfoList(
    public var tokenListSize: UInt = 0u,
    public var tokenListEntries: UInt = 0u,
    public var listHeaderSize: UInt = 0u,
    public var elementHeaderSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpTokenInfoList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpTokenInfoList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpTokenInfoList =
                    MinidumpTokenInfoList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MinidumpTokenInfoList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tokenListSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tokenListEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.listHeaderSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.elementHeaderSize)
                }
            }
    }
}

public data class MinidumpUnloadedModule(
    public var baseOfImage: ULong = 0uL,
    public var sizeOfImage: UInt = 0u,
    public var checkSum: UInt = 0u,
    public var timeDateStamp: UInt = 0u,
    public var moduleNameRva: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUnloadedModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUnloadedModule> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MinidumpUnloadedModule =
                    MinidumpUnloadedModule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MinidumpUnloadedModule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.baseOfImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sizeOfImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.checkSum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeDateStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.moduleNameRva)
                }
            }
    }
}

public data class MinidumpUnloadedModuleList(
    public var sizeOfHeader: UInt = 0u,
    public var sizeOfEntry: UInt = 0u,
    public var numberOfEntries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUnloadedModuleList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUnloadedModuleList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpUnloadedModuleList =
                    MinidumpUnloadedModuleList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpUnloadedModuleList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sizeOfEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numberOfEntries)
                }
            }
    }
}

public data class MinidumpUserRecord(
    public var type: UInt = 0u,
    public var memory: MinidumpLocationDescriptor = MinidumpLocationDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUserRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUserRecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpUserRecord =
                    MinidumpUserRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (MinidumpLocationDescriptor.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpUserRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (MinidumpLocationDescriptor.typeLayout()).writeNative(addr + 4L, value.memory)
                }
            }
    }
}

public class MinidumpUserStream internal constructor(
    public var type: UInt,
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): UInt = this.bufferSize

    public operator fun component3(): MutPtr<CVoid> = this.buffer

    public fun copy(type: UInt = this.type, bufferSize: UInt = this.bufferSize, buffer: MutPtr<CVoid> = this.buffer): MinidumpUserStream = MinidumpUserStream(type = type, bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpUserStream) return false
        if (this.type != other.type) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUserStream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUserStream> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MinidumpUserStream =
                    MinidumpUserStream(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MinidumpUserStream) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            type: UInt = 0u,
            bufferSize: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): MinidumpUserStream =
            MinidumpUserStream(
                type = type,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public class MinidumpUserStreamInformation internal constructor(
    public var userStreamCount: UInt,
    userStreamArrayCtorArg: MutPtr<MinidumpUserStream>,
) {
    public var userStreamArray: MutPtr<MinidumpUserStream> = userStreamArrayCtorArg
        internal set

    public constructor() : this(
        userStreamCount = 0u,
        userStreamArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.userStreamCount

    public operator fun component2(): MutPtr<MinidumpUserStream> = this.userStreamArray

    public fun copy(userStreamCount: UInt = this.userStreamCount, userStreamArray: MutPtr<MinidumpUserStream> = this.userStreamArray): MinidumpUserStreamInformation = MinidumpUserStreamInformation(userStreamCount = userStreamCount, userStreamArrayCtorArg = userStreamArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpUserStreamInformation) return false
        if (this.userStreamCount != other.userStreamCount) return false
        if (this.userStreamArray != other.userStreamArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userStreamCount.hashCode()
        result = 31 * result + this.userStreamArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUserStreamInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpUserStreamInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MinidumpUserStreamInformation =
                    MinidumpUserStreamInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MinidumpUserStream>(64)
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MinidumpUserStreamInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.userStreamCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MinidumpUserStream>(64)
                    ).writeNative(addr + 4L, value.userStreamArray)
                }
            }

        public operator fun invoke(
            userStreamCount: UInt = 0u,
            userStreamArray: MutPtr<MinidumpUserStream> = MutPtr(0L),
        ): MinidumpUserStreamInformation =
            MinidumpUserStreamInformation(
                userStreamCount = userStreamCount,
                userStreamArrayCtorArg = userStreamArray,
            )
    }
}

public class MinidumpVmPostReadCallback internal constructor(
    public var offset: ULong,
    bufferCtorArg: MutPtr<CVoid>,
    public var size: UInt,
    public var completed: UInt,
    public var status: Hresult,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        offset = 0uL,
        bufferCtorArg = MutPtr(0L),
        size = 0u,
        completed = 0u,
        status = 0,
    )

    public operator fun component1(): ULong = this.offset

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public operator fun component3(): UInt = this.size

    public operator fun component4(): UInt = this.completed

    public operator fun component5(): Hresult = this.status

    public fun copy(offset: ULong = this.offset, buffer: MutPtr<CVoid> = this.buffer, size: UInt = this.size, completed: UInt = this.completed, status: Hresult = this.status): MinidumpVmPostReadCallback = MinidumpVmPostReadCallback(offset = offset, bufferCtorArg = buffer, size = size, completed = completed, status = status)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpVmPostReadCallback) return false
        if (this.offset != other.offset) return false
        if (this.buffer != other.buffer) return false
        if (this.size != other.size) return false
        if (this.completed != other.completed) return false
        if (this.status != other.status) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.completed.hashCode()
        result = 31 * result + this.status.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpVmPostReadCallback> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpVmPostReadCallback> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MinidumpVmPostReadCallback =
                    MinidumpVmPostReadCallback(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MinidumpVmPostReadCallback) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.completed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.status)
                }
            }

        public operator fun invoke(
            offset: ULong = 0uL,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            size: UInt = 0u,
            completed: UInt = 0u,
            status: Hresult = 0,
        ): MinidumpVmPostReadCallback =
            MinidumpVmPostReadCallback(
                offset = offset,
                bufferCtorArg = buffer,
                size = size,
                completed = completed,
                status = status,
            )
    }
}

public class MinidumpVmPreReadCallback internal constructor(
    public var offset: ULong,
    bufferCtorArg: MutPtr<CVoid>,
    public var size: UInt,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        offset = 0uL,
        bufferCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): ULong = this.offset

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public operator fun component3(): UInt = this.size

    public fun copy(offset: ULong = this.offset, buffer: MutPtr<CVoid> = this.buffer, size: UInt = this.size): MinidumpVmPreReadCallback = MinidumpVmPreReadCallback(offset = offset, bufferCtorArg = buffer, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MinidumpVmPreReadCallback) return false
        if (this.offset != other.offset) return false
        if (this.buffer != other.buffer) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpVmPreReadCallback> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpVmPreReadCallback> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MinidumpVmPreReadCallback =
                    MinidumpVmPreReadCallback(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MinidumpVmPreReadCallback) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                }
            }

        public operator fun invoke(
            offset: ULong = 0uL,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            size: UInt = 0u,
        ): MinidumpVmPreReadCallback =
            MinidumpVmPreReadCallback(
                offset = offset,
                bufferCtorArg = buffer,
                size = size,
            )
    }
}

public data class MinidumpVmQueryCallback(
    public var offset: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpVmQueryCallback> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MinidumpVmQueryCallback> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MinidumpVmQueryCallback =
                    MinidumpVmQueryCallback(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MinidumpVmQueryCallback) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                }
            }
    }
}

public data class ModloadCvmisc(
    public var oCV: UInt = 0u,
    public var cCV: Int = 0,
    public var oMisc: UInt = 0u,
    public var cMisc: Int = 0,
    public var dtImage: UInt = 0u,
    public var cImage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ModloadCvmisc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ModloadCvmisc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ModloadCvmisc =
                    ModloadCvmisc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: ModloadCvmisc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oCV)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.cCV)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.oMisc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.cMisc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dtImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cImage)
                }
            }
    }
}

public class ModloadData internal constructor(
    public var ssize: UInt,
    public var ssig: ModloadDataType,
    dataCtorArg: MutPtr<CVoid>,
    public var size: UInt,
    public var flags: UInt,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        ssize = 0u,
        ssig = 0u,
        dataCtorArg = MutPtr(0L),
        size = 0u,
        flags = 0u,
    )

    public operator fun component1(): UInt = this.ssize

    public operator fun component2(): ModloadDataType = this.ssig

    public operator fun component3(): MutPtr<CVoid> = this.data

    public operator fun component4(): UInt = this.size

    public operator fun component5(): UInt = this.flags

    public fun copy(ssize: UInt = this.ssize, ssig: ModloadDataType = this.ssig, data: MutPtr<CVoid> = this.data, size: UInt = this.size, flags: UInt = this.flags): ModloadData = ModloadData(ssize = ssize, ssig = ssig, dataCtorArg = data, size = size, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModloadData) return false
        if (this.ssize != other.ssize) return false
        if (this.ssig != other.ssig) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssize.hashCode()
        result = 31 * result + this.ssig.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ModloadData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ModloadData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ModloadData =
                    ModloadData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: ModloadData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ssig)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                }
            }

        public operator fun invoke(
            ssize: UInt = 0u,
            ssig: ModloadDataType = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            size: UInt = 0u,
            flags: UInt = 0u,
        ): ModloadData =
            ModloadData(
                ssize = ssize,
                ssig = ssig,
                dataCtorArg = data,
                size = size,
                flags = flags,
            )
    }
}

public data class ModloadPdbguidPdbage(
    public var pdbGuid: Guid = Guid(),
    public var pdbAge: UInt = 0u,
)

public data class ModuleTypeInfo(
    public var dataLength: UShort = 0u,
    public var leaf: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModuleTypeInfo) return false
        if (this.dataLength != other.dataLength) return false
        if (this.leaf != other.leaf) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataLength.hashCode()
        result = 31 * result + this.leaf.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ModuleTypeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ModuleTypeInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): ModuleTypeInfo =
                    ModuleTypeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ModuleTypeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.leaf)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class Omap(
    public var rva: UInt = 0u,
    public var rvaTo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Omap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Omap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Omap =
                    Omap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Omap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rva)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rvaTo)
                }
            }
    }
}

public class OutputDebugStringInfo internal constructor(
    lpDebugStringDataCtorArg: Pstr,
    public var fUnicode: UShort,
    public var nDebugStringLength: UShort,
) {
    public var lpDebugStringData: Pstr = lpDebugStringDataCtorArg
        internal set

    public constructor() : this(
        lpDebugStringDataCtorArg = MutPtr(0L),
        fUnicode = 0u,
        nDebugStringLength = 0u,
    )

    public operator fun component1(): Pstr = this.lpDebugStringData

    public operator fun component2(): UShort = this.fUnicode

    public operator fun component3(): UShort = this.nDebugStringLength

    public fun copy(lpDebugStringData: Pstr = this.lpDebugStringData, fUnicode: UShort = this.fUnicode, nDebugStringLength: UShort = this.nDebugStringLength): OutputDebugStringInfo = OutputDebugStringInfo(lpDebugStringDataCtorArg = lpDebugStringData, fUnicode = fUnicode, nDebugStringLength = nDebugStringLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OutputDebugStringInfo) return false
        if (this.lpDebugStringData != other.lpDebugStringData) return false
        if (this.fUnicode != other.fUnicode) return false
        if (this.nDebugStringLength != other.nDebugStringLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpDebugStringData.hashCode()
        result = 31 * result + this.fUnicode.hashCode()
        result = 31 * result + this.nDebugStringLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpDebugStringData: Pstr = MutPtr(0L),
            fUnicode: UShort = 0u,
            nDebugStringLength: UShort = 0u,
        ): OutputDebugStringInfo =
            OutputDebugStringInfo(
                lpDebugStringDataCtorArg = lpDebugStringData,
                fUnicode = fUnicode,
                nDebugStringLength = nDebugStringLength,
            )
    }
}

public data class PhysicalMemoryDescriptor32(
    public var numberOfRuns: UInt = 0u,
    public var numberOfPages: UInt = 0u,
    public var run: List<PhysicalMemoryRun32> = List(1) { PhysicalMemoryRun32() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryDescriptor32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryDescriptor32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PhysicalMemoryDescriptor32 =
                    PhysicalMemoryDescriptor32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PhysicalMemoryRun32.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryDescriptor32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfRuns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberOfPages)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PhysicalMemoryRun32.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.run)
                }
            }
    }
}

public data class PhysicalMemoryDescriptor64(
    public var numberOfRuns: UInt = 0u,
    public var numberOfPages: ULong = 0uL,
    public var run: List<PhysicalMemoryRun64> = List(1) { PhysicalMemoryRun64() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryDescriptor64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryDescriptor64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PhysicalMemoryDescriptor64 =
                    PhysicalMemoryDescriptor64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PhysicalMemoryRun64.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryDescriptor64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfRuns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.numberOfPages)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PhysicalMemoryRun64.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.run)
                }
            }
    }
}

public data class PhysicalMemoryRun32(
    public var basePage: UInt = 0u,
    public var pageCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRun32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRun32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PhysicalMemoryRun32 =
                    PhysicalMemoryRun32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryRun32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.basePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pageCount)
                }
            }
    }
}

public data class PhysicalMemoryRun64(
    public var basePage: ULong = 0uL,
    public var pageCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRun64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PhysicalMemoryRun64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PhysicalMemoryRun64 =
                    PhysicalMemoryRun64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PhysicalMemoryRun64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.basePage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pageCount)
                }
            }
    }
}

public data class RipInfo(
    public var dwError: UInt = 0u,
    public var dwType: RipInfoType = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RipInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RipInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RipInfo =
                    RipInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RipInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwType)
                }
            }
    }
}

public class Sourcefile internal constructor(
    public var modBase: ULong,
    fileNameCtorArg: Pstr,
) {
    public var fileName: Pstr = fileNameCtorArg
        internal set

    public constructor() : this(
        modBase = 0uL,
        fileNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.modBase

    public operator fun component2(): Pstr = this.fileName

    public fun copy(modBase: ULong = this.modBase, fileName: Pstr = this.fileName): Sourcefile = Sourcefile(modBase = modBase, fileNameCtorArg = fileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sourcefile) return false
        if (this.modBase != other.modBase) return false
        if (this.fileName != other.fileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modBase.hashCode()
        result = 31 * result + this.fileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            modBase: ULong = 0uL,
            fileName: Pstr = MutPtr(0L),
        ): Sourcefile =
            Sourcefile(
                modBase = modBase,
                fileNameCtorArg = fileName,
            )
    }
}

public class Sourcefilew internal constructor(
    public var modBase: ULong,
    fileNameCtorArg: Pwstr,
) {
    public var fileName: Pwstr = fileNameCtorArg
        internal set

    public constructor() : this(
        modBase = 0uL,
        fileNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.modBase

    public operator fun component2(): Pwstr = this.fileName

    public fun copy(modBase: ULong = this.modBase, fileName: Pwstr = this.fileName): Sourcefilew = Sourcefilew(modBase = modBase, fileNameCtorArg = fileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sourcefilew) return false
        if (this.modBase != other.modBase) return false
        if (this.fileName != other.fileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modBase.hashCode()
        result = 31 * result + this.fileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            modBase: ULong = 0uL,
            fileName: Pwstr = MutPtr(0L),
        ): Sourcefilew =
            Sourcefilew(
                modBase = modBase,
                fileNameCtorArg = fileName,
            )
    }
}

public class Srccodeinfo internal constructor(
    public var sizeOfStruct: UInt,
    keyCtorArg: MutPtr<CVoid>,
    public var modBase: ULong,
    public var obj: ByteArray,
    public var fileName: ByteArray,
    public var lineNumber: UInt,
    public var address: ULong,
) {
    public var key: MutPtr<CVoid> = keyCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        keyCtorArg = MutPtr(0L),
        modBase = 0uL,
        obj = ByteArray(261),
        fileName = ByteArray(261),
        lineNumber = 0u,
        address = 0uL,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): MutPtr<CVoid> = this.key

    public operator fun component3(): ULong = this.modBase

    public operator fun component4(): ByteArray = this.obj

    public operator fun component5(): ByteArray = this.fileName

    public operator fun component6(): UInt = this.lineNumber

    public operator fun component7(): ULong = this.address

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, key: MutPtr<CVoid> = this.key, modBase: ULong = this.modBase, obj: ByteArray = this.obj, fileName: ByteArray = this.fileName, lineNumber: UInt = this.lineNumber, address: ULong = this.address): Srccodeinfo = Srccodeinfo(sizeOfStruct = sizeOfStruct, keyCtorArg = key, modBase = modBase, obj = obj, fileName = fileName, lineNumber = lineNumber, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Srccodeinfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.key != other.key) return false
        if (this.modBase != other.modBase) return false
        if (!this.obj.contentEquals(other.obj)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.obj.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Srccodeinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Srccodeinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 560L
                override fun readNative(addr: Long): Srccodeinfo =
                    Srccodeinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 285L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 548L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 552L),
                    )
                override fun writeNative(addr: Long, value: Srccodeinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.modBase)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 24L, value.obj.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 285L, value.fileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 548L, value.lineNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 552L, value.address)
                }
            }

        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            key: MutPtr<CVoid> = MutPtr(0L),
            modBase: ULong = 0uL,
            obj: ByteArray = ByteArray(261),
            fileName: ByteArray = ByteArray(261),
            lineNumber: UInt = 0u,
            address: ULong = 0uL,
        ): Srccodeinfo =
            Srccodeinfo(
                sizeOfStruct = sizeOfStruct,
                keyCtorArg = key,
                modBase = modBase,
                obj = obj,
                fileName = fileName,
                lineNumber = lineNumber,
                address = address,
            )
    }
}

public class Srccodeinfow internal constructor(
    public var sizeOfStruct: UInt,
    keyCtorArg: MutPtr<CVoid>,
    public var modBase: ULong,
    public var obj: UShortArray,
    public var fileName: UShortArray,
    public var lineNumber: UInt,
    public var address: ULong,
) {
    public var key: MutPtr<CVoid> = keyCtorArg
        internal set

    public constructor() : this(
        sizeOfStruct = 0u,
        keyCtorArg = MutPtr(0L),
        modBase = 0uL,
        obj = UShortArray(261),
        fileName = UShortArray(261),
        lineNumber = 0u,
        address = 0uL,
    )

    public operator fun component1(): UInt = this.sizeOfStruct

    public operator fun component2(): MutPtr<CVoid> = this.key

    public operator fun component3(): ULong = this.modBase

    public operator fun component4(): UShortArray = this.obj

    public operator fun component5(): UShortArray = this.fileName

    public operator fun component6(): UInt = this.lineNumber

    public operator fun component7(): ULong = this.address

    public fun copy(sizeOfStruct: UInt = this.sizeOfStruct, key: MutPtr<CVoid> = this.key, modBase: ULong = this.modBase, obj: UShortArray = this.obj, fileName: UShortArray = this.fileName, lineNumber: UInt = this.lineNumber, address: ULong = this.address): Srccodeinfow = Srccodeinfow(sizeOfStruct = sizeOfStruct, keyCtorArg = key, modBase = modBase, obj = obj, fileName = fileName, lineNumber = lineNumber, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Srccodeinfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.key != other.key) return false
        if (this.modBase != other.modBase) return false
        if (!this.obj.contentEquals(other.obj)) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        if (this.lineNumber != other.lineNumber) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.obj.contentHashCode()
        result = 31 * result + this.fileName.contentHashCode()
        result = 31 * result + this.lineNumber.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Srccodeinfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Srccodeinfow> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1080L
                override fun readNative(addr: Long): Srccodeinfow =
                    Srccodeinfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 546L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1068L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1072L),
                    )
                override fun writeNative(addr: Long, value: Srccodeinfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.modBase)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 24L, value.obj.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 546L, value.fileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1068L, value.lineNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1072L, value.address)
                }
            }

        public operator fun invoke(
            sizeOfStruct: UInt = 0u,
            key: MutPtr<CVoid> = MutPtr(0L),
            modBase: ULong = 0uL,
            obj: UShortArray = UShortArray(261),
            fileName: UShortArray = UShortArray(261),
            lineNumber: UInt = 0u,
            address: ULong = 0uL,
        ): Srccodeinfow =
            Srccodeinfow(
                sizeOfStruct = sizeOfStruct,
                keyCtorArg = key,
                modBase = modBase,
                obj = obj,
                fileName = fileName,
                lineNumber = lineNumber,
                address = address,
            )
    }
}

public class Stackframe64 internal constructor(
    public var addrPC: Address64,
    public var addrReturn: Address64,
    public var addrFrame: Address64,
    public var addrStack: Address64,
    public var addrBStore: Address64,
    funcTableEntryCtorArg: MutPtr<CVoid>,
    public var params: ULongArray,
    public var far: Bool,
    public var virtual: Bool,
    public var reserved: ULongArray,
    public var kdHelp: Kdhelp64,
) {
    public var funcTableEntry: MutPtr<CVoid> = funcTableEntryCtorArg
        internal set

    public constructor() : this(
        addrPC = Address64(),
        addrReturn = Address64(),
        addrFrame = Address64(),
        addrStack = Address64(),
        addrBStore = Address64(),
        funcTableEntryCtorArg = MutPtr(0L),
        params = ULongArray(4),
        far = 0,
        virtual = 0,
        reserved = ULongArray(3),
        kdHelp = Kdhelp64(),
    )

    public operator fun component1(): Address64 = this.addrPC

    public operator fun component2(): Address64 = this.addrReturn

    public operator fun component3(): Address64 = this.addrFrame

    public operator fun component4(): Address64 = this.addrStack

    public operator fun component5(): Address64 = this.addrBStore

    public operator fun component6(): MutPtr<CVoid> = this.funcTableEntry

    public operator fun component7(): ULongArray = this.params

    public operator fun component8(): Bool = this.far

    public operator fun component9(): Bool = this.virtual

    public operator fun component10(): ULongArray = this.reserved

    public operator fun component11(): Kdhelp64 = this.kdHelp

    public fun copy(addrPC: Address64 = this.addrPC, addrReturn: Address64 = this.addrReturn, addrFrame: Address64 = this.addrFrame, addrStack: Address64 = this.addrStack, addrBStore: Address64 = this.addrBStore, funcTableEntry: MutPtr<CVoid> = this.funcTableEntry, params: ULongArray = this.params, far: Bool = this.far, virtual: Bool = this.virtual, reserved: ULongArray = this.reserved, kdHelp: Kdhelp64 = this.kdHelp): Stackframe64 = Stackframe64(addrPC = addrPC, addrReturn = addrReturn, addrFrame = addrFrame, addrStack = addrStack, addrBStore = addrBStore, funcTableEntryCtorArg = funcTableEntry, params = params, far = far, virtual = virtual, reserved = reserved, kdHelp = kdHelp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stackframe64) return false
        if (this.addrPC != other.addrPC) return false
        if (this.addrReturn != other.addrReturn) return false
        if (this.addrFrame != other.addrFrame) return false
        if (this.addrStack != other.addrStack) return false
        if (this.addrBStore != other.addrBStore) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (this.far != other.far) return false
        if (this.virtual != other.virtual) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.kdHelp != other.kdHelp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrPC.hashCode()
        result = 31 * result + this.addrReturn.hashCode()
        result = 31 * result + this.addrFrame.hashCode()
        result = 31 * result + this.addrStack.hashCode()
        result = 31 * result + this.addrBStore.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.far.hashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.kdHelp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stackframe64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stackframe64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): Stackframe64 =
                    Stackframe64(
                        (Address64.typeLayout()).readNative(addr),
                        (Address64.typeLayout()).readNative(addr + 16L),
                        (Address64.typeLayout()).readNative(addr + 32L),
                        (Address64.typeLayout()).readNative(addr + 48L),
                        (Address64.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 88L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                        ).readNative(addr + 128L).toULongArray(),
                        (Kdhelp64.typeLayout()).readNative(addr + 152L),
                    )
                override fun writeNative(addr: Long, value: Stackframe64) {
                    (Address64.typeLayout()).writeNative(addr, value.addrPC)
                    (Address64.typeLayout()).writeNative(addr + 16L, value.addrReturn)
                    (Address64.typeLayout()).writeNative(addr + 32L, value.addrFrame)
                    (Address64.typeLayout()).writeNative(addr + 48L, value.addrStack)
                    (Address64.typeLayout()).writeNative(addr + 64L, value.addrBStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.funcTableEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 88L, value.params.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.far)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.virtual)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                    ).writeNative(addr + 128L, value.reserved.toList())
                    (Kdhelp64.typeLayout()).writeNative(addr + 152L, value.kdHelp)
                }
            }

        public operator fun invoke(
            addrPC: Address64 = Address64(),
            addrReturn: Address64 = Address64(),
            addrFrame: Address64 = Address64(),
            addrStack: Address64 = Address64(),
            addrBStore: Address64 = Address64(),
            funcTableEntry: MutPtr<CVoid> = MutPtr(0L),
            params: ULongArray = ULongArray(4),
            far: Bool = 0,
            virtual: Bool = 0,
            reserved: ULongArray = ULongArray(3),
            kdHelp: Kdhelp64 = Kdhelp64(),
        ): Stackframe64 =
            Stackframe64(
                addrPC = addrPC,
                addrReturn = addrReturn,
                addrFrame = addrFrame,
                addrStack = addrStack,
                addrBStore = addrBStore,
                funcTableEntryCtorArg = funcTableEntry,
                params = params,
                far = far,
                virtual = virtual,
                reserved = reserved,
                kdHelp = kdHelp,
            )
    }
}

public class StackframeEx internal constructor(
    public var addrPC: Address64,
    public var addrReturn: Address64,
    public var addrFrame: Address64,
    public var addrStack: Address64,
    public var addrBStore: Address64,
    funcTableEntryCtorArg: MutPtr<CVoid>,
    public var params: ULongArray,
    public var far: Bool,
    public var virtual: Bool,
    public var reserved: ULongArray,
    public var kdHelp: Kdhelp64,
    public var stackFrameSize: UInt,
    public var inlineFrameContext: UInt,
) {
    public var funcTableEntry: MutPtr<CVoid> = funcTableEntryCtorArg
        internal set

    public constructor() : this(
        addrPC = Address64(),
        addrReturn = Address64(),
        addrFrame = Address64(),
        addrStack = Address64(),
        addrBStore = Address64(),
        funcTableEntryCtorArg = MutPtr(0L),
        params = ULongArray(4),
        far = 0,
        virtual = 0,
        reserved = ULongArray(3),
        kdHelp = Kdhelp64(),
        stackFrameSize = 0u,
        inlineFrameContext = 0u,
    )

    public operator fun component1(): Address64 = this.addrPC

    public operator fun component2(): Address64 = this.addrReturn

    public operator fun component3(): Address64 = this.addrFrame

    public operator fun component4(): Address64 = this.addrStack

    public operator fun component5(): Address64 = this.addrBStore

    public operator fun component6(): MutPtr<CVoid> = this.funcTableEntry

    public operator fun component7(): ULongArray = this.params

    public operator fun component8(): Bool = this.far

    public operator fun component9(): Bool = this.virtual

    public operator fun component10(): ULongArray = this.reserved

    public operator fun component11(): Kdhelp64 = this.kdHelp

    public operator fun component12(): UInt = this.stackFrameSize

    public operator fun component13(): UInt = this.inlineFrameContext

    public fun copy(addrPC: Address64 = this.addrPC, addrReturn: Address64 = this.addrReturn, addrFrame: Address64 = this.addrFrame, addrStack: Address64 = this.addrStack, addrBStore: Address64 = this.addrBStore, funcTableEntry: MutPtr<CVoid> = this.funcTableEntry, params: ULongArray = this.params, far: Bool = this.far, virtual: Bool = this.virtual, reserved: ULongArray = this.reserved, kdHelp: Kdhelp64 = this.kdHelp, stackFrameSize: UInt = this.stackFrameSize, inlineFrameContext: UInt = this.inlineFrameContext): StackframeEx = StackframeEx(addrPC = addrPC, addrReturn = addrReturn, addrFrame = addrFrame, addrStack = addrStack, addrBStore = addrBStore, funcTableEntryCtorArg = funcTableEntry, params = params, far = far, virtual = virtual, reserved = reserved, kdHelp = kdHelp, stackFrameSize = stackFrameSize, inlineFrameContext = inlineFrameContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackframeEx) return false
        if (this.addrPC != other.addrPC) return false
        if (this.addrReturn != other.addrReturn) return false
        if (this.addrFrame != other.addrFrame) return false
        if (this.addrStack != other.addrStack) return false
        if (this.addrBStore != other.addrBStore) return false
        if (this.funcTableEntry != other.funcTableEntry) return false
        if (!this.params.contentEquals(other.params)) return false
        if (this.far != other.far) return false
        if (this.virtual != other.virtual) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.kdHelp != other.kdHelp) return false
        if (this.stackFrameSize != other.stackFrameSize) return false
        if (this.inlineFrameContext != other.inlineFrameContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrPC.hashCode()
        result = 31 * result + this.addrReturn.hashCode()
        result = 31 * result + this.addrFrame.hashCode()
        result = 31 * result + this.addrStack.hashCode()
        result = 31 * result + this.addrBStore.hashCode()
        result = 31 * result + this.funcTableEntry.hashCode()
        result = 31 * result + this.params.contentHashCode()
        result = 31 * result + this.far.hashCode()
        result = 31 * result + this.virtual.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.kdHelp.hashCode()
        result = 31 * result + this.stackFrameSize.hashCode()
        result = 31 * result + this.inlineFrameContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackframeEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackframeEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): StackframeEx =
                    StackframeEx(
                        (Address64.typeLayout()).readNative(addr),
                        (Address64.typeLayout()).readNative(addr + 16L),
                        (Address64.typeLayout()).readNative(addr + 32L),
                        (Address64.typeLayout()).readNative(addr + 48L),
                        (Address64.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 88L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                        ).readNative(addr + 128L).toULongArray(),
                        (Kdhelp64.typeLayout()).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                    )
                override fun writeNative(addr: Long, value: StackframeEx) {
                    (Address64.typeLayout()).writeNative(addr, value.addrPC)
                    (Address64.typeLayout()).writeNative(addr + 16L, value.addrReturn)
                    (Address64.typeLayout()).writeNative(addr + 32L, value.addrFrame)
                    (Address64.typeLayout()).writeNative(addr + 48L, value.addrStack)
                    (Address64.typeLayout()).writeNative(addr + 64L, value.addrBStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.funcTableEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 88L, value.params.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.far)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.virtual)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                    ).writeNative(addr + 128L, value.reserved.toList())
                    (Kdhelp64.typeLayout()).writeNative(addr + 152L, value.kdHelp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.stackFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.inlineFrameContext)
                }
            }

        public operator fun invoke(
            addrPC: Address64 = Address64(),
            addrReturn: Address64 = Address64(),
            addrFrame: Address64 = Address64(),
            addrStack: Address64 = Address64(),
            addrBStore: Address64 = Address64(),
            funcTableEntry: MutPtr<CVoid> = MutPtr(0L),
            params: ULongArray = ULongArray(4),
            far: Bool = 0,
            virtual: Bool = 0,
            reserved: ULongArray = ULongArray(3),
            kdHelp: Kdhelp64 = Kdhelp64(),
            stackFrameSize: UInt = 0u,
            inlineFrameContext: UInt = 0u,
        ): StackframeEx =
            StackframeEx(
                addrPC = addrPC,
                addrReturn = addrReturn,
                addrFrame = addrFrame,
                addrStack = addrStack,
                addrBStore = addrBStore,
                funcTableEntryCtorArg = funcTableEntry,
                params = params,
                far = far,
                virtual = virtual,
                reserved = reserved,
                kdHelp = kdHelp,
                stackFrameSize = stackFrameSize,
                inlineFrameContext = inlineFrameContext,
            )
    }
}

public data class SymbolInfo(
    public var sizeOfStruct: UInt = 0u,
    public var typeIndex: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
    public var index: UInt = 0u,
    public var size: UInt = 0u,
    public var modBase: ULong = 0uL,
    public var flags: SymbolInfoFlags = 0u,
    public var value: ULong = 0uL,
    public var address: ULong = 0uL,
    public var register: UInt = 0u,
    public var scope: UInt = 0u,
    public var tag: UInt = 0u,
    public var nameLen: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var name: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfo) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.typeIndex != other.typeIndex) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.index != other.index) return false
        if (this.size != other.size) return false
        if (this.modBase != other.modBase) return false
        if (this.flags != other.flags) return false
        if (this.value != other.value) return false
        if (this.address != other.address) return false
        if (this.register != other.register) return false
        if (this.scope != other.scope) return false
        if (this.tag != other.tag) return false
        if (this.nameLen != other.nameLen) return false
        if (this.maxNameLen != other.maxNameLen) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.typeIndex.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.nameLen.hashCode()
        result = 31 * result + this.maxNameLen.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): SymbolInfo =
                    SymbolInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 84L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SymbolInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.typeIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.modBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.register)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.nameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.maxNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 84L, value.name.toList())
                }
            }
    }
}

public data class SymbolInfow(
    public var sizeOfStruct: UInt = 0u,
    public var typeIndex: UInt = 0u,
    public var reserved: ULongArray = ULongArray(2),
    public var index: UInt = 0u,
    public var size: UInt = 0u,
    public var modBase: ULong = 0uL,
    public var flags: SymbolInfoFlags = 0u,
    public var value: ULong = 0uL,
    public var address: ULong = 0uL,
    public var register: UInt = 0u,
    public var scope: UInt = 0u,
    public var tag: UInt = 0u,
    public var nameLen: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.typeIndex != other.typeIndex) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.index != other.index) return false
        if (this.size != other.size) return false
        if (this.modBase != other.modBase) return false
        if (this.flags != other.flags) return false
        if (this.value != other.value) return false
        if (this.address != other.address) return false
        if (this.register != other.register) return false
        if (this.scope != other.scope) return false
        if (this.tag != other.tag) return false
        if (this.nameLen != other.nameLen) return false
        if (this.maxNameLen != other.maxNameLen) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.typeIndex.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.modBase.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.register.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.nameLen.hashCode()
        result = 31 * result + this.maxNameLen.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfow> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): SymbolInfow =
                    SymbolInfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 84L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SymbolInfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.typeIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.modBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.register)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.scope)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.nameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.maxNameLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 84L, value.name.toList())
                }
            }
    }
}

public data class SymbolInfoPackage(
    public var si: SymbolInfo = SymbolInfo(),
    public var name: ByteArray = ByteArray(2001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfoPackage) return false
        if (this.si != other.si) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.si.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfoPackage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfoPackage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 2096L
                override fun readNative(addr: Long): SymbolInfoPackage =
                    SymbolInfoPackage(
                        (SymbolInfo.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2001).toInt())
                        ).readNative(addr + 88L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SymbolInfoPackage) {
                    (SymbolInfo.typeLayout()).writeNative(addr, value.si)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2001).toInt())
                    ).writeNative(addr + 88L, value.name.toList())
                }
            }
    }
}

public data class SymbolInfoPackagew(
    public var si: SymbolInfow = SymbolInfow(),
    public var name: UShortArray = UShortArray(2001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolInfoPackagew) return false
        if (this.si != other.si) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.si.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfoPackagew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymbolInfoPackagew> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): SymbolInfoPackagew =
                    SymbolInfoPackagew(
                        (SymbolInfow.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2001).toInt())
                        ).readNative(addr + 88L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SymbolInfoPackagew) {
                    (SymbolInfow.typeLayout()).writeNative(addr, value.si)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2001).toInt())
                    ).writeNative(addr + 88L, value.name.toList())
                }
            }
    }
}

public data class SymsrvExtendedOutputData(
    public var sizeOfStruct: UInt = 0u,
    public var version: UInt = 0u,
    public var filePtrMsg: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymsrvExtendedOutputData) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.version != other.version) return false
        if (!this.filePtrMsg.contentEquals(other.filePtrMsg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.filePtrMsg.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymsrvExtendedOutputData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SymsrvExtendedOutputData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 532L
                override fun readNative(addr: Long): SymsrvExtendedOutputData =
                    SymsrvExtendedOutputData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SymsrvExtendedOutputData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sizeOfStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 8L, value.filePtrMsg.toList())
                }
            }
    }
}

public data class SymsrvIndexInfo(
    public var sizeofstruct: UInt = 0u,
    public var file: ByteArray = ByteArray(261),
    public var stripped: Bool = 0,
    public var timestamp: UInt = 0u,
    public var size: UInt = 0u,
    public var dbgfile: ByteArray = ByteArray(261),
    public var pdbfile: ByteArray = ByteArray(261),
    public var guid: Guid = Guid(),
    public var sig: UInt = 0u,
    public var age: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymsrvIndexInfo) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (!this.file.contentEquals(other.file)) return false
        if (this.stripped != other.stripped) return false
        if (this.timestamp != other.timestamp) return false
        if (this.size != other.size) return false
        if (!this.dbgfile.contentEquals(other.dbgfile)) return false
        if (!this.pdbfile.contentEquals(other.pdbfile)) return false
        if (this.guid != other.guid) return false
        if (this.sig != other.sig) return false
        if (this.age != other.age) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.file.contentHashCode()
        result = 31 * result + this.stripped.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dbgfile.contentHashCode()
        result = 31 * result + this.pdbfile.contentHashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.sig.hashCode()
        result = 31 * result + this.age.hashCode()
        return result
    }
}

public data class SymsrvIndexInfow(
    public var sizeofstruct: UInt = 0u,
    public var file: UShortArray = UShortArray(261),
    public var stripped: Bool = 0,
    public var timestamp: UInt = 0u,
    public var size: UInt = 0u,
    public var dbgfile: UShortArray = UShortArray(261),
    public var pdbfile: UShortArray = UShortArray(261),
    public var guid: Guid = Guid(),
    public var sig: UInt = 0u,
    public var age: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymsrvIndexInfow) return false
        if (this.sizeofstruct != other.sizeofstruct) return false
        if (!this.file.contentEquals(other.file)) return false
        if (this.stripped != other.stripped) return false
        if (this.timestamp != other.timestamp) return false
        if (this.size != other.size) return false
        if (!this.dbgfile.contentEquals(other.dbgfile)) return false
        if (!this.pdbfile.contentEquals(other.pdbfile)) return false
        if (this.guid != other.guid) return false
        if (this.sig != other.sig) return false
        if (this.age != other.age) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeofstruct.hashCode()
        result = 31 * result + this.file.contentHashCode()
        result = 31 * result + this.stripped.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.dbgfile.contentHashCode()
        result = 31 * result + this.pdbfile.contentHashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.sig.hashCode()
        result = 31 * result + this.age.hashCode()
        return result
    }
}

public data class TiFindchildrenParams(
    public var count: UInt = 0u,
    public var start: UInt = 0u,
    public var childId: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TiFindchildrenParams) return false
        if (this.count != other.count) return false
        if (this.start != other.start) return false
        if (!this.childId.contentEquals(other.childId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.start.hashCode()
        result = 31 * result + this.childId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TiFindchildrenParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TiFindchildrenParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TiFindchildrenParams =
                    TiFindchildrenParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: TiFindchildrenParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.start)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.childId.toList())
                }
            }
    }
}

public class UnloadDllDebugInfo internal constructor(
    lpBaseOfDllCtorArg: MutPtr<CVoid>,
) {
    public var lpBaseOfDll: MutPtr<CVoid> = lpBaseOfDllCtorArg
        internal set

    public constructor() : this(
        lpBaseOfDllCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.lpBaseOfDll

    public fun copy(lpBaseOfDll: MutPtr<CVoid> = this.lpBaseOfDll): UnloadDllDebugInfo = UnloadDllDebugInfo(lpBaseOfDllCtorArg = lpBaseOfDll)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnloadDllDebugInfo) return false
        if (this.lpBaseOfDll != other.lpBaseOfDll) return false
        return true
    }

    override fun hashCode(): Int = this.lpBaseOfDll.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnloadDllDebugInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnloadDllDebugInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UnloadDllDebugInfo =
                    UnloadDllDebugInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UnloadDllDebugInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.lpBaseOfDll)
                }
            }

        public operator fun invoke(
            lpBaseOfDll: MutPtr<CVoid> = MutPtr(0L),
        ): UnloadDllDebugInfo =
            UnloadDllDebugInfo(
                lpBaseOfDllCtorArg = lpBaseOfDll,
            )
    }
}

public data class UnwindHistoryTable(
    public var count: UInt = 0u,
    public var localHint: UByte = 0u,
    public var globalHint: UByte = 0u,
    public var search: UByte = 0u,
    public var once: UByte = 0u,
    public var lowAddress: Int = 0,
    public var highAddress: Int = 0,
    public var entry: List<UnwindHistoryTableEntry> = List(12) { UnwindHistoryTableEntry() },
)

public class UnwindHistoryTableEntry internal constructor(
    public var imageBase: Int,
    functionEntryCtorArg: MutPtr<ImageRuntimeFunctionEntry>,
) {
    public var functionEntry: MutPtr<ImageRuntimeFunctionEntry> = functionEntryCtorArg
        internal set

    public constructor() : this(
        imageBase = 0,
        functionEntryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.imageBase

    public operator fun component2(): MutPtr<ImageRuntimeFunctionEntry> = this.functionEntry

    public fun copy(imageBase: Int = this.imageBase, functionEntry: MutPtr<ImageRuntimeFunctionEntry> = this.functionEntry): UnwindHistoryTableEntry = UnwindHistoryTableEntry(imageBase = imageBase, functionEntryCtorArg = functionEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnwindHistoryTableEntry) return false
        if (this.imageBase != other.imageBase) return false
        if (this.functionEntry != other.functionEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.imageBase.hashCode()
        result = 31 * result + this.functionEntry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnwindHistoryTableEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnwindHistoryTableEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UnwindHistoryTableEntry =
                    UnwindHistoryTableEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ImageRuntimeFunctionEntry>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UnwindHistoryTableEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.imageBase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ImageRuntimeFunctionEntry>(64)
                    ).writeNative(addr + 8L, value.functionEntry)
                }
            }

        public operator fun invoke(
            imageBase: Int = 0,
            functionEntry: MutPtr<ImageRuntimeFunctionEntry> = MutPtr(0L),
        ): UnwindHistoryTableEntry =
            UnwindHistoryTableEntry(
                imageBase = imageBase,
                functionEntryCtorArg = functionEntry,
            )
    }
}

public data class WaitchainNodeInfo(
    public var objectType: WctObjectType = 0,
    public var objectStatus: WctObjectStatus = 0,
    public var anonymous: WaitchainNodeInfo0 = WaitchainNodeInfo0(),
)

public data class WaitchainNodeInfo0(
    public var lockObject: WaitchainNodeInfo00 = WaitchainNodeInfo00(),
    public var threadObject: WaitchainNodeInfo01 = WaitchainNodeInfo01(),
)

public data class WaitchainNodeInfo00(
    public var objectName: UShortArray = UShortArray(128),
    public var timeout: Long = 0L,
    public var alertable: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WaitchainNodeInfo00) return false
        if (!this.objectName.contentEquals(other.objectName)) return false
        if (this.timeout != other.timeout) return false
        if (this.alertable != other.alertable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectName.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.alertable.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WaitchainNodeInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WaitchainNodeInfo00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): WaitchainNodeInfo00 =
                    WaitchainNodeInfo00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: WaitchainNodeInfo00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr, value.objectName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 256L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 264L, value.alertable)
                }
            }
    }
}

public data class WaitchainNodeInfo01(
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var waitTime: UInt = 0u,
    public var contextSwitches: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WaitchainNodeInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WaitchainNodeInfo01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WaitchainNodeInfo01 =
                    WaitchainNodeInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WaitchainNodeInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.waitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.contextSwitches)
                }
            }
    }
}

public data class WheaAerBridgeDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var busNumber: UInt = 0u,
    public var slot: WheaPciSlotNumber = WheaPciSlotNumber(),
    public var deviceControl: UShort = 0u,
    public var flags: AerBridgeDescriptorFlags = AerBridgeDescriptorFlags(),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var advancedCapsAndControl: UInt = 0u,
    public var secondaryUncorrectableErrorMask: UInt = 0u,
    public var secondaryUncorrectableErrorSev: UInt = 0u,
    public var secondaryCapsAndControl: UInt = 0u,
)

public data class WheaAerEndpointDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var busNumber: UInt = 0u,
    public var slot: WheaPciSlotNumber = WheaPciSlotNumber(),
    public var deviceControl: UShort = 0u,
    public var flags: AerEndpointDescriptorFlags = AerEndpointDescriptorFlags(),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var advancedCapsAndControl: UInt = 0u,
)

public data class WheaAerRootportDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var reserved: UByte = 0u,
    public var busNumber: UInt = 0u,
    public var slot: WheaPciSlotNumber = WheaPciSlotNumber(),
    public var deviceControl: UShort = 0u,
    public var flags: AerRootportDescriptorFlags = AerRootportDescriptorFlags(),
    public var uncorrectableErrorMask: UInt = 0u,
    public var uncorrectableErrorSeverity: UInt = 0u,
    public var correctableErrorMask: UInt = 0u,
    public var advancedCapsAndControl: UInt = 0u,
    public var rootErrorCommand: UInt = 0u,
)

public class WheaDeviceDriverDescriptor internal constructor(
    public var type: UShort,
    public var enabled: Boolean,
    public var reserved: UByte,
    public var sourceGuid: Guid,
    public var logTag: UShort,
    public var reserved2: UShort,
    public var packetLength: UInt,
    public var packetCount: UInt,
    packetBufferCtorArg: MutPtr<UByte>,
    public var config: WheaErrorSourceConfigurationDd,
    public var creatorId: Guid,
    public var partitionId: Guid,
    public var maxSectionDataLength: UInt,
    public var maxSectionsPerRecord: UInt,
    packetStateBufferCtorArg: MutPtr<UByte>,
    public var openHandles: Int,
) {
    public var packetBuffer: MutPtr<UByte> = packetBufferCtorArg
        internal set

    public var packetStateBuffer: MutPtr<UByte> = packetStateBufferCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        enabled = false,
        reserved = 0u,
        sourceGuid = Guid(),
        logTag = 0u,
        reserved2 = 0u,
        packetLength = 0u,
        packetCount = 0u,
        packetBufferCtorArg = MutPtr(0L),
        config = WheaErrorSourceConfigurationDd(),
        creatorId = Guid(),
        partitionId = Guid(),
        maxSectionDataLength = 0u,
        maxSectionsPerRecord = 0u,
        packetStateBufferCtorArg = MutPtr(0L),
        openHandles = 0,
    )

    public operator fun component1(): UShort = this.type

    public operator fun component2(): Boolean = this.enabled

    public operator fun component3(): UByte = this.reserved

    public operator fun component4(): Guid = this.sourceGuid

    public operator fun component5(): UShort = this.logTag

    public operator fun component6(): UShort = this.reserved2

    public operator fun component7(): UInt = this.packetLength

    public operator fun component8(): UInt = this.packetCount

    public operator fun component9(): MutPtr<UByte> = this.packetBuffer

    public operator fun component10(): WheaErrorSourceConfigurationDd = this.config

    public operator fun component11(): Guid = this.creatorId

    public operator fun component12(): Guid = this.partitionId

    public operator fun component13(): UInt = this.maxSectionDataLength

    public operator fun component14(): UInt = this.maxSectionsPerRecord

    public operator fun component15(): MutPtr<UByte> = this.packetStateBuffer

    public operator fun component16(): Int = this.openHandles

    public fun copy(type: UShort = this.type, enabled: Boolean = this.enabled, reserved: UByte = this.reserved, sourceGuid: Guid = this.sourceGuid, logTag: UShort = this.logTag, reserved2: UShort = this.reserved2, packetLength: UInt = this.packetLength, packetCount: UInt = this.packetCount, packetBuffer: MutPtr<UByte> = this.packetBuffer, config: WheaErrorSourceConfigurationDd = this.config, creatorId: Guid = this.creatorId, partitionId: Guid = this.partitionId, maxSectionDataLength: UInt = this.maxSectionDataLength, maxSectionsPerRecord: UInt = this.maxSectionsPerRecord, packetStateBuffer: MutPtr<UByte> = this.packetStateBuffer, openHandles: Int = this.openHandles): WheaDeviceDriverDescriptor = WheaDeviceDriverDescriptor(type = type, enabled = enabled, reserved = reserved, sourceGuid = sourceGuid, logTag = logTag, reserved2 = reserved2, packetLength = packetLength, packetCount = packetCount, packetBufferCtorArg = packetBuffer, config = config, creatorId = creatorId, partitionId = partitionId, maxSectionDataLength = maxSectionDataLength, maxSectionsPerRecord = maxSectionsPerRecord, packetStateBufferCtorArg = packetStateBuffer, openHandles = openHandles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaDeviceDriverDescriptor) return false
        if (this.type != other.type) return false
        if (this.enabled != other.enabled) return false
        if (this.reserved != other.reserved) return false
        if (this.sourceGuid != other.sourceGuid) return false
        if (this.logTag != other.logTag) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.packetLength != other.packetLength) return false
        if (this.packetCount != other.packetCount) return false
        if (this.packetBuffer != other.packetBuffer) return false
        if (this.config != other.config) return false
        if (this.creatorId != other.creatorId) return false
        if (this.partitionId != other.partitionId) return false
        if (this.maxSectionDataLength != other.maxSectionDataLength) return false
        if (this.maxSectionsPerRecord != other.maxSectionsPerRecord) return false
        if (this.packetStateBuffer != other.packetStateBuffer) return false
        if (this.openHandles != other.openHandles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.enabled.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.sourceGuid.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.packetLength.hashCode()
        result = 31 * result + this.packetCount.hashCode()
        result = 31 * result + this.packetBuffer.hashCode()
        result = 31 * result + this.config.hashCode()
        result = 31 * result + this.creatorId.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        result = 31 * result + this.maxSectionDataLength.hashCode()
        result = 31 * result + this.maxSectionsPerRecord.hashCode()
        result = 31 * result + this.packetStateBuffer.hashCode()
        result = 31 * result + this.openHandles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: UShort = 0u,
            enabled: Boolean = false,
            reserved: UByte = 0u,
            sourceGuid: Guid = Guid(),
            logTag: UShort = 0u,
            reserved2: UShort = 0u,
            packetLength: UInt = 0u,
            packetCount: UInt = 0u,
            packetBuffer: MutPtr<UByte> = MutPtr(0L),
            config: WheaErrorSourceConfigurationDd = WheaErrorSourceConfigurationDd(),
            creatorId: Guid = Guid(),
            partitionId: Guid = Guid(),
            maxSectionDataLength: UInt = 0u,
            maxSectionsPerRecord: UInt = 0u,
            packetStateBuffer: MutPtr<UByte> = MutPtr(0L),
            openHandles: Int = 0,
        ): WheaDeviceDriverDescriptor =
            WheaDeviceDriverDescriptor(
                type = type,
                enabled = enabled,
                reserved = reserved,
                sourceGuid = sourceGuid,
                logTag = logTag,
                reserved2 = reserved2,
                packetLength = packetLength,
                packetCount = packetCount,
                packetBufferCtorArg = packetBuffer,
                config = config,
                creatorId = creatorId,
                partitionId = partitionId,
                maxSectionDataLength = maxSectionDataLength,
                maxSectionsPerRecord = maxSectionsPerRecord,
                packetStateBufferCtorArg = packetStateBuffer,
                openHandles = openHandles,
            )
    }
}

public class WheaDriverBufferSet internal constructor(
    public var version: UInt,
    dataCtorArg: MutPtr<UByte>,
    public var dataSize: UInt,
    sectionTypeGuidCtorArg: MutPtr<Guid>,
    sectionFriendlyNameCtorArg: MutPtr<UByte>,
    flagsCtorArg: MutPtr<UByte>,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public var sectionTypeGuid: MutPtr<Guid> = sectionTypeGuidCtorArg
        internal set

    public var sectionFriendlyName: MutPtr<UByte> = sectionFriendlyNameCtorArg
        internal set

    public var flags: MutPtr<UByte> = flagsCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        dataCtorArg = MutPtr(0L),
        dataSize = 0u,
        sectionTypeGuidCtorArg = MutPtr(0L),
        sectionFriendlyNameCtorArg = MutPtr(0L),
        flagsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<UByte> = this.data

    public operator fun component3(): UInt = this.dataSize

    public operator fun component4(): MutPtr<Guid> = this.sectionTypeGuid

    public operator fun component5(): MutPtr<UByte> = this.sectionFriendlyName

    public operator fun component6(): MutPtr<UByte> = this.flags

    public fun copy(version: UInt = this.version, data: MutPtr<UByte> = this.data, dataSize: UInt = this.dataSize, sectionTypeGuid: MutPtr<Guid> = this.sectionTypeGuid, sectionFriendlyName: MutPtr<UByte> = this.sectionFriendlyName, flags: MutPtr<UByte> = this.flags): WheaDriverBufferSet = WheaDriverBufferSet(version = version, dataCtorArg = data, dataSize = dataSize, sectionTypeGuidCtorArg = sectionTypeGuid, sectionFriendlyNameCtorArg = sectionFriendlyName, flagsCtorArg = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaDriverBufferSet) return false
        if (this.version != other.version) return false
        if (this.data != other.data) return false
        if (this.dataSize != other.dataSize) return false
        if (this.sectionTypeGuid != other.sectionTypeGuid) return false
        if (this.sectionFriendlyName != other.sectionFriendlyName) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.sectionTypeGuid.hashCode()
        result = 31 * result + this.sectionFriendlyName.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaDriverBufferSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaDriverBufferSet> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): WheaDriverBufferSet =
                    WheaDriverBufferSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WheaDriverBufferSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 4L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 16L, value.sectionTypeGuid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.sectionFriendlyName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.flags)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
            dataSize: UInt = 0u,
            sectionTypeGuid: MutPtr<Guid> = MutPtr(0L),
            sectionFriendlyName: MutPtr<UByte> = MutPtr(0L),
            flags: MutPtr<UByte> = MutPtr(0L),
        ): WheaDriverBufferSet =
            WheaDriverBufferSet(
                version = version,
                dataCtorArg = data,
                dataSize = dataSize,
                sectionTypeGuidCtorArg = sectionTypeGuid,
                sectionFriendlyNameCtorArg = sectionFriendlyName,
                flagsCtorArg = flags,
            )
    }
}

public data class WheaErrorSourceConfigurationDd(
    public var initialize: WheaErrorSourceInitializeDeviceDriver = null,
    public var uninitialize: WheaErrorSourceUninitializeDeviceDriver = null,
    public var correct: WheaErrorSourceCorrectDeviceDriver = null,
)

public data class WheaErrorSourceConfigurationDeviceDriver(
    public var version: UInt = 0u,
    public var sourceGuid: Guid = Guid(),
    public var logTag: UShort = 0u,
    public var reserved: UByteArray = UByteArray(6),
    public var initialize: WheaErrorSourceInitializeDeviceDriver = null,
    public var uninitialize: WheaErrorSourceUninitializeDeviceDriver = null,
    public var maxSectionDataLength: UInt = 0u,
    public var maxSectionsPerReport: UInt = 0u,
    public var creatorId: Guid = Guid(),
    public var partitionId: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorSourceConfigurationDeviceDriver) return false
        if (this.version != other.version) return false
        if (this.sourceGuid != other.sourceGuid) return false
        if (this.logTag != other.logTag) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.initialize != other.initialize) return false
        if (this.uninitialize != other.uninitialize) return false
        if (this.maxSectionDataLength != other.maxSectionDataLength) return false
        if (this.maxSectionsPerReport != other.maxSectionsPerReport) return false
        if (this.creatorId != other.creatorId) return false
        if (this.partitionId != other.partitionId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.sourceGuid.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.initialize.hashCode()
        result = 31 * result + this.uninitialize.hashCode()
        result = 31 * result + this.maxSectionDataLength.hashCode()
        result = 31 * result + this.maxSectionsPerReport.hashCode()
        result = 31 * result + this.creatorId.hashCode()
        result = 31 * result + this.partitionId.hashCode()
        return result
    }
}

public data class WheaErrorSourceConfigurationDeviceDriverV1(
    public var version: UInt = 0u,
    public var sourceGuid: Guid = Guid(),
    public var logTag: UShort = 0u,
    public var reserved: UByteArray = UByteArray(6),
    public var initialize: WheaErrorSourceInitializeDeviceDriver = null,
    public var uninitialize: WheaErrorSourceUninitializeDeviceDriver = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WheaErrorSourceConfigurationDeviceDriverV1) return false
        if (this.version != other.version) return false
        if (this.sourceGuid != other.sourceGuid) return false
        if (this.logTag != other.logTag) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.initialize != other.initialize) return false
        if (this.uninitialize != other.uninitialize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.sourceGuid.hashCode()
        result = 31 * result + this.logTag.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.initialize.hashCode()
        result = 31 * result + this.uninitialize.hashCode()
        return result
    }
}

public data class WheaErrorSourceDescriptor(
    public var length: UInt = 0u,
    public var version: UInt = 0u,
    public var type: WheaErrorSourceType = 0,
    public var state: WheaErrorSourceState = 0,
    public var maxRawDataLength: UInt = 0u,
    public var numRecordsToPreallocate: UInt = 0u,
    public var maxSectionsPerRecord: UInt = 0u,
    public var errorSourceId: UInt = 0u,
    public var platformErrorSourceId: UInt = 0u,
    public var flags: UInt = 0u,
    public var info: WheaErrorSourceDescriptor0 = WheaErrorSourceDescriptor0(),
)

public data class WheaErrorSourceDescriptor0(
    public var xpfMceDescriptor: WheaXpfMceDescriptor = WheaXpfMceDescriptor(),
    public var xpfCmcDescriptor: WheaXpfCmcDescriptor = WheaXpfCmcDescriptor(),
    public var xpfNmiDescriptor: WheaXpfNmiDescriptor = WheaXpfNmiDescriptor(),
    public var ipfMcaDescriptor: WheaIpfMcaDescriptor = WheaIpfMcaDescriptor(),
    public var ipfCmcDescriptor: WheaIpfCmcDescriptor = WheaIpfCmcDescriptor(),
    public var ipfCpeDescriptor: WheaIpfCpeDescriptor = WheaIpfCpeDescriptor(),
    public var aerRootportDescriptor: WheaAerRootportDescriptor = WheaAerRootportDescriptor(),
    public var aerEndpointDescriptor: WheaAerEndpointDescriptor = WheaAerEndpointDescriptor(),
    public var aerBridgeDescriptor: WheaAerBridgeDescriptor = WheaAerBridgeDescriptor(),
    public var genErrDescriptor: WheaGenericErrorDescriptor = WheaGenericErrorDescriptor(),
    public var genErrDescriptorV2: WheaGenericErrorDescriptorV2 = WheaGenericErrorDescriptorV2(),
    public var deviceDriverDescriptor: WheaDeviceDriverDescriptor = WheaDeviceDriverDescriptor(),
)

public data class WheaGenericErrorDescriptor(
    public var type: UShort = 0u,
    public var reserved: UByte = 0u,
    public var enabled: UByte = 0u,
    public var errStatusBlockLength: UInt = 0u,
    public var relatedErrorSourceId: UInt = 0u,
    public var errStatusAddressSpaceID: UByte = 0u,
    public var errStatusAddressBitWidth: UByte = 0u,
    public var errStatusAddressBitOffset: UByte = 0u,
    public var errStatusAddressAccessSize: UByte = 0u,
    public var errStatusAddress: Long = 0L,
    public var notify: WheaNotificationDescriptor = WheaNotificationDescriptor(),
)

public class WheaGenericErrorDescriptorV2(
    public var type: UShort = 0u,
    public var reserved: UByte = 0u,
    public var enabled: UByte = 0u,
    public var errStatusBlockLength: UInt = 0u,
    public var relatedErrorSourceId: UInt = 0u,
    public var errStatusAddressSpaceID: UByte = 0u,
    public var errStatusAddressBitWidth: UByte = 0u,
    public var errStatusAddressBitOffset: UByte = 0u,
    public var errStatusAddressAccessSize: UByte = 0u,
    public var errStatusAddress: Long = 0L,
    public var notify: WheaNotificationDescriptor = WheaNotificationDescriptor(),
    public var readAckAddressSpaceID: UByte = 0u,
    public var readAckAddressBitWidth: UByte = 0u,
    public var readAckAddressBitOffset: UByte = 0u,
    public var readAckAddressAccessSize: UByte = 0u,
    public var readAckAddress: Long = 0L,
    public var readAckPreserveMask: ULong = 0uL,
    public var readAckWriteMask: ULong = 0uL,
)

public data class WheaIpfCmcDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaIpfCmcDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaIpfCmcDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaIpfCmcDescriptor =
                    WheaIpfCmcDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: WheaIpfCmcDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                }
            }
    }
}

public data class WheaIpfCpeDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaIpfCpeDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaIpfCpeDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaIpfCpeDescriptor =
                    WheaIpfCpeDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: WheaIpfCpeDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                }
            }
    }
}

public data class WheaIpfMcaDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaIpfMcaDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaIpfMcaDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaIpfMcaDescriptor =
                    WheaIpfMcaDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: WheaIpfMcaDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                }
            }
    }
}

public data class WheaNotificationDescriptor(
    public var type: UByte = 0u,
    public var length: UByte = 0u,
    public var flags: WheaNotificationFlags = WheaNotificationFlags(),
    public var u: WheaNotificationDescriptor0 = WheaNotificationDescriptor0(),
)

public data class WheaNotificationDescriptor0(
    public var polled: WheaNotificationDescriptor00 = WheaNotificationDescriptor00(),
    public var interrupt: WheaNotificationDescriptor01 = WheaNotificationDescriptor01(),
    public var localInterrupt: WheaNotificationDescriptor02 = WheaNotificationDescriptor02(),
    public var sci: WheaNotificationDescriptor03 = WheaNotificationDescriptor03(),
    public var nmi: WheaNotificationDescriptor04 = WheaNotificationDescriptor04(),
    public var sea: WheaNotificationDescriptor05 = WheaNotificationDescriptor05(),
    public var sei: WheaNotificationDescriptor06 = WheaNotificationDescriptor06(),
    public var gsiv: WheaNotificationDescriptor07 = WheaNotificationDescriptor07(),
)

public data class WheaNotificationDescriptor07(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor07> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor07 =
                    WheaNotificationDescriptor07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationDescriptor01(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor01 =
                    WheaNotificationDescriptor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationDescriptor02(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor02> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor02 =
                    WheaNotificationDescriptor02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationDescriptor04(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor04> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor04 =
                    WheaNotificationDescriptor04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationDescriptor00(
    public var pollInterval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaNotificationDescriptor00 =
                    WheaNotificationDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                }
            }
    }
}

public data class WheaNotificationDescriptor03(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor03> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor03 =
                    WheaNotificationDescriptor03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationDescriptor05(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor05> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor05 =
                    WheaNotificationDescriptor05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationDescriptor06(
    public var pollInterval: UInt = 0u,
    public var vector: UInt = 0u,
    public var switchToPollingThreshold: UInt = 0u,
    public var switchToPollingWindow: UInt = 0u,
    public var errorThreshold: UInt = 0u,
    public var errorThresholdWindow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationDescriptor06> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WheaNotificationDescriptor06 =
                    WheaNotificationDescriptor06(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationDescriptor06) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pollInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.switchToPollingThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.switchToPollingWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.errorThresholdWindow)
                }
            }
    }
}

public data class WheaNotificationFlags(
    public var anonymous: WheaNotificationFlags0 = WheaNotificationFlags0(),
    public var asUSHORT: UShort = 0u,
)

public data class WheaNotificationFlags0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaNotificationFlags0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): WheaNotificationFlags0 =
                    WheaNotificationFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaNotificationFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaPciSlotNumber(
    public var u: WheaPciSlotNumber0 = WheaPciSlotNumber0(),
)

public data class WheaPciSlotNumber0(
    public var bits: WheaPciSlotNumber00 = WheaPciSlotNumber00(),
    public var asULONG: UInt = 0u,
)

public data class WheaPciSlotNumber00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciSlotNumber00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WheaPciSlotNumber00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WheaPciSlotNumber00 =
                    WheaPciSlotNumber00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WheaPciSlotNumber00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class WheaXpfCmcDescriptor(
    public var type: UShort = 0u,
    public var enabled: Boolean = false,
    public var numberOfBanks: UByte = 0u,
    public var reserved: UInt = 0u,
    public var notify: WheaNotificationDescriptor = WheaNotificationDescriptor(),
    public var banks: List<WheaXpfMcBankDescriptor> = List(32) { WheaXpfMcBankDescriptor() },
)

public data class WheaXpfMceDescriptor(
    public var type: UShort = 0u,
    public var enabled: UByte = 0u,
    public var numberOfBanks: UByte = 0u,
    public var flags: XpfMceFlags = XpfMceFlags(),
    public var mcgCapability: ULong = 0uL,
    public var mcgGlobalControl: ULong = 0uL,
    public var banks: List<WheaXpfMcBankDescriptor> = List(32) { WheaXpfMcBankDescriptor() },
)
