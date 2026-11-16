package io.github.kotlinmania.windowssys.windows.win32.devices.beep

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val BEEP_FREQUENCY_MAXIMUM: UInt = 32767u

public val BEEP_FREQUENCY_MINIMUM: UInt = 37u

public val DD_BEEP_DEVICE_NAME: Pcstr = s("\\Device\\Beep")

public val DD_BEEP_DEVICE_NAME_U: Pcwstr = w("\\Device\\Beep")

public val IOCTL_BEEP_SET: UInt = 65536u
