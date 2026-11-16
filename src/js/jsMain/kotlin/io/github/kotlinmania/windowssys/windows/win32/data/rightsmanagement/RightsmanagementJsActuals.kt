@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32DataRightsmanagementNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(hlicensestorage.toInt(), wszlicense.rawAddress.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr, ctemplates: UInt, pwsztemplateids: ConstPtr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), pvreserved.rawAddress.toString(), ctemplates.toInt(), pwsztemplateids.rawAddress.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(hsession.toInt(), uflags.toInt(), wszgroupidentitycredential.rawAddress.toString(), wszrequestedrights.rawAddress.toString(), wszcustomdata.rawAddress.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr, pvcontext: MutPtr, hparentwnd: Hwnd): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), pactservinfo.rawAddress.toString(), pvcontext.rawAddress.toString(), hparentwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), wszlicense.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr, wszattestedblob: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMAttest(henablingprincipal.toInt(), wszdata.rawAddress.toString(), etype, pcattestedblob.rawAddress.toString(), wszattestedblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv.toInt(), clevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr, pcchain: MutPtr, wszchain: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(ccertificates.toInt(), rgwszcertificates.rawAddress.toString(), pcchain.rawAddress.toString(), wszchain.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr, wszlicensechain: Pcwstr, phboundlicense: MutPtr, pherrorlog: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(henv.toInt(), pparams.rawAddress.toString(), wszlicensechain.rawAddress.toString(), phboundlicense.rawAddress.toString(), pherrorlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(0L.toString(), ucallbackversion.toInt(), wszgroupidprovidertype.rawAddress.toString(), wszgroupid.rawAddress.toString(), phclient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), wszright.rawAddress.toString(), hauxlib.toInt(), wszauxplug.rawAddress.toString(), phdecryptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), wszright.rawAddress.toString(), hauxlib.toInt(), wszauxplug.rawAddress.toString(), phencryptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr, wszcredentials: Pcwstr, phenablingprincipal: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), wszobject.rawAddress.toString(), pidprincipal.rawAddress.toString(), wszcredentials.rawAddress.toString(), phenablingprincipal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateIssuanceLicense(psttimefrom: MutPtr, psttimeuntil: MutPtr, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(psttimefrom.rawAddress.toString(), psttimeuntil.rawAddress.toString(), wszreferralinfoname.rawAddress.toString(), wszreferralinfourl.rawAddress.toString(), howner.toInt(), wszissuancelicense.rawAddress.toString(), hboundlicense.toInt(), phissuancelicense.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), wszissuancelicense.rawAddress.toString(), phlicensestorage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr, pstuntil: MutPtr, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr, pwszextendedinfovalue: ConstPtr, phright: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateRight(wszrightname.rawAddress.toString(), pstfrom.rawAddress.toString(), pstuntil.rawAddress.toString(), cextendedinfo.toInt(), pwszextendedinfoname.rawAddress.toString(), pwszextendedinfovalue.rawAddress.toString(), phright.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMCreateUser(wszusername.rawAddress.toString(), wszuserid.rawAddress.toString(), wszuseridtype.rawAddress.toString(), phuser.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr, pbdecodeddata: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDecode(wszalgid.rawAddress.toString(), wszencodedstring.rawAddress.toString(), pudecodeddatalen.rawAddress.toString(), pbdecodeddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr, wszcert: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(wszchain.rawAddress.toString(), iwhich.toInt(), pccert.rawAddress.toString(), wszcert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr, pcnumoutbytes: MutPtr, pboutdata: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.rawAddress.toString(), pcnumoutbytes.rawAddress.toString(), pboutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(hsession.toInt(), wszlicenseid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(htocopy.toInt(), phcopy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(htocopy.toInt(), phcopy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(hpubin.toInt(), phpubout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(hsessionin.toInt(), phsessionout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr, puencodedstringlen: MutPtr, wszencodedstring: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMEncode(wszalgid.rawAddress.toString(), udatalen.toInt(), pbdecodeddata.rawAddress.toString(), puencodedstringlen.rawAddress.toString(), wszencodedstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr, pcnumoutbytes: MutPtr, pboutdata: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.rawAddress.toString(), pcnumoutbytes.rawAddress.toString(), pboutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr, pucertificatedatalen: MutPtr, wszcertificatedata: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), pfsharedflag.rawAddress.toString(), pucertificatedatalen.rawAddress.toString(), wszcertificatedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr, wszname: Pwstr, puvaluelength: MutPtr, wszvalue: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), puvaluelength.rawAddress.toString(), wszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(hqueryroot.toInt(), wszattribute.rawAddress.toString(), iwhich.toInt(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), wszattribute.rawAddress.toString(), pcattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), iwhich.toInt(), phsubobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), pcsubobjects.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(wszchain.rawAddress.toString(), pccertcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(pdrmclientversioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(handle.toInt(), wszattribute.rawAddress.toString(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetInfo(handle.toInt(), wszattribute.rawAddress.toString(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(hissuancelicense.toInt(), pcdays.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr, psttimeuntil: MutPtr, uflags: UInt, pudistributionpointnamelength: MutPtr, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr, wszdistributionpointurl: Pwstr, phowner: MutPtr, pfofficial: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), psttimefrom.rawAddress.toString(), psttimeuntil.rawAddress.toString(), uflags.toInt(), pudistributionpointnamelength.rawAddress.toString(), wszdistributionpointname.rawAddress.toString(), pudistributionpointurllength.rawAddress.toString(), wszdistributionpointurl.rawAddress.toString(), phowner.rawAddress.toString(), pfofficial.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr, wszissuancelicensetemplate: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), puissuancelicensetemplatelength.rawAddress.toString(), wszissuancelicensetemplate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr, wszcontentid: Pwstr, pucontentidtypelength: MutPtr, wszcontentidtype: Pwstr, puskuidlength: MutPtr, wszskuid: Pwstr, puskuidtypelength: MutPtr, wszskuidtype: Pwstr, pucontenttypelength: MutPtr, wszcontenttype: Pwstr, pucontentnamelength: MutPtr, wszcontentname: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetMetaData(hissuancelicense.toInt(), pucontentidlength.rawAddress.toString(), wszcontentid.rawAddress.toString(), pucontentidtypelength.rawAddress.toString(), wszcontentidtype.rawAddress.toString(), puskuidlength.rawAddress.toString(), wszskuid.rawAddress.toString(), puskuidtypelength.rawAddress.toString(), wszskuidtype.rawAddress.toString(), pucontenttypelength.rawAddress.toString(), wszcontenttype.rawAddress.toString(), pucontentnamelength.rawAddress.toString(), wszcontentname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr, punamelength: MutPtr, wszname: Pwstr, pudescriptionlength: MutPtr, wszdescription: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), pulcid.rawAddress.toString(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), pudescriptionlength.rawAddress.toString(), wszdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr, wszownerlicense: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(hissuancelicense.toInt(), puownerlicenselength.rawAddress.toString(), wszownerlicense.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(hlibrary.toInt(), wszprocname.rawAddress.toString(), ppfnprocaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr, wszid: Pwstr, puidtypelength: MutPtr, wszidtype: Pwstr, puurllength: MutPtr, wszrl: Pwstr, pstfrequency: MutPtr, punamelength: MutPtr, wszname: Pwstr, pupublickeylength: MutPtr, wszpublickey: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(hissuancelicense.toInt(), puidlength.rawAddress.toString(), wszid.rawAddress.toString(), puidtypelength.rawAddress.toString(), wszidtype.rawAddress.toString(), puurllength.rawAddress.toString(), wszrl.rawAddress.toString(), pstfrequency.rawAddress.toString(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), pupublickeylength.rawAddress.toString(), wszpublickey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr, wszextendedinfovalue: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), puextendedinfonamelength.rawAddress.toString(), wszextendedinfoname.rawAddress.toString(), puextendedinfovaluelength.rawAddress.toString(), wszextendedinfovalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr, wszrightname: Pwstr, pstfrom: MutPtr, pstuntil: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(hright.toInt(), purightnamelength.rawAddress.toString(), wszrightname.rawAddress.toString(), pstfrom.rawAddress.toString(), pstuntil.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr, wsztype: Pwstr, pupathlen: MutPtr, wszpath: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(uflags.toInt(), putypelen.rawAddress.toString(), wsztype.rawAddress.toString(), pupathlen.rawAddress.toString(), wszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr, wszserviceurl: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), wszissuancelicense.rawAddress.toString(), puserviceurllength.rawAddress.toString(), wszserviceurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.rawAddress.toString(), cbsymkey.toInt(), wszsymkeytype.rawAddress.toString(), wszclientlicensorcertificate.rawAddress.toString(), 0L.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.rawAddress.toString(), cbsymkey.toInt(), wszsymkeytype.rawAddress.toString(), pvreserved.rawAddress.toString(), henablingprincipal.toInt(), hboundlicenseclc.toInt(), 0L.toString(), pvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetTime(henv.toInt(), etimeridtype, potimeobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(hqueryroot.toInt(), wszattributetype.rawAddress.toString(), iwhich.toInt(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), wszattributetype.rawAddress.toString(), pcattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), iindex.toInt(), phsubquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), pcsubobjects.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr, pfexclusion: MutPtr, punamelength: MutPtr, wszname: Pwstr, puminversionlength: MutPtr, wszminversion: Pwstr, pumaxversionlength: MutPtr, wszmaxversion: Pwstr, pupublickeylength: MutPtr, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr, pbdigest: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), peusagepolicytype.rawAddress.toString(), pfexclusion.rawAddress.toString(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), puminversionlength.rawAddress.toString(), wszminversion.rawAddress.toString(), pumaxversionlength.rawAddress.toString(), wszmaxversion.rawAddress.toString(), pupublickeylength.rawAddress.toString(), wszpublickey.rawAddress.toString(), pudigestalgorithmlength.rawAddress.toString(), wszdigestalgorithm.rawAddress.toString(), pcbdigest.rawAddress.toString(), pbdigest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr, wszusername: Pwstr, puuseridlength: MutPtr, wszuserid: Pwstr, puuseridtypelength: MutPtr, wszuseridtype: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(huser.toInt(), puusernamelength.rawAddress.toString(), wszusername.rawAddress.toString(), puuseridlength.rawAddress.toString(), wszuserid.rawAddress.toString(), puuseridtypelength.rawAddress.toString(), wszuseridtype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), phright.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), phuser.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr, phdefaultlibrary: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider.rawAddress.toString(), wszmanifestcredentials.rawAddress.toString(), wszmachinecredentials.rawAddress.toString(), phenv.rawAddress.toString(), phdefaultlibrary.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMIsActivated(hclient.toInt(), uflags.toInt(), pactservinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(hwnd.rawAddress.toString(), pfprotected.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(henv.toInt(), especification, wszlibraryprovider.rawAddress.toString(), wszcredentials.rawAddress.toString(), phlibrary.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(wszcertificate.rawAddress.toString(), phqueryroot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(henv.toInt(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(henv.toInt(), wszrevocationlist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRepair(): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMRepair() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, wszname.rawAddress.toString(), wszvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr, dwlen: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(eglobaloptions, pvdata.rawAddress.toString(), dwlen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetMetaData(hissuancelicense.toInt(), wszcontentid.rawAddress.toString(), wszcontentidtype.rawAddress.toString(), wszskuid.rawAddress.toString(), wszskuidtype.rawAddress.toString(), wszcontenttype.rawAddress.toString(), wszcontentname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), wszname.rawAddress.toString(), wszdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, wszid.rawAddress.toString(), wszidtype.rawAddress.toString(), wszurl.rawAddress.toString(), pstfrequency.rawAddress.toString(), wszname.rawAddress.toString(), wszpublickey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr, cbdigest: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, wszname.rawAddress.toString(), wszminversion.rawAddress.toString(), wszmaxversion.rawAddress.toString(), wszpublickey.rawAddress.toString(), wszdigestalgorithm.rawAddress.toString(), pbdigest.rawAddress.toString(), cbdigest.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr, wszattesteddata: Pwstr, petype: MutPtr, pcprincipal: MutPtr, wszprincipal: Pwstr, pcmanifest: MutPtr, wszmanifest: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAddon != null) (windowsWin32DataRightsmanagementNapiAddon.windowssysWindowsWin32DataRightsmanagementDRMVerify(wszdata.rawAddress.toString(), pcattesteddata.rawAddress.toString(), wszattesteddata.rawAddress.toString(), petype.rawAddress.toString(), pcprincipal.rawAddress.toString(), wszprincipal.rawAddress.toString(), pcmanifest.rawAddress.toString(), wszmanifest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
