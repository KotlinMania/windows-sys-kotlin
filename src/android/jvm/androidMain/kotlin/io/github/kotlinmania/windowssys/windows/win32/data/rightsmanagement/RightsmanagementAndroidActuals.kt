@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Farproc
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

private object WindowsWin32DataRightsmanagementJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(hlicensestorage: Int, wszlicense: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(hclient: Int, uflags: Int, pvreserved: Long, ctemplates: Int, pwsztemplateids: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(hsession: Int, uflags: Int, wszgroupidentitycredential: Long, wszrequestedrights: Long, wszcustomdata: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMActivate(hclient: Int, uflags: Int, ulangid: Int, pactservinfo: Long, pvcontext: Long, hparentwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMAddLicense(hlicensestorage: Int, uflags: Int, wszlicense: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense: Int, hright: Int, huser: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMAttest(henablingprincipal: Int, wszdata: Long, etype: Int, pcattestedblob: Long, wszattestedblob: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv: Int, clevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(ccertificates: Int, rgwszcertificates: Long, pcchain: Long, wszchain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(henv: Int, pparams: Long, wszlicensechain: Long, phboundlicense: Long, pherrorlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(pfncallback: Long, ucallbackversion: Int, wszgroupidprovidertype: Long, wszgroupid: Long, phclient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(hboundlicense: Int, wszright: Long, hauxlib: Int, wszauxplug: Long, phdecryptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(hboundlicense: Int, wszright: Long, hauxlib: Int, wszauxplug: Long, phencryptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(henv: Int, hlibrary: Int, wszobject: Long, pidprincipal: Long, wszcredentials: Long, phenablingprincipal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: Long, wszreferralinfourl: Long, howner: Int, wszissuancelicense: Long, hboundlicense: Int, phissuancelicense: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(henv: Int, hdefaultlibrary: Int, hclient: Int, uflags: Int, wszissuancelicense: Long, phlicensestorage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateRight(wszrightname: Long, pstfrom: Long, pstuntil: Long, cextendedinfo: Int, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMCreateUser(wszusername: Long, wszuserid: Long, wszuseridtype: Long, phuser: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDecode(wszalgid: Long, wszencodedstring: Long, pudecodeddatalen: Long, pbdecodeddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(wszchain: Long, iwhich: Int, pccert: Long, wszcert: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDecrypt(hcryptoprovider: Int, iposition: Int, cnuminbytes: Int, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(hsession: Int, wszlicenseid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(htocopy: Int, phcopy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(htocopy: Int, phcopy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(hpubin: Int, phpubout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(hsessionin: Int, phsessionout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMEncode(wszalgid: Long, udatalen: Int, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMEncrypt(hcryptoprovider: Int, iposition: Int, cnuminbytes: Int, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(hsession: Int, uflags: Int, uindex: Int, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(hissuancelicense: Int, uindex: Int, punamelength: Long, wszname: Long, puvaluelength: Long, wszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(hqueryroot: Int, wszattribute: Long, iwhich: Int, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(hqueryroot: Int, wszattribute: Long, pcattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(hqueryroot: Int, wszsubobjecttype: Long, iwhich: Int, phsubobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(hqueryroot: Int, wszsubobjecttype: Long, pcsubobjects: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(wszchain: Long, pccertcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(pdrmclientversioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(handle: Int, wszattribute: Long, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetInfo(handle: Int, wszattribute: Long, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(hissuancelicense: Int, pcdays: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(hissuancelicense: Int, psttimefrom: Long, psttimeuntil: Long, uflags: Int, pudistributionpointnamelength: Long, wszdistributionpointname: Long, pudistributionpointurllength: Long, wszdistributionpointurl: Long, phowner: Long, pfofficial: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(hissuancelicense: Int, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetMetaData(hissuancelicense: Int, pucontentidlength: Long, wszcontentid: Long, pucontentidtypelength: Long, wszcontentidtype: Long, puskuidlength: Long, wszskuid: Long, puskuidtypelength: Long, wszskuidtype: Long, pucontenttypelength: Long, wszcontenttype: Long, pucontentnamelength: Long, wszcontentname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(hissuancelicense: Int, uindex: Int, pulcid: Long, punamelength: Long, wszname: Long, pudescriptionlength: Long, wszdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(hissuancelicense: Int, puownerlicenselength: Long, wszownerlicense: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(hlibrary: Int, wszprocname: Long, ppfnprocaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(hissuancelicense: Int, puidlength: Long, wszid: Long, puidtypelength: Long, wszidtype: Long, puurllength: Long, wszrl: Long, pstfrequency: Long, punamelength: Long, wszname: Long, pupublickeylength: Long, wszpublickey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(hright: Int, uindex: Int, puextendedinfonamelength: Long, wszextendedinfoname: Long, puextendedinfovaluelength: Long, wszextendedinfovalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(hright: Int, purightnamelength: Long, wszrightname: Long, pstfrom: Long, pstuntil: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(uflags: Int, putypelen: Long, wsztype: Long, pupathlen: Long, wszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(hclient: Int, uservicetype: Int, uservicelocation: Int, wszissuancelicense: Long, puserviceurllength: Long, wszserviceurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(henv: Int, hissuancelicense: Int, uflags: Int, pbsymkey: Long, cbsymkey: Int, wszsymkeytype: Long, wszclientlicensorcertificate: Long, pfncallback: Long, wszurl: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(henv: Int, hissuancelicense: Int, uflags: Int, pbsymkey: Long, cbsymkey: Int, wszsymkeytype: Long, pvreserved: Long, henablingprincipal: Int, hboundlicenseclc: Int, pfncallback: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetTime(henv: Int, etimeridtype: Int, potimeobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(hqueryroot: Int, wszattributetype: Long, iwhich: Int, peencoding: Long, pcbuffer: Long, pbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(hqueryroot: Int, wszattributetype: Long, pcattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(hqueryroot: Int, wszsubobjecttype: Long, iindex: Int, phsubquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(hqueryroot: Int, wszsubobjecttype: Long, pcsubobjects: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(hissuancelicense: Int, uindex: Int, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: Long, puminversionlength: Long, wszminversion: Long, pumaxversionlength: Long, wszmaxversion: Long, pupublickeylength: Long, wszpublickey: Long, pudigestalgorithmlength: Long, wszdigestalgorithm: Long, pcbdigest: Long, pbdigest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(huser: Int, puusernamelength: Long, wszusername: Long, puuseridlength: Long, wszuserid: Long, puuseridtypelength: Long, wszuseridtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUserRights(hissuancelicense: Int, huser: Int, uindex: Int, phright: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMGetUsers(hissuancelicense: Int, uindex: Int, phuser: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(esecurityprovidertype: Int, especification: Int, wszsecurityprovider: Long, wszmanifestcredentials: Long, wszmachinecredentials: Long, phenv: Long, phdefaultlibrary: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMIsActivated(hclient: Int, uflags: Int, pactservinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(hwnd: Long, pfprotected: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(henv: Int, especification: Int, wszlibraryprovider: Long, wszcredentials: Long, phlibrary: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(wszcertificate: Long, phqueryroot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(henv: Int, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(henv: Int, wszrevocationlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMRepair(): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(hissuancelicense: Int, fdelete: Int, wszname: Long, wszvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(eglobaloptions: Int, pvdata: Long, dwlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense: Int, cdays: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetMetaData(hissuancelicense: Int, wszcontentid: Long, wszcontentidtype: Long, wszskuid: Long, wszskuidtype: Long, wszcontenttype: Long, wszcontentname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(hissuancelicense: Int, fdelete: Int, lcid: Int, wszname: Long, wszdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(hissuancelicense: Int, fdelete: Int, wszid: Long, wszidtype: Long, wszurl: Long, pstfrequency: Long, wszname: Long, wszpublickey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(hissuancelicense: Int, eusagepolicytype: Int, fdelete: Int, fexclusion: Int, wszname: Long, wszminversion: Long, wszmaxversion: Long, wszpublickey: Long, wszdigestalgorithm: Long, pbdigest: Long, cbdigest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DataRightsmanagementDRMVerify(wszdata: Long, pcattesteddata: Long, wszattesteddata: Long, petype: Long, pcprincipal: Long, wszprincipal: Long, pcmanifest: Long, wszmanifest: Long): Int
}

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(hlicensestorage.toInt(), wszlicense.rawAddress, wszurl.rawAddress, pvcontext.rawAddress)

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr<CVoid>, ctemplates: UInt, pwsztemplateids: ConstPtr<Pcwstr>, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), pvreserved.rawAddress, ctemplates.toInt(), pwsztemplateids.rawAddress, wszurl.rawAddress, pvcontext.rawAddress)

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(hsession.toInt(), uflags.toInt(), wszgroupidentitycredential.rawAddress, wszrequestedrights.rawAddress, wszcustomdata.rawAddress, wszurl.rawAddress, pvcontext.rawAddress)

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr<DrmActservInfo>, pvcontext: MutPtr<CVoid>, hparentwnd: Hwnd): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), pactservinfo.rawAddress, pvcontext.rawAddress, hparentwnd.rawAddress)

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), wszlicense.rawAddress)

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt())

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr<UInt>, wszattestedblob: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMAttest(henablingprincipal.toInt(), wszdata.rawAddress, etype, pcattestedblob.rawAddress, wszattestedblob.rawAddress)

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv.toInt(), clevel.toInt())

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense.toInt())

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv.toInt())

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle.toInt())

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub.toInt())

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery.toInt())

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession.toInt())

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr<Pcwstr>, pcchain: MutPtr<UInt>, wszchain: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(ccertificates.toInt(), rgwszcertificates.rawAddress, pcchain.rawAddress, wszchain.rawAddress)

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr<Drmboundlicenseparams>, wszlicensechain: Pcwstr, phboundlicense: MutPtr<UInt>, pherrorlog: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(henv.toInt(), pparams.rawAddress, wszlicensechain.rawAddress, phboundlicense.rawAddress, pherrorlog.rawAddress)

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(0L, ucallbackversion.toInt(), wszgroupidprovidertype.rawAddress, wszgroupid.rawAddress, phclient.rawAddress)

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), wszright.rawAddress, hauxlib.toInt(), wszauxplug.rawAddress, phdecryptor.rawAddress)

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), wszright.rawAddress, hauxlib.toInt(), wszauxplug.rawAddress, phencryptor.rawAddress)

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr<Drmid>, wszcredentials: Pcwstr, phenablingprincipal: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), wszobject.rawAddress, pidprincipal.rawAddress, wszcredentials.rawAddress, phenablingprincipal.rawAddress)

public actual fun dRMCreateIssuanceLicense(psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(psttimefrom.rawAddress, psttimeuntil.rawAddress, wszreferralinfoname.rawAddress, wszreferralinfourl.rawAddress, howner.toInt(), wszissuancelicense.rawAddress, hboundlicense.toInt(), phissuancelicense.rawAddress)

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), wszissuancelicense.rawAddress, phlicensestorage.rawAddress)

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr<Pcwstr>, pwszextendedinfovalue: ConstPtr<Pcwstr>, phright: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateRight(wszrightname.rawAddress, pstfrom.rawAddress, pstuntil.rawAddress, cextendedinfo.toInt(), pwszextendedinfoname.rawAddress, pwszextendedinfovalue.rawAddress, phright.rawAddress)

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMCreateUser(wszusername.rawAddress, wszuserid.rawAddress, wszuseridtype.rawAddress, phuser.rawAddress)

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr<UInt>, pbdecodeddata: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDecode(wszalgid.rawAddress, wszencodedstring.rawAddress, pudecodeddatalen.rawAddress, pbdecodeddata.rawAddress)

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr<UInt>, wszcert: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(wszchain.rawAddress, iwhich.toInt(), pccert.rawAddress, wszcert.rawAddress)

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.rawAddress, pcnumoutbytes.rawAddress, pboutdata.rawAddress)

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(hsession.toInt(), wszlicenseid.rawAddress)

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(htocopy.toInt(), phcopy.rawAddress)

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(htocopy.toInt(), phcopy.rawAddress)

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(hpubin.toInt(), phpubout.rawAddress)

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(hsessionin.toInt(), phsessionout.rawAddress)

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr<UByte>, puencodedstringlen: MutPtr<UInt>, wszencodedstring: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMEncode(wszalgid.rawAddress, udatalen.toInt(), pbdecodeddata.rawAddress, puencodedstringlen.rawAddress, wszencodedstring.rawAddress)

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.rawAddress, pcnumoutbytes.rawAddress, pboutdata.rawAddress)

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr<Bool>, pucertificatedatalen: MutPtr<UInt>, wszcertificatedata: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), pfsharedflag.rawAddress, pucertificatedatalen.rawAddress, wszcertificatedata.rawAddress)

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr<UInt>, wszname: Pwstr, puvaluelength: MutPtr<UInt>, wszvalue: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), punamelength.rawAddress, wszname.rawAddress, puvaluelength.rawAddress, wszvalue.rawAddress)

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(hqueryroot.toInt(), wszattribute.rawAddress, iwhich.toInt(), peencoding.rawAddress, pcbuffer.rawAddress, pbbuffer.rawAddress)

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), wszattribute.rawAddress, pcattributes.rawAddress)

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.rawAddress, iwhich.toInt(), phsubobject.rawAddress)

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.rawAddress, pcsubobjects.rawAddress)

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(wszchain.rawAddress, pccertcount.rawAddress)

public actual fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr<DrmClientVersionInfo>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(pdrmclientversioninfo.rawAddress)

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(handle.toInt(), wszattribute.rawAddress, peencoding.rawAddress, pcbuffer.rawAddress, pbbuffer.rawAddress)

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetInfo(handle.toInt(), wszattribute.rawAddress, peencoding.rawAddress, pcbuffer.rawAddress, pbbuffer.rawAddress)

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(hissuancelicense.toInt(), pcdays.rawAddress)

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, uflags: UInt, pudistributionpointnamelength: MutPtr<UInt>, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr<UInt>, wszdistributionpointurl: Pwstr, phowner: MutPtr<UInt>, pfofficial: MutPtr<Bool>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), psttimefrom.rawAddress, psttimeuntil.rawAddress, uflags.toInt(), pudistributionpointnamelength.rawAddress, wszdistributionpointname.rawAddress, pudistributionpointurllength.rawAddress, wszdistributionpointurl.rawAddress, phowner.rawAddress, pfofficial.rawAddress)

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr<UInt>, wszissuancelicensetemplate: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), puissuancelicensetemplatelength.rawAddress, wszissuancelicensetemplate.rawAddress)

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr<UInt>, wszcontentid: Pwstr, pucontentidtypelength: MutPtr<UInt>, wszcontentidtype: Pwstr, puskuidlength: MutPtr<UInt>, wszskuid: Pwstr, puskuidtypelength: MutPtr<UInt>, wszskuidtype: Pwstr, pucontenttypelength: MutPtr<UInt>, wszcontenttype: Pwstr, pucontentnamelength: MutPtr<UInt>, wszcontentname: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetMetaData(hissuancelicense.toInt(), pucontentidlength.rawAddress, wszcontentid.rawAddress, pucontentidtypelength.rawAddress, wszcontentidtype.rawAddress, puskuidlength.rawAddress, wszskuid.rawAddress, puskuidtypelength.rawAddress, wszskuidtype.rawAddress, pucontenttypelength.rawAddress, wszcontenttype.rawAddress, pucontentnamelength.rawAddress, wszcontentname.rawAddress)

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr<UInt>, punamelength: MutPtr<UInt>, wszname: Pwstr, pudescriptionlength: MutPtr<UInt>, wszdescription: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), pulcid.rawAddress, punamelength.rawAddress, wszname.rawAddress, pudescriptionlength.rawAddress, wszdescription.rawAddress)

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr<UInt>, wszownerlicense: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(hissuancelicense.toInt(), puownerlicenselength.rawAddress, wszownerlicense.rawAddress)

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr<Farproc>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(hlibrary.toInt(), wszprocname.rawAddress, ppfnprocaddress.rawAddress)

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr<UInt>, wszid: Pwstr, puidtypelength: MutPtr<UInt>, wszidtype: Pwstr, puurllength: MutPtr<UInt>, wszrl: Pwstr, pstfrequency: MutPtr<Systemtime>, punamelength: MutPtr<UInt>, wszname: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(hissuancelicense.toInt(), puidlength.rawAddress, wszid.rawAddress, puidtypelength.rawAddress, wszidtype.rawAddress, puurllength.rawAddress, wszrl.rawAddress, pstfrequency.rawAddress, punamelength.rawAddress, wszname.rawAddress, pupublickeylength.rawAddress, wszpublickey.rawAddress)

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr<UInt>, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr<UInt>, wszextendedinfovalue: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), puextendedinfonamelength.rawAddress, wszextendedinfoname.rawAddress, puextendedinfovaluelength.rawAddress, wszextendedinfovalue.rawAddress)

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr<UInt>, wszrightname: Pwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(hright.toInt(), purightnamelength.rawAddress, wszrightname.rawAddress, pstfrom.rawAddress, pstuntil.rawAddress)

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr<UInt>, wsztype: Pwstr, pupathlen: MutPtr<UInt>, wszpath: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(uflags.toInt(), putypelen.rawAddress, wsztype.rawAddress, pupathlen.rawAddress, wszpath.rawAddress)

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr<UInt>, wszserviceurl: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), wszissuancelicense.rawAddress, puserviceurllength.rawAddress, wszserviceurl.rawAddress)

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.rawAddress, cbsymkey.toInt(), wszsymkeytype.rawAddress, wszclientlicensorcertificate.rawAddress, 0L, wszurl.rawAddress, pvcontext.rawAddress)

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr<CVoid>, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr<CVoid>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.rawAddress, cbsymkey.toInt(), wszsymkeytype.rawAddress, pvreserved.rawAddress, henablingprincipal.toInt(), hboundlicenseclc.toInt(), 0L, pvcontext.rawAddress)

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr<Systemtime>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetTime(henv.toInt(), etimeridtype, potimeobject.rawAddress)

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(hqueryroot.toInt(), wszattributetype.rawAddress, iwhich.toInt(), peencoding.rawAddress, pcbuffer.rawAddress, pbbuffer.rawAddress)

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), wszattributetype.rawAddress, pcattributes.rawAddress)

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.rawAddress, iindex.toInt(), phsubquery.rawAddress)

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.rawAddress, pcsubobjects.rawAddress)

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr<DrmUsagepolicyType>, pfexclusion: MutPtr<Bool>, punamelength: MutPtr<UInt>, wszname: Pwstr, puminversionlength: MutPtr<UInt>, wszminversion: Pwstr, pumaxversionlength: MutPtr<UInt>, wszmaxversion: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr<UInt>, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr<UInt>, pbdigest: MutPtr<UByte>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), peusagepolicytype.rawAddress, pfexclusion.rawAddress, punamelength.rawAddress, wszname.rawAddress, puminversionlength.rawAddress, wszminversion.rawAddress, pumaxversionlength.rawAddress, wszmaxversion.rawAddress, pupublickeylength.rawAddress, wszpublickey.rawAddress, pudigestalgorithmlength.rawAddress, wszdigestalgorithm.rawAddress, pcbdigest.rawAddress, pbdigest.rawAddress)

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr<UInt>, wszusername: Pwstr, puuseridlength: MutPtr<UInt>, wszuserid: Pwstr, puuseridtypelength: MutPtr<UInt>, wszuseridtype: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(huser.toInt(), puusernamelength.rawAddress, wszusername.rawAddress, puuseridlength.rawAddress, wszuserid.rawAddress, puuseridtypelength.rawAddress, wszuseridtype.rawAddress)

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), phright.rawAddress)

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), phuser.rawAddress)

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr<UInt>, phdefaultlibrary: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider.rawAddress, wszmanifestcredentials.rawAddress, wszmachinecredentials.rawAddress, phenv.rawAddress, phdefaultlibrary.rawAddress)

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr<DrmActservInfo>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMIsActivated(hclient.toInt(), uflags.toInt(), pactservinfo.rawAddress)

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr<Bool>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(hwnd.rawAddress, pfprotected.rawAddress)

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(henv.toInt(), especification, wszlibraryprovider.rawAddress, wszcredentials.rawAddress, phlibrary.rawAddress)

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr<UInt>): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(wszcertificate.rawAddress, phqueryroot.rawAddress)

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister)

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(henv.toInt(), hwnd.rawAddress)

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(henv.toInt(), wszrevocationlist.rawAddress)

public actual fun dRMRepair(): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMRepair()

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, wszname.rawAddress, wszvalue.rawAddress)

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr<CVoid>, dwlen: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(eglobaloptions, pvdata.rawAddress, dwlen.toInt())

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt())

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetMetaData(hissuancelicense.toInt(), wszcontentid.rawAddress, wszcontentidtype.rawAddress, wszskuid.rawAddress, wszskuidtype.rawAddress, wszcontenttype.rawAddress, wszcontentname.rawAddress)

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), wszname.rawAddress, wszdescription.rawAddress)

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr<Systemtime>, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, wszid.rawAddress, wszidtype.rawAddress, wszurl.rawAddress, pstfrequency.rawAddress, wszname.rawAddress, wszpublickey.rawAddress)

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr<UByte>, cbdigest: UInt): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, wszname.rawAddress, wszminversion.rawAddress, wszmaxversion.rawAddress, wszpublickey.rawAddress, wszdigestalgorithm.rawAddress, pbdigest.rawAddress, cbdigest.toInt())

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr<UInt>, wszattesteddata: Pwstr, petype: MutPtr<Drmattesttype>, pcprincipal: MutPtr<UInt>, wszprincipal: Pwstr, pcmanifest: MutPtr<UInt>, wszmanifest: Pwstr): Hresult =
    WindowsWin32DataRightsmanagementJniBridge.windowssysWindowsWin32DataRightsmanagementDRMVerify(wszdata.rawAddress, pcattesteddata.rawAddress, wszattesteddata.rawAddress, petype.rawAddress, pcprincipal.rawAddress, wszprincipal.rawAddress, pcmanifest.rawAddress, wszmanifest.rawAddress)
