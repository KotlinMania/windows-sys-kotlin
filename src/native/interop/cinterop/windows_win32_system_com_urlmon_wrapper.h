#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_com_urlmon_CoGetClassObjectFromURL(void* rclassid, void* szcode, uint32_t dwfileversionms, uint32_t dwfileversionls, void* sztype, void* pbindctx, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCombineIUri(void* pbaseuri, void* prelativeuri, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrl(void* pwzbaseurl, void* pwzrelativeurl, uint32_t dwcombineflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCombineUrlEx(void* pbaseuri, void* pwzrelativeurl, uint32_t dwcombineflags, void* ppcombineduri, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCompareUrl(void* pwzurl1, void* pwzurl2, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCreateSecurityManager(void* psp, void* ppsm, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetCreateZoneManager(void* psp, void* ppzm, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetProtocolFlags(void* pwzurl, void* pdwflags, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrl(void* pwszurl, void* ppwszsecurl, int32_t psuaction, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetSecurityUrlEx(void* puri, void* ppsecuri, int32_t psuaction, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetGetSession(uint32_t dwsessionmode, void* ppiinternetsession, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabled(int32_t featureentry, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForIUri(int32_t featureentry, uint32_t dwflags, void* piuri, void* psecmgr);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureEnabledForUrl(int32_t featureentry, uint32_t dwflags, void* szurl, void* psecmgr);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetIsFeatureZoneElevationEnabled(void* szfromurl, void* sztourl, void* psecmgr, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetParseIUri(void* piuri, int32_t parseaction, uint32_t dwflags, void* pwzresult, uint32_t cchresult, void* pcchresult, uint64_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetParseUrl(void* pwzurl, int32_t parseaction, uint32_t dwflags, void* pszresult, uint32_t cchresult, void* pcchresult, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetQueryInfo(void* pwzurl, int32_t queryoptions, uint32_t dwqueryflags, void* pvbuffer, uint32_t cbbuffer, void* pcbbuffer, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CoInternetSetFeatureEnabled(int32_t featureentry, uint32_t dwflags, int32_t fenable);
int32_t windowssys_windows_win32_system_com_urlmon_CompareSecurityIds(void* pbsecurityid1, uint32_t dwlen1, void* pbsecurityid2, uint32_t dwlen2, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_CompatFlagsFromClsid(void* pclsid, void* pdwcompatflags, void* pdwmiscstatusflags);
int32_t windowssys_windows_win32_system_com_urlmon_CopyBindInfo(void* pcbisrc, void* pbidest);
int32_t windowssys_windows_win32_system_com_urlmon_CopyStgMedium(void* pcstgmedsrc, void* pstgmeddest);
int32_t windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtx(uint32_t reserved, void* pbscb, void* pefetc, void* ppbc);
int32_t windowssys_windows_win32_system_com_urlmon_CreateAsyncBindCtxEx(void* pbc, uint32_t dwoptions, void* pbscb, void* penum, void* ppbc, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_CreateFormatEnumerator(uint32_t cfmtetc, void* rgfmtetc, void* ppenumfmtetc);
int32_t windowssys_windows_win32_system_com_urlmon_CreateURLMoniker(void* pmkctx, void* szurl, void* ppmk);
int32_t windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx(void* pmkctx, void* szurl, void* ppmk, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_CreateURLMonikerEx2(void* pmkctx, void* puri, void* ppmk, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_FaultInIEFeature(void* hwnd, void* pclassspec, void* pquery, uint32_t dwflags);
int32_t windowssys_windows_win32_system_com_urlmon_FindMediaType(void* rgsztypes, void* rgcftypes);
int32_t windowssys_windows_win32_system_com_urlmon_FindMediaTypeClass(void* pbc, void* sztype, void* pclsid, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_FindMimeFromData(void* pbc, void* pwzurl, void* pbuffer, uint32_t cbsize, void* pwzmimeproposed, uint32_t dwmimeflags, void* ppwzmimeout, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_GetClassFileOrMime(void* pbc, void* szfilename, void* pbuffer, uint32_t cbsize, void* szmime, uint32_t dwreserved, void* pclsid);
int32_t windowssys_windows_win32_system_com_urlmon_GetClassURL(void* szurl, void* pclsid);
int32_t windowssys_windows_win32_system_com_urlmon_GetComponentIDFromCLSSPEC(void* pclassspec, void* ppszcomponentid);
int32_t windowssys_windows_win32_system_com_urlmon_GetSoftwareUpdateInfo(void* szdistunit, void* psdi);
int32_t windowssys_windows_win32_system_com_urlmon_HlinkGoBack(void* punk);
int32_t windowssys_windows_win32_system_com_urlmon_HlinkGoForward(void* punk);
int32_t windowssys_windows_win32_system_com_urlmon_HlinkNavigateMoniker(void* punk, void* pmktarget);
int32_t windowssys_windows_win32_system_com_urlmon_HlinkNavigateString(void* punk, void* sztarget);
int32_t windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToMoniker(void* pmktarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_HlinkSimpleNavigateToString(void* sztarget, void* szlocation, void* sztargetframename, void* punk, void* pbc, void* param5, uint32_t grfhlnf, uint32_t dwreserved);
void* windowssys_windows_win32_system_com_urlmon_IEGetUserPrivateNamespaceName(void);
int32_t windowssys_windows_win32_system_com_urlmon_IEInstallScope(void* pdwscope);
int32_t windowssys_windows_win32_system_com_urlmon_IsAsyncMoniker(void* pmk);
int32_t windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledA(void* pszurl);
int32_t windowssys_windows_win32_system_com_urlmon_IsLoggingEnabledW(void* pwszurl);
int32_t windowssys_windows_win32_system_com_urlmon_IsValidURL(void* pbc, void* szurl, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_MkParseDisplayNameEx(void* pbc, void* szdisplayname, void* pcheaten, void* ppmk);
int32_t windowssys_windows_win32_system_com_urlmon_ObtainUserAgentString(uint32_t dwoption, void* pszuaout, void* cbsize);
int32_t windowssys_windows_win32_system_com_urlmon_RegisterBindStatusCallback(void* pbc, void* pbscb, void* ppbscbprev, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_RegisterFormatEnumerator(void* pbc, void* pefetc, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_RegisterMediaTypeClass(void* pbc, uint32_t ctypes, void* rgsztypes, void* rgclsid, uint32_t reserved);
int32_t windowssys_windows_win32_system_com_urlmon_RegisterMediaTypes(uint32_t ctypes, void* rgsztypes, void* rgcftypes);
void windowssys_windows_win32_system_com_urlmon_ReleaseBindInfo(void* pbindinfo);
int32_t windowssys_windows_win32_system_com_urlmon_RevokeBindStatusCallback(void* pbc, void* pbscb);
int32_t windowssys_windows_win32_system_com_urlmon_RevokeFormatEnumerator(void* pbc, void* pefetc);
int32_t windowssys_windows_win32_system_com_urlmon_SetAccessForIEAppContainer(void* hobject, int32_t ieobjecttype, uint32_t dwaccessmask);
int32_t windowssys_windows_win32_system_com_urlmon_SetSoftwareUpdateAdvertisementState(void* szdistunit, uint32_t dwadstate, uint32_t dwadvertisedversionms, uint32_t dwadvertisedversionls);
int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileA(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5);
int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToCacheFileW(void* param0, void* param1, void* param2, uint32_t cchfilename, uint32_t param4, void* param5);
int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToFileA(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_URLDownloadToFileW(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamA(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_URLOpenBlockingStreamW(void* param0, void* param1, void* param2, uint32_t param3, void* param4);
int32_t windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_URLOpenPullStreamW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_URLOpenStreamA(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_URLOpenStreamW(void* param0, void* param1, uint32_t param2, void* param3);
int32_t windowssys_windows_win32_system_com_urlmon_UrlMkGetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, void* pdwbufferlengthout, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_UrlMkSetSessionOption(uint32_t dwoption, void* pbuffer, uint32_t dwbufferlength, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_urlmon_WriteHitLogging(void* lplogginginfo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_URLMON_WINDOWS_WIN32_SYSTEM_COM_URLMON_WRAPPER_H */
