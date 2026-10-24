// port-lint: source Windows/Win32/Devices/Beep/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.devices.beep

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public const val BEEP_FREQUENCY_MAXIMUM: UInt = 32767u
public const val BEEP_FREQUENCY_MINIMUM: UInt = 37u

public data class BEEP_SET_PARAMETERS(
    public var Frequency: UInt = 0u,
    public var Duration: UInt = 0u,
)

public val DD_BEEP_DEVICE_NAME: PCSTR = s("\\Device\\Beep")
public val DD_BEEP_DEVICE_NAME_U: PCWSTR = w("\\Device\\Beep")
public const val IOCTL_BEEP_SET: UInt = 65536u
