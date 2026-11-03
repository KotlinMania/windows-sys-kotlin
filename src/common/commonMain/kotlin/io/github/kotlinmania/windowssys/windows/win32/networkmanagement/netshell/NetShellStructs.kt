package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class CMD_ENTRY(
    public var pwszCmdToken: PCWSTR = 0L,
    public var pfnCmdHandler: PFN_HANDLE_CMD = null,
    public var dwShortCmdHelpToken: UInt = 0u,
    public var dwCmdHlpToken: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pOsVersionCheck: PNS_OSVERSIONCHECK = null,
    public var pfnCustomHelpFn: PFN_CUSTOM_HELP = null,
)

public data class CMD_GROUP_ENTRY(
    public var pwszCmdGroupToken: PCWSTR = 0L,
    public var dwShortCmdHelpToken: UInt = 0u,
    public var ulCmdGroupSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pCmdGroup: Long = 0L,
    public var pOsVersionCheck: PNS_OSVERSIONCHECK = null,
)

public data class NS_CONTEXT_ATTRIBUTES(
    public var Anonymous: NS_CONTEXT_ATTRIBUTES_0 = NS_CONTEXT_ATTRIBUTES_0(),
    public var pwszContext: PWSTR = 0L,
    public var guidHelper: GUID = GUID(),
    public var dwFlags: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var ulNumTopCmds: UInt = 0u,
    public var pTopCmds: Long = 0L,
    public var ulNumGroups: UInt = 0u,
    public var pCmdGroups: Long = 0L,
    public var pfnCommitFn: PNS_CONTEXT_COMMIT_FN = null,
    public var pfnDumpFn: PNS_CONTEXT_DUMP_FN = null,
    public var pfnConnectFn: PNS_CONTEXT_CONNECT_FN = null,
    public var pReserved: Long = 0L,
    public var pfnOsVersionCheck: PNS_OSVERSIONCHECK = null,
)

public data class NS_CONTEXT_ATTRIBUTES_0(public var Anonymous: NS_CONTEXT_ATTRIBUTES_0_0 = NS_CONTEXT_ATTRIBUTES_0_0(), public var _ullAlign: ULong = 0uL)

public data class NS_CONTEXT_ATTRIBUTES_0_0(public var dwVersion: UInt = 0u, public var dwReserved: UInt = 0u)

public data class NS_HELPER_ATTRIBUTES(
    public var Anonymous: NS_HELPER_ATTRIBUTES_0 = NS_HELPER_ATTRIBUTES_0(),
    public var guidHelper: GUID = GUID(),
    public var pfnStart: PNS_HELPER_START_FN = null,
    public var pfnStop: PNS_HELPER_STOP_FN = null,
)

public data class NS_HELPER_ATTRIBUTES_0(public var Anonymous: NS_HELPER_ATTRIBUTES_0_0 = NS_HELPER_ATTRIBUTES_0_0(), public var _ullAlign: ULong = 0uL)

public data class NS_HELPER_ATTRIBUTES_0_0(public var dwVersion: UInt = 0u, public var dwReserved: UInt = 0u)

public data class TAG_TYPE(
    public var pwszTag: PCWSTR = 0L,
    public var dwRequired: UInt = 0u,
    public var bPresent: BOOL = 0,
)

public data class TOKEN_VALUE(public var pwszToken: PCWSTR = 0L, public var dwValue: UInt = 0u)
