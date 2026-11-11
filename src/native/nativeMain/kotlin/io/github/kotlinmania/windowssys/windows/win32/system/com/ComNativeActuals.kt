@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_bindMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_cLSIDFromProgID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_cLSIDFromProgIDEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_cLSIDFromString
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coAddRefServerProcess
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coAllowSetForegroundWindow
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coBuildVersion
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCancelCall
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCopyProxy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCreateGuid
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCreateInstance
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCreateInstanceEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coCreateInstanceFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coDecrementMTAUsage
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coDisableCallCancellation
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coDisconnectContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coDisconnectObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coDosDateTimeToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coEnableCallCancellation
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coFileTimeNow
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coFileTimeToDosDateTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coFreeAllLibraries
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coFreeLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coFreeUnusedLibraries
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetApartmentType
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetCallContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetCallerTID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetCancelObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetClassObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetContextToken
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetCurrentProcess
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetMalloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetObjectContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetPSClsid
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetSystemSecurityPermissions
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coGetTreatAsClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coImpersonateClient
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coIncrementMTAUsage
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coInitializeEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coInitializeSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coInstall
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coIsHandlerConnected
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coIsOle1Class
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coLoadLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coLockObjectExternal
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coQueryAuthenticationServices
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coQueryClientBlanket
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coQueryProxyBlanket
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterActivationFilter
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterChannelHook
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterClassObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterDeviceCatalog
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterInitializeSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterMallocSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterPSClsid
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRegisterSurrogate
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coReleaseServerProcess
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coResumeClassObjects
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRevertToSelf
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRevokeClassObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRevokeDeviceCatalog
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRevokeInitializeSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coRevokeMallocSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coSetCancelObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coSetProxyBlanket
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coSuspendClassObjects
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coSwitchCallContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coTaskMemAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coTaskMemFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coTaskMemRealloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coTestCancel
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coTreatAsClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coUninitialize
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coWaitForMultipleHandles
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_coWaitForMultipleObjects
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createAntiMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createBindCtx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createClassMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createDataAdviseHolder
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createDataCache
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createFileMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createGenericComposite
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createIUriBuilder
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createItemMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createObjrefMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createPointerMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createStdProgressIndicator
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createUriFromMultiByteString
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_createUriWithFragment
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_dcomChannelSetHResult
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_getClassFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_getErrorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_getRunningObjectTable
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_iIDFromString
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_mkParseDisplayName
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_monikerCommonPrefixWith
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_monikerRelativePathTo
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_progIDFromCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_setErrorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_stringFromCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_stringFromGUID2
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssys_windows_win32_system_com_stringFromIID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bindMoniker(pmk: COpaquePointer?, grfopt: UInt, iidresult: COpaquePointer?, ppvresult: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_bindMoniker(pmk?.value?.toCPointer<ByteVar>(), grfopt, iidresult?.value?.toCPointer<ByteVar>(), ppvresult?.value?.toCPointer<ByteVar>())

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_cLSIDFromProgID(lpszprogid?.value?.toCPointer<ByteVar>(), lpclsid?.value?.toCPointer<ByteVar>())

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_cLSIDFromProgIDEx(lpszprogid?.value?.toCPointer<ByteVar>(), lpclsid?.value?.toCPointer<ByteVar>())

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_cLSIDFromString(lpsz?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun coAddRefServerProcess(): UInt =
    windowssys_windows_win32_system_com_coAddRefServerProcess()

public actual fun coAllowSetForegroundWindow(punk: COpaquePointer?, lpvreserved: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coAllowSetForegroundWindow(punk?.value?.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>())

public actual fun coAllowUnmarshalerCLSID(clsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID(clsid?.value?.toCPointer<ByteVar>())

public actual fun coBuildVersion(): UInt =
    windowssys_windows_win32_system_com_coBuildVersion()

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    windowssys_windows_win32_system_com_coCancelCall(dwthreadid, ultimeout)

public actual fun coCopyProxy(pproxy: COpaquePointer?, ppcopy: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coCopyProxy(pproxy?.value?.toCPointer<ByteVar>(), ppcopy?.value?.toCPointer<ByteVar>())

public actual fun coCreateFreeThreadedMarshaler(punkouter: COpaquePointer?, ppunkmarshal: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler(punkouter?.value?.toCPointer<ByteVar>(), ppunkmarshal?.value?.toCPointer<ByteVar>())

public actual fun coCreateGuid(pguid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coCreateGuid(pguid?.value?.toCPointer<ByteVar>())

public actual fun coCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclscontext: Clsctx, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coCreateInstance(rclsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), dwclscontext, riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun coCreateInstanceEx(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pserverinfo: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coCreateInstanceEx(clsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), dwclsctx, pserverinfo?.value?.toCPointer<ByteVar>(), dwcount, presults?.value?.toCPointer<ByteVar>())

public actual fun coCreateInstanceFromApp(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, reserved: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coCreateInstanceFromApp(clsid?.value?.toCPointer<ByteVar>(), punkouter?.value?.toCPointer<ByteVar>(), dwclsctx, reserved?.value?.toCPointer<ByteVar>(), dwcount, presults?.value?.toCPointer<ByteVar>())

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    windowssys_windows_win32_system_com_coDecrementMTAUsage(cookie?.value?.toCPointer<ByteVar>())

public actual fun coDisableCallCancellation(preserved: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coDisableCallCancellation(preserved?.value?.toCPointer<ByteVar>())

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    windowssys_windows_win32_system_com_coDisconnectContext(dwtimeout)

public actual fun coDisconnectObject(punk: COpaquePointer?, dwreserved: UInt): Hresult =
    windowssys_windows_win32_system_com_coDisconnectObject(punk?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_com_coDosDateTimeToFileTime(ndosdate, ndostime, lpfiletime?.value?.toCPointer<ByteVar>())

public actual fun coEnableCallCancellation(preserved: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coEnableCallCancellation(preserved?.value?.toCPointer<ByteVar>())

public actual fun coFileTimeNow(lpfiletime: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coFileTimeNow(lpfiletime?.value?.toCPointer<ByteVar>())

public actual fun coFileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpdosdate: COpaquePointer?, lpdostime: COpaquePointer?): Bool =
    windowssys_windows_win32_system_com_coFileTimeToDosDateTime(lpfiletime?.value?.toCPointer<ByteVar>(), lpdosdate?.value?.toCPointer<ByteVar>(), lpdostime?.value?.toCPointer<ByteVar>())

public actual fun coFreeAllLibraries() {
    windowssys_windows_win32_system_com_coFreeAllLibraries()
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    windowssys_windows_win32_system_com_coFreeLibrary(hinst?.value?.toCPointer<ByteVar>())
}

public actual fun coFreeUnusedLibraries() {
    windowssys_windows_win32_system_com_coFreeUnusedLibraries()
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(dwunloaddelay, dwreserved)
}

public actual fun coGetApartmentType(papttype: COpaquePointer?, paptqualifier: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetApartmentType(papttype?.value?.toCPointer<ByteVar>(), paptqualifier?.value?.toCPointer<ByteVar>())

public actual fun coGetCallContext(riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetCallContext(riid?.value?.toCPointer<ByteVar>(), ppinterface?.value?.toCPointer<ByteVar>())

public actual fun coGetCallerTID(lpdwtid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetCallerTID(lpdwtid?.value?.toCPointer<ByteVar>())

public actual fun coGetCancelObject(dwthreadid: UInt, iid: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetCancelObject(dwthreadid, iid?.value?.toCPointer<ByteVar>(), ppunk?.value?.toCPointer<ByteVar>())

public actual fun coGetClassObject(rclsid: COpaquePointer?, dwclscontext: UInt, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetClassObject(rclsid?.value?.toCPointer<ByteVar>(), dwclscontext, pvreserved?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun coGetContextToken(ptoken: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetContextToken(ptoken?.value?.toCPointer<ByteVar>())

public actual fun coGetCurrentLogicalThreadId(pguid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId(pguid?.value?.toCPointer<ByteVar>())

public actual fun coGetCurrentProcess(): UInt =
    windowssys_windows_win32_system_com_coGetCurrentProcess()

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetMalloc(dwmemcontext, ppmalloc?.value?.toCPointer<ByteVar>())

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetObject(pszname?.value?.toCPointer<ByteVar>(), pbindoptions?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun coGetObjectContext(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetObjectContext(riid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun coGetPSClsid(riid: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetPSClsid(riid?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(comsdtype, ppsd?.value?.toCPointer<ByteVar>())

public actual fun coGetTreatAsClass(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coGetTreatAsClass(clsidold?.value?.toCPointer<ByteVar>(), pclsidnew?.value?.toCPointer<ByteVar>())

public actual fun coImpersonateClient(): Hresult =
    windowssys_windows_win32_system_com_coImpersonateClient()

public actual fun coIncrementMTAUsage(pcookie: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coIncrementMTAUsage(pcookie?.value?.toCPointer<ByteVar>())

public actual fun coInitialize(pvreserved: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coInitialize(pvreserved?.value?.toCPointer<ByteVar>())

public actual fun coInitializeEx(pvreserved: COpaquePointer?, dwcoinit: UInt): Hresult =
    windowssys_windows_win32_system_com_coInitializeEx(pvreserved?.value?.toCPointer<ByteVar>(), dwcoinit)

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: COpaquePointer?, preserved1: COpaquePointer?, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: COpaquePointer?, dwcapabilities: UInt, preserved3: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coInitializeSecurity(psecdesc?.value?.toCPointer<ByteVar>(), cauthsvc, asauthsvc?.value?.toCPointer<ByteVar>(), preserved1?.value?.toCPointer<ByteVar>(), dwauthnlevel, dwimplevel, pauthlist?.value?.toCPointer<ByteVar>(), dwcapabilities, preserved3?.value?.toCPointer<ByteVar>())

public actual fun coInstall(pbc: COpaquePointer?, dwflags: UInt, pclassspec: COpaquePointer?, pquery: COpaquePointer?, pszcodebase: Pcwstr): Hresult =
    windowssys_windows_win32_system_com_coInstall(pbc?.value?.toCPointer<ByteVar>(), dwflags, pclassspec?.value?.toCPointer<ByteVar>(), pquery?.value?.toCPointer<ByteVar>(), pszcodebase?.value?.toCPointer<ByteVar>())

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings(pszmachinename?.value?.toCPointer<ByteVar>())

public actual fun coIsHandlerConnected(punk: COpaquePointer?): Bool =
    windowssys_windows_win32_system_com_coIsHandlerConnected(punk?.value?.toCPointer<ByteVar>())

public actual fun coIsOle1Class(rclsid: COpaquePointer?): Bool =
    windowssys_windows_win32_system_com_coIsOle1Class(rclsid?.value?.toCPointer<ByteVar>())

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    windowssys_windows_win32_system_com_coLoadLibrary(lpszlibname?.value?.toCPointer<ByteVar>(), bautofree)?.let { COpaquePointer(it.toLong()) }

public actual fun coLockObjectExternal(punk: COpaquePointer?, flock: Bool, flastunlockreleases: Bool): Hresult =
    windowssys_windows_win32_system_com_coLockObjectExternal(punk?.value?.toCPointer<ByteVar>(), flock, flastunlockreleases)

public actual fun coQueryAuthenticationServices(pcauthsvc: COpaquePointer?, asauthsvc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coQueryAuthenticationServices(pcauthsvc?.value?.toCPointer<ByteVar>(), asauthsvc?.value?.toCPointer<ByteVar>())

public actual fun coQueryClientBlanket(pauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pprivs: COpaquePointer?, pcapabilities: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coQueryClientBlanket(pauthnsvc?.value?.toCPointer<ByteVar>(), pauthzsvc?.value?.toCPointer<ByteVar>(), pserverprincname?.value?.toCPointer<ByteVar>(), pauthnlevel?.value?.toCPointer<ByteVar>(), pimplevel?.value?.toCPointer<ByteVar>(), pprivs?.value?.toCPointer<ByteVar>(), pcapabilities?.value?.toCPointer<ByteVar>())

public actual fun coQueryProxyBlanket(pproxy: COpaquePointer?, pwauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pauthinfo: COpaquePointer?, pcapabilites: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coQueryProxyBlanket(pproxy?.value?.toCPointer<ByteVar>(), pwauthnsvc?.value?.toCPointer<ByteVar>(), pauthzsvc?.value?.toCPointer<ByteVar>(), pserverprincname?.value?.toCPointer<ByteVar>(), pauthnlevel?.value?.toCPointer<ByteVar>(), pimplevel?.value?.toCPointer<ByteVar>(), pauthinfo?.value?.toCPointer<ByteVar>(), pcapabilites?.value?.toCPointer<ByteVar>())

public actual fun coRegisterActivationFilter(pactivationfilter: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterActivationFilter(pactivationfilter?.value?.toCPointer<ByteVar>())

public actual fun coRegisterChannelHook(extensionuuid: COpaquePointer?, pchannelhook: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterChannelHook(extensionuuid?.value?.toCPointer<ByteVar>(), pchannelhook?.value?.toCPointer<ByteVar>())

public actual fun coRegisterClassObject(rclsid: COpaquePointer?, punk: COpaquePointer?, dwclscontext: Clsctx, flags: UInt, lpdwregister: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterClassObject(rclsid?.value?.toCPointer<ByteVar>(), punk?.value?.toCPointer<ByteVar>(), dwclscontext, flags, lpdwregister?.value?.toCPointer<ByteVar>())

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterDeviceCatalog(deviceinstanceid?.value?.toCPointer<ByteVar>(), cookie?.value?.toCPointer<ByteVar>())

public actual fun coRegisterInitializeSpy(pspy: COpaquePointer?, pulicookie: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterInitializeSpy(pspy?.value?.toCPointer<ByteVar>(), pulicookie?.value?.toCPointer<ByteVar>())

public actual fun coRegisterMallocSpy(pmallocspy: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterMallocSpy(pmallocspy?.value?.toCPointer<ByteVar>())

public actual fun coRegisterPSClsid(riid: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterPSClsid(riid?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>())

public actual fun coRegisterSurrogate(psurrogate: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coRegisterSurrogate(psurrogate?.value?.toCPointer<ByteVar>())

public actual fun coReleaseServerProcess(): UInt =
    windowssys_windows_win32_system_com_coReleaseServerProcess()

public actual fun coResumeClassObjects(): Hresult =
    windowssys_windows_win32_system_com_coResumeClassObjects()

public actual fun coRevertToSelf(): Hresult =
    windowssys_windows_win32_system_com_coRevertToSelf()

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    windowssys_windows_win32_system_com_coRevokeClassObject(dwregister)

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    windowssys_windows_win32_system_com_coRevokeDeviceCatalog(cookie?.value?.toCPointer<ByteVar>())

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    windowssys_windows_win32_system_com_coRevokeInitializeSpy(ulicookie)

public actual fun coRevokeMallocSpy(): Hresult =
    windowssys_windows_win32_system_com_coRevokeMallocSpy()

public actual fun coSetCancelObject(punk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coSetCancelObject(punk?.value?.toCPointer<ByteVar>())

public actual fun coSetProxyBlanket(pproxy: COpaquePointer?, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: COpaquePointer?, dwcapabilities: UInt): Hresult =
    windowssys_windows_win32_system_com_coSetProxyBlanket(pproxy?.value?.toCPointer<ByteVar>(), dwauthnsvc, dwauthzsvc, pserverprincname?.value?.toCPointer<ByteVar>(), dwauthnlevel, dwimplevel, pauthinfo?.value?.toCPointer<ByteVar>(), dwcapabilities)

public actual fun coSuspendClassObjects(): Hresult =
    windowssys_windows_win32_system_com_coSuspendClassObjects()

public actual fun coSwitchCallContext(pnewobject: COpaquePointer?, ppoldobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coSwitchCallContext(pnewobject?.value?.toCPointer<ByteVar>(), ppoldobject?.value?.toCPointer<ByteVar>())

public actual fun coTaskMemAlloc(cb: ULong): COpaquePointer? =
    windowssys_windows_win32_system_com_coTaskMemAlloc(cb)?.let { COpaquePointer(it.toLong()) }

public actual fun coTaskMemFree(pv: COpaquePointer?) {
    windowssys_windows_win32_system_com_coTaskMemFree(pv?.value?.toCPointer<ByteVar>())
}

public actual fun coTaskMemRealloc(pv: COpaquePointer?, cb: ULong): COpaquePointer? =
    windowssys_windows_win32_system_com_coTaskMemRealloc(pv?.value?.toCPointer<ByteVar>(), cb)?.let { COpaquePointer(it.toLong()) }

public actual fun coTestCancel(): Hresult =
    windowssys_windows_win32_system_com_coTestCancel()

public actual fun coTreatAsClass(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coTreatAsClass(clsidold?.value?.toCPointer<ByteVar>(), clsidnew?.value?.toCPointer<ByteVar>())

public actual fun coUninitialize() {
    windowssys_windows_win32_system_com_coUninitialize()
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coWaitForMultipleHandles(dwflags, dwtimeout, chandles, phandles?.value?.toCPointer<ByteVar>(), lpdwindex?.value?.toCPointer<ByteVar>())

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_coWaitForMultipleObjects(dwflags, dwtimeout, chandles, phandles?.value?.toCPointer<ByteVar>(), lpdwindex?.value?.toCPointer<ByteVar>())

public actual fun createAntiMoniker(ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createAntiMoniker(ppmk?.value?.toCPointer<ByteVar>())

public actual fun createBindCtx(reserved: UInt, ppbc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createBindCtx(reserved, ppbc?.value?.toCPointer<ByteVar>())

public actual fun createClassMoniker(rclsid: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createClassMoniker(rclsid?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun createDataAdviseHolder(ppdaholder: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createDataAdviseHolder(ppdaholder?.value?.toCPointer<ByteVar>())

public actual fun createDataCache(punkouter: COpaquePointer?, rclsid: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createDataCache(punkouter?.value?.toCPointer<ByteVar>(), rclsid?.value?.toCPointer<ByteVar>(), iid?.value?.toCPointer<ByteVar>(), ppv?.value?.toCPointer<ByteVar>())

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createFileMoniker(lpszpathname?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun createGenericComposite(pmkfirst: COpaquePointer?, pmkrest: COpaquePointer?, ppmkcomposite: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createGenericComposite(pmkfirst?.value?.toCPointer<ByteVar>(), pmkrest?.value?.toCPointer<ByteVar>(), ppmkcomposite?.value?.toCPointer<ByteVar>())

public actual fun createIUriBuilder(piuri: COpaquePointer?, dwflags: UInt, dwreserved: ULong, ppiuribuilder: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createIUriBuilder(piuri?.value?.toCPointer<ByteVar>(), dwflags, dwreserved, ppiuribuilder?.value?.toCPointer<ByteVar>())

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createItemMoniker(lpszdelim?.value?.toCPointer<ByteVar>(), lpszitem?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun createObjrefMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createObjrefMoniker(punk?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun createPointerMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createPointerMoniker(punk?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: COpaquePointer?, ppibsc: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createStdProgressIndicator(hwndparent?.value?.toCPointer<ByteVar>(), psztitle?.value?.toCPointer<ByteVar>(), pibsccaller?.value?.toCPointer<ByteVar>(), ppibsc?.value?.toCPointer<ByteVar>())

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createUri(pwzuri?.value?.toCPointer<ByteVar>(), dwflags, dwreserved, ppuri?.value?.toCPointer<ByteVar>())

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createUriFromMultiByteString(pszansiinputuri?.value?.toCPointer<ByteVar>(), dwencodingflags, dwcodepage, dwcreateflags, dwreserved, ppuri?.value?.toCPointer<ByteVar>())

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_createUriWithFragment(pwzuri?.value?.toCPointer<ByteVar>(), pwzfragment?.value?.toCPointer<ByteVar>(), dwflags, dwreserved, ppuri?.value?.toCPointer<ByteVar>())

public actual fun dcomChannelSetHResult(pvreserved: COpaquePointer?, pulreserved: COpaquePointer?, appshr: Hresult): Hresult =
    windowssys_windows_win32_system_com_dcomChannelSetHResult(pvreserved?.value?.toCPointer<ByteVar>(), pulreserved?.value?.toCPointer<ByteVar>(), appshr)

public actual fun getClassFile(szfilename: Pcwstr, pclsid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_getClassFile(szfilename?.value?.toCPointer<ByteVar>(), pclsid?.value?.toCPointer<ByteVar>())

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_getErrorInfo(dwreserved, pperrinfo?.value?.toCPointer<ByteVar>())

public actual fun getRunningObjectTable(reserved: UInt, pprot: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_getRunningObjectTable(reserved, pprot?.value?.toCPointer<ByteVar>())

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_iIDFromString(lpsz?.value?.toCPointer<ByteVar>(), lpiid?.value?.toCPointer<ByteVar>())

public actual fun mkParseDisplayName(pbc: COpaquePointer?, szusername: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_mkParseDisplayName(pbc?.value?.toCPointer<ByteVar>(), szusername?.value?.toCPointer<ByteVar>(), pcheaten?.value?.toCPointer<ByteVar>(), ppmk?.value?.toCPointer<ByteVar>())

public actual fun monikerCommonPrefixWith(pmkthis: COpaquePointer?, pmkother: COpaquePointer?, ppmkcommon: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_monikerCommonPrefixWith(pmkthis?.value?.toCPointer<ByteVar>(), pmkother?.value?.toCPointer<ByteVar>(), ppmkcommon?.value?.toCPointer<ByteVar>())

public actual fun monikerRelativePathTo(pmksrc: COpaquePointer?, pmkdest: COpaquePointer?, ppmkrelpath: COpaquePointer?, dwreserved: Bool): Hresult =
    windowssys_windows_win32_system_com_monikerRelativePathTo(pmksrc?.value?.toCPointer<ByteVar>(), pmkdest?.value?.toCPointer<ByteVar>(), ppmkrelpath?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun progIDFromCLSID(clsid: COpaquePointer?, lplpszprogid: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_progIDFromCLSID(clsid?.value?.toCPointer<ByteVar>(), lplpszprogid?.value?.toCPointer<ByteVar>())

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_setErrorInfo(dwreserved, perrinfo?.value?.toCPointer<ByteVar>())

public actual fun stringFromCLSID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_stringFromCLSID(rclsid?.value?.toCPointer<ByteVar>(), lplpsz?.value?.toCPointer<ByteVar>())

public actual fun stringFromGUID2(rguid: COpaquePointer?, lpsz: Pwstr, cchmax: Int): Int =
    windowssys_windows_win32_system_com_stringFromGUID2(rguid?.value?.toCPointer<ByteVar>(), lpsz?.value?.toCPointer<ByteVar>(), cchmax)

public actual fun stringFromIID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_com_stringFromIID(rclsid?.value?.toCPointer<ByteVar>(), lplpsz?.value?.toCPointer<ByteVar>())
