@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetGetSession
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetParseIUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetParseUrl
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_compareSecurityIds
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_copyBindInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_copyStgMedium
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_createFormatEnumerator
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_createURLMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_faultInIEFeature
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_findMediaType
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_findMediaTypeClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_findMimeFromData
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_getClassFileOrMime
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_getClassURL
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_hlinkGoBack
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_hlinkGoForward
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_hlinkNavigateString
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_iEInstallScope
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_isAsyncMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_isValidURL
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_obtainUserAgentString
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_registerMediaTypes
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_releaseBindInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.cinterop.windowssys_windows_win32_system_com_urlmon_writeHitLogging
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun coGetClassObjectFromURL(rclassid: COpaquePointer?, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: COpaquePointer?, dwclscontext: Clsctx, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL(rclassid?.value?.toCPointer<ByteVar>(), szcode?.value?.toCPointer<ByteVar>(), dwfileversionms, dwfileversionls, sztype?.value?.toCPointer<ByteVar>(), pbindctx?.value?.toCPointer<ByteVar>(), dwclscontext, pvreserved?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun coInternetCombineIUri(pbaseuri: COpaquePointer?, prelativeuri: COpaquePointer?, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri(pbaseuri?.value?.toCPointer<ByteVar>(), prelativeuri?.value?.toCPointer<ByteVar>(), dwcombineflags, ppcombineduri?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl(pwzbaseurl?.value?.toCPointer<ByteVar>(), pwzrelativeurl?.value?.toCPointer<ByteVar>(), dwcombineflags, pszresult?.value?.toCPointer<ByteVar>(), cchresult, pcchresult?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCombineUrlEx(pbaseuri: COpaquePointer?, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx(pbaseuri?.value?.toCPointer<ByteVar>(), pwzrelativeurl?.value?.toCPointer<ByteVar>(), dwcombineflags, ppcombineduri?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl(pwzurl1?.value?.toCPointer<ByteVar>(), pwzurl2?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun coInternetCreateSecurityManager(psp: COpaquePointer?, ppsm: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager(psp?.value?.toCPointer<ByteVar>(), ppsm?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetCreateZoneManager(psp: COpaquePointer?, ppzm: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager(psp?.value?.toCPointer<ByteVar>(), ppzm?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags(pwzurl?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: COpaquePointer?, psuaction: Psuaction, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl(pwszurl?.value?.toCPointer<ByteVar>(), ppwszsecurl?.value?.toCPointer<ByteVar>(), psuaction, dwreserved)

public actual fun coInternetGetSecurityUrlEx(puri: COpaquePointer?, ppsecuri: COpaquePointer?, psuaction: Psuaction, dwreserved: ULong): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx(puri?.value?.toCPointer<ByteVar>(), ppsecuri?.value?.toCPointer<ByteVar>(), psuaction, dwreserved)

public actual fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetGetSession(dwsessionmode, ppiinternetsession?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(featureentry, dwflags)

public actual fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: COpaquePointer?, psecmgr: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(featureentry, dwflags, piuri?.value?.toCPointer<ByteVar>(), psecmgr?.value?.toCPointer<ByteVar>())

public actual fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(featureentry, dwflags, szurl?.value?.toCPointer<ByteVar>(), psecmgr?.value?.toCPointer<ByteVar>())

public actual fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: COpaquePointer?, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled(szfromurl?.value?.toCPointer<ByteVar>(), sztourl?.value?.toCPointer<ByteVar>(), psecmgr?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun coInternetParseIUri(piuri: COpaquePointer?, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: ULong): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetParseIUri(piuri?.value?.toCPointer<ByteVar>(), parseaction, dwflags, pwzresult?.value?.toCPointer<ByteVar>(), cchresult, pcchresult?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetParseUrl(pwzurl?.value?.toCPointer<ByteVar>(), parseaction, dwflags, pszresult?.value?.toCPointer<ByteVar>(), cchresult, pcchresult?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbbuffer: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo(pwzurl?.value?.toCPointer<ByteVar>(), queryoptions, dwqueryflags, pvbuffer?.value?.toCPointer<ByteVar>(), cbbuffer, pcbbuffer?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult =
    windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(featureentry, dwflags, fenable)

public actual fun compareSecurityIds(pbsecurityid1: COpaquePointer?, dwlen1: UInt, pbsecurityid2: COpaquePointer?, dwlen2: UInt, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_compareSecurityIds(pbsecurityid1?.value?.toCPointer<ByteVar>(), dwlen1, pbsecurityid2?.value?.toCPointer<ByteVar>(), dwlen2, dwreserved)

public actual fun compatFlagsFromClsid(pclsid: COpaquePointer?, pdwcompatflags: COpaquePointer?, pdwmiscstatusflags: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid(pclsid?.value?.toCPointer<ByteVar>(), pdwcompatflags?.value?.toCPointer<ByteVar>(), pdwmiscstatusflags?.value?.toCPointer<ByteVar>())

public actual fun copyBindInfo(pcbisrc: COpaquePointer?, pbidest: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_copyBindInfo(pcbisrc?.value?.toCPointer<ByteVar>(), pbidest?.value?.toCPointer<ByteVar>())

public actual fun copyStgMedium(pcstgmedsrc: COpaquePointer?, pstgmeddest: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_copyStgMedium(pcstgmedsrc?.value?.toCPointer<ByteVar>(), pstgmeddest?.value?.toCPointer<ByteVar>())

public actual fun createAsyncBindCtx(reserved: UInt, pbscb: COpaquePointer?, pefetc: COpaquePointer?, ppbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(reserved, pbscb?.value?.toCPointer<ByteVar>(), pefetc?.value?.toCPointer<ByteVar>(), ppbc?.value?.toCPointer<ByteVar>())

public actual fun createAsyncBindCtxEx(pbc: COpaquePointer?, dwoptions: UInt, pbscb: COpaquePointer?, penum: COpaquePointer?, ppbc: COpaquePointer?, reserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx(pbc?.value?.toCPointer<ByteVar>(), dwoptions, pbscb?.value?.toCPointer<ByteVar>(), penum?.value?.toCPointer<ByteVar>(), ppbc?.value?.toCPointer<ByteVar>(), reserved)

public actual fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: COpaquePointer?, ppenumfmtetc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(cfmtetc, rgfmtetc?.value?.toCPointer<ByteVar>(), ppenumfmtetc?.value?.toCPointer<ByteVar>())

public actual fun createURLMoniker(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_createURLMoniker(pmkctx?.value?.toCPointer<ByteVar>(), szurl?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun createURLMonikerEx(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_createURLMonikerEx(pmkctx?.value?.toCPointer<ByteVar>(), szurl?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun createURLMonikerEx2(pmkctx: COpaquePointer?, puri: COpaquePointer?, ppmk: COpaquePointer?, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2(pmkctx?.value?.toCPointer<ByteVar>(), puri?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun faultInIEFeature(hwnd: Hwnd, pclassspec: COpaquePointer?, pquery: COpaquePointer?, dwflags: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_faultInIEFeature(hwnd?.value?.toCPointer<ByteVar>(), pclassspec?.value?.toCPointer<ByteVar>(), pquery?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun findMediaType(rgsztypes: Pcstr, rgcftypes: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_findMediaType(rgsztypes?.value?.toCPointer<ByteVar>(), rgcftypes?.value?.toCPointer<ByteVar>())

public actual fun findMediaTypeClass(pbc: COpaquePointer?, sztype: Pcstr, pclsid: COpaquePointer?, reserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_findMediaTypeClass(pbc?.value?.toCPointer<ByteVar>(), sztype?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>(), reserved)

public actual fun findMimeFromData(pbc: COpaquePointer?, pwzurl: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_findMimeFromData(pbc?.value?.toCPointer<ByteVar>(), pwzurl?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), cbsize, pwzmimeproposed?.value?.toCPointer<ByteVar>(), dwmimeflags, ppwzmimeout?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun getClassFileOrMime(pbc: COpaquePointer?, szfilename: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_getClassFileOrMime(pbc?.value?.toCPointer<ByteVar>(), szfilename?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), cbsize, szmime?.value?.toCPointer<ByteVar>(), dwreserved, pclsid?.value?.toCPointer<ByteVar>())

public actual fun getClassURL(szurl: Pcwstr, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_getClassURL(szurl?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun getComponentIDFromCLSSPEC(pclassspec: COpaquePointer?, ppszcomponentid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC(pclassspec?.value?.toCPointer<ByteVar>(), ppszcomponentid?.value?.toCPointer<ByteVar>())

public actual fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo(szdistunit?.value?.toCPointer<ByteVar>(), psdi?.value?.toCPointer<ByteVar>())

public actual fun hlinkGoBack(punk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_hlinkGoBack(punk?.value?.toCPointer<ByteVar>())

public actual fun hlinkGoForward(punk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_hlinkGoForward(punk?.value?.toCPointer<ByteVar>())

public actual fun hlinkNavigateMoniker(punk: COpaquePointer?, pmktarget: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker(punk?.value?.toCPointer<ByteVar>(), pmktarget?.value?.toCPointer<ByteVar>())

public actual fun hlinkNavigateString(punk: COpaquePointer?, sztarget: Pcwstr): Hresult =
    windowssys_windows_win32_system_com_urlmon_hlinkNavigateString(punk?.value?.toCPointer<ByteVar>(), sztarget?.value?.toCPointer<ByteVar>())

public actual fun hlinkSimpleNavigateToMoniker(pmktarget: COpaquePointer?, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker(pmktarget?.value?.toCPointer<ByteVar>(), szlocation?.value?.toCPointer<ByteVar>(), sztargetframename?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), pbc?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>(), grfhlnf, dwreserved)

public actual fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString(sztarget?.value?.toCPointer<ByteVar>(), szlocation?.value?.toCPointer<ByteVar>(), sztargetframename?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), pbc?.value?.toCPointer<ByteVar>(), param5?.value?.toCPointer<ByteVar>(), grfhlnf, dwreserved)

public actual fun iEGetUserPrivateNamespaceName(): Pwstr =
    windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName()?.let { COpaquePointer(it.toLong()) }

public actual fun iEInstallScope(pdwscope: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_iEInstallScope(pdwscope?.value?.toCPointer<ByteVar>())

public actual fun isAsyncMoniker(pmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_isAsyncMoniker(pmk?.value?.toCPointer<ByteVar>())

public actual fun isLoggingEnabledA(pszurl: Pcstr): Bool =
    windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA(pszurl?.value?.toCPointer<ByteVar>())

public actual fun isLoggingEnabledW(pwszurl: Pcwstr): Bool =
    windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW(pwszurl?.value?.toCPointer<ByteVar>())

public actual fun isValidURL(pbc: COpaquePointer?, szurl: Pcwstr, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_isValidURL(pbc?.value?.toCPointer<ByteVar>(), szurl?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun mkParseDisplayNameEx(pbc: COpaquePointer?, szdisplayname: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx(pbc?.value?.toCPointer<ByteVar>(), szdisplayname?.value?.toCPointer<ByteVar>(), pcheaten?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(dwoption, pszuaout?.value?.toCPointer<ByteVar>(), cbsize?.value?.toCPointer<ByteVar>())

public actual fun registerBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?, ppbscbprev: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback(pbc?.value?.toCPointer<ByteVar>(), pbscb?.value?.toCPointer<ByteVar>(), ppbscbprev?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun registerFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?, reserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator(pbc?.value?.toCPointer<ByteVar>(), pefetc?.value?.toCPointer<ByteVar>(), reserved)

public actual fun registerMediaTypeClass(pbc: COpaquePointer?, ctypes: UInt, rgsztypes: COpaquePointer?, rgclsid: COpaquePointer?, reserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass(pbc?.value?.toCPointer<ByteVar>(), ctypes, rgsztypes?.value?.toCPointer<ByteVar>(), rgclsid?.value?.toCPointer<ByteVar>(), reserved)

public actual fun registerMediaTypes(ctypes: UInt, rgsztypes: COpaquePointer?, rgcftypes: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_registerMediaTypes(ctypes, rgsztypes?.value?.toCPointer<ByteVar>(), rgcftypes?.value?.toCPointer<ByteVar>())

public actual fun releaseBindInfo(pbindinfo: COpaquePointer?) {
    windowssys_windows_win32_system_com_urlmon_releaseBindInfo(pbindinfo?.value?.toCPointer<ByteVar>())
}

public actual fun revokeBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback(pbc?.value?.toCPointer<ByteVar>(), pbscb?.value?.toCPointer<ByteVar>())

public actual fun revokeFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator(pbc?.value?.toCPointer<ByteVar>(), pefetc?.value?.toCPointer<ByteVar>())

public actual fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer(hobject?.value?.toCPointer<ByteVar>(), ieobjecttype, dwaccessmask)

public actual fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState(szdistunit?.value?.toCPointer<ByteVar>(), dwadstate, dwadvertisedversionms, dwadvertisedversionls)

public actual fun uRLDownloadToCacheFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), cchfilename, param4, param5?.value?.toCPointer<ByteVar>())

public actual fun uRLDownloadToCacheFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), cchfilename, param4, param5?.value?.toCPointer<ByteVar>())

public actual fun uRLDownloadToFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: UInt, param4: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>())

public actual fun uRLDownloadToFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>())

public actual fun uRLOpenBlockingStreamA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>())

public actual fun uRLOpenBlockingStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2?.value?.toCPointer<ByteVar>(), param3, param4?.value?.toCPointer<ByteVar>())

public actual fun uRLOpenPullStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun uRLOpenPullStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun uRLOpenStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun uRLOpenStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3?.value?.toCPointer<ByteVar>())

public actual fun urlMkGetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbufferlengthout: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(dwoption, pbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, pdwbufferlengthout?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun urlMkSetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(dwoption, pbuffer?.value?.toCPointer<ByteVar>(), dwbufferlength, dwreserved)

public actual fun writeHitLogging(lplogginginfo: COpaquePointer?): Bool =
    windowssys_windows_win32_system_com_urlmon_writeHitLogging(lplogginginfo?.value?.toCPointer<ByteVar>())
