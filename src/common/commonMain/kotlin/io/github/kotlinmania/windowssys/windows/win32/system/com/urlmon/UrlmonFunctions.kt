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

public expect fun coGetClassObjectFromURL(rclassid: ConstPtr<Guid>, szcode: Pcwstr, dwfileversionms: UInt, dwfileversionls: UInt, sztype: Pcwstr, pbindctx: MutPtr<CVoid>, dwclscontext: Clsctx, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coInternetCombineIUri(pbaseuri: MutPtr<CVoid>, prelativeuri: MutPtr<CVoid>, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult

public expect fun coInternetCombineUrl(pwzbaseurl: Pcwstr, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult

public expect fun coInternetCombineUrlEx(pbaseuri: MutPtr<CVoid>, pwzrelativeurl: Pcwstr, dwcombineflags: UInt, ppcombineduri: MutPtr<MutPtr<CVoid>>, dwreserved: ULong): Hresult

public expect fun coInternetCompareUrl(pwzurl1: Pcwstr, pwzurl2: Pcwstr, dwflags: UInt): Hresult

public expect fun coInternetCreateSecurityManager(psp: MutPtr<CVoid>, ppsm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult

public expect fun coInternetCreateZoneManager(psp: MutPtr<CVoid>, ppzm: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult

public expect fun coInternetGetProtocolFlags(pwzurl: Pcwstr, pdwflags: MutPtr<UInt>, dwreserved: UInt): Hresult

public expect fun coInternetGetSecurityUrl(pwszurl: Pcwstr, ppwszsecurl: MutPtr<Pwstr>, psuaction: Psuaction, dwreserved: UInt): Hresult

public expect fun coInternetGetSecurityUrlEx(puri: MutPtr<CVoid>, ppsecuri: MutPtr<MutPtr<CVoid>>, psuaction: Psuaction, dwreserved: ULong): Hresult

public expect fun coInternetGetSession(dwsessionmode: UInt, ppiinternetsession: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult

public expect fun coInternetIsFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt): Hresult

public expect fun coInternetIsFeatureEnabledForIUri(featureentry: Internetfeaturelist, dwflags: UInt, piuri: MutPtr<CVoid>, psecmgr: MutPtr<CVoid>): Hresult

public expect fun coInternetIsFeatureEnabledForUrl(featureentry: Internetfeaturelist, dwflags: UInt, szurl: Pcwstr, psecmgr: MutPtr<CVoid>): Hresult

public expect fun coInternetIsFeatureZoneElevationEnabled(szfromurl: Pcwstr, sztourl: Pcwstr, psecmgr: MutPtr<CVoid>, dwflags: UInt): Hresult

public expect fun coInternetParseIUri(piuri: MutPtr<CVoid>, parseaction: Parseaction, dwflags: UInt, pwzresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: ULong): Hresult

public expect fun coInternetParseUrl(pwzurl: Pcwstr, parseaction: Parseaction, dwflags: UInt, pszresult: Pwstr, cchresult: UInt, pcchresult: MutPtr<UInt>, dwreserved: UInt): Hresult

public expect fun coInternetQueryInfo(pwzurl: Pcwstr, queryoptions: Queryoption, dwqueryflags: UInt, pvbuffer: MutPtr<CVoid>, cbbuffer: UInt, pcbbuffer: MutPtr<UInt>, dwreserved: UInt): Hresult

public expect fun coInternetSetFeatureEnabled(featureentry: Internetfeaturelist, dwflags: UInt, fenable: Bool): Hresult

public expect fun compareSecurityIds(pbsecurityid1: ConstPtr<UByte>, dwlen1: UInt, pbsecurityid2: ConstPtr<UByte>, dwlen2: UInt, dwreserved: UInt): Hresult

public expect fun compatFlagsFromClsid(pclsid: ConstPtr<Guid>, pdwcompatflags: MutPtr<UInt>, pdwmiscstatusflags: MutPtr<UInt>): Hresult

public expect fun copyBindInfo(pcbisrc: ConstPtr<Bindinfo>, pbidest: MutPtr<Bindinfo>): Hresult

public expect fun copyStgMedium(pcstgmedsrc: ConstPtr<Stgmedium>, pstgmeddest: MutPtr<Stgmedium>): Hresult

public expect fun createAsyncBindCtx(reserved: UInt, pbscb: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createAsyncBindCtxEx(pbc: MutPtr<CVoid>, dwoptions: UInt, pbscb: MutPtr<CVoid>, penum: MutPtr<CVoid>, ppbc: MutPtr<MutPtr<CVoid>>, reserved: UInt): Hresult

public expect fun createFormatEnumerator(cfmtetc: UInt, rgfmtetc: ConstPtr<Formatetc>, ppenumfmtetc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createURLMoniker(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createURLMonikerEx(pmkctx: MutPtr<CVoid>, szurl: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult

public expect fun createURLMonikerEx2(pmkctx: MutPtr<CVoid>, puri: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult

public expect fun faultInIEFeature(hwnd: Hwnd, pclassspec: ConstPtr<UClsspec>, pquery: MutPtr<Querycontext>, dwflags: UInt): Hresult

public expect fun findMediaType(rgsztypes: Pcstr, rgcftypes: MutPtr<UShort>): Hresult

public expect fun findMediaTypeClass(pbc: MutPtr<CVoid>, sztype: Pcstr, pclsid: MutPtr<Guid>, reserved: UInt): Hresult

public expect fun findMimeFromData(pbc: MutPtr<CVoid>, pwzurl: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, pwzmimeproposed: Pcwstr, dwmimeflags: UInt, ppwzmimeout: MutPtr<Pwstr>, dwreserved: UInt): Hresult

public expect fun getClassFileOrMime(pbc: MutPtr<CVoid>, szfilename: Pcwstr, pbuffer: ConstPtr<CVoid>, cbsize: UInt, szmime: Pcwstr, dwreserved: UInt, pclsid: MutPtr<Guid>): Hresult

public expect fun getClassURL(szurl: Pcwstr, pclsid: MutPtr<Guid>): Hresult

public expect fun getComponentIDFromCLSSPEC(pclassspec: ConstPtr<UClsspec>, ppszcomponentid: MutPtr<Pstr>): Hresult

public expect fun getSoftwareUpdateInfo(szdistunit: Pcwstr, psdi: MutPtr<Softdistinfo>): Hresult

public expect fun hlinkGoBack(punk: MutPtr<CVoid>): Hresult

public expect fun hlinkGoForward(punk: MutPtr<CVoid>): Hresult

public expect fun hlinkNavigateMoniker(punk: MutPtr<CVoid>, pmktarget: MutPtr<CVoid>): Hresult

public expect fun hlinkNavigateString(punk: MutPtr<CVoid>, sztarget: Pcwstr): Hresult

public expect fun hlinkSimpleNavigateToMoniker(pmktarget: MutPtr<CVoid>, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult

public expect fun hlinkSimpleNavigateToString(sztarget: Pcwstr, szlocation: Pcwstr, sztargetframename: Pcwstr, punk: MutPtr<CVoid>, pbc: MutPtr<CVoid>, param5: MutPtr<CVoid>, grfhlnf: UInt, dwreserved: UInt): Hresult

public expect fun iEGetUserPrivateNamespaceName(): Pwstr

public expect fun iEInstallScope(pdwscope: MutPtr<UInt>): Hresult

public expect fun isAsyncMoniker(pmk: MutPtr<CVoid>): Hresult

public expect fun isLoggingEnabledA(pszurl: Pcstr): Bool

public expect fun isLoggingEnabledW(pwszurl: Pcwstr): Bool

public expect fun isValidURL(pbc: MutPtr<CVoid>, szurl: Pcwstr, dwreserved: UInt): Hresult

public expect fun mkParseDisplayNameEx(pbc: MutPtr<CVoid>, szdisplayname: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun obtainUserAgentString(dwoption: UInt, pszuaout: Pstr, cbsize: MutPtr<UInt>): Hresult

public expect fun registerBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>, ppbscbprev: MutPtr<MutPtr<CVoid>>, dwreserved: UInt): Hresult

public expect fun registerFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>, reserved: UInt): Hresult

public expect fun registerMediaTypeClass(pbc: MutPtr<CVoid>, ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgclsid: ConstPtr<Guid>, reserved: UInt): Hresult

public expect fun registerMediaTypes(ctypes: UInt, rgsztypes: ConstPtr<Pcstr>, rgcftypes: MutPtr<UShort>): Hresult

public expect fun releaseBindInfo(pbindinfo: MutPtr<Bindinfo>)

public expect fun revokeBindStatusCallback(pbc: MutPtr<CVoid>, pbscb: MutPtr<CVoid>): Hresult

public expect fun revokeFormatEnumerator(pbc: MutPtr<CVoid>, pefetc: MutPtr<CVoid>): Hresult

public expect fun setAccessForIEAppContainer(hobject: Handle, ieobjecttype: IEObjectType, dwaccessmask: UInt): Hresult

public expect fun setSoftwareUpdateAdvertisementState(szdistunit: Pcwstr, dwadstate: UInt, dwadvertisedversionms: UInt, dwadvertisedversionls: UInt): Hresult

public expect fun uRLDownloadToCacheFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult

public expect fun uRLDownloadToCacheFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pwstr, cchfilename: UInt, param4: UInt, param5: MutPtr<CVoid>): Hresult

public expect fun uRLDownloadToFileA(param0: MutPtr<CVoid>, param1: Pcstr, param2: Pcstr, param3: UInt, param4: MutPtr<CVoid>): Hresult

public expect fun uRLDownloadToFileW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: Pcwstr, param3: UInt, param4: MutPtr<CVoid>): Hresult

public expect fun uRLOpenBlockingStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult

public expect fun uRLOpenBlockingStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: MutPtr<MutPtr<CVoid>>, param3: UInt, param4: MutPtr<CVoid>): Hresult

public expect fun uRLOpenPullStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult

public expect fun uRLOpenPullStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult

public expect fun uRLOpenStreamA(param0: MutPtr<CVoid>, param1: Pcstr, param2: UInt, param3: MutPtr<CVoid>): Hresult

public expect fun uRLOpenStreamW(param0: MutPtr<CVoid>, param1: Pcwstr, param2: UInt, param3: MutPtr<CVoid>): Hresult

public expect fun urlMkGetSessionOption(dwoption: UInt, pbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbufferlengthout: MutPtr<UInt>, dwreserved: UInt): Hresult

public expect fun urlMkSetSessionOption(dwoption: UInt, pbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwreserved: UInt): Hresult

public expect fun writeHitLogging(lplogginginfo: ConstPtr<HitLoggingInfo>): Bool
