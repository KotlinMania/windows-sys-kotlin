package io.github.kotlinmania.windowssys.windows.win32.devices.nfp

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val DEVPKEY_NFP_Capabilities: Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0xfb3842cd9e2a4f83uL, 0x8fcc4b0761139ae9uL), pid = 2u)

public val GUID_DEVINTERFACE_NFP: GUID = GUID.from_u128(0xfb3842cd9e2a4f83uL, 0x8fcc4b0761139ae9uL)

public val IOCTL_NFP_DISABLE: UInt = 5308492u

public val IOCTL_NFP_ENABLE: UInt = 5308496u

public val IOCTL_NFP_GET_KILO_BYTES_PER_SECOND: UInt = 5308548u

public val IOCTL_NFP_GET_MAX_MESSAGE_BYTES: UInt = 5308544u

public val IOCTL_NFP_GET_NEXT_SUBSCRIBED_MESSAGE: UInt = 5308480u

public val IOCTL_NFP_GET_NEXT_TRANSMITTED_MESSAGE: UInt = 5308488u

public val IOCTL_NFP_SET_PAYLOAD: UInt = 5308484u
