#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_com_urlmon_coGetClassObjectFromURL(void* rclassid, void* szcode, uint32_t dwfileversionms, uint32_t dwfileversionls, void* sztype, void* pbindctx, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetCombineIUri(void* pbaseuri, void* prelativeuri, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetCombineUrl(void* pwzbaseurl, void* pwzrelativeurl, uint32_t dwcombineflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetCombineUrlEx(void* pbaseuri, void* pwzrelativeurl, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetCompareUrl(void* pwzurl1, void* pwzurl2, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetCreateSecurityManager(void* psp, void* ppsm, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetCreateZoneManager(void* psp, void* ppzm, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetGetProtocolFlags(void* pwzurl, void* pdwflags, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrl(void* pwszurl, void* ppwszsecurl, int32_t psuaction, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetGetSecurityUrlEx(void* puri, void* ppsecuri, int32_t psuaction, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetGetSession(uint32_t dwsessionmode, void* ppiinternetsession, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabled(int32_t featureentry, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForIUri(int32_t featureentry, uint32_t dwflags, void* piuri, void* psecmgr);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureEnabledForUrl(int32_t featureentry, uint32_t dwflags, void* szurl, void* psecmgr);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetIsFeatureZoneElevationEnabled(void* szfromurl, void* sztourl, void* psecmgr, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetParseIUri(void* piuri, int32_t parseaction, uint32_t dwflags, void* pwzresult, uint32_t cchresult, void* pcchresult, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetParseUrl(void* pwzurl, int32_t parseaction, uint32_t dwflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetQueryInfo(void* pwzurl, int32_t queryoptions, uint32_t dwqueryflags, void* pvbuffer, uint32_t cbbuffer, void* pcbbuffer, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_coInternetSetFeatureEnabled(int32_t featureentry, uint32_t dwflags, int32_t fenable);
int32_t windowssys_windows_win32_system_com_urlmon_compareSecurityIds(void* pbsecurityid1, uint32_t dwlen1, void* pbsecurityid2, uint32_t dwlen2, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_compatFlagsFromClsid(void* pclsid, void* pdwcompatflags, void* pdwmiscstatusflags);
int32_t windowssys_windows_win32_system_com_urlmon_copyBindInfo(void* pcbisrc, void* pbidest);
int32_t windowssys_windows_win32_system_com_urlmon_copyStgMedium(void* pcstgmedsrc, void* pstgmeddest);
int32_t windowssys_windows_win32_system_com_urlmon_createAsyncBindCtx(uint32_t reserved, void* pbscb, void* pefetc, void* ppbc);
int32_t windowssys_windows_win32_system_com_urlmon_createAsyncBindCtxEx(void* pbc, uint32_t dwoptions, void* pbscb, void* penum, void* ppbc, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_createFormatEnumerator(uint32_t cfmtetc, void* rgfmtetc, void* ppenumfmtetc);
int32_t windowssys_windows_win32_system_com_urlmon_createURLMoniker(void* pmkctx, void* szurl, void* ppmk);
int32_t windowssys_windows_win32_system_com_urlmon_createURLMonikerEx(void* pmkctx, void* szurl, void* ppmk, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_createURLMonikerEx2(void* pmkctx, void* puri, void* ppmk, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_faultInIEFeature(void* hwnd, void* pclassspec, void* pquery, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_findMediaType(void* rgsztypes, void* rgcftypes);
int32_t windowssys_windows_win32_system_com_urlmon_findMediaTypeClass(void* pbc, void* sztype, void* pclsid, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_findMimeFromData(void* pbc, void* pwzurl, void* pbuffer, uint32_t cbsize, void* pwzmimeproposed, uint32_t dwmimeflags, void* ppwzmimeout, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_getClassFileOrMime(void* pbc, void* szfilename, void* pbuffer, uint32_t cbsize, void* szmime, uint32_t dwreserved, void* pclsid);
int32_t windowssys_windows_win32_system_com_urlmon_getClassURL(void* szurl, void* pclsid);
int32_t windowssys_windows_win32_system_com_urlmon_getComponentIDFromCLSSPEC(void* pclassspec, void* ppszcomponentid);
int32_t windowssys_windows_win32_system_com_urlmon_getSoftwareUpdateInfo(void* szdistunit, void* psdi);
int32_t windowssys_windows_win32_system_com_urlmon_hlinkGoBack(void* punk);
int32_t windowssys_windows_win32_system_com_urlmon_hlinkGoForward(void* punk);
int32_t windowssys_windows_win32_system_com_urlmon_hlinkNavigateMoniker(void* punk, void* pmktarget);
int32_t windowssys_windows_win32_system_com_urlmon_hlinkNavigateString(void* punk, void* sztarget);
int32_t windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToMoniker(void* pmktarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_hlinkSimpleNavigateToString(void* sztarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved);
void* windowssys_windows_win32_system_com_urlmon_iEGetUserPrivateNamespaceName(void);
int32_t windowssys_windows_win32_system_com_urlmon_iEInstallScope(void* pdwscope);
int32_t windowssys_windows_win32_system_com_urlmon_isAsyncMoniker(void* pmk);
int32_t windowssys_windows_win32_system_com_urlmon_isLoggingEnabledA(void* pszurl);
int32_t windowssys_windows_win32_system_com_urlmon_isLoggingEnabledW(void* pwszurl);
int32_t windowssys_windows_win32_system_com_urlmon_isValidURL(void* pbc, void* szurl, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_mkParseDisplayNameEx(void* pbc, void* szdisplayname, void* pcheaten, void* ppmk);
int32_t windowssys_windows_win32_system_com_urlmon_obtainUserAgentString(uint32_t dwoption, void* pszuaout, void* cbsize);
int32_t windowssys_windows_win32_system_com_urlmon_registerBindStatusCallback(void* pbc, void* pbscb, void* ppbscbprev, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_registerFormatEnumerator(void* pbc, void* pefetc, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_registerMediaTypeClass(void* pbc, uint32_t ctypes, void* rgsztypes, void* rgclsid, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_registerMediaTypes(uint32_t ctypes, void* rgsztypes, void* rgcftypes);
void windowssys_windows_win32_system_com_urlmon_releaseBindInfo(void* pbindinfo);
int32_t windowssys_windows_win32_system_com_urlmon_revokeBindStatusCallback(void* pbc, void* pbscb);
int32_t windowssys_windows_win32_system_com_urlmon_revokeFormatEnumerator(void* pbc, void* pefetc);
int32_t windowssys_windows_win32_system_com_urlmon_setAccessForIEAppContainer(void* hobject, int32_t ieobjecttype, uint32_t dwaccessmask);
int32_t windowssys_windows_win32_system_com_urlmon_setSoftwareUpdateAdvertisementState(void* szdistunit, uint32_t dwadstate, uint32_t dwadvertisedversionms, uint32_t dwadvertisedversionls);
int32_t windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileA(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5);
int32_t windowssys_windows_win32_system_com_urlmon_uRLDownloadToCacheFileW(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5);
int32_t windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileA(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_uRLDownloadToFileW(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamA(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_uRLOpenBlockingStreamW(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_uRLOpenPullStreamW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_uRLOpenStreamA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_uRLOpenStreamW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_urlMkGetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, void* pdwbufferlengthout, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_urlMkSetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_writeHitLogging(void* lplogginginfo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H */
