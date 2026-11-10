@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemComNapiAddon(): Boolean

private val _windowsWin32SystemComNapiAvailable: Boolean = _initWindowsWin32SystemComNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_bindMoniker(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_bindMoniker(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_cLSIDFromProgID(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_cLSIDFromProgID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_cLSIDFromProgIDEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_cLSIDFromProgIDEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_cLSIDFromString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_cLSIDFromString(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coAddRefServerProcess()")
private external fun _wasm_windowssys_windows_win32_system_com_coAddRefServerProcess(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coAllowSetForegroundWindow(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coAllowSetForegroundWindow(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coBuildVersion()")
private external fun _wasm_windowssys_windows_win32_system_com_coBuildVersion(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCancelCall(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coCancelCall(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCopyProxy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coCopyProxy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCreateGuid(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coCreateGuid(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCreateInstance(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_coCreateInstance(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCreateInstanceEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_com_coCreateInstanceEx(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coCreateInstanceFromApp(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_com_coCreateInstanceFromApp(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coDecrementMTAUsage(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coDecrementMTAUsage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coDisableCallCancellation(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coDisableCallCancellation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coDisconnectContext(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coDisconnectContext(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coDisconnectObject(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coDisconnectObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coDosDateTimeToFileTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_coDosDateTimeToFileTime(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coEnableCallCancellation(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coEnableCallCancellation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coFileTimeNow(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coFileTimeNow(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coFileTimeToDosDateTime(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_coFileTimeToDosDateTime(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coFreeAllLibraries()")
private external fun _wasm_windowssys_windows_win32_system_com_coFreeAllLibraries()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coFreeLibrary(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coFreeLibrary(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coFreeUnusedLibraries()")
private external fun _wasm_windowssys_windows_win32_system_com_coFreeUnusedLibraries()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(p0: Int, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetApartmentType(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetApartmentType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetCallContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetCallContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetCallerTID(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetCallerTID(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetCancelObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetCancelObject(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetClassObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetClassObject(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetContextToken(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetContextToken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetCurrentProcess()")
private external fun _wasm_windowssys_windows_win32_system_com_coGetCurrentProcess(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetMalloc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetMalloc(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetObject(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetObject(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetObjectContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetObjectContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetPSClsid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetPSClsid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coGetTreatAsClass(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coGetTreatAsClass(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coImpersonateClient()")
private external fun _wasm_windowssys_windows_win32_system_com_coImpersonateClient(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coIncrementMTAUsage(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coIncrementMTAUsage(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coInitialize(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coInitialize(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coInitializeEx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coInitializeEx(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coInitializeSecurity(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_system_com_coInitializeSecurity(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coInstall(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_coInstall(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coIsHandlerConnected(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coIsHandlerConnected(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coIsOle1Class(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coIsOle1Class(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coLoadLibrary(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coLoadLibrary(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coLockObjectExternal(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_coLockObjectExternal(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coQueryAuthenticationServices(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coQueryAuthenticationServices(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coQueryClientBlanket(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_system_com_coQueryClientBlanket(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coQueryProxyBlanket(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_com_coQueryProxyBlanket(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterActivationFilter(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterActivationFilter(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterChannelHook(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterChannelHook(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterClassObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterClassObject(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterDeviceCatalog(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterDeviceCatalog(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterInitializeSpy(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterInitializeSpy(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterMallocSpy(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterMallocSpy(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterPSClsid(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterPSClsid(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRegisterSurrogate(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coRegisterSurrogate(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coReleaseServerProcess()")
private external fun _wasm_windowssys_windows_win32_system_com_coReleaseServerProcess(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coResumeClassObjects()")
private external fun _wasm_windowssys_windows_win32_system_com_coResumeClassObjects(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRevertToSelf()")
private external fun _wasm_windowssys_windows_win32_system_com_coRevertToSelf(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRevokeClassObject(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coRevokeClassObject(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRevokeDeviceCatalog(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coRevokeDeviceCatalog(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRevokeInitializeSpy(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coRevokeInitializeSpy(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coRevokeMallocSpy()")
private external fun _wasm_windowssys_windows_win32_system_com_coRevokeMallocSpy(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coSetCancelObject(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coSetCancelObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coSetProxyBlanket(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_system_com_coSetProxyBlanket(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coSuspendClassObjects()")
private external fun _wasm_windowssys_windows_win32_system_com_coSuspendClassObjects(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coSwitchCallContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coSwitchCallContext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coTaskMemAlloc(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coTaskMemAlloc(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coTaskMemFree(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_coTaskMemFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coTaskMemRealloc(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coTaskMemRealloc(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coTestCancel()")
private external fun _wasm_windowssys_windows_win32_system_com_coTestCancel(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coTreatAsClass(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_coTreatAsClass(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coUninitialize()")
private external fun _wasm_windowssys_windows_win32_system_com_coUninitialize()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coWaitForMultipleHandles(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_coWaitForMultipleHandles(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_coWaitForMultipleObjects(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_coWaitForMultipleObjects(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createAntiMoniker(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_createAntiMoniker(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createBindCtx(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_createBindCtx(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createClassMoniker(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_createClassMoniker(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createDataAdviseHolder(p0)")
private external fun _wasm_windowssys_windows_win32_system_com_createDataAdviseHolder(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createDataCache(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_createDataCache(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createFileMoniker(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_createFileMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createGenericComposite(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_createGenericComposite(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createIUriBuilder(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_createIUriBuilder(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createItemMoniker(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_createItemMoniker(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createObjrefMoniker(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_createObjrefMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createPointerMoniker(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_createPointerMoniker(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createStdProgressIndicator(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_createStdProgressIndicator(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createUri(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_createUri(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createUriFromMultiByteString(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_com_createUriFromMultiByteString(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_createUriWithFragment(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_com_createUriWithFragment(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_dcomChannelSetHResult(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_dcomChannelSetHResult(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_getClassFile(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_getClassFile(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_getErrorInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_getErrorInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_getRunningObjectTable(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_getRunningObjectTable(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_iIDFromString(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_iIDFromString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_mkParseDisplayName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_mkParseDisplayName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_monikerCommonPrefixWith(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_monikerCommonPrefixWith(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_monikerRelativePathTo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_com_monikerRelativePathTo(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_progIDFromCLSID(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_progIDFromCLSID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_setErrorInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_setErrorInfo(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_stringFromCLSID(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_stringFromCLSID(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_stringFromGUID2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_com_stringFromGUID2(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_com_stringFromIID(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_com_stringFromIID(p0: String, p1: String): Int

public actual fun bindMoniker(pmk: COpaquePointer?, grfopt: UInt, iidresult: COpaquePointer?, ppvresult: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_bindMoniker((pmk?.value ?: 0L).toString(), grfopt.toInt(), (iidresult?.value ?: 0L).toString(), (ppvresult?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromProgID(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_cLSIDFromProgID((lpszprogid?.value ?: 0L).toString(), (lpclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromProgIDEx(lpszprogid: Pcwstr, lpclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_cLSIDFromProgIDEx((lpszprogid?.value ?: 0L).toString(), (lpclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cLSIDFromString(lpsz: Pcwstr, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_cLSIDFromString((lpsz?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAddRefServerProcess(): UInt =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coAddRefServerProcess().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAllowSetForegroundWindow(punk: COpaquePointer?, lpvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coAllowSetForegroundWindow((punk?.value ?: 0L).toString(), (lpvreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coAllowUnmarshalerCLSID(clsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coAllowUnmarshalerCLSID((clsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coBuildVersion(): UInt =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coBuildVersion().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCancelCall(dwthreadid: UInt, ultimeout: UInt): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCancelCall(dwthreadid.toInt(), ultimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCopyProxy(pproxy: COpaquePointer?, ppcopy: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCopyProxy((pproxy?.value ?: 0L).toString(), (ppcopy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateFreeThreadedMarshaler(punkouter: COpaquePointer?, ppunkmarshal: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCreateFreeThreadedMarshaler((punkouter?.value ?: 0L).toString(), (ppunkmarshal?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateGuid(pguid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCreateGuid((pguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstance(rclsid: COpaquePointer?, punkouter: COpaquePointer?, dwclscontext: Clsctx, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCreateInstance((rclsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), dwclscontext.toInt(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstanceEx(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, pserverinfo: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCreateInstanceEx((clsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), dwclsctx.toInt(), (pserverinfo?.value ?: 0L).toString(), dwcount.toInt(), (presults?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coCreateInstanceFromApp(clsid: COpaquePointer?, punkouter: COpaquePointer?, dwclsctx: Clsctx, reserved: COpaquePointer?, dwcount: UInt, presults: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coCreateInstanceFromApp((clsid?.value ?: 0L).toString(), (punkouter?.value ?: 0L).toString(), dwclsctx.toInt(), (reserved?.value ?: 0L).toString(), dwcount.toInt(), (presults?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDecrementMTAUsage(cookie: CoMtaUsageCookie): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coDecrementMTAUsage((cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisableCallCancellation(preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coDisableCallCancellation((preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisconnectContext(dwtimeout: UInt): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coDisconnectContext(dwtimeout.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDisconnectObject(punk: COpaquePointer?, dwreserved: UInt): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coDisconnectObject((punk?.value ?: 0L).toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coDosDateTimeToFileTime(ndosdate: UShort, ndostime: UShort, lpfiletime: COpaquePointer?): Bool =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coDosDateTimeToFileTime(ndosdate.toInt(), ndostime.toInt(), (lpfiletime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnableCallCancellation(preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coEnableCallCancellation((preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFileTimeNow(lpfiletime: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coFileTimeNow((lpfiletime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFileTimeToDosDateTime(lpfiletime: COpaquePointer?, lpdosdate: COpaquePointer?, lpdostime: COpaquePointer?): Bool =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coFileTimeToDosDateTime((lpfiletime?.value ?: 0L).toString(), (lpdosdate?.value ?: 0L).toString(), (lpdostime?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coFreeAllLibraries() {
    if (_windowsWin32SystemComNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_coFreeAllLibraries()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeLibrary(hinst: Hinstance) {
    if (_windowsWin32SystemComNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_coFreeLibrary((hinst?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeUnusedLibraries() {
    if (_windowsWin32SystemComNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_coFreeUnusedLibraries()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coFreeUnusedLibrariesEx(dwunloaddelay: UInt, dwreserved: UInt) {
    if (_windowsWin32SystemComNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_coFreeUnusedLibrariesEx(dwunloaddelay.toInt(), dwreserved.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coGetApartmentType(papttype: COpaquePointer?, paptqualifier: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetApartmentType((papttype?.value ?: 0L).toString(), (paptqualifier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCallContext(riid: COpaquePointer?, ppinterface: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetCallContext((riid?.value ?: 0L).toString(), (ppinterface?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCallerTID(lpdwtid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetCallerTID((lpdwtid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCancelObject(dwthreadid: UInt, iid: COpaquePointer?, ppunk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetCancelObject(dwthreadid.toInt(), (iid?.value ?: 0L).toString(), (ppunk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetClassObject(rclsid: COpaquePointer?, dwclscontext: UInt, pvreserved: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetClassObject((rclsid?.value ?: 0L).toString(), dwclscontext.toInt(), (pvreserved?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetContextToken(ptoken: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetContextToken((ptoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCurrentLogicalThreadId(pguid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetCurrentLogicalThreadId((pguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetCurrentProcess(): UInt =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetCurrentProcess().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetMalloc(dwmemcontext: UInt, ppmalloc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetMalloc(dwmemcontext.toInt(), (ppmalloc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetObject(pszname: Pcwstr, pbindoptions: COpaquePointer?, riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetObject((pszname?.value ?: 0L).toString(), (pbindoptions?.value ?: 0L).toString(), (riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetObjectContext(riid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetObjectContext((riid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetPSClsid(riid: COpaquePointer?, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetPSClsid((riid?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetSystemSecurityPermissions(comsdtype: Comsd, ppsd: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetSystemSecurityPermissions(comsdtype, (ppsd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetTreatAsClass(clsidold: COpaquePointer?, pclsidnew: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coGetTreatAsClass((clsidold?.value ?: 0L).toString(), (pclsidnew?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coImpersonateClient(): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coImpersonateClient() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIncrementMTAUsage(pcookie: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coIncrementMTAUsage((pcookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitialize(pvreserved: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coInitialize((pvreserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitializeEx(pvreserved: COpaquePointer?, dwcoinit: UInt): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coInitializeEx((pvreserved?.value ?: 0L).toString(), dwcoinit.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInitializeSecurity(psecdesc: PsecurityDescriptor, cauthsvc: Int, asauthsvc: COpaquePointer?, preserved1: COpaquePointer?, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthlist: COpaquePointer?, dwcapabilities: UInt, preserved3: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coInitializeSecurity((psecdesc?.value ?: 0L).toString(), cauthsvc, (asauthsvc?.value ?: 0L).toString(), (preserved1?.value ?: 0L).toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), (pauthlist?.value ?: 0L).toString(), dwcapabilities.toInt(), (preserved3?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInstall(pbc: COpaquePointer?, dwflags: UInt, pclassspec: COpaquePointer?, pquery: COpaquePointer?, pszcodebase: Pcwstr): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coInstall((pbc?.value ?: 0L).toString(), dwflags.toInt(), (pclassspec?.value ?: 0L).toString(), (pquery?.value ?: 0L).toString(), (pszcodebase?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coInvalidateRemoteMachineBindings(pszmachinename: Pcwstr): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coInvalidateRemoteMachineBindings((pszmachinename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIsHandlerConnected(punk: COpaquePointer?): Bool =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coIsHandlerConnected((punk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coIsOle1Class(rclsid: COpaquePointer?): Bool =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coIsOle1Class((rclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLoadLibrary(lpszlibname: Pcwstr, bautofree: Bool): Hinstance =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coLoadLibrary((lpszlibname?.value ?: 0L).toString(), bautofree).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLockObjectExternal(punk: COpaquePointer?, flock: Bool, flastunlockreleases: Bool): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coLockObjectExternal((punk?.value ?: 0L).toString(), flock, flastunlockreleases) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryAuthenticationServices(pcauthsvc: COpaquePointer?, asauthsvc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coQueryAuthenticationServices((pcauthsvc?.value ?: 0L).toString(), (asauthsvc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryClientBlanket(pauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pprivs: COpaquePointer?, pcapabilities: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coQueryClientBlanket((pauthnsvc?.value ?: 0L).toString(), (pauthzsvc?.value ?: 0L).toString(), (pserverprincname?.value ?: 0L).toString(), (pauthnlevel?.value ?: 0L).toString(), (pimplevel?.value ?: 0L).toString(), (pprivs?.value ?: 0L).toString(), (pcapabilities?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coQueryProxyBlanket(pproxy: COpaquePointer?, pwauthnsvc: COpaquePointer?, pauthzsvc: COpaquePointer?, pserverprincname: COpaquePointer?, pauthnlevel: COpaquePointer?, pimplevel: COpaquePointer?, pauthinfo: COpaquePointer?, pcapabilites: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coQueryProxyBlanket((pproxy?.value ?: 0L).toString(), (pwauthnsvc?.value ?: 0L).toString(), (pauthzsvc?.value ?: 0L).toString(), (pserverprincname?.value ?: 0L).toString(), (pauthnlevel?.value ?: 0L).toString(), (pimplevel?.value ?: 0L).toString(), (pauthinfo?.value ?: 0L).toString(), (pcapabilites?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterActivationFilter(pactivationfilter: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterActivationFilter((pactivationfilter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterChannelHook(extensionuuid: COpaquePointer?, pchannelhook: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterChannelHook((extensionuuid?.value ?: 0L).toString(), (pchannelhook?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterClassObject(rclsid: COpaquePointer?, punk: COpaquePointer?, dwclscontext: Clsctx, flags: UInt, lpdwregister: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterClassObject((rclsid?.value ?: 0L).toString(), (punk?.value ?: 0L).toString(), dwclscontext.toInt(), flags.toInt(), (lpdwregister?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterDeviceCatalog(deviceinstanceid: Pcwstr, cookie: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterDeviceCatalog((deviceinstanceid?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterInitializeSpy(pspy: COpaquePointer?, pulicookie: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterInitializeSpy((pspy?.value ?: 0L).toString(), (pulicookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterMallocSpy(pmallocspy: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterMallocSpy((pmallocspy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterPSClsid(riid: COpaquePointer?, rclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterPSClsid((riid?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRegisterSurrogate(psurrogate: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRegisterSurrogate((psurrogate?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coReleaseServerProcess(): UInt =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coReleaseServerProcess().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coResumeClassObjects(): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coResumeClassObjects() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevertToSelf(): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRevertToSelf() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeClassObject(dwregister: UInt): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRevokeClassObject(dwregister.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeDeviceCatalog(cookie: CoDeviceCatalogCookie): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRevokeDeviceCatalog((cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeInitializeSpy(ulicookie: ULong): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRevokeInitializeSpy(ulicookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coRevokeMallocSpy(): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coRevokeMallocSpy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSetCancelObject(punk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coSetCancelObject((punk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSetProxyBlanket(pproxy: COpaquePointer?, dwauthnsvc: UInt, dwauthzsvc: UInt, pserverprincname: Pcwstr, dwauthnlevel: RpcCAuthnLevel, dwimplevel: RpcCImpLevel, pauthinfo: COpaquePointer?, dwcapabilities: UInt): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coSetProxyBlanket((pproxy?.value ?: 0L).toString(), dwauthnsvc.toInt(), dwauthzsvc.toInt(), (pserverprincname?.value ?: 0L).toString(), dwauthnlevel.toInt(), dwimplevel.toInt(), (pauthinfo?.value ?: 0L).toString(), dwcapabilities.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSuspendClassObjects(): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coSuspendClassObjects() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coSwitchCallContext(pnewobject: COpaquePointer?, ppoldobject: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coSwitchCallContext((pnewobject?.value ?: 0L).toString(), (ppoldobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTaskMemAlloc(cb: ULong): COpaquePointer? =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coTaskMemAlloc(cb.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTaskMemFree(pv: COpaquePointer?) {
    if (_windowsWin32SystemComNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_coTaskMemFree((pv?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coTaskMemRealloc(pv: COpaquePointer?, cb: ULong): COpaquePointer? =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coTaskMemRealloc((pv?.value ?: 0L).toString(), cb.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTestCancel(): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coTestCancel() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coTreatAsClass(clsidold: COpaquePointer?, clsidnew: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coTreatAsClass((clsidold?.value ?: 0L).toString(), (clsidnew?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coUninitialize() {
    if (_windowsWin32SystemComNapiAvailable) {
        _wasm_windowssys_windows_win32_system_com_coUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun coWaitForMultipleHandles(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coWaitForMultipleHandles(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), (phandles?.value ?: 0L).toString(), (lpdwindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coWaitForMultipleObjects(dwflags: UInt, dwtimeout: UInt, chandles: UInt, phandles: COpaquePointer?, lpdwindex: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_coWaitForMultipleObjects(dwflags.toInt(), dwtimeout.toInt(), chandles.toInt(), (phandles?.value ?: 0L).toString(), (lpdwindex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAntiMoniker(ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createAntiMoniker((ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBindCtx(reserved: UInt, ppbc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createBindCtx(reserved.toInt(), (ppbc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createClassMoniker(rclsid: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createClassMoniker((rclsid?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDataAdviseHolder(ppdaholder: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createDataAdviseHolder((ppdaholder?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDataCache(punkouter: COpaquePointer?, rclsid: COpaquePointer?, iid: COpaquePointer?, ppv: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createDataCache((punkouter?.value ?: 0L).toString(), (rclsid?.value ?: 0L).toString(), (iid?.value ?: 0L).toString(), (ppv?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileMoniker(lpszpathname: Pcwstr, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createFileMoniker((lpszpathname?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createGenericComposite(pmkfirst: COpaquePointer?, pmkrest: COpaquePointer?, ppmkcomposite: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createGenericComposite((pmkfirst?.value ?: 0L).toString(), (pmkrest?.value ?: 0L).toString(), (ppmkcomposite?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIUriBuilder(piuri: COpaquePointer?, dwflags: UInt, dwreserved: ULong, ppiuribuilder: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createIUriBuilder((piuri?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toString(), (ppiuribuilder?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createItemMoniker(lpszdelim: Pcwstr, lpszitem: Pcwstr, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createItemMoniker((lpszdelim?.value ?: 0L).toString(), (lpszitem?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createObjrefMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createObjrefMoniker((punk?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPointerMoniker(punk: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createPointerMoniker((punk?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdProgressIndicator(hwndparent: Hwnd, psztitle: Pcwstr, pibsccaller: COpaquePointer?, ppibsc: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createStdProgressIndicator((hwndparent?.value ?: 0L).toString(), (psztitle?.value ?: 0L).toString(), (pibsccaller?.value ?: 0L).toString(), (ppibsc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUri(pwzuri: Pcwstr, dwflags: UriCreateFlags, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createUri((pwzuri?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toString(), (ppuri?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUriFromMultiByteString(pszansiinputuri: Pcstr, dwencodingflags: UInt, dwcodepage: UInt, dwcreateflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createUriFromMultiByteString((pszansiinputuri?.value ?: 0L).toString(), dwencodingflags.toInt(), dwcodepage.toInt(), dwcreateflags.toInt(), dwreserved.toString(), (ppuri?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUriWithFragment(pwzuri: Pcwstr, pwzfragment: Pcwstr, dwflags: UInt, dwreserved: ULong, ppuri: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_createUriWithFragment((pwzuri?.value ?: 0L).toString(), (pwzfragment?.value ?: 0L).toString(), dwflags.toInt(), dwreserved.toString(), (ppuri?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dcomChannelSetHResult(pvreserved: COpaquePointer?, pulreserved: COpaquePointer?, appshr: Hresult): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_dcomChannelSetHResult((pvreserved?.value ?: 0L).toString(), (pulreserved?.value ?: 0L).toString(), appshr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClassFile(szfilename: Pcwstr, pclsid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_getClassFile((szfilename?.value ?: 0L).toString(), (pclsid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getErrorInfo(dwreserved: UInt, pperrinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_getErrorInfo(dwreserved.toInt(), (pperrinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRunningObjectTable(reserved: UInt, pprot: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_getRunningObjectTable(reserved.toInt(), (pprot?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iIDFromString(lpsz: Pcwstr, lpiid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_iIDFromString((lpsz?.value ?: 0L).toString(), (lpiid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mkParseDisplayName(pbc: COpaquePointer?, szusername: Pcwstr, pcheaten: COpaquePointer?, ppmk: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_mkParseDisplayName((pbc?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), (pcheaten?.value ?: 0L).toString(), (ppmk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monikerCommonPrefixWith(pmkthis: COpaquePointer?, pmkother: COpaquePointer?, ppmkcommon: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_monikerCommonPrefixWith((pmkthis?.value ?: 0L).toString(), (pmkother?.value ?: 0L).toString(), (ppmkcommon?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monikerRelativePathTo(pmksrc: COpaquePointer?, pmkdest: COpaquePointer?, ppmkrelpath: COpaquePointer?, dwreserved: Bool): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_monikerRelativePathTo((pmksrc?.value ?: 0L).toString(), (pmkdest?.value ?: 0L).toString(), (ppmkrelpath?.value ?: 0L).toString(), dwreserved) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun progIDFromCLSID(clsid: COpaquePointer?, lplpszprogid: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_progIDFromCLSID((clsid?.value ?: 0L).toString(), (lplpszprogid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setErrorInfo(dwreserved: UInt, perrinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_setErrorInfo(dwreserved.toInt(), (perrinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromCLSID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_stringFromCLSID((rclsid?.value ?: 0L).toString(), (lplpsz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromGUID2(rguid: COpaquePointer?, lpsz: Pwstr, cchmax: Int): Int =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_stringFromGUID2((rguid?.value ?: 0L).toString(), (lpsz?.value ?: 0L).toString(), cchmax) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stringFromIID(rclsid: COpaquePointer?, lplpsz: COpaquePointer?): Hresult =
    if (_windowsWin32SystemComNapiAvailable) _wasm_windowssys_windows_win32_system_com_stringFromIID((rclsid?.value ?: 0L).toString(), (lplpsz?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
