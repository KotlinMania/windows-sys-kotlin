@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx

private val _windowsWin32SystemComUrlmonNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun coGetClassObjectFromURL(rclassid: COpaquePointer?, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: COpaquePointer?, dwclscontext: Clsctx, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL((rclassid?.value ?: 0L).toString(), (szcode?.value ?: 0L).toString(), dwfileversionms.toInt(), dwfileversionls.toInt(), (sztype?.value ?: 0L).toString(), (pbindctx?.value ?: 0L).toString(), dwclscontext.toInt(), (pvreserved?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineIUri(pbaseuri: COpaquePointer?, prelativeuri: COpaquePointer?, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri((pbaseuri?.value ?: 0L).toString(), (prelativeuri?.value ?: 0L).toString(), dwcombineflags.toInt(), (ppcombineduri?.value ?: 0L).toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl((pwzbaseurl?.value ?: 0L).toString(), (pwzrelativeurl?.value ?: 0L).toString(), dwcombineflags.toInt(), (pszresult?.value ?: 0L).toString(), cchresult.toInt(), (pcchresult?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrlEx(pbaseuri: COpaquePointer?, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx((pbaseuri?.value ?: 0L).toString(), (pwzrelativeurl?.value ?: 0L).toString(), dwcombineflags.toInt(), (ppcombineduri?.value ?: 0L).toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl((pwzurl1?.value ?: 0L).toString(), (pwzurl2?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateSecurityManager(psp: COpaquePointer?, ppsm: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager((psp?.value ?: 0L).toString(), (ppsm?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateZoneManager(psp: COpaquePointer?, ppzm: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager((psp?.value ?: 0L).toString(), (ppzm?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags((pwzurl?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: COpaquePointer?, psuaction: Psuaction, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl((pwszurl?.value ?: 0L).toString(), (ppwszsecurl?.value ?: 0L).toString(), psuaction, dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrlEx(puri: COpaquePointer?, ppsecuri: COpaquePointer?, psuaction: Psuaction, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx((puri?.value ?: 0L).toString(), (ppsecuri?.value ?: 0L).toString(), psuaction, dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetGetSession(dwsessionmode.toInt(), (ppiinternetsession?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(featureentry, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: COpaquePointer?, psecmgr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), (piuri?.value ?: 0L).toString(), (psecmgr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), (szurl?.value ?: 0L).toString(), (psecmgr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled((szfromurl?.value ?: 0L).toString(), (sztourl?.value ?: 0L).toString(), (psecmgr?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseIUri(piuri: COpaquePointer?, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: ULong): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetParseIUri((piuri?.value ?: 0L).toString(), parseaction, dwflags.toInt(), (pwzresult?.value ?: 0L).toString(), cchresult.toInt(), (pcchresult?.value ?: 0L).toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetParseUrl((pwzurl?.value ?: 0L).toString(), parseaction, dwflags.toInt(), (pszresult?.value ?: 0L).toString(), cchresult.toInt(), (pcchresult?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbbuffer: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo((pwzurl?.value ?: 0L).toString(), queryoptions, dwqueryflags.toInt(), (pvbuffer?.value ?: 0L).toString(), cbbuffer.toInt(), (pcbbuffer?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareSecurityIds(pbsecurityid1: COpaquePointer?, dwlen1: UInt, pbsecurityid2: COpaquePointer?, dwlen2: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_compareSecurityIds((pbsecurityid1?.value ?: 0L).toString(), dwlen1.toInt(), (pbsecurityid2?.value ?: 0L).toString(), dwlen2.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compatFlagsFromClsid(pclsid: COpaquePointer?, pdwcompatflags: COpaquePointer?, pdwmiscstatusflags: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid((pclsid?.value ?: 0L).toString(), (pdwcompatflags?.value ?: 0L).toString(), (pdwmiscstatusflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyBindInfo(pcbisrc: COpaquePointer?, pbidest: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_copyBindInfo((pcbisrc?.value ?: 0L).toString(), (pbidest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyStgMedium(pcstgmedsrc: COpaquePointer?, pstgmeddest: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_copyStgMedium((pcstgmedsrc?.value ?: 0L).toString(), (pstgmeddest?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: COpaquePointer?, pefetc: COpaquePointer?, ppbc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(reserved.toInt(), (pbscb?.value ?: 0L).toString(), (pefetc?.value ?: 0L).toString(), (ppbc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtxEx(pbc: COpaquePointer?, dwoptions: UInt, pbscb: COpaquePointer?, penum: COpaquePointer?, ppbc: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx((pbc?.value ?: 0L).toString(), dwoptions.toInt(), (pbscb?.value ?: 0L).toString(), (penum?.value ?: 0L).toString(), (ppbc?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: COpaquePointer?, ppenumfmtetc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(cfmtetc.toInt(), (rgfmtetc?.value ?: 0L).toString(), (ppenumfmtetc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMoniker(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_createURLMoniker((pmkctx?.value ?: 0L).toString(), (szurl?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx((pmkctx?.value ?: 0L).toString(), (szurl?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx2(pmkctx: COpaquePointer?, puri: COpaquePointer?, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2((pmkctx?.value ?: 0L).toString(), (puri?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: COpaquePointer?, pquery: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_faultInIEFeature((hwnd?.value ?: 0L).toString(), (pclassspec?.value ?: 0L).toString(), (pquery?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_findMediaType((rgsztypes?.value ?: 0L).toString(), (rgcftypes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaTypeClass(pbc: COpaquePointer?, sztype: Pcstr, pclsid: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_findMediaTypeClass((pbc?.value ?: 0L).toString(), (sztype?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMimeFromData(pbc: COpaquePointer?, pwzurl: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_findMimeFromData((pbc?.value ?: 0L).toString(), (pwzurl?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), cbsize.toInt(), (pwzmimeproposed?.value ?: 0L).toString(), dwmimeflags.toInt(), (ppwzmimeout?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFileOrMime(pbc: COpaquePointer?, szfilename: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_getClassFileOrMime((pbc?.value ?: 0L).toString(), (szfilename?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), cbsize.toInt(), (szmime?.value ?: 0L).toString(), dwreserved.toInt(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassURL(szurl: Pcwstr, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_getClassURL((szurl?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComponentIDFromCLSSPEC(pclassspec: COpaquePointer?, ppszcomponentid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC((pclassspec?.value ?: 0L).toString(), (ppszcomponentid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo((szdistunit?.value ?: 0L).toString(), (psdi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoBack(punk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_hlinkGoBack((punk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoForward(punk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_hlinkGoForward((punk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateMoniker(punk: COpaquePointer?, pmktarget: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker((punk?.value ?: 0L).toString(), (pmktarget?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateString(punk: COpaquePointer?, sztarget: Pcwstr): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_hlinkNavigateString((punk?.value ?: 0L).toString(), (sztarget?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: COpaquePointer?, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker((pmktarget?.value ?: 0L).toString(), (szlocation?.value ?: 0L).toString(), (sztargetframename?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (param5?.value ?: 0L).toString(), grfhlnf.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString((sztarget?.value ?: 0L).toString(), (szlocation?.value ?: 0L).toString(), (sztargetframename?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), (pbc?.value ?: 0L).toString(), (param5?.value ?: 0L).toString(), grfhlnf.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInstallScope(pdwscope: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_iEInstallScope((pdwscope?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAsyncMoniker(pmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_isAsyncMoniker((pmk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA((pszurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW((pwszurl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidURL(pbc: COpaquePointer?, szurl: Pcwstr, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_isValidURL((pbc?.value ?: 0L).toString(), (szurl?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayNameEx(pbc: COpaquePointer?, szdisplayname: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx((pbc?.value ?: 0L).toString(), (szdisplayname?.value ?: 0L).toString(), (pcheaten?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(dwoption.toInt(), (pszuaout?.value ?: 0L).toString(), (cbsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?, ppbscbprev: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback((pbc?.value ?: 0L).toString(), (pbscb?.value ?: 0L).toString(), (ppbscbprev?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator((pbc?.value ?: 0L).toString(), (pefetc?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypeClass(pbc: COpaquePointer?, ctypes: UInt, rgsztypes: COpaquePointer?, rgclsid: COpaquePointer?, reserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass((pbc?.value ?: 0L).toString(), ctypes.toInt(), (rgsztypes?.value ?: 0L).toString(), (rgclsid?.value ?: 0L).toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: COpaquePointer?, rgcftypes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_registerMediaTypes(ctypes.toInt(), (rgsztypes?.value ?: 0L).toString(), (rgcftypes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseBindInfo(pbindinfo: COpaquePointer?) {
    if (_windowsWin32SystemComUrlmonNapiAddon != null) {
        _windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_releaseBindInfo((pbindinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revokeBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback((pbc?.value ?: 0L).toString(), (pbscb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator((pbc?.value ?: 0L).toString(), (pefetc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer((hobject?.value ?: 0L).toString(), ieobjecttype, dwaccessmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState((szdistunit?.value ?: 0L).toString(), dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), cchfilename.toInt(), param4.toInt(), (param5?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), cchfilename.toInt(), param4.toInt(), (param5?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), (param2?.value ?: 0L).toString(), param3.toInt(), (param4?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), (param3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbufferlengthout: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(dwoption.toInt(), (pbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), (pdwbufferlengthout?.value ?: 0L).toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(dwoption.toInt(), (pbuffer?.value ?: 0L).toString(), dwbufferlength.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeHitLogging(lplogginginfo: COpaquePointer?): Bool =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_writeHitLogging((lplogginginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
