@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BindMoniker(pmk: Long, grfopt: UInt, iidresult: Long, ppvresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_BindMoniker(pmk.toCPointer<ByteVar>(), grfopt, iidresult.toCPointer<ByteVar>(), ppvresult.toCPointer<ByteVar>())

public actual fun CLSIDFromProgID(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CLSIDFromProgID(lpszprogid.toCPointer<ByteVar>(), lpclsid.toCPointer<ByteVar>())

public actual fun CLSIDFromProgIDEx(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CLSIDFromProgIDEx(lpszprogid.toCPointer<ByteVar>(), lpclsid.toCPointer<ByteVar>())

public actual fun CLSIDFromString(lpsz: PCWSTR, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CLSIDFromString(lpsz.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun CoAddRefServerProcess(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoAddRefServerProcess()

public actual fun CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoAllowSetForegroundWindow(punk.toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>())

public actual fun CoAllowUnmarshalerCLSID(clsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoAllowUnmarshalerCLSID(clsid.toCPointer<ByteVar>())

public actual fun CoBuildVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoBuildVersion()

public actual fun CoCancelCall(dwthreadid: UInt, ultimeout: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCancelCall(dwthreadid, ultimeout)

public actual fun CoCopyProxy(pproxy: Long, ppcopy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCopyProxy(pproxy.toCPointer<ByteVar>(), ppcopy.toCPointer<ByteVar>())

public actual fun CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCreateFreeThreadedMarshaler(punkouter.toCPointer<ByteVar>(), ppunkmarshal.toCPointer<ByteVar>())

public actual fun CoCreateGuid(pguid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCreateGuid(pguid.toCPointer<ByteVar>())

public actual fun CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: CLSCTX, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCreateInstance(rclsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), dwclscontext, riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, pserverinfo: Long, dwcount: UInt, presults: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCreateInstanceEx(clsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), dwclsctx, pserverinfo.toCPointer<ByteVar>(), dwcount, presults.toCPointer<ByteVar>())

public actual fun CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, reserved: Long, dwcount: UInt, presults: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoCreateInstanceFromApp(clsid.toCPointer<ByteVar>(), punkouter.toCPointer<ByteVar>(), dwclsctx, reserved.toCPointer<ByteVar>(), dwcount, presults.toCPointer<ByteVar>())

public actual fun CoDecrementMTAUsage(cookie: CO_MTA_USAGE_COOKIE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoDecrementMTAUsage(cookie.toCPointer<ByteVar>())

public actual fun CoDisableCallCancellation(preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoDisableCallCancellation(preserved.toCPointer<ByteVar>())

public actual fun CoDisconnectContext(dwtimeout: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoDisconnectContext(dwtimeout)

public actual fun CoDisconnectObject(punk: Long, dwreserved: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoDisconnectObject(punk.toCPointer<ByteVar>(), dwreserved)

public actual fun CoDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoDosDateTimeToFileTime(ndosdate, ndostime, lpfiletime.toCPointer<ByteVar>())

public actual fun CoEnableCallCancellation(preserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoEnableCallCancellation(preserved.toCPointer<ByteVar>())

public actual fun CoFileTimeNow(lpfiletime: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoFileTimeNow(lpfiletime.toCPointer<ByteVar>())

public actual fun CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoFileTimeToDosDateTime(lpfiletime.toCPointer<ByteVar>(), lpdosdate.toCPointer<ByteVar>(), lpdostime.toCPointer<ByteVar>())

public actual fun CoFreeAllLibraries() {
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoFreeAllLibraries()
}

public actual fun CoFreeLibrary(hinst: HINSTANCE) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoFreeLibrary(hinst.toCPointer<ByteVar>())
}

public actual fun CoFreeUnusedLibraries() {
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoFreeUnusedLibraries()
}

public actual fun CoFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoFreeUnusedLibrariesEx(dwunloaddelay, dwreserved)
}

public actual fun CoGetApartmentType(papttype: Long, paptqualifier: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetApartmentType(papttype.toCPointer<ByteVar>(), paptqualifier.toCPointer<ByteVar>())

public actual fun CoGetCallContext(riid: Long, ppinterface: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetCallContext(riid.toCPointer<ByteVar>(), ppinterface.toCPointer<ByteVar>())

public actual fun CoGetCallerTID(lpdwtid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetCallerTID(lpdwtid.toCPointer<ByteVar>())

public actual fun CoGetCancelObject(dwthreadid: UInt, iid: Long, ppunk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetCancelObject(dwthreadid, iid.toCPointer<ByteVar>(), ppunk.toCPointer<ByteVar>())

public actual fun CoGetClassObject(rclsid: Long, dwclscontext: UInt, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetClassObject(rclsid.toCPointer<ByteVar>(), dwclscontext, pvreserved.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CoGetContextToken(ptoken: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetContextToken(ptoken.toCPointer<ByteVar>())

public actual fun CoGetCurrentLogicalThreadId(pguid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetCurrentLogicalThreadId(pguid.toCPointer<ByteVar>())

public actual fun CoGetCurrentProcess(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetCurrentProcess()

public actual fun CoGetMalloc(dwmemcontext: UInt, ppmalloc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetMalloc(dwmemcontext, ppmalloc.toCPointer<ByteVar>())

public actual fun CoGetObject(pszname: PCWSTR, pbindoptions: Long, riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetObject(pszname.toCPointer<ByteVar>(), pbindoptions.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CoGetObjectContext(riid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetObjectContext(riid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CoGetPSClsid(riid: Long, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetPSClsid(riid.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun CoGetSystemSecurityPermissions(comsdtype: COMSD, ppsd: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetSystemSecurityPermissions(comsdtype, ppsd.toCPointer<ByteVar>())

public actual fun CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoGetTreatAsClass(clsidold.toCPointer<ByteVar>(), pclsidnew.toCPointer<ByteVar>())

public actual fun CoImpersonateClient(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoImpersonateClient()

public actual fun CoIncrementMTAUsage(pcookie: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoIncrementMTAUsage(pcookie.toCPointer<ByteVar>())

public actual fun CoInitialize(pvreserved: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoInitialize(pvreserved.toCPointer<ByteVar>())

public actual fun CoInitializeEx(pvreserved: Long, dwcoinit: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoInitializeEx(pvreserved.toCPointer<ByteVar>(), dwcoinit)

public actual fun CoInitializeSecurity(psecdesc: PSECURITY_DESCRIPTOR, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthlist: Long, dwcapabilities: UInt, preserved3: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoInitializeSecurity(psecdesc.toCPointer<ByteVar>(), cauthsvc, asauthsvc.toCPointer<ByteVar>(), preserved1.toCPointer<ByteVar>(), dwauthnlevel, dwimplevel, pauthlist.toCPointer<ByteVar>(), dwcapabilities, preserved3.toCPointer<ByteVar>())

public actual fun CoInstall(pbc: Long, dwflags: UInt, pclassspec: Long, pquery: Long, pszcodebase: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoInstall(pbc.toCPointer<ByteVar>(), dwflags, pclassspec.toCPointer<ByteVar>(), pquery.toCPointer<ByteVar>(), pszcodebase.toCPointer<ByteVar>())

public actual fun CoInvalidateRemoteMachineBindings(pszmachinename: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoInvalidateRemoteMachineBindings(pszmachinename.toCPointer<ByteVar>())

public actual fun CoIsHandlerConnected(punk: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoIsHandlerConnected(punk.toCPointer<ByteVar>())

public actual fun CoIsOle1Class(rclsid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoIsOle1Class(rclsid.toCPointer<ByteVar>())

public actual fun CoLoadLibrary(lpszlibname: PCWSTR, bautofree: BOOL): HINSTANCE =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoLoadLibrary(lpszlibname.toCPointer<ByteVar>(), bautofree)?.toLong() ?: 0L

public actual fun CoLockObjectExternal(punk: Long, flock: BOOL, flastunlockreleases: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoLockObjectExternal(punk.toCPointer<ByteVar>(), flock, flastunlockreleases)

public actual fun CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoQueryAuthenticationServices(pcauthsvc.toCPointer<ByteVar>(), asauthsvc.toCPointer<ByteVar>())

public actual fun CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoQueryClientBlanket(pauthnsvc.toCPointer<ByteVar>(), pauthzsvc.toCPointer<ByteVar>(), pserverprincname.toCPointer<ByteVar>(), pauthnlevel.toCPointer<ByteVar>(), pimplevel.toCPointer<ByteVar>(), pprivs.toCPointer<ByteVar>(), pcapabilities.toCPointer<ByteVar>())

public actual fun CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoQueryProxyBlanket(pproxy.toCPointer<ByteVar>(), pwauthnsvc.toCPointer<ByteVar>(), pauthzsvc.toCPointer<ByteVar>(), pserverprincname.toCPointer<ByteVar>(), pauthnlevel.toCPointer<ByteVar>(), pimplevel.toCPointer<ByteVar>(), pauthinfo.toCPointer<ByteVar>(), pcapabilites.toCPointer<ByteVar>())

public actual fun CoRegisterActivationFilter(pactivationfilter: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterActivationFilter(pactivationfilter.toCPointer<ByteVar>())

public actual fun CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterChannelHook(extensionuuid.toCPointer<ByteVar>(), pchannelhook.toCPointer<ByteVar>())

public actual fun CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: CLSCTX, flags: UInt, lpdwregister: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterClassObject(rclsid.toCPointer<ByteVar>(), punk.toCPointer<ByteVar>(), dwclscontext, flags, lpdwregister.toCPointer<ByteVar>())

public actual fun CoRegisterDeviceCatalog(deviceinstanceid: PCWSTR, cookie: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterDeviceCatalog(deviceinstanceid.toCPointer<ByteVar>(), cookie.toCPointer<ByteVar>())

public actual fun CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterInitializeSpy(pspy.toCPointer<ByteVar>(), pulicookie.toCPointer<ByteVar>())

public actual fun CoRegisterMallocSpy(pmallocspy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterMallocSpy(pmallocspy.toCPointer<ByteVar>())

public actual fun CoRegisterPSClsid(riid: Long, rclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterPSClsid(riid.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>())

public actual fun CoRegisterSurrogate(psurrogate: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRegisterSurrogate(psurrogate.toCPointer<ByteVar>())

public actual fun CoReleaseServerProcess(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoReleaseServerProcess()

public actual fun CoResumeClassObjects(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoResumeClassObjects()

public actual fun CoRevertToSelf(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRevertToSelf()

public actual fun CoRevokeClassObject(dwregister: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRevokeClassObject(dwregister)

public actual fun CoRevokeDeviceCatalog(cookie: CO_DEVICE_CATALOG_COOKIE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRevokeDeviceCatalog(cookie.toCPointer<ByteVar>())

public actual fun CoRevokeInitializeSpy(ulicookie: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRevokeInitializeSpy(ulicookie)

public actual fun CoRevokeMallocSpy(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoRevokeMallocSpy()

public actual fun CoSetCancelObject(punk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoSetCancelObject(punk.toCPointer<ByteVar>())

public actual fun CoSetProxyBlanket(pproxy: Long, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: PCWSTR, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthinfo: Long, dwcapabilities: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoSetProxyBlanket(pproxy.toCPointer<ByteVar>(), dwauthnsvc, dwauthzsvc, pserverprincname.toCPointer<ByteVar>(), dwauthnlevel, dwimplevel, pauthinfo.toCPointer<ByteVar>(), dwcapabilities)

public actual fun CoSuspendClassObjects(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoSuspendClassObjects()

public actual fun CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoSwitchCallContext(pnewobject.toCPointer<ByteVar>(), ppoldobject.toCPointer<ByteVar>())

public actual fun CoTaskMemAlloc(cb: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoTaskMemAlloc(cb)?.toLong() ?: 0L

public actual fun CoTaskMemFree(pv: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoTaskMemFree(pv.toCPointer<ByteVar>())
}

public actual fun CoTaskMemRealloc(pv: Long, cb: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoTaskMemRealloc(pv.toCPointer<ByteVar>(), cb)?.toLong() ?: 0L

public actual fun CoTestCancel(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoTestCancel()

public actual fun CoTreatAsClass(clsidold: Long, clsidnew: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoTreatAsClass(clsidold.toCPointer<ByteVar>(), clsidnew.toCPointer<ByteVar>())

public actual fun CoUninitialize() {
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoUninitialize()
}

public actual fun CoWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoWaitForMultipleHandles(dwflags, dwtimeout, chandles, phandles.toCPointer<ByteVar>(), lpdwindex.toCPointer<ByteVar>())

public actual fun CoWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CoWaitForMultipleObjects(dwflags, dwtimeout, chandles, phandles.toCPointer<ByteVar>(), lpdwindex.toCPointer<ByteVar>())

public actual fun CreateAntiMoniker(ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateAntiMoniker(ppmk.toCPointer<ByteVar>())

public actual fun CreateBindCtx(reserved: UInt, ppbc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateBindCtx(reserved, ppbc.toCPointer<ByteVar>())

public actual fun CreateClassMoniker(rclsid: Long, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateClassMoniker(rclsid.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun CreateDataAdviseHolder(ppdaholder: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateDataAdviseHolder(ppdaholder.toCPointer<ByteVar>())

public actual fun CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateDataCache(punkouter.toCPointer<ByteVar>(), rclsid.toCPointer<ByteVar>(), iid.toCPointer<ByteVar>(), ppv.toCPointer<ByteVar>())

public actual fun CreateFileMoniker(lpszpathname: PCWSTR, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateFileMoniker(lpszpathname.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateGenericComposite(pmkfirst.toCPointer<ByteVar>(), pmkrest.toCPointer<ByteVar>(), ppmkcomposite.toCPointer<ByteVar>())

public actual fun CreateIUriBuilder(piuri: Long, dwflags: UInt, dwreserved: ULong, ppiuribuilder: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateIUriBuilder(piuri.toCPointer<ByteVar>(), dwflags, dwreserved, ppiuribuilder.toCPointer<ByteVar>())

public actual fun CreateItemMoniker(lpszdelim: PCWSTR, lpszitem: PCWSTR, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateItemMoniker(lpszdelim.toCPointer<ByteVar>(), lpszitem.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun CreateObjrefMoniker(punk: Long, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateObjrefMoniker(punk.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun CreatePointerMoniker(punk: Long, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreatePointerMoniker(punk.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun CreateStdProgressIndicator(hwndparent: HWND, psztitle: PCWSTR, pibsccaller: Long, ppibsc: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateStdProgressIndicator(hwndparent.toCPointer<ByteVar>(), psztitle.toCPointer<ByteVar>(), pibsccaller.toCPointer<ByteVar>(), ppibsc.toCPointer<ByteVar>())

public actual fun CreateUri(pwzuri: PCWSTR, dwflags: URI_CREATE_FLAGS, dwreserved: ULong, ppuri: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateUri(pwzuri.toCPointer<ByteVar>(), dwflags, dwreserved, ppuri.toCPointer<ByteVar>())

public actual fun CreateUriFromMultiByteString(pszansiinputuri: PCSTR, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateUriFromMultiByteString(pszansiinputuri.toCPointer<ByteVar>(), dwencodingflags, dwcodepage, dwcreateflags, dwreserved, ppuri.toCPointer<ByteVar>())

public actual fun CreateUriWithFragment(pwzuri: PCWSTR, pwzfragment: PCWSTR, dwflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_CreateUriWithFragment(pwzuri.toCPointer<ByteVar>(), pwzfragment.toCPointer<ByteVar>(), dwflags, dwreserved, ppuri.toCPointer<ByteVar>())

public actual fun DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: HRESULT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_DcomChannelSetHResult(pvreserved.toCPointer<ByteVar>(), pulreserved.toCPointer<ByteVar>(), appshr)

public actual fun GetClassFile(szfilename: PCWSTR, pclsid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_GetClassFile(szfilename.toCPointer<ByteVar>(), pclsid.toCPointer<ByteVar>())

public actual fun GetErrorInfo(dwreserved: UInt, pperrinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_GetErrorInfo(dwreserved, pperrinfo.toCPointer<ByteVar>())

public actual fun GetRunningObjectTable(reserved: UInt, pprot: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_GetRunningObjectTable(reserved, pprot.toCPointer<ByteVar>())

public actual fun IIDFromString(lpsz: PCWSTR, lpiid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_IIDFromString(lpsz.toCPointer<ByteVar>(), lpiid.toCPointer<ByteVar>())

public actual fun MkParseDisplayName(pbc: Long, szusername: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_MkParseDisplayName(pbc.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), pcheaten.toCPointer<ByteVar>(), ppmk.toCPointer<ByteVar>())

public actual fun MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_MonikerCommonPrefixWith(pmkthis.toCPointer<ByteVar>(), pmkother.toCPointer<ByteVar>(), ppmkcommon.toCPointer<ByteVar>())

public actual fun MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_MonikerRelativePathTo(pmksrc.toCPointer<ByteVar>(), pmkdest.toCPointer<ByteVar>(), ppmkrelpath.toCPointer<ByteVar>(), dwreserved)

public actual fun ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_ProgIDFromCLSID(clsid.toCPointer<ByteVar>(), lplpszprogid.toCPointer<ByteVar>())

public actual fun SetErrorInfo(dwreserved: UInt, perrinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_SetErrorInfo(dwreserved, perrinfo.toCPointer<ByteVar>())

public actual fun StringFromCLSID(rclsid: Long, lplpsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_StringFromCLSID(rclsid.toCPointer<ByteVar>(), lplpsz.toCPointer<ByteVar>())

public actual fun StringFromGUID2(rguid: Long, lpsz: PWSTR, cchmax: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_StringFromGUID2(rguid.toCPointer<ByteVar>(), lpsz.toCPointer<ByteVar>(), cchmax)

public actual fun StringFromIID(rclsid: Long, lplpsz: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_StringFromIID(rclsid.toCPointer<ByteVar>(), lplpsz.toCPointer<ByteVar>())
