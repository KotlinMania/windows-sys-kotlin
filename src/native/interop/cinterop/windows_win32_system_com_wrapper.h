#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemComBindMoniker(void* pmk, uint32_t grfopt, void* iidresult, void* ppvresult);
int32_t windowssysWindowsWin32SystemComCLSIDFromProgID(void* lpszprogid, void* lpclsid);
int32_t windowssysWindowsWin32SystemComCLSIDFromProgIDEx(void* lpszprogid, void* lpclsid);
int32_t windowssysWindowsWin32SystemComCLSIDFromString(void* lpsz, void* pclsid);
uint32_t windowssysWindowsWin32SystemComCoAddRefServerProcess(void);
int32_t windowssysWindowsWin32SystemComCoAllowSetForegroundWindow(void* punk, void* lpvreserved);
int32_t windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(void* clsid);
uint32_t windowssysWindowsWin32SystemComCoBuildVersion(void);
int32_t windowssysWindowsWin32SystemComCoCancelCall(uint32_t dwthreadid, uint32_t ultimeout);
int32_t windowssysWindowsWin32SystemComCoCopyProxy(void* pproxy, void* ppcopy);
int32_t windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(void* punkouter, void* ppunkmarshal);
int32_t windowssysWindowsWin32SystemComCoCreateGuid(void* pguid);
int32_t windowssysWindowsWin32SystemComCoCreateInstance(void* rclsid, void* punkouter, uint32_t dwclscontext, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemComCoCreateInstanceEx(void* clsid, void* punkouter, uint32_t dwclsctx, void* pserverinfo, uint32_t dwcount, void* presults);
int32_t windowssysWindowsWin32SystemComCoCreateInstanceFromApp(void* clsid, void* punkouter, uint32_t dwclsctx, void* reserved, uint32_t dwcount, void* presults);
int32_t windowssysWindowsWin32SystemComCoDecrementMTAUsage(void* cookie);
int32_t windowssysWindowsWin32SystemComCoDisableCallCancellation(void* preserved);
int32_t windowssysWindowsWin32SystemComCoDisconnectContext(uint32_t dwtimeout);
int32_t windowssysWindowsWin32SystemComCoDisconnectObject(void* punk, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComCoDosDateTimeToFileTime(uint16_t ndosdate, uint16_t ndostime, void* lpfiletime);
int32_t windowssysWindowsWin32SystemComCoEnableCallCancellation(void* preserved);
int32_t windowssysWindowsWin32SystemComCoFileTimeNow(void* lpfiletime);
int32_t windowssysWindowsWin32SystemComCoFileTimeToDosDateTime(void* lpfiletime, void* lpdosdate, void* lpdostime);
void windowssysWindowsWin32SystemComCoFreeAllLibraries(void);
void windowssysWindowsWin32SystemComCoFreeLibrary(void* hinst);
void windowssysWindowsWin32SystemComCoFreeUnusedLibraries(void);
void windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(uint32_t dwunloaddelay, uint32_t dwreserved);
int32_t windowssysWindowsWin32SystemComCoGetApartmentType(void* papttype, void* paptqualifier);
int32_t windowssysWindowsWin32SystemComCoGetCallContext(void* riid, void* ppinterface);
int32_t windowssysWindowsWin32SystemComCoGetCallerTID(void* lpdwtid);
int32_t windowssysWindowsWin32SystemComCoGetCancelObject(uint32_t dwthreadid, void* iid, void* ppunk);
int32_t windowssysWindowsWin32SystemComCoGetClassObject(void* rclsid, uint32_t dwclscontext, void* pvreserved, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemComCoGetContextToken(void* ptoken);
int32_t windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(void* pguid);
uint32_t windowssysWindowsWin32SystemComCoGetCurrentProcess(void);
int32_t windowssysWindowsWin32SystemComCoGetMalloc(uint32_t dwmemcontext, void* ppmalloc);
int32_t windowssysWindowsWin32SystemComCoGetObject(void* pszname, void* pbindoptions, void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemComCoGetObjectContext(void* riid, void* ppv);
int32_t windowssysWindowsWin32SystemComCoGetPSClsid(void* riid, void* pclsid);
int32_t windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(int32_t comsdtype, void* ppsd);
int32_t windowssysWindowsWin32SystemComCoGetTreatAsClass(void* clsidold, void* pclsidnew);
int32_t windowssysWindowsWin32SystemComCoImpersonateClient(void);
int32_t windowssysWindowsWin32SystemComCoIncrementMTAUsage(void* pcookie);
int32_t windowssysWindowsWin32SystemComCoInitialize(void* pvreserved);
int32_t windowssysWindowsWin32SystemComCoInitializeEx(void* pvreserved, uint32_t dwcoinit);
int32_t windowssysWindowsWin32SystemComCoInitializeSecurity(void* psecdesc, int32_t cauthsvc, void* asauthsvc, void* preserved1, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthlist, uint32_t dwcapabilities, void* preserved3);
int32_t windowssysWindowsWin32SystemComCoInstall(void* pbc, uint32_t dwflags, void* pclassspec, void* pquery, void* pszcodebase);
int32_t windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(void* pszmachinename);
int32_t windowssysWindowsWin32SystemComCoIsHandlerConnected(void* punk);
int32_t windowssysWindowsWin32SystemComCoIsOle1Class(void* rclsid);
void* windowssysWindowsWin32SystemComCoLoadLibrary(void* lpszlibname, int32_t bautofree);
int32_t windowssysWindowsWin32SystemComCoLockObjectExternal(void* punk, int32_t flock, int32_t flastunlockreleases);
int32_t windowssysWindowsWin32SystemComCoQueryAuthenticationServices(void* pcauthsvc, void* asauthsvc);
int32_t windowssysWindowsWin32SystemComCoQueryClientBlanket(void* pauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pprivs, void* pcapabilities);
int32_t windowssysWindowsWin32SystemComCoQueryProxyBlanket(void* pproxy, void* pwauthnsvc, void* pauthzsvc, void* pserverprincname, void* pauthnlevel, void* pimplevel, void* pauthinfo, void* pcapabilites);
int32_t windowssysWindowsWin32SystemComCoRegisterActivationFilter(void* pactivationfilter);
int32_t windowssysWindowsWin32SystemComCoRegisterChannelHook(void* extensionuuid, void* pchannelhook);
int32_t windowssysWindowsWin32SystemComCoRegisterClassObject(void* rclsid, void* punk, uint32_t dwclscontext, uint32_t flags, void* lpdwregister);
int32_t windowssysWindowsWin32SystemComCoRegisterDeviceCatalog(void* deviceinstanceid, void* cookie);
int32_t windowssysWindowsWin32SystemComCoRegisterInitializeSpy(void* pspy, void* pulicookie);
int32_t windowssysWindowsWin32SystemComCoRegisterMallocSpy(void* pmallocspy);
int32_t windowssysWindowsWin32SystemComCoRegisterPSClsid(void* riid, void* rclsid);
int32_t windowssysWindowsWin32SystemComCoRegisterSurrogate(void* psurrogate);
uint32_t windowssysWindowsWin32SystemComCoReleaseServerProcess(void);
int32_t windowssysWindowsWin32SystemComCoResumeClassObjects(void);
int32_t windowssysWindowsWin32SystemComCoRevertToSelf(void);
int32_t windowssysWindowsWin32SystemComCoRevokeClassObject(uint32_t dwregister);
int32_t windowssysWindowsWin32SystemComCoRevokeDeviceCatalog(void* cookie);
int32_t windowssysWindowsWin32SystemComCoRevokeInitializeSpy(uint64_t ulicookie);
int32_t windowssysWindowsWin32SystemComCoRevokeMallocSpy(void);
int32_t windowssysWindowsWin32SystemComCoSetCancelObject(void* punk);
int32_t windowssysWindowsWin32SystemComCoSetProxyBlanket(void* pproxy, uint32_t dwauthnsvc, uint32_t dwauthzsvc, void* pserverprincname, uint32_t dwauthnlevel, uint32_t dwimplevel, void* pauthinfo, uint32_t dwcapabilities);
int32_t windowssysWindowsWin32SystemComCoSuspendClassObjects(void);
int32_t windowssysWindowsWin32SystemComCoSwitchCallContext(void* pnewobject, void* ppoldobject);
void* windowssysWindowsWin32SystemComCoTaskMemAlloc(uint64_t cb);
void windowssysWindowsWin32SystemComCoTaskMemFree(void* pv);
void* windowssysWindowsWin32SystemComCoTaskMemRealloc(void* pv, uint64_t cb);
int32_t windowssysWindowsWin32SystemComCoTestCancel(void);
int32_t windowssysWindowsWin32SystemComCoTreatAsClass(void* clsidold, void* clsidnew);
void windowssysWindowsWin32SystemComCoUninitialize(void);
int32_t windowssysWindowsWin32SystemComCoWaitForMultipleHandles(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex);
int32_t windowssysWindowsWin32SystemComCoWaitForMultipleObjects(uint32_t dwflags, uint32_t dwtimeout, uint32_t chandles, void* phandles, void* lpdwindex);
int32_t windowssysWindowsWin32SystemComCreateAntiMoniker(void* ppmk);
int32_t windowssysWindowsWin32SystemComCreateBindCtx(uint32_t reserved, void* ppbc);
int32_t windowssysWindowsWin32SystemComCreateClassMoniker(void* rclsid, void* ppmk);
int32_t windowssysWindowsWin32SystemComCreateDataAdviseHolder(void* ppdaholder);
int32_t windowssysWindowsWin32SystemComCreateDataCache(void* punkouter, void* rclsid, void* iid, void* ppv);
int32_t windowssysWindowsWin32SystemComCreateFileMoniker(void* lpszpathname, void* ppmk);
int32_t windowssysWindowsWin32SystemComCreateGenericComposite(void* pmkfirst, void* pmkrest, void* ppmkcomposite);
int32_t windowssysWindowsWin32SystemComCreateIUriBuilder(void* piuri, uint32_t dwflags, uint64_t dwreserved, void* ppiuribuilder);
int32_t windowssysWindowsWin32SystemComCreateItemMoniker(void* lpszdelim, void* lpszitem, void* ppmk);
int32_t windowssysWindowsWin32SystemComCreateObjrefMoniker(void* punk, void* ppmk);
int32_t windowssysWindowsWin32SystemComCreatePointerMoniker(void* punk, void* ppmk);
int32_t windowssysWindowsWin32SystemComCreateStdProgressIndicator(void* hwndparent, void* psztitle, void* pibsccaller, void* ppibsc);
int32_t windowssysWindowsWin32SystemComCreateUri(void* pwzuri, uint32_t dwflags, uint64_t dwreserved, void* ppuri);
int32_t windowssysWindowsWin32SystemComCreateUriFromMultiByteString(void* pszansiinputuri, uint32_t dwencodingflags, uint32_t dwcodepage, uint32_t dwcreateflags, uint64_t dwreserved, void* ppuri);
int32_t windowssysWindowsWin32SystemComCreateUriWithFragment(void* pwzuri, void* pwzfragment, uint32_t dwflags, uint64_t dwreserved, void* ppuri);
int32_t windowssysWindowsWin32SystemComDcomChannelSetHResult(void* pvreserved, void* pulreserved, int32_t appshr);
int32_t windowssysWindowsWin32SystemComGetClassFile(void* szfilename, void* pclsid);
int32_t windowssysWindowsWin32SystemComGetErrorInfo(uint32_t dwreserved, void* pperrinfo);
int32_t windowssysWindowsWin32SystemComGetRunningObjectTable(uint32_t reserved, void* pprot);
int32_t windowssysWindowsWin32SystemComIIDFromString(void* lpsz, void* lpiid);
int32_t windowssysWindowsWin32SystemComMkParseDisplayName(void* pbc, void* szusername, void* pcheaten, void* ppmk);
int32_t windowssysWindowsWin32SystemComMonikerCommonPrefixWith(void* pmkthis, void* pmkother, void* ppmkcommon);
int32_t windowssysWindowsWin32SystemComMonikerRelativePathTo(void* pmksrc, void* pmkdest, void* ppmkrelpath, int32_t dwreserved);
int32_t windowssysWindowsWin32SystemComProgIDFromCLSID(void* clsid, void* lplpszprogid);
int32_t windowssysWindowsWin32SystemComSetErrorInfo(uint32_t dwreserved, void* perrinfo);
int32_t windowssysWindowsWin32SystemComStringFromCLSID(void* rclsid, void* lplpsz);
int32_t windowssysWindowsWin32SystemComStringFromGUID2(void* rguid, void* lpsz, int32_t cchmax);
int32_t windowssysWindowsWin32SystemComStringFromIID(void* rclsid, void* lplpsz);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_WINDOWS_WIN32_SYSTEM_COM_WRAPPER_H */
