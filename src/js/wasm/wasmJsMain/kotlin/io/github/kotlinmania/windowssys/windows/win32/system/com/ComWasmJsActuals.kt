@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemComNapiAddon(): Boolean

private val windowsWin32SystemComNapiAvailable: Boolean = initWindowsWin32SystemComNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComBindMoniker(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComBindMoniker(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCLSIDFromProgID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCLSIDFromProgID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCLSIDFromProgIDEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCLSIDFromProgIDEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCLSIDFromString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCLSIDFromString(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoAddRefServerProcess()")
private external fun wasmWindowssysWindowsWin32SystemComCoAddRefServerProcess(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoAllowSetForegroundWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoAllowSetForegroundWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoBuildVersion()")
private external fun wasmWindowssysWindowsWin32SystemComCoBuildVersion(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCancelCall(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoCancelCall(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCopyProxy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoCopyProxy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCreateGuid(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoCreateGuid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCreateInstance(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCoCreateInstance(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCreateInstanceEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComCoCreateInstanceEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoCreateInstanceFromApp(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComCoCreateInstanceFromApp(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoDecrementMTAUsage(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoDecrementMTAUsage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoDisableCallCancellation(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoDisableCallCancellation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoDisconnectContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoDisconnectContext(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoDisconnectObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoDisconnectObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoDosDateTimeToFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComCoDosDateTimeToFileTime(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoEnableCallCancellation(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoEnableCallCancellation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoFileTimeNow(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoFileTimeNow(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoFileTimeToDosDateTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComCoFileTimeToDosDateTime(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoFreeAllLibraries()")
private external fun wasmWindowssysWindowsWin32SystemComCoFreeAllLibraries()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoFreeLibrary(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoFreeLibrary(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoFreeUnusedLibraries()")
private external fun wasmWindowssysWindowsWin32SystemComCoFreeUnusedLibraries()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetApartmentType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetApartmentType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetCallContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetCallContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetCallerTID(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetCallerTID(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetCancelObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetCancelObject(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetClassObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetClassObject(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetContextToken(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetContextToken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetCurrentProcess()")
private external fun wasmWindowssysWindowsWin32SystemComCoGetCurrentProcess(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetMalloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetMalloc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetObject(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetObjectContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetObjectContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetPSClsid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetPSClsid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoGetTreatAsClass(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoGetTreatAsClass(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoImpersonateClient()")
private external fun wasmWindowssysWindowsWin32SystemComCoImpersonateClient(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoIncrementMTAUsage(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoIncrementMTAUsage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoInitialize(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoInitialize(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoInitializeEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoInitializeEx(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoInitializeSecurity(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemComCoInitializeSecurity(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoInstall(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCoInstall(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoIsHandlerConnected(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoIsHandlerConnected(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoIsOle1Class(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoIsOle1Class(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoLoadLibrary(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoLoadLibrary(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoLockObjectExternal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComCoLockObjectExternal(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoQueryAuthenticationServices(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoQueryAuthenticationServices(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoQueryClientBlanket(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemComCoQueryClientBlanket(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoQueryProxyBlanket(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComCoQueryProxyBlanket(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterActivationFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterActivationFilter(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterChannelHook(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterChannelHook(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterClassObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterClassObject(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterDeviceCatalog(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterDeviceCatalog(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterInitializeSpy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterInitializeSpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterMallocSpy(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterMallocSpy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterPSClsid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterPSClsid(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRegisterSurrogate(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoRegisterSurrogate(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoReleaseServerProcess()")
private external fun wasmWindowssysWindowsWin32SystemComCoReleaseServerProcess(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoResumeClassObjects()")
private external fun wasmWindowssysWindowsWin32SystemComCoResumeClassObjects(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRevertToSelf()")
private external fun wasmWindowssysWindowsWin32SystemComCoRevertToSelf(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRevokeClassObject(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoRevokeClassObject(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRevokeDeviceCatalog(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoRevokeDeviceCatalog(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRevokeInitializeSpy(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoRevokeInitializeSpy(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoRevokeMallocSpy()")
private external fun wasmWindowssysWindowsWin32SystemComCoRevokeMallocSpy(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoSetCancelObject(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoSetCancelObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoSetProxyBlanket(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemComCoSetProxyBlanket(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoSuspendClassObjects()")
private external fun wasmWindowssysWindowsWin32SystemComCoSuspendClassObjects(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoSwitchCallContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoSwitchCallContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoTaskMemAlloc(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoTaskMemAlloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoTaskMemFree(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCoTaskMemFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoTaskMemRealloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoTaskMemRealloc(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoTestCancel()")
private external fun wasmWindowssysWindowsWin32SystemComCoTestCancel(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoTreatAsClass(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCoTreatAsClass(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoUninitialize()")
private external fun wasmWindowssysWindowsWin32SystemComCoUninitialize()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoWaitForMultipleHandles(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCoWaitForMultipleHandles(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCoWaitForMultipleObjects(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCoWaitForMultipleObjects(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateAntiMoniker(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCreateAntiMoniker(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateBindCtx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCreateBindCtx(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateClassMoniker(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCreateClassMoniker(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateDataAdviseHolder(p0)")
private external fun wasmWindowssysWindowsWin32SystemComCreateDataAdviseHolder(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateDataCache(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComCreateDataCache(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateFileMoniker(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCreateFileMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateGenericComposite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComCreateGenericComposite(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateIUriBuilder(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComCreateIUriBuilder(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateItemMoniker(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComCreateItemMoniker(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateObjrefMoniker(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCreateObjrefMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreatePointerMoniker(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComCreatePointerMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateStdProgressIndicator(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComCreateStdProgressIndicator(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateUri(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComCreateUri(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateUriFromMultiByteString(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemComCreateUriFromMultiByteString(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComCreateUriWithFragment(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemComCreateUriWithFragment(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComDcomChannelSetHResult(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComDcomChannelSetHResult(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComGetClassFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComGetClassFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComGetErrorInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComGetErrorInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComGetRunningObjectTable(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComGetRunningObjectTable(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComIIDFromString(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComIIDFromString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMkParseDisplayName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComMkParseDisplayName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMonikerCommonPrefixWith(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComMonikerCommonPrefixWith(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComMonikerRelativePathTo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemComMonikerRelativePathTo(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComProgIDFromCLSID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComProgIDFromCLSID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComSetErrorInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComSetErrorInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStringFromCLSID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStringFromCLSID(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStringFromGUID2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComStringFromGUID2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComStringFromIID(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComStringFromIID(p0: String, p1: String): Int

public actual fun bindMoniker(pmk: MutPtr, grfopt: UInt, iidresult: ConstPtr, ppvresult: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComBindMoniker(pmk.rawAddress.toString(), grfopt.toInt(), iidresult.rawAddress.toString(), ppvresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCLSIDFromProgID(lpszprogid.rawAddress.toString(), lpclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCLSIDFromProgIDEx(lpszprogid.rawAddress.toString(), lpclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCLSIDFromString(lpsz.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAddRefServerProcess(): UInt =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoAddRefServerProcess().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAllowSetForegroundWindow(punk: MutPtr, lpvreserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoAllowSetForegroundWindow(punk.rawAddress.toString(), lpvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAllowUnmarshalerCLSID(clsid: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoAllowUnmarshalerCLSID(clsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coBuildVersion(): UInt =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoBuildVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCancelCall(dwthreadid.toInt(), ultimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCopyProxy(pproxy: MutPtr, ppcopy: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCopyProxy(pproxy.rawAddress.toString(), ppcopy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateFreeThreadedMarshaler(punkouter: MutPtr, ppunkmarshal: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCreateFreeThreadedMarshaler(punkouter.rawAddress.toString(), ppunkmarshal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateGuid(pguid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCreateGuid(pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstance(rclsid: ConstPtr, punkouter: MutPtr, dwclscontext: Clsctx, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCreateInstance(rclsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclscontext.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstanceEx(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, pserverinfo: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCreateInstanceEx(clsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), pserverinfo.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstanceFromApp(clsid: ConstPtr, punkouter: MutPtr, dwclsctx: Clsctx, reserved: ConstPtr, dwcount: UInt, presults: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoCreateInstanceFromApp(clsid.rawAddress.toString(), punkouter.rawAddress.toString(), dwclsctx.toInt(), reserved.rawAddress.toString(), dwcount.toInt(), presults.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoDecrementMTAUsage(cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisableCallCancellation(preserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoDisableCallCancellation(preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoDisconnectContext(dwtimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisconnectObject(punk: MutPtr, dwreserved: UInt): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoDisconnectObject(punk.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: MutPtr): Bool =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoDosDateTimeToFileTime(ndosdate.toInt(), ndostime.toInt(), lpfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnableCallCancellation(preserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoEnableCallCancellation(preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFileTimeNow(lpfiletime: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoFileTimeNow(lpfiletime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFileTimeToDosDateTime(lpfiletime: ConstPtr, lpdosdate: MutPtr, lpdostime: MutPtr): Bool =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoFileTimeToDosDateTime(lpfiletime.rawAddress.toString(), lpdosdate.rawAddress.toString(), lpdostime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFreeAllLibraries() {
    if (windowsWin32SystemComNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComCoFreeAllLibraries()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    if (windowsWin32SystemComNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComCoFreeLibrary(hinst.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeUnusedLibraries() {
    if (windowsWin32SystemComNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComCoFreeUnusedLibraries()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    if (windowsWin32SystemComNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComCoFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetApartmentType(papttype: MutPtr, paptqualifier: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetApartmentType(papttype.rawAddress.toString(), paptqualifier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCallContext(riid: ConstPtr, ppinterface: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetCallContext(riid.rawAddress.toString(), ppinterface.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCallerTID(lpdwtid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetCallerTID(lpdwtid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCancelObject(dwthreadid: UInt, iid: ConstPtr, ppunk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetCancelObject(dwthreadid.toInt(), iid.rawAddress.toString(), ppunk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetClassObject(rclsid: ConstPtr, dwclscontext: UInt, pvreserved: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetClassObject(rclsid.rawAddress.toString(), dwclscontext.toInt(), pvreserved.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetContextToken(ptoken: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetContextToken(ptoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCurrentLogicalThreadId(pguid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetCurrentLogicalThreadId(pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCurrentProcess(): UInt =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetCurrentProcess().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetMalloc(dwmemcontext.toInt(), ppmalloc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: ConstPtr, riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetObject(pszname.rawAddress.toString(), pbindoptions.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetObjectContext(riid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetObjectContext(riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetPSClsid(riid: ConstPtr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetPSClsid(riid.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetSystemSecurityPermissions(comsdtype, ppsd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetTreatAsClass(clsidold: ConstPtr, pclsidnew: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoGetTreatAsClass(clsidold.rawAddress.toString(), pclsidnew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coImpersonateClient(): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoImpersonateClient() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIncrementMTAUsage(pcookie: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoIncrementMTAUsage(pcookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitialize(pvreserved: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoInitialize(pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitializeEx(pvreserved: ConstPtr, dwcoinit: UInt): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoInitializeEx(pvreserved.rawAddress.toString(), dwcoinit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: ConstPtr, preserved1: ConstPtr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: ConstPtr, dwcapabilities: UInt, preserved3: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoInitializeSecurity(psecdesc.rawAddress.toString(), cauthsvc, asauthsvc.rawAddress.toString(), preserved1.rawAddress.toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), pauthlist.rawAddress.toString(), dwcapabilities.toInt(), preserved3.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInstall(pbc: MutPtr, dwflags: UInt, pclassspec: ConstPtr, pquery: ConstPtr, pszcodebase: Pcwstr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoInstall(pbc.rawAddress.toString(), dwflags.toInt(), pclassspec.rawAddress.toString(), pquery.rawAddress.toString(), pszcodebase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoInvalidateRemoteMachineBindings(pszmachinename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIsHandlerConnected(punk: MutPtr): Bool =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoIsHandlerConnected(punk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIsOle1Class(rclsid: ConstPtr): Bool =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoIsOle1Class(rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    if (windowsWin32SystemComNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComCoLoadLibrary(lpszlibname.rawAddress.toString(), bautofree).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLockObjectExternal(punk: MutPtr, flock: Bool, flastunlockreleases: Bool): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoLockObjectExternal(punk.rawAddress.toString(), flock, flastunlockreleases) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryAuthenticationServices(pcauthsvc: MutPtr, asauthsvc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoQueryAuthenticationServices(pcauthsvc.rawAddress.toString(), asauthsvc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryClientBlanket(pauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pprivs: MutPtr, pcapabilities: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoQueryClientBlanket(pauthnsvc.rawAddress.toString(), pauthzsvc.rawAddress.toString(), pserverprincname.rawAddress.toString(), pauthnlevel.rawAddress.toString(), pimplevel.rawAddress.toString(), pprivs.rawAddress.toString(), pcapabilities.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryProxyBlanket(pproxy: MutPtr, pwauthnsvc: MutPtr, pauthzsvc: MutPtr, pserverprincname: MutPtr, pauthnlevel: MutPtr, pimplevel: MutPtr, pauthinfo: MutPtr, pcapabilites: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoQueryProxyBlanket(pproxy.rawAddress.toString(), pwauthnsvc.rawAddress.toString(), pauthzsvc.rawAddress.toString(), pserverprincname.rawAddress.toString(), pauthnlevel.rawAddress.toString(), pimplevel.rawAddress.toString(), pauthinfo.rawAddress.toString(), pcapabilites.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterActivationFilter(pactivationfilter: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterActivationFilter(pactivationfilter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterChannelHook(extensionuuid: ConstPtr, pchannelhook: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterChannelHook(extensionuuid.rawAddress.toString(), pchannelhook.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterClassObject(rclsid: ConstPtr, punk: MutPtr, dwclscontext: Clsctx, flags: UInt, lpdwregister: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterClassObject(rclsid.rawAddress.toString(), punk.rawAddress.toString(), dwclscontext.toInt(), flags.toInt(), lpdwregister.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterDeviceCatalog(deviceinstanceid.rawAddress.toString(), cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterInitializeSpy(pspy: MutPtr, pulicookie: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterInitializeSpy(pspy.rawAddress.toString(), pulicookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterMallocSpy(pmallocspy: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterMallocSpy(pmallocspy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterPSClsid(riid: ConstPtr, rclsid: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterPSClsid(riid.rawAddress.toString(), rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterSurrogate(psurrogate: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRegisterSurrogate(psurrogate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coReleaseServerProcess(): UInt =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoReleaseServerProcess().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coResumeClassObjects(): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoResumeClassObjects() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevertToSelf(): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRevertToSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRevokeClassObject(dwregister.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRevokeDeviceCatalog(cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRevokeInitializeSpy(ulicookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeMallocSpy(): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoRevokeMallocSpy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSetCancelObject(punk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoSetCancelObject(punk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSetProxyBlanket(pproxy: MutPtr, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: ConstPtr, dwcapabilities: UInt): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoSetProxyBlanket(pproxy.rawAddress.toString(), dwauthnsvc.toInt(), dwauthzsvc.toInt(), pserverprincname.rawAddress.toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), pauthinfo.rawAddress.toString(), dwcapabilities.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSuspendClassObjects(): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoSuspendClassObjects() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSwitchCallContext(pnewobject: MutPtr, ppoldobject: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoSwitchCallContext(pnewobject.rawAddress.toString(), ppoldobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTaskMemAlloc(cb: ULong): MutPtr =
    if (windowsWin32SystemComNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComCoTaskMemAlloc(cb.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTaskMemFree(pv: ConstPtr) {
    if (windowsWin32SystemComNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComCoTaskMemFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coTaskMemRealloc(pv: ConstPtr, cb: ULong): MutPtr =
    if (windowsWin32SystemComNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComCoTaskMemRealloc(pv.rawAddress.toString(), cb.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTestCancel(): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoTestCancel() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTreatAsClass(clsidold: ConstPtr, clsidnew: ConstPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoTreatAsClass(clsidold.rawAddress.toString(), clsidnew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUninitialize() {
    if (windowsWin32SystemComNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComCoUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.rawAddress.toString(), lpdwindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: ConstPtr, lpdwindex: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCoWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), phandles.rawAddress.toString(), lpdwindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAntiMoniker(ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateAntiMoniker(ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBindCtx(reserved: UInt, ppbc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateBindCtx(reserved.toInt(), ppbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClassMoniker(rclsid: ConstPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateClassMoniker(rclsid.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDataAdviseHolder(ppdaholder: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateDataAdviseHolder(ppdaholder.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDataCache(punkouter: MutPtr, rclsid: ConstPtr, iid: ConstPtr, ppv: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateDataCache(punkouter.rawAddress.toString(), rclsid.rawAddress.toString(), iid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateFileMoniker(lpszpathname.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createGenericComposite(pmkfirst: MutPtr, pmkrest: MutPtr, ppmkcomposite: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateGenericComposite(pmkfirst.rawAddress.toString(), pmkrest.rawAddress.toString(), ppmkcomposite.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIUriBuilder(piuri: MutPtr, dwflags: UInt, dwreserved: ULong, ppiuribuilder: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateIUriBuilder(piuri.rawAddress.toString(), dwflags.toInt(), dwreserved.toString(), ppiuribuilder.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateItemMoniker(lpszdelim.rawAddress.toString(), lpszitem.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createObjrefMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateObjrefMoniker(punk.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPointerMoniker(punk: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreatePointerMoniker(punk.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: MutPtr, ppibsc: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateStdProgressIndicator(hwndparent.rawAddress.toString(), psztitle.rawAddress.toString(), pibsccaller.rawAddress.toString(), ppibsc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateUri(pwzuri.rawAddress.toString(), dwflags.toInt(), dwreserved.toString(), ppuri.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateUriFromMultiByteString(pszansiinputuri.rawAddress.toString(), dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toString(), ppuri.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComCreateUriWithFragment(pwzuri.rawAddress.toString(), pwzfragment.rawAddress.toString(), dwflags.toInt(), dwreserved.toString(), ppuri.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dcomChannelSetHResult(pvreserved: ConstPtr, pulreserved: ConstPtr, appshr: Hresult): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComDcomChannelSetHResult(pvreserved.rawAddress.toString(), pulreserved.rawAddress.toString(), appshr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFile(szfilename: Pcwstr, pclsid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComGetClassFile(szfilename.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComGetErrorInfo(dwreserved.toInt(), pperrinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRunningObjectTable(reserved: UInt, pprot: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComGetRunningObjectTable(reserved.toInt(), pprot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComIIDFromString(lpsz.rawAddress.toString(), lpiid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayName(pbc: MutPtr, szusername: Pcwstr, pcheaten: MutPtr, ppmk: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComMkParseDisplayName(pbc.rawAddress.toString(), szusername.rawAddress.toString(), pcheaten.rawAddress.toString(), ppmk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monikerCommonPrefixWith(pmkthis: MutPtr, pmkother: MutPtr, ppmkcommon: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComMonikerCommonPrefixWith(pmkthis.rawAddress.toString(), pmkother.rawAddress.toString(), ppmkcommon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monikerRelativePathTo(pmksrc: MutPtr, pmkdest: MutPtr, ppmkrelpath: MutPtr, dwreserved: Bool): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComMonikerRelativePathTo(pmksrc.rawAddress.toString(), pmkdest.rawAddress.toString(), ppmkrelpath.rawAddress.toString(), dwreserved) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun progIDFromCLSID(clsid: ConstPtr, lplpszprogid: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComProgIDFromCLSID(clsid.rawAddress.toString(), lplpszprogid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComSetErrorInfo(dwreserved.toInt(), perrinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromCLSID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComStringFromCLSID(rclsid.rawAddress.toString(), lplpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromGUID2(rguid: ConstPtr, lpsz: Pwstr, cchmax: Int): Int =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComStringFromGUID2(rguid.rawAddress.toString(), lpsz.rawAddress.toString(), cchmax) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromIID(rclsid: ConstPtr, lplpsz: MutPtr): Hresult =
    if (windowsWin32SystemComNapiAvailable) wasmWindowssysWindowsWin32SystemComStringFromIID(rclsid.rawAddress.toString(), lplpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
