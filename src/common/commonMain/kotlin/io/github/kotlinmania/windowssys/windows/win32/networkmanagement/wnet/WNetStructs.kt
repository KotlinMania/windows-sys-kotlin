package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public data class CONNECTDLGSTRUCTA(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var lpConnRes: Long = 0L,
    public var dwFlags: CONNECTDLGSTRUCT_FLAGS = 0u,
    public var dwDevNum: UInt = 0u,
)

public data class CONNECTDLGSTRUCTW(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var lpConnRes: Long = 0L,
    public var dwFlags: CONNECTDLGSTRUCT_FLAGS = 0u,
    public var dwDevNum: UInt = 0u,
)

public data class DISCDLGSTRUCTA(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var lpLocalName: PSTR = 0L,
    public var lpRemoteName: PSTR = 0L,
    public var dwFlags: DISCDLGSTRUCT_FLAGS = 0u,
)

public data class DISCDLGSTRUCTW(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var lpLocalName: PWSTR = 0L,
    public var lpRemoteName: PWSTR = 0L,
    public var dwFlags: DISCDLGSTRUCT_FLAGS = 0u,
)

public data class NETCONNECTINFOSTRUCT(
    public var cbStructure: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var dwDelay: UInt = 0u,
    public var dwOptDataSize: UInt = 0u,
)

public data class NETINFOSTRUCT(
    public var cbStructure: UInt = 0u,
    public var dwProviderVersion: UInt = 0u,
    public var dwStatus: WIN32_ERROR = 0u,
    public var dwCharacteristics: NETINFOSTRUCT_CHARACTERISTICS = 0u,
    public var dwHandle: ULong = 0uL,
    public var wNetType: UShort = 0u,
    public var dwPrinters: UInt = 0u,
    public var dwDrives: UInt = 0u,
)

public data class NETRESOURCEA(
    public var dwScope: NET_RESOURCE_SCOPE = 0u,
    public var dwType: NET_RESOURCE_TYPE = 0u,
    public var dwDisplayType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var lpLocalName: PSTR = 0L,
    public var lpRemoteName: PSTR = 0L,
    public var lpComment: PSTR = 0L,
    public var lpProvider: PSTR = 0L,
)

public data class NETRESOURCEW(
    public var dwScope: NET_RESOURCE_SCOPE = 0u,
    public var dwType: NET_RESOURCE_TYPE = 0u,
    public var dwDisplayType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var lpLocalName: PWSTR = 0L,
    public var lpRemoteName: PWSTR = 0L,
    public var lpComment: PWSTR = 0L,
    public var lpProvider: PWSTR = 0L,
)

public data class NOTIFYADD(
    public var hwndOwner: HWND = 0L,
    public var NetResource: NETRESOURCEA = NETRESOURCEA(),
    public var dwAddFlags: NET_CONNECT_FLAGS = 0u,
)

public data class NOTIFYCANCEL(
    public var lpName: PWSTR = 0L,
    public var lpProvider: PWSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var fForce: BOOL = 0,
)

public data class NOTIFYINFO(
    public var dwNotifyStatus: UInt = 0u,
    public var dwOperationStatus: UInt = 0u,
    public var lpContext: Long = 0L,
)

public data class REMOTE_NAME_INFOA(
    public var lpUniversalName: PSTR = 0L,
    public var lpConnectionName: PSTR = 0L,
    public var lpRemainingPath: PSTR = 0L,
)

public data class REMOTE_NAME_INFOW(
    public var lpUniversalName: PWSTR = 0L,
    public var lpConnectionName: PWSTR = 0L,
    public var lpRemainingPath: PWSTR = 0L,
)

public data class UNIVERSAL_NAME_INFOA(public var lpUniversalName: PSTR = 0L)

public data class UNIVERSAL_NAME_INFOW(public var lpUniversalName: PWSTR = 0L)
