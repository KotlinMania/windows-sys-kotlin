@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32DataRightsmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMAcquireAdvisories(hlicensestorage: Int, wszlicense: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMAcquireIssuanceLicenseTemplate(hclient: Int, uflags: Int, pvreserved: Long, ctemplates: Int, pwsztemplateids: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMAcquireLicense(hsession: Int, uflags: Int, wszgroupidentitycredential: Long, wszrequestedrights: Long, wszcustomdata: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMActivate(hclient: Int, uflags: Int, ulangid: Int, pactservinfo: Long, pvcontext: Long, hparentwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMAddLicense(hlicensestorage: Int, uflags: Int, wszlicense: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMAddRightWithUser(hissuancelicense: Int, hright: Int, huser: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMAttest(henablingprincipal: Int, wszdata: Long, etype: Int, pcattestedblob: Long, wszattestedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCheckSecurity(henv: Int, clevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMClearAllRights(hissuancelicense: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCloseEnvironmentHandle(henv: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCloseHandle(handle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMClosePubHandle(hpub: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCloseQueryHandle(hquery: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCloseSession(hsession: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMConstructCertificateChain(ccertificates: Int, rgwszcertificates: Long, pcchain: Long, wszchain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateBoundLicense(henv: Int, pparams: Long, wszlicensechain: Long, phboundlicense: Long, pherrorlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateClientSession(pfncallback: Long, ucallbackversion: Int, wszgroupidprovidertype: Long, wszgroupid: Long, phclient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsDecryptor(hboundlicense: Int, wszright: Long, hauxlib: Int, wszauxplug: Long, phdecryptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsEncryptor(hboundlicense: Int, wszright: Long, hauxlib: Int, wszauxplug: Long, phencryptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingPrincipal(henv: Int, hlibrary: Int, wszobject: Long, pidprincipal: Long, wszcredentials: Long, phenablingprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: Long, wszreferralinfourl: Long, howner: Int, wszissuancelicense: Long, hboundlicense: Int, phissuancelicense: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateLicenseStorageSession(henv: Int, hdefaultlibrary: Int, hclient: Int, uflags: Int, wszissuancelicense: Long, phlicensestorage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateRight(wszrightname: Long, pstfrom: Long, pstuntil: Long, cextendedinfo: Int, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMCreateUser(wszusername: Long, wszuserid: Long, wszuseridtype: Long, phuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDecode(wszalgid: Long, wszencodedstring: Long, pudecodeddatalen: Long, pbdecodeddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDeconstructCertificateChain(wszchain: Long, iwhich: Int, pccert: Long, wszcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDecrypt(hcryptoprovider: Int, iposition: Int, cnuminbytes: Int, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDeleteLicense(hsession: Int, wszlicenseid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDuplicateEnvironmentHandle(htocopy: Int, phcopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDuplicateHandle(htocopy: Int, phcopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDuplicatePubHandle(hpubin: Int, phpubout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMDuplicateSession(hsessionin: Int, phsessionout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMEncode(wszalgid: Long, udatalen: Int, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMEncrypt(hcryptoprovider: Int, iposition: Int, cnuminbytes: Int, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMEnumerateLicense(hsession: Int, uflags: Int, uindex: Int, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetApplicationSpecificData(hissuancelicense: Int, uindex: Int, punamelength: Long, wszname: Long, puvaluelength: Long, wszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttribute(hqueryroot: Int, wszattribute: Long, iwhich: Int, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttributeCount(hqueryroot: Int, wszattribute: Long, pcattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObject(hqueryroot: Int, wszsubobjecttype: Long, iwhich: Int, phsubobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObjectCount(hqueryroot: Int, wszsubobjecttype: Long, pcsubobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetCertificateChainCount(wszchain: Long, pccertcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetClientVersion(pdrmclientversioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetEnvironmentInfo(handle: Int, wszattribute: Long, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetInfo(handle: Int, wszattribute: Long, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetIntervalTime(hissuancelicense: Int, pcdays: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseInfo(hissuancelicense: Int, psttimefrom: Long, psttimeuntil: Long, uflags: Int, pudistributionpointnamelength: Long, wszdistributionpointname: Long, pudistributionpointurllength: Long, wszdistributionpointurl: Long, phowner: Long, pfofficial: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseTemplate(hissuancelicense: Int, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetMetaData(hissuancelicense: Int, pucontentidlength: Long, wszcontentid: Long, pucontentidtypelength: Long, wszcontentidtype: Long, puskuidlength: Long, wszskuid: Long, puskuidtypelength: Long, wszskuidtype: Long, pucontenttypelength: Long, wszcontenttype: Long, pucontentnamelength: Long, wszcontentname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetNameAndDescription(hissuancelicense: Int, uindex: Int, pulcid: Long, punamelength: Long, wszname: Long, pudescriptionlength: Long, wszdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetOwnerLicense(hissuancelicense: Int, puownerlicenselength: Long, wszownerlicense: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetProcAddress(hlibrary: Int, wszprocname: Long, ppfnprocaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetRevocationPoint(hissuancelicense: Int, puidlength: Long, wszid: Long, puidtypelength: Long, wszidtype: Long, puurllength: Long, wszrl: Long, pstfrequency: Long, punamelength: Long, wszname: Long, pupublickeylength: Long, wszpublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetRightExtendedInfo(hright: Int, uindex: Int, puextendedinfonamelength: Long, wszextendedinfoname: Long, puextendedinfovaluelength: Long, wszextendedinfovalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetRightInfo(hright: Int, purightnamelength: Long, wszrightname: Long, pstfrom: Long, pstuntil: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetSecurityProvider(uflags: Int, putypelen: Long, wsztype: Long, pupathlen: Long, wszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetServiceLocation(hclient: Int, uservicetype: Int, uservicelocation: Int, wszissuancelicense: Long, puserviceurllength: Long, wszserviceurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicense(henv: Int, hissuancelicense: Int, uflags: Int, pbsymkey: Long, cbsymkey: Int, wszsymkeytype: Long, wszclientlicensorcertificate: Long, pfncallback: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicenseEx(henv: Int, hissuancelicense: Int, uflags: Int, pbsymkey: Long, cbsymkey: Int, wszsymkeytype: Long, pvreserved: Long, henablingprincipal: Int, hboundlicenseclc: Int, pfncallback: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetTime(henv: Int, etimeridtype: Int, potimeobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttribute(hqueryroot: Int, wszattributetype: Long, iwhich: Int, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttributeCount(hqueryroot: Int, wszattributetype: Long, pcattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObject(hqueryroot: Int, wszsubobjecttype: Long, iindex: Int, phsubquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObjectCount(hqueryroot: Int, wszsubobjecttype: Long, pcsubobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUsagePolicy(hissuancelicense: Int, uindex: Int, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: Long, puminversionlength: Long, wszminversion: Long, pumaxversionlength: Long, wszmaxversion: Long, pupublickeylength: Long, wszpublickey: Long, pudigestalgorithmlength: Long, wszdigestalgorithm: Long, pcbdigest: Long, pbdigest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUserInfo(huser: Int, puusernamelength: Long, wszusername: Long, puuseridlength: Long, wszuserid: Long, puuseridtypelength: Long, wszuseridtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUserRights(hissuancelicense: Int, huser: Int, uindex: Int, phright: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMGetUsers(hissuancelicense: Int, uindex: Int, phuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMInitEnvironment(esecurityprovidertype: Int, especification: Int, wszsecurityprovider: Long, wszmanifestcredentials: Long, wszmachinecredentials: Long, phenv: Long, phdefaultlibrary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMIsActivated(hclient: Int, uflags: Int, pactservinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMIsWindowProtected(hwnd: Long, pfprotected: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMLoadLibrary(henv: Int, especification: Int, wszlibraryprovider: Long, wszcredentials: Long, phlibrary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMParseUnboundLicense(wszcertificate: Long, phqueryroot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMRegisterContent(fregister: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMRegisterProtectedWindow(henv: Int, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMRegisterRevocationList(henv: Int, wszrevocationlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMRepair(): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetApplicationSpecificData(hissuancelicense: Int, fdelete: Int, wszname: Long, wszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetGlobalOptions(eglobaloptions: Int, pvdata: Long, dwlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetIntervalTime(hissuancelicense: Int, cdays: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetMetaData(hissuancelicense: Int, wszcontentid: Long, wszcontentidtype: Long, wszskuid: Long, wszskuidtype: Long, wszcontenttype: Long, wszcontentname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetNameAndDescription(hissuancelicense: Int, fdelete: Int, lcid: Int, wszname: Long, wszdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetRevocationPoint(hissuancelicense: Int, fdelete: Int, wszid: Long, wszidtype: Long, wszurl: Long, pstfrequency: Long, wszname: Long, wszpublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMSetUsagePolicy(hissuancelicense: Int, eusagepolicytype: Int, fdelete: Int, fexclusion: Int, wszname: Long, wszminversion: Long, wszmaxversion: Long, wszpublickey: Long, wszdigestalgorithm: Long, pbdigest: Long, cbdigest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_dRMVerify(wszdata: Long, pcattesteddata: Long, wszattesteddata: Long, petype: Long, pcprincipal: Long, wszprincipal: Long, pcmanifest: Long, wszmanifest: Long): Int
}

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMAcquireAdvisories(hlicensestorage.toInt(), (wszlicense?.value ?: 0L), (wszurl?.value ?: 0L), (pvcontext?.value ?: 0L))

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: COpaquePointer?, ctemplates: UInt, pwsztemplateids: COpaquePointer?, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), (pvreserved?.value ?: 0L), ctemplates.toInt(), (pwsztemplateids?.value ?: 0L), (wszurl?.value ?: 0L), (pvcontext?.value ?: 0L))

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMAcquireLicense(hsession.toInt(), uflags.toInt(), (wszgroupidentitycredential?.value ?: 0L), (wszrequestedrights?.value ?: 0L), (wszcustomdata?.value ?: 0L), (wszurl?.value ?: 0L), (pvcontext?.value ?: 0L))

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: COpaquePointer?, pvcontext: COpaquePointer?, hparentwnd: Hwnd): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), (pactservinfo?.value ?: 0L), (pvcontext?.value ?: 0L), (hparentwnd?.value ?: 0L))

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), (wszlicense?.value ?: 0L))

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt())

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: COpaquePointer?, wszattestedblob: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMAttest(henablingprincipal.toInt(), (wszdata?.value ?: 0L), etype, (pcattestedblob?.value ?: 0L), (wszattestedblob?.value ?: 0L))

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCheckSecurity(henv.toInt(), clevel.toInt())

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMClearAllRights(hissuancelicense.toInt())

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCloseEnvironmentHandle(henv.toInt())

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCloseHandle(handle.toInt())

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMClosePubHandle(hpub.toInt())

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCloseQueryHandle(hquery.toInt())

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCloseSession(hsession.toInt())

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: COpaquePointer?, pcchain: COpaquePointer?, wszchain: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMConstructCertificateChain(ccertificates.toInt(), (rgwszcertificates?.value ?: 0L), (pcchain?.value ?: 0L), (wszchain?.value ?: 0L))

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: COpaquePointer?, wszlicensechain: Pcwstr, phboundlicense: COpaquePointer?, pherrorlog: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateBoundLicense(henv.toInt(), (pparams?.value ?: 0L), (wszlicensechain?.value ?: 0L), (phboundlicense?.value ?: 0L), (pherrorlog?.value ?: 0L))

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateClientSession(0L, ucallbackversion.toInt(), (wszgroupidprovidertype?.value ?: 0L), (wszgroupid?.value ?: 0L), (phclient?.value ?: 0L))

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), (wszright?.value ?: 0L), hauxlib.toInt(), (wszauxplug?.value ?: 0L), (phdecryptor?.value ?: 0L))

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), (wszright?.value ?: 0L), hauxlib.toInt(), (wszauxplug?.value ?: 0L), (phencryptor?.value ?: 0L))

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: COpaquePointer?, wszcredentials: Pcwstr, phenablingprincipal: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), (wszobject?.value ?: 0L), (pidprincipal?.value ?: 0L), (wszcredentials?.value ?: 0L), (phenablingprincipal?.value ?: 0L))

public actual fun dRMCreateIssuanceLicense(psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateIssuanceLicense((psttimefrom?.value ?: 0L), (psttimeuntil?.value ?: 0L), (wszreferralinfoname?.value ?: 0L), (wszreferralinfourl?.value ?: 0L), howner.toInt(), (wszissuancelicense?.value ?: 0L), hboundlicense.toInt(), (phissuancelicense?.value ?: 0L))

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), (wszissuancelicense?.value ?: 0L), (phlicensestorage?.value ?: 0L))

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?, cextendedinfo: UInt, pwszextendedinfoname: COpaquePointer?, pwszextendedinfovalue: COpaquePointer?, phright: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateRight((wszrightname?.value ?: 0L), (pstfrom?.value ?: 0L), (pstuntil?.value ?: 0L), cextendedinfo.toInt(), (pwszextendedinfoname?.value ?: 0L), (pwszextendedinfovalue?.value ?: 0L), (phright?.value ?: 0L))

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMCreateUser((wszusername?.value ?: 0L), (wszuserid?.value ?: 0L), (wszuseridtype?.value ?: 0L), (phuser?.value ?: 0L))

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: COpaquePointer?, pbdecodeddata: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDecode((wszalgid?.value ?: 0L), (wszencodedstring?.value ?: 0L), (pudecodeddatalen?.value ?: 0L), (pbdecodeddata?.value ?: 0L))

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: COpaquePointer?, wszcert: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDeconstructCertificateChain((wszchain?.value ?: 0L), iwhich.toInt(), (pccert?.value ?: 0L), (wszcert?.value ?: 0L))

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), (pbindata?.value ?: 0L), (pcnumoutbytes?.value ?: 0L), (pboutdata?.value ?: 0L))

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDeleteLicense(hsession.toInt(), (wszlicenseid?.value ?: 0L))

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateEnvironmentHandle(htocopy.toInt(), (phcopy?.value ?: 0L))

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateHandle(htocopy.toInt(), (phcopy?.value ?: 0L))

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDuplicatePubHandle(hpubin.toInt(), (phpubout?.value ?: 0L))

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateSession(hsessionin.toInt(), (phsessionout?.value ?: 0L))

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: COpaquePointer?, puencodedstringlen: COpaquePointer?, wszencodedstring: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMEncode((wszalgid?.value ?: 0L), udatalen.toInt(), (pbdecodeddata?.value ?: 0L), (puencodedstringlen?.value ?: 0L), (wszencodedstring?.value ?: 0L))

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), (pbindata?.value ?: 0L), (pcnumoutbytes?.value ?: 0L), (pboutdata?.value ?: 0L))

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: COpaquePointer?, pucertificatedatalen: COpaquePointer?, wszcertificatedata: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), (pfsharedflag?.value ?: 0L), (pucertificatedatalen?.value ?: 0L), (wszcertificatedata?.value ?: 0L))

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: COpaquePointer?, wszname: Pwstr, puvaluelength: COpaquePointer?, wszvalue: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), (punamelength?.value ?: 0L), (wszname?.value ?: 0L), (puvaluelength?.value ?: 0L), (wszvalue?.value ?: 0L))

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttribute(hqueryroot.toInt(), (wszattribute?.value ?: 0L), iwhich.toInt(), (peencoding?.value ?: 0L), (pcbuffer?.value ?: 0L), (pbbuffer?.value ?: 0L))

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), (wszattribute?.value ?: 0L), (pcattributes?.value ?: 0L))

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObject(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L), iwhich.toInt(), (phsubobject?.value ?: 0L))

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObjectCount(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L), (pcsubobjects?.value ?: 0L))

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetCertificateChainCount((wszchain?.value ?: 0L), (pccertcount?.value ?: 0L))

public actual fun dRMGetClientVersion(pdrmclientversioninfo: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetClientVersion((pdrmclientversioninfo?.value ?: 0L))

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetEnvironmentInfo(handle.toInt(), (wszattribute?.value ?: 0L), (peencoding?.value ?: 0L), (pcbuffer?.value ?: 0L), (pbbuffer?.value ?: 0L))

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetInfo(handle.toInt(), (wszattribute?.value ?: 0L), (peencoding?.value ?: 0L), (pcbuffer?.value ?: 0L), (pbbuffer?.value ?: 0L))

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetIntervalTime(hissuancelicense.toInt(), (pcdays?.value ?: 0L))

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, uflags: UInt, pudistributionpointnamelength: COpaquePointer?, wszdistributionpointname: Pwstr, pudistributionpointurllength: COpaquePointer?, wszdistributionpointurl: Pwstr, phowner: COpaquePointer?, pfofficial: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), (psttimefrom?.value ?: 0L), (psttimeuntil?.value ?: 0L), uflags.toInt(), (pudistributionpointnamelength?.value ?: 0L), (wszdistributionpointname?.value ?: 0L), (pudistributionpointurllength?.value ?: 0L), (wszdistributionpointurl?.value ?: 0L), (phowner?.value ?: 0L), (pfofficial?.value ?: 0L))

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: COpaquePointer?, wszissuancelicensetemplate: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), (puissuancelicensetemplatelength?.value ?: 0L), (wszissuancelicensetemplate?.value ?: 0L))

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: COpaquePointer?, wszcontentid: Pwstr, pucontentidtypelength: COpaquePointer?, wszcontentidtype: Pwstr, puskuidlength: COpaquePointer?, wszskuid: Pwstr, puskuidtypelength: COpaquePointer?, wszskuidtype: Pwstr, pucontenttypelength: COpaquePointer?, wszcontenttype: Pwstr, pucontentnamelength: COpaquePointer?, wszcontentname: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetMetaData(hissuancelicense.toInt(), (pucontentidlength?.value ?: 0L), (wszcontentid?.value ?: 0L), (pucontentidtypelength?.value ?: 0L), (wszcontentidtype?.value ?: 0L), (puskuidlength?.value ?: 0L), (wszskuid?.value ?: 0L), (puskuidtypelength?.value ?: 0L), (wszskuidtype?.value ?: 0L), (pucontenttypelength?.value ?: 0L), (wszcontenttype?.value ?: 0L), (pucontentnamelength?.value ?: 0L), (wszcontentname?.value ?: 0L))

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pudescriptionlength: COpaquePointer?, wszdescription: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), (pulcid?.value ?: 0L), (punamelength?.value ?: 0L), (wszname?.value ?: 0L), (pudescriptionlength?.value ?: 0L), (wszdescription?.value ?: 0L))

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: COpaquePointer?, wszownerlicense: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetOwnerLicense(hissuancelicense.toInt(), (puownerlicenselength?.value ?: 0L), (wszownerlicense?.value ?: 0L))

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetProcAddress(hlibrary.toInt(), (wszprocname?.value ?: 0L), (ppfnprocaddress?.value ?: 0L))

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: COpaquePointer?, wszid: Pwstr, puidtypelength: COpaquePointer?, wszidtype: Pwstr, puurllength: COpaquePointer?, wszrl: Pwstr, pstfrequency: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetRevocationPoint(hissuancelicense.toInt(), (puidlength?.value ?: 0L), (wszid?.value ?: 0L), (puidtypelength?.value ?: 0L), (wszidtype?.value ?: 0L), (puurllength?.value ?: 0L), (wszrl?.value ?: 0L), (pstfrequency?.value ?: 0L), (punamelength?.value ?: 0L), (wszname?.value ?: 0L), (pupublickeylength?.value ?: 0L), (wszpublickey?.value ?: 0L))

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: COpaquePointer?, wszextendedinfoname: Pwstr, puextendedinfovaluelength: COpaquePointer?, wszextendedinfovalue: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), (puextendedinfonamelength?.value ?: 0L), (wszextendedinfoname?.value ?: 0L), (puextendedinfovaluelength?.value ?: 0L), (wszextendedinfovalue?.value ?: 0L))

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: COpaquePointer?, wszrightname: Pwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetRightInfo(hright.toInt(), (purightnamelength?.value ?: 0L), (wszrightname?.value ?: 0L), (pstfrom?.value ?: 0L), (pstuntil?.value ?: 0L))

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: COpaquePointer?, wsztype: Pwstr, pupathlen: COpaquePointer?, wszpath: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetSecurityProvider(uflags.toInt(), (putypelen?.value ?: 0L), (wsztype?.value ?: 0L), (pupathlen?.value ?: 0L), (wszpath?.value ?: 0L))

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: COpaquePointer?, wszserviceurl: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), (wszissuancelicense?.value ?: 0L), (puserviceurllength?.value ?: 0L), (wszserviceurl?.value ?: 0L))

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), (pbsymkey?.value ?: 0L), cbsymkey.toInt(), (wszsymkeytype?.value ?: 0L), (wszclientlicensorcertificate?.value ?: 0L), 0L, (wszurl?.value ?: 0L), (pvcontext?.value ?: 0L))

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: COpaquePointer?, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), (pbsymkey?.value ?: 0L), cbsymkey.toInt(), (wszsymkeytype?.value ?: 0L), (pvreserved?.value ?: 0L), henablingprincipal.toInt(), hboundlicenseclc.toInt(), 0L, (pvcontext?.value ?: 0L))

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetTime(henv.toInt(), etimeridtype, (potimeobject?.value ?: 0L))

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttribute(hqueryroot.toInt(), (wszattributetype?.value ?: 0L), iwhich.toInt(), (peencoding?.value ?: 0L), (pcbuffer?.value ?: 0L), (pbbuffer?.value ?: 0L))

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), (wszattributetype?.value ?: 0L), (pcattributes?.value ?: 0L))

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObject(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L), iindex.toInt(), (phsubquery?.value ?: 0L))

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L), (pcsubobjects?.value ?: 0L))

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: COpaquePointer?, pfexclusion: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, puminversionlength: COpaquePointer?, wszminversion: Pwstr, pumaxversionlength: COpaquePointer?, wszmaxversion: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr, pudigestalgorithmlength: COpaquePointer?, wszdigestalgorithm: Pwstr, pcbdigest: COpaquePointer?, pbdigest: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), (peusagepolicytype?.value ?: 0L), (pfexclusion?.value ?: 0L), (punamelength?.value ?: 0L), (wszname?.value ?: 0L), (puminversionlength?.value ?: 0L), (wszminversion?.value ?: 0L), (pumaxversionlength?.value ?: 0L), (wszmaxversion?.value ?: 0L), (pupublickeylength?.value ?: 0L), (wszpublickey?.value ?: 0L), (pudigestalgorithmlength?.value ?: 0L), (wszdigestalgorithm?.value ?: 0L), (pcbdigest?.value ?: 0L), (pbdigest?.value ?: 0L))

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: COpaquePointer?, wszusername: Pwstr, puuseridlength: COpaquePointer?, wszuserid: Pwstr, puuseridtypelength: COpaquePointer?, wszuseridtype: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUserInfo(huser.toInt(), (puusernamelength?.value ?: 0L), (wszusername?.value ?: 0L), (puuseridlength?.value ?: 0L), (wszuserid?.value ?: 0L), (puuseridtypelength?.value ?: 0L), (wszuseridtype?.value ?: 0L))

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), (phright?.value ?: 0L))

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), (phuser?.value ?: 0L))

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: COpaquePointer?, phdefaultlibrary: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMInitEnvironment(esecurityprovidertype, especification, (wszsecurityprovider?.value ?: 0L), (wszmanifestcredentials?.value ?: 0L), (wszmachinecredentials?.value ?: 0L), (phenv?.value ?: 0L), (phdefaultlibrary?.value ?: 0L))

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMIsActivated(hclient.toInt(), uflags.toInt(), (pactservinfo?.value ?: 0L))

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMIsWindowProtected((hwnd?.value ?: 0L), (pfprotected?.value ?: 0L))

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMLoadLibrary(henv.toInt(), especification, (wszlibraryprovider?.value ?: 0L), (wszcredentials?.value ?: 0L), (phlibrary?.value ?: 0L))

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: COpaquePointer?): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMParseUnboundLicense((wszcertificate?.value ?: 0L), (phqueryroot?.value ?: 0L))

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMRegisterContent(fregister)

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMRegisterProtectedWindow(henv.toInt(), (hwnd?.value ?: 0L))

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMRegisterRevocationList(henv.toInt(), (wszrevocationlist?.value ?: 0L))

public actual fun dRMRepair(): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMRepair()

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, (wszname?.value ?: 0L), (wszvalue?.value ?: 0L))

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: COpaquePointer?, dwlen: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetGlobalOptions(eglobaloptions, (pvdata?.value ?: 0L), dwlen.toInt())

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt())

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetMetaData(hissuancelicense.toInt(), (wszcontentid?.value ?: 0L), (wszcontentidtype?.value ?: 0L), (wszskuid?.value ?: 0L), (wszskuidtype?.value ?: 0L), (wszcontenttype?.value ?: 0L), (wszcontentname?.value ?: 0L))

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), (wszname?.value ?: 0L), (wszdescription?.value ?: 0L))

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: COpaquePointer?, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, (wszid?.value ?: 0L), (wszidtype?.value ?: 0L), (wszurl?.value ?: 0L), (pstfrequency?.value ?: 0L), (wszname?.value ?: 0L), (wszpublickey?.value ?: 0L))

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: COpaquePointer?, cbdigest: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, (wszname?.value ?: 0L), (wszminversion?.value ?: 0L), (wszmaxversion?.value ?: 0L), (wszpublickey?.value ?: 0L), (wszdigestalgorithm?.value ?: 0L), (pbdigest?.value ?: 0L), cbdigest.toInt())

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: COpaquePointer?, wszattesteddata: Pwstr, petype: COpaquePointer?, pcprincipal: COpaquePointer?, wszprincipal: Pwstr, pcmanifest: COpaquePointer?, wszmanifest: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_dRMVerify((wszdata?.value ?: 0L), (pcattesteddata?.value ?: 0L), (wszattesteddata?.value ?: 0L), (petype?.value ?: 0L), (pcprincipal?.value ?: 0L), (wszprincipal?.value ?: 0L), (pcmanifest?.value ?: 0L), (wszmanifest?.value ?: 0L))
