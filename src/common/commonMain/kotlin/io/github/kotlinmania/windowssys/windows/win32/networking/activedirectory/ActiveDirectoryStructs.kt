@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.BFFCALLBACK
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.DLGPROC
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

public data class ADSPROPERROR(
    public var hwndPage: HWND = 0L,
    public var pszPageTitle: PWSTR = 0L,
    public var pszObjPath: PWSTR = 0L,
    public var pszObjClass: PWSTR = 0L,
    public var hr: HRESULT = 0,
    public var pszError: PWSTR = 0L,
)

public data class ADSPROPINITPARAMS(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hr: HRESULT = 0,
    public var pDsObj: Long = 0L,
    public var pwzCN: PWSTR = 0L,
    public var pWritableAttrs: Long = 0L,
)

public data class ADSVALUE(public var dwType: ADSTYPE = 0, public var Anonymous: ADSVALUE_0 = ADSVALUE_0())

public class ADSVALUE_0(
    public var DNString: Long = 0L,
    public var CaseExactString: Long = 0L,
    public var CaseIgnoreString: Long = 0L,
    public var PrintableString: Long = 0L,
    public var NumericString: Long = 0L,
    public var Boolean: UInt = 0u,
    public var Integer: UInt = 0u,
    public var OctetString: ADS_OCTET_STRING = ADS_OCTET_STRING(),
    public var UTCTime: SYSTEMTIME = SYSTEMTIME(),
    public var LargeInteger: Long = 0L,
    public var ClassName: Long = 0L,
    public var ProviderSpecific: ADS_PROV_SPECIFIC = ADS_PROV_SPECIFIC(),
    public var pCaseIgnoreList: Long = 0L,
    public var pOctetList: Long = 0L,
    public var pPath: Long = 0L,
    public var pPostalAddress: Long = 0L,
    public var Timestamp: ADS_TIMESTAMP = ADS_TIMESTAMP(),
    public var BackLink: ADS_BACKLINK = ADS_BACKLINK(),
    public var pTypedName: Long = 0L,
    public var Hold: ADS_HOLD = ADS_HOLD(),
    public var pNetAddress: Long = 0L,
    public var pReplicaPointer: Long = 0L,
    public var pFaxNumber: Long = 0L,
    public var Email: ADS_EMAIL = ADS_EMAIL(),
    public var SecurityDescriptor: ADS_NT_SECURITY_DESCRIPTOR = ADS_NT_SECURITY_DESCRIPTOR(),
    public var pDNWithBinary: Long = 0L,
    public var pDNWithString: Long = 0L,
)

public data class ADS_ATTR_DEF(
    public var pszAttrName: PWSTR = 0L,
    public var dwADsType: ADSTYPE = 0,
    public var dwMinRange: UInt = 0u,
    public var dwMaxRange: UInt = 0u,
    public var fMultiValued: BOOL = 0,
)

public data class ADS_ATTR_INFO(
    public var pszAttrName: PWSTR = 0L,
    public var dwControlCode: UInt = 0u,
    public var dwADsType: ADSTYPE = 0,
    public var pADsValues: Long = 0L,
    public var dwNumValues: UInt = 0u,
)

public data class ADS_BACKLINK(public var RemoteID: UInt = 0u, public var ObjectName: PWSTR = 0L)

public data class ADS_CASEIGNORE_LIST(public var Next: Long = 0L, public var String: PWSTR = 0L)

public data class ADS_CLASS_DEF(
    public var pszClassName: PWSTR = 0L,
    public var dwMandatoryAttrs: UInt = 0u,
    public var ppszMandatoryAttrs: Long = 0L,
    public var optionalAttrs: UInt = 0u,
    public var ppszOptionalAttrs: Long = 0L,
    public var dwNamingAttrs: UInt = 0u,
    public var ppszNamingAttrs: Long = 0L,
    public var dwSuperClasses: UInt = 0u,
    public var ppszSuperClasses: Long = 0L,
    public var fIsContainer: BOOL = 0,
)

public data class ADS_DN_WITH_BINARY(
    public var dwLength: UInt = 0u,
    public var lpBinaryValue: Long = 0L,
    public var pszDNString: PWSTR = 0L,
)

public data class ADS_DN_WITH_STRING(public var pszStringValue: PWSTR = 0L, public var pszDNString: PWSTR = 0L)

public data class ADS_EMAIL(public var Address: PWSTR = 0L, public var Type: UInt = 0u)

public data class ADS_FAXNUMBER(
    public var TelephoneNumber: PWSTR = 0L,
    public var NumberOfBits: UInt = 0u,
    public var Parameters: Long = 0L,
)

public data class ADS_HOLD(public var ObjectName: PWSTR = 0L, public var Amount: UInt = 0u)

public data class ADS_NETADDRESS(
    public var AddressType: UInt = 0u,
    public var AddressLength: UInt = 0u,
    public var Address: Long = 0L,
)

public data class ADS_NT_SECURITY_DESCRIPTOR(public var dwLength: UInt = 0u, public var lpValue: Long = 0L)

public data class ADS_OBJECT_INFO(
    public var pszRDN: PWSTR = 0L,
    public var pszObjectDN: PWSTR = 0L,
    public var pszParentDN: PWSTR = 0L,
    public var pszSchemaDN: PWSTR = 0L,
    public var pszClassName: PWSTR = 0L,
)

public data class ADS_OCTET_LIST(
    public var Next: Long = 0L,
    public var Length: UInt = 0u,
    public var Data: Long = 0L,
)

public data class ADS_OCTET_STRING(public var dwLength: UInt = 0u, public var lpValue: Long = 0L)

public data class ADS_PATH(
    public var Type: UInt = 0u,
    public var VolumeName: PWSTR = 0L,
    public var Path: PWSTR = 0L,
)

public data class ADS_POSTALADDRESS(public var PostalAddress: LongArray = LongArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ADS_POSTALADDRESS) return false
        if (!this.PostalAddress.contentEquals(other.PostalAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.PostalAddress.contentHashCode()
    }
}

public data class ADS_PROV_SPECIFIC(public var dwLength: UInt = 0u, public var lpValue: Long = 0L)

public data class ADS_REPLICAPOINTER(
    public var ServerName: PWSTR = 0L,
    public var ReplicaType: UInt = 0u,
    public var ReplicaNumber: UInt = 0u,
    public var Count: UInt = 0u,
    public var ReplicaAddressHints: Long = 0L,
)

public data class ADS_SEARCHPREF_INFO(
    public var dwSearchPref: ADS_SEARCHPREF_ENUM = 0,
    public var vValue: ADSVALUE = ADSVALUE(),
    public var dwStatus: ADS_STATUSENUM = 0,
)

public data class ADS_SEARCH_COLUMN(
    public var pszAttrName: PWSTR = 0L,
    public var dwADsType: ADSTYPE = 0,
    public var pADsValues: Long = 0L,
    public var dwNumValues: UInt = 0u,
    public var hReserved: HANDLE = 0L,
)

public data class ADS_SORTKEY(
    public var pszAttrType: PWSTR = 0L,
    public var pszReserved: PWSTR = 0L,
    public var fReverseorder: Boolean = false,
)

public data class ADS_TIMESTAMP(public var WholeSeconds: UInt = 0u, public var EventID: UInt = 0u)

public data class ADS_TYPEDNAME(
    public var ObjectName: PWSTR = 0L,
    public var Level: UInt = 0u,
    public var Interval: UInt = 0u,
)

public data class ADS_VLV(
    public var dwBeforeCount: UInt = 0u,
    public var dwAfterCount: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwContentCount: UInt = 0u,
    public var pszTarget: PWSTR = 0L,
    public var dwContextIDLength: UInt = 0u,
    public var lpContextID: Long = 0L,
)

public data class CQFORM(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var clsid: GUID = GUID(),
    public var hIcon: HICON = 0L,
    public var pszTitle: PCWSTR = 0L,
)

public data class CQPAGE(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pPageProc: LPCQPAGEPROC = null,
    public var hInstance: HINSTANCE = 0L,
    public var idPageName: Int = 0,
    public var idPageTemplate: Int = 0,
    public var pDlgProc: DLGPROC = null,
    public var lParam: LPARAM = 0L,
)

public data class DOMAINDESC(
    public var pszName: PWSTR = 0L,
    public var pszPath: PWSTR = 0L,
    public var pszNCName: PWSTR = 0L,
    public var pszTrustParent: PWSTR = 0L,
    public var pszObjectClass: PWSTR = 0L,
    public var ulFlags: UInt = 0u,
    public var fDownLevel: BOOL = 0,
    public var pdChildList: Long = 0L,
    public var pdNextSibling: Long = 0L,
)

public data class DOMAIN_CONTROLLER_INFOA(
    public var DomainControllerName: PSTR = 0L,
    public var DomainControllerAddress: PSTR = 0L,
    public var DomainControllerAddressType: UInt = 0u,
    public var DomainGuid: GUID = GUID(),
    public var DomainName: PSTR = 0L,
    public var DnsForestName: PSTR = 0L,
    public var Flags: UInt = 0u,
    public var DcSiteName: PSTR = 0L,
    public var ClientSiteName: PSTR = 0L,
)

public data class DOMAIN_CONTROLLER_INFOW(
    public var DomainControllerName: PWSTR = 0L,
    public var DomainControllerAddress: PWSTR = 0L,
    public var DomainControllerAddressType: UInt = 0u,
    public var DomainGuid: GUID = GUID(),
    public var DomainName: PWSTR = 0L,
    public var DnsForestName: PWSTR = 0L,
    public var Flags: UInt = 0u,
    public var DcSiteName: PWSTR = 0L,
    public var ClientSiteName: PWSTR = 0L,
)

public data class DOMAIN_TREE(
    public var dsSize: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var aDomains: List<DOMAINDESC> = List(1) { DOMAINDESC() },
)

public data class DSA_NEWOBJ_DISPINFO(
    public var dwSize: UInt = 0u,
    public var hObjClassIcon: HICON = 0L,
    public var lpszWizTitle: PWSTR = 0L,
    public var lpszContDisplayName: PWSTR = 0L,
)

public data class DSBITEMA(
    public var cbStruct: UInt = 0u,
    public var pszADsPath: PCWSTR = 0L,
    public var pszClass: PCWSTR = 0L,
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStateMask: UInt = 0u,
    public var szDisplayName: ByteArray = ByteArray(64),
    public var szIconLocation: ByteArray = ByteArray(260),
    public var iIconResID: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DSBITEMA) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszADsPath != other.pszADsPath) return false
        if (this.pszClass != other.pszClass) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szIconLocation.contentEquals(other.szIconLocation)) return false
        if (this.iIconResID != other.iIconResID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszADsPath.hashCode()
        result = 31 * result + this.pszClass.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szIconLocation.contentHashCode()
        result = 31 * result + this.iIconResID.hashCode()
        return result
    }
}

public data class DSBITEMW(
    public var cbStruct: UInt = 0u,
    public var pszADsPath: PCWSTR = 0L,
    public var pszClass: PCWSTR = 0L,
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStateMask: UInt = 0u,
    public var szDisplayName: UShortArray = UShortArray(64),
    public var szIconLocation: UShortArray = UShortArray(260),
    public var iIconResID: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DSBITEMW) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pszADsPath != other.pszADsPath) return false
        if (this.pszClass != other.pszClass) return false
        if (this.dwMask != other.dwMask) return false
        if (this.dwState != other.dwState) return false
        if (this.dwStateMask != other.dwStateMask) return false
        if (!this.szDisplayName.contentEquals(other.szDisplayName)) return false
        if (!this.szIconLocation.contentEquals(other.szIconLocation)) return false
        if (this.iIconResID != other.iIconResID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pszADsPath.hashCode()
        result = 31 * result + this.pszClass.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwStateMask.hashCode()
        result = 31 * result + this.szDisplayName.contentHashCode()
        result = 31 * result + this.szIconLocation.contentHashCode()
        result = 31 * result + this.iIconResID.hashCode()
        return result
    }
}

public data class DSBROWSEINFOA(
    public var cbStruct: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var pszCaption: PCSTR = 0L,
    public var pszTitle: PCSTR = 0L,
    public var pszRoot: PCWSTR = 0L,
    public var pszPath: PWSTR = 0L,
    public var cchPath: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pfnCallback: BFFCALLBACK = null,
    public var lParam: LPARAM = 0L,
    public var dwReturnFormat: UInt = 0u,
    public var pUserName: PCWSTR = 0L,
    public var pPassword: PCWSTR = 0L,
    public var pszObjectClass: PWSTR = 0L,
    public var cchObjectClass: UInt = 0u,
)

public data class DSBROWSEINFOW(
    public var cbStruct: UInt = 0u,
    public var hwndOwner: HWND = 0L,
    public var pszCaption: PCWSTR = 0L,
    public var pszTitle: PCWSTR = 0L,
    public var pszRoot: PCWSTR = 0L,
    public var pszPath: PWSTR = 0L,
    public var cchPath: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pfnCallback: BFFCALLBACK = null,
    public var lParam: LPARAM = 0L,
    public var dwReturnFormat: UInt = 0u,
    public var pUserName: PCWSTR = 0L,
    public var pPassword: PCWSTR = 0L,
    public var pszObjectClass: PWSTR = 0L,
    public var cchObjectClass: UInt = 0u,
)

public data class DSCLASSCREATIONINFO(
    public var dwFlags: UInt = 0u,
    public var clsidWizardDialog: GUID = GUID(),
    public var clsidWizardPrimaryPage: GUID = GUID(),
    public var cWizardExtensions: UInt = 0u,
    public var aWizardExtensions: List<GUID> = List(1) { GUID() },
)

public data class DSCOLUMN(
    public var dwFlags: UInt = 0u,
    public var fmt: Int = 0,
    public var cx: Int = 0,
    public var idsName: Int = 0,
    public var offsetProperty: Int = 0,
    public var dwReserved: UInt = 0u,
)

public data class DSDISPLAYSPECOPTIONS(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var offsetAttribPrefix: UInt = 0u,
    public var offsetUserName: UInt = 0u,
    public var offsetPassword: UInt = 0u,
    public var offsetServer: UInt = 0u,
    public var offsetServerConfigPath: UInt = 0u,
)

public data class DSOBJECT(
    public var dwFlags: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var offsetName: UInt = 0u,
    public var offsetClass: UInt = 0u,
)

public data class DSOBJECTNAMES(
    public var clsidNamespace: GUID = GUID(),
    public var cItems: UInt = 0u,
    public var aObjects: List<DSOBJECT> = List(1) { DSOBJECT() },
)

public data class DSOP_FILTER_FLAGS(public var Uplevel: DSOP_UPLEVEL_FILTER_FLAGS = DSOP_UPLEVEL_FILTER_FLAGS(), public var flDownlevel: UInt = 0u)

public data class DSOP_INIT_INFO(
    public var cbSize: UInt = 0u,
    public var pwzTargetComputer: PCWSTR = 0L,
    public var cDsScopeInfos: UInt = 0u,
    public var aDsScopeInfos: Long = 0L,
    public var flOptions: UInt = 0u,
    public var cAttributesToFetch: UInt = 0u,
    public var apwzAttributeNames: Long = 0L,
)

public data class DSOP_SCOPE_INIT_INFO(
    public var cbSize: UInt = 0u,
    public var flType: UInt = 0u,
    public var flScope: UInt = 0u,
    public var FilterFlags: DSOP_FILTER_FLAGS = DSOP_FILTER_FLAGS(),
    public var pwzDcName: PCWSTR = 0L,
    public var pwzADsPath: PCWSTR = 0L,
    public var hr: HRESULT = 0,
)

public data class DSOP_UPLEVEL_FILTER_FLAGS(
    public var flBothModes: UInt = 0u,
    public var flMixedModeOnly: UInt = 0u,
    public var flNativeModeOnly: UInt = 0u,
)

public data class DSPROPERTYPAGEINFO(public var offsetString: UInt = 0u)

public data class DSQUERYCLASSLIST(
    public var cbStruct: UInt = 0u,
    public var cClasses: Int = 0,
    public var offsetClass: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DSQUERYCLASSLIST) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.cClasses != other.cClasses) return false
        if (!this.offsetClass.contentEquals(other.offsetClass)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.cClasses.hashCode()
        result = 31 * result + this.offsetClass.contentHashCode()
        return result
    }
}

public data class DSQUERYINITPARAMS(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pDefaultScope: PWSTR = 0L,
    public var pDefaultSaveLocation: PWSTR = 0L,
    public var pUserName: PWSTR = 0L,
    public var pPassword: PWSTR = 0L,
    public var pServer: PWSTR = 0L,
)

public data class DSQUERYPARAMS(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: HINSTANCE = 0L,
    public var offsetQuery: Int = 0,
    public var iColumns: Int = 0,
    public var dwReserved: UInt = 0u,
    public var aColumns: List<DSCOLUMN> = List(1) { DSCOLUMN() },
)

public data class DSROLE_OPERATION_STATE_INFO(public var OperationState: DSROLE_OPERATION_STATE = 0)

public data class DSROLE_PRIMARY_DOMAIN_INFO_BASIC(
    public var MachineRole: DSROLE_MACHINE_ROLE = 0,
    public var Flags: UInt = 0u,
    public var DomainNameFlat: PWSTR = 0L,
    public var DomainNameDns: PWSTR = 0L,
    public var DomainForestName: PWSTR = 0L,
    public var DomainGuid: GUID = GUID(),
)

public data class DSROLE_UPGRADE_STATUS_INFO(public var OperationState: UInt = 0u, public var PreviousServerState: DSROLE_SERVER_STATE = 0)

public data class DS_DOMAIN_CONTROLLER_INFO_1A(
    public var NetbiosName: PSTR = 0L,
    public var DnsHostName: PSTR = 0L,
    public var SiteName: PSTR = 0L,
    public var ComputerObjectName: PSTR = 0L,
    public var ServerObjectName: PSTR = 0L,
    public var fIsPdc: BOOL = 0,
    public var fDsEnabled: BOOL = 0,
)

public data class DS_DOMAIN_CONTROLLER_INFO_1W(
    public var NetbiosName: PWSTR = 0L,
    public var DnsHostName: PWSTR = 0L,
    public var SiteName: PWSTR = 0L,
    public var ComputerObjectName: PWSTR = 0L,
    public var ServerObjectName: PWSTR = 0L,
    public var fIsPdc: BOOL = 0,
    public var fDsEnabled: BOOL = 0,
)

public data class DS_DOMAIN_CONTROLLER_INFO_2A(
    public var NetbiosName: PSTR = 0L,
    public var DnsHostName: PSTR = 0L,
    public var SiteName: PSTR = 0L,
    public var SiteObjectName: PSTR = 0L,
    public var ComputerObjectName: PSTR = 0L,
    public var ServerObjectName: PSTR = 0L,
    public var NtdsDsaObjectName: PSTR = 0L,
    public var fIsPdc: BOOL = 0,
    public var fDsEnabled: BOOL = 0,
    public var fIsGc: BOOL = 0,
    public var SiteObjectGuid: GUID = GUID(),
    public var ComputerObjectGuid: GUID = GUID(),
    public var ServerObjectGuid: GUID = GUID(),
    public var NtdsDsaObjectGuid: GUID = GUID(),
)

public data class DS_DOMAIN_CONTROLLER_INFO_2W(
    public var NetbiosName: PWSTR = 0L,
    public var DnsHostName: PWSTR = 0L,
    public var SiteName: PWSTR = 0L,
    public var SiteObjectName: PWSTR = 0L,
    public var ComputerObjectName: PWSTR = 0L,
    public var ServerObjectName: PWSTR = 0L,
    public var NtdsDsaObjectName: PWSTR = 0L,
    public var fIsPdc: BOOL = 0,
    public var fDsEnabled: BOOL = 0,
    public var fIsGc: BOOL = 0,
    public var SiteObjectGuid: GUID = GUID(),
    public var ComputerObjectGuid: GUID = GUID(),
    public var ServerObjectGuid: GUID = GUID(),
    public var NtdsDsaObjectGuid: GUID = GUID(),
)

public data class DS_DOMAIN_CONTROLLER_INFO_3A(
    public var NetbiosName: PSTR = 0L,
    public var DnsHostName: PSTR = 0L,
    public var SiteName: PSTR = 0L,
    public var SiteObjectName: PSTR = 0L,
    public var ComputerObjectName: PSTR = 0L,
    public var ServerObjectName: PSTR = 0L,
    public var NtdsDsaObjectName: PSTR = 0L,
    public var fIsPdc: BOOL = 0,
    public var fDsEnabled: BOOL = 0,
    public var fIsGc: BOOL = 0,
    public var fIsRodc: BOOL = 0,
    public var SiteObjectGuid: GUID = GUID(),
    public var ComputerObjectGuid: GUID = GUID(),
    public var ServerObjectGuid: GUID = GUID(),
    public var NtdsDsaObjectGuid: GUID = GUID(),
)

public data class DS_DOMAIN_CONTROLLER_INFO_3W(
    public var NetbiosName: PWSTR = 0L,
    public var DnsHostName: PWSTR = 0L,
    public var SiteName: PWSTR = 0L,
    public var SiteObjectName: PWSTR = 0L,
    public var ComputerObjectName: PWSTR = 0L,
    public var ServerObjectName: PWSTR = 0L,
    public var NtdsDsaObjectName: PWSTR = 0L,
    public var fIsPdc: BOOL = 0,
    public var fDsEnabled: BOOL = 0,
    public var fIsGc: BOOL = 0,
    public var fIsRodc: BOOL = 0,
    public var SiteObjectGuid: GUID = GUID(),
    public var ComputerObjectGuid: GUID = GUID(),
    public var ServerObjectGuid: GUID = GUID(),
    public var NtdsDsaObjectGuid: GUID = GUID(),
)

public data class DS_DOMAIN_TRUSTSA(
    public var NetbiosDomainName: PSTR = 0L,
    public var DnsDomainName: PSTR = 0L,
    public var Flags: UInt = 0u,
    public var ParentIndex: UInt = 0u,
    public var TrustType: UInt = 0u,
    public var TrustAttributes: UInt = 0u,
    public var DomainSid: PSID = 0L,
    public var DomainGuid: GUID = GUID(),
)

public data class DS_DOMAIN_TRUSTSW(
    public var NetbiosDomainName: PWSTR = 0L,
    public var DnsDomainName: PWSTR = 0L,
    public var Flags: UInt = 0u,
    public var ParentIndex: UInt = 0u,
    public var TrustType: UInt = 0u,
    public var TrustAttributes: UInt = 0u,
    public var DomainSid: PSID = 0L,
    public var DomainGuid: GUID = GUID(),
)

public data class DS_NAME_RESULTA(public var cItems: UInt = 0u, public var rItems: Long = 0L)

public data class DS_NAME_RESULTW(public var cItems: UInt = 0u, public var rItems: Long = 0L)

public data class DS_NAME_RESULT_ITEMA(
    public var status: UInt = 0u,
    public var pDomain: PSTR = 0L,
    public var pName: PSTR = 0L,
)

public data class DS_NAME_RESULT_ITEMW(
    public var status: UInt = 0u,
    public var pDomain: PWSTR = 0L,
    public var pName: PWSTR = 0L,
)

public data class DS_REPL_ATTR_META_DATA(
    public var pszAttributeName: PWSTR = 0L,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
)

public data class DS_REPL_ATTR_META_DATA_2(
    public var pszAttributeName: PWSTR = 0L,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var pszLastOriginatingDsaDN: PWSTR = 0L,
)

public data class DS_REPL_ATTR_META_DATA_BLOB(
    public var oszAttributeName: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
)

public data class DS_REPL_ATTR_VALUE_META_DATA(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DS_REPL_VALUE_META_DATA> = List(1) { DS_REPL_VALUE_META_DATA() },
)

public data class DS_REPL_ATTR_VALUE_META_DATA_2(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DS_REPL_VALUE_META_DATA_2> = List(1) { DS_REPL_VALUE_META_DATA_2() },
)

public data class DS_REPL_ATTR_VALUE_META_DATA_EXT(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DS_REPL_VALUE_META_DATA_EXT> = List(1) { DS_REPL_VALUE_META_DATA_EXT() },
)

public data class DS_REPL_CURSOR(public var uuidSourceDsaInvocationID: GUID = GUID(), public var usnAttributeFilter: Long = 0L)

public data class DS_REPL_CURSORS(
    public var cNumCursors: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgCursor: List<DS_REPL_CURSOR> = List(1) { DS_REPL_CURSOR() },
)

public data class DS_REPL_CURSORS_2(
    public var cNumCursors: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgCursor: List<DS_REPL_CURSOR_2> = List(1) { DS_REPL_CURSOR_2() },
)

public data class DS_REPL_CURSORS_3W(
    public var cNumCursors: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgCursor: List<DS_REPL_CURSOR_3W> = List(1) { DS_REPL_CURSOR_3W() },
)

public data class DS_REPL_CURSOR_2(
    public var uuidSourceDsaInvocationID: GUID = GUID(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: FILETIME = FILETIME(),
)

public data class DS_REPL_CURSOR_3W(
    public var uuidSourceDsaInvocationID: GUID = GUID(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: FILETIME = FILETIME(),
    public var pszSourceDsaDN: PWSTR = 0L,
)

public data class DS_REPL_CURSOR_BLOB(
    public var uuidSourceDsaInvocationID: GUID = GUID(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: FILETIME = FILETIME(),
    public var oszSourceDsaDN: UInt = 0u,
)

public data class DS_REPL_KCC_DSA_FAILURESW(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgDsaFailure: List<DS_REPL_KCC_DSA_FAILUREW> = List(1) { DS_REPL_KCC_DSA_FAILUREW() },
)

public data class DS_REPL_KCC_DSA_FAILUREW(
    public var pszDsaDN: PWSTR = 0L,
    public var uuidDsaObjGuid: GUID = GUID(),
    public var ftimeFirstFailure: FILETIME = FILETIME(),
    public var cNumFailures: UInt = 0u,
    public var dwLastResult: UInt = 0u,
)

public data class DS_REPL_KCC_DSA_FAILUREW_BLOB(
    public var oszDsaDN: UInt = 0u,
    public var uuidDsaObjGuid: GUID = GUID(),
    public var ftimeFirstFailure: FILETIME = FILETIME(),
    public var cNumFailures: UInt = 0u,
    public var dwLastResult: UInt = 0u,
)

public data class DS_REPL_NEIGHBORSW(
    public var cNumNeighbors: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgNeighbor: List<DS_REPL_NEIGHBORW> = List(1) { DS_REPL_NEIGHBORW() },
)

public data class DS_REPL_NEIGHBORW(
    public var pszNamingContext: PWSTR = 0L,
    public var pszSourceDsaDN: PWSTR = 0L,
    public var pszSourceDsaAddress: PWSTR = 0L,
    public var pszAsyncIntersiteTransportDN: PWSTR = 0L,
    public var dwReplicaFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var uuidNamingContextObjGuid: GUID = GUID(),
    public var uuidSourceDsaObjGuid: GUID = GUID(),
    public var uuidSourceDsaInvocationID: GUID = GUID(),
    public var uuidAsyncIntersiteTransportObjGuid: GUID = GUID(),
    public var usnLastObjChangeSynced: Long = 0L,
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: FILETIME = FILETIME(),
    public var ftimeLastSyncAttempt: FILETIME = FILETIME(),
    public var dwLastSyncResult: UInt = 0u,
    public var cNumConsecutiveSyncFailures: UInt = 0u,
)

public data class DS_REPL_NEIGHBORW_BLOB(
    public var oszNamingContext: UInt = 0u,
    public var oszSourceDsaDN: UInt = 0u,
    public var oszSourceDsaAddress: UInt = 0u,
    public var oszAsyncIntersiteTransportDN: UInt = 0u,
    public var dwReplicaFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var uuidNamingContextObjGuid: GUID = GUID(),
    public var uuidSourceDsaObjGuid: GUID = GUID(),
    public var uuidSourceDsaInvocationID: GUID = GUID(),
    public var uuidAsyncIntersiteTransportObjGuid: GUID = GUID(),
    public var usnLastObjChangeSynced: Long = 0L,
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: FILETIME = FILETIME(),
    public var ftimeLastSyncAttempt: FILETIME = FILETIME(),
    public var dwLastSyncResult: UInt = 0u,
    public var cNumConsecutiveSyncFailures: UInt = 0u,
)

public data class DS_REPL_OBJ_META_DATA(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgMetaData: List<DS_REPL_ATTR_META_DATA> = List(1) { DS_REPL_ATTR_META_DATA() },
)

public data class DS_REPL_OBJ_META_DATA_2(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgMetaData: List<DS_REPL_ATTR_META_DATA_2> = List(1) { DS_REPL_ATTR_META_DATA_2() },
)

public data class DS_REPL_OPW(
    public var ftimeEnqueued: FILETIME = FILETIME(),
    public var ulSerialNumber: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var OpType: DS_REPL_OP_TYPE = 0,
    public var ulOptions: UInt = 0u,
    public var pszNamingContext: PWSTR = 0L,
    public var pszDsaDN: PWSTR = 0L,
    public var pszDsaAddress: PWSTR = 0L,
    public var uuidNamingContextObjGuid: GUID = GUID(),
    public var uuidDsaObjGuid: GUID = GUID(),
)

public data class DS_REPL_OPW_BLOB(
    public var ftimeEnqueued: FILETIME = FILETIME(),
    public var ulSerialNumber: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var OpType: DS_REPL_OP_TYPE = 0,
    public var ulOptions: UInt = 0u,
    public var oszNamingContext: UInt = 0u,
    public var oszDsaDN: UInt = 0u,
    public var oszDsaAddress: UInt = 0u,
    public var uuidNamingContextObjGuid: GUID = GUID(),
    public var uuidDsaObjGuid: GUID = GUID(),
)

public data class DS_REPL_PENDING_OPSW(
    public var ftimeCurrentOpStarted: FILETIME = FILETIME(),
    public var cNumPendingOps: UInt = 0u,
    public var rgPendingOp: List<DS_REPL_OPW> = List(1) { DS_REPL_OPW() },
)

public data class DS_REPL_QUEUE_STATISTICSW(
    public var ftimeCurrentOpStarted: FILETIME = FILETIME(),
    public var cNumPendingOps: UInt = 0u,
    public var ftimeOldestSync: FILETIME = FILETIME(),
    public var ftimeOldestAdd: FILETIME = FILETIME(),
    public var ftimeOldestMod: FILETIME = FILETIME(),
    public var ftimeOldestDel: FILETIME = FILETIME(),
    public var ftimeOldestUpdRefs: FILETIME = FILETIME(),
)

public data class DS_REPL_VALUE_META_DATA(
    public var pszAttributeName: PWSTR = 0L,
    public var pszObjectDn: PWSTR = 0L,
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
    public var ftimeDeleted: FILETIME = FILETIME(),
    public var ftimeCreated: FILETIME = FILETIME(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
)

public data class DS_REPL_VALUE_META_DATA_2(
    public var pszAttributeName: PWSTR = 0L,
    public var pszObjectDn: PWSTR = 0L,
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
    public var ftimeDeleted: FILETIME = FILETIME(),
    public var ftimeCreated: FILETIME = FILETIME(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var pszLastOriginatingDsaDN: PWSTR = 0L,
)

public data class DS_REPL_VALUE_META_DATA_BLOB(
    public var oszAttributeName: UInt = 0u,
    public var oszObjectDn: UInt = 0u,
    public var cbData: UInt = 0u,
    public var obData: UInt = 0u,
    public var ftimeDeleted: FILETIME = FILETIME(),
    public var ftimeCreated: FILETIME = FILETIME(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
)

public data class DS_REPL_VALUE_META_DATA_BLOB_EXT(
    public var oszAttributeName: UInt = 0u,
    public var oszObjectDn: UInt = 0u,
    public var cbData: UInt = 0u,
    public var obData: UInt = 0u,
    public var ftimeDeleted: FILETIME = FILETIME(),
    public var ftimeCreated: FILETIME = FILETIME(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
    public var dwUserIdentifier: UInt = 0u,
    public var dwPriorLinkState: UInt = 0u,
    public var dwCurrentLinkState: UInt = 0u,
)

public data class DS_REPL_VALUE_META_DATA_EXT(
    public var pszAttributeName: PWSTR = 0L,
    public var pszObjectDn: PWSTR = 0L,
    public var cbData: UInt = 0u,
    public var pbData: Long = 0L,
    public var ftimeDeleted: FILETIME = FILETIME(),
    public var ftimeCreated: FILETIME = FILETIME(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: FILETIME = FILETIME(),
    public var uuidLastOriginatingDsaInvocationID: GUID = GUID(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var pszLastOriginatingDsaDN: PWSTR = 0L,
    public var dwUserIdentifier: UInt = 0u,
    public var dwPriorLinkState: UInt = 0u,
    public var dwCurrentLinkState: UInt = 0u,
)

public data class DS_REPSYNCALL_ERRINFOA(
    public var pszSvrId: PSTR = 0L,
    public var error: DS_REPSYNCALL_ERROR = 0,
    public var dwWin32Err: UInt = 0u,
    public var pszSrcId: PSTR = 0L,
)

public data class DS_REPSYNCALL_ERRINFOW(
    public var pszSvrId: PWSTR = 0L,
    public var error: DS_REPSYNCALL_ERROR = 0,
    public var dwWin32Err: UInt = 0u,
    public var pszSrcId: PWSTR = 0L,
)

public data class DS_REPSYNCALL_SYNCA(
    public var pszSrcId: PSTR = 0L,
    public var pszDstId: PSTR = 0L,
    public var pszNC: PSTR = 0L,
    public var pguidSrc: Long = 0L,
    public var pguidDst: Long = 0L,
)

public data class DS_REPSYNCALL_SYNCW(
    public var pszSrcId: PWSTR = 0L,
    public var pszDstId: PWSTR = 0L,
    public var pszNC: PWSTR = 0L,
    public var pguidSrc: Long = 0L,
    public var pguidDst: Long = 0L,
)

public data class DS_REPSYNCALL_UPDATEA(
    public var event: DS_REPSYNCALL_EVENT = 0,
    public var pErrInfo: Long = 0L,
    public var pSync: Long = 0L,
)

public data class DS_REPSYNCALL_UPDATEW(
    public var event: DS_REPSYNCALL_EVENT = 0,
    public var pErrInfo: Long = 0L,
    public var pSync: Long = 0L,
)

public data class DS_SCHEMA_GUID_MAPA(
    public var guid: GUID = GUID(),
    public var guidType: UInt = 0u,
    public var pName: PSTR = 0L,
)

public data class DS_SCHEMA_GUID_MAPW(
    public var guid: GUID = GUID(),
    public var guidType: UInt = 0u,
    public var pName: PWSTR = 0L,
)

public data class DS_SELECTION(
    public var pwzName: PWSTR = 0L,
    public var pwzADsPath: PWSTR = 0L,
    public var pwzClass: PWSTR = 0L,
    public var pwzUPN: PWSTR = 0L,
    public var pvarFetchedAttributes: Long = 0L,
    public var flScopeType: UInt = 0u,
)

public data class DS_SELECTION_LIST(
    public var cItems: UInt = 0u,
    public var cFetchedAttributes: UInt = 0u,
    public var aDsSelection: List<DS_SELECTION> = List(1) { DS_SELECTION() },
)

public data class DS_SITE_COST_INFO(public var errorCode: UInt = 0u, public var cost: UInt = 0u)

public data class OPENQUERYWINDOW(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var clsidHandler: GUID = GUID(),
    public var pHandlerParameters: Long = 0L,
    public var clsidDefaultForm: GUID = GUID(),
    public var pPersistQuery: Long = 0L,
    public var Anonymous: OPENQUERYWINDOW_0 = OPENQUERYWINDOW_0(),
)

public data class OPENQUERYWINDOW_0(public var pFormParameters: Long = 0L, public var ppbFormParameters: Long = 0L)

public data class SCHEDULE(
    public var Size: UInt = 0u,
    public var Bandwidth: UInt = 0u,
    public var NumberOfSchedules: UInt = 0u,
    public var Schedules: List<SCHEDULE_HEADER> = List(1) { SCHEDULE_HEADER() },
)

public data class SCHEDULE_HEADER(public var Type: UInt = 0u, public var Offset: UInt = 0u)
