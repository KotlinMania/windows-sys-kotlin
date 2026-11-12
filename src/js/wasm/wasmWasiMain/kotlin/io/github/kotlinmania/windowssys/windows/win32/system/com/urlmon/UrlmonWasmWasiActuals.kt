@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.Bindinfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.Clsctx
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.Querycontext
import io.github.kotlinmania.windowssys.windows.win32.system.com.Stgmedium
import io.github.kotlinmania.windowssys.windows.win32.system.com.UClsspec

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun coGetClassObjectFromURL(rclassid: ConstPtr<Guid>, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr<CVoid>, dwclscontext: Clsctx, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL")

public actual fun coInternetCombineIUri(pbaseuri: MutPtr<CVoid>, prelativeuri: MutPtr<CVoid>, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri")

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl")

public actual fun coInternetCombineUrlEx(pbaseuri: MutPtr<CVoid>, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx")

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl")

public actual fun coInternetCreateSecurityManager(psp: MutPtr<CVoid>, ppsm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager")

public actual fun coInternetCreateZoneManager(psp: MutPtr<CVoid>, ppzm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager")

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr<UInt>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags")

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr<Pwstr>, psuaction: Psuaction, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl")

public actual fun coInternetGetSecurityUrlEx(puri: MutPtr<CVoid>, ppsecuri: MutPtr<MutPtr<CVoid>>, psuaction: Psuaction, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx")

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetGetSession")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled")
private external fun wasiWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry: Int, dwflags: Int): Int

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry, dwflags.toInt())

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr<CVoid>, psecmgr: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri")

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl")

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr<CVoid>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled")

public actual fun coInternetParseIUri(piuri: MutPtr<CVoid>, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri")

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl")

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbbuffer: MutPtr<UInt>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled")
private external fun wasiWindowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry: Int, dwflags: Int, fenable: Int): Int

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    wasiWindowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry, dwflags.toInt(), fenable)

public actual fun compareSecurityIds(pbsecurityid1: ConstPtr<UByte>, dwlen1: UInt, pbsecurityid2: ConstPtr<UByte>, dwlen2: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCompareSecurityIds")

public actual fun compatFlagsFromClsid(pclsid: ConstPtr<Guid>, pdwcompatflags: MutPtr<UInt>, pdwmiscstatusflags: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid")

public actual fun copyBindInfo(pcbisrc: ConstPtr<Bindinfo>, pbidest: MutPtr<Bindinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCopyBindInfo")

public actual fun copyStgMedium(pcstgmedsrc: ConstPtr<Stgmedium>, pstgmeddest: MutPtr<Stgmedium>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCopyStgMedium")

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx")

public actual fun createAsyncBindCtxEx(pbc: MutPtr<CVoid>, dwoptions: UInt, pbscb: MutPtr<CVoid>, penum: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx")

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr<Formatetc>, ppenumfmtetc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator")

public actual fun createURLMoniker(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateURLMoniker")

public actual fun createURLMonikerEx(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx")

public actual fun createURLMonikerEx2(pmkctx: MutPtr<CVoid>, puri: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2")

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr<UClsspec>, pquery: MutPtr<Querycontext>, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFaultInIEFeature")

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFindMediaType")

public actual fun findMediaTypeClass(pbc: MutPtr<CVoid>, sztype: Pcstr, pclsid: MutPtr<Guid>, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass")

public actual fun findMimeFromData(pbc: MutPtr<CVoid>, pwzurl: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonFindMimeFromData")

public actual fun getClassFileOrMime(pbc: MutPtr<CVoid>, szfilename: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime")

public actual fun getClassURL(szurl: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetClassURL")

public actual fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr<UClsspec>, ppszcomponentid: MutPtr<Pstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC")

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr<Softdistinfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo")

public actual fun hlinkGoBack(punk: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkGoBack")

public actual fun hlinkGoForward(punk: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkGoForward")

public actual fun hlinkNavigateMoniker(punk: MutPtr<CVoid>, pmktarget: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker")

public actual fun hlinkNavigateString(punk: MutPtr<CVoid>, sztarget: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkNavigateString")

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr<CVoid>, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker")

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString")

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName")

public actual fun iEInstallScope(pdwscope: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIEInstallScope")

public actual fun isAsyncMoniker(pmk: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker")

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA")

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW")

public actual fun isValidURL(pbc: MutPtr<CVoid>, szurl: Pcwstr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonIsValidURL")

public actual fun mkParseDisplayNameEx(pbc: MutPtr<CVoid>, szdisplayname: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx")

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonObtainUserAgentString")

public actual fun registerBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>, ppbscbprev: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback")

public actual fun registerFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator")

public actual fun registerMediaTypeClass(pbc: MutPtr<CVoid>, ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgclsid: ConstPtr<Guid>, reserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass")

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgcftypes: MutPtr<UShort>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes")

public actual fun releaseBindInfo(pbindinfo: MutPtr<Bindinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonReleaseBindInfo")

public actual fun revokeBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback")

public actual fun revokeFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator")

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer")

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState")

public actual fun uRLDownloadToCacheFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA")

public actual fun uRLDownloadToCacheFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW")

public actual fun uRLDownloadToFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA")

public actual fun uRLDownloadToFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW")

public actual fun uRLOpenBlockingStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA")

public actual fun uRLOpenBlockingStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW")

public actual fun uRLOpenPullStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA")

public actual fun uRLOpenPullStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW")

public actual fun uRLOpenStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenStreamA")

public actual fun uRLOpenStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonURLOpenStreamW")

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbufferlengthout: MutPtr<UInt>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption")

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption")

public actual fun writeHitLogging(lplogginginfo: ConstPtr<HitLoggingInfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComUrlmonWriteHitLogging")
