@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemComJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemComBindMoniker(pmk: Long, grfopt: Int, iidresult: Long, ppvresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCLSIDFromProgID(lpszprogid: Long, lpclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCLSIDFromProgIDEx(lpszprogid: Long, lpclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCLSIDFromString(lpsz: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoAddRefServerProcess(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(clsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoBuildVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCancelCall(dwthreadid: Int, ultimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCopyProxy(pproxy: Long, ppcopy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCreateGuid(pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: Int, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: Int, pserverinfo: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: Int, reserved: Long, dwcount: Int, presults: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoDecrementMTAUsage(cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoDisableCallCancellation(preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoDisconnectObject(punk: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoDosDateTimeToFileTime(ndosdate: Short, ndostime: Short, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoEnableCallCancellation(preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoFileTimeNow(lpfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoFreeAllLibraries()

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoFreeLibrary(hinst: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoFreeUnusedLibraries()

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay: Int, dwreserved: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetApartmentType(papttype: Long, paptqualifier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetCallContext(riid: Long, ppinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetCallerTID(lpdwtid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetCancelObject(dwthreadid: Int, iid: Long, ppunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetClassObject(rclsid: Long, dwclscontext: Int, pvreserved: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetContextToken(ptoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetCurrentProcess(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetMalloc(dwmemcontext: Int, ppmalloc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetObject(pszname: Long, pbindoptions: Long, riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetObjectContext(riid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetPSClsid(riid: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(comsdtype: Int, ppsd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoGetTreatAsClass(clsidold: Long, pclsidnew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoImpersonateClient(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoIncrementMTAUsage(pcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoInitialize(pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoInitializeEx(pvreserved: Long, dwcoinit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoInitializeSecurity(psecdesc: Long, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: Int, dwimplevel: Int, pauthlist: Long, dwcapabilities: Int, preserved3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoInstall(pbc: Long, dwflags: Int, pclassspec: Long, pquery: Long, pszcodebase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(pszmachinename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoIsHandlerConnected(punk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoIsOle1Class(rclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoLoadLibrary(lpszlibname: Long, bautofree: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoLockObjectExternal(punk: Long, flock: Int, flastunlockreleases: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterActivationFilter(pactivationfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: Int, flags: Int, lpdwregister: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterDeviceCatalog(deviceinstanceid: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterInitializeSpy(pspy: Long, pulicookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterMallocSpy(pmallocspy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterPSClsid(riid: Long, rclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRegisterSurrogate(psurrogate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoReleaseServerProcess(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoResumeClassObjects(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRevertToSelf(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRevokeClassObject(dwregister: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRevokeDeviceCatalog(cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoRevokeMallocSpy(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoSetCancelObject(punk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoSetProxyBlanket(pproxy: Long, dwauthnsvc: Int, dwauthzsvc: Int, pserverprincname: Long, dwauthnlevel: Int, dwimplevel: Int, pauthinfo: Long, dwcapabilities: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoSuspendClassObjects(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoSwitchCallContext(pnewobject: Long, ppoldobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoTaskMemAlloc(cb: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoTaskMemFree(pv: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoTaskMemRealloc(pv: Long, cb: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoTestCancel(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoTreatAsClass(clsidold: Long, clsidnew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoUninitialize()

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoWaitForMultipleHandles(dwflags: Int, dwtimeout: Int, chandles: Int, phandles: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCoWaitForMultipleObjects(dwflags: Int, dwtimeout: Int, chandles: Int, phandles: Long, lpdwindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateAntiMoniker(ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateBindCtx(reserved: Int, ppbc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateClassMoniker(rclsid: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateDataAdviseHolder(ppdaholder: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateFileMoniker(lpszpathname: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateIUriBuilder(piuri: Long, dwflags: Int, dwreserved: Long, ppiuribuilder: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateItemMoniker(lpszdelim: Long, lpszitem: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateObjrefMoniker(punk: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreatePointerMoniker(punk: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateStdProgressIndicator(hwndparent: Long, psztitle: Long, pibsccaller: Long, ppibsc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateUri(pwzuri: Long, dwflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateUriFromMultiByteString(pszansiinputuri: Long, dwencodingflags: Int, dwcodepage: Int, dwcreateflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComCreateUriWithFragment(pwzuri: Long, pwzfragment: Long, dwflags: Int, dwreserved: Long, ppuri: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComDcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComGetClassFile(szfilename: Long, pclsid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComGetErrorInfo(dwreserved: Int, pperrinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComGetRunningObjectTable(reserved: Int, pprot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComIIDFromString(lpsz: Long, lpiid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMkParseDisplayName(pbc: Long, szusername: Long, pcheaten: Long, ppmk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComMonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComProgIDFromCLSID(clsid: Long, lplpszprogid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComSetErrorInfo(dwreserved: Int, perrinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStringFromCLSID(rclsid: Long, lplpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStringFromGUID2(rguid: Long, lpsz: Long, cchmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemComStringFromIID(rclsid: Long, lplpsz: Long): Int
}

public actual fun bindMoniker(pmk: MutPtr<CVoid>, grfopt: UInt, iidresult: ConstPtr<Guid>, ppvresult: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComBindMoniker(pmk.rawAddress, grfopt.toInt(), iidresult.rawAddress, ppvresult.rawAddress)

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCLSIDFromProgID(lpszprogid.rawAddress, lpclsid.rawAddress)

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCLSIDFromProgIDEx(lpszprogid.rawAddress, lpclsid.rawAddress)

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCLSIDFromString(lpsz.rawAddress, pclsid.rawAddress)

public actual fun coAddRefServerProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoAddRefServerProcess().toUInt()

public actual fun coAllowSetForegroundWindow(punk: MutPtr<CVoid>, lpvreserved: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoAllowSetForegroundWindow(punk.rawAddress, lpvreserved.rawAddress)

public actual fun coAllowUnmarshalerCLSID(clsid: ConstPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(clsid.rawAddress)

public actual fun coBuildVersion(): UInt =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoBuildVersion().toUInt()

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCancelCall(dwthreadid.toInt(), ultimeout.toInt())

public actual fun coCopyProxy(pproxy: MutPtr<CVoid>, ppcopy: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCopyProxy(pproxy.rawAddress, ppcopy.rawAddress)

public actual fun coCreateFreeThreadedMarshaler(punkouter: MutPtr<CVoid>, ppunkmarshal: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(punkouter.rawAddress, ppunkmarshal.rawAddress)

public actual fun coCreateGuid(pguid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCreateGuid(pguid.rawAddress)

public actual fun coCreateInstance(rclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclscontext: Clsctx, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCreateInstance(rclsid.rawAddress, punkouter.rawAddress, dwclscontext.toInt(), riid.rawAddress, ppv.rawAddress)

public actual fun coCreateInstanceEx(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, pserverinfo: ConstPtr<Coserverinfo>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCreateInstanceEx(clsid.rawAddress, punkouter.rawAddress, dwclsctx.toInt(), pserverinfo.rawAddress, dwcount.toInt(), presults.rawAddress)

public actual fun coCreateInstanceFromApp(clsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, dwclsctx: Clsctx, reserved: ConstPtr<CVoid>, dwcount: UInt, presults: MutPtr<MultiQi>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoCreateInstanceFromApp(clsid.rawAddress, punkouter.rawAddress, dwclsctx.toInt(), reserved.rawAddress, dwcount.toInt(), presults.rawAddress)

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoDecrementMTAUsage(cookie.rawAddress)

public actual fun coDisableCallCancellation(preserved: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoDisableCallCancellation(preserved.rawAddress)

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout.toInt())

public actual fun coDisconnectObject(punk: MutPtr<CVoid>, dwreserved: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoDisconnectObject(punk.rawAddress, dwreserved.toInt())

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr<Filetime>): Bool =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoDosDateTimeToFileTime(ndosdate.toShort(), ndostime.toShort(), lpfiletime.rawAddress)

public actual fun coEnableCallCancellation(preserved: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoEnableCallCancellation(preserved.rawAddress)

public actual fun coFileTimeNow(lpfiletime: MutPtr<Filetime>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoFileTimeNow(lpfiletime.rawAddress)

public actual fun coFileTimeToDosDateTime(lpfiletime: ConstPtr<Filetime>, lpdosdate: MutPtr<UShort>, lpdostime: MutPtr<UShort>): Bool =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoFileTimeToDosDateTime(lpfiletime.rawAddress, lpdosdate.rawAddress, lpdostime.rawAddress)

public actual fun coFreeAllLibraries() {
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoFreeAllLibraries()
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoFreeLibrary(hinst.rawAddress)
}

public actual fun coFreeUnusedLibraries() {
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoFreeUnusedLibraries()
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
}

public actual fun coGetApartmentType(papttype: MutPtr<Apttype>, paptqualifier: MutPtr<Apttypequalifier>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetApartmentType(papttype.rawAddress, paptqualifier.rawAddress)

public actual fun coGetCallContext(riid: ConstPtr<Guid>, ppinterface: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetCallContext(riid.rawAddress, ppinterface.rawAddress)

public actual fun coGetCallerTID(lpdwtid: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetCallerTID(lpdwtid.rawAddress)

public actual fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr<Guid>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetCancelObject(dwthreadid.toInt(), iid.rawAddress, ppunk.rawAddress)

public actual fun coGetClassObject(rclsid: ConstPtr<Guid>, dwclscontext: UInt, pvreserved: ConstPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetClassObject(rclsid.rawAddress, dwclscontext.toInt(), pvreserved.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun coGetContextToken(ptoken: MutPtr<ULong>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetContextToken(ptoken.rawAddress)

public actual fun coGetCurrentLogicalThreadId(pguid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(pguid.rawAddress)

public actual fun coGetCurrentProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetCurrentProcess().toUInt()

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetMalloc(dwmemcontext.toInt(), ppmalloc.rawAddress)

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr<BindOpts>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetObject(pszname.rawAddress, pbindoptions.rawAddress, riid.rawAddress, ppv.rawAddress)

public actual fun coGetObjectContext(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetObjectContext(riid.rawAddress, ppv.rawAddress)

public actual fun coGetPSClsid(riid: ConstPtr<Guid>, pclsid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetPSClsid(riid.rawAddress, pclsid.rawAddress)

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr<PsecurityDescriptor>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(comsdtype, ppsd.rawAddress)

public actual fun coGetTreatAsClass(clsidold: ConstPtr<Guid>, pclsidnew: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoGetTreatAsClass(clsidold.rawAddress, pclsidnew.rawAddress)

public actual fun coImpersonateClient(): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoImpersonateClient()

public actual fun coIncrementMTAUsage(pcookie: MutPtr<CoMtaUsageCookie>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoIncrementMTAUsage(pcookie.rawAddress)

public actual fun coInitialize(pvreserved: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoInitialize(pvreserved.rawAddress)

public actual fun coInitializeEx(pvreserved: ConstPtr<CVoid>, dwcoinit: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoInitializeEx(pvreserved.rawAddress, dwcoinit.toInt())

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr<SoleAuthenticationService>, preserved1: ConstPtr<CVoid>, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr<CVoid>, dwcapabilities: UInt, preserved3: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoInitializeSecurity(psecdesc.rawAddress, cauthsvc, asauthsvc.rawAddress, preserved1.rawAddress, dwauthnlevel.toInt(), dwimplevel.toInt(), pauthlist.rawAddress, dwcapabilities.toInt(), preserved3.rawAddress)

public actual fun coInstall(pbc: MutPtr<CVoid>, dwflags: UInt, pclassspec: ConstPtr<UClsspec>, pquery: ConstPtr<Querycontext>, pszcodebase: Pcwstr): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoInstall(pbc.rawAddress, dwflags.toInt(), pclassspec.rawAddress, pquery.rawAddress, pszcodebase.rawAddress)

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(pszmachinename.rawAddress)

public actual fun coIsHandlerConnected(punk: MutPtr<CVoid>): Bool =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoIsHandlerConnected(punk.rawAddress)

public actual fun coIsOle1Class(rclsid: ConstPtr<Guid>): Bool =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoIsOle1Class(rclsid.rawAddress)

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    MutPtr(WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoLoadLibrary(lpszlibname.rawAddress, bautofree))

public actual fun coLockObjectExternal(punk: MutPtr<CVoid>, flock: Bool, flastunlockreleases: Bool): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoLockObjectExternal(punk.rawAddress, flock, flastunlockreleases)

public actual fun coQueryAuthenticationServices(pcauthsvc: MutPtr<UInt>, asauthsvc: MutPtr<MutPtr<SoleAuthenticationService>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoQueryAuthenticationServices(pcauthsvc.rawAddress, asauthsvc.rawAddress)

public actual fun coQueryClientBlanket(pauthnsvc: MutPtr<UInt>, pauthzsvc: MutPtr<UInt>, pserverprincname: MutPtr<Pwstr>, pauthnlevel: MutPtr<UInt>, pimplevel: MutPtr<UInt>, pprivs: MutPtr<MutPtr<CVoid>>, pcapabilities: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoQueryClientBlanket(pauthnsvc.rawAddress, pauthzsvc.rawAddress, pserverprincname.rawAddress, pauthnlevel.rawAddress, pimplevel.rawAddress, pprivs.rawAddress, pcapabilities.rawAddress)

public actual fun coQueryProxyBlanket(pproxy: MutPtr<CVoid>, pwauthnsvc: MutPtr<UInt>, pauthzsvc: MutPtr<UInt>, pserverprincname: MutPtr<Pwstr>, pauthnlevel: MutPtr<UInt>, pimplevel: MutPtr<UInt>, pauthinfo: MutPtr<MutPtr<CVoid>>, pcapabilites: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoQueryProxyBlanket(pproxy.rawAddress, pwauthnsvc.rawAddress, pauthzsvc.rawAddress, pserverprincname.rawAddress, pauthnlevel.rawAddress, pimplevel.rawAddress, pauthinfo.rawAddress, pcapabilites.rawAddress)

public actual fun coRegisterActivationFilter(pactivationfilter: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterActivationFilter(pactivationfilter.rawAddress)

public actual fun coRegisterChannelHook(extensionuuid: ConstPtr<Guid>, pchannelhook: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterChannelHook(extensionuuid.rawAddress, pchannelhook.rawAddress)

public actual fun coRegisterClassObject(rclsid: ConstPtr<Guid>, punk: MutPtr<CVoid>, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterClassObject(rclsid.rawAddress, punk.rawAddress, dwclscontext.toInt(), flags.toInt(), lpdwregister.rawAddress)

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr<CoDeviceCatalogCookie>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterDeviceCatalog(deviceinstanceid.rawAddress, cookie.rawAddress)

public actual fun coRegisterInitializeSpy(pspy: MutPtr<CVoid>, pulicookie: MutPtr<ULong>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterInitializeSpy(pspy.rawAddress, pulicookie.rawAddress)

public actual fun coRegisterMallocSpy(pmallocspy: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterMallocSpy(pmallocspy.rawAddress)

public actual fun coRegisterPSClsid(riid: ConstPtr<Guid>, rclsid: ConstPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterPSClsid(riid.rawAddress, rclsid.rawAddress)

public actual fun coRegisterSurrogate(psurrogate: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRegisterSurrogate(psurrogate.rawAddress)

public actual fun coReleaseServerProcess(): UInt =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoReleaseServerProcess().toUInt()

public actual fun coResumeClassObjects(): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoResumeClassObjects()

public actual fun coRevertToSelf(): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRevertToSelf()

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRevokeClassObject(dwregister.toInt())

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRevokeDeviceCatalog(cookie.rawAddress)

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie.toLong())

public actual fun coRevokeMallocSpy(): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoRevokeMallocSpy()

public actual fun coSetCancelObject(punk: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoSetCancelObject(punk.rawAddress)

public actual fun coSetProxyBlanket(pproxy: MutPtr<CVoid>, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr<CVoid>, dwcapabilities: UInt): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoSetProxyBlanket(pproxy.rawAddress, dwauthnsvc.toInt(), dwauthzsvc.toInt(), pserverprincname.rawAddress, dwauthnlevel.toInt(), dwimplevel.toInt(), pauthinfo.rawAddress, dwcapabilities.toInt())

public actual fun coSuspendClassObjects(): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoSuspendClassObjects()

public actual fun coSwitchCallContext(pnewobject: MutPtr<CVoid>, ppoldobject: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoSwitchCallContext(pnewobject.rawAddress, ppoldobject.rawAddress)

public actual fun coTaskMemAlloc(cb: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoTaskMemAlloc(cb.toLong()))

public actual fun coTaskMemFree(pv: ConstPtr<CVoid>) {
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoTaskMemFree(pv.rawAddress)
}

public actual fun coTaskMemRealloc(pv: ConstPtr<CVoid>, cb: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoTaskMemRealloc(pv.rawAddress, cb.toLong()))

public actual fun coTestCancel(): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoTestCancel()

public actual fun coTreatAsClass(clsidold: ConstPtr<Guid>, clsidnew: ConstPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoTreatAsClass(clsidold.rawAddress, clsidnew.rawAddress)

public actual fun coUninitialize() {
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoUninitialize()
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr<Handle>, lpdwindex: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.rawAddress, lpdwindex.rawAddress)

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr<Handle>, lpdwindex: MutPtr<UInt>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCoWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.rawAddress, lpdwindex.rawAddress)

public actual fun createAntiMoniker(ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateAntiMoniker(ppmk.rawAddress)

public actual fun createBindCtx(reserved: UInt, ppbc: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateBindCtx(reserved.toInt(), ppbc.rawAddress)

public actual fun createClassMoniker(rclsid: ConstPtr<Guid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateClassMoniker(rclsid.rawAddress, ppmk.rawAddress)

public actual fun createDataAdviseHolder(ppdaholder: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateDataAdviseHolder(ppdaholder.rawAddress)

public actual fun createDataCache(punkouter: MutPtr<CVoid>, rclsid: ConstPtr<Guid>, iid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateDataCache(punkouter.rawAddress, rclsid.rawAddress, iid.rawAddress, ppv.rawAddress)

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateFileMoniker(lpszpathname.rawAddress, ppmk.rawAddress)

public actual fun createGenericComposite(pmkfirst: MutPtr<CVoid>, pmkrest: MutPtr<CVoid>, ppmkcomposite: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateGenericComposite(pmkfirst.rawAddress, pmkrest.rawAddress, ppmkcomposite.rawAddress)

public actual fun createIUriBuilder(piuri: MutPtr<CVoid>, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateIUriBuilder(piuri.rawAddress, dwflags.toInt(), dwreserved.toLong(), ppiuribuilder.rawAddress)

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateItemMoniker(lpszdelim.rawAddress, lpszitem.rawAddress, ppmk.rawAddress)

public actual fun createObjrefMoniker(punk: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateObjrefMoniker(punk.rawAddress, ppmk.rawAddress)

public actual fun createPointerMoniker(punk: MutPtr<CVoid>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreatePointerMoniker(punk.rawAddress, ppmk.rawAddress)

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr<CVoid>, ppibsc: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateStdProgressIndicator(hwndparent.rawAddress, psztitle.rawAddress, pibsccaller.rawAddress, ppibsc.rawAddress)

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateUri(pwzuri.rawAddress, dwflags.toInt(), dwreserved.toLong(), ppuri.rawAddress)

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateUriFromMultiByteString(pszansiinputuri.rawAddress, dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toLong(), ppuri.rawAddress)

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComCreateUriWithFragment(pwzuri.rawAddress, pwzfragment.rawAddress, dwflags.toInt(), dwreserved.toLong(), ppuri.rawAddress)

public actual fun dcomChannelSetHResult(pvreserved: ConstPtr<CVoid>, pulreserved: ConstPtr<UInt>, appshr: Hresult): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComDcomChannelSetHResult(pvreserved.rawAddress, pulreserved.rawAddress, appshr)

public actual fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComGetClassFile(szfilename.rawAddress, pclsid.rawAddress)

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComGetErrorInfo(dwreserved.toInt(), pperrinfo.rawAddress)

public actual fun getRunningObjectTable(reserved: UInt, pprot: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComGetRunningObjectTable(reserved.toInt(), pprot.rawAddress)

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr<Guid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComIIDFromString(lpsz.rawAddress, lpiid.rawAddress)

public actual fun mkParseDisplayName(pbc: MutPtr<CVoid>, szusername: Pcwstr, pcheaten: MutPtr<UInt>, ppmk: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComMkParseDisplayName(pbc.rawAddress, szusername.rawAddress, pcheaten.rawAddress, ppmk.rawAddress)

public actual fun monikerCommonPrefixWith(pmkthis: MutPtr<CVoid>, pmkother: MutPtr<CVoid>, ppmkcommon: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComMonikerCommonPrefixWith(pmkthis.rawAddress, pmkother.rawAddress, ppmkcommon.rawAddress)

public actual fun monikerRelativePathTo(pmksrc: MutPtr<CVoid>, pmkdest: MutPtr<CVoid>, ppmkrelpath: MutPtr<MutPtr<CVoid>>, dwreserved: Bool): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComMonikerRelativePathTo(pmksrc.rawAddress, pmkdest.rawAddress, ppmkrelpath.rawAddress, dwreserved)

public actual fun progIDFromCLSID(clsid: ConstPtr<Guid>, lplpszprogid: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComProgIDFromCLSID(clsid.rawAddress, lplpszprogid.rawAddress)

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComSetErrorInfo(dwreserved.toInt(), perrinfo.rawAddress)

public actual fun stringFromCLSID(rclsid: ConstPtr<Guid>, lplpsz: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComStringFromCLSID(rclsid.rawAddress, lplpsz.rawAddress)

public actual fun stringFromGUID2(rguid: ConstPtr<Guid>, lpsz: Pwstr, cchmax: Int): Int =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComStringFromGUID2(rguid.rawAddress, lpsz.rawAddress, cchmax)

public actual fun stringFromIID(rclsid: ConstPtr<Guid>, lplpsz: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemComJniBridge.windowssysWindowsWin32SystemComStringFromIID(rclsid.rawAddress, lplpsz.rawAddress)
