package io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.system.com.CLSCTX

public fun CoGetClassObjectFromURL(rclassid: Long, szcode: PCWSTR, dwfileversionms: UInt, dwfileversionls: UInt, sztype: PCWSTR, pbindctx: Long, dwclscontext: CLSCTX, pvreserved: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoGetClassObjectFromURL", longArrayOf(rclassid, szcode, dwfileversionms.toLong(), dwfileversionls.toLong(), sztype, pbindctx, dwclscontext.toLong(), pvreserved, riid, ppv)).toInt()
}

public fun CoInternetCombineIUri(pbaseuri: Long, prelativeuri: Long, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetCombineIUri", longArrayOf(pbaseuri, prelativeuri, dwcombineflags.toLong(), ppcombineduri, dwreserved.toLong())).toInt()
}

public fun CoInternetCombineUrl(pwzbaseurl: PCWSTR, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetCombineUrl", longArrayOf(pwzbaseurl, pwzrelativeurl, dwcombineflags.toLong(), pszresult, cchresult.toLong(), pcchresult, dwreserved.toLong())).toInt()
}

public fun CoInternetCombineUrlEx(pbaseuri: Long, pwzrelativeurl: PCWSTR, dwcombineflags: UInt, ppcombineduri: Long, dwreserved: ULong): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetCombineUrlEx", longArrayOf(pbaseuri, pwzrelativeurl, dwcombineflags.toLong(), ppcombineduri, dwreserved.toLong())).toInt()
}

public fun CoInternetCompareUrl(pwzurl1: PCWSTR, pwzurl2: PCWSTR, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetCompareUrl", longArrayOf(pwzurl1, pwzurl2, dwflags.toLong())).toInt()
}

public fun CoInternetCreateSecurityManager(psp: Long, ppsm: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetCreateSecurityManager", longArrayOf(psp, ppsm, dwreserved.toLong())).toInt()
}

public fun CoInternetCreateZoneManager(psp: Long, ppzm: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetCreateZoneManager", longArrayOf(psp, ppzm, dwreserved.toLong())).toInt()
}

public fun CoInternetGetProtocolFlags(pwzurl: PCWSTR, pdwflags: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetGetProtocolFlags", longArrayOf(pwzurl, pdwflags, dwreserved.toLong())).toInt()
}

public fun CoInternetGetSecurityUrl(pwszurl: PCWSTR, ppwszsecurl: Long, psuaction: PSUACTION, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetGetSecurityUrl", longArrayOf(pwszurl, ppwszsecurl, psuaction.toLong(), dwreserved.toLong())).toInt()
}

public fun CoInternetGetSecurityUrlEx(puri: Long, ppsecuri: Long, psuaction: PSUACTION, dwreserved: ULong): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetGetSecurityUrlEx", longArrayOf(puri, ppsecuri, psuaction.toLong(), dwreserved.toLong())).toInt()
}

public fun CoInternetGetSession(dwsessionmode: UInt, ppiinternetsession: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetGetSession", longArrayOf(dwsessionmode.toLong(), ppiinternetsession, dwreserved.toLong())).toInt()
}

public fun CoInternetIsFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetIsFeatureEnabled", longArrayOf(featureentry.toLong(), dwflags.toLong())).toInt()
}

public fun CoInternetIsFeatureEnabledForIUri(featureentry: INTERNETFEATURELIST, dwflags: UInt, piuri: Long, psecmgr: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetIsFeatureEnabledForIUri", longArrayOf(featureentry.toLong(), dwflags.toLong(), piuri, psecmgr)).toInt()
}

public fun CoInternetIsFeatureEnabledForUrl(featureentry: INTERNETFEATURELIST, dwflags: UInt, szurl: PCWSTR, psecmgr: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetIsFeatureEnabledForUrl", longArrayOf(featureentry.toLong(), dwflags.toLong(), szurl, psecmgr)).toInt()
}

public fun CoInternetIsFeatureZoneElevationEnabled(szfromurl: PCWSTR, sztourl: PCWSTR, psecmgr: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetIsFeatureZoneElevationEnabled", longArrayOf(szfromurl, sztourl, psecmgr, dwflags.toLong())).toInt()
}

public fun CoInternetParseIUri(piuri: Long, parseaction: PARSEACTION, dwflags: UInt, pwzresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: ULong): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetParseIUri", longArrayOf(piuri, parseaction.toLong(), dwflags.toLong(), pwzresult, cchresult.toLong(), pcchresult, dwreserved.toLong())).toInt()
}

public fun CoInternetParseUrl(pwzurl: PCWSTR, parseaction: PARSEACTION, dwflags: UInt, pszresult: PWSTR, cchresult: UInt, pcchresult: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetParseUrl", longArrayOf(pwzurl, parseaction.toLong(), dwflags.toLong(), pszresult, cchresult.toLong(), pcchresult, dwreserved.toLong())).toInt()
}

public fun CoInternetQueryInfo(pwzurl: PCWSTR, queryoptions: QUERYOPTION, dwqueryflags: UInt, pvbuffer: Long, cbbuffer: UInt, pcbbuffer: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetQueryInfo", longArrayOf(pwzurl, queryoptions.toLong(), dwqueryflags.toLong(), pvbuffer, cbbuffer.toLong(), pcbbuffer, dwreserved.toLong())).toInt()
}

public fun CoInternetSetFeatureEnabled(featureentry: INTERNETFEATURELIST, dwflags: UInt, fenable: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CoInternetSetFeatureEnabled", longArrayOf(featureentry.toLong(), dwflags.toLong(), fenable.toLong())).toInt()
}

public fun CompareSecurityIds(pbsecurityid1: Long, dwlen1: UInt, pbsecurityid2: Long, dwlen2: UInt, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CompareSecurityIds", longArrayOf(pbsecurityid1, dwlen1.toLong(), pbsecurityid2, dwlen2.toLong(), dwreserved.toLong())).toInt()
}

public fun CompatFlagsFromClsid(pclsid: Long, pdwcompatflags: Long, pdwmiscstatusflags: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CompatFlagsFromClsid", longArrayOf(pclsid, pdwcompatflags, pdwmiscstatusflags)).toInt()
}

public fun CopyBindInfo(pcbisrc: Long, pbidest: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CopyBindInfo", longArrayOf(pcbisrc, pbidest)).toInt()
}

public fun CopyStgMedium(pcstgmedsrc: Long, pstgmeddest: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CopyStgMedium", longArrayOf(pcstgmedsrc, pstgmeddest)).toInt()
}

public fun CreateAsyncBindCtx(reserved: UInt, pbscb: Long, pefetc: Long, ppbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateAsyncBindCtx", longArrayOf(reserved.toLong(), pbscb, pefetc, ppbc)).toInt()
}

public fun CreateAsyncBindCtxEx(pbc: Long, dwoptions: UInt, pbscb: Long, penum: Long, ppbc: Long, reserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateAsyncBindCtxEx", longArrayOf(pbc, dwoptions.toLong(), pbscb, penum, ppbc, reserved.toLong())).toInt()
}

public fun CreateFormatEnumerator(cfmtetc: UInt, rgfmtetc: Long, ppenumfmtetc: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateFormatEnumerator", longArrayOf(cfmtetc.toLong(), rgfmtetc, ppenumfmtetc)).toInt()
}

public fun CreateURLMoniker(pmkctx: Long, szurl: PCWSTR, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateURLMoniker", longArrayOf(pmkctx, szurl, ppmk)).toInt()
}

public fun CreateURLMonikerEx(pmkctx: Long, szurl: PCWSTR, ppmk: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateURLMonikerEx", longArrayOf(pmkctx, szurl, ppmk, dwflags.toLong())).toInt()
}

public fun CreateURLMonikerEx2(pmkctx: Long, puri: Long, ppmk: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateURLMonikerEx2", longArrayOf(pmkctx, puri, ppmk, dwflags.toLong())).toInt()
}

public fun FaultInIEFeature(hwnd: HWND, pclassspec: Long, pquery: Long, dwflags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "FaultInIEFeature", longArrayOf(hwnd, pclassspec, pquery, dwflags.toLong())).toInt()
}

public fun FindMediaType(rgsztypes: PCSTR, rgcftypes: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "FindMediaType", longArrayOf(rgsztypes, rgcftypes)).toInt()
}

public fun FindMediaTypeClass(pbc: Long, sztype: PCSTR, pclsid: Long, reserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "FindMediaTypeClass", longArrayOf(pbc, sztype, pclsid, reserved.toLong())).toInt()
}

public fun FindMimeFromData(pbc: Long, pwzurl: PCWSTR, pbuffer: Long, cbsize: UInt, pwzmimeproposed: PCWSTR, dwmimeflags: UInt, ppwzmimeout: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "FindMimeFromData", longArrayOf(pbc, pwzurl, pbuffer, cbsize.toLong(), pwzmimeproposed, dwmimeflags.toLong(), ppwzmimeout, dwreserved.toLong())).toInt()
}

public fun GetClassFileOrMime(pbc: Long, szfilename: PCWSTR, pbuffer: Long, cbsize: UInt, szmime: PCWSTR, dwreserved: UInt, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "GetClassFileOrMime", longArrayOf(pbc, szfilename, pbuffer, cbsize.toLong(), szmime, dwreserved.toLong(), pclsid)).toInt()
}

public fun GetClassURL(szurl: PCWSTR, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "GetClassURL", longArrayOf(szurl, pclsid)).toInt()
}

public fun GetComponentIDFromCLSSPEC(pclassspec: Long, ppszcomponentid: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "GetComponentIDFromCLSSPEC", longArrayOf(pclassspec, ppszcomponentid)).toInt()
}

public fun GetSoftwareUpdateInfo(szdistunit: PCWSTR, psdi: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "GetSoftwareUpdateInfo", longArrayOf(szdistunit, psdi)).toInt()
}

public fun HlinkGoBack(punk: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "HlinkGoBack", longArrayOf(punk)).toInt()
}

public fun HlinkGoForward(punk: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "HlinkGoForward", longArrayOf(punk)).toInt()
}

public fun HlinkNavigateMoniker(punk: Long, pmktarget: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "HlinkNavigateMoniker", longArrayOf(punk, pmktarget)).toInt()
}

public fun HlinkNavigateString(punk: Long, sztarget: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "HlinkNavigateString", longArrayOf(punk, sztarget)).toInt()
}

public fun HlinkSimpleNavigateToMoniker(pmktarget: Long, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "HlinkSimpleNavigateToMoniker", longArrayOf(pmktarget, szlocation, sztargetframename, punk, pbc, param5, grfhlnf.toLong(), dwreserved.toLong())).toInt()
}

public fun HlinkSimpleNavigateToString(sztarget: PCWSTR, szlocation: PCWSTR, sztargetframename: PCWSTR, punk: Long, pbc: Long, param5: Long, grfhlnf: UInt, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "HlinkSimpleNavigateToString", longArrayOf(sztarget, szlocation, sztargetframename, punk, pbc, param5, grfhlnf.toLong(), dwreserved.toLong())).toInt()
}

public fun IEGetUserPrivateNamespaceName(): PWSTR {
    return Win32DynamicFfi.invoke("urlmon.dll", "IEGetUserPrivateNamespaceName", longArrayOf())
}

public fun IEInstallScope(pdwscope: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "IEInstallScope", longArrayOf(pdwscope)).toInt()
}

public fun IsAsyncMoniker(pmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "IsAsyncMoniker", longArrayOf(pmk)).toInt()
}

public fun IsLoggingEnabledA(pszurl: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("urlmon.dll", "IsLoggingEnabledA", longArrayOf(pszurl)).toInt()
}

public fun IsLoggingEnabledW(pwszurl: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("urlmon.dll", "IsLoggingEnabledW", longArrayOf(pwszurl)).toInt()
}

public fun IsValidURL(pbc: Long, szurl: PCWSTR, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "IsValidURL", longArrayOf(pbc, szurl, dwreserved.toLong())).toInt()
}

public fun MkParseDisplayNameEx(pbc: Long, szdisplayname: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "MkParseDisplayNameEx", longArrayOf(pbc, szdisplayname, pcheaten, ppmk)).toInt()
}

public fun ObtainUserAgentString(dwoption: UInt, pszuaout: PSTR, cbsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "ObtainUserAgentString", longArrayOf(dwoption.toLong(), pszuaout, cbsize)).toInt()
}

public fun RegisterBindStatusCallback(pbc: Long, pbscb: Long, ppbscbprev: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "RegisterBindStatusCallback", longArrayOf(pbc, pbscb, ppbscbprev, dwreserved.toLong())).toInt()
}

public fun RegisterFormatEnumerator(pbc: Long, pefetc: Long, reserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "RegisterFormatEnumerator", longArrayOf(pbc, pefetc, reserved.toLong())).toInt()
}

public fun RegisterMediaTypeClass(pbc: Long, ctypes: UInt, rgsztypes: Long, rgclsid: Long, reserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "RegisterMediaTypeClass", longArrayOf(pbc, ctypes.toLong(), rgsztypes, rgclsid, reserved.toLong())).toInt()
}

public fun RegisterMediaTypes(ctypes: UInt, rgsztypes: Long, rgcftypes: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "RegisterMediaTypes", longArrayOf(ctypes.toLong(), rgsztypes, rgcftypes)).toInt()
}

public fun ReleaseBindInfo(pbindinfo: Long) {
    Win32DynamicFfi.invoke("urlmon.dll", "ReleaseBindInfo", longArrayOf(pbindinfo))
}

public fun RevokeBindStatusCallback(pbc: Long, pbscb: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "RevokeBindStatusCallback", longArrayOf(pbc, pbscb)).toInt()
}

public fun RevokeFormatEnumerator(pbc: Long, pefetc: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "RevokeFormatEnumerator", longArrayOf(pbc, pefetc)).toInt()
}

public fun SetAccessForIEAppContainer(hobject: HANDLE, ieobjecttype: IEObjectType, dwaccessmask: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "SetAccessForIEAppContainer", longArrayOf(hobject, ieobjecttype.toLong(), dwaccessmask.toLong())).toInt()
}

public fun SetSoftwareUpdateAdvertisementState(szdistunit: PCWSTR, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "SetSoftwareUpdateAdvertisementState", longArrayOf(szdistunit, dwadstate.toLong(), dwadvertisedversionms.toLong(), dwadvertisedversionls.toLong())).toInt()
}

public fun URLDownloadToCacheFileA(param0: Long, param1: PCSTR, param2: PSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLDownloadToCacheFileA", longArrayOf(param0, param1, param2, cchfilename.toLong(), param4.toLong(), param5)).toInt()
}

public fun URLDownloadToCacheFileW(param0: Long, param1: PCWSTR, param2: PWSTR, cchfilename: UInt, param4: UInt, param5: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLDownloadToCacheFileW", longArrayOf(param0, param1, param2, cchfilename.toLong(), param4.toLong(), param5)).toInt()
}

public fun URLDownloadToFileA(param0: Long, param1: PCSTR, param2: PCSTR, param3: UInt, param4: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLDownloadToFileA", longArrayOf(param0, param1, param2, param3.toLong(), param4)).toInt()
}

public fun URLDownloadToFileW(param0: Long, param1: PCWSTR, param2: PCWSTR, param3: UInt, param4: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLDownloadToFileW", longArrayOf(param0, param1, param2, param3.toLong(), param4)).toInt()
}

public fun URLOpenBlockingStreamA(param0: Long, param1: PCSTR, param2: Long, param3: UInt, param4: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLOpenBlockingStreamA", longArrayOf(param0, param1, param2, param3.toLong(), param4)).toInt()
}

public fun URLOpenBlockingStreamW(param0: Long, param1: PCWSTR, param2: Long, param3: UInt, param4: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLOpenBlockingStreamW", longArrayOf(param0, param1, param2, param3.toLong(), param4)).toInt()
}

public fun URLOpenPullStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLOpenPullStreamA", longArrayOf(param0, param1, param2.toLong(), param3)).toInt()
}

public fun URLOpenPullStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLOpenPullStreamW", longArrayOf(param0, param1, param2.toLong(), param3)).toInt()
}

public fun URLOpenStreamA(param0: Long, param1: PCSTR, param2: UInt, param3: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLOpenStreamA", longArrayOf(param0, param1, param2.toLong(), param3)).toInt()
}

public fun URLOpenStreamW(param0: Long, param1: PCWSTR, param2: UInt, param3: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "URLOpenStreamW", longArrayOf(param0, param1, param2.toLong(), param3)).toInt()
}

public fun UrlMkGetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, pdwbufferlengthout: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "UrlMkGetSessionOption", longArrayOf(dwoption.toLong(), pbuffer, dwbufferlength.toLong(), pdwbufferlengthout, dwreserved.toLong())).toInt()
}

public fun UrlMkSetSessionOption(dwoption: UInt, pbuffer: Long, dwbufferlength: UInt, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "UrlMkSetSessionOption", longArrayOf(dwoption.toLong(), pbuffer, dwbufferlength.toLong(), dwreserved.toLong())).toInt()
}

public fun WriteHitLogging(lplogginginfo: Long): BOOL {
    return Win32DynamicFfi.invoke("urlmon.dll", "WriteHitLogging", longArrayOf(lplogginginfo)).toInt()
}
