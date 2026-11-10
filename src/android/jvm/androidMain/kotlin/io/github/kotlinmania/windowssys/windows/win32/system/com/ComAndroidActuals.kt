@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemComJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_com_bindMoniker(pmk: Long, grfopt: Int, iidresult: Long, ppvresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_cLSIDFromProgID(lpszprogid: Long, lpclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_cLSIDFromProgIDEx(lpszprogid: Long, lpclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_cLSIDFromString(lpsz: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coAddRefServerProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coAllowSetForegroundWindow(punk: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID(clsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coBuildVersion(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCancelCall(dwthreadid: Int, ultimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCopyProxy(pproxy: Long, ppcopy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCreateGuid(pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: Int, pserverinfo: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: Int, reserved: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coDecrementMTAUsage(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coDisableCallCancellation(preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coDisconnectContext(dwtimeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coDisconnectObject(punk: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coDosDateTimeToFileTime(ndosdate: Short, ndostime: Short, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coEnableCallCancellation(preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coFileTimeNow(lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coFreeAllLibraries()

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coFreeLibrary(hinst: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coFreeUnusedLibraries()

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(dwunloaddelay: Int, dwreserved: Int)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetApartmentType(papttype: Long, paptqualifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetCallContext(riid: Long, ppinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetCallerTID(lpdwtid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetCancelObject(dwthreadid: Int, iid: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetClassObject(rclsid: Long, dwclscontext: Int, pvreserved: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetContextToken(ptoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId(pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetCurrentProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetMalloc(dwmemcontext: Int, ppmalloc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetObject(pszname: Long, pbindoptions: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetObjectContext(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetPSClsid(riid: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(comsdtype: Int, ppsd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coGetTreatAsClass(clsidold: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coImpersonateClient(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coIncrementMTAUsage(pcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coInitialize(pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coInitializeEx(pvreserved: Long, dwcoinit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coInitializeSecurity(psecdesc: Long, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: Int, dwimplevel: Int, pauthlist: Long, dwcapabilities: Int, preserved3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coInstall(pbc: Long, dwflags: Int, pclassspec: Long, pquery: Long, pszcodebase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings(pszmachinename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coIsHandlerConnected(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coIsOle1Class(rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coLoadLibrary(lpszlibname: Long, bautofree: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coLockObjectExternal(punk: Long, flock: Int, flastunlockreleases: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterActivationFilter(pactivationfilter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: Int, flags: Int, lpdwregister: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterDeviceCatalog(deviceinstanceid: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterInitializeSpy(pspy: Long, pulicookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterMallocSpy(pmallocspy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterPSClsid(riid: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRegisterSurrogate(psurrogate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coReleaseServerProcess(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coResumeClassObjects(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRevertToSelf(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRevokeClassObject(dwregister: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRevokeDeviceCatalog(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRevokeInitializeSpy(ulicookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coRevokeMallocSpy(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coSetCancelObject(punk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coSetProxyBlanket(pproxy: Long, dwauthnsvc: Int, dwauthzsvc: Int, pserverprincname: Long, dwauthnlevel: Int, dwimplevel: Int, pauthinfo: Long, dwcapabilities: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coSuspendClassObjects(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coSwitchCallContext(pnewobject: Long, ppoldobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coTaskMemAlloc(cb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coTaskMemFree(pv: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coTaskMemRealloc(pv: Long, cb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coTestCancel(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coTreatAsClass(clsidold: Long, clsidnew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coUninitialize()

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coWaitForMultipleHandles(dwflags: Int, dwtimeout: Int, chandles: Int, phandles: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_coWaitForMultipleObjects(dwflags: Int, dwtimeout: Int, chandles: Int, phandles: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createAntiMoniker(ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createBindCtx(reserved: Int, ppbc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createClassMoniker(rclsid: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createDataAdviseHolder(ppdaholder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createFileMoniker(lpszpathname: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createIUriBuilder(piuri: Long, dwflags: Int, dwreserved: Long, ppiuribuilder: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createItemMoniker(lpszdelim: Long, lpszitem: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createObjrefMoniker(punk: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createPointerMoniker(punk: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createStdProgressIndicator(hwndparent: Long, psztitle: Long, pibsccaller: Long, ppibsc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createUri(pwzuri: Long, dwflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createUriFromMultiByteString(pszansiinputuri: Long, dwencodingflags: Int, dwcodepage: Int, dwcreateflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_createUriWithFragment(pwzuri: Long, pwzfragment: Long, dwflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_dcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_getClassFile(szfilename: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_getErrorInfo(dwreserved: Int, pperrinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_getRunningObjectTable(reserved: Int, pprot: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_iIDFromString(lpsz: Long, lpiid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_mkParseDisplayName(pbc: Long, szusername: Long, pcheaten: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_monikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_monikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_progIDFromCLSID(clsid: Long, lplpszprogid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_setErrorInfo(dwreserved: Int, perrinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_stringFromCLSID(rclsid: Long, lplpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_stringFromGUID2(rguid: Long, lpsz: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_com_stringFromIID(rclsid: Long, lplpsz: Long): Int
}

public actual fun bindMoniker(pmk: COpaquePointer?, grfopt: UInt, iidresult: COpaquePointer?, ppvresult: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_bindMoniker((pmk?.value ?: 0L), grfopt.toInt(), (iidresult?.value ?: 0L), (ppvresult?.value ?: 0L))

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_cLSIDFromProgID((lpszprogid?.value ?: 0L), (lpclsid?.value ?: 0L))

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_cLSIDFromProgIDEx((lpszprogid?.value ?: 0L), (lpclsid?.value ?: 0L))

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_cLSIDFromString((lpsz?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun coAddRefServerProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coAddRefServerProcess().toUInt()

public actual fun coAllowSetForegroundWindow(punk: COpaquePointer?, lpvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coAllowSetForegroundWindow((punk?.value ?: 0L), (lpvreserved?.value ?: 0L))

public actual fun coAllowUnmarshalerCLSID(clsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID((clsid?.value ?: 0L))

public actual fun coBuildVersion(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coBuildVersion().toUInt()

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCancelCall(dwthreadid.toInt(), ultimeout.toInt())

public actual fun coCopyProxy(pproxy: COpaquePointer?, ppcopy: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCopyProxy((pproxy?.value ?: 0L), (ppcopy?.value ?: 0L))

public actual fun coCreateFreeThreadedMarshaler(punkouter: COpaquePointer?, ppunkmarshal: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler((punkouter?.value ?: 0L), (ppunkmarshal?.value ?: 0L))

public actual fun coCreateGuid(pguid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCreateGuid((pguid?.value ?: 0L))

public actual fun coCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclscontext: Clsctx, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCreateInstance((rclsid?.value ?: 0L), (punkouter?.value ?: 0L), dwclscontext.toInt(), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun coCreateInstanceEx(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pserverinfo: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCreateInstanceEx((clsid?.value ?: 0L), (punkouter?.value ?: 0L), dwclsctx.toInt(), (pserverinfo?.value ?: 0L), dwcount.toInt(), (presults?.value ?: 0L))

public actual fun coCreateInstanceFromApp(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, reserved: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coCreateInstanceFromApp((clsid?.value ?: 0L), (punkouter?.value ?: 0L), dwclsctx.toInt(), (reserved?.value ?: 0L), dwcount.toInt(), (presults?.value ?: 0L))

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coDecrementMTAUsage((cookie?.value ?: 0L))

public actual fun coDisableCallCancellation(preserved: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coDisableCallCancellation((preserved?.value ?: 0L))

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coDisconnectContext(dwtimeout.toInt())

public actual fun coDisconnectObject(punk: COpaquePointer?, dwreserved: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coDisconnectObject((punk?.value ?: 0L), dwreserved.toInt())

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: COpaquePointer?): Bool =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coDosDateTimeToFileTime(ndosdate.toShort(), ndostime.toShort(), (lpfiletime?.value ?: 0L))

public actual fun coEnableCallCancellation(preserved: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coEnableCallCancellation((preserved?.value ?: 0L))

public actual fun coFileTimeNow(lpfiletime: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coFileTimeNow((lpfiletime?.value ?: 0L))

public actual fun coFileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpdosdate: COpaquePointer?, lpdostime: COpaquePointer?): Bool =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coFileTimeToDosDateTime((lpfiletime?.value ?: 0L), (lpdosdate?.value ?: 0L), (lpdostime?.value ?: 0L))

public actual fun coFreeAllLibraries() {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coFreeAllLibraries()
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coFreeLibrary((hinst?.value ?: 0L))
}

public actual fun coFreeUnusedLibraries() {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coFreeUnusedLibraries()
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
}

public actual fun coGetApartmentType(papttype: COpaquePointer?, paptqualifier: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetApartmentType((papttype?.value ?: 0L), (paptqualifier?.value ?: 0L))

public actual fun coGetCallContext(riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetCallContext((riid?.value ?: 0L), (ppinterface?.value ?: 0L))

public actual fun coGetCallerTID(lpdwtid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetCallerTID((lpdwtid?.value ?: 0L))

public actual fun coGetCancelObject(dwthreadid: UInt, iid: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetCancelObject(dwthreadid.toInt(), (iid?.value ?: 0L), (ppunk?.value ?: 0L))

public actual fun coGetClassObject(rclsid: COpaquePointer?, dwclscontext: UInt, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetClassObject((rclsid?.value ?: 0L), dwclscontext.toInt(), (pvreserved?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun coGetContextToken(ptoken: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetContextToken((ptoken?.value ?: 0L))

public actual fun coGetCurrentLogicalThreadId(pguid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId((pguid?.value ?: 0L))

public actual fun coGetCurrentProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetCurrentProcess().toUInt()

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetMalloc(dwmemcontext.toInt(), (ppmalloc?.value ?: 0L))

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetObject((pszname?.value ?: 0L), (pbindoptions?.value ?: 0L), (riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun coGetObjectContext(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetObjectContext((riid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun coGetPSClsid(riid: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetPSClsid((riid?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(comsdtype, (ppsd?.value ?: 0L))

public actual fun coGetTreatAsClass(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coGetTreatAsClass((clsidold?.value ?: 0L), (pclsidnew?.value ?: 0L))

public actual fun coImpersonateClient(): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coImpersonateClient()

public actual fun coIncrementMTAUsage(pcookie: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coIncrementMTAUsage((pcookie?.value ?: 0L))

public actual fun coInitialize(pvreserved: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coInitialize((pvreserved?.value ?: 0L))

public actual fun coInitializeEx(pvreserved: COpaquePointer?, dwcoinit: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coInitializeEx((pvreserved?.value ?: 0L), dwcoinit.toInt())

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: COpaquePointer?, preserved1: COpaquePointer?, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: COpaquePointer?, dwcapabilities: UInt, preserved3: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coInitializeSecurity((psecdesc?.value ?: 0L), cauthsvc, (asauthsvc?.value ?: 0L), (preserved1?.value ?: 0L), dwauthnlevel.toInt(), dwimplevel.toInt(), (pauthlist?.value ?: 0L), dwcapabilities.toInt(), (preserved3?.value ?: 0L))

public actual fun coInstall(pbc: COpaquePointer?, dwflags: UInt, pclassspec: COpaquePointer?, pquery: COpaquePointer?, pszcodebase: Pcwstr): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coInstall((pbc?.value ?: 0L), dwflags.toInt(), (pclassspec?.value ?: 0L), (pquery?.value ?: 0L), (pszcodebase?.value ?: 0L))

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings((pszmachinename?.value ?: 0L))

public actual fun coIsHandlerConnected(punk: COpaquePointer?): Bool =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coIsHandlerConnected((punk?.value ?: 0L))

public actual fun coIsOle1Class(rclsid: COpaquePointer?): Bool =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coIsOle1Class((rclsid?.value ?: 0L))

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coLoadLibrary((lpszlibname?.value ?: 0L), bautofree).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun coLockObjectExternal(punk: COpaquePointer?, flock: Bool, flastunlockreleases: Bool): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coLockObjectExternal((punk?.value ?: 0L), flock, flastunlockreleases)

public actual fun coQueryAuthenticationServices(pcauthsvc: COpaquePointer?, asauthsvc: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coQueryAuthenticationServices((pcauthsvc?.value ?: 0L), (asauthsvc?.value ?: 0L))

public actual fun coQueryClientBlanket(pauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pprivs: COpaquePointer?, pcapabilities: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coQueryClientBlanket((pauthnsvc?.value ?: 0L), (pauthzsvc?.value ?: 0L), (pserverprincname?.value ?: 0L), (pauthnlevel?.value ?: 0L), (pimplevel?.value ?: 0L), (pprivs?.value ?: 0L), (pcapabilities?.value ?: 0L))

public actual fun coQueryProxyBlanket(pproxy: COpaquePointer?, pwauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pauthinfo: COpaquePointer?, pcapabilites: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coQueryProxyBlanket((pproxy?.value ?: 0L), (pwauthnsvc?.value ?: 0L), (pauthzsvc?.value ?: 0L), (pserverprincname?.value ?: 0L), (pauthnlevel?.value ?: 0L), (pimplevel?.value ?: 0L), (pauthinfo?.value ?: 0L), (pcapabilites?.value ?: 0L))

public actual fun coRegisterActivationFilter(pactivationfilter: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterActivationFilter((pactivationfilter?.value ?: 0L))

public actual fun coRegisterChannelHook(extensionuuid: COpaquePointer?, pchannelhook: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterChannelHook((extensionuuid?.value ?: 0L), (pchannelhook?.value ?: 0L))

public actual fun coRegisterClassObject(rclsid: COpaquePointer?, punk: COpaquePointer?, dwclscontext: Clsctx, flags: UInt, lpdwregister: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterClassObject((rclsid?.value ?: 0L), (punk?.value ?: 0L), dwclscontext.toInt(), flags.toInt(), (lpdwregister?.value ?: 0L))

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterDeviceCatalog((deviceinstanceid?.value ?: 0L), (cookie?.value ?: 0L))

public actual fun coRegisterInitializeSpy(pspy: COpaquePointer?, pulicookie: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterInitializeSpy((pspy?.value ?: 0L), (pulicookie?.value ?: 0L))

public actual fun coRegisterMallocSpy(pmallocspy: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterMallocSpy((pmallocspy?.value ?: 0L))

public actual fun coRegisterPSClsid(riid: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterPSClsid((riid?.value ?: 0L), (rclsid?.value ?: 0L))

public actual fun coRegisterSurrogate(psurrogate: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRegisterSurrogate((psurrogate?.value ?: 0L))

public actual fun coReleaseServerProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coReleaseServerProcess().toUInt()

public actual fun coResumeClassObjects(): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coResumeClassObjects()

public actual fun coRevertToSelf(): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRevertToSelf()

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRevokeClassObject(dwregister.toInt())

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRevokeDeviceCatalog((cookie?.value ?: 0L))

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRevokeInitializeSpy(ulicookie.toLong())

public actual fun coRevokeMallocSpy(): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coRevokeMallocSpy()

public actual fun coSetCancelObject(punk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coSetCancelObject((punk?.value ?: 0L))

public actual fun coSetProxyBlanket(pproxy: COpaquePointer?, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: COpaquePointer?, dwcapabilities: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coSetProxyBlanket((pproxy?.value ?: 0L), dwauthnsvc.toInt(), dwauthzsvc.toInt(), (pserverprincname?.value ?: 0L), dwauthnlevel.toInt(), dwimplevel.toInt(), (pauthinfo?.value ?: 0L), dwcapabilities.toInt())

public actual fun coSuspendClassObjects(): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coSuspendClassObjects()

public actual fun coSwitchCallContext(pnewobject: COpaquePointer?, ppoldobject: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coSwitchCallContext((pnewobject?.value ?: 0L), (ppoldobject?.value ?: 0L))

public actual fun coTaskMemAlloc(cb: ULong): COpaquePointer? =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coTaskMemAlloc(cb.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun coTaskMemFree(pv: COpaquePointer?) {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coTaskMemFree((pv?.value ?: 0L))
}

public actual fun coTaskMemRealloc(pv: COpaquePointer?, cb: ULong): COpaquePointer? =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coTaskMemRealloc((pv?.value ?: 0L), cb.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun coTestCancel(): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coTestCancel()

public actual fun coTreatAsClass(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coTreatAsClass((clsidold?.value ?: 0L), (clsidnew?.value ?: 0L))

public actual fun coUninitialize() {
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coUninitialize()
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), (phandles?.value ?: 0L), (lpdwindex?.value ?: 0L))

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_coWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), (phandles?.value ?: 0L), (lpdwindex?.value ?: 0L))

public actual fun createAntiMoniker(ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createAntiMoniker((ppmk?.value ?: 0L))

public actual fun createBindCtx(reserved: UInt, ppbc: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createBindCtx(reserved.toInt(), (ppbc?.value ?: 0L))

public actual fun createClassMoniker(rclsid: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createClassMoniker((rclsid?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun createDataAdviseHolder(ppdaholder: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createDataAdviseHolder((ppdaholder?.value ?: 0L))

public actual fun createDataCache(punkouter: COpaquePointer?, rclsid: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createDataCache((punkouter?.value ?: 0L), (rclsid?.value ?: 0L), (iid?.value ?: 0L), (ppv?.value ?: 0L))

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createFileMoniker((lpszpathname?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun createGenericComposite(pmkfirst: COpaquePointer?, pmkrest: COpaquePointer?, ppmkcomposite: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createGenericComposite((pmkfirst?.value ?: 0L), (pmkrest?.value ?: 0L), (ppmkcomposite?.value ?: 0L))

public actual fun createIUriBuilder(piuri: COpaquePointer?, dwflags: UInt, dwreserved: ULong, ppiuribuilder: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createIUriBuilder((piuri?.value ?: 0L), dwflags.toInt(), dwreserved.toLong(), (ppiuribuilder?.value ?: 0L))

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createItemMoniker((lpszdelim?.value ?: 0L), (lpszitem?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun createObjrefMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createObjrefMoniker((punk?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun createPointerMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createPointerMoniker((punk?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: COpaquePointer?, ppibsc: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createStdProgressIndicator((hwndparent?.value ?: 0L), (psztitle?.value ?: 0L), (pibsccaller?.value ?: 0L), (ppibsc?.value ?: 0L))

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createUri((pwzuri?.value ?: 0L), dwflags.toInt(), dwreserved.toLong(), (ppuri?.value ?: 0L))

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createUriFromMultiByteString((pszansiinputuri?.value ?: 0L), dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toLong(), (ppuri?.value ?: 0L))

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_createUriWithFragment((pwzuri?.value ?: 0L), (pwzfragment?.value ?: 0L), dwflags.toInt(), dwreserved.toLong(), (ppuri?.value ?: 0L))

public actual fun dcomChannelSetHResult(pvreserved: COpaquePointer?, pulreserved: COpaquePointer?, appshr: Hresult): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_dcomChannelSetHResult((pvreserved?.value ?: 0L), (pulreserved?.value ?: 0L), appshr)

public actual fun getClassFile(szfilename: Pcwstr, pclsid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_getClassFile((szfilename?.value ?: 0L), (pclsid?.value ?: 0L))

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_getErrorInfo(dwreserved.toInt(), (pperrinfo?.value ?: 0L))

public actual fun getRunningObjectTable(reserved: UInt, pprot: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_getRunningObjectTable(reserved.toInt(), (pprot?.value ?: 0L))

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_iIDFromString((lpsz?.value ?: 0L), (lpiid?.value ?: 0L))

public actual fun mkParseDisplayName(pbc: COpaquePointer?, szusername: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_mkParseDisplayName((pbc?.value ?: 0L), (szusername?.value ?: 0L), (pcheaten?.value ?: 0L), (ppmk?.value ?: 0L))

public actual fun monikerCommonPrefixWith(pmkthis: COpaquePointer?, pmkother: COpaquePointer?, ppmkcommon: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_monikerCommonPrefixWith((pmkthis?.value ?: 0L), (pmkother?.value ?: 0L), (ppmkcommon?.value ?: 0L))

public actual fun monikerRelativePathTo(pmksrc: COpaquePointer?, pmkdest: COpaquePointer?, ppmkrelpath: COpaquePointer?, dwreserved: Bool): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_monikerRelativePathTo((pmksrc?.value ?: 0L), (pmkdest?.value ?: 0L), (ppmkrelpath?.value ?: 0L), dwreserved)

public actual fun progIDFromCLSID(clsid: COpaquePointer?, lplpszprogid: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_progIDFromCLSID((clsid?.value ?: 0L), (lplpszprogid?.value ?: 0L))

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_setErrorInfo(dwreserved.toInt(), (perrinfo?.value ?: 0L))

public actual fun stringFromCLSID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_stringFromCLSID((rclsid?.value ?: 0L), (lplpsz?.value ?: 0L))

public actual fun stringFromGUID2(rguid: COpaquePointer?, lpsz: Pwstr, cchmax: Int): Int =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_stringFromGUID2((rguid?.value ?: 0L), (lpsz?.value ?: 0L), cchmax)

public actual fun stringFromIID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult =
    WindowsWin32SystemComJniBridge.windowssys_windows_win32_system_com_stringFromIID((rclsid?.value ?: 0L), (lplpsz?.value ?: 0L))
