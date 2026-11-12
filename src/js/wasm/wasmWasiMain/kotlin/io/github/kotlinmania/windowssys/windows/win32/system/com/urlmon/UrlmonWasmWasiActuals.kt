@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun coGetClassObjectFromURL(rclassid: ConstPtr, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr, dwclscontext: Clsctx, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL")

public actual fun coInternetCombineIUri(pbaseuri: MutPtr, prelativeuri: MutPtr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri")

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl")

public actual fun coInternetCombineUrlEx(pbaseuri: MutPtr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx")

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl")

public actual fun coInternetCreateSecurityManager(psp: MutPtr, ppsm: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager")

public actual fun coInternetCreateZoneManager(psp: MutPtr, ppzm: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager")

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags")

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr, psuaction: Psuaction, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl")

public actual fun coInternetGetSecurityUrlEx(puri: MutPtr, ppsecuri: MutPtr, psuaction: Psuaction, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx")

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetSession")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled")
private external fun wasiWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry: Int, dwflags: Int): Int

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry, dwflags.toInt())

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr, psecmgr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri")

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl")

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled")

public actual fun coInternetParseIUri(piuri: MutPtr, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri")

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl")

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr, cbbuffer: UInt, pcbbuffer: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled")
private external fun wasiWindowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry: Int, dwflags: Int, fenable: Int): Int

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    wasiWindowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable)

public actual fun compareSecurityIds(pbsecurityid1: ConstPtr, dwlen1: UInt, pbsecurityid2: ConstPtr, dwlen2: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCompareSecurityIds")

public actual fun compatFlagsFromClsid(pclsid: ConstPtr, pdwcompatflags: MutPtr, pdwmiscstatusflags: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid")

public actual fun copyBindInfo(pcbisrc: ConstPtr, pbidest: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCopyBindInfo")

public actual fun copyStgMedium(pcstgmedsrc: ConstPtr, pstgmeddest: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCopyStgMedium")

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr, pefetc: MutPtr, ppbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx")

public actual fun createAsyncBindCtxEx(pbc: MutPtr, dwoptions: UInt, pbscb: MutPtr, penum: MutPtr, ppbc: MutPtr, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx")

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr, ppenumfmtetc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator")

public actual fun createURLMoniker(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateURLMoniker")

public actual fun createURLMonikerEx(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx")

public actual fun createURLMonikerEx2(pmkctx: MutPtr, puri: MutPtr, ppmk: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2")

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr, pquery: MutPtr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFaultInIEFeature")

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFindMediaType")

public actual fun findMediaTypeClass(pbc: MutPtr, sztype: Pcstr, pclsid: MutPtr, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass")

public actual fun findMimeFromData(pbc: MutPtr, pwzurl: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFindMimeFromData")

public actual fun getClassFileOrMime(pbc: MutPtr, szfilename: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime")

public actual fun getClassURL(szurl: Pcwstr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetClassURL")

public actual fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr, ppszcomponentid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC")

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo")

public actual fun hlinkGoBack(punk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkGoBack")

public actual fun hlinkGoForward(punk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkGoForward")

public actual fun hlinkNavigateMoniker(punk: MutPtr, pmktarget: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker")

public actual fun hlinkNavigateString(punk: MutPtr, sztarget: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkNavigateString")

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker")

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString")

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName")

public actual fun iEInstallScope(pdwscope: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIEInstallScope")

public actual fun isAsyncMoniker(pmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker")

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA")

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW")

public actual fun isValidURL(pbc: MutPtr, szurl: Pcwstr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsValidURL")

public actual fun mkParseDisplayNameEx(pbc: MutPtr, szdisplayname: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx")

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonObtainUserAgentString")

public actual fun registerBindStatusCallback(pbc: MutPtr, pbscb: MutPtr, ppbscbprev: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback")

public actual fun registerFormatEnumerator(pbc: MutPtr, pefetc: MutPtr, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator")

public actual fun registerMediaTypeClass(pbc: MutPtr, ctypes: UInt, rgsztypes: ConstPtr, rgclsid: ConstPtr, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass")

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr, rgcftypes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes")

public actual fun releaseBindInfo(pbindinfo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonReleaseBindInfo")

public actual fun revokeBindStatusCallback(pbc: MutPtr, pbscb: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback")

public actual fun revokeFormatEnumerator(pbc: MutPtr, pefetc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator")

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer")

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState")

public actual fun uRLDownloadToCacheFileA(param0: MutPtr, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA")

public actual fun uRLDownloadToCacheFileW(param0: MutPtr, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW")

public actual fun uRLDownloadToFileA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA")

public actual fun uRLDownloadToFileW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW")

public actual fun uRLOpenBlockingStreamA(param0: MutPtr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA")

public actual fun uRLOpenBlockingStreamW(param0: MutPtr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW")

public actual fun uRLOpenPullStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA")

public actual fun uRLOpenPullStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW")

public actual fun uRLOpenStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenStreamA")

public actual fun uRLOpenStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenStreamW")

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr, dwbufferlength: UInt, pdwbufferlengthout: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption")

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption")

public actual fun writeHitLogging(lplogginginfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonWriteHitLogging")
