@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComBindMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCLSIDFromProgID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCLSIDFromProgIDEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCLSIDFromString
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoAddRefServerProcess
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoAllowSetForegroundWindow
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoBuildVersion
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCancelCall
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCopyProxy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCreateGuid
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCreateInstance
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCreateInstanceEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoCreateInstanceFromApp
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoDecrementMTAUsage
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoDisableCallCancellation
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoDisconnectContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoDisconnectObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoDosDateTimeToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoEnableCallCancellation
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoFileTimeNow
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoFileTimeToDosDateTime
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoFreeAllLibraries
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoFreeLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoFreeUnusedLibraries
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetApartmentType
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetCallContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetCallerTID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetCancelObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetClassObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetContextToken
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetCurrentProcess
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetMalloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetObjectContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetPSClsid
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoGetTreatAsClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoImpersonateClient
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoIncrementMTAUsage
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoInitialize
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoInitializeEx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoInitializeSecurity
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoInstall
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoIsHandlerConnected
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoIsOle1Class
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoLoadLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoLockObjectExternal
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoQueryAuthenticationServices
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoQueryClientBlanket
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoQueryProxyBlanket
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterActivationFilter
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterChannelHook
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterClassObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterDeviceCatalog
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterInitializeSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterMallocSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterPSClsid
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRegisterSurrogate
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoReleaseServerProcess
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoResumeClassObjects
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRevertToSelf
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRevokeClassObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRevokeDeviceCatalog
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRevokeInitializeSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoRevokeMallocSpy
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoSetCancelObject
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoSetProxyBlanket
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoSuspendClassObjects
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoSwitchCallContext
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoTaskMemAlloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoTaskMemFree
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoTaskMemRealloc
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoTestCancel
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoTreatAsClass
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoUninitialize
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoWaitForMultipleHandles
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCoWaitForMultipleObjects
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateAntiMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateBindCtx
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateClassMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateDataAdviseHolder
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateDataCache
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateFileMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateGenericComposite
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateIUriBuilder
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateItemMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateObjrefMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreatePointerMoniker
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateStdProgressIndicator
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateUri
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateUriFromMultiByteString
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComCreateUriWithFragment
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComDcomChannelSetHResult
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComGetClassFile
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComGetErrorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComGetRunningObjectTable
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComIIDFromString
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComMkParseDisplayName
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComMonikerCommonPrefixWith
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComMonikerRelativePathTo
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComProgIDFromCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComSetErrorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComStringFromCLSID
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComStringFromGUID2
import io.github.kotlinmania.windowssys.windows.win32.system.com.cinterop.windowssysWindowsWin32SystemComStringFromIID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun bindMoniker(pmk: MutPtr, grfopt: UInt, iidresult: ConstPtr, ppvresult: MutPtr): Hresult =
    windowssysWindowsWin32SystemComBindMoniker(pmk.rawAddress.toCPointer<ByteVar>(), grfopt, iidresult.rawAddress.toCPointer<ByteVar>(), ppvresult.rawAddress.toCPointer<ByteVar>())

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCLSIDFromProgID(lpszprogid.rawAddress.toCPointer<ByteVar>(), lpclsid.rawAddress.toCPointer<ByteVar>())

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCLSIDFromProgIDEx(lpszprogid.rawAddress.toCPointer<ByteVar>(), lpclsid.rawAddress.toCPointer<ByteVar>())

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCLSIDFromString(lpsz.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun coAddRefServerProcess(): UInt =
    windowssysWindowsWin32SystemComCoAddRefServerProcess()

public actual fun coAllowSetForegroundWindow(punk: MutPtr, lpvreserved: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoAllowSetForegroundWindow(punk.rawAddress.toCPointer<ByteVar>(), lpvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun coAllowUnmarshalerCLSID(clsid: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(clsid.rawAddress.toCPointer<ByteVar>())

public actual fun coBuildVersion(): UInt =
    windowssysWindowsWin32SystemComCoBuildVersion()

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    windowssysWindowsWin32SystemComCoCancelCall(dwthreadid, ultimeout)

public actual fun coCopyProxy(pproxy: MutPtr, ppcopy: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoCopyProxy(pproxy.rawAddress.toCPointer<ByteVar>(), ppcopy.rawAddress.toCPointer<ByteVar>())

public actual fun coCreateFreeThreadedMarshaler(punkouter: MutPtr, ppunkmarshal: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(punkouter.rawAddress.toCPointer<ByteVar>(), ppunkmarshal.rawAddress.toCPointer<ByteVar>())

public actual fun coCreateGuid(pguid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoCreateGuid(pguid.rawAddress.toCPointer<ByteVar>())

public actual fun coCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, dwclscontext: Clsctx, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoCreateInstance(rclsid.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), dwclscontext, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun coCreateInstanceEx(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pserverinfo: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoCreateInstanceEx(clsid.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), dwclsctx, pserverinfo.rawAddress.toCPointer<ByteVar>(), dwcount, presults.rawAddress.toCPointer<ByteVar>())

public actual fun coCreateInstanceFromApp(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, reserved: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoCreateInstanceFromApp(clsid.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), dwclsctx, reserved.rawAddress.toCPointer<ByteVar>(), dwcount, presults.rawAddress.toCPointer<ByteVar>())

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    windowssysWindowsWin32SystemComCoDecrementMTAUsage(cookie.rawAddress.toCPointer<ByteVar>())

public actual fun coDisableCallCancellation(preserved: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoDisableCallCancellation(preserved.rawAddress.toCPointer<ByteVar>())

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    windowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout)

public actual fun coDisconnectObject(punk: MutPtr, dwreserved: UInt): Hresult =
    windowssysWindowsWin32SystemComCoDisconnectObject(punk.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr): Bool =
    windowssysWindowsWin32SystemComCoDosDateTimeToFileTime(ndosdate, ndostime, lpfiletime.rawAddress.toCPointer<ByteVar>())

public actual fun coEnableCallCancellation(preserved: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoEnableCallCancellation(preserved.rawAddress.toCPointer<ByteVar>())

public actual fun coFileTimeNow(lpfiletime: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoFileTimeNow(lpfiletime.rawAddress.toCPointer<ByteVar>())

public actual fun coFileTimeToDosDateTime(lpfiletime: ConstPtr, lpdosdate: MutPtr, lpdostime: MutPtr): Bool =
    windowssysWindowsWin32SystemComCoFileTimeToDosDateTime(lpfiletime.rawAddress.toCPointer<ByteVar>(), lpdosdate.rawAddress.toCPointer<ByteVar>(), lpdostime.rawAddress.toCPointer<ByteVar>())

public actual fun coFreeAllLibraries() {
    windowssysWindowsWin32SystemComCoFreeAllLibraries()
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    windowssysWindowsWin32SystemComCoFreeLibrary(hinst.rawAddress.toCPointer<ByteVar>())
}

public actual fun coFreeUnusedLibraries() {
    windowssysWindowsWin32SystemComCoFreeUnusedLibraries()
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay, dwreserved)
}

public actual fun coGetApartmentType(papttype: MutPtr, paptqualifier: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetApartmentType(papttype.rawAddress.toCPointer<ByteVar>(), paptqualifier.rawAddress.toCPointer<ByteVar>())

public actual fun coGetCallContext(riid: ConstPtr, ppinterface: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetCallContext(riid.rawAddress.toCPointer<ByteVar>(), ppinterface.rawAddress.toCPointer<ByteVar>())

public actual fun coGetCallerTID(lpdwtid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetCallerTID(lpdwtid.rawAddress.toCPointer<ByteVar>())

public actual fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr, ppunk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetCancelObject(dwthreadid, iid.rawAddress.toCPointer<ByteVar>(), ppunk.rawAddress.toCPointer<ByteVar>())

public actual fun coGetClassObject(rclsid: ConstPtr, dwclscontext: UInt, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetClassObject(rclsid.rawAddress.toCPointer<ByteVar>(), dwclscontext, pvreserved.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun coGetContextToken(ptoken: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetContextToken(ptoken.rawAddress.toCPointer<ByteVar>())

public actual fun coGetCurrentLogicalThreadId(pguid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(pguid.rawAddress.toCPointer<ByteVar>())

public actual fun coGetCurrentProcess(): UInt =
    windowssysWindowsWin32SystemComCoGetCurrentProcess()

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetMalloc(dwmemcontext, ppmalloc.rawAddress.toCPointer<ByteVar>())

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetObject(pszname.rawAddress.toCPointer<ByteVar>(), pbindoptions.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun coGetObjectContext(riid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetObjectContext(riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun coGetPSClsid(riid: ConstPtr, pclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetPSClsid(riid.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(comsdtype, ppsd.rawAddress.toCPointer<ByteVar>())

public actual fun coGetTreatAsClass(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoGetTreatAsClass(clsidold.rawAddress.toCPointer<ByteVar>(), pclsidnew.rawAddress.toCPointer<ByteVar>())

public actual fun coImpersonateClient(): Hresult =
    windowssysWindowsWin32SystemComCoImpersonateClient()

public actual fun coIncrementMTAUsage(pcookie: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoIncrementMTAUsage(pcookie.rawAddress.toCPointer<ByteVar>())

public actual fun coInitialize(pvreserved: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoInitialize(pvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun coInitializeEx(pvreserved: ConstPtr, dwcoinit: UInt): Hresult =
    windowssysWindowsWin32SystemComCoInitializeEx(pvreserved.rawAddress.toCPointer<ByteVar>(), dwcoinit)

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr, preserved1: ConstPtr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr, dwcapabilities: UInt, preserved3: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoInitializeSecurity(psecdesc.rawAddress.toCPointer<ByteVar>(), cauthsvc, asauthsvc.rawAddress.toCPointer<ByteVar>(), preserved1.rawAddress.toCPointer<ByteVar>(), dwauthnlevel, dwimplevel, pauthlist.rawAddress.toCPointer<ByteVar>(), dwcapabilities, preserved3.rawAddress.toCPointer<ByteVar>())

public actual fun coInstall(pbc: MutPtr, dwflags: UInt, pclassspec: ConstPtr, pquery: ConstPtr, pszcodebase: Pcwstr): Hresult =
    windowssysWindowsWin32SystemComCoInstall(pbc.rawAddress.toCPointer<ByteVar>(), dwflags, pclassspec.rawAddress.toCPointer<ByteVar>(), pquery.rawAddress.toCPointer<ByteVar>(), pszcodebase.rawAddress.toCPointer<ByteVar>())

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(pszmachinename.rawAddress.toCPointer<ByteVar>())

public actual fun coIsHandlerConnected(punk: MutPtr): Bool =
    windowssysWindowsWin32SystemComCoIsHandlerConnected(punk.rawAddress.toCPointer<ByteVar>())

public actual fun coIsOle1Class(rclsid: ConstPtr): Bool =
    windowssysWindowsWin32SystemComCoIsOle1Class(rclsid.rawAddress.toCPointer<ByteVar>())

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    MutPtr(windowssysWindowsWin32SystemComCoLoadLibrary(lpszlibname.rawAddress.toCPointer<ByteVar>(), bautofree)?.toLong() ?: 0L)

public actual fun coLockObjectExternal(punk: MutPtr, flock: Bool, flastunlockreleases: Bool): Hresult =
    windowssysWindowsWin32SystemComCoLockObjectExternal(punk.rawAddress.toCPointer<ByteVar>(), flock, flastunlockreleases)

public actual fun coQueryAuthenticationServices(pcauthsvc: MutPtr, asauthsvc: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoQueryAuthenticationServices(pcauthsvc.rawAddress.toCPointer<ByteVar>(), asauthsvc.rawAddress.toCPointer<ByteVar>())

public actual fun coQueryClientBlanket(pauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pprivs: MutPtr, pcapabilities: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoQueryClientBlanket(pauthnsvc.rawAddress.toCPointer<ByteVar>(), pauthzsvc.rawAddress.toCPointer<ByteVar>(), pserverprincname.rawAddress.toCPointer<ByteVar>(), pauthnlevel.rawAddress.toCPointer<ByteVar>(), pimplevel.rawAddress.toCPointer<ByteVar>(), pprivs.rawAddress.toCPointer<ByteVar>(), pcapabilities.rawAddress.toCPointer<ByteVar>())

public actual fun coQueryProxyBlanket(pproxy: MutPtr, pwauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pauthinfo: MutPtr, pcapabilites: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoQueryProxyBlanket(pproxy.rawAddress.toCPointer<ByteVar>(), pwauthnsvc.rawAddress.toCPointer<ByteVar>(), pauthzsvc.rawAddress.toCPointer<ByteVar>(), pserverprincname.rawAddress.toCPointer<ByteVar>(), pauthnlevel.rawAddress.toCPointer<ByteVar>(), pimplevel.rawAddress.toCPointer<ByteVar>(), pauthinfo.rawAddress.toCPointer<ByteVar>(), pcapabilites.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterActivationFilter(pactivationfilter: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterActivationFilter(pactivationfilter.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterChannelHook(extensionuuid: ConstPtr, pchannelhook: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterChannelHook(extensionuuid.rawAddress.toCPointer<ByteVar>(), pchannelhook.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterClassObject(rclsid: ConstPtr, punk: MutPtr, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterClassObject(rclsid.rawAddress.toCPointer<ByteVar>(), punk.rawAddress.toCPointer<ByteVar>(), dwclscontext, flags, lpdwregister.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterDeviceCatalog(deviceinstanceid.rawAddress.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterInitializeSpy(pspy: MutPtr, pulicookie: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterInitializeSpy(pspy.rawAddress.toCPointer<ByteVar>(), pulicookie.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterMallocSpy(pmallocspy: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterMallocSpy(pmallocspy.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterPSClsid(riid: ConstPtr, rclsid: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterPSClsid(riid.rawAddress.toCPointer<ByteVar>(), rclsid.rawAddress.toCPointer<ByteVar>())

public actual fun coRegisterSurrogate(psurrogate: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoRegisterSurrogate(psurrogate.rawAddress.toCPointer<ByteVar>())

public actual fun coReleaseServerProcess(): UInt =
    windowssysWindowsWin32SystemComCoReleaseServerProcess()

public actual fun coResumeClassObjects(): Hresult =
    windowssysWindowsWin32SystemComCoResumeClassObjects()

public actual fun coRevertToSelf(): Hresult =
    windowssysWindowsWin32SystemComCoRevertToSelf()

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    windowssysWindowsWin32SystemComCoRevokeClassObject(dwregister)

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    windowssysWindowsWin32SystemComCoRevokeDeviceCatalog(cookie.rawAddress.toCPointer<ByteVar>())

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    windowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie)

public actual fun coRevokeMallocSpy(): Hresult =
    windowssysWindowsWin32SystemComCoRevokeMallocSpy()

public actual fun coSetCancelObject(punk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoSetCancelObject(punk.rawAddress.toCPointer<ByteVar>())

public actual fun coSetProxyBlanket(pproxy: MutPtr, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr, dwcapabilities: UInt): Hresult =
    windowssysWindowsWin32SystemComCoSetProxyBlanket(pproxy.rawAddress.toCPointer<ByteVar>(), dwauthnsvc, dwauthzsvc, pserverprincname.rawAddress.toCPointer<ByteVar>(), dwauthnlevel, dwimplevel, pauthinfo.rawAddress.toCPointer<ByteVar>(), dwcapabilities)

public actual fun coSuspendClassObjects(): Hresult =
    windowssysWindowsWin32SystemComCoSuspendClassObjects()

public actual fun coSwitchCallContext(pnewobject: MutPtr, ppoldobject: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoSwitchCallContext(pnewobject.rawAddress.toCPointer<ByteVar>(), ppoldobject.rawAddress.toCPointer<ByteVar>())

public actual fun coTaskMemAlloc(cb: ULong): MutPtr =
    MutPtr(windowssysWindowsWin32SystemComCoTaskMemAlloc(cb)?.toLong() ?: 0L)

public actual fun coTaskMemFree(pv: ConstPtr) {
    windowssysWindowsWin32SystemComCoTaskMemFree(pv.rawAddress.toCPointer<ByteVar>())
}

public actual fun coTaskMemRealloc(pv: ConstPtr, cb: ULong): MutPtr =
    MutPtr(windowssysWindowsWin32SystemComCoTaskMemRealloc(pv.rawAddress.toCPointer<ByteVar>(), cb)?.toLong() ?: 0L)

public actual fun coTestCancel(): Hresult =
    windowssysWindowsWin32SystemComCoTestCancel()

public actual fun coTreatAsClass(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    windowssysWindowsWin32SystemComCoTreatAsClass(clsidold.rawAddress.toCPointer<ByteVar>(), clsidnew.rawAddress.toCPointer<ByteVar>())

public actual fun coUninitialize() {
    windowssysWindowsWin32SystemComCoUninitialize()
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoWaitForMultipleHandles(dwflags, dwtimeout, chandles, phandles.rawAddress.toCPointer<ByteVar>(), lpdwindex.rawAddress.toCPointer<ByteVar>())

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCoWaitForMultipleObjects(dwflags, dwtimeout, chandles, phandles.rawAddress.toCPointer<ByteVar>(), lpdwindex.rawAddress.toCPointer<ByteVar>())

public actual fun createAntiMoniker(ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateAntiMoniker(ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createBindCtx(reserved: UInt, ppbc: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateBindCtx(reserved, ppbc.rawAddress.toCPointer<ByteVar>())

public actual fun createClassMoniker(rclsid: ConstPtr, ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateClassMoniker(rclsid.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createDataAdviseHolder(ppdaholder: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateDataAdviseHolder(ppdaholder.rawAddress.toCPointer<ByteVar>())

public actual fun createDataCache(punkouter: MutPtr, rclsid: ConstPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateDataCache(punkouter.rawAddress.toCPointer<ByteVar>(), rclsid.rawAddress.toCPointer<ByteVar>(), iid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateFileMoniker(lpszpathname.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createGenericComposite(pmkfirst: MutPtr, pmkrest: MutPtr, ppmkcomposite: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateGenericComposite(pmkfirst.rawAddress.toCPointer<ByteVar>(), pmkrest.rawAddress.toCPointer<ByteVar>(), ppmkcomposite.rawAddress.toCPointer<ByteVar>())

public actual fun createIUriBuilder(piuri: MutPtr, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateIUriBuilder(piuri.rawAddress.toCPointer<ByteVar>(), dwflags, dwreserved, ppiuribuilder.rawAddress.toCPointer<ByteVar>())

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateItemMoniker(lpszdelim.rawAddress.toCPointer<ByteVar>(), lpszitem.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createObjrefMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateObjrefMoniker(punk.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createPointerMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreatePointerMoniker(punk.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr, ppibsc: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateStdProgressIndicator(hwndparent.rawAddress.toCPointer<ByteVar>(), psztitle.rawAddress.toCPointer<ByteVar>(), pibsccaller.rawAddress.toCPointer<ByteVar>(), ppibsc.rawAddress.toCPointer<ByteVar>())

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateUri(pwzuri.rawAddress.toCPointer<ByteVar>(), dwflags, dwreserved, ppuri.rawAddress.toCPointer<ByteVar>())

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateUriFromMultiByteString(pszansiinputuri.rawAddress.toCPointer<ByteVar>(), dwencodingflags, dwcodepage, dwcreateflags, dwreserved, ppuri.rawAddress.toCPointer<ByteVar>())

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    windowssysWindowsWin32SystemComCreateUriWithFragment(pwzuri.rawAddress.toCPointer<ByteVar>(), pwzfragment.rawAddress.toCPointer<ByteVar>(), dwflags, dwreserved, ppuri.rawAddress.toCPointer<ByteVar>())

public actual fun dcomChannelSetHResult(pvreserved: ConstPtr, pulreserved: ConstPtr, appshr: Hresult): Hresult =
    windowssysWindowsWin32SystemComDcomChannelSetHResult(pvreserved.rawAddress.toCPointer<ByteVar>(), pulreserved.rawAddress.toCPointer<ByteVar>(), appshr)

public actual fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComGetClassFile(szfilename.rawAddress.toCPointer<ByteVar>(), pclsid.rawAddress.toCPointer<ByteVar>())

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr): Hresult =
    windowssysWindowsWin32SystemComGetErrorInfo(dwreserved, pperrinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getRunningObjectTable(reserved: UInt, pprot: MutPtr): Hresult =
    windowssysWindowsWin32SystemComGetRunningObjectTable(reserved, pprot.rawAddress.toCPointer<ByteVar>())

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComIIDFromString(lpsz.rawAddress.toCPointer<ByteVar>(), lpiid.rawAddress.toCPointer<ByteVar>())

public actual fun mkParseDisplayName(pbc: MutPtr, szusername: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    windowssysWindowsWin32SystemComMkParseDisplayName(pbc.rawAddress.toCPointer<ByteVar>(), szusername.rawAddress.toCPointer<ByteVar>(), pcheaten.rawAddress.toCPointer<ByteVar>(), ppmk.rawAddress.toCPointer<ByteVar>())

public actual fun monikerCommonPrefixWith(pmkthis: MutPtr, pmkother: MutPtr, ppmkcommon: MutPtr): Hresult =
    windowssysWindowsWin32SystemComMonikerCommonPrefixWith(pmkthis.rawAddress.toCPointer<ByteVar>(), pmkother.rawAddress.toCPointer<ByteVar>(), ppmkcommon.rawAddress.toCPointer<ByteVar>())

public actual fun monikerRelativePathTo(pmksrc: MutPtr, pmkdest: MutPtr, ppmkrelpath: MutPtr, dwreserved: Bool): Hresult =
    windowssysWindowsWin32SystemComMonikerRelativePathTo(pmksrc.rawAddress.toCPointer<ByteVar>(), pmkdest.rawAddress.toCPointer<ByteVar>(), ppmkrelpath.rawAddress.toCPointer<ByteVar>(), dwreserved)

public actual fun progIDFromCLSID(clsid: ConstPtr, lplpszprogid: MutPtr): Hresult =
    windowssysWindowsWin32SystemComProgIDFromCLSID(clsid.rawAddress.toCPointer<ByteVar>(), lplpszprogid.rawAddress.toCPointer<ByteVar>())

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr): Hresult =
    windowssysWindowsWin32SystemComSetErrorInfo(dwreserved, perrinfo.rawAddress.toCPointer<ByteVar>())

public actual fun stringFromCLSID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStringFromCLSID(rclsid.rawAddress.toCPointer<ByteVar>(), lplpsz.rawAddress.toCPointer<ByteVar>())

public actual fun stringFromGUID2(rguid: ConstPtr, lpsz: Pwstr, cchmax: Int): Int =
    windowssysWindowsWin32SystemComStringFromGUID2(rguid.rawAddress.toCPointer<ByteVar>(), lpsz.rawAddress.toCPointer<ByteVar>(), cchmax)

public actual fun stringFromIID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    windowssysWindowsWin32SystemComStringFromIID(rclsid.rawAddress.toCPointer<ByteVar>(), lplpsz.rawAddress.toCPointer<ByteVar>())
