@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32DataRightsmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMAcquireAdvisories(hlicensestorage: Int, wszlicense: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMAcquireIssuanceLicenseTemplate(hclient: Int, uflags: Int, pvreserved: Long, ctemplates: Int, pwsztemplateids: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMAcquireLicense(hsession: Int, uflags: Int, wszgroupidentitycredential: Long, wszrequestedrights: Long, wszcustomdata: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMActivate(hclient: Int, uflags: Int, ulangid: Int, pactservinfo: Long, pvcontext: Long, hparentwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMAddLicense(hlicensestorage: Int, uflags: Int, wszlicense: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMAddRightWithUser(hissuancelicense: Int, hright: Int, huser: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMAttest(henablingprincipal: Int, wszdata: Long, etype: Int, pcattestedblob: Long, wszattestedblob: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCheckSecurity(henv: Int, clevel: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMClearAllRights(hissuancelicense: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCloseEnvironmentHandle(henv: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCloseHandle(handle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMClosePubHandle(hpub: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCloseQueryHandle(hquery: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCloseSession(hsession: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMConstructCertificateChain(ccertificates: Int, rgwszcertificates: Long, pcchain: Long, wszchain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateBoundLicense(henv: Int, pparams: Long, wszlicensechain: Long, phboundlicense: Long, pherrorlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateClientSession(pfncallback: Long, ucallbackversion: Int, wszgroupidprovidertype: Long, wszgroupid: Long, phclient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsDecryptor(hboundlicense: Int, wszright: Long, hauxlib: Int, wszauxplug: Long, phdecryptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsEncryptor(hboundlicense: Int, wszright: Long, hauxlib: Int, wszauxplug: Long, phencryptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingPrincipal(henv: Int, hlibrary: Int, wszobject: Long, pidprincipal: Long, wszcredentials: Long, phenablingprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: Long, wszreferralinfourl: Long, howner: Int, wszissuancelicense: Long, hboundlicense: Int, phissuancelicense: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateLicenseStorageSession(henv: Int, hdefaultlibrary: Int, hclient: Int, uflags: Int, wszissuancelicense: Long, phlicensestorage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateRight(wszrightname: Long, pstfrom: Long, pstuntil: Long, cextendedinfo: Int, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMCreateUser(wszusername: Long, wszuserid: Long, wszuseridtype: Long, phuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDecode(wszalgid: Long, wszencodedstring: Long, pudecodeddatalen: Long, pbdecodeddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDeconstructCertificateChain(wszchain: Long, iwhich: Int, pccert: Long, wszcert: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDecrypt(hcryptoprovider: Int, iposition: Int, cnuminbytes: Int, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDeleteLicense(hsession: Int, wszlicenseid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDuplicateEnvironmentHandle(htocopy: Int, phcopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDuplicateHandle(htocopy: Int, phcopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDuplicatePubHandle(hpubin: Int, phpubout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMDuplicateSession(hsessionin: Int, phsessionout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMEncode(wszalgid: Long, udatalen: Int, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMEncrypt(hcryptoprovider: Int, iposition: Int, cnuminbytes: Int, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMEnumerateLicense(hsession: Int, uflags: Int, uindex: Int, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetApplicationSpecificData(hissuancelicense: Int, uindex: Int, punamelength: Long, wszname: Long, puvaluelength: Long, wszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttribute(hqueryroot: Int, wszattribute: Long, iwhich: Int, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttributeCount(hqueryroot: Int, wszattribute: Long, pcattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObject(hqueryroot: Int, wszsubobjecttype: Long, iwhich: Int, phsubobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObjectCount(hqueryroot: Int, wszsubobjecttype: Long, pcsubobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetCertificateChainCount(wszchain: Long, pccertcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetClientVersion(pdrmclientversioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetEnvironmentInfo(handle: Int, wszattribute: Long, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetInfo(handle: Int, wszattribute: Long, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetIntervalTime(hissuancelicense: Int, pcdays: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseInfo(hissuancelicense: Int, psttimefrom: Long, psttimeuntil: Long, uflags: Int, pudistributionpointnamelength: Long, wszdistributionpointname: Long, pudistributionpointurllength: Long, wszdistributionpointurl: Long, phowner: Long, pfofficial: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseTemplate(hissuancelicense: Int, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetMetaData(hissuancelicense: Int, pucontentidlength: Long, wszcontentid: Long, pucontentidtypelength: Long, wszcontentidtype: Long, puskuidlength: Long, wszskuid: Long, puskuidtypelength: Long, wszskuidtype: Long, pucontenttypelength: Long, wszcontenttype: Long, pucontentnamelength: Long, wszcontentname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetNameAndDescription(hissuancelicense: Int, uindex: Int, pulcid: Long, punamelength: Long, wszname: Long, pudescriptionlength: Long, wszdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetOwnerLicense(hissuancelicense: Int, puownerlicenselength: Long, wszownerlicense: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetProcAddress(hlibrary: Int, wszprocname: Long, ppfnprocaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetRevocationPoint(hissuancelicense: Int, puidlength: Long, wszid: Long, puidtypelength: Long, wszidtype: Long, puurllength: Long, wszrl: Long, pstfrequency: Long, punamelength: Long, wszname: Long, pupublickeylength: Long, wszpublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetRightExtendedInfo(hright: Int, uindex: Int, puextendedinfonamelength: Long, wszextendedinfoname: Long, puextendedinfovaluelength: Long, wszextendedinfovalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetRightInfo(hright: Int, purightnamelength: Long, wszrightname: Long, pstfrom: Long, pstuntil: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetSecurityProvider(uflags: Int, putypelen: Long, wsztype: Long, pupathlen: Long, wszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetServiceLocation(hclient: Int, uservicetype: Int, uservicelocation: Int, wszissuancelicense: Long, puserviceurllength: Long, wszserviceurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicense(henv: Int, hissuancelicense: Int, uflags: Int, pbsymkey: Long, cbsymkey: Int, wszsymkeytype: Long, wszclientlicensorcertificate: Long, pfncallback: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicenseEx(henv: Int, hissuancelicense: Int, uflags: Int, pbsymkey: Long, cbsymkey: Int, wszsymkeytype: Long, pvreserved: Long, henablingprincipal: Int, hboundlicenseclc: Int, pfncallback: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetTime(henv: Int, etimeridtype: Int, potimeobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttribute(hqueryroot: Int, wszattributetype: Long, iwhich: Int, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttributeCount(hqueryroot: Int, wszattributetype: Long, pcattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObject(hqueryroot: Int, wszsubobjecttype: Long, iindex: Int, phsubquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObjectCount(hqueryroot: Int, wszsubobjecttype: Long, pcsubobjects: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUsagePolicy(hissuancelicense: Int, uindex: Int, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: Long, puminversionlength: Long, wszminversion: Long, pumaxversionlength: Long, wszmaxversion: Long, pupublickeylength: Long, wszpublickey: Long, pudigestalgorithmlength: Long, wszdigestalgorithm: Long, pcbdigest: Long, pbdigest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUserInfo(huser: Int, puusernamelength: Long, wszusername: Long, puuseridlength: Long, wszuserid: Long, puuseridtypelength: Long, wszuseridtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUserRights(hissuancelicense: Int, huser: Int, uindex: Int, phright: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMGetUsers(hissuancelicense: Int, uindex: Int, phuser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMInitEnvironment(esecurityprovidertype: Int, especification: Int, wszsecurityprovider: Long, wszmanifestcredentials: Long, wszmachinecredentials: Long, phenv: Long, phdefaultlibrary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMIsActivated(hclient: Int, uflags: Int, pactservinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMIsWindowProtected(hwnd: Long, pfprotected: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMLoadLibrary(henv: Int, especification: Int, wszlibraryprovider: Long, wszcredentials: Long, phlibrary: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMParseUnboundLicense(wszcertificate: Long, phqueryroot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMRegisterContent(fregister: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMRegisterProtectedWindow(henv: Int, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMRegisterRevocationList(henv: Int, wszrevocationlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMRepair(): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetApplicationSpecificData(hissuancelicense: Int, fdelete: Int, wszname: Long, wszvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetGlobalOptions(eglobaloptions: Int, pvdata: Long, dwlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetIntervalTime(hissuancelicense: Int, cdays: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetMetaData(hissuancelicense: Int, wszcontentid: Long, wszcontentidtype: Long, wszskuid: Long, wszskuidtype: Long, wszcontenttype: Long, wszcontentname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetNameAndDescription(hissuancelicense: Int, fdelete: Int, lcid: Int, wszname: Long, wszdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetRevocationPoint(hissuancelicense: Int, fdelete: Int, wszid: Long, wszidtype: Long, wszurl: Long, pstfrequency: Long, wszname: Long, wszpublickey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMSetUsagePolicy(hissuancelicense: Int, eusagepolicytype: Int, fdelete: Int, fexclusion: Int, wszname: Long, wszminversion: Long, wszmaxversion: Long, wszpublickey: Long, wszdigestalgorithm: Long, pbdigest: Long, cbdigest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_data_rightsmanagement_DRMVerify(wszdata: Long, pcattesteddata: Long, wszattesteddata: Long, petype: Long, pcprincipal: Long, wszprincipal: Long, pcmanifest: Long, wszmanifest: Long): Int
}

public actual fun DRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMAcquireAdvisories(hlicensestorage.toInt(), wszlicense, wszurl, pvcontext)

public actual fun DRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: Long, ctemplates: UInt, pwsztemplateids: Long, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), pvreserved, ctemplates.toInt(), pwsztemplateids, wszurl, pvcontext)

public actual fun DRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: PCWSTR, wszrequestedrights: PCWSTR, wszcustomdata: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMAcquireLicense(hsession.toInt(), uflags.toInt(), wszgroupidentitycredential, wszrequestedrights, wszcustomdata, wszurl, pvcontext)

public actual fun DRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: Long, pvcontext: Long, hparentwnd: HWND): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), pactservinfo, pvcontext, hparentwnd)

public actual fun DRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), wszlicense)

public actual fun DRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt())

public actual fun DRMAttest(henablingprincipal: UInt, wszdata: PCWSTR, etype: DRMATTESTTYPE, pcattestedblob: Long, wszattestedblob: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMAttest(henablingprincipal.toInt(), wszdata, etype, pcattestedblob, wszattestedblob)

public actual fun DRMCheckSecurity(henv: UInt, clevel: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCheckSecurity(henv.toInt(), clevel.toInt())

public actual fun DRMClearAllRights(hissuancelicense: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMClearAllRights(hissuancelicense.toInt())

public actual fun DRMCloseEnvironmentHandle(henv: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCloseEnvironmentHandle(henv.toInt())

public actual fun DRMCloseHandle(handle: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCloseHandle(handle.toInt())

public actual fun DRMClosePubHandle(hpub: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMClosePubHandle(hpub.toInt())

public actual fun DRMCloseQueryHandle(hquery: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCloseQueryHandle(hquery.toInt())

public actual fun DRMCloseSession(hsession: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCloseSession(hsession.toInt())

public actual fun DRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: Long, pcchain: Long, wszchain: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMConstructCertificateChain(ccertificates.toInt(), rgwszcertificates, pcchain, wszchain)

public actual fun DRMCreateBoundLicense(henv: UInt, pparams: Long, wszlicensechain: PCWSTR, phboundlicense: Long, pherrorlog: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateBoundLicense(henv.toInt(), pparams, wszlicensechain, phboundlicense, pherrorlog)

public actual fun DRMCreateClientSession(pfncallback: DRMCALLBACK, ucallbackversion: UInt, wszgroupidprovidertype: PCWSTR, wszgroupid: PCWSTR, phclient: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateClientSession(pfncallback.toLong(), ucallbackversion.toInt(), wszgroupidprovidertype, wszgroupid, phclient)

public actual fun DRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phdecryptor: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), wszright, hauxlib.toInt(), wszauxplug, phdecryptor)

public actual fun DRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phencryptor: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), wszright, hauxlib.toInt(), wszauxplug, phencryptor)

public actual fun DRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: PCWSTR, pidprincipal: Long, wszcredentials: PCWSTR, phenablingprincipal: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), wszobject, pidprincipal, wszcredentials, phenablingprincipal)

public actual fun DRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: PCWSTR, wszreferralinfourl: PCWSTR, howner: UInt, wszissuancelicense: PCWSTR, hboundlicense: UInt, phissuancelicense: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateIssuanceLicense(psttimefrom, psttimeuntil, wszreferralinfoname, wszreferralinfourl, howner.toInt(), wszissuancelicense, hboundlicense.toInt(), phissuancelicense)

public actual fun DRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: PCWSTR, phlicensestorage: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), wszissuancelicense, phlicensestorage)

public actual fun DRMCreateRight(wszrightname: PCWSTR, pstfrom: Long, pstuntil: Long, cextendedinfo: UInt, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateRight(wszrightname, pstfrom, pstuntil, cextendedinfo.toInt(), pwszextendedinfoname, pwszextendedinfovalue, phright)

public actual fun DRMCreateUser(wszusername: PCWSTR, wszuserid: PCWSTR, wszuseridtype: PCWSTR, phuser: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMCreateUser(wszusername, wszuserid, wszuseridtype, phuser)

public actual fun DRMDecode(wszalgid: PCWSTR, wszencodedstring: PCWSTR, pudecodeddatalen: Long, pbdecodeddata: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDecode(wszalgid, wszencodedstring, pudecodeddatalen, pbdecodeddata)

public actual fun DRMDeconstructCertificateChain(wszchain: PCWSTR, iwhich: UInt, pccert: Long, wszcert: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDeconstructCertificateChain(wszchain, iwhich.toInt(), pccert, wszcert)

public actual fun DRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata, pcnumoutbytes, pboutdata)

public actual fun DRMDeleteLicense(hsession: UInt, wszlicenseid: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDeleteLicense(hsession.toInt(), wszlicenseid)

public actual fun DRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateEnvironmentHandle(htocopy.toInt(), phcopy)

public actual fun DRMDuplicateHandle(htocopy: UInt, phcopy: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateHandle(htocopy.toInt(), phcopy)

public actual fun DRMDuplicatePubHandle(hpubin: UInt, phpubout: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDuplicatePubHandle(hpubin.toInt(), phpubout)

public actual fun DRMDuplicateSession(hsessionin: UInt, phsessionout: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMDuplicateSession(hsessionin.toInt(), phsessionout)

public actual fun DRMEncode(wszalgid: PCWSTR, udatalen: UInt, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMEncode(wszalgid, udatalen.toInt(), pbdecodeddata, puencodedstringlen, wszencodedstring)

public actual fun DRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata, pcnumoutbytes, pboutdata)

public actual fun DRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), pfsharedflag, pucertificatedatalen, wszcertificatedata)

public actual fun DRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: Long, wszname: PWSTR, puvaluelength: Long, wszvalue: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), punamelength, wszname, puvaluelength, wszvalue)

public actual fun DRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttribute(hqueryroot.toInt(), wszattribute, iwhich.toInt(), peencoding, pcbuffer, pbbuffer)

public actual fun DRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: PCWSTR, pcattributes: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), wszattribute, pcattributes)

public actual fun DRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iwhich: UInt, phsubobject: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObject(hqueryroot.toInt(), wszsubobjecttype, iwhich.toInt(), phsubobject)

public actual fun DRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetBoundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype, pcsubobjects)

public actual fun DRMGetCertificateChainCount(wszchain: PCWSTR, pccertcount: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetCertificateChainCount(wszchain, pccertcount)

public actual fun DRMGetClientVersion(pdrmclientversioninfo: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetClientVersion(pdrmclientversioninfo)

public actual fun DRMGetEnvironmentInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetEnvironmentInfo(handle.toInt(), wszattribute, peencoding, pcbuffer, pbbuffer)

public actual fun DRMGetInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetInfo(handle.toInt(), wszattribute, peencoding, pcbuffer, pbbuffer)

public actual fun DRMGetIntervalTime(hissuancelicense: UInt, pcdays: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetIntervalTime(hissuancelicense.toInt(), pcdays)

public actual fun DRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: Long, psttimeuntil: Long, uflags: UInt, pudistributionpointnamelength: Long, wszdistributionpointname: PWSTR, pudistributionpointurllength: Long, wszdistributionpointurl: PWSTR, phowner: Long, pfofficial: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), psttimefrom, psttimeuntil, uflags.toInt(), pudistributionpointnamelength, wszdistributionpointname, pudistributionpointurllength, wszdistributionpointurl, phowner, pfofficial)

public actual fun DRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), puissuancelicensetemplatelength, wszissuancelicensetemplate)

public actual fun DRMGetMetaData(hissuancelicense: UInt, pucontentidlength: Long, wszcontentid: PWSTR, pucontentidtypelength: Long, wszcontentidtype: PWSTR, puskuidlength: Long, wszskuid: PWSTR, puskuidtypelength: Long, wszskuidtype: PWSTR, pucontenttypelength: Long, wszcontenttype: PWSTR, pucontentnamelength: Long, wszcontentname: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetMetaData(hissuancelicense.toInt(), pucontentidlength, wszcontentid, pucontentidtypelength, wszcontentidtype, puskuidlength, wszskuid, puskuidtypelength, wszskuidtype, pucontenttypelength, wszcontenttype, pucontentnamelength, wszcontentname)

public actual fun DRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: Long, punamelength: Long, wszname: PWSTR, pudescriptionlength: Long, wszdescription: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), pulcid, punamelength, wszname, pudescriptionlength, wszdescription)

public actual fun DRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: Long, wszownerlicense: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetOwnerLicense(hissuancelicense.toInt(), puownerlicenselength, wszownerlicense)

public actual fun DRMGetProcAddress(hlibrary: UInt, wszprocname: PCWSTR, ppfnprocaddress: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetProcAddress(hlibrary.toInt(), wszprocname, ppfnprocaddress)

public actual fun DRMGetRevocationPoint(hissuancelicense: UInt, puidlength: Long, wszid: PWSTR, puidtypelength: Long, wszidtype: PWSTR, puurllength: Long, wszrl: PWSTR, pstfrequency: Long, punamelength: Long, wszname: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetRevocationPoint(hissuancelicense.toInt(), puidlength, wszid, puidtypelength, wszidtype, puurllength, wszrl, pstfrequency, punamelength, wszname, pupublickeylength, wszpublickey)

public actual fun DRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: Long, wszextendedinfoname: PWSTR, puextendedinfovaluelength: Long, wszextendedinfovalue: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), puextendedinfonamelength, wszextendedinfoname, puextendedinfovaluelength, wszextendedinfovalue)

public actual fun DRMGetRightInfo(hright: UInt, purightnamelength: Long, wszrightname: PWSTR, pstfrom: Long, pstuntil: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetRightInfo(hright.toInt(), purightnamelength, wszrightname, pstfrom, pstuntil)

public actual fun DRMGetSecurityProvider(uflags: UInt, putypelen: Long, wsztype: PWSTR, pupathlen: Long, wszpath: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetSecurityProvider(uflags.toInt(), putypelen, wsztype, pupathlen, wszpath)

public actual fun DRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: PCWSTR, puserviceurllength: Long, wszserviceurl: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), wszissuancelicense, puserviceurllength, wszserviceurl)

public actual fun DRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, wszclientlicensorcertificate: PCWSTR, pfncallback: DRMCALLBACK, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey, cbsymkey.toInt(), wszsymkeytype, wszclientlicensorcertificate, pfncallback.toLong(), wszurl, pvcontext)

public actual fun DRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, pvreserved: Long, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: DRMCALLBACK, pvcontext: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey, cbsymkey.toInt(), wszsymkeytype, pvreserved, henablingprincipal.toInt(), hboundlicenseclc.toInt(), pfncallback.toLong(), pvcontext)

public actual fun DRMGetTime(henv: UInt, etimeridtype: DRMTIMETYPE, potimeobject: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetTime(henv.toInt(), etimeridtype, potimeobject)

public actual fun DRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttribute(hqueryroot.toInt(), wszattributetype, iwhich.toInt(), peencoding, pcbuffer, pbbuffer)

public actual fun DRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: PCWSTR, pcattributes: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), wszattributetype, pcattributes)

public actual fun DRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iindex: UInt, phsubquery: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObject(hqueryroot.toInt(), wszsubobjecttype, iindex.toInt(), phsubquery)

public actual fun DRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype, pcsubobjects)

public actual fun DRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: PWSTR, puminversionlength: Long, wszminversion: PWSTR, pumaxversionlength: Long, wszmaxversion: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR, pudigestalgorithmlength: Long, wszdigestalgorithm: PWSTR, pcbdigest: Long, pbdigest: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), peusagepolicytype, pfexclusion, punamelength, wszname, puminversionlength, wszminversion, pumaxversionlength, wszmaxversion, pupublickeylength, wszpublickey, pudigestalgorithmlength, wszdigestalgorithm, pcbdigest, pbdigest)

public actual fun DRMGetUserInfo(huser: UInt, puusernamelength: Long, wszusername: PWSTR, puuseridlength: Long, wszuserid: PWSTR, puuseridtypelength: Long, wszuseridtype: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUserInfo(huser.toInt(), puusernamelength, wszusername, puuseridlength, wszuserid, puuseridtypelength, wszuseridtype)

public actual fun DRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), phright)

public actual fun DRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), phuser)

public actual fun DRMInitEnvironment(esecurityprovidertype: DRMSECURITYPROVIDERTYPE, especification: DRMSPECTYPE, wszsecurityprovider: PCWSTR, wszmanifestcredentials: PCWSTR, wszmachinecredentials: PCWSTR, phenv: Long, phdefaultlibrary: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider, wszmanifestcredentials, wszmachinecredentials, phenv, phdefaultlibrary)

public actual fun DRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMIsActivated(hclient.toInt(), uflags.toInt(), pactservinfo)

public actual fun DRMIsWindowProtected(hwnd: HWND, pfprotected: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMIsWindowProtected(hwnd, pfprotected)

public actual fun DRMLoadLibrary(henv: UInt, especification: DRMSPECTYPE, wszlibraryprovider: PCWSTR, wszcredentials: PCWSTR, phlibrary: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMLoadLibrary(henv.toInt(), especification, wszlibraryprovider, wszcredentials, phlibrary)

public actual fun DRMParseUnboundLicense(wszcertificate: PCWSTR, phqueryroot: Long): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMParseUnboundLicense(wszcertificate, phqueryroot)

public actual fun DRMRegisterContent(fregister: BOOL): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMRegisterContent(fregister)

public actual fun DRMRegisterProtectedWindow(henv: UInt, hwnd: HWND): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMRegisterProtectedWindow(henv.toInt(), hwnd)

public actual fun DRMRegisterRevocationList(henv: UInt, wszrevocationlist: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMRegisterRevocationList(henv.toInt(), wszrevocationlist)

public actual fun DRMRepair(): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMRepair()

public actual fun DRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: BOOL, wszname: PCWSTR, wszvalue: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, wszname, wszvalue)

public actual fun DRMSetGlobalOptions(eglobaloptions: DRMGLOBALOPTIONS, pvdata: Long, dwlen: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetGlobalOptions(eglobaloptions, pvdata, dwlen.toInt())

public actual fun DRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt())

public actual fun DRMSetMetaData(hissuancelicense: UInt, wszcontentid: PCWSTR, wszcontentidtype: PCWSTR, wszskuid: PCWSTR, wszskuidtype: PCWSTR, wszcontenttype: PCWSTR, wszcontentname: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetMetaData(hissuancelicense.toInt(), wszcontentid, wszcontentidtype, wszskuid, wszskuidtype, wszcontenttype, wszcontentname)

public actual fun DRMSetNameAndDescription(hissuancelicense: UInt, fdelete: BOOL, lcid: UInt, wszname: PCWSTR, wszdescription: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), wszname, wszdescription)

public actual fun DRMSetRevocationPoint(hissuancelicense: UInt, fdelete: BOOL, wszid: PCWSTR, wszidtype: PCWSTR, wszurl: PCWSTR, pstfrequency: Long, wszname: PCWSTR, wszpublickey: PCWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, wszid, wszidtype, wszurl, pstfrequency, wszname, wszpublickey)

public actual fun DRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DRM_USAGEPOLICY_TYPE, fdelete: BOOL, fexclusion: BOOL, wszname: PCWSTR, wszminversion: PCWSTR, wszmaxversion: PCWSTR, wszpublickey: PCWSTR, wszdigestalgorithm: PCWSTR, pbdigest: Long, cbdigest: UInt): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, wszname, wszminversion, wszmaxversion, wszpublickey, wszdigestalgorithm, pbdigest, cbdigest.toInt())

public actual fun DRMVerify(wszdata: PCWSTR, pcattesteddata: Long, wszattesteddata: PWSTR, petype: Long, pcprincipal: Long, wszprincipal: PWSTR, pcmanifest: Long, wszmanifest: PWSTR): HRESULT =
    WindowsWin32DataRightsmanagementJniBridge.windowssys_windows_win32_data_rightsmanagement_DRMVerify(wszdata, pcattesteddata, wszattesteddata, petype, pcprincipal, wszprincipal, pcmanifest, wszmanifest)
