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

public expect fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult

public expect fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr<CVoid>, ctemplates: UInt, pwsztemplateids: ConstPtr<Pcwstr>, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult

public expect fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult

public expect fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr<DrmActservInfo>, pvcontext: MutPtr<CVoid>, hparentwnd: Hwnd): Hresult

public expect fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult

public expect fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult

public expect fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr<UInt>, wszattestedblob: Pwstr): Hresult

public expect fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult

public expect fun dRMClearAllRights(hissuancelicense: UInt): Hresult

public expect fun dRMCloseEnvironmentHandle(henv: UInt): Hresult

public expect fun dRMCloseHandle(handle: UInt): Hresult

public expect fun dRMClosePubHandle(hpub: UInt): Hresult

public expect fun dRMCloseQueryHandle(hquery: UInt): Hresult

public expect fun dRMCloseSession(hsession: UInt): Hresult

public expect fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr<Pcwstr>, pcchain: MutPtr<UInt>, wszchain: Pwstr): Hresult

public expect fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr<Drmboundlicenseparams>, wszlicensechain: Pcwstr, phboundlicense: MutPtr<UInt>, pherrorlog: MutPtr<UInt>): Hresult

public expect fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr<UInt>): Hresult

public expect fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr<UInt>): Hresult

public expect fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr<UInt>): Hresult

public expect fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr<Drmid>, wszcredentials: Pcwstr, phenablingprincipal: MutPtr<UInt>): Hresult

public expect fun dRMCreateIssuanceLicense(psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr<UInt>): Hresult

public expect fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr<UInt>): Hresult

public expect fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr<Pcwstr>, pwszextendedinfovalue: ConstPtr<Pcwstr>, phright: MutPtr<UInt>): Hresult

public expect fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr<UInt>): Hresult

public expect fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr<UInt>, pbdecodeddata: MutPtr<UByte>): Hresult

public expect fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr<UInt>, wszcert: Pwstr): Hresult

public expect fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult

public expect fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult

public expect fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult

public expect fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult

public expect fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr<UInt>): Hresult

public expect fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr<UInt>): Hresult

public expect fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr<UByte>, puencodedstringlen: MutPtr<UInt>, wszencodedstring: Pwstr): Hresult

public expect fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult

public expect fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr<Bool>, pucertificatedatalen: MutPtr<UInt>, wszcertificatedata: Pwstr): Hresult

public expect fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr<UInt>, wszname: Pwstr, puvaluelength: MutPtr<UInt>, wszvalue: Pwstr): Hresult

public expect fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult

public expect fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr<UInt>): Hresult

public expect fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr<UInt>): Hresult

public expect fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult

public expect fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr<UInt>): Hresult

public expect fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr<DrmClientVersionInfo>): Hresult

public expect fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult

public expect fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult

public expect fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr<UInt>): Hresult

public expect fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, uflags: UInt, pudistributionpointnamelength: MutPtr<UInt>, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr<UInt>, wszdistributionpointurl: Pwstr, phowner: MutPtr<UInt>, pfofficial: MutPtr<Bool>): Hresult

public expect fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr<UInt>, wszissuancelicensetemplate: Pwstr): Hresult

public expect fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr<UInt>, wszcontentid: Pwstr, pucontentidtypelength: MutPtr<UInt>, wszcontentidtype: Pwstr, puskuidlength: MutPtr<UInt>, wszskuid: Pwstr, puskuidtypelength: MutPtr<UInt>, wszskuidtype: Pwstr, pucontenttypelength: MutPtr<UInt>, wszcontenttype: Pwstr, pucontentnamelength: MutPtr<UInt>, wszcontentname: Pwstr): Hresult

public expect fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr<UInt>, punamelength: MutPtr<UInt>, wszname: Pwstr, pudescriptionlength: MutPtr<UInt>, wszdescription: Pwstr): Hresult

public expect fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr<UInt>, wszownerlicense: Pwstr): Hresult

public expect fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr<Farproc>): Hresult

public expect fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr<UInt>, wszid: Pwstr, puidtypelength: MutPtr<UInt>, wszidtype: Pwstr, puurllength: MutPtr<UInt>, wszrl: Pwstr, pstfrequency: MutPtr<Systemtime>, punamelength: MutPtr<UInt>, wszname: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr): Hresult

public expect fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr<UInt>, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr<UInt>, wszextendedinfovalue: Pwstr): Hresult

public expect fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr<UInt>, wszrightname: Pwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>): Hresult

public expect fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr<UInt>, wsztype: Pwstr, pupathlen: MutPtr<UInt>, wszpath: Pwstr): Hresult

public expect fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr<UInt>, wszserviceurl: Pwstr): Hresult

public expect fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult

public expect fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr<CVoid>, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr<CVoid>): Hresult

public expect fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr<Systemtime>): Hresult

public expect fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult

public expect fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr<UInt>): Hresult

public expect fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr<UInt>): Hresult

public expect fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult

public expect fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr<DrmUsagepolicyType>, pfexclusion: MutPtr<Bool>, punamelength: MutPtr<UInt>, wszname: Pwstr, puminversionlength: MutPtr<UInt>, wszminversion: Pwstr, pumaxversionlength: MutPtr<UInt>, wszmaxversion: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr<UInt>, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr<UInt>, pbdigest: MutPtr<UByte>): Hresult

public expect fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr<UInt>, wszusername: Pwstr, puuseridlength: MutPtr<UInt>, wszuserid: Pwstr, puuseridtypelength: MutPtr<UInt>, wszuseridtype: Pwstr): Hresult

public expect fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr<UInt>): Hresult

public expect fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr<UInt>): Hresult

public expect fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr<UInt>, phdefaultlibrary: MutPtr<UInt>): Hresult

public expect fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr<DrmActservInfo>): Hresult

public expect fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr<Bool>): Hresult

public expect fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr<UInt>): Hresult

public expect fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr<UInt>): Hresult

public expect fun dRMRegisterContent(fregister: Bool): Hresult

public expect fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult

public expect fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult

public expect fun dRMRepair(): Hresult

public expect fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult

public expect fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr<CVoid>, dwlen: UInt): Hresult

public expect fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult

public expect fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult

public expect fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult

public expect fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr<Systemtime>, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult

public expect fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr<UByte>, cbdigest: UInt): Hresult

public expect fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr<UInt>, wszattesteddata: Pwstr, petype: MutPtr<Drmattesttype>, pcprincipal: MutPtr<UInt>, wszprincipal: Pwstr, pcmanifest: MutPtr<UInt>, wszmanifest: Pwstr): Hresult
