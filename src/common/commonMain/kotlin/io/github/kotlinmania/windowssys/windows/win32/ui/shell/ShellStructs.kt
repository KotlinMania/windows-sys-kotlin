@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.COpaquePointer
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
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.NetAddressInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet.Netresourcea
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.com.ByteBlob
import io.github.kotlinmania.windowssys.windows.win32.system.console.Coord
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.ProcessInformation
import io.github.kotlinmania.windowssys.windows.win32.system.threading.Startupinfow
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Itemidlist
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
}

public data class Aashellmenuitem(
    public var lpReserved1: COpaquePointer? = null,
    public var iReserved: Int = 0,
    public var uiReserved: UInt = 0u,
    public var lpName: Aashellmenufilename? = null,
    public var psz: Pwstr = null,
)

public data class Appbardata(
    public var cbSize: UInt = 0u,
    public var hWnd: Hwnd = null,
    public var uCallbackMessage: UInt = 0u,
    public var uEdge: UInt = 0u,
    public var rc: Rect = Rect(),
    public var lParam: Lparam = 0L,
)

public data class Appcategoryinfo(
    public var locale: UInt = 0u,
    public var pszDescription: Pwstr = null,
    public var appCategoryId: Guid = Guid(),
)

public data class Appcategoryinfolist(
    public var cCategory: UInt = 0u,
    public var pCategoryInfo: Appcategoryinfo? = null,
)

public class Appinfodata(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var pszDisplayName: Pwstr = null,
    public var pszVersion: Pwstr = null,
    public var pszPublisher: Pwstr = null,
    public var pszProductID: Pwstr = null,
    public var pszRegisteredOwner: Pwstr = null,
    public var pszRegisteredCompany: Pwstr = null,
    public var pszLanguage: Pwstr = null,
    public var pszSupportUrl: Pwstr = null,
    public var pszSupportTelephone: Pwstr = null,
    public var pszHelpLink: Pwstr = null,
    public var pszInstallLocation: Pwstr = null,
    public var pszInstallSource: Pwstr = null,
    public var pszInstallDate: Pwstr = null,
    public var pszContact: Pwstr = null,
    public var pszComments: Pwstr = null,
    public var pszImage: Pwstr = null,
    public var pszReadmeUrl: Pwstr = null,
    public var pszUpdateInfoUrl: Pwstr = null,
)

public data class Associationelement(
    public var ac: Assocclass = 0,
    public var hkClass: Hkey = null,
    public var pszClass: Pcwstr = null,
)

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

public data class Bandinfosfb(
    public var dwMask: UInt = 0u,
    public var dwStateMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var crBkgnd: Colorref = 0u,
    public var crBtnLt: Colorref = 0u,
    public var crBtnDk: Colorref = 0u,
    public var wViewMode: UShort = 0u,
    public var wAlign: UShort = 0u,
    public var psf: COpaquePointer? = null,
    public var pidl: Itemidlist? = null,
)

public data class Bandsiteinfo(
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStyle: UInt = 0u,
)

public data class BannerNotification(
    public var event: BannerNotificationEvent = 0,
    public var providerIdentity: Pcwstr = null,
    public var contentId: Pcwstr = null,
)

public class Basebrowserdatalh(
    public var hwnd: Hwnd = null,
    public var ptl: COpaquePointer? = null,
    public var phlf: COpaquePointer? = null,
    public var pautoWb2: COpaquePointer? = null,
    public var pautoEds: COpaquePointer? = null,
    public var pautoSs: COpaquePointer? = null,
    public var eSecureLockIcon: Int = 0,
    public var bitfield: UInt = 0u,
    public var uActivateState: UInt = 0u,
    public var pidlViewState: Itemidlist? = null,
    public var pctView: COpaquePointer? = null,
    public var pidlCur: Itemidlist? = null,
    public var psv: COpaquePointer? = null,
    public var psf: COpaquePointer? = null,
    public var hwndView: Hwnd = null,
    public var pszTitleCur: Pwstr = null,
    public var pidlPending: Itemidlist? = null,
    public var psvPending: COpaquePointer? = null,
    public var psfPending: COpaquePointer? = null,
    public var hwndViewPending: Hwnd = null,
    public var pszTitlePending: Pwstr = null,
    public var fIsViewMshtml: Bool = 0,
    public var fPrivacyImpacted: Bool = 0,
    public var clsidView: Guid = Guid(),
    public var clsidViewPending: Guid = Guid(),
    public var hwndFrame: Hwnd = null,
    public var lPhishingFilterStatus: Int = 0,
)

public class Basebrowserdataxp(
    public var hwnd: Hwnd = null,
    public var ptl: COpaquePointer? = null,
    public var phlf: COpaquePointer? = null,
    public var pautoWb2: COpaquePointer? = null,
    public var pautoEds: COpaquePointer? = null,
    public var pautoSs: COpaquePointer? = null,
    public var eSecureLockIcon: Int = 0,
    public var bitfield: UInt = 0u,
    public var uActivateState: UInt = 0u,
    public var pidlViewState: Itemidlist? = null,
    public var pctView: COpaquePointer? = null,
    public var pidlCur: Itemidlist? = null,
    public var psv: COpaquePointer? = null,
    public var psf: COpaquePointer? = null,
    public var hwndView: Hwnd = null,
    public var pszTitleCur: Pwstr = null,
    public var pidlPending: Itemidlist? = null,
    public var psvPending: COpaquePointer? = null,
    public var psfPending: COpaquePointer? = null,
    public var hwndViewPending: Hwnd = null,
    public var pszTitlePending: Pwstr = null,
    public var fIsViewMshtml: Bool = 0,
    public var fPrivacyImpacted: Bool = 0,
    public var clsidView: Guid = Guid(),
    public var clsidViewPending: Guid = Guid(),
    public var hwndFrame: Hwnd = null,
)

public data class Browseinfoa(
    public var hwndOwner: Hwnd = null,
    public var pidlRoot: Itemidlist? = null,
    public var pszDisplayName: Pstr = null,
    public var lpszTitle: Pcstr = null,
    public var ulFlags: UInt = 0u,
    public var lpfn: Bffcallback = null,
    public var lParam: Lparam = 0L,
    public var iImage: Int = 0,
)

public data class Browseinfow(
    public var hwndOwner: Hwnd = null,
    public var pidlRoot: Itemidlist? = null,
    public var pszDisplayName: Pwstr = null,
    public var lpszTitle: Pcwstr = null,
    public var ulFlags: UInt = 0u,
    public var lpfn: Bffcallback = null,
    public var lParam: Lparam = 0L,
    public var iImage: Int = 0,
)

public data class Cabinetstate(
    public var cLength: UShort = 0u,
    public var nVersion: UShort = 0u,
    public var bitfield: Int = 0,
    public var fMenuEnumFilter: UInt = 0u,
)

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
}

public data class Cminvokecommandinfo(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var lpVerb: Pcstr = null,
    public var lpParameters: Pcstr = null,
    public var lpDirectory: Pcstr = null,
    public var nShow: Int = 0,
    public var dwHotKey: UInt = 0u,
    public var hIcon: Handle = null,
)

public data class Cminvokecommandinfoex(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var lpVerb: Pcstr = null,
    public var lpParameters: Pcstr = null,
    public var lpDirectory: Pcstr = null,
    public var nShow: Int = 0,
    public var dwHotKey: UInt = 0u,
    public var hIcon: Handle = null,
    public var lpTitle: Pcstr = null,
    public var lpVerbW: Pcwstr = null,
    public var lpParametersW: Pcwstr = null,
    public var lpDirectoryW: Pcwstr = null,
    public var lpTitleW: Pcwstr = null,
    public var ptInvoke: Point = Point(),
)

public data class CminvokecommandinfoexRemote(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var lpVerbString: Pcstr = null,
    public var lpParameters: Pcstr = null,
    public var lpDirectory: Pcstr = null,
    public var nShow: Int = 0,
    public var dwHotKey: UInt = 0u,
    public var lpTitle: Pcstr = null,
    public var lpVerbWString: Pcwstr = null,
    public var lpParametersW: Pcwstr = null,
    public var lpDirectoryW: Pcwstr = null,
    public var lpTitleW: Pcwstr = null,
    public var ptInvoke: Point = Point(),
    public var lpVerbInt: UInt = 0u,
    public var lpVerbWInt: UInt = 0u,
)

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
}

public data class ConfirmConflictItem(
    public var pShellItem: COpaquePointer? = null,
    public var pszOriginalName: Pwstr = null,
    public var pszAlternateName: Pwstr = null,
    public var pszLocationShort: Pwstr = null,
    public var pszLocationFull: Pwstr = null,
    public var nType: SyncmgrConflictItemType = 0,
)

public data class ConfirmConflictResultInfo(
    public var pszNewName: Pwstr = null,
    public var iItemIndex: UInt = 0u,
)

public data class Cplinfo(
    public var idIcon: Int = 0,
    public var idName: Int = 0,
    public var idInfo: Int = 0,
    public var lData: Int = 0,
)

public data class CredentialProviderCredentialSerialization(
    public var ulAuthenticationPackage: UInt = 0u,
    public var clsidCredentialProvider: Guid = Guid(),
    public var cbSerialization: UInt = 0u,
    public var rgbSerialization: COpaquePointer? = null,
)

public data class CredentialProviderFieldDescriptor(
    public var dwFieldID: UInt = 0u,
    public var cpft: CredentialProviderFieldType = 0,
    public var pszLabel: Pwstr = null,
    public var guidFieldType: Guid = Guid(),
)

public data class Csfv(
    public var cbSize: UInt = 0u,
    public var pshf: COpaquePointer? = null,
    public var psvOuter: COpaquePointer? = null,
    public var pidl: Itemidlist? = null,
    public var lEvents: Int = 0,
    public var pfnCallback: Lpfnviewcallback = null,
    public var fvm: Folderviewmode = 0,
)

public data class DatablockHeader(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
)

public data class Defcontextmenu(
    public var hwnd: Hwnd = null,
    public var pcmcb: COpaquePointer? = null,
    public var pidlFolder: Itemidlist? = null,
    public var psf: COpaquePointer? = null,
    public var cidl: UInt = 0u,
    public var apidl: COpaquePointer? = null,
    public var punkAssociationInfo: COpaquePointer? = null,
    public var cKeys: UInt = 0u,
    public var aKeys: Hkey = null,
)

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

public data class Detailsinfo(
    public var pidl: Itemidlist? = null,
    public var fmt: Int = 0,
    public var cxChar: Int = 0,
    public var str: Strret = Strret(),
    public var iImage: Int = 0,
)

public data class Dfmics(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var lParam: Lparam = 0L,
    public var idCmdFirst: UInt = 0u,
    public var idDefMax: UInt = 0u,
    public var pici: Cminvokecommandinfo? = null,
    public var punkSite: COpaquePointer? = null,
)

public data class Dllversioninfo(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformID: UInt = 0u,
)

public data class Dllversioninfo2(
    public var info1: Dllversioninfo = Dllversioninfo(),
    public var dwFlags: UInt = 0u,
    public var ullVersion: ULong = 0uL,
)

public data class Draginfoa(
    public var uSize: UInt = 0u,
    public var pt: Point = Point(),
    public var fNC: Bool = 0,
    public var lpFileList: Pstr = null,
    public var grfKeyState: UInt = 0u,
)

public data class Draginfow(
    public var uSize: UInt = 0u,
    public var pt: Point = Point(),
    public var fNC: Bool = 0,
    public var lpFileList: Pwstr = null,
    public var grfKeyState: UInt = 0u,
)

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
}

public data class ExpSpecialFolder(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var idSpecialFolder: UInt = 0u,
    public var cbOffset: UInt = 0u,
)

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
}

public data class Foldersetdata(
    public var fs: Foldersettings = Foldersettings(),
    public var vidRestore: Guid = Guid(),
    public var dwViewPriority: UInt = 0u,
)

public data class Foldersettings(
    public var viewMode: UInt = 0u,
    public var fFlags: UInt = 0u,
)

public data class Helpinfo(
    public var cbSize: UInt = 0u,
    public var iContextType: HelpInfoType = 0,
    public var iCtrlId: Int = 0,
    public var hItemHandle: Handle = null,
    public var dwContextId: Int = 0,
    public var mousePos: Point = Point(),
)

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
}

public data class Hlbwinfo(
    public var cbSize: UInt = 0u,
    public var grfHLBWIF: UInt = 0u,
    public var rcFramePos: Rect = Rect(),
    public var rcDocPos: Rect = Rect(),
    public var hltbinfo: Hltbinfo = Hltbinfo(),
)

public data class Hlitem(
    public var uHLID: UInt = 0u,
    public var pwzFriendlyName: Pwstr = null,
)

public data class Hltbinfo(
    public var uDockType: UInt = 0u,
    public var rcTbPos: Rect = Rect(),
)

public data class Itemspacing(
    public var cxSmall: Int = 0,
    public var cySmall: Int = 0,
    public var cxLarge: Int = 0,
    public var cyLarge: Int = 0,
)

public data class KnownfolderDefinition(
    public var category: KfCategory = 0,
    public var pszName: Pwstr = null,
    public var pszDescription: Pwstr = null,
    public var fidParent: Guid = Guid(),
    public var pszRelativePath: Pwstr = null,
    public var pszParsingName: Pwstr = null,
    public var pszTooltip: Pwstr = null,
    public var pszLocalizedName: Pwstr = null,
    public var pszIcon: Pwstr = null,
    public var pszSecurity: Pwstr = null,
    public var dwAttributes: UInt = 0u,
    public var kfdFlags: UInt = 0u,
    public var ftidType: Guid = Guid(),
)

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
}

public data class NcAddress(
    public var pAddrInfo: NetAddressInfo? = null,
    public var portNumber: UShort = 0u,
    public var prefixLength: UByte = 0u,
)

public data class Newcplinfoa(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwHelpContext: UInt = 0u,
    public var lData: Int = 0,
    public var hIcon: Hicon = null,
    public var szName: ByteArray = ByteArray(32),
    public var szInfo: ByteArray = ByteArray(64),
    public var szHelpFile: ByteArray = ByteArray(128),
) {
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
}

public data class Newcplinfow(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwHelpContext: UInt = 0u,
    public var lData: Int = 0,
    public var hIcon: Hicon = null,
    public var szName: UShortArray = UShortArray(32),
    public var szInfo: UShortArray = UShortArray(64),
    public var szHelpFile: UShortArray = UShortArray(128),
) {
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
}

public data class Notifyicondataa(
    public var cbSize: UInt = 0u,
    public var hWnd: Hwnd = null,
    public var uID: UInt = 0u,
    public var uFlags: NotifyIconDataFlags = 0u,
    public var uCallbackMessage: UInt = 0u,
    public var hIcon: Hicon = null,
    public var szTip: ByteArray = ByteArray(128),
    public var dwState: NotifyIconState = 0u,
    public var dwStateMask: NotifyIconState = 0u,
    public var szInfo: ByteArray = ByteArray(256),
    public var anonymous: Notifyicondataa0 = Notifyicondataa0(),
    public var szInfoTitle: ByteArray = ByteArray(64),
    public var dwInfoFlags: NotifyIconInfotipFlags = 0u,
    public var guidItem: Guid = Guid(),
    public var hBalloonIcon: Hicon = null,
) {
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
}

public data class Notifyicondataa0(
    public var uTimeout: UInt = 0u,
    public var uVersion: UInt = 0u,
)

public data class Notifyicondataw(
    public var cbSize: UInt = 0u,
    public var hWnd: Hwnd = null,
    public var uID: UInt = 0u,
    public var uFlags: NotifyIconDataFlags = 0u,
    public var uCallbackMessage: UInt = 0u,
    public var hIcon: Hicon = null,
    public var szTip: UShortArray = UShortArray(128),
    public var dwState: NotifyIconState = 0u,
    public var dwStateMask: NotifyIconState = 0u,
    public var szInfo: UShortArray = UShortArray(256),
    public var anonymous: Notifyicondataw0 = Notifyicondataw0(),
    public var szInfoTitle: UShortArray = UShortArray(64),
    public var dwInfoFlags: NotifyIconInfotipFlags = 0u,
    public var guidItem: Guid = Guid(),
    public var hBalloonIcon: Hicon = null,
) {
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
}

public data class Notifyicondataw0(
    public var uTimeout: UInt = 0u,
    public var uVersion: UInt = 0u,
)

public data class Notifyiconidentifier(
    public var cbSize: UInt = 0u,
    public var hWnd: Hwnd = null,
    public var uID: UInt = 0u,
    public var guidItem: Guid = Guid(),
)

public data class Nresarray(
    public var cItems: UInt = 0u,
    public var nr: List<Netresourcea> = List(1) { Netresourcea() },
)

public data class Nstccustomdraw(
    public var psi: COpaquePointer? = null,
    public var uItemState: UInt = 0u,
    public var nstcis: UInt = 0u,
    public var pszText: Pcwstr = null,
    public var iImage: Int = 0,
    public var himl: Himagelist = 0L,
    public var iLevel: Int = 0,
    public var iIndent: Int = 0,
)

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
)

public data class Openasinfo(
    public var pcszFile: Pcwstr = null,
    public var pcszClass: Pcwstr = null,
    public var oaifInFlags: OpenAsInfoFlags = 0,
)

public data class OpenPrinterPropsInfoa(
    public var dwSize: UInt = 0u,
    public var pszSheetName: Pstr = null,
    public var uSheetIndex: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bModal: Bool = 0,
)

public data class OpenPrinterPropsInfow(
    public var dwSize: UInt = 0u,
    public var pszSheetName: Pwstr = null,
    public var uSheetIndex: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bModal: Bool = 0,
)

public data class Parsedurla(
    public var cbSize: UInt = 0u,
    public var pszProtocol: Pcstr = null,
    public var cchProtocol: UInt = 0u,
    public var pszSuffix: Pcstr = null,
    public var cchSuffix: UInt = 0u,
    public var nScheme: UInt = 0u,
)

public data class Parsedurlw(
    public var cbSize: UInt = 0u,
    public var pszProtocol: Pcwstr = null,
    public var cchProtocol: UInt = 0u,
    public var pszSuffix: Pcwstr = null,
    public var cchSuffix: UInt = 0u,
    public var nScheme: UInt = 0u,
)

public data class PersistFolderTargetInfo(
    public var pidlTargetFolder: Itemidlist? = null,
    public var szTargetParsingName: UShortArray = UShortArray(260),
    public var szNetworkProvider: UShortArray = UShortArray(260),
    public var dwAttributes: UInt = 0u,
    public var csidl: Int = 0,
) {
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
}

public data class Previewhandlerframeinfo(
    public var haccel: Haccel = null,
    public var cAccelEntries: UInt = 0u,
)

public data class Profileinfoa(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpUserName: Pstr = null,
    public var lpProfilePath: Pstr = null,
    public var lpDefaultPath: Pstr = null,
    public var lpServerName: Pstr = null,
    public var lpPolicyPath: Pstr = null,
    public var hProfile: Handle = null,
)

public data class Profileinfow(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpUserName: Pwstr = null,
    public var lpProfilePath: Pwstr = null,
    public var lpDefaultPath: Pwstr = null,
    public var lpServerName: Pwstr = null,
    public var lpPolicyPath: Pwstr = null,
    public var hProfile: Handle = null,
)

public data class Pubappinfo(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var pszSource: Pwstr = null,
    public var stAssigned: Systemtime = Systemtime(),
    public var stPublished: Systemtime = Systemtime(),
    public var stScheduled: Systemtime = Systemtime(),
    public var stExpire: Systemtime = Systemtime(),
)

public data class Qcminfo(
    public var hmenu: Hmenu = null,
    public var indexMenu: UInt = 0u,
    public var idCmdFirst: UInt = 0u,
    public var idCmdLast: UInt = 0u,
    public var pIdMap: QcminfoIdmap? = null,
)

public data class QcminfoIdmap(
    public var nMaxIds: UInt = 0u,
    public var pIdList: List<QcminfoIdmapPlacement> = List(1) { QcminfoIdmapPlacement() },
)

public data class QcminfoIdmapPlacement(
    public var id: UInt = 0u,
    public var fFlags: UInt = 0u,
)

public data class Qitab(
    public var piid: Guid? = null,
    public var dwOffset: UInt = 0u,
)

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
}

public data class SfvmProppageData(
    public var dwReserved: UInt = 0u,
    public var pfn: Lpfnsvaddpropsheetpage = null,
    public var lParam: Lparam = 0L,
)

public data class SfvCreate(
    public var cbSize: UInt = 0u,
    public var pshf: COpaquePointer? = null,
    public var psvOuter: COpaquePointer? = null,
    public var psfvcb: COpaquePointer? = null,
)

public data class SfvSetitempos(
    public var pidl: Itemidlist? = null,
    public var pt: Point = Point(),
)

public data class Shardappidinfo(
    public var psi: COpaquePointer? = null,
    public var pszAppID: Pcwstr = null,
)

public data class Shardappidinfoidlist(
    public var pidl: Itemidlist? = null,
    public var pszAppID: Pcwstr = null,
)

public data class Shardappidinfolink(
    public var psl: COpaquePointer? = null,
    public var pszAppID: Pcwstr = null,
)

public data class Shcolumndata(
    public var dwFlags: UInt = 0u,
    public var dwFileAttributes: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pwszExt: Pwstr = null,
    public var wszFile: UShortArray = UShortArray(260),
) {
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
}

public data class Shcolumninfo(
    public var scid: Propertykey = Propertykey(),
    public var vt: Varenum = 0u,
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
}

public data class Shcreateprocessinfow(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var pszFile: Pcwstr = null,
    public var pszParameters: Pcwstr = null,
    public var pszCurrentDirectory: Pcwstr = null,
    public var hUserToken: Handle = null,
    public var lpProcessAttributes: SecurityAttributes? = null,
    public var lpThreadAttributes: SecurityAttributes? = null,
    public var bInheritHandles: Bool = 0,
    public var dwCreationFlags: UInt = 0u,
    public var lpStartupInfo: Startupinfow? = null,
    public var lpProcessInformation: ProcessInformation? = null,
)

public data class SHChangeDWORDAsIDList(
    public var cb: UShort = 0u,
    public var dwItem1: UInt = 0u,
    public var dwItem2: UInt = 0u,
    public var cbZero: UShort = 0u,
)

public data class SHChangeNotifyEntry(
    public var pidl: Itemidlist? = null,
    public var fRecursive: Bool = 0,
)

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
}

public data class Shdescriptionid(
    public var dwDescriptionId: UInt = 0u,
    public var clsid: Guid = Guid(),
)

public data class Shdragimage(
    public var sizeDragImage: Size = Size(),
    public var ptOffset: Point = Point(),
    public var hbmpDragImage: Hbitmap = null,
    public var crColorKey: Colorref = 0u,
)

public data class Shellexecuteinfoa(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var lpVerb: Pcstr = null,
    public var lpFile: Pcstr = null,
    public var lpParameters: Pcstr = null,
    public var lpDirectory: Pcstr = null,
    public var nShow: Int = 0,
    public var hInstApp: Hinstance = null,
    public var lpIDList: COpaquePointer? = null,
    public var lpClass: Pcstr = null,
    public var hkeyClass: Hkey = null,
    public var dwHotKey: UInt = 0u,
    public var anonymous: Shellexecuteinfoa0 = Shellexecuteinfoa0(),
    public var hProcess: Handle = null,
)

public data class Shellexecuteinfoa0(
    public var hIcon: Handle = null,
    public var hMonitor: Handle = null,
)

public data class Shellexecuteinfow(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Hwnd = null,
    public var lpVerb: Pcwstr = null,
    public var lpFile: Pcwstr = null,
    public var lpParameters: Pcwstr = null,
    public var lpDirectory: Pcwstr = null,
    public var nShow: Int = 0,
    public var hInstApp: Hinstance = null,
    public var lpIDList: COpaquePointer? = null,
    public var lpClass: Pcwstr = null,
    public var hkeyClass: Hkey = null,
    public var dwHotKey: UInt = 0u,
    public var anonymous: Shellexecuteinfow0 = Shellexecuteinfow0(),
    public var hProcess: Handle = null,
)

public data class Shellexecuteinfow0(
    public var hIcon: Handle = null,
    public var hMonitor: Handle = null,
)

public data class Shellflagstate(
    public var bitfield: Int = 0,
)

public data class Shellstatea(
    public var bitfield1: Int = 0,
    public var dwWin95Unused: UInt = 0u,
    public var uWin95Unused: UInt = 0u,
    public var lParamSort: Int = 0,
    public var iSortDirection: Int = 0,
    public var version: UInt = 0u,
    public var uNotUsed: UInt = 0u,
    public var bitfield2: Int = 0,
)

public data class Shellstatew(
    public var bitfield1: Int = 0,
    public var dwWin95Unused: UInt = 0u,
    public var uWin95Unused: UInt = 0u,
    public var lParamSort: Int = 0,
    public var iSortDirection: Int = 0,
    public var version: UInt = 0u,
    public var uNotUsed: UInt = 0u,
    public var bitfield2: Int = 0,
)

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

public data class Shfileinfoa(
    public var hIcon: Hicon = null,
    public var iIcon: Int = 0,
    public var dwAttributes: UInt = 0u,
    public var szDisplayName: ByteArray = ByteArray(260),
    public var szTypeName: ByteArray = ByteArray(80),
) {
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
}

public data class Shfileinfow(
    public var hIcon: Hicon = null,
    public var iIcon: Int = 0,
    public var dwAttributes: UInt = 0u,
    public var szDisplayName: UShortArray = UShortArray(260),
    public var szTypeName: UShortArray = UShortArray(80),
) {
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
}

public data class Shfileopstructa(
    public var hwnd: Hwnd = null,
    public var wFunc: UInt = 0u,
    public var pFrom: COpaquePointer? = null,
    public var pTo: COpaquePointer? = null,
    public var fFlags: UShort = 0u,
    public var fAnyOperationsAborted: Bool = 0,
    public var hNameMappings: COpaquePointer? = null,
    public var lpszProgressTitle: Pcstr = null,
)

public data class Shfileopstructw(
    public var hwnd: Hwnd = null,
    public var wFunc: UInt = 0u,
    public var pFrom: Pcwstr = null,
    public var pTo: Pcwstr = null,
    public var fFlags: UShort = 0u,
    public var fAnyOperationsAborted: Bool = 0,
    public var hNameMappings: COpaquePointer? = null,
    public var lpszProgressTitle: Pcwstr = null,
)

public data class Shfoldercustomsettings(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var pvid: Guid? = null,
    public var pszWebViewTemplate: Pwstr = null,
    public var cchWebViewTemplate: UInt = 0u,
    public var pszWebViewTemplateVersion: Pwstr = null,
    public var pszInfoTip: Pwstr = null,
    public var cchInfoTip: UInt = 0u,
    public var pclsid: Guid? = null,
    public var dwFlags: UInt = 0u,
    public var pszIconFile: Pwstr = null,
    public var cchIconFile: UInt = 0u,
    public var iIconIndex: Int = 0,
    public var pszLogo: Pwstr = null,
    public var cchLogo: UInt = 0u,
)

public data class Shnamemappinga(
    public var pszOldPath: Pstr = null,
    public var pszNewPath: Pstr = null,
    public var cchOldPath: Int = 0,
    public var cchNewPath: Int = 0,
)

public data class Shnamemappingw(
    public var pszOldPath: Pwstr = null,
    public var pszNewPath: Pwstr = null,
    public var cchOldPath: Int = 0,
    public var cchNewPath: Int = 0,
)

public data class Shqueryrbinfo(
    public var cbSize: UInt = 0u,
    public var i64Size: Long = 0L,
    public var i64NumItems: Long = 0L,
)

public data class Shstockiconinfo(
    public var cbSize: UInt = 0u,
    public var hIcon: Hicon = null,
    public var iSysImageIndex: Int = 0,
    public var iIcon: Int = 0,
    public var szPath: UShortArray = UShortArray(260),
) {
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
}

public data class Slowappinfo(
    public var ullSize: ULong = 0uL,
    public var ftLastUsed: Filetime = Filetime(),
    public var iTimesUsed: Int = 0,
    public var pszImage: Pwstr = null,
)

public data class Smcshchangenotifystruct(
    public var lEvent: Int = 0,
    public var pidl1: Itemidlist? = null,
    public var pidl2: Itemidlist? = null,
)

public data class Smdata(
    public var dwMask: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hmenu: Hmenu = null,
    public var hwnd: Hwnd = null,
    public var uId: UInt = 0u,
    public var uIdParent: UInt = 0u,
    public var uIdAncestor: UInt = 0u,
    public var punk: COpaquePointer? = null,
    public var pidlFolder: Itemidlist? = null,
    public var pidlItem: Itemidlist? = null,
    public var psf: COpaquePointer? = null,
    public var pvUserData: COpaquePointer? = null,
)

public data class Sminfo(
    public var dwMask: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iIcon: Int = 0,
)

public data class Sortcolumn(
    public var propkey: Propertykey = Propertykey(),
    public var direction: Sortdirection = 0,
)

public data class Sv2cvw2Params(
    public var cbSize: UInt = 0u,
    public var psvPrev: COpaquePointer? = null,
    public var pfs: Foldersettings? = null,
    public var psbOwner: COpaquePointer? = null,
    public var prcView: Rect? = null,
    public var pvid: Guid? = null,
    public var hwndView: Hwnd = null,
)

public data class Syncmgrhandlerinfo(
    public var cbSize: UInt = 0u,
    public var hIcon: Hicon = null,
    public var syncMgrHandlerFlags: UInt = 0u,
    public var wszHandlerName: UShortArray = UShortArray(32),
) {
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
}

public data class Syncmgritem(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var itemID: Guid = Guid(),
    public var dwItemState: UInt = 0u,
    public var hIcon: Hicon = null,
    public var wszItemName: UShortArray = UShortArray(128),
    public var ftLastUpdate: Filetime = Filetime(),
) {
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
}

public data class Syncmgrlogerrorinfo(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var dwSyncMgrErrorFlags: UInt = 0u,
    public var errorID: Guid = Guid(),
    public var itemID: Guid = Guid(),
)

public data class Syncmgrprogressitem(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var lpcStatusText: Pcwstr = null,
    public var dwStatusType: UInt = 0u,
    public var iProgValue: Int = 0,
    public var iMaxValue: Int = 0,
)

public data class SyncmgrConflictIdInfo(
    public var pblobID: ByteBlob? = null,
    public var pblobExtra: ByteBlob? = null,
)

public data class Tbinfo(
    public var cbuttons: UInt = 0u,
    public var uFlags: UInt = 0u,
)

public data class Thumbbutton(
    public var dwMask: Thumbbuttonmask = 0,
    public var iId: UInt = 0u,
    public var iBitmap: UInt = 0u,
    public var hIcon: Hicon = null,
    public var szTip: UShortArray = UShortArray(260),
    public var dwFlags: Thumbbuttonflags = 0,
) {
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
}

public data class Toolbaritem(
    public var ptbar: COpaquePointer? = null,
    public var rcBorderTool: Rect = Rect(),
    public var pwszItem: Pwstr = null,
    public var fShow: Bool = 0,
    public var hMon: Hmonitor = null,
)

public data class Urlinvokecommandinfoa(
    public var dwcbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var pcszVerb: Pcstr = null,
)

public data class Urlinvokecommandinfow(
    public var dwcbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Hwnd = null,
    public var pcszVerb: Pcwstr = null,
)

public data class Windowdata(
    public var dwWindowID: UInt = 0u,
    public var uiCP: UInt = 0u,
    public var pidl: Itemidlist? = null,
    public var lpszUrl: Pwstr = null,
    public var lpszUrlLocation: Pwstr = null,
    public var lpszTitle: Pwstr = null,
)

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
}
