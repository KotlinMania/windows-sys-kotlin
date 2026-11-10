@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Blendfunction
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpen
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.PointerPenInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.input.pointer.PointerTouchInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgtemplate
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Windowpos

public data class BpAnimationparams(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var style: BpAnimationstyle = 0,
    public var dwDuration: UInt = 0u,
)

public data class BpPaintparams(
    public var cbSize: UInt = 0u,
    public var dwFlags: BpPaintparamsFlags = 0u,
    public var prcExclude: Rect? = null,
    public var pBlendFunction: Blendfunction? = null,
)

public data class ButtonImagelist(
    public var himl: Himagelist = 0L,
    public var margin: Rect = Rect(),
    public var uAlign: ButtonImagelistAlign = 0u,
)

public data class ButtonSplitinfo(
    public var mask: UInt = 0u,
    public var himlGlyph: Himagelist = 0L,
    public var uSplitStyle: UInt = 0u,
    public var size: Size = Size(),
)

public data class Ccinfoa(
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
    public var aStyleFlags: Ccstyleflaga? = null,
    public var lpfnStyle: Lpfnccstylea = null,
    public var lpfnSizeToText: Lpfnccsizetotexta = null,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccinfoa) return false
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

public data class Ccinfow(
    public var szClass: UShortArray = UShortArray(32),
    public var flOptions: UInt = 0u,
    public var szDesc: UShortArray = UShortArray(32),
    public var cxDefault: UInt = 0u,
    public var cyDefault: UInt = 0u,
    public var flStyleDefault: UInt = 0u,
    public var flExtStyleDefault: UInt = 0u,
    public var flCtrlTypeMask: UInt = 0u,
    public var cStyleFlags: Int = 0,
    public var aStyleFlags: Ccstyleflagw? = null,
    public var szTextDefault: UShortArray = UShortArray(256),
    public var lpfnStyle: Lpfnccstylew = null,
    public var lpfnSizeToText: Lpfnccsizetotextw = null,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccinfow) return false
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

public data class Ccstylea(
    public var flStyle: UInt = 0u,
    public var flExtStyle: UInt = 0u,
    public var szText: ByteArray = ByteArray(256),
    public var lgid: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccstylea) return false
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

public data class Ccstyleflaga(
    public var flStyle: UInt = 0u,
    public var flStyleMask: UInt = 0u,
    public var pszStyle: Pstr = null,
)

public data class Ccstyleflagw(
    public var flStyle: UInt = 0u,
    public var flStyleMask: UInt = 0u,
    public var pszStyle: Pwstr = null,
)

public data class Ccstylew(
    public var flStyle: UInt = 0u,
    public var flExtStyle: UInt = 0u,
    public var szText: UShortArray = UShortArray(256),
    public var lgid: UShort = 0u,
    public var wReserved1: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccstylew) return false
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

public data class Colormap(
    public var from: Colorref = 0u,
    public var to: Colorref = 0u,
)

public data class Colorscheme(
    public var dwSize: UInt = 0u,
    public var clrBtnHighlight: Colorref = 0u,
    public var clrBtnShadow: Colorref = 0u,
)

public data class Comboboxexitema(
    public var mask: ComboboxExItemFlags = 0u,
    public var iItem: Int = 0,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var iOverlay: Int = 0,
    public var iIndent: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Comboboxexitemw(
    public var mask: ComboboxExItemFlags = 0u,
    public var iItem: Int = 0,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var iOverlay: Int = 0,
    public var iIndent: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Comboboxinfo(
    public var cbSize: UInt = 0u,
    public var rcItem: Rect = Rect(),
    public var rcButton: Rect = Rect(),
    public var stateButton: ComboboxinfoButtonState = 0u,
    public var hwndCombo: Hwnd = null,
    public var hwndItem: Hwnd = null,
    public var hwndList: Hwnd = null,
)

public data class Compareitemstruct(
    public var ctlType: DrawitemstructCtlType = 0u,
    public var ctlID: UInt = 0u,
    public var hwndItem: Hwnd = null,
    public var itemID1: UInt = 0u,
    public var itemData1: Int = 0,
    public var itemID2: UInt = 0u,
    public var itemData2: Int = 0,
    public var dwLocaleId: UInt = 0u,
)

public data class Datetimepickerinfo(
    public var cbSize: UInt = 0u,
    public var rcCheck: Rect = Rect(),
    public var stateCheck: UInt = 0u,
    public var rcButton: Rect = Rect(),
    public var stateButton: UInt = 0u,
    public var hwndEdit: Hwnd = null,
    public var hwndUD: Hwnd = null,
    public var hwndDropDown: Hwnd = null,
)

public data class Deleteitemstruct(
    public var ctlType: DrawitemstructCtlType = 0u,
    public var ctlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var hwndItem: Hwnd = null,
    public var itemData: Int = 0,
)

public data class Dpastreaminfo(
    public var iPos: Int = 0,
    public var pvItem: COpaquePointer? = null,
)

public data class Draglistinfo(
    public var uNotification: DraglistinfoNotificationFlags = 0u,
    public var hWnd: Hwnd = null,
    public var ptCursor: Point = Point(),
)

public data class Drawitemstruct(
    public var ctlType: DrawitemstructCtlType = 0u,
    public var ctlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var itemAction: OdaFlags = 0u,
    public var itemState: OdsFlags = 0u,
    public var hwndItem: Hwnd = null,
    public var hDC: Hdc = null,
    public var rcItem: Rect = Rect(),
    public var itemData: Int = 0,
)

public data class Dtbgopts(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var rcClip: Rect = Rect(),
)

public data class Dttopts(
    public var dwSize: UInt = 0u,
    public var dwFlags: DttoptsFlags = 0u,
    public var crText: Colorref = 0u,
    public var crBorder: Colorref = 0u,
    public var crShadow: Colorref = 0u,
    public var iTextShadowType: Int = 0,
    public var ptShadowOffset: Point = Point(),
    public var iBorderSize: Int = 0,
    public var iFontPropId: Int = 0,
    public var iColorPropId: Int = 0,
    public var iStateId: Int = 0,
    public var fApplyOverlay: Bool = 0,
    public var iGlowSize: Int = 0,
    public var pfnDrawTextCallback: DttCallbackProc = null,
    public var lParam: Lparam = 0L,
)

public data class Editballoontip(
    public var cbStruct: UInt = 0u,
    public var pszTitle: Pcwstr = null,
    public var pszText: Pcwstr = null,
    public var ttiIcon: EditballoontipIcon = 0,
)

public data class Hdhittestinfo(
    public var pt: Point = Point(),
    public var flags: HeaderHittestInfoFlags = 0u,
    public var iItem: Int = 0,
)

public data class Hditema(
    public var mask: HdiMask = 0u,
    public var cxy: Int = 0,
    public var pszText: Pstr = null,
    public var hbm: Hbitmap = null,
    public var cchTextMax: Int = 0,
    public var fmt: HeaderControlFormatFlags = 0,
    public var lParam: Lparam = 0L,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var type: HeaderControlFormatType = 0u,
    public var pvFilter: COpaquePointer? = null,
    public var state: HeaderControlFormatState = 0u,
)

public data class Hditemw(
    public var mask: HdiMask = 0u,
    public var cxy: Int = 0,
    public var pszText: Pwstr = null,
    public var hbm: Hbitmap = null,
    public var cchTextMax: Int = 0,
    public var fmt: HeaderControlFormatFlags = 0,
    public var lParam: Lparam = 0L,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var type: HeaderControlFormatType = 0u,
    public var pvFilter: COpaquePointer? = null,
    public var state: HeaderControlFormatState = 0u,
)

public data class Hdlayout(
    public var prc: Rect? = null,
    public var pwpos: Windowpos? = null,
)

public data class HdTextfiltera(
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
)

public data class HdTextfilterw(
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
)

public data class Imageinfo(
    public var hbmImage: Hbitmap = null,
    public var hbmMask: Hbitmap = null,
    public var unused1: Int = 0,
    public var unused2: Int = 0,
    public var rcImage: Rect = Rect(),
)

public class Imagelistdrawparams(
    public var cbSize: UInt = 0u,
    public var himl: Himagelist = 0L,
    public var i: Int = 0,
    public var hdcDst: Hdc = null,
    public var x: Int = 0,
    public var y: Int = 0,
    public var cx: Int = 0,
    public var cy: Int = 0,
    public var xBitmap: Int = 0,
    public var yBitmap: Int = 0,
    public var rgbBk: Colorref = 0u,
    public var rgbFg: Colorref = 0u,
    public var fStyle: UInt = 0u,
    public var dwRop: UInt = 0u,
    public var fState: UInt = 0u,
    public var frame: UInt = 0u,
    public var crEffect: Colorref = 0u,
)

public data class Imageliststats(
    public var cbSize: UInt = 0u,
    public var cAlloc: Int = 0,
    public var cUsed: Int = 0,
    public var cStandby: Int = 0,
)

public data class Initcommoncontrolsex(
    public var dwSize: UInt = 0u,
    public var dwICC: InitcommoncontrolsexIcc = 0u,
)

public data class Intlist(
    public var iValueCount: Int = 0,
    public var iValues: IntArray = IntArray(402),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Intlist) return false
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

public data class Lhittestinfo(
    public var pt: Point = Point(),
    public var item: Litem = Litem(),
)

public data class Litem(
    public var mask: ListItemFlags = 0u,
    public var iLink: Int = 0,
    public var state: ListItemStateFlags = 0u,
    public var stateMask: ListItemStateFlags = 0u,
    public var szID: UShortArray = UShortArray(48),
    public var szUrl: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Litem) return false
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

public data class Lvbkimagea(
    public var ulFlags: ListViewBackgroundImageFlags = 0u,
    public var hbm: Hbitmap = null,
    public var pszImage: Pstr = null,
    public var cchImageMax: UInt = 0u,
    public var xOffsetPercent: Int = 0,
    public var yOffsetPercent: Int = 0,
)

public data class Lvbkimagew(
    public var ulFlags: ListViewBackgroundImageFlags = 0u,
    public var hbm: Hbitmap = null,
    public var pszImage: Pwstr = null,
    public var cchImageMax: UInt = 0u,
    public var xOffsetPercent: Int = 0,
    public var yOffsetPercent: Int = 0,
)

public data class Lvcolumna(
    public var mask: LvcolumnwMask = 0u,
    public var fmt: LvcolumnwFormat = 0,
    public var cx: Int = 0,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iSubItem: Int = 0,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var cxMin: Int = 0,
    public var cxDefault: Int = 0,
    public var cxIdeal: Int = 0,
)

public data class Lvcolumnw(
    public var mask: LvcolumnwMask = 0u,
    public var fmt: LvcolumnwFormat = 0,
    public var cx: Int = 0,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iSubItem: Int = 0,
    public var iImage: Int = 0,
    public var iOrder: Int = 0,
    public var cxMin: Int = 0,
    public var cxDefault: Int = 0,
    public var cxIdeal: Int = 0,
)

public data class Lvfindinfoa(
    public var flags: LvfindinfowFlags = 0u,
    public var psz: Pcstr = null,
    public var lParam: Lparam = 0L,
    public var pt: Point = Point(),
    public var vkDirection: UInt = 0u,
)

public data class Lvfindinfow(
    public var flags: LvfindinfowFlags = 0u,
    public var psz: Pcwstr = null,
    public var lParam: Lparam = 0L,
    public var pt: Point = Point(),
    public var vkDirection: UInt = 0u,
)

public data class Lvfooterinfo(
    public var mask: UInt = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var cItems: UInt = 0u,
)

public data class Lvfooteritem(
    public var mask: LvfooteritemMask = 0u,
    public var iItem: Int = 0,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var state: UInt = 0u,
    public var stateMask: UInt = 0u,
)

public class Lvgroup(
    public var cbSize: UInt = 0u,
    public var mask: LvgroupMask = 0u,
    public var pszHeader: Pwstr = null,
    public var cchHeader: Int = 0,
    public var pszFooter: Pwstr = null,
    public var cchFooter: Int = 0,
    public var iGroupId: Int = 0,
    public var stateMask: ListViewGroupStateFlags = 0u,
    public var state: ListViewGroupStateFlags = 0u,
    public var uAlign: ListViewGroupAlignFlags = 0u,
    public var pszSubtitle: Pwstr = null,
    public var cchSubtitle: UInt = 0u,
    public var pszTask: Pwstr = null,
    public var cchTask: UInt = 0u,
    public var pszDescriptionTop: Pwstr = null,
    public var cchDescriptionTop: UInt = 0u,
    public var pszDescriptionBottom: Pwstr = null,
    public var cchDescriptionBottom: UInt = 0u,
    public var iTitleImage: Int = 0,
    public var iExtendedImage: Int = 0,
    public var iFirstItem: Int = 0,
    public var cItems: UInt = 0u,
    public var pszSubsetTitle: Pwstr = null,
    public var cchSubsetTitle: UInt = 0u,
)

public data class Lvgroupmetrics(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var left: UInt = 0u,
    public var top: UInt = 0u,
    public var right: UInt = 0u,
    public var bottom: UInt = 0u,
    public var crLeft: Colorref = 0u,
    public var crTop: Colorref = 0u,
    public var crRight: Colorref = 0u,
    public var crBottom: Colorref = 0u,
    public var crHeader: Colorref = 0u,
    public var crFooter: Colorref = 0u,
)

public data class Lvhittestinfo(
    public var pt: Point = Point(),
    public var flags: LvhittestinfoFlags = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var iGroup: Int = 0,
)

public data class Lvinsertgroupsorted(
    public var pfnGroupCompare: Pfnlvgroupcompare = null,
    public var pvData: COpaquePointer? = null,
    public var lvGroup: Lvgroup = Lvgroup(),
)

public data class Lvinsertmark(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iItem: Int = 0,
    public var dwReserved: UInt = 0u,
)

public data class Lvitema(
    public var mask: ListViewItemFlags = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var state: ListViewItemStateFlags = 0u,
    public var stateMask: ListViewItemStateFlags = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: Lparam = 0L,
    public var iIndent: Int = 0,
    public var iGroupId: Int = 0,
    public var cColumns: UInt = 0u,
    public var puColumns: UInt? = null,
    public var piColFmt: Int? = null,
    public var iGroup: Int = 0,
)

public data class Lvitemindex(
    public var iItem: Int = 0,
    public var iGroup: Int = 0,
)

public data class Lvitemw(
    public var mask: ListViewItemFlags = 0u,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var state: ListViewItemStateFlags = 0u,
    public var stateMask: ListViewItemStateFlags = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: Lparam = 0L,
    public var iIndent: Int = 0,
    public var iGroupId: Int = 0,
    public var cColumns: UInt = 0u,
    public var puColumns: UInt? = null,
    public var piColFmt: Int? = null,
    public var iGroup: Int = 0,
)

public data class Lvsetinfotip(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pszText: Pwstr = null,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
)

public data class Lvtileinfo(
    public var cbSize: UInt = 0u,
    public var iItem: Int = 0,
    public var cColumns: UInt = 0u,
    public var puColumns: UInt? = null,
    public var piColFmt: Int? = null,
)

public data class Lvtileviewinfo(
    public var cbSize: UInt = 0u,
    public var dwMask: LvtileviewinfoMask = 0u,
    public var dwFlags: LvtileviewinfoFlags = 0u,
    public var sizeTile: Size = Size(),
    public var cLines: Int = 0,
    public var rcLabelMargin: Rect = Rect(),
)

public data class Margins(
    public var cxLeftWidth: Int = 0,
    public var cxRightWidth: Int = 0,
    public var cyTopHeight: Int = 0,
    public var cyBottomHeight: Int = 0,
)

public data class Mcgridinfo(
    public var cbSize: UInt = 0u,
    public var dwPart: McgridinfoPart = 0u,
    public var dwFlags: McgridinfoFlags = 0u,
    public var iCalendar: Int = 0,
    public var iRow: Int = 0,
    public var iCol: Int = 0,
    public var bSelected: Bool = 0,
    public var stStart: Systemtime = Systemtime(),
    public var stEnd: Systemtime = Systemtime(),
    public var rc: Rect = Rect(),
    public var pszName: Pwstr = null,
    public var cchName: Int = 0,
)

public data class Mchittestinfo(
    public var cbSize: UInt = 0u,
    public var pt: Point = Point(),
    public var uHit: MchittestinfoHitFlags = 0u,
    public var st: Systemtime = Systemtime(),
    public var rc: Rect = Rect(),
    public var iOffset: Int = 0,
    public var iRow: Int = 0,
    public var iCol: Int = 0,
)

public data class Measureitemstruct(
    public var ctlType: DrawitemstructCtlType = 0u,
    public var ctlID: UInt = 0u,
    public var itemID: UInt = 0u,
    public var itemWidth: UInt = 0u,
    public var itemHeight: UInt = 0u,
    public var itemData: Int = 0,
)

public data class Nmbcdropdown(
    public var hdr: Nmhdr = Nmhdr(),
    public var rcButton: Rect = Rect(),
)

public data class Nmbchotitem(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmtbhotitemFlags = 0u,
)

public data class Nmcbedragbegina(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItemid: Int = 0,
    public var szText: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbedragbegina) return false
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

public data class Nmcbedragbeginw(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItemid: Int = 0,
    public var szText: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbedragbeginw) return false
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

public data class Nmcbeendedita(
    public var hdr: Nmhdr = Nmhdr(),
    public var fChanged: Bool = 0,
    public var iNewSelection: Int = 0,
    public var szText: ByteArray = ByteArray(260),
    public var iWhy: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbeendedita) return false
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

public data class Nmcbeendeditw(
    public var hdr: Nmhdr = Nmhdr(),
    public var fChanged: Bool = 0,
    public var iNewSelection: Int = 0,
    public var szText: UShortArray = UShortArray(260),
    public var iWhy: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmcbeendeditw) return false
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

public data class Nmchar(
    public var hdr: Nmhdr = Nmhdr(),
    public var ch: UInt = 0u,
    public var dwItemPrev: UInt = 0u,
    public var dwItemNext: UInt = 0u,
)

public data class Nmcomboboxexa(
    public var hdr: Nmhdr = Nmhdr(),
    public var ceItem: Comboboxexitema = Comboboxexitema(),
)

public data class Nmcomboboxexw(
    public var hdr: Nmhdr = Nmhdr(),
    public var ceItem: Comboboxexitemw = Comboboxexitemw(),
)

public data class Nmcustomdraw(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwDrawStage: NmcustomdrawDrawStage = 0u,
    public var hdc: Hdc = null,
    public var rc: Rect = Rect(),
    public var dwItemSpec: Int = 0,
    public var uItemState: NmcustomdrawDrawStateFlags = 0u,
    public var lItemlParam: Lparam = 0L,
)

public data class Nmcustomsplitrectinfo(
    public var hdr: Nmhdr = Nmhdr(),
    public var rcClient: Rect = Rect(),
    public var rcButton: Rect = Rect(),
    public var rcSplit: Rect = Rect(),
)

public data class Nmcustomtext(
    public var hdr: Nmhdr = Nmhdr(),
    public var hDC: Hdc = null,
    public var lpString: Pcwstr = null,
    public var nCount: Int = 0,
    public var lpRect: Rect? = null,
    public var uFormat: UInt = 0u,
    public var fLink: Bool = 0,
)

public data class Nmdatetimechange(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmdatetimechangeFlags = 0u,
    public var st: Systemtime = Systemtime(),
)

public data class Nmdatetimeformata(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var pszFormat: Pcstr = null,
    public var st: Systemtime = Systemtime(),
    public var pszDisplay: Pcstr = null,
    public var szDisplay: ByteArray = ByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimeformata) return false
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

public data class Nmdatetimeformatquerya(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var pszFormat: Pcstr = null,
    public var szMax: Size = Size(),
)

public data class Nmdatetimeformatqueryw(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var pszFormat: Pcwstr = null,
    public var szMax: Size = Size(),
)

public data class Nmdatetimeformatw(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var pszFormat: Pcwstr = null,
    public var st: Systemtime = Systemtime(),
    public var pszDisplay: Pcwstr = null,
    public var szDisplay: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmdatetimeformatw) return false
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

public data class Nmdatetimestringa(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var pszUserString: Pcstr = null,
    public var st: Systemtime = Systemtime(),
    public var dwFlags: UInt = 0u,
)

public data class Nmdatetimestringw(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var pszUserString: Pcwstr = null,
    public var st: Systemtime = Systemtime(),
    public var dwFlags: UInt = 0u,
)

public data class Nmdatetimewmkeydowna(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var nVirtKey: Int = 0,
    public var pszFormat: Pcstr = null,
    public var st: Systemtime = Systemtime(),
)

public data class Nmdatetimewmkeydownw(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var nVirtKey: Int = 0,
    public var pszFormat: Pcwstr = null,
    public var st: Systemtime = Systemtime(),
)

public data class Nmdaystate(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var stStart: Systemtime = Systemtime(),
    public var cDayState: Int = 0,
    public var prgDayState: UInt? = null,
)

public data class Nmhddispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var mask: HdiMask = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmhddispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var mask: HdiMask = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmhdfilterbtnclick(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var rc: Rect = Rect(),
)

public data class Nmhdr(
    public var hwndFrom: Hwnd = null,
    public var idFrom: Int = 0,
    public var code: UInt = 0u,
)

public data class Nmheadera(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var iButton: HeaderControlNotificationButton = 0,
    public var pitem: Hditema? = null,
)

public data class Nmheaderw(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var iButton: HeaderControlNotificationButton = 0,
    public var pitem: Hditemw? = null,
)

public data class Nmipaddress(
    public var hdr: Nmhdr = Nmhdr(),
    public var iField: Int = 0,
    public var iValue: Int = 0,
)

public data class Nmitemactivate(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var uNewState: UInt = 0u,
    public var uOldState: UInt = 0u,
    public var uChanged: UInt = 0u,
    public var ptAction: Point = Point(),
    public var lParam: Lparam = 0L,
    public var uKeyFlags: UInt = 0u,
)

public data class Nmkey(
    public var hdr: Nmhdr = Nmhdr(),
    public var nVKey: UInt = 0u,
    public var uFlags: UInt = 0u,
)

public data class Nmlink(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Litem = Litem(),
)

public data class Nmlistview(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var uNewState: UInt = 0u,
    public var uOldState: UInt = 0u,
    public var uChanged: ListViewItemFlags = 0u,
    public var ptAction: Point = Point(),
    public var lParam: Lparam = 0L,
)

public data class Nmlvcachehint(
    public var hdr: Nmhdr = Nmhdr(),
    public var iFrom: Int = 0,
    public var iTo: Int = 0,
)

public data class Nmlvcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var clrText: Colorref = 0u,
    public var clrTextBk: Colorref = 0u,
    public var iSubItem: Int = 0,
    public var dwItemType: NmlvcustomdrawItemType = 0u,
    public var clrFace: Colorref = 0u,
    public var iIconEffect: Int = 0,
    public var iIconPhase: Int = 0,
    public var iPartId: Int = 0,
    public var iStateId: Int = 0,
    public var rcText: Rect = Rect(),
    public var uAlign: ListViewGroupAlignFlags = 0u,
)

public data class Nmlvdispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Lvitema = Lvitema(),
)

public data class Nmlvdispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Lvitemw = Lvitemw(),
)

public data class Nmlvemptymarkup(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmlvemptymarkupFlags = 0u,
    public var szMarkup: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmlvemptymarkup) return false
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

public data class Nmlvfinditema(
    public var hdr: Nmhdr = Nmhdr(),
    public var iStart: Int = 0,
    public var lvfi: Lvfindinfoa = Lvfindinfoa(),
)

public data class Nmlvfinditemw(
    public var hdr: Nmhdr = Nmhdr(),
    public var iStart: Int = 0,
    public var lvfi: Lvfindinfow = Lvfindinfow(),
)

public data class Nmlvgetinfotipa(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmlvgetinfotipFlags = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmlvgetinfotipw(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlags: NmlvgetinfotipFlags = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmlvkeydown(
    public var hdr: Nmhdr = Nmhdr(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class Nmlvlink(
    public var hdr: Nmhdr = Nmhdr(),
    public var link: Litem = Litem(),
    public var iItem: Int = 0,
    public var iSubItem: Int = 0,
)

public data class Nmlvodstatechange(
    public var hdr: Nmhdr = Nmhdr(),
    public var iFrom: Int = 0,
    public var iTo: Int = 0,
    public var uNewState: ListViewItemStateFlags = 0u,
    public var uOldState: ListViewItemStateFlags = 0u,
)

public data class Nmlvscroll(
    public var hdr: Nmhdr = Nmhdr(),
    public var dx: Int = 0,
    public var dy: Int = 0,
)

public data class Nmmouse(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwItemSpec: Int = 0,
    public var dwItemData: Int = 0,
    public var pt: Point = Point(),
    public var dwHitInfo: Lparam = 0L,
)

public data class Nmobjectnotify(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var piid: Guid? = null,
    public var pObject: COpaquePointer? = null,
    public var hResult: Hresult = 0,
    public var dwFlags: UInt = 0u,
)

public data class Nmpgcalcsize(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwFlag: NmpgcalcsizeFlags = 0u,
    public var iWidth: Int = 0,
    public var iHeight: Int = 0,
)

public data class Nmpghotitem(
    public var hdr: Nmhdr = Nmhdr(),
    public var idOld: Int = 0,
    public var idNew: Int = 0,
    public var dwFlags: UInt = 0u,
)

public data class Nmpgscroll(
    public var hdr: Nmhdr = Nmhdr(),
    public var fwKeys: NmpgscrollKeys = 0u,
    public var rcParent: Rect = Rect(),
    public var iDir: NmpgscrollDir = 0,
    public var iXpos: Int = 0,
    public var iYpos: Int = 0,
    public var iScroll: Int = 0,
)

public data class Nmrbautosize(
    public var hdr: Nmhdr = Nmhdr(),
    public var fChanged: Bool = 0,
    public var rcTarget: Rect = Rect(),
    public var rcActual: Rect = Rect(),
)

public data class Nmrebar(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwMask: NmrebarMaskFlags = 0u,
    public var uBand: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: Lparam = 0L,
)

public data class Nmrebarautobreak(
    public var hdr: Nmhdr = Nmhdr(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var uMsg: UInt = 0u,
    public var fStyleCurrent: UInt = 0u,
    public var fAutoBreak: Bool = 0,
)

public data class Nmrebarchevron(
    public var hdr: Nmhdr = Nmhdr(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var rc: Rect = Rect(),
    public var lParamNM: Lparam = 0L,
)

public data class Nmrebarchildsize(
    public var hdr: Nmhdr = Nmhdr(),
    public var uBand: UInt = 0u,
    public var wID: UInt = 0u,
    public var rcChild: Rect = Rect(),
    public var rcBand: Rect = Rect(),
)

public data class Nmrebarsplitter(
    public var hdr: Nmhdr = Nmhdr(),
    public var rcSizing: Rect = Rect(),
)

public data class Nmsearchweb(
    public var hdr: Nmhdr = Nmhdr(),
    public var entrypoint: EcSearchwebEntrypoint = 0,
    public var hasQueryText: Bool = 0,
    public var invokeSucceeded: Bool = 0,
)

public data class Nmselchange(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var stSelStart: Systemtime = Systemtime(),
    public var stSelEnd: Systemtime = Systemtime(),
)

public data class Nmtbcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var hbrMonoDither: Hbrush = null,
    public var hbrLines: Hbrush = null,
    public var hpenLines: Hpen = null,
    public var clrText: Colorref = 0u,
    public var clrMark: Colorref = 0u,
    public var clrTextHighlight: Colorref = 0u,
    public var clrBtnFace: Colorref = 0u,
    public var clrBtnHighlight: Colorref = 0u,
    public var clrHighlightHotTrack: Colorref = 0u,
    public var rcText: Rect = Rect(),
    public var nStringBkMode: Int = 0,
    public var nHLStringBkMode: Int = 0,
    public var iListGap: Int = 0,
)

public data class Nmtbdispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwMask: NmtbdispinfowMask = 0u,
    public var idCommand: Int = 0,
    public var lParam: Int = 0,
    public var iImage: Int = 0,
    public var pszText: Pstr = null,
    public var cchText: Int = 0,
)

public data class Nmtbdispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwMask: NmtbdispinfowMask = 0u,
    public var idCommand: Int = 0,
    public var lParam: Int = 0,
    public var iImage: Int = 0,
    public var pszText: Pwstr = null,
    public var cchText: Int = 0,
)

public data class Nmtbgetinfotipa(
    public var hdr: Nmhdr = Nmhdr(),
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmtbgetinfotipw(
    public var hdr: Nmhdr = Nmhdr(),
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iItem: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmtbhotitem(
    public var hdr: Nmhdr = Nmhdr(),
    public var idOld: Int = 0,
    public var idNew: Int = 0,
    public var dwFlags: NmtbhotitemFlags = 0u,
)

public data class Nmtbrestore(
    public var hdr: Nmhdr = Nmhdr(),
    public var pData: UInt? = null,
    public var pCurrent: UInt? = null,
    public var cbData: UInt = 0u,
    public var iItem: Int = 0,
    public var cButtons: Int = 0,
    public var cbBytesPerRecord: Int = 0,
    public var tbButton: Tbbutton = Tbbutton(),
)

public data class Nmtbsave(
    public var hdr: Nmhdr = Nmhdr(),
    public var pData: UInt? = null,
    public var pCurrent: UInt? = null,
    public var cbData: UInt = 0u,
    public var iItem: Int = 0,
    public var cButtons: Int = 0,
    public var tbButton: Tbbutton = Tbbutton(),
)

public data class Nmtckeydown(
    public var hdr: Nmhdr = Nmhdr(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class Nmtoolbara(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var tbButton: Tbbutton = Tbbutton(),
    public var cchText: Int = 0,
    public var pszText: Pstr = null,
    public var rcButton: Rect = Rect(),
)

public data class Nmtoolbarw(
    public var hdr: Nmhdr = Nmhdr(),
    public var iItem: Int = 0,
    public var tbButton: Tbbutton = Tbbutton(),
    public var cchText: Int = 0,
    public var pszText: Pwstr = null,
    public var rcButton: Rect = Rect(),
)

public data class Nmtooltipscreated(
    public var hdr: Nmhdr = Nmhdr(),
    public var hwndToolTips: Hwnd = null,
)

public data class Nmtrbthumbposchanging(
    public var hdr: Nmhdr = Nmhdr(),
    public var dwPos: UInt = 0u,
    public var nReason: Int = 0,
)

public data class Nmtreeviewa(
    public var hdr: Nmhdr = Nmhdr(),
    public var action: NmTreeviewAction = 0u,
    public var itemOld: Tvitema = Tvitema(),
    public var itemNew: Tvitema = Tvitema(),
    public var ptDrag: Point = Point(),
)

public data class Nmtreevieww(
    public var hdr: Nmhdr = Nmhdr(),
    public var action: NmTreeviewAction = 0u,
    public var itemOld: Tvitemw = Tvitemw(),
    public var itemNew: Tvitemw = Tvitemw(),
    public var ptDrag: Point = Point(),
)

public data class Nmttcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var uDrawFlags: UInt = 0u,
)

public data class Nmttdispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var lpszText: Pstr = null,
    public var szText: ByteArray = ByteArray(80),
    public var hinst: Hinstance = null,
    public var uFlags: TooltipFlags = 0u,
    public var lParam: Lparam = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmttdispinfoa) return false
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

public data class Nmttdispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var lpszText: Pwstr = null,
    public var szText: UShortArray = UShortArray(80),
    public var hinst: Hinstance = null,
    public var uFlags: TooltipFlags = 0u,
    public var lParam: Lparam = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nmttdispinfow) return false
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

public data class Nmtvasyncdraw(
    public var hdr: Nmhdr = Nmhdr(),
    public var pimldp: Imagelistdrawparams? = null,
    public var hr: Hresult = 0,
    public var hItem: Htreeitem = 0,
    public var lParam: Lparam = 0L,
    public var dwRetFlags: UInt = 0u,
    public var iRetImageIndex: Int = 0,
)

public data class Nmtvcustomdraw(
    public var nmcd: Nmcustomdraw = Nmcustomdraw(),
    public var clrText: Colorref = 0u,
    public var clrTextBk: Colorref = 0u,
    public var iLevel: Int = 0,
)

public data class Nmtvdispinfoa(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitema = Tvitema(),
)

public data class Nmtvdispinfoexa(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitemexa = Tvitemexa(),
)

public data class Nmtvdispinfoexw(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitemexw = Tvitemexw(),
)

public data class Nmtvdispinfow(
    public var hdr: Nmhdr = Nmhdr(),
    public var item: Tvitemw = Tvitemw(),
)

public data class Nmtvgetinfotipa(
    public var hdr: Nmhdr = Nmhdr(),
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var hItem: Htreeitem = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmtvgetinfotipw(
    public var hdr: Nmhdr = Nmhdr(),
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var hItem: Htreeitem = 0,
    public var lParam: Lparam = 0L,
)

public data class Nmtvitemchange(
    public var hdr: Nmhdr = Nmhdr(),
    public var uChanged: UInt = 0u,
    public var hItem: Htreeitem = 0,
    public var uStateNew: UInt = 0u,
    public var uStateOld: UInt = 0u,
    public var lParam: Lparam = 0L,
)

public data class Nmtvkeydown(
    public var hdr: Nmhdr = Nmhdr(),
    public var wVKey: UShort = 0u,
    public var flags: UInt = 0u,
)

public data class Nmtvstateimagechanging(
    public var hdr: Nmhdr = Nmhdr(),
    public var hti: Htreeitem = 0,
    public var iOldStateImageIndex: Int = 0,
    public var iNewStateImageIndex: Int = 0,
)

public data class Nmupdown(
    public var hdr: Nmhdr = Nmhdr(),
    public var iPos: Int = 0,
    public var iDelta: Int = 0,
)

public data class Nmviewchange(
    public var nmhdr: Nmhdr = Nmhdr(),
    public var dwOldView: MonthCaldendarMessagesView = 0u,
    public var dwNewView: MonthCaldendarMessagesView = 0u,
)

public data class Pbrange(
    public var iLow: Int = 0,
    public var iHigh: Int = 0,
)

public data class PointerDeviceCursorInfo(
    public var cursorId: UInt = 0u,
    public var cursor: PointerDeviceCursorType = 0,
)

public data class PointerDeviceInfo(
    public var displayOrientation: UInt = 0u,
    public var device: Handle = null,
    public var pointerDeviceType: PointerDeviceType = 0,
    public var monitor: Hmonitor = null,
    public var startingCursorId: UInt = 0u,
    public var maxActiveContacts: UShort = 0u,
    public var productString: UShortArray = UShortArray(520),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PointerDeviceInfo) return false
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

public data class PointerDeviceProperty(
    public var logicalMin: Int = 0,
    public var logicalMax: Int = 0,
    public var physicalMin: Int = 0,
    public var physicalMax: Int = 0,
    public var unit: UInt = 0u,
    public var unitExponent: UInt = 0u,
    public var usagePageId: UShort = 0u,
    public var usageId: UShort = 0u,
)

public data class PointerTypeInfo(
    public var type: PointerInputType = 0,
    public var anonymous: PointerTypeInfo0 = PointerTypeInfo0(),
)

public data class PointerTypeInfo0(
    public var touchInfo: PointerTouchInfo = PointerTouchInfo(),
    public var penInfo: PointerPenInfo = PointerPenInfo(),
)

public data class PropsheetheaderaV1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetheaderaV10 = PropsheetheaderaV10(),
    public var pszCaption: Pcstr = null,
    public var nPages: UInt = 0u,
    public var anonymous2: PropsheetheaderaV11 = PropsheetheaderaV11(),
    public var anonymous3: PropsheetheaderaV12 = PropsheetheaderaV12(),
    public var pfnCallback: Pfnpropsheetcallback = null,
)

public data class PropsheetheaderaV10(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcstr = null,
)

public data class PropsheetheaderaV11(
    public var nStartPage: UInt = 0u,
    public var pStartPage: Pcstr = null,
)

public data class PropsheetheaderaV12(
    public var ppsp: Propsheetpagea? = null,
    public var phpage: COpaquePointer? = null,
)

public data class PropsheetheaderaV2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetheaderaV20 = PropsheetheaderaV20(),
    public var pszCaption: Pcstr = null,
    public var nPages: UInt = 0u,
    public var anonymous2: PropsheetheaderaV21 = PropsheetheaderaV21(),
    public var anonymous3: PropsheetheaderaV22 = PropsheetheaderaV22(),
    public var pfnCallback: Pfnpropsheetcallback = null,
    public var anonymous4: PropsheetheaderaV23 = PropsheetheaderaV23(),
    public var hplWatermark: Hpalette = null,
    public var anonymous5: PropsheetheaderaV24 = PropsheetheaderaV24(),
)

public data class PropsheetheaderaV20(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcstr = null,
)

public data class PropsheetheaderaV21(
    public var nStartPage: UInt = 0u,
    public var pStartPage: Pcstr = null,
)

public data class PropsheetheaderaV22(
    public var ppsp: Propsheetpagea? = null,
    public var phpage: COpaquePointer? = null,
)

public data class PropsheetheaderaV23(
    public var hbmWatermark: Hbitmap = null,
    public var pszbmWatermark: Pcstr = null,
)

public data class PropsheetheaderaV24(
    public var hbmHeader: Hbitmap = null,
    public var pszbmHeader: Pcstr = null,
)

public data class PropsheetheaderwV1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetheaderwV10 = PropsheetheaderwV10(),
    public var pszCaption: Pcwstr = null,
    public var nPages: UInt = 0u,
    public var anonymous2: PropsheetheaderwV11 = PropsheetheaderwV11(),
    public var anonymous3: PropsheetheaderwV12 = PropsheetheaderwV12(),
    public var pfnCallback: Pfnpropsheetcallback = null,
)

public data class PropsheetheaderwV10(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcwstr = null,
)

public data class PropsheetheaderwV11(
    public var nStartPage: UInt = 0u,
    public var pStartPage: Pcwstr = null,
)

public data class PropsheetheaderwV12(
    public var ppsp: Propsheetpagew? = null,
    public var phpage: COpaquePointer? = null,
)

public data class PropsheetheaderwV2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetheaderwV20 = PropsheetheaderwV20(),
    public var pszCaption: Pcwstr = null,
    public var nPages: UInt = 0u,
    public var anonymous2: PropsheetheaderwV21 = PropsheetheaderwV21(),
    public var anonymous3: PropsheetheaderwV22 = PropsheetheaderwV22(),
    public var pfnCallback: Pfnpropsheetcallback = null,
    public var anonymous4: PropsheetheaderwV23 = PropsheetheaderwV23(),
    public var hplWatermark: Hpalette = null,
    public var anonymous5: PropsheetheaderwV24 = PropsheetheaderwV24(),
)

public data class PropsheetheaderwV20(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcwstr = null,
)

public data class PropsheetheaderwV21(
    public var nStartPage: UInt = 0u,
    public var pStartPage: Pcwstr = null,
)

public data class PropsheetheaderwV22(
    public var ppsp: Propsheetpagew? = null,
    public var phpage: COpaquePointer? = null,
)

public data class PropsheetheaderwV23(
    public var hbmWatermark: Hbitmap = null,
    public var pszbmWatermark: Pcwstr = null,
)

public data class PropsheetheaderwV24(
    public var hbmHeader: Hbitmap = null,
    public var pszbmHeader: Pcwstr = null,
)

public data class Propsheetpagea(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: Propsheetpagea0 = Propsheetpagea0(),
    public var anonymous2: Propsheetpagea1 = Propsheetpagea1(),
    public var pszTitle: Pcstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbacka = null,
    public var pcRefParent: UInt? = null,
    public var pszHeaderTitle: Pcstr = null,
    public var pszHeaderSubTitle: Pcstr = null,
    public var hActCtx: Handle = null,
    public var anonymous3: Propsheetpagea2 = Propsheetpagea2(),
)

public data class Propsheetpagea0(
    public var pszTemplate: Pcstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class Propsheetpagea1(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcstr = null,
)

public data class Propsheetpagea2(
    public var hbmHeader: Hbitmap = null,
    public var pszbmHeader: Pcstr = null,
)

public data class PropsheetpageaV1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetpageaV10 = PropsheetpageaV10(),
    public var anonymous2: PropsheetpageaV11 = PropsheetpageaV11(),
    public var pszTitle: Pcstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbacka = null,
    public var pcRefParent: UInt? = null,
)

public data class PropsheetpageaV10(
    public var pszTemplate: Pcstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class PropsheetpageaV11(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcstr = null,
)

public data class PropsheetpageaV2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetpageaV20 = PropsheetpageaV20(),
    public var anonymous2: PropsheetpageaV21 = PropsheetpageaV21(),
    public var pszTitle: Pcstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbacka = null,
    public var pcRefParent: UInt? = null,
    public var pszHeaderTitle: Pcstr = null,
    public var pszHeaderSubTitle: Pcstr = null,
)

public data class PropsheetpageaV20(
    public var pszTemplate: Pcstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class PropsheetpageaV21(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcstr = null,
)

public data class PropsheetpageaV3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetpageaV30 = PropsheetpageaV30(),
    public var anonymous2: PropsheetpageaV31 = PropsheetpageaV31(),
    public var pszTitle: Pcstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbacka = null,
    public var pcRefParent: UInt? = null,
    public var pszHeaderTitle: Pcstr = null,
    public var pszHeaderSubTitle: Pcstr = null,
    public var hActCtx: Handle = null,
)

public data class PropsheetpageaV30(
    public var pszTemplate: Pcstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class PropsheetpageaV31(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcstr = null,
)

public data class Propsheetpagew(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: Propsheetpagew0 = Propsheetpagew0(),
    public var anonymous2: Propsheetpagew1 = Propsheetpagew1(),
    public var pszTitle: Pcwstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbackw = null,
    public var pcRefParent: UInt? = null,
    public var pszHeaderTitle: Pcwstr = null,
    public var pszHeaderSubTitle: Pcwstr = null,
    public var hActCtx: Handle = null,
    public var anonymous3: Propsheetpagew2 = Propsheetpagew2(),
)

public data class Propsheetpagew0(
    public var pszTemplate: Pcwstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class Propsheetpagew1(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcwstr = null,
)

public data class Propsheetpagew2(
    public var hbmHeader: Hbitmap = null,
    public var pszbmHeader: Pcwstr = null,
)

public data class PropsheetpagewV1(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetpagewV10 = PropsheetpagewV10(),
    public var anonymous2: PropsheetpagewV11 = PropsheetpagewV11(),
    public var pszTitle: Pcwstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbackw = null,
    public var pcRefParent: UInt? = null,
)

public data class PropsheetpagewV10(
    public var pszTemplate: Pcwstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class PropsheetpagewV11(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcwstr = null,
)

public data class PropsheetpagewV2(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetpagewV20 = PropsheetpagewV20(),
    public var anonymous2: PropsheetpagewV21 = PropsheetpagewV21(),
    public var pszTitle: Pcwstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbackw = null,
    public var pcRefParent: UInt? = null,
    public var pszHeaderTitle: Pcwstr = null,
    public var pszHeaderSubTitle: Pcwstr = null,
)

public data class PropsheetpagewV20(
    public var pszTemplate: Pcwstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class PropsheetpagewV21(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcwstr = null,
)

public data class PropsheetpagewV3(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var anonymous1: PropsheetpagewV30 = PropsheetpagewV30(),
    public var anonymous2: PropsheetpagewV31 = PropsheetpagewV31(),
    public var pszTitle: Pcwstr = null,
    public var pfnDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var pfnCallback: Lpfnpspcallbackw = null,
    public var pcRefParent: UInt? = null,
    public var pszHeaderTitle: Pcwstr = null,
    public var pszHeaderSubTitle: Pcwstr = null,
    public var hActCtx: Handle = null,
)

public data class PropsheetpagewV30(
    public var pszTemplate: Pcwstr = null,
    public var pResource: Dlgtemplate? = null,
)

public data class PropsheetpagewV31(
    public var hIcon: Hicon = null,
    public var pszIcon: Pcwstr = null,
)

public data class Pshnotify(
    public var hdr: Nmhdr = Nmhdr(),
    public var lParam: Lparam = 0L,
)

public data class Rbhittestinfo(
    public var pt: Point = Point(),
    public var flags: UInt = 0u,
    public var iBand: Int = 0,
)

public class Rebarbandinfoa(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var clrFore: Colorref = 0u,
    public var clrBack: Colorref = 0u,
    public var lpText: Pstr = null,
    public var cch: UInt = 0u,
    public var iImage: Int = 0,
    public var hwndChild: Hwnd = null,
    public var cxMinChild: UInt = 0u,
    public var cyMinChild: UInt = 0u,
    public var cx: UInt = 0u,
    public var hbmBack: Hbitmap = null,
    public var wID: UInt = 0u,
    public var cyChild: UInt = 0u,
    public var cyMaxChild: UInt = 0u,
    public var cyIntegral: UInt = 0u,
    public var cxIdeal: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var cxHeader: UInt = 0u,
    public var rcChevronLocation: Rect = Rect(),
    public var uChevronState: UInt = 0u,
)

public class Rebarbandinfow(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var fStyle: UInt = 0u,
    public var clrFore: Colorref = 0u,
    public var clrBack: Colorref = 0u,
    public var lpText: Pwstr = null,
    public var cch: UInt = 0u,
    public var iImage: Int = 0,
    public var hwndChild: Hwnd = null,
    public var cxMinChild: UInt = 0u,
    public var cyMinChild: UInt = 0u,
    public var cx: UInt = 0u,
    public var hbmBack: Hbitmap = null,
    public var wID: UInt = 0u,
    public var cyChild: UInt = 0u,
    public var cyMaxChild: UInt = 0u,
    public var cyIntegral: UInt = 0u,
    public var cxIdeal: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var cxHeader: UInt = 0u,
    public var rcChevronLocation: Rect = Rect(),
    public var uChevronState: UInt = 0u,
)

public data class Rebarinfo(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var himl: Himagelist = 0L,
)

public class Taskdialogconfig(
    public var cbSize: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var hInstance: Hinstance = null,
    public var dwFlags: TaskdialogFlags = 0,
    public var dwCommonButtons: TaskdialogCommonButtonFlags = 0,
    public var pszWindowTitle: Pcwstr = null,
    public var anonymous1: Taskdialogconfig0 = Taskdialogconfig0(),
    public var pszMainInstruction: Pcwstr = null,
    public var pszContent: Pcwstr = null,
    public var cButtons: UInt = 0u,
    public var pButtons: TaskdialogButton? = null,
    public var nDefaultButton: Int = 0,
    public var cRadioButtons: UInt = 0u,
    public var pRadioButtons: TaskdialogButton? = null,
    public var nDefaultRadioButton: Int = 0,
    public var pszVerificationText: Pcwstr = null,
    public var pszExpandedInformation: Pcwstr = null,
    public var pszExpandedControlText: Pcwstr = null,
    public var pszCollapsedControlText: Pcwstr = null,
    public var anonymous2: Taskdialogconfig1 = Taskdialogconfig1(),
    public var pszFooter: Pcwstr = null,
    public var pfCallback: Pftaskdialogcallback = null,
    public var lpCallbackData: Int = 0,
    public var cxWidth: UInt = 0u,
)

public data class Taskdialogconfig0(
    public var hMainIcon: Hicon = null,
    public var pszMainIcon: Pcwstr = null,
)

public data class Taskdialogconfig1(
    public var hFooterIcon: Hicon = null,
    public var pszFooterIcon: Pcwstr = null,
)

public data class TaskdialogButton(
    public var nButtonID: Int = 0,
    public var pszButtonText: Pcwstr = null,
)

public data class TaCubicBezier(
    public var header: TaTimingfunction = TaTimingfunction(),
    public var rX0: Float = 0.0f,
    public var rY0: Float = 0.0f,
    public var rX1: Float = 0.0f,
    public var rY1: Float = 0.0f,
)

public data class TaTimingfunction(
    public var eTimingFunctionType: TaTimingfunctionType = 0,
)

public data class TaTransform(
    public var eTransformType: TaTransformType = 0,
    public var dwTimingFunctionId: UInt = 0u,
    public var dwStartTime: UInt = 0u,
    public var dwDurationTime: UInt = 0u,
    public var eFlags: TaTransformFlag = 0,
)

public data class TaTransform2d(
    public var header: TaTransform = TaTransform(),
    public var rX: Float = 0.0f,
    public var rY: Float = 0.0f,
    public var rInitialX: Float = 0.0f,
    public var rInitialY: Float = 0.0f,
    public var rOriginX: Float = 0.0f,
    public var rOriginY: Float = 0.0f,
)

public data class TaTransformClip(
    public var header: TaTransform = TaTransform(),
    public var rLeft: Float = 0.0f,
    public var rTop: Float = 0.0f,
    public var rRight: Float = 0.0f,
    public var rBottom: Float = 0.0f,
    public var rInitialLeft: Float = 0.0f,
    public var rInitialTop: Float = 0.0f,
    public var rInitialRight: Float = 0.0f,
    public var rInitialBottom: Float = 0.0f,
)

public data class TaTransformOpacity(
    public var header: TaTransform = TaTransform(),
    public var rOpacity: Float = 0.0f,
    public var rInitialOpacity: Float = 0.0f,
)

public data class Tbaddbitmap(
    public var hInst: Hinstance = null,
    public var nID: Int = 0,
)

public data class Tbbutton(
    public var iBitmap: Int = 0,
    public var idCommand: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var bReserved: UByteArray = UByteArray(6),
    public var dwData: Int = 0,
    public var iString: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tbbutton) return false
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

public data class Tbbuttoninfoa(
    public var cbSize: UInt = 0u,
    public var dwMask: TbbuttoninfowMask = 0u,
    public var idCommand: Int = 0,
    public var iImage: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var cx: UShort = 0u,
    public var lParam: Int = 0,
    public var pszText: Pstr = null,
    public var cchText: Int = 0,
)

public data class Tbbuttoninfow(
    public var cbSize: UInt = 0u,
    public var dwMask: TbbuttoninfowMask = 0u,
    public var idCommand: Int = 0,
    public var iImage: Int = 0,
    public var fsState: UByte = 0u,
    public var fsStyle: UByte = 0u,
    public var cx: UShort = 0u,
    public var lParam: Int = 0,
    public var pszText: Pwstr = null,
    public var cchText: Int = 0,
)

public data class Tbinsertmark(
    public var iButton: Int = 0,
    public var dwFlags: TbinsertmarkFlags = 0u,
)

public data class Tbmetrics(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var cxPad: Int = 0,
    public var cyPad: Int = 0,
    public var cxBarPad: Int = 0,
    public var cyBarPad: Int = 0,
    public var cxButtonSpacing: Int = 0,
    public var cyButtonSpacing: Int = 0,
)

public data class Tbreplacebitmap(
    public var hInstOld: Hinstance = null,
    public var nIDOld: Int = 0,
    public var hInstNew: Hinstance = null,
    public var nIDNew: Int = 0,
    public var nButtons: Int = 0,
)

public data class Tbsaveparamsa(
    public var hkr: Hkey = null,
    public var pszSubKey: Pcstr = null,
    public var pszValueName: Pcstr = null,
)

public data class Tbsaveparamsw(
    public var hkr: Hkey = null,
    public var pszSubKey: Pcwstr = null,
    public var pszValueName: Pcwstr = null,
)

public data class Tchittestinfo(
    public var pt: Point = Point(),
    public var flags: TchittestinfoFlags = 0u,
)

public data class Tcitema(
    public var mask: TcitemheaderaMask = 0u,
    public var dwState: TabControlItemState = 0u,
    public var dwStateMask: TabControlItemState = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class Tcitemheadera(
    public var mask: TcitemheaderaMask = 0u,
    public var lpReserved1: UInt = 0u,
    public var lpReserved2: UInt = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
)

public data class Tcitemheaderw(
    public var mask: TcitemheaderaMask = 0u,
    public var lpReserved1: UInt = 0u,
    public var lpReserved2: UInt = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
)

public data class Tcitemw(
    public var mask: TcitemheaderaMask = 0u,
    public var dwState: TabControlItemState = 0u,
    public var dwStateMask: TabControlItemState = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var lParam: Lparam = 0L,
)

public data class TouchHitTestingInput(
    public var pointerId: UInt = 0u,
    public var point: Point = Point(),
    public var boundingBox: Rect = Rect(),
    public var nonOccludedBoundingBox: Rect = Rect(),
    public var orientation: UInt = 0u,
)

public data class TouchHitTestingProximityEvaluation(
    public var score: UShort = 0u,
    public var adjustedPoint: Point = Point(),
)

public data class Ttgettitle(
    public var dwSize: UInt = 0u,
    public var uTitleBitmap: UInt = 0u,
    public var cch: UInt = 0u,
    public var pszTitle: Pwstr = null,
)

public data class Tthittestinfoa(
    public var hwnd: Hwnd = null,
    public var pt: Point = Point(),
    public var ti: Tttoolinfoa = Tttoolinfoa(),
)

public data class Tthittestinfow(
    public var hwnd: Hwnd = null,
    public var pt: Point = Point(),
    public var ti: Tttoolinfow = Tttoolinfow(),
)

public data class Tttoolinfoa(
    public var cbSize: UInt = 0u,
    public var uFlags: TooltipFlags = 0u,
    public var hwnd: Hwnd = null,
    public var uId: Int = 0,
    public var rect: Rect = Rect(),
    public var hinst: Hinstance = null,
    public var lpszText: Pstr = null,
    public var lParam: Lparam = 0L,
    public var lpReserved: COpaquePointer? = null,
)

public data class Tttoolinfow(
    public var cbSize: UInt = 0u,
    public var uFlags: TooltipFlags = 0u,
    public var hwnd: Hwnd = null,
    public var uId: Int = 0,
    public var rect: Rect = Rect(),
    public var hinst: Hinstance = null,
    public var lpszText: Pwstr = null,
    public var lParam: Lparam = 0L,
    public var lpReserved: COpaquePointer? = null,
)

public data class Tvgetitempartrectinfo(
    public var hti: Htreeitem = 0,
    public var prc: Rect? = null,
    public var partID: Tvitempart = 0,
)

public data class Tvhittestinfo(
    public var pt: Point = Point(),
    public var flags: TvhittestinfoFlags = 0u,
    public var hItem: Htreeitem = 0,
)

public data class Tvinsertstructa(
    public var hParent: Htreeitem = 0,
    public var hInsertAfter: Htreeitem = 0,
    public var anonymous: Tvinsertstructa0 = Tvinsertstructa0(),
)

public data class Tvinsertstructa0(
    public var itemex: Tvitemexa = Tvitemexa(),
    public var item: Tvitema = Tvitema(),
)

public data class Tvinsertstructw(
    public var hParent: Htreeitem = 0,
    public var hInsertAfter: Htreeitem = 0,
    public var anonymous: Tvinsertstructw0 = Tvinsertstructw0(),
)

public data class Tvinsertstructw0(
    public var itemex: Tvitemexw = Tvitemexw(),
    public var item: Tvitemw = Tvitemw(),
)

public data class Tvitema(
    public var mask: TvitemMask = 0u,
    public var hItem: Htreeitem = 0,
    public var state: TreeViewItemStateFlags = 0u,
    public var stateMask: TreeViewItemStateFlags = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TvitemexwChildren = 0,
    public var lParam: Lparam = 0L,
)

public data class Tvitemexa(
    public var mask: TvitemMask = 0u,
    public var hItem: Htreeitem = 0,
    public var state: UInt = 0u,
    public var stateMask: UInt = 0u,
    public var pszText: Pstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TvitemexwChildren = 0,
    public var lParam: Lparam = 0L,
    public var iIntegral: Int = 0,
    public var uStateEx: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var iExpandedImage: Int = 0,
    public var iReserved: Int = 0,
)

public data class Tvitemexw(
    public var mask: TvitemMask = 0u,
    public var hItem: Htreeitem = 0,
    public var state: UInt = 0u,
    public var stateMask: UInt = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TvitemexwChildren = 0,
    public var lParam: Lparam = 0L,
    public var iIntegral: Int = 0,
    public var uStateEx: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var iExpandedImage: Int = 0,
    public var iReserved: Int = 0,
)

public data class Tvitemw(
    public var mask: TvitemMask = 0u,
    public var hItem: Htreeitem = 0,
    public var state: TreeViewItemStateFlags = 0u,
    public var stateMask: TreeViewItemStateFlags = 0u,
    public var pszText: Pwstr = null,
    public var cchTextMax: Int = 0,
    public var iImage: Int = 0,
    public var iSelectedImage: Int = 0,
    public var cChildren: TvitemexwChildren = 0,
    public var lParam: Lparam = 0L,
)

public data class Tvsortcb(
    public var hParent: Htreeitem = 0,
    public var lpfnCompare: Pfntvcompare = null,
    public var lParam: Lparam = 0L,
)

public data class Udaccel(
    public var nSec: UInt = 0u,
    public var nInc: UInt = 0u,
)
