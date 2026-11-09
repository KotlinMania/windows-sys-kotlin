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

private object WindowsWin32SystemComJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_BindMoniker(pmk: Long, grfopt: Int, iidresult: Long, ppvresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CLSIDFromProgID(lpszprogid: Long, lpclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CLSIDFromProgIDEx(lpszprogid: Long, lpclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CLSIDFromString(lpsz: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoAddRefServerProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoAllowUnmarshalerCLSID(clsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoBuildVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCancelCall(dwthreadid: Int, ultimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCopyProxy(pproxy: Long, ppcopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCreateGuid(pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: Int, pserverinfo: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: Int, reserved: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoDecrementMTAUsage(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoDisableCallCancellation(preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoDisconnectContext(dwtimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoDisconnectObject(punk: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoDosDateTimeToFileTime(ndosdate: Short, ndostime: Short, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoEnableCallCancellation(preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoFileTimeNow(lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoFreeAllLibraries()

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoFreeLibrary(hinst: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoFreeUnusedLibraries()

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoFreeUnusedLibrariesEx(dwunloaddelay: Int, dwreserved: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetApartmentType(papttype: Long, paptqualifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetCallContext(riid: Long, ppinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetCallerTID(lpdwtid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetCancelObject(dwthreadid: Int, iid: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetClassObject(rclsid: Long, dwclscontext: Int, pvreserved: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetContextToken(ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetCurrentLogicalThreadId(pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetCurrentProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetMalloc(dwmemcontext: Int, ppmalloc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetObject(pszname: Long, pbindoptions: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetObjectContext(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetPSClsid(riid: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetSystemSecurityPermissions(comsdtype: Int, ppsd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoImpersonateClient(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoIncrementMTAUsage(pcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoInitialize(pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoInitializeEx(pvreserved: Long, dwcoinit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoInitializeSecurity(psecdesc: Long, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: Int, dwimplevel: Int, pauthlist: Long, dwcapabilities: Int, preserved3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoInstall(pbc: Long, dwflags: Int, pclassspec: Long, pquery: Long, pszcodebase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoInvalidateRemoteMachineBindings(pszmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoIsHandlerConnected(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoIsOle1Class(rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoLoadLibrary(lpszlibname: Long, bautofree: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoLockObjectExternal(punk: Long, flock: Int, flastunlockreleases: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterActivationFilter(pactivationfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: Int, flags: Int, lpdwregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterDeviceCatalog(deviceinstanceid: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterMallocSpy(pmallocspy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterPSClsid(riid: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRegisterSurrogate(psurrogate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoReleaseServerProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoResumeClassObjects(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRevertToSelf(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRevokeClassObject(dwregister: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRevokeDeviceCatalog(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRevokeInitializeSpy(ulicookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoRevokeMallocSpy(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoSetCancelObject(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoSetProxyBlanket(pproxy: Long, dwauthnsvc: Int, dwauthzsvc: Int, pserverprincname: Long, dwauthnlevel: Int, dwimplevel: Int, pauthinfo: Long, dwcapabilities: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoSuspendClassObjects(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoTaskMemAlloc(cb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoTaskMemFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoTaskMemRealloc(pv: Long, cb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoTestCancel(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoTreatAsClass(clsidold: Long, clsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoUninitialize()

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoWaitForMultipleHandles(dwflags: Int, dwtimeout: Int, chandles: Int, phandles: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CoWaitForMultipleObjects(dwflags: Int, dwtimeout: Int, chandles: Int, phandles: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateAntiMoniker(ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateBindCtx(reserved: Int, ppbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateClassMoniker(rclsid: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateDataAdviseHolder(ppdaholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateFileMoniker(lpszpathname: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateIUriBuilder(piuri: Long, dwflags: Int, dwreserved: Long, ppiuribuilder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateItemMoniker(lpszdelim: Long, lpszitem: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateObjrefMoniker(punk: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreatePointerMoniker(punk: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateStdProgressIndicator(hwndparent: Long, psztitle: Long, pibsccaller: Long, ppibsc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateUri(pwzuri: Long, dwflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateUriFromMultiByteString(pszansiinputuri: Long, dwencodingflags: Int, dwcodepage: Int, dwcreateflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_CreateUriWithFragment(pwzuri: Long, pwzfragment: Long, dwflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_GetClassFile(szfilename: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_GetErrorInfo(dwreserved: Int, pperrinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_GetRunningObjectTable(reserved: Int, pprot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_IIDFromString(lpsz: Long, lpiid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_MkParseDisplayName(pbc: Long, szusername: Long, pcheaten: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_SetErrorInfo(dwreserved: Int, perrinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_StringFromCLSID(rclsid: Long, lplpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_StringFromGUID2(rguid: Long, lpsz: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_StringFromIID(rclsid: Long, lplpsz: Long): Int
}

public actual fun BindMoniker(pmk: Long, grfopt: UInt, iidresult: Long, ppvresult: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_BindMoniker(pmk, grfopt.toInt(), iidresult, ppvresult)

public actual fun CLSIDFromProgID(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CLSIDFromProgID(lpszprogid, lpclsid)

public actual fun CLSIDFromProgIDEx(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CLSIDFromProgIDEx(lpszprogid, lpclsid)

public actual fun CLSIDFromString(lpsz: PCWSTR, pclsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CLSIDFromString(lpsz, pclsid)

public actual fun CoAddRefServerProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoAddRefServerProcess().toUInt()

public actual fun CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoAllowSetForegroundWindow(punk, lpvreserved)

public actual fun CoAllowUnmarshalerCLSID(clsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoAllowUnmarshalerCLSID(clsid)

public actual fun CoBuildVersion(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoBuildVersion().toUInt()

public actual fun CoCancelCall(dwthreadid: UInt, ultimeout: UInt): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCancelCall(dwthreadid.toInt(), ultimeout.toInt())

public actual fun CoCopyProxy(pproxy: Long, ppcopy: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCopyProxy(pproxy, ppcopy)

public actual fun CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCreateFreeThreadedMarshaler(punkouter, ppunkmarshal)

public actual fun CoCreateGuid(pguid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCreateGuid(pguid)

public actual fun CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: CLSCTX, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCreateInstance(rclsid, punkouter, dwclscontext.toInt(), riid, ppv)

public actual fun CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, pserverinfo: Long, dwcount: UInt, presults: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCreateInstanceEx(clsid, punkouter, dwclsctx.toInt(), pserverinfo, dwcount.toInt(), presults)

public actual fun CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, reserved: Long, dwcount: UInt, presults: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoCreateInstanceFromApp(clsid, punkouter, dwclsctx.toInt(), reserved, dwcount.toInt(), presults)

public actual fun CoDecrementMTAUsage(cookie: CO_MTA_USAGE_COOKIE): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoDecrementMTAUsage(cookie)

public actual fun CoDisableCallCancellation(preserved: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoDisableCallCancellation(preserved)

public actual fun CoDisconnectContext(dwtimeout: UInt): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoDisconnectContext(dwtimeout.toInt())

public actual fun CoDisconnectObject(punk: Long, dwreserved: UInt): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoDisconnectObject(punk, dwreserved.toInt())

public actual fun CoDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: Long): BOOL =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoDosDateTimeToFileTime(ndosdate.toShort(), ndostime.toShort(), lpfiletime)

public actual fun CoEnableCallCancellation(preserved: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoEnableCallCancellation(preserved)

public actual fun CoFileTimeNow(lpfiletime: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoFileTimeNow(lpfiletime)

public actual fun CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): BOOL =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoFileTimeToDosDateTime(lpfiletime, lpdosdate, lpdostime)

public actual fun CoFreeAllLibraries() {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoFreeAllLibraries()
}

public actual fun CoFreeLibrary(hinst: HINSTANCE) {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoFreeLibrary(hinst)
}

public actual fun CoFreeUnusedLibraries() {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoFreeUnusedLibraries()
}

public actual fun CoFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
}

public actual fun CoGetApartmentType(papttype: Long, paptqualifier: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetApartmentType(papttype, paptqualifier)

public actual fun CoGetCallContext(riid: Long, ppinterface: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetCallContext(riid, ppinterface)

public actual fun CoGetCallerTID(lpdwtid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetCallerTID(lpdwtid)

public actual fun CoGetCancelObject(dwthreadid: UInt, iid: Long, ppunk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetCancelObject(dwthreadid.toInt(), iid, ppunk)

public actual fun CoGetClassObject(rclsid: Long, dwclscontext: UInt, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetClassObject(rclsid, dwclscontext.toInt(), pvreserved, riid, ppv)

public actual fun CoGetContextToken(ptoken: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetContextToken(ptoken)

public actual fun CoGetCurrentLogicalThreadId(pguid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetCurrentLogicalThreadId(pguid)

public actual fun CoGetCurrentProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetCurrentProcess().toUInt()

public actual fun CoGetMalloc(dwmemcontext: UInt, ppmalloc: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetMalloc(dwmemcontext.toInt(), ppmalloc)

public actual fun CoGetObject(pszname: PCWSTR, pbindoptions: Long, riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetObject(pszname, pbindoptions, riid, ppv)

public actual fun CoGetObjectContext(riid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetObjectContext(riid, ppv)

public actual fun CoGetPSClsid(riid: Long, pclsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetPSClsid(riid, pclsid)

public actual fun CoGetSystemSecurityPermissions(comsdtype: COMSD, ppsd: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetSystemSecurityPermissions(comsdtype, ppsd)

public actual fun CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoGetTreatAsClass(clsidold, pclsidnew)

public actual fun CoImpersonateClient(): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoImpersonateClient()

public actual fun CoIncrementMTAUsage(pcookie: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoIncrementMTAUsage(pcookie)

public actual fun CoInitialize(pvreserved: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoInitialize(pvreserved)

public actual fun CoInitializeEx(pvreserved: Long, dwcoinit: UInt): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoInitializeEx(pvreserved, dwcoinit.toInt())

public actual fun CoInitializeSecurity(psecdesc: PSECURITY_DESCRIPTOR, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthlist: Long, dwcapabilities: UInt, preserved3: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoInitializeSecurity(psecdesc, cauthsvc, asauthsvc, preserved1, dwauthnlevel.toInt(), dwimplevel.toInt(), pauthlist, dwcapabilities.toInt(), preserved3)

public actual fun CoInstall(pbc: Long, dwflags: UInt, pclassspec: Long, pquery: Long, pszcodebase: PCWSTR): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoInstall(pbc, dwflags.toInt(), pclassspec, pquery, pszcodebase)

public actual fun CoInvalidateRemoteMachineBindings(pszmachinename: PCWSTR): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoInvalidateRemoteMachineBindings(pszmachinename)

public actual fun CoIsHandlerConnected(punk: Long): BOOL =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoIsHandlerConnected(punk)

public actual fun CoIsOle1Class(rclsid: Long): BOOL =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoIsOle1Class(rclsid)

public actual fun CoLoadLibrary(lpszlibname: PCWSTR, bautofree: BOOL): HINSTANCE =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoLoadLibrary(lpszlibname, bautofree)

public actual fun CoLockObjectExternal(punk: Long, flock: BOOL, flastunlockreleases: BOOL): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoLockObjectExternal(punk, flock, flastunlockreleases)

public actual fun CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoQueryAuthenticationServices(pcauthsvc, asauthsvc)

public actual fun CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoQueryClientBlanket(pauthnsvc, pauthzsvc, pserverprincname, pauthnlevel, pimplevel, pprivs, pcapabilities)

public actual fun CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoQueryProxyBlanket(pproxy, pwauthnsvc, pauthzsvc, pserverprincname, pauthnlevel, pimplevel, pauthinfo, pcapabilites)

public actual fun CoRegisterActivationFilter(pactivationfilter: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterActivationFilter(pactivationfilter)

public actual fun CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterChannelHook(extensionuuid, pchannelhook)

public actual fun CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: CLSCTX, flags: UInt, lpdwregister: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterClassObject(rclsid, punk, dwclscontext.toInt(), flags.toInt(), lpdwregister)

public actual fun CoRegisterDeviceCatalog(deviceinstanceid: PCWSTR, cookie: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterDeviceCatalog(deviceinstanceid, cookie)

public actual fun CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterInitializeSpy(pspy, pulicookie)

public actual fun CoRegisterMallocSpy(pmallocspy: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterMallocSpy(pmallocspy)

public actual fun CoRegisterPSClsid(riid: Long, rclsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterPSClsid(riid, rclsid)

public actual fun CoRegisterSurrogate(psurrogate: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRegisterSurrogate(psurrogate)

public actual fun CoReleaseServerProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoReleaseServerProcess().toUInt()

public actual fun CoResumeClassObjects(): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoResumeClassObjects()

public actual fun CoRevertToSelf(): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRevertToSelf()

public actual fun CoRevokeClassObject(dwregister: UInt): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRevokeClassObject(dwregister.toInt())

public actual fun CoRevokeDeviceCatalog(cookie: CO_DEVICE_CATALOG_COOKIE): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRevokeDeviceCatalog(cookie)

public actual fun CoRevokeInitializeSpy(ulicookie: ULong): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRevokeInitializeSpy(ulicookie.toLong())

public actual fun CoRevokeMallocSpy(): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoRevokeMallocSpy()

public actual fun CoSetCancelObject(punk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoSetCancelObject(punk)

public actual fun CoSetProxyBlanket(pproxy: Long, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: PCWSTR, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthinfo: Long, dwcapabilities: UInt): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoSetProxyBlanket(pproxy, dwauthnsvc.toInt(), dwauthzsvc.toInt(), pserverprincname, dwauthnlevel.toInt(), dwimplevel.toInt(), pauthinfo, dwcapabilities.toInt())

public actual fun CoSuspendClassObjects(): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoSuspendClassObjects()

public actual fun CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoSwitchCallContext(pnewobject, ppoldobject)

public actual fun CoTaskMemAlloc(cb: ULong): Long =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoTaskMemAlloc(cb.toLong())

public actual fun CoTaskMemFree(pv: Long) {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoTaskMemFree(pv)
}

public actual fun CoTaskMemRealloc(pv: Long, cb: ULong): Long =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoTaskMemRealloc(pv, cb.toLong())

public actual fun CoTestCancel(): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoTestCancel()

public actual fun CoTreatAsClass(clsidold: Long, clsidnew: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoTreatAsClass(clsidold, clsidnew)

public actual fun CoUninitialize() {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoUninitialize()
}

public actual fun CoWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles, lpdwindex)

public actual fun CoWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CoWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles, lpdwindex)

public actual fun CreateAntiMoniker(ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateAntiMoniker(ppmk)

public actual fun CreateBindCtx(reserved: UInt, ppbc: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateBindCtx(reserved.toInt(), ppbc)

public actual fun CreateClassMoniker(rclsid: Long, ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateClassMoniker(rclsid, ppmk)

public actual fun CreateDataAdviseHolder(ppdaholder: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateDataAdviseHolder(ppdaholder)

public actual fun CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateDataCache(punkouter, rclsid, iid, ppv)

public actual fun CreateFileMoniker(lpszpathname: PCWSTR, ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateFileMoniker(lpszpathname, ppmk)

public actual fun CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateGenericComposite(pmkfirst, pmkrest, ppmkcomposite)

public actual fun CreateIUriBuilder(piuri: Long, dwflags: UInt, dwreserved: ULong, ppiuribuilder: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateIUriBuilder(piuri, dwflags.toInt(), dwreserved.toLong(), ppiuribuilder)

public actual fun CreateItemMoniker(lpszdelim: PCWSTR, lpszitem: PCWSTR, ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateItemMoniker(lpszdelim, lpszitem, ppmk)

public actual fun CreateObjrefMoniker(punk: Long, ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateObjrefMoniker(punk, ppmk)

public actual fun CreatePointerMoniker(punk: Long, ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreatePointerMoniker(punk, ppmk)

public actual fun CreateStdProgressIndicator(hwndparent: HWND, psztitle: PCWSTR, pibsccaller: Long, ppibsc: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateStdProgressIndicator(hwndparent, psztitle, pibsccaller, ppibsc)

public actual fun CreateUri(pwzuri: PCWSTR, dwflags: URI_CREATE_FLAGS, dwreserved: ULong, ppuri: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateUri(pwzuri, dwflags.toInt(), dwreserved.toLong(), ppuri)

public actual fun CreateUriFromMultiByteString(pszansiinputuri: PCSTR, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateUriFromMultiByteString(pszansiinputuri, dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toLong(), ppuri)

public actual fun CreateUriWithFragment(pwzuri: PCWSTR, pwzfragment: PCWSTR, dwflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_CreateUriWithFragment(pwzuri, pwzfragment, dwflags.toInt(), dwreserved.toLong(), ppuri)

public actual fun DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: HRESULT): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_DcomChannelSetHResult(pvreserved, pulreserved, appshr)

public actual fun GetClassFile(szfilename: PCWSTR, pclsid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_GetClassFile(szfilename, pclsid)

public actual fun GetErrorInfo(dwreserved: UInt, pperrinfo: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_GetErrorInfo(dwreserved.toInt(), pperrinfo)

public actual fun GetRunningObjectTable(reserved: UInt, pprot: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_GetRunningObjectTable(reserved.toInt(), pprot)

public actual fun IIDFromString(lpsz: PCWSTR, lpiid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_IIDFromString(lpsz, lpiid)

public actual fun MkParseDisplayName(pbc: Long, szusername: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_MkParseDisplayName(pbc, szusername, pcheaten, ppmk)

public actual fun MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_MonikerCommonPrefixWith(pmkthis, pmkother, ppmkcommon)

public actual fun MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: BOOL): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_MonikerRelativePathTo(pmksrc, pmkdest, ppmkrelpath, dwreserved)

public actual fun ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_ProgIDFromCLSID(clsid, lplpszprogid)

public actual fun SetErrorInfo(dwreserved: UInt, perrinfo: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_SetErrorInfo(dwreserved.toInt(), perrinfo)

public actual fun StringFromCLSID(rclsid: Long, lplpsz: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_StringFromCLSID(rclsid, lplpsz)

public actual fun StringFromGUID2(rguid: Long, lpsz: PWSTR, cchmax: Int): Int =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_StringFromGUID2(rguid, lpsz, cchmax)

public actual fun StringFromIID(rclsid: Long, lplpsz: Long): HRESULT =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_StringFromIID(rclsid, lplpsz)
