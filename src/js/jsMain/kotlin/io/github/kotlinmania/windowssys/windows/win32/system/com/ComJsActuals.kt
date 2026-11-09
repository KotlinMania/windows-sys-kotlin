@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private val _windowsWin32SystemComNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BindMoniker(pmk: Long, grfopt: UInt, iidresult: Long, ppvresult: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_BindMoniker(pmk.toString(), grfopt.toInt(), iidresult.toString(), ppvresult.toString()) as Int) else 0

public actual fun CLSIDFromProgID(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CLSIDFromProgID(lpszprogid.toString(), lpclsid.toString()) as Int) else 0

public actual fun CLSIDFromProgIDEx(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CLSIDFromProgIDEx(lpszprogid.toString(), lpclsid.toString()) as Int) else 0

public actual fun CLSIDFromString(lpsz: PCWSTR, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CLSIDFromString(lpsz.toString(), pclsid.toString()) as Int) else 0

public actual fun CoAddRefServerProcess(): UInt =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoAddRefServerProcess() as Int).toUInt() else 0u

public actual fun CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoAllowSetForegroundWindow(punk.toString(), lpvreserved.toString()) as Int) else 0

public actual fun CoAllowUnmarshalerCLSID(clsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoAllowUnmarshalerCLSID(clsid.toString()) as Int) else 0

public actual fun CoBuildVersion(): UInt =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoBuildVersion() as Int).toUInt() else 0u

public actual fun CoCancelCall(dwthreadid: UInt, ultimeout: UInt): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCancelCall(dwthreadid.toInt(), ultimeout.toInt()) as Int) else 0

public actual fun CoCopyProxy(pproxy: Long, ppcopy: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCopyProxy(pproxy.toString(), ppcopy.toString()) as Int) else 0

public actual fun CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCreateFreeThreadedMarshaler(punkouter.toString(), ppunkmarshal.toString()) as Int) else 0

public actual fun CoCreateGuid(pguid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCreateGuid(pguid.toString()) as Int) else 0

public actual fun CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: CLSCTX, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCreateInstance(rclsid.toString(), punkouter.toString(), dwclscontext.toInt(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, pserverinfo: Long, dwcount: UInt, presults: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCreateInstanceEx(clsid.toString(), punkouter.toString(), dwclsctx.toInt(), pserverinfo.toString(), dwcount.toInt(), presults.toString()) as Int) else 0

public actual fun CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, reserved: Long, dwcount: UInt, presults: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoCreateInstanceFromApp(clsid.toString(), punkouter.toString(), dwclsctx.toInt(), reserved.toString(), dwcount.toInt(), presults.toString()) as Int) else 0

public actual fun CoDecrementMTAUsage(cookie: CO_MTA_USAGE_COOKIE): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoDecrementMTAUsage(cookie.toString()) as Int) else 0

public actual fun CoDisableCallCancellation(preserved: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoDisableCallCancellation(preserved.toString()) as Int) else 0

public actual fun CoDisconnectContext(dwtimeout: UInt): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoDisconnectContext(dwtimeout.toInt()) as Int) else 0

public actual fun CoDisconnectObject(punk: Long, dwreserved: UInt): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoDisconnectObject(punk.toString(), dwreserved.toInt()) as Int) else 0

public actual fun CoDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: Long): BOOL =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoDosDateTimeToFileTime(ndosdate.toInt(), ndostime.toInt(), lpfiletime.toString()) as Int) else 0

public actual fun CoEnableCallCancellation(preserved: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoEnableCallCancellation(preserved.toString()) as Int) else 0

public actual fun CoFileTimeNow(lpfiletime: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoFileTimeNow(lpfiletime.toString()) as Int) else 0

public actual fun CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): BOOL =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoFileTimeToDosDateTime(lpfiletime.toString(), lpdosdate.toString(), lpdostime.toString()) as Int) else 0

public actual fun CoFreeAllLibraries() {
    if (_windowsWin32SystemComNapiAddon != null) {
        _windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoFreeAllLibraries()
    }
}

public actual fun CoFreeLibrary(hinst: HINSTANCE) {
    if (_windowsWin32SystemComNapiAddon != null) {
        _windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoFreeLibrary(hinst.toString())
    }
}

public actual fun CoFreeUnusedLibraries() {
    if (_windowsWin32SystemComNapiAddon != null) {
        _windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoFreeUnusedLibraries()
    }
}

public actual fun CoFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    if (_windowsWin32SystemComNapiAddon != null) {
        _windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
    }
}

public actual fun CoGetApartmentType(papttype: Long, paptqualifier: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetApartmentType(papttype.toString(), paptqualifier.toString()) as Int) else 0

public actual fun CoGetCallContext(riid: Long, ppinterface: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetCallContext(riid.toString(), ppinterface.toString()) as Int) else 0

public actual fun CoGetCallerTID(lpdwtid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetCallerTID(lpdwtid.toString()) as Int) else 0

public actual fun CoGetCancelObject(dwthreadid: UInt, iid: Long, ppunk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetCancelObject(dwthreadid.toInt(), iid.toString(), ppunk.toString()) as Int) else 0

public actual fun CoGetClassObject(rclsid: Long, dwclscontext: UInt, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetClassObject(rclsid.toString(), dwclscontext.toInt(), pvreserved.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CoGetContextToken(ptoken: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetContextToken(ptoken.toString()) as Int) else 0

public actual fun CoGetCurrentLogicalThreadId(pguid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetCurrentLogicalThreadId(pguid.toString()) as Int) else 0

public actual fun CoGetCurrentProcess(): UInt =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetCurrentProcess() as Int).toUInt() else 0u

public actual fun CoGetMalloc(dwmemcontext: UInt, ppmalloc: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetMalloc(dwmemcontext.toInt(), ppmalloc.toString()) as Int) else 0

public actual fun CoGetObject(pszname: PCWSTR, pbindoptions: Long, riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetObject(pszname.toString(), pbindoptions.toString(), riid.toString(), ppv.toString()) as Int) else 0

public actual fun CoGetObjectContext(riid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetObjectContext(riid.toString(), ppv.toString()) as Int) else 0

public actual fun CoGetPSClsid(riid: Long, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetPSClsid(riid.toString(), pclsid.toString()) as Int) else 0

public actual fun CoGetSystemSecurityPermissions(comsdtype: COMSD, ppsd: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetSystemSecurityPermissions(comsdtype, ppsd.toString()) as Int) else 0

public actual fun CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoGetTreatAsClass(clsidold.toString(), pclsidnew.toString()) as Int) else 0

public actual fun CoImpersonateClient(): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoImpersonateClient() as Int) else 0

public actual fun CoIncrementMTAUsage(pcookie: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoIncrementMTAUsage(pcookie.toString()) as Int) else 0

public actual fun CoInitialize(pvreserved: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoInitialize(pvreserved.toString()) as Int) else 0

public actual fun CoInitializeEx(pvreserved: Long, dwcoinit: UInt): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoInitializeEx(pvreserved.toString(), dwcoinit.toInt()) as Int) else 0

public actual fun CoInitializeSecurity(psecdesc: PSECURITY_DESCRIPTOR, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthlist: Long, dwcapabilities: UInt, preserved3: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoInitializeSecurity(psecdesc.toString(), cauthsvc, asauthsvc.toString(), preserved1.toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), pauthlist.toString(), dwcapabilities.toInt(), preserved3.toString()) as Int) else 0

public actual fun CoInstall(pbc: Long, dwflags: UInt, pclassspec: Long, pquery: Long, pszcodebase: PCWSTR): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoInstall(pbc.toString(), dwflags.toInt(), pclassspec.toString(), pquery.toString(), pszcodebase.toString()) as Int) else 0

public actual fun CoInvalidateRemoteMachineBindings(pszmachinename: PCWSTR): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoInvalidateRemoteMachineBindings(pszmachinename.toString()) as Int) else 0

public actual fun CoIsHandlerConnected(punk: Long): BOOL =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoIsHandlerConnected(punk.toString()) as Int) else 0

public actual fun CoIsOle1Class(rclsid: Long): BOOL =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoIsOle1Class(rclsid.toString()) as Int) else 0

public actual fun CoLoadLibrary(lpszlibname: PCWSTR, bautofree: BOOL): HINSTANCE =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoLoadLibrary(lpszlibname.toString(), bautofree) as String).toLong() else 0L

public actual fun CoLockObjectExternal(punk: Long, flock: BOOL, flastunlockreleases: BOOL): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoLockObjectExternal(punk.toString(), flock, flastunlockreleases) as Int) else 0

public actual fun CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoQueryAuthenticationServices(pcauthsvc.toString(), asauthsvc.toString()) as Int) else 0

public actual fun CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoQueryClientBlanket(pauthnsvc.toString(), pauthzsvc.toString(), pserverprincname.toString(), pauthnlevel.toString(), pimplevel.toString(), pprivs.toString(), pcapabilities.toString()) as Int) else 0

public actual fun CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoQueryProxyBlanket(pproxy.toString(), pwauthnsvc.toString(), pauthzsvc.toString(), pserverprincname.toString(), pauthnlevel.toString(), pimplevel.toString(), pauthinfo.toString(), pcapabilites.toString()) as Int) else 0

public actual fun CoRegisterActivationFilter(pactivationfilter: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterActivationFilter(pactivationfilter.toString()) as Int) else 0

public actual fun CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterChannelHook(extensionuuid.toString(), pchannelhook.toString()) as Int) else 0

public actual fun CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: CLSCTX, flags: UInt, lpdwregister: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterClassObject(rclsid.toString(), punk.toString(), dwclscontext.toInt(), flags.toInt(), lpdwregister.toString()) as Int) else 0

public actual fun CoRegisterDeviceCatalog(deviceinstanceid: PCWSTR, cookie: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterDeviceCatalog(deviceinstanceid.toString(), cookie.toString()) as Int) else 0

public actual fun CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterInitializeSpy(pspy.toString(), pulicookie.toString()) as Int) else 0

public actual fun CoRegisterMallocSpy(pmallocspy: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterMallocSpy(pmallocspy.toString()) as Int) else 0

public actual fun CoRegisterPSClsid(riid: Long, rclsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterPSClsid(riid.toString(), rclsid.toString()) as Int) else 0

public actual fun CoRegisterSurrogate(psurrogate: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRegisterSurrogate(psurrogate.toString()) as Int) else 0

public actual fun CoReleaseServerProcess(): UInt =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoReleaseServerProcess() as Int).toUInt() else 0u

public actual fun CoResumeClassObjects(): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoResumeClassObjects() as Int) else 0

public actual fun CoRevertToSelf(): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRevertToSelf() as Int) else 0

public actual fun CoRevokeClassObject(dwregister: UInt): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRevokeClassObject(dwregister.toInt()) as Int) else 0

public actual fun CoRevokeDeviceCatalog(cookie: CO_DEVICE_CATALOG_COOKIE): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRevokeDeviceCatalog(cookie.toString()) as Int) else 0

public actual fun CoRevokeInitializeSpy(ulicookie: ULong): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRevokeInitializeSpy(ulicookie.toString()) as Int) else 0

public actual fun CoRevokeMallocSpy(): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoRevokeMallocSpy() as Int) else 0

public actual fun CoSetCancelObject(punk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoSetCancelObject(punk.toString()) as Int) else 0

public actual fun CoSetProxyBlanket(pproxy: Long, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: PCWSTR, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthinfo: Long, dwcapabilities: UInt): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoSetProxyBlanket(pproxy.toString(), dwauthnsvc.toInt(), dwauthzsvc.toInt(), pserverprincname.toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), pauthinfo.toString(), dwcapabilities.toInt()) as Int) else 0

public actual fun CoSuspendClassObjects(): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoSuspendClassObjects() as Int) else 0

public actual fun CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoSwitchCallContext(pnewobject.toString(), ppoldobject.toString()) as Int) else 0

public actual fun CoTaskMemAlloc(cb: ULong): Long =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoTaskMemAlloc(cb.toString()) as String).toLong() else 0L

public actual fun CoTaskMemFree(pv: Long) {
    if (_windowsWin32SystemComNapiAddon != null) {
        _windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoTaskMemFree(pv.toString())
    }
}

public actual fun CoTaskMemRealloc(pv: Long, cb: ULong): Long =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoTaskMemRealloc(pv.toString(), cb.toString()) as String).toLong() else 0L

public actual fun CoTestCancel(): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoTestCancel() as Int) else 0

public actual fun CoTreatAsClass(clsidold: Long, clsidnew: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoTreatAsClass(clsidold.toString(), clsidnew.toString()) as Int) else 0

public actual fun CoUninitialize() {
    if (_windowsWin32SystemComNapiAddon != null) {
        _windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoUninitialize()
    }
}

public actual fun CoWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.toString(), lpdwindex.toString()) as Int) else 0

public actual fun CoWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CoWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.toString(), lpdwindex.toString()) as Int) else 0

public actual fun CreateAntiMoniker(ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateAntiMoniker(ppmk.toString()) as Int) else 0

public actual fun CreateBindCtx(reserved: UInt, ppbc: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateBindCtx(reserved.toInt(), ppbc.toString()) as Int) else 0

public actual fun CreateClassMoniker(rclsid: Long, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateClassMoniker(rclsid.toString(), ppmk.toString()) as Int) else 0

public actual fun CreateDataAdviseHolder(ppdaholder: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateDataAdviseHolder(ppdaholder.toString()) as Int) else 0

public actual fun CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateDataCache(punkouter.toString(), rclsid.toString(), iid.toString(), ppv.toString()) as Int) else 0

public actual fun CreateFileMoniker(lpszpathname: PCWSTR, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateFileMoniker(lpszpathname.toString(), ppmk.toString()) as Int) else 0

public actual fun CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateGenericComposite(pmkfirst.toString(), pmkrest.toString(), ppmkcomposite.toString()) as Int) else 0

public actual fun CreateIUriBuilder(piuri: Long, dwflags: UInt, dwreserved: ULong, ppiuribuilder: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateIUriBuilder(piuri.toString(), dwflags.toInt(), dwreserved.toString(), ppiuribuilder.toString()) as Int) else 0

public actual fun CreateItemMoniker(lpszdelim: PCWSTR, lpszitem: PCWSTR, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateItemMoniker(lpszdelim.toString(), lpszitem.toString(), ppmk.toString()) as Int) else 0

public actual fun CreateObjrefMoniker(punk: Long, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateObjrefMoniker(punk.toString(), ppmk.toString()) as Int) else 0

public actual fun CreatePointerMoniker(punk: Long, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreatePointerMoniker(punk.toString(), ppmk.toString()) as Int) else 0

public actual fun CreateStdProgressIndicator(hwndparent: HWND, psztitle: PCWSTR, pibsccaller: Long, ppibsc: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateStdProgressIndicator(hwndparent.toString(), psztitle.toString(), pibsccaller.toString(), ppibsc.toString()) as Int) else 0

public actual fun CreateUri(pwzuri: PCWSTR, dwflags: URI_CREATE_FLAGS, dwreserved: ULong, ppuri: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateUri(pwzuri.toString(), dwflags.toInt(), dwreserved.toString(), ppuri.toString()) as Int) else 0

public actual fun CreateUriFromMultiByteString(pszansiinputuri: PCSTR, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateUriFromMultiByteString(pszansiinputuri.toString(), dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toString(), ppuri.toString()) as Int) else 0

public actual fun CreateUriWithFragment(pwzuri: PCWSTR, pwzfragment: PCWSTR, dwflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_CreateUriWithFragment(pwzuri.toString(), pwzfragment.toString(), dwflags.toInt(), dwreserved.toString(), ppuri.toString()) as Int) else 0

public actual fun DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: HRESULT): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_DcomChannelSetHResult(pvreserved.toString(), pulreserved.toString(), appshr) as Int) else 0

public actual fun GetClassFile(szfilename: PCWSTR, pclsid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_GetClassFile(szfilename.toString(), pclsid.toString()) as Int) else 0

public actual fun GetErrorInfo(dwreserved: UInt, pperrinfo: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_GetErrorInfo(dwreserved.toInt(), pperrinfo.toString()) as Int) else 0

public actual fun GetRunningObjectTable(reserved: UInt, pprot: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_GetRunningObjectTable(reserved.toInt(), pprot.toString()) as Int) else 0

public actual fun IIDFromString(lpsz: PCWSTR, lpiid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_IIDFromString(lpsz.toString(), lpiid.toString()) as Int) else 0

public actual fun MkParseDisplayName(pbc: Long, szusername: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_MkParseDisplayName(pbc.toString(), szusername.toString(), pcheaten.toString(), ppmk.toString()) as Int) else 0

public actual fun MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_MonikerCommonPrefixWith(pmkthis.toString(), pmkother.toString(), ppmkcommon.toString()) as Int) else 0

public actual fun MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: BOOL): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_MonikerRelativePathTo(pmksrc.toString(), pmkdest.toString(), ppmkrelpath.toString(), dwreserved) as Int) else 0

public actual fun ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_ProgIDFromCLSID(clsid.toString(), lplpszprogid.toString()) as Int) else 0

public actual fun SetErrorInfo(dwreserved: UInt, perrinfo: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_SetErrorInfo(dwreserved.toInt(), perrinfo.toString()) as Int) else 0

public actual fun StringFromCLSID(rclsid: Long, lplpsz: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_StringFromCLSID(rclsid.toString(), lplpsz.toString()) as Int) else 0

public actual fun StringFromGUID2(rguid: Long, lpsz: PWSTR, cchmax: Int): Int =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_StringFromGUID2(rguid.toString(), lpsz.toString(), cchmax) as Int) else 0

public actual fun StringFromIID(rclsid: Long, lplpsz: Long): HRESULT =
    if (_windowsWin32SystemComNapiAddon != null) (_windowsWin32SystemComNapiAddon.windowssys_windows_win32_system_com_StringFromIID(rclsid.toString(), lplpsz.toString()) as Int) else 0
