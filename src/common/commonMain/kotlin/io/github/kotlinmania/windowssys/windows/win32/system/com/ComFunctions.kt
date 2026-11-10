package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun bindMoniker(pmk: COpaquePointer?, grfopt: UInt, iidresult: COpaquePointer?, ppvresult: COpaquePointer?): Hresult

public expect fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult

public expect fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult

public expect fun cLSIDFromString(lpsz: Pcwstr, pclsid: COpaquePointer?): Hresult

public expect fun coAddRefServerProcess(): UInt

public expect fun coAllowSetForegroundWindow(punk: COpaquePointer?, lpvreserved: COpaquePointer?): Hresult

public expect fun coAllowUnmarshalerCLSID(clsid: COpaquePointer?): Hresult

public expect fun coBuildVersion(): UInt

public expect fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult

public expect fun coCopyProxy(pproxy: COpaquePointer?, ppcopy: COpaquePointer?): Hresult

public expect fun coCreateFreeThreadedMarshaler(punkouter: COpaquePointer?, ppunkmarshal: COpaquePointer?): Hresult

public expect fun coCreateGuid(pguid: COpaquePointer?): Hresult

public expect fun coCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclscontext: Clsctx, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun coCreateInstanceEx(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pserverinfo: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult

public expect fun coCreateInstanceFromApp(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, reserved: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult

public expect fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult

public expect fun coDisableCallCancellation(preserved: COpaquePointer?): Hresult

public expect fun coDisconnectContext(dwtimeout: UInt): Hresult

public expect fun coDisconnectObject(punk: COpaquePointer?, dwreserved: UInt): Hresult

public expect fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: COpaquePointer?): Bool

public expect fun coEnableCallCancellation(preserved: COpaquePointer?): Hresult

public expect fun coFileTimeNow(lpfiletime: COpaquePointer?): Hresult

public expect fun coFileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpdosdate: COpaquePointer?, lpdostime: COpaquePointer?): Bool

public expect fun coFreeAllLibraries()

public expect fun coFreeLibrary(hinst: Hinstance)

public expect fun coFreeUnusedLibraries()

public expect fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt)

public expect fun coGetApartmentType(papttype: COpaquePointer?, paptqualifier: COpaquePointer?): Hresult

public expect fun coGetCallContext(riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult

public expect fun coGetCallerTID(lpdwtid: COpaquePointer?): Hresult

public expect fun coGetCancelObject(dwthreadid: UInt, iid: COpaquePointer?, ppunk: COpaquePointer?): Hresult

public expect fun coGetClassObject(rclsid: COpaquePointer?, dwclscontext: UInt, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun coGetContextToken(ptoken: COpaquePointer?): Hresult

public expect fun coGetCurrentLogicalThreadId(pguid: COpaquePointer?): Hresult

public expect fun coGetCurrentProcess(): UInt

public expect fun coGetMalloc(dwmemcontext: UInt, ppmalloc: COpaquePointer?): Hresult

public expect fun coGetObject(pszname: Pcwstr, pbindoptions: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun coGetObjectContext(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun coGetPSClsid(riid: COpaquePointer?, pclsid: COpaquePointer?): Hresult

public expect fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: COpaquePointer?): Hresult

public expect fun coGetTreatAsClass(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult

public expect fun coImpersonateClient(): Hresult

public expect fun coIncrementMTAUsage(pcookie: COpaquePointer?): Hresult

public expect fun coInitialize(pvreserved: COpaquePointer?): Hresult

public expect fun coInitializeEx(pvreserved: COpaquePointer?, dwcoinit: UInt): Hresult

public expect fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: COpaquePointer?, preserved1: COpaquePointer?, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: COpaquePointer?, dwcapabilities: UInt, preserved3: COpaquePointer?): Hresult

public expect fun coInstall(pbc: COpaquePointer?, dwflags: UInt, pclassspec: COpaquePointer?, pquery: COpaquePointer?, pszcodebase: Pcwstr): Hresult

public expect fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult

public expect fun coIsHandlerConnected(punk: COpaquePointer?): Bool

public expect fun coIsOle1Class(rclsid: COpaquePointer?): Bool

public expect fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance

public expect fun coLockObjectExternal(punk: COpaquePointer?, flock: Bool, flastunlockreleases: Bool): Hresult

public expect fun coQueryAuthenticationServices(pcauthsvc: COpaquePointer?, asauthsvc: COpaquePointer?): Hresult

public expect fun coQueryClientBlanket(pauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pprivs: COpaquePointer?, pcapabilities: COpaquePointer?): Hresult

public expect fun coQueryProxyBlanket(pproxy: COpaquePointer?, pwauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pauthinfo: COpaquePointer?, pcapabilites: COpaquePointer?): Hresult

public expect fun coRegisterActivationFilter(pactivationfilter: COpaquePointer?): Hresult

public expect fun coRegisterChannelHook(extensionuuid: COpaquePointer?, pchannelhook: COpaquePointer?): Hresult

public expect fun coRegisterClassObject(rclsid: COpaquePointer?, punk: COpaquePointer?, dwclscontext: Clsctx, flags: UInt, lpdwregister: COpaquePointer?): Hresult

public expect fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: COpaquePointer?): Hresult

public expect fun coRegisterInitializeSpy(pspy: COpaquePointer?, pulicookie: COpaquePointer?): Hresult

public expect fun coRegisterMallocSpy(pmallocspy: COpaquePointer?): Hresult

public expect fun coRegisterPSClsid(riid: COpaquePointer?, rclsid: COpaquePointer?): Hresult

public expect fun coRegisterSurrogate(psurrogate: COpaquePointer?): Hresult

public expect fun coReleaseServerProcess(): UInt

public expect fun coResumeClassObjects(): Hresult

public expect fun coRevertToSelf(): Hresult

public expect fun coRevokeClassObject(dwregister: UInt): Hresult

public expect fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult

public expect fun coRevokeInitializeSpy(ulicookie: ULong): Hresult

public expect fun coRevokeMallocSpy(): Hresult

public expect fun coSetCancelObject(punk: COpaquePointer?): Hresult

public expect fun coSetProxyBlanket(pproxy: COpaquePointer?, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: COpaquePointer?, dwcapabilities: UInt): Hresult

public expect fun coSuspendClassObjects(): Hresult

public expect fun coSwitchCallContext(pnewobject: COpaquePointer?, ppoldobject: COpaquePointer?): Hresult

public expect fun coTaskMemAlloc(cb: ULong): COpaquePointer?

public expect fun coTaskMemFree(pv: COpaquePointer?)

public expect fun coTaskMemRealloc(pv: COpaquePointer?, cb: ULong): COpaquePointer?

public expect fun coTestCancel(): Hresult

public expect fun coTreatAsClass(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult

public expect fun coUninitialize()

public expect fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult

public expect fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult

public expect fun createAntiMoniker(ppmk: COpaquePointer?): Hresult

public expect fun createBindCtx(reserved: UInt, ppbc: COpaquePointer?): Hresult

public expect fun createClassMoniker(rclsid: COpaquePointer?, ppmk: COpaquePointer?): Hresult

public expect fun createDataAdviseHolder(ppdaholder: COpaquePointer?): Hresult

public expect fun createDataCache(punkouter: COpaquePointer?, rclsid: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult

public expect fun createFileMoniker(lpszpathname: Pcwstr, ppmk: COpaquePointer?): Hresult

public expect fun createGenericComposite(pmkfirst: COpaquePointer?, pmkrest: COpaquePointer?, ppmkcomposite: COpaquePointer?): Hresult

public expect fun createIUriBuilder(piuri: COpaquePointer?, dwflags: UInt, dwreserved: ULong, ppiuribuilder: COpaquePointer?): Hresult

public expect fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: COpaquePointer?): Hresult

public expect fun createObjrefMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult

public expect fun createPointerMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult

public expect fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: COpaquePointer?, ppibsc: COpaquePointer?): Hresult

public expect fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: COpaquePointer?): Hresult

public expect fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult

public expect fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult

public expect fun dcomChannelSetHResult(pvreserved: COpaquePointer?, pulreserved: COpaquePointer?, appshr: Hresult): Hresult

public expect fun getClassFile(szfilename: Pcwstr, pclsid: COpaquePointer?): Hresult

public expect fun getErrorInfo(dwreserved: UInt, pperrinfo: COpaquePointer?): Hresult

public expect fun getRunningObjectTable(reserved: UInt, pprot: COpaquePointer?): Hresult

public expect fun iIDFromString(lpsz: Pcwstr, lpiid: COpaquePointer?): Hresult

public expect fun mkParseDisplayName(pbc: COpaquePointer?, szusername: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult

public expect fun monikerCommonPrefixWith(pmkthis: COpaquePointer?, pmkother: COpaquePointer?, ppmkcommon: COpaquePointer?): Hresult

public expect fun monikerRelativePathTo(pmksrc: COpaquePointer?, pmkdest: COpaquePointer?, ppmkrelpath: COpaquePointer?, dwreserved: Bool): Hresult

public expect fun progIDFromCLSID(clsid: COpaquePointer?, lplpszprogid: COpaquePointer?): Hresult

public expect fun setErrorInfo(dwreserved: UInt, perrinfo: COpaquePointer?): Hresult

public expect fun stringFromCLSID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult

public expect fun stringFromGUID2(rguid: COpaquePointer?, lpsz: Pwstr, cchmax: Int): Int

public expect fun stringFromIID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult
