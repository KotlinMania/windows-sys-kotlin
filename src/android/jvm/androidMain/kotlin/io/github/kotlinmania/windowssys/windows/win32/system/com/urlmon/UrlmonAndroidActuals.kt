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

private object WindowsWin32SystemComUrlmonJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(rclassid: Long, szcode: Long, dwfileversionms: Int, dwfileversionls: Int, sztype: Long, pbindctx: Long, dwclscontext: Int, pvreserved: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: Int, ppcombineduri: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(pwzbaseurl: Long, pwzrelativeurl: Long, dwcombineflags: Int, pszresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: Long, dwcombineflags: Int, ppcombineduri: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(pwzurl1: Long, pwzurl2: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(pwzurl: Long, pdwflags: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(pwszurl: Long, ppwszsecurl: Long, psuaction: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: Int, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetGetSession(dwsessionmode: Int, ppiinternetsession: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(featureentry: Int, dwflags: Int, piuri: Long, psecmgr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(featureentry: Int, dwflags: Int, szurl: Long, psecmgr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(szfromurl: Long, sztourl: Long, psecmgr: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(piuri: Long, parseaction: Int, dwflags: Int, pwzresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(pwzurl: Long, parseaction: Int, dwflags: Int, pszresult: Long, cchresult: Int, pcchresult: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(pwzurl: Long, queryoptions: Int, dwqueryflags: Int, pvbuffer: Long, cbbuffer: Int, pcbbuffer: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry: Int, dwflags: Int, fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCompareSecurityIds(pbsecurityid1: Long, dwlen1: Int, pbsecurityid2: Long, dwlen2: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCopyBindInfo(pcbisrc: Long, pbidest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(reserved: Int, pbscb: Long, pefetc: Long, ppbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(pbc: Long, dwoptions: Int, pbscb: Long, penum: Long, ppbc: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(cfmtetc: Int, rgfmtetc: Long, ppenumfmtetc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCreateURLMoniker(pmkctx: Long, szurl: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(pmkctx: Long, szurl: Long, ppmk: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonFaultInIEFeature(hwnd: Long, pclassspec: Long, pquery: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonFindMediaType(rgsztypes: Long, rgcftypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(pbc: Long, sztype: Long, pclsid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonFindMimeFromData(pbc: Long, pwzurl: Long, pbuffer: Long, cbsize: Int, pwzmimeproposed: Long, dwmimeflags: Int, ppwzmimeout: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(pbc: Long, szfilename: Long, pbuffer: Long, cbsize: Int, szmime: Long, dwreserved: Int, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonGetClassURL(szurl: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(szdistunit: Long, psdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonHlinkGoBack(punk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonHlinkGoForward(punk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(punk: Long, pmktarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonHlinkNavigateString(punk: Long, sztarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: Long, sztargetframename: Long, punk: Long, pbc: Long, param5: Long, grfhlnf: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(sztarget: Long, szlocation: Long, sztargetframename: Long, punk: Long, pbc: Long, param5: Long, grfhlnf: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonIEInstallScope(pdwscope: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(pmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(pszurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(pwszurl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonIsValidURL(pbc: Long, szurl: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(pbc: Long, szdisplayname: Long, pcheaten: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonObtainUserAgentString(dwoption: Int, pszuaout: Long, cbsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(pbc: Long, ctypes: Int, rgsztypes: Long, rgclsid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(ctypes: Int, rgsztypes: Long, rgcftypes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonReleaseBindInfo(pbindinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(pbc: Long, pbscb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(pbc: Long, pefetc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(hobject: Long, ieobjecttype: Int, dwaccessmask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(szdistunit: Long, dwadstate: Int, dwadvertisedversionms: Int, dwadvertisedversionls: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(param0: Long, param1: Long, param2: Long, cchfilename: Int, param4: Int, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(param0: Long, param1: Long, param2: Long, cchfilename: Int, param4: Int, param5: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(param0: Long, param1: Long, param2: Long, param3: Int, param4: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLOpenStreamA(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonURLOpenStreamW(param0: Long, param1: Long, param2: Int, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(dwoption: Int, pbuffer: Long, dwbufferlength: Int, pdwbufferlengthout: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(dwoption: Int, pbuffer: Long, dwbufferlength: Int, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComUrlmonWriteHitLogging(lplogginginfo: Long): Int
}

public actual fun coGetClassObjectFromURL(rclassid: ConstPtr, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr, dwclscontext: Clsctx, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(rclassid.rawAddress, szcode.rawAddress, dwfileversionms.toInt(), dwfileversionls.toInt(), sztype.rawAddress, pbindctx.rawAddress, dwclscontext.toInt(), pvreserved.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun coInternetCombineIUri(pbaseuri: MutPtr, prelativeuri: MutPtr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(pbaseuri.rawAddress, prelativeuri.rawAddress, dwcombineflags.toInt(), ppcombineduri.rawAddress, dwreserved.toLong())

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(pwzbaseurl.rawAddress, pwzrelativeurl.rawAddress, dwcombineflags.toInt(), pszresult.rawAddress, cchresult.toInt(), pcchresult.rawAddress, dwreserved.toInt())

public actual fun coInternetCombineUrlEx(pbaseuri: MutPtr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(pbaseuri.rawAddress, pwzrelativeurl.rawAddress, dwcombineflags.toInt(), ppcombineduri.rawAddress, dwreserved.toLong())

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(pwzurl1.rawAddress, pwzurl2.rawAddress, dwflags.toInt())

public actual fun coInternetCreateSecurityManager(psp: MutPtr, ppsm: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(psp.rawAddress, ppsm.rawAddress, dwreserved.toInt())

public actual fun coInternetCreateZoneManager(psp: MutPtr, ppzm: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(psp.rawAddress, ppzm.rawAddress, dwreserved.toInt())

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(pwzurl.rawAddress, pdwflags.rawAddress, dwreserved.toInt())

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr, psuaction: Psuaction, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(pwszurl.rawAddress, ppwszsecurl.rawAddress, psuaction, dwreserved.toInt())

public actual fun coInternetGetSecurityUrlEx(puri: MutPtr, ppsecuri: MutPtr, psuaction: Psuaction, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(puri.rawAddress, ppsecuri.rawAddress, psuaction, dwreserved.toLong())

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetGetSession(dwsessionmode.toInt(), ppiinternetsession.rawAddress, dwreserved.toInt())

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry, dwflags.toInt())

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr, psecmgr: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(featureentry, dwflags.toInt(), piuri.rawAddress, psecmgr.rawAddress)

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(featureentry, dwflags.toInt(), szurl.rawAddress, psecmgr.rawAddress)

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(szfromurl.rawAddress, sztourl.rawAddress, psecmgr.rawAddress, dwflags.toInt())

public actual fun coInternetParseIUri(piuri: MutPtr, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: ULong): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(piuri.rawAddress, parseaction, dwflags.toInt(), pwzresult.rawAddress, cchresult.toInt(), pcchresult.rawAddress, dwreserved.toLong())

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(pwzurl.rawAddress, parseaction, dwflags.toInt(), pszresult.rawAddress, cchresult.toInt(), pcchresult.rawAddress, dwreserved.toInt())

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr, cbbuffer: UInt, pcbbuffer: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(pwzurl.rawAddress, queryoptions, dwqueryflags.toInt(), pvbuffer.rawAddress, cbbuffer.toInt(), pcbbuffer.rawAddress, dwreserved.toInt())

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable)

public actual fun compareSecurityIds(pbsecurityid1: ConstPtr, dwlen1: UInt, pbsecurityid2: ConstPtr, dwlen2: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCompareSecurityIds(pbsecurityid1.rawAddress, dwlen1.toInt(), pbsecurityid2.rawAddress, dwlen2.toInt(), dwreserved.toInt())

public actual fun compatFlagsFromClsid(pclsid: ConstPtr, pdwcompatflags: MutPtr, pdwmiscstatusflags: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(pclsid.rawAddress, pdwcompatflags.rawAddress, pdwmiscstatusflags.rawAddress)

public actual fun copyBindInfo(pcbisrc: ConstPtr, pbidest: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCopyBindInfo(pcbisrc.rawAddress, pbidest.rawAddress)

public actual fun copyStgMedium(pcstgmedsrc: ConstPtr, pstgmeddest: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCopyStgMedium(pcstgmedsrc.rawAddress, pstgmeddest.rawAddress)

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr, pefetc: MutPtr, ppbc: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(reserved.toInt(), pbscb.rawAddress, pefetc.rawAddress, ppbc.rawAddress)

public actual fun createAsyncBindCtxEx(pbc: MutPtr, dwoptions: UInt, pbscb: MutPtr, penum: MutPtr, ppbc: MutPtr, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(pbc.rawAddress, dwoptions.toInt(), pbscb.rawAddress, penum.rawAddress, ppbc.rawAddress, reserved.toInt())

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr, ppenumfmtetc: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(cfmtetc.toInt(), rgfmtetc.rawAddress, ppenumfmtetc.rawAddress)

public actual fun createURLMoniker(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCreateURLMoniker(pmkctx.rawAddress, szurl.rawAddress, ppmk.rawAddress)

public actual fun createURLMonikerEx(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(pmkctx.rawAddress, szurl.rawAddress, ppmk.rawAddress, dwflags.toInt())

public actual fun createURLMonikerEx2(pmkctx: MutPtr, puri: MutPtr, ppmk: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(pmkctx.rawAddress, puri.rawAddress, ppmk.rawAddress, dwflags.toInt())

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr, pquery: MutPtr, dwflags: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonFaultInIEFeature(hwnd.rawAddress, pclassspec.rawAddress, pquery.rawAddress, dwflags.toInt())

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonFindMediaType(rgsztypes.rawAddress, rgcftypes.rawAddress)

public actual fun findMediaTypeClass(pbc: MutPtr, sztype: Pcstr, pclsid: MutPtr, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(pbc.rawAddress, sztype.rawAddress, pclsid.rawAddress, reserved.toInt())

public actual fun findMimeFromData(pbc: MutPtr, pwzurl: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonFindMimeFromData(pbc.rawAddress, pwzurl.rawAddress, pbuffer.rawAddress, cbsize.toInt(), pwzmimeproposed.rawAddress, dwmimeflags.toInt(), ppwzmimeout.rawAddress, dwreserved.toInt())

public actual fun getClassFileOrMime(pbc: MutPtr, szfilename: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(pbc.rawAddress, szfilename.rawAddress, pbuffer.rawAddress, cbsize.toInt(), szmime.rawAddress, dwreserved.toInt(), pclsid.rawAddress)

public actual fun getClassURL(szurl: Pcwstr, pclsid: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonGetClassURL(szurl.rawAddress, pclsid.rawAddress)

public actual fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr, ppszcomponentid: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(pclassspec.rawAddress, ppszcomponentid.rawAddress)

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(szdistunit.rawAddress, psdi.rawAddress)

public actual fun hlinkGoBack(punk: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonHlinkGoBack(punk.rawAddress)

public actual fun hlinkGoForward(punk: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonHlinkGoForward(punk.rawAddress)

public actual fun hlinkNavigateMoniker(punk: MutPtr, pmktarget: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(punk.rawAddress, pmktarget.rawAddress)

public actual fun hlinkNavigateString(punk: MutPtr, sztarget: Pcwstr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonHlinkNavigateString(punk.rawAddress, sztarget.rawAddress)

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(pmktarget.rawAddress, szlocation.rawAddress, sztargetframename.rawAddress, punk.rawAddress, pbc.rawAddress, param5.rawAddress, grfhlnf.toInt(), dwreserved.toInt())

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(sztarget.rawAddress, szlocation.rawAddress, sztargetframename.rawAddress, punk.rawAddress, pbc.rawAddress, param5.rawAddress, grfhlnf.toInt(), dwreserved.toInt())

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    MutPtr(WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName())

public actual fun iEInstallScope(pdwscope: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonIEInstallScope(pdwscope.rawAddress)

public actual fun isAsyncMoniker(pmk: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(pmk.rawAddress)

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(pszurl.rawAddress)

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(pwszurl.rawAddress)

public actual fun isValidURL(pbc: MutPtr, szurl: Pcwstr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonIsValidURL(pbc.rawAddress, szurl.rawAddress, dwreserved.toInt())

public actual fun mkParseDisplayNameEx(pbc: MutPtr, szdisplayname: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(pbc.rawAddress, szdisplayname.rawAddress, pcheaten.rawAddress, ppmk.rawAddress)

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonObtainUserAgentString(dwoption.toInt(), pszuaout.rawAddress, cbsize.rawAddress)

public actual fun registerBindStatusCallback(pbc: MutPtr, pbscb: MutPtr, ppbscbprev: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(pbc.rawAddress, pbscb.rawAddress, ppbscbprev.rawAddress, dwreserved.toInt())

public actual fun registerFormatEnumerator(pbc: MutPtr, pefetc: MutPtr, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(pbc.rawAddress, pefetc.rawAddress, reserved.toInt())

public actual fun registerMediaTypeClass(pbc: MutPtr, ctypes: UInt, rgsztypes: ConstPtr, rgclsid: ConstPtr, reserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(pbc.rawAddress, ctypes.toInt(), rgsztypes.rawAddress, rgclsid.rawAddress, reserved.toInt())

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr, rgcftypes: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(ctypes.toInt(), rgsztypes.rawAddress, rgcftypes.rawAddress)

public actual fun releaseBindInfo(pbindinfo: MutPtr) {
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonReleaseBindInfo(pbindinfo.rawAddress)
}

public actual fun revokeBindStatusCallback(pbc: MutPtr, pbscb: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(pbc.rawAddress, pbscb.rawAddress)

public actual fun revokeFormatEnumerator(pbc: MutPtr, pefetc: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(pbc.rawAddress, pefetc.rawAddress)

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(hobject.rawAddress, ieobjecttype, dwaccessmask.toInt())

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(szdistunit.rawAddress, dwadstate.toInt(), dwadvertisedversionms.toInt(), dwadvertisedversionls.toInt())

public actual fun uRLDownloadToCacheFileA(param0: MutPtr, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(param0.rawAddress, param1.rawAddress, param2.rawAddress, cchfilename.toInt(), param4.toInt(), param5.rawAddress)

public actual fun uRLDownloadToCacheFileW(param0: MutPtr, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(param0.rawAddress, param1.rawAddress, param2.rawAddress, cchfilename.toInt(), param4.toInt(), param5.rawAddress)

public actual fun uRLDownloadToFileA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress)

public actual fun uRLDownloadToFileW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress)

public actual fun uRLOpenBlockingStreamA(param0: MutPtr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress)

public actual fun uRLOpenBlockingStreamW(param0: MutPtr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(param0.rawAddress, param1.rawAddress, param2.rawAddress, param3.toInt(), param4.rawAddress)

public actual fun uRLOpenPullStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun uRLOpenPullStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun uRLOpenStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLOpenStreamA(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun uRLOpenStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonURLOpenStreamW(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.rawAddress)

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr, dwbufferlength: UInt, pdwbufferlengthout: MutPtr, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(dwoption.toInt(), pbuffer.rawAddress, dwbufferlength.toInt(), pdwbufferlengthout.rawAddress, dwreserved.toInt())

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(dwoption.toInt(), pbuffer.rawAddress, dwbufferlength.toInt(), dwreserved.toInt())

public actual fun writeHitLogging(lplogginginfo: ConstPtr): Bool =
    WindowsWin32SystemComUrlmonJniBridge.windowssysWindowsWin32SystemComUrlmonWriteHitLogging(lplogginginfo.rawAddress)
