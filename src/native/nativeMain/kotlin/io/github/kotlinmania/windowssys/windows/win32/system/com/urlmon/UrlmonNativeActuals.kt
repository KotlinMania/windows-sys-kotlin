@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetGetSession
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCompareSecurityIds
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCopyBindInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCopyStgMedium
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCreateURLMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonFaultInIEFeature
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonFindMediaType
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonFindMimeFromData
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonGetClassURL
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonHlinkGoBack
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonHlinkGoForward
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonHlinkNavigateString
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonIEInstallScope
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonIsValidURL
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonObtainUserAgentString
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonReleaseBindInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLOpenStreamA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonURLOpenStreamW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssysWindowsWin32SystemComUrlmonWriteHitLogging
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun coGetClassObjectFromURL(rclassid: ConstPtr<Guid>, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr<CVoid>, dwclscontext: Clsctx, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(rclassid.rawAddress.toCPointer<ByteVar>(), szcode.rawAddress.toCPointer<ByteVar>(), dwfileversionms, dwfileversionls, sztype.rawAddress.toCPointer<ByteVar>(), pbindctx.rawAddress.toCPointer<ByteVar>(), dwclscontext, pvreserved.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun coInternetCombineIUri(pbaseuri: MutPtr<CVoid>, prelativeuri: MutPtr<CVoid>, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(pbaseuri.rawAddress.toCPointer<ByteVar>(), prelativeuri.rawAddress.toCPointer<ByteVar>(), dwcombineflags, ppcombineduri.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(pwzbaseurl.rawAddress.toCPointer<ByteVar>(), pwzrelativeurl.rawAddress.toCPointer<ByteVar>(), dwcombineflags, pszresult.rawAddress.toCPointer<ByteVar>(), cchresult, pcchresult.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCombineUrlEx(pbaseuri: MutPtr<CVoid>, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(pbaseuri.rawAddress.toCPointer<ByteVar>(), pwzrelativeurl.rawAddress.toCPointer<ByteVar>(), dwcombineflags, ppcombineduri.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(pwzurl1.rawAddress.toCPointer<ByteVar>(), pwzurl2.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun coInternetCreateSecurityManager(psp: MutPtr<CVoid>, ppsm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(psp.rawAddress.toCPointer<ByteVar>(), ppsm.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCreateZoneManager(psp: MutPtr<CVoid>, ppzm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(psp.rawAddress.toCPointer<ByteVar>(), ppzm.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr<UInt>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(pwzurl.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr<Pwstr>, psuaction: Psuaction, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(pwszurl.rawAddress.toCPointer<ByteVar>(), ppwszsecurl.rawAddress.toCPointer<ByteVar>(), psuaction, dwreserved)

public actual fun coInternetGetSecurityUrlEx(puri: MutPtr<CVoid>, ppsecuri: MutPtr<MutPtr<CVoid>>, psuaction: Psuaction, dwreserved: ULong): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(puri.rawAddress.toCPointer<ByteVar>(), ppsecuri.rawAddress.toCPointer<ByteVar>(), psuaction, dwreserved)

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetGetSession(dwsessionmode, ppiinternetsession.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(featureentry, dwflags)

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr<CVoid>, psecmgr: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(featureentry, dwflags, piuri.rawAddress.toCPointer<ByteVar>(), psecmgr.rawAddress.toCPointer<ByteVar>())

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(featureentry, dwflags, szurl.rawAddress.toCPointer<ByteVar>(), psecmgr.rawAddress.toCPointer<ByteVar>())

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr<CVoid>, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(szfromurl.rawAddress.toCPointer<ByteVar>(), sztourl.rawAddress.toCPointer<ByteVar>(), psecmgr.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun coInternetParseIUri(piuri: MutPtr<CVoid>, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: ULong): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(piuri.rawAddress.toCPointer<ByteVar>(), parseaction, dwflags, pwzresult.rawAddress.toCPointer<ByteVar>(), cchresult, pcchresult.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(pwzurl.rawAddress.toCPointer<ByteVar>(), parseaction, dwflags, pszresult.rawAddress.toCPointer<ByteVar>(), cchresult, pcchresult.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbbuffer: MutPtr<UInt>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(pwzurl.rawAddress.toCPointer<ByteVar>(), queryoptions, dwqueryflags, pvbuffer.rawAddress.toCPointer<ByteVar>(), cbbuffer, pcbbuffer.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(featureentry, dwflags, fenable)

public actual fun compareSecurityIds(pbsecurityid1: ConstPtr<UByte>, dwlen1: UInt, pbsecurityid2: ConstPtr<UByte>, dwlen2: UInt, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCompareSecurityIds(pbsecurityid1.rawAddress.toCPointer<ByteVar>(), dwlen1, pbsecurityid2.rawAddress.toCPointer<ByteVar>(), dwlen2, dwreserved)

public actual fun compatFlagsFromClsid(pclsid: ConstPtr<Guid>, pdwcompatflags: MutPtr<UInt>, pdwmiscstatusflags: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(pclsid.rawAddress.toCPointer<ByteVar>(), pdwcompatflags.rawAddress.toCPointer<ByteVar>(), pdwmiscstatusflags.rawAddress.toCPointer<ByteVar>())

public actual fun copyBindInfo(pcbisrc: ConstPtr<Bindinfo>, pbidest: MutPtr<Bindinfo>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCopyBindInfo(pcbisrc.rawAddress.toCPointer<ByteVar>(), pbidest.rawAddress.toCPointer<ByteVar>())

public actual fun copyStgMedium(pcstgmedsrc: ConstPtr<Stgmedium>, pstgmeddest: MutPtr<Stgmedium>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCopyStgMedium(pcstgmedsrc.rawAddress.toCPointer<ByteVar>(), pstgmeddest.rawAddress.toCPointer<ByteVar>())

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(reserved, pbscb.rawAddress.toCPointer<ByteVar>(), pefetc.rawAddress.toCPointer<ByteVar>(), ppbc.rawAddress.toCPointer<ByteVar>())

public actual fun createAsyncBindCtxEx(pbc: MutPtr<CVoid>, dwoptions: UInt, pbscb: MutPtr<CVoid>, penum: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>, reserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(pbc.rawAddress.toCPointer<ByteVar>(), dwoptions, pbscb.rawAddress.toCPointer<ByteVar>(), penum.rawAddress.toCPointer<ByteVar>(), ppbc.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr<Formatetc>, ppenumfmtetc: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(cfmtetc, rgfmtetc.rawAddress.toCPointer<ByteVar>(), ppenumfmtetc.rawAddress.toCPointer<ByteVar>())

public actual fun createURLMoniker(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComUrlmonCreateURLMoniker(pmkctx.rawAddress.toCPointer<ByteVar>(), szurl.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createURLMonikerEx(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(pmkctx.rawAddress.toCPointer<ByteVar>(), szurl.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun createURLMonikerEx2(pmkctx: MutPtr<CVoid>, puri: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(pmkctx.rawAddress.toCPointer<ByteVar>(), puri.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr<UClsspec>, pquery: MutPtr<Querycontext>, dwflags: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonFaultInIEFeature(hwnd.rawAddress.toCPointer<ByteVar>(), pclassspec.rawAddress.toCPointer<ByteVar>(), pquery.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr<UShort>): Hresult =
    windowssysWindowsWin32SystemComUrlmonFindMediaType(rgsztypes.rawAddress.toCPointer<ByteVar>(), rgcftypes.rawAddress.toCPointer<ByteVar>())

public actual fun findMediaTypeClass(pbc: MutPtr<CVoid>, sztype: Pcstr, pclsid: MutPtr<Guid>, reserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(pbc.rawAddress.toCPointer<ByteVar>(), sztype.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun findMimeFromData(pbc: MutPtr<CVoid>, pwzurl: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonFindMimeFromData(pbc.rawAddress.toCPointer<ByteVar>(), pwzurl.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), cbsize, pwzmimeproposed.rawAddress.toCPointer<ByteVar>(), dwmimeflags, ppwzmimeout.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun getClassFileOrMime(pbc: MutPtr<CVoid>, szfilename: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr<Guid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(pbc.rawAddress.toCPointer<ByteVar>(), szfilename.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), cbsize, szmime.rawAddress.toCPointer<ByteVar>(), dwreserved, pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun getClassURL(szurl: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonGetClassURL(szurl.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr<UClsspec>, ppszcomponentid: MutPtr<Pstr>): Hresult =
    windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(pclassspec.rawAddress.toCPointer<ByteVar>(), ppszcomponentid.rawAddress.toCPointer<ByteVar>())

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr<Softdistinfo>): Hresult =
    windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(szdistunit.rawAddress.toCPointer<ByteVar>(), psdi.rawAddress.toCPointer<ByteVar>())

public actual fun hlinkGoBack(punk: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonHlinkGoBack(punk.rawAddress.toCPointer<ByteVar>())

public actual fun hlinkGoForward(punk: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonHlinkGoForward(punk.rawAddress.toCPointer<ByteVar>())

public actual fun hlinkNavigateMoniker(punk: MutPtr<CVoid>, pmktarget: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(punk.rawAddress.toCPointer<ByteVar>(), pmktarget.rawAddress.toCPointer<ByteVar>())

public actual fun hlinkNavigateString(punk: MutPtr<CVoid>, sztarget: Pcwstr): Hresult =
    windowssysWindowsWin32SystemComUrlmonHlinkNavigateString(punk.rawAddress.toCPointer<ByteVar>(), sztarget.rawAddress.toCPointer<ByteVar>())

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr<CVoid>, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(pmktarget.rawAddress.toCPointer<ByteVar>(), szlocation.rawAddress.toCPointer<ByteVar>(), sztargetframename.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), pbc.rawAddress.toCPointer<ByteVar>(), param5.rawAddress.toCPointer<ByteVar>(), grfhlnf, dwreserved)

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(sztarget.rawAddress.toCPointer<ByteVar>(), szlocation.rawAddress.toCPointer<ByteVar>(), sztargetframename.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), pbc.rawAddress.toCPointer<ByteVar>(), param5.rawAddress.toCPointer<ByteVar>(), grfhlnf, dwreserved)

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    MutPtr(windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName()?.toLong() ?: 0L)

public actual fun iEInstallScope(pdwscope: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemComUrlmonIEInstallScope(pdwscope.rawAddress.toCPointer<ByteVar>())

public actual fun isAsyncMoniker(pmk: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(pmk.rawAddress.toCPointer<ByteVar>())

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(pszurl.rawAddress.toCPointer<ByteVar>())

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(pwszurl.rawAddress.toCPointer<ByteVar>())

public actual fun isValidURL(pbc: MutPtr<CVoid>, szurl: Pcwstr, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonIsValidURL(pbc.rawAddress.toCPointer<ByteVar>(), szurl.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun mkParseDisplayNameEx(pbc: MutPtr<CVoid>, szdisplayname: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(pbc.rawAddress.toCPointer<ByteVar>(), szdisplayname.rawAddress.toCPointer<ByteVar>(), pcheaten.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32SystemComUrlmonObtainUserAgentString(dwoption, pszuaout.rawAddress.toCPointer<ByteVar>(), cbsize.rawAddress.toCPointer<ByteVar>())

public actual fun registerBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>, ppbscbprev: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(pbc.rawAddress.toCPointer<ByteVar>(), pbscb.rawAddress.toCPointer<ByteVar>(), ppbscbprev.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun registerFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, reserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(pbc.rawAddress.toCPointer<ByteVar>(), pefetc.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun registerMediaTypeClass(pbc: MutPtr<CVoid>, ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgclsid: ConstPtr<Guid>, reserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(pbc.rawAddress.toCPointer<ByteVar>(), ctypes, rgsztypes.rawAddress.toCPointer<ByteVar>(), rgclsid.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgcftypes: MutPtr<UShort>): Hresult =
    windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(ctypes, rgsztypes.rawAddress.toCPointer<ByteVar>(), rgcftypes.rawAddress.toCPointer<ByteVar>())

public actual fun releaseBindInfo(pbindinfo: MutPtr<Bindinfo>) {
    windowssysWindowsWin32SystemComUrlmonReleaseBindInfo(pbindinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun revokeBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(pbc.rawAddress.toCPointer<ByteVar>(), pbscb.rawAddress.toCPointer<ByteVar>())

public actual fun revokeFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(pbc.rawAddress.toCPointer<ByteVar>(), pefetc.rawAddress.toCPointer<ByteVar>())

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(hobject.rawAddress.toCPointer<ByteVar>(), ieobjecttype, dwaccessmask)

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(szdistunit.rawAddress.toCPointer<ByteVar>(), dwadstate, dwadvertisedversionms, dwadvertisedversionls)

public actual fun uRLDownloadToCacheFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), cchfilename, param4, param5.rawAddress.toCPointer<ByteVar>())

public actual fun uRLDownloadToCacheFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), cchfilename, param4, param5.rawAddress.toCPointer<ByteVar>())

public actual fun uRLDownloadToFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), param3, param4.rawAddress.toCPointer<ByteVar>())

public actual fun uRLDownloadToFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), param3, param4.rawAddress.toCPointer<ByteVar>())

public actual fun uRLOpenBlockingStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), param3, param4.rawAddress.toCPointer<ByteVar>())

public actual fun uRLOpenBlockingStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2.rawAddress.toCPointer<ByteVar>(), param3, param4.rawAddress.toCPointer<ByteVar>())

public actual fun uRLOpenPullStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun uRLOpenPullStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun uRLOpenStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLOpenStreamA(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun uRLOpenStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemComUrlmonURLOpenStreamW(param0.rawAddress.toCPointer<ByteVar>(), param1.rawAddress.toCPointer<ByteVar>(), param2, param3.rawAddress.toCPointer<ByteVar>())

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbufferlengthout: MutPtr<UInt>, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(dwoption, pbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength, pdwbufferlengthout.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(dwoption, pbuffer.rawAddress.toCPointer<ByteVar>(), dwbufferlength, dwreserved)

public actual fun writeHitLogging(lplogginginfo: ConstPtr<HitLoggingInfo>): Bool =
    windowssysWindowsWin32SystemComUrlmonWriteHitLogging(lplogginginfo.rawAddress.toCPointer<ByteVar>())
