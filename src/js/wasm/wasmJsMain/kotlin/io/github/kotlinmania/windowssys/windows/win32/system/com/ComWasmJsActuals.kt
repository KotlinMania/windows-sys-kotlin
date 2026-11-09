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

public actual fun BindMoniker(pmk: Long, grfopt: UInt, iidresult: Long, ppvresult: Long): HRESULT =
    0

public actual fun CLSIDFromProgID(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    0

public actual fun CLSIDFromProgIDEx(lpszprogid: PCWSTR, lpclsid: Long): HRESULT =
    0

public actual fun CLSIDFromString(lpsz: PCWSTR, pclsid: Long): HRESULT =
    0

public actual fun CoAddRefServerProcess(): UInt =
    0u

public actual fun CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): HRESULT =
    0

public actual fun CoAllowUnmarshalerCLSID(clsid: Long): HRESULT =
    0

public actual fun CoBuildVersion(): UInt =
    0u

public actual fun CoCancelCall(dwthreadid: UInt, ultimeout: UInt): HRESULT =
    0

public actual fun CoCopyProxy(pproxy: Long, ppcopy: Long): HRESULT =
    0

public actual fun CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): HRESULT =
    0

public actual fun CoCreateGuid(pguid: Long): HRESULT =
    0

public actual fun CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: CLSCTX, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, pserverinfo: Long, dwcount: UInt, presults: Long): HRESULT =
    0

public actual fun CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, reserved: Long, dwcount: UInt, presults: Long): HRESULT =
    0

public actual fun CoDecrementMTAUsage(cookie: CO_MTA_USAGE_COOKIE): HRESULT =
    0

public actual fun CoDisableCallCancellation(preserved: Long): HRESULT =
    0

public actual fun CoDisconnectContext(dwtimeout: UInt): HRESULT =
    0

public actual fun CoDisconnectObject(punk: Long, dwreserved: UInt): HRESULT =
    0

public actual fun CoDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: Long): BOOL =
    0

public actual fun CoEnableCallCancellation(preserved: Long): HRESULT =
    0

public actual fun CoFileTimeNow(lpfiletime: Long): HRESULT =
    0

public actual fun CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): BOOL =
    0

public actual fun CoFreeAllLibraries() {
}

public actual fun CoFreeLibrary(hinst: HINSTANCE) {
}

public actual fun CoFreeUnusedLibraries() {
}

public actual fun CoFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
}

public actual fun CoGetApartmentType(papttype: Long, paptqualifier: Long): HRESULT =
    0

public actual fun CoGetCallContext(riid: Long, ppinterface: Long): HRESULT =
    0

public actual fun CoGetCallerTID(lpdwtid: Long): HRESULT =
    0

public actual fun CoGetCancelObject(dwthreadid: UInt, iid: Long, ppunk: Long): HRESULT =
    0

public actual fun CoGetClassObject(rclsid: Long, dwclscontext: UInt, pvreserved: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CoGetContextToken(ptoken: Long): HRESULT =
    0

public actual fun CoGetCurrentLogicalThreadId(pguid: Long): HRESULT =
    0

public actual fun CoGetCurrentProcess(): UInt =
    0u

public actual fun CoGetMalloc(dwmemcontext: UInt, ppmalloc: Long): HRESULT =
    0

public actual fun CoGetObject(pszname: PCWSTR, pbindoptions: Long, riid: Long, ppv: Long): HRESULT =
    0

public actual fun CoGetObjectContext(riid: Long, ppv: Long): HRESULT =
    0

public actual fun CoGetPSClsid(riid: Long, pclsid: Long): HRESULT =
    0

public actual fun CoGetSystemSecurityPermissions(comsdtype: COMSD, ppsd: Long): HRESULT =
    0

public actual fun CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): HRESULT =
    0

public actual fun CoImpersonateClient(): HRESULT =
    0

public actual fun CoIncrementMTAUsage(pcookie: Long): HRESULT =
    0

public actual fun CoInitialize(pvreserved: Long): HRESULT =
    0

public actual fun CoInitializeEx(pvreserved: Long, dwcoinit: UInt): HRESULT =
    0

public actual fun CoInitializeSecurity(psecdesc: PSECURITY_DESCRIPTOR, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthlist: Long, dwcapabilities: UInt, preserved3: Long): HRESULT =
    0

public actual fun CoInstall(pbc: Long, dwflags: UInt, pclassspec: Long, pquery: Long, pszcodebase: PCWSTR): HRESULT =
    0

public actual fun CoInvalidateRemoteMachineBindings(pszmachinename: PCWSTR): HRESULT =
    0

public actual fun CoIsHandlerConnected(punk: Long): BOOL =
    0

public actual fun CoIsOle1Class(rclsid: Long): BOOL =
    0

public actual fun CoLoadLibrary(lpszlibname: PCWSTR, bautofree: BOOL): HINSTANCE =
    0L

public actual fun CoLockObjectExternal(punk: Long, flock: BOOL, flastunlockreleases: BOOL): HRESULT =
    0

public actual fun CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): HRESULT =
    0

public actual fun CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): HRESULT =
    0

public actual fun CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): HRESULT =
    0

public actual fun CoRegisterActivationFilter(pactivationfilter: Long): HRESULT =
    0

public actual fun CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): HRESULT =
    0

public actual fun CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: CLSCTX, flags: UInt, lpdwregister: Long): HRESULT =
    0

public actual fun CoRegisterDeviceCatalog(deviceinstanceid: PCWSTR, cookie: Long): HRESULT =
    0

public actual fun CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): HRESULT =
    0

public actual fun CoRegisterMallocSpy(pmallocspy: Long): HRESULT =
    0

public actual fun CoRegisterPSClsid(riid: Long, rclsid: Long): HRESULT =
    0

public actual fun CoRegisterSurrogate(psurrogate: Long): HRESULT =
    0

public actual fun CoReleaseServerProcess(): UInt =
    0u

public actual fun CoResumeClassObjects(): HRESULT =
    0

public actual fun CoRevertToSelf(): HRESULT =
    0

public actual fun CoRevokeClassObject(dwregister: UInt): HRESULT =
    0

public actual fun CoRevokeDeviceCatalog(cookie: CO_DEVICE_CATALOG_COOKIE): HRESULT =
    0

public actual fun CoRevokeInitializeSpy(ulicookie: ULong): HRESULT =
    0

public actual fun CoRevokeMallocSpy(): HRESULT =
    0

public actual fun CoSetCancelObject(punk: Long): HRESULT =
    0

public actual fun CoSetProxyBlanket(pproxy: Long, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: PCWSTR, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthinfo: Long, dwcapabilities: UInt): HRESULT =
    0

public actual fun CoSuspendClassObjects(): HRESULT =
    0

public actual fun CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): HRESULT =
    0

public actual fun CoTaskMemAlloc(cb: ULong): Long =
    0L

public actual fun CoTaskMemFree(pv: Long) {
}

public actual fun CoTaskMemRealloc(pv: Long, cb: ULong): Long =
    0L

public actual fun CoTestCancel(): HRESULT =
    0

public actual fun CoTreatAsClass(clsidold: Long, clsidnew: Long): HRESULT =
    0

public actual fun CoUninitialize() {
}

public actual fun CoWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    0

public actual fun CoWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT =
    0

public actual fun CreateAntiMoniker(ppmk: Long): HRESULT =
    0

public actual fun CreateBindCtx(reserved: UInt, ppbc: Long): HRESULT =
    0

public actual fun CreateClassMoniker(rclsid: Long, ppmk: Long): HRESULT =
    0

public actual fun CreateDataAdviseHolder(ppdaholder: Long): HRESULT =
    0

public actual fun CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): HRESULT =
    0

public actual fun CreateFileMoniker(lpszpathname: PCWSTR, ppmk: Long): HRESULT =
    0

public actual fun CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): HRESULT =
    0

public actual fun CreateIUriBuilder(piuri: Long, dwflags: UInt, dwreserved: ULong, ppiuribuilder: Long): HRESULT =
    0

public actual fun CreateItemMoniker(lpszdelim: PCWSTR, lpszitem: PCWSTR, ppmk: Long): HRESULT =
    0

public actual fun CreateObjrefMoniker(punk: Long, ppmk: Long): HRESULT =
    0

public actual fun CreatePointerMoniker(punk: Long, ppmk: Long): HRESULT =
    0

public actual fun CreateStdProgressIndicator(hwndparent: HWND, psztitle: PCWSTR, pibsccaller: Long, ppibsc: Long): HRESULT =
    0

public actual fun CreateUri(pwzuri: PCWSTR, dwflags: URI_CREATE_FLAGS, dwreserved: ULong, ppuri: Long): HRESULT =
    0

public actual fun CreateUriFromMultiByteString(pszansiinputuri: PCSTR, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    0

public actual fun CreateUriWithFragment(pwzuri: PCWSTR, pwzfragment: PCWSTR, dwflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT =
    0

public actual fun DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: HRESULT): HRESULT =
    0

public actual fun GetClassFile(szfilename: PCWSTR, pclsid: Long): HRESULT =
    0

public actual fun GetErrorInfo(dwreserved: UInt, pperrinfo: Long): HRESULT =
    0

public actual fun GetRunningObjectTable(reserved: UInt, pprot: Long): HRESULT =
    0

public actual fun IIDFromString(lpsz: PCWSTR, lpiid: Long): HRESULT =
    0

public actual fun MkParseDisplayName(pbc: Long, szusername: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT =
    0

public actual fun MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): HRESULT =
    0

public actual fun MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: BOOL): HRESULT =
    0

public actual fun ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): HRESULT =
    0

public actual fun SetErrorInfo(dwreserved: UInt, perrinfo: Long): HRESULT =
    0

public actual fun StringFromCLSID(rclsid: Long, lplpsz: Long): HRESULT =
    0

public actual fun StringFromGUID2(rguid: Long, lpsz: PWSTR, cchmax: Int): Int =
    0

public actual fun StringFromIID(rclsid: Long, lplpsz: Long): HRESULT =
    0
