package io.github.kotlinmania.windowssys.windows.win32.devices.pwm

public data class PWM_CONTROLLER_GET_ACTUAL_PERIOD_OUTPUT(public var ActualPeriod: ULong = 0uL)

public data class PWM_CONTROLLER_INFO(
    public var Size: ULong = 0uL,
    public var PinCount: UInt = 0u,
    public var MinimumPeriod: ULong = 0uL,
    public var MaximumPeriod: ULong = 0uL,
)

public data class PWM_CONTROLLER_SET_DESIRED_PERIOD_INPUT(public var DesiredPeriod: ULong = 0uL)

public data class PWM_CONTROLLER_SET_DESIRED_PERIOD_OUTPUT(public var ActualPeriod: ULong = 0uL)

public data class PWM_PIN_GET_ACTIVE_DUTY_CYCLE_PERCENTAGE_OUTPUT(public var Percentage: ULong = 0uL)

public data class PWM_PIN_GET_POLARITY_OUTPUT(public var Polarity: PWM_POLARITY = 0)

public data class PWM_PIN_IS_STARTED_OUTPUT(public var IsStarted: Boolean = false)

public data class PWM_PIN_SET_ACTIVE_DUTY_CYCLE_PERCENTAGE_INPUT(public var Percentage: ULong = 0uL)

public data class PWM_PIN_SET_POLARITY_INPUT(public var Polarity: PWM_POLARITY = 0)
