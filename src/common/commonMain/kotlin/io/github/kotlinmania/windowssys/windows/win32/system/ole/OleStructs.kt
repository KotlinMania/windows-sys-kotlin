@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.DECIMAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HRSRC
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.VARIANT_BOOL
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMETAFILE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.media.HTASK
import io.github.kotlinmania.windowssys.windows.win32.system.com.BYTE_SIZEDARR
import io.github.kotlinmania.windowssys.windows.win32.system.com.CALLCONV
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.DWORD_SIZEDARR
import io.github.kotlinmania.windowssys.windows.win32.system.com.FORMATETC
import io.github.kotlinmania.windowssys.windows.win32.system.com.HYPER_SIZEDARR
import io.github.kotlinmania.windowssys.windows.win32.system.com.SAFEARRAYBOUND
import io.github.kotlinmania.windowssys.windows.win32.system.com.TYPEDESC
import io.github.kotlinmania.windowssys.windows.win32.system.com.WORD_SIZEDARR
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HACCEL
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MENU_ITEM_FLAGS

public data class ARRAYDESC(
    public var tdescElem: TYPEDESC = TYPEDESC(),
    public var cDims: UShort = 0u,
    public var rgbounds: List<SAFEARRAYBOUND> = List(1) { SAFEARRAYBOUND() },
)

public data class CADWORD(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CALPOLESTR(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CAUUID(public var cElems: UInt = 0u, public var pElems: Long = 0L)

public data class CLEANLOCALSTORAGE(
    public var pInterface: Long = 0L,
    public var pStorage: Long = 0L,
    public var flags: UInt = 0u,
)

public data class CONTROLINFO(
    public var cb: UInt = 0u,
    public var hAccel: HACCEL = 0L,
    public var cAccel: UShort = 0u,
    public var dwFlags: UInt = 0u,
)

public data class DVASPECTINFO(public var cb: UInt = 0u, public var dwFlags: UInt = 0u)

public data class DVEXTENTINFO(
    public var cb: UInt = 0u,
    public var dwExtentMode: UInt = 0u,
    public var sizelProposed: SIZE = SIZE(),
)

public data class FONTDESC(
    public var cbSizeofstruct: UInt = 0u,
    public var lpstrName: PWSTR = 0L,
    public var cySize: CY = CY(),
    public var sWeight: Short = 0,
    public var sCharset: Short = 0,
    public var fItalic: BOOL = 0,
    public var fUnderline: BOOL = 0,
    public var fStrikethrough: BOOL = 0,
)

public data class INTERFACEDATA(public var pmethdata: Long = 0L, public var cMembers: UInt = 0u)

public data class LICINFO(
    public var cbLicInfo: Int = 0,
    public var fRuntimeKeyAvail: BOOL = 0,
    public var fLicVerified: BOOL = 0,
)

public data class METHODDATA(
    public var szName: PWSTR = 0L,
    public var ppdata: Long = 0L,
    public var dispid: Int = 0,
    public var iMeth: UInt = 0u,
    public var cc: CALLCONV = 0,
    public var cArgs: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var vtReturn: VARENUM = 0u,
)

public data class NUMPARSE(
    public var cDig: Int = 0,
    public var dwInFlags: NUMPARSE_FLAGS = 0u,
    public var dwOutFlags: NUMPARSE_FLAGS = 0u,
    public var cchUsed: Int = 0,
    public var nBaseShift: Int = 0,
    public var nPwr10: Int = 0,
)

public data class OBJECTDESCRIPTOR(
    public var cbSize: UInt = 0u,
    public var clsid: GUID = GUID(),
    public var dwDrawAspect: UInt = 0u,
    public var sizel: SIZE = SIZE(),
    public var pointl: POINTL = POINTL(),
    public var dwStatus: UInt = 0u,
    public var dwFullUserTypeName: UInt = 0u,
    public var dwSrcOfCopy: UInt = 0u,
)

public data class OCPFIPARAMS(
    public var cbStructSize: UInt = 0u,
    public var hWndOwner: HWND = 0L,
    public var x: Int = 0,
    public var y: Int = 0,
    public var lpszCaption: PCWSTR = 0L,
    public var cObjects: UInt = 0u,
    public var lplpUnk: Long = 0L,
    public var cPages: UInt = 0u,
    public var lpPages: Long = 0L,
    public var lcid: UInt = 0u,
    public var dispidInitialProperty: Int = 0,
)

public data class OLECMD(public var cmdID: UInt = 0u, public var cmdf: UInt = 0u)

public data class OLECMDTEXT(
    public var cmdtextf: UInt = 0u,
    public var cwActual: UInt = 0u,
    public var cwBuf: UInt = 0u,
    public var rgwz: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLECMDTEXT) return false
        if (this.cmdtextf != other.cmdtextf) return false
        if (this.cwActual != other.cwActual) return false
        if (this.cwBuf != other.cwBuf) return false
        if (!this.rgwz.contentEquals(other.rgwz)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmdtextf.hashCode()
        result = 31 * result + this.cwActual.hashCode()
        result = 31 * result + this.cwBuf.hashCode()
        result = 31 * result + this.rgwz.contentHashCode()
        return result
    }
}

public data class OLEINPLACEFRAMEINFO(
    public var cb: UInt = 0u,
    public var fMDIApp: BOOL = 0,
    public var hwndFrame: HWND = 0L,
    public var haccel: HACCEL = 0L,
    public var cAccelEntries: UInt = 0u,
)

public data class OLEMENUGROUPWIDTHS(public var width: IntArray = IntArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEMENUGROUPWIDTHS) return false
        if (!this.width.contentEquals(other.width)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.width.contentHashCode()
    }
}

public data class OLEUIBUSYA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: BUSY_DIALOG_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var hTask: HTASK = 0L,
    public var lphWndDialog: Long = 0L,
)

public data class OLEUIBUSYW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: BUSY_DIALOG_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var hTask: HTASK = 0L,
    public var lphWndDialog: Long = 0L,
)

public data class OLEUICHANGEICONA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: CHANGE_ICON_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var hMetaPict: HGLOBAL = 0L,
    public var clsid: GUID = GUID(),
    public var szIconExe: ByteArray = ByteArray(260),
    public var cchIconExe: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUICHANGEICONA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.hMetaPict != other.hMetaPict) return false
        if (this.clsid != other.clsid) return false
        if (!this.szIconExe.contentEquals(other.szIconExe)) return false
        if (this.cchIconExe != other.cchIconExe) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hMetaPict.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.szIconExe.contentHashCode()
        result = 31 * result + this.cchIconExe.hashCode()
        return result
    }
}

public data class OLEUICHANGEICONW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: CHANGE_ICON_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var hMetaPict: HGLOBAL = 0L,
    public var clsid: GUID = GUID(),
    public var szIconExe: UShortArray = UShortArray(260),
    public var cchIconExe: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUICHANGEICONW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hWndOwner != other.hWndOwner) return false
        if (this.lpszCaption != other.lpszCaption) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (this.hInstance != other.hInstance) return false
        if (this.lpszTemplate != other.lpszTemplate) return false
        if (this.hResource != other.hResource) return false
        if (this.hMetaPict != other.hMetaPict) return false
        if (this.clsid != other.clsid) return false
        if (!this.szIconExe.contentEquals(other.szIconExe)) return false
        if (this.cchIconExe != other.cchIconExe) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hWndOwner.hashCode()
        result = 31 * result + this.lpszCaption.hashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.hInstance.hashCode()
        result = 31 * result + this.lpszTemplate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hMetaPict.hashCode()
        result = 31 * result + this.clsid.hashCode()
        result = 31 * result + this.szIconExe.contentHashCode()
        result = 31 * result + this.cchIconExe.hashCode()
        return result
    }
}

public class OLEUICHANGESOURCEA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: CHANGE_SOURCE_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var lpOFN: Long = 0L,
    public var dwReserved1: UIntArray = UIntArray(4),
    public var lpOleUILinkContainer: Long = 0L,
    public var dwLink: UInt = 0u,
    public var lpszDisplayName: PSTR = 0L,
    public var nFileLength: UInt = 0u,
    public var lpszFrom: PSTR = 0L,
    public var lpszTo: PSTR = 0L,
)

public class OLEUICHANGESOURCEW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: CHANGE_SOURCE_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var lpOFN: Long = 0L,
    public var dwReserved1: UIntArray = UIntArray(4),
    public var lpOleUILinkContainer: Long = 0L,
    public var dwLink: UInt = 0u,
    public var lpszDisplayName: PWSTR = 0L,
    public var nFileLength: UInt = 0u,
    public var lpszFrom: PWSTR = 0L,
    public var lpszTo: PWSTR = 0L,
)

public class OLEUICONVERTA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UI_CONVERT_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var clsid: GUID = GUID(),
    public var clsidConvertDefault: GUID = GUID(),
    public var clsidActivateDefault: GUID = GUID(),
    public var clsidNew: GUID = GUID(),
    public var dvAspect: UInt = 0u,
    public var wFormat: UShort = 0u,
    public var fIsLinkedObject: BOOL = 0,
    public var hMetaPict: HGLOBAL = 0L,
    public var lpszUserType: PSTR = 0L,
    public var fObjectsIconChanged: BOOL = 0,
    public var lpszDefLabel: PSTR = 0L,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Long = 0L,
)

public class OLEUICONVERTW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UI_CONVERT_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var clsid: GUID = GUID(),
    public var clsidConvertDefault: GUID = GUID(),
    public var clsidActivateDefault: GUID = GUID(),
    public var clsidNew: GUID = GUID(),
    public var dvAspect: UInt = 0u,
    public var wFormat: UShort = 0u,
    public var fIsLinkedObject: BOOL = 0,
    public var hMetaPict: HGLOBAL = 0L,
    public var lpszUserType: PWSTR = 0L,
    public var fObjectsIconChanged: BOOL = 0,
    public var lpszDefLabel: PWSTR = 0L,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Long = 0L,
)

public data class OLEUIEDITLINKSA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: EDIT_LINKS_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var lpOleUILinkContainer: Long = 0L,
)

public data class OLEUIEDITLINKSW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: EDIT_LINKS_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var lpOleUILinkContainer: Long = 0L,
)

public data class OLEUIGNRLPROPSA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUIGNRLPROPSA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }
}

public data class OLEUIGNRLPROPSW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUIGNRLPROPSW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }
}

public class OLEUIINSERTOBJECTA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: INSERT_OBJECT_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var clsid: GUID = GUID(),
    public var lpszFile: PSTR = 0L,
    public var cchFile: UInt = 0u,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Long = 0L,
    public var iid: GUID = GUID(),
    public var oleRender: UInt = 0u,
    public var lpFormatEtc: Long = 0L,
    public var lpIOleClientSite: Long = 0L,
    public var lpIStorage: Long = 0L,
    public var ppvObj: Long = 0L,
    public var sc: Int = 0,
    public var hMetaPict: HGLOBAL = 0L,
)

public class OLEUIINSERTOBJECTW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: INSERT_OBJECT_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var clsid: GUID = GUID(),
    public var lpszFile: PWSTR = 0L,
    public var cchFile: UInt = 0u,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Long = 0L,
    public var iid: GUID = GUID(),
    public var oleRender: UInt = 0u,
    public var lpFormatEtc: Long = 0L,
    public var lpIOleClientSite: Long = 0L,
    public var lpIStorage: Long = 0L,
    public var ppvObj: Long = 0L,
    public var sc: Int = 0,
    public var hMetaPict: HGLOBAL = 0L,
)

public data class OLEUILINKPROPSA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUILINKPROPSA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }
}

public data class OLEUILINKPROPSW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUILINKPROPSW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        return result
    }
}

public data class OLEUIOBJECTPROPSA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: OBJECT_PROPERTIES_FLAGS = 0u,
    public var lpPS: Long = 0L,
    public var dwObject: UInt = 0u,
    public var lpObjInfo: Long = 0L,
    public var dwLink: UInt = 0u,
    public var lpLinkInfo: Long = 0L,
    public var lpGP: Long = 0L,
    public var lpVP: Long = 0L,
    public var lpLP: Long = 0L,
)

public data class OLEUIOBJECTPROPSW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: OBJECT_PROPERTIES_FLAGS = 0u,
    public var lpPS: Long = 0L,
    public var dwObject: UInt = 0u,
    public var lpObjInfo: Long = 0L,
    public var dwLink: UInt = 0u,
    public var lpLinkInfo: Long = 0L,
    public var lpGP: Long = 0L,
    public var lpVP: Long = 0L,
    public var lpLP: Long = 0L,
)

public data class OLEUIPASTEENTRYA(
    public var fmtetc: FORMATETC = FORMATETC(),
    public var lpstrFormatName: PCSTR = 0L,
    public var lpstrResultText: PCSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var dwScratchSpace: UInt = 0u,
)

public data class OLEUIPASTEENTRYW(
    public var fmtetc: FORMATETC = FORMATETC(),
    public var lpstrFormatName: PCWSTR = 0L,
    public var lpstrResultText: PCWSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var dwScratchSpace: UInt = 0u,
)

public class OLEUIPASTESPECIALA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: PASTE_SPECIAL_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var lpSrcDataObj: Long = 0L,
    public var arrPasteEntries: Long = 0L,
    public var cPasteEntries: Int = 0,
    public var arrLinkTypes: Long = 0L,
    public var cLinkTypes: Int = 0,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Long = 0L,
    public var nSelectedIndex: Int = 0,
    public var fLink: BOOL = 0,
    public var hMetaPict: HGLOBAL = 0L,
    public var sizel: SIZE = SIZE(),
)

public class OLEUIPASTESPECIALW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: PASTE_SPECIAL_FLAGS = 0u,
    public var hWndOwner: HWND = 0L,
    public var lpszCaption: PCWSTR = 0L,
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var hInstance: HINSTANCE = 0L,
    public var lpszTemplate: PCWSTR = 0L,
    public var hResource: HRSRC = 0L,
    public var lpSrcDataObj: Long = 0L,
    public var arrPasteEntries: Long = 0L,
    public var cPasteEntries: Int = 0,
    public var arrLinkTypes: Long = 0L,
    public var cLinkTypes: Int = 0,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Long = 0L,
    public var nSelectedIndex: Int = 0,
    public var fLink: BOOL = 0,
    public var hMetaPict: HGLOBAL = 0L,
    public var sizel: SIZE = SIZE(),
)

public data class OLEUIVIEWPROPSA(
    public var cbStruct: UInt = 0u,
    public var dwFlags: VIEW_OBJECT_PROPERTIES_FLAGS = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Long = 0L,
    public var nScaleMin: Int = 0,
    public var nScaleMax: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUIVIEWPROPSA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        if (this.nScaleMin != other.nScaleMin) return false
        if (this.nScaleMax != other.nScaleMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        result = 31 * result + this.nScaleMin.hashCode()
        result = 31 * result + this.nScaleMax.hashCode()
        return result
    }
}

public data class OLEUIVIEWPROPSW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: VIEW_OBJECT_PROPERTIES_FLAGS = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: LPFNOLEUIHOOK = null,
    public var lCustData: LPARAM = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Long = 0L,
    public var nScaleMin: Int = 0,
    public var nScaleMax: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OLEUIVIEWPROPSW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.dwReserved1.contentEquals(other.dwReserved1)) return false
        if (this.lpfnHook != other.lpfnHook) return false
        if (this.lCustData != other.lCustData) return false
        if (!this.dwReserved2.contentEquals(other.dwReserved2)) return false
        if (this.lpOP != other.lpOP) return false
        if (this.nScaleMin != other.nScaleMin) return false
        if (this.nScaleMax != other.nScaleMax) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved1.contentHashCode()
        result = 31 * result + this.lpfnHook.hashCode()
        result = 31 * result + this.lCustData.hashCode()
        result = 31 * result + this.dwReserved2.contentHashCode()
        result = 31 * result + this.lpOP.hashCode()
        result = 31 * result + this.nScaleMin.hashCode()
        result = 31 * result + this.nScaleMax.hashCode()
        return result
    }
}

public data class OLEVERB(
    public var lVerb: OLEIVERB = 0,
    public var lpszVerbName: PWSTR = 0L,
    public var fuFlags: MENU_ITEM_FLAGS = 0u,
    public var grfAttribs: UInt = 0u,
)

public data class PAGERANGE(public var nFromPage: Int = 0, public var nToPage: Int = 0)

public data class PAGESET(
    public var cbStruct: UInt = 0u,
    public var fOddPages: BOOL = 0,
    public var fEvenPages: BOOL = 0,
    public var cPageRange: UInt = 0u,
    public var rgPages: List<PAGERANGE> = List(1) { PAGERANGE() },
)

public data class PARAMDATA(public var szName: PWSTR = 0L, public var vt: VARENUM = 0u)

public data class PARAMDESC(public var pparamdescex: Long = 0L, public var wParamFlags: PARAMFLAGS = 0u)

public data class PARAMDESCEX(public var cBytes: UInt = 0u, public var varDefaultValue: VARIANT = VARIANT())

public data class PICTDESC(
    public var cbSizeofstruct: UInt = 0u,
    public var picType: UInt = 0u,
    public var Anonymous: PICTDESC_0 = PICTDESC_0(),
)

public data class PICTDESC_0(
    public var bmp: PICTDESC_0_0 = PICTDESC_0_0(),
    public var wmf: PICTDESC_0_1 = PICTDESC_0_1(),
    public var icon: PICTDESC_0_2 = PICTDESC_0_2(),
    public var emf: PICTDESC_0_3 = PICTDESC_0_3(),
)

public data class PICTDESC_0_0(public var hbitmap: HBITMAP = 0L, public var hpal: HPALETTE = 0L)

public data class PICTDESC_0_3(public var hemf: HENHMETAFILE = 0L)

public data class PICTDESC_0_2(public var hicon: HICON = 0L)

public data class PICTDESC_0_1(
    public var hmeta: HMETAFILE = 0L,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
)

public data class POINTF(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class PROPPAGEINFO(
    public var cb: UInt = 0u,
    public var pszTitle: PWSTR = 0L,
    public var size: SIZE = SIZE(),
    public var pszDocString: PWSTR = 0L,
    public var pszHelpFile: PWSTR = 0L,
    public var dwHelpContext: UInt = 0u,
)

public data class QACONTAINER(
    public var cbSize: UInt = 0u,
    public var pClientSite: Long = 0L,
    public var pAdviseSink: Long = 0L,
    public var pPropertyNotifySink: Long = 0L,
    public var pUnkEventSink: Long = 0L,
    public var dwAmbientFlags: UInt = 0u,
    public var colorFore: UInt = 0u,
    public var colorBack: UInt = 0u,
    public var pFont: Long = 0L,
    public var pUndoMgr: Long = 0L,
    public var dwAppearance: UInt = 0u,
    public var lcid: Int = 0,
    public var hpal: HPALETTE = 0L,
    public var pBindHost: Long = 0L,
    public var pOleControlSite: Long = 0L,
    public var pServiceProvider: Long = 0L,
)

public data class QACONTROL(
    public var cbSize: UInt = 0u,
    public var dwMiscStatus: UInt = 0u,
    public var dwViewStatus: UInt = 0u,
    public var dwEventCookie: UInt = 0u,
    public var dwPropNotifyCookie: UInt = 0u,
    public var dwPointerActivationPolicy: UInt = 0u,
)

public data class SAFEARRAYUNION(public var sfType: UInt = 0u, public var u: SAFEARRAYUNION_0 = SAFEARRAYUNION_0())

public data class SAFEARRAYUNION_0(
    public var BstrStr: SAFEARR_BSTR = SAFEARR_BSTR(),
    public var UnknownStr: SAFEARR_UNKNOWN = SAFEARR_UNKNOWN(),
    public var DispatchStr: SAFEARR_DISPATCH = SAFEARR_DISPATCH(),
    public var VariantStr: SAFEARR_VARIANT = SAFEARR_VARIANT(),
    public var RecordStr: SAFEARR_BRECORD = SAFEARR_BRECORD(),
    public var HaveIidStr: SAFEARR_HAVEIID = SAFEARR_HAVEIID(),
    public var ByteStr: BYTE_SIZEDARR = BYTE_SIZEDARR(),
    public var WordStr: WORD_SIZEDARR = WORD_SIZEDARR(),
    public var LongStr: DWORD_SIZEDARR = DWORD_SIZEDARR(),
    public var HyperStr: HYPER_SIZEDARR = HYPER_SIZEDARR(),
)

public data class SAFEARR_BRECORD(public var Size: UInt = 0u, public var aRecord: Long = 0L)

public data class SAFEARR_BSTR(public var Size: UInt = 0u, public var aBstr: Long = 0L)

public data class SAFEARR_DISPATCH(public var Size: UInt = 0u, public var apDispatch: Long = 0L)

public data class SAFEARR_HAVEIID(
    public var Size: UInt = 0u,
    public var apUnknown: Long = 0L,
    public var iid: GUID = GUID(),
)

public data class SAFEARR_UNKNOWN(public var Size: UInt = 0u, public var apUnknown: Long = 0L)

public data class SAFEARR_VARIANT(public var Size: UInt = 0u, public var aVariant: Long = 0L)

public data class UDATE(public var st: SYSTEMTIME = SYSTEMTIME(), public var wDayOfYear: UShort = 0u)

public data class _wireBRECORD(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var pRecInfo: Long = 0L,
    public var pRecord: Long = 0L,
)

public data class _wireSAFEARRAY(
    public var cDims: UShort = 0u,
    public var fFeatures: UShort = 0u,
    public var cbElements: UInt = 0u,
    public var cLocks: UInt = 0u,
    public var uArrayStructs: SAFEARRAYUNION = SAFEARRAYUNION(),
    public var rgsabound: List<SAFEARRAYBOUND> = List(1) { SAFEARRAYBOUND() },
)

public data class _wireVARIANT(
    public var clSize: UInt = 0u,
    public var rpcReserved: UInt = 0u,
    public var vt: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var Anonymous: _wireVARIANT_0 = _wireVARIANT_0(),
)

public class _wireVARIANT_0(
    public var llVal: Long = 0L,
    public var lVal: Int = 0,
    public var bVal: UByte = 0u,
    public var iVal: Short = 0,
    public var fltVal: Float = 0.0f,
    public var dblVal: Double = 0.0,
    public var boolVal: VARIANT_BOOL = 0,
    public var scode: Int = 0,
    public var cyVal: CY = CY(),
    public var date: Double = 0.0,
    public var bstrVal: Long = 0L,
    public var punkVal: Long = 0L,
    public var pdispVal: Long = 0L,
    public var parray: Long = 0L,
    public var brecVal: Long = 0L,
    public var pbVal: Long = 0L,
    public var piVal: Long = 0L,
    public var plVal: Long = 0L,
    public var pllVal: Long = 0L,
    public var pfltVal: Long = 0L,
    public var pdblVal: Long = 0L,
    public var pboolVal: Long = 0L,
    public var pscode: Long = 0L,
    public var pcyVal: Long = 0L,
    public var pdate: Long = 0L,
    public var pbstrVal: Long = 0L,
    public var ppunkVal: Long = 0L,
    public var ppdispVal: Long = 0L,
    public var pparray: Long = 0L,
    public var pvarVal: Long = 0L,
    public var cVal: Byte = 0,
    public var uiVal: UShort = 0u,
    public var ulVal: UInt = 0u,
    public var ullVal: ULong = 0uL,
    public var intVal: Int = 0,
    public var uintVal: UInt = 0u,
    public var decVal: DECIMAL = DECIMAL(),
    public var pdecVal: Long = 0L,
    public var pcVal: PSTR = 0L,
    public var puiVal: Long = 0L,
    public var pulVal: Long = 0L,
    public var pullVal: Long = 0L,
    public var pintVal: Long = 0L,
    public var puintVal: Long = 0L,
)
