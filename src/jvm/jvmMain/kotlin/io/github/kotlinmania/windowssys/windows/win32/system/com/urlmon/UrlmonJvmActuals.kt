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

private object WindowsWin32SystemComUrlmonJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoGetClassObjectFromURL(rclassid: Long, szcode: Long, dwfileversionms: Int, dwfileversionls: Int, sztype: Long, pbindctx: Long, dwclscontext: Int, pvreserved: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: Int, ppcombineduri: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrl(pwzbaseurl: Long, pwzrelativeurl: Long, dwcombineflags: Int, pszresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: Long, dwcombineflags: Int, ppcombineduri: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetCompareUrl(pwzurl1: Long, pwzurl2: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetGetProtocolFlags(pwzurl: Long, pdwflags: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrl(pwszurl: Long, ppwszsecurl: Long, psuaction: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetGetSession(dwsessionmode: Int, ppiinternetsession: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabled(featureentry: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForIUri(featureentry: Int, dwflags: Int, piuri: Long, psecmgr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForUrl(featureentry: Int, dwflags: Int, szurl: Long, psecmgr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureZoneElevationEnabled(szfromurl: Long, sztourl: Long, psecmgr: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetParseIUri(piuri: Long, parseaction: Int, dwflags: Int, pwzresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetParseUrl(pwzurl: Long, parseaction: Int, dwflags: Int, pszresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetQueryInfo(pwzurl: Long, queryoptions: Int, dwqueryflags: Int, pvbuffer: Long, cbbuffer: Int, pcbbuffer: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CoInternetSetFeatureEnabled(featureentry: Int, dwflags: Int, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CompareSecurityIds(pbsecurityid1: Long, dwlen1: Int, pbsecurityid2: Long, dwlen2: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CopyBindInfo(pcbisrc: Long, pbidest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtx(reserved: Int, pbscb: Long, pefetc: Long, ppbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtxEx(pbc: Long, dwoptions: Int, pbscb: Long, penum: Long, ppbc: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CreateFormatEnumerator(cfmtetc: Int, rgfmtetc: Long, ppenumfmtetc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CreateURLMoniker(pmkctx: Long, szurl: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx(pmkctx: Long, szurl: Long, ppmk: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_FaultInIEFeature(hwnd: Long, pclassspec: Long, pquery: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_FindMediaType(rgsztypes: Long, rgcftypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_FindMediaTypeClass(pbc: Long, sztype: Long, pclsid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_FindMimeFromData(pbc: Long, pwzurl: Long, pbuffer: Long, cbsize: Int, pwzmimeproposed: Long, dwmimeflags: Int, ppwzmimeout: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_GetClassFileOrMime(pbc: Long, szfilename: Long, pbuffer: Long, cbsize: Int, szmime: Long, dwreserved: Int, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_GetClassURL(szurl: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_GetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_GetSoftwareUpdateInfo(szdistunit: Long, psdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_HlinkGoBack(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_HlinkGoForward(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_HlinkNavigateMoniker(punk: Long, pmktarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_HlinkNavigateString(punk: Long, sztarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: Long, sztargetframename: Long, punk: Long, pbc: Long, param5: Long, grfhlnf: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToString(sztarget: Long, szlocation: Long, sztargetframename: Long, punk: Long, pbc: Long, param5: Long, grfhlnf: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_IEGetUserPrivateNamespaceName(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_IEInstallScope(pdwscope: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_IsAsyncMoniker(pmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledA(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledW(pwszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_IsValidURL(pbc: Long, szurl: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_MkParseDisplayNameEx(pbc: Long, szdisplayname: Long, pcheaten: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_ObtainUserAgentString(dwoption: Int, pszuaout: Long, cbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_RegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_RegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_RegisterMediaTypeClass(pbc: Long, ctypes: Int, rgsztypes: Long, rgclsid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_RegisterMediaTypes(ctypes: Int, rgsztypes: Long, rgcftypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_ReleaseBindInfo(pbindinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_RevokeBindStatusCallback(pbc: Long, pbscb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_RevokeFormatEnumerator(pbc: Long, pefetc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_SetAccessForIEAppContainer(hobject: Long, ieobjecttype: Int, dwaccessmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_SetSoftwareUpdateAdvertisementState(szdistunit: Long, dwadstate: Int, dwadvertisedversionms: Int, dwadvertisedversionls: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileA(param0: Long, param1: Long, param2: Long, cchfilename: Int, param4: Int, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileW(param0: Long, param1: Long, param2: Long, cchfilename: Int, param4: Int, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLDownloadToFileA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLDownloadToFileW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLOpenStreamA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_URLOpenStreamW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_UrlMkGetSessionOption(dwoption: Int, pbuffer: Long, dwbufferlength: Int, pdwbufferlengthout: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_UrlMkSetSessionOption(dwoption: Int, pbuffer: Long, dwbufferlength: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_WriteHitLogging(lplogginginfo: Long): Int
}

public actual fun CoGetClassObjectFromURL(rclassid: Long, szcode: PCWSTR, dwfileversionms: UInt, dwfileversionls: UInt, sztype: PCWSTR, pbindctx: Long, dwclscontext: CLSCTX, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoGetClassObjectFromURL(rclassid, szcode, dwfileversionms.toInt(), dwfileversionls.toInt(), sztype, pbindctx, dwclscontext.toInt(), pvreserved, riid, ppv)

public actual fun CoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetCombineIUri(pbaseuri, prelativeuri, dwcombineflags.toInt(), ppcombineduri, dwreserved.toLong())

public actual fun CoInternetCombineUrl(pwzbaseurl: PCWSTR, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrl(pwzbaseurl, pwzrelativeurl, dwcombineflags.toInt(), pszresult, cchresult.toInt(), pcchresult, dwreserved.toInt())

public actual fun CoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrlEx(pbaseuri, pwzrelativeurl, dwcombineflags.toInt(), ppcombineduri, dwreserved.toLong())

public actual fun CoInternetCompareUrl(pwzurl1: PCWSTR, pwzurl2: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetCompareUrl(pwzurl1, pwzurl2, dwflags.toInt())

public actual fun CoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetCreateSecurityManager(psp, ppsm, dwreserved.toInt())

public actual fun CoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetCreateZoneManager(psp, ppzm, dwreserved.toInt())

public actual fun CoInternetGetProtocolFlags(pwzurl: PCWSTR, pdwflags: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetGetProtocolFlags(pwzurl, pdwflags, dwreserved.toInt())

public actual fun CoInternetGetSecurityUrl(pwszurl: PCWSTR, ppwszsecurl: Long, psuaction: PSUACTION, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrl(pwszurl, ppwszsecurl, psuaction, dwreserved.toInt())

public actual fun CoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: PSUACTION, dwreserved: ULong): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrlEx(puri, ppsecuri, psuaction, dwreserved.toLong())

public actual fun CoInternetGetSession(dwsessionmode: UInt, ppiinternetsession: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetGetSession(dwsessionmode.toInt(), ppiinternetsession, dwreserved.toInt())

public actual fun CoInternetIsFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabled(featureentry, dwflags.toInt())

public actual fun CoInternetIsFeatureEnabledForIUri(featureentry: INTERNETFEATURELIST, dwflags: UInt, piuri: Long, psecmgr: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), piuri, psecmgr)

public actual fun CoInternetIsFeatureEnabledForUrl(featureentry: INTERNETFEATURELIST, dwflags: UInt, szurl: PCWSTR, psecmgr: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), szurl, psecmgr)

public actual fun CoInternetIsFeatureZoneElevationEnabled(szfromurl: PCWSTR, sztourl: PCWSTR, psecmgr: Long, dwflags: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureZoneElevationEnabled(szfromurl, sztourl, psecmgr, dwflags.toInt())

public actual fun CoInternetParseIUri(piuri: Long, parseaction: PARSEACTION, dwflags: UInt, pwzresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: ULong): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetParseIUri(piuri, parseaction, dwflags.toInt(), pwzresult, cchresult.toInt(), pcchresult, dwreserved.toLong())

public actual fun CoInternetParseUrl(pwzurl: PCWSTR, parseaction: PARSEACTION, dwflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetParseUrl(pwzurl, parseaction, dwflags.toInt(), pszresult, cchresult.toInt(), pcchresult, dwreserved.toInt())

public actual fun CoInternetQueryInfo(pwzurl: PCWSTR, queryoptions: QUERYOPTION, dwqueryflags: UInt, pvbuffer: Long, cbbuffer: UInt, pcbbuffer: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetQueryInfo(pwzurl, queryoptions, dwqueryflags.toInt(), pvbuffer, cbbuffer.toInt(), pcbbuffer, dwreserved.toInt())

public actual fun CoInternetSetFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt, fenable: BOOL): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable)

public actual fun CompareSecurityIds(pbsecurityid1: Long, dwlen1: UInt, pbsecurityid2: Long, dwlen2: UInt, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CompareSecurityIds(pbsecurityid1, dwlen1.toInt(), pbsecurityid2, dwlen2.toInt(), dwreserved.toInt())

public actual fun CompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CompatFlagsFromClsid(pclsid, pdwcompatflags, pdwmiscstatusflags)

public actual fun CopyBindInfo(pcbisrc: Long, pbidest: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CopyBindInfo(pcbisrc, pbidest)

public actual fun CopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CopyStgMedium(pcstgmedsrc, pstgmeddest)

public actual fun CreateAsyncBindCtx(reserved: UInt, pbscb: Long, pefetc: Long, ppbc: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtx(reserved.toInt(), pbscb, pefetc, ppbc)

public actual fun CreateAsyncBindCtxEx(pbc: Long, dwoptions: UInt, pbscb: Long, penum: Long, ppbc: Long, reserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtxEx(pbc, dwoptions.toInt(), pbscb, penum, ppbc, reserved.toInt())

public actual fun CreateFormatEnumerator(cfmtetc: UInt, rgfmtetc: Long, ppenumfmtetc: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CreateFormatEnumerator(cfmtetc.toInt(), rgfmtetc, ppenumfmtetc)

public actual fun CreateURLMoniker(pmkctx: Long, szurl: PCWSTR, ppmk: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CreateURLMoniker(pmkctx, szurl, ppmk)

public actual fun CreateURLMonikerEx(pmkctx: Long, szurl: PCWSTR, ppmk: Long, dwflags: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx(pmkctx, szurl, ppmk, dwflags.toInt())

public actual fun CreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx2(pmkctx, puri, ppmk, dwflags.toInt())

public actual fun FaultInIEFeature(hwnd: HWND, pclassspec: Long, pquery: Long, dwflags: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_FaultInIEFeature(hwnd, pclassspec, pquery, dwflags.toInt())

public actual fun FindMediaType(rgsztypes: PCSTR, rgcftypes: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_FindMediaType(rgsztypes, rgcftypes)

public actual fun FindMediaTypeClass(pbc: Long, sztype: PCSTR, pclsid: Long, reserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_FindMediaTypeClass(pbc, sztype, pclsid, reserved.toInt())

public actual fun FindMimeFromData(pbc: Long, pwzurl: PCWSTR, pbuffer: Long, cbsize: UInt, pwzmimeproposed: PCWSTR, dwmimeflags: UInt, ppwzmimeout: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_FindMimeFromData(pbc, pwzurl, pbuffer, cbsize.toInt(), pwzmimeproposed, dwmimeflags.toInt(), ppwzmimeout, dwreserved.toInt())

public actual fun GetClassFileOrMime(pbc: Long, szfilename: PCWSTR, pbuffer: Long, cbsize: UInt, szmime: PCWSTR, dwreserved: UInt, pclsid: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_GetClassFileOrMime(pbc, szfilename, pbuffer, cbsize.toInt(), szmime, dwreserved.toInt(), pclsid)

public actual fun GetClassURL(szurl: PCWSTR, pclsid: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_GetClassURL(szurl, pclsid)

public actual fun GetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_GetComponentIDFromCLSSPEC(pclassspec, ppszcomponentid)

public actual fun GetSoftwareUpdateInfo(szdistunit: PCWSTR, psdi: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_GetSoftwareUpdateInfo(szdistunit, psdi)

public actual fun HlinkGoBack(punk: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_HlinkGoBack(punk)

public actual fun HlinkGoForward(punk: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_HlinkGoForward(punk)

public actual fun HlinkNavigateMoniker(punk: Long, pmktarget: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_HlinkNavigateMoniker(punk, pmktarget)

public actual fun HlinkNavigateString(punk: Long, sztarget: PCWSTR): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_HlinkNavigateString(punk, sztarget)

public actual fun HlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToMoniker(pmktarget, szlocation, sztargetframename, punk, pbc, param5, grfhlnf.toInt(), dwreserved.toInt())

public actual fun HlinkSimpleNavigateToString(sztarget: PCWSTR, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToString(sztarget, szlocation, sztargetframename, punk, pbc, param5, grfhlnf.toInt(), dwreserved.toInt())

public actual fun IEGetUserPrivateNamespaceName(): PWSTR =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_IEGetUserPrivateNamespaceName()

public actual fun IEInstallScope(pdwscope: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_IEInstallScope(pdwscope)

public actual fun IsAsyncMoniker(pmk: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_IsAsyncMoniker(pmk)

public actual fun IsLoggingEnabledA(pszurl: PCSTR): BOOL =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledA(pszurl)

public actual fun IsLoggingEnabledW(pwszurl: PCWSTR): BOOL =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledW(pwszurl)

public actual fun IsValidURL(pbc: Long, szurl: PCWSTR, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_IsValidURL(pbc, szurl, dwreserved.toInt())

public actual fun MkParseDisplayNameEx(pbc: Long, szdisplayname: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_MkParseDisplayNameEx(pbc, szdisplayname, pcheaten, ppmk)

public actual fun ObtainUserAgentString(dwoption: UInt, pszuaout: PSTR, cbsize: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_ObtainUserAgentString(dwoption.toInt(), pszuaout, cbsize)

public actual fun RegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_RegisterBindStatusCallback(pbc, pbscb, ppbscbprev, dwreserved.toInt())

public actual fun RegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_RegisterFormatEnumerator(pbc, pefetc, reserved.toInt())

public actual fun RegisterMediaTypeClass(pbc: Long, ctypes: UInt, rgsztypes: Long, rgclsid: Long, reserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_RegisterMediaTypeClass(pbc, ctypes.toInt(), rgsztypes, rgclsid, reserved.toInt())

public actual fun RegisterMediaTypes(ctypes: UInt, rgsztypes: Long, rgcftypes: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_RegisterMediaTypes(ctypes.toInt(), rgsztypes, rgcftypes)

public actual fun ReleaseBindInfo(pbindinfo: Long) {
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_ReleaseBindInfo(pbindinfo)
}

public actual fun RevokeBindStatusCallback(pbc: Long, pbscb: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_RevokeBindStatusCallback(pbc, pbscb)

public actual fun RevokeFormatEnumerator(pbc: Long, pefetc: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_RevokeFormatEnumerator(pbc, pefetc)

public actual fun SetAccessForIEAppContainer(hobject: HANDLE, ieobjecttype: IEObjectType, dwaccessmask: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_SetAccessForIEAppContainer(hobject, ieobjecttype, dwaccessmask.toInt())

public actual fun SetSoftwareUpdateAdvertisementState(szdistunit: PCWSTR, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_SetSoftwareUpdateAdvertisementState(szdistunit, dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt())

public actual fun URLDownloadToCacheFileA(param0: Long, param1: PCSTR, param2: PSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileA(param0, param1, param2, cchfilename.toInt(), param4.toInt(), param5)

public actual fun URLDownloadToCacheFileW(param0: Long, param1: PCWSTR, param2: PWSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileW(param0, param1, param2, cchfilename.toInt(), param4.toInt(), param5)

public actual fun URLDownloadToFileA(param0: Long, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLDownloadToFileA(param0, param1, param2, param3.toInt(), param4)

public actual fun URLDownloadToFileW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLDownloadToFileW(param0, param1, param2, param3.toInt(), param4)

public actual fun URLOpenBlockingStreamA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamA(param0, param1, param2, param3.toInt(), param4)

public actual fun URLOpenBlockingStreamW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamW(param0, param1, param2, param3.toInt(), param4)

public actual fun URLOpenPullStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamA(param0, param1, param2.toInt(), param3)

public actual fun URLOpenPullStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamW(param0, param1, param2.toInt(), param3)

public actual fun URLOpenStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLOpenStreamA(param0, param1, param2.toInt(), param3)

public actual fun URLOpenStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_URLOpenStreamW(param0, param1, param2.toInt(), param3)

public actual fun UrlMkGetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, pdwbufferlengthout: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_UrlMkGetSessionOption(dwoption.toInt(), pbuffer, dwbufferlength.toInt(), pdwbufferlengthout, dwreserved.toInt())

public actual fun UrlMkSetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_UrlMkSetSessionOption(dwoption.toInt(), pbuffer, dwbufferlength.toInt(), dwreserved.toInt())

public actual fun WriteHitLogging(lplogginginfo: Long): BOOL =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_WriteHitLogging(lplogginginfo)
