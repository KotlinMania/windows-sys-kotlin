package io.github.kotlinmania.windowssys.windows.wdk.devices.bluetooth

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.DEVPROPKEY

public val DEVPKEY_Bluetooth_ClassOfDevice: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 10u)

public val DEVPKEY_Bluetooth_ClassOfDevice_Deprecated: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 4u)

public val DEVPKEY_Bluetooth_DeviceAddress: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 1u)

public val DEVPKEY_Bluetooth_DeviceFlags: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 3u)

public val DEVPKEY_Bluetooth_DeviceManufacturer: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 4u)

public val DEVPKEY_Bluetooth_DeviceModelNumber: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 5u)

public val DEVPKEY_Bluetooth_DevicePID: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 8u)

public val DEVPKEY_Bluetooth_DeviceProductVersion: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 9u)

public val DEVPKEY_Bluetooth_DeviceVID: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 7u)

public val DEVPKEY_Bluetooth_DeviceVIDSource: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 6u)

public val DEVPKEY_Bluetooth_LastConnectedTime: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 11u)

public val DEVPKEY_Bluetooth_LastConnectedTime_Deprecated: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 5u)

public val DEVPKEY_Bluetooth_LastSeenTime: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 12u)

public val DEVPKEY_Bluetooth_ServiceGUID: Win32.Foundation.DEVPROPKEY = DEVPROPKEY(fmtid = GUID.from_u128(0x2bd67d8b8beb48d5uL, 0x87e06cda3428040auL), pid = 2u)

public val GUID_BTHDDI_PROFILE_DRIVER_INTERFACE: GUID = GUID.from_u128(0x94a59aa843834286uL, 0xaa4f34a160f40004uL)

public val GUID_BTHDDI_SDP_NODE_INTERFACE: GUID = GUID.from_u128(0x81a7fdf386c14be8uL, 0xa8c82a6d188b4177uL)

public val GUID_BTHDDI_SDP_PARSE_INTERFACE: GUID = GUID.from_u128(0x4e7194399cf14babuL, 0xac1d3279865743d2uL)

public val GUID_BTH_DEVICE_INTERFACE: GUID = GUID.from_u128(0xf40965e89d4487uL, 0x989087c3abb211f4uL)
