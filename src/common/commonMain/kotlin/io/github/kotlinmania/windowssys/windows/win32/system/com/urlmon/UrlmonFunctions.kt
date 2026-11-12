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

public expect fun coGetClassObjectFromURL(rclassid: ConstPtr, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr, dwclscontext: Clsctx, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun coInternetCombineIUri(pbaseuri: MutPtr, prelativeuri: MutPtr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult

public expect fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetCombineUrlEx(pbaseuri: MutPtr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr, dwreserved: ULong): Hresult

public expect fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult

public expect fun coInternetCreateSecurityManager(psp: MutPtr, ppsm: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetCreateZoneManager(psp: MutPtr, ppzm: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr, psuaction: Psuaction, dwreserved: UInt): Hresult

public expect fun coInternetGetSecurityUrlEx(puri: MutPtr, ppsecuri: MutPtr, psuaction: Psuaction, dwreserved: ULong): Hresult

public expect fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult

public expect fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr, psecmgr: MutPtr): Hresult

public expect fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr): Hresult

public expect fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr, dwflags: UInt): Hresult

public expect fun coInternetParseIUri(piuri: MutPtr, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: ULong): Hresult

public expect fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr, cbbuffer: UInt, pcbbuffer: MutPtr, dwreserved: UInt): Hresult

public expect fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult

public expect fun compareSecurityIds(pbsecurityid1: ConstPtr, dwlen1: UInt, pbsecurityid2: ConstPtr, dwlen2: UInt, dwreserved: UInt): Hresult

public expect fun compatFlagsFromClsid(pclsid: ConstPtr, pdwcompatflags: MutPtr, pdwmiscstatusflags: MutPtr): Hresult

public expect fun copyBindInfo(pcbisrc: ConstPtr, pbidest: MutPtr): Hresult

public expect fun copyStgMedium(pcstgmedsrc: ConstPtr, pstgmeddest: MutPtr): Hresult

public expect fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr, pefetc: MutPtr, ppbc: MutPtr): Hresult

public expect fun createAsyncBindCtxEx(pbc: MutPtr, dwoptions: UInt, pbscb: MutPtr, penum: MutPtr, ppbc: MutPtr, reserved: UInt): Hresult

public expect fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr, ppenumfmtetc: MutPtr): Hresult

public expect fun createURLMoniker(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr): Hresult

public expect fun createURLMonikerEx(pmkctx: MutPtr, szurl: Pcwstr, ppmk: MutPtr, dwflags: UInt): Hresult

public expect fun createURLMonikerEx2(pmkctx: MutPtr, puri: MutPtr, ppmk: MutPtr, dwflags: UInt): Hresult

public expect fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr, pquery: MutPtr, dwflags: UInt): Hresult

public expect fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr): Hresult

public expect fun findMediaTypeClass(pbc: MutPtr, sztype: Pcstr, pclsid: MutPtr, reserved: UInt): Hresult

public expect fun findMimeFromData(pbc: MutPtr, pwzurl: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr, dwreserved: UInt): Hresult

public expect fun getClassFileOrMime(pbc: MutPtr, szfilename: Pcwstr, pbuffer: ConstPtr, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr): Hresult

public expect fun getClassURL(szurl: Pcwstr, pclsid: MutPtr): Hresult

public expect fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr, ppszcomponentid: MutPtr): Hresult

public expect fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr): Hresult

public expect fun hlinkGoBack(punk: MutPtr): Hresult

public expect fun hlinkGoForward(punk: MutPtr): Hresult

public expect fun hlinkNavigateMoniker(punk: MutPtr, pmktarget: MutPtr): Hresult

public expect fun hlinkNavigateString(punk: MutPtr, sztarget: Pcwstr): Hresult

public expect fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult

public expect fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr, pbc: MutPtr, param5: MutPtr, grfhlnf: UInt, dwreserved: UInt): Hresult

public expect fun iEGetUserPrivateNamespaceName(): Pwstr

public expect fun iEInstallScope(pdwscope: MutPtr): Hresult

public expect fun isAsyncMoniker(pmk: MutPtr): Hresult

public expect fun isLoggingEnabledA(pszurl: Pcstr): Bool

public expect fun isLoggingEnabledW(pwszurl: Pcwstr): Bool

public expect fun isValidURL(pbc: MutPtr, szurl: Pcwstr, dwreserved: UInt): Hresult

public expect fun mkParseDisplayNameEx(pbc: MutPtr, szdisplayname: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult

public expect fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr): Hresult

public expect fun registerBindStatusCallback(pbc: MutPtr, pbscb: MutPtr, ppbscbprev: MutPtr, dwreserved: UInt): Hresult

public expect fun registerFormatEnumerator(pbc: MutPtr, pefetc: MutPtr, reserved: UInt): Hresult

public expect fun registerMediaTypeClass(pbc: MutPtr, ctypes: UInt, rgsztypes: ConstPtr, rgclsid: ConstPtr, reserved: UInt): Hresult

public expect fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr, rgcftypes: MutPtr): Hresult

public expect fun releaseBindInfo(pbindinfo: MutPtr)

public expect fun revokeBindStatusCallback(pbc: MutPtr, pbscb: MutPtr): Hresult

public expect fun revokeFormatEnumerator(pbc: MutPtr, pefetc: MutPtr): Hresult

public expect fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult

public expect fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult

public expect fun uRLDownloadToCacheFileA(param0: MutPtr, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult

public expect fun uRLDownloadToCacheFileW(param0: MutPtr, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr): Hresult

public expect fun uRLDownloadToFileA(param0: MutPtr, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr): Hresult

public expect fun uRLDownloadToFileW(param0: MutPtr, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr): Hresult

public expect fun uRLOpenBlockingStreamA(param0: MutPtr, param1: Pcstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult

public expect fun uRLOpenBlockingStreamW(param0: MutPtr, param1: Pcwstr, param2: MutPtr, param3: UInt, param4: MutPtr): Hresult

public expect fun uRLOpenPullStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult

public expect fun uRLOpenPullStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult

public expect fun uRLOpenStreamA(param0: MutPtr, param1: Pcstr, param2: UInt, param3: MutPtr): Hresult

public expect fun uRLOpenStreamW(param0: MutPtr, param1: Pcwstr, param2: UInt, param3: MutPtr): Hresult

public expect fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr, dwbufferlength: UInt, pdwbufferlengthout: MutPtr, dwreserved: UInt): Hresult

public expect fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr, dwbufferlength: UInt, dwreserved: UInt): Hresult

public expect fun writeHitLogging(lplogginginfo: ConstPtr): Bool
