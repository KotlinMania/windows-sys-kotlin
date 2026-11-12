@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bindMoniker(pmk: MutPtr<CVoid>, grfopt: UInt, iidresult: ConstPtr<Guid>, ppvresult: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComBindMoniker")

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCLSIDFromProgID")

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCLSIDFromProgIDEx")

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCLSIDFromString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoAddRefServerProcess")
private external fun wasiWindowssysWindowsWin32SystemComCoAddRefServerProcess(): Int

public actual fun coAddRefServerProcess(): UInt =
    wasiWindowssysWindowsWin32SystemComCoAddRefServerProcess().toUInt()

public actual fun coAllowSetForegroundWindow(punk: MutPtr<CVoid>, lpvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoAllowSetForegroundWindow")

public actual fun coAllowUnmarshalerCLSID(clsid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoBuildVersion")
private external fun wasiWindowssysWindowsWin32SystemComCoBuildVersion(): Int

public actual fun coBuildVersion(): UInt =
    wasiWindowssysWindowsWin32SystemComCoBuildVersion().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoCancelCall")
private external fun wasiWindowssysWindowsWin32SystemComCoCancelCall(dwthreadid: Int, ultimeout: Int): Int

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComCoCancelCall(dwthreadid.toInt(), ultimeout.toInt()).toInt()

public actual fun coCopyProxy(pproxy: MutPtr<CVoid>, ppcopy: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCopyProxy")

public actual fun coCreateFreeThreadedMarshaler(punkouter: MutPtr<CVoid>, ppunkmarshal: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler")

public actual fun coCreateGuid(pguid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateGuid")

public actual fun coCreateInstance(rclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclscontext: Clsctx, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateInstance")

public actual fun coCreateInstanceEx(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, pserverinfo: ConstPtr<Coserverinfo>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateInstanceEx")

public actual fun coCreateInstanceFromApp(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, reserved: ConstPtr<CVoid>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateInstanceFromApp")

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDecrementMTAUsage")

public actual fun coDisableCallCancellation(preserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDisableCallCancellation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoDisconnectContext")
private external fun wasiWindowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout: Int): Int

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout.toInt()).toInt()

public actual fun coDisconnectObject(punk: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDisconnectObject")

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDosDateTimeToFileTime")

public actual fun coEnableCallCancellation(preserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoEnableCallCancellation")

public actual fun coFileTimeNow(lpfiletime: MutPtr<Filetime>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoFileTimeNow")

public actual fun coFileTimeToDosDateTime(lpfiletime: ConstPtr<Filetime>, lpdosdate: MutPtr<UShort>, lpdostime: MutPtr<UShort>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoFileTimeToDosDateTime")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoFreeAllLibraries")
private external fun wasiWindowssysWindowsWin32SystemComCoFreeAllLibraries(): Unit

public actual fun coFreeAllLibraries(): Unit =
    wasiWindowssysWindowsWin32SystemComCoFreeAllLibraries()

public actual fun coFreeLibrary(hinst: Hinstance): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoFreeLibrary")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoFreeUnusedLibraries")
private external fun wasiWindowssysWindowsWin32SystemComCoFreeUnusedLibraries(): Unit

public actual fun coFreeUnusedLibraries(): Unit =
    wasiWindowssysWindowsWin32SystemComCoFreeUnusedLibraries()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx")
private external fun wasiWindowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay: Int, dwreserved: Int): Unit

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt): Unit =
    wasiWindowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())

public actual fun coGetApartmentType(papttype: MutPtr<Apttype>, paptqualifier: MutPtr<Apttypequalifier>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetApartmentType")

public actual fun coGetCallContext(riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCallContext")

public actual fun coGetCallerTID(lpdwtid: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCallerTID")

public actual fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr<Guid>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCancelObject")

public actual fun coGetClassObject(rclsid: ConstPtr<Guid>, dwclscontext: UInt, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetClassObject")

public actual fun coGetContextToken(ptoken: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetContextToken")

public actual fun coGetCurrentLogicalThreadId(pguid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoGetCurrentProcess")
private external fun wasiWindowssysWindowsWin32SystemComCoGetCurrentProcess(): Int

public actual fun coGetCurrentProcess(): UInt =
    wasiWindowssysWindowsWin32SystemComCoGetCurrentProcess().toUInt()

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetMalloc")

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr<BindOpts>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetObject")

public actual fun coGetObjectContext(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetObjectContext")

public actual fun coGetPSClsid(riid: ConstPtr<Guid>, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetPSClsid")

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr<PsecurityDescriptor>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions")

public actual fun coGetTreatAsClass(clsidold: ConstPtr<Guid>, pclsidnew: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetTreatAsClass")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoImpersonateClient")
private external fun wasiWindowssysWindowsWin32SystemComCoImpersonateClient(): Int

public actual fun coImpersonateClient(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoImpersonateClient().toInt()

public actual fun coIncrementMTAUsage(pcookie: MutPtr<CoMtaUsageCookie>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoIncrementMTAUsage")

public actual fun coInitialize(pvreserved: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInitialize")

public actual fun coInitializeEx(pvreserved: ConstPtr<CVoid>, dwcoinit: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInitializeEx")

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr<SoleAuthenticationService>, preserved1: ConstPtr<CVoid>, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr<CVoid>, dwcapabilities: UInt, preserved3: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInitializeSecurity")

public actual fun coInstall(pbc: MutPtr<CVoid>, dwflags: UInt, pclassspec: ConstPtr<UClsspec>, pquery: ConstPtr<Querycontext>, pszcodebase: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInstall")

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings")

public actual fun coIsHandlerConnected(punk: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoIsHandlerConnected")

public actual fun coIsOle1Class(rclsid: ConstPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoIsOle1Class")

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoLoadLibrary")

public actual fun coLockObjectExternal(punk: MutPtr<CVoid>, flock: Bool, flastunlockreleases: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoLockObjectExternal")

public actual fun coQueryAuthenticationServices(pcauthsvc: MutPtr<UInt>, asauthsvc: MutPtr<MutPtr<SoleAuthenticationService>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoQueryAuthenticationServices")

public actual fun coQueryClientBlanket(pauthnsvc: MutPtr<UInt>, pauthzsvc: MutPtr<UInt>, pserverprincname: MutPtr<Pwstr>, pauthnlevel: MutPtr<UInt>, pimplevel: MutPtr<UInt>, pprivs: MutPtr<MutPtr<CVoid>>, pcapabilities: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoQueryClientBlanket")

public actual fun coQueryProxyBlanket(pproxy: MutPtr<CVoid>, pwauthnsvc: MutPtr<UInt>, pauthzsvc: MutPtr<UInt>, pserverprincname: MutPtr<Pwstr>, pauthnlevel: MutPtr<UInt>, pimplevel: MutPtr<UInt>, pauthinfo: MutPtr<MutPtr<CVoid>>, pcapabilites: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoQueryProxyBlanket")

public actual fun coRegisterActivationFilter(pactivationfilter: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterActivationFilter")

public actual fun coRegisterChannelHook(extensionuuid: ConstPtr<Guid>, pchannelhook: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterChannelHook")

public actual fun coRegisterClassObject(rclsid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterClassObject")

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr<CoDeviceCatalogCookie>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterDeviceCatalog")

public actual fun coRegisterInitializeSpy(pspy: MutPtr<CVoid>, pulicookie: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterInitializeSpy")

public actual fun coRegisterMallocSpy(pmallocspy: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterMallocSpy")

public actual fun coRegisterPSClsid(riid: ConstPtr<Guid>, rclsid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterPSClsid")

public actual fun coRegisterSurrogate(psurrogate: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterSurrogate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoReleaseServerProcess")
private external fun wasiWindowssysWindowsWin32SystemComCoReleaseServerProcess(): Int

public actual fun coReleaseServerProcess(): UInt =
    wasiWindowssysWindowsWin32SystemComCoReleaseServerProcess().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoResumeClassObjects")
private external fun wasiWindowssysWindowsWin32SystemComCoResumeClassObjects(): Int

public actual fun coResumeClassObjects(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoResumeClassObjects().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevertToSelf")
private external fun wasiWindowssysWindowsWin32SystemComCoRevertToSelf(): Int

public actual fun coRevertToSelf(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevertToSelf().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevokeClassObject")
private external fun wasiWindowssysWindowsWin32SystemComCoRevokeClassObject(dwregister: Int): Int

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevokeClassObject(dwregister.toInt()).toInt()

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRevokeDeviceCatalog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevokeInitializeSpy")
private external fun wasiWindowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie: Long): Int

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie.toLong()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevokeMallocSpy")
private external fun wasiWindowssysWindowsWin32SystemComCoRevokeMallocSpy(): Int

public actual fun coRevokeMallocSpy(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevokeMallocSpy().toInt()

public actual fun coSetCancelObject(punk: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoSetCancelObject")

public actual fun coSetProxyBlanket(pproxy: MutPtr<CVoid>, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr<CVoid>, dwcapabilities: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoSetProxyBlanket")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoSuspendClassObjects")
private external fun wasiWindowssysWindowsWin32SystemComCoSuspendClassObjects(): Int

public actual fun coSuspendClassObjects(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoSuspendClassObjects().toInt()

public actual fun coSwitchCallContext(pnewobject: MutPtr<CVoid>, ppoldobject: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoSwitchCallContext")

public actual fun coTaskMemAlloc(cb: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTaskMemAlloc")

public actual fun coTaskMemFree(pv: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTaskMemFree")

public actual fun coTaskMemRealloc(pv: ConstPtr<CVoid>, cb: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTaskMemRealloc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoTestCancel")
private external fun wasiWindowssysWindowsWin32SystemComCoTestCancel(): Int

public actual fun coTestCancel(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoTestCancel().toInt()

public actual fun coTreatAsClass(clsidold: ConstPtr<Guid>, clsidnew: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTreatAsClass")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoUninitialize")
private external fun wasiWindowssysWindowsWin32SystemComCoUninitialize(): Unit

public actual fun coUninitialize(): Unit =
    wasiWindowssysWindowsWin32SystemComCoUninitialize()

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr<Handle>, lpdwindex: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoWaitForMultipleHandles")

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr<Handle>, lpdwindex: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoWaitForMultipleObjects")

public actual fun createAntiMoniker(ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateAntiMoniker")

public actual fun createBindCtx(reserved: UInt, ppbc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateBindCtx")

public actual fun createClassMoniker(rclsid: ConstPtr<Guid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateClassMoniker")

public actual fun createDataAdviseHolder(ppdaholder: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateDataAdviseHolder")

public actual fun createDataCache(punkouter: MutPtr<CVoid>, rclsid: ConstPtr<Guid>, iid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateDataCache")

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateFileMoniker")

public actual fun createGenericComposite(pmkfirst: MutPtr<CVoid>, pmkrest: MutPtr<CVoid>, ppmkcomposite: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateGenericComposite")

public actual fun createIUriBuilder(piuri: MutPtr<CVoid>, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateIUriBuilder")

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateItemMoniker")

public actual fun createObjrefMoniker(punk: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateObjrefMoniker")

public actual fun createPointerMoniker(punk: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreatePointerMoniker")

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr<CVoid>, ppibsc: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateStdProgressIndicator")

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateUri")

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateUriFromMultiByteString")

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateUriWithFragment")

public actual fun dcomChannelSetHResult(pvreserved: ConstPtr<CVoid>, pulreserved: ConstPtr<UInt>, appshr: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComDcomChannelSetHResult")

public actual fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComGetClassFile")

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComGetErrorInfo")

public actual fun getRunningObjectTable(reserved: UInt, pprot: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComGetRunningObjectTable")

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComIIDFromString")

public actual fun mkParseDisplayName(pbc: MutPtr<CVoid>, szusername: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMkParseDisplayName")

public actual fun monikerCommonPrefixWith(pmkthis: MutPtr<CVoid>, pmkother: MutPtr<CVoid>, ppmkcommon: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMonikerCommonPrefixWith")

public actual fun monikerRelativePathTo(pmksrc: MutPtr<CVoid>, pmkdest: MutPtr<CVoid>, ppmkrelpath: MutPtr<MutPtr<CVoid>>, dwreserved: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMonikerRelativePathTo")

public actual fun progIDFromCLSID(clsid: ConstPtr<Guid>, lplpszprogid: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComProgIDFromCLSID")

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComSetErrorInfo")

public actual fun stringFromCLSID(rclsid: ConstPtr<Guid>, lplpsz: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStringFromCLSID")

public actual fun stringFromGUID2(rguid: ConstPtr<Guid>, lpsz: Pwstr, cchmax: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStringFromGUID2")

public actual fun stringFromIID(rclsid: ConstPtr<Guid>, lplpsz: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStringFromIID")
