@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32DataRightsmanagementNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMAcquireAdvisories(hlicensestorage.toInt(), (wszlicense?.value ?: 0L).toString(), (wszurl?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: COpaquePointer?, ctemplates: UInt, pwsztemplateids: COpaquePointer?, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), (pvreserved?.value ?: 0L).toString(), ctemplates.toInt(), (pwsztemplateids?.value ?: 0L).toString(), (wszurl?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMAcquireLicense(hsession.toInt(), uflags.toInt(), (wszgroupidentitycredential?.value ?: 0L).toString(), (wszrequestedrights?.value ?: 0L).toString(), (wszcustomdata?.value ?: 0L).toString(), (wszurl?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: COpaquePointer?, pvcontext: COpaquePointer?, hparentwnd: Hwnd): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), (pactservinfo?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString(), (hparentwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), (wszlicense?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: COpaquePointer?, wszattestedblob: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMAttest(henablingprincipal.toInt(), (wszdata?.value ?: 0L).toString(), etype, (pcattestedblob?.value ?: 0L).toString(), (wszattestedblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCheckSecurity(henv.toInt(), clevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMClearAllRights(hissuancelicense.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCloseEnvironmentHandle(henv.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCloseHandle(handle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMClosePubHandle(hpub.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCloseQueryHandle(hquery.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCloseSession(hsession.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: COpaquePointer?, pcchain: COpaquePointer?, wszchain: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMConstructCertificateChain(ccertificates.toInt(), (rgwszcertificates?.value ?: 0L).toString(), (pcchain?.value ?: 0L).toString(), (wszchain?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: COpaquePointer?, wszlicensechain: Pcwstr, phboundlicense: COpaquePointer?, pherrorlog: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateBoundLicense(henv.toInt(), (pparams?.value ?: 0L).toString(), (wszlicensechain?.value ?: 0L).toString(), (phboundlicense?.value ?: 0L).toString(), (pherrorlog?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateClientSession(0L.toString(), ucallbackversion.toInt(), (wszgroupidprovidertype?.value ?: 0L).toString(), (wszgroupid?.value ?: 0L).toString(), (phclient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), (wszright?.value ?: 0L).toString(), hauxlib.toInt(), (wszauxplug?.value ?: 0L).toString(), (phdecryptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), (wszright?.value ?: 0L).toString(), hauxlib.toInt(), (wszauxplug?.value ?: 0L).toString(), (phencryptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: COpaquePointer?, wszcredentials: Pcwstr, phenablingprincipal: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), (wszobject?.value ?: 0L).toString(), (pidprincipal?.value ?: 0L).toString(), (wszcredentials?.value ?: 0L).toString(), (phenablingprincipal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateIssuanceLicense(psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateIssuanceLicense((psttimefrom?.value ?: 0L).toString(), (psttimeuntil?.value ?: 0L).toString(), (wszreferralinfoname?.value ?: 0L).toString(), (wszreferralinfourl?.value ?: 0L).toString(), howner.toInt(), (wszissuancelicense?.value ?: 0L).toString(), hboundlicense.toInt(), (phissuancelicense?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), (wszissuancelicense?.value ?: 0L).toString(), (phlicensestorage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?, cextendedinfo: UInt, pwszextendedinfoname: COpaquePointer?, pwszextendedinfovalue: COpaquePointer?, phright: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateRight((wszrightname?.value ?: 0L).toString(), (pstfrom?.value ?: 0L).toString(), (pstuntil?.value ?: 0L).toString(), cextendedinfo.toInt(), (pwszextendedinfoname?.value ?: 0L).toString(), (pwszextendedinfovalue?.value ?: 0L).toString(), (phright?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMCreateUser((wszusername?.value ?: 0L).toString(), (wszuserid?.value ?: 0L).toString(), (wszuseridtype?.value ?: 0L).toString(), (phuser?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: COpaquePointer?, pbdecodeddata: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDecode((wszalgid?.value ?: 0L).toString(), (wszencodedstring?.value ?: 0L).toString(), (pudecodeddatalen?.value ?: 0L).toString(), (pbdecodeddata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: COpaquePointer?, wszcert: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDeconstructCertificateChain((wszchain?.value ?: 0L).toString(), iwhich.toInt(), (pccert?.value ?: 0L).toString(), (wszcert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), (pbindata?.value ?: 0L).toString(), (pcnumoutbytes?.value ?: 0L).toString(), (pboutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDeleteLicense(hsession.toInt(), (wszlicenseid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateEnvironmentHandle(htocopy.toInt(), (phcopy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateHandle(htocopy.toInt(), (phcopy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDuplicatePubHandle(hpubin.toInt(), (phpubout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMDuplicateSession(hsessionin.toInt(), (phsessionout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: COpaquePointer?, puencodedstringlen: COpaquePointer?, wszencodedstring: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMEncode((wszalgid?.value ?: 0L).toString(), udatalen.toInt(), (pbdecodeddata?.value ?: 0L).toString(), (puencodedstringlen?.value ?: 0L).toString(), (wszencodedstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: COpaquePointer?, pcnumoutbytes: COpaquePointer?, pboutdata: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), (pbindata?.value ?: 0L).toString(), (pcnumoutbytes?.value ?: 0L).toString(), (pboutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: COpaquePointer?, pucertificatedatalen: COpaquePointer?, wszcertificatedata: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), (pfsharedflag?.value ?: 0L).toString(), (pucertificatedatalen?.value ?: 0L).toString(), (wszcertificatedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: COpaquePointer?, wszname: Pwstr, puvaluelength: COpaquePointer?, wszvalue: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), (punamelength?.value ?: 0L).toString(), (wszname?.value ?: 0L).toString(), (puvaluelength?.value ?: 0L).toString(), (wszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttribute(hqueryroot.toInt(), (wszattribute?.value ?: 0L).toString(), iwhich.toInt(), (peencoding?.value ?: 0L).toString(), (pcbuffer?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), (wszattribute?.value ?: 0L).toString(), (pcattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObject(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L).toString(), iwhich.toInt(), (phsubobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetBoundLicenseObjectCount(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L).toString(), (pcsubobjects?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetCertificateChainCount((wszchain?.value ?: 0L).toString(), (pccertcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetClientVersion(pdrmclientversioninfo: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetClientVersion((pdrmclientversioninfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetEnvironmentInfo(handle.toInt(), (wszattribute?.value ?: 0L).toString(), (peencoding?.value ?: 0L).toString(), (pcbuffer?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetInfo(handle.toInt(), (wszattribute?.value ?: 0L).toString(), (peencoding?.value ?: 0L).toString(), (pcbuffer?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetIntervalTime(hissuancelicense.toInt(), (pcdays?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: COpaquePointer?, psttimeuntil: COpaquePointer?, uflags: UInt, pudistributionpointnamelength: COpaquePointer?, wszdistributionpointname: Pwstr, pudistributionpointurllength: COpaquePointer?, wszdistributionpointurl: Pwstr, phowner: COpaquePointer?, pfofficial: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), (psttimefrom?.value ?: 0L).toString(), (psttimeuntil?.value ?: 0L).toString(), uflags.toInt(), (pudistributionpointnamelength?.value ?: 0L).toString(), (wszdistributionpointname?.value ?: 0L).toString(), (pudistributionpointurllength?.value ?: 0L).toString(), (wszdistributionpointurl?.value ?: 0L).toString(), (phowner?.value ?: 0L).toString(), (pfofficial?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: COpaquePointer?, wszissuancelicensetemplate: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), (puissuancelicensetemplatelength?.value ?: 0L).toString(), (wszissuancelicensetemplate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: COpaquePointer?, wszcontentid: Pwstr, pucontentidtypelength: COpaquePointer?, wszcontentidtype: Pwstr, puskuidlength: COpaquePointer?, wszskuid: Pwstr, puskuidtypelength: COpaquePointer?, wszskuidtype: Pwstr, pucontenttypelength: COpaquePointer?, wszcontenttype: Pwstr, pucontentnamelength: COpaquePointer?, wszcontentname: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetMetaData(hissuancelicense.toInt(), (pucontentidlength?.value ?: 0L).toString(), (wszcontentid?.value ?: 0L).toString(), (pucontentidtypelength?.value ?: 0L).toString(), (wszcontentidtype?.value ?: 0L).toString(), (puskuidlength?.value ?: 0L).toString(), (wszskuid?.value ?: 0L).toString(), (puskuidtypelength?.value ?: 0L).toString(), (wszskuidtype?.value ?: 0L).toString(), (pucontenttypelength?.value ?: 0L).toString(), (wszcontenttype?.value ?: 0L).toString(), (pucontentnamelength?.value ?: 0L).toString(), (wszcontentname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pudescriptionlength: COpaquePointer?, wszdescription: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), (pulcid?.value ?: 0L).toString(), (punamelength?.value ?: 0L).toString(), (wszname?.value ?: 0L).toString(), (pudescriptionlength?.value ?: 0L).toString(), (wszdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: COpaquePointer?, wszownerlicense: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetOwnerLicense(hissuancelicense.toInt(), (puownerlicenselength?.value ?: 0L).toString(), (wszownerlicense?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetProcAddress(hlibrary.toInt(), (wszprocname?.value ?: 0L).toString(), (ppfnprocaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: COpaquePointer?, wszid: Pwstr, puidtypelength: COpaquePointer?, wszidtype: Pwstr, puurllength: COpaquePointer?, wszrl: Pwstr, pstfrequency: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetRevocationPoint(hissuancelicense.toInt(), (puidlength?.value ?: 0L).toString(), (wszid?.value ?: 0L).toString(), (puidtypelength?.value ?: 0L).toString(), (wszidtype?.value ?: 0L).toString(), (puurllength?.value ?: 0L).toString(), (wszrl?.value ?: 0L).toString(), (pstfrequency?.value ?: 0L).toString(), (punamelength?.value ?: 0L).toString(), (wszname?.value ?: 0L).toString(), (pupublickeylength?.value ?: 0L).toString(), (wszpublickey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: COpaquePointer?, wszextendedinfoname: Pwstr, puextendedinfovaluelength: COpaquePointer?, wszextendedinfovalue: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), (puextendedinfonamelength?.value ?: 0L).toString(), (wszextendedinfoname?.value ?: 0L).toString(), (puextendedinfovaluelength?.value ?: 0L).toString(), (wszextendedinfovalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: COpaquePointer?, wszrightname: Pwstr, pstfrom: COpaquePointer?, pstuntil: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetRightInfo(hright.toInt(), (purightnamelength?.value ?: 0L).toString(), (wszrightname?.value ?: 0L).toString(), (pstfrom?.value ?: 0L).toString(), (pstuntil?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: COpaquePointer?, wsztype: Pwstr, pupathlen: COpaquePointer?, wszpath: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetSecurityProvider(uflags.toInt(), (putypelen?.value ?: 0L).toString(), (wsztype?.value ?: 0L).toString(), (pupathlen?.value ?: 0L).toString(), (wszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: COpaquePointer?, wszserviceurl: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), (wszissuancelicense?.value ?: 0L).toString(), (puserviceurllength?.value ?: 0L).toString(), (wszserviceurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), (pbsymkey?.value ?: 0L).toString(), cbsymkey.toInt(), (wszsymkeytype?.value ?: 0L).toString(), (wszclientlicensorcertificate?.value ?: 0L).toString(), 0L.toString(), (wszurl?.value ?: 0L).toString(), (pvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: COpaquePointer?, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: COpaquePointer?, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), (pbsymkey?.value ?: 0L).toString(), cbsymkey.toInt(), (wszsymkeytype?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), henablingprincipal.toInt(), hboundlicenseclc.toInt(), 0L.toString(), (pvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetTime(henv.toInt(), etimeridtype, (potimeobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: COpaquePointer?, pcbuffer: COpaquePointer?, pbbuffer: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttribute(hqueryroot.toInt(), (wszattributetype?.value ?: 0L).toString(), iwhich.toInt(), (peencoding?.value ?: 0L).toString(), (pcbuffer?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), (wszattributetype?.value ?: 0L).toString(), (pcattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObject(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L).toString(), iindex.toInt(), (phsubquery?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), (wszsubobjecttype?.value ?: 0L).toString(), (pcsubobjects?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: COpaquePointer?, pfexclusion: COpaquePointer?, punamelength: COpaquePointer?, wszname: Pwstr, puminversionlength: COpaquePointer?, wszminversion: Pwstr, pumaxversionlength: COpaquePointer?, wszmaxversion: Pwstr, pupublickeylength: COpaquePointer?, wszpublickey: Pwstr, pudigestalgorithmlength: COpaquePointer?, wszdigestalgorithm: Pwstr, pcbdigest: COpaquePointer?, pbdigest: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), (peusagepolicytype?.value ?: 0L).toString(), (pfexclusion?.value ?: 0L).toString(), (punamelength?.value ?: 0L).toString(), (wszname?.value ?: 0L).toString(), (puminversionlength?.value ?: 0L).toString(), (wszminversion?.value ?: 0L).toString(), (pumaxversionlength?.value ?: 0L).toString(), (wszmaxversion?.value ?: 0L).toString(), (pupublickeylength?.value ?: 0L).toString(), (wszpublickey?.value ?: 0L).toString(), (pudigestalgorithmlength?.value ?: 0L).toString(), (wszdigestalgorithm?.value ?: 0L).toString(), (pcbdigest?.value ?: 0L).toString(), (pbdigest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: COpaquePointer?, wszusername: Pwstr, puuseridlength: COpaquePointer?, wszuserid: Pwstr, puuseridtypelength: COpaquePointer?, wszuseridtype: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUserInfo(huser.toInt(), (puusernamelength?.value ?: 0L).toString(), (wszusername?.value ?: 0L).toString(), (puuseridlength?.value ?: 0L).toString(), (wszuserid?.value ?: 0L).toString(), (puuseridtypelength?.value ?: 0L).toString(), (wszuseridtype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), (phright?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), (phuser?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: COpaquePointer?, phdefaultlibrary: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMInitEnvironment(esecurityprovidertype, especification, (wszsecurityprovider?.value ?: 0L).toString(), (wszmanifestcredentials?.value ?: 0L).toString(), (wszmachinecredentials?.value ?: 0L).toString(), (phenv?.value ?: 0L).toString(), (phdefaultlibrary?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMIsActivated(hclient.toInt(), uflags.toInt(), (pactservinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMIsWindowProtected((hwnd?.value ?: 0L).toString(), (pfprotected?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMLoadLibrary(henv.toInt(), especification, (wszlibraryprovider?.value ?: 0L).toString(), (wszcredentials?.value ?: 0L).toString(), (phlibrary?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: COpaquePointer?): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMParseUnboundLicense((wszcertificate?.value ?: 0L).toString(), (phqueryroot?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMRegisterContent(fregister) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMRegisterProtectedWindow(henv.toInt(), (hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMRegisterRevocationList(henv.toInt(), (wszrevocationlist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRepair(): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMRepair() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, (wszname?.value ?: 0L).toString(), (wszvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: COpaquePointer?, dwlen: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetGlobalOptions(eglobaloptions, (pvdata?.value ?: 0L).toString(), dwlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetMetaData(hissuancelicense.toInt(), (wszcontentid?.value ?: 0L).toString(), (wszcontentidtype?.value ?: 0L).toString(), (wszskuid?.value ?: 0L).toString(), (wszskuidtype?.value ?: 0L).toString(), (wszcontenttype?.value ?: 0L).toString(), (wszcontentname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), (wszname?.value ?: 0L).toString(), (wszdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: COpaquePointer?, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, (wszid?.value ?: 0L).toString(), (wszidtype?.value ?: 0L).toString(), (wszurl?.value ?: 0L).toString(), (pstfrequency?.value ?: 0L).toString(), (wszname?.value ?: 0L).toString(), (wszpublickey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: COpaquePointer?, cbdigest: UInt): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, (wszname?.value ?: 0L).toString(), (wszminversion?.value ?: 0L).toString(), (wszmaxversion?.value ?: 0L).toString(), (wszpublickey?.value ?: 0L).toString(), (wszdigestalgorithm?.value ?: 0L).toString(), (pbdigest?.value ?: 0L).toString(), cbdigest.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: COpaquePointer?, wszattesteddata: Pwstr, petype: COpaquePointer?, pcprincipal: COpaquePointer?, wszprincipal: Pwstr, pcmanifest: COpaquePointer?, wszmanifest: Pwstr): Hresult =
    if (_windowsWin32DataRightsmanagementNapiAddon != null) (_windowsWin32DataRightsmanagementNapiAddon.windowssys_windows_win32_data_rightsmanagement_dRMVerify((wszdata?.value ?: 0L).toString(), (pcattesteddata?.value ?: 0L).toString(), (wszattesteddata?.value ?: 0L).toString(), (petype?.value ?: 0L).toString(), (pcprincipal?.value ?: 0L).toString(), (wszprincipal?.value ?: 0L).toString(), (pcmanifest?.value ?: 0L).toString(), (wszmanifest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
