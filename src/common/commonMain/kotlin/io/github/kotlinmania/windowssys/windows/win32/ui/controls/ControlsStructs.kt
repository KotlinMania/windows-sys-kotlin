@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBRUSH
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMONITOR
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPEN
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.POINTER_PEN_INFO
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.POINTER_TOUCH_INFO
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.DLGPROC
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.POINTER_INPUT_TYPE

public data class BP_ANIMATIONPARAMS(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var style: BP_ANIMATIONSTYLE = 0,
    public var dwDuration: UInt = 0u,
)

public data class BP_PAINTPARAMS(
    public var cbSize: UInt = 0u,
    public var dwFlags: BP_PAINTPARAMS_FLAGS = 0u,
    public var prcExclude: Long = 0L,
    public var pBlendFunction: Long = 0L,
)

public data class BUTTON_IMAGELIST(
    public var himl: HIMAGELIST = 0L,
    public var margin: RECT = RECT(),
    public var uAlign: BUTTON_IMAGELIST_ALIGN = 0u,
)

public data class BUTTON_SPLITINFO(
    public var mask: UInt = 0u,
    public var himlGlyph: HIMAGELIST = 0L,
    public var uSplitStyle: UInt = 0u,
    public var size: SIZE = SIZE(),
)

public data class CCINFOA(
    public var szClass: ByteArray = ByteArray(32),
    public var flOptions: UInt = 0u,
    public var szDesc: ByteArray = ByteArray(32),
    public var cxDefault: UInt = 0u,
    public var cyDefault: UInt = 0u,
    public var flStyleDefault: UInt = 0u,
    public var flExtStyleDefault: UInt = 0u,
    public var flCtrlTypeMask: UInt = 0u,
    public var szTextDefault: ByteArray = ByteArray(256),
    public var cStyleFlags: Int = 0,
    public var aStyleFlags: Long = 0L,
    public var lpfnStyle: LPFNCCSTYLEA = null,
    public var lpfnSizeToText: LPFNCCSIZETOTEXTA = null,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CCINFOA) return false
        if (!this.szClass.contentEquals(other.szClass)) return false
        if (this.flOptions != other.flOptions) return false
        if (!this.szDesc.contentEquals(other.szDesc)) return false
        if (this.cxDefault != other.cxDefault) return false
        if (this.cyDefault != other.cyDefault) return false
        if (this.flStyleDefault != other.flStyleDefault) return false
        if (this.flExtStyleDefault != other.flExtStyleDefault) return false
        if (this.flCtrlTypeMask != other.flCtrlTypeMask) return false
        if (!this.szTextDefault.contentEquals(other.szTextDefault)) return false
        if (this.cStyleFlags != other.cStyleFlags) return false
        if (this.aStyleFlags != other.aStyleFlags) return false
        if (this.lpfnStyle != other.lpfnStyle) return false
        if (this.lpfnSizeToText != other.lpfnSizeToText) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szClass.contentHashCode()
        result = 31 * result + this.flOptions.hashCode()
        result = 31 * result + this.szDesc.contentHashCode()
        result = 31 * result + this.cxDefault.hashCode()
        result = 31 * result + this.cyDefault.hashCode()
        result = 31 * result + this.flStyleDefault.hashCode()
        result = 31 * result + this.flExtStyleDefault.hashCode()
        result = 31 * result + this.flCtrlTypeMask.hashCode()
        result = 31 * result + this.szTextDefault.contentHashCode()
        result = 31 * result + this.cStyleFlags.hashCode()
        result = 31 * result + this.aStyleFlags.hashCode()
        result = 31 * result + this.lpfnStyle.hashCode()
        result = 31 * result + this.lpfnSizeToText.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }
}

public data class CCINFOW(
    public var szClass: UShortArray = UShortArray(32),
    public var flOptions: UInt = 0u,
    public var szDesc: UShortArray = UShortArray(32),
    public var cxDefault: UInt = 0u,
    public var cyDefault: UInt = 0u,
    public var flStyleDefault: UInt = 0u,
    public var flExtStyleDefault: UInt = 0u,
    public var flCtrlTypeMask: UInt = 0u,
    public var cStyleFlags: Int = 0,
    public var aStyleFlags: Long = 0L,
    public var szTextDefault: UShortArray = UShortArray(256),
    public var lpfnStyle: LPFNCCSTYLEW = null,
    public var lpfnSizeToText: LPFNCCSIZETOTEXTW = null,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CCINFOW) return false
        if (!this.szClass.contentEquals(other.szClass)) return false
        if (this.flOptions != other.flOptions) return false
        if (!this.szDesc.contentEquals(other.szDesc)) return false
        if (this.cxDefault != other.cxDefault) return false
        if (this.cyDefault != other.cyDefault) return false
        if (this.flStyleDefault != other.flStyleDefault) return false
        if (this.flExtStyleDefault != other.flExtStyleDefault) return false
        if (this.flCtrlTypeMask != other.flCtrlTypeMask) return false
        if (this.cStyleFlags != other.cStyleFlags) return false
        if (this.aStyleFlags != other.aStyleFlags) return false
        if (!this.szTextDefault.contentEquals(other.szTextDefault)) return false
        if (this.lpfnStyle != other.lpfnStyle) return false
        if (this.lpfnSizeToText != other.lpfnSizeToText) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szClass.contentHashCode()
        result = 31 * result + this.flOptions.hashCode()
        result = 31 * result + this.szDesc.contentHashCode()
        result = 31 * result + this.cxDefault.hashCode()
        result = 31 * result + this.cyDefault.hashCode()
        result = 31 * result + this.flStyleDefault.hashCode()
        result = 31 * result + this.flExtStyleDefault.hashCode()
        result = 31 * result + this.flCtrlTypeMask.hashCode()
        result = 31 * result + this.cStyleFlags.hashCode()
        result = 31 * result + this.aStyleFlags.hashCode()
        result = 31 * result + this.szTextDefault.contentHashCode()
        result = 31 * result + this.lpfnStyle.hashCode()
        result = 31 * result + this.lpfnSizeToText.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        return result
    }
}

public data class CCSTYLEA(
    public var flStyle: UInt = 0u,
    public var flExtStyle: UInt = 0u,
    public var szText: ByteArray = ByteArray(256),
    public var lgid: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CCSTYLEA) return false
        if (this.flStyle != other.flStyle) return false
        if (this.flExtStyle != other.flExtStyle) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.lgid != other.lgid) return false
        if (this.wReserved1 != other.wReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flStyle.hashCode()
        result = 31 * result + this.flExtStyle.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.lgid.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        return result
    }
}

public data class CCSTYLEFLAGA(
    public var flStyle: UInt = 0u,
    public var flStyleMask: UInt = 0u,
    public var pszStyle: PSTR = 0L,
)

public data class CCSTYLEFLAGW(
    public var flStyle: UInt = 0u,
    public var flStyleMask: UInt = 0u,
    public var pszStyle: PWSTR = 0L,
)

public data class CCSTYLEW(
    public var flStyle: UInt = 0u,
    public var flExtStyle: UInt = 0u,
    public var szText: UShortArray = UShortArray(256),
    public var lgid: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CCSTYLEW) return false
        if (this.flStyle != other.flStyle) return false
        if (this.flExtStyle != other.flExtStyle) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.lgid != other.lgid) return false
        if (this.wReserved1 != other.wReserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flStyle.hashCode()
        result = 31 * result + this.flExtStyle.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.lgid.hashCode()
        result = 31 * result + this.wReserved1.hashCode()
        return result
    }
}

public data class COLORMAP(public var from: COLORREF = 0u, public var to: COLORREF = 0u)

public data class COLORSCHEME(
    public var dwSize: UInt = 0u,
    public var clrBtnHighlight: COLORREF = 0u,
    public var clrBtnShadow: COLORREF = 0u,
)

public data class COMBOBOXEXITEMA(
    public var mask: COMBOBOX_EX_ITEM_FLAGS = 0u,
    public var iItem: Long = 0L,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var iOverlay: Int = 0,
    public var iIndent: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class COMBOBOXEXITEMW(
    public var mask: COMBOBOX_EX_ITEM_FLAGS = 0u,
    public var iItem: Long = 0L,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var iOverlay: Int = 0,
    public var iIndent: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class COMBOBOXINFO(
    public var cbSize: UInt = 0u,
    public var rcItem: RECT = RECT(),
    public var rcButton: RECT = RECT(),
    public var stateButton: COMBOBOXINFO_BUTTON_STATE = 0u,
    public var hwndCombo: HWND = 0L,
    public var hwndItem: HWND = 0L,
    public var hwndList: HWND = 0L,
)

public data class COMPAREITEMSTRUCT(
    public var CtlType: DRAWITEMSTRUCT_CTL_TYPE = 0u,
    public var CtlID: UInt = 0u,
    public var hwndItem: HWND = 0L,
    public var itemID1: UInt = 0u,
    public var itemData1: ULong = 0uL,
    public var itemID2: UInt = 0u,
    public var itemData2: ULong = 0uL,
    public var dwLocaleId: UInt = 0u,
)

public data class DATETIMEPICKERINFO(
    public var cbSize: UInt = 0u,
    public var rcCheck: RECT = RECT(),
    public var stateCheck: UInt = 0u,
    public var rcButton: RECT = RECT(),
    public var stateButton: UInt = 0u,
    public var hwndEdit: HWND = 0L,
    public var hwndUD: HWND = 0L,
    public var hwndDropDown: HWND = 0L,
)

public data class DELETEITEMSTRUCT(
    public var CtlType: DRAWITEMSTRUCT_CTL_TYPE = 0u,
    public var CtlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var hwndItem: HWND = 0L,
    public var itemData: ULong = 0uL,
)

public data class DPASTREAMINFO(public var iPos: Int = 0, public var pvItem: Long = 0L)

public data class DRAGLISTINFO(
    public var uNotification: DRAGLISTINFO_NOTIFICATION_FLAGS = 0u,
    public var hWnd: HWND = 0L,
    public var ptCursor: POINT = POINT(),
)

public data class DRAWITEMSTRUCT(
    public var CtlType: DRAWITEMSTRUCT_CTL_TYPE = 0u,
    public var CtlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var itemAction: ODA_FLAGS = 0u,
    public var itemState: ODS_FLAGS = 0u,
    public var hwndItem: HWND = 0L,
    public var hDC: HDC = 0L,
    public var rcItem: RECT = RECT(),
    public var itemData: ULong = 0uL,
)

public data class DTBGOPTS(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var rcClip: RECT = RECT(),
)

public data class DTTOPTS(
    public var dwSize: UInt = 0u,
    public var dwFlags: DTTOPTS_FLAGS = 0u,
    public var crText: COLORREF = 0u,
    public var crBorder: COLORREF = 0u,
    public var crShadow: COLORREF = 0u,
    public var iTextShadowType: Int = 0,
    public var ptShadowOffset: POINT = POINT(),
    public var iBorderSize: Int = 0,
    public var iFontPropId: Int = 0,
    public var iColorPropId: Int = 0,
    public var iStateId: Int = 0,
    public var fApplyOverlay: BOOL = 0,
    public var iGlowSize: Int = 0,
    public var pfnDrawTextCallback: DTT_CALLBACK_PROC = null,
    public var lParam: LPARAM = 0L,
)

public data class EDITBALLOONTIP(
    public var cbStruct: UInt = 0u,
    public var pszTitle: PCWSTR = 0L,
    public var pszText: PCWSTR = 0L,
    public var ttiIcon: EDITBALLOONTIP_ICON = 0,
)

public data class HDHITTESTINFO(
    public var pt: POINT = POINT(),
    public var flags: HEADER_HITTEST_INFO_FLAGS = 0u,
    public var iItem: Int = 0,
)

public data class HDITEMA(
    public var mask: HDI_MASK = 0u,
    public var cxy: Int = 0,
    public var pszText: PSTR = 0L,
    public var hbm: HBITMAP = 0L,
    public var cchTextMax: Int = 0,
    public var fmt: HEADER_CONTROL_FORMAT_FLAGS = 0,
    public var lParam: LPARAM = 0L,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var type: HEADER_CONTROL_FORMAT_TYPE = 0u,
    public var pvFilter: Long = 0L,
    public var state: HEADER_CONTROL_FORMAT_STATE = 0u,
)

public data class HDITEMW(
    public var mask: HDI_MASK = 0u,
    public var cxy: Int = 0,
    public var pszText: PWSTR = 0L,
    public var hbm: HBITMAP = 0L,
    public var cchTextMax: Int = 0,
    public var fmt: HEADER_CONTROL_FORMAT_FLAGS = 0,
    public var lParam: LPARAM = 0L,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var type: HEADER_CONTROL_FORMAT_TYPE = 0u,
    public var pvFilter: Long = 0L,
    public var state: HEADER_CONTROL_FORMAT_STATE = 0u,
)

public data class HDLAYOUT(public var prc: Long = 0L, public var pwpos: Long = 0L)

public data class HD_TEXTFILTERA(public var pszText: PSTR = 0L, public var cchTextMax: Int = 0)

public data class HD_TEXTFILTERW(public var pszText: PWSTR = 0L, public var cchTextMax: Int = 0)

public data class IMAGEINFO(
    public var hbmImage: HBITMAP = 0L,
    public var hbmMask: HBITMAP = 0L,
    public var Unused1: Int = 0,
    public var Unused2: Int = 0,
    public var rcImage: RECT = RECT(),
)

public class IMAGELISTDRAWPARAMS(
    public var cbSize: UInt = 0u,
    public var himl: HIMAGELIST = 0L,
    public var i: Int = 0,
    public var hdcDst: HDC = 0L,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var xBitmap: Int = 0,
    public var yBitmap: Int = 0,
    public var rgbBk: COLORREF = 0u,
    public var rgbFg: COLORREF = 0u,
    public var fStyle: UInt = 0u,
    public var dwRop: UInt = 0u,
    public var fState: UInt = 0u,
    public var Frame: UInt = 0u,
    public var crEffect: COLORREF = 0u,
)

public data class IMAGELISTSTATS(
    public var cbSize: UInt = 0u,
    public var cAlloc: Int = 0,
    public var cUsed: Int = 0,
    public var cStandby: Int = 0,
)

public data class INITCOMMONCONTROLSEX(public var dwSize: UInt = 0u, public var dwICC: INITCOMMONCONTROLSEX_ICC = 0u)

public data class INTLIST(public var iValueCount: Int = 0, public var iValues: IntArray = IntArray(402)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is INTLIST) return false
        if (this.iValueCount != other.iValueCount) return false
        if (!this.iValues.contentEquals(other.iValues)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iValueCount.hashCode()
        result = 31 * result + this.iValues.contentHashCode()
        return result
    }
}

public data class LHITTESTINFO(public var pt: POINT = POINT(), public var item: LITEM = LITEM())

public data class LITEM(
    public var mask: LIST_ITEM_FLAGS = 0u,
    public var iLink: Int = 0,
    public var state: LIST_ITEM_STATE_FLAGS = 0u,
    public var stateMask: LIST_ITEM_STATE_FLAGS = 0u,
    public var szID: UShortArray = UShortArray(48),
    public var szUrl: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LITEM) return false
        if (this.mask != other.mask) return false
        if (this.iLink != other.iLink) return false
        if (this.state != other.state) return false
        if (this.stateMask != other.stateMask) return false
        if (!this.szID.contentEquals(other.szID)) return false
        if (!this.szUrl.contentEquals(other.szUrl)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.iLink.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.stateMask.hashCode()
        result = 31 * result + this.szID.contentHashCode()
        result = 31 * result + this.szUrl.contentHashCode()
        return result
    }
}

public data class LVBKIMAGEA(
    public var ulFlags: LIST_VIEW_BACKGROUND_IMAGE_FLAGS = 0u,
    public var hbm: HBITMAP = 0L,
    public var pszImage: PSTR = 0L,
    public var cchImageMax: UInt = 0u,
    public var xOffsetPercent: Int = 0,
    public var yOffsetPercent: Int = 0,
)

public data class LVBKIMAGEW(
    public var ulFlags: LIST_VIEW_BACKGROUND_IMAGE_FLAGS = 0u,
    public var hbm: HBITMAP = 0L,
    public var pszImage: PWSTR = 0L,
    public var cchImageMax: UInt = 0u,
    public var xOffsetPercent: Int = 0,
    public var yOffsetPercent: Int = 0,
)

public data class LVCOLUMNA(
    public var mask: LVCOLUMNW_MASK = 0u,
    public var fmt: LVCOLUMNW_FORMAT = 0,
    public var cx: Int = 0,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iSubItem: Int = 0,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var cxMin: Int = 0,
    public var cxDefault: Int = 0,
    public var cxIdeal: Int = 0,
)

public data class LVCOLUMNW(
    public var mask: LVCOLUMNW_MASK = 0u,
    public var fmt: LVCOLUMNW_FORMAT = 0,
    public var cx: Int = 0,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iSubItem: Int = 0,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var cxMin: Int = 0,
    public var cxDefault: Int = 0,
    public var cxIdeal: Int = 0,
)

public data class LVFINDINFOA(
    public var flags: LVFINDINFOW_FLAGS = 0u,
    public var psz: PCSTR = 0L,
    public var lParam: LPARAM = 0L,
    public var pt: POINT = POINT(),
    public var vkDirection: UInt = 0u,
)

public data class LVFINDINFOW(
    public var flags: LVFINDINFOW_FLAGS = 0u,
    public var psz: PCWSTR = 0L,
    public var lParam: LPARAM = 0L,
    public var pt: POINT = POINT(),
    public var vkDirection: UInt = 0u,
)

public data class LVFOOTERINFO(
    public var mask: UInt = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var cItems: UInt = 0u,
)

public data class LVFOOTERITEM(
    public var mask: LVFOOTERITEM_MASK = 0u,
    public var iItem: Int = 0,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var state: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public class LVGROUP(
    public var cbSize: UInt = 0u,
    public var mask: LVGROUP_MASK = 0u,
    public var pszHeader: PWSTR = 0L,
    public var cchHeader: Int = 0,
    public var pszFooter: PWSTR = 0L,
    public var cchFooter: Int = 0,
    public var iGroupId: Int = 0,
    public var stateMask: LIST_VIEW_GROUP_STATE_FLAGS = 0u,
    public var state: LIST_VIEW_GROUP_STATE_FLAGS = 0u,
    public var uAlign: LIST_VIEW_GROUP_ALIGN_FLAGS = 0u,
    public var pszSubtitle: PWSTR = 0L,
    public var cchSubtitle: UInt = 0u,
    public var pszTask: PWSTR = 0L,
    public var cchTask: UInt = 0u,
    public var pszDescriptionTop: PWSTR = 0L,
    public var cchDescriptionTop: UInt = 0u,
    public var pszDescriptionBottom: PWSTR = 0L,
    public var cchDescriptionBottom: UInt = 0u,
    public var iTitleImage: Int = 0,
    public var iExtendedImage: Int = 0,
    public var iFirstItem: Int = 0,
    public var cItems: UInt = 0u,
    public var pszSubsetTitle: PWSTR = 0L,
    public var cchSubsetTitle: UInt = 0u,
)

public data class LVGROUPMETRICS(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var Left: UInt = 0u,
    public var Top: UInt = 0u,
    public var Right: UInt = 0u,
    public var Bottom: UInt = 0u,
    public var crLeft: COLORREF = 0u,
    public var crTop: COLORREF = 0u,
    public var crRight: COLORREF = 0u,
    public var crBottom: COLORREF = 0u,
    public var crHeader: COLORREF = 0u,
    public var crFooter: COLORREF = 0u,
)

public data class LVHITTESTINFO(
    public var pt: POINT = POINT(),
    public var flags: LVHITTESTINFO_FLAGS = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var iGroup: Int = 0,
)

public data class LVINSERTGROUPSORTED(
    public var pfnGroupCompare: PFNLVGROUPCOMPARE = null,
    public var pvData: Long = 0L,
    public var lvGroup: LVGROUP = LVGROUP(),
)

public data class LVINSERTMARK(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iItem: Int = 0,
    public var dwReserved: UInt = 0u,
)

public data class LVITEMA(
    public var mask: LIST_VIEW_ITEM_FLAGS = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var state: LIST_VIEW_ITEM_STATE_FLAGS = 0u,
    public var stateMask: LIST_VIEW_ITEM_STATE_FLAGS = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: LPARAM = 0L,
    public var iIndent: Int = 0,
    public var iGroupId: Int = 0,
    public var cColumns: UInt = 0u,
    public var puColumns: Long = 0L,
    public var piColFmt: Long = 0L,
    public var iGroup: Int = 0,
)

public data class LVITEMINDEX(public var iItem: Int = 0, public var iGroup: Int = 0)

public data class LVITEMW(
    public var mask: LIST_VIEW_ITEM_FLAGS = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var state: LIST_VIEW_ITEM_STATE_FLAGS = 0u,
    public var stateMask: LIST_VIEW_ITEM_STATE_FLAGS = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: LPARAM = 0L,
    public var iIndent: Int = 0,
    public var iGroupId: Int = 0,
    public var cColumns: UInt = 0u,
    public var puColumns: Long = 0L,
    public var piColFmt: Long = 0L,
    public var iGroup: Int = 0,
)

public data class LVSETINFOTIP(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pszText: PWSTR = 0L,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
)

public data class LVTILEINFO(
    public var cbSize: UInt = 0u,
    public var iItem: Int = 0,
    public var cColumns: UInt = 0u,
    public var puColumns: Long = 0L,
    public var piColFmt: Long = 0L,
)

public data class LVTILEVIEWINFO(
    public var cbSize: UInt = 0u,
    public var dwMask: LVTILEVIEWINFO_MASK = 0u,
    public var dwFlags: LVTILEVIEWINFO_FLAGS = 0u,
    public var sizeTile: SIZE = SIZE(),
    public var cLines: Int = 0,
    public var rcLabelMargin: RECT = RECT(),
)

public data class MARGINS(
    public var cxLeftWidth: Int = 0,
    public var cxRightWidth: Int = 0,
    public var cyTopHeight: Int = 0,
    public var cyBottomHeight: Int = 0,
)

public data class MCGRIDINFO(
    public var cbSize: UInt = 0u,
    public var dwPart: MCGRIDINFO_PART = 0u,
    public var dwFlags: MCGRIDINFO_FLAGS = 0u,
    public var iCalendar: Int = 0,
    public var iRow: Int = 0,
    public var iCol: Int = 0,
    public var bSelected: BOOL = 0,
    public var stStart: SYSTEMTIME = SYSTEMTIME(),
    public var stEnd: SYSTEMTIME = SYSTEMTIME(),
    public var rc: RECT = RECT(),
    public var pszName: PWSTR = 0L,
    public var cchName: ULong = 0uL,
)

public data class MCHITTESTINFO(
    public var cbSize: UInt = 0u,
    public var pt: POINT = POINT(),
    public var uHit: MCHITTESTINFO_HIT_FLAGS = 0u,
    public var st: SYSTEMTIME = SYSTEMTIME(),
    public var rc: RECT = RECT(),
    public var iOffset: Int = 0,
    public var iRow: Int = 0,
    public var iCol: Int = 0,
)

public data class MEASUREITEMSTRUCT(
    public var CtlType: DRAWITEMSTRUCT_CTL_TYPE = 0u,
    public var CtlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var itemWidth: UInt = 0u,
    public var itemHeight: UInt = 0u,
    public var itemData: ULong = 0uL,
)

public data class NMBCDROPDOWN(public var hdr: NMHDR = NMHDR(), public var rcButton: RECT = RECT())

public data class NMBCHOTITEM(public var hdr: NMHDR = NMHDR(), public var dwFlags: NMTBHOTITEM_FLAGS = 0u)

public data class NMCBEDRAGBEGINA(
    public var hdr: NMHDR = NMHDR(),
    public var iItemid: Int = 0,
    public var szText: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMCBEDRAGBEGINA) return false
        if (this.hdr != other.hdr) return false
        if (this.iItemid != other.iItemid) return false
        if (!this.szText.contentEquals(other.szText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItemid.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        return result
    }
}

public data class NMCBEDRAGBEGINW(
    public var hdr: NMHDR = NMHDR(),
    public var iItemid: Int = 0,
    public var szText: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMCBEDRAGBEGINW) return false
        if (this.hdr != other.hdr) return false
        if (this.iItemid != other.iItemid) return false
        if (!this.szText.contentEquals(other.szText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.iItemid.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        return result
    }
}

public data class NMCBEENDEDITA(
    public var hdr: NMHDR = NMHDR(),
    public var fChanged: BOOL = 0,
    public var iNewSelection: Int = 0,
    public var szText: ByteArray = ByteArray(260),
    public var iWhy: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMCBEENDEDITA) return false
        if (this.hdr != other.hdr) return false
        if (this.fChanged != other.fChanged) return false
        if (this.iNewSelection != other.iNewSelection) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.iWhy != other.iWhy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.fChanged.hashCode()
        result = 31 * result + this.iNewSelection.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.iWhy.hashCode()
        return result
    }
}

public data class NMCBEENDEDITW(
    public var hdr: NMHDR = NMHDR(),
    public var fChanged: BOOL = 0,
    public var iNewSelection: Int = 0,
    public var szText: UShortArray = UShortArray(260),
    public var iWhy: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMCBEENDEDITW) return false
        if (this.hdr != other.hdr) return false
        if (this.fChanged != other.fChanged) return false
        if (this.iNewSelection != other.iNewSelection) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.iWhy != other.iWhy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.fChanged.hashCode()
        result = 31 * result + this.iNewSelection.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.iWhy.hashCode()
        return result
    }
}

public data class NMCHAR(
    public var hdr: NMHDR = NMHDR(),
    public var ch: UInt = 0u,
    public var dwItemPrev: UInt = 0u,
    public var dwItemNext: UInt = 0u,
)

public data class NMCOMBOBOXEXA(public var hdr: NMHDR = NMHDR(), public var ceItem: COMBOBOXEXITEMA = COMBOBOXEXITEMA())

public data class NMCOMBOBOXEXW(public var hdr: NMHDR = NMHDR(), public var ceItem: COMBOBOXEXITEMW = COMBOBOXEXITEMW())

public data class NMCUSTOMDRAW(
    public var hdr: NMHDR = NMHDR(),
    public var dwDrawStage: NMCUSTOMDRAW_DRAW_STAGE = 0u,
    public var hdc: HDC = 0L,
    public var rc: RECT = RECT(),
    public var dwItemSpec: ULong = 0uL,
    public var uItemState: NMCUSTOMDRAW_DRAW_STATE_FLAGS = 0u,
    public var lItemlParam: LPARAM = 0L,
)

public data class NMCUSTOMSPLITRECTINFO(
    public var hdr: NMHDR = NMHDR(),
    public var rcClient: RECT = RECT(),
    public var rcButton: RECT = RECT(),
    public var rcSplit: RECT = RECT(),
)

public data class NMCUSTOMTEXT(
    public var hdr: NMHDR = NMHDR(),
    public var hDC: HDC = 0L,
    public var lpString: PCWSTR = 0L,
    public var nCount: Int = 0,
    public var lpRect: Long = 0L,
    public var uFormat: UInt = 0u,
    public var fLink: BOOL = 0,
)

public data class NMDATETIMECHANGE(
    public var nmhdr: NMHDR = NMHDR(),
    public var dwFlags: NMDATETIMECHANGE_FLAGS = 0u,
    public var st: SYSTEMTIME = SYSTEMTIME(),
)

public data class NMDATETIMEFORMATA(
    public var nmhdr: NMHDR = NMHDR(),
    public var pszFormat: PCSTR = 0L,
    public var st: SYSTEMTIME = SYSTEMTIME(),
    public var pszDisplay: PCSTR = 0L,
    public var szDisplay: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMDATETIMEFORMATA) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.st != other.st) return false
        if (this.pszDisplay != other.pszDisplay) return false
        if (!this.szDisplay.contentEquals(other.szDisplay)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.pszDisplay.hashCode()
        result = 31 * result + this.szDisplay.contentHashCode()
        return result
    }
}

public data class NMDATETIMEFORMATQUERYA(
    public var nmhdr: NMHDR = NMHDR(),
    public var pszFormat: PCSTR = 0L,
    public var szMax: SIZE = SIZE(),
)

public data class NMDATETIMEFORMATQUERYW(
    public var nmhdr: NMHDR = NMHDR(),
    public var pszFormat: PCWSTR = 0L,
    public var szMax: SIZE = SIZE(),
)

public data class NMDATETIMEFORMATW(
    public var nmhdr: NMHDR = NMHDR(),
    public var pszFormat: PCWSTR = 0L,
    public var st: SYSTEMTIME = SYSTEMTIME(),
    public var pszDisplay: PCWSTR = 0L,
    public var szDisplay: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMDATETIMEFORMATW) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.pszFormat != other.pszFormat) return false
        if (this.st != other.st) return false
        if (this.pszDisplay != other.pszDisplay) return false
        if (!this.szDisplay.contentEquals(other.szDisplay)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.pszFormat.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.pszDisplay.hashCode()
        result = 31 * result + this.szDisplay.contentHashCode()
        return result
    }
}

public data class NMDATETIMESTRINGA(
    public var nmhdr: NMHDR = NMHDR(),
    public var pszUserString: PCSTR = 0L,
    public var st: SYSTEMTIME = SYSTEMTIME(),
    public var dwFlags: UInt = 0u,
)

public data class NMDATETIMESTRINGW(
    public var nmhdr: NMHDR = NMHDR(),
    public var pszUserString: PCWSTR = 0L,
    public var st: SYSTEMTIME = SYSTEMTIME(),
    public var dwFlags: UInt = 0u,
)

public data class NMDATETIMEWMKEYDOWNA(
    public var nmhdr: NMHDR = NMHDR(),
    public var nVirtKey: Int = 0,
    public var pszFormat: PCSTR = 0L,
    public var st: SYSTEMTIME = SYSTEMTIME(),
)

public data class NMDATETIMEWMKEYDOWNW(
    public var nmhdr: NMHDR = NMHDR(),
    public var nVirtKey: Int = 0,
    public var pszFormat: PCWSTR = 0L,
    public var st: SYSTEMTIME = SYSTEMTIME(),
)

public data class NMDAYSTATE(
    public var nmhdr: NMHDR = NMHDR(),
    public var stStart: SYSTEMTIME = SYSTEMTIME(),
    public var cDayState: Int = 0,
    public var prgDayState: Long = 0L,
)

public data class NMHDDISPINFOA(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var mask: HDI_MASK = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class NMHDDISPINFOW(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var mask: HDI_MASK = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class NMHDFILTERBTNCLICK(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var rc: RECT = RECT(),
)

public data class NMHDR(
    public var hwndFrom: HWND = 0L,
    public var idFrom: ULong = 0uL,
    public var code: UInt = 0u,
)

public data class NMHEADERA(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var iButton: HEADER_CONTROL_NOTIFICATION_BUTTON = 0,
    public var pitem: Long = 0L,
)

public data class NMHEADERW(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var iButton: HEADER_CONTROL_NOTIFICATION_BUTTON = 0,
    public var pitem: Long = 0L,
)

public data class NMIPADDRESS(
    public var hdr: NMHDR = NMHDR(),
    public var iField: Int = 0,
    public var iValue: Int = 0,
)

public data class NMITEMACTIVATE(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var uNewState: UInt = 0u,
    public var uOldState: UInt = 0u,
    public var uChanged: UInt = 0u,
    public var ptAction: POINT = POINT(),
    public var lParam: LPARAM = 0L,
    public var uKeyFlags: UInt = 0u,
)

public data class NMKEY(
    public var hdr: NMHDR = NMHDR(),
    public var nVKey: UInt = 0u,
    public var uFlags: UInt = 0u,
)

public data class NMLINK(public var hdr: NMHDR = NMHDR(), public var item: LITEM = LITEM())

public data class NMLISTVIEW(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var uNewState: UInt = 0u,
    public var uOldState: UInt = 0u,
    public var uChanged: LIST_VIEW_ITEM_FLAGS = 0u,
    public var ptAction: POINT = POINT(),
    public var lParam: LPARAM = 0L,
)

public data class NMLVCACHEHINT(
    public var hdr: NMHDR = NMHDR(),
    public var iFrom: Int = 0,
    public var iTo: Int = 0,
)

public data class NMLVCUSTOMDRAW(
    public var nmcd: NMCUSTOMDRAW = NMCUSTOMDRAW(),
    public var clrText: COLORREF = 0u,
    public var clrTextBk: COLORREF = 0u,
    public var iSubItem: Int = 0,
    public var dwItemType: NMLVCUSTOMDRAW_ITEM_TYPE = 0u,
    public var clrFace: COLORREF = 0u,
    public var iIconEffect: Int = 0,
    public var iIconPhase: Int = 0,
    public var iPartId: Int = 0,
    public var iStateId: Int = 0,
    public var rcText: RECT = RECT(),
    public var uAlign: LIST_VIEW_GROUP_ALIGN_FLAGS = 0u,
)

public data class NMLVDISPINFOA(public var hdr: NMHDR = NMHDR(), public var item: LVITEMA = LVITEMA())

public data class NMLVDISPINFOW(public var hdr: NMHDR = NMHDR(), public var item: LVITEMW = LVITEMW())

public data class NMLVEMPTYMARKUP(
    public var hdr: NMHDR = NMHDR(),
    public var dwFlags: NMLVEMPTYMARKUP_FLAGS = 0u,
    public var szMarkup: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMLVEMPTYMARKUP) return false
        if (this.hdr != other.hdr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szMarkup.contentEquals(other.szMarkup)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szMarkup.contentHashCode()
        return result
    }
}

public data class NMLVFINDITEMA(
    public var hdr: NMHDR = NMHDR(),
    public var iStart: Int = 0,
    public var lvfi: LVFINDINFOA = LVFINDINFOA(),
)

public data class NMLVFINDITEMW(
    public var hdr: NMHDR = NMHDR(),
    public var iStart: Int = 0,
    public var lvfi: LVFINDINFOW = LVFINDINFOW(),
)

public data class NMLVGETINFOTIPA(
    public var hdr: NMHDR = NMHDR(),
    public var dwFlags: NMLVGETINFOTIP_FLAGS = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class NMLVGETINFOTIPW(
    public var hdr: NMHDR = NMHDR(),
    public var dwFlags: NMLVGETINFOTIP_FLAGS = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class NMLVKEYDOWN(
    public var hdr: NMHDR = NMHDR(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class NMLVLINK(
    public var hdr: NMHDR = NMHDR(),
    public var link: LITEM = LITEM(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
)

public data class NMLVODSTATECHANGE(
    public var hdr: NMHDR = NMHDR(),
    public var iFrom: Int = 0,
    public var iTo: Int = 0,
    public var uNewState: LIST_VIEW_ITEM_STATE_FLAGS = 0u,
    public var uOldState: LIST_VIEW_ITEM_STATE_FLAGS = 0u,
)

public data class NMLVSCROLL(
    public var hdr: NMHDR = NMHDR(),
    public var dx: Int = 0,
    public var dy: Int = 0,
)

public data class NMMOUSE(
    public var hdr: NMHDR = NMHDR(),
    public var dwItemSpec: ULong = 0uL,
    public var dwItemData: ULong = 0uL,
    public var pt: POINT = POINT(),
    public var dwHitInfo: LPARAM = 0L,
)

public data class NMOBJECTNOTIFY(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var piid: Long = 0L,
    public var pObject: Long = 0L,
    public var hResult: HRESULT = 0,
    public var dwFlags: UInt = 0u,
)

public data class NMPGCALCSIZE(
    public var hdr: NMHDR = NMHDR(),
    public var dwFlag: NMPGCALCSIZE_FLAGS = 0u,
    public var iWidth: Int = 0,
    public var iHeight: Int = 0,
)

public data class NMPGHOTITEM(
    public var hdr: NMHDR = NMHDR(),
    public var idOld: Int = 0,
    public var idNew: Int = 0,
    public var dwFlags: UInt = 0u,
)

public data class NMPGSCROLL(
    public var hdr: NMHDR = NMHDR(),
    public var fwKeys: NMPGSCROLL_KEYS = 0u,
    public var rcParent: RECT = RECT(),
    public var iDir: NMPGSCROLL_DIR = 0,
    public var iXpos: Int = 0,
    public var iYpos: Int = 0,
    public var iScroll: Int = 0,
)

public data class NMRBAUTOSIZE(
    public var hdr: NMHDR = NMHDR(),
    public var fChanged: BOOL = 0,
    public var rcTarget: RECT = RECT(),
    public var rcActual: RECT = RECT(),
)

public data class NMREBAR(
    public var hdr: NMHDR = NMHDR(),
    public var dwMask: NMREBAR_MASK_FLAGS = 0u,
    public var uBand: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: LPARAM = 0L,
)

public data class NMREBARAUTOBREAK(
    public var hdr: NMHDR = NMHDR(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: LPARAM = 0L,
    public var uMsg: UInt = 0u,
    public var fStyleCurrent: UInt = 0u,
    public var fAutoBreak: BOOL = 0,
)

public data class NMREBARCHEVRON(
    public var hdr: NMHDR = NMHDR(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: LPARAM = 0L,
    public var rc: RECT = RECT(),
    public var lParamNM: LPARAM = 0L,
)

public data class NMREBARCHILDSIZE(
    public var hdr: NMHDR = NMHDR(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var rcChild: RECT = RECT(),
    public var rcBand: RECT = RECT(),
)

public data class NMREBARSPLITTER(public var hdr: NMHDR = NMHDR(), public var rcSizing: RECT = RECT())

public data class NMSEARCHWEB(
    public var hdr: NMHDR = NMHDR(),
    public var entrypoint: EC_SEARCHWEB_ENTRYPOINT = 0,
    public var hasQueryText: BOOL = 0,
    public var invokeSucceeded: BOOL = 0,
)

public data class NMSELCHANGE(
    public var nmhdr: NMHDR = NMHDR(),
    public var stSelStart: SYSTEMTIME = SYSTEMTIME(),
    public var stSelEnd: SYSTEMTIME = SYSTEMTIME(),
)

public data class NMTBCUSTOMDRAW(
    public var nmcd: NMCUSTOMDRAW = NMCUSTOMDRAW(),
    public var hbrMonoDither: HBRUSH = 0L,
    public var hbrLines: HBRUSH = 0L,
    public var hpenLines: HPEN = 0L,
    public var clrText: COLORREF = 0u,
    public var clrMark: COLORREF = 0u,
    public var clrTextHighlight: COLORREF = 0u,
    public var clrBtnFace: COLORREF = 0u,
    public var clrBtnHighlight: COLORREF = 0u,
    public var clrHighlightHotTrack: COLORREF = 0u,
    public var rcText: RECT = RECT(),
    public var nStringBkMode: Int = 0,
    public var nHLStringBkMode: Int = 0,
    public var iListGap: Int = 0,
)

public data class NMTBDISPINFOA(
    public var hdr: NMHDR = NMHDR(),
    public var dwMask: NMTBDISPINFOW_MASK = 0u,
    public var idCommand: Int = 0,
    public var lParam: ULong = 0uL,
    public var iImage: Int = 0,
    public var pszText: PSTR = 0L,
    public var cchText: Int = 0,
)

public data class NMTBDISPINFOW(
    public var hdr: NMHDR = NMHDR(),
    public var dwMask: NMTBDISPINFOW_MASK = 0u,
    public var idCommand: Int = 0,
    public var lParam: ULong = 0uL,
    public var iImage: Int = 0,
    public var pszText: PWSTR = 0L,
    public var cchText: Int = 0,
)

public data class NMTBGETINFOTIPA(
    public var hdr: NMHDR = NMHDR(),
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class NMTBGETINFOTIPW(
    public var hdr: NMHDR = NMHDR(),
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class NMTBHOTITEM(
    public var hdr: NMHDR = NMHDR(),
    public var idOld: Int = 0,
    public var idNew: Int = 0,
    public var dwFlags: NMTBHOTITEM_FLAGS = 0u,
)

public data class NMTBRESTORE(
    public var hdr: NMHDR = NMHDR(),
    public var pData: Long = 0L,
    public var pCurrent: Long = 0L,
    public var cbData: UInt = 0u,
    public var iItem: Int = 0,
    public var cButtons: Int = 0,
    public var cbBytesPerRecord: Int = 0,
    public var tbButton: TBBUTTON = TBBUTTON(),
)

public data class NMTBSAVE(
    public var hdr: NMHDR = NMHDR(),
    public var pData: Long = 0L,
    public var pCurrent: Long = 0L,
    public var cbData: UInt = 0u,
    public var iItem: Int = 0,
    public var cButtons: Int = 0,
    public var tbButton: TBBUTTON = TBBUTTON(),
)

public data class NMTCKEYDOWN(
    public var hdr: NMHDR = NMHDR(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class NMTOOLBARA(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var tbButton: TBBUTTON = TBBUTTON(),
    public var cchText: Int = 0,
    public var pszText: PSTR = 0L,
    public var rcButton: RECT = RECT(),
)

public data class NMTOOLBARW(
    public var hdr: NMHDR = NMHDR(),
    public var iItem: Int = 0,
    public var tbButton: TBBUTTON = TBBUTTON(),
    public var cchText: Int = 0,
    public var pszText: PWSTR = 0L,
    public var rcButton: RECT = RECT(),
)

public data class NMTOOLTIPSCREATED(public var hdr: NMHDR = NMHDR(), public var hwndToolTips: HWND = 0L)

public data class NMTRBTHUMBPOSCHANGING(
    public var hdr: NMHDR = NMHDR(),
    public var dwPos: UInt = 0u,
    public var nReason: Int = 0,
)

public data class NMTREEVIEWA(
    public var hdr: NMHDR = NMHDR(),
    public var action: NM_TREEVIEW_ACTION = 0u,
    public var itemOld: TVITEMA = TVITEMA(),
    public var itemNew: TVITEMA = TVITEMA(),
    public var ptDrag: POINT = POINT(),
)

public data class NMTREEVIEWW(
    public var hdr: NMHDR = NMHDR(),
    public var action: NM_TREEVIEW_ACTION = 0u,
    public var itemOld: TVITEMW = TVITEMW(),
    public var itemNew: TVITEMW = TVITEMW(),
    public var ptDrag: POINT = POINT(),
)

public data class NMTTCUSTOMDRAW(public var nmcd: NMCUSTOMDRAW = NMCUSTOMDRAW(), public var uDrawFlags: UInt = 0u)

public data class NMTTDISPINFOA(
    public var hdr: NMHDR = NMHDR(),
    public var lpszText: PSTR = 0L,
    public var szText: ByteArray = ByteArray(80),
    public var hinst: HINSTANCE = 0L,
    public var uFlags: TOOLTIP_FLAGS = 0u,
    public var lParam: LPARAM = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMTTDISPINFOA) return false
        if (this.hdr != other.hdr) return false
        if (this.lpszText != other.lpszText) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.hinst != other.hinst) return false
        if (this.uFlags != other.uFlags) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }
}

public data class NMTTDISPINFOW(
    public var hdr: NMHDR = NMHDR(),
    public var lpszText: PWSTR = 0L,
    public var szText: UShortArray = UShortArray(80),
    public var hinst: HINSTANCE = 0L,
    public var uFlags: TOOLTIP_FLAGS = 0u,
    public var lParam: LPARAM = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NMTTDISPINFOW) return false
        if (this.hdr != other.hdr) return false
        if (this.lpszText != other.lpszText) return false
        if (!this.szText.contentEquals(other.szText)) return false
        if (this.hinst != other.hinst) return false
        if (this.uFlags != other.uFlags) return false
        if (this.lParam != other.lParam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdr.hashCode()
        result = 31 * result + this.lpszText.hashCode()
        result = 31 * result + this.szText.contentHashCode()
        result = 31 * result + this.hinst.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.lParam.hashCode()
        return result
    }
}

public data class NMTVASYNCDRAW(
    public var hdr: NMHDR = NMHDR(),
    public var pimldp: Long = 0L,
    public var hr: HRESULT = 0,
    public var hItem: HTREEITEM = 0L,
    public var lParam: LPARAM = 0L,
    public var dwRetFlags: UInt = 0u,
    public var iRetImageIndex: Int = 0,
)

public data class NMTVCUSTOMDRAW(
    public var nmcd: NMCUSTOMDRAW = NMCUSTOMDRAW(),
    public var clrText: COLORREF = 0u,
    public var clrTextBk: COLORREF = 0u,
    public var iLevel: Int = 0,
)

public data class NMTVDISPINFOA(public var hdr: NMHDR = NMHDR(), public var item: TVITEMA = TVITEMA())

public data class NMTVDISPINFOEXA(public var hdr: NMHDR = NMHDR(), public var item: TVITEMEXA = TVITEMEXA())

public data class NMTVDISPINFOEXW(public var hdr: NMHDR = NMHDR(), public var item: TVITEMEXW = TVITEMEXW())

public data class NMTVDISPINFOW(public var hdr: NMHDR = NMHDR(), public var item: TVITEMW = TVITEMW())

public data class NMTVGETINFOTIPA(
    public var hdr: NMHDR = NMHDR(),
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var hItem: HTREEITEM = 0L,
    public var lParam: LPARAM = 0L,
)

public data class NMTVGETINFOTIPW(
    public var hdr: NMHDR = NMHDR(),
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var hItem: HTREEITEM = 0L,
    public var lParam: LPARAM = 0L,
)

public data class NMTVITEMCHANGE(
    public var hdr: NMHDR = NMHDR(),
    public var uChanged: UInt = 0u,
    public var hItem: HTREEITEM = 0L,
    public var uStateNew: UInt = 0u,
    public var uStateOld: UInt = 0u,
    public var lParam: LPARAM = 0L,
)

public data class NMTVKEYDOWN(
    public var hdr: NMHDR = NMHDR(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class NMTVSTATEIMAGECHANGING(
    public var hdr: NMHDR = NMHDR(),
    public var hti: HTREEITEM = 0L,
    public var iOldStateImageIndex: Int = 0,
    public var iNewStateImageIndex: Int = 0,
)

public data class NMUPDOWN(
    public var hdr: NMHDR = NMHDR(),
    public var iPos: Int = 0,
    public var iDelta: Int = 0,
)

public data class NMVIEWCHANGE(
    public var nmhdr: NMHDR = NMHDR(),
    public var dwOldView: MONTH_CALDENDAR_MESSAGES_VIEW = 0u,
    public var dwNewView: MONTH_CALDENDAR_MESSAGES_VIEW = 0u,
)

public data class PBRANGE(public var iLow: Int = 0, public var iHigh: Int = 0)

public data class POINTER_DEVICE_CURSOR_INFO(public var cursorId: UInt = 0u, public var cursor: POINTER_DEVICE_CURSOR_TYPE = 0)

public data class POINTER_DEVICE_INFO(
    public var displayOrientation: UInt = 0u,
    public var device: HANDLE = 0L,
    public var pointerDeviceType: POINTER_DEVICE_TYPE = 0,
    public var monitor: HMONITOR = 0L,
    public var startingCursorId: UInt = 0u,
    public var maxActiveContacts: UShort = 0u,
    public var productString: UShortArray = UShortArray(520),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is POINTER_DEVICE_INFO) return false
        if (this.displayOrientation != other.displayOrientation) return false
        if (this.device != other.device) return false
        if (this.pointerDeviceType != other.pointerDeviceType) return false
        if (this.monitor != other.monitor) return false
        if (this.startingCursorId != other.startingCursorId) return false
        if (this.maxActiveContacts != other.maxActiveContacts) return false
        if (!this.productString.contentEquals(other.productString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.displayOrientation.hashCode()
        result = 31 * result + this.device.hashCode()
        result = 31 * result + this.pointerDeviceType.hashCode()
        result = 31 * result + this.monitor.hashCode()
        result = 31 * result + this.startingCursorId.hashCode()
        result = 31 * result + this.maxActiveContacts.hashCode()
        result = 31 * result + this.productString.contentHashCode()
        return result
    }
}

public data class POINTER_DEVICE_PROPERTY(
    public var logicalMin: Int = 0,
    public var logicalMax: Int = 0,
    public var physicalMin: Int = 0,
    public var physicalMax: Int = 0,
    public var unit: UInt = 0u,
    public var unitExponent: UInt = 0u,
    public var usagePageId: UShort = 0u,
    public var usageId: UShort = 0u,
)

public data class POINTER_TYPE_INFO(public var type: POINTER_INPUT_TYPE = 0, public var Anonymous: POINTER_TYPE_INFO_0 = POINTER_TYPE_INFO_0())

public data class POINTER_TYPE_INFO_0(public var touchInfo: POINTER_TOUCH_INFO = POINTER_TOUCH_INFO(), public var penInfo: POINTER_PEN_INFO = POINTER_PEN_INFO())

public data class PROPSHEETHEADERA_V1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETHEADERA_V1_0 = PROPSHEETHEADERA_V1_0(),
    public var pszCaption: PCSTR = 0L,
    public var nPages: UInt = 0u,
    public var Anonymous2: PROPSHEETHEADERA_V1_1 = PROPSHEETHEADERA_V1_1(),
    public var Anonymous3: PROPSHEETHEADERA_V1_2 = PROPSHEETHEADERA_V1_2(),
    public var pfnCallback: PFNPROPSHEETCALLBACK = null,
)

public data class PROPSHEETHEADERA_V1_0(public var hIcon: HICON = 0L, public var pszIcon: PCSTR = 0L)

public data class PROPSHEETHEADERA_V1_1(public var nStartPage: UInt = 0u, public var pStartPage: PCSTR = 0L)

public data class PROPSHEETHEADERA_V1_2(public var ppsp: Long = 0L, public var phpage: Long = 0L)

public data class PROPSHEETHEADERA_V2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETHEADERA_V2_0 = PROPSHEETHEADERA_V2_0(),
    public var pszCaption: PCSTR = 0L,
    public var nPages: UInt = 0u,
    public var Anonymous2: PROPSHEETHEADERA_V2_1 = PROPSHEETHEADERA_V2_1(),
    public var Anonymous3: PROPSHEETHEADERA_V2_2 = PROPSHEETHEADERA_V2_2(),
    public var pfnCallback: PFNPROPSHEETCALLBACK = null,
    public var Anonymous4: PROPSHEETHEADERA_V2_3 = PROPSHEETHEADERA_V2_3(),
    public var hplWatermark: HPALETTE = 0L,
    public var Anonymous5: PROPSHEETHEADERA_V2_4 = PROPSHEETHEADERA_V2_4(),
)

public data class PROPSHEETHEADERA_V2_0(public var hIcon: HICON = 0L, public var pszIcon: PCSTR = 0L)

public data class PROPSHEETHEADERA_V2_1(public var nStartPage: UInt = 0u, public var pStartPage: PCSTR = 0L)

public data class PROPSHEETHEADERA_V2_2(public var ppsp: Long = 0L, public var phpage: Long = 0L)

public data class PROPSHEETHEADERA_V2_3(public var hbmWatermark: HBITMAP = 0L, public var pszbmWatermark: PCSTR = 0L)

public data class PROPSHEETHEADERA_V2_4(public var hbmHeader: HBITMAP = 0L, public var pszbmHeader: PCSTR = 0L)

public data class PROPSHEETHEADERW_V1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETHEADERW_V1_0 = PROPSHEETHEADERW_V1_0(),
    public var pszCaption: PCWSTR = 0L,
    public var nPages: UInt = 0u,
    public var Anonymous2: PROPSHEETHEADERW_V1_1 = PROPSHEETHEADERW_V1_1(),
    public var Anonymous3: PROPSHEETHEADERW_V1_2 = PROPSHEETHEADERW_V1_2(),
    public var pfnCallback: PFNPROPSHEETCALLBACK = null,
)

public data class PROPSHEETHEADERW_V1_0(public var hIcon: HICON = 0L, public var pszIcon: PCWSTR = 0L)

public data class PROPSHEETHEADERW_V1_1(public var nStartPage: UInt = 0u, public var pStartPage: PCWSTR = 0L)

public data class PROPSHEETHEADERW_V1_2(public var ppsp: Long = 0L, public var phpage: Long = 0L)

public data class PROPSHEETHEADERW_V2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETHEADERW_V2_0 = PROPSHEETHEADERW_V2_0(),
    public var pszCaption: PCWSTR = 0L,
    public var nPages: UInt = 0u,
    public var Anonymous2: PROPSHEETHEADERW_V2_1 = PROPSHEETHEADERW_V2_1(),
    public var Anonymous3: PROPSHEETHEADERW_V2_2 = PROPSHEETHEADERW_V2_2(),
    public var pfnCallback: PFNPROPSHEETCALLBACK = null,
    public var Anonymous4: PROPSHEETHEADERW_V2_3 = PROPSHEETHEADERW_V2_3(),
    public var hplWatermark: HPALETTE = 0L,
    public var Anonymous5: PROPSHEETHEADERW_V2_4 = PROPSHEETHEADERW_V2_4(),
)

public data class PROPSHEETHEADERW_V2_0(public var hIcon: HICON = 0L, public var pszIcon: PCWSTR = 0L)

public data class PROPSHEETHEADERW_V2_1(public var nStartPage: UInt = 0u, public var pStartPage: PCWSTR = 0L)

public data class PROPSHEETHEADERW_V2_2(public var ppsp: Long = 0L, public var phpage: Long = 0L)

public data class PROPSHEETHEADERW_V2_3(public var hbmWatermark: HBITMAP = 0L, public var pszbmWatermark: PCWSTR = 0L)

public data class PROPSHEETHEADERW_V2_4(public var hbmHeader: HBITMAP = 0L, public var pszbmHeader: PCWSTR = 0L)

public data class PROPSHEETPAGEA(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEA_0 = PROPSHEETPAGEA_0(),
    public var Anonymous2: PROPSHEETPAGEA_1 = PROPSHEETPAGEA_1(),
    public var pszTitle: PCSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKA = null,
    public var pcRefParent: Long = 0L,
    public var pszHeaderTitle: PCSTR = 0L,
    public var pszHeaderSubTitle: PCSTR = 0L,
    public var hActCtx: HANDLE = 0L,
    public var Anonymous3: PROPSHEETPAGEA_2 = PROPSHEETPAGEA_2(),
)

public data class PROPSHEETPAGEA_0(public var pszTemplate: PCSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEA_1(public var hIcon: HICON = 0L, public var pszIcon: PCSTR = 0L)

public data class PROPSHEETPAGEA_2(public var hbmHeader: HBITMAP = 0L, public var pszbmHeader: PCSTR = 0L)

public data class PROPSHEETPAGEA_V1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEA_V1_0 = PROPSHEETPAGEA_V1_0(),
    public var Anonymous2: PROPSHEETPAGEA_V1_1 = PROPSHEETPAGEA_V1_1(),
    public var pszTitle: PCSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKA = null,
    public var pcRefParent: Long = 0L,
)

public data class PROPSHEETPAGEA_V1_0(public var pszTemplate: PCSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEA_V1_1(public var hIcon: HICON = 0L, public var pszIcon: PCSTR = 0L)

public data class PROPSHEETPAGEA_V2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEA_V2_0 = PROPSHEETPAGEA_V2_0(),
    public var Anonymous2: PROPSHEETPAGEA_V2_1 = PROPSHEETPAGEA_V2_1(),
    public var pszTitle: PCSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKA = null,
    public var pcRefParent: Long = 0L,
    public var pszHeaderTitle: PCSTR = 0L,
    public var pszHeaderSubTitle: PCSTR = 0L,
)

public data class PROPSHEETPAGEA_V2_0(public var pszTemplate: PCSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEA_V2_1(public var hIcon: HICON = 0L, public var pszIcon: PCSTR = 0L)

public data class PROPSHEETPAGEA_V3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEA_V3_0 = PROPSHEETPAGEA_V3_0(),
    public var Anonymous2: PROPSHEETPAGEA_V3_1 = PROPSHEETPAGEA_V3_1(),
    public var pszTitle: PCSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKA = null,
    public var pcRefParent: Long = 0L,
    public var pszHeaderTitle: PCSTR = 0L,
    public var pszHeaderSubTitle: PCSTR = 0L,
    public var hActCtx: HANDLE = 0L,
)

public data class PROPSHEETPAGEA_V3_0(public var pszTemplate: PCSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEA_V3_1(public var hIcon: HICON = 0L, public var pszIcon: PCSTR = 0L)

public data class PROPSHEETPAGEW(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEW_0 = PROPSHEETPAGEW_0(),
    public var Anonymous2: PROPSHEETPAGEW_1 = PROPSHEETPAGEW_1(),
    public var pszTitle: PCWSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKW = null,
    public var pcRefParent: Long = 0L,
    public var pszHeaderTitle: PCWSTR = 0L,
    public var pszHeaderSubTitle: PCWSTR = 0L,
    public var hActCtx: HANDLE = 0L,
    public var Anonymous3: PROPSHEETPAGEW_2 = PROPSHEETPAGEW_2(),
)

public data class PROPSHEETPAGEW_0(public var pszTemplate: PCWSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEW_1(public var hIcon: HICON = 0L, public var pszIcon: PCWSTR = 0L)

public data class PROPSHEETPAGEW_2(public var hbmHeader: HBITMAP = 0L, public var pszbmHeader: PCWSTR = 0L)

public data class PROPSHEETPAGEW_V1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEW_V1_0 = PROPSHEETPAGEW_V1_0(),
    public var Anonymous2: PROPSHEETPAGEW_V1_1 = PROPSHEETPAGEW_V1_1(),
    public var pszTitle: PCWSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKW = null,
    public var pcRefParent: Long = 0L,
)

public data class PROPSHEETPAGEW_V1_0(public var pszTemplate: PCWSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEW_V1_1(public var hIcon: HICON = 0L, public var pszIcon: PCWSTR = 0L)

public data class PROPSHEETPAGEW_V2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEW_V2_0 = PROPSHEETPAGEW_V2_0(),
    public var Anonymous2: PROPSHEETPAGEW_V2_1 = PROPSHEETPAGEW_V2_1(),
    public var pszTitle: PCWSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKW = null,
    public var pcRefParent: Long = 0L,
    public var pszHeaderTitle: PCWSTR = 0L,
    public var pszHeaderSubTitle: PCWSTR = 0L,
)

public data class PROPSHEETPAGEW_V2_0(public var pszTemplate: PCWSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEW_V2_1(public var hIcon: HICON = 0L, public var pszIcon: PCWSTR = 0L)

public data class PROPSHEETPAGEW_V3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var Anonymous1: PROPSHEETPAGEW_V3_0 = PROPSHEETPAGEW_V3_0(),
    public var Anonymous2: PROPSHEETPAGEW_V3_1 = PROPSHEETPAGEW_V3_1(),
    public var pszTitle: PCWSTR = 0L,
    public var pfnDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
    public var pfnCallback: LPFNPSPCALLBACKW = null,
    public var pcRefParent: Long = 0L,
    public var pszHeaderTitle: PCWSTR = 0L,
    public var pszHeaderSubTitle: PCWSTR = 0L,
    public var hActCtx: HANDLE = 0L,
)

public data class PROPSHEETPAGEW_V3_0(public var pszTemplate: PCWSTR = 0L, public var pResource: Long = 0L)

public data class PROPSHEETPAGEW_V3_1(public var hIcon: HICON = 0L, public var pszIcon: PCWSTR = 0L)

public data class PSHNOTIFY(public var hdr: NMHDR = NMHDR(), public var lParam: LPARAM = 0L)

public data class RBHITTESTINFO(
    public var pt: POINT = POINT(),
    public var flags: UInt = 0u,
    public var iBand: Int = 0,
)

public class REBARBANDINFOA(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var clrFore: COLORREF = 0u,
    public var clrBack: COLORREF = 0u,
    public var lpText: PSTR = 0L,
    public var cch: UInt = 0u,
    public var iImage: Int = 0,
    public var hwndChild: HWND = 0L,
    public var cxMinChild: UInt = 0u,
    public var cyMinChild: UInt = 0u,
    public var cx: UInt = 0u,
    public var hbmBack: HBITMAP = 0L,
    public var wID: UInt = 0u,
    public var cyChild: UInt = 0u,
    public var cyMaxChild: UInt = 0u,
    public var cyIntegral: UInt = 0u,
    public var cxIdeal: UInt = 0u,
    public var lParam: LPARAM = 0L,
    public var cxHeader: UInt = 0u,
    public var rcChevronLocation: RECT = RECT(),
    public var uChevronState: UInt = 0u,
)

public class REBARBANDINFOW(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var clrFore: COLORREF = 0u,
    public var clrBack: COLORREF = 0u,
    public var lpText: PWSTR = 0L,
    public var cch: UInt = 0u,
    public var iImage: Int = 0,
    public var hwndChild: HWND = 0L,
    public var cxMinChild: UInt = 0u,
    public var cyMinChild: UInt = 0u,
    public var cx: UInt = 0u,
    public var hbmBack: HBITMAP = 0L,
    public var wID: UInt = 0u,
    public var cyChild: UInt = 0u,
    public var cyMaxChild: UInt = 0u,
    public var cyIntegral: UInt = 0u,
    public var cxIdeal: UInt = 0u,
    public var lParam: LPARAM = 0L,
    public var cxHeader: UInt = 0u,
    public var rcChevronLocation: RECT = RECT(),
    public var uChevronState: UInt = 0u,
)

public data class REBARINFO(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var himl: HIMAGELIST = 0L,
)

public class TASKDIALOGCONFIG(
    public var cbSize: UInt = 0u,
    public var hwndParent: HWND = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var dwFlags: TASKDIALOG_FLAGS = 0,
    public var dwCommonButtons: TASKDIALOG_COMMON_BUTTON_FLAGS = 0,
    public var pszWindowTitle: PCWSTR = 0L,
    public var Anonymous1: TASKDIALOGCONFIG_0 = TASKDIALOGCONFIG_0(),
    public var pszMainInstruction: PCWSTR = 0L,
    public var pszContent: PCWSTR = 0L,
    public var cButtons: UInt = 0u,
    public var pButtons: Long = 0L,
    public var nDefaultButton: Int = 0,
    public var cRadioButtons: UInt = 0u,
    public var pRadioButtons: Long = 0L,
    public var nDefaultRadioButton: Int = 0,
    public var pszVerificationText: PCWSTR = 0L,
    public var pszExpandedInformation: PCWSTR = 0L,
    public var pszExpandedControlText: PCWSTR = 0L,
    public var pszCollapsedControlText: PCWSTR = 0L,
    public var Anonymous2: TASKDIALOGCONFIG_1 = TASKDIALOGCONFIG_1(),
    public var pszFooter: PCWSTR = 0L,
    public var pfCallback: PFTASKDIALOGCALLBACK = null,
    public var lpCallbackData: Long = 0L,
    public var cxWidth: UInt = 0u,
)

public data class TASKDIALOGCONFIG_0(public var hMainIcon: HICON = 0L, public var pszMainIcon: PCWSTR = 0L)

public data class TASKDIALOGCONFIG_1(public var hFooterIcon: HICON = 0L, public var pszFooterIcon: PCWSTR = 0L)

public data class TASKDIALOG_BUTTON(public var nButtonID: Int = 0, public var pszButtonText: PCWSTR = 0L)

public data class TA_CUBIC_BEZIER(
    public var header: TA_TIMINGFUNCTION = TA_TIMINGFUNCTION(),
    public var rX0: Float = 0.0f,
    public var rY0: Float = 0.0f,
    public var rX1: Float = 0.0f,
    public var rY1: Float = 0.0f,
)

public data class TA_TIMINGFUNCTION(public var eTimingFunctionType: TA_TIMINGFUNCTION_TYPE = 0)

public data class TA_TRANSFORM(
    public var eTransformType: TA_TRANSFORM_TYPE = 0,
    public var dwTimingFunctionId: UInt = 0u,
    public var dwStartTime: UInt = 0u,
    public var dwDurationTime: UInt = 0u,
    public var eFlags: TA_TRANSFORM_FLAG = 0,
)

public data class TA_TRANSFORM_2D(
    public var header: TA_TRANSFORM = TA_TRANSFORM(),
    public var rX: Float = 0.0f,
    public var rY: Float = 0.0f,
    public var rInitialX: Float = 0.0f,
    public var rInitialY: Float = 0.0f,
    public var rOriginX: Float = 0.0f,
    public var rOriginY: Float = 0.0f,
)

public data class TA_TRANSFORM_CLIP(
    public var header: TA_TRANSFORM = TA_TRANSFORM(),
    public var rLeft: Float = 0.0f,
    public var rTop: Float = 0.0f,
    public var rRight: Float = 0.0f,
    public var rBottom: Float = 0.0f,
    public var rInitialLeft: Float = 0.0f,
    public var rInitialTop: Float = 0.0f,
    public var rInitialRight: Float = 0.0f,
    public var rInitialBottom: Float = 0.0f,
)

public data class TA_TRANSFORM_OPACITY(
    public var header: TA_TRANSFORM = TA_TRANSFORM(),
    public var rOpacity: Float = 0.0f,
    public var rInitialOpacity: Float = 0.0f,
)

public data class TBADDBITMAP(public var hInst: HINSTANCE = 0L, public var nID: ULong = 0uL)

public data class TBBUTTON(
    public var iBitmap: Int = 0,
    public var idCommand: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(6),
    public var dwData: ULong = 0uL,
    public var iString: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TBBUTTON) return false
        if (this.iBitmap != other.iBitmap) return false
        if (this.idCommand != other.idCommand) return false
        if (this.fsState != other.fsState) return false
        if (this.fsStyle != other.fsStyle) return false
        if (!this.bReserved.contentEquals(other.bReserved)) return false
        if (this.dwData != other.dwData) return false
        if (this.iString != other.iString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iBitmap.hashCode()
        result = 31 * result + this.idCommand.hashCode()
        result = 31 * result + this.fsState.hashCode()
        result = 31 * result + this.fsStyle.hashCode()
        result = 31 * result + this.bReserved.contentHashCode()
        result = 31 * result + this.dwData.hashCode()
        result = 31 * result + this.iString.hashCode()
        return result
    }
}

public data class TBBUTTONINFOA(
    public var cbSize: UInt = 0u,
    public var dwMask: TBBUTTONINFOW_MASK = 0u,
    public var idCommand: Int = 0,
    public var iImage: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var cx: UShort = 0u,
    public var lParam: ULong = 0uL,
    public var pszText: PSTR = 0L,
    public var cchText: Int = 0,
)

public data class TBBUTTONINFOW(
    public var cbSize: UInt = 0u,
    public var dwMask: TBBUTTONINFOW_MASK = 0u,
    public var idCommand: Int = 0,
    public var iImage: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var cx: UShort = 0u,
    public var lParam: ULong = 0uL,
    public var pszText: PWSTR = 0L,
    public var cchText: Int = 0,
)

public data class TBINSERTMARK(public var iButton: Int = 0, public var dwFlags: TBINSERTMARK_FLAGS = 0u)

public data class TBMETRICS(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var cxPad: Int = 0,
    public var cyPad: Int = 0,
    public var cxBarPad: Int = 0,
    public var cyBarPad: Int = 0,
    public var cxButtonSpacing: Int = 0,
    public var cyButtonSpacing: Int = 0,
)

public data class TBREPLACEBITMAP(
    public var hInstOld: HINSTANCE = 0L,
    public var nIDOld: ULong = 0uL,
    public var hInstNew: HINSTANCE = 0L,
    public var nIDNew: ULong = 0uL,
    public var nButtons: Int = 0,
)

public data class TBSAVEPARAMSA(
    public var hkr: HKEY = 0L,
    public var pszSubKey: PCSTR = 0L,
    public var pszValueName: PCSTR = 0L,
)

public data class TBSAVEPARAMSW(
    public var hkr: HKEY = 0L,
    public var pszSubKey: PCWSTR = 0L,
    public var pszValueName: PCWSTR = 0L,
)

public data class TCHITTESTINFO(public var pt: POINT = POINT(), public var flags: TCHITTESTINFO_FLAGS = 0u)

public data class TCITEMA(
    public var mask: TCITEMHEADERA_MASK = 0u,
    public var dwState: TAB_CONTROL_ITEM_STATE = 0u,
    public var dwStateMask: TAB_CONTROL_ITEM_STATE = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class TCITEMHEADERA(
    public var mask: TCITEMHEADERA_MASK = 0u,
    public var lpReserved1: UInt = 0u,
    public var lpReserved2: UInt = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
)

public data class TCITEMHEADERW(
    public var mask: TCITEMHEADERA_MASK = 0u,
    public var lpReserved1: UInt = 0u,
    public var lpReserved2: UInt = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
)

public data class TCITEMW(
    public var mask: TCITEMHEADERA_MASK = 0u,
    public var dwState: TAB_CONTROL_ITEM_STATE = 0u,
    public var dwStateMask: TAB_CONTROL_ITEM_STATE = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: LPARAM = 0L,
)

public data class TOUCH_HIT_TESTING_INPUT(
    public var pointerId: UInt = 0u,
    public var point: POINT = POINT(),
    public var boundingBox: RECT = RECT(),
    public var nonOccludedBoundingBox: RECT = RECT(),
    public var orientation: UInt = 0u,
)

public data class TOUCH_HIT_TESTING_PROXIMITY_EVALUATION(public var score: UShort = 0u, public var adjustedPoint: POINT = POINT())

public data class TTGETTITLE(
    public var dwSize: UInt = 0u,
    public var uTitleBitmap: UInt = 0u,
    public var cch: UInt = 0u,
    public var pszTitle: PWSTR = 0L,
)

public data class TTHITTESTINFOA(
    public var hwnd: HWND = 0L,
    public var pt: POINT = POINT(),
    public var ti: TTTOOLINFOA = TTTOOLINFOA(),
)

public data class TTHITTESTINFOW(
    public var hwnd: HWND = 0L,
    public var pt: POINT = POINT(),
    public var ti: TTTOOLINFOW = TTTOOLINFOW(),
)

public data class TTTOOLINFOA(
    public var cbSize: UInt = 0u,
    public var uFlags: TOOLTIP_FLAGS = 0u,
    public var hwnd: HWND = 0L,
    public var uId: ULong = 0uL,
    public var rect: RECT = RECT(),
    public var hinst: HINSTANCE = 0L,
    public var lpszText: PSTR = 0L,
    public var lParam: LPARAM = 0L,
    public var lpReserved: Long = 0L,
)

public data class TTTOOLINFOW(
    public var cbSize: UInt = 0u,
    public var uFlags: TOOLTIP_FLAGS = 0u,
    public var hwnd: HWND = 0L,
    public var uId: ULong = 0uL,
    public var rect: RECT = RECT(),
    public var hinst: HINSTANCE = 0L,
    public var lpszText: PWSTR = 0L,
    public var lParam: LPARAM = 0L,
    public var lpReserved: Long = 0L,
)

public data class TVGETITEMPARTRECTINFO(
    public var hti: HTREEITEM = 0L,
    public var prc: Long = 0L,
    public var partID: TVITEMPART = 0,
)

public data class TVHITTESTINFO(
    public var pt: POINT = POINT(),
    public var flags: TVHITTESTINFO_FLAGS = 0u,
    public var hItem: HTREEITEM = 0L,
)

public data class TVINSERTSTRUCTA(
    public var hParent: HTREEITEM = 0L,
    public var hInsertAfter: HTREEITEM = 0L,
    public var Anonymous: TVINSERTSTRUCTA_0 = TVINSERTSTRUCTA_0(),
)

public data class TVINSERTSTRUCTA_0(public var itemex: TVITEMEXA = TVITEMEXA(), public var item: TVITEMA = TVITEMA())

public data class TVINSERTSTRUCTW(
    public var hParent: HTREEITEM = 0L,
    public var hInsertAfter: HTREEITEM = 0L,
    public var Anonymous: TVINSERTSTRUCTW_0 = TVINSERTSTRUCTW_0(),
)

public data class TVINSERTSTRUCTW_0(public var itemex: TVITEMEXW = TVITEMEXW(), public var item: TVITEMW = TVITEMW())

public data class TVITEMA(
    public var mask: TVITEM_MASK = 0u,
    public var hItem: HTREEITEM = 0L,
    public var state: TREE_VIEW_ITEM_STATE_FLAGS = 0u,
    public var stateMask: TREE_VIEW_ITEM_STATE_FLAGS = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TVITEMEXW_CHILDREN = 0,
    public var lParam: LPARAM = 0L,
)

public data class TVITEMEXA(
    public var mask: TVITEM_MASK = 0u,
    public var hItem: HTREEITEM = 0L,
    public var state: UInt = 0u,
    public var stateMask: UInt = 0u,
    public var pszText: PSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TVITEMEXW_CHILDREN = 0,
    public var lParam: LPARAM = 0L,
    public var iIntegral: Int = 0,
    public var uStateEx: UInt = 0u,
    public var hwnd: HWND = 0L,
    public var iExpandedImage: Int = 0,
    public var iReserved: Int = 0,
)

public data class TVITEMEXW(
    public var mask: TVITEM_MASK = 0u,
    public var hItem: HTREEITEM = 0L,
    public var state: UInt = 0u,
    public var stateMask: UInt = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TVITEMEXW_CHILDREN = 0,
    public var lParam: LPARAM = 0L,
    public var iIntegral: Int = 0,
    public var uStateEx: UInt = 0u,
    public var hwnd: HWND = 0L,
    public var iExpandedImage: Int = 0,
    public var iReserved: Int = 0,
)

public data class TVITEMW(
    public var mask: TVITEM_MASK = 0u,
    public var hItem: HTREEITEM = 0L,
    public var state: TREE_VIEW_ITEM_STATE_FLAGS = 0u,
    public var stateMask: TREE_VIEW_ITEM_STATE_FLAGS = 0u,
    public var pszText: PWSTR = 0L,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TVITEMEXW_CHILDREN = 0,
    public var lParam: LPARAM = 0L,
)

public data class TVSORTCB(
    public var hParent: HTREEITEM = 0L,
    public var lpfnCompare: PFNTVCOMPARE = null,
    public var lParam: LPARAM = 0L,
)

public data class UDACCEL(public var nSec: UInt = 0u, public var nInc: UInt = 0u)
