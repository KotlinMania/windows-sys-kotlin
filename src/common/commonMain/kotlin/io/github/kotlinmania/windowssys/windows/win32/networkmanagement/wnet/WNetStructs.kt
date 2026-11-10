package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public data class Connectdlgstructa(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var lpConnRes: Netresourcea? = null,
    public var dwFlags: ConnectdlgstructFlags = 0u,
    public var dwDevNum: UInt = 0u,
)

public data class Connectdlgstructw(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var lpConnRes: Netresourcew? = null,
    public var dwFlags: ConnectdlgstructFlags = 0u,
    public var dwDevNum: UInt = 0u,
)

public data class Discdlgstructa(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var lpLocalName: Pstr = null,
    public var lpRemoteName: Pstr = null,
    public var dwFlags: DiscdlgstructFlags = 0u,
)

public data class Discdlgstructw(
    public var cbStructure: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var lpLocalName: Pwstr = null,
    public var lpRemoteName: Pwstr = null,
    public var dwFlags: DiscdlgstructFlags = 0u,
)

public data class Netconnectinfostruct(
    public var cbStructure: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var dwDelay: UInt = 0u,
    public var dwOptDataSize: UInt = 0u,
)

public data class Netinfostruct(
    public var cbStructure: UInt = 0u,
    public var dwProviderVersion: UInt = 0u,
    public var dwStatus: Win32Error = 0u,
    public var dwCharacteristics: NetinfostructCharacteristics = 0u,
    public var dwHandle: Int = 0,
    public var wNetType: UShort = 0u,
    public var dwPrinters: UInt = 0u,
    public var dwDrives: UInt = 0u,
)

public data class Netresourcea(
    public var dwScope: NetResourceScope = 0u,
    public var dwType: NetResourceType = 0u,
    public var dwDisplayType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var lpLocalName: Pstr = null,
    public var lpRemoteName: Pstr = null,
    public var lpComment: Pstr = null,
    public var lpProvider: Pstr = null,
)

public data class Netresourcew(
    public var dwScope: NetResourceScope = 0u,
    public var dwType: NetResourceType = 0u,
    public var dwDisplayType: UInt = 0u,
    public var dwUsage: UInt = 0u,
    public var lpLocalName: Pwstr = null,
    public var lpRemoteName: Pwstr = null,
    public var lpComment: Pwstr = null,
    public var lpProvider: Pwstr = null,
)

public data class Notifyadd(
    public var hwndOwner: Hwnd = null,
    public var netResource: Netresourcea = Netresourcea(),
    public var dwAddFlags: NetConnectFlags = 0u,
)

public data class Notifycancel(
    public var lpName: Pwstr = null,
    public var lpProvider: Pwstr = null,
    public var dwFlags: UInt = 0u,
    public var fForce: Bool = 0,
)

public data class Notifyinfo(
    public var dwNotifyStatus: UInt = 0u,
    public var dwOperationStatus: UInt = 0u,
    public var lpContext: COpaquePointer? = null,
)

public data class RemoteNameInfoa(
    public var lpUniversalName: Pstr = null,
    public var lpConnectionName: Pstr = null,
    public var lpRemainingPath: Pstr = null,
)

public data class RemoteNameInfow(
    public var lpUniversalName: Pwstr = null,
    public var lpConnectionName: Pwstr = null,
    public var lpRemainingPath: Pwstr = null,
)

public data class UniversalNameInfoa(
    public var lpUniversalName: Pstr = null,
)

public data class UniversalNameInfow(
    public var lpUniversalName: Pwstr = null,
)
