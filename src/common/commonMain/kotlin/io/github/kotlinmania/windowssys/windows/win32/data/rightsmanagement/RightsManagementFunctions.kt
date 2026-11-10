package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult

public expect fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: COpaquePointer?, ctemplates: UInt, pwsztemplateids: COpaquePointer?, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult

public expect fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult

public expect fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: COpaquePointer?, pvcontext: COpaquePointer?, hparentwnd: Hwnd): Hresult

public expect fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult

public expect fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult

public expect fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: COpaquePointer?, wszattestedblob: Pwstr): Hresult

public expect fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult

public expect fun dRMClearAllRights(hissuancelicense: UInt): Hresult

public expect fun dRMCloseEnvironmentHandle(henv: UInt): Hresult

public expect fun dRMCloseHandle(handle: UInt): Hresult

public expect fun dRMClosePubHandle(hpub: UInt): Hresult

public expect fun dRMCloseQueryHandle(hquery: UInt): Hresult

public expect fun dRMCloseSession(hsession: UInt): Hresult

public expect fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: COpaquePointer?, pcchain: COpaquePointer?, wszchain: Pwstr): Hresult

public expect fun dRMCreateBoundLicense(henv: UInt, pparams: COpaquePointer?, wszlicensechain: Pcwstr, phboundlicense: COpaquePointer?, pherrorlog: COpaquePointer?): Hresult

public expect fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: COpaquePointer?): Hresult

public expect fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: COpaquePointer?): Hresult

public expect fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: COpaquePointer?): Hresult

public expect fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: COpaquePointer?, wszcredentials: Pcwstr, phenablingprincipal: COpaquePointer?): Hresult

public expect fun dRMCreateIssuanceLicense(psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: COpaquePointer?): Hresult

public expect fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: COpaquePointer?): Hresult

public expect fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?, cextendedinfo: UInt, pwszextendedinfoname: COpaquePointer?, pwszextendedinfovalue: COpaquePointer?, phright: COpaquePointer?): Hresult

public expect fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: COpaquePointer?): Hresult

public expect fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: COpaquePointer?, pbdecodeddata: COpaquePointer?): Hresult

public expect fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: COpaquePointer?, wszcert: Pwstr): Hresult

public expect fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult

public expect fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult

public expect fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult

public expect fun dRMDuplicateHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult

public expect fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: COpaquePointer?): Hresult

public expect fun dRMDuplicateSession(hsessionin: UInt, phsessionout: COpaquePointer?): Hresult

public expect fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: COpaquePointer?, puencodedstringlen: COpaquePointer?, wszencodedstring: Pwstr): Hresult

public expect fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult

public expect fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: COpaquePointer?, pucertificatedatalen: COpaquePointer?, wszcertificatedata: Pwstr): Hresult

public expect fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: COpaquePointer?, wszname: Pwstr, puvaluelength: COpaquePointer?, wszvalue: Pwstr): Hresult

public expect fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult

public expect fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: COpaquePointer?): Hresult

public expect fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: COpaquePointer?): Hresult

public expect fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult

public expect fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: COpaquePointer?): Hresult

public expect fun dRMGetClientVersion(pdrmclientversioninfo: COpaquePointer?): Hresult

public expect fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult

public expect fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult

public expect fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: COpaquePointer?): Hresult

public expect fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, uflags: UInt, pudistributionpointnamelength: COpaquePointer?, wszdistributionpointname: Pwstr, pudistributionpointurllength: COpaquePointer?, wszdistributionpointurl: Pwstr, phowner: COpaquePointer?, pfofficial: COpaquePointer?): Hresult

public expect fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: COpaquePointer?, wszissuancelicensetemplate: Pwstr): Hresult

public expect fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: COpaquePointer?, wszcontentid: Pwstr, pucontentidtypelength: COpaquePointer?, wszcontentidtype: Pwstr, puskuidlength: COpaquePointer?, wszskuid: Pwstr, puskuidtypelength: COpaquePointer?, wszskuidtype: Pwstr, pucontenttypelength: COpaquePointer?, wszcontenttype: Pwstr, pucontentnamelength: COpaquePointer?, wszcontentname: Pwstr): Hresult

public expect fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pudescriptionlength: COpaquePointer?, wszdescription: Pwstr): Hresult

public expect fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: COpaquePointer?, wszownerlicense: Pwstr): Hresult

public expect fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: COpaquePointer?): Hresult

public expect fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: COpaquePointer?, wszid: Pwstr, puidtypelength: COpaquePointer?, wszidtype: Pwstr, puurllength: COpaquePointer?, wszrl: Pwstr, pstfrequency: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr): Hresult

public expect fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: COpaquePointer?, wszextendedinfoname: Pwstr, puextendedinfovaluelength: COpaquePointer?, wszextendedinfovalue: Pwstr): Hresult

public expect fun dRMGetRightInfo(hright: UInt, purightnamelength: COpaquePointer?, wszrightname: Pwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?): Hresult

public expect fun dRMGetSecurityProvider(uflags: UInt, putypelen: COpaquePointer?, wsztype: Pwstr, pupathlen: COpaquePointer?, wszpath: Pwstr): Hresult

public expect fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: COpaquePointer?, wszserviceurl: Pwstr): Hresult

public expect fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult

public expect fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: COpaquePointer?, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: COpaquePointer?): Hresult

public expect fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: COpaquePointer?): Hresult

public expect fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult

public expect fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: COpaquePointer?): Hresult

public expect fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: COpaquePointer?): Hresult

public expect fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult

public expect fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: COpaquePointer?, pfexclusion: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, puminversionlength: COpaquePointer?, wszminversion: Pwstr, pumaxversionlength: COpaquePointer?, wszmaxversion: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr, pudigestalgorithmlength: COpaquePointer?, wszdigestalgorithm: Pwstr, pcbdigest: COpaquePointer?, pbdigest: COpaquePointer?): Hresult

public expect fun dRMGetUserInfo(huser: UInt, puusernamelength: COpaquePointer?, wszusername: Pwstr, puuseridlength: COpaquePointer?, wszuserid: Pwstr, puuseridtypelength: COpaquePointer?, wszuseridtype: Pwstr): Hresult

public expect fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: COpaquePointer?): Hresult

public expect fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: COpaquePointer?): Hresult

public expect fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: COpaquePointer?, phdefaultlibrary: COpaquePointer?): Hresult

public expect fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: COpaquePointer?): Hresult

public expect fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: COpaquePointer?): Hresult

public expect fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: COpaquePointer?): Hresult

public expect fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: COpaquePointer?): Hresult

public expect fun dRMRegisterContent(fregister: Bool): Hresult

public expect fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult

public expect fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult

public expect fun dRMRepair(): Hresult

public expect fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult

public expect fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: COpaquePointer?, dwlen: UInt): Hresult

public expect fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult

public expect fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult

public expect fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult

public expect fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: COpaquePointer?, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult

public expect fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: COpaquePointer?, cbdigest: UInt): Hresult

public expect fun dRMVerify(wszdata: Pcwstr, pcattesteddata: COpaquePointer?, wszattesteddata: Pwstr, petype: COpaquePointer?, pcprincipal: COpaquePointer?, wszprincipal: Pwstr, pcmanifest: COpaquePointer?, wszmanifest: Pwstr): Hresult
