package io.github.kotlinmania.windowssys.windows.win32.devices.pwm

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val GUID_DEVINTERFACE_PWM_CONTROLLER: GUID = GUID.from_u128(U128(0x60824b4ceed14c9cuL, 0xb49c1b961461a819uL))

public val GUID_DEVINTERFACE_PWM_CONTROLLER_WSZ: PCWSTR = w("{60824B4C-EED1-4C9C-B49C-1B961461A819}")

public val IOCTL_PWM_CONTROLLER_GET_ACTUAL_PERIOD: UInt = 262148u

public val IOCTL_PWM_CONTROLLER_GET_INFO: UInt = 262144u

public val IOCTL_PWM_CONTROLLER_SET_DESIRED_PERIOD: UInt = 294920u

public val IOCTL_PWM_PIN_GET_ACTIVE_DUTY_CYCLE_PERCENTAGE: UInt = 262544u

public val IOCTL_PWM_PIN_GET_POLARITY: UInt = 262552u

public val IOCTL_PWM_PIN_IS_STARTED: UInt = 262568u

public val IOCTL_PWM_PIN_SET_ACTIVE_DUTY_CYCLE_PERCENTAGE: UInt = 295316u

public val IOCTL_PWM_PIN_SET_POLARITY: UInt = 295324u

public val IOCTL_PWM_PIN_START: UInt = 295331u

public val IOCTL_PWM_PIN_STOP: UInt = 295335u

public val PWM_ACTIVE_HIGH: PWM_POLARITY = 0

public val PWM_ACTIVE_LOW: PWM_POLARITY = 1

public val PWM_IOCTL_ID_CONTROLLER_GET_ACTUAL_PERIOD: Int = 1

public val PWM_IOCTL_ID_CONTROLLER_GET_INFO: Int = 0

public val PWM_IOCTL_ID_CONTROLLER_SET_DESIRED_PERIOD: Int = 2

public val PWM_IOCTL_ID_PIN_GET_ACTIVE_DUTY_CYCLE_PERCENTAGE: Int = 100

public val PWM_IOCTL_ID_PIN_GET_POLARITY: Int = 102

public val PWM_IOCTL_ID_PIN_IS_STARTED: Int = 106

public val PWM_IOCTL_ID_PIN_SET_ACTIVE_DUTY_CYCLE_PERCENTAGE: Int = 101

public val PWM_IOCTL_ID_PIN_SET_POLARITY: Int = 103

public val PWM_IOCTL_ID_PIN_START: Int = 104

public val PWM_IOCTL_ID_PIN_STOP: Int = 105
