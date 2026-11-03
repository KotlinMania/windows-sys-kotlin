package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun BindMoniker(pmk: Long, grfopt: UInt, iidresult: Long, ppvresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "BindMoniker", longArrayOf(pmk, grfopt.toLong(), iidresult, ppvresult)).toInt()
}

public fun CLSIDFromProgID(lpszprogid: PCWSTR, lpclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CLSIDFromProgID", longArrayOf(lpszprogid, lpclsid)).toInt()
}

public fun CLSIDFromProgIDEx(lpszprogid: PCWSTR, lpclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CLSIDFromProgIDEx", longArrayOf(lpszprogid, lpclsid)).toInt()
}

public fun CLSIDFromString(lpsz: PCWSTR, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CLSIDFromString", longArrayOf(lpsz, pclsid)).toInt()
}

public fun CoAddRefServerProcess(): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "CoAddRefServerProcess", longArrayOf()).toUInt()
}

public fun CoAllowSetForegroundWindow(punk: Long, lpvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoAllowSetForegroundWindow", longArrayOf(punk, lpvreserved)).toInt()
}

public fun CoAllowUnmarshalerCLSID(clsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoAllowUnmarshalerCLSID", longArrayOf(clsid)).toInt()
}

public fun CoBuildVersion(): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "CoBuildVersion", longArrayOf()).toUInt()
}

public fun CoCancelCall(dwthreadid: UInt, ultimeout: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoCancelCall", longArrayOf(dwthreadid.toLong(), ultimeout.toLong())).toInt()
}

public fun CoCopyProxy(pproxy: Long, ppcopy: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoCopyProxy", longArrayOf(pproxy, ppcopy)).toInt()
}

public fun CoCreateFreeThreadedMarshaler(punkouter: Long, ppunkmarshal: Long): HRESULT {
    return Win32DynamicFfi.invoke("combase.dll", "CoCreateFreeThreadedMarshaler", longArrayOf(punkouter, ppunkmarshal)).toInt()
}

public fun CoCreateGuid(pguid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoCreateGuid", longArrayOf(pguid)).toInt()
}

public fun CoCreateInstance(rclsid: Long, punkouter: Long, dwclscontext: CLSCTX, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoCreateInstance", longArrayOf(rclsid, punkouter, dwclscontext.toLong(), riid, ppv)).toInt()
}

public fun CoCreateInstanceEx(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, pserverinfo: Long, dwcount: UInt, presults: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoCreateInstanceEx", longArrayOf(clsid, punkouter, dwclsctx.toLong(), pserverinfo, dwcount.toLong(), presults)).toInt()
}

public fun CoCreateInstanceFromApp(clsid: Long, punkouter: Long, dwclsctx: CLSCTX, reserved: Long, dwcount: UInt, presults: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoCreateInstanceFromApp", longArrayOf(clsid, punkouter, dwclsctx.toLong(), reserved, dwcount.toLong(), presults)).toInt()
}

public fun CoDecrementMTAUsage(cookie: CO_MTA_USAGE_COOKIE): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoDecrementMTAUsage", longArrayOf(cookie)).toInt()
}

public fun CoDisableCallCancellation(preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoDisableCallCancellation", longArrayOf(preserved)).toInt()
}

public fun CoDisconnectContext(dwtimeout: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoDisconnectContext", longArrayOf(dwtimeout.toLong())).toInt()
}

public fun CoDisconnectObject(punk: Long, dwreserved: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoDisconnectObject", longArrayOf(punk, dwreserved.toLong())).toInt()
}

public fun CoDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: Long): BOOL {
    return Win32DynamicFfi.invoke("ole32.dll", "CoDosDateTimeToFileTime", longArrayOf(ndosdate.toLong(), ndostime.toLong(), lpfiletime)).toInt()
}

public fun CoEnableCallCancellation(preserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoEnableCallCancellation", longArrayOf(preserved)).toInt()
}

public fun CoFileTimeNow(lpfiletime: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoFileTimeNow", longArrayOf(lpfiletime)).toInt()
}

public fun CoFileTimeToDosDateTime(lpfiletime: Long, lpdosdate: Long, lpdostime: Long): BOOL {
    return Win32DynamicFfi.invoke("ole32.dll", "CoFileTimeToDosDateTime", longArrayOf(lpfiletime, lpdosdate, lpdostime)).toInt()
}

public fun CoFreeAllLibraries() {
    Win32DynamicFfi.invoke("ole32.dll", "CoFreeAllLibraries", longArrayOf())
}

public fun CoFreeLibrary(hinst: Foundation.HINSTANCE) {
    Win32DynamicFfi.invoke("ole32.dll", "CoFreeLibrary", longArrayOf(Win32DynamicFfi.objectSlot(hinst)))
}

public fun CoFreeUnusedLibraries() {
    Win32DynamicFfi.invoke("ole32.dll", "CoFreeUnusedLibraries", longArrayOf())
}

public fun CoFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    Win32DynamicFfi.invoke("ole32.dll", "CoFreeUnusedLibrariesEx", longArrayOf(dwunloaddelay.toLong(), dwreserved.toLong()))
}

public fun CoGetApartmentType(papttype: Long, paptqualifier: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetApartmentType", longArrayOf(papttype, paptqualifier)).toInt()
}

public fun CoGetCallContext(riid: Long, ppinterface: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetCallContext", longArrayOf(riid, ppinterface)).toInt()
}

public fun CoGetCallerTID(lpdwtid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetCallerTID", longArrayOf(lpdwtid)).toInt()
}

public fun CoGetCancelObject(dwthreadid: UInt, iid: Long, ppunk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetCancelObject", longArrayOf(dwthreadid.toLong(), iid, ppunk)).toInt()
}

public fun CoGetClassObject(rclsid: Long, dwclscontext: UInt, pvreserved: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetClassObject", longArrayOf(rclsid, dwclscontext.toLong(), pvreserved, riid, ppv)).toInt()
}

public fun CoGetContextToken(ptoken: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetContextToken", longArrayOf(ptoken)).toInt()
}

public fun CoGetCurrentLogicalThreadId(pguid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetCurrentLogicalThreadId", longArrayOf(pguid)).toInt()
}

public fun CoGetCurrentProcess(): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetCurrentProcess", longArrayOf()).toUInt()
}

public fun CoGetMalloc(dwmemcontext: UInt, ppmalloc: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetMalloc", longArrayOf(dwmemcontext.toLong(), ppmalloc)).toInt()
}

public fun CoGetObject(pszname: PCWSTR, pbindoptions: Long, riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetObject", longArrayOf(pszname, pbindoptions, riid, ppv)).toInt()
}

public fun CoGetObjectContext(riid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetObjectContext", longArrayOf(riid, ppv)).toInt()
}

public fun CoGetPSClsid(riid: Long, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetPSClsid", longArrayOf(riid, pclsid)).toInt()
}

public fun CoGetSystemSecurityPermissions(comsdtype: COMSD, ppsd: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetSystemSecurityPermissions", longArrayOf(comsdtype.toLong(), ppsd)).toInt()
}

public fun CoGetTreatAsClass(clsidold: Long, pclsidnew: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoGetTreatAsClass", longArrayOf(clsidold, pclsidnew)).toInt()
}

public fun CoImpersonateClient(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoImpersonateClient", longArrayOf()).toInt()
}

public fun CoIncrementMTAUsage(pcookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("combase.dll", "CoIncrementMTAUsage", longArrayOf(pcookie)).toInt()
}

public fun CoInitialize(pvreserved: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoInitialize", longArrayOf(pvreserved)).toInt()
}

public fun CoInitializeEx(pvreserved: Long, dwcoinit: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoInitializeEx", longArrayOf(pvreserved, dwcoinit.toLong())).toInt()
}

public fun CoInitializeSecurity(psecdesc: Security.PSECURITY_DESCRIPTOR, cauthsvc: Int, asauthsvc: Long, preserved1: Long, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthlist: Long, dwcapabilities: UInt, preserved3: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoInitializeSecurity", longArrayOf(Win32DynamicFfi.objectSlot(psecdesc), cauthsvc.toLong(), asauthsvc, preserved1, dwauthnlevel.toLong(), dwimplevel.toLong(), pauthlist, dwcapabilities.toLong(), preserved3)).toInt()
}

public fun CoInstall(pbc: Long, dwflags: UInt, pclassspec: Long, pquery: Long, pszcodebase: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoInstall", longArrayOf(pbc, dwflags.toLong(), pclassspec, pquery, pszcodebase)).toInt()
}

public fun CoInvalidateRemoteMachineBindings(pszmachinename: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoInvalidateRemoteMachineBindings", longArrayOf(pszmachinename)).toInt()
}

public fun CoIsHandlerConnected(punk: Long): BOOL {
    return Win32DynamicFfi.invoke("ole32.dll", "CoIsHandlerConnected", longArrayOf(punk)).toInt()
}

public fun CoIsOle1Class(rclsid: Long): BOOL {
    return Win32DynamicFfi.invoke("ole32.dll", "CoIsOle1Class", longArrayOf(rclsid)).toInt()
}

public fun CoLoadLibrary(lpszlibname: PCWSTR, bautofree: BOOL): Foundation.HINSTANCE {
    Win32DynamicFfi.invoke("ole32.dll", "CoLoadLibrary", longArrayOf(lpszlibname, bautofree.toLong()))
    return Foundation.HINSTANCE()
}

public fun CoLockObjectExternal(punk: Long, flock: BOOL, flastunlockreleases: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoLockObjectExternal", longArrayOf(punk, flock.toLong(), flastunlockreleases.toLong())).toInt()
}

public fun CoQueryAuthenticationServices(pcauthsvc: Long, asauthsvc: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoQueryAuthenticationServices", longArrayOf(pcauthsvc, asauthsvc)).toInt()
}

public fun CoQueryClientBlanket(pauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pprivs: Long, pcapabilities: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoQueryClientBlanket", longArrayOf(pauthnsvc, pauthzsvc, pserverprincname, pauthnlevel, pimplevel, pprivs, pcapabilities)).toInt()
}

public fun CoQueryProxyBlanket(pproxy: Long, pwauthnsvc: Long, pauthzsvc: Long, pserverprincname: Long, pauthnlevel: Long, pimplevel: Long, pauthinfo: Long, pcapabilites: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoQueryProxyBlanket", longArrayOf(pproxy, pwauthnsvc, pauthzsvc, pserverprincname, pauthnlevel, pimplevel, pauthinfo, pcapabilites)).toInt()
}

public fun CoRegisterActivationFilter(pactivationfilter: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterActivationFilter", longArrayOf(pactivationfilter)).toInt()
}

public fun CoRegisterChannelHook(extensionuuid: Long, pchannelhook: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterChannelHook", longArrayOf(extensionuuid, pchannelhook)).toInt()
}

public fun CoRegisterClassObject(rclsid: Long, punk: Long, dwclscontext: CLSCTX, flags: UInt, lpdwregister: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterClassObject", longArrayOf(rclsid, punk, dwclscontext.toLong(), flags.toLong(), lpdwregister)).toInt()
}

public fun CoRegisterDeviceCatalog(deviceinstanceid: PCWSTR, cookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterDeviceCatalog", longArrayOf(deviceinstanceid, cookie)).toInt()
}

public fun CoRegisterInitializeSpy(pspy: Long, pulicookie: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterInitializeSpy", longArrayOf(pspy, pulicookie)).toInt()
}

public fun CoRegisterMallocSpy(pmallocspy: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterMallocSpy", longArrayOf(pmallocspy)).toInt()
}

public fun CoRegisterPSClsid(riid: Long, rclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterPSClsid", longArrayOf(riid, rclsid)).toInt()
}

public fun CoRegisterSurrogate(psurrogate: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRegisterSurrogate", longArrayOf(psurrogate)).toInt()
}

public fun CoReleaseServerProcess(): UInt {
    return Win32DynamicFfi.invoke("ole32.dll", "CoReleaseServerProcess", longArrayOf()).toUInt()
}

public fun CoResumeClassObjects(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoResumeClassObjects", longArrayOf()).toInt()
}

public fun CoRevertToSelf(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRevertToSelf", longArrayOf()).toInt()
}

public fun CoRevokeClassObject(dwregister: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRevokeClassObject", longArrayOf(dwregister.toLong())).toInt()
}

public fun CoRevokeDeviceCatalog(cookie: CO_DEVICE_CATALOG_COOKIE): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRevokeDeviceCatalog", longArrayOf(cookie)).toInt()
}

public fun CoRevokeInitializeSpy(ulicookie: ULong): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRevokeInitializeSpy", longArrayOf(ulicookie.toLong())).toInt()
}

public fun CoRevokeMallocSpy(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoRevokeMallocSpy", longArrayOf()).toInt()
}

public fun CoSetCancelObject(punk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoSetCancelObject", longArrayOf(punk)).toInt()
}

public fun CoSetProxyBlanket(pproxy: Long, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: PCWSTR, dwauthnlevel: RPC_C_AUTHN_LEVEL, dwimplevel: RPC_C_IMP_LEVEL, pauthinfo: Long, dwcapabilities: UInt): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoSetProxyBlanket", longArrayOf(pproxy, dwauthnsvc.toLong(), dwauthzsvc.toLong(), pserverprincname, dwauthnlevel.toLong(), dwimplevel.toLong(), pauthinfo, dwcapabilities.toLong())).toInt()
}

public fun CoSuspendClassObjects(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoSuspendClassObjects", longArrayOf()).toInt()
}

public fun CoSwitchCallContext(pnewobject: Long, ppoldobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoSwitchCallContext", longArrayOf(pnewobject, ppoldobject)).toInt()
}

public fun CoTaskMemAlloc(cb: ULong): Long {
    return Win32DynamicFfi.invoke("combase.dll", "CoTaskMemAlloc", longArrayOf(cb.toLong()))
}

public fun CoTaskMemFree(pv: Long) {
    Win32DynamicFfi.invoke("combase.dll", "CoTaskMemFree", longArrayOf(pv))
}

public fun CoTaskMemRealloc(pv: Long, cb: ULong): Long {
    return Win32DynamicFfi.invoke("ole32.dll", "CoTaskMemRealloc", longArrayOf(pv, cb.toLong()))
}

public fun CoTestCancel(): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoTestCancel", longArrayOf()).toInt()
}

public fun CoTreatAsClass(clsidold: Long, clsidnew: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoTreatAsClass", longArrayOf(clsidold, clsidnew)).toInt()
}

public fun CoUninitialize() {
    Win32DynamicFfi.invoke("ole32.dll", "CoUninitialize", longArrayOf())
}

public fun CoWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoWaitForMultipleHandles", longArrayOf(dwflags.toLong(), dwtimeout.toLong(), chandles.toLong(), phandles, lpdwindex)).toInt()
}

public fun CoWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: Long, lpdwindex: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CoWaitForMultipleObjects", longArrayOf(dwflags.toLong(), dwtimeout.toLong(), chandles.toLong(), phandles, lpdwindex)).toInt()
}

public fun CreateAntiMoniker(ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateAntiMoniker", longArrayOf(ppmk)).toInt()
}

public fun CreateBindCtx(reserved: UInt, ppbc: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateBindCtx", longArrayOf(reserved.toLong(), ppbc)).toInt()
}

public fun CreateClassMoniker(rclsid: Long, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateClassMoniker", longArrayOf(rclsid, ppmk)).toInt()
}

public fun CreateDataAdviseHolder(ppdaholder: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateDataAdviseHolder", longArrayOf(ppdaholder)).toInt()
}

public fun CreateDataCache(punkouter: Long, rclsid: Long, iid: Long, ppv: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateDataCache", longArrayOf(punkouter, rclsid, iid, ppv)).toInt()
}

public fun CreateFileMoniker(lpszpathname: PCWSTR, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateFileMoniker", longArrayOf(lpszpathname, ppmk)).toInt()
}

public fun CreateGenericComposite(pmkfirst: Long, pmkrest: Long, ppmkcomposite: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateGenericComposite", longArrayOf(pmkfirst, pmkrest, ppmkcomposite)).toInt()
}

public fun CreateIUriBuilder(piuri: Long, dwflags: UInt, dwreserved: ULong, ppiuribuilder: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateIUriBuilder", longArrayOf(piuri, dwflags.toLong(), dwreserved.toLong(), ppiuribuilder)).toInt()
}

public fun CreateItemMoniker(lpszdelim: PCWSTR, lpszitem: PCWSTR, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateItemMoniker", longArrayOf(lpszdelim, lpszitem, ppmk)).toInt()
}

public fun CreateObjrefMoniker(punk: Long, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateObjrefMoniker", longArrayOf(punk, ppmk)).toInt()
}

public fun CreatePointerMoniker(punk: Long, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreatePointerMoniker", longArrayOf(punk, ppmk)).toInt()
}

public fun CreateStdProgressIndicator(hwndparent: Foundation.HWND, psztitle: PCWSTR, pibsccaller: Long, ppibsc: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "CreateStdProgressIndicator", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), psztitle, pibsccaller, ppibsc)).toInt()
}

public fun CreateUri(pwzuri: PCWSTR, dwflags: URI_CREATE_FLAGS, dwreserved: ULong, ppuri: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateUri", longArrayOf(pwzuri, dwflags.toLong(), dwreserved.toLong(), ppuri)).toInt()
}

public fun CreateUriFromMultiByteString(pszansiinputuri: PCSTR, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateUriFromMultiByteString", longArrayOf(pszansiinputuri, dwencodingflags.toLong(), dwcodepage.toLong(), dwcreateflags.toLong(), dwreserved.toLong(), ppuri)).toInt()
}

public fun CreateUriWithFragment(pwzuri: PCWSTR, pwzfragment: PCWSTR, dwflags: UInt, dwreserved: ULong, ppuri: Long): HRESULT {
    return Win32DynamicFfi.invoke("urlmon.dll", "CreateUriWithFragment", longArrayOf(pwzuri, pwzfragment, dwflags.toLong(), dwreserved.toLong(), ppuri)).toInt()
}

public fun DcomChannelSetHResult(pvreserved: Long, pulreserved: Long, appshr: HRESULT): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "DcomChannelSetHResult", longArrayOf(pvreserved, pulreserved, appshr.toLong())).toInt()
}

public fun GetClassFile(szfilename: PCWSTR, pclsid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "GetClassFile", longArrayOf(szfilename, pclsid)).toInt()
}

public fun GetErrorInfo(dwreserved: UInt, pperrinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "GetErrorInfo", longArrayOf(dwreserved.toLong(), pperrinfo)).toInt()
}

public fun GetRunningObjectTable(reserved: UInt, pprot: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "GetRunningObjectTable", longArrayOf(reserved.toLong(), pprot)).toInt()
}

public fun IIDFromString(lpsz: PCWSTR, lpiid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "IIDFromString", longArrayOf(lpsz, lpiid)).toInt()
}

public fun MkParseDisplayName(pbc: Long, szusername: PCWSTR, pcheaten: Long, ppmk: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "MkParseDisplayName", longArrayOf(pbc, szusername, pcheaten, ppmk)).toInt()
}

public fun MonikerCommonPrefixWith(pmkthis: Long, pmkother: Long, ppmkcommon: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "MonikerCommonPrefixWith", longArrayOf(pmkthis, pmkother, ppmkcommon)).toInt()
}

public fun MonikerRelativePathTo(pmksrc: Long, pmkdest: Long, ppmkrelpath: Long, dwreserved: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "MonikerRelativePathTo", longArrayOf(pmksrc, pmkdest, ppmkrelpath, dwreserved.toLong())).toInt()
}

public fun ProgIDFromCLSID(clsid: Long, lplpszprogid: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "ProgIDFromCLSID", longArrayOf(clsid, lplpszprogid)).toInt()
}

public fun SetErrorInfo(dwreserved: UInt, perrinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleaut32.dll", "SetErrorInfo", longArrayOf(dwreserved.toLong(), perrinfo)).toInt()
}

public fun StringFromCLSID(rclsid: Long, lplpsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StringFromCLSID", longArrayOf(rclsid, lplpsz)).toInt()
}

public fun StringFromGUID2(rguid: Long, lpsz: PWSTR, cchmax: Int): Int {
    return Win32DynamicFfi.invoke("ole32.dll", "StringFromGUID2", longArrayOf(rguid, lpsz, cchmax.toLong())).toInt()
}

public fun StringFromIID(rclsid: Long, lplpsz: Long): HRESULT {
    return Win32DynamicFfi.invoke("ole32.dll", "StringFromIID", longArrayOf(rclsid, lplpsz)).toInt()
}
