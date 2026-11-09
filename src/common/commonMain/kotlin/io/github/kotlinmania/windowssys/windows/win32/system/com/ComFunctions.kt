package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public expect fun BindMoniker(pmk: Long, grfopt: UInt, iidresult: Long, ppvresult: Long): HRESULT

public expect fun CLSIDFromProgID(lpszprogid: PCWSTR, lpclsid: Long): HRESULT

public expect fun CLSIDFromProgIDEx(lpszprogid: PCWSTR, lpclsid: Long): HRESULT

public expect fun CLSIDFromString(lpsz: PCWSTR, pclsid: Long): HRESULT

public expect fun CoAddRefServerProcess(): UInt

public expect fun CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): HRESULT

public expect fun CoAllowUnmarshalerCLSID(clsid: Long): HRESULT

public expect fun CoBuildVersion(): UInt

public expect fun CoCancelCall(dwthreadid: UInt, ultimeout: UInt): HRESULT

public expect fun CoCopyProxy(pproxy: Long, ppcopy: Long): HRESULT

public expect fun CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): HRESULT

public expect fun CoCreateGuid(pguid: Long): HRESULT

public expect fun CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: CLSCTX, riid: Long, ppv: Long): HRESULT

public expect fun CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, pserverinfo: Long, dwcount: UInt, presults: Long): HRESULT

public expect fun CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, reserved: Long, dwcount: UInt, presults: Long): HRESULT

public expect fun CoDecrementMTAUsage(cookie: CO_MTA_USAGE_COOKIE): HRESULT

public expect fun CoDisableCallCancellation(preserved: Long): HRESULT

public expect fun CoDisconnectContext(dwtimeout: UInt): HRESULT

public expect fun CoDisconnectObject(punk: Long, dwreserved: UInt): HRESULT

public expect fun CoDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: Long): BOOL

public expect fun CoEnableCallCancellation(preserved: Long): HRESULT

public expect fun CoFileTimeNow(lpfiletime: Long): HRESULT

public expect fun CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): BOOL

public expect fun CoFreeAllLibraries()

public expect fun CoFreeLibrary(hinst: HINSTANCE)

public expect fun CoFreeUnusedLibraries()

public expect fun CoFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt)

public expect fun CoGetApartmentType(papttype: Long, paptqualifier: Long): HRESULT

public expect fun CoGetCallContext(riid: Long, ppinterface: Long): HRESULT

public expect fun CoGetCallerTID(lpdwtid: Long): HRESULT

public expect fun CoGetCancelObject(dwthreadid: UInt, iid: Long, ppunk: Long): HRESULT

public expect fun CoGetClassObject(rclsid: Long, dwclscontext: UInt, pvreserved: Long, riid: Long, ppv: Long): HRESULT

public expect fun CoGetContextToken(ptoken: Long): HRESULT

public expect fun CoGetCurrentLogicalThreadId(pguid: Long): HRESULT

public expect fun CoGetCurrentProcess(): UInt

public expect fun CoGetMalloc(dwmemcontext: UInt, ppmalloc: Long): HRESULT

public expect fun CoGetObject(pszname: PCWSTR, pbindoptions: Long, riid: Long, ppv: Long): HRESULT

public expect fun CoGetObjectContext(riid: Long, ppv: Long): HRESULT

public expect fun CoGetPSClsid(riid: Long, pclsid: Long): HRESULT

public expect fun CoGetSystemSecurityPermissions(comsdtype: COMSD, ppsd: Long): HRESULT

public expect fun CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): HRESULT

public expect fun CoImpersonateClient(): HRESULT

public expect fun CoIncrementMTAUsage(pcookie: Long): HRESULT

public expect fun CoInitialize(pvreserved: Long): HRESULT

public expect fun CoInitializeEx(pvreserved: Long, dwcoinit: UInt): HRESULT

public expect fun CoInitializeSecurity(psecdesc: PSECURITY_DESCRIPTOR, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthlist: Long, dwcapabilities: UInt, preserved3: Long): HRESULT

public expect fun CoInstall(pbc: Long, dwflags: UInt, pclassspec: Long, pquery: Long, pszcodebase: PCWSTR): HRESULT

public expect fun CoInvalidateRemoteMachineBindings(pszmachinename: PCWSTR): HRESULT

public expect fun CoIsHandlerConnected(punk: Long): BOOL

public expect fun CoIsOle1Class(rclsid: Long): BOOL

public expect fun CoLoadLibrary(lpszlibname: PCWSTR, bautofree: BOOL): HINSTANCE

public expect fun CoLockObjectExternal(punk: Long, flock: BOOL, flastunlockreleases: BOOL): HRESULT

public expect fun CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): HRESULT

public expect fun CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): HRESULT

public expect fun CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): HRESULT

public expect fun CoRegisterActivationFilter(pactivationfilter: Long): HRESULT

public expect fun CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): HRESULT

public expect fun CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: CLSCTX, flags: UInt, lpdwregister: Long): HRESULT

public expect fun CoRegisterDeviceCatalog(deviceinstanceid: PCWSTR, cookie: Long): HRESULT

public expect fun CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): HRESULT

public expect fun CoRegisterMallocSpy(pmallocspy: Long): HRESULT

public expect fun CoRegisterPSClsid(riid: Long, rclsid: Long): HRESULT

public expect fun CoRegisterSurrogate(psurrogate: Long): HRESULT

public expect fun CoReleaseServerProcess(): UInt

public expect fun CoResumeClassObjects(): HRESULT

public expect fun CoRevertToSelf(): HRESULT

public expect fun CoRevokeClassObject(dwregister: UInt): HRESULT

public expect fun CoRevokeDeviceCatalog(cookie: CO_DEVICE_CATALOG_COOKIE): HRESULT

public expect fun CoRevokeInitializeSpy(ulicookie: ULong): HRESULT

public expect fun CoRevokeMallocSpy(): HRESULT

public expect fun CoSetCancelObject(punk: Long): HRESULT

public expect fun CoSetProxyBlanket(pproxy: Long, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: PCWSTR, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthinfo: Long, dwcapabilities: UInt): HRESULT

public expect fun CoSuspendClassObjects(): HRESULT

public expect fun CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): HRESULT

public expect fun CoTaskMemAlloc(cb: ULong): Long

public expect fun CoTaskMemFree(pv: Long)

public expect fun CoTaskMemRealloc(pv: Long, cb: ULong): Long

public expect fun CoTestCancel(): HRESULT

public expect fun CoTreatAsClass(clsidold: Long, clsidnew: Long): HRESULT

public expect fun CoUninitialize()

public expect fun CoWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT

public expect fun CoWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT

public expect fun CreateAntiMoniker(ppmk: Long): HRESULT

public expect fun CreateBindCtx(reserved: UInt, ppbc: Long): HRESULT

public expect fun CreateClassMoniker(rclsid: Long, ppmk: Long): HRESULT

public expect fun CreateDataAdviseHolder(ppdaholder: Long): HRESULT

public expect fun CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): HRESULT

public expect fun CreateFileMoniker(lpszpathname: PCWSTR, ppmk: Long): HRESULT

public expect fun CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): HRESULT

public expect fun CreateIUriBuilder(piuri: Long, dwflags: UInt, dwreserved: ULong, ppiuribuilder: Long): HRESULT

public expect fun CreateItemMoniker(lpszdelim: PCWSTR, lpszitem: PCWSTR, ppmk: Long): HRESULT

public expect fun CreateObjrefMoniker(punk: Long, ppmk: Long): HRESULT

public expect fun CreatePointerMoniker(punk: Long, ppmk: Long): HRESULT

public expect fun CreateStdProgressIndicator(hwndparent: HWND, psztitle: PCWSTR, pibsccaller: Long, ppibsc: Long): HRESULT

public expect fun CreateUri(pwzuri: PCWSTR, dwflags: URI_CREATE_FLAGS, dwreserved: ULong, ppuri: Long): HRESULT

public expect fun CreateUriFromMultiByteString(pszansiinputuri: PCSTR, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT

public expect fun CreateUriWithFragment(pwzuri: PCWSTR, pwzfragment: PCWSTR, dwflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT

public expect fun DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: HRESULT): HRESULT

public expect fun GetClassFile(szfilename: PCWSTR, pclsid: Long): HRESULT

public expect fun GetErrorInfo(dwreserved: UInt, pperrinfo: Long): HRESULT

public expect fun GetRunningObjectTable(reserved: UInt, pprot: Long): HRESULT

public expect fun IIDFromString(lpsz: PCWSTR, lpiid: Long): HRESULT

public expect fun MkParseDisplayName(pbc: Long, szusername: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT

public expect fun MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): HRESULT

public expect fun MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: BOOL): HRESULT

public expect fun ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): HRESULT

public expect fun SetErrorInfo(dwreserved: UInt, perrinfo: Long): HRESULT

public expect fun StringFromCLSID(rclsid: Long, lplpsz: Long): HRESULT

public expect fun StringFromGUID2(rguid: Long, lpsz: PWSTR, cchmax: Int): Int

public expect fun StringFromIID(rclsid: Long, lplpsz: Long): HRESULT
