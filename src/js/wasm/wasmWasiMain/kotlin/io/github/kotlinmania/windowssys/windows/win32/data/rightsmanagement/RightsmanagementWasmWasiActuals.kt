@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun DRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    0

public actual fun DRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: Long, ctemplates: UInt, pwsztemplateids: Long, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    0

public actual fun DRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: PCWSTR, wszrequestedrights: PCWSTR, wszcustomdata: PCWSTR, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    0

public actual fun DRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: Long, pvcontext: Long, hparentwnd: HWND): HRESULT =
    0

public actual fun DRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: PCWSTR): HRESULT =
    0

public actual fun DRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): HRESULT =
    0

public actual fun DRMAttest(henablingprincipal: UInt, wszdata: PCWSTR, etype: DRMATTESTTYPE, pcattestedblob: Long, wszattestedblob: PWSTR): HRESULT =
    0

public actual fun DRMCheckSecurity(henv: UInt, clevel: UInt): HRESULT =
    0

public actual fun DRMClearAllRights(hissuancelicense: UInt): HRESULT =
    0

public actual fun DRMCloseEnvironmentHandle(henv: UInt): HRESULT =
    0

public actual fun DRMCloseHandle(handle: UInt): HRESULT =
    0

public actual fun DRMClosePubHandle(hpub: UInt): HRESULT =
    0

public actual fun DRMCloseQueryHandle(hquery: UInt): HRESULT =
    0

public actual fun DRMCloseSession(hsession: UInt): HRESULT =
    0

public actual fun DRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: Long, pcchain: Long, wszchain: PWSTR): HRESULT =
    0

public actual fun DRMCreateBoundLicense(henv: UInt, pparams: Long, wszlicensechain: PCWSTR, phboundlicense: Long, pherrorlog: Long): HRESULT =
    0

public actual fun DRMCreateClientSession(pfncallback: DRMCALLBACK, ucallbackversion: UInt, wszgroupidprovidertype: PCWSTR, wszgroupid: PCWSTR, phclient: Long): HRESULT =
    0

public actual fun DRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phdecryptor: Long): HRESULT =
    0

public actual fun DRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: PCWSTR, hauxlib: UInt, wszauxplug: PCWSTR, phencryptor: Long): HRESULT =
    0

public actual fun DRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: PCWSTR, pidprincipal: Long, wszcredentials: PCWSTR, phenablingprincipal: Long): HRESULT =
    0

public actual fun DRMCreateIssuanceLicense(psttimefrom: Long, psttimeuntil: Long, wszreferralinfoname: PCWSTR, wszreferralinfourl: PCWSTR, howner: UInt, wszissuancelicense: PCWSTR, hboundlicense: UInt, phissuancelicense: Long): HRESULT =
    0

public actual fun DRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: PCWSTR, phlicensestorage: Long): HRESULT =
    0

public actual fun DRMCreateRight(wszrightname: PCWSTR, pstfrom: Long, pstuntil: Long, cextendedinfo: UInt, pwszextendedinfoname: Long, pwszextendedinfovalue: Long, phright: Long): HRESULT =
    0

public actual fun DRMCreateUser(wszusername: PCWSTR, wszuserid: PCWSTR, wszuseridtype: PCWSTR, phuser: Long): HRESULT =
    0

public actual fun DRMDecode(wszalgid: PCWSTR, wszencodedstring: PCWSTR, pudecodeddatalen: Long, pbdecodeddata: Long): HRESULT =
    0

public actual fun DRMDeconstructCertificateChain(wszchain: PCWSTR, iwhich: UInt, pccert: Long, wszcert: PWSTR): HRESULT =
    0

public actual fun DRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    0

public actual fun DRMDeleteLicense(hsession: UInt, wszlicenseid: PCWSTR): HRESULT =
    0

public actual fun DRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: Long): HRESULT =
    0

public actual fun DRMDuplicateHandle(htocopy: UInt, phcopy: Long): HRESULT =
    0

public actual fun DRMDuplicatePubHandle(hpubin: UInt, phpubout: Long): HRESULT =
    0

public actual fun DRMDuplicateSession(hsessionin: UInt, phsessionout: Long): HRESULT =
    0

public actual fun DRMEncode(wszalgid: PCWSTR, udatalen: UInt, pbdecodeddata: Long, puencodedstringlen: Long, wszencodedstring: PWSTR): HRESULT =
    0

public actual fun DRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: Long, pcnumoutbytes: Long, pboutdata: Long): HRESULT =
    0

public actual fun DRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: Long, pucertificatedatalen: Long, wszcertificatedata: PWSTR): HRESULT =
    0

public actual fun DRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: Long, wszname: PWSTR, puvaluelength: Long, wszvalue: PWSTR): HRESULT =
    0

public actual fun DRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    0

public actual fun DRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: PCWSTR, pcattributes: Long): HRESULT =
    0

public actual fun DRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iwhich: UInt, phsubobject: Long): HRESULT =
    0

public actual fun DRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    0

public actual fun DRMGetCertificateChainCount(wszchain: PCWSTR, pccertcount: Long): HRESULT =
    0

public actual fun DRMGetClientVersion(pdrmclientversioninfo: Long): HRESULT =
    0

public actual fun DRMGetEnvironmentInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    0

public actual fun DRMGetInfo(handle: UInt, wszattribute: PCWSTR, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    0

public actual fun DRMGetIntervalTime(hissuancelicense: UInt, pcdays: Long): HRESULT =
    0

public actual fun DRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: Long, psttimeuntil: Long, uflags: UInt, pudistributionpointnamelength: Long, wszdistributionpointname: PWSTR, pudistributionpointurllength: Long, wszdistributionpointurl: PWSTR, phowner: Long, pfofficial: Long): HRESULT =
    0

public actual fun DRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: Long, wszissuancelicensetemplate: PWSTR): HRESULT =
    0

public actual fun DRMGetMetaData(hissuancelicense: UInt, pucontentidlength: Long, wszcontentid: PWSTR, pucontentidtypelength: Long, wszcontentidtype: PWSTR, puskuidlength: Long, wszskuid: PWSTR, puskuidtypelength: Long, wszskuidtype: PWSTR, pucontenttypelength: Long, wszcontenttype: PWSTR, pucontentnamelength: Long, wszcontentname: PWSTR): HRESULT =
    0

public actual fun DRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: Long, punamelength: Long, wszname: PWSTR, pudescriptionlength: Long, wszdescription: PWSTR): HRESULT =
    0

public actual fun DRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: Long, wszownerlicense: PWSTR): HRESULT =
    0

public actual fun DRMGetProcAddress(hlibrary: UInt, wszprocname: PCWSTR, ppfnprocaddress: Long): HRESULT =
    0

public actual fun DRMGetRevocationPoint(hissuancelicense: UInt, puidlength: Long, wszid: PWSTR, puidtypelength: Long, wszidtype: PWSTR, puurllength: Long, wszrl: PWSTR, pstfrequency: Long, punamelength: Long, wszname: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR): HRESULT =
    0

public actual fun DRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: Long, wszextendedinfoname: PWSTR, puextendedinfovaluelength: Long, wszextendedinfovalue: PWSTR): HRESULT =
    0

public actual fun DRMGetRightInfo(hright: UInt, purightnamelength: Long, wszrightname: PWSTR, pstfrom: Long, pstuntil: Long): HRESULT =
    0

public actual fun DRMGetSecurityProvider(uflags: UInt, putypelen: Long, wsztype: PWSTR, pupathlen: Long, wszpath: PWSTR): HRESULT =
    0

public actual fun DRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: PCWSTR, puserviceurllength: Long, wszserviceurl: PWSTR): HRESULT =
    0

public actual fun DRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, wszclientlicensorcertificate: PCWSTR, pfncallback: DRMCALLBACK, wszurl: PCWSTR, pvcontext: Long): HRESULT =
    0

public actual fun DRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: Long, cbsymkey: UInt, wszsymkeytype: PCWSTR, pvreserved: Long, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: DRMCALLBACK, pvcontext: Long): HRESULT =
    0

public actual fun DRMGetTime(henv: UInt, etimeridtype: DRMTIMETYPE, potimeobject: Long): HRESULT =
    0

public actual fun DRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: PCWSTR, iwhich: UInt, peencoding: Long, pcbuffer: Long, pbbuffer: Long): HRESULT =
    0

public actual fun DRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: PCWSTR, pcattributes: Long): HRESULT =
    0

public actual fun DRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: PCWSTR, iindex: UInt, phsubquery: Long): HRESULT =
    0

public actual fun DRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: PCWSTR, pcsubobjects: Long): HRESULT =
    0

public actual fun DRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: Long, pfexclusion: Long, punamelength: Long, wszname: PWSTR, puminversionlength: Long, wszminversion: PWSTR, pumaxversionlength: Long, wszmaxversion: PWSTR, pupublickeylength: Long, wszpublickey: PWSTR, pudigestalgorithmlength: Long, wszdigestalgorithm: PWSTR, pcbdigest: Long, pbdigest: Long): HRESULT =
    0

public actual fun DRMGetUserInfo(huser: UInt, puusernamelength: Long, wszusername: PWSTR, puuseridlength: Long, wszuserid: PWSTR, puuseridtypelength: Long, wszuseridtype: PWSTR): HRESULT =
    0

public actual fun DRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: Long): HRESULT =
    0

public actual fun DRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: Long): HRESULT =
    0

public actual fun DRMInitEnvironment(esecurityprovidertype: DRMSECURITYPROVIDERTYPE, especification: DRMSPECTYPE, wszsecurityprovider: PCWSTR, wszmanifestcredentials: PCWSTR, wszmachinecredentials: PCWSTR, phenv: Long, phdefaultlibrary: Long): HRESULT =
    0

public actual fun DRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: Long): HRESULT =
    0

public actual fun DRMIsWindowProtected(hwnd: HWND, pfprotected: Long): HRESULT =
    0

public actual fun DRMLoadLibrary(henv: UInt, especification: DRMSPECTYPE, wszlibraryprovider: PCWSTR, wszcredentials: PCWSTR, phlibrary: Long): HRESULT =
    0

public actual fun DRMParseUnboundLicense(wszcertificate: PCWSTR, phqueryroot: Long): HRESULT =
    0

public actual fun DRMRegisterContent(fregister: BOOL): HRESULT =
    0

public actual fun DRMRegisterProtectedWindow(henv: UInt, hwnd: HWND): HRESULT =
    0

public actual fun DRMRegisterRevocationList(henv: UInt, wszrevocationlist: PCWSTR): HRESULT =
    0

public actual fun DRMRepair(): HRESULT =
    0

public actual fun DRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: BOOL, wszname: PCWSTR, wszvalue: PCWSTR): HRESULT =
    0

public actual fun DRMSetGlobalOptions(eglobaloptions: DRMGLOBALOPTIONS, pvdata: Long, dwlen: UInt): HRESULT =
    0

public actual fun DRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): HRESULT =
    0

public actual fun DRMSetMetaData(hissuancelicense: UInt, wszcontentid: PCWSTR, wszcontentidtype: PCWSTR, wszskuid: PCWSTR, wszskuidtype: PCWSTR, wszcontenttype: PCWSTR, wszcontentname: PCWSTR): HRESULT =
    0

public actual fun DRMSetNameAndDescription(hissuancelicense: UInt, fdelete: BOOL, lcid: UInt, wszname: PCWSTR, wszdescription: PCWSTR): HRESULT =
    0

public actual fun DRMSetRevocationPoint(hissuancelicense: UInt, fdelete: BOOL, wszid: PCWSTR, wszidtype: PCWSTR, wszurl: PCWSTR, pstfrequency: Long, wszname: PCWSTR, wszpublickey: PCWSTR): HRESULT =
    0

public actual fun DRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DRM_USAGEPOLICY_TYPE, fdelete: BOOL, fexclusion: BOOL, wszname: PCWSTR, wszminversion: PCWSTR, wszmaxversion: PCWSTR, wszpublickey: PCWSTR, wszdigestalgorithm: PCWSTR, pbdigest: Long, cbdigest: UInt): HRESULT =
    0

public actual fun DRMVerify(wszdata: PCWSTR, pcattesteddata: Long, wszattesteddata: PWSTR, petype: Long, pcprincipal: Long, wszprincipal: PWSTR, pcmanifest: Long, wszmanifest: PWSTR): HRESULT =
    0
