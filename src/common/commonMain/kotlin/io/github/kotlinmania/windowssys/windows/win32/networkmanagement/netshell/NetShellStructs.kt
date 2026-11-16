package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netshell

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class CmdEntry internal constructor(
    pwszCmdTokenCtorArg: Pcwstr,
    public var pfnCmdHandler: PfnHandleCmd,
    public var dwShortCmdHelpToken: UInt,
    public var dwCmdHlpToken: UInt,
    public var dwFlags: UInt,
    public var pOsVersionCheck: PnsOsversioncheck,
    public var pfnCustomHelpFn: PfnCustomHelp,
) {
    public var pwszCmdToken: Pcwstr = pwszCmdTokenCtorArg
        internal set

    public constructor() : this(
        pwszCmdTokenCtorArg = ConstPtr(0L),
        pfnCmdHandler = null,
        dwShortCmdHelpToken = 0u,
        dwCmdHlpToken = 0u,
        dwFlags = 0u,
        pOsVersionCheck = null,
        pfnCustomHelpFn = null,
    )

    public operator fun component1(): Pcwstr = this.pwszCmdToken

    public operator fun component2(): PfnHandleCmd = this.pfnCmdHandler

    public operator fun component3(): UInt = this.dwShortCmdHelpToken

    public operator fun component4(): UInt = this.dwCmdHlpToken

    public operator fun component5(): UInt = this.dwFlags

    public operator fun component6(): PnsOsversioncheck = this.pOsVersionCheck

    public operator fun component7(): PfnCustomHelp = this.pfnCustomHelpFn

    public fun copy(pwszCmdToken: Pcwstr = this.pwszCmdToken, pfnCmdHandler: PfnHandleCmd = this.pfnCmdHandler, dwShortCmdHelpToken: UInt = this.dwShortCmdHelpToken, dwCmdHlpToken: UInt = this.dwCmdHlpToken, dwFlags: UInt = this.dwFlags, pOsVersionCheck: PnsOsversioncheck = this.pOsVersionCheck, pfnCustomHelpFn: PfnCustomHelp = this.pfnCustomHelpFn): CmdEntry = CmdEntry(pwszCmdTokenCtorArg = pwszCmdToken, pfnCmdHandler = pfnCmdHandler, dwShortCmdHelpToken = dwShortCmdHelpToken, dwCmdHlpToken = dwCmdHlpToken, dwFlags = dwFlags, pOsVersionCheck = pOsVersionCheck, pfnCustomHelpFn = pfnCustomHelpFn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmdEntry) return false
        if (this.pwszCmdToken != other.pwszCmdToken) return false
        if (this.pfnCmdHandler != other.pfnCmdHandler) return false
        if (this.dwShortCmdHelpToken != other.dwShortCmdHelpToken) return false
        if (this.dwCmdHlpToken != other.dwCmdHlpToken) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pOsVersionCheck != other.pOsVersionCheck) return false
        if (this.pfnCustomHelpFn != other.pfnCustomHelpFn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszCmdToken.hashCode()
        result = 31 * result + this.pfnCmdHandler.hashCode()
        result = 31 * result + this.dwShortCmdHelpToken.hashCode()
        result = 31 * result + this.dwCmdHlpToken.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pOsVersionCheck.hashCode()
        result = 31 * result + this.pfnCustomHelpFn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszCmdToken: Pcwstr = ConstPtr(0L),
            pfnCmdHandler: PfnHandleCmd = null,
            dwShortCmdHelpToken: UInt = 0u,
            dwCmdHlpToken: UInt = 0u,
            dwFlags: UInt = 0u,
            pOsVersionCheck: PnsOsversioncheck = null,
            pfnCustomHelpFn: PfnCustomHelp = null,
        ): CmdEntry =
            CmdEntry(
                pwszCmdTokenCtorArg = pwszCmdToken,
                pfnCmdHandler = pfnCmdHandler,
                dwShortCmdHelpToken = dwShortCmdHelpToken,
                dwCmdHlpToken = dwCmdHlpToken,
                dwFlags = dwFlags,
                pOsVersionCheck = pOsVersionCheck,
                pfnCustomHelpFn = pfnCustomHelpFn,
            )
    }
}

public class CmdGroupEntry internal constructor(
    pwszCmdGroupTokenCtorArg: Pcwstr,
    public var dwShortCmdHelpToken: UInt,
    public var ulCmdGroupSize: UInt,
    public var dwFlags: UInt,
    pCmdGroupCtorArg: MutPtr,
    public var pOsVersionCheck: PnsOsversioncheck,
) {
    public var pwszCmdGroupToken: Pcwstr = pwszCmdGroupTokenCtorArg
        internal set

    public var pCmdGroup: MutPtr = pCmdGroupCtorArg
        internal set

    public constructor() : this(
        pwszCmdGroupTokenCtorArg = ConstPtr(0L),
        dwShortCmdHelpToken = 0u,
        ulCmdGroupSize = 0u,
        dwFlags = 0u,
        pCmdGroupCtorArg = MutPtr(0L),
        pOsVersionCheck = null,
    )

    public operator fun component1(): Pcwstr = this.pwszCmdGroupToken

    public operator fun component2(): UInt = this.dwShortCmdHelpToken

    public operator fun component3(): UInt = this.ulCmdGroupSize

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): MutPtr = this.pCmdGroup

    public operator fun component6(): PnsOsversioncheck = this.pOsVersionCheck

    public fun copy(pwszCmdGroupToken: Pcwstr = this.pwszCmdGroupToken, dwShortCmdHelpToken: UInt = this.dwShortCmdHelpToken, ulCmdGroupSize: UInt = this.ulCmdGroupSize, dwFlags: UInt = this.dwFlags, pCmdGroup: MutPtr = this.pCmdGroup, pOsVersionCheck: PnsOsversioncheck = this.pOsVersionCheck): CmdGroupEntry = CmdGroupEntry(pwszCmdGroupTokenCtorArg = pwszCmdGroupToken, dwShortCmdHelpToken = dwShortCmdHelpToken, ulCmdGroupSize = ulCmdGroupSize, dwFlags = dwFlags, pCmdGroupCtorArg = pCmdGroup, pOsVersionCheck = pOsVersionCheck)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmdGroupEntry) return false
        if (this.pwszCmdGroupToken != other.pwszCmdGroupToken) return false
        if (this.dwShortCmdHelpToken != other.dwShortCmdHelpToken) return false
        if (this.ulCmdGroupSize != other.ulCmdGroupSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pCmdGroup != other.pCmdGroup) return false
        if (this.pOsVersionCheck != other.pOsVersionCheck) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszCmdGroupToken.hashCode()
        result = 31 * result + this.dwShortCmdHelpToken.hashCode()
        result = 31 * result + this.ulCmdGroupSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pCmdGroup.hashCode()
        result = 31 * result + this.pOsVersionCheck.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszCmdGroupToken: Pcwstr = ConstPtr(0L),
            dwShortCmdHelpToken: UInt = 0u,
            ulCmdGroupSize: UInt = 0u,
            dwFlags: UInt = 0u,
            pCmdGroup: MutPtr = MutPtr(0L),
            pOsVersionCheck: PnsOsversioncheck = null,
        ): CmdGroupEntry =
            CmdGroupEntry(
                pwszCmdGroupTokenCtorArg = pwszCmdGroupToken,
                dwShortCmdHelpToken = dwShortCmdHelpToken,
                ulCmdGroupSize = ulCmdGroupSize,
                dwFlags = dwFlags,
                pCmdGroupCtorArg = pCmdGroup,
                pOsVersionCheck = pOsVersionCheck,
            )
    }
}

public class NsContextAttributes internal constructor(
    public var anonymous: NsContextAttributes0,
    pwszContextCtorArg: Pwstr,
    public var guidHelper: Guid,
    public var dwFlags: UInt,
    public var ulPriority: UInt,
    public var ulNumTopCmds: UInt,
    pTopCmdsCtorArg: MutPtr,
    public var ulNumGroups: UInt,
    pCmdGroupsCtorArg: MutPtr,
    public var pfnCommitFn: PnsContextCommitFn,
    public var pfnDumpFn: PnsContextDumpFn,
    public var pfnConnectFn: PnsContextConnectFn,
    pReservedCtorArg: MutPtr,
    public var pfnOsVersionCheck: PnsOsversioncheck,
) {
    public var pwszContext: Pwstr = pwszContextCtorArg
        internal set

    public var pTopCmds: MutPtr = pTopCmdsCtorArg
        internal set

    public var pCmdGroups: MutPtr = pCmdGroupsCtorArg
        internal set

    public var pReserved: MutPtr = pReservedCtorArg
        internal set

    public constructor() : this(
        anonymous = NsContextAttributes0(),
        pwszContextCtorArg = MutPtr(0L),
        guidHelper = Guid(),
        dwFlags = 0u,
        ulPriority = 0u,
        ulNumTopCmds = 0u,
        pTopCmdsCtorArg = MutPtr(0L),
        ulNumGroups = 0u,
        pCmdGroupsCtorArg = MutPtr(0L),
        pfnCommitFn = null,
        pfnDumpFn = null,
        pfnConnectFn = null,
        pReservedCtorArg = MutPtr(0L),
        pfnOsVersionCheck = null,
    )

    public operator fun component1(): NsContextAttributes0 = this.anonymous

    public operator fun component2(): Pwstr = this.pwszContext

    public operator fun component3(): Guid = this.guidHelper

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): UInt = this.ulPriority

    public operator fun component6(): UInt = this.ulNumTopCmds

    public operator fun component7(): MutPtr = this.pTopCmds

    public operator fun component8(): UInt = this.ulNumGroups

    public operator fun component9(): MutPtr = this.pCmdGroups

    public operator fun component10(): PnsContextCommitFn = this.pfnCommitFn

    public operator fun component11(): PnsContextDumpFn = this.pfnDumpFn

    public operator fun component12(): PnsContextConnectFn = this.pfnConnectFn

    public operator fun component13(): MutPtr = this.pReserved

    public operator fun component14(): PnsOsversioncheck = this.pfnOsVersionCheck

    public fun copy(anonymous: NsContextAttributes0 = this.anonymous, pwszContext: Pwstr = this.pwszContext, guidHelper: Guid = this.guidHelper, dwFlags: UInt = this.dwFlags, ulPriority: UInt = this.ulPriority, ulNumTopCmds: UInt = this.ulNumTopCmds, pTopCmds: MutPtr = this.pTopCmds, ulNumGroups: UInt = this.ulNumGroups, pCmdGroups: MutPtr = this.pCmdGroups, pfnCommitFn: PnsContextCommitFn = this.pfnCommitFn, pfnDumpFn: PnsContextDumpFn = this.pfnDumpFn, pfnConnectFn: PnsContextConnectFn = this.pfnConnectFn, pReserved: MutPtr = this.pReserved, pfnOsVersionCheck: PnsOsversioncheck = this.pfnOsVersionCheck): NsContextAttributes = NsContextAttributes(anonymous = anonymous, pwszContextCtorArg = pwszContext, guidHelper = guidHelper, dwFlags = dwFlags, ulPriority = ulPriority, ulNumTopCmds = ulNumTopCmds, pTopCmdsCtorArg = pTopCmds, ulNumGroups = ulNumGroups, pCmdGroupsCtorArg = pCmdGroups, pfnCommitFn = pfnCommitFn, pfnDumpFn = pfnDumpFn, pfnConnectFn = pfnConnectFn, pReservedCtorArg = pReserved, pfnOsVersionCheck = pfnOsVersionCheck)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NsContextAttributes) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pwszContext != other.pwszContext) return false
        if (this.guidHelper != other.guidHelper) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ulPriority != other.ulPriority) return false
        if (this.ulNumTopCmds != other.ulNumTopCmds) return false
        if (this.pTopCmds != other.pTopCmds) return false
        if (this.ulNumGroups != other.ulNumGroups) return false
        if (this.pCmdGroups != other.pCmdGroups) return false
        if (this.pfnCommitFn != other.pfnCommitFn) return false
        if (this.pfnDumpFn != other.pfnDumpFn) return false
        if (this.pfnConnectFn != other.pfnConnectFn) return false
        if (this.pReserved != other.pReserved) return false
        if (this.pfnOsVersionCheck != other.pfnOsVersionCheck) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.pwszContext.hashCode()
        result = 31 * result + this.guidHelper.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.ulPriority.hashCode()
        result = 31 * result + this.ulNumTopCmds.hashCode()
        result = 31 * result + this.pTopCmds.hashCode()
        result = 31 * result + this.ulNumGroups.hashCode()
        result = 31 * result + this.pCmdGroups.hashCode()
        result = 31 * result + this.pfnCommitFn.hashCode()
        result = 31 * result + this.pfnDumpFn.hashCode()
        result = 31 * result + this.pfnConnectFn.hashCode()
        result = 31 * result + this.pReserved.hashCode()
        result = 31 * result + this.pfnOsVersionCheck.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: NsContextAttributes0 = NsContextAttributes0(),
            pwszContext: Pwstr = MutPtr(0L),
            guidHelper: Guid = Guid(),
            dwFlags: UInt = 0u,
            ulPriority: UInt = 0u,
            ulNumTopCmds: UInt = 0u,
            pTopCmds: MutPtr = MutPtr(0L),
            ulNumGroups: UInt = 0u,
            pCmdGroups: MutPtr = MutPtr(0L),
            pfnCommitFn: PnsContextCommitFn = null,
            pfnDumpFn: PnsContextDumpFn = null,
            pfnConnectFn: PnsContextConnectFn = null,
            pReserved: MutPtr = MutPtr(0L),
            pfnOsVersionCheck: PnsOsversioncheck = null,
        ): NsContextAttributes =
            NsContextAttributes(
                anonymous = anonymous,
                pwszContextCtorArg = pwszContext,
                guidHelper = guidHelper,
                dwFlags = dwFlags,
                ulPriority = ulPriority,
                ulNumTopCmds = ulNumTopCmds,
                pTopCmdsCtorArg = pTopCmds,
                ulNumGroups = ulNumGroups,
                pCmdGroupsCtorArg = pCmdGroups,
                pfnCommitFn = pfnCommitFn,
                pfnDumpFn = pfnDumpFn,
                pfnConnectFn = pfnConnectFn,
                pReservedCtorArg = pReserved,
                pfnOsVersionCheck = pfnOsVersionCheck,
            )
    }
}

public data class NsContextAttributes0(
    public var anonymous: NsContextAttributes00 = NsContextAttributes00(),
    public var ullAlign: ULong = 0uL,
)

public data class NsContextAttributes00(
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NsContextAttributes00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NsContextAttributes00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NsContextAttributes00 =
                    NsContextAttributes00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NsContextAttributes00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                }
            }
    }
}

public data class NsHelperAttributes(
    public var anonymous: NsHelperAttributes0 = NsHelperAttributes0(),
    public var guidHelper: Guid = Guid(),
    public var pfnStart: PnsHelperStartFn = null,
    public var pfnStop: PnsHelperStopFn = null,
)

public data class NsHelperAttributes0(
    public var anonymous: NsHelperAttributes00 = NsHelperAttributes00(),
    public var ullAlign: ULong = 0uL,
)

public data class NsHelperAttributes00(
    public var dwVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NsHelperAttributes00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NsHelperAttributes00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): NsHelperAttributes00 =
                    NsHelperAttributes00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NsHelperAttributes00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                }
            }
    }
}

public class TagType internal constructor(
    pwszTagCtorArg: Pcwstr,
    public var dwRequired: UInt,
    public var bPresent: Bool,
) {
    public var pwszTag: Pcwstr = pwszTagCtorArg
        internal set

    public constructor() : this(
        pwszTagCtorArg = ConstPtr(0L),
        dwRequired = 0u,
        bPresent = 0,
    )

    public operator fun component1(): Pcwstr = this.pwszTag

    public operator fun component2(): UInt = this.dwRequired

    public operator fun component3(): Bool = this.bPresent

    public fun copy(pwszTag: Pcwstr = this.pwszTag, dwRequired: UInt = this.dwRequired, bPresent: Bool = this.bPresent): TagType = TagType(pwszTagCtorArg = pwszTag, dwRequired = dwRequired, bPresent = bPresent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TagType) return false
        if (this.pwszTag != other.pwszTag) return false
        if (this.dwRequired != other.dwRequired) return false
        if (this.bPresent != other.bPresent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszTag.hashCode()
        result = 31 * result + this.dwRequired.hashCode()
        result = 31 * result + this.bPresent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszTag: Pcwstr = ConstPtr(0L),
            dwRequired: UInt = 0u,
            bPresent: Bool = 0,
        ): TagType =
            TagType(
                pwszTagCtorArg = pwszTag,
                dwRequired = dwRequired,
                bPresent = bPresent,
            )
    }
}

public class TokenValue internal constructor(
    pwszTokenCtorArg: Pcwstr,
    public var dwValue: UInt,
) {
    public var pwszToken: Pcwstr = pwszTokenCtorArg
        internal set

    public constructor() : this(
        pwszTokenCtorArg = ConstPtr(0L),
        dwValue = 0u,
    )

    public operator fun component1(): Pcwstr = this.pwszToken

    public operator fun component2(): UInt = this.dwValue

    public fun copy(pwszToken: Pcwstr = this.pwszToken, dwValue: UInt = this.dwValue): TokenValue = TokenValue(pwszTokenCtorArg = pwszToken, dwValue = dwValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TokenValue) return false
        if (this.pwszToken != other.pwszToken) return false
        if (this.dwValue != other.dwValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszToken.hashCode()
        result = 31 * result + this.dwValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszToken: Pcwstr = ConstPtr(0L),
            dwValue: UInt = 0u,
        ): TokenValue =
            TokenValue(
                pwszTokenCtorArg = pwszToken,
                dwValue = dwValue,
            )
    }
}
