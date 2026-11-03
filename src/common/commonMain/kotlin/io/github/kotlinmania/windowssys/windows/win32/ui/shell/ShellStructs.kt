@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class AASHELLMENUFILENAME(
    public var cbTotal: Short = 0,
    public var rgbReserved: UByteArray = UByteArray(12),
    public var szFileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AASHELLMENUFILENAME) return false
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

public data class AASHELLMENUITEM(
    public var lpReserved1: Long = 0L,
    public var iReserved: Int = 0,
    public var uiReserved: UInt = 0u,
    public var lpName: Long = 0L,
    public var psz: PWSTR = 0L,
)

public data class APPBARDATA(
    public var cbSize: UInt = 0u,
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var uCallbackMessage: UInt = 0u,
    public var uEdge: UInt = 0u,
    public var rc: Foundation.RECT = Foundation.RECT(),
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
)

public data class APPCATEGORYINFO(
    public var Locale: UInt = 0u,
    public var pszDescription: PWSTR = 0L,
    public var AppCategoryId: GUID = GUID(),
)

public data class APPCATEGORYINFOLIST(public var cCategory: UInt = 0u, public var pCategoryInfo: Long = 0L)

public class APPINFODATA(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var pszDisplayName: PWSTR = 0L,
    public var pszVersion: PWSTR = 0L,
    public var pszPublisher: PWSTR = 0L,
    public var pszProductID: PWSTR = 0L,
    public var pszRegisteredOwner: PWSTR = 0L,
    public var pszRegisteredCompany: PWSTR = 0L,
    public var pszLanguage: PWSTR = 0L,
    public var pszSupportUrl: PWSTR = 0L,
    public var pszSupportTelephone: PWSTR = 0L,
    public var pszHelpLink: PWSTR = 0L,
    public var pszInstallLocation: PWSTR = 0L,
    public var pszInstallSource: PWSTR = 0L,
    public var pszInstallDate: PWSTR = 0L,
    public var pszContact: PWSTR = 0L,
    public var pszComments: PWSTR = 0L,
    public var pszImage: PWSTR = 0L,
    public var pszReadmeUrl: PWSTR = 0L,
    public var pszUpdateInfoUrl: PWSTR = 0L,
)

public data class ASSOCIATIONELEMENT(
    public var ac: ASSOCCLASS = 0,
    public var hkClass: System.Registry.HKEY = System.Registry.HKEY(),
    public var pszClass: PCWSTR = 0L,
)

public data class AUTO_SCROLL_DATA(
    public var iNextSample: Int = 0,
    public var dwLastScroll: UInt = 0u,
    public var bFull: BOOL = 0,
    public var pts: List<Foundation.POINT> = List(3) { Foundation.POINT() },
    public var dwTimes: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AUTO_SCROLL_DATA) return false
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

public data class BANDINFOSFB(
    public var dwMask: UInt = 0u,
    public var dwStateMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var crBkgnd: Foundation.COLORREF = Foundation.COLORREF(),
    public var crBtnLt: Foundation.COLORREF = Foundation.COLORREF(),
    public var crBtnDk: Foundation.COLORREF = Foundation.COLORREF(),
    public var wViewMode: UShort = 0u,
    public var wAlign: UShort = 0u,
    public var psf: Long = 0L,
    public var pidl: Long = 0L,
)

public data class BANDSITEINFO(
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStyle: UInt = 0u,
)

public data class BANNER_NOTIFICATION(
    public var event: BANNER_NOTIFICATION_EVENT = 0,
    public var providerIdentity: PCWSTR = 0L,
    public var contentId: PCWSTR = 0L,
)

public class BASEBROWSERDATALH(
    public var _hwnd: Foundation.HWND = Foundation.HWND(),
    public var _ptl: Long = 0L,
    public var _phlf: Long = 0L,
    public var _pautoWB2: Long = 0L,
    public var _pautoEDS: Long = 0L,
    public var _pautoSS: Long = 0L,
    public var _eSecureLockIcon: Int = 0,
    public var _bitfield: UInt = 0u,
    public var _uActivateState: UInt = 0u,
    public var _pidlViewState: Long = 0L,
    public var _pctView: Long = 0L,
    public var _pidlCur: Long = 0L,
    public var _psv: Long = 0L,
    public var _psf: Long = 0L,
    public var _hwndView: Foundation.HWND = Foundation.HWND(),
    public var _pszTitleCur: PWSTR = 0L,
    public var _pidlPending: Long = 0L,
    public var _psvPending: Long = 0L,
    public var _psfPending: Long = 0L,
    public var _hwndViewPending: Foundation.HWND = Foundation.HWND(),
    public var _pszTitlePending: PWSTR = 0L,
    public var _fIsViewMSHTML: BOOL = 0,
    public var _fPrivacyImpacted: BOOL = 0,
    public var _clsidView: GUID = GUID(),
    public var _clsidViewPending: GUID = GUID(),
    public var _hwndFrame: Foundation.HWND = Foundation.HWND(),
    public var _lPhishingFilterStatus: Int = 0,
)

public class BASEBROWSERDATAXP(
    public var _hwnd: Foundation.HWND = Foundation.HWND(),
    public var _ptl: Long = 0L,
    public var _phlf: Long = 0L,
    public var _pautoWB2: Long = 0L,
    public var _pautoEDS: Long = 0L,
    public var _pautoSS: Long = 0L,
    public var _eSecureLockIcon: Int = 0,
    public var _bitfield: UInt = 0u,
    public var _uActivateState: UInt = 0u,
    public var _pidlViewState: Long = 0L,
    public var _pctView: Long = 0L,
    public var _pidlCur: Long = 0L,
    public var _psv: Long = 0L,
    public var _psf: Long = 0L,
    public var _hwndView: Foundation.HWND = Foundation.HWND(),
    public var _pszTitleCur: PWSTR = 0L,
    public var _pidlPending: Long = 0L,
    public var _psvPending: Long = 0L,
    public var _psfPending: Long = 0L,
    public var _hwndViewPending: Foundation.HWND = Foundation.HWND(),
    public var _pszTitlePending: PWSTR = 0L,
    public var _fIsViewMSHTML: BOOL = 0,
    public var _fPrivacyImpacted: BOOL = 0,
    public var _clsidView: GUID = GUID(),
    public var _clsidViewPending: GUID = GUID(),
    public var _hwndFrame: Foundation.HWND = Foundation.HWND(),
)

public data class BROWSEINFOA(
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pidlRoot: Long = 0L,
    public var pszDisplayName: PSTR = 0L,
    public var lpszTitle: PCSTR = 0L,
    public var ulFlags: UInt = 0u,
    public var lpfn: BFFCALLBACK = null,
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
    public var iImage: Int = 0,
)

public data class BROWSEINFOW(
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pidlRoot: Long = 0L,
    public var pszDisplayName: PWSTR = 0L,
    public var lpszTitle: PCWSTR = 0L,
    public var ulFlags: UInt = 0u,
    public var lpfn: BFFCALLBACK = null,
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
    public var iImage: Int = 0,
)

public data class CABINETSTATE(
    public var cLength: UShort = 0u,
    public var nVersion: UShort = 0u,
    public var _bitfield: Int = 0,
    public var fMenuEnumFilter: UInt = 0u,
)

public data class CATEGORY_INFO(public var cif: CATEGORYINFO_FLAGS = 0, public var wszName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CATEGORY_INFO) return false
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

public data class CIDA(public var cidl: UInt = 0u, public var aoffset: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CIDA) return false
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

public data class CMINVOKECOMMANDINFO(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var lpVerb: PCSTR = 0L,
    public var lpParameters: PCSTR = 0L,
    public var lpDirectory: PCSTR = 0L,
    public var nShow: Int = 0,
    public var dwHotKey: UInt = 0u,
    public var hIcon: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class CMINVOKECOMMANDINFOEX(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var lpVerb: PCSTR = 0L,
    public var lpParameters: PCSTR = 0L,
    public var lpDirectory: PCSTR = 0L,
    public var nShow: Int = 0,
    public var dwHotKey: UInt = 0u,
    public var hIcon: Foundation.HANDLE = Foundation.HANDLE(),
    public var lpTitle: PCSTR = 0L,
    public var lpVerbW: PCWSTR = 0L,
    public var lpParametersW: PCWSTR = 0L,
    public var lpDirectoryW: PCWSTR = 0L,
    public var lpTitleW: PCWSTR = 0L,
    public var ptInvoke: Foundation.POINT = Foundation.POINT(),
)

public data class CMINVOKECOMMANDINFOEX_REMOTE(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var lpVerbString: PCSTR = 0L,
    public var lpParameters: PCSTR = 0L,
    public var lpDirectory: PCSTR = 0L,
    public var nShow: Int = 0,
    public var dwHotKey: UInt = 0u,
    public var lpTitle: PCSTR = 0L,
    public var lpVerbWString: PCWSTR = 0L,
    public var lpParametersW: PCWSTR = 0L,
    public var lpDirectoryW: PCWSTR = 0L,
    public var lpTitleW: PCWSTR = 0L,
    public var ptInvoke: Foundation.POINT = Foundation.POINT(),
    public var lpVerbInt: UInt = 0u,
    public var lpVerbWInt: UInt = 0u,
)

public data class CM_COLUMNINFO(
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
        if (other !is CM_COLUMNINFO) return false
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

public data class CONFIRM_CONFLICT_ITEM(
    public var pShellItem: Long = 0L,
    public var pszOriginalName: PWSTR = 0L,
    public var pszAlternateName: PWSTR = 0L,
    public var pszLocationShort: PWSTR = 0L,
    public var pszLocationFull: PWSTR = 0L,
    public var nType: SYNCMGR_CONFLICT_ITEM_TYPE = 0,
)

public data class CONFIRM_CONFLICT_RESULT_INFO(public var pszNewName: PWSTR = 0L, public var iItemIndex: UInt = 0u)

public data class CPLINFO(
    public var idIcon: Int = 0,
    public var idName: Int = 0,
    public var idInfo: Int = 0,
    public var lData: Long = 0L,
)

public data class CREDENTIAL_PROVIDER_CREDENTIAL_SERIALIZATION(
    public var ulAuthenticationPackage: UInt = 0u,
    public var clsidCredentialProvider: GUID = GUID(),
    public var cbSerialization: UInt = 0u,
    public var rgbSerialization: Long = 0L,
)

public data class CREDENTIAL_PROVIDER_FIELD_DESCRIPTOR(
    public var dwFieldID: UInt = 0u,
    public var cpft: CREDENTIAL_PROVIDER_FIELD_TYPE = 0,
    public var pszLabel: PWSTR = 0L,
    public var guidFieldType: GUID = GUID(),
)

public data class CSFV(
    public var cbSize: UInt = 0u,
    public var pshf: Long = 0L,
    public var psvOuter: Long = 0L,
    public var pidl: Long = 0L,
    public var lEvents: Int = 0,
    public var pfnCallback: LPFNVIEWCALLBACK = null,
    public var fvm: FOLDERVIEWMODE = 0,
)

public data class DATABLOCK_HEADER(public var cbSize: UInt = 0u, public var dwSignature: UInt = 0u)

public data class DEFCONTEXTMENU(
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var pcmcb: Long = 0L,
    public var pidlFolder: Long = 0L,
    public var psf: Long = 0L,
    public var cidl: UInt = 0u,
    public var apidl: Long = 0L,
    public var punkAssociationInfo: Long = 0L,
    public var cKeys: UInt = 0u,
    public var aKeys: Long = 0L,
)

public data class DELEGATEITEMID(
    public var cbSize: UShort = 0u,
    public var wOuter: UShort = 0u,
    public var cbInner: UShort = 0u,
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DELEGATEITEMID) return false
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

public data class DESKBANDINFO(
    public var dwMask: UInt = 0u,
    public var ptMinSize: Foundation.POINTL = Foundation.POINTL(),
    public var ptMaxSize: Foundation.POINTL = Foundation.POINTL(),
    public var ptIntegral: Foundation.POINTL = Foundation.POINTL(),
    public var ptActual: Foundation.POINTL = Foundation.POINTL(),
    public var wszTitle: UShortArray = UShortArray(256),
    public var dwModeFlags: UInt = 0u,
    public var crBkgnd: Foundation.COLORREF = Foundation.COLORREF(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DESKBANDINFO) return false
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

public data class DETAILSINFO(
    public var pidl: Long = 0L,
    public var fmt: Int = 0,
    public var cxChar: Int = 0,
    public var str: Common.STRRET = Common.STRRET(),
    public var iImage: Int = 0,
)

public data class DFMICS(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
    public var idCmdFirst: UInt = 0u,
    public var idDefMax: UInt = 0u,
    public var pici: Long = 0L,
    public var punkSite: Long = 0L,
)

public data class DLLVERSIONINFO(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformID: UInt = 0u,
)

public data class DLLVERSIONINFO2(
    public var info1: DLLVERSIONINFO = DLLVERSIONINFO(),
    public var dwFlags: UInt = 0u,
    public var ullVersion: ULong = 0uL,
)

public data class DRAGINFOA(
    public var uSize: UInt = 0u,
    public var pt: Foundation.POINT = Foundation.POINT(),
    public var fNC: BOOL = 0,
    public var lpFileList: PSTR = 0L,
    public var grfKeyState: UInt = 0u,
)

public data class DRAGINFOW(
    public var uSize: UInt = 0u,
    public var pt: Foundation.POINT = Foundation.POINT(),
    public var fNC: BOOL = 0,
    public var lpFileList: PWSTR = 0L,
    public var grfKeyState: UInt = 0u,
)

public data class DROPDESCRIPTION(
    public var type: DROPIMAGETYPE = 0,
    public var szMessage: UShortArray = UShortArray(260),
    public var szInsert: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DROPDESCRIPTION) return false
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

public data class DROPFILES(
    public var pFiles: UInt = 0u,
    public var pt: Foundation.POINT = Foundation.POINT(),
    public var fNC: BOOL = 0,
    public var fWide: BOOL = 0,
)

public data class EXP_DARWIN_LINK(
    public var dbh: DATABLOCK_HEADER = DATABLOCK_HEADER(),
    public var szDarwinID: ByteArray = ByteArray(260),
    public var szwDarwinID: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXP_DARWIN_LINK) return false
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

public data class EXP_PROPERTYSTORAGE(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var abPropertyStorage: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXP_PROPERTYSTORAGE) return false
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

public data class EXP_SPECIAL_FOLDER(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var idSpecialFolder: UInt = 0u,
    public var cbOffset: UInt = 0u,
)

public data class EXP_SZ_LINK(
    public var cbSize: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var szTarget: ByteArray = ByteArray(260),
    public var swzTarget: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXP_SZ_LINK) return false
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

public data class EXTRASEARCH(
    public var guidSearch: GUID = GUID(),
    public var wszFriendlyName: UShortArray = UShortArray(80),
    public var wszUrl: UShortArray = UShortArray(2084),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTRASEARCH) return false
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

public data class FILEDESCRIPTORA(
    public var dwFlags: UInt = 0u,
    public var clsid: GUID = GUID(),
    public var sizel: Foundation.SIZE = Foundation.SIZE(),
    public var pointl: Foundation.POINTL = Foundation.POINTL(),
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastAccessTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastWriteTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var cFileName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILEDESCRIPTORA) return false
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

public data class FILEDESCRIPTORW(
    public var dwFlags: UInt = 0u,
    public var clsid: GUID = GUID(),
    public var sizel: Foundation.SIZE = Foundation.SIZE(),
    public var pointl: Foundation.POINTL = Foundation.POINTL(),
    public var dwFileAttributes: UInt = 0u,
    public var ftCreationTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastAccessTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastWriteTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var nFileSizeHigh: UInt = 0u,
    public var nFileSizeLow: UInt = 0u,
    public var cFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILEDESCRIPTORW) return false
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

public data class FILEGROUPDESCRIPTORA(public var cItems: UInt = 0u, public var fgd: List<FILEDESCRIPTORA> = List(1) { FILEDESCRIPTORA() })

public data class FILEGROUPDESCRIPTORW(public var cItems: UInt = 0u, public var fgd: List<FILEDESCRIPTORW> = List(1) { FILEDESCRIPTORW() })

public data class FILE_ATTRIBUTES_ARRAY(
    public var cItems: UInt = 0u,
    public var dwSumFileAttributes: UInt = 0u,
    public var dwProductFileAttributes: UInt = 0u,
    public var rgdwFileAttributes: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILE_ATTRIBUTES_ARRAY) return false
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

public data class FOLDERSETDATA(
    public var _fs: FOLDERSETTINGS = FOLDERSETTINGS(),
    public var _vidRestore: GUID = GUID(),
    public var _dwViewPriority: UInt = 0u,
)

public data class FOLDERSETTINGS(public var ViewMode: UInt = 0u, public var fFlags: UInt = 0u)

public data class HELPINFO(
    public var cbSize: UInt = 0u,
    public var iContextType: HELP_INFO_TYPE = 0,
    public var iCtrlId: Int = 0,
    public var hItemHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var dwContextId: ULong = 0uL,
    public var MousePos: Foundation.POINT = Foundation.POINT(),
)

public data class HELPWININFOA(
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
        if (other !is HELPWININFOA) return false
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

public data class HELPWININFOW(
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
        if (other !is HELPWININFOW) return false
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

public data class HLBWINFO(
    public var cbSize: UInt = 0u,
    public var grfHLBWIF: UInt = 0u,
    public var rcFramePos: Foundation.RECT = Foundation.RECT(),
    public var rcDocPos: Foundation.RECT = Foundation.RECT(),
    public var hltbinfo: HLTBINFO = HLTBINFO(),
)

public data class HLITEM(public var uHLID: UInt = 0u, public var pwzFriendlyName: PWSTR = 0L)

public data class HLTBINFO(public var uDockType: UInt = 0u, public var rcTbPos: Foundation.RECT = Foundation.RECT())

public data class ITEMSPACING(
    public var cxSmall: Int = 0,
    public var cySmall: Int = 0,
    public var cxLarge: Int = 0,
    public var cyLarge: Int = 0,
)

public data class KNOWNFOLDER_DEFINITION(
    public var category: KF_CATEGORY = 0,
    public var pszName: PWSTR = 0L,
    public var pszDescription: PWSTR = 0L,
    public var fidParent: GUID = GUID(),
    public var pszRelativePath: PWSTR = 0L,
    public var pszParsingName: PWSTR = 0L,
    public var pszTooltip: PWSTR = 0L,
    public var pszLocalizedName: PWSTR = 0L,
    public var pszIcon: PWSTR = 0L,
    public var pszSecurity: PWSTR = 0L,
    public var dwAttributes: UInt = 0u,
    public var kfdFlags: UInt = 0u,
    public var ftidType: GUID = GUID(),
)

public data class MULTIKEYHELPA(
    public var mkSize: UInt = 0u,
    public var mkKeylist: Byte = 0,
    public var szKeyphrase: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MULTIKEYHELPA) return false
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

public data class MULTIKEYHELPW(
    public var mkSize: UInt = 0u,
    public var mkKeylist: UShort = 0u,
    public var szKeyphrase: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MULTIKEYHELPW) return false
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

public data class NC_ADDRESS(
    public var pAddrInfo: Long = 0L,
    public var PortNumber: UShort = 0u,
    public var PrefixLength: UByte = 0u,
)

public data class NEWCPLINFOA(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwHelpContext: UInt = 0u,
    public var lData: Long = 0L,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var szName: ByteArray = ByteArray(32),
    public var szInfo: ByteArray = ByteArray(64),
    public var szHelpFile: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NEWCPLINFOA) return false
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

public data class NEWCPLINFOW(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwHelpContext: UInt = 0u,
    public var lData: Long = 0L,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var szName: UShortArray = UShortArray(32),
    public var szInfo: UShortArray = UShortArray(64),
    public var szHelpFile: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NEWCPLINFOW) return false
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

public data class NOTIFYICONDATAA(
    public var cbSize: UInt = 0u,
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var uID: UInt = 0u,
    public var uFlags: NOTIFY_ICON_DATA_FLAGS = 0u,
    public var uCallbackMessage: UInt = 0u,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var szTip: ByteArray = ByteArray(128),
    public var dwState: NOTIFY_ICON_STATE = 0u,
    public var dwStateMask: NOTIFY_ICON_STATE = 0u,
    public var szInfo: ByteArray = ByteArray(256),
    public var Anonymous: NOTIFYICONDATAA_0 = NOTIFYICONDATAA_0(),
    public var szInfoTitle: ByteArray = ByteArray(64),
    public var dwInfoFlags: NOTIFY_ICON_INFOTIP_FLAGS = 0u,
    public var guidItem: GUID = GUID(),
    public var hBalloonIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NOTIFYICONDATAA) return false
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
        if (this.Anonymous != other.Anonymous) return false
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
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.szInfoTitle.contentHashCode()
        result = 31 * result + this.dwInfoFlags.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        result = 31 * result + this.hBalloonIcon.hashCode()
        return result
    }
}

public data class NOTIFYICONDATAA_0(public var uTimeout: UInt = 0u, public var uVersion: UInt = 0u)

public data class NOTIFYICONDATAW(
    public var cbSize: UInt = 0u,
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var uID: UInt = 0u,
    public var uFlags: NOTIFY_ICON_DATA_FLAGS = 0u,
    public var uCallbackMessage: UInt = 0u,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var szTip: UShortArray = UShortArray(128),
    public var dwState: NOTIFY_ICON_STATE = 0u,
    public var dwStateMask: NOTIFY_ICON_STATE = 0u,
    public var szInfo: UShortArray = UShortArray(256),
    public var Anonymous: NOTIFYICONDATAW_0 = NOTIFYICONDATAW_0(),
    public var szInfoTitle: UShortArray = UShortArray(64),
    public var dwInfoFlags: NOTIFY_ICON_INFOTIP_FLAGS = 0u,
    public var guidItem: GUID = GUID(),
    public var hBalloonIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NOTIFYICONDATAW) return false
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
        if (this.Anonymous != other.Anonymous) return false
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
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.szInfoTitle.contentHashCode()
        result = 31 * result + this.dwInfoFlags.hashCode()
        result = 31 * result + this.guidItem.hashCode()
        result = 31 * result + this.hBalloonIcon.hashCode()
        return result
    }
}

public data class NOTIFYICONDATAW_0(public var uTimeout: UInt = 0u, public var uVersion: UInt = 0u)

public data class NOTIFYICONIDENTIFIER(
    public var cbSize: UInt = 0u,
    public var hWnd: Foundation.HWND = Foundation.HWND(),
    public var uID: UInt = 0u,
    public var guidItem: GUID = GUID(),
)

public data class NRESARRAY(public var cItems: UInt = 0u, public var nr: List<NetworkManagement.WNet.NETRESOURCEA> = List(1) { NetworkManagement.WNet.NETRESOURCEA() })

public data class NSTCCUSTOMDRAW(
    public var psi: Long = 0L,
    public var uItemState: UInt = 0u,
    public var nstcis: UInt = 0u,
    public var pszText: PCWSTR = 0L,
    public var iImage: Int = 0,
    public var himl: Controls.HIMAGELIST = Controls.HIMAGELIST(),
    public var iLevel: Int = 0,
    public var iIndent: Int = 0,
)

public class NT_CONSOLE_PROPS(
    public var dbh: DATABLOCK_HEADER = DATABLOCK_HEADER(),
    public var wFillAttribute: UShort = 0u,
    public var wPopupFillAttribute: UShort = 0u,
    public var dwScreenBufferSize: System.Console.COORD = System.Console.COORD(),
    public var dwWindowSize: System.Console.COORD = System.Console.COORD(),
    public var dwWindowOrigin: System.Console.COORD = System.Console.COORD(),
    public var nFont: UInt = 0u,
    public var nInputBufferSize: UInt = 0u,
    public var dwFontSize: System.Console.COORD = System.Console.COORD(),
    public var uFontFamily: UInt = 0u,
    public var uFontWeight: UInt = 0u,
    public var FaceName: UShortArray = UShortArray(32),
    public var uCursorSize: UInt = 0u,
    public var bFullScreen: BOOL = 0,
    public var bQuickEdit: BOOL = 0,
    public var bInsertMode: BOOL = 0,
    public var bAutoPosition: BOOL = 0,
    public var uHistoryBufferSize: UInt = 0u,
    public var uNumberOfHistoryBuffers: UInt = 0u,
    public var bHistoryNoDup: BOOL = 0,
    public var ColorTable: List<Foundation.COLORREF> = List(16) { Foundation.COLORREF() },
)

public data class NT_FE_CONSOLE_PROPS(public var dbh: DATABLOCK_HEADER = DATABLOCK_HEADER(), public var uCodePage: UInt = 0u)

public data class OPENASINFO(
    public var pcszFile: PCWSTR = 0L,
    public var pcszClass: PCWSTR = 0L,
    public var oaifInFlags: OPEN_AS_INFO_FLAGS = 0,
)

public data class OPEN_PRINTER_PROPS_INFOA(
    public var dwSize: UInt = 0u,
    public var pszSheetName: PSTR = 0L,
    public var uSheetIndex: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bModal: BOOL = 0,
)

public data class OPEN_PRINTER_PROPS_INFOW(
    public var dwSize: UInt = 0u,
    public var pszSheetName: PWSTR = 0L,
    public var uSheetIndex: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var bModal: BOOL = 0,
)

public data class PARSEDURLA(
    public var cbSize: UInt = 0u,
    public var pszProtocol: PCSTR = 0L,
    public var cchProtocol: UInt = 0u,
    public var pszSuffix: PCSTR = 0L,
    public var cchSuffix: UInt = 0u,
    public var nScheme: UInt = 0u,
)

public data class PARSEDURLW(
    public var cbSize: UInt = 0u,
    public var pszProtocol: PCWSTR = 0L,
    public var cchProtocol: UInt = 0u,
    public var pszSuffix: PCWSTR = 0L,
    public var cchSuffix: UInt = 0u,
    public var nScheme: UInt = 0u,
)

public data class PERSIST_FOLDER_TARGET_INFO(
    public var pidlTargetFolder: Long = 0L,
    public var szTargetParsingName: UShortArray = UShortArray(260),
    public var szNetworkProvider: UShortArray = UShortArray(260),
    public var dwAttributes: UInt = 0u,
    public var csidl: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERSIST_FOLDER_TARGET_INFO) return false
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

public data class PREVIEWHANDLERFRAMEINFO(public var haccel: WindowsAndMessaging.HACCEL = WindowsAndMessaging.HACCEL(), public var cAccelEntries: UInt = 0u)

public data class PROFILEINFOA(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpUserName: PSTR = 0L,
    public var lpProfilePath: PSTR = 0L,
    public var lpDefaultPath: PSTR = 0L,
    public var lpServerName: PSTR = 0L,
    public var lpPolicyPath: PSTR = 0L,
    public var hProfile: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class PROFILEINFOW(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var lpUserName: PWSTR = 0L,
    public var lpProfilePath: PWSTR = 0L,
    public var lpDefaultPath: PWSTR = 0L,
    public var lpServerName: PWSTR = 0L,
    public var lpPolicyPath: PWSTR = 0L,
    public var hProfile: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class PUBAPPINFO(
    public var cbSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var pszSource: PWSTR = 0L,
    public var stAssigned: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var stPublished: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var stScheduled: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var stExpire: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
)

public data class QCMINFO(
    public var hmenu: WindowsAndMessaging.HMENU = WindowsAndMessaging.HMENU(),
    public var indexMenu: UInt = 0u,
    public var idCmdFirst: UInt = 0u,
    public var idCmdLast: UInt = 0u,
    public var pIdMap: Long = 0L,
)

public data class QCMINFO_IDMAP(public var nMaxIds: UInt = 0u, public var pIdList: List<QCMINFO_IDMAP_PLACEMENT> = List(1) { QCMINFO_IDMAP_PLACEMENT() })

public data class QCMINFO_IDMAP_PLACEMENT(public var id: UInt = 0u, public var fFlags: UInt = 0u)

public data class QITAB(public var piid: Long = 0L, public var dwOffset: UInt = 0u)

public data class SFVM_HELPTOPIC_DATA(public var wszHelpFile: UShortArray = UShortArray(260), public var wszHelpTopic: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SFVM_HELPTOPIC_DATA) return false
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

public data class SFVM_PROPPAGE_DATA(
    public var dwReserved: UInt = 0u,
    public var pfn: Controls.LPFNSVADDPROPSHEETPAGE = Controls.LPFNSVADDPROPSHEETPAGE(),
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
)

public data class SFV_CREATE(
    public var cbSize: UInt = 0u,
    public var pshf: Long = 0L,
    public var psvOuter: Long = 0L,
    public var psfvcb: Long = 0L,
)

public data class SFV_SETITEMPOS(public var pidl: Long = 0L, public var pt: Foundation.POINT = Foundation.POINT())

public data class SHARDAPPIDINFO(public var psi: Long = 0L, public var pszAppID: PCWSTR = 0L)

public data class SHARDAPPIDINFOIDLIST(public var pidl: Long = 0L, public var pszAppID: PCWSTR = 0L)

public data class SHARDAPPIDINFOLINK(public var psl: Long = 0L, public var pszAppID: PCWSTR = 0L)

public data class SHCOLUMNDATA(
    public var dwFlags: UInt = 0u,
    public var dwFileAttributes: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pwszExt: PWSTR = 0L,
    public var wszFile: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHCOLUMNDATA) return false
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

public data class SHCOLUMNINFO(
    public var scid: Foundation.PROPERTYKEY = Foundation.PROPERTYKEY(),
    public var vt: System.Variant.VARENUM = System.Variant.VARENUM(),
    public var fmt: UInt = 0u,
    public var cChars: UInt = 0u,
    public var csFlags: UInt = 0u,
    public var wszTitle: UShortArray = UShortArray(80),
    public var wszDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHCOLUMNINFO) return false
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

public data class SHCOLUMNINIT(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var wszFolder: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHCOLUMNINIT) return false
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

public data class SHCREATEPROCESSINFOW(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var pszFile: PCWSTR = 0L,
    public var pszParameters: PCWSTR = 0L,
    public var pszCurrentDirectory: PCWSTR = 0L,
    public var hUserToken: Foundation.HANDLE = Foundation.HANDLE(),
    public var lpProcessAttributes: Long = 0L,
    public var lpThreadAttributes: Long = 0L,
    public var bInheritHandles: BOOL = 0,
    public var dwCreationFlags: UInt = 0u,
    public var lpStartupInfo: Long = 0L,
    public var lpProcessInformation: Long = 0L,
)

public data class SHChangeDWORDAsIDList(
    public var cb: UShort = 0u,
    public var dwItem1: UInt = 0u,
    public var dwItem2: UInt = 0u,
    public var cbZero: UShort = 0u,
)

public data class SHChangeNotifyEntry(public var pidl: Long = 0L, public var fRecursive: BOOL = 0)

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

public data class SHDESCRIPTIONID(public var dwDescriptionId: UInt = 0u, public var clsid: GUID = GUID())

public data class SHDRAGIMAGE(
    public var sizeDragImage: Foundation.SIZE = Foundation.SIZE(),
    public var ptOffset: Foundation.POINT = Foundation.POINT(),
    public var hbmpDragImage: Graphics.Gdi.HBITMAP = Graphics.Gdi.HBITMAP(),
    public var crColorKey: Foundation.COLORREF = Foundation.COLORREF(),
)

public data class SHELLEXECUTEINFOA(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var lpVerb: PCSTR = 0L,
    public var lpFile: PCSTR = 0L,
    public var lpParameters: PCSTR = 0L,
    public var lpDirectory: PCSTR = 0L,
    public var nShow: Int = 0,
    public var hInstApp: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var lpIDList: Long = 0L,
    public var lpClass: PCSTR = 0L,
    public var hkeyClass: System.Registry.HKEY = System.Registry.HKEY(),
    public var dwHotKey: UInt = 0u,
    public var Anonymous: SHELLEXECUTEINFOA_0 = SHELLEXECUTEINFOA_0(),
    public var hProcess: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class SHELLEXECUTEINFOA_0(public var hIcon: Foundation.HANDLE = Foundation.HANDLE(), public var hMonitor: Foundation.HANDLE = Foundation.HANDLE())

public data class SHELLEXECUTEINFOW(
    public var cbSize: UInt = 0u,
    public var fMask: UInt = 0u,
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var lpVerb: PCWSTR = 0L,
    public var lpFile: PCWSTR = 0L,
    public var lpParameters: PCWSTR = 0L,
    public var lpDirectory: PCWSTR = 0L,
    public var nShow: Int = 0,
    public var hInstApp: Foundation.HINSTANCE = Foundation.HINSTANCE(),
    public var lpIDList: Long = 0L,
    public var lpClass: PCWSTR = 0L,
    public var hkeyClass: System.Registry.HKEY = System.Registry.HKEY(),
    public var dwHotKey: UInt = 0u,
    public var Anonymous: SHELLEXECUTEINFOW_0 = SHELLEXECUTEINFOW_0(),
    public var hProcess: Foundation.HANDLE = Foundation.HANDLE(),
)

public data class SHELLEXECUTEINFOW_0(public var hIcon: Foundation.HANDLE = Foundation.HANDLE(), public var hMonitor: Foundation.HANDLE = Foundation.HANDLE())

public data class SHELLFLAGSTATE(public var _bitfield: Int = 0)

public data class SHELLSTATEA(
    public var _bitfield1: Int = 0,
    public var dwWin95Unused: UInt = 0u,
    public var uWin95Unused: UInt = 0u,
    public var lParamSort: Int = 0,
    public var iSortDirection: Int = 0,
    public var version: UInt = 0u,
    public var uNotUsed: UInt = 0u,
    public var _bitfield2: Int = 0,
)

public data class SHELLSTATEW(
    public var _bitfield1: Int = 0,
    public var dwWin95Unused: UInt = 0u,
    public var uWin95Unused: UInt = 0u,
    public var lParamSort: Int = 0,
    public var iSortDirection: Int = 0,
    public var version: UInt = 0u,
    public var uNotUsed: UInt = 0u,
    public var _bitfield2: Int = 0,
)

public data class SHELL_ITEM_RESOURCE(public var guidType: GUID = GUID(), public var szName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHELL_ITEM_RESOURCE) return false
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

public data class SHFILEINFOA(
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var iIcon: Int = 0,
    public var dwAttributes: UInt = 0u,
    public var szDisplayName: ByteArray = ByteArray(260),
    public var szTypeName: ByteArray = ByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHFILEINFOA) return false
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

public data class SHFILEINFOW(
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var iIcon: Int = 0,
    public var dwAttributes: UInt = 0u,
    public var szDisplayName: UShortArray = UShortArray(260),
    public var szTypeName: UShortArray = UShortArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHFILEINFOW) return false
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

public data class SHFILEOPSTRUCTA(
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var wFunc: UInt = 0u,
    public var pFrom: Long = 0L,
    public var pTo: Long = 0L,
    public var fFlags: UShort = 0u,
    public var fAnyOperationsAborted: BOOL = 0,
    public var hNameMappings: Long = 0L,
    public var lpszProgressTitle: PCSTR = 0L,
)

public data class SHFILEOPSTRUCTW(
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var wFunc: UInt = 0u,
    public var pFrom: PCWSTR = 0L,
    public var pTo: PCWSTR = 0L,
    public var fFlags: UShort = 0u,
    public var fAnyOperationsAborted: BOOL = 0,
    public var hNameMappings: Long = 0L,
    public var lpszProgressTitle: PCWSTR = 0L,
)

public data class SHFOLDERCUSTOMSETTINGS(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var pvid: Long = 0L,
    public var pszWebViewTemplate: PWSTR = 0L,
    public var cchWebViewTemplate: UInt = 0u,
    public var pszWebViewTemplateVersion: PWSTR = 0L,
    public var pszInfoTip: PWSTR = 0L,
    public var cchInfoTip: UInt = 0u,
    public var pclsid: Long = 0L,
    public var dwFlags: UInt = 0u,
    public var pszIconFile: PWSTR = 0L,
    public var cchIconFile: UInt = 0u,
    public var iIconIndex: Int = 0,
    public var pszLogo: PWSTR = 0L,
    public var cchLogo: UInt = 0u,
)

public data class SHNAMEMAPPINGA(
    public var pszOldPath: PSTR = 0L,
    public var pszNewPath: PSTR = 0L,
    public var cchOldPath: Int = 0,
    public var cchNewPath: Int = 0,
)

public data class SHNAMEMAPPINGW(
    public var pszOldPath: PWSTR = 0L,
    public var pszNewPath: PWSTR = 0L,
    public var cchOldPath: Int = 0,
    public var cchNewPath: Int = 0,
)

public data class SHQUERYRBINFO(
    public var cbSize: UInt = 0u,
    public var i64Size: Long = 0L,
    public var i64NumItems: Long = 0L,
)

public data class SHSTOCKICONINFO(
    public var cbSize: UInt = 0u,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var iSysImageIndex: Int = 0,
    public var iIcon: Int = 0,
    public var szPath: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SHSTOCKICONINFO) return false
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

public data class SLOWAPPINFO(
    public var ullSize: ULong = 0uL,
    public var ftLastUsed: Foundation.FILETIME = Foundation.FILETIME(),
    public var iTimesUsed: Int = 0,
    public var pszImage: PWSTR = 0L,
)

public data class SMCSHCHANGENOTIFYSTRUCT(
    public var lEvent: Int = 0,
    public var pidl1: Long = 0L,
    public var pidl2: Long = 0L,
)

public data class SMDATA(
    public var dwMask: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hmenu: WindowsAndMessaging.HMENU = WindowsAndMessaging.HMENU(),
    public var hwnd: Foundation.HWND = Foundation.HWND(),
    public var uId: UInt = 0u,
    public var uIdParent: UInt = 0u,
    public var uIdAncestor: UInt = 0u,
    public var punk: Long = 0L,
    public var pidlFolder: Long = 0L,
    public var pidlItem: Long = 0L,
    public var psf: Long = 0L,
    public var pvUserData: Long = 0L,
)

public data class SMINFO(
    public var dwMask: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iIcon: Int = 0,
)

public data class SORTCOLUMN(public var propkey: Foundation.PROPERTYKEY = Foundation.PROPERTYKEY(), public var direction: SORTDIRECTION = 0)

public data class SV2CVW2_PARAMS(
    public var cbSize: UInt = 0u,
    public var psvPrev: Long = 0L,
    public var pfs: Long = 0L,
    public var psbOwner: Long = 0L,
    public var prcView: Long = 0L,
    public var pvid: Long = 0L,
    public var hwndView: Foundation.HWND = Foundation.HWND(),
)

public data class SYNCMGRHANDLERINFO(
    public var cbSize: UInt = 0u,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var SyncMgrHandlerFlags: UInt = 0u,
    public var wszHandlerName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYNCMGRHANDLERINFO) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hIcon != other.hIcon) return false
        if (this.SyncMgrHandlerFlags != other.SyncMgrHandlerFlags) return false
        if (!this.wszHandlerName.contentEquals(other.wszHandlerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.SyncMgrHandlerFlags.hashCode()
        result = 31 * result + this.wszHandlerName.contentHashCode()
        return result
    }
}

public data class SYNCMGRITEM(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var ItemID: GUID = GUID(),
    public var dwItemState: UInt = 0u,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var wszItemName: UShortArray = UShortArray(128),
    public var ftLastUpdate: Foundation.FILETIME = Foundation.FILETIME(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYNCMGRITEM) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ItemID != other.ItemID) return false
        if (this.dwItemState != other.dwItemState) return false
        if (this.hIcon != other.hIcon) return false
        if (!this.wszItemName.contentEquals(other.wszItemName)) return false
        if (this.ftLastUpdate != other.ftLastUpdate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.ItemID.hashCode()
        result = 31 * result + this.dwItemState.hashCode()
        result = 31 * result + this.hIcon.hashCode()
        result = 31 * result + this.wszItemName.contentHashCode()
        result = 31 * result + this.ftLastUpdate.hashCode()
        return result
    }
}

public data class SYNCMGRLOGERRORINFO(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var dwSyncMgrErrorFlags: UInt = 0u,
    public var ErrorID: GUID = GUID(),
    public var ItemID: GUID = GUID(),
)

public data class SYNCMGRPROGRESSITEM(
    public var cbSize: UInt = 0u,
    public var mask: UInt = 0u,
    public var lpcStatusText: PCWSTR = 0L,
    public var dwStatusType: UInt = 0u,
    public var iProgValue: Int = 0,
    public var iMaxValue: Int = 0,
)

public data class SYNCMGR_CONFLICT_ID_INFO(public var pblobID: Long = 0L, public var pblobExtra: Long = 0L)

public data class TBINFO(public var cbuttons: UInt = 0u, public var uFlags: UInt = 0u)

public data class THUMBBUTTON(
    public var dwMask: THUMBBUTTONMASK = 0,
    public var iId: UInt = 0u,
    public var iBitmap: UInt = 0u,
    public var hIcon: WindowsAndMessaging.HICON = WindowsAndMessaging.HICON(),
    public var szTip: UShortArray = UShortArray(260),
    public var dwFlags: THUMBBUTTONFLAGS = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is THUMBBUTTON) return false
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

public data class TOOLBARITEM(
    public var ptbar: Long = 0L,
    public var rcBorderTool: Foundation.RECT = Foundation.RECT(),
    public var pwszItem: PWSTR = 0L,
    public var fShow: BOOL = 0,
    public var hMon: Graphics.Gdi.HMONITOR = Graphics.Gdi.HMONITOR(),
)

public data class URLINVOKECOMMANDINFOA(
    public var dwcbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Foundation.HWND = Foundation.HWND(),
    public var pcszVerb: PCSTR = 0L,
)

public data class URLINVOKECOMMANDINFOW(
    public var dwcbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndParent: Foundation.HWND = Foundation.HWND(),
    public var pcszVerb: PCWSTR = 0L,
)

public data class WINDOWDATA(
    public var dwWindowID: UInt = 0u,
    public var uiCP: UInt = 0u,
    public var pidl: Long = 0L,
    public var lpszUrl: PWSTR = 0L,
    public var lpszUrlLocation: PWSTR = 0L,
    public var lpszTitle: PWSTR = 0L,
)

public data class WTS_THUMBNAILID(public var rgbKey: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WTS_THUMBNAILID) return false
        if (!this.rgbKey.contentEquals(other.rgbKey)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.rgbKey.contentHashCode()
    }
}
