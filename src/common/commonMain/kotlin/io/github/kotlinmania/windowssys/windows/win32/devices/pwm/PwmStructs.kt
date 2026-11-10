package io.github.kotlinmania.windowssys.windows.win32.devices.pwm

public data class PwmControllerGetActualPeriodOutput(public var actualPeriod: ULong = 0uL)

public data class PwmControllerInfo(
    public var size: Int = 0,
    public var pinCount: UInt = 0u,
    public var minimumPeriod: ULong = 0uL,
    public var maximumPeriod: ULong = 0uL,
)

public data class PwmControllerSetDesiredPeriodInput(public var desiredPeriod: ULong = 0uL)

public data class PwmControllerSetDesiredPeriodOutput(public var actualPeriod: ULong = 0uL)

public data class PwmPinGetActiveDutyCyclePercentageOutput(public var percentage: ULong = 0uL)

public data class PwmPinGetPolarityOutput(public var polarity: PwmPolarity = 0)

public data class PwmPinIsStartedOutput(public var isStarted: Boolean = false)

public data class PwmPinSetActiveDutyCyclePercentageInput(public var percentage: ULong = 0uL)

public data class PwmPinSetPolarityInput(public var polarity: PwmPolarity = 0)
