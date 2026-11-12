package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult

public expect fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr, ctemplates: UInt, pwsztemplateids: ConstPtr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult

public expect fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult

public expect fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr, pvcontext: MutPtr, hparentwnd: Hwnd): Hresult

public expect fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult

public expect fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult

public expect fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr, wszattestedblob: Pwstr): Hresult

public expect fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult

public expect fun dRMClearAllRights(hissuancelicense: UInt): Hresult

public expect fun dRMCloseEnvironmentHandle(henv: UInt): Hresult

public expect fun dRMCloseHandle(handle: UInt): Hresult

public expect fun dRMClosePubHandle(hpub: UInt): Hresult

public expect fun dRMCloseQueryHandle(hquery: UInt): Hresult

public expect fun dRMCloseSession(hsession: UInt): Hresult

public expect fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr, pcchain: MutPtr, wszchain: Pwstr): Hresult

public expect fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr, wszlicensechain: Pcwstr, phboundlicense: MutPtr, pherrorlog: MutPtr): Hresult

public expect fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr): Hresult

public expect fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr): Hresult

public expect fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr): Hresult

public expect fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr, wszcredentials: Pcwstr, phenablingprincipal: MutPtr): Hresult

public expect fun dRMCreateIssuanceLicense(psttimefrom: MutPtr, psttimeuntil: MutPtr, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr): Hresult

public expect fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr): Hresult

public expect fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr, pstuntil: MutPtr, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr, pwszextendedinfovalue: ConstPtr, phright: MutPtr): Hresult

public expect fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr): Hresult

public expect fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr, pbdecodeddata: MutPtr): Hresult

public expect fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr, wszcert: Pwstr): Hresult

public expect fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr, pcnumoutbytes: MutPtr, pboutdata: MutPtr): Hresult

public expect fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult

public expect fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr): Hresult

public expect fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr): Hresult

public expect fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr): Hresult

public expect fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr): Hresult

public expect fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr, puencodedstringlen: MutPtr, wszencodedstring: Pwstr): Hresult

public expect fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr, pcnumoutbytes: MutPtr, pboutdata: MutPtr): Hresult

public expect fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr, pucertificatedatalen: MutPtr, wszcertificatedata: Pwstr): Hresult

public expect fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr, wszname: Pwstr, puvaluelength: MutPtr, wszvalue: Pwstr): Hresult

public expect fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult

public expect fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr): Hresult

public expect fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr): Hresult

public expect fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr): Hresult

public expect fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr): Hresult

public expect fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr): Hresult

public expect fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult

public expect fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult

public expect fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr): Hresult

public expect fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr, psttimeuntil: MutPtr, uflags: UInt, pudistributionpointnamelength: MutPtr, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr, wszdistributionpointurl: Pwstr, phowner: MutPtr, pfofficial: MutPtr): Hresult

public expect fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr, wszissuancelicensetemplate: Pwstr): Hresult

public expect fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr, wszcontentid: Pwstr, pucontentidtypelength: MutPtr, wszcontentidtype: Pwstr, puskuidlength: MutPtr, wszskuid: Pwstr, puskuidtypelength: MutPtr, wszskuidtype: Pwstr, pucontenttypelength: MutPtr, wszcontenttype: Pwstr, pucontentnamelength: MutPtr, wszcontentname: Pwstr): Hresult

public expect fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr, punamelength: MutPtr, wszname: Pwstr, pudescriptionlength: MutPtr, wszdescription: Pwstr): Hresult

public expect fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr, wszownerlicense: Pwstr): Hresult

public expect fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr): Hresult

public expect fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr, wszid: Pwstr, puidtypelength: MutPtr, wszidtype: Pwstr, puurllength: MutPtr, wszrl: Pwstr, pstfrequency: MutPtr, punamelength: MutPtr, wszname: Pwstr, pupublickeylength: MutPtr, wszpublickey: Pwstr): Hresult

public expect fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr, wszextendedinfovalue: Pwstr): Hresult

public expect fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr, wszrightname: Pwstr, pstfrom: MutPtr, pstuntil: MutPtr): Hresult

public expect fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr, wsztype: Pwstr, pupathlen: MutPtr, wszpath: Pwstr): Hresult

public expect fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr, wszserviceurl: Pwstr): Hresult

public expect fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr): Hresult

public expect fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr): Hresult

public expect fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr): Hresult

public expect fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult

public expect fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr): Hresult

public expect fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr): Hresult

public expect fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr): Hresult

public expect fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr, pfexclusion: MutPtr, punamelength: MutPtr, wszname: Pwstr, puminversionlength: MutPtr, wszminversion: Pwstr, pumaxversionlength: MutPtr, wszmaxversion: Pwstr, pupublickeylength: MutPtr, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr, pbdigest: MutPtr): Hresult

public expect fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr, wszusername: Pwstr, puuseridlength: MutPtr, wszuserid: Pwstr, puuseridtypelength: MutPtr, wszuseridtype: Pwstr): Hresult

public expect fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr): Hresult

public expect fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr): Hresult

public expect fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr, phdefaultlibrary: MutPtr): Hresult

public expect fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr): Hresult

public expect fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr): Hresult

public expect fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr): Hresult

public expect fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr): Hresult

public expect fun dRMRegisterContent(fregister: Bool): Hresult

public expect fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult

public expect fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult

public expect fun dRMRepair(): Hresult

public expect fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult

public expect fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr, dwlen: UInt): Hresult

public expect fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult

public expect fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult

public expect fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult

public expect fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult

public expect fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr, cbdigest: UInt): Hresult

public expect fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr, wszattesteddata: Pwstr, petype: MutPtr, pcprincipal: MutPtr, wszprincipal: Pwstr, pcmanifest: MutPtr, wszmanifest: Pwstr): Hresult
