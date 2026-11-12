@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun bindMoniker(pmk: MutPtr, grfopt: UInt, iidresult: ConstPtr, ppvresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComBindMoniker")

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCLSIDFromProgID")

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCLSIDFromProgIDEx")

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCLSIDFromString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoAddRefServerProcess")
private external fun wasiWindowssysWindowsWin32SystemComCoAddRefServerProcess(): Int

public actual fun coAddRefServerProcess(): UInt =
    wasiWindowssysWindowsWin32SystemComCoAddRefServerProcess().toUInt()

public actual fun coAllowSetForegroundWindow(punk: MutPtr, lpvreserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoAllowSetForegroundWindow")

public actual fun coAllowUnmarshalerCLSID(clsid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoBuildVersion")
private external fun wasiWindowssysWindowsWin32SystemComCoBuildVersion(): Int

public actual fun coBuildVersion(): UInt =
    wasiWindowssysWindowsWin32SystemComCoBuildVersion().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoCancelCall")
private external fun wasiWindowssysWindowsWin32SystemComCoCancelCall(dwthreadid: Int, ultimeout: Int): Int

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComCoCancelCall(dwthreadid.toInt(), ultimeout.toInt())

public actual fun coCopyProxy(pproxy: MutPtr, ppcopy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCopyProxy")

public actual fun coCreateFreeThreadedMarshaler(punkouter: MutPtr, ppunkmarshal: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler")

public actual fun coCreateGuid(pguid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateGuid")

public actual fun coCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, dwclscontext: Clsctx, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateInstance")

public actual fun coCreateInstanceEx(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pserverinfo: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateInstanceEx")

public actual fun coCreateInstanceFromApp(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, reserved: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoCreateInstanceFromApp")

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDecrementMTAUsage")

public actual fun coDisableCallCancellation(preserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDisableCallCancellation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoDisconnectContext")
private external fun wasiWindowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout: Int): Int

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout.toInt())

public actual fun coDisconnectObject(punk: MutPtr, dwreserved: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDisconnectObject")

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoDosDateTimeToFileTime")

public actual fun coEnableCallCancellation(preserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoEnableCallCancellation")

public actual fun coFileTimeNow(lpfiletime: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoFileTimeNow")

public actual fun coFileTimeToDosDateTime(lpfiletime: ConstPtr, lpdosdate: MutPtr, lpdostime: MutPtr): Bool =
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

public actual fun coGetApartmentType(papttype: MutPtr, paptqualifier: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetApartmentType")

public actual fun coGetCallContext(riid: ConstPtr, ppinterface: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCallContext")

public actual fun coGetCallerTID(lpdwtid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCallerTID")

public actual fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr, ppunk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCancelObject")

public actual fun coGetClassObject(rclsid: ConstPtr, dwclscontext: UInt, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetClassObject")

public actual fun coGetContextToken(ptoken: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetContextToken")

public actual fun coGetCurrentLogicalThreadId(pguid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoGetCurrentProcess")
private external fun wasiWindowssysWindowsWin32SystemComCoGetCurrentProcess(): Int

public actual fun coGetCurrentProcess(): UInt =
    wasiWindowssysWindowsWin32SystemComCoGetCurrentProcess().toUInt()

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetMalloc")

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetObject")

public actual fun coGetObjectContext(riid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetObjectContext")

public actual fun coGetPSClsid(riid: ConstPtr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetPSClsid")

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions")

public actual fun coGetTreatAsClass(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoGetTreatAsClass")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoImpersonateClient")
private external fun wasiWindowssysWindowsWin32SystemComCoImpersonateClient(): Int

public actual fun coImpersonateClient(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoImpersonateClient()

public actual fun coIncrementMTAUsage(pcookie: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoIncrementMTAUsage")

public actual fun coInitialize(pvreserved: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInitialize")

public actual fun coInitializeEx(pvreserved: ConstPtr, dwcoinit: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInitializeEx")

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr, preserved1: ConstPtr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr, dwcapabilities: UInt, preserved3: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInitializeSecurity")

public actual fun coInstall(pbc: MutPtr, dwflags: UInt, pclassspec: ConstPtr, pquery: ConstPtr, pszcodebase: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInstall")

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings")

public actual fun coIsHandlerConnected(punk: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoIsHandlerConnected")

public actual fun coIsOle1Class(rclsid: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoIsOle1Class")

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoLoadLibrary")

public actual fun coLockObjectExternal(punk: MutPtr, flock: Bool, flastunlockreleases: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoLockObjectExternal")

public actual fun coQueryAuthenticationServices(pcauthsvc: MutPtr, asauthsvc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoQueryAuthenticationServices")

public actual fun coQueryClientBlanket(pauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pprivs: MutPtr, pcapabilities: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoQueryClientBlanket")

public actual fun coQueryProxyBlanket(pproxy: MutPtr, pwauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pauthinfo: MutPtr, pcapabilites: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoQueryProxyBlanket")

public actual fun coRegisterActivationFilter(pactivationfilter: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterActivationFilter")

public actual fun coRegisterChannelHook(extensionuuid: ConstPtr, pchannelhook: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterChannelHook")

public actual fun coRegisterClassObject(rclsid: ConstPtr, punk: MutPtr, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterClassObject")

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterDeviceCatalog")

public actual fun coRegisterInitializeSpy(pspy: MutPtr, pulicookie: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterInitializeSpy")

public actual fun coRegisterMallocSpy(pmallocspy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterMallocSpy")

public actual fun coRegisterPSClsid(riid: ConstPtr, rclsid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterPSClsid")

public actual fun coRegisterSurrogate(psurrogate: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRegisterSurrogate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoReleaseServerProcess")
private external fun wasiWindowssysWindowsWin32SystemComCoReleaseServerProcess(): Int

public actual fun coReleaseServerProcess(): UInt =
    wasiWindowssysWindowsWin32SystemComCoReleaseServerProcess().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoResumeClassObjects")
private external fun wasiWindowssysWindowsWin32SystemComCoResumeClassObjects(): Int

public actual fun coResumeClassObjects(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoResumeClassObjects()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevertToSelf")
private external fun wasiWindowssysWindowsWin32SystemComCoRevertToSelf(): Int

public actual fun coRevertToSelf(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevertToSelf()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevokeClassObject")
private external fun wasiWindowssysWindowsWin32SystemComCoRevokeClassObject(dwregister: Int): Int

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevokeClassObject(dwregister.toInt())

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoRevokeDeviceCatalog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevokeInitializeSpy")
private external fun wasiWindowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie: Long): Int

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoRevokeMallocSpy")
private external fun wasiWindowssysWindowsWin32SystemComCoRevokeMallocSpy(): Int

public actual fun coRevokeMallocSpy(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoRevokeMallocSpy()

public actual fun coSetCancelObject(punk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoSetCancelObject")

public actual fun coSetProxyBlanket(pproxy: MutPtr, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr, dwcapabilities: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoSetProxyBlanket")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoSuspendClassObjects")
private external fun wasiWindowssysWindowsWin32SystemComCoSuspendClassObjects(): Int

public actual fun coSuspendClassObjects(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoSuspendClassObjects()

public actual fun coSwitchCallContext(pnewobject: MutPtr, ppoldobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoSwitchCallContext")

public actual fun coTaskMemAlloc(cb: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTaskMemAlloc")

public actual fun coTaskMemFree(pv: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTaskMemFree")

public actual fun coTaskMemRealloc(pv: ConstPtr, cb: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTaskMemRealloc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoTestCancel")
private external fun wasiWindowssysWindowsWin32SystemComCoTestCancel(): Int

public actual fun coTestCancel(): Hresult =
    wasiWindowssysWindowsWin32SystemComCoTestCancel()

public actual fun coTreatAsClass(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoTreatAsClass")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemComCoUninitialize")
private external fun wasiWindowssysWindowsWin32SystemComCoUninitialize(): Unit

public actual fun coUninitialize(): Unit =
    wasiWindowssysWindowsWin32SystemComCoUninitialize()

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoWaitForMultipleHandles")

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCoWaitForMultipleObjects")

public actual fun createAntiMoniker(ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateAntiMoniker")

public actual fun createBindCtx(reserved: UInt, ppbc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateBindCtx")

public actual fun createClassMoniker(rclsid: ConstPtr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateClassMoniker")

public actual fun createDataAdviseHolder(ppdaholder: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateDataAdviseHolder")

public actual fun createDataCache(punkouter: MutPtr, rclsid: ConstPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateDataCache")

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateFileMoniker")

public actual fun createGenericComposite(pmkfirst: MutPtr, pmkrest: MutPtr, ppmkcomposite: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateGenericComposite")

public actual fun createIUriBuilder(piuri: MutPtr, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateIUriBuilder")

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateItemMoniker")

public actual fun createObjrefMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateObjrefMoniker")

public actual fun createPointerMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreatePointerMoniker")

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr, ppibsc: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateStdProgressIndicator")

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateUri")

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateUriFromMultiByteString")

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComCreateUriWithFragment")

public actual fun dcomChannelSetHResult(pvreserved: ConstPtr, pulreserved: ConstPtr, appshr: Hresult): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComDcomChannelSetHResult")

public actual fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComGetClassFile")

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComGetErrorInfo")

public actual fun getRunningObjectTable(reserved: UInt, pprot: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComGetRunningObjectTable")

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComIIDFromString")

public actual fun mkParseDisplayName(pbc: MutPtr, szusername: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMkParseDisplayName")

public actual fun monikerCommonPrefixWith(pmkthis: MutPtr, pmkother: MutPtr, ppmkcommon: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMonikerCommonPrefixWith")

public actual fun monikerRelativePathTo(pmksrc: MutPtr, pmkdest: MutPtr, ppmkrelpath: MutPtr, dwreserved: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComMonikerRelativePathTo")

public actual fun progIDFromCLSID(clsid: ConstPtr, lplpszprogid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComProgIDFromCLSID")

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComSetErrorInfo")

public actual fun stringFromCLSID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStringFromCLSID")

public actual fun stringFromGUID2(rguid: ConstPtr, lpsz: Pwstr, cchmax: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStringFromGUID2")

public actual fun stringFromIID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemComStringFromIID")
