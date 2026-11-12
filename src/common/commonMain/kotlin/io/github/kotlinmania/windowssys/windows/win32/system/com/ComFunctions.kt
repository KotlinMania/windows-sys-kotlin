package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun bindMoniker(pmk: MutPtr, grfopt: UInt, iidresult: ConstPtr, ppvresult: MutPtr): Hresult

public expect fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult

public expect fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult

public expect fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr): Hresult

public expect fun coAddRefServerProcess(): UInt

public expect fun coAllowSetForegroundWindow(punk: MutPtr, lpvreserved: ConstPtr): Hresult

public expect fun coAllowUnmarshalerCLSID(clsid: ConstPtr): Hresult

public expect fun coBuildVersion(): UInt

public expect fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult

public expect fun coCopyProxy(pproxy: MutPtr, ppcopy: MutPtr): Hresult

public expect fun coCreateFreeThreadedMarshaler(punkouter: MutPtr, ppunkmarshal: MutPtr): Hresult

public expect fun coCreateGuid(pguid: MutPtr): Hresult

public expect fun coCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, dwclscontext: Clsctx, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun coCreateInstanceEx(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pserverinfo: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult

public expect fun coCreateInstanceFromApp(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, reserved: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult

public expect fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult

public expect fun coDisableCallCancellation(preserved: ConstPtr): Hresult

public expect fun coDisconnectContext(dwtimeout: UInt): Hresult

public expect fun coDisconnectObject(punk: MutPtr, dwreserved: UInt): Hresult

public expect fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr): Bool

public expect fun coEnableCallCancellation(preserved: ConstPtr): Hresult

public expect fun coFileTimeNow(lpfiletime: MutPtr): Hresult

public expect fun coFileTimeToDosDateTime(lpfiletime: ConstPtr, lpdosdate: MutPtr, lpdostime: MutPtr): Bool

public expect fun coFreeAllLibraries()

public expect fun coFreeLibrary(hinst: Hinstance)

public expect fun coFreeUnusedLibraries()

public expect fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt)

public expect fun coGetApartmentType(papttype: MutPtr, paptqualifier: MutPtr): Hresult

public expect fun coGetCallContext(riid: ConstPtr, ppinterface: MutPtr): Hresult

public expect fun coGetCallerTID(lpdwtid: MutPtr): Hresult

public expect fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr, ppunk: MutPtr): Hresult

public expect fun coGetClassObject(rclsid: ConstPtr, dwclscontext: UInt, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun coGetContextToken(ptoken: MutPtr): Hresult

public expect fun coGetCurrentLogicalThreadId(pguid: MutPtr): Hresult

public expect fun coGetCurrentProcess(): UInt

public expect fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr): Hresult

public expect fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun coGetObjectContext(riid: ConstPtr, ppv: MutPtr): Hresult

public expect fun coGetPSClsid(riid: ConstPtr, pclsid: MutPtr): Hresult

public expect fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr): Hresult

public expect fun coGetTreatAsClass(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult

public expect fun coImpersonateClient(): Hresult

public expect fun coIncrementMTAUsage(pcookie: MutPtr): Hresult

public expect fun coInitialize(pvreserved: ConstPtr): Hresult

public expect fun coInitializeEx(pvreserved: ConstPtr, dwcoinit: UInt): Hresult

public expect fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr, preserved1: ConstPtr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr, dwcapabilities: UInt, preserved3: ConstPtr): Hresult

public expect fun coInstall(pbc: MutPtr, dwflags: UInt, pclassspec: ConstPtr, pquery: ConstPtr, pszcodebase: Pcwstr): Hresult

public expect fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult

public expect fun coIsHandlerConnected(punk: MutPtr): Bool

public expect fun coIsOle1Class(rclsid: ConstPtr): Bool

public expect fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance

public expect fun coLockObjectExternal(punk: MutPtr, flock: Bool, flastunlockreleases: Bool): Hresult

public expect fun coQueryAuthenticationServices(pcauthsvc: MutPtr, asauthsvc: MutPtr): Hresult

public expect fun coQueryClientBlanket(pauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pprivs: MutPtr, pcapabilities: MutPtr): Hresult

public expect fun coQueryProxyBlanket(pproxy: MutPtr, pwauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pauthinfo: MutPtr, pcapabilites: MutPtr): Hresult

public expect fun coRegisterActivationFilter(pactivationfilter: MutPtr): Hresult

public expect fun coRegisterChannelHook(extensionuuid: ConstPtr, pchannelhook: MutPtr): Hresult

public expect fun coRegisterClassObject(rclsid: ConstPtr, punk: MutPtr, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr): Hresult

public expect fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr): Hresult

public expect fun coRegisterInitializeSpy(pspy: MutPtr, pulicookie: MutPtr): Hresult

public expect fun coRegisterMallocSpy(pmallocspy: MutPtr): Hresult

public expect fun coRegisterPSClsid(riid: ConstPtr, rclsid: ConstPtr): Hresult

public expect fun coRegisterSurrogate(psurrogate: MutPtr): Hresult

public expect fun coReleaseServerProcess(): UInt

public expect fun coResumeClassObjects(): Hresult

public expect fun coRevertToSelf(): Hresult

public expect fun coRevokeClassObject(dwregister: UInt): Hresult

public expect fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult

public expect fun coRevokeInitializeSpy(ulicookie: ULong): Hresult

public expect fun coRevokeMallocSpy(): Hresult

public expect fun coSetCancelObject(punk: MutPtr): Hresult

public expect fun coSetProxyBlanket(pproxy: MutPtr, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr, dwcapabilities: UInt): Hresult

public expect fun coSuspendClassObjects(): Hresult

public expect fun coSwitchCallContext(pnewobject: MutPtr, ppoldobject: MutPtr): Hresult

public expect fun coTaskMemAlloc(cb: ULong): MutPtr

public expect fun coTaskMemFree(pv: ConstPtr)

public expect fun coTaskMemRealloc(pv: ConstPtr, cb: ULong): MutPtr

public expect fun coTestCancel(): Hresult

public expect fun coTreatAsClass(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult

public expect fun coUninitialize()

public expect fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult

public expect fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult

public expect fun createAntiMoniker(ppmk: MutPtr): Hresult

public expect fun createBindCtx(reserved: UInt, ppbc: MutPtr): Hresult

public expect fun createClassMoniker(rclsid: ConstPtr, ppmk: MutPtr): Hresult

public expect fun createDataAdviseHolder(ppdaholder: MutPtr): Hresult

public expect fun createDataCache(punkouter: MutPtr, rclsid: ConstPtr, iid: ConstPtr, ppv: MutPtr): Hresult

public expect fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr): Hresult

public expect fun createGenericComposite(pmkfirst: MutPtr, pmkrest: MutPtr, ppmkcomposite: MutPtr): Hresult

public expect fun createIUriBuilder(piuri: MutPtr, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr): Hresult

public expect fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr): Hresult

public expect fun createObjrefMoniker(punk: MutPtr, ppmk: MutPtr): Hresult

public expect fun createPointerMoniker(punk: MutPtr, ppmk: MutPtr): Hresult

public expect fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr, ppibsc: MutPtr): Hresult

public expect fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr): Hresult

public expect fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult

public expect fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult

public expect fun dcomChannelSetHResult(pvreserved: ConstPtr, pulreserved: ConstPtr, appshr: Hresult): Hresult

public expect fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr): Hresult

public expect fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr): Hresult

public expect fun getRunningObjectTable(reserved: UInt, pprot: MutPtr): Hresult

public expect fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr): Hresult

public expect fun mkParseDisplayName(pbc: MutPtr, szusername: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult

public expect fun monikerCommonPrefixWith(pmkthis: MutPtr, pmkother: MutPtr, ppmkcommon: MutPtr): Hresult

public expect fun monikerRelativePathTo(pmksrc: MutPtr, pmkdest: MutPtr, ppmkrelpath: MutPtr, dwreserved: Bool): Hresult

public expect fun progIDFromCLSID(clsid: ConstPtr, lplpszprogid: MutPtr): Hresult

public expect fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr): Hresult

public expect fun stringFromCLSID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult

public expect fun stringFromGUID2(rguid: ConstPtr, lpsz: Pwstr, cchmax: Int): Int

public expect fun stringFromIID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult
