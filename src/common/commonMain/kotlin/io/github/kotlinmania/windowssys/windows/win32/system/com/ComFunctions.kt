package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun bindMoniker(pmk: MutPtr<CVoid>, grfopt: UInt, iidresult: ConstPtr<Guid>, ppvresult: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr<Guid>): Hresult

public expect fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr<Guid>): Hresult

public expect fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr<Guid>): Hresult

public expect fun coAddRefServerProcess(): UInt

public expect fun coAllowSetForegroundWindow(punk: MutPtr<CVoid>, lpvreserved: ConstPtr<CVoid>): Hresult

public expect fun coAllowUnmarshalerCLSID(clsid: ConstPtr<Guid>): Hresult

public expect fun coBuildVersion(): UInt

public expect fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult

public expect fun coCopyProxy(pproxy: MutPtr<CVoid>, ppcopy: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coCreateFreeThreadedMarshaler(punkouter: MutPtr<CVoid>, ppunkmarshal: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coCreateGuid(pguid: MutPtr<Guid>): Hresult

public expect fun coCreateInstance(rclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclscontext: Clsctx, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coCreateInstanceEx(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, pserverinfo: ConstPtr<Coserverinfo>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult

public expect fun coCreateInstanceFromApp(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, reserved: ConstPtr<CVoid>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult

public expect fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult

public expect fun coDisableCallCancellation(preserved: ConstPtr<CVoid>): Hresult

public expect fun coDisconnectContext(dwtimeout: UInt): Hresult

public expect fun coDisconnectObject(punk: MutPtr<CVoid>, dwreserved: UInt): Hresult

public expect fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr<Filetime>): Bool

public expect fun coEnableCallCancellation(preserved: ConstPtr<CVoid>): Hresult

public expect fun coFileTimeNow(lpfiletime: MutPtr<Filetime>): Hresult

public expect fun coFileTimeToDosDateTime(lpfiletime: ConstPtr<Filetime>, lpdosdate: MutPtr<UShort>, lpdostime: MutPtr<UShort>): Bool

public expect fun coFreeAllLibraries()

public expect fun coFreeLibrary(hinst: Hinstance)

public expect fun coFreeUnusedLibraries()

public expect fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt)

public expect fun coGetApartmentType(papttype: MutPtr<Apttype>, paptqualifier: MutPtr<Apttypequalifier>): Hresult

public expect fun coGetCallContext(riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetCallerTID(lpdwtid: MutPtr<UInt>): Hresult

public expect fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr<Guid>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetClassObject(rclsid: ConstPtr<Guid>, dwclscontext: UInt, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetContextToken(ptoken: MutPtr<ULong>): Hresult

public expect fun coGetCurrentLogicalThreadId(pguid: MutPtr<Guid>): Hresult

public expect fun coGetCurrentProcess(): UInt

public expect fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr<BindOpts>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetObjectContext(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coGetPSClsid(riid: ConstPtr<Guid>, pclsid: MutPtr<Guid>): Hresult

public expect fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr<PsecurityDescriptor>): Hresult

public expect fun coGetTreatAsClass(clsidold: ConstPtr<Guid>, pclsidnew: MutPtr<Guid>): Hresult

public expect fun coImpersonateClient(): Hresult

public expect fun coIncrementMTAUsage(pcookie: MutPtr<CoMtaUsageCookie>): Hresult

public expect fun coInitialize(pvreserved: ConstPtr<CVoid>): Hresult

public expect fun coInitializeEx(pvreserved: ConstPtr<CVoid>, dwcoinit: UInt): Hresult

public expect fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr<SoleAuthenticationService>, preserved1: ConstPtr<CVoid>, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr<CVoid>, dwcapabilities: UInt, preserved3: ConstPtr<CVoid>): Hresult

public expect fun coInstall(pbc: MutPtr<CVoid>, dwflags: UInt, pclassspec: ConstPtr<UClsspec>, pquery: ConstPtr<Querycontext>, pszcodebase: Pcwstr): Hresult

public expect fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult

public expect fun coIsHandlerConnected(punk: MutPtr<CVoid>): Bool

public expect fun coIsOle1Class(rclsid: ConstPtr<Guid>): Bool

public expect fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance

public expect fun coLockObjectExternal(punk: MutPtr<CVoid>, flock: Bool, flastunlockreleases: Bool): Hresult

public expect fun coQueryAuthenticationServices(pcauthsvc: MutPtr<UInt>, asauthsvc: MutPtr<MutPtr<SoleAuthenticationService>>): Hresult

public expect fun coQueryClientBlanket(pauthnsvc: MutPtr<UInt>, pauthzsvc: MutPtr<UInt>, pserverprincname: MutPtr<Pwstr>, pauthnlevel: MutPtr<UInt>, pimplevel: MutPtr<UInt>, pprivs: MutPtr<MutPtr<CVoid>>, pcapabilities: MutPtr<UInt>): Hresult

public expect fun coQueryProxyBlanket(pproxy: MutPtr<CVoid>, pwauthnsvc: MutPtr<UInt>, pauthzsvc: MutPtr<UInt>, pserverprincname: MutPtr<Pwstr>, pauthnlevel: MutPtr<UInt>, pimplevel: MutPtr<UInt>, pauthinfo: MutPtr<MutPtr<CVoid>>, pcapabilites: MutPtr<UInt>): Hresult

public expect fun coRegisterActivationFilter(pactivationfilter: MutPtr<CVoid>): Hresult

public expect fun coRegisterChannelHook(extensionuuid: ConstPtr<Guid>, pchannelhook: MutPtr<CVoid>): Hresult

public expect fun coRegisterClassObject(rclsid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr<UInt>): Hresult

public expect fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr<CoDeviceCatalogCookie>): Hresult

public expect fun coRegisterInitializeSpy(pspy: MutPtr<CVoid>, pulicookie: MutPtr<ULong>): Hresult

public expect fun coRegisterMallocSpy(pmallocspy: MutPtr<CVoid>): Hresult

public expect fun coRegisterPSClsid(riid: ConstPtr<Guid>, rclsid: ConstPtr<Guid>): Hresult

public expect fun coRegisterSurrogate(psurrogate: MutPtr<CVoid>): Hresult

public expect fun coReleaseServerProcess(): UInt

public expect fun coResumeClassObjects(): Hresult

public expect fun coRevertToSelf(): Hresult

public expect fun coRevokeClassObject(dwregister: UInt): Hresult

public expect fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult

public expect fun coRevokeInitializeSpy(ulicookie: ULong): Hresult

public expect fun coRevokeMallocSpy(): Hresult

public expect fun coSetCancelObject(punk: MutPtr<CVoid>): Hresult

public expect fun coSetProxyBlanket(pproxy: MutPtr<CVoid>, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr<CVoid>, dwcapabilities: UInt): Hresult

public expect fun coSuspendClassObjects(): Hresult

public expect fun coSwitchCallContext(pnewobject: MutPtr<CVoid>, ppoldobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun coTaskMemAlloc(cb: ULong): MutPtr<CVoid>

public expect fun coTaskMemFree(pv: ConstPtr<CVoid>)

public expect fun coTaskMemRealloc(pv: ConstPtr<CVoid>, cb: ULong): MutPtr<CVoid>

public expect fun coTestCancel(): Hresult

public expect fun coTreatAsClass(clsidold: ConstPtr<Guid>, clsidnew: ConstPtr<Guid>): Hresult

public expect fun coUninitialize()

public expect fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr<Handle>, lpdwindex: MutPtr<UInt>): Hresult

public expect fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr<Handle>, lpdwindex: MutPtr<UInt>): Hresult

public expect fun createAntiMoniker(ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createBindCtx(reserved: UInt, ppbc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createClassMoniker(rclsid: ConstPtr<Guid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createDataAdviseHolder(ppdaholder: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createDataCache(punkouter: MutPtr<CVoid>, rclsid: ConstPtr<Guid>, iid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createGenericComposite(pmkfirst: MutPtr<CVoid>, pmkrest: MutPtr<CVoid>, ppmkcomposite: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createIUriBuilder(piuri: MutPtr<CVoid>, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createObjrefMoniker(punk: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createPointerMoniker(punk: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr<CVoid>, ppibsc: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun dcomChannelSetHResult(pvreserved: ConstPtr<CVoid>, pulreserved: ConstPtr<UInt>, appshr: Hresult): Hresult

public expect fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr<Guid>): Hresult

public expect fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getRunningObjectTable(reserved: UInt, pprot: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr<Guid>): Hresult

public expect fun mkParseDisplayName(pbc: MutPtr<CVoid>, szusername: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun monikerCommonPrefixWith(pmkthis: MutPtr<CVoid>, pmkother: MutPtr<CVoid>, ppmkcommon: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun monikerRelativePathTo(pmksrc: MutPtr<CVoid>, pmkdest: MutPtr<CVoid>, ppmkrelpath: MutPtr<MutPtr<CVoid>>, dwreserved: Bool): Hresult

public expect fun progIDFromCLSID(clsid: ConstPtr<Guid>, lplpszprogid: MutPtr<Pwstr>): Hresult

public expect fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr<CVoid>): Hresult

public expect fun stringFromCLSID(rclsid: ConstPtr<Guid>, lplpsz: MutPtr<Pwstr>): Hresult

public expect fun stringFromGUID2(rguid: ConstPtr<Guid>, lpsz: Pwstr, cchmax: Int): Int

public expect fun stringFromIID(rclsid: ConstPtr<Guid>, lplpsz: MutPtr<Pwstr>): Hresult
