#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemComUrlmonCoGetClassObjectFromURL(void* rclassid, void* szcode, uint32_t dwfileversionms, uint32_t dwfileversionls, void* sztype, void* pbindctx, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetCombineIUri(void* pbaseuri, void* prelativeuri, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrl(void* pwzbaseurl, void* pwzrelativeurl, uint32_t dwcombineflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetCombineUrlEx(void* pbaseuri, void* pwzrelativeurl, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetCompareUrl(void* pwzurl1, void* pwzurl2, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetCreateSecurityManager(void* psp, void* ppsm, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetCreateZoneManager(void* psp, void* ppzm, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetGetProtocolFlags(void* pwzurl, void* pdwflags, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrl(void* pwszurl, void* ppwszsecurl, int32_t psuaction, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetGetSecurityUrlEx(void* puri, void* ppsecuri, int32_t psuaction, uint64_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetGetSession(uint32_t dwsessionmode, void* ppiinternetsession, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabled(int32_t featureentry, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForIUri(int32_t featureentry, uint32_t dwflags, void* piuri, void* psecmgr);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureEnabledForUrl(int32_t featureentry, uint32_t dwflags, void* szurl, void* psecmgr);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetIsFeatureZoneElevationEnabled(void* szfromurl, void* sztourl, void* psecmgr, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetParseIUri(void* piuri, int32_t parseaction, uint32_t dwflags, void* pwzresult, uint32_t cchresult, void* pcchresult, uint64_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetParseUrl(void* pwzurl, int32_t parseaction, uint32_t dwflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetQueryInfo(void* pwzurl, int32_t queryoptions, uint32_t dwqueryflags, void* pvbuffer, uint32_t cbbuffer, void* pcbbuffer, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCoInternetSetFeatureEnabled(int32_t featureentry, uint32_t dwflags, int32_t fenable);
int32_t windowssysWindowsWin32SystemComUrlmonCompareSecurityIds(void* pbsecurityid1, uint32_t dwlen1, void* pbsecurityid2, uint32_t dwlen2, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonCompatFlagsFromClsid(void* pclsid, void* pdwcompatflags, void* pdwmiscstatusflags);
int32_t windowssysWindowsWin32SystemComUrlmonCopyBindInfo(void* pcbisrc, void* pbidest);
int32_t windowssysWindowsWin32SystemComUrlmonCopyStgMedium(void* pcstgmedsrc, void* pstgmeddest);
int32_t windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtx(uint32_t reserved, void* pbscb, void* pefetc, void* ppbc);
int32_t windowssysWindowsWin32SystemComUrlmonCreateAsyncBindCtxEx(void* pbc, uint32_t dwoptions, void* pbscb, void* penum, void* ppbc, uint32_t reserved);
int32_t windowssysWindowsWin32SystemComUrlmonCreateFormatEnumerator(uint32_t cfmtetc, void* rgfmtetc, void* ppenumfmtetc);
int32_t windowssysWindowsWin32SystemComUrlmonCreateURLMoniker(void* pmkctx, void* szurl, void* ppmk);
int32_t windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx(void* pmkctx, void* szurl, void* ppmk, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemComUrlmonCreateURLMonikerEx2(void* pmkctx, void* puri, void* ppmk, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemComUrlmonFaultInIEFeature(void* hwnd, void* pclassspec, void* pquery, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemComUrlmonFindMediaType(void* rgsztypes, void* rgcftypes);
int32_t windowssysWindowsWin32SystemComUrlmonFindMediaTypeClass(void* pbc, void* sztype, void* pclsid, uint32_t reserved);
int32_t windowssysWindowsWin32SystemComUrlmonFindMimeFromData(void* pbc, void* pwzurl, void* pbuffer, uint32_t cbsize, void* pwzmimeproposed, uint32_t dwmimeflags, void* ppwzmimeout, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonGetClassFileOrMime(void* pbc, void* szfilename, void* pbuffer, uint32_t cbsize, void* szmime, uint32_t dwreserved, void* pclsid);
int32_t windowssysWindowsWin32SystemComUrlmonGetClassURL(void* szurl, void* pclsid);
int32_t windowssysWindowsWin32SystemComUrlmonGetComponentIDFromCLSSPEC(void* pclassspec, void* ppszcomponentid);
int32_t windowssysWindowsWin32SystemComUrlmonGetSoftwareUpdateInfo(void* szdistunit, void* psdi);
int32_t windowssysWindowsWin32SystemComUrlmonHlinkGoBack(void* punk);
int32_t windowssysWindowsWin32SystemComUrlmonHlinkGoForward(void* punk);
int32_t windowssysWindowsWin32SystemComUrlmonHlinkNavigateMoniker(void* punk, void* pmktarget);
int32_t windowssysWindowsWin32SystemComUrlmonHlinkNavigateString(void* punk, void* sztarget);
int32_t windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToMoniker(void* pmktarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonHlinkSimpleNavigateToString(void* sztarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved);
void* windowssysWindowsWin32SystemComUrlmonIEGetUserPrivateNamespaceName(void);
int32_t windowssysWindowsWin32SystemComUrlmonIEInstallScope(void* pdwscope);
int32_t windowssysWindowsWin32SystemComUrlmonIsAsyncMoniker(void* pmk);
int32_t windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledA(void* pszurl);
int32_t windowssysWindowsWin32SystemComUrlmonIsLoggingEnabledW(void* pwszurl);
int32_t windowssysWindowsWin32SystemComUrlmonIsValidURL(void* pbc, void* szurl, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonMkParseDisplayNameEx(void* pbc, void* szdisplayname, void* pcheaten, void* ppmk);
int32_t windowssysWindowsWin32SystemComUrlmonObtainUserAgentString(uint32_t dwoption, void* pszuaout, void* cbsize);
int32_t windowssysWindowsWin32SystemComUrlmonRegisterBindStatusCallback(void* pbc, void* pbscb, void* ppbscbprev, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonRegisterFormatEnumerator(void* pbc, void* pefetc, uint32_t reserved);
int32_t windowssysWindowsWin32SystemComUrlmonRegisterMediaTypeClass(void* pbc, uint32_t ctypes, void* rgsztypes, void* rgclsid, uint32_t reserved);
int32_t windowssysWindowsWin32SystemComUrlmonRegisterMediaTypes(uint32_t ctypes, void* rgsztypes, void* rgcftypes);
void windowssysWindowsWin32SystemComUrlmonReleaseBindInfo(void* pbindinfo);
int32_t windowssysWindowsWin32SystemComUrlmonRevokeBindStatusCallback(void* pbc, void* pbscb);
int32_t windowssysWindowsWin32SystemComUrlmonRevokeFormatEnumerator(void* pbc, void* pefetc);
int32_t windowssysWindowsWin32SystemComUrlmonSetAccessForIEAppContainer(void* hobject, int32_t ieobjecttype, uint32_t dwaccessmask);
int32_t windowssysWindowsWin32SystemComUrlmonSetSoftwareUpdateAdvertisementState(void* szdistunit, uint32_t dwadstate, uint32_t dwadvertisedversionms, uint32_t dwadvertisedversionls);
int32_t windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileA(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5);
int32_t windowssysWindowsWin32SystemComUrlmonURLDownloadToCacheFileW(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5);
int32_t windowssysWindowsWin32SystemComUrlmonURLDownloadToFileA(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssysWindowsWin32SystemComUrlmonURLDownloadToFileW(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamA(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssysWindowsWin32SystemComUrlmonURLOpenBlockingStreamW(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32SystemComUrlmonURLOpenPullStreamW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32SystemComUrlmonURLOpenStreamA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32SystemComUrlmonURLOpenStreamW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssysWindowsWin32SystemComUrlmonUrlMkGetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, void* pdwbufferlengthout, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonUrlMkSetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComUrlmonWriteHitLogging(void* lplogginginfo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H */
