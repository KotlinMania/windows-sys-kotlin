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

private object WindowsWin32SystemComUrlmonJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL(rclassid: Long, szcode: Long, dwfileversionms: Int, dwfileversionls: Int, sztype: Long, pbindctx: Long, dwclscontext: Int, pvreserved: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: Int, ppcombineduri: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl(pwzbaseurl: Long, pwzrelativeurl: Long, dwcombineflags: Int, pszresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: Long, dwcombineflags: Int, ppcombineduri: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl(pwzurl1: Long, pwzurl2: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags(pwzurl: Long, pdwflags: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl(pwszurl: Long, ppwszsecurl: Long, psuaction: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetGetSession(dwsessionmode: Int, ppiinternetsession: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(featureentry: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(featureentry: Int, dwflags: Int, piuri: Long, psecmgr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(featureentry: Int, dwflags: Int, szurl: Long, psecmgr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled(szfromurl: Long, sztourl: Long, psecmgr: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetParseIUri(piuri: Long, parseaction: Int, dwflags: Int, pwzresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetParseUrl(pwzurl: Long, parseaction: Int, dwflags: Int, pszresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo(pwzurl: Long, queryoptions: Int, dwqueryflags: Int, pvbuffer: Long, cbbuffer: Int, pcbbuffer: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(featureentry: Int, dwflags: Int, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_compareSecurityIds(pbsecurityid1: Long, dwlen1: Int, pbsecurityid2: Long, dwlen2: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_copyBindInfo(pcbisrc: Long, pbidest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_copyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(reserved: Int, pbscb: Long, pefetc: Long, ppbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx(pbc: Long, dwoptions: Int, pbscb: Long, penum: Long, ppbc: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(cfmtetc: Int, rgfmtetc: Long, ppenumfmtetc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_createURLMoniker(pmkctx: Long, szurl: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_createURLMonikerEx(pmkctx: Long, szurl: Long, ppmk: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_faultInIEFeature(hwnd: Long, pclassspec: Long, pquery: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_findMediaType(rgsztypes: Long, rgcftypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_findMediaTypeClass(pbc: Long, sztype: Long, pclsid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_findMimeFromData(pbc: Long, pwzurl: Long, pbuffer: Long, cbsize: Int, pwzmimeproposed: Long, dwmimeflags: Int, ppwzmimeout: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_getClassFileOrMime(pbc: Long, szfilename: Long, pbuffer: Long, cbsize: Int, szmime: Long, dwreserved: Int, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_getClassURL(szurl: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo(szdistunit: Long, psdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_hlinkGoBack(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_hlinkGoForward(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker(punk: Long, pmktarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_hlinkNavigateString(punk: Long, sztarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: Long, sztargetframename: Long, punk: Long, pbc: Long, param5: Long, grfhlnf: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString(sztarget: Long, szlocation: Long, sztargetframename: Long, punk: Long, pbc: Long, param5: Long, grfhlnf: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_iEInstallScope(pdwscope: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_isAsyncMoniker(pmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA(pszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW(pwszurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_isValidURL(pbc: Long, szurl: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx(pbc: Long, szdisplayname: Long, pcheaten: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(dwoption: Int, pszuaout: Long, cbsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator(pbc: Long, pefetc: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass(pbc: Long, ctypes: Int, rgsztypes: Long, rgclsid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_registerMediaTypes(ctypes: Int, rgsztypes: Long, rgcftypes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_releaseBindInfo(pbindinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback(pbc: Long, pbscb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator(pbc: Long, pefetc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer(hobject: Long, ieobjecttype: Int, dwaccessmask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState(szdistunit: Long, dwadstate: Int, dwadvertisedversionms: Int, dwadvertisedversionls: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA(param0: Long, param1: Long, param2: Long, cchfilename: Int, param4: Int, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW(param0: Long, param1: Long, param2: Long, cchfilename: Int, param4: Int, param5: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(dwoption: Int, pbuffer: Long, dwbufferlength: Int, pdwbufferlengthout: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(dwoption: Int, pbuffer: Long, dwbufferlength: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_urlmon_writeHitLogging(lplogginginfo: Long): Int
}

public actual fun coGetClassObjectFromURL(rclassid: COpaquePointer?, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: COpaquePointer?, dwclscontext: Clsctx, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL((rclassid?.value ?: 0L), (szcode?.value ?: 0L), dwfileversionms.toInt(), dwfileversionls.toInt(), (sztype?.value ?: 0L), (pbindctx?.value ?: 0L), dwclscontext.toInt(), (pvreserved?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun coInternetCombineIUri(pbaseuri: COpaquePointer?, prelativeuri: COpaquePointer?, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri((pbaseuri?.value ?: 0L), (prelativeuri?.value ?: 0L), dwcombineflags.toInt(), (ppcombineduri?.value ?: 0L), dwreserved.toLong())

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl((pwzbaseurl?.value ?: 0L), (pwzrelativeurl?.value ?: 0L), dwcombineflags.toInt(), (pszresult?.value ?: 0L), cchresult.toInt(), (pcchresult?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetCombineUrlEx(pbaseuri: COpaquePointer?, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx((pbaseuri?.value ?: 0L), (pwzrelativeurl?.value ?: 0L), dwcombineflags.toInt(), (ppcombineduri?.value ?: 0L), dwreserved.toLong())

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl((pwzurl1?.value ?: 0L), (pwzurl2?.value ?: 0L), dwflags.toInt())

public actual fun coInternetCreateSecurityManager(psp: COpaquePointer?, ppsm: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager((psp?.value ?: 0L), (ppsm?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetCreateZoneManager(psp: COpaquePointer?, ppzm: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager((psp?.value ?: 0L), (ppzm?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags((pwzurl?.value ?: 0L), (pdwflags?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: COpaquePointer?, psuaction: Psuaction, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl((pwszurl?.value ?: 0L), (ppwszsecurl?.value ?: 0L), psuaction, dwreserved.toInt())

public actual fun coInternetGetSecurityUrlEx(puri: COpaquePointer?, ppsecuri: COpaquePointer?, psuaction: Psuaction, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx((puri?.value ?: 0L), (ppsecuri?.value ?: 0L), psuaction, dwreserved.toLong())

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetGetSession(dwsessionmode.toInt(), (ppiinternetsession?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(featureentry, dwflags.toInt())

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: COpaquePointer?, psecmgr: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), (piuri?.value ?: 0L), (psecmgr?.value ?: 0L))

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), (szurl?.value ?: 0L), (psecmgr?.value ?: 0L))

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled((szfromurl?.value ?: 0L), (sztourl?.value ?: 0L), (psecmgr?.value ?: 0L), dwflags.toInt())

public actual fun coInternetParseIUri(piuri: COpaquePointer?, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetParseIUri((piuri?.value ?: 0L), parseaction, dwflags.toInt(), (pwzresult?.value ?: 0L), cchresult.toInt(), (pcchresult?.value ?: 0L), dwreserved.toLong())

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetParseUrl((pwzurl?.value ?: 0L), parseaction, dwflags.toInt(), (pszresult?.value ?: 0L), cchresult.toInt(), (pcchresult?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbbuffer: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo((pwzurl?.value ?: 0L), queryoptions, dwqueryflags.toInt(), (pvbuffer?.value ?: 0L), cbbuffer.toInt(), (pcbbuffer?.value ?: 0L), dwreserved.toInt())

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable)

public actual fun compareSecurityIds(pbsecurityid1: COpaquePointer?, dwlen1: UInt, pbsecurityid2: COpaquePointer?, dwlen2: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_compareSecurityIds((pbsecurityid1?.value ?: 0L), dwlen1.toInt(), (pbsecurityid2?.value ?: 0L), dwlen2.toInt(), dwreserved.toInt())

public actual fun compatFlagsFromClsid(pclsid: COpaquePointer?, pdwcompatflags: COpaquePointer?, pdwmiscstatusflags: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid((pclsid?.value ?: 0L), (pdwcompatflags?.value ?: 0L), (pdwmiscstatusflags?.value ?: 0L))

public actual fun copyBindInfo(pcbisrc: COpaquePointer?, pbidest: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_copyBindInfo((pcbisrc?.value ?: 0L), (pbidest?.value ?: 0L))

public actual fun copyStgMedium(pcstgmedsrc: COpaquePointer?, pstgmeddest: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_copyStgMedium((pcstgmedsrc?.value ?: 0L), (pstgmeddest?.value ?: 0L))

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: COpaquePointer?, pefetc: COpaquePointer?, ppbc: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(reserved.toInt(), (pbscb?.value ?: 0L), (pefetc?.value ?: 0L), (ppbc?.value ?: 0L))

public actual fun createAsyncBindCtxEx(pbc: COpaquePointer?, dwoptions: UInt, pbscb: COpaquePointer?, penum: COpaquePointer?, ppbc: COpaquePointer?, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx((pbc?.value ?: 0L), dwoptions.toInt(), (pbscb?.value ?: 0L), (penum?.value ?: 0L), (ppbc?.value ?: 0L), reserved.toInt())

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: COpaquePointer?, ppenumfmtetc: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(cfmtetc.toInt(), (rgfmtetc?.value ?: 0L), (ppenumfmtetc?.value ?: 0L))

public actual fun createURLMoniker(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_createURLMoniker((pmkctx?.value ?: 0L), (szurl?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun createURLMonikerEx(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx((pmkctx?.value ?: 0L), (szurl?.value ?: 0L), (ppmk?.value ?: 0L), dwflags.toInt())

public actual fun createURLMonikerEx2(pmkctx: COpaquePointer?, puri: COpaquePointer?, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2((pmkctx?.value ?: 0L), (puri?.value ?: 0L), (ppmk?.value ?: 0L), dwflags.toInt())

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: COpaquePointer?, pquery: COpaquePointer?, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_faultInIEFeature((hwnd?.value ?: 0L), (pclassspec?.value ?: 0L), (pquery?.value ?: 0L), dwflags.toInt())

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_findMediaType((rgsztypes?.value ?: 0L), (rgcftypes?.value ?: 0L))

public actual fun findMediaTypeClass(pbc: COpaquePointer?, sztype: Pcstr, pclsid: COpaquePointer?, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_findMediaTypeClass((pbc?.value ?: 0L), (sztype?.value ?: 0L), (pclsid?.value ?: 0L), reserved.toInt())

public actual fun findMimeFromData(pbc: COpaquePointer?, pwzurl: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_findMimeFromData((pbc?.value ?: 0L), (pwzurl?.value ?: 0L), (pbuffer?.value ?: 0L), cbsize.toInt(), (pwzmimeproposed?.value ?: 0L), dwmimeflags.toInt(), (ppwzmimeout?.value ?: 0L), dwreserved.toInt())

public actual fun getClassFileOrMime(pbc: COpaquePointer?, szfilename: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_getClassFileOrMime((pbc?.value ?: 0L), (szfilename?.value ?: 0L), (pbuffer?.value ?: 0L), cbsize.toInt(), (szmime?.value ?: 0L), dwreserved.toInt(), (pclsid?.value ?: 0L))

public actual fun getClassURL(szurl: Pcwstr, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_getClassURL((szurl?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun getComponentIDFromCLSSPEC(pclassspec: COpaquePointer?, ppszcomponentid: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC((pclassspec?.value ?: 0L), (ppszcomponentid?.value ?: 0L))

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo((szdistunit?.value ?: 0L), (psdi?.value ?: 0L))

public actual fun hlinkGoBack(punk: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_hlinkGoBack((punk?.value ?: 0L))

public actual fun hlinkGoForward(punk: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_hlinkGoForward((punk?.value ?: 0L))

public actual fun hlinkNavigateMoniker(punk: COpaquePointer?, pmktarget: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker((punk?.value ?: 0L), (pmktarget?.value ?: 0L))

public actual fun hlinkNavigateString(punk: COpaquePointer?, sztarget: Pcwstr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_hlinkNavigateString((punk?.value ?: 0L), (sztarget?.value ?: 0L))

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: COpaquePointer?, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker((pmktarget?.value ?: 0L), (szlocation?.value ?: 0L), (sztargetframename?.value ?: 0L), (punk?.value ?: 0L), (pbc?.value ?: 0L), (param5?.value ?: 0L), grfhlnf.toInt(), dwreserved.toInt())

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString((sztarget?.value ?: 0L), (szlocation?.value ?: 0L), (sztargetframename?.value ?: 0L), (punk?.value ?: 0L), (pbc?.value ?: 0L), (param5?.value ?: 0L), grfhlnf.toInt(), dwreserved.toInt())

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iEInstallScope(pdwscope: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_iEInstallScope((pdwscope?.value ?: 0L))

public actual fun isAsyncMoniker(pmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_isAsyncMoniker((pmk?.value ?: 0L))

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA((pszurl?.value ?: 0L))

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW((pwszurl?.value ?: 0L))

public actual fun isValidURL(pbc: COpaquePointer?, szurl: Pcwstr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_isValidURL((pbc?.value ?: 0L), (szurl?.value ?: 0L), dwreserved.toInt())

public actual fun mkParseDisplayNameEx(pbc: COpaquePointer?, szdisplayname: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx((pbc?.value ?: 0L), (szdisplayname?.value ?: 0L), (pcheaten?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(dwoption.toInt(), (pszuaout?.value ?: 0L), (cbsize?.value ?: 0L))

public actual fun registerBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?, ppbscbprev: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback((pbc?.value ?: 0L), (pbscb?.value ?: 0L), (ppbscbprev?.value ?: 0L), dwreserved.toInt())

public actual fun registerFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator((pbc?.value ?: 0L), (pefetc?.value ?: 0L), reserved.toInt())

public actual fun registerMediaTypeClass(pbc: COpaquePointer?, ctypes: UInt, rgsztypes: COpaquePointer?, rgclsid: COpaquePointer?, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass((pbc?.value ?: 0L), ctypes.toInt(), (rgsztypes?.value ?: 0L), (rgclsid?.value ?: 0L), reserved.toInt())

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: COpaquePointer?, rgcftypes: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_registerMediaTypes(ctypes.toInt(), (rgsztypes?.value ?: 0L), (rgcftypes?.value ?: 0L))

public actual fun releaseBindInfo(pbindinfo: COpaquePointer?) {
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_releaseBindInfo((pbindinfo?.value ?: 0L))
}

public actual fun revokeBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback((pbc?.value ?: 0L), (pbscb?.value ?: 0L))

public actual fun revokeFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator((pbc?.value ?: 0L), (pefetc?.value ?: 0L))

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer((hobject?.value ?: 0L), ieobjecttype, dwaccessmask.toInt())

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState((szdistunit?.value ?: 0L), dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt())

public actual fun uRLDownloadToCacheFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), cchfilename.toInt(), param4.toInt(), (param5?.value ?: 0L))

public actual fun uRLDownloadToCacheFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), cchfilename.toInt(), param4.toInt(), (param5?.value ?: 0L))

public actual fun uRLDownloadToFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: UInt, param4: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L))

public actual fun uRLDownloadToFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L))

public actual fun uRLOpenBlockingStreamA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L))

public actual fun uRLOpenBlockingStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW((param0?.value ?: 0L), (param1?.value ?: 0L), (param2?.value ?: 0L), param3.toInt(), (param4?.value ?: 0L))

public actual fun uRLOpenPullStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun uRLOpenPullStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun uRLOpenStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun uRLOpenStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), (param3?.value ?: 0L))

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbufferlengthout: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(dwoption.toInt(), (pbuffer?.value ?: 0L), dwbufferlength.toInt(), (pdwbufferlengthout?.value ?: 0L), dwreserved.toInt())

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(dwoption.toInt(), (pbuffer?.value ?: 0L), dwbufferlength.toInt(), dwreserved.toInt())

public actual fun writeHitLogging(lplogginginfo: COpaquePointer?): Bool =
    WindowsWin32SystemComUrlmonJniBridge.windowssys_windows_win32_system_com_urlmon_writeHitLogging((lplogginginfo?.value ?: 0L))
