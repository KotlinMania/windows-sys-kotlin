package io.github.kotlinmania.windowssys.windows.win32.devices.pwm

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class PwmControllerGetActualPeriodOutput(
    public var actualPeriod: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerGetActualPeriodOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerGetActualPeriodOutput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PwmControllerGetActualPeriodOutput =
                    PwmControllerGetActualPeriodOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmControllerGetActualPeriodOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.actualPeriod)
                }
            }
    }
}

public data class PwmControllerInfo(
    public var size: Int = 0,
    public var pinCount: UInt = 0u,
    public var minimumPeriod: ULong = 0uL,
    public var maximumPeriod: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PwmControllerInfo =
                    PwmControllerInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PwmControllerInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pinCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.minimumPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.maximumPeriod)
                }
            }
    }
}

public data class PwmControllerSetDesiredPeriodInput(
    public var desiredPeriod: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerSetDesiredPeriodInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerSetDesiredPeriodInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PwmControllerSetDesiredPeriodInput =
                    PwmControllerSetDesiredPeriodInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmControllerSetDesiredPeriodInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.desiredPeriod)
                }
            }
    }
}

public data class PwmControllerSetDesiredPeriodOutput(
    public var actualPeriod: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerSetDesiredPeriodOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmControllerSetDesiredPeriodOutput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PwmControllerSetDesiredPeriodOutput =
                    PwmControllerSetDesiredPeriodOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmControllerSetDesiredPeriodOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.actualPeriod)
                }
            }
    }
}

public data class PwmPinGetActiveDutyCyclePercentageOutput(
    public var percentage: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinGetActiveDutyCyclePercentageOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinGetActiveDutyCyclePercentageOutput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PwmPinGetActiveDutyCyclePercentageOutput =
                    PwmPinGetActiveDutyCyclePercentageOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmPinGetActiveDutyCyclePercentageOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.percentage)
                }
            }
    }
}

public data class PwmPinGetPolarityOutput(
    public var polarity: PwmPolarity = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinGetPolarityOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinGetPolarityOutput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PwmPinGetPolarityOutput =
                    PwmPinGetPolarityOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmPinGetPolarityOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.polarity)
                }
            }
    }
}

public data class PwmPinIsStartedOutput(
    public var isStarted: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinIsStartedOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinIsStartedOutput> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PwmPinIsStartedOutput =
                    PwmPinIsStartedOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmPinIsStartedOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isStarted)
                }
            }
    }
}

public data class PwmPinSetActiveDutyCyclePercentageInput(
    public var percentage: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinSetActiveDutyCyclePercentageInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinSetActiveDutyCyclePercentageInput> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PwmPinSetActiveDutyCyclePercentageInput =
                    PwmPinSetActiveDutyCyclePercentageInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmPinSetActiveDutyCyclePercentageInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.percentage)
                }
            }
    }
}

public data class PwmPinSetPolarityInput(
    public var polarity: PwmPolarity = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinSetPolarityInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PwmPinSetPolarityInput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PwmPinSetPolarityInput =
                    PwmPinSetPolarityInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PwmPinSetPolarityInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.polarity)
                }
            }
    }
}
