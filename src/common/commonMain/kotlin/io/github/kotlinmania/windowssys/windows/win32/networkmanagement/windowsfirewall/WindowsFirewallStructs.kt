package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

public data class FwDynamicKeywordAddress0(
    public var id: Guid = Guid(),
    public var keyword: Pcwstr = null,
    public var flags: UInt = 0u,
    public var addresses: Pcwstr = null,
)

public data class FwDynamicKeywordAddressData0(
    public var dynamicKeywordAddress: FwDynamicKeywordAddress0 = FwDynamicKeywordAddress0(),
    public var next: FwDynamicKeywordAddressData0? = null,
    public var schemaVersion: UShort = 0u,
    public var originType: FwDynamicKeywordOriginType = 0,
)

public data class InetFirewallAcBinaries(
    public var count: UInt = 0u,
    public var binaries: Pwstr? = null,
)

public data class InetFirewallAcCapabilities(
    public var count: UInt = 0u,
    public var capabilities: SidAndAttributes? = null,
)

public data class InetFirewallAcChange(
    public var changeType: InetFirewallAcChangeType = 0,
    public var createType: InetFirewallAcCreationType = 0,
    public var appContainerSid: Sid? = null,
    public var userSid: Sid? = null,
    public var displayName: Pwstr = null,
    public var anonymous: InetFirewallAcChange0 = InetFirewallAcChange0(),
)

public data class InetFirewallAcChange0(
    public var capabilities: InetFirewallAcCapabilities = InetFirewallAcCapabilities(),
    public var binaries: InetFirewallAcBinaries = InetFirewallAcBinaries(),
)

public data class InetFirewallAppContainer(
    public var appContainerSid: Sid? = null,
    public var userSid: Sid? = null,
    public var appContainerName: Pwstr = null,
    public var displayName: Pwstr = null,
    public var description: Pwstr = null,
    public var capabilities: InetFirewallAcCapabilities = InetFirewallAcCapabilities(),
    public var binaries: InetFirewallAcBinaries = InetFirewallAcBinaries(),
    public var workingDirectory: Pwstr = null,
    public var packageFullName: Pwstr = null,
)

public data class NetconProperties(
    public var guidId: Guid = Guid(),
    public var pszwName: Pwstr = null,
    public var pszwDeviceName: Pwstr = null,
    public var status: NetconStatus = 0,
    public var mediaType: NetconMediatype = 0,
    public var dwCharacter: UInt = 0u,
    public var clsidThisObject: Guid = Guid(),
    public var clsidUiObject: Guid = Guid(),
)
