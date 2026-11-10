#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_com_bindMoniker(void* pmk, uint32_t grfopt, void* iidresult, void* ppvresult);
int32_t windowssys_windows_win32_system_com_cLSIDFromProgID(void* lpszprogid, void* lpclsid);
int32_t windowssys_windows_win32_system_com_cLSIDFromProgIDEx(void* lpszprogid, void* lpclsid);
int32_t windowssys_windows_win32_system_com_cLSIDFromString(void* lpsz, void* pclsid);
uint32_t windowssys_windows_win32_system_com_coAddRefServerProcess(void);
int32_t windowssys_windows_win32_system_com_coAllowSetForegroundWindow(void* punk, void* lpvreserved);
int32_t windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID(void* clsid);
uint32_t windowssys_windows_win32_system_com_coBuildVersion(void);
int32_t windowssys_windows_win32_system_com_coCancelCall(uint32_t dwthreadid, uint32_t ultimeout);
int32_t windowssys_windows_win32_system_com_coCopyProxy(void* pproxy, void* ppcopy);
int32_t windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler(void* punkouter, void* ppunkmarshal);
int32_t windowssys_windows_win32_system_com_coCreateGuid(void* pguid);
int32_t windowssys_windows_win32_system_com_coCreateInstance(void* rclsid, void* punkouter, uint32_t dwclscontext, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_coCreateInstanceEx(void* clsid, void* punkouter, uint32_t dwclsctx, void* pserverinfo, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_coCreateInstanceFromApp(void* clsid, void* punkouter, uint32_t dwclsctx, void* reserved, uint32_t dwcount, void* presults);
int32_t windowssys_windows_win32_system_com_coDecrementMTAUsage(void* cookie);
int32_t windowssys_windows_win32_system_com_coDisableCallCancellation(void* preserved);
int32_t windowssys_windows_win32_system_com_coDisconnectContext(uint32_t dwtimeout);
int32_t windowssys_windows_win32_system_com_coDisconnectObject(void* punk, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_coDosDateTimeToFileTime(uint16_t ndosdate, uint16_t ndostime, void* lpfiletime);
int32_t windowssys_windows_win32_system_com_coEnableCallCancellation(void* preserved);
int32_t windowssys_windows_win32_system_com_coFileTimeNow(void* lpfiletime);
int32_t windowssys_windows_win32_system_com_coFileTimeToDosDateTime(void* lpfiletime, void* lpdosdate, void* lpdostime);
void windowssys_windows_win32_system_com_coFreeAllLibraries(void);
void windowssys_windows_win32_system_com_coFreeLibrary(void* hinst);
void windowssys_windows_win32_system_com_coFreeUnusedLibraries(void);
void windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(uint32_t dwunloaddelay, uint32_t dwreserved);
int32_t windowssys_windows_win32_system_com_coGetApartmentType(void* papttype, void* paptqualifier);
int32_t windowssys_windows_win32_system_com_coGetCallContext(void* riid, void* ppinterface);
int32_t windowssys_windows_win32_system_com_coGetCallerTID(void* lpdwtid);
int32_t windowssys_windows_win32_system_com_coGetCancelObject(uint32_t dwthreadid, void* iid, void* ppunk);
int32_t windowssys_windows_win32_system_com_coGetClassObject(void* rclsid, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_coGetContextToken(void* ptoken);
int32_t windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId(void* pguid);
uint32_t windowssys_windows_win32_system_com_coGetCurrentProcess(void);
int32_t windowssys_windows_win32_system_com_coGetMalloc(uint32_t dwmemcontext, void* ppmalloc);
int32_t windowssys_windows_win32_system_com_coGetObject(void* pszname, void* pbindoptions, void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_coGetObjectContext(void* riid, void* ppv);
int32_t windowssys_windows_win32_system_com_coGetPSClsid(void* riid, void* pclsid);
int32_t windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(int32_t comsdtype, void* ppsd);
int32_t windowssys_windows_win32_system_com_coGetTreatAsClass(void* clsidold, void* pclsidnew);
int32_t windowssys_windows_win32_system_com_coImpersonateClient(void);
int32_t windowssys_windows_win32_system_com_coIncrementMTAUsage(void* pcookie);
int32_t windowssys_windows_win32_system_com_coInitialize(void* pvreserved);
int32_t windowssys_windows_win32_system_com_coInitializeEx(void* pvreserved, uint32_t dwcoinit);
int32_t windowssys_windows_win32_system_com_coInitializeSecurity(void* psecdesc, int32_t cauthsvc, void* asauthsvc, void* preserved1, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthlist, uint32_t dwcapabilities, void* preserved3);
int32_t windowssys_windows_win32_system_com_coInstall(void* pbc, uint32_t dwflags, void* pclassspec, void* pquery, void* pszcodebase);
int32_t windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings(void* pszmachinename);
int32_t windowssys_windows_win32_system_com_coIsHandlerConnected(void* punk);
int32_t windowssys_windows_win32_system_com_coIsOle1Class(void* rclsid);
void* windowssys_windows_win32_system_com_coLoadLibrary(void* lpszlibname, int32_t bautofree);
int32_t windowssys_windows_win32_system_com_coLockObjectExternal(void* punk, int32_t flock, int32_t flastunlockreleases);
int32_t windowssys_windows_win32_system_com_coQueryAuthenticationServices(void* pcauthsvc, void* asauthsvc);
int32_t windowssys_windows_win32_system_com_coQueryClientBlanket(void* pauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pprivs, void* pcapabilities);
int32_t windowssys_windows_win32_system_com_coQueryProxyBlanket(void* pproxy, void* pwauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pauthinfo, void* pcapabilites);
int32_t windowssys_windows_win32_system_com_coRegisterActivationFilter(void* pactivationfilter);
int32_t windowssys_windows_win32_system_com_coRegisterChannelHook(void* extensionuuid, void* pchannelhook);
int32_t windowssys_windows_win32_system_com_coRegisterClassObject(void* rclsid, void* punk, uint32_t dwclscontext, uint32_t flags, void* lpdwregister);
int32_t windowssys_windows_win32_system_com_coRegisterDeviceCatalog(void* deviceinstanceid, void* cookie);
int32_t windowssys_windows_win32_system_com_coRegisterInitializeSpy(void* pspy, void* pulicookie);
int32_t windowssys_windows_win32_system_com_coRegisterMallocSpy(void* pmallocspy);
int32_t windowssys_windows_win32_system_com_coRegisterPSClsid(void* riid, void* rclsid);
int32_t windowssys_windows_win32_system_com_coRegisterSurrogate(void* psurrogate);
uint32_t windowssys_windows_win32_system_com_coReleaseServerProcess(void);
int32_t windowssys_windows_win32_system_com_coResumeClassObjects(void);
int32_t windowssys_windows_win32_system_com_coRevertToSelf(void);
int32_t windowssys_windows_win32_system_com_coRevokeClassObject(uint32_t dwregister);
int32_t windowssys_windows_win32_system_com_coRevokeDeviceCatalog(void* cookie);
int32_t windowssys_windows_win32_system_com_coRevokeInitializeSpy(uint64_t ulicookie);
int32_t windowssys_windows_win32_system_com_coRevokeMallocSpy(void);
int32_t windowssys_windows_win32_system_com_coSetCancelObject(void* punk);
int32_t windowssys_windows_win32_system_com_coSetProxyBlanket(void* pproxy, uint32_t dwauthnsvc, uint32_t dwauthzsvc, void* pserverprincname, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthinfo, uint32_t dwcapabilities);
int32_t windowssys_windows_win32_system_com_coSuspendClassObjects(void);
int32_t windowssys_windows_win32_system_com_coSwitchCallContext(void* pnewobject, void* ppoldobject);
void* windowssys_windows_win32_system_com_coTaskMemAlloc(uint64_t cb);
void windowssys_windows_win32_system_com_coTaskMemFree(void* pv);
void* windowssys_windows_win32_system_com_coTaskMemRealloc(void* pv, uint64_t cb);
int32_t windowssys_windows_win32_system_com_coTestCancel(void);
int32_t windowssys_windows_win32_system_com_coTreatAsClass(void* clsidold, void* clsidnew);
void windowssys_windows_win32_system_com_coUninitialize(void);
int32_t windowssys_windows_win32_system_com_coWaitForMultipleHandles(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex);
int32_t windowssys_windows_win32_system_com_coWaitForMultipleObjects(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex);
int32_t windowssys_windows_win32_system_com_createAntiMoniker(void* ppmk);
int32_t windowssys_windows_win32_system_com_createBindCtx(uint32_t reserved, void* ppbc);
int32_t windowssys_windows_win32_system_com_createClassMoniker(void* rclsid, void* ppmk);
int32_t windowssys_windows_win32_system_com_createDataAdviseHolder(void* ppdaholder);
int32_t windowssys_windows_win32_system_com_createDataCache(void* punkouter, void* rclsid, void* iid, void* ppv);
int32_t windowssys_windows_win32_system_com_createFileMoniker(void* lpszpathname, void* ppmk);
int32_t windowssys_windows_win32_system_com_createGenericComposite(void* pmkfirst, void* pmkrest, void* ppmkcomposite);
int32_t windowssys_windows_win32_system_com_createIUriBuilder(void* piuri, uint32_t dwflags, uint64_t dwreserved, void* ppiuribuilder);
int32_t windowssys_windows_win32_system_com_createItemMoniker(void* lpszdelim, void* lpszitem, void* ppmk);
int32_t windowssys_windows_win32_system_com_createObjrefMoniker(void* punk, void* ppmk);
int32_t windowssys_windows_win32_system_com_createPointerMoniker(void* punk, void* ppmk);
int32_t windowssys_windows_win32_system_com_createStdProgressIndicator(void* hwndparent, void* psztitle, void* pibsccaller, void* ppibsc);
int32_t windowssys_windows_win32_system_com_createUri(void* pwzuri, uint32_t dwflags, uint64_t dwreserved, void* ppuri);
int32_t windowssys_windows_win32_system_com_createUriFromMultiByteString(void* pszansiinputuri, uint32_t dwencodingflags, uint32_t dwcodepage, uint32_t dwcreateflags, uint64_t dwreserved, void* ppuri);
int32_t windowssys_windows_win32_system_com_createUriWithFragment(void* pwzuri, void* pwzfragment, uint32_t dwflags, uint64_t dwreserved, void* ppuri);
int32_t windowssys_windows_win32_system_com_dcomChannelSetHResult(void* pvreserved, void* pulreserved, int32_t appshr);
int32_t windowssys_windows_win32_system_com_getClassFile(void* szfilename, void* pclsid);
int32_t windowssys_windows_win32_system_com_getErrorInfo(uint32_t dwreserved, void* pperrinfo);
int32_t windowssys_windows_win32_system_com_getRunningObjectTable(uint32_t reserved, void* pprot);
int32_t windowssys_windows_win32_system_com_iIDFromString(void* lpsz, void* lpiid);
int32_t windowssys_windows_win32_system_com_mkParseDisplayName(void* pbc, void* szusername, void* pcheaten, void* ppmk);
int32_t windowssys_windows_win32_system_com_monikerCommonPrefixWith(void* pmkthis, void* pmkother, void* ppmkcommon);
int32_t windowssys_windows_win32_system_com_monikerRelativePathTo(void* pmksrc, void* pmkdest, void* ppmkrelpath, int32_t dwreserved);
int32_t windowssys_windows_win32_system_com_progIDFromCLSID(void* clsid, void* lplpszprogid);
int32_t windowssys_windows_win32_system_com_setErrorInfo(uint32_t dwreserved, void* perrinfo);
int32_t windowssys_windows_win32_system_com_stringFromCLSID(void* rclsid, void* lplpsz);
int32_t windowssys_windows_win32_system_com_stringFromGUID2(void* rguid, void* lpsz, int32_t cchmax);
int32_t windowssys_windows_win32_system_com_stringFromIID(void* rclsid, void* lplpsz);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H */
