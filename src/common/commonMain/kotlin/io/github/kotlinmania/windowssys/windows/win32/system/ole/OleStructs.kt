@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Decimal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hrsrc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.media.Htask
import io.github.kotlinmania.windowssys.windows.win32.system.com.ByteSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.Callconv
import io.github.kotlinmania.windowssys.windows.win32.system.com.DwordSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.com.FlaggedWordBlob
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.HyperSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearraybound
import io.github.kotlinmania.windowssys.windows.win32.system.com.Typedesc
import io.github.kotlinmania.windowssys.windows.win32.system.com.WordSizedarr
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderaV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.PropsheetheaderwV2
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamea
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs.Openfilenamew
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Haccel
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MenuItemFlags

public data class Arraydesc(
    public var tdescElem: Typedesc = Typedesc(),
    public var cDims: UShort = 0u,
    public var rgbounds: List<Safearraybound> = List(1) { Safearraybound() },
)

public data class Cadword(public var cElems: UInt = 0u, public var pElems: UInt? = null)

public data class Calpolestr(public var cElems: UInt = 0u, public var pElems: Pwstr? = null)

public data class Cauuid(public var cElems: UInt = 0u, public var pElems: Guid? = null)

public data class Cleanlocalstorage(
    public var pInterface: COpaquePointer? = null,
    public var pStorage: COpaquePointer? = null,
    public var flags: UInt = 0u,
)

public data class Controlinfo(
    public var cb: UInt = 0u,
    public var hAccel: Haccel = null,
    public var cAccel: UShort = 0u,
    public var dwFlags: UInt = 0u,
)

public data class Dvaspectinfo(public var cb: UInt = 0u, public var dwFlags: UInt = 0u)

public data class Dvextentinfo(
    public var cb: UInt = 0u,
    public var dwExtentMode: UInt = 0u,
    public var sizelProposed: Size = Size(),
)

public data class Fontdesc(
    public var cbSizeofstruct: UInt = 0u,
    public var lpstrName: Pwstr = null,
    public var cySize: CY = CY(),
    public var sWeight: Short = 0,
    public var sCharset: Short = 0,
    public var fItalic: Bool = 0,
    public var fUnderline: Bool = 0,
    public var fStrikethrough: Bool = 0,
)

public data class Interfacedata(public var pmethdata: Methoddata? = null, public var cMembers: UInt = 0u)

public data class Licinfo(
    public var cbLicInfo: Int = 0,
    public var fRuntimeKeyAvail: Bool = 0,
    public var fLicVerified: Bool = 0,
)

public data class Methoddata(
    public var szName: Pwstr = null,
    public var ppdata: Paramdata? = null,
    public var dispid: Int = 0,
    public var iMeth: UInt = 0u,
    public var cc: Callconv = 0,
    public var cArgs: UInt = 0u,
    public var wFlags: UShort = 0u,
    public var vtReturn: Varenum = 0u,
)

public data class Numparse(
    public var cDig: Int = 0,
    public var dwInFlags: NumparseFlags = 0u,
    public var dwOutFlags: NumparseFlags = 0u,
    public var cchUsed: Int = 0,
    public var nBaseShift: Int = 0,
    public var nPwr10: Int = 0,
)

public data class Objectdescriptor(
    public var cbSize: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var dwDrawAspect: UInt = 0u,
    public var sizel: Size = Size(),
    public var pointl: Pointl = Pointl(),
    public var dwStatus: UInt = 0u,
    public var dwFullUserTypeName: UInt = 0u,
    public var dwSrcOfCopy: UInt = 0u,
)

public data class Ocpfiparams(
    public var cbStructSize: UInt = 0u,
    public var hWndOwner: Hwnd = null,
    public var x: Int = 0,
    public var y: Int = 0,
    public var lpszCaption: Pcwstr = null,
    public var cObjects: UInt = 0u,
    public var lplpUnk: COpaquePointer? = null,
    public var cPages: UInt = 0u,
    public var lpPages: Guid? = null,
    public var lcid: UInt = 0u,
    public var dispidInitialProperty: Int = 0,
)

public data class Olecmd(public var cmdID: UInt = 0u, public var cmdf: UInt = 0u)

public data class Olecmdtext(
    public var cmdtextf: UInt = 0u,
    public var cwActual: UInt = 0u,
    public var cwBuf: UInt = 0u,
    public var rgwz: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Olecmdtext) return false
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

public data class Oleinplaceframeinfo(
    public var cb: UInt = 0u,
    public var fMDIApp: Bool = 0,
    public var hwndFrame: Hwnd = null,
    public var haccel: Haccel = null,
    public var cAccelEntries: UInt = 0u,
)

public data class Olemenugroupwidths(public var width: IntArray = IntArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Olemenugroupwidths) return false
        if (!this.width.contentEquals(other.width)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.width.contentHashCode()
    }
}

public data class Oleuibusya(
    public var cbStruct: UInt = 0u,
    public var dwFlags: BusyDialogFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var hTask: Htask = null,
    public var lphWndDialog: Hwnd? = null,
)

public data class Oleuibusyw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: BusyDialogFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var hTask: Htask = null,
    public var lphWndDialog: Hwnd? = null,
)

public data class Oleuichangeicona(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ChangeIconFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var hMetaPict: Hglobal = null,
    public var clsid: Guid = Guid(),
    public var szIconExe: ByteArray = ByteArray(260),
    public var cchIconExe: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuichangeicona) return false
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

public data class Oleuichangeiconw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ChangeIconFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var hMetaPict: Hglobal = null,
    public var clsid: Guid = Guid(),
    public var szIconExe: UShortArray = UShortArray(260),
    public var cchIconExe: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuichangeiconw) return false
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

public class Oleuichangesourcea(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ChangeSourceFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var lpOFN: Openfilenamea? = null,
    public var dwReserved1: UIntArray = UIntArray(4),
    public var lpOleUILinkContainer: COpaquePointer? = null,
    public var dwLink: UInt = 0u,
    public var lpszDisplayName: Pstr = null,
    public var nFileLength: UInt = 0u,
    public var lpszFrom: Pstr = null,
    public var lpszTo: Pstr = null,
)

public class Oleuichangesourcew(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ChangeSourceFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var lpOFN: Openfilenamew? = null,
    public var dwReserved1: UIntArray = UIntArray(4),
    public var lpOleUILinkContainer: COpaquePointer? = null,
    public var dwLink: UInt = 0u,
    public var lpszDisplayName: Pwstr = null,
    public var nFileLength: UInt = 0u,
    public var lpszFrom: Pwstr = null,
    public var lpszTo: Pwstr = null,
)

public class Oleuiconverta(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UiConvertFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var clsid: Guid = Guid(),
    public var clsidConvertDefault: Guid = Guid(),
    public var clsidActivateDefault: Guid = Guid(),
    public var clsidNew: Guid = Guid(),
    public var dvAspect: UInt = 0u,
    public var wFormat: UShort = 0u,
    public var fIsLinkedObject: Bool = 0,
    public var hMetaPict: Hglobal = null,
    public var lpszUserType: Pstr = null,
    public var fObjectsIconChanged: Bool = 0,
    public var lpszDefLabel: Pstr = null,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Guid? = null,
)

public class Oleuiconvertw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UiConvertFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var clsid: Guid = Guid(),
    public var clsidConvertDefault: Guid = Guid(),
    public var clsidActivateDefault: Guid = Guid(),
    public var clsidNew: Guid = Guid(),
    public var dvAspect: UInt = 0u,
    public var wFormat: UShort = 0u,
    public var fIsLinkedObject: Bool = 0,
    public var hMetaPict: Hglobal = null,
    public var lpszUserType: Pwstr = null,
    public var fObjectsIconChanged: Bool = 0,
    public var lpszDefLabel: Pwstr = null,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Guid? = null,
)

public data class Oleuieditlinksa(
    public var cbStruct: UInt = 0u,
    public var dwFlags: EditLinksFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var lpOleUILinkContainer: COpaquePointer? = null,
)

public data class Oleuieditlinksw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: EditLinksFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var lpOleUILinkContainer: COpaquePointer? = null,
)

public data class Oleuignrlpropsa(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Oleuiobjectpropsa? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuignrlpropsa) return false
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

public data class Oleuignrlpropsw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Oleuiobjectpropsw? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuignrlpropsw) return false
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

public class Oleuiinsertobjecta(
    public var cbStruct: UInt = 0u,
    public var dwFlags: InsertObjectFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var clsid: Guid = Guid(),
    public var lpszFile: Pstr = null,
    public var cchFile: UInt = 0u,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Guid? = null,
    public var iid: Guid = Guid(),
    public var oleRender: UInt = 0u,
    public var lpFormatEtc: Formatetc? = null,
    public var lpIOleClientSite: COpaquePointer? = null,
    public var lpIStorage: COpaquePointer? = null,
    public var ppvObj: COpaquePointer? = null,
    public var sc: Int = 0,
    public var hMetaPict: Hglobal = null,
)

public class Oleuiinsertobjectw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: InsertObjectFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var clsid: Guid = Guid(),
    public var lpszFile: Pwstr = null,
    public var cchFile: UInt = 0u,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Guid? = null,
    public var iid: Guid = Guid(),
    public var oleRender: UInt = 0u,
    public var lpFormatEtc: Formatetc? = null,
    public var lpIOleClientSite: COpaquePointer? = null,
    public var lpIStorage: COpaquePointer? = null,
    public var ppvObj: COpaquePointer? = null,
    public var sc: Int = 0,
    public var hMetaPict: Hglobal = null,
)

public data class Oleuilinkpropsa(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Oleuiobjectpropsa? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuilinkpropsa) return false
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

public data class Oleuilinkpropsw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Oleuiobjectpropsw? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuilinkpropsw) return false
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

public data class Oleuiobjectpropsa(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ObjectPropertiesFlags = 0u,
    public var lpPS: PropsheetheaderaV2? = null,
    public var dwObject: UInt = 0u,
    public var lpObjInfo: COpaquePointer? = null,
    public var dwLink: UInt = 0u,
    public var lpLinkInfo: COpaquePointer? = null,
    public var lpGP: Oleuignrlpropsa? = null,
    public var lpVP: Oleuiviewpropsa? = null,
    public var lpLP: Oleuilinkpropsa? = null,
)

public data class Oleuiobjectpropsw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ObjectPropertiesFlags = 0u,
    public var lpPS: PropsheetheaderwV2? = null,
    public var dwObject: UInt = 0u,
    public var lpObjInfo: COpaquePointer? = null,
    public var dwLink: UInt = 0u,
    public var lpLinkInfo: COpaquePointer? = null,
    public var lpGP: Oleuignrlpropsw? = null,
    public var lpVP: Oleuiviewpropsw? = null,
    public var lpLP: Oleuilinkpropsw? = null,
)

public data class Oleuipasteentrya(
    public var fmtetc: Formatetc = Formatetc(),
    public var lpstrFormatName: Pcstr = null,
    public var lpstrResultText: Pcstr = null,
    public var dwFlags: UInt = 0u,
    public var dwScratchSpace: UInt = 0u,
)

public data class Oleuipasteentryw(
    public var fmtetc: Formatetc = Formatetc(),
    public var lpstrFormatName: Pcwstr = null,
    public var lpstrResultText: Pcwstr = null,
    public var dwFlags: UInt = 0u,
    public var dwScratchSpace: UInt = 0u,
)

public class Oleuipastespeciala(
    public var cbStruct: UInt = 0u,
    public var dwFlags: PasteSpecialFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcstr = null,
    public var hResource: Hrsrc = null,
    public var lpSrcDataObj: COpaquePointer? = null,
    public var arrPasteEntries: Oleuipasteentrya? = null,
    public var cPasteEntries: Int = 0,
    public var arrLinkTypes: UInt? = null,
    public var cLinkTypes: Int = 0,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Guid? = null,
    public var nSelectedIndex: Int = 0,
    public var fLink: Bool = 0,
    public var hMetaPict: Hglobal = null,
    public var sizel: Size = Size(),
)

public class Oleuipastespecialw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: PasteSpecialFlags = 0u,
    public var hWndOwner: Hwnd = null,
    public var lpszCaption: Pcwstr = null,
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var hInstance: Hinstance = null,
    public var lpszTemplate: Pcwstr = null,
    public var hResource: Hrsrc = null,
    public var lpSrcDataObj: COpaquePointer? = null,
    public var arrPasteEntries: Oleuipasteentryw? = null,
    public var cPasteEntries: Int = 0,
    public var arrLinkTypes: UInt? = null,
    public var cLinkTypes: Int = 0,
    public var cClsidExclude: UInt = 0u,
    public var lpClsidExclude: Guid? = null,
    public var nSelectedIndex: Int = 0,
    public var fLink: Bool = 0,
    public var hMetaPict: Hglobal = null,
    public var sizel: Size = Size(),
)

public data class Oleuiviewpropsa(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ViewObjectPropertiesFlags = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Oleuiobjectpropsa? = null,
    public var nScaleMin: Int = 0,
    public var nScaleMax: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuiviewpropsa) return false
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

public data class Oleuiviewpropsw(
    public var cbStruct: UInt = 0u,
    public var dwFlags: ViewObjectPropertiesFlags = 0u,
    public var dwReserved1: UIntArray = UIntArray(2),
    public var lpfnHook: Lpfnoleuihook = null,
    public var lCustData: Lparam = 0L,
    public var dwReserved2: UIntArray = UIntArray(3),
    public var lpOP: Oleuiobjectpropsw? = null,
    public var nScaleMin: Int = 0,
    public var nScaleMax: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oleuiviewpropsw) return false
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

public data class Oleverb(
    public var lVerb: Oleiverb = 0,
    public var lpszVerbName: Pwstr = null,
    public var fuFlags: MenuItemFlags = 0u,
    public var grfAttribs: UInt = 0u,
)

public data class Pagerange(public var nFromPage: Int = 0, public var nToPage: Int = 0)

public data class Pageset(
    public var cbStruct: UInt = 0u,
    public var fOddPages: Bool = 0,
    public var fEvenPages: Bool = 0,
    public var cPageRange: UInt = 0u,
    public var rgPages: List<Pagerange> = List(1) { Pagerange() },
)

public data class Paramdata(public var szName: Pwstr = null, public var vt: Varenum = 0u)

public data class Paramdesc(public var pparamdescex: Paramdescex? = null, public var wParamFlags: Paramflags = 0u)

public data class Paramdescex(public var cBytes: UInt = 0u, public var varDefaultValue: Variant = Variant())

public data class Pictdesc(
    public var cbSizeofstruct: UInt = 0u,
    public var picType: UInt = 0u,
    public var anonymous: Pictdesc0 = Pictdesc0(),
)

public data class Pictdesc0(
    public var bmp: Pictdesc00 = Pictdesc00(),
    public var wmf: Pictdesc01 = Pictdesc01(),
    public var icon: Pictdesc02 = Pictdesc02(),
    public var emf: Pictdesc03 = Pictdesc03(),
)

public data class Pictdesc00(public var hbitmap: Hbitmap = null, public var hpal: Hpalette = null)

public data class Pictdesc03(public var hemf: Henhmetafile = null)

public data class Pictdesc02(public var hicon: Hicon = null)

public data class Pictdesc01(
    public var hmeta: Hmetafile = null,
    public var xExt: Int = 0,
    public var yExt: Int = 0,
)

public data class Pointf(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class Proppageinfo(
    public var cb: UInt = 0u,
    public var pszTitle: Pwstr = null,
    public var size: Size = Size(),
    public var pszDocString: Pwstr = null,
    public var pszHelpFile: Pwstr = null,
    public var dwHelpContext: UInt = 0u,
)

public data class Qacontainer(
    public var cbSize: UInt = 0u,
    public var pClientSite: COpaquePointer? = null,
    public var pAdviseSink: COpaquePointer? = null,
    public var pPropertyNotifySink: COpaquePointer? = null,
    public var pUnkEventSink: COpaquePointer? = null,
    public var dwAmbientFlags: UInt = 0u,
    public var colorFore: UInt = 0u,
    public var colorBack: UInt = 0u,
    public var pFont: COpaquePointer? = null,
    public var pUndoMgr: COpaquePointer? = null,
    public var dwAppearance: UInt = 0u,
    public var lcid: Int = 0,
    public var hpal: Hpalette = null,
    public var pBindHost: COpaquePointer? = null,
    public var pOleControlSite: COpaquePointer? = null,
    public var pServiceProvider: COpaquePointer? = null,
)

public data class Qacontrol(
    public var cbSize: UInt = 0u,
    public var dwMiscStatus: UInt = 0u,
    public var dwViewStatus: UInt = 0u,
    public var dwEventCookie: UInt = 0u,
    public var dwPropNotifyCookie: UInt = 0u,
    public var dwPointerActivationPolicy: UInt = 0u,
)

public data class Safearrayunion(public var sfType: UInt = 0u, public var u: Safearrayunion0 = Safearrayunion0())

public data class Safearrayunion0(
    public var bstrStr: SafearrBstr = SafearrBstr(),
    public var unknownStr: SafearrUnknown = SafearrUnknown(),
    public var dispatchStr: SafearrDispatch = SafearrDispatch(),
    public var variantStr: SafearrVariant = SafearrVariant(),
    public var recordStr: SafearrBrecord = SafearrBrecord(),
    public var haveIidStr: SafearrHaveiid = SafearrHaveiid(),
    public var byteStr: ByteSizedarr = ByteSizedarr(),
    public var wordStr: WordSizedarr = WordSizedarr(),
    public var longStr: DwordSizedarr = DwordSizedarr(),
    public var hyperStr: HyperSizedarr = HyperSizedarr(),
)

public data class SafearrBrecord(public var size: UInt = 0u, public var aRecord: COpaquePointer? = null)

public data class SafearrBstr(public var size: UInt = 0u, public var aBstr: COpaquePointer? = null)

public data class SafearrDispatch(public var size: UInt = 0u, public var apDispatch: COpaquePointer? = null)

public data class SafearrHaveiid(
    public var size: UInt = 0u,
    public var apUnknown: COpaquePointer? = null,
    public var iid: Guid = Guid(),
)

public data class SafearrUnknown(public var size: UInt = 0u, public var apUnknown: COpaquePointer? = null)

public data class SafearrVariant(public var size: UInt = 0u, public var aVariant: COpaquePointer? = null)

public data class Udate(public var st: Systemtime = Systemtime(), public var wDayOfYear: UShort = 0u)

public data class WireBrecord(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var pRecInfo: COpaquePointer? = null,
    public var pRecord: COpaquePointer? = null,
)

public data class WireSafearray(
    public var cDims: UShort = 0u,
    public var fFeatures: UShort = 0u,
    public var cbElements: UInt = 0u,
    public var cLocks: UInt = 0u,
    public var uArrayStructs: Safearrayunion = Safearrayunion(),
    public var rgsabound: List<Safearraybound> = List(1) { Safearraybound() },
)

public data class WireVariant(
    public var clSize: UInt = 0u,
    public var rpcReserved: UInt = 0u,
    public var vt: UShort = 0u,
    public var wReserved1: UShort = 0u,
    public var wReserved2: UShort = 0u,
    public var wReserved3: UShort = 0u,
    public var anonymous: WireVariant0 = WireVariant0(),
)

public class WireVariant0(
    public var llVal: Long = 0L,
    public var lVal: Int = 0,
    public var bVal: UByte = 0u,
    public var iVal: Short = 0,
    public var fltVal: Float = 0.0f,
    public var dblVal: Double = 0.0,
    public var boolVal: VariantBool = 0,
    public var scode: Int = 0,
    public var cyVal: CY = CY(),
    public var date: Double = 0.0,
    public var bstrVal: FlaggedWordBlob? = null,
    public var punkVal: COpaquePointer? = null,
    public var pdispVal: COpaquePointer? = null,
    public var parray: COpaquePointer? = null,
    public var brecVal: WireBrecord? = null,
    public var pbVal: COpaquePointer? = null,
    public var piVal: Short? = null,
    public var plVal: Int? = null,
    public var pllVal: Long? = null,
    public var pfltVal: Float? = null,
    public var pdblVal: Double? = null,
    public var pboolVal: VariantBool? = null,
    public var pscode: Int? = null,
    public var pcyVal: CY? = null,
    public var pdate: Double? = null,
    public var pbstrVal: COpaquePointer? = null,
    public var ppunkVal: COpaquePointer? = null,
    public var ppdispVal: COpaquePointer? = null,
    public var pparray: COpaquePointer? = null,
    public var pvarVal: COpaquePointer? = null,
    public var cVal: Byte = 0,
    public var uiVal: UShort = 0u,
    public var ulVal: UInt = 0u,
    public var ullVal: ULong = 0uL,
    public var intVal: Int = 0,
    public var uintVal: UInt = 0u,
    public var decVal: Decimal = Decimal(),
    public var pdecVal: Decimal? = null,
    public var pcVal: Pstr = null,
    public var puiVal: UShort? = null,
    public var pulVal: UInt? = null,
    public var pullVal: ULong? = null,
    public var pintVal: Int? = null,
    public var puintVal: UInt? = null,
)
