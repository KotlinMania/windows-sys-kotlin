@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class AlternateInterface(
    public var interfaceNumber: UShort = 0u,
    public var alternateInterfaceNumber: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlternateInterface> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlternateInterface> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AlternateInterface =
                    AlternateInterface(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: AlternateInterface) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.interfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.alternateInterfaceNumber)
                }
            }
    }
}

public data class BmRequestType(
    public var s: BmRequestType0 = BmRequestType0(),
    public var b: UByte = 0u,
)

public data class BmRequestType0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BmRequestType0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BmRequestType0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): BmRequestType0 =
                    BmRequestType0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BmRequestType0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ChannelInfo(
    public var eventChannelSize: UInt = 0u,
    public var uReadDataAlignment: UInt = 0u,
    public var uWriteDataAlignment: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChannelInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ChannelInfo =
                    ChannelInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ChannelInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventChannelSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uReadDataAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uWriteDataAlignment)
                }
            }
    }
}

public data class DeviceDescriptor(
    public var usVendorId: UShort = 0u,
    public var usProductId: UShort = 0u,
    public var usBcdDevice: UShort = 0u,
    public var usLanguageId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceDescriptor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DeviceDescriptor =
                    DeviceDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: DeviceDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usVendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usProductId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usBcdDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usLanguageId)
                }
            }
    }
}

public data class DrvVersion(
    public var major: UInt = 0u,
    public var minor: UInt = 0u,
    public var internal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrvVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrvVersion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DrvVersion =
                    DrvVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrvVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.major)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.internal)
                }
            }
    }
}

public class HcdIsoStatCounters(
    public var lateUrbs: UShort = 0u,
    public var doubleBufferedPackets: UShort = 0u,
    public var transfersCf5ms: UShort = 0u,
    public var transfersCf2ms: UShort = 0u,
    public var transfersCf1ms: UShort = 0u,
    public var maxInterruptLatency: UShort = 0u,
    public var badStartFrame: UShort = 0u,
    public var staleUrbs: UShort = 0u,
    public var isoPacketNotAccesed: UShort = 0u,
    public var isoPacketHWError: UShort = 0u,
    public var smallestUrbPacketCount: UShort = 0u,
    public var largestUrbPacketCount: UShort = 0u,
    public var isoCrcError: UShort = 0u,
    public var isoOverrunError: UShort = 0u,
    public var isoInternalError: UShort = 0u,
    public var isoUnknownError: UShort = 0u,
    public var isoBytesTransferred: UInt = 0u,
    public var lateMissedCount: UShort = 0u,
    public var hWIsoMissedCount: UShort = 0u,
    public var reserved7: UIntArray = UIntArray(8),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdIsoStatCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdIsoStatCounters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): HcdIsoStatCounters =
                    HcdIsoStatCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr + 40L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: HcdIsoStatCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.lateUrbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.doubleBufferedPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.transfersCf5ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.transfersCf2ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.transfersCf1ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.maxInterruptLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.badStartFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.staleUrbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.isoPacketNotAccesed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.isoPacketHWError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.smallestUrbPacketCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.largestUrbPacketCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.isoCrcError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.isoOverrunError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.isoInternalError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.isoUnknownError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.isoBytesTransferred)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.lateMissedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.hWIsoMissedCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr + 40L, value.reserved7.toList())
                }
            }
    }
}

public data class HcdStatCounters(
    public var bytesTransferred: UInt = 0u,
    public var isoMissedCount: UShort = 0u,
    public var dataOverrunErrorCount: UShort = 0u,
    public var crcErrorCount: UShort = 0u,
    public var scheduleOverrunCount: UShort = 0u,
    public var timeoutErrorCount: UShort = 0u,
    public var internalHcErrorCount: UShort = 0u,
    public var bufferOverrunErrorCount: UShort = 0u,
    public var sWErrorCount: UShort = 0u,
    public var stallPidCount: UShort = 0u,
    public var portDisableCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdStatCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdStatCounters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HcdStatCounters =
                    HcdStatCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: HcdStatCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bytesTransferred)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.isoMissedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.dataOverrunErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.crcErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.scheduleOverrunCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.timeoutErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.internalHcErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.bufferOverrunErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.sWErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.stallPidCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.portDisableCount)
                }
            }
    }
}

public data class HcdStatInformation1(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var resetCounters: UInt = 0u,
    public var timeRead: Long = 0L,
    public var counters: HcdStatCounters = HcdStatCounters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdStatInformation1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdStatInformation1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): HcdStatInformation1 =
                    HcdStatInformation1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 12L),
                        (HcdStatCounters.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: HcdStatInformation1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.resetCounters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 12L, value.timeRead)
                    (HcdStatCounters.typeLayout()).writeNative(addr + 20L, value.counters)
                }
            }
    }
}

public data class HcdStatInformation2(
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var resetCounters: UInt = 0u,
    public var timeRead: Long = 0L,
    public var lockedMemoryUsed: Int = 0,
    public var counters: HcdStatCounters = HcdStatCounters(),
    public var isoCounters: HcdIsoStatCounters = HcdIsoStatCounters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdStatInformation2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HcdStatInformation2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): HcdStatInformation2 =
                    HcdStatInformation2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (HcdStatCounters.typeLayout()).readNative(addr + 24L),
                        (HcdIsoStatCounters.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: HcdStatInformation2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.resetCounters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 12L, value.timeRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.lockedMemoryUsed)
                    (HcdStatCounters.typeLayout()).writeNative(addr + 24L, value.counters)
                    (HcdIsoStatCounters.typeLayout()).writeNative(addr + 48L, value.isoCounters)
                }
            }
    }
}

public data class HubDeviceConfigInfo(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var hubFlags: UsbHubCapFlags = UsbHubCapFlags(),
    public var hardwareIds: UsbIdString = UsbIdString(),
    public var compatibleIds: UsbIdString = UsbIdString(),
    public var deviceDescription: UsbIdString = UsbIdString(),
    public var reserved: UIntArray = UIntArray(19),
    public var uxdSettings: UsbHubDeviceUxdSettings = UsbHubDeviceUxdSettings(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HubDeviceConfigInfo) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.hubFlags != other.hubFlags) return false
        if (this.hardwareIds != other.hardwareIds) return false
        if (this.compatibleIds != other.compatibleIds) return false
        if (this.deviceDescription != other.deviceDescription) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.uxdSettings != other.uxdSettings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.hubFlags.hashCode()
        result = 31 * result + this.hardwareIds.hashCode()
        result = 31 * result + this.compatibleIds.hashCode()
        result = 31 * result + this.deviceDescription.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.uxdSettings.hashCode()
        return result
    }
}

public class IoBlock internal constructor(
    public var uOffset: UInt,
    public var uLength: UInt,
    pbyDataCtorArg: MutPtr<UByte>,
    public var uIndex: UInt,
) {
    public var pbyData: MutPtr<UByte> = pbyDataCtorArg
        internal set

    public constructor() : this(
        uOffset = 0u,
        uLength = 0u,
        pbyDataCtorArg = MutPtr(0L),
        uIndex = 0u,
    )

    public operator fun component1(): UInt = this.uOffset

    public operator fun component2(): UInt = this.uLength

    public operator fun component3(): MutPtr<UByte> = this.pbyData

    public operator fun component4(): UInt = this.uIndex

    public fun copy(uOffset: UInt = this.uOffset, uLength: UInt = this.uLength, pbyData: MutPtr<UByte> = this.pbyData, uIndex: UInt = this.uIndex): IoBlock = IoBlock(uOffset = uOffset, uLength = uLength, pbyDataCtorArg = pbyData, uIndex = uIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoBlock) return false
        if (this.uOffset != other.uOffset) return false
        if (this.uLength != other.uLength) return false
        if (this.pbyData != other.pbyData) return false
        if (this.uIndex != other.uIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uOffset.hashCode()
        result = 31 * result + this.uLength.hashCode()
        result = 31 * result + this.pbyData.hashCode()
        result = 31 * result + this.uIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoBlock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoBlock =
                    IoBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbyData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uIndex)
                }
            }

        public operator fun invoke(
            uOffset: UInt = 0u,
            uLength: UInt = 0u,
            pbyData: MutPtr<UByte> = MutPtr(0L),
            uIndex: UInt = 0u,
        ): IoBlock =
            IoBlock(
                uOffset = uOffset,
                uLength = uLength,
                pbyDataCtorArg = pbyData,
                uIndex = uIndex,
            )
    }
}

public class IoBlockEx internal constructor(
    public var uOffset: UInt,
    public var uLength: UInt,
    pbyDataCtorArg: MutPtr<UByte>,
    public var uIndex: UInt,
    public var bRequest: UByte,
    public var bmRequestType: UByte,
    public var fTransferDirectionIn: UByte,
) {
    public var pbyData: MutPtr<UByte> = pbyDataCtorArg
        internal set

    public constructor() : this(
        uOffset = 0u,
        uLength = 0u,
        pbyDataCtorArg = MutPtr(0L),
        uIndex = 0u,
        bRequest = 0u,
        bmRequestType = 0u,
        fTransferDirectionIn = 0u,
    )

    public operator fun component1(): UInt = this.uOffset

    public operator fun component2(): UInt = this.uLength

    public operator fun component3(): MutPtr<UByte> = this.pbyData

    public operator fun component4(): UInt = this.uIndex

    public operator fun component5(): UByte = this.bRequest

    public operator fun component6(): UByte = this.bmRequestType

    public operator fun component7(): UByte = this.fTransferDirectionIn

    public fun copy(uOffset: UInt = this.uOffset, uLength: UInt = this.uLength, pbyData: MutPtr<UByte> = this.pbyData, uIndex: UInt = this.uIndex, bRequest: UByte = this.bRequest, bmRequestType: UByte = this.bmRequestType, fTransferDirectionIn: UByte = this.fTransferDirectionIn): IoBlockEx = IoBlockEx(uOffset = uOffset, uLength = uLength, pbyDataCtorArg = pbyData, uIndex = uIndex, bRequest = bRequest, bmRequestType = bmRequestType, fTransferDirectionIn = fTransferDirectionIn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoBlockEx) return false
        if (this.uOffset != other.uOffset) return false
        if (this.uLength != other.uLength) return false
        if (this.pbyData != other.pbyData) return false
        if (this.uIndex != other.uIndex) return false
        if (this.bRequest != other.bRequest) return false
        if (this.bmRequestType != other.bmRequestType) return false
        if (this.fTransferDirectionIn != other.fTransferDirectionIn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uOffset.hashCode()
        result = 31 * result + this.uLength.hashCode()
        result = 31 * result + this.pbyData.hashCode()
        result = 31 * result + this.uIndex.hashCode()
        result = 31 * result + this.bRequest.hashCode()
        result = 31 * result + this.bmRequestType.hashCode()
        result = 31 * result + this.fTransferDirectionIn.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoBlockEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoBlockEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoBlockEx =
                    IoBlockEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: IoBlockEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbyData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.bRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.bmRequestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.fTransferDirectionIn)
                }
            }

        public operator fun invoke(
            uOffset: UInt = 0u,
            uLength: UInt = 0u,
            pbyData: MutPtr<UByte> = MutPtr(0L),
            uIndex: UInt = 0u,
            bRequest: UByte = 0u,
            bmRequestType: UByte = 0u,
            fTransferDirectionIn: UByte = 0u,
        ): IoBlockEx =
            IoBlockEx(
                uOffset = uOffset,
                uLength = uLength,
                pbyDataCtorArg = pbyData,
                uIndex = uIndex,
                bRequest = bRequest,
                bmRequestType = bmRequestType,
                fTransferDirectionIn = fTransferDirectionIn,
            )
    }
}

public data class OsString(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var microsoftString: UShortArray = UShortArray(7),
    public var bVendorCode: UByte = 0u,
    public var anonymous: OsString0 = OsString0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OsString) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.microsoftString.contentEquals(other.microsoftString)) return false
        if (this.bVendorCode != other.bVendorCode) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.microsoftString.contentHashCode()
        result = 31 * result + this.bVendorCode.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class OsString0(
    public var bPad: UByte = 0u,
    public var bFlags: UByte = 0u,
)

public data class PacketParameters(
    public var deviceAddress: UByte = 0u,
    public var endpointAddress: UByte = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var timeout: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var hubDeviceAddress: UShort = 0u,
    public var portTTNumber: UShort = 0u,
    public var errorCount: UByte = 0u,
    public var pad: UByteArray = UByteArray(3),
    public var usbdStatusCode: Int = 0,
    public var data: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PacketParameters) return false
        if (this.deviceAddress != other.deviceAddress) return false
        if (this.endpointAddress != other.endpointAddress) return false
        if (this.maximumPacketSize != other.maximumPacketSize) return false
        if (this.timeout != other.timeout) return false
        if (this.flags != other.flags) return false
        if (this.dataLength != other.dataLength) return false
        if (this.hubDeviceAddress != other.hubDeviceAddress) return false
        if (this.portTTNumber != other.portTTNumber) return false
        if (this.errorCount != other.errorCount) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.usbdStatusCode != other.usbdStatusCode) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceAddress.hashCode()
        result = 31 * result + this.endpointAddress.hashCode()
        result = 31 * result + this.maximumPacketSize.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.hubDeviceAddress.hashCode()
        result = 31 * result + this.portTTNumber.hashCode()
        result = 31 * result + this.errorCount.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.usbdStatusCode.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PacketParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PacketParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PacketParameters =
                    PacketParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 21L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PacketParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.endpointAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.hubDeviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.portTTNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.errorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 21L, value.pad.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.usbdStatusCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 28L, value.data.toList())
                }
            }
    }
}

public data class RawResetPortParameters(
    public var portNumber: UShort = 0u,
    public var portStatus: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawResetPortParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawResetPortParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RawResetPortParameters =
                    RawResetPortParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: RawResetPortParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.portStatus)
                }
            }
    }
}

public data class RawRootportFeature(
    public var portNumber: UShort = 0u,
    public var portFeature: UShort = 0u,
    public var portStatus: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawRootportFeature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawRootportFeature> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): RawRootportFeature =
                    RawRootportFeature(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RawRootportFeature) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.portFeature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.portStatus)
                }
            }
    }
}

public data class RawRootportParameters(
    public var portNumber: UShort = 0u,
    public var portStatus: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawRootportParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawRootportParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): RawRootportParameters =
                    RawRootportParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: RawRootportParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.portStatus)
                }
            }
    }
}

public data class Urb(
    public var anonymous: Urb0 = Urb0(),
)

public class Urb0(
    public var urbHeader: UrbHeader = UrbHeader(),
    public var urbSelectInterface: UrbSelectInterface = UrbSelectInterface(),
    public var urbSelectConfiguration: UrbSelectConfiguration = UrbSelectConfiguration(),
    public var urbPipeRequest: UrbPipeRequest = UrbPipeRequest(),
    public var urbFrameLengthControl: UrbFrameLengthControl = UrbFrameLengthControl(),
    public var urbGetFrameLength: UrbGetFrameLength = UrbGetFrameLength(),
    public var urbSetFrameLength: UrbSetFrameLength = UrbSetFrameLength(),
    public var urbGetCurrentFrameNumber: UrbGetCurrentFrameNumber = UrbGetCurrentFrameNumber(),
    public var urbControlTransfer: UrbControlTransfer = UrbControlTransfer(),
    public var urbControlTransferEx: UrbControlTransferEx = UrbControlTransferEx(),
    public var urbBulkOrInterruptTransfer: UrbBulkOrInterruptTransfer = UrbBulkOrInterruptTransfer(),
    public var urbIsochronousTransfer: UrbIsochTransfer = UrbIsochTransfer(),
    public var urbControlDescriptorRequest: UrbControlDescriptorRequest = UrbControlDescriptorRequest(),
    public var urbControlGetStatusRequest: UrbControlGetStatusRequest = UrbControlGetStatusRequest(),
    public var urbControlFeatureRequest: UrbControlFeatureRequest = UrbControlFeatureRequest(),
    public var urbControlVendorClassRequest: UrbControlVendorOrClassRequest = UrbControlVendorOrClassRequest(),
    public var urbControlGetInterfaceRequest: UrbControlGetInterfaceRequest = UrbControlGetInterfaceRequest(),
    public var urbControlGetConfigurationRequest: UrbControlGetConfigurationRequest = UrbControlGetConfigurationRequest(),
    public var urbOSFeatureDescriptorRequest: UrbOsFeatureDescriptorRequest = UrbOsFeatureDescriptorRequest(),
    public var urbOpenStaticStreams: UrbOpenStaticStreams = UrbOpenStaticStreams(),
    public var urbGetIsochPipeTransferPathDelays: UrbGetIsochPipeTransferPathDelays = UrbGetIsochPipeTransferPathDelays(),
)

public class UsbdDeviceInformation internal constructor(
    public var offsetNext: UInt,
    usbdDeviceHandleCtorArg: MutPtr<CVoid>,
    public var deviceDescriptor: UsbDeviceDescriptor,
) {
    public var usbdDeviceHandle: MutPtr<CVoid> = usbdDeviceHandleCtorArg
        internal set

    public constructor() : this(
        offsetNext = 0u,
        usbdDeviceHandleCtorArg = MutPtr(0L),
        deviceDescriptor = UsbDeviceDescriptor(),
    )

    public operator fun component1(): UInt = this.offsetNext

    public operator fun component2(): MutPtr<CVoid> = this.usbdDeviceHandle

    public operator fun component3(): UsbDeviceDescriptor = this.deviceDescriptor

    public fun copy(offsetNext: UInt = this.offsetNext, usbdDeviceHandle: MutPtr<CVoid> = this.usbdDeviceHandle, deviceDescriptor: UsbDeviceDescriptor = this.deviceDescriptor): UsbdDeviceInformation = UsbdDeviceInformation(offsetNext = offsetNext, usbdDeviceHandleCtorArg = usbdDeviceHandle, deviceDescriptor = deviceDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbdDeviceInformation) return false
        if (this.offsetNext != other.offsetNext) return false
        if (this.usbdDeviceHandle != other.usbdDeviceHandle) return false
        if (this.deviceDescriptor != other.deviceDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offsetNext.hashCode()
        result = 31 * result + this.usbdDeviceHandle.hashCode()
        result = 31 * result + this.deviceDescriptor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdDeviceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdDeviceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): UsbdDeviceInformation =
                    UsbdDeviceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (UsbDeviceDescriptor.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbdDeviceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offsetNext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.usbdDeviceHandle)
                    (UsbDeviceDescriptor.typeLayout()).writeNative(addr + 16L, value.deviceDescriptor)
                }
            }

        public operator fun invoke(
            offsetNext: UInt = 0u,
            usbdDeviceHandle: MutPtr<CVoid> = MutPtr(0L),
            deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
        ): UsbdDeviceInformation =
            UsbdDeviceInformation(
                offsetNext = offsetNext,
                usbdDeviceHandleCtorArg = usbdDeviceHandle,
                deviceDescriptor = deviceDescriptor,
            )
    }
}

public class UsbdEndpointOffloadInformation internal constructor(
    public var size: UInt,
    public var endpointAddress: UShort,
    public var resourceId: UInt,
    public var mode: UsbdEndpointOffloadMode,
    public var bitfield1: UInt,
    public var bitfield2: UInt,
    public var transferSegmentLA: Long,
    transferSegmentVACtorArg: MutPtr<CVoid>,
    public var transferRingSize: Int,
    public var transferRingInitialCycleBit: UInt,
    public var messageNumber: UInt,
    public var eventRingSegmentLA: Long,
    eventRingSegmentVACtorArg: MutPtr<CVoid>,
    public var eventRingSize: Int,
    public var eventRingInitialCycleBit: UInt,
) {
    public var transferSegmentVA: MutPtr<CVoid> = transferSegmentVACtorArg
        internal set

    public var eventRingSegmentVA: MutPtr<CVoid> = eventRingSegmentVACtorArg
        internal set

    public constructor() : this(
        size = 0u,
        endpointAddress = 0u,
        resourceId = 0u,
        mode = 0,
        bitfield1 = 0u,
        bitfield2 = 0u,
        transferSegmentLA = 0L,
        transferSegmentVACtorArg = MutPtr(0L),
        transferRingSize = 0,
        transferRingInitialCycleBit = 0u,
        messageNumber = 0u,
        eventRingSegmentLA = 0L,
        eventRingSegmentVACtorArg = MutPtr(0L),
        eventRingSize = 0,
        eventRingInitialCycleBit = 0u,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UShort = this.endpointAddress

    public operator fun component3(): UInt = this.resourceId

    public operator fun component4(): UsbdEndpointOffloadMode = this.mode

    public operator fun component5(): UInt = this.bitfield1

    public operator fun component6(): UInt = this.bitfield2

    public operator fun component7(): Long = this.transferSegmentLA

    public operator fun component8(): MutPtr<CVoid> = this.transferSegmentVA

    public operator fun component9(): Int = this.transferRingSize

    public operator fun component10(): UInt = this.transferRingInitialCycleBit

    public operator fun component11(): UInt = this.messageNumber

    public operator fun component12(): Long = this.eventRingSegmentLA

    public operator fun component13(): MutPtr<CVoid> = this.eventRingSegmentVA

    public operator fun component14(): Int = this.eventRingSize

    public operator fun component15(): UInt = this.eventRingInitialCycleBit

    public fun copy(size: UInt = this.size, endpointAddress: UShort = this.endpointAddress, resourceId: UInt = this.resourceId, mode: UsbdEndpointOffloadMode = this.mode, bitfield1: UInt = this.bitfield1, bitfield2: UInt = this.bitfield2, transferSegmentLA: Long = this.transferSegmentLA, transferSegmentVA: MutPtr<CVoid> = this.transferSegmentVA, transferRingSize: Int = this.transferRingSize, transferRingInitialCycleBit: UInt = this.transferRingInitialCycleBit, messageNumber: UInt = this.messageNumber, eventRingSegmentLA: Long = this.eventRingSegmentLA, eventRingSegmentVA: MutPtr<CVoid> = this.eventRingSegmentVA, eventRingSize: Int = this.eventRingSize, eventRingInitialCycleBit: UInt = this.eventRingInitialCycleBit): UsbdEndpointOffloadInformation = UsbdEndpointOffloadInformation(size = size, endpointAddress = endpointAddress, resourceId = resourceId, mode = mode, bitfield1 = bitfield1, bitfield2 = bitfield2, transferSegmentLA = transferSegmentLA, transferSegmentVACtorArg = transferSegmentVA, transferRingSize = transferRingSize, transferRingInitialCycleBit = transferRingInitialCycleBit, messageNumber = messageNumber, eventRingSegmentLA = eventRingSegmentLA, eventRingSegmentVACtorArg = eventRingSegmentVA, eventRingSize = eventRingSize, eventRingInitialCycleBit = eventRingInitialCycleBit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbdEndpointOffloadInformation) return false
        if (this.size != other.size) return false
        if (this.endpointAddress != other.endpointAddress) return false
        if (this.resourceId != other.resourceId) return false
        if (this.mode != other.mode) return false
        if (this.bitfield1 != other.bitfield1) return false
        if (this.bitfield2 != other.bitfield2) return false
        if (this.transferSegmentLA != other.transferSegmentLA) return false
        if (this.transferSegmentVA != other.transferSegmentVA) return false
        if (this.transferRingSize != other.transferRingSize) return false
        if (this.transferRingInitialCycleBit != other.transferRingInitialCycleBit) return false
        if (this.messageNumber != other.messageNumber) return false
        if (this.eventRingSegmentLA != other.eventRingSegmentLA) return false
        if (this.eventRingSegmentVA != other.eventRingSegmentVA) return false
        if (this.eventRingSize != other.eventRingSize) return false
        if (this.eventRingInitialCycleBit != other.eventRingInitialCycleBit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.endpointAddress.hashCode()
        result = 31 * result + this.resourceId.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.bitfield1.hashCode()
        result = 31 * result + this.bitfield2.hashCode()
        result = 31 * result + this.transferSegmentLA.hashCode()
        result = 31 * result + this.transferSegmentVA.hashCode()
        result = 31 * result + this.transferRingSize.hashCode()
        result = 31 * result + this.transferRingInitialCycleBit.hashCode()
        result = 31 * result + this.messageNumber.hashCode()
        result = 31 * result + this.eventRingSegmentLA.hashCode()
        result = 31 * result + this.eventRingSegmentVA.hashCode()
        result = 31 * result + this.eventRingSize.hashCode()
        result = 31 * result + this.eventRingInitialCycleBit.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdEndpointOffloadInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdEndpointOffloadInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 82L
                override fun readNative(addr: Long): UsbdEndpointOffloadInformation =
                    UsbdEndpointOffloadInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 54L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 70L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 78L),
                    )
                override fun writeNative(addr: Long, value: UsbdEndpointOffloadInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.endpointAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.resourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 10L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 14L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 18L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 22L, value.transferSegmentLA)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 30L, value.transferSegmentVA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 38L, value.transferRingSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 46L, value.transferRingInitialCycleBit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 50L, value.messageNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 54L, value.eventRingSegmentLA)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 62L, value.eventRingSegmentVA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 70L, value.eventRingSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 78L, value.eventRingInitialCycleBit)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            endpointAddress: UShort = 0u,
            resourceId: UInt = 0u,
            mode: UsbdEndpointOffloadMode = 0,
            bitfield1: UInt = 0u,
            bitfield2: UInt = 0u,
            transferSegmentLA: Long = 0L,
            transferSegmentVA: MutPtr<CVoid> = MutPtr(0L),
            transferRingSize: Int = 0,
            transferRingInitialCycleBit: UInt = 0u,
            messageNumber: UInt = 0u,
            eventRingSegmentLA: Long = 0L,
            eventRingSegmentVA: MutPtr<CVoid> = MutPtr(0L),
            eventRingSize: Int = 0,
            eventRingInitialCycleBit: UInt = 0u,
        ): UsbdEndpointOffloadInformation =
            UsbdEndpointOffloadInformation(
                size = size,
                endpointAddress = endpointAddress,
                resourceId = resourceId,
                mode = mode,
                bitfield1 = bitfield1,
                bitfield2 = bitfield2,
                transferSegmentLA = transferSegmentLA,
                transferSegmentVACtorArg = transferSegmentVA,
                transferRingSize = transferRingSize,
                transferRingInitialCycleBit = transferRingInitialCycleBit,
                messageNumber = messageNumber,
                eventRingSegmentLA = eventRingSegmentLA,
                eventRingSegmentVACtorArg = eventRingSegmentVA,
                eventRingSize = eventRingSize,
                eventRingInitialCycleBit = eventRingInitialCycleBit,
            )
    }
}

public class UsbdInterfaceInformation internal constructor(
    public var length: UShort,
    public var interfaceNumber: UByte,
    public var alternateSetting: UByte,
    public var cls: UByte,
    public var subClass: UByte,
    public var protocol: UByte,
    public var reserved: UByte,
    interfaceHandleCtorArg: MutPtr<CVoid>,
    public var numberOfPipes: UInt,
    public var pipes: List<UsbdPipeInformation>,
) {
    public var interfaceHandle: MutPtr<CVoid> = interfaceHandleCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        interfaceNumber = 0u,
        alternateSetting = 0u,
        cls = 0u,
        subClass = 0u,
        protocol = 0u,
        reserved = 0u,
        interfaceHandleCtorArg = MutPtr(0L),
        numberOfPipes = 0u,
        pipes = List(1) { UsbdPipeInformation() },
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UByte = this.interfaceNumber

    public operator fun component3(): UByte = this.alternateSetting

    public operator fun component4(): UByte = this.cls

    public operator fun component5(): UByte = this.subClass

    public operator fun component6(): UByte = this.protocol

    public operator fun component7(): UByte = this.reserved

    public operator fun component8(): MutPtr<CVoid> = this.interfaceHandle

    public operator fun component9(): UInt = this.numberOfPipes

    public operator fun component10(): List<UsbdPipeInformation> = this.pipes

    public fun copy(length: UShort = this.length, interfaceNumber: UByte = this.interfaceNumber, alternateSetting: UByte = this.alternateSetting, cls: UByte = this.cls, subClass: UByte = this.subClass, protocol: UByte = this.protocol, reserved: UByte = this.reserved, interfaceHandle: MutPtr<CVoid> = this.interfaceHandle, numberOfPipes: UInt = this.numberOfPipes, pipes: List<UsbdPipeInformation> = this.pipes): UsbdInterfaceInformation = UsbdInterfaceInformation(length = length, interfaceNumber = interfaceNumber, alternateSetting = alternateSetting, cls = cls, subClass = subClass, protocol = protocol, reserved = reserved, interfaceHandleCtorArg = interfaceHandle, numberOfPipes = numberOfPipes, pipes = pipes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbdInterfaceInformation) return false
        if (this.length != other.length) return false
        if (this.interfaceNumber != other.interfaceNumber) return false
        if (this.alternateSetting != other.alternateSetting) return false
        if (this.cls != other.cls) return false
        if (this.subClass != other.subClass) return false
        if (this.protocol != other.protocol) return false
        if (this.reserved != other.reserved) return false
        if (this.interfaceHandle != other.interfaceHandle) return false
        if (this.numberOfPipes != other.numberOfPipes) return false
        if (this.pipes != other.pipes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.interfaceNumber.hashCode()
        result = 31 * result + this.alternateSetting.hashCode()
        result = 31 * result + this.cls.hashCode()
        result = 31 * result + this.subClass.hashCode()
        result = 31 * result + this.protocol.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.interfaceHandle.hashCode()
        result = 31 * result + this.numberOfPipes.hashCode()
        result = 31 * result + this.pipes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdInterfaceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdInterfaceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UsbdInterfaceInformation =
                    UsbdInterfaceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbdPipeInformation.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: UsbdInterfaceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.interfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.alternateSetting)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.cls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.subClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.interfaceHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numberOfPipes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbdPipeInformation.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.pipes)
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            interfaceNumber: UByte = 0u,
            alternateSetting: UByte = 0u,
            cls: UByte = 0u,
            subClass: UByte = 0u,
            protocol: UByte = 0u,
            reserved: UByte = 0u,
            interfaceHandle: MutPtr<CVoid> = MutPtr(0L),
            numberOfPipes: UInt = 0u,
            pipes: List<UsbdPipeInformation> = List(1) { UsbdPipeInformation() },
        ): UsbdInterfaceInformation =
            UsbdInterfaceInformation(
                length = length,
                interfaceNumber = interfaceNumber,
                alternateSetting = alternateSetting,
                cls = cls,
                subClass = subClass,
                protocol = protocol,
                reserved = reserved,
                interfaceHandleCtorArg = interfaceHandle,
                numberOfPipes = numberOfPipes,
                pipes = pipes,
            )
    }
}

public data class UsbdIsoPacketDescriptor(
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
    public var status: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdIsoPacketDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdIsoPacketDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UsbdIsoPacketDescriptor =
                    UsbdIsoPacketDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbdIsoPacketDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.status)
                }
            }
    }
}

public class UsbdPipeInformation internal constructor(
    public var maximumPacketSize: UShort,
    public var endpointAddress: UByte,
    public var interval: UByte,
    public var pipeType: UsbdPipeType,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var maximumTransferSize: UInt,
    public var pipeFlags: UInt,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public constructor() : this(
        maximumPacketSize = 0u,
        endpointAddress = 0u,
        interval = 0u,
        pipeType = 0,
        pipeHandleCtorArg = MutPtr(0L),
        maximumTransferSize = 0u,
        pipeFlags = 0u,
    )

    public operator fun component1(): UShort = this.maximumPacketSize

    public operator fun component2(): UByte = this.endpointAddress

    public operator fun component3(): UByte = this.interval

    public operator fun component4(): UsbdPipeType = this.pipeType

    public operator fun component5(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component6(): UInt = this.maximumTransferSize

    public operator fun component7(): UInt = this.pipeFlags

    public fun copy(maximumPacketSize: UShort = this.maximumPacketSize, endpointAddress: UByte = this.endpointAddress, interval: UByte = this.interval, pipeType: UsbdPipeType = this.pipeType, pipeHandle: MutPtr<CVoid> = this.pipeHandle, maximumTransferSize: UInt = this.maximumTransferSize, pipeFlags: UInt = this.pipeFlags): UsbdPipeInformation = UsbdPipeInformation(maximumPacketSize = maximumPacketSize, endpointAddress = endpointAddress, interval = interval, pipeType = pipeType, pipeHandleCtorArg = pipeHandle, maximumTransferSize = maximumTransferSize, pipeFlags = pipeFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbdPipeInformation) return false
        if (this.maximumPacketSize != other.maximumPacketSize) return false
        if (this.endpointAddress != other.endpointAddress) return false
        if (this.interval != other.interval) return false
        if (this.pipeType != other.pipeType) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.maximumTransferSize != other.maximumTransferSize) return false
        if (this.pipeFlags != other.pipeFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumPacketSize.hashCode()
        result = 31 * result + this.endpointAddress.hashCode()
        result = 31 * result + this.interval.hashCode()
        result = 31 * result + this.pipeType.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.maximumTransferSize.hashCode()
        result = 31 * result + this.pipeFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdPipeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdPipeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UsbdPipeInformation =
                    UsbdPipeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: UsbdPipeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.maximumPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.endpointAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.interval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pipeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maximumTransferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pipeFlags)
                }
            }

        public operator fun invoke(
            maximumPacketSize: UShort = 0u,
            endpointAddress: UByte = 0u,
            interval: UByte = 0u,
            pipeType: UsbdPipeType = 0,
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            maximumTransferSize: UInt = 0u,
            pipeFlags: UInt = 0u,
        ): UsbdPipeInformation =
            UsbdPipeInformation(
                maximumPacketSize = maximumPacketSize,
                endpointAddress = endpointAddress,
                interval = interval,
                pipeType = pipeType,
                pipeHandleCtorArg = pipeHandle,
                maximumTransferSize = maximumTransferSize,
                pipeFlags = pipeFlags,
            )
    }
}

public class UsbdStreamInformation internal constructor(
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var streamID: UInt,
    public var maximumTransferSize: UInt,
    public var pipeFlags: UInt,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public constructor() : this(
        pipeHandleCtorArg = MutPtr(0L),
        streamID = 0u,
        maximumTransferSize = 0u,
        pipeFlags = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component2(): UInt = this.streamID

    public operator fun component3(): UInt = this.maximumTransferSize

    public operator fun component4(): UInt = this.pipeFlags

    public fun copy(pipeHandle: MutPtr<CVoid> = this.pipeHandle, streamID: UInt = this.streamID, maximumTransferSize: UInt = this.maximumTransferSize, pipeFlags: UInt = this.pipeFlags): UsbdStreamInformation = UsbdStreamInformation(pipeHandleCtorArg = pipeHandle, streamID = streamID, maximumTransferSize = maximumTransferSize, pipeFlags = pipeFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbdStreamInformation) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.streamID != other.streamID) return false
        if (this.maximumTransferSize != other.maximumTransferSize) return false
        if (this.pipeFlags != other.pipeFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pipeHandle.hashCode()
        result = 31 * result + this.streamID.hashCode()
        result = 31 * result + this.maximumTransferSize.hashCode()
        result = 31 * result + this.pipeFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdStreamInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdStreamInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UsbdStreamInformation =
                    UsbdStreamInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbdStreamInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.streamID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maximumTransferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pipeFlags)
                }
            }

        public operator fun invoke(
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            streamID: UInt = 0u,
            maximumTransferSize: UInt = 0u,
            pipeFlags: UInt = 0u,
        ): UsbdStreamInformation =
            UsbdStreamInformation(
                pipeHandleCtorArg = pipeHandle,
                streamID = streamID,
                maximumTransferSize = maximumTransferSize,
                pipeFlags = pipeFlags,
            )
    }
}

public data class UsbdVersionInformation(
    public var usbdiVersion: UInt = 0u,
    public var supportedUsbVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdVersionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbdVersionInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbdVersionInformation =
                    UsbdVersionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbdVersionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usbdiVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.supportedUsbVersion)
                }
            }
    }
}

public data class UsbfnBusConfigurationInfo(
    public var configurationName: UShortArray = UShortArray(40),
    public var isCurrent: Boolean = false,
    public var isActive: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnBusConfigurationInfo) return false
        if (!this.configurationName.contentEquals(other.configurationName)) return false
        if (this.isCurrent != other.isCurrent) return false
        if (this.isActive != other.isActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.configurationName.contentHashCode()
        result = 31 * result + this.isCurrent.hashCode()
        result = 31 * result + this.isActive.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnBusConfigurationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnBusConfigurationInfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 82L
                override fun readNative(addr: Long): UsbfnBusConfigurationInfo =
                    UsbfnBusConfigurationInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 81L),
                    )
                override fun writeNative(addr: Long, value: UsbfnBusConfigurationInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr, value.configurationName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 80L, value.isCurrent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 81L, value.isActive)
                }
            }
    }
}

public data class UsbfnClassInformationPacket(
    public var fullSpeedClassInterface: UsbfnClassInterface = UsbfnClassInterface(),
    public var highSpeedClassInterface: UsbfnClassInterface = UsbfnClassInterface(),
    public var interfaceName: UShortArray = UShortArray(40),
    public var interfaceGuid: UShortArray = UShortArray(39),
    public var hasInterfaceGuid: Boolean = false,
    public var superSpeedClassInterface: UsbfnClassInterface = UsbfnClassInterface(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnClassInformationPacket) return false
        if (this.fullSpeedClassInterface != other.fullSpeedClassInterface) return false
        if (this.highSpeedClassInterface != other.highSpeedClassInterface) return false
        if (!this.interfaceName.contentEquals(other.interfaceName)) return false
        if (!this.interfaceGuid.contentEquals(other.interfaceGuid)) return false
        if (this.hasInterfaceGuid != other.hasInterfaceGuid) return false
        if (this.superSpeedClassInterface != other.superSpeedClassInterface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fullSpeedClassInterface.hashCode()
        result = 31 * result + this.highSpeedClassInterface.hashCode()
        result = 31 * result + this.interfaceName.contentHashCode()
        result = 31 * result + this.interfaceGuid.contentHashCode()
        result = 31 * result + this.hasInterfaceGuid.hashCode()
        result = 31 * result + this.superSpeedClassInterface.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInformationPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInformationPacket> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 748L
                override fun readNative(addr: Long): UsbfnClassInformationPacket =
                    UsbfnClassInformationPacket(
                        (UsbfnClassInterface.typeLayout()).readNative(addr),
                        (UsbfnClassInterface.typeLayout()).readNative(addr + 196L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr + 392L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                        ).readNative(addr + 472L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 550L),
                        (UsbfnClassInterface.typeLayout()).readNative(addr + 552L),
                    )
                override fun writeNative(addr: Long, value: UsbfnClassInformationPacket) {
                    (UsbfnClassInterface.typeLayout()).writeNative(addr, value.fullSpeedClassInterface)
                    (UsbfnClassInterface.typeLayout()).writeNative(addr + 196L, value.highSpeedClassInterface)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr + 392L, value.interfaceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                    ).writeNative(addr + 472L, value.interfaceGuid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 550L, value.hasInterfaceGuid)
                    (UsbfnClassInterface.typeLayout()).writeNative(addr + 552L, value.superSpeedClassInterface)
                }
            }
    }
}

public data class UsbfnClassInformationPacketEx(
    public var fullSpeedClassInterfaceEx: UsbfnClassInterfaceEx = UsbfnClassInterfaceEx(),
    public var highSpeedClassInterfaceEx: UsbfnClassInterfaceEx = UsbfnClassInterfaceEx(),
    public var superSpeedClassInterfaceEx: UsbfnClassInterfaceEx = UsbfnClassInterfaceEx(),
    public var interfaceName: UShortArray = UShortArray(40),
    public var interfaceGuid: UShortArray = UShortArray(39),
    public var hasInterfaceGuid: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnClassInformationPacketEx) return false
        if (this.fullSpeedClassInterfaceEx != other.fullSpeedClassInterfaceEx) return false
        if (this.highSpeedClassInterfaceEx != other.highSpeedClassInterfaceEx) return false
        if (this.superSpeedClassInterfaceEx != other.superSpeedClassInterfaceEx) return false
        if (!this.interfaceName.contentEquals(other.interfaceName)) return false
        if (!this.interfaceGuid.contentEquals(other.interfaceGuid)) return false
        if (this.hasInterfaceGuid != other.hasInterfaceGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fullSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.highSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.superSpeedClassInterfaceEx.hashCode()
        result = 31 * result + this.interfaceName.contentHashCode()
        result = 31 * result + this.interfaceGuid.contentHashCode()
        result = 31 * result + this.hasInterfaceGuid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInformationPacketEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInformationPacketEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 748L
                override fun readNative(addr: Long): UsbfnClassInformationPacketEx =
                    UsbfnClassInformationPacketEx(
                        (UsbfnClassInterfaceEx.typeLayout()).readNative(addr),
                        (UsbfnClassInterfaceEx.typeLayout()).readNative(addr + 196L),
                        (UsbfnClassInterfaceEx.typeLayout()).readNative(addr + 392L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr + 588L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                        ).readNative(addr + 668L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 746L),
                    )
                override fun writeNative(addr: Long, value: UsbfnClassInformationPacketEx) {
                    (UsbfnClassInterfaceEx.typeLayout()).writeNative(addr, value.fullSpeedClassInterfaceEx)
                    (UsbfnClassInterfaceEx.typeLayout()).writeNative(addr + 196L, value.highSpeedClassInterfaceEx)
                    (UsbfnClassInterfaceEx.typeLayout()).writeNative(addr + 392L, value.superSpeedClassInterfaceEx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr + 588L, value.interfaceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                    ).writeNative(addr + 668L, value.interfaceGuid.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 746L, value.hasInterfaceGuid)
                }
            }
    }
}

public data class UsbfnClassInterface(
    public var interfaceNumber: UByte = 0u,
    public var pipeCount: UByte = 0u,
    public var pipeArr: List<UsbfnPipeInformation> = List(16) { UsbfnPipeInformation() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInterface> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInterface> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 196L
                override fun readNative(addr: Long): UsbfnClassInterface =
                    UsbfnClassInterface(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbfnPipeInformation.typeLayout(), (16).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbfnClassInterface) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.interfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.pipeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbfnPipeInformation.typeLayout(), (16).toInt())
                    ).writeNative(addr + 4L, value.pipeArr)
                }
            }
    }
}

public data class UsbfnClassInterfaceEx(
    public var baseInterfaceNumber: UByte = 0u,
    public var interfaceCount: UByte = 0u,
    public var pipeCount: UByte = 0u,
    public var pipeArr: List<UsbfnPipeInformation> = List(16) { UsbfnPipeInformation() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInterfaceEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnClassInterfaceEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 196L
                override fun readNative(addr: Long): UsbfnClassInterfaceEx =
                    UsbfnClassInterfaceEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbfnPipeInformation.typeLayout(), (16).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbfnClassInterfaceEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.baseInterfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.interfaceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.pipeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbfnPipeInformation.typeLayout(), (16).toInt())
                    ).writeNative(addr + 4L, value.pipeArr)
                }
            }
    }
}

public data class UsbfnInterfaceInfo(
    public var interfaceNumber: UByte = 0u,
    public var speed: UsbfnBusSpeed = 0,
    public var size: UShort = 0u,
    public var interfaceDescriptorSet: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnInterfaceInfo) return false
        if (this.interfaceNumber != other.interfaceNumber) return false
        if (this.speed != other.speed) return false
        if (this.size != other.size) return false
        if (!this.interfaceDescriptorSet.contentEquals(other.interfaceDescriptorSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceNumber.hashCode()
        result = 31 * result + this.speed.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.interfaceDescriptorSet.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnInterfaceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnInterfaceInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UsbfnInterfaceInfo =
                    UsbfnInterfaceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UsbfnInterfaceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.interfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 10L, value.interfaceDescriptorSet.toList())
                }
            }
    }
}

public data class UsbfnNotification(
    public var event: UsbfnEvent = 0,
    public var u: UsbfnNotification0 = UsbfnNotification0(),
)

public data class UsbfnNotification0(
    public var busSpeed: UsbfnBusSpeed = 0,
    public var setupPacket: UsbDefaultPipeSetupPacket = UsbDefaultPipeSetupPacket(),
    public var configurationValue: UShort = 0u,
    public var portType: UsbfnPortType = 0,
    public var alternateInterface: AlternateInterface = AlternateInterface(),
)

public data class UsbfnPipeInformation(
    public var epDesc: UsbEndpointDescriptor = UsbEndpointDescriptor(),
    public var pipeId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnPipeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnPipeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UsbfnPipeInformation =
                    UsbfnPipeInformation(
                        (UsbEndpointDescriptor.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbfnPipeInformation) {
                    (UsbEndpointDescriptor.typeLayout()).writeNative(addr, value.epDesc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pipeId)
                }
            }
    }
}

public data class UsbfnUsbString(
    public var stringIndex: UByte = 0u,
    public var usbString: UShortArray = UShortArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbfnUsbString) return false
        if (this.stringIndex != other.stringIndex) return false
        if (!this.usbString.contentEquals(other.usbString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stringIndex.hashCode()
        result = 31 * result + this.usbString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnUsbString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbfnUsbString> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): UsbfnUsbString =
                    UsbfnUsbString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbfnUsbString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.stringIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (255).toInt())
                    ).writeNative(addr + 2L, value.usbString.toList())
                }
            }
    }
}

public data class UsbscanGetDescriptor(
    public var descriptorType: UByte = 0u,
    public var index: UByte = 0u,
    public var languageId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanGetDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanGetDescriptor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbscanGetDescriptor =
                    UsbscanGetDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: UsbscanGetDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.descriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.languageId)
                }
            }
    }
}

public data class UsbscanPipeConfiguration(
    public var numberOfPipes: UInt = 0u,
    public var pipeInfo: List<UsbscanPipeInformation> = List(8) { UsbscanPipeInformation() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanPipeConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanPipeConfiguration> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): UsbscanPipeConfiguration =
                    UsbscanPipeConfiguration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbscanPipeInformation.typeLayout(), (8).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbscanPipeConfiguration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfPipes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbscanPipeInformation.typeLayout(), (8).toInt())
                    ).writeNative(addr + 4L, value.pipeInfo)
                }
            }
    }
}

public data class UsbscanPipeInformation(
    public var maximumPacketSize: UShort = 0u,
    public var endpointAddress: UByte = 0u,
    public var interval: UByte = 0u,
    public var pipeType: RawPipeType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanPipeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanPipeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbscanPipeInformation =
                    UsbscanPipeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbscanPipeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.maximumPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.endpointAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.interval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pipeType)
                }
            }
    }
}

public data class UsbscanTimeout(
    public var timeoutRead: UInt = 0u,
    public var timeoutWrite: UInt = 0u,
    public var timeoutEvent: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanTimeout> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbscanTimeout> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UsbscanTimeout =
                    UsbscanTimeout(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbscanTimeout) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeoutRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeoutWrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeoutEvent)
                }
            }
    }
}

public data class UsbuserBandwidthInfoRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var bandwidthInformation: UsbBandwidthInfo = UsbBandwidthInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserBandwidthInfoRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserBandwidthInfoRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): UsbuserBandwidthInfoRequest =
                    UsbuserBandwidthInfoRequest(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbBandwidthInfo.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserBandwidthInfoRequest) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbBandwidthInfo.typeLayout()).writeNative(addr + 16L, value.bandwidthInformation)
                }
            }
    }
}

public data class UsbuserBusStatistics0Request(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var busStatistics0: UsbBusStatistics0 = UsbBusStatistics0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserBusStatistics0Request> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserBusStatistics0Request> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): UsbuserBusStatistics0Request =
                    UsbuserBusStatistics0Request(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbBusStatistics0.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserBusStatistics0Request) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbBusStatistics0.typeLayout()).writeNative(addr + 16L, value.busStatistics0)
                }
            }
    }
}

public data class UsbuserCloseRawDevice(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbCloseRawDeviceParameters = UsbCloseRawDeviceParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserCloseRawDevice> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserCloseRawDevice> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbuserCloseRawDevice =
                    UsbuserCloseRawDevice(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbCloseRawDeviceParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserCloseRawDevice) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbCloseRawDeviceParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserControllerInfo0(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var info0: UsbControllerInfo0 = UsbControllerInfo0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserControllerInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserControllerInfo0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): UsbuserControllerInfo0 =
                    UsbuserControllerInfo0(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbControllerInfo0.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserControllerInfo0) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbControllerInfo0.typeLayout()).writeNative(addr + 16L, value.info0)
                }
            }
    }
}

public data class UsbuserControllerUnicodeName(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var unicodeName: UsbUnicodeName = UsbUnicodeName(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserControllerUnicodeName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserControllerUnicodeName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 22L
                override fun readNative(addr: Long): UsbuserControllerUnicodeName =
                    UsbuserControllerUnicodeName(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbUnicodeName.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserControllerUnicodeName) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbUnicodeName.typeLayout()).writeNative(addr + 16L, value.unicodeName)
                }
            }
    }
}

public data class UsbuserGetDriverVersion(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbDriverVersionParameters = UsbDriverVersionParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserGetDriverVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserGetDriverVersion> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UsbuserGetDriverVersion =
                    UsbuserGetDriverVersion(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbDriverVersionParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserGetDriverVersion) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbDriverVersionParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserGetUsb2hwVersion(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbUsb2hwVersionParameters = UsbUsb2hwVersionParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserGetUsb2hwVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserGetUsb2hwVersion> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 17L
                override fun readNative(addr: Long): UsbuserGetUsb2hwVersion =
                    UsbuserGetUsb2hwVersion(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbUsb2hwVersionParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserGetUsb2hwVersion) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbUsb2hwVersionParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserOpenRawDevice(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbOpenRawDeviceParameters = UsbOpenRawDeviceParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserOpenRawDevice> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserOpenRawDevice> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbuserOpenRawDevice =
                    UsbuserOpenRawDevice(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbOpenRawDeviceParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserOpenRawDevice) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbOpenRawDeviceParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserPassThruRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var passThru: UsbPassThruParameters = UsbPassThruParameters(),
)

public data class UsbuserPowerInfoRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var powerInformation: UsbPowerInfo = UsbPowerInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserPowerInfoRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserPowerInfoRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 50L
                override fun readNative(addr: Long): UsbuserPowerInfoRequest =
                    UsbuserPowerInfoRequest(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbPowerInfo.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserPowerInfoRequest) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbPowerInfo.typeLayout()).writeNative(addr + 16L, value.powerInformation)
                }
            }
    }
}

public data class UsbuserRawResetRootPort(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: RawResetPortParameters = RawResetPortParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRawResetRootPort> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRawResetRootPort> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbuserRawResetRootPort =
                    UsbuserRawResetRootPort(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (RawResetPortParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserRawResetRootPort) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (RawResetPortParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserRefreshHctReg(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRefreshHctReg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRefreshHctReg> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbuserRefreshHctReg =
                    UsbuserRefreshHctReg(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserRefreshHctReg) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class UsbuserRequestHeader(
    public var usbUserRequest: UInt = 0u,
    public var usbUserStatusCode: UsbUserErrorCode = 0,
    public var requestBufferLength: UInt = 0u,
    public var actualBufferLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRequestHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRequestHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UsbuserRequestHeader =
                    UsbuserRequestHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UsbuserRequestHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usbUserRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.usbUserStatusCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requestBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.actualBufferLength)
                }
            }
    }
}

public data class UsbuserRootportFeatureRequest(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: RawRootportFeature = RawRootportFeature(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRootportFeatureRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRootportFeatureRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 22L
                override fun readNative(addr: Long): UsbuserRootportFeatureRequest =
                    UsbuserRootportFeatureRequest(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (RawRootportFeature.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserRootportFeatureRequest) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (RawRootportFeature.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserRootportParameters(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: RawRootportParameters = RawRootportParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRootportParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserRootportParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbuserRootportParameters =
                    UsbuserRootportParameters(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (RawRootportParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserRootportParameters) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (RawRootportParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class UsbuserSendOnePacket(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var packetParameters: PacketParameters = PacketParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserSendOnePacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserSendOnePacket> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UsbuserSendOnePacket =
                    UsbuserSendOnePacket(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (PacketParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserSendOnePacket) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (PacketParameters.typeLayout()).writeNative(addr + 16L, value.packetParameters)
                }
            }
    }
}

public data class UsbuserSendRawCommand(
    public var header: UsbuserRequestHeader = UsbuserRequestHeader(),
    public var parameters: UsbSendRawCommandParameters = UsbSendRawCommandParameters(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserSendRawCommand> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbuserSendRawCommand> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): UsbuserSendRawCommand =
                    UsbuserSendRawCommand(
                        (UsbuserRequestHeader.typeLayout()).readNative(addr),
                        (UsbSendRawCommandParameters.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbuserSendRawCommand) {
                    (UsbuserRequestHeader.typeLayout()).writeNative(addr, value.header)
                    (UsbSendRawCommandParameters.typeLayout()).writeNative(addr + 16L, value.parameters)
                }
            }
    }
}

public data class Usb20PortChange(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb20PortChange0 = Usb20PortChange0(),
)

public data class Usb20PortChange0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb20PortChange0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb20PortChange0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Usb20PortChange0 =
                    Usb20PortChange0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Usb20PortChange0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Usb20PortStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb20PortStatus0 = Usb20PortStatus0(),
)

public data class Usb20PortStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb20PortStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb20PortStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Usb20PortStatus0 =
                    Usb20PortStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Usb20PortStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Usb30HubDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bNumberOfPorts: UByte = 0u,
    public var wHubCharacteristics: UShort = 0u,
    public var bPowerOnToPowerGood: UByte = 0u,
    public var bHubControlCurrent: UByte = 0u,
    public var bHubHdrDecLat: UByte = 0u,
    public var wHubDelay: UShort = 0u,
    public var deviceRemovable: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb30HubDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb30HubDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Usb30HubDescriptor =
                    Usb30HubDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Usb30HubDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bNumberOfPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 3L, value.wHubCharacteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bPowerOnToPowerGood)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bHubControlCurrent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bHubHdrDecLat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wHubDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.deviceRemovable)
                }
            }
    }
}

public data class Usb30PortChange(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb30PortChange0 = Usb30PortChange0(),
)

public data class Usb30PortChange0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb30PortChange0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb30PortChange0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Usb30PortChange0 =
                    Usb30PortChange0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Usb30PortChange0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Usb30PortStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: Usb30PortStatus0 = Usb30PortStatus0(),
)

public data class Usb30PortStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb30PortStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Usb30PortStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Usb30PortStatus0 =
                    Usb30PortStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Usb30PortStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbAcquireInfo(
    public var notificationType: UsbNotificationType = 0,
    public var totalSize: UInt = 0u,
    public var buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbAcquireInfo) return false
        if (this.notificationType != other.notificationType) return false
        if (this.totalSize != other.totalSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.notificationType.hashCode()
        result = 31 * result + this.totalSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbAcquireInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbAcquireInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): UsbAcquireInfo =
                    UsbAcquireInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbAcquireInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.notificationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.buffer.toList())
                }
            }
    }
}

public data class UsbBandwidthInfo(
    public var deviceCount: UInt = 0u,
    public var totalBusBandwidth: UInt = 0u,
    public var total32secBandwidth: UInt = 0u,
    public var allocedBulkAndControl: UInt = 0u,
    public var allocedIso: UInt = 0u,
    public var allocedInterrupt1ms: UInt = 0u,
    public var allocedInterrupt2ms: UInt = 0u,
    public var allocedInterrupt4ms: UInt = 0u,
    public var allocedInterrupt8ms: UInt = 0u,
    public var allocedInterrupt16ms: UInt = 0u,
    public var allocedInterrupt32ms: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBandwidthInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBandwidthInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): UsbBandwidthInfo =
                    UsbBandwidthInfo(
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
                override fun writeNative(addr: Long, value: UsbBandwidthInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalBusBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.total32secBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.allocedBulkAndControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocedIso)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.allocedInterrupt1ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.allocedInterrupt2ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.allocedInterrupt4ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.allocedInterrupt8ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.allocedInterrupt16ms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.allocedInterrupt32ms)
                }
            }
    }
}

public data class UsbBosDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wTotalLength: UShort = 0u,
    public var bNumDeviceCaps: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBosDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBosDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): UsbBosDescriptor =
                    UsbBosDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbBosDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wTotalLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bNumDeviceCaps)
                }
            }
    }
}

public data class UsbBusNotification(
    public var notificationType: UsbNotificationType = 0,
    public var totalBandwidth: UInt = 0u,
    public var consumedBandwidth: UInt = 0u,
    public var controllerNameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBusNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBusNotification> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UsbBusNotification =
                    UsbBusNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UsbBusNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.notificationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.consumedBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.controllerNameLength)
                }
            }
    }
}

public data class UsbBusStatistics0(
    public var deviceCount: UInt = 0u,
    public var currentSystemTime: Long = 0L,
    public var currentUsbFrame: UInt = 0u,
    public var bulkBytes: UInt = 0u,
    public var isoBytes: UInt = 0u,
    public var interruptBytes: UInt = 0u,
    public var controlDataBytes: UInt = 0u,
    public var pciInterruptCount: UInt = 0u,
    public var hardResetCount: UInt = 0u,
    public var workerSignalCount: UInt = 0u,
    public var commonBufferBytes: UInt = 0u,
    public var workerIdleTimeMs: UInt = 0u,
    public var rootHubEnabled: Boolean = false,
    public var rootHubDevicePowerState: UByte = 0u,
    public var unused: UByte = 0u,
    public var nameIndex: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBusStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbBusStatistics0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): UsbBusStatistics0 =
                    UsbBusStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 4L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 53L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 55L),
                    )
                override fun writeNative(addr: Long, value: UsbBusStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 4L, value.currentSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.currentUsbFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bulkBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.isoBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.interruptBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.controlDataBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.pciInterruptCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.hardResetCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.workerSignalCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.commonBufferBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.workerIdleTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 52L, value.rootHubEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 53L, value.rootHubDevicePowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 54L, value.unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 55L, value.nameIndex)
                }
            }
    }
}

public data class UsbCloseRawDeviceParameters(
    public var xxx: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCloseRawDeviceParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCloseRawDeviceParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbCloseRawDeviceParameters =
                    UsbCloseRawDeviceParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbCloseRawDeviceParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.xxx)
                }
            }
    }
}

public data class UsbCommonDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCommonDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCommonDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbCommonDescriptor =
                    UsbCommonDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: UsbCommonDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                }
            }
    }
}

public data class UsbCompositeDeviceInfo(
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigDescriptor: UsbConfigurationDescriptor = UsbConfigurationDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var numberOfFunctions: UByte = 0u,
    public var functionInfo: List<UsbCompositeFunctionInfo> = List(1) { UsbCompositeFunctionInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCompositeDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCompositeDeviceInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 33L
                override fun readNative(addr: Long): UsbCompositeDeviceInfo =
                    UsbCompositeDeviceInfo(
                        (UsbDeviceDescriptor.typeLayout()).readNative(addr),
                        (UsbConfigurationDescriptor.typeLayout()).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbCompositeFunctionInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 29L),
                    )
                override fun writeNative(addr: Long, value: UsbCompositeDeviceInfo) {
                    (UsbDeviceDescriptor.typeLayout()).writeNative(addr, value.deviceDescriptor)
                    (UsbConfigurationDescriptor.typeLayout()).writeNative(addr + 18L, value.currentConfigDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 27L, value.currentConfigurationValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.numberOfFunctions)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbCompositeFunctionInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 29L, value.functionInfo)
                }
            }
    }
}

public data class UsbCompositeFunctionInfo(
    public var functionNumber: UByte = 0u,
    public var baseInterfaceNumber: UByte = 0u,
    public var numberOfInterfaces: UByte = 0u,
    public var functionIsIdle: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCompositeFunctionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCompositeFunctionInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbCompositeFunctionInfo =
                    UsbCompositeFunctionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: UsbCompositeFunctionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.functionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.baseInterfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.numberOfInterfaces)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.functionIsIdle)
                }
            }
    }
}

public data class UsbConfigurationDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wTotalLength: UShort = 0u,
    public var bNumInterfaces: UByte = 0u,
    public var bConfigurationValue: UByte = 0u,
    public var iConfiguration: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var maxPower: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbConfigurationDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbConfigurationDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): UsbConfigurationDescriptor =
                    UsbConfigurationDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbConfigurationDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wTotalLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bNumInterfaces)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bConfigurationValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.iConfiguration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bmAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.maxPower)
                }
            }
    }
}

public data class UsbConfigurationPowerDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var selfPowerConsumedD0: UByteArray = UByteArray(3),
    public var bPowerSummaryId: UByte = 0u,
    public var bBusPowerSavingD1: UByte = 0u,
    public var bSelfPowerSavingD1: UByte = 0u,
    public var bBusPowerSavingD2: UByte = 0u,
    public var bSelfPowerSavingD2: UByte = 0u,
    public var bBusPowerSavingD3: UByte = 0u,
    public var bSelfPowerSavingD3: UByte = 0u,
    public var transitionTimeFromD1: UShort = 0u,
    public var transitionTimeFromD2: UShort = 0u,
    public var transitionTimeFromD3: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbConfigurationPowerDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.selfPowerConsumedD0.contentEquals(other.selfPowerConsumedD0)) return false
        if (this.bPowerSummaryId != other.bPowerSummaryId) return false
        if (this.bBusPowerSavingD1 != other.bBusPowerSavingD1) return false
        if (this.bSelfPowerSavingD1 != other.bSelfPowerSavingD1) return false
        if (this.bBusPowerSavingD2 != other.bBusPowerSavingD2) return false
        if (this.bSelfPowerSavingD2 != other.bSelfPowerSavingD2) return false
        if (this.bBusPowerSavingD3 != other.bBusPowerSavingD3) return false
        if (this.bSelfPowerSavingD3 != other.bSelfPowerSavingD3) return false
        if (this.transitionTimeFromD1 != other.transitionTimeFromD1) return false
        if (this.transitionTimeFromD2 != other.transitionTimeFromD2) return false
        if (this.transitionTimeFromD3 != other.transitionTimeFromD3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.selfPowerConsumedD0.contentHashCode()
        result = 31 * result + this.bPowerSummaryId.hashCode()
        result = 31 * result + this.bBusPowerSavingD1.hashCode()
        result = 31 * result + this.bSelfPowerSavingD1.hashCode()
        result = 31 * result + this.bBusPowerSavingD2.hashCode()
        result = 31 * result + this.bSelfPowerSavingD2.hashCode()
        result = 31 * result + this.bBusPowerSavingD3.hashCode()
        result = 31 * result + this.bSelfPowerSavingD3.hashCode()
        result = 31 * result + this.transitionTimeFromD1.hashCode()
        result = 31 * result + this.transitionTimeFromD2.hashCode()
        result = 31 * result + this.transitionTimeFromD3.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbConfigurationPowerDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbConfigurationPowerDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): UsbConfigurationPowerDescriptor =
                    UsbConfigurationPowerDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbConfigurationPowerDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 2L, value.selfPowerConsumedD0.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bPowerSummaryId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bBusPowerSavingD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bSelfPowerSavingD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bBusPowerSavingD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.bSelfPowerSavingD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.bBusPowerSavingD3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.bSelfPowerSavingD3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.transitionTimeFromD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.transitionTimeFromD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.transitionTimeFromD3)
                }
            }
    }
}

public data class UsbConnectionNotification(
    public var notificationType: UsbNotificationType = 0,
    public var connectionNumber: UInt = 0u,
    public var requestedBandwidth: UInt = 0u,
    public var enumerationFailReason: UInt = 0u,
    public var powerRequested: UInt = 0u,
    public var hubNameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbConnectionNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbConnectionNotification> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UsbConnectionNotification =
                    UsbConnectionNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: UsbConnectionNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.notificationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.connectionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requestedBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.enumerationFailReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.powerRequested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.hubNameLength)
                }
            }
    }
}

public data class UsbControllerDeviceInfo(
    public var pciVendorId: UInt = 0u,
    public var pciDeviceId: UInt = 0u,
    public var pciRevision: UInt = 0u,
    public var numberOfRootPorts: UInt = 0u,
    public var hcFeatureFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbControllerDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbControllerDeviceInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbControllerDeviceInfo =
                    UsbControllerDeviceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbControllerDeviceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pciVendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pciDeviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pciRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfRootPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hcFeatureFlags)
                }
            }
    }
}

public data class UsbControllerInfo0(
    public var pciVendorId: UInt = 0u,
    public var pciDeviceId: UInt = 0u,
    public var pciRevision: UInt = 0u,
    public var numberOfRootPorts: UInt = 0u,
    public var controllerFlavor: UsbControllerFlavor = 0,
    public var hcFeatureFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbControllerInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbControllerInfo0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UsbControllerInfo0 =
                    UsbControllerInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: UsbControllerInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pciVendorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pciDeviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pciRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfRootPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.controllerFlavor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.hcFeatureFlags)
                }
            }
    }
}

public data class UsbCyclePortParams(
    public var connectionIndex: UInt = 0u,
    public var statusReturned: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCyclePortParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbCyclePortParams> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbCyclePortParams =
                    UsbCyclePortParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbCyclePortParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.statusReturned)
                }
            }
    }
}

public data class UsbDefaultPipeSetupPacket(
    public var bmRequestType: BmRequestType = BmRequestType(),
    public var bRequest: UByte = 0u,
    public var wValue: UsbDefaultPipeSetupPacket0 = UsbDefaultPipeSetupPacket0(),
    public var wIndex: UsbDefaultPipeSetupPacket1 = UsbDefaultPipeSetupPacket1(),
    public var wLength: UShort = 0u,
)

public data class UsbDefaultPipeSetupPacket1(
    public var anonymous: UsbDefaultPipeSetupPacket10 = UsbDefaultPipeSetupPacket10(),
    public var w: UShort = 0u,
)

public data class UsbDefaultPipeSetupPacket10(
    public var lowByte: UByte = 0u,
    public var hiByte: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDefaultPipeSetupPacket10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDefaultPipeSetupPacket10> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbDefaultPipeSetupPacket10 =
                    UsbDefaultPipeSetupPacket10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: UsbDefaultPipeSetupPacket10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lowByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.hiByte)
                }
            }
    }
}

public data class UsbDefaultPipeSetupPacket0(
    public var anonymous: UsbDefaultPipeSetupPacket00 = UsbDefaultPipeSetupPacket00(),
    public var w: UShort = 0u,
)

public data class UsbDefaultPipeSetupPacket00(
    public var lowByte: UByte = 0u,
    public var hiByte: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDefaultPipeSetupPacket00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDefaultPipeSetupPacket00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbDefaultPipeSetupPacket00 =
                    UsbDefaultPipeSetupPacket00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: UsbDefaultPipeSetupPacket00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.lowByte)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.hiByte)
                }
            }
    }
}

public data class UsbDescriptorRequest(
    public var connectionIndex: UInt = 0u,
    public var setupPacket: UsbDescriptorRequest0 = UsbDescriptorRequest0(),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDescriptorRequest) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.setupPacket != other.setupPacket) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.setupPacket.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDescriptorRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDescriptorRequest> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 13L
                override fun readNative(addr: Long): UsbDescriptorRequest =
                    UsbDescriptorRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (UsbDescriptorRequest0.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UsbDescriptorRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (UsbDescriptorRequest0.typeLayout()).writeNative(addr + 4L, value.setupPacket)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class UsbDescriptorRequest0(
    public var bmRequest: UByte = 0u,
    public var bRequest: UByte = 0u,
    public var wValue: UShort = 0u,
    public var wIndex: UShort = 0u,
    public var wLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDescriptorRequest0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDescriptorRequest0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbDescriptorRequest0 =
                    UsbDescriptorRequest0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: UsbDescriptorRequest0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bmRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wLength)
                }
            }
    }
}

public data class UsbDeviceCapabilityBillboardDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var iAddtionalInfoURL: UByte = 0u,
    public var bNumberOfAlternateModes: UByte = 0u,
    public var bPreferredAlternateMode: UByte = 0u,
    public var vconnPower: UsbDeviceCapabilityBillboardDescriptor0 = UsbDeviceCapabilityBillboardDescriptor0(),
    public var bmConfigured: UByteArray = UByteArray(32),
    public var bReserved: UInt = 0u,
    public var alternateMode: List<UsbDeviceCapabilityBillboardDescriptor1> = List(1) { UsbDeviceCapabilityBillboardDescriptor1() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCapabilityBillboardDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.iAddtionalInfoURL != other.iAddtionalInfoURL) return false
        if (this.bNumberOfAlternateModes != other.bNumberOfAlternateModes) return false
        if (this.bPreferredAlternateMode != other.bPreferredAlternateMode) return false
        if (this.vconnPower != other.vconnPower) return false
        if (!this.bmConfigured.contentEquals(other.bmConfigured)) return false
        if (this.bReserved != other.bReserved) return false
        if (this.alternateMode != other.alternateMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.iAddtionalInfoURL.hashCode()
        result = 31 * result + this.bNumberOfAlternateModes.hashCode()
        result = 31 * result + this.bPreferredAlternateMode.hashCode()
        result = 31 * result + this.vconnPower.hashCode()
        result = 31 * result + this.bmConfigured.contentHashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.alternateMode.hashCode()
        return result
    }
}

public data class UsbDeviceCapabilityBillboardDescriptor1(
    public var wSVID: UShort = 0u,
    public var bAlternateMode: UByte = 0u,
    public var iAlternateModeSetting: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityBillboardDescriptor1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityBillboardDescriptor1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceCapabilityBillboardDescriptor1 =
                    UsbDeviceCapabilityBillboardDescriptor1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityBillboardDescriptor1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wSVID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bAlternateMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.iAlternateModeSetting)
                }
            }
    }
}

public data class UsbDeviceCapabilityBillboardDescriptor0(
    public var asUshort: UShort = 0u,
    public var anonymous: UsbDeviceCapabilityBillboardDescriptor00 = UsbDeviceCapabilityBillboardDescriptor00(),
)

public data class UsbDeviceCapabilityBillboardDescriptor00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityBillboardDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityBillboardDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbDeviceCapabilityBillboardDescriptor00 =
                    UsbDeviceCapabilityBillboardDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityBillboardDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilityContainerIdDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var containerID: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCapabilityContainerIdDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.bReserved != other.bReserved) return false
        if (!this.containerID.contentEquals(other.containerID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.containerID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityContainerIdDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityContainerIdDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): UsbDeviceCapabilityContainerIdDescriptor =
                    UsbDeviceCapabilityContainerIdDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityContainerIdDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bDevCapabilityType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.containerID.toList())
                }
            }
    }
}

public data class UsbDeviceCapabilityDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): UsbDeviceCapabilityDescriptor =
                    UsbDeviceCapabilityDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bDevCapabilityType)
                }
            }
    }
}

public data class UsbDeviceCapabilityFirmwareStatusDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bcdDescriptorVersion: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilityFirmwareStatusDescriptor0 = UsbDeviceCapabilityFirmwareStatusDescriptor0(),
)

public data class UsbDeviceCapabilityFirmwareStatusDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilityFirmwareStatusDescriptor00 = UsbDeviceCapabilityFirmwareStatusDescriptor00(),
)

public data class UsbDeviceCapabilityFirmwareStatusDescriptor00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityFirmwareStatusDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityFirmwareStatusDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceCapabilityFirmwareStatusDescriptor00 =
                    UsbDeviceCapabilityFirmwareStatusDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityFirmwareStatusDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilityPdConsumerPortDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmCapabilities: UsbDeviceCapabilityPdConsumerPortDescriptor0 = UsbDeviceCapabilityPdConsumerPortDescriptor0(),
    public var wMinVoltage: UShort = 0u,
    public var wMaxVoltage: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var dwMaxOperatingPower: UInt = 0u,
    public var dwMaxPeakPower: UInt = 0u,
    public var dwMaxPeakPowerTime: UInt = 0u,
)

public data class UsbDeviceCapabilityPdConsumerPortDescriptor0(
    public var asUshort: UShort = 0u,
    public var anonymous: UsbDeviceCapabilityPdConsumerPortDescriptor00 = UsbDeviceCapabilityPdConsumerPortDescriptor00(),
)

public data class UsbDeviceCapabilityPdConsumerPortDescriptor00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityPdConsumerPortDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityPdConsumerPortDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbDeviceCapabilityPdConsumerPortDescriptor00 =
                    UsbDeviceCapabilityPdConsumerPortDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityPdConsumerPortDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilityPlatformDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var platformCapabilityUuid: Guid = Guid(),
    public var capabililityData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCapabilityPlatformDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bDevCapabilityType != other.bDevCapabilityType) return false
        if (this.bReserved != other.bReserved) return false
        if (this.platformCapabilityUuid != other.platformCapabilityUuid) return false
        if (!this.capabililityData.contentEquals(other.capabililityData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bDevCapabilityType.hashCode()
        result = 31 * result + this.bReserved.hashCode()
        result = 31 * result + this.platformCapabilityUuid.hashCode()
        result = 31 * result + this.capabililityData.contentHashCode()
        return result
    }
}

public data class UsbDeviceCapabilityPowerDeliveryDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilityPowerDeliveryDescriptor0 = UsbDeviceCapabilityPowerDeliveryDescriptor0(),
    public var bmProviderPorts: UShort = 0u,
    public var bmConsumerPorts: UShort = 0u,
    public var bcdBCVersion: UShort = 0u,
    public var bcdPDVersion: UShort = 0u,
    public var bcdUSBTypeCVersion: UShort = 0u,
)

public data class UsbDeviceCapabilityPowerDeliveryDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilityPowerDeliveryDescriptor00 = UsbDeviceCapabilityPowerDeliveryDescriptor00(),
)

public data class UsbDeviceCapabilityPowerDeliveryDescriptor00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityPowerDeliveryDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityPowerDeliveryDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceCapabilityPowerDeliveryDescriptor00 =
                    UsbDeviceCapabilityPowerDeliveryDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityPowerDeliveryDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilitySuperspeedplusSpeed(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbDeviceCapabilitySuperspeedplusSpeed0 = UsbDeviceCapabilitySuperspeedplusSpeed0(),
)

public data class UsbDeviceCapabilitySuperspeedplusSpeed0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedplusSpeed0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedplusSpeed0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceCapabilitySuperspeedplusSpeed0 =
                    UsbDeviceCapabilitySuperspeedplusSpeed0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilitySuperspeedplusSpeed0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilitySuperspeedplusUsbDescriptor0 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor0(),
    public var wFunctionalitySupport: UsbDeviceCapabilitySuperspeedplusUsbDescriptor1 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor1(),
    public var wReserved: UShort = 0u,
    public var bmSublinkSpeedAttr: List<UsbDeviceCapabilitySuperspeedplusSpeed> = List(1) { UsbDeviceCapabilitySuperspeedplusSpeed() },
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilitySuperspeedplusUsbDescriptor00 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor00(),
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedplusUsbDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedplusUsbDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceCapabilitySuperspeedplusUsbDescriptor00 =
                    UsbDeviceCapabilitySuperspeedplusUsbDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilitySuperspeedplusUsbDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor1(
    public var asUshort: UShort = 0u,
    public var anonymous: UsbDeviceCapabilitySuperspeedplusUsbDescriptor10 = UsbDeviceCapabilitySuperspeedplusUsbDescriptor10(),
)

public data class UsbDeviceCapabilitySuperspeedplusUsbDescriptor10(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedplusUsbDescriptor10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedplusUsbDescriptor10> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbDeviceCapabilitySuperspeedplusUsbDescriptor10 =
                    UsbDeviceCapabilitySuperspeedplusUsbDescriptor10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilitySuperspeedplusUsbDescriptor10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCapabilitySuperspeedUsbDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var wSpeedsSupported: UShort = 0u,
    public var bFunctionalitySupport: UByte = 0u,
    public var bU1DevExitLat: UByte = 0u,
    public var wU2DevExitLat: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedUsbDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilitySuperspeedUsbDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): UsbDeviceCapabilitySuperspeedUsbDescriptor =
                    UsbDeviceCapabilitySuperspeedUsbDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilitySuperspeedUsbDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bDevCapabilityType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bmAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wSpeedsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bFunctionalitySupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bU1DevExitLat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wU2DevExitLat)
                }
            }
    }
}

public data class UsbDeviceCapabilityUsb20ExtensionDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bDevCapabilityType: UByte = 0u,
    public var bmAttributes: UsbDeviceCapabilityUsb20ExtensionDescriptor0 = UsbDeviceCapabilityUsb20ExtensionDescriptor0(),
)

public data class UsbDeviceCapabilityUsb20ExtensionDescriptor0(
    public var asUlong: UInt = 0u,
    public var anonymous: UsbDeviceCapabilityUsb20ExtensionDescriptor00 = UsbDeviceCapabilityUsb20ExtensionDescriptor00(),
)

public data class UsbDeviceCapabilityUsb20ExtensionDescriptor00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityUsb20ExtensionDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCapabilityUsb20ExtensionDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceCapabilityUsb20ExtensionDescriptor00 =
                    UsbDeviceCapabilityUsb20ExtensionDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCapabilityUsb20ExtensionDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceCharacteristics(
    public var version: UInt = 0u,
    public var reserved: UIntArray = UIntArray(2),
    public var usbDeviceCharacteristicsFlags: UInt = 0u,
    public var maximumSendPathDelayInMilliSeconds: UInt = 0u,
    public var maximumCompletionPathDelayInMilliSeconds: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceCharacteristics) return false
        if (this.version != other.version) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.usbDeviceCharacteristicsFlags != other.usbDeviceCharacteristicsFlags) return false
        if (this.maximumSendPathDelayInMilliSeconds != other.maximumSendPathDelayInMilliSeconds) return false
        if (this.maximumCompletionPathDelayInMilliSeconds != other.maximumCompletionPathDelayInMilliSeconds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.usbDeviceCharacteristicsFlags.hashCode()
        result = 31 * result + this.maximumSendPathDelayInMilliSeconds.hashCode()
        result = 31 * result + this.maximumCompletionPathDelayInMilliSeconds.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCharacteristics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceCharacteristics> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UsbDeviceCharacteristics =
                    UsbDeviceCharacteristics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceCharacteristics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 4L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.usbDeviceCharacteristicsFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maximumSendPathDelayInMilliSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maximumCompletionPathDelayInMilliSeconds)
                }
            }
    }
}

public data class UsbDeviceDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bcdUSB: UShort = 0u,
    public var bDeviceClass: UByte = 0u,
    public var bDeviceSubClass: UByte = 0u,
    public var bDeviceProtocol: UByte = 0u,
    public var bMaxPacketSize0: UByte = 0u,
    public var idVendor: UShort = 0u,
    public var idProduct: UShort = 0u,
    public var bcdDevice: UShort = 0u,
    public var iManufacturer: UByte = 0u,
    public var iProduct: UByte = 0u,
    public var iSerialNumber: UByte = 0u,
    public var bNumConfigurations: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): UsbDeviceDescriptor =
                    UsbDeviceDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bcdUSB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bDeviceClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bDeviceSubClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bDeviceProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bMaxPacketSize0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.idVendor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.idProduct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.bcdDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.iManufacturer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.iProduct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.iSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.bNumConfigurations)
                }
            }
    }
}

public data class UsbDeviceInfo(
    public var deviceState: UsbDeviceState = UsbDeviceState(),
    public var portNumber: UShort = 0u,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var speed: UsbDeviceSpeed = 0,
    public var deviceAddress: UShort = 0u,
    public var connectionIndex: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var pnpHardwareId: UShortArray = UShortArray(128),
    public var pnpCompatibleId: UShortArray = UShortArray(128),
    public var serialNumberId: UShortArray = UShortArray(128),
    public var pnpDeviceDescription: UShortArray = UShortArray(128),
    public var numberOfOpenPipes: UInt = 0u,
    public var pipeList: List<UsbPipeInfo> = List(1) { UsbPipeInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceInfo) return false
        if (this.deviceState != other.deviceState) return false
        if (this.portNumber != other.portNumber) return false
        if (this.deviceDescriptor != other.deviceDescriptor) return false
        if (this.currentConfigurationValue != other.currentConfigurationValue) return false
        if (this.speed != other.speed) return false
        if (this.deviceAddress != other.deviceAddress) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.connectionStatus != other.connectionStatus) return false
        if (!this.pnpHardwareId.contentEquals(other.pnpHardwareId)) return false
        if (!this.pnpCompatibleId.contentEquals(other.pnpCompatibleId)) return false
        if (!this.serialNumberId.contentEquals(other.serialNumberId)) return false
        if (!this.pnpDeviceDescription.contentEquals(other.pnpDeviceDescription)) return false
        if (this.numberOfOpenPipes != other.numberOfOpenPipes) return false
        if (this.pipeList != other.pipeList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceState.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.deviceDescriptor.hashCode()
        result = 31 * result + this.currentConfigurationValue.hashCode()
        result = 31 * result + this.speed.hashCode()
        result = 31 * result + this.deviceAddress.hashCode()
        result = 31 * result + this.connectionIndex.hashCode()
        result = 31 * result + this.connectionStatus.hashCode()
        result = 31 * result + this.pnpHardwareId.contentHashCode()
        result = 31 * result + this.pnpCompatibleId.contentHashCode()
        result = 31 * result + this.serialNumberId.contentHashCode()
        result = 31 * result + this.pnpDeviceDescription.contentHashCode()
        result = 31 * result + this.numberOfOpenPipes.hashCode()
        result = 31 * result + this.pipeList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1078L
                override fun readNative(addr: Long): UsbDeviceInfo =
                    UsbDeviceInfo(
                        (UsbDeviceState.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (UsbDeviceDescriptor.typeLayout()).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 29L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 31L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 35L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 39L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 295L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 551L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 807L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1063L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbPipeInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 1067L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceInfo) {
                    (UsbDeviceState.typeLayout()).writeNative(addr, value.deviceState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.portNumber)
                    (UsbDeviceDescriptor.typeLayout()).writeNative(addr + 6L, value.deviceDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.currentConfigurationValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 25L, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 29L, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 31L, value.connectionIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 35L, value.connectionStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 39L, value.pnpHardwareId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 295L, value.pnpCompatibleId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 551L, value.serialNumberId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 807L, value.pnpDeviceDescription.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1063L, value.numberOfOpenPipes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbPipeInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 1067L, value.pipeList)
                }
            }
    }
}

public data class UsbDeviceNodeInfo(
    public var sig: UInt = 0u,
    public var lengthInBytes: UInt = 0u,
    public var deviceDescription: UShortArray = UShortArray(40),
    public var nodeType: UsbWmiDeviceNodeType = 0,
    public var busAddress: UsbTopologyAddress = UsbTopologyAddress(),
    public var anonymous: UsbDeviceNodeInfo0 = UsbDeviceNodeInfo0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceNodeInfo) return false
        if (this.sig != other.sig) return false
        if (this.lengthInBytes != other.lengthInBytes) return false
        if (!this.deviceDescription.contentEquals(other.deviceDescription)) return false
        if (this.nodeType != other.nodeType) return false
        if (this.busAddress != other.busAddress) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.lengthInBytes.hashCode()
        result = 31 * result + this.deviceDescription.contentHashCode()
        result = 31 * result + this.nodeType.hashCode()
        result = 31 * result + this.busAddress.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class UsbDeviceNodeInfo0(
    public var usbDeviceInfo: UsbDeviceInfo = UsbDeviceInfo(),
    public var hubDeviceInfo: UsbHubDeviceInfo = UsbHubDeviceInfo(),
    public var compositeDeviceInfo: UsbCompositeDeviceInfo = UsbCompositeDeviceInfo(),
    public var controllerDeviceInfo: UsbControllerDeviceInfo = UsbControllerDeviceInfo(),
    public var deviceInformation: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbDeviceNodeInfo0) return false
        if (this.usbDeviceInfo != other.usbDeviceInfo) return false
        if (this.hubDeviceInfo != other.hubDeviceInfo) return false
        if (this.compositeDeviceInfo != other.compositeDeviceInfo) return false
        if (this.controllerDeviceInfo != other.controllerDeviceInfo) return false
        if (!this.deviceInformation.contentEquals(other.deviceInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usbDeviceInfo.hashCode()
        result = 31 * result + this.hubDeviceInfo.hashCode()
        result = 31 * result + this.compositeDeviceInfo.hashCode()
        result = 31 * result + this.controllerDeviceInfo.hashCode()
        result = 31 * result + this.deviceInformation.contentHashCode()
        return result
    }
}

public class UsbDevicePerformanceInfo(
    public var bulkBytes: UInt = 0u,
    public var controlDataBytes: UInt = 0u,
    public var isoBytes: UInt = 0u,
    public var interruptBytes: UInt = 0u,
    public var bulkUrbCount: UInt = 0u,
    public var controlUrbCount: UInt = 0u,
    public var isoUrbCount: UInt = 0u,
    public var interruptUrbCount: UInt = 0u,
    public var allocedInterrupt: UIntArray = UIntArray(6),
    public var allocedIso: UInt = 0u,
    public var total32secBandwidth: UInt = 0u,
    public var totalTtBandwidth: UInt = 0u,
    public var deviceDescription: UShortArray = UShortArray(60),
    public var deviceSpeed: UsbDeviceSpeed = 0,
    public var totalIsoLatency: UInt = 0u,
    public var droppedIsoPackets: UInt = 0u,
    public var transferErrors: UInt = 0u,
    public var pciInterruptCount: UInt = 0u,
    public var hcIdleState: UInt = 0u,
    public var hcAsyncIdleState: UInt = 0u,
    public var hcAsyncCacheFlushCount: UInt = 0u,
    public var hcPeriodicIdleState: UInt = 0u,
    public var hcPeriodicCacheFlushCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDevicePerformanceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDevicePerformanceInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 228L
                override fun readNative(addr: Long): UsbDevicePerformanceInfo =
                    UsbDevicePerformanceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr + 32L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (60).toInt())
                        ).readNative(addr + 68L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 224L),
                    )
                override fun writeNative(addr: Long, value: UsbDevicePerformanceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bulkBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlDataBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.isoBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.interruptBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bulkUrbCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.controlUrbCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.isoUrbCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.interruptUrbCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr + 32L, value.allocedInterrupt.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.allocedIso)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.total32secBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.totalTtBandwidth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (60).toInt())
                    ).writeNative(addr + 68L, value.deviceDescription.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 188L, value.deviceSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.totalIsoLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.droppedIsoPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.transferErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.pciInterruptCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.hcIdleState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.hcAsyncIdleState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.hcAsyncCacheFlushCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.hcPeriodicIdleState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 224L, value.hcPeriodicCacheFlushCount)
                }
            }
    }
}

public data class UsbDeviceQualifierDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bcdUSB: UShort = 0u,
    public var bDeviceClass: UByte = 0u,
    public var bDeviceSubClass: UByte = 0u,
    public var bDeviceProtocol: UByte = 0u,
    public var bMaxPacketSize0: UByte = 0u,
    public var bNumConfigurations: UByte = 0u,
    public var bReserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceQualifierDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceQualifierDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): UsbDeviceQualifierDescriptor =
                    UsbDeviceQualifierDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceQualifierDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bcdUSB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bDeviceClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bDeviceSubClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bDeviceProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bMaxPacketSize0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bNumConfigurations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.bReserved)
                }
            }
    }
}

public data class UsbDeviceState(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceState> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbDeviceState =
                    UsbDeviceState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDeviceStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbDeviceStatus0 = UsbDeviceStatus0(),
)

public data class UsbDeviceStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDeviceStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbDeviceStatus0 =
                    UsbDeviceStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbDeviceStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbDriverVersionParameters(
    public var driverTrackingCode: UInt = 0u,
    public var usbdiVersion: UInt = 0u,
    public var usbuserVersion: UInt = 0u,
    public var checkedPortDriver: Boolean = false,
    public var checkedMiniportDriver: Boolean = false,
    public var usbVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDriverVersionParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbDriverVersionParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UsbDriverVersionParameters =
                    UsbDriverVersionParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: UsbDriverVersionParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.driverTrackingCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.usbdiVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.usbuserVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.checkedPortDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.checkedMiniportDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.usbVersion)
                }
            }
    }
}

public data class UsbEndpointDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bEndpointAddress: UByte = 0u,
    public var bmAttributes: UByte = 0u,
    public var wMaxPacketSize: UShort = 0u,
    public var bInterval: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbEndpointDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbEndpointDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 7L
                override fun readNative(addr: Long): UsbEndpointDescriptor =
                    UsbEndpointDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: UsbEndpointDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bEndpointAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bmAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wMaxPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bInterval)
                }
            }
    }
}

public data class UsbEndpointStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbEndpointStatus0 = UsbEndpointStatus0(),
)

public data class UsbEndpointStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbEndpointStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbEndpointStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbEndpointStatus0 =
                    UsbEndpointStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbEndpointStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class UsbFrameNumberAndQpcForTimeSyncInformation internal constructor(
    timeTrackingHandleCtorArg: Handle,
    public var inputFrameNumber: UInt,
    public var inputMicroFrameNumber: UInt,
    public var queryPerformanceCounterAtInputFrameOrMicroFrame: Long,
    public var queryPerformanceCounterFrequency: Long,
    public var predictedAccuracyInMicroSeconds: UInt,
    public var currentGenerationID: UInt,
    public var currentQueryPerformanceCounter: Long,
    public var currentHardwareFrameNumber: UInt,
    public var currentHardwareMicroFrameNumber: UInt,
    public var currentUSBFrameNumber: UInt,
) {
    public var timeTrackingHandle: Handle = timeTrackingHandleCtorArg
        internal set

    public constructor() : this(
        timeTrackingHandleCtorArg = MutPtr(0L),
        inputFrameNumber = 0u,
        inputMicroFrameNumber = 0u,
        queryPerformanceCounterAtInputFrameOrMicroFrame = 0L,
        queryPerformanceCounterFrequency = 0L,
        predictedAccuracyInMicroSeconds = 0u,
        currentGenerationID = 0u,
        currentQueryPerformanceCounter = 0L,
        currentHardwareFrameNumber = 0u,
        currentHardwareMicroFrameNumber = 0u,
        currentUSBFrameNumber = 0u,
    )

    public operator fun component1(): Handle = this.timeTrackingHandle

    public operator fun component2(): UInt = this.inputFrameNumber

    public operator fun component3(): UInt = this.inputMicroFrameNumber

    public operator fun component4(): Long = this.queryPerformanceCounterAtInputFrameOrMicroFrame

    public operator fun component5(): Long = this.queryPerformanceCounterFrequency

    public operator fun component6(): UInt = this.predictedAccuracyInMicroSeconds

    public operator fun component7(): UInt = this.currentGenerationID

    public operator fun component8(): Long = this.currentQueryPerformanceCounter

    public operator fun component9(): UInt = this.currentHardwareFrameNumber

    public operator fun component10(): UInt = this.currentHardwareMicroFrameNumber

    public operator fun component11(): UInt = this.currentUSBFrameNumber

    public fun copy(timeTrackingHandle: Handle = this.timeTrackingHandle, inputFrameNumber: UInt = this.inputFrameNumber, inputMicroFrameNumber: UInt = this.inputMicroFrameNumber, queryPerformanceCounterAtInputFrameOrMicroFrame: Long = this.queryPerformanceCounterAtInputFrameOrMicroFrame, queryPerformanceCounterFrequency: Long = this.queryPerformanceCounterFrequency, predictedAccuracyInMicroSeconds: UInt = this.predictedAccuracyInMicroSeconds, currentGenerationID: UInt = this.currentGenerationID, currentQueryPerformanceCounter: Long = this.currentQueryPerformanceCounter, currentHardwareFrameNumber: UInt = this.currentHardwareFrameNumber, currentHardwareMicroFrameNumber: UInt = this.currentHardwareMicroFrameNumber, currentUSBFrameNumber: UInt = this.currentUSBFrameNumber): UsbFrameNumberAndQpcForTimeSyncInformation = UsbFrameNumberAndQpcForTimeSyncInformation(timeTrackingHandleCtorArg = timeTrackingHandle, inputFrameNumber = inputFrameNumber, inputMicroFrameNumber = inputMicroFrameNumber, queryPerformanceCounterAtInputFrameOrMicroFrame = queryPerformanceCounterAtInputFrameOrMicroFrame, queryPerformanceCounterFrequency = queryPerformanceCounterFrequency, predictedAccuracyInMicroSeconds = predictedAccuracyInMicroSeconds, currentGenerationID = currentGenerationID, currentQueryPerformanceCounter = currentQueryPerformanceCounter, currentHardwareFrameNumber = currentHardwareFrameNumber, currentHardwareMicroFrameNumber = currentHardwareMicroFrameNumber, currentUSBFrameNumber = currentUSBFrameNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbFrameNumberAndQpcForTimeSyncInformation) return false
        if (this.timeTrackingHandle != other.timeTrackingHandle) return false
        if (this.inputFrameNumber != other.inputFrameNumber) return false
        if (this.inputMicroFrameNumber != other.inputMicroFrameNumber) return false
        if (this.queryPerformanceCounterAtInputFrameOrMicroFrame != other.queryPerformanceCounterAtInputFrameOrMicroFrame) return false
        if (this.queryPerformanceCounterFrequency != other.queryPerformanceCounterFrequency) return false
        if (this.predictedAccuracyInMicroSeconds != other.predictedAccuracyInMicroSeconds) return false
        if (this.currentGenerationID != other.currentGenerationID) return false
        if (this.currentQueryPerformanceCounter != other.currentQueryPerformanceCounter) return false
        if (this.currentHardwareFrameNumber != other.currentHardwareFrameNumber) return false
        if (this.currentHardwareMicroFrameNumber != other.currentHardwareMicroFrameNumber) return false
        if (this.currentUSBFrameNumber != other.currentUSBFrameNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeTrackingHandle.hashCode()
        result = 31 * result + this.inputFrameNumber.hashCode()
        result = 31 * result + this.inputMicroFrameNumber.hashCode()
        result = 31 * result + this.queryPerformanceCounterAtInputFrameOrMicroFrame.hashCode()
        result = 31 * result + this.queryPerformanceCounterFrequency.hashCode()
        result = 31 * result + this.predictedAccuracyInMicroSeconds.hashCode()
        result = 31 * result + this.currentGenerationID.hashCode()
        result = 31 * result + this.currentQueryPerformanceCounter.hashCode()
        result = 31 * result + this.currentHardwareFrameNumber.hashCode()
        result = 31 * result + this.currentHardwareMicroFrameNumber.hashCode()
        result = 31 * result + this.currentUSBFrameNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timeTrackingHandle: Handle = MutPtr(0L),
            inputFrameNumber: UInt = 0u,
            inputMicroFrameNumber: UInt = 0u,
            queryPerformanceCounterAtInputFrameOrMicroFrame: Long = 0L,
            queryPerformanceCounterFrequency: Long = 0L,
            predictedAccuracyInMicroSeconds: UInt = 0u,
            currentGenerationID: UInt = 0u,
            currentQueryPerformanceCounter: Long = 0L,
            currentHardwareFrameNumber: UInt = 0u,
            currentHardwareMicroFrameNumber: UInt = 0u,
            currentUSBFrameNumber: UInt = 0u,
        ): UsbFrameNumberAndQpcForTimeSyncInformation =
            UsbFrameNumberAndQpcForTimeSyncInformation(
                timeTrackingHandleCtorArg = timeTrackingHandle,
                inputFrameNumber = inputFrameNumber,
                inputMicroFrameNumber = inputMicroFrameNumber,
                queryPerformanceCounterAtInputFrameOrMicroFrame = queryPerformanceCounterAtInputFrameOrMicroFrame,
                queryPerformanceCounterFrequency = queryPerformanceCounterFrequency,
                predictedAccuracyInMicroSeconds = predictedAccuracyInMicroSeconds,
                currentGenerationID = currentGenerationID,
                currentQueryPerformanceCounter = currentQueryPerformanceCounter,
                currentHardwareFrameNumber = currentHardwareFrameNumber,
                currentHardwareMicroFrameNumber = currentHardwareMicroFrameNumber,
                currentUSBFrameNumber = currentUSBFrameNumber,
            )
    }
}

public data class UsbFunctionSuspendOptions(
    public var asUchar: UByte = 0u,
    public var anonymous: UsbFunctionSuspendOptions0 = UsbFunctionSuspendOptions0(),
)

public data class UsbFunctionSuspendOptions0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbFunctionSuspendOptions0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbFunctionSuspendOptions0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): UsbFunctionSuspendOptions0 =
                    UsbFunctionSuspendOptions0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbFunctionSuspendOptions0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHcdDriverkeyName(
    public var actualLength: UInt = 0u,
    public var driverKeyName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHcdDriverkeyName) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.driverKeyName.contentEquals(other.driverKeyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.actualLength.hashCode()
        result = 31 * result + this.driverKeyName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHcdDriverkeyName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHcdDriverkeyName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): UsbHcdDriverkeyName =
                    UsbHcdDriverkeyName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbHcdDriverkeyName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.actualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.driverKeyName.toList())
                }
            }
    }
}

public data class UsbHighSpeedMaxpacket(
    public var us: UShort = 0u,
)

public data class UsbHighSpeedMaxpacket0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHighSpeedMaxpacket0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHighSpeedMaxpacket0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbHighSpeedMaxpacket0 =
                    UsbHighSpeedMaxpacket0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbHighSpeedMaxpacket0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHub30PortRemoteWakeMask(
    public var asUchar8: UByte = 0u,
    public var anonymous: UsbHub30PortRemoteWakeMask0 = UsbHub30PortRemoteWakeMask0(),
)

public data class UsbHub30PortRemoteWakeMask0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHub30PortRemoteWakeMask0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHub30PortRemoteWakeMask0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): UsbHub30PortRemoteWakeMask0 =
                    UsbHub30PortRemoteWakeMask0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbHub30PortRemoteWakeMask0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHubCapabilities(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubCapabilities> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbHubCapabilities =
                    UsbHubCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbHubCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHubCapabilitiesEx(
    public var capabilityFlags: UsbHubCapFlags = UsbHubCapFlags(),
)

public data class UsbHubCapFlags(
    public var ul: UInt = 0u,
    public var anonymous: UsbHubCapFlags0 = UsbHubCapFlags0(),
)

public data class UsbHubCapFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubCapFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubCapFlags0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbHubCapFlags0 =
                    UsbHubCapFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbHubCapFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHubChange(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbHubChange0 = UsbHubChange0(),
)

public data class UsbHubChange0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubChange0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubChange0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbHubChange0 =
                    UsbHubChange0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbHubChange0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHubDescriptor(
    public var bDescriptorLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bNumberOfPorts: UByte = 0u,
    public var wHubCharacteristics: UShort = 0u,
    public var bPowerOnToPowerGood: UByte = 0u,
    public var bHubControlCurrent: UByte = 0u,
    public var bRemoveAndPowerMask: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHubDescriptor) return false
        if (this.bDescriptorLength != other.bDescriptorLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (this.bNumberOfPorts != other.bNumberOfPorts) return false
        if (this.wHubCharacteristics != other.wHubCharacteristics) return false
        if (this.bPowerOnToPowerGood != other.bPowerOnToPowerGood) return false
        if (this.bHubControlCurrent != other.bHubControlCurrent) return false
        if (!this.bRemoveAndPowerMask.contentEquals(other.bRemoveAndPowerMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bDescriptorLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bNumberOfPorts.hashCode()
        result = 31 * result + this.wHubCharacteristics.hashCode()
        result = 31 * result + this.bPowerOnToPowerGood.hashCode()
        result = 31 * result + this.bHubControlCurrent.hashCode()
        result = 31 * result + this.bRemoveAndPowerMask.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 71L
                override fun readNative(addr: Long): UsbHubDescriptor =
                    UsbHubDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 7L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UsbHubDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bDescriptorLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bNumberOfPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 3L, value.wHubCharacteristics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bPowerOnToPowerGood)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bHubControlCurrent)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 7L, value.bRemoveAndPowerMask.toList())
                }
            }
    }
}

public data class UsbHubDeviceInfo(
    public var hubDescriptor: UsbHubDescriptor = UsbHubDescriptor(),
    public var hubNumber: UInt = 0u,
    public var deviceAddress: UShort = 0u,
    public var hubIsSelfPowered: Boolean = false,
    public var hubIsRootHub: Boolean = false,
    public var hubCapabilities: UsbHubCapabilities = UsbHubCapabilities(),
    public var numberOfHubPorts: UInt = 0u,
    public var portInfo: List<UsbHubPortInformation> = List(1) { UsbHubPortInformation() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubDeviceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubDeviceInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 103L
                override fun readNative(addr: Long): UsbHubDeviceInfo =
                    UsbHubDeviceInfo(
                        (UsbHubDescriptor.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 71L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 75L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 77L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 78L),
                        (UsbHubCapabilities.typeLayout()).readNative(addr + 79L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 83L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbHubPortInformation.typeLayout(), (1).toInt())
                        ).readNative(addr + 87L),
                    )
                override fun writeNative(addr: Long, value: UsbHubDeviceInfo) {
                    (UsbHubDescriptor.typeLayout()).writeNative(addr, value.hubDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 71L, value.hubNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 75L, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 77L, value.hubIsSelfPowered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 78L, value.hubIsRootHub)
                    (UsbHubCapabilities.typeLayout()).writeNative(addr + 79L, value.hubCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 83L, value.numberOfHubPorts)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbHubPortInformation.typeLayout(), (1).toInt())
                    ).writeNative(addr + 87L, value.portInfo)
                }
            }
    }
}

public data class UsbHubDeviceUxdSettings(
    public var version: UInt = 0u,
    public var pnpGuid: Guid = Guid(),
    public var ownerGuid: Guid = Guid(),
    public var deleteOnShutdown: UInt = 0u,
    public var deleteOnReload: UInt = 0u,
    public var deleteOnDisconnect: UInt = 0u,
    public var reserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHubDeviceUxdSettings) return false
        if (this.version != other.version) return false
        if (this.pnpGuid != other.pnpGuid) return false
        if (this.ownerGuid != other.ownerGuid) return false
        if (this.deleteOnShutdown != other.deleteOnShutdown) return false
        if (this.deleteOnReload != other.deleteOnReload) return false
        if (this.deleteOnDisconnect != other.deleteOnDisconnect) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.pnpGuid.hashCode()
        result = 31 * result + this.ownerGuid.hashCode()
        result = 31 * result + this.deleteOnShutdown.hashCode()
        result = 31 * result + this.deleteOnReload.hashCode()
        result = 31 * result + this.deleteOnDisconnect.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class UsbHubInformation(
    public var hubDescriptor: UsbHubDescriptor = UsbHubDescriptor(),
    public var hubIsBusPowered: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): UsbHubInformation =
                    UsbHubInformation(
                        (UsbHubDescriptor.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 71L),
                    )
                override fun writeNative(addr: Long, value: UsbHubInformation) {
                    (UsbHubDescriptor.typeLayout()).writeNative(addr, value.hubDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 71L, value.hubIsBusPowered)
                }
            }
    }
}

public data class UsbHubInformationEx(
    public var hubType: UsbHubType = 0,
    public var highestPortNumber: UShort = 0u,
    public var u: UsbHubInformationEx0 = UsbHubInformationEx0(),
)

public data class UsbHubInformationEx0(
    public var usbHubDescriptor: UsbHubDescriptor = UsbHubDescriptor(),
    public var usb30HubDescriptor: Usb30HubDescriptor = Usb30HubDescriptor(),
)

public data class UsbHubName(
    public var actualLength: UInt = 0u,
    public var hubName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbHubName) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.hubName.contentEquals(other.hubName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.actualLength.hashCode()
        result = 31 * result + this.hubName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): UsbHubName =
                    UsbHubName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbHubName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.actualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.hubName.toList())
                }
            }
    }
}

public data class UsbHubPortInformation(
    public var deviceState: UsbDeviceState = UsbDeviceState(),
    public var portNumber: UShort = 0u,
    public var deviceAddress: UShort = 0u,
    public var connectionIndex: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubPortInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubPortInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UsbHubPortInformation =
                    UsbHubPortInformation(
                        (UsbDeviceState.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UsbHubPortInformation) {
                    (UsbDeviceState.typeLayout()).writeNative(addr, value.deviceState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.connectionIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.connectionStatus)
                }
            }
    }
}

public data class UsbHubStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbHubStatus0 = UsbHubStatus0(),
)

public data class UsbHubStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbHubStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbHubStatus0 =
                    UsbHubStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbHubStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbHubStatusAndChange(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbHubStatusAndChange0 = UsbHubStatusAndChange0(),
)

public data class UsbHubStatusAndChange0(
    public var hubStatus: UsbHubStatus = UsbHubStatus(),
    public var hubChange: UsbHubChange = UsbHubChange(),
)

public class UsbIdleCallbackInfo internal constructor(
    public var idleCallback: UsbIdleCallback,
    idleContextCtorArg: MutPtr<CVoid>,
) {
    public var idleContext: MutPtr<CVoid> = idleContextCtorArg
        internal set

    public constructor() : this(
        idleCallback = null,
        idleContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UsbIdleCallback = this.idleCallback

    public operator fun component2(): MutPtr<CVoid> = this.idleContext

    public fun copy(idleCallback: UsbIdleCallback = this.idleCallback, idleContext: MutPtr<CVoid> = this.idleContext): UsbIdleCallbackInfo = UsbIdleCallbackInfo(idleCallback = idleCallback, idleContextCtorArg = idleContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbIdleCallbackInfo) return false
        if (this.idleCallback != other.idleCallback) return false
        if (this.idleContext != other.idleContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.idleCallback.hashCode()
        result = 31 * result + this.idleContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            idleCallback: UsbIdleCallback = null,
            idleContext: MutPtr<CVoid> = MutPtr(0L),
        ): UsbIdleCallbackInfo =
            UsbIdleCallbackInfo(
                idleCallback = idleCallback,
                idleContextCtorArg = idleContext,
            )
    }
}

public class UsbIdString internal constructor(
    public var languageId: UShort,
    public var pad: UShort,
    public var lengthInBytes: UInt,
    bufferCtorArg: Pwstr,
) {
    public var buffer: Pwstr = bufferCtorArg
        internal set

    public constructor() : this(
        languageId = 0u,
        pad = 0u,
        lengthInBytes = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.languageId

    public operator fun component2(): UShort = this.pad

    public operator fun component3(): UInt = this.lengthInBytes

    public operator fun component4(): Pwstr = this.buffer

    public fun copy(languageId: UShort = this.languageId, pad: UShort = this.pad, lengthInBytes: UInt = this.lengthInBytes, buffer: Pwstr = this.buffer): UsbIdString = UsbIdString(languageId = languageId, pad = pad, lengthInBytes = lengthInBytes, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbIdString) return false
        if (this.languageId != other.languageId) return false
        if (this.pad != other.pad) return false
        if (this.lengthInBytes != other.lengthInBytes) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.languageId.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.lengthInBytes.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            languageId: UShort = 0u,
            pad: UShort = 0u,
            lengthInBytes: UInt = 0u,
            buffer: Pwstr = MutPtr(0L),
        ): UsbIdString =
            UsbIdString(
                languageId = languageId,
                pad = pad,
                lengthInBytes = lengthInBytes,
                bufferCtorArg = buffer,
            )
    }
}

public data class UsbInterfaceAssociationDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bFirstInterface: UByte = 0u,
    public var bInterfaceCount: UByte = 0u,
    public var bFunctionClass: UByte = 0u,
    public var bFunctionSubClass: UByte = 0u,
    public var bFunctionProtocol: UByte = 0u,
    public var iFunction: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfaceAssociationDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfaceAssociationDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbInterfaceAssociationDescriptor =
                    UsbInterfaceAssociationDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: UsbInterfaceAssociationDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bFirstInterface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bInterfaceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bFunctionClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bFunctionSubClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bFunctionProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.iFunction)
                }
            }
    }
}

public data class UsbInterfaceDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bInterfaceNumber: UByte = 0u,
    public var bAlternateSetting: UByte = 0u,
    public var bNumEndpoints: UByte = 0u,
    public var bInterfaceClass: UByte = 0u,
    public var bInterfaceSubClass: UByte = 0u,
    public var bInterfaceProtocol: UByte = 0u,
    public var iInterface: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfaceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfaceDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): UsbInterfaceDescriptor =
                    UsbInterfaceDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbInterfaceDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bInterfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bAlternateSetting)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bNumEndpoints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bInterfaceClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bInterfaceSubClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bInterfaceProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.iInterface)
                }
            }
    }
}

public data class UsbInterfacePowerDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bmCapabilitiesFlags: UByte = 0u,
    public var bBusPowerSavingD1: UByte = 0u,
    public var bSelfPowerSavingD1: UByte = 0u,
    public var bBusPowerSavingD2: UByte = 0u,
    public var bSelfPowerSavingD2: UByte = 0u,
    public var bBusPowerSavingD3: UByte = 0u,
    public var bSelfPowerSavingD3: UByte = 0u,
    public var transitionTimeFromD1: UShort = 0u,
    public var transitionTimeFromD2: UShort = 0u,
    public var transitionTimeFromD3: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfacePowerDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfacePowerDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 15L
                override fun readNative(addr: Long): UsbInterfacePowerDescriptor =
                    UsbInterfacePowerDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: UsbInterfacePowerDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bmCapabilitiesFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bBusPowerSavingD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bSelfPowerSavingD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bBusPowerSavingD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bSelfPowerSavingD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bBusPowerSavingD3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bSelfPowerSavingD3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 9L, value.transitionTimeFromD1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 11L, value.transitionTimeFromD2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 13L, value.transitionTimeFromD3)
                }
            }
    }
}

public data class UsbInterfaceStatus(
    public var asUshort16: UShort = 0u,
    public var anonymous: UsbInterfaceStatus0 = UsbInterfaceStatus0(),
)

public data class UsbInterfaceStatus0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfaceStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbInterfaceStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): UsbInterfaceStatus0 =
                    UsbInterfaceStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbInterfaceStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbMiParentInformation(
    public var numberOfInterfaces: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbMiParentInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbMiParentInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbMiParentInformation =
                    UsbMiParentInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbMiParentInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfInterfaces)
                }
            }
    }
}

public data class UsbNodeConnectionAttributes(
    public var connectionIndex: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var portAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionAttributes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): UsbNodeConnectionAttributes =
                    UsbNodeConnectionAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbNodeConnectionAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.connectionStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.portAttributes)
                }
            }
    }
}

public data class UsbNodeConnectionDriverkeyName(
    public var connectionIndex: UInt = 0u,
    public var actualLength: UInt = 0u,
    public var driverKeyName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbNodeConnectionDriverkeyName) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.driverKeyName.contentEquals(other.driverKeyName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.actualLength.hashCode()
        result = 31 * result + this.driverKeyName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionDriverkeyName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionDriverkeyName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): UsbNodeConnectionDriverkeyName =
                    UsbNodeConnectionDriverkeyName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbNodeConnectionDriverkeyName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.actualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.driverKeyName.toList())
                }
            }
    }
}

public data class UsbNodeConnectionInformation(
    public var connectionIndex: UInt = 0u,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var lowSpeed: Boolean = false,
    public var deviceIsHub: Boolean = false,
    public var deviceAddress: UShort = 0u,
    public var numberOfOpenPipes: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var pipeList: List<UsbPipeInfo> = List(1) { UsbPipeInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 46L
                override fun readNative(addr: Long): UsbNodeConnectionInformation =
                    UsbNodeConnectionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (UsbDeviceDescriptor.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 31L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbPipeInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 35L),
                    )
                override fun writeNative(addr: Long, value: UsbNodeConnectionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (UsbDeviceDescriptor.typeLayout()).writeNative(addr + 4L, value.deviceDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.currentConfigurationValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 23L, value.lowSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 24L, value.deviceIsHub)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 25L, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 27L, value.numberOfOpenPipes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 31L, value.connectionStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbPipeInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 35L, value.pipeList)
                }
            }
    }
}

public data class UsbNodeConnectionInformationEx(
    public var connectionIndex: UInt = 0u,
    public var deviceDescriptor: UsbDeviceDescriptor = UsbDeviceDescriptor(),
    public var currentConfigurationValue: UByte = 0u,
    public var speed: UByte = 0u,
    public var deviceIsHub: Boolean = false,
    public var deviceAddress: UShort = 0u,
    public var numberOfOpenPipes: UInt = 0u,
    public var connectionStatus: UsbConnectionStatus = 0,
    public var pipeList: List<UsbPipeInfo> = List(1) { UsbPipeInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionInformationEx> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 46L
                override fun readNative(addr: Long): UsbNodeConnectionInformationEx =
                    UsbNodeConnectionInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (UsbDeviceDescriptor.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 31L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbPipeInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 35L),
                    )
                override fun writeNative(addr: Long, value: UsbNodeConnectionInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (UsbDeviceDescriptor.typeLayout()).writeNative(addr + 4L, value.deviceDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.currentConfigurationValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 24L, value.deviceIsHub)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 25L, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 27L, value.numberOfOpenPipes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 31L, value.connectionStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbPipeInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 35L, value.pipeList)
                }
            }
    }
}

public data class UsbNodeConnectionInformationExV2(
    public var connectionIndex: UInt = 0u,
    public var length: UInt = 0u,
    public var supportedUsbProtocols: UsbProtocols = UsbProtocols(),
    public var flags: UsbNodeConnectionInformationExV2Flags = UsbNodeConnectionInformationExV2Flags(),
)

public data class UsbNodeConnectionInformationExV2Flags(
    public var ul: UInt = 0u,
    public var anonymous: UsbNodeConnectionInformationExV2Flags0 = UsbNodeConnectionInformationExV2Flags0(),
)

public data class UsbNodeConnectionInformationExV2Flags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionInformationExV2Flags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionInformationExV2Flags0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbNodeConnectionInformationExV2Flags0 =
                    UsbNodeConnectionInformationExV2Flags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbNodeConnectionInformationExV2Flags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbNodeConnectionName(
    public var connectionIndex: UInt = 0u,
    public var actualLength: UInt = 0u,
    public var nodeName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbNodeConnectionName) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.nodeName.contentEquals(other.nodeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.actualLength.hashCode()
        result = 31 * result + this.nodeName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNodeConnectionName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): UsbNodeConnectionName =
                    UsbNodeConnectionName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbNodeConnectionName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.connectionIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.actualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.nodeName.toList())
                }
            }
    }
}

public data class UsbNodeInformation(
    public var nodeType: UsbHubNode = 0,
    public var u: UsbNodeInformation0 = UsbNodeInformation0(),
)

public data class UsbNodeInformation0(
    public var hubInformation: UsbHubInformation = UsbHubInformation(),
    public var miParentInformation: UsbMiParentInformation = UsbMiParentInformation(),
)

public data class UsbNotification(
    public var notificationType: UsbNotificationType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbNotification> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbNotification =
                    UsbNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.notificationType)
                }
            }
    }
}

public data class UsbOpenRawDeviceParameters(
    public var portStatus: UShort = 0u,
    public var maxPacketEp0: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbOpenRawDeviceParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbOpenRawDeviceParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbOpenRawDeviceParameters =
                    UsbOpenRawDeviceParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: UsbOpenRawDeviceParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.portStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maxPacketEp0)
                }
            }
    }
}

public data class UsbPassThruParameters(
    public var functionGUID: Guid = Guid(),
    public var parameterLength: UInt = 0u,
    public var parameters: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbPassThruParameters) return false
        if (this.functionGUID != other.functionGUID) return false
        if (this.parameterLength != other.parameterLength) return false
        if (!this.parameters.contentEquals(other.parameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.functionGUID.hashCode()
        result = 31 * result + this.parameterLength.hashCode()
        result = 31 * result + this.parameters.contentHashCode()
        return result
    }
}

public data class UsbPipeInfo(
    public var endpointDescriptor: UsbEndpointDescriptor = UsbEndpointDescriptor(),
    public var scheduleOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPipeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPipeInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 11L
                override fun readNative(addr: Long): UsbPipeInfo =
                    UsbPipeInfo(
                        (UsbEndpointDescriptor.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: UsbPipeInfo) {
                    (UsbEndpointDescriptor.typeLayout()).writeNative(addr, value.endpointDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 7L, value.scheduleOffset)
                }
            }
    }
}

public data class UsbPortChange(
    public var asUshort16: UShort = 0u,
    public var usb20PortChange: Usb20PortChange = Usb20PortChange(),
    public var usb30PortChange: Usb30PortChange = Usb30PortChange(),
)

public data class UsbPortConnectorProperties(
    public var connectionIndex: UInt = 0u,
    public var actualLength: UInt = 0u,
    public var usbPortProperties: UsbPortProperties = UsbPortProperties(),
    public var companionIndex: UShort = 0u,
    public var companionPortNumber: UShort = 0u,
    public var companionHubSymbolicLinkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbPortConnectorProperties) return false
        if (this.connectionIndex != other.connectionIndex) return false
        if (this.actualLength != other.actualLength) return false
        if (this.usbPortProperties != other.usbPortProperties) return false
        if (this.companionIndex != other.companionIndex) return false
        if (this.companionPortNumber != other.companionPortNumber) return false
        if (!this.companionHubSymbolicLinkName.contentEquals(other.companionHubSymbolicLinkName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionIndex.hashCode()
        result = 31 * result + this.actualLength.hashCode()
        result = 31 * result + this.usbPortProperties.hashCode()
        result = 31 * result + this.companionIndex.hashCode()
        result = 31 * result + this.companionPortNumber.hashCode()
        result = 31 * result + this.companionHubSymbolicLinkName.contentHashCode()
        return result
    }
}

public data class UsbPortExtStatus(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbPortExtStatus0 = UsbPortExtStatus0(),
)

public data class UsbPortExtStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPortExtStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPortExtStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbPortExtStatus0 =
                    UsbPortExtStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbPortExtStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbPortExtStatusAndChange(
    public var asUlong64: ULong = 0uL,
    public var anonymous: UsbPortExtStatusAndChange0 = UsbPortExtStatusAndChange0(),
)

public data class UsbPortExtStatusAndChange0(
    public var portStatusChange: UsbPortStatusAndChange = UsbPortStatusAndChange(),
    public var portExtStatus: UsbPortExtStatus = UsbPortExtStatus(),
)

public data class UsbPortProperties(
    public var ul: UInt = 0u,
    public var anonymous: UsbPortProperties0 = UsbPortProperties0(),
)

public data class UsbPortProperties0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPortProperties0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPortProperties0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbPortProperties0 =
                    UsbPortProperties0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbPortProperties0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbPortStatus(
    public var asUshort16: UShort = 0u,
    public var usb20PortStatus: Usb20PortStatus = Usb20PortStatus(),
    public var usb30PortStatus: Usb30PortStatus = Usb30PortStatus(),
)

public data class UsbPortStatusAndChange(
    public var asUlong32: UInt = 0u,
    public var anonymous: UsbPortStatusAndChange0 = UsbPortStatusAndChange0(),
)

public data class UsbPortStatusAndChange0(
    public var portStatus: UsbPortStatus = UsbPortStatus(),
    public var portChange: UsbPortChange = UsbPortChange(),
)

public data class UsbPowerInfo(
    public var systemState: WdmusbPowerState = 0,
    public var hcDevicePowerState: WdmusbPowerState = 0,
    public var hcDeviceWake: WdmusbPowerState = 0,
    public var hcSystemWake: WdmusbPowerState = 0,
    public var rhDevicePowerState: WdmusbPowerState = 0,
    public var rhDeviceWake: WdmusbPowerState = 0,
    public var rhSystemWake: WdmusbPowerState = 0,
    public var lastSystemSleepState: WdmusbPowerState = 0,
    public var canWakeup: Boolean = false,
    public var isPowered: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPowerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbPowerInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 34L
                override fun readNative(addr: Long): UsbPowerInfo =
                    UsbPowerInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 33L),
                    )
                override fun writeNative(addr: Long, value: UsbPowerInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.systemState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.hcDevicePowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hcDeviceWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.hcSystemWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.rhDevicePowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.rhDeviceWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.rhSystemWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.lastSystemSleepState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 32L, value.canWakeup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 33L, value.isPowered)
                }
            }
    }
}

public data class UsbProtocols(
    public var ul: UInt = 0u,
    public var anonymous: UsbProtocols0 = UsbProtocols0(),
)

public data class UsbProtocols0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbProtocols0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbProtocols0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbProtocols0 =
                    UsbProtocols0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbProtocols0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbRootHubName(
    public var actualLength: UInt = 0u,
    public var rootHubName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbRootHubName) return false
        if (this.actualLength != other.actualLength) return false
        if (!this.rootHubName.contentEquals(other.rootHubName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.actualLength.hashCode()
        result = 31 * result + this.rootHubName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbRootHubName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbRootHubName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): UsbRootHubName =
                    UsbRootHubName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbRootHubName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.actualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.rootHubName.toList())
                }
            }
    }
}

public data class UsbSendRawCommandParameters(
    public var usbBmRequest: UByte = 0u,
    public var usbBRequest: UByte = 0u,
    public var usbWVlaue: UShort = 0u,
    public var usbWIndex: UShort = 0u,
    public var usbWLength: UShort = 0u,
    public var deviceAddress: UShort = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var timeout: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var usbdStatusCode: Int = 0,
    public var data: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbSendRawCommandParameters) return false
        if (this.usbBmRequest != other.usbBmRequest) return false
        if (this.usbBRequest != other.usbBRequest) return false
        if (this.usbWVlaue != other.usbWVlaue) return false
        if (this.usbWIndex != other.usbWIndex) return false
        if (this.usbWLength != other.usbWLength) return false
        if (this.deviceAddress != other.deviceAddress) return false
        if (this.maximumPacketSize != other.maximumPacketSize) return false
        if (this.timeout != other.timeout) return false
        if (this.dataLength != other.dataLength) return false
        if (this.usbdStatusCode != other.usbdStatusCode) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usbBmRequest.hashCode()
        result = 31 * result + this.usbBRequest.hashCode()
        result = 31 * result + this.usbWVlaue.hashCode()
        result = 31 * result + this.usbWIndex.hashCode()
        result = 31 * result + this.usbWLength.hashCode()
        result = 31 * result + this.deviceAddress.hashCode()
        result = 31 * result + this.maximumPacketSize.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.usbdStatusCode.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSendRawCommandParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSendRawCommandParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): UsbSendRawCommandParameters =
                    UsbSendRawCommandParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UsbSendRawCommandParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.usbBmRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.usbBRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usbWVlaue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usbWIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usbWLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.deviceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.maximumPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.usbdStatusCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 24L, value.data.toList())
                }
            }
    }
}

public class UsbStartTrackingForTimeSyncInformation internal constructor(
    timeTrackingHandleCtorArg: Handle,
    public var isStartupDelayTolerable: Boolean,
) {
    public var timeTrackingHandle: Handle = timeTrackingHandleCtorArg
        internal set

    public constructor() : this(
        timeTrackingHandleCtorArg = MutPtr(0L),
        isStartupDelayTolerable = false,
    )

    public operator fun component1(): Handle = this.timeTrackingHandle

    public operator fun component2(): Boolean = this.isStartupDelayTolerable

    public fun copy(timeTrackingHandle: Handle = this.timeTrackingHandle, isStartupDelayTolerable: Boolean = this.isStartupDelayTolerable): UsbStartTrackingForTimeSyncInformation = UsbStartTrackingForTimeSyncInformation(timeTrackingHandleCtorArg = timeTrackingHandle, isStartupDelayTolerable = isStartupDelayTolerable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbStartTrackingForTimeSyncInformation) return false
        if (this.timeTrackingHandle != other.timeTrackingHandle) return false
        if (this.isStartupDelayTolerable != other.isStartupDelayTolerable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeTrackingHandle.hashCode()
        result = 31 * result + this.isStartupDelayTolerable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timeTrackingHandle: Handle = MutPtr(0L),
            isStartupDelayTolerable: Boolean = false,
        ): UsbStartTrackingForTimeSyncInformation =
            UsbStartTrackingForTimeSyncInformation(
                timeTrackingHandleCtorArg = timeTrackingHandle,
                isStartupDelayTolerable = isStartupDelayTolerable,
            )
    }
}

public class UsbStopTrackingForTimeSyncInformation internal constructor(
    timeTrackingHandleCtorArg: Handle,
) {
    public var timeTrackingHandle: Handle = timeTrackingHandleCtorArg
        internal set

    public constructor() : this(
        timeTrackingHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.timeTrackingHandle

    public fun copy(timeTrackingHandle: Handle = this.timeTrackingHandle): UsbStopTrackingForTimeSyncInformation = UsbStopTrackingForTimeSyncInformation(timeTrackingHandleCtorArg = timeTrackingHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbStopTrackingForTimeSyncInformation) return false
        if (this.timeTrackingHandle != other.timeTrackingHandle) return false
        return true
    }

    override fun hashCode(): Int = this.timeTrackingHandle.hashCode()

    public companion object {
        public operator fun invoke(
            timeTrackingHandle: Handle = MutPtr(0L),
        ): UsbStopTrackingForTimeSyncInformation =
            UsbStopTrackingForTimeSyncInformation(
                timeTrackingHandleCtorArg = timeTrackingHandle,
            )
    }
}

public data class UsbStringDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bString: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbStringDescriptor) return false
        if (this.bLength != other.bLength) return false
        if (this.bDescriptorType != other.bDescriptorType) return false
        if (!this.bString.contentEquals(other.bString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bLength.hashCode()
        result = 31 * result + this.bDescriptorType.hashCode()
        result = 31 * result + this.bString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbStringDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbStringDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UsbStringDescriptor =
                    UsbStringDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbStringDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.bString.toList())
                }
            }
    }
}

public data class UsbSuperspeedplusIsochEndpointCompanionDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var wReserved: UShort = 0u,
    public var dwBytesPerInterval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSuperspeedplusIsochEndpointCompanionDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSuperspeedplusIsochEndpointCompanionDescriptor> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbSuperspeedplusIsochEndpointCompanionDescriptor =
                    UsbSuperspeedplusIsochEndpointCompanionDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UsbSuperspeedplusIsochEndpointCompanionDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bDescriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBytesPerInterval)
                }
            }
    }
}

public data class UsbSuperspeedEndpointCompanionDescriptor(
    public var bLength: UByte = 0u,
    public var bDescriptorType: UByte = 0u,
    public var bMaxBurst: UByte = 0u,
    public var bmAttributes: UsbSuperspeedEndpointCompanionDescriptor0 = UsbSuperspeedEndpointCompanionDescriptor0(),
    public var wBytesPerInterval: UShort = 0u,
)

public data class UsbSuperspeedEndpointCompanionDescriptor0(
    public var asUchar: UByte = 0u,
    public var bulk: UsbSuperspeedEndpointCompanionDescriptor00 = UsbSuperspeedEndpointCompanionDescriptor00(),
    public var isochronous: UsbSuperspeedEndpointCompanionDescriptor01 = UsbSuperspeedEndpointCompanionDescriptor01(),
)

public data class UsbSuperspeedEndpointCompanionDescriptor00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSuperspeedEndpointCompanionDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSuperspeedEndpointCompanionDescriptor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): UsbSuperspeedEndpointCompanionDescriptor00 =
                    UsbSuperspeedEndpointCompanionDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbSuperspeedEndpointCompanionDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbSuperspeedEndpointCompanionDescriptor01(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSuperspeedEndpointCompanionDescriptor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbSuperspeedEndpointCompanionDescriptor01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): UsbSuperspeedEndpointCompanionDescriptor01 =
                    UsbSuperspeedEndpointCompanionDescriptor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbSuperspeedEndpointCompanionDescriptor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class UsbTopologyAddress(
    public var pciBusNumber: UInt = 0u,
    public var pciDeviceNumber: UInt = 0u,
    public var pciFunctionNumber: UInt = 0u,
    public var reserved: UInt = 0u,
    public var rootHubPortNumber: UShort = 0u,
    public var hubPortNumber: UShortArray = UShortArray(5),
    public var reserved2: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbTopologyAddress) return false
        if (this.pciBusNumber != other.pciBusNumber) return false
        if (this.pciDeviceNumber != other.pciDeviceNumber) return false
        if (this.pciFunctionNumber != other.pciFunctionNumber) return false
        if (this.reserved != other.reserved) return false
        if (this.rootHubPortNumber != other.rootHubPortNumber) return false
        if (!this.hubPortNumber.contentEquals(other.hubPortNumber)) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pciBusNumber.hashCode()
        result = 31 * result + this.pciDeviceNumber.hashCode()
        result = 31 * result + this.pciFunctionNumber.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.rootHubPortNumber.hashCode()
        result = 31 * result + this.hubPortNumber.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTopologyAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTopologyAddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UsbTopologyAddress =
                    UsbTopologyAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (5).toInt())
                        ).readNative(addr + 18L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: UsbTopologyAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pciBusNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pciDeviceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pciFunctionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.rootHubPortNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (5).toInt())
                    ).writeNative(addr + 18L, value.hubPortNumber.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.reserved2)
                }
            }
    }
}

public data class UsbTransportCharacteristics(
    public var version: UInt = 0u,
    public var transportCharacteristicsFlags: UInt = 0u,
    public var currentRoundtripLatencyInMilliSeconds: ULong = 0uL,
    public var maxPotentialBandwidth: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristics> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UsbTransportCharacteristics =
                    UsbTransportCharacteristics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UsbTransportCharacteristics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.transportCharacteristicsFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.currentRoundtripLatencyInMilliSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxPotentialBandwidth)
                }
            }
    }
}

public class UsbTransportCharacteristicsChangeNotification internal constructor(
    handleCtorArg: UsbChangeRegistrationHandle,
    public var usbTransportCharacteristics: UsbTransportCharacteristics,
) {
    public var handle: UsbChangeRegistrationHandle = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        usbTransportCharacteristics = UsbTransportCharacteristics(),
    )

    public operator fun component1(): UsbChangeRegistrationHandle = this.handle

    public operator fun component2(): UsbTransportCharacteristics = this.usbTransportCharacteristics

    public fun copy(handle: UsbChangeRegistrationHandle = this.handle, usbTransportCharacteristics: UsbTransportCharacteristics = this.usbTransportCharacteristics): UsbTransportCharacteristicsChangeNotification = UsbTransportCharacteristicsChangeNotification(handleCtorArg = handle, usbTransportCharacteristics = usbTransportCharacteristics)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbTransportCharacteristicsChangeNotification) return false
        if (this.handle != other.handle) return false
        if (this.usbTransportCharacteristics != other.usbTransportCharacteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.usbTransportCharacteristics.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristicsChangeNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristicsChangeNotification> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UsbTransportCharacteristicsChangeNotification =
                    UsbTransportCharacteristicsChangeNotification(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (UsbTransportCharacteristics.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UsbTransportCharacteristicsChangeNotification) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.handle)
                    (UsbTransportCharacteristics.typeLayout()).writeNative(addr + 8L, value.usbTransportCharacteristics)
                }
            }

        public operator fun invoke(
            handle: UsbChangeRegistrationHandle = MutPtr(0L),
            usbTransportCharacteristics: UsbTransportCharacteristics = UsbTransportCharacteristics(),
        ): UsbTransportCharacteristicsChangeNotification =
            UsbTransportCharacteristicsChangeNotification(
                handleCtorArg = handle,
                usbTransportCharacteristics = usbTransportCharacteristics,
            )
    }
}

public class UsbTransportCharacteristicsChangeRegistration internal constructor(
    public var changeNotificationInputFlags: UInt,
    handleCtorArg: UsbChangeRegistrationHandle,
    public var usbTransportCharacteristics: UsbTransportCharacteristics,
) {
    public var handle: UsbChangeRegistrationHandle = handleCtorArg
        internal set

    public constructor() : this(
        changeNotificationInputFlags = 0u,
        handleCtorArg = MutPtr(0L),
        usbTransportCharacteristics = UsbTransportCharacteristics(),
    )

    public operator fun component1(): UInt = this.changeNotificationInputFlags

    public operator fun component2(): UsbChangeRegistrationHandle = this.handle

    public operator fun component3(): UsbTransportCharacteristics = this.usbTransportCharacteristics

    public fun copy(changeNotificationInputFlags: UInt = this.changeNotificationInputFlags, handle: UsbChangeRegistrationHandle = this.handle, usbTransportCharacteristics: UsbTransportCharacteristics = this.usbTransportCharacteristics): UsbTransportCharacteristicsChangeRegistration = UsbTransportCharacteristicsChangeRegistration(changeNotificationInputFlags = changeNotificationInputFlags, handleCtorArg = handle, usbTransportCharacteristics = usbTransportCharacteristics)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbTransportCharacteristicsChangeRegistration) return false
        if (this.changeNotificationInputFlags != other.changeNotificationInputFlags) return false
        if (this.handle != other.handle) return false
        if (this.usbTransportCharacteristics != other.usbTransportCharacteristics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.changeNotificationInputFlags.hashCode()
        result = 31 * result + this.handle.hashCode()
        result = 31 * result + this.usbTransportCharacteristics.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristicsChangeRegistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristicsChangeRegistration> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): UsbTransportCharacteristicsChangeRegistration =
                    UsbTransportCharacteristicsChangeRegistration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 4L),
                        (UsbTransportCharacteristics.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: UsbTransportCharacteristicsChangeRegistration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.changeNotificationInputFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 4L, value.handle)
                    (UsbTransportCharacteristics.typeLayout()).writeNative(addr + 12L, value.usbTransportCharacteristics)
                }
            }

        public operator fun invoke(
            changeNotificationInputFlags: UInt = 0u,
            handle: UsbChangeRegistrationHandle = MutPtr(0L),
            usbTransportCharacteristics: UsbTransportCharacteristics = UsbTransportCharacteristics(),
        ): UsbTransportCharacteristicsChangeRegistration =
            UsbTransportCharacteristicsChangeRegistration(
                changeNotificationInputFlags = changeNotificationInputFlags,
                handleCtorArg = handle,
                usbTransportCharacteristics = usbTransportCharacteristics,
            )
    }
}

public class UsbTransportCharacteristicsChangeUnregistration internal constructor(
    handleCtorArg: UsbChangeRegistrationHandle,
) {
    public var handle: UsbChangeRegistrationHandle = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UsbChangeRegistrationHandle = this.handle

    public fun copy(handle: UsbChangeRegistrationHandle = this.handle): UsbTransportCharacteristicsChangeUnregistration = UsbTransportCharacteristicsChangeUnregistration(handleCtorArg = handle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbTransportCharacteristicsChangeUnregistration) return false
        if (this.handle != other.handle) return false
        return true
    }

    override fun hashCode(): Int = this.handle.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristicsChangeUnregistration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbTransportCharacteristicsChangeUnregistration> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UsbTransportCharacteristicsChangeUnregistration =
                    UsbTransportCharacteristicsChangeUnregistration(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbTransportCharacteristicsChangeUnregistration) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.handle)
                }
            }

        public operator fun invoke(
            handle: UsbChangeRegistrationHandle = MutPtr(0L),
        ): UsbTransportCharacteristicsChangeUnregistration =
            UsbTransportCharacteristicsChangeUnregistration(
                handleCtorArg = handle,
            )
    }
}

public data class UsbUnicodeName(
    public var length: UInt = 0u,
    public var string: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbUnicodeName) return false
        if (this.length != other.length) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.string.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbUnicodeName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbUnicodeName> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): UsbUnicodeName =
                    UsbUnicodeName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UsbUnicodeName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.string.toList())
                }
            }
    }
}

public data class UsbUsb2hwVersionParameters(
    public var usb2HwRevision: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbUsb2hwVersionParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsbUsb2hwVersionParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): UsbUsb2hwVersionParameters =
                    UsbUsb2hwVersionParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UsbUsb2hwVersionParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.usb2HwRevision)
                }
            }
    }
}

public data class WinusbPipeInformation(
    public var pipeType: UsbdPipeType = 0,
    public var pipeId: UByte = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var interval: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinusbPipeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinusbPipeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): WinusbPipeInformation =
                    WinusbPipeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinusbPipeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pipeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.pipeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.maximumPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.interval)
                }
            }
    }
}

public data class WinusbPipeInformationEx(
    public var pipeType: UsbdPipeType = 0,
    public var pipeId: UByte = 0u,
    public var maximumPacketSize: UShort = 0u,
    public var interval: UByte = 0u,
    public var maximumBytesPerInterval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinusbPipeInformationEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinusbPipeInformationEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WinusbPipeInformationEx =
                    WinusbPipeInformationEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WinusbPipeInformationEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pipeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.pipeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.maximumPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.interval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maximumBytesPerInterval)
                }
            }
    }
}

public data class WinusbSetupPacket(
    public var requestType: UByte = 0u,
    public var request: UByte = 0u,
    public var value: UShort = 0u,
    public var index: UShort = 0u,
    public var length: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinusbSetupPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinusbSetupPacket> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WinusbSetupPacket =
                    WinusbSetupPacket(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WinusbSetupPacket) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.requestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.request)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.length)
                }
            }
    }
}

public class UrbBulkOrInterruptTransfer internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var transferFlags: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        transferFlags = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.transferFlags

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, transferFlags: UInt = this.transferFlags, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca): UrbBulkOrInterruptTransfer = UrbBulkOrInterruptTransfer(hdr = hdr, pipeHandleCtorArg = pipeHandle, transferFlags = transferFlags, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbBulkOrInterruptTransfer) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbBulkOrInterruptTransfer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbBulkOrInterruptTransfer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): UrbBulkOrInterruptTransfer =
                    UrbBulkOrInterruptTransfer(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: UrbBulkOrInterruptTransfer) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.transferFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            transferFlags: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
        ): UrbBulkOrInterruptTransfer =
            UrbBulkOrInterruptTransfer(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                transferFlags = transferFlags,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
            )
    }
}

public class UrbControlDescriptorRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var reserved0: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var reserved1: UShort,
    public var index: UByte,
    public var descriptorType: UByte,
    public var languageId: UShort,
    public var reserved2: UShort,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        reserved0 = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        reserved1 = 0u,
        index = 0u,
        descriptorType = 0u,
        languageId = 0u,
        reserved2 = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.reserved0

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UShort = this.reserved1

    public operator fun component10(): UByte = this.index

    public operator fun component11(): UByte = this.descriptorType

    public operator fun component12(): UShort = this.languageId

    public operator fun component13(): UShort = this.reserved2

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, reserved0: UInt = this.reserved0, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, reserved1: UShort = this.reserved1, index: UByte = this.index, descriptorType: UByte = this.descriptorType, languageId: UShort = this.languageId, reserved2: UShort = this.reserved2): UrbControlDescriptorRequest = UrbControlDescriptorRequest(hdr = hdr, reservedCtorArg = reserved, reserved0 = reserved0, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, reserved1 = reserved1, index = index, descriptorType = descriptorType, languageId = languageId, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlDescriptorRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.index != other.index) return false
        if (this.descriptorType != other.descriptorType) return false
        if (this.languageId != other.languageId) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.descriptorType.hashCode()
        result = 31 * result + this.languageId.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlDescriptorRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlDescriptorRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlDescriptorRequest =
                    UrbControlDescriptorRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 131L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                    )
                override fun writeNative(addr: Long, value: UrbControlDescriptorRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 128L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 130L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 131L, value.descriptorType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.languageId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.reserved2)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            reserved0: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            reserved1: UShort = 0u,
            index: UByte = 0u,
            descriptorType: UByte = 0u,
            languageId: UShort = 0u,
            reserved2: UShort = 0u,
        ): UrbControlDescriptorRequest =
            UrbControlDescriptorRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                reserved0 = reserved0,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                reserved1 = reserved1,
                index = index,
                descriptorType = descriptorType,
                languageId = languageId,
                reserved2 = reserved2,
            )
    }
}

public class UrbControlFeatureRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var reserved2: UInt,
    public var reserved3: UInt,
    reserved4CtorArg: MutPtr<CVoid>,
    reserved5CtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var reserved0: UShort,
    public var featureSelector: UShort,
    public var index: UShort,
    public var reserved1: UShort,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var reserved4: MutPtr<CVoid> = reserved4CtorArg
        internal set

    public var reserved5: MutPtr<CVoid> = reserved5CtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        reserved2 = 0u,
        reserved3 = 0u,
        reserved4CtorArg = MutPtr(0L),
        reserved5CtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        reserved0 = 0u,
        featureSelector = 0u,
        index = 0u,
        reserved1 = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.reserved2

    public operator fun component4(): UInt = this.reserved3

    public operator fun component5(): MutPtr<CVoid> = this.reserved4

    public operator fun component6(): MutPtr<CVoid> = this.reserved5

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UShort = this.reserved0

    public operator fun component10(): UShort = this.featureSelector

    public operator fun component11(): UShort = this.index

    public operator fun component12(): UShort = this.reserved1

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, reserved2: UInt = this.reserved2, reserved3: UInt = this.reserved3, reserved4: MutPtr<CVoid> = this.reserved4, reserved5: MutPtr<CVoid> = this.reserved5, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, reserved0: UShort = this.reserved0, featureSelector: UShort = this.featureSelector, index: UShort = this.index, reserved1: UShort = this.reserved1): UrbControlFeatureRequest = UrbControlFeatureRequest(hdr = hdr, reservedCtorArg = reserved, reserved2 = reserved2, reserved3 = reserved3, reserved4CtorArg = reserved4, reserved5CtorArg = reserved5, urbLinkCtorArg = urbLink, hca = hca, reserved0 = reserved0, featureSelector = featureSelector, index = index, reserved1 = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlFeatureRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.reserved3 != other.reserved3) return false
        if (this.reserved4 != other.reserved4) return false
        if (this.reserved5 != other.reserved5) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.featureSelector != other.featureSelector) return false
        if (this.index != other.index) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.reserved4.hashCode()
        result = 31 * result + this.reserved5.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.featureSelector.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlFeatureRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlFeatureRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlFeatureRequest =
                    UrbControlFeatureRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                    )
                override fun writeNative(addr: Long, value: UrbControlFeatureRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.reserved3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.reserved4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.reserved5)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 128L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 130L, value.featureSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.reserved1)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            reserved2: UInt = 0u,
            reserved3: UInt = 0u,
            reserved4: MutPtr<CVoid> = MutPtr(0L),
            reserved5: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            reserved0: UShort = 0u,
            featureSelector: UShort = 0u,
            index: UShort = 0u,
            reserved1: UShort = 0u,
        ): UrbControlFeatureRequest =
            UrbControlFeatureRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                reserved2 = reserved2,
                reserved3 = reserved3,
                reserved4CtorArg = reserved4,
                reserved5CtorArg = reserved5,
                urbLinkCtorArg = urbLink,
                hca = hca,
                reserved0 = reserved0,
                featureSelector = featureSelector,
                index = index,
                reserved1 = reserved1,
            )
    }
}

public class UrbControlGetConfigurationRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var reserved0: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var reserved1: UByteArray,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        reserved0 = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        reserved1 = UByteArray(8),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.reserved0

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByteArray = this.reserved1

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, reserved0: UInt = this.reserved0, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, reserved1: UByteArray = this.reserved1): UrbControlGetConfigurationRequest = UrbControlGetConfigurationRequest(hdr = hdr, reservedCtorArg = reserved, reserved0 = reserved0, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, reserved1 = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlGetConfigurationRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlGetConfigurationRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlGetConfigurationRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlGetConfigurationRequest =
                    UrbControlGetConfigurationRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UrbControlGetConfigurationRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 128L, value.reserved1.toList())
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            reserved0: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            reserved1: UByteArray = UByteArray(8),
        ): UrbControlGetConfigurationRequest =
            UrbControlGetConfigurationRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                reserved0 = reserved0,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                reserved1 = reserved1,
            )
    }
}

public class UrbControlGetInterfaceRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var reserved0: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var reserved1: UByteArray,
    public var iface: UShort,
    public var reserved2: UShort,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        reserved0 = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        reserved1 = UByteArray(4),
        iface = 0u,
        reserved2 = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.reserved0

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByteArray = this.reserved1

    public operator fun component10(): UShort = this.iface

    public operator fun component11(): UShort = this.reserved2

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, reserved0: UInt = this.reserved0, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, reserved1: UByteArray = this.reserved1, iface: UShort = this.iface, reserved2: UShort = this.reserved2): UrbControlGetInterfaceRequest = UrbControlGetInterfaceRequest(hdr = hdr, reservedCtorArg = reserved, reserved0 = reserved0, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, reserved1 = reserved1, iface = iface, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlGetInterfaceRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.iface != other.iface) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.iface.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlGetInterfaceRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlGetInterfaceRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlGetInterfaceRequest =
                    UrbControlGetInterfaceRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                    )
                override fun writeNative(addr: Long, value: UrbControlGetInterfaceRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 128L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.iface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.reserved2)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            reserved0: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            reserved1: UByteArray = UByteArray(4),
            iface: UShort = 0u,
            reserved2: UShort = 0u,
        ): UrbControlGetInterfaceRequest =
            UrbControlGetInterfaceRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                reserved0 = reserved0,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                reserved1 = reserved1,
                iface = iface,
                reserved2 = reserved2,
            )
    }
}

public class UrbControlGetStatusRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var reserved0: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var reserved1: UByteArray,
    public var index: UShort,
    public var reserved2: UShort,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        reserved0 = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        reserved1 = UByteArray(4),
        index = 0u,
        reserved2 = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.reserved0

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByteArray = this.reserved1

    public operator fun component10(): UShort = this.index

    public operator fun component11(): UShort = this.reserved2

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, reserved0: UInt = this.reserved0, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, reserved1: UByteArray = this.reserved1, index: UShort = this.index, reserved2: UShort = this.reserved2): UrbControlGetStatusRequest = UrbControlGetStatusRequest(hdr = hdr, reservedCtorArg = reserved, reserved0 = reserved0, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, reserved1 = reserved1, index = index, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlGetStatusRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.index != other.index) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlGetStatusRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlGetStatusRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlGetStatusRequest =
                    UrbControlGetStatusRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                    )
                override fun writeNative(addr: Long, value: UrbControlGetStatusRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 128L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.reserved2)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            reserved0: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            reserved1: UByteArray = UByteArray(4),
            index: UShort = 0u,
            reserved2: UShort = 0u,
        ): UrbControlGetStatusRequest =
            UrbControlGetStatusRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                reserved0 = reserved0,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                reserved1 = reserved1,
                index = index,
                reserved2 = reserved2,
            )
    }
}

public class UrbControlTransfer internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var transferFlags: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var setupPacket: UByteArray,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        transferFlags = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        setupPacket = UByteArray(8),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.transferFlags

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByteArray = this.setupPacket

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, transferFlags: UInt = this.transferFlags, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, setupPacket: UByteArray = this.setupPacket): UrbControlTransfer = UrbControlTransfer(hdr = hdr, pipeHandleCtorArg = pipeHandle, transferFlags = transferFlags, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, setupPacket = setupPacket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlTransfer) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (!this.setupPacket.contentEquals(other.setupPacket)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.setupPacket.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlTransfer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlTransfer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlTransfer =
                    UrbControlTransfer(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UrbControlTransfer) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.transferFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 128L, value.setupPacket.toList())
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            transferFlags: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            setupPacket: UByteArray = UByteArray(8),
        ): UrbControlTransfer =
            UrbControlTransfer(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                transferFlags = transferFlags,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                setupPacket = setupPacket,
            )
    }
}

public class UrbControlTransferEx internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var transferFlags: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    public var timeout: UInt,
    public var hca: UrbHcdArea,
    public var setupPacket: UByteArray,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        transferFlags = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        timeout = 0u,
        hca = UrbHcdArea(),
        setupPacket = UByteArray(8),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.transferFlags

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): UInt = this.timeout

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByteArray = this.setupPacket

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, transferFlags: UInt = this.transferFlags, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, timeout: UInt = this.timeout, hca: UrbHcdArea = this.hca, setupPacket: UByteArray = this.setupPacket): UrbControlTransferEx = UrbControlTransferEx(hdr = hdr, pipeHandleCtorArg = pipeHandle, transferFlags = transferFlags, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, timeout = timeout, hca = hca, setupPacket = setupPacket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlTransferEx) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.timeout != other.timeout) return false
        if (this.hca != other.hca) return false
        if (!this.setupPacket.contentEquals(other.setupPacket)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.setupPacket.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlTransferEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlTransferEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlTransferEx =
                    UrbControlTransferEx(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: UrbControlTransferEx) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.transferFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.timeout)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 128L, value.setupPacket.toList())
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            transferFlags: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            timeout: UInt = 0u,
            hca: UrbHcdArea = UrbHcdArea(),
            setupPacket: UByteArray = UByteArray(8),
        ): UrbControlTransferEx =
            UrbControlTransferEx(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                transferFlags = transferFlags,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                timeout = timeout,
                hca = hca,
                setupPacket = setupPacket,
            )
    }
}

public class UrbControlVendorOrClassRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var transferFlags: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var requestTypeReservedBits: UByte,
    public var request: UByte,
    public var value: UShort,
    public var index: UShort,
    public var reserved1: UShort,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        transferFlags = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        requestTypeReservedBits = 0u,
        request = 0u,
        value = 0u,
        index = 0u,
        reserved1 = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.transferFlags

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByte = this.requestTypeReservedBits

    public operator fun component10(): UByte = this.request

    public operator fun component11(): UShort = this.value

    public operator fun component12(): UShort = this.index

    public operator fun component13(): UShort = this.reserved1

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, transferFlags: UInt = this.transferFlags, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, requestTypeReservedBits: UByte = this.requestTypeReservedBits, request: UByte = this.request, value: UShort = this.value, index: UShort = this.index, reserved1: UShort = this.reserved1): UrbControlVendorOrClassRequest = UrbControlVendorOrClassRequest(hdr = hdr, reservedCtorArg = reserved, transferFlags = transferFlags, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, requestTypeReservedBits = requestTypeReservedBits, request = request, value = value, index = index, reserved1 = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbControlVendorOrClassRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (this.requestTypeReservedBits != other.requestTypeReservedBits) return false
        if (this.request != other.request) return false
        if (this.value != other.value) return false
        if (this.index != other.index) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.requestTypeReservedBits.hashCode()
        result = 31 * result + this.request.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlVendorOrClassRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbControlVendorOrClassRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbControlVendorOrClassRequest =
                    UrbControlVendorOrClassRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 129L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                    )
                override fun writeNative(addr: Long, value: UrbControlVendorOrClassRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.transferFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 128L, value.requestTypeReservedBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 129L, value.request)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 130L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.reserved1)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            transferFlags: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            requestTypeReservedBits: UByte = 0u,
            request: UByte = 0u,
            value: UShort = 0u,
            index: UShort = 0u,
            reserved1: UShort = 0u,
        ): UrbControlVendorOrClassRequest =
            UrbControlVendorOrClassRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                transferFlags = transferFlags,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                requestTypeReservedBits = requestTypeReservedBits,
                request = request,
                value = value,
                index = index,
                reserved1 = reserved1,
            )
    }
}

public data class UrbFrameLengthControl(
    public var hdr: UrbHeader = UrbHeader(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbFrameLengthControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbFrameLengthControl> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UrbFrameLengthControl =
                    UrbFrameLengthControl(
                        (UrbHeader.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UrbFrameLengthControl) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                }
            }
    }
}

public data class UrbGetCurrentFrameNumber(
    public var hdr: UrbHeader = UrbHeader(),
    public var frameNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbGetCurrentFrameNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbGetCurrentFrameNumber> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UrbGetCurrentFrameNumber =
                    UrbGetCurrentFrameNumber(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: UrbGetCurrentFrameNumber) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.frameNumber)
                }
            }
    }
}

public data class UrbGetFrameLength(
    public var hdr: UrbHeader = UrbHeader(),
    public var frameLength: UInt = 0u,
    public var frameNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbGetFrameLength> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbGetFrameLength> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UrbGetFrameLength =
                    UrbGetFrameLength(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: UrbGetFrameLength) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.frameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.frameNumber)
                }
            }
    }
}

public class UrbGetIsochPipeTransferPathDelays internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var maximumSendPathDelayInMilliSeconds: UInt,
    public var maximumCompletionPathDelayInMilliSeconds: UInt,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        maximumSendPathDelayInMilliSeconds = 0u,
        maximumCompletionPathDelayInMilliSeconds = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.maximumSendPathDelayInMilliSeconds

    public operator fun component4(): UInt = this.maximumCompletionPathDelayInMilliSeconds

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, maximumSendPathDelayInMilliSeconds: UInt = this.maximumSendPathDelayInMilliSeconds, maximumCompletionPathDelayInMilliSeconds: UInt = this.maximumCompletionPathDelayInMilliSeconds): UrbGetIsochPipeTransferPathDelays = UrbGetIsochPipeTransferPathDelays(hdr = hdr, pipeHandleCtorArg = pipeHandle, maximumSendPathDelayInMilliSeconds = maximumSendPathDelayInMilliSeconds, maximumCompletionPathDelayInMilliSeconds = maximumCompletionPathDelayInMilliSeconds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbGetIsochPipeTransferPathDelays) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.maximumSendPathDelayInMilliSeconds != other.maximumSendPathDelayInMilliSeconds) return false
        if (this.maximumCompletionPathDelayInMilliSeconds != other.maximumCompletionPathDelayInMilliSeconds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.maximumSendPathDelayInMilliSeconds.hashCode()
        result = 31 * result + this.maximumCompletionPathDelayInMilliSeconds.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbGetIsochPipeTransferPathDelays> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbGetIsochPipeTransferPathDelays> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): UrbGetIsochPipeTransferPathDelays =
                    UrbGetIsochPipeTransferPathDelays(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: UrbGetIsochPipeTransferPathDelays) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maximumSendPathDelayInMilliSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maximumCompletionPathDelayInMilliSeconds)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            maximumSendPathDelayInMilliSeconds: UInt = 0u,
            maximumCompletionPathDelayInMilliSeconds: UInt = 0u,
        ): UrbGetIsochPipeTransferPathDelays =
            UrbGetIsochPipeTransferPathDelays(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                maximumSendPathDelayInMilliSeconds = maximumSendPathDelayInMilliSeconds,
                maximumCompletionPathDelayInMilliSeconds = maximumCompletionPathDelayInMilliSeconds,
            )
    }
}

public class UrbHcdArea internal constructor(
    reserved8CtorArg: List<MutPtr<CVoid>>,
) {
    public var reserved8: List<MutPtr<CVoid>> = reserved8CtorArg
        internal set

    public constructor() : this(
        reserved8CtorArg = List(8) { MutPtr(0L) },
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.reserved8

    public fun copy(reserved8: List<MutPtr<CVoid>> = this.reserved8): UrbHcdArea = UrbHcdArea(reserved8CtorArg = reserved8)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbHcdArea) return false
        if (this.reserved8 != other.reserved8) return false
        return true
    }

    override fun hashCode(): Int = this.reserved8.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbHcdArea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbHcdArea> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): UrbHcdArea =
                    UrbHcdArea(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (8).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UrbHcdArea) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (8).toInt(),
                            )
                    ).writeNative(addr, value.reserved8)
                }
            }

        public operator fun invoke(
            reserved8: List<MutPtr<CVoid>> = List(8) { MutPtr(0L) },
        ): UrbHcdArea =
            UrbHcdArea(
                reserved8CtorArg = reserved8,
            )
    }
}

public class UrbHeader internal constructor(
    public var length: UShort,
    public var function: UShort,
    public var status: Int,
    usbdDeviceHandleCtorArg: MutPtr<CVoid>,
    public var usbdFlags: UInt,
) {
    public var usbdDeviceHandle: MutPtr<CVoid> = usbdDeviceHandleCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        function = 0u,
        status = 0,
        usbdDeviceHandleCtorArg = MutPtr(0L),
        usbdFlags = 0u,
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.function

    public operator fun component3(): Int = this.status

    public operator fun component4(): MutPtr<CVoid> = this.usbdDeviceHandle

    public operator fun component5(): UInt = this.usbdFlags

    public fun copy(length: UShort = this.length, function: UShort = this.function, status: Int = this.status, usbdDeviceHandle: MutPtr<CVoid> = this.usbdDeviceHandle, usbdFlags: UInt = this.usbdFlags): UrbHeader = UrbHeader(length = length, function = function, status = status, usbdDeviceHandleCtorArg = usbdDeviceHandle, usbdFlags = usbdFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbHeader) return false
        if (this.length != other.length) return false
        if (this.function != other.function) return false
        if (this.status != other.status) return false
        if (this.usbdDeviceHandle != other.usbdDeviceHandle) return false
        if (this.usbdFlags != other.usbdFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.function.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.usbdDeviceHandle.hashCode()
        result = 31 * result + this.usbdFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UrbHeader =
                    UrbHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UrbHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.function)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.status)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.usbdDeviceHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.usbdFlags)
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            function: UShort = 0u,
            status: Int = 0,
            usbdDeviceHandle: MutPtr<CVoid> = MutPtr(0L),
            usbdFlags: UInt = 0u,
        ): UrbHeader =
            UrbHeader(
                length = length,
                function = function,
                status = status,
                usbdDeviceHandleCtorArg = usbdDeviceHandle,
                usbdFlags = usbdFlags,
            )
    }
}

public class UrbIsochTransfer internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var transferFlags: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var startFrame: UInt,
    public var numberOfPackets: UInt,
    public var errorCount: UInt,
    public var isoPacket: List<UsbdIsoPacketDescriptor>,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        transferFlags = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        startFrame = 0u,
        numberOfPackets = 0u,
        errorCount = 0u,
        isoPacket = List(1) { UsbdIsoPacketDescriptor() },
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.transferFlags

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UInt = this.startFrame

    public operator fun component10(): UInt = this.numberOfPackets

    public operator fun component11(): UInt = this.errorCount

    public operator fun component12(): List<UsbdIsoPacketDescriptor> = this.isoPacket

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, transferFlags: UInt = this.transferFlags, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, startFrame: UInt = this.startFrame, numberOfPackets: UInt = this.numberOfPackets, errorCount: UInt = this.errorCount, isoPacket: List<UsbdIsoPacketDescriptor> = this.isoPacket): UrbIsochTransfer = UrbIsochTransfer(hdr = hdr, pipeHandleCtorArg = pipeHandle, transferFlags = transferFlags, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, startFrame = startFrame, numberOfPackets = numberOfPackets, errorCount = errorCount, isoPacket = isoPacket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbIsochTransfer) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.transferFlags != other.transferFlags) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (this.startFrame != other.startFrame) return false
        if (this.numberOfPackets != other.numberOfPackets) return false
        if (this.errorCount != other.errorCount) return false
        if (this.isoPacket != other.isoPacket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.transferFlags.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.startFrame.hashCode()
        result = 31 * result + this.numberOfPackets.hashCode()
        result = 31 * result + this.errorCount.hashCode()
        result = 31 * result + this.isoPacket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbIsochTransfer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbIsochTransfer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): UrbIsochTransfer =
                    UrbIsochTransfer(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UsbdIsoPacketDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 140L),
                    )
                override fun writeNative(addr: Long, value: UrbIsochTransfer) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.transferFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.startFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.numberOfPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.errorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UsbdIsoPacketDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 140L, value.isoPacket)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            transferFlags: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            startFrame: UInt = 0u,
            numberOfPackets: UInt = 0u,
            errorCount: UInt = 0u,
            isoPacket: List<UsbdIsoPacketDescriptor> = List(1) { UsbdIsoPacketDescriptor() },
        ): UrbIsochTransfer =
            UrbIsochTransfer(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                transferFlags = transferFlags,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                startFrame = startFrame,
                numberOfPackets = numberOfPackets,
                errorCount = errorCount,
                isoPacket = isoPacket,
            )
    }
}

public class UrbOpenStaticStreams internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var numberOfStreams: UInt,
    public var streamInfoVersion: UShort,
    public var streamInfoSize: UShort,
    streamsCtorArg: MutPtr<UsbdStreamInformation>,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public var streams: MutPtr<UsbdStreamInformation> = streamsCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        numberOfStreams = 0u,
        streamInfoVersion = 0u,
        streamInfoSize = 0u,
        streamsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.numberOfStreams

    public operator fun component4(): UShort = this.streamInfoVersion

    public operator fun component5(): UShort = this.streamInfoSize

    public operator fun component6(): MutPtr<UsbdStreamInformation> = this.streams

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, numberOfStreams: UInt = this.numberOfStreams, streamInfoVersion: UShort = this.streamInfoVersion, streamInfoSize: UShort = this.streamInfoSize, streams: MutPtr<UsbdStreamInformation> = this.streams): UrbOpenStaticStreams = UrbOpenStaticStreams(hdr = hdr, pipeHandleCtorArg = pipeHandle, numberOfStreams = numberOfStreams, streamInfoVersion = streamInfoVersion, streamInfoSize = streamInfoSize, streamsCtorArg = streams)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbOpenStaticStreams) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.numberOfStreams != other.numberOfStreams) return false
        if (this.streamInfoVersion != other.streamInfoVersion) return false
        if (this.streamInfoSize != other.streamInfoSize) return false
        if (this.streams != other.streams) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.numberOfStreams.hashCode()
        result = 31 * result + this.streamInfoVersion.hashCode()
        result = 31 * result + this.streamInfoSize.hashCode()
        result = 31 * result + this.streams.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbOpenStaticStreams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbOpenStaticStreams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UrbOpenStaticStreams =
                    UrbOpenStaticStreams(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UsbdStreamInformation>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: UrbOpenStaticStreams) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.numberOfStreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.streamInfoVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.streamInfoSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UsbdStreamInformation>(64)
                    ).writeNative(addr + 40L, value.streams)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            numberOfStreams: UInt = 0u,
            streamInfoVersion: UShort = 0u,
            streamInfoSize: UShort = 0u,
            streams: MutPtr<UsbdStreamInformation> = MutPtr(0L),
        ): UrbOpenStaticStreams =
            UrbOpenStaticStreams(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                numberOfStreams = numberOfStreams,
                streamInfoVersion = streamInfoVersion,
                streamInfoSize = streamInfoSize,
                streamsCtorArg = streams,
            )
    }
}

public class UrbOsFeatureDescriptorRequest internal constructor(
    public var hdr: UrbHeader,
    reservedCtorArg: MutPtr<CVoid>,
    public var reserved0: UInt,
    public var transferBufferLength: UInt,
    transferBufferCtorArg: MutPtr<CVoid>,
    transferBufferMDLCtorArg: MutPtr<CVoid>,
    urbLinkCtorArg: MutPtr<Urb>,
    public var hca: UrbHcdArea,
    public var bitfield: UByte,
    public var reserved2: UByte,
    public var interfaceNumber: UByte,
    public var msPageIndex: UByte,
    public var msFeatureDescriptorIndex: UShort,
    public var reserved3: UShort,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public var transferBuffer: MutPtr<CVoid> = transferBufferCtorArg
        internal set

    public var transferBufferMDL: MutPtr<CVoid> = transferBufferMDLCtorArg
        internal set

    public var urbLink: MutPtr<Urb> = urbLinkCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        reservedCtorArg = MutPtr(0L),
        reserved0 = 0u,
        transferBufferLength = 0u,
        transferBufferCtorArg = MutPtr(0L),
        transferBufferMDLCtorArg = MutPtr(0L),
        urbLinkCtorArg = MutPtr(0L),
        hca = UrbHcdArea(),
        bitfield = 0u,
        reserved2 = 0u,
        interfaceNumber = 0u,
        msPageIndex = 0u,
        msFeatureDescriptorIndex = 0u,
        reserved3 = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.reserved

    public operator fun component3(): UInt = this.reserved0

    public operator fun component4(): UInt = this.transferBufferLength

    public operator fun component5(): MutPtr<CVoid> = this.transferBuffer

    public operator fun component6(): MutPtr<CVoid> = this.transferBufferMDL

    public operator fun component7(): MutPtr<Urb> = this.urbLink

    public operator fun component8(): UrbHcdArea = this.hca

    public operator fun component9(): UByte = this.bitfield

    public operator fun component10(): UByte = this.reserved2

    public operator fun component11(): UByte = this.interfaceNumber

    public operator fun component12(): UByte = this.msPageIndex

    public operator fun component13(): UShort = this.msFeatureDescriptorIndex

    public operator fun component14(): UShort = this.reserved3

    public fun copy(hdr: UrbHeader = this.hdr, reserved: MutPtr<CVoid> = this.reserved, reserved0: UInt = this.reserved0, transferBufferLength: UInt = this.transferBufferLength, transferBuffer: MutPtr<CVoid> = this.transferBuffer, transferBufferMDL: MutPtr<CVoid> = this.transferBufferMDL, urbLink: MutPtr<Urb> = this.urbLink, hca: UrbHcdArea = this.hca, bitfield: UByte = this.bitfield, reserved2: UByte = this.reserved2, interfaceNumber: UByte = this.interfaceNumber, msPageIndex: UByte = this.msPageIndex, msFeatureDescriptorIndex: UShort = this.msFeatureDescriptorIndex, reserved3: UShort = this.reserved3): UrbOsFeatureDescriptorRequest = UrbOsFeatureDescriptorRequest(hdr = hdr, reservedCtorArg = reserved, reserved0 = reserved0, transferBufferLength = transferBufferLength, transferBufferCtorArg = transferBuffer, transferBufferMDLCtorArg = transferBufferMDL, urbLinkCtorArg = urbLink, hca = hca, bitfield = bitfield, reserved2 = reserved2, interfaceNumber = interfaceNumber, msPageIndex = msPageIndex, msFeatureDescriptorIndex = msFeatureDescriptorIndex, reserved3 = reserved3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbOsFeatureDescriptorRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.transferBufferLength != other.transferBufferLength) return false
        if (this.transferBuffer != other.transferBuffer) return false
        if (this.transferBufferMDL != other.transferBufferMDL) return false
        if (this.urbLink != other.urbLink) return false
        if (this.hca != other.hca) return false
        if (this.bitfield != other.bitfield) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.interfaceNumber != other.interfaceNumber) return false
        if (this.msPageIndex != other.msPageIndex) return false
        if (this.msFeatureDescriptorIndex != other.msFeatureDescriptorIndex) return false
        if (this.reserved3 != other.reserved3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.transferBufferLength.hashCode()
        result = 31 * result + this.transferBuffer.hashCode()
        result = 31 * result + this.transferBufferMDL.hashCode()
        result = 31 * result + this.urbLink.hashCode()
        result = 31 * result + this.hca.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.interfaceNumber.hashCode()
        result = 31 * result + this.msPageIndex.hashCode()
        result = 31 * result + this.msFeatureDescriptorIndex.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbOsFeatureDescriptorRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbOsFeatureDescriptorRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UrbOsFeatureDescriptorRequest =
                    UrbOsFeatureDescriptorRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
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
                                .mutPtrLayout<Urb>(64)
                        ).readNative(addr + 56L),
                        (UrbHcdArea.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 129L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 130L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 131L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 134L),
                    )
                override fun writeNative(addr: Long, value: UrbOsFeatureDescriptorRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.transferBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transferBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.transferBufferMDL)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Urb>(64)
                    ).writeNative(addr + 56L, value.urbLink)
                    (UrbHcdArea.typeLayout()).writeNative(addr + 64L, value.hca)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 128L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 129L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 130L, value.interfaceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 131L, value.msPageIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 132L, value.msFeatureDescriptorIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 134L, value.reserved3)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            reserved: MutPtr<CVoid> = MutPtr(0L),
            reserved0: UInt = 0u,
            transferBufferLength: UInt = 0u,
            transferBuffer: MutPtr<CVoid> = MutPtr(0L),
            transferBufferMDL: MutPtr<CVoid> = MutPtr(0L),
            urbLink: MutPtr<Urb> = MutPtr(0L),
            hca: UrbHcdArea = UrbHcdArea(),
            bitfield: UByte = 0u,
            reserved2: UByte = 0u,
            interfaceNumber: UByte = 0u,
            msPageIndex: UByte = 0u,
            msFeatureDescriptorIndex: UShort = 0u,
            reserved3: UShort = 0u,
        ): UrbOsFeatureDescriptorRequest =
            UrbOsFeatureDescriptorRequest(
                hdr = hdr,
                reservedCtorArg = reserved,
                reserved0 = reserved0,
                transferBufferLength = transferBufferLength,
                transferBufferCtorArg = transferBuffer,
                transferBufferMDLCtorArg = transferBufferMDL,
                urbLinkCtorArg = urbLink,
                hca = hca,
                bitfield = bitfield,
                reserved2 = reserved2,
                interfaceNumber = interfaceNumber,
                msPageIndex = msPageIndex,
                msFeatureDescriptorIndex = msFeatureDescriptorIndex,
                reserved3 = reserved3,
            )
    }
}

public class UrbPipeRequest internal constructor(
    public var hdr: UrbHeader,
    pipeHandleCtorArg: MutPtr<CVoid>,
    public var reserved: UInt,
) {
    public var pipeHandle: MutPtr<CVoid> = pipeHandleCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        pipeHandleCtorArg = MutPtr(0L),
        reserved = 0u,
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.pipeHandle

    public operator fun component3(): UInt = this.reserved

    public fun copy(hdr: UrbHeader = this.hdr, pipeHandle: MutPtr<CVoid> = this.pipeHandle, reserved: UInt = this.reserved): UrbPipeRequest = UrbPipeRequest(hdr = hdr, pipeHandleCtorArg = pipeHandle, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbPipeRequest) return false
        if (this.hdr != other.hdr) return false
        if (this.pipeHandle != other.pipeHandle) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.pipeHandle.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbPipeRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbPipeRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): UrbPipeRequest =
                    UrbPipeRequest(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: UrbPipeRequest) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.pipeHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.reserved)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            pipeHandle: MutPtr<CVoid> = MutPtr(0L),
            reserved: UInt = 0u,
        ): UrbPipeRequest =
            UrbPipeRequest(
                hdr = hdr,
                pipeHandleCtorArg = pipeHandle,
                reserved = reserved,
            )
    }
}

public class UrbSelectConfiguration internal constructor(
    public var hdr: UrbHeader,
    configurationDescriptorCtorArg: MutPtr<UsbConfigurationDescriptor>,
    configurationHandleCtorArg: MutPtr<CVoid>,
    public var iface: UsbdInterfaceInformation,
) {
    public var configurationDescriptor: MutPtr<UsbConfigurationDescriptor> = configurationDescriptorCtorArg
        internal set

    public var configurationHandle: MutPtr<CVoid> = configurationHandleCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        configurationDescriptorCtorArg = MutPtr(0L),
        configurationHandleCtorArg = MutPtr(0L),
        iface = UsbdInterfaceInformation(),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<UsbConfigurationDescriptor> = this.configurationDescriptor

    public operator fun component3(): MutPtr<CVoid> = this.configurationHandle

    public operator fun component4(): UsbdInterfaceInformation = this.iface

    public fun copy(hdr: UrbHeader = this.hdr, configurationDescriptor: MutPtr<UsbConfigurationDescriptor> = this.configurationDescriptor, configurationHandle: MutPtr<CVoid> = this.configurationHandle, iface: UsbdInterfaceInformation = this.iface): UrbSelectConfiguration = UrbSelectConfiguration(hdr = hdr, configurationDescriptorCtorArg = configurationDescriptor, configurationHandleCtorArg = configurationHandle, iface = iface)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbSelectConfiguration) return false
        if (this.hdr != other.hdr) return false
        if (this.configurationDescriptor != other.configurationDescriptor) return false
        if (this.configurationHandle != other.configurationHandle) return false
        if (this.iface != other.iface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.configurationDescriptor.hashCode()
        result = 31 * result + this.configurationHandle.hashCode()
        result = 31 * result + this.iface.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbSelectConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbSelectConfiguration> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): UrbSelectConfiguration =
                    UrbSelectConfiguration(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UsbConfigurationDescriptor>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (UsbdInterfaceInformation.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: UrbSelectConfiguration) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UsbConfigurationDescriptor>(64)
                    ).writeNative(addr + 24L, value.configurationDescriptor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.configurationHandle)
                    (UsbdInterfaceInformation.typeLayout()).writeNative(addr + 40L, value.iface)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            configurationDescriptor: MutPtr<UsbConfigurationDescriptor> = MutPtr(0L),
            configurationHandle: MutPtr<CVoid> = MutPtr(0L),
            iface: UsbdInterfaceInformation = UsbdInterfaceInformation(),
        ): UrbSelectConfiguration =
            UrbSelectConfiguration(
                hdr = hdr,
                configurationDescriptorCtorArg = configurationDescriptor,
                configurationHandleCtorArg = configurationHandle,
                iface = iface,
            )
    }
}

public class UrbSelectInterface internal constructor(
    public var hdr: UrbHeader,
    configurationHandleCtorArg: MutPtr<CVoid>,
    public var iface: UsbdInterfaceInformation,
) {
    public var configurationHandle: MutPtr<CVoid> = configurationHandleCtorArg
        internal set

    public constructor() : this(
        hdr = UrbHeader(),
        configurationHandleCtorArg = MutPtr(0L),
        iface = UsbdInterfaceInformation(),
    )

    public operator fun component1(): UrbHeader = this.hdr

    public operator fun component2(): MutPtr<CVoid> = this.configurationHandle

    public operator fun component3(): UsbdInterfaceInformation = this.iface

    public fun copy(hdr: UrbHeader = this.hdr, configurationHandle: MutPtr<CVoid> = this.configurationHandle, iface: UsbdInterfaceInformation = this.iface): UrbSelectInterface = UrbSelectInterface(hdr = hdr, configurationHandleCtorArg = configurationHandle, iface = iface)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UrbSelectInterface) return false
        if (this.hdr != other.hdr) return false
        if (this.configurationHandle != other.configurationHandle) return false
        if (this.iface != other.iface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.configurationHandle.hashCode()
        result = 31 * result + this.iface.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbSelectInterface> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbSelectInterface> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): UrbSelectInterface =
                    UrbSelectInterface(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (UsbdInterfaceInformation.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: UrbSelectInterface) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.configurationHandle)
                    (UsbdInterfaceInformation.typeLayout()).writeNative(addr + 32L, value.iface)
                }
            }

        public operator fun invoke(
            hdr: UrbHeader = UrbHeader(),
            configurationHandle: MutPtr<CVoid> = MutPtr(0L),
            iface: UsbdInterfaceInformation = UsbdInterfaceInformation(),
        ): UrbSelectInterface =
            UrbSelectInterface(
                hdr = hdr,
                configurationHandleCtorArg = configurationHandle,
                iface = iface,
            )
    }
}

public data class UrbSetFrameLength(
    public var hdr: UrbHeader = UrbHeader(),
    public var frameLengthDelta: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbSetFrameLength> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UrbSetFrameLength> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UrbSetFrameLength =
                    UrbSetFrameLength(
                        (UrbHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: UrbSetFrameLength) {
                    (UrbHeader.typeLayout()).writeNative(addr, value.hdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.frameLengthDelta)
                }
            }
    }
}
