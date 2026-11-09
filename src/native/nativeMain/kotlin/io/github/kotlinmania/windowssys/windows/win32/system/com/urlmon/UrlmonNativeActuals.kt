@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CoGetClassObjectFromURL(rclassid: Long, szcode: PCWSTR, dwfileversionms: UInt, dwfileversionls: UInt, sztype: PCWSTR, pbindctx: Long, dwclscontext: CLSCTX, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoGetClassObjectFromURL(rclassid.toCPointer<ByteVar>(), szcode.toCPointer<ByteVar>(), dwfileversionms, dwfileversionls, sztype.toCPointer<ByteVar>(), pbindctx.toCPointer<ByteVar>(), dwclscontext, pvreserved.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetCombineIUri(pbaseuri.toCPointer<ByteVar>(), prelativeuri.toCPointer<ByteVar>(), dwcombineflags, ppcombineduri.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetCombineUrl(pwzbaseurl: PCWSTR, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrl(pwzbaseurl.toCPointer<ByteVar>(), pwzrelativeurl.toCPointer<ByteVar>(), dwcombineflags, pszresult.toCPointer<ByteVar>(), cchresult, pcchresult.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrlEx(pbaseuri.toCPointer<ByteVar>(), pwzrelativeurl.toCPointer<ByteVar>(), dwcombineflags, ppcombineduri.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetCompareUrl(pwzurl1: PCWSTR, pwzurl2: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetCompareUrl(pwzurl1.toCPointer<ByteVar>(), pwzurl2.toCPointer<ByteVar>(), dwflags)

public actual fun CoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetCreateSecurityManager(psp.toCPointer<ByteVar>(), ppsm.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetCreateZoneManager(psp.toCPointer<ByteVar>(), ppzm.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetGetProtocolFlags(pwzurl: PCWSTR, pdwflags: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetGetProtocolFlags(pwzurl.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetGetSecurityUrl(pwszurl: PCWSTR, ppwszsecurl: Long, psuaction: PSUACTION, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrl(pwszurl.toCPointer<ByteVar>(), ppwszsecurl.toCPointer<ByteVar>(), psuaction, dwreserved)

public actual fun CoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: PSUACTION, dwreserved: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrlEx(puri.toCPointer<ByteVar>(), ppsecuri.toCPointer<ByteVar>(), psuaction, dwreserved)

public actual fun CoInternetGetSession(dwsessionmode: UInt, ppiinternetsession: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetGetSession(dwsessionmode, ppiinternetsession.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetIsFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabled(featureentry, dwflags)

public actual fun CoInternetIsFeatureEnabledForIUri(featureentry: INTERNETFEATURELIST, dwflags: UInt, piuri: Long, psecmgr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForIUri(featureentry, dwflags, piuri.toCPointer<ByteVar>(), psecmgr.toCPointer<ByteVar>())

public actual fun CoInternetIsFeatureEnabledForUrl(featureentry: INTERNETFEATURELIST, dwflags: UInt, szurl: PCWSTR, psecmgr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForUrl(featureentry, dwflags, szurl.toCPointer<ByteVar>(), psecmgr.toCPointer<ByteVar>())

public actual fun CoInternetIsFeatureZoneElevationEnabled(szfromurl: PCWSTR, sztourl: PCWSTR, psecmgr: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureZoneElevationEnabled(szfromurl.toCPointer<ByteVar>(), sztourl.toCPointer<ByteVar>(), psecmgr.toCPointer<ByteVar>(), dwflags)

public actual fun CoInternetParseIUri(piuri: Long, parseaction: PARSEACTION, dwflags: UInt, pwzresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetParseIUri(piuri.toCPointer<ByteVar>(), parseaction, dwflags, pwzresult.toCPointer<ByteVar>(), cchresult, pcchresult.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetParseUrl(pwzurl: PCWSTR, parseaction: PARSEACTION, dwflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetParseUrl(pwzurl.toCPointer<ByteVar>(), parseaction, dwflags, pszresult.toCPointer<ByteVar>(), cchresult, pcchresult.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetQueryInfo(pwzurl: PCWSTR, queryoptions: QUERYOPTION, dwqueryflags: UInt, pvbuffer: Long, cbbuffer: UInt, pcbbuffer: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetQueryInfo(pwzurl.toCPointer<ByteVar>(), queryoptions, dwqueryflags, pvbuffer.toCPointer<ByteVar>(), cbbuffer, pcbbuffer.toCPointer<ByteVar>(), dwreserved)

public actual fun CoInternetSetFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt, fenable: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CoInternetSetFeatureEnabled(featureentry, dwflags, fenable)

public actual fun CompareSecurityIds(pbsecurityid1: Long, dwlen1: UInt, pbsecurityid2: Long, dwlen2: UInt, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CompareSecurityIds(pbsecurityid1.toCPointer<ByteVar>(), dwlen1, pbsecurityid2.toCPointer<ByteVar>(), dwlen2, dwreserved)

public actual fun CompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CompatFlagsFromClsid(pclsid.toCPointer<ByteVar>(), pdwcompatflags.toCPointer<ByteVar>(), pdwmiscstatusflags.toCPointer<ByteVar>())

public actual fun CopyBindInfo(pcbisrc: Long, pbidest: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CopyBindInfo(pcbisrc.toCPointer<ByteVar>(), pbidest.toCPointer<ByteVar>())

public actual fun CopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CopyStgMedium(pcstgmedsrc.toCPointer<ByteVar>(), pstgmeddest.toCPointer<ByteVar>())

public actual fun CreateAsyncBindCtx(reserved: UInt, pbscb: Long, pefetc: Long, ppbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtx(reserved, pbscb.toCPointer<ByteVar>(), pefetc.toCPointer<ByteVar>(), ppbc.toCPointer<ByteVar>())

public actual fun CreateAsyncBindCtxEx(pbc: Long, dwoptions: UInt, pbscb: Long, penum: Long, ppbc: Long, reserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtxEx(pbc.toCPointer<ByteVar>(), dwoptions, pbscb.toCPointer<ByteVar>(), penum.toCPointer<ByteVar>(), ppbc.toCPointer<ByteVar>(), reserved)

public actual fun CreateFormatEnumerator(cfmtetc: UInt, rgfmtetc: Long, ppenumfmtetc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CreateFormatEnumerator(cfmtetc, rgfmtetc.toCPointer<ByteVar>(), ppenumfmtetc.toCPointer<ByteVar>())

public actual fun CreateURLMoniker(pmkctx: Long, szurl: PCWSTR, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CreateURLMoniker(pmkctx.toCPointer<ByteVar>(), szurl.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun CreateURLMonikerEx(pmkctx: Long, szurl: PCWSTR, ppmk: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx(pmkctx.toCPointer<ByteVar>(), szurl.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>(), dwflags)

public actual fun CreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx2(pmkctx.toCPointer<ByteVar>(), puri.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>(), dwflags)

public actual fun FaultInIEFeature(hwnd: HWND, pclassspec: Long, pquery: Long, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_FaultInIEFeature(hwnd.toCPointer<ByteVar>(), pclassspec.toCPointer<ByteVar>(), pquery.toCPointer<ByteVar>(), dwflags)

public actual fun FindMediaType(rgsztypes: PCSTR, rgcftypes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_FindMediaType(rgsztypes.toCPointer<ByteVar>(), rgcftypes.toCPointer<ByteVar>())

public actual fun FindMediaTypeClass(pbc: Long, sztype: PCSTR, pclsid: Long, reserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_FindMediaTypeClass(pbc.toCPointer<ByteVar>(), sztype.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>(), reserved)

public actual fun FindMimeFromData(pbc: Long, pwzurl: PCWSTR, pbuffer: Long, cbsize: UInt, pwzmimeproposed: PCWSTR, dwmimeflags: UInt, ppwzmimeout: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_FindMimeFromData(pbc.toCPointer<ByteVar>(), pwzurl.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), cbsize, pwzmimeproposed.toCPointer<ByteVar>(), dwmimeflags, ppwzmimeout.toCPointer<ByteVar>(), dwreserved)

public actual fun GetClassFileOrMime(pbc: Long, szfilename: PCWSTR, pbuffer: Long, cbsize: UInt, szmime: PCWSTR, dwreserved: UInt, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_GetClassFileOrMime(pbc.toCPointer<ByteVar>(), szfilename.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), cbsize, szmime.toCPointer<ByteVar>(), dwreserved, pclsid.toCPointer<ByteVar>())

public actual fun GetClassURL(szurl: PCWSTR, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_GetClassURL(szurl.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun GetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_GetComponentIDFromCLSSPEC(pclassspec.toCPointer<ByteVar>(), ppszcomponentid.toCPointer<ByteVar>())

public actual fun GetSoftwareUpdateInfo(szdistunit: PCWSTR, psdi: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_GetSoftwareUpdateInfo(szdistunit.toCPointer<ByteVar>(), psdi.toCPointer<ByteVar>())

public actual fun HlinkGoBack(punk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_HlinkGoBack(punk.toCPointer<ByteVar>())

public actual fun HlinkGoForward(punk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_HlinkGoForward(punk.toCPointer<ByteVar>())

public actual fun HlinkNavigateMoniker(punk: Long, pmktarget: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_HlinkNavigateMoniker(punk.toCPointer<ByteVar>(), pmktarget.toCPointer<ByteVar>())

public actual fun HlinkNavigateString(punk: Long, sztarget: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_HlinkNavigateString(punk.toCPointer<ByteVar>(), sztarget.toCPointer<ByteVar>())

public actual fun HlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToMoniker(pmktarget.toCPointer<ByteVar>(), szlocation.toCPointer<ByteVar>(), sztargetframename.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>(), grfhlnf, dwreserved)

public actual fun HlinkSimpleNavigateToString(sztarget: PCWSTR, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToString(sztarget.toCPointer<ByteVar>(), szlocation.toCPointer<ByteVar>(), sztargetframename.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), pbc.toCPointer<ByteVar>(), param5.toCPointer<ByteVar>(), grfhlnf, dwreserved)

public actual fun IEGetUserPrivateNamespaceName(): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_IEGetUserPrivateNamespaceName()?.toLong() ?: 0L

public actual fun IEInstallScope(pdwscope: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_IEInstallScope(pdwscope.toCPointer<ByteVar>())

public actual fun IsAsyncMoniker(pmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_IsAsyncMoniker(pmk.toCPointer<ByteVar>())

public actual fun IsLoggingEnabledA(pszurl: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledA(pszurl.toCPointer<ByteVar>())

public actual fun IsLoggingEnabledW(pwszurl: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledW(pwszurl.toCPointer<ByteVar>())

public actual fun IsValidURL(pbc: Long, szurl: PCWSTR, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_IsValidURL(pbc.toCPointer<ByteVar>(), szurl.toCPointer<ByteVar>(), dwreserved)

public actual fun MkParseDisplayNameEx(pbc: Long, szdisplayname: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_MkParseDisplayNameEx(pbc.toCPointer<ByteVar>(), szdisplayname.toCPointer<ByteVar>(), pcheaten.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun ObtainUserAgentString(dwoption: UInt, pszuaout: PSTR, cbsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_ObtainUserAgentString(dwoption, pszuaout.toCPointer<ByteVar>(), cbsize.toCPointer<ByteVar>())

public actual fun RegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_RegisterBindStatusCallback(pbc.toCPointer<ByteVar>(), pbscb.toCPointer<ByteVar>(), ppbscbprev.toCPointer<ByteVar>(), dwreserved)

public actual fun RegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_RegisterFormatEnumerator(pbc.toCPointer<ByteVar>(), pefetc.toCPointer<ByteVar>(), reserved)

public actual fun RegisterMediaTypeClass(pbc: Long, ctypes: UInt, rgsztypes: Long, rgclsid: Long, reserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_RegisterMediaTypeClass(pbc.toCPointer<ByteVar>(), ctypes, rgsztypes.toCPointer<ByteVar>(), rgclsid.toCPointer<ByteVar>(), reserved)

public actual fun RegisterMediaTypes(ctypes: UInt, rgsztypes: Long, rgcftypes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_RegisterMediaTypes(ctypes, rgsztypes.toCPointer<ByteVar>(), rgcftypes.toCPointer<ByteVar>())

public actual fun ReleaseBindInfo(pbindinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_ReleaseBindInfo(pbindinfo.toCPointer<ByteVar>())
}

public actual fun RevokeBindStatusCallback(pbc: Long, pbscb: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_RevokeBindStatusCallback(pbc.toCPointer<ByteVar>(), pbscb.toCPointer<ByteVar>())

public actual fun RevokeFormatEnumerator(pbc: Long, pefetc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_RevokeFormatEnumerator(pbc.toCPointer<ByteVar>(), pefetc.toCPointer<ByteVar>())

public actual fun SetAccessForIEAppContainer(hobject: HANDLE, ieobjecttype: IEObjectType, dwaccessmask: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_SetAccessForIEAppContainer(hobject.toCPointer<ByteVar>(), ieobjecttype, dwaccessmask)

public actual fun SetSoftwareUpdateAdvertisementState(szdistunit: PCWSTR, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_SetSoftwareUpdateAdvertisementState(szdistunit.toCPointer<ByteVar>(), dwadstate, dwadvertisedversionms, dwadvertisedversionls)

public actual fun URLDownloadToCacheFileA(param0: Long, param1: PCSTR, param2: PSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), cchfilename, param4, param5.toCPointer<ByteVar>())

public actual fun URLDownloadToCacheFileW(param0: Long, param1: PCWSTR, param2: PWSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), cchfilename, param4, param5.toCPointer<ByteVar>())

public actual fun URLDownloadToFileA(param0: Long, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLDownloadToFileA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>())

public actual fun URLDownloadToFileW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLDownloadToFileW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>())

public actual fun URLOpenBlockingStreamA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>())

public actual fun URLOpenBlockingStreamW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2.toCPointer<ByteVar>(), param3, param4.toCPointer<ByteVar>())

public actual fun URLOpenPullStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun URLOpenPullStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun URLOpenStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLOpenStreamA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun URLOpenStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_URLOpenStreamW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3.toCPointer<ByteVar>())

public actual fun UrlMkGetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, pdwbufferlengthout: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_UrlMkGetSessionOption(dwoption, pbuffer.toCPointer<ByteVar>(), dwbufferlength, pdwbufferlengthout.toCPointer<ByteVar>(), dwreserved)

public actual fun UrlMkSetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_UrlMkSetSessionOption(dwoption, pbuffer.toCPointer<ByteVar>(), dwbufferlength, dwreserved)

public actual fun WriteHitLogging(lplogginginfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_WriteHitLogging(lplogginginfo.toCPointer<ByteVar>())
