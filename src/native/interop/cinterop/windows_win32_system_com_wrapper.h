#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_com_BindMoniker(void* pmk, uint32_t grfopt, void* iidresult, void* ppvresult);
int32_t windowssys_windows_win32_system_com_CLSIDFromProgID(void* lpszprogid, void* lpclsid);
int32_t windowssys_windows_win32_system_com_CLSIDFromProgIDEx(void* lpszprogid, void* lpclsid);
int32_t windowssys_windows_win32_system_com_CLSIDFromString(void* lpsz, void* pclsid);
uint32_t windowssys_windows_win32_system_com_CoAddRefServerProcess(void);
int32_t windowssys_windows_win32_system_com_CoAllowSetForegroundWindow(void* punk, void* lpvreserved);
int32_t windowssys_windows_win32_system_com_CoAllowUnmarshalerCLSID(void* clsid);
uint32_t windowssys_windows_win32_system_com_CoBuildVersion(void);
int32_t windowssys_windows_win32_system_com_CoCancelCall(uint32_t dwthreadid, uint32_t ultimeout);
int32_t windowssys_windows_win32_system_com_CoCopyProxy(void* pproxy, void* ppcopy);
int32_t windowssys_windows_win32_system_com_CoCreateFreeThreadedMarshaler(void* punkouter, void* ppunkmarshal);
int32_t windowssys_windows_win32_system_com_CoCreateGuid(void* pguid);
int32_t windowssys_windows_win32_system_com_CoCreateInstance(void* rclsid, void* punkouter, uint32_t dwclscontext, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_CoCreateInstanceEx(void* clsid, void* punkouter, uint32_t dwclsctx, void* pserverinfo, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_CoCreateInstanceFromApp(void* clsid, void* punkouter, uint32_t dwclsctx, void* reserved, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_CoDecrementMTAUsage(void* cookie);
int32_t windowssys_windows_win32_system_com_CoDisableCallCancellation(void* preserved);
int32_t windowssys_windows_win32_system_com_CoDisconnectContext(uint32_t dwtimeout);
int32_t windowssys_windows_win32_system_com_CoDisconnectObject(void* punk, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_CoDosDateTimeToFileTime(uint16_t ndosdate, uint16_t ndostime, void* lpfiletime);
int32_t windowssys_windows_win32_system_com_CoEnableCallCancellation(void* preserved);
int32_t windowssys_windows_win32_system_com_CoFileTimeNow(void* lpfiletime);
int32_t windowssys_windows_win32_system_com_CoFileTimeToDosDateTime(void* lpfiletime, void* lpdosdate, void* lpdostime);
void windowssys_windows_win32_system_com_CoFreeAllLibraries(void);
void windowssys_windows_win32_system_com_CoFreeLibrary(void* hinst);
void windowssys_windows_win32_system_com_CoFreeUnusedLibraries(void);
void windowssys_windows_win32_system_com_CoFreeUnusedLibrariesEx(uint32_t dwunloaddelay, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_CoGetApartmentType(void* papttype, void* paptqualifier);
int32_t windowssys_windows_win32_system_com_CoGetCallContext(void* riid, void* ppinterface);
int32_t windowssys_windows_win32_system_com_CoGetCallerTID(void* lpdwtid);
int32_t windowssys_windows_win32_system_com_CoGetCancelObject(uint32_t dwthreadid, void* iid, void* ppunk);
int32_t windowssys_windows_win32_system_com_CoGetClassObject(void* rclsid, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_CoGetContextToken(void* ptoken);
int32_t windowssys_windows_win32_system_com_CoGetCurrentLogicalThreadId(void* pguid);
uint32_t windowssys_windows_win32_system_com_CoGetCurrentProcess(void);
int32_t windowssys_windows_win32_system_com_CoGetMalloc(uint32_t dwmemcontext, void* ppmalloc);
int32_t windowssys_windows_win32_system_com_CoGetObject(void* pszname, void* pbindoptions, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_CoGetObjectContext(void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_CoGetPSClsid(void* riid, void* pclsid);
int32_t windowssys_windows_win32_system_com_CoGetSystemSecurityPermissions(int32_t comsdtype, void* ppsd);
int32_t windowssys_windows_win32_system_com_CoGetTreatAsClass(void* clsidold, void* pclsidnew);
int32_t windowssys_windows_win32_system_com_CoImpersonateClient(void);
int32_t windowssys_windows_win32_system_com_CoIncrementMTAUsage(void* pcookie);
int32_t windowssys_windows_win32_system_com_CoInitialize(void* pvreserved);
int32_t windowssys_windows_win32_system_com_CoInitializeEx(void* pvreserved, uint32_t dwcoinit);
int32_t windowssys_windows_win32_system_com_CoInitializeSecurity(void* psecdesc, int32_t cauthsvc, void* asauthsvc, void* preserved1, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthlist, uint32_t dwcapabilities, void* preserved3);
int32_t windowssys_windows_win32_system_com_CoInstall(void* pbc, uint32_t dwflags, void* pclassspec, void* pquery, void* pszcodebase);
int32_t windowssys_windows_win32_system_com_CoInvalidateRemoteMachineBindings(void* pszmachinename);
int32_t windowssys_windows_win32_system_com_CoIsHandlerConnected(void* punk);
int32_t windowssys_windows_win32_system_com_CoIsOle1Class(void* rclsid);
void* windowssys_windows_win32_system_com_CoLoadLibrary(void* lpszlibname, int32_t bautofree);
int32_t windowssys_windows_win32_system_com_CoLockObjectExternal(void* punk, int32_t flock, int32_t flastunlockreleases);
int32_t windowssys_windows_win32_system_com_CoQueryAuthenticationServices(void* pcauthsvc, void* asauthsvc);
int32_t windowssys_windows_win32_system_com_CoQueryClientBlanket(void* pauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pprivs, void* pcapabilities);
int32_t windowssys_windows_win32_system_com_CoQueryProxyBlanket(void* pproxy, void* pwauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pauthinfo, void* pcapabilites);
int32_t windowssys_windows_win32_system_com_CoRegisterActivationFilter(void* pactivationfilter);
int32_t windowssys_windows_win32_system_com_CoRegisterChannelHook(void* extensionuuid, void* pchannelhook);
int32_t windowssys_windows_win32_system_com_CoRegisterClassObject(void* rclsid, void* punk, uint32_t dwclscontext, uint32_t flags, void* lpdwregister);
int32_t windowssys_windows_win32_system_com_CoRegisterDeviceCatalog(void* deviceinstanceid, void* cookie);
int32_t windowssys_windows_win32_system_com_CoRegisterInitializeSpy(void* pspy, void* pulicookie);
int32_t windowssys_windows_win32_system_com_CoRegisterMallocSpy(void* pmallocspy);
int32_t windowssys_windows_win32_system_com_CoRegisterPSClsid(void* riid, void* rclsid);
int32_t windowssys_windows_win32_system_com_CoRegisterSurrogate(void* psurrogate);
uint32_t windowssys_windows_win32_system_com_CoReleaseServerProcess(void);
int32_t windowssys_windows_win32_system_com_CoResumeClassObjects(void);
int32_t windowssys_windows_win32_system_com_CoRevertToSelf(void);
int32_t windowssys_windows_win32_system_com_CoRevokeClassObject(uint32_t dwregister);
int32_t windowssys_windows_win32_system_com_CoRevokeDeviceCatalog(void* cookie);
int32_t windowssys_windows_win32_system_com_CoRevokeInitializeSpy(uint64_t ulicookie);
int32_t windowssys_windows_win32_system_com_CoRevokeMallocSpy(void);
int32_t windowssys_windows_win32_system_com_CoSetCancelObject(void* punk);
int32_t windowssys_windows_win32_system_com_CoSetProxyBlanket(void* pproxy, uint32_t dwauthnsvc, uint32_t dwauthzsvc, void* pserverprincname, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthinfo, uint32_t dwcapabilities);
int32_t windowssys_windows_win32_system_com_CoSuspendClassObjects(void);
int32_t windowssys_windows_win32_system_com_CoSwitchCallContext(void* pnewobject, void* ppoldobject);
void* windowssys_windows_win32_system_com_CoTaskMemAlloc(uint64_t cb);
void windowssys_windows_win32_system_com_CoTaskMemFree(void* pv);
void* windowssys_windows_win32_system_com_CoTaskMemRealloc(void* pv, uint64_t cb);
int32_t windowssys_windows_win32_system_com_CoTestCancel(void);
int32_t windowssys_windows_win32_system_com_CoTreatAsClass(void* clsidold, void* clsidnew);
void windowssys_windows_win32_system_com_CoUninitialize(void);
int32_t windowssys_windows_win32_system_com_CoWaitForMultipleHandles(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex);
int32_t windowssys_windows_win32_system_com_CoWaitForMultipleObjects(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex);
int32_t windowssys_windows_win32_system_com_CreateAntiMoniker(void* ppmk);
int32_t windowssys_windows_win32_system_com_CreateBindCtx(uint32_t reserved, void* ppbc);
int32_t windowssys_windows_win32_system_com_CreateClassMoniker(void* rclsid, void* ppmk);
int32_t windowssys_windows_win32_system_com_CreateDataAdviseHolder(void* ppdaholder);
int32_t windowssys_windows_win32_system_com_CreateDataCache(void* punkouter, void* rclsid, void* iid, void* ppv);
int32_t windowssys_windows_win32_system_com_CreateFileMoniker(void* lpszpathname, void* ppmk);
int32_t windowssys_windows_win32_system_com_CreateGenericComposite(void* pmkfirst, void* pmkrest, void* ppmkcomposite);
int32_t windowssys_windows_win32_system_com_CreateIUriBuilder(void* piuri, uint32_t dwflags, uint64_t dwreserved, void* ppiuribuilder);
int32_t windowssys_windows_win32_system_com_CreateItemMoniker(void* lpszdelim, void* lpszitem, void* ppmk);
int32_t windowssys_windows_win32_system_com_CreateObjrefMoniker(void* punk, void* ppmk);
int32_t windowssys_windows_win32_system_com_CreatePointerMoniker(void* punk, void* ppmk);
int32_t windowssys_windows_win32_system_com_CreateStdProgressIndicator(void* hwndparent, void* psztitle, void* pibsccaller, void* ppibsc);
int32_t windowssys_windows_win32_system_com_CreateUri(void* pwzuri, uint32_t dwflags, uint64_t dwreserved, void* ppuri);
int32_t windowssys_windows_win32_system_com_CreateUriFromMultiByteString(void* pszansiinputuri, uint32_t dwencodingflags, uint32_t dwcodepage, uint32_t dwcreateflags, uint64_t dwreserved, void* ppuri);
int32_t windowssys_windows_win32_system_com_CreateUriWithFragment(void* pwzuri, void* pwzfragment, uint32_t dwflags, uint64_t dwreserved, void* ppuri);
int32_t windowssys_windows_win32_system_com_DcomChannelSetHResult(void* pvreserved, void* pulreserved, int32_t appshr);
int32_t windowssys_windows_win32_system_com_GetClassFile(void* szfilename, void* pclsid);
int32_t windowssys_windows_win32_system_com_GetErrorInfo(uint32_t dwreserved, void* pperrinfo);
int32_t windowssys_windows_win32_system_com_GetRunningObjectTable(uint32_t reserved, void* pprot);
int32_t windowssys_windows_win32_system_com_IIDFromString(void* lpsz, void* lpiid);
int32_t windowssys_windows_win32_system_com_MkParseDisplayName(void* pbc, void* szusername, void* pcheaten, void* ppmk);
int32_t windowssys_windows_win32_system_com_MonikerCommonPrefixWith(void* pmkthis, void* pmkother, void* ppmkcommon);
int32_t windowssys_windows_win32_system_com_MonikerRelativePathTo(void* pmksrc, void* pmkdest, void* ppmkrelpath, int32_t dwreserved);
int32_t windowssys_windows_win32_system_com_ProgIDFromCLSID(void* clsid, void* lplpszprogid);
int32_t windowssys_windows_win32_system_com_SetErrorInfo(uint32_t dwreserved, void* perrinfo);
int32_t windowssys_windows_win32_system_com_StringFromCLSID(void* rclsid, void* lplpsz);
int32_t windowssys_windows_win32_system_com_StringFromGUID2(void* rguid, void* lpsz, int32_t cchmax);
int32_t windowssys_windows_win32_system_com_StringFromIID(void* rclsid, void* lplpsz);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H */
