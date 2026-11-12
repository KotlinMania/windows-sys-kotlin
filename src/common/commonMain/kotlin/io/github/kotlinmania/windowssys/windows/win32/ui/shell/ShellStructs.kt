@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.Netresourcea
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.console.Coord
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Strret
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu

public data class Aashellmenufilename(
    public var cbTotal: Short = 0,
    public var rgbReserved: UByteArray = UByteArray(12),
    public var szFileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aashellmenufilename) return false
        if (this.cbTotal != other.cbTotal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (!this.szFileName.contentEquals(other.szFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbTotal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.szFileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aashellmenufilename> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aashellmenufilename> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Aashellmenufilename =
                    Aashellmenufilename(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 14L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Aashellmenufilename) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.cbTotal)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 2L, value.rgbReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 14L, value.szFileName.toList())
                }
            }
    }
}

public class Aashellmenuitem internal constructor(
    lpReserved1CtorArg: MutPtr,
    public var iReserved: Int,
    public var uiReserved: UInt,
    lpNameCtorArg: MutPtr,
    pszCtorArg: Pwstr,
) {
    public var lpReserved1: MutPtr = lpReserved1CtorArg
        internal set

    public var lpName: MutPtr = lpNameCtorArg
        internal set

    public var psz: Pwstr = pszCtorArg
        internal set

    public constructor() : this(
        lpReserved1CtorArg = MutPtr(0L),
        iReserved = 0,
        uiReserved = 0u,
        lpNameCtorArg = MutPtr(0L),
        pszCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.lpReserved1

    public operator fun component2(): Int = this.iReserved

    public operator fun component3(): UInt = this.uiReserved

    public operator fun component4(): MutPtr = this.lpName

    public operator fun component5(): Pwstr = this.psz

    public fun copy(lpReserved1: MutPtr = this.lpReserved1, iReserved: Int = this.iReserved, uiReserved: UInt = this.uiReserved, lpName: MutPtr = this.lpName, psz: Pwstr = this.psz): Aashellmenuitem = Aashellmenuitem(lpReserved1CtorArg = lpReserved1, iReserved = iReserved, uiReserved = uiReserved, lpNameCtorArg = lpName, pszCtorArg = psz)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aashellmenuitem) return false
        if (this.lpReserved1 != other.lpReserved1) return false
        if (this.iReserved != other.iReserved) return false
        if (this.uiReserved != other.uiReserved) return false
        if (this.lpName != other.lpName) return false
        if (this.psz != other.psz) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpReserved1.hashCode()
        result = 31 * result + this.iReserved.hashCode()
        result = 31 * result + this.uiReserved.hashCode()
        result = 31 * result + this.lpName.hashCode()
        result = 31 * result + this.psz.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpReserved1: MutPtr = MutPtr(0L),
            iReserved: Int = 0,
            uiReserved: UInt = 0u,
            lpName: MutPtr = MutPtr(0L),
            psz: Pwstr = MutPtr(0L),
        ): Aashellmenuitem =
            Aashellmenuitem(
                lpReserved1CtorArg = lpReserved1,
                iReserved = iReserved,
                uiReserved = uiReserved,
                lpNameCtorArg = lpName,
                pszCtorArg = psz,
            )
    }
}

public class Appbardata internal constructor(
    public var cbSize: UInt,
    hWndCtorArg: Hwnd,
    public var uCallbackMessage: UInt,
    public var uEdge: UInt,
    public var rc: Rect,
    public var lParam: Lparam,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hWndCtorArg = MutPtr(0L),
        uCallbackMessage = 0u,
        uEdge = 0u,
        rc = Rect(),
        lParam = 0L,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.uCallbackMessage

    public operator fun component4(): UInt = this.uEdge

    public operator fun component5(): Rect = this.rc

    public operator fun component6(): Lparam = this.lParam

    public fun copy(cbSize: UInt = this.cbSize, hWnd: Hwnd = this.hWnd, uCallbackMessage: UInt = this.uCallbackMessage, uEdge: UInt = this.uEdge, rc: Rect = this.rc, lParam: Lparam = this.lParam): Appbardata = Appbardata(cbSize = cbSize, hWndCtorArg = hWnd, uCallbackMessage = uCallbackMessage, uEdge = uEdge, rc = rc, lParam = lParam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Appbardata) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hWnd != other.hWnd) return false
        if (this.uCallbackMessage != other.uCallbackMessage) return false
        if (this.uEdge != other.uEdge) return false
        if (this.rc != other.rc) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.uCallbackMessage.hashCode()
        result = 31 * result + this.uEdge.hashCode()
        result = 31 * result + this.rc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hWnd: Hwnd = MutPtr(0L),
            uCallbackMessage: UInt = 0u,
            uEdge: UInt = 0u,
            rc: Rect = Rect(),
            lParam: Lparam = 0L,
        ): Appbardata =
            Appbardata(
                cbSize = cbSize,
                hWndCtorArg = hWnd,
                uCallbackMessage = uCallbackMessage,
                uEdge = uEdge,
                rc = rc,
                lParam = lParam,
            )
    }
}

public class Appcategoryinfo internal constructor(
    public var locale: UInt,
    pszDescriptionCtorArg: Pwstr,
    public var appCategoryId: Guid,
) {
    public var pszDescription: Pwstr = pszDescriptionCtorArg
        internal set

    public constructor() : this(
        locale = 0u,
        pszDescriptionCtorArg = MutPtr(0L),
        appCategoryId = Guid(),
    )

    public operator fun component1(): UInt = this.locale

    public operator fun component2(): Pwstr = this.pszDescription

    public operator fun component3(): Guid = this.appCategoryId

    public fun copy(locale: UInt = this.locale, pszDescription: Pwstr = this.pszDescription, appCategoryId: Guid = this.appCategoryId): Appcategoryinfo = Appcategoryinfo(locale = locale, pszDescriptionCtorArg = pszDescription, appCategoryId = appCategoryId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Appcategoryinfo) return false
        if (this.locale != other.locale) return false
        if (this.pszDescription != other.pszDescription) return false
        if (this.appCategoryId != other.appCategoryId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.locale.hashCode()
        result = 31 * result + this.pszDescription.hashCode()
        result = 31 * result + this.appCategoryId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            locale: UInt = 0u,
            pszDescription: Pwstr = MutPtr(0L),
            appCategoryId: Guid = Guid(),
        ): Appcategoryinfo =
            Appcategoryinfo(
                locale = locale,
                pszDescriptionCtorArg = pszDescription,
                appCategoryId = appCategoryId,
            )
    }
}

public class Appcategoryinfolist internal constructor(
    public var cCategory: UInt,
    pCategoryInfoCtorArg: MutPtr,
) {
    public var pCategoryInfo: MutPtr = pCategoryInfoCtorArg
        internal set

    public constructor() : this(
        cCategory = 0u,
        pCategoryInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCategory

    public operator fun component2(): MutPtr = this.pCategoryInfo

    public fun copy(cCategory: UInt = this.cCategory, pCategoryInfo: MutPtr = this.pCategoryInfo): Appcategoryinfolist = Appcategoryinfolist(cCategory = cCategory, pCategoryInfoCtorArg = pCategoryInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Appcategoryinfolist) return false
        if (this.cCategory != other.cCategory) return false
        if (this.pCategoryInfo != other.pCategoryInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCategory.hashCode()
        result = 31 * result + this.pCategoryInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appcategoryinfolist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Appcategoryinfolist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Appcategoryinfolist =
                    Appcategoryinfolist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Appcategoryinfolist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCategory)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pCategoryInfo)
                }
            }

        public operator fun invoke(
            cCategory: UInt = 0u,
            pCategoryInfo: MutPtr = MutPtr(0L),
        ): Appcategoryinfolist =
            Appcategoryinfolist(
                cCategory = cCategory,
                pCategoryInfoCtorArg = pCategoryInfo,
            )
    }
}

public class Appinfodata internal constructor(
    public var cbSize: UInt,
    public var dwMask: UInt,
    pszDisplayNameCtorArg: Pwstr,
    pszVersionCtorArg: Pwstr,
    pszPublisherCtorArg: Pwstr,
    pszProductIDCtorArg: Pwstr,
    pszRegisteredOwnerCtorArg: Pwstr,
    pszRegisteredCompanyCtorArg: Pwstr,
    pszLanguageCtorArg: Pwstr,
    pszSupportUrlCtorArg: Pwstr,
    pszSupportTelephoneCtorArg: Pwstr,
    pszHelpLinkCtorArg: Pwstr,
    pszInstallLocationCtorArg: Pwstr,
    pszInstallSourceCtorArg: Pwstr,
    pszInstallDateCtorArg: Pwstr,
    pszContactCtorArg: Pwstr,
    pszCommentsCtorArg: Pwstr,
    pszImageCtorArg: Pwstr,
    pszReadmeUrlCtorArg: Pwstr,
    pszUpdateInfoUrlCtorArg: Pwstr,
) {
    public var pszDisplayName: Pwstr = pszDisplayNameCtorArg
        internal set

    public var pszVersion: Pwstr = pszVersionCtorArg
        internal set

    public var pszPublisher: Pwstr = pszPublisherCtorArg
        internal set

    public var pszProductID: Pwstr = pszProductIDCtorArg
        internal set

    public var pszRegisteredOwner: Pwstr = pszRegisteredOwnerCtorArg
        internal set

    public var pszRegisteredCompany: Pwstr = pszRegisteredCompanyCtorArg
        internal set

    public var pszLanguage: Pwstr = pszLanguageCtorArg
        internal set

    public var pszSupportUrl: Pwstr = pszSupportUrlCtorArg
        internal set

    public var pszSupportTelephone: Pwstr = pszSupportTelephoneCtorArg
        internal set

    public var pszHelpLink: Pwstr = pszHelpLinkCtorArg
        internal set

    public var pszInstallLocation: Pwstr = pszInstallLocationCtorArg
        internal set

    public var pszInstallSource: Pwstr = pszInstallSourceCtorArg
        internal set

    public var pszInstallDate: Pwstr = pszInstallDateCtorArg
        internal set

    public var pszContact: Pwstr = pszContactCtorArg
        internal set

    public var pszComments: Pwstr = pszCommentsCtorArg
        internal set

    public var pszImage: Pwstr = pszImageCtorArg
        internal set

    public var pszReadmeUrl: Pwstr = pszReadmeUrlCtorArg
        internal set

    public var pszUpdateInfoUrl: Pwstr = pszUpdateInfoUrlCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMask = 0u,
        pszDisplayNameCtorArg = MutPtr(0L),
        pszVersionCtorArg = MutPtr(0L),
        pszPublisherCtorArg = MutPtr(0L),
        pszProductIDCtorArg = MutPtr(0L),
        pszRegisteredOwnerCtorArg = MutPtr(0L),
        pszRegisteredCompanyCtorArg = MutPtr(0L),
        pszLanguageCtorArg = MutPtr(0L),
        pszSupportUrlCtorArg = MutPtr(0L),
        pszSupportTelephoneCtorArg = MutPtr(0L),
        pszHelpLinkCtorArg = MutPtr(0L),
        pszInstallLocationCtorArg = MutPtr(0L),
        pszInstallSourceCtorArg = MutPtr(0L),
        pszInstallDateCtorArg = MutPtr(0L),
        pszContactCtorArg = MutPtr(0L),
        pszCommentsCtorArg = MutPtr(0L),
        pszImageCtorArg = MutPtr(0L),
        pszReadmeUrlCtorArg = MutPtr(0L),
        pszUpdateInfoUrlCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMask: UInt = 0u,
            pszDisplayName: Pwstr = MutPtr(0L),
            pszVersion: Pwstr = MutPtr(0L),
            pszPublisher: Pwstr = MutPtr(0L),
            pszProductID: Pwstr = MutPtr(0L),
            pszRegisteredOwner: Pwstr = MutPtr(0L),
            pszRegisteredCompany: Pwstr = MutPtr(0L),
            pszLanguage: Pwstr = MutPtr(0L),
            pszSupportUrl: Pwstr = MutPtr(0L),
            pszSupportTelephone: Pwstr = MutPtr(0L),
            pszHelpLink: Pwstr = MutPtr(0L),
            pszInstallLocation: Pwstr = MutPtr(0L),
            pszInstallSource: Pwstr = MutPtr(0L),
            pszInstallDate: Pwstr = MutPtr(0L),
            pszContact: Pwstr = MutPtr(0L),
            pszComments: Pwstr = MutPtr(0L),
            pszImage: Pwstr = MutPtr(0L),
            pszReadmeUrl: Pwstr = MutPtr(0L),
            pszUpdateInfoUrl: Pwstr = MutPtr(0L),
        ): Appinfodata =
            Appinfodata(
                cbSize = cbSize,
                dwMask = dwMask,
                pszDisplayNameCtorArg = pszDisplayName,
                pszVersionCtorArg = pszVersion,
                pszPublisherCtorArg = pszPublisher,
                pszProductIDCtorArg = pszProductID,
                pszRegisteredOwnerCtorArg = pszRegisteredOwner,
                pszRegisteredCompanyCtorArg = pszRegisteredCompany,
                pszLanguageCtorArg = pszLanguage,
                pszSupportUrlCtorArg = pszSupportUrl,
                pszSupportTelephoneCtorArg = pszSupportTelephone,
                pszHelpLinkCtorArg = pszHelpLink,
                pszInstallLocationCtorArg = pszInstallLocation,
                pszInstallSourceCtorArg = pszInstallSource,
                pszInstallDateCtorArg = pszInstallDate,
                pszContactCtorArg = pszContact,
                pszCommentsCtorArg = pszComments,
                pszImageCtorArg = pszImage,
                pszReadmeUrlCtorArg = pszReadmeUrl,
                pszUpdateInfoUrlCtorArg = pszUpdateInfoUrl,
            )
    }
}

public class Associationelement internal constructor(
    public var ac: Assocclass,
    hkClassCtorArg: Hkey,
    pszClassCtorArg: Pcwstr,
) {
    public var hkClass: Hkey = hkClassCtorArg
        internal set

    public var pszClass: Pcwstr = pszClassCtorArg
        internal set

    public constructor() : this(
        ac = 0,
        hkClassCtorArg = MutPtr(0L),
        pszClassCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Assocclass = this.ac

    public operator fun component2(): Hkey = this.hkClass

    public operator fun component3(): Pcwstr = this.pszClass

    public fun copy(ac: Assocclass = this.ac, hkClass: Hkey = this.hkClass, pszClass: Pcwstr = this.pszClass): Associationelement = Associationelement(ac = ac, hkClassCtorArg = hkClass, pszClassCtorArg = pszClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Associationelement) return false
        if (this.ac != other.ac) return false
        if (this.hkClass != other.hkClass) return false
        if (this.pszClass != other.pszClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ac.hashCode()
        result = 31 * result + this.hkClass.hashCode()
        result = 31 * result + this.pszClass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ac: Assocclass = 0,
            hkClass: Hkey = MutPtr(0L),
            pszClass: Pcwstr = ConstPtr(0L),
        ): Associationelement =
            Associationelement(
                ac = ac,
                hkClassCtorArg = hkClass,
                pszClassCtorArg = pszClass,
            )
    }
}

public data class AutoScrollData(
    public var iNextSample: Int = 0,
    public var dwLastScroll: UInt = 0u,
    public var bFull: Bool = 0,
    public var pts: List<Point> = List(3) { Point() },
    public var dwTimes: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AutoScrollData) return false
        if (this.iNextSample != other.iNextSample) return false
        if (this.dwLastScroll != other.dwLastScroll) return false
        if (this.bFull != other.bFull) return false
        if (this.pts != other.pts) return false
        if (!this.dwTimes.contentEquals(other.dwTimes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iNextSample.hashCode()
        result = 31 * result + this.dwLastScroll.hashCode()
        result = 31 * result + this.bFull.hashCode()
        result = 31 * result + this.pts.hashCode()
        result = 31 * result + this.dwTimes.contentHashCode()
        return result
    }
}

public class Bandinfosfb internal constructor(
    public var dwMask: UInt,
    public var dwStateMask: UInt,
    public var dwState: UInt,
    public var crBkgnd: Colorref,
    public var crBtnLt: Colorref,
    public var crBtnDk: Colorref,
    public var wViewMode: UShort,
    public var wAlign: UShort,
    psfCtorArg: MutPtr,
    pidlCtorArg: MutPtr,
) {
    public var psf: MutPtr = psfCtorArg
        internal set

    public var pidl: MutPtr = pidlCtorArg
        internal set

    public constructor() : this(
        dwMask = 0u,
        dwStateMask = 0u,
        dwState = 0u,
        crBkgnd = 0u,
        crBtnLt = 0u,
        crBtnDk = 0u,
        wViewMode = 0u,
        wAlign = 0u,
        psfCtorArg = MutPtr(0L),
        pidlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwMask

    public operator fun component2(): UInt = this.dwStateMask

    public operator fun component3(): UInt = this.dwState

    public operator fun component4(): Colorref = this.crBkgnd

    public operator fun component5(): Colorref = this.crBtnLt

    public operator fun component6(): Colorref = this.crBtnDk

    public operator fun component7(): UShort = this.wViewMode

    public operator fun component8(): UShort = this.wAlign

    public operator fun component9(): MutPtr = this.psf

    public operator fun component10(): MutPtr = this.pidl

    public fun copy(dwMask: UInt = this.dwMask, dwStateMask: UInt = this.dwStateMask, dwState: UInt = this.dwState, crBkgnd: Colorref = this.crBkgnd, crBtnLt: Colorref = this.crBtnLt, crBtnDk: Colorref = this.crBtnDk, wViewMode: UShort = this.wViewMode, wAlign: UShort = this.wAlign, psf: MutPtr = this.psf, pidl: MutPtr = this.pidl): Bandinfosfb = Bandinfosfb(dwMask = dwMask, dwStateMask = dwStateMask, dwState = dwState, crBkgnd = crBkgnd, crBtnLt = crBtnLt, crBtnDk = crBtnDk, wViewMode = wViewMode, wAlign = wAlign, psfCtorArg = psf, pidlCtorArg = pidl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bandinfosfb) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (this.dwState != other.dwState) return false
        if (this.crBkgnd != other.crBkgnd) return false
        if (this.crBtnLt != other.crBtnLt) return false
        if (this.crBtnDk != other.crBtnDk) return false
        if (this.wViewMode != other.wViewMode) return false
        if (this.wAlign != other.wAlign) return false
        if (this.psf != other.psf) return false
        if (this.pidl != other.pidl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMask.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.crBkgnd.hashCode()
        result = 31 * result + this.crBtnLt.hashCode()
        result = 31 * result + this.crBtnDk.hashCode()
        result = 31 * result + this.wViewMode.hashCode()
        result = 31 * result + this.wAlign.hashCode()
        result = 31 * result + this.psf.hashCode()
        result = 31 * result + this.pidl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bandinfosfb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bandinfosfb> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Bandinfosfb =
                    Bandinfosfb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Bandinfosfb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStateMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.crBkgnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.crBtnLt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.crBtnDk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.wViewMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.wAlign)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.psf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pidl)
                }
            }

        public operator fun invoke(
            dwMask: UInt = 0u,
            dwStateMask: UInt = 0u,
            dwState: UInt = 0u,
            crBkgnd: Colorref = 0u,
            crBtnLt: Colorref = 0u,
            crBtnDk: Colorref = 0u,
            wViewMode: UShort = 0u,
            wAlign: UShort = 0u,
            psf: MutPtr = MutPtr(0L),
            pidl: MutPtr = MutPtr(0L),
        ): Bandinfosfb =
            Bandinfosfb(
                dwMask = dwMask,
                dwStateMask = dwStateMask,
                dwState = dwState,
                crBkgnd = crBkgnd,
                crBtnLt = crBtnLt,
                crBtnDk = crBtnDk,
                wViewMode = wViewMode,
                wAlign = wAlign,
                psfCtorArg = psf,
                pidlCtorArg = pidl,
            )
    }
}

public data class Bandsiteinfo(
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStyle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bandsiteinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bandsiteinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Bandsiteinfo =
                    Bandsiteinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Bandsiteinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStyle)
                }
            }
    }
}

public class BannerNotification internal constructor(
    public var event: BannerNotificationEvent,
    providerIdentityCtorArg: Pcwstr,
    contentIdCtorArg: Pcwstr,
) {
    public var providerIdentity: Pcwstr = providerIdentityCtorArg
        internal set

    public var contentId: Pcwstr = contentIdCtorArg
        internal set

    public constructor() : this(
        event = 0,
        providerIdentityCtorArg = ConstPtr(0L),
        contentIdCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): BannerNotificationEvent = this.event

    public operator fun component2(): Pcwstr = this.providerIdentity

    public operator fun component3(): Pcwstr = this.contentId

    public fun copy(event: BannerNotificationEvent = this.event, providerIdentity: Pcwstr = this.providerIdentity, contentId: Pcwstr = this.contentId): BannerNotification = BannerNotification(event = event, providerIdentityCtorArg = providerIdentity, contentIdCtorArg = contentId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BannerNotification) return false
        if (this.event != other.event) return false
        if (this.providerIdentity != other.providerIdentity) return false
        if (this.contentId != other.contentId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.event.hashCode()
        result = 31 * result + this.providerIdentity.hashCode()
        result = 31 * result + this.contentId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            event: BannerNotificationEvent = 0,
            providerIdentity: Pcwstr = ConstPtr(0L),
            contentId: Pcwstr = ConstPtr(0L),
        ): BannerNotification =
            BannerNotification(
                event = event,
                providerIdentityCtorArg = providerIdentity,
                contentIdCtorArg = contentId,
            )
    }
}

public class Basebrowserdatalh internal constructor(
    hwndCtorArg: Hwnd,
    ptlCtorArg: MutPtr,
    phlfCtorArg: MutPtr,
    pautoWb2CtorArg: MutPtr,
    pautoEdsCtorArg: MutPtr,
    pautoSsCtorArg: MutPtr,
    public var eSecureLockIcon: Int,
    public var bitfield: UInt,
    public var uActivateState: UInt,
    pidlViewStateCtorArg: MutPtr,
    pctViewCtorArg: MutPtr,
    pidlCurCtorArg: MutPtr,
    psvCtorArg: MutPtr,
    psfCtorArg: MutPtr,
    hwndViewCtorArg: Hwnd,
    pszTitleCurCtorArg: Pwstr,
    pidlPendingCtorArg: MutPtr,
    psvPendingCtorArg: MutPtr,
    psfPendingCtorArg: MutPtr,
    hwndViewPendingCtorArg: Hwnd,
    pszTitlePendingCtorArg: Pwstr,
    public var fIsViewMshtml: Bool,
    public var fPrivacyImpacted: Bool,
    public var clsidView: Guid,
    public var clsidViewPending: Guid,
    hwndFrameCtorArg: Hwnd,
    public var lPhishingFilterStatus: Int,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var ptl: MutPtr = ptlCtorArg
        internal set

    public var phlf: MutPtr = phlfCtorArg
        internal set

    public var pautoWb2: MutPtr = pautoWb2CtorArg
        internal set

    public var pautoEds: MutPtr = pautoEdsCtorArg
        internal set

    public var pautoSs: MutPtr = pautoSsCtorArg
        internal set

    public var pidlViewState: MutPtr = pidlViewStateCtorArg
        internal set

    public var pctView: MutPtr = pctViewCtorArg
        internal set

    public var pidlCur: MutPtr = pidlCurCtorArg
        internal set

    public var psv: MutPtr = psvCtorArg
        internal set

    public var psf: MutPtr = psfCtorArg
        internal set

    public var hwndView: Hwnd = hwndViewCtorArg
        internal set

    public var pszTitleCur: Pwstr = pszTitleCurCtorArg
        internal set

    public var pidlPending: MutPtr = pidlPendingCtorArg
        internal set

    public var psvPending: MutPtr = psvPendingCtorArg
        internal set

    public var psfPending: MutPtr = psfPendingCtorArg
        internal set

    public var hwndViewPending: Hwnd = hwndViewPendingCtorArg
        internal set

    public var pszTitlePending: Pwstr = pszTitlePendingCtorArg
        internal set

    public var hwndFrame: Hwnd = hwndFrameCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        ptlCtorArg = MutPtr(0L),
        phlfCtorArg = MutPtr(0L),
        pautoWb2CtorArg = MutPtr(0L),
        pautoEdsCtorArg = MutPtr(0L),
        pautoSsCtorArg = MutPtr(0L),
        eSecureLockIcon = 0,
        bitfield = 0u,
        uActivateState = 0u,
        pidlViewStateCtorArg = MutPtr(0L),
        pctViewCtorArg = MutPtr(0L),
        pidlCurCtorArg = MutPtr(0L),
        psvCtorArg = MutPtr(0L),
        psfCtorArg = MutPtr(0L),
        hwndViewCtorArg = MutPtr(0L),
        pszTitleCurCtorArg = MutPtr(0L),
        pidlPendingCtorArg = MutPtr(0L),
        psvPendingCtorArg = MutPtr(0L),
        psfPendingCtorArg = MutPtr(0L),
        hwndViewPendingCtorArg = MutPtr(0L),
        pszTitlePendingCtorArg = MutPtr(0L),
        fIsViewMshtml = 0,
        fPrivacyImpacted = 0,
        clsidView = Guid(),
        clsidViewPending = Guid(),
        hwndFrameCtorArg = MutPtr(0L),
        lPhishingFilterStatus = 0,
    )

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            ptl: MutPtr = MutPtr(0L),
            phlf: MutPtr = MutPtr(0L),
            pautoWb2: MutPtr = MutPtr(0L),
            pautoEds: MutPtr = MutPtr(0L),
            pautoSs: MutPtr = MutPtr(0L),
            eSecureLockIcon: Int = 0,
            bitfield: UInt = 0u,
            uActivateState: UInt = 0u,
            pidlViewState: MutPtr = MutPtr(0L),
            pctView: MutPtr = MutPtr(0L),
            pidlCur: MutPtr = MutPtr(0L),
            psv: MutPtr = MutPtr(0L),
            psf: MutPtr = MutPtr(0L),
            hwndView: Hwnd = MutPtr(0L),
            pszTitleCur: Pwstr = MutPtr(0L),
            pidlPending: MutPtr = MutPtr(0L),
            psvPending: MutPtr = MutPtr(0L),
            psfPending: MutPtr = MutPtr(0L),
            hwndViewPending: Hwnd = MutPtr(0L),
            pszTitlePending: Pwstr = MutPtr(0L),
            fIsViewMshtml: Bool = 0,
            fPrivacyImpacted: Bool = 0,
            clsidView: Guid = Guid(),
            clsidViewPending: Guid = Guid(),
            hwndFrame: Hwnd = MutPtr(0L),
            lPhishingFilterStatus: Int = 0,
        ): Basebrowserdatalh =
            Basebrowserdatalh(
                hwndCtorArg = hwnd,
                ptlCtorArg = ptl,
                phlfCtorArg = phlf,
                pautoWb2CtorArg = pautoWb2,
                pautoEdsCtorArg = pautoEds,
                pautoSsCtorArg = pautoSs,
                eSecureLockIcon = eSecureLockIcon,
                bitfield = bitfield,
                uActivateState = uActivateState,
                pidlViewStateCtorArg = pidlViewState,
                pctViewCtorArg = pctView,
                pidlCurCtorArg = pidlCur,
                psvCtorArg = psv,
                psfCtorArg = psf,
                hwndViewCtorArg = hwndView,
                pszTitleCurCtorArg = pszTitleCur,
                pidlPendingCtorArg = pidlPending,
                psvPendingCtorArg = psvPending,
                psfPendingCtorArg = psfPending,
                hwndViewPendingCtorArg = hwndViewPending,
                pszTitlePendingCtorArg = pszTitlePending,
                fIsViewMshtml = fIsViewMshtml,
                fPrivacyImpacted = fPrivacyImpacted,
                clsidView = clsidView,
                clsidViewPending = clsidViewPending,
                hwndFrameCtorArg = hwndFrame,
                lPhishingFilterStatus = lPhishingFilterStatus,
            )
    }
}

public class Basebrowserdataxp internal constructor(
    hwndCtorArg: Hwnd,
    ptlCtorArg: MutPtr,
    phlfCtorArg: MutPtr,
    pautoWb2CtorArg: MutPtr,
    pautoEdsCtorArg: MutPtr,
    pautoSsCtorArg: MutPtr,
    public var eSecureLockIcon: Int,
    public var bitfield: UInt,
    public var uActivateState: UInt,
    pidlViewStateCtorArg: MutPtr,
    pctViewCtorArg: MutPtr,
    pidlCurCtorArg: MutPtr,
    psvCtorArg: MutPtr,
    psfCtorArg: MutPtr,
    hwndViewCtorArg: Hwnd,
    pszTitleCurCtorArg: Pwstr,
    pidlPendingCtorArg: MutPtr,
    psvPendingCtorArg: MutPtr,
    psfPendingCtorArg: MutPtr,
    hwndViewPendingCtorArg: Hwnd,
    pszTitlePendingCtorArg: Pwstr,
    public var fIsViewMshtml: Bool,
    public var fPrivacyImpacted: Bool,
    public var clsidView: Guid,
    public var clsidViewPending: Guid,
    hwndFrameCtorArg: Hwnd,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var ptl: MutPtr = ptlCtorArg
        internal set

    public var phlf: MutPtr = phlfCtorArg
        internal set

    public var pautoWb2: MutPtr = pautoWb2CtorArg
        internal set

    public var pautoEds: MutPtr = pautoEdsCtorArg
        internal set

    public var pautoSs: MutPtr = pautoSsCtorArg
        internal set

    public var pidlViewState: MutPtr = pidlViewStateCtorArg
        internal set

    public var pctView: MutPtr = pctViewCtorArg
        internal set

    public var pidlCur: MutPtr = pidlCurCtorArg
        internal set

    public var psv: MutPtr = psvCtorArg
        internal set

    public var psf: MutPtr = psfCtorArg
        internal set

    public var hwndView: Hwnd = hwndViewCtorArg
        internal set

    public var pszTitleCur: Pwstr = pszTitleCurCtorArg
        internal set

    public var pidlPending: MutPtr = pidlPendingCtorArg
        internal set

    public var psvPending: MutPtr = psvPendingCtorArg
        internal set

    public var psfPending: MutPtr = psfPendingCtorArg
        internal set

    public var hwndViewPending: Hwnd = hwndViewPendingCtorArg
        internal set

    public var pszTitlePending: Pwstr = pszTitlePendingCtorArg
        internal set

    public var hwndFrame: Hwnd = hwndFrameCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        ptlCtorArg = MutPtr(0L),
        phlfCtorArg = MutPtr(0L),
        pautoWb2CtorArg = MutPtr(0L),
        pautoEdsCtorArg = MutPtr(0L),
        pautoSsCtorArg = MutPtr(0L),
        eSecureLockIcon = 0,
        bitfield = 0u,
        uActivateState = 0u,
        pidlViewStateCtorArg = MutPtr(0L),
        pctViewCtorArg = MutPtr(0L),
        pidlCurCtorArg = MutPtr(0L),
        psvCtorArg = MutPtr(0L),
        psfCtorArg = MutPtr(0L),
        hwndViewCtorArg = MutPtr(0L),
        pszTitleCurCtorArg = MutPtr(0L),
        pidlPendingCtorArg = MutPtr(0L),
        psvPendingCtorArg = MutPtr(0L),
        psfPendingCtorArg = MutPtr(0L),
        hwndViewPendingCtorArg = MutPtr(0L),
        pszTitlePendingCtorArg = MutPtr(0L),
        fIsViewMshtml = 0,
        fPrivacyImpacted = 0,
        clsidView = Guid(),
        clsidViewPending = Guid(),
        hwndFrameCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            ptl: MutPtr = MutPtr(0L),
            phlf: MutPtr = MutPtr(0L),
            pautoWb2: MutPtr = MutPtr(0L),
            pautoEds: MutPtr = MutPtr(0L),
            pautoSs: MutPtr = MutPtr(0L),
            eSecureLockIcon: Int = 0,
            bitfield: UInt = 0u,
            uActivateState: UInt = 0u,
            pidlViewState: MutPtr = MutPtr(0L),
            pctView: MutPtr = MutPtr(0L),
            pidlCur: MutPtr = MutPtr(0L),
            psv: MutPtr = MutPtr(0L),
            psf: MutPtr = MutPtr(0L),
            hwndView: Hwnd = MutPtr(0L),
            pszTitleCur: Pwstr = MutPtr(0L),
            pidlPending: MutPtr = MutPtr(0L),
            psvPending: MutPtr = MutPtr(0L),
            psfPending: MutPtr = MutPtr(0L),
            hwndViewPending: Hwnd = MutPtr(0L),
            pszTitlePending: Pwstr = MutPtr(0L),
            fIsViewMshtml: Bool = 0,
            fPrivacyImpacted: Bool = 0,
            clsidView: Guid = Guid(),
            clsidViewPending: Guid = Guid(),
            hwndFrame: Hwnd = MutPtr(0L),
        ): Basebrowserdataxp =
            Basebrowserdataxp(
                hwndCtorArg = hwnd,
                ptlCtorArg = ptl,
                phlfCtorArg = phlf,
                pautoWb2CtorArg = pautoWb2,
                pautoEdsCtorArg = pautoEds,
                pautoSsCtorArg = pautoSs,
                eSecureLockIcon = eSecureLockIcon,
                bitfield = bitfield,
                uActivateState = uActivateState,
                pidlViewStateCtorArg = pidlViewState,
                pctViewCtorArg = pctView,
                pidlCurCtorArg = pidlCur,
                psvCtorArg = psv,
                psfCtorArg = psf,
                hwndViewCtorArg = hwndView,
                pszTitleCurCtorArg = pszTitleCur,
                pidlPendingCtorArg = pidlPending,
                psvPendingCtorArg = psvPending,
                psfPendingCtorArg = psfPending,
                hwndViewPendingCtorArg = hwndViewPending,
                pszTitlePendingCtorArg = pszTitlePending,
                fIsViewMshtml = fIsViewMshtml,
                fPrivacyImpacted = fPrivacyImpacted,
                clsidView = clsidView,
                clsidViewPending = clsidViewPending,
                hwndFrameCtorArg = hwndFrame,
            )
    }
}

public class Browseinfoa internal constructor(
    hwndOwnerCtorArg: Hwnd,
    pidlRootCtorArg: MutPtr,
    pszDisplayNameCtorArg: Pstr,
    lpszTitleCtorArg: Pcstr,
    public var ulFlags: UInt,
    public var lpfn: Bffcallback,
    public var lParam: Lparam,
    public var iImage: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pidlRoot: MutPtr = pidlRootCtorArg
        internal set

    public var pszDisplayName: Pstr = pszDisplayNameCtorArg
        internal set

    public var lpszTitle: Pcstr = lpszTitleCtorArg
        internal set

    public constructor() : this(
        hwndOwnerCtorArg = MutPtr(0L),
        pidlRootCtorArg = MutPtr(0L),
        pszDisplayNameCtorArg = MutPtr(0L),
        lpszTitleCtorArg = ConstPtr(0L),
        ulFlags = 0u,
        lpfn = null,
        lParam = 0L,
        iImage = 0,
    )

    public operator fun component1(): Hwnd = this.hwndOwner

    public operator fun component2(): MutPtr = this.pidlRoot

    public operator fun component3(): Pstr = this.pszDisplayName

    public operator fun component4(): Pcstr = this.lpszTitle

    public operator fun component5(): UInt = this.ulFlags

    public operator fun component6(): Bffcallback = this.lpfn

    public operator fun component7(): Lparam = this.lParam

    public operator fun component8(): Int = this.iImage

    public fun copy(hwndOwner: Hwnd = this.hwndOwner, pidlRoot: MutPtr = this.pidlRoot, pszDisplayName: Pstr = this.pszDisplayName, lpszTitle: Pcstr = this.lpszTitle, ulFlags: UInt = this.ulFlags, lpfn: Bffcallback = this.lpfn, lParam: Lparam = this.lParam, iImage: Int = this.iImage): Browseinfoa = Browseinfoa(hwndOwnerCtorArg = hwndOwner, pidlRootCtorArg = pidlRoot, pszDisplayNameCtorArg = pszDisplayName, lpszTitleCtorArg = lpszTitle, ulFlags = ulFlags, lpfn = lpfn, lParam = lParam, iImage = iImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Browseinfoa) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pidlRoot != other.pidlRoot) return false
        if (this.pszDisplayName != other.pszDisplayName) return false
        if (this.lpszTitle != other.lpszTitle) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.lpfn != other.lpfn) return false
        if (this.lParam != other.lParam) return false
        if (this.iImage != other.iImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndOwner.hashCode()
        result = 31 * result + this.pidlRoot.hashCode()
        result = 31 * result + this.pszDisplayName.hashCode()
        result = 31 * result + this.lpszTitle.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.lpfn.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndOwner: Hwnd = MutPtr(0L),
            pidlRoot: MutPtr = MutPtr(0L),
            pszDisplayName: Pstr = MutPtr(0L),
            lpszTitle: Pcstr = ConstPtr(0L),
            ulFlags: UInt = 0u,
            lpfn: Bffcallback = null,
            lParam: Lparam = 0L,
            iImage: Int = 0,
        ): Browseinfoa =
            Browseinfoa(
                hwndOwnerCtorArg = hwndOwner,
                pidlRootCtorArg = pidlRoot,
                pszDisplayNameCtorArg = pszDisplayName,
                lpszTitleCtorArg = lpszTitle,
                ulFlags = ulFlags,
                lpfn = lpfn,
                lParam = lParam,
                iImage = iImage,
            )
    }
}

public class Browseinfow internal constructor(
    hwndOwnerCtorArg: Hwnd,
    pidlRootCtorArg: MutPtr,
    pszDisplayNameCtorArg: Pwstr,
    lpszTitleCtorArg: Pcwstr,
    public var ulFlags: UInt,
    public var lpfn: Bffcallback,
    public var lParam: Lparam,
    public var iImage: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pidlRoot: MutPtr = pidlRootCtorArg
        internal set

    public var pszDisplayName: Pwstr = pszDisplayNameCtorArg
        internal set

    public var lpszTitle: Pcwstr = lpszTitleCtorArg
        internal set

    public constructor() : this(
        hwndOwnerCtorArg = MutPtr(0L),
        pidlRootCtorArg = MutPtr(0L),
        pszDisplayNameCtorArg = MutPtr(0L),
        lpszTitleCtorArg = ConstPtr(0L),
        ulFlags = 0u,
        lpfn = null,
        lParam = 0L,
        iImage = 0,
    )

    public operator fun component1(): Hwnd = this.hwndOwner

    public operator fun component2(): MutPtr = this.pidlRoot

    public operator fun component3(): Pwstr = this.pszDisplayName

    public operator fun component4(): Pcwstr = this.lpszTitle

    public operator fun component5(): UInt = this.ulFlags

    public operator fun component6(): Bffcallback = this.lpfn

    public operator fun component7(): Lparam = this.lParam

    public operator fun component8(): Int = this.iImage

    public fun copy(hwndOwner: Hwnd = this.hwndOwner, pidlRoot: MutPtr = this.pidlRoot, pszDisplayName: Pwstr = this.pszDisplayName, lpszTitle: Pcwstr = this.lpszTitle, ulFlags: UInt = this.ulFlags, lpfn: Bffcallback = this.lpfn, lParam: Lparam = this.lParam, iImage: Int = this.iImage): Browseinfow = Browseinfow(hwndOwnerCtorArg = hwndOwner, pidlRootCtorArg = pidlRoot, pszDisplayNameCtorArg = pszDisplayName, lpszTitleCtorArg = lpszTitle, ulFlags = ulFlags, lpfn = lpfn, lParam = lParam, iImage = iImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Browseinfow) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.pidlRoot != other.pidlRoot) return false
        if (this.pszDisplayName != other.pszDisplayName) return false
        if (this.lpszTitle != other.lpszTitle) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.lpfn != other.lpfn) return false
        if (this.lParam != other.lParam) return false
        if (this.iImage != other.iImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwndOwner.hashCode()
        result = 31 * result + this.pidlRoot.hashCode()
        result = 31 * result + this.pszDisplayName.hashCode()
        result = 31 * result + this.lpszTitle.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.lpfn.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.iImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwndOwner: Hwnd = MutPtr(0L),
            pidlRoot: MutPtr = MutPtr(0L),
            pszDisplayName: Pwstr = MutPtr(0L),
            lpszTitle: Pcwstr = ConstPtr(0L),
            ulFlags: UInt = 0u,
            lpfn: Bffcallback = null,
            lParam: Lparam = 0L,
            iImage: Int = 0,
        ): Browseinfow =
            Browseinfow(
                hwndOwnerCtorArg = hwndOwner,
                pidlRootCtorArg = pidlRoot,
                pszDisplayNameCtorArg = pszDisplayName,
                lpszTitleCtorArg = lpszTitle,
                ulFlags = ulFlags,
                lpfn = lpfn,
                lParam = lParam,
                iImage = iImage,
            )
    }
}

public data class Cabinetstate(
    public var cLength: UShort = 0u,
    public var nVersion: UShort = 0u,
    public var bitfield: Int = 0,
    public var fMenuEnumFilter: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabinetstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cabinetstate> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Cabinetstate =
                    Cabinetstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cabinetstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fMenuEnumFilter)
                }
            }
    }
}

public data class CategoryInfo(
    public var cif: CategoryinfoFlags = 0,
    public var wszName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CategoryInfo) return false
        if (this.cif != other.cif) return false
        if (!this.wszName.contentEquals(other.wszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cif.hashCode()
        result = 31 * result + this.wszName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CategoryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CategoryInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): CategoryInfo =
                    CategoryInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CategoryInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cif)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.wszName.toList())
                }
            }
    }
}

public data class Cida(
    public var cidl: UInt = 0u,
    public var aoffset: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cida) return false
        if (this.cidl != other.cidl) return false
        if (!this.aoffset.contentEquals(other.aoffset)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cidl.hashCode()
        result = 31 * result + this.aoffset.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cida> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cida> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Cida =
                    Cida(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Cida) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cidl)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.aoffset.toList())
                }
            }
    }
}

public class Cminvokecommandinfo internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    hwndCtorArg: Hwnd,
    lpVerbCtorArg: Pcstr,
    lpParametersCtorArg: Pcstr,
    lpDirectoryCtorArg: Pcstr,
    public var nShow: Int,
    public var dwHotKey: UInt,
    hIconCtorArg: Handle,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpVerb: Pcstr = lpVerbCtorArg
        internal set

    public var lpParameters: Pcstr = lpParametersCtorArg
        internal set

    public var lpDirectory: Pcstr = lpDirectoryCtorArg
        internal set

    public var hIcon: Handle = hIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        hwndCtorArg = MutPtr(0L),
        lpVerbCtorArg = ConstPtr(0L),
        lpParametersCtorArg = ConstPtr(0L),
        lpDirectoryCtorArg = ConstPtr(0L),
        nShow = 0,
        dwHotKey = 0u,
        hIconCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Pcstr = this.lpVerb

    public operator fun component5(): Pcstr = this.lpParameters

    public operator fun component6(): Pcstr = this.lpDirectory

    public operator fun component7(): Int = this.nShow

    public operator fun component8(): UInt = this.dwHotKey

    public operator fun component9(): Handle = this.hIcon

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, hwnd: Hwnd = this.hwnd, lpVerb: Pcstr = this.lpVerb, lpParameters: Pcstr = this.lpParameters, lpDirectory: Pcstr = this.lpDirectory, nShow: Int = this.nShow, dwHotKey: UInt = this.dwHotKey, hIcon: Handle = this.hIcon): Cminvokecommandinfo = Cminvokecommandinfo(cbSize = cbSize, fMask = fMask, hwndCtorArg = hwnd, lpVerbCtorArg = lpVerb, lpParametersCtorArg = lpParameters, lpDirectoryCtorArg = lpDirectory, nShow = nShow, dwHotKey = dwHotKey, hIconCtorArg = hIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cminvokecommandinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.hwnd != other.hwnd) return false
        if (this.lpVerb != other.lpVerb) return false
        if (this.lpParameters != other.lpParameters) return false
        if (this.lpDirectory != other.lpDirectory) return false
        if (this.nShow != other.nShow) return false
        if (this.dwHotKey != other.dwHotKey) return false
        if (this.hIcon != other.hIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.lpVerb.hashCode()
        result = 31 * result + this.lpParameters.hashCode()
        result = 31 * result + this.lpDirectory.hashCode()
        result = 31 * result + this.nShow.hashCode()
        result = 31 * result + this.dwHotKey.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            lpVerb: Pcstr = ConstPtr(0L),
            lpParameters: Pcstr = ConstPtr(0L),
            lpDirectory: Pcstr = ConstPtr(0L),
            nShow: Int = 0,
            dwHotKey: UInt = 0u,
            hIcon: Handle = MutPtr(0L),
        ): Cminvokecommandinfo =
            Cminvokecommandinfo(
                cbSize = cbSize,
                fMask = fMask,
                hwndCtorArg = hwnd,
                lpVerbCtorArg = lpVerb,
                lpParametersCtorArg = lpParameters,
                lpDirectoryCtorArg = lpDirectory,
                nShow = nShow,
                dwHotKey = dwHotKey,
                hIconCtorArg = hIcon,
            )
    }
}

public class Cminvokecommandinfoex internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    hwndCtorArg: Hwnd,
    lpVerbCtorArg: Pcstr,
    lpParametersCtorArg: Pcstr,
    lpDirectoryCtorArg: Pcstr,
    public var nShow: Int,
    public var dwHotKey: UInt,
    hIconCtorArg: Handle,
    lpTitleCtorArg: Pcstr,
    lpVerbWCtorArg: Pcwstr,
    lpParametersWCtorArg: Pcwstr,
    lpDirectoryWCtorArg: Pcwstr,
    lpTitleWCtorArg: Pcwstr,
    public var ptInvoke: Point,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpVerb: Pcstr = lpVerbCtorArg
        internal set

    public var lpParameters: Pcstr = lpParametersCtorArg
        internal set

    public var lpDirectory: Pcstr = lpDirectoryCtorArg
        internal set

    public var hIcon: Handle = hIconCtorArg
        internal set

    public var lpTitle: Pcstr = lpTitleCtorArg
        internal set

    public var lpVerbW: Pcwstr = lpVerbWCtorArg
        internal set

    public var lpParametersW: Pcwstr = lpParametersWCtorArg
        internal set

    public var lpDirectoryW: Pcwstr = lpDirectoryWCtorArg
        internal set

    public var lpTitleW: Pcwstr = lpTitleWCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        hwndCtorArg = MutPtr(0L),
        lpVerbCtorArg = ConstPtr(0L),
        lpParametersCtorArg = ConstPtr(0L),
        lpDirectoryCtorArg = ConstPtr(0L),
        nShow = 0,
        dwHotKey = 0u,
        hIconCtorArg = MutPtr(0L),
        lpTitleCtorArg = ConstPtr(0L),
        lpVerbWCtorArg = ConstPtr(0L),
        lpParametersWCtorArg = ConstPtr(0L),
        lpDirectoryWCtorArg = ConstPtr(0L),
        lpTitleWCtorArg = ConstPtr(0L),
        ptInvoke = Point(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Pcstr = this.lpVerb

    public operator fun component5(): Pcstr = this.lpParameters

    public operator fun component6(): Pcstr = this.lpDirectory

    public operator fun component7(): Int = this.nShow

    public operator fun component8(): UInt = this.dwHotKey

    public operator fun component9(): Handle = this.hIcon

    public operator fun component10(): Pcstr = this.lpTitle

    public operator fun component11(): Pcwstr = this.lpVerbW

    public operator fun component12(): Pcwstr = this.lpParametersW

    public operator fun component13(): Pcwstr = this.lpDirectoryW

    public operator fun component14(): Pcwstr = this.lpTitleW

    public operator fun component15(): Point = this.ptInvoke

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, hwnd: Hwnd = this.hwnd, lpVerb: Pcstr = this.lpVerb, lpParameters: Pcstr = this.lpParameters, lpDirectory: Pcstr = this.lpDirectory, nShow: Int = this.nShow, dwHotKey: UInt = this.dwHotKey, hIcon: Handle = this.hIcon, lpTitle: Pcstr = this.lpTitle, lpVerbW: Pcwstr = this.lpVerbW, lpParametersW: Pcwstr = this.lpParametersW, lpDirectoryW: Pcwstr = this.lpDirectoryW, lpTitleW: Pcwstr = this.lpTitleW, ptInvoke: Point = this.ptInvoke): Cminvokecommandinfoex = Cminvokecommandinfoex(cbSize = cbSize, fMask = fMask, hwndCtorArg = hwnd, lpVerbCtorArg = lpVerb, lpParametersCtorArg = lpParameters, lpDirectoryCtorArg = lpDirectory, nShow = nShow, dwHotKey = dwHotKey, hIconCtorArg = hIcon, lpTitleCtorArg = lpTitle, lpVerbWCtorArg = lpVerbW, lpParametersWCtorArg = lpParametersW, lpDirectoryWCtorArg = lpDirectoryW, lpTitleWCtorArg = lpTitleW, ptInvoke = ptInvoke)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cminvokecommandinfoex) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.hwnd != other.hwnd) return false
        if (this.lpVerb != other.lpVerb) return false
        if (this.lpParameters != other.lpParameters) return false
        if (this.lpDirectory != other.lpDirectory) return false
        if (this.nShow != other.nShow) return false
        if (this.dwHotKey != other.dwHotKey) return false
        if (this.hIcon != other.hIcon) return false
        if (this.lpTitle != other.lpTitle) return false
        if (this.lpVerbW != other.lpVerbW) return false
        if (this.lpParametersW != other.lpParametersW) return false
        if (this.lpDirectoryW != other.lpDirectoryW) return false
        if (this.lpTitleW != other.lpTitleW) return false
        if (this.ptInvoke != other.ptInvoke) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.lpVerb.hashCode()
        result = 31 * result + this.lpParameters.hashCode()
        result = 31 * result + this.lpDirectory.hashCode()
        result = 31 * result + this.nShow.hashCode()
        result = 31 * result + this.dwHotKey.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.lpTitle.hashCode()
        result = 31 * result + this.lpVerbW.hashCode()
        result = 31 * result + this.lpParametersW.hashCode()
        result = 31 * result + this.lpDirectoryW.hashCode()
        result = 31 * result + this.lpTitleW.hashCode()
        result = 31 * result + this.ptInvoke.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            lpVerb: Pcstr = ConstPtr(0L),
            lpParameters: Pcstr = ConstPtr(0L),
            lpDirectory: Pcstr = ConstPtr(0L),
            nShow: Int = 0,
            dwHotKey: UInt = 0u,
            hIcon: Handle = MutPtr(0L),
            lpTitle: Pcstr = ConstPtr(0L),
            lpVerbW: Pcwstr = ConstPtr(0L),
            lpParametersW: Pcwstr = ConstPtr(0L),
            lpDirectoryW: Pcwstr = ConstPtr(0L),
            lpTitleW: Pcwstr = ConstPtr(0L),
            ptInvoke: Point = Point(),
        ): Cminvokecommandinfoex =
            Cminvokecommandinfoex(
                cbSize = cbSize,
                fMask = fMask,
                hwndCtorArg = hwnd,
                lpVerbCtorArg = lpVerb,
                lpParametersCtorArg = lpParameters,
                lpDirectoryCtorArg = lpDirectory,
                nShow = nShow,
                dwHotKey = dwHotKey,
                hIconCtorArg = hIcon,
                lpTitleCtorArg = lpTitle,
                lpVerbWCtorArg = lpVerbW,
                lpParametersWCtorArg = lpParametersW,
                lpDirectoryWCtorArg = lpDirectoryW,
                lpTitleWCtorArg = lpTitleW,
                ptInvoke = ptInvoke,
            )
    }
}

public class CminvokecommandinfoexRemote internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    hwndCtorArg: Hwnd,
    lpVerbStringCtorArg: Pcstr,
    lpParametersCtorArg: Pcstr,
    lpDirectoryCtorArg: Pcstr,
    public var nShow: Int,
    public var dwHotKey: UInt,
    lpTitleCtorArg: Pcstr,
    lpVerbWStringCtorArg: Pcwstr,
    lpParametersWCtorArg: Pcwstr,
    lpDirectoryWCtorArg: Pcwstr,
    lpTitleWCtorArg: Pcwstr,
    public var ptInvoke: Point,
    public var lpVerbInt: UInt,
    public var lpVerbWInt: UInt,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpVerbString: Pcstr = lpVerbStringCtorArg
        internal set

    public var lpParameters: Pcstr = lpParametersCtorArg
        internal set

    public var lpDirectory: Pcstr = lpDirectoryCtorArg
        internal set

    public var lpTitle: Pcstr = lpTitleCtorArg
        internal set

    public var lpVerbWString: Pcwstr = lpVerbWStringCtorArg
        internal set

    public var lpParametersW: Pcwstr = lpParametersWCtorArg
        internal set

    public var lpDirectoryW: Pcwstr = lpDirectoryWCtorArg
        internal set

    public var lpTitleW: Pcwstr = lpTitleWCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        hwndCtorArg = MutPtr(0L),
        lpVerbStringCtorArg = ConstPtr(0L),
        lpParametersCtorArg = ConstPtr(0L),
        lpDirectoryCtorArg = ConstPtr(0L),
        nShow = 0,
        dwHotKey = 0u,
        lpTitleCtorArg = ConstPtr(0L),
        lpVerbWStringCtorArg = ConstPtr(0L),
        lpParametersWCtorArg = ConstPtr(0L),
        lpDirectoryWCtorArg = ConstPtr(0L),
        lpTitleWCtorArg = ConstPtr(0L),
        ptInvoke = Point(),
        lpVerbInt = 0u,
        lpVerbWInt = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Pcstr = this.lpVerbString

    public operator fun component5(): Pcstr = this.lpParameters

    public operator fun component6(): Pcstr = this.lpDirectory

    public operator fun component7(): Int = this.nShow

    public operator fun component8(): UInt = this.dwHotKey

    public operator fun component9(): Pcstr = this.lpTitle

    public operator fun component10(): Pcwstr = this.lpVerbWString

    public operator fun component11(): Pcwstr = this.lpParametersW

    public operator fun component12(): Pcwstr = this.lpDirectoryW

    public operator fun component13(): Pcwstr = this.lpTitleW

    public operator fun component14(): Point = this.ptInvoke

    public operator fun component15(): UInt = this.lpVerbInt

    public operator fun component16(): UInt = this.lpVerbWInt

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, hwnd: Hwnd = this.hwnd, lpVerbString: Pcstr = this.lpVerbString, lpParameters: Pcstr = this.lpParameters, lpDirectory: Pcstr = this.lpDirectory, nShow: Int = this.nShow, dwHotKey: UInt = this.dwHotKey, lpTitle: Pcstr = this.lpTitle, lpVerbWString: Pcwstr = this.lpVerbWString, lpParametersW: Pcwstr = this.lpParametersW, lpDirectoryW: Pcwstr = this.lpDirectoryW, lpTitleW: Pcwstr = this.lpTitleW, ptInvoke: Point = this.ptInvoke, lpVerbInt: UInt = this.lpVerbInt, lpVerbWInt: UInt = this.lpVerbWInt): CminvokecommandinfoexRemote = CminvokecommandinfoexRemote(cbSize = cbSize, fMask = fMask, hwndCtorArg = hwnd, lpVerbStringCtorArg = lpVerbString, lpParametersCtorArg = lpParameters, lpDirectoryCtorArg = lpDirectory, nShow = nShow, dwHotKey = dwHotKey, lpTitleCtorArg = lpTitle, lpVerbWStringCtorArg = lpVerbWString, lpParametersWCtorArg = lpParametersW, lpDirectoryWCtorArg = lpDirectoryW, lpTitleWCtorArg = lpTitleW, ptInvoke = ptInvoke, lpVerbInt = lpVerbInt, lpVerbWInt = lpVerbWInt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CminvokecommandinfoexRemote) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.hwnd != other.hwnd) return false
        if (this.lpVerbString != other.lpVerbString) return false
        if (this.lpParameters != other.lpParameters) return false
        if (this.lpDirectory != other.lpDirectory) return false
        if (this.nShow != other.nShow) return false
        if (this.dwHotKey != other.dwHotKey) return false
        if (this.lpTitle != other.lpTitle) return false
        if (this.lpVerbWString != other.lpVerbWString) return false
        if (this.lpParametersW != other.lpParametersW) return false
        if (this.lpDirectoryW != other.lpDirectoryW) return false
        if (this.lpTitleW != other.lpTitleW) return false
        if (this.ptInvoke != other.ptInvoke) return false
        if (this.lpVerbInt != other.lpVerbInt) return false
        if (this.lpVerbWInt != other.lpVerbWInt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.lpVerbString.hashCode()
        result = 31 * result + this.lpParameters.hashCode()
        result = 31 * result + this.lpDirectory.hashCode()
        result = 31 * result + this.nShow.hashCode()
        result = 31 * result + this.dwHotKey.hashCode()
        result = 31 * result + this.lpTitle.hashCode()
        result = 31 * result + this.lpVerbWString.hashCode()
        result = 31 * result + this.lpParametersW.hashCode()
        result = 31 * result + this.lpDirectoryW.hashCode()
        result = 31 * result + this.lpTitleW.hashCode()
        result = 31 * result + this.ptInvoke.hashCode()
        result = 31 * result + this.lpVerbInt.hashCode()
        result = 31 * result + this.lpVerbWInt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            lpVerbString: Pcstr = ConstPtr(0L),
            lpParameters: Pcstr = ConstPtr(0L),
            lpDirectory: Pcstr = ConstPtr(0L),
            nShow: Int = 0,
            dwHotKey: UInt = 0u,
            lpTitle: Pcstr = ConstPtr(0L),
            lpVerbWString: Pcwstr = ConstPtr(0L),
            lpParametersW: Pcwstr = ConstPtr(0L),
            lpDirectoryW: Pcwstr = ConstPtr(0L),
            lpTitleW: Pcwstr = ConstPtr(0L),
            ptInvoke: Point = Point(),
            lpVerbInt: UInt = 0u,
            lpVerbWInt: UInt = 0u,
        ): CminvokecommandinfoexRemote =
            CminvokecommandinfoexRemote(
                cbSize = cbSize,
                fMask = fMask,
                hwndCtorArg = hwnd,
                lpVerbStringCtorArg = lpVerbString,
                lpParametersCtorArg = lpParameters,
                lpDirectoryCtorArg = lpDirectory,
                nShow = nShow,
                dwHotKey = dwHotKey,
                lpTitleCtorArg = lpTitle,
                lpVerbWStringCtorArg = lpVerbWString,
                lpParametersWCtorArg = lpParametersW,
                lpDirectoryWCtorArg = lpDirectoryW,
                lpTitleWCtorArg = lpTitleW,
                ptInvoke = ptInvoke,
                lpVerbInt = lpVerbInt,
                lpVerbWInt = lpVerbWInt,
            )
    }
}

public data class CmColumninfo(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var uWidth: UInt = 0u,
    public var uDefaultWidth: UInt = 0u,
    public var uIdealWidth: UInt = 0u,
    public var wszName: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CmColumninfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwState != other.dwState) return false
        if (this.uWidth != other.uWidth) return false
        if (this.uDefaultWidth != other.uDefaultWidth) return false
        if (this.uIdealWidth != other.uIdealWidth) return false
        if (!this.wszName.contentEquals(other.wszName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.uWidth.hashCode()
        result = 31 * result + this.uDefaultWidth.hashCode()
        result = 31 * result + this.uIdealWidth.hashCode()
        result = 31 * result + this.wszName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmColumninfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CmColumninfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 184L
                override fun readNative(addr: Long): CmColumninfo =
                    CmColumninfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: CmColumninfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uDefaultWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.uIdealWidth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (80).toInt())
                    ).writeNative(addr + 24L, value.wszName.toList())
                }
            }
    }
}

public class ConfirmConflictItem internal constructor(
    pShellItemCtorArg: MutPtr,
    pszOriginalNameCtorArg: Pwstr,
    pszAlternateNameCtorArg: Pwstr,
    pszLocationShortCtorArg: Pwstr,
    pszLocationFullCtorArg: Pwstr,
    public var nType: SyncmgrConflictItemType,
) {
    public var pShellItem: MutPtr = pShellItemCtorArg
        internal set

    public var pszOriginalName: Pwstr = pszOriginalNameCtorArg
        internal set

    public var pszAlternateName: Pwstr = pszAlternateNameCtorArg
        internal set

    public var pszLocationShort: Pwstr = pszLocationShortCtorArg
        internal set

    public var pszLocationFull: Pwstr = pszLocationFullCtorArg
        internal set

    public constructor() : this(
        pShellItemCtorArg = MutPtr(0L),
        pszOriginalNameCtorArg = MutPtr(0L),
        pszAlternateNameCtorArg = MutPtr(0L),
        pszLocationShortCtorArg = MutPtr(0L),
        pszLocationFullCtorArg = MutPtr(0L),
        nType = 0,
    )

    public operator fun component1(): MutPtr = this.pShellItem

    public operator fun component2(): Pwstr = this.pszOriginalName

    public operator fun component3(): Pwstr = this.pszAlternateName

    public operator fun component4(): Pwstr = this.pszLocationShort

    public operator fun component5(): Pwstr = this.pszLocationFull

    public operator fun component6(): SyncmgrConflictItemType = this.nType

    public fun copy(pShellItem: MutPtr = this.pShellItem, pszOriginalName: Pwstr = this.pszOriginalName, pszAlternateName: Pwstr = this.pszAlternateName, pszLocationShort: Pwstr = this.pszLocationShort, pszLocationFull: Pwstr = this.pszLocationFull, nType: SyncmgrConflictItemType = this.nType): ConfirmConflictItem = ConfirmConflictItem(pShellItemCtorArg = pShellItem, pszOriginalNameCtorArg = pszOriginalName, pszAlternateNameCtorArg = pszAlternateName, pszLocationShortCtorArg = pszLocationShort, pszLocationFullCtorArg = pszLocationFull, nType = nType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfirmConflictItem) return false
        if (this.pShellItem != other.pShellItem) return false
        if (this.pszOriginalName != other.pszOriginalName) return false
        if (this.pszAlternateName != other.pszAlternateName) return false
        if (this.pszLocationShort != other.pszLocationShort) return false
        if (this.pszLocationFull != other.pszLocationFull) return false
        if (this.nType != other.nType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pShellItem.hashCode()
        result = 31 * result + this.pszOriginalName.hashCode()
        result = 31 * result + this.pszAlternateName.hashCode()
        result = 31 * result + this.pszLocationShort.hashCode()
        result = 31 * result + this.pszLocationFull.hashCode()
        result = 31 * result + this.nType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pShellItem: MutPtr = MutPtr(0L),
            pszOriginalName: Pwstr = MutPtr(0L),
            pszAlternateName: Pwstr = MutPtr(0L),
            pszLocationShort: Pwstr = MutPtr(0L),
            pszLocationFull: Pwstr = MutPtr(0L),
            nType: SyncmgrConflictItemType = 0,
        ): ConfirmConflictItem =
            ConfirmConflictItem(
                pShellItemCtorArg = pShellItem,
                pszOriginalNameCtorArg = pszOriginalName,
                pszAlternateNameCtorArg = pszAlternateName,
                pszLocationShortCtorArg = pszLocationShort,
                pszLocationFullCtorArg = pszLocationFull,
                nType = nType,
            )
    }
}

public class ConfirmConflictResultInfo internal constructor(
    pszNewNameCtorArg: Pwstr,
    public var iItemIndex: UInt,
) {
    public var pszNewName: Pwstr = pszNewNameCtorArg
        internal set

    public constructor() : this(
        pszNewNameCtorArg = MutPtr(0L),
        iItemIndex = 0u,
    )

    public operator fun component1(): Pwstr = this.pszNewName

    public operator fun component2(): UInt = this.iItemIndex

    public fun copy(pszNewName: Pwstr = this.pszNewName, iItemIndex: UInt = this.iItemIndex): ConfirmConflictResultInfo = ConfirmConflictResultInfo(pszNewNameCtorArg = pszNewName, iItemIndex = iItemIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ConfirmConflictResultInfo) return false
        if (this.pszNewName != other.pszNewName) return false
        if (this.iItemIndex != other.iItemIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszNewName.hashCode()
        result = 31 * result + this.iItemIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszNewName: Pwstr = MutPtr(0L),
            iItemIndex: UInt = 0u,
        ): ConfirmConflictResultInfo =
            ConfirmConflictResultInfo(
                pszNewNameCtorArg = pszNewName,
                iItemIndex = iItemIndex,
            )
    }
}

public data class Cplinfo(
    public var idIcon: Int = 0,
    public var idName: Int = 0,
    public var idInfo: Int = 0,
    public var lData: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cplinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cplinfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Cplinfo =
                    Cplinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Cplinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.idIcon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.idName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.idInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 12L, value.lData)
                }
            }
    }
}

public class CredentialProviderCredentialSerialization internal constructor(
    public var ulAuthenticationPackage: UInt,
    public var clsidCredentialProvider: Guid,
    public var cbSerialization: UInt,
    rgbSerializationCtorArg: MutPtr,
) {
    public var rgbSerialization: MutPtr = rgbSerializationCtorArg
        internal set

    public constructor() : this(
        ulAuthenticationPackage = 0u,
        clsidCredentialProvider = Guid(),
        cbSerialization = 0u,
        rgbSerializationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulAuthenticationPackage

    public operator fun component2(): Guid = this.clsidCredentialProvider

    public operator fun component3(): UInt = this.cbSerialization

    public operator fun component4(): MutPtr = this.rgbSerialization

    public fun copy(ulAuthenticationPackage: UInt = this.ulAuthenticationPackage, clsidCredentialProvider: Guid = this.clsidCredentialProvider, cbSerialization: UInt = this.cbSerialization, rgbSerialization: MutPtr = this.rgbSerialization): CredentialProviderCredentialSerialization = CredentialProviderCredentialSerialization(ulAuthenticationPackage = ulAuthenticationPackage, clsidCredentialProvider = clsidCredentialProvider, cbSerialization = cbSerialization, rgbSerializationCtorArg = rgbSerialization)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredentialProviderCredentialSerialization) return false
        if (this.ulAuthenticationPackage != other.ulAuthenticationPackage) return false
        if (this.clsidCredentialProvider != other.clsidCredentialProvider) return false
        if (this.cbSerialization != other.cbSerialization) return false
        if (this.rgbSerialization != other.rgbSerialization) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulAuthenticationPackage.hashCode()
        result = 31 * result + this.clsidCredentialProvider.hashCode()
        result = 31 * result + this.cbSerialization.hashCode()
        result = 31 * result + this.rgbSerialization.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulAuthenticationPackage: UInt = 0u,
            clsidCredentialProvider: Guid = Guid(),
            cbSerialization: UInt = 0u,
            rgbSerialization: MutPtr = MutPtr(0L),
        ): CredentialProviderCredentialSerialization =
            CredentialProviderCredentialSerialization(
                ulAuthenticationPackage = ulAuthenticationPackage,
                clsidCredentialProvider = clsidCredentialProvider,
                cbSerialization = cbSerialization,
                rgbSerializationCtorArg = rgbSerialization,
            )
    }
}

public class CredentialProviderFieldDescriptor internal constructor(
    public var dwFieldID: UInt,
    public var cpft: CredentialProviderFieldType,
    pszLabelCtorArg: Pwstr,
    public var guidFieldType: Guid,
) {
    public var pszLabel: Pwstr = pszLabelCtorArg
        internal set

    public constructor() : this(
        dwFieldID = 0u,
        cpft = 0,
        pszLabelCtorArg = MutPtr(0L),
        guidFieldType = Guid(),
    )

    public operator fun component1(): UInt = this.dwFieldID

    public operator fun component2(): CredentialProviderFieldType = this.cpft

    public operator fun component3(): Pwstr = this.pszLabel

    public operator fun component4(): Guid = this.guidFieldType

    public fun copy(dwFieldID: UInt = this.dwFieldID, cpft: CredentialProviderFieldType = this.cpft, pszLabel: Pwstr = this.pszLabel, guidFieldType: Guid = this.guidFieldType): CredentialProviderFieldDescriptor = CredentialProviderFieldDescriptor(dwFieldID = dwFieldID, cpft = cpft, pszLabelCtorArg = pszLabel, guidFieldType = guidFieldType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredentialProviderFieldDescriptor) return false
        if (this.dwFieldID != other.dwFieldID) return false
        if (this.cpft != other.cpft) return false
        if (this.pszLabel != other.pszLabel) return false
        if (this.guidFieldType != other.guidFieldType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFieldID.hashCode()
        result = 31 * result + this.cpft.hashCode()
        result = 31 * result + this.pszLabel.hashCode()
        result = 31 * result + this.guidFieldType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFieldID: UInt = 0u,
            cpft: CredentialProviderFieldType = 0,
            pszLabel: Pwstr = MutPtr(0L),
            guidFieldType: Guid = Guid(),
        ): CredentialProviderFieldDescriptor =
            CredentialProviderFieldDescriptor(
                dwFieldID = dwFieldID,
                cpft = cpft,
                pszLabelCtorArg = pszLabel,
                guidFieldType = guidFieldType,
            )
    }
}

public class Csfv internal constructor(
    public var cbSize: UInt,
    pshfCtorArg: MutPtr,
    psvOuterCtorArg: MutPtr,
    pidlCtorArg: MutPtr,
    public var lEvents: Int,
    public var pfnCallback: Lpfnviewcallback,
    public var fvm: Folderviewmode,
) {
    public var pshf: MutPtr = pshfCtorArg
        internal set

    public var psvOuter: MutPtr = psvOuterCtorArg
        internal set

    public var pidl: MutPtr = pidlCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pshfCtorArg = MutPtr(0L),
        psvOuterCtorArg = MutPtr(0L),
        pidlCtorArg = MutPtr(0L),
        lEvents = 0,
        pfnCallback = null,
        fvm = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pshf

    public operator fun component3(): MutPtr = this.psvOuter

    public operator fun component4(): MutPtr = this.pidl

    public operator fun component5(): Int = this.lEvents

    public operator fun component6(): Lpfnviewcallback = this.pfnCallback

    public operator fun component7(): Folderviewmode = this.fvm

    public fun copy(cbSize: UInt = this.cbSize, pshf: MutPtr = this.pshf, psvOuter: MutPtr = this.psvOuter, pidl: MutPtr = this.pidl, lEvents: Int = this.lEvents, pfnCallback: Lpfnviewcallback = this.pfnCallback, fvm: Folderviewmode = this.fvm): Csfv = Csfv(cbSize = cbSize, pshfCtorArg = pshf, psvOuterCtorArg = psvOuter, pidlCtorArg = pidl, lEvents = lEvents, pfnCallback = pfnCallback, fvm = fvm)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Csfv) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pshf != other.pshf) return false
        if (this.psvOuter != other.psvOuter) return false
        if (this.pidl != other.pidl) return false
        if (this.lEvents != other.lEvents) return false
        if (this.pfnCallback != other.pfnCallback) return false
        if (this.fvm != other.fvm) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pshf.hashCode()
        result = 31 * result + this.psvOuter.hashCode()
        result = 31 * result + this.pidl.hashCode()
        result = 31 * result + this.lEvents.hashCode()
        result = 31 * result + this.pfnCallback.hashCode()
        result = 31 * result + this.fvm.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pshf: MutPtr = MutPtr(0L),
            psvOuter: MutPtr = MutPtr(0L),
            pidl: MutPtr = MutPtr(0L),
            lEvents: Int = 0,
            pfnCallback: Lpfnviewcallback = null,
            fvm: Folderviewmode = 0,
        ): Csfv =
            Csfv(
                cbSize = cbSize,
                pshfCtorArg = pshf,
                psvOuterCtorArg = psvOuter,
                pidlCtorArg = pidl,
                lEvents = lEvents,
                pfnCallback = pfnCallback,
                fvm = fvm,
            )
    }
}

public data class DatablockHeader(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DatablockHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DatablockHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DatablockHeader =
                    DatablockHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DatablockHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignature)
                }
            }
    }
}

public class Defcontextmenu internal constructor(
    hwndCtorArg: Hwnd,
    pcmcbCtorArg: MutPtr,
    pidlFolderCtorArg: MutPtr,
    psfCtorArg: MutPtr,
    public var cidl: UInt,
    apidlCtorArg: MutPtr,
    punkAssociationInfoCtorArg: MutPtr,
    public var cKeys: UInt,
    aKeysCtorArg: ConstPtr,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var pcmcb: MutPtr = pcmcbCtorArg
        internal set

    public var pidlFolder: MutPtr = pidlFolderCtorArg
        internal set

    public var psf: MutPtr = psfCtorArg
        internal set

    public var apidl: MutPtr = apidlCtorArg
        internal set

    public var punkAssociationInfo: MutPtr = punkAssociationInfoCtorArg
        internal set

    public var aKeys: ConstPtr = aKeysCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        pcmcbCtorArg = MutPtr(0L),
        pidlFolderCtorArg = MutPtr(0L),
        psfCtorArg = MutPtr(0L),
        cidl = 0u,
        apidlCtorArg = MutPtr(0L),
        punkAssociationInfoCtorArg = MutPtr(0L),
        cKeys = 0u,
        aKeysCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): MutPtr = this.pcmcb

    public operator fun component3(): MutPtr = this.pidlFolder

    public operator fun component4(): MutPtr = this.psf

    public operator fun component5(): UInt = this.cidl

    public operator fun component6(): MutPtr = this.apidl

    public operator fun component7(): MutPtr = this.punkAssociationInfo

    public operator fun component8(): UInt = this.cKeys

    public operator fun component9(): ConstPtr = this.aKeys

    public fun copy(hwnd: Hwnd = this.hwnd, pcmcb: MutPtr = this.pcmcb, pidlFolder: MutPtr = this.pidlFolder, psf: MutPtr = this.psf, cidl: UInt = this.cidl, apidl: MutPtr = this.apidl, punkAssociationInfo: MutPtr = this.punkAssociationInfo, cKeys: UInt = this.cKeys, aKeys: ConstPtr = this.aKeys): Defcontextmenu = Defcontextmenu(hwndCtorArg = hwnd, pcmcbCtorArg = pcmcb, pidlFolderCtorArg = pidlFolder, psfCtorArg = psf, cidl = cidl, apidlCtorArg = apidl, punkAssociationInfoCtorArg = punkAssociationInfo, cKeys = cKeys, aKeysCtorArg = aKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Defcontextmenu) return false
        if (this.hwnd != other.hwnd) return false
        if (this.pcmcb != other.pcmcb) return false
        if (this.pidlFolder != other.pidlFolder) return false
        if (this.psf != other.psf) return false
        if (this.cidl != other.cidl) return false
        if (this.apidl != other.apidl) return false
        if (this.punkAssociationInfo != other.punkAssociationInfo) return false
        if (this.cKeys != other.cKeys) return false
        if (this.aKeys != other.aKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.pcmcb.hashCode()
        result = 31 * result + this.pidlFolder.hashCode()
        result = 31 * result + this.psf.hashCode()
        result = 31 * result + this.cidl.hashCode()
        result = 31 * result + this.apidl.hashCode()
        result = 31 * result + this.punkAssociationInfo.hashCode()
        result = 31 * result + this.cKeys.hashCode()
        result = 31 * result + this.aKeys.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            pcmcb: MutPtr = MutPtr(0L),
            pidlFolder: MutPtr = MutPtr(0L),
            psf: MutPtr = MutPtr(0L),
            cidl: UInt = 0u,
            apidl: MutPtr = MutPtr(0L),
            punkAssociationInfo: MutPtr = MutPtr(0L),
            cKeys: UInt = 0u,
            aKeys: ConstPtr = ConstPtr(0L),
        ): Defcontextmenu =
            Defcontextmenu(
                hwndCtorArg = hwnd,
                pcmcbCtorArg = pcmcb,
                pidlFolderCtorArg = pidlFolder,
                psfCtorArg = psf,
                cidl = cidl,
                apidlCtorArg = apidl,
                punkAssociationInfoCtorArg = punkAssociationInfo,
                cKeys = cKeys,
                aKeysCtorArg = aKeys,
            )
    }
}

public data class Delegateitemid(
    public var cbSize: UShort = 0u,
    public var wOuter: UShort = 0u,
    public var cbInner: UShort = 0u,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Delegateitemid) return false
        if (this.cbSize != other.cbSize) return false
        if (this.wOuter != other.wOuter) return false
        if (this.cbInner != other.cbInner) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.wOuter.hashCode()
        result = 31 * result + this.cbInner.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Delegateitemid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Delegateitemid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 7L
                override fun readNative(addr: Long): Delegateitemid =
                    Delegateitemid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 6L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Delegateitemid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wOuter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cbInner)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 6L, value.rgb.toList())
                }
            }
    }
}

public data class Deskbandinfo(
    public var dwMask: UInt = 0u,
    public var ptMinSize: Pointl = Pointl(),
    public var ptMaxSize: Pointl = Pointl(),
    public var ptIntegral: Pointl = Pointl(),
    public var ptActual: Pointl = Pointl(),
    public var wszTitle: UShortArray = UShortArray(256),
    public var dwModeFlags: UInt = 0u,
    public var crBkgnd: Colorref = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Deskbandinfo) return false
        if (this.dwMask != other.dwMask) return false
        if (this.ptMinSize != other.ptMinSize) return false
        if (this.ptMaxSize != other.ptMaxSize) return false
        if (this.ptIntegral != other.ptIntegral) return false
        if (this.ptActual != other.ptActual) return false
        if (!this.wszTitle.contentEquals(other.wszTitle)) return false
        if (this.dwModeFlags != other.dwModeFlags) return false
        if (this.crBkgnd != other.crBkgnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMask.hashCode()
        result = 31 * result + this.ptMinSize.hashCode()
        result = 31 * result + this.ptMaxSize.hashCode()
        result = 31 * result + this.ptIntegral.hashCode()
        result = 31 * result + this.ptActual.hashCode()
        result = 31 * result + this.wszTitle.contentHashCode()
        result = 31 * result + this.dwModeFlags.hashCode()
        result = 31 * result + this.crBkgnd.hashCode()
        return result
    }
}

public class Detailsinfo internal constructor(
    pidlCtorArg: MutPtr,
    public var fmt: Int,
    public var cxChar: Int,
    public var str: Strret,
    public var iImage: Int,
) {
    public var pidl: MutPtr = pidlCtorArg
        internal set

    public constructor() : this(
        pidlCtorArg = MutPtr(0L),
        fmt = 0,
        cxChar = 0,
        str = Strret(),
        iImage = 0,
    )

    public operator fun component1(): MutPtr = this.pidl

    public operator fun component2(): Int = this.fmt

    public operator fun component3(): Int = this.cxChar

    public operator fun component4(): Strret = this.str

    public operator fun component5(): Int = this.iImage

    public fun copy(pidl: MutPtr = this.pidl, fmt: Int = this.fmt, cxChar: Int = this.cxChar, str: Strret = this.str, iImage: Int = this.iImage): Detailsinfo = Detailsinfo(pidlCtorArg = pidl, fmt = fmt, cxChar = cxChar, str = str, iImage = iImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Detailsinfo) return false
        if (this.pidl != other.pidl) return false
        if (this.fmt != other.fmt) return false
        if (this.cxChar != other.cxChar) return false
        if (this.str != other.str) return false
        if (this.iImage != other.iImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pidl.hashCode()
        result = 31 * result + this.fmt.hashCode()
        result = 31 * result + this.cxChar.hashCode()
        result = 31 * result + this.str.hashCode()
        result = 31 * result + this.iImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pidl: MutPtr = MutPtr(0L),
            fmt: Int = 0,
            cxChar: Int = 0,
            str: Strret = Strret(),
            iImage: Int = 0,
        ): Detailsinfo =
            Detailsinfo(
                pidlCtorArg = pidl,
                fmt = fmt,
                cxChar = cxChar,
                str = str,
                iImage = iImage,
            )
    }
}

public class Dfmics internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    public var lParam: Lparam,
    public var idCmdFirst: UInt,
    public var idDefMax: UInt,
    piciCtorArg: MutPtr,
    punkSiteCtorArg: MutPtr,
) {
    public var pici: MutPtr = piciCtorArg
        internal set

    public var punkSite: MutPtr = punkSiteCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        lParam = 0L,
        idCmdFirst = 0u,
        idDefMax = 0u,
        piciCtorArg = MutPtr(0L),
        punkSiteCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Lparam = this.lParam

    public operator fun component4(): UInt = this.idCmdFirst

    public operator fun component5(): UInt = this.idDefMax

    public operator fun component6(): MutPtr = this.pici

    public operator fun component7(): MutPtr = this.punkSite

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, lParam: Lparam = this.lParam, idCmdFirst: UInt = this.idCmdFirst, idDefMax: UInt = this.idDefMax, pici: MutPtr = this.pici, punkSite: MutPtr = this.punkSite): Dfmics = Dfmics(cbSize = cbSize, fMask = fMask, lParam = lParam, idCmdFirst = idCmdFirst, idDefMax = idDefMax, piciCtorArg = pici, punkSiteCtorArg = punkSite)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dfmics) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.lParam != other.lParam) return false
        if (this.idCmdFirst != other.idCmdFirst) return false
        if (this.idDefMax != other.idDefMax) return false
        if (this.pici != other.pici) return false
        if (this.punkSite != other.punkSite) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.idCmdFirst.hashCode()
        result = 31 * result + this.idDefMax.hashCode()
        result = 31 * result + this.pici.hashCode()
        result = 31 * result + this.punkSite.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dfmics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dfmics> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Dfmics =
                    Dfmics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Dfmics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lParam)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.idCmdFirst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.idDefMax)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pici)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.punkSite)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            lParam: Lparam = 0L,
            idCmdFirst: UInt = 0u,
            idDefMax: UInt = 0u,
            pici: MutPtr = MutPtr(0L),
            punkSite: MutPtr = MutPtr(0L),
        ): Dfmics =
            Dfmics(
                cbSize = cbSize,
                fMask = fMask,
                lParam = lParam,
                idCmdFirst = idCmdFirst,
                idDefMax = idDefMax,
                piciCtorArg = pici,
                punkSiteCtorArg = punkSite,
            )
    }
}

public data class Dllversioninfo(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dllversioninfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dllversioninfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Dllversioninfo =
                    Dllversioninfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dllversioninfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPlatformID)
                }
            }
    }
}

public data class Dllversioninfo2(
    public var info1: Dllversioninfo = Dllversioninfo(),
    public var dwFlags: UInt = 0u,
    public var ullVersion: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dllversioninfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dllversioninfo2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Dllversioninfo2 =
                    Dllversioninfo2(
                        (Dllversioninfo.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dllversioninfo2) {
                    (Dllversioninfo.typeLayout()).writeNative(addr, value.info1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullVersion)
                }
            }
    }
}

public class Draginfoa internal constructor(
    public var uSize: UInt,
    public var pt: Point,
    public var fNC: Bool,
    lpFileListCtorArg: Pstr,
    public var grfKeyState: UInt,
) {
    public var lpFileList: Pstr = lpFileListCtorArg
        internal set

    public constructor() : this(
        uSize = 0u,
        pt = Point(),
        fNC = 0,
        lpFileListCtorArg = MutPtr(0L),
        grfKeyState = 0u,
    )

    public operator fun component1(): UInt = this.uSize

    public operator fun component2(): Point = this.pt

    public operator fun component3(): Bool = this.fNC

    public operator fun component4(): Pstr = this.lpFileList

    public operator fun component5(): UInt = this.grfKeyState

    public fun copy(uSize: UInt = this.uSize, pt: Point = this.pt, fNC: Bool = this.fNC, lpFileList: Pstr = this.lpFileList, grfKeyState: UInt = this.grfKeyState): Draginfoa = Draginfoa(uSize = uSize, pt = pt, fNC = fNC, lpFileListCtorArg = lpFileList, grfKeyState = grfKeyState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Draginfoa) return false
        if (this.uSize != other.uSize) return false
        if (this.pt != other.pt) return false
        if (this.fNC != other.fNC) return false
        if (this.lpFileList != other.lpFileList) return false
        if (this.grfKeyState != other.grfKeyState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSize.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.fNC.hashCode()
        result = 31 * result + this.lpFileList.hashCode()
        result = 31 * result + this.grfKeyState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uSize: UInt = 0u,
            pt: Point = Point(),
            fNC: Bool = 0,
            lpFileList: Pstr = MutPtr(0L),
            grfKeyState: UInt = 0u,
        ): Draginfoa =
            Draginfoa(
                uSize = uSize,
                pt = pt,
                fNC = fNC,
                lpFileListCtorArg = lpFileList,
                grfKeyState = grfKeyState,
            )
    }
}

public class Draginfow internal constructor(
    public var uSize: UInt,
    public var pt: Point,
    public var fNC: Bool,
    lpFileListCtorArg: Pwstr,
    public var grfKeyState: UInt,
) {
    public var lpFileList: Pwstr = lpFileListCtorArg
        internal set

    public constructor() : this(
        uSize = 0u,
        pt = Point(),
        fNC = 0,
        lpFileListCtorArg = MutPtr(0L),
        grfKeyState = 0u,
    )

    public operator fun component1(): UInt = this.uSize

    public operator fun component2(): Point = this.pt

    public operator fun component3(): Bool = this.fNC

    public operator fun component4(): Pwstr = this.lpFileList

    public operator fun component5(): UInt = this.grfKeyState

    public fun copy(uSize: UInt = this.uSize, pt: Point = this.pt, fNC: Bool = this.fNC, lpFileList: Pwstr = this.lpFileList, grfKeyState: UInt = this.grfKeyState): Draginfow = Draginfow(uSize = uSize, pt = pt, fNC = fNC, lpFileListCtorArg = lpFileList, grfKeyState = grfKeyState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Draginfow) return false
        if (this.uSize != other.uSize) return false
        if (this.pt != other.pt) return false
        if (this.fNC != other.fNC) return false
        if (this.lpFileList != other.lpFileList) return false
        if (this.grfKeyState != other.grfKeyState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSize.hashCode()
        result = 31 * result + this.pt.hashCode()
        result = 31 * result + this.fNC.hashCode()
        result = 31 * result + this.lpFileList.hashCode()
        result = 31 * result + this.grfKeyState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uSize: UInt = 0u,
            pt: Point = Point(),
            fNC: Bool = 0,
            lpFileList: Pwstr = MutPtr(0L),
            grfKeyState: UInt = 0u,
        ): Draginfow =
            Draginfow(
                uSize = uSize,
                pt = pt,
                fNC = fNC,
                lpFileListCtorArg = lpFileList,
                grfKeyState = grfKeyState,
            )
    }
}

public data class Dropdescription(
    public var type: Dropimagetype = 0,
    public var szMessage: UShortArray = UShortArray(260),
    public var szInsert: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dropdescription) return false
        if (this.type != other.type) return false
        if (!this.szMessage.contentEquals(other.szMessage)) return false
        if (!this.szInsert.contentEquals(other.szInsert)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.szMessage.contentHashCode()
        result = 31 * result + this.szInsert.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dropdescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dropdescription> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1044L
                override fun readNative(addr: Long): Dropdescription =
                    Dropdescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Dropdescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.szMessage.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 524L, value.szInsert.toList())
                }
            }
    }
}

public data class Dropfiles(
    public var pFiles: UInt = 0u,
    public var pt: Point = Point(),
    public var fNC: Bool = 0,
    public var fWide: Bool = 0,
)

public data class ExpDarwinLink(
    public var dbh: DatablockHeader = DatablockHeader(),
    public var szDarwinID: ByteArray = ByteArray(260),
    public var szwDarwinID: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExpDarwinLink) return false
        if (this.dbh != other.dbh) return false
        if (!this.szDarwinID.contentEquals(other.szDarwinID)) return false
        if (!this.szwDarwinID.contentEquals(other.szwDarwinID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbh.hashCode()
        result = 31 * result + this.szDarwinID.contentHashCode()
        result = 31 * result + this.szwDarwinID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpDarwinLink> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpDarwinLink> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 788L
                override fun readNative(addr: Long): ExpDarwinLink =
                    ExpDarwinLink(
                        (DatablockHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 268L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ExpDarwinLink) {
                    (DatablockHeader.typeLayout()).writeNative(addr, value.dbh)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 8L, value.szDarwinID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 268L, value.szwDarwinID.toList())
                }
            }
    }
}

public data class ExpPropertystorage(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var abPropertyStorage: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExpPropertystorage) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwSignature != other.dwSignature) return false
        if (!this.abPropertyStorage.contentEquals(other.abPropertyStorage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwSignature.hashCode()
        result = 31 * result + this.abPropertyStorage.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpPropertystorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpPropertystorage> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): ExpPropertystorage =
                    ExpPropertystorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ExpPropertystorage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignature)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.abPropertyStorage.toList())
                }
            }
    }
}

public data class ExpSpecialFolder(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var idSpecialFolder: UInt = 0u,
    public var cbOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpSpecialFolder> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpSpecialFolder> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ExpSpecialFolder =
                    ExpSpecialFolder(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ExpSpecialFolder) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.idSpecialFolder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbOffset)
                }
            }
    }
}

public data class ExpSzLink(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var szTarget: ByteArray = ByteArray(260),
    public var swzTarget: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExpSzLink) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwSignature != other.dwSignature) return false
        if (!this.szTarget.contentEquals(other.szTarget)) return false
        if (!this.swzTarget.contentEquals(other.swzTarget)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwSignature.hashCode()
        result = 31 * result + this.szTarget.contentHashCode()
        result = 31 * result + this.swzTarget.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpSzLink> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpSzLink> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 788L
                override fun readNative(addr: Long): ExpSzLink =
                    ExpSzLink(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 268L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ExpSzLink) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSignature)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 8L, value.szTarget.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 268L, value.swzTarget.toList())
                }
            }
    }
}

public data class Extrasearch(
    public var guidSearch: Guid = Guid(),
    public var wszFriendlyName: UShortArray = UShortArray(80),
    public var wszUrl: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extrasearch) return false
        if (this.guidSearch != other.guidSearch) return false
        if (!this.wszFriendlyName.contentEquals(other.wszFriendlyName)) return false
        if (!this.wszUrl.contentEquals(other.wszUrl)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidSearch.hashCode()
        result = 31 * result + this.wszFriendlyName.contentHashCode()
        result = 31 * result + this.wszUrl.contentHashCode()
        return result
    }
}

public data class Filedescriptora(
    public var dwFlags: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var sizel: Size = Size(),
    public var pointl: Pointl = Pointl(),
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var cFileName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filedescriptora) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.clsid != other.clsid) return false
        if (this.sizel != other.sizel) return false
        if (this.pointl != other.pointl) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.ftCreationTime != other.ftCreationTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastWriteTime != other.ftLastWriteTime) return false
        if (this.nFileSizeHigh != other.nFileSizeHigh) return false
        if (this.nFileSizeLow != other.nFileSizeLow) return false
        if (!this.cFileName.contentEquals(other.cFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.sizel.hashCode()
        result = 31 * result + this.pointl.hashCode()
        result = 31 * result + this.dwFileAttributes.hashCode()
        result = 31 * result + this.ftCreationTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastWriteTime.hashCode()
        result = 31 * result + this.nFileSizeHigh.hashCode()
        result = 31 * result + this.nFileSizeLow.hashCode()
        result = 31 * result + this.cFileName.contentHashCode()
        return result
    }
}

public data class Filedescriptorw(
    public var dwFlags: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var sizel: Size = Size(),
    public var pointl: Pointl = Pointl(),
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Filetime = Filetime(),
    public var ftLastAccessTime: Filetime = Filetime(),
    public var ftLastWriteTime: Filetime = Filetime(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var cFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filedescriptorw) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.clsid != other.clsid) return false
        if (this.sizel != other.sizel) return false
        if (this.pointl != other.pointl) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.ftCreationTime != other.ftCreationTime) return false
        if (this.ftLastAccessTime != other.ftLastAccessTime) return false
        if (this.ftLastWriteTime != other.ftLastWriteTime) return false
        if (this.nFileSizeHigh != other.nFileSizeHigh) return false
        if (this.nFileSizeLow != other.nFileSizeLow) return false
        if (!this.cFileName.contentEquals(other.cFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.sizel.hashCode()
        result = 31 * result + this.pointl.hashCode()
        result = 31 * result + this.dwFileAttributes.hashCode()
        result = 31 * result + this.ftCreationTime.hashCode()
        result = 31 * result + this.ftLastAccessTime.hashCode()
        result = 31 * result + this.ftLastWriteTime.hashCode()
        result = 31 * result + this.nFileSizeHigh.hashCode()
        result = 31 * result + this.nFileSizeLow.hashCode()
        result = 31 * result + this.cFileName.contentHashCode()
        return result
    }
}

public data class Filegroupdescriptora(
    public var cItems: UInt = 0u,
    public var fgd: List<Filedescriptora> = List(1) { Filedescriptora() },
)

public data class Filegroupdescriptorw(
    public var cItems: UInt = 0u,
    public var fgd: List<Filedescriptorw> = List(1) { Filedescriptorw() },
)

public data class FileAttributesArray(
    public var cItems: UInt = 0u,
    public var dwSumFileAttributes: UInt = 0u,
    public var dwProductFileAttributes: UInt = 0u,
    public var rgdwFileAttributes: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileAttributesArray) return false
        if (this.cItems != other.cItems) return false
        if (this.dwSumFileAttributes != other.dwSumFileAttributes) return false
        if (this.dwProductFileAttributes != other.dwProductFileAttributes) return false
        if (!this.rgdwFileAttributes.contentEquals(other.rgdwFileAttributes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cItems.hashCode()
        result = 31 * result + this.dwSumFileAttributes.hashCode()
        result = 31 * result + this.dwProductFileAttributes.hashCode()
        result = 31 * result + this.rgdwFileAttributes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAttributesArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileAttributesArray> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FileAttributesArray =
                    FileAttributesArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: FileAttributesArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cItems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSumFileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwProductFileAttributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.rgdwFileAttributes.toList())
                }
            }
    }
}

public data class Foldersetdata(
    public var fs: Foldersettings = Foldersettings(),
    public var vidRestore: Guid = Guid(),
    public var dwViewPriority: UInt = 0u,
)

public data class Foldersettings(
    public var viewMode: UInt = 0u,
    public var fFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Foldersettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Foldersettings> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Foldersettings =
                    Foldersettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Foldersettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.viewMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fFlags)
                }
            }
    }
}

public class Helpinfo internal constructor(
    public var cbSize: UInt,
    public var iContextType: HelpInfoType,
    public var iCtrlId: Int,
    hItemHandleCtorArg: Handle,
    public var dwContextId: Int,
    public var mousePos: Point,
) {
    public var hItemHandle: Handle = hItemHandleCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        iContextType = 0,
        iCtrlId = 0,
        hItemHandleCtorArg = MutPtr(0L),
        dwContextId = 0,
        mousePos = Point(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HelpInfoType = this.iContextType

    public operator fun component3(): Int = this.iCtrlId

    public operator fun component4(): Handle = this.hItemHandle

    public operator fun component5(): Int = this.dwContextId

    public operator fun component6(): Point = this.mousePos

    public fun copy(cbSize: UInt = this.cbSize, iContextType: HelpInfoType = this.iContextType, iCtrlId: Int = this.iCtrlId, hItemHandle: Handle = this.hItemHandle, dwContextId: Int = this.dwContextId, mousePos: Point = this.mousePos): Helpinfo = Helpinfo(cbSize = cbSize, iContextType = iContextType, iCtrlId = iCtrlId, hItemHandleCtorArg = hItemHandle, dwContextId = dwContextId, mousePos = mousePos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Helpinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.iContextType != other.iContextType) return false
        if (this.iCtrlId != other.iCtrlId) return false
        if (this.hItemHandle != other.hItemHandle) return false
        if (this.dwContextId != other.dwContextId) return false
        if (this.mousePos != other.mousePos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.iContextType.hashCode()
        result = 31 * result + this.iCtrlId.hashCode()
        result = 31 * result + this.hItemHandle.hashCode()
        result = 31 * result + this.dwContextId.hashCode()
        result = 31 * result + this.mousePos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            iContextType: HelpInfoType = 0,
            iCtrlId: Int = 0,
            hItemHandle: Handle = MutPtr(0L),
            dwContextId: Int = 0,
            mousePos: Point = Point(),
        ): Helpinfo =
            Helpinfo(
                cbSize = cbSize,
                iContextType = iContextType,
                iCtrlId = iCtrlId,
                hItemHandleCtorArg = hItemHandle,
                dwContextId = dwContextId,
                mousePos = mousePos,
            )
    }
}

public data class Helpwininfoa(
    public var wStructSize: Int = 0,
    public var x: Int = 0,
    public var y: Int = 0,
    public var dx: Int = 0,
    public var dy: Int = 0,
    public var wMax: Int = 0,
    public var rgchMember: ByteArray = ByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Helpwininfoa) return false
        if (this.wStructSize != other.wStructSize) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.dx != other.dx) return false
        if (this.dy != other.dy) return false
        if (this.wMax != other.wMax) return false
        if (!this.rgchMember.contentEquals(other.rgchMember)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wStructSize.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.dx.hashCode()
        result = 31 * result + this.dy.hashCode()
        result = 31 * result + this.wMax.hashCode()
        result = 31 * result + this.rgchMember.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Helpwininfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Helpwininfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Helpwininfoa =
                    Helpwininfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Helpwininfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.dy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.wMax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2).toInt())
                    ).writeNative(addr + 24L, value.rgchMember.toList())
                }
            }
    }
}

public data class Helpwininfow(
    public var wStructSize: Int = 0,
    public var x: Int = 0,
    public var y: Int = 0,
    public var dx: Int = 0,
    public var dy: Int = 0,
    public var wMax: Int = 0,
    public var rgchMember: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Helpwininfow) return false
        if (this.wStructSize != other.wStructSize) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.dx != other.dx) return false
        if (this.dy != other.dy) return false
        if (this.wMax != other.wMax) return false
        if (!this.rgchMember.contentEquals(other.rgchMember)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wStructSize.hashCode()
        result = 31 * result + this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.dx.hashCode()
        result = 31 * result + this.dy.hashCode()
        result = 31 * result + this.wMax.hashCode()
        result = 31 * result + this.rgchMember.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Helpwininfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Helpwininfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Helpwininfow =
                    Helpwininfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Helpwininfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.dy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.wMax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 24L, value.rgchMember.toList())
                }
            }
    }
}

public data class Hlbwinfo(
    public var cbSize: UInt = 0u,
    public var grfHLBWIF: UInt = 0u,
    public var rcFramePos: Rect = Rect(),
    public var rcDocPos: Rect = Rect(),
    public var hltbinfo: Hltbinfo = Hltbinfo(),
)

public class Hlitem internal constructor(
    public var uHLID: UInt,
    pwzFriendlyNameCtorArg: Pwstr,
) {
    public var pwzFriendlyName: Pwstr = pwzFriendlyNameCtorArg
        internal set

    public constructor() : this(
        uHLID = 0u,
        pwzFriendlyNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.uHLID

    public operator fun component2(): Pwstr = this.pwzFriendlyName

    public fun copy(uHLID: UInt = this.uHLID, pwzFriendlyName: Pwstr = this.pwzFriendlyName): Hlitem = Hlitem(uHLID = uHLID, pwzFriendlyNameCtorArg = pwzFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hlitem) return false
        if (this.uHLID != other.uHLID) return false
        if (this.pwzFriendlyName != other.pwzFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uHLID.hashCode()
        result = 31 * result + this.pwzFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uHLID: UInt = 0u,
            pwzFriendlyName: Pwstr = MutPtr(0L),
        ): Hlitem =
            Hlitem(
                uHLID = uHLID,
                pwzFriendlyNameCtorArg = pwzFriendlyName,
            )
    }
}

public data class Hltbinfo(
    public var uDockType: UInt = 0u,
    public var rcTbPos: Rect = Rect(),
)

public data class Itemspacing(
    public var cxSmall: Int = 0,
    public var cySmall: Int = 0,
    public var cxLarge: Int = 0,
    public var cyLarge: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itemspacing> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itemspacing> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Itemspacing =
                    Itemspacing(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Itemspacing) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cxSmall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cySmall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cxLarge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cyLarge)
                }
            }
    }
}

public class KnownfolderDefinition internal constructor(
    public var category: KfCategory,
    pszNameCtorArg: Pwstr,
    pszDescriptionCtorArg: Pwstr,
    public var fidParent: Guid,
    pszRelativePathCtorArg: Pwstr,
    pszParsingNameCtorArg: Pwstr,
    pszTooltipCtorArg: Pwstr,
    pszLocalizedNameCtorArg: Pwstr,
    pszIconCtorArg: Pwstr,
    pszSecurityCtorArg: Pwstr,
    public var dwAttributes: UInt,
    public var kfdFlags: UInt,
    public var ftidType: Guid,
) {
    public var pszName: Pwstr = pszNameCtorArg
        internal set

    public var pszDescription: Pwstr = pszDescriptionCtorArg
        internal set

    public var pszRelativePath: Pwstr = pszRelativePathCtorArg
        internal set

    public var pszParsingName: Pwstr = pszParsingNameCtorArg
        internal set

    public var pszTooltip: Pwstr = pszTooltipCtorArg
        internal set

    public var pszLocalizedName: Pwstr = pszLocalizedNameCtorArg
        internal set

    public var pszIcon: Pwstr = pszIconCtorArg
        internal set

    public var pszSecurity: Pwstr = pszSecurityCtorArg
        internal set

    public constructor() : this(
        category = 0,
        pszNameCtorArg = MutPtr(0L),
        pszDescriptionCtorArg = MutPtr(0L),
        fidParent = Guid(),
        pszRelativePathCtorArg = MutPtr(0L),
        pszParsingNameCtorArg = MutPtr(0L),
        pszTooltipCtorArg = MutPtr(0L),
        pszLocalizedNameCtorArg = MutPtr(0L),
        pszIconCtorArg = MutPtr(0L),
        pszSecurityCtorArg = MutPtr(0L),
        dwAttributes = 0u,
        kfdFlags = 0u,
        ftidType = Guid(),
    )

    public operator fun component1(): KfCategory = this.category

    public operator fun component2(): Pwstr = this.pszName

    public operator fun component3(): Pwstr = this.pszDescription

    public operator fun component4(): Guid = this.fidParent

    public operator fun component5(): Pwstr = this.pszRelativePath

    public operator fun component6(): Pwstr = this.pszParsingName

    public operator fun component7(): Pwstr = this.pszTooltip

    public operator fun component8(): Pwstr = this.pszLocalizedName

    public operator fun component9(): Pwstr = this.pszIcon

    public operator fun component10(): Pwstr = this.pszSecurity

    public operator fun component11(): UInt = this.dwAttributes

    public operator fun component12(): UInt = this.kfdFlags

    public operator fun component13(): Guid = this.ftidType

    public fun copy(category: KfCategory = this.category, pszName: Pwstr = this.pszName, pszDescription: Pwstr = this.pszDescription, fidParent: Guid = this.fidParent, pszRelativePath: Pwstr = this.pszRelativePath, pszParsingName: Pwstr = this.pszParsingName, pszTooltip: Pwstr = this.pszTooltip, pszLocalizedName: Pwstr = this.pszLocalizedName, pszIcon: Pwstr = this.pszIcon, pszSecurity: Pwstr = this.pszSecurity, dwAttributes: UInt = this.dwAttributes, kfdFlags: UInt = this.kfdFlags, ftidType: Guid = this.ftidType): KnownfolderDefinition = KnownfolderDefinition(category = category, pszNameCtorArg = pszName, pszDescriptionCtorArg = pszDescription, fidParent = fidParent, pszRelativePathCtorArg = pszRelativePath, pszParsingNameCtorArg = pszParsingName, pszTooltipCtorArg = pszTooltip, pszLocalizedNameCtorArg = pszLocalizedName, pszIconCtorArg = pszIcon, pszSecurityCtorArg = pszSecurity, dwAttributes = dwAttributes, kfdFlags = kfdFlags, ftidType = ftidType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KnownfolderDefinition) return false
        if (this.category != other.category) return false
        if (this.pszName != other.pszName) return false
        if (this.pszDescription != other.pszDescription) return false
        if (this.fidParent != other.fidParent) return false
        if (this.pszRelativePath != other.pszRelativePath) return false
        if (this.pszParsingName != other.pszParsingName) return false
        if (this.pszTooltip != other.pszTooltip) return false
        if (this.pszLocalizedName != other.pszLocalizedName) return false
        if (this.pszIcon != other.pszIcon) return false
        if (this.pszSecurity != other.pszSecurity) return false
        if (this.dwAttributes != other.dwAttributes) return false
        if (this.kfdFlags != other.kfdFlags) return false
        if (this.ftidType != other.ftidType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.category.hashCode()
        result = 31 * result + this.pszName.hashCode()
        result = 31 * result + this.pszDescription.hashCode()
        result = 31 * result + this.fidParent.hashCode()
        result = 31 * result + this.pszRelativePath.hashCode()
        result = 31 * result + this.pszParsingName.hashCode()
        result = 31 * result + this.pszTooltip.hashCode()
        result = 31 * result + this.pszLocalizedName.hashCode()
        result = 31 * result + this.pszIcon.hashCode()
        result = 31 * result + this.pszSecurity.hashCode()
        result = 31 * result + this.dwAttributes.hashCode()
        result = 31 * result + this.kfdFlags.hashCode()
        result = 31 * result + this.ftidType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            category: KfCategory = 0,
            pszName: Pwstr = MutPtr(0L),
            pszDescription: Pwstr = MutPtr(0L),
            fidParent: Guid = Guid(),
            pszRelativePath: Pwstr = MutPtr(0L),
            pszParsingName: Pwstr = MutPtr(0L),
            pszTooltip: Pwstr = MutPtr(0L),
            pszLocalizedName: Pwstr = MutPtr(0L),
            pszIcon: Pwstr = MutPtr(0L),
            pszSecurity: Pwstr = MutPtr(0L),
            dwAttributes: UInt = 0u,
            kfdFlags: UInt = 0u,
            ftidType: Guid = Guid(),
        ): KnownfolderDefinition =
            KnownfolderDefinition(
                category = category,
                pszNameCtorArg = pszName,
                pszDescriptionCtorArg = pszDescription,
                fidParent = fidParent,
                pszRelativePathCtorArg = pszRelativePath,
                pszParsingNameCtorArg = pszParsingName,
                pszTooltipCtorArg = pszTooltip,
                pszLocalizedNameCtorArg = pszLocalizedName,
                pszIconCtorArg = pszIcon,
                pszSecurityCtorArg = pszSecurity,
                dwAttributes = dwAttributes,
                kfdFlags = kfdFlags,
                ftidType = ftidType,
            )
    }
}

public data class Multikeyhelpa(
    public var mkSize: UInt = 0u,
    public var mkKeylist: Byte = 0,
    public var szKeyphrase: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Multikeyhelpa) return false
        if (this.mkSize != other.mkSize) return false
        if (this.mkKeylist != other.mkKeylist) return false
        if (!this.szKeyphrase.contentEquals(other.szKeyphrase)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mkSize.hashCode()
        result = 31 * result + this.mkKeylist.hashCode()
        result = 31 * result + this.szKeyphrase.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Multikeyhelpa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Multikeyhelpa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Multikeyhelpa =
                    Multikeyhelpa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 5L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Multikeyhelpa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mkSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 4L, value.mkKeylist)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 5L, value.szKeyphrase.toList())
                }
            }
    }
}

public data class Multikeyhelpw(
    public var mkSize: UInt = 0u,
    public var mkKeylist: UShort = 0u,
    public var szKeyphrase: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Multikeyhelpw) return false
        if (this.mkSize != other.mkSize) return false
        if (this.mkKeylist != other.mkKeylist) return false
        if (!this.szKeyphrase.contentEquals(other.szKeyphrase)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mkSize.hashCode()
        result = 31 * result + this.mkKeylist.hashCode()
        result = 31 * result + this.szKeyphrase.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Multikeyhelpw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Multikeyhelpw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Multikeyhelpw =
                    Multikeyhelpw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Multikeyhelpw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mkSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.mkKeylist)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 6L, value.szKeyphrase.toList())
                }
            }
    }
}

public class NcAddress internal constructor(
    pAddrInfoCtorArg: MutPtr,
    public var portNumber: UShort,
    public var prefixLength: UByte,
) {
    public var pAddrInfo: MutPtr = pAddrInfoCtorArg
        internal set

    public constructor() : this(
        pAddrInfoCtorArg = MutPtr(0L),
        portNumber = 0u,
        prefixLength = 0u,
    )

    public operator fun component1(): MutPtr = this.pAddrInfo

    public operator fun component2(): UShort = this.portNumber

    public operator fun component3(): UByte = this.prefixLength

    public fun copy(pAddrInfo: MutPtr = this.pAddrInfo, portNumber: UShort = this.portNumber, prefixLength: UByte = this.prefixLength): NcAddress = NcAddress(pAddrInfoCtorArg = pAddrInfo, portNumber = portNumber, prefixLength = prefixLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NcAddress) return false
        if (this.pAddrInfo != other.pAddrInfo) return false
        if (this.portNumber != other.portNumber) return false
        if (this.prefixLength != other.prefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pAddrInfo.hashCode()
        result = 31 * result + this.portNumber.hashCode()
        result = 31 * result + this.prefixLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NcAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NcAddress =
                    NcAddress(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NcAddress) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pAddrInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.prefixLength)
                }
            }

        public operator fun invoke(
            pAddrInfo: MutPtr = MutPtr(0L),
            portNumber: UShort = 0u,
            prefixLength: UByte = 0u,
        ): NcAddress =
            NcAddress(
                pAddrInfoCtorArg = pAddrInfo,
                portNumber = portNumber,
                prefixLength = prefixLength,
            )
    }
}

public class Newcplinfoa internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwHelpContext: UInt,
    public var lData: Int,
    hIconCtorArg: Hicon,
    public var szName: ByteArray,
    public var szInfo: ByteArray,
    public var szHelpFile: ByteArray,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwHelpContext = 0u,
        lData = 0,
        hIconCtorArg = MutPtr(0L),
        szName = ByteArray(32),
        szInfo = ByteArray(64),
        szHelpFile = ByteArray(128),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwHelpContext

    public operator fun component4(): Int = this.lData

    public operator fun component5(): Hicon = this.hIcon

    public operator fun component6(): ByteArray = this.szName

    public operator fun component7(): ByteArray = this.szInfo

    public operator fun component8(): ByteArray = this.szHelpFile

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwHelpContext: UInt = this.dwHelpContext, lData: Int = this.lData, hIcon: Hicon = this.hIcon, szName: ByteArray = this.szName, szInfo: ByteArray = this.szInfo, szHelpFile: ByteArray = this.szHelpFile): Newcplinfoa = Newcplinfoa(dwSize = dwSize, dwFlags = dwFlags, dwHelpContext = dwHelpContext, lData = lData, hIconCtorArg = hIcon, szName = szName, szInfo = szInfo, szHelpFile = szHelpFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Newcplinfoa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwHelpContext != other.dwHelpContext) return false
        if (this.lData != other.lData) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szInfo.contentEquals(other.szInfo)) return false
        if (!this.szHelpFile.contentEquals(other.szHelpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwHelpContext.hashCode()
        result = 31 * result + this.lData.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szInfo.contentHashCode()
        result = 31 * result + this.szHelpFile.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwHelpContext: UInt = 0u,
            lData: Int = 0,
            hIcon: Hicon = MutPtr(0L),
            szName: ByteArray = ByteArray(32),
            szInfo: ByteArray = ByteArray(64),
            szHelpFile: ByteArray = ByteArray(128),
        ): Newcplinfoa =
            Newcplinfoa(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwHelpContext = dwHelpContext,
                lData = lData,
                hIconCtorArg = hIcon,
                szName = szName,
                szInfo = szInfo,
                szHelpFile = szHelpFile,
            )
    }
}

public class Newcplinfow internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    public var dwHelpContext: UInt,
    public var lData: Int,
    hIconCtorArg: Hicon,
    public var szName: UShortArray,
    public var szInfo: UShortArray,
    public var szHelpFile: UShortArray,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        dwHelpContext = 0u,
        lData = 0,
        hIconCtorArg = MutPtr(0L),
        szName = UShortArray(32),
        szInfo = UShortArray(64),
        szHelpFile = UShortArray(128),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwHelpContext

    public operator fun component4(): Int = this.lData

    public operator fun component5(): Hicon = this.hIcon

    public operator fun component6(): UShortArray = this.szName

    public operator fun component7(): UShortArray = this.szInfo

    public operator fun component8(): UShortArray = this.szHelpFile

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, dwHelpContext: UInt = this.dwHelpContext, lData: Int = this.lData, hIcon: Hicon = this.hIcon, szName: UShortArray = this.szName, szInfo: UShortArray = this.szInfo, szHelpFile: UShortArray = this.szHelpFile): Newcplinfow = Newcplinfow(dwSize = dwSize, dwFlags = dwFlags, dwHelpContext = dwHelpContext, lData = lData, hIconCtorArg = hIcon, szName = szName, szInfo = szInfo, szHelpFile = szHelpFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Newcplinfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwHelpContext != other.dwHelpContext) return false
        if (this.lData != other.lData) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (!this.szInfo.contentEquals(other.szInfo)) return false
        if (!this.szHelpFile.contentEquals(other.szHelpFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwHelpContext.hashCode()
        result = 31 * result + this.lData.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.szInfo.contentHashCode()
        result = 31 * result + this.szHelpFile.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            dwHelpContext: UInt = 0u,
            lData: Int = 0,
            hIcon: Hicon = MutPtr(0L),
            szName: UShortArray = UShortArray(32),
            szInfo: UShortArray = UShortArray(64),
            szHelpFile: UShortArray = UShortArray(128),
        ): Newcplinfow =
            Newcplinfow(
                dwSize = dwSize,
                dwFlags = dwFlags,
                dwHelpContext = dwHelpContext,
                lData = lData,
                hIconCtorArg = hIcon,
                szName = szName,
                szInfo = szInfo,
                szHelpFile = szHelpFile,
            )
    }
}

public class Notifyicondataa internal constructor(
    public var cbSize: UInt,
    hWndCtorArg: Hwnd,
    public var uID: UInt,
    public var uFlags: NotifyIconDataFlags,
    public var uCallbackMessage: UInt,
    hIconCtorArg: Hicon,
    public var szTip: ByteArray,
    public var dwState: NotifyIconState,
    public var dwStateMask: NotifyIconState,
    public var szInfo: ByteArray,
    public var anonymous: Notifyicondataa0,
    public var szInfoTitle: ByteArray,
    public var dwInfoFlags: NotifyIconInfotipFlags,
    public var guidItem: Guid,
    hBalloonIconCtorArg: Hicon,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var hBalloonIcon: Hicon = hBalloonIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hWndCtorArg = MutPtr(0L),
        uID = 0u,
        uFlags = 0u,
        uCallbackMessage = 0u,
        hIconCtorArg = MutPtr(0L),
        szTip = ByteArray(128),
        dwState = 0u,
        dwStateMask = 0u,
        szInfo = ByteArray(256),
        anonymous = Notifyicondataa0(),
        szInfoTitle = ByteArray(64),
        dwInfoFlags = 0u,
        guidItem = Guid(),
        hBalloonIconCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.uID

    public operator fun component4(): NotifyIconDataFlags = this.uFlags

    public operator fun component5(): UInt = this.uCallbackMessage

    public operator fun component6(): Hicon = this.hIcon

    public operator fun component7(): ByteArray = this.szTip

    public operator fun component8(): NotifyIconState = this.dwState

    public operator fun component9(): NotifyIconState = this.dwStateMask

    public operator fun component10(): ByteArray = this.szInfo

    public operator fun component11(): Notifyicondataa0 = this.anonymous

    public operator fun component12(): ByteArray = this.szInfoTitle

    public operator fun component13(): NotifyIconInfotipFlags = this.dwInfoFlags

    public operator fun component14(): Guid = this.guidItem

    public operator fun component15(): Hicon = this.hBalloonIcon

    public fun copy(cbSize: UInt = this.cbSize, hWnd: Hwnd = this.hWnd, uID: UInt = this.uID, uFlags: NotifyIconDataFlags = this.uFlags, uCallbackMessage: UInt = this.uCallbackMessage, hIcon: Hicon = this.hIcon, szTip: ByteArray = this.szTip, dwState: NotifyIconState = this.dwState, dwStateMask: NotifyIconState = this.dwStateMask, szInfo: ByteArray = this.szInfo, anonymous: Notifyicondataa0 = this.anonymous, szInfoTitle: ByteArray = this.szInfoTitle, dwInfoFlags: NotifyIconInfotipFlags = this.dwInfoFlags, guidItem: Guid = this.guidItem, hBalloonIcon: Hicon = this.hBalloonIcon): Notifyicondataa = Notifyicondataa(cbSize = cbSize, hWndCtorArg = hWnd, uID = uID, uFlags = uFlags, uCallbackMessage = uCallbackMessage, hIconCtorArg = hIcon, szTip = szTip, dwState = dwState, dwStateMask = dwStateMask, szInfo = szInfo, anonymous = anonymous, szInfoTitle = szInfoTitle, dwInfoFlags = dwInfoFlags, guidItem = guidItem, hBalloonIconCtorArg = hBalloonIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifyicondataa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hWnd != other.hWnd) return false
        if (this.uID != other.uID) return false
        if (this.uFlags != other.uFlags) return false
        if (this.uCallbackMessage != other.uCallbackMessage) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.szTip.contentEquals(other.szTip)) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (!this.szInfo.contentEquals(other.szInfo)) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.szInfoTitle.contentEquals(other.szInfoTitle)) return false
        if (this.dwInfoFlags != other.dwInfoFlags) return false
        if (this.guidItem != other.guidItem) return false
        if (this.hBalloonIcon != other.hBalloonIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.uID.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.uCallbackMessage.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.szTip.contentHashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.szInfo.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.szInfoTitle.contentHashCode()
        result = 31 * result + this.dwInfoFlags.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        result = 31 * result + this.hBalloonIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hWnd: Hwnd = MutPtr(0L),
            uID: UInt = 0u,
            uFlags: NotifyIconDataFlags = 0u,
            uCallbackMessage: UInt = 0u,
            hIcon: Hicon = MutPtr(0L),
            szTip: ByteArray = ByteArray(128),
            dwState: NotifyIconState = 0u,
            dwStateMask: NotifyIconState = 0u,
            szInfo: ByteArray = ByteArray(256),
            anonymous: Notifyicondataa0 = Notifyicondataa0(),
            szInfoTitle: ByteArray = ByteArray(64),
            dwInfoFlags: NotifyIconInfotipFlags = 0u,
            guidItem: Guid = Guid(),
            hBalloonIcon: Hicon = MutPtr(0L),
        ): Notifyicondataa =
            Notifyicondataa(
                cbSize = cbSize,
                hWndCtorArg = hWnd,
                uID = uID,
                uFlags = uFlags,
                uCallbackMessage = uCallbackMessage,
                hIconCtorArg = hIcon,
                szTip = szTip,
                dwState = dwState,
                dwStateMask = dwStateMask,
                szInfo = szInfo,
                anonymous = anonymous,
                szInfoTitle = szInfoTitle,
                dwInfoFlags = dwInfoFlags,
                guidItem = guidItem,
                hBalloonIconCtorArg = hBalloonIcon,
            )
    }
}

public data class Notifyicondataa0(
    public var uTimeout: UInt = 0u,
    public var uVersion: UInt = 0u,
)

public class Notifyicondataw internal constructor(
    public var cbSize: UInt,
    hWndCtorArg: Hwnd,
    public var uID: UInt,
    public var uFlags: NotifyIconDataFlags,
    public var uCallbackMessage: UInt,
    hIconCtorArg: Hicon,
    public var szTip: UShortArray,
    public var dwState: NotifyIconState,
    public var dwStateMask: NotifyIconState,
    public var szInfo: UShortArray,
    public var anonymous: Notifyicondataw0,
    public var szInfoTitle: UShortArray,
    public var dwInfoFlags: NotifyIconInfotipFlags,
    public var guidItem: Guid,
    hBalloonIconCtorArg: Hicon,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var hBalloonIcon: Hicon = hBalloonIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hWndCtorArg = MutPtr(0L),
        uID = 0u,
        uFlags = 0u,
        uCallbackMessage = 0u,
        hIconCtorArg = MutPtr(0L),
        szTip = UShortArray(128),
        dwState = 0u,
        dwStateMask = 0u,
        szInfo = UShortArray(256),
        anonymous = Notifyicondataw0(),
        szInfoTitle = UShortArray(64),
        dwInfoFlags = 0u,
        guidItem = Guid(),
        hBalloonIconCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.uID

    public operator fun component4(): NotifyIconDataFlags = this.uFlags

    public operator fun component5(): UInt = this.uCallbackMessage

    public operator fun component6(): Hicon = this.hIcon

    public operator fun component7(): UShortArray = this.szTip

    public operator fun component8(): NotifyIconState = this.dwState

    public operator fun component9(): NotifyIconState = this.dwStateMask

    public operator fun component10(): UShortArray = this.szInfo

    public operator fun component11(): Notifyicondataw0 = this.anonymous

    public operator fun component12(): UShortArray = this.szInfoTitle

    public operator fun component13(): NotifyIconInfotipFlags = this.dwInfoFlags

    public operator fun component14(): Guid = this.guidItem

    public operator fun component15(): Hicon = this.hBalloonIcon

    public fun copy(cbSize: UInt = this.cbSize, hWnd: Hwnd = this.hWnd, uID: UInt = this.uID, uFlags: NotifyIconDataFlags = this.uFlags, uCallbackMessage: UInt = this.uCallbackMessage, hIcon: Hicon = this.hIcon, szTip: UShortArray = this.szTip, dwState: NotifyIconState = this.dwState, dwStateMask: NotifyIconState = this.dwStateMask, szInfo: UShortArray = this.szInfo, anonymous: Notifyicondataw0 = this.anonymous, szInfoTitle: UShortArray = this.szInfoTitle, dwInfoFlags: NotifyIconInfotipFlags = this.dwInfoFlags, guidItem: Guid = this.guidItem, hBalloonIcon: Hicon = this.hBalloonIcon): Notifyicondataw = Notifyicondataw(cbSize = cbSize, hWndCtorArg = hWnd, uID = uID, uFlags = uFlags, uCallbackMessage = uCallbackMessage, hIconCtorArg = hIcon, szTip = szTip, dwState = dwState, dwStateMask = dwStateMask, szInfo = szInfo, anonymous = anonymous, szInfoTitle = szInfoTitle, dwInfoFlags = dwInfoFlags, guidItem = guidItem, hBalloonIconCtorArg = hBalloonIcon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifyicondataw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hWnd != other.hWnd) return false
        if (this.uID != other.uID) return false
        if (this.uFlags != other.uFlags) return false
        if (this.uCallbackMessage != other.uCallbackMessage) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.szTip.contentEquals(other.szTip)) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (!this.szInfo.contentEquals(other.szInfo)) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.szInfoTitle.contentEquals(other.szInfoTitle)) return false
        if (this.dwInfoFlags != other.dwInfoFlags) return false
        if (this.guidItem != other.guidItem) return false
        if (this.hBalloonIcon != other.hBalloonIcon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.uID.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.uCallbackMessage.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.szTip.contentHashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.szInfo.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.szInfoTitle.contentHashCode()
        result = 31 * result + this.dwInfoFlags.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        result = 31 * result + this.hBalloonIcon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hWnd: Hwnd = MutPtr(0L),
            uID: UInt = 0u,
            uFlags: NotifyIconDataFlags = 0u,
            uCallbackMessage: UInt = 0u,
            hIcon: Hicon = MutPtr(0L),
            szTip: UShortArray = UShortArray(128),
            dwState: NotifyIconState = 0u,
            dwStateMask: NotifyIconState = 0u,
            szInfo: UShortArray = UShortArray(256),
            anonymous: Notifyicondataw0 = Notifyicondataw0(),
            szInfoTitle: UShortArray = UShortArray(64),
            dwInfoFlags: NotifyIconInfotipFlags = 0u,
            guidItem: Guid = Guid(),
            hBalloonIcon: Hicon = MutPtr(0L),
        ): Notifyicondataw =
            Notifyicondataw(
                cbSize = cbSize,
                hWndCtorArg = hWnd,
                uID = uID,
                uFlags = uFlags,
                uCallbackMessage = uCallbackMessage,
                hIconCtorArg = hIcon,
                szTip = szTip,
                dwState = dwState,
                dwStateMask = dwStateMask,
                szInfo = szInfo,
                anonymous = anonymous,
                szInfoTitle = szInfoTitle,
                dwInfoFlags = dwInfoFlags,
                guidItem = guidItem,
                hBalloonIconCtorArg = hBalloonIcon,
            )
    }
}

public data class Notifyicondataw0(
    public var uTimeout: UInt = 0u,
    public var uVersion: UInt = 0u,
)

public class Notifyiconidentifier internal constructor(
    public var cbSize: UInt,
    hWndCtorArg: Hwnd,
    public var uID: UInt,
    public var guidItem: Guid,
) {
    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hWndCtorArg = MutPtr(0L),
        uID = 0u,
        guidItem = Guid(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hWnd

    public operator fun component3(): UInt = this.uID

    public operator fun component4(): Guid = this.guidItem

    public fun copy(cbSize: UInt = this.cbSize, hWnd: Hwnd = this.hWnd, uID: UInt = this.uID, guidItem: Guid = this.guidItem): Notifyiconidentifier = Notifyiconidentifier(cbSize = cbSize, hWndCtorArg = hWnd, uID = uID, guidItem = guidItem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifyiconidentifier) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hWnd != other.hWnd) return false
        if (this.uID != other.uID) return false
        if (this.guidItem != other.guidItem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.uID.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hWnd: Hwnd = MutPtr(0L),
            uID: UInt = 0u,
            guidItem: Guid = Guid(),
        ): Notifyiconidentifier =
            Notifyiconidentifier(
                cbSize = cbSize,
                hWndCtorArg = hWnd,
                uID = uID,
                guidItem = guidItem,
            )
    }
}

public data class Nresarray(
    public var cItems: UInt = 0u,
    public var nr: List<Netresourcea> = List(1) { Netresourcea() },
)

public class Nstccustomdraw internal constructor(
    psiCtorArg: MutPtr,
    public var uItemState: UInt,
    public var nstcis: UInt,
    pszTextCtorArg: Pcwstr,
    public var iImage: Int,
    public var himl: Himagelist,
    public var iLevel: Int,
    public var iIndent: Int,
) {
    public var psi: MutPtr = psiCtorArg
        internal set

    public var pszText: Pcwstr = pszTextCtorArg
        internal set

    public constructor() : this(
        psiCtorArg = MutPtr(0L),
        uItemState = 0u,
        nstcis = 0u,
        pszTextCtorArg = ConstPtr(0L),
        iImage = 0,
        himl = 0L,
        iLevel = 0,
        iIndent = 0,
    )

    public operator fun component1(): MutPtr = this.psi

    public operator fun component2(): UInt = this.uItemState

    public operator fun component3(): UInt = this.nstcis

    public operator fun component4(): Pcwstr = this.pszText

    public operator fun component5(): Int = this.iImage

    public operator fun component6(): Himagelist = this.himl

    public operator fun component7(): Int = this.iLevel

    public operator fun component8(): Int = this.iIndent

    public fun copy(psi: MutPtr = this.psi, uItemState: UInt = this.uItemState, nstcis: UInt = this.nstcis, pszText: Pcwstr = this.pszText, iImage: Int = this.iImage, himl: Himagelist = this.himl, iLevel: Int = this.iLevel, iIndent: Int = this.iIndent): Nstccustomdraw = Nstccustomdraw(psiCtorArg = psi, uItemState = uItemState, nstcis = nstcis, pszTextCtorArg = pszText, iImage = iImage, himl = himl, iLevel = iLevel, iIndent = iIndent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nstccustomdraw) return false
        if (this.psi != other.psi) return false
        if (this.uItemState != other.uItemState) return false
        if (this.nstcis != other.nstcis) return false
        if (this.pszText != other.pszText) return false
        if (this.iImage != other.iImage) return false
        if (this.himl != other.himl) return false
        if (this.iLevel != other.iLevel) return false
        if (this.iIndent != other.iIndent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psi.hashCode()
        result = 31 * result + this.uItemState.hashCode()
        result = 31 * result + this.nstcis.hashCode()
        result = 31 * result + this.pszText.hashCode()
        result = 31 * result + this.iImage.hashCode()
        result = 31 * result + this.himl.hashCode()
        result = 31 * result + this.iLevel.hashCode()
        result = 31 * result + this.iIndent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            psi: MutPtr = MutPtr(0L),
            uItemState: UInt = 0u,
            nstcis: UInt = 0u,
            pszText: Pcwstr = ConstPtr(0L),
            iImage: Int = 0,
            himl: Himagelist = 0L,
            iLevel: Int = 0,
            iIndent: Int = 0,
        ): Nstccustomdraw =
            Nstccustomdraw(
                psiCtorArg = psi,
                uItemState = uItemState,
                nstcis = nstcis,
                pszTextCtorArg = pszText,
                iImage = iImage,
                himl = himl,
                iLevel = iLevel,
                iIndent = iIndent,
            )
    }
}

public class NtConsoleProps(
    public var dbh: DatablockHeader = DatablockHeader(),
    public var wFillAttribute: UShort = 0u,
    public var wPopupFillAttribute: UShort = 0u,
    public var dwScreenBufferSize: Coord = Coord(),
    public var dwWindowSize: Coord = Coord(),
    public var dwWindowOrigin: Coord = Coord(),
    public var nFont: UInt = 0u,
    public var nInputBufferSize: UInt = 0u,
    public var dwFontSize: Coord = Coord(),
    public var uFontFamily: UInt = 0u,
    public var uFontWeight: UInt = 0u,
    public var faceName: UShortArray = UShortArray(32),
    public var uCursorSize: UInt = 0u,
    public var bFullScreen: Bool = 0,
    public var bQuickEdit: Bool = 0,
    public var bInsertMode: Bool = 0,
    public var bAutoPosition: Bool = 0,
    public var uHistoryBufferSize: UInt = 0u,
    public var uNumberOfHistoryBuffers: UInt = 0u,
    public var bHistoryNoDup: Bool = 0,
    public var colorTable: UIntArray = UIntArray(16),
)

public data class NtFeConsoleProps(
    public var dbh: DatablockHeader = DatablockHeader(),
    public var uCodePage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtFeConsoleProps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtFeConsoleProps> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): NtFeConsoleProps =
                    NtFeConsoleProps(
                        (DatablockHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NtFeConsoleProps) {
                    (DatablockHeader.typeLayout()).writeNative(addr, value.dbh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uCodePage)
                }
            }
    }
}

public class Openasinfo internal constructor(
    pcszFileCtorArg: Pcwstr,
    pcszClassCtorArg: Pcwstr,
    public var oaifInFlags: OpenAsInfoFlags,
) {
    public var pcszFile: Pcwstr = pcszFileCtorArg
        internal set

    public var pcszClass: Pcwstr = pcszClassCtorArg
        internal set

    public constructor() : this(
        pcszFileCtorArg = ConstPtr(0L),
        pcszClassCtorArg = ConstPtr(0L),
        oaifInFlags = 0,
    )

    public operator fun component1(): Pcwstr = this.pcszFile

    public operator fun component2(): Pcwstr = this.pcszClass

    public operator fun component3(): OpenAsInfoFlags = this.oaifInFlags

    public fun copy(pcszFile: Pcwstr = this.pcszFile, pcszClass: Pcwstr = this.pcszClass, oaifInFlags: OpenAsInfoFlags = this.oaifInFlags): Openasinfo = Openasinfo(pcszFileCtorArg = pcszFile, pcszClassCtorArg = pcszClass, oaifInFlags = oaifInFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Openasinfo) return false
        if (this.pcszFile != other.pcszFile) return false
        if (this.pcszClass != other.pcszClass) return false
        if (this.oaifInFlags != other.oaifInFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pcszFile.hashCode()
        result = 31 * result + this.pcszClass.hashCode()
        result = 31 * result + this.oaifInFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pcszFile: Pcwstr = ConstPtr(0L),
            pcszClass: Pcwstr = ConstPtr(0L),
            oaifInFlags: OpenAsInfoFlags = 0,
        ): Openasinfo =
            Openasinfo(
                pcszFileCtorArg = pcszFile,
                pcszClassCtorArg = pcszClass,
                oaifInFlags = oaifInFlags,
            )
    }
}

public class OpenPrinterPropsInfoa internal constructor(
    public var dwSize: UInt,
    pszSheetNameCtorArg: Pstr,
    public var uSheetIndex: UInt,
    public var dwFlags: UInt,
    public var bModal: Bool,
) {
    public var pszSheetName: Pstr = pszSheetNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pszSheetNameCtorArg = MutPtr(0L),
        uSheetIndex = 0u,
        dwFlags = 0u,
        bModal = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pstr = this.pszSheetName

    public operator fun component3(): UInt = this.uSheetIndex

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): Bool = this.bModal

    public fun copy(dwSize: UInt = this.dwSize, pszSheetName: Pstr = this.pszSheetName, uSheetIndex: UInt = this.uSheetIndex, dwFlags: UInt = this.dwFlags, bModal: Bool = this.bModal): OpenPrinterPropsInfoa = OpenPrinterPropsInfoa(dwSize = dwSize, pszSheetNameCtorArg = pszSheetName, uSheetIndex = uSheetIndex, dwFlags = dwFlags, bModal = bModal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OpenPrinterPropsInfoa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pszSheetName != other.pszSheetName) return false
        if (this.uSheetIndex != other.uSheetIndex) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.bModal != other.bModal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pszSheetName.hashCode()
        result = 31 * result + this.uSheetIndex.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bModal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pszSheetName: Pstr = MutPtr(0L),
            uSheetIndex: UInt = 0u,
            dwFlags: UInt = 0u,
            bModal: Bool = 0,
        ): OpenPrinterPropsInfoa =
            OpenPrinterPropsInfoa(
                dwSize = dwSize,
                pszSheetNameCtorArg = pszSheetName,
                uSheetIndex = uSheetIndex,
                dwFlags = dwFlags,
                bModal = bModal,
            )
    }
}

public class OpenPrinterPropsInfow internal constructor(
    public var dwSize: UInt,
    pszSheetNameCtorArg: Pwstr,
    public var uSheetIndex: UInt,
    public var dwFlags: UInt,
    public var bModal: Bool,
) {
    public var pszSheetName: Pwstr = pszSheetNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pszSheetNameCtorArg = MutPtr(0L),
        uSheetIndex = 0u,
        dwFlags = 0u,
        bModal = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pwstr = this.pszSheetName

    public operator fun component3(): UInt = this.uSheetIndex

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): Bool = this.bModal

    public fun copy(dwSize: UInt = this.dwSize, pszSheetName: Pwstr = this.pszSheetName, uSheetIndex: UInt = this.uSheetIndex, dwFlags: UInt = this.dwFlags, bModal: Bool = this.bModal): OpenPrinterPropsInfow = OpenPrinterPropsInfow(dwSize = dwSize, pszSheetNameCtorArg = pszSheetName, uSheetIndex = uSheetIndex, dwFlags = dwFlags, bModal = bModal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OpenPrinterPropsInfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pszSheetName != other.pszSheetName) return false
        if (this.uSheetIndex != other.uSheetIndex) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.bModal != other.bModal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pszSheetName.hashCode()
        result = 31 * result + this.uSheetIndex.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bModal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pszSheetName: Pwstr = MutPtr(0L),
            uSheetIndex: UInt = 0u,
            dwFlags: UInt = 0u,
            bModal: Bool = 0,
        ): OpenPrinterPropsInfow =
            OpenPrinterPropsInfow(
                dwSize = dwSize,
                pszSheetNameCtorArg = pszSheetName,
                uSheetIndex = uSheetIndex,
                dwFlags = dwFlags,
                bModal = bModal,
            )
    }
}

public class Parsedurla internal constructor(
    public var cbSize: UInt,
    pszProtocolCtorArg: Pcstr,
    public var cchProtocol: UInt,
    pszSuffixCtorArg: Pcstr,
    public var cchSuffix: UInt,
    public var nScheme: UInt,
) {
    public var pszProtocol: Pcstr = pszProtocolCtorArg
        internal set

    public var pszSuffix: Pcstr = pszSuffixCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszProtocolCtorArg = ConstPtr(0L),
        cchProtocol = 0u,
        pszSuffixCtorArg = ConstPtr(0L),
        cchSuffix = 0u,
        nScheme = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcstr = this.pszProtocol

    public operator fun component3(): UInt = this.cchProtocol

    public operator fun component4(): Pcstr = this.pszSuffix

    public operator fun component5(): UInt = this.cchSuffix

    public operator fun component6(): UInt = this.nScheme

    public fun copy(cbSize: UInt = this.cbSize, pszProtocol: Pcstr = this.pszProtocol, cchProtocol: UInt = this.cchProtocol, pszSuffix: Pcstr = this.pszSuffix, cchSuffix: UInt = this.cchSuffix, nScheme: UInt = this.nScheme): Parsedurla = Parsedurla(cbSize = cbSize, pszProtocolCtorArg = pszProtocol, cchProtocol = cchProtocol, pszSuffixCtorArg = pszSuffix, cchSuffix = cchSuffix, nScheme = nScheme)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Parsedurla) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszProtocol != other.pszProtocol) return false
        if (this.cchProtocol != other.cchProtocol) return false
        if (this.pszSuffix != other.pszSuffix) return false
        if (this.cchSuffix != other.cchSuffix) return false
        if (this.nScheme != other.nScheme) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszProtocol.hashCode()
        result = 31 * result + this.cchProtocol.hashCode()
        result = 31 * result + this.pszSuffix.hashCode()
        result = 31 * result + this.cchSuffix.hashCode()
        result = 31 * result + this.nScheme.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszProtocol: Pcstr = ConstPtr(0L),
            cchProtocol: UInt = 0u,
            pszSuffix: Pcstr = ConstPtr(0L),
            cchSuffix: UInt = 0u,
            nScheme: UInt = 0u,
        ): Parsedurla =
            Parsedurla(
                cbSize = cbSize,
                pszProtocolCtorArg = pszProtocol,
                cchProtocol = cchProtocol,
                pszSuffixCtorArg = pszSuffix,
                cchSuffix = cchSuffix,
                nScheme = nScheme,
            )
    }
}

public class Parsedurlw internal constructor(
    public var cbSize: UInt,
    pszProtocolCtorArg: Pcwstr,
    public var cchProtocol: UInt,
    pszSuffixCtorArg: Pcwstr,
    public var cchSuffix: UInt,
    public var nScheme: UInt,
) {
    public var pszProtocol: Pcwstr = pszProtocolCtorArg
        internal set

    public var pszSuffix: Pcwstr = pszSuffixCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pszProtocolCtorArg = ConstPtr(0L),
        cchProtocol = 0u,
        pszSuffixCtorArg = ConstPtr(0L),
        cchSuffix = 0u,
        nScheme = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Pcwstr = this.pszProtocol

    public operator fun component3(): UInt = this.cchProtocol

    public operator fun component4(): Pcwstr = this.pszSuffix

    public operator fun component5(): UInt = this.cchSuffix

    public operator fun component6(): UInt = this.nScheme

    public fun copy(cbSize: UInt = this.cbSize, pszProtocol: Pcwstr = this.pszProtocol, cchProtocol: UInt = this.cchProtocol, pszSuffix: Pcwstr = this.pszSuffix, cchSuffix: UInt = this.cchSuffix, nScheme: UInt = this.nScheme): Parsedurlw = Parsedurlw(cbSize = cbSize, pszProtocolCtorArg = pszProtocol, cchProtocol = cchProtocol, pszSuffixCtorArg = pszSuffix, cchSuffix = cchSuffix, nScheme = nScheme)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Parsedurlw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pszProtocol != other.pszProtocol) return false
        if (this.cchProtocol != other.cchProtocol) return false
        if (this.pszSuffix != other.pszSuffix) return false
        if (this.cchSuffix != other.cchSuffix) return false
        if (this.nScheme != other.nScheme) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pszProtocol.hashCode()
        result = 31 * result + this.cchProtocol.hashCode()
        result = 31 * result + this.pszSuffix.hashCode()
        result = 31 * result + this.cchSuffix.hashCode()
        result = 31 * result + this.nScheme.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pszProtocol: Pcwstr = ConstPtr(0L),
            cchProtocol: UInt = 0u,
            pszSuffix: Pcwstr = ConstPtr(0L),
            cchSuffix: UInt = 0u,
            nScheme: UInt = 0u,
        ): Parsedurlw =
            Parsedurlw(
                cbSize = cbSize,
                pszProtocolCtorArg = pszProtocol,
                cchProtocol = cchProtocol,
                pszSuffixCtorArg = pszSuffix,
                cchSuffix = cchSuffix,
                nScheme = nScheme,
            )
    }
}

public class PersistFolderTargetInfo internal constructor(
    pidlTargetFolderCtorArg: MutPtr,
    public var szTargetParsingName: UShortArray,
    public var szNetworkProvider: UShortArray,
    public var dwAttributes: UInt,
    public var csidl: Int,
) {
    public var pidlTargetFolder: MutPtr = pidlTargetFolderCtorArg
        internal set

    public constructor() : this(
        pidlTargetFolderCtorArg = MutPtr(0L),
        szTargetParsingName = UShortArray(260),
        szNetworkProvider = UShortArray(260),
        dwAttributes = 0u,
        csidl = 0,
    )

    public operator fun component1(): MutPtr = this.pidlTargetFolder

    public operator fun component2(): UShortArray = this.szTargetParsingName

    public operator fun component3(): UShortArray = this.szNetworkProvider

    public operator fun component4(): UInt = this.dwAttributes

    public operator fun component5(): Int = this.csidl

    public fun copy(pidlTargetFolder: MutPtr = this.pidlTargetFolder, szTargetParsingName: UShortArray = this.szTargetParsingName, szNetworkProvider: UShortArray = this.szNetworkProvider, dwAttributes: UInt = this.dwAttributes, csidl: Int = this.csidl): PersistFolderTargetInfo = PersistFolderTargetInfo(pidlTargetFolderCtorArg = pidlTargetFolder, szTargetParsingName = szTargetParsingName, szNetworkProvider = szNetworkProvider, dwAttributes = dwAttributes, csidl = csidl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistFolderTargetInfo) return false
        if (this.pidlTargetFolder != other.pidlTargetFolder) return false
        if (!this.szTargetParsingName.contentEquals(other.szTargetParsingName)) return false
        if (!this.szNetworkProvider.contentEquals(other.szNetworkProvider)) return false
        if (this.dwAttributes != other.dwAttributes) return false
        if (this.csidl != other.csidl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pidlTargetFolder.hashCode()
        result = 31 * result + this.szTargetParsingName.contentHashCode()
        result = 31 * result + this.szNetworkProvider.contentHashCode()
        result = 31 * result + this.dwAttributes.hashCode()
        result = 31 * result + this.csidl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistFolderTargetInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistFolderTargetInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1056L
                override fun readNative(addr: Long): PersistFolderTargetInfo =
                    PersistFolderTargetInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 528L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1048L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1052L),
                    )
                override fun writeNative(addr: Long, value: PersistFolderTargetInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pidlTargetFolder)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 8L, value.szTargetParsingName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 528L, value.szNetworkProvider.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1048L, value.dwAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1052L, value.csidl)
                }
            }

        public operator fun invoke(
            pidlTargetFolder: MutPtr = MutPtr(0L),
            szTargetParsingName: UShortArray = UShortArray(260),
            szNetworkProvider: UShortArray = UShortArray(260),
            dwAttributes: UInt = 0u,
            csidl: Int = 0,
        ): PersistFolderTargetInfo =
            PersistFolderTargetInfo(
                pidlTargetFolderCtorArg = pidlTargetFolder,
                szTargetParsingName = szTargetParsingName,
                szNetworkProvider = szNetworkProvider,
                dwAttributes = dwAttributes,
                csidl = csidl,
            )
    }
}

public class Previewhandlerframeinfo internal constructor(
    haccelCtorArg: Haccel,
    public var cAccelEntries: UInt,
) {
    public var haccel: Haccel = haccelCtorArg
        internal set

    public constructor() : this(
        haccelCtorArg = MutPtr(0L),
        cAccelEntries = 0u,
    )

    public operator fun component1(): Haccel = this.haccel

    public operator fun component2(): UInt = this.cAccelEntries

    public fun copy(haccel: Haccel = this.haccel, cAccelEntries: UInt = this.cAccelEntries): Previewhandlerframeinfo = Previewhandlerframeinfo(haccelCtorArg = haccel, cAccelEntries = cAccelEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Previewhandlerframeinfo) return false
        if (this.haccel != other.haccel) return false
        if (this.cAccelEntries != other.cAccelEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.haccel.hashCode()
        result = 31 * result + this.cAccelEntries.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            haccel: Haccel = MutPtr(0L),
            cAccelEntries: UInt = 0u,
        ): Previewhandlerframeinfo =
            Previewhandlerframeinfo(
                haccelCtorArg = haccel,
                cAccelEntries = cAccelEntries,
            )
    }
}

public class Profileinfoa internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    lpUserNameCtorArg: Pstr,
    lpProfilePathCtorArg: Pstr,
    lpDefaultPathCtorArg: Pstr,
    lpServerNameCtorArg: Pstr,
    lpPolicyPathCtorArg: Pstr,
    hProfileCtorArg: Handle,
) {
    public var lpUserName: Pstr = lpUserNameCtorArg
        internal set

    public var lpProfilePath: Pstr = lpProfilePathCtorArg
        internal set

    public var lpDefaultPath: Pstr = lpDefaultPathCtorArg
        internal set

    public var lpServerName: Pstr = lpServerNameCtorArg
        internal set

    public var lpPolicyPath: Pstr = lpPolicyPathCtorArg
        internal set

    public var hProfile: Handle = hProfileCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        lpUserNameCtorArg = MutPtr(0L),
        lpProfilePathCtorArg = MutPtr(0L),
        lpDefaultPathCtorArg = MutPtr(0L),
        lpServerNameCtorArg = MutPtr(0L),
        lpPolicyPathCtorArg = MutPtr(0L),
        hProfileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pstr = this.lpUserName

    public operator fun component4(): Pstr = this.lpProfilePath

    public operator fun component5(): Pstr = this.lpDefaultPath

    public operator fun component6(): Pstr = this.lpServerName

    public operator fun component7(): Pstr = this.lpPolicyPath

    public operator fun component8(): Handle = this.hProfile

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, lpUserName: Pstr = this.lpUserName, lpProfilePath: Pstr = this.lpProfilePath, lpDefaultPath: Pstr = this.lpDefaultPath, lpServerName: Pstr = this.lpServerName, lpPolicyPath: Pstr = this.lpPolicyPath, hProfile: Handle = this.hProfile): Profileinfoa = Profileinfoa(dwSize = dwSize, dwFlags = dwFlags, lpUserNameCtorArg = lpUserName, lpProfilePathCtorArg = lpProfilePath, lpDefaultPathCtorArg = lpDefaultPath, lpServerNameCtorArg = lpServerName, lpPolicyPathCtorArg = lpPolicyPath, hProfileCtorArg = hProfile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Profileinfoa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpUserName != other.lpUserName) return false
        if (this.lpProfilePath != other.lpProfilePath) return false
        if (this.lpDefaultPath != other.lpDefaultPath) return false
        if (this.lpServerName != other.lpServerName) return false
        if (this.lpPolicyPath != other.lpPolicyPath) return false
        if (this.hProfile != other.hProfile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpUserName.hashCode()
        result = 31 * result + this.lpProfilePath.hashCode()
        result = 31 * result + this.lpDefaultPath.hashCode()
        result = 31 * result + this.lpServerName.hashCode()
        result = 31 * result + this.lpPolicyPath.hashCode()
        result = 31 * result + this.hProfile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            lpUserName: Pstr = MutPtr(0L),
            lpProfilePath: Pstr = MutPtr(0L),
            lpDefaultPath: Pstr = MutPtr(0L),
            lpServerName: Pstr = MutPtr(0L),
            lpPolicyPath: Pstr = MutPtr(0L),
            hProfile: Handle = MutPtr(0L),
        ): Profileinfoa =
            Profileinfoa(
                dwSize = dwSize,
                dwFlags = dwFlags,
                lpUserNameCtorArg = lpUserName,
                lpProfilePathCtorArg = lpProfilePath,
                lpDefaultPathCtorArg = lpDefaultPath,
                lpServerNameCtorArg = lpServerName,
                lpPolicyPathCtorArg = lpPolicyPath,
                hProfileCtorArg = hProfile,
            )
    }
}

public class Profileinfow internal constructor(
    public var dwSize: UInt,
    public var dwFlags: UInt,
    lpUserNameCtorArg: Pwstr,
    lpProfilePathCtorArg: Pwstr,
    lpDefaultPathCtorArg: Pwstr,
    lpServerNameCtorArg: Pwstr,
    lpPolicyPathCtorArg: Pwstr,
    hProfileCtorArg: Handle,
) {
    public var lpUserName: Pwstr = lpUserNameCtorArg
        internal set

    public var lpProfilePath: Pwstr = lpProfilePathCtorArg
        internal set

    public var lpDefaultPath: Pwstr = lpDefaultPathCtorArg
        internal set

    public var lpServerName: Pwstr = lpServerNameCtorArg
        internal set

    public var lpPolicyPath: Pwstr = lpPolicyPathCtorArg
        internal set

    public var hProfile: Handle = hProfileCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwFlags = 0u,
        lpUserNameCtorArg = MutPtr(0L),
        lpProfilePathCtorArg = MutPtr(0L),
        lpDefaultPathCtorArg = MutPtr(0L),
        lpServerNameCtorArg = MutPtr(0L),
        lpPolicyPathCtorArg = MutPtr(0L),
        hProfileCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Pwstr = this.lpUserName

    public operator fun component4(): Pwstr = this.lpProfilePath

    public operator fun component5(): Pwstr = this.lpDefaultPath

    public operator fun component6(): Pwstr = this.lpServerName

    public operator fun component7(): Pwstr = this.lpPolicyPath

    public operator fun component8(): Handle = this.hProfile

    public fun copy(dwSize: UInt = this.dwSize, dwFlags: UInt = this.dwFlags, lpUserName: Pwstr = this.lpUserName, lpProfilePath: Pwstr = this.lpProfilePath, lpDefaultPath: Pwstr = this.lpDefaultPath, lpServerName: Pwstr = this.lpServerName, lpPolicyPath: Pwstr = this.lpPolicyPath, hProfile: Handle = this.hProfile): Profileinfow = Profileinfow(dwSize = dwSize, dwFlags = dwFlags, lpUserNameCtorArg = lpUserName, lpProfilePathCtorArg = lpProfilePath, lpDefaultPathCtorArg = lpDefaultPath, lpServerNameCtorArg = lpServerName, lpPolicyPathCtorArg = lpPolicyPath, hProfileCtorArg = hProfile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Profileinfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpUserName != other.lpUserName) return false
        if (this.lpProfilePath != other.lpProfilePath) return false
        if (this.lpDefaultPath != other.lpDefaultPath) return false
        if (this.lpServerName != other.lpServerName) return false
        if (this.lpPolicyPath != other.lpPolicyPath) return false
        if (this.hProfile != other.hProfile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpUserName.hashCode()
        result = 31 * result + this.lpProfilePath.hashCode()
        result = 31 * result + this.lpDefaultPath.hashCode()
        result = 31 * result + this.lpServerName.hashCode()
        result = 31 * result + this.lpPolicyPath.hashCode()
        result = 31 * result + this.hProfile.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwFlags: UInt = 0u,
            lpUserName: Pwstr = MutPtr(0L),
            lpProfilePath: Pwstr = MutPtr(0L),
            lpDefaultPath: Pwstr = MutPtr(0L),
            lpServerName: Pwstr = MutPtr(0L),
            lpPolicyPath: Pwstr = MutPtr(0L),
            hProfile: Handle = MutPtr(0L),
        ): Profileinfow =
            Profileinfow(
                dwSize = dwSize,
                dwFlags = dwFlags,
                lpUserNameCtorArg = lpUserName,
                lpProfilePathCtorArg = lpProfilePath,
                lpDefaultPathCtorArg = lpDefaultPath,
                lpServerNameCtorArg = lpServerName,
                lpPolicyPathCtorArg = lpPolicyPath,
                hProfileCtorArg = hProfile,
            )
    }
}

public class Pubappinfo internal constructor(
    public var cbSize: UInt,
    public var dwMask: UInt,
    pszSourceCtorArg: Pwstr,
    public var stAssigned: Systemtime,
    public var stPublished: Systemtime,
    public var stScheduled: Systemtime,
    public var stExpire: Systemtime,
) {
    public var pszSource: Pwstr = pszSourceCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwMask = 0u,
        pszSourceCtorArg = MutPtr(0L),
        stAssigned = Systemtime(),
        stPublished = Systemtime(),
        stScheduled = Systemtime(),
        stExpire = Systemtime(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwMask

    public operator fun component3(): Pwstr = this.pszSource

    public operator fun component4(): Systemtime = this.stAssigned

    public operator fun component5(): Systemtime = this.stPublished

    public operator fun component6(): Systemtime = this.stScheduled

    public operator fun component7(): Systemtime = this.stExpire

    public fun copy(cbSize: UInt = this.cbSize, dwMask: UInt = this.dwMask, pszSource: Pwstr = this.pszSource, stAssigned: Systemtime = this.stAssigned, stPublished: Systemtime = this.stPublished, stScheduled: Systemtime = this.stScheduled, stExpire: Systemtime = this.stExpire): Pubappinfo = Pubappinfo(cbSize = cbSize, dwMask = dwMask, pszSourceCtorArg = pszSource, stAssigned = stAssigned, stPublished = stPublished, stScheduled = stScheduled, stExpire = stExpire)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pubappinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.pszSource != other.pszSource) return false
        if (this.stAssigned != other.stAssigned) return false
        if (this.stPublished != other.stPublished) return false
        if (this.stScheduled != other.stScheduled) return false
        if (this.stExpire != other.stExpire) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.pszSource.hashCode()
        result = 31 * result + this.stAssigned.hashCode()
        result = 31 * result + this.stPublished.hashCode()
        result = 31 * result + this.stScheduled.hashCode()
        result = 31 * result + this.stExpire.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwMask: UInt = 0u,
            pszSource: Pwstr = MutPtr(0L),
            stAssigned: Systemtime = Systemtime(),
            stPublished: Systemtime = Systemtime(),
            stScheduled: Systemtime = Systemtime(),
            stExpire: Systemtime = Systemtime(),
        ): Pubappinfo =
            Pubappinfo(
                cbSize = cbSize,
                dwMask = dwMask,
                pszSourceCtorArg = pszSource,
                stAssigned = stAssigned,
                stPublished = stPublished,
                stScheduled = stScheduled,
                stExpire = stExpire,
            )
    }
}

public class Qcminfo internal constructor(
    hmenuCtorArg: Hmenu,
    public var indexMenu: UInt,
    public var idCmdFirst: UInt,
    public var idCmdLast: UInt,
    pIdMapCtorArg: ConstPtr,
) {
    public var hmenu: Hmenu = hmenuCtorArg
        internal set

    public var pIdMap: ConstPtr = pIdMapCtorArg
        internal set

    public constructor() : this(
        hmenuCtorArg = MutPtr(0L),
        indexMenu = 0u,
        idCmdFirst = 0u,
        idCmdLast = 0u,
        pIdMapCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hmenu = this.hmenu

    public operator fun component2(): UInt = this.indexMenu

    public operator fun component3(): UInt = this.idCmdFirst

    public operator fun component4(): UInt = this.idCmdLast

    public operator fun component5(): ConstPtr = this.pIdMap

    public fun copy(hmenu: Hmenu = this.hmenu, indexMenu: UInt = this.indexMenu, idCmdFirst: UInt = this.idCmdFirst, idCmdLast: UInt = this.idCmdLast, pIdMap: ConstPtr = this.pIdMap): Qcminfo = Qcminfo(hmenuCtorArg = hmenu, indexMenu = indexMenu, idCmdFirst = idCmdFirst, idCmdLast = idCmdLast, pIdMapCtorArg = pIdMap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Qcminfo) return false
        if (this.hmenu != other.hmenu) return false
        if (this.indexMenu != other.indexMenu) return false
        if (this.idCmdFirst != other.idCmdFirst) return false
        if (this.idCmdLast != other.idCmdLast) return false
        if (this.pIdMap != other.pIdMap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hmenu.hashCode()
        result = 31 * result + this.indexMenu.hashCode()
        result = 31 * result + this.idCmdFirst.hashCode()
        result = 31 * result + this.idCmdLast.hashCode()
        result = 31 * result + this.pIdMap.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hmenu: Hmenu = MutPtr(0L),
            indexMenu: UInt = 0u,
            idCmdFirst: UInt = 0u,
            idCmdLast: UInt = 0u,
            pIdMap: ConstPtr = ConstPtr(0L),
        ): Qcminfo =
            Qcminfo(
                hmenuCtorArg = hmenu,
                indexMenu = indexMenu,
                idCmdFirst = idCmdFirst,
                idCmdLast = idCmdLast,
                pIdMapCtorArg = pIdMap,
            )
    }
}

public data class QcminfoIdmap(
    public var nMaxIds: UInt = 0u,
    public var pIdList: List<QcminfoIdmapPlacement> = List(1) { QcminfoIdmapPlacement() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QcminfoIdmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QcminfoIdmap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): QcminfoIdmap =
                    QcminfoIdmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(QcminfoIdmapPlacement.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: QcminfoIdmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nMaxIds)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(QcminfoIdmapPlacement.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.pIdList)
                }
            }
    }
}

public data class QcminfoIdmapPlacement(
    public var id: UInt = 0u,
    public var fFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QcminfoIdmapPlacement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QcminfoIdmapPlacement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): QcminfoIdmapPlacement =
                    QcminfoIdmapPlacement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: QcminfoIdmapPlacement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fFlags)
                }
            }
    }
}

public class Qitab internal constructor(
    piidCtorArg: ConstPtr,
    public var dwOffset: UInt,
) {
    public var piid: ConstPtr = piidCtorArg
        internal set

    public constructor() : this(
        piidCtorArg = ConstPtr(0L),
        dwOffset = 0u,
    )

    public operator fun component1(): ConstPtr = this.piid

    public operator fun component2(): UInt = this.dwOffset

    public fun copy(piid: ConstPtr = this.piid, dwOffset: UInt = this.dwOffset): Qitab = Qitab(piidCtorArg = piid, dwOffset = dwOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Qitab) return false
        if (this.piid != other.piid) return false
        if (this.dwOffset != other.dwOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.piid.hashCode()
        result = 31 * result + this.dwOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Qitab> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Qitab> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Qitab =
                    Qitab(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Qitab) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.piid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOffset)
                }
            }

        public operator fun invoke(
            piid: ConstPtr = ConstPtr(0L),
            dwOffset: UInt = 0u,
        ): Qitab =
            Qitab(
                piidCtorArg = piid,
                dwOffset = dwOffset,
            )
    }
}

public data class SfvmHelptopicData(
    public var wszHelpFile: UShortArray = UShortArray(260),
    public var wszHelpTopic: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SfvmHelptopicData) return false
        if (!this.wszHelpFile.contentEquals(other.wszHelpFile)) return false
        if (!this.wszHelpTopic.contentEquals(other.wszHelpTopic)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszHelpFile.contentHashCode()
        result = 31 * result + this.wszHelpTopic.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SfvmHelptopicData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SfvmHelptopicData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1040L
                override fun readNative(addr: Long): SfvmHelptopicData =
                    SfvmHelptopicData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 520L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SfvmHelptopicData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.wszHelpFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 520L, value.wszHelpTopic.toList())
                }
            }
    }
}

public data class SfvmProppageData(
    public var dwReserved: UInt = 0u,
    public var pfn: Lpfnsvaddpropsheetpage = null,
    public var lParam: Lparam = 0L,
)

public class SfvCreate internal constructor(
    public var cbSize: UInt,
    pshfCtorArg: MutPtr,
    psvOuterCtorArg: MutPtr,
    psfvcbCtorArg: MutPtr,
) {
    public var pshf: MutPtr = pshfCtorArg
        internal set

    public var psvOuter: MutPtr = psvOuterCtorArg
        internal set

    public var psfvcb: MutPtr = psfvcbCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pshfCtorArg = MutPtr(0L),
        psvOuterCtorArg = MutPtr(0L),
        psfvcbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.pshf

    public operator fun component3(): MutPtr = this.psvOuter

    public operator fun component4(): MutPtr = this.psfvcb

    public fun copy(cbSize: UInt = this.cbSize, pshf: MutPtr = this.pshf, psvOuter: MutPtr = this.psvOuter, psfvcb: MutPtr = this.psfvcb): SfvCreate = SfvCreate(cbSize = cbSize, pshfCtorArg = pshf, psvOuterCtorArg = psvOuter, psfvcbCtorArg = psfvcb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SfvCreate) return false
        if (this.cbSize != other.cbSize) return false
        if (this.pshf != other.pshf) return false
        if (this.psvOuter != other.psvOuter) return false
        if (this.psfvcb != other.psfvcb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.pshf.hashCode()
        result = 31 * result + this.psvOuter.hashCode()
        result = 31 * result + this.psfvcb.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SfvCreate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SfvCreate> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SfvCreate =
                    SfvCreate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SfvCreate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pshf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.psvOuter)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.psfvcb)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            pshf: MutPtr = MutPtr(0L),
            psvOuter: MutPtr = MutPtr(0L),
            psfvcb: MutPtr = MutPtr(0L),
        ): SfvCreate =
            SfvCreate(
                cbSize = cbSize,
                pshfCtorArg = pshf,
                psvOuterCtorArg = psvOuter,
                psfvcbCtorArg = psfvcb,
            )
    }
}

public class SfvSetitempos internal constructor(
    pidlCtorArg: MutPtr,
    public var pt: Point,
) {
    public var pidl: MutPtr = pidlCtorArg
        internal set

    public constructor() : this(
        pidlCtorArg = MutPtr(0L),
        pt = Point(),
    )

    public operator fun component1(): MutPtr = this.pidl

    public operator fun component2(): Point = this.pt

    public fun copy(pidl: MutPtr = this.pidl, pt: Point = this.pt): SfvSetitempos = SfvSetitempos(pidlCtorArg = pidl, pt = pt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SfvSetitempos) return false
        if (this.pidl != other.pidl) return false
        if (this.pt != other.pt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pidl.hashCode()
        result = 31 * result + this.pt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pidl: MutPtr = MutPtr(0L),
            pt: Point = Point(),
        ): SfvSetitempos =
            SfvSetitempos(
                pidlCtorArg = pidl,
                pt = pt,
            )
    }
}

public class Shardappidinfo internal constructor(
    psiCtorArg: MutPtr,
    pszAppIDCtorArg: Pcwstr,
) {
    public var psi: MutPtr = psiCtorArg
        internal set

    public var pszAppID: Pcwstr = pszAppIDCtorArg
        internal set

    public constructor() : this(
        psiCtorArg = MutPtr(0L),
        pszAppIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr = this.psi

    public operator fun component2(): Pcwstr = this.pszAppID

    public fun copy(psi: MutPtr = this.psi, pszAppID: Pcwstr = this.pszAppID): Shardappidinfo = Shardappidinfo(psiCtorArg = psi, pszAppIDCtorArg = pszAppID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shardappidinfo) return false
        if (this.psi != other.psi) return false
        if (this.pszAppID != other.pszAppID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psi.hashCode()
        result = 31 * result + this.pszAppID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            psi: MutPtr = MutPtr(0L),
            pszAppID: Pcwstr = ConstPtr(0L),
        ): Shardappidinfo =
            Shardappidinfo(
                psiCtorArg = psi,
                pszAppIDCtorArg = pszAppID,
            )
    }
}

public class Shardappidinfoidlist internal constructor(
    pidlCtorArg: MutPtr,
    pszAppIDCtorArg: Pcwstr,
) {
    public var pidl: MutPtr = pidlCtorArg
        internal set

    public var pszAppID: Pcwstr = pszAppIDCtorArg
        internal set

    public constructor() : this(
        pidlCtorArg = MutPtr(0L),
        pszAppIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pidl

    public operator fun component2(): Pcwstr = this.pszAppID

    public fun copy(pidl: MutPtr = this.pidl, pszAppID: Pcwstr = this.pszAppID): Shardappidinfoidlist = Shardappidinfoidlist(pidlCtorArg = pidl, pszAppIDCtorArg = pszAppID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shardappidinfoidlist) return false
        if (this.pidl != other.pidl) return false
        if (this.pszAppID != other.pszAppID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pidl.hashCode()
        result = 31 * result + this.pszAppID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pidl: MutPtr = MutPtr(0L),
            pszAppID: Pcwstr = ConstPtr(0L),
        ): Shardappidinfoidlist =
            Shardappidinfoidlist(
                pidlCtorArg = pidl,
                pszAppIDCtorArg = pszAppID,
            )
    }
}

public class Shardappidinfolink internal constructor(
    pslCtorArg: MutPtr,
    pszAppIDCtorArg: Pcwstr,
) {
    public var psl: MutPtr = pslCtorArg
        internal set

    public var pszAppID: Pcwstr = pszAppIDCtorArg
        internal set

    public constructor() : this(
        pslCtorArg = MutPtr(0L),
        pszAppIDCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr = this.psl

    public operator fun component2(): Pcwstr = this.pszAppID

    public fun copy(psl: MutPtr = this.psl, pszAppID: Pcwstr = this.pszAppID): Shardappidinfolink = Shardappidinfolink(pslCtorArg = psl, pszAppIDCtorArg = pszAppID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shardappidinfolink) return false
        if (this.psl != other.psl) return false
        if (this.pszAppID != other.pszAppID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psl.hashCode()
        result = 31 * result + this.pszAppID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            psl: MutPtr = MutPtr(0L),
            pszAppID: Pcwstr = ConstPtr(0L),
        ): Shardappidinfolink =
            Shardappidinfolink(
                pslCtorArg = psl,
                pszAppIDCtorArg = pszAppID,
            )
    }
}

public class Shcolumndata internal constructor(
    public var dwFlags: UInt,
    public var dwFileAttributes: UInt,
    public var dwReserved: UInt,
    pwszExtCtorArg: Pwstr,
    public var wszFile: UShortArray,
) {
    public var pwszExt: Pwstr = pwszExtCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        dwFileAttributes = 0u,
        dwReserved = 0u,
        pwszExtCtorArg = MutPtr(0L),
        wszFile = UShortArray(260),
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): UInt = this.dwFileAttributes

    public operator fun component3(): UInt = this.dwReserved

    public operator fun component4(): Pwstr = this.pwszExt

    public operator fun component5(): UShortArray = this.wszFile

    public fun copy(dwFlags: UInt = this.dwFlags, dwFileAttributes: UInt = this.dwFileAttributes, dwReserved: UInt = this.dwReserved, pwszExt: Pwstr = this.pwszExt, wszFile: UShortArray = this.wszFile): Shcolumndata = Shcolumndata(dwFlags = dwFlags, dwFileAttributes = dwFileAttributes, dwReserved = dwReserved, pwszExtCtorArg = pwszExt, wszFile = wszFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shcolumndata) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwFileAttributes != other.dwFileAttributes) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwszExt != other.pwszExt) return false
        if (!this.wszFile.contentEquals(other.wszFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.dwFileAttributes.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwszExt.hashCode()
        result = 31 * result + this.wszFile.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            dwFileAttributes: UInt = 0u,
            dwReserved: UInt = 0u,
            pwszExt: Pwstr = MutPtr(0L),
            wszFile: UShortArray = UShortArray(260),
        ): Shcolumndata =
            Shcolumndata(
                dwFlags = dwFlags,
                dwFileAttributes = dwFileAttributes,
                dwReserved = dwReserved,
                pwszExtCtorArg = pwszExt,
                wszFile = wszFile,
            )
    }
}

public data class Shcolumninfo(
    public var scid: Propertykey = Propertykey(),
    public var vt: Variant.Varenum = 0u,
    public var fmt: UInt = 0u,
    public var cChars: UInt = 0u,
    public var csFlags: UInt = 0u,
    public var wszTitle: UShortArray = UShortArray(80),
    public var wszDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shcolumninfo) return false
        if (this.scid != other.scid) return false
        if (this.vt != other.vt) return false
        if (this.fmt != other.fmt) return false
        if (this.cChars != other.cChars) return false
        if (this.csFlags != other.csFlags) return false
        if (!this.wszTitle.contentEquals(other.wszTitle)) return false
        if (!this.wszDescription.contentEquals(other.wszDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scid.hashCode()
        result = 31 * result + this.vt.hashCode()
        result = 31 * result + this.fmt.hashCode()
        result = 31 * result + this.cChars.hashCode()
        result = 31 * result + this.csFlags.hashCode()
        result = 31 * result + this.wszTitle.contentHashCode()
        result = 31 * result + this.wszDescription.contentHashCode()
        return result
    }
}

public data class Shcolumninit(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var wszFolder: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shcolumninit) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReserved != other.dwReserved) return false
        if (!this.wszFolder.contentEquals(other.wszFolder)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.wszFolder.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shcolumninit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shcolumninit> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): Shcolumninit =
                    Shcolumninit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Shcolumninit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 8L, value.wszFolder.toList())
                }
            }
    }
}

public class Shcreateprocessinfow internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    hwndCtorArg: Hwnd,
    pszFileCtorArg: Pcwstr,
    pszParametersCtorArg: Pcwstr,
    pszCurrentDirectoryCtorArg: Pcwstr,
    hUserTokenCtorArg: Handle,
    lpProcessAttributesCtorArg: MutPtr,
    lpThreadAttributesCtorArg: MutPtr,
    public var bInheritHandles: Bool,
    public var dwCreationFlags: UInt,
    lpStartupInfoCtorArg: MutPtr,
    lpProcessInformationCtorArg: MutPtr,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var pszFile: Pcwstr = pszFileCtorArg
        internal set

    public var pszParameters: Pcwstr = pszParametersCtorArg
        internal set

    public var pszCurrentDirectory: Pcwstr = pszCurrentDirectoryCtorArg
        internal set

    public var hUserToken: Handle = hUserTokenCtorArg
        internal set

    public var lpProcessAttributes: MutPtr = lpProcessAttributesCtorArg
        internal set

    public var lpThreadAttributes: MutPtr = lpThreadAttributesCtorArg
        internal set

    public var lpStartupInfo: MutPtr = lpStartupInfoCtorArg
        internal set

    public var lpProcessInformation: MutPtr = lpProcessInformationCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        hwndCtorArg = MutPtr(0L),
        pszFileCtorArg = ConstPtr(0L),
        pszParametersCtorArg = ConstPtr(0L),
        pszCurrentDirectoryCtorArg = ConstPtr(0L),
        hUserTokenCtorArg = MutPtr(0L),
        lpProcessAttributesCtorArg = MutPtr(0L),
        lpThreadAttributesCtorArg = MutPtr(0L),
        bInheritHandles = 0,
        dwCreationFlags = 0u,
        lpStartupInfoCtorArg = MutPtr(0L),
        lpProcessInformationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Pcwstr = this.pszFile

    public operator fun component5(): Pcwstr = this.pszParameters

    public operator fun component6(): Pcwstr = this.pszCurrentDirectory

    public operator fun component7(): Handle = this.hUserToken

    public operator fun component8(): MutPtr = this.lpProcessAttributes

    public operator fun component9(): MutPtr = this.lpThreadAttributes

    public operator fun component10(): Bool = this.bInheritHandles

    public operator fun component11(): UInt = this.dwCreationFlags

    public operator fun component12(): MutPtr = this.lpStartupInfo

    public operator fun component13(): MutPtr = this.lpProcessInformation

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, hwnd: Hwnd = this.hwnd, pszFile: Pcwstr = this.pszFile, pszParameters: Pcwstr = this.pszParameters, pszCurrentDirectory: Pcwstr = this.pszCurrentDirectory, hUserToken: Handle = this.hUserToken, lpProcessAttributes: MutPtr = this.lpProcessAttributes, lpThreadAttributes: MutPtr = this.lpThreadAttributes, bInheritHandles: Bool = this.bInheritHandles, dwCreationFlags: UInt = this.dwCreationFlags, lpStartupInfo: MutPtr = this.lpStartupInfo, lpProcessInformation: MutPtr = this.lpProcessInformation): Shcreateprocessinfow = Shcreateprocessinfow(cbSize = cbSize, fMask = fMask, hwndCtorArg = hwnd, pszFileCtorArg = pszFile, pszParametersCtorArg = pszParameters, pszCurrentDirectoryCtorArg = pszCurrentDirectory, hUserTokenCtorArg = hUserToken, lpProcessAttributesCtorArg = lpProcessAttributes, lpThreadAttributesCtorArg = lpThreadAttributes, bInheritHandles = bInheritHandles, dwCreationFlags = dwCreationFlags, lpStartupInfoCtorArg = lpStartupInfo, lpProcessInformationCtorArg = lpProcessInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shcreateprocessinfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.hwnd != other.hwnd) return false
        if (this.pszFile != other.pszFile) return false
        if (this.pszParameters != other.pszParameters) return false
        if (this.pszCurrentDirectory != other.pszCurrentDirectory) return false
        if (this.hUserToken != other.hUserToken) return false
        if (this.lpProcessAttributes != other.lpProcessAttributes) return false
        if (this.lpThreadAttributes != other.lpThreadAttributes) return false
        if (this.bInheritHandles != other.bInheritHandles) return false
        if (this.dwCreationFlags != other.dwCreationFlags) return false
        if (this.lpStartupInfo != other.lpStartupInfo) return false
        if (this.lpProcessInformation != other.lpProcessInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.pszFile.hashCode()
        result = 31 * result + this.pszParameters.hashCode()
        result = 31 * result + this.pszCurrentDirectory.hashCode()
        result = 31 * result + this.hUserToken.hashCode()
        result = 31 * result + this.lpProcessAttributes.hashCode()
        result = 31 * result + this.lpThreadAttributes.hashCode()
        result = 31 * result + this.bInheritHandles.hashCode()
        result = 31 * result + this.dwCreationFlags.hashCode()
        result = 31 * result + this.lpStartupInfo.hashCode()
        result = 31 * result + this.lpProcessInformation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            pszFile: Pcwstr = ConstPtr(0L),
            pszParameters: Pcwstr = ConstPtr(0L),
            pszCurrentDirectory: Pcwstr = ConstPtr(0L),
            hUserToken: Handle = MutPtr(0L),
            lpProcessAttributes: MutPtr = MutPtr(0L),
            lpThreadAttributes: MutPtr = MutPtr(0L),
            bInheritHandles: Bool = 0,
            dwCreationFlags: UInt = 0u,
            lpStartupInfo: MutPtr = MutPtr(0L),
            lpProcessInformation: MutPtr = MutPtr(0L),
        ): Shcreateprocessinfow =
            Shcreateprocessinfow(
                cbSize = cbSize,
                fMask = fMask,
                hwndCtorArg = hwnd,
                pszFileCtorArg = pszFile,
                pszParametersCtorArg = pszParameters,
                pszCurrentDirectoryCtorArg = pszCurrentDirectory,
                hUserTokenCtorArg = hUserToken,
                lpProcessAttributesCtorArg = lpProcessAttributes,
                lpThreadAttributesCtorArg = lpThreadAttributes,
                bInheritHandles = bInheritHandles,
                dwCreationFlags = dwCreationFlags,
                lpStartupInfoCtorArg = lpStartupInfo,
                lpProcessInformationCtorArg = lpProcessInformation,
            )
    }
}

public data class SHChangeDWORDAsIDList(
    public var cb: UShort = 0u,
    public var dwItem1: UInt = 0u,
    public var dwItem2: UInt = 0u,
    public var cbZero: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeDWORDAsIDList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeDWORDAsIDList> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SHChangeDWORDAsIDList =
                    SHChangeDWORDAsIDList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: SHChangeDWORDAsIDList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.dwItem1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.dwItem2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.cbZero)
                }
            }
    }
}

public class SHChangeNotifyEntry internal constructor(
    pidlCtorArg: MutPtr,
    public var fRecursive: Bool,
) {
    public var pidl: MutPtr = pidlCtorArg
        internal set

    public constructor() : this(
        pidlCtorArg = MutPtr(0L),
        fRecursive = 0,
    )

    public operator fun component1(): MutPtr = this.pidl

    public operator fun component2(): Bool = this.fRecursive

    public fun copy(pidl: MutPtr = this.pidl, fRecursive: Bool = this.fRecursive): SHChangeNotifyEntry = SHChangeNotifyEntry(pidlCtorArg = pidl, fRecursive = fRecursive)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHChangeNotifyEntry) return false
        if (this.pidl != other.pidl) return false
        if (this.fRecursive != other.fRecursive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pidl.hashCode()
        result = 31 * result + this.fRecursive.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeNotifyEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeNotifyEntry> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SHChangeNotifyEntry =
                    SHChangeNotifyEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SHChangeNotifyEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pidl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fRecursive)
                }
            }

        public operator fun invoke(
            pidl: MutPtr = MutPtr(0L),
            fRecursive: Bool = 0,
        ): SHChangeNotifyEntry =
            SHChangeNotifyEntry(
                pidlCtorArg = pidl,
                fRecursive = fRecursive,
            )
    }
}

public data class SHChangeProductKeyAsIDList(
    public var cb: UShort = 0u,
    public var wszProductKey: UShortArray = UShortArray(39),
    public var cbZero: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHChangeProductKeyAsIDList) return false
        if (this.cb != other.cb) return false
        if (!this.wszProductKey.contentEquals(other.wszProductKey)) return false
        if (this.cbZero != other.cbZero) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.wszProductKey.contentHashCode()
        result = 31 * result + this.cbZero.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeProductKeyAsIDList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeProductKeyAsIDList> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 82L
                override fun readNative(addr: Long): SHChangeProductKeyAsIDList =
                    SHChangeProductKeyAsIDList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: SHChangeProductKeyAsIDList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (39).toInt())
                    ).writeNative(addr + 2L, value.wszProductKey.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.cbZero)
                }
            }
    }
}

public data class SHChangeUpdateImageIDList(
    public var cb: UShort = 0u,
    public var iIconIndex: Int = 0,
    public var iCurIndex: Int = 0,
    public var uFlags: UInt = 0u,
    public var dwProcessID: UInt = 0u,
    public var szName: UShortArray = UShortArray(260),
    public var cbZero: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHChangeUpdateImageIDList) return false
        if (this.cb != other.cb) return false
        if (this.iIconIndex != other.iIconIndex) return false
        if (this.iCurIndex != other.iCurIndex) return false
        if (this.uFlags != other.uFlags) return false
        if (this.dwProcessID != other.dwProcessID) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.cbZero != other.cbZero) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.iIconIndex.hashCode()
        result = 31 * result + this.iCurIndex.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.dwProcessID.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        result = 31 * result + this.cbZero.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeUpdateImageIDList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SHChangeUpdateImageIDList> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 540L
                override fun readNative(addr: Long): SHChangeUpdateImageIDList =
                    SHChangeUpdateImageIDList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 18L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 538L),
                    )
                override fun writeNative(addr: Long, value: SHChangeUpdateImageIDList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 2L, value.iIconIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 6L, value.iCurIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 10L, value.uFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 14L, value.dwProcessID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 18L, value.szName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 538L, value.cbZero)
                }
            }
    }
}

public data class Shdescriptionid(
    public var dwDescriptionId: UInt = 0u,
    public var clsid: Guid = Guid(),
)

public class Shdragimage internal constructor(
    public var sizeDragImage: Size,
    public var ptOffset: Point,
    hbmpDragImageCtorArg: Hbitmap,
    public var crColorKey: Colorref,
) {
    public var hbmpDragImage: Hbitmap = hbmpDragImageCtorArg
        internal set

    public constructor() : this(
        sizeDragImage = Size(),
        ptOffset = Point(),
        hbmpDragImageCtorArg = MutPtr(0L),
        crColorKey = 0u,
    )

    public operator fun component1(): Size = this.sizeDragImage

    public operator fun component2(): Point = this.ptOffset

    public operator fun component3(): Hbitmap = this.hbmpDragImage

    public operator fun component4(): Colorref = this.crColorKey

    public fun copy(sizeDragImage: Size = this.sizeDragImage, ptOffset: Point = this.ptOffset, hbmpDragImage: Hbitmap = this.hbmpDragImage, crColorKey: Colorref = this.crColorKey): Shdragimage = Shdragimage(sizeDragImage = sizeDragImage, ptOffset = ptOffset, hbmpDragImageCtorArg = hbmpDragImage, crColorKey = crColorKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shdragimage) return false
        if (this.sizeDragImage != other.sizeDragImage) return false
        if (this.ptOffset != other.ptOffset) return false
        if (this.hbmpDragImage != other.hbmpDragImage) return false
        if (this.crColorKey != other.crColorKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeDragImage.hashCode()
        result = 31 * result + this.ptOffset.hashCode()
        result = 31 * result + this.hbmpDragImage.hashCode()
        result = 31 * result + this.crColorKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sizeDragImage: Size = Size(),
            ptOffset: Point = Point(),
            hbmpDragImage: Hbitmap = MutPtr(0L),
            crColorKey: Colorref = 0u,
        ): Shdragimage =
            Shdragimage(
                sizeDragImage = sizeDragImage,
                ptOffset = ptOffset,
                hbmpDragImageCtorArg = hbmpDragImage,
                crColorKey = crColorKey,
            )
    }
}

public class Shellexecuteinfoa internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    hwndCtorArg: Hwnd,
    lpVerbCtorArg: Pcstr,
    lpFileCtorArg: Pcstr,
    lpParametersCtorArg: Pcstr,
    lpDirectoryCtorArg: Pcstr,
    public var nShow: Int,
    hInstAppCtorArg: Hinstance,
    lpIDListCtorArg: MutPtr,
    lpClassCtorArg: Pcstr,
    hkeyClassCtorArg: Hkey,
    public var dwHotKey: UInt,
    public var anonymous: Shellexecuteinfoa0,
    hProcessCtorArg: Handle,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpVerb: Pcstr = lpVerbCtorArg
        internal set

    public var lpFile: Pcstr = lpFileCtorArg
        internal set

    public var lpParameters: Pcstr = lpParametersCtorArg
        internal set

    public var lpDirectory: Pcstr = lpDirectoryCtorArg
        internal set

    public var hInstApp: Hinstance = hInstAppCtorArg
        internal set

    public var lpIDList: MutPtr = lpIDListCtorArg
        internal set

    public var lpClass: Pcstr = lpClassCtorArg
        internal set

    public var hkeyClass: Hkey = hkeyClassCtorArg
        internal set

    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        hwndCtorArg = MutPtr(0L),
        lpVerbCtorArg = ConstPtr(0L),
        lpFileCtorArg = ConstPtr(0L),
        lpParametersCtorArg = ConstPtr(0L),
        lpDirectoryCtorArg = ConstPtr(0L),
        nShow = 0,
        hInstAppCtorArg = MutPtr(0L),
        lpIDListCtorArg = MutPtr(0L),
        lpClassCtorArg = ConstPtr(0L),
        hkeyClassCtorArg = MutPtr(0L),
        dwHotKey = 0u,
        anonymous = Shellexecuteinfoa0(),
        hProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Pcstr = this.lpVerb

    public operator fun component5(): Pcstr = this.lpFile

    public operator fun component6(): Pcstr = this.lpParameters

    public operator fun component7(): Pcstr = this.lpDirectory

    public operator fun component8(): Int = this.nShow

    public operator fun component9(): Hinstance = this.hInstApp

    public operator fun component10(): MutPtr = this.lpIDList

    public operator fun component11(): Pcstr = this.lpClass

    public operator fun component12(): Hkey = this.hkeyClass

    public operator fun component13(): UInt = this.dwHotKey

    public operator fun component14(): Shellexecuteinfoa0 = this.anonymous

    public operator fun component15(): Handle = this.hProcess

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, hwnd: Hwnd = this.hwnd, lpVerb: Pcstr = this.lpVerb, lpFile: Pcstr = this.lpFile, lpParameters: Pcstr = this.lpParameters, lpDirectory: Pcstr = this.lpDirectory, nShow: Int = this.nShow, hInstApp: Hinstance = this.hInstApp, lpIDList: MutPtr = this.lpIDList, lpClass: Pcstr = this.lpClass, hkeyClass: Hkey = this.hkeyClass, dwHotKey: UInt = this.dwHotKey, anonymous: Shellexecuteinfoa0 = this.anonymous, hProcess: Handle = this.hProcess): Shellexecuteinfoa = Shellexecuteinfoa(cbSize = cbSize, fMask = fMask, hwndCtorArg = hwnd, lpVerbCtorArg = lpVerb, lpFileCtorArg = lpFile, lpParametersCtorArg = lpParameters, lpDirectoryCtorArg = lpDirectory, nShow = nShow, hInstAppCtorArg = hInstApp, lpIDListCtorArg = lpIDList, lpClassCtorArg = lpClass, hkeyClassCtorArg = hkeyClass, dwHotKey = dwHotKey, anonymous = anonymous, hProcessCtorArg = hProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shellexecuteinfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.hwnd != other.hwnd) return false
        if (this.lpVerb != other.lpVerb) return false
        if (this.lpFile != other.lpFile) return false
        if (this.lpParameters != other.lpParameters) return false
        if (this.lpDirectory != other.lpDirectory) return false
        if (this.nShow != other.nShow) return false
        if (this.hInstApp != other.hInstApp) return false
        if (this.lpIDList != other.lpIDList) return false
        if (this.lpClass != other.lpClass) return false
        if (this.hkeyClass != other.hkeyClass) return false
        if (this.dwHotKey != other.dwHotKey) return false
        if (this.anonymous != other.anonymous) return false
        if (this.hProcess != other.hProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.lpVerb.hashCode()
        result = 31 * result + this.lpFile.hashCode()
        result = 31 * result + this.lpParameters.hashCode()
        result = 31 * result + this.lpDirectory.hashCode()
        result = 31 * result + this.nShow.hashCode()
        result = 31 * result + this.hInstApp.hashCode()
        result = 31 * result + this.lpIDList.hashCode()
        result = 31 * result + this.lpClass.hashCode()
        result = 31 * result + this.hkeyClass.hashCode()
        result = 31 * result + this.dwHotKey.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            lpVerb: Pcstr = ConstPtr(0L),
            lpFile: Pcstr = ConstPtr(0L),
            lpParameters: Pcstr = ConstPtr(0L),
            lpDirectory: Pcstr = ConstPtr(0L),
            nShow: Int = 0,
            hInstApp: Hinstance = MutPtr(0L),
            lpIDList: MutPtr = MutPtr(0L),
            lpClass: Pcstr = ConstPtr(0L),
            hkeyClass: Hkey = MutPtr(0L),
            dwHotKey: UInt = 0u,
            anonymous: Shellexecuteinfoa0 = Shellexecuteinfoa0(),
            hProcess: Handle = MutPtr(0L),
        ): Shellexecuteinfoa =
            Shellexecuteinfoa(
                cbSize = cbSize,
                fMask = fMask,
                hwndCtorArg = hwnd,
                lpVerbCtorArg = lpVerb,
                lpFileCtorArg = lpFile,
                lpParametersCtorArg = lpParameters,
                lpDirectoryCtorArg = lpDirectory,
                nShow = nShow,
                hInstAppCtorArg = hInstApp,
                lpIDListCtorArg = lpIDList,
                lpClassCtorArg = lpClass,
                hkeyClassCtorArg = hkeyClass,
                dwHotKey = dwHotKey,
                anonymous = anonymous,
                hProcessCtorArg = hProcess,
            )
    }
}

public class Shellexecuteinfoa0 internal constructor(
    hIconCtorArg: Handle,
    hMonitorCtorArg: Handle,
) {
    public var hIcon: Handle = hIconCtorArg
        internal set

    public var hMonitor: Handle = hMonitorCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        hMonitorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hIcon

    public operator fun component2(): Handle = this.hMonitor

    public fun copy(hIcon: Handle = this.hIcon, hMonitor: Handle = this.hMonitor): Shellexecuteinfoa0 = Shellexecuteinfoa0(hIconCtorArg = hIcon, hMonitorCtorArg = hMonitor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shellexecuteinfoa0) return false
        if (this.hIcon != other.hIcon) return false
        if (this.hMonitor != other.hMonitor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.hMonitor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Handle = MutPtr(0L),
            hMonitor: Handle = MutPtr(0L),
        ): Shellexecuteinfoa0 =
            Shellexecuteinfoa0(
                hIconCtorArg = hIcon,
                hMonitorCtorArg = hMonitor,
            )
    }
}

public class Shellexecuteinfow internal constructor(
    public var cbSize: UInt,
    public var fMask: UInt,
    hwndCtorArg: Hwnd,
    lpVerbCtorArg: Pcwstr,
    lpFileCtorArg: Pcwstr,
    lpParametersCtorArg: Pcwstr,
    lpDirectoryCtorArg: Pcwstr,
    public var nShow: Int,
    hInstAppCtorArg: Hinstance,
    lpIDListCtorArg: MutPtr,
    lpClassCtorArg: Pcwstr,
    hkeyClassCtorArg: Hkey,
    public var dwHotKey: UInt,
    public var anonymous: Shellexecuteinfow0,
    hProcessCtorArg: Handle,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var lpVerb: Pcwstr = lpVerbCtorArg
        internal set

    public var lpFile: Pcwstr = lpFileCtorArg
        internal set

    public var lpParameters: Pcwstr = lpParametersCtorArg
        internal set

    public var lpDirectory: Pcwstr = lpDirectoryCtorArg
        internal set

    public var hInstApp: Hinstance = hInstAppCtorArg
        internal set

    public var lpIDList: MutPtr = lpIDListCtorArg
        internal set

    public var lpClass: Pcwstr = lpClassCtorArg
        internal set

    public var hkeyClass: Hkey = hkeyClassCtorArg
        internal set

    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fMask = 0u,
        hwndCtorArg = MutPtr(0L),
        lpVerbCtorArg = ConstPtr(0L),
        lpFileCtorArg = ConstPtr(0L),
        lpParametersCtorArg = ConstPtr(0L),
        lpDirectoryCtorArg = ConstPtr(0L),
        nShow = 0,
        hInstAppCtorArg = MutPtr(0L),
        lpIDListCtorArg = MutPtr(0L),
        lpClassCtorArg = ConstPtr(0L),
        hkeyClassCtorArg = MutPtr(0L),
        dwHotKey = 0u,
        anonymous = Shellexecuteinfow0(),
        hProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.fMask

    public operator fun component3(): Hwnd = this.hwnd

    public operator fun component4(): Pcwstr = this.lpVerb

    public operator fun component5(): Pcwstr = this.lpFile

    public operator fun component6(): Pcwstr = this.lpParameters

    public operator fun component7(): Pcwstr = this.lpDirectory

    public operator fun component8(): Int = this.nShow

    public operator fun component9(): Hinstance = this.hInstApp

    public operator fun component10(): MutPtr = this.lpIDList

    public operator fun component11(): Pcwstr = this.lpClass

    public operator fun component12(): Hkey = this.hkeyClass

    public operator fun component13(): UInt = this.dwHotKey

    public operator fun component14(): Shellexecuteinfow0 = this.anonymous

    public operator fun component15(): Handle = this.hProcess

    public fun copy(cbSize: UInt = this.cbSize, fMask: UInt = this.fMask, hwnd: Hwnd = this.hwnd, lpVerb: Pcwstr = this.lpVerb, lpFile: Pcwstr = this.lpFile, lpParameters: Pcwstr = this.lpParameters, lpDirectory: Pcwstr = this.lpDirectory, nShow: Int = this.nShow, hInstApp: Hinstance = this.hInstApp, lpIDList: MutPtr = this.lpIDList, lpClass: Pcwstr = this.lpClass, hkeyClass: Hkey = this.hkeyClass, dwHotKey: UInt = this.dwHotKey, anonymous: Shellexecuteinfow0 = this.anonymous, hProcess: Handle = this.hProcess): Shellexecuteinfow = Shellexecuteinfow(cbSize = cbSize, fMask = fMask, hwndCtorArg = hwnd, lpVerbCtorArg = lpVerb, lpFileCtorArg = lpFile, lpParametersCtorArg = lpParameters, lpDirectoryCtorArg = lpDirectory, nShow = nShow, hInstAppCtorArg = hInstApp, lpIDListCtorArg = lpIDList, lpClassCtorArg = lpClass, hkeyClassCtorArg = hkeyClass, dwHotKey = dwHotKey, anonymous = anonymous, hProcessCtorArg = hProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shellexecuteinfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.fMask != other.fMask) return false
        if (this.hwnd != other.hwnd) return false
        if (this.lpVerb != other.lpVerb) return false
        if (this.lpFile != other.lpFile) return false
        if (this.lpParameters != other.lpParameters) return false
        if (this.lpDirectory != other.lpDirectory) return false
        if (this.nShow != other.nShow) return false
        if (this.hInstApp != other.hInstApp) return false
        if (this.lpIDList != other.lpIDList) return false
        if (this.lpClass != other.lpClass) return false
        if (this.hkeyClass != other.hkeyClass) return false
        if (this.dwHotKey != other.dwHotKey) return false
        if (this.anonymous != other.anonymous) return false
        if (this.hProcess != other.hProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.fMask.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.lpVerb.hashCode()
        result = 31 * result + this.lpFile.hashCode()
        result = 31 * result + this.lpParameters.hashCode()
        result = 31 * result + this.lpDirectory.hashCode()
        result = 31 * result + this.nShow.hashCode()
        result = 31 * result + this.hInstApp.hashCode()
        result = 31 * result + this.lpIDList.hashCode()
        result = 31 * result + this.lpClass.hashCode()
        result = 31 * result + this.hkeyClass.hashCode()
        result = 31 * result + this.dwHotKey.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fMask: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            lpVerb: Pcwstr = ConstPtr(0L),
            lpFile: Pcwstr = ConstPtr(0L),
            lpParameters: Pcwstr = ConstPtr(0L),
            lpDirectory: Pcwstr = ConstPtr(0L),
            nShow: Int = 0,
            hInstApp: Hinstance = MutPtr(0L),
            lpIDList: MutPtr = MutPtr(0L),
            lpClass: Pcwstr = ConstPtr(0L),
            hkeyClass: Hkey = MutPtr(0L),
            dwHotKey: UInt = 0u,
            anonymous: Shellexecuteinfow0 = Shellexecuteinfow0(),
            hProcess: Handle = MutPtr(0L),
        ): Shellexecuteinfow =
            Shellexecuteinfow(
                cbSize = cbSize,
                fMask = fMask,
                hwndCtorArg = hwnd,
                lpVerbCtorArg = lpVerb,
                lpFileCtorArg = lpFile,
                lpParametersCtorArg = lpParameters,
                lpDirectoryCtorArg = lpDirectory,
                nShow = nShow,
                hInstAppCtorArg = hInstApp,
                lpIDListCtorArg = lpIDList,
                lpClassCtorArg = lpClass,
                hkeyClassCtorArg = hkeyClass,
                dwHotKey = dwHotKey,
                anonymous = anonymous,
                hProcessCtorArg = hProcess,
            )
    }
}

public class Shellexecuteinfow0 internal constructor(
    hIconCtorArg: Handle,
    hMonitorCtorArg: Handle,
) {
    public var hIcon: Handle = hIconCtorArg
        internal set

    public var hMonitor: Handle = hMonitorCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        hMonitorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hIcon

    public operator fun component2(): Handle = this.hMonitor

    public fun copy(hIcon: Handle = this.hIcon, hMonitor: Handle = this.hMonitor): Shellexecuteinfow0 = Shellexecuteinfow0(hIconCtorArg = hIcon, hMonitorCtorArg = hMonitor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shellexecuteinfow0) return false
        if (this.hIcon != other.hIcon) return false
        if (this.hMonitor != other.hMonitor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.hMonitor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Handle = MutPtr(0L),
            hMonitor: Handle = MutPtr(0L),
        ): Shellexecuteinfow0 =
            Shellexecuteinfow0(
                hIconCtorArg = hIcon,
                hMonitorCtorArg = hMonitor,
            )
    }
}

public data class Shellflagstate(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shellflagstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shellflagstate> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Shellflagstate =
                    Shellflagstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Shellflagstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Shellstatea(
    public var bitfield1: Int = 0,
    public var dwWin95Unused: UInt = 0u,
    public var uWin95Unused: UInt = 0u,
    public var lParamSort: Int = 0,
    public var iSortDirection: Int = 0,
    public var version: UInt = 0u,
    public var uNotUsed: UInt = 0u,
    public var bitfield2: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shellstatea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shellstatea> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Shellstatea =
                    Shellstatea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Shellstatea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwWin95Unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uWin95Unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lParamSort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.iSortDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uNotUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.bitfield2)
                }
            }
    }
}

public data class Shellstatew(
    public var bitfield1: Int = 0,
    public var dwWin95Unused: UInt = 0u,
    public var uWin95Unused: UInt = 0u,
    public var lParamSort: Int = 0,
    public var iSortDirection: Int = 0,
    public var version: UInt = 0u,
    public var uNotUsed: UInt = 0u,
    public var bitfield2: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shellstatew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shellstatew> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Shellstatew =
                    Shellstatew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Shellstatew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwWin95Unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uWin95Unused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lParamSort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.iSortDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uNotUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.bitfield2)
                }
            }
    }
}

public data class ShellItemResource(
    public var guidType: Guid = Guid(),
    public var szName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShellItemResource) return false
        if (this.guidType != other.guidType) return false
        if (!this.szName.contentEquals(other.szName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidType.hashCode()
        result = 31 * result + this.szName.contentHashCode()
        return result
    }
}

public class Shfileinfoa internal constructor(
    hIconCtorArg: Hicon,
    public var iIcon: Int,
    public var dwAttributes: UInt,
    public var szDisplayName: ByteArray,
    public var szTypeName: ByteArray,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        iIcon = 0,
        dwAttributes = 0u,
        szDisplayName = ByteArray(260),
        szTypeName = ByteArray(80),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Int = this.iIcon

    public operator fun component3(): UInt = this.dwAttributes

    public operator fun component4(): ByteArray = this.szDisplayName

    public operator fun component5(): ByteArray = this.szTypeName

    public fun copy(hIcon: Hicon = this.hIcon, iIcon: Int = this.iIcon, dwAttributes: UInt = this.dwAttributes, szDisplayName: ByteArray = this.szDisplayName, szTypeName: ByteArray = this.szTypeName): Shfileinfoa = Shfileinfoa(hIconCtorArg = hIcon, iIcon = iIcon, dwAttributes = dwAttributes, szDisplayName = szDisplayName, szTypeName = szTypeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shfileinfoa) return false
        if (this.hIcon != other.hIcon) return false
        if (this.iIcon != other.iIcon) return false
        if (this.dwAttributes != other.dwAttributes) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szTypeName.contentEquals(other.szTypeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.iIcon.hashCode()
        result = 31 * result + this.dwAttributes.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szTypeName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            iIcon: Int = 0,
            dwAttributes: UInt = 0u,
            szDisplayName: ByteArray = ByteArray(260),
            szTypeName: ByteArray = ByteArray(80),
        ): Shfileinfoa =
            Shfileinfoa(
                hIconCtorArg = hIcon,
                iIcon = iIcon,
                dwAttributes = dwAttributes,
                szDisplayName = szDisplayName,
                szTypeName = szTypeName,
            )
    }
}

public class Shfileinfow internal constructor(
    hIconCtorArg: Hicon,
    public var iIcon: Int,
    public var dwAttributes: UInt,
    public var szDisplayName: UShortArray,
    public var szTypeName: UShortArray,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        hIconCtorArg = MutPtr(0L),
        iIcon = 0,
        dwAttributes = 0u,
        szDisplayName = UShortArray(260),
        szTypeName = UShortArray(80),
    )

    public operator fun component1(): Hicon = this.hIcon

    public operator fun component2(): Int = this.iIcon

    public operator fun component3(): UInt = this.dwAttributes

    public operator fun component4(): UShortArray = this.szDisplayName

    public operator fun component5(): UShortArray = this.szTypeName

    public fun copy(hIcon: Hicon = this.hIcon, iIcon: Int = this.iIcon, dwAttributes: UInt = this.dwAttributes, szDisplayName: UShortArray = this.szDisplayName, szTypeName: UShortArray = this.szTypeName): Shfileinfow = Shfileinfow(hIconCtorArg = hIcon, iIcon = iIcon, dwAttributes = dwAttributes, szDisplayName = szDisplayName, szTypeName = szTypeName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shfileinfow) return false
        if (this.hIcon != other.hIcon) return false
        if (this.iIcon != other.iIcon) return false
        if (this.dwAttributes != other.dwAttributes) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szTypeName.contentEquals(other.szTypeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hIcon.hashCode()
        result = 31 * result + this.iIcon.hashCode()
        result = 31 * result + this.dwAttributes.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szTypeName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hIcon: Hicon = MutPtr(0L),
            iIcon: Int = 0,
            dwAttributes: UInt = 0u,
            szDisplayName: UShortArray = UShortArray(260),
            szTypeName: UShortArray = UShortArray(80),
        ): Shfileinfow =
            Shfileinfow(
                hIconCtorArg = hIcon,
                iIcon = iIcon,
                dwAttributes = dwAttributes,
                szDisplayName = szDisplayName,
                szTypeName = szTypeName,
            )
    }
}

public class Shfileopstructa internal constructor(
    hwndCtorArg: Hwnd,
    public var wFunc: UInt,
    pFromCtorArg: MutPtr,
    pToCtorArg: MutPtr,
    public var fFlags: UShort,
    public var fAnyOperationsAborted: Bool,
    hNameMappingsCtorArg: MutPtr,
    lpszProgressTitleCtorArg: Pcstr,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var pFrom: MutPtr = pFromCtorArg
        internal set

    public var pTo: MutPtr = pToCtorArg
        internal set

    public var hNameMappings: MutPtr = hNameMappingsCtorArg
        internal set

    public var lpszProgressTitle: Pcstr = lpszProgressTitleCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        wFunc = 0u,
        pFromCtorArg = MutPtr(0L),
        pToCtorArg = MutPtr(0L),
        fFlags = 0u,
        fAnyOperationsAborted = 0,
        hNameMappingsCtorArg = MutPtr(0L),
        lpszProgressTitleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): UInt = this.wFunc

    public operator fun component3(): MutPtr = this.pFrom

    public operator fun component4(): MutPtr = this.pTo

    public operator fun component5(): UShort = this.fFlags

    public operator fun component6(): Bool = this.fAnyOperationsAborted

    public operator fun component7(): MutPtr = this.hNameMappings

    public operator fun component8(): Pcstr = this.lpszProgressTitle

    public fun copy(hwnd: Hwnd = this.hwnd, wFunc: UInt = this.wFunc, pFrom: MutPtr = this.pFrom, pTo: MutPtr = this.pTo, fFlags: UShort = this.fFlags, fAnyOperationsAborted: Bool = this.fAnyOperationsAborted, hNameMappings: MutPtr = this.hNameMappings, lpszProgressTitle: Pcstr = this.lpszProgressTitle): Shfileopstructa = Shfileopstructa(hwndCtorArg = hwnd, wFunc = wFunc, pFromCtorArg = pFrom, pToCtorArg = pTo, fFlags = fFlags, fAnyOperationsAborted = fAnyOperationsAborted, hNameMappingsCtorArg = hNameMappings, lpszProgressTitleCtorArg = lpszProgressTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shfileopstructa) return false
        if (this.hwnd != other.hwnd) return false
        if (this.wFunc != other.wFunc) return false
        if (this.pFrom != other.pFrom) return false
        if (this.pTo != other.pTo) return false
        if (this.fFlags != other.fFlags) return false
        if (this.fAnyOperationsAborted != other.fAnyOperationsAborted) return false
        if (this.hNameMappings != other.hNameMappings) return false
        if (this.lpszProgressTitle != other.lpszProgressTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.wFunc.hashCode()
        result = 31 * result + this.pFrom.hashCode()
        result = 31 * result + this.pTo.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fAnyOperationsAborted.hashCode()
        result = 31 * result + this.hNameMappings.hashCode()
        result = 31 * result + this.lpszProgressTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            wFunc: UInt = 0u,
            pFrom: MutPtr = MutPtr(0L),
            pTo: MutPtr = MutPtr(0L),
            fFlags: UShort = 0u,
            fAnyOperationsAborted: Bool = 0,
            hNameMappings: MutPtr = MutPtr(0L),
            lpszProgressTitle: Pcstr = ConstPtr(0L),
        ): Shfileopstructa =
            Shfileopstructa(
                hwndCtorArg = hwnd,
                wFunc = wFunc,
                pFromCtorArg = pFrom,
                pToCtorArg = pTo,
                fFlags = fFlags,
                fAnyOperationsAborted = fAnyOperationsAborted,
                hNameMappingsCtorArg = hNameMappings,
                lpszProgressTitleCtorArg = lpszProgressTitle,
            )
    }
}

public class Shfileopstructw internal constructor(
    hwndCtorArg: Hwnd,
    public var wFunc: UInt,
    pFromCtorArg: Pcwstr,
    pToCtorArg: Pcwstr,
    public var fFlags: UShort,
    public var fAnyOperationsAborted: Bool,
    hNameMappingsCtorArg: MutPtr,
    lpszProgressTitleCtorArg: Pcwstr,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var pFrom: Pcwstr = pFromCtorArg
        internal set

    public var pTo: Pcwstr = pToCtorArg
        internal set

    public var hNameMappings: MutPtr = hNameMappingsCtorArg
        internal set

    public var lpszProgressTitle: Pcwstr = lpszProgressTitleCtorArg
        internal set

    public constructor() : this(
        hwndCtorArg = MutPtr(0L),
        wFunc = 0u,
        pFromCtorArg = ConstPtr(0L),
        pToCtorArg = ConstPtr(0L),
        fFlags = 0u,
        fAnyOperationsAborted = 0,
        hNameMappingsCtorArg = MutPtr(0L),
        lpszProgressTitleCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Hwnd = this.hwnd

    public operator fun component2(): UInt = this.wFunc

    public operator fun component3(): Pcwstr = this.pFrom

    public operator fun component4(): Pcwstr = this.pTo

    public operator fun component5(): UShort = this.fFlags

    public operator fun component6(): Bool = this.fAnyOperationsAborted

    public operator fun component7(): MutPtr = this.hNameMappings

    public operator fun component8(): Pcwstr = this.lpszProgressTitle

    public fun copy(hwnd: Hwnd = this.hwnd, wFunc: UInt = this.wFunc, pFrom: Pcwstr = this.pFrom, pTo: Pcwstr = this.pTo, fFlags: UShort = this.fFlags, fAnyOperationsAborted: Bool = this.fAnyOperationsAborted, hNameMappings: MutPtr = this.hNameMappings, lpszProgressTitle: Pcwstr = this.lpszProgressTitle): Shfileopstructw = Shfileopstructw(hwndCtorArg = hwnd, wFunc = wFunc, pFromCtorArg = pFrom, pToCtorArg = pTo, fFlags = fFlags, fAnyOperationsAborted = fAnyOperationsAborted, hNameMappingsCtorArg = hNameMappings, lpszProgressTitleCtorArg = lpszProgressTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shfileopstructw) return false
        if (this.hwnd != other.hwnd) return false
        if (this.wFunc != other.wFunc) return false
        if (this.pFrom != other.pFrom) return false
        if (this.pTo != other.pTo) return false
        if (this.fFlags != other.fFlags) return false
        if (this.fAnyOperationsAborted != other.fAnyOperationsAborted) return false
        if (this.hNameMappings != other.hNameMappings) return false
        if (this.lpszProgressTitle != other.lpszProgressTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hwnd.hashCode()
        result = 31 * result + this.wFunc.hashCode()
        result = 31 * result + this.pFrom.hashCode()
        result = 31 * result + this.pTo.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fAnyOperationsAborted.hashCode()
        result = 31 * result + this.hNameMappings.hashCode()
        result = 31 * result + this.lpszProgressTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hwnd: Hwnd = MutPtr(0L),
            wFunc: UInt = 0u,
            pFrom: Pcwstr = ConstPtr(0L),
            pTo: Pcwstr = ConstPtr(0L),
            fFlags: UShort = 0u,
            fAnyOperationsAborted: Bool = 0,
            hNameMappings: MutPtr = MutPtr(0L),
            lpszProgressTitle: Pcwstr = ConstPtr(0L),
        ): Shfileopstructw =
            Shfileopstructw(
                hwndCtorArg = hwnd,
                wFunc = wFunc,
                pFromCtorArg = pFrom,
                pToCtorArg = pTo,
                fFlags = fFlags,
                fAnyOperationsAborted = fAnyOperationsAborted,
                hNameMappingsCtorArg = hNameMappings,
                lpszProgressTitleCtorArg = lpszProgressTitle,
            )
    }
}

public class Shfoldercustomsettings internal constructor(
    public var dwSize: UInt,
    public var dwMask: UInt,
    pvidCtorArg: MutPtr,
    pszWebViewTemplateCtorArg: Pwstr,
    public var cchWebViewTemplate: UInt,
    pszWebViewTemplateVersionCtorArg: Pwstr,
    pszInfoTipCtorArg: Pwstr,
    public var cchInfoTip: UInt,
    pclsidCtorArg: MutPtr,
    public var dwFlags: UInt,
    pszIconFileCtorArg: Pwstr,
    public var cchIconFile: UInt,
    public var iIconIndex: Int,
    pszLogoCtorArg: Pwstr,
    public var cchLogo: UInt,
) {
    public var pvid: MutPtr = pvidCtorArg
        internal set

    public var pszWebViewTemplate: Pwstr = pszWebViewTemplateCtorArg
        internal set

    public var pszWebViewTemplateVersion: Pwstr = pszWebViewTemplateVersionCtorArg
        internal set

    public var pszInfoTip: Pwstr = pszInfoTipCtorArg
        internal set

    public var pclsid: MutPtr = pclsidCtorArg
        internal set

    public var pszIconFile: Pwstr = pszIconFileCtorArg
        internal set

    public var pszLogo: Pwstr = pszLogoCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwMask = 0u,
        pvidCtorArg = MutPtr(0L),
        pszWebViewTemplateCtorArg = MutPtr(0L),
        cchWebViewTemplate = 0u,
        pszWebViewTemplateVersionCtorArg = MutPtr(0L),
        pszInfoTipCtorArg = MutPtr(0L),
        cchInfoTip = 0u,
        pclsidCtorArg = MutPtr(0L),
        dwFlags = 0u,
        pszIconFileCtorArg = MutPtr(0L),
        cchIconFile = 0u,
        iIconIndex = 0,
        pszLogoCtorArg = MutPtr(0L),
        cchLogo = 0u,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwMask

    public operator fun component3(): MutPtr = this.pvid

    public operator fun component4(): Pwstr = this.pszWebViewTemplate

    public operator fun component5(): UInt = this.cchWebViewTemplate

    public operator fun component6(): Pwstr = this.pszWebViewTemplateVersion

    public operator fun component7(): Pwstr = this.pszInfoTip

    public operator fun component8(): UInt = this.cchInfoTip

    public operator fun component9(): MutPtr = this.pclsid

    public operator fun component10(): UInt = this.dwFlags

    public operator fun component11(): Pwstr = this.pszIconFile

    public operator fun component12(): UInt = this.cchIconFile

    public operator fun component13(): Int = this.iIconIndex

    public operator fun component14(): Pwstr = this.pszLogo

    public operator fun component15(): UInt = this.cchLogo

    public fun copy(dwSize: UInt = this.dwSize, dwMask: UInt = this.dwMask, pvid: MutPtr = this.pvid, pszWebViewTemplate: Pwstr = this.pszWebViewTemplate, cchWebViewTemplate: UInt = this.cchWebViewTemplate, pszWebViewTemplateVersion: Pwstr = this.pszWebViewTemplateVersion, pszInfoTip: Pwstr = this.pszInfoTip, cchInfoTip: UInt = this.cchInfoTip, pclsid: MutPtr = this.pclsid, dwFlags: UInt = this.dwFlags, pszIconFile: Pwstr = this.pszIconFile, cchIconFile: UInt = this.cchIconFile, iIconIndex: Int = this.iIconIndex, pszLogo: Pwstr = this.pszLogo, cchLogo: UInt = this.cchLogo): Shfoldercustomsettings = Shfoldercustomsettings(dwSize = dwSize, dwMask = dwMask, pvidCtorArg = pvid, pszWebViewTemplateCtorArg = pszWebViewTemplate, cchWebViewTemplate = cchWebViewTemplate, pszWebViewTemplateVersionCtorArg = pszWebViewTemplateVersion, pszInfoTipCtorArg = pszInfoTip, cchInfoTip = cchInfoTip, pclsidCtorArg = pclsid, dwFlags = dwFlags, pszIconFileCtorArg = pszIconFile, cchIconFile = cchIconFile, iIconIndex = iIconIndex, pszLogoCtorArg = pszLogo, cchLogo = cchLogo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shfoldercustomsettings) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (this.pvid != other.pvid) return false
        if (this.pszWebViewTemplate != other.pszWebViewTemplate) return false
        if (this.cchWebViewTemplate != other.cchWebViewTemplate) return false
        if (this.pszWebViewTemplateVersion != other.pszWebViewTemplateVersion) return false
        if (this.pszInfoTip != other.pszInfoTip) return false
        if (this.cchInfoTip != other.cchInfoTip) return false
        if (this.pclsid != other.pclsid) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszIconFile != other.pszIconFile) return false
        if (this.cchIconFile != other.cchIconFile) return false
        if (this.iIconIndex != other.iIconIndex) return false
        if (this.pszLogo != other.pszLogo) return false
        if (this.cchLogo != other.cchLogo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.pvid.hashCode()
        result = 31 * result + this.pszWebViewTemplate.hashCode()
        result = 31 * result + this.cchWebViewTemplate.hashCode()
        result = 31 * result + this.pszWebViewTemplateVersion.hashCode()
        result = 31 * result + this.pszInfoTip.hashCode()
        result = 31 * result + this.cchInfoTip.hashCode()
        result = 31 * result + this.pclsid.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszIconFile.hashCode()
        result = 31 * result + this.cchIconFile.hashCode()
        result = 31 * result + this.iIconIndex.hashCode()
        result = 31 * result + this.pszLogo.hashCode()
        result = 31 * result + this.cchLogo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwMask: UInt = 0u,
            pvid: MutPtr = MutPtr(0L),
            pszWebViewTemplate: Pwstr = MutPtr(0L),
            cchWebViewTemplate: UInt = 0u,
            pszWebViewTemplateVersion: Pwstr = MutPtr(0L),
            pszInfoTip: Pwstr = MutPtr(0L),
            cchInfoTip: UInt = 0u,
            pclsid: MutPtr = MutPtr(0L),
            dwFlags: UInt = 0u,
            pszIconFile: Pwstr = MutPtr(0L),
            cchIconFile: UInt = 0u,
            iIconIndex: Int = 0,
            pszLogo: Pwstr = MutPtr(0L),
            cchLogo: UInt = 0u,
        ): Shfoldercustomsettings =
            Shfoldercustomsettings(
                dwSize = dwSize,
                dwMask = dwMask,
                pvidCtorArg = pvid,
                pszWebViewTemplateCtorArg = pszWebViewTemplate,
                cchWebViewTemplate = cchWebViewTemplate,
                pszWebViewTemplateVersionCtorArg = pszWebViewTemplateVersion,
                pszInfoTipCtorArg = pszInfoTip,
                cchInfoTip = cchInfoTip,
                pclsidCtorArg = pclsid,
                dwFlags = dwFlags,
                pszIconFileCtorArg = pszIconFile,
                cchIconFile = cchIconFile,
                iIconIndex = iIconIndex,
                pszLogoCtorArg = pszLogo,
                cchLogo = cchLogo,
            )
    }
}

public class Shnamemappinga internal constructor(
    pszOldPathCtorArg: Pstr,
    pszNewPathCtorArg: Pstr,
    public var cchOldPath: Int,
    public var cchNewPath: Int,
) {
    public var pszOldPath: Pstr = pszOldPathCtorArg
        internal set

    public var pszNewPath: Pstr = pszNewPathCtorArg
        internal set

    public constructor() : this(
        pszOldPathCtorArg = MutPtr(0L),
        pszNewPathCtorArg = MutPtr(0L),
        cchOldPath = 0,
        cchNewPath = 0,
    )

    public operator fun component1(): Pstr = this.pszOldPath

    public operator fun component2(): Pstr = this.pszNewPath

    public operator fun component3(): Int = this.cchOldPath

    public operator fun component4(): Int = this.cchNewPath

    public fun copy(pszOldPath: Pstr = this.pszOldPath, pszNewPath: Pstr = this.pszNewPath, cchOldPath: Int = this.cchOldPath, cchNewPath: Int = this.cchNewPath): Shnamemappinga = Shnamemappinga(pszOldPathCtorArg = pszOldPath, pszNewPathCtorArg = pszNewPath, cchOldPath = cchOldPath, cchNewPath = cchNewPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shnamemappinga) return false
        if (this.pszOldPath != other.pszOldPath) return false
        if (this.pszNewPath != other.pszNewPath) return false
        if (this.cchOldPath != other.cchOldPath) return false
        if (this.cchNewPath != other.cchNewPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszOldPath.hashCode()
        result = 31 * result + this.pszNewPath.hashCode()
        result = 31 * result + this.cchOldPath.hashCode()
        result = 31 * result + this.cchNewPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszOldPath: Pstr = MutPtr(0L),
            pszNewPath: Pstr = MutPtr(0L),
            cchOldPath: Int = 0,
            cchNewPath: Int = 0,
        ): Shnamemappinga =
            Shnamemappinga(
                pszOldPathCtorArg = pszOldPath,
                pszNewPathCtorArg = pszNewPath,
                cchOldPath = cchOldPath,
                cchNewPath = cchNewPath,
            )
    }
}

public class Shnamemappingw internal constructor(
    pszOldPathCtorArg: Pwstr,
    pszNewPathCtorArg: Pwstr,
    public var cchOldPath: Int,
    public var cchNewPath: Int,
) {
    public var pszOldPath: Pwstr = pszOldPathCtorArg
        internal set

    public var pszNewPath: Pwstr = pszNewPathCtorArg
        internal set

    public constructor() : this(
        pszOldPathCtorArg = MutPtr(0L),
        pszNewPathCtorArg = MutPtr(0L),
        cchOldPath = 0,
        cchNewPath = 0,
    )

    public operator fun component1(): Pwstr = this.pszOldPath

    public operator fun component2(): Pwstr = this.pszNewPath

    public operator fun component3(): Int = this.cchOldPath

    public operator fun component4(): Int = this.cchNewPath

    public fun copy(pszOldPath: Pwstr = this.pszOldPath, pszNewPath: Pwstr = this.pszNewPath, cchOldPath: Int = this.cchOldPath, cchNewPath: Int = this.cchNewPath): Shnamemappingw = Shnamemappingw(pszOldPathCtorArg = pszOldPath, pszNewPathCtorArg = pszNewPath, cchOldPath = cchOldPath, cchNewPath = cchNewPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shnamemappingw) return false
        if (this.pszOldPath != other.pszOldPath) return false
        if (this.pszNewPath != other.pszNewPath) return false
        if (this.cchOldPath != other.cchOldPath) return false
        if (this.cchNewPath != other.cchNewPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszOldPath.hashCode()
        result = 31 * result + this.pszNewPath.hashCode()
        result = 31 * result + this.cchOldPath.hashCode()
        result = 31 * result + this.cchNewPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszOldPath: Pwstr = MutPtr(0L),
            pszNewPath: Pwstr = MutPtr(0L),
            cchOldPath: Int = 0,
            cchNewPath: Int = 0,
        ): Shnamemappingw =
            Shnamemappingw(
                pszOldPathCtorArg = pszOldPath,
                pszNewPathCtorArg = pszNewPath,
                cchOldPath = cchOldPath,
                cchNewPath = cchNewPath,
            )
    }
}

public data class Shqueryrbinfo(
    public var cbSize: UInt = 0u,
    public var i64Size: Long = 0L,
    public var i64NumItems: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shqueryrbinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shqueryrbinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Shqueryrbinfo =
                    Shqueryrbinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Shqueryrbinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.i64Size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.i64NumItems)
                }
            }
    }
}

public class Shstockiconinfo internal constructor(
    public var cbSize: UInt,
    hIconCtorArg: Hicon,
    public var iSysImageIndex: Int,
    public var iIcon: Int,
    public var szPath: UShortArray,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hIconCtorArg = MutPtr(0L),
        iSysImageIndex = 0,
        iIcon = 0,
        szPath = UShortArray(260),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hicon = this.hIcon

    public operator fun component3(): Int = this.iSysImageIndex

    public operator fun component4(): Int = this.iIcon

    public operator fun component5(): UShortArray = this.szPath

    public fun copy(cbSize: UInt = this.cbSize, hIcon: Hicon = this.hIcon, iSysImageIndex: Int = this.iSysImageIndex, iIcon: Int = this.iIcon, szPath: UShortArray = this.szPath): Shstockiconinfo = Shstockiconinfo(cbSize = cbSize, hIconCtorArg = hIcon, iSysImageIndex = iSysImageIndex, iIcon = iIcon, szPath = szPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shstockiconinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIcon != other.hIcon) return false
        if (this.iSysImageIndex != other.iSysImageIndex) return false
        if (this.iIcon != other.iIcon) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.iSysImageIndex.hashCode()
        result = 31 * result + this.iIcon.hashCode()
        result = 31 * result + this.szPath.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hIcon: Hicon = MutPtr(0L),
            iSysImageIndex: Int = 0,
            iIcon: Int = 0,
            szPath: UShortArray = UShortArray(260),
        ): Shstockiconinfo =
            Shstockiconinfo(
                cbSize = cbSize,
                hIconCtorArg = hIcon,
                iSysImageIndex = iSysImageIndex,
                iIcon = iIcon,
                szPath = szPath,
            )
    }
}

public class Slowappinfo internal constructor(
    public var ullSize: ULong,
    public var ftLastUsed: Filetime,
    public var iTimesUsed: Int,
    pszImageCtorArg: Pwstr,
) {
    public var pszImage: Pwstr = pszImageCtorArg
        internal set

    public constructor() : this(
        ullSize = 0uL,
        ftLastUsed = Filetime(),
        iTimesUsed = 0,
        pszImageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.ullSize

    public operator fun component2(): Filetime = this.ftLastUsed

    public operator fun component3(): Int = this.iTimesUsed

    public operator fun component4(): Pwstr = this.pszImage

    public fun copy(ullSize: ULong = this.ullSize, ftLastUsed: Filetime = this.ftLastUsed, iTimesUsed: Int = this.iTimesUsed, pszImage: Pwstr = this.pszImage): Slowappinfo = Slowappinfo(ullSize = ullSize, ftLastUsed = ftLastUsed, iTimesUsed = iTimesUsed, pszImageCtorArg = pszImage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Slowappinfo) return false
        if (this.ullSize != other.ullSize) return false
        if (this.ftLastUsed != other.ftLastUsed) return false
        if (this.iTimesUsed != other.iTimesUsed) return false
        if (this.pszImage != other.pszImage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullSize.hashCode()
        result = 31 * result + this.ftLastUsed.hashCode()
        result = 31 * result + this.iTimesUsed.hashCode()
        result = 31 * result + this.pszImage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ullSize: ULong = 0uL,
            ftLastUsed: Filetime = Filetime(),
            iTimesUsed: Int = 0,
            pszImage: Pwstr = MutPtr(0L),
        ): Slowappinfo =
            Slowappinfo(
                ullSize = ullSize,
                ftLastUsed = ftLastUsed,
                iTimesUsed = iTimesUsed,
                pszImageCtorArg = pszImage,
            )
    }
}

public class Smcshchangenotifystruct internal constructor(
    public var lEvent: Int,
    pidl1CtorArg: MutPtr,
    pidl2CtorArg: MutPtr,
) {
    public var pidl1: MutPtr = pidl1CtorArg
        internal set

    public var pidl2: MutPtr = pidl2CtorArg
        internal set

    public constructor() : this(
        lEvent = 0,
        pidl1CtorArg = MutPtr(0L),
        pidl2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.lEvent

    public operator fun component2(): MutPtr = this.pidl1

    public operator fun component3(): MutPtr = this.pidl2

    public fun copy(lEvent: Int = this.lEvent, pidl1: MutPtr = this.pidl1, pidl2: MutPtr = this.pidl2): Smcshchangenotifystruct = Smcshchangenotifystruct(lEvent = lEvent, pidl1CtorArg = pidl1, pidl2CtorArg = pidl2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Smcshchangenotifystruct) return false
        if (this.lEvent != other.lEvent) return false
        if (this.pidl1 != other.pidl1) return false
        if (this.pidl2 != other.pidl2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lEvent.hashCode()
        result = 31 * result + this.pidl1.hashCode()
        result = 31 * result + this.pidl2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Smcshchangenotifystruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Smcshchangenotifystruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Smcshchangenotifystruct =
                    Smcshchangenotifystruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Smcshchangenotifystruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lEvent)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pidl1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pidl2)
                }
            }

        public operator fun invoke(
            lEvent: Int = 0,
            pidl1: MutPtr = MutPtr(0L),
            pidl2: MutPtr = MutPtr(0L),
        ): Smcshchangenotifystruct =
            Smcshchangenotifystruct(
                lEvent = lEvent,
                pidl1CtorArg = pidl1,
                pidl2CtorArg = pidl2,
            )
    }
}

public class Smdata internal constructor(
    public var dwMask: UInt,
    public var dwFlags: UInt,
    hmenuCtorArg: Hmenu,
    hwndCtorArg: Hwnd,
    public var uId: UInt,
    public var uIdParent: UInt,
    public var uIdAncestor: UInt,
    punkCtorArg: MutPtr,
    pidlFolderCtorArg: MutPtr,
    pidlItemCtorArg: MutPtr,
    psfCtorArg: MutPtr,
    pvUserDataCtorArg: MutPtr,
) {
    public var hmenu: Hmenu = hmenuCtorArg
        internal set

    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var punk: MutPtr = punkCtorArg
        internal set

    public var pidlFolder: MutPtr = pidlFolderCtorArg
        internal set

    public var pidlItem: MutPtr = pidlItemCtorArg
        internal set

    public var psf: MutPtr = psfCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        dwMask = 0u,
        dwFlags = 0u,
        hmenuCtorArg = MutPtr(0L),
        hwndCtorArg = MutPtr(0L),
        uId = 0u,
        uIdParent = 0u,
        uIdAncestor = 0u,
        punkCtorArg = MutPtr(0L),
        pidlFolderCtorArg = MutPtr(0L),
        pidlItemCtorArg = MutPtr(0L),
        psfCtorArg = MutPtr(0L),
        pvUserDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwMask

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hmenu = this.hmenu

    public operator fun component4(): Hwnd = this.hwnd

    public operator fun component5(): UInt = this.uId

    public operator fun component6(): UInt = this.uIdParent

    public operator fun component7(): UInt = this.uIdAncestor

    public operator fun component8(): MutPtr = this.punk

    public operator fun component9(): MutPtr = this.pidlFolder

    public operator fun component10(): MutPtr = this.pidlItem

    public operator fun component11(): MutPtr = this.psf

    public operator fun component12(): MutPtr = this.pvUserData

    public fun copy(dwMask: UInt = this.dwMask, dwFlags: UInt = this.dwFlags, hmenu: Hmenu = this.hmenu, hwnd: Hwnd = this.hwnd, uId: UInt = this.uId, uIdParent: UInt = this.uIdParent, uIdAncestor: UInt = this.uIdAncestor, punk: MutPtr = this.punk, pidlFolder: MutPtr = this.pidlFolder, pidlItem: MutPtr = this.pidlItem, psf: MutPtr = this.psf, pvUserData: MutPtr = this.pvUserData): Smdata = Smdata(dwMask = dwMask, dwFlags = dwFlags, hmenuCtorArg = hmenu, hwndCtorArg = hwnd, uId = uId, uIdParent = uIdParent, uIdAncestor = uIdAncestor, punkCtorArg = punk, pidlFolderCtorArg = pidlFolder, pidlItemCtorArg = pidlItem, psfCtorArg = psf, pvUserDataCtorArg = pvUserData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Smdata) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hmenu != other.hmenu) return false
        if (this.hwnd != other.hwnd) return false
        if (this.uId != other.uId) return false
        if (this.uIdParent != other.uIdParent) return false
        if (this.uIdAncestor != other.uIdAncestor) return false
        if (this.punk != other.punk) return false
        if (this.pidlFolder != other.pidlFolder) return false
        if (this.pidlItem != other.pidlItem) return false
        if (this.psf != other.psf) return false
        if (this.pvUserData != other.pvUserData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMask.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hmenu.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.uId.hashCode()
        result = 31 * result + this.uIdParent.hashCode()
        result = 31 * result + this.uIdAncestor.hashCode()
        result = 31 * result + this.punk.hashCode()
        result = 31 * result + this.pidlFolder.hashCode()
        result = 31 * result + this.pidlItem.hashCode()
        result = 31 * result + this.psf.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwMask: UInt = 0u,
            dwFlags: UInt = 0u,
            hmenu: Hmenu = MutPtr(0L),
            hwnd: Hwnd = MutPtr(0L),
            uId: UInt = 0u,
            uIdParent: UInt = 0u,
            uIdAncestor: UInt = 0u,
            punk: MutPtr = MutPtr(0L),
            pidlFolder: MutPtr = MutPtr(0L),
            pidlItem: MutPtr = MutPtr(0L),
            psf: MutPtr = MutPtr(0L),
            pvUserData: MutPtr = MutPtr(0L),
        ): Smdata =
            Smdata(
                dwMask = dwMask,
                dwFlags = dwFlags,
                hmenuCtorArg = hmenu,
                hwndCtorArg = hwnd,
                uId = uId,
                uIdParent = uIdParent,
                uIdAncestor = uIdAncestor,
                punkCtorArg = punk,
                pidlFolderCtorArg = pidlFolder,
                pidlItemCtorArg = pidlItem,
                psfCtorArg = psf,
                pvUserDataCtorArg = pvUserData,
            )
    }
}

public data class Sminfo(
    public var dwMask: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iIcon: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sminfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sminfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sminfo =
                    Sminfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Sminfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.iIcon)
                }
            }
    }
}

public data class Sortcolumn(
    public var propkey: Propertykey = Propertykey(),
    public var direction: Sortdirection = 0,
)

public class Sv2cvw2Params internal constructor(
    public var cbSize: UInt,
    psvPrevCtorArg: MutPtr,
    pfsCtorArg: MutPtr,
    psbOwnerCtorArg: MutPtr,
    prcViewCtorArg: MutPtr,
    pvidCtorArg: ConstPtr,
    hwndViewCtorArg: Hwnd,
) {
    public var psvPrev: MutPtr = psvPrevCtorArg
        internal set

    public var pfs: MutPtr = pfsCtorArg
        internal set

    public var psbOwner: MutPtr = psbOwnerCtorArg
        internal set

    public var prcView: MutPtr = prcViewCtorArg
        internal set

    public var pvid: ConstPtr = pvidCtorArg
        internal set

    public var hwndView: Hwnd = hwndViewCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        psvPrevCtorArg = MutPtr(0L),
        pfsCtorArg = MutPtr(0L),
        psbOwnerCtorArg = MutPtr(0L),
        prcViewCtorArg = MutPtr(0L),
        pvidCtorArg = ConstPtr(0L),
        hwndViewCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.psvPrev

    public operator fun component3(): MutPtr = this.pfs

    public operator fun component4(): MutPtr = this.psbOwner

    public operator fun component5(): MutPtr = this.prcView

    public operator fun component6(): ConstPtr = this.pvid

    public operator fun component7(): Hwnd = this.hwndView

    public fun copy(cbSize: UInt = this.cbSize, psvPrev: MutPtr = this.psvPrev, pfs: MutPtr = this.pfs, psbOwner: MutPtr = this.psbOwner, prcView: MutPtr = this.prcView, pvid: ConstPtr = this.pvid, hwndView: Hwnd = this.hwndView): Sv2cvw2Params = Sv2cvw2Params(cbSize = cbSize, psvPrevCtorArg = psvPrev, pfsCtorArg = pfs, psbOwnerCtorArg = psbOwner, prcViewCtorArg = prcView, pvidCtorArg = pvid, hwndViewCtorArg = hwndView)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sv2cvw2Params) return false
        if (this.cbSize != other.cbSize) return false
        if (this.psvPrev != other.psvPrev) return false
        if (this.pfs != other.pfs) return false
        if (this.psbOwner != other.psbOwner) return false
        if (this.prcView != other.prcView) return false
        if (this.pvid != other.pvid) return false
        if (this.hwndView != other.hwndView) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.psvPrev.hashCode()
        result = 31 * result + this.pfs.hashCode()
        result = 31 * result + this.psbOwner.hashCode()
        result = 31 * result + this.prcView.hashCode()
        result = 31 * result + this.pvid.hashCode()
        result = 31 * result + this.hwndView.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            psvPrev: MutPtr = MutPtr(0L),
            pfs: MutPtr = MutPtr(0L),
            psbOwner: MutPtr = MutPtr(0L),
            prcView: MutPtr = MutPtr(0L),
            pvid: ConstPtr = ConstPtr(0L),
            hwndView: Hwnd = MutPtr(0L),
        ): Sv2cvw2Params =
            Sv2cvw2Params(
                cbSize = cbSize,
                psvPrevCtorArg = psvPrev,
                pfsCtorArg = pfs,
                psbOwnerCtorArg = psbOwner,
                prcViewCtorArg = prcView,
                pvidCtorArg = pvid,
                hwndViewCtorArg = hwndView,
            )
    }
}

public class Syncmgrhandlerinfo internal constructor(
    public var cbSize: UInt,
    hIconCtorArg: Hicon,
    public var syncMgrHandlerFlags: UInt,
    public var wszHandlerName: UShortArray,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hIconCtorArg = MutPtr(0L),
        syncMgrHandlerFlags = 0u,
        wszHandlerName = UShortArray(32),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hicon = this.hIcon

    public operator fun component3(): UInt = this.syncMgrHandlerFlags

    public operator fun component4(): UShortArray = this.wszHandlerName

    public fun copy(cbSize: UInt = this.cbSize, hIcon: Hicon = this.hIcon, syncMgrHandlerFlags: UInt = this.syncMgrHandlerFlags, wszHandlerName: UShortArray = this.wszHandlerName): Syncmgrhandlerinfo = Syncmgrhandlerinfo(cbSize = cbSize, hIconCtorArg = hIcon, syncMgrHandlerFlags = syncMgrHandlerFlags, wszHandlerName = wszHandlerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Syncmgrhandlerinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIcon != other.hIcon) return false
        if (this.syncMgrHandlerFlags != other.syncMgrHandlerFlags) return false
        if (!this.wszHandlerName.contentEquals(other.wszHandlerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.syncMgrHandlerFlags.hashCode()
        result = 31 * result + this.wszHandlerName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hIcon: Hicon = MutPtr(0L),
            syncMgrHandlerFlags: UInt = 0u,
            wszHandlerName: UShortArray = UShortArray(32),
        ): Syncmgrhandlerinfo =
            Syncmgrhandlerinfo(
                cbSize = cbSize,
                hIconCtorArg = hIcon,
                syncMgrHandlerFlags = syncMgrHandlerFlags,
                wszHandlerName = wszHandlerName,
            )
    }
}

public class Syncmgritem internal constructor(
    public var cbSize: UInt,
    public var dwFlags: UInt,
    public var itemID: Guid,
    public var dwItemState: UInt,
    hIconCtorArg: Hicon,
    public var wszItemName: UShortArray,
    public var ftLastUpdate: Filetime,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        itemID = Guid(),
        dwItemState = 0u,
        hIconCtorArg = MutPtr(0L),
        wszItemName = UShortArray(128),
        ftLastUpdate = Filetime(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Guid = this.itemID

    public operator fun component4(): UInt = this.dwItemState

    public operator fun component5(): Hicon = this.hIcon

    public operator fun component6(): UShortArray = this.wszItemName

    public operator fun component7(): Filetime = this.ftLastUpdate

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: UInt = this.dwFlags, itemID: Guid = this.itemID, dwItemState: UInt = this.dwItemState, hIcon: Hicon = this.hIcon, wszItemName: UShortArray = this.wszItemName, ftLastUpdate: Filetime = this.ftLastUpdate): Syncmgritem = Syncmgritem(cbSize = cbSize, dwFlags = dwFlags, itemID = itemID, dwItemState = dwItemState, hIconCtorArg = hIcon, wszItemName = wszItemName, ftLastUpdate = ftLastUpdate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Syncmgritem) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.itemID != other.itemID) return false
        if (this.dwItemState != other.dwItemState) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.wszItemName.contentEquals(other.wszItemName)) return false
        if (this.ftLastUpdate != other.ftLastUpdate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.itemID.hashCode()
        result = 31 * result + this.dwItemState.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.wszItemName.contentHashCode()
        result = 31 * result + this.ftLastUpdate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            itemID: Guid = Guid(),
            dwItemState: UInt = 0u,
            hIcon: Hicon = MutPtr(0L),
            wszItemName: UShortArray = UShortArray(128),
            ftLastUpdate: Filetime = Filetime(),
        ): Syncmgritem =
            Syncmgritem(
                cbSize = cbSize,
                dwFlags = dwFlags,
                itemID = itemID,
                dwItemState = dwItemState,
                hIconCtorArg = hIcon,
                wszItemName = wszItemName,
                ftLastUpdate = ftLastUpdate,
            )
    }
}

public data class Syncmgrlogerrorinfo(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var dwSyncMgrErrorFlags: UInt = 0u,
    public var errorID: Guid = Guid(),
    public var itemID: Guid = Guid(),
)

public class Syncmgrprogressitem internal constructor(
    public var cbSize: UInt,
    public var mask: UInt,
    lpcStatusTextCtorArg: Pcwstr,
    public var dwStatusType: UInt,
    public var iProgValue: Int,
    public var iMaxValue: Int,
) {
    public var lpcStatusText: Pcwstr = lpcStatusTextCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        mask = 0u,
        lpcStatusTextCtorArg = ConstPtr(0L),
        dwStatusType = 0u,
        iProgValue = 0,
        iMaxValue = 0,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): UInt = this.mask

    public operator fun component3(): Pcwstr = this.lpcStatusText

    public operator fun component4(): UInt = this.dwStatusType

    public operator fun component5(): Int = this.iProgValue

    public operator fun component6(): Int = this.iMaxValue

    public fun copy(cbSize: UInt = this.cbSize, mask: UInt = this.mask, lpcStatusText: Pcwstr = this.lpcStatusText, dwStatusType: UInt = this.dwStatusType, iProgValue: Int = this.iProgValue, iMaxValue: Int = this.iMaxValue): Syncmgrprogressitem = Syncmgrprogressitem(cbSize = cbSize, mask = mask, lpcStatusTextCtorArg = lpcStatusText, dwStatusType = dwStatusType, iProgValue = iProgValue, iMaxValue = iMaxValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Syncmgrprogressitem) return false
        if (this.cbSize != other.cbSize) return false
        if (this.mask != other.mask) return false
        if (this.lpcStatusText != other.lpcStatusText) return false
        if (this.dwStatusType != other.dwStatusType) return false
        if (this.iProgValue != other.iProgValue) return false
        if (this.iMaxValue != other.iMaxValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.lpcStatusText.hashCode()
        result = 31 * result + this.dwStatusType.hashCode()
        result = 31 * result + this.iProgValue.hashCode()
        result = 31 * result + this.iMaxValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            mask: UInt = 0u,
            lpcStatusText: Pcwstr = ConstPtr(0L),
            dwStatusType: UInt = 0u,
            iProgValue: Int = 0,
            iMaxValue: Int = 0,
        ): Syncmgrprogressitem =
            Syncmgrprogressitem(
                cbSize = cbSize,
                mask = mask,
                lpcStatusTextCtorArg = lpcStatusText,
                dwStatusType = dwStatusType,
                iProgValue = iProgValue,
                iMaxValue = iMaxValue,
            )
    }
}

public class SyncmgrConflictIdInfo internal constructor(
    pblobIDCtorArg: MutPtr,
    pblobExtraCtorArg: MutPtr,
) {
    public var pblobID: MutPtr = pblobIDCtorArg
        internal set

    public var pblobExtra: MutPtr = pblobExtraCtorArg
        internal set

    public constructor() : this(
        pblobIDCtorArg = MutPtr(0L),
        pblobExtraCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pblobID

    public operator fun component2(): MutPtr = this.pblobExtra

    public fun copy(pblobID: MutPtr = this.pblobID, pblobExtra: MutPtr = this.pblobExtra): SyncmgrConflictIdInfo = SyncmgrConflictIdInfo(pblobIDCtorArg = pblobID, pblobExtraCtorArg = pblobExtra)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SyncmgrConflictIdInfo) return false
        if (this.pblobID != other.pblobID) return false
        if (this.pblobExtra != other.pblobExtra) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pblobID.hashCode()
        result = 31 * result + this.pblobExtra.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyncmgrConflictIdInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyncmgrConflictIdInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SyncmgrConflictIdInfo =
                    SyncmgrConflictIdInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SyncmgrConflictIdInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pblobID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pblobExtra)
                }
            }

        public operator fun invoke(
            pblobID: MutPtr = MutPtr(0L),
            pblobExtra: MutPtr = MutPtr(0L),
        ): SyncmgrConflictIdInfo =
            SyncmgrConflictIdInfo(
                pblobIDCtorArg = pblobID,
                pblobExtraCtorArg = pblobExtra,
            )
    }
}

public data class Tbinfo(
    public var cbuttons: UInt = 0u,
    public var uFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tbinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Tbinfo =
                    Tbinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Tbinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbuttons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uFlags)
                }
            }
    }
}

public class Thumbbutton internal constructor(
    public var dwMask: Thumbbuttonmask,
    public var iId: UInt,
    public var iBitmap: UInt,
    hIconCtorArg: Hicon,
    public var szTip: UShortArray,
    public var dwFlags: Thumbbuttonflags,
) {
    public var hIcon: Hicon = hIconCtorArg
        internal set

    public constructor() : this(
        dwMask = 0,
        iId = 0u,
        iBitmap = 0u,
        hIconCtorArg = MutPtr(0L),
        szTip = UShortArray(260),
        dwFlags = 0,
    )

    public operator fun component1(): Thumbbuttonmask = this.dwMask

    public operator fun component2(): UInt = this.iId

    public operator fun component3(): UInt = this.iBitmap

    public operator fun component4(): Hicon = this.hIcon

    public operator fun component5(): UShortArray = this.szTip

    public operator fun component6(): Thumbbuttonflags = this.dwFlags

    public fun copy(dwMask: Thumbbuttonmask = this.dwMask, iId: UInt = this.iId, iBitmap: UInt = this.iBitmap, hIcon: Hicon = this.hIcon, szTip: UShortArray = this.szTip, dwFlags: Thumbbuttonflags = this.dwFlags): Thumbbutton = Thumbbutton(dwMask = dwMask, iId = iId, iBitmap = iBitmap, hIconCtorArg = hIcon, szTip = szTip, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Thumbbutton) return false
        if (this.dwMask != other.dwMask) return false
        if (this.iId != other.iId) return false
        if (this.iBitmap != other.iBitmap) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.szTip.contentEquals(other.szTip)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMask.hashCode()
        result = 31 * result + this.iId.hashCode()
        result = 31 * result + this.iBitmap.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.szTip.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwMask: Thumbbuttonmask = 0,
            iId: UInt = 0u,
            iBitmap: UInt = 0u,
            hIcon: Hicon = MutPtr(0L),
            szTip: UShortArray = UShortArray(260),
            dwFlags: Thumbbuttonflags = 0,
        ): Thumbbutton =
            Thumbbutton(
                dwMask = dwMask,
                iId = iId,
                iBitmap = iBitmap,
                hIconCtorArg = hIcon,
                szTip = szTip,
                dwFlags = dwFlags,
            )
    }
}

public class Toolbaritem internal constructor(
    ptbarCtorArg: MutPtr,
    public var rcBorderTool: Rect,
    pwszItemCtorArg: Pwstr,
    public var fShow: Bool,
    hMonCtorArg: Hmonitor,
) {
    public var ptbar: MutPtr = ptbarCtorArg
        internal set

    public var pwszItem: Pwstr = pwszItemCtorArg
        internal set

    public var hMon: Hmonitor = hMonCtorArg
        internal set

    public constructor() : this(
        ptbarCtorArg = MutPtr(0L),
        rcBorderTool = Rect(),
        pwszItemCtorArg = MutPtr(0L),
        fShow = 0,
        hMonCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.ptbar

    public operator fun component2(): Rect = this.rcBorderTool

    public operator fun component3(): Pwstr = this.pwszItem

    public operator fun component4(): Bool = this.fShow

    public operator fun component5(): Hmonitor = this.hMon

    public fun copy(ptbar: MutPtr = this.ptbar, rcBorderTool: Rect = this.rcBorderTool, pwszItem: Pwstr = this.pwszItem, fShow: Bool = this.fShow, hMon: Hmonitor = this.hMon): Toolbaritem = Toolbaritem(ptbarCtorArg = ptbar, rcBorderTool = rcBorderTool, pwszItemCtorArg = pwszItem, fShow = fShow, hMonCtorArg = hMon)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Toolbaritem) return false
        if (this.ptbar != other.ptbar) return false
        if (this.rcBorderTool != other.rcBorderTool) return false
        if (this.pwszItem != other.pwszItem) return false
        if (this.fShow != other.fShow) return false
        if (this.hMon != other.hMon) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptbar.hashCode()
        result = 31 * result + this.rcBorderTool.hashCode()
        result = 31 * result + this.pwszItem.hashCode()
        result = 31 * result + this.fShow.hashCode()
        result = 31 * result + this.hMon.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ptbar: MutPtr = MutPtr(0L),
            rcBorderTool: Rect = Rect(),
            pwszItem: Pwstr = MutPtr(0L),
            fShow: Bool = 0,
            hMon: Hmonitor = MutPtr(0L),
        ): Toolbaritem =
            Toolbaritem(
                ptbarCtorArg = ptbar,
                rcBorderTool = rcBorderTool,
                pwszItemCtorArg = pwszItem,
                fShow = fShow,
                hMonCtorArg = hMon,
            )
    }
}

public class Urlinvokecommandinfoa internal constructor(
    public var dwcbSize: UInt,
    public var dwFlags: UInt,
    hwndParentCtorArg: Hwnd,
    pcszVerbCtorArg: Pcstr,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var pcszVerb: Pcstr = pcszVerbCtorArg
        internal set

    public constructor() : this(
        dwcbSize = 0u,
        dwFlags = 0u,
        hwndParentCtorArg = MutPtr(0L),
        pcszVerbCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwcbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Pcstr = this.pcszVerb

    public fun copy(dwcbSize: UInt = this.dwcbSize, dwFlags: UInt = this.dwFlags, hwndParent: Hwnd = this.hwndParent, pcszVerb: Pcstr = this.pcszVerb): Urlinvokecommandinfoa = Urlinvokecommandinfoa(dwcbSize = dwcbSize, dwFlags = dwFlags, hwndParentCtorArg = hwndParent, pcszVerbCtorArg = pcszVerb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Urlinvokecommandinfoa) return false
        if (this.dwcbSize != other.dwcbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.pcszVerb != other.pcszVerb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwcbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.pcszVerb.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwcbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            pcszVerb: Pcstr = ConstPtr(0L),
        ): Urlinvokecommandinfoa =
            Urlinvokecommandinfoa(
                dwcbSize = dwcbSize,
                dwFlags = dwFlags,
                hwndParentCtorArg = hwndParent,
                pcszVerbCtorArg = pcszVerb,
            )
    }
}

public class Urlinvokecommandinfow internal constructor(
    public var dwcbSize: UInt,
    public var dwFlags: UInt,
    hwndParentCtorArg: Hwnd,
    pcszVerbCtorArg: Pcwstr,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var pcszVerb: Pcwstr = pcszVerbCtorArg
        internal set

    public constructor() : this(
        dwcbSize = 0u,
        dwFlags = 0u,
        hwndParentCtorArg = MutPtr(0L),
        pcszVerbCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwcbSize

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Pcwstr = this.pcszVerb

    public fun copy(dwcbSize: UInt = this.dwcbSize, dwFlags: UInt = this.dwFlags, hwndParent: Hwnd = this.hwndParent, pcszVerb: Pcwstr = this.pcszVerb): Urlinvokecommandinfow = Urlinvokecommandinfow(dwcbSize = dwcbSize, dwFlags = dwFlags, hwndParentCtorArg = hwndParent, pcszVerbCtorArg = pcszVerb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Urlinvokecommandinfow) return false
        if (this.dwcbSize != other.dwcbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.pcszVerb != other.pcszVerb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwcbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.pcszVerb.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwcbSize: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            pcszVerb: Pcwstr = ConstPtr(0L),
        ): Urlinvokecommandinfow =
            Urlinvokecommandinfow(
                dwcbSize = dwcbSize,
                dwFlags = dwFlags,
                hwndParentCtorArg = hwndParent,
                pcszVerbCtorArg = pcszVerb,
            )
    }
}

public class Windowdata internal constructor(
    public var dwWindowID: UInt,
    public var uiCP: UInt,
    pidlCtorArg: MutPtr,
    lpszUrlCtorArg: Pwstr,
    lpszUrlLocationCtorArg: Pwstr,
    lpszTitleCtorArg: Pwstr,
) {
    public var pidl: MutPtr = pidlCtorArg
        internal set

    public var lpszUrl: Pwstr = lpszUrlCtorArg
        internal set

    public var lpszUrlLocation: Pwstr = lpszUrlLocationCtorArg
        internal set

    public var lpszTitle: Pwstr = lpszTitleCtorArg
        internal set

    public constructor() : this(
        dwWindowID = 0u,
        uiCP = 0u,
        pidlCtorArg = MutPtr(0L),
        lpszUrlCtorArg = MutPtr(0L),
        lpszUrlLocationCtorArg = MutPtr(0L),
        lpszTitleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwWindowID

    public operator fun component2(): UInt = this.uiCP

    public operator fun component3(): MutPtr = this.pidl

    public operator fun component4(): Pwstr = this.lpszUrl

    public operator fun component5(): Pwstr = this.lpszUrlLocation

    public operator fun component6(): Pwstr = this.lpszTitle

    public fun copy(dwWindowID: UInt = this.dwWindowID, uiCP: UInt = this.uiCP, pidl: MutPtr = this.pidl, lpszUrl: Pwstr = this.lpszUrl, lpszUrlLocation: Pwstr = this.lpszUrlLocation, lpszTitle: Pwstr = this.lpszTitle): Windowdata = Windowdata(dwWindowID = dwWindowID, uiCP = uiCP, pidlCtorArg = pidl, lpszUrlCtorArg = lpszUrl, lpszUrlLocationCtorArg = lpszUrlLocation, lpszTitleCtorArg = lpszTitle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Windowdata) return false
        if (this.dwWindowID != other.dwWindowID) return false
        if (this.uiCP != other.uiCP) return false
        if (this.pidl != other.pidl) return false
        if (this.lpszUrl != other.lpszUrl) return false
        if (this.lpszUrlLocation != other.lpszUrlLocation) return false
        if (this.lpszTitle != other.lpszTitle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwWindowID.hashCode()
        result = 31 * result + this.uiCP.hashCode()
        result = 31 * result + this.pidl.hashCode()
        result = 31 * result + this.lpszUrl.hashCode()
        result = 31 * result + this.lpszUrlLocation.hashCode()
        result = 31 * result + this.lpszTitle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwWindowID: UInt = 0u,
            uiCP: UInt = 0u,
            pidl: MutPtr = MutPtr(0L),
            lpszUrl: Pwstr = MutPtr(0L),
            lpszUrlLocation: Pwstr = MutPtr(0L),
            lpszTitle: Pwstr = MutPtr(0L),
        ): Windowdata =
            Windowdata(
                dwWindowID = dwWindowID,
                uiCP = uiCP,
                pidlCtorArg = pidl,
                lpszUrlCtorArg = lpszUrl,
                lpszUrlLocationCtorArg = lpszUrlLocation,
                lpszTitleCtorArg = lpszTitle,
            )
    }
}

public data class WtsThumbnailid(
    public var rgbKey: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WtsThumbnailid) return false
        if (!this.rgbKey.contentEquals(other.rgbKey)) return false
        return true
    }

    override fun hashCode(): Int = this.rgbKey.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsThumbnailid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WtsThumbnailid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WtsThumbnailid =
                    WtsThumbnailid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: WtsThumbnailid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.rgbKey.toList())
                }
            }
    }
}
