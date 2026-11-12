@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.grouppolicy

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray

public class Gpobrowseinfo internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    hwndOwnerCtorArg: Hwnd,
    lpTitleCtorArg: Pwstr,
    lpInitialOUCtorArg: Pwstr,
    lpDSPathCtorArg: Pwstr,
    public var dwDSPathSize: UInt,
    lpNameCtorArg: Pwstr,
    public var dwNameSize: UInt,
    public var gpoType: GroupPolicyObjectType,
    public var gpoHint: GroupPolicyHintType,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpTitle: Pwstr = lpTitleCtorArg
        internal set

    public var lpInitialOU: Pwstr = lpInitialOUCtorArg
        internal set

    public var lpDSPath: Pwstr = lpDSPathCtorArg
        internal set

    public var lpName: Pwstr = lpNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        lpTitleCtorArg = MutPtr(0L),
        lpInitialOUCtorArg = MutPtr(0L),
        lpDSPathCtorArg = MutPtr(0L),
        dwDSPathSize = 0u,
        lpNameCtorArg = MutPtr(0L),
        dwNameSize = 0u,
        gpoType = 0,
        gpoHint = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndOwner

    public operator fun component4(): Pwstr = this.lpTitle

    public operator fun component5(): Pwstr = this.lpInitialOU

    public operator fun component6(): Pwstr = this.lpDSPath

    public operator fun component7(): UInt = this.dwDSPathSize

    public operator fun component8(): Pwstr = this.lpName

    public operator fun component9(): UInt = this.dwNameSize

    public operator fun component10(): GroupPolicyObjectType = this.gpoType

    public operator fun component11(): GroupPolicyHintType = this.gpoHint

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, hwndOwner: Hwnd = this.hwndOwner, lpTitle: Pwstr = this.lpTitle, lpInitialOU: Pwstr = this.lpInitialOU, lpDSPath: Pwstr = this.lpDSPath, dwDSPathSize: UInt = this.dwDSPathSize, lpName: Pwstr = this.lpName, dwNameSize: UInt = this.dwNameSize, gpoType: GroupPolicyObjectType = this.gpoType, gpoHint: GroupPolicyHintType = this.gpoHint): Gpobrowseinfo = Gpobrowseinfo(dwSize = dwSize, dwFlags = dwFlags, hwndOwnerCtorArg = hwndOwner, lpTitleCtorArg = lpTitle, lpInitialOUCtorArg = lpInitialOU, lpDSPathCtorArg = lpDSPath, dwDSPathSize = dwDSPathSize, lpNameCtorArg = lpName, dwNameSize = dwNameSize, gpoType = gpoType, gpoHint = gpoHint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gpobrowseinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.lpTitle != other.lpTitle) return false
        if (this.lpInitialOU != other.lpInitialOU) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.dwDSPathSize != other.dwDSPathSize) return false
        if (this.lpName != other.lpName) return false
        if (this.dwNameSize != other.dwNameSize) return false
        if (this.gpoType != other.gpoType) return false
        if (this.gpoHint != other.gpoHint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.lpTitle.hashCode()
        result = 31 * result + this.lpInitialOU.hashCode()
        result = 31 * result + this.lpDSPath.hashCode()
        result = 31 * result + this.dwDSPathSize.hashCode()
        result = 31 * result + this.lpName.hashCode()
        result = 31 * result + this.dwNameSize.hashCode()
        result = 31 * result + this.gpoType.hashCode()
        result = 31 * result + this.gpoHint.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            lpTitle: Pwstr = MutPtr(0L),
            lpInitialOU: Pwstr = MutPtr(0L),
            lpDSPath: Pwstr = MutPtr(0L),
            dwDSPathSize: UInt = 0u,
            lpName: Pwstr = MutPtr(0L),
            dwNameSize: UInt = 0u,
            gpoType: GroupPolicyObjectType = 0,
            gpoHint: GroupPolicyHintType = 0,
        ): Gpobrowseinfo =
            Gpobrowseinfo(
                dwSize = dwSize,
                dwFlags = dwFlags,
                hwndOwnerCtorArg = hwndOwner,
                lpTitleCtorArg = lpTitle,
                lpInitialOUCtorArg = lpInitialOU,
                lpDSPathCtorArg = lpDSPath,
                dwDSPathSize = dwDSPathSize,
                lpNameCtorArg = lpName,
                dwNameSize = dwNameSize,
                gpoType = gpoType,
                gpoHint = gpoHint,
            )
    }
}

public class GroupPolicyObjecta internal constructor(
    public var dwOptions: UInt,
    public var dwVersion: UInt,
    lpDSPathCtorArg: Pstr,
    lpFileSysPathCtorArg: Pstr,
    lpDisplayNameCtorArg: Pstr,
    public var szGPOName: ByteArray,
    public var gPOLink: GpoLink,
    public var lParam: Lparam,
    pNextCtorArg: MutPtr<GroupPolicyObjecta>,
    pPrevCtorArg: MutPtr<GroupPolicyObjecta>,
    lpExtensionsCtorArg: Pstr,
    public var lParam2: Lparam,
    lpLinkCtorArg: Pstr,
) {
    public var lpDSPath: Pstr = lpDSPathCtorArg
        internal set

    public var lpFileSysPath: Pstr = lpFileSysPathCtorArg
        internal set

    public var lpDisplayName: Pstr = lpDisplayNameCtorArg
        internal set

    public var pNext: MutPtr<GroupPolicyObjecta> = pNextCtorArg
        internal set

    public var pPrev: MutPtr<GroupPolicyObjecta> = pPrevCtorArg
        internal set

    public var lpExtensions: Pstr = lpExtensionsCtorArg
        internal set

    public var lpLink: Pstr = lpLinkCtorArg
        internal set

    public constructor() : this(
        dwOptions = 0u,
        dwVersion = 0u,
        lpDSPathCtorArg = MutPtr(0L),
        lpFileSysPathCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
        szGPOName = ByteArray(50),
        gPOLink = 0,
        lParam = 0L,
        pNextCtorArg = MutPtr(0L),
        pPrevCtorArg = MutPtr(0L),
        lpExtensionsCtorArg = MutPtr(0L),
        lParam2 = 0L,
        lpLinkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwOptions

    public operator fun component2(): UInt = this.dwVersion

    public operator fun component3(): Pstr = this.lpDSPath

    public operator fun component4(): Pstr = this.lpFileSysPath

    public operator fun component5(): Pstr = this.lpDisplayName

    public operator fun component6(): ByteArray = this.szGPOName

    public operator fun component7(): GpoLink = this.gPOLink

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): MutPtr<GroupPolicyObjecta> = this.pNext

    public operator fun component10(): MutPtr<GroupPolicyObjecta> = this.pPrev

    public operator fun component11(): Pstr = this.lpExtensions

    public operator fun component12(): Lparam = this.lParam2

    public operator fun component13(): Pstr = this.lpLink

    public fun copy(dwOptions: UInt = this.dwOptions, dwVersion: UInt = this.dwVersion, lpDSPath: Pstr = this.lpDSPath, lpFileSysPath: Pstr = this.lpFileSysPath, lpDisplayName: Pstr = this.lpDisplayName, szGPOName: ByteArray = this.szGPOName, gPOLink: GpoLink = this.gPOLink, lParam: Lparam = this.lParam, pNext: MutPtr<GroupPolicyObjecta> = this.pNext, pPrev: MutPtr<GroupPolicyObjecta> = this.pPrev, lpExtensions: Pstr = this.lpExtensions, lParam2: Lparam = this.lParam2, lpLink: Pstr = this.lpLink): GroupPolicyObjecta = GroupPolicyObjecta(dwOptions = dwOptions, dwVersion = dwVersion, lpDSPathCtorArg = lpDSPath, lpFileSysPathCtorArg = lpFileSysPath, lpDisplayNameCtorArg = lpDisplayName, szGPOName = szGPOName, gPOLink = gPOLink, lParam = lParam, pNextCtorArg = pNext, pPrevCtorArg = pPrev, lpExtensionsCtorArg = lpExtensions, lParam2 = lParam2, lpLinkCtorArg = lpLink)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupPolicyObjecta) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.lpFileSysPath != other.lpFileSysPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (!this.szGPOName.contentEquals(other.szGPOName)) return false
        if (this.gPOLink != other.gPOLink) return false
        if (this.lParam != other.lParam) return false
        if (this.pNext != other.pNext) return false
        if (this.pPrev != other.pPrev) return false
        if (this.lpExtensions != other.lpExtensions) return false
        if (this.lParam2 != other.lParam2) return false
        if (this.lpLink != other.lpLink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOptions.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpDSPath.hashCode()
        result = 31 * result + this.lpFileSysPath.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.szGPOName.contentHashCode()
        result = 31 * result + this.gPOLink.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pNext.hashCode()
        result = 31 * result + this.pPrev.hashCode()
        result = 31 * result + this.lpExtensions.hashCode()
        result = 31 * result + this.lParam2.hashCode()
        result = 31 * result + this.lpLink.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwOptions: UInt = 0u,
            dwVersion: UInt = 0u,
            lpDSPath: Pstr = MutPtr(0L),
            lpFileSysPath: Pstr = MutPtr(0L),
            lpDisplayName: Pstr = MutPtr(0L),
            szGPOName: ByteArray = ByteArray(50),
            gPOLink: GpoLink = 0,
            lParam: Lparam = 0L,
            pNext: MutPtr<GroupPolicyObjecta> = MutPtr(0L),
            pPrev: MutPtr<GroupPolicyObjecta> = MutPtr(0L),
            lpExtensions: Pstr = MutPtr(0L),
            lParam2: Lparam = 0L,
            lpLink: Pstr = MutPtr(0L),
        ): GroupPolicyObjecta =
            GroupPolicyObjecta(
                dwOptions = dwOptions,
                dwVersion = dwVersion,
                lpDSPathCtorArg = lpDSPath,
                lpFileSysPathCtorArg = lpFileSysPath,
                lpDisplayNameCtorArg = lpDisplayName,
                szGPOName = szGPOName,
                gPOLink = gPOLink,
                lParam = lParam,
                pNextCtorArg = pNext,
                pPrevCtorArg = pPrev,
                lpExtensionsCtorArg = lpExtensions,
                lParam2 = lParam2,
                lpLinkCtorArg = lpLink,
            )
    }
}

public class GroupPolicyObjectw internal constructor(
    public var dwOptions: UInt,
    public var dwVersion: UInt,
    lpDSPathCtorArg: Pwstr,
    lpFileSysPathCtorArg: Pwstr,
    lpDisplayNameCtorArg: Pwstr,
    public var szGPOName: UShortArray,
    public var gPOLink: GpoLink,
    public var lParam: Lparam,
    pNextCtorArg: MutPtr<GroupPolicyObjectw>,
    pPrevCtorArg: MutPtr<GroupPolicyObjectw>,
    lpExtensionsCtorArg: Pwstr,
    public var lParam2: Lparam,
    lpLinkCtorArg: Pwstr,
) {
    public var lpDSPath: Pwstr = lpDSPathCtorArg
        internal set

    public var lpFileSysPath: Pwstr = lpFileSysPathCtorArg
        internal set

    public var lpDisplayName: Pwstr = lpDisplayNameCtorArg
        internal set

    public var pNext: MutPtr<GroupPolicyObjectw> = pNextCtorArg
        internal set

    public var pPrev: MutPtr<GroupPolicyObjectw> = pPrevCtorArg
        internal set

    public var lpExtensions: Pwstr = lpExtensionsCtorArg
        internal set

    public var lpLink: Pwstr = lpLinkCtorArg
        internal set

    public constructor() : this(
        dwOptions = 0u,
        dwVersion = 0u,
        lpDSPathCtorArg = MutPtr(0L),
        lpFileSysPathCtorArg = MutPtr(0L),
        lpDisplayNameCtorArg = MutPtr(0L),
        szGPOName = UShortArray(50),
        gPOLink = 0,
        lParam = 0L,
        pNextCtorArg = MutPtr(0L),
        pPrevCtorArg = MutPtr(0L),
        lpExtensionsCtorArg = MutPtr(0L),
        lParam2 = 0L,
        lpLinkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwOptions

    public operator fun component2(): UInt = this.dwVersion

    public operator fun component3(): Pwstr = this.lpDSPath

    public operator fun component4(): Pwstr = this.lpFileSysPath

    public operator fun component5(): Pwstr = this.lpDisplayName

    public operator fun component6(): UShortArray = this.szGPOName

    public operator fun component7(): GpoLink = this.gPOLink

    public operator fun component8(): Lparam = this.lParam

    public operator fun component9(): MutPtr<GroupPolicyObjectw> = this.pNext

    public operator fun component10(): MutPtr<GroupPolicyObjectw> = this.pPrev

    public operator fun component11(): Pwstr = this.lpExtensions

    public operator fun component12(): Lparam = this.lParam2

    public operator fun component13(): Pwstr = this.lpLink

    public fun copy(dwOptions: UInt = this.dwOptions, dwVersion: UInt = this.dwVersion, lpDSPath: Pwstr = this.lpDSPath, lpFileSysPath: Pwstr = this.lpFileSysPath, lpDisplayName: Pwstr = this.lpDisplayName, szGPOName: UShortArray = this.szGPOName, gPOLink: GpoLink = this.gPOLink, lParam: Lparam = this.lParam, pNext: MutPtr<GroupPolicyObjectw> = this.pNext, pPrev: MutPtr<GroupPolicyObjectw> = this.pPrev, lpExtensions: Pwstr = this.lpExtensions, lParam2: Lparam = this.lParam2, lpLink: Pwstr = this.lpLink): GroupPolicyObjectw = GroupPolicyObjectw(dwOptions = dwOptions, dwVersion = dwVersion, lpDSPathCtorArg = lpDSPath, lpFileSysPathCtorArg = lpFileSysPath, lpDisplayNameCtorArg = lpDisplayName, szGPOName = szGPOName, gPOLink = gPOLink, lParam = lParam, pNextCtorArg = pNext, pPrevCtorArg = pPrev, lpExtensionsCtorArg = lpExtensions, lParam2 = lParam2, lpLinkCtorArg = lpLink)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupPolicyObjectw) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpDSPath != other.lpDSPath) return false
        if (this.lpFileSysPath != other.lpFileSysPath) return false
        if (this.lpDisplayName != other.lpDisplayName) return false
        if (!this.szGPOName.contentEquals(other.szGPOName)) return false
        if (this.gPOLink != other.gPOLink) return false
        if (this.lParam != other.lParam) return false
        if (this.pNext != other.pNext) return false
        if (this.pPrev != other.pPrev) return false
        if (this.lpExtensions != other.lpExtensions) return false
        if (this.lParam2 != other.lParam2) return false
        if (this.lpLink != other.lpLink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOptions.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.lpDSPath.hashCode()
        result = 31 * result + this.lpFileSysPath.hashCode()
        result = 31 * result + this.lpDisplayName.hashCode()
        result = 31 * result + this.szGPOName.contentHashCode()
        result = 31 * result + this.gPOLink.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.pNext.hashCode()
        result = 31 * result + this.pPrev.hashCode()
        result = 31 * result + this.lpExtensions.hashCode()
        result = 31 * result + this.lParam2.hashCode()
        result = 31 * result + this.lpLink.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwOptions: UInt = 0u,
            dwVersion: UInt = 0u,
            lpDSPath: Pwstr = MutPtr(0L),
            lpFileSysPath: Pwstr = MutPtr(0L),
            lpDisplayName: Pwstr = MutPtr(0L),
            szGPOName: UShortArray = UShortArray(50),
            gPOLink: GpoLink = 0,
            lParam: Lparam = 0L,
            pNext: MutPtr<GroupPolicyObjectw> = MutPtr(0L),
            pPrev: MutPtr<GroupPolicyObjectw> = MutPtr(0L),
            lpExtensions: Pwstr = MutPtr(0L),
            lParam2: Lparam = 0L,
            lpLink: Pwstr = MutPtr(0L),
        ): GroupPolicyObjectw =
            GroupPolicyObjectw(
                dwOptions = dwOptions,
                dwVersion = dwVersion,
                lpDSPathCtorArg = lpDSPath,
                lpFileSysPathCtorArg = lpFileSysPath,
                lpDisplayNameCtorArg = lpDisplayName,
                szGPOName = szGPOName,
                gPOLink = gPOLink,
                lParam = lParam,
                pNextCtorArg = pNext,
                pPrevCtorArg = pPrev,
                lpExtensionsCtorArg = lpExtensions,
                lParam2 = lParam2,
                lpLinkCtorArg = lpLink,
            )
    }
}

public data class Installdata(
    public var type: Installspectype = 0,
    public var spec: Installspec = Installspec(),
)

public class Installspec internal constructor(
    public var appName: Installspec0,
    fileExtCtorArg: Pwstr,
    progIdCtorArg: Pwstr,
    public var cOMClass: Installspec1,
) {
    public var fileExt: Pwstr = fileExtCtorArg
        internal set

    public var progId: Pwstr = progIdCtorArg
        internal set

    public constructor() : this(
        appName = Installspec0(),
        fileExtCtorArg = MutPtr(0L),
        progIdCtorArg = MutPtr(0L),
        cOMClass = Installspec1(),
    )

    public operator fun component1(): Installspec0 = this.appName

    public operator fun component2(): Pwstr = this.fileExt

    public operator fun component3(): Pwstr = this.progId

    public operator fun component4(): Installspec1 = this.cOMClass

    public fun copy(appName: Installspec0 = this.appName, fileExt: Pwstr = this.fileExt, progId: Pwstr = this.progId, cOMClass: Installspec1 = this.cOMClass): Installspec = Installspec(appName = appName, fileExtCtorArg = fileExt, progIdCtorArg = progId, cOMClass = cOMClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Installspec) return false
        if (this.appName != other.appName) return false
        if (this.fileExt != other.fileExt) return false
        if (this.progId != other.progId) return false
        if (this.cOMClass != other.cOMClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.appName.hashCode()
        result = 31 * result + this.fileExt.hashCode()
        result = 31 * result + this.progId.hashCode()
        result = 31 * result + this.cOMClass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            appName: Installspec0 = Installspec0(),
            fileExt: Pwstr = MutPtr(0L),
            progId: Pwstr = MutPtr(0L),
            cOMClass: Installspec1 = Installspec1(),
        ): Installspec =
            Installspec(
                appName = appName,
                fileExtCtorArg = fileExt,
                progIdCtorArg = progId,
                cOMClass = cOMClass,
            )
    }
}

public class Installspec0 internal constructor(
    nameCtorArg: Pwstr,
    public var gPOId: Guid,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        gPOId = Guid(),
    )

    public operator fun component1(): Pwstr = this.name

    public operator fun component2(): Guid = this.gPOId

    public fun copy(name: Pwstr = this.name, gPOId: Guid = this.gPOId): Installspec0 = Installspec0(nameCtorArg = name, gPOId = gPOId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Installspec0) return false
        if (this.name != other.name) return false
        if (this.gPOId != other.gPOId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.gPOId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
            gPOId: Guid = Guid(),
        ): Installspec0 =
            Installspec0(
                nameCtorArg = name,
                gPOId = gPOId,
            )
    }
}

public data class Installspec1(
    public var clsid: Guid = Guid(),
    public var clsCtx: UInt = 0u,
)

public class Localmanagedapplication internal constructor(
    pszDeploymentNameCtorArg: Pwstr,
    pszPolicyNameCtorArg: Pwstr,
    pszProductIdCtorArg: Pwstr,
    public var dwState: UInt,
) {
    public var pszDeploymentName: Pwstr = pszDeploymentNameCtorArg
        internal set

    public var pszPolicyName: Pwstr = pszPolicyNameCtorArg
        internal set

    public var pszProductId: Pwstr = pszProductIdCtorArg
        internal set

    public constructor() : this(
        pszDeploymentNameCtorArg = MutPtr(0L),
        pszPolicyNameCtorArg = MutPtr(0L),
        pszProductIdCtorArg = MutPtr(0L),
        dwState = 0u,
    )

    public operator fun component1(): Pwstr = this.pszDeploymentName

    public operator fun component2(): Pwstr = this.pszPolicyName

    public operator fun component3(): Pwstr = this.pszProductId

    public operator fun component4(): UInt = this.dwState

    public fun copy(pszDeploymentName: Pwstr = this.pszDeploymentName, pszPolicyName: Pwstr = this.pszPolicyName, pszProductId: Pwstr = this.pszProductId, dwState: UInt = this.dwState): Localmanagedapplication = Localmanagedapplication(pszDeploymentNameCtorArg = pszDeploymentName, pszPolicyNameCtorArg = pszPolicyName, pszProductIdCtorArg = pszProductId, dwState = dwState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Localmanagedapplication) return false
        if (this.pszDeploymentName != other.pszDeploymentName) return false
        if (this.pszPolicyName != other.pszPolicyName) return false
        if (this.pszProductId != other.pszProductId) return false
        if (this.dwState != other.dwState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszDeploymentName.hashCode()
        result = 31 * result + this.pszPolicyName.hashCode()
        result = 31 * result + this.pszProductId.hashCode()
        result = 31 * result + this.dwState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszDeploymentName: Pwstr = MutPtr(0L),
            pszPolicyName: Pwstr = MutPtr(0L),
            pszProductId: Pwstr = MutPtr(0L),
            dwState: UInt = 0u,
        ): Localmanagedapplication =
            Localmanagedapplication(
                pszDeploymentNameCtorArg = pszDeploymentName,
                pszPolicyNameCtorArg = pszPolicyName,
                pszProductIdCtorArg = pszProductId,
                dwState = dwState,
            )
    }
}

public class Managedapplication internal constructor(
    pszPackageNameCtorArg: Pwstr,
    pszPublisherCtorArg: Pwstr,
    public var dwVersionHi: UInt,
    public var dwVersionLo: UInt,
    public var dwRevision: UInt,
    public var gpoId: Guid,
    pszPolicyNameCtorArg: Pwstr,
    public var productId: Guid,
    public var language: UShort,
    pszOwnerCtorArg: Pwstr,
    pszCompanyCtorArg: Pwstr,
    pszCommentsCtorArg: Pwstr,
    pszContactCtorArg: Pwstr,
    pszSupportUrlCtorArg: Pwstr,
    public var dwPathType: UInt,
    public var bInstalled: Bool,
) {
    public var pszPackageName: Pwstr = pszPackageNameCtorArg
        internal set

    public var pszPublisher: Pwstr = pszPublisherCtorArg
        internal set

    public var pszPolicyName: Pwstr = pszPolicyNameCtorArg
        internal set

    public var pszOwner: Pwstr = pszOwnerCtorArg
        internal set

    public var pszCompany: Pwstr = pszCompanyCtorArg
        internal set

    public var pszComments: Pwstr = pszCommentsCtorArg
        internal set

    public var pszContact: Pwstr = pszContactCtorArg
        internal set

    public var pszSupportUrl: Pwstr = pszSupportUrlCtorArg
        internal set

    public constructor() : this(
        pszPackageNameCtorArg = MutPtr(0L),
        pszPublisherCtorArg = MutPtr(0L),
        dwVersionHi = 0u,
        dwVersionLo = 0u,
        dwRevision = 0u,
        gpoId = Guid(),
        pszPolicyNameCtorArg = MutPtr(0L),
        productId = Guid(),
        language = 0u,
        pszOwnerCtorArg = MutPtr(0L),
        pszCompanyCtorArg = MutPtr(0L),
        pszCommentsCtorArg = MutPtr(0L),
        pszContactCtorArg = MutPtr(0L),
        pszSupportUrlCtorArg = MutPtr(0L),
        dwPathType = 0u,
        bInstalled = 0,
    )

    public operator fun component1(): Pwstr = this.pszPackageName

    public operator fun component2(): Pwstr = this.pszPublisher

    public operator fun component3(): UInt = this.dwVersionHi

    public operator fun component4(): UInt = this.dwVersionLo

    public operator fun component5(): UInt = this.dwRevision

    public operator fun component6(): Guid = this.gpoId

    public operator fun component7(): Pwstr = this.pszPolicyName

    public operator fun component8(): Guid = this.productId

    public operator fun component9(): UShort = this.language

    public operator fun component10(): Pwstr = this.pszOwner

    public operator fun component11(): Pwstr = this.pszCompany

    public operator fun component12(): Pwstr = this.pszComments

    public operator fun component13(): Pwstr = this.pszContact

    public operator fun component14(): Pwstr = this.pszSupportUrl

    public operator fun component15(): UInt = this.dwPathType

    public operator fun component16(): Bool = this.bInstalled

    public fun copy(pszPackageName: Pwstr = this.pszPackageName, pszPublisher: Pwstr = this.pszPublisher, dwVersionHi: UInt = this.dwVersionHi, dwVersionLo: UInt = this.dwVersionLo, dwRevision: UInt = this.dwRevision, gpoId: Guid = this.gpoId, pszPolicyName: Pwstr = this.pszPolicyName, productId: Guid = this.productId, language: UShort = this.language, pszOwner: Pwstr = this.pszOwner, pszCompany: Pwstr = this.pszCompany, pszComments: Pwstr = this.pszComments, pszContact: Pwstr = this.pszContact, pszSupportUrl: Pwstr = this.pszSupportUrl, dwPathType: UInt = this.dwPathType, bInstalled: Bool = this.bInstalled): Managedapplication = Managedapplication(pszPackageNameCtorArg = pszPackageName, pszPublisherCtorArg = pszPublisher, dwVersionHi = dwVersionHi, dwVersionLo = dwVersionLo, dwRevision = dwRevision, gpoId = gpoId, pszPolicyNameCtorArg = pszPolicyName, productId = productId, language = language, pszOwnerCtorArg = pszOwner, pszCompanyCtorArg = pszCompany, pszCommentsCtorArg = pszComments, pszContactCtorArg = pszContact, pszSupportUrlCtorArg = pszSupportUrl, dwPathType = dwPathType, bInstalled = bInstalled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Managedapplication) return false
        if (this.pszPackageName != other.pszPackageName) return false
        if (this.pszPublisher != other.pszPublisher) return false
        if (this.dwVersionHi != other.dwVersionHi) return false
        if (this.dwVersionLo != other.dwVersionLo) return false
        if (this.dwRevision != other.dwRevision) return false
        if (this.gpoId != other.gpoId) return false
        if (this.pszPolicyName != other.pszPolicyName) return false
        if (this.productId != other.productId) return false
        if (this.language != other.language) return false
        if (this.pszOwner != other.pszOwner) return false
        if (this.pszCompany != other.pszCompany) return false
        if (this.pszComments != other.pszComments) return false
        if (this.pszContact != other.pszContact) return false
        if (this.pszSupportUrl != other.pszSupportUrl) return false
        if (this.dwPathType != other.dwPathType) return false
        if (this.bInstalled != other.bInstalled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszPackageName.hashCode()
        result = 31 * result + this.pszPublisher.hashCode()
        result = 31 * result + this.dwVersionHi.hashCode()
        result = 31 * result + this.dwVersionLo.hashCode()
        result = 31 * result + this.dwRevision.hashCode()
        result = 31 * result + this.gpoId.hashCode()
        result = 31 * result + this.pszPolicyName.hashCode()
        result = 31 * result + this.productId.hashCode()
        result = 31 * result + this.language.hashCode()
        result = 31 * result + this.pszOwner.hashCode()
        result = 31 * result + this.pszCompany.hashCode()
        result = 31 * result + this.pszComments.hashCode()
        result = 31 * result + this.pszContact.hashCode()
        result = 31 * result + this.pszSupportUrl.hashCode()
        result = 31 * result + this.dwPathType.hashCode()
        result = 31 * result + this.bInstalled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszPackageName: Pwstr = MutPtr(0L),
            pszPublisher: Pwstr = MutPtr(0L),
            dwVersionHi: UInt = 0u,
            dwVersionLo: UInt = 0u,
            dwRevision: UInt = 0u,
            gpoId: Guid = Guid(),
            pszPolicyName: Pwstr = MutPtr(0L),
            productId: Guid = Guid(),
            language: UShort = 0u,
            pszOwner: Pwstr = MutPtr(0L),
            pszCompany: Pwstr = MutPtr(0L),
            pszComments: Pwstr = MutPtr(0L),
            pszContact: Pwstr = MutPtr(0L),
            pszSupportUrl: Pwstr = MutPtr(0L),
            dwPathType: UInt = 0u,
            bInstalled: Bool = 0,
        ): Managedapplication =
            Managedapplication(
                pszPackageNameCtorArg = pszPackageName,
                pszPublisherCtorArg = pszPublisher,
                dwVersionHi = dwVersionHi,
                dwVersionLo = dwVersionLo,
                dwRevision = dwRevision,
                gpoId = gpoId,
                pszPolicyNameCtorArg = pszPolicyName,
                productId = productId,
                language = language,
                pszOwnerCtorArg = pszOwner,
                pszCompanyCtorArg = pszCompany,
                pszCommentsCtorArg = pszComments,
                pszContactCtorArg = pszContact,
                pszSupportUrlCtorArg = pszSupportUrl,
                dwPathType = dwPathType,
                bInstalled = bInstalled,
            )
    }
}

public class Policysettingstatusinfo internal constructor(
    szKeyCtorArg: Pwstr,
    szEventSourceCtorArg: Pwstr,
    szEventLogNameCtorArg: Pwstr,
    public var dwEventID: UInt,
    public var dwErrorCode: UInt,
    public var status: Settingstatus,
    public var timeLogged: Systemtime,
) {
    public var szKey: Pwstr = szKeyCtorArg
        internal set

    public var szEventSource: Pwstr = szEventSourceCtorArg
        internal set

    public var szEventLogName: Pwstr = szEventLogNameCtorArg
        internal set

    public constructor() : this(
        szKeyCtorArg = MutPtr(0L),
        szEventSourceCtorArg = MutPtr(0L),
        szEventLogNameCtorArg = MutPtr(0L),
        dwEventID = 0u,
        dwErrorCode = 0u,
        status = 0,
        timeLogged = Systemtime(),
    )

    public operator fun component1(): Pwstr = this.szKey

    public operator fun component2(): Pwstr = this.szEventSource

    public operator fun component3(): Pwstr = this.szEventLogName

    public operator fun component4(): UInt = this.dwEventID

    public operator fun component5(): UInt = this.dwErrorCode

    public operator fun component6(): Settingstatus = this.status

    public operator fun component7(): Systemtime = this.timeLogged

    public fun copy(szKey: Pwstr = this.szKey, szEventSource: Pwstr = this.szEventSource, szEventLogName: Pwstr = this.szEventLogName, dwEventID: UInt = this.dwEventID, dwErrorCode: UInt = this.dwErrorCode, status: Settingstatus = this.status, timeLogged: Systemtime = this.timeLogged): Policysettingstatusinfo = Policysettingstatusinfo(szKeyCtorArg = szKey, szEventSourceCtorArg = szEventSource, szEventLogNameCtorArg = szEventLogName, dwEventID = dwEventID, dwErrorCode = dwErrorCode, status = status, timeLogged = timeLogged)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Policysettingstatusinfo) return false
        if (this.szKey != other.szKey) return false
        if (this.szEventSource != other.szEventSource) return false
        if (this.szEventLogName != other.szEventLogName) return false
        if (this.dwEventID != other.dwEventID) return false
        if (this.dwErrorCode != other.dwErrorCode) return false
        if (this.status != other.status) return false
        if (this.timeLogged != other.timeLogged) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szKey.hashCode()
        result = 31 * result + this.szEventSource.hashCode()
        result = 31 * result + this.szEventLogName.hashCode()
        result = 31 * result + this.dwEventID.hashCode()
        result = 31 * result + this.dwErrorCode.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.timeLogged.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szKey: Pwstr = MutPtr(0L),
            szEventSource: Pwstr = MutPtr(0L),
            szEventLogName: Pwstr = MutPtr(0L),
            dwEventID: UInt = 0u,
            dwErrorCode: UInt = 0u,
            status: Settingstatus = 0,
            timeLogged: Systemtime = Systemtime(),
        ): Policysettingstatusinfo =
            Policysettingstatusinfo(
                szKeyCtorArg = szKey,
                szEventSourceCtorArg = szEventSource,
                szEventLogNameCtorArg = szEventLogName,
                dwEventID = dwEventID,
                dwErrorCode = dwErrorCode,
                status = status,
                timeLogged = timeLogged,
            )
    }
}

public class RsopTarget internal constructor(
    pwszAccountNameCtorArg: Pwstr,
    pwszNewSOMCtorArg: Pwstr,
    psaSecurityGroupsCtorArg: MutPtr<Safearray>,
    pRsopTokenCtorArg: MutPtr<CVoid>,
    pGPOListCtorArg: MutPtr<GroupPolicyObjecta>,
    pWbemServicesCtorArg: MutPtr<CVoid>,
) {
    public var pwszAccountName: Pwstr = pwszAccountNameCtorArg
        internal set

    public var pwszNewSOM: Pwstr = pwszNewSOMCtorArg
        internal set

    public var psaSecurityGroups: MutPtr<Safearray> = psaSecurityGroupsCtorArg
        internal set

    public var pRsopToken: MutPtr<CVoid> = pRsopTokenCtorArg
        internal set

    public var pGPOList: MutPtr<GroupPolicyObjecta> = pGPOListCtorArg
        internal set

    public var pWbemServices: MutPtr<CVoid> = pWbemServicesCtorArg
        internal set

    public constructor() : this(
        pwszAccountNameCtorArg = MutPtr(0L),
        pwszNewSOMCtorArg = MutPtr(0L),
        psaSecurityGroupsCtorArg = MutPtr(0L),
        pRsopTokenCtorArg = MutPtr(0L),
        pGPOListCtorArg = MutPtr(0L),
        pWbemServicesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszAccountName

    public operator fun component2(): Pwstr = this.pwszNewSOM

    public operator fun component3(): MutPtr<Safearray> = this.psaSecurityGroups

    public operator fun component4(): MutPtr<CVoid> = this.pRsopToken

    public operator fun component5(): MutPtr<GroupPolicyObjecta> = this.pGPOList

    public operator fun component6(): MutPtr<CVoid> = this.pWbemServices

    public fun copy(pwszAccountName: Pwstr = this.pwszAccountName, pwszNewSOM: Pwstr = this.pwszNewSOM, psaSecurityGroups: MutPtr<Safearray> = this.psaSecurityGroups, pRsopToken: MutPtr<CVoid> = this.pRsopToken, pGPOList: MutPtr<GroupPolicyObjecta> = this.pGPOList, pWbemServices: MutPtr<CVoid> = this.pWbemServices): RsopTarget = RsopTarget(pwszAccountNameCtorArg = pwszAccountName, pwszNewSOMCtorArg = pwszNewSOM, psaSecurityGroupsCtorArg = psaSecurityGroups, pRsopTokenCtorArg = pRsopToken, pGPOListCtorArg = pGPOList, pWbemServicesCtorArg = pWbemServices)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RsopTarget) return false
        if (this.pwszAccountName != other.pwszAccountName) return false
        if (this.pwszNewSOM != other.pwszNewSOM) return false
        if (this.psaSecurityGroups != other.psaSecurityGroups) return false
        if (this.pRsopToken != other.pRsopToken) return false
        if (this.pGPOList != other.pGPOList) return false
        if (this.pWbemServices != other.pWbemServices) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszAccountName.hashCode()
        result = 31 * result + this.pwszNewSOM.hashCode()
        result = 31 * result + this.psaSecurityGroups.hashCode()
        result = 31 * result + this.pRsopToken.hashCode()
        result = 31 * result + this.pGPOList.hashCode()
        result = 31 * result + this.pWbemServices.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszAccountName: Pwstr = MutPtr(0L),
            pwszNewSOM: Pwstr = MutPtr(0L),
            psaSecurityGroups: MutPtr<Safearray> = MutPtr(0L),
            pRsopToken: MutPtr<CVoid> = MutPtr(0L),
            pGPOList: MutPtr<GroupPolicyObjecta> = MutPtr(0L),
            pWbemServices: MutPtr<CVoid> = MutPtr(0L),
        ): RsopTarget =
            RsopTarget(
                pwszAccountNameCtorArg = pwszAccountName,
                pwszNewSOMCtorArg = pwszNewSOM,
                psaSecurityGroupsCtorArg = psaSecurityGroups,
                pRsopTokenCtorArg = pRsopToken,
                pGPOListCtorArg = pGPOList,
                pWbemServicesCtorArg = pWbemServices,
            )
    }
}
