@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.com.CLSCTX

private val _windowsWin32SystemComUrlmonNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun CoGetClassObjectFromURL(rclassid: Long, szcode: PCWSTR, dwfileversionms: UInt, dwfileversionls: UInt, sztype: PCWSTR, pbindctx: Long, dwclscontext: CLSCTX, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoGetClassObjectFromURL(rclassid.toString(), szcode.toString(), dwfileversionms.toInt(), dwfileversionls.toInt(), sztype.toString(), pbindctx.toString(), dwclscontext.toInt(), pvreserved.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetCombineIUri(pbaseuri.toString(), prelativeuri.toString(), dwcombineflags.toInt(), ppcombineduri.toString(), dwreserved.toString()) as Int) else 0

public actual fun CoInternetCombineUrl(pwzbaseurl: PCWSTR, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrl(pwzbaseurl.toString(), pwzrelativeurl.toString(), dwcombineflags.toInt(), pszresult.toString(), cchresult.toInt(), pcchresult.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrlEx(pbaseuri.toString(), pwzrelativeurl.toString(), dwcombineflags.toInt(), ppcombineduri.toString(), dwreserved.toString()) as Int) else 0

public actual fun CoInternetCompareUrl(pwzurl1: PCWSTR, pwzurl2: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetCompareUrl(pwzurl1.toString(), pwzurl2.toString(), dwflags.toInt()) as Int) else 0

public actual fun CoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetCreateSecurityManager(psp.toString(), ppsm.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetCreateZoneManager(psp.toString(), ppzm.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetGetProtocolFlags(pwzurl: PCWSTR, pdwflags: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetGetProtocolFlags(pwzurl.toString(), pdwflags.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetGetSecurityUrl(pwszurl: PCWSTR, ppwszsecurl: Long, psuaction: PSUACTION, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrl(pwszurl.toString(), ppwszsecurl.toString(), psuaction, dwreserved.toInt()) as Int) else 0

public actual fun CoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: PSUACTION, dwreserved: ULong): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrlEx(puri.toString(), ppsecuri.toString(), psuaction, dwreserved.toString()) as Int) else 0

public actual fun CoInternetGetSession(dwsessionmode: UInt, ppiinternetsession: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetGetSession(dwsessionmode.toInt(), ppiinternetsession.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetIsFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabled(featureentry, dwflags.toInt()) as Int) else 0

public actual fun CoInternetIsFeatureEnabledForIUri(featureentry: INTERNETFEATURELIST, dwflags: UInt, piuri: Long, psecmgr: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), piuri.toString(), psecmgr.toString()) as Int) else 0

public actual fun CoInternetIsFeatureEnabledForUrl(featureentry: INTERNETFEATURELIST, dwflags: UInt, szurl: PCWSTR, psecmgr: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), szurl.toString(), psecmgr.toString()) as Int) else 0

public actual fun CoInternetIsFeatureZoneElevationEnabled(szfromurl: PCWSTR, sztourl: PCWSTR, psecmgr: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureZoneElevationEnabled(szfromurl.toString(), sztourl.toString(), psecmgr.toString(), dwflags.toInt()) as Int) else 0

public actual fun CoInternetParseIUri(piuri: Long, parseaction: PARSEACTION, dwflags: UInt, pwzresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: ULong): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetParseIUri(piuri.toString(), parseaction, dwflags.toInt(), pwzresult.toString(), cchresult.toInt(), pcchresult.toString(), dwreserved.toString()) as Int) else 0

public actual fun CoInternetParseUrl(pwzurl: PCWSTR, parseaction: PARSEACTION, dwflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetParseUrl(pwzurl.toString(), parseaction, dwflags.toInt(), pszresult.toString(), cchresult.toInt(), pcchresult.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetQueryInfo(pwzurl: PCWSTR, queryoptions: QUERYOPTION, dwqueryflags: UInt, pvbuffer: Long, cbbuffer: UInt, pcbbuffer: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetQueryInfo(pwzurl.toString(), queryoptions, dwqueryflags.toInt(), pvbuffer.toString(), cbbuffer.toInt(), pcbbuffer.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoInternetSetFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt, fenable: BOOL): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable) as Int) else 0

public actual fun CompareSecurityIds(pbsecurityid1: Long, dwlen1: UInt, pbsecurityid2: Long, dwlen2: UInt, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CompareSecurityIds(pbsecurityid1.toString(), dwlen1.toInt(), pbsecurityid2.toString(), dwlen2.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun CompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CompatFlagsFromClsid(pclsid.toString(), pdwcompatflags.toString(), pdwmiscstatusflags.toString()) as Int) else 0

public actual fun CopyBindInfo(pcbisrc: Long, pbidest: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CopyBindInfo(pcbisrc.toString(), pbidest.toString()) as Int) else 0

public actual fun CopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CopyStgMedium(pcstgmedsrc.toString(), pstgmeddest.toString()) as Int) else 0

public actual fun CreateAsyncBindCtx(reserved: UInt, pbscb: Long, pefetc: Long, ppbc: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtx(reserved.toInt(), pbscb.toString(), pefetc.toString(), ppbc.toString()) as Int) else 0

public actual fun CreateAsyncBindCtxEx(pbc: Long, dwoptions: UInt, pbscb: Long, penum: Long, ppbc: Long, reserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtxEx(pbc.toString(), dwoptions.toInt(), pbscb.toString(), penum.toString(), ppbc.toString(), reserved.toInt()) as Int) else 0

public actual fun CreateFormatEnumerator(cfmtetc: UInt, rgfmtetc: Long, ppenumfmtetc: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CreateFormatEnumerator(cfmtetc.toInt(), rgfmtetc.toString(), ppenumfmtetc.toString()) as Int) else 0

public actual fun CreateURLMoniker(pmkctx: Long, szurl: PCWSTR, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CreateURLMoniker(pmkctx.toString(), szurl.toString(), ppmk.toString()) as Int) else 0

public actual fun CreateURLMonikerEx(pmkctx: Long, szurl: PCWSTR, ppmk: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx(pmkctx.toString(), szurl.toString(), ppmk.toString(), dwflags.toInt()) as Int) else 0

public actual fun CreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx2(pmkctx.toString(), puri.toString(), ppmk.toString(), dwflags.toInt()) as Int) else 0

public actual fun FaultInIEFeature(hwnd: HWND, pclassspec: Long, pquery: Long, dwflags: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_FaultInIEFeature(hwnd.toString(), pclassspec.toString(), pquery.toString(), dwflags.toInt()) as Int) else 0

public actual fun FindMediaType(rgsztypes: PCSTR, rgcftypes: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_FindMediaType(rgsztypes.toString(), rgcftypes.toString()) as Int) else 0

public actual fun FindMediaTypeClass(pbc: Long, sztype: PCSTR, pclsid: Long, reserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_FindMediaTypeClass(pbc.toString(), sztype.toString(), pclsid.toString(), reserved.toInt()) as Int) else 0

public actual fun FindMimeFromData(pbc: Long, pwzurl: PCWSTR, pbuffer: Long, cbsize: UInt, pwzmimeproposed: PCWSTR, dwmimeflags: UInt, ppwzmimeout: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_FindMimeFromData(pbc.toString(), pwzurl.toString(), pbuffer.toString(), cbsize.toInt(), pwzmimeproposed.toString(), dwmimeflags.toInt(), ppwzmimeout.toString(), dwreserved.toInt()) as Int) else 0

public actual fun GetClassFileOrMime(pbc: Long, szfilename: PCWSTR, pbuffer: Long, cbsize: UInt, szmime: PCWSTR, dwreserved: UInt, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_GetClassFileOrMime(pbc.toString(), szfilename.toString(), pbuffer.toString(), cbsize.toInt(), szmime.toString(), dwreserved.toInt(), pclsid.toString()) as Int) else 0

public actual fun GetClassURL(szurl: PCWSTR, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_GetClassURL(szurl.toString(), pclsid.toString()) as Int) else 0

public actual fun GetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_GetComponentIDFromCLSSPEC(pclassspec.toString(), ppszcomponentid.toString()) as Int) else 0

public actual fun GetSoftwareUpdateInfo(szdistunit: PCWSTR, psdi: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_GetSoftwareUpdateInfo(szdistunit.toString(), psdi.toString()) as Int) else 0

public actual fun HlinkGoBack(punk: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_HlinkGoBack(punk.toString()) as Int) else 0

public actual fun HlinkGoForward(punk: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_HlinkGoForward(punk.toString()) as Int) else 0

public actual fun HlinkNavigateMoniker(punk: Long, pmktarget: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_HlinkNavigateMoniker(punk.toString(), pmktarget.toString()) as Int) else 0

public actual fun HlinkNavigateString(punk: Long, sztarget: PCWSTR): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_HlinkNavigateString(punk.toString(), sztarget.toString()) as Int) else 0

public actual fun HlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToMoniker(pmktarget.toString(), szlocation.toString(), sztargetframename.toString(), punk.toString(), pbc.toString(), param5.toString(), grfhlnf.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun HlinkSimpleNavigateToString(sztarget: PCWSTR, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToString(sztarget.toString(), szlocation.toString(), sztargetframename.toString(), punk.toString(), pbc.toString(), param5.toString(), grfhlnf.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun IEGetUserPrivateNamespaceName(): PWSTR =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_IEGetUserPrivateNamespaceName() as String).toLong() else 0L

public actual fun IEInstallScope(pdwscope: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_IEInstallScope(pdwscope.toString()) as Int) else 0

public actual fun IsAsyncMoniker(pmk: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_IsAsyncMoniker(pmk.toString()) as Int) else 0

public actual fun IsLoggingEnabledA(pszurl: PCSTR): BOOL =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledA(pszurl.toString()) as Int) else 0

public actual fun IsLoggingEnabledW(pwszurl: PCWSTR): BOOL =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledW(pwszurl.toString()) as Int) else 0

public actual fun IsValidURL(pbc: Long, szurl: PCWSTR, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_IsValidURL(pbc.toString(), szurl.toString(), dwreserved.toInt()) as Int) else 0

public actual fun MkParseDisplayNameEx(pbc: Long, szdisplayname: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_MkParseDisplayNameEx(pbc.toString(), szdisplayname.toString(), pcheaten.toString(), ppmk.toString()) as Int) else 0

public actual fun ObtainUserAgentString(dwoption: UInt, pszuaout: PSTR, cbsize: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_ObtainUserAgentString(dwoption.toInt(), pszuaout.toString(), cbsize.toString()) as Int) else 0

public actual fun RegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_RegisterBindStatusCallback(pbc.toString(), pbscb.toString(), ppbscbprev.toString(), dwreserved.toInt()) as Int) else 0

public actual fun RegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_RegisterFormatEnumerator(pbc.toString(), pefetc.toString(), reserved.toInt()) as Int) else 0

public actual fun RegisterMediaTypeClass(pbc: Long, ctypes: UInt, rgsztypes: Long, rgclsid: Long, reserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_RegisterMediaTypeClass(pbc.toString(), ctypes.toInt(), rgsztypes.toString(), rgclsid.toString(), reserved.toInt()) as Int) else 0

public actual fun RegisterMediaTypes(ctypes: UInt, rgsztypes: Long, rgcftypes: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_RegisterMediaTypes(ctypes.toInt(), rgsztypes.toString(), rgcftypes.toString()) as Int) else 0

public actual fun ReleaseBindInfo(pbindinfo: Long) {
    if (_windowsWin32SystemComUrlmonNapiAddon != null) {
        _windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_ReleaseBindInfo(pbindinfo.toString())
    }
}

public actual fun RevokeBindStatusCallback(pbc: Long, pbscb: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_RevokeBindStatusCallback(pbc.toString(), pbscb.toString()) as Int) else 0

public actual fun RevokeFormatEnumerator(pbc: Long, pefetc: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_RevokeFormatEnumerator(pbc.toString(), pefetc.toString()) as Int) else 0

public actual fun SetAccessForIEAppContainer(hobject: HANDLE, ieobjecttype: IEObjectType, dwaccessmask: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_SetAccessForIEAppContainer(hobject.toString(), ieobjecttype, dwaccessmask.toInt()) as Int) else 0

public actual fun SetSoftwareUpdateAdvertisementState(szdistunit: PCWSTR, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_SetSoftwareUpdateAdvertisementState(szdistunit.toString(), dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt()) as Int) else 0

public actual fun URLDownloadToCacheFileA(param0: Long, param1: PCSTR, param2: PSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileA(param0.toString(), param1.toString(), param2.toString(), cchfilename.toInt(), param4.toInt(), param5.toString()) as Int) else 0

public actual fun URLDownloadToCacheFileW(param0: Long, param1: PCWSTR, param2: PWSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileW(param0.toString(), param1.toString(), param2.toString(), cchfilename.toInt(), param4.toInt(), param5.toString()) as Int) else 0

public actual fun URLDownloadToFileA(param0: Long, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLDownloadToFileA(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString()) as Int) else 0

public actual fun URLDownloadToFileW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLDownloadToFileW(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString()) as Int) else 0

public actual fun URLOpenBlockingStreamA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamA(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString()) as Int) else 0

public actual fun URLOpenBlockingStreamW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamW(param0.toString(), param1.toString(), param2.toString(), param3.toInt(), param4.toString()) as Int) else 0

public actual fun URLOpenPullStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamA(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun URLOpenPullStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamW(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun URLOpenStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLOpenStreamA(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun URLOpenStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_URLOpenStreamW(param0.toString(), param1.toString(), param2.toInt(), param3.toString()) as Int) else 0

public actual fun UrlMkGetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, pdwbufferlengthout: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_UrlMkGetSessionOption(dwoption.toInt(), pbuffer.toString(), dwbufferlength.toInt(), pdwbufferlengthout.toString(), dwreserved.toInt()) as Int) else 0

public actual fun UrlMkSetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_UrlMkSetSessionOption(dwoption.toInt(), pbuffer.toString(), dwbufferlength.toInt(), dwreserved.toInt()) as Int) else 0

public actual fun WriteHitLogging(lplogginginfo: Long): BOOL =
    if (_windowsWin32SystemComUrlmonNapiAddon != null) (_windowsWin32SystemComUrlmonNapiAddon.windowssys_windows_win32_system_com_urlmon_WriteHitLogging(lplogginginfo.toString()) as Int) else 0
