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

public expect fun coGetClassObjectFromURL(rclassid: COpaquePointer?, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: COpaquePointer?, dwclscontext: Clsctx, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun coInternetCombineIUri(pbaseuri: COpaquePointer?, prelativeuri: COpaquePointer?, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult

public expect fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetCombineUrlEx(pbaseuri: COpaquePointer?, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: COpaquePointer?, dwreserved: ULong): Hresult

public expect fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult

public expect fun coInternetCreateSecurityManager(psp: COpaquePointer?, ppsm: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetCreateZoneManager(psp: COpaquePointer?, ppzm: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: COpaquePointer?, psuaction: Psuaction, dwreserved: UInt): Hresult

public expect fun coInternetGetSecurityUrlEx(puri: COpaquePointer?, ppsecuri: COpaquePointer?, psuaction: Psuaction, dwreserved: ULong): Hresult

public expect fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult

public expect fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: COpaquePointer?, psecmgr: COpaquePointer?): Hresult

public expect fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: COpaquePointer?): Hresult

public expect fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: COpaquePointer?, dwflags: UInt): Hresult

public expect fun coInternetParseIUri(piuri: COpaquePointer?, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: ULong): Hresult

public expect fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: COpaquePointer?, cbbuffer: UInt, pcbbuffer: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult

public expect fun compareSecurityIds(pbsecurityid1: COpaquePointer?, dwlen1: UInt, pbsecurityid2: COpaquePointer?, dwlen2: UInt, dwreserved: UInt): Hresult

public expect fun compatFlagsFromClsid(pclsid: COpaquePointer?, pdwcompatflags: COpaquePointer?, pdwmiscstatusflags: COpaquePointer?): Hresult

public expect fun copyBindInfo(pcbisrc: COpaquePointer?, pbidest: COpaquePointer?): Hresult

public expect fun copyStgMedium(pcstgmedsrc: COpaquePointer?, pstgmeddest: COpaquePointer?): Hresult

public expect fun createAsyncBindCtx(reserved: UInt, pbscb: COpaquePointer?, pefetc: COpaquePointer?, ppbc: COpaquePointer?): Hresult

public expect fun createAsyncBindCtxEx(pbc: COpaquePointer?, dwoptions: UInt, pbscb: COpaquePointer?, penum: COpaquePointer?, ppbc: COpaquePointer?, reserved: UInt): Hresult

public expect fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: COpaquePointer?, ppenumfmtetc: COpaquePointer?): Hresult

public expect fun createURLMoniker(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?): Hresult

public expect fun createURLMonikerEx(pmkctx: COpaquePointer?, szurl: Pcwstr, ppmk: COpaquePointer?, dwflags: UInt): Hresult

public expect fun createURLMonikerEx2(pmkctx: COpaquePointer?, puri: COpaquePointer?, ppmk: COpaquePointer?, dwflags: UInt): Hresult

public expect fun faultInIEFeature(hwnd: Hwnd, pclassspec: COpaquePointer?, pquery: COpaquePointer?, dwflags: UInt): Hresult

public expect fun findMediaType(rgsztypes: Pcstr, rgcftypes: COpaquePointer?): Hresult

public expect fun findMediaTypeClass(pbc: COpaquePointer?, sztype: Pcstr, pclsid: COpaquePointer?, reserved: UInt): Hresult

public expect fun findMimeFromData(pbc: COpaquePointer?, pwzurl: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun getClassFileOrMime(pbc: COpaquePointer?, szfilename: Pcwstr, pbuffer: COpaquePointer?, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: COpaquePointer?): Hresult

public expect fun getClassURL(szurl: Pcwstr, pclsid: COpaquePointer?): Hresult

public expect fun getComponentIDFromCLSSPEC(pclassspec: COpaquePointer?, ppszcomponentid: COpaquePointer?): Hresult

public expect fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: COpaquePointer?): Hresult

public expect fun hlinkGoBack(punk: COpaquePointer?): Hresult

public expect fun hlinkGoForward(punk: COpaquePointer?): Hresult

public expect fun hlinkNavigateMoniker(punk: COpaquePointer?, pmktarget: COpaquePointer?): Hresult

public expect fun hlinkNavigateString(punk: COpaquePointer?, sztarget: Pcwstr): Hresult

public expect fun hlinkSimpleNavigateToMoniker(pmktarget: COpaquePointer?, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult

public expect fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: COpaquePointer?, pbc: COpaquePointer?, param5: COpaquePointer?, grfhlnf: UInt, dwreserved: UInt): Hresult

public expect fun iEGetUserPrivateNamespaceName(): Pwstr

public expect fun iEInstallScope(pdwscope: COpaquePointer?): Hresult

public expect fun isAsyncMoniker(pmk: COpaquePointer?): Hresult

public expect fun isLoggingEnabledA(pszurl: Pcstr): Bool

public expect fun isLoggingEnabledW(pwszurl: Pcwstr): Bool

public expect fun isValidURL(pbc: COpaquePointer?, szurl: Pcwstr, dwreserved: UInt): Hresult

public expect fun mkParseDisplayNameEx(pbc: COpaquePointer?, szdisplayname: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult

public expect fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: COpaquePointer?): Hresult

public expect fun registerBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?, ppbscbprev: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun registerFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?, reserved: UInt): Hresult

public expect fun registerMediaTypeClass(pbc: COpaquePointer?, ctypes: UInt, rgsztypes: COpaquePointer?, rgclsid: COpaquePointer?, reserved: UInt): Hresult

public expect fun registerMediaTypes(ctypes: UInt, rgsztypes: COpaquePointer?, rgcftypes: COpaquePointer?): Hresult

public expect fun releaseBindInfo(pbindinfo: COpaquePointer?)

public expect fun revokeBindStatusCallback(pbc: COpaquePointer?, pbscb: COpaquePointer?): Hresult

public expect fun revokeFormatEnumerator(pbc: COpaquePointer?, pefetc: COpaquePointer?): Hresult

public expect fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult

public expect fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult

public expect fun uRLDownloadToCacheFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult

public expect fun uRLDownloadToCacheFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: COpaquePointer?): Hresult

public expect fun uRLDownloadToFileA(param0: COpaquePointer?, param1: Pcstr, param2: Pcstr, param3: UInt, param4: COpaquePointer?): Hresult

public expect fun uRLDownloadToFileW(param0: COpaquePointer?, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: COpaquePointer?): Hresult

public expect fun uRLOpenBlockingStreamA(param0: COpaquePointer?, param1: Pcstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult

public expect fun uRLOpenBlockingStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: COpaquePointer?, param3: UInt, param4: COpaquePointer?): Hresult

public expect fun uRLOpenPullStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult

public expect fun uRLOpenPullStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult

public expect fun uRLOpenStreamA(param0: COpaquePointer?, param1: Pcstr, param2: UInt, param3: COpaquePointer?): Hresult

public expect fun uRLOpenStreamW(param0: COpaquePointer?, param1: Pcwstr, param2: UInt, param3: COpaquePointer?): Hresult

public expect fun urlMkGetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, pdwbufferlengthout: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun urlMkSetSessionOption(dwoption: UInt, pbuffer: COpaquePointer?, dwbufferlength: UInt, dwreserved: UInt): Hresult

public expect fun writeHitLogging(lplogginginfo: COpaquePointer?): Bool
