@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories")

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr<CVoid>, ctemplates: UInt, pwsztemplateids: ConstPtr<Pcwstr>, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate")

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense")

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr<DrmActservInfo>, pvcontext: MutPtr<CVoid>, hparentwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMActivate")

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMAddLicense")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense: Int, hright: Int, huser: Int): Int

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt())

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr<UInt>, wszattestedblob: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMAttest")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv: Int, clevel: Int): Int

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv.toInt(), clevel.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMClearAllRights")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense: Int): Int

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv: Int): Int

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMCloseHandle")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle: Int): Int

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub: Int): Int

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery: Int): Int

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMCloseSession")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession: Int): Int

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession.toInt())

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr<Pcwstr>, pcchain: MutPtr<UInt>, wszchain: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain")

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr<Drmboundlicenseparams>, wszlicensechain: Pcwstr, phboundlicense: MutPtr<UInt>, pherrorlog: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense")

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession")

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor")

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor")

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr<Drmid>, wszcredentials: Pcwstr, phenablingprincipal: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal")

public actual fun dRMCreateIssuanceLicense(psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense")

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession")

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr<Pcwstr>, pwszextendedinfovalue: ConstPtr<Pcwstr>, phright: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateRight")

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMCreateUser")

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr<UInt>, pbdecodeddata: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDecode")

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr<UInt>, wszcert: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain")

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDecrypt")

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense")

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle")

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle")

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle")

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession")

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr<UByte>, puencodedstringlen: MutPtr<UInt>, wszencodedstring: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMEncode")

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr<UByte>, pcnumoutbytes: MutPtr<UInt>, pboutdata: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMEncrypt")

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr<Bool>, pucertificatedatalen: MutPtr<UInt>, wszcertificatedata: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense")

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr<UInt>, wszname: Pwstr, puvaluelength: MutPtr<UInt>, wszvalue: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData")

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute")

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount")

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject")

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount")

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount")

public actual fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr<DrmClientVersionInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion")

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo")

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetInfo")

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime")

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr<Systemtime>, psttimeuntil: MutPtr<Systemtime>, uflags: UInt, pudistributionpointnamelength: MutPtr<UInt>, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr<UInt>, wszdistributionpointurl: Pwstr, phowner: MutPtr<UInt>, pfofficial: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo")

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr<UInt>, wszissuancelicensetemplate: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate")

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr<UInt>, wszcontentid: Pwstr, pucontentidtypelength: MutPtr<UInt>, wszcontentidtype: Pwstr, puskuidlength: MutPtr<UInt>, wszskuid: Pwstr, puskuidtypelength: MutPtr<UInt>, wszskuidtype: Pwstr, pucontenttypelength: MutPtr<UInt>, wszcontenttype: Pwstr, pucontentnamelength: MutPtr<UInt>, wszcontentname: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetMetaData")

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr<UInt>, punamelength: MutPtr<UInt>, wszname: Pwstr, pudescriptionlength: MutPtr<UInt>, wszdescription: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription")

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr<UInt>, wszownerlicense: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense")

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr<Farproc>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress")

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr<UInt>, wszid: Pwstr, puidtypelength: MutPtr<UInt>, wszidtype: Pwstr, puurllength: MutPtr<UInt>, wszrl: Pwstr, pstfrequency: MutPtr<Systemtime>, punamelength: MutPtr<UInt>, wszname: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint")

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr<UInt>, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr<UInt>, wszextendedinfovalue: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo")

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr<UInt>, wszrightname: Pwstr, pstfrom: MutPtr<Systemtime>, pstuntil: MutPtr<Systemtime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo")

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr<UInt>, wsztype: Pwstr, pupathlen: MutPtr<UInt>, wszpath: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider")

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr<UInt>, wszserviceurl: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation")

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense")

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr<UByte>, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr<CVoid>, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx")

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr<Systemtime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetTime")

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr<Drmencodingtype>, pcbuffer: MutPtr<UInt>, pbbuffer: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute")

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount")

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject")

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount")

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr<DrmUsagepolicyType>, pfexclusion: MutPtr<Bool>, punamelength: MutPtr<UInt>, wszname: Pwstr, puminversionlength: MutPtr<UInt>, wszminversion: Pwstr, pumaxversionlength: MutPtr<UInt>, wszmaxversion: Pwstr, pupublickeylength: MutPtr<UInt>, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr<UInt>, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr<UInt>, pbdigest: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy")

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr<UInt>, wszusername: Pwstr, puuseridlength: MutPtr<UInt>, wszuserid: Pwstr, puuseridtypelength: MutPtr<UInt>, wszuseridtype: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo")

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUserRights")

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMGetUsers")

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr<UInt>, phdefaultlibrary: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment")

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr<DrmActservInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMIsActivated")

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected")

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary")

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMRegisterContent")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister: Int): Int

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister)

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow")

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMRepair")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMRepair(): Int

public actual fun dRMRepair(): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMRepair()

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData")

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr<CVoid>, dwlen: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime")
private external fun wasiWindowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense: Int, cdays: Int): Int

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    wasiWindowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt())

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMSetMetaData")

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription")

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr<Systemtime>, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint")

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr<UByte>, cbdigest: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy")

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr<UInt>, wszattesteddata: Pwstr, petype: MutPtr<Drmattesttype>, pcprincipal: MutPtr<UInt>, wszprincipal: Pwstr, pcmanifest: MutPtr<UInt>, wszmanifest: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DataRightsmanagementDRMVerify")
