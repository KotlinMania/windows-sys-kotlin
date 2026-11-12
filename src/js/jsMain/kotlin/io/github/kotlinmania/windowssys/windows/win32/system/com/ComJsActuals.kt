@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemComNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bindMoniker(pmk: MutPtr, grfopt: UInt, iidresult: ConstPtr, ppvresult: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComBindMoniker(pmk.rawAddress.toString(), grfopt.toInt(), iidresult.rawAddress.toString(), ppvresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCLSIDFromProgID(lpszprogid.rawAddress.toString(), lpclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCLSIDFromProgIDEx(lpszprogid.rawAddress.toString(), lpclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCLSIDFromString(lpsz.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAddRefServerProcess(): UInt =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoAddRefServerProcess() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAllowSetForegroundWindow(punk: MutPtr, lpvreserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoAllowSetForegroundWindow(punk.rawAddress.toString(), lpvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAllowUnmarshalerCLSID(clsid: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(clsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coBuildVersion(): UInt =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoBuildVersion() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCancelCall(dwthreadid.toInt(), ultimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCopyProxy(pproxy: MutPtr, ppcopy: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCopyProxy(pproxy.rawAddress.toString(), ppcopy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateFreeThreadedMarshaler(punkouter: MutPtr, ppunkmarshal: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(punkouter.rawAddress.toString(), ppunkmarshal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateGuid(pguid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCreateGuid(pguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, dwclscontext: Clsctx, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCreateInstance(rclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclscontext.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstanceEx(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pserverinfo: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCreateInstanceEx(clsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), pserverinfo.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstanceFromApp(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, reserved: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoCreateInstanceFromApp(clsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), reserved.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoDecrementMTAUsage(cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisableCallCancellation(preserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoDisableCallCancellation(preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisconnectObject(punk: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoDisconnectObject(punk.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr): Bool =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoDosDateTimeToFileTime(ndosdate.toInt(), ndostime.toInt(), lpfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnableCallCancellation(preserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoEnableCallCancellation(preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFileTimeNow(lpfiletime: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoFileTimeNow(lpfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFileTimeToDosDateTime(lpfiletime: ConstPtr, lpdosdate: MutPtr, lpdostime: MutPtr): Bool =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoFileTimeToDosDateTime(lpfiletime.rawAddress.toString(), lpdosdate.rawAddress.toString(), lpdostime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFreeAllLibraries() {
    if (windowsWin32SystemComNapiAddon != null) {
        windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoFreeAllLibraries()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    if (windowsWin32SystemComNapiAddon != null) {
        windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoFreeLibrary(hinst.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeUnusedLibraries() {
    if (windowsWin32SystemComNapiAddon != null) {
        windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoFreeUnusedLibraries()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    if (windowsWin32SystemComNapiAddon != null) {
        windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetApartmentType(papttype: MutPtr, paptqualifier: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetApartmentType(papttype.rawAddress.toString(), paptqualifier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCallContext(riid: ConstPtr, ppinterface: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetCallContext(riid.rawAddress.toString(), ppinterface.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCallerTID(lpdwtid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetCallerTID(lpdwtid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr, ppunk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetCancelObject(dwthreadid.toInt(), iid.rawAddress.toString(), ppunk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetClassObject(rclsid: ConstPtr, dwclscontext: UInt, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetClassObject(rclsid.rawAddress.toString(), dwclscontext.toInt(), pvreserved.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetContextToken(ptoken: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetContextToken(ptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCurrentLogicalThreadId(pguid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(pguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCurrentProcess(): UInt =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetCurrentProcess() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetMalloc(dwmemcontext.toInt(), ppmalloc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetObject(pszname.rawAddress.toString(), pbindoptions.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetObjectContext(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetObjectContext(riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetPSClsid(riid: ConstPtr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetPSClsid(riid.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(comsdtype, ppsd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetTreatAsClass(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoGetTreatAsClass(clsidold.rawAddress.toString(), pclsidnew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coImpersonateClient(): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoImpersonateClient() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIncrementMTAUsage(pcookie: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoIncrementMTAUsage(pcookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitialize(pvreserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoInitialize(pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitializeEx(pvreserved: ConstPtr, dwcoinit: UInt): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoInitializeEx(pvreserved.rawAddress.toString(), dwcoinit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr, preserved1: ConstPtr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr, dwcapabilities: UInt, preserved3: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoInitializeSecurity(psecdesc.rawAddress.toString(), cauthsvc, asauthsvc.rawAddress.toString(), preserved1.rawAddress.toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), pauthlist.rawAddress.toString(), dwcapabilities.toInt(), preserved3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInstall(pbc: MutPtr, dwflags: UInt, pclassspec: ConstPtr, pquery: ConstPtr, pszcodebase: Pcwstr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoInstall(pbc.rawAddress.toString(), dwflags.toInt(), pclassspec.rawAddress.toString(), pquery.rawAddress.toString(), pszcodebase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(pszmachinename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIsHandlerConnected(punk: MutPtr): Bool =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoIsHandlerConnected(punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIsOle1Class(rclsid: ConstPtr): Bool =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoIsOle1Class(rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    if (windowsWin32SystemComNapiAddon != null) MutPtr((windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoLoadLibrary(lpszlibname.rawAddress.toString(), bautofree) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLockObjectExternal(punk: MutPtr, flock: Bool, flastunlockreleases: Bool): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoLockObjectExternal(punk.rawAddress.toString(), flock, flastunlockreleases) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryAuthenticationServices(pcauthsvc: MutPtr, asauthsvc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoQueryAuthenticationServices(pcauthsvc.rawAddress.toString(), asauthsvc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryClientBlanket(pauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pprivs: MutPtr, pcapabilities: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoQueryClientBlanket(pauthnsvc.rawAddress.toString(), pauthzsvc.rawAddress.toString(), pserverprincname.rawAddress.toString(), pauthnlevel.rawAddress.toString(), pimplevel.rawAddress.toString(), pprivs.rawAddress.toString(), pcapabilities.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryProxyBlanket(pproxy: MutPtr, pwauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pauthinfo: MutPtr, pcapabilites: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoQueryProxyBlanket(pproxy.rawAddress.toString(), pwauthnsvc.rawAddress.toString(), pauthzsvc.rawAddress.toString(), pserverprincname.rawAddress.toString(), pauthnlevel.rawAddress.toString(), pimplevel.rawAddress.toString(), pauthinfo.rawAddress.toString(), pcapabilites.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterActivationFilter(pactivationfilter: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterActivationFilter(pactivationfilter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterChannelHook(extensionuuid: ConstPtr, pchannelhook: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterChannelHook(extensionuuid.rawAddress.toString(), pchannelhook.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterClassObject(rclsid: ConstPtr, punk: MutPtr, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterClassObject(rclsid.rawAddress.toString(), punk.rawAddress.toString(), dwclscontext.toInt(), flags.toInt(), lpdwregister.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterDeviceCatalog(deviceinstanceid.rawAddress.toString(), cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterInitializeSpy(pspy: MutPtr, pulicookie: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterInitializeSpy(pspy.rawAddress.toString(), pulicookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterMallocSpy(pmallocspy: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterMallocSpy(pmallocspy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterPSClsid(riid: ConstPtr, rclsid: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterPSClsid(riid.rawAddress.toString(), rclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterSurrogate(psurrogate: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRegisterSurrogate(psurrogate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coReleaseServerProcess(): UInt =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoReleaseServerProcess() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coResumeClassObjects(): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoResumeClassObjects() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevertToSelf(): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRevertToSelf() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRevokeClassObject(dwregister.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRevokeDeviceCatalog(cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeMallocSpy(): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoRevokeMallocSpy() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSetCancelObject(punk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoSetCancelObject(punk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSetProxyBlanket(pproxy: MutPtr, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr, dwcapabilities: UInt): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoSetProxyBlanket(pproxy.rawAddress.toString(), dwauthnsvc.toInt(), dwauthzsvc.toInt(), pserverprincname.rawAddress.toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), pauthinfo.rawAddress.toString(), dwcapabilities.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSuspendClassObjects(): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoSuspendClassObjects() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSwitchCallContext(pnewobject: MutPtr, ppoldobject: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoSwitchCallContext(pnewobject.rawAddress.toString(), ppoldobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTaskMemAlloc(cb: ULong): MutPtr =
    if (windowsWin32SystemComNapiAddon != null) MutPtr((windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoTaskMemAlloc(cb.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTaskMemFree(pv: ConstPtr) {
    if (windowsWin32SystemComNapiAddon != null) {
        windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoTaskMemFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coTaskMemRealloc(pv: ConstPtr, cb: ULong): MutPtr =
    if (windowsWin32SystemComNapiAddon != null) MutPtr((windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoTaskMemRealloc(pv.rawAddress.toString(), cb.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTestCancel(): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoTestCancel() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTreatAsClass(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoTreatAsClass(clsidold.rawAddress.toString(), clsidnew.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUninitialize() {
    if (windowsWin32SystemComNapiAddon != null) {
        windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.rawAddress.toString(), lpdwindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCoWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.rawAddress.toString(), lpdwindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAntiMoniker(ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateAntiMoniker(ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBindCtx(reserved: UInt, ppbc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateBindCtx(reserved.toInt(), ppbc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClassMoniker(rclsid: ConstPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateClassMoniker(rclsid.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDataAdviseHolder(ppdaholder: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateDataAdviseHolder(ppdaholder.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDataCache(punkouter: MutPtr, rclsid: ConstPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateDataCache(punkouter.rawAddress.toString(), rclsid.rawAddress.toString(), iid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateFileMoniker(lpszpathname.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createGenericComposite(pmkfirst: MutPtr, pmkrest: MutPtr, ppmkcomposite: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateGenericComposite(pmkfirst.rawAddress.toString(), pmkrest.rawAddress.toString(), ppmkcomposite.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIUriBuilder(piuri: MutPtr, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateIUriBuilder(piuri.rawAddress.toString(), dwflags.toInt(), dwreserved.toString(), ppiuribuilder.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateItemMoniker(lpszdelim.rawAddress.toString(), lpszitem.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createObjrefMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateObjrefMoniker(punk.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPointerMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreatePointerMoniker(punk.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr, ppibsc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateStdProgressIndicator(hwndparent.rawAddress.toString(), psztitle.rawAddress.toString(), pibsccaller.rawAddress.toString(), ppibsc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateUri(pwzuri.rawAddress.toString(), dwflags.toInt(), dwreserved.toString(), ppuri.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateUriFromMultiByteString(pszansiinputuri.rawAddress.toString(), dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toString(), ppuri.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComCreateUriWithFragment(pwzuri.rawAddress.toString(), pwzfragment.rawAddress.toString(), dwflags.toInt(), dwreserved.toString(), ppuri.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dcomChannelSetHResult(pvreserved: ConstPtr, pulreserved: ConstPtr, appshr: Hresult): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComDcomChannelSetHResult(pvreserved.rawAddress.toString(), pulreserved.rawAddress.toString(), appshr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComGetClassFile(szfilename.rawAddress.toString(), pclsid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComGetErrorInfo(dwreserved.toInt(), pperrinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRunningObjectTable(reserved: UInt, pprot: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComGetRunningObjectTable(reserved.toInt(), pprot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComIIDFromString(lpsz.rawAddress.toString(), lpiid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayName(pbc: MutPtr, szusername: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComMkParseDisplayName(pbc.rawAddress.toString(), szusername.rawAddress.toString(), pcheaten.rawAddress.toString(), ppmk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monikerCommonPrefixWith(pmkthis: MutPtr, pmkother: MutPtr, ppmkcommon: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComMonikerCommonPrefixWith(pmkthis.rawAddress.toString(), pmkother.rawAddress.toString(), ppmkcommon.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monikerRelativePathTo(pmksrc: MutPtr, pmkdest: MutPtr, ppmkrelpath: MutPtr, dwreserved: Bool): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComMonikerRelativePathTo(pmksrc.rawAddress.toString(), pmkdest.rawAddress.toString(), ppmkrelpath.rawAddress.toString(), dwreserved) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun progIDFromCLSID(clsid: ConstPtr, lplpszprogid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComProgIDFromCLSID(clsid.rawAddress.toString(), lplpszprogid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComSetErrorInfo(dwreserved.toInt(), perrinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromCLSID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComStringFromCLSID(rclsid.rawAddress.toString(), lplpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromGUID2(rguid: ConstPtr, lpsz: Pwstr, cchmax: Int): Int =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComStringFromGUID2(rguid.rawAddress.toString(), lpsz.rawAddress.toString(), cchmax) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromIID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAddon != null) (windowsWin32SystemComNapiAddon.windowssysWindowsWin32SystemComStringFromIID(rclsid.rawAddress.toString(), lplpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
