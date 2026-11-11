@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.Bffcallback
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public data class Adsproperror(
    public var hwndPage: Hwnd = null,
    public var pszPageTitle: Pwstr = null,
    public var pszObjPath: Pwstr = null,
    public var pszObjClass: Pwstr = null,
    public var hr: Hresult = 0,
    public var pszError: Pwstr = null,
)

public data class Adspropinitparams(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hr: Hresult = 0,
    public var pDsObj: COpaquePointer? = null,
    public var pwzCN: Pwstr = null,
    public var pWritableAttrs: AdsAttrInfo? = null,
)

public data class Adsvalue(
    public var dwType: Adstype = 0,
    public var anonymous: Adsvalue0 = Adsvalue0(),
)

public class Adsvalue0(
    public var dNString: COpaquePointer? = null,
    public var caseExactString: COpaquePointer? = null,
    public var caseIgnoreString: COpaquePointer? = null,
    public var printableString: COpaquePointer? = null,
    public var numericString: COpaquePointer? = null,
    public var boolean: UInt = 0u,
    public var integer: UInt = 0u,
    public var octetString: AdsOctetString = AdsOctetString(),
    public var uTCTime: Systemtime = Systemtime(),
    public var largeInteger: Long = 0L,
    public var clsName: COpaquePointer? = null,
    public var providerSpecific: AdsProvSpecific = AdsProvSpecific(),
    public var pCaseIgnoreList: AdsCaseignoreList? = null,
    public var pOctetList: AdsOctetList? = null,
    public var pPath: AdsPath? = null,
    public var pPostalAddress: AdsPostaladdress? = null,
    public var timestamp: AdsTimestamp = AdsTimestamp(),
    public var backLink: AdsBacklink = AdsBacklink(),
    public var pTypedName: AdsTypedname? = null,
    public var hold: AdsHold = AdsHold(),
    public var pNetAddress: AdsNetaddress? = null,
    public var pReplicaPointer: AdsReplicapointer? = null,
    public var pFaxNumber: AdsFaxnumber? = null,
    public var email: AdsEmail = AdsEmail(),
    public var securityDescriptor: AdsNtSecurityDescriptor = AdsNtSecurityDescriptor(),
    public var pDNWithBinary: AdsDnWithBinary? = null,
    public var pDNWithString: AdsDnWithString? = null,
)

public data class AdsAttrDef(
    public var pszAttrName: Pwstr = null,
    public var dwADsType: Adstype = 0,
    public var dwMinRange: UInt = 0u,
    public var dwMaxRange: UInt = 0u,
    public var fMultiValued: Bool = 0,
)

public data class AdsAttrInfo(
    public var pszAttrName: Pwstr = null,
    public var dwControlCode: UInt = 0u,
    public var dwADsType: Adstype = 0,
    public var pADsValues: Adsvalue? = null,
    public var dwNumValues: UInt = 0u,
)

public data class AdsBacklink(
    public var remoteID: UInt = 0u,
    public var objectName: Pwstr = null,
)

public data class AdsCaseignoreList(
    public var next: AdsCaseignoreList? = null,
    public var string: Pwstr = null,
)

public data class AdsClassDef(
    public var pszClassName: Pwstr = null,
    public var dwMandatoryAttrs: UInt = 0u,
    public var ppszMandatoryAttrs: Pwstr = null,
    public var optionalAttrs: UInt = 0u,
    public var ppszOptionalAttrs: COpaquePointer? = null,
    public var dwNamingAttrs: UInt = 0u,
    public var ppszNamingAttrs: COpaquePointer? = null,
    public var dwSuperClasses: UInt = 0u,
    public var ppszSuperClasses: COpaquePointer? = null,
    public var fIsContainer: Bool = 0,
)

public data class AdsDnWithBinary(
    public var dwLength: UInt = 0u,
    public var lpBinaryValue: COpaquePointer? = null,
    public var pszDNString: Pwstr = null,
)

public data class AdsDnWithString(
    public var pszStringValue: Pwstr = null,
    public var pszDNString: Pwstr = null,
)

public data class AdsEmail(
    public var address: Pwstr = null,
    public var type: UInt = 0u,
)

public data class AdsFaxnumber(
    public var telephoneNumber: Pwstr = null,
    public var numberOfBits: UInt = 0u,
    public var parameters: COpaquePointer? = null,
)

public data class AdsHold(
    public var objectName: Pwstr = null,
    public var amount: UInt = 0u,
)

public data class AdsNetaddress(
    public var addressType: UInt = 0u,
    public var addressLength: UInt = 0u,
    public var address: COpaquePointer? = null,
)

public data class AdsNtSecurityDescriptor(
    public var dwLength: UInt = 0u,
    public var lpValue: COpaquePointer? = null,
)

public data class AdsObjectInfo(
    public var pszRDN: Pwstr = null,
    public var pszObjectDN: Pwstr = null,
    public var pszParentDN: Pwstr = null,
    public var pszSchemaDN: Pwstr = null,
    public var pszClassName: Pwstr = null,
)

public data class AdsOctetList(
    public var next: AdsOctetList? = null,
    public var length: UInt = 0u,
    public var data: COpaquePointer? = null,
)

public data class AdsOctetString(
    public var dwLength: UInt = 0u,
    public var lpValue: COpaquePointer? = null,
)

public data class AdsPath(
    public var type: UInt = 0u,
    public var volumeName: Pwstr = null,
    public var path: Pwstr = null,
)

public data class AdsPostaladdress(
    public var postalAddress: List<COpaquePointer> = List(6) { COpaquePointer(0L) },
)

public data class AdsProvSpecific(
    public var dwLength: UInt = 0u,
    public var lpValue: COpaquePointer? = null,
)

public data class AdsReplicapointer(
    public var serverName: Pwstr = null,
    public var replicaType: UInt = 0u,
    public var replicaNumber: UInt = 0u,
    public var count: UInt = 0u,
    public var replicaAddressHints: AdsNetaddress? = null,
)

public data class AdsSearchprefInfo(
    public var dwSearchPref: AdsSearchprefEnum = 0,
    public var vValue: Adsvalue = Adsvalue(),
    public var dwStatus: AdsStatusenum = 0,
)

public data class AdsSearchColumn(
    public var pszAttrName: Pwstr = null,
    public var dwADsType: Adstype = 0,
    public var pADsValues: Adsvalue? = null,
    public var dwNumValues: UInt = 0u,
    public var hReserved: Handle = null,
)

public data class AdsSortkey(
    public var pszAttrType: Pwstr = null,
    public var pszReserved: Pwstr = null,
    public var fReverseorder: Boolean = false,
)

public data class AdsTimestamp(
    public var wholeSeconds: UInt = 0u,
    public var eventID: UInt = 0u,
)

public data class AdsTypedname(
    public var objectName: Pwstr = null,
    public var level: UInt = 0u,
    public var interval: UInt = 0u,
)

public data class AdsVlv(
    public var dwBeforeCount: UInt = 0u,
    public var dwAfterCount: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwContentCount: UInt = 0u,
    public var pszTarget: Pwstr = null,
    public var dwContextIDLength: UInt = 0u,
    public var lpContextID: COpaquePointer? = null,
)

public data class Cqform(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var hIcon: Hicon = null,
    public var pszTitle: Pcwstr = null,
)

public data class Cqpage(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pPageProc: Lpcqpageproc = null,
    public var hInstance: Hinstance = null,
    public var idPageName: Int = 0,
    public var idPageTemplate: Int = 0,
    public var pDlgProc: Dlgproc = null,
    public var lParam: Lparam = 0L,
)

public data class Domaindesc(
    public var pszName: Pwstr = null,
    public var pszPath: Pwstr = null,
    public var pszNCName: Pwstr = null,
    public var pszTrustParent: Pwstr = null,
    public var pszObjectClass: Pwstr = null,
    public var ulFlags: UInt = 0u,
    public var fDownLevel: Bool = 0,
    public var pdChildList: Domaindesc? = null,
    public var pdNextSibling: Domaindesc? = null,
)

public data class DomainControllerInfoa(
    public var domainControllerName: Pstr = null,
    public var domainControllerAddress: Pstr = null,
    public var domainControllerAddressType: UInt = 0u,
    public var domainGuid: Guid = Guid(),
    public var domainName: Pstr = null,
    public var dnsForestName: Pstr = null,
    public var flags: UInt = 0u,
    public var dcSiteName: Pstr = null,
    public var clientSiteName: Pstr = null,
)

public data class DomainControllerInfow(
    public var domainControllerName: Pwstr = null,
    public var domainControllerAddress: Pwstr = null,
    public var domainControllerAddressType: UInt = 0u,
    public var domainGuid: Guid = Guid(),
    public var domainName: Pwstr = null,
    public var dnsForestName: Pwstr = null,
    public var flags: UInt = 0u,
    public var dcSiteName: Pwstr = null,
    public var clientSiteName: Pwstr = null,
)

public data class DomainTree(
    public var dsSize: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var aDomains: List<Domaindesc> = List(1) { Domaindesc() },
)

public data class DsaNewobjDispinfo(
    public var dwSize: UInt = 0u,
    public var hObjClassIcon: Hicon = null,
    public var lpszWizTitle: Pwstr = null,
    public var lpszContDisplayName: Pwstr = null,
)

public data class Dsbitema(
    public var cbStruct: UInt = 0u,
    public var pszADsPath: Pcwstr = null,
    public var pszClass: Pcwstr = null,
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStateMask: UInt = 0u,
    public var szDisplayName: ByteArray = ByteArray(64),
    public var szIconLocation: ByteArray = ByteArray(260),
    public var iIconResID: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsbitema) return false
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

public data class Dsbitemw(
    public var cbStruct: UInt = 0u,
    public var pszADsPath: Pcwstr = null,
    public var pszClass: Pcwstr = null,
    public var dwMask: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwStateMask: UInt = 0u,
    public var szDisplayName: UShortArray = UShortArray(64),
    public var szIconLocation: UShortArray = UShortArray(260),
    public var iIconResID: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsbitemw) return false
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

public data class Dsbrowseinfoa(
    public var cbStruct: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pszCaption: Pcstr = null,
    public var pszTitle: Pcstr = null,
    public var pszRoot: Pcwstr = null,
    public var pszPath: Pwstr = null,
    public var cchPath: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pfnCallback: Bffcallback = null,
    public var lParam: Lparam = 0L,
    public var dwReturnFormat: UInt = 0u,
    public var pUserName: Pcwstr = null,
    public var pPassword: Pcwstr = null,
    public var pszObjectClass: Pwstr = null,
    public var cchObjectClass: UInt = 0u,
)

public data class Dsbrowseinfow(
    public var cbStruct: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pszCaption: Pcwstr = null,
    public var pszTitle: Pcwstr = null,
    public var pszRoot: Pcwstr = null,
    public var pszPath: Pwstr = null,
    public var cchPath: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pfnCallback: Bffcallback = null,
    public var lParam: Lparam = 0L,
    public var dwReturnFormat: UInt = 0u,
    public var pUserName: Pcwstr = null,
    public var pPassword: Pcwstr = null,
    public var pszObjectClass: Pwstr = null,
    public var cchObjectClass: UInt = 0u,
)

public data class Dsclasscreationinfo(
    public var dwFlags: UInt = 0u,
    public var clsidWizardDialog: Guid = Guid(),
    public var clsidWizardPrimaryPage: Guid = Guid(),
    public var cWizardExtensions: UInt = 0u,
    public var aWizardExtensions: List<Guid> = List(1) { Guid() },
)

public data class Dscolumn(
    public var dwFlags: UInt = 0u,
    public var fmt: Int = 0,
    public var cx: Int = 0,
    public var idsName: Int = 0,
    public var offsetProperty: Int = 0,
    public var dwReserved: UInt = 0u,
)

public data class Dsdisplayspecoptions(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var offsetAttribPrefix: UInt = 0u,
    public var offsetUserName: UInt = 0u,
    public var offsetPassword: UInt = 0u,
    public var offsetServer: UInt = 0u,
    public var offsetServerConfigPath: UInt = 0u,
)

public data class Dsobject(
    public var dwFlags: UInt = 0u,
    public var dwProviderFlags: UInt = 0u,
    public var offsetName: UInt = 0u,
    public var offsetClass: UInt = 0u,
)

public data class Dsobjectnames(
    public var clsidNamespace: Guid = Guid(),
    public var cItems: UInt = 0u,
    public var aObjects: List<Dsobject> = List(1) { Dsobject() },
)

public data class DsopFilterFlags(
    public var uplevel: DsopUplevelFilterFlags = DsopUplevelFilterFlags(),
    public var flDownlevel: UInt = 0u,
)

public data class DsopInitInfo(
    public var cbSize: UInt = 0u,
    public var pwzTargetComputer: Pcwstr = null,
    public var cDsScopeInfos: UInt = 0u,
    public var aDsScopeInfos: DsopScopeInitInfo? = null,
    public var flOptions: UInt = 0u,
    public var cAttributesToFetch: UInt = 0u,
    public var apwzAttributeNames: Pcwstr = null,
)

public data class DsopScopeInitInfo(
    public var cbSize: UInt = 0u,
    public var flType: UInt = 0u,
    public var flScope: UInt = 0u,
    public var filterFlags: DsopFilterFlags = DsopFilterFlags(),
    public var pwzDcName: Pcwstr = null,
    public var pwzADsPath: Pcwstr = null,
    public var hr: Hresult = 0,
)

public data class DsopUplevelFilterFlags(
    public var flBothModes: UInt = 0u,
    public var flMixedModeOnly: UInt = 0u,
    public var flNativeModeOnly: UInt = 0u,
)

public data class Dspropertypageinfo(
    public var offsetString: UInt = 0u,
)

public data class Dsqueryclasslist(
    public var cbStruct: UInt = 0u,
    public var cClasses: Int = 0,
    public var offsetClass: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dsqueryclasslist) return false
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

public data class Dsqueryinitparams(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var pDefaultScope: Pwstr = null,
    public var pDefaultSaveLocation: Pwstr = null,
    public var pUserName: Pwstr = null,
    public var pPassword: Pwstr = null,
    public var pServer: Pwstr = null,
)

public data class Dsqueryparams(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hInstance: Hinstance = null,
    public var offsetQuery: Int = 0,
    public var iColumns: Int = 0,
    public var dwReserved: UInt = 0u,
    public var aColumns: List<Dscolumn> = List(1) { Dscolumn() },
)

public data class DsroleOperationStateInfo(
    public var operationState: DsroleOperationState = 0,
)

public data class DsrolePrimaryDomainInfoBasic(
    public var machineRole: DsroleMachineRole = 0,
    public var flags: UInt = 0u,
    public var domainNameFlat: Pwstr = null,
    public var domainNameDns: Pwstr = null,
    public var domainForestName: Pwstr = null,
    public var domainGuid: Guid = Guid(),
)

public data class DsroleUpgradeStatusInfo(
    public var operationState: UInt = 0u,
    public var previousServerState: DsroleServerState = 0,
)

public data class DsDomainControllerInfo1a(
    public var netbiosName: Pstr = null,
    public var dnsHostName: Pstr = null,
    public var siteName: Pstr = null,
    public var computerObjectName: Pstr = null,
    public var serverObjectName: Pstr = null,
    public var fIsPdc: Bool = 0,
    public var fDsEnabled: Bool = 0,
)

public data class DsDomainControllerInfo1w(
    public var netbiosName: Pwstr = null,
    public var dnsHostName: Pwstr = null,
    public var siteName: Pwstr = null,
    public var computerObjectName: Pwstr = null,
    public var serverObjectName: Pwstr = null,
    public var fIsPdc: Bool = 0,
    public var fDsEnabled: Bool = 0,
)

public data class DsDomainControllerInfo2a(
    public var netbiosName: Pstr = null,
    public var dnsHostName: Pstr = null,
    public var siteName: Pstr = null,
    public var siteObjectName: Pstr = null,
    public var computerObjectName: Pstr = null,
    public var serverObjectName: Pstr = null,
    public var ntdsDsaObjectName: Pstr = null,
    public var fIsPdc: Bool = 0,
    public var fDsEnabled: Bool = 0,
    public var fIsGc: Bool = 0,
    public var siteObjectGuid: Guid = Guid(),
    public var computerObjectGuid: Guid = Guid(),
    public var serverObjectGuid: Guid = Guid(),
    public var ntdsDsaObjectGuid: Guid = Guid(),
)

public data class DsDomainControllerInfo2w(
    public var netbiosName: Pwstr = null,
    public var dnsHostName: Pwstr = null,
    public var siteName: Pwstr = null,
    public var siteObjectName: Pwstr = null,
    public var computerObjectName: Pwstr = null,
    public var serverObjectName: Pwstr = null,
    public var ntdsDsaObjectName: Pwstr = null,
    public var fIsPdc: Bool = 0,
    public var fDsEnabled: Bool = 0,
    public var fIsGc: Bool = 0,
    public var siteObjectGuid: Guid = Guid(),
    public var computerObjectGuid: Guid = Guid(),
    public var serverObjectGuid: Guid = Guid(),
    public var ntdsDsaObjectGuid: Guid = Guid(),
)

public data class DsDomainControllerInfo3a(
    public var netbiosName: Pstr = null,
    public var dnsHostName: Pstr = null,
    public var siteName: Pstr = null,
    public var siteObjectName: Pstr = null,
    public var computerObjectName: Pstr = null,
    public var serverObjectName: Pstr = null,
    public var ntdsDsaObjectName: Pstr = null,
    public var fIsPdc: Bool = 0,
    public var fDsEnabled: Bool = 0,
    public var fIsGc: Bool = 0,
    public var fIsRodc: Bool = 0,
    public var siteObjectGuid: Guid = Guid(),
    public var computerObjectGuid: Guid = Guid(),
    public var serverObjectGuid: Guid = Guid(),
    public var ntdsDsaObjectGuid: Guid = Guid(),
)

public data class DsDomainControllerInfo3w(
    public var netbiosName: Pwstr = null,
    public var dnsHostName: Pwstr = null,
    public var siteName: Pwstr = null,
    public var siteObjectName: Pwstr = null,
    public var computerObjectName: Pwstr = null,
    public var serverObjectName: Pwstr = null,
    public var ntdsDsaObjectName: Pwstr = null,
    public var fIsPdc: Bool = 0,
    public var fDsEnabled: Bool = 0,
    public var fIsGc: Bool = 0,
    public var fIsRodc: Bool = 0,
    public var siteObjectGuid: Guid = Guid(),
    public var computerObjectGuid: Guid = Guid(),
    public var serverObjectGuid: Guid = Guid(),
    public var ntdsDsaObjectGuid: Guid = Guid(),
)

public data class DsDomainTrustsa(
    public var netbiosDomainName: Pstr = null,
    public var dnsDomainName: Pstr = null,
    public var flags: UInt = 0u,
    public var parentIndex: UInt = 0u,
    public var trustType: UInt = 0u,
    public var trustAttributes: UInt = 0u,
    public var domainSid: Psid = null,
    public var domainGuid: Guid = Guid(),
)

public data class DsDomainTrustsw(
    public var netbiosDomainName: Pwstr = null,
    public var dnsDomainName: Pwstr = null,
    public var flags: UInt = 0u,
    public var parentIndex: UInt = 0u,
    public var trustType: UInt = 0u,
    public var trustAttributes: UInt = 0u,
    public var domainSid: Psid = null,
    public var domainGuid: Guid = Guid(),
)

public data class DsNameResulta(
    public var cItems: UInt = 0u,
    public var rItems: DsNameResultItema? = null,
)

public data class DsNameResultw(
    public var cItems: UInt = 0u,
    public var rItems: DsNameResultItemw? = null,
)

public data class DsNameResultItema(
    public var status: UInt = 0u,
    public var pDomain: Pstr = null,
    public var pName: Pstr = null,
)

public data class DsNameResultItemw(
    public var status: UInt = 0u,
    public var pDomain: Pwstr = null,
    public var pName: Pwstr = null,
)

public data class DsReplAttrMetaData(
    public var pszAttributeName: Pwstr = null,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
)

public data class DsReplAttrMetaData2(
    public var pszAttributeName: Pwstr = null,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var pszLastOriginatingDsaDN: Pwstr = null,
)

public data class DsReplAttrMetaDataBlob(
    public var oszAttributeName: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
)

public data class DsReplAttrValueMetaData(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DsReplValueMetaData> = List(1) { DsReplValueMetaData() },
)

public data class DsReplAttrValueMetaData2(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DsReplValueMetaData2> = List(1) { DsReplValueMetaData2() },
)

public data class DsReplAttrValueMetaDataExt(
    public var cNumEntries: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgMetaData: List<DsReplValueMetaDataExt> = List(1) { DsReplValueMetaDataExt() },
)

public data class DsReplCursor(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
)

public data class DsReplCursors(
    public var cNumCursors: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgCursor: List<DsReplCursor> = List(1) { DsReplCursor() },
)

public data class DsReplCursors2(
    public var cNumCursors: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgCursor: List<DsReplCursor2> = List(1) { DsReplCursor2() },
)

public data class DsReplCursors3w(
    public var cNumCursors: UInt = 0u,
    public var dwEnumerationContext: UInt = 0u,
    public var rgCursor: List<DsReplCursor3w> = List(1) { DsReplCursor3w() },
)

public data class DsReplCursor2(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
)

public data class DsReplCursor3w(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
    public var pszSourceDsaDN: Pwstr = null,
)

public data class DsReplCursorBlob(
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
    public var oszSourceDsaDN: UInt = 0u,
)

public data class DsReplKccDsaFailuresw(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgDsaFailure: List<DsReplKccDsaFailurew> = List(1) { DsReplKccDsaFailurew() },
)

public data class DsReplKccDsaFailurew(
    public var pszDsaDN: Pwstr = null,
    public var uuidDsaObjGuid: Guid = Guid(),
    public var ftimeFirstFailure: Filetime = Filetime(),
    public var cNumFailures: UInt = 0u,
    public var dwLastResult: UInt = 0u,
)

public data class DsReplKccDsaFailurewBlob(
    public var oszDsaDN: UInt = 0u,
    public var uuidDsaObjGuid: Guid = Guid(),
    public var ftimeFirstFailure: Filetime = Filetime(),
    public var cNumFailures: UInt = 0u,
    public var dwLastResult: UInt = 0u,
)

public data class DsReplNeighborsw(
    public var cNumNeighbors: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgNeighbor: List<DsReplNeighborw> = List(1) { DsReplNeighborw() },
)

public data class DsReplNeighborw(
    public var pszNamingContext: Pwstr = null,
    public var pszSourceDsaDN: Pwstr = null,
    public var pszSourceDsaAddress: Pwstr = null,
    public var pszAsyncIntersiteTransportDN: Pwstr = null,
    public var dwReplicaFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var uuidNamingContextObjGuid: Guid = Guid(),
    public var uuidSourceDsaObjGuid: Guid = Guid(),
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var uuidAsyncIntersiteTransportObjGuid: Guid = Guid(),
    public var usnLastObjChangeSynced: Long = 0L,
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
    public var ftimeLastSyncAttempt: Filetime = Filetime(),
    public var dwLastSyncResult: UInt = 0u,
    public var cNumConsecutiveSyncFailures: UInt = 0u,
)

public data class DsReplNeighborwBlob(
    public var oszNamingContext: UInt = 0u,
    public var oszSourceDsaDN: UInt = 0u,
    public var oszSourceDsaAddress: UInt = 0u,
    public var oszAsyncIntersiteTransportDN: UInt = 0u,
    public var dwReplicaFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var uuidNamingContextObjGuid: Guid = Guid(),
    public var uuidSourceDsaObjGuid: Guid = Guid(),
    public var uuidSourceDsaInvocationID: Guid = Guid(),
    public var uuidAsyncIntersiteTransportObjGuid: Guid = Guid(),
    public var usnLastObjChangeSynced: Long = 0L,
    public var usnAttributeFilter: Long = 0L,
    public var ftimeLastSyncSuccess: Filetime = Filetime(),
    public var ftimeLastSyncAttempt: Filetime = Filetime(),
    public var dwLastSyncResult: UInt = 0u,
    public var cNumConsecutiveSyncFailures: UInt = 0u,
)

public data class DsReplObjMetaData(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgMetaData: List<DsReplAttrMetaData> = List(1) { DsReplAttrMetaData() },
)

public data class DsReplObjMetaData2(
    public var cNumEntries: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgMetaData: List<DsReplAttrMetaData2> = List(1) { DsReplAttrMetaData2() },
)

public data class DsReplOpw(
    public var ftimeEnqueued: Filetime = Filetime(),
    public var ulSerialNumber: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var opType: DsReplOpType = 0,
    public var ulOptions: UInt = 0u,
    public var pszNamingContext: Pwstr = null,
    public var pszDsaDN: Pwstr = null,
    public var pszDsaAddress: Pwstr = null,
    public var uuidNamingContextObjGuid: Guid = Guid(),
    public var uuidDsaObjGuid: Guid = Guid(),
)

public data class DsReplOpwBlob(
    public var ftimeEnqueued: Filetime = Filetime(),
    public var ulSerialNumber: UInt = 0u,
    public var ulPriority: UInt = 0u,
    public var opType: DsReplOpType = 0,
    public var ulOptions: UInt = 0u,
    public var oszNamingContext: UInt = 0u,
    public var oszDsaDN: UInt = 0u,
    public var oszDsaAddress: UInt = 0u,
    public var uuidNamingContextObjGuid: Guid = Guid(),
    public var uuidDsaObjGuid: Guid = Guid(),
)

public data class DsReplPendingOpsw(
    public var ftimeCurrentOpStarted: Filetime = Filetime(),
    public var cNumPendingOps: UInt = 0u,
    public var rgPendingOp: List<DsReplOpw> = List(1) { DsReplOpw() },
)

public data class DsReplQueueStatisticsw(
    public var ftimeCurrentOpStarted: Filetime = Filetime(),
    public var cNumPendingOps: UInt = 0u,
    public var ftimeOldestSync: Filetime = Filetime(),
    public var ftimeOldestAdd: Filetime = Filetime(),
    public var ftimeOldestMod: Filetime = Filetime(),
    public var ftimeOldestDel: Filetime = Filetime(),
    public var ftimeOldestUpdRefs: Filetime = Filetime(),
)

public data class DsReplValueMetaData(
    public var pszAttributeName: Pwstr = null,
    public var pszObjectDn: Pwstr = null,
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
)

public data class DsReplValueMetaData2(
    public var pszAttributeName: Pwstr = null,
    public var pszObjectDn: Pwstr = null,
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var pszLastOriginatingDsaDN: Pwstr = null,
)

public data class DsReplValueMetaDataBlob(
    public var oszAttributeName: UInt = 0u,
    public var oszObjectDn: UInt = 0u,
    public var cbData: UInt = 0u,
    public var obData: UInt = 0u,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
)

public data class DsReplValueMetaDataBlobExt(
    public var oszAttributeName: UInt = 0u,
    public var oszObjectDn: UInt = 0u,
    public var cbData: UInt = 0u,
    public var obData: UInt = 0u,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var oszLastOriginatingDsaDN: UInt = 0u,
    public var dwUserIdentifier: UInt = 0u,
    public var dwPriorLinkState: UInt = 0u,
    public var dwCurrentLinkState: UInt = 0u,
)

public data class DsReplValueMetaDataExt(
    public var pszAttributeName: Pwstr = null,
    public var pszObjectDn: Pwstr = null,
    public var cbData: UInt = 0u,
    public var pbData: COpaquePointer? = null,
    public var ftimeDeleted: Filetime = Filetime(),
    public var ftimeCreated: Filetime = Filetime(),
    public var dwVersion: UInt = 0u,
    public var ftimeLastOriginatingChange: Filetime = Filetime(),
    public var uuidLastOriginatingDsaInvocationID: Guid = Guid(),
    public var usnOriginatingChange: Long = 0L,
    public var usnLocalChange: Long = 0L,
    public var pszLastOriginatingDsaDN: Pwstr = null,
    public var dwUserIdentifier: UInt = 0u,
    public var dwPriorLinkState: UInt = 0u,
    public var dwCurrentLinkState: UInt = 0u,
)

public data class DsRepsyncallErrinfoa(
    public var pszSvrId: Pstr = null,
    public var error: DsRepsyncallError = 0,
    public var dwWin32Err: UInt = 0u,
    public var pszSrcId: Pstr = null,
)

public data class DsRepsyncallErrinfow(
    public var pszSvrId: Pwstr = null,
    public var error: DsRepsyncallError = 0,
    public var dwWin32Err: UInt = 0u,
    public var pszSrcId: Pwstr = null,
)

public data class DsRepsyncallSynca(
    public var pszSrcId: Pstr = null,
    public var pszDstId: Pstr = null,
    public var pszNC: Pstr = null,
    public var pguidSrc: Guid? = null,
    public var pguidDst: Guid? = null,
)

public data class DsRepsyncallSyncw(
    public var pszSrcId: Pwstr = null,
    public var pszDstId: Pwstr = null,
    public var pszNC: Pwstr = null,
    public var pguidSrc: Guid? = null,
    public var pguidDst: Guid? = null,
)

public data class DsRepsyncallUpdatea(
    public var event: DsRepsyncallEvent = 0,
    public var pErrInfo: DsRepsyncallErrinfoa? = null,
    public var pSync: DsRepsyncallSynca? = null,
)

public data class DsRepsyncallUpdatew(
    public var event: DsRepsyncallEvent = 0,
    public var pErrInfo: DsRepsyncallErrinfow? = null,
    public var pSync: DsRepsyncallSyncw? = null,
)

public data class DsSchemaGuidMapa(
    public var guid: Guid = Guid(),
    public var guidType: UInt = 0u,
    public var pName: Pstr = null,
)

public data class DsSchemaGuidMapw(
    public var guid: Guid = Guid(),
    public var guidType: UInt = 0u,
    public var pName: Pwstr = null,
)

public data class DsSelection(
    public var pwzName: Pwstr = null,
    public var pwzADsPath: Pwstr = null,
    public var pwzClass: Pwstr = null,
    public var pwzUPN: Pwstr = null,
    public var pvarFetchedAttributes: Variant? = null,
    public var flScopeType: UInt = 0u,
)

public data class DsSelectionList(
    public var cItems: UInt = 0u,
    public var cFetchedAttributes: UInt = 0u,
    public var aDsSelection: List<DsSelection> = List(1) { DsSelection() },
)

public data class DsSiteCostInfo(
    public var errorCode: UInt = 0u,
    public var cost: UInt = 0u,
)

public data class Openquerywindow(
    public var cbStruct: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var clsidHandler: Guid = Guid(),
    public var pHandlerParameters: COpaquePointer? = null,
    public var clsidDefaultForm: Guid = Guid(),
    public var pPersistQuery: COpaquePointer? = null,
    public var anonymous: Openquerywindow0 = Openquerywindow0(),
)

public data class Openquerywindow0(
    public var pFormParameters: COpaquePointer? = null,
    public var ppbFormParameters: COpaquePointer? = null,
)

public data class Schedule(
    public var size: UInt = 0u,
    public var bandwidth: UInt = 0u,
    public var numberOfSchedules: UInt = 0u,
    public var schedules: List<ScheduleHeader> = List(1) { ScheduleHeader() },
)

public data class ScheduleHeader(
    public var type: UInt = 0u,
    public var offset: UInt = 0u,
)
