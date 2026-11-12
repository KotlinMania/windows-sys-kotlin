@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx

private val windowsWin32SystemComUrlmonNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun coGetClassObjectFromURL(rclassid: ConstPtr, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr, dwclscontext: Clsctx, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(rclassid.rawAddress.toString(), szcode.rawAddress.toString(), dwfileversionms.toInt(), dwfileversionls.toInt(), sztype.rawAddress.toString(), pbindctx.rawAddress.toString(), dwclscontext.toInt(), pvreserved.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineIUri(pbaseuri: MutPtr, prelativeuri: MutPtr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(pbaseuri.rawAddress.toString(), prelativeuri.rawAddress.toString(), dwcombineflags.toInt(), ppcombineduri.rawAddress.toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(pwzbaseurl.rawAddress.toString(), pwzrelativeurl.rawAddress.toString(), dwcombineflags.toInt(), pszresult.rawAddress.toString(), cchresult.toInt(), pcchresult.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCombineUrlEx(pbaseuri: MutPtr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(pbaseuri.rawAddress.toString(), pwzrelativeurl.rawAddress.toString(), dwcombineflags.toInt(), ppcombineduri.rawAddress.toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(pwzurl1.rawAddress.toString(), pwzurl2.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateSecurityManager(psp: MutPtr, ppsm: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(psp.rawAddress.toString(), ppsm.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetCreateZoneManager(psp: MutPtr, ppzm: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(psp.rawAddress.toString(), ppzm.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(pwzurl.rawAddress.toString(), pdwflags.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr, psuaction: Psuaction, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(pwszurl.rawAddress.toString(), ppwszsecurl.rawAddress.toString(), psuaction, dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSecurityUrlEx(puri: MutPtr, ppsecuri: MutPtr, psuaction: Psuaction, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(puri.rawAddress.toString(), ppsecuri.rawAddress.toString(), psuaction, dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetGetSession(dwsessionmode.toInt(), ppiinternetsession.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry, dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr, psecmgr: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), piuri.rawAddress.toString(), psecmgr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), szurl.rawAddress.toString(), psecmgr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(szfromurl.rawAddress.toString(), sztourl.rawAddress.toString(), psecmgr.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseIUri(piuri: MutPtr, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: ULong): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(piuri.rawAddress.toString(), parseaction, dwflags.toInt(), pwzresult.rawAddress.toString(), cchresult.toInt(), pcchresult.rawAddress.toString(), dwreserved.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(pwzurl.rawAddress.toString(), parseaction, dwflags.toInt(), pszresult.rawAddress.toString(), cchresult.toInt(), pcchresult.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr, cbbuffer: UInt, pcbbuffer: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(pwzurl.rawAddress.toString(), queryoptions, dwqueryflags.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.toInt(), pcbbuffer.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareSecurityIds(pbsecurityid1: ConstPtr, dwlen1: UInt, pbsecurityid2: ConstPtr, dwlen2: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCompareSecurityIds(pbsecurityid1.rawAddress.toString(), dwlen1.toInt(), pbsecurityid2.rawAddress.toString(), dwlen2.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compatFlagsFromClsid(pclsid: ConstPtr, pdwcompatflags: MutPtr, pdwmiscstatusflags: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(pclsid.rawAddress.toString(), pdwcompatflags.rawAddress.toString(), pdwmiscstatusflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyBindInfo(pcbisrc: ConstPtr, pbidest: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCopyBindInfo(pcbisrc.rawAddress.toString(), pbidest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyStgMedium(pcstgmedsrc: ConstPtr, pstgmeddest: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCopyStgMedium(pcstgmedsrc.rawAddress.toString(), pstgmeddest.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr, pefetc: MutPtr, ppbc: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(reserved.toInt(), pbscb.rawAddress.toString(), pefetc.rawAddress.toString(), ppbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAsyncBindCtxEx(pbc: MutPtr, dwoptions: UInt, pbscb: MutPtr, penum: MutPtr, ppbc: MutPtr, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(pbc.rawAddress.toString(), dwoptions.toInt(), pbscb.rawAddress.toString(), penum.rawAddress.toString(), ppbc.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr, ppenumfmtetc: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(cfmtetc.toInt(), rgfmtetc.rawAddress.toString(), ppenumfmtetc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMoniker(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCreateURLMoniker(pmkctx.rawAddress.toString(), szurl.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(pmkctx.rawAddress.toString(), szurl.rawAddress.toString(), ppmk.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createURLMonikerEx2(pmkctx: MutPtr, puri: MutPtr, ppmk: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(pmkctx.rawAddress.toString(), puri.rawAddress.toString(), ppmk.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr, pquery: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonFaultInIEFeature(hwnd.rawAddress.toString(), pclassspec.rawAddress.toString(), pquery.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonFindMediaType(rgsztypes.rawAddress.toString(), rgcftypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMediaTypeClass(pbc: MutPtr, sztype: Pcstr, pclsid: MutPtr, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(pbc.rawAddress.toString(), sztype.rawAddress.toString(), pclsid.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findMimeFromData(pbc: MutPtr, pwzurl: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonFindMimeFromData(pbc.rawAddress.toString(), pwzurl.rawAddress.toString(), pbuffer.rawAddress.toString(), cbsize.toInt(), pwzmimeproposed.rawAddress.toString(), dwmimeflags.toInt(), ppwzmimeout.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFileOrMime(pbc: MutPtr, szfilename: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(pbc.rawAddress.toString(), szfilename.rawAddress.toString(), pbuffer.rawAddress.toString(), cbsize.toInt(), szmime.rawAddress.toString(), dwreserved.toInt(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassURL(szurl: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonGetClassURL(szurl.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr, ppszcomponentid: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(pclassspec.rawAddress.toString(), ppszcomponentid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(szdistunit.rawAddress.toString(), psdi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoBack(punk: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonHlinkGoBack(punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGoForward(punk: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonHlinkGoForward(punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateMoniker(punk: MutPtr, pmktarget: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(punk.rawAddress.toString(), pmktarget.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateString(punk: MutPtr, sztarget: Pcwstr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonHlinkNavigateString(punk.rawAddress.toString(), sztarget.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(pmktarget.rawAddress.toString(), szlocation.rawAddress.toString(), sztargetframename.rawAddress.toString(), punk.rawAddress.toString(), pbc.rawAddress.toString(), param5.rawAddress.toString(), grfhlnf.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(sztarget.rawAddress.toString(), szlocation.rawAddress.toString(), sztargetframename.rawAddress.toString(), punk.rawAddress.toString(), pbc.rawAddress.toString(), param5.rawAddress.toString(), grfhlnf.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    if (windowsWin32SystemComUrlmonNapiAddon != null) MutPtr((windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iEInstallScope(pdwscope: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonIEInstallScope(pdwscope.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isAsyncMoniker(pmk: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(pmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(pszurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(pwszurl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidURL(pbc: MutPtr, szurl: Pcwstr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonIsValidURL(pbc.rawAddress.toString(), szurl.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayNameEx(pbc: MutPtr, szdisplayname: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(pbc.rawAddress.toString(), szdisplayname.rawAddress.toString(), pcheaten.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonObtainUserAgentString(dwoption.toInt(), pszuaout.rawAddress.toString(), cbsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerBindStatusCallback(pbc: MutPtr, pbscb: MutPtr, ppbscbprev: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(pbc.rawAddress.toString(), pbscb.rawAddress.toString(), ppbscbprev.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerFormatEnumerator(pbc: MutPtr, pefetc: MutPtr, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(pbc.rawAddress.toString(), pefetc.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypeClass(pbc: MutPtr, ctypes: UInt, rgsztypes: ConstPtr, rgclsid: ConstPtr, reserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(pbc.rawAddress.toString(), ctypes.toInt(), rgsztypes.rawAddress.toString(), rgclsid.rawAddress.toString(), reserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr, rgcftypes: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(ctypes.toInt(), rgsztypes.rawAddress.toString(), rgcftypes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseBindInfo(pbindinfo: MutPtr) {
    if (windowsWin32SystemComUrlmonNapiAddon != null) {
        windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonReleaseBindInfo(pbindinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun revokeBindStatusCallback(pbc: MutPtr, pbscb: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(pbc.rawAddress.toString(), pbscb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeFormatEnumerator(pbc: MutPtr, pefetc: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(pbc.rawAddress.toString(), pefetc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(hobject.rawAddress.toString(), ieobjecttype, dwaccessmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(szdistunit.rawAddress.toString(), dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileA(param0: MutPtr, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), cchfilename.toInt(), param4.toInt(), param5.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToCacheFileW(param0: MutPtr, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), cchfilename.toInt(), param4.toInt(), param5.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLDownloadToFileW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamA(param0: MutPtr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenBlockingStreamW(param0: MutPtr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString(), param3.toInt(), param4.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenPullStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLOpenStreamA(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uRLOpenStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonURLOpenStreamW(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr, dwbufferlength: UInt, pdwbufferlengthout: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(dwoption.toInt(), pbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbufferlengthout.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(dwoption.toInt(), pbuffer.rawAddress.toString(), dwbufferlength.toInt(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeHitLogging(lplogginginfo: ConstPtr): Bool =
    if (windowsWin32SystemComUrlmonNapiAddon != null) (windowsWin32SystemComUrlmonNapiAddon.windowssysWindowsWin32SystemComUrlmonWriteHitLogging(lplogginginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
