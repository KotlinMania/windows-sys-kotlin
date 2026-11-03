package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class FW_DYNAMIC_KEYWORD_ADDRESS0(
    public var id: GUID = GUID(),
    public var keyword: PCWSTR = 0L,
    public var flags: UInt = 0u,
    public var addresses: PCWSTR = 0L,
)

public data class FW_DYNAMIC_KEYWORD_ADDRESS_DATA0(
    public var dynamicKeywordAddress: FW_DYNAMIC_KEYWORD_ADDRESS0 = FW_DYNAMIC_KEYWORD_ADDRESS0(),
    public var next: Long = 0L,
    public var schemaVersion: UShort = 0u,
    public var originType: FW_DYNAMIC_KEYWORD_ORIGIN_TYPE = 0,
)

public data class INET_FIREWALL_AC_BINARIES(public var count: UInt = 0u, public var binaries: Long = 0L)

public data class INET_FIREWALL_AC_CAPABILITIES(public var count: UInt = 0u, public var capabilities: Long = 0L)

public data class INET_FIREWALL_AC_CHANGE(
    public var changeType: INET_FIREWALL_AC_CHANGE_TYPE = 0,
    public var createType: INET_FIREWALL_AC_CREATION_TYPE = 0,
    public var appContainerSid: Long = 0L,
    public var userSid: Long = 0L,
    public var displayName: PWSTR = 0L,
    public var Anonymous: INET_FIREWALL_AC_CHANGE_0 = INET_FIREWALL_AC_CHANGE_0(),
)

public data class INET_FIREWALL_AC_CHANGE_0(public var capabilities: INET_FIREWALL_AC_CAPABILITIES = INET_FIREWALL_AC_CAPABILITIES(), public var binaries: INET_FIREWALL_AC_BINARIES = INET_FIREWALL_AC_BINARIES())

public data class INET_FIREWALL_APP_CONTAINER(
    public var appContainerSid: Long = 0L,
    public var userSid: Long = 0L,
    public var appContainerName: PWSTR = 0L,
    public var displayName: PWSTR = 0L,
    public var description: PWSTR = 0L,
    public var capabilities: INET_FIREWALL_AC_CAPABILITIES = INET_FIREWALL_AC_CAPABILITIES(),
    public var binaries: INET_FIREWALL_AC_BINARIES = INET_FIREWALL_AC_BINARIES(),
    public var workingDirectory: PWSTR = 0L,
    public var packageFullName: PWSTR = 0L,
)

public data class NETCON_PROPERTIES(
    public var guidId: GUID = GUID(),
    public var pszwName: PWSTR = 0L,
    public var pszwDeviceName: PWSTR = 0L,
    public var Status: NETCON_STATUS = 0,
    public var MediaType: NETCON_MEDIATYPE = 0,
    public var dwCharacter: UInt = 0u,
    public var clsidThisObject: GUID = GUID(),
    public var clsidUiObject: GUID = GUID(),
)
