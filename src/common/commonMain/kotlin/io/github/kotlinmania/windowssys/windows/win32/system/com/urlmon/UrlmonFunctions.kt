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

public expect fun CoGetClassObjectFromURL(rclassid: Long, szcode: PCWSTR, dwfileversionms: UInt, dwfileversionls: UInt, sztype: PCWSTR, pbindctx: Long, dwclscontext: CLSCTX, pvreserved: Long, riid: Long, ppv: Long): HRESULT

public expect fun CoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT

public expect fun CoInternetCombineUrl(pwzbaseurl: PCWSTR, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT

public expect fun CoInternetCompareUrl(pwzurl1: PCWSTR, pwzurl2: PCWSTR, dwflags: UInt): HRESULT

public expect fun CoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetGetProtocolFlags(pwzurl: PCWSTR, pdwflags: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetGetSecurityUrl(pwszurl: PCWSTR, ppwszsecurl: Long, psuaction: PSUACTION, dwreserved: UInt): HRESULT

public expect fun CoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: PSUACTION, dwreserved: ULong): HRESULT

public expect fun CoInternetGetSession(dwsessionmode: UInt, ppiinternetsession: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetIsFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt): HRESULT

public expect fun CoInternetIsFeatureEnabledForIUri(featureentry: INTERNETFEATURELIST, dwflags: UInt, piuri: Long, psecmgr: Long): HRESULT

public expect fun CoInternetIsFeatureEnabledForUrl(featureentry: INTERNETFEATURELIST, dwflags: UInt, szurl: PCWSTR, psecmgr: Long): HRESULT

public expect fun CoInternetIsFeatureZoneElevationEnabled(szfromurl: PCWSTR, sztourl: PCWSTR, psecmgr: Long, dwflags: UInt): HRESULT

public expect fun CoInternetParseIUri(piuri: Long, parseaction: PARSEACTION, dwflags: UInt, pwzresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: ULong): HRESULT

public expect fun CoInternetParseUrl(pwzurl: PCWSTR, parseaction: PARSEACTION, dwflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetQueryInfo(pwzurl: PCWSTR, queryoptions: QUERYOPTION, dwqueryflags: UInt, pvbuffer: Long, cbbuffer: UInt, pcbbuffer: Long, dwreserved: UInt): HRESULT

public expect fun CoInternetSetFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt, fenable: BOOL): HRESULT

public expect fun CompareSecurityIds(pbsecurityid1: Long, dwlen1: UInt, pbsecurityid2: Long, dwlen2: UInt, dwreserved: UInt): HRESULT

public expect fun CompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): HRESULT

public expect fun CopyBindInfo(pcbisrc: Long, pbidest: Long): HRESULT

public expect fun CopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): HRESULT

public expect fun CreateAsyncBindCtx(reserved: UInt, pbscb: Long, pefetc: Long, ppbc: Long): HRESULT

public expect fun CreateAsyncBindCtxEx(pbc: Long, dwoptions: UInt, pbscb: Long, penum: Long, ppbc: Long, reserved: UInt): HRESULT

public expect fun CreateFormatEnumerator(cfmtetc: UInt, rgfmtetc: Long, ppenumfmtetc: Long): HRESULT

public expect fun CreateURLMoniker(pmkctx: Long, szurl: PCWSTR, ppmk: Long): HRESULT

public expect fun CreateURLMonikerEx(pmkctx: Long, szurl: PCWSTR, ppmk: Long, dwflags: UInt): HRESULT

public expect fun CreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: UInt): HRESULT

public expect fun FaultInIEFeature(hwnd: HWND, pclassspec: Long, pquery: Long, dwflags: UInt): HRESULT

public expect fun FindMediaType(rgsztypes: PCSTR, rgcftypes: Long): HRESULT

public expect fun FindMediaTypeClass(pbc: Long, sztype: PCSTR, pclsid: Long, reserved: UInt): HRESULT

public expect fun FindMimeFromData(pbc: Long, pwzurl: PCWSTR, pbuffer: Long, cbsize: UInt, pwzmimeproposed: PCWSTR, dwmimeflags: UInt, ppwzmimeout: Long, dwreserved: UInt): HRESULT

public expect fun GetClassFileOrMime(pbc: Long, szfilename: PCWSTR, pbuffer: Long, cbsize: UInt, szmime: PCWSTR, dwreserved: UInt, pclsid: Long): HRESULT

public expect fun GetClassURL(szurl: PCWSTR, pclsid: Long): HRESULT

public expect fun GetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): HRESULT

public expect fun GetSoftwareUpdateInfo(szdistunit: PCWSTR, psdi: Long): HRESULT

public expect fun HlinkGoBack(punk: Long): HRESULT

public expect fun HlinkGoForward(punk: Long): HRESULT

public expect fun HlinkNavigateMoniker(punk: Long, pmktarget: Long): HRESULT

public expect fun HlinkNavigateString(punk: Long, sztarget: PCWSTR): HRESULT

public expect fun HlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT

public expect fun HlinkSimpleNavigateToString(sztarget: PCWSTR, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT

public expect fun IEGetUserPrivateNamespaceName(): PWSTR

public expect fun IEInstallScope(pdwscope: Long): HRESULT

public expect fun IsAsyncMoniker(pmk: Long): HRESULT

public expect fun IsLoggingEnabledA(pszurl: PCSTR): BOOL

public expect fun IsLoggingEnabledW(pwszurl: PCWSTR): BOOL

public expect fun IsValidURL(pbc: Long, szurl: PCWSTR, dwreserved: UInt): HRESULT

public expect fun MkParseDisplayNameEx(pbc: Long, szdisplayname: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT

public expect fun ObtainUserAgentString(dwoption: UInt, pszuaout: PSTR, cbsize: Long): HRESULT

public expect fun RegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: UInt): HRESULT

public expect fun RegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: UInt): HRESULT

public expect fun RegisterMediaTypeClass(pbc: Long, ctypes: UInt, rgsztypes: Long, rgclsid: Long, reserved: UInt): HRESULT

public expect fun RegisterMediaTypes(ctypes: UInt, rgsztypes: Long, rgcftypes: Long): HRESULT

public expect fun ReleaseBindInfo(pbindinfo: Long)

public expect fun RevokeBindStatusCallback(pbc: Long, pbscb: Long): HRESULT

public expect fun RevokeFormatEnumerator(pbc: Long, pefetc: Long): HRESULT

public expect fun SetAccessForIEAppContainer(hobject: HANDLE, ieobjecttype: IEObjectType, dwaccessmask: UInt): HRESULT

public expect fun SetSoftwareUpdateAdvertisementState(szdistunit: PCWSTR, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): HRESULT

public expect fun URLDownloadToCacheFileA(param0: Long, param1: PCSTR, param2: PSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT

public expect fun URLDownloadToCacheFileW(param0: Long, param1: PCWSTR, param2: PWSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT

public expect fun URLDownloadToFileA(param0: Long, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): HRESULT

public expect fun URLDownloadToFileW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): HRESULT

public expect fun URLOpenBlockingStreamA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long): HRESULT

public expect fun URLOpenBlockingStreamW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long): HRESULT

public expect fun URLOpenPullStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT

public expect fun URLOpenPullStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT

public expect fun URLOpenStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT

public expect fun URLOpenStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT

public expect fun UrlMkGetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, pdwbufferlengthout: Long, dwreserved: UInt): HRESULT

public expect fun UrlMkSetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, dwreserved: UInt): HRESULT

public expect fun WriteHitLogging(lplogginginfo: Long): BOOL
