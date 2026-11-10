package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class CmdEntry(
    public var pwszCmdToken: Pcwstr = null,
    public var pfnCmdHandler: PfnHandleCmd = null,
    public var dwShortCmdHelpToken: UInt = 0u,
    public var dwCmdHlpToken: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pOsVersionCheck: PnsOsversioncheck = null,
    public var pfnCustomHelpFn: PfnCustomHelp = null,
)

public data class CmdGroupEntry(
    public var pwszCmdGroupToken: Pcwstr = null,
    public var dwShortCmdHelpToken: UInt = 0u,
    public var ulCmdGroupSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pCmdGroup: CmdEntry? = null,
    public var pOsVersionCheck: PnsOsversioncheck = null,
)

public data class NsContextAttributes(
    public var anonymous: NsContextAttributes0 = NsContextAttributes0(),
    public var pwszContext: Pwstr = null,
    public var guidHelper: Guid = Guid(),
    public var dwFlags: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var ulNumTopCmds: UInt = 0u,
    public var pTopCmds: CmdEntry? = null,
    public var ulNumGroups: UInt = 0u,
    public var pCmdGroups: CmdGroupEntry? = null,
    public var pfnCommitFn: PnsContextCommitFn = null,
    public var pfnDumpFn: PnsContextDumpFn = null,
    public var pfnConnectFn: PnsContextConnectFn = null,
    public var pReserved: COpaquePointer? = null,
    public var pfnOsVersionCheck: PnsOsversioncheck = null,
)

public data class NsContextAttributes0(public var anonymous: NsContextAttributes00 = NsContextAttributes00(), public var ullAlign: ULong = 0uL)

public data class NsContextAttributes00(public var dwVersion: UInt = 0u, public var dwReserved: UInt = 0u)

public data class NsHelperAttributes(
    public var anonymous: NsHelperAttributes0 = NsHelperAttributes0(),
    public var guidHelper: Guid = Guid(),
    public var pfnStart: PnsHelperStartFn = null,
    public var pfnStop: PnsHelperStopFn = null,
)

public data class NsHelperAttributes0(public var anonymous: NsHelperAttributes00 = NsHelperAttributes00(), public var ullAlign: ULong = 0uL)

public data class NsHelperAttributes00(public var dwVersion: UInt = 0u, public var dwReserved: UInt = 0u)

public data class TagType(
    public var pwszTag: Pcwstr = null,
    public var dwRequired: UInt = 0u,
    public var bPresent: Bool = 0,
)

public data class TokenValue(public var pwszToken: Pcwstr = null, public var dwValue: UInt = 0u)
