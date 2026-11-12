@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.power

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr

public data class AcpiRealTime(
    public var year: UShort = 0u,
    public var month: UByte = 0u,
    public var day: UByte = 0u,
    public var hour: UByte = 0u,
    public var minute: UByte = 0u,
    public var second: UByte = 0u,
    public var valid: UByte = 0u,
    public var milliseconds: UShort = 0u,
    public var timeZone: Short = 0,
    public var dayLight: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcpiRealTime) return false
        if (this.year != other.year) return false
        if (this.month != other.month) return false
        if (this.day != other.day) return false
        if (this.hour != other.hour) return false
        if (this.minute != other.minute) return false
        if (this.second != other.second) return false
        if (this.valid != other.valid) return false
        if (this.milliseconds != other.milliseconds) return false
        if (this.timeZone != other.timeZone) return false
        if (this.dayLight != other.dayLight) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.year.hashCode()
        result = 31 * result + this.month.hashCode()
        result = 31 * result + this.day.hashCode()
        result = 31 * result + this.hour.hashCode()
        result = 31 * result + this.minute.hashCode()
        result = 31 * result + this.second.hashCode()
        result = 31 * result + this.valid.hashCode()
        result = 31 * result + this.milliseconds.hashCode()
        result = 31 * result + this.timeZone.hashCode()
        result = 31 * result + this.dayLight.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcpiRealTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcpiRealTime> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AcpiRealTime =
                    AcpiRealTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AcpiRealTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.valid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.milliseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.timeZone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.dayLight)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved1.toList())
                }
            }
    }
}

public data class AcpiTimeAndAlarmCapabilities(
    public var acWakeSupported: Boolean = false,
    public var dcWakeSupported: Boolean = false,
    public var s4AcWakeSupported: Boolean = false,
    public var s4DcWakeSupported: Boolean = false,
    public var s5AcWakeSupported: Boolean = false,
    public var s5DcWakeSupported: Boolean = false,
    public var s4S5WakeStatusSupported: Boolean = false,
    public var deepestWakeSystemState: UInt = 0u,
    public var realTimeFeaturesSupported: Boolean = false,
    public var realTimeResolution: AcpiTimeResolution = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcpiTimeAndAlarmCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcpiTimeAndAlarmCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): AcpiTimeAndAlarmCapabilities =
                    AcpiTimeAndAlarmCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AcpiTimeAndAlarmCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.acWakeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.dcWakeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.s4AcWakeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.s4DcWakeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.s5AcWakeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.s5DcWakeSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.s4S5WakeStatusSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.deepestWakeSystemState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.realTimeFeaturesSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.realTimeResolution)
                }
            }
    }
}

public data class AdministratorPowerPolicy(
    public var minSleep: SystemPowerState = 0,
    public var maxSleep: SystemPowerState = 0,
    public var minVideoTimeout: UInt = 0u,
    public var maxVideoTimeout: UInt = 0u,
    public var minSpindownTimeout: UInt = 0u,
    public var maxSpindownTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdministratorPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdministratorPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): AdministratorPowerPolicy =
                    AdministratorPowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AdministratorPowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.minSleep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maxSleep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minVideoTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxVideoTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minSpindownTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maxSpindownTimeout)
                }
            }
    }
}

public data class BatteryChargerStatus(
    public var type: BatteryChargingSourceType = 0,
    public var vaData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatteryChargerStatus) return false
        if (this.type != other.type) return false
        if (!this.vaData.contentEquals(other.vaData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.vaData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryChargerStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryChargerStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BatteryChargerStatus =
                    BatteryChargerStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: BatteryChargerStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.vaData.toList())
                }
            }
    }
}

public data class BatteryChargingSource(
    public var type: BatteryChargingSourceType = 0,
    public var maxCurrent: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryChargingSource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryChargingSource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BatteryChargingSource =
                    BatteryChargingSource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BatteryChargingSource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxCurrent)
                }
            }
    }
}

public data class BatteryChargingSourceInformation(
    public var type: BatteryChargingSourceType = 0,
    public var sourceOnline: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryChargingSourceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryChargingSourceInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BatteryChargingSourceInformation =
                    BatteryChargingSourceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BatteryChargingSourceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.sourceOnline)
                }
            }
    }
}

public data class BatteryInformation(
    public var capabilities: UInt = 0u,
    public var technology: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var chemistry: UByteArray = UByteArray(4),
    public var designedCapacity: UInt = 0u,
    public var fullChargedCapacity: UInt = 0u,
    public var defaultAlert1: UInt = 0u,
    public var defaultAlert2: UInt = 0u,
    public var criticalBias: UInt = 0u,
    public var cycleCount: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatteryInformation) return false
        if (this.capabilities != other.capabilities) return false
        if (this.technology != other.technology) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.chemistry.contentEquals(other.chemistry)) return false
        if (this.designedCapacity != other.designedCapacity) return false
        if (this.fullChargedCapacity != other.fullChargedCapacity) return false
        if (this.defaultAlert1 != other.defaultAlert1) return false
        if (this.defaultAlert2 != other.defaultAlert2) return false
        if (this.criticalBias != other.criticalBias) return false
        if (this.cycleCount != other.cycleCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.hashCode()
        result = 31 * result + this.technology.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.chemistry.contentHashCode()
        result = 31 * result + this.designedCapacity.hashCode()
        result = 31 * result + this.fullChargedCapacity.hashCode()
        result = 31 * result + this.defaultAlert1.hashCode()
        result = 31 * result + this.defaultAlert2.hashCode()
        result = 31 * result + this.criticalBias.hashCode()
        result = 31 * result + this.cycleCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): BatteryInformation =
                    BatteryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: BatteryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.technology)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.chemistry.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.designedCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fullChargedCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.defaultAlert1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.defaultAlert2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.criticalBias)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cycleCount)
                }
            }
    }
}

public data class BatteryManufactureDate(
    public var day: UByte = 0u,
    public var month: UByte = 0u,
    public var year: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryManufactureDate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryManufactureDate> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BatteryManufactureDate =
                    BatteryManufactureDate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: BatteryManufactureDate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.year)
                }
            }
    }
}

public data class BatteryQueryInformation(
    public var batteryTag: UInt = 0u,
    public var informationLevel: BatteryQueryInformationLevel = 0,
    public var atRate: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryQueryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryQueryInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): BatteryQueryInformation =
                    BatteryQueryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BatteryQueryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.batteryTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.informationLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.atRate)
                }
            }
    }
}

public data class BatteryReportingScale(
    public var granularity: UInt = 0u,
    public var capacity: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryReportingScale> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryReportingScale> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BatteryReportingScale =
                    BatteryReportingScale(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BatteryReportingScale) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.granularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capacity)
                }
            }
    }
}

public data class BatterySetInformation(
    public var batteryTag: UInt = 0u,
    public var informationLevel: BatterySetInformationLevel = 0,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatterySetInformation) return false
        if (this.batteryTag != other.batteryTag) return false
        if (this.informationLevel != other.informationLevel) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.batteryTag.hashCode()
        result = 31 * result + this.informationLevel.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatterySetInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatterySetInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): BatterySetInformation =
                    BatterySetInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BatterySetInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.batteryTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.informationLevel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.buffer.toList())
                }
            }
    }
}

public data class BatteryStatus(
    public var powerState: UInt = 0u,
    public var capacity: UInt = 0u,
    public var voltage: UInt = 0u,
    public var rate: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BatteryStatus =
                    BatteryStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: BatteryStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.powerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.capacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.voltage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.rate)
                }
            }
    }
}

public class BatteryUsbChargerStatus internal constructor(
    public var type: BatteryChargingSourceType,
    public var reserved: UInt,
    public var flags: UInt,
    public var maxCurrent: UInt,
    public var voltage: UInt,
    public var portType: UsbChargerPort,
    public var portId: ULong,
    powerSourceInformationCtorArg: MutPtr<CVoid>,
    public var oemCharger: Guid,
) {
    public var powerSourceInformation: MutPtr<CVoid> = powerSourceInformationCtorArg
        internal set

    public constructor() : this(
        type = 0,
        reserved = 0u,
        flags = 0u,
        maxCurrent = 0u,
        voltage = 0u,
        portType = 0,
        portId = 0uL,
        powerSourceInformationCtorArg = MutPtr(0L),
        oemCharger = Guid(),
    )

    public operator fun component1(): BatteryChargingSourceType = this.type

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.maxCurrent

    public operator fun component5(): UInt = this.voltage

    public operator fun component6(): UsbChargerPort = this.portType

    public operator fun component7(): ULong = this.portId

    public operator fun component8(): MutPtr<CVoid> = this.powerSourceInformation

    public operator fun component9(): Guid = this.oemCharger

    public fun copy(type: BatteryChargingSourceType = this.type, reserved: UInt = this.reserved, flags: UInt = this.flags, maxCurrent: UInt = this.maxCurrent, voltage: UInt = this.voltage, portType: UsbChargerPort = this.portType, portId: ULong = this.portId, powerSourceInformation: MutPtr<CVoid> = this.powerSourceInformation, oemCharger: Guid = this.oemCharger): BatteryUsbChargerStatus = BatteryUsbChargerStatus(type = type, reserved = reserved, flags = flags, maxCurrent = maxCurrent, voltage = voltage, portType = portType, portId = portId, powerSourceInformationCtorArg = powerSourceInformation, oemCharger = oemCharger)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BatteryUsbChargerStatus) return false
        if (this.type != other.type) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.maxCurrent != other.maxCurrent) return false
        if (this.voltage != other.voltage) return false
        if (this.portType != other.portType) return false
        if (this.portId != other.portId) return false
        if (this.powerSourceInformation != other.powerSourceInformation) return false
        if (this.oemCharger != other.oemCharger) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxCurrent.hashCode()
        result = 31 * result + this.voltage.hashCode()
        result = 31 * result + this.portType.hashCode()
        result = 31 * result + this.portId.hashCode()
        result = 31 * result + this.powerSourceInformation.hashCode()
        result = 31 * result + this.oemCharger.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: BatteryChargingSourceType = 0,
            reserved: UInt = 0u,
            flags: UInt = 0u,
            maxCurrent: UInt = 0u,
            voltage: UInt = 0u,
            portType: UsbChargerPort = 0,
            portId: ULong = 0uL,
            powerSourceInformation: MutPtr<CVoid> = MutPtr(0L),
            oemCharger: Guid = Guid(),
        ): BatteryUsbChargerStatus =
            BatteryUsbChargerStatus(
                type = type,
                reserved = reserved,
                flags = flags,
                maxCurrent = maxCurrent,
                voltage = voltage,
                portType = portType,
                portId = portId,
                powerSourceInformationCtorArg = powerSourceInformation,
                oemCharger = oemCharger,
            )
    }
}

public data class BatteryWaitStatus(
    public var batteryTag: UInt = 0u,
    public var timeout: UInt = 0u,
    public var powerState: UInt = 0u,
    public var lowCapacity: UInt = 0u,
    public var highCapacity: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryWaitStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BatteryWaitStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): BatteryWaitStatus =
                    BatteryWaitStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: BatteryWaitStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.batteryTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.powerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lowCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.highCapacity)
                }
            }
    }
}

public data class CmPowerData(
    public var pdSize: UInt = 0u,
    public var pdMostRecentPowerState: DevicePowerState = 0,
    public var pdCapabilities: UInt = 0u,
    public var pdD1Latency: UInt = 0u,
    public var pdD2Latency: UInt = 0u,
    public var pdD3Latency: UInt = 0u,
    public var pdPowerStateMapping: IntArray = IntArray(7),
    public var pdDeepestSystemWake: SystemPowerState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmPowerData) return false
        if (this.pdSize != other.pdSize) return false
        if (this.pdMostRecentPowerState != other.pdMostRecentPowerState) return false
        if (this.pdCapabilities != other.pdCapabilities) return false
        if (this.pdD1Latency != other.pdD1Latency) return false
        if (this.pdD2Latency != other.pdD2Latency) return false
        if (this.pdD3Latency != other.pdD3Latency) return false
        if (!this.pdPowerStateMapping.contentEquals(other.pdPowerStateMapping)) return false
        if (this.pdDeepestSystemWake != other.pdDeepestSystemWake) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pdSize.hashCode()
        result = 31 * result + this.pdMostRecentPowerState.hashCode()
        result = 31 * result + this.pdCapabilities.hashCode()
        result = 31 * result + this.pdD1Latency.hashCode()
        result = 31 * result + this.pdD2Latency.hashCode()
        result = 31 * result + this.pdD3Latency.hashCode()
        result = 31 * result + this.pdPowerStateMapping.contentHashCode()
        result = 31 * result + this.pdDeepestSystemWake.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPowerData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmPowerData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CmPowerData =
                    CmPowerData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (7).toInt())
                        ).readNative(addr + 24L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: CmPowerData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pdSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pdMostRecentPowerState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pdCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pdD1Latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pdD2Latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pdD3Latency)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (7).toInt())
                    ).writeNative(addr + 24L, value.pdPowerStateMapping.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.pdDeepestSystemWake)
                }
            }
    }
}

public class DeviceNotifySubscribeParameters internal constructor(
    public var callback: PdeviceNotifyCallbackRoutine,
    contextCtorArg: MutPtr<CVoid>,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        callback = null,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PdeviceNotifyCallbackRoutine = this.callback

    public operator fun component2(): MutPtr<CVoid> = this.context

    public fun copy(callback: PdeviceNotifyCallbackRoutine = this.callback, context: MutPtr<CVoid> = this.context): DeviceNotifySubscribeParameters = DeviceNotifySubscribeParameters(callback = callback, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceNotifySubscribeParameters) return false
        if (this.callback != other.callback) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.callback.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            callback: PdeviceNotifyCallbackRoutine = null,
            context: MutPtr<CVoid> = MutPtr(0L),
        ): DeviceNotifySubscribeParameters =
            DeviceNotifySubscribeParameters(
                callback = callback,
                contextCtorArg = context,
            )
    }
}

public data class EmiChannelMeasurementData(
    public var absoluteEnergy: ULong = 0uL,
    public var absoluteTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiChannelMeasurementData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiChannelMeasurementData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EmiChannelMeasurementData =
                    EmiChannelMeasurementData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EmiChannelMeasurementData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.absoluteEnergy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.absoluteTime)
                }
            }
    }
}

public data class EmiChannelV2(
    public var measurementUnit: EmiMeasurementUnit = 0,
    public var channelNameSize: UShort = 0u,
    public var channelName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmiChannelV2) return false
        if (this.measurementUnit != other.measurementUnit) return false
        if (this.channelNameSize != other.channelNameSize) return false
        if (!this.channelName.contentEquals(other.channelName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.measurementUnit.hashCode()
        result = 31 * result + this.channelNameSize.hashCode()
        result = 31 * result + this.channelName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiChannelV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiChannelV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): EmiChannelV2 =
                    EmiChannelV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: EmiChannelV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.measurementUnit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.channelNameSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 6L, value.channelName.toList())
                }
            }
    }
}

public data class EmiMeasurementDataV2(
    public var channelData: List<EmiChannelMeasurementData> = List(1) { EmiChannelMeasurementData() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMeasurementDataV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMeasurementDataV2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EmiMeasurementDataV2 =
                    EmiMeasurementDataV2(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EmiChannelMeasurementData.typeLayout(), (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EmiMeasurementDataV2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EmiChannelMeasurementData.typeLayout(), (1).toInt())
                    ).writeNative(addr, value.channelData)
                }
            }
    }
}

public data class EmiMetadataSize(
    public var metadataSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMetadataSize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMetadataSize> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): EmiMetadataSize =
                    EmiMetadataSize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EmiMetadataSize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.metadataSize)
                }
            }
    }
}

public data class EmiMetadataV1(
    public var measurementUnit: EmiMeasurementUnit = 0,
    public var hardwareOEM: UShortArray = UShortArray(16),
    public var hardwareModel: UShortArray = UShortArray(16),
    public var hardwareRevision: UShort = 0u,
    public var meteredHardwareNameSize: UShort = 0u,
    public var meteredHardwareName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmiMetadataV1) return false
        if (this.measurementUnit != other.measurementUnit) return false
        if (!this.hardwareOEM.contentEquals(other.hardwareOEM)) return false
        if (!this.hardwareModel.contentEquals(other.hardwareModel)) return false
        if (this.hardwareRevision != other.hardwareRevision) return false
        if (this.meteredHardwareNameSize != other.meteredHardwareNameSize) return false
        if (!this.meteredHardwareName.contentEquals(other.meteredHardwareName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.measurementUnit.hashCode()
        result = 31 * result + this.hardwareOEM.contentHashCode()
        result = 31 * result + this.hardwareModel.contentHashCode()
        result = 31 * result + this.hardwareRevision.hashCode()
        result = 31 * result + this.meteredHardwareNameSize.hashCode()
        result = 31 * result + this.meteredHardwareName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMetadataV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMetadataV1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): EmiMetadataV1 =
                    EmiMetadataV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 70L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 72L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: EmiMetadataV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.measurementUnit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.hardwareOEM.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.hardwareModel.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 68L, value.hardwareRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 70L, value.meteredHardwareNameSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 72L, value.meteredHardwareName.toList())
                }
            }
    }
}

public data class EmiMetadataV2(
    public var hardwareOEM: UShortArray = UShortArray(16),
    public var hardwareModel: UShortArray = UShortArray(16),
    public var hardwareRevision: UShort = 0u,
    public var channelCount: UShort = 0u,
    public var channels: List<EmiChannelV2> = List(1) { EmiChannelV2() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EmiMetadataV2) return false
        if (!this.hardwareOEM.contentEquals(other.hardwareOEM)) return false
        if (!this.hardwareModel.contentEquals(other.hardwareModel)) return false
        if (this.hardwareRevision != other.hardwareRevision) return false
        if (this.channelCount != other.channelCount) return false
        if (this.channels != other.channels) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hardwareOEM.contentHashCode()
        result = 31 * result + this.hardwareModel.contentHashCode()
        result = 31 * result + this.hardwareRevision.hashCode()
        result = 31 * result + this.channelCount.hashCode()
        result = 31 * result + this.channels.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMetadataV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiMetadataV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): EmiMetadataV2 =
                    EmiMetadataV2(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 32L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 66L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(EmiChannelV2.typeLayout(), (1).toInt())
                        ).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: EmiMetadataV2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr, value.hardwareOEM.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 32L, value.hardwareModel.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 64L, value.hardwareRevision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 66L, value.channelCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(EmiChannelV2.typeLayout(), (1).toInt())
                    ).writeNative(addr + 68L, value.channels)
                }
            }
    }
}

public data class EmiVersion(
    public var emiVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EmiVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): EmiVersion =
                    EmiVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EmiVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.emiVersion)
                }
            }
    }
}

public data class GlobalMachinePowerPolicy(
    public var revision: UInt = 0u,
    public var lidOpenWakeAc: SystemPowerState = 0,
    public var lidOpenWakeDc: SystemPowerState = 0,
    public var broadcastCapacityResolution: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobalMachinePowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobalMachinePowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GlobalMachinePowerPolicy =
                    GlobalMachinePowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: GlobalMachinePowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lidOpenWakeAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lidOpenWakeDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.broadcastCapacityResolution)
                }
            }
    }
}

public data class GlobalPowerPolicy(
    public var user: GlobalUserPowerPolicy = GlobalUserPowerPolicy(),
    public var mach: GlobalMachinePowerPolicy = GlobalMachinePowerPolicy(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobalPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobalPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): GlobalPowerPolicy =
                    GlobalPowerPolicy(
                        (GlobalUserPowerPolicy.typeLayout()).readNative(addr),
                        (GlobalMachinePowerPolicy.typeLayout()).readNative(addr + 176L),
                    )
                override fun writeNative(addr: Long, value: GlobalPowerPolicy) {
                    (GlobalUserPowerPolicy.typeLayout()).writeNative(addr, value.user)
                    (GlobalMachinePowerPolicy.typeLayout()).writeNative(addr + 176L, value.mach)
                }
            }
    }
}

public data class GlobalUserPowerPolicy(
    public var revision: UInt = 0u,
    public var powerButtonAc: PowerActionPolicy = PowerActionPolicy(),
    public var powerButtonDc: PowerActionPolicy = PowerActionPolicy(),
    public var sleepButtonAc: PowerActionPolicy = PowerActionPolicy(),
    public var sleepButtonDc: PowerActionPolicy = PowerActionPolicy(),
    public var lidCloseAc: PowerActionPolicy = PowerActionPolicy(),
    public var lidCloseDc: PowerActionPolicy = PowerActionPolicy(),
    public var dischargePolicy: List<SystemPowerLevel> = List(4) { SystemPowerLevel() },
    public var globalFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobalUserPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobalUserPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 176L
                override fun readNative(addr: Long): GlobalUserPowerPolicy =
                    GlobalUserPowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 4L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 16L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 28L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 40L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 52L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SystemPowerLevel.typeLayout(), (4).toInt())
                        ).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                    )
                override fun writeNative(addr: Long, value: GlobalUserPowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 4L, value.powerButtonAc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 16L, value.powerButtonDc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 28L, value.sleepButtonAc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 40L, value.sleepButtonDc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 52L, value.lidCloseAc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 64L, value.lidCloseDc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SystemPowerLevel.typeLayout(), (4).toInt())
                    ).writeNative(addr + 76L, value.dischargePolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.globalFlags)
                }
            }
    }
}

public data class MachinePowerPolicy(
    public var revision: UInt = 0u,
    public var minSleepAc: SystemPowerState = 0,
    public var minSleepDc: SystemPowerState = 0,
    public var reducedLatencySleepAc: SystemPowerState = 0,
    public var reducedLatencySleepDc: SystemPowerState = 0,
    public var dozeTimeoutAc: UInt = 0u,
    public var dozeTimeoutDc: UInt = 0u,
    public var dozeS4TimeoutAc: UInt = 0u,
    public var dozeS4TimeoutDc: UInt = 0u,
    public var minThrottleAc: UByte = 0u,
    public var minThrottleDc: UByte = 0u,
    public var pad1: UByteArray = UByteArray(2),
    public var overThrottledAc: PowerActionPolicy = PowerActionPolicy(),
    public var overThrottledDc: PowerActionPolicy = PowerActionPolicy(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MachinePowerPolicy) return false
        if (this.revision != other.revision) return false
        if (this.minSleepAc != other.minSleepAc) return false
        if (this.minSleepDc != other.minSleepDc) return false
        if (this.reducedLatencySleepAc != other.reducedLatencySleepAc) return false
        if (this.reducedLatencySleepDc != other.reducedLatencySleepDc) return false
        if (this.dozeTimeoutAc != other.dozeTimeoutAc) return false
        if (this.dozeTimeoutDc != other.dozeTimeoutDc) return false
        if (this.dozeS4TimeoutAc != other.dozeS4TimeoutAc) return false
        if (this.dozeS4TimeoutDc != other.dozeS4TimeoutDc) return false
        if (this.minThrottleAc != other.minThrottleAc) return false
        if (this.minThrottleDc != other.minThrottleDc) return false
        if (!this.pad1.contentEquals(other.pad1)) return false
        if (this.overThrottledAc != other.overThrottledAc) return false
        if (this.overThrottledDc != other.overThrottledDc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.minSleepAc.hashCode()
        result = 31 * result + this.minSleepDc.hashCode()
        result = 31 * result + this.reducedLatencySleepAc.hashCode()
        result = 31 * result + this.reducedLatencySleepDc.hashCode()
        result = 31 * result + this.dozeTimeoutAc.hashCode()
        result = 31 * result + this.dozeTimeoutDc.hashCode()
        result = 31 * result + this.dozeS4TimeoutAc.hashCode()
        result = 31 * result + this.dozeS4TimeoutDc.hashCode()
        result = 31 * result + this.minThrottleAc.hashCode()
        result = 31 * result + this.minThrottleDc.hashCode()
        result = 31 * result + this.pad1.contentHashCode()
        result = 31 * result + this.overThrottledAc.hashCode()
        result = 31 * result + this.overThrottledDc.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachinePowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachinePowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MachinePowerPolicy =
                    MachinePowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 37L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 38L).toUByteArray(),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 40L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: MachinePowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minSleepAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.minSleepDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.reducedLatencySleepAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.reducedLatencySleepDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dozeTimeoutAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dozeTimeoutDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dozeS4TimeoutAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dozeS4TimeoutDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.minThrottleAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 37L, value.minThrottleDc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 38L, value.pad1.toList())
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 40L, value.overThrottledAc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 52L, value.overThrottledDc)
                }
            }
    }
}

public data class MachineProcessorPowerPolicy(
    public var revision: UInt = 0u,
    public var processorPolicyAc: ProcessorPowerPolicy = ProcessorPowerPolicy(),
    public var processorPolicyDc: ProcessorPowerPolicy = ProcessorPowerPolicy(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachineProcessorPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachineProcessorPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 156L
                override fun readNative(addr: Long): MachineProcessorPowerPolicy =
                    MachineProcessorPowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (ProcessorPowerPolicy.typeLayout()).readNative(addr + 4L),
                        (ProcessorPowerPolicy.typeLayout()).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: MachineProcessorPowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (ProcessorPowerPolicy.typeLayout()).writeNative(addr + 4L, value.processorPolicyAc)
                    (ProcessorPowerPolicy.typeLayout()).writeNative(addr + 80L, value.processorPolicyDc)
                }
            }
    }
}

public data class PowerbroadcastSetting(
    public var powerSetting: Guid = Guid(),
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PowerbroadcastSetting) return false
        if (this.powerSetting != other.powerSetting) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.powerSetting.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class PowerActionPolicy(
    public var action: PowerAction = 0,
    public var flags: UInt = 0u,
    public var eventCode: PowerActionPolicyEventCode = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerActionPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerActionPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PowerActionPolicy =
                    PowerActionPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PowerActionPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eventCode)
                }
            }
    }
}

public data class PowerIdleResiliency(
    public var coalescingTimeout: UInt = 0u,
    public var idleResiliencyPeriod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerIdleResiliency> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerIdleResiliency> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerIdleResiliency =
                    PowerIdleResiliency(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PowerIdleResiliency) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.coalescingTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.idleResiliencyPeriod)
                }
            }
    }
}

public data class PowerMonitorInvocation(
    public var console: Boolean = false,
    public var requestReason: PowerMonitorRequestReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerMonitorInvocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerMonitorInvocation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerMonitorInvocation =
                    PowerMonitorInvocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PowerMonitorInvocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.console)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.requestReason)
                }
            }
    }
}

public data class PowerPlatformInformation(
    public var aoAc: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerPlatformInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerPlatformInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PowerPlatformInformation =
                    PowerPlatformInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PowerPlatformInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.aoAc)
                }
            }
    }
}

public data class PowerPolicy(
    public var user: UserPowerPolicy = UserPowerPolicy(),
    public var mach: MachinePowerPolicy = MachinePowerPolicy(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): PowerPolicy =
                    PowerPolicy(
                        (UserPowerPolicy.typeLayout()).readNative(addr),
                        (MachinePowerPolicy.typeLayout()).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: PowerPolicy) {
                    (UserPowerPolicy.typeLayout()).writeNative(addr, value.user)
                    (MachinePowerPolicy.typeLayout()).writeNative(addr + 80L, value.mach)
                }
            }
    }
}

public data class PowerSessionAllowExternalDmaDevices(
    public var isAllowed: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionAllowExternalDmaDevices> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionAllowExternalDmaDevices> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PowerSessionAllowExternalDmaDevices =
                    PowerSessionAllowExternalDmaDevices(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PowerSessionAllowExternalDmaDevices) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isAllowed)
                }
            }
    }
}

public data class PowerSessionConnect(
    public var connected: Boolean = false,
    public var console: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionConnect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionConnect> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PowerSessionConnect =
                    PowerSessionConnect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionConnect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.connected)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.console)
                }
            }
    }
}

public data class PowerSessionRitState(
    public var active: Boolean = false,
    public var lastInputTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionRitState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionRitState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PowerSessionRitState =
                    PowerSessionRitState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionRitState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.active)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lastInputTime)
                }
            }
    }
}

public data class PowerSessionTimeouts(
    public var inputTimeout: UInt = 0u,
    public var displayTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionTimeouts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionTimeouts> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerSessionTimeouts =
                    PowerSessionTimeouts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionTimeouts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inputTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.displayTimeout)
                }
            }
    }
}

public data class PowerSessionWinlogon(
    public var sessionId: UInt = 0u,
    public var console: Boolean = false,
    public var locked: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionWinlogon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerSessionWinlogon> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PowerSessionWinlogon =
                    PowerSessionWinlogon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: PowerSessionWinlogon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.console)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.locked)
                }
            }
    }
}

public data class PowerUserPresence(
    public var userPresence: PowerUserPresenceType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerUserPresence> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PowerUserPresence> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PowerUserPresence =
                    PowerUserPresence(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PowerUserPresence) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.userPresence)
                }
            }
    }
}

public data class PpmIdlestateEvent(
    public var newState: UInt = 0u,
    public var oldState: UInt = 0u,
    public var processors: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdlestateEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdlestateEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PpmIdlestateEvent =
                    PpmIdlestateEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PpmIdlestateEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.newState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.oldState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.processors)
                }
            }
    }
}

public data class PpmIdleAccounting(
    public var stateCount: UInt = 0u,
    public var totalTransitions: UInt = 0u,
    public var resetCount: UInt = 0u,
    public var startTime: ULong = 0uL,
    public var state: List<PpmIdleStateAccounting> = List(1) { PpmIdleStateAccounting() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleAccounting> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleAccounting> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): PpmIdleAccounting =
                    PpmIdleAccounting(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmIdleStateAccounting.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PpmIdleAccounting) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalTransitions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.resetCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.startTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmIdleStateAccounting.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.state)
                }
            }
    }
}

public data class PpmIdleAccountingEx(
    public var stateCount: UInt = 0u,
    public var totalTransitions: UInt = 0u,
    public var resetCount: UInt = 0u,
    public var abortCount: UInt = 0u,
    public var startTime: ULong = 0uL,
    public var state: List<PpmIdleStateAccountingEx> = List(1) { PpmIdleStateAccountingEx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleAccountingEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleAccountingEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 440L
                override fun readNative(addr: Long): PpmIdleAccountingEx =
                    PpmIdleAccountingEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmIdleStateAccountingEx.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PpmIdleAccountingEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalTransitions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.resetCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.abortCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.startTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmIdleStateAccountingEx.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.state)
                }
            }
    }
}

public data class PpmIdleStateAccounting(
    public var idleTransitions: UInt = 0u,
    public var failedTransitions: UInt = 0u,
    public var invalidBucketIndex: UInt = 0u,
    public var totalTime: ULong = 0uL,
    public var idleTimeBuckets: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PpmIdleStateAccounting) return false
        if (this.idleTransitions != other.idleTransitions) return false
        if (this.failedTransitions != other.failedTransitions) return false
        if (this.invalidBucketIndex != other.invalidBucketIndex) return false
        if (this.totalTime != other.totalTime) return false
        if (!this.idleTimeBuckets.contentEquals(other.idleTimeBuckets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.idleTransitions.hashCode()
        result = 31 * result + this.failedTransitions.hashCode()
        result = 31 * result + this.invalidBucketIndex.hashCode()
        result = 31 * result + this.totalTime.hashCode()
        result = 31 * result + this.idleTimeBuckets.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleStateAccounting> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleStateAccounting> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PpmIdleStateAccounting =
                    PpmIdleStateAccounting(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PpmIdleStateAccounting) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.idleTransitions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.failedTransitions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.invalidBucketIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.totalTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr + 24L, value.idleTimeBuckets.toList())
                }
            }
    }
}

public data class PpmIdleStateAccountingEx(
    public var totalTime: ULong = 0uL,
    public var idleTransitions: UInt = 0u,
    public var failedTransitions: UInt = 0u,
    public var invalidBucketIndex: UInt = 0u,
    public var minTimeUs: UInt = 0u,
    public var maxTimeUs: UInt = 0u,
    public var cancelledTransitions: UInt = 0u,
    public var idleTimeBuckets: List<PpmIdleStateBucketEx> = List(16) { PpmIdleStateBucketEx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleStateAccountingEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleStateAccountingEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 416L
                override fun readNative(addr: Long): PpmIdleStateAccountingEx =
                    PpmIdleStateAccountingEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmIdleStateBucketEx.typeLayout(), (16).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PpmIdleStateAccountingEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.idleTransitions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.failedTransitions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.invalidBucketIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.minTimeUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxTimeUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cancelledTransitions)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmIdleStateBucketEx.typeLayout(), (16).toInt())
                    ).writeNative(addr + 32L, value.idleTimeBuckets)
                }
            }
    }
}

public data class PpmIdleStateBucketEx(
    public var totalTimeUs: ULong = 0uL,
    public var minTimeUs: UInt = 0u,
    public var maxTimeUs: UInt = 0u,
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleStateBucketEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmIdleStateBucketEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PpmIdleStateBucketEx =
                    PpmIdleStateBucketEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PpmIdleStateBucketEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalTimeUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minTimeUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxTimeUs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.count)
                }
            }
    }
}

public data class PpmPerfstateDomainEvent(
    public var state: UInt = 0u,
    public var latency: UInt = 0u,
    public var speed: UInt = 0u,
    public var processors: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmPerfstateDomainEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmPerfstateDomainEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PpmPerfstateDomainEvent =
                    PpmPerfstateDomainEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PpmPerfstateDomainEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.processors)
                }
            }
    }
}

public data class PpmPerfstateEvent(
    public var state: UInt = 0u,
    public var status: UInt = 0u,
    public var latency: UInt = 0u,
    public var speed: UInt = 0u,
    public var processor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmPerfstateEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmPerfstateEvent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): PpmPerfstateEvent =
                    PpmPerfstateEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PpmPerfstateEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.processor)
                }
            }
    }
}

public data class PpmThermalchangeEvent(
    public var thermalConstraint: UInt = 0u,
    public var processors: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmThermalchangeEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmThermalchangeEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PpmThermalchangeEvent =
                    PpmThermalchangeEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PpmThermalchangeEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.thermalConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.processors)
                }
            }
    }
}

public data class PpmThermalPolicyEvent(
    public var mode: UByte = 0u,
    public var processors: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmThermalPolicyEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmThermalPolicyEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PpmThermalPolicyEvent =
                    PpmThermalPolicyEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PpmThermalPolicyEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.processors)
                }
            }
    }
}

public data class PpmWmiIdleState(
    public var latency: UInt = 0u,
    public var power: UInt = 0u,
    public var timeCheck: UInt = 0u,
    public var promotePercent: UByte = 0u,
    public var demotePercent: UByte = 0u,
    public var stateType: UByte = 0u,
    public var reserved: UByte = 0u,
    public var stateFlags: UInt = 0u,
    public var context: UInt = 0u,
    public var idleHandler: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiIdleState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiIdleState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PpmWmiIdleState =
                    PpmWmiIdleState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiIdleState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.power)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeCheck)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.promotePercent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.demotePercent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.stateType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.stateFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.idleHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved1)
                }
            }
    }
}

public data class PpmWmiIdleStates(
    public var type: UInt = 0u,
    public var count: UInt = 0u,
    public var targetState: UInt = 0u,
    public var oldState: UInt = 0u,
    public var targetProcessors: ULong = 0uL,
    public var state: List<PpmWmiIdleState> = List(1) { PpmWmiIdleState() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiIdleStates> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiIdleStates> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PpmWmiIdleStates =
                    PpmWmiIdleStates(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmWmiIdleState.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiIdleStates) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.targetState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.oldState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.targetProcessors)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmWmiIdleState.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.state)
                }
            }
    }
}

public class PpmWmiIdleStatesEx internal constructor(
    public var type: UInt,
    public var count: UInt,
    public var targetState: UInt,
    public var oldState: UInt,
    targetProcessorsCtorArg: MutPtr<CVoid>,
    public var state: List<PpmWmiIdleState>,
) {
    public var targetProcessors: MutPtr<CVoid> = targetProcessorsCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        count = 0u,
        targetState = 0u,
        oldState = 0u,
        targetProcessorsCtorArg = MutPtr(0L),
        state = List(1) { PpmWmiIdleState() },
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): UInt = this.count

    public operator fun component3(): UInt = this.targetState

    public operator fun component4(): UInt = this.oldState

    public operator fun component5(): MutPtr<CVoid> = this.targetProcessors

    public operator fun component6(): List<PpmWmiIdleState> = this.state

    public fun copy(type: UInt = this.type, count: UInt = this.count, targetState: UInt = this.targetState, oldState: UInt = this.oldState, targetProcessors: MutPtr<CVoid> = this.targetProcessors, state: List<PpmWmiIdleState> = this.state): PpmWmiIdleStatesEx = PpmWmiIdleStatesEx(type = type, count = count, targetState = targetState, oldState = oldState, targetProcessorsCtorArg = targetProcessors, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PpmWmiIdleStatesEx) return false
        if (this.type != other.type) return false
        if (this.count != other.count) return false
        if (this.targetState != other.targetState) return false
        if (this.oldState != other.oldState) return false
        if (this.targetProcessors != other.targetProcessors) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.targetState.hashCode()
        result = 31 * result + this.oldState.hashCode()
        result = 31 * result + this.targetProcessors.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiIdleStatesEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiIdleStatesEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PpmWmiIdleStatesEx =
                    PpmWmiIdleStatesEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmWmiIdleState.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiIdleStatesEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.targetState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.oldState)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.targetProcessors)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmWmiIdleState.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.state)
                }
            }

        public operator fun invoke(
            type: UInt = 0u,
            count: UInt = 0u,
            targetState: UInt = 0u,
            oldState: UInt = 0u,
            targetProcessors: MutPtr<CVoid> = MutPtr(0L),
            state: List<PpmWmiIdleState> = List(1) { PpmWmiIdleState() },
        ): PpmWmiIdleStatesEx =
            PpmWmiIdleStatesEx(
                type = type,
                count = count,
                targetState = targetState,
                oldState = oldState,
                targetProcessorsCtorArg = targetProcessors,
                state = state,
            )
    }
}

public data class PpmWmiLegacyPerfstate(
    public var frequency: UInt = 0u,
    public var flags: UInt = 0u,
    public var percentFrequency: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiLegacyPerfstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiLegacyPerfstate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PpmWmiLegacyPerfstate =
                    PpmWmiLegacyPerfstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiLegacyPerfstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.frequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.percentFrequency)
                }
            }
    }
}

public data class PpmWmiPerfState(
    public var frequency: UInt = 0u,
    public var power: UInt = 0u,
    public var percentFrequency: UByte = 0u,
    public var increaseLevel: UByte = 0u,
    public var decreaseLevel: UByte = 0u,
    public var type: UByte = 0u,
    public var increaseTime: UInt = 0u,
    public var decreaseTime: UInt = 0u,
    public var control: ULong = 0uL,
    public var status: ULong = 0uL,
    public var hitCount: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULong = 0uL,
    public var reserved3: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiPerfState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiPerfState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PpmWmiPerfState =
                    PpmWmiPerfState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiPerfState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.frequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.power)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.percentFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.increaseLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.decreaseLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.increaseTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.decreaseTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.control)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.hitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.reserved3)
                }
            }
    }
}

public class PpmWmiPerfStates(
    public var count: UInt = 0u,
    public var maxFrequency: UInt = 0u,
    public var currentState: UInt = 0u,
    public var maxPerfState: UInt = 0u,
    public var minPerfState: UInt = 0u,
    public var lowestPerfState: UInt = 0u,
    public var thermalConstraint: UInt = 0u,
    public var busyAdjThreshold: UByte = 0u,
    public var policyType: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timerInterval: UInt = 0u,
    public var targetProcessors: ULong = 0uL,
    public var pStateHandler: UInt = 0u,
    public var pStateContext: UInt = 0u,
    public var tStateHandler: UInt = 0u,
    public var tStateContext: UInt = 0u,
    public var feedbackHandler: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: ULong = 0uL,
    public var state: List<PpmWmiPerfState> = List(1) { PpmWmiPerfState() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiPerfStates> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiPerfStates> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): PpmWmiPerfStates =
                    PpmWmiPerfStates(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 29L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 31L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmWmiPerfState.typeLayout(), (1).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiPerfStates) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.currentState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxPerfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minPerfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.lowestPerfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.thermalConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.busyAdjThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 29L, value.policyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 30L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 31L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.timerInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.targetProcessors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.pStateHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.pStateContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.tStateHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.tStateContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.feedbackHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmWmiPerfState.typeLayout(), (1).toInt())
                    ).writeNative(addr + 80L, value.state)
                }
            }
    }
}

public class PpmWmiPerfStatesEx internal constructor(
    public var count: UInt,
    public var maxFrequency: UInt,
    public var currentState: UInt,
    public var maxPerfState: UInt,
    public var minPerfState: UInt,
    public var lowestPerfState: UInt,
    public var thermalConstraint: UInt,
    public var busyAdjThreshold: UByte,
    public var policyType: UByte,
    public var type: UByte,
    public var reserved: UByte,
    public var timerInterval: UInt,
    targetProcessorsCtorArg: MutPtr<CVoid>,
    public var pStateHandler: UInt,
    public var pStateContext: UInt,
    public var tStateHandler: UInt,
    public var tStateContext: UInt,
    public var feedbackHandler: UInt,
    public var reserved1: UInt,
    public var reserved2: ULong,
    public var state: List<PpmWmiPerfState>,
) {
    public var targetProcessors: MutPtr<CVoid> = targetProcessorsCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        maxFrequency = 0u,
        currentState = 0u,
        maxPerfState = 0u,
        minPerfState = 0u,
        lowestPerfState = 0u,
        thermalConstraint = 0u,
        busyAdjThreshold = 0u,
        policyType = 0u,
        type = 0u,
        reserved = 0u,
        timerInterval = 0u,
        targetProcessorsCtorArg = MutPtr(0L),
        pStateHandler = 0u,
        pStateContext = 0u,
        tStateHandler = 0u,
        tStateContext = 0u,
        feedbackHandler = 0u,
        reserved1 = 0u,
        reserved2 = 0uL,
        state = List(1) { PpmWmiPerfState() },
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiPerfStatesEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PpmWmiPerfStatesEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): PpmWmiPerfStatesEx =
                    PpmWmiPerfStatesEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 29L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 31L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PpmWmiPerfState.typeLayout(), (1).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: PpmWmiPerfStatesEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.currentState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxPerfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.minPerfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.lowestPerfState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.thermalConstraint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.busyAdjThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 29L, value.policyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 30L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 31L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.timerInterval)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.targetProcessors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.pStateHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.pStateContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.tStateHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.tStateContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.feedbackHandler)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PpmWmiPerfState.typeLayout(), (1).toInt())
                    ).writeNative(addr + 80L, value.state)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            maxFrequency: UInt = 0u,
            currentState: UInt = 0u,
            maxPerfState: UInt = 0u,
            minPerfState: UInt = 0u,
            lowestPerfState: UInt = 0u,
            thermalConstraint: UInt = 0u,
            busyAdjThreshold: UByte = 0u,
            policyType: UByte = 0u,
            type: UByte = 0u,
            reserved: UByte = 0u,
            timerInterval: UInt = 0u,
            targetProcessors: MutPtr<CVoid> = MutPtr(0L),
            pStateHandler: UInt = 0u,
            pStateContext: UInt = 0u,
            tStateHandler: UInt = 0u,
            tStateContext: UInt = 0u,
            feedbackHandler: UInt = 0u,
            reserved1: UInt = 0u,
            reserved2: ULong = 0uL,
            state: List<PpmWmiPerfState> = List(1) { PpmWmiPerfState() },
        ): PpmWmiPerfStatesEx =
            PpmWmiPerfStatesEx(
                count = count,
                maxFrequency = maxFrequency,
                currentState = currentState,
                maxPerfState = maxPerfState,
                minPerfState = minPerfState,
                lowestPerfState = lowestPerfState,
                thermalConstraint = thermalConstraint,
                busyAdjThreshold = busyAdjThreshold,
                policyType = policyType,
                type = type,
                reserved = reserved,
                timerInterval = timerInterval,
                targetProcessorsCtorArg = targetProcessors,
                pStateHandler = pStateHandler,
                pStateContext = pStateContext,
                tStateHandler = tStateHandler,
                tStateContext = tStateContext,
                feedbackHandler = feedbackHandler,
                reserved1 = reserved1,
                reserved2 = reserved2,
                state = state,
            )
    }
}

public data class ProcessorObjectInfo(
    public var physicalID: UInt = 0u,
    public var pBlkAddress: UInt = 0u,
    public var pBlkLength: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorObjectInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorObjectInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ProcessorObjectInfo =
                    ProcessorObjectInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ProcessorObjectInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pBlkAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.pBlkLength)
                }
            }
    }
}

public data class ProcessorObjectInfoEx(
    public var physicalID: UInt = 0u,
    public var pBlkAddress: UInt = 0u,
    public var pBlkLength: UByte = 0u,
    public var initialApicId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorObjectInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorObjectInfoEx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ProcessorObjectInfoEx =
                    ProcessorObjectInfoEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ProcessorObjectInfoEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pBlkAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.pBlkLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.initialApicId)
                }
            }
    }
}

public data class ProcessorPowerInformation(
    public var number: UInt = 0u,
    public var maxMhz: UInt = 0u,
    public var currentMhz: UInt = 0u,
    public var mhzLimit: UInt = 0u,
    public var maxIdleState: UInt = 0u,
    public var currentIdleState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPowerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPowerInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ProcessorPowerInformation =
                    ProcessorPowerInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: ProcessorPowerInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.number)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.currentMhz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mhzLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxIdleState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.currentIdleState)
                }
            }
    }
}

public data class ProcessorPowerPolicy(
    public var revision: UInt = 0u,
    public var dynamicThrottle: UByte = 0u,
    public var spare: UByteArray = UByteArray(3),
    public var bitfield: UInt = 0u,
    public var policyCount: UInt = 0u,
    public var policy: List<ProcessorPowerPolicyInfo> = List(3) { ProcessorPowerPolicyInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorPowerPolicy) return false
        if (this.revision != other.revision) return false
        if (this.dynamicThrottle != other.dynamicThrottle) return false
        if (!this.spare.contentEquals(other.spare)) return false
        if (this.bitfield != other.bitfield) return false
        if (this.policyCount != other.policyCount) return false
        if (this.policy != other.policy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.revision.hashCode()
        result = 31 * result + this.dynamicThrottle.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.policyCount.hashCode()
        result = 31 * result + this.policy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): ProcessorPowerPolicy =
                    ProcessorPowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ProcessorPowerPolicyInfo.typeLayout(), (3).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ProcessorPowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.dynamicThrottle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.spare.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.policyCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ProcessorPowerPolicyInfo.typeLayout(), (3).toInt())
                    ).writeNative(addr + 16L, value.policy)
                }
            }
    }
}

public data class ProcessorPowerPolicyInfo(
    public var timeCheck: UInt = 0u,
    public var demoteLimit: UInt = 0u,
    public var promoteLimit: UInt = 0u,
    public var demotePercent: UByte = 0u,
    public var promotePercent: UByte = 0u,
    public var spare: UByteArray = UByteArray(2),
    public var bitfield: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorPowerPolicyInfo) return false
        if (this.timeCheck != other.timeCheck) return false
        if (this.demoteLimit != other.demoteLimit) return false
        if (this.promoteLimit != other.promoteLimit) return false
        if (this.demotePercent != other.demotePercent) return false
        if (this.promotePercent != other.promotePercent) return false
        if (!this.spare.contentEquals(other.spare)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeCheck.hashCode()
        result = 31 * result + this.demoteLimit.hashCode()
        result = 31 * result + this.promoteLimit.hashCode()
        result = 31 * result + this.demotePercent.hashCode()
        result = 31 * result + this.promotePercent.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPowerPolicyInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorPowerPolicyInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): ProcessorPowerPolicyInfo =
                    ProcessorPowerPolicyInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ProcessorPowerPolicyInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeCheck)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.demoteLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.promoteLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.demotePercent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.promotePercent)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.spare.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bitfield)
                }
            }
    }
}

public data class ResumePerformance(
    public var postTimeMs: UInt = 0u,
    public var totalResumeTimeMs: ULong = 0uL,
    public var resumeCompleteTimestamp: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResumePerformance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResumePerformance> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ResumePerformance =
                    ResumePerformance(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ResumePerformance) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.postTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalResumeTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.resumeCompleteTimestamp)
                }
            }
    }
}

public data class SetPowerSettingValue(
    public var version: UInt = 0u,
    public var guid: Guid = Guid(),
    public var powerCondition: SystemPowerCondition = 0,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetPowerSettingValue) return false
        if (this.version != other.version) return false
        if (this.guid != other.guid) return false
        if (this.powerCondition != other.powerCondition) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.powerCondition.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class SystemBatteryState(
    public var acOnLine: Boolean = false,
    public var batteryPresent: Boolean = false,
    public var charging: Boolean = false,
    public var discharging: Boolean = false,
    public var spare1: BooleanArray = BooleanArray(3),
    public var tag: UByte = 0u,
    public var maxCapacity: UInt = 0u,
    public var remainingCapacity: UInt = 0u,
    public var rate: UInt = 0u,
    public var estimatedTime: UInt = 0u,
    public var defaultAlert1: UInt = 0u,
    public var defaultAlert2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemBatteryState) return false
        if (this.acOnLine != other.acOnLine) return false
        if (this.batteryPresent != other.batteryPresent) return false
        if (this.charging != other.charging) return false
        if (this.discharging != other.discharging) return false
        if (!this.spare1.contentEquals(other.spare1)) return false
        if (this.tag != other.tag) return false
        if (this.maxCapacity != other.maxCapacity) return false
        if (this.remainingCapacity != other.remainingCapacity) return false
        if (this.rate != other.rate) return false
        if (this.estimatedTime != other.estimatedTime) return false
        if (this.defaultAlert1 != other.defaultAlert1) return false
        if (this.defaultAlert2 != other.defaultAlert2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.acOnLine.hashCode()
        result = 31 * result + this.batteryPresent.hashCode()
        result = 31 * result + this.charging.hashCode()
        result = 31 * result + this.discharging.hashCode()
        result = 31 * result + this.spare1.contentHashCode()
        result = 31 * result + this.tag.hashCode()
        result = 31 * result + this.maxCapacity.hashCode()
        result = 31 * result + this.remainingCapacity.hashCode()
        result = 31 * result + this.rate.hashCode()
        result = 31 * result + this.estimatedTime.hashCode()
        result = 31 * result + this.defaultAlert1.hashCode()
        result = 31 * result + this.defaultAlert2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemBatteryState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemBatteryState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SystemBatteryState =
                    SystemBatteryState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL, (3).toInt())
                        ).readNative(addr + 4L).toBooleanArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SystemBatteryState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.acOnLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.batteryPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.charging)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.discharging)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL, (3).toInt())
                    ).writeNative(addr + 4L, value.spare1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.remainingCapacity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.estimatedTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.defaultAlert1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.defaultAlert2)
                }
            }
    }
}

public class SystemPowerCapabilities(
    public var powerButtonPresent: Boolean = false,
    public var sleepButtonPresent: Boolean = false,
    public var lidPresent: Boolean = false,
    public var systemS1: Boolean = false,
    public var systemS2: Boolean = false,
    public var systemS3: Boolean = false,
    public var systemS4: Boolean = false,
    public var systemS5: Boolean = false,
    public var hiberFilePresent: Boolean = false,
    public var fullWake: Boolean = false,
    public var videoDimPresent: Boolean = false,
    public var apmPresent: Boolean = false,
    public var upsPresent: Boolean = false,
    public var thermalControl: Boolean = false,
    public var processorThrottle: Boolean = false,
    public var processorMinThrottle: UByte = 0u,
    public var processorMaxThrottle: UByte = 0u,
    public var fastSystemS4: Boolean = false,
    public var hiberboot: Boolean = false,
    public var wakeAlarmPresent: Boolean = false,
    public var aoAc: Boolean = false,
    public var diskSpinDown: Boolean = false,
    public var hiberFileType: UByte = 0u,
    public var aoAcConnectivitySupported: Boolean = false,
    public var spare3: UByteArray = UByteArray(6),
    public var systemBatteriesPresent: Boolean = false,
    public var batteriesAreShortTerm: Boolean = false,
    public var batteryScale: List<BatteryReportingScale> = List(3) { BatteryReportingScale() },
    public var acOnLineWake: SystemPowerState = 0,
    public var softLidWake: SystemPowerState = 0,
    public var rtcWake: SystemPowerState = 0,
    public var minDeviceWakeState: SystemPowerState = 0,
    public var defaultLowLatencyWake: SystemPowerState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): SystemPowerCapabilities =
                    SystemPowerCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 23L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 31L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BatteryReportingScale.typeLayout(), (3).toInt())
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: SystemPowerCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.powerButtonPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.sleepButtonPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.lidPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.systemS1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.systemS2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.systemS3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.systemS4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.systemS5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.hiberFilePresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.fullWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.videoDimPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 11L, value.apmPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.upsPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 13L, value.thermalControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 14L, value.processorThrottle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.processorMinThrottle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.processorMaxThrottle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.fastSystemS4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 18L, value.hiberboot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 19L, value.wakeAlarmPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.aoAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.diskSpinDown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.hiberFileType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 23L, value.aoAcConnectivitySupported)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 24L, value.spare3.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 30L, value.systemBatteriesPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 31L, value.batteriesAreShortTerm)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BatteryReportingScale.typeLayout(), (3).toInt())
                    ).writeNative(addr + 32L, value.batteryScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.acOnLineWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.softLidWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.rtcWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.minDeviceWakeState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.defaultLowLatencyWake)
                }
            }
    }
}

public data class SystemPowerInformation(
    public var maxIdlenessAllowed: UInt = 0u,
    public var idleness: UInt = 0u,
    public var timeRemaining: UInt = 0u,
    public var coolingMode: PowerCoolingMode = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SystemPowerInformation =
                    SystemPowerInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SystemPowerInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxIdlenessAllowed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.idleness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeRemaining)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.coolingMode)
                }
            }
    }
}

public data class SystemPowerLevel(
    public var enable: Boolean = false,
    public var spare: UByteArray = UByteArray(3),
    public var batteryLevel: UInt = 0u,
    public var powerPolicy: PowerActionPolicy = PowerActionPolicy(),
    public var minSystemState: SystemPowerState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemPowerLevel) return false
        if (this.enable != other.enable) return false
        if (!this.spare.contentEquals(other.spare)) return false
        if (this.batteryLevel != other.batteryLevel) return false
        if (this.powerPolicy != other.powerPolicy) return false
        if (this.minSystemState != other.minSystemState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enable.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        result = 31 * result + this.batteryLevel.hashCode()
        result = 31 * result + this.powerPolicy.hashCode()
        result = 31 * result + this.minSystemState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerLevel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerLevel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SystemPowerLevel =
                    SystemPowerLevel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SystemPowerLevel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enable)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.spare.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.batteryLevel)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 8L, value.powerPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.minSystemState)
                }
            }
    }
}

public class SystemPowerPolicy(
    public var revision: UInt = 0u,
    public var powerButton: PowerActionPolicy = PowerActionPolicy(),
    public var sleepButton: PowerActionPolicy = PowerActionPolicy(),
    public var lidClose: PowerActionPolicy = PowerActionPolicy(),
    public var lidOpenWake: SystemPowerState = 0,
    public var reserved: UInt = 0u,
    public var idle: PowerActionPolicy = PowerActionPolicy(),
    public var idleTimeout: UInt = 0u,
    public var idleSensitivity: UByte = 0u,
    public var dynamicThrottle: UByte = 0u,
    public var spare2: UByteArray = UByteArray(2),
    public var minSleep: SystemPowerState = 0,
    public var maxSleep: SystemPowerState = 0,
    public var reducedLatencySleep: SystemPowerState = 0,
    public var winLogonFlags: UInt = 0u,
    public var spare3: UInt = 0u,
    public var dozeS4Timeout: UInt = 0u,
    public var broadcastCapacityResolution: UInt = 0u,
    public var dischargePolicy: List<SystemPowerLevel> = List(4) { SystemPowerLevel() },
    public var videoTimeout: UInt = 0u,
    public var videoDimDisplay: Boolean = false,
    public var videoReserved: UIntArray = UIntArray(3),
    public var spindownTimeout: UInt = 0u,
    public var optimizeForPower: Boolean = false,
    public var fanThrottleTolerance: UByte = 0u,
    public var forcedThrottle: UByte = 0u,
    public var minThrottle: UByte = 0u,
    public var overThrottled: PowerActionPolicy = PowerActionPolicy(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 232L
                override fun readNative(addr: Long): SystemPowerPolicy =
                    SystemPowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 4L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 16L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 65L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 66L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SystemPowerLevel.typeLayout(), (4).toInt())
                        ).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 196L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 200L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 217L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 218L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 219L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 220L),
                    )
                override fun writeNative(addr: Long, value: SystemPowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 4L, value.powerButton)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 16L, value.sleepButton)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 28L, value.lidClose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.lidOpenWake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.reserved)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 48L, value.idle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.idleTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 64L, value.idleSensitivity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 65L, value.dynamicThrottle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 66L, value.spare2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.minSleep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.maxSleep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.reducedLatencySleep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.winLogonFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.spare3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dozeS4Timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.broadcastCapacityResolution)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SystemPowerLevel.typeLayout(), (4).toInt())
                    ).writeNative(addr + 96L, value.dischargePolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.videoTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 196L, value.videoDimDisplay)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 200L, value.videoReserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.spindownTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 216L, value.optimizeForPower)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 217L, value.fanThrottleTolerance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 218L, value.forcedThrottle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 219L, value.minThrottle)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 220L, value.overThrottled)
                }
            }
    }
}

public data class SystemPowerStatus(
    public var aCLineStatus: UByte = 0u,
    public var batteryFlag: UByte = 0u,
    public var batteryLifePercent: UByte = 0u,
    public var systemStatusFlag: UByte = 0u,
    public var batteryLifeTime: UInt = 0u,
    public var batteryFullLifeTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPowerStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SystemPowerStatus =
                    SystemPowerStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemPowerStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.aCLineStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.batteryFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.batteryLifePercent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.systemStatusFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.batteryLifeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.batteryFullLifeTime)
                }
            }
    }
}

public class ThermalEvent internal constructor(
    public var version: UInt,
    public var size: UInt,
    public var type: UInt,
    public var temperature: UInt,
    public var tripPointTemperature: UInt,
    initiatorCtorArg: Pwstr,
) {
    public var initiator: Pwstr = initiatorCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        size = 0u,
        type = 0u,
        temperature = 0u,
        tripPointTemperature = 0u,
        initiatorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.size

    public operator fun component3(): UInt = this.type

    public operator fun component4(): UInt = this.temperature

    public operator fun component5(): UInt = this.tripPointTemperature

    public operator fun component6(): Pwstr = this.initiator

    public fun copy(version: UInt = this.version, size: UInt = this.size, type: UInt = this.type, temperature: UInt = this.temperature, tripPointTemperature: UInt = this.tripPointTemperature, initiator: Pwstr = this.initiator): ThermalEvent = ThermalEvent(version = version, size = size, type = type, temperature = temperature, tripPointTemperature = tripPointTemperature, initiatorCtorArg = initiator)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThermalEvent) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.type != other.type) return false
        if (this.temperature != other.temperature) return false
        if (this.tripPointTemperature != other.tripPointTemperature) return false
        if (this.initiator != other.initiator) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.temperature.hashCode()
        result = 31 * result + this.tripPointTemperature.hashCode()
        result = 31 * result + this.initiator.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            size: UInt = 0u,
            type: UInt = 0u,
            temperature: UInt = 0u,
            tripPointTemperature: UInt = 0u,
            initiator: Pwstr = MutPtr(0L),
        ): ThermalEvent =
            ThermalEvent(
                version = version,
                size = size,
                type = type,
                temperature = temperature,
                tripPointTemperature = tripPointTemperature,
                initiatorCtorArg = initiator,
            )
    }
}

public data class ThermalInformation(
    public var thermalStamp: UInt = 0u,
    public var thermalConstant1: UInt = 0u,
    public var thermalConstant2: UInt = 0u,
    public var processors: Int = 0,
    public var samplingPeriod: UInt = 0u,
    public var currentTemperature: UInt = 0u,
    public var passiveTripPoint: UInt = 0u,
    public var criticalTripPoint: UInt = 0u,
    public var activeTripPointCount: UByte = 0u,
    public var activeTripPoint: UIntArray = UIntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThermalInformation) return false
        if (this.thermalStamp != other.thermalStamp) return false
        if (this.thermalConstant1 != other.thermalConstant1) return false
        if (this.thermalConstant2 != other.thermalConstant2) return false
        if (this.processors != other.processors) return false
        if (this.samplingPeriod != other.samplingPeriod) return false
        if (this.currentTemperature != other.currentTemperature) return false
        if (this.passiveTripPoint != other.passiveTripPoint) return false
        if (this.criticalTripPoint != other.criticalTripPoint) return false
        if (this.activeTripPointCount != other.activeTripPointCount) return false
        if (!this.activeTripPoint.contentEquals(other.activeTripPoint)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.thermalStamp.hashCode()
        result = 31 * result + this.thermalConstant1.hashCode()
        result = 31 * result + this.thermalConstant2.hashCode()
        result = 31 * result + this.processors.hashCode()
        result = 31 * result + this.samplingPeriod.hashCode()
        result = 31 * result + this.currentTemperature.hashCode()
        result = 31 * result + this.passiveTripPoint.hashCode()
        result = 31 * result + this.criticalTripPoint.hashCode()
        result = 31 * result + this.activeTripPointCount.hashCode()
        result = 31 * result + this.activeTripPoint.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThermalInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThermalInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): ThermalInformation =
                    ThermalInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (10).toInt())
                        ).readNative(addr + 44L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ThermalInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.thermalStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.thermalConstant1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.thermalConstant2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.processors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.samplingPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.currentTemperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.passiveTripPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.criticalTripPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 40L, value.activeTripPointCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (10).toInt())
                    ).writeNative(addr + 44L, value.activeTripPoint.toList())
                }
            }
    }
}

public data class ThermalPolicy(
    public var version: UInt = 0u,
    public var waitForUpdate: Boolean = false,
    public var hibernate: Boolean = false,
    public var critical: Boolean = false,
    public var thermalStandby: Boolean = false,
    public var activationReasons: UInt = 0u,
    public var passiveLimit: UInt = 0u,
    public var activeLevel: UInt = 0u,
    public var overThrottled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThermalPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThermalPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ThermalPolicy =
                    ThermalPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: ThermalPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.waitForUpdate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.hibernate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.critical)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.thermalStandby)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.activationReasons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.passiveLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.activeLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.overThrottled)
                }
            }
    }
}

public data class ThermalWaitRead(
    public var timeout: UInt = 0u,
    public var lowTemperature: UInt = 0u,
    public var highTemperature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThermalWaitRead> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThermalWaitRead> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ThermalWaitRead =
                    ThermalWaitRead(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ThermalWaitRead) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lowTemperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.highTemperature)
                }
            }
    }
}

public class UserPowerPolicy(
    public var revision: UInt = 0u,
    public var idleAc: PowerActionPolicy = PowerActionPolicy(),
    public var idleDc: PowerActionPolicy = PowerActionPolicy(),
    public var idleTimeoutAc: UInt = 0u,
    public var idleTimeoutDc: UInt = 0u,
    public var idleSensitivityAc: UByte = 0u,
    public var idleSensitivityDc: UByte = 0u,
    public var throttlePolicyAc: UByte = 0u,
    public var throttlePolicyDc: UByte = 0u,
    public var maxSleepAc: SystemPowerState = 0,
    public var maxSleepDc: SystemPowerState = 0,
    public var reserved: UIntArray = UIntArray(2),
    public var videoTimeoutAc: UInt = 0u,
    public var videoTimeoutDc: UInt = 0u,
    public var spindownTimeoutAc: UInt = 0u,
    public var spindownTimeoutDc: UInt = 0u,
    public var optimizeForPowerAc: Boolean = false,
    public var optimizeForPowerDc: Boolean = false,
    public var fanThrottleToleranceAc: UByte = 0u,
    public var fanThrottleToleranceDc: UByte = 0u,
    public var forcedThrottleAc: UByte = 0u,
    public var forcedThrottleDc: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserPowerPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserPowerPolicy> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): UserPowerPolicy =
                    UserPowerPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 4L),
                        (PowerActionPolicy.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 37L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 39L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 48L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 73L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 75L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 77L),
                    )
                override fun writeNative(addr: Long, value: UserPowerPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.revision)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 4L, value.idleAc)
                    (PowerActionPolicy.typeLayout()).writeNative(addr + 16L, value.idleDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.idleTimeoutAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.idleTimeoutDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.idleSensitivityAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 37L, value.idleSensitivityDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 38L, value.throttlePolicyAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 39L, value.throttlePolicyDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.maxSleepAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.maxSleepDc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 48L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.videoTimeoutAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.videoTimeoutDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.spindownTimeoutAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.spindownTimeoutDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 72L, value.optimizeForPowerAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 73L, value.optimizeForPowerDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 74L, value.fanThrottleToleranceAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 75L, value.fanThrottleToleranceDc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 76L, value.forcedThrottleAc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 77L, value.forcedThrottleDc)
                }
            }
    }
}

public data class WakeAlarmInformation(
    public var timerIdentifier: UInt = 0u,
    public var timeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WakeAlarmInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WakeAlarmInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WakeAlarmInformation =
                    WakeAlarmInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WakeAlarmInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timerIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeout)
                }
            }
    }
}
